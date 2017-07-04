/*
               File: tbm23_study_staff_bc
        Description: 試験参加スタッフマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:29.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm23_study_staff_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm23_study_staff_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm23_study_staff_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm23_study_staff_bc.class ));
   }

   public tbm23_study_staff_bc( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0I17( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0I17( ) ;
      standaloneModal( ) ;
      addRow0I17( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120I2 */
         e120I2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z107TBM23_STUDY_ID = A107TBM23_STUDY_ID ;
            Z108TBM23_USER_ID = A108TBM23_USER_ID ;
            Z109TBM23_STYDY_AUTH_CD = A109TBM23_STYDY_AUTH_CD ;
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

   public void confirm_0I0( )
   {
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0I17( ) ;
         }
         else
         {
            checkExtendedTable0I17( ) ;
            if ( AnyError == 0 )
            {
               zm0I17( 9) ;
               zm0I17( 10) ;
            }
            closeExtendedTableCursors0I17( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110I2( )
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

   public void e120I2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A108TBM23_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A109TBM23_STYDY_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A385TBM23_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A386TBM23_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm23_study_staff_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A387TBM23_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A388TBM23_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A389TBM23_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm23_study_staff_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A390TBM23_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A391TBM23_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0I17( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z386TBM23_CRT_DATETIME = A386TBM23_CRT_DATETIME ;
         Z387TBM23_CRT_USER_ID = A387TBM23_CRT_USER_ID ;
         Z389TBM23_UPD_DATETIME = A389TBM23_UPD_DATETIME ;
         Z390TBM23_UPD_USER_ID = A390TBM23_UPD_USER_ID ;
         Z392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
         Z385TBM23_DEL_FLG = A385TBM23_DEL_FLG ;
         Z388TBM23_CRT_PROG_NM = A388TBM23_CRT_PROG_NM ;
         Z391TBM23_UPD_PROG_NM = A391TBM23_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z109TBM23_STYDY_AUTH_CD = A109TBM23_STYDY_AUTH_CD ;
         Z386TBM23_CRT_DATETIME = A386TBM23_CRT_DATETIME ;
         Z387TBM23_CRT_USER_ID = A387TBM23_CRT_USER_ID ;
         Z389TBM23_UPD_DATETIME = A389TBM23_UPD_DATETIME ;
         Z390TBM23_UPD_USER_ID = A390TBM23_UPD_USER_ID ;
         Z392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
         Z385TBM23_DEL_FLG = A385TBM23_DEL_FLG ;
         Z388TBM23_CRT_PROG_NM = A388TBM23_CRT_PROG_NM ;
         Z391TBM23_UPD_PROG_NM = A391TBM23_UPD_PROG_NM ;
         Z107TBM23_STUDY_ID = A107TBM23_STUDY_ID ;
         Z108TBM23_USER_ID = A108TBM23_USER_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0I17( )
   {
      /* Using cursor BC000I6 */
      pr_default.execute(4, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A386TBM23_CRT_DATETIME = BC000I6_A386TBM23_CRT_DATETIME[0] ;
         n386TBM23_CRT_DATETIME = BC000I6_n386TBM23_CRT_DATETIME[0] ;
         A387TBM23_CRT_USER_ID = BC000I6_A387TBM23_CRT_USER_ID[0] ;
         n387TBM23_CRT_USER_ID = BC000I6_n387TBM23_CRT_USER_ID[0] ;
         A389TBM23_UPD_DATETIME = BC000I6_A389TBM23_UPD_DATETIME[0] ;
         n389TBM23_UPD_DATETIME = BC000I6_n389TBM23_UPD_DATETIME[0] ;
         A390TBM23_UPD_USER_ID = BC000I6_A390TBM23_UPD_USER_ID[0] ;
         n390TBM23_UPD_USER_ID = BC000I6_n390TBM23_UPD_USER_ID[0] ;
         A392TBM23_UPD_CNT = BC000I6_A392TBM23_UPD_CNT[0] ;
         n392TBM23_UPD_CNT = BC000I6_n392TBM23_UPD_CNT[0] ;
         A385TBM23_DEL_FLG = BC000I6_A385TBM23_DEL_FLG[0] ;
         n385TBM23_DEL_FLG = BC000I6_n385TBM23_DEL_FLG[0] ;
         A388TBM23_CRT_PROG_NM = BC000I6_A388TBM23_CRT_PROG_NM[0] ;
         n388TBM23_CRT_PROG_NM = BC000I6_n388TBM23_CRT_PROG_NM[0] ;
         A391TBM23_UPD_PROG_NM = BC000I6_A391TBM23_UPD_PROG_NM[0] ;
         n391TBM23_UPD_PROG_NM = BC000I6_n391TBM23_UPD_PROG_NM[0] ;
         zm0I17( -8) ;
      }
      pr_default.close(4);
      onLoadActions0I17( ) ;
   }

   public void onLoadActions0I17( )
   {
      AV9Pgmname = "TBM23_STUDY_STAFF_BC" ;
   }

   public void checkExtendedTable0I17( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM23_STUDY_STAFF_BC" ;
      /* Using cursor BC000I4 */
      pr_default.execute(2, new Object[] {new Long(A107TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
      /* Using cursor BC000I5 */
      pr_default.execute(3, new Object[] {A108TBM23_USER_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A386TBM23_CRT_DATETIME) || (( A386TBM23_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A386TBM23_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A389TBM23_UPD_DATETIME) || (( A389TBM23_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A389TBM23_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0I17( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0I17( )
   {
      /* Using cursor BC000I7 */
      pr_default.execute(5, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound17 = (short)(1) ;
      }
      else
      {
         RcdFound17 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000I3 */
      pr_default.execute(1, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0I17( 8) ;
         RcdFound17 = (short)(1) ;
         A109TBM23_STYDY_AUTH_CD = BC000I3_A109TBM23_STYDY_AUTH_CD[0] ;
         A386TBM23_CRT_DATETIME = BC000I3_A386TBM23_CRT_DATETIME[0] ;
         n386TBM23_CRT_DATETIME = BC000I3_n386TBM23_CRT_DATETIME[0] ;
         A387TBM23_CRT_USER_ID = BC000I3_A387TBM23_CRT_USER_ID[0] ;
         n387TBM23_CRT_USER_ID = BC000I3_n387TBM23_CRT_USER_ID[0] ;
         A389TBM23_UPD_DATETIME = BC000I3_A389TBM23_UPD_DATETIME[0] ;
         n389TBM23_UPD_DATETIME = BC000I3_n389TBM23_UPD_DATETIME[0] ;
         A390TBM23_UPD_USER_ID = BC000I3_A390TBM23_UPD_USER_ID[0] ;
         n390TBM23_UPD_USER_ID = BC000I3_n390TBM23_UPD_USER_ID[0] ;
         A392TBM23_UPD_CNT = BC000I3_A392TBM23_UPD_CNT[0] ;
         n392TBM23_UPD_CNT = BC000I3_n392TBM23_UPD_CNT[0] ;
         A385TBM23_DEL_FLG = BC000I3_A385TBM23_DEL_FLG[0] ;
         n385TBM23_DEL_FLG = BC000I3_n385TBM23_DEL_FLG[0] ;
         A388TBM23_CRT_PROG_NM = BC000I3_A388TBM23_CRT_PROG_NM[0] ;
         n388TBM23_CRT_PROG_NM = BC000I3_n388TBM23_CRT_PROG_NM[0] ;
         A391TBM23_UPD_PROG_NM = BC000I3_A391TBM23_UPD_PROG_NM[0] ;
         n391TBM23_UPD_PROG_NM = BC000I3_n391TBM23_UPD_PROG_NM[0] ;
         A107TBM23_STUDY_ID = BC000I3_A107TBM23_STUDY_ID[0] ;
         A108TBM23_USER_ID = BC000I3_A108TBM23_USER_ID[0] ;
         O392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
         n392TBM23_UPD_CNT = false ;
         Z107TBM23_STUDY_ID = A107TBM23_STUDY_ID ;
         Z108TBM23_USER_ID = A108TBM23_USER_ID ;
         Z109TBM23_STYDY_AUTH_CD = A109TBM23_STYDY_AUTH_CD ;
         sMode17 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0I17( ) ;
         if ( AnyError == 1 )
         {
            RcdFound17 = (short)(0) ;
            initializeNonKey0I17( ) ;
         }
         Gx_mode = sMode17 ;
      }
      else
      {
         RcdFound17 = (short)(0) ;
         initializeNonKey0I17( ) ;
         sMode17 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode17 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0I17( ) ;
      if ( RcdFound17 == 0 )
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
      confirm_0I0( ) ;
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

   public void checkOptimisticConcurrency0I17( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000I2 */
         pr_default.execute(0, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM23_STUDY_STAFF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z386TBM23_CRT_DATETIME.equals( BC000I2_A386TBM23_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z387TBM23_CRT_USER_ID, BC000I2_A387TBM23_CRT_USER_ID[0]) != 0 ) || !( Z389TBM23_UPD_DATETIME.equals( BC000I2_A389TBM23_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z390TBM23_UPD_USER_ID, BC000I2_A390TBM23_UPD_USER_ID[0]) != 0 ) || ( Z392TBM23_UPD_CNT != BC000I2_A392TBM23_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z385TBM23_DEL_FLG, BC000I2_A385TBM23_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z388TBM23_CRT_PROG_NM, BC000I2_A388TBM23_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z391TBM23_UPD_PROG_NM, BC000I2_A391TBM23_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM23_STUDY_STAFF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0I17( )
   {
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0I17( 0) ;
         checkOptimisticConcurrency0I17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I17( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0I17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000I8 */
                  pr_default.execute(6, new Object[] {A109TBM23_STYDY_AUTH_CD, new Boolean(n386TBM23_CRT_DATETIME), A386TBM23_CRT_DATETIME, new Boolean(n387TBM23_CRT_USER_ID), A387TBM23_CRT_USER_ID, new Boolean(n389TBM23_UPD_DATETIME), A389TBM23_UPD_DATETIME, new Boolean(n390TBM23_UPD_USER_ID), A390TBM23_UPD_USER_ID, new Boolean(n392TBM23_UPD_CNT), new Long(A392TBM23_UPD_CNT), new Boolean(n385TBM23_DEL_FLG), A385TBM23_DEL_FLG, new Boolean(n388TBM23_CRT_PROG_NM), A388TBM23_CRT_PROG_NM, new Boolean(n391TBM23_UPD_PROG_NM), A391TBM23_UPD_PROG_NM, new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM23_STUDY_STAFF") ;
                  if ( (pr_default.getStatus(6) == 1) )
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
            load0I17( ) ;
         }
         endLevel0I17( ) ;
      }
      closeExtendedTableCursors0I17( ) ;
   }

   public void update0I17( )
   {
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I17( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0I17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000I9 */
                  pr_default.execute(7, new Object[] {new Boolean(n386TBM23_CRT_DATETIME), A386TBM23_CRT_DATETIME, new Boolean(n387TBM23_CRT_USER_ID), A387TBM23_CRT_USER_ID, new Boolean(n389TBM23_UPD_DATETIME), A389TBM23_UPD_DATETIME, new Boolean(n390TBM23_UPD_USER_ID), A390TBM23_UPD_USER_ID, new Boolean(n392TBM23_UPD_CNT), new Long(A392TBM23_UPD_CNT), new Boolean(n385TBM23_DEL_FLG), A385TBM23_DEL_FLG, new Boolean(n388TBM23_CRT_PROG_NM), A388TBM23_CRT_PROG_NM, new Boolean(n391TBM23_UPD_PROG_NM), A391TBM23_UPD_PROG_NM, new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM23_STUDY_STAFF") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM23_STUDY_STAFF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0I17( ) ;
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
         endLevel0I17( ) ;
      }
      closeExtendedTableCursors0I17( ) ;
   }

   public void deferredUpdate0I17( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0I17( ) ;
         afterConfirm0I17( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0I17( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000I10 */
               pr_default.execute(8, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM23_STUDY_STAFF") ;
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
      sMode17 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0I17( ) ;
      Gx_mode = sMode17 ;
   }

   public void onDeleteControls0I17( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM23_STUDY_STAFF_BC" ;
      }
   }

   public void endLevel0I17( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0I17( ) ;
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

   public void scanKeyStart0I17( )
   {
      /* Scan By routine */
      /* Using cursor BC000I11 */
      pr_default.execute(9, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
      RcdFound17 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A109TBM23_STYDY_AUTH_CD = BC000I11_A109TBM23_STYDY_AUTH_CD[0] ;
         A386TBM23_CRT_DATETIME = BC000I11_A386TBM23_CRT_DATETIME[0] ;
         n386TBM23_CRT_DATETIME = BC000I11_n386TBM23_CRT_DATETIME[0] ;
         A387TBM23_CRT_USER_ID = BC000I11_A387TBM23_CRT_USER_ID[0] ;
         n387TBM23_CRT_USER_ID = BC000I11_n387TBM23_CRT_USER_ID[0] ;
         A389TBM23_UPD_DATETIME = BC000I11_A389TBM23_UPD_DATETIME[0] ;
         n389TBM23_UPD_DATETIME = BC000I11_n389TBM23_UPD_DATETIME[0] ;
         A390TBM23_UPD_USER_ID = BC000I11_A390TBM23_UPD_USER_ID[0] ;
         n390TBM23_UPD_USER_ID = BC000I11_n390TBM23_UPD_USER_ID[0] ;
         A392TBM23_UPD_CNT = BC000I11_A392TBM23_UPD_CNT[0] ;
         n392TBM23_UPD_CNT = BC000I11_n392TBM23_UPD_CNT[0] ;
         A385TBM23_DEL_FLG = BC000I11_A385TBM23_DEL_FLG[0] ;
         n385TBM23_DEL_FLG = BC000I11_n385TBM23_DEL_FLG[0] ;
         A388TBM23_CRT_PROG_NM = BC000I11_A388TBM23_CRT_PROG_NM[0] ;
         n388TBM23_CRT_PROG_NM = BC000I11_n388TBM23_CRT_PROG_NM[0] ;
         A391TBM23_UPD_PROG_NM = BC000I11_A391TBM23_UPD_PROG_NM[0] ;
         n391TBM23_UPD_PROG_NM = BC000I11_n391TBM23_UPD_PROG_NM[0] ;
         A107TBM23_STUDY_ID = BC000I11_A107TBM23_STUDY_ID[0] ;
         A108TBM23_USER_ID = BC000I11_A108TBM23_USER_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0I17( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound17 = (short)(0) ;
      scanKeyLoad0I17( ) ;
   }

   public void scanKeyLoad0I17( )
   {
      sMode17 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A109TBM23_STYDY_AUTH_CD = BC000I11_A109TBM23_STYDY_AUTH_CD[0] ;
         A386TBM23_CRT_DATETIME = BC000I11_A386TBM23_CRT_DATETIME[0] ;
         n386TBM23_CRT_DATETIME = BC000I11_n386TBM23_CRT_DATETIME[0] ;
         A387TBM23_CRT_USER_ID = BC000I11_A387TBM23_CRT_USER_ID[0] ;
         n387TBM23_CRT_USER_ID = BC000I11_n387TBM23_CRT_USER_ID[0] ;
         A389TBM23_UPD_DATETIME = BC000I11_A389TBM23_UPD_DATETIME[0] ;
         n389TBM23_UPD_DATETIME = BC000I11_n389TBM23_UPD_DATETIME[0] ;
         A390TBM23_UPD_USER_ID = BC000I11_A390TBM23_UPD_USER_ID[0] ;
         n390TBM23_UPD_USER_ID = BC000I11_n390TBM23_UPD_USER_ID[0] ;
         A392TBM23_UPD_CNT = BC000I11_A392TBM23_UPD_CNT[0] ;
         n392TBM23_UPD_CNT = BC000I11_n392TBM23_UPD_CNT[0] ;
         A385TBM23_DEL_FLG = BC000I11_A385TBM23_DEL_FLG[0] ;
         n385TBM23_DEL_FLG = BC000I11_n385TBM23_DEL_FLG[0] ;
         A388TBM23_CRT_PROG_NM = BC000I11_A388TBM23_CRT_PROG_NM[0] ;
         n388TBM23_CRT_PROG_NM = BC000I11_n388TBM23_CRT_PROG_NM[0] ;
         A391TBM23_UPD_PROG_NM = BC000I11_A391TBM23_UPD_PROG_NM[0] ;
         n391TBM23_UPD_PROG_NM = BC000I11_n391TBM23_UPD_PROG_NM[0] ;
         A107TBM23_STUDY_ID = BC000I11_A107TBM23_STUDY_ID[0] ;
         A108TBM23_USER_ID = BC000I11_A108TBM23_USER_ID[0] ;
      }
      Gx_mode = sMode17 ;
   }

   public void scanKeyEnd0I17( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0I17( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0I17( )
   {
      /* Before Insert Rules */
      A386TBM23_CRT_DATETIME = GXutil.now( ) ;
      n386TBM23_CRT_DATETIME = false ;
      GXt_char1 = A387TBM23_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm23_study_staff_bc.this.GXt_char1 = GXv_char2[0] ;
      A387TBM23_CRT_USER_ID = GXt_char1 ;
      n387TBM23_CRT_USER_ID = false ;
      A389TBM23_UPD_DATETIME = GXutil.now( ) ;
      n389TBM23_UPD_DATETIME = false ;
      GXt_char1 = A390TBM23_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm23_study_staff_bc.this.GXt_char1 = GXv_char2[0] ;
      A390TBM23_UPD_USER_ID = GXt_char1 ;
      n390TBM23_UPD_USER_ID = false ;
      A392TBM23_UPD_CNT = (long)(O392TBM23_UPD_CNT+1) ;
      n392TBM23_UPD_CNT = false ;
   }

   public void beforeUpdate0I17( )
   {
      /* Before Update Rules */
      A389TBM23_UPD_DATETIME = GXutil.now( ) ;
      n389TBM23_UPD_DATETIME = false ;
      GXt_char1 = A390TBM23_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm23_study_staff_bc.this.GXt_char1 = GXv_char2[0] ;
      A390TBM23_UPD_USER_ID = GXt_char1 ;
      n390TBM23_UPD_USER_ID = false ;
      A392TBM23_UPD_CNT = (long)(O392TBM23_UPD_CNT+1) ;
      n392TBM23_UPD_CNT = false ;
   }

   public void beforeDelete0I17( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0I17( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0I17( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0I17( )
   {
   }

   public void addRow0I17( )
   {
      VarsToRow17( bcTBM23_STUDY_STAFF) ;
   }

   public void readRow0I17( )
   {
      RowToVars17( bcTBM23_STUDY_STAFF, 1) ;
   }

   public void initializeNonKey0I17( )
   {
      A386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n386TBM23_CRT_DATETIME = false ;
      A387TBM23_CRT_USER_ID = "" ;
      n387TBM23_CRT_USER_ID = false ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n389TBM23_UPD_DATETIME = false ;
      A390TBM23_UPD_USER_ID = "" ;
      n390TBM23_UPD_USER_ID = false ;
      A392TBM23_UPD_CNT = 0 ;
      n392TBM23_UPD_CNT = false ;
      A385TBM23_DEL_FLG = "" ;
      n385TBM23_DEL_FLG = false ;
      A388TBM23_CRT_PROG_NM = "" ;
      n388TBM23_CRT_PROG_NM = false ;
      A391TBM23_UPD_PROG_NM = "" ;
      n391TBM23_UPD_PROG_NM = false ;
      O392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
      n392TBM23_UPD_CNT = false ;
   }

   public void initAll0I17( )
   {
      A107TBM23_STUDY_ID = 0 ;
      A108TBM23_USER_ID = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      initializeNonKey0I17( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow17( SdtTBM23_STUDY_STAFF obj17 )
   {
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Mode( Gx_mode );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime( A386TBM23_CRT_DATETIME );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id( A387TBM23_CRT_USER_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime( A389TBM23_UPD_DATETIME );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id( A390TBM23_UPD_USER_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt( A392TBM23_UPD_CNT );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg( A385TBM23_DEL_FLG );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm( A388TBM23_CRT_PROG_NM );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm( A391TBM23_UPD_PROG_NM );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id( A107TBM23_STUDY_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id( A108TBM23_USER_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd( A109TBM23_STYDY_AUTH_CD );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id_Z( Z107TBM23_STUDY_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id_Z( Z108TBM23_USER_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd_Z( Z109TBM23_STYDY_AUTH_CD );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_Z( Z385TBM23_DEL_FLG );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_Z( Z386TBM23_CRT_DATETIME );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_Z( Z387TBM23_CRT_USER_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_Z( Z388TBM23_CRT_PROG_NM );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_Z( Z389TBM23_UPD_DATETIME );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_Z( Z390TBM23_UPD_USER_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_Z( Z391TBM23_UPD_PROG_NM );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_Z( Z392TBM23_UPD_CNT );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_N( (byte)((byte)((n385TBM23_DEL_FLG)?1:0)) );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_N( (byte)((byte)((n386TBM23_CRT_DATETIME)?1:0)) );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_N( (byte)((byte)((n387TBM23_CRT_USER_ID)?1:0)) );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_N( (byte)((byte)((n388TBM23_CRT_PROG_NM)?1:0)) );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_N( (byte)((byte)((n389TBM23_UPD_DATETIME)?1:0)) );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_N( (byte)((byte)((n390TBM23_UPD_USER_ID)?1:0)) );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_N( (byte)((byte)((n391TBM23_UPD_PROG_NM)?1:0)) );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_N( (byte)((byte)((n392TBM23_UPD_CNT)?1:0)) );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Mode( Gx_mode );
   }

   public void KeyVarsToRow17( SdtTBM23_STUDY_STAFF obj17 )
   {
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id( A107TBM23_STUDY_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id( A108TBM23_USER_ID );
      obj17.setgxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd( A109TBM23_STYDY_AUTH_CD );
   }

   public void RowToVars17( SdtTBM23_STUDY_STAFF obj17 ,
                            int forceLoad )
   {
      Gx_mode = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Mode() ;
      A386TBM23_CRT_DATETIME = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime() ;
      n386TBM23_CRT_DATETIME = false ;
      A387TBM23_CRT_USER_ID = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id() ;
      n387TBM23_CRT_USER_ID = false ;
      A389TBM23_UPD_DATETIME = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime() ;
      n389TBM23_UPD_DATETIME = false ;
      A390TBM23_UPD_USER_ID = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id() ;
      n390TBM23_UPD_USER_ID = false ;
      A392TBM23_UPD_CNT = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt() ;
      n392TBM23_UPD_CNT = false ;
      A385TBM23_DEL_FLG = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg() ;
      n385TBM23_DEL_FLG = false ;
      A388TBM23_CRT_PROG_NM = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm() ;
      n388TBM23_CRT_PROG_NM = false ;
      A391TBM23_UPD_PROG_NM = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm() ;
      n391TBM23_UPD_PROG_NM = false ;
      A107TBM23_STUDY_ID = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id() ;
      A108TBM23_USER_ID = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id() ;
      A109TBM23_STYDY_AUTH_CD = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd() ;
      Z107TBM23_STUDY_ID = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id_Z() ;
      Z108TBM23_USER_ID = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id_Z() ;
      Z109TBM23_STYDY_AUTH_CD = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd_Z() ;
      Z385TBM23_DEL_FLG = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_Z() ;
      Z386TBM23_CRT_DATETIME = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_Z() ;
      Z387TBM23_CRT_USER_ID = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_Z() ;
      Z388TBM23_CRT_PROG_NM = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_Z() ;
      Z389TBM23_UPD_DATETIME = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_Z() ;
      Z390TBM23_UPD_USER_ID = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_Z() ;
      Z391TBM23_UPD_PROG_NM = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_Z() ;
      Z392TBM23_UPD_CNT = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_Z() ;
      O392TBM23_UPD_CNT = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_Z() ;
      n385TBM23_DEL_FLG = (boolean)((obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_N()==0)?false:true) ;
      n386TBM23_CRT_DATETIME = (boolean)((obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_N()==0)?false:true) ;
      n387TBM23_CRT_USER_ID = (boolean)((obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_N()==0)?false:true) ;
      n388TBM23_CRT_PROG_NM = (boolean)((obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_N()==0)?false:true) ;
      n389TBM23_UPD_DATETIME = (boolean)((obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_N()==0)?false:true) ;
      n390TBM23_UPD_USER_ID = (boolean)((obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_N()==0)?false:true) ;
      n391TBM23_UPD_PROG_NM = (boolean)((obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_N()==0)?false:true) ;
      n392TBM23_UPD_CNT = (boolean)((obj17.getgxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj17.getgxTv_SdtTBM23_STUDY_STAFF_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A107TBM23_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A108TBM23_USER_ID = (String)getParm(obj,1) ;
      A109TBM23_STYDY_AUTH_CD = (String)getParm(obj,2) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0I17( ) ;
      scanKeyStart0I17( ) ;
      if ( RcdFound17 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000I4 */
         pr_default.execute(2, new Object[] {new Long(A107TBM23_STUDY_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
         /* Using cursor BC000I5 */
         pr_default.execute(3, new Object[] {A108TBM23_USER_ID});
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(3);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z107TBM23_STUDY_ID = A107TBM23_STUDY_ID ;
         Z108TBM23_USER_ID = A108TBM23_USER_ID ;
         Z109TBM23_STYDY_AUTH_CD = A109TBM23_STYDY_AUTH_CD ;
         O392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
         n392TBM23_UPD_CNT = false ;
      }
      zm0I17( -8) ;
      onLoadActions0I17( ) ;
      addRow0I17( ) ;
      scanKeyEnd0I17( ) ;
      if ( RcdFound17 == 0 )
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
      RowToVars17( bcTBM23_STUDY_STAFF, 0) ;
      scanKeyStart0I17( ) ;
      if ( RcdFound17 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000I4 */
         pr_default.execute(2, new Object[] {new Long(A107TBM23_STUDY_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
         /* Using cursor BC000I5 */
         pr_default.execute(3, new Object[] {A108TBM23_USER_ID});
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(3);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z107TBM23_STUDY_ID = A107TBM23_STUDY_ID ;
         Z108TBM23_USER_ID = A108TBM23_USER_ID ;
         Z109TBM23_STYDY_AUTH_CD = A109TBM23_STYDY_AUTH_CD ;
         O392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
         n392TBM23_UPD_CNT = false ;
      }
      zm0I17( -8) ;
      onLoadActions0I17( ) ;
      addRow0I17( ) ;
      scanKeyEnd0I17( ) ;
      if ( RcdFound17 == 0 )
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
      RowToVars17( bcTBM23_STUDY_STAFF, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0I17( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0I17( ) ;
      }
      else
      {
         if ( RcdFound17 == 1 )
         {
            if ( ( A107TBM23_STUDY_ID != Z107TBM23_STUDY_ID ) || ( GXutil.strcmp(A108TBM23_USER_ID, Z108TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A109TBM23_STYDY_AUTH_CD, Z109TBM23_STYDY_AUTH_CD) != 0 ) )
            {
               A107TBM23_STUDY_ID = Z107TBM23_STUDY_ID ;
               A108TBM23_USER_ID = Z108TBM23_USER_ID ;
               A109TBM23_STYDY_AUTH_CD = Z109TBM23_STYDY_AUTH_CD ;
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
               update0I17( ) ;
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
               if ( ( A107TBM23_STUDY_ID != Z107TBM23_STUDY_ID ) || ( GXutil.strcmp(A108TBM23_USER_ID, Z108TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A109TBM23_STYDY_AUTH_CD, Z109TBM23_STYDY_AUTH_CD) != 0 ) )
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
                     insert0I17( ) ;
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
                     insert0I17( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow17( bcTBM23_STUDY_STAFF) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars17( bcTBM23_STUDY_STAFF, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0I17( ) ;
      if ( RcdFound17 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A107TBM23_STUDY_ID != Z107TBM23_STUDY_ID ) || ( GXutil.strcmp(A108TBM23_USER_ID, Z108TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A109TBM23_STYDY_AUTH_CD, Z109TBM23_STYDY_AUTH_CD) != 0 ) )
         {
            A107TBM23_STUDY_ID = Z107TBM23_STUDY_ID ;
            A108TBM23_USER_ID = Z108TBM23_USER_ID ;
            A109TBM23_STYDY_AUTH_CD = Z109TBM23_STYDY_AUTH_CD ;
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
         if ( ( A107TBM23_STUDY_ID != Z107TBM23_STUDY_ID ) || ( GXutil.strcmp(A108TBM23_USER_ID, Z108TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A109TBM23_STYDY_AUTH_CD, Z109TBM23_STYDY_AUTH_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm23_study_staff_bc");
      VarsToRow17( bcTBM23_STUDY_STAFF) ;
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
      Gx_mode = bcTBM23_STUDY_STAFF.getgxTv_SdtTBM23_STUDY_STAFF_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM23_STUDY_STAFF.setgxTv_SdtTBM23_STUDY_STAFF_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM23_STUDY_STAFF sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM23_STUDY_STAFF )
      {
         bcTBM23_STUDY_STAFF = sdt ;
         if ( GXutil.strcmp(bcTBM23_STUDY_STAFF.getgxTv_SdtTBM23_STUDY_STAFF_Mode(), "") == 0 )
         {
            bcTBM23_STUDY_STAFF.setgxTv_SdtTBM23_STUDY_STAFF_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow17( bcTBM23_STUDY_STAFF) ;
         }
         else
         {
            RowToVars17( bcTBM23_STUDY_STAFF, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM23_STUDY_STAFF.getgxTv_SdtTBM23_STUDY_STAFF_Mode(), "") == 0 )
         {
            bcTBM23_STUDY_STAFF.setgxTv_SdtTBM23_STUDY_STAFF_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars17( bcTBM23_STUDY_STAFF, 1) ;
   }

   public SdtTBM23_STUDY_STAFF getTBM23_STUDY_STAFF_BC( )
   {
      return bcTBM23_STUDY_STAFF ;
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
      pr_default.close(3);
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
      Z108TBM23_USER_ID = "" ;
      A108TBM23_USER_ID = "" ;
      Z109TBM23_STYDY_AUTH_CD = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A385TBM23_DEL_FLG = "" ;
      A386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A387TBM23_CRT_USER_ID = "" ;
      A388TBM23_CRT_PROG_NM = "" ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A390TBM23_UPD_USER_ID = "" ;
      A391TBM23_UPD_PROG_NM = "" ;
      Z386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z387TBM23_CRT_USER_ID = "" ;
      Z389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z390TBM23_UPD_USER_ID = "" ;
      Z385TBM23_DEL_FLG = "" ;
      Z388TBM23_CRT_PROG_NM = "" ;
      Z391TBM23_UPD_PROG_NM = "" ;
      BC000I6_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000I6_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000I6_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      BC000I6_A387TBM23_CRT_USER_ID = new String[] {""} ;
      BC000I6_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      BC000I6_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000I6_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      BC000I6_A390TBM23_UPD_USER_ID = new String[] {""} ;
      BC000I6_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      BC000I6_A392TBM23_UPD_CNT = new long[1] ;
      BC000I6_n392TBM23_UPD_CNT = new boolean[] {false} ;
      BC000I6_A385TBM23_DEL_FLG = new String[] {""} ;
      BC000I6_n385TBM23_DEL_FLG = new boolean[] {false} ;
      BC000I6_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      BC000I6_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      BC000I6_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      BC000I6_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      BC000I6_A107TBM23_STUDY_ID = new long[1] ;
      BC000I6_A108TBM23_USER_ID = new String[] {""} ;
      BC000I4_A107TBM23_STUDY_ID = new long[1] ;
      BC000I5_A108TBM23_USER_ID = new String[] {""} ;
      BC000I7_A107TBM23_STUDY_ID = new long[1] ;
      BC000I7_A108TBM23_USER_ID = new String[] {""} ;
      BC000I7_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000I3_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000I3_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000I3_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      BC000I3_A387TBM23_CRT_USER_ID = new String[] {""} ;
      BC000I3_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      BC000I3_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000I3_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      BC000I3_A390TBM23_UPD_USER_ID = new String[] {""} ;
      BC000I3_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      BC000I3_A392TBM23_UPD_CNT = new long[1] ;
      BC000I3_n392TBM23_UPD_CNT = new boolean[] {false} ;
      BC000I3_A385TBM23_DEL_FLG = new String[] {""} ;
      BC000I3_n385TBM23_DEL_FLG = new boolean[] {false} ;
      BC000I3_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      BC000I3_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      BC000I3_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      BC000I3_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      BC000I3_A107TBM23_STUDY_ID = new long[1] ;
      BC000I3_A108TBM23_USER_ID = new String[] {""} ;
      sMode17 = "" ;
      BC000I2_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000I2_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000I2_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      BC000I2_A387TBM23_CRT_USER_ID = new String[] {""} ;
      BC000I2_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      BC000I2_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000I2_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      BC000I2_A390TBM23_UPD_USER_ID = new String[] {""} ;
      BC000I2_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      BC000I2_A392TBM23_UPD_CNT = new long[1] ;
      BC000I2_n392TBM23_UPD_CNT = new boolean[] {false} ;
      BC000I2_A385TBM23_DEL_FLG = new String[] {""} ;
      BC000I2_n385TBM23_DEL_FLG = new boolean[] {false} ;
      BC000I2_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      BC000I2_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      BC000I2_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      BC000I2_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      BC000I2_A107TBM23_STUDY_ID = new long[1] ;
      BC000I2_A108TBM23_USER_ID = new String[] {""} ;
      BC000I11_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000I11_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000I11_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      BC000I11_A387TBM23_CRT_USER_ID = new String[] {""} ;
      BC000I11_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      BC000I11_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000I11_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      BC000I11_A390TBM23_UPD_USER_ID = new String[] {""} ;
      BC000I11_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      BC000I11_A392TBM23_UPD_CNT = new long[1] ;
      BC000I11_n392TBM23_UPD_CNT = new boolean[] {false} ;
      BC000I11_A385TBM23_DEL_FLG = new String[] {""} ;
      BC000I11_n385TBM23_DEL_FLG = new boolean[] {false} ;
      BC000I11_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      BC000I11_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      BC000I11_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      BC000I11_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      BC000I11_A107TBM23_STUDY_ID = new long[1] ;
      BC000I11_A108TBM23_USER_ID = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm23_study_staff_bc__default(),
         new Object[] {
             new Object[] {
            BC000I2_A109TBM23_STYDY_AUTH_CD, BC000I2_A386TBM23_CRT_DATETIME, BC000I2_n386TBM23_CRT_DATETIME, BC000I2_A387TBM23_CRT_USER_ID, BC000I2_n387TBM23_CRT_USER_ID, BC000I2_A389TBM23_UPD_DATETIME, BC000I2_n389TBM23_UPD_DATETIME, BC000I2_A390TBM23_UPD_USER_ID, BC000I2_n390TBM23_UPD_USER_ID, BC000I2_A392TBM23_UPD_CNT,
            BC000I2_n392TBM23_UPD_CNT, BC000I2_A385TBM23_DEL_FLG, BC000I2_n385TBM23_DEL_FLG, BC000I2_A388TBM23_CRT_PROG_NM, BC000I2_n388TBM23_CRT_PROG_NM, BC000I2_A391TBM23_UPD_PROG_NM, BC000I2_n391TBM23_UPD_PROG_NM, BC000I2_A107TBM23_STUDY_ID, BC000I2_A108TBM23_USER_ID
            }
            , new Object[] {
            BC000I3_A109TBM23_STYDY_AUTH_CD, BC000I3_A386TBM23_CRT_DATETIME, BC000I3_n386TBM23_CRT_DATETIME, BC000I3_A387TBM23_CRT_USER_ID, BC000I3_n387TBM23_CRT_USER_ID, BC000I3_A389TBM23_UPD_DATETIME, BC000I3_n389TBM23_UPD_DATETIME, BC000I3_A390TBM23_UPD_USER_ID, BC000I3_n390TBM23_UPD_USER_ID, BC000I3_A392TBM23_UPD_CNT,
            BC000I3_n392TBM23_UPD_CNT, BC000I3_A385TBM23_DEL_FLG, BC000I3_n385TBM23_DEL_FLG, BC000I3_A388TBM23_CRT_PROG_NM, BC000I3_n388TBM23_CRT_PROG_NM, BC000I3_A391TBM23_UPD_PROG_NM, BC000I3_n391TBM23_UPD_PROG_NM, BC000I3_A107TBM23_STUDY_ID, BC000I3_A108TBM23_USER_ID
            }
            , new Object[] {
            BC000I4_A107TBM23_STUDY_ID
            }
            , new Object[] {
            BC000I5_A108TBM23_USER_ID
            }
            , new Object[] {
            BC000I6_A109TBM23_STYDY_AUTH_CD, BC000I6_A386TBM23_CRT_DATETIME, BC000I6_n386TBM23_CRT_DATETIME, BC000I6_A387TBM23_CRT_USER_ID, BC000I6_n387TBM23_CRT_USER_ID, BC000I6_A389TBM23_UPD_DATETIME, BC000I6_n389TBM23_UPD_DATETIME, BC000I6_A390TBM23_UPD_USER_ID, BC000I6_n390TBM23_UPD_USER_ID, BC000I6_A392TBM23_UPD_CNT,
            BC000I6_n392TBM23_UPD_CNT, BC000I6_A385TBM23_DEL_FLG, BC000I6_n385TBM23_DEL_FLG, BC000I6_A388TBM23_CRT_PROG_NM, BC000I6_n388TBM23_CRT_PROG_NM, BC000I6_A391TBM23_UPD_PROG_NM, BC000I6_n391TBM23_UPD_PROG_NM, BC000I6_A107TBM23_STUDY_ID, BC000I6_A108TBM23_USER_ID
            }
            , new Object[] {
            BC000I7_A107TBM23_STUDY_ID, BC000I7_A108TBM23_USER_ID, BC000I7_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000I11_A109TBM23_STYDY_AUTH_CD, BC000I11_A386TBM23_CRT_DATETIME, BC000I11_n386TBM23_CRT_DATETIME, BC000I11_A387TBM23_CRT_USER_ID, BC000I11_n387TBM23_CRT_USER_ID, BC000I11_A389TBM23_UPD_DATETIME, BC000I11_n389TBM23_UPD_DATETIME, BC000I11_A390TBM23_UPD_USER_ID, BC000I11_n390TBM23_UPD_USER_ID, BC000I11_A392TBM23_UPD_CNT,
            BC000I11_n392TBM23_UPD_CNT, BC000I11_A385TBM23_DEL_FLG, BC000I11_n385TBM23_DEL_FLG, BC000I11_A388TBM23_CRT_PROG_NM, BC000I11_n388TBM23_CRT_PROG_NM, BC000I11_A391TBM23_UPD_PROG_NM, BC000I11_n391TBM23_UPD_PROG_NM, BC000I11_A107TBM23_STUDY_ID, BC000I11_A108TBM23_USER_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM23_STUDY_STAFF_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110I2 */
      e110I2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound17 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z107TBM23_STUDY_ID ;
   private long A107TBM23_STUDY_ID ;
   private long A392TBM23_UPD_CNT ;
   private long Z392TBM23_UPD_CNT ;
   private long O392TBM23_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode17 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A386TBM23_CRT_DATETIME ;
   private java.util.Date A389TBM23_UPD_DATETIME ;
   private java.util.Date Z386TBM23_CRT_DATETIME ;
   private java.util.Date Z389TBM23_UPD_DATETIME ;
   private boolean n386TBM23_CRT_DATETIME ;
   private boolean n387TBM23_CRT_USER_ID ;
   private boolean n389TBM23_UPD_DATETIME ;
   private boolean n390TBM23_UPD_USER_ID ;
   private boolean n392TBM23_UPD_CNT ;
   private boolean n385TBM23_DEL_FLG ;
   private boolean n388TBM23_CRT_PROG_NM ;
   private boolean n391TBM23_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z108TBM23_USER_ID ;
   private String A108TBM23_USER_ID ;
   private String Z109TBM23_STYDY_AUTH_CD ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A385TBM23_DEL_FLG ;
   private String A387TBM23_CRT_USER_ID ;
   private String A388TBM23_CRT_PROG_NM ;
   private String A390TBM23_UPD_USER_ID ;
   private String A391TBM23_UPD_PROG_NM ;
   private String Z387TBM23_CRT_USER_ID ;
   private String Z390TBM23_UPD_USER_ID ;
   private String Z385TBM23_DEL_FLG ;
   private String Z388TBM23_CRT_PROG_NM ;
   private String Z391TBM23_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM23_STUDY_STAFF bcTBM23_STUDY_STAFF ;
   private IDataStoreProvider pr_default ;
   private String[] BC000I6_A109TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] BC000I6_A386TBM23_CRT_DATETIME ;
   private boolean[] BC000I6_n386TBM23_CRT_DATETIME ;
   private String[] BC000I6_A387TBM23_CRT_USER_ID ;
   private boolean[] BC000I6_n387TBM23_CRT_USER_ID ;
   private java.util.Date[] BC000I6_A389TBM23_UPD_DATETIME ;
   private boolean[] BC000I6_n389TBM23_UPD_DATETIME ;
   private String[] BC000I6_A390TBM23_UPD_USER_ID ;
   private boolean[] BC000I6_n390TBM23_UPD_USER_ID ;
   private long[] BC000I6_A392TBM23_UPD_CNT ;
   private boolean[] BC000I6_n392TBM23_UPD_CNT ;
   private String[] BC000I6_A385TBM23_DEL_FLG ;
   private boolean[] BC000I6_n385TBM23_DEL_FLG ;
   private String[] BC000I6_A388TBM23_CRT_PROG_NM ;
   private boolean[] BC000I6_n388TBM23_CRT_PROG_NM ;
   private String[] BC000I6_A391TBM23_UPD_PROG_NM ;
   private boolean[] BC000I6_n391TBM23_UPD_PROG_NM ;
   private long[] BC000I6_A107TBM23_STUDY_ID ;
   private String[] BC000I6_A108TBM23_USER_ID ;
   private long[] BC000I4_A107TBM23_STUDY_ID ;
   private String[] BC000I5_A108TBM23_USER_ID ;
   private long[] BC000I7_A107TBM23_STUDY_ID ;
   private String[] BC000I7_A108TBM23_USER_ID ;
   private String[] BC000I7_A109TBM23_STYDY_AUTH_CD ;
   private String[] BC000I3_A109TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] BC000I3_A386TBM23_CRT_DATETIME ;
   private boolean[] BC000I3_n386TBM23_CRT_DATETIME ;
   private String[] BC000I3_A387TBM23_CRT_USER_ID ;
   private boolean[] BC000I3_n387TBM23_CRT_USER_ID ;
   private java.util.Date[] BC000I3_A389TBM23_UPD_DATETIME ;
   private boolean[] BC000I3_n389TBM23_UPD_DATETIME ;
   private String[] BC000I3_A390TBM23_UPD_USER_ID ;
   private boolean[] BC000I3_n390TBM23_UPD_USER_ID ;
   private long[] BC000I3_A392TBM23_UPD_CNT ;
   private boolean[] BC000I3_n392TBM23_UPD_CNT ;
   private String[] BC000I3_A385TBM23_DEL_FLG ;
   private boolean[] BC000I3_n385TBM23_DEL_FLG ;
   private String[] BC000I3_A388TBM23_CRT_PROG_NM ;
   private boolean[] BC000I3_n388TBM23_CRT_PROG_NM ;
   private String[] BC000I3_A391TBM23_UPD_PROG_NM ;
   private boolean[] BC000I3_n391TBM23_UPD_PROG_NM ;
   private long[] BC000I3_A107TBM23_STUDY_ID ;
   private String[] BC000I3_A108TBM23_USER_ID ;
   private String[] BC000I2_A109TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] BC000I2_A386TBM23_CRT_DATETIME ;
   private boolean[] BC000I2_n386TBM23_CRT_DATETIME ;
   private String[] BC000I2_A387TBM23_CRT_USER_ID ;
   private boolean[] BC000I2_n387TBM23_CRT_USER_ID ;
   private java.util.Date[] BC000I2_A389TBM23_UPD_DATETIME ;
   private boolean[] BC000I2_n389TBM23_UPD_DATETIME ;
   private String[] BC000I2_A390TBM23_UPD_USER_ID ;
   private boolean[] BC000I2_n390TBM23_UPD_USER_ID ;
   private long[] BC000I2_A392TBM23_UPD_CNT ;
   private boolean[] BC000I2_n392TBM23_UPD_CNT ;
   private String[] BC000I2_A385TBM23_DEL_FLG ;
   private boolean[] BC000I2_n385TBM23_DEL_FLG ;
   private String[] BC000I2_A388TBM23_CRT_PROG_NM ;
   private boolean[] BC000I2_n388TBM23_CRT_PROG_NM ;
   private String[] BC000I2_A391TBM23_UPD_PROG_NM ;
   private boolean[] BC000I2_n391TBM23_UPD_PROG_NM ;
   private long[] BC000I2_A107TBM23_STUDY_ID ;
   private String[] BC000I2_A108TBM23_USER_ID ;
   private String[] BC000I11_A109TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] BC000I11_A386TBM23_CRT_DATETIME ;
   private boolean[] BC000I11_n386TBM23_CRT_DATETIME ;
   private String[] BC000I11_A387TBM23_CRT_USER_ID ;
   private boolean[] BC000I11_n387TBM23_CRT_USER_ID ;
   private java.util.Date[] BC000I11_A389TBM23_UPD_DATETIME ;
   private boolean[] BC000I11_n389TBM23_UPD_DATETIME ;
   private String[] BC000I11_A390TBM23_UPD_USER_ID ;
   private boolean[] BC000I11_n390TBM23_UPD_USER_ID ;
   private long[] BC000I11_A392TBM23_UPD_CNT ;
   private boolean[] BC000I11_n392TBM23_UPD_CNT ;
   private String[] BC000I11_A385TBM23_DEL_FLG ;
   private boolean[] BC000I11_n385TBM23_DEL_FLG ;
   private String[] BC000I11_A388TBM23_CRT_PROG_NM ;
   private boolean[] BC000I11_n388TBM23_CRT_PROG_NM ;
   private String[] BC000I11_A391TBM23_UPD_PROG_NM ;
   private boolean[] BC000I11_n391TBM23_UPD_PROG_NM ;
   private long[] BC000I11_A107TBM23_STUDY_ID ;
   private String[] BC000I11_A108TBM23_USER_ID ;
}

final  class tbm23_study_staff_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000I2", "SELECT `TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000I3", "SELECT `TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000I4", "SELECT `TBM21_STUDY_ID` AS TBM23_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000I5", "SELECT `TAM07_USER_ID` AS TBM23_USER_ID FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000I6", "SELECT TM1.`TBM23_STYDY_AUTH_CD`, TM1.`TBM23_CRT_DATETIME`, TM1.`TBM23_CRT_USER_ID`, TM1.`TBM23_UPD_DATETIME`, TM1.`TBM23_UPD_USER_ID`, TM1.`TBM23_UPD_CNT`, TM1.`TBM23_DEL_FLG`, TM1.`TBM23_CRT_PROG_NM`, TM1.`TBM23_UPD_PROG_NM`, TM1.`TBM23_STUDY_ID` AS TBM23_STUDY_ID, TM1.`TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` TM1 WHERE TM1.`TBM23_STUDY_ID` = ? and TM1.`TBM23_USER_ID` = ? and TM1.`TBM23_STYDY_AUTH_CD` = ? ORDER BY TM1.`TBM23_STUDY_ID`, TM1.`TBM23_USER_ID`, TM1.`TBM23_STYDY_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000I7", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000I8", "INSERT INTO `TBM23_STUDY_STAFF`(`TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID`, `TBM23_USER_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000I9", "UPDATE `TBM23_STUDY_STAFF` SET `TBM23_CRT_DATETIME`=?, `TBM23_CRT_USER_ID`=?, `TBM23_UPD_DATETIME`=?, `TBM23_UPD_USER_ID`=?, `TBM23_UPD_CNT`=?, `TBM23_DEL_FLG`=?, `TBM23_CRT_PROG_NM`=?, `TBM23_UPD_PROG_NM`=?  WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000I10", "DELETE FROM `TBM23_STUDY_STAFF`  WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000I11", "SELECT TM1.`TBM23_STYDY_AUTH_CD`, TM1.`TBM23_CRT_DATETIME`, TM1.`TBM23_CRT_USER_ID`, TM1.`TBM23_UPD_DATETIME`, TM1.`TBM23_UPD_USER_ID`, TM1.`TBM23_UPD_CNT`, TM1.`TBM23_DEL_FLG`, TM1.`TBM23_CRT_PROG_NM`, TM1.`TBM23_UPD_PROG_NM`, TM1.`TBM23_STUDY_ID` AS TBM23_STUDY_ID, TM1.`TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` TM1 WHERE TM1.`TBM23_STUDY_ID` = ? and TM1.`TBM23_USER_ID` = ? and TM1.`TBM23_STYDY_AUTH_CD` = ? ORDER BY TM1.`TBM23_STUDY_ID`, TM1.`TBM23_USER_ID`, TM1.`TBM23_STYDY_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
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
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
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
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
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
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
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
                  stmt.setVarchar(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               stmt.setLong(10, ((Number) parms[17]).longValue());
               stmt.setVarchar(11, (String)parms[18], 128, false);
               return;
            case 7 :
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setVarchar(10, (String)parms[17], 128, false);
               stmt.setVarchar(11, (String)parms[18], 2, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
      }
   }

}

