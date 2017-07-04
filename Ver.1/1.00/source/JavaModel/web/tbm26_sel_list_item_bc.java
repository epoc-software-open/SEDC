/*
               File: tbm26_sel_list_item_bc
        Description: 選択リスト項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:7.8
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm26_sel_list_item_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm26_sel_list_item_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm26_sel_list_item_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm26_sel_list_item_bc.class ));
   }

   public tbm26_sel_list_item_bc( int remoteHandle ,
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
         /* Execute user event: e120Y2 */
         e120Y2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z446TBM26_STUDY_ID = A446TBM26_STUDY_ID ;
            Z447TBM26_LIST_CD = A447TBM26_LIST_CD ;
            Z448TBM26_LIST_ITEM_NO = A448TBM26_LIST_ITEM_NO ;
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

   public void confirm_0Y0( )
   {
      beforeValidate0Y33( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0Y33( ) ;
         }
         else
         {
            checkExtendedTable0Y33( ) ;
            if ( AnyError == 0 )
            {
               zm0Y33( 9) ;
            }
            closeExtendedTableCursors0Y33( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110Y2( )
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

   public void e120Y2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A447TBM26_LIST_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A448TBM26_LIST_ITEM_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A449TBM26_LIST_ITEM_NAME + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A450TBM26_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A451TBM26_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A452TBM26_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm26_sel_list_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A453TBM26_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A454TBM26_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A455TBM26_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm26_sel_list_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A456TBM26_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A457TBM26_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1166( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0Y33( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z452TBM26_CRT_DATETIME = A452TBM26_CRT_DATETIME ;
         Z453TBM26_CRT_USER_ID = A453TBM26_CRT_USER_ID ;
         Z455TBM26_UPD_DATETIME = A455TBM26_UPD_DATETIME ;
         Z456TBM26_UPD_USER_ID = A456TBM26_UPD_USER_ID ;
         Z458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
         Z449TBM26_LIST_ITEM_NAME = A449TBM26_LIST_ITEM_NAME ;
         Z450TBM26_INNER_VALUE = A450TBM26_INNER_VALUE ;
         Z451TBM26_DEL_FLG = A451TBM26_DEL_FLG ;
         Z454TBM26_CRT_PROG_NM = A454TBM26_CRT_PROG_NM ;
         Z457TBM26_UPD_PROG_NM = A457TBM26_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z448TBM26_LIST_ITEM_NO = A448TBM26_LIST_ITEM_NO ;
         Z452TBM26_CRT_DATETIME = A452TBM26_CRT_DATETIME ;
         Z453TBM26_CRT_USER_ID = A453TBM26_CRT_USER_ID ;
         Z455TBM26_UPD_DATETIME = A455TBM26_UPD_DATETIME ;
         Z456TBM26_UPD_USER_ID = A456TBM26_UPD_USER_ID ;
         Z458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
         Z449TBM26_LIST_ITEM_NAME = A449TBM26_LIST_ITEM_NAME ;
         Z450TBM26_INNER_VALUE = A450TBM26_INNER_VALUE ;
         Z451TBM26_DEL_FLG = A451TBM26_DEL_FLG ;
         Z454TBM26_CRT_PROG_NM = A454TBM26_CRT_PROG_NM ;
         Z457TBM26_UPD_PROG_NM = A457TBM26_UPD_PROG_NM ;
         Z446TBM26_STUDY_ID = A446TBM26_STUDY_ID ;
         Z447TBM26_LIST_CD = A447TBM26_LIST_CD ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0Y33( )
   {
      /* Using cursor BC000Y5 */
      pr_default.execute(3, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A452TBM26_CRT_DATETIME = BC000Y5_A452TBM26_CRT_DATETIME[0] ;
         n452TBM26_CRT_DATETIME = BC000Y5_n452TBM26_CRT_DATETIME[0] ;
         A453TBM26_CRT_USER_ID = BC000Y5_A453TBM26_CRT_USER_ID[0] ;
         n453TBM26_CRT_USER_ID = BC000Y5_n453TBM26_CRT_USER_ID[0] ;
         A455TBM26_UPD_DATETIME = BC000Y5_A455TBM26_UPD_DATETIME[0] ;
         n455TBM26_UPD_DATETIME = BC000Y5_n455TBM26_UPD_DATETIME[0] ;
         A456TBM26_UPD_USER_ID = BC000Y5_A456TBM26_UPD_USER_ID[0] ;
         n456TBM26_UPD_USER_ID = BC000Y5_n456TBM26_UPD_USER_ID[0] ;
         A458TBM26_UPD_CNT = BC000Y5_A458TBM26_UPD_CNT[0] ;
         n458TBM26_UPD_CNT = BC000Y5_n458TBM26_UPD_CNT[0] ;
         A449TBM26_LIST_ITEM_NAME = BC000Y5_A449TBM26_LIST_ITEM_NAME[0] ;
         n449TBM26_LIST_ITEM_NAME = BC000Y5_n449TBM26_LIST_ITEM_NAME[0] ;
         A450TBM26_INNER_VALUE = BC000Y5_A450TBM26_INNER_VALUE[0] ;
         n450TBM26_INNER_VALUE = BC000Y5_n450TBM26_INNER_VALUE[0] ;
         A451TBM26_DEL_FLG = BC000Y5_A451TBM26_DEL_FLG[0] ;
         n451TBM26_DEL_FLG = BC000Y5_n451TBM26_DEL_FLG[0] ;
         A454TBM26_CRT_PROG_NM = BC000Y5_A454TBM26_CRT_PROG_NM[0] ;
         n454TBM26_CRT_PROG_NM = BC000Y5_n454TBM26_CRT_PROG_NM[0] ;
         A457TBM26_UPD_PROG_NM = BC000Y5_A457TBM26_UPD_PROG_NM[0] ;
         n457TBM26_UPD_PROG_NM = BC000Y5_n457TBM26_UPD_PROG_NM[0] ;
         zm0Y33( -8) ;
      }
      pr_default.close(3);
      onLoadActions0Y33( ) ;
   }

   public void onLoadActions0Y33( )
   {
      AV9Pgmname = "TBM26_SEL_LIST_ITEM_BC" ;
   }

   public void checkExtendedTable0Y33( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM26_SEL_LIST_ITEM_BC" ;
      /* Using cursor BC000Y4 */
      pr_default.execute(2, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError446 = 1 ;
         AnyError447 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リスト項目マスタ・選択リストサブタイプ'", "ForeignKeyNotFound", 1, "TBM26_STUDY_ID");
         AnyError = (short)(1) ;
      }
      if ( ( AnyError446 == 0 ) && ( AnyError447 == 0 ) )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A452TBM26_CRT_DATETIME) || (( A452TBM26_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A452TBM26_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A455TBM26_UPD_DATETIME) || (( A455TBM26_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A455TBM26_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0Y33( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey0Y33( )
   {
      /* Using cursor BC000Y6 */
      pr_default.execute(4, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound33 = (short)(1) ;
      }
      else
      {
         RcdFound33 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000Y3 */
      pr_default.execute(1, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Y33( 8) ;
         RcdFound33 = (short)(1) ;
         A448TBM26_LIST_ITEM_NO = BC000Y3_A448TBM26_LIST_ITEM_NO[0] ;
         A452TBM26_CRT_DATETIME = BC000Y3_A452TBM26_CRT_DATETIME[0] ;
         n452TBM26_CRT_DATETIME = BC000Y3_n452TBM26_CRT_DATETIME[0] ;
         A453TBM26_CRT_USER_ID = BC000Y3_A453TBM26_CRT_USER_ID[0] ;
         n453TBM26_CRT_USER_ID = BC000Y3_n453TBM26_CRT_USER_ID[0] ;
         A455TBM26_UPD_DATETIME = BC000Y3_A455TBM26_UPD_DATETIME[0] ;
         n455TBM26_UPD_DATETIME = BC000Y3_n455TBM26_UPD_DATETIME[0] ;
         A456TBM26_UPD_USER_ID = BC000Y3_A456TBM26_UPD_USER_ID[0] ;
         n456TBM26_UPD_USER_ID = BC000Y3_n456TBM26_UPD_USER_ID[0] ;
         A458TBM26_UPD_CNT = BC000Y3_A458TBM26_UPD_CNT[0] ;
         n458TBM26_UPD_CNT = BC000Y3_n458TBM26_UPD_CNT[0] ;
         A449TBM26_LIST_ITEM_NAME = BC000Y3_A449TBM26_LIST_ITEM_NAME[0] ;
         n449TBM26_LIST_ITEM_NAME = BC000Y3_n449TBM26_LIST_ITEM_NAME[0] ;
         A450TBM26_INNER_VALUE = BC000Y3_A450TBM26_INNER_VALUE[0] ;
         n450TBM26_INNER_VALUE = BC000Y3_n450TBM26_INNER_VALUE[0] ;
         A451TBM26_DEL_FLG = BC000Y3_A451TBM26_DEL_FLG[0] ;
         n451TBM26_DEL_FLG = BC000Y3_n451TBM26_DEL_FLG[0] ;
         A454TBM26_CRT_PROG_NM = BC000Y3_A454TBM26_CRT_PROG_NM[0] ;
         n454TBM26_CRT_PROG_NM = BC000Y3_n454TBM26_CRT_PROG_NM[0] ;
         A457TBM26_UPD_PROG_NM = BC000Y3_A457TBM26_UPD_PROG_NM[0] ;
         n457TBM26_UPD_PROG_NM = BC000Y3_n457TBM26_UPD_PROG_NM[0] ;
         A446TBM26_STUDY_ID = BC000Y3_A446TBM26_STUDY_ID[0] ;
         A447TBM26_LIST_CD = BC000Y3_A447TBM26_LIST_CD[0] ;
         O458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
         n458TBM26_UPD_CNT = false ;
         Z446TBM26_STUDY_ID = A446TBM26_STUDY_ID ;
         Z447TBM26_LIST_CD = A447TBM26_LIST_CD ;
         Z448TBM26_LIST_ITEM_NO = A448TBM26_LIST_ITEM_NO ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0Y33( ) ;
         Gx_mode = sMode33 ;
      }
      else
      {
         RcdFound33 = (short)(0) ;
         initializeNonKey0Y33( ) ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode33 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Y33( ) ;
      if ( RcdFound33 == 0 )
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
      confirm_0Y0( ) ;
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

   public void checkOptimisticConcurrency0Y33( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000Y2 */
         pr_default.execute(0, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM26_SEL_LIST_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z452TBM26_CRT_DATETIME.equals( BC000Y2_A452TBM26_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z453TBM26_CRT_USER_ID, BC000Y2_A453TBM26_CRT_USER_ID[0]) != 0 ) || !( Z455TBM26_UPD_DATETIME.equals( BC000Y2_A455TBM26_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z456TBM26_UPD_USER_ID, BC000Y2_A456TBM26_UPD_USER_ID[0]) != 0 ) || ( Z458TBM26_UPD_CNT != BC000Y2_A458TBM26_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z449TBM26_LIST_ITEM_NAME, BC000Y2_A449TBM26_LIST_ITEM_NAME[0]) != 0 ) || ( GXutil.strcmp(Z450TBM26_INNER_VALUE, BC000Y2_A450TBM26_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z451TBM26_DEL_FLG, BC000Y2_A451TBM26_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z454TBM26_CRT_PROG_NM, BC000Y2_A454TBM26_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z457TBM26_UPD_PROG_NM, BC000Y2_A457TBM26_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM26_SEL_LIST_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Y33( )
   {
      beforeValidate0Y33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y33( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Y33( 0) ;
         checkOptimisticConcurrency0Y33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y33( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Y33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000Y7 */
                  pr_default.execute(5, new Object[] {new Short(A448TBM26_LIST_ITEM_NO), new Boolean(n452TBM26_CRT_DATETIME), A452TBM26_CRT_DATETIME, new Boolean(n453TBM26_CRT_USER_ID), A453TBM26_CRT_USER_ID, new Boolean(n455TBM26_UPD_DATETIME), A455TBM26_UPD_DATETIME, new Boolean(n456TBM26_UPD_USER_ID), A456TBM26_UPD_USER_ID, new Boolean(n458TBM26_UPD_CNT), new Long(A458TBM26_UPD_CNT), new Boolean(n449TBM26_LIST_ITEM_NAME), A449TBM26_LIST_ITEM_NAME, new Boolean(n450TBM26_INNER_VALUE), A450TBM26_INNER_VALUE, new Boolean(n451TBM26_DEL_FLG), A451TBM26_DEL_FLG, new Boolean(n454TBM26_CRT_PROG_NM), A454TBM26_CRT_PROG_NM, new Boolean(n457TBM26_UPD_PROG_NM), A457TBM26_UPD_PROG_NM, new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD});
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
            load0Y33( ) ;
         }
         endLevel0Y33( ) ;
      }
      closeExtendedTableCursors0Y33( ) ;
   }

   public void update0Y33( )
   {
      beforeValidate0Y33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y33( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y33( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Y33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000Y8 */
                  pr_default.execute(6, new Object[] {new Boolean(n452TBM26_CRT_DATETIME), A452TBM26_CRT_DATETIME, new Boolean(n453TBM26_CRT_USER_ID), A453TBM26_CRT_USER_ID, new Boolean(n455TBM26_UPD_DATETIME), A455TBM26_UPD_DATETIME, new Boolean(n456TBM26_UPD_USER_ID), A456TBM26_UPD_USER_ID, new Boolean(n458TBM26_UPD_CNT), new Long(A458TBM26_UPD_CNT), new Boolean(n449TBM26_LIST_ITEM_NAME), A449TBM26_LIST_ITEM_NAME, new Boolean(n450TBM26_INNER_VALUE), A450TBM26_INNER_VALUE, new Boolean(n451TBM26_DEL_FLG), A451TBM26_DEL_FLG, new Boolean(n454TBM26_CRT_PROG_NM), A454TBM26_CRT_PROG_NM, new Boolean(n457TBM26_UPD_PROG_NM), A457TBM26_UPD_PROG_NM, new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM26_SEL_LIST_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Y33( ) ;
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
         endLevel0Y33( ) ;
      }
      closeExtendedTableCursors0Y33( ) ;
   }

   public void deferredUpdate0Y33( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0Y33( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y33( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Y33( ) ;
         afterConfirm0Y33( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Y33( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000Y9 */
               pr_default.execute(7, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
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
      sMode33 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0Y33( ) ;
      Gx_mode = sMode33 ;
   }

   public void onDeleteControls0Y33( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM26_SEL_LIST_ITEM_BC" ;
      }
   }

   public void endLevel0Y33( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Y33( ) ;
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

   public void scanKeyStart0Y33( )
   {
      /* Using cursor BC000Y10 */
      pr_default.execute(8, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A448TBM26_LIST_ITEM_NO = BC000Y10_A448TBM26_LIST_ITEM_NO[0] ;
         A452TBM26_CRT_DATETIME = BC000Y10_A452TBM26_CRT_DATETIME[0] ;
         n452TBM26_CRT_DATETIME = BC000Y10_n452TBM26_CRT_DATETIME[0] ;
         A453TBM26_CRT_USER_ID = BC000Y10_A453TBM26_CRT_USER_ID[0] ;
         n453TBM26_CRT_USER_ID = BC000Y10_n453TBM26_CRT_USER_ID[0] ;
         A455TBM26_UPD_DATETIME = BC000Y10_A455TBM26_UPD_DATETIME[0] ;
         n455TBM26_UPD_DATETIME = BC000Y10_n455TBM26_UPD_DATETIME[0] ;
         A456TBM26_UPD_USER_ID = BC000Y10_A456TBM26_UPD_USER_ID[0] ;
         n456TBM26_UPD_USER_ID = BC000Y10_n456TBM26_UPD_USER_ID[0] ;
         A458TBM26_UPD_CNT = BC000Y10_A458TBM26_UPD_CNT[0] ;
         n458TBM26_UPD_CNT = BC000Y10_n458TBM26_UPD_CNT[0] ;
         A449TBM26_LIST_ITEM_NAME = BC000Y10_A449TBM26_LIST_ITEM_NAME[0] ;
         n449TBM26_LIST_ITEM_NAME = BC000Y10_n449TBM26_LIST_ITEM_NAME[0] ;
         A450TBM26_INNER_VALUE = BC000Y10_A450TBM26_INNER_VALUE[0] ;
         n450TBM26_INNER_VALUE = BC000Y10_n450TBM26_INNER_VALUE[0] ;
         A451TBM26_DEL_FLG = BC000Y10_A451TBM26_DEL_FLG[0] ;
         n451TBM26_DEL_FLG = BC000Y10_n451TBM26_DEL_FLG[0] ;
         A454TBM26_CRT_PROG_NM = BC000Y10_A454TBM26_CRT_PROG_NM[0] ;
         n454TBM26_CRT_PROG_NM = BC000Y10_n454TBM26_CRT_PROG_NM[0] ;
         A457TBM26_UPD_PROG_NM = BC000Y10_A457TBM26_UPD_PROG_NM[0] ;
         n457TBM26_UPD_PROG_NM = BC000Y10_n457TBM26_UPD_PROG_NM[0] ;
         A446TBM26_STUDY_ID = BC000Y10_A446TBM26_STUDY_ID[0] ;
         A447TBM26_LIST_CD = BC000Y10_A447TBM26_LIST_CD[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0Y33( )
   {
      pr_default.readNext(8);
      RcdFound33 = (short)(0) ;
      scanKeyLoad0Y33( ) ;
   }

   public void scanKeyLoad0Y33( )
   {
      sMode33 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A448TBM26_LIST_ITEM_NO = BC000Y10_A448TBM26_LIST_ITEM_NO[0] ;
         A452TBM26_CRT_DATETIME = BC000Y10_A452TBM26_CRT_DATETIME[0] ;
         n452TBM26_CRT_DATETIME = BC000Y10_n452TBM26_CRT_DATETIME[0] ;
         A453TBM26_CRT_USER_ID = BC000Y10_A453TBM26_CRT_USER_ID[0] ;
         n453TBM26_CRT_USER_ID = BC000Y10_n453TBM26_CRT_USER_ID[0] ;
         A455TBM26_UPD_DATETIME = BC000Y10_A455TBM26_UPD_DATETIME[0] ;
         n455TBM26_UPD_DATETIME = BC000Y10_n455TBM26_UPD_DATETIME[0] ;
         A456TBM26_UPD_USER_ID = BC000Y10_A456TBM26_UPD_USER_ID[0] ;
         n456TBM26_UPD_USER_ID = BC000Y10_n456TBM26_UPD_USER_ID[0] ;
         A458TBM26_UPD_CNT = BC000Y10_A458TBM26_UPD_CNT[0] ;
         n458TBM26_UPD_CNT = BC000Y10_n458TBM26_UPD_CNT[0] ;
         A449TBM26_LIST_ITEM_NAME = BC000Y10_A449TBM26_LIST_ITEM_NAME[0] ;
         n449TBM26_LIST_ITEM_NAME = BC000Y10_n449TBM26_LIST_ITEM_NAME[0] ;
         A450TBM26_INNER_VALUE = BC000Y10_A450TBM26_INNER_VALUE[0] ;
         n450TBM26_INNER_VALUE = BC000Y10_n450TBM26_INNER_VALUE[0] ;
         A451TBM26_DEL_FLG = BC000Y10_A451TBM26_DEL_FLG[0] ;
         n451TBM26_DEL_FLG = BC000Y10_n451TBM26_DEL_FLG[0] ;
         A454TBM26_CRT_PROG_NM = BC000Y10_A454TBM26_CRT_PROG_NM[0] ;
         n454TBM26_CRT_PROG_NM = BC000Y10_n454TBM26_CRT_PROG_NM[0] ;
         A457TBM26_UPD_PROG_NM = BC000Y10_A457TBM26_UPD_PROG_NM[0] ;
         n457TBM26_UPD_PROG_NM = BC000Y10_n457TBM26_UPD_PROG_NM[0] ;
         A446TBM26_STUDY_ID = BC000Y10_A446TBM26_STUDY_ID[0] ;
         A447TBM26_LIST_CD = BC000Y10_A447TBM26_LIST_CD[0] ;
      }
      Gx_mode = sMode33 ;
   }

   public void scanKeyEnd0Y33( )
   {
      pr_default.close(8);
   }

   public void afterConfirm0Y33( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Y33( )
   {
      /* Before Insert Rules */
      A452TBM26_CRT_DATETIME = GXutil.now( ) ;
      n452TBM26_CRT_DATETIME = false ;
      GXt_char1 = A453TBM26_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm26_sel_list_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A453TBM26_CRT_USER_ID = GXt_char1 ;
      n453TBM26_CRT_USER_ID = false ;
      A455TBM26_UPD_DATETIME = GXutil.now( ) ;
      n455TBM26_UPD_DATETIME = false ;
      GXt_char1 = A456TBM26_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm26_sel_list_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A456TBM26_UPD_USER_ID = GXt_char1 ;
      n456TBM26_UPD_USER_ID = false ;
      A458TBM26_UPD_CNT = (long)(O458TBM26_UPD_CNT+1) ;
      n458TBM26_UPD_CNT = false ;
   }

   public void beforeUpdate0Y33( )
   {
      /* Before Update Rules */
      A455TBM26_UPD_DATETIME = GXutil.now( ) ;
      n455TBM26_UPD_DATETIME = false ;
      GXt_char1 = A456TBM26_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm26_sel_list_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A456TBM26_UPD_USER_ID = GXt_char1 ;
      n456TBM26_UPD_USER_ID = false ;
      A458TBM26_UPD_CNT = (long)(O458TBM26_UPD_CNT+1) ;
      n458TBM26_UPD_CNT = false ;
   }

   public void beforeDelete0Y33( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Y33( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Y33( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Y33( )
   {
   }

   public void addRow0Y33( )
   {
      VarsToRow33( bcTBM26_SEL_LIST_ITEM) ;
   }

   public void readRow0Y33( )
   {
      RowToVars33( bcTBM26_SEL_LIST_ITEM, 1) ;
   }

   public void initializeNonKey0Y33( )
   {
      A452TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n452TBM26_CRT_DATETIME = false ;
      A453TBM26_CRT_USER_ID = "" ;
      n453TBM26_CRT_USER_ID = false ;
      A455TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n455TBM26_UPD_DATETIME = false ;
      A456TBM26_UPD_USER_ID = "" ;
      n456TBM26_UPD_USER_ID = false ;
      A458TBM26_UPD_CNT = 0 ;
      n458TBM26_UPD_CNT = false ;
      A449TBM26_LIST_ITEM_NAME = "" ;
      n449TBM26_LIST_ITEM_NAME = false ;
      A450TBM26_INNER_VALUE = "" ;
      n450TBM26_INNER_VALUE = false ;
      A451TBM26_DEL_FLG = "" ;
      n451TBM26_DEL_FLG = false ;
      A454TBM26_CRT_PROG_NM = "" ;
      n454TBM26_CRT_PROG_NM = false ;
      A457TBM26_UPD_PROG_NM = "" ;
      n457TBM26_UPD_PROG_NM = false ;
      O458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
      n458TBM26_UPD_CNT = false ;
   }

   public void initAll0Y33( )
   {
      A446TBM26_STUDY_ID = 0 ;
      A447TBM26_LIST_CD = "" ;
      A448TBM26_LIST_ITEM_NO = (short)(0) ;
      initializeNonKey0Y33( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow33( SdtTBM26_SEL_LIST_ITEM obj33 )
   {
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Mode( Gx_mode );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime( A452TBM26_CRT_DATETIME );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id( A453TBM26_CRT_USER_ID );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime( A455TBM26_UPD_DATETIME );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id( A456TBM26_UPD_USER_ID );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt( A458TBM26_UPD_CNT );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name( A449TBM26_LIST_ITEM_NAME );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value( A450TBM26_INNER_VALUE );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg( A451TBM26_DEL_FLG );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm( A454TBM26_CRT_PROG_NM );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm( A457TBM26_UPD_PROG_NM );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id( A446TBM26_STUDY_ID );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd( A447TBM26_LIST_CD );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no( A448TBM26_LIST_ITEM_NO );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z( Z446TBM26_STUDY_ID );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z( Z447TBM26_LIST_CD );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z( Z448TBM26_LIST_ITEM_NO );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z( Z449TBM26_LIST_ITEM_NAME );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z( Z450TBM26_INNER_VALUE );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z( Z451TBM26_DEL_FLG );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z( Z452TBM26_CRT_DATETIME );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z( Z453TBM26_CRT_USER_ID );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z( Z454TBM26_CRT_PROG_NM );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z( Z455TBM26_UPD_DATETIME );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z( Z456TBM26_UPD_USER_ID );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z( Z457TBM26_UPD_PROG_NM );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z( Z458TBM26_UPD_CNT );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N( (byte)((byte)((n449TBM26_LIST_ITEM_NAME)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N( (byte)((byte)((n450TBM26_INNER_VALUE)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N( (byte)((byte)((n451TBM26_DEL_FLG)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N( (byte)((byte)((n452TBM26_CRT_DATETIME)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N( (byte)((byte)((n453TBM26_CRT_USER_ID)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N( (byte)((byte)((n454TBM26_CRT_PROG_NM)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N( (byte)((byte)((n455TBM26_UPD_DATETIME)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N( (byte)((byte)((n456TBM26_UPD_USER_ID)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N( (byte)((byte)((n457TBM26_UPD_PROG_NM)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N( (byte)((byte)((n458TBM26_UPD_CNT)?1:0)) );
      obj33.setgxTv_SdtTBM26_SEL_LIST_ITEM_Mode( Gx_mode );
   }

   public void RowToVars33( SdtTBM26_SEL_LIST_ITEM obj33 ,
                            int forceLoad )
   {
      Gx_mode = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Mode() ;
      A452TBM26_CRT_DATETIME = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime() ;
      n452TBM26_CRT_DATETIME = false ;
      A453TBM26_CRT_USER_ID = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id() ;
      n453TBM26_CRT_USER_ID = false ;
      A455TBM26_UPD_DATETIME = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime() ;
      n455TBM26_UPD_DATETIME = false ;
      A456TBM26_UPD_USER_ID = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id() ;
      n456TBM26_UPD_USER_ID = false ;
      A458TBM26_UPD_CNT = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt() ;
      n458TBM26_UPD_CNT = false ;
      A449TBM26_LIST_ITEM_NAME = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name() ;
      n449TBM26_LIST_ITEM_NAME = false ;
      A450TBM26_INNER_VALUE = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value() ;
      n450TBM26_INNER_VALUE = false ;
      A451TBM26_DEL_FLG = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg() ;
      n451TBM26_DEL_FLG = false ;
      A454TBM26_CRT_PROG_NM = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm() ;
      n454TBM26_CRT_PROG_NM = false ;
      A457TBM26_UPD_PROG_NM = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm() ;
      n457TBM26_UPD_PROG_NM = false ;
      A446TBM26_STUDY_ID = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id() ;
      A447TBM26_LIST_CD = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd() ;
      A448TBM26_LIST_ITEM_NO = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no() ;
      Z446TBM26_STUDY_ID = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z() ;
      Z447TBM26_LIST_CD = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z() ;
      Z448TBM26_LIST_ITEM_NO = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z() ;
      Z449TBM26_LIST_ITEM_NAME = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z() ;
      Z450TBM26_INNER_VALUE = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z() ;
      Z451TBM26_DEL_FLG = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z() ;
      Z452TBM26_CRT_DATETIME = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z() ;
      Z453TBM26_CRT_USER_ID = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z() ;
      Z454TBM26_CRT_PROG_NM = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z() ;
      Z455TBM26_UPD_DATETIME = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z() ;
      Z456TBM26_UPD_USER_ID = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z() ;
      Z457TBM26_UPD_PROG_NM = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z() ;
      Z458TBM26_UPD_CNT = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z() ;
      O458TBM26_UPD_CNT = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z() ;
      n449TBM26_LIST_ITEM_NAME = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N()==0)?false:true) ;
      n450TBM26_INNER_VALUE = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N()==0)?false:true) ;
      n451TBM26_DEL_FLG = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N()==0)?false:true) ;
      n452TBM26_CRT_DATETIME = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N()==0)?false:true) ;
      n453TBM26_CRT_USER_ID = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N()==0)?false:true) ;
      n454TBM26_CRT_PROG_NM = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N()==0)?false:true) ;
      n455TBM26_UPD_DATETIME = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N()==0)?false:true) ;
      n456TBM26_UPD_USER_ID = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N()==0)?false:true) ;
      n457TBM26_UPD_PROG_NM = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N()==0)?false:true) ;
      n458TBM26_UPD_CNT = (boolean)((obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj33.getgxTv_SdtTBM26_SEL_LIST_ITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A446TBM26_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A447TBM26_LIST_CD = (String)getParm(obj,1) ;
      A448TBM26_LIST_ITEM_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0Y33( ) ;
      scanKeyStart0Y33( ) ;
      if ( RcdFound33 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000Y11 */
         pr_default.execute(9, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD});
         if ( (pr_default.getStatus(9) == 101) )
         {
            AnyError446 = 1 ;
            AnyError447 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'選択リスト項目マスタ・選択リストサブタイプ'", "ForeignKeyNotFound", 1, "TBM26_STUDY_ID");
            AnyError = (short)(1) ;
         }
         if ( ( AnyError446 == 0 ) && ( AnyError447 == 0 ) )
         {
         }
         pr_default.close(9);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z446TBM26_STUDY_ID = A446TBM26_STUDY_ID ;
         Z447TBM26_LIST_CD = A447TBM26_LIST_CD ;
         Z448TBM26_LIST_ITEM_NO = A448TBM26_LIST_ITEM_NO ;
         O458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
         n458TBM26_UPD_CNT = false ;
      }
      zm0Y33( -8) ;
      sMode33 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0Y33( ) ;
      Gx_mode = sMode33 ;
      addRow0Y33( ) ;
      scanKeyEnd0Y33( ) ;
      if ( RcdFound33 == 0 )
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
      RowToVars33( bcTBM26_SEL_LIST_ITEM, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0Y33( ) ;
      if ( RcdFound33 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A446TBM26_STUDY_ID != Z446TBM26_STUDY_ID ) || ( GXutil.strcmp(A447TBM26_LIST_CD, Z447TBM26_LIST_CD) != 0 ) || ( A448TBM26_LIST_ITEM_NO != Z448TBM26_LIST_ITEM_NO ) )
         {
            A446TBM26_STUDY_ID = Z446TBM26_STUDY_ID ;
            A447TBM26_LIST_CD = Z447TBM26_LIST_CD ;
            A448TBM26_LIST_ITEM_NO = Z448TBM26_LIST_ITEM_NO ;
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
            update0Y33( ) ;
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
            if ( ( A446TBM26_STUDY_ID != Z446TBM26_STUDY_ID ) || ( GXutil.strcmp(A447TBM26_LIST_CD, Z447TBM26_LIST_CD) != 0 ) || ( A448TBM26_LIST_ITEM_NO != Z448TBM26_LIST_ITEM_NO ) )
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
                  insert0Y33( ) ;
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
                  insert0Y33( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow33( bcTBM26_SEL_LIST_ITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars33( bcTBM26_SEL_LIST_ITEM, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0Y33( ) ;
      if ( RcdFound33 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A446TBM26_STUDY_ID != Z446TBM26_STUDY_ID ) || ( GXutil.strcmp(A447TBM26_LIST_CD, Z447TBM26_LIST_CD) != 0 ) || ( A448TBM26_LIST_ITEM_NO != Z448TBM26_LIST_ITEM_NO ) )
         {
            A446TBM26_STUDY_ID = Z446TBM26_STUDY_ID ;
            A447TBM26_LIST_CD = Z447TBM26_LIST_CD ;
            A448TBM26_LIST_ITEM_NO = Z448TBM26_LIST_ITEM_NO ;
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
         if ( ( A446TBM26_STUDY_ID != Z446TBM26_STUDY_ID ) || ( GXutil.strcmp(A447TBM26_LIST_CD, Z447TBM26_LIST_CD) != 0 ) || ( A448TBM26_LIST_ITEM_NO != Z448TBM26_LIST_ITEM_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm26_sel_list_item_bc");
      VarsToRow33( bcTBM26_SEL_LIST_ITEM) ;
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
      Gx_mode = bcTBM26_SEL_LIST_ITEM.getgxTv_SdtTBM26_SEL_LIST_ITEM_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM26_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM26_SEL_LIST_ITEM sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM26_SEL_LIST_ITEM )
      {
         bcTBM26_SEL_LIST_ITEM = sdt ;
         if ( GXutil.strcmp(bcTBM26_SEL_LIST_ITEM.getgxTv_SdtTBM26_SEL_LIST_ITEM_Mode(), "") == 0 )
         {
            bcTBM26_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow33( bcTBM26_SEL_LIST_ITEM) ;
         }
         else
         {
            RowToVars33( bcTBM26_SEL_LIST_ITEM, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM26_SEL_LIST_ITEM.getgxTv_SdtTBM26_SEL_LIST_ITEM_Mode(), "") == 0 )
         {
            bcTBM26_SEL_LIST_ITEM.setgxTv_SdtTBM26_SEL_LIST_ITEM_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars33( bcTBM26_SEL_LIST_ITEM, 1) ;
   }

   public SdtTBM26_SEL_LIST_ITEM getTBM26_SEL_LIST_ITEM_BC( )
   {
      return bcTBM26_SEL_LIST_ITEM ;
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
                  /* Execute user subroutine: S1166 */
                  S1166 ();
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
      Z447TBM26_LIST_CD = "" ;
      A447TBM26_LIST_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A449TBM26_LIST_ITEM_NAME = "" ;
      A450TBM26_INNER_VALUE = "" ;
      A451TBM26_DEL_FLG = "" ;
      A452TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A453TBM26_CRT_USER_ID = "" ;
      A454TBM26_CRT_PROG_NM = "" ;
      A455TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A456TBM26_UPD_USER_ID = "" ;
      A457TBM26_UPD_PROG_NM = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z = "" ;
      Z452TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z453TBM26_CRT_USER_ID = "" ;
      Z455TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z456TBM26_UPD_USER_ID = "" ;
      Z449TBM26_LIST_ITEM_NAME = "" ;
      Z450TBM26_INNER_VALUE = "" ;
      Z451TBM26_DEL_FLG = "" ;
      Z454TBM26_CRT_PROG_NM = "" ;
      Z457TBM26_UPD_PROG_NM = "" ;
      BC000Y5_A448TBM26_LIST_ITEM_NO = new short[1] ;
      BC000Y5_A452TBM26_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Y5_n452TBM26_CRT_DATETIME = new boolean[] {false} ;
      BC000Y5_A453TBM26_CRT_USER_ID = new String[] {""} ;
      BC000Y5_n453TBM26_CRT_USER_ID = new boolean[] {false} ;
      BC000Y5_A455TBM26_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Y5_n455TBM26_UPD_DATETIME = new boolean[] {false} ;
      BC000Y5_A456TBM26_UPD_USER_ID = new String[] {""} ;
      BC000Y5_n456TBM26_UPD_USER_ID = new boolean[] {false} ;
      BC000Y5_A458TBM26_UPD_CNT = new long[1] ;
      BC000Y5_n458TBM26_UPD_CNT = new boolean[] {false} ;
      BC000Y5_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      BC000Y5_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      BC000Y5_A450TBM26_INNER_VALUE = new String[] {""} ;
      BC000Y5_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      BC000Y5_A451TBM26_DEL_FLG = new String[] {""} ;
      BC000Y5_n451TBM26_DEL_FLG = new boolean[] {false} ;
      BC000Y5_A454TBM26_CRT_PROG_NM = new String[] {""} ;
      BC000Y5_n454TBM26_CRT_PROG_NM = new boolean[] {false} ;
      BC000Y5_A457TBM26_UPD_PROG_NM = new String[] {""} ;
      BC000Y5_n457TBM26_UPD_PROG_NM = new boolean[] {false} ;
      BC000Y5_A446TBM26_STUDY_ID = new long[1] ;
      BC000Y5_A447TBM26_LIST_CD = new String[] {""} ;
      BC000Y4_A446TBM26_STUDY_ID = new long[1] ;
      BC000Y6_A446TBM26_STUDY_ID = new long[1] ;
      BC000Y6_A447TBM26_LIST_CD = new String[] {""} ;
      BC000Y6_A448TBM26_LIST_ITEM_NO = new short[1] ;
      BC000Y3_A448TBM26_LIST_ITEM_NO = new short[1] ;
      BC000Y3_A452TBM26_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Y3_n452TBM26_CRT_DATETIME = new boolean[] {false} ;
      BC000Y3_A453TBM26_CRT_USER_ID = new String[] {""} ;
      BC000Y3_n453TBM26_CRT_USER_ID = new boolean[] {false} ;
      BC000Y3_A455TBM26_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Y3_n455TBM26_UPD_DATETIME = new boolean[] {false} ;
      BC000Y3_A456TBM26_UPD_USER_ID = new String[] {""} ;
      BC000Y3_n456TBM26_UPD_USER_ID = new boolean[] {false} ;
      BC000Y3_A458TBM26_UPD_CNT = new long[1] ;
      BC000Y3_n458TBM26_UPD_CNT = new boolean[] {false} ;
      BC000Y3_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      BC000Y3_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      BC000Y3_A450TBM26_INNER_VALUE = new String[] {""} ;
      BC000Y3_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      BC000Y3_A451TBM26_DEL_FLG = new String[] {""} ;
      BC000Y3_n451TBM26_DEL_FLG = new boolean[] {false} ;
      BC000Y3_A454TBM26_CRT_PROG_NM = new String[] {""} ;
      BC000Y3_n454TBM26_CRT_PROG_NM = new boolean[] {false} ;
      BC000Y3_A457TBM26_UPD_PROG_NM = new String[] {""} ;
      BC000Y3_n457TBM26_UPD_PROG_NM = new boolean[] {false} ;
      BC000Y3_A446TBM26_STUDY_ID = new long[1] ;
      BC000Y3_A447TBM26_LIST_CD = new String[] {""} ;
      sMode33 = "" ;
      BC000Y2_A448TBM26_LIST_ITEM_NO = new short[1] ;
      BC000Y2_A452TBM26_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Y2_n452TBM26_CRT_DATETIME = new boolean[] {false} ;
      BC000Y2_A453TBM26_CRT_USER_ID = new String[] {""} ;
      BC000Y2_n453TBM26_CRT_USER_ID = new boolean[] {false} ;
      BC000Y2_A455TBM26_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Y2_n455TBM26_UPD_DATETIME = new boolean[] {false} ;
      BC000Y2_A456TBM26_UPD_USER_ID = new String[] {""} ;
      BC000Y2_n456TBM26_UPD_USER_ID = new boolean[] {false} ;
      BC000Y2_A458TBM26_UPD_CNT = new long[1] ;
      BC000Y2_n458TBM26_UPD_CNT = new boolean[] {false} ;
      BC000Y2_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      BC000Y2_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      BC000Y2_A450TBM26_INNER_VALUE = new String[] {""} ;
      BC000Y2_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      BC000Y2_A451TBM26_DEL_FLG = new String[] {""} ;
      BC000Y2_n451TBM26_DEL_FLG = new boolean[] {false} ;
      BC000Y2_A454TBM26_CRT_PROG_NM = new String[] {""} ;
      BC000Y2_n454TBM26_CRT_PROG_NM = new boolean[] {false} ;
      BC000Y2_A457TBM26_UPD_PROG_NM = new String[] {""} ;
      BC000Y2_n457TBM26_UPD_PROG_NM = new boolean[] {false} ;
      BC000Y2_A446TBM26_STUDY_ID = new long[1] ;
      BC000Y2_A447TBM26_LIST_CD = new String[] {""} ;
      BC000Y10_A448TBM26_LIST_ITEM_NO = new short[1] ;
      BC000Y10_A452TBM26_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Y10_n452TBM26_CRT_DATETIME = new boolean[] {false} ;
      BC000Y10_A453TBM26_CRT_USER_ID = new String[] {""} ;
      BC000Y10_n453TBM26_CRT_USER_ID = new boolean[] {false} ;
      BC000Y10_A455TBM26_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Y10_n455TBM26_UPD_DATETIME = new boolean[] {false} ;
      BC000Y10_A456TBM26_UPD_USER_ID = new String[] {""} ;
      BC000Y10_n456TBM26_UPD_USER_ID = new boolean[] {false} ;
      BC000Y10_A458TBM26_UPD_CNT = new long[1] ;
      BC000Y10_n458TBM26_UPD_CNT = new boolean[] {false} ;
      BC000Y10_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      BC000Y10_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      BC000Y10_A450TBM26_INNER_VALUE = new String[] {""} ;
      BC000Y10_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      BC000Y10_A451TBM26_DEL_FLG = new String[] {""} ;
      BC000Y10_n451TBM26_DEL_FLG = new boolean[] {false} ;
      BC000Y10_A454TBM26_CRT_PROG_NM = new String[] {""} ;
      BC000Y10_n454TBM26_CRT_PROG_NM = new boolean[] {false} ;
      BC000Y10_A457TBM26_UPD_PROG_NM = new String[] {""} ;
      BC000Y10_n457TBM26_UPD_PROG_NM = new boolean[] {false} ;
      BC000Y10_A446TBM26_STUDY_ID = new long[1] ;
      BC000Y10_A447TBM26_LIST_CD = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000Y11_A446TBM26_STUDY_ID = new long[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm26_sel_list_item_bc__default(),
         new Object[] {
             new Object[] {
            BC000Y2_A448TBM26_LIST_ITEM_NO, BC000Y2_A452TBM26_CRT_DATETIME, BC000Y2_n452TBM26_CRT_DATETIME, BC000Y2_A453TBM26_CRT_USER_ID, BC000Y2_n453TBM26_CRT_USER_ID, BC000Y2_A455TBM26_UPD_DATETIME, BC000Y2_n455TBM26_UPD_DATETIME, BC000Y2_A456TBM26_UPD_USER_ID, BC000Y2_n456TBM26_UPD_USER_ID, BC000Y2_A458TBM26_UPD_CNT,
            BC000Y2_n458TBM26_UPD_CNT, BC000Y2_A449TBM26_LIST_ITEM_NAME, BC000Y2_n449TBM26_LIST_ITEM_NAME, BC000Y2_A450TBM26_INNER_VALUE, BC000Y2_n450TBM26_INNER_VALUE, BC000Y2_A451TBM26_DEL_FLG, BC000Y2_n451TBM26_DEL_FLG, BC000Y2_A454TBM26_CRT_PROG_NM, BC000Y2_n454TBM26_CRT_PROG_NM, BC000Y2_A457TBM26_UPD_PROG_NM,
            BC000Y2_n457TBM26_UPD_PROG_NM, BC000Y2_A446TBM26_STUDY_ID, BC000Y2_A447TBM26_LIST_CD
            }
            , new Object[] {
            BC000Y3_A448TBM26_LIST_ITEM_NO, BC000Y3_A452TBM26_CRT_DATETIME, BC000Y3_n452TBM26_CRT_DATETIME, BC000Y3_A453TBM26_CRT_USER_ID, BC000Y3_n453TBM26_CRT_USER_ID, BC000Y3_A455TBM26_UPD_DATETIME, BC000Y3_n455TBM26_UPD_DATETIME, BC000Y3_A456TBM26_UPD_USER_ID, BC000Y3_n456TBM26_UPD_USER_ID, BC000Y3_A458TBM26_UPD_CNT,
            BC000Y3_n458TBM26_UPD_CNT, BC000Y3_A449TBM26_LIST_ITEM_NAME, BC000Y3_n449TBM26_LIST_ITEM_NAME, BC000Y3_A450TBM26_INNER_VALUE, BC000Y3_n450TBM26_INNER_VALUE, BC000Y3_A451TBM26_DEL_FLG, BC000Y3_n451TBM26_DEL_FLG, BC000Y3_A454TBM26_CRT_PROG_NM, BC000Y3_n454TBM26_CRT_PROG_NM, BC000Y3_A457TBM26_UPD_PROG_NM,
            BC000Y3_n457TBM26_UPD_PROG_NM, BC000Y3_A446TBM26_STUDY_ID, BC000Y3_A447TBM26_LIST_CD
            }
            , new Object[] {
            BC000Y4_A446TBM26_STUDY_ID
            }
            , new Object[] {
            BC000Y5_A448TBM26_LIST_ITEM_NO, BC000Y5_A452TBM26_CRT_DATETIME, BC000Y5_n452TBM26_CRT_DATETIME, BC000Y5_A453TBM26_CRT_USER_ID, BC000Y5_n453TBM26_CRT_USER_ID, BC000Y5_A455TBM26_UPD_DATETIME, BC000Y5_n455TBM26_UPD_DATETIME, BC000Y5_A456TBM26_UPD_USER_ID, BC000Y5_n456TBM26_UPD_USER_ID, BC000Y5_A458TBM26_UPD_CNT,
            BC000Y5_n458TBM26_UPD_CNT, BC000Y5_A449TBM26_LIST_ITEM_NAME, BC000Y5_n449TBM26_LIST_ITEM_NAME, BC000Y5_A450TBM26_INNER_VALUE, BC000Y5_n450TBM26_INNER_VALUE, BC000Y5_A451TBM26_DEL_FLG, BC000Y5_n451TBM26_DEL_FLG, BC000Y5_A454TBM26_CRT_PROG_NM, BC000Y5_n454TBM26_CRT_PROG_NM, BC000Y5_A457TBM26_UPD_PROG_NM,
            BC000Y5_n457TBM26_UPD_PROG_NM, BC000Y5_A446TBM26_STUDY_ID, BC000Y5_A447TBM26_LIST_CD
            }
            , new Object[] {
            BC000Y6_A446TBM26_STUDY_ID, BC000Y6_A447TBM26_LIST_CD, BC000Y6_A448TBM26_LIST_ITEM_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000Y10_A448TBM26_LIST_ITEM_NO, BC000Y10_A452TBM26_CRT_DATETIME, BC000Y10_n452TBM26_CRT_DATETIME, BC000Y10_A453TBM26_CRT_USER_ID, BC000Y10_n453TBM26_CRT_USER_ID, BC000Y10_A455TBM26_UPD_DATETIME, BC000Y10_n455TBM26_UPD_DATETIME, BC000Y10_A456TBM26_UPD_USER_ID, BC000Y10_n456TBM26_UPD_USER_ID, BC000Y10_A458TBM26_UPD_CNT,
            BC000Y10_n458TBM26_UPD_CNT, BC000Y10_A449TBM26_LIST_ITEM_NAME, BC000Y10_n449TBM26_LIST_ITEM_NAME, BC000Y10_A450TBM26_INNER_VALUE, BC000Y10_n450TBM26_INNER_VALUE, BC000Y10_A451TBM26_DEL_FLG, BC000Y10_n451TBM26_DEL_FLG, BC000Y10_A454TBM26_CRT_PROG_NM, BC000Y10_n454TBM26_CRT_PROG_NM, BC000Y10_A457TBM26_UPD_PROG_NM,
            BC000Y10_n457TBM26_UPD_PROG_NM, BC000Y10_A446TBM26_STUDY_ID, BC000Y10_A447TBM26_LIST_CD
            }
            , new Object[] {
            BC000Y11_A446TBM26_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM26_SEL_LIST_ITEM_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110Y2 */
      e110Y2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z448TBM26_LIST_ITEM_NO ;
   private short A448TBM26_LIST_ITEM_NO ;
   private short gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z ;
   private short RcdFound33 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int AnyError446 ;
   private int AnyError447 ;
   private int GXActiveErrHndl ;
   private long Z446TBM26_STUDY_ID ;
   private long A446TBM26_STUDY_ID ;
   private long A458TBM26_UPD_CNT ;
   private long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z ;
   private long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z ;
   private long Z458TBM26_UPD_CNT ;
   private long O458TBM26_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode33 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A452TBM26_CRT_DATETIME ;
   private java.util.Date A455TBM26_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z ;
   private java.util.Date Z452TBM26_CRT_DATETIME ;
   private java.util.Date Z455TBM26_UPD_DATETIME ;
   private boolean n452TBM26_CRT_DATETIME ;
   private boolean n453TBM26_CRT_USER_ID ;
   private boolean n455TBM26_UPD_DATETIME ;
   private boolean n456TBM26_UPD_USER_ID ;
   private boolean n458TBM26_UPD_CNT ;
   private boolean n449TBM26_LIST_ITEM_NAME ;
   private boolean n450TBM26_INNER_VALUE ;
   private boolean n451TBM26_DEL_FLG ;
   private boolean n454TBM26_CRT_PROG_NM ;
   private boolean n457TBM26_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z447TBM26_LIST_CD ;
   private String A447TBM26_LIST_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A449TBM26_LIST_ITEM_NAME ;
   private String A450TBM26_INNER_VALUE ;
   private String A451TBM26_DEL_FLG ;
   private String A453TBM26_CRT_USER_ID ;
   private String A454TBM26_CRT_PROG_NM ;
   private String A456TBM26_UPD_USER_ID ;
   private String A457TBM26_UPD_PROG_NM ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z ;
   private String Z453TBM26_CRT_USER_ID ;
   private String Z456TBM26_UPD_USER_ID ;
   private String Z449TBM26_LIST_ITEM_NAME ;
   private String Z450TBM26_INNER_VALUE ;
   private String Z451TBM26_DEL_FLG ;
   private String Z454TBM26_CRT_PROG_NM ;
   private String Z457TBM26_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM26_SEL_LIST_ITEM bcTBM26_SEL_LIST_ITEM ;
   private IDataStoreProvider pr_default ;
   private short[] BC000Y5_A448TBM26_LIST_ITEM_NO ;
   private java.util.Date[] BC000Y5_A452TBM26_CRT_DATETIME ;
   private boolean[] BC000Y5_n452TBM26_CRT_DATETIME ;
   private String[] BC000Y5_A453TBM26_CRT_USER_ID ;
   private boolean[] BC000Y5_n453TBM26_CRT_USER_ID ;
   private java.util.Date[] BC000Y5_A455TBM26_UPD_DATETIME ;
   private boolean[] BC000Y5_n455TBM26_UPD_DATETIME ;
   private String[] BC000Y5_A456TBM26_UPD_USER_ID ;
   private boolean[] BC000Y5_n456TBM26_UPD_USER_ID ;
   private long[] BC000Y5_A458TBM26_UPD_CNT ;
   private boolean[] BC000Y5_n458TBM26_UPD_CNT ;
   private String[] BC000Y5_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] BC000Y5_n449TBM26_LIST_ITEM_NAME ;
   private String[] BC000Y5_A450TBM26_INNER_VALUE ;
   private boolean[] BC000Y5_n450TBM26_INNER_VALUE ;
   private String[] BC000Y5_A451TBM26_DEL_FLG ;
   private boolean[] BC000Y5_n451TBM26_DEL_FLG ;
   private String[] BC000Y5_A454TBM26_CRT_PROG_NM ;
   private boolean[] BC000Y5_n454TBM26_CRT_PROG_NM ;
   private String[] BC000Y5_A457TBM26_UPD_PROG_NM ;
   private boolean[] BC000Y5_n457TBM26_UPD_PROG_NM ;
   private long[] BC000Y5_A446TBM26_STUDY_ID ;
   private String[] BC000Y5_A447TBM26_LIST_CD ;
   private long[] BC000Y4_A446TBM26_STUDY_ID ;
   private long[] BC000Y6_A446TBM26_STUDY_ID ;
   private String[] BC000Y6_A447TBM26_LIST_CD ;
   private short[] BC000Y6_A448TBM26_LIST_ITEM_NO ;
   private short[] BC000Y3_A448TBM26_LIST_ITEM_NO ;
   private java.util.Date[] BC000Y3_A452TBM26_CRT_DATETIME ;
   private boolean[] BC000Y3_n452TBM26_CRT_DATETIME ;
   private String[] BC000Y3_A453TBM26_CRT_USER_ID ;
   private boolean[] BC000Y3_n453TBM26_CRT_USER_ID ;
   private java.util.Date[] BC000Y3_A455TBM26_UPD_DATETIME ;
   private boolean[] BC000Y3_n455TBM26_UPD_DATETIME ;
   private String[] BC000Y3_A456TBM26_UPD_USER_ID ;
   private boolean[] BC000Y3_n456TBM26_UPD_USER_ID ;
   private long[] BC000Y3_A458TBM26_UPD_CNT ;
   private boolean[] BC000Y3_n458TBM26_UPD_CNT ;
   private String[] BC000Y3_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] BC000Y3_n449TBM26_LIST_ITEM_NAME ;
   private String[] BC000Y3_A450TBM26_INNER_VALUE ;
   private boolean[] BC000Y3_n450TBM26_INNER_VALUE ;
   private String[] BC000Y3_A451TBM26_DEL_FLG ;
   private boolean[] BC000Y3_n451TBM26_DEL_FLG ;
   private String[] BC000Y3_A454TBM26_CRT_PROG_NM ;
   private boolean[] BC000Y3_n454TBM26_CRT_PROG_NM ;
   private String[] BC000Y3_A457TBM26_UPD_PROG_NM ;
   private boolean[] BC000Y3_n457TBM26_UPD_PROG_NM ;
   private long[] BC000Y3_A446TBM26_STUDY_ID ;
   private String[] BC000Y3_A447TBM26_LIST_CD ;
   private short[] BC000Y2_A448TBM26_LIST_ITEM_NO ;
   private java.util.Date[] BC000Y2_A452TBM26_CRT_DATETIME ;
   private boolean[] BC000Y2_n452TBM26_CRT_DATETIME ;
   private String[] BC000Y2_A453TBM26_CRT_USER_ID ;
   private boolean[] BC000Y2_n453TBM26_CRT_USER_ID ;
   private java.util.Date[] BC000Y2_A455TBM26_UPD_DATETIME ;
   private boolean[] BC000Y2_n455TBM26_UPD_DATETIME ;
   private String[] BC000Y2_A456TBM26_UPD_USER_ID ;
   private boolean[] BC000Y2_n456TBM26_UPD_USER_ID ;
   private long[] BC000Y2_A458TBM26_UPD_CNT ;
   private boolean[] BC000Y2_n458TBM26_UPD_CNT ;
   private String[] BC000Y2_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] BC000Y2_n449TBM26_LIST_ITEM_NAME ;
   private String[] BC000Y2_A450TBM26_INNER_VALUE ;
   private boolean[] BC000Y2_n450TBM26_INNER_VALUE ;
   private String[] BC000Y2_A451TBM26_DEL_FLG ;
   private boolean[] BC000Y2_n451TBM26_DEL_FLG ;
   private String[] BC000Y2_A454TBM26_CRT_PROG_NM ;
   private boolean[] BC000Y2_n454TBM26_CRT_PROG_NM ;
   private String[] BC000Y2_A457TBM26_UPD_PROG_NM ;
   private boolean[] BC000Y2_n457TBM26_UPD_PROG_NM ;
   private long[] BC000Y2_A446TBM26_STUDY_ID ;
   private String[] BC000Y2_A447TBM26_LIST_CD ;
   private short[] BC000Y10_A448TBM26_LIST_ITEM_NO ;
   private java.util.Date[] BC000Y10_A452TBM26_CRT_DATETIME ;
   private boolean[] BC000Y10_n452TBM26_CRT_DATETIME ;
   private String[] BC000Y10_A453TBM26_CRT_USER_ID ;
   private boolean[] BC000Y10_n453TBM26_CRT_USER_ID ;
   private java.util.Date[] BC000Y10_A455TBM26_UPD_DATETIME ;
   private boolean[] BC000Y10_n455TBM26_UPD_DATETIME ;
   private String[] BC000Y10_A456TBM26_UPD_USER_ID ;
   private boolean[] BC000Y10_n456TBM26_UPD_USER_ID ;
   private long[] BC000Y10_A458TBM26_UPD_CNT ;
   private boolean[] BC000Y10_n458TBM26_UPD_CNT ;
   private String[] BC000Y10_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] BC000Y10_n449TBM26_LIST_ITEM_NAME ;
   private String[] BC000Y10_A450TBM26_INNER_VALUE ;
   private boolean[] BC000Y10_n450TBM26_INNER_VALUE ;
   private String[] BC000Y10_A451TBM26_DEL_FLG ;
   private boolean[] BC000Y10_n451TBM26_DEL_FLG ;
   private String[] BC000Y10_A454TBM26_CRT_PROG_NM ;
   private boolean[] BC000Y10_n454TBM26_CRT_PROG_NM ;
   private String[] BC000Y10_A457TBM26_UPD_PROG_NM ;
   private boolean[] BC000Y10_n457TBM26_UPD_PROG_NM ;
   private long[] BC000Y10_A446TBM26_STUDY_ID ;
   private String[] BC000Y10_A447TBM26_LIST_CD ;
   private long[] BC000Y11_A446TBM26_STUDY_ID ;
}

final  class tbm26_sel_list_item_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000Y2", "SELECT `TBM26_LIST_ITEM_NO`, `TBM26_CRT_DATETIME`, `TBM26_CRT_USER_ID`, `TBM26_UPD_DATETIME`, `TBM26_UPD_USER_ID`, `TBM26_UPD_CNT`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE`, `TBM26_DEL_FLG`, `TBM26_CRT_PROG_NM`, `TBM26_UPD_PROG_NM`, `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Y3", "SELECT `TBM26_LIST_ITEM_NO`, `TBM26_CRT_DATETIME`, `TBM26_CRT_USER_ID`, `TBM26_UPD_DATETIME`, `TBM26_UPD_USER_ID`, `TBM26_UPD_CNT`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE`, `TBM26_DEL_FLG`, `TBM26_CRT_PROG_NM`, `TBM26_UPD_PROG_NM`, `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Y4", "SELECT `TBM25_STUDY_ID` AS TBM26_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Y5", "SELECT TM1.`TBM26_LIST_ITEM_NO`, TM1.`TBM26_CRT_DATETIME`, TM1.`TBM26_CRT_USER_ID`, TM1.`TBM26_UPD_DATETIME`, TM1.`TBM26_UPD_USER_ID`, TM1.`TBM26_UPD_CNT`, TM1.`TBM26_LIST_ITEM_NAME`, TM1.`TBM26_INNER_VALUE`, TM1.`TBM26_DEL_FLG`, TM1.`TBM26_CRT_PROG_NM`, TM1.`TBM26_UPD_PROG_NM`, TM1.`TBM26_STUDY_ID` AS TBM26_STUDY_ID, TM1.`TBM26_LIST_CD` AS TBM26_LIST_CD FROM `TBM26_SEL_LIST_ITEM` TM1 WHERE TM1.`TBM26_STUDY_ID` = ? and TM1.`TBM26_LIST_CD` = ? and TM1.`TBM26_LIST_ITEM_NO` = ? ORDER BY TM1.`TBM26_STUDY_ID`, TM1.`TBM26_LIST_CD`, TM1.`TBM26_LIST_ITEM_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000Y6", "SELECT `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000Y7", "INSERT INTO `TBM26_SEL_LIST_ITEM` (`TBM26_LIST_ITEM_NO`, `TBM26_CRT_DATETIME`, `TBM26_CRT_USER_ID`, `TBM26_UPD_DATETIME`, `TBM26_UPD_USER_ID`, `TBM26_UPD_CNT`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE`, `TBM26_DEL_FLG`, `TBM26_CRT_PROG_NM`, `TBM26_UPD_PROG_NM`, `TBM26_STUDY_ID`, `TBM26_LIST_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000Y8", "UPDATE `TBM26_SEL_LIST_ITEM` SET `TBM26_CRT_DATETIME`=?, `TBM26_CRT_USER_ID`=?, `TBM26_UPD_DATETIME`=?, `TBM26_UPD_USER_ID`=?, `TBM26_UPD_CNT`=?, `TBM26_LIST_ITEM_NAME`=?, `TBM26_INNER_VALUE`=?, `TBM26_DEL_FLG`=?, `TBM26_CRT_PROG_NM`=?, `TBM26_UPD_PROG_NM`=?  WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000Y9", "DELETE FROM `TBM26_SEL_LIST_ITEM`  WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000Y10", "SELECT TM1.`TBM26_LIST_ITEM_NO`, TM1.`TBM26_CRT_DATETIME`, TM1.`TBM26_CRT_USER_ID`, TM1.`TBM26_UPD_DATETIME`, TM1.`TBM26_UPD_USER_ID`, TM1.`TBM26_UPD_CNT`, TM1.`TBM26_LIST_ITEM_NAME`, TM1.`TBM26_INNER_VALUE`, TM1.`TBM26_DEL_FLG`, TM1.`TBM26_CRT_PROG_NM`, TM1.`TBM26_UPD_PROG_NM`, TM1.`TBM26_STUDY_ID` AS TBM26_STUDY_ID, TM1.`TBM26_LIST_CD` AS TBM26_LIST_CD FROM `TBM26_SEL_LIST_ITEM` TM1 WHERE TM1.`TBM26_STUDY_ID` = ? and TM1.`TBM26_LIST_CD` = ? and TM1.`TBM26_LIST_ITEM_NO` = ? ORDER BY TM1.`TBM26_STUDY_ID`, TM1.`TBM26_LIST_CD`, TM1.`TBM26_LIST_ITEM_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000Y11", "SELECT `TBM25_STUDY_ID` AS TBM26_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
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
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
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
                  stmt.setVarchar(8, (String)parms[14], 100);
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 40);
               }
               stmt.setLong(12, ((Number) parms[21]).longValue());
               stmt.setVarchar(13, (String)parms[22], 20, false);
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
                  stmt.setVarchar(6, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 100);
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
               stmt.setVarchar(12, (String)parms[21], 20, false);
               stmt.setShort(13, ((Number) parms[22]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
      }
   }

}

