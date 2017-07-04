/*
               File: tbt16_import_history_bc
        Description: 選択一覧取込履歴テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:22.43
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt16_import_history_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt16_import_history_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt16_import_history_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt16_import_history_bc.class ));
   }

   public tbt16_import_history_bc( int remoteHandle ,
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
         /* Execute user event: e121F2 */
         e121F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z823TBT16_IMPORT_NO = A823TBT16_IMPORT_NO ;
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

   public void confirm_1F0( )
   {
      beforeValidate1F50( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1F50( ) ;
         }
         else
         {
            checkExtendedTable1F50( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1F50( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e111F2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      AV7W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e121F2( )
   {
      /* After Trn Routine */
   }

   public void S1139( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1F50( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         Z828TBT16_CRT_DATETIME = A828TBT16_CRT_DATETIME ;
         Z829TBT16_CRT_USER_ID = A829TBT16_CRT_USER_ID ;
         Z831TBT16_UPD_DATETIME = A831TBT16_UPD_DATETIME ;
         Z832TBT16_UPD_USER_ID = A832TBT16_UPD_USER_ID ;
         Z834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
         Z824TBT16_IMPORT_FILE_NM = A824TBT16_IMPORT_FILE_NM ;
         Z825TBT16_FILE_NM = A825TBT16_FILE_NM ;
         Z826TBT16_IMPORT_DATETIME = A826TBT16_IMPORT_DATETIME ;
         Z827TBT16_DEL_FLG = A827TBT16_DEL_FLG ;
         Z830TBT16_CRT_PROG_NM = A830TBT16_CRT_PROG_NM ;
         Z833TBT16_UPD_PROG_NM = A833TBT16_UPD_PROG_NM ;
      }
      if ( GX_JID == -9 )
      {
         Z823TBT16_IMPORT_NO = A823TBT16_IMPORT_NO ;
         Z828TBT16_CRT_DATETIME = A828TBT16_CRT_DATETIME ;
         Z829TBT16_CRT_USER_ID = A829TBT16_CRT_USER_ID ;
         Z831TBT16_UPD_DATETIME = A831TBT16_UPD_DATETIME ;
         Z832TBT16_UPD_USER_ID = A832TBT16_UPD_USER_ID ;
         Z834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
         Z824TBT16_IMPORT_FILE_NM = A824TBT16_IMPORT_FILE_NM ;
         Z825TBT16_FILE_NM = A825TBT16_FILE_NM ;
         Z826TBT16_IMPORT_DATETIME = A826TBT16_IMPORT_DATETIME ;
         Z827TBT16_DEL_FLG = A827TBT16_DEL_FLG ;
         Z830TBT16_CRT_PROG_NM = A830TBT16_CRT_PROG_NM ;
         Z833TBT16_UPD_PROG_NM = A833TBT16_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1F50( )
   {
      /* Using cursor BC001F4 */
      pr_default.execute(2, new Object[] {new Long(A823TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A828TBT16_CRT_DATETIME = BC001F4_A828TBT16_CRT_DATETIME[0] ;
         n828TBT16_CRT_DATETIME = BC001F4_n828TBT16_CRT_DATETIME[0] ;
         A829TBT16_CRT_USER_ID = BC001F4_A829TBT16_CRT_USER_ID[0] ;
         n829TBT16_CRT_USER_ID = BC001F4_n829TBT16_CRT_USER_ID[0] ;
         A831TBT16_UPD_DATETIME = BC001F4_A831TBT16_UPD_DATETIME[0] ;
         n831TBT16_UPD_DATETIME = BC001F4_n831TBT16_UPD_DATETIME[0] ;
         A832TBT16_UPD_USER_ID = BC001F4_A832TBT16_UPD_USER_ID[0] ;
         n832TBT16_UPD_USER_ID = BC001F4_n832TBT16_UPD_USER_ID[0] ;
         A834TBT16_UPD_CNT = BC001F4_A834TBT16_UPD_CNT[0] ;
         n834TBT16_UPD_CNT = BC001F4_n834TBT16_UPD_CNT[0] ;
         A824TBT16_IMPORT_FILE_NM = BC001F4_A824TBT16_IMPORT_FILE_NM[0] ;
         n824TBT16_IMPORT_FILE_NM = BC001F4_n824TBT16_IMPORT_FILE_NM[0] ;
         A825TBT16_FILE_NM = BC001F4_A825TBT16_FILE_NM[0] ;
         n825TBT16_FILE_NM = BC001F4_n825TBT16_FILE_NM[0] ;
         A826TBT16_IMPORT_DATETIME = BC001F4_A826TBT16_IMPORT_DATETIME[0] ;
         n826TBT16_IMPORT_DATETIME = BC001F4_n826TBT16_IMPORT_DATETIME[0] ;
         A827TBT16_DEL_FLG = BC001F4_A827TBT16_DEL_FLG[0] ;
         n827TBT16_DEL_FLG = BC001F4_n827TBT16_DEL_FLG[0] ;
         A830TBT16_CRT_PROG_NM = BC001F4_A830TBT16_CRT_PROG_NM[0] ;
         n830TBT16_CRT_PROG_NM = BC001F4_n830TBT16_CRT_PROG_NM[0] ;
         A833TBT16_UPD_PROG_NM = BC001F4_A833TBT16_UPD_PROG_NM[0] ;
         n833TBT16_UPD_PROG_NM = BC001F4_n833TBT16_UPD_PROG_NM[0] ;
         zm1F50( -9) ;
      }
      pr_default.close(2);
      onLoadActions1F50( ) ;
   }

   public void onLoadActions1F50( )
   {
      AV9Pgmname = "TBT16_IMPORT_HISTORY_BC" ;
   }

   public void checkExtendedTable1F50( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT16_IMPORT_HISTORY_BC" ;
      if ( ! ( GXutil.nullDate().equals(A826TBT16_IMPORT_DATETIME) || (( A826TBT16_IMPORT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A826TBT16_IMPORT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　取込日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A828TBT16_CRT_DATETIME) || (( A828TBT16_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A828TBT16_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A831TBT16_UPD_DATETIME) || (( A831TBT16_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A831TBT16_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1F50( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1F50( )
   {
      /* Using cursor BC001F5 */
      pr_default.execute(3, new Object[] {new Long(A823TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound50 = (short)(1) ;
      }
      else
      {
         RcdFound50 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC001F3 */
      pr_default.execute(1, new Object[] {new Long(A823TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1F50( 9) ;
         RcdFound50 = (short)(1) ;
         A823TBT16_IMPORT_NO = BC001F3_A823TBT16_IMPORT_NO[0] ;
         A828TBT16_CRT_DATETIME = BC001F3_A828TBT16_CRT_DATETIME[0] ;
         n828TBT16_CRT_DATETIME = BC001F3_n828TBT16_CRT_DATETIME[0] ;
         A829TBT16_CRT_USER_ID = BC001F3_A829TBT16_CRT_USER_ID[0] ;
         n829TBT16_CRT_USER_ID = BC001F3_n829TBT16_CRT_USER_ID[0] ;
         A831TBT16_UPD_DATETIME = BC001F3_A831TBT16_UPD_DATETIME[0] ;
         n831TBT16_UPD_DATETIME = BC001F3_n831TBT16_UPD_DATETIME[0] ;
         A832TBT16_UPD_USER_ID = BC001F3_A832TBT16_UPD_USER_ID[0] ;
         n832TBT16_UPD_USER_ID = BC001F3_n832TBT16_UPD_USER_ID[0] ;
         A834TBT16_UPD_CNT = BC001F3_A834TBT16_UPD_CNT[0] ;
         n834TBT16_UPD_CNT = BC001F3_n834TBT16_UPD_CNT[0] ;
         A824TBT16_IMPORT_FILE_NM = BC001F3_A824TBT16_IMPORT_FILE_NM[0] ;
         n824TBT16_IMPORT_FILE_NM = BC001F3_n824TBT16_IMPORT_FILE_NM[0] ;
         A825TBT16_FILE_NM = BC001F3_A825TBT16_FILE_NM[0] ;
         n825TBT16_FILE_NM = BC001F3_n825TBT16_FILE_NM[0] ;
         A826TBT16_IMPORT_DATETIME = BC001F3_A826TBT16_IMPORT_DATETIME[0] ;
         n826TBT16_IMPORT_DATETIME = BC001F3_n826TBT16_IMPORT_DATETIME[0] ;
         A827TBT16_DEL_FLG = BC001F3_A827TBT16_DEL_FLG[0] ;
         n827TBT16_DEL_FLG = BC001F3_n827TBT16_DEL_FLG[0] ;
         A830TBT16_CRT_PROG_NM = BC001F3_A830TBT16_CRT_PROG_NM[0] ;
         n830TBT16_CRT_PROG_NM = BC001F3_n830TBT16_CRT_PROG_NM[0] ;
         A833TBT16_UPD_PROG_NM = BC001F3_A833TBT16_UPD_PROG_NM[0] ;
         n833TBT16_UPD_PROG_NM = BC001F3_n833TBT16_UPD_PROG_NM[0] ;
         O834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
         n834TBT16_UPD_CNT = false ;
         Z823TBT16_IMPORT_NO = A823TBT16_IMPORT_NO ;
         sMode50 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1F50( ) ;
         Gx_mode = sMode50 ;
      }
      else
      {
         RcdFound50 = (short)(0) ;
         initializeNonKey1F50( ) ;
         sMode50 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode50 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1F50( ) ;
      if ( RcdFound50 == 0 )
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
      confirm_1F0( ) ;
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

   public void checkOptimisticConcurrency1F50( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC001F2 */
         pr_default.execute(0, new Object[] {new Long(A823TBT16_IMPORT_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT16_IMPORT_HISTORY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z828TBT16_CRT_DATETIME.equals( BC001F2_A828TBT16_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z829TBT16_CRT_USER_ID, BC001F2_A829TBT16_CRT_USER_ID[0]) != 0 ) || !( Z831TBT16_UPD_DATETIME.equals( BC001F2_A831TBT16_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z832TBT16_UPD_USER_ID, BC001F2_A832TBT16_UPD_USER_ID[0]) != 0 ) || ( Z834TBT16_UPD_CNT != BC001F2_A834TBT16_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z824TBT16_IMPORT_FILE_NM, BC001F2_A824TBT16_IMPORT_FILE_NM[0]) != 0 ) || ( GXutil.strcmp(Z825TBT16_FILE_NM, BC001F2_A825TBT16_FILE_NM[0]) != 0 ) || !( Z826TBT16_IMPORT_DATETIME.equals( BC001F2_A826TBT16_IMPORT_DATETIME[0] ) ) || ( GXutil.strcmp(Z827TBT16_DEL_FLG, BC001F2_A827TBT16_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z830TBT16_CRT_PROG_NM, BC001F2_A830TBT16_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z833TBT16_UPD_PROG_NM, BC001F2_A833TBT16_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT16_IMPORT_HISTORY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F50( )
   {
      beforeValidate1F50( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F50( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F50( 0) ;
         checkOptimisticConcurrency1F50( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F50( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F50( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001F6 */
                  pr_default.execute(4, new Object[] {new Boolean(n828TBT16_CRT_DATETIME), A828TBT16_CRT_DATETIME, new Boolean(n829TBT16_CRT_USER_ID), A829TBT16_CRT_USER_ID, new Boolean(n831TBT16_UPD_DATETIME), A831TBT16_UPD_DATETIME, new Boolean(n832TBT16_UPD_USER_ID), A832TBT16_UPD_USER_ID, new Boolean(n834TBT16_UPD_CNT), new Long(A834TBT16_UPD_CNT), new Boolean(n824TBT16_IMPORT_FILE_NM), A824TBT16_IMPORT_FILE_NM, new Boolean(n825TBT16_FILE_NM), A825TBT16_FILE_NM, new Boolean(n826TBT16_IMPORT_DATETIME), A826TBT16_IMPORT_DATETIME, new Boolean(n827TBT16_DEL_FLG), A827TBT16_DEL_FLG, new Boolean(n830TBT16_CRT_PROG_NM), A830TBT16_CRT_PROG_NM, new Boolean(n833TBT16_UPD_PROG_NM), A833TBT16_UPD_PROG_NM});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC001F7 */
                  pr_default.execute(5);
                  A823TBT16_IMPORT_NO = BC001F7_A823TBT16_IMPORT_NO[0] ;
                  pr_default.close(5);
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
            load1F50( ) ;
         }
         endLevel1F50( ) ;
      }
      closeExtendedTableCursors1F50( ) ;
   }

   public void update1F50( )
   {
      beforeValidate1F50( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F50( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F50( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F50( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F50( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001F8 */
                  pr_default.execute(6, new Object[] {new Boolean(n828TBT16_CRT_DATETIME), A828TBT16_CRT_DATETIME, new Boolean(n829TBT16_CRT_USER_ID), A829TBT16_CRT_USER_ID, new Boolean(n831TBT16_UPD_DATETIME), A831TBT16_UPD_DATETIME, new Boolean(n832TBT16_UPD_USER_ID), A832TBT16_UPD_USER_ID, new Boolean(n834TBT16_UPD_CNT), new Long(A834TBT16_UPD_CNT), new Boolean(n824TBT16_IMPORT_FILE_NM), A824TBT16_IMPORT_FILE_NM, new Boolean(n825TBT16_FILE_NM), A825TBT16_FILE_NM, new Boolean(n826TBT16_IMPORT_DATETIME), A826TBT16_IMPORT_DATETIME, new Boolean(n827TBT16_DEL_FLG), A827TBT16_DEL_FLG, new Boolean(n830TBT16_CRT_PROG_NM), A830TBT16_CRT_PROG_NM, new Boolean(n833TBT16_UPD_PROG_NM), A833TBT16_UPD_PROG_NM, new Long(A823TBT16_IMPORT_NO)});
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT16_IMPORT_HISTORY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F50( ) ;
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
         endLevel1F50( ) ;
      }
      closeExtendedTableCursors1F50( ) ;
   }

   public void deferredUpdate1F50( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1F50( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F50( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F50( ) ;
         afterConfirm1F50( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F50( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001F9 */
               pr_default.execute(7, new Object[] {new Long(A823TBT16_IMPORT_NO)});
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
      sMode50 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1F50( ) ;
      Gx_mode = sMode50 ;
   }

   public void onDeleteControls1F50( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT16_IMPORT_HISTORY_BC" ;
      }
   }

   public void endLevel1F50( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F50( ) ;
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

   public void scanKeyStart1F50( )
   {
      /* Using cursor BC001F10 */
      pr_default.execute(8, new Object[] {new Long(A823TBT16_IMPORT_NO)});
      RcdFound50 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A823TBT16_IMPORT_NO = BC001F10_A823TBT16_IMPORT_NO[0] ;
         A828TBT16_CRT_DATETIME = BC001F10_A828TBT16_CRT_DATETIME[0] ;
         n828TBT16_CRT_DATETIME = BC001F10_n828TBT16_CRT_DATETIME[0] ;
         A829TBT16_CRT_USER_ID = BC001F10_A829TBT16_CRT_USER_ID[0] ;
         n829TBT16_CRT_USER_ID = BC001F10_n829TBT16_CRT_USER_ID[0] ;
         A831TBT16_UPD_DATETIME = BC001F10_A831TBT16_UPD_DATETIME[0] ;
         n831TBT16_UPD_DATETIME = BC001F10_n831TBT16_UPD_DATETIME[0] ;
         A832TBT16_UPD_USER_ID = BC001F10_A832TBT16_UPD_USER_ID[0] ;
         n832TBT16_UPD_USER_ID = BC001F10_n832TBT16_UPD_USER_ID[0] ;
         A834TBT16_UPD_CNT = BC001F10_A834TBT16_UPD_CNT[0] ;
         n834TBT16_UPD_CNT = BC001F10_n834TBT16_UPD_CNT[0] ;
         A824TBT16_IMPORT_FILE_NM = BC001F10_A824TBT16_IMPORT_FILE_NM[0] ;
         n824TBT16_IMPORT_FILE_NM = BC001F10_n824TBT16_IMPORT_FILE_NM[0] ;
         A825TBT16_FILE_NM = BC001F10_A825TBT16_FILE_NM[0] ;
         n825TBT16_FILE_NM = BC001F10_n825TBT16_FILE_NM[0] ;
         A826TBT16_IMPORT_DATETIME = BC001F10_A826TBT16_IMPORT_DATETIME[0] ;
         n826TBT16_IMPORT_DATETIME = BC001F10_n826TBT16_IMPORT_DATETIME[0] ;
         A827TBT16_DEL_FLG = BC001F10_A827TBT16_DEL_FLG[0] ;
         n827TBT16_DEL_FLG = BC001F10_n827TBT16_DEL_FLG[0] ;
         A830TBT16_CRT_PROG_NM = BC001F10_A830TBT16_CRT_PROG_NM[0] ;
         n830TBT16_CRT_PROG_NM = BC001F10_n830TBT16_CRT_PROG_NM[0] ;
         A833TBT16_UPD_PROG_NM = BC001F10_A833TBT16_UPD_PROG_NM[0] ;
         n833TBT16_UPD_PROG_NM = BC001F10_n833TBT16_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1F50( )
   {
      pr_default.readNext(8);
      RcdFound50 = (short)(0) ;
      scanKeyLoad1F50( ) ;
   }

   public void scanKeyLoad1F50( )
   {
      sMode50 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A823TBT16_IMPORT_NO = BC001F10_A823TBT16_IMPORT_NO[0] ;
         A828TBT16_CRT_DATETIME = BC001F10_A828TBT16_CRT_DATETIME[0] ;
         n828TBT16_CRT_DATETIME = BC001F10_n828TBT16_CRT_DATETIME[0] ;
         A829TBT16_CRT_USER_ID = BC001F10_A829TBT16_CRT_USER_ID[0] ;
         n829TBT16_CRT_USER_ID = BC001F10_n829TBT16_CRT_USER_ID[0] ;
         A831TBT16_UPD_DATETIME = BC001F10_A831TBT16_UPD_DATETIME[0] ;
         n831TBT16_UPD_DATETIME = BC001F10_n831TBT16_UPD_DATETIME[0] ;
         A832TBT16_UPD_USER_ID = BC001F10_A832TBT16_UPD_USER_ID[0] ;
         n832TBT16_UPD_USER_ID = BC001F10_n832TBT16_UPD_USER_ID[0] ;
         A834TBT16_UPD_CNT = BC001F10_A834TBT16_UPD_CNT[0] ;
         n834TBT16_UPD_CNT = BC001F10_n834TBT16_UPD_CNT[0] ;
         A824TBT16_IMPORT_FILE_NM = BC001F10_A824TBT16_IMPORT_FILE_NM[0] ;
         n824TBT16_IMPORT_FILE_NM = BC001F10_n824TBT16_IMPORT_FILE_NM[0] ;
         A825TBT16_FILE_NM = BC001F10_A825TBT16_FILE_NM[0] ;
         n825TBT16_FILE_NM = BC001F10_n825TBT16_FILE_NM[0] ;
         A826TBT16_IMPORT_DATETIME = BC001F10_A826TBT16_IMPORT_DATETIME[0] ;
         n826TBT16_IMPORT_DATETIME = BC001F10_n826TBT16_IMPORT_DATETIME[0] ;
         A827TBT16_DEL_FLG = BC001F10_A827TBT16_DEL_FLG[0] ;
         n827TBT16_DEL_FLG = BC001F10_n827TBT16_DEL_FLG[0] ;
         A830TBT16_CRT_PROG_NM = BC001F10_A830TBT16_CRT_PROG_NM[0] ;
         n830TBT16_CRT_PROG_NM = BC001F10_n830TBT16_CRT_PROG_NM[0] ;
         A833TBT16_UPD_PROG_NM = BC001F10_A833TBT16_UPD_PROG_NM[0] ;
         n833TBT16_UPD_PROG_NM = BC001F10_n833TBT16_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode50 ;
   }

   public void scanKeyEnd1F50( )
   {
      pr_default.close(8);
   }

   public void afterConfirm1F50( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F50( )
   {
      /* Before Insert Rules */
      A828TBT16_CRT_DATETIME = GXutil.now( ) ;
      n828TBT16_CRT_DATETIME = false ;
      GXt_char1 = A829TBT16_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt16_import_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A829TBT16_CRT_USER_ID = GXt_char1 ;
      n829TBT16_CRT_USER_ID = false ;
      A831TBT16_UPD_DATETIME = GXutil.now( ) ;
      n831TBT16_UPD_DATETIME = false ;
      GXt_char1 = A832TBT16_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt16_import_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A832TBT16_UPD_USER_ID = GXt_char1 ;
      n832TBT16_UPD_USER_ID = false ;
      A834TBT16_UPD_CNT = (long)(O834TBT16_UPD_CNT+1) ;
      n834TBT16_UPD_CNT = false ;
   }

   public void beforeUpdate1F50( )
   {
      /* Before Update Rules */
      A831TBT16_UPD_DATETIME = GXutil.now( ) ;
      n831TBT16_UPD_DATETIME = false ;
      GXt_char1 = A832TBT16_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt16_import_history_bc.this.GXt_char1 = GXv_char2[0] ;
      A832TBT16_UPD_USER_ID = GXt_char1 ;
      n832TBT16_UPD_USER_ID = false ;
      A834TBT16_UPD_CNT = (long)(O834TBT16_UPD_CNT+1) ;
      n834TBT16_UPD_CNT = false ;
   }

   public void beforeDelete1F50( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F50( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F50( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F50( )
   {
   }

   public void addRow1F50( )
   {
      VarsToRow50( bcTBT16_IMPORT_HISTORY) ;
   }

   public void readRow1F50( )
   {
      RowToVars50( bcTBT16_IMPORT_HISTORY, 1) ;
   }

   public void initializeNonKey1F50( )
   {
      A828TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n828TBT16_CRT_DATETIME = false ;
      A829TBT16_CRT_USER_ID = "" ;
      n829TBT16_CRT_USER_ID = false ;
      A831TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n831TBT16_UPD_DATETIME = false ;
      A832TBT16_UPD_USER_ID = "" ;
      n832TBT16_UPD_USER_ID = false ;
      A834TBT16_UPD_CNT = 0 ;
      n834TBT16_UPD_CNT = false ;
      A824TBT16_IMPORT_FILE_NM = "" ;
      n824TBT16_IMPORT_FILE_NM = false ;
      A825TBT16_FILE_NM = "" ;
      n825TBT16_FILE_NM = false ;
      A826TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n826TBT16_IMPORT_DATETIME = false ;
      A827TBT16_DEL_FLG = "" ;
      n827TBT16_DEL_FLG = false ;
      A830TBT16_CRT_PROG_NM = "" ;
      n830TBT16_CRT_PROG_NM = false ;
      A833TBT16_UPD_PROG_NM = "" ;
      n833TBT16_UPD_PROG_NM = false ;
      O834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
      n834TBT16_UPD_CNT = false ;
   }

   public void initAll1F50( )
   {
      A823TBT16_IMPORT_NO = 0 ;
      initializeNonKey1F50( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow50( SdtTBT16_IMPORT_HISTORY obj50 )
   {
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Mode( Gx_mode );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime( A828TBT16_CRT_DATETIME );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id( A829TBT16_CRT_USER_ID );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime( A831TBT16_UPD_DATETIME );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id( A832TBT16_UPD_USER_ID );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt( A834TBT16_UPD_CNT );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm( A824TBT16_IMPORT_FILE_NM );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm( A825TBT16_FILE_NM );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime( A826TBT16_IMPORT_DATETIME );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg( A827TBT16_DEL_FLG );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm( A830TBT16_CRT_PROG_NM );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm( A833TBT16_UPD_PROG_NM );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no( A823TBT16_IMPORT_NO );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z( Z823TBT16_IMPORT_NO );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z( Z824TBT16_IMPORT_FILE_NM );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z( Z825TBT16_FILE_NM );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z( Z826TBT16_IMPORT_DATETIME );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z( Z827TBT16_DEL_FLG );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z( Z828TBT16_CRT_DATETIME );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z( Z829TBT16_CRT_USER_ID );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z( Z830TBT16_CRT_PROG_NM );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z( Z831TBT16_UPD_DATETIME );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z( Z832TBT16_UPD_USER_ID );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z( Z833TBT16_UPD_PROG_NM );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z( Z834TBT16_UPD_CNT );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N( (byte)((byte)((n824TBT16_IMPORT_FILE_NM)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N( (byte)((byte)((n825TBT16_FILE_NM)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N( (byte)((byte)((n826TBT16_IMPORT_DATETIME)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N( (byte)((byte)((n827TBT16_DEL_FLG)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N( (byte)((byte)((n828TBT16_CRT_DATETIME)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N( (byte)((byte)((n829TBT16_CRT_USER_ID)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N( (byte)((byte)((n830TBT16_CRT_PROG_NM)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N( (byte)((byte)((n831TBT16_UPD_DATETIME)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N( (byte)((byte)((n832TBT16_UPD_USER_ID)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N( (byte)((byte)((n833TBT16_UPD_PROG_NM)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N( (byte)((byte)((n834TBT16_UPD_CNT)?1:0)) );
      obj50.setgxTv_SdtTBT16_IMPORT_HISTORY_Mode( Gx_mode );
   }

   public void RowToVars50( SdtTBT16_IMPORT_HISTORY obj50 ,
                            int forceLoad )
   {
      Gx_mode = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Mode() ;
      A828TBT16_CRT_DATETIME = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime() ;
      n828TBT16_CRT_DATETIME = false ;
      A829TBT16_CRT_USER_ID = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id() ;
      n829TBT16_CRT_USER_ID = false ;
      A831TBT16_UPD_DATETIME = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime() ;
      n831TBT16_UPD_DATETIME = false ;
      A832TBT16_UPD_USER_ID = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id() ;
      n832TBT16_UPD_USER_ID = false ;
      A834TBT16_UPD_CNT = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt() ;
      n834TBT16_UPD_CNT = false ;
      A824TBT16_IMPORT_FILE_NM = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm() ;
      n824TBT16_IMPORT_FILE_NM = false ;
      A825TBT16_FILE_NM = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm() ;
      n825TBT16_FILE_NM = false ;
      A826TBT16_IMPORT_DATETIME = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime() ;
      n826TBT16_IMPORT_DATETIME = false ;
      A827TBT16_DEL_FLG = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg() ;
      n827TBT16_DEL_FLG = false ;
      A830TBT16_CRT_PROG_NM = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm() ;
      n830TBT16_CRT_PROG_NM = false ;
      A833TBT16_UPD_PROG_NM = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm() ;
      n833TBT16_UPD_PROG_NM = false ;
      A823TBT16_IMPORT_NO = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no() ;
      Z823TBT16_IMPORT_NO = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z() ;
      Z824TBT16_IMPORT_FILE_NM = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z() ;
      Z825TBT16_FILE_NM = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z() ;
      Z826TBT16_IMPORT_DATETIME = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z() ;
      Z827TBT16_DEL_FLG = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z() ;
      Z828TBT16_CRT_DATETIME = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z() ;
      Z829TBT16_CRT_USER_ID = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z() ;
      Z830TBT16_CRT_PROG_NM = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z() ;
      Z831TBT16_UPD_DATETIME = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z() ;
      Z832TBT16_UPD_USER_ID = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z() ;
      Z833TBT16_UPD_PROG_NM = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z() ;
      Z834TBT16_UPD_CNT = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z() ;
      O834TBT16_UPD_CNT = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z() ;
      n824TBT16_IMPORT_FILE_NM = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N()==0)?false:true) ;
      n825TBT16_FILE_NM = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N()==0)?false:true) ;
      n826TBT16_IMPORT_DATETIME = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N()==0)?false:true) ;
      n827TBT16_DEL_FLG = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N()==0)?false:true) ;
      n828TBT16_CRT_DATETIME = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N()==0)?false:true) ;
      n829TBT16_CRT_USER_ID = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N()==0)?false:true) ;
      n830TBT16_CRT_PROG_NM = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N()==0)?false:true) ;
      n831TBT16_UPD_DATETIME = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N()==0)?false:true) ;
      n832TBT16_UPD_USER_ID = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N()==0)?false:true) ;
      n833TBT16_UPD_PROG_NM = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N()==0)?false:true) ;
      n834TBT16_UPD_CNT = (boolean)((obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj50.getgxTv_SdtTBT16_IMPORT_HISTORY_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A823TBT16_IMPORT_NO = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1F50( ) ;
      scanKeyStart1F50( ) ;
      if ( RcdFound50 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z823TBT16_IMPORT_NO = A823TBT16_IMPORT_NO ;
         O834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
         n834TBT16_UPD_CNT = false ;
      }
      zm1F50( -9) ;
      sMode50 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1F50( ) ;
      Gx_mode = sMode50 ;
      addRow1F50( ) ;
      scanKeyEnd1F50( ) ;
      if ( RcdFound50 == 0 )
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
      RowToVars50( bcTBT16_IMPORT_HISTORY, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1F50( ) ;
      if ( RcdFound50 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A823TBT16_IMPORT_NO != Z823TBT16_IMPORT_NO )
         {
            A823TBT16_IMPORT_NO = Z823TBT16_IMPORT_NO ;
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
            update1F50( ) ;
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
            if ( A823TBT16_IMPORT_NO != Z823TBT16_IMPORT_NO )
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
                  insert1F50( ) ;
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
                  insert1F50( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow50( bcTBT16_IMPORT_HISTORY) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars50( bcTBT16_IMPORT_HISTORY, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1F50( ) ;
      if ( RcdFound50 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A823TBT16_IMPORT_NO != Z823TBT16_IMPORT_NO )
         {
            A823TBT16_IMPORT_NO = Z823TBT16_IMPORT_NO ;
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
         if ( A823TBT16_IMPORT_NO != Z823TBT16_IMPORT_NO )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt16_import_history_bc");
      VarsToRow50( bcTBT16_IMPORT_HISTORY) ;
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
      Gx_mode = bcTBT16_IMPORT_HISTORY.getgxTv_SdtTBT16_IMPORT_HISTORY_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT16_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT16_IMPORT_HISTORY sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT16_IMPORT_HISTORY )
      {
         bcTBT16_IMPORT_HISTORY = sdt ;
         if ( GXutil.strcmp(bcTBT16_IMPORT_HISTORY.getgxTv_SdtTBT16_IMPORT_HISTORY_Mode(), "") == 0 )
         {
            bcTBT16_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow50( bcTBT16_IMPORT_HISTORY) ;
         }
         else
         {
            RowToVars50( bcTBT16_IMPORT_HISTORY, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT16_IMPORT_HISTORY.getgxTv_SdtTBT16_IMPORT_HISTORY_Mode(), "") == 0 )
         {
            bcTBT16_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars50( bcTBT16_IMPORT_HISTORY, 1) ;
   }

   public SdtTBT16_IMPORT_HISTORY getTBT16_IMPORT_HISTORY_BC( )
   {
      return bcTBT16_IMPORT_HISTORY ;
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
                  /* Execute user subroutine: S1139 */
                  S1139 ();
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
      AV7W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z = "" ;
      Z828TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A828TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z829TBT16_CRT_USER_ID = "" ;
      A829TBT16_CRT_USER_ID = "" ;
      Z831TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A831TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z832TBT16_UPD_USER_ID = "" ;
      A832TBT16_UPD_USER_ID = "" ;
      Z824TBT16_IMPORT_FILE_NM = "" ;
      A824TBT16_IMPORT_FILE_NM = "" ;
      Z825TBT16_FILE_NM = "" ;
      A825TBT16_FILE_NM = "" ;
      Z826TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A826TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z827TBT16_DEL_FLG = "" ;
      A827TBT16_DEL_FLG = "" ;
      Z830TBT16_CRT_PROG_NM = "" ;
      A830TBT16_CRT_PROG_NM = "" ;
      Z833TBT16_UPD_PROG_NM = "" ;
      A833TBT16_UPD_PROG_NM = "" ;
      BC001F4_A823TBT16_IMPORT_NO = new long[1] ;
      BC001F4_A828TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F4_n828TBT16_CRT_DATETIME = new boolean[] {false} ;
      BC001F4_A829TBT16_CRT_USER_ID = new String[] {""} ;
      BC001F4_n829TBT16_CRT_USER_ID = new boolean[] {false} ;
      BC001F4_A831TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F4_n831TBT16_UPD_DATETIME = new boolean[] {false} ;
      BC001F4_A832TBT16_UPD_USER_ID = new String[] {""} ;
      BC001F4_n832TBT16_UPD_USER_ID = new boolean[] {false} ;
      BC001F4_A834TBT16_UPD_CNT = new long[1] ;
      BC001F4_n834TBT16_UPD_CNT = new boolean[] {false} ;
      BC001F4_A824TBT16_IMPORT_FILE_NM = new String[] {""} ;
      BC001F4_n824TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      BC001F4_A825TBT16_FILE_NM = new String[] {""} ;
      BC001F4_n825TBT16_FILE_NM = new boolean[] {false} ;
      BC001F4_A826TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F4_n826TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      BC001F4_A827TBT16_DEL_FLG = new String[] {""} ;
      BC001F4_n827TBT16_DEL_FLG = new boolean[] {false} ;
      BC001F4_A830TBT16_CRT_PROG_NM = new String[] {""} ;
      BC001F4_n830TBT16_CRT_PROG_NM = new boolean[] {false} ;
      BC001F4_A833TBT16_UPD_PROG_NM = new String[] {""} ;
      BC001F4_n833TBT16_UPD_PROG_NM = new boolean[] {false} ;
      BC001F5_A823TBT16_IMPORT_NO = new long[1] ;
      BC001F3_A823TBT16_IMPORT_NO = new long[1] ;
      BC001F3_A828TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F3_n828TBT16_CRT_DATETIME = new boolean[] {false} ;
      BC001F3_A829TBT16_CRT_USER_ID = new String[] {""} ;
      BC001F3_n829TBT16_CRT_USER_ID = new boolean[] {false} ;
      BC001F3_A831TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F3_n831TBT16_UPD_DATETIME = new boolean[] {false} ;
      BC001F3_A832TBT16_UPD_USER_ID = new String[] {""} ;
      BC001F3_n832TBT16_UPD_USER_ID = new boolean[] {false} ;
      BC001F3_A834TBT16_UPD_CNT = new long[1] ;
      BC001F3_n834TBT16_UPD_CNT = new boolean[] {false} ;
      BC001F3_A824TBT16_IMPORT_FILE_NM = new String[] {""} ;
      BC001F3_n824TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      BC001F3_A825TBT16_FILE_NM = new String[] {""} ;
      BC001F3_n825TBT16_FILE_NM = new boolean[] {false} ;
      BC001F3_A826TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F3_n826TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      BC001F3_A827TBT16_DEL_FLG = new String[] {""} ;
      BC001F3_n827TBT16_DEL_FLG = new boolean[] {false} ;
      BC001F3_A830TBT16_CRT_PROG_NM = new String[] {""} ;
      BC001F3_n830TBT16_CRT_PROG_NM = new boolean[] {false} ;
      BC001F3_A833TBT16_UPD_PROG_NM = new String[] {""} ;
      BC001F3_n833TBT16_UPD_PROG_NM = new boolean[] {false} ;
      sMode50 = "" ;
      BC001F2_A823TBT16_IMPORT_NO = new long[1] ;
      BC001F2_A828TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F2_n828TBT16_CRT_DATETIME = new boolean[] {false} ;
      BC001F2_A829TBT16_CRT_USER_ID = new String[] {""} ;
      BC001F2_n829TBT16_CRT_USER_ID = new boolean[] {false} ;
      BC001F2_A831TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F2_n831TBT16_UPD_DATETIME = new boolean[] {false} ;
      BC001F2_A832TBT16_UPD_USER_ID = new String[] {""} ;
      BC001F2_n832TBT16_UPD_USER_ID = new boolean[] {false} ;
      BC001F2_A834TBT16_UPD_CNT = new long[1] ;
      BC001F2_n834TBT16_UPD_CNT = new boolean[] {false} ;
      BC001F2_A824TBT16_IMPORT_FILE_NM = new String[] {""} ;
      BC001F2_n824TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      BC001F2_A825TBT16_FILE_NM = new String[] {""} ;
      BC001F2_n825TBT16_FILE_NM = new boolean[] {false} ;
      BC001F2_A826TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F2_n826TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      BC001F2_A827TBT16_DEL_FLG = new String[] {""} ;
      BC001F2_n827TBT16_DEL_FLG = new boolean[] {false} ;
      BC001F2_A830TBT16_CRT_PROG_NM = new String[] {""} ;
      BC001F2_n830TBT16_CRT_PROG_NM = new boolean[] {false} ;
      BC001F2_A833TBT16_UPD_PROG_NM = new String[] {""} ;
      BC001F2_n833TBT16_UPD_PROG_NM = new boolean[] {false} ;
      BC001F7_A823TBT16_IMPORT_NO = new long[1] ;
      BC001F10_A823TBT16_IMPORT_NO = new long[1] ;
      BC001F10_A828TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F10_n828TBT16_CRT_DATETIME = new boolean[] {false} ;
      BC001F10_A829TBT16_CRT_USER_ID = new String[] {""} ;
      BC001F10_n829TBT16_CRT_USER_ID = new boolean[] {false} ;
      BC001F10_A831TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F10_n831TBT16_UPD_DATETIME = new boolean[] {false} ;
      BC001F10_A832TBT16_UPD_USER_ID = new String[] {""} ;
      BC001F10_n832TBT16_UPD_USER_ID = new boolean[] {false} ;
      BC001F10_A834TBT16_UPD_CNT = new long[1] ;
      BC001F10_n834TBT16_UPD_CNT = new boolean[] {false} ;
      BC001F10_A824TBT16_IMPORT_FILE_NM = new String[] {""} ;
      BC001F10_n824TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      BC001F10_A825TBT16_FILE_NM = new String[] {""} ;
      BC001F10_n825TBT16_FILE_NM = new boolean[] {false} ;
      BC001F10_A826TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001F10_n826TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      BC001F10_A827TBT16_DEL_FLG = new String[] {""} ;
      BC001F10_n827TBT16_DEL_FLG = new boolean[] {false} ;
      BC001F10_A830TBT16_CRT_PROG_NM = new String[] {""} ;
      BC001F10_n830TBT16_CRT_PROG_NM = new boolean[] {false} ;
      BC001F10_A833TBT16_UPD_PROG_NM = new String[] {""} ;
      BC001F10_n833TBT16_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt16_import_history_bc__default(),
         new Object[] {
             new Object[] {
            BC001F2_A823TBT16_IMPORT_NO, BC001F2_A828TBT16_CRT_DATETIME, BC001F2_n828TBT16_CRT_DATETIME, BC001F2_A829TBT16_CRT_USER_ID, BC001F2_n829TBT16_CRT_USER_ID, BC001F2_A831TBT16_UPD_DATETIME, BC001F2_n831TBT16_UPD_DATETIME, BC001F2_A832TBT16_UPD_USER_ID, BC001F2_n832TBT16_UPD_USER_ID, BC001F2_A834TBT16_UPD_CNT,
            BC001F2_n834TBT16_UPD_CNT, BC001F2_A824TBT16_IMPORT_FILE_NM, BC001F2_n824TBT16_IMPORT_FILE_NM, BC001F2_A825TBT16_FILE_NM, BC001F2_n825TBT16_FILE_NM, BC001F2_A826TBT16_IMPORT_DATETIME, BC001F2_n826TBT16_IMPORT_DATETIME, BC001F2_A827TBT16_DEL_FLG, BC001F2_n827TBT16_DEL_FLG, BC001F2_A830TBT16_CRT_PROG_NM,
            BC001F2_n830TBT16_CRT_PROG_NM, BC001F2_A833TBT16_UPD_PROG_NM, BC001F2_n833TBT16_UPD_PROG_NM
            }
            , new Object[] {
            BC001F3_A823TBT16_IMPORT_NO, BC001F3_A828TBT16_CRT_DATETIME, BC001F3_n828TBT16_CRT_DATETIME, BC001F3_A829TBT16_CRT_USER_ID, BC001F3_n829TBT16_CRT_USER_ID, BC001F3_A831TBT16_UPD_DATETIME, BC001F3_n831TBT16_UPD_DATETIME, BC001F3_A832TBT16_UPD_USER_ID, BC001F3_n832TBT16_UPD_USER_ID, BC001F3_A834TBT16_UPD_CNT,
            BC001F3_n834TBT16_UPD_CNT, BC001F3_A824TBT16_IMPORT_FILE_NM, BC001F3_n824TBT16_IMPORT_FILE_NM, BC001F3_A825TBT16_FILE_NM, BC001F3_n825TBT16_FILE_NM, BC001F3_A826TBT16_IMPORT_DATETIME, BC001F3_n826TBT16_IMPORT_DATETIME, BC001F3_A827TBT16_DEL_FLG, BC001F3_n827TBT16_DEL_FLG, BC001F3_A830TBT16_CRT_PROG_NM,
            BC001F3_n830TBT16_CRT_PROG_NM, BC001F3_A833TBT16_UPD_PROG_NM, BC001F3_n833TBT16_UPD_PROG_NM
            }
            , new Object[] {
            BC001F4_A823TBT16_IMPORT_NO, BC001F4_A828TBT16_CRT_DATETIME, BC001F4_n828TBT16_CRT_DATETIME, BC001F4_A829TBT16_CRT_USER_ID, BC001F4_n829TBT16_CRT_USER_ID, BC001F4_A831TBT16_UPD_DATETIME, BC001F4_n831TBT16_UPD_DATETIME, BC001F4_A832TBT16_UPD_USER_ID, BC001F4_n832TBT16_UPD_USER_ID, BC001F4_A834TBT16_UPD_CNT,
            BC001F4_n834TBT16_UPD_CNT, BC001F4_A824TBT16_IMPORT_FILE_NM, BC001F4_n824TBT16_IMPORT_FILE_NM, BC001F4_A825TBT16_FILE_NM, BC001F4_n825TBT16_FILE_NM, BC001F4_A826TBT16_IMPORT_DATETIME, BC001F4_n826TBT16_IMPORT_DATETIME, BC001F4_A827TBT16_DEL_FLG, BC001F4_n827TBT16_DEL_FLG, BC001F4_A830TBT16_CRT_PROG_NM,
            BC001F4_n830TBT16_CRT_PROG_NM, BC001F4_A833TBT16_UPD_PROG_NM, BC001F4_n833TBT16_UPD_PROG_NM
            }
            , new Object[] {
            BC001F5_A823TBT16_IMPORT_NO
            }
            , new Object[] {
            }
            , new Object[] {
            BC001F7_A823TBT16_IMPORT_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001F10_A823TBT16_IMPORT_NO, BC001F10_A828TBT16_CRT_DATETIME, BC001F10_n828TBT16_CRT_DATETIME, BC001F10_A829TBT16_CRT_USER_ID, BC001F10_n829TBT16_CRT_USER_ID, BC001F10_A831TBT16_UPD_DATETIME, BC001F10_n831TBT16_UPD_DATETIME, BC001F10_A832TBT16_UPD_USER_ID, BC001F10_n832TBT16_UPD_USER_ID, BC001F10_A834TBT16_UPD_CNT,
            BC001F10_n834TBT16_UPD_CNT, BC001F10_A824TBT16_IMPORT_FILE_NM, BC001F10_n824TBT16_IMPORT_FILE_NM, BC001F10_A825TBT16_FILE_NM, BC001F10_n825TBT16_FILE_NM, BC001F10_A826TBT16_IMPORT_DATETIME, BC001F10_n826TBT16_IMPORT_DATETIME, BC001F10_A827TBT16_DEL_FLG, BC001F10_n827TBT16_DEL_FLG, BC001F10_A830TBT16_CRT_PROG_NM,
            BC001F10_n830TBT16_CRT_PROG_NM, BC001F10_A833TBT16_UPD_PROG_NM, BC001F10_n833TBT16_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT16_IMPORT_HISTORY_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e111F2 */
      e111F2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound50 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z823TBT16_IMPORT_NO ;
   private long A823TBT16_IMPORT_NO ;
   private long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z ;
   private long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z ;
   private long Z834TBT16_UPD_CNT ;
   private long A834TBT16_UPD_CNT ;
   private long O834TBT16_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode50 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z ;
   private java.util.Date Z828TBT16_CRT_DATETIME ;
   private java.util.Date A828TBT16_CRT_DATETIME ;
   private java.util.Date Z831TBT16_UPD_DATETIME ;
   private java.util.Date A831TBT16_UPD_DATETIME ;
   private java.util.Date Z826TBT16_IMPORT_DATETIME ;
   private java.util.Date A826TBT16_IMPORT_DATETIME ;
   private boolean n828TBT16_CRT_DATETIME ;
   private boolean n829TBT16_CRT_USER_ID ;
   private boolean n831TBT16_UPD_DATETIME ;
   private boolean n832TBT16_UPD_USER_ID ;
   private boolean n834TBT16_UPD_CNT ;
   private boolean n824TBT16_IMPORT_FILE_NM ;
   private boolean n825TBT16_FILE_NM ;
   private boolean n826TBT16_IMPORT_DATETIME ;
   private boolean n827TBT16_DEL_FLG ;
   private boolean n830TBT16_CRT_PROG_NM ;
   private boolean n833TBT16_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV7W_BC_FLG ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z ;
   private String Z829TBT16_CRT_USER_ID ;
   private String A829TBT16_CRT_USER_ID ;
   private String Z832TBT16_UPD_USER_ID ;
   private String A832TBT16_UPD_USER_ID ;
   private String Z824TBT16_IMPORT_FILE_NM ;
   private String A824TBT16_IMPORT_FILE_NM ;
   private String Z825TBT16_FILE_NM ;
   private String A825TBT16_FILE_NM ;
   private String Z827TBT16_DEL_FLG ;
   private String A827TBT16_DEL_FLG ;
   private String Z830TBT16_CRT_PROG_NM ;
   private String A830TBT16_CRT_PROG_NM ;
   private String Z833TBT16_UPD_PROG_NM ;
   private String A833TBT16_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT16_IMPORT_HISTORY bcTBT16_IMPORT_HISTORY ;
   private IDataStoreProvider pr_default ;
   private long[] BC001F4_A823TBT16_IMPORT_NO ;
   private java.util.Date[] BC001F4_A828TBT16_CRT_DATETIME ;
   private boolean[] BC001F4_n828TBT16_CRT_DATETIME ;
   private String[] BC001F4_A829TBT16_CRT_USER_ID ;
   private boolean[] BC001F4_n829TBT16_CRT_USER_ID ;
   private java.util.Date[] BC001F4_A831TBT16_UPD_DATETIME ;
   private boolean[] BC001F4_n831TBT16_UPD_DATETIME ;
   private String[] BC001F4_A832TBT16_UPD_USER_ID ;
   private boolean[] BC001F4_n832TBT16_UPD_USER_ID ;
   private long[] BC001F4_A834TBT16_UPD_CNT ;
   private boolean[] BC001F4_n834TBT16_UPD_CNT ;
   private String[] BC001F4_A824TBT16_IMPORT_FILE_NM ;
   private boolean[] BC001F4_n824TBT16_IMPORT_FILE_NM ;
   private String[] BC001F4_A825TBT16_FILE_NM ;
   private boolean[] BC001F4_n825TBT16_FILE_NM ;
   private java.util.Date[] BC001F4_A826TBT16_IMPORT_DATETIME ;
   private boolean[] BC001F4_n826TBT16_IMPORT_DATETIME ;
   private String[] BC001F4_A827TBT16_DEL_FLG ;
   private boolean[] BC001F4_n827TBT16_DEL_FLG ;
   private String[] BC001F4_A830TBT16_CRT_PROG_NM ;
   private boolean[] BC001F4_n830TBT16_CRT_PROG_NM ;
   private String[] BC001F4_A833TBT16_UPD_PROG_NM ;
   private boolean[] BC001F4_n833TBT16_UPD_PROG_NM ;
   private long[] BC001F5_A823TBT16_IMPORT_NO ;
   private long[] BC001F3_A823TBT16_IMPORT_NO ;
   private java.util.Date[] BC001F3_A828TBT16_CRT_DATETIME ;
   private boolean[] BC001F3_n828TBT16_CRT_DATETIME ;
   private String[] BC001F3_A829TBT16_CRT_USER_ID ;
   private boolean[] BC001F3_n829TBT16_CRT_USER_ID ;
   private java.util.Date[] BC001F3_A831TBT16_UPD_DATETIME ;
   private boolean[] BC001F3_n831TBT16_UPD_DATETIME ;
   private String[] BC001F3_A832TBT16_UPD_USER_ID ;
   private boolean[] BC001F3_n832TBT16_UPD_USER_ID ;
   private long[] BC001F3_A834TBT16_UPD_CNT ;
   private boolean[] BC001F3_n834TBT16_UPD_CNT ;
   private String[] BC001F3_A824TBT16_IMPORT_FILE_NM ;
   private boolean[] BC001F3_n824TBT16_IMPORT_FILE_NM ;
   private String[] BC001F3_A825TBT16_FILE_NM ;
   private boolean[] BC001F3_n825TBT16_FILE_NM ;
   private java.util.Date[] BC001F3_A826TBT16_IMPORT_DATETIME ;
   private boolean[] BC001F3_n826TBT16_IMPORT_DATETIME ;
   private String[] BC001F3_A827TBT16_DEL_FLG ;
   private boolean[] BC001F3_n827TBT16_DEL_FLG ;
   private String[] BC001F3_A830TBT16_CRT_PROG_NM ;
   private boolean[] BC001F3_n830TBT16_CRT_PROG_NM ;
   private String[] BC001F3_A833TBT16_UPD_PROG_NM ;
   private boolean[] BC001F3_n833TBT16_UPD_PROG_NM ;
   private long[] BC001F2_A823TBT16_IMPORT_NO ;
   private java.util.Date[] BC001F2_A828TBT16_CRT_DATETIME ;
   private boolean[] BC001F2_n828TBT16_CRT_DATETIME ;
   private String[] BC001F2_A829TBT16_CRT_USER_ID ;
   private boolean[] BC001F2_n829TBT16_CRT_USER_ID ;
   private java.util.Date[] BC001F2_A831TBT16_UPD_DATETIME ;
   private boolean[] BC001F2_n831TBT16_UPD_DATETIME ;
   private String[] BC001F2_A832TBT16_UPD_USER_ID ;
   private boolean[] BC001F2_n832TBT16_UPD_USER_ID ;
   private long[] BC001F2_A834TBT16_UPD_CNT ;
   private boolean[] BC001F2_n834TBT16_UPD_CNT ;
   private String[] BC001F2_A824TBT16_IMPORT_FILE_NM ;
   private boolean[] BC001F2_n824TBT16_IMPORT_FILE_NM ;
   private String[] BC001F2_A825TBT16_FILE_NM ;
   private boolean[] BC001F2_n825TBT16_FILE_NM ;
   private java.util.Date[] BC001F2_A826TBT16_IMPORT_DATETIME ;
   private boolean[] BC001F2_n826TBT16_IMPORT_DATETIME ;
   private String[] BC001F2_A827TBT16_DEL_FLG ;
   private boolean[] BC001F2_n827TBT16_DEL_FLG ;
   private String[] BC001F2_A830TBT16_CRT_PROG_NM ;
   private boolean[] BC001F2_n830TBT16_CRT_PROG_NM ;
   private String[] BC001F2_A833TBT16_UPD_PROG_NM ;
   private boolean[] BC001F2_n833TBT16_UPD_PROG_NM ;
   private long[] BC001F7_A823TBT16_IMPORT_NO ;
   private long[] BC001F10_A823TBT16_IMPORT_NO ;
   private java.util.Date[] BC001F10_A828TBT16_CRT_DATETIME ;
   private boolean[] BC001F10_n828TBT16_CRT_DATETIME ;
   private String[] BC001F10_A829TBT16_CRT_USER_ID ;
   private boolean[] BC001F10_n829TBT16_CRT_USER_ID ;
   private java.util.Date[] BC001F10_A831TBT16_UPD_DATETIME ;
   private boolean[] BC001F10_n831TBT16_UPD_DATETIME ;
   private String[] BC001F10_A832TBT16_UPD_USER_ID ;
   private boolean[] BC001F10_n832TBT16_UPD_USER_ID ;
   private long[] BC001F10_A834TBT16_UPD_CNT ;
   private boolean[] BC001F10_n834TBT16_UPD_CNT ;
   private String[] BC001F10_A824TBT16_IMPORT_FILE_NM ;
   private boolean[] BC001F10_n824TBT16_IMPORT_FILE_NM ;
   private String[] BC001F10_A825TBT16_FILE_NM ;
   private boolean[] BC001F10_n825TBT16_FILE_NM ;
   private java.util.Date[] BC001F10_A826TBT16_IMPORT_DATETIME ;
   private boolean[] BC001F10_n826TBT16_IMPORT_DATETIME ;
   private String[] BC001F10_A827TBT16_DEL_FLG ;
   private boolean[] BC001F10_n827TBT16_DEL_FLG ;
   private String[] BC001F10_A830TBT16_CRT_PROG_NM ;
   private boolean[] BC001F10_n830TBT16_CRT_PROG_NM ;
   private String[] BC001F10_A833TBT16_UPD_PROG_NM ;
   private boolean[] BC001F10_n833TBT16_UPD_PROG_NM ;
}

final  class tbt16_import_history_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001F2", "SELECT `TBT16_IMPORT_NO`, `TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001F3", "SELECT `TBT16_IMPORT_NO`, `TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001F4", "SELECT TM1.`TBT16_IMPORT_NO`, TM1.`TBT16_CRT_DATETIME`, TM1.`TBT16_CRT_USER_ID`, TM1.`TBT16_UPD_DATETIME`, TM1.`TBT16_UPD_USER_ID`, TM1.`TBT16_UPD_CNT`, TM1.`TBT16_IMPORT_FILE_NM`, TM1.`TBT16_FILE_NM`, TM1.`TBT16_IMPORT_DATETIME`, TM1.`TBT16_DEL_FLG`, TM1.`TBT16_CRT_PROG_NM`, TM1.`TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` TM1 WHERE TM1.`TBT16_IMPORT_NO` = ? ORDER BY TM1.`TBT16_IMPORT_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC001F5", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001F6", "INSERT INTO `TBT16_IMPORT_HISTORY` (`TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new ForEachCursor("BC001F7", "SELECT LAST_INSERT_ID() ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001F8", "UPDATE `TBT16_IMPORT_HISTORY` SET `TBT16_CRT_DATETIME`=?, `TBT16_CRT_USER_ID`=?, `TBT16_UPD_DATETIME`=?, `TBT16_UPD_USER_ID`=?, `TBT16_UPD_CNT`=?, `TBT16_IMPORT_FILE_NM`=?, `TBT16_FILE_NM`=?, `TBT16_IMPORT_DATETIME`=?, `TBT16_DEL_FLG`=?, `TBT16_CRT_PROG_NM`=?, `TBT16_UPD_PROG_NM`=?  WHERE `TBT16_IMPORT_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001F9", "DELETE FROM `TBT16_IMPORT_HISTORY`  WHERE `TBT16_IMPORT_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001F10", "SELECT TM1.`TBT16_IMPORT_NO`, TM1.`TBT16_CRT_DATETIME`, TM1.`TBT16_CRT_USER_ID`, TM1.`TBT16_UPD_DATETIME`, TM1.`TBT16_UPD_USER_ID`, TM1.`TBT16_UPD_CNT`, TM1.`TBT16_IMPORT_FILE_NM`, TM1.`TBT16_FILE_NM`, TM1.`TBT16_IMPORT_DATETIME`, TM1.`TBT16_DEL_FLG`, TM1.`TBT16_CRT_PROG_NM`, TM1.`TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` TM1 WHERE TM1.`TBT16_IMPORT_NO` = ? ORDER BY TM1.`TBT16_IMPORT_NO` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 4 :
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
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
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
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
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
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
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
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setLong(12, ((Number) parms[22]).longValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

