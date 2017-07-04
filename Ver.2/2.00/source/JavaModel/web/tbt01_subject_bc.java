/*
               File: tbt01_subject_bc
        Description: 患者テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:55.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt01_subject_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt01_subject_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt01_subject_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt01_subject_bc.class ));
   }

   public tbt01_subject_bc( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0O23( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0O23( ) ;
      standaloneModal( ) ;
      addRow0O23( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120O2 */
         e120O2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z87TBT01_STUDY_ID = A87TBT01_STUDY_ID ;
            Z88TBT01_SUBJECT_ID = A88TBT01_SUBJECT_ID ;
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

   public void confirm_0O0( )
   {
      beforeValidate0O23( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0O23( ) ;
         }
         else
         {
            checkExtendedTable0O23( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0O23( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110O2( )
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

   public void e120O2( )
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

   public void zm0O23( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z442TBT01_CRT_DATETIME = A442TBT01_CRT_DATETIME ;
         Z443TBT01_CRT_USER_ID = A443TBT01_CRT_USER_ID ;
         Z445TBT01_UPD_DATETIME = A445TBT01_UPD_DATETIME ;
         Z446TBT01_UPD_USER_ID = A446TBT01_UPD_USER_ID ;
         Z448TBT01_UPD_CNT = A448TBT01_UPD_CNT ;
         Z647TBT01_OUTER_SUBJECT_ID = A647TBT01_OUTER_SUBJECT_ID ;
         Z698TBT01_SITE_ID = A698TBT01_SITE_ID ;
         Z441TBT01_DEL_FLG = A441TBT01_DEL_FLG ;
         Z444TBT01_CRT_PROG_NM = A444TBT01_CRT_PROG_NM ;
         Z447TBT01_UPD_PROG_NM = A447TBT01_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z87TBT01_STUDY_ID = A87TBT01_STUDY_ID ;
         Z88TBT01_SUBJECT_ID = A88TBT01_SUBJECT_ID ;
         Z442TBT01_CRT_DATETIME = A442TBT01_CRT_DATETIME ;
         Z443TBT01_CRT_USER_ID = A443TBT01_CRT_USER_ID ;
         Z445TBT01_UPD_DATETIME = A445TBT01_UPD_DATETIME ;
         Z446TBT01_UPD_USER_ID = A446TBT01_UPD_USER_ID ;
         Z448TBT01_UPD_CNT = A448TBT01_UPD_CNT ;
         Z647TBT01_OUTER_SUBJECT_ID = A647TBT01_OUTER_SUBJECT_ID ;
         Z698TBT01_SITE_ID = A698TBT01_SITE_ID ;
         Z441TBT01_DEL_FLG = A441TBT01_DEL_FLG ;
         Z444TBT01_CRT_PROG_NM = A444TBT01_CRT_PROG_NM ;
         Z447TBT01_UPD_PROG_NM = A447TBT01_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0O23( )
   {
      /* Using cursor BC000O4 */
      pr_default.execute(2, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound23 = (short)(1) ;
         A442TBT01_CRT_DATETIME = BC000O4_A442TBT01_CRT_DATETIME[0] ;
         n442TBT01_CRT_DATETIME = BC000O4_n442TBT01_CRT_DATETIME[0] ;
         A443TBT01_CRT_USER_ID = BC000O4_A443TBT01_CRT_USER_ID[0] ;
         n443TBT01_CRT_USER_ID = BC000O4_n443TBT01_CRT_USER_ID[0] ;
         A445TBT01_UPD_DATETIME = BC000O4_A445TBT01_UPD_DATETIME[0] ;
         n445TBT01_UPD_DATETIME = BC000O4_n445TBT01_UPD_DATETIME[0] ;
         A446TBT01_UPD_USER_ID = BC000O4_A446TBT01_UPD_USER_ID[0] ;
         n446TBT01_UPD_USER_ID = BC000O4_n446TBT01_UPD_USER_ID[0] ;
         A448TBT01_UPD_CNT = BC000O4_A448TBT01_UPD_CNT[0] ;
         n448TBT01_UPD_CNT = BC000O4_n448TBT01_UPD_CNT[0] ;
         A647TBT01_OUTER_SUBJECT_ID = BC000O4_A647TBT01_OUTER_SUBJECT_ID[0] ;
         n647TBT01_OUTER_SUBJECT_ID = BC000O4_n647TBT01_OUTER_SUBJECT_ID[0] ;
         A698TBT01_SITE_ID = BC000O4_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = BC000O4_n698TBT01_SITE_ID[0] ;
         A441TBT01_DEL_FLG = BC000O4_A441TBT01_DEL_FLG[0] ;
         n441TBT01_DEL_FLG = BC000O4_n441TBT01_DEL_FLG[0] ;
         A444TBT01_CRT_PROG_NM = BC000O4_A444TBT01_CRT_PROG_NM[0] ;
         n444TBT01_CRT_PROG_NM = BC000O4_n444TBT01_CRT_PROG_NM[0] ;
         A447TBT01_UPD_PROG_NM = BC000O4_A447TBT01_UPD_PROG_NM[0] ;
         n447TBT01_UPD_PROG_NM = BC000O4_n447TBT01_UPD_PROG_NM[0] ;
         zm0O23( -8) ;
      }
      pr_default.close(2);
      onLoadActions0O23( ) ;
   }

   public void onLoadActions0O23( )
   {
      AV9Pgmname = "TBT01_SUBJECT_BC" ;
   }

   public void checkExtendedTable0O23( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT01_SUBJECT_BC" ;
      if ( ! ( GXutil.nullDate().equals(A442TBT01_CRT_DATETIME) || (( A442TBT01_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A442TBT01_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A445TBT01_UPD_DATETIME) || (( A445TBT01_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A445TBT01_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0O23( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0O23( )
   {
      /* Using cursor BC000O5 */
      pr_default.execute(3, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound23 = (short)(1) ;
      }
      else
      {
         RcdFound23 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000O3 */
      pr_default.execute(1, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0O23( 8) ;
         RcdFound23 = (short)(1) ;
         A87TBT01_STUDY_ID = BC000O3_A87TBT01_STUDY_ID[0] ;
         A88TBT01_SUBJECT_ID = BC000O3_A88TBT01_SUBJECT_ID[0] ;
         A442TBT01_CRT_DATETIME = BC000O3_A442TBT01_CRT_DATETIME[0] ;
         n442TBT01_CRT_DATETIME = BC000O3_n442TBT01_CRT_DATETIME[0] ;
         A443TBT01_CRT_USER_ID = BC000O3_A443TBT01_CRT_USER_ID[0] ;
         n443TBT01_CRT_USER_ID = BC000O3_n443TBT01_CRT_USER_ID[0] ;
         A445TBT01_UPD_DATETIME = BC000O3_A445TBT01_UPD_DATETIME[0] ;
         n445TBT01_UPD_DATETIME = BC000O3_n445TBT01_UPD_DATETIME[0] ;
         A446TBT01_UPD_USER_ID = BC000O3_A446TBT01_UPD_USER_ID[0] ;
         n446TBT01_UPD_USER_ID = BC000O3_n446TBT01_UPD_USER_ID[0] ;
         A448TBT01_UPD_CNT = BC000O3_A448TBT01_UPD_CNT[0] ;
         n448TBT01_UPD_CNT = BC000O3_n448TBT01_UPD_CNT[0] ;
         A647TBT01_OUTER_SUBJECT_ID = BC000O3_A647TBT01_OUTER_SUBJECT_ID[0] ;
         n647TBT01_OUTER_SUBJECT_ID = BC000O3_n647TBT01_OUTER_SUBJECT_ID[0] ;
         A698TBT01_SITE_ID = BC000O3_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = BC000O3_n698TBT01_SITE_ID[0] ;
         A441TBT01_DEL_FLG = BC000O3_A441TBT01_DEL_FLG[0] ;
         n441TBT01_DEL_FLG = BC000O3_n441TBT01_DEL_FLG[0] ;
         A444TBT01_CRT_PROG_NM = BC000O3_A444TBT01_CRT_PROG_NM[0] ;
         n444TBT01_CRT_PROG_NM = BC000O3_n444TBT01_CRT_PROG_NM[0] ;
         A447TBT01_UPD_PROG_NM = BC000O3_A447TBT01_UPD_PROG_NM[0] ;
         n447TBT01_UPD_PROG_NM = BC000O3_n447TBT01_UPD_PROG_NM[0] ;
         O448TBT01_UPD_CNT = A448TBT01_UPD_CNT ;
         n448TBT01_UPD_CNT = false ;
         Z87TBT01_STUDY_ID = A87TBT01_STUDY_ID ;
         Z88TBT01_SUBJECT_ID = A88TBT01_SUBJECT_ID ;
         sMode23 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0O23( ) ;
         if ( AnyError == 1 )
         {
            RcdFound23 = (short)(0) ;
            initializeNonKey0O23( ) ;
         }
         Gx_mode = sMode23 ;
      }
      else
      {
         RcdFound23 = (short)(0) ;
         initializeNonKey0O23( ) ;
         sMode23 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode23 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0O23( ) ;
      if ( RcdFound23 == 0 )
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
      confirm_0O0( ) ;
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

   public void checkOptimisticConcurrency0O23( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000O2 */
         pr_default.execute(0, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT01_SUBJECT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z442TBT01_CRT_DATETIME.equals( BC000O2_A442TBT01_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z443TBT01_CRT_USER_ID, BC000O2_A443TBT01_CRT_USER_ID[0]) != 0 ) || !( Z445TBT01_UPD_DATETIME.equals( BC000O2_A445TBT01_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z446TBT01_UPD_USER_ID, BC000O2_A446TBT01_UPD_USER_ID[0]) != 0 ) || ( Z448TBT01_UPD_CNT != BC000O2_A448TBT01_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z647TBT01_OUTER_SUBJECT_ID, BC000O2_A647TBT01_OUTER_SUBJECT_ID[0]) != 0 ) || ( GXutil.strcmp(Z698TBT01_SITE_ID, BC000O2_A698TBT01_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z441TBT01_DEL_FLG, BC000O2_A441TBT01_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z444TBT01_CRT_PROG_NM, BC000O2_A444TBT01_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z447TBT01_UPD_PROG_NM, BC000O2_A447TBT01_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT01_SUBJECT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0O23( )
   {
      beforeValidate0O23( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0O23( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0O23( 0) ;
         checkOptimisticConcurrency0O23( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0O23( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0O23( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000O6 */
                  pr_default.execute(4, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID), new Boolean(n442TBT01_CRT_DATETIME), A442TBT01_CRT_DATETIME, new Boolean(n443TBT01_CRT_USER_ID), A443TBT01_CRT_USER_ID, new Boolean(n445TBT01_UPD_DATETIME), A445TBT01_UPD_DATETIME, new Boolean(n446TBT01_UPD_USER_ID), A446TBT01_UPD_USER_ID, new Boolean(n448TBT01_UPD_CNT), new Long(A448TBT01_UPD_CNT), new Boolean(n647TBT01_OUTER_SUBJECT_ID), A647TBT01_OUTER_SUBJECT_ID, new Boolean(n698TBT01_SITE_ID), A698TBT01_SITE_ID, new Boolean(n441TBT01_DEL_FLG), A441TBT01_DEL_FLG, new Boolean(n444TBT01_CRT_PROG_NM), A444TBT01_CRT_PROG_NM, new Boolean(n447TBT01_UPD_PROG_NM), A447TBT01_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT01_SUBJECT") ;
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
            load0O23( ) ;
         }
         endLevel0O23( ) ;
      }
      closeExtendedTableCursors0O23( ) ;
   }

   public void update0O23( )
   {
      beforeValidate0O23( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0O23( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0O23( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0O23( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0O23( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000O7 */
                  pr_default.execute(5, new Object[] {new Boolean(n442TBT01_CRT_DATETIME), A442TBT01_CRT_DATETIME, new Boolean(n443TBT01_CRT_USER_ID), A443TBT01_CRT_USER_ID, new Boolean(n445TBT01_UPD_DATETIME), A445TBT01_UPD_DATETIME, new Boolean(n446TBT01_UPD_USER_ID), A446TBT01_UPD_USER_ID, new Boolean(n448TBT01_UPD_CNT), new Long(A448TBT01_UPD_CNT), new Boolean(n647TBT01_OUTER_SUBJECT_ID), A647TBT01_OUTER_SUBJECT_ID, new Boolean(n698TBT01_SITE_ID), A698TBT01_SITE_ID, new Boolean(n441TBT01_DEL_FLG), A441TBT01_DEL_FLG, new Boolean(n444TBT01_CRT_PROG_NM), A444TBT01_CRT_PROG_NM, new Boolean(n447TBT01_UPD_PROG_NM), A447TBT01_UPD_PROG_NM, new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT01_SUBJECT") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT01_SUBJECT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0O23( ) ;
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
         endLevel0O23( ) ;
      }
      closeExtendedTableCursors0O23( ) ;
   }

   public void deferredUpdate0O23( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0O23( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0O23( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0O23( ) ;
         afterConfirm0O23( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0O23( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000O8 */
               pr_default.execute(6, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT01_SUBJECT") ;
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
      sMode23 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0O23( ) ;
      Gx_mode = sMode23 ;
   }

   public void onDeleteControls0O23( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT01_SUBJECT_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000O9 */
         pr_default.execute(7, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFメモテーブル"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(7);
         /* Using cursor BC000O10 */
         pr_default.execute(8, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFテーブル"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
      }
   }

   public void endLevel0O23( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0O23( ) ;
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

   public void scanKeyStart0O23( )
   {
      /* Scan By routine */
      /* Using cursor BC000O11 */
      pr_default.execute(9, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID)});
      RcdFound23 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound23 = (short)(1) ;
         A87TBT01_STUDY_ID = BC000O11_A87TBT01_STUDY_ID[0] ;
         A88TBT01_SUBJECT_ID = BC000O11_A88TBT01_SUBJECT_ID[0] ;
         A442TBT01_CRT_DATETIME = BC000O11_A442TBT01_CRT_DATETIME[0] ;
         n442TBT01_CRT_DATETIME = BC000O11_n442TBT01_CRT_DATETIME[0] ;
         A443TBT01_CRT_USER_ID = BC000O11_A443TBT01_CRT_USER_ID[0] ;
         n443TBT01_CRT_USER_ID = BC000O11_n443TBT01_CRT_USER_ID[0] ;
         A445TBT01_UPD_DATETIME = BC000O11_A445TBT01_UPD_DATETIME[0] ;
         n445TBT01_UPD_DATETIME = BC000O11_n445TBT01_UPD_DATETIME[0] ;
         A446TBT01_UPD_USER_ID = BC000O11_A446TBT01_UPD_USER_ID[0] ;
         n446TBT01_UPD_USER_ID = BC000O11_n446TBT01_UPD_USER_ID[0] ;
         A448TBT01_UPD_CNT = BC000O11_A448TBT01_UPD_CNT[0] ;
         n448TBT01_UPD_CNT = BC000O11_n448TBT01_UPD_CNT[0] ;
         A647TBT01_OUTER_SUBJECT_ID = BC000O11_A647TBT01_OUTER_SUBJECT_ID[0] ;
         n647TBT01_OUTER_SUBJECT_ID = BC000O11_n647TBT01_OUTER_SUBJECT_ID[0] ;
         A698TBT01_SITE_ID = BC000O11_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = BC000O11_n698TBT01_SITE_ID[0] ;
         A441TBT01_DEL_FLG = BC000O11_A441TBT01_DEL_FLG[0] ;
         n441TBT01_DEL_FLG = BC000O11_n441TBT01_DEL_FLG[0] ;
         A444TBT01_CRT_PROG_NM = BC000O11_A444TBT01_CRT_PROG_NM[0] ;
         n444TBT01_CRT_PROG_NM = BC000O11_n444TBT01_CRT_PROG_NM[0] ;
         A447TBT01_UPD_PROG_NM = BC000O11_A447TBT01_UPD_PROG_NM[0] ;
         n447TBT01_UPD_PROG_NM = BC000O11_n447TBT01_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0O23( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound23 = (short)(0) ;
      scanKeyLoad0O23( ) ;
   }

   public void scanKeyLoad0O23( )
   {
      sMode23 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound23 = (short)(1) ;
         A87TBT01_STUDY_ID = BC000O11_A87TBT01_STUDY_ID[0] ;
         A88TBT01_SUBJECT_ID = BC000O11_A88TBT01_SUBJECT_ID[0] ;
         A442TBT01_CRT_DATETIME = BC000O11_A442TBT01_CRT_DATETIME[0] ;
         n442TBT01_CRT_DATETIME = BC000O11_n442TBT01_CRT_DATETIME[0] ;
         A443TBT01_CRT_USER_ID = BC000O11_A443TBT01_CRT_USER_ID[0] ;
         n443TBT01_CRT_USER_ID = BC000O11_n443TBT01_CRT_USER_ID[0] ;
         A445TBT01_UPD_DATETIME = BC000O11_A445TBT01_UPD_DATETIME[0] ;
         n445TBT01_UPD_DATETIME = BC000O11_n445TBT01_UPD_DATETIME[0] ;
         A446TBT01_UPD_USER_ID = BC000O11_A446TBT01_UPD_USER_ID[0] ;
         n446TBT01_UPD_USER_ID = BC000O11_n446TBT01_UPD_USER_ID[0] ;
         A448TBT01_UPD_CNT = BC000O11_A448TBT01_UPD_CNT[0] ;
         n448TBT01_UPD_CNT = BC000O11_n448TBT01_UPD_CNT[0] ;
         A647TBT01_OUTER_SUBJECT_ID = BC000O11_A647TBT01_OUTER_SUBJECT_ID[0] ;
         n647TBT01_OUTER_SUBJECT_ID = BC000O11_n647TBT01_OUTER_SUBJECT_ID[0] ;
         A698TBT01_SITE_ID = BC000O11_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = BC000O11_n698TBT01_SITE_ID[0] ;
         A441TBT01_DEL_FLG = BC000O11_A441TBT01_DEL_FLG[0] ;
         n441TBT01_DEL_FLG = BC000O11_n441TBT01_DEL_FLG[0] ;
         A444TBT01_CRT_PROG_NM = BC000O11_A444TBT01_CRT_PROG_NM[0] ;
         n444TBT01_CRT_PROG_NM = BC000O11_n444TBT01_CRT_PROG_NM[0] ;
         A447TBT01_UPD_PROG_NM = BC000O11_A447TBT01_UPD_PROG_NM[0] ;
         n447TBT01_UPD_PROG_NM = BC000O11_n447TBT01_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode23 ;
   }

   public void scanKeyEnd0O23( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0O23( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0O23( )
   {
      /* Before Insert Rules */
      A442TBT01_CRT_DATETIME = GXutil.now( ) ;
      n442TBT01_CRT_DATETIME = false ;
      GXt_char1 = A443TBT01_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt01_subject_bc.this.GXt_char1 = GXv_char2[0] ;
      A443TBT01_CRT_USER_ID = GXt_char1 ;
      n443TBT01_CRT_USER_ID = false ;
      A445TBT01_UPD_DATETIME = GXutil.now( ) ;
      n445TBT01_UPD_DATETIME = false ;
      GXt_char1 = A446TBT01_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt01_subject_bc.this.GXt_char1 = GXv_char2[0] ;
      A446TBT01_UPD_USER_ID = GXt_char1 ;
      n446TBT01_UPD_USER_ID = false ;
      A448TBT01_UPD_CNT = (long)(O448TBT01_UPD_CNT+1) ;
      n448TBT01_UPD_CNT = false ;
   }

   public void beforeUpdate0O23( )
   {
      /* Before Update Rules */
      A445TBT01_UPD_DATETIME = GXutil.now( ) ;
      n445TBT01_UPD_DATETIME = false ;
      GXt_char1 = A446TBT01_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt01_subject_bc.this.GXt_char1 = GXv_char2[0] ;
      A446TBT01_UPD_USER_ID = GXt_char1 ;
      n446TBT01_UPD_USER_ID = false ;
      A448TBT01_UPD_CNT = (long)(O448TBT01_UPD_CNT+1) ;
      n448TBT01_UPD_CNT = false ;
   }

   public void beforeDelete0O23( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0O23( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0O23( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0O23( )
   {
   }

   public void addRow0O23( )
   {
      VarsToRow23( bcTBT01_SUBJECT) ;
   }

   public void readRow0O23( )
   {
      RowToVars23( bcTBT01_SUBJECT, 1) ;
   }

   public void initializeNonKey0O23( )
   {
      A442TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n442TBT01_CRT_DATETIME = false ;
      A443TBT01_CRT_USER_ID = "" ;
      n443TBT01_CRT_USER_ID = false ;
      A445TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n445TBT01_UPD_DATETIME = false ;
      A446TBT01_UPD_USER_ID = "" ;
      n446TBT01_UPD_USER_ID = false ;
      A448TBT01_UPD_CNT = 0 ;
      n448TBT01_UPD_CNT = false ;
      A647TBT01_OUTER_SUBJECT_ID = "" ;
      n647TBT01_OUTER_SUBJECT_ID = false ;
      A698TBT01_SITE_ID = "" ;
      n698TBT01_SITE_ID = false ;
      A441TBT01_DEL_FLG = "" ;
      n441TBT01_DEL_FLG = false ;
      A444TBT01_CRT_PROG_NM = "" ;
      n444TBT01_CRT_PROG_NM = false ;
      A447TBT01_UPD_PROG_NM = "" ;
      n447TBT01_UPD_PROG_NM = false ;
      O448TBT01_UPD_CNT = A448TBT01_UPD_CNT ;
      n448TBT01_UPD_CNT = false ;
   }

   public void initAll0O23( )
   {
      A87TBT01_STUDY_ID = 0 ;
      A88TBT01_SUBJECT_ID = 0 ;
      initializeNonKey0O23( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow23( SdtTBT01_SUBJECT obj23 )
   {
      obj23.setgxTv_SdtTBT01_SUBJECT_Mode( Gx_mode );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime( A442TBT01_CRT_DATETIME );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id( A443TBT01_CRT_USER_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime( A445TBT01_UPD_DATETIME );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id( A446TBT01_UPD_USER_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt( A448TBT01_UPD_CNT );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id( A647TBT01_OUTER_SUBJECT_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_site_id( A698TBT01_SITE_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_del_flg( A441TBT01_DEL_FLG );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm( A444TBT01_CRT_PROG_NM );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm( A447TBT01_UPD_PROG_NM );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_study_id( A87TBT01_STUDY_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_subject_id( A88TBT01_SUBJECT_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_study_id_Z( Z87TBT01_STUDY_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_subject_id_Z( Z88TBT01_SUBJECT_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_Z( Z647TBT01_OUTER_SUBJECT_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_site_id_Z( Z698TBT01_SITE_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_Z( Z441TBT01_DEL_FLG );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_Z( Z442TBT01_CRT_DATETIME );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_Z( Z443TBT01_CRT_USER_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_Z( Z444TBT01_CRT_PROG_NM );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_Z( Z445TBT01_UPD_DATETIME );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_Z( Z446TBT01_UPD_USER_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_Z( Z447TBT01_UPD_PROG_NM );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_Z( Z448TBT01_UPD_CNT );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_N( (byte)((byte)((n647TBT01_OUTER_SUBJECT_ID)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_site_id_N( (byte)((byte)((n698TBT01_SITE_ID)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_N( (byte)((byte)((n441TBT01_DEL_FLG)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_N( (byte)((byte)((n442TBT01_CRT_DATETIME)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_N( (byte)((byte)((n443TBT01_CRT_USER_ID)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_N( (byte)((byte)((n444TBT01_CRT_PROG_NM)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_N( (byte)((byte)((n445TBT01_UPD_DATETIME)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_N( (byte)((byte)((n446TBT01_UPD_USER_ID)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_N( (byte)((byte)((n447TBT01_UPD_PROG_NM)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_N( (byte)((byte)((n448TBT01_UPD_CNT)?1:0)) );
      obj23.setgxTv_SdtTBT01_SUBJECT_Mode( Gx_mode );
   }

   public void KeyVarsToRow23( SdtTBT01_SUBJECT obj23 )
   {
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_study_id( A87TBT01_STUDY_ID );
      obj23.setgxTv_SdtTBT01_SUBJECT_Tbt01_subject_id( A88TBT01_SUBJECT_ID );
   }

   public void RowToVars23( SdtTBT01_SUBJECT obj23 ,
                            int forceLoad )
   {
      Gx_mode = obj23.getgxTv_SdtTBT01_SUBJECT_Mode() ;
      A442TBT01_CRT_DATETIME = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime() ;
      n442TBT01_CRT_DATETIME = false ;
      A443TBT01_CRT_USER_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id() ;
      n443TBT01_CRT_USER_ID = false ;
      A445TBT01_UPD_DATETIME = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime() ;
      n445TBT01_UPD_DATETIME = false ;
      A446TBT01_UPD_USER_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id() ;
      n446TBT01_UPD_USER_ID = false ;
      A448TBT01_UPD_CNT = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt() ;
      n448TBT01_UPD_CNT = false ;
      A647TBT01_OUTER_SUBJECT_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id() ;
      n647TBT01_OUTER_SUBJECT_ID = false ;
      A698TBT01_SITE_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_site_id() ;
      n698TBT01_SITE_ID = false ;
      A441TBT01_DEL_FLG = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_del_flg() ;
      n441TBT01_DEL_FLG = false ;
      A444TBT01_CRT_PROG_NM = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm() ;
      n444TBT01_CRT_PROG_NM = false ;
      A447TBT01_UPD_PROG_NM = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm() ;
      n447TBT01_UPD_PROG_NM = false ;
      A87TBT01_STUDY_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_study_id() ;
      A88TBT01_SUBJECT_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_subject_id() ;
      Z87TBT01_STUDY_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_study_id_Z() ;
      Z88TBT01_SUBJECT_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_subject_id_Z() ;
      Z647TBT01_OUTER_SUBJECT_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_Z() ;
      Z698TBT01_SITE_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_site_id_Z() ;
      Z441TBT01_DEL_FLG = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_Z() ;
      Z442TBT01_CRT_DATETIME = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_Z() ;
      Z443TBT01_CRT_USER_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_Z() ;
      Z444TBT01_CRT_PROG_NM = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_Z() ;
      Z445TBT01_UPD_DATETIME = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_Z() ;
      Z446TBT01_UPD_USER_ID = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_Z() ;
      Z447TBT01_UPD_PROG_NM = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_Z() ;
      Z448TBT01_UPD_CNT = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_Z() ;
      O448TBT01_UPD_CNT = obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_Z() ;
      n647TBT01_OUTER_SUBJECT_ID = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_N()==0)?false:true) ;
      n698TBT01_SITE_ID = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_site_id_N()==0)?false:true) ;
      n441TBT01_DEL_FLG = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_N()==0)?false:true) ;
      n442TBT01_CRT_DATETIME = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_N()==0)?false:true) ;
      n443TBT01_CRT_USER_ID = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_N()==0)?false:true) ;
      n444TBT01_CRT_PROG_NM = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_N()==0)?false:true) ;
      n445TBT01_UPD_DATETIME = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_N()==0)?false:true) ;
      n446TBT01_UPD_USER_ID = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_N()==0)?false:true) ;
      n447TBT01_UPD_PROG_NM = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_N()==0)?false:true) ;
      n448TBT01_UPD_CNT = (boolean)((obj23.getgxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj23.getgxTv_SdtTBT01_SUBJECT_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A87TBT01_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A88TBT01_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0O23( ) ;
      scanKeyStart0O23( ) ;
      if ( RcdFound23 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z87TBT01_STUDY_ID = A87TBT01_STUDY_ID ;
         Z88TBT01_SUBJECT_ID = A88TBT01_SUBJECT_ID ;
         O448TBT01_UPD_CNT = A448TBT01_UPD_CNT ;
         n448TBT01_UPD_CNT = false ;
      }
      zm0O23( -8) ;
      onLoadActions0O23( ) ;
      addRow0O23( ) ;
      scanKeyEnd0O23( ) ;
      if ( RcdFound23 == 0 )
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
      RowToVars23( bcTBT01_SUBJECT, 0) ;
      scanKeyStart0O23( ) ;
      if ( RcdFound23 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z87TBT01_STUDY_ID = A87TBT01_STUDY_ID ;
         Z88TBT01_SUBJECT_ID = A88TBT01_SUBJECT_ID ;
         O448TBT01_UPD_CNT = A448TBT01_UPD_CNT ;
         n448TBT01_UPD_CNT = false ;
      }
      zm0O23( -8) ;
      onLoadActions0O23( ) ;
      addRow0O23( ) ;
      scanKeyEnd0O23( ) ;
      if ( RcdFound23 == 0 )
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
      RowToVars23( bcTBT01_SUBJECT, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0O23( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0O23( ) ;
      }
      else
      {
         if ( RcdFound23 == 1 )
         {
            if ( ( A87TBT01_STUDY_ID != Z87TBT01_STUDY_ID ) || ( A88TBT01_SUBJECT_ID != Z88TBT01_SUBJECT_ID ) )
            {
               A87TBT01_STUDY_ID = Z87TBT01_STUDY_ID ;
               A88TBT01_SUBJECT_ID = Z88TBT01_SUBJECT_ID ;
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
               update0O23( ) ;
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
               if ( ( A87TBT01_STUDY_ID != Z87TBT01_STUDY_ID ) || ( A88TBT01_SUBJECT_ID != Z88TBT01_SUBJECT_ID ) )
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
                     insert0O23( ) ;
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
                     insert0O23( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow23( bcTBT01_SUBJECT) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars23( bcTBT01_SUBJECT, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0O23( ) ;
      if ( RcdFound23 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A87TBT01_STUDY_ID != Z87TBT01_STUDY_ID ) || ( A88TBT01_SUBJECT_ID != Z88TBT01_SUBJECT_ID ) )
         {
            A87TBT01_STUDY_ID = Z87TBT01_STUDY_ID ;
            A88TBT01_SUBJECT_ID = Z88TBT01_SUBJECT_ID ;
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
         if ( ( A87TBT01_STUDY_ID != Z87TBT01_STUDY_ID ) || ( A88TBT01_SUBJECT_ID != Z88TBT01_SUBJECT_ID ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt01_subject_bc");
      VarsToRow23( bcTBT01_SUBJECT) ;
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
      Gx_mode = bcTBT01_SUBJECT.getgxTv_SdtTBT01_SUBJECT_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT01_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT01_SUBJECT sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT01_SUBJECT )
      {
         bcTBT01_SUBJECT = sdt ;
         if ( GXutil.strcmp(bcTBT01_SUBJECT.getgxTv_SdtTBT01_SUBJECT_Mode(), "") == 0 )
         {
            bcTBT01_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow23( bcTBT01_SUBJECT) ;
         }
         else
         {
            RowToVars23( bcTBT01_SUBJECT, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT01_SUBJECT.getgxTv_SdtTBT01_SUBJECT_Mode(), "") == 0 )
         {
            bcTBT01_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars23( bcTBT01_SUBJECT, 1) ;
   }

   public SdtTBT01_SUBJECT getTBT01_SUBJECT_BC( )
   {
      return bcTBT01_SUBJECT ;
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
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z442TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A442TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z443TBT01_CRT_USER_ID = "" ;
      A443TBT01_CRT_USER_ID = "" ;
      Z445TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A445TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z446TBT01_UPD_USER_ID = "" ;
      A446TBT01_UPD_USER_ID = "" ;
      Z647TBT01_OUTER_SUBJECT_ID = "" ;
      A647TBT01_OUTER_SUBJECT_ID = "" ;
      Z698TBT01_SITE_ID = "" ;
      A698TBT01_SITE_ID = "" ;
      Z441TBT01_DEL_FLG = "" ;
      A441TBT01_DEL_FLG = "" ;
      Z444TBT01_CRT_PROG_NM = "" ;
      A444TBT01_CRT_PROG_NM = "" ;
      Z447TBT01_UPD_PROG_NM = "" ;
      A447TBT01_UPD_PROG_NM = "" ;
      BC000O4_A87TBT01_STUDY_ID = new long[1] ;
      BC000O4_A88TBT01_SUBJECT_ID = new int[1] ;
      BC000O4_A442TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000O4_n442TBT01_CRT_DATETIME = new boolean[] {false} ;
      BC000O4_A443TBT01_CRT_USER_ID = new String[] {""} ;
      BC000O4_n443TBT01_CRT_USER_ID = new boolean[] {false} ;
      BC000O4_A445TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000O4_n445TBT01_UPD_DATETIME = new boolean[] {false} ;
      BC000O4_A446TBT01_UPD_USER_ID = new String[] {""} ;
      BC000O4_n446TBT01_UPD_USER_ID = new boolean[] {false} ;
      BC000O4_A448TBT01_UPD_CNT = new long[1] ;
      BC000O4_n448TBT01_UPD_CNT = new boolean[] {false} ;
      BC000O4_A647TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      BC000O4_n647TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC000O4_A698TBT01_SITE_ID = new String[] {""} ;
      BC000O4_n698TBT01_SITE_ID = new boolean[] {false} ;
      BC000O4_A441TBT01_DEL_FLG = new String[] {""} ;
      BC000O4_n441TBT01_DEL_FLG = new boolean[] {false} ;
      BC000O4_A444TBT01_CRT_PROG_NM = new String[] {""} ;
      BC000O4_n444TBT01_CRT_PROG_NM = new boolean[] {false} ;
      BC000O4_A447TBT01_UPD_PROG_NM = new String[] {""} ;
      BC000O4_n447TBT01_UPD_PROG_NM = new boolean[] {false} ;
      BC000O5_A87TBT01_STUDY_ID = new long[1] ;
      BC000O5_A88TBT01_SUBJECT_ID = new int[1] ;
      BC000O3_A87TBT01_STUDY_ID = new long[1] ;
      BC000O3_A88TBT01_SUBJECT_ID = new int[1] ;
      BC000O3_A442TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000O3_n442TBT01_CRT_DATETIME = new boolean[] {false} ;
      BC000O3_A443TBT01_CRT_USER_ID = new String[] {""} ;
      BC000O3_n443TBT01_CRT_USER_ID = new boolean[] {false} ;
      BC000O3_A445TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000O3_n445TBT01_UPD_DATETIME = new boolean[] {false} ;
      BC000O3_A446TBT01_UPD_USER_ID = new String[] {""} ;
      BC000O3_n446TBT01_UPD_USER_ID = new boolean[] {false} ;
      BC000O3_A448TBT01_UPD_CNT = new long[1] ;
      BC000O3_n448TBT01_UPD_CNT = new boolean[] {false} ;
      BC000O3_A647TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      BC000O3_n647TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC000O3_A698TBT01_SITE_ID = new String[] {""} ;
      BC000O3_n698TBT01_SITE_ID = new boolean[] {false} ;
      BC000O3_A441TBT01_DEL_FLG = new String[] {""} ;
      BC000O3_n441TBT01_DEL_FLG = new boolean[] {false} ;
      BC000O3_A444TBT01_CRT_PROG_NM = new String[] {""} ;
      BC000O3_n444TBT01_CRT_PROG_NM = new boolean[] {false} ;
      BC000O3_A447TBT01_UPD_PROG_NM = new String[] {""} ;
      BC000O3_n447TBT01_UPD_PROG_NM = new boolean[] {false} ;
      sMode23 = "" ;
      BC000O2_A87TBT01_STUDY_ID = new long[1] ;
      BC000O2_A88TBT01_SUBJECT_ID = new int[1] ;
      BC000O2_A442TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000O2_n442TBT01_CRT_DATETIME = new boolean[] {false} ;
      BC000O2_A443TBT01_CRT_USER_ID = new String[] {""} ;
      BC000O2_n443TBT01_CRT_USER_ID = new boolean[] {false} ;
      BC000O2_A445TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000O2_n445TBT01_UPD_DATETIME = new boolean[] {false} ;
      BC000O2_A446TBT01_UPD_USER_ID = new String[] {""} ;
      BC000O2_n446TBT01_UPD_USER_ID = new boolean[] {false} ;
      BC000O2_A448TBT01_UPD_CNT = new long[1] ;
      BC000O2_n448TBT01_UPD_CNT = new boolean[] {false} ;
      BC000O2_A647TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      BC000O2_n647TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC000O2_A698TBT01_SITE_ID = new String[] {""} ;
      BC000O2_n698TBT01_SITE_ID = new boolean[] {false} ;
      BC000O2_A441TBT01_DEL_FLG = new String[] {""} ;
      BC000O2_n441TBT01_DEL_FLG = new boolean[] {false} ;
      BC000O2_A444TBT01_CRT_PROG_NM = new String[] {""} ;
      BC000O2_n444TBT01_CRT_PROG_NM = new boolean[] {false} ;
      BC000O2_A447TBT01_UPD_PROG_NM = new String[] {""} ;
      BC000O2_n447TBT01_UPD_PROG_NM = new boolean[] {false} ;
      BC000O9_A140TBT14_STUDY_ID = new long[1] ;
      BC000O9_A142TBT14_SUBJECT_ID = new int[1] ;
      BC000O9_A198TBT14_MEMO_NO = new short[1] ;
      BC000O10_A89TBT02_STUDY_ID = new long[1] ;
      BC000O10_A90TBT02_SUBJECT_ID = new int[1] ;
      BC000O10_A91TBT02_CRF_ID = new short[1] ;
      BC000O10_A935TBT02_CRF_EDA_NO = new byte[1] ;
      BC000O11_A87TBT01_STUDY_ID = new long[1] ;
      BC000O11_A88TBT01_SUBJECT_ID = new int[1] ;
      BC000O11_A442TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000O11_n442TBT01_CRT_DATETIME = new boolean[] {false} ;
      BC000O11_A443TBT01_CRT_USER_ID = new String[] {""} ;
      BC000O11_n443TBT01_CRT_USER_ID = new boolean[] {false} ;
      BC000O11_A445TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000O11_n445TBT01_UPD_DATETIME = new boolean[] {false} ;
      BC000O11_A446TBT01_UPD_USER_ID = new String[] {""} ;
      BC000O11_n446TBT01_UPD_USER_ID = new boolean[] {false} ;
      BC000O11_A448TBT01_UPD_CNT = new long[1] ;
      BC000O11_n448TBT01_UPD_CNT = new boolean[] {false} ;
      BC000O11_A647TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      BC000O11_n647TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC000O11_A698TBT01_SITE_ID = new String[] {""} ;
      BC000O11_n698TBT01_SITE_ID = new boolean[] {false} ;
      BC000O11_A441TBT01_DEL_FLG = new String[] {""} ;
      BC000O11_n441TBT01_DEL_FLG = new boolean[] {false} ;
      BC000O11_A444TBT01_CRT_PROG_NM = new String[] {""} ;
      BC000O11_n444TBT01_CRT_PROG_NM = new boolean[] {false} ;
      BC000O11_A447TBT01_UPD_PROG_NM = new String[] {""} ;
      BC000O11_n447TBT01_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt01_subject_bc__default(),
         new Object[] {
             new Object[] {
            BC000O2_A87TBT01_STUDY_ID, BC000O2_A88TBT01_SUBJECT_ID, BC000O2_A442TBT01_CRT_DATETIME, BC000O2_n442TBT01_CRT_DATETIME, BC000O2_A443TBT01_CRT_USER_ID, BC000O2_n443TBT01_CRT_USER_ID, BC000O2_A445TBT01_UPD_DATETIME, BC000O2_n445TBT01_UPD_DATETIME, BC000O2_A446TBT01_UPD_USER_ID, BC000O2_n446TBT01_UPD_USER_ID,
            BC000O2_A448TBT01_UPD_CNT, BC000O2_n448TBT01_UPD_CNT, BC000O2_A647TBT01_OUTER_SUBJECT_ID, BC000O2_n647TBT01_OUTER_SUBJECT_ID, BC000O2_A698TBT01_SITE_ID, BC000O2_n698TBT01_SITE_ID, BC000O2_A441TBT01_DEL_FLG, BC000O2_n441TBT01_DEL_FLG, BC000O2_A444TBT01_CRT_PROG_NM, BC000O2_n444TBT01_CRT_PROG_NM,
            BC000O2_A447TBT01_UPD_PROG_NM, BC000O2_n447TBT01_UPD_PROG_NM
            }
            , new Object[] {
            BC000O3_A87TBT01_STUDY_ID, BC000O3_A88TBT01_SUBJECT_ID, BC000O3_A442TBT01_CRT_DATETIME, BC000O3_n442TBT01_CRT_DATETIME, BC000O3_A443TBT01_CRT_USER_ID, BC000O3_n443TBT01_CRT_USER_ID, BC000O3_A445TBT01_UPD_DATETIME, BC000O3_n445TBT01_UPD_DATETIME, BC000O3_A446TBT01_UPD_USER_ID, BC000O3_n446TBT01_UPD_USER_ID,
            BC000O3_A448TBT01_UPD_CNT, BC000O3_n448TBT01_UPD_CNT, BC000O3_A647TBT01_OUTER_SUBJECT_ID, BC000O3_n647TBT01_OUTER_SUBJECT_ID, BC000O3_A698TBT01_SITE_ID, BC000O3_n698TBT01_SITE_ID, BC000O3_A441TBT01_DEL_FLG, BC000O3_n441TBT01_DEL_FLG, BC000O3_A444TBT01_CRT_PROG_NM, BC000O3_n444TBT01_CRT_PROG_NM,
            BC000O3_A447TBT01_UPD_PROG_NM, BC000O3_n447TBT01_UPD_PROG_NM
            }
            , new Object[] {
            BC000O4_A87TBT01_STUDY_ID, BC000O4_A88TBT01_SUBJECT_ID, BC000O4_A442TBT01_CRT_DATETIME, BC000O4_n442TBT01_CRT_DATETIME, BC000O4_A443TBT01_CRT_USER_ID, BC000O4_n443TBT01_CRT_USER_ID, BC000O4_A445TBT01_UPD_DATETIME, BC000O4_n445TBT01_UPD_DATETIME, BC000O4_A446TBT01_UPD_USER_ID, BC000O4_n446TBT01_UPD_USER_ID,
            BC000O4_A448TBT01_UPD_CNT, BC000O4_n448TBT01_UPD_CNT, BC000O4_A647TBT01_OUTER_SUBJECT_ID, BC000O4_n647TBT01_OUTER_SUBJECT_ID, BC000O4_A698TBT01_SITE_ID, BC000O4_n698TBT01_SITE_ID, BC000O4_A441TBT01_DEL_FLG, BC000O4_n441TBT01_DEL_FLG, BC000O4_A444TBT01_CRT_PROG_NM, BC000O4_n444TBT01_CRT_PROG_NM,
            BC000O4_A447TBT01_UPD_PROG_NM, BC000O4_n447TBT01_UPD_PROG_NM
            }
            , new Object[] {
            BC000O5_A87TBT01_STUDY_ID, BC000O5_A88TBT01_SUBJECT_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000O9_A140TBT14_STUDY_ID, BC000O9_A142TBT14_SUBJECT_ID, BC000O9_A198TBT14_MEMO_NO
            }
            , new Object[] {
            BC000O10_A89TBT02_STUDY_ID, BC000O10_A90TBT02_SUBJECT_ID, BC000O10_A91TBT02_CRF_ID, BC000O10_A935TBT02_CRF_EDA_NO
            }
            , new Object[] {
            BC000O11_A87TBT01_STUDY_ID, BC000O11_A88TBT01_SUBJECT_ID, BC000O11_A442TBT01_CRT_DATETIME, BC000O11_n442TBT01_CRT_DATETIME, BC000O11_A443TBT01_CRT_USER_ID, BC000O11_n443TBT01_CRT_USER_ID, BC000O11_A445TBT01_UPD_DATETIME, BC000O11_n445TBT01_UPD_DATETIME, BC000O11_A446TBT01_UPD_USER_ID, BC000O11_n446TBT01_UPD_USER_ID,
            BC000O11_A448TBT01_UPD_CNT, BC000O11_n448TBT01_UPD_CNT, BC000O11_A647TBT01_OUTER_SUBJECT_ID, BC000O11_n647TBT01_OUTER_SUBJECT_ID, BC000O11_A698TBT01_SITE_ID, BC000O11_n698TBT01_SITE_ID, BC000O11_A441TBT01_DEL_FLG, BC000O11_n441TBT01_DEL_FLG, BC000O11_A444TBT01_CRT_PROG_NM, BC000O11_n444TBT01_CRT_PROG_NM,
            BC000O11_A447TBT01_UPD_PROG_NM, BC000O11_n447TBT01_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT01_SUBJECT_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110O2 */
      e110O2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound23 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z88TBT01_SUBJECT_ID ;
   private int A88TBT01_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z87TBT01_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private long Z448TBT01_UPD_CNT ;
   private long A448TBT01_UPD_CNT ;
   private long O448TBT01_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode23 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date Z442TBT01_CRT_DATETIME ;
   private java.util.Date A442TBT01_CRT_DATETIME ;
   private java.util.Date Z445TBT01_UPD_DATETIME ;
   private java.util.Date A445TBT01_UPD_DATETIME ;
   private boolean n442TBT01_CRT_DATETIME ;
   private boolean n443TBT01_CRT_USER_ID ;
   private boolean n445TBT01_UPD_DATETIME ;
   private boolean n446TBT01_UPD_USER_ID ;
   private boolean n448TBT01_UPD_CNT ;
   private boolean n647TBT01_OUTER_SUBJECT_ID ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n441TBT01_DEL_FLG ;
   private boolean n444TBT01_CRT_PROG_NM ;
   private boolean n447TBT01_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String Z443TBT01_CRT_USER_ID ;
   private String A443TBT01_CRT_USER_ID ;
   private String Z446TBT01_UPD_USER_ID ;
   private String A446TBT01_UPD_USER_ID ;
   private String Z647TBT01_OUTER_SUBJECT_ID ;
   private String A647TBT01_OUTER_SUBJECT_ID ;
   private String Z698TBT01_SITE_ID ;
   private String A698TBT01_SITE_ID ;
   private String Z441TBT01_DEL_FLG ;
   private String A441TBT01_DEL_FLG ;
   private String Z444TBT01_CRT_PROG_NM ;
   private String A444TBT01_CRT_PROG_NM ;
   private String Z447TBT01_UPD_PROG_NM ;
   private String A447TBT01_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT01_SUBJECT bcTBT01_SUBJECT ;
   private IDataStoreProvider pr_default ;
   private long[] BC000O4_A87TBT01_STUDY_ID ;
   private int[] BC000O4_A88TBT01_SUBJECT_ID ;
   private java.util.Date[] BC000O4_A442TBT01_CRT_DATETIME ;
   private boolean[] BC000O4_n442TBT01_CRT_DATETIME ;
   private String[] BC000O4_A443TBT01_CRT_USER_ID ;
   private boolean[] BC000O4_n443TBT01_CRT_USER_ID ;
   private java.util.Date[] BC000O4_A445TBT01_UPD_DATETIME ;
   private boolean[] BC000O4_n445TBT01_UPD_DATETIME ;
   private String[] BC000O4_A446TBT01_UPD_USER_ID ;
   private boolean[] BC000O4_n446TBT01_UPD_USER_ID ;
   private long[] BC000O4_A448TBT01_UPD_CNT ;
   private boolean[] BC000O4_n448TBT01_UPD_CNT ;
   private String[] BC000O4_A647TBT01_OUTER_SUBJECT_ID ;
   private boolean[] BC000O4_n647TBT01_OUTER_SUBJECT_ID ;
   private String[] BC000O4_A698TBT01_SITE_ID ;
   private boolean[] BC000O4_n698TBT01_SITE_ID ;
   private String[] BC000O4_A441TBT01_DEL_FLG ;
   private boolean[] BC000O4_n441TBT01_DEL_FLG ;
   private String[] BC000O4_A444TBT01_CRT_PROG_NM ;
   private boolean[] BC000O4_n444TBT01_CRT_PROG_NM ;
   private String[] BC000O4_A447TBT01_UPD_PROG_NM ;
   private boolean[] BC000O4_n447TBT01_UPD_PROG_NM ;
   private long[] BC000O5_A87TBT01_STUDY_ID ;
   private int[] BC000O5_A88TBT01_SUBJECT_ID ;
   private long[] BC000O3_A87TBT01_STUDY_ID ;
   private int[] BC000O3_A88TBT01_SUBJECT_ID ;
   private java.util.Date[] BC000O3_A442TBT01_CRT_DATETIME ;
   private boolean[] BC000O3_n442TBT01_CRT_DATETIME ;
   private String[] BC000O3_A443TBT01_CRT_USER_ID ;
   private boolean[] BC000O3_n443TBT01_CRT_USER_ID ;
   private java.util.Date[] BC000O3_A445TBT01_UPD_DATETIME ;
   private boolean[] BC000O3_n445TBT01_UPD_DATETIME ;
   private String[] BC000O3_A446TBT01_UPD_USER_ID ;
   private boolean[] BC000O3_n446TBT01_UPD_USER_ID ;
   private long[] BC000O3_A448TBT01_UPD_CNT ;
   private boolean[] BC000O3_n448TBT01_UPD_CNT ;
   private String[] BC000O3_A647TBT01_OUTER_SUBJECT_ID ;
   private boolean[] BC000O3_n647TBT01_OUTER_SUBJECT_ID ;
   private String[] BC000O3_A698TBT01_SITE_ID ;
   private boolean[] BC000O3_n698TBT01_SITE_ID ;
   private String[] BC000O3_A441TBT01_DEL_FLG ;
   private boolean[] BC000O3_n441TBT01_DEL_FLG ;
   private String[] BC000O3_A444TBT01_CRT_PROG_NM ;
   private boolean[] BC000O3_n444TBT01_CRT_PROG_NM ;
   private String[] BC000O3_A447TBT01_UPD_PROG_NM ;
   private boolean[] BC000O3_n447TBT01_UPD_PROG_NM ;
   private long[] BC000O2_A87TBT01_STUDY_ID ;
   private int[] BC000O2_A88TBT01_SUBJECT_ID ;
   private java.util.Date[] BC000O2_A442TBT01_CRT_DATETIME ;
   private boolean[] BC000O2_n442TBT01_CRT_DATETIME ;
   private String[] BC000O2_A443TBT01_CRT_USER_ID ;
   private boolean[] BC000O2_n443TBT01_CRT_USER_ID ;
   private java.util.Date[] BC000O2_A445TBT01_UPD_DATETIME ;
   private boolean[] BC000O2_n445TBT01_UPD_DATETIME ;
   private String[] BC000O2_A446TBT01_UPD_USER_ID ;
   private boolean[] BC000O2_n446TBT01_UPD_USER_ID ;
   private long[] BC000O2_A448TBT01_UPD_CNT ;
   private boolean[] BC000O2_n448TBT01_UPD_CNT ;
   private String[] BC000O2_A647TBT01_OUTER_SUBJECT_ID ;
   private boolean[] BC000O2_n647TBT01_OUTER_SUBJECT_ID ;
   private String[] BC000O2_A698TBT01_SITE_ID ;
   private boolean[] BC000O2_n698TBT01_SITE_ID ;
   private String[] BC000O2_A441TBT01_DEL_FLG ;
   private boolean[] BC000O2_n441TBT01_DEL_FLG ;
   private String[] BC000O2_A444TBT01_CRT_PROG_NM ;
   private boolean[] BC000O2_n444TBT01_CRT_PROG_NM ;
   private String[] BC000O2_A447TBT01_UPD_PROG_NM ;
   private boolean[] BC000O2_n447TBT01_UPD_PROG_NM ;
   private long[] BC000O9_A140TBT14_STUDY_ID ;
   private int[] BC000O9_A142TBT14_SUBJECT_ID ;
   private short[] BC000O9_A198TBT14_MEMO_NO ;
   private long[] BC000O10_A89TBT02_STUDY_ID ;
   private int[] BC000O10_A90TBT02_SUBJECT_ID ;
   private short[] BC000O10_A91TBT02_CRF_ID ;
   private byte[] BC000O10_A935TBT02_CRF_EDA_NO ;
   private long[] BC000O11_A87TBT01_STUDY_ID ;
   private int[] BC000O11_A88TBT01_SUBJECT_ID ;
   private java.util.Date[] BC000O11_A442TBT01_CRT_DATETIME ;
   private boolean[] BC000O11_n442TBT01_CRT_DATETIME ;
   private String[] BC000O11_A443TBT01_CRT_USER_ID ;
   private boolean[] BC000O11_n443TBT01_CRT_USER_ID ;
   private java.util.Date[] BC000O11_A445TBT01_UPD_DATETIME ;
   private boolean[] BC000O11_n445TBT01_UPD_DATETIME ;
   private String[] BC000O11_A446TBT01_UPD_USER_ID ;
   private boolean[] BC000O11_n446TBT01_UPD_USER_ID ;
   private long[] BC000O11_A448TBT01_UPD_CNT ;
   private boolean[] BC000O11_n448TBT01_UPD_CNT ;
   private String[] BC000O11_A647TBT01_OUTER_SUBJECT_ID ;
   private boolean[] BC000O11_n647TBT01_OUTER_SUBJECT_ID ;
   private String[] BC000O11_A698TBT01_SITE_ID ;
   private boolean[] BC000O11_n698TBT01_SITE_ID ;
   private String[] BC000O11_A441TBT01_DEL_FLG ;
   private boolean[] BC000O11_n441TBT01_DEL_FLG ;
   private String[] BC000O11_A444TBT01_CRT_PROG_NM ;
   private boolean[] BC000O11_n444TBT01_CRT_PROG_NM ;
   private String[] BC000O11_A447TBT01_UPD_PROG_NM ;
   private boolean[] BC000O11_n447TBT01_UPD_PROG_NM ;
}

final  class tbt01_subject_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000O2", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_CNT`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_PROG_NM` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000O3", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_CNT`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_PROG_NM` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000O4", "SELECT TM1.`TBT01_STUDY_ID`, TM1.`TBT01_SUBJECT_ID`, TM1.`TBT01_CRT_DATETIME`, TM1.`TBT01_CRT_USER_ID`, TM1.`TBT01_UPD_DATETIME`, TM1.`TBT01_UPD_USER_ID`, TM1.`TBT01_UPD_CNT`, TM1.`TBT01_OUTER_SUBJECT_ID`, TM1.`TBT01_SITE_ID`, TM1.`TBT01_DEL_FLG`, TM1.`TBT01_CRT_PROG_NM`, TM1.`TBT01_UPD_PROG_NM` FROM `TBT01_SUBJECT` TM1 WHERE TM1.`TBT01_STUDY_ID` = ? and TM1.`TBT01_SUBJECT_ID` = ? ORDER BY TM1.`TBT01_STUDY_ID`, TM1.`TBT01_SUBJECT_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000O5", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000O6", "INSERT INTO `TBT01_SUBJECT`(`TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_CNT`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000O7", "UPDATE `TBT01_SUBJECT` SET `TBT01_CRT_DATETIME`=?, `TBT01_CRT_USER_ID`=?, `TBT01_UPD_DATETIME`=?, `TBT01_UPD_USER_ID`=?, `TBT01_UPD_CNT`=?, `TBT01_OUTER_SUBJECT_ID`=?, `TBT01_SITE_ID`=?, `TBT01_DEL_FLG`=?, `TBT01_CRT_PROG_NM`=?, `TBT01_UPD_PROG_NM`=?  WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000O8", "DELETE FROM `TBT01_SUBJECT`  WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000O9", "SELECT `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000O10", "SELECT `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000O11", "SELECT TM1.`TBT01_STUDY_ID`, TM1.`TBT01_SUBJECT_ID`, TM1.`TBT01_CRT_DATETIME`, TM1.`TBT01_CRT_USER_ID`, TM1.`TBT01_UPD_DATETIME`, TM1.`TBT01_UPD_USER_ID`, TM1.`TBT01_UPD_CNT`, TM1.`TBT01_OUTER_SUBJECT_ID`, TM1.`TBT01_SITE_ID`, TM1.`TBT01_DEL_FLG`, TM1.`TBT01_CRT_PROG_NM`, TM1.`TBT01_UPD_PROG_NM` FROM `TBT01_SUBJECT` TM1 WHERE TM1.`TBT01_STUDY_ID` = ? and TM1.`TBT01_SUBJECT_ID` = ? ORDER BY TM1.`TBT01_STUDY_ID`, TM1.`TBT01_SUBJECT_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[11]).longValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 6);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[21], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 20);
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
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

