/*
               File: tbt15_crf_memo_loc_bc
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:45.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt15_crf_memo_loc_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt15_crf_memo_loc_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt15_crf_memo_loc_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt15_crf_memo_loc_bc.class ));
   }

   public tbt15_crf_memo_loc_bc( int remoteHandle ,
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
         /* Execute user event: e120T2 */
         e120T2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z345TBT15_STUDY_ID = A345TBT15_STUDY_ID ;
            Z346TBT15_SUBJECT_ID = A346TBT15_SUBJECT_ID ;
            Z925TBT15_MEMO_NO = A925TBT15_MEMO_NO ;
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

   public void confirm_0T0( )
   {
      beforeValidate0T28( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0T28( ) ;
         }
         else
         {
            checkExtendedTable0T28( ) ;
            if ( AnyError == 0 )
            {
               zm0T28( 9) ;
            }
            closeExtendedTableCursors0T28( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110T2( )
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

   public void e120T2( )
   {
      /* After Trn Routine */
   }

   public void S1170( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0T28( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z352TBT15_CRT_DATETIME = A352TBT15_CRT_DATETIME ;
         Z353TBT15_CRT_USER_ID = A353TBT15_CRT_USER_ID ;
         Z355TBT15_UPD_DATETIME = A355TBT15_UPD_DATETIME ;
         Z356TBT15_UPD_USER_ID = A356TBT15_UPD_USER_ID ;
         Z358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
         Z347TBT15_CRF_ID = A347TBT15_CRF_ID ;
         Z348TBT15_CRF_VERSION = A348TBT15_CRF_VERSION ;
         Z932TBT15_CRF_ITEM_GRP_DIV = A932TBT15_CRF_ITEM_GRP_DIV ;
         Z926TBT15_CRF_ITEM_GRP_CD = A926TBT15_CRF_ITEM_GRP_CD ;
         Z351TBT15_DEL_FLG = A351TBT15_DEL_FLG ;
         Z354TBT15_CRT_PROG_NM = A354TBT15_CRT_PROG_NM ;
         Z357TBT15_UPD_PROG_NM = A357TBT15_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z352TBT15_CRT_DATETIME = A352TBT15_CRT_DATETIME ;
         Z353TBT15_CRT_USER_ID = A353TBT15_CRT_USER_ID ;
         Z355TBT15_UPD_DATETIME = A355TBT15_UPD_DATETIME ;
         Z356TBT15_UPD_USER_ID = A356TBT15_UPD_USER_ID ;
         Z358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
         Z347TBT15_CRF_ID = A347TBT15_CRF_ID ;
         Z348TBT15_CRF_VERSION = A348TBT15_CRF_VERSION ;
         Z932TBT15_CRF_ITEM_GRP_DIV = A932TBT15_CRF_ITEM_GRP_DIV ;
         Z926TBT15_CRF_ITEM_GRP_CD = A926TBT15_CRF_ITEM_GRP_CD ;
         Z351TBT15_DEL_FLG = A351TBT15_DEL_FLG ;
         Z354TBT15_CRT_PROG_NM = A354TBT15_CRT_PROG_NM ;
         Z357TBT15_UPD_PROG_NM = A357TBT15_UPD_PROG_NM ;
         Z345TBT15_STUDY_ID = A345TBT15_STUDY_ID ;
         Z346TBT15_SUBJECT_ID = A346TBT15_SUBJECT_ID ;
         Z925TBT15_MEMO_NO = A925TBT15_MEMO_NO ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0T28( )
   {
      /* Using cursor BC000T5 */
      pr_default.execute(3, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A352TBT15_CRT_DATETIME = BC000T5_A352TBT15_CRT_DATETIME[0] ;
         n352TBT15_CRT_DATETIME = BC000T5_n352TBT15_CRT_DATETIME[0] ;
         A353TBT15_CRT_USER_ID = BC000T5_A353TBT15_CRT_USER_ID[0] ;
         n353TBT15_CRT_USER_ID = BC000T5_n353TBT15_CRT_USER_ID[0] ;
         A355TBT15_UPD_DATETIME = BC000T5_A355TBT15_UPD_DATETIME[0] ;
         n355TBT15_UPD_DATETIME = BC000T5_n355TBT15_UPD_DATETIME[0] ;
         A356TBT15_UPD_USER_ID = BC000T5_A356TBT15_UPD_USER_ID[0] ;
         n356TBT15_UPD_USER_ID = BC000T5_n356TBT15_UPD_USER_ID[0] ;
         A358TBT15_UPD_CNT = BC000T5_A358TBT15_UPD_CNT[0] ;
         n358TBT15_UPD_CNT = BC000T5_n358TBT15_UPD_CNT[0] ;
         A347TBT15_CRF_ID = BC000T5_A347TBT15_CRF_ID[0] ;
         n347TBT15_CRF_ID = BC000T5_n347TBT15_CRF_ID[0] ;
         A348TBT15_CRF_VERSION = BC000T5_A348TBT15_CRF_VERSION[0] ;
         n348TBT15_CRF_VERSION = BC000T5_n348TBT15_CRF_VERSION[0] ;
         A932TBT15_CRF_ITEM_GRP_DIV = BC000T5_A932TBT15_CRF_ITEM_GRP_DIV[0] ;
         n932TBT15_CRF_ITEM_GRP_DIV = BC000T5_n932TBT15_CRF_ITEM_GRP_DIV[0] ;
         A926TBT15_CRF_ITEM_GRP_CD = BC000T5_A926TBT15_CRF_ITEM_GRP_CD[0] ;
         n926TBT15_CRF_ITEM_GRP_CD = BC000T5_n926TBT15_CRF_ITEM_GRP_CD[0] ;
         A351TBT15_DEL_FLG = BC000T5_A351TBT15_DEL_FLG[0] ;
         n351TBT15_DEL_FLG = BC000T5_n351TBT15_DEL_FLG[0] ;
         A354TBT15_CRT_PROG_NM = BC000T5_A354TBT15_CRT_PROG_NM[0] ;
         n354TBT15_CRT_PROG_NM = BC000T5_n354TBT15_CRT_PROG_NM[0] ;
         A357TBT15_UPD_PROG_NM = BC000T5_A357TBT15_UPD_PROG_NM[0] ;
         n357TBT15_UPD_PROG_NM = BC000T5_n357TBT15_UPD_PROG_NM[0] ;
         zm0T28( -8) ;
      }
      pr_default.close(3);
      onLoadActions0T28( ) ;
   }

   public void onLoadActions0T28( )
   {
      AV9Pgmname = "TBT15_CRF_MEMO_LOC_BC" ;
   }

   public void checkExtendedTable0T28( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT15_CRF_MEMO_LOC_BC" ;
      /* Using cursor BC000T4 */
      pr_default.execute(2, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError345 = 1 ;
         AnyError346 = 1 ;
         AnyError925 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモ位置テーブル・CRFメモサブタイプ'", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
         AnyError = (short)(1) ;
      }
      if ( ( AnyError345 == 0 ) && ( AnyError346 == 0 ) && ( AnyError925 == 0 ) )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A352TBT15_CRT_DATETIME) || (( A352TBT15_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A352TBT15_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A355TBT15_UPD_DATETIME) || (( A355TBT15_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A355TBT15_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0T28( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey0T28( )
   {
      /* Using cursor BC000T6 */
      pr_default.execute(4, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound28 = (short)(1) ;
      }
      else
      {
         RcdFound28 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000T3 */
      pr_default.execute(1, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0T28( 8) ;
         RcdFound28 = (short)(1) ;
         A352TBT15_CRT_DATETIME = BC000T3_A352TBT15_CRT_DATETIME[0] ;
         n352TBT15_CRT_DATETIME = BC000T3_n352TBT15_CRT_DATETIME[0] ;
         A353TBT15_CRT_USER_ID = BC000T3_A353TBT15_CRT_USER_ID[0] ;
         n353TBT15_CRT_USER_ID = BC000T3_n353TBT15_CRT_USER_ID[0] ;
         A355TBT15_UPD_DATETIME = BC000T3_A355TBT15_UPD_DATETIME[0] ;
         n355TBT15_UPD_DATETIME = BC000T3_n355TBT15_UPD_DATETIME[0] ;
         A356TBT15_UPD_USER_ID = BC000T3_A356TBT15_UPD_USER_ID[0] ;
         n356TBT15_UPD_USER_ID = BC000T3_n356TBT15_UPD_USER_ID[0] ;
         A358TBT15_UPD_CNT = BC000T3_A358TBT15_UPD_CNT[0] ;
         n358TBT15_UPD_CNT = BC000T3_n358TBT15_UPD_CNT[0] ;
         A347TBT15_CRF_ID = BC000T3_A347TBT15_CRF_ID[0] ;
         n347TBT15_CRF_ID = BC000T3_n347TBT15_CRF_ID[0] ;
         A348TBT15_CRF_VERSION = BC000T3_A348TBT15_CRF_VERSION[0] ;
         n348TBT15_CRF_VERSION = BC000T3_n348TBT15_CRF_VERSION[0] ;
         A932TBT15_CRF_ITEM_GRP_DIV = BC000T3_A932TBT15_CRF_ITEM_GRP_DIV[0] ;
         n932TBT15_CRF_ITEM_GRP_DIV = BC000T3_n932TBT15_CRF_ITEM_GRP_DIV[0] ;
         A926TBT15_CRF_ITEM_GRP_CD = BC000T3_A926TBT15_CRF_ITEM_GRP_CD[0] ;
         n926TBT15_CRF_ITEM_GRP_CD = BC000T3_n926TBT15_CRF_ITEM_GRP_CD[0] ;
         A351TBT15_DEL_FLG = BC000T3_A351TBT15_DEL_FLG[0] ;
         n351TBT15_DEL_FLG = BC000T3_n351TBT15_DEL_FLG[0] ;
         A354TBT15_CRT_PROG_NM = BC000T3_A354TBT15_CRT_PROG_NM[0] ;
         n354TBT15_CRT_PROG_NM = BC000T3_n354TBT15_CRT_PROG_NM[0] ;
         A357TBT15_UPD_PROG_NM = BC000T3_A357TBT15_UPD_PROG_NM[0] ;
         n357TBT15_UPD_PROG_NM = BC000T3_n357TBT15_UPD_PROG_NM[0] ;
         A345TBT15_STUDY_ID = BC000T3_A345TBT15_STUDY_ID[0] ;
         A346TBT15_SUBJECT_ID = BC000T3_A346TBT15_SUBJECT_ID[0] ;
         A925TBT15_MEMO_NO = BC000T3_A925TBT15_MEMO_NO[0] ;
         O358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
         n358TBT15_UPD_CNT = false ;
         Z345TBT15_STUDY_ID = A345TBT15_STUDY_ID ;
         Z346TBT15_SUBJECT_ID = A346TBT15_SUBJECT_ID ;
         Z925TBT15_MEMO_NO = A925TBT15_MEMO_NO ;
         sMode28 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0T28( ) ;
         Gx_mode = sMode28 ;
      }
      else
      {
         RcdFound28 = (short)(0) ;
         initializeNonKey0T28( ) ;
         sMode28 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode28 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0T28( ) ;
      if ( RcdFound28 == 0 )
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
      confirm_0T0( ) ;
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

   public void checkOptimisticConcurrency0T28( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000T2 */
         pr_default.execute(0, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT15_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z352TBT15_CRT_DATETIME.equals( BC000T2_A352TBT15_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z353TBT15_CRT_USER_ID, BC000T2_A353TBT15_CRT_USER_ID[0]) != 0 ) || !( Z355TBT15_UPD_DATETIME.equals( BC000T2_A355TBT15_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z356TBT15_UPD_USER_ID, BC000T2_A356TBT15_UPD_USER_ID[0]) != 0 ) || ( Z358TBT15_UPD_CNT != BC000T2_A358TBT15_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z347TBT15_CRF_ID != BC000T2_A347TBT15_CRF_ID[0] ) || ( Z348TBT15_CRF_VERSION != BC000T2_A348TBT15_CRF_VERSION[0] ) || ( GXutil.strcmp(Z932TBT15_CRF_ITEM_GRP_DIV, BC000T2_A932TBT15_CRF_ITEM_GRP_DIV[0]) != 0 ) || ( GXutil.strcmp(Z926TBT15_CRF_ITEM_GRP_CD, BC000T2_A926TBT15_CRF_ITEM_GRP_CD[0]) != 0 ) || ( GXutil.strcmp(Z351TBT15_DEL_FLG, BC000T2_A351TBT15_DEL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z354TBT15_CRT_PROG_NM, BC000T2_A354TBT15_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z357TBT15_UPD_PROG_NM, BC000T2_A357TBT15_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT15_CRF_MEMO_LOC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0T28( )
   {
      beforeValidate0T28( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T28( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0T28( 0) ;
         checkOptimisticConcurrency0T28( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T28( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0T28( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000T7 */
                  pr_default.execute(5, new Object[] {new Boolean(n352TBT15_CRT_DATETIME), A352TBT15_CRT_DATETIME, new Boolean(n353TBT15_CRT_USER_ID), A353TBT15_CRT_USER_ID, new Boolean(n355TBT15_UPD_DATETIME), A355TBT15_UPD_DATETIME, new Boolean(n356TBT15_UPD_USER_ID), A356TBT15_UPD_USER_ID, new Boolean(n358TBT15_UPD_CNT), new Long(A358TBT15_UPD_CNT), new Boolean(n347TBT15_CRF_ID), new Short(A347TBT15_CRF_ID), new Boolean(n348TBT15_CRF_VERSION), new Short(A348TBT15_CRF_VERSION), new Boolean(n932TBT15_CRF_ITEM_GRP_DIV), A932TBT15_CRF_ITEM_GRP_DIV, new Boolean(n926TBT15_CRF_ITEM_GRP_CD), A926TBT15_CRF_ITEM_GRP_CD, new Boolean(n351TBT15_DEL_FLG), A351TBT15_DEL_FLG, new Boolean(n354TBT15_CRT_PROG_NM), A354TBT15_CRT_PROG_NM, new Boolean(n357TBT15_UPD_PROG_NM), A357TBT15_UPD_PROG_NM, new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
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
            load0T28( ) ;
         }
         endLevel0T28( ) ;
      }
      closeExtendedTableCursors0T28( ) ;
   }

   public void update0T28( )
   {
      beforeValidate0T28( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T28( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T28( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T28( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0T28( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000T8 */
                  pr_default.execute(6, new Object[] {new Boolean(n352TBT15_CRT_DATETIME), A352TBT15_CRT_DATETIME, new Boolean(n353TBT15_CRT_USER_ID), A353TBT15_CRT_USER_ID, new Boolean(n355TBT15_UPD_DATETIME), A355TBT15_UPD_DATETIME, new Boolean(n356TBT15_UPD_USER_ID), A356TBT15_UPD_USER_ID, new Boolean(n358TBT15_UPD_CNT), new Long(A358TBT15_UPD_CNT), new Boolean(n347TBT15_CRF_ID), new Short(A347TBT15_CRF_ID), new Boolean(n348TBT15_CRF_VERSION), new Short(A348TBT15_CRF_VERSION), new Boolean(n932TBT15_CRF_ITEM_GRP_DIV), A932TBT15_CRF_ITEM_GRP_DIV, new Boolean(n926TBT15_CRF_ITEM_GRP_CD), A926TBT15_CRF_ITEM_GRP_CD, new Boolean(n351TBT15_DEL_FLG), A351TBT15_DEL_FLG, new Boolean(n354TBT15_CRT_PROG_NM), A354TBT15_CRT_PROG_NM, new Boolean(n357TBT15_UPD_PROG_NM), A357TBT15_UPD_PROG_NM, new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT15_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0T28( ) ;
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
         endLevel0T28( ) ;
      }
      closeExtendedTableCursors0T28( ) ;
   }

   public void deferredUpdate0T28( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0T28( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T28( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0T28( ) ;
         afterConfirm0T28( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0T28( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000T9 */
               pr_default.execute(7, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
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
      sMode28 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0T28( ) ;
      Gx_mode = sMode28 ;
   }

   public void onDeleteControls0T28( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT15_CRF_MEMO_LOC_BC" ;
      }
   }

   public void endLevel0T28( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0T28( ) ;
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

   public void scanKeyStart0T28( )
   {
      /* Using cursor BC000T10 */
      pr_default.execute(8, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      RcdFound28 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A352TBT15_CRT_DATETIME = BC000T10_A352TBT15_CRT_DATETIME[0] ;
         n352TBT15_CRT_DATETIME = BC000T10_n352TBT15_CRT_DATETIME[0] ;
         A353TBT15_CRT_USER_ID = BC000T10_A353TBT15_CRT_USER_ID[0] ;
         n353TBT15_CRT_USER_ID = BC000T10_n353TBT15_CRT_USER_ID[0] ;
         A355TBT15_UPD_DATETIME = BC000T10_A355TBT15_UPD_DATETIME[0] ;
         n355TBT15_UPD_DATETIME = BC000T10_n355TBT15_UPD_DATETIME[0] ;
         A356TBT15_UPD_USER_ID = BC000T10_A356TBT15_UPD_USER_ID[0] ;
         n356TBT15_UPD_USER_ID = BC000T10_n356TBT15_UPD_USER_ID[0] ;
         A358TBT15_UPD_CNT = BC000T10_A358TBT15_UPD_CNT[0] ;
         n358TBT15_UPD_CNT = BC000T10_n358TBT15_UPD_CNT[0] ;
         A347TBT15_CRF_ID = BC000T10_A347TBT15_CRF_ID[0] ;
         n347TBT15_CRF_ID = BC000T10_n347TBT15_CRF_ID[0] ;
         A348TBT15_CRF_VERSION = BC000T10_A348TBT15_CRF_VERSION[0] ;
         n348TBT15_CRF_VERSION = BC000T10_n348TBT15_CRF_VERSION[0] ;
         A932TBT15_CRF_ITEM_GRP_DIV = BC000T10_A932TBT15_CRF_ITEM_GRP_DIV[0] ;
         n932TBT15_CRF_ITEM_GRP_DIV = BC000T10_n932TBT15_CRF_ITEM_GRP_DIV[0] ;
         A926TBT15_CRF_ITEM_GRP_CD = BC000T10_A926TBT15_CRF_ITEM_GRP_CD[0] ;
         n926TBT15_CRF_ITEM_GRP_CD = BC000T10_n926TBT15_CRF_ITEM_GRP_CD[0] ;
         A351TBT15_DEL_FLG = BC000T10_A351TBT15_DEL_FLG[0] ;
         n351TBT15_DEL_FLG = BC000T10_n351TBT15_DEL_FLG[0] ;
         A354TBT15_CRT_PROG_NM = BC000T10_A354TBT15_CRT_PROG_NM[0] ;
         n354TBT15_CRT_PROG_NM = BC000T10_n354TBT15_CRT_PROG_NM[0] ;
         A357TBT15_UPD_PROG_NM = BC000T10_A357TBT15_UPD_PROG_NM[0] ;
         n357TBT15_UPD_PROG_NM = BC000T10_n357TBT15_UPD_PROG_NM[0] ;
         A345TBT15_STUDY_ID = BC000T10_A345TBT15_STUDY_ID[0] ;
         A346TBT15_SUBJECT_ID = BC000T10_A346TBT15_SUBJECT_ID[0] ;
         A925TBT15_MEMO_NO = BC000T10_A925TBT15_MEMO_NO[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0T28( )
   {
      pr_default.readNext(8);
      RcdFound28 = (short)(0) ;
      scanKeyLoad0T28( ) ;
   }

   public void scanKeyLoad0T28( )
   {
      sMode28 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A352TBT15_CRT_DATETIME = BC000T10_A352TBT15_CRT_DATETIME[0] ;
         n352TBT15_CRT_DATETIME = BC000T10_n352TBT15_CRT_DATETIME[0] ;
         A353TBT15_CRT_USER_ID = BC000T10_A353TBT15_CRT_USER_ID[0] ;
         n353TBT15_CRT_USER_ID = BC000T10_n353TBT15_CRT_USER_ID[0] ;
         A355TBT15_UPD_DATETIME = BC000T10_A355TBT15_UPD_DATETIME[0] ;
         n355TBT15_UPD_DATETIME = BC000T10_n355TBT15_UPD_DATETIME[0] ;
         A356TBT15_UPD_USER_ID = BC000T10_A356TBT15_UPD_USER_ID[0] ;
         n356TBT15_UPD_USER_ID = BC000T10_n356TBT15_UPD_USER_ID[0] ;
         A358TBT15_UPD_CNT = BC000T10_A358TBT15_UPD_CNT[0] ;
         n358TBT15_UPD_CNT = BC000T10_n358TBT15_UPD_CNT[0] ;
         A347TBT15_CRF_ID = BC000T10_A347TBT15_CRF_ID[0] ;
         n347TBT15_CRF_ID = BC000T10_n347TBT15_CRF_ID[0] ;
         A348TBT15_CRF_VERSION = BC000T10_A348TBT15_CRF_VERSION[0] ;
         n348TBT15_CRF_VERSION = BC000T10_n348TBT15_CRF_VERSION[0] ;
         A932TBT15_CRF_ITEM_GRP_DIV = BC000T10_A932TBT15_CRF_ITEM_GRP_DIV[0] ;
         n932TBT15_CRF_ITEM_GRP_DIV = BC000T10_n932TBT15_CRF_ITEM_GRP_DIV[0] ;
         A926TBT15_CRF_ITEM_GRP_CD = BC000T10_A926TBT15_CRF_ITEM_GRP_CD[0] ;
         n926TBT15_CRF_ITEM_GRP_CD = BC000T10_n926TBT15_CRF_ITEM_GRP_CD[0] ;
         A351TBT15_DEL_FLG = BC000T10_A351TBT15_DEL_FLG[0] ;
         n351TBT15_DEL_FLG = BC000T10_n351TBT15_DEL_FLG[0] ;
         A354TBT15_CRT_PROG_NM = BC000T10_A354TBT15_CRT_PROG_NM[0] ;
         n354TBT15_CRT_PROG_NM = BC000T10_n354TBT15_CRT_PROG_NM[0] ;
         A357TBT15_UPD_PROG_NM = BC000T10_A357TBT15_UPD_PROG_NM[0] ;
         n357TBT15_UPD_PROG_NM = BC000T10_n357TBT15_UPD_PROG_NM[0] ;
         A345TBT15_STUDY_ID = BC000T10_A345TBT15_STUDY_ID[0] ;
         A346TBT15_SUBJECT_ID = BC000T10_A346TBT15_SUBJECT_ID[0] ;
         A925TBT15_MEMO_NO = BC000T10_A925TBT15_MEMO_NO[0] ;
      }
      Gx_mode = sMode28 ;
   }

   public void scanKeyEnd0T28( )
   {
      pr_default.close(8);
   }

   public void afterConfirm0T28( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0T28( )
   {
      /* Before Insert Rules */
      A352TBT15_CRT_DATETIME = GXutil.now( ) ;
      n352TBT15_CRT_DATETIME = false ;
      GXt_char1 = A353TBT15_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt15_crf_memo_loc_bc.this.GXt_char1 = GXv_char2[0] ;
      A353TBT15_CRT_USER_ID = GXt_char1 ;
      n353TBT15_CRT_USER_ID = false ;
      A355TBT15_UPD_DATETIME = GXutil.now( ) ;
      n355TBT15_UPD_DATETIME = false ;
      GXt_char1 = A356TBT15_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt15_crf_memo_loc_bc.this.GXt_char1 = GXv_char2[0] ;
      A356TBT15_UPD_USER_ID = GXt_char1 ;
      n356TBT15_UPD_USER_ID = false ;
      A358TBT15_UPD_CNT = (long)(O358TBT15_UPD_CNT+1) ;
      n358TBT15_UPD_CNT = false ;
   }

   public void beforeUpdate0T28( )
   {
      /* Before Update Rules */
      A355TBT15_UPD_DATETIME = GXutil.now( ) ;
      n355TBT15_UPD_DATETIME = false ;
      GXt_char1 = A356TBT15_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt15_crf_memo_loc_bc.this.GXt_char1 = GXv_char2[0] ;
      A356TBT15_UPD_USER_ID = GXt_char1 ;
      n356TBT15_UPD_USER_ID = false ;
      A358TBT15_UPD_CNT = (long)(O358TBT15_UPD_CNT+1) ;
      n358TBT15_UPD_CNT = false ;
   }

   public void beforeDelete0T28( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0T28( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0T28( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0T28( )
   {
   }

   public void addRow0T28( )
   {
      VarsToRow28( bcTBT15_CRF_MEMO_LOC) ;
   }

   public void readRow0T28( )
   {
      RowToVars28( bcTBT15_CRF_MEMO_LOC, 1) ;
   }

   public void initializeNonKey0T28( )
   {
      A352TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n352TBT15_CRT_DATETIME = false ;
      A353TBT15_CRT_USER_ID = "" ;
      n353TBT15_CRT_USER_ID = false ;
      A355TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n355TBT15_UPD_DATETIME = false ;
      A356TBT15_UPD_USER_ID = "" ;
      n356TBT15_UPD_USER_ID = false ;
      A358TBT15_UPD_CNT = 0 ;
      n358TBT15_UPD_CNT = false ;
      A347TBT15_CRF_ID = (short)(0) ;
      n347TBT15_CRF_ID = false ;
      A348TBT15_CRF_VERSION = (short)(0) ;
      n348TBT15_CRF_VERSION = false ;
      A932TBT15_CRF_ITEM_GRP_DIV = "" ;
      n932TBT15_CRF_ITEM_GRP_DIV = false ;
      A926TBT15_CRF_ITEM_GRP_CD = "" ;
      n926TBT15_CRF_ITEM_GRP_CD = false ;
      A351TBT15_DEL_FLG = "" ;
      n351TBT15_DEL_FLG = false ;
      A354TBT15_CRT_PROG_NM = "" ;
      n354TBT15_CRT_PROG_NM = false ;
      A357TBT15_UPD_PROG_NM = "" ;
      n357TBT15_UPD_PROG_NM = false ;
      O358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
      n358TBT15_UPD_CNT = false ;
   }

   public void initAll0T28( )
   {
      A345TBT15_STUDY_ID = 0 ;
      A346TBT15_SUBJECT_ID = 0 ;
      A925TBT15_MEMO_NO = (short)(0) ;
      initializeNonKey0T28( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow28( SdtTBT15_CRF_MEMO_LOC obj28 )
   {
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( Gx_mode );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime( A352TBT15_CRT_DATETIME );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id( A353TBT15_CRT_USER_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime( A355TBT15_UPD_DATETIME );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id( A356TBT15_UPD_USER_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt( A358TBT15_UPD_CNT );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id( A347TBT15_CRF_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version( A348TBT15_CRF_VERSION );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div( A932TBT15_CRF_ITEM_GRP_DIV );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd( A926TBT15_CRF_ITEM_GRP_CD );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg( A351TBT15_DEL_FLG );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm( A354TBT15_CRT_PROG_NM );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm( A357TBT15_UPD_PROG_NM );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id( A345TBT15_STUDY_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id( A346TBT15_SUBJECT_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no( A925TBT15_MEMO_NO );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z( Z345TBT15_STUDY_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z( Z346TBT15_SUBJECT_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z( Z925TBT15_MEMO_NO );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z( Z347TBT15_CRF_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z( Z348TBT15_CRF_VERSION );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z( Z932TBT15_CRF_ITEM_GRP_DIV );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z( Z926TBT15_CRF_ITEM_GRP_CD );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z( Z351TBT15_DEL_FLG );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z( Z352TBT15_CRT_DATETIME );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z( Z353TBT15_CRT_USER_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z( Z354TBT15_CRT_PROG_NM );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z( Z355TBT15_UPD_DATETIME );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z( Z356TBT15_UPD_USER_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z( Z357TBT15_UPD_PROG_NM );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z( Z358TBT15_UPD_CNT );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N( (byte)((byte)((n347TBT15_CRF_ID)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N( (byte)((byte)((n348TBT15_CRF_VERSION)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N( (byte)((byte)((n932TBT15_CRF_ITEM_GRP_DIV)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N( (byte)((byte)((n926TBT15_CRF_ITEM_GRP_CD)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N( (byte)((byte)((n351TBT15_DEL_FLG)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N( (byte)((byte)((n352TBT15_CRT_DATETIME)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N( (byte)((byte)((n353TBT15_CRT_USER_ID)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N( (byte)((byte)((n354TBT15_CRT_PROG_NM)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N( (byte)((byte)((n355TBT15_UPD_DATETIME)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N( (byte)((byte)((n356TBT15_UPD_USER_ID)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N( (byte)((byte)((n357TBT15_UPD_PROG_NM)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N( (byte)((byte)((n358TBT15_UPD_CNT)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( Gx_mode );
   }

   public void RowToVars28( SdtTBT15_CRF_MEMO_LOC obj28 ,
                            int forceLoad )
   {
      Gx_mode = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode() ;
      A352TBT15_CRT_DATETIME = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime() ;
      n352TBT15_CRT_DATETIME = false ;
      A353TBT15_CRT_USER_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id() ;
      n353TBT15_CRT_USER_ID = false ;
      A355TBT15_UPD_DATETIME = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime() ;
      n355TBT15_UPD_DATETIME = false ;
      A356TBT15_UPD_USER_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id() ;
      n356TBT15_UPD_USER_ID = false ;
      A358TBT15_UPD_CNT = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt() ;
      n358TBT15_UPD_CNT = false ;
      A347TBT15_CRF_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id() ;
      n347TBT15_CRF_ID = false ;
      A348TBT15_CRF_VERSION = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version() ;
      n348TBT15_CRF_VERSION = false ;
      A932TBT15_CRF_ITEM_GRP_DIV = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div() ;
      n932TBT15_CRF_ITEM_GRP_DIV = false ;
      A926TBT15_CRF_ITEM_GRP_CD = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd() ;
      n926TBT15_CRF_ITEM_GRP_CD = false ;
      A351TBT15_DEL_FLG = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg() ;
      n351TBT15_DEL_FLG = false ;
      A354TBT15_CRT_PROG_NM = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm() ;
      n354TBT15_CRT_PROG_NM = false ;
      A357TBT15_UPD_PROG_NM = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm() ;
      n357TBT15_UPD_PROG_NM = false ;
      A345TBT15_STUDY_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id() ;
      A346TBT15_SUBJECT_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id() ;
      A925TBT15_MEMO_NO = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no() ;
      Z345TBT15_STUDY_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z() ;
      Z346TBT15_SUBJECT_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z() ;
      Z925TBT15_MEMO_NO = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z() ;
      Z347TBT15_CRF_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z() ;
      Z348TBT15_CRF_VERSION = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z() ;
      Z932TBT15_CRF_ITEM_GRP_DIV = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z() ;
      Z926TBT15_CRF_ITEM_GRP_CD = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z() ;
      Z351TBT15_DEL_FLG = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z() ;
      Z352TBT15_CRT_DATETIME = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z() ;
      Z353TBT15_CRT_USER_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z() ;
      Z354TBT15_CRT_PROG_NM = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z() ;
      Z355TBT15_UPD_DATETIME = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z() ;
      Z356TBT15_UPD_USER_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z() ;
      Z357TBT15_UPD_PROG_NM = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z() ;
      Z358TBT15_UPD_CNT = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z() ;
      O358TBT15_UPD_CNT = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z() ;
      n347TBT15_CRF_ID = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N()==0)?false:true) ;
      n348TBT15_CRF_VERSION = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N()==0)?false:true) ;
      n932TBT15_CRF_ITEM_GRP_DIV = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N()==0)?false:true) ;
      n926TBT15_CRF_ITEM_GRP_CD = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N()==0)?false:true) ;
      n351TBT15_DEL_FLG = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N()==0)?false:true) ;
      n352TBT15_CRT_DATETIME = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N()==0)?false:true) ;
      n353TBT15_CRT_USER_ID = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N()==0)?false:true) ;
      n354TBT15_CRT_PROG_NM = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N()==0)?false:true) ;
      n355TBT15_UPD_DATETIME = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N()==0)?false:true) ;
      n356TBT15_UPD_USER_ID = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N()==0)?false:true) ;
      n357TBT15_UPD_PROG_NM = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N()==0)?false:true) ;
      n358TBT15_UPD_CNT = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A345TBT15_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A346TBT15_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A925TBT15_MEMO_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0T28( ) ;
      scanKeyStart0T28( ) ;
      if ( RcdFound28 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000T11 */
         pr_default.execute(9, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
         if ( (pr_default.getStatus(9) == 101) )
         {
            AnyError345 = 1 ;
            AnyError346 = 1 ;
            AnyError925 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRFメモ位置テーブル・CRFメモサブタイプ'", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
            AnyError = (short)(1) ;
         }
         if ( ( AnyError345 == 0 ) && ( AnyError346 == 0 ) && ( AnyError925 == 0 ) )
         {
         }
         pr_default.close(9);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z345TBT15_STUDY_ID = A345TBT15_STUDY_ID ;
         Z346TBT15_SUBJECT_ID = A346TBT15_SUBJECT_ID ;
         Z925TBT15_MEMO_NO = A925TBT15_MEMO_NO ;
         O358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
         n358TBT15_UPD_CNT = false ;
      }
      zm0T28( -8) ;
      sMode28 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0T28( ) ;
      Gx_mode = sMode28 ;
      addRow0T28( ) ;
      scanKeyEnd0T28( ) ;
      if ( RcdFound28 == 0 )
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
      RowToVars28( bcTBT15_CRF_MEMO_LOC, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0T28( ) ;
      if ( RcdFound28 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A345TBT15_STUDY_ID != Z345TBT15_STUDY_ID ) || ( A346TBT15_SUBJECT_ID != Z346TBT15_SUBJECT_ID ) || ( A925TBT15_MEMO_NO != Z925TBT15_MEMO_NO ) )
         {
            A345TBT15_STUDY_ID = Z345TBT15_STUDY_ID ;
            A346TBT15_SUBJECT_ID = Z346TBT15_SUBJECT_ID ;
            A925TBT15_MEMO_NO = Z925TBT15_MEMO_NO ;
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
            update0T28( ) ;
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
            if ( ( A345TBT15_STUDY_ID != Z345TBT15_STUDY_ID ) || ( A346TBT15_SUBJECT_ID != Z346TBT15_SUBJECT_ID ) || ( A925TBT15_MEMO_NO != Z925TBT15_MEMO_NO ) )
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
                  insert0T28( ) ;
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
                  insert0T28( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow28( bcTBT15_CRF_MEMO_LOC) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars28( bcTBT15_CRF_MEMO_LOC, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0T28( ) ;
      if ( RcdFound28 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A345TBT15_STUDY_ID != Z345TBT15_STUDY_ID ) || ( A346TBT15_SUBJECT_ID != Z346TBT15_SUBJECT_ID ) || ( A925TBT15_MEMO_NO != Z925TBT15_MEMO_NO ) )
         {
            A345TBT15_STUDY_ID = Z345TBT15_STUDY_ID ;
            A346TBT15_SUBJECT_ID = Z346TBT15_SUBJECT_ID ;
            A925TBT15_MEMO_NO = Z925TBT15_MEMO_NO ;
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
         if ( ( A345TBT15_STUDY_ID != Z345TBT15_STUDY_ID ) || ( A346TBT15_SUBJECT_ID != Z346TBT15_SUBJECT_ID ) || ( A925TBT15_MEMO_NO != Z925TBT15_MEMO_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt15_crf_memo_loc_bc");
      VarsToRow28( bcTBT15_CRF_MEMO_LOC) ;
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
      Gx_mode = bcTBT15_CRF_MEMO_LOC.getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT15_CRF_MEMO_LOC.setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT15_CRF_MEMO_LOC sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT15_CRF_MEMO_LOC )
      {
         bcTBT15_CRF_MEMO_LOC = sdt ;
         if ( GXutil.strcmp(bcTBT15_CRF_MEMO_LOC.getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode(), "") == 0 )
         {
            bcTBT15_CRF_MEMO_LOC.setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow28( bcTBT15_CRF_MEMO_LOC) ;
         }
         else
         {
            RowToVars28( bcTBT15_CRF_MEMO_LOC, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT15_CRF_MEMO_LOC.getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode(), "") == 0 )
         {
            bcTBT15_CRF_MEMO_LOC.setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars28( bcTBT15_CRF_MEMO_LOC, 1) ;
   }

   public SdtTBT15_CRF_MEMO_LOC getTBT15_CRF_MEMO_LOC_BC( )
   {
      return bcTBT15_CRF_MEMO_LOC ;
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
                  /* Execute user subroutine: S1170 */
                  S1170 ();
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
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z = "" ;
      Z352TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A352TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z353TBT15_CRT_USER_ID = "" ;
      A353TBT15_CRT_USER_ID = "" ;
      Z355TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A355TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z356TBT15_UPD_USER_ID = "" ;
      A356TBT15_UPD_USER_ID = "" ;
      Z932TBT15_CRF_ITEM_GRP_DIV = "" ;
      A932TBT15_CRF_ITEM_GRP_DIV = "" ;
      Z926TBT15_CRF_ITEM_GRP_CD = "" ;
      A926TBT15_CRF_ITEM_GRP_CD = "" ;
      Z351TBT15_DEL_FLG = "" ;
      A351TBT15_DEL_FLG = "" ;
      Z354TBT15_CRT_PROG_NM = "" ;
      A354TBT15_CRT_PROG_NM = "" ;
      Z357TBT15_UPD_PROG_NM = "" ;
      A357TBT15_UPD_PROG_NM = "" ;
      BC000T5_A352TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T5_n352TBT15_CRT_DATETIME = new boolean[] {false} ;
      BC000T5_A353TBT15_CRT_USER_ID = new String[] {""} ;
      BC000T5_n353TBT15_CRT_USER_ID = new boolean[] {false} ;
      BC000T5_A355TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T5_n355TBT15_UPD_DATETIME = new boolean[] {false} ;
      BC000T5_A356TBT15_UPD_USER_ID = new String[] {""} ;
      BC000T5_n356TBT15_UPD_USER_ID = new boolean[] {false} ;
      BC000T5_A358TBT15_UPD_CNT = new long[1] ;
      BC000T5_n358TBT15_UPD_CNT = new boolean[] {false} ;
      BC000T5_A347TBT15_CRF_ID = new short[1] ;
      BC000T5_n347TBT15_CRF_ID = new boolean[] {false} ;
      BC000T5_A348TBT15_CRF_VERSION = new short[1] ;
      BC000T5_n348TBT15_CRF_VERSION = new boolean[] {false} ;
      BC000T5_A932TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000T5_n932TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      BC000T5_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000T5_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000T5_A351TBT15_DEL_FLG = new String[] {""} ;
      BC000T5_n351TBT15_DEL_FLG = new boolean[] {false} ;
      BC000T5_A354TBT15_CRT_PROG_NM = new String[] {""} ;
      BC000T5_n354TBT15_CRT_PROG_NM = new boolean[] {false} ;
      BC000T5_A357TBT15_UPD_PROG_NM = new String[] {""} ;
      BC000T5_n357TBT15_UPD_PROG_NM = new boolean[] {false} ;
      BC000T5_A345TBT15_STUDY_ID = new long[1] ;
      BC000T5_A346TBT15_SUBJECT_ID = new int[1] ;
      BC000T5_A925TBT15_MEMO_NO = new short[1] ;
      BC000T4_A345TBT15_STUDY_ID = new long[1] ;
      BC000T6_A345TBT15_STUDY_ID = new long[1] ;
      BC000T6_A346TBT15_SUBJECT_ID = new int[1] ;
      BC000T6_A925TBT15_MEMO_NO = new short[1] ;
      BC000T3_A352TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T3_n352TBT15_CRT_DATETIME = new boolean[] {false} ;
      BC000T3_A353TBT15_CRT_USER_ID = new String[] {""} ;
      BC000T3_n353TBT15_CRT_USER_ID = new boolean[] {false} ;
      BC000T3_A355TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T3_n355TBT15_UPD_DATETIME = new boolean[] {false} ;
      BC000T3_A356TBT15_UPD_USER_ID = new String[] {""} ;
      BC000T3_n356TBT15_UPD_USER_ID = new boolean[] {false} ;
      BC000T3_A358TBT15_UPD_CNT = new long[1] ;
      BC000T3_n358TBT15_UPD_CNT = new boolean[] {false} ;
      BC000T3_A347TBT15_CRF_ID = new short[1] ;
      BC000T3_n347TBT15_CRF_ID = new boolean[] {false} ;
      BC000T3_A348TBT15_CRF_VERSION = new short[1] ;
      BC000T3_n348TBT15_CRF_VERSION = new boolean[] {false} ;
      BC000T3_A932TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000T3_n932TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      BC000T3_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000T3_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000T3_A351TBT15_DEL_FLG = new String[] {""} ;
      BC000T3_n351TBT15_DEL_FLG = new boolean[] {false} ;
      BC000T3_A354TBT15_CRT_PROG_NM = new String[] {""} ;
      BC000T3_n354TBT15_CRT_PROG_NM = new boolean[] {false} ;
      BC000T3_A357TBT15_UPD_PROG_NM = new String[] {""} ;
      BC000T3_n357TBT15_UPD_PROG_NM = new boolean[] {false} ;
      BC000T3_A345TBT15_STUDY_ID = new long[1] ;
      BC000T3_A346TBT15_SUBJECT_ID = new int[1] ;
      BC000T3_A925TBT15_MEMO_NO = new short[1] ;
      sMode28 = "" ;
      BC000T2_A352TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T2_n352TBT15_CRT_DATETIME = new boolean[] {false} ;
      BC000T2_A353TBT15_CRT_USER_ID = new String[] {""} ;
      BC000T2_n353TBT15_CRT_USER_ID = new boolean[] {false} ;
      BC000T2_A355TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T2_n355TBT15_UPD_DATETIME = new boolean[] {false} ;
      BC000T2_A356TBT15_UPD_USER_ID = new String[] {""} ;
      BC000T2_n356TBT15_UPD_USER_ID = new boolean[] {false} ;
      BC000T2_A358TBT15_UPD_CNT = new long[1] ;
      BC000T2_n358TBT15_UPD_CNT = new boolean[] {false} ;
      BC000T2_A347TBT15_CRF_ID = new short[1] ;
      BC000T2_n347TBT15_CRF_ID = new boolean[] {false} ;
      BC000T2_A348TBT15_CRF_VERSION = new short[1] ;
      BC000T2_n348TBT15_CRF_VERSION = new boolean[] {false} ;
      BC000T2_A932TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000T2_n932TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      BC000T2_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000T2_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000T2_A351TBT15_DEL_FLG = new String[] {""} ;
      BC000T2_n351TBT15_DEL_FLG = new boolean[] {false} ;
      BC000T2_A354TBT15_CRT_PROG_NM = new String[] {""} ;
      BC000T2_n354TBT15_CRT_PROG_NM = new boolean[] {false} ;
      BC000T2_A357TBT15_UPD_PROG_NM = new String[] {""} ;
      BC000T2_n357TBT15_UPD_PROG_NM = new boolean[] {false} ;
      BC000T2_A345TBT15_STUDY_ID = new long[1] ;
      BC000T2_A346TBT15_SUBJECT_ID = new int[1] ;
      BC000T2_A925TBT15_MEMO_NO = new short[1] ;
      BC000T10_A352TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T10_n352TBT15_CRT_DATETIME = new boolean[] {false} ;
      BC000T10_A353TBT15_CRT_USER_ID = new String[] {""} ;
      BC000T10_n353TBT15_CRT_USER_ID = new boolean[] {false} ;
      BC000T10_A355TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T10_n355TBT15_UPD_DATETIME = new boolean[] {false} ;
      BC000T10_A356TBT15_UPD_USER_ID = new String[] {""} ;
      BC000T10_n356TBT15_UPD_USER_ID = new boolean[] {false} ;
      BC000T10_A358TBT15_UPD_CNT = new long[1] ;
      BC000T10_n358TBT15_UPD_CNT = new boolean[] {false} ;
      BC000T10_A347TBT15_CRF_ID = new short[1] ;
      BC000T10_n347TBT15_CRF_ID = new boolean[] {false} ;
      BC000T10_A348TBT15_CRF_VERSION = new short[1] ;
      BC000T10_n348TBT15_CRF_VERSION = new boolean[] {false} ;
      BC000T10_A932TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000T10_n932TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      BC000T10_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000T10_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000T10_A351TBT15_DEL_FLG = new String[] {""} ;
      BC000T10_n351TBT15_DEL_FLG = new boolean[] {false} ;
      BC000T10_A354TBT15_CRT_PROG_NM = new String[] {""} ;
      BC000T10_n354TBT15_CRT_PROG_NM = new boolean[] {false} ;
      BC000T10_A357TBT15_UPD_PROG_NM = new String[] {""} ;
      BC000T10_n357TBT15_UPD_PROG_NM = new boolean[] {false} ;
      BC000T10_A345TBT15_STUDY_ID = new long[1] ;
      BC000T10_A346TBT15_SUBJECT_ID = new int[1] ;
      BC000T10_A925TBT15_MEMO_NO = new short[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000T11_A345TBT15_STUDY_ID = new long[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt15_crf_memo_loc_bc__default(),
         new Object[] {
             new Object[] {
            BC000T2_A352TBT15_CRT_DATETIME, BC000T2_n352TBT15_CRT_DATETIME, BC000T2_A353TBT15_CRT_USER_ID, BC000T2_n353TBT15_CRT_USER_ID, BC000T2_A355TBT15_UPD_DATETIME, BC000T2_n355TBT15_UPD_DATETIME, BC000T2_A356TBT15_UPD_USER_ID, BC000T2_n356TBT15_UPD_USER_ID, BC000T2_A358TBT15_UPD_CNT, BC000T2_n358TBT15_UPD_CNT,
            BC000T2_A347TBT15_CRF_ID, BC000T2_n347TBT15_CRF_ID, BC000T2_A348TBT15_CRF_VERSION, BC000T2_n348TBT15_CRF_VERSION, BC000T2_A932TBT15_CRF_ITEM_GRP_DIV, BC000T2_n932TBT15_CRF_ITEM_GRP_DIV, BC000T2_A926TBT15_CRF_ITEM_GRP_CD, BC000T2_n926TBT15_CRF_ITEM_GRP_CD, BC000T2_A351TBT15_DEL_FLG, BC000T2_n351TBT15_DEL_FLG,
            BC000T2_A354TBT15_CRT_PROG_NM, BC000T2_n354TBT15_CRT_PROG_NM, BC000T2_A357TBT15_UPD_PROG_NM, BC000T2_n357TBT15_UPD_PROG_NM, BC000T2_A345TBT15_STUDY_ID, BC000T2_A346TBT15_SUBJECT_ID, BC000T2_A925TBT15_MEMO_NO
            }
            , new Object[] {
            BC000T3_A352TBT15_CRT_DATETIME, BC000T3_n352TBT15_CRT_DATETIME, BC000T3_A353TBT15_CRT_USER_ID, BC000T3_n353TBT15_CRT_USER_ID, BC000T3_A355TBT15_UPD_DATETIME, BC000T3_n355TBT15_UPD_DATETIME, BC000T3_A356TBT15_UPD_USER_ID, BC000T3_n356TBT15_UPD_USER_ID, BC000T3_A358TBT15_UPD_CNT, BC000T3_n358TBT15_UPD_CNT,
            BC000T3_A347TBT15_CRF_ID, BC000T3_n347TBT15_CRF_ID, BC000T3_A348TBT15_CRF_VERSION, BC000T3_n348TBT15_CRF_VERSION, BC000T3_A932TBT15_CRF_ITEM_GRP_DIV, BC000T3_n932TBT15_CRF_ITEM_GRP_DIV, BC000T3_A926TBT15_CRF_ITEM_GRP_CD, BC000T3_n926TBT15_CRF_ITEM_GRP_CD, BC000T3_A351TBT15_DEL_FLG, BC000T3_n351TBT15_DEL_FLG,
            BC000T3_A354TBT15_CRT_PROG_NM, BC000T3_n354TBT15_CRT_PROG_NM, BC000T3_A357TBT15_UPD_PROG_NM, BC000T3_n357TBT15_UPD_PROG_NM, BC000T3_A345TBT15_STUDY_ID, BC000T3_A346TBT15_SUBJECT_ID, BC000T3_A925TBT15_MEMO_NO
            }
            , new Object[] {
            BC000T4_A345TBT15_STUDY_ID
            }
            , new Object[] {
            BC000T5_A352TBT15_CRT_DATETIME, BC000T5_n352TBT15_CRT_DATETIME, BC000T5_A353TBT15_CRT_USER_ID, BC000T5_n353TBT15_CRT_USER_ID, BC000T5_A355TBT15_UPD_DATETIME, BC000T5_n355TBT15_UPD_DATETIME, BC000T5_A356TBT15_UPD_USER_ID, BC000T5_n356TBT15_UPD_USER_ID, BC000T5_A358TBT15_UPD_CNT, BC000T5_n358TBT15_UPD_CNT,
            BC000T5_A347TBT15_CRF_ID, BC000T5_n347TBT15_CRF_ID, BC000T5_A348TBT15_CRF_VERSION, BC000T5_n348TBT15_CRF_VERSION, BC000T5_A932TBT15_CRF_ITEM_GRP_DIV, BC000T5_n932TBT15_CRF_ITEM_GRP_DIV, BC000T5_A926TBT15_CRF_ITEM_GRP_CD, BC000T5_n926TBT15_CRF_ITEM_GRP_CD, BC000T5_A351TBT15_DEL_FLG, BC000T5_n351TBT15_DEL_FLG,
            BC000T5_A354TBT15_CRT_PROG_NM, BC000T5_n354TBT15_CRT_PROG_NM, BC000T5_A357TBT15_UPD_PROG_NM, BC000T5_n357TBT15_UPD_PROG_NM, BC000T5_A345TBT15_STUDY_ID, BC000T5_A346TBT15_SUBJECT_ID, BC000T5_A925TBT15_MEMO_NO
            }
            , new Object[] {
            BC000T6_A345TBT15_STUDY_ID, BC000T6_A346TBT15_SUBJECT_ID, BC000T6_A925TBT15_MEMO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000T10_A352TBT15_CRT_DATETIME, BC000T10_n352TBT15_CRT_DATETIME, BC000T10_A353TBT15_CRT_USER_ID, BC000T10_n353TBT15_CRT_USER_ID, BC000T10_A355TBT15_UPD_DATETIME, BC000T10_n355TBT15_UPD_DATETIME, BC000T10_A356TBT15_UPD_USER_ID, BC000T10_n356TBT15_UPD_USER_ID, BC000T10_A358TBT15_UPD_CNT, BC000T10_n358TBT15_UPD_CNT,
            BC000T10_A347TBT15_CRF_ID, BC000T10_n347TBT15_CRF_ID, BC000T10_A348TBT15_CRF_VERSION, BC000T10_n348TBT15_CRF_VERSION, BC000T10_A932TBT15_CRF_ITEM_GRP_DIV, BC000T10_n932TBT15_CRF_ITEM_GRP_DIV, BC000T10_A926TBT15_CRF_ITEM_GRP_CD, BC000T10_n926TBT15_CRF_ITEM_GRP_CD, BC000T10_A351TBT15_DEL_FLG, BC000T10_n351TBT15_DEL_FLG,
            BC000T10_A354TBT15_CRT_PROG_NM, BC000T10_n354TBT15_CRT_PROG_NM, BC000T10_A357TBT15_UPD_PROG_NM, BC000T10_n357TBT15_UPD_PROG_NM, BC000T10_A345TBT15_STUDY_ID, BC000T10_A346TBT15_SUBJECT_ID, BC000T10_A925TBT15_MEMO_NO
            }
            , new Object[] {
            BC000T11_A345TBT15_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT15_CRF_MEMO_LOC_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110T2 */
      e110T2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z925TBT15_MEMO_NO ;
   private short A925TBT15_MEMO_NO ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z ;
   private short Z347TBT15_CRF_ID ;
   private short A347TBT15_CRF_ID ;
   private short Z348TBT15_CRF_VERSION ;
   private short A348TBT15_CRF_VERSION ;
   private short RcdFound28 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z346TBT15_SUBJECT_ID ;
   private int A346TBT15_SUBJECT_ID ;
   private int gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z ;
   private int GX_JID ;
   private int AnyError345 ;
   private int AnyError346 ;
   private int AnyError925 ;
   private int GXActiveErrHndl ;
   private long Z345TBT15_STUDY_ID ;
   private long A345TBT15_STUDY_ID ;
   private long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z ;
   private long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z ;
   private long Z358TBT15_UPD_CNT ;
   private long A358TBT15_UPD_CNT ;
   private long O358TBT15_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode28 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z ;
   private java.util.Date Z352TBT15_CRT_DATETIME ;
   private java.util.Date A352TBT15_CRT_DATETIME ;
   private java.util.Date Z355TBT15_UPD_DATETIME ;
   private java.util.Date A355TBT15_UPD_DATETIME ;
   private boolean n352TBT15_CRT_DATETIME ;
   private boolean n353TBT15_CRT_USER_ID ;
   private boolean n355TBT15_UPD_DATETIME ;
   private boolean n356TBT15_UPD_USER_ID ;
   private boolean n358TBT15_UPD_CNT ;
   private boolean n347TBT15_CRF_ID ;
   private boolean n348TBT15_CRF_VERSION ;
   private boolean n932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean n926TBT15_CRF_ITEM_GRP_CD ;
   private boolean n351TBT15_DEL_FLG ;
   private boolean n354TBT15_CRT_PROG_NM ;
   private boolean n357TBT15_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z ;
   private String Z353TBT15_CRT_USER_ID ;
   private String A353TBT15_CRT_USER_ID ;
   private String Z356TBT15_UPD_USER_ID ;
   private String A356TBT15_UPD_USER_ID ;
   private String Z932TBT15_CRF_ITEM_GRP_DIV ;
   private String A932TBT15_CRF_ITEM_GRP_DIV ;
   private String Z926TBT15_CRF_ITEM_GRP_CD ;
   private String A926TBT15_CRF_ITEM_GRP_CD ;
   private String Z351TBT15_DEL_FLG ;
   private String A351TBT15_DEL_FLG ;
   private String Z354TBT15_CRT_PROG_NM ;
   private String A354TBT15_CRT_PROG_NM ;
   private String Z357TBT15_UPD_PROG_NM ;
   private String A357TBT15_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT15_CRF_MEMO_LOC bcTBT15_CRF_MEMO_LOC ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC000T5_A352TBT15_CRT_DATETIME ;
   private boolean[] BC000T5_n352TBT15_CRT_DATETIME ;
   private String[] BC000T5_A353TBT15_CRT_USER_ID ;
   private boolean[] BC000T5_n353TBT15_CRT_USER_ID ;
   private java.util.Date[] BC000T5_A355TBT15_UPD_DATETIME ;
   private boolean[] BC000T5_n355TBT15_UPD_DATETIME ;
   private String[] BC000T5_A356TBT15_UPD_USER_ID ;
   private boolean[] BC000T5_n356TBT15_UPD_USER_ID ;
   private long[] BC000T5_A358TBT15_UPD_CNT ;
   private boolean[] BC000T5_n358TBT15_UPD_CNT ;
   private short[] BC000T5_A347TBT15_CRF_ID ;
   private boolean[] BC000T5_n347TBT15_CRF_ID ;
   private short[] BC000T5_A348TBT15_CRF_VERSION ;
   private boolean[] BC000T5_n348TBT15_CRF_VERSION ;
   private String[] BC000T5_A932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] BC000T5_n932TBT15_CRF_ITEM_GRP_DIV ;
   private String[] BC000T5_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] BC000T5_n926TBT15_CRF_ITEM_GRP_CD ;
   private String[] BC000T5_A351TBT15_DEL_FLG ;
   private boolean[] BC000T5_n351TBT15_DEL_FLG ;
   private String[] BC000T5_A354TBT15_CRT_PROG_NM ;
   private boolean[] BC000T5_n354TBT15_CRT_PROG_NM ;
   private String[] BC000T5_A357TBT15_UPD_PROG_NM ;
   private boolean[] BC000T5_n357TBT15_UPD_PROG_NM ;
   private long[] BC000T5_A345TBT15_STUDY_ID ;
   private int[] BC000T5_A346TBT15_SUBJECT_ID ;
   private short[] BC000T5_A925TBT15_MEMO_NO ;
   private long[] BC000T4_A345TBT15_STUDY_ID ;
   private long[] BC000T6_A345TBT15_STUDY_ID ;
   private int[] BC000T6_A346TBT15_SUBJECT_ID ;
   private short[] BC000T6_A925TBT15_MEMO_NO ;
   private java.util.Date[] BC000T3_A352TBT15_CRT_DATETIME ;
   private boolean[] BC000T3_n352TBT15_CRT_DATETIME ;
   private String[] BC000T3_A353TBT15_CRT_USER_ID ;
   private boolean[] BC000T3_n353TBT15_CRT_USER_ID ;
   private java.util.Date[] BC000T3_A355TBT15_UPD_DATETIME ;
   private boolean[] BC000T3_n355TBT15_UPD_DATETIME ;
   private String[] BC000T3_A356TBT15_UPD_USER_ID ;
   private boolean[] BC000T3_n356TBT15_UPD_USER_ID ;
   private long[] BC000T3_A358TBT15_UPD_CNT ;
   private boolean[] BC000T3_n358TBT15_UPD_CNT ;
   private short[] BC000T3_A347TBT15_CRF_ID ;
   private boolean[] BC000T3_n347TBT15_CRF_ID ;
   private short[] BC000T3_A348TBT15_CRF_VERSION ;
   private boolean[] BC000T3_n348TBT15_CRF_VERSION ;
   private String[] BC000T3_A932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] BC000T3_n932TBT15_CRF_ITEM_GRP_DIV ;
   private String[] BC000T3_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] BC000T3_n926TBT15_CRF_ITEM_GRP_CD ;
   private String[] BC000T3_A351TBT15_DEL_FLG ;
   private boolean[] BC000T3_n351TBT15_DEL_FLG ;
   private String[] BC000T3_A354TBT15_CRT_PROG_NM ;
   private boolean[] BC000T3_n354TBT15_CRT_PROG_NM ;
   private String[] BC000T3_A357TBT15_UPD_PROG_NM ;
   private boolean[] BC000T3_n357TBT15_UPD_PROG_NM ;
   private long[] BC000T3_A345TBT15_STUDY_ID ;
   private int[] BC000T3_A346TBT15_SUBJECT_ID ;
   private short[] BC000T3_A925TBT15_MEMO_NO ;
   private java.util.Date[] BC000T2_A352TBT15_CRT_DATETIME ;
   private boolean[] BC000T2_n352TBT15_CRT_DATETIME ;
   private String[] BC000T2_A353TBT15_CRT_USER_ID ;
   private boolean[] BC000T2_n353TBT15_CRT_USER_ID ;
   private java.util.Date[] BC000T2_A355TBT15_UPD_DATETIME ;
   private boolean[] BC000T2_n355TBT15_UPD_DATETIME ;
   private String[] BC000T2_A356TBT15_UPD_USER_ID ;
   private boolean[] BC000T2_n356TBT15_UPD_USER_ID ;
   private long[] BC000T2_A358TBT15_UPD_CNT ;
   private boolean[] BC000T2_n358TBT15_UPD_CNT ;
   private short[] BC000T2_A347TBT15_CRF_ID ;
   private boolean[] BC000T2_n347TBT15_CRF_ID ;
   private short[] BC000T2_A348TBT15_CRF_VERSION ;
   private boolean[] BC000T2_n348TBT15_CRF_VERSION ;
   private String[] BC000T2_A932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] BC000T2_n932TBT15_CRF_ITEM_GRP_DIV ;
   private String[] BC000T2_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] BC000T2_n926TBT15_CRF_ITEM_GRP_CD ;
   private String[] BC000T2_A351TBT15_DEL_FLG ;
   private boolean[] BC000T2_n351TBT15_DEL_FLG ;
   private String[] BC000T2_A354TBT15_CRT_PROG_NM ;
   private boolean[] BC000T2_n354TBT15_CRT_PROG_NM ;
   private String[] BC000T2_A357TBT15_UPD_PROG_NM ;
   private boolean[] BC000T2_n357TBT15_UPD_PROG_NM ;
   private long[] BC000T2_A345TBT15_STUDY_ID ;
   private int[] BC000T2_A346TBT15_SUBJECT_ID ;
   private short[] BC000T2_A925TBT15_MEMO_NO ;
   private java.util.Date[] BC000T10_A352TBT15_CRT_DATETIME ;
   private boolean[] BC000T10_n352TBT15_CRT_DATETIME ;
   private String[] BC000T10_A353TBT15_CRT_USER_ID ;
   private boolean[] BC000T10_n353TBT15_CRT_USER_ID ;
   private java.util.Date[] BC000T10_A355TBT15_UPD_DATETIME ;
   private boolean[] BC000T10_n355TBT15_UPD_DATETIME ;
   private String[] BC000T10_A356TBT15_UPD_USER_ID ;
   private boolean[] BC000T10_n356TBT15_UPD_USER_ID ;
   private long[] BC000T10_A358TBT15_UPD_CNT ;
   private boolean[] BC000T10_n358TBT15_UPD_CNT ;
   private short[] BC000T10_A347TBT15_CRF_ID ;
   private boolean[] BC000T10_n347TBT15_CRF_ID ;
   private short[] BC000T10_A348TBT15_CRF_VERSION ;
   private boolean[] BC000T10_n348TBT15_CRF_VERSION ;
   private String[] BC000T10_A932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] BC000T10_n932TBT15_CRF_ITEM_GRP_DIV ;
   private String[] BC000T10_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] BC000T10_n926TBT15_CRF_ITEM_GRP_CD ;
   private String[] BC000T10_A351TBT15_DEL_FLG ;
   private boolean[] BC000T10_n351TBT15_DEL_FLG ;
   private String[] BC000T10_A354TBT15_CRT_PROG_NM ;
   private boolean[] BC000T10_n354TBT15_CRT_PROG_NM ;
   private String[] BC000T10_A357TBT15_UPD_PROG_NM ;
   private boolean[] BC000T10_n357TBT15_UPD_PROG_NM ;
   private long[] BC000T10_A345TBT15_STUDY_ID ;
   private int[] BC000T10_A346TBT15_SUBJECT_ID ;
   private short[] BC000T10_A925TBT15_MEMO_NO ;
   private long[] BC000T11_A345TBT15_STUDY_ID ;
}

final  class tbt15_crf_memo_loc_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000T2", "SELECT `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000T3", "SELECT `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000T4", "SELECT `TBT14_STUDY_ID` AS TBT15_STUDY_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000T5", "SELECT TM1.`TBT15_CRT_DATETIME`, TM1.`TBT15_CRT_USER_ID`, TM1.`TBT15_UPD_DATETIME`, TM1.`TBT15_UPD_USER_ID`, TM1.`TBT15_UPD_CNT`, TM1.`TBT15_CRF_ID`, TM1.`TBT15_CRF_VERSION`, TM1.`TBT15_CRF_ITEM_GRP_DIV`, TM1.`TBT15_CRF_ITEM_GRP_CD`, TM1.`TBT15_DEL_FLG`, TM1.`TBT15_CRT_PROG_NM`, TM1.`TBT15_UPD_PROG_NM`, TM1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, TM1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, TM1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` TM1 WHERE TM1.`TBT15_STUDY_ID` = ? and TM1.`TBT15_SUBJECT_ID` = ? and TM1.`TBT15_MEMO_NO` = ? ORDER BY TM1.`TBT15_STUDY_ID`, TM1.`TBT15_SUBJECT_ID`, TM1.`TBT15_MEMO_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000T6", "SELECT `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000T7", "INSERT INTO `TBT15_CRF_MEMO_LOC` (`TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000T8", "UPDATE `TBT15_CRF_MEMO_LOC` SET `TBT15_CRT_DATETIME`=?, `TBT15_CRT_USER_ID`=?, `TBT15_UPD_DATETIME`=?, `TBT15_UPD_USER_ID`=?, `TBT15_UPD_CNT`=?, `TBT15_CRF_ID`=?, `TBT15_CRF_VERSION`=?, `TBT15_CRF_ITEM_GRP_DIV`=?, `TBT15_CRF_ITEM_GRP_CD`=?, `TBT15_DEL_FLG`=?, `TBT15_CRT_PROG_NM`=?, `TBT15_UPD_PROG_NM`=?  WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000T9", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000T10", "SELECT TM1.`TBT15_CRT_DATETIME`, TM1.`TBT15_CRT_USER_ID`, TM1.`TBT15_UPD_DATETIME`, TM1.`TBT15_UPD_USER_ID`, TM1.`TBT15_UPD_CNT`, TM1.`TBT15_CRF_ID`, TM1.`TBT15_CRF_VERSION`, TM1.`TBT15_CRF_ITEM_GRP_DIV`, TM1.`TBT15_CRF_ITEM_GRP_CD`, TM1.`TBT15_DEL_FLG`, TM1.`TBT15_CRT_PROG_NM`, TM1.`TBT15_UPD_PROG_NM`, TM1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, TM1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, TM1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` TM1 WHERE TM1.`TBT15_STUDY_ID` = ? and TM1.`TBT15_SUBJECT_ID` = ? and TM1.`TBT15_MEMO_NO` = ? ORDER BY TM1.`TBT15_STUDY_ID`, TM1.`TBT15_SUBJECT_ID`, TM1.`TBT15_MEMO_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000T11", "SELECT `TBT14_STUDY_ID` AS TBT15_STUDY_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((short[]) buf[26])[0] = rslt.getShort(15) ;
               break;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((short[]) buf[26])[0] = rslt.getShort(15) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((short[]) buf[26])[0] = rslt.getShort(15) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 8 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((short[]) buf[26])[0] = rslt.getShort(15) ;
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               stmt.setLong(13, ((Number) parms[24]).longValue());
               stmt.setInt(14, ((Number) parms[25]).intValue());
               stmt.setShort(15, ((Number) parms[26]).shortValue());
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
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               stmt.setLong(13, ((Number) parms[24]).longValue());
               stmt.setInt(14, ((Number) parms[25]).intValue());
               stmt.setShort(15, ((Number) parms[26]).shortValue());
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

