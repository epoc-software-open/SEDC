/*
               File: tbt12_crf_result_bc
        Description: CRF入力結果テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:12.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt12_crf_result_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt12_crf_result_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt12_crf_result_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt12_crf_result_bc.class ));
   }

   public tbt12_crf_result_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0R57( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0R57( ) ;
      standaloneModal( ) ;
      addRow0R57( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120R2 */
         e120R2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z96TBT12_STUDY_ID = A96TBT12_STUDY_ID ;
            Z97TBT12_SUBJECT_ID = A97TBT12_SUBJECT_ID ;
            Z98TBT12_CRF_ID = A98TBT12_CRF_ID ;
            Z937TBT12_CRF_EDA_NO = A937TBT12_CRF_EDA_NO ;
            Z99TBT12_CRF_ITEM_GRP_DIV = A99TBT12_CRF_ITEM_GRP_DIV ;
            Z100TBT12_CRF_ITEM_GRP_CD = A100TBT12_CRF_ITEM_GRP_CD ;
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

   public void confirm_0R0( )
   {
      beforeValidate0R57( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0R57( ) ;
         }
         else
         {
            checkExtendedTable0R57( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0R57( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110R2( )
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

   public void e120R2( )
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

   public void zm0R57( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z466TBT12_CRT_DATETIME = A466TBT12_CRT_DATETIME ;
         Z467TBT12_CRT_USER_ID = A467TBT12_CRT_USER_ID ;
         Z469TBT12_UPD_DATETIME = A469TBT12_UPD_DATETIME ;
         Z470TBT12_UPD_USER_ID = A470TBT12_UPD_USER_ID ;
         Z472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
         Z465TBT12_CRF_VALUE = A465TBT12_CRF_VALUE ;
         Z679TBT12_EDIT_FLG = A679TBT12_EDIT_FLG ;
         Z473TBT12_DEL_FLG = A473TBT12_DEL_FLG ;
         Z468TBT12_CRT_PROG_NM = A468TBT12_CRT_PROG_NM ;
         Z471TBT12_UPD_PROG_NM = A471TBT12_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z96TBT12_STUDY_ID = A96TBT12_STUDY_ID ;
         Z97TBT12_SUBJECT_ID = A97TBT12_SUBJECT_ID ;
         Z98TBT12_CRF_ID = A98TBT12_CRF_ID ;
         Z937TBT12_CRF_EDA_NO = A937TBT12_CRF_EDA_NO ;
         Z99TBT12_CRF_ITEM_GRP_DIV = A99TBT12_CRF_ITEM_GRP_DIV ;
         Z100TBT12_CRF_ITEM_GRP_CD = A100TBT12_CRF_ITEM_GRP_CD ;
         Z466TBT12_CRT_DATETIME = A466TBT12_CRT_DATETIME ;
         Z467TBT12_CRT_USER_ID = A467TBT12_CRT_USER_ID ;
         Z469TBT12_UPD_DATETIME = A469TBT12_UPD_DATETIME ;
         Z470TBT12_UPD_USER_ID = A470TBT12_UPD_USER_ID ;
         Z472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
         Z465TBT12_CRF_VALUE = A465TBT12_CRF_VALUE ;
         Z679TBT12_EDIT_FLG = A679TBT12_EDIT_FLG ;
         Z473TBT12_DEL_FLG = A473TBT12_DEL_FLG ;
         Z468TBT12_CRT_PROG_NM = A468TBT12_CRT_PROG_NM ;
         Z471TBT12_UPD_PROG_NM = A471TBT12_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0R57( )
   {
      /* Using cursor BC000R4 */
      pr_default.execute(2, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A466TBT12_CRT_DATETIME = BC000R4_A466TBT12_CRT_DATETIME[0] ;
         n466TBT12_CRT_DATETIME = BC000R4_n466TBT12_CRT_DATETIME[0] ;
         A467TBT12_CRT_USER_ID = BC000R4_A467TBT12_CRT_USER_ID[0] ;
         n467TBT12_CRT_USER_ID = BC000R4_n467TBT12_CRT_USER_ID[0] ;
         A469TBT12_UPD_DATETIME = BC000R4_A469TBT12_UPD_DATETIME[0] ;
         n469TBT12_UPD_DATETIME = BC000R4_n469TBT12_UPD_DATETIME[0] ;
         A470TBT12_UPD_USER_ID = BC000R4_A470TBT12_UPD_USER_ID[0] ;
         n470TBT12_UPD_USER_ID = BC000R4_n470TBT12_UPD_USER_ID[0] ;
         A472TBT12_UPD_CNT = BC000R4_A472TBT12_UPD_CNT[0] ;
         n472TBT12_UPD_CNT = BC000R4_n472TBT12_UPD_CNT[0] ;
         A465TBT12_CRF_VALUE = BC000R4_A465TBT12_CRF_VALUE[0] ;
         n465TBT12_CRF_VALUE = BC000R4_n465TBT12_CRF_VALUE[0] ;
         A679TBT12_EDIT_FLG = BC000R4_A679TBT12_EDIT_FLG[0] ;
         n679TBT12_EDIT_FLG = BC000R4_n679TBT12_EDIT_FLG[0] ;
         A473TBT12_DEL_FLG = BC000R4_A473TBT12_DEL_FLG[0] ;
         n473TBT12_DEL_FLG = BC000R4_n473TBT12_DEL_FLG[0] ;
         A468TBT12_CRT_PROG_NM = BC000R4_A468TBT12_CRT_PROG_NM[0] ;
         n468TBT12_CRT_PROG_NM = BC000R4_n468TBT12_CRT_PROG_NM[0] ;
         A471TBT12_UPD_PROG_NM = BC000R4_A471TBT12_UPD_PROG_NM[0] ;
         n471TBT12_UPD_PROG_NM = BC000R4_n471TBT12_UPD_PROG_NM[0] ;
         zm0R57( -8) ;
      }
      pr_default.close(2);
      onLoadActions0R57( ) ;
   }

   public void onLoadActions0R57( )
   {
      AV9Pgmname = "TBT12_CRF_RESULT_BC" ;
   }

   public void checkExtendedTable0R57( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT12_CRF_RESULT_BC" ;
      if ( ! ( GXutil.nullDate().equals(A466TBT12_CRT_DATETIME) || (( A466TBT12_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A466TBT12_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A469TBT12_UPD_DATETIME) || (( A469TBT12_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A469TBT12_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0R57( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0R57( )
   {
      /* Using cursor BC000R5 */
      pr_default.execute(3, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound57 = (short)(1) ;
      }
      else
      {
         RcdFound57 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000R3 */
      pr_default.execute(1, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0R57( 8) ;
         RcdFound57 = (short)(1) ;
         A96TBT12_STUDY_ID = BC000R3_A96TBT12_STUDY_ID[0] ;
         A97TBT12_SUBJECT_ID = BC000R3_A97TBT12_SUBJECT_ID[0] ;
         A98TBT12_CRF_ID = BC000R3_A98TBT12_CRF_ID[0] ;
         A937TBT12_CRF_EDA_NO = BC000R3_A937TBT12_CRF_EDA_NO[0] ;
         A99TBT12_CRF_ITEM_GRP_DIV = BC000R3_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
         A100TBT12_CRF_ITEM_GRP_CD = BC000R3_A100TBT12_CRF_ITEM_GRP_CD[0] ;
         A466TBT12_CRT_DATETIME = BC000R3_A466TBT12_CRT_DATETIME[0] ;
         n466TBT12_CRT_DATETIME = BC000R3_n466TBT12_CRT_DATETIME[0] ;
         A467TBT12_CRT_USER_ID = BC000R3_A467TBT12_CRT_USER_ID[0] ;
         n467TBT12_CRT_USER_ID = BC000R3_n467TBT12_CRT_USER_ID[0] ;
         A469TBT12_UPD_DATETIME = BC000R3_A469TBT12_UPD_DATETIME[0] ;
         n469TBT12_UPD_DATETIME = BC000R3_n469TBT12_UPD_DATETIME[0] ;
         A470TBT12_UPD_USER_ID = BC000R3_A470TBT12_UPD_USER_ID[0] ;
         n470TBT12_UPD_USER_ID = BC000R3_n470TBT12_UPD_USER_ID[0] ;
         A472TBT12_UPD_CNT = BC000R3_A472TBT12_UPD_CNT[0] ;
         n472TBT12_UPD_CNT = BC000R3_n472TBT12_UPD_CNT[0] ;
         A465TBT12_CRF_VALUE = BC000R3_A465TBT12_CRF_VALUE[0] ;
         n465TBT12_CRF_VALUE = BC000R3_n465TBT12_CRF_VALUE[0] ;
         A679TBT12_EDIT_FLG = BC000R3_A679TBT12_EDIT_FLG[0] ;
         n679TBT12_EDIT_FLG = BC000R3_n679TBT12_EDIT_FLG[0] ;
         A473TBT12_DEL_FLG = BC000R3_A473TBT12_DEL_FLG[0] ;
         n473TBT12_DEL_FLG = BC000R3_n473TBT12_DEL_FLG[0] ;
         A468TBT12_CRT_PROG_NM = BC000R3_A468TBT12_CRT_PROG_NM[0] ;
         n468TBT12_CRT_PROG_NM = BC000R3_n468TBT12_CRT_PROG_NM[0] ;
         A471TBT12_UPD_PROG_NM = BC000R3_A471TBT12_UPD_PROG_NM[0] ;
         n471TBT12_UPD_PROG_NM = BC000R3_n471TBT12_UPD_PROG_NM[0] ;
         O472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
         n472TBT12_UPD_CNT = false ;
         Z96TBT12_STUDY_ID = A96TBT12_STUDY_ID ;
         Z97TBT12_SUBJECT_ID = A97TBT12_SUBJECT_ID ;
         Z98TBT12_CRF_ID = A98TBT12_CRF_ID ;
         Z937TBT12_CRF_EDA_NO = A937TBT12_CRF_EDA_NO ;
         Z99TBT12_CRF_ITEM_GRP_DIV = A99TBT12_CRF_ITEM_GRP_DIV ;
         Z100TBT12_CRF_ITEM_GRP_CD = A100TBT12_CRF_ITEM_GRP_CD ;
         sMode57 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0R57( ) ;
         if ( AnyError == 1 )
         {
            RcdFound57 = (short)(0) ;
            initializeNonKey0R57( ) ;
         }
         Gx_mode = sMode57 ;
      }
      else
      {
         RcdFound57 = (short)(0) ;
         initializeNonKey0R57( ) ;
         sMode57 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode57 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0R57( ) ;
      if ( RcdFound57 == 0 )
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
      confirm_0R0( ) ;
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

   public void checkOptimisticConcurrency0R57( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000R2 */
         pr_default.execute(0, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT12_CRF_RESULT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z466TBT12_CRT_DATETIME.equals( BC000R2_A466TBT12_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z467TBT12_CRT_USER_ID, BC000R2_A467TBT12_CRT_USER_ID[0]) != 0 ) || !( Z469TBT12_UPD_DATETIME.equals( BC000R2_A469TBT12_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z470TBT12_UPD_USER_ID, BC000R2_A470TBT12_UPD_USER_ID[0]) != 0 ) || ( Z472TBT12_UPD_CNT != BC000R2_A472TBT12_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z465TBT12_CRF_VALUE, BC000R2_A465TBT12_CRF_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z679TBT12_EDIT_FLG, BC000R2_A679TBT12_EDIT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z473TBT12_DEL_FLG, BC000R2_A473TBT12_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z468TBT12_CRT_PROG_NM, BC000R2_A468TBT12_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z471TBT12_UPD_PROG_NM, BC000R2_A471TBT12_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT12_CRF_RESULT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0R57( )
   {
      beforeValidate0R57( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0R57( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0R57( 0) ;
         checkOptimisticConcurrency0R57( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0R57( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0R57( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000R6 */
                  pr_default.execute(4, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD, new Boolean(n466TBT12_CRT_DATETIME), A466TBT12_CRT_DATETIME, new Boolean(n467TBT12_CRT_USER_ID), A467TBT12_CRT_USER_ID, new Boolean(n469TBT12_UPD_DATETIME), A469TBT12_UPD_DATETIME, new Boolean(n470TBT12_UPD_USER_ID), A470TBT12_UPD_USER_ID, new Boolean(n472TBT12_UPD_CNT), new Long(A472TBT12_UPD_CNT), new Boolean(n465TBT12_CRF_VALUE), A465TBT12_CRF_VALUE, new Boolean(n679TBT12_EDIT_FLG), A679TBT12_EDIT_FLG, new Boolean(n473TBT12_DEL_FLG), A473TBT12_DEL_FLG, new Boolean(n468TBT12_CRT_PROG_NM), A468TBT12_CRT_PROG_NM, new Boolean(n471TBT12_UPD_PROG_NM), A471TBT12_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
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
            load0R57( ) ;
         }
         endLevel0R57( ) ;
      }
      closeExtendedTableCursors0R57( ) ;
   }

   public void update0R57( )
   {
      beforeValidate0R57( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0R57( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0R57( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0R57( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0R57( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000R7 */
                  pr_default.execute(5, new Object[] {new Boolean(n466TBT12_CRT_DATETIME), A466TBT12_CRT_DATETIME, new Boolean(n467TBT12_CRT_USER_ID), A467TBT12_CRT_USER_ID, new Boolean(n469TBT12_UPD_DATETIME), A469TBT12_UPD_DATETIME, new Boolean(n470TBT12_UPD_USER_ID), A470TBT12_UPD_USER_ID, new Boolean(n472TBT12_UPD_CNT), new Long(A472TBT12_UPD_CNT), new Boolean(n465TBT12_CRF_VALUE), A465TBT12_CRF_VALUE, new Boolean(n679TBT12_EDIT_FLG), A679TBT12_EDIT_FLG, new Boolean(n473TBT12_DEL_FLG), A473TBT12_DEL_FLG, new Boolean(n468TBT12_CRT_PROG_NM), A468TBT12_CRT_PROG_NM, new Boolean(n471TBT12_UPD_PROG_NM), A471TBT12_UPD_PROG_NM, new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT12_CRF_RESULT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0R57( ) ;
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
         endLevel0R57( ) ;
      }
      closeExtendedTableCursors0R57( ) ;
   }

   public void deferredUpdate0R57( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0R57( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0R57( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0R57( ) ;
         afterConfirm0R57( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0R57( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000R8 */
               pr_default.execute(6, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
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
      sMode57 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0R57( ) ;
      Gx_mode = sMode57 ;
   }

   public void onDeleteControls0R57( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT12_CRF_RESULT_BC" ;
      }
   }

   public void endLevel0R57( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0R57( ) ;
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

   public void scanKeyStart0R57( )
   {
      /* Scan By routine */
      /* Using cursor BC000R9 */
      pr_default.execute(7, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
      RcdFound57 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A96TBT12_STUDY_ID = BC000R9_A96TBT12_STUDY_ID[0] ;
         A97TBT12_SUBJECT_ID = BC000R9_A97TBT12_SUBJECT_ID[0] ;
         A98TBT12_CRF_ID = BC000R9_A98TBT12_CRF_ID[0] ;
         A937TBT12_CRF_EDA_NO = BC000R9_A937TBT12_CRF_EDA_NO[0] ;
         A99TBT12_CRF_ITEM_GRP_DIV = BC000R9_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
         A100TBT12_CRF_ITEM_GRP_CD = BC000R9_A100TBT12_CRF_ITEM_GRP_CD[0] ;
         A466TBT12_CRT_DATETIME = BC000R9_A466TBT12_CRT_DATETIME[0] ;
         n466TBT12_CRT_DATETIME = BC000R9_n466TBT12_CRT_DATETIME[0] ;
         A467TBT12_CRT_USER_ID = BC000R9_A467TBT12_CRT_USER_ID[0] ;
         n467TBT12_CRT_USER_ID = BC000R9_n467TBT12_CRT_USER_ID[0] ;
         A469TBT12_UPD_DATETIME = BC000R9_A469TBT12_UPD_DATETIME[0] ;
         n469TBT12_UPD_DATETIME = BC000R9_n469TBT12_UPD_DATETIME[0] ;
         A470TBT12_UPD_USER_ID = BC000R9_A470TBT12_UPD_USER_ID[0] ;
         n470TBT12_UPD_USER_ID = BC000R9_n470TBT12_UPD_USER_ID[0] ;
         A472TBT12_UPD_CNT = BC000R9_A472TBT12_UPD_CNT[0] ;
         n472TBT12_UPD_CNT = BC000R9_n472TBT12_UPD_CNT[0] ;
         A465TBT12_CRF_VALUE = BC000R9_A465TBT12_CRF_VALUE[0] ;
         n465TBT12_CRF_VALUE = BC000R9_n465TBT12_CRF_VALUE[0] ;
         A679TBT12_EDIT_FLG = BC000R9_A679TBT12_EDIT_FLG[0] ;
         n679TBT12_EDIT_FLG = BC000R9_n679TBT12_EDIT_FLG[0] ;
         A473TBT12_DEL_FLG = BC000R9_A473TBT12_DEL_FLG[0] ;
         n473TBT12_DEL_FLG = BC000R9_n473TBT12_DEL_FLG[0] ;
         A468TBT12_CRT_PROG_NM = BC000R9_A468TBT12_CRT_PROG_NM[0] ;
         n468TBT12_CRT_PROG_NM = BC000R9_n468TBT12_CRT_PROG_NM[0] ;
         A471TBT12_UPD_PROG_NM = BC000R9_A471TBT12_UPD_PROG_NM[0] ;
         n471TBT12_UPD_PROG_NM = BC000R9_n471TBT12_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0R57( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound57 = (short)(0) ;
      scanKeyLoad0R57( ) ;
   }

   public void scanKeyLoad0R57( )
   {
      sMode57 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A96TBT12_STUDY_ID = BC000R9_A96TBT12_STUDY_ID[0] ;
         A97TBT12_SUBJECT_ID = BC000R9_A97TBT12_SUBJECT_ID[0] ;
         A98TBT12_CRF_ID = BC000R9_A98TBT12_CRF_ID[0] ;
         A937TBT12_CRF_EDA_NO = BC000R9_A937TBT12_CRF_EDA_NO[0] ;
         A99TBT12_CRF_ITEM_GRP_DIV = BC000R9_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
         A100TBT12_CRF_ITEM_GRP_CD = BC000R9_A100TBT12_CRF_ITEM_GRP_CD[0] ;
         A466TBT12_CRT_DATETIME = BC000R9_A466TBT12_CRT_DATETIME[0] ;
         n466TBT12_CRT_DATETIME = BC000R9_n466TBT12_CRT_DATETIME[0] ;
         A467TBT12_CRT_USER_ID = BC000R9_A467TBT12_CRT_USER_ID[0] ;
         n467TBT12_CRT_USER_ID = BC000R9_n467TBT12_CRT_USER_ID[0] ;
         A469TBT12_UPD_DATETIME = BC000R9_A469TBT12_UPD_DATETIME[0] ;
         n469TBT12_UPD_DATETIME = BC000R9_n469TBT12_UPD_DATETIME[0] ;
         A470TBT12_UPD_USER_ID = BC000R9_A470TBT12_UPD_USER_ID[0] ;
         n470TBT12_UPD_USER_ID = BC000R9_n470TBT12_UPD_USER_ID[0] ;
         A472TBT12_UPD_CNT = BC000R9_A472TBT12_UPD_CNT[0] ;
         n472TBT12_UPD_CNT = BC000R9_n472TBT12_UPD_CNT[0] ;
         A465TBT12_CRF_VALUE = BC000R9_A465TBT12_CRF_VALUE[0] ;
         n465TBT12_CRF_VALUE = BC000R9_n465TBT12_CRF_VALUE[0] ;
         A679TBT12_EDIT_FLG = BC000R9_A679TBT12_EDIT_FLG[0] ;
         n679TBT12_EDIT_FLG = BC000R9_n679TBT12_EDIT_FLG[0] ;
         A473TBT12_DEL_FLG = BC000R9_A473TBT12_DEL_FLG[0] ;
         n473TBT12_DEL_FLG = BC000R9_n473TBT12_DEL_FLG[0] ;
         A468TBT12_CRT_PROG_NM = BC000R9_A468TBT12_CRT_PROG_NM[0] ;
         n468TBT12_CRT_PROG_NM = BC000R9_n468TBT12_CRT_PROG_NM[0] ;
         A471TBT12_UPD_PROG_NM = BC000R9_A471TBT12_UPD_PROG_NM[0] ;
         n471TBT12_UPD_PROG_NM = BC000R9_n471TBT12_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode57 ;
   }

   public void scanKeyEnd0R57( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0R57( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0R57( )
   {
      /* Before Insert Rules */
      A466TBT12_CRT_DATETIME = GXutil.now( ) ;
      n466TBT12_CRT_DATETIME = false ;
      GXt_char1 = A467TBT12_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_bc.this.GXt_char1 = GXv_char2[0] ;
      A467TBT12_CRT_USER_ID = GXt_char1 ;
      n467TBT12_CRT_USER_ID = false ;
      A469TBT12_UPD_DATETIME = GXutil.now( ) ;
      n469TBT12_UPD_DATETIME = false ;
      GXt_char1 = A470TBT12_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_bc.this.GXt_char1 = GXv_char2[0] ;
      A470TBT12_UPD_USER_ID = GXt_char1 ;
      n470TBT12_UPD_USER_ID = false ;
      A472TBT12_UPD_CNT = (long)(O472TBT12_UPD_CNT+1) ;
      n472TBT12_UPD_CNT = false ;
   }

   public void beforeUpdate0R57( )
   {
      /* Before Update Rules */
      A469TBT12_UPD_DATETIME = GXutil.now( ) ;
      n469TBT12_UPD_DATETIME = false ;
      GXt_char1 = A470TBT12_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_bc.this.GXt_char1 = GXv_char2[0] ;
      A470TBT12_UPD_USER_ID = GXt_char1 ;
      n470TBT12_UPD_USER_ID = false ;
      A472TBT12_UPD_CNT = (long)(O472TBT12_UPD_CNT+1) ;
      n472TBT12_UPD_CNT = false ;
   }

   public void beforeDelete0R57( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0R57( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0R57( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0R57( )
   {
   }

   public void addRow0R57( )
   {
      VarsToRow57( bcTBT12_CRF_RESULT) ;
   }

   public void readRow0R57( )
   {
      RowToVars57( bcTBT12_CRF_RESULT, 1) ;
   }

   public void initializeNonKey0R57( )
   {
      A466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n466TBT12_CRT_DATETIME = false ;
      A467TBT12_CRT_USER_ID = "" ;
      n467TBT12_CRT_USER_ID = false ;
      A469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n469TBT12_UPD_DATETIME = false ;
      A470TBT12_UPD_USER_ID = "" ;
      n470TBT12_UPD_USER_ID = false ;
      A472TBT12_UPD_CNT = 0 ;
      n472TBT12_UPD_CNT = false ;
      A465TBT12_CRF_VALUE = "" ;
      n465TBT12_CRF_VALUE = false ;
      A679TBT12_EDIT_FLG = "" ;
      n679TBT12_EDIT_FLG = false ;
      A473TBT12_DEL_FLG = "" ;
      n473TBT12_DEL_FLG = false ;
      A468TBT12_CRT_PROG_NM = "" ;
      n468TBT12_CRT_PROG_NM = false ;
      A471TBT12_UPD_PROG_NM = "" ;
      n471TBT12_UPD_PROG_NM = false ;
      O472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
      n472TBT12_UPD_CNT = false ;
   }

   public void initAll0R57( )
   {
      A96TBT12_STUDY_ID = 0 ;
      A97TBT12_SUBJECT_ID = 0 ;
      A98TBT12_CRF_ID = (short)(0) ;
      A937TBT12_CRF_EDA_NO = (byte)(0) ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      initializeNonKey0R57( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow57( SdtTBT12_CRF_RESULT obj57 )
   {
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Mode( Gx_mode );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime( A466TBT12_CRT_DATETIME );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id( A467TBT12_CRT_USER_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime( A469TBT12_UPD_DATETIME );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id( A470TBT12_UPD_USER_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt( A472TBT12_UPD_CNT );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value( A465TBT12_CRF_VALUE );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg( A679TBT12_EDIT_FLG );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg( A473TBT12_DEL_FLG );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm( A468TBT12_CRT_PROG_NM );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm( A471TBT12_UPD_PROG_NM );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id( A96TBT12_STUDY_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id( A97TBT12_SUBJECT_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id( A98TBT12_CRF_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no( A937TBT12_CRF_EDA_NO );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div( A99TBT12_CRF_ITEM_GRP_DIV );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd( A100TBT12_CRF_ITEM_GRP_CD );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z( Z96TBT12_STUDY_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z( Z97TBT12_SUBJECT_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z( Z98TBT12_CRF_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z( Z937TBT12_CRF_EDA_NO );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z( Z99TBT12_CRF_ITEM_GRP_DIV );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z( Z100TBT12_CRF_ITEM_GRP_CD );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z( Z465TBT12_CRF_VALUE );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z( Z679TBT12_EDIT_FLG );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z( Z473TBT12_DEL_FLG );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z( Z466TBT12_CRT_DATETIME );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z( Z467TBT12_CRT_USER_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z( Z468TBT12_CRT_PROG_NM );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z( Z469TBT12_UPD_DATETIME );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z( Z470TBT12_UPD_USER_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z( Z471TBT12_UPD_PROG_NM );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z( Z472TBT12_UPD_CNT );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N( (byte)((byte)((n465TBT12_CRF_VALUE)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N( (byte)((byte)((n679TBT12_EDIT_FLG)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N( (byte)((byte)((n473TBT12_DEL_FLG)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N( (byte)((byte)((n466TBT12_CRT_DATETIME)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N( (byte)((byte)((n467TBT12_CRT_USER_ID)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N( (byte)((byte)((n468TBT12_CRT_PROG_NM)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N( (byte)((byte)((n469TBT12_UPD_DATETIME)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N( (byte)((byte)((n470TBT12_UPD_USER_ID)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N( (byte)((byte)((n471TBT12_UPD_PROG_NM)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N( (byte)((byte)((n472TBT12_UPD_CNT)?1:0)) );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Mode( Gx_mode );
   }

   public void KeyVarsToRow57( SdtTBT12_CRF_RESULT obj57 )
   {
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id( A96TBT12_STUDY_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id( A97TBT12_SUBJECT_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id( A98TBT12_CRF_ID );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no( A937TBT12_CRF_EDA_NO );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div( A99TBT12_CRF_ITEM_GRP_DIV );
      obj57.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd( A100TBT12_CRF_ITEM_GRP_CD );
   }

   public void RowToVars57( SdtTBT12_CRF_RESULT obj57 ,
                            int forceLoad )
   {
      Gx_mode = obj57.getgxTv_SdtTBT12_CRF_RESULT_Mode() ;
      A466TBT12_CRT_DATETIME = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime() ;
      n466TBT12_CRT_DATETIME = false ;
      A467TBT12_CRT_USER_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id() ;
      n467TBT12_CRT_USER_ID = false ;
      A469TBT12_UPD_DATETIME = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime() ;
      n469TBT12_UPD_DATETIME = false ;
      A470TBT12_UPD_USER_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id() ;
      n470TBT12_UPD_USER_ID = false ;
      A472TBT12_UPD_CNT = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt() ;
      n472TBT12_UPD_CNT = false ;
      A465TBT12_CRF_VALUE = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value() ;
      n465TBT12_CRF_VALUE = false ;
      A679TBT12_EDIT_FLG = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg() ;
      n679TBT12_EDIT_FLG = false ;
      A473TBT12_DEL_FLG = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg() ;
      n473TBT12_DEL_FLG = false ;
      A468TBT12_CRT_PROG_NM = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm() ;
      n468TBT12_CRT_PROG_NM = false ;
      A471TBT12_UPD_PROG_NM = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm() ;
      n471TBT12_UPD_PROG_NM = false ;
      A96TBT12_STUDY_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id() ;
      A97TBT12_SUBJECT_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id() ;
      A98TBT12_CRF_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id() ;
      A937TBT12_CRF_EDA_NO = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no() ;
      A99TBT12_CRF_ITEM_GRP_DIV = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div() ;
      A100TBT12_CRF_ITEM_GRP_CD = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd() ;
      Z96TBT12_STUDY_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z() ;
      Z97TBT12_SUBJECT_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z() ;
      Z98TBT12_CRF_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z() ;
      Z937TBT12_CRF_EDA_NO = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z() ;
      Z99TBT12_CRF_ITEM_GRP_DIV = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z() ;
      Z100TBT12_CRF_ITEM_GRP_CD = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z() ;
      Z465TBT12_CRF_VALUE = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z() ;
      Z679TBT12_EDIT_FLG = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z() ;
      Z473TBT12_DEL_FLG = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z() ;
      Z466TBT12_CRT_DATETIME = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z() ;
      Z467TBT12_CRT_USER_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z() ;
      Z468TBT12_CRT_PROG_NM = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z() ;
      Z469TBT12_UPD_DATETIME = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z() ;
      Z470TBT12_UPD_USER_ID = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z() ;
      Z471TBT12_UPD_PROG_NM = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z() ;
      Z472TBT12_UPD_CNT = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z() ;
      O472TBT12_UPD_CNT = obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z() ;
      n465TBT12_CRF_VALUE = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N()==0)?false:true) ;
      n679TBT12_EDIT_FLG = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N()==0)?false:true) ;
      n473TBT12_DEL_FLG = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N()==0)?false:true) ;
      n466TBT12_CRT_DATETIME = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N()==0)?false:true) ;
      n467TBT12_CRT_USER_ID = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N()==0)?false:true) ;
      n468TBT12_CRT_PROG_NM = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N()==0)?false:true) ;
      n469TBT12_UPD_DATETIME = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N()==0)?false:true) ;
      n470TBT12_UPD_USER_ID = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N()==0)?false:true) ;
      n471TBT12_UPD_PROG_NM = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N()==0)?false:true) ;
      n472TBT12_UPD_CNT = (boolean)((obj57.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj57.getgxTv_SdtTBT12_CRF_RESULT_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A96TBT12_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A97TBT12_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A98TBT12_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A937TBT12_CRF_EDA_NO = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      A99TBT12_CRF_ITEM_GRP_DIV = (String)getParm(obj,4) ;
      A100TBT12_CRF_ITEM_GRP_CD = (String)getParm(obj,5) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0R57( ) ;
      scanKeyStart0R57( ) ;
      if ( RcdFound57 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z96TBT12_STUDY_ID = A96TBT12_STUDY_ID ;
         Z97TBT12_SUBJECT_ID = A97TBT12_SUBJECT_ID ;
         Z98TBT12_CRF_ID = A98TBT12_CRF_ID ;
         Z937TBT12_CRF_EDA_NO = A937TBT12_CRF_EDA_NO ;
         Z99TBT12_CRF_ITEM_GRP_DIV = A99TBT12_CRF_ITEM_GRP_DIV ;
         Z100TBT12_CRF_ITEM_GRP_CD = A100TBT12_CRF_ITEM_GRP_CD ;
         O472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
         n472TBT12_UPD_CNT = false ;
      }
      zm0R57( -8) ;
      onLoadActions0R57( ) ;
      addRow0R57( ) ;
      scanKeyEnd0R57( ) ;
      if ( RcdFound57 == 0 )
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
      RowToVars57( bcTBT12_CRF_RESULT, 0) ;
      scanKeyStart0R57( ) ;
      if ( RcdFound57 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z96TBT12_STUDY_ID = A96TBT12_STUDY_ID ;
         Z97TBT12_SUBJECT_ID = A97TBT12_SUBJECT_ID ;
         Z98TBT12_CRF_ID = A98TBT12_CRF_ID ;
         Z937TBT12_CRF_EDA_NO = A937TBT12_CRF_EDA_NO ;
         Z99TBT12_CRF_ITEM_GRP_DIV = A99TBT12_CRF_ITEM_GRP_DIV ;
         Z100TBT12_CRF_ITEM_GRP_CD = A100TBT12_CRF_ITEM_GRP_CD ;
         O472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
         n472TBT12_UPD_CNT = false ;
      }
      zm0R57( -8) ;
      onLoadActions0R57( ) ;
      addRow0R57( ) ;
      scanKeyEnd0R57( ) ;
      if ( RcdFound57 == 0 )
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
      RowToVars57( bcTBT12_CRF_RESULT, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0R57( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0R57( ) ;
      }
      else
      {
         if ( RcdFound57 == 1 )
         {
            if ( ( A96TBT12_STUDY_ID != Z96TBT12_STUDY_ID ) || ( A97TBT12_SUBJECT_ID != Z97TBT12_SUBJECT_ID ) || ( A98TBT12_CRF_ID != Z98TBT12_CRF_ID ) || ( A937TBT12_CRF_EDA_NO != Z937TBT12_CRF_EDA_NO ) || ( GXutil.strcmp(A99TBT12_CRF_ITEM_GRP_DIV, Z99TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A100TBT12_CRF_ITEM_GRP_CD, Z100TBT12_CRF_ITEM_GRP_CD) != 0 ) )
            {
               A96TBT12_STUDY_ID = Z96TBT12_STUDY_ID ;
               A97TBT12_SUBJECT_ID = Z97TBT12_SUBJECT_ID ;
               A98TBT12_CRF_ID = Z98TBT12_CRF_ID ;
               A937TBT12_CRF_EDA_NO = Z937TBT12_CRF_EDA_NO ;
               A99TBT12_CRF_ITEM_GRP_DIV = Z99TBT12_CRF_ITEM_GRP_DIV ;
               A100TBT12_CRF_ITEM_GRP_CD = Z100TBT12_CRF_ITEM_GRP_CD ;
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
               update0R57( ) ;
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
               if ( ( A96TBT12_STUDY_ID != Z96TBT12_STUDY_ID ) || ( A97TBT12_SUBJECT_ID != Z97TBT12_SUBJECT_ID ) || ( A98TBT12_CRF_ID != Z98TBT12_CRF_ID ) || ( A937TBT12_CRF_EDA_NO != Z937TBT12_CRF_EDA_NO ) || ( GXutil.strcmp(A99TBT12_CRF_ITEM_GRP_DIV, Z99TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A100TBT12_CRF_ITEM_GRP_CD, Z100TBT12_CRF_ITEM_GRP_CD) != 0 ) )
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
                     insert0R57( ) ;
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
                     insert0R57( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow57( bcTBT12_CRF_RESULT) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars57( bcTBT12_CRF_RESULT, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0R57( ) ;
      if ( RcdFound57 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A96TBT12_STUDY_ID != Z96TBT12_STUDY_ID ) || ( A97TBT12_SUBJECT_ID != Z97TBT12_SUBJECT_ID ) || ( A98TBT12_CRF_ID != Z98TBT12_CRF_ID ) || ( A937TBT12_CRF_EDA_NO != Z937TBT12_CRF_EDA_NO ) || ( GXutil.strcmp(A99TBT12_CRF_ITEM_GRP_DIV, Z99TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A100TBT12_CRF_ITEM_GRP_CD, Z100TBT12_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A96TBT12_STUDY_ID = Z96TBT12_STUDY_ID ;
            A97TBT12_SUBJECT_ID = Z97TBT12_SUBJECT_ID ;
            A98TBT12_CRF_ID = Z98TBT12_CRF_ID ;
            A937TBT12_CRF_EDA_NO = Z937TBT12_CRF_EDA_NO ;
            A99TBT12_CRF_ITEM_GRP_DIV = Z99TBT12_CRF_ITEM_GRP_DIV ;
            A100TBT12_CRF_ITEM_GRP_CD = Z100TBT12_CRF_ITEM_GRP_CD ;
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
         if ( ( A96TBT12_STUDY_ID != Z96TBT12_STUDY_ID ) || ( A97TBT12_SUBJECT_ID != Z97TBT12_SUBJECT_ID ) || ( A98TBT12_CRF_ID != Z98TBT12_CRF_ID ) || ( A937TBT12_CRF_EDA_NO != Z937TBT12_CRF_EDA_NO ) || ( GXutil.strcmp(A99TBT12_CRF_ITEM_GRP_DIV, Z99TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A100TBT12_CRF_ITEM_GRP_CD, Z100TBT12_CRF_ITEM_GRP_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt12_crf_result_bc");
      VarsToRow57( bcTBT12_CRF_RESULT) ;
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
      Gx_mode = bcTBT12_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT12_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT12_CRF_RESULT sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT12_CRF_RESULT )
      {
         bcTBT12_CRF_RESULT = sdt ;
         if ( GXutil.strcmp(bcTBT12_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Mode(), "") == 0 )
         {
            bcTBT12_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow57( bcTBT12_CRF_RESULT) ;
         }
         else
         {
            RowToVars57( bcTBT12_CRF_RESULT, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT12_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Mode(), "") == 0 )
         {
            bcTBT12_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars57( bcTBT12_CRF_RESULT, 1) ;
   }

   public SdtTBT12_CRF_RESULT getTBT12_CRF_RESULT_BC( )
   {
      return bcTBT12_CRF_RESULT ;
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
      Z99TBT12_CRF_ITEM_GRP_DIV = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      Z100TBT12_CRF_ITEM_GRP_CD = "" ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z467TBT12_CRT_USER_ID = "" ;
      A467TBT12_CRT_USER_ID = "" ;
      Z469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z470TBT12_UPD_USER_ID = "" ;
      A470TBT12_UPD_USER_ID = "" ;
      Z465TBT12_CRF_VALUE = "" ;
      A465TBT12_CRF_VALUE = "" ;
      Z679TBT12_EDIT_FLG = "" ;
      A679TBT12_EDIT_FLG = "" ;
      Z473TBT12_DEL_FLG = "" ;
      A473TBT12_DEL_FLG = "" ;
      Z468TBT12_CRT_PROG_NM = "" ;
      A468TBT12_CRT_PROG_NM = "" ;
      Z471TBT12_UPD_PROG_NM = "" ;
      A471TBT12_UPD_PROG_NM = "" ;
      BC000R4_A96TBT12_STUDY_ID = new long[1] ;
      BC000R4_A97TBT12_SUBJECT_ID = new int[1] ;
      BC000R4_A98TBT12_CRF_ID = new short[1] ;
      BC000R4_A937TBT12_CRF_EDA_NO = new byte[1] ;
      BC000R4_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R4_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R4_A466TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R4_n466TBT12_CRT_DATETIME = new boolean[] {false} ;
      BC000R4_A467TBT12_CRT_USER_ID = new String[] {""} ;
      BC000R4_n467TBT12_CRT_USER_ID = new boolean[] {false} ;
      BC000R4_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R4_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      BC000R4_A470TBT12_UPD_USER_ID = new String[] {""} ;
      BC000R4_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      BC000R4_A472TBT12_UPD_CNT = new long[1] ;
      BC000R4_n472TBT12_UPD_CNT = new boolean[] {false} ;
      BC000R4_A465TBT12_CRF_VALUE = new String[] {""} ;
      BC000R4_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      BC000R4_A679TBT12_EDIT_FLG = new String[] {""} ;
      BC000R4_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      BC000R4_A473TBT12_DEL_FLG = new String[] {""} ;
      BC000R4_n473TBT12_DEL_FLG = new boolean[] {false} ;
      BC000R4_A468TBT12_CRT_PROG_NM = new String[] {""} ;
      BC000R4_n468TBT12_CRT_PROG_NM = new boolean[] {false} ;
      BC000R4_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      BC000R4_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      BC000R5_A96TBT12_STUDY_ID = new long[1] ;
      BC000R5_A97TBT12_SUBJECT_ID = new int[1] ;
      BC000R5_A98TBT12_CRF_ID = new short[1] ;
      BC000R5_A937TBT12_CRF_EDA_NO = new byte[1] ;
      BC000R5_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R5_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R3_A96TBT12_STUDY_ID = new long[1] ;
      BC000R3_A97TBT12_SUBJECT_ID = new int[1] ;
      BC000R3_A98TBT12_CRF_ID = new short[1] ;
      BC000R3_A937TBT12_CRF_EDA_NO = new byte[1] ;
      BC000R3_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R3_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R3_A466TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R3_n466TBT12_CRT_DATETIME = new boolean[] {false} ;
      BC000R3_A467TBT12_CRT_USER_ID = new String[] {""} ;
      BC000R3_n467TBT12_CRT_USER_ID = new boolean[] {false} ;
      BC000R3_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R3_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      BC000R3_A470TBT12_UPD_USER_ID = new String[] {""} ;
      BC000R3_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      BC000R3_A472TBT12_UPD_CNT = new long[1] ;
      BC000R3_n472TBT12_UPD_CNT = new boolean[] {false} ;
      BC000R3_A465TBT12_CRF_VALUE = new String[] {""} ;
      BC000R3_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      BC000R3_A679TBT12_EDIT_FLG = new String[] {""} ;
      BC000R3_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      BC000R3_A473TBT12_DEL_FLG = new String[] {""} ;
      BC000R3_n473TBT12_DEL_FLG = new boolean[] {false} ;
      BC000R3_A468TBT12_CRT_PROG_NM = new String[] {""} ;
      BC000R3_n468TBT12_CRT_PROG_NM = new boolean[] {false} ;
      BC000R3_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      BC000R3_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      sMode57 = "" ;
      BC000R2_A96TBT12_STUDY_ID = new long[1] ;
      BC000R2_A97TBT12_SUBJECT_ID = new int[1] ;
      BC000R2_A98TBT12_CRF_ID = new short[1] ;
      BC000R2_A937TBT12_CRF_EDA_NO = new byte[1] ;
      BC000R2_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R2_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R2_A466TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R2_n466TBT12_CRT_DATETIME = new boolean[] {false} ;
      BC000R2_A467TBT12_CRT_USER_ID = new String[] {""} ;
      BC000R2_n467TBT12_CRT_USER_ID = new boolean[] {false} ;
      BC000R2_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R2_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      BC000R2_A470TBT12_UPD_USER_ID = new String[] {""} ;
      BC000R2_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      BC000R2_A472TBT12_UPD_CNT = new long[1] ;
      BC000R2_n472TBT12_UPD_CNT = new boolean[] {false} ;
      BC000R2_A465TBT12_CRF_VALUE = new String[] {""} ;
      BC000R2_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      BC000R2_A679TBT12_EDIT_FLG = new String[] {""} ;
      BC000R2_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      BC000R2_A473TBT12_DEL_FLG = new String[] {""} ;
      BC000R2_n473TBT12_DEL_FLG = new boolean[] {false} ;
      BC000R2_A468TBT12_CRT_PROG_NM = new String[] {""} ;
      BC000R2_n468TBT12_CRT_PROG_NM = new boolean[] {false} ;
      BC000R2_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      BC000R2_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      BC000R9_A96TBT12_STUDY_ID = new long[1] ;
      BC000R9_A97TBT12_SUBJECT_ID = new int[1] ;
      BC000R9_A98TBT12_CRF_ID = new short[1] ;
      BC000R9_A937TBT12_CRF_EDA_NO = new byte[1] ;
      BC000R9_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R9_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R9_A466TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R9_n466TBT12_CRT_DATETIME = new boolean[] {false} ;
      BC000R9_A467TBT12_CRT_USER_ID = new String[] {""} ;
      BC000R9_n467TBT12_CRT_USER_ID = new boolean[] {false} ;
      BC000R9_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R9_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      BC000R9_A470TBT12_UPD_USER_ID = new String[] {""} ;
      BC000R9_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      BC000R9_A472TBT12_UPD_CNT = new long[1] ;
      BC000R9_n472TBT12_UPD_CNT = new boolean[] {false} ;
      BC000R9_A465TBT12_CRF_VALUE = new String[] {""} ;
      BC000R9_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      BC000R9_A679TBT12_EDIT_FLG = new String[] {""} ;
      BC000R9_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      BC000R9_A473TBT12_DEL_FLG = new String[] {""} ;
      BC000R9_n473TBT12_DEL_FLG = new boolean[] {false} ;
      BC000R9_A468TBT12_CRT_PROG_NM = new String[] {""} ;
      BC000R9_n468TBT12_CRT_PROG_NM = new boolean[] {false} ;
      BC000R9_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      BC000R9_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt12_crf_result_bc__default(),
         new Object[] {
             new Object[] {
            BC000R2_A96TBT12_STUDY_ID, BC000R2_A97TBT12_SUBJECT_ID, BC000R2_A98TBT12_CRF_ID, BC000R2_A937TBT12_CRF_EDA_NO, BC000R2_A99TBT12_CRF_ITEM_GRP_DIV, BC000R2_A100TBT12_CRF_ITEM_GRP_CD, BC000R2_A466TBT12_CRT_DATETIME, BC000R2_n466TBT12_CRT_DATETIME, BC000R2_A467TBT12_CRT_USER_ID, BC000R2_n467TBT12_CRT_USER_ID,
            BC000R2_A469TBT12_UPD_DATETIME, BC000R2_n469TBT12_UPD_DATETIME, BC000R2_A470TBT12_UPD_USER_ID, BC000R2_n470TBT12_UPD_USER_ID, BC000R2_A472TBT12_UPD_CNT, BC000R2_n472TBT12_UPD_CNT, BC000R2_A465TBT12_CRF_VALUE, BC000R2_n465TBT12_CRF_VALUE, BC000R2_A679TBT12_EDIT_FLG, BC000R2_n679TBT12_EDIT_FLG,
            BC000R2_A473TBT12_DEL_FLG, BC000R2_n473TBT12_DEL_FLG, BC000R2_A468TBT12_CRT_PROG_NM, BC000R2_n468TBT12_CRT_PROG_NM, BC000R2_A471TBT12_UPD_PROG_NM, BC000R2_n471TBT12_UPD_PROG_NM
            }
            , new Object[] {
            BC000R3_A96TBT12_STUDY_ID, BC000R3_A97TBT12_SUBJECT_ID, BC000R3_A98TBT12_CRF_ID, BC000R3_A937TBT12_CRF_EDA_NO, BC000R3_A99TBT12_CRF_ITEM_GRP_DIV, BC000R3_A100TBT12_CRF_ITEM_GRP_CD, BC000R3_A466TBT12_CRT_DATETIME, BC000R3_n466TBT12_CRT_DATETIME, BC000R3_A467TBT12_CRT_USER_ID, BC000R3_n467TBT12_CRT_USER_ID,
            BC000R3_A469TBT12_UPD_DATETIME, BC000R3_n469TBT12_UPD_DATETIME, BC000R3_A470TBT12_UPD_USER_ID, BC000R3_n470TBT12_UPD_USER_ID, BC000R3_A472TBT12_UPD_CNT, BC000R3_n472TBT12_UPD_CNT, BC000R3_A465TBT12_CRF_VALUE, BC000R3_n465TBT12_CRF_VALUE, BC000R3_A679TBT12_EDIT_FLG, BC000R3_n679TBT12_EDIT_FLG,
            BC000R3_A473TBT12_DEL_FLG, BC000R3_n473TBT12_DEL_FLG, BC000R3_A468TBT12_CRT_PROG_NM, BC000R3_n468TBT12_CRT_PROG_NM, BC000R3_A471TBT12_UPD_PROG_NM, BC000R3_n471TBT12_UPD_PROG_NM
            }
            , new Object[] {
            BC000R4_A96TBT12_STUDY_ID, BC000R4_A97TBT12_SUBJECT_ID, BC000R4_A98TBT12_CRF_ID, BC000R4_A937TBT12_CRF_EDA_NO, BC000R4_A99TBT12_CRF_ITEM_GRP_DIV, BC000R4_A100TBT12_CRF_ITEM_GRP_CD, BC000R4_A466TBT12_CRT_DATETIME, BC000R4_n466TBT12_CRT_DATETIME, BC000R4_A467TBT12_CRT_USER_ID, BC000R4_n467TBT12_CRT_USER_ID,
            BC000R4_A469TBT12_UPD_DATETIME, BC000R4_n469TBT12_UPD_DATETIME, BC000R4_A470TBT12_UPD_USER_ID, BC000R4_n470TBT12_UPD_USER_ID, BC000R4_A472TBT12_UPD_CNT, BC000R4_n472TBT12_UPD_CNT, BC000R4_A465TBT12_CRF_VALUE, BC000R4_n465TBT12_CRF_VALUE, BC000R4_A679TBT12_EDIT_FLG, BC000R4_n679TBT12_EDIT_FLG,
            BC000R4_A473TBT12_DEL_FLG, BC000R4_n473TBT12_DEL_FLG, BC000R4_A468TBT12_CRT_PROG_NM, BC000R4_n468TBT12_CRT_PROG_NM, BC000R4_A471TBT12_UPD_PROG_NM, BC000R4_n471TBT12_UPD_PROG_NM
            }
            , new Object[] {
            BC000R5_A96TBT12_STUDY_ID, BC000R5_A97TBT12_SUBJECT_ID, BC000R5_A98TBT12_CRF_ID, BC000R5_A937TBT12_CRF_EDA_NO, BC000R5_A99TBT12_CRF_ITEM_GRP_DIV, BC000R5_A100TBT12_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000R9_A96TBT12_STUDY_ID, BC000R9_A97TBT12_SUBJECT_ID, BC000R9_A98TBT12_CRF_ID, BC000R9_A937TBT12_CRF_EDA_NO, BC000R9_A99TBT12_CRF_ITEM_GRP_DIV, BC000R9_A100TBT12_CRF_ITEM_GRP_CD, BC000R9_A466TBT12_CRT_DATETIME, BC000R9_n466TBT12_CRT_DATETIME, BC000R9_A467TBT12_CRT_USER_ID, BC000R9_n467TBT12_CRT_USER_ID,
            BC000R9_A469TBT12_UPD_DATETIME, BC000R9_n469TBT12_UPD_DATETIME, BC000R9_A470TBT12_UPD_USER_ID, BC000R9_n470TBT12_UPD_USER_ID, BC000R9_A472TBT12_UPD_CNT, BC000R9_n472TBT12_UPD_CNT, BC000R9_A465TBT12_CRF_VALUE, BC000R9_n465TBT12_CRF_VALUE, BC000R9_A679TBT12_EDIT_FLG, BC000R9_n679TBT12_EDIT_FLG,
            BC000R9_A473TBT12_DEL_FLG, BC000R9_n473TBT12_DEL_FLG, BC000R9_A468TBT12_CRT_PROG_NM, BC000R9_n468TBT12_CRT_PROG_NM, BC000R9_A471TBT12_UPD_PROG_NM, BC000R9_n471TBT12_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT12_CRF_RESULT_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110R2 */
      e110R2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z937TBT12_CRF_EDA_NO ;
   private byte A937TBT12_CRF_EDA_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z98TBT12_CRF_ID ;
   private short A98TBT12_CRF_ID ;
   private short RcdFound57 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z97TBT12_SUBJECT_ID ;
   private int A97TBT12_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z96TBT12_STUDY_ID ;
   private long A96TBT12_STUDY_ID ;
   private long Z472TBT12_UPD_CNT ;
   private long A472TBT12_UPD_CNT ;
   private long O472TBT12_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode57 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date Z466TBT12_CRT_DATETIME ;
   private java.util.Date A466TBT12_CRT_DATETIME ;
   private java.util.Date Z469TBT12_UPD_DATETIME ;
   private java.util.Date A469TBT12_UPD_DATETIME ;
   private boolean n466TBT12_CRT_DATETIME ;
   private boolean n467TBT12_CRT_USER_ID ;
   private boolean n469TBT12_UPD_DATETIME ;
   private boolean n470TBT12_UPD_USER_ID ;
   private boolean n472TBT12_UPD_CNT ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n679TBT12_EDIT_FLG ;
   private boolean n473TBT12_DEL_FLG ;
   private boolean n468TBT12_CRT_PROG_NM ;
   private boolean n471TBT12_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z99TBT12_CRF_ITEM_GRP_DIV ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String Z100TBT12_CRF_ITEM_GRP_CD ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String AV8W_BC_FLG ;
   private String Z467TBT12_CRT_USER_ID ;
   private String A467TBT12_CRT_USER_ID ;
   private String Z470TBT12_UPD_USER_ID ;
   private String A470TBT12_UPD_USER_ID ;
   private String Z465TBT12_CRF_VALUE ;
   private String A465TBT12_CRF_VALUE ;
   private String Z679TBT12_EDIT_FLG ;
   private String A679TBT12_EDIT_FLG ;
   private String Z473TBT12_DEL_FLG ;
   private String A473TBT12_DEL_FLG ;
   private String Z468TBT12_CRT_PROG_NM ;
   private String A468TBT12_CRT_PROG_NM ;
   private String Z471TBT12_UPD_PROG_NM ;
   private String A471TBT12_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT12_CRF_RESULT bcTBT12_CRF_RESULT ;
   private IDataStoreProvider pr_default ;
   private long[] BC000R4_A96TBT12_STUDY_ID ;
   private int[] BC000R4_A97TBT12_SUBJECT_ID ;
   private short[] BC000R4_A98TBT12_CRF_ID ;
   private byte[] BC000R4_A937TBT12_CRF_EDA_NO ;
   private String[] BC000R4_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R4_A100TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000R4_A466TBT12_CRT_DATETIME ;
   private boolean[] BC000R4_n466TBT12_CRT_DATETIME ;
   private String[] BC000R4_A467TBT12_CRT_USER_ID ;
   private boolean[] BC000R4_n467TBT12_CRT_USER_ID ;
   private java.util.Date[] BC000R4_A469TBT12_UPD_DATETIME ;
   private boolean[] BC000R4_n469TBT12_UPD_DATETIME ;
   private String[] BC000R4_A470TBT12_UPD_USER_ID ;
   private boolean[] BC000R4_n470TBT12_UPD_USER_ID ;
   private long[] BC000R4_A472TBT12_UPD_CNT ;
   private boolean[] BC000R4_n472TBT12_UPD_CNT ;
   private String[] BC000R4_A465TBT12_CRF_VALUE ;
   private boolean[] BC000R4_n465TBT12_CRF_VALUE ;
   private String[] BC000R4_A679TBT12_EDIT_FLG ;
   private boolean[] BC000R4_n679TBT12_EDIT_FLG ;
   private String[] BC000R4_A473TBT12_DEL_FLG ;
   private boolean[] BC000R4_n473TBT12_DEL_FLG ;
   private String[] BC000R4_A468TBT12_CRT_PROG_NM ;
   private boolean[] BC000R4_n468TBT12_CRT_PROG_NM ;
   private String[] BC000R4_A471TBT12_UPD_PROG_NM ;
   private boolean[] BC000R4_n471TBT12_UPD_PROG_NM ;
   private long[] BC000R5_A96TBT12_STUDY_ID ;
   private int[] BC000R5_A97TBT12_SUBJECT_ID ;
   private short[] BC000R5_A98TBT12_CRF_ID ;
   private byte[] BC000R5_A937TBT12_CRF_EDA_NO ;
   private String[] BC000R5_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R5_A100TBT12_CRF_ITEM_GRP_CD ;
   private long[] BC000R3_A96TBT12_STUDY_ID ;
   private int[] BC000R3_A97TBT12_SUBJECT_ID ;
   private short[] BC000R3_A98TBT12_CRF_ID ;
   private byte[] BC000R3_A937TBT12_CRF_EDA_NO ;
   private String[] BC000R3_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R3_A100TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000R3_A466TBT12_CRT_DATETIME ;
   private boolean[] BC000R3_n466TBT12_CRT_DATETIME ;
   private String[] BC000R3_A467TBT12_CRT_USER_ID ;
   private boolean[] BC000R3_n467TBT12_CRT_USER_ID ;
   private java.util.Date[] BC000R3_A469TBT12_UPD_DATETIME ;
   private boolean[] BC000R3_n469TBT12_UPD_DATETIME ;
   private String[] BC000R3_A470TBT12_UPD_USER_ID ;
   private boolean[] BC000R3_n470TBT12_UPD_USER_ID ;
   private long[] BC000R3_A472TBT12_UPD_CNT ;
   private boolean[] BC000R3_n472TBT12_UPD_CNT ;
   private String[] BC000R3_A465TBT12_CRF_VALUE ;
   private boolean[] BC000R3_n465TBT12_CRF_VALUE ;
   private String[] BC000R3_A679TBT12_EDIT_FLG ;
   private boolean[] BC000R3_n679TBT12_EDIT_FLG ;
   private String[] BC000R3_A473TBT12_DEL_FLG ;
   private boolean[] BC000R3_n473TBT12_DEL_FLG ;
   private String[] BC000R3_A468TBT12_CRT_PROG_NM ;
   private boolean[] BC000R3_n468TBT12_CRT_PROG_NM ;
   private String[] BC000R3_A471TBT12_UPD_PROG_NM ;
   private boolean[] BC000R3_n471TBT12_UPD_PROG_NM ;
   private long[] BC000R2_A96TBT12_STUDY_ID ;
   private int[] BC000R2_A97TBT12_SUBJECT_ID ;
   private short[] BC000R2_A98TBT12_CRF_ID ;
   private byte[] BC000R2_A937TBT12_CRF_EDA_NO ;
   private String[] BC000R2_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R2_A100TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000R2_A466TBT12_CRT_DATETIME ;
   private boolean[] BC000R2_n466TBT12_CRT_DATETIME ;
   private String[] BC000R2_A467TBT12_CRT_USER_ID ;
   private boolean[] BC000R2_n467TBT12_CRT_USER_ID ;
   private java.util.Date[] BC000R2_A469TBT12_UPD_DATETIME ;
   private boolean[] BC000R2_n469TBT12_UPD_DATETIME ;
   private String[] BC000R2_A470TBT12_UPD_USER_ID ;
   private boolean[] BC000R2_n470TBT12_UPD_USER_ID ;
   private long[] BC000R2_A472TBT12_UPD_CNT ;
   private boolean[] BC000R2_n472TBT12_UPD_CNT ;
   private String[] BC000R2_A465TBT12_CRF_VALUE ;
   private boolean[] BC000R2_n465TBT12_CRF_VALUE ;
   private String[] BC000R2_A679TBT12_EDIT_FLG ;
   private boolean[] BC000R2_n679TBT12_EDIT_FLG ;
   private String[] BC000R2_A473TBT12_DEL_FLG ;
   private boolean[] BC000R2_n473TBT12_DEL_FLG ;
   private String[] BC000R2_A468TBT12_CRT_PROG_NM ;
   private boolean[] BC000R2_n468TBT12_CRT_PROG_NM ;
   private String[] BC000R2_A471TBT12_UPD_PROG_NM ;
   private boolean[] BC000R2_n471TBT12_UPD_PROG_NM ;
   private long[] BC000R9_A96TBT12_STUDY_ID ;
   private int[] BC000R9_A97TBT12_SUBJECT_ID ;
   private short[] BC000R9_A98TBT12_CRF_ID ;
   private byte[] BC000R9_A937TBT12_CRF_EDA_NO ;
   private String[] BC000R9_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R9_A100TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000R9_A466TBT12_CRT_DATETIME ;
   private boolean[] BC000R9_n466TBT12_CRT_DATETIME ;
   private String[] BC000R9_A467TBT12_CRT_USER_ID ;
   private boolean[] BC000R9_n467TBT12_CRT_USER_ID ;
   private java.util.Date[] BC000R9_A469TBT12_UPD_DATETIME ;
   private boolean[] BC000R9_n469TBT12_UPD_DATETIME ;
   private String[] BC000R9_A470TBT12_UPD_USER_ID ;
   private boolean[] BC000R9_n470TBT12_UPD_USER_ID ;
   private long[] BC000R9_A472TBT12_UPD_CNT ;
   private boolean[] BC000R9_n472TBT12_UPD_CNT ;
   private String[] BC000R9_A465TBT12_CRF_VALUE ;
   private boolean[] BC000R9_n465TBT12_CRF_VALUE ;
   private String[] BC000R9_A679TBT12_EDIT_FLG ;
   private boolean[] BC000R9_n679TBT12_EDIT_FLG ;
   private String[] BC000R9_A473TBT12_DEL_FLG ;
   private boolean[] BC000R9_n473TBT12_DEL_FLG ;
   private String[] BC000R9_A468TBT12_CRT_PROG_NM ;
   private boolean[] BC000R9_n468TBT12_CRT_PROG_NM ;
   private String[] BC000R9_A471TBT12_UPD_PROG_NM ;
   private boolean[] BC000R9_n471TBT12_UPD_PROG_NM ;
}

final  class tbt12_crf_result_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000R2", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000R3", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000R4", "SELECT TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_EDA_NO`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD`, TM1.`TBT12_CRT_DATETIME`, TM1.`TBT12_CRT_USER_ID`, TM1.`TBT12_UPD_DATETIME`, TM1.`TBT12_UPD_USER_ID`, TM1.`TBT12_UPD_CNT`, TM1.`TBT12_CRF_VALUE`, TM1.`TBT12_EDIT_FLG`, TM1.`TBT12_DEL_FLG`, TM1.`TBT12_CRT_PROG_NM`, TM1.`TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` TM1 WHERE TM1.`TBT12_STUDY_ID` = ? and TM1.`TBT12_SUBJECT_ID` = ? and TM1.`TBT12_CRF_ID` = ? and TM1.`TBT12_CRF_EDA_NO` = ? and TM1.`TBT12_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT12_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_EDA_NO`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000R5", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000R6", "INSERT INTO `TBT12_CRF_RESULT`(`TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000R7", "UPDATE `TBT12_CRF_RESULT` SET `TBT12_CRT_DATETIME`=?, `TBT12_CRT_USER_ID`=?, `TBT12_UPD_DATETIME`=?, `TBT12_UPD_USER_ID`=?, `TBT12_UPD_CNT`=?, `TBT12_CRF_VALUE`=?, `TBT12_EDIT_FLG`=?, `TBT12_DEL_FLG`=?, `TBT12_CRT_PROG_NM`=?, `TBT12_UPD_PROG_NM`=?  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000R8", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000R9", "SELECT TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_EDA_NO`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD`, TM1.`TBT12_CRT_DATETIME`, TM1.`TBT12_CRT_USER_ID`, TM1.`TBT12_UPD_DATETIME`, TM1.`TBT12_UPD_USER_ID`, TM1.`TBT12_UPD_CNT`, TM1.`TBT12_CRF_VALUE`, TM1.`TBT12_EDIT_FLG`, TM1.`TBT12_DEL_FLG`, TM1.`TBT12_CRT_PROG_NM`, TM1.`TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` TM1 WHERE TM1.`TBT12_STUDY_ID` = ? and TM1.`TBT12_SUBJECT_ID` = ? and TM1.`TBT12_CRF_ID` = ? and TM1.`TBT12_CRF_EDA_NO` = ? and TM1.`TBT12_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT12_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_EDA_NO`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[13], 128);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[15]).longValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[17], 2000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 40);
               }
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 2000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1);
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
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               stmt.setLong(11, ((Number) parms[20]).longValue());
               stmt.setInt(12, ((Number) parms[21]).intValue());
               stmt.setShort(13, ((Number) parms[22]).shortValue());
               stmt.setByte(14, ((Number) parms[23]).byteValue());
               stmt.setVarchar(15, (String)parms[24], 1, false);
               stmt.setVarchar(16, (String)parms[25], 50, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
      }
   }

}

