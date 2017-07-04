/*
               File: tbm36_crf_select_bc
        Description: CRF選択マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:44.15
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm36_crf_select_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm36_crf_select_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm36_crf_select_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm36_crf_select_bc.class ));
   }

   public tbm36_crf_select_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1136( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1136( ) ;
      standaloneModal( ) ;
      addRow1136( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: E122 */
         E122 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z35TBM36_STUDY_ID = A35TBM36_STUDY_ID ;
            Z36TBM36_CRF_ID = A36TBM36_CRF_ID ;
            Z37TBM36_COND_NO = A37TBM36_COND_NO ;
            Z38TBM36_SELECT_CRF_ID = A38TBM36_SELECT_CRF_ID ;
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

   public void confirm_110( )
   {
      beforeValidate1136( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1136( ) ;
         }
         else
         {
            checkExtendedTable1136( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1136( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void E112( )
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

   public void E122( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A35TBM36_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A36TBM36_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A37TBM36_COND_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A38TBM36_SELECT_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A589TBM36_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A590TBM36_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A591TBM36_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A592TBM36_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A593TBM36_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A594TBM36_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A595TBM36_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A596TBM36_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1136( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z590TBM36_CRT_DATETIME = A590TBM36_CRT_DATETIME ;
         Z591TBM36_CRT_USER_ID = A591TBM36_CRT_USER_ID ;
         Z593TBM36_UPD_DATETIME = A593TBM36_UPD_DATETIME ;
         Z594TBM36_UPD_USER_ID = A594TBM36_UPD_USER_ID ;
         Z596TBM36_UPD_CNT = A596TBM36_UPD_CNT ;
         Z589TBM36_DEL_FLG = A589TBM36_DEL_FLG ;
         Z592TBM36_CRT_PROG_NM = A592TBM36_CRT_PROG_NM ;
         Z595TBM36_UPD_PROG_NM = A595TBM36_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z35TBM36_STUDY_ID = A35TBM36_STUDY_ID ;
         Z36TBM36_CRF_ID = A36TBM36_CRF_ID ;
         Z37TBM36_COND_NO = A37TBM36_COND_NO ;
         Z38TBM36_SELECT_CRF_ID = A38TBM36_SELECT_CRF_ID ;
         Z590TBM36_CRT_DATETIME = A590TBM36_CRT_DATETIME ;
         Z591TBM36_CRT_USER_ID = A591TBM36_CRT_USER_ID ;
         Z593TBM36_UPD_DATETIME = A593TBM36_UPD_DATETIME ;
         Z594TBM36_UPD_USER_ID = A594TBM36_UPD_USER_ID ;
         Z596TBM36_UPD_CNT = A596TBM36_UPD_CNT ;
         Z589TBM36_DEL_FLG = A589TBM36_DEL_FLG ;
         Z592TBM36_CRT_PROG_NM = A592TBM36_CRT_PROG_NM ;
         Z595TBM36_UPD_PROG_NM = A595TBM36_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1136( )
   {
      /* Using cursor BC00114 */
      pr_default.execute(2, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A590TBM36_CRT_DATETIME = BC00114_A590TBM36_CRT_DATETIME[0] ;
         n590TBM36_CRT_DATETIME = BC00114_n590TBM36_CRT_DATETIME[0] ;
         A591TBM36_CRT_USER_ID = BC00114_A591TBM36_CRT_USER_ID[0] ;
         n591TBM36_CRT_USER_ID = BC00114_n591TBM36_CRT_USER_ID[0] ;
         A593TBM36_UPD_DATETIME = BC00114_A593TBM36_UPD_DATETIME[0] ;
         n593TBM36_UPD_DATETIME = BC00114_n593TBM36_UPD_DATETIME[0] ;
         A594TBM36_UPD_USER_ID = BC00114_A594TBM36_UPD_USER_ID[0] ;
         n594TBM36_UPD_USER_ID = BC00114_n594TBM36_UPD_USER_ID[0] ;
         A596TBM36_UPD_CNT = BC00114_A596TBM36_UPD_CNT[0] ;
         n596TBM36_UPD_CNT = BC00114_n596TBM36_UPD_CNT[0] ;
         A589TBM36_DEL_FLG = BC00114_A589TBM36_DEL_FLG[0] ;
         n589TBM36_DEL_FLG = BC00114_n589TBM36_DEL_FLG[0] ;
         A592TBM36_CRT_PROG_NM = BC00114_A592TBM36_CRT_PROG_NM[0] ;
         n592TBM36_CRT_PROG_NM = BC00114_n592TBM36_CRT_PROG_NM[0] ;
         A595TBM36_UPD_PROG_NM = BC00114_A595TBM36_UPD_PROG_NM[0] ;
         n595TBM36_UPD_PROG_NM = BC00114_n595TBM36_UPD_PROG_NM[0] ;
         zm1136( -8) ;
      }
      pr_default.close(2);
      onLoadActions1136( ) ;
   }

   public void onLoadActions1136( )
   {
      AV9Pgmname = "TBM36_CRF_SELECT_BC" ;
   }

   public void checkExtendedTable1136( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM36_CRF_SELECT_BC" ;
      if ( ! ( GXutil.nullDate().equals(A590TBM36_CRT_DATETIME) || (( A590TBM36_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A590TBM36_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A593TBM36_UPD_DATETIME) || (( A593TBM36_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A593TBM36_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1136( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1136( )
   {
      /* Using cursor BC00115 */
      pr_default.execute(3, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound36 = (short)(1) ;
      }
      else
      {
         RcdFound36 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00113 */
      pr_default.execute(1, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1136( 8) ;
         RcdFound36 = (short)(1) ;
         A35TBM36_STUDY_ID = BC00113_A35TBM36_STUDY_ID[0] ;
         A36TBM36_CRF_ID = BC00113_A36TBM36_CRF_ID[0] ;
         A37TBM36_COND_NO = BC00113_A37TBM36_COND_NO[0] ;
         A38TBM36_SELECT_CRF_ID = BC00113_A38TBM36_SELECT_CRF_ID[0] ;
         A590TBM36_CRT_DATETIME = BC00113_A590TBM36_CRT_DATETIME[0] ;
         n590TBM36_CRT_DATETIME = BC00113_n590TBM36_CRT_DATETIME[0] ;
         A591TBM36_CRT_USER_ID = BC00113_A591TBM36_CRT_USER_ID[0] ;
         n591TBM36_CRT_USER_ID = BC00113_n591TBM36_CRT_USER_ID[0] ;
         A593TBM36_UPD_DATETIME = BC00113_A593TBM36_UPD_DATETIME[0] ;
         n593TBM36_UPD_DATETIME = BC00113_n593TBM36_UPD_DATETIME[0] ;
         A594TBM36_UPD_USER_ID = BC00113_A594TBM36_UPD_USER_ID[0] ;
         n594TBM36_UPD_USER_ID = BC00113_n594TBM36_UPD_USER_ID[0] ;
         A596TBM36_UPD_CNT = BC00113_A596TBM36_UPD_CNT[0] ;
         n596TBM36_UPD_CNT = BC00113_n596TBM36_UPD_CNT[0] ;
         A589TBM36_DEL_FLG = BC00113_A589TBM36_DEL_FLG[0] ;
         n589TBM36_DEL_FLG = BC00113_n589TBM36_DEL_FLG[0] ;
         A592TBM36_CRT_PROG_NM = BC00113_A592TBM36_CRT_PROG_NM[0] ;
         n592TBM36_CRT_PROG_NM = BC00113_n592TBM36_CRT_PROG_NM[0] ;
         A595TBM36_UPD_PROG_NM = BC00113_A595TBM36_UPD_PROG_NM[0] ;
         n595TBM36_UPD_PROG_NM = BC00113_n595TBM36_UPD_PROG_NM[0] ;
         O596TBM36_UPD_CNT = A596TBM36_UPD_CNT ;
         n596TBM36_UPD_CNT = false ;
         Z35TBM36_STUDY_ID = A35TBM36_STUDY_ID ;
         Z36TBM36_CRF_ID = A36TBM36_CRF_ID ;
         Z37TBM36_COND_NO = A37TBM36_COND_NO ;
         Z38TBM36_SELECT_CRF_ID = A38TBM36_SELECT_CRF_ID ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1136( ) ;
         if ( AnyError == 1 )
         {
            RcdFound36 = (short)(0) ;
            initializeNonKey1136( ) ;
         }
         Gx_mode = sMode36 ;
      }
      else
      {
         RcdFound36 = (short)(0) ;
         initializeNonKey1136( ) ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode36 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1136( ) ;
      if ( RcdFound36 == 0 )
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
      confirm_110( ) ;
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

   public void checkOptimisticConcurrency1136( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00112 */
         pr_default.execute(0, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM36_CRF_SELECT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z590TBM36_CRT_DATETIME.equals( BC00112_A590TBM36_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z591TBM36_CRT_USER_ID, BC00112_A591TBM36_CRT_USER_ID[0]) != 0 ) || !( Z593TBM36_UPD_DATETIME.equals( BC00112_A593TBM36_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z594TBM36_UPD_USER_ID, BC00112_A594TBM36_UPD_USER_ID[0]) != 0 ) || ( Z596TBM36_UPD_CNT != BC00112_A596TBM36_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z589TBM36_DEL_FLG, BC00112_A589TBM36_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z592TBM36_CRT_PROG_NM, BC00112_A592TBM36_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z595TBM36_UPD_PROG_NM, BC00112_A595TBM36_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM36_CRF_SELECT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1136( )
   {
      beforeValidate1136( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1136( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1136( 0) ;
         checkOptimisticConcurrency1136( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1136( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1136( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00116 */
                  pr_default.execute(4, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID), new Boolean(n590TBM36_CRT_DATETIME), A590TBM36_CRT_DATETIME, new Boolean(n591TBM36_CRT_USER_ID), A591TBM36_CRT_USER_ID, new Boolean(n593TBM36_UPD_DATETIME), A593TBM36_UPD_DATETIME, new Boolean(n594TBM36_UPD_USER_ID), A594TBM36_UPD_USER_ID, new Boolean(n596TBM36_UPD_CNT), new Long(A596TBM36_UPD_CNT), new Boolean(n589TBM36_DEL_FLG), A589TBM36_DEL_FLG, new Boolean(n592TBM36_CRT_PROG_NM), A592TBM36_CRT_PROG_NM, new Boolean(n595TBM36_UPD_PROG_NM), A595TBM36_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM36_CRF_SELECT") ;
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
            load1136( ) ;
         }
         endLevel1136( ) ;
      }
      closeExtendedTableCursors1136( ) ;
   }

   public void update1136( )
   {
      beforeValidate1136( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1136( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1136( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1136( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1136( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00117 */
                  pr_default.execute(5, new Object[] {new Boolean(n590TBM36_CRT_DATETIME), A590TBM36_CRT_DATETIME, new Boolean(n591TBM36_CRT_USER_ID), A591TBM36_CRT_USER_ID, new Boolean(n593TBM36_UPD_DATETIME), A593TBM36_UPD_DATETIME, new Boolean(n594TBM36_UPD_USER_ID), A594TBM36_UPD_USER_ID, new Boolean(n596TBM36_UPD_CNT), new Long(A596TBM36_UPD_CNT), new Boolean(n589TBM36_DEL_FLG), A589TBM36_DEL_FLG, new Boolean(n592TBM36_CRT_PROG_NM), A592TBM36_CRT_PROG_NM, new Boolean(n595TBM36_UPD_PROG_NM), A595TBM36_UPD_PROG_NM, new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM36_CRF_SELECT") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM36_CRF_SELECT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1136( ) ;
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
         endLevel1136( ) ;
      }
      closeExtendedTableCursors1136( ) ;
   }

   public void deferredUpdate1136( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1136( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1136( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1136( ) ;
         afterConfirm1136( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1136( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00118 */
               pr_default.execute(6, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM36_CRF_SELECT") ;
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
      sMode36 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1136( ) ;
      Gx_mode = sMode36 ;
   }

   public void onDeleteControls1136( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM36_CRF_SELECT_BC" ;
      }
   }

   public void endLevel1136( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1136( ) ;
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

   public void scanKeyStart1136( )
   {
      /* Scan By routine */
      /* Using cursor BC00119 */
      pr_default.execute(7, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID)});
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A35TBM36_STUDY_ID = BC00119_A35TBM36_STUDY_ID[0] ;
         A36TBM36_CRF_ID = BC00119_A36TBM36_CRF_ID[0] ;
         A37TBM36_COND_NO = BC00119_A37TBM36_COND_NO[0] ;
         A38TBM36_SELECT_CRF_ID = BC00119_A38TBM36_SELECT_CRF_ID[0] ;
         A590TBM36_CRT_DATETIME = BC00119_A590TBM36_CRT_DATETIME[0] ;
         n590TBM36_CRT_DATETIME = BC00119_n590TBM36_CRT_DATETIME[0] ;
         A591TBM36_CRT_USER_ID = BC00119_A591TBM36_CRT_USER_ID[0] ;
         n591TBM36_CRT_USER_ID = BC00119_n591TBM36_CRT_USER_ID[0] ;
         A593TBM36_UPD_DATETIME = BC00119_A593TBM36_UPD_DATETIME[0] ;
         n593TBM36_UPD_DATETIME = BC00119_n593TBM36_UPD_DATETIME[0] ;
         A594TBM36_UPD_USER_ID = BC00119_A594TBM36_UPD_USER_ID[0] ;
         n594TBM36_UPD_USER_ID = BC00119_n594TBM36_UPD_USER_ID[0] ;
         A596TBM36_UPD_CNT = BC00119_A596TBM36_UPD_CNT[0] ;
         n596TBM36_UPD_CNT = BC00119_n596TBM36_UPD_CNT[0] ;
         A589TBM36_DEL_FLG = BC00119_A589TBM36_DEL_FLG[0] ;
         n589TBM36_DEL_FLG = BC00119_n589TBM36_DEL_FLG[0] ;
         A592TBM36_CRT_PROG_NM = BC00119_A592TBM36_CRT_PROG_NM[0] ;
         n592TBM36_CRT_PROG_NM = BC00119_n592TBM36_CRT_PROG_NM[0] ;
         A595TBM36_UPD_PROG_NM = BC00119_A595TBM36_UPD_PROG_NM[0] ;
         n595TBM36_UPD_PROG_NM = BC00119_n595TBM36_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1136( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound36 = (short)(0) ;
      scanKeyLoad1136( ) ;
   }

   public void scanKeyLoad1136( )
   {
      sMode36 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A35TBM36_STUDY_ID = BC00119_A35TBM36_STUDY_ID[0] ;
         A36TBM36_CRF_ID = BC00119_A36TBM36_CRF_ID[0] ;
         A37TBM36_COND_NO = BC00119_A37TBM36_COND_NO[0] ;
         A38TBM36_SELECT_CRF_ID = BC00119_A38TBM36_SELECT_CRF_ID[0] ;
         A590TBM36_CRT_DATETIME = BC00119_A590TBM36_CRT_DATETIME[0] ;
         n590TBM36_CRT_DATETIME = BC00119_n590TBM36_CRT_DATETIME[0] ;
         A591TBM36_CRT_USER_ID = BC00119_A591TBM36_CRT_USER_ID[0] ;
         n591TBM36_CRT_USER_ID = BC00119_n591TBM36_CRT_USER_ID[0] ;
         A593TBM36_UPD_DATETIME = BC00119_A593TBM36_UPD_DATETIME[0] ;
         n593TBM36_UPD_DATETIME = BC00119_n593TBM36_UPD_DATETIME[0] ;
         A594TBM36_UPD_USER_ID = BC00119_A594TBM36_UPD_USER_ID[0] ;
         n594TBM36_UPD_USER_ID = BC00119_n594TBM36_UPD_USER_ID[0] ;
         A596TBM36_UPD_CNT = BC00119_A596TBM36_UPD_CNT[0] ;
         n596TBM36_UPD_CNT = BC00119_n596TBM36_UPD_CNT[0] ;
         A589TBM36_DEL_FLG = BC00119_A589TBM36_DEL_FLG[0] ;
         n589TBM36_DEL_FLG = BC00119_n589TBM36_DEL_FLG[0] ;
         A592TBM36_CRT_PROG_NM = BC00119_A592TBM36_CRT_PROG_NM[0] ;
         n592TBM36_CRT_PROG_NM = BC00119_n592TBM36_CRT_PROG_NM[0] ;
         A595TBM36_UPD_PROG_NM = BC00119_A595TBM36_UPD_PROG_NM[0] ;
         n595TBM36_UPD_PROG_NM = BC00119_n595TBM36_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode36 ;
   }

   public void scanKeyEnd1136( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1136( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1136( )
   {
      /* Before Insert Rules */
      A590TBM36_CRT_DATETIME = GXutil.now( ) ;
      n590TBM36_CRT_DATETIME = false ;
      GXt_char1 = A591TBM36_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      A591TBM36_CRT_USER_ID = GXt_char1 ;
      n591TBM36_CRT_USER_ID = false ;
      A593TBM36_UPD_DATETIME = GXutil.now( ) ;
      n593TBM36_UPD_DATETIME = false ;
      GXt_char1 = A594TBM36_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      A594TBM36_UPD_USER_ID = GXt_char1 ;
      n594TBM36_UPD_USER_ID = false ;
      A596TBM36_UPD_CNT = (long)(O596TBM36_UPD_CNT+1) ;
      n596TBM36_UPD_CNT = false ;
   }

   public void beforeUpdate1136( )
   {
      /* Before Update Rules */
      A593TBM36_UPD_DATETIME = GXutil.now( ) ;
      n593TBM36_UPD_DATETIME = false ;
      GXt_char1 = A594TBM36_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      A594TBM36_UPD_USER_ID = GXt_char1 ;
      n594TBM36_UPD_USER_ID = false ;
      A596TBM36_UPD_CNT = (long)(O596TBM36_UPD_CNT+1) ;
      n596TBM36_UPD_CNT = false ;
   }

   public void beforeDelete1136( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1136( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1136( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1136( )
   {
   }

   public void addRow1136( )
   {
      VarsToRow36( bcTBM36_CRF_SELECT) ;
   }

   public void readRow1136( )
   {
      RowToVars36( bcTBM36_CRF_SELECT, 1) ;
   }

   public void initializeNonKey1136( )
   {
      A590TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n590TBM36_CRT_DATETIME = false ;
      A591TBM36_CRT_USER_ID = "" ;
      n591TBM36_CRT_USER_ID = false ;
      A593TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n593TBM36_UPD_DATETIME = false ;
      A594TBM36_UPD_USER_ID = "" ;
      n594TBM36_UPD_USER_ID = false ;
      A596TBM36_UPD_CNT = 0 ;
      n596TBM36_UPD_CNT = false ;
      A589TBM36_DEL_FLG = "" ;
      n589TBM36_DEL_FLG = false ;
      A592TBM36_CRT_PROG_NM = "" ;
      n592TBM36_CRT_PROG_NM = false ;
      A595TBM36_UPD_PROG_NM = "" ;
      n595TBM36_UPD_PROG_NM = false ;
      O596TBM36_UPD_CNT = A596TBM36_UPD_CNT ;
      n596TBM36_UPD_CNT = false ;
   }

   public void initAll1136( )
   {
      A35TBM36_STUDY_ID = 0 ;
      A36TBM36_CRF_ID = (short)(0) ;
      A37TBM36_COND_NO = (short)(0) ;
      A38TBM36_SELECT_CRF_ID = (short)(0) ;
      initializeNonKey1136( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow36( SdtTBM36_CRF_SELECT obj36 )
   {
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Mode( Gx_mode );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime( A590TBM36_CRT_DATETIME );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id( A591TBM36_CRT_USER_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime( A593TBM36_UPD_DATETIME );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id( A594TBM36_UPD_USER_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt( A596TBM36_UPD_CNT );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg( A589TBM36_DEL_FLG );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm( A592TBM36_CRT_PROG_NM );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm( A595TBM36_UPD_PROG_NM );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id( A35TBM36_STUDY_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id( A36TBM36_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no( A37TBM36_COND_NO );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id( A38TBM36_SELECT_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id_Z( Z35TBM36_STUDY_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id_Z( Z36TBM36_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no_Z( Z37TBM36_COND_NO );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id_Z( Z38TBM36_SELECT_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z( Z589TBM36_DEL_FLG );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z( Z590TBM36_CRT_DATETIME );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z( Z591TBM36_CRT_USER_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z( Z592TBM36_CRT_PROG_NM );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z( Z593TBM36_UPD_DATETIME );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z( Z594TBM36_UPD_USER_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z( Z595TBM36_UPD_PROG_NM );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z( Z596TBM36_UPD_CNT );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_N( (byte)((byte)((n589TBM36_DEL_FLG)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_N( (byte)((byte)((n590TBM36_CRT_DATETIME)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_N( (byte)((byte)((n591TBM36_CRT_USER_ID)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_N( (byte)((byte)((n592TBM36_CRT_PROG_NM)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_N( (byte)((byte)((n593TBM36_UPD_DATETIME)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_N( (byte)((byte)((n594TBM36_UPD_USER_ID)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_N( (byte)((byte)((n595TBM36_UPD_PROG_NM)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_N( (byte)((byte)((n596TBM36_UPD_CNT)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Mode( Gx_mode );
   }

   public void KeyVarsToRow36( SdtTBM36_CRF_SELECT obj36 )
   {
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id( A35TBM36_STUDY_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id( A36TBM36_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no( A37TBM36_COND_NO );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id( A38TBM36_SELECT_CRF_ID );
   }

   public void RowToVars36( SdtTBM36_CRF_SELECT obj36 ,
                            int forceLoad )
   {
      Gx_mode = obj36.getgxTv_SdtTBM36_CRF_SELECT_Mode() ;
      A590TBM36_CRT_DATETIME = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime() ;
      n590TBM36_CRT_DATETIME = false ;
      A591TBM36_CRT_USER_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id() ;
      n591TBM36_CRT_USER_ID = false ;
      A593TBM36_UPD_DATETIME = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime() ;
      n593TBM36_UPD_DATETIME = false ;
      A594TBM36_UPD_USER_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id() ;
      n594TBM36_UPD_USER_ID = false ;
      A596TBM36_UPD_CNT = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt() ;
      n596TBM36_UPD_CNT = false ;
      A589TBM36_DEL_FLG = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg() ;
      n589TBM36_DEL_FLG = false ;
      A592TBM36_CRT_PROG_NM = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm() ;
      n592TBM36_CRT_PROG_NM = false ;
      A595TBM36_UPD_PROG_NM = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm() ;
      n595TBM36_UPD_PROG_NM = false ;
      A35TBM36_STUDY_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id() ;
      A36TBM36_CRF_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id() ;
      A37TBM36_COND_NO = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no() ;
      A38TBM36_SELECT_CRF_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id() ;
      Z35TBM36_STUDY_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id_Z() ;
      Z36TBM36_CRF_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id_Z() ;
      Z37TBM36_COND_NO = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no_Z() ;
      Z38TBM36_SELECT_CRF_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id_Z() ;
      Z589TBM36_DEL_FLG = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z() ;
      Z590TBM36_CRT_DATETIME = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z() ;
      Z591TBM36_CRT_USER_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z() ;
      Z592TBM36_CRT_PROG_NM = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z() ;
      Z593TBM36_UPD_DATETIME = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z() ;
      Z594TBM36_UPD_USER_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z() ;
      Z595TBM36_UPD_PROG_NM = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z() ;
      Z596TBM36_UPD_CNT = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z() ;
      O596TBM36_UPD_CNT = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z() ;
      n589TBM36_DEL_FLG = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_N()==0)?false:true) ;
      n590TBM36_CRT_DATETIME = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_N()==0)?false:true) ;
      n591TBM36_CRT_USER_ID = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_N()==0)?false:true) ;
      n592TBM36_CRT_PROG_NM = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_N()==0)?false:true) ;
      n593TBM36_UPD_DATETIME = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_N()==0)?false:true) ;
      n594TBM36_UPD_USER_ID = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_N()==0)?false:true) ;
      n595TBM36_UPD_PROG_NM = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_N()==0)?false:true) ;
      n596TBM36_UPD_CNT = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj36.getgxTv_SdtTBM36_CRF_SELECT_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A35TBM36_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A36TBM36_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A37TBM36_COND_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A38TBM36_SELECT_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1136( ) ;
      scanKeyStart1136( ) ;
      if ( RcdFound36 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z35TBM36_STUDY_ID = A35TBM36_STUDY_ID ;
         Z36TBM36_CRF_ID = A36TBM36_CRF_ID ;
         Z37TBM36_COND_NO = A37TBM36_COND_NO ;
         Z38TBM36_SELECT_CRF_ID = A38TBM36_SELECT_CRF_ID ;
         O596TBM36_UPD_CNT = A596TBM36_UPD_CNT ;
         n596TBM36_UPD_CNT = false ;
      }
      zm1136( -8) ;
      onLoadActions1136( ) ;
      addRow1136( ) ;
      scanKeyEnd1136( ) ;
      if ( RcdFound36 == 0 )
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
      RowToVars36( bcTBM36_CRF_SELECT, 0) ;
      scanKeyStart1136( ) ;
      if ( RcdFound36 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z35TBM36_STUDY_ID = A35TBM36_STUDY_ID ;
         Z36TBM36_CRF_ID = A36TBM36_CRF_ID ;
         Z37TBM36_COND_NO = A37TBM36_COND_NO ;
         Z38TBM36_SELECT_CRF_ID = A38TBM36_SELECT_CRF_ID ;
         O596TBM36_UPD_CNT = A596TBM36_UPD_CNT ;
         n596TBM36_UPD_CNT = false ;
      }
      zm1136( -8) ;
      onLoadActions1136( ) ;
      addRow1136( ) ;
      scanKeyEnd1136( ) ;
      if ( RcdFound36 == 0 )
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
      RowToVars36( bcTBM36_CRF_SELECT, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1136( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1136( ) ;
      }
      else
      {
         if ( RcdFound36 == 1 )
         {
            if ( ( A35TBM36_STUDY_ID != Z35TBM36_STUDY_ID ) || ( A36TBM36_CRF_ID != Z36TBM36_CRF_ID ) || ( A37TBM36_COND_NO != Z37TBM36_COND_NO ) || ( A38TBM36_SELECT_CRF_ID != Z38TBM36_SELECT_CRF_ID ) )
            {
               A35TBM36_STUDY_ID = Z35TBM36_STUDY_ID ;
               A36TBM36_CRF_ID = Z36TBM36_CRF_ID ;
               A37TBM36_COND_NO = Z37TBM36_COND_NO ;
               A38TBM36_SELECT_CRF_ID = Z38TBM36_SELECT_CRF_ID ;
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
               update1136( ) ;
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
               if ( ( A35TBM36_STUDY_ID != Z35TBM36_STUDY_ID ) || ( A36TBM36_CRF_ID != Z36TBM36_CRF_ID ) || ( A37TBM36_COND_NO != Z37TBM36_COND_NO ) || ( A38TBM36_SELECT_CRF_ID != Z38TBM36_SELECT_CRF_ID ) )
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
                     insert1136( ) ;
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
                     insert1136( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow36( bcTBM36_CRF_SELECT) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars36( bcTBM36_CRF_SELECT, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1136( ) ;
      if ( RcdFound36 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A35TBM36_STUDY_ID != Z35TBM36_STUDY_ID ) || ( A36TBM36_CRF_ID != Z36TBM36_CRF_ID ) || ( A37TBM36_COND_NO != Z37TBM36_COND_NO ) || ( A38TBM36_SELECT_CRF_ID != Z38TBM36_SELECT_CRF_ID ) )
         {
            A35TBM36_STUDY_ID = Z35TBM36_STUDY_ID ;
            A36TBM36_CRF_ID = Z36TBM36_CRF_ID ;
            A37TBM36_COND_NO = Z37TBM36_COND_NO ;
            A38TBM36_SELECT_CRF_ID = Z38TBM36_SELECT_CRF_ID ;
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
         if ( ( A35TBM36_STUDY_ID != Z35TBM36_STUDY_ID ) || ( A36TBM36_CRF_ID != Z36TBM36_CRF_ID ) || ( A37TBM36_COND_NO != Z37TBM36_COND_NO ) || ( A38TBM36_SELECT_CRF_ID != Z38TBM36_SELECT_CRF_ID ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm36_crf_select_bc");
      VarsToRow36( bcTBM36_CRF_SELECT) ;
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
      Gx_mode = bcTBM36_CRF_SELECT.getgxTv_SdtTBM36_CRF_SELECT_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM36_CRF_SELECT sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM36_CRF_SELECT )
      {
         bcTBM36_CRF_SELECT = sdt ;
         if ( GXutil.strcmp(bcTBM36_CRF_SELECT.getgxTv_SdtTBM36_CRF_SELECT_Mode(), "") == 0 )
         {
            bcTBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow36( bcTBM36_CRF_SELECT) ;
         }
         else
         {
            RowToVars36( bcTBM36_CRF_SELECT, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM36_CRF_SELECT.getgxTv_SdtTBM36_CRF_SELECT_Mode(), "") == 0 )
         {
            bcTBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars36( bcTBM36_CRF_SELECT, 1) ;
   }

   public SdtTBM36_CRF_SELECT getTBM36_CRF_SELECT_BC( )
   {
      return bcTBM36_CRF_SELECT ;
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
      AV7W_TXT = "" ;
      A589TBM36_DEL_FLG = "" ;
      A590TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A591TBM36_CRT_USER_ID = "" ;
      A592TBM36_CRT_PROG_NM = "" ;
      A593TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A594TBM36_UPD_USER_ID = "" ;
      A595TBM36_UPD_PROG_NM = "" ;
      Z590TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z591TBM36_CRT_USER_ID = "" ;
      Z593TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z594TBM36_UPD_USER_ID = "" ;
      Z589TBM36_DEL_FLG = "" ;
      Z592TBM36_CRT_PROG_NM = "" ;
      Z595TBM36_UPD_PROG_NM = "" ;
      BC00114_A35TBM36_STUDY_ID = new long[1] ;
      BC00114_A36TBM36_CRF_ID = new short[1] ;
      BC00114_A37TBM36_COND_NO = new short[1] ;
      BC00114_A38TBM36_SELECT_CRF_ID = new short[1] ;
      BC00114_A590TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00114_n590TBM36_CRT_DATETIME = new boolean[] {false} ;
      BC00114_A591TBM36_CRT_USER_ID = new String[] {""} ;
      BC00114_n591TBM36_CRT_USER_ID = new boolean[] {false} ;
      BC00114_A593TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00114_n593TBM36_UPD_DATETIME = new boolean[] {false} ;
      BC00114_A594TBM36_UPD_USER_ID = new String[] {""} ;
      BC00114_n594TBM36_UPD_USER_ID = new boolean[] {false} ;
      BC00114_A596TBM36_UPD_CNT = new long[1] ;
      BC00114_n596TBM36_UPD_CNT = new boolean[] {false} ;
      BC00114_A589TBM36_DEL_FLG = new String[] {""} ;
      BC00114_n589TBM36_DEL_FLG = new boolean[] {false} ;
      BC00114_A592TBM36_CRT_PROG_NM = new String[] {""} ;
      BC00114_n592TBM36_CRT_PROG_NM = new boolean[] {false} ;
      BC00114_A595TBM36_UPD_PROG_NM = new String[] {""} ;
      BC00114_n595TBM36_UPD_PROG_NM = new boolean[] {false} ;
      BC00115_A35TBM36_STUDY_ID = new long[1] ;
      BC00115_A36TBM36_CRF_ID = new short[1] ;
      BC00115_A37TBM36_COND_NO = new short[1] ;
      BC00115_A38TBM36_SELECT_CRF_ID = new short[1] ;
      BC00113_A35TBM36_STUDY_ID = new long[1] ;
      BC00113_A36TBM36_CRF_ID = new short[1] ;
      BC00113_A37TBM36_COND_NO = new short[1] ;
      BC00113_A38TBM36_SELECT_CRF_ID = new short[1] ;
      BC00113_A590TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00113_n590TBM36_CRT_DATETIME = new boolean[] {false} ;
      BC00113_A591TBM36_CRT_USER_ID = new String[] {""} ;
      BC00113_n591TBM36_CRT_USER_ID = new boolean[] {false} ;
      BC00113_A593TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00113_n593TBM36_UPD_DATETIME = new boolean[] {false} ;
      BC00113_A594TBM36_UPD_USER_ID = new String[] {""} ;
      BC00113_n594TBM36_UPD_USER_ID = new boolean[] {false} ;
      BC00113_A596TBM36_UPD_CNT = new long[1] ;
      BC00113_n596TBM36_UPD_CNT = new boolean[] {false} ;
      BC00113_A589TBM36_DEL_FLG = new String[] {""} ;
      BC00113_n589TBM36_DEL_FLG = new boolean[] {false} ;
      BC00113_A592TBM36_CRT_PROG_NM = new String[] {""} ;
      BC00113_n592TBM36_CRT_PROG_NM = new boolean[] {false} ;
      BC00113_A595TBM36_UPD_PROG_NM = new String[] {""} ;
      BC00113_n595TBM36_UPD_PROG_NM = new boolean[] {false} ;
      sMode36 = "" ;
      BC00112_A35TBM36_STUDY_ID = new long[1] ;
      BC00112_A36TBM36_CRF_ID = new short[1] ;
      BC00112_A37TBM36_COND_NO = new short[1] ;
      BC00112_A38TBM36_SELECT_CRF_ID = new short[1] ;
      BC00112_A590TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00112_n590TBM36_CRT_DATETIME = new boolean[] {false} ;
      BC00112_A591TBM36_CRT_USER_ID = new String[] {""} ;
      BC00112_n591TBM36_CRT_USER_ID = new boolean[] {false} ;
      BC00112_A593TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00112_n593TBM36_UPD_DATETIME = new boolean[] {false} ;
      BC00112_A594TBM36_UPD_USER_ID = new String[] {""} ;
      BC00112_n594TBM36_UPD_USER_ID = new boolean[] {false} ;
      BC00112_A596TBM36_UPD_CNT = new long[1] ;
      BC00112_n596TBM36_UPD_CNT = new boolean[] {false} ;
      BC00112_A589TBM36_DEL_FLG = new String[] {""} ;
      BC00112_n589TBM36_DEL_FLG = new boolean[] {false} ;
      BC00112_A592TBM36_CRT_PROG_NM = new String[] {""} ;
      BC00112_n592TBM36_CRT_PROG_NM = new boolean[] {false} ;
      BC00112_A595TBM36_UPD_PROG_NM = new String[] {""} ;
      BC00112_n595TBM36_UPD_PROG_NM = new boolean[] {false} ;
      BC00119_A35TBM36_STUDY_ID = new long[1] ;
      BC00119_A36TBM36_CRF_ID = new short[1] ;
      BC00119_A37TBM36_COND_NO = new short[1] ;
      BC00119_A38TBM36_SELECT_CRF_ID = new short[1] ;
      BC00119_A590TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00119_n590TBM36_CRT_DATETIME = new boolean[] {false} ;
      BC00119_A591TBM36_CRT_USER_ID = new String[] {""} ;
      BC00119_n591TBM36_CRT_USER_ID = new boolean[] {false} ;
      BC00119_A593TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00119_n593TBM36_UPD_DATETIME = new boolean[] {false} ;
      BC00119_A594TBM36_UPD_USER_ID = new String[] {""} ;
      BC00119_n594TBM36_UPD_USER_ID = new boolean[] {false} ;
      BC00119_A596TBM36_UPD_CNT = new long[1] ;
      BC00119_n596TBM36_UPD_CNT = new boolean[] {false} ;
      BC00119_A589TBM36_DEL_FLG = new String[] {""} ;
      BC00119_n589TBM36_DEL_FLG = new boolean[] {false} ;
      BC00119_A592TBM36_CRT_PROG_NM = new String[] {""} ;
      BC00119_n592TBM36_CRT_PROG_NM = new boolean[] {false} ;
      BC00119_A595TBM36_UPD_PROG_NM = new String[] {""} ;
      BC00119_n595TBM36_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm36_crf_select_bc__default(),
         new Object[] {
             new Object[] {
            BC00112_A35TBM36_STUDY_ID, BC00112_A36TBM36_CRF_ID, BC00112_A37TBM36_COND_NO, BC00112_A38TBM36_SELECT_CRF_ID, BC00112_A590TBM36_CRT_DATETIME, BC00112_n590TBM36_CRT_DATETIME, BC00112_A591TBM36_CRT_USER_ID, BC00112_n591TBM36_CRT_USER_ID, BC00112_A593TBM36_UPD_DATETIME, BC00112_n593TBM36_UPD_DATETIME,
            BC00112_A594TBM36_UPD_USER_ID, BC00112_n594TBM36_UPD_USER_ID, BC00112_A596TBM36_UPD_CNT, BC00112_n596TBM36_UPD_CNT, BC00112_A589TBM36_DEL_FLG, BC00112_n589TBM36_DEL_FLG, BC00112_A592TBM36_CRT_PROG_NM, BC00112_n592TBM36_CRT_PROG_NM, BC00112_A595TBM36_UPD_PROG_NM, BC00112_n595TBM36_UPD_PROG_NM
            }
            , new Object[] {
            BC00113_A35TBM36_STUDY_ID, BC00113_A36TBM36_CRF_ID, BC00113_A37TBM36_COND_NO, BC00113_A38TBM36_SELECT_CRF_ID, BC00113_A590TBM36_CRT_DATETIME, BC00113_n590TBM36_CRT_DATETIME, BC00113_A591TBM36_CRT_USER_ID, BC00113_n591TBM36_CRT_USER_ID, BC00113_A593TBM36_UPD_DATETIME, BC00113_n593TBM36_UPD_DATETIME,
            BC00113_A594TBM36_UPD_USER_ID, BC00113_n594TBM36_UPD_USER_ID, BC00113_A596TBM36_UPD_CNT, BC00113_n596TBM36_UPD_CNT, BC00113_A589TBM36_DEL_FLG, BC00113_n589TBM36_DEL_FLG, BC00113_A592TBM36_CRT_PROG_NM, BC00113_n592TBM36_CRT_PROG_NM, BC00113_A595TBM36_UPD_PROG_NM, BC00113_n595TBM36_UPD_PROG_NM
            }
            , new Object[] {
            BC00114_A35TBM36_STUDY_ID, BC00114_A36TBM36_CRF_ID, BC00114_A37TBM36_COND_NO, BC00114_A38TBM36_SELECT_CRF_ID, BC00114_A590TBM36_CRT_DATETIME, BC00114_n590TBM36_CRT_DATETIME, BC00114_A591TBM36_CRT_USER_ID, BC00114_n591TBM36_CRT_USER_ID, BC00114_A593TBM36_UPD_DATETIME, BC00114_n593TBM36_UPD_DATETIME,
            BC00114_A594TBM36_UPD_USER_ID, BC00114_n594TBM36_UPD_USER_ID, BC00114_A596TBM36_UPD_CNT, BC00114_n596TBM36_UPD_CNT, BC00114_A589TBM36_DEL_FLG, BC00114_n589TBM36_DEL_FLG, BC00114_A592TBM36_CRT_PROG_NM, BC00114_n592TBM36_CRT_PROG_NM, BC00114_A595TBM36_UPD_PROG_NM, BC00114_n595TBM36_UPD_PROG_NM
            }
            , new Object[] {
            BC00115_A35TBM36_STUDY_ID, BC00115_A36TBM36_CRF_ID, BC00115_A37TBM36_COND_NO, BC00115_A38TBM36_SELECT_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00119_A35TBM36_STUDY_ID, BC00119_A36TBM36_CRF_ID, BC00119_A37TBM36_COND_NO, BC00119_A38TBM36_SELECT_CRF_ID, BC00119_A590TBM36_CRT_DATETIME, BC00119_n590TBM36_CRT_DATETIME, BC00119_A591TBM36_CRT_USER_ID, BC00119_n591TBM36_CRT_USER_ID, BC00119_A593TBM36_UPD_DATETIME, BC00119_n593TBM36_UPD_DATETIME,
            BC00119_A594TBM36_UPD_USER_ID, BC00119_n594TBM36_UPD_USER_ID, BC00119_A596TBM36_UPD_CNT, BC00119_n596TBM36_UPD_CNT, BC00119_A589TBM36_DEL_FLG, BC00119_n589TBM36_DEL_FLG, BC00119_A592TBM36_CRT_PROG_NM, BC00119_n592TBM36_CRT_PROG_NM, BC00119_A595TBM36_UPD_PROG_NM, BC00119_n595TBM36_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM36_CRF_SELECT_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: E112 */
      E112 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z36TBM36_CRF_ID ;
   private short A36TBM36_CRF_ID ;
   private short Z37TBM36_COND_NO ;
   private short A37TBM36_COND_NO ;
   private short Z38TBM36_SELECT_CRF_ID ;
   private short A38TBM36_SELECT_CRF_ID ;
   private short RcdFound36 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z35TBM36_STUDY_ID ;
   private long A35TBM36_STUDY_ID ;
   private long A596TBM36_UPD_CNT ;
   private long Z596TBM36_UPD_CNT ;
   private long O596TBM36_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode36 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A590TBM36_CRT_DATETIME ;
   private java.util.Date A593TBM36_UPD_DATETIME ;
   private java.util.Date Z590TBM36_CRT_DATETIME ;
   private java.util.Date Z593TBM36_UPD_DATETIME ;
   private boolean n590TBM36_CRT_DATETIME ;
   private boolean n591TBM36_CRT_USER_ID ;
   private boolean n593TBM36_UPD_DATETIME ;
   private boolean n594TBM36_UPD_USER_ID ;
   private boolean n596TBM36_UPD_CNT ;
   private boolean n589TBM36_DEL_FLG ;
   private boolean n592TBM36_CRT_PROG_NM ;
   private boolean n595TBM36_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A589TBM36_DEL_FLG ;
   private String A591TBM36_CRT_USER_ID ;
   private String A592TBM36_CRT_PROG_NM ;
   private String A594TBM36_UPD_USER_ID ;
   private String A595TBM36_UPD_PROG_NM ;
   private String Z591TBM36_CRT_USER_ID ;
   private String Z594TBM36_UPD_USER_ID ;
   private String Z589TBM36_DEL_FLG ;
   private String Z592TBM36_CRT_PROG_NM ;
   private String Z595TBM36_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM36_CRF_SELECT bcTBM36_CRF_SELECT ;
   private IDataStoreProvider pr_default ;
   private long[] BC00114_A35TBM36_STUDY_ID ;
   private short[] BC00114_A36TBM36_CRF_ID ;
   private short[] BC00114_A37TBM36_COND_NO ;
   private short[] BC00114_A38TBM36_SELECT_CRF_ID ;
   private java.util.Date[] BC00114_A590TBM36_CRT_DATETIME ;
   private boolean[] BC00114_n590TBM36_CRT_DATETIME ;
   private String[] BC00114_A591TBM36_CRT_USER_ID ;
   private boolean[] BC00114_n591TBM36_CRT_USER_ID ;
   private java.util.Date[] BC00114_A593TBM36_UPD_DATETIME ;
   private boolean[] BC00114_n593TBM36_UPD_DATETIME ;
   private String[] BC00114_A594TBM36_UPD_USER_ID ;
   private boolean[] BC00114_n594TBM36_UPD_USER_ID ;
   private long[] BC00114_A596TBM36_UPD_CNT ;
   private boolean[] BC00114_n596TBM36_UPD_CNT ;
   private String[] BC00114_A589TBM36_DEL_FLG ;
   private boolean[] BC00114_n589TBM36_DEL_FLG ;
   private String[] BC00114_A592TBM36_CRT_PROG_NM ;
   private boolean[] BC00114_n592TBM36_CRT_PROG_NM ;
   private String[] BC00114_A595TBM36_UPD_PROG_NM ;
   private boolean[] BC00114_n595TBM36_UPD_PROG_NM ;
   private long[] BC00115_A35TBM36_STUDY_ID ;
   private short[] BC00115_A36TBM36_CRF_ID ;
   private short[] BC00115_A37TBM36_COND_NO ;
   private short[] BC00115_A38TBM36_SELECT_CRF_ID ;
   private long[] BC00113_A35TBM36_STUDY_ID ;
   private short[] BC00113_A36TBM36_CRF_ID ;
   private short[] BC00113_A37TBM36_COND_NO ;
   private short[] BC00113_A38TBM36_SELECT_CRF_ID ;
   private java.util.Date[] BC00113_A590TBM36_CRT_DATETIME ;
   private boolean[] BC00113_n590TBM36_CRT_DATETIME ;
   private String[] BC00113_A591TBM36_CRT_USER_ID ;
   private boolean[] BC00113_n591TBM36_CRT_USER_ID ;
   private java.util.Date[] BC00113_A593TBM36_UPD_DATETIME ;
   private boolean[] BC00113_n593TBM36_UPD_DATETIME ;
   private String[] BC00113_A594TBM36_UPD_USER_ID ;
   private boolean[] BC00113_n594TBM36_UPD_USER_ID ;
   private long[] BC00113_A596TBM36_UPD_CNT ;
   private boolean[] BC00113_n596TBM36_UPD_CNT ;
   private String[] BC00113_A589TBM36_DEL_FLG ;
   private boolean[] BC00113_n589TBM36_DEL_FLG ;
   private String[] BC00113_A592TBM36_CRT_PROG_NM ;
   private boolean[] BC00113_n592TBM36_CRT_PROG_NM ;
   private String[] BC00113_A595TBM36_UPD_PROG_NM ;
   private boolean[] BC00113_n595TBM36_UPD_PROG_NM ;
   private long[] BC00112_A35TBM36_STUDY_ID ;
   private short[] BC00112_A36TBM36_CRF_ID ;
   private short[] BC00112_A37TBM36_COND_NO ;
   private short[] BC00112_A38TBM36_SELECT_CRF_ID ;
   private java.util.Date[] BC00112_A590TBM36_CRT_DATETIME ;
   private boolean[] BC00112_n590TBM36_CRT_DATETIME ;
   private String[] BC00112_A591TBM36_CRT_USER_ID ;
   private boolean[] BC00112_n591TBM36_CRT_USER_ID ;
   private java.util.Date[] BC00112_A593TBM36_UPD_DATETIME ;
   private boolean[] BC00112_n593TBM36_UPD_DATETIME ;
   private String[] BC00112_A594TBM36_UPD_USER_ID ;
   private boolean[] BC00112_n594TBM36_UPD_USER_ID ;
   private long[] BC00112_A596TBM36_UPD_CNT ;
   private boolean[] BC00112_n596TBM36_UPD_CNT ;
   private String[] BC00112_A589TBM36_DEL_FLG ;
   private boolean[] BC00112_n589TBM36_DEL_FLG ;
   private String[] BC00112_A592TBM36_CRT_PROG_NM ;
   private boolean[] BC00112_n592TBM36_CRT_PROG_NM ;
   private String[] BC00112_A595TBM36_UPD_PROG_NM ;
   private boolean[] BC00112_n595TBM36_UPD_PROG_NM ;
   private long[] BC00119_A35TBM36_STUDY_ID ;
   private short[] BC00119_A36TBM36_CRF_ID ;
   private short[] BC00119_A37TBM36_COND_NO ;
   private short[] BC00119_A38TBM36_SELECT_CRF_ID ;
   private java.util.Date[] BC00119_A590TBM36_CRT_DATETIME ;
   private boolean[] BC00119_n590TBM36_CRT_DATETIME ;
   private String[] BC00119_A591TBM36_CRT_USER_ID ;
   private boolean[] BC00119_n591TBM36_CRT_USER_ID ;
   private java.util.Date[] BC00119_A593TBM36_UPD_DATETIME ;
   private boolean[] BC00119_n593TBM36_UPD_DATETIME ;
   private String[] BC00119_A594TBM36_UPD_USER_ID ;
   private boolean[] BC00119_n594TBM36_UPD_USER_ID ;
   private long[] BC00119_A596TBM36_UPD_CNT ;
   private boolean[] BC00119_n596TBM36_UPD_CNT ;
   private String[] BC00119_A589TBM36_DEL_FLG ;
   private boolean[] BC00119_n589TBM36_DEL_FLG ;
   private String[] BC00119_A592TBM36_CRT_PROG_NM ;
   private boolean[] BC00119_n592TBM36_CRT_PROG_NM ;
   private String[] BC00119_A595TBM36_UPD_PROG_NM ;
   private boolean[] BC00119_n595TBM36_UPD_PROG_NM ;
}

final  class tbm36_crf_select_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00112", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00113", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00114", "SELECT TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID`, TM1.`TBM36_CRT_DATETIME`, TM1.`TBM36_CRT_USER_ID`, TM1.`TBM36_UPD_DATETIME`, TM1.`TBM36_UPD_USER_ID`, TM1.`TBM36_UPD_CNT`, TM1.`TBM36_DEL_FLG`, TM1.`TBM36_CRT_PROG_NM`, TM1.`TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` TM1 WHERE TM1.`TBM36_STUDY_ID` = ? and TM1.`TBM36_CRF_ID` = ? and TM1.`TBM36_COND_NO` = ? and TM1.`TBM36_SELECT_CRF_ID` = ? ORDER BY TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00115", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00116", "INSERT INTO `TBM36_CRF_SELECT`(`TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00117", "UPDATE `TBM36_CRF_SELECT` SET `TBM36_CRT_DATETIME`=?, `TBM36_CRT_USER_ID`=?, `TBM36_UPD_DATETIME`=?, `TBM36_UPD_USER_ID`=?, `TBM36_UPD_CNT`=?, `TBM36_DEL_FLG`=?, `TBM36_CRT_PROG_NM`=?, `TBM36_UPD_PROG_NM`=?  WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00118", "DELETE FROM `TBM36_CRF_SELECT`  WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00119", "SELECT TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID`, TM1.`TBM36_CRT_DATETIME`, TM1.`TBM36_CRT_USER_ID`, TM1.`TBM36_UPD_DATETIME`, TM1.`TBM36_UPD_USER_ID`, TM1.`TBM36_UPD_CNT`, TM1.`TBM36_DEL_FLG`, TM1.`TBM36_CRT_PROG_NM`, TM1.`TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` TM1 WHERE TM1.`TBM36_STUDY_ID` = ? and TM1.`TBM36_CRF_ID` = ? and TM1.`TBM36_COND_NO` = ? and TM1.`TBM36_SELECT_CRF_ID` = ? ORDER BY TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
                  stmt.setVarchar(10, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 40);
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
               stmt.setShort(10, ((Number) parms[17]).shortValue());
               stmt.setShort(11, ((Number) parms[18]).shortValue());
               stmt.setShort(12, ((Number) parms[19]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

