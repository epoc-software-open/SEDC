/*
               File: tbm33_crf_cond_bc
        Description: CRF条件マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:4.19
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm33_crf_cond_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm33_crf_cond_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm33_crf_cond_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm33_crf_cond_bc.class ));
   }

   public tbm33_crf_cond_bc( int remoteHandle ,
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
         /* Execute user event: e120L2 */
         e120L2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z246TBM33_STUDY_ID = A246TBM33_STUDY_ID ;
            Z247TBM33_CRF_ID = A247TBM33_CRF_ID ;
            Z248TBM33_COND_NO = A248TBM33_COND_NO ;
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

   public void confirm_0L0( )
   {
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0L20( ) ;
         }
         else
         {
            checkExtendedTable0L20( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0L20( ) ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120L2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A247TBM33_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A248TBM33_COND_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A379TBM33_COND_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A249TBM33_EXPRESSION + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A380TBM33_COND_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A381TBM33_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A250TBM33_PRIOR_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A382TBM33_ERR_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A383TBM33_ERR_MSG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A554TBM33_ENABLED_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A610TBM33_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A611TBM33_NUMERIC_RANGE_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A251TBM33_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A252TBM33_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A253TBM33_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A254TBM33_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A255TBM33_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A256TBM33_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A257TBM33_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1174( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0L20( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z252TBM33_CRT_DATETIME = A252TBM33_CRT_DATETIME ;
         Z253TBM33_CRT_USER_ID = A253TBM33_CRT_USER_ID ;
         Z255TBM33_UPD_DATETIME = A255TBM33_UPD_DATETIME ;
         Z256TBM33_UPD_USER_ID = A256TBM33_UPD_USER_ID ;
         Z258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
         Z379TBM33_COND_NM = A379TBM33_COND_NM ;
         Z249TBM33_EXPRESSION = A249TBM33_EXPRESSION ;
         Z380TBM33_COND_DIV = A380TBM33_COND_DIV ;
         Z381TBM33_CRF_ITEM_CD = A381TBM33_CRF_ITEM_CD ;
         Z250TBM33_PRIOR_NO = A250TBM33_PRIOR_NO ;
         Z382TBM33_ERR_DIV = A382TBM33_ERR_DIV ;
         Z383TBM33_ERR_MSG = A383TBM33_ERR_MSG ;
         Z554TBM33_ENABLED_FLG = A554TBM33_ENABLED_FLG ;
         Z610TBM33_REQUIRED_INPUT_FLG = A610TBM33_REQUIRED_INPUT_FLG ;
         Z611TBM33_NUMERIC_RANGE_FLG = A611TBM33_NUMERIC_RANGE_FLG ;
         Z251TBM33_DEL_FLG = A251TBM33_DEL_FLG ;
         Z254TBM33_CRT_PROG_NM = A254TBM33_CRT_PROG_NM ;
         Z257TBM33_UPD_PROG_NM = A257TBM33_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z246TBM33_STUDY_ID = A246TBM33_STUDY_ID ;
         Z247TBM33_CRF_ID = A247TBM33_CRF_ID ;
         Z248TBM33_COND_NO = A248TBM33_COND_NO ;
         Z252TBM33_CRT_DATETIME = A252TBM33_CRT_DATETIME ;
         Z253TBM33_CRT_USER_ID = A253TBM33_CRT_USER_ID ;
         Z255TBM33_UPD_DATETIME = A255TBM33_UPD_DATETIME ;
         Z256TBM33_UPD_USER_ID = A256TBM33_UPD_USER_ID ;
         Z258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
         Z379TBM33_COND_NM = A379TBM33_COND_NM ;
         Z249TBM33_EXPRESSION = A249TBM33_EXPRESSION ;
         Z380TBM33_COND_DIV = A380TBM33_COND_DIV ;
         Z381TBM33_CRF_ITEM_CD = A381TBM33_CRF_ITEM_CD ;
         Z250TBM33_PRIOR_NO = A250TBM33_PRIOR_NO ;
         Z382TBM33_ERR_DIV = A382TBM33_ERR_DIV ;
         Z383TBM33_ERR_MSG = A383TBM33_ERR_MSG ;
         Z554TBM33_ENABLED_FLG = A554TBM33_ENABLED_FLG ;
         Z610TBM33_REQUIRED_INPUT_FLG = A610TBM33_REQUIRED_INPUT_FLG ;
         Z611TBM33_NUMERIC_RANGE_FLG = A611TBM33_NUMERIC_RANGE_FLG ;
         Z251TBM33_DEL_FLG = A251TBM33_DEL_FLG ;
         Z254TBM33_CRT_PROG_NM = A254TBM33_CRT_PROG_NM ;
         Z257TBM33_UPD_PROG_NM = A257TBM33_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0L20( )
   {
      /* Using cursor BC000L4 */
      pr_default.execute(2, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A252TBM33_CRT_DATETIME = BC000L4_A252TBM33_CRT_DATETIME[0] ;
         n252TBM33_CRT_DATETIME = BC000L4_n252TBM33_CRT_DATETIME[0] ;
         A253TBM33_CRT_USER_ID = BC000L4_A253TBM33_CRT_USER_ID[0] ;
         n253TBM33_CRT_USER_ID = BC000L4_n253TBM33_CRT_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = BC000L4_A255TBM33_UPD_DATETIME[0] ;
         n255TBM33_UPD_DATETIME = BC000L4_n255TBM33_UPD_DATETIME[0] ;
         A256TBM33_UPD_USER_ID = BC000L4_A256TBM33_UPD_USER_ID[0] ;
         n256TBM33_UPD_USER_ID = BC000L4_n256TBM33_UPD_USER_ID[0] ;
         A258TBM33_UPD_CNT = BC000L4_A258TBM33_UPD_CNT[0] ;
         n258TBM33_UPD_CNT = BC000L4_n258TBM33_UPD_CNT[0] ;
         A379TBM33_COND_NM = BC000L4_A379TBM33_COND_NM[0] ;
         n379TBM33_COND_NM = BC000L4_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = BC000L4_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = BC000L4_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = BC000L4_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = BC000L4_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = BC000L4_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = BC000L4_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = BC000L4_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = BC000L4_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = BC000L4_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = BC000L4_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = BC000L4_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = BC000L4_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = BC000L4_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = BC000L4_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = BC000L4_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = BC000L4_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = BC000L4_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = BC000L4_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A251TBM33_DEL_FLG = BC000L4_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = BC000L4_n251TBM33_DEL_FLG[0] ;
         A254TBM33_CRT_PROG_NM = BC000L4_A254TBM33_CRT_PROG_NM[0] ;
         n254TBM33_CRT_PROG_NM = BC000L4_n254TBM33_CRT_PROG_NM[0] ;
         A257TBM33_UPD_PROG_NM = BC000L4_A257TBM33_UPD_PROG_NM[0] ;
         n257TBM33_UPD_PROG_NM = BC000L4_n257TBM33_UPD_PROG_NM[0] ;
         zm0L20( -8) ;
      }
      pr_default.close(2);
      onLoadActions0L20( ) ;
   }

   public void onLoadActions0L20( )
   {
      AV9Pgmname = "TBM33_CRF_COND_BC" ;
   }

   public void checkExtendedTable0L20( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM33_CRF_COND_BC" ;
      if ( ! ( GXutil.nullDate().equals(A252TBM33_CRT_DATETIME) || (( A252TBM33_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A252TBM33_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A255TBM33_UPD_DATETIME) || (( A255TBM33_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A255TBM33_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0L20( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0L20( )
   {
      /* Using cursor BC000L5 */
      pr_default.execute(3, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound20 = (short)(1) ;
      }
      else
      {
         RcdFound20 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000L3 */
      pr_default.execute(1, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0L20( 8) ;
         RcdFound20 = (short)(1) ;
         A246TBM33_STUDY_ID = BC000L3_A246TBM33_STUDY_ID[0] ;
         A247TBM33_CRF_ID = BC000L3_A247TBM33_CRF_ID[0] ;
         A248TBM33_COND_NO = BC000L3_A248TBM33_COND_NO[0] ;
         A252TBM33_CRT_DATETIME = BC000L3_A252TBM33_CRT_DATETIME[0] ;
         n252TBM33_CRT_DATETIME = BC000L3_n252TBM33_CRT_DATETIME[0] ;
         A253TBM33_CRT_USER_ID = BC000L3_A253TBM33_CRT_USER_ID[0] ;
         n253TBM33_CRT_USER_ID = BC000L3_n253TBM33_CRT_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = BC000L3_A255TBM33_UPD_DATETIME[0] ;
         n255TBM33_UPD_DATETIME = BC000L3_n255TBM33_UPD_DATETIME[0] ;
         A256TBM33_UPD_USER_ID = BC000L3_A256TBM33_UPD_USER_ID[0] ;
         n256TBM33_UPD_USER_ID = BC000L3_n256TBM33_UPD_USER_ID[0] ;
         A258TBM33_UPD_CNT = BC000L3_A258TBM33_UPD_CNT[0] ;
         n258TBM33_UPD_CNT = BC000L3_n258TBM33_UPD_CNT[0] ;
         A379TBM33_COND_NM = BC000L3_A379TBM33_COND_NM[0] ;
         n379TBM33_COND_NM = BC000L3_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = BC000L3_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = BC000L3_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = BC000L3_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = BC000L3_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = BC000L3_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = BC000L3_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = BC000L3_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = BC000L3_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = BC000L3_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = BC000L3_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = BC000L3_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = BC000L3_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = BC000L3_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = BC000L3_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = BC000L3_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = BC000L3_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = BC000L3_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = BC000L3_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A251TBM33_DEL_FLG = BC000L3_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = BC000L3_n251TBM33_DEL_FLG[0] ;
         A254TBM33_CRT_PROG_NM = BC000L3_A254TBM33_CRT_PROG_NM[0] ;
         n254TBM33_CRT_PROG_NM = BC000L3_n254TBM33_CRT_PROG_NM[0] ;
         A257TBM33_UPD_PROG_NM = BC000L3_A257TBM33_UPD_PROG_NM[0] ;
         n257TBM33_UPD_PROG_NM = BC000L3_n257TBM33_UPD_PROG_NM[0] ;
         O258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
         n258TBM33_UPD_CNT = false ;
         Z246TBM33_STUDY_ID = A246TBM33_STUDY_ID ;
         Z247TBM33_CRF_ID = A247TBM33_CRF_ID ;
         Z248TBM33_COND_NO = A248TBM33_COND_NO ;
         sMode20 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0L20( ) ;
         Gx_mode = sMode20 ;
      }
      else
      {
         RcdFound20 = (short)(0) ;
         initializeNonKey0L20( ) ;
         sMode20 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode20 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0L20( ) ;
      if ( RcdFound20 == 0 )
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
      confirm_0L0( ) ;
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

   public void checkOptimisticConcurrency0L20( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000L2 */
         pr_default.execute(0, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM33_CRF_COND"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z252TBM33_CRT_DATETIME.equals( BC000L2_A252TBM33_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z253TBM33_CRT_USER_ID, BC000L2_A253TBM33_CRT_USER_ID[0]) != 0 ) || !( Z255TBM33_UPD_DATETIME.equals( BC000L2_A255TBM33_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z256TBM33_UPD_USER_ID, BC000L2_A256TBM33_UPD_USER_ID[0]) != 0 ) || ( Z258TBM33_UPD_CNT != BC000L2_A258TBM33_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z379TBM33_COND_NM, BC000L2_A379TBM33_COND_NM[0]) != 0 ) || ( GXutil.strcmp(Z249TBM33_EXPRESSION, BC000L2_A249TBM33_EXPRESSION[0]) != 0 ) || ( GXutil.strcmp(Z380TBM33_COND_DIV, BC000L2_A380TBM33_COND_DIV[0]) != 0 ) || ( GXutil.strcmp(Z381TBM33_CRF_ITEM_CD, BC000L2_A381TBM33_CRF_ITEM_CD[0]) != 0 ) || ( Z250TBM33_PRIOR_NO != BC000L2_A250TBM33_PRIOR_NO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z382TBM33_ERR_DIV, BC000L2_A382TBM33_ERR_DIV[0]) != 0 ) || ( GXutil.strcmp(Z383TBM33_ERR_MSG, BC000L2_A383TBM33_ERR_MSG[0]) != 0 ) || ( GXutil.strcmp(Z554TBM33_ENABLED_FLG, BC000L2_A554TBM33_ENABLED_FLG[0]) != 0 ) || ( GXutil.strcmp(Z610TBM33_REQUIRED_INPUT_FLG, BC000L2_A610TBM33_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z611TBM33_NUMERIC_RANGE_FLG, BC000L2_A611TBM33_NUMERIC_RANGE_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z251TBM33_DEL_FLG, BC000L2_A251TBM33_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z254TBM33_CRT_PROG_NM, BC000L2_A254TBM33_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z257TBM33_UPD_PROG_NM, BC000L2_A257TBM33_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM33_CRF_COND"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0L20( )
   {
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0L20( 0) ;
         checkOptimisticConcurrency0L20( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L20( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0L20( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000L6 */
                  pr_default.execute(4, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO), new Boolean(n252TBM33_CRT_DATETIME), A252TBM33_CRT_DATETIME, new Boolean(n253TBM33_CRT_USER_ID), A253TBM33_CRT_USER_ID, new Boolean(n255TBM33_UPD_DATETIME), A255TBM33_UPD_DATETIME, new Boolean(n256TBM33_UPD_USER_ID), A256TBM33_UPD_USER_ID, new Boolean(n258TBM33_UPD_CNT), new Long(A258TBM33_UPD_CNT), new Boolean(n379TBM33_COND_NM), A379TBM33_COND_NM, new Boolean(n249TBM33_EXPRESSION), A249TBM33_EXPRESSION, new Boolean(n380TBM33_COND_DIV), A380TBM33_COND_DIV, new Boolean(n381TBM33_CRF_ITEM_CD), A381TBM33_CRF_ITEM_CD, new Boolean(n250TBM33_PRIOR_NO), new Byte(A250TBM33_PRIOR_NO), new Boolean(n382TBM33_ERR_DIV), A382TBM33_ERR_DIV, new Boolean(n383TBM33_ERR_MSG), A383TBM33_ERR_MSG, new Boolean(n554TBM33_ENABLED_FLG), A554TBM33_ENABLED_FLG, new Boolean(n610TBM33_REQUIRED_INPUT_FLG), A610TBM33_REQUIRED_INPUT_FLG, new Boolean(n611TBM33_NUMERIC_RANGE_FLG), A611TBM33_NUMERIC_RANGE_FLG, new Boolean(n251TBM33_DEL_FLG), A251TBM33_DEL_FLG, new Boolean(n254TBM33_CRT_PROG_NM), A254TBM33_CRT_PROG_NM, new Boolean(n257TBM33_UPD_PROG_NM), A257TBM33_UPD_PROG_NM});
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
            load0L20( ) ;
         }
         endLevel0L20( ) ;
      }
      closeExtendedTableCursors0L20( ) ;
   }

   public void update0L20( )
   {
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L20( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L20( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0L20( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000L7 */
                  pr_default.execute(5, new Object[] {new Boolean(n252TBM33_CRT_DATETIME), A252TBM33_CRT_DATETIME, new Boolean(n253TBM33_CRT_USER_ID), A253TBM33_CRT_USER_ID, new Boolean(n255TBM33_UPD_DATETIME), A255TBM33_UPD_DATETIME, new Boolean(n256TBM33_UPD_USER_ID), A256TBM33_UPD_USER_ID, new Boolean(n258TBM33_UPD_CNT), new Long(A258TBM33_UPD_CNT), new Boolean(n379TBM33_COND_NM), A379TBM33_COND_NM, new Boolean(n249TBM33_EXPRESSION), A249TBM33_EXPRESSION, new Boolean(n380TBM33_COND_DIV), A380TBM33_COND_DIV, new Boolean(n381TBM33_CRF_ITEM_CD), A381TBM33_CRF_ITEM_CD, new Boolean(n250TBM33_PRIOR_NO), new Byte(A250TBM33_PRIOR_NO), new Boolean(n382TBM33_ERR_DIV), A382TBM33_ERR_DIV, new Boolean(n383TBM33_ERR_MSG), A383TBM33_ERR_MSG, new Boolean(n554TBM33_ENABLED_FLG), A554TBM33_ENABLED_FLG, new Boolean(n610TBM33_REQUIRED_INPUT_FLG), A610TBM33_REQUIRED_INPUT_FLG, new Boolean(n611TBM33_NUMERIC_RANGE_FLG), A611TBM33_NUMERIC_RANGE_FLG, new Boolean(n251TBM33_DEL_FLG), A251TBM33_DEL_FLG, new Boolean(n254TBM33_CRT_PROG_NM), A254TBM33_CRT_PROG_NM, new Boolean(n257TBM33_UPD_PROG_NM), A257TBM33_UPD_PROG_NM, new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM33_CRF_COND"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0L20( ) ;
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
         endLevel0L20( ) ;
      }
      closeExtendedTableCursors0L20( ) ;
   }

   public void deferredUpdate0L20( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0L20( ) ;
         afterConfirm0L20( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0L20( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000L8 */
               pr_default.execute(6, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
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
      sMode20 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0L20( ) ;
      Gx_mode = sMode20 ;
   }

   public void onDeleteControls0L20( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM33_CRF_COND_BC" ;
      }
   }

   public void endLevel0L20( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0L20( ) ;
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

   public void scanKeyStart0L20( )
   {
      /* Using cursor BC000L9 */
      pr_default.execute(7, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
      RcdFound20 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A246TBM33_STUDY_ID = BC000L9_A246TBM33_STUDY_ID[0] ;
         A247TBM33_CRF_ID = BC000L9_A247TBM33_CRF_ID[0] ;
         A248TBM33_COND_NO = BC000L9_A248TBM33_COND_NO[0] ;
         A252TBM33_CRT_DATETIME = BC000L9_A252TBM33_CRT_DATETIME[0] ;
         n252TBM33_CRT_DATETIME = BC000L9_n252TBM33_CRT_DATETIME[0] ;
         A253TBM33_CRT_USER_ID = BC000L9_A253TBM33_CRT_USER_ID[0] ;
         n253TBM33_CRT_USER_ID = BC000L9_n253TBM33_CRT_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = BC000L9_A255TBM33_UPD_DATETIME[0] ;
         n255TBM33_UPD_DATETIME = BC000L9_n255TBM33_UPD_DATETIME[0] ;
         A256TBM33_UPD_USER_ID = BC000L9_A256TBM33_UPD_USER_ID[0] ;
         n256TBM33_UPD_USER_ID = BC000L9_n256TBM33_UPD_USER_ID[0] ;
         A258TBM33_UPD_CNT = BC000L9_A258TBM33_UPD_CNT[0] ;
         n258TBM33_UPD_CNT = BC000L9_n258TBM33_UPD_CNT[0] ;
         A379TBM33_COND_NM = BC000L9_A379TBM33_COND_NM[0] ;
         n379TBM33_COND_NM = BC000L9_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = BC000L9_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = BC000L9_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = BC000L9_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = BC000L9_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = BC000L9_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = BC000L9_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = BC000L9_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = BC000L9_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = BC000L9_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = BC000L9_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = BC000L9_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = BC000L9_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = BC000L9_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = BC000L9_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = BC000L9_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = BC000L9_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = BC000L9_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = BC000L9_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A251TBM33_DEL_FLG = BC000L9_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = BC000L9_n251TBM33_DEL_FLG[0] ;
         A254TBM33_CRT_PROG_NM = BC000L9_A254TBM33_CRT_PROG_NM[0] ;
         n254TBM33_CRT_PROG_NM = BC000L9_n254TBM33_CRT_PROG_NM[0] ;
         A257TBM33_UPD_PROG_NM = BC000L9_A257TBM33_UPD_PROG_NM[0] ;
         n257TBM33_UPD_PROG_NM = BC000L9_n257TBM33_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0L20( )
   {
      pr_default.readNext(7);
      RcdFound20 = (short)(0) ;
      scanKeyLoad0L20( ) ;
   }

   public void scanKeyLoad0L20( )
   {
      sMode20 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A246TBM33_STUDY_ID = BC000L9_A246TBM33_STUDY_ID[0] ;
         A247TBM33_CRF_ID = BC000L9_A247TBM33_CRF_ID[0] ;
         A248TBM33_COND_NO = BC000L9_A248TBM33_COND_NO[0] ;
         A252TBM33_CRT_DATETIME = BC000L9_A252TBM33_CRT_DATETIME[0] ;
         n252TBM33_CRT_DATETIME = BC000L9_n252TBM33_CRT_DATETIME[0] ;
         A253TBM33_CRT_USER_ID = BC000L9_A253TBM33_CRT_USER_ID[0] ;
         n253TBM33_CRT_USER_ID = BC000L9_n253TBM33_CRT_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = BC000L9_A255TBM33_UPD_DATETIME[0] ;
         n255TBM33_UPD_DATETIME = BC000L9_n255TBM33_UPD_DATETIME[0] ;
         A256TBM33_UPD_USER_ID = BC000L9_A256TBM33_UPD_USER_ID[0] ;
         n256TBM33_UPD_USER_ID = BC000L9_n256TBM33_UPD_USER_ID[0] ;
         A258TBM33_UPD_CNT = BC000L9_A258TBM33_UPD_CNT[0] ;
         n258TBM33_UPD_CNT = BC000L9_n258TBM33_UPD_CNT[0] ;
         A379TBM33_COND_NM = BC000L9_A379TBM33_COND_NM[0] ;
         n379TBM33_COND_NM = BC000L9_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = BC000L9_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = BC000L9_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = BC000L9_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = BC000L9_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = BC000L9_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = BC000L9_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = BC000L9_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = BC000L9_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = BC000L9_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = BC000L9_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = BC000L9_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = BC000L9_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = BC000L9_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = BC000L9_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = BC000L9_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = BC000L9_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = BC000L9_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = BC000L9_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A251TBM33_DEL_FLG = BC000L9_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = BC000L9_n251TBM33_DEL_FLG[0] ;
         A254TBM33_CRT_PROG_NM = BC000L9_A254TBM33_CRT_PROG_NM[0] ;
         n254TBM33_CRT_PROG_NM = BC000L9_n254TBM33_CRT_PROG_NM[0] ;
         A257TBM33_UPD_PROG_NM = BC000L9_A257TBM33_UPD_PROG_NM[0] ;
         n257TBM33_UPD_PROG_NM = BC000L9_n257TBM33_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode20 ;
   }

   public void scanKeyEnd0L20( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0L20( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0L20( )
   {
      /* Before Insert Rules */
      A252TBM33_CRT_DATETIME = GXutil.now( ) ;
      n252TBM33_CRT_DATETIME = false ;
      GXt_char1 = A253TBM33_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      A253TBM33_CRT_USER_ID = GXt_char1 ;
      n253TBM33_CRT_USER_ID = false ;
      A255TBM33_UPD_DATETIME = GXutil.now( ) ;
      n255TBM33_UPD_DATETIME = false ;
      GXt_char1 = A256TBM33_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      A256TBM33_UPD_USER_ID = GXt_char1 ;
      n256TBM33_UPD_USER_ID = false ;
      A258TBM33_UPD_CNT = (long)(O258TBM33_UPD_CNT+1) ;
      n258TBM33_UPD_CNT = false ;
   }

   public void beforeUpdate0L20( )
   {
      /* Before Update Rules */
      A255TBM33_UPD_DATETIME = GXutil.now( ) ;
      n255TBM33_UPD_DATETIME = false ;
      GXt_char1 = A256TBM33_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm33_crf_cond_bc.this.GXt_char1 = GXv_char2[0] ;
      A256TBM33_UPD_USER_ID = GXt_char1 ;
      n256TBM33_UPD_USER_ID = false ;
      A258TBM33_UPD_CNT = (long)(O258TBM33_UPD_CNT+1) ;
      n258TBM33_UPD_CNT = false ;
   }

   public void beforeDelete0L20( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0L20( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0L20( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0L20( )
   {
   }

   public void addRow0L20( )
   {
      VarsToRow20( bcTBM33_CRF_COND) ;
   }

   public void readRow0L20( )
   {
      RowToVars20( bcTBM33_CRF_COND, 1) ;
   }

   public void initializeNonKey0L20( )
   {
      A252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n252TBM33_CRT_DATETIME = false ;
      A253TBM33_CRT_USER_ID = "" ;
      n253TBM33_CRT_USER_ID = false ;
      A255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n255TBM33_UPD_DATETIME = false ;
      A256TBM33_UPD_USER_ID = "" ;
      n256TBM33_UPD_USER_ID = false ;
      A258TBM33_UPD_CNT = 0 ;
      n258TBM33_UPD_CNT = false ;
      A379TBM33_COND_NM = "" ;
      n379TBM33_COND_NM = false ;
      A249TBM33_EXPRESSION = "" ;
      n249TBM33_EXPRESSION = false ;
      A380TBM33_COND_DIV = "" ;
      n380TBM33_COND_DIV = false ;
      A381TBM33_CRF_ITEM_CD = "" ;
      n381TBM33_CRF_ITEM_CD = false ;
      A250TBM33_PRIOR_NO = (byte)(0) ;
      n250TBM33_PRIOR_NO = false ;
      A382TBM33_ERR_DIV = "" ;
      n382TBM33_ERR_DIV = false ;
      A383TBM33_ERR_MSG = "" ;
      n383TBM33_ERR_MSG = false ;
      A554TBM33_ENABLED_FLG = "" ;
      n554TBM33_ENABLED_FLG = false ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      n610TBM33_REQUIRED_INPUT_FLG = false ;
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      n611TBM33_NUMERIC_RANGE_FLG = false ;
      A251TBM33_DEL_FLG = "" ;
      n251TBM33_DEL_FLG = false ;
      A254TBM33_CRT_PROG_NM = "" ;
      n254TBM33_CRT_PROG_NM = false ;
      A257TBM33_UPD_PROG_NM = "" ;
      n257TBM33_UPD_PROG_NM = false ;
      O258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
      n258TBM33_UPD_CNT = false ;
   }

   public void initAll0L20( )
   {
      A246TBM33_STUDY_ID = 0 ;
      A247TBM33_CRF_ID = (short)(0) ;
      A248TBM33_COND_NO = (short)(0) ;
      initializeNonKey0L20( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow20( SdtTBM33_CRF_COND obj20 )
   {
      obj20.setgxTv_SdtTBM33_CRF_COND_Mode( Gx_mode );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( A252TBM33_CRT_DATETIME );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id( A253TBM33_CRT_USER_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime( A255TBM33_UPD_DATETIME );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id( A256TBM33_UPD_USER_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt( A258TBM33_UPD_CNT );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm( A379TBM33_COND_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression( A249TBM33_EXPRESSION );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div( A380TBM33_COND_DIV );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd( A381TBM33_CRF_ITEM_CD );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( A250TBM33_PRIOR_NO );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div( A382TBM33_ERR_DIV );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg( A383TBM33_ERR_MSG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg( A554TBM33_ENABLED_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg( A610TBM33_REQUIRED_INPUT_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg( A611TBM33_NUMERIC_RANGE_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg( A251TBM33_DEL_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( A254TBM33_CRT_PROG_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( A257TBM33_UPD_PROG_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( A246TBM33_STUDY_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( A247TBM33_CRF_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( A248TBM33_COND_NO );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z( Z246TBM33_STUDY_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z( Z247TBM33_CRF_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z( Z248TBM33_COND_NO );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z( Z379TBM33_COND_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z( Z249TBM33_EXPRESSION );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z( Z380TBM33_COND_DIV );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z( Z381TBM33_CRF_ITEM_CD );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z( Z250TBM33_PRIOR_NO );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z( Z382TBM33_ERR_DIV );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z( Z383TBM33_ERR_MSG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z( Z554TBM33_ENABLED_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z( Z610TBM33_REQUIRED_INPUT_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z( Z611TBM33_NUMERIC_RANGE_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z( Z251TBM33_DEL_FLG );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z( Z252TBM33_CRT_DATETIME );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z( Z253TBM33_CRT_USER_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z( Z254TBM33_CRT_PROG_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z( Z255TBM33_UPD_DATETIME );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z( Z256TBM33_UPD_USER_ID );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z( Z257TBM33_UPD_PROG_NM );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z( Z258TBM33_UPD_CNT );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N( (byte)((byte)((n379TBM33_COND_NM)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N( (byte)((byte)((n249TBM33_EXPRESSION)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N( (byte)((byte)((n380TBM33_COND_DIV)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N( (byte)((byte)((n381TBM33_CRF_ITEM_CD)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N( (byte)((byte)((n250TBM33_PRIOR_NO)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N( (byte)((byte)((n382TBM33_ERR_DIV)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N( (byte)((byte)((n383TBM33_ERR_MSG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N( (byte)((byte)((n554TBM33_ENABLED_FLG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N( (byte)((byte)((n610TBM33_REQUIRED_INPUT_FLG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N( (byte)((byte)((n611TBM33_NUMERIC_RANGE_FLG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N( (byte)((byte)((n251TBM33_DEL_FLG)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N( (byte)((byte)((n252TBM33_CRT_DATETIME)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N( (byte)((byte)((n253TBM33_CRT_USER_ID)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N( (byte)((byte)((n254TBM33_CRT_PROG_NM)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N( (byte)((byte)((n255TBM33_UPD_DATETIME)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N( (byte)((byte)((n256TBM33_UPD_USER_ID)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N( (byte)((byte)((n257TBM33_UPD_PROG_NM)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N( (byte)((byte)((n258TBM33_UPD_CNT)?1:0)) );
      obj20.setgxTv_SdtTBM33_CRF_COND_Mode( Gx_mode );
   }

   public void RowToVars20( SdtTBM33_CRF_COND obj20 ,
                            int forceLoad )
   {
      Gx_mode = obj20.getgxTv_SdtTBM33_CRF_COND_Mode() ;
      A252TBM33_CRT_DATETIME = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime() ;
      n252TBM33_CRT_DATETIME = false ;
      A253TBM33_CRT_USER_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id() ;
      n253TBM33_CRT_USER_ID = false ;
      A255TBM33_UPD_DATETIME = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime() ;
      n255TBM33_UPD_DATETIME = false ;
      A256TBM33_UPD_USER_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id() ;
      n256TBM33_UPD_USER_ID = false ;
      A258TBM33_UPD_CNT = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt() ;
      n258TBM33_UPD_CNT = false ;
      A379TBM33_COND_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm() ;
      n379TBM33_COND_NM = false ;
      A249TBM33_EXPRESSION = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression() ;
      n249TBM33_EXPRESSION = false ;
      A380TBM33_COND_DIV = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div() ;
      n380TBM33_COND_DIV = false ;
      A381TBM33_CRF_ITEM_CD = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd() ;
      n381TBM33_CRF_ITEM_CD = false ;
      A250TBM33_PRIOR_NO = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no() ;
      n250TBM33_PRIOR_NO = false ;
      A382TBM33_ERR_DIV = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div() ;
      n382TBM33_ERR_DIV = false ;
      A383TBM33_ERR_MSG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg() ;
      n383TBM33_ERR_MSG = false ;
      A554TBM33_ENABLED_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg() ;
      n554TBM33_ENABLED_FLG = false ;
      A610TBM33_REQUIRED_INPUT_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg() ;
      n610TBM33_REQUIRED_INPUT_FLG = false ;
      A611TBM33_NUMERIC_RANGE_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg() ;
      n611TBM33_NUMERIC_RANGE_FLG = false ;
      A251TBM33_DEL_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg() ;
      n251TBM33_DEL_FLG = false ;
      A254TBM33_CRT_PROG_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm() ;
      n254TBM33_CRT_PROG_NM = false ;
      A257TBM33_UPD_PROG_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm() ;
      n257TBM33_UPD_PROG_NM = false ;
      A246TBM33_STUDY_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id() ;
      A247TBM33_CRF_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id() ;
      A248TBM33_COND_NO = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no() ;
      Z246TBM33_STUDY_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z() ;
      Z247TBM33_CRF_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z() ;
      Z248TBM33_COND_NO = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z() ;
      Z379TBM33_COND_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z() ;
      Z249TBM33_EXPRESSION = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z() ;
      Z380TBM33_COND_DIV = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z() ;
      Z381TBM33_CRF_ITEM_CD = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z() ;
      Z250TBM33_PRIOR_NO = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z() ;
      Z382TBM33_ERR_DIV = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z() ;
      Z383TBM33_ERR_MSG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z() ;
      Z554TBM33_ENABLED_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z() ;
      Z610TBM33_REQUIRED_INPUT_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z() ;
      Z611TBM33_NUMERIC_RANGE_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z() ;
      Z251TBM33_DEL_FLG = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z() ;
      Z252TBM33_CRT_DATETIME = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z() ;
      Z253TBM33_CRT_USER_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z() ;
      Z254TBM33_CRT_PROG_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z() ;
      Z255TBM33_UPD_DATETIME = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z() ;
      Z256TBM33_UPD_USER_ID = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z() ;
      Z257TBM33_UPD_PROG_NM = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z() ;
      Z258TBM33_UPD_CNT = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z() ;
      O258TBM33_UPD_CNT = obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z() ;
      n379TBM33_COND_NM = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N()==0)?false:true) ;
      n249TBM33_EXPRESSION = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N()==0)?false:true) ;
      n380TBM33_COND_DIV = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N()==0)?false:true) ;
      n381TBM33_CRF_ITEM_CD = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N()==0)?false:true) ;
      n250TBM33_PRIOR_NO = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N()==0)?false:true) ;
      n382TBM33_ERR_DIV = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N()==0)?false:true) ;
      n383TBM33_ERR_MSG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N()==0)?false:true) ;
      n554TBM33_ENABLED_FLG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N()==0)?false:true) ;
      n610TBM33_REQUIRED_INPUT_FLG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N()==0)?false:true) ;
      n611TBM33_NUMERIC_RANGE_FLG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N()==0)?false:true) ;
      n251TBM33_DEL_FLG = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N()==0)?false:true) ;
      n252TBM33_CRT_DATETIME = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N()==0)?false:true) ;
      n253TBM33_CRT_USER_ID = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N()==0)?false:true) ;
      n254TBM33_CRT_PROG_NM = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N()==0)?false:true) ;
      n255TBM33_UPD_DATETIME = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N()==0)?false:true) ;
      n256TBM33_UPD_USER_ID = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N()==0)?false:true) ;
      n257TBM33_UPD_PROG_NM = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N()==0)?false:true) ;
      n258TBM33_UPD_CNT = (boolean)((obj20.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj20.getgxTv_SdtTBM33_CRF_COND_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A246TBM33_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A247TBM33_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A248TBM33_COND_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0L20( ) ;
      scanKeyStart0L20( ) ;
      if ( RcdFound20 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z246TBM33_STUDY_ID = A246TBM33_STUDY_ID ;
         Z247TBM33_CRF_ID = A247TBM33_CRF_ID ;
         Z248TBM33_COND_NO = A248TBM33_COND_NO ;
         O258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
         n258TBM33_UPD_CNT = false ;
      }
      zm0L20( -8) ;
      sMode20 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0L20( ) ;
      Gx_mode = sMode20 ;
      addRow0L20( ) ;
      scanKeyEnd0L20( ) ;
      if ( RcdFound20 == 0 )
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
      RowToVars20( bcTBM33_CRF_COND, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0L20( ) ;
      if ( RcdFound20 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A246TBM33_STUDY_ID != Z246TBM33_STUDY_ID ) || ( A247TBM33_CRF_ID != Z247TBM33_CRF_ID ) || ( A248TBM33_COND_NO != Z248TBM33_COND_NO ) )
         {
            A246TBM33_STUDY_ID = Z246TBM33_STUDY_ID ;
            A247TBM33_CRF_ID = Z247TBM33_CRF_ID ;
            A248TBM33_COND_NO = Z248TBM33_COND_NO ;
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
            update0L20( ) ;
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
            if ( ( A246TBM33_STUDY_ID != Z246TBM33_STUDY_ID ) || ( A247TBM33_CRF_ID != Z247TBM33_CRF_ID ) || ( A248TBM33_COND_NO != Z248TBM33_COND_NO ) )
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
                  insert0L20( ) ;
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
                  insert0L20( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow20( bcTBM33_CRF_COND) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars20( bcTBM33_CRF_COND, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0L20( ) ;
      if ( RcdFound20 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A246TBM33_STUDY_ID != Z246TBM33_STUDY_ID ) || ( A247TBM33_CRF_ID != Z247TBM33_CRF_ID ) || ( A248TBM33_COND_NO != Z248TBM33_COND_NO ) )
         {
            A246TBM33_STUDY_ID = Z246TBM33_STUDY_ID ;
            A247TBM33_CRF_ID = Z247TBM33_CRF_ID ;
            A248TBM33_COND_NO = Z248TBM33_COND_NO ;
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
         if ( ( A246TBM33_STUDY_ID != Z246TBM33_STUDY_ID ) || ( A247TBM33_CRF_ID != Z247TBM33_CRF_ID ) || ( A248TBM33_COND_NO != Z248TBM33_COND_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm33_crf_cond_bc");
      VarsToRow20( bcTBM33_CRF_COND) ;
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
      Gx_mode = bcTBM33_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM33_CRF_COND sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM33_CRF_COND )
      {
         bcTBM33_CRF_COND = sdt ;
         if ( GXutil.strcmp(bcTBM33_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Mode(), "") == 0 )
         {
            bcTBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow20( bcTBM33_CRF_COND) ;
         }
         else
         {
            RowToVars20( bcTBM33_CRF_COND, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM33_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Mode(), "") == 0 )
         {
            bcTBM33_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars20( bcTBM33_CRF_COND, 1) ;
   }

   public SdtTBM33_CRF_COND getTBM33_CRF_COND_BC( )
   {
      return bcTBM33_CRF_COND ;
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
                  /* Execute user subroutine: S1174 */
                  S1174 ();
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
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A379TBM33_COND_NM = "" ;
      A249TBM33_EXPRESSION = "" ;
      A380TBM33_COND_DIV = "" ;
      A381TBM33_CRF_ITEM_CD = "" ;
      A382TBM33_ERR_DIV = "" ;
      A383TBM33_ERR_MSG = "" ;
      A554TBM33_ENABLED_FLG = "" ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      A251TBM33_DEL_FLG = "" ;
      A252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A253TBM33_CRT_USER_ID = "" ;
      A254TBM33_CRT_PROG_NM = "" ;
      A255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A256TBM33_UPD_USER_ID = "" ;
      A257TBM33_UPD_PROG_NM = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z = "" ;
      Z252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z253TBM33_CRT_USER_ID = "" ;
      Z255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z256TBM33_UPD_USER_ID = "" ;
      Z379TBM33_COND_NM = "" ;
      Z249TBM33_EXPRESSION = "" ;
      Z380TBM33_COND_DIV = "" ;
      Z381TBM33_CRF_ITEM_CD = "" ;
      Z382TBM33_ERR_DIV = "" ;
      Z383TBM33_ERR_MSG = "" ;
      Z554TBM33_ENABLED_FLG = "" ;
      Z610TBM33_REQUIRED_INPUT_FLG = "" ;
      Z611TBM33_NUMERIC_RANGE_FLG = "" ;
      Z251TBM33_DEL_FLG = "" ;
      Z254TBM33_CRT_PROG_NM = "" ;
      Z257TBM33_UPD_PROG_NM = "" ;
      BC000L4_A246TBM33_STUDY_ID = new long[1] ;
      BC000L4_A247TBM33_CRF_ID = new short[1] ;
      BC000L4_A248TBM33_COND_NO = new short[1] ;
      BC000L4_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L4_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      BC000L4_A253TBM33_CRT_USER_ID = new String[] {""} ;
      BC000L4_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      BC000L4_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L4_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      BC000L4_A256TBM33_UPD_USER_ID = new String[] {""} ;
      BC000L4_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      BC000L4_A258TBM33_UPD_CNT = new long[1] ;
      BC000L4_n258TBM33_UPD_CNT = new boolean[] {false} ;
      BC000L4_A379TBM33_COND_NM = new String[] {""} ;
      BC000L4_n379TBM33_COND_NM = new boolean[] {false} ;
      BC000L4_A249TBM33_EXPRESSION = new String[] {""} ;
      BC000L4_n249TBM33_EXPRESSION = new boolean[] {false} ;
      BC000L4_A380TBM33_COND_DIV = new String[] {""} ;
      BC000L4_n380TBM33_COND_DIV = new boolean[] {false} ;
      BC000L4_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      BC000L4_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      BC000L4_A250TBM33_PRIOR_NO = new byte[1] ;
      BC000L4_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      BC000L4_A382TBM33_ERR_DIV = new String[] {""} ;
      BC000L4_n382TBM33_ERR_DIV = new boolean[] {false} ;
      BC000L4_A383TBM33_ERR_MSG = new String[] {""} ;
      BC000L4_n383TBM33_ERR_MSG = new boolean[] {false} ;
      BC000L4_A554TBM33_ENABLED_FLG = new String[] {""} ;
      BC000L4_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      BC000L4_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000L4_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000L4_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      BC000L4_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      BC000L4_A251TBM33_DEL_FLG = new String[] {""} ;
      BC000L4_n251TBM33_DEL_FLG = new boolean[] {false} ;
      BC000L4_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      BC000L4_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      BC000L4_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      BC000L4_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      BC000L5_A246TBM33_STUDY_ID = new long[1] ;
      BC000L5_A247TBM33_CRF_ID = new short[1] ;
      BC000L5_A248TBM33_COND_NO = new short[1] ;
      BC000L3_A246TBM33_STUDY_ID = new long[1] ;
      BC000L3_A247TBM33_CRF_ID = new short[1] ;
      BC000L3_A248TBM33_COND_NO = new short[1] ;
      BC000L3_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L3_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      BC000L3_A253TBM33_CRT_USER_ID = new String[] {""} ;
      BC000L3_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      BC000L3_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L3_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      BC000L3_A256TBM33_UPD_USER_ID = new String[] {""} ;
      BC000L3_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      BC000L3_A258TBM33_UPD_CNT = new long[1] ;
      BC000L3_n258TBM33_UPD_CNT = new boolean[] {false} ;
      BC000L3_A379TBM33_COND_NM = new String[] {""} ;
      BC000L3_n379TBM33_COND_NM = new boolean[] {false} ;
      BC000L3_A249TBM33_EXPRESSION = new String[] {""} ;
      BC000L3_n249TBM33_EXPRESSION = new boolean[] {false} ;
      BC000L3_A380TBM33_COND_DIV = new String[] {""} ;
      BC000L3_n380TBM33_COND_DIV = new boolean[] {false} ;
      BC000L3_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      BC000L3_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      BC000L3_A250TBM33_PRIOR_NO = new byte[1] ;
      BC000L3_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      BC000L3_A382TBM33_ERR_DIV = new String[] {""} ;
      BC000L3_n382TBM33_ERR_DIV = new boolean[] {false} ;
      BC000L3_A383TBM33_ERR_MSG = new String[] {""} ;
      BC000L3_n383TBM33_ERR_MSG = new boolean[] {false} ;
      BC000L3_A554TBM33_ENABLED_FLG = new String[] {""} ;
      BC000L3_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      BC000L3_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000L3_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000L3_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      BC000L3_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      BC000L3_A251TBM33_DEL_FLG = new String[] {""} ;
      BC000L3_n251TBM33_DEL_FLG = new boolean[] {false} ;
      BC000L3_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      BC000L3_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      BC000L3_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      BC000L3_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      sMode20 = "" ;
      BC000L2_A246TBM33_STUDY_ID = new long[1] ;
      BC000L2_A247TBM33_CRF_ID = new short[1] ;
      BC000L2_A248TBM33_COND_NO = new short[1] ;
      BC000L2_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L2_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      BC000L2_A253TBM33_CRT_USER_ID = new String[] {""} ;
      BC000L2_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      BC000L2_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L2_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      BC000L2_A256TBM33_UPD_USER_ID = new String[] {""} ;
      BC000L2_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      BC000L2_A258TBM33_UPD_CNT = new long[1] ;
      BC000L2_n258TBM33_UPD_CNT = new boolean[] {false} ;
      BC000L2_A379TBM33_COND_NM = new String[] {""} ;
      BC000L2_n379TBM33_COND_NM = new boolean[] {false} ;
      BC000L2_A249TBM33_EXPRESSION = new String[] {""} ;
      BC000L2_n249TBM33_EXPRESSION = new boolean[] {false} ;
      BC000L2_A380TBM33_COND_DIV = new String[] {""} ;
      BC000L2_n380TBM33_COND_DIV = new boolean[] {false} ;
      BC000L2_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      BC000L2_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      BC000L2_A250TBM33_PRIOR_NO = new byte[1] ;
      BC000L2_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      BC000L2_A382TBM33_ERR_DIV = new String[] {""} ;
      BC000L2_n382TBM33_ERR_DIV = new boolean[] {false} ;
      BC000L2_A383TBM33_ERR_MSG = new String[] {""} ;
      BC000L2_n383TBM33_ERR_MSG = new boolean[] {false} ;
      BC000L2_A554TBM33_ENABLED_FLG = new String[] {""} ;
      BC000L2_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      BC000L2_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000L2_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000L2_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      BC000L2_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      BC000L2_A251TBM33_DEL_FLG = new String[] {""} ;
      BC000L2_n251TBM33_DEL_FLG = new boolean[] {false} ;
      BC000L2_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      BC000L2_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      BC000L2_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      BC000L2_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      BC000L9_A246TBM33_STUDY_ID = new long[1] ;
      BC000L9_A247TBM33_CRF_ID = new short[1] ;
      BC000L9_A248TBM33_COND_NO = new short[1] ;
      BC000L9_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L9_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      BC000L9_A253TBM33_CRT_USER_ID = new String[] {""} ;
      BC000L9_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      BC000L9_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000L9_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      BC000L9_A256TBM33_UPD_USER_ID = new String[] {""} ;
      BC000L9_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      BC000L9_A258TBM33_UPD_CNT = new long[1] ;
      BC000L9_n258TBM33_UPD_CNT = new boolean[] {false} ;
      BC000L9_A379TBM33_COND_NM = new String[] {""} ;
      BC000L9_n379TBM33_COND_NM = new boolean[] {false} ;
      BC000L9_A249TBM33_EXPRESSION = new String[] {""} ;
      BC000L9_n249TBM33_EXPRESSION = new boolean[] {false} ;
      BC000L9_A380TBM33_COND_DIV = new String[] {""} ;
      BC000L9_n380TBM33_COND_DIV = new boolean[] {false} ;
      BC000L9_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      BC000L9_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      BC000L9_A250TBM33_PRIOR_NO = new byte[1] ;
      BC000L9_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      BC000L9_A382TBM33_ERR_DIV = new String[] {""} ;
      BC000L9_n382TBM33_ERR_DIV = new boolean[] {false} ;
      BC000L9_A383TBM33_ERR_MSG = new String[] {""} ;
      BC000L9_n383TBM33_ERR_MSG = new boolean[] {false} ;
      BC000L9_A554TBM33_ENABLED_FLG = new String[] {""} ;
      BC000L9_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      BC000L9_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      BC000L9_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      BC000L9_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      BC000L9_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      BC000L9_A251TBM33_DEL_FLG = new String[] {""} ;
      BC000L9_n251TBM33_DEL_FLG = new boolean[] {false} ;
      BC000L9_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      BC000L9_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      BC000L9_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      BC000L9_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm33_crf_cond_bc__default(),
         new Object[] {
             new Object[] {
            BC000L2_A246TBM33_STUDY_ID, BC000L2_A247TBM33_CRF_ID, BC000L2_A248TBM33_COND_NO, BC000L2_A252TBM33_CRT_DATETIME, BC000L2_n252TBM33_CRT_DATETIME, BC000L2_A253TBM33_CRT_USER_ID, BC000L2_n253TBM33_CRT_USER_ID, BC000L2_A255TBM33_UPD_DATETIME, BC000L2_n255TBM33_UPD_DATETIME, BC000L2_A256TBM33_UPD_USER_ID,
            BC000L2_n256TBM33_UPD_USER_ID, BC000L2_A258TBM33_UPD_CNT, BC000L2_n258TBM33_UPD_CNT, BC000L2_A379TBM33_COND_NM, BC000L2_n379TBM33_COND_NM, BC000L2_A249TBM33_EXPRESSION, BC000L2_n249TBM33_EXPRESSION, BC000L2_A380TBM33_COND_DIV, BC000L2_n380TBM33_COND_DIV, BC000L2_A381TBM33_CRF_ITEM_CD,
            BC000L2_n381TBM33_CRF_ITEM_CD, BC000L2_A250TBM33_PRIOR_NO, BC000L2_n250TBM33_PRIOR_NO, BC000L2_A382TBM33_ERR_DIV, BC000L2_n382TBM33_ERR_DIV, BC000L2_A383TBM33_ERR_MSG, BC000L2_n383TBM33_ERR_MSG, BC000L2_A554TBM33_ENABLED_FLG, BC000L2_n554TBM33_ENABLED_FLG, BC000L2_A610TBM33_REQUIRED_INPUT_FLG,
            BC000L2_n610TBM33_REQUIRED_INPUT_FLG, BC000L2_A611TBM33_NUMERIC_RANGE_FLG, BC000L2_n611TBM33_NUMERIC_RANGE_FLG, BC000L2_A251TBM33_DEL_FLG, BC000L2_n251TBM33_DEL_FLG, BC000L2_A254TBM33_CRT_PROG_NM, BC000L2_n254TBM33_CRT_PROG_NM, BC000L2_A257TBM33_UPD_PROG_NM, BC000L2_n257TBM33_UPD_PROG_NM
            }
            , new Object[] {
            BC000L3_A246TBM33_STUDY_ID, BC000L3_A247TBM33_CRF_ID, BC000L3_A248TBM33_COND_NO, BC000L3_A252TBM33_CRT_DATETIME, BC000L3_n252TBM33_CRT_DATETIME, BC000L3_A253TBM33_CRT_USER_ID, BC000L3_n253TBM33_CRT_USER_ID, BC000L3_A255TBM33_UPD_DATETIME, BC000L3_n255TBM33_UPD_DATETIME, BC000L3_A256TBM33_UPD_USER_ID,
            BC000L3_n256TBM33_UPD_USER_ID, BC000L3_A258TBM33_UPD_CNT, BC000L3_n258TBM33_UPD_CNT, BC000L3_A379TBM33_COND_NM, BC000L3_n379TBM33_COND_NM, BC000L3_A249TBM33_EXPRESSION, BC000L3_n249TBM33_EXPRESSION, BC000L3_A380TBM33_COND_DIV, BC000L3_n380TBM33_COND_DIV, BC000L3_A381TBM33_CRF_ITEM_CD,
            BC000L3_n381TBM33_CRF_ITEM_CD, BC000L3_A250TBM33_PRIOR_NO, BC000L3_n250TBM33_PRIOR_NO, BC000L3_A382TBM33_ERR_DIV, BC000L3_n382TBM33_ERR_DIV, BC000L3_A383TBM33_ERR_MSG, BC000L3_n383TBM33_ERR_MSG, BC000L3_A554TBM33_ENABLED_FLG, BC000L3_n554TBM33_ENABLED_FLG, BC000L3_A610TBM33_REQUIRED_INPUT_FLG,
            BC000L3_n610TBM33_REQUIRED_INPUT_FLG, BC000L3_A611TBM33_NUMERIC_RANGE_FLG, BC000L3_n611TBM33_NUMERIC_RANGE_FLG, BC000L3_A251TBM33_DEL_FLG, BC000L3_n251TBM33_DEL_FLG, BC000L3_A254TBM33_CRT_PROG_NM, BC000L3_n254TBM33_CRT_PROG_NM, BC000L3_A257TBM33_UPD_PROG_NM, BC000L3_n257TBM33_UPD_PROG_NM
            }
            , new Object[] {
            BC000L4_A246TBM33_STUDY_ID, BC000L4_A247TBM33_CRF_ID, BC000L4_A248TBM33_COND_NO, BC000L4_A252TBM33_CRT_DATETIME, BC000L4_n252TBM33_CRT_DATETIME, BC000L4_A253TBM33_CRT_USER_ID, BC000L4_n253TBM33_CRT_USER_ID, BC000L4_A255TBM33_UPD_DATETIME, BC000L4_n255TBM33_UPD_DATETIME, BC000L4_A256TBM33_UPD_USER_ID,
            BC000L4_n256TBM33_UPD_USER_ID, BC000L4_A258TBM33_UPD_CNT, BC000L4_n258TBM33_UPD_CNT, BC000L4_A379TBM33_COND_NM, BC000L4_n379TBM33_COND_NM, BC000L4_A249TBM33_EXPRESSION, BC000L4_n249TBM33_EXPRESSION, BC000L4_A380TBM33_COND_DIV, BC000L4_n380TBM33_COND_DIV, BC000L4_A381TBM33_CRF_ITEM_CD,
            BC000L4_n381TBM33_CRF_ITEM_CD, BC000L4_A250TBM33_PRIOR_NO, BC000L4_n250TBM33_PRIOR_NO, BC000L4_A382TBM33_ERR_DIV, BC000L4_n382TBM33_ERR_DIV, BC000L4_A383TBM33_ERR_MSG, BC000L4_n383TBM33_ERR_MSG, BC000L4_A554TBM33_ENABLED_FLG, BC000L4_n554TBM33_ENABLED_FLG, BC000L4_A610TBM33_REQUIRED_INPUT_FLG,
            BC000L4_n610TBM33_REQUIRED_INPUT_FLG, BC000L4_A611TBM33_NUMERIC_RANGE_FLG, BC000L4_n611TBM33_NUMERIC_RANGE_FLG, BC000L4_A251TBM33_DEL_FLG, BC000L4_n251TBM33_DEL_FLG, BC000L4_A254TBM33_CRT_PROG_NM, BC000L4_n254TBM33_CRT_PROG_NM, BC000L4_A257TBM33_UPD_PROG_NM, BC000L4_n257TBM33_UPD_PROG_NM
            }
            , new Object[] {
            BC000L5_A246TBM33_STUDY_ID, BC000L5_A247TBM33_CRF_ID, BC000L5_A248TBM33_COND_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000L9_A246TBM33_STUDY_ID, BC000L9_A247TBM33_CRF_ID, BC000L9_A248TBM33_COND_NO, BC000L9_A252TBM33_CRT_DATETIME, BC000L9_n252TBM33_CRT_DATETIME, BC000L9_A253TBM33_CRT_USER_ID, BC000L9_n253TBM33_CRT_USER_ID, BC000L9_A255TBM33_UPD_DATETIME, BC000L9_n255TBM33_UPD_DATETIME, BC000L9_A256TBM33_UPD_USER_ID,
            BC000L9_n256TBM33_UPD_USER_ID, BC000L9_A258TBM33_UPD_CNT, BC000L9_n258TBM33_UPD_CNT, BC000L9_A379TBM33_COND_NM, BC000L9_n379TBM33_COND_NM, BC000L9_A249TBM33_EXPRESSION, BC000L9_n249TBM33_EXPRESSION, BC000L9_A380TBM33_COND_DIV, BC000L9_n380TBM33_COND_DIV, BC000L9_A381TBM33_CRF_ITEM_CD,
            BC000L9_n381TBM33_CRF_ITEM_CD, BC000L9_A250TBM33_PRIOR_NO, BC000L9_n250TBM33_PRIOR_NO, BC000L9_A382TBM33_ERR_DIV, BC000L9_n382TBM33_ERR_DIV, BC000L9_A383TBM33_ERR_MSG, BC000L9_n383TBM33_ERR_MSG, BC000L9_A554TBM33_ENABLED_FLG, BC000L9_n554TBM33_ENABLED_FLG, BC000L9_A610TBM33_REQUIRED_INPUT_FLG,
            BC000L9_n610TBM33_REQUIRED_INPUT_FLG, BC000L9_A611TBM33_NUMERIC_RANGE_FLG, BC000L9_n611TBM33_NUMERIC_RANGE_FLG, BC000L9_A251TBM33_DEL_FLG, BC000L9_n251TBM33_DEL_FLG, BC000L9_A254TBM33_CRT_PROG_NM, BC000L9_n254TBM33_CRT_PROG_NM, BC000L9_A257TBM33_UPD_PROG_NM, BC000L9_n257TBM33_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM33_CRF_COND_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110L2 */
      e110L2 ();
   }

   private byte nKeyPressed ;
   private byte A250TBM33_PRIOR_NO ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N ;
   private byte Z250TBM33_PRIOR_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z247TBM33_CRF_ID ;
   private short A247TBM33_CRF_ID ;
   private short Z248TBM33_COND_NO ;
   private short A248TBM33_COND_NO ;
   private short gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z ;
   private short gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z ;
   private short RcdFound20 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z246TBM33_STUDY_ID ;
   private long A246TBM33_STUDY_ID ;
   private long A258TBM33_UPD_CNT ;
   private long gxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z ;
   private long gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z ;
   private long Z258TBM33_UPD_CNT ;
   private long O258TBM33_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode20 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A252TBM33_CRT_DATETIME ;
   private java.util.Date A255TBM33_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z ;
   private java.util.Date Z252TBM33_CRT_DATETIME ;
   private java.util.Date Z255TBM33_UPD_DATETIME ;
   private boolean n252TBM33_CRT_DATETIME ;
   private boolean n253TBM33_CRT_USER_ID ;
   private boolean n255TBM33_UPD_DATETIME ;
   private boolean n256TBM33_UPD_USER_ID ;
   private boolean n258TBM33_UPD_CNT ;
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
   private boolean n251TBM33_DEL_FLG ;
   private boolean n254TBM33_CRT_PROG_NM ;
   private boolean n257TBM33_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A379TBM33_COND_NM ;
   private String A249TBM33_EXPRESSION ;
   private String A380TBM33_COND_DIV ;
   private String A381TBM33_CRF_ITEM_CD ;
   private String A382TBM33_ERR_DIV ;
   private String A383TBM33_ERR_MSG ;
   private String A554TBM33_ENABLED_FLG ;
   private String A610TBM33_REQUIRED_INPUT_FLG ;
   private String A611TBM33_NUMERIC_RANGE_FLG ;
   private String A251TBM33_DEL_FLG ;
   private String A253TBM33_CRT_USER_ID ;
   private String A254TBM33_CRT_PROG_NM ;
   private String A256TBM33_UPD_USER_ID ;
   private String A257TBM33_UPD_PROG_NM ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z ;
   private String Z253TBM33_CRT_USER_ID ;
   private String Z256TBM33_UPD_USER_ID ;
   private String Z379TBM33_COND_NM ;
   private String Z249TBM33_EXPRESSION ;
   private String Z380TBM33_COND_DIV ;
   private String Z381TBM33_CRF_ITEM_CD ;
   private String Z382TBM33_ERR_DIV ;
   private String Z383TBM33_ERR_MSG ;
   private String Z554TBM33_ENABLED_FLG ;
   private String Z610TBM33_REQUIRED_INPUT_FLG ;
   private String Z611TBM33_NUMERIC_RANGE_FLG ;
   private String Z251TBM33_DEL_FLG ;
   private String Z254TBM33_CRT_PROG_NM ;
   private String Z257TBM33_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM33_CRF_COND bcTBM33_CRF_COND ;
   private IDataStoreProvider pr_default ;
   private long[] BC000L4_A246TBM33_STUDY_ID ;
   private short[] BC000L4_A247TBM33_CRF_ID ;
   private short[] BC000L4_A248TBM33_COND_NO ;
   private java.util.Date[] BC000L4_A252TBM33_CRT_DATETIME ;
   private boolean[] BC000L4_n252TBM33_CRT_DATETIME ;
   private String[] BC000L4_A253TBM33_CRT_USER_ID ;
   private boolean[] BC000L4_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] BC000L4_A255TBM33_UPD_DATETIME ;
   private boolean[] BC000L4_n255TBM33_UPD_DATETIME ;
   private String[] BC000L4_A256TBM33_UPD_USER_ID ;
   private boolean[] BC000L4_n256TBM33_UPD_USER_ID ;
   private long[] BC000L4_A258TBM33_UPD_CNT ;
   private boolean[] BC000L4_n258TBM33_UPD_CNT ;
   private String[] BC000L4_A379TBM33_COND_NM ;
   private boolean[] BC000L4_n379TBM33_COND_NM ;
   private String[] BC000L4_A249TBM33_EXPRESSION ;
   private boolean[] BC000L4_n249TBM33_EXPRESSION ;
   private String[] BC000L4_A380TBM33_COND_DIV ;
   private boolean[] BC000L4_n380TBM33_COND_DIV ;
   private String[] BC000L4_A381TBM33_CRF_ITEM_CD ;
   private boolean[] BC000L4_n381TBM33_CRF_ITEM_CD ;
   private byte[] BC000L4_A250TBM33_PRIOR_NO ;
   private boolean[] BC000L4_n250TBM33_PRIOR_NO ;
   private String[] BC000L4_A382TBM33_ERR_DIV ;
   private boolean[] BC000L4_n382TBM33_ERR_DIV ;
   private String[] BC000L4_A383TBM33_ERR_MSG ;
   private boolean[] BC000L4_n383TBM33_ERR_MSG ;
   private String[] BC000L4_A554TBM33_ENABLED_FLG ;
   private boolean[] BC000L4_n554TBM33_ENABLED_FLG ;
   private String[] BC000L4_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] BC000L4_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] BC000L4_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] BC000L4_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] BC000L4_A251TBM33_DEL_FLG ;
   private boolean[] BC000L4_n251TBM33_DEL_FLG ;
   private String[] BC000L4_A254TBM33_CRT_PROG_NM ;
   private boolean[] BC000L4_n254TBM33_CRT_PROG_NM ;
   private String[] BC000L4_A257TBM33_UPD_PROG_NM ;
   private boolean[] BC000L4_n257TBM33_UPD_PROG_NM ;
   private long[] BC000L5_A246TBM33_STUDY_ID ;
   private short[] BC000L5_A247TBM33_CRF_ID ;
   private short[] BC000L5_A248TBM33_COND_NO ;
   private long[] BC000L3_A246TBM33_STUDY_ID ;
   private short[] BC000L3_A247TBM33_CRF_ID ;
   private short[] BC000L3_A248TBM33_COND_NO ;
   private java.util.Date[] BC000L3_A252TBM33_CRT_DATETIME ;
   private boolean[] BC000L3_n252TBM33_CRT_DATETIME ;
   private String[] BC000L3_A253TBM33_CRT_USER_ID ;
   private boolean[] BC000L3_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] BC000L3_A255TBM33_UPD_DATETIME ;
   private boolean[] BC000L3_n255TBM33_UPD_DATETIME ;
   private String[] BC000L3_A256TBM33_UPD_USER_ID ;
   private boolean[] BC000L3_n256TBM33_UPD_USER_ID ;
   private long[] BC000L3_A258TBM33_UPD_CNT ;
   private boolean[] BC000L3_n258TBM33_UPD_CNT ;
   private String[] BC000L3_A379TBM33_COND_NM ;
   private boolean[] BC000L3_n379TBM33_COND_NM ;
   private String[] BC000L3_A249TBM33_EXPRESSION ;
   private boolean[] BC000L3_n249TBM33_EXPRESSION ;
   private String[] BC000L3_A380TBM33_COND_DIV ;
   private boolean[] BC000L3_n380TBM33_COND_DIV ;
   private String[] BC000L3_A381TBM33_CRF_ITEM_CD ;
   private boolean[] BC000L3_n381TBM33_CRF_ITEM_CD ;
   private byte[] BC000L3_A250TBM33_PRIOR_NO ;
   private boolean[] BC000L3_n250TBM33_PRIOR_NO ;
   private String[] BC000L3_A382TBM33_ERR_DIV ;
   private boolean[] BC000L3_n382TBM33_ERR_DIV ;
   private String[] BC000L3_A383TBM33_ERR_MSG ;
   private boolean[] BC000L3_n383TBM33_ERR_MSG ;
   private String[] BC000L3_A554TBM33_ENABLED_FLG ;
   private boolean[] BC000L3_n554TBM33_ENABLED_FLG ;
   private String[] BC000L3_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] BC000L3_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] BC000L3_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] BC000L3_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] BC000L3_A251TBM33_DEL_FLG ;
   private boolean[] BC000L3_n251TBM33_DEL_FLG ;
   private String[] BC000L3_A254TBM33_CRT_PROG_NM ;
   private boolean[] BC000L3_n254TBM33_CRT_PROG_NM ;
   private String[] BC000L3_A257TBM33_UPD_PROG_NM ;
   private boolean[] BC000L3_n257TBM33_UPD_PROG_NM ;
   private long[] BC000L2_A246TBM33_STUDY_ID ;
   private short[] BC000L2_A247TBM33_CRF_ID ;
   private short[] BC000L2_A248TBM33_COND_NO ;
   private java.util.Date[] BC000L2_A252TBM33_CRT_DATETIME ;
   private boolean[] BC000L2_n252TBM33_CRT_DATETIME ;
   private String[] BC000L2_A253TBM33_CRT_USER_ID ;
   private boolean[] BC000L2_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] BC000L2_A255TBM33_UPD_DATETIME ;
   private boolean[] BC000L2_n255TBM33_UPD_DATETIME ;
   private String[] BC000L2_A256TBM33_UPD_USER_ID ;
   private boolean[] BC000L2_n256TBM33_UPD_USER_ID ;
   private long[] BC000L2_A258TBM33_UPD_CNT ;
   private boolean[] BC000L2_n258TBM33_UPD_CNT ;
   private String[] BC000L2_A379TBM33_COND_NM ;
   private boolean[] BC000L2_n379TBM33_COND_NM ;
   private String[] BC000L2_A249TBM33_EXPRESSION ;
   private boolean[] BC000L2_n249TBM33_EXPRESSION ;
   private String[] BC000L2_A380TBM33_COND_DIV ;
   private boolean[] BC000L2_n380TBM33_COND_DIV ;
   private String[] BC000L2_A381TBM33_CRF_ITEM_CD ;
   private boolean[] BC000L2_n381TBM33_CRF_ITEM_CD ;
   private byte[] BC000L2_A250TBM33_PRIOR_NO ;
   private boolean[] BC000L2_n250TBM33_PRIOR_NO ;
   private String[] BC000L2_A382TBM33_ERR_DIV ;
   private boolean[] BC000L2_n382TBM33_ERR_DIV ;
   private String[] BC000L2_A383TBM33_ERR_MSG ;
   private boolean[] BC000L2_n383TBM33_ERR_MSG ;
   private String[] BC000L2_A554TBM33_ENABLED_FLG ;
   private boolean[] BC000L2_n554TBM33_ENABLED_FLG ;
   private String[] BC000L2_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] BC000L2_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] BC000L2_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] BC000L2_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] BC000L2_A251TBM33_DEL_FLG ;
   private boolean[] BC000L2_n251TBM33_DEL_FLG ;
   private String[] BC000L2_A254TBM33_CRT_PROG_NM ;
   private boolean[] BC000L2_n254TBM33_CRT_PROG_NM ;
   private String[] BC000L2_A257TBM33_UPD_PROG_NM ;
   private boolean[] BC000L2_n257TBM33_UPD_PROG_NM ;
   private long[] BC000L9_A246TBM33_STUDY_ID ;
   private short[] BC000L9_A247TBM33_CRF_ID ;
   private short[] BC000L9_A248TBM33_COND_NO ;
   private java.util.Date[] BC000L9_A252TBM33_CRT_DATETIME ;
   private boolean[] BC000L9_n252TBM33_CRT_DATETIME ;
   private String[] BC000L9_A253TBM33_CRT_USER_ID ;
   private boolean[] BC000L9_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] BC000L9_A255TBM33_UPD_DATETIME ;
   private boolean[] BC000L9_n255TBM33_UPD_DATETIME ;
   private String[] BC000L9_A256TBM33_UPD_USER_ID ;
   private boolean[] BC000L9_n256TBM33_UPD_USER_ID ;
   private long[] BC000L9_A258TBM33_UPD_CNT ;
   private boolean[] BC000L9_n258TBM33_UPD_CNT ;
   private String[] BC000L9_A379TBM33_COND_NM ;
   private boolean[] BC000L9_n379TBM33_COND_NM ;
   private String[] BC000L9_A249TBM33_EXPRESSION ;
   private boolean[] BC000L9_n249TBM33_EXPRESSION ;
   private String[] BC000L9_A380TBM33_COND_DIV ;
   private boolean[] BC000L9_n380TBM33_COND_DIV ;
   private String[] BC000L9_A381TBM33_CRF_ITEM_CD ;
   private boolean[] BC000L9_n381TBM33_CRF_ITEM_CD ;
   private byte[] BC000L9_A250TBM33_PRIOR_NO ;
   private boolean[] BC000L9_n250TBM33_PRIOR_NO ;
   private String[] BC000L9_A382TBM33_ERR_DIV ;
   private boolean[] BC000L9_n382TBM33_ERR_DIV ;
   private String[] BC000L9_A383TBM33_ERR_MSG ;
   private boolean[] BC000L9_n383TBM33_ERR_MSG ;
   private String[] BC000L9_A554TBM33_ENABLED_FLG ;
   private boolean[] BC000L9_n554TBM33_ENABLED_FLG ;
   private String[] BC000L9_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] BC000L9_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] BC000L9_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] BC000L9_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] BC000L9_A251TBM33_DEL_FLG ;
   private boolean[] BC000L9_n251TBM33_DEL_FLG ;
   private String[] BC000L9_A254TBM33_CRT_PROG_NM ;
   private boolean[] BC000L9_n254TBM33_CRT_PROG_NM ;
   private String[] BC000L9_A257TBM33_UPD_PROG_NM ;
   private boolean[] BC000L9_n257TBM33_UPD_PROG_NM ;
}

final  class tbm33_crf_cond_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000L2", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000L3", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000L4", "SELECT TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO`, TM1.`TBM33_CRT_DATETIME`, TM1.`TBM33_CRT_USER_ID`, TM1.`TBM33_UPD_DATETIME`, TM1.`TBM33_UPD_USER_ID`, TM1.`TBM33_UPD_CNT`, TM1.`TBM33_COND_NM`, TM1.`TBM33_EXPRESSION`, TM1.`TBM33_COND_DIV`, TM1.`TBM33_CRF_ITEM_CD`, TM1.`TBM33_PRIOR_NO`, TM1.`TBM33_ERR_DIV`, TM1.`TBM33_ERR_MSG`, TM1.`TBM33_ENABLED_FLG`, TM1.`TBM33_REQUIRED_INPUT_FLG`, TM1.`TBM33_NUMERIC_RANGE_FLG`, TM1.`TBM33_DEL_FLG`, TM1.`TBM33_CRT_PROG_NM`, TM1.`TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` TM1 WHERE TM1.`TBM33_STUDY_ID` = ? and TM1.`TBM33_CRF_ID` = ? and TM1.`TBM33_COND_NO` = ? ORDER BY TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000L5", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000L6", "INSERT INTO `TBM33_CRF_COND` (`TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000L7", "UPDATE `TBM33_CRF_COND` SET `TBM33_CRT_DATETIME`=?, `TBM33_CRT_USER_ID`=?, `TBM33_UPD_DATETIME`=?, `TBM33_UPD_USER_ID`=?, `TBM33_UPD_CNT`=?, `TBM33_COND_NM`=?, `TBM33_EXPRESSION`=?, `TBM33_COND_DIV`=?, `TBM33_CRF_ITEM_CD`=?, `TBM33_PRIOR_NO`=?, `TBM33_ERR_DIV`=?, `TBM33_ERR_MSG`=?, `TBM33_ENABLED_FLG`=?, `TBM33_REQUIRED_INPUT_FLG`=?, `TBM33_NUMERIC_RANGE_FLG`=?, `TBM33_DEL_FLG`=?, `TBM33_CRT_PROG_NM`=?, `TBM33_UPD_PROG_NM`=?  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000L8", "DELETE FROM `TBM33_CRF_COND`  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000L9", "SELECT TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO`, TM1.`TBM33_CRT_DATETIME`, TM1.`TBM33_CRT_USER_ID`, TM1.`TBM33_UPD_DATETIME`, TM1.`TBM33_UPD_USER_ID`, TM1.`TBM33_UPD_CNT`, TM1.`TBM33_COND_NM`, TM1.`TBM33_EXPRESSION`, TM1.`TBM33_COND_DIV`, TM1.`TBM33_CRF_ITEM_CD`, TM1.`TBM33_PRIOR_NO`, TM1.`TBM33_ERR_DIV`, TM1.`TBM33_ERR_MSG`, TM1.`TBM33_ENABLED_FLG`, TM1.`TBM33_REQUIRED_INPUT_FLG`, TM1.`TBM33_NUMERIC_RANGE_FLG`, TM1.`TBM33_DEL_FLG`, TM1.`TBM33_CRT_PROG_NM`, TM1.`TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` TM1 WHERE TM1.`TBM33_STUDY_ID` = ? and TM1.`TBM33_CRF_ID` = ? and TM1.`TBM33_COND_NO` = ? ORDER BY TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
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
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
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
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
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
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
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
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
                  stmt.setVarchar(9, (String)parms[14], 100);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 1000);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 50);
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
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 200);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1000);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 200);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               stmt.setLong(19, ((Number) parms[36]).longValue());
               stmt.setShort(20, ((Number) parms[37]).shortValue());
               stmt.setShort(21, ((Number) parms[38]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

