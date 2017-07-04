/*
               File: tbt13_crf_res_his_bc
        Description: CRF入力結果履歴テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:27.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt13_crf_res_his_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt13_crf_res_his_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt13_crf_res_his_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt13_crf_res_his_bc.class ));
   }

   public tbt13_crf_res_his_bc( int remoteHandle ,
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
         /* Execute user event: e12122 */
         e12122 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z496TBT13_STUDY_ID = A496TBT13_STUDY_ID ;
            Z497TBT13_SUBJECT_ID = A497TBT13_SUBJECT_ID ;
            Z498TBT13_CRF_ID = A498TBT13_CRF_ID ;
            Z499TBT13_CRF_VERSION = A499TBT13_CRF_VERSION ;
            Z500TBT13_CRF_ITEM_GRP_DIV = A500TBT13_CRF_ITEM_GRP_DIV ;
            Z501TBT13_CRF_ITEM_GRP_CD = A501TBT13_CRF_ITEM_GRP_CD ;
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

   public void confirm_120( )
   {
      beforeValidate1237( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1237( ) ;
         }
         else
         {
            checkExtendedTable1237( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1237( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11122( )
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

   public void e12122( )
   {
      /* After Trn Routine */
   }

   public void S1169( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1237( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z504TBT13_CRT_DATETIME = A504TBT13_CRT_DATETIME ;
         Z505TBT13_CRT_USER_ID = A505TBT13_CRT_USER_ID ;
         Z507TBT13_UPD_DATETIME = A507TBT13_UPD_DATETIME ;
         Z508TBT13_UPD_USER_ID = A508TBT13_UPD_USER_ID ;
         Z510TBT13_UPD_CNT = A510TBT13_UPD_CNT ;
         Z502TBT13_CRF_VALUE = A502TBT13_CRF_VALUE ;
         Z588TBT13_EDIT_FLG = A588TBT13_EDIT_FLG ;
         Z503TBT13_DEL_FLG = A503TBT13_DEL_FLG ;
         Z506TBT13_CRT_PROG_NM = A506TBT13_CRT_PROG_NM ;
         Z509TBT13_UPD_PROG_NM = A509TBT13_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z496TBT13_STUDY_ID = A496TBT13_STUDY_ID ;
         Z497TBT13_SUBJECT_ID = A497TBT13_SUBJECT_ID ;
         Z498TBT13_CRF_ID = A498TBT13_CRF_ID ;
         Z499TBT13_CRF_VERSION = A499TBT13_CRF_VERSION ;
         Z500TBT13_CRF_ITEM_GRP_DIV = A500TBT13_CRF_ITEM_GRP_DIV ;
         Z501TBT13_CRF_ITEM_GRP_CD = A501TBT13_CRF_ITEM_GRP_CD ;
         Z504TBT13_CRT_DATETIME = A504TBT13_CRT_DATETIME ;
         Z505TBT13_CRT_USER_ID = A505TBT13_CRT_USER_ID ;
         Z507TBT13_UPD_DATETIME = A507TBT13_UPD_DATETIME ;
         Z508TBT13_UPD_USER_ID = A508TBT13_UPD_USER_ID ;
         Z510TBT13_UPD_CNT = A510TBT13_UPD_CNT ;
         Z502TBT13_CRF_VALUE = A502TBT13_CRF_VALUE ;
         Z588TBT13_EDIT_FLG = A588TBT13_EDIT_FLG ;
         Z503TBT13_DEL_FLG = A503TBT13_DEL_FLG ;
         Z506TBT13_CRT_PROG_NM = A506TBT13_CRT_PROG_NM ;
         Z509TBT13_UPD_PROG_NM = A509TBT13_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1237( )
   {
      /* Using cursor BC00124 */
      pr_default.execute(2, new Object[] {new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A504TBT13_CRT_DATETIME = BC00124_A504TBT13_CRT_DATETIME[0] ;
         n504TBT13_CRT_DATETIME = BC00124_n504TBT13_CRT_DATETIME[0] ;
         A505TBT13_CRT_USER_ID = BC00124_A505TBT13_CRT_USER_ID[0] ;
         n505TBT13_CRT_USER_ID = BC00124_n505TBT13_CRT_USER_ID[0] ;
         A507TBT13_UPD_DATETIME = BC00124_A507TBT13_UPD_DATETIME[0] ;
         n507TBT13_UPD_DATETIME = BC00124_n507TBT13_UPD_DATETIME[0] ;
         A508TBT13_UPD_USER_ID = BC00124_A508TBT13_UPD_USER_ID[0] ;
         n508TBT13_UPD_USER_ID = BC00124_n508TBT13_UPD_USER_ID[0] ;
         A510TBT13_UPD_CNT = BC00124_A510TBT13_UPD_CNT[0] ;
         n510TBT13_UPD_CNT = BC00124_n510TBT13_UPD_CNT[0] ;
         A502TBT13_CRF_VALUE = BC00124_A502TBT13_CRF_VALUE[0] ;
         n502TBT13_CRF_VALUE = BC00124_n502TBT13_CRF_VALUE[0] ;
         A588TBT13_EDIT_FLG = BC00124_A588TBT13_EDIT_FLG[0] ;
         n588TBT13_EDIT_FLG = BC00124_n588TBT13_EDIT_FLG[0] ;
         A503TBT13_DEL_FLG = BC00124_A503TBT13_DEL_FLG[0] ;
         n503TBT13_DEL_FLG = BC00124_n503TBT13_DEL_FLG[0] ;
         A506TBT13_CRT_PROG_NM = BC00124_A506TBT13_CRT_PROG_NM[0] ;
         n506TBT13_CRT_PROG_NM = BC00124_n506TBT13_CRT_PROG_NM[0] ;
         A509TBT13_UPD_PROG_NM = BC00124_A509TBT13_UPD_PROG_NM[0] ;
         n509TBT13_UPD_PROG_NM = BC00124_n509TBT13_UPD_PROG_NM[0] ;
         zm1237( -8) ;
      }
      pr_default.close(2);
      onLoadActions1237( ) ;
   }

   public void onLoadActions1237( )
   {
      AV9Pgmname = "TBT13_CRF_RES_HIS_BC" ;
   }

   public void checkExtendedTable1237( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT13_CRF_RES_HIS_BC" ;
      if ( ! ( GXutil.nullDate().equals(A504TBT13_CRT_DATETIME) || (( A504TBT13_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A504TBT13_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A507TBT13_UPD_DATETIME) || (( A507TBT13_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A507TBT13_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1237( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1237( )
   {
      /* Using cursor BC00125 */
      pr_default.execute(3, new Object[] {new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound37 = (short)(1) ;
      }
      else
      {
         RcdFound37 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00123 */
      pr_default.execute(1, new Object[] {new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1237( 8) ;
         RcdFound37 = (short)(1) ;
         A496TBT13_STUDY_ID = BC00123_A496TBT13_STUDY_ID[0] ;
         A497TBT13_SUBJECT_ID = BC00123_A497TBT13_SUBJECT_ID[0] ;
         A498TBT13_CRF_ID = BC00123_A498TBT13_CRF_ID[0] ;
         A499TBT13_CRF_VERSION = BC00123_A499TBT13_CRF_VERSION[0] ;
         A500TBT13_CRF_ITEM_GRP_DIV = BC00123_A500TBT13_CRF_ITEM_GRP_DIV[0] ;
         A501TBT13_CRF_ITEM_GRP_CD = BC00123_A501TBT13_CRF_ITEM_GRP_CD[0] ;
         A504TBT13_CRT_DATETIME = BC00123_A504TBT13_CRT_DATETIME[0] ;
         n504TBT13_CRT_DATETIME = BC00123_n504TBT13_CRT_DATETIME[0] ;
         A505TBT13_CRT_USER_ID = BC00123_A505TBT13_CRT_USER_ID[0] ;
         n505TBT13_CRT_USER_ID = BC00123_n505TBT13_CRT_USER_ID[0] ;
         A507TBT13_UPD_DATETIME = BC00123_A507TBT13_UPD_DATETIME[0] ;
         n507TBT13_UPD_DATETIME = BC00123_n507TBT13_UPD_DATETIME[0] ;
         A508TBT13_UPD_USER_ID = BC00123_A508TBT13_UPD_USER_ID[0] ;
         n508TBT13_UPD_USER_ID = BC00123_n508TBT13_UPD_USER_ID[0] ;
         A510TBT13_UPD_CNT = BC00123_A510TBT13_UPD_CNT[0] ;
         n510TBT13_UPD_CNT = BC00123_n510TBT13_UPD_CNT[0] ;
         A502TBT13_CRF_VALUE = BC00123_A502TBT13_CRF_VALUE[0] ;
         n502TBT13_CRF_VALUE = BC00123_n502TBT13_CRF_VALUE[0] ;
         A588TBT13_EDIT_FLG = BC00123_A588TBT13_EDIT_FLG[0] ;
         n588TBT13_EDIT_FLG = BC00123_n588TBT13_EDIT_FLG[0] ;
         A503TBT13_DEL_FLG = BC00123_A503TBT13_DEL_FLG[0] ;
         n503TBT13_DEL_FLG = BC00123_n503TBT13_DEL_FLG[0] ;
         A506TBT13_CRT_PROG_NM = BC00123_A506TBT13_CRT_PROG_NM[0] ;
         n506TBT13_CRT_PROG_NM = BC00123_n506TBT13_CRT_PROG_NM[0] ;
         A509TBT13_UPD_PROG_NM = BC00123_A509TBT13_UPD_PROG_NM[0] ;
         n509TBT13_UPD_PROG_NM = BC00123_n509TBT13_UPD_PROG_NM[0] ;
         O510TBT13_UPD_CNT = A510TBT13_UPD_CNT ;
         n510TBT13_UPD_CNT = false ;
         Z496TBT13_STUDY_ID = A496TBT13_STUDY_ID ;
         Z497TBT13_SUBJECT_ID = A497TBT13_SUBJECT_ID ;
         Z498TBT13_CRF_ID = A498TBT13_CRF_ID ;
         Z499TBT13_CRF_VERSION = A499TBT13_CRF_VERSION ;
         Z500TBT13_CRF_ITEM_GRP_DIV = A500TBT13_CRF_ITEM_GRP_DIV ;
         Z501TBT13_CRF_ITEM_GRP_CD = A501TBT13_CRF_ITEM_GRP_CD ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1237( ) ;
         Gx_mode = sMode37 ;
      }
      else
      {
         RcdFound37 = (short)(0) ;
         initializeNonKey1237( ) ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode37 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1237( ) ;
      if ( RcdFound37 == 0 )
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
      confirm_120( ) ;
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

   public void checkOptimisticConcurrency1237( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00122 */
         pr_default.execute(0, new Object[] {new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z504TBT13_CRT_DATETIME.equals( BC00122_A504TBT13_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z505TBT13_CRT_USER_ID, BC00122_A505TBT13_CRT_USER_ID[0]) != 0 ) || !( Z507TBT13_UPD_DATETIME.equals( BC00122_A507TBT13_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z508TBT13_UPD_USER_ID, BC00122_A508TBT13_UPD_USER_ID[0]) != 0 ) || ( Z510TBT13_UPD_CNT != BC00122_A510TBT13_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z502TBT13_CRF_VALUE, BC00122_A502TBT13_CRF_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z588TBT13_EDIT_FLG, BC00122_A588TBT13_EDIT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z503TBT13_DEL_FLG, BC00122_A503TBT13_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z506TBT13_CRT_PROG_NM, BC00122_A506TBT13_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z509TBT13_UPD_PROG_NM, BC00122_A509TBT13_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1237( )
   {
      beforeValidate1237( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1237( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1237( 0) ;
         checkOptimisticConcurrency1237( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1237( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1237( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00126 */
                  pr_default.execute(4, new Object[] {new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD, new Boolean(n504TBT13_CRT_DATETIME), A504TBT13_CRT_DATETIME, new Boolean(n505TBT13_CRT_USER_ID), A505TBT13_CRT_USER_ID, new Boolean(n507TBT13_UPD_DATETIME), A507TBT13_UPD_DATETIME, new Boolean(n508TBT13_UPD_USER_ID), A508TBT13_UPD_USER_ID, new Boolean(n510TBT13_UPD_CNT), new Long(A510TBT13_UPD_CNT), new Boolean(n502TBT13_CRF_VALUE), A502TBT13_CRF_VALUE, new Boolean(n588TBT13_EDIT_FLG), A588TBT13_EDIT_FLG, new Boolean(n503TBT13_DEL_FLG), A503TBT13_DEL_FLG, new Boolean(n506TBT13_CRT_PROG_NM), A506TBT13_CRT_PROG_NM, new Boolean(n509TBT13_UPD_PROG_NM), A509TBT13_UPD_PROG_NM});
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
            load1237( ) ;
         }
         endLevel1237( ) ;
      }
      closeExtendedTableCursors1237( ) ;
   }

   public void update1237( )
   {
      beforeValidate1237( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1237( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1237( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1237( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1237( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00127 */
                  pr_default.execute(5, new Object[] {new Boolean(n504TBT13_CRT_DATETIME), A504TBT13_CRT_DATETIME, new Boolean(n505TBT13_CRT_USER_ID), A505TBT13_CRT_USER_ID, new Boolean(n507TBT13_UPD_DATETIME), A507TBT13_UPD_DATETIME, new Boolean(n508TBT13_UPD_USER_ID), A508TBT13_UPD_USER_ID, new Boolean(n510TBT13_UPD_CNT), new Long(A510TBT13_UPD_CNT), new Boolean(n502TBT13_CRF_VALUE), A502TBT13_CRF_VALUE, new Boolean(n588TBT13_EDIT_FLG), A588TBT13_EDIT_FLG, new Boolean(n503TBT13_DEL_FLG), A503TBT13_DEL_FLG, new Boolean(n506TBT13_CRT_PROG_NM), A506TBT13_CRT_PROG_NM, new Boolean(n509TBT13_UPD_PROG_NM), A509TBT13_UPD_PROG_NM, new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1237( ) ;
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
         endLevel1237( ) ;
      }
      closeExtendedTableCursors1237( ) ;
   }

   public void deferredUpdate1237( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1237( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1237( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1237( ) ;
         afterConfirm1237( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1237( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00128 */
               pr_default.execute(6, new Object[] {new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD});
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
      sMode37 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1237( ) ;
      Gx_mode = sMode37 ;
   }

   public void onDeleteControls1237( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT13_CRF_RES_HIS_BC" ;
      }
   }

   public void endLevel1237( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1237( ) ;
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

   public void scanKeyStart1237( )
   {
      /* Using cursor BC00129 */
      pr_default.execute(7, new Object[] {new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD});
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A496TBT13_STUDY_ID = BC00129_A496TBT13_STUDY_ID[0] ;
         A497TBT13_SUBJECT_ID = BC00129_A497TBT13_SUBJECT_ID[0] ;
         A498TBT13_CRF_ID = BC00129_A498TBT13_CRF_ID[0] ;
         A499TBT13_CRF_VERSION = BC00129_A499TBT13_CRF_VERSION[0] ;
         A500TBT13_CRF_ITEM_GRP_DIV = BC00129_A500TBT13_CRF_ITEM_GRP_DIV[0] ;
         A501TBT13_CRF_ITEM_GRP_CD = BC00129_A501TBT13_CRF_ITEM_GRP_CD[0] ;
         A504TBT13_CRT_DATETIME = BC00129_A504TBT13_CRT_DATETIME[0] ;
         n504TBT13_CRT_DATETIME = BC00129_n504TBT13_CRT_DATETIME[0] ;
         A505TBT13_CRT_USER_ID = BC00129_A505TBT13_CRT_USER_ID[0] ;
         n505TBT13_CRT_USER_ID = BC00129_n505TBT13_CRT_USER_ID[0] ;
         A507TBT13_UPD_DATETIME = BC00129_A507TBT13_UPD_DATETIME[0] ;
         n507TBT13_UPD_DATETIME = BC00129_n507TBT13_UPD_DATETIME[0] ;
         A508TBT13_UPD_USER_ID = BC00129_A508TBT13_UPD_USER_ID[0] ;
         n508TBT13_UPD_USER_ID = BC00129_n508TBT13_UPD_USER_ID[0] ;
         A510TBT13_UPD_CNT = BC00129_A510TBT13_UPD_CNT[0] ;
         n510TBT13_UPD_CNT = BC00129_n510TBT13_UPD_CNT[0] ;
         A502TBT13_CRF_VALUE = BC00129_A502TBT13_CRF_VALUE[0] ;
         n502TBT13_CRF_VALUE = BC00129_n502TBT13_CRF_VALUE[0] ;
         A588TBT13_EDIT_FLG = BC00129_A588TBT13_EDIT_FLG[0] ;
         n588TBT13_EDIT_FLG = BC00129_n588TBT13_EDIT_FLG[0] ;
         A503TBT13_DEL_FLG = BC00129_A503TBT13_DEL_FLG[0] ;
         n503TBT13_DEL_FLG = BC00129_n503TBT13_DEL_FLG[0] ;
         A506TBT13_CRT_PROG_NM = BC00129_A506TBT13_CRT_PROG_NM[0] ;
         n506TBT13_CRT_PROG_NM = BC00129_n506TBT13_CRT_PROG_NM[0] ;
         A509TBT13_UPD_PROG_NM = BC00129_A509TBT13_UPD_PROG_NM[0] ;
         n509TBT13_UPD_PROG_NM = BC00129_n509TBT13_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1237( )
   {
      pr_default.readNext(7);
      RcdFound37 = (short)(0) ;
      scanKeyLoad1237( ) ;
   }

   public void scanKeyLoad1237( )
   {
      sMode37 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A496TBT13_STUDY_ID = BC00129_A496TBT13_STUDY_ID[0] ;
         A497TBT13_SUBJECT_ID = BC00129_A497TBT13_SUBJECT_ID[0] ;
         A498TBT13_CRF_ID = BC00129_A498TBT13_CRF_ID[0] ;
         A499TBT13_CRF_VERSION = BC00129_A499TBT13_CRF_VERSION[0] ;
         A500TBT13_CRF_ITEM_GRP_DIV = BC00129_A500TBT13_CRF_ITEM_GRP_DIV[0] ;
         A501TBT13_CRF_ITEM_GRP_CD = BC00129_A501TBT13_CRF_ITEM_GRP_CD[0] ;
         A504TBT13_CRT_DATETIME = BC00129_A504TBT13_CRT_DATETIME[0] ;
         n504TBT13_CRT_DATETIME = BC00129_n504TBT13_CRT_DATETIME[0] ;
         A505TBT13_CRT_USER_ID = BC00129_A505TBT13_CRT_USER_ID[0] ;
         n505TBT13_CRT_USER_ID = BC00129_n505TBT13_CRT_USER_ID[0] ;
         A507TBT13_UPD_DATETIME = BC00129_A507TBT13_UPD_DATETIME[0] ;
         n507TBT13_UPD_DATETIME = BC00129_n507TBT13_UPD_DATETIME[0] ;
         A508TBT13_UPD_USER_ID = BC00129_A508TBT13_UPD_USER_ID[0] ;
         n508TBT13_UPD_USER_ID = BC00129_n508TBT13_UPD_USER_ID[0] ;
         A510TBT13_UPD_CNT = BC00129_A510TBT13_UPD_CNT[0] ;
         n510TBT13_UPD_CNT = BC00129_n510TBT13_UPD_CNT[0] ;
         A502TBT13_CRF_VALUE = BC00129_A502TBT13_CRF_VALUE[0] ;
         n502TBT13_CRF_VALUE = BC00129_n502TBT13_CRF_VALUE[0] ;
         A588TBT13_EDIT_FLG = BC00129_A588TBT13_EDIT_FLG[0] ;
         n588TBT13_EDIT_FLG = BC00129_n588TBT13_EDIT_FLG[0] ;
         A503TBT13_DEL_FLG = BC00129_A503TBT13_DEL_FLG[0] ;
         n503TBT13_DEL_FLG = BC00129_n503TBT13_DEL_FLG[0] ;
         A506TBT13_CRT_PROG_NM = BC00129_A506TBT13_CRT_PROG_NM[0] ;
         n506TBT13_CRT_PROG_NM = BC00129_n506TBT13_CRT_PROG_NM[0] ;
         A509TBT13_UPD_PROG_NM = BC00129_A509TBT13_UPD_PROG_NM[0] ;
         n509TBT13_UPD_PROG_NM = BC00129_n509TBT13_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode37 ;
   }

   public void scanKeyEnd1237( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1237( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1237( )
   {
      /* Before Insert Rules */
      A504TBT13_CRT_DATETIME = GXutil.now( ) ;
      n504TBT13_CRT_DATETIME = false ;
      GXt_char1 = A505TBT13_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_bc.this.GXt_char1 = GXv_char2[0] ;
      A505TBT13_CRT_USER_ID = GXt_char1 ;
      n505TBT13_CRT_USER_ID = false ;
      A507TBT13_UPD_DATETIME = GXutil.now( ) ;
      n507TBT13_UPD_DATETIME = false ;
      GXt_char1 = A508TBT13_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_bc.this.GXt_char1 = GXv_char2[0] ;
      A508TBT13_UPD_USER_ID = GXt_char1 ;
      n508TBT13_UPD_USER_ID = false ;
      A510TBT13_UPD_CNT = (long)(O510TBT13_UPD_CNT+1) ;
      n510TBT13_UPD_CNT = false ;
   }

   public void beforeUpdate1237( )
   {
      /* Before Update Rules */
      A507TBT13_UPD_DATETIME = GXutil.now( ) ;
      n507TBT13_UPD_DATETIME = false ;
      GXt_char1 = A508TBT13_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_bc.this.GXt_char1 = GXv_char2[0] ;
      A508TBT13_UPD_USER_ID = GXt_char1 ;
      n508TBT13_UPD_USER_ID = false ;
      A510TBT13_UPD_CNT = (long)(O510TBT13_UPD_CNT+1) ;
      n510TBT13_UPD_CNT = false ;
   }

   public void beforeDelete1237( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1237( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1237( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1237( )
   {
   }

   public void addRow1237( )
   {
      VarsToRow37( bcTBT13_CRF_RES_HIS) ;
   }

   public void readRow1237( )
   {
      RowToVars37( bcTBT13_CRF_RES_HIS, 1) ;
   }

   public void initializeNonKey1237( )
   {
      A504TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n504TBT13_CRT_DATETIME = false ;
      A505TBT13_CRT_USER_ID = "" ;
      n505TBT13_CRT_USER_ID = false ;
      A507TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n507TBT13_UPD_DATETIME = false ;
      A508TBT13_UPD_USER_ID = "" ;
      n508TBT13_UPD_USER_ID = false ;
      A510TBT13_UPD_CNT = 0 ;
      n510TBT13_UPD_CNT = false ;
      A502TBT13_CRF_VALUE = "" ;
      n502TBT13_CRF_VALUE = false ;
      A588TBT13_EDIT_FLG = "" ;
      n588TBT13_EDIT_FLG = false ;
      A503TBT13_DEL_FLG = "" ;
      n503TBT13_DEL_FLG = false ;
      A506TBT13_CRT_PROG_NM = "" ;
      n506TBT13_CRT_PROG_NM = false ;
      A509TBT13_UPD_PROG_NM = "" ;
      n509TBT13_UPD_PROG_NM = false ;
      O510TBT13_UPD_CNT = A510TBT13_UPD_CNT ;
      n510TBT13_UPD_CNT = false ;
   }

   public void initAll1237( )
   {
      A496TBT13_STUDY_ID = 0 ;
      A497TBT13_SUBJECT_ID = 0 ;
      A498TBT13_CRF_ID = (short)(0) ;
      A499TBT13_CRF_VERSION = (short)(0) ;
      A500TBT13_CRF_ITEM_GRP_DIV = "" ;
      A501TBT13_CRF_ITEM_GRP_CD = "" ;
      initializeNonKey1237( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow37( SdtTBT13_CRF_RES_HIS obj37 )
   {
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( Gx_mode );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime( A504TBT13_CRT_DATETIME );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id( A505TBT13_CRT_USER_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime( A507TBT13_UPD_DATETIME );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id( A508TBT13_UPD_USER_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt( A510TBT13_UPD_CNT );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value( A502TBT13_CRF_VALUE );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg( A588TBT13_EDIT_FLG );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( A503TBT13_DEL_FLG );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( A506TBT13_CRT_PROG_NM );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( A509TBT13_UPD_PROG_NM );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( A496TBT13_STUDY_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( A497TBT13_SUBJECT_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( A498TBT13_CRF_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( A499TBT13_CRF_VERSION );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( A500TBT13_CRF_ITEM_GRP_DIV );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( A501TBT13_CRF_ITEM_GRP_CD );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z( Z496TBT13_STUDY_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z( Z497TBT13_SUBJECT_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z( Z498TBT13_CRF_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z( Z499TBT13_CRF_VERSION );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z( Z500TBT13_CRF_ITEM_GRP_DIV );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z( Z501TBT13_CRF_ITEM_GRP_CD );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z( Z502TBT13_CRF_VALUE );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z( Z588TBT13_EDIT_FLG );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z( Z503TBT13_DEL_FLG );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z( Z504TBT13_CRT_DATETIME );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z( Z505TBT13_CRT_USER_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z( Z506TBT13_CRT_PROG_NM );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z( Z507TBT13_UPD_DATETIME );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z( Z508TBT13_UPD_USER_ID );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z( Z509TBT13_UPD_PROG_NM );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z( Z510TBT13_UPD_CNT );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N( (byte)((byte)((n502TBT13_CRF_VALUE)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N( (byte)((byte)((n588TBT13_EDIT_FLG)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N( (byte)((byte)((n503TBT13_DEL_FLG)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N( (byte)((byte)((n504TBT13_CRT_DATETIME)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N( (byte)((byte)((n505TBT13_CRT_USER_ID)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N( (byte)((byte)((n506TBT13_CRT_PROG_NM)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N( (byte)((byte)((n507TBT13_UPD_DATETIME)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N( (byte)((byte)((n508TBT13_UPD_USER_ID)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N( (byte)((byte)((n509TBT13_UPD_PROG_NM)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N( (byte)((byte)((n510TBT13_UPD_CNT)?1:0)) );
      obj37.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( Gx_mode );
   }

   public void RowToVars37( SdtTBT13_CRF_RES_HIS obj37 ,
                            int forceLoad )
   {
      Gx_mode = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Mode() ;
      A504TBT13_CRT_DATETIME = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime() ;
      n504TBT13_CRT_DATETIME = false ;
      A505TBT13_CRT_USER_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id() ;
      n505TBT13_CRT_USER_ID = false ;
      A507TBT13_UPD_DATETIME = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime() ;
      n507TBT13_UPD_DATETIME = false ;
      A508TBT13_UPD_USER_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id() ;
      n508TBT13_UPD_USER_ID = false ;
      A510TBT13_UPD_CNT = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt() ;
      n510TBT13_UPD_CNT = false ;
      A502TBT13_CRF_VALUE = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value() ;
      n502TBT13_CRF_VALUE = false ;
      A588TBT13_EDIT_FLG = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg() ;
      n588TBT13_EDIT_FLG = false ;
      A503TBT13_DEL_FLG = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg() ;
      n503TBT13_DEL_FLG = false ;
      A506TBT13_CRT_PROG_NM = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm() ;
      n506TBT13_CRT_PROG_NM = false ;
      A509TBT13_UPD_PROG_NM = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm() ;
      n509TBT13_UPD_PROG_NM = false ;
      A496TBT13_STUDY_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id() ;
      A497TBT13_SUBJECT_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id() ;
      A498TBT13_CRF_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id() ;
      A499TBT13_CRF_VERSION = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version() ;
      A500TBT13_CRF_ITEM_GRP_DIV = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div() ;
      A501TBT13_CRF_ITEM_GRP_CD = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd() ;
      Z496TBT13_STUDY_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z() ;
      Z497TBT13_SUBJECT_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z() ;
      Z498TBT13_CRF_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z() ;
      Z499TBT13_CRF_VERSION = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z() ;
      Z500TBT13_CRF_ITEM_GRP_DIV = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z() ;
      Z501TBT13_CRF_ITEM_GRP_CD = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z() ;
      Z502TBT13_CRF_VALUE = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z() ;
      Z588TBT13_EDIT_FLG = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z() ;
      Z503TBT13_DEL_FLG = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z() ;
      Z504TBT13_CRT_DATETIME = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z() ;
      Z505TBT13_CRT_USER_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z() ;
      Z506TBT13_CRT_PROG_NM = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z() ;
      Z507TBT13_UPD_DATETIME = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z() ;
      Z508TBT13_UPD_USER_ID = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z() ;
      Z509TBT13_UPD_PROG_NM = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z() ;
      Z510TBT13_UPD_CNT = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z() ;
      O510TBT13_UPD_CNT = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z() ;
      n502TBT13_CRF_VALUE = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N()==0)?false:true) ;
      n588TBT13_EDIT_FLG = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N()==0)?false:true) ;
      n503TBT13_DEL_FLG = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N()==0)?false:true) ;
      n504TBT13_CRT_DATETIME = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N()==0)?false:true) ;
      n505TBT13_CRT_USER_ID = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N()==0)?false:true) ;
      n506TBT13_CRT_PROG_NM = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N()==0)?false:true) ;
      n507TBT13_UPD_DATETIME = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N()==0)?false:true) ;
      n508TBT13_UPD_USER_ID = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N()==0)?false:true) ;
      n509TBT13_UPD_PROG_NM = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N()==0)?false:true) ;
      n510TBT13_UPD_CNT = (boolean)((obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj37.getgxTv_SdtTBT13_CRF_RES_HIS_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A496TBT13_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A497TBT13_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A498TBT13_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A499TBT13_CRF_VERSION = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      A500TBT13_CRF_ITEM_GRP_DIV = (String)getParm(obj,4) ;
      A501TBT13_CRF_ITEM_GRP_CD = (String)getParm(obj,5) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1237( ) ;
      scanKeyStart1237( ) ;
      if ( RcdFound37 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z496TBT13_STUDY_ID = A496TBT13_STUDY_ID ;
         Z497TBT13_SUBJECT_ID = A497TBT13_SUBJECT_ID ;
         Z498TBT13_CRF_ID = A498TBT13_CRF_ID ;
         Z499TBT13_CRF_VERSION = A499TBT13_CRF_VERSION ;
         Z500TBT13_CRF_ITEM_GRP_DIV = A500TBT13_CRF_ITEM_GRP_DIV ;
         Z501TBT13_CRF_ITEM_GRP_CD = A501TBT13_CRF_ITEM_GRP_CD ;
         O510TBT13_UPD_CNT = A510TBT13_UPD_CNT ;
         n510TBT13_UPD_CNT = false ;
      }
      zm1237( -8) ;
      sMode37 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1237( ) ;
      Gx_mode = sMode37 ;
      addRow1237( ) ;
      scanKeyEnd1237( ) ;
      if ( RcdFound37 == 0 )
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
      RowToVars37( bcTBT13_CRF_RES_HIS, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1237( ) ;
      if ( RcdFound37 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A496TBT13_STUDY_ID != Z496TBT13_STUDY_ID ) || ( A497TBT13_SUBJECT_ID != Z497TBT13_SUBJECT_ID ) || ( A498TBT13_CRF_ID != Z498TBT13_CRF_ID ) || ( A499TBT13_CRF_VERSION != Z499TBT13_CRF_VERSION ) || ( GXutil.strcmp(A500TBT13_CRF_ITEM_GRP_DIV, Z500TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A501TBT13_CRF_ITEM_GRP_CD, Z501TBT13_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A496TBT13_STUDY_ID = Z496TBT13_STUDY_ID ;
            A497TBT13_SUBJECT_ID = Z497TBT13_SUBJECT_ID ;
            A498TBT13_CRF_ID = Z498TBT13_CRF_ID ;
            A499TBT13_CRF_VERSION = Z499TBT13_CRF_VERSION ;
            A500TBT13_CRF_ITEM_GRP_DIV = Z500TBT13_CRF_ITEM_GRP_DIV ;
            A501TBT13_CRF_ITEM_GRP_CD = Z501TBT13_CRF_ITEM_GRP_CD ;
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
            update1237( ) ;
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
            if ( ( A496TBT13_STUDY_ID != Z496TBT13_STUDY_ID ) || ( A497TBT13_SUBJECT_ID != Z497TBT13_SUBJECT_ID ) || ( A498TBT13_CRF_ID != Z498TBT13_CRF_ID ) || ( A499TBT13_CRF_VERSION != Z499TBT13_CRF_VERSION ) || ( GXutil.strcmp(A500TBT13_CRF_ITEM_GRP_DIV, Z500TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A501TBT13_CRF_ITEM_GRP_CD, Z501TBT13_CRF_ITEM_GRP_CD) != 0 ) )
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
                  insert1237( ) ;
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
                  insert1237( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow37( bcTBT13_CRF_RES_HIS) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars37( bcTBT13_CRF_RES_HIS, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1237( ) ;
      if ( RcdFound37 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A496TBT13_STUDY_ID != Z496TBT13_STUDY_ID ) || ( A497TBT13_SUBJECT_ID != Z497TBT13_SUBJECT_ID ) || ( A498TBT13_CRF_ID != Z498TBT13_CRF_ID ) || ( A499TBT13_CRF_VERSION != Z499TBT13_CRF_VERSION ) || ( GXutil.strcmp(A500TBT13_CRF_ITEM_GRP_DIV, Z500TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A501TBT13_CRF_ITEM_GRP_CD, Z501TBT13_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A496TBT13_STUDY_ID = Z496TBT13_STUDY_ID ;
            A497TBT13_SUBJECT_ID = Z497TBT13_SUBJECT_ID ;
            A498TBT13_CRF_ID = Z498TBT13_CRF_ID ;
            A499TBT13_CRF_VERSION = Z499TBT13_CRF_VERSION ;
            A500TBT13_CRF_ITEM_GRP_DIV = Z500TBT13_CRF_ITEM_GRP_DIV ;
            A501TBT13_CRF_ITEM_GRP_CD = Z501TBT13_CRF_ITEM_GRP_CD ;
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
         if ( ( A496TBT13_STUDY_ID != Z496TBT13_STUDY_ID ) || ( A497TBT13_SUBJECT_ID != Z497TBT13_SUBJECT_ID ) || ( A498TBT13_CRF_ID != Z498TBT13_CRF_ID ) || ( A499TBT13_CRF_VERSION != Z499TBT13_CRF_VERSION ) || ( GXutil.strcmp(A500TBT13_CRF_ITEM_GRP_DIV, Z500TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A501TBT13_CRF_ITEM_GRP_CD, Z501TBT13_CRF_ITEM_GRP_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt13_crf_res_his_bc");
      VarsToRow37( bcTBT13_CRF_RES_HIS) ;
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
      Gx_mode = bcTBT13_CRF_RES_HIS.getgxTv_SdtTBT13_CRF_RES_HIS_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT13_CRF_RES_HIS sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT13_CRF_RES_HIS )
      {
         bcTBT13_CRF_RES_HIS = sdt ;
         if ( GXutil.strcmp(bcTBT13_CRF_RES_HIS.getgxTv_SdtTBT13_CRF_RES_HIS_Mode(), "") == 0 )
         {
            bcTBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow37( bcTBT13_CRF_RES_HIS) ;
         }
         else
         {
            RowToVars37( bcTBT13_CRF_RES_HIS, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT13_CRF_RES_HIS.getgxTv_SdtTBT13_CRF_RES_HIS_Mode(), "") == 0 )
         {
            bcTBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars37( bcTBT13_CRF_RES_HIS, 1) ;
   }

   public SdtTBT13_CRF_RES_HIS getTBT13_CRF_RES_HIS_BC( )
   {
      return bcTBT13_CRF_RES_HIS ;
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
                  /* Execute user subroutine: S1169 */
                  S1169 ();
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
      Z500TBT13_CRF_ITEM_GRP_DIV = "" ;
      A500TBT13_CRF_ITEM_GRP_DIV = "" ;
      Z501TBT13_CRF_ITEM_GRP_CD = "" ;
      A501TBT13_CRF_ITEM_GRP_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z = "" ;
      Z504TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A504TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z505TBT13_CRT_USER_ID = "" ;
      A505TBT13_CRT_USER_ID = "" ;
      Z507TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A507TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z508TBT13_UPD_USER_ID = "" ;
      A508TBT13_UPD_USER_ID = "" ;
      Z502TBT13_CRF_VALUE = "" ;
      A502TBT13_CRF_VALUE = "" ;
      Z588TBT13_EDIT_FLG = "" ;
      A588TBT13_EDIT_FLG = "" ;
      Z503TBT13_DEL_FLG = "" ;
      A503TBT13_DEL_FLG = "" ;
      Z506TBT13_CRT_PROG_NM = "" ;
      A506TBT13_CRT_PROG_NM = "" ;
      Z509TBT13_UPD_PROG_NM = "" ;
      A509TBT13_UPD_PROG_NM = "" ;
      BC00124_A496TBT13_STUDY_ID = new long[1] ;
      BC00124_A497TBT13_SUBJECT_ID = new int[1] ;
      BC00124_A498TBT13_CRF_ID = new short[1] ;
      BC00124_A499TBT13_CRF_VERSION = new short[1] ;
      BC00124_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00124_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00124_A504TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00124_n504TBT13_CRT_DATETIME = new boolean[] {false} ;
      BC00124_A505TBT13_CRT_USER_ID = new String[] {""} ;
      BC00124_n505TBT13_CRT_USER_ID = new boolean[] {false} ;
      BC00124_A507TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00124_n507TBT13_UPD_DATETIME = new boolean[] {false} ;
      BC00124_A508TBT13_UPD_USER_ID = new String[] {""} ;
      BC00124_n508TBT13_UPD_USER_ID = new boolean[] {false} ;
      BC00124_A510TBT13_UPD_CNT = new long[1] ;
      BC00124_n510TBT13_UPD_CNT = new boolean[] {false} ;
      BC00124_A502TBT13_CRF_VALUE = new String[] {""} ;
      BC00124_n502TBT13_CRF_VALUE = new boolean[] {false} ;
      BC00124_A588TBT13_EDIT_FLG = new String[] {""} ;
      BC00124_n588TBT13_EDIT_FLG = new boolean[] {false} ;
      BC00124_A503TBT13_DEL_FLG = new String[] {""} ;
      BC00124_n503TBT13_DEL_FLG = new boolean[] {false} ;
      BC00124_A506TBT13_CRT_PROG_NM = new String[] {""} ;
      BC00124_n506TBT13_CRT_PROG_NM = new boolean[] {false} ;
      BC00124_A509TBT13_UPD_PROG_NM = new String[] {""} ;
      BC00124_n509TBT13_UPD_PROG_NM = new boolean[] {false} ;
      BC00125_A496TBT13_STUDY_ID = new long[1] ;
      BC00125_A497TBT13_SUBJECT_ID = new int[1] ;
      BC00125_A498TBT13_CRF_ID = new short[1] ;
      BC00125_A499TBT13_CRF_VERSION = new short[1] ;
      BC00125_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00125_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00123_A496TBT13_STUDY_ID = new long[1] ;
      BC00123_A497TBT13_SUBJECT_ID = new int[1] ;
      BC00123_A498TBT13_CRF_ID = new short[1] ;
      BC00123_A499TBT13_CRF_VERSION = new short[1] ;
      BC00123_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00123_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00123_A504TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00123_n504TBT13_CRT_DATETIME = new boolean[] {false} ;
      BC00123_A505TBT13_CRT_USER_ID = new String[] {""} ;
      BC00123_n505TBT13_CRT_USER_ID = new boolean[] {false} ;
      BC00123_A507TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00123_n507TBT13_UPD_DATETIME = new boolean[] {false} ;
      BC00123_A508TBT13_UPD_USER_ID = new String[] {""} ;
      BC00123_n508TBT13_UPD_USER_ID = new boolean[] {false} ;
      BC00123_A510TBT13_UPD_CNT = new long[1] ;
      BC00123_n510TBT13_UPD_CNT = new boolean[] {false} ;
      BC00123_A502TBT13_CRF_VALUE = new String[] {""} ;
      BC00123_n502TBT13_CRF_VALUE = new boolean[] {false} ;
      BC00123_A588TBT13_EDIT_FLG = new String[] {""} ;
      BC00123_n588TBT13_EDIT_FLG = new boolean[] {false} ;
      BC00123_A503TBT13_DEL_FLG = new String[] {""} ;
      BC00123_n503TBT13_DEL_FLG = new boolean[] {false} ;
      BC00123_A506TBT13_CRT_PROG_NM = new String[] {""} ;
      BC00123_n506TBT13_CRT_PROG_NM = new boolean[] {false} ;
      BC00123_A509TBT13_UPD_PROG_NM = new String[] {""} ;
      BC00123_n509TBT13_UPD_PROG_NM = new boolean[] {false} ;
      sMode37 = "" ;
      BC00122_A496TBT13_STUDY_ID = new long[1] ;
      BC00122_A497TBT13_SUBJECT_ID = new int[1] ;
      BC00122_A498TBT13_CRF_ID = new short[1] ;
      BC00122_A499TBT13_CRF_VERSION = new short[1] ;
      BC00122_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00122_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00122_A504TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00122_n504TBT13_CRT_DATETIME = new boolean[] {false} ;
      BC00122_A505TBT13_CRT_USER_ID = new String[] {""} ;
      BC00122_n505TBT13_CRT_USER_ID = new boolean[] {false} ;
      BC00122_A507TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00122_n507TBT13_UPD_DATETIME = new boolean[] {false} ;
      BC00122_A508TBT13_UPD_USER_ID = new String[] {""} ;
      BC00122_n508TBT13_UPD_USER_ID = new boolean[] {false} ;
      BC00122_A510TBT13_UPD_CNT = new long[1] ;
      BC00122_n510TBT13_UPD_CNT = new boolean[] {false} ;
      BC00122_A502TBT13_CRF_VALUE = new String[] {""} ;
      BC00122_n502TBT13_CRF_VALUE = new boolean[] {false} ;
      BC00122_A588TBT13_EDIT_FLG = new String[] {""} ;
      BC00122_n588TBT13_EDIT_FLG = new boolean[] {false} ;
      BC00122_A503TBT13_DEL_FLG = new String[] {""} ;
      BC00122_n503TBT13_DEL_FLG = new boolean[] {false} ;
      BC00122_A506TBT13_CRT_PROG_NM = new String[] {""} ;
      BC00122_n506TBT13_CRT_PROG_NM = new boolean[] {false} ;
      BC00122_A509TBT13_UPD_PROG_NM = new String[] {""} ;
      BC00122_n509TBT13_UPD_PROG_NM = new boolean[] {false} ;
      BC00129_A496TBT13_STUDY_ID = new long[1] ;
      BC00129_A497TBT13_SUBJECT_ID = new int[1] ;
      BC00129_A498TBT13_CRF_ID = new short[1] ;
      BC00129_A499TBT13_CRF_VERSION = new short[1] ;
      BC00129_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00129_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00129_A504TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00129_n504TBT13_CRT_DATETIME = new boolean[] {false} ;
      BC00129_A505TBT13_CRT_USER_ID = new String[] {""} ;
      BC00129_n505TBT13_CRT_USER_ID = new boolean[] {false} ;
      BC00129_A507TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00129_n507TBT13_UPD_DATETIME = new boolean[] {false} ;
      BC00129_A508TBT13_UPD_USER_ID = new String[] {""} ;
      BC00129_n508TBT13_UPD_USER_ID = new boolean[] {false} ;
      BC00129_A510TBT13_UPD_CNT = new long[1] ;
      BC00129_n510TBT13_UPD_CNT = new boolean[] {false} ;
      BC00129_A502TBT13_CRF_VALUE = new String[] {""} ;
      BC00129_n502TBT13_CRF_VALUE = new boolean[] {false} ;
      BC00129_A588TBT13_EDIT_FLG = new String[] {""} ;
      BC00129_n588TBT13_EDIT_FLG = new boolean[] {false} ;
      BC00129_A503TBT13_DEL_FLG = new String[] {""} ;
      BC00129_n503TBT13_DEL_FLG = new boolean[] {false} ;
      BC00129_A506TBT13_CRT_PROG_NM = new String[] {""} ;
      BC00129_n506TBT13_CRT_PROG_NM = new boolean[] {false} ;
      BC00129_A509TBT13_UPD_PROG_NM = new String[] {""} ;
      BC00129_n509TBT13_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt13_crf_res_his_bc__default(),
         new Object[] {
             new Object[] {
            BC00122_A496TBT13_STUDY_ID, BC00122_A497TBT13_SUBJECT_ID, BC00122_A498TBT13_CRF_ID, BC00122_A499TBT13_CRF_VERSION, BC00122_A500TBT13_CRF_ITEM_GRP_DIV, BC00122_A501TBT13_CRF_ITEM_GRP_CD, BC00122_A504TBT13_CRT_DATETIME, BC00122_n504TBT13_CRT_DATETIME, BC00122_A505TBT13_CRT_USER_ID, BC00122_n505TBT13_CRT_USER_ID,
            BC00122_A507TBT13_UPD_DATETIME, BC00122_n507TBT13_UPD_DATETIME, BC00122_A508TBT13_UPD_USER_ID, BC00122_n508TBT13_UPD_USER_ID, BC00122_A510TBT13_UPD_CNT, BC00122_n510TBT13_UPD_CNT, BC00122_A502TBT13_CRF_VALUE, BC00122_n502TBT13_CRF_VALUE, BC00122_A588TBT13_EDIT_FLG, BC00122_n588TBT13_EDIT_FLG,
            BC00122_A503TBT13_DEL_FLG, BC00122_n503TBT13_DEL_FLG, BC00122_A506TBT13_CRT_PROG_NM, BC00122_n506TBT13_CRT_PROG_NM, BC00122_A509TBT13_UPD_PROG_NM, BC00122_n509TBT13_UPD_PROG_NM
            }
            , new Object[] {
            BC00123_A496TBT13_STUDY_ID, BC00123_A497TBT13_SUBJECT_ID, BC00123_A498TBT13_CRF_ID, BC00123_A499TBT13_CRF_VERSION, BC00123_A500TBT13_CRF_ITEM_GRP_DIV, BC00123_A501TBT13_CRF_ITEM_GRP_CD, BC00123_A504TBT13_CRT_DATETIME, BC00123_n504TBT13_CRT_DATETIME, BC00123_A505TBT13_CRT_USER_ID, BC00123_n505TBT13_CRT_USER_ID,
            BC00123_A507TBT13_UPD_DATETIME, BC00123_n507TBT13_UPD_DATETIME, BC00123_A508TBT13_UPD_USER_ID, BC00123_n508TBT13_UPD_USER_ID, BC00123_A510TBT13_UPD_CNT, BC00123_n510TBT13_UPD_CNT, BC00123_A502TBT13_CRF_VALUE, BC00123_n502TBT13_CRF_VALUE, BC00123_A588TBT13_EDIT_FLG, BC00123_n588TBT13_EDIT_FLG,
            BC00123_A503TBT13_DEL_FLG, BC00123_n503TBT13_DEL_FLG, BC00123_A506TBT13_CRT_PROG_NM, BC00123_n506TBT13_CRT_PROG_NM, BC00123_A509TBT13_UPD_PROG_NM, BC00123_n509TBT13_UPD_PROG_NM
            }
            , new Object[] {
            BC00124_A496TBT13_STUDY_ID, BC00124_A497TBT13_SUBJECT_ID, BC00124_A498TBT13_CRF_ID, BC00124_A499TBT13_CRF_VERSION, BC00124_A500TBT13_CRF_ITEM_GRP_DIV, BC00124_A501TBT13_CRF_ITEM_GRP_CD, BC00124_A504TBT13_CRT_DATETIME, BC00124_n504TBT13_CRT_DATETIME, BC00124_A505TBT13_CRT_USER_ID, BC00124_n505TBT13_CRT_USER_ID,
            BC00124_A507TBT13_UPD_DATETIME, BC00124_n507TBT13_UPD_DATETIME, BC00124_A508TBT13_UPD_USER_ID, BC00124_n508TBT13_UPD_USER_ID, BC00124_A510TBT13_UPD_CNT, BC00124_n510TBT13_UPD_CNT, BC00124_A502TBT13_CRF_VALUE, BC00124_n502TBT13_CRF_VALUE, BC00124_A588TBT13_EDIT_FLG, BC00124_n588TBT13_EDIT_FLG,
            BC00124_A503TBT13_DEL_FLG, BC00124_n503TBT13_DEL_FLG, BC00124_A506TBT13_CRT_PROG_NM, BC00124_n506TBT13_CRT_PROG_NM, BC00124_A509TBT13_UPD_PROG_NM, BC00124_n509TBT13_UPD_PROG_NM
            }
            , new Object[] {
            BC00125_A496TBT13_STUDY_ID, BC00125_A497TBT13_SUBJECT_ID, BC00125_A498TBT13_CRF_ID, BC00125_A499TBT13_CRF_VERSION, BC00125_A500TBT13_CRF_ITEM_GRP_DIV, BC00125_A501TBT13_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00129_A496TBT13_STUDY_ID, BC00129_A497TBT13_SUBJECT_ID, BC00129_A498TBT13_CRF_ID, BC00129_A499TBT13_CRF_VERSION, BC00129_A500TBT13_CRF_ITEM_GRP_DIV, BC00129_A501TBT13_CRF_ITEM_GRP_CD, BC00129_A504TBT13_CRT_DATETIME, BC00129_n504TBT13_CRT_DATETIME, BC00129_A505TBT13_CRT_USER_ID, BC00129_n505TBT13_CRT_USER_ID,
            BC00129_A507TBT13_UPD_DATETIME, BC00129_n507TBT13_UPD_DATETIME, BC00129_A508TBT13_UPD_USER_ID, BC00129_n508TBT13_UPD_USER_ID, BC00129_A510TBT13_UPD_CNT, BC00129_n510TBT13_UPD_CNT, BC00129_A502TBT13_CRF_VALUE, BC00129_n502TBT13_CRF_VALUE, BC00129_A588TBT13_EDIT_FLG, BC00129_n588TBT13_EDIT_FLG,
            BC00129_A503TBT13_DEL_FLG, BC00129_n503TBT13_DEL_FLG, BC00129_A506TBT13_CRT_PROG_NM, BC00129_n506TBT13_CRT_PROG_NM, BC00129_A509TBT13_UPD_PROG_NM, BC00129_n509TBT13_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT13_CRF_RES_HIS_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11122 */
      e11122 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z498TBT13_CRF_ID ;
   private short A498TBT13_CRF_ID ;
   private short Z499TBT13_CRF_VERSION ;
   private short A499TBT13_CRF_VERSION ;
   private short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z ;
   private short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z ;
   private short RcdFound37 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z497TBT13_SUBJECT_ID ;
   private int A497TBT13_SUBJECT_ID ;
   private int gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z496TBT13_STUDY_ID ;
   private long A496TBT13_STUDY_ID ;
   private long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z ;
   private long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z ;
   private long Z510TBT13_UPD_CNT ;
   private long A510TBT13_UPD_CNT ;
   private long O510TBT13_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode37 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z ;
   private java.util.Date Z504TBT13_CRT_DATETIME ;
   private java.util.Date A504TBT13_CRT_DATETIME ;
   private java.util.Date Z507TBT13_UPD_DATETIME ;
   private java.util.Date A507TBT13_UPD_DATETIME ;
   private boolean n504TBT13_CRT_DATETIME ;
   private boolean n505TBT13_CRT_USER_ID ;
   private boolean n507TBT13_UPD_DATETIME ;
   private boolean n508TBT13_UPD_USER_ID ;
   private boolean n510TBT13_UPD_CNT ;
   private boolean n502TBT13_CRF_VALUE ;
   private boolean n588TBT13_EDIT_FLG ;
   private boolean n503TBT13_DEL_FLG ;
   private boolean n506TBT13_CRT_PROG_NM ;
   private boolean n509TBT13_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z500TBT13_CRF_ITEM_GRP_DIV ;
   private String A500TBT13_CRF_ITEM_GRP_DIV ;
   private String Z501TBT13_CRF_ITEM_GRP_CD ;
   private String A501TBT13_CRF_ITEM_GRP_CD ;
   private String AV8W_BC_FLG ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z ;
   private String Z505TBT13_CRT_USER_ID ;
   private String A505TBT13_CRT_USER_ID ;
   private String Z508TBT13_UPD_USER_ID ;
   private String A508TBT13_UPD_USER_ID ;
   private String Z502TBT13_CRF_VALUE ;
   private String A502TBT13_CRF_VALUE ;
   private String Z588TBT13_EDIT_FLG ;
   private String A588TBT13_EDIT_FLG ;
   private String Z503TBT13_DEL_FLG ;
   private String A503TBT13_DEL_FLG ;
   private String Z506TBT13_CRT_PROG_NM ;
   private String A506TBT13_CRT_PROG_NM ;
   private String Z509TBT13_UPD_PROG_NM ;
   private String A509TBT13_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT13_CRF_RES_HIS bcTBT13_CRF_RES_HIS ;
   private IDataStoreProvider pr_default ;
   private long[] BC00124_A496TBT13_STUDY_ID ;
   private int[] BC00124_A497TBT13_SUBJECT_ID ;
   private short[] BC00124_A498TBT13_CRF_ID ;
   private short[] BC00124_A499TBT13_CRF_VERSION ;
   private String[] BC00124_A500TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00124_A501TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC00124_A504TBT13_CRT_DATETIME ;
   private boolean[] BC00124_n504TBT13_CRT_DATETIME ;
   private String[] BC00124_A505TBT13_CRT_USER_ID ;
   private boolean[] BC00124_n505TBT13_CRT_USER_ID ;
   private java.util.Date[] BC00124_A507TBT13_UPD_DATETIME ;
   private boolean[] BC00124_n507TBT13_UPD_DATETIME ;
   private String[] BC00124_A508TBT13_UPD_USER_ID ;
   private boolean[] BC00124_n508TBT13_UPD_USER_ID ;
   private long[] BC00124_A510TBT13_UPD_CNT ;
   private boolean[] BC00124_n510TBT13_UPD_CNT ;
   private String[] BC00124_A502TBT13_CRF_VALUE ;
   private boolean[] BC00124_n502TBT13_CRF_VALUE ;
   private String[] BC00124_A588TBT13_EDIT_FLG ;
   private boolean[] BC00124_n588TBT13_EDIT_FLG ;
   private String[] BC00124_A503TBT13_DEL_FLG ;
   private boolean[] BC00124_n503TBT13_DEL_FLG ;
   private String[] BC00124_A506TBT13_CRT_PROG_NM ;
   private boolean[] BC00124_n506TBT13_CRT_PROG_NM ;
   private String[] BC00124_A509TBT13_UPD_PROG_NM ;
   private boolean[] BC00124_n509TBT13_UPD_PROG_NM ;
   private long[] BC00125_A496TBT13_STUDY_ID ;
   private int[] BC00125_A497TBT13_SUBJECT_ID ;
   private short[] BC00125_A498TBT13_CRF_ID ;
   private short[] BC00125_A499TBT13_CRF_VERSION ;
   private String[] BC00125_A500TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00125_A501TBT13_CRF_ITEM_GRP_CD ;
   private long[] BC00123_A496TBT13_STUDY_ID ;
   private int[] BC00123_A497TBT13_SUBJECT_ID ;
   private short[] BC00123_A498TBT13_CRF_ID ;
   private short[] BC00123_A499TBT13_CRF_VERSION ;
   private String[] BC00123_A500TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00123_A501TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC00123_A504TBT13_CRT_DATETIME ;
   private boolean[] BC00123_n504TBT13_CRT_DATETIME ;
   private String[] BC00123_A505TBT13_CRT_USER_ID ;
   private boolean[] BC00123_n505TBT13_CRT_USER_ID ;
   private java.util.Date[] BC00123_A507TBT13_UPD_DATETIME ;
   private boolean[] BC00123_n507TBT13_UPD_DATETIME ;
   private String[] BC00123_A508TBT13_UPD_USER_ID ;
   private boolean[] BC00123_n508TBT13_UPD_USER_ID ;
   private long[] BC00123_A510TBT13_UPD_CNT ;
   private boolean[] BC00123_n510TBT13_UPD_CNT ;
   private String[] BC00123_A502TBT13_CRF_VALUE ;
   private boolean[] BC00123_n502TBT13_CRF_VALUE ;
   private String[] BC00123_A588TBT13_EDIT_FLG ;
   private boolean[] BC00123_n588TBT13_EDIT_FLG ;
   private String[] BC00123_A503TBT13_DEL_FLG ;
   private boolean[] BC00123_n503TBT13_DEL_FLG ;
   private String[] BC00123_A506TBT13_CRT_PROG_NM ;
   private boolean[] BC00123_n506TBT13_CRT_PROG_NM ;
   private String[] BC00123_A509TBT13_UPD_PROG_NM ;
   private boolean[] BC00123_n509TBT13_UPD_PROG_NM ;
   private long[] BC00122_A496TBT13_STUDY_ID ;
   private int[] BC00122_A497TBT13_SUBJECT_ID ;
   private short[] BC00122_A498TBT13_CRF_ID ;
   private short[] BC00122_A499TBT13_CRF_VERSION ;
   private String[] BC00122_A500TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00122_A501TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC00122_A504TBT13_CRT_DATETIME ;
   private boolean[] BC00122_n504TBT13_CRT_DATETIME ;
   private String[] BC00122_A505TBT13_CRT_USER_ID ;
   private boolean[] BC00122_n505TBT13_CRT_USER_ID ;
   private java.util.Date[] BC00122_A507TBT13_UPD_DATETIME ;
   private boolean[] BC00122_n507TBT13_UPD_DATETIME ;
   private String[] BC00122_A508TBT13_UPD_USER_ID ;
   private boolean[] BC00122_n508TBT13_UPD_USER_ID ;
   private long[] BC00122_A510TBT13_UPD_CNT ;
   private boolean[] BC00122_n510TBT13_UPD_CNT ;
   private String[] BC00122_A502TBT13_CRF_VALUE ;
   private boolean[] BC00122_n502TBT13_CRF_VALUE ;
   private String[] BC00122_A588TBT13_EDIT_FLG ;
   private boolean[] BC00122_n588TBT13_EDIT_FLG ;
   private String[] BC00122_A503TBT13_DEL_FLG ;
   private boolean[] BC00122_n503TBT13_DEL_FLG ;
   private String[] BC00122_A506TBT13_CRT_PROG_NM ;
   private boolean[] BC00122_n506TBT13_CRT_PROG_NM ;
   private String[] BC00122_A509TBT13_UPD_PROG_NM ;
   private boolean[] BC00122_n509TBT13_UPD_PROG_NM ;
   private long[] BC00129_A496TBT13_STUDY_ID ;
   private int[] BC00129_A497TBT13_SUBJECT_ID ;
   private short[] BC00129_A498TBT13_CRF_ID ;
   private short[] BC00129_A499TBT13_CRF_VERSION ;
   private String[] BC00129_A500TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00129_A501TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC00129_A504TBT13_CRT_DATETIME ;
   private boolean[] BC00129_n504TBT13_CRT_DATETIME ;
   private String[] BC00129_A505TBT13_CRT_USER_ID ;
   private boolean[] BC00129_n505TBT13_CRT_USER_ID ;
   private java.util.Date[] BC00129_A507TBT13_UPD_DATETIME ;
   private boolean[] BC00129_n507TBT13_UPD_DATETIME ;
   private String[] BC00129_A508TBT13_UPD_USER_ID ;
   private boolean[] BC00129_n508TBT13_UPD_USER_ID ;
   private long[] BC00129_A510TBT13_UPD_CNT ;
   private boolean[] BC00129_n510TBT13_UPD_CNT ;
   private String[] BC00129_A502TBT13_CRF_VALUE ;
   private boolean[] BC00129_n502TBT13_CRF_VALUE ;
   private String[] BC00129_A588TBT13_EDIT_FLG ;
   private boolean[] BC00129_n588TBT13_EDIT_FLG ;
   private String[] BC00129_A503TBT13_DEL_FLG ;
   private boolean[] BC00129_n503TBT13_DEL_FLG ;
   private String[] BC00129_A506TBT13_CRT_PROG_NM ;
   private boolean[] BC00129_n506TBT13_CRT_PROG_NM ;
   private String[] BC00129_A509TBT13_UPD_PROG_NM ;
   private boolean[] BC00129_n509TBT13_UPD_PROG_NM ;
}

final  class tbt13_crf_res_his_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00122", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00123", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00124", "SELECT TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD`, TM1.`TBT13_CRT_DATETIME`, TM1.`TBT13_CRT_USER_ID`, TM1.`TBT13_UPD_DATETIME`, TM1.`TBT13_UPD_USER_ID`, TM1.`TBT13_UPD_CNT`, TM1.`TBT13_CRF_VALUE`, TM1.`TBT13_EDIT_FLG`, TM1.`TBT13_DEL_FLG`, TM1.`TBT13_CRT_PROG_NM`, TM1.`TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` TM1 WHERE TM1.`TBT13_STUDY_ID` = ? and TM1.`TBT13_SUBJECT_ID` = ? and TM1.`TBT13_CRF_ID` = ? and TM1.`TBT13_CRF_VERSION` = ? and TM1.`TBT13_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT13_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00125", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00126", "INSERT INTO `TBT13_CRF_RES_HIS` (`TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00127", "UPDATE `TBT13_CRF_RES_HIS` SET `TBT13_CRT_DATETIME`=?, `TBT13_CRT_USER_ID`=?, `TBT13_UPD_DATETIME`=?, `TBT13_UPD_USER_ID`=?, `TBT13_UPD_CNT`=?, `TBT13_CRF_VALUE`=?, `TBT13_EDIT_FLG`=?, `TBT13_DEL_FLG`=?, `TBT13_CRT_PROG_NM`=?, `TBT13_UPD_PROG_NM`=?  WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00128", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00129", "SELECT TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD`, TM1.`TBT13_CRT_DATETIME`, TM1.`TBT13_CRT_USER_ID`, TM1.`TBT13_UPD_DATETIME`, TM1.`TBT13_UPD_USER_ID`, TM1.`TBT13_UPD_CNT`, TM1.`TBT13_CRF_VALUE`, TM1.`TBT13_EDIT_FLG`, TM1.`TBT13_DEL_FLG`, TM1.`TBT13_CRT_PROG_NM`, TM1.`TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` TM1 WHERE TM1.`TBT13_STUDY_ID` = ? and TM1.`TBT13_SUBJECT_ID` = ? and TM1.`TBT13_CRF_ID` = ? and TM1.`TBT13_CRF_VERSION` = ? and TM1.`TBT13_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT13_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setShort(14, ((Number) parms[23]).shortValue());
               stmt.setVarchar(15, (String)parms[24], 1, false);
               stmt.setVarchar(16, (String)parms[25], 50, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               break;
      }
   }

}

