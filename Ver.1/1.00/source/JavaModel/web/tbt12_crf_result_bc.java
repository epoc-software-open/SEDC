/*
               File: tbt12_crf_result_bc
        Description: CRF入力結果テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:35.90
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
            Z315TBT12_STUDY_ID = A315TBT12_STUDY_ID ;
            Z316TBT12_SUBJECT_ID = A316TBT12_SUBJECT_ID ;
            Z317TBT12_CRF_ID = A317TBT12_CRF_ID ;
            Z318TBT12_CRF_ITEM_GRP_DIV = A318TBT12_CRF_ITEM_GRP_DIV ;
            Z319TBT12_CRF_ITEM_GRP_CD = A319TBT12_CRF_ITEM_GRP_CD ;
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
      beforeValidate0R26( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0R26( ) ;
         }
         else
         {
            checkExtendedTable0R26( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0R26( ) ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120R2( )
   {
      /* After Trn Routine */
   }

   public void S1168( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0R26( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z321TBT12_CRT_DATETIME = A321TBT12_CRT_DATETIME ;
         Z322TBT12_CRT_USER_ID = A322TBT12_CRT_USER_ID ;
         Z324TBT12_UPD_DATETIME = A324TBT12_UPD_DATETIME ;
         Z325TBT12_UPD_USER_ID = A325TBT12_UPD_USER_ID ;
         Z327TBT12_UPD_CNT = A327TBT12_UPD_CNT ;
         Z320TBT12_CRF_VALUE = A320TBT12_CRF_VALUE ;
         Z587TBT12_EDIT_FLG = A587TBT12_EDIT_FLG ;
         Z328TBT12_DEL_FLG = A328TBT12_DEL_FLG ;
         Z323TBT12_CRT_PROG_NM = A323TBT12_CRT_PROG_NM ;
         Z326TBT12_UPD_PROG_NM = A326TBT12_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z315TBT12_STUDY_ID = A315TBT12_STUDY_ID ;
         Z316TBT12_SUBJECT_ID = A316TBT12_SUBJECT_ID ;
         Z317TBT12_CRF_ID = A317TBT12_CRF_ID ;
         Z318TBT12_CRF_ITEM_GRP_DIV = A318TBT12_CRF_ITEM_GRP_DIV ;
         Z319TBT12_CRF_ITEM_GRP_CD = A319TBT12_CRF_ITEM_GRP_CD ;
         Z321TBT12_CRT_DATETIME = A321TBT12_CRT_DATETIME ;
         Z322TBT12_CRT_USER_ID = A322TBT12_CRT_USER_ID ;
         Z324TBT12_UPD_DATETIME = A324TBT12_UPD_DATETIME ;
         Z325TBT12_UPD_USER_ID = A325TBT12_UPD_USER_ID ;
         Z327TBT12_UPD_CNT = A327TBT12_UPD_CNT ;
         Z320TBT12_CRF_VALUE = A320TBT12_CRF_VALUE ;
         Z587TBT12_EDIT_FLG = A587TBT12_EDIT_FLG ;
         Z328TBT12_DEL_FLG = A328TBT12_DEL_FLG ;
         Z323TBT12_CRT_PROG_NM = A323TBT12_CRT_PROG_NM ;
         Z326TBT12_UPD_PROG_NM = A326TBT12_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0R26( )
   {
      /* Using cursor BC000R4 */
      pr_default.execute(2, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A321TBT12_CRT_DATETIME = BC000R4_A321TBT12_CRT_DATETIME[0] ;
         n321TBT12_CRT_DATETIME = BC000R4_n321TBT12_CRT_DATETIME[0] ;
         A322TBT12_CRT_USER_ID = BC000R4_A322TBT12_CRT_USER_ID[0] ;
         n322TBT12_CRT_USER_ID = BC000R4_n322TBT12_CRT_USER_ID[0] ;
         A324TBT12_UPD_DATETIME = BC000R4_A324TBT12_UPD_DATETIME[0] ;
         n324TBT12_UPD_DATETIME = BC000R4_n324TBT12_UPD_DATETIME[0] ;
         A325TBT12_UPD_USER_ID = BC000R4_A325TBT12_UPD_USER_ID[0] ;
         n325TBT12_UPD_USER_ID = BC000R4_n325TBT12_UPD_USER_ID[0] ;
         A327TBT12_UPD_CNT = BC000R4_A327TBT12_UPD_CNT[0] ;
         n327TBT12_UPD_CNT = BC000R4_n327TBT12_UPD_CNT[0] ;
         A320TBT12_CRF_VALUE = BC000R4_A320TBT12_CRF_VALUE[0] ;
         n320TBT12_CRF_VALUE = BC000R4_n320TBT12_CRF_VALUE[0] ;
         A587TBT12_EDIT_FLG = BC000R4_A587TBT12_EDIT_FLG[0] ;
         n587TBT12_EDIT_FLG = BC000R4_n587TBT12_EDIT_FLG[0] ;
         A328TBT12_DEL_FLG = BC000R4_A328TBT12_DEL_FLG[0] ;
         n328TBT12_DEL_FLG = BC000R4_n328TBT12_DEL_FLG[0] ;
         A323TBT12_CRT_PROG_NM = BC000R4_A323TBT12_CRT_PROG_NM[0] ;
         n323TBT12_CRT_PROG_NM = BC000R4_n323TBT12_CRT_PROG_NM[0] ;
         A326TBT12_UPD_PROG_NM = BC000R4_A326TBT12_UPD_PROG_NM[0] ;
         n326TBT12_UPD_PROG_NM = BC000R4_n326TBT12_UPD_PROG_NM[0] ;
         zm0R26( -8) ;
      }
      pr_default.close(2);
      onLoadActions0R26( ) ;
   }

   public void onLoadActions0R26( )
   {
      AV9Pgmname = "TBT12_CRF_RESULT_BC" ;
   }

   public void checkExtendedTable0R26( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT12_CRF_RESULT_BC" ;
      if ( ! ( GXutil.nullDate().equals(A321TBT12_CRT_DATETIME) || (( A321TBT12_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A321TBT12_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A324TBT12_UPD_DATETIME) || (( A324TBT12_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A324TBT12_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0R26( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0R26( )
   {
      /* Using cursor BC000R5 */
      pr_default.execute(3, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound26 = (short)(1) ;
      }
      else
      {
         RcdFound26 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000R3 */
      pr_default.execute(1, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0R26( 8) ;
         RcdFound26 = (short)(1) ;
         A315TBT12_STUDY_ID = BC000R3_A315TBT12_STUDY_ID[0] ;
         A316TBT12_SUBJECT_ID = BC000R3_A316TBT12_SUBJECT_ID[0] ;
         A317TBT12_CRF_ID = BC000R3_A317TBT12_CRF_ID[0] ;
         A318TBT12_CRF_ITEM_GRP_DIV = BC000R3_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
         A319TBT12_CRF_ITEM_GRP_CD = BC000R3_A319TBT12_CRF_ITEM_GRP_CD[0] ;
         A321TBT12_CRT_DATETIME = BC000R3_A321TBT12_CRT_DATETIME[0] ;
         n321TBT12_CRT_DATETIME = BC000R3_n321TBT12_CRT_DATETIME[0] ;
         A322TBT12_CRT_USER_ID = BC000R3_A322TBT12_CRT_USER_ID[0] ;
         n322TBT12_CRT_USER_ID = BC000R3_n322TBT12_CRT_USER_ID[0] ;
         A324TBT12_UPD_DATETIME = BC000R3_A324TBT12_UPD_DATETIME[0] ;
         n324TBT12_UPD_DATETIME = BC000R3_n324TBT12_UPD_DATETIME[0] ;
         A325TBT12_UPD_USER_ID = BC000R3_A325TBT12_UPD_USER_ID[0] ;
         n325TBT12_UPD_USER_ID = BC000R3_n325TBT12_UPD_USER_ID[0] ;
         A327TBT12_UPD_CNT = BC000R3_A327TBT12_UPD_CNT[0] ;
         n327TBT12_UPD_CNT = BC000R3_n327TBT12_UPD_CNT[0] ;
         A320TBT12_CRF_VALUE = BC000R3_A320TBT12_CRF_VALUE[0] ;
         n320TBT12_CRF_VALUE = BC000R3_n320TBT12_CRF_VALUE[0] ;
         A587TBT12_EDIT_FLG = BC000R3_A587TBT12_EDIT_FLG[0] ;
         n587TBT12_EDIT_FLG = BC000R3_n587TBT12_EDIT_FLG[0] ;
         A328TBT12_DEL_FLG = BC000R3_A328TBT12_DEL_FLG[0] ;
         n328TBT12_DEL_FLG = BC000R3_n328TBT12_DEL_FLG[0] ;
         A323TBT12_CRT_PROG_NM = BC000R3_A323TBT12_CRT_PROG_NM[0] ;
         n323TBT12_CRT_PROG_NM = BC000R3_n323TBT12_CRT_PROG_NM[0] ;
         A326TBT12_UPD_PROG_NM = BC000R3_A326TBT12_UPD_PROG_NM[0] ;
         n326TBT12_UPD_PROG_NM = BC000R3_n326TBT12_UPD_PROG_NM[0] ;
         O327TBT12_UPD_CNT = A327TBT12_UPD_CNT ;
         n327TBT12_UPD_CNT = false ;
         Z315TBT12_STUDY_ID = A315TBT12_STUDY_ID ;
         Z316TBT12_SUBJECT_ID = A316TBT12_SUBJECT_ID ;
         Z317TBT12_CRF_ID = A317TBT12_CRF_ID ;
         Z318TBT12_CRF_ITEM_GRP_DIV = A318TBT12_CRF_ITEM_GRP_DIV ;
         Z319TBT12_CRF_ITEM_GRP_CD = A319TBT12_CRF_ITEM_GRP_CD ;
         sMode26 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0R26( ) ;
         Gx_mode = sMode26 ;
      }
      else
      {
         RcdFound26 = (short)(0) ;
         initializeNonKey0R26( ) ;
         sMode26 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode26 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0R26( ) ;
      if ( RcdFound26 == 0 )
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

   public void checkOptimisticConcurrency0R26( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000R2 */
         pr_default.execute(0, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT12_CRF_RESULT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z321TBT12_CRT_DATETIME.equals( BC000R2_A321TBT12_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z322TBT12_CRT_USER_ID, BC000R2_A322TBT12_CRT_USER_ID[0]) != 0 ) || !( Z324TBT12_UPD_DATETIME.equals( BC000R2_A324TBT12_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z325TBT12_UPD_USER_ID, BC000R2_A325TBT12_UPD_USER_ID[0]) != 0 ) || ( Z327TBT12_UPD_CNT != BC000R2_A327TBT12_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z320TBT12_CRF_VALUE, BC000R2_A320TBT12_CRF_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z587TBT12_EDIT_FLG, BC000R2_A587TBT12_EDIT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z328TBT12_DEL_FLG, BC000R2_A328TBT12_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z323TBT12_CRT_PROG_NM, BC000R2_A323TBT12_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z326TBT12_UPD_PROG_NM, BC000R2_A326TBT12_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT12_CRF_RESULT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0R26( )
   {
      beforeValidate0R26( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0R26( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0R26( 0) ;
         checkOptimisticConcurrency0R26( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0R26( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0R26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000R6 */
                  pr_default.execute(4, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD, new Boolean(n321TBT12_CRT_DATETIME), A321TBT12_CRT_DATETIME, new Boolean(n322TBT12_CRT_USER_ID), A322TBT12_CRT_USER_ID, new Boolean(n324TBT12_UPD_DATETIME), A324TBT12_UPD_DATETIME, new Boolean(n325TBT12_UPD_USER_ID), A325TBT12_UPD_USER_ID, new Boolean(n327TBT12_UPD_CNT), new Long(A327TBT12_UPD_CNT), new Boolean(n320TBT12_CRF_VALUE), A320TBT12_CRF_VALUE, new Boolean(n587TBT12_EDIT_FLG), A587TBT12_EDIT_FLG, new Boolean(n328TBT12_DEL_FLG), A328TBT12_DEL_FLG, new Boolean(n323TBT12_CRT_PROG_NM), A323TBT12_CRT_PROG_NM, new Boolean(n326TBT12_UPD_PROG_NM), A326TBT12_UPD_PROG_NM});
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
            load0R26( ) ;
         }
         endLevel0R26( ) ;
      }
      closeExtendedTableCursors0R26( ) ;
   }

   public void update0R26( )
   {
      beforeValidate0R26( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0R26( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0R26( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0R26( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0R26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000R7 */
                  pr_default.execute(5, new Object[] {new Boolean(n321TBT12_CRT_DATETIME), A321TBT12_CRT_DATETIME, new Boolean(n322TBT12_CRT_USER_ID), A322TBT12_CRT_USER_ID, new Boolean(n324TBT12_UPD_DATETIME), A324TBT12_UPD_DATETIME, new Boolean(n325TBT12_UPD_USER_ID), A325TBT12_UPD_USER_ID, new Boolean(n327TBT12_UPD_CNT), new Long(A327TBT12_UPD_CNT), new Boolean(n320TBT12_CRF_VALUE), A320TBT12_CRF_VALUE, new Boolean(n587TBT12_EDIT_FLG), A587TBT12_EDIT_FLG, new Boolean(n328TBT12_DEL_FLG), A328TBT12_DEL_FLG, new Boolean(n323TBT12_CRT_PROG_NM), A323TBT12_CRT_PROG_NM, new Boolean(n326TBT12_UPD_PROG_NM), A326TBT12_UPD_PROG_NM, new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT12_CRF_RESULT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0R26( ) ;
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
         endLevel0R26( ) ;
      }
      closeExtendedTableCursors0R26( ) ;
   }

   public void deferredUpdate0R26( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0R26( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0R26( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0R26( ) ;
         afterConfirm0R26( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0R26( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000R8 */
               pr_default.execute(6, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
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
      sMode26 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0R26( ) ;
      Gx_mode = sMode26 ;
   }

   public void onDeleteControls0R26( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT12_CRF_RESULT_BC" ;
      }
   }

   public void endLevel0R26( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0R26( ) ;
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

   public void scanKeyStart0R26( )
   {
      /* Using cursor BC000R9 */
      pr_default.execute(7, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
      RcdFound26 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A315TBT12_STUDY_ID = BC000R9_A315TBT12_STUDY_ID[0] ;
         A316TBT12_SUBJECT_ID = BC000R9_A316TBT12_SUBJECT_ID[0] ;
         A317TBT12_CRF_ID = BC000R9_A317TBT12_CRF_ID[0] ;
         A318TBT12_CRF_ITEM_GRP_DIV = BC000R9_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
         A319TBT12_CRF_ITEM_GRP_CD = BC000R9_A319TBT12_CRF_ITEM_GRP_CD[0] ;
         A321TBT12_CRT_DATETIME = BC000R9_A321TBT12_CRT_DATETIME[0] ;
         n321TBT12_CRT_DATETIME = BC000R9_n321TBT12_CRT_DATETIME[0] ;
         A322TBT12_CRT_USER_ID = BC000R9_A322TBT12_CRT_USER_ID[0] ;
         n322TBT12_CRT_USER_ID = BC000R9_n322TBT12_CRT_USER_ID[0] ;
         A324TBT12_UPD_DATETIME = BC000R9_A324TBT12_UPD_DATETIME[0] ;
         n324TBT12_UPD_DATETIME = BC000R9_n324TBT12_UPD_DATETIME[0] ;
         A325TBT12_UPD_USER_ID = BC000R9_A325TBT12_UPD_USER_ID[0] ;
         n325TBT12_UPD_USER_ID = BC000R9_n325TBT12_UPD_USER_ID[0] ;
         A327TBT12_UPD_CNT = BC000R9_A327TBT12_UPD_CNT[0] ;
         n327TBT12_UPD_CNT = BC000R9_n327TBT12_UPD_CNT[0] ;
         A320TBT12_CRF_VALUE = BC000R9_A320TBT12_CRF_VALUE[0] ;
         n320TBT12_CRF_VALUE = BC000R9_n320TBT12_CRF_VALUE[0] ;
         A587TBT12_EDIT_FLG = BC000R9_A587TBT12_EDIT_FLG[0] ;
         n587TBT12_EDIT_FLG = BC000R9_n587TBT12_EDIT_FLG[0] ;
         A328TBT12_DEL_FLG = BC000R9_A328TBT12_DEL_FLG[0] ;
         n328TBT12_DEL_FLG = BC000R9_n328TBT12_DEL_FLG[0] ;
         A323TBT12_CRT_PROG_NM = BC000R9_A323TBT12_CRT_PROG_NM[0] ;
         n323TBT12_CRT_PROG_NM = BC000R9_n323TBT12_CRT_PROG_NM[0] ;
         A326TBT12_UPD_PROG_NM = BC000R9_A326TBT12_UPD_PROG_NM[0] ;
         n326TBT12_UPD_PROG_NM = BC000R9_n326TBT12_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0R26( )
   {
      pr_default.readNext(7);
      RcdFound26 = (short)(0) ;
      scanKeyLoad0R26( ) ;
   }

   public void scanKeyLoad0R26( )
   {
      sMode26 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A315TBT12_STUDY_ID = BC000R9_A315TBT12_STUDY_ID[0] ;
         A316TBT12_SUBJECT_ID = BC000R9_A316TBT12_SUBJECT_ID[0] ;
         A317TBT12_CRF_ID = BC000R9_A317TBT12_CRF_ID[0] ;
         A318TBT12_CRF_ITEM_GRP_DIV = BC000R9_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
         A319TBT12_CRF_ITEM_GRP_CD = BC000R9_A319TBT12_CRF_ITEM_GRP_CD[0] ;
         A321TBT12_CRT_DATETIME = BC000R9_A321TBT12_CRT_DATETIME[0] ;
         n321TBT12_CRT_DATETIME = BC000R9_n321TBT12_CRT_DATETIME[0] ;
         A322TBT12_CRT_USER_ID = BC000R9_A322TBT12_CRT_USER_ID[0] ;
         n322TBT12_CRT_USER_ID = BC000R9_n322TBT12_CRT_USER_ID[0] ;
         A324TBT12_UPD_DATETIME = BC000R9_A324TBT12_UPD_DATETIME[0] ;
         n324TBT12_UPD_DATETIME = BC000R9_n324TBT12_UPD_DATETIME[0] ;
         A325TBT12_UPD_USER_ID = BC000R9_A325TBT12_UPD_USER_ID[0] ;
         n325TBT12_UPD_USER_ID = BC000R9_n325TBT12_UPD_USER_ID[0] ;
         A327TBT12_UPD_CNT = BC000R9_A327TBT12_UPD_CNT[0] ;
         n327TBT12_UPD_CNT = BC000R9_n327TBT12_UPD_CNT[0] ;
         A320TBT12_CRF_VALUE = BC000R9_A320TBT12_CRF_VALUE[0] ;
         n320TBT12_CRF_VALUE = BC000R9_n320TBT12_CRF_VALUE[0] ;
         A587TBT12_EDIT_FLG = BC000R9_A587TBT12_EDIT_FLG[0] ;
         n587TBT12_EDIT_FLG = BC000R9_n587TBT12_EDIT_FLG[0] ;
         A328TBT12_DEL_FLG = BC000R9_A328TBT12_DEL_FLG[0] ;
         n328TBT12_DEL_FLG = BC000R9_n328TBT12_DEL_FLG[0] ;
         A323TBT12_CRT_PROG_NM = BC000R9_A323TBT12_CRT_PROG_NM[0] ;
         n323TBT12_CRT_PROG_NM = BC000R9_n323TBT12_CRT_PROG_NM[0] ;
         A326TBT12_UPD_PROG_NM = BC000R9_A326TBT12_UPD_PROG_NM[0] ;
         n326TBT12_UPD_PROG_NM = BC000R9_n326TBT12_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode26 ;
   }

   public void scanKeyEnd0R26( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0R26( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0R26( )
   {
      /* Before Insert Rules */
      A321TBT12_CRT_DATETIME = GXutil.now( ) ;
      n321TBT12_CRT_DATETIME = false ;
      GXt_char1 = A322TBT12_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_bc.this.GXt_char1 = GXv_char2[0] ;
      A322TBT12_CRT_USER_ID = GXt_char1 ;
      n322TBT12_CRT_USER_ID = false ;
      A324TBT12_UPD_DATETIME = GXutil.now( ) ;
      n324TBT12_UPD_DATETIME = false ;
      GXt_char1 = A325TBT12_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_bc.this.GXt_char1 = GXv_char2[0] ;
      A325TBT12_UPD_USER_ID = GXt_char1 ;
      n325TBT12_UPD_USER_ID = false ;
      A327TBT12_UPD_CNT = (long)(O327TBT12_UPD_CNT+1) ;
      n327TBT12_UPD_CNT = false ;
   }

   public void beforeUpdate0R26( )
   {
      /* Before Update Rules */
      A324TBT12_UPD_DATETIME = GXutil.now( ) ;
      n324TBT12_UPD_DATETIME = false ;
      GXt_char1 = A325TBT12_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_bc.this.GXt_char1 = GXv_char2[0] ;
      A325TBT12_UPD_USER_ID = GXt_char1 ;
      n325TBT12_UPD_USER_ID = false ;
      A327TBT12_UPD_CNT = (long)(O327TBT12_UPD_CNT+1) ;
      n327TBT12_UPD_CNT = false ;
   }

   public void beforeDelete0R26( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0R26( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0R26( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0R26( )
   {
   }

   public void addRow0R26( )
   {
      VarsToRow26( bcTBT12_CRF_RESULT) ;
   }

   public void readRow0R26( )
   {
      RowToVars26( bcTBT12_CRF_RESULT, 1) ;
   }

   public void initializeNonKey0R26( )
   {
      A321TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n321TBT12_CRT_DATETIME = false ;
      A322TBT12_CRT_USER_ID = "" ;
      n322TBT12_CRT_USER_ID = false ;
      A324TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n324TBT12_UPD_DATETIME = false ;
      A325TBT12_UPD_USER_ID = "" ;
      n325TBT12_UPD_USER_ID = false ;
      A327TBT12_UPD_CNT = 0 ;
      n327TBT12_UPD_CNT = false ;
      A320TBT12_CRF_VALUE = "" ;
      n320TBT12_CRF_VALUE = false ;
      A587TBT12_EDIT_FLG = "" ;
      n587TBT12_EDIT_FLG = false ;
      A328TBT12_DEL_FLG = "" ;
      n328TBT12_DEL_FLG = false ;
      A323TBT12_CRT_PROG_NM = "" ;
      n323TBT12_CRT_PROG_NM = false ;
      A326TBT12_UPD_PROG_NM = "" ;
      n326TBT12_UPD_PROG_NM = false ;
      O327TBT12_UPD_CNT = A327TBT12_UPD_CNT ;
      n327TBT12_UPD_CNT = false ;
   }

   public void initAll0R26( )
   {
      A315TBT12_STUDY_ID = 0 ;
      A316TBT12_SUBJECT_ID = 0 ;
      A317TBT12_CRF_ID = (short)(0) ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      initializeNonKey0R26( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow26( SdtTBT12_CRF_RESULT obj26 )
   {
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Mode( Gx_mode );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime( A321TBT12_CRT_DATETIME );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id( A322TBT12_CRT_USER_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime( A324TBT12_UPD_DATETIME );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id( A325TBT12_UPD_USER_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt( A327TBT12_UPD_CNT );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value( A320TBT12_CRF_VALUE );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg( A587TBT12_EDIT_FLG );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg( A328TBT12_DEL_FLG );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm( A323TBT12_CRT_PROG_NM );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm( A326TBT12_UPD_PROG_NM );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id( A315TBT12_STUDY_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id( A316TBT12_SUBJECT_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id( A317TBT12_CRF_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div( A318TBT12_CRF_ITEM_GRP_DIV );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd( A319TBT12_CRF_ITEM_GRP_CD );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z( Z315TBT12_STUDY_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z( Z316TBT12_SUBJECT_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z( Z317TBT12_CRF_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z( Z318TBT12_CRF_ITEM_GRP_DIV );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z( Z319TBT12_CRF_ITEM_GRP_CD );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z( Z320TBT12_CRF_VALUE );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z( Z587TBT12_EDIT_FLG );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z( Z328TBT12_DEL_FLG );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z( Z321TBT12_CRT_DATETIME );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z( Z322TBT12_CRT_USER_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z( Z323TBT12_CRT_PROG_NM );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z( Z324TBT12_UPD_DATETIME );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z( Z325TBT12_UPD_USER_ID );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z( Z326TBT12_UPD_PROG_NM );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z( Z327TBT12_UPD_CNT );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N( (byte)((byte)((n320TBT12_CRF_VALUE)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N( (byte)((byte)((n587TBT12_EDIT_FLG)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N( (byte)((byte)((n328TBT12_DEL_FLG)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N( (byte)((byte)((n321TBT12_CRT_DATETIME)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N( (byte)((byte)((n322TBT12_CRT_USER_ID)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N( (byte)((byte)((n323TBT12_CRT_PROG_NM)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N( (byte)((byte)((n324TBT12_UPD_DATETIME)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N( (byte)((byte)((n325TBT12_UPD_USER_ID)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N( (byte)((byte)((n326TBT12_UPD_PROG_NM)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N( (byte)((byte)((n327TBT12_UPD_CNT)?1:0)) );
      obj26.setgxTv_SdtTBT12_CRF_RESULT_Mode( Gx_mode );
   }

   public void RowToVars26( SdtTBT12_CRF_RESULT obj26 ,
                            int forceLoad )
   {
      Gx_mode = obj26.getgxTv_SdtTBT12_CRF_RESULT_Mode() ;
      A321TBT12_CRT_DATETIME = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime() ;
      n321TBT12_CRT_DATETIME = false ;
      A322TBT12_CRT_USER_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id() ;
      n322TBT12_CRT_USER_ID = false ;
      A324TBT12_UPD_DATETIME = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime() ;
      n324TBT12_UPD_DATETIME = false ;
      A325TBT12_UPD_USER_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id() ;
      n325TBT12_UPD_USER_ID = false ;
      A327TBT12_UPD_CNT = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt() ;
      n327TBT12_UPD_CNT = false ;
      A320TBT12_CRF_VALUE = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value() ;
      n320TBT12_CRF_VALUE = false ;
      A587TBT12_EDIT_FLG = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg() ;
      n587TBT12_EDIT_FLG = false ;
      A328TBT12_DEL_FLG = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg() ;
      n328TBT12_DEL_FLG = false ;
      A323TBT12_CRT_PROG_NM = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm() ;
      n323TBT12_CRT_PROG_NM = false ;
      A326TBT12_UPD_PROG_NM = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm() ;
      n326TBT12_UPD_PROG_NM = false ;
      A315TBT12_STUDY_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id() ;
      A316TBT12_SUBJECT_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id() ;
      A317TBT12_CRF_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id() ;
      A318TBT12_CRF_ITEM_GRP_DIV = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div() ;
      A319TBT12_CRF_ITEM_GRP_CD = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd() ;
      Z315TBT12_STUDY_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z() ;
      Z316TBT12_SUBJECT_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z() ;
      Z317TBT12_CRF_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z() ;
      Z318TBT12_CRF_ITEM_GRP_DIV = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z() ;
      Z319TBT12_CRF_ITEM_GRP_CD = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z() ;
      Z320TBT12_CRF_VALUE = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z() ;
      Z587TBT12_EDIT_FLG = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z() ;
      Z328TBT12_DEL_FLG = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z() ;
      Z321TBT12_CRT_DATETIME = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z() ;
      Z322TBT12_CRT_USER_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z() ;
      Z323TBT12_CRT_PROG_NM = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z() ;
      Z324TBT12_UPD_DATETIME = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z() ;
      Z325TBT12_UPD_USER_ID = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z() ;
      Z326TBT12_UPD_PROG_NM = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z() ;
      Z327TBT12_UPD_CNT = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z() ;
      O327TBT12_UPD_CNT = obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z() ;
      n320TBT12_CRF_VALUE = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N()==0)?false:true) ;
      n587TBT12_EDIT_FLG = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N()==0)?false:true) ;
      n328TBT12_DEL_FLG = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N()==0)?false:true) ;
      n321TBT12_CRT_DATETIME = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N()==0)?false:true) ;
      n322TBT12_CRT_USER_ID = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N()==0)?false:true) ;
      n323TBT12_CRT_PROG_NM = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N()==0)?false:true) ;
      n324TBT12_UPD_DATETIME = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N()==0)?false:true) ;
      n325TBT12_UPD_USER_ID = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N()==0)?false:true) ;
      n326TBT12_UPD_PROG_NM = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N()==0)?false:true) ;
      n327TBT12_UPD_CNT = (boolean)((obj26.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj26.getgxTv_SdtTBT12_CRF_RESULT_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A315TBT12_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A316TBT12_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A317TBT12_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A318TBT12_CRF_ITEM_GRP_DIV = (String)getParm(obj,3) ;
      A319TBT12_CRF_ITEM_GRP_CD = (String)getParm(obj,4) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0R26( ) ;
      scanKeyStart0R26( ) ;
      if ( RcdFound26 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z315TBT12_STUDY_ID = A315TBT12_STUDY_ID ;
         Z316TBT12_SUBJECT_ID = A316TBT12_SUBJECT_ID ;
         Z317TBT12_CRF_ID = A317TBT12_CRF_ID ;
         Z318TBT12_CRF_ITEM_GRP_DIV = A318TBT12_CRF_ITEM_GRP_DIV ;
         Z319TBT12_CRF_ITEM_GRP_CD = A319TBT12_CRF_ITEM_GRP_CD ;
         O327TBT12_UPD_CNT = A327TBT12_UPD_CNT ;
         n327TBT12_UPD_CNT = false ;
      }
      zm0R26( -8) ;
      sMode26 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0R26( ) ;
      Gx_mode = sMode26 ;
      addRow0R26( ) ;
      scanKeyEnd0R26( ) ;
      if ( RcdFound26 == 0 )
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
      RowToVars26( bcTBT12_CRF_RESULT, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0R26( ) ;
      if ( RcdFound26 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A315TBT12_STUDY_ID != Z315TBT12_STUDY_ID ) || ( A316TBT12_SUBJECT_ID != Z316TBT12_SUBJECT_ID ) || ( A317TBT12_CRF_ID != Z317TBT12_CRF_ID ) || ( GXutil.strcmp(A318TBT12_CRF_ITEM_GRP_DIV, Z318TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A319TBT12_CRF_ITEM_GRP_CD, Z319TBT12_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A315TBT12_STUDY_ID = Z315TBT12_STUDY_ID ;
            A316TBT12_SUBJECT_ID = Z316TBT12_SUBJECT_ID ;
            A317TBT12_CRF_ID = Z317TBT12_CRF_ID ;
            A318TBT12_CRF_ITEM_GRP_DIV = Z318TBT12_CRF_ITEM_GRP_DIV ;
            A319TBT12_CRF_ITEM_GRP_CD = Z319TBT12_CRF_ITEM_GRP_CD ;
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
            update0R26( ) ;
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
            if ( ( A315TBT12_STUDY_ID != Z315TBT12_STUDY_ID ) || ( A316TBT12_SUBJECT_ID != Z316TBT12_SUBJECT_ID ) || ( A317TBT12_CRF_ID != Z317TBT12_CRF_ID ) || ( GXutil.strcmp(A318TBT12_CRF_ITEM_GRP_DIV, Z318TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A319TBT12_CRF_ITEM_GRP_CD, Z319TBT12_CRF_ITEM_GRP_CD) != 0 ) )
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
                  insert0R26( ) ;
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
                  insert0R26( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow26( bcTBT12_CRF_RESULT) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars26( bcTBT12_CRF_RESULT, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0R26( ) ;
      if ( RcdFound26 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A315TBT12_STUDY_ID != Z315TBT12_STUDY_ID ) || ( A316TBT12_SUBJECT_ID != Z316TBT12_SUBJECT_ID ) || ( A317TBT12_CRF_ID != Z317TBT12_CRF_ID ) || ( GXutil.strcmp(A318TBT12_CRF_ITEM_GRP_DIV, Z318TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A319TBT12_CRF_ITEM_GRP_CD, Z319TBT12_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A315TBT12_STUDY_ID = Z315TBT12_STUDY_ID ;
            A316TBT12_SUBJECT_ID = Z316TBT12_SUBJECT_ID ;
            A317TBT12_CRF_ID = Z317TBT12_CRF_ID ;
            A318TBT12_CRF_ITEM_GRP_DIV = Z318TBT12_CRF_ITEM_GRP_DIV ;
            A319TBT12_CRF_ITEM_GRP_CD = Z319TBT12_CRF_ITEM_GRP_CD ;
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
         if ( ( A315TBT12_STUDY_ID != Z315TBT12_STUDY_ID ) || ( A316TBT12_SUBJECT_ID != Z316TBT12_SUBJECT_ID ) || ( A317TBT12_CRF_ID != Z317TBT12_CRF_ID ) || ( GXutil.strcmp(A318TBT12_CRF_ITEM_GRP_DIV, Z318TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A319TBT12_CRF_ITEM_GRP_CD, Z319TBT12_CRF_ITEM_GRP_CD) != 0 ) )
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
      VarsToRow26( bcTBT12_CRF_RESULT) ;
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
            VarsToRow26( bcTBT12_CRF_RESULT) ;
         }
         else
         {
            RowToVars26( bcTBT12_CRF_RESULT, 1) ;
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
      RowToVars26( bcTBT12_CRF_RESULT, 1) ;
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
                  /* Execute user subroutine: S1168 */
                  S1168 ();
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
      Z318TBT12_CRF_ITEM_GRP_DIV = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      Z319TBT12_CRF_ITEM_GRP_CD = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z = "" ;
      Z321TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A321TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z322TBT12_CRT_USER_ID = "" ;
      A322TBT12_CRT_USER_ID = "" ;
      Z324TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A324TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z325TBT12_UPD_USER_ID = "" ;
      A325TBT12_UPD_USER_ID = "" ;
      Z320TBT12_CRF_VALUE = "" ;
      A320TBT12_CRF_VALUE = "" ;
      Z587TBT12_EDIT_FLG = "" ;
      A587TBT12_EDIT_FLG = "" ;
      Z328TBT12_DEL_FLG = "" ;
      A328TBT12_DEL_FLG = "" ;
      Z323TBT12_CRT_PROG_NM = "" ;
      A323TBT12_CRT_PROG_NM = "" ;
      Z326TBT12_UPD_PROG_NM = "" ;
      A326TBT12_UPD_PROG_NM = "" ;
      BC000R4_A315TBT12_STUDY_ID = new long[1] ;
      BC000R4_A316TBT12_SUBJECT_ID = new int[1] ;
      BC000R4_A317TBT12_CRF_ID = new short[1] ;
      BC000R4_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R4_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R4_A321TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R4_n321TBT12_CRT_DATETIME = new boolean[] {false} ;
      BC000R4_A322TBT12_CRT_USER_ID = new String[] {""} ;
      BC000R4_n322TBT12_CRT_USER_ID = new boolean[] {false} ;
      BC000R4_A324TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R4_n324TBT12_UPD_DATETIME = new boolean[] {false} ;
      BC000R4_A325TBT12_UPD_USER_ID = new String[] {""} ;
      BC000R4_n325TBT12_UPD_USER_ID = new boolean[] {false} ;
      BC000R4_A327TBT12_UPD_CNT = new long[1] ;
      BC000R4_n327TBT12_UPD_CNT = new boolean[] {false} ;
      BC000R4_A320TBT12_CRF_VALUE = new String[] {""} ;
      BC000R4_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      BC000R4_A587TBT12_EDIT_FLG = new String[] {""} ;
      BC000R4_n587TBT12_EDIT_FLG = new boolean[] {false} ;
      BC000R4_A328TBT12_DEL_FLG = new String[] {""} ;
      BC000R4_n328TBT12_DEL_FLG = new boolean[] {false} ;
      BC000R4_A323TBT12_CRT_PROG_NM = new String[] {""} ;
      BC000R4_n323TBT12_CRT_PROG_NM = new boolean[] {false} ;
      BC000R4_A326TBT12_UPD_PROG_NM = new String[] {""} ;
      BC000R4_n326TBT12_UPD_PROG_NM = new boolean[] {false} ;
      BC000R5_A315TBT12_STUDY_ID = new long[1] ;
      BC000R5_A316TBT12_SUBJECT_ID = new int[1] ;
      BC000R5_A317TBT12_CRF_ID = new short[1] ;
      BC000R5_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R5_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R3_A315TBT12_STUDY_ID = new long[1] ;
      BC000R3_A316TBT12_SUBJECT_ID = new int[1] ;
      BC000R3_A317TBT12_CRF_ID = new short[1] ;
      BC000R3_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R3_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R3_A321TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R3_n321TBT12_CRT_DATETIME = new boolean[] {false} ;
      BC000R3_A322TBT12_CRT_USER_ID = new String[] {""} ;
      BC000R3_n322TBT12_CRT_USER_ID = new boolean[] {false} ;
      BC000R3_A324TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R3_n324TBT12_UPD_DATETIME = new boolean[] {false} ;
      BC000R3_A325TBT12_UPD_USER_ID = new String[] {""} ;
      BC000R3_n325TBT12_UPD_USER_ID = new boolean[] {false} ;
      BC000R3_A327TBT12_UPD_CNT = new long[1] ;
      BC000R3_n327TBT12_UPD_CNT = new boolean[] {false} ;
      BC000R3_A320TBT12_CRF_VALUE = new String[] {""} ;
      BC000R3_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      BC000R3_A587TBT12_EDIT_FLG = new String[] {""} ;
      BC000R3_n587TBT12_EDIT_FLG = new boolean[] {false} ;
      BC000R3_A328TBT12_DEL_FLG = new String[] {""} ;
      BC000R3_n328TBT12_DEL_FLG = new boolean[] {false} ;
      BC000R3_A323TBT12_CRT_PROG_NM = new String[] {""} ;
      BC000R3_n323TBT12_CRT_PROG_NM = new boolean[] {false} ;
      BC000R3_A326TBT12_UPD_PROG_NM = new String[] {""} ;
      BC000R3_n326TBT12_UPD_PROG_NM = new boolean[] {false} ;
      sMode26 = "" ;
      BC000R2_A315TBT12_STUDY_ID = new long[1] ;
      BC000R2_A316TBT12_SUBJECT_ID = new int[1] ;
      BC000R2_A317TBT12_CRF_ID = new short[1] ;
      BC000R2_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R2_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R2_A321TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R2_n321TBT12_CRT_DATETIME = new boolean[] {false} ;
      BC000R2_A322TBT12_CRT_USER_ID = new String[] {""} ;
      BC000R2_n322TBT12_CRT_USER_ID = new boolean[] {false} ;
      BC000R2_A324TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R2_n324TBT12_UPD_DATETIME = new boolean[] {false} ;
      BC000R2_A325TBT12_UPD_USER_ID = new String[] {""} ;
      BC000R2_n325TBT12_UPD_USER_ID = new boolean[] {false} ;
      BC000R2_A327TBT12_UPD_CNT = new long[1] ;
      BC000R2_n327TBT12_UPD_CNT = new boolean[] {false} ;
      BC000R2_A320TBT12_CRF_VALUE = new String[] {""} ;
      BC000R2_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      BC000R2_A587TBT12_EDIT_FLG = new String[] {""} ;
      BC000R2_n587TBT12_EDIT_FLG = new boolean[] {false} ;
      BC000R2_A328TBT12_DEL_FLG = new String[] {""} ;
      BC000R2_n328TBT12_DEL_FLG = new boolean[] {false} ;
      BC000R2_A323TBT12_CRT_PROG_NM = new String[] {""} ;
      BC000R2_n323TBT12_CRT_PROG_NM = new boolean[] {false} ;
      BC000R2_A326TBT12_UPD_PROG_NM = new String[] {""} ;
      BC000R2_n326TBT12_UPD_PROG_NM = new boolean[] {false} ;
      BC000R9_A315TBT12_STUDY_ID = new long[1] ;
      BC000R9_A316TBT12_SUBJECT_ID = new int[1] ;
      BC000R9_A317TBT12_CRF_ID = new short[1] ;
      BC000R9_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000R9_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000R9_A321TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R9_n321TBT12_CRT_DATETIME = new boolean[] {false} ;
      BC000R9_A322TBT12_CRT_USER_ID = new String[] {""} ;
      BC000R9_n322TBT12_CRT_USER_ID = new boolean[] {false} ;
      BC000R9_A324TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000R9_n324TBT12_UPD_DATETIME = new boolean[] {false} ;
      BC000R9_A325TBT12_UPD_USER_ID = new String[] {""} ;
      BC000R9_n325TBT12_UPD_USER_ID = new boolean[] {false} ;
      BC000R9_A327TBT12_UPD_CNT = new long[1] ;
      BC000R9_n327TBT12_UPD_CNT = new boolean[] {false} ;
      BC000R9_A320TBT12_CRF_VALUE = new String[] {""} ;
      BC000R9_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      BC000R9_A587TBT12_EDIT_FLG = new String[] {""} ;
      BC000R9_n587TBT12_EDIT_FLG = new boolean[] {false} ;
      BC000R9_A328TBT12_DEL_FLG = new String[] {""} ;
      BC000R9_n328TBT12_DEL_FLG = new boolean[] {false} ;
      BC000R9_A323TBT12_CRT_PROG_NM = new String[] {""} ;
      BC000R9_n323TBT12_CRT_PROG_NM = new boolean[] {false} ;
      BC000R9_A326TBT12_UPD_PROG_NM = new String[] {""} ;
      BC000R9_n326TBT12_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt12_crf_result_bc__default(),
         new Object[] {
             new Object[] {
            BC000R2_A315TBT12_STUDY_ID, BC000R2_A316TBT12_SUBJECT_ID, BC000R2_A317TBT12_CRF_ID, BC000R2_A318TBT12_CRF_ITEM_GRP_DIV, BC000R2_A319TBT12_CRF_ITEM_GRP_CD, BC000R2_A321TBT12_CRT_DATETIME, BC000R2_n321TBT12_CRT_DATETIME, BC000R2_A322TBT12_CRT_USER_ID, BC000R2_n322TBT12_CRT_USER_ID, BC000R2_A324TBT12_UPD_DATETIME,
            BC000R2_n324TBT12_UPD_DATETIME, BC000R2_A325TBT12_UPD_USER_ID, BC000R2_n325TBT12_UPD_USER_ID, BC000R2_A327TBT12_UPD_CNT, BC000R2_n327TBT12_UPD_CNT, BC000R2_A320TBT12_CRF_VALUE, BC000R2_n320TBT12_CRF_VALUE, BC000R2_A587TBT12_EDIT_FLG, BC000R2_n587TBT12_EDIT_FLG, BC000R2_A328TBT12_DEL_FLG,
            BC000R2_n328TBT12_DEL_FLG, BC000R2_A323TBT12_CRT_PROG_NM, BC000R2_n323TBT12_CRT_PROG_NM, BC000R2_A326TBT12_UPD_PROG_NM, BC000R2_n326TBT12_UPD_PROG_NM
            }
            , new Object[] {
            BC000R3_A315TBT12_STUDY_ID, BC000R3_A316TBT12_SUBJECT_ID, BC000R3_A317TBT12_CRF_ID, BC000R3_A318TBT12_CRF_ITEM_GRP_DIV, BC000R3_A319TBT12_CRF_ITEM_GRP_CD, BC000R3_A321TBT12_CRT_DATETIME, BC000R3_n321TBT12_CRT_DATETIME, BC000R3_A322TBT12_CRT_USER_ID, BC000R3_n322TBT12_CRT_USER_ID, BC000R3_A324TBT12_UPD_DATETIME,
            BC000R3_n324TBT12_UPD_DATETIME, BC000R3_A325TBT12_UPD_USER_ID, BC000R3_n325TBT12_UPD_USER_ID, BC000R3_A327TBT12_UPD_CNT, BC000R3_n327TBT12_UPD_CNT, BC000R3_A320TBT12_CRF_VALUE, BC000R3_n320TBT12_CRF_VALUE, BC000R3_A587TBT12_EDIT_FLG, BC000R3_n587TBT12_EDIT_FLG, BC000R3_A328TBT12_DEL_FLG,
            BC000R3_n328TBT12_DEL_FLG, BC000R3_A323TBT12_CRT_PROG_NM, BC000R3_n323TBT12_CRT_PROG_NM, BC000R3_A326TBT12_UPD_PROG_NM, BC000R3_n326TBT12_UPD_PROG_NM
            }
            , new Object[] {
            BC000R4_A315TBT12_STUDY_ID, BC000R4_A316TBT12_SUBJECT_ID, BC000R4_A317TBT12_CRF_ID, BC000R4_A318TBT12_CRF_ITEM_GRP_DIV, BC000R4_A319TBT12_CRF_ITEM_GRP_CD, BC000R4_A321TBT12_CRT_DATETIME, BC000R4_n321TBT12_CRT_DATETIME, BC000R4_A322TBT12_CRT_USER_ID, BC000R4_n322TBT12_CRT_USER_ID, BC000R4_A324TBT12_UPD_DATETIME,
            BC000R4_n324TBT12_UPD_DATETIME, BC000R4_A325TBT12_UPD_USER_ID, BC000R4_n325TBT12_UPD_USER_ID, BC000R4_A327TBT12_UPD_CNT, BC000R4_n327TBT12_UPD_CNT, BC000R4_A320TBT12_CRF_VALUE, BC000R4_n320TBT12_CRF_VALUE, BC000R4_A587TBT12_EDIT_FLG, BC000R4_n587TBT12_EDIT_FLG, BC000R4_A328TBT12_DEL_FLG,
            BC000R4_n328TBT12_DEL_FLG, BC000R4_A323TBT12_CRT_PROG_NM, BC000R4_n323TBT12_CRT_PROG_NM, BC000R4_A326TBT12_UPD_PROG_NM, BC000R4_n326TBT12_UPD_PROG_NM
            }
            , new Object[] {
            BC000R5_A315TBT12_STUDY_ID, BC000R5_A316TBT12_SUBJECT_ID, BC000R5_A317TBT12_CRF_ID, BC000R5_A318TBT12_CRF_ITEM_GRP_DIV, BC000R5_A319TBT12_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000R9_A315TBT12_STUDY_ID, BC000R9_A316TBT12_SUBJECT_ID, BC000R9_A317TBT12_CRF_ID, BC000R9_A318TBT12_CRF_ITEM_GRP_DIV, BC000R9_A319TBT12_CRF_ITEM_GRP_CD, BC000R9_A321TBT12_CRT_DATETIME, BC000R9_n321TBT12_CRT_DATETIME, BC000R9_A322TBT12_CRT_USER_ID, BC000R9_n322TBT12_CRT_USER_ID, BC000R9_A324TBT12_UPD_DATETIME,
            BC000R9_n324TBT12_UPD_DATETIME, BC000R9_A325TBT12_UPD_USER_ID, BC000R9_n325TBT12_UPD_USER_ID, BC000R9_A327TBT12_UPD_CNT, BC000R9_n327TBT12_UPD_CNT, BC000R9_A320TBT12_CRF_VALUE, BC000R9_n320TBT12_CRF_VALUE, BC000R9_A587TBT12_EDIT_FLG, BC000R9_n587TBT12_EDIT_FLG, BC000R9_A328TBT12_DEL_FLG,
            BC000R9_n328TBT12_DEL_FLG, BC000R9_A323TBT12_CRT_PROG_NM, BC000R9_n323TBT12_CRT_PROG_NM, BC000R9_A326TBT12_UPD_PROG_NM, BC000R9_n326TBT12_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT12_CRF_RESULT_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110R2 */
      e110R2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z317TBT12_CRF_ID ;
   private short A317TBT12_CRF_ID ;
   private short gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z ;
   private short RcdFound26 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z316TBT12_SUBJECT_ID ;
   private int A316TBT12_SUBJECT_ID ;
   private int gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z315TBT12_STUDY_ID ;
   private long A315TBT12_STUDY_ID ;
   private long gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z ;
   private long gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z ;
   private long Z327TBT12_UPD_CNT ;
   private long A327TBT12_UPD_CNT ;
   private long O327TBT12_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode26 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z ;
   private java.util.Date Z321TBT12_CRT_DATETIME ;
   private java.util.Date A321TBT12_CRT_DATETIME ;
   private java.util.Date Z324TBT12_UPD_DATETIME ;
   private java.util.Date A324TBT12_UPD_DATETIME ;
   private boolean n321TBT12_CRT_DATETIME ;
   private boolean n322TBT12_CRT_USER_ID ;
   private boolean n324TBT12_UPD_DATETIME ;
   private boolean n325TBT12_UPD_USER_ID ;
   private boolean n327TBT12_UPD_CNT ;
   private boolean n320TBT12_CRF_VALUE ;
   private boolean n587TBT12_EDIT_FLG ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n323TBT12_CRT_PROG_NM ;
   private boolean n326TBT12_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z318TBT12_CRF_ITEM_GRP_DIV ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String Z319TBT12_CRF_ITEM_GRP_CD ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String AV8W_BC_FLG ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z ;
   private String Z322TBT12_CRT_USER_ID ;
   private String A322TBT12_CRT_USER_ID ;
   private String Z325TBT12_UPD_USER_ID ;
   private String A325TBT12_UPD_USER_ID ;
   private String Z320TBT12_CRF_VALUE ;
   private String A320TBT12_CRF_VALUE ;
   private String Z587TBT12_EDIT_FLG ;
   private String A587TBT12_EDIT_FLG ;
   private String Z328TBT12_DEL_FLG ;
   private String A328TBT12_DEL_FLG ;
   private String Z323TBT12_CRT_PROG_NM ;
   private String A323TBT12_CRT_PROG_NM ;
   private String Z326TBT12_UPD_PROG_NM ;
   private String A326TBT12_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT12_CRF_RESULT bcTBT12_CRF_RESULT ;
   private IDataStoreProvider pr_default ;
   private long[] BC000R4_A315TBT12_STUDY_ID ;
   private int[] BC000R4_A316TBT12_SUBJECT_ID ;
   private short[] BC000R4_A317TBT12_CRF_ID ;
   private String[] BC000R4_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R4_A319TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000R4_A321TBT12_CRT_DATETIME ;
   private boolean[] BC000R4_n321TBT12_CRT_DATETIME ;
   private String[] BC000R4_A322TBT12_CRT_USER_ID ;
   private boolean[] BC000R4_n322TBT12_CRT_USER_ID ;
   private java.util.Date[] BC000R4_A324TBT12_UPD_DATETIME ;
   private boolean[] BC000R4_n324TBT12_UPD_DATETIME ;
   private String[] BC000R4_A325TBT12_UPD_USER_ID ;
   private boolean[] BC000R4_n325TBT12_UPD_USER_ID ;
   private long[] BC000R4_A327TBT12_UPD_CNT ;
   private boolean[] BC000R4_n327TBT12_UPD_CNT ;
   private String[] BC000R4_A320TBT12_CRF_VALUE ;
   private boolean[] BC000R4_n320TBT12_CRF_VALUE ;
   private String[] BC000R4_A587TBT12_EDIT_FLG ;
   private boolean[] BC000R4_n587TBT12_EDIT_FLG ;
   private String[] BC000R4_A328TBT12_DEL_FLG ;
   private boolean[] BC000R4_n328TBT12_DEL_FLG ;
   private String[] BC000R4_A323TBT12_CRT_PROG_NM ;
   private boolean[] BC000R4_n323TBT12_CRT_PROG_NM ;
   private String[] BC000R4_A326TBT12_UPD_PROG_NM ;
   private boolean[] BC000R4_n326TBT12_UPD_PROG_NM ;
   private long[] BC000R5_A315TBT12_STUDY_ID ;
   private int[] BC000R5_A316TBT12_SUBJECT_ID ;
   private short[] BC000R5_A317TBT12_CRF_ID ;
   private String[] BC000R5_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R5_A319TBT12_CRF_ITEM_GRP_CD ;
   private long[] BC000R3_A315TBT12_STUDY_ID ;
   private int[] BC000R3_A316TBT12_SUBJECT_ID ;
   private short[] BC000R3_A317TBT12_CRF_ID ;
   private String[] BC000R3_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R3_A319TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000R3_A321TBT12_CRT_DATETIME ;
   private boolean[] BC000R3_n321TBT12_CRT_DATETIME ;
   private String[] BC000R3_A322TBT12_CRT_USER_ID ;
   private boolean[] BC000R3_n322TBT12_CRT_USER_ID ;
   private java.util.Date[] BC000R3_A324TBT12_UPD_DATETIME ;
   private boolean[] BC000R3_n324TBT12_UPD_DATETIME ;
   private String[] BC000R3_A325TBT12_UPD_USER_ID ;
   private boolean[] BC000R3_n325TBT12_UPD_USER_ID ;
   private long[] BC000R3_A327TBT12_UPD_CNT ;
   private boolean[] BC000R3_n327TBT12_UPD_CNT ;
   private String[] BC000R3_A320TBT12_CRF_VALUE ;
   private boolean[] BC000R3_n320TBT12_CRF_VALUE ;
   private String[] BC000R3_A587TBT12_EDIT_FLG ;
   private boolean[] BC000R3_n587TBT12_EDIT_FLG ;
   private String[] BC000R3_A328TBT12_DEL_FLG ;
   private boolean[] BC000R3_n328TBT12_DEL_FLG ;
   private String[] BC000R3_A323TBT12_CRT_PROG_NM ;
   private boolean[] BC000R3_n323TBT12_CRT_PROG_NM ;
   private String[] BC000R3_A326TBT12_UPD_PROG_NM ;
   private boolean[] BC000R3_n326TBT12_UPD_PROG_NM ;
   private long[] BC000R2_A315TBT12_STUDY_ID ;
   private int[] BC000R2_A316TBT12_SUBJECT_ID ;
   private short[] BC000R2_A317TBT12_CRF_ID ;
   private String[] BC000R2_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R2_A319TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000R2_A321TBT12_CRT_DATETIME ;
   private boolean[] BC000R2_n321TBT12_CRT_DATETIME ;
   private String[] BC000R2_A322TBT12_CRT_USER_ID ;
   private boolean[] BC000R2_n322TBT12_CRT_USER_ID ;
   private java.util.Date[] BC000R2_A324TBT12_UPD_DATETIME ;
   private boolean[] BC000R2_n324TBT12_UPD_DATETIME ;
   private String[] BC000R2_A325TBT12_UPD_USER_ID ;
   private boolean[] BC000R2_n325TBT12_UPD_USER_ID ;
   private long[] BC000R2_A327TBT12_UPD_CNT ;
   private boolean[] BC000R2_n327TBT12_UPD_CNT ;
   private String[] BC000R2_A320TBT12_CRF_VALUE ;
   private boolean[] BC000R2_n320TBT12_CRF_VALUE ;
   private String[] BC000R2_A587TBT12_EDIT_FLG ;
   private boolean[] BC000R2_n587TBT12_EDIT_FLG ;
   private String[] BC000R2_A328TBT12_DEL_FLG ;
   private boolean[] BC000R2_n328TBT12_DEL_FLG ;
   private String[] BC000R2_A323TBT12_CRT_PROG_NM ;
   private boolean[] BC000R2_n323TBT12_CRT_PROG_NM ;
   private String[] BC000R2_A326TBT12_UPD_PROG_NM ;
   private boolean[] BC000R2_n326TBT12_UPD_PROG_NM ;
   private long[] BC000R9_A315TBT12_STUDY_ID ;
   private int[] BC000R9_A316TBT12_SUBJECT_ID ;
   private short[] BC000R9_A317TBT12_CRF_ID ;
   private String[] BC000R9_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] BC000R9_A319TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000R9_A321TBT12_CRT_DATETIME ;
   private boolean[] BC000R9_n321TBT12_CRT_DATETIME ;
   private String[] BC000R9_A322TBT12_CRT_USER_ID ;
   private boolean[] BC000R9_n322TBT12_CRT_USER_ID ;
   private java.util.Date[] BC000R9_A324TBT12_UPD_DATETIME ;
   private boolean[] BC000R9_n324TBT12_UPD_DATETIME ;
   private String[] BC000R9_A325TBT12_UPD_USER_ID ;
   private boolean[] BC000R9_n325TBT12_UPD_USER_ID ;
   private long[] BC000R9_A327TBT12_UPD_CNT ;
   private boolean[] BC000R9_n327TBT12_UPD_CNT ;
   private String[] BC000R9_A320TBT12_CRF_VALUE ;
   private boolean[] BC000R9_n320TBT12_CRF_VALUE ;
   private String[] BC000R9_A587TBT12_EDIT_FLG ;
   private boolean[] BC000R9_n587TBT12_EDIT_FLG ;
   private String[] BC000R9_A328TBT12_DEL_FLG ;
   private boolean[] BC000R9_n328TBT12_DEL_FLG ;
   private String[] BC000R9_A323TBT12_CRT_PROG_NM ;
   private boolean[] BC000R9_n323TBT12_CRT_PROG_NM ;
   private String[] BC000R9_A326TBT12_UPD_PROG_NM ;
   private boolean[] BC000R9_n326TBT12_UPD_PROG_NM ;
}

final  class tbt12_crf_result_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000R2", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000R3", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000R4", "SELECT TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD`, TM1.`TBT12_CRT_DATETIME`, TM1.`TBT12_CRT_USER_ID`, TM1.`TBT12_UPD_DATETIME`, TM1.`TBT12_UPD_USER_ID`, TM1.`TBT12_UPD_CNT`, TM1.`TBT12_CRF_VALUE`, TM1.`TBT12_EDIT_FLG`, TM1.`TBT12_DEL_FLG`, TM1.`TBT12_CRT_PROG_NM`, TM1.`TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` TM1 WHERE TM1.`TBT12_STUDY_ID` = ? and TM1.`TBT12_SUBJECT_ID` = ? and TM1.`TBT12_CRF_ID` = ? and TM1.`TBT12_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT12_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000R5", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000R6", "INSERT INTO `TBT12_CRF_RESULT` (`TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000R7", "UPDATE `TBT12_CRF_RESULT` SET `TBT12_CRT_DATETIME`=?, `TBT12_CRT_USER_ID`=?, `TBT12_UPD_DATETIME`=?, `TBT12_UPD_USER_ID`=?, `TBT12_UPD_CNT`=?, `TBT12_CRF_VALUE`=?, `TBT12_EDIT_FLG`=?, `TBT12_DEL_FLG`=?, `TBT12_CRT_PROG_NM`=?, `TBT12_UPD_PROG_NM`=?  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000R8", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000R9", "SELECT TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD`, TM1.`TBT12_CRT_DATETIME`, TM1.`TBT12_CRT_USER_ID`, TM1.`TBT12_UPD_DATETIME`, TM1.`TBT12_UPD_USER_ID`, TM1.`TBT12_UPD_CNT`, TM1.`TBT12_CRF_VALUE`, TM1.`TBT12_EDIT_FLG`, TM1.`TBT12_DEL_FLG`, TM1.`TBT12_CRT_PROG_NM`, TM1.`TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` TM1 WHERE TM1.`TBT12_STUDY_ID` = ? and TM1.`TBT12_SUBJECT_ID` = ? and TM1.`TBT12_CRF_ID` = ? and TM1.`TBT12_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT12_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               stmt.setVarchar(4, (String)parms[3], 1, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 1, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 1, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 1, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 1, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[12], 128);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[14]).longValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[16], 2000);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[22], 40);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[24], 40);
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
               stmt.setVarchar(14, (String)parms[23], 1, false);
               stmt.setVarchar(15, (String)parms[24], 50, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 1, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 1, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               break;
      }
   }

}

