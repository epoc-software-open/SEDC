/*
               File: tbm41_crf_ncm_map_bc
        Description: CRF-NetCommonsマッピングマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:8.94
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm41_crf_ncm_map_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm41_crf_ncm_map_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm41_crf_ncm_map_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm41_crf_ncm_map_bc.class ));
   }

   public tbm41_crf_ncm_map_bc( int remoteHandle ,
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
         /* Execute user event: e120M2 */
         e120M2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z259TBM41_STUDY_ID = A259TBM41_STUDY_ID ;
            Z260TBM41_CRF_ID = A260TBM41_CRF_ID ;
            Z378TBM41_CRF_ITEM_GRP_DIV = A378TBM41_CRF_ITEM_GRP_DIV ;
            Z261TBM41_CRF_ITEM_GRP_CD = A261TBM41_CRF_ITEM_GRP_CD ;
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

   public void confirm_0M0( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0M21( ) ;
         }
         else
         {
            checkExtendedTable0M21( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0M21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110M2( )
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

   public void e120M2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A260TBM41_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A378TBM41_CRF_ITEM_GRP_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A261TBM41_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A262TBM41_NCM_METADATA_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A263TBM41_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A264TBM41_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm41_crf_ncm_map_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A265TBM41_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A266TBM41_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A267TBM41_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm41_crf_ncm_map_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A268TBM41_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A269TBM41_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0M21( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z264TBM41_CRT_DATETIME = A264TBM41_CRT_DATETIME ;
         Z265TBM41_CRT_USER_ID = A265TBM41_CRT_USER_ID ;
         Z267TBM41_UPD_DATETIME = A267TBM41_UPD_DATETIME ;
         Z268TBM41_UPD_USER_ID = A268TBM41_UPD_USER_ID ;
         Z270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
         Z262TBM41_NCM_METADATA_ID = A262TBM41_NCM_METADATA_ID ;
         Z263TBM41_DEL_FLG = A263TBM41_DEL_FLG ;
         Z266TBM41_CRT_PROG_NM = A266TBM41_CRT_PROG_NM ;
         Z269TBM41_UPD_PROG_NM = A269TBM41_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z259TBM41_STUDY_ID = A259TBM41_STUDY_ID ;
         Z260TBM41_CRF_ID = A260TBM41_CRF_ID ;
         Z378TBM41_CRF_ITEM_GRP_DIV = A378TBM41_CRF_ITEM_GRP_DIV ;
         Z261TBM41_CRF_ITEM_GRP_CD = A261TBM41_CRF_ITEM_GRP_CD ;
         Z264TBM41_CRT_DATETIME = A264TBM41_CRT_DATETIME ;
         Z265TBM41_CRT_USER_ID = A265TBM41_CRT_USER_ID ;
         Z267TBM41_UPD_DATETIME = A267TBM41_UPD_DATETIME ;
         Z268TBM41_UPD_USER_ID = A268TBM41_UPD_USER_ID ;
         Z270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
         Z262TBM41_NCM_METADATA_ID = A262TBM41_NCM_METADATA_ID ;
         Z263TBM41_DEL_FLG = A263TBM41_DEL_FLG ;
         Z266TBM41_CRT_PROG_NM = A266TBM41_CRT_PROG_NM ;
         Z269TBM41_UPD_PROG_NM = A269TBM41_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0M21( )
   {
      /* Using cursor BC000M4 */
      pr_default.execute(2, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A264TBM41_CRT_DATETIME = BC000M4_A264TBM41_CRT_DATETIME[0] ;
         n264TBM41_CRT_DATETIME = BC000M4_n264TBM41_CRT_DATETIME[0] ;
         A265TBM41_CRT_USER_ID = BC000M4_A265TBM41_CRT_USER_ID[0] ;
         n265TBM41_CRT_USER_ID = BC000M4_n265TBM41_CRT_USER_ID[0] ;
         A267TBM41_UPD_DATETIME = BC000M4_A267TBM41_UPD_DATETIME[0] ;
         n267TBM41_UPD_DATETIME = BC000M4_n267TBM41_UPD_DATETIME[0] ;
         A268TBM41_UPD_USER_ID = BC000M4_A268TBM41_UPD_USER_ID[0] ;
         n268TBM41_UPD_USER_ID = BC000M4_n268TBM41_UPD_USER_ID[0] ;
         A270TBM41_UPD_CNT = BC000M4_A270TBM41_UPD_CNT[0] ;
         n270TBM41_UPD_CNT = BC000M4_n270TBM41_UPD_CNT[0] ;
         A262TBM41_NCM_METADATA_ID = BC000M4_A262TBM41_NCM_METADATA_ID[0] ;
         n262TBM41_NCM_METADATA_ID = BC000M4_n262TBM41_NCM_METADATA_ID[0] ;
         A263TBM41_DEL_FLG = BC000M4_A263TBM41_DEL_FLG[0] ;
         n263TBM41_DEL_FLG = BC000M4_n263TBM41_DEL_FLG[0] ;
         A266TBM41_CRT_PROG_NM = BC000M4_A266TBM41_CRT_PROG_NM[0] ;
         n266TBM41_CRT_PROG_NM = BC000M4_n266TBM41_CRT_PROG_NM[0] ;
         A269TBM41_UPD_PROG_NM = BC000M4_A269TBM41_UPD_PROG_NM[0] ;
         n269TBM41_UPD_PROG_NM = BC000M4_n269TBM41_UPD_PROG_NM[0] ;
         zm0M21( -8) ;
      }
      pr_default.close(2);
      onLoadActions0M21( ) ;
   }

   public void onLoadActions0M21( )
   {
      AV9Pgmname = "TBM41_CRF_NCM_MAP_BC" ;
   }

   public void checkExtendedTable0M21( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM41_CRF_NCM_MAP_BC" ;
      if ( ! ( GXutil.nullDate().equals(A264TBM41_CRT_DATETIME) || (( A264TBM41_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A264TBM41_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A267TBM41_UPD_DATETIME) || (( A267TBM41_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A267TBM41_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0M21( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0M21( )
   {
      /* Using cursor BC000M5 */
      pr_default.execute(3, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000M3 */
      pr_default.execute(1, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0M21( 8) ;
         RcdFound21 = (short)(1) ;
         A259TBM41_STUDY_ID = BC000M3_A259TBM41_STUDY_ID[0] ;
         A260TBM41_CRF_ID = BC000M3_A260TBM41_CRF_ID[0] ;
         A378TBM41_CRF_ITEM_GRP_DIV = BC000M3_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         A261TBM41_CRF_ITEM_GRP_CD = BC000M3_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         A264TBM41_CRT_DATETIME = BC000M3_A264TBM41_CRT_DATETIME[0] ;
         n264TBM41_CRT_DATETIME = BC000M3_n264TBM41_CRT_DATETIME[0] ;
         A265TBM41_CRT_USER_ID = BC000M3_A265TBM41_CRT_USER_ID[0] ;
         n265TBM41_CRT_USER_ID = BC000M3_n265TBM41_CRT_USER_ID[0] ;
         A267TBM41_UPD_DATETIME = BC000M3_A267TBM41_UPD_DATETIME[0] ;
         n267TBM41_UPD_DATETIME = BC000M3_n267TBM41_UPD_DATETIME[0] ;
         A268TBM41_UPD_USER_ID = BC000M3_A268TBM41_UPD_USER_ID[0] ;
         n268TBM41_UPD_USER_ID = BC000M3_n268TBM41_UPD_USER_ID[0] ;
         A270TBM41_UPD_CNT = BC000M3_A270TBM41_UPD_CNT[0] ;
         n270TBM41_UPD_CNT = BC000M3_n270TBM41_UPD_CNT[0] ;
         A262TBM41_NCM_METADATA_ID = BC000M3_A262TBM41_NCM_METADATA_ID[0] ;
         n262TBM41_NCM_METADATA_ID = BC000M3_n262TBM41_NCM_METADATA_ID[0] ;
         A263TBM41_DEL_FLG = BC000M3_A263TBM41_DEL_FLG[0] ;
         n263TBM41_DEL_FLG = BC000M3_n263TBM41_DEL_FLG[0] ;
         A266TBM41_CRT_PROG_NM = BC000M3_A266TBM41_CRT_PROG_NM[0] ;
         n266TBM41_CRT_PROG_NM = BC000M3_n266TBM41_CRT_PROG_NM[0] ;
         A269TBM41_UPD_PROG_NM = BC000M3_A269TBM41_UPD_PROG_NM[0] ;
         n269TBM41_UPD_PROG_NM = BC000M3_n269TBM41_UPD_PROG_NM[0] ;
         O270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
         n270TBM41_UPD_CNT = false ;
         Z259TBM41_STUDY_ID = A259TBM41_STUDY_ID ;
         Z260TBM41_CRF_ID = A260TBM41_CRF_ID ;
         Z378TBM41_CRF_ITEM_GRP_DIV = A378TBM41_CRF_ITEM_GRP_DIV ;
         Z261TBM41_CRF_ITEM_GRP_CD = A261TBM41_CRF_ITEM_GRP_CD ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0M21( ) ;
         Gx_mode = sMode21 ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey0M21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0M21( ) ;
      if ( RcdFound21 == 0 )
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
      confirm_0M0( ) ;
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

   public void checkOptimisticConcurrency0M21( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000M2 */
         pr_default.execute(0, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM41_CRF_NCM_MAP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z264TBM41_CRT_DATETIME.equals( BC000M2_A264TBM41_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z265TBM41_CRT_USER_ID, BC000M2_A265TBM41_CRT_USER_ID[0]) != 0 ) || !( Z267TBM41_UPD_DATETIME.equals( BC000M2_A267TBM41_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z268TBM41_UPD_USER_ID, BC000M2_A268TBM41_UPD_USER_ID[0]) != 0 ) || ( Z270TBM41_UPD_CNT != BC000M2_A270TBM41_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z262TBM41_NCM_METADATA_ID, BC000M2_A262TBM41_NCM_METADATA_ID[0]) != 0 ) || ( GXutil.strcmp(Z263TBM41_DEL_FLG, BC000M2_A263TBM41_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z266TBM41_CRT_PROG_NM, BC000M2_A266TBM41_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z269TBM41_UPD_PROG_NM, BC000M2_A269TBM41_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM41_CRF_NCM_MAP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0M21( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0M21( 0) ;
         checkOptimisticConcurrency0M21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0M21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000M6 */
                  pr_default.execute(4, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD, new Boolean(n264TBM41_CRT_DATETIME), A264TBM41_CRT_DATETIME, new Boolean(n265TBM41_CRT_USER_ID), A265TBM41_CRT_USER_ID, new Boolean(n267TBM41_UPD_DATETIME), A267TBM41_UPD_DATETIME, new Boolean(n268TBM41_UPD_USER_ID), A268TBM41_UPD_USER_ID, new Boolean(n270TBM41_UPD_CNT), new Long(A270TBM41_UPD_CNT), new Boolean(n262TBM41_NCM_METADATA_ID), A262TBM41_NCM_METADATA_ID, new Boolean(n263TBM41_DEL_FLG), A263TBM41_DEL_FLG, new Boolean(n266TBM41_CRT_PROG_NM), A266TBM41_CRT_PROG_NM, new Boolean(n269TBM41_UPD_PROG_NM), A269TBM41_UPD_PROG_NM});
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
            load0M21( ) ;
         }
         endLevel0M21( ) ;
      }
      closeExtendedTableCursors0M21( ) ;
   }

   public void update0M21( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0M21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000M7 */
                  pr_default.execute(5, new Object[] {new Boolean(n264TBM41_CRT_DATETIME), A264TBM41_CRT_DATETIME, new Boolean(n265TBM41_CRT_USER_ID), A265TBM41_CRT_USER_ID, new Boolean(n267TBM41_UPD_DATETIME), A267TBM41_UPD_DATETIME, new Boolean(n268TBM41_UPD_USER_ID), A268TBM41_UPD_USER_ID, new Boolean(n270TBM41_UPD_CNT), new Long(A270TBM41_UPD_CNT), new Boolean(n262TBM41_NCM_METADATA_ID), A262TBM41_NCM_METADATA_ID, new Boolean(n263TBM41_DEL_FLG), A263TBM41_DEL_FLG, new Boolean(n266TBM41_CRT_PROG_NM), A266TBM41_CRT_PROG_NM, new Boolean(n269TBM41_UPD_PROG_NM), A269TBM41_UPD_PROG_NM, new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM41_CRF_NCM_MAP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0M21( ) ;
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
         endLevel0M21( ) ;
      }
      closeExtendedTableCursors0M21( ) ;
   }

   public void deferredUpdate0M21( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0M21( ) ;
         afterConfirm0M21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0M21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000M8 */
               pr_default.execute(6, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0M21( ) ;
      Gx_mode = sMode21 ;
   }

   public void onDeleteControls0M21( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM41_CRF_NCM_MAP_BC" ;
      }
   }

   public void endLevel0M21( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0M21( ) ;
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

   public void scanKeyStart0M21( )
   {
      /* Using cursor BC000M9 */
      pr_default.execute(7, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A259TBM41_STUDY_ID = BC000M9_A259TBM41_STUDY_ID[0] ;
         A260TBM41_CRF_ID = BC000M9_A260TBM41_CRF_ID[0] ;
         A378TBM41_CRF_ITEM_GRP_DIV = BC000M9_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         A261TBM41_CRF_ITEM_GRP_CD = BC000M9_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         A264TBM41_CRT_DATETIME = BC000M9_A264TBM41_CRT_DATETIME[0] ;
         n264TBM41_CRT_DATETIME = BC000M9_n264TBM41_CRT_DATETIME[0] ;
         A265TBM41_CRT_USER_ID = BC000M9_A265TBM41_CRT_USER_ID[0] ;
         n265TBM41_CRT_USER_ID = BC000M9_n265TBM41_CRT_USER_ID[0] ;
         A267TBM41_UPD_DATETIME = BC000M9_A267TBM41_UPD_DATETIME[0] ;
         n267TBM41_UPD_DATETIME = BC000M9_n267TBM41_UPD_DATETIME[0] ;
         A268TBM41_UPD_USER_ID = BC000M9_A268TBM41_UPD_USER_ID[0] ;
         n268TBM41_UPD_USER_ID = BC000M9_n268TBM41_UPD_USER_ID[0] ;
         A270TBM41_UPD_CNT = BC000M9_A270TBM41_UPD_CNT[0] ;
         n270TBM41_UPD_CNT = BC000M9_n270TBM41_UPD_CNT[0] ;
         A262TBM41_NCM_METADATA_ID = BC000M9_A262TBM41_NCM_METADATA_ID[0] ;
         n262TBM41_NCM_METADATA_ID = BC000M9_n262TBM41_NCM_METADATA_ID[0] ;
         A263TBM41_DEL_FLG = BC000M9_A263TBM41_DEL_FLG[0] ;
         n263TBM41_DEL_FLG = BC000M9_n263TBM41_DEL_FLG[0] ;
         A266TBM41_CRT_PROG_NM = BC000M9_A266TBM41_CRT_PROG_NM[0] ;
         n266TBM41_CRT_PROG_NM = BC000M9_n266TBM41_CRT_PROG_NM[0] ;
         A269TBM41_UPD_PROG_NM = BC000M9_A269TBM41_UPD_PROG_NM[0] ;
         n269TBM41_UPD_PROG_NM = BC000M9_n269TBM41_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0M21( )
   {
      pr_default.readNext(7);
      RcdFound21 = (short)(0) ;
      scanKeyLoad0M21( ) ;
   }

   public void scanKeyLoad0M21( )
   {
      sMode21 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A259TBM41_STUDY_ID = BC000M9_A259TBM41_STUDY_ID[0] ;
         A260TBM41_CRF_ID = BC000M9_A260TBM41_CRF_ID[0] ;
         A378TBM41_CRF_ITEM_GRP_DIV = BC000M9_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         A261TBM41_CRF_ITEM_GRP_CD = BC000M9_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         A264TBM41_CRT_DATETIME = BC000M9_A264TBM41_CRT_DATETIME[0] ;
         n264TBM41_CRT_DATETIME = BC000M9_n264TBM41_CRT_DATETIME[0] ;
         A265TBM41_CRT_USER_ID = BC000M9_A265TBM41_CRT_USER_ID[0] ;
         n265TBM41_CRT_USER_ID = BC000M9_n265TBM41_CRT_USER_ID[0] ;
         A267TBM41_UPD_DATETIME = BC000M9_A267TBM41_UPD_DATETIME[0] ;
         n267TBM41_UPD_DATETIME = BC000M9_n267TBM41_UPD_DATETIME[0] ;
         A268TBM41_UPD_USER_ID = BC000M9_A268TBM41_UPD_USER_ID[0] ;
         n268TBM41_UPD_USER_ID = BC000M9_n268TBM41_UPD_USER_ID[0] ;
         A270TBM41_UPD_CNT = BC000M9_A270TBM41_UPD_CNT[0] ;
         n270TBM41_UPD_CNT = BC000M9_n270TBM41_UPD_CNT[0] ;
         A262TBM41_NCM_METADATA_ID = BC000M9_A262TBM41_NCM_METADATA_ID[0] ;
         n262TBM41_NCM_METADATA_ID = BC000M9_n262TBM41_NCM_METADATA_ID[0] ;
         A263TBM41_DEL_FLG = BC000M9_A263TBM41_DEL_FLG[0] ;
         n263TBM41_DEL_FLG = BC000M9_n263TBM41_DEL_FLG[0] ;
         A266TBM41_CRT_PROG_NM = BC000M9_A266TBM41_CRT_PROG_NM[0] ;
         n266TBM41_CRT_PROG_NM = BC000M9_n266TBM41_CRT_PROG_NM[0] ;
         A269TBM41_UPD_PROG_NM = BC000M9_A269TBM41_UPD_PROG_NM[0] ;
         n269TBM41_UPD_PROG_NM = BC000M9_n269TBM41_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode21 ;
   }

   public void scanKeyEnd0M21( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0M21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0M21( )
   {
      /* Before Insert Rules */
      A264TBM41_CRT_DATETIME = GXutil.now( ) ;
      n264TBM41_CRT_DATETIME = false ;
      GXt_char1 = A265TBM41_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm41_crf_ncm_map_bc.this.GXt_char1 = GXv_char2[0] ;
      A265TBM41_CRT_USER_ID = GXt_char1 ;
      n265TBM41_CRT_USER_ID = false ;
      A267TBM41_UPD_DATETIME = GXutil.now( ) ;
      n267TBM41_UPD_DATETIME = false ;
      GXt_char1 = A268TBM41_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm41_crf_ncm_map_bc.this.GXt_char1 = GXv_char2[0] ;
      A268TBM41_UPD_USER_ID = GXt_char1 ;
      n268TBM41_UPD_USER_ID = false ;
      A270TBM41_UPD_CNT = (long)(O270TBM41_UPD_CNT+1) ;
      n270TBM41_UPD_CNT = false ;
   }

   public void beforeUpdate0M21( )
   {
      /* Before Update Rules */
      A267TBM41_UPD_DATETIME = GXutil.now( ) ;
      n267TBM41_UPD_DATETIME = false ;
      GXt_char1 = A268TBM41_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm41_crf_ncm_map_bc.this.GXt_char1 = GXv_char2[0] ;
      A268TBM41_UPD_USER_ID = GXt_char1 ;
      n268TBM41_UPD_USER_ID = false ;
      A270TBM41_UPD_CNT = (long)(O270TBM41_UPD_CNT+1) ;
      n270TBM41_UPD_CNT = false ;
   }

   public void beforeDelete0M21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0M21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0M21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0M21( )
   {
   }

   public void addRow0M21( )
   {
      VarsToRow21( bcTBM41_CRF_NCM_MAP) ;
   }

   public void readRow0M21( )
   {
      RowToVars21( bcTBM41_CRF_NCM_MAP, 1) ;
   }

   public void initializeNonKey0M21( )
   {
      A264TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n264TBM41_CRT_DATETIME = false ;
      A265TBM41_CRT_USER_ID = "" ;
      n265TBM41_CRT_USER_ID = false ;
      A267TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n267TBM41_UPD_DATETIME = false ;
      A268TBM41_UPD_USER_ID = "" ;
      n268TBM41_UPD_USER_ID = false ;
      A270TBM41_UPD_CNT = 0 ;
      n270TBM41_UPD_CNT = false ;
      A262TBM41_NCM_METADATA_ID = "" ;
      n262TBM41_NCM_METADATA_ID = false ;
      A263TBM41_DEL_FLG = "" ;
      n263TBM41_DEL_FLG = false ;
      A266TBM41_CRT_PROG_NM = "" ;
      n266TBM41_CRT_PROG_NM = false ;
      A269TBM41_UPD_PROG_NM = "" ;
      n269TBM41_UPD_PROG_NM = false ;
      O270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
      n270TBM41_UPD_CNT = false ;
   }

   public void initAll0M21( )
   {
      A259TBM41_STUDY_ID = 0 ;
      A260TBM41_CRF_ID = (short)(0) ;
      A378TBM41_CRF_ITEM_GRP_DIV = "" ;
      A261TBM41_CRF_ITEM_GRP_CD = "" ;
      initializeNonKey0M21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow21( SdtTBM41_CRF_NCM_MAP obj21 )
   {
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Mode( Gx_mode );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime( A264TBM41_CRT_DATETIME );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id( A265TBM41_CRT_USER_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime( A267TBM41_UPD_DATETIME );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id( A268TBM41_UPD_USER_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt( A270TBM41_UPD_CNT );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id( A262TBM41_NCM_METADATA_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg( A263TBM41_DEL_FLG );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm( A266TBM41_CRT_PROG_NM );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm( A269TBM41_UPD_PROG_NM );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_study_id( A259TBM41_STUDY_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_id( A260TBM41_CRF_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_div( A378TBM41_CRF_ITEM_GRP_DIV );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_cd( A261TBM41_CRF_ITEM_GRP_CD );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_study_id_Z( Z259TBM41_STUDY_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_id_Z( Z260TBM41_CRF_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_div_Z( Z378TBM41_CRF_ITEM_GRP_DIV );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_cd_Z( Z261TBM41_CRF_ITEM_GRP_CD );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id_Z( Z262TBM41_NCM_METADATA_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg_Z( Z263TBM41_DEL_FLG );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime_Z( Z264TBM41_CRT_DATETIME );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id_Z( Z265TBM41_CRT_USER_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm_Z( Z266TBM41_CRT_PROG_NM );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime_Z( Z267TBM41_UPD_DATETIME );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id_Z( Z268TBM41_UPD_USER_ID );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm_Z( Z269TBM41_UPD_PROG_NM );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt_Z( Z270TBM41_UPD_CNT );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id_N( (byte)((byte)((n262TBM41_NCM_METADATA_ID)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg_N( (byte)((byte)((n263TBM41_DEL_FLG)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime_N( (byte)((byte)((n264TBM41_CRT_DATETIME)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id_N( (byte)((byte)((n265TBM41_CRT_USER_ID)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm_N( (byte)((byte)((n266TBM41_CRT_PROG_NM)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime_N( (byte)((byte)((n267TBM41_UPD_DATETIME)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id_N( (byte)((byte)((n268TBM41_UPD_USER_ID)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm_N( (byte)((byte)((n269TBM41_UPD_PROG_NM)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt_N( (byte)((byte)((n270TBM41_UPD_CNT)?1:0)) );
      obj21.setgxTv_SdtTBM41_CRF_NCM_MAP_Mode( Gx_mode );
   }

   public void RowToVars21( SdtTBM41_CRF_NCM_MAP obj21 ,
                            int forceLoad )
   {
      Gx_mode = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Mode() ;
      A264TBM41_CRT_DATETIME = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime() ;
      n264TBM41_CRT_DATETIME = false ;
      A265TBM41_CRT_USER_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id() ;
      n265TBM41_CRT_USER_ID = false ;
      A267TBM41_UPD_DATETIME = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime() ;
      n267TBM41_UPD_DATETIME = false ;
      A268TBM41_UPD_USER_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id() ;
      n268TBM41_UPD_USER_ID = false ;
      A270TBM41_UPD_CNT = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt() ;
      n270TBM41_UPD_CNT = false ;
      A262TBM41_NCM_METADATA_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id() ;
      n262TBM41_NCM_METADATA_ID = false ;
      A263TBM41_DEL_FLG = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg() ;
      n263TBM41_DEL_FLG = false ;
      A266TBM41_CRT_PROG_NM = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm() ;
      n266TBM41_CRT_PROG_NM = false ;
      A269TBM41_UPD_PROG_NM = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm() ;
      n269TBM41_UPD_PROG_NM = false ;
      A259TBM41_STUDY_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_study_id() ;
      A260TBM41_CRF_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_id() ;
      A378TBM41_CRF_ITEM_GRP_DIV = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_div() ;
      A261TBM41_CRF_ITEM_GRP_CD = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_cd() ;
      Z259TBM41_STUDY_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_study_id_Z() ;
      Z260TBM41_CRF_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_id_Z() ;
      Z378TBM41_CRF_ITEM_GRP_DIV = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_div_Z() ;
      Z261TBM41_CRF_ITEM_GRP_CD = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_cd_Z() ;
      Z262TBM41_NCM_METADATA_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id_Z() ;
      Z263TBM41_DEL_FLG = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg_Z() ;
      Z264TBM41_CRT_DATETIME = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime_Z() ;
      Z265TBM41_CRT_USER_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id_Z() ;
      Z266TBM41_CRT_PROG_NM = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm_Z() ;
      Z267TBM41_UPD_DATETIME = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime_Z() ;
      Z268TBM41_UPD_USER_ID = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id_Z() ;
      Z269TBM41_UPD_PROG_NM = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm_Z() ;
      Z270TBM41_UPD_CNT = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt_Z() ;
      O270TBM41_UPD_CNT = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt_Z() ;
      n262TBM41_NCM_METADATA_ID = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id_N()==0)?false:true) ;
      n263TBM41_DEL_FLG = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg_N()==0)?false:true) ;
      n264TBM41_CRT_DATETIME = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime_N()==0)?false:true) ;
      n265TBM41_CRT_USER_ID = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id_N()==0)?false:true) ;
      n266TBM41_CRT_PROG_NM = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm_N()==0)?false:true) ;
      n267TBM41_UPD_DATETIME = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime_N()==0)?false:true) ;
      n268TBM41_UPD_USER_ID = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id_N()==0)?false:true) ;
      n269TBM41_UPD_PROG_NM = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm_N()==0)?false:true) ;
      n270TBM41_UPD_CNT = (boolean)((obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj21.getgxTv_SdtTBM41_CRF_NCM_MAP_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A259TBM41_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A260TBM41_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A378TBM41_CRF_ITEM_GRP_DIV = (String)getParm(obj,2) ;
      A261TBM41_CRF_ITEM_GRP_CD = (String)getParm(obj,3) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0M21( ) ;
      scanKeyStart0M21( ) ;
      if ( RcdFound21 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z259TBM41_STUDY_ID = A259TBM41_STUDY_ID ;
         Z260TBM41_CRF_ID = A260TBM41_CRF_ID ;
         Z378TBM41_CRF_ITEM_GRP_DIV = A378TBM41_CRF_ITEM_GRP_DIV ;
         Z261TBM41_CRF_ITEM_GRP_CD = A261TBM41_CRF_ITEM_GRP_CD ;
         O270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
         n270TBM41_UPD_CNT = false ;
      }
      zm0M21( -8) ;
      sMode21 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0M21( ) ;
      Gx_mode = sMode21 ;
      addRow0M21( ) ;
      scanKeyEnd0M21( ) ;
      if ( RcdFound21 == 0 )
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
      RowToVars21( bcTBM41_CRF_NCM_MAP, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0M21( ) ;
      if ( RcdFound21 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A259TBM41_STUDY_ID != Z259TBM41_STUDY_ID ) || ( A260TBM41_CRF_ID != Z260TBM41_CRF_ID ) || ( GXutil.strcmp(A378TBM41_CRF_ITEM_GRP_DIV, Z378TBM41_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A261TBM41_CRF_ITEM_GRP_CD, Z261TBM41_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A259TBM41_STUDY_ID = Z259TBM41_STUDY_ID ;
            A260TBM41_CRF_ID = Z260TBM41_CRF_ID ;
            A378TBM41_CRF_ITEM_GRP_DIV = Z378TBM41_CRF_ITEM_GRP_DIV ;
            A261TBM41_CRF_ITEM_GRP_CD = Z261TBM41_CRF_ITEM_GRP_CD ;
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
            update0M21( ) ;
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
            if ( ( A259TBM41_STUDY_ID != Z259TBM41_STUDY_ID ) || ( A260TBM41_CRF_ID != Z260TBM41_CRF_ID ) || ( GXutil.strcmp(A378TBM41_CRF_ITEM_GRP_DIV, Z378TBM41_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A261TBM41_CRF_ITEM_GRP_CD, Z261TBM41_CRF_ITEM_GRP_CD) != 0 ) )
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
                  insert0M21( ) ;
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
                  insert0M21( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow21( bcTBM41_CRF_NCM_MAP) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars21( bcTBM41_CRF_NCM_MAP, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0M21( ) ;
      if ( RcdFound21 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A259TBM41_STUDY_ID != Z259TBM41_STUDY_ID ) || ( A260TBM41_CRF_ID != Z260TBM41_CRF_ID ) || ( GXutil.strcmp(A378TBM41_CRF_ITEM_GRP_DIV, Z378TBM41_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A261TBM41_CRF_ITEM_GRP_CD, Z261TBM41_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A259TBM41_STUDY_ID = Z259TBM41_STUDY_ID ;
            A260TBM41_CRF_ID = Z260TBM41_CRF_ID ;
            A378TBM41_CRF_ITEM_GRP_DIV = Z378TBM41_CRF_ITEM_GRP_DIV ;
            A261TBM41_CRF_ITEM_GRP_CD = Z261TBM41_CRF_ITEM_GRP_CD ;
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
         if ( ( A259TBM41_STUDY_ID != Z259TBM41_STUDY_ID ) || ( A260TBM41_CRF_ID != Z260TBM41_CRF_ID ) || ( GXutil.strcmp(A378TBM41_CRF_ITEM_GRP_DIV, Z378TBM41_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A261TBM41_CRF_ITEM_GRP_CD, Z261TBM41_CRF_ITEM_GRP_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm41_crf_ncm_map_bc");
      VarsToRow21( bcTBM41_CRF_NCM_MAP) ;
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
      Gx_mode = bcTBM41_CRF_NCM_MAP.getgxTv_SdtTBM41_CRF_NCM_MAP_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM41_CRF_NCM_MAP sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM41_CRF_NCM_MAP )
      {
         bcTBM41_CRF_NCM_MAP = sdt ;
         if ( GXutil.strcmp(bcTBM41_CRF_NCM_MAP.getgxTv_SdtTBM41_CRF_NCM_MAP_Mode(), "") == 0 )
         {
            bcTBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow21( bcTBM41_CRF_NCM_MAP) ;
         }
         else
         {
            RowToVars21( bcTBM41_CRF_NCM_MAP, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM41_CRF_NCM_MAP.getgxTv_SdtTBM41_CRF_NCM_MAP_Mode(), "") == 0 )
         {
            bcTBM41_CRF_NCM_MAP.setgxTv_SdtTBM41_CRF_NCM_MAP_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars21( bcTBM41_CRF_NCM_MAP, 1) ;
   }

   public SdtTBM41_CRF_NCM_MAP getTBM41_CRF_NCM_MAP_BC( )
   {
      return bcTBM41_CRF_NCM_MAP ;
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
      Z378TBM41_CRF_ITEM_GRP_DIV = "" ;
      A378TBM41_CRF_ITEM_GRP_DIV = "" ;
      Z261TBM41_CRF_ITEM_GRP_CD = "" ;
      A261TBM41_CRF_ITEM_GRP_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A262TBM41_NCM_METADATA_ID = "" ;
      A263TBM41_DEL_FLG = "" ;
      A264TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A265TBM41_CRT_USER_ID = "" ;
      A266TBM41_CRT_PROG_NM = "" ;
      A267TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A268TBM41_UPD_USER_ID = "" ;
      A269TBM41_UPD_PROG_NM = "" ;
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id_Z = "" ;
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg_Z = "" ;
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id_Z = "" ;
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id_Z = "" ;
      gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm_Z = "" ;
      Z264TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z265TBM41_CRT_USER_ID = "" ;
      Z267TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z268TBM41_UPD_USER_ID = "" ;
      Z262TBM41_NCM_METADATA_ID = "" ;
      Z263TBM41_DEL_FLG = "" ;
      Z266TBM41_CRT_PROG_NM = "" ;
      Z269TBM41_UPD_PROG_NM = "" ;
      BC000M4_A259TBM41_STUDY_ID = new long[1] ;
      BC000M4_A260TBM41_CRF_ID = new short[1] ;
      BC000M4_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000M4_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000M4_A264TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000M4_n264TBM41_CRT_DATETIME = new boolean[] {false} ;
      BC000M4_A265TBM41_CRT_USER_ID = new String[] {""} ;
      BC000M4_n265TBM41_CRT_USER_ID = new boolean[] {false} ;
      BC000M4_A267TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000M4_n267TBM41_UPD_DATETIME = new boolean[] {false} ;
      BC000M4_A268TBM41_UPD_USER_ID = new String[] {""} ;
      BC000M4_n268TBM41_UPD_USER_ID = new boolean[] {false} ;
      BC000M4_A270TBM41_UPD_CNT = new long[1] ;
      BC000M4_n270TBM41_UPD_CNT = new boolean[] {false} ;
      BC000M4_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      BC000M4_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      BC000M4_A263TBM41_DEL_FLG = new String[] {""} ;
      BC000M4_n263TBM41_DEL_FLG = new boolean[] {false} ;
      BC000M4_A266TBM41_CRT_PROG_NM = new String[] {""} ;
      BC000M4_n266TBM41_CRT_PROG_NM = new boolean[] {false} ;
      BC000M4_A269TBM41_UPD_PROG_NM = new String[] {""} ;
      BC000M4_n269TBM41_UPD_PROG_NM = new boolean[] {false} ;
      BC000M5_A259TBM41_STUDY_ID = new long[1] ;
      BC000M5_A260TBM41_CRF_ID = new short[1] ;
      BC000M5_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000M5_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000M3_A259TBM41_STUDY_ID = new long[1] ;
      BC000M3_A260TBM41_CRF_ID = new short[1] ;
      BC000M3_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000M3_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000M3_A264TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000M3_n264TBM41_CRT_DATETIME = new boolean[] {false} ;
      BC000M3_A265TBM41_CRT_USER_ID = new String[] {""} ;
      BC000M3_n265TBM41_CRT_USER_ID = new boolean[] {false} ;
      BC000M3_A267TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000M3_n267TBM41_UPD_DATETIME = new boolean[] {false} ;
      BC000M3_A268TBM41_UPD_USER_ID = new String[] {""} ;
      BC000M3_n268TBM41_UPD_USER_ID = new boolean[] {false} ;
      BC000M3_A270TBM41_UPD_CNT = new long[1] ;
      BC000M3_n270TBM41_UPD_CNT = new boolean[] {false} ;
      BC000M3_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      BC000M3_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      BC000M3_A263TBM41_DEL_FLG = new String[] {""} ;
      BC000M3_n263TBM41_DEL_FLG = new boolean[] {false} ;
      BC000M3_A266TBM41_CRT_PROG_NM = new String[] {""} ;
      BC000M3_n266TBM41_CRT_PROG_NM = new boolean[] {false} ;
      BC000M3_A269TBM41_UPD_PROG_NM = new String[] {""} ;
      BC000M3_n269TBM41_UPD_PROG_NM = new boolean[] {false} ;
      sMode21 = "" ;
      BC000M2_A259TBM41_STUDY_ID = new long[1] ;
      BC000M2_A260TBM41_CRF_ID = new short[1] ;
      BC000M2_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000M2_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000M2_A264TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000M2_n264TBM41_CRT_DATETIME = new boolean[] {false} ;
      BC000M2_A265TBM41_CRT_USER_ID = new String[] {""} ;
      BC000M2_n265TBM41_CRT_USER_ID = new boolean[] {false} ;
      BC000M2_A267TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000M2_n267TBM41_UPD_DATETIME = new boolean[] {false} ;
      BC000M2_A268TBM41_UPD_USER_ID = new String[] {""} ;
      BC000M2_n268TBM41_UPD_USER_ID = new boolean[] {false} ;
      BC000M2_A270TBM41_UPD_CNT = new long[1] ;
      BC000M2_n270TBM41_UPD_CNT = new boolean[] {false} ;
      BC000M2_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      BC000M2_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      BC000M2_A263TBM41_DEL_FLG = new String[] {""} ;
      BC000M2_n263TBM41_DEL_FLG = new boolean[] {false} ;
      BC000M2_A266TBM41_CRT_PROG_NM = new String[] {""} ;
      BC000M2_n266TBM41_CRT_PROG_NM = new boolean[] {false} ;
      BC000M2_A269TBM41_UPD_PROG_NM = new String[] {""} ;
      BC000M2_n269TBM41_UPD_PROG_NM = new boolean[] {false} ;
      BC000M9_A259TBM41_STUDY_ID = new long[1] ;
      BC000M9_A260TBM41_CRF_ID = new short[1] ;
      BC000M9_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000M9_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000M9_A264TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000M9_n264TBM41_CRT_DATETIME = new boolean[] {false} ;
      BC000M9_A265TBM41_CRT_USER_ID = new String[] {""} ;
      BC000M9_n265TBM41_CRT_USER_ID = new boolean[] {false} ;
      BC000M9_A267TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000M9_n267TBM41_UPD_DATETIME = new boolean[] {false} ;
      BC000M9_A268TBM41_UPD_USER_ID = new String[] {""} ;
      BC000M9_n268TBM41_UPD_USER_ID = new boolean[] {false} ;
      BC000M9_A270TBM41_UPD_CNT = new long[1] ;
      BC000M9_n270TBM41_UPD_CNT = new boolean[] {false} ;
      BC000M9_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      BC000M9_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      BC000M9_A263TBM41_DEL_FLG = new String[] {""} ;
      BC000M9_n263TBM41_DEL_FLG = new boolean[] {false} ;
      BC000M9_A266TBM41_CRT_PROG_NM = new String[] {""} ;
      BC000M9_n266TBM41_CRT_PROG_NM = new boolean[] {false} ;
      BC000M9_A269TBM41_UPD_PROG_NM = new String[] {""} ;
      BC000M9_n269TBM41_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm41_crf_ncm_map_bc__default(),
         new Object[] {
             new Object[] {
            BC000M2_A259TBM41_STUDY_ID, BC000M2_A260TBM41_CRF_ID, BC000M2_A378TBM41_CRF_ITEM_GRP_DIV, BC000M2_A261TBM41_CRF_ITEM_GRP_CD, BC000M2_A264TBM41_CRT_DATETIME, BC000M2_n264TBM41_CRT_DATETIME, BC000M2_A265TBM41_CRT_USER_ID, BC000M2_n265TBM41_CRT_USER_ID, BC000M2_A267TBM41_UPD_DATETIME, BC000M2_n267TBM41_UPD_DATETIME,
            BC000M2_A268TBM41_UPD_USER_ID, BC000M2_n268TBM41_UPD_USER_ID, BC000M2_A270TBM41_UPD_CNT, BC000M2_n270TBM41_UPD_CNT, BC000M2_A262TBM41_NCM_METADATA_ID, BC000M2_n262TBM41_NCM_METADATA_ID, BC000M2_A263TBM41_DEL_FLG, BC000M2_n263TBM41_DEL_FLG, BC000M2_A266TBM41_CRT_PROG_NM, BC000M2_n266TBM41_CRT_PROG_NM,
            BC000M2_A269TBM41_UPD_PROG_NM, BC000M2_n269TBM41_UPD_PROG_NM
            }
            , new Object[] {
            BC000M3_A259TBM41_STUDY_ID, BC000M3_A260TBM41_CRF_ID, BC000M3_A378TBM41_CRF_ITEM_GRP_DIV, BC000M3_A261TBM41_CRF_ITEM_GRP_CD, BC000M3_A264TBM41_CRT_DATETIME, BC000M3_n264TBM41_CRT_DATETIME, BC000M3_A265TBM41_CRT_USER_ID, BC000M3_n265TBM41_CRT_USER_ID, BC000M3_A267TBM41_UPD_DATETIME, BC000M3_n267TBM41_UPD_DATETIME,
            BC000M3_A268TBM41_UPD_USER_ID, BC000M3_n268TBM41_UPD_USER_ID, BC000M3_A270TBM41_UPD_CNT, BC000M3_n270TBM41_UPD_CNT, BC000M3_A262TBM41_NCM_METADATA_ID, BC000M3_n262TBM41_NCM_METADATA_ID, BC000M3_A263TBM41_DEL_FLG, BC000M3_n263TBM41_DEL_FLG, BC000M3_A266TBM41_CRT_PROG_NM, BC000M3_n266TBM41_CRT_PROG_NM,
            BC000M3_A269TBM41_UPD_PROG_NM, BC000M3_n269TBM41_UPD_PROG_NM
            }
            , new Object[] {
            BC000M4_A259TBM41_STUDY_ID, BC000M4_A260TBM41_CRF_ID, BC000M4_A378TBM41_CRF_ITEM_GRP_DIV, BC000M4_A261TBM41_CRF_ITEM_GRP_CD, BC000M4_A264TBM41_CRT_DATETIME, BC000M4_n264TBM41_CRT_DATETIME, BC000M4_A265TBM41_CRT_USER_ID, BC000M4_n265TBM41_CRT_USER_ID, BC000M4_A267TBM41_UPD_DATETIME, BC000M4_n267TBM41_UPD_DATETIME,
            BC000M4_A268TBM41_UPD_USER_ID, BC000M4_n268TBM41_UPD_USER_ID, BC000M4_A270TBM41_UPD_CNT, BC000M4_n270TBM41_UPD_CNT, BC000M4_A262TBM41_NCM_METADATA_ID, BC000M4_n262TBM41_NCM_METADATA_ID, BC000M4_A263TBM41_DEL_FLG, BC000M4_n263TBM41_DEL_FLG, BC000M4_A266TBM41_CRT_PROG_NM, BC000M4_n266TBM41_CRT_PROG_NM,
            BC000M4_A269TBM41_UPD_PROG_NM, BC000M4_n269TBM41_UPD_PROG_NM
            }
            , new Object[] {
            BC000M5_A259TBM41_STUDY_ID, BC000M5_A260TBM41_CRF_ID, BC000M5_A378TBM41_CRF_ITEM_GRP_DIV, BC000M5_A261TBM41_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000M9_A259TBM41_STUDY_ID, BC000M9_A260TBM41_CRF_ID, BC000M9_A378TBM41_CRF_ITEM_GRP_DIV, BC000M9_A261TBM41_CRF_ITEM_GRP_CD, BC000M9_A264TBM41_CRT_DATETIME, BC000M9_n264TBM41_CRT_DATETIME, BC000M9_A265TBM41_CRT_USER_ID, BC000M9_n265TBM41_CRT_USER_ID, BC000M9_A267TBM41_UPD_DATETIME, BC000M9_n267TBM41_UPD_DATETIME,
            BC000M9_A268TBM41_UPD_USER_ID, BC000M9_n268TBM41_UPD_USER_ID, BC000M9_A270TBM41_UPD_CNT, BC000M9_n270TBM41_UPD_CNT, BC000M9_A262TBM41_NCM_METADATA_ID, BC000M9_n262TBM41_NCM_METADATA_ID, BC000M9_A263TBM41_DEL_FLG, BC000M9_n263TBM41_DEL_FLG, BC000M9_A266TBM41_CRT_PROG_NM, BC000M9_n266TBM41_CRT_PROG_NM,
            BC000M9_A269TBM41_UPD_PROG_NM, BC000M9_n269TBM41_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM41_CRF_NCM_MAP_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110M2 */
      e110M2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id_N ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg_N ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime_N ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id_N ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm_N ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime_N ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id_N ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm_N ;
   private byte gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z260TBM41_CRF_ID ;
   private short A260TBM41_CRF_ID ;
   private short gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_id_Z ;
   private short RcdFound21 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z259TBM41_STUDY_ID ;
   private long A259TBM41_STUDY_ID ;
   private long A270TBM41_UPD_CNT ;
   private long gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_study_id_Z ;
   private long gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_cnt_Z ;
   private long Z270TBM41_UPD_CNT ;
   private long O270TBM41_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode21 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A264TBM41_CRT_DATETIME ;
   private java.util.Date A267TBM41_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_datetime_Z ;
   private java.util.Date Z264TBM41_CRT_DATETIME ;
   private java.util.Date Z267TBM41_UPD_DATETIME ;
   private boolean n264TBM41_CRT_DATETIME ;
   private boolean n265TBM41_CRT_USER_ID ;
   private boolean n267TBM41_UPD_DATETIME ;
   private boolean n268TBM41_UPD_USER_ID ;
   private boolean n270TBM41_UPD_CNT ;
   private boolean n262TBM41_NCM_METADATA_ID ;
   private boolean n263TBM41_DEL_FLG ;
   private boolean n266TBM41_CRT_PROG_NM ;
   private boolean n269TBM41_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z378TBM41_CRF_ITEM_GRP_DIV ;
   private String A378TBM41_CRF_ITEM_GRP_DIV ;
   private String Z261TBM41_CRF_ITEM_GRP_CD ;
   private String A261TBM41_CRF_ITEM_GRP_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A262TBM41_NCM_METADATA_ID ;
   private String A263TBM41_DEL_FLG ;
   private String A265TBM41_CRT_USER_ID ;
   private String A266TBM41_CRT_PROG_NM ;
   private String A268TBM41_UPD_USER_ID ;
   private String A269TBM41_UPD_PROG_NM ;
   private String gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_div_Z ;
   private String gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_ncm_metadata_id_Z ;
   private String gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_del_flg_Z ;
   private String gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_user_id_Z ;
   private String gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_crt_prog_nm_Z ;
   private String gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_user_id_Z ;
   private String gxTv_SdtTBM41_CRF_NCM_MAP_Tbm41_upd_prog_nm_Z ;
   private String Z265TBM41_CRT_USER_ID ;
   private String Z268TBM41_UPD_USER_ID ;
   private String Z262TBM41_NCM_METADATA_ID ;
   private String Z263TBM41_DEL_FLG ;
   private String Z266TBM41_CRT_PROG_NM ;
   private String Z269TBM41_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM41_CRF_NCM_MAP bcTBM41_CRF_NCM_MAP ;
   private IDataStoreProvider pr_default ;
   private long[] BC000M4_A259TBM41_STUDY_ID ;
   private short[] BC000M4_A260TBM41_CRF_ID ;
   private String[] BC000M4_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] BC000M4_A261TBM41_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000M4_A264TBM41_CRT_DATETIME ;
   private boolean[] BC000M4_n264TBM41_CRT_DATETIME ;
   private String[] BC000M4_A265TBM41_CRT_USER_ID ;
   private boolean[] BC000M4_n265TBM41_CRT_USER_ID ;
   private java.util.Date[] BC000M4_A267TBM41_UPD_DATETIME ;
   private boolean[] BC000M4_n267TBM41_UPD_DATETIME ;
   private String[] BC000M4_A268TBM41_UPD_USER_ID ;
   private boolean[] BC000M4_n268TBM41_UPD_USER_ID ;
   private long[] BC000M4_A270TBM41_UPD_CNT ;
   private boolean[] BC000M4_n270TBM41_UPD_CNT ;
   private String[] BC000M4_A262TBM41_NCM_METADATA_ID ;
   private boolean[] BC000M4_n262TBM41_NCM_METADATA_ID ;
   private String[] BC000M4_A263TBM41_DEL_FLG ;
   private boolean[] BC000M4_n263TBM41_DEL_FLG ;
   private String[] BC000M4_A266TBM41_CRT_PROG_NM ;
   private boolean[] BC000M4_n266TBM41_CRT_PROG_NM ;
   private String[] BC000M4_A269TBM41_UPD_PROG_NM ;
   private boolean[] BC000M4_n269TBM41_UPD_PROG_NM ;
   private long[] BC000M5_A259TBM41_STUDY_ID ;
   private short[] BC000M5_A260TBM41_CRF_ID ;
   private String[] BC000M5_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] BC000M5_A261TBM41_CRF_ITEM_GRP_CD ;
   private long[] BC000M3_A259TBM41_STUDY_ID ;
   private short[] BC000M3_A260TBM41_CRF_ID ;
   private String[] BC000M3_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] BC000M3_A261TBM41_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000M3_A264TBM41_CRT_DATETIME ;
   private boolean[] BC000M3_n264TBM41_CRT_DATETIME ;
   private String[] BC000M3_A265TBM41_CRT_USER_ID ;
   private boolean[] BC000M3_n265TBM41_CRT_USER_ID ;
   private java.util.Date[] BC000M3_A267TBM41_UPD_DATETIME ;
   private boolean[] BC000M3_n267TBM41_UPD_DATETIME ;
   private String[] BC000M3_A268TBM41_UPD_USER_ID ;
   private boolean[] BC000M3_n268TBM41_UPD_USER_ID ;
   private long[] BC000M3_A270TBM41_UPD_CNT ;
   private boolean[] BC000M3_n270TBM41_UPD_CNT ;
   private String[] BC000M3_A262TBM41_NCM_METADATA_ID ;
   private boolean[] BC000M3_n262TBM41_NCM_METADATA_ID ;
   private String[] BC000M3_A263TBM41_DEL_FLG ;
   private boolean[] BC000M3_n263TBM41_DEL_FLG ;
   private String[] BC000M3_A266TBM41_CRT_PROG_NM ;
   private boolean[] BC000M3_n266TBM41_CRT_PROG_NM ;
   private String[] BC000M3_A269TBM41_UPD_PROG_NM ;
   private boolean[] BC000M3_n269TBM41_UPD_PROG_NM ;
   private long[] BC000M2_A259TBM41_STUDY_ID ;
   private short[] BC000M2_A260TBM41_CRF_ID ;
   private String[] BC000M2_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] BC000M2_A261TBM41_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000M2_A264TBM41_CRT_DATETIME ;
   private boolean[] BC000M2_n264TBM41_CRT_DATETIME ;
   private String[] BC000M2_A265TBM41_CRT_USER_ID ;
   private boolean[] BC000M2_n265TBM41_CRT_USER_ID ;
   private java.util.Date[] BC000M2_A267TBM41_UPD_DATETIME ;
   private boolean[] BC000M2_n267TBM41_UPD_DATETIME ;
   private String[] BC000M2_A268TBM41_UPD_USER_ID ;
   private boolean[] BC000M2_n268TBM41_UPD_USER_ID ;
   private long[] BC000M2_A270TBM41_UPD_CNT ;
   private boolean[] BC000M2_n270TBM41_UPD_CNT ;
   private String[] BC000M2_A262TBM41_NCM_METADATA_ID ;
   private boolean[] BC000M2_n262TBM41_NCM_METADATA_ID ;
   private String[] BC000M2_A263TBM41_DEL_FLG ;
   private boolean[] BC000M2_n263TBM41_DEL_FLG ;
   private String[] BC000M2_A266TBM41_CRT_PROG_NM ;
   private boolean[] BC000M2_n266TBM41_CRT_PROG_NM ;
   private String[] BC000M2_A269TBM41_UPD_PROG_NM ;
   private boolean[] BC000M2_n269TBM41_UPD_PROG_NM ;
   private long[] BC000M9_A259TBM41_STUDY_ID ;
   private short[] BC000M9_A260TBM41_CRF_ID ;
   private String[] BC000M9_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] BC000M9_A261TBM41_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000M9_A264TBM41_CRT_DATETIME ;
   private boolean[] BC000M9_n264TBM41_CRT_DATETIME ;
   private String[] BC000M9_A265TBM41_CRT_USER_ID ;
   private boolean[] BC000M9_n265TBM41_CRT_USER_ID ;
   private java.util.Date[] BC000M9_A267TBM41_UPD_DATETIME ;
   private boolean[] BC000M9_n267TBM41_UPD_DATETIME ;
   private String[] BC000M9_A268TBM41_UPD_USER_ID ;
   private boolean[] BC000M9_n268TBM41_UPD_USER_ID ;
   private long[] BC000M9_A270TBM41_UPD_CNT ;
   private boolean[] BC000M9_n270TBM41_UPD_CNT ;
   private String[] BC000M9_A262TBM41_NCM_METADATA_ID ;
   private boolean[] BC000M9_n262TBM41_NCM_METADATA_ID ;
   private String[] BC000M9_A263TBM41_DEL_FLG ;
   private boolean[] BC000M9_n263TBM41_DEL_FLG ;
   private String[] BC000M9_A266TBM41_CRT_PROG_NM ;
   private boolean[] BC000M9_n266TBM41_CRT_PROG_NM ;
   private String[] BC000M9_A269TBM41_UPD_PROG_NM ;
   private boolean[] BC000M9_n269TBM41_UPD_PROG_NM ;
}

final  class tbm41_crf_ncm_map_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000M2", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_CNT`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_PROG_NM`, `TBM41_UPD_PROG_NM` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000M3", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_CNT`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_PROG_NM`, `TBM41_UPD_PROG_NM` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000M4", "SELECT TM1.`TBM41_STUDY_ID`, TM1.`TBM41_CRF_ID`, TM1.`TBM41_CRF_ITEM_GRP_DIV`, TM1.`TBM41_CRF_ITEM_GRP_CD`, TM1.`TBM41_CRT_DATETIME`, TM1.`TBM41_CRT_USER_ID`, TM1.`TBM41_UPD_DATETIME`, TM1.`TBM41_UPD_USER_ID`, TM1.`TBM41_UPD_CNT`, TM1.`TBM41_NCM_METADATA_ID`, TM1.`TBM41_DEL_FLG`, TM1.`TBM41_CRT_PROG_NM`, TM1.`TBM41_UPD_PROG_NM` FROM `TBM41_CRF_NCM_MAP` TM1 WHERE TM1.`TBM41_STUDY_ID` = ? and TM1.`TBM41_CRF_ID` = ? and TM1.`TBM41_CRF_ITEM_GRP_DIV` = ? and TM1.`TBM41_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBM41_STUDY_ID`, TM1.`TBM41_CRF_ID`, TM1.`TBM41_CRF_ITEM_GRP_DIV`, TM1.`TBM41_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000M5", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000M6", "INSERT INTO `TBM41_CRF_NCM_MAP` (`TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_CNT`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_PROG_NM`, `TBM41_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000M7", "UPDATE `TBM41_CRF_NCM_MAP` SET `TBM41_CRT_DATETIME`=?, `TBM41_CRT_USER_ID`=?, `TBM41_UPD_DATETIME`=?, `TBM41_UPD_USER_ID`=?, `TBM41_UPD_CNT`=?, `TBM41_NCM_METADATA_ID`=?, `TBM41_DEL_FLG`=?, `TBM41_CRT_PROG_NM`=?, `TBM41_UPD_PROG_NM`=?  WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000M8", "DELETE FROM `TBM41_CRF_NCM_MAP`  WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000M9", "SELECT TM1.`TBM41_STUDY_ID`, TM1.`TBM41_CRF_ID`, TM1.`TBM41_CRF_ITEM_GRP_DIV`, TM1.`TBM41_CRF_ITEM_GRP_CD`, TM1.`TBM41_CRT_DATETIME`, TM1.`TBM41_CRT_USER_ID`, TM1.`TBM41_UPD_DATETIME`, TM1.`TBM41_UPD_USER_ID`, TM1.`TBM41_UPD_CNT`, TM1.`TBM41_NCM_METADATA_ID`, TM1.`TBM41_DEL_FLG`, TM1.`TBM41_CRT_PROG_NM`, TM1.`TBM41_UPD_PROG_NM` FROM `TBM41_CRF_NCM_MAP` TM1 WHERE TM1.`TBM41_STUDY_ID` = ? and TM1.`TBM41_CRF_ID` = ? and TM1.`TBM41_CRF_ITEM_GRP_DIV` = ? and TM1.`TBM41_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBM41_STUDY_ID`, TM1.`TBM41_CRF_ID`, TM1.`TBM41_CRF_ITEM_GRP_DIV`, TM1.`TBM41_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 100);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
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
               stmt.setShort(11, ((Number) parms[19]).shortValue());
               stmt.setVarchar(12, (String)parms[20], 1, false);
               stmt.setVarchar(13, (String)parms[21], 50, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
      }
   }

}

