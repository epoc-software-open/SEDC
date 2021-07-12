/*
               File: tbm25_sel_list_bc
        Description: 選択リストマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:37.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm25_sel_list_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm25_sel_list_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm25_sel_list_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm25_sel_list_bc.class ));
   }

   public tbm25_sel_list_bc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0X32( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0X32( ) ;
      standaloneModal( ) ;
      addRow0X32( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120X2 */
         e120X2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z23TBM25_STUDY_ID = A23TBM25_STUDY_ID ;
            Z24TBM25_LIST_CD = A24TBM25_LIST_CD ;
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

   public void confirm_0X0( )
   {
      beforeValidate0X32( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0X32( ) ;
         }
         else
         {
            checkExtendedTable0X32( ) ;
            if ( AnyError == 0 )
            {
               zm0X32( 9) ;
            }
            closeExtendedTableCursors0X32( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110X2( )
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

   public void e120X2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A23TBM25_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A24TBM25_LIST_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A552TBM25_LIST_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A553TBM25_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A554TBM25_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm25_sel_list_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A555TBM25_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A556TBM25_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A557TBM25_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm25_sel_list_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A558TBM25_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A559TBM25_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A560TBM25_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0X32( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z554TBM25_CRT_DATETIME = A554TBM25_CRT_DATETIME ;
         Z555TBM25_CRT_USER_ID = A555TBM25_CRT_USER_ID ;
         Z557TBM25_UPD_DATETIME = A557TBM25_UPD_DATETIME ;
         Z558TBM25_UPD_USER_ID = A558TBM25_UPD_USER_ID ;
         Z560TBM25_UPD_CNT = A560TBM25_UPD_CNT ;
         Z552TBM25_LIST_NM = A552TBM25_LIST_NM ;
         Z553TBM25_DEL_FLG = A553TBM25_DEL_FLG ;
         Z556TBM25_CRT_PROG_NM = A556TBM25_CRT_PROG_NM ;
         Z559TBM25_UPD_PROG_NM = A559TBM25_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z24TBM25_LIST_CD = A24TBM25_LIST_CD ;
         Z554TBM25_CRT_DATETIME = A554TBM25_CRT_DATETIME ;
         Z555TBM25_CRT_USER_ID = A555TBM25_CRT_USER_ID ;
         Z557TBM25_UPD_DATETIME = A557TBM25_UPD_DATETIME ;
         Z558TBM25_UPD_USER_ID = A558TBM25_UPD_USER_ID ;
         Z560TBM25_UPD_CNT = A560TBM25_UPD_CNT ;
         Z552TBM25_LIST_NM = A552TBM25_LIST_NM ;
         Z553TBM25_DEL_FLG = A553TBM25_DEL_FLG ;
         Z556TBM25_CRT_PROG_NM = A556TBM25_CRT_PROG_NM ;
         Z559TBM25_UPD_PROG_NM = A559TBM25_UPD_PROG_NM ;
         Z23TBM25_STUDY_ID = A23TBM25_STUDY_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0X32( )
   {
      /* Using cursor BC000X5 */
      pr_default.execute(3, new Object[] {new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A554TBM25_CRT_DATETIME = BC000X5_A554TBM25_CRT_DATETIME[0] ;
         n554TBM25_CRT_DATETIME = BC000X5_n554TBM25_CRT_DATETIME[0] ;
         A555TBM25_CRT_USER_ID = BC000X5_A555TBM25_CRT_USER_ID[0] ;
         n555TBM25_CRT_USER_ID = BC000X5_n555TBM25_CRT_USER_ID[0] ;
         A557TBM25_UPD_DATETIME = BC000X5_A557TBM25_UPD_DATETIME[0] ;
         n557TBM25_UPD_DATETIME = BC000X5_n557TBM25_UPD_DATETIME[0] ;
         A558TBM25_UPD_USER_ID = BC000X5_A558TBM25_UPD_USER_ID[0] ;
         n558TBM25_UPD_USER_ID = BC000X5_n558TBM25_UPD_USER_ID[0] ;
         A560TBM25_UPD_CNT = BC000X5_A560TBM25_UPD_CNT[0] ;
         n560TBM25_UPD_CNT = BC000X5_n560TBM25_UPD_CNT[0] ;
         A552TBM25_LIST_NM = BC000X5_A552TBM25_LIST_NM[0] ;
         n552TBM25_LIST_NM = BC000X5_n552TBM25_LIST_NM[0] ;
         A553TBM25_DEL_FLG = BC000X5_A553TBM25_DEL_FLG[0] ;
         n553TBM25_DEL_FLG = BC000X5_n553TBM25_DEL_FLG[0] ;
         A556TBM25_CRT_PROG_NM = BC000X5_A556TBM25_CRT_PROG_NM[0] ;
         n556TBM25_CRT_PROG_NM = BC000X5_n556TBM25_CRT_PROG_NM[0] ;
         A559TBM25_UPD_PROG_NM = BC000X5_A559TBM25_UPD_PROG_NM[0] ;
         n559TBM25_UPD_PROG_NM = BC000X5_n559TBM25_UPD_PROG_NM[0] ;
         zm0X32( -8) ;
      }
      pr_default.close(3);
      onLoadActions0X32( ) ;
   }

   public void onLoadActions0X32( )
   {
      AV9Pgmname = "TBM25_SEL_LIST_BC" ;
   }

   public void checkExtendedTable0X32( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM25_SEL_LIST_BC" ;
      /* Using cursor BC000X4 */
      pr_default.execute(2, new Object[] {new Long(A23TBM25_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'選択リストマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM25_STUDY_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A554TBM25_CRT_DATETIME) || (( A554TBM25_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A554TBM25_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A557TBM25_UPD_DATETIME) || (( A557TBM25_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A557TBM25_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0X32( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0X32( )
   {
      /* Using cursor BC000X6 */
      pr_default.execute(4, new Object[] {new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound32 = (short)(1) ;
      }
      else
      {
         RcdFound32 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000X3 */
      pr_default.execute(1, new Object[] {new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0X32( 8) ;
         RcdFound32 = (short)(1) ;
         A24TBM25_LIST_CD = BC000X3_A24TBM25_LIST_CD[0] ;
         A554TBM25_CRT_DATETIME = BC000X3_A554TBM25_CRT_DATETIME[0] ;
         n554TBM25_CRT_DATETIME = BC000X3_n554TBM25_CRT_DATETIME[0] ;
         A555TBM25_CRT_USER_ID = BC000X3_A555TBM25_CRT_USER_ID[0] ;
         n555TBM25_CRT_USER_ID = BC000X3_n555TBM25_CRT_USER_ID[0] ;
         A557TBM25_UPD_DATETIME = BC000X3_A557TBM25_UPD_DATETIME[0] ;
         n557TBM25_UPD_DATETIME = BC000X3_n557TBM25_UPD_DATETIME[0] ;
         A558TBM25_UPD_USER_ID = BC000X3_A558TBM25_UPD_USER_ID[0] ;
         n558TBM25_UPD_USER_ID = BC000X3_n558TBM25_UPD_USER_ID[0] ;
         A560TBM25_UPD_CNT = BC000X3_A560TBM25_UPD_CNT[0] ;
         n560TBM25_UPD_CNT = BC000X3_n560TBM25_UPD_CNT[0] ;
         A552TBM25_LIST_NM = BC000X3_A552TBM25_LIST_NM[0] ;
         n552TBM25_LIST_NM = BC000X3_n552TBM25_LIST_NM[0] ;
         A553TBM25_DEL_FLG = BC000X3_A553TBM25_DEL_FLG[0] ;
         n553TBM25_DEL_FLG = BC000X3_n553TBM25_DEL_FLG[0] ;
         A556TBM25_CRT_PROG_NM = BC000X3_A556TBM25_CRT_PROG_NM[0] ;
         n556TBM25_CRT_PROG_NM = BC000X3_n556TBM25_CRT_PROG_NM[0] ;
         A559TBM25_UPD_PROG_NM = BC000X3_A559TBM25_UPD_PROG_NM[0] ;
         n559TBM25_UPD_PROG_NM = BC000X3_n559TBM25_UPD_PROG_NM[0] ;
         A23TBM25_STUDY_ID = BC000X3_A23TBM25_STUDY_ID[0] ;
         O560TBM25_UPD_CNT = A560TBM25_UPD_CNT ;
         n560TBM25_UPD_CNT = false ;
         Z23TBM25_STUDY_ID = A23TBM25_STUDY_ID ;
         Z24TBM25_LIST_CD = A24TBM25_LIST_CD ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0X32( ) ;
         if ( AnyError == 1 )
         {
            RcdFound32 = (short)(0) ;
            initializeNonKey0X32( ) ;
         }
         Gx_mode = sMode32 ;
      }
      else
      {
         RcdFound32 = (short)(0) ;
         initializeNonKey0X32( ) ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode32 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0X32( ) ;
      if ( RcdFound32 == 0 )
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
      confirm_0X0( ) ;
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

   public void checkOptimisticConcurrency0X32( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000X2 */
         pr_default.execute(0, new Object[] {new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM25_SEL_LIST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z554TBM25_CRT_DATETIME.equals( BC000X2_A554TBM25_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z555TBM25_CRT_USER_ID, BC000X2_A555TBM25_CRT_USER_ID[0]) != 0 ) || !( Z557TBM25_UPD_DATETIME.equals( BC000X2_A557TBM25_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z558TBM25_UPD_USER_ID, BC000X2_A558TBM25_UPD_USER_ID[0]) != 0 ) || ( Z560TBM25_UPD_CNT != BC000X2_A560TBM25_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z552TBM25_LIST_NM, BC000X2_A552TBM25_LIST_NM[0]) != 0 ) || ( GXutil.strcmp(Z553TBM25_DEL_FLG, BC000X2_A553TBM25_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z556TBM25_CRT_PROG_NM, BC000X2_A556TBM25_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z559TBM25_UPD_PROG_NM, BC000X2_A559TBM25_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM25_SEL_LIST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0X32( )
   {
      beforeValidate0X32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0X32( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0X32( 0) ;
         checkOptimisticConcurrency0X32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0X32( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0X32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000X7 */
                  pr_default.execute(5, new Object[] {A24TBM25_LIST_CD, new Boolean(n554TBM25_CRT_DATETIME), A554TBM25_CRT_DATETIME, new Boolean(n555TBM25_CRT_USER_ID), A555TBM25_CRT_USER_ID, new Boolean(n557TBM25_UPD_DATETIME), A557TBM25_UPD_DATETIME, new Boolean(n558TBM25_UPD_USER_ID), A558TBM25_UPD_USER_ID, new Boolean(n560TBM25_UPD_CNT), new Long(A560TBM25_UPD_CNT), new Boolean(n552TBM25_LIST_NM), A552TBM25_LIST_NM, new Boolean(n553TBM25_DEL_FLG), A553TBM25_DEL_FLG, new Boolean(n556TBM25_CRT_PROG_NM), A556TBM25_CRT_PROG_NM, new Boolean(n559TBM25_UPD_PROG_NM), A559TBM25_UPD_PROG_NM, new Long(A23TBM25_STUDY_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM25_SEL_LIST") ;
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
            load0X32( ) ;
         }
         endLevel0X32( ) ;
      }
      closeExtendedTableCursors0X32( ) ;
   }

   public void update0X32( )
   {
      beforeValidate0X32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0X32( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0X32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0X32( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0X32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000X8 */
                  pr_default.execute(6, new Object[] {new Boolean(n554TBM25_CRT_DATETIME), A554TBM25_CRT_DATETIME, new Boolean(n555TBM25_CRT_USER_ID), A555TBM25_CRT_USER_ID, new Boolean(n557TBM25_UPD_DATETIME), A557TBM25_UPD_DATETIME, new Boolean(n558TBM25_UPD_USER_ID), A558TBM25_UPD_USER_ID, new Boolean(n560TBM25_UPD_CNT), new Long(A560TBM25_UPD_CNT), new Boolean(n552TBM25_LIST_NM), A552TBM25_LIST_NM, new Boolean(n553TBM25_DEL_FLG), A553TBM25_DEL_FLG, new Boolean(n556TBM25_CRT_PROG_NM), A556TBM25_CRT_PROG_NM, new Boolean(n559TBM25_UPD_PROG_NM), A559TBM25_UPD_PROG_NM, new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM25_SEL_LIST") ;
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM25_SEL_LIST"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0X32( ) ;
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
         endLevel0X32( ) ;
      }
      closeExtendedTableCursors0X32( ) ;
   }

   public void deferredUpdate0X32( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0X32( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0X32( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0X32( ) ;
         afterConfirm0X32( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0X32( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000X9 */
               pr_default.execute(7, new Object[] {new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM25_SEL_LIST") ;
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
      sMode32 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0X32( ) ;
      Gx_mode = sMode32 ;
   }

   public void onDeleteControls0X32( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM25_SEL_LIST_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000X10 */
         pr_default.execute(8, new Object[] {new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"選択リスト項目マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
      }
   }

   public void endLevel0X32( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0X32( ) ;
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

   public void scanKeyStart0X32( )
   {
      /* Scan By routine */
      /* Using cursor BC000X11 */
      pr_default.execute(9, new Object[] {new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD});
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A24TBM25_LIST_CD = BC000X11_A24TBM25_LIST_CD[0] ;
         A554TBM25_CRT_DATETIME = BC000X11_A554TBM25_CRT_DATETIME[0] ;
         n554TBM25_CRT_DATETIME = BC000X11_n554TBM25_CRT_DATETIME[0] ;
         A555TBM25_CRT_USER_ID = BC000X11_A555TBM25_CRT_USER_ID[0] ;
         n555TBM25_CRT_USER_ID = BC000X11_n555TBM25_CRT_USER_ID[0] ;
         A557TBM25_UPD_DATETIME = BC000X11_A557TBM25_UPD_DATETIME[0] ;
         n557TBM25_UPD_DATETIME = BC000X11_n557TBM25_UPD_DATETIME[0] ;
         A558TBM25_UPD_USER_ID = BC000X11_A558TBM25_UPD_USER_ID[0] ;
         n558TBM25_UPD_USER_ID = BC000X11_n558TBM25_UPD_USER_ID[0] ;
         A560TBM25_UPD_CNT = BC000X11_A560TBM25_UPD_CNT[0] ;
         n560TBM25_UPD_CNT = BC000X11_n560TBM25_UPD_CNT[0] ;
         A552TBM25_LIST_NM = BC000X11_A552TBM25_LIST_NM[0] ;
         n552TBM25_LIST_NM = BC000X11_n552TBM25_LIST_NM[0] ;
         A553TBM25_DEL_FLG = BC000X11_A553TBM25_DEL_FLG[0] ;
         n553TBM25_DEL_FLG = BC000X11_n553TBM25_DEL_FLG[0] ;
         A556TBM25_CRT_PROG_NM = BC000X11_A556TBM25_CRT_PROG_NM[0] ;
         n556TBM25_CRT_PROG_NM = BC000X11_n556TBM25_CRT_PROG_NM[0] ;
         A559TBM25_UPD_PROG_NM = BC000X11_A559TBM25_UPD_PROG_NM[0] ;
         n559TBM25_UPD_PROG_NM = BC000X11_n559TBM25_UPD_PROG_NM[0] ;
         A23TBM25_STUDY_ID = BC000X11_A23TBM25_STUDY_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0X32( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound32 = (short)(0) ;
      scanKeyLoad0X32( ) ;
   }

   public void scanKeyLoad0X32( )
   {
      sMode32 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A24TBM25_LIST_CD = BC000X11_A24TBM25_LIST_CD[0] ;
         A554TBM25_CRT_DATETIME = BC000X11_A554TBM25_CRT_DATETIME[0] ;
         n554TBM25_CRT_DATETIME = BC000X11_n554TBM25_CRT_DATETIME[0] ;
         A555TBM25_CRT_USER_ID = BC000X11_A555TBM25_CRT_USER_ID[0] ;
         n555TBM25_CRT_USER_ID = BC000X11_n555TBM25_CRT_USER_ID[0] ;
         A557TBM25_UPD_DATETIME = BC000X11_A557TBM25_UPD_DATETIME[0] ;
         n557TBM25_UPD_DATETIME = BC000X11_n557TBM25_UPD_DATETIME[0] ;
         A558TBM25_UPD_USER_ID = BC000X11_A558TBM25_UPD_USER_ID[0] ;
         n558TBM25_UPD_USER_ID = BC000X11_n558TBM25_UPD_USER_ID[0] ;
         A560TBM25_UPD_CNT = BC000X11_A560TBM25_UPD_CNT[0] ;
         n560TBM25_UPD_CNT = BC000X11_n560TBM25_UPD_CNT[0] ;
         A552TBM25_LIST_NM = BC000X11_A552TBM25_LIST_NM[0] ;
         n552TBM25_LIST_NM = BC000X11_n552TBM25_LIST_NM[0] ;
         A553TBM25_DEL_FLG = BC000X11_A553TBM25_DEL_FLG[0] ;
         n553TBM25_DEL_FLG = BC000X11_n553TBM25_DEL_FLG[0] ;
         A556TBM25_CRT_PROG_NM = BC000X11_A556TBM25_CRT_PROG_NM[0] ;
         n556TBM25_CRT_PROG_NM = BC000X11_n556TBM25_CRT_PROG_NM[0] ;
         A559TBM25_UPD_PROG_NM = BC000X11_A559TBM25_UPD_PROG_NM[0] ;
         n559TBM25_UPD_PROG_NM = BC000X11_n559TBM25_UPD_PROG_NM[0] ;
         A23TBM25_STUDY_ID = BC000X11_A23TBM25_STUDY_ID[0] ;
      }
      Gx_mode = sMode32 ;
   }

   public void scanKeyEnd0X32( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0X32( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0X32( )
   {
      /* Before Insert Rules */
      A554TBM25_CRT_DATETIME = GXutil.now( ) ;
      n554TBM25_CRT_DATETIME = false ;
      GXt_char1 = A555TBM25_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm25_sel_list_bc.this.GXt_char1 = GXv_char2[0] ;
      A555TBM25_CRT_USER_ID = GXt_char1 ;
      n555TBM25_CRT_USER_ID = false ;
      A557TBM25_UPD_DATETIME = GXutil.now( ) ;
      n557TBM25_UPD_DATETIME = false ;
      GXt_char1 = A558TBM25_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm25_sel_list_bc.this.GXt_char1 = GXv_char2[0] ;
      A558TBM25_UPD_USER_ID = GXt_char1 ;
      n558TBM25_UPD_USER_ID = false ;
      A560TBM25_UPD_CNT = (long)(O560TBM25_UPD_CNT+1) ;
      n560TBM25_UPD_CNT = false ;
   }

   public void beforeUpdate0X32( )
   {
      /* Before Update Rules */
      A557TBM25_UPD_DATETIME = GXutil.now( ) ;
      n557TBM25_UPD_DATETIME = false ;
      GXt_char1 = A558TBM25_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm25_sel_list_bc.this.GXt_char1 = GXv_char2[0] ;
      A558TBM25_UPD_USER_ID = GXt_char1 ;
      n558TBM25_UPD_USER_ID = false ;
      A560TBM25_UPD_CNT = (long)(O560TBM25_UPD_CNT+1) ;
      n560TBM25_UPD_CNT = false ;
   }

   public void beforeDelete0X32( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0X32( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0X32( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0X32( )
   {
   }

   public void addRow0X32( )
   {
      VarsToRow32( bcTBM25_SEL_LIST) ;
   }

   public void readRow0X32( )
   {
      RowToVars32( bcTBM25_SEL_LIST, 1) ;
   }

   public void initializeNonKey0X32( )
   {
      A554TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n554TBM25_CRT_DATETIME = false ;
      A555TBM25_CRT_USER_ID = "" ;
      n555TBM25_CRT_USER_ID = false ;
      A557TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n557TBM25_UPD_DATETIME = false ;
      A558TBM25_UPD_USER_ID = "" ;
      n558TBM25_UPD_USER_ID = false ;
      A560TBM25_UPD_CNT = 0 ;
      n560TBM25_UPD_CNT = false ;
      A552TBM25_LIST_NM = "" ;
      n552TBM25_LIST_NM = false ;
      A553TBM25_DEL_FLG = "" ;
      n553TBM25_DEL_FLG = false ;
      A556TBM25_CRT_PROG_NM = "" ;
      n556TBM25_CRT_PROG_NM = false ;
      A559TBM25_UPD_PROG_NM = "" ;
      n559TBM25_UPD_PROG_NM = false ;
      O560TBM25_UPD_CNT = A560TBM25_UPD_CNT ;
      n560TBM25_UPD_CNT = false ;
   }

   public void initAll0X32( )
   {
      A23TBM25_STUDY_ID = 0 ;
      A24TBM25_LIST_CD = "" ;
      initializeNonKey0X32( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow32( SdtTBM25_SEL_LIST obj32 )
   {
      obj32.setgxTv_SdtTBM25_SEL_LIST_Mode( Gx_mode );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_datetime( A554TBM25_CRT_DATETIME );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_user_id( A555TBM25_CRT_USER_ID );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_datetime( A557TBM25_UPD_DATETIME );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_user_id( A558TBM25_UPD_USER_ID );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_cnt( A560TBM25_UPD_CNT );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_list_nm( A552TBM25_LIST_NM );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_del_flg( A553TBM25_DEL_FLG );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_prog_nm( A556TBM25_CRT_PROG_NM );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_prog_nm( A559TBM25_UPD_PROG_NM );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_study_id( A23TBM25_STUDY_ID );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_list_cd( A24TBM25_LIST_CD );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_study_id_Z( Z23TBM25_STUDY_ID );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_list_cd_Z( Z24TBM25_LIST_CD );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_list_nm_Z( Z552TBM25_LIST_NM );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_del_flg_Z( Z553TBM25_DEL_FLG );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_datetime_Z( Z554TBM25_CRT_DATETIME );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_user_id_Z( Z555TBM25_CRT_USER_ID );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_prog_nm_Z( Z556TBM25_CRT_PROG_NM );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_datetime_Z( Z557TBM25_UPD_DATETIME );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_user_id_Z( Z558TBM25_UPD_USER_ID );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_prog_nm_Z( Z559TBM25_UPD_PROG_NM );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_cnt_Z( Z560TBM25_UPD_CNT );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_list_nm_N( (byte)((byte)((n552TBM25_LIST_NM)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_del_flg_N( (byte)((byte)((n553TBM25_DEL_FLG)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_datetime_N( (byte)((byte)((n554TBM25_CRT_DATETIME)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_user_id_N( (byte)((byte)((n555TBM25_CRT_USER_ID)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_prog_nm_N( (byte)((byte)((n556TBM25_CRT_PROG_NM)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_datetime_N( (byte)((byte)((n557TBM25_UPD_DATETIME)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_user_id_N( (byte)((byte)((n558TBM25_UPD_USER_ID)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_prog_nm_N( (byte)((byte)((n559TBM25_UPD_PROG_NM)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_cnt_N( (byte)((byte)((n560TBM25_UPD_CNT)?1:0)) );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Mode( Gx_mode );
   }

   public void KeyVarsToRow32( SdtTBM25_SEL_LIST obj32 )
   {
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_study_id( A23TBM25_STUDY_ID );
      obj32.setgxTv_SdtTBM25_SEL_LIST_Tbm25_list_cd( A24TBM25_LIST_CD );
   }

   public void RowToVars32( SdtTBM25_SEL_LIST obj32 ,
                            int forceLoad )
   {
      Gx_mode = obj32.getgxTv_SdtTBM25_SEL_LIST_Mode() ;
      A554TBM25_CRT_DATETIME = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_datetime() ;
      n554TBM25_CRT_DATETIME = false ;
      A555TBM25_CRT_USER_ID = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_user_id() ;
      n555TBM25_CRT_USER_ID = false ;
      A557TBM25_UPD_DATETIME = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_datetime() ;
      n557TBM25_UPD_DATETIME = false ;
      A558TBM25_UPD_USER_ID = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_user_id() ;
      n558TBM25_UPD_USER_ID = false ;
      A560TBM25_UPD_CNT = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_cnt() ;
      n560TBM25_UPD_CNT = false ;
      A552TBM25_LIST_NM = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_list_nm() ;
      n552TBM25_LIST_NM = false ;
      A553TBM25_DEL_FLG = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_del_flg() ;
      n553TBM25_DEL_FLG = false ;
      A556TBM25_CRT_PROG_NM = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_prog_nm() ;
      n556TBM25_CRT_PROG_NM = false ;
      A559TBM25_UPD_PROG_NM = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_prog_nm() ;
      n559TBM25_UPD_PROG_NM = false ;
      A23TBM25_STUDY_ID = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_study_id() ;
      A24TBM25_LIST_CD = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_list_cd() ;
      Z23TBM25_STUDY_ID = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_study_id_Z() ;
      Z24TBM25_LIST_CD = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_list_cd_Z() ;
      Z552TBM25_LIST_NM = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_list_nm_Z() ;
      Z553TBM25_DEL_FLG = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_del_flg_Z() ;
      Z554TBM25_CRT_DATETIME = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_datetime_Z() ;
      Z555TBM25_CRT_USER_ID = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_user_id_Z() ;
      Z556TBM25_CRT_PROG_NM = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_prog_nm_Z() ;
      Z557TBM25_UPD_DATETIME = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_datetime_Z() ;
      Z558TBM25_UPD_USER_ID = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_user_id_Z() ;
      Z559TBM25_UPD_PROG_NM = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_prog_nm_Z() ;
      Z560TBM25_UPD_CNT = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_cnt_Z() ;
      O560TBM25_UPD_CNT = obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_cnt_Z() ;
      n552TBM25_LIST_NM = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_list_nm_N()==0)?false:true) ;
      n553TBM25_DEL_FLG = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_del_flg_N()==0)?false:true) ;
      n554TBM25_CRT_DATETIME = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_datetime_N()==0)?false:true) ;
      n555TBM25_CRT_USER_ID = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_user_id_N()==0)?false:true) ;
      n556TBM25_CRT_PROG_NM = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_crt_prog_nm_N()==0)?false:true) ;
      n557TBM25_UPD_DATETIME = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_datetime_N()==0)?false:true) ;
      n558TBM25_UPD_USER_ID = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_user_id_N()==0)?false:true) ;
      n559TBM25_UPD_PROG_NM = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_prog_nm_N()==0)?false:true) ;
      n560TBM25_UPD_CNT = (boolean)((obj32.getgxTv_SdtTBM25_SEL_LIST_Tbm25_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj32.getgxTv_SdtTBM25_SEL_LIST_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A23TBM25_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A24TBM25_LIST_CD = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0X32( ) ;
      scanKeyStart0X32( ) ;
      if ( RcdFound32 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000X4 */
         pr_default.execute(2, new Object[] {new Long(A23TBM25_STUDY_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'選択リストマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM25_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z23TBM25_STUDY_ID = A23TBM25_STUDY_ID ;
         Z24TBM25_LIST_CD = A24TBM25_LIST_CD ;
         O560TBM25_UPD_CNT = A560TBM25_UPD_CNT ;
         n560TBM25_UPD_CNT = false ;
      }
      zm0X32( -8) ;
      onLoadActions0X32( ) ;
      addRow0X32( ) ;
      scanKeyEnd0X32( ) ;
      if ( RcdFound32 == 0 )
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
      RowToVars32( bcTBM25_SEL_LIST, 0) ;
      scanKeyStart0X32( ) ;
      if ( RcdFound32 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000X4 */
         pr_default.execute(2, new Object[] {new Long(A23TBM25_STUDY_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'選択リストマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM25_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z23TBM25_STUDY_ID = A23TBM25_STUDY_ID ;
         Z24TBM25_LIST_CD = A24TBM25_LIST_CD ;
         O560TBM25_UPD_CNT = A560TBM25_UPD_CNT ;
         n560TBM25_UPD_CNT = false ;
      }
      zm0X32( -8) ;
      onLoadActions0X32( ) ;
      addRow0X32( ) ;
      scanKeyEnd0X32( ) ;
      if ( RcdFound32 == 0 )
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
      RowToVars32( bcTBM25_SEL_LIST, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0X32( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0X32( ) ;
      }
      else
      {
         if ( RcdFound32 == 1 )
         {
            if ( ( A23TBM25_STUDY_ID != Z23TBM25_STUDY_ID ) || ( GXutil.strcmp(A24TBM25_LIST_CD, Z24TBM25_LIST_CD) != 0 ) )
            {
               A23TBM25_STUDY_ID = Z23TBM25_STUDY_ID ;
               A24TBM25_LIST_CD = Z24TBM25_LIST_CD ;
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
               update0X32( ) ;
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
               if ( ( A23TBM25_STUDY_ID != Z23TBM25_STUDY_ID ) || ( GXutil.strcmp(A24TBM25_LIST_CD, Z24TBM25_LIST_CD) != 0 ) )
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
                     insert0X32( ) ;
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
                     insert0X32( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow32( bcTBM25_SEL_LIST) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars32( bcTBM25_SEL_LIST, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0X32( ) ;
      if ( RcdFound32 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A23TBM25_STUDY_ID != Z23TBM25_STUDY_ID ) || ( GXutil.strcmp(A24TBM25_LIST_CD, Z24TBM25_LIST_CD) != 0 ) )
         {
            A23TBM25_STUDY_ID = Z23TBM25_STUDY_ID ;
            A24TBM25_LIST_CD = Z24TBM25_LIST_CD ;
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
         if ( ( A23TBM25_STUDY_ID != Z23TBM25_STUDY_ID ) || ( GXutil.strcmp(A24TBM25_LIST_CD, Z24TBM25_LIST_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm25_sel_list_bc");
      VarsToRow32( bcTBM25_SEL_LIST) ;
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
      Gx_mode = bcTBM25_SEL_LIST.getgxTv_SdtTBM25_SEL_LIST_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM25_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM25_SEL_LIST sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM25_SEL_LIST )
      {
         bcTBM25_SEL_LIST = sdt ;
         if ( GXutil.strcmp(bcTBM25_SEL_LIST.getgxTv_SdtTBM25_SEL_LIST_Mode(), "") == 0 )
         {
            bcTBM25_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow32( bcTBM25_SEL_LIST) ;
         }
         else
         {
            RowToVars32( bcTBM25_SEL_LIST, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM25_SEL_LIST.getgxTv_SdtTBM25_SEL_LIST_Mode(), "") == 0 )
         {
            bcTBM25_SEL_LIST.setgxTv_SdtTBM25_SEL_LIST_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars32( bcTBM25_SEL_LIST, 1) ;
   }

   public SdtTBM25_SEL_LIST getTBM25_SEL_LIST_BC( )
   {
      return bcTBM25_SEL_LIST ;
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
      Z24TBM25_LIST_CD = "" ;
      A24TBM25_LIST_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A552TBM25_LIST_NM = "" ;
      A553TBM25_DEL_FLG = "" ;
      A554TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A555TBM25_CRT_USER_ID = "" ;
      A556TBM25_CRT_PROG_NM = "" ;
      A557TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A558TBM25_UPD_USER_ID = "" ;
      A559TBM25_UPD_PROG_NM = "" ;
      Z554TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z555TBM25_CRT_USER_ID = "" ;
      Z557TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z558TBM25_UPD_USER_ID = "" ;
      Z552TBM25_LIST_NM = "" ;
      Z553TBM25_DEL_FLG = "" ;
      Z556TBM25_CRT_PROG_NM = "" ;
      Z559TBM25_UPD_PROG_NM = "" ;
      BC000X5_A24TBM25_LIST_CD = new String[] {""} ;
      BC000X5_A554TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000X5_n554TBM25_CRT_DATETIME = new boolean[] {false} ;
      BC000X5_A555TBM25_CRT_USER_ID = new String[] {""} ;
      BC000X5_n555TBM25_CRT_USER_ID = new boolean[] {false} ;
      BC000X5_A557TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000X5_n557TBM25_UPD_DATETIME = new boolean[] {false} ;
      BC000X5_A558TBM25_UPD_USER_ID = new String[] {""} ;
      BC000X5_n558TBM25_UPD_USER_ID = new boolean[] {false} ;
      BC000X5_A560TBM25_UPD_CNT = new long[1] ;
      BC000X5_n560TBM25_UPD_CNT = new boolean[] {false} ;
      BC000X5_A552TBM25_LIST_NM = new String[] {""} ;
      BC000X5_n552TBM25_LIST_NM = new boolean[] {false} ;
      BC000X5_A553TBM25_DEL_FLG = new String[] {""} ;
      BC000X5_n553TBM25_DEL_FLG = new boolean[] {false} ;
      BC000X5_A556TBM25_CRT_PROG_NM = new String[] {""} ;
      BC000X5_n556TBM25_CRT_PROG_NM = new boolean[] {false} ;
      BC000X5_A559TBM25_UPD_PROG_NM = new String[] {""} ;
      BC000X5_n559TBM25_UPD_PROG_NM = new boolean[] {false} ;
      BC000X5_A23TBM25_STUDY_ID = new long[1] ;
      BC000X4_A23TBM25_STUDY_ID = new long[1] ;
      BC000X6_A23TBM25_STUDY_ID = new long[1] ;
      BC000X6_A24TBM25_LIST_CD = new String[] {""} ;
      BC000X3_A24TBM25_LIST_CD = new String[] {""} ;
      BC000X3_A554TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000X3_n554TBM25_CRT_DATETIME = new boolean[] {false} ;
      BC000X3_A555TBM25_CRT_USER_ID = new String[] {""} ;
      BC000X3_n555TBM25_CRT_USER_ID = new boolean[] {false} ;
      BC000X3_A557TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000X3_n557TBM25_UPD_DATETIME = new boolean[] {false} ;
      BC000X3_A558TBM25_UPD_USER_ID = new String[] {""} ;
      BC000X3_n558TBM25_UPD_USER_ID = new boolean[] {false} ;
      BC000X3_A560TBM25_UPD_CNT = new long[1] ;
      BC000X3_n560TBM25_UPD_CNT = new boolean[] {false} ;
      BC000X3_A552TBM25_LIST_NM = new String[] {""} ;
      BC000X3_n552TBM25_LIST_NM = new boolean[] {false} ;
      BC000X3_A553TBM25_DEL_FLG = new String[] {""} ;
      BC000X3_n553TBM25_DEL_FLG = new boolean[] {false} ;
      BC000X3_A556TBM25_CRT_PROG_NM = new String[] {""} ;
      BC000X3_n556TBM25_CRT_PROG_NM = new boolean[] {false} ;
      BC000X3_A559TBM25_UPD_PROG_NM = new String[] {""} ;
      BC000X3_n559TBM25_UPD_PROG_NM = new boolean[] {false} ;
      BC000X3_A23TBM25_STUDY_ID = new long[1] ;
      sMode32 = "" ;
      BC000X2_A24TBM25_LIST_CD = new String[] {""} ;
      BC000X2_A554TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000X2_n554TBM25_CRT_DATETIME = new boolean[] {false} ;
      BC000X2_A555TBM25_CRT_USER_ID = new String[] {""} ;
      BC000X2_n555TBM25_CRT_USER_ID = new boolean[] {false} ;
      BC000X2_A557TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000X2_n557TBM25_UPD_DATETIME = new boolean[] {false} ;
      BC000X2_A558TBM25_UPD_USER_ID = new String[] {""} ;
      BC000X2_n558TBM25_UPD_USER_ID = new boolean[] {false} ;
      BC000X2_A560TBM25_UPD_CNT = new long[1] ;
      BC000X2_n560TBM25_UPD_CNT = new boolean[] {false} ;
      BC000X2_A552TBM25_LIST_NM = new String[] {""} ;
      BC000X2_n552TBM25_LIST_NM = new boolean[] {false} ;
      BC000X2_A553TBM25_DEL_FLG = new String[] {""} ;
      BC000X2_n553TBM25_DEL_FLG = new boolean[] {false} ;
      BC000X2_A556TBM25_CRT_PROG_NM = new String[] {""} ;
      BC000X2_n556TBM25_CRT_PROG_NM = new boolean[] {false} ;
      BC000X2_A559TBM25_UPD_PROG_NM = new String[] {""} ;
      BC000X2_n559TBM25_UPD_PROG_NM = new boolean[] {false} ;
      BC000X2_A23TBM25_STUDY_ID = new long[1] ;
      BC000X10_A25TBM26_STUDY_ID = new long[1] ;
      BC000X10_A26TBM26_LIST_CD = new String[] {""} ;
      BC000X10_A27TBM26_LIST_ITEM_NO = new short[1] ;
      BC000X11_A24TBM25_LIST_CD = new String[] {""} ;
      BC000X11_A554TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000X11_n554TBM25_CRT_DATETIME = new boolean[] {false} ;
      BC000X11_A555TBM25_CRT_USER_ID = new String[] {""} ;
      BC000X11_n555TBM25_CRT_USER_ID = new boolean[] {false} ;
      BC000X11_A557TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000X11_n557TBM25_UPD_DATETIME = new boolean[] {false} ;
      BC000X11_A558TBM25_UPD_USER_ID = new String[] {""} ;
      BC000X11_n558TBM25_UPD_USER_ID = new boolean[] {false} ;
      BC000X11_A560TBM25_UPD_CNT = new long[1] ;
      BC000X11_n560TBM25_UPD_CNT = new boolean[] {false} ;
      BC000X11_A552TBM25_LIST_NM = new String[] {""} ;
      BC000X11_n552TBM25_LIST_NM = new boolean[] {false} ;
      BC000X11_A553TBM25_DEL_FLG = new String[] {""} ;
      BC000X11_n553TBM25_DEL_FLG = new boolean[] {false} ;
      BC000X11_A556TBM25_CRT_PROG_NM = new String[] {""} ;
      BC000X11_n556TBM25_CRT_PROG_NM = new boolean[] {false} ;
      BC000X11_A559TBM25_UPD_PROG_NM = new String[] {""} ;
      BC000X11_n559TBM25_UPD_PROG_NM = new boolean[] {false} ;
      BC000X11_A23TBM25_STUDY_ID = new long[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm25_sel_list_bc__default(),
         new Object[] {
             new Object[] {
            BC000X2_A24TBM25_LIST_CD, BC000X2_A554TBM25_CRT_DATETIME, BC000X2_n554TBM25_CRT_DATETIME, BC000X2_A555TBM25_CRT_USER_ID, BC000X2_n555TBM25_CRT_USER_ID, BC000X2_A557TBM25_UPD_DATETIME, BC000X2_n557TBM25_UPD_DATETIME, BC000X2_A558TBM25_UPD_USER_ID, BC000X2_n558TBM25_UPD_USER_ID, BC000X2_A560TBM25_UPD_CNT,
            BC000X2_n560TBM25_UPD_CNT, BC000X2_A552TBM25_LIST_NM, BC000X2_n552TBM25_LIST_NM, BC000X2_A553TBM25_DEL_FLG, BC000X2_n553TBM25_DEL_FLG, BC000X2_A556TBM25_CRT_PROG_NM, BC000X2_n556TBM25_CRT_PROG_NM, BC000X2_A559TBM25_UPD_PROG_NM, BC000X2_n559TBM25_UPD_PROG_NM, BC000X2_A23TBM25_STUDY_ID
            }
            , new Object[] {
            BC000X3_A24TBM25_LIST_CD, BC000X3_A554TBM25_CRT_DATETIME, BC000X3_n554TBM25_CRT_DATETIME, BC000X3_A555TBM25_CRT_USER_ID, BC000X3_n555TBM25_CRT_USER_ID, BC000X3_A557TBM25_UPD_DATETIME, BC000X3_n557TBM25_UPD_DATETIME, BC000X3_A558TBM25_UPD_USER_ID, BC000X3_n558TBM25_UPD_USER_ID, BC000X3_A560TBM25_UPD_CNT,
            BC000X3_n560TBM25_UPD_CNT, BC000X3_A552TBM25_LIST_NM, BC000X3_n552TBM25_LIST_NM, BC000X3_A553TBM25_DEL_FLG, BC000X3_n553TBM25_DEL_FLG, BC000X3_A556TBM25_CRT_PROG_NM, BC000X3_n556TBM25_CRT_PROG_NM, BC000X3_A559TBM25_UPD_PROG_NM, BC000X3_n559TBM25_UPD_PROG_NM, BC000X3_A23TBM25_STUDY_ID
            }
            , new Object[] {
            BC000X4_A23TBM25_STUDY_ID
            }
            , new Object[] {
            BC000X5_A24TBM25_LIST_CD, BC000X5_A554TBM25_CRT_DATETIME, BC000X5_n554TBM25_CRT_DATETIME, BC000X5_A555TBM25_CRT_USER_ID, BC000X5_n555TBM25_CRT_USER_ID, BC000X5_A557TBM25_UPD_DATETIME, BC000X5_n557TBM25_UPD_DATETIME, BC000X5_A558TBM25_UPD_USER_ID, BC000X5_n558TBM25_UPD_USER_ID, BC000X5_A560TBM25_UPD_CNT,
            BC000X5_n560TBM25_UPD_CNT, BC000X5_A552TBM25_LIST_NM, BC000X5_n552TBM25_LIST_NM, BC000X5_A553TBM25_DEL_FLG, BC000X5_n553TBM25_DEL_FLG, BC000X5_A556TBM25_CRT_PROG_NM, BC000X5_n556TBM25_CRT_PROG_NM, BC000X5_A559TBM25_UPD_PROG_NM, BC000X5_n559TBM25_UPD_PROG_NM, BC000X5_A23TBM25_STUDY_ID
            }
            , new Object[] {
            BC000X6_A23TBM25_STUDY_ID, BC000X6_A24TBM25_LIST_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000X10_A25TBM26_STUDY_ID, BC000X10_A26TBM26_LIST_CD, BC000X10_A27TBM26_LIST_ITEM_NO
            }
            , new Object[] {
            BC000X11_A24TBM25_LIST_CD, BC000X11_A554TBM25_CRT_DATETIME, BC000X11_n554TBM25_CRT_DATETIME, BC000X11_A555TBM25_CRT_USER_ID, BC000X11_n555TBM25_CRT_USER_ID, BC000X11_A557TBM25_UPD_DATETIME, BC000X11_n557TBM25_UPD_DATETIME, BC000X11_A558TBM25_UPD_USER_ID, BC000X11_n558TBM25_UPD_USER_ID, BC000X11_A560TBM25_UPD_CNT,
            BC000X11_n560TBM25_UPD_CNT, BC000X11_A552TBM25_LIST_NM, BC000X11_n552TBM25_LIST_NM, BC000X11_A553TBM25_DEL_FLG, BC000X11_n553TBM25_DEL_FLG, BC000X11_A556TBM25_CRT_PROG_NM, BC000X11_n556TBM25_CRT_PROG_NM, BC000X11_A559TBM25_UPD_PROG_NM, BC000X11_n559TBM25_UPD_PROG_NM, BC000X11_A23TBM25_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM25_SEL_LIST_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110X2 */
      e110X2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound32 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z23TBM25_STUDY_ID ;
   private long A23TBM25_STUDY_ID ;
   private long A560TBM25_UPD_CNT ;
   private long Z560TBM25_UPD_CNT ;
   private long O560TBM25_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode32 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A554TBM25_CRT_DATETIME ;
   private java.util.Date A557TBM25_UPD_DATETIME ;
   private java.util.Date Z554TBM25_CRT_DATETIME ;
   private java.util.Date Z557TBM25_UPD_DATETIME ;
   private boolean n554TBM25_CRT_DATETIME ;
   private boolean n555TBM25_CRT_USER_ID ;
   private boolean n557TBM25_UPD_DATETIME ;
   private boolean n558TBM25_UPD_USER_ID ;
   private boolean n560TBM25_UPD_CNT ;
   private boolean n552TBM25_LIST_NM ;
   private boolean n553TBM25_DEL_FLG ;
   private boolean n556TBM25_CRT_PROG_NM ;
   private boolean n559TBM25_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z24TBM25_LIST_CD ;
   private String A24TBM25_LIST_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A552TBM25_LIST_NM ;
   private String A553TBM25_DEL_FLG ;
   private String A555TBM25_CRT_USER_ID ;
   private String A556TBM25_CRT_PROG_NM ;
   private String A558TBM25_UPD_USER_ID ;
   private String A559TBM25_UPD_PROG_NM ;
   private String Z555TBM25_CRT_USER_ID ;
   private String Z558TBM25_UPD_USER_ID ;
   private String Z552TBM25_LIST_NM ;
   private String Z553TBM25_DEL_FLG ;
   private String Z556TBM25_CRT_PROG_NM ;
   private String Z559TBM25_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM25_SEL_LIST bcTBM25_SEL_LIST ;
   private IDataStoreProvider pr_default ;
   private String[] BC000X5_A24TBM25_LIST_CD ;
   private java.util.Date[] BC000X5_A554TBM25_CRT_DATETIME ;
   private boolean[] BC000X5_n554TBM25_CRT_DATETIME ;
   private String[] BC000X5_A555TBM25_CRT_USER_ID ;
   private boolean[] BC000X5_n555TBM25_CRT_USER_ID ;
   private java.util.Date[] BC000X5_A557TBM25_UPD_DATETIME ;
   private boolean[] BC000X5_n557TBM25_UPD_DATETIME ;
   private String[] BC000X5_A558TBM25_UPD_USER_ID ;
   private boolean[] BC000X5_n558TBM25_UPD_USER_ID ;
   private long[] BC000X5_A560TBM25_UPD_CNT ;
   private boolean[] BC000X5_n560TBM25_UPD_CNT ;
   private String[] BC000X5_A552TBM25_LIST_NM ;
   private boolean[] BC000X5_n552TBM25_LIST_NM ;
   private String[] BC000X5_A553TBM25_DEL_FLG ;
   private boolean[] BC000X5_n553TBM25_DEL_FLG ;
   private String[] BC000X5_A556TBM25_CRT_PROG_NM ;
   private boolean[] BC000X5_n556TBM25_CRT_PROG_NM ;
   private String[] BC000X5_A559TBM25_UPD_PROG_NM ;
   private boolean[] BC000X5_n559TBM25_UPD_PROG_NM ;
   private long[] BC000X5_A23TBM25_STUDY_ID ;
   private long[] BC000X4_A23TBM25_STUDY_ID ;
   private long[] BC000X6_A23TBM25_STUDY_ID ;
   private String[] BC000X6_A24TBM25_LIST_CD ;
   private String[] BC000X3_A24TBM25_LIST_CD ;
   private java.util.Date[] BC000X3_A554TBM25_CRT_DATETIME ;
   private boolean[] BC000X3_n554TBM25_CRT_DATETIME ;
   private String[] BC000X3_A555TBM25_CRT_USER_ID ;
   private boolean[] BC000X3_n555TBM25_CRT_USER_ID ;
   private java.util.Date[] BC000X3_A557TBM25_UPD_DATETIME ;
   private boolean[] BC000X3_n557TBM25_UPD_DATETIME ;
   private String[] BC000X3_A558TBM25_UPD_USER_ID ;
   private boolean[] BC000X3_n558TBM25_UPD_USER_ID ;
   private long[] BC000X3_A560TBM25_UPD_CNT ;
   private boolean[] BC000X3_n560TBM25_UPD_CNT ;
   private String[] BC000X3_A552TBM25_LIST_NM ;
   private boolean[] BC000X3_n552TBM25_LIST_NM ;
   private String[] BC000X3_A553TBM25_DEL_FLG ;
   private boolean[] BC000X3_n553TBM25_DEL_FLG ;
   private String[] BC000X3_A556TBM25_CRT_PROG_NM ;
   private boolean[] BC000X3_n556TBM25_CRT_PROG_NM ;
   private String[] BC000X3_A559TBM25_UPD_PROG_NM ;
   private boolean[] BC000X3_n559TBM25_UPD_PROG_NM ;
   private long[] BC000X3_A23TBM25_STUDY_ID ;
   private String[] BC000X2_A24TBM25_LIST_CD ;
   private java.util.Date[] BC000X2_A554TBM25_CRT_DATETIME ;
   private boolean[] BC000X2_n554TBM25_CRT_DATETIME ;
   private String[] BC000X2_A555TBM25_CRT_USER_ID ;
   private boolean[] BC000X2_n555TBM25_CRT_USER_ID ;
   private java.util.Date[] BC000X2_A557TBM25_UPD_DATETIME ;
   private boolean[] BC000X2_n557TBM25_UPD_DATETIME ;
   private String[] BC000X2_A558TBM25_UPD_USER_ID ;
   private boolean[] BC000X2_n558TBM25_UPD_USER_ID ;
   private long[] BC000X2_A560TBM25_UPD_CNT ;
   private boolean[] BC000X2_n560TBM25_UPD_CNT ;
   private String[] BC000X2_A552TBM25_LIST_NM ;
   private boolean[] BC000X2_n552TBM25_LIST_NM ;
   private String[] BC000X2_A553TBM25_DEL_FLG ;
   private boolean[] BC000X2_n553TBM25_DEL_FLG ;
   private String[] BC000X2_A556TBM25_CRT_PROG_NM ;
   private boolean[] BC000X2_n556TBM25_CRT_PROG_NM ;
   private String[] BC000X2_A559TBM25_UPD_PROG_NM ;
   private boolean[] BC000X2_n559TBM25_UPD_PROG_NM ;
   private long[] BC000X2_A23TBM25_STUDY_ID ;
   private long[] BC000X10_A25TBM26_STUDY_ID ;
   private String[] BC000X10_A26TBM26_LIST_CD ;
   private short[] BC000X10_A27TBM26_LIST_ITEM_NO ;
   private String[] BC000X11_A24TBM25_LIST_CD ;
   private java.util.Date[] BC000X11_A554TBM25_CRT_DATETIME ;
   private boolean[] BC000X11_n554TBM25_CRT_DATETIME ;
   private String[] BC000X11_A555TBM25_CRT_USER_ID ;
   private boolean[] BC000X11_n555TBM25_CRT_USER_ID ;
   private java.util.Date[] BC000X11_A557TBM25_UPD_DATETIME ;
   private boolean[] BC000X11_n557TBM25_UPD_DATETIME ;
   private String[] BC000X11_A558TBM25_UPD_USER_ID ;
   private boolean[] BC000X11_n558TBM25_UPD_USER_ID ;
   private long[] BC000X11_A560TBM25_UPD_CNT ;
   private boolean[] BC000X11_n560TBM25_UPD_CNT ;
   private String[] BC000X11_A552TBM25_LIST_NM ;
   private boolean[] BC000X11_n552TBM25_LIST_NM ;
   private String[] BC000X11_A553TBM25_DEL_FLG ;
   private boolean[] BC000X11_n553TBM25_DEL_FLG ;
   private String[] BC000X11_A556TBM25_CRT_PROG_NM ;
   private boolean[] BC000X11_n556TBM25_CRT_PROG_NM ;
   private String[] BC000X11_A559TBM25_UPD_PROG_NM ;
   private boolean[] BC000X11_n559TBM25_UPD_PROG_NM ;
   private long[] BC000X11_A23TBM25_STUDY_ID ;
}

final  class tbm25_sel_list_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000X2", "SELECT `TBM25_LIST_CD`, `TBM25_CRT_DATETIME`, `TBM25_CRT_USER_ID`, `TBM25_UPD_DATETIME`, `TBM25_UPD_USER_ID`, `TBM25_UPD_CNT`, `TBM25_LIST_NM`, `TBM25_DEL_FLG`, `TBM25_CRT_PROG_NM`, `TBM25_UPD_PROG_NM`, `TBM25_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000X3", "SELECT `TBM25_LIST_CD`, `TBM25_CRT_DATETIME`, `TBM25_CRT_USER_ID`, `TBM25_UPD_DATETIME`, `TBM25_UPD_USER_ID`, `TBM25_UPD_CNT`, `TBM25_LIST_NM`, `TBM25_DEL_FLG`, `TBM25_CRT_PROG_NM`, `TBM25_UPD_PROG_NM`, `TBM25_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000X4", "SELECT `TBM21_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000X5", "SELECT TM1.`TBM25_LIST_CD`, TM1.`TBM25_CRT_DATETIME`, TM1.`TBM25_CRT_USER_ID`, TM1.`TBM25_UPD_DATETIME`, TM1.`TBM25_UPD_USER_ID`, TM1.`TBM25_UPD_CNT`, TM1.`TBM25_LIST_NM`, TM1.`TBM25_DEL_FLG`, TM1.`TBM25_CRT_PROG_NM`, TM1.`TBM25_UPD_PROG_NM`, TM1.`TBM25_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM25_SEL_LIST` TM1 WHERE TM1.`TBM25_STUDY_ID` = ? and TM1.`TBM25_LIST_CD` = ? ORDER BY TM1.`TBM25_STUDY_ID`, TM1.`TBM25_LIST_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000X6", "SELECT `TBM25_STUDY_ID` AS TBM25_STUDY_ID, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000X7", "INSERT INTO `TBM25_SEL_LIST`(`TBM25_LIST_CD`, `TBM25_CRT_DATETIME`, `TBM25_CRT_USER_ID`, `TBM25_UPD_DATETIME`, `TBM25_UPD_USER_ID`, `TBM25_UPD_CNT`, `TBM25_LIST_NM`, `TBM25_DEL_FLG`, `TBM25_CRT_PROG_NM`, `TBM25_UPD_PROG_NM`, `TBM25_STUDY_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000X8", "UPDATE `TBM25_SEL_LIST` SET `TBM25_CRT_DATETIME`=?, `TBM25_CRT_USER_ID`=?, `TBM25_UPD_DATETIME`=?, `TBM25_UPD_USER_ID`=?, `TBM25_UPD_CNT`=?, `TBM25_LIST_NM`=?, `TBM25_DEL_FLG`=?, `TBM25_CRT_PROG_NM`=?, `TBM25_UPD_PROG_NM`=?  WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000X9", "DELETE FROM `TBM25_SEL_LIST`  WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000X10", "SELECT `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000X11", "SELECT TM1.`TBM25_LIST_CD`, TM1.`TBM25_CRT_DATETIME`, TM1.`TBM25_CRT_USER_ID`, TM1.`TBM25_UPD_DATETIME`, TM1.`TBM25_UPD_USER_ID`, TM1.`TBM25_UPD_CNT`, TM1.`TBM25_LIST_NM`, TM1.`TBM25_DEL_FLG`, TM1.`TBM25_CRT_PROG_NM`, TM1.`TBM25_UPD_PROG_NM`, TM1.`TBM25_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM25_SEL_LIST` TM1 WHERE TM1.`TBM25_STUDY_ID` = ? and TM1.`TBM25_LIST_CD` = ? ORDER BY TM1.`TBM25_STUDY_ID`, TM1.`TBM25_LIST_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
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
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 50);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               stmt.setLong(11, ((Number) parms[19]).longValue());
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 50);
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
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               stmt.setLong(10, ((Number) parms[18]).longValue());
               stmt.setVarchar(11, (String)parms[19], 20, false);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               return;
      }
   }

}

