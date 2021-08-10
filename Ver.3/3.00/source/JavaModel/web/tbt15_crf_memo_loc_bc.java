/*
               File: tbt15_crf_memo_loc_bc
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:20.70
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

   public void getInsDefault( )
   {
      readRow0T28( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0T28( ) ;
      standaloneModal( ) ;
      addRow0T28( ) ;
      Gx_mode = "INS" ;
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
            Z149TBT15_STUDY_ID = A149TBT15_STUDY_ID ;
            Z151TBT15_SUBJECT_ID = A151TBT15_SUBJECT_ID ;
            Z199TBT15_MEMO_NO = A199TBT15_MEMO_NO ;
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e120T2( )
   {
      /* After Trn Routine */
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

   public void zm0T28( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z489TBT15_CRT_DATETIME = A489TBT15_CRT_DATETIME ;
         Z490TBT15_CRT_USER_ID = A490TBT15_CRT_USER_ID ;
         Z492TBT15_UPD_DATETIME = A492TBT15_UPD_DATETIME ;
         Z493TBT15_UPD_USER_ID = A493TBT15_UPD_USER_ID ;
         Z495TBT15_UPD_CNT = A495TBT15_UPD_CNT ;
         Z155TBT15_CRF_ID = A155TBT15_CRF_ID ;
         Z942TBT15_CRF_EDA_NO = A942TBT15_CRF_EDA_NO ;
         Z157TBT15_CRF_VERSION = A157TBT15_CRF_VERSION ;
         Z903TBT15_CRF_ITEM_GRP_DIV = A903TBT15_CRF_ITEM_GRP_DIV ;
         Z904TBT15_CRF_ITEM_GRP_CD = A904TBT15_CRF_ITEM_GRP_CD ;
         Z488TBT15_DEL_FLG = A488TBT15_DEL_FLG ;
         Z491TBT15_CRT_PROG_NM = A491TBT15_CRT_PROG_NM ;
         Z494TBT15_UPD_PROG_NM = A494TBT15_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z489TBT15_CRT_DATETIME = A489TBT15_CRT_DATETIME ;
         Z490TBT15_CRT_USER_ID = A490TBT15_CRT_USER_ID ;
         Z492TBT15_UPD_DATETIME = A492TBT15_UPD_DATETIME ;
         Z493TBT15_UPD_USER_ID = A493TBT15_UPD_USER_ID ;
         Z495TBT15_UPD_CNT = A495TBT15_UPD_CNT ;
         Z155TBT15_CRF_ID = A155TBT15_CRF_ID ;
         Z942TBT15_CRF_EDA_NO = A942TBT15_CRF_EDA_NO ;
         Z157TBT15_CRF_VERSION = A157TBT15_CRF_VERSION ;
         Z903TBT15_CRF_ITEM_GRP_DIV = A903TBT15_CRF_ITEM_GRP_DIV ;
         Z904TBT15_CRF_ITEM_GRP_CD = A904TBT15_CRF_ITEM_GRP_CD ;
         Z488TBT15_DEL_FLG = A488TBT15_DEL_FLG ;
         Z491TBT15_CRT_PROG_NM = A491TBT15_CRT_PROG_NM ;
         Z494TBT15_UPD_PROG_NM = A494TBT15_UPD_PROG_NM ;
         Z149TBT15_STUDY_ID = A149TBT15_STUDY_ID ;
         Z151TBT15_SUBJECT_ID = A151TBT15_SUBJECT_ID ;
         Z199TBT15_MEMO_NO = A199TBT15_MEMO_NO ;
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
      pr_default.execute(3, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A489TBT15_CRT_DATETIME = BC000T5_A489TBT15_CRT_DATETIME[0] ;
         n489TBT15_CRT_DATETIME = BC000T5_n489TBT15_CRT_DATETIME[0] ;
         A490TBT15_CRT_USER_ID = BC000T5_A490TBT15_CRT_USER_ID[0] ;
         n490TBT15_CRT_USER_ID = BC000T5_n490TBT15_CRT_USER_ID[0] ;
         A492TBT15_UPD_DATETIME = BC000T5_A492TBT15_UPD_DATETIME[0] ;
         n492TBT15_UPD_DATETIME = BC000T5_n492TBT15_UPD_DATETIME[0] ;
         A493TBT15_UPD_USER_ID = BC000T5_A493TBT15_UPD_USER_ID[0] ;
         n493TBT15_UPD_USER_ID = BC000T5_n493TBT15_UPD_USER_ID[0] ;
         A495TBT15_UPD_CNT = BC000T5_A495TBT15_UPD_CNT[0] ;
         n495TBT15_UPD_CNT = BC000T5_n495TBT15_UPD_CNT[0] ;
         A155TBT15_CRF_ID = BC000T5_A155TBT15_CRF_ID[0] ;
         n155TBT15_CRF_ID = BC000T5_n155TBT15_CRF_ID[0] ;
         A942TBT15_CRF_EDA_NO = BC000T5_A942TBT15_CRF_EDA_NO[0] ;
         n942TBT15_CRF_EDA_NO = BC000T5_n942TBT15_CRF_EDA_NO[0] ;
         A157TBT15_CRF_VERSION = BC000T5_A157TBT15_CRF_VERSION[0] ;
         n157TBT15_CRF_VERSION = BC000T5_n157TBT15_CRF_VERSION[0] ;
         A903TBT15_CRF_ITEM_GRP_DIV = BC000T5_A903TBT15_CRF_ITEM_GRP_DIV[0] ;
         n903TBT15_CRF_ITEM_GRP_DIV = BC000T5_n903TBT15_CRF_ITEM_GRP_DIV[0] ;
         A904TBT15_CRF_ITEM_GRP_CD = BC000T5_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         n904TBT15_CRF_ITEM_GRP_CD = BC000T5_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A488TBT15_DEL_FLG = BC000T5_A488TBT15_DEL_FLG[0] ;
         n488TBT15_DEL_FLG = BC000T5_n488TBT15_DEL_FLG[0] ;
         A491TBT15_CRT_PROG_NM = BC000T5_A491TBT15_CRT_PROG_NM[0] ;
         n491TBT15_CRT_PROG_NM = BC000T5_n491TBT15_CRT_PROG_NM[0] ;
         A494TBT15_UPD_PROG_NM = BC000T5_A494TBT15_UPD_PROG_NM[0] ;
         n494TBT15_UPD_PROG_NM = BC000T5_n494TBT15_UPD_PROG_NM[0] ;
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
      pr_default.execute(2, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFメモ位置テーブル・CRFメモサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A489TBT15_CRT_DATETIME) || (( A489TBT15_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A489TBT15_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A492TBT15_UPD_DATETIME) || (( A492TBT15_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A492TBT15_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0T28( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0T28( )
   {
      /* Using cursor BC000T6 */
      pr_default.execute(4, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
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
      pr_default.execute(1, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0T28( 8) ;
         RcdFound28 = (short)(1) ;
         A489TBT15_CRT_DATETIME = BC000T3_A489TBT15_CRT_DATETIME[0] ;
         n489TBT15_CRT_DATETIME = BC000T3_n489TBT15_CRT_DATETIME[0] ;
         A490TBT15_CRT_USER_ID = BC000T3_A490TBT15_CRT_USER_ID[0] ;
         n490TBT15_CRT_USER_ID = BC000T3_n490TBT15_CRT_USER_ID[0] ;
         A492TBT15_UPD_DATETIME = BC000T3_A492TBT15_UPD_DATETIME[0] ;
         n492TBT15_UPD_DATETIME = BC000T3_n492TBT15_UPD_DATETIME[0] ;
         A493TBT15_UPD_USER_ID = BC000T3_A493TBT15_UPD_USER_ID[0] ;
         n493TBT15_UPD_USER_ID = BC000T3_n493TBT15_UPD_USER_ID[0] ;
         A495TBT15_UPD_CNT = BC000T3_A495TBT15_UPD_CNT[0] ;
         n495TBT15_UPD_CNT = BC000T3_n495TBT15_UPD_CNT[0] ;
         A155TBT15_CRF_ID = BC000T3_A155TBT15_CRF_ID[0] ;
         n155TBT15_CRF_ID = BC000T3_n155TBT15_CRF_ID[0] ;
         A942TBT15_CRF_EDA_NO = BC000T3_A942TBT15_CRF_EDA_NO[0] ;
         n942TBT15_CRF_EDA_NO = BC000T3_n942TBT15_CRF_EDA_NO[0] ;
         A157TBT15_CRF_VERSION = BC000T3_A157TBT15_CRF_VERSION[0] ;
         n157TBT15_CRF_VERSION = BC000T3_n157TBT15_CRF_VERSION[0] ;
         A903TBT15_CRF_ITEM_GRP_DIV = BC000T3_A903TBT15_CRF_ITEM_GRP_DIV[0] ;
         n903TBT15_CRF_ITEM_GRP_DIV = BC000T3_n903TBT15_CRF_ITEM_GRP_DIV[0] ;
         A904TBT15_CRF_ITEM_GRP_CD = BC000T3_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         n904TBT15_CRF_ITEM_GRP_CD = BC000T3_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A488TBT15_DEL_FLG = BC000T3_A488TBT15_DEL_FLG[0] ;
         n488TBT15_DEL_FLG = BC000T3_n488TBT15_DEL_FLG[0] ;
         A491TBT15_CRT_PROG_NM = BC000T3_A491TBT15_CRT_PROG_NM[0] ;
         n491TBT15_CRT_PROG_NM = BC000T3_n491TBT15_CRT_PROG_NM[0] ;
         A494TBT15_UPD_PROG_NM = BC000T3_A494TBT15_UPD_PROG_NM[0] ;
         n494TBT15_UPD_PROG_NM = BC000T3_n494TBT15_UPD_PROG_NM[0] ;
         A149TBT15_STUDY_ID = BC000T3_A149TBT15_STUDY_ID[0] ;
         A151TBT15_SUBJECT_ID = BC000T3_A151TBT15_SUBJECT_ID[0] ;
         A199TBT15_MEMO_NO = BC000T3_A199TBT15_MEMO_NO[0] ;
         O495TBT15_UPD_CNT = A495TBT15_UPD_CNT ;
         n495TBT15_UPD_CNT = false ;
         Z149TBT15_STUDY_ID = A149TBT15_STUDY_ID ;
         Z151TBT15_SUBJECT_ID = A151TBT15_SUBJECT_ID ;
         Z199TBT15_MEMO_NO = A199TBT15_MEMO_NO ;
         sMode28 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0T28( ) ;
         if ( AnyError == 1 )
         {
            RcdFound28 = (short)(0) ;
            initializeNonKey0T28( ) ;
         }
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
         pr_default.execute(0, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT15_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z489TBT15_CRT_DATETIME.equals( BC000T2_A489TBT15_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z490TBT15_CRT_USER_ID, BC000T2_A490TBT15_CRT_USER_ID[0]) != 0 ) || !( Z492TBT15_UPD_DATETIME.equals( BC000T2_A492TBT15_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z493TBT15_UPD_USER_ID, BC000T2_A493TBT15_UPD_USER_ID[0]) != 0 ) || ( Z495TBT15_UPD_CNT != BC000T2_A495TBT15_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z155TBT15_CRF_ID != BC000T2_A155TBT15_CRF_ID[0] ) || ( Z942TBT15_CRF_EDA_NO != BC000T2_A942TBT15_CRF_EDA_NO[0] ) || ( Z157TBT15_CRF_VERSION != BC000T2_A157TBT15_CRF_VERSION[0] ) || ( GXutil.strcmp(Z903TBT15_CRF_ITEM_GRP_DIV, BC000T2_A903TBT15_CRF_ITEM_GRP_DIV[0]) != 0 ) || ( GXutil.strcmp(Z904TBT15_CRF_ITEM_GRP_CD, BC000T2_A904TBT15_CRF_ITEM_GRP_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z488TBT15_DEL_FLG, BC000T2_A488TBT15_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z491TBT15_CRT_PROG_NM, BC000T2_A491TBT15_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z494TBT15_UPD_PROG_NM, BC000T2_A494TBT15_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(5, new Object[] {new Boolean(n489TBT15_CRT_DATETIME), A489TBT15_CRT_DATETIME, new Boolean(n490TBT15_CRT_USER_ID), A490TBT15_CRT_USER_ID, new Boolean(n492TBT15_UPD_DATETIME), A492TBT15_UPD_DATETIME, new Boolean(n493TBT15_UPD_USER_ID), A493TBT15_UPD_USER_ID, new Boolean(n495TBT15_UPD_CNT), new Long(A495TBT15_UPD_CNT), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID), new Boolean(n942TBT15_CRF_EDA_NO), new Byte(A942TBT15_CRF_EDA_NO), new Boolean(n157TBT15_CRF_VERSION), new Short(A157TBT15_CRF_VERSION), new Boolean(n903TBT15_CRF_ITEM_GRP_DIV), A903TBT15_CRF_ITEM_GRP_DIV, new Boolean(n904TBT15_CRF_ITEM_GRP_CD), A904TBT15_CRF_ITEM_GRP_CD, new Boolean(n488TBT15_DEL_FLG), A488TBT15_DEL_FLG, new Boolean(n491TBT15_CRT_PROG_NM), A491TBT15_CRT_PROG_NM, new Boolean(n494TBT15_UPD_PROG_NM), A494TBT15_UPD_PROG_NM, new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
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
                  pr_default.execute(6, new Object[] {new Boolean(n489TBT15_CRT_DATETIME), A489TBT15_CRT_DATETIME, new Boolean(n490TBT15_CRT_USER_ID), A490TBT15_CRT_USER_ID, new Boolean(n492TBT15_UPD_DATETIME), A492TBT15_UPD_DATETIME, new Boolean(n493TBT15_UPD_USER_ID), A493TBT15_UPD_USER_ID, new Boolean(n495TBT15_UPD_CNT), new Long(A495TBT15_UPD_CNT), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID), new Boolean(n942TBT15_CRF_EDA_NO), new Byte(A942TBT15_CRF_EDA_NO), new Boolean(n157TBT15_CRF_VERSION), new Short(A157TBT15_CRF_VERSION), new Boolean(n903TBT15_CRF_ITEM_GRP_DIV), A903TBT15_CRF_ITEM_GRP_DIV, new Boolean(n904TBT15_CRF_ITEM_GRP_CD), A904TBT15_CRF_ITEM_GRP_CD, new Boolean(n488TBT15_DEL_FLG), A488TBT15_DEL_FLG, new Boolean(n491TBT15_CRT_PROG_NM), A491TBT15_CRT_PROG_NM, new Boolean(n494TBT15_UPD_PROG_NM), A494TBT15_UPD_PROG_NM, new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
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
               pr_default.execute(7, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
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
      /* Scan By routine */
      /* Using cursor BC000T10 */
      pr_default.execute(8, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
      RcdFound28 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A489TBT15_CRT_DATETIME = BC000T10_A489TBT15_CRT_DATETIME[0] ;
         n489TBT15_CRT_DATETIME = BC000T10_n489TBT15_CRT_DATETIME[0] ;
         A490TBT15_CRT_USER_ID = BC000T10_A490TBT15_CRT_USER_ID[0] ;
         n490TBT15_CRT_USER_ID = BC000T10_n490TBT15_CRT_USER_ID[0] ;
         A492TBT15_UPD_DATETIME = BC000T10_A492TBT15_UPD_DATETIME[0] ;
         n492TBT15_UPD_DATETIME = BC000T10_n492TBT15_UPD_DATETIME[0] ;
         A493TBT15_UPD_USER_ID = BC000T10_A493TBT15_UPD_USER_ID[0] ;
         n493TBT15_UPD_USER_ID = BC000T10_n493TBT15_UPD_USER_ID[0] ;
         A495TBT15_UPD_CNT = BC000T10_A495TBT15_UPD_CNT[0] ;
         n495TBT15_UPD_CNT = BC000T10_n495TBT15_UPD_CNT[0] ;
         A155TBT15_CRF_ID = BC000T10_A155TBT15_CRF_ID[0] ;
         n155TBT15_CRF_ID = BC000T10_n155TBT15_CRF_ID[0] ;
         A942TBT15_CRF_EDA_NO = BC000T10_A942TBT15_CRF_EDA_NO[0] ;
         n942TBT15_CRF_EDA_NO = BC000T10_n942TBT15_CRF_EDA_NO[0] ;
         A157TBT15_CRF_VERSION = BC000T10_A157TBT15_CRF_VERSION[0] ;
         n157TBT15_CRF_VERSION = BC000T10_n157TBT15_CRF_VERSION[0] ;
         A903TBT15_CRF_ITEM_GRP_DIV = BC000T10_A903TBT15_CRF_ITEM_GRP_DIV[0] ;
         n903TBT15_CRF_ITEM_GRP_DIV = BC000T10_n903TBT15_CRF_ITEM_GRP_DIV[0] ;
         A904TBT15_CRF_ITEM_GRP_CD = BC000T10_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         n904TBT15_CRF_ITEM_GRP_CD = BC000T10_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A488TBT15_DEL_FLG = BC000T10_A488TBT15_DEL_FLG[0] ;
         n488TBT15_DEL_FLG = BC000T10_n488TBT15_DEL_FLG[0] ;
         A491TBT15_CRT_PROG_NM = BC000T10_A491TBT15_CRT_PROG_NM[0] ;
         n491TBT15_CRT_PROG_NM = BC000T10_n491TBT15_CRT_PROG_NM[0] ;
         A494TBT15_UPD_PROG_NM = BC000T10_A494TBT15_UPD_PROG_NM[0] ;
         n494TBT15_UPD_PROG_NM = BC000T10_n494TBT15_UPD_PROG_NM[0] ;
         A149TBT15_STUDY_ID = BC000T10_A149TBT15_STUDY_ID[0] ;
         A151TBT15_SUBJECT_ID = BC000T10_A151TBT15_SUBJECT_ID[0] ;
         A199TBT15_MEMO_NO = BC000T10_A199TBT15_MEMO_NO[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0T28( )
   {
      /* Scan next routine */
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
         A489TBT15_CRT_DATETIME = BC000T10_A489TBT15_CRT_DATETIME[0] ;
         n489TBT15_CRT_DATETIME = BC000T10_n489TBT15_CRT_DATETIME[0] ;
         A490TBT15_CRT_USER_ID = BC000T10_A490TBT15_CRT_USER_ID[0] ;
         n490TBT15_CRT_USER_ID = BC000T10_n490TBT15_CRT_USER_ID[0] ;
         A492TBT15_UPD_DATETIME = BC000T10_A492TBT15_UPD_DATETIME[0] ;
         n492TBT15_UPD_DATETIME = BC000T10_n492TBT15_UPD_DATETIME[0] ;
         A493TBT15_UPD_USER_ID = BC000T10_A493TBT15_UPD_USER_ID[0] ;
         n493TBT15_UPD_USER_ID = BC000T10_n493TBT15_UPD_USER_ID[0] ;
         A495TBT15_UPD_CNT = BC000T10_A495TBT15_UPD_CNT[0] ;
         n495TBT15_UPD_CNT = BC000T10_n495TBT15_UPD_CNT[0] ;
         A155TBT15_CRF_ID = BC000T10_A155TBT15_CRF_ID[0] ;
         n155TBT15_CRF_ID = BC000T10_n155TBT15_CRF_ID[0] ;
         A942TBT15_CRF_EDA_NO = BC000T10_A942TBT15_CRF_EDA_NO[0] ;
         n942TBT15_CRF_EDA_NO = BC000T10_n942TBT15_CRF_EDA_NO[0] ;
         A157TBT15_CRF_VERSION = BC000T10_A157TBT15_CRF_VERSION[0] ;
         n157TBT15_CRF_VERSION = BC000T10_n157TBT15_CRF_VERSION[0] ;
         A903TBT15_CRF_ITEM_GRP_DIV = BC000T10_A903TBT15_CRF_ITEM_GRP_DIV[0] ;
         n903TBT15_CRF_ITEM_GRP_DIV = BC000T10_n903TBT15_CRF_ITEM_GRP_DIV[0] ;
         A904TBT15_CRF_ITEM_GRP_CD = BC000T10_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         n904TBT15_CRF_ITEM_GRP_CD = BC000T10_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A488TBT15_DEL_FLG = BC000T10_A488TBT15_DEL_FLG[0] ;
         n488TBT15_DEL_FLG = BC000T10_n488TBT15_DEL_FLG[0] ;
         A491TBT15_CRT_PROG_NM = BC000T10_A491TBT15_CRT_PROG_NM[0] ;
         n491TBT15_CRT_PROG_NM = BC000T10_n491TBT15_CRT_PROG_NM[0] ;
         A494TBT15_UPD_PROG_NM = BC000T10_A494TBT15_UPD_PROG_NM[0] ;
         n494TBT15_UPD_PROG_NM = BC000T10_n494TBT15_UPD_PROG_NM[0] ;
         A149TBT15_STUDY_ID = BC000T10_A149TBT15_STUDY_ID[0] ;
         A151TBT15_SUBJECT_ID = BC000T10_A151TBT15_SUBJECT_ID[0] ;
         A199TBT15_MEMO_NO = BC000T10_A199TBT15_MEMO_NO[0] ;
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
      A489TBT15_CRT_DATETIME = GXutil.now( ) ;
      n489TBT15_CRT_DATETIME = false ;
      GXt_char1 = A490TBT15_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt15_crf_memo_loc_bc.this.GXt_char1 = GXv_char2[0] ;
      A490TBT15_CRT_USER_ID = GXt_char1 ;
      n490TBT15_CRT_USER_ID = false ;
      A492TBT15_UPD_DATETIME = GXutil.now( ) ;
      n492TBT15_UPD_DATETIME = false ;
      GXt_char1 = A493TBT15_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt15_crf_memo_loc_bc.this.GXt_char1 = GXv_char2[0] ;
      A493TBT15_UPD_USER_ID = GXt_char1 ;
      n493TBT15_UPD_USER_ID = false ;
      A495TBT15_UPD_CNT = (long)(O495TBT15_UPD_CNT+1) ;
      n495TBT15_UPD_CNT = false ;
   }

   public void beforeUpdate0T28( )
   {
      /* Before Update Rules */
      A492TBT15_UPD_DATETIME = GXutil.now( ) ;
      n492TBT15_UPD_DATETIME = false ;
      GXt_char1 = A493TBT15_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt15_crf_memo_loc_bc.this.GXt_char1 = GXv_char2[0] ;
      A493TBT15_UPD_USER_ID = GXt_char1 ;
      n493TBT15_UPD_USER_ID = false ;
      A495TBT15_UPD_CNT = (long)(O495TBT15_UPD_CNT+1) ;
      n495TBT15_UPD_CNT = false ;
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
      A489TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n489TBT15_CRT_DATETIME = false ;
      A490TBT15_CRT_USER_ID = "" ;
      n490TBT15_CRT_USER_ID = false ;
      A492TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n492TBT15_UPD_DATETIME = false ;
      A493TBT15_UPD_USER_ID = "" ;
      n493TBT15_UPD_USER_ID = false ;
      A495TBT15_UPD_CNT = 0 ;
      n495TBT15_UPD_CNT = false ;
      A155TBT15_CRF_ID = (short)(0) ;
      n155TBT15_CRF_ID = false ;
      A942TBT15_CRF_EDA_NO = (byte)(0) ;
      n942TBT15_CRF_EDA_NO = false ;
      A157TBT15_CRF_VERSION = (short)(0) ;
      n157TBT15_CRF_VERSION = false ;
      A903TBT15_CRF_ITEM_GRP_DIV = "" ;
      n903TBT15_CRF_ITEM_GRP_DIV = false ;
      A904TBT15_CRF_ITEM_GRP_CD = "" ;
      n904TBT15_CRF_ITEM_GRP_CD = false ;
      A488TBT15_DEL_FLG = "" ;
      n488TBT15_DEL_FLG = false ;
      A491TBT15_CRT_PROG_NM = "" ;
      n491TBT15_CRT_PROG_NM = false ;
      A494TBT15_UPD_PROG_NM = "" ;
      n494TBT15_UPD_PROG_NM = false ;
      O495TBT15_UPD_CNT = A495TBT15_UPD_CNT ;
      n495TBT15_UPD_CNT = false ;
   }

   public void initAll0T28( )
   {
      A149TBT15_STUDY_ID = 0 ;
      A151TBT15_SUBJECT_ID = 0 ;
      A199TBT15_MEMO_NO = (short)(0) ;
      initializeNonKey0T28( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow28( SdtTBT15_CRF_MEMO_LOC obj28 )
   {
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( Gx_mode );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime( A489TBT15_CRT_DATETIME );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id( A490TBT15_CRT_USER_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime( A492TBT15_UPD_DATETIME );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id( A493TBT15_UPD_USER_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt( A495TBT15_UPD_CNT );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id( A155TBT15_CRF_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no( A942TBT15_CRF_EDA_NO );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version( A157TBT15_CRF_VERSION );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div( A903TBT15_CRF_ITEM_GRP_DIV );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd( A904TBT15_CRF_ITEM_GRP_CD );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg( A488TBT15_DEL_FLG );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm( A491TBT15_CRT_PROG_NM );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm( A494TBT15_UPD_PROG_NM );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id( A149TBT15_STUDY_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id( A151TBT15_SUBJECT_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no( A199TBT15_MEMO_NO );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z( Z149TBT15_STUDY_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z( Z151TBT15_SUBJECT_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z( Z199TBT15_MEMO_NO );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z( Z155TBT15_CRF_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z( Z942TBT15_CRF_EDA_NO );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z( Z157TBT15_CRF_VERSION );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z( Z903TBT15_CRF_ITEM_GRP_DIV );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z( Z904TBT15_CRF_ITEM_GRP_CD );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z( Z488TBT15_DEL_FLG );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z( Z489TBT15_CRT_DATETIME );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z( Z490TBT15_CRT_USER_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z( Z491TBT15_CRT_PROG_NM );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z( Z492TBT15_UPD_DATETIME );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z( Z493TBT15_UPD_USER_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z( Z494TBT15_UPD_PROG_NM );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z( Z495TBT15_UPD_CNT );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N( (byte)((byte)((n155TBT15_CRF_ID)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N( (byte)((byte)((n942TBT15_CRF_EDA_NO)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N( (byte)((byte)((n157TBT15_CRF_VERSION)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N( (byte)((byte)((n903TBT15_CRF_ITEM_GRP_DIV)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N( (byte)((byte)((n904TBT15_CRF_ITEM_GRP_CD)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N( (byte)((byte)((n488TBT15_DEL_FLG)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N( (byte)((byte)((n489TBT15_CRT_DATETIME)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N( (byte)((byte)((n490TBT15_CRT_USER_ID)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N( (byte)((byte)((n491TBT15_CRT_PROG_NM)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N( (byte)((byte)((n492TBT15_UPD_DATETIME)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N( (byte)((byte)((n493TBT15_UPD_USER_ID)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N( (byte)((byte)((n494TBT15_UPD_PROG_NM)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N( (byte)((byte)((n495TBT15_UPD_CNT)?1:0)) );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( Gx_mode );
   }

   public void KeyVarsToRow28( SdtTBT15_CRF_MEMO_LOC obj28 )
   {
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id( A149TBT15_STUDY_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id( A151TBT15_SUBJECT_ID );
      obj28.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no( A199TBT15_MEMO_NO );
   }

   public void RowToVars28( SdtTBT15_CRF_MEMO_LOC obj28 ,
                            int forceLoad )
   {
      Gx_mode = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode() ;
      A489TBT15_CRT_DATETIME = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime() ;
      n489TBT15_CRT_DATETIME = false ;
      A490TBT15_CRT_USER_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id() ;
      n490TBT15_CRT_USER_ID = false ;
      A492TBT15_UPD_DATETIME = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime() ;
      n492TBT15_UPD_DATETIME = false ;
      A493TBT15_UPD_USER_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id() ;
      n493TBT15_UPD_USER_ID = false ;
      A495TBT15_UPD_CNT = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt() ;
      n495TBT15_UPD_CNT = false ;
      A155TBT15_CRF_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id() ;
      n155TBT15_CRF_ID = false ;
      A942TBT15_CRF_EDA_NO = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no() ;
      n942TBT15_CRF_EDA_NO = false ;
      A157TBT15_CRF_VERSION = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version() ;
      n157TBT15_CRF_VERSION = false ;
      A903TBT15_CRF_ITEM_GRP_DIV = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div() ;
      n903TBT15_CRF_ITEM_GRP_DIV = false ;
      A904TBT15_CRF_ITEM_GRP_CD = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd() ;
      n904TBT15_CRF_ITEM_GRP_CD = false ;
      A488TBT15_DEL_FLG = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg() ;
      n488TBT15_DEL_FLG = false ;
      A491TBT15_CRT_PROG_NM = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm() ;
      n491TBT15_CRT_PROG_NM = false ;
      A494TBT15_UPD_PROG_NM = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm() ;
      n494TBT15_UPD_PROG_NM = false ;
      A149TBT15_STUDY_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id() ;
      A151TBT15_SUBJECT_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id() ;
      A199TBT15_MEMO_NO = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no() ;
      Z149TBT15_STUDY_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z() ;
      Z151TBT15_SUBJECT_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z() ;
      Z199TBT15_MEMO_NO = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z() ;
      Z155TBT15_CRF_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z() ;
      Z942TBT15_CRF_EDA_NO = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z() ;
      Z157TBT15_CRF_VERSION = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z() ;
      Z903TBT15_CRF_ITEM_GRP_DIV = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z() ;
      Z904TBT15_CRF_ITEM_GRP_CD = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z() ;
      Z488TBT15_DEL_FLG = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z() ;
      Z489TBT15_CRT_DATETIME = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z() ;
      Z490TBT15_CRT_USER_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z() ;
      Z491TBT15_CRT_PROG_NM = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z() ;
      Z492TBT15_UPD_DATETIME = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z() ;
      Z493TBT15_UPD_USER_ID = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z() ;
      Z494TBT15_UPD_PROG_NM = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z() ;
      Z495TBT15_UPD_CNT = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z() ;
      O495TBT15_UPD_CNT = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z() ;
      n155TBT15_CRF_ID = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N()==0)?false:true) ;
      n942TBT15_CRF_EDA_NO = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N()==0)?false:true) ;
      n157TBT15_CRF_VERSION = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N()==0)?false:true) ;
      n903TBT15_CRF_ITEM_GRP_DIV = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N()==0)?false:true) ;
      n904TBT15_CRF_ITEM_GRP_CD = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N()==0)?false:true) ;
      n488TBT15_DEL_FLG = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N()==0)?false:true) ;
      n489TBT15_CRT_DATETIME = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N()==0)?false:true) ;
      n490TBT15_CRT_USER_ID = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N()==0)?false:true) ;
      n491TBT15_CRT_PROG_NM = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N()==0)?false:true) ;
      n492TBT15_UPD_DATETIME = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N()==0)?false:true) ;
      n493TBT15_UPD_USER_ID = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N()==0)?false:true) ;
      n494TBT15_UPD_PROG_NM = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N()==0)?false:true) ;
      n495TBT15_UPD_CNT = (boolean)((obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj28.getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A149TBT15_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A151TBT15_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A199TBT15_MEMO_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0T28( ) ;
      scanKeyStart0T28( ) ;
      if ( RcdFound28 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000T4 */
         pr_default.execute(2, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CRFメモ位置テーブル・CRFメモサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z149TBT15_STUDY_ID = A149TBT15_STUDY_ID ;
         Z151TBT15_SUBJECT_ID = A151TBT15_SUBJECT_ID ;
         Z199TBT15_MEMO_NO = A199TBT15_MEMO_NO ;
         O495TBT15_UPD_CNT = A495TBT15_UPD_CNT ;
         n495TBT15_UPD_CNT = false ;
      }
      zm0T28( -8) ;
      onLoadActions0T28( ) ;
      addRow0T28( ) ;
      scanKeyEnd0T28( ) ;
      if ( RcdFound28 == 0 )
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
      RowToVars28( bcTBT15_CRF_MEMO_LOC, 0) ;
      scanKeyStart0T28( ) ;
      if ( RcdFound28 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000T4 */
         pr_default.execute(2, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CRFメモ位置テーブル・CRFメモサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z149TBT15_STUDY_ID = A149TBT15_STUDY_ID ;
         Z151TBT15_SUBJECT_ID = A151TBT15_SUBJECT_ID ;
         Z199TBT15_MEMO_NO = A199TBT15_MEMO_NO ;
         O495TBT15_UPD_CNT = A495TBT15_UPD_CNT ;
         n495TBT15_UPD_CNT = false ;
      }
      zm0T28( -8) ;
      onLoadActions0T28( ) ;
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
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0T28( ) ;
      }
      else
      {
         if ( RcdFound28 == 1 )
         {
            if ( ( A149TBT15_STUDY_ID != Z149TBT15_STUDY_ID ) || ( A151TBT15_SUBJECT_ID != Z151TBT15_SUBJECT_ID ) || ( A199TBT15_MEMO_NO != Z199TBT15_MEMO_NO ) )
            {
               A149TBT15_STUDY_ID = Z149TBT15_STUDY_ID ;
               A151TBT15_SUBJECT_ID = Z151TBT15_SUBJECT_ID ;
               A199TBT15_MEMO_NO = Z199TBT15_MEMO_NO ;
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
               if ( ( A149TBT15_STUDY_ID != Z149TBT15_STUDY_ID ) || ( A151TBT15_SUBJECT_ID != Z151TBT15_SUBJECT_ID ) || ( A199TBT15_MEMO_NO != Z199TBT15_MEMO_NO ) )
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
         else if ( ( A149TBT15_STUDY_ID != Z149TBT15_STUDY_ID ) || ( A151TBT15_SUBJECT_ID != Z151TBT15_SUBJECT_ID ) || ( A199TBT15_MEMO_NO != Z199TBT15_MEMO_NO ) )
         {
            A149TBT15_STUDY_ID = Z149TBT15_STUDY_ID ;
            A151TBT15_SUBJECT_ID = Z151TBT15_SUBJECT_ID ;
            A199TBT15_MEMO_NO = Z199TBT15_MEMO_NO ;
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
         if ( ( A149TBT15_STUDY_ID != Z149TBT15_STUDY_ID ) || ( A151TBT15_SUBJECT_ID != Z151TBT15_SUBJECT_ID ) || ( A199TBT15_MEMO_NO != Z199TBT15_MEMO_NO ) )
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
      pr_default.close(2);
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
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z489TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A489TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z490TBT15_CRT_USER_ID = "" ;
      A490TBT15_CRT_USER_ID = "" ;
      Z492TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A492TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z493TBT15_UPD_USER_ID = "" ;
      A493TBT15_UPD_USER_ID = "" ;
      Z903TBT15_CRF_ITEM_GRP_DIV = "" ;
      A903TBT15_CRF_ITEM_GRP_DIV = "" ;
      Z904TBT15_CRF_ITEM_GRP_CD = "" ;
      A904TBT15_CRF_ITEM_GRP_CD = "" ;
      Z488TBT15_DEL_FLG = "" ;
      A488TBT15_DEL_FLG = "" ;
      Z491TBT15_CRT_PROG_NM = "" ;
      A491TBT15_CRT_PROG_NM = "" ;
      Z494TBT15_UPD_PROG_NM = "" ;
      A494TBT15_UPD_PROG_NM = "" ;
      BC000T5_A489TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T5_n489TBT15_CRT_DATETIME = new boolean[] {false} ;
      BC000T5_A490TBT15_CRT_USER_ID = new String[] {""} ;
      BC000T5_n490TBT15_CRT_USER_ID = new boolean[] {false} ;
      BC000T5_A492TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T5_n492TBT15_UPD_DATETIME = new boolean[] {false} ;
      BC000T5_A493TBT15_UPD_USER_ID = new String[] {""} ;
      BC000T5_n493TBT15_UPD_USER_ID = new boolean[] {false} ;
      BC000T5_A495TBT15_UPD_CNT = new long[1] ;
      BC000T5_n495TBT15_UPD_CNT = new boolean[] {false} ;
      BC000T5_A155TBT15_CRF_ID = new short[1] ;
      BC000T5_n155TBT15_CRF_ID = new boolean[] {false} ;
      BC000T5_A942TBT15_CRF_EDA_NO = new byte[1] ;
      BC000T5_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      BC000T5_A157TBT15_CRF_VERSION = new short[1] ;
      BC000T5_n157TBT15_CRF_VERSION = new boolean[] {false} ;
      BC000T5_A903TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000T5_n903TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      BC000T5_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000T5_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000T5_A488TBT15_DEL_FLG = new String[] {""} ;
      BC000T5_n488TBT15_DEL_FLG = new boolean[] {false} ;
      BC000T5_A491TBT15_CRT_PROG_NM = new String[] {""} ;
      BC000T5_n491TBT15_CRT_PROG_NM = new boolean[] {false} ;
      BC000T5_A494TBT15_UPD_PROG_NM = new String[] {""} ;
      BC000T5_n494TBT15_UPD_PROG_NM = new boolean[] {false} ;
      BC000T5_A149TBT15_STUDY_ID = new long[1] ;
      BC000T5_A151TBT15_SUBJECT_ID = new int[1] ;
      BC000T5_A199TBT15_MEMO_NO = new short[1] ;
      BC000T4_A149TBT15_STUDY_ID = new long[1] ;
      BC000T6_A149TBT15_STUDY_ID = new long[1] ;
      BC000T6_A151TBT15_SUBJECT_ID = new int[1] ;
      BC000T6_A199TBT15_MEMO_NO = new short[1] ;
      BC000T3_A489TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T3_n489TBT15_CRT_DATETIME = new boolean[] {false} ;
      BC000T3_A490TBT15_CRT_USER_ID = new String[] {""} ;
      BC000T3_n490TBT15_CRT_USER_ID = new boolean[] {false} ;
      BC000T3_A492TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T3_n492TBT15_UPD_DATETIME = new boolean[] {false} ;
      BC000T3_A493TBT15_UPD_USER_ID = new String[] {""} ;
      BC000T3_n493TBT15_UPD_USER_ID = new boolean[] {false} ;
      BC000T3_A495TBT15_UPD_CNT = new long[1] ;
      BC000T3_n495TBT15_UPD_CNT = new boolean[] {false} ;
      BC000T3_A155TBT15_CRF_ID = new short[1] ;
      BC000T3_n155TBT15_CRF_ID = new boolean[] {false} ;
      BC000T3_A942TBT15_CRF_EDA_NO = new byte[1] ;
      BC000T3_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      BC000T3_A157TBT15_CRF_VERSION = new short[1] ;
      BC000T3_n157TBT15_CRF_VERSION = new boolean[] {false} ;
      BC000T3_A903TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000T3_n903TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      BC000T3_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000T3_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000T3_A488TBT15_DEL_FLG = new String[] {""} ;
      BC000T3_n488TBT15_DEL_FLG = new boolean[] {false} ;
      BC000T3_A491TBT15_CRT_PROG_NM = new String[] {""} ;
      BC000T3_n491TBT15_CRT_PROG_NM = new boolean[] {false} ;
      BC000T3_A494TBT15_UPD_PROG_NM = new String[] {""} ;
      BC000T3_n494TBT15_UPD_PROG_NM = new boolean[] {false} ;
      BC000T3_A149TBT15_STUDY_ID = new long[1] ;
      BC000T3_A151TBT15_SUBJECT_ID = new int[1] ;
      BC000T3_A199TBT15_MEMO_NO = new short[1] ;
      sMode28 = "" ;
      BC000T2_A489TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T2_n489TBT15_CRT_DATETIME = new boolean[] {false} ;
      BC000T2_A490TBT15_CRT_USER_ID = new String[] {""} ;
      BC000T2_n490TBT15_CRT_USER_ID = new boolean[] {false} ;
      BC000T2_A492TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T2_n492TBT15_UPD_DATETIME = new boolean[] {false} ;
      BC000T2_A493TBT15_UPD_USER_ID = new String[] {""} ;
      BC000T2_n493TBT15_UPD_USER_ID = new boolean[] {false} ;
      BC000T2_A495TBT15_UPD_CNT = new long[1] ;
      BC000T2_n495TBT15_UPD_CNT = new boolean[] {false} ;
      BC000T2_A155TBT15_CRF_ID = new short[1] ;
      BC000T2_n155TBT15_CRF_ID = new boolean[] {false} ;
      BC000T2_A942TBT15_CRF_EDA_NO = new byte[1] ;
      BC000T2_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      BC000T2_A157TBT15_CRF_VERSION = new short[1] ;
      BC000T2_n157TBT15_CRF_VERSION = new boolean[] {false} ;
      BC000T2_A903TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000T2_n903TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      BC000T2_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000T2_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000T2_A488TBT15_DEL_FLG = new String[] {""} ;
      BC000T2_n488TBT15_DEL_FLG = new boolean[] {false} ;
      BC000T2_A491TBT15_CRT_PROG_NM = new String[] {""} ;
      BC000T2_n491TBT15_CRT_PROG_NM = new boolean[] {false} ;
      BC000T2_A494TBT15_UPD_PROG_NM = new String[] {""} ;
      BC000T2_n494TBT15_UPD_PROG_NM = new boolean[] {false} ;
      BC000T2_A149TBT15_STUDY_ID = new long[1] ;
      BC000T2_A151TBT15_SUBJECT_ID = new int[1] ;
      BC000T2_A199TBT15_MEMO_NO = new short[1] ;
      BC000T10_A489TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T10_n489TBT15_CRT_DATETIME = new boolean[] {false} ;
      BC000T10_A490TBT15_CRT_USER_ID = new String[] {""} ;
      BC000T10_n490TBT15_CRT_USER_ID = new boolean[] {false} ;
      BC000T10_A492TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000T10_n492TBT15_UPD_DATETIME = new boolean[] {false} ;
      BC000T10_A493TBT15_UPD_USER_ID = new String[] {""} ;
      BC000T10_n493TBT15_UPD_USER_ID = new boolean[] {false} ;
      BC000T10_A495TBT15_UPD_CNT = new long[1] ;
      BC000T10_n495TBT15_UPD_CNT = new boolean[] {false} ;
      BC000T10_A155TBT15_CRF_ID = new short[1] ;
      BC000T10_n155TBT15_CRF_ID = new boolean[] {false} ;
      BC000T10_A942TBT15_CRF_EDA_NO = new byte[1] ;
      BC000T10_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      BC000T10_A157TBT15_CRF_VERSION = new short[1] ;
      BC000T10_n157TBT15_CRF_VERSION = new boolean[] {false} ;
      BC000T10_A903TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000T10_n903TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      BC000T10_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000T10_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      BC000T10_A488TBT15_DEL_FLG = new String[] {""} ;
      BC000T10_n488TBT15_DEL_FLG = new boolean[] {false} ;
      BC000T10_A491TBT15_CRT_PROG_NM = new String[] {""} ;
      BC000T10_n491TBT15_CRT_PROG_NM = new boolean[] {false} ;
      BC000T10_A494TBT15_UPD_PROG_NM = new String[] {""} ;
      BC000T10_n494TBT15_UPD_PROG_NM = new boolean[] {false} ;
      BC000T10_A149TBT15_STUDY_ID = new long[1] ;
      BC000T10_A151TBT15_SUBJECT_ID = new int[1] ;
      BC000T10_A199TBT15_MEMO_NO = new short[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt15_crf_memo_loc_bc__default(),
         new Object[] {
             new Object[] {
            BC000T2_A489TBT15_CRT_DATETIME, BC000T2_n489TBT15_CRT_DATETIME, BC000T2_A490TBT15_CRT_USER_ID, BC000T2_n490TBT15_CRT_USER_ID, BC000T2_A492TBT15_UPD_DATETIME, BC000T2_n492TBT15_UPD_DATETIME, BC000T2_A493TBT15_UPD_USER_ID, BC000T2_n493TBT15_UPD_USER_ID, BC000T2_A495TBT15_UPD_CNT, BC000T2_n495TBT15_UPD_CNT,
            BC000T2_A155TBT15_CRF_ID, BC000T2_n155TBT15_CRF_ID, BC000T2_A942TBT15_CRF_EDA_NO, BC000T2_n942TBT15_CRF_EDA_NO, BC000T2_A157TBT15_CRF_VERSION, BC000T2_n157TBT15_CRF_VERSION, BC000T2_A903TBT15_CRF_ITEM_GRP_DIV, BC000T2_n903TBT15_CRF_ITEM_GRP_DIV, BC000T2_A904TBT15_CRF_ITEM_GRP_CD, BC000T2_n904TBT15_CRF_ITEM_GRP_CD,
            BC000T2_A488TBT15_DEL_FLG, BC000T2_n488TBT15_DEL_FLG, BC000T2_A491TBT15_CRT_PROG_NM, BC000T2_n491TBT15_CRT_PROG_NM, BC000T2_A494TBT15_UPD_PROG_NM, BC000T2_n494TBT15_UPD_PROG_NM, BC000T2_A149TBT15_STUDY_ID, BC000T2_A151TBT15_SUBJECT_ID, BC000T2_A199TBT15_MEMO_NO
            }
            , new Object[] {
            BC000T3_A489TBT15_CRT_DATETIME, BC000T3_n489TBT15_CRT_DATETIME, BC000T3_A490TBT15_CRT_USER_ID, BC000T3_n490TBT15_CRT_USER_ID, BC000T3_A492TBT15_UPD_DATETIME, BC000T3_n492TBT15_UPD_DATETIME, BC000T3_A493TBT15_UPD_USER_ID, BC000T3_n493TBT15_UPD_USER_ID, BC000T3_A495TBT15_UPD_CNT, BC000T3_n495TBT15_UPD_CNT,
            BC000T3_A155TBT15_CRF_ID, BC000T3_n155TBT15_CRF_ID, BC000T3_A942TBT15_CRF_EDA_NO, BC000T3_n942TBT15_CRF_EDA_NO, BC000T3_A157TBT15_CRF_VERSION, BC000T3_n157TBT15_CRF_VERSION, BC000T3_A903TBT15_CRF_ITEM_GRP_DIV, BC000T3_n903TBT15_CRF_ITEM_GRP_DIV, BC000T3_A904TBT15_CRF_ITEM_GRP_CD, BC000T3_n904TBT15_CRF_ITEM_GRP_CD,
            BC000T3_A488TBT15_DEL_FLG, BC000T3_n488TBT15_DEL_FLG, BC000T3_A491TBT15_CRT_PROG_NM, BC000T3_n491TBT15_CRT_PROG_NM, BC000T3_A494TBT15_UPD_PROG_NM, BC000T3_n494TBT15_UPD_PROG_NM, BC000T3_A149TBT15_STUDY_ID, BC000T3_A151TBT15_SUBJECT_ID, BC000T3_A199TBT15_MEMO_NO
            }
            , new Object[] {
            BC000T4_A149TBT15_STUDY_ID
            }
            , new Object[] {
            BC000T5_A489TBT15_CRT_DATETIME, BC000T5_n489TBT15_CRT_DATETIME, BC000T5_A490TBT15_CRT_USER_ID, BC000T5_n490TBT15_CRT_USER_ID, BC000T5_A492TBT15_UPD_DATETIME, BC000T5_n492TBT15_UPD_DATETIME, BC000T5_A493TBT15_UPD_USER_ID, BC000T5_n493TBT15_UPD_USER_ID, BC000T5_A495TBT15_UPD_CNT, BC000T5_n495TBT15_UPD_CNT,
            BC000T5_A155TBT15_CRF_ID, BC000T5_n155TBT15_CRF_ID, BC000T5_A942TBT15_CRF_EDA_NO, BC000T5_n942TBT15_CRF_EDA_NO, BC000T5_A157TBT15_CRF_VERSION, BC000T5_n157TBT15_CRF_VERSION, BC000T5_A903TBT15_CRF_ITEM_GRP_DIV, BC000T5_n903TBT15_CRF_ITEM_GRP_DIV, BC000T5_A904TBT15_CRF_ITEM_GRP_CD, BC000T5_n904TBT15_CRF_ITEM_GRP_CD,
            BC000T5_A488TBT15_DEL_FLG, BC000T5_n488TBT15_DEL_FLG, BC000T5_A491TBT15_CRT_PROG_NM, BC000T5_n491TBT15_CRT_PROG_NM, BC000T5_A494TBT15_UPD_PROG_NM, BC000T5_n494TBT15_UPD_PROG_NM, BC000T5_A149TBT15_STUDY_ID, BC000T5_A151TBT15_SUBJECT_ID, BC000T5_A199TBT15_MEMO_NO
            }
            , new Object[] {
            BC000T6_A149TBT15_STUDY_ID, BC000T6_A151TBT15_SUBJECT_ID, BC000T6_A199TBT15_MEMO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000T10_A489TBT15_CRT_DATETIME, BC000T10_n489TBT15_CRT_DATETIME, BC000T10_A490TBT15_CRT_USER_ID, BC000T10_n490TBT15_CRT_USER_ID, BC000T10_A492TBT15_UPD_DATETIME, BC000T10_n492TBT15_UPD_DATETIME, BC000T10_A493TBT15_UPD_USER_ID, BC000T10_n493TBT15_UPD_USER_ID, BC000T10_A495TBT15_UPD_CNT, BC000T10_n495TBT15_UPD_CNT,
            BC000T10_A155TBT15_CRF_ID, BC000T10_n155TBT15_CRF_ID, BC000T10_A942TBT15_CRF_EDA_NO, BC000T10_n942TBT15_CRF_EDA_NO, BC000T10_A157TBT15_CRF_VERSION, BC000T10_n157TBT15_CRF_VERSION, BC000T10_A903TBT15_CRF_ITEM_GRP_DIV, BC000T10_n903TBT15_CRF_ITEM_GRP_DIV, BC000T10_A904TBT15_CRF_ITEM_GRP_CD, BC000T10_n904TBT15_CRF_ITEM_GRP_CD,
            BC000T10_A488TBT15_DEL_FLG, BC000T10_n488TBT15_DEL_FLG, BC000T10_A491TBT15_CRT_PROG_NM, BC000T10_n491TBT15_CRT_PROG_NM, BC000T10_A494TBT15_UPD_PROG_NM, BC000T10_n494TBT15_UPD_PROG_NM, BC000T10_A149TBT15_STUDY_ID, BC000T10_A151TBT15_SUBJECT_ID, BC000T10_A199TBT15_MEMO_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT15_CRF_MEMO_LOC_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110T2 */
      e110T2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z942TBT15_CRF_EDA_NO ;
   private byte A942TBT15_CRF_EDA_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z199TBT15_MEMO_NO ;
   private short A199TBT15_MEMO_NO ;
   private short Z155TBT15_CRF_ID ;
   private short A155TBT15_CRF_ID ;
   private short Z157TBT15_CRF_VERSION ;
   private short A157TBT15_CRF_VERSION ;
   private short RcdFound28 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z151TBT15_SUBJECT_ID ;
   private int A151TBT15_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z149TBT15_STUDY_ID ;
   private long A149TBT15_STUDY_ID ;
   private long Z495TBT15_UPD_CNT ;
   private long A495TBT15_UPD_CNT ;
   private long O495TBT15_UPD_CNT ;
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
   private java.util.Date Z489TBT15_CRT_DATETIME ;
   private java.util.Date A489TBT15_CRT_DATETIME ;
   private java.util.Date Z492TBT15_UPD_DATETIME ;
   private java.util.Date A492TBT15_UPD_DATETIME ;
   private boolean n489TBT15_CRT_DATETIME ;
   private boolean n490TBT15_CRT_USER_ID ;
   private boolean n492TBT15_UPD_DATETIME ;
   private boolean n493TBT15_UPD_USER_ID ;
   private boolean n495TBT15_UPD_CNT ;
   private boolean n155TBT15_CRF_ID ;
   private boolean n942TBT15_CRF_EDA_NO ;
   private boolean n157TBT15_CRF_VERSION ;
   private boolean n903TBT15_CRF_ITEM_GRP_DIV ;
   private boolean n904TBT15_CRF_ITEM_GRP_CD ;
   private boolean n488TBT15_DEL_FLG ;
   private boolean n491TBT15_CRT_PROG_NM ;
   private boolean n494TBT15_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String Z490TBT15_CRT_USER_ID ;
   private String A490TBT15_CRT_USER_ID ;
   private String Z493TBT15_UPD_USER_ID ;
   private String A493TBT15_UPD_USER_ID ;
   private String Z903TBT15_CRF_ITEM_GRP_DIV ;
   private String A903TBT15_CRF_ITEM_GRP_DIV ;
   private String Z904TBT15_CRF_ITEM_GRP_CD ;
   private String A904TBT15_CRF_ITEM_GRP_CD ;
   private String Z488TBT15_DEL_FLG ;
   private String A488TBT15_DEL_FLG ;
   private String Z491TBT15_CRT_PROG_NM ;
   private String A491TBT15_CRT_PROG_NM ;
   private String Z494TBT15_UPD_PROG_NM ;
   private String A494TBT15_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT15_CRF_MEMO_LOC bcTBT15_CRF_MEMO_LOC ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC000T5_A489TBT15_CRT_DATETIME ;
   private boolean[] BC000T5_n489TBT15_CRT_DATETIME ;
   private String[] BC000T5_A490TBT15_CRT_USER_ID ;
   private boolean[] BC000T5_n490TBT15_CRT_USER_ID ;
   private java.util.Date[] BC000T5_A492TBT15_UPD_DATETIME ;
   private boolean[] BC000T5_n492TBT15_UPD_DATETIME ;
   private String[] BC000T5_A493TBT15_UPD_USER_ID ;
   private boolean[] BC000T5_n493TBT15_UPD_USER_ID ;
   private long[] BC000T5_A495TBT15_UPD_CNT ;
   private boolean[] BC000T5_n495TBT15_UPD_CNT ;
   private short[] BC000T5_A155TBT15_CRF_ID ;
   private boolean[] BC000T5_n155TBT15_CRF_ID ;
   private byte[] BC000T5_A942TBT15_CRF_EDA_NO ;
   private boolean[] BC000T5_n942TBT15_CRF_EDA_NO ;
   private short[] BC000T5_A157TBT15_CRF_VERSION ;
   private boolean[] BC000T5_n157TBT15_CRF_VERSION ;
   private String[] BC000T5_A903TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] BC000T5_n903TBT15_CRF_ITEM_GRP_DIV ;
   private String[] BC000T5_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] BC000T5_n904TBT15_CRF_ITEM_GRP_CD ;
   private String[] BC000T5_A488TBT15_DEL_FLG ;
   private boolean[] BC000T5_n488TBT15_DEL_FLG ;
   private String[] BC000T5_A491TBT15_CRT_PROG_NM ;
   private boolean[] BC000T5_n491TBT15_CRT_PROG_NM ;
   private String[] BC000T5_A494TBT15_UPD_PROG_NM ;
   private boolean[] BC000T5_n494TBT15_UPD_PROG_NM ;
   private long[] BC000T5_A149TBT15_STUDY_ID ;
   private int[] BC000T5_A151TBT15_SUBJECT_ID ;
   private short[] BC000T5_A199TBT15_MEMO_NO ;
   private long[] BC000T4_A149TBT15_STUDY_ID ;
   private long[] BC000T6_A149TBT15_STUDY_ID ;
   private int[] BC000T6_A151TBT15_SUBJECT_ID ;
   private short[] BC000T6_A199TBT15_MEMO_NO ;
   private java.util.Date[] BC000T3_A489TBT15_CRT_DATETIME ;
   private boolean[] BC000T3_n489TBT15_CRT_DATETIME ;
   private String[] BC000T3_A490TBT15_CRT_USER_ID ;
   private boolean[] BC000T3_n490TBT15_CRT_USER_ID ;
   private java.util.Date[] BC000T3_A492TBT15_UPD_DATETIME ;
   private boolean[] BC000T3_n492TBT15_UPD_DATETIME ;
   private String[] BC000T3_A493TBT15_UPD_USER_ID ;
   private boolean[] BC000T3_n493TBT15_UPD_USER_ID ;
   private long[] BC000T3_A495TBT15_UPD_CNT ;
   private boolean[] BC000T3_n495TBT15_UPD_CNT ;
   private short[] BC000T3_A155TBT15_CRF_ID ;
   private boolean[] BC000T3_n155TBT15_CRF_ID ;
   private byte[] BC000T3_A942TBT15_CRF_EDA_NO ;
   private boolean[] BC000T3_n942TBT15_CRF_EDA_NO ;
   private short[] BC000T3_A157TBT15_CRF_VERSION ;
   private boolean[] BC000T3_n157TBT15_CRF_VERSION ;
   private String[] BC000T3_A903TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] BC000T3_n903TBT15_CRF_ITEM_GRP_DIV ;
   private String[] BC000T3_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] BC000T3_n904TBT15_CRF_ITEM_GRP_CD ;
   private String[] BC000T3_A488TBT15_DEL_FLG ;
   private boolean[] BC000T3_n488TBT15_DEL_FLG ;
   private String[] BC000T3_A491TBT15_CRT_PROG_NM ;
   private boolean[] BC000T3_n491TBT15_CRT_PROG_NM ;
   private String[] BC000T3_A494TBT15_UPD_PROG_NM ;
   private boolean[] BC000T3_n494TBT15_UPD_PROG_NM ;
   private long[] BC000T3_A149TBT15_STUDY_ID ;
   private int[] BC000T3_A151TBT15_SUBJECT_ID ;
   private short[] BC000T3_A199TBT15_MEMO_NO ;
   private java.util.Date[] BC000T2_A489TBT15_CRT_DATETIME ;
   private boolean[] BC000T2_n489TBT15_CRT_DATETIME ;
   private String[] BC000T2_A490TBT15_CRT_USER_ID ;
   private boolean[] BC000T2_n490TBT15_CRT_USER_ID ;
   private java.util.Date[] BC000T2_A492TBT15_UPD_DATETIME ;
   private boolean[] BC000T2_n492TBT15_UPD_DATETIME ;
   private String[] BC000T2_A493TBT15_UPD_USER_ID ;
   private boolean[] BC000T2_n493TBT15_UPD_USER_ID ;
   private long[] BC000T2_A495TBT15_UPD_CNT ;
   private boolean[] BC000T2_n495TBT15_UPD_CNT ;
   private short[] BC000T2_A155TBT15_CRF_ID ;
   private boolean[] BC000T2_n155TBT15_CRF_ID ;
   private byte[] BC000T2_A942TBT15_CRF_EDA_NO ;
   private boolean[] BC000T2_n942TBT15_CRF_EDA_NO ;
   private short[] BC000T2_A157TBT15_CRF_VERSION ;
   private boolean[] BC000T2_n157TBT15_CRF_VERSION ;
   private String[] BC000T2_A903TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] BC000T2_n903TBT15_CRF_ITEM_GRP_DIV ;
   private String[] BC000T2_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] BC000T2_n904TBT15_CRF_ITEM_GRP_CD ;
   private String[] BC000T2_A488TBT15_DEL_FLG ;
   private boolean[] BC000T2_n488TBT15_DEL_FLG ;
   private String[] BC000T2_A491TBT15_CRT_PROG_NM ;
   private boolean[] BC000T2_n491TBT15_CRT_PROG_NM ;
   private String[] BC000T2_A494TBT15_UPD_PROG_NM ;
   private boolean[] BC000T2_n494TBT15_UPD_PROG_NM ;
   private long[] BC000T2_A149TBT15_STUDY_ID ;
   private int[] BC000T2_A151TBT15_SUBJECT_ID ;
   private short[] BC000T2_A199TBT15_MEMO_NO ;
   private java.util.Date[] BC000T10_A489TBT15_CRT_DATETIME ;
   private boolean[] BC000T10_n489TBT15_CRT_DATETIME ;
   private String[] BC000T10_A490TBT15_CRT_USER_ID ;
   private boolean[] BC000T10_n490TBT15_CRT_USER_ID ;
   private java.util.Date[] BC000T10_A492TBT15_UPD_DATETIME ;
   private boolean[] BC000T10_n492TBT15_UPD_DATETIME ;
   private String[] BC000T10_A493TBT15_UPD_USER_ID ;
   private boolean[] BC000T10_n493TBT15_UPD_USER_ID ;
   private long[] BC000T10_A495TBT15_UPD_CNT ;
   private boolean[] BC000T10_n495TBT15_UPD_CNT ;
   private short[] BC000T10_A155TBT15_CRF_ID ;
   private boolean[] BC000T10_n155TBT15_CRF_ID ;
   private byte[] BC000T10_A942TBT15_CRF_EDA_NO ;
   private boolean[] BC000T10_n942TBT15_CRF_EDA_NO ;
   private short[] BC000T10_A157TBT15_CRF_VERSION ;
   private boolean[] BC000T10_n157TBT15_CRF_VERSION ;
   private String[] BC000T10_A903TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] BC000T10_n903TBT15_CRF_ITEM_GRP_DIV ;
   private String[] BC000T10_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] BC000T10_n904TBT15_CRF_ITEM_GRP_CD ;
   private String[] BC000T10_A488TBT15_DEL_FLG ;
   private boolean[] BC000T10_n488TBT15_DEL_FLG ;
   private String[] BC000T10_A491TBT15_CRT_PROG_NM ;
   private boolean[] BC000T10_n491TBT15_CRT_PROG_NM ;
   private String[] BC000T10_A494TBT15_UPD_PROG_NM ;
   private boolean[] BC000T10_n494TBT15_UPD_PROG_NM ;
   private long[] BC000T10_A149TBT15_STUDY_ID ;
   private int[] BC000T10_A151TBT15_SUBJECT_ID ;
   private short[] BC000T10_A199TBT15_MEMO_NO ;
}

final  class tbt15_crf_memo_loc_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000T2", "SELECT `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_EDA_NO`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000T3", "SELECT `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_EDA_NO`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000T4", "SELECT `TBT14_STUDY_ID` AS TBT15_STUDY_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000T5", "SELECT TM1.`TBT15_CRT_DATETIME`, TM1.`TBT15_CRT_USER_ID`, TM1.`TBT15_UPD_DATETIME`, TM1.`TBT15_UPD_USER_ID`, TM1.`TBT15_UPD_CNT`, TM1.`TBT15_CRF_ID`, TM1.`TBT15_CRF_EDA_NO`, TM1.`TBT15_CRF_VERSION`, TM1.`TBT15_CRF_ITEM_GRP_DIV`, TM1.`TBT15_CRF_ITEM_GRP_CD`, TM1.`TBT15_DEL_FLG`, TM1.`TBT15_CRT_PROG_NM`, TM1.`TBT15_UPD_PROG_NM`, TM1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, TM1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, TM1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` TM1 WHERE TM1.`TBT15_STUDY_ID` = ? and TM1.`TBT15_SUBJECT_ID` = ? and TM1.`TBT15_MEMO_NO` = ? ORDER BY TM1.`TBT15_STUDY_ID`, TM1.`TBT15_SUBJECT_ID`, TM1.`TBT15_MEMO_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000T6", "SELECT `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000T7", "INSERT INTO `TBT15_CRF_MEMO_LOC`(`TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_EDA_NO`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000T8", "UPDATE `TBT15_CRF_MEMO_LOC` SET `TBT15_CRT_DATETIME`=?, `TBT15_CRT_USER_ID`=?, `TBT15_UPD_DATETIME`=?, `TBT15_UPD_USER_ID`=?, `TBT15_UPD_CNT`=?, `TBT15_CRF_ID`=?, `TBT15_CRF_EDA_NO`=?, `TBT15_CRF_VERSION`=?, `TBT15_CRF_ITEM_GRP_DIV`=?, `TBT15_CRF_ITEM_GRP_CD`=?, `TBT15_DEL_FLG`=?, `TBT15_CRT_PROG_NM`=?, `TBT15_UPD_PROG_NM`=?  WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000T9", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000T10", "SELECT TM1.`TBT15_CRT_DATETIME`, TM1.`TBT15_CRT_USER_ID`, TM1.`TBT15_UPD_DATETIME`, TM1.`TBT15_UPD_USER_ID`, TM1.`TBT15_UPD_CNT`, TM1.`TBT15_CRF_ID`, TM1.`TBT15_CRF_EDA_NO`, TM1.`TBT15_CRF_VERSION`, TM1.`TBT15_CRF_ITEM_GRP_DIV`, TM1.`TBT15_CRF_ITEM_GRP_CD`, TM1.`TBT15_DEL_FLG`, TM1.`TBT15_CRT_PROG_NM`, TM1.`TBT15_UPD_PROG_NM`, TM1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, TM1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, TM1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` TM1 WHERE TM1.`TBT15_STUDY_ID` = ? and TM1.`TBT15_SUBJECT_ID` = ? and TM1.`TBT15_MEMO_NO` = ? ORDER BY TM1.`TBT15_STUDY_ID`, TM1.`TBT15_SUBJECT_ID`, TM1.`TBT15_MEMO_NO` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((byte[]) buf[12])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(14) ;
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((short[]) buf[28])[0] = rslt.getShort(16) ;
               return;
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
               ((byte[]) buf[12])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(14) ;
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((short[]) buf[28])[0] = rslt.getShort(16) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
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
               ((byte[]) buf[12])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(14) ;
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((short[]) buf[28])[0] = rslt.getShort(16) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
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
               ((byte[]) buf[12])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(14) ;
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((short[]) buf[28])[0] = rslt.getShort(16) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
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
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 50);
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
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               stmt.setLong(14, ((Number) parms[26]).longValue());
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setShort(16, ((Number) parms[28]).shortValue());
               return;
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 50);
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
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               stmt.setLong(14, ((Number) parms[26]).longValue());
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setShort(16, ((Number) parms[28]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

