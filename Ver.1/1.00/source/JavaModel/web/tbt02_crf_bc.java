/*
               File: tbt02_crf_bc
        Description: CRFテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:22.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt02_crf_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt02_crf_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt02_crf_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt02_crf_bc.class ));
   }

   public tbt02_crf_bc( int remoteHandle ,
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
         /* Execute user event: e120P2 */
         e120P2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z292TBT02_STUDY_ID = A292TBT02_STUDY_ID ;
            Z293TBT02_SUBJECT_ID = A293TBT02_SUBJECT_ID ;
            Z294TBT02_CRF_ID = A294TBT02_CRF_ID ;
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

   public void confirm_0P0( )
   {
      beforeValidate0P24( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0P24( ) ;
         }
         else
         {
            checkExtendedTable0P24( ) ;
            if ( AnyError == 0 )
            {
               zm0P24( 14) ;
            }
            closeExtendedTableCursors0P24( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110P2( )
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

   public void e120P2( )
   {
      /* After Trn Routine */
   }

   public void S1183( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0P24( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         Z296TBT02_CRT_DATETIME = A296TBT02_CRT_DATETIME ;
         Z297TBT02_CRT_USER_ID = A297TBT02_CRT_USER_ID ;
         Z299TBT02_UPD_DATETIME = A299TBT02_UPD_DATETIME ;
         Z300TBT02_UPD_USER_ID = A300TBT02_UPD_USER_ID ;
         Z302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
         Z370TBT02_CRF_LATEST_VERSION = A370TBT02_CRF_LATEST_VERSION ;
         Z371TBT02_CRF_INPUT_LEVEL = A371TBT02_CRF_INPUT_LEVEL ;
         Z556TBT02_LOCK_FLG = A556TBT02_LOCK_FLG ;
         Z557TBT02_LOCK_DATETIME = A557TBT02_LOCK_DATETIME ;
         Z558TBT02_LOCK_USER_ID = A558TBT02_LOCK_USER_ID ;
         Z559TBT02_LOCK_AUTH_CD = A559TBT02_LOCK_AUTH_CD ;
         Z560TBT02_UPLOAD_DATETIME = A560TBT02_UPLOAD_DATETIME ;
         Z561TBT02_UPLOAD_USER_ID = A561TBT02_UPLOAD_USER_ID ;
         Z562TBT02_UPLOAD_AUTH_CD = A562TBT02_UPLOAD_AUTH_CD ;
         Z563TBT02_DM_ARRIVAL_FLG = A563TBT02_DM_ARRIVAL_FLG ;
         Z564TBT02_DM_ARRIVAL_DATETIME = A564TBT02_DM_ARRIVAL_DATETIME ;
         Z565TBT02_APPROVAL_FLG = A565TBT02_APPROVAL_FLG ;
         Z566TBT02_APPROVAL_DATETIME = A566TBT02_APPROVAL_DATETIME ;
         Z567TBT02_APPROVAL_USER_ID = A567TBT02_APPROVAL_USER_ID ;
         Z568TBT02_APPROVAL_AUTH_CD = A568TBT02_APPROVAL_AUTH_CD ;
         Z569TBT02_INPUT_END_FLG = A569TBT02_INPUT_END_FLG ;
         Z570TBT02_INPUT_END_DATETIME = A570TBT02_INPUT_END_DATETIME ;
         Z571TBT02_INPUT_END_USER_ID = A571TBT02_INPUT_END_USER_ID ;
         Z572TBT02_INPUT_END_AUTH_CD = A572TBT02_INPUT_END_AUTH_CD ;
         Z295TBT02_DEL_FLG = A295TBT02_DEL_FLG ;
         Z298TBT02_CRT_PROG_NM = A298TBT02_CRT_PROG_NM ;
         Z301TBT02_UPD_PROG_NM = A301TBT02_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -13 )
      {
         Z294TBT02_CRF_ID = A294TBT02_CRF_ID ;
         Z296TBT02_CRT_DATETIME = A296TBT02_CRT_DATETIME ;
         Z297TBT02_CRT_USER_ID = A297TBT02_CRT_USER_ID ;
         Z299TBT02_UPD_DATETIME = A299TBT02_UPD_DATETIME ;
         Z300TBT02_UPD_USER_ID = A300TBT02_UPD_USER_ID ;
         Z302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
         Z370TBT02_CRF_LATEST_VERSION = A370TBT02_CRF_LATEST_VERSION ;
         Z371TBT02_CRF_INPUT_LEVEL = A371TBT02_CRF_INPUT_LEVEL ;
         Z556TBT02_LOCK_FLG = A556TBT02_LOCK_FLG ;
         Z557TBT02_LOCK_DATETIME = A557TBT02_LOCK_DATETIME ;
         Z558TBT02_LOCK_USER_ID = A558TBT02_LOCK_USER_ID ;
         Z559TBT02_LOCK_AUTH_CD = A559TBT02_LOCK_AUTH_CD ;
         Z560TBT02_UPLOAD_DATETIME = A560TBT02_UPLOAD_DATETIME ;
         Z561TBT02_UPLOAD_USER_ID = A561TBT02_UPLOAD_USER_ID ;
         Z562TBT02_UPLOAD_AUTH_CD = A562TBT02_UPLOAD_AUTH_CD ;
         Z563TBT02_DM_ARRIVAL_FLG = A563TBT02_DM_ARRIVAL_FLG ;
         Z564TBT02_DM_ARRIVAL_DATETIME = A564TBT02_DM_ARRIVAL_DATETIME ;
         Z565TBT02_APPROVAL_FLG = A565TBT02_APPROVAL_FLG ;
         Z566TBT02_APPROVAL_DATETIME = A566TBT02_APPROVAL_DATETIME ;
         Z567TBT02_APPROVAL_USER_ID = A567TBT02_APPROVAL_USER_ID ;
         Z568TBT02_APPROVAL_AUTH_CD = A568TBT02_APPROVAL_AUTH_CD ;
         Z569TBT02_INPUT_END_FLG = A569TBT02_INPUT_END_FLG ;
         Z570TBT02_INPUT_END_DATETIME = A570TBT02_INPUT_END_DATETIME ;
         Z571TBT02_INPUT_END_USER_ID = A571TBT02_INPUT_END_USER_ID ;
         Z572TBT02_INPUT_END_AUTH_CD = A572TBT02_INPUT_END_AUTH_CD ;
         Z295TBT02_DEL_FLG = A295TBT02_DEL_FLG ;
         Z298TBT02_CRT_PROG_NM = A298TBT02_CRT_PROG_NM ;
         Z301TBT02_UPD_PROG_NM = A301TBT02_UPD_PROG_NM ;
         Z292TBT02_STUDY_ID = A292TBT02_STUDY_ID ;
         Z293TBT02_SUBJECT_ID = A293TBT02_SUBJECT_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0P24( )
   {
      /* Using cursor BC000P5 */
      pr_default.execute(3, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A296TBT02_CRT_DATETIME = BC000P5_A296TBT02_CRT_DATETIME[0] ;
         n296TBT02_CRT_DATETIME = BC000P5_n296TBT02_CRT_DATETIME[0] ;
         A297TBT02_CRT_USER_ID = BC000P5_A297TBT02_CRT_USER_ID[0] ;
         n297TBT02_CRT_USER_ID = BC000P5_n297TBT02_CRT_USER_ID[0] ;
         A299TBT02_UPD_DATETIME = BC000P5_A299TBT02_UPD_DATETIME[0] ;
         n299TBT02_UPD_DATETIME = BC000P5_n299TBT02_UPD_DATETIME[0] ;
         A300TBT02_UPD_USER_ID = BC000P5_A300TBT02_UPD_USER_ID[0] ;
         n300TBT02_UPD_USER_ID = BC000P5_n300TBT02_UPD_USER_ID[0] ;
         A302TBT02_UPD_CNT = BC000P5_A302TBT02_UPD_CNT[0] ;
         n302TBT02_UPD_CNT = BC000P5_n302TBT02_UPD_CNT[0] ;
         A370TBT02_CRF_LATEST_VERSION = BC000P5_A370TBT02_CRF_LATEST_VERSION[0] ;
         n370TBT02_CRF_LATEST_VERSION = BC000P5_n370TBT02_CRF_LATEST_VERSION[0] ;
         A371TBT02_CRF_INPUT_LEVEL = BC000P5_A371TBT02_CRF_INPUT_LEVEL[0] ;
         n371TBT02_CRF_INPUT_LEVEL = BC000P5_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A556TBT02_LOCK_FLG = BC000P5_A556TBT02_LOCK_FLG[0] ;
         n556TBT02_LOCK_FLG = BC000P5_n556TBT02_LOCK_FLG[0] ;
         A557TBT02_LOCK_DATETIME = BC000P5_A557TBT02_LOCK_DATETIME[0] ;
         n557TBT02_LOCK_DATETIME = BC000P5_n557TBT02_LOCK_DATETIME[0] ;
         A558TBT02_LOCK_USER_ID = BC000P5_A558TBT02_LOCK_USER_ID[0] ;
         n558TBT02_LOCK_USER_ID = BC000P5_n558TBT02_LOCK_USER_ID[0] ;
         A559TBT02_LOCK_AUTH_CD = BC000P5_A559TBT02_LOCK_AUTH_CD[0] ;
         n559TBT02_LOCK_AUTH_CD = BC000P5_n559TBT02_LOCK_AUTH_CD[0] ;
         A560TBT02_UPLOAD_DATETIME = BC000P5_A560TBT02_UPLOAD_DATETIME[0] ;
         n560TBT02_UPLOAD_DATETIME = BC000P5_n560TBT02_UPLOAD_DATETIME[0] ;
         A561TBT02_UPLOAD_USER_ID = BC000P5_A561TBT02_UPLOAD_USER_ID[0] ;
         n561TBT02_UPLOAD_USER_ID = BC000P5_n561TBT02_UPLOAD_USER_ID[0] ;
         A562TBT02_UPLOAD_AUTH_CD = BC000P5_A562TBT02_UPLOAD_AUTH_CD[0] ;
         n562TBT02_UPLOAD_AUTH_CD = BC000P5_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A563TBT02_DM_ARRIVAL_FLG = BC000P5_A563TBT02_DM_ARRIVAL_FLG[0] ;
         n563TBT02_DM_ARRIVAL_FLG = BC000P5_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = BC000P5_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = BC000P5_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A565TBT02_APPROVAL_FLG = BC000P5_A565TBT02_APPROVAL_FLG[0] ;
         n565TBT02_APPROVAL_FLG = BC000P5_n565TBT02_APPROVAL_FLG[0] ;
         A566TBT02_APPROVAL_DATETIME = BC000P5_A566TBT02_APPROVAL_DATETIME[0] ;
         n566TBT02_APPROVAL_DATETIME = BC000P5_n566TBT02_APPROVAL_DATETIME[0] ;
         A567TBT02_APPROVAL_USER_ID = BC000P5_A567TBT02_APPROVAL_USER_ID[0] ;
         n567TBT02_APPROVAL_USER_ID = BC000P5_n567TBT02_APPROVAL_USER_ID[0] ;
         A568TBT02_APPROVAL_AUTH_CD = BC000P5_A568TBT02_APPROVAL_AUTH_CD[0] ;
         n568TBT02_APPROVAL_AUTH_CD = BC000P5_n568TBT02_APPROVAL_AUTH_CD[0] ;
         A569TBT02_INPUT_END_FLG = BC000P5_A569TBT02_INPUT_END_FLG[0] ;
         n569TBT02_INPUT_END_FLG = BC000P5_n569TBT02_INPUT_END_FLG[0] ;
         A570TBT02_INPUT_END_DATETIME = BC000P5_A570TBT02_INPUT_END_DATETIME[0] ;
         n570TBT02_INPUT_END_DATETIME = BC000P5_n570TBT02_INPUT_END_DATETIME[0] ;
         A571TBT02_INPUT_END_USER_ID = BC000P5_A571TBT02_INPUT_END_USER_ID[0] ;
         n571TBT02_INPUT_END_USER_ID = BC000P5_n571TBT02_INPUT_END_USER_ID[0] ;
         A572TBT02_INPUT_END_AUTH_CD = BC000P5_A572TBT02_INPUT_END_AUTH_CD[0] ;
         n572TBT02_INPUT_END_AUTH_CD = BC000P5_n572TBT02_INPUT_END_AUTH_CD[0] ;
         A295TBT02_DEL_FLG = BC000P5_A295TBT02_DEL_FLG[0] ;
         n295TBT02_DEL_FLG = BC000P5_n295TBT02_DEL_FLG[0] ;
         A298TBT02_CRT_PROG_NM = BC000P5_A298TBT02_CRT_PROG_NM[0] ;
         n298TBT02_CRT_PROG_NM = BC000P5_n298TBT02_CRT_PROG_NM[0] ;
         A301TBT02_UPD_PROG_NM = BC000P5_A301TBT02_UPD_PROG_NM[0] ;
         n301TBT02_UPD_PROG_NM = BC000P5_n301TBT02_UPD_PROG_NM[0] ;
         zm0P24( -13) ;
      }
      pr_default.close(3);
      onLoadActions0P24( ) ;
   }

   public void onLoadActions0P24( )
   {
      AV9Pgmname = "TBT02_CRF_BC" ;
   }

   public void checkExtendedTable0P24( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT02_CRF_BC" ;
      /* Using cursor BC000P4 */
      pr_default.execute(2, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError292 = 1 ;
         AnyError293 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
      }
      if ( ( AnyError292 == 0 ) && ( AnyError293 == 0 ) )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A557TBT02_LOCK_DATETIME) || (( A557TBT02_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A557TBT02_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A560TBT02_UPLOAD_DATETIME) || (( A560TBT02_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A560TBT02_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A564TBT02_DM_ARRIVAL_DATETIME) || (( A564TBT02_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A564TBT02_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A566TBT02_APPROVAL_DATETIME) || (( A566TBT02_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A566TBT02_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A570TBT02_INPUT_END_DATETIME) || (( A570TBT02_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A570TBT02_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A296TBT02_CRT_DATETIME) || (( A296TBT02_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A296TBT02_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A299TBT02_UPD_DATETIME) || (( A299TBT02_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A299TBT02_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0P24( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey0P24( )
   {
      /* Using cursor BC000P6 */
      pr_default.execute(4, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound24 = (short)(1) ;
      }
      else
      {
         RcdFound24 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000P3 */
      pr_default.execute(1, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0P24( 13) ;
         RcdFound24 = (short)(1) ;
         A294TBT02_CRF_ID = BC000P3_A294TBT02_CRF_ID[0] ;
         A296TBT02_CRT_DATETIME = BC000P3_A296TBT02_CRT_DATETIME[0] ;
         n296TBT02_CRT_DATETIME = BC000P3_n296TBT02_CRT_DATETIME[0] ;
         A297TBT02_CRT_USER_ID = BC000P3_A297TBT02_CRT_USER_ID[0] ;
         n297TBT02_CRT_USER_ID = BC000P3_n297TBT02_CRT_USER_ID[0] ;
         A299TBT02_UPD_DATETIME = BC000P3_A299TBT02_UPD_DATETIME[0] ;
         n299TBT02_UPD_DATETIME = BC000P3_n299TBT02_UPD_DATETIME[0] ;
         A300TBT02_UPD_USER_ID = BC000P3_A300TBT02_UPD_USER_ID[0] ;
         n300TBT02_UPD_USER_ID = BC000P3_n300TBT02_UPD_USER_ID[0] ;
         A302TBT02_UPD_CNT = BC000P3_A302TBT02_UPD_CNT[0] ;
         n302TBT02_UPD_CNT = BC000P3_n302TBT02_UPD_CNT[0] ;
         A370TBT02_CRF_LATEST_VERSION = BC000P3_A370TBT02_CRF_LATEST_VERSION[0] ;
         n370TBT02_CRF_LATEST_VERSION = BC000P3_n370TBT02_CRF_LATEST_VERSION[0] ;
         A371TBT02_CRF_INPUT_LEVEL = BC000P3_A371TBT02_CRF_INPUT_LEVEL[0] ;
         n371TBT02_CRF_INPUT_LEVEL = BC000P3_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A556TBT02_LOCK_FLG = BC000P3_A556TBT02_LOCK_FLG[0] ;
         n556TBT02_LOCK_FLG = BC000P3_n556TBT02_LOCK_FLG[0] ;
         A557TBT02_LOCK_DATETIME = BC000P3_A557TBT02_LOCK_DATETIME[0] ;
         n557TBT02_LOCK_DATETIME = BC000P3_n557TBT02_LOCK_DATETIME[0] ;
         A558TBT02_LOCK_USER_ID = BC000P3_A558TBT02_LOCK_USER_ID[0] ;
         n558TBT02_LOCK_USER_ID = BC000P3_n558TBT02_LOCK_USER_ID[0] ;
         A559TBT02_LOCK_AUTH_CD = BC000P3_A559TBT02_LOCK_AUTH_CD[0] ;
         n559TBT02_LOCK_AUTH_CD = BC000P3_n559TBT02_LOCK_AUTH_CD[0] ;
         A560TBT02_UPLOAD_DATETIME = BC000P3_A560TBT02_UPLOAD_DATETIME[0] ;
         n560TBT02_UPLOAD_DATETIME = BC000P3_n560TBT02_UPLOAD_DATETIME[0] ;
         A561TBT02_UPLOAD_USER_ID = BC000P3_A561TBT02_UPLOAD_USER_ID[0] ;
         n561TBT02_UPLOAD_USER_ID = BC000P3_n561TBT02_UPLOAD_USER_ID[0] ;
         A562TBT02_UPLOAD_AUTH_CD = BC000P3_A562TBT02_UPLOAD_AUTH_CD[0] ;
         n562TBT02_UPLOAD_AUTH_CD = BC000P3_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A563TBT02_DM_ARRIVAL_FLG = BC000P3_A563TBT02_DM_ARRIVAL_FLG[0] ;
         n563TBT02_DM_ARRIVAL_FLG = BC000P3_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = BC000P3_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = BC000P3_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A565TBT02_APPROVAL_FLG = BC000P3_A565TBT02_APPROVAL_FLG[0] ;
         n565TBT02_APPROVAL_FLG = BC000P3_n565TBT02_APPROVAL_FLG[0] ;
         A566TBT02_APPROVAL_DATETIME = BC000P3_A566TBT02_APPROVAL_DATETIME[0] ;
         n566TBT02_APPROVAL_DATETIME = BC000P3_n566TBT02_APPROVAL_DATETIME[0] ;
         A567TBT02_APPROVAL_USER_ID = BC000P3_A567TBT02_APPROVAL_USER_ID[0] ;
         n567TBT02_APPROVAL_USER_ID = BC000P3_n567TBT02_APPROVAL_USER_ID[0] ;
         A568TBT02_APPROVAL_AUTH_CD = BC000P3_A568TBT02_APPROVAL_AUTH_CD[0] ;
         n568TBT02_APPROVAL_AUTH_CD = BC000P3_n568TBT02_APPROVAL_AUTH_CD[0] ;
         A569TBT02_INPUT_END_FLG = BC000P3_A569TBT02_INPUT_END_FLG[0] ;
         n569TBT02_INPUT_END_FLG = BC000P3_n569TBT02_INPUT_END_FLG[0] ;
         A570TBT02_INPUT_END_DATETIME = BC000P3_A570TBT02_INPUT_END_DATETIME[0] ;
         n570TBT02_INPUT_END_DATETIME = BC000P3_n570TBT02_INPUT_END_DATETIME[0] ;
         A571TBT02_INPUT_END_USER_ID = BC000P3_A571TBT02_INPUT_END_USER_ID[0] ;
         n571TBT02_INPUT_END_USER_ID = BC000P3_n571TBT02_INPUT_END_USER_ID[0] ;
         A572TBT02_INPUT_END_AUTH_CD = BC000P3_A572TBT02_INPUT_END_AUTH_CD[0] ;
         n572TBT02_INPUT_END_AUTH_CD = BC000P3_n572TBT02_INPUT_END_AUTH_CD[0] ;
         A295TBT02_DEL_FLG = BC000P3_A295TBT02_DEL_FLG[0] ;
         n295TBT02_DEL_FLG = BC000P3_n295TBT02_DEL_FLG[0] ;
         A298TBT02_CRT_PROG_NM = BC000P3_A298TBT02_CRT_PROG_NM[0] ;
         n298TBT02_CRT_PROG_NM = BC000P3_n298TBT02_CRT_PROG_NM[0] ;
         A301TBT02_UPD_PROG_NM = BC000P3_A301TBT02_UPD_PROG_NM[0] ;
         n301TBT02_UPD_PROG_NM = BC000P3_n301TBT02_UPD_PROG_NM[0] ;
         A292TBT02_STUDY_ID = BC000P3_A292TBT02_STUDY_ID[0] ;
         A293TBT02_SUBJECT_ID = BC000P3_A293TBT02_SUBJECT_ID[0] ;
         O302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
         n302TBT02_UPD_CNT = false ;
         Z292TBT02_STUDY_ID = A292TBT02_STUDY_ID ;
         Z293TBT02_SUBJECT_ID = A293TBT02_SUBJECT_ID ;
         Z294TBT02_CRF_ID = A294TBT02_CRF_ID ;
         sMode24 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0P24( ) ;
         Gx_mode = sMode24 ;
      }
      else
      {
         RcdFound24 = (short)(0) ;
         initializeNonKey0P24( ) ;
         sMode24 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode24 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0P24( ) ;
      if ( RcdFound24 == 0 )
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
      confirm_0P0( ) ;
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

   public void checkOptimisticConcurrency0P24( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000P2 */
         pr_default.execute(0, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT02_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z296TBT02_CRT_DATETIME.equals( BC000P2_A296TBT02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z297TBT02_CRT_USER_ID, BC000P2_A297TBT02_CRT_USER_ID[0]) != 0 ) || !( Z299TBT02_UPD_DATETIME.equals( BC000P2_A299TBT02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z300TBT02_UPD_USER_ID, BC000P2_A300TBT02_UPD_USER_ID[0]) != 0 ) || ( Z302TBT02_UPD_CNT != BC000P2_A302TBT02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z370TBT02_CRF_LATEST_VERSION != BC000P2_A370TBT02_CRF_LATEST_VERSION[0] ) || ( Z371TBT02_CRF_INPUT_LEVEL != BC000P2_A371TBT02_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z556TBT02_LOCK_FLG, BC000P2_A556TBT02_LOCK_FLG[0]) != 0 ) || !( Z557TBT02_LOCK_DATETIME.equals( BC000P2_A557TBT02_LOCK_DATETIME[0] ) ) || ( GXutil.strcmp(Z558TBT02_LOCK_USER_ID, BC000P2_A558TBT02_LOCK_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z559TBT02_LOCK_AUTH_CD, BC000P2_A559TBT02_LOCK_AUTH_CD[0]) != 0 ) || !( Z560TBT02_UPLOAD_DATETIME.equals( BC000P2_A560TBT02_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z561TBT02_UPLOAD_USER_ID, BC000P2_A561TBT02_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z562TBT02_UPLOAD_AUTH_CD, BC000P2_A562TBT02_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z563TBT02_DM_ARRIVAL_FLG, BC000P2_A563TBT02_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z564TBT02_DM_ARRIVAL_DATETIME.equals( BC000P2_A564TBT02_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z565TBT02_APPROVAL_FLG, BC000P2_A565TBT02_APPROVAL_FLG[0]) != 0 ) || !( Z566TBT02_APPROVAL_DATETIME.equals( BC000P2_A566TBT02_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z567TBT02_APPROVAL_USER_ID, BC000P2_A567TBT02_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z568TBT02_APPROVAL_AUTH_CD, BC000P2_A568TBT02_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z569TBT02_INPUT_END_FLG, BC000P2_A569TBT02_INPUT_END_FLG[0]) != 0 ) || !( Z570TBT02_INPUT_END_DATETIME.equals( BC000P2_A570TBT02_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z571TBT02_INPUT_END_USER_ID, BC000P2_A571TBT02_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z572TBT02_INPUT_END_AUTH_CD, BC000P2_A572TBT02_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z295TBT02_DEL_FLG, BC000P2_A295TBT02_DEL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z298TBT02_CRT_PROG_NM, BC000P2_A298TBT02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z301TBT02_UPD_PROG_NM, BC000P2_A301TBT02_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT02_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0P24( )
   {
      beforeValidate0P24( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P24( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0P24( 0) ;
         checkOptimisticConcurrency0P24( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P24( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0P24( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000P7 */
                  pr_default.execute(5, new Object[] {new Short(A294TBT02_CRF_ID), new Boolean(n296TBT02_CRT_DATETIME), A296TBT02_CRT_DATETIME, new Boolean(n297TBT02_CRT_USER_ID), A297TBT02_CRT_USER_ID, new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Boolean(n370TBT02_CRF_LATEST_VERSION), new Short(A370TBT02_CRF_LATEST_VERSION), new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n556TBT02_LOCK_FLG), A556TBT02_LOCK_FLG, new Boolean(n557TBT02_LOCK_DATETIME), A557TBT02_LOCK_DATETIME, new Boolean(n558TBT02_LOCK_USER_ID), A558TBT02_LOCK_USER_ID, new Boolean(n559TBT02_LOCK_AUTH_CD), A559TBT02_LOCK_AUTH_CD, new Boolean(n560TBT02_UPLOAD_DATETIME), A560TBT02_UPLOAD_DATETIME, new Boolean(n561TBT02_UPLOAD_USER_ID), A561TBT02_UPLOAD_USER_ID, new Boolean(n562TBT02_UPLOAD_AUTH_CD), A562TBT02_UPLOAD_AUTH_CD, new Boolean(n563TBT02_DM_ARRIVAL_FLG), A563TBT02_DM_ARRIVAL_FLG, new Boolean(n564TBT02_DM_ARRIVAL_DATETIME), A564TBT02_DM_ARRIVAL_DATETIME, new Boolean(n565TBT02_APPROVAL_FLG), A565TBT02_APPROVAL_FLG, new Boolean(n566TBT02_APPROVAL_DATETIME), A566TBT02_APPROVAL_DATETIME, new Boolean(n567TBT02_APPROVAL_USER_ID), A567TBT02_APPROVAL_USER_ID, new Boolean(n568TBT02_APPROVAL_AUTH_CD), A568TBT02_APPROVAL_AUTH_CD, new Boolean(n569TBT02_INPUT_END_FLG), A569TBT02_INPUT_END_FLG, new Boolean(n570TBT02_INPUT_END_DATETIME), A570TBT02_INPUT_END_DATETIME, new Boolean(n571TBT02_INPUT_END_USER_ID), A571TBT02_INPUT_END_USER_ID, new Boolean(n572TBT02_INPUT_END_AUTH_CD), A572TBT02_INPUT_END_AUTH_CD, new Boolean(n295TBT02_DEL_FLG), A295TBT02_DEL_FLG, new Boolean(n298TBT02_CRT_PROG_NM), A298TBT02_CRT_PROG_NM, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID)});
                  if ( (pr_default.getStatus(5) == 1) )
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
            load0P24( ) ;
         }
         endLevel0P24( ) ;
      }
      closeExtendedTableCursors0P24( ) ;
   }

   public void update0P24( )
   {
      beforeValidate0P24( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P24( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P24( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P24( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0P24( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000P8 */
                  pr_default.execute(6, new Object[] {new Boolean(n296TBT02_CRT_DATETIME), A296TBT02_CRT_DATETIME, new Boolean(n297TBT02_CRT_USER_ID), A297TBT02_CRT_USER_ID, new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Boolean(n370TBT02_CRF_LATEST_VERSION), new Short(A370TBT02_CRF_LATEST_VERSION), new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n556TBT02_LOCK_FLG), A556TBT02_LOCK_FLG, new Boolean(n557TBT02_LOCK_DATETIME), A557TBT02_LOCK_DATETIME, new Boolean(n558TBT02_LOCK_USER_ID), A558TBT02_LOCK_USER_ID, new Boolean(n559TBT02_LOCK_AUTH_CD), A559TBT02_LOCK_AUTH_CD, new Boolean(n560TBT02_UPLOAD_DATETIME), A560TBT02_UPLOAD_DATETIME, new Boolean(n561TBT02_UPLOAD_USER_ID), A561TBT02_UPLOAD_USER_ID, new Boolean(n562TBT02_UPLOAD_AUTH_CD), A562TBT02_UPLOAD_AUTH_CD, new Boolean(n563TBT02_DM_ARRIVAL_FLG), A563TBT02_DM_ARRIVAL_FLG, new Boolean(n564TBT02_DM_ARRIVAL_DATETIME), A564TBT02_DM_ARRIVAL_DATETIME, new Boolean(n565TBT02_APPROVAL_FLG), A565TBT02_APPROVAL_FLG, new Boolean(n566TBT02_APPROVAL_DATETIME), A566TBT02_APPROVAL_DATETIME, new Boolean(n567TBT02_APPROVAL_USER_ID), A567TBT02_APPROVAL_USER_ID, new Boolean(n568TBT02_APPROVAL_AUTH_CD), A568TBT02_APPROVAL_AUTH_CD, new Boolean(n569TBT02_INPUT_END_FLG), A569TBT02_INPUT_END_FLG, new Boolean(n570TBT02_INPUT_END_DATETIME), A570TBT02_INPUT_END_DATETIME, new Boolean(n571TBT02_INPUT_END_USER_ID), A571TBT02_INPUT_END_USER_ID, new Boolean(n572TBT02_INPUT_END_AUTH_CD), A572TBT02_INPUT_END_AUTH_CD, new Boolean(n295TBT02_DEL_FLG), A295TBT02_DEL_FLG, new Boolean(n298TBT02_CRT_PROG_NM), A298TBT02_CRT_PROG_NM, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT02_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0P24( ) ;
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
         endLevel0P24( ) ;
      }
      closeExtendedTableCursors0P24( ) ;
   }

   public void deferredUpdate0P24( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0P24( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P24( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0P24( ) ;
         afterConfirm0P24( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0P24( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000P9 */
               pr_default.execute(7, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
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
      sMode24 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0P24( ) ;
      Gx_mode = sMode24 ;
   }

   public void onDeleteControls0P24( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT02_CRF_BC" ;
      }
   }

   public void endLevel0P24( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0P24( ) ;
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

   public void scanKeyStart0P24( )
   {
      /* Using cursor BC000P10 */
      pr_default.execute(8, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
      RcdFound24 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A294TBT02_CRF_ID = BC000P10_A294TBT02_CRF_ID[0] ;
         A296TBT02_CRT_DATETIME = BC000P10_A296TBT02_CRT_DATETIME[0] ;
         n296TBT02_CRT_DATETIME = BC000P10_n296TBT02_CRT_DATETIME[0] ;
         A297TBT02_CRT_USER_ID = BC000P10_A297TBT02_CRT_USER_ID[0] ;
         n297TBT02_CRT_USER_ID = BC000P10_n297TBT02_CRT_USER_ID[0] ;
         A299TBT02_UPD_DATETIME = BC000P10_A299TBT02_UPD_DATETIME[0] ;
         n299TBT02_UPD_DATETIME = BC000P10_n299TBT02_UPD_DATETIME[0] ;
         A300TBT02_UPD_USER_ID = BC000P10_A300TBT02_UPD_USER_ID[0] ;
         n300TBT02_UPD_USER_ID = BC000P10_n300TBT02_UPD_USER_ID[0] ;
         A302TBT02_UPD_CNT = BC000P10_A302TBT02_UPD_CNT[0] ;
         n302TBT02_UPD_CNT = BC000P10_n302TBT02_UPD_CNT[0] ;
         A370TBT02_CRF_LATEST_VERSION = BC000P10_A370TBT02_CRF_LATEST_VERSION[0] ;
         n370TBT02_CRF_LATEST_VERSION = BC000P10_n370TBT02_CRF_LATEST_VERSION[0] ;
         A371TBT02_CRF_INPUT_LEVEL = BC000P10_A371TBT02_CRF_INPUT_LEVEL[0] ;
         n371TBT02_CRF_INPUT_LEVEL = BC000P10_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A556TBT02_LOCK_FLG = BC000P10_A556TBT02_LOCK_FLG[0] ;
         n556TBT02_LOCK_FLG = BC000P10_n556TBT02_LOCK_FLG[0] ;
         A557TBT02_LOCK_DATETIME = BC000P10_A557TBT02_LOCK_DATETIME[0] ;
         n557TBT02_LOCK_DATETIME = BC000P10_n557TBT02_LOCK_DATETIME[0] ;
         A558TBT02_LOCK_USER_ID = BC000P10_A558TBT02_LOCK_USER_ID[0] ;
         n558TBT02_LOCK_USER_ID = BC000P10_n558TBT02_LOCK_USER_ID[0] ;
         A559TBT02_LOCK_AUTH_CD = BC000P10_A559TBT02_LOCK_AUTH_CD[0] ;
         n559TBT02_LOCK_AUTH_CD = BC000P10_n559TBT02_LOCK_AUTH_CD[0] ;
         A560TBT02_UPLOAD_DATETIME = BC000P10_A560TBT02_UPLOAD_DATETIME[0] ;
         n560TBT02_UPLOAD_DATETIME = BC000P10_n560TBT02_UPLOAD_DATETIME[0] ;
         A561TBT02_UPLOAD_USER_ID = BC000P10_A561TBT02_UPLOAD_USER_ID[0] ;
         n561TBT02_UPLOAD_USER_ID = BC000P10_n561TBT02_UPLOAD_USER_ID[0] ;
         A562TBT02_UPLOAD_AUTH_CD = BC000P10_A562TBT02_UPLOAD_AUTH_CD[0] ;
         n562TBT02_UPLOAD_AUTH_CD = BC000P10_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A563TBT02_DM_ARRIVAL_FLG = BC000P10_A563TBT02_DM_ARRIVAL_FLG[0] ;
         n563TBT02_DM_ARRIVAL_FLG = BC000P10_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = BC000P10_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = BC000P10_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A565TBT02_APPROVAL_FLG = BC000P10_A565TBT02_APPROVAL_FLG[0] ;
         n565TBT02_APPROVAL_FLG = BC000P10_n565TBT02_APPROVAL_FLG[0] ;
         A566TBT02_APPROVAL_DATETIME = BC000P10_A566TBT02_APPROVAL_DATETIME[0] ;
         n566TBT02_APPROVAL_DATETIME = BC000P10_n566TBT02_APPROVAL_DATETIME[0] ;
         A567TBT02_APPROVAL_USER_ID = BC000P10_A567TBT02_APPROVAL_USER_ID[0] ;
         n567TBT02_APPROVAL_USER_ID = BC000P10_n567TBT02_APPROVAL_USER_ID[0] ;
         A568TBT02_APPROVAL_AUTH_CD = BC000P10_A568TBT02_APPROVAL_AUTH_CD[0] ;
         n568TBT02_APPROVAL_AUTH_CD = BC000P10_n568TBT02_APPROVAL_AUTH_CD[0] ;
         A569TBT02_INPUT_END_FLG = BC000P10_A569TBT02_INPUT_END_FLG[0] ;
         n569TBT02_INPUT_END_FLG = BC000P10_n569TBT02_INPUT_END_FLG[0] ;
         A570TBT02_INPUT_END_DATETIME = BC000P10_A570TBT02_INPUT_END_DATETIME[0] ;
         n570TBT02_INPUT_END_DATETIME = BC000P10_n570TBT02_INPUT_END_DATETIME[0] ;
         A571TBT02_INPUT_END_USER_ID = BC000P10_A571TBT02_INPUT_END_USER_ID[0] ;
         n571TBT02_INPUT_END_USER_ID = BC000P10_n571TBT02_INPUT_END_USER_ID[0] ;
         A572TBT02_INPUT_END_AUTH_CD = BC000P10_A572TBT02_INPUT_END_AUTH_CD[0] ;
         n572TBT02_INPUT_END_AUTH_CD = BC000P10_n572TBT02_INPUT_END_AUTH_CD[0] ;
         A295TBT02_DEL_FLG = BC000P10_A295TBT02_DEL_FLG[0] ;
         n295TBT02_DEL_FLG = BC000P10_n295TBT02_DEL_FLG[0] ;
         A298TBT02_CRT_PROG_NM = BC000P10_A298TBT02_CRT_PROG_NM[0] ;
         n298TBT02_CRT_PROG_NM = BC000P10_n298TBT02_CRT_PROG_NM[0] ;
         A301TBT02_UPD_PROG_NM = BC000P10_A301TBT02_UPD_PROG_NM[0] ;
         n301TBT02_UPD_PROG_NM = BC000P10_n301TBT02_UPD_PROG_NM[0] ;
         A292TBT02_STUDY_ID = BC000P10_A292TBT02_STUDY_ID[0] ;
         A293TBT02_SUBJECT_ID = BC000P10_A293TBT02_SUBJECT_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0P24( )
   {
      pr_default.readNext(8);
      RcdFound24 = (short)(0) ;
      scanKeyLoad0P24( ) ;
   }

   public void scanKeyLoad0P24( )
   {
      sMode24 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A294TBT02_CRF_ID = BC000P10_A294TBT02_CRF_ID[0] ;
         A296TBT02_CRT_DATETIME = BC000P10_A296TBT02_CRT_DATETIME[0] ;
         n296TBT02_CRT_DATETIME = BC000P10_n296TBT02_CRT_DATETIME[0] ;
         A297TBT02_CRT_USER_ID = BC000P10_A297TBT02_CRT_USER_ID[0] ;
         n297TBT02_CRT_USER_ID = BC000P10_n297TBT02_CRT_USER_ID[0] ;
         A299TBT02_UPD_DATETIME = BC000P10_A299TBT02_UPD_DATETIME[0] ;
         n299TBT02_UPD_DATETIME = BC000P10_n299TBT02_UPD_DATETIME[0] ;
         A300TBT02_UPD_USER_ID = BC000P10_A300TBT02_UPD_USER_ID[0] ;
         n300TBT02_UPD_USER_ID = BC000P10_n300TBT02_UPD_USER_ID[0] ;
         A302TBT02_UPD_CNT = BC000P10_A302TBT02_UPD_CNT[0] ;
         n302TBT02_UPD_CNT = BC000P10_n302TBT02_UPD_CNT[0] ;
         A370TBT02_CRF_LATEST_VERSION = BC000P10_A370TBT02_CRF_LATEST_VERSION[0] ;
         n370TBT02_CRF_LATEST_VERSION = BC000P10_n370TBT02_CRF_LATEST_VERSION[0] ;
         A371TBT02_CRF_INPUT_LEVEL = BC000P10_A371TBT02_CRF_INPUT_LEVEL[0] ;
         n371TBT02_CRF_INPUT_LEVEL = BC000P10_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A556TBT02_LOCK_FLG = BC000P10_A556TBT02_LOCK_FLG[0] ;
         n556TBT02_LOCK_FLG = BC000P10_n556TBT02_LOCK_FLG[0] ;
         A557TBT02_LOCK_DATETIME = BC000P10_A557TBT02_LOCK_DATETIME[0] ;
         n557TBT02_LOCK_DATETIME = BC000P10_n557TBT02_LOCK_DATETIME[0] ;
         A558TBT02_LOCK_USER_ID = BC000P10_A558TBT02_LOCK_USER_ID[0] ;
         n558TBT02_LOCK_USER_ID = BC000P10_n558TBT02_LOCK_USER_ID[0] ;
         A559TBT02_LOCK_AUTH_CD = BC000P10_A559TBT02_LOCK_AUTH_CD[0] ;
         n559TBT02_LOCK_AUTH_CD = BC000P10_n559TBT02_LOCK_AUTH_CD[0] ;
         A560TBT02_UPLOAD_DATETIME = BC000P10_A560TBT02_UPLOAD_DATETIME[0] ;
         n560TBT02_UPLOAD_DATETIME = BC000P10_n560TBT02_UPLOAD_DATETIME[0] ;
         A561TBT02_UPLOAD_USER_ID = BC000P10_A561TBT02_UPLOAD_USER_ID[0] ;
         n561TBT02_UPLOAD_USER_ID = BC000P10_n561TBT02_UPLOAD_USER_ID[0] ;
         A562TBT02_UPLOAD_AUTH_CD = BC000P10_A562TBT02_UPLOAD_AUTH_CD[0] ;
         n562TBT02_UPLOAD_AUTH_CD = BC000P10_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A563TBT02_DM_ARRIVAL_FLG = BC000P10_A563TBT02_DM_ARRIVAL_FLG[0] ;
         n563TBT02_DM_ARRIVAL_FLG = BC000P10_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = BC000P10_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = BC000P10_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A565TBT02_APPROVAL_FLG = BC000P10_A565TBT02_APPROVAL_FLG[0] ;
         n565TBT02_APPROVAL_FLG = BC000P10_n565TBT02_APPROVAL_FLG[0] ;
         A566TBT02_APPROVAL_DATETIME = BC000P10_A566TBT02_APPROVAL_DATETIME[0] ;
         n566TBT02_APPROVAL_DATETIME = BC000P10_n566TBT02_APPROVAL_DATETIME[0] ;
         A567TBT02_APPROVAL_USER_ID = BC000P10_A567TBT02_APPROVAL_USER_ID[0] ;
         n567TBT02_APPROVAL_USER_ID = BC000P10_n567TBT02_APPROVAL_USER_ID[0] ;
         A568TBT02_APPROVAL_AUTH_CD = BC000P10_A568TBT02_APPROVAL_AUTH_CD[0] ;
         n568TBT02_APPROVAL_AUTH_CD = BC000P10_n568TBT02_APPROVAL_AUTH_CD[0] ;
         A569TBT02_INPUT_END_FLG = BC000P10_A569TBT02_INPUT_END_FLG[0] ;
         n569TBT02_INPUT_END_FLG = BC000P10_n569TBT02_INPUT_END_FLG[0] ;
         A570TBT02_INPUT_END_DATETIME = BC000P10_A570TBT02_INPUT_END_DATETIME[0] ;
         n570TBT02_INPUT_END_DATETIME = BC000P10_n570TBT02_INPUT_END_DATETIME[0] ;
         A571TBT02_INPUT_END_USER_ID = BC000P10_A571TBT02_INPUT_END_USER_ID[0] ;
         n571TBT02_INPUT_END_USER_ID = BC000P10_n571TBT02_INPUT_END_USER_ID[0] ;
         A572TBT02_INPUT_END_AUTH_CD = BC000P10_A572TBT02_INPUT_END_AUTH_CD[0] ;
         n572TBT02_INPUT_END_AUTH_CD = BC000P10_n572TBT02_INPUT_END_AUTH_CD[0] ;
         A295TBT02_DEL_FLG = BC000P10_A295TBT02_DEL_FLG[0] ;
         n295TBT02_DEL_FLG = BC000P10_n295TBT02_DEL_FLG[0] ;
         A298TBT02_CRT_PROG_NM = BC000P10_A298TBT02_CRT_PROG_NM[0] ;
         n298TBT02_CRT_PROG_NM = BC000P10_n298TBT02_CRT_PROG_NM[0] ;
         A301TBT02_UPD_PROG_NM = BC000P10_A301TBT02_UPD_PROG_NM[0] ;
         n301TBT02_UPD_PROG_NM = BC000P10_n301TBT02_UPD_PROG_NM[0] ;
         A292TBT02_STUDY_ID = BC000P10_A292TBT02_STUDY_ID[0] ;
         A293TBT02_SUBJECT_ID = BC000P10_A293TBT02_SUBJECT_ID[0] ;
      }
      Gx_mode = sMode24 ;
   }

   public void scanKeyEnd0P24( )
   {
      pr_default.close(8);
   }

   public void afterConfirm0P24( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0P24( )
   {
      /* Before Insert Rules */
      A296TBT02_CRT_DATETIME = GXutil.now( ) ;
      n296TBT02_CRT_DATETIME = false ;
      GXt_char1 = A297TBT02_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A297TBT02_CRT_USER_ID = GXt_char1 ;
      n297TBT02_CRT_USER_ID = false ;
      A299TBT02_UPD_DATETIME = GXutil.now( ) ;
      n299TBT02_UPD_DATETIME = false ;
      GXt_char1 = A300TBT02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A300TBT02_UPD_USER_ID = GXt_char1 ;
      n300TBT02_UPD_USER_ID = false ;
      A302TBT02_UPD_CNT = (long)(O302TBT02_UPD_CNT+1) ;
      n302TBT02_UPD_CNT = false ;
   }

   public void beforeUpdate0P24( )
   {
      /* Before Update Rules */
      A299TBT02_UPD_DATETIME = GXutil.now( ) ;
      n299TBT02_UPD_DATETIME = false ;
      GXt_char1 = A300TBT02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A300TBT02_UPD_USER_ID = GXt_char1 ;
      n300TBT02_UPD_USER_ID = false ;
      A302TBT02_UPD_CNT = (long)(O302TBT02_UPD_CNT+1) ;
      n302TBT02_UPD_CNT = false ;
   }

   public void beforeDelete0P24( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0P24( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0P24( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0P24( )
   {
   }

   public void addRow0P24( )
   {
      VarsToRow24( bcTBT02_CRF) ;
   }

   public void readRow0P24( )
   {
      RowToVars24( bcTBT02_CRF, 1) ;
   }

   public void initializeNonKey0P24( )
   {
      A296TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n296TBT02_CRT_DATETIME = false ;
      A297TBT02_CRT_USER_ID = "" ;
      n297TBT02_CRT_USER_ID = false ;
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n299TBT02_UPD_DATETIME = false ;
      A300TBT02_UPD_USER_ID = "" ;
      n300TBT02_UPD_USER_ID = false ;
      A302TBT02_UPD_CNT = 0 ;
      n302TBT02_UPD_CNT = false ;
      A370TBT02_CRF_LATEST_VERSION = (short)(0) ;
      n370TBT02_CRF_LATEST_VERSION = false ;
      A371TBT02_CRF_INPUT_LEVEL = (byte)(0) ;
      n371TBT02_CRF_INPUT_LEVEL = false ;
      A556TBT02_LOCK_FLG = "" ;
      n556TBT02_LOCK_FLG = false ;
      A557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n557TBT02_LOCK_DATETIME = false ;
      A558TBT02_LOCK_USER_ID = "" ;
      n558TBT02_LOCK_USER_ID = false ;
      A559TBT02_LOCK_AUTH_CD = "" ;
      n559TBT02_LOCK_AUTH_CD = false ;
      A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n560TBT02_UPLOAD_DATETIME = false ;
      A561TBT02_UPLOAD_USER_ID = "" ;
      n561TBT02_UPLOAD_USER_ID = false ;
      A562TBT02_UPLOAD_AUTH_CD = "" ;
      n562TBT02_UPLOAD_AUTH_CD = false ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      n563TBT02_DM_ARRIVAL_FLG = false ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n564TBT02_DM_ARRIVAL_DATETIME = false ;
      A565TBT02_APPROVAL_FLG = "" ;
      n565TBT02_APPROVAL_FLG = false ;
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n566TBT02_APPROVAL_DATETIME = false ;
      A567TBT02_APPROVAL_USER_ID = "" ;
      n567TBT02_APPROVAL_USER_ID = false ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      n568TBT02_APPROVAL_AUTH_CD = false ;
      A569TBT02_INPUT_END_FLG = "" ;
      n569TBT02_INPUT_END_FLG = false ;
      A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n570TBT02_INPUT_END_DATETIME = false ;
      A571TBT02_INPUT_END_USER_ID = "" ;
      n571TBT02_INPUT_END_USER_ID = false ;
      A572TBT02_INPUT_END_AUTH_CD = "" ;
      n572TBT02_INPUT_END_AUTH_CD = false ;
      A295TBT02_DEL_FLG = "" ;
      n295TBT02_DEL_FLG = false ;
      A298TBT02_CRT_PROG_NM = "" ;
      n298TBT02_CRT_PROG_NM = false ;
      A301TBT02_UPD_PROG_NM = "" ;
      n301TBT02_UPD_PROG_NM = false ;
      O302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
      n302TBT02_UPD_CNT = false ;
   }

   public void initAll0P24( )
   {
      A292TBT02_STUDY_ID = 0 ;
      A293TBT02_SUBJECT_ID = 0 ;
      A294TBT02_CRF_ID = (short)(0) ;
      initializeNonKey0P24( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow24( SdtTBT02_CRF obj24 )
   {
      obj24.setgxTv_SdtTBT02_CRF_Mode( Gx_mode );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime( A296TBT02_CRT_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id( A297TBT02_CRT_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime( A299TBT02_UPD_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id( A300TBT02_UPD_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt( A302TBT02_UPD_CNT );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( A370TBT02_CRF_LATEST_VERSION );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( A371TBT02_CRF_INPUT_LEVEL );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg( A556TBT02_LOCK_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime( A557TBT02_LOCK_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id( A558TBT02_LOCK_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd( A559TBT02_LOCK_AUTH_CD );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime( A560TBT02_UPLOAD_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id( A561TBT02_UPLOAD_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd( A562TBT02_UPLOAD_AUTH_CD );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( A563TBT02_DM_ARRIVAL_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime( A564TBT02_DM_ARRIVAL_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg( A565TBT02_APPROVAL_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime( A566TBT02_APPROVAL_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id( A567TBT02_APPROVAL_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd( A568TBT02_APPROVAL_AUTH_CD );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( A569TBT02_INPUT_END_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime( A570TBT02_INPUT_END_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id( A571TBT02_INPUT_END_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd( A572TBT02_INPUT_END_AUTH_CD );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_del_flg( A295TBT02_DEL_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( A298TBT02_CRT_PROG_NM );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( A301TBT02_UPD_PROG_NM );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_study_id( A292TBT02_STUDY_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( A293TBT02_SUBJECT_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( A294TBT02_CRF_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_study_id_Z( Z292TBT02_STUDY_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z( Z293TBT02_SUBJECT_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z( Z294TBT02_CRF_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z( Z370TBT02_CRF_LATEST_VERSION );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z( Z371TBT02_CRF_INPUT_LEVEL );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z( Z556TBT02_LOCK_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z( Z557TBT02_LOCK_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z( Z558TBT02_LOCK_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z( Z559TBT02_LOCK_AUTH_CD );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z( Z560TBT02_UPLOAD_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z( Z561TBT02_UPLOAD_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z( Z562TBT02_UPLOAD_AUTH_CD );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z( Z563TBT02_DM_ARRIVAL_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z( Z564TBT02_DM_ARRIVAL_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z( Z565TBT02_APPROVAL_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z( Z566TBT02_APPROVAL_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z( Z567TBT02_APPROVAL_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z( Z568TBT02_APPROVAL_AUTH_CD );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z( Z569TBT02_INPUT_END_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z( Z570TBT02_INPUT_END_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z( Z571TBT02_INPUT_END_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z( Z572TBT02_INPUT_END_AUTH_CD );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z( Z295TBT02_DEL_FLG );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z( Z296TBT02_CRT_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z( Z297TBT02_CRT_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z( Z298TBT02_CRT_PROG_NM );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z( Z299TBT02_UPD_DATETIME );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z( Z300TBT02_UPD_USER_ID );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z( Z301TBT02_UPD_PROG_NM );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z( Z302TBT02_UPD_CNT );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N( (byte)((byte)((n370TBT02_CRF_LATEST_VERSION)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N( (byte)((byte)((n371TBT02_CRF_INPUT_LEVEL)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N( (byte)((byte)((n556TBT02_LOCK_FLG)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N( (byte)((byte)((n557TBT02_LOCK_DATETIME)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N( (byte)((byte)((n558TBT02_LOCK_USER_ID)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N( (byte)((byte)((n559TBT02_LOCK_AUTH_CD)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N( (byte)((byte)((n560TBT02_UPLOAD_DATETIME)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N( (byte)((byte)((n561TBT02_UPLOAD_USER_ID)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N( (byte)((byte)((n562TBT02_UPLOAD_AUTH_CD)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N( (byte)((byte)((n563TBT02_DM_ARRIVAL_FLG)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N( (byte)((byte)((n564TBT02_DM_ARRIVAL_DATETIME)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N( (byte)((byte)((n565TBT02_APPROVAL_FLG)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N( (byte)((byte)((n566TBT02_APPROVAL_DATETIME)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N( (byte)((byte)((n567TBT02_APPROVAL_USER_ID)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N( (byte)((byte)((n568TBT02_APPROVAL_AUTH_CD)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N( (byte)((byte)((n569TBT02_INPUT_END_FLG)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N( (byte)((byte)((n570TBT02_INPUT_END_DATETIME)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N( (byte)((byte)((n571TBT02_INPUT_END_USER_ID)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N( (byte)((byte)((n572TBT02_INPUT_END_AUTH_CD)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_del_flg_N( (byte)((byte)((n295TBT02_DEL_FLG)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N( (byte)((byte)((n296TBT02_CRT_DATETIME)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N( (byte)((byte)((n297TBT02_CRT_USER_ID)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N( (byte)((byte)((n298TBT02_CRT_PROG_NM)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N( (byte)((byte)((n299TBT02_UPD_DATETIME)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N( (byte)((byte)((n300TBT02_UPD_USER_ID)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N( (byte)((byte)((n301TBT02_UPD_PROG_NM)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N( (byte)((byte)((n302TBT02_UPD_CNT)?1:0)) );
      obj24.setgxTv_SdtTBT02_CRF_Mode( Gx_mode );
   }

   public void RowToVars24( SdtTBT02_CRF obj24 ,
                            int forceLoad )
   {
      Gx_mode = obj24.getgxTv_SdtTBT02_CRF_Mode() ;
      A296TBT02_CRT_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime() ;
      n296TBT02_CRT_DATETIME = false ;
      A297TBT02_CRT_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id() ;
      n297TBT02_CRT_USER_ID = false ;
      A299TBT02_UPD_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime() ;
      n299TBT02_UPD_DATETIME = false ;
      A300TBT02_UPD_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id() ;
      n300TBT02_UPD_USER_ID = false ;
      A302TBT02_UPD_CNT = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt() ;
      n302TBT02_UPD_CNT = false ;
      A370TBT02_CRF_LATEST_VERSION = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() ;
      n370TBT02_CRF_LATEST_VERSION = false ;
      A371TBT02_CRF_INPUT_LEVEL = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level() ;
      n371TBT02_CRF_INPUT_LEVEL = false ;
      A556TBT02_LOCK_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_flg() ;
      n556TBT02_LOCK_FLG = false ;
      A557TBT02_LOCK_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime() ;
      n557TBT02_LOCK_DATETIME = false ;
      A558TBT02_LOCK_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id() ;
      n558TBT02_LOCK_USER_ID = false ;
      A559TBT02_LOCK_AUTH_CD = obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd() ;
      n559TBT02_LOCK_AUTH_CD = false ;
      A560TBT02_UPLOAD_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime() ;
      n560TBT02_UPLOAD_DATETIME = false ;
      A561TBT02_UPLOAD_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id() ;
      n561TBT02_UPLOAD_USER_ID = false ;
      A562TBT02_UPLOAD_AUTH_CD = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd() ;
      n562TBT02_UPLOAD_AUTH_CD = false ;
      A563TBT02_DM_ARRIVAL_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg() ;
      n563TBT02_DM_ARRIVAL_FLG = false ;
      A564TBT02_DM_ARRIVAL_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime() ;
      n564TBT02_DM_ARRIVAL_DATETIME = false ;
      A565TBT02_APPROVAL_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_flg() ;
      n565TBT02_APPROVAL_FLG = false ;
      A566TBT02_APPROVAL_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime() ;
      n566TBT02_APPROVAL_DATETIME = false ;
      A567TBT02_APPROVAL_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id() ;
      n567TBT02_APPROVAL_USER_ID = false ;
      A568TBT02_APPROVAL_AUTH_CD = obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd() ;
      n568TBT02_APPROVAL_AUTH_CD = false ;
      A569TBT02_INPUT_END_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg() ;
      n569TBT02_INPUT_END_FLG = false ;
      A570TBT02_INPUT_END_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime() ;
      n570TBT02_INPUT_END_DATETIME = false ;
      A571TBT02_INPUT_END_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id() ;
      n571TBT02_INPUT_END_USER_ID = false ;
      A572TBT02_INPUT_END_AUTH_CD = obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd() ;
      n572TBT02_INPUT_END_AUTH_CD = false ;
      A295TBT02_DEL_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_del_flg() ;
      n295TBT02_DEL_FLG = false ;
      A298TBT02_CRT_PROG_NM = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm() ;
      n298TBT02_CRT_PROG_NM = false ;
      A301TBT02_UPD_PROG_NM = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm() ;
      n301TBT02_UPD_PROG_NM = false ;
      A292TBT02_STUDY_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_study_id() ;
      A293TBT02_SUBJECT_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_subject_id() ;
      A294TBT02_CRF_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crf_id() ;
      Z292TBT02_STUDY_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_study_id_Z() ;
      Z293TBT02_SUBJECT_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z() ;
      Z294TBT02_CRF_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z() ;
      Z370TBT02_CRF_LATEST_VERSION = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z() ;
      Z371TBT02_CRF_INPUT_LEVEL = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z() ;
      Z556TBT02_LOCK_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z() ;
      Z557TBT02_LOCK_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z() ;
      Z558TBT02_LOCK_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z() ;
      Z559TBT02_LOCK_AUTH_CD = obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z() ;
      Z560TBT02_UPLOAD_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z() ;
      Z561TBT02_UPLOAD_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z() ;
      Z562TBT02_UPLOAD_AUTH_CD = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z() ;
      Z563TBT02_DM_ARRIVAL_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z() ;
      Z564TBT02_DM_ARRIVAL_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z() ;
      Z565TBT02_APPROVAL_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z() ;
      Z566TBT02_APPROVAL_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z() ;
      Z567TBT02_APPROVAL_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z() ;
      Z568TBT02_APPROVAL_AUTH_CD = obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z() ;
      Z569TBT02_INPUT_END_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z() ;
      Z570TBT02_INPUT_END_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z() ;
      Z571TBT02_INPUT_END_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z() ;
      Z572TBT02_INPUT_END_AUTH_CD = obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z() ;
      Z295TBT02_DEL_FLG = obj24.getgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z() ;
      Z296TBT02_CRT_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z() ;
      Z297TBT02_CRT_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z() ;
      Z298TBT02_CRT_PROG_NM = obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z() ;
      Z299TBT02_UPD_DATETIME = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z() ;
      Z300TBT02_UPD_USER_ID = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z() ;
      Z301TBT02_UPD_PROG_NM = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z() ;
      Z302TBT02_UPD_CNT = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z() ;
      O302TBT02_UPD_CNT = obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z() ;
      n370TBT02_CRF_LATEST_VERSION = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N()==0)?false:true) ;
      n371TBT02_CRF_INPUT_LEVEL = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N()==0)?false:true) ;
      n556TBT02_LOCK_FLG = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N()==0)?false:true) ;
      n557TBT02_LOCK_DATETIME = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N()==0)?false:true) ;
      n558TBT02_LOCK_USER_ID = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N()==0)?false:true) ;
      n559TBT02_LOCK_AUTH_CD = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N()==0)?false:true) ;
      n560TBT02_UPLOAD_DATETIME = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N()==0)?false:true) ;
      n561TBT02_UPLOAD_USER_ID = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N()==0)?false:true) ;
      n562TBT02_UPLOAD_AUTH_CD = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N()==0)?false:true) ;
      n563TBT02_DM_ARRIVAL_FLG = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N()==0)?false:true) ;
      n564TBT02_DM_ARRIVAL_DATETIME = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N()==0)?false:true) ;
      n565TBT02_APPROVAL_FLG = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N()==0)?false:true) ;
      n566TBT02_APPROVAL_DATETIME = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N()==0)?false:true) ;
      n567TBT02_APPROVAL_USER_ID = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N()==0)?false:true) ;
      n568TBT02_APPROVAL_AUTH_CD = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N()==0)?false:true) ;
      n569TBT02_INPUT_END_FLG = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N()==0)?false:true) ;
      n570TBT02_INPUT_END_DATETIME = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N()==0)?false:true) ;
      n571TBT02_INPUT_END_USER_ID = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N()==0)?false:true) ;
      n572TBT02_INPUT_END_AUTH_CD = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N()==0)?false:true) ;
      n295TBT02_DEL_FLG = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_del_flg_N()==0)?false:true) ;
      n296TBT02_CRT_DATETIME = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N()==0)?false:true) ;
      n297TBT02_CRT_USER_ID = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N()==0)?false:true) ;
      n298TBT02_CRT_PROG_NM = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N()==0)?false:true) ;
      n299TBT02_UPD_DATETIME = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N()==0)?false:true) ;
      n300TBT02_UPD_USER_ID = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N()==0)?false:true) ;
      n301TBT02_UPD_PROG_NM = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N()==0)?false:true) ;
      n302TBT02_UPD_CNT = (boolean)((obj24.getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj24.getgxTv_SdtTBT02_CRF_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A292TBT02_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A293TBT02_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A294TBT02_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0P24( ) ;
      scanKeyStart0P24( ) ;
      if ( RcdFound24 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000P11 */
         pr_default.execute(9, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID)});
         if ( (pr_default.getStatus(9) == 101) )
         {
            AnyError292 = 1 ;
            AnyError293 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRFテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
            AnyError = (short)(1) ;
         }
         if ( ( AnyError292 == 0 ) && ( AnyError293 == 0 ) )
         {
         }
         pr_default.close(9);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z292TBT02_STUDY_ID = A292TBT02_STUDY_ID ;
         Z293TBT02_SUBJECT_ID = A293TBT02_SUBJECT_ID ;
         Z294TBT02_CRF_ID = A294TBT02_CRF_ID ;
         O302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
         n302TBT02_UPD_CNT = false ;
      }
      zm0P24( -13) ;
      sMode24 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0P24( ) ;
      Gx_mode = sMode24 ;
      addRow0P24( ) ;
      scanKeyEnd0P24( ) ;
      if ( RcdFound24 == 0 )
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
      RowToVars24( bcTBT02_CRF, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0P24( ) ;
      if ( RcdFound24 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A292TBT02_STUDY_ID != Z292TBT02_STUDY_ID ) || ( A293TBT02_SUBJECT_ID != Z293TBT02_SUBJECT_ID ) || ( A294TBT02_CRF_ID != Z294TBT02_CRF_ID ) )
         {
            A292TBT02_STUDY_ID = Z292TBT02_STUDY_ID ;
            A293TBT02_SUBJECT_ID = Z293TBT02_SUBJECT_ID ;
            A294TBT02_CRF_ID = Z294TBT02_CRF_ID ;
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
            update0P24( ) ;
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
            if ( ( A292TBT02_STUDY_ID != Z292TBT02_STUDY_ID ) || ( A293TBT02_SUBJECT_ID != Z293TBT02_SUBJECT_ID ) || ( A294TBT02_CRF_ID != Z294TBT02_CRF_ID ) )
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
                  insert0P24( ) ;
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
                  insert0P24( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow24( bcTBT02_CRF) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars24( bcTBT02_CRF, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0P24( ) ;
      if ( RcdFound24 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A292TBT02_STUDY_ID != Z292TBT02_STUDY_ID ) || ( A293TBT02_SUBJECT_ID != Z293TBT02_SUBJECT_ID ) || ( A294TBT02_CRF_ID != Z294TBT02_CRF_ID ) )
         {
            A292TBT02_STUDY_ID = Z292TBT02_STUDY_ID ;
            A293TBT02_SUBJECT_ID = Z293TBT02_SUBJECT_ID ;
            A294TBT02_CRF_ID = Z294TBT02_CRF_ID ;
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
         if ( ( A292TBT02_STUDY_ID != Z292TBT02_STUDY_ID ) || ( A293TBT02_SUBJECT_ID != Z293TBT02_SUBJECT_ID ) || ( A294TBT02_CRF_ID != Z294TBT02_CRF_ID ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt02_crf_bc");
      VarsToRow24( bcTBT02_CRF) ;
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
      Gx_mode = bcTBT02_CRF.getgxTv_SdtTBT02_CRF_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT02_CRF.setgxTv_SdtTBT02_CRF_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT02_CRF sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT02_CRF )
      {
         bcTBT02_CRF = sdt ;
         if ( GXutil.strcmp(bcTBT02_CRF.getgxTv_SdtTBT02_CRF_Mode(), "") == 0 )
         {
            bcTBT02_CRF.setgxTv_SdtTBT02_CRF_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow24( bcTBT02_CRF) ;
         }
         else
         {
            RowToVars24( bcTBT02_CRF, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT02_CRF.getgxTv_SdtTBT02_CRF_Mode(), "") == 0 )
         {
            bcTBT02_CRF.setgxTv_SdtTBT02_CRF_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars24( bcTBT02_CRF, 1) ;
   }

   public SdtTBT02_CRF getTBT02_CRF_BC( )
   {
      return bcTBT02_CRF ;
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
      pr_default.close(9);
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
                  /* Execute user subroutine: S1183 */
                  S1183 ();
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
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z = "" ;
      Z296TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A296TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z297TBT02_CRT_USER_ID = "" ;
      A297TBT02_CRT_USER_ID = "" ;
      Z299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z300TBT02_UPD_USER_ID = "" ;
      A300TBT02_UPD_USER_ID = "" ;
      Z556TBT02_LOCK_FLG = "" ;
      A556TBT02_LOCK_FLG = "" ;
      Z557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z558TBT02_LOCK_USER_ID = "" ;
      A558TBT02_LOCK_USER_ID = "" ;
      Z559TBT02_LOCK_AUTH_CD = "" ;
      A559TBT02_LOCK_AUTH_CD = "" ;
      Z560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z561TBT02_UPLOAD_USER_ID = "" ;
      A561TBT02_UPLOAD_USER_ID = "" ;
      Z562TBT02_UPLOAD_AUTH_CD = "" ;
      A562TBT02_UPLOAD_AUTH_CD = "" ;
      Z563TBT02_DM_ARRIVAL_FLG = "" ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      Z564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z565TBT02_APPROVAL_FLG = "" ;
      A565TBT02_APPROVAL_FLG = "" ;
      Z566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z567TBT02_APPROVAL_USER_ID = "" ;
      A567TBT02_APPROVAL_USER_ID = "" ;
      Z568TBT02_APPROVAL_AUTH_CD = "" ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      Z569TBT02_INPUT_END_FLG = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      Z570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z571TBT02_INPUT_END_USER_ID = "" ;
      A571TBT02_INPUT_END_USER_ID = "" ;
      Z572TBT02_INPUT_END_AUTH_CD = "" ;
      A572TBT02_INPUT_END_AUTH_CD = "" ;
      Z295TBT02_DEL_FLG = "" ;
      A295TBT02_DEL_FLG = "" ;
      Z298TBT02_CRT_PROG_NM = "" ;
      A298TBT02_CRT_PROG_NM = "" ;
      Z301TBT02_UPD_PROG_NM = "" ;
      A301TBT02_UPD_PROG_NM = "" ;
      BC000P5_A294TBT02_CRF_ID = new short[1] ;
      BC000P5_A296TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n296TBT02_CRT_DATETIME = new boolean[] {false} ;
      BC000P5_A297TBT02_CRT_USER_ID = new String[] {""} ;
      BC000P5_n297TBT02_CRT_USER_ID = new boolean[] {false} ;
      BC000P5_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      BC000P5_A300TBT02_UPD_USER_ID = new String[] {""} ;
      BC000P5_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      BC000P5_A302TBT02_UPD_CNT = new long[1] ;
      BC000P5_n302TBT02_UPD_CNT = new boolean[] {false} ;
      BC000P5_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      BC000P5_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC000P5_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      BC000P5_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000P5_A556TBT02_LOCK_FLG = new String[] {""} ;
      BC000P5_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      BC000P5_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      BC000P5_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      BC000P5_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      BC000P5_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      BC000P5_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      BC000P5_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000P5_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      BC000P5_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000P5_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000P5_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000P5_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000P5_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000P5_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000P5_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      BC000P5_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      BC000P5_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000P5_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      BC000P5_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000P5_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000P5_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000P5_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      BC000P5_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      BC000P5_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P5_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000P5_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      BC000P5_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000P5_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000P5_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000P5_A295TBT02_DEL_FLG = new String[] {""} ;
      BC000P5_n295TBT02_DEL_FLG = new boolean[] {false} ;
      BC000P5_A298TBT02_CRT_PROG_NM = new String[] {""} ;
      BC000P5_n298TBT02_CRT_PROG_NM = new boolean[] {false} ;
      BC000P5_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      BC000P5_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      BC000P5_A292TBT02_STUDY_ID = new long[1] ;
      BC000P5_A293TBT02_SUBJECT_ID = new int[1] ;
      BC000P4_A292TBT02_STUDY_ID = new long[1] ;
      BC000P6_A292TBT02_STUDY_ID = new long[1] ;
      BC000P6_A293TBT02_SUBJECT_ID = new int[1] ;
      BC000P6_A294TBT02_CRF_ID = new short[1] ;
      BC000P3_A294TBT02_CRF_ID = new short[1] ;
      BC000P3_A296TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n296TBT02_CRT_DATETIME = new boolean[] {false} ;
      BC000P3_A297TBT02_CRT_USER_ID = new String[] {""} ;
      BC000P3_n297TBT02_CRT_USER_ID = new boolean[] {false} ;
      BC000P3_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      BC000P3_A300TBT02_UPD_USER_ID = new String[] {""} ;
      BC000P3_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      BC000P3_A302TBT02_UPD_CNT = new long[1] ;
      BC000P3_n302TBT02_UPD_CNT = new boolean[] {false} ;
      BC000P3_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      BC000P3_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC000P3_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      BC000P3_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000P3_A556TBT02_LOCK_FLG = new String[] {""} ;
      BC000P3_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      BC000P3_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      BC000P3_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      BC000P3_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      BC000P3_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      BC000P3_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      BC000P3_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000P3_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      BC000P3_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000P3_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000P3_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000P3_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000P3_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000P3_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000P3_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      BC000P3_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      BC000P3_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000P3_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      BC000P3_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000P3_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000P3_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000P3_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      BC000P3_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      BC000P3_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P3_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000P3_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      BC000P3_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000P3_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000P3_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000P3_A295TBT02_DEL_FLG = new String[] {""} ;
      BC000P3_n295TBT02_DEL_FLG = new boolean[] {false} ;
      BC000P3_A298TBT02_CRT_PROG_NM = new String[] {""} ;
      BC000P3_n298TBT02_CRT_PROG_NM = new boolean[] {false} ;
      BC000P3_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      BC000P3_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      BC000P3_A292TBT02_STUDY_ID = new long[1] ;
      BC000P3_A293TBT02_SUBJECT_ID = new int[1] ;
      sMode24 = "" ;
      BC000P2_A294TBT02_CRF_ID = new short[1] ;
      BC000P2_A296TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n296TBT02_CRT_DATETIME = new boolean[] {false} ;
      BC000P2_A297TBT02_CRT_USER_ID = new String[] {""} ;
      BC000P2_n297TBT02_CRT_USER_ID = new boolean[] {false} ;
      BC000P2_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      BC000P2_A300TBT02_UPD_USER_ID = new String[] {""} ;
      BC000P2_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      BC000P2_A302TBT02_UPD_CNT = new long[1] ;
      BC000P2_n302TBT02_UPD_CNT = new boolean[] {false} ;
      BC000P2_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      BC000P2_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC000P2_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      BC000P2_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000P2_A556TBT02_LOCK_FLG = new String[] {""} ;
      BC000P2_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      BC000P2_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      BC000P2_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      BC000P2_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      BC000P2_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      BC000P2_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      BC000P2_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000P2_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      BC000P2_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000P2_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000P2_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000P2_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000P2_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000P2_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000P2_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      BC000P2_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      BC000P2_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000P2_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      BC000P2_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000P2_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000P2_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000P2_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      BC000P2_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      BC000P2_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P2_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000P2_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      BC000P2_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000P2_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000P2_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000P2_A295TBT02_DEL_FLG = new String[] {""} ;
      BC000P2_n295TBT02_DEL_FLG = new boolean[] {false} ;
      BC000P2_A298TBT02_CRT_PROG_NM = new String[] {""} ;
      BC000P2_n298TBT02_CRT_PROG_NM = new boolean[] {false} ;
      BC000P2_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      BC000P2_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      BC000P2_A292TBT02_STUDY_ID = new long[1] ;
      BC000P2_A293TBT02_SUBJECT_ID = new int[1] ;
      BC000P10_A294TBT02_CRF_ID = new short[1] ;
      BC000P10_A296TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n296TBT02_CRT_DATETIME = new boolean[] {false} ;
      BC000P10_A297TBT02_CRT_USER_ID = new String[] {""} ;
      BC000P10_n297TBT02_CRT_USER_ID = new boolean[] {false} ;
      BC000P10_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      BC000P10_A300TBT02_UPD_USER_ID = new String[] {""} ;
      BC000P10_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      BC000P10_A302TBT02_UPD_CNT = new long[1] ;
      BC000P10_n302TBT02_UPD_CNT = new boolean[] {false} ;
      BC000P10_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      BC000P10_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC000P10_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      BC000P10_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC000P10_A556TBT02_LOCK_FLG = new String[] {""} ;
      BC000P10_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      BC000P10_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      BC000P10_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      BC000P10_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      BC000P10_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      BC000P10_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      BC000P10_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      BC000P10_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      BC000P10_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      BC000P10_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      BC000P10_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC000P10_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      BC000P10_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC000P10_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC000P10_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      BC000P10_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      BC000P10_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      BC000P10_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      BC000P10_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      BC000P10_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      BC000P10_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC000P10_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      BC000P10_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      BC000P10_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000P10_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      BC000P10_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      BC000P10_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      BC000P10_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      BC000P10_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC000P10_A295TBT02_DEL_FLG = new String[] {""} ;
      BC000P10_n295TBT02_DEL_FLG = new boolean[] {false} ;
      BC000P10_A298TBT02_CRT_PROG_NM = new String[] {""} ;
      BC000P10_n298TBT02_CRT_PROG_NM = new boolean[] {false} ;
      BC000P10_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      BC000P10_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      BC000P10_A292TBT02_STUDY_ID = new long[1] ;
      BC000P10_A293TBT02_SUBJECT_ID = new int[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000P11_A292TBT02_STUDY_ID = new long[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt02_crf_bc__default(),
         new Object[] {
             new Object[] {
            BC000P2_A294TBT02_CRF_ID, BC000P2_A296TBT02_CRT_DATETIME, BC000P2_n296TBT02_CRT_DATETIME, BC000P2_A297TBT02_CRT_USER_ID, BC000P2_n297TBT02_CRT_USER_ID, BC000P2_A299TBT02_UPD_DATETIME, BC000P2_n299TBT02_UPD_DATETIME, BC000P2_A300TBT02_UPD_USER_ID, BC000P2_n300TBT02_UPD_USER_ID, BC000P2_A302TBT02_UPD_CNT,
            BC000P2_n302TBT02_UPD_CNT, BC000P2_A370TBT02_CRF_LATEST_VERSION, BC000P2_n370TBT02_CRF_LATEST_VERSION, BC000P2_A371TBT02_CRF_INPUT_LEVEL, BC000P2_n371TBT02_CRF_INPUT_LEVEL, BC000P2_A556TBT02_LOCK_FLG, BC000P2_n556TBT02_LOCK_FLG, BC000P2_A557TBT02_LOCK_DATETIME, BC000P2_n557TBT02_LOCK_DATETIME, BC000P2_A558TBT02_LOCK_USER_ID,
            BC000P2_n558TBT02_LOCK_USER_ID, BC000P2_A559TBT02_LOCK_AUTH_CD, BC000P2_n559TBT02_LOCK_AUTH_CD, BC000P2_A560TBT02_UPLOAD_DATETIME, BC000P2_n560TBT02_UPLOAD_DATETIME, BC000P2_A561TBT02_UPLOAD_USER_ID, BC000P2_n561TBT02_UPLOAD_USER_ID, BC000P2_A562TBT02_UPLOAD_AUTH_CD, BC000P2_n562TBT02_UPLOAD_AUTH_CD, BC000P2_A563TBT02_DM_ARRIVAL_FLG,
            BC000P2_n563TBT02_DM_ARRIVAL_FLG, BC000P2_A564TBT02_DM_ARRIVAL_DATETIME, BC000P2_n564TBT02_DM_ARRIVAL_DATETIME, BC000P2_A565TBT02_APPROVAL_FLG, BC000P2_n565TBT02_APPROVAL_FLG, BC000P2_A566TBT02_APPROVAL_DATETIME, BC000P2_n566TBT02_APPROVAL_DATETIME, BC000P2_A567TBT02_APPROVAL_USER_ID, BC000P2_n567TBT02_APPROVAL_USER_ID, BC000P2_A568TBT02_APPROVAL_AUTH_CD,
            BC000P2_n568TBT02_APPROVAL_AUTH_CD, BC000P2_A569TBT02_INPUT_END_FLG, BC000P2_n569TBT02_INPUT_END_FLG, BC000P2_A570TBT02_INPUT_END_DATETIME, BC000P2_n570TBT02_INPUT_END_DATETIME, BC000P2_A571TBT02_INPUT_END_USER_ID, BC000P2_n571TBT02_INPUT_END_USER_ID, BC000P2_A572TBT02_INPUT_END_AUTH_CD, BC000P2_n572TBT02_INPUT_END_AUTH_CD, BC000P2_A295TBT02_DEL_FLG,
            BC000P2_n295TBT02_DEL_FLG, BC000P2_A298TBT02_CRT_PROG_NM, BC000P2_n298TBT02_CRT_PROG_NM, BC000P2_A301TBT02_UPD_PROG_NM, BC000P2_n301TBT02_UPD_PROG_NM, BC000P2_A292TBT02_STUDY_ID, BC000P2_A293TBT02_SUBJECT_ID
            }
            , new Object[] {
            BC000P3_A294TBT02_CRF_ID, BC000P3_A296TBT02_CRT_DATETIME, BC000P3_n296TBT02_CRT_DATETIME, BC000P3_A297TBT02_CRT_USER_ID, BC000P3_n297TBT02_CRT_USER_ID, BC000P3_A299TBT02_UPD_DATETIME, BC000P3_n299TBT02_UPD_DATETIME, BC000P3_A300TBT02_UPD_USER_ID, BC000P3_n300TBT02_UPD_USER_ID, BC000P3_A302TBT02_UPD_CNT,
            BC000P3_n302TBT02_UPD_CNT, BC000P3_A370TBT02_CRF_LATEST_VERSION, BC000P3_n370TBT02_CRF_LATEST_VERSION, BC000P3_A371TBT02_CRF_INPUT_LEVEL, BC000P3_n371TBT02_CRF_INPUT_LEVEL, BC000P3_A556TBT02_LOCK_FLG, BC000P3_n556TBT02_LOCK_FLG, BC000P3_A557TBT02_LOCK_DATETIME, BC000P3_n557TBT02_LOCK_DATETIME, BC000P3_A558TBT02_LOCK_USER_ID,
            BC000P3_n558TBT02_LOCK_USER_ID, BC000P3_A559TBT02_LOCK_AUTH_CD, BC000P3_n559TBT02_LOCK_AUTH_CD, BC000P3_A560TBT02_UPLOAD_DATETIME, BC000P3_n560TBT02_UPLOAD_DATETIME, BC000P3_A561TBT02_UPLOAD_USER_ID, BC000P3_n561TBT02_UPLOAD_USER_ID, BC000P3_A562TBT02_UPLOAD_AUTH_CD, BC000P3_n562TBT02_UPLOAD_AUTH_CD, BC000P3_A563TBT02_DM_ARRIVAL_FLG,
            BC000P3_n563TBT02_DM_ARRIVAL_FLG, BC000P3_A564TBT02_DM_ARRIVAL_DATETIME, BC000P3_n564TBT02_DM_ARRIVAL_DATETIME, BC000P3_A565TBT02_APPROVAL_FLG, BC000P3_n565TBT02_APPROVAL_FLG, BC000P3_A566TBT02_APPROVAL_DATETIME, BC000P3_n566TBT02_APPROVAL_DATETIME, BC000P3_A567TBT02_APPROVAL_USER_ID, BC000P3_n567TBT02_APPROVAL_USER_ID, BC000P3_A568TBT02_APPROVAL_AUTH_CD,
            BC000P3_n568TBT02_APPROVAL_AUTH_CD, BC000P3_A569TBT02_INPUT_END_FLG, BC000P3_n569TBT02_INPUT_END_FLG, BC000P3_A570TBT02_INPUT_END_DATETIME, BC000P3_n570TBT02_INPUT_END_DATETIME, BC000P3_A571TBT02_INPUT_END_USER_ID, BC000P3_n571TBT02_INPUT_END_USER_ID, BC000P3_A572TBT02_INPUT_END_AUTH_CD, BC000P3_n572TBT02_INPUT_END_AUTH_CD, BC000P3_A295TBT02_DEL_FLG,
            BC000P3_n295TBT02_DEL_FLG, BC000P3_A298TBT02_CRT_PROG_NM, BC000P3_n298TBT02_CRT_PROG_NM, BC000P3_A301TBT02_UPD_PROG_NM, BC000P3_n301TBT02_UPD_PROG_NM, BC000P3_A292TBT02_STUDY_ID, BC000P3_A293TBT02_SUBJECT_ID
            }
            , new Object[] {
            BC000P4_A292TBT02_STUDY_ID
            }
            , new Object[] {
            BC000P5_A294TBT02_CRF_ID, BC000P5_A296TBT02_CRT_DATETIME, BC000P5_n296TBT02_CRT_DATETIME, BC000P5_A297TBT02_CRT_USER_ID, BC000P5_n297TBT02_CRT_USER_ID, BC000P5_A299TBT02_UPD_DATETIME, BC000P5_n299TBT02_UPD_DATETIME, BC000P5_A300TBT02_UPD_USER_ID, BC000P5_n300TBT02_UPD_USER_ID, BC000P5_A302TBT02_UPD_CNT,
            BC000P5_n302TBT02_UPD_CNT, BC000P5_A370TBT02_CRF_LATEST_VERSION, BC000P5_n370TBT02_CRF_LATEST_VERSION, BC000P5_A371TBT02_CRF_INPUT_LEVEL, BC000P5_n371TBT02_CRF_INPUT_LEVEL, BC000P5_A556TBT02_LOCK_FLG, BC000P5_n556TBT02_LOCK_FLG, BC000P5_A557TBT02_LOCK_DATETIME, BC000P5_n557TBT02_LOCK_DATETIME, BC000P5_A558TBT02_LOCK_USER_ID,
            BC000P5_n558TBT02_LOCK_USER_ID, BC000P5_A559TBT02_LOCK_AUTH_CD, BC000P5_n559TBT02_LOCK_AUTH_CD, BC000P5_A560TBT02_UPLOAD_DATETIME, BC000P5_n560TBT02_UPLOAD_DATETIME, BC000P5_A561TBT02_UPLOAD_USER_ID, BC000P5_n561TBT02_UPLOAD_USER_ID, BC000P5_A562TBT02_UPLOAD_AUTH_CD, BC000P5_n562TBT02_UPLOAD_AUTH_CD, BC000P5_A563TBT02_DM_ARRIVAL_FLG,
            BC000P5_n563TBT02_DM_ARRIVAL_FLG, BC000P5_A564TBT02_DM_ARRIVAL_DATETIME, BC000P5_n564TBT02_DM_ARRIVAL_DATETIME, BC000P5_A565TBT02_APPROVAL_FLG, BC000P5_n565TBT02_APPROVAL_FLG, BC000P5_A566TBT02_APPROVAL_DATETIME, BC000P5_n566TBT02_APPROVAL_DATETIME, BC000P5_A567TBT02_APPROVAL_USER_ID, BC000P5_n567TBT02_APPROVAL_USER_ID, BC000P5_A568TBT02_APPROVAL_AUTH_CD,
            BC000P5_n568TBT02_APPROVAL_AUTH_CD, BC000P5_A569TBT02_INPUT_END_FLG, BC000P5_n569TBT02_INPUT_END_FLG, BC000P5_A570TBT02_INPUT_END_DATETIME, BC000P5_n570TBT02_INPUT_END_DATETIME, BC000P5_A571TBT02_INPUT_END_USER_ID, BC000P5_n571TBT02_INPUT_END_USER_ID, BC000P5_A572TBT02_INPUT_END_AUTH_CD, BC000P5_n572TBT02_INPUT_END_AUTH_CD, BC000P5_A295TBT02_DEL_FLG,
            BC000P5_n295TBT02_DEL_FLG, BC000P5_A298TBT02_CRT_PROG_NM, BC000P5_n298TBT02_CRT_PROG_NM, BC000P5_A301TBT02_UPD_PROG_NM, BC000P5_n301TBT02_UPD_PROG_NM, BC000P5_A292TBT02_STUDY_ID, BC000P5_A293TBT02_SUBJECT_ID
            }
            , new Object[] {
            BC000P6_A292TBT02_STUDY_ID, BC000P6_A293TBT02_SUBJECT_ID, BC000P6_A294TBT02_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000P10_A294TBT02_CRF_ID, BC000P10_A296TBT02_CRT_DATETIME, BC000P10_n296TBT02_CRT_DATETIME, BC000P10_A297TBT02_CRT_USER_ID, BC000P10_n297TBT02_CRT_USER_ID, BC000P10_A299TBT02_UPD_DATETIME, BC000P10_n299TBT02_UPD_DATETIME, BC000P10_A300TBT02_UPD_USER_ID, BC000P10_n300TBT02_UPD_USER_ID, BC000P10_A302TBT02_UPD_CNT,
            BC000P10_n302TBT02_UPD_CNT, BC000P10_A370TBT02_CRF_LATEST_VERSION, BC000P10_n370TBT02_CRF_LATEST_VERSION, BC000P10_A371TBT02_CRF_INPUT_LEVEL, BC000P10_n371TBT02_CRF_INPUT_LEVEL, BC000P10_A556TBT02_LOCK_FLG, BC000P10_n556TBT02_LOCK_FLG, BC000P10_A557TBT02_LOCK_DATETIME, BC000P10_n557TBT02_LOCK_DATETIME, BC000P10_A558TBT02_LOCK_USER_ID,
            BC000P10_n558TBT02_LOCK_USER_ID, BC000P10_A559TBT02_LOCK_AUTH_CD, BC000P10_n559TBT02_LOCK_AUTH_CD, BC000P10_A560TBT02_UPLOAD_DATETIME, BC000P10_n560TBT02_UPLOAD_DATETIME, BC000P10_A561TBT02_UPLOAD_USER_ID, BC000P10_n561TBT02_UPLOAD_USER_ID, BC000P10_A562TBT02_UPLOAD_AUTH_CD, BC000P10_n562TBT02_UPLOAD_AUTH_CD, BC000P10_A563TBT02_DM_ARRIVAL_FLG,
            BC000P10_n563TBT02_DM_ARRIVAL_FLG, BC000P10_A564TBT02_DM_ARRIVAL_DATETIME, BC000P10_n564TBT02_DM_ARRIVAL_DATETIME, BC000P10_A565TBT02_APPROVAL_FLG, BC000P10_n565TBT02_APPROVAL_FLG, BC000P10_A566TBT02_APPROVAL_DATETIME, BC000P10_n566TBT02_APPROVAL_DATETIME, BC000P10_A567TBT02_APPROVAL_USER_ID, BC000P10_n567TBT02_APPROVAL_USER_ID, BC000P10_A568TBT02_APPROVAL_AUTH_CD,
            BC000P10_n568TBT02_APPROVAL_AUTH_CD, BC000P10_A569TBT02_INPUT_END_FLG, BC000P10_n569TBT02_INPUT_END_FLG, BC000P10_A570TBT02_INPUT_END_DATETIME, BC000P10_n570TBT02_INPUT_END_DATETIME, BC000P10_A571TBT02_INPUT_END_USER_ID, BC000P10_n571TBT02_INPUT_END_USER_ID, BC000P10_A572TBT02_INPUT_END_AUTH_CD, BC000P10_n572TBT02_INPUT_END_AUTH_CD, BC000P10_A295TBT02_DEL_FLG,
            BC000P10_n295TBT02_DEL_FLG, BC000P10_A298TBT02_CRT_PROG_NM, BC000P10_n298TBT02_CRT_PROG_NM, BC000P10_A301TBT02_UPD_PROG_NM, BC000P10_n301TBT02_UPD_PROG_NM, BC000P10_A292TBT02_STUDY_ID, BC000P10_A293TBT02_SUBJECT_ID
            }
            , new Object[] {
            BC000P11_A292TBT02_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT02_CRF_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110P2 */
      e110P2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_del_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N ;
   private byte Z371TBT02_CRF_INPUT_LEVEL ;
   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z294TBT02_CRF_ID ;
   private short A294TBT02_CRF_ID ;
   private short gxTv_SdtTBT02_CRF_Tbt02_crf_id_Z ;
   private short gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z ;
   private short Z370TBT02_CRF_LATEST_VERSION ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short RcdFound24 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z293TBT02_SUBJECT_ID ;
   private int A293TBT02_SUBJECT_ID ;
   private int gxTv_SdtTBT02_CRF_Tbt02_subject_id_Z ;
   private int GX_JID ;
   private int AnyError292 ;
   private int AnyError293 ;
   private int GXActiveErrHndl ;
   private long Z292TBT02_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long gxTv_SdtTBT02_CRF_Tbt02_study_id_Z ;
   private long gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z ;
   private long Z302TBT02_UPD_CNT ;
   private long A302TBT02_UPD_CNT ;
   private long O302TBT02_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode24 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z ;
   private java.util.Date Z296TBT02_CRT_DATETIME ;
   private java.util.Date A296TBT02_CRT_DATETIME ;
   private java.util.Date Z299TBT02_UPD_DATETIME ;
   private java.util.Date A299TBT02_UPD_DATETIME ;
   private java.util.Date Z557TBT02_LOCK_DATETIME ;
   private java.util.Date A557TBT02_LOCK_DATETIME ;
   private java.util.Date Z560TBT02_UPLOAD_DATETIME ;
   private java.util.Date A560TBT02_UPLOAD_DATETIME ;
   private java.util.Date Z564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z566TBT02_APPROVAL_DATETIME ;
   private java.util.Date A566TBT02_APPROVAL_DATETIME ;
   private java.util.Date Z570TBT02_INPUT_END_DATETIME ;
   private java.util.Date A570TBT02_INPUT_END_DATETIME ;
   private boolean n296TBT02_CRT_DATETIME ;
   private boolean n297TBT02_CRT_USER_ID ;
   private boolean n299TBT02_UPD_DATETIME ;
   private boolean n300TBT02_UPD_USER_ID ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n556TBT02_LOCK_FLG ;
   private boolean n557TBT02_LOCK_DATETIME ;
   private boolean n558TBT02_LOCK_USER_ID ;
   private boolean n559TBT02_LOCK_AUTH_CD ;
   private boolean n560TBT02_UPLOAD_DATETIME ;
   private boolean n561TBT02_UPLOAD_USER_ID ;
   private boolean n562TBT02_UPLOAD_AUTH_CD ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n565TBT02_APPROVAL_FLG ;
   private boolean n566TBT02_APPROVAL_DATETIME ;
   private boolean n567TBT02_APPROVAL_USER_ID ;
   private boolean n568TBT02_APPROVAL_AUTH_CD ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n570TBT02_INPUT_END_DATETIME ;
   private boolean n571TBT02_INPUT_END_USER_ID ;
   private boolean n572TBT02_INPUT_END_AUTH_CD ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n298TBT02_CRT_PROG_NM ;
   private boolean n301TBT02_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z ;
   private String Z297TBT02_CRT_USER_ID ;
   private String A297TBT02_CRT_USER_ID ;
   private String Z300TBT02_UPD_USER_ID ;
   private String A300TBT02_UPD_USER_ID ;
   private String Z556TBT02_LOCK_FLG ;
   private String A556TBT02_LOCK_FLG ;
   private String Z558TBT02_LOCK_USER_ID ;
   private String A558TBT02_LOCK_USER_ID ;
   private String Z559TBT02_LOCK_AUTH_CD ;
   private String A559TBT02_LOCK_AUTH_CD ;
   private String Z561TBT02_UPLOAD_USER_ID ;
   private String A561TBT02_UPLOAD_USER_ID ;
   private String Z562TBT02_UPLOAD_AUTH_CD ;
   private String A562TBT02_UPLOAD_AUTH_CD ;
   private String Z563TBT02_DM_ARRIVAL_FLG ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String Z565TBT02_APPROVAL_FLG ;
   private String A565TBT02_APPROVAL_FLG ;
   private String Z567TBT02_APPROVAL_USER_ID ;
   private String A567TBT02_APPROVAL_USER_ID ;
   private String Z568TBT02_APPROVAL_AUTH_CD ;
   private String A568TBT02_APPROVAL_AUTH_CD ;
   private String Z569TBT02_INPUT_END_FLG ;
   private String A569TBT02_INPUT_END_FLG ;
   private String Z571TBT02_INPUT_END_USER_ID ;
   private String A571TBT02_INPUT_END_USER_ID ;
   private String Z572TBT02_INPUT_END_AUTH_CD ;
   private String A572TBT02_INPUT_END_AUTH_CD ;
   private String Z295TBT02_DEL_FLG ;
   private String A295TBT02_DEL_FLG ;
   private String Z298TBT02_CRT_PROG_NM ;
   private String A298TBT02_CRT_PROG_NM ;
   private String Z301TBT02_UPD_PROG_NM ;
   private String A301TBT02_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT02_CRF bcTBT02_CRF ;
   private IDataStoreProvider pr_default ;
   private short[] BC000P5_A294TBT02_CRF_ID ;
   private java.util.Date[] BC000P5_A296TBT02_CRT_DATETIME ;
   private boolean[] BC000P5_n296TBT02_CRT_DATETIME ;
   private String[] BC000P5_A297TBT02_CRT_USER_ID ;
   private boolean[] BC000P5_n297TBT02_CRT_USER_ID ;
   private java.util.Date[] BC000P5_A299TBT02_UPD_DATETIME ;
   private boolean[] BC000P5_n299TBT02_UPD_DATETIME ;
   private String[] BC000P5_A300TBT02_UPD_USER_ID ;
   private boolean[] BC000P5_n300TBT02_UPD_USER_ID ;
   private long[] BC000P5_A302TBT02_UPD_CNT ;
   private boolean[] BC000P5_n302TBT02_UPD_CNT ;
   private short[] BC000P5_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] BC000P5_n370TBT02_CRF_LATEST_VERSION ;
   private byte[] BC000P5_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] BC000P5_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] BC000P5_A556TBT02_LOCK_FLG ;
   private boolean[] BC000P5_n556TBT02_LOCK_FLG ;
   private java.util.Date[] BC000P5_A557TBT02_LOCK_DATETIME ;
   private boolean[] BC000P5_n557TBT02_LOCK_DATETIME ;
   private String[] BC000P5_A558TBT02_LOCK_USER_ID ;
   private boolean[] BC000P5_n558TBT02_LOCK_USER_ID ;
   private String[] BC000P5_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] BC000P5_n559TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] BC000P5_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] BC000P5_n560TBT02_UPLOAD_DATETIME ;
   private String[] BC000P5_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] BC000P5_n561TBT02_UPLOAD_USER_ID ;
   private String[] BC000P5_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] BC000P5_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] BC000P5_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] BC000P5_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000P5_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000P5_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] BC000P5_A565TBT02_APPROVAL_FLG ;
   private boolean[] BC000P5_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] BC000P5_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] BC000P5_n566TBT02_APPROVAL_DATETIME ;
   private String[] BC000P5_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] BC000P5_n567TBT02_APPROVAL_USER_ID ;
   private String[] BC000P5_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] BC000P5_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] BC000P5_A569TBT02_INPUT_END_FLG ;
   private boolean[] BC000P5_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] BC000P5_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] BC000P5_n570TBT02_INPUT_END_DATETIME ;
   private String[] BC000P5_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] BC000P5_n571TBT02_INPUT_END_USER_ID ;
   private String[] BC000P5_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] BC000P5_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] BC000P5_A295TBT02_DEL_FLG ;
   private boolean[] BC000P5_n295TBT02_DEL_FLG ;
   private String[] BC000P5_A298TBT02_CRT_PROG_NM ;
   private boolean[] BC000P5_n298TBT02_CRT_PROG_NM ;
   private String[] BC000P5_A301TBT02_UPD_PROG_NM ;
   private boolean[] BC000P5_n301TBT02_UPD_PROG_NM ;
   private long[] BC000P5_A292TBT02_STUDY_ID ;
   private int[] BC000P5_A293TBT02_SUBJECT_ID ;
   private long[] BC000P4_A292TBT02_STUDY_ID ;
   private long[] BC000P6_A292TBT02_STUDY_ID ;
   private int[] BC000P6_A293TBT02_SUBJECT_ID ;
   private short[] BC000P6_A294TBT02_CRF_ID ;
   private short[] BC000P3_A294TBT02_CRF_ID ;
   private java.util.Date[] BC000P3_A296TBT02_CRT_DATETIME ;
   private boolean[] BC000P3_n296TBT02_CRT_DATETIME ;
   private String[] BC000P3_A297TBT02_CRT_USER_ID ;
   private boolean[] BC000P3_n297TBT02_CRT_USER_ID ;
   private java.util.Date[] BC000P3_A299TBT02_UPD_DATETIME ;
   private boolean[] BC000P3_n299TBT02_UPD_DATETIME ;
   private String[] BC000P3_A300TBT02_UPD_USER_ID ;
   private boolean[] BC000P3_n300TBT02_UPD_USER_ID ;
   private long[] BC000P3_A302TBT02_UPD_CNT ;
   private boolean[] BC000P3_n302TBT02_UPD_CNT ;
   private short[] BC000P3_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] BC000P3_n370TBT02_CRF_LATEST_VERSION ;
   private byte[] BC000P3_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] BC000P3_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] BC000P3_A556TBT02_LOCK_FLG ;
   private boolean[] BC000P3_n556TBT02_LOCK_FLG ;
   private java.util.Date[] BC000P3_A557TBT02_LOCK_DATETIME ;
   private boolean[] BC000P3_n557TBT02_LOCK_DATETIME ;
   private String[] BC000P3_A558TBT02_LOCK_USER_ID ;
   private boolean[] BC000P3_n558TBT02_LOCK_USER_ID ;
   private String[] BC000P3_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] BC000P3_n559TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] BC000P3_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] BC000P3_n560TBT02_UPLOAD_DATETIME ;
   private String[] BC000P3_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] BC000P3_n561TBT02_UPLOAD_USER_ID ;
   private String[] BC000P3_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] BC000P3_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] BC000P3_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] BC000P3_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000P3_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000P3_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] BC000P3_A565TBT02_APPROVAL_FLG ;
   private boolean[] BC000P3_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] BC000P3_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] BC000P3_n566TBT02_APPROVAL_DATETIME ;
   private String[] BC000P3_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] BC000P3_n567TBT02_APPROVAL_USER_ID ;
   private String[] BC000P3_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] BC000P3_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] BC000P3_A569TBT02_INPUT_END_FLG ;
   private boolean[] BC000P3_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] BC000P3_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] BC000P3_n570TBT02_INPUT_END_DATETIME ;
   private String[] BC000P3_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] BC000P3_n571TBT02_INPUT_END_USER_ID ;
   private String[] BC000P3_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] BC000P3_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] BC000P3_A295TBT02_DEL_FLG ;
   private boolean[] BC000P3_n295TBT02_DEL_FLG ;
   private String[] BC000P3_A298TBT02_CRT_PROG_NM ;
   private boolean[] BC000P3_n298TBT02_CRT_PROG_NM ;
   private String[] BC000P3_A301TBT02_UPD_PROG_NM ;
   private boolean[] BC000P3_n301TBT02_UPD_PROG_NM ;
   private long[] BC000P3_A292TBT02_STUDY_ID ;
   private int[] BC000P3_A293TBT02_SUBJECT_ID ;
   private short[] BC000P2_A294TBT02_CRF_ID ;
   private java.util.Date[] BC000P2_A296TBT02_CRT_DATETIME ;
   private boolean[] BC000P2_n296TBT02_CRT_DATETIME ;
   private String[] BC000P2_A297TBT02_CRT_USER_ID ;
   private boolean[] BC000P2_n297TBT02_CRT_USER_ID ;
   private java.util.Date[] BC000P2_A299TBT02_UPD_DATETIME ;
   private boolean[] BC000P2_n299TBT02_UPD_DATETIME ;
   private String[] BC000P2_A300TBT02_UPD_USER_ID ;
   private boolean[] BC000P2_n300TBT02_UPD_USER_ID ;
   private long[] BC000P2_A302TBT02_UPD_CNT ;
   private boolean[] BC000P2_n302TBT02_UPD_CNT ;
   private short[] BC000P2_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] BC000P2_n370TBT02_CRF_LATEST_VERSION ;
   private byte[] BC000P2_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] BC000P2_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] BC000P2_A556TBT02_LOCK_FLG ;
   private boolean[] BC000P2_n556TBT02_LOCK_FLG ;
   private java.util.Date[] BC000P2_A557TBT02_LOCK_DATETIME ;
   private boolean[] BC000P2_n557TBT02_LOCK_DATETIME ;
   private String[] BC000P2_A558TBT02_LOCK_USER_ID ;
   private boolean[] BC000P2_n558TBT02_LOCK_USER_ID ;
   private String[] BC000P2_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] BC000P2_n559TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] BC000P2_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] BC000P2_n560TBT02_UPLOAD_DATETIME ;
   private String[] BC000P2_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] BC000P2_n561TBT02_UPLOAD_USER_ID ;
   private String[] BC000P2_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] BC000P2_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] BC000P2_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] BC000P2_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000P2_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000P2_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] BC000P2_A565TBT02_APPROVAL_FLG ;
   private boolean[] BC000P2_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] BC000P2_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] BC000P2_n566TBT02_APPROVAL_DATETIME ;
   private String[] BC000P2_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] BC000P2_n567TBT02_APPROVAL_USER_ID ;
   private String[] BC000P2_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] BC000P2_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] BC000P2_A569TBT02_INPUT_END_FLG ;
   private boolean[] BC000P2_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] BC000P2_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] BC000P2_n570TBT02_INPUT_END_DATETIME ;
   private String[] BC000P2_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] BC000P2_n571TBT02_INPUT_END_USER_ID ;
   private String[] BC000P2_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] BC000P2_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] BC000P2_A295TBT02_DEL_FLG ;
   private boolean[] BC000P2_n295TBT02_DEL_FLG ;
   private String[] BC000P2_A298TBT02_CRT_PROG_NM ;
   private boolean[] BC000P2_n298TBT02_CRT_PROG_NM ;
   private String[] BC000P2_A301TBT02_UPD_PROG_NM ;
   private boolean[] BC000P2_n301TBT02_UPD_PROG_NM ;
   private long[] BC000P2_A292TBT02_STUDY_ID ;
   private int[] BC000P2_A293TBT02_SUBJECT_ID ;
   private short[] BC000P10_A294TBT02_CRF_ID ;
   private java.util.Date[] BC000P10_A296TBT02_CRT_DATETIME ;
   private boolean[] BC000P10_n296TBT02_CRT_DATETIME ;
   private String[] BC000P10_A297TBT02_CRT_USER_ID ;
   private boolean[] BC000P10_n297TBT02_CRT_USER_ID ;
   private java.util.Date[] BC000P10_A299TBT02_UPD_DATETIME ;
   private boolean[] BC000P10_n299TBT02_UPD_DATETIME ;
   private String[] BC000P10_A300TBT02_UPD_USER_ID ;
   private boolean[] BC000P10_n300TBT02_UPD_USER_ID ;
   private long[] BC000P10_A302TBT02_UPD_CNT ;
   private boolean[] BC000P10_n302TBT02_UPD_CNT ;
   private short[] BC000P10_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] BC000P10_n370TBT02_CRF_LATEST_VERSION ;
   private byte[] BC000P10_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] BC000P10_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] BC000P10_A556TBT02_LOCK_FLG ;
   private boolean[] BC000P10_n556TBT02_LOCK_FLG ;
   private java.util.Date[] BC000P10_A557TBT02_LOCK_DATETIME ;
   private boolean[] BC000P10_n557TBT02_LOCK_DATETIME ;
   private String[] BC000P10_A558TBT02_LOCK_USER_ID ;
   private boolean[] BC000P10_n558TBT02_LOCK_USER_ID ;
   private String[] BC000P10_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] BC000P10_n559TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] BC000P10_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] BC000P10_n560TBT02_UPLOAD_DATETIME ;
   private String[] BC000P10_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] BC000P10_n561TBT02_UPLOAD_USER_ID ;
   private String[] BC000P10_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] BC000P10_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] BC000P10_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] BC000P10_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC000P10_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] BC000P10_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] BC000P10_A565TBT02_APPROVAL_FLG ;
   private boolean[] BC000P10_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] BC000P10_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] BC000P10_n566TBT02_APPROVAL_DATETIME ;
   private String[] BC000P10_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] BC000P10_n567TBT02_APPROVAL_USER_ID ;
   private String[] BC000P10_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] BC000P10_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] BC000P10_A569TBT02_INPUT_END_FLG ;
   private boolean[] BC000P10_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] BC000P10_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] BC000P10_n570TBT02_INPUT_END_DATETIME ;
   private String[] BC000P10_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] BC000P10_n571TBT02_INPUT_END_USER_ID ;
   private String[] BC000P10_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] BC000P10_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] BC000P10_A295TBT02_DEL_FLG ;
   private boolean[] BC000P10_n295TBT02_DEL_FLG ;
   private String[] BC000P10_A298TBT02_CRT_PROG_NM ;
   private boolean[] BC000P10_n298TBT02_CRT_PROG_NM ;
   private String[] BC000P10_A301TBT02_UPD_PROG_NM ;
   private boolean[] BC000P10_n301TBT02_UPD_PROG_NM ;
   private long[] BC000P10_A292TBT02_STUDY_ID ;
   private int[] BC000P10_A293TBT02_SUBJECT_ID ;
   private long[] BC000P11_A292TBT02_STUDY_ID ;
}

final  class tbt02_crf_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000P2", "SELECT `TBT02_CRF_ID`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000P3", "SELECT `TBT02_CRF_ID`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000P4", "SELECT `TBT01_STUDY_ID` AS TBT02_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000P5", "SELECT TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRT_DATETIME`, TM1.`TBT02_CRT_USER_ID`, TM1.`TBT02_UPD_DATETIME`, TM1.`TBT02_UPD_USER_ID`, TM1.`TBT02_UPD_CNT`, TM1.`TBT02_CRF_LATEST_VERSION`, TM1.`TBT02_CRF_INPUT_LEVEL`, TM1.`TBT02_LOCK_FLG`, TM1.`TBT02_LOCK_DATETIME`, TM1.`TBT02_LOCK_USER_ID`, TM1.`TBT02_LOCK_AUTH_CD`, TM1.`TBT02_UPLOAD_DATETIME`, TM1.`TBT02_UPLOAD_USER_ID`, TM1.`TBT02_UPLOAD_AUTH_CD`, TM1.`TBT02_DM_ARRIVAL_FLG`, TM1.`TBT02_DM_ARRIVAL_DATETIME`, TM1.`TBT02_APPROVAL_FLG`, TM1.`TBT02_APPROVAL_DATETIME`, TM1.`TBT02_APPROVAL_USER_ID`, TM1.`TBT02_APPROVAL_AUTH_CD`, TM1.`TBT02_INPUT_END_FLG`, TM1.`TBT02_INPUT_END_DATETIME`, TM1.`TBT02_INPUT_END_USER_ID`, TM1.`TBT02_INPUT_END_AUTH_CD`, TM1.`TBT02_DEL_FLG`, TM1.`TBT02_CRT_PROG_NM`, TM1.`TBT02_UPD_PROG_NM`, TM1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, TM1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` TM1 WHERE TM1.`TBT02_STUDY_ID` = ? and TM1.`TBT02_SUBJECT_ID` = ? and TM1.`TBT02_CRF_ID` = ? ORDER BY TM1.`TBT02_STUDY_ID`, TM1.`TBT02_SUBJECT_ID`, TM1.`TBT02_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000P6", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000P7", "INSERT INTO `TBT02_CRF` (`TBT02_CRF_ID`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000P8", "UPDATE `TBT02_CRF` SET `TBT02_CRT_DATETIME`=?, `TBT02_CRT_USER_ID`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_CNT`=?, `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_LOCK_FLG`=?, `TBT02_LOCK_DATETIME`=?, `TBT02_LOCK_USER_ID`=?, `TBT02_LOCK_AUTH_CD`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_APPROVAL_FLG`=?, `TBT02_APPROVAL_DATETIME`=?, `TBT02_APPROVAL_USER_ID`=?, `TBT02_APPROVAL_AUTH_CD`=?, `TBT02_INPUT_END_FLG`=?, `TBT02_INPUT_END_DATETIME`=?, `TBT02_INPUT_END_USER_ID`=?, `TBT02_INPUT_END_AUTH_CD`=?, `TBT02_DEL_FLG`=?, `TBT02_CRT_PROG_NM`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000P9", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000P10", "SELECT TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRT_DATETIME`, TM1.`TBT02_CRT_USER_ID`, TM1.`TBT02_UPD_DATETIME`, TM1.`TBT02_UPD_USER_ID`, TM1.`TBT02_UPD_CNT`, TM1.`TBT02_CRF_LATEST_VERSION`, TM1.`TBT02_CRF_INPUT_LEVEL`, TM1.`TBT02_LOCK_FLG`, TM1.`TBT02_LOCK_DATETIME`, TM1.`TBT02_LOCK_USER_ID`, TM1.`TBT02_LOCK_AUTH_CD`, TM1.`TBT02_UPLOAD_DATETIME`, TM1.`TBT02_UPLOAD_USER_ID`, TM1.`TBT02_UPLOAD_AUTH_CD`, TM1.`TBT02_DM_ARRIVAL_FLG`, TM1.`TBT02_DM_ARRIVAL_DATETIME`, TM1.`TBT02_APPROVAL_FLG`, TM1.`TBT02_APPROVAL_DATETIME`, TM1.`TBT02_APPROVAL_USER_ID`, TM1.`TBT02_APPROVAL_AUTH_CD`, TM1.`TBT02_INPUT_END_FLG`, TM1.`TBT02_INPUT_END_DATETIME`, TM1.`TBT02_INPUT_END_USER_ID`, TM1.`TBT02_INPUT_END_AUTH_CD`, TM1.`TBT02_DEL_FLG`, TM1.`TBT02_CRT_PROG_NM`, TM1.`TBT02_UPD_PROG_NM`, TM1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, TM1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` TM1 WHERE TM1.`TBT02_STUDY_ID` = ? and TM1.`TBT02_SUBJECT_ID` = ? and TM1.`TBT02_CRF_ID` = ? ORDER BY TM1.`TBT02_STUDY_ID`, TM1.`TBT02_SUBJECT_ID`, TM1.`TBT02_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000P11", "SELECT `TBT01_STUDY_ID` AS TBT02_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((int[]) buf[56])[0] = rslt.getInt(30) ;
               break;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((int[]) buf[56])[0] = rslt.getInt(30) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((int[]) buf[56])[0] = rslt.getInt(30) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((int[]) buf[56])[0] = rslt.getInt(30) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 128);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 128);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 128);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[32], false);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[36], false);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 128);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[44], false);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 128);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[52], 40);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 40);
               }
               stmt.setLong(29, ((Number) parms[55]).longValue());
               stmt.setInt(30, ((Number) parms[56]).intValue());
               break;
            case 6 :
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
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
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
                  stmt.setVarchar(11, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 128);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 2);
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
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[35], false);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 128);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 2);
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
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 128);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 2);
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
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 40);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 40);
               }
               stmt.setLong(28, ((Number) parms[54]).longValue());
               stmt.setInt(29, ((Number) parms[55]).intValue());
               stmt.setShort(30, ((Number) parms[56]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
      }
   }

}

