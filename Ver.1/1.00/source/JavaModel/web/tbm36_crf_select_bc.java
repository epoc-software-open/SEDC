/*
               File: tbm36_crf_select_bc
        Description: CRF選択マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:18.16
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e12112 */
         e12112 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z484TBM36_STUDY_ID = A484TBM36_STUDY_ID ;
            Z485TBM36_CRF_ID = A485TBM36_CRF_ID ;
            Z486TBM36_COND_NO = A486TBM36_COND_NO ;
            Z487TBM36_SELECT_CRF_ID = A487TBM36_SELECT_CRF_ID ;
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

   public void e11112( )
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

   public void e12112( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A485TBM36_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A486TBM36_COND_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A487TBM36_SELECT_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A488TBM36_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A489TBM36_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A490TBM36_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A491TBM36_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A492TBM36_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A493TBM36_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A494TBM36_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1165( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1136( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z489TBM36_CRT_DATETIME = A489TBM36_CRT_DATETIME ;
         Z490TBM36_CRT_USER_ID = A490TBM36_CRT_USER_ID ;
         Z492TBM36_UPD_DATETIME = A492TBM36_UPD_DATETIME ;
         Z493TBM36_UPD_USER_ID = A493TBM36_UPD_USER_ID ;
         Z495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
         Z488TBM36_DEL_FLG = A488TBM36_DEL_FLG ;
         Z491TBM36_CRT_PROG_NM = A491TBM36_CRT_PROG_NM ;
         Z494TBM36_UPD_PROG_NM = A494TBM36_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z484TBM36_STUDY_ID = A484TBM36_STUDY_ID ;
         Z485TBM36_CRF_ID = A485TBM36_CRF_ID ;
         Z486TBM36_COND_NO = A486TBM36_COND_NO ;
         Z487TBM36_SELECT_CRF_ID = A487TBM36_SELECT_CRF_ID ;
         Z489TBM36_CRT_DATETIME = A489TBM36_CRT_DATETIME ;
         Z490TBM36_CRT_USER_ID = A490TBM36_CRT_USER_ID ;
         Z492TBM36_UPD_DATETIME = A492TBM36_UPD_DATETIME ;
         Z493TBM36_UPD_USER_ID = A493TBM36_UPD_USER_ID ;
         Z495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
         Z488TBM36_DEL_FLG = A488TBM36_DEL_FLG ;
         Z491TBM36_CRT_PROG_NM = A491TBM36_CRT_PROG_NM ;
         Z494TBM36_UPD_PROG_NM = A494TBM36_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A489TBM36_CRT_DATETIME = BC00114_A489TBM36_CRT_DATETIME[0] ;
         n489TBM36_CRT_DATETIME = BC00114_n489TBM36_CRT_DATETIME[0] ;
         A490TBM36_CRT_USER_ID = BC00114_A490TBM36_CRT_USER_ID[0] ;
         n490TBM36_CRT_USER_ID = BC00114_n490TBM36_CRT_USER_ID[0] ;
         A492TBM36_UPD_DATETIME = BC00114_A492TBM36_UPD_DATETIME[0] ;
         n492TBM36_UPD_DATETIME = BC00114_n492TBM36_UPD_DATETIME[0] ;
         A493TBM36_UPD_USER_ID = BC00114_A493TBM36_UPD_USER_ID[0] ;
         n493TBM36_UPD_USER_ID = BC00114_n493TBM36_UPD_USER_ID[0] ;
         A495TBM36_UPD_CNT = BC00114_A495TBM36_UPD_CNT[0] ;
         n495TBM36_UPD_CNT = BC00114_n495TBM36_UPD_CNT[0] ;
         A488TBM36_DEL_FLG = BC00114_A488TBM36_DEL_FLG[0] ;
         n488TBM36_DEL_FLG = BC00114_n488TBM36_DEL_FLG[0] ;
         A491TBM36_CRT_PROG_NM = BC00114_A491TBM36_CRT_PROG_NM[0] ;
         n491TBM36_CRT_PROG_NM = BC00114_n491TBM36_CRT_PROG_NM[0] ;
         A494TBM36_UPD_PROG_NM = BC00114_A494TBM36_UPD_PROG_NM[0] ;
         n494TBM36_UPD_PROG_NM = BC00114_n494TBM36_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A489TBM36_CRT_DATETIME) || (( A489TBM36_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A489TBM36_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A492TBM36_UPD_DATETIME) || (( A492TBM36_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A492TBM36_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
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
      pr_default.execute(3, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
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
      pr_default.execute(1, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1136( 8) ;
         RcdFound36 = (short)(1) ;
         A484TBM36_STUDY_ID = BC00113_A484TBM36_STUDY_ID[0] ;
         A485TBM36_CRF_ID = BC00113_A485TBM36_CRF_ID[0] ;
         A486TBM36_COND_NO = BC00113_A486TBM36_COND_NO[0] ;
         A487TBM36_SELECT_CRF_ID = BC00113_A487TBM36_SELECT_CRF_ID[0] ;
         A489TBM36_CRT_DATETIME = BC00113_A489TBM36_CRT_DATETIME[0] ;
         n489TBM36_CRT_DATETIME = BC00113_n489TBM36_CRT_DATETIME[0] ;
         A490TBM36_CRT_USER_ID = BC00113_A490TBM36_CRT_USER_ID[0] ;
         n490TBM36_CRT_USER_ID = BC00113_n490TBM36_CRT_USER_ID[0] ;
         A492TBM36_UPD_DATETIME = BC00113_A492TBM36_UPD_DATETIME[0] ;
         n492TBM36_UPD_DATETIME = BC00113_n492TBM36_UPD_DATETIME[0] ;
         A493TBM36_UPD_USER_ID = BC00113_A493TBM36_UPD_USER_ID[0] ;
         n493TBM36_UPD_USER_ID = BC00113_n493TBM36_UPD_USER_ID[0] ;
         A495TBM36_UPD_CNT = BC00113_A495TBM36_UPD_CNT[0] ;
         n495TBM36_UPD_CNT = BC00113_n495TBM36_UPD_CNT[0] ;
         A488TBM36_DEL_FLG = BC00113_A488TBM36_DEL_FLG[0] ;
         n488TBM36_DEL_FLG = BC00113_n488TBM36_DEL_FLG[0] ;
         A491TBM36_CRT_PROG_NM = BC00113_A491TBM36_CRT_PROG_NM[0] ;
         n491TBM36_CRT_PROG_NM = BC00113_n491TBM36_CRT_PROG_NM[0] ;
         A494TBM36_UPD_PROG_NM = BC00113_A494TBM36_UPD_PROG_NM[0] ;
         n494TBM36_UPD_PROG_NM = BC00113_n494TBM36_UPD_PROG_NM[0] ;
         O495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
         n495TBM36_UPD_CNT = false ;
         Z484TBM36_STUDY_ID = A484TBM36_STUDY_ID ;
         Z485TBM36_CRF_ID = A485TBM36_CRF_ID ;
         Z486TBM36_COND_NO = A486TBM36_COND_NO ;
         Z487TBM36_SELECT_CRF_ID = A487TBM36_SELECT_CRF_ID ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1136( ) ;
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
         pr_default.execute(0, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM36_CRF_SELECT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z489TBM36_CRT_DATETIME.equals( BC00112_A489TBM36_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z490TBM36_CRT_USER_ID, BC00112_A490TBM36_CRT_USER_ID[0]) != 0 ) || !( Z492TBM36_UPD_DATETIME.equals( BC00112_A492TBM36_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z493TBM36_UPD_USER_ID, BC00112_A493TBM36_UPD_USER_ID[0]) != 0 ) || ( Z495TBM36_UPD_CNT != BC00112_A495TBM36_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z488TBM36_DEL_FLG, BC00112_A488TBM36_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z491TBM36_CRT_PROG_NM, BC00112_A491TBM36_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z494TBM36_UPD_PROG_NM, BC00112_A494TBM36_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(4, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID), new Boolean(n489TBM36_CRT_DATETIME), A489TBM36_CRT_DATETIME, new Boolean(n490TBM36_CRT_USER_ID), A490TBM36_CRT_USER_ID, new Boolean(n492TBM36_UPD_DATETIME), A492TBM36_UPD_DATETIME, new Boolean(n493TBM36_UPD_USER_ID), A493TBM36_UPD_USER_ID, new Boolean(n495TBM36_UPD_CNT), new Long(A495TBM36_UPD_CNT), new Boolean(n488TBM36_DEL_FLG), A488TBM36_DEL_FLG, new Boolean(n491TBM36_CRT_PROG_NM), A491TBM36_CRT_PROG_NM, new Boolean(n494TBM36_UPD_PROG_NM), A494TBM36_UPD_PROG_NM});
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
                  pr_default.execute(5, new Object[] {new Boolean(n489TBM36_CRT_DATETIME), A489TBM36_CRT_DATETIME, new Boolean(n490TBM36_CRT_USER_ID), A490TBM36_CRT_USER_ID, new Boolean(n492TBM36_UPD_DATETIME), A492TBM36_UPD_DATETIME, new Boolean(n493TBM36_UPD_USER_ID), A493TBM36_UPD_USER_ID, new Boolean(n495TBM36_UPD_CNT), new Long(A495TBM36_UPD_CNT), new Boolean(n488TBM36_DEL_FLG), A488TBM36_DEL_FLG, new Boolean(n491TBM36_CRT_PROG_NM), A491TBM36_CRT_PROG_NM, new Boolean(n494TBM36_UPD_PROG_NM), A494TBM36_UPD_PROG_NM, new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
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
               pr_default.execute(6, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
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
      /* Using cursor BC00119 */
      pr_default.execute(7, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A484TBM36_STUDY_ID = BC00119_A484TBM36_STUDY_ID[0] ;
         A485TBM36_CRF_ID = BC00119_A485TBM36_CRF_ID[0] ;
         A486TBM36_COND_NO = BC00119_A486TBM36_COND_NO[0] ;
         A487TBM36_SELECT_CRF_ID = BC00119_A487TBM36_SELECT_CRF_ID[0] ;
         A489TBM36_CRT_DATETIME = BC00119_A489TBM36_CRT_DATETIME[0] ;
         n489TBM36_CRT_DATETIME = BC00119_n489TBM36_CRT_DATETIME[0] ;
         A490TBM36_CRT_USER_ID = BC00119_A490TBM36_CRT_USER_ID[0] ;
         n490TBM36_CRT_USER_ID = BC00119_n490TBM36_CRT_USER_ID[0] ;
         A492TBM36_UPD_DATETIME = BC00119_A492TBM36_UPD_DATETIME[0] ;
         n492TBM36_UPD_DATETIME = BC00119_n492TBM36_UPD_DATETIME[0] ;
         A493TBM36_UPD_USER_ID = BC00119_A493TBM36_UPD_USER_ID[0] ;
         n493TBM36_UPD_USER_ID = BC00119_n493TBM36_UPD_USER_ID[0] ;
         A495TBM36_UPD_CNT = BC00119_A495TBM36_UPD_CNT[0] ;
         n495TBM36_UPD_CNT = BC00119_n495TBM36_UPD_CNT[0] ;
         A488TBM36_DEL_FLG = BC00119_A488TBM36_DEL_FLG[0] ;
         n488TBM36_DEL_FLG = BC00119_n488TBM36_DEL_FLG[0] ;
         A491TBM36_CRT_PROG_NM = BC00119_A491TBM36_CRT_PROG_NM[0] ;
         n491TBM36_CRT_PROG_NM = BC00119_n491TBM36_CRT_PROG_NM[0] ;
         A494TBM36_UPD_PROG_NM = BC00119_A494TBM36_UPD_PROG_NM[0] ;
         n494TBM36_UPD_PROG_NM = BC00119_n494TBM36_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1136( )
   {
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
         A484TBM36_STUDY_ID = BC00119_A484TBM36_STUDY_ID[0] ;
         A485TBM36_CRF_ID = BC00119_A485TBM36_CRF_ID[0] ;
         A486TBM36_COND_NO = BC00119_A486TBM36_COND_NO[0] ;
         A487TBM36_SELECT_CRF_ID = BC00119_A487TBM36_SELECT_CRF_ID[0] ;
         A489TBM36_CRT_DATETIME = BC00119_A489TBM36_CRT_DATETIME[0] ;
         n489TBM36_CRT_DATETIME = BC00119_n489TBM36_CRT_DATETIME[0] ;
         A490TBM36_CRT_USER_ID = BC00119_A490TBM36_CRT_USER_ID[0] ;
         n490TBM36_CRT_USER_ID = BC00119_n490TBM36_CRT_USER_ID[0] ;
         A492TBM36_UPD_DATETIME = BC00119_A492TBM36_UPD_DATETIME[0] ;
         n492TBM36_UPD_DATETIME = BC00119_n492TBM36_UPD_DATETIME[0] ;
         A493TBM36_UPD_USER_ID = BC00119_A493TBM36_UPD_USER_ID[0] ;
         n493TBM36_UPD_USER_ID = BC00119_n493TBM36_UPD_USER_ID[0] ;
         A495TBM36_UPD_CNT = BC00119_A495TBM36_UPD_CNT[0] ;
         n495TBM36_UPD_CNT = BC00119_n495TBM36_UPD_CNT[0] ;
         A488TBM36_DEL_FLG = BC00119_A488TBM36_DEL_FLG[0] ;
         n488TBM36_DEL_FLG = BC00119_n488TBM36_DEL_FLG[0] ;
         A491TBM36_CRT_PROG_NM = BC00119_A491TBM36_CRT_PROG_NM[0] ;
         n491TBM36_CRT_PROG_NM = BC00119_n491TBM36_CRT_PROG_NM[0] ;
         A494TBM36_UPD_PROG_NM = BC00119_A494TBM36_UPD_PROG_NM[0] ;
         n494TBM36_UPD_PROG_NM = BC00119_n494TBM36_UPD_PROG_NM[0] ;
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
      A489TBM36_CRT_DATETIME = GXutil.now( ) ;
      n489TBM36_CRT_DATETIME = false ;
      GXt_char1 = A490TBM36_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      A490TBM36_CRT_USER_ID = GXt_char1 ;
      n490TBM36_CRT_USER_ID = false ;
      A492TBM36_UPD_DATETIME = GXutil.now( ) ;
      n492TBM36_UPD_DATETIME = false ;
      GXt_char1 = A493TBM36_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      A493TBM36_UPD_USER_ID = GXt_char1 ;
      n493TBM36_UPD_USER_ID = false ;
      A495TBM36_UPD_CNT = (long)(O495TBM36_UPD_CNT+1) ;
      n495TBM36_UPD_CNT = false ;
   }

   public void beforeUpdate1136( )
   {
      /* Before Update Rules */
      A492TBM36_UPD_DATETIME = GXutil.now( ) ;
      n492TBM36_UPD_DATETIME = false ;
      GXt_char1 = A493TBM36_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm36_crf_select_bc.this.GXt_char1 = GXv_char2[0] ;
      A493TBM36_UPD_USER_ID = GXt_char1 ;
      n493TBM36_UPD_USER_ID = false ;
      A495TBM36_UPD_CNT = (long)(O495TBM36_UPD_CNT+1) ;
      n495TBM36_UPD_CNT = false ;
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
      A489TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n489TBM36_CRT_DATETIME = false ;
      A490TBM36_CRT_USER_ID = "" ;
      n490TBM36_CRT_USER_ID = false ;
      A492TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n492TBM36_UPD_DATETIME = false ;
      A493TBM36_UPD_USER_ID = "" ;
      n493TBM36_UPD_USER_ID = false ;
      A495TBM36_UPD_CNT = 0 ;
      n495TBM36_UPD_CNT = false ;
      A488TBM36_DEL_FLG = "" ;
      n488TBM36_DEL_FLG = false ;
      A491TBM36_CRT_PROG_NM = "" ;
      n491TBM36_CRT_PROG_NM = false ;
      A494TBM36_UPD_PROG_NM = "" ;
      n494TBM36_UPD_PROG_NM = false ;
      O495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
      n495TBM36_UPD_CNT = false ;
   }

   public void initAll1136( )
   {
      A484TBM36_STUDY_ID = 0 ;
      A485TBM36_CRF_ID = (short)(0) ;
      A486TBM36_COND_NO = (short)(0) ;
      A487TBM36_SELECT_CRF_ID = (short)(0) ;
      initializeNonKey1136( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow36( SdtTBM36_CRF_SELECT obj36 )
   {
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Mode( Gx_mode );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime( A489TBM36_CRT_DATETIME );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id( A490TBM36_CRT_USER_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime( A492TBM36_UPD_DATETIME );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id( A493TBM36_UPD_USER_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt( A495TBM36_UPD_CNT );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg( A488TBM36_DEL_FLG );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm( A491TBM36_CRT_PROG_NM );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm( A494TBM36_UPD_PROG_NM );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id( A484TBM36_STUDY_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id( A485TBM36_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no( A486TBM36_COND_NO );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id( A487TBM36_SELECT_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id_Z( Z484TBM36_STUDY_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id_Z( Z485TBM36_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no_Z( Z486TBM36_COND_NO );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id_Z( Z487TBM36_SELECT_CRF_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z( Z488TBM36_DEL_FLG );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z( Z489TBM36_CRT_DATETIME );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z( Z490TBM36_CRT_USER_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z( Z491TBM36_CRT_PROG_NM );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z( Z492TBM36_UPD_DATETIME );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z( Z493TBM36_UPD_USER_ID );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z( Z494TBM36_UPD_PROG_NM );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z( Z495TBM36_UPD_CNT );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_N( (byte)((byte)((n488TBM36_DEL_FLG)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_N( (byte)((byte)((n489TBM36_CRT_DATETIME)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_N( (byte)((byte)((n490TBM36_CRT_USER_ID)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_N( (byte)((byte)((n491TBM36_CRT_PROG_NM)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_N( (byte)((byte)((n492TBM36_UPD_DATETIME)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_N( (byte)((byte)((n493TBM36_UPD_USER_ID)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_N( (byte)((byte)((n494TBM36_UPD_PROG_NM)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_N( (byte)((byte)((n495TBM36_UPD_CNT)?1:0)) );
      obj36.setgxTv_SdtTBM36_CRF_SELECT_Mode( Gx_mode );
   }

   public void RowToVars36( SdtTBM36_CRF_SELECT obj36 ,
                            int forceLoad )
   {
      Gx_mode = obj36.getgxTv_SdtTBM36_CRF_SELECT_Mode() ;
      A489TBM36_CRT_DATETIME = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime() ;
      n489TBM36_CRT_DATETIME = false ;
      A490TBM36_CRT_USER_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id() ;
      n490TBM36_CRT_USER_ID = false ;
      A492TBM36_UPD_DATETIME = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime() ;
      n492TBM36_UPD_DATETIME = false ;
      A493TBM36_UPD_USER_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id() ;
      n493TBM36_UPD_USER_ID = false ;
      A495TBM36_UPD_CNT = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt() ;
      n495TBM36_UPD_CNT = false ;
      A488TBM36_DEL_FLG = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg() ;
      n488TBM36_DEL_FLG = false ;
      A491TBM36_CRT_PROG_NM = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm() ;
      n491TBM36_CRT_PROG_NM = false ;
      A494TBM36_UPD_PROG_NM = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm() ;
      n494TBM36_UPD_PROG_NM = false ;
      A484TBM36_STUDY_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id() ;
      A485TBM36_CRF_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id() ;
      A486TBM36_COND_NO = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no() ;
      A487TBM36_SELECT_CRF_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id() ;
      Z484TBM36_STUDY_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id_Z() ;
      Z485TBM36_CRF_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id_Z() ;
      Z486TBM36_COND_NO = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no_Z() ;
      Z487TBM36_SELECT_CRF_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id_Z() ;
      Z488TBM36_DEL_FLG = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z() ;
      Z489TBM36_CRT_DATETIME = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z() ;
      Z490TBM36_CRT_USER_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z() ;
      Z491TBM36_CRT_PROG_NM = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z() ;
      Z492TBM36_UPD_DATETIME = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z() ;
      Z493TBM36_UPD_USER_ID = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z() ;
      Z494TBM36_UPD_PROG_NM = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z() ;
      Z495TBM36_UPD_CNT = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z() ;
      O495TBM36_UPD_CNT = obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z() ;
      n488TBM36_DEL_FLG = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_N()==0)?false:true) ;
      n489TBM36_CRT_DATETIME = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_N()==0)?false:true) ;
      n490TBM36_CRT_USER_ID = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_N()==0)?false:true) ;
      n491TBM36_CRT_PROG_NM = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_N()==0)?false:true) ;
      n492TBM36_UPD_DATETIME = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_N()==0)?false:true) ;
      n493TBM36_UPD_USER_ID = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_N()==0)?false:true) ;
      n494TBM36_UPD_PROG_NM = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_N()==0)?false:true) ;
      n495TBM36_UPD_CNT = (boolean)((obj36.getgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj36.getgxTv_SdtTBM36_CRF_SELECT_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A484TBM36_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A485TBM36_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A486TBM36_COND_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A487TBM36_SELECT_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
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
         Z484TBM36_STUDY_ID = A484TBM36_STUDY_ID ;
         Z485TBM36_CRF_ID = A485TBM36_CRF_ID ;
         Z486TBM36_COND_NO = A486TBM36_COND_NO ;
         Z487TBM36_SELECT_CRF_ID = A487TBM36_SELECT_CRF_ID ;
         O495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
         n495TBM36_UPD_CNT = false ;
      }
      zm1136( -8) ;
      sMode36 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1136( ) ;
      Gx_mode = sMode36 ;
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
      if ( RcdFound36 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A484TBM36_STUDY_ID != Z484TBM36_STUDY_ID ) || ( A485TBM36_CRF_ID != Z485TBM36_CRF_ID ) || ( A486TBM36_COND_NO != Z486TBM36_COND_NO ) || ( A487TBM36_SELECT_CRF_ID != Z487TBM36_SELECT_CRF_ID ) )
         {
            A484TBM36_STUDY_ID = Z484TBM36_STUDY_ID ;
            A485TBM36_CRF_ID = Z485TBM36_CRF_ID ;
            A486TBM36_COND_NO = Z486TBM36_COND_NO ;
            A487TBM36_SELECT_CRF_ID = Z487TBM36_SELECT_CRF_ID ;
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
            if ( ( A484TBM36_STUDY_ID != Z484TBM36_STUDY_ID ) || ( A485TBM36_CRF_ID != Z485TBM36_CRF_ID ) || ( A486TBM36_COND_NO != Z486TBM36_COND_NO ) || ( A487TBM36_SELECT_CRF_ID != Z487TBM36_SELECT_CRF_ID ) )
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
         else if ( ( A484TBM36_STUDY_ID != Z484TBM36_STUDY_ID ) || ( A485TBM36_CRF_ID != Z485TBM36_CRF_ID ) || ( A486TBM36_COND_NO != Z486TBM36_COND_NO ) || ( A487TBM36_SELECT_CRF_ID != Z487TBM36_SELECT_CRF_ID ) )
         {
            A484TBM36_STUDY_ID = Z484TBM36_STUDY_ID ;
            A485TBM36_CRF_ID = Z485TBM36_CRF_ID ;
            A486TBM36_COND_NO = Z486TBM36_COND_NO ;
            A487TBM36_SELECT_CRF_ID = Z487TBM36_SELECT_CRF_ID ;
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
         if ( ( A484TBM36_STUDY_ID != Z484TBM36_STUDY_ID ) || ( A485TBM36_CRF_ID != Z485TBM36_CRF_ID ) || ( A486TBM36_COND_NO != Z486TBM36_COND_NO ) || ( A487TBM36_SELECT_CRF_ID != Z487TBM36_SELECT_CRF_ID ) )
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
                  /* Execute user subroutine: S1165 */
                  S1165 ();
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
      A488TBM36_DEL_FLG = "" ;
      A489TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A490TBM36_CRT_USER_ID = "" ;
      A491TBM36_CRT_PROG_NM = "" ;
      A492TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A493TBM36_UPD_USER_ID = "" ;
      A494TBM36_UPD_PROG_NM = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z = "" ;
      Z489TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z490TBM36_CRT_USER_ID = "" ;
      Z492TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z493TBM36_UPD_USER_ID = "" ;
      Z488TBM36_DEL_FLG = "" ;
      Z491TBM36_CRT_PROG_NM = "" ;
      Z494TBM36_UPD_PROG_NM = "" ;
      BC00114_A484TBM36_STUDY_ID = new long[1] ;
      BC00114_A485TBM36_CRF_ID = new short[1] ;
      BC00114_A486TBM36_COND_NO = new short[1] ;
      BC00114_A487TBM36_SELECT_CRF_ID = new short[1] ;
      BC00114_A489TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00114_n489TBM36_CRT_DATETIME = new boolean[] {false} ;
      BC00114_A490TBM36_CRT_USER_ID = new String[] {""} ;
      BC00114_n490TBM36_CRT_USER_ID = new boolean[] {false} ;
      BC00114_A492TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00114_n492TBM36_UPD_DATETIME = new boolean[] {false} ;
      BC00114_A493TBM36_UPD_USER_ID = new String[] {""} ;
      BC00114_n493TBM36_UPD_USER_ID = new boolean[] {false} ;
      BC00114_A495TBM36_UPD_CNT = new long[1] ;
      BC00114_n495TBM36_UPD_CNT = new boolean[] {false} ;
      BC00114_A488TBM36_DEL_FLG = new String[] {""} ;
      BC00114_n488TBM36_DEL_FLG = new boolean[] {false} ;
      BC00114_A491TBM36_CRT_PROG_NM = new String[] {""} ;
      BC00114_n491TBM36_CRT_PROG_NM = new boolean[] {false} ;
      BC00114_A494TBM36_UPD_PROG_NM = new String[] {""} ;
      BC00114_n494TBM36_UPD_PROG_NM = new boolean[] {false} ;
      BC00115_A484TBM36_STUDY_ID = new long[1] ;
      BC00115_A485TBM36_CRF_ID = new short[1] ;
      BC00115_A486TBM36_COND_NO = new short[1] ;
      BC00115_A487TBM36_SELECT_CRF_ID = new short[1] ;
      BC00113_A484TBM36_STUDY_ID = new long[1] ;
      BC00113_A485TBM36_CRF_ID = new short[1] ;
      BC00113_A486TBM36_COND_NO = new short[1] ;
      BC00113_A487TBM36_SELECT_CRF_ID = new short[1] ;
      BC00113_A489TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00113_n489TBM36_CRT_DATETIME = new boolean[] {false} ;
      BC00113_A490TBM36_CRT_USER_ID = new String[] {""} ;
      BC00113_n490TBM36_CRT_USER_ID = new boolean[] {false} ;
      BC00113_A492TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00113_n492TBM36_UPD_DATETIME = new boolean[] {false} ;
      BC00113_A493TBM36_UPD_USER_ID = new String[] {""} ;
      BC00113_n493TBM36_UPD_USER_ID = new boolean[] {false} ;
      BC00113_A495TBM36_UPD_CNT = new long[1] ;
      BC00113_n495TBM36_UPD_CNT = new boolean[] {false} ;
      BC00113_A488TBM36_DEL_FLG = new String[] {""} ;
      BC00113_n488TBM36_DEL_FLG = new boolean[] {false} ;
      BC00113_A491TBM36_CRT_PROG_NM = new String[] {""} ;
      BC00113_n491TBM36_CRT_PROG_NM = new boolean[] {false} ;
      BC00113_A494TBM36_UPD_PROG_NM = new String[] {""} ;
      BC00113_n494TBM36_UPD_PROG_NM = new boolean[] {false} ;
      sMode36 = "" ;
      BC00112_A484TBM36_STUDY_ID = new long[1] ;
      BC00112_A485TBM36_CRF_ID = new short[1] ;
      BC00112_A486TBM36_COND_NO = new short[1] ;
      BC00112_A487TBM36_SELECT_CRF_ID = new short[1] ;
      BC00112_A489TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00112_n489TBM36_CRT_DATETIME = new boolean[] {false} ;
      BC00112_A490TBM36_CRT_USER_ID = new String[] {""} ;
      BC00112_n490TBM36_CRT_USER_ID = new boolean[] {false} ;
      BC00112_A492TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00112_n492TBM36_UPD_DATETIME = new boolean[] {false} ;
      BC00112_A493TBM36_UPD_USER_ID = new String[] {""} ;
      BC00112_n493TBM36_UPD_USER_ID = new boolean[] {false} ;
      BC00112_A495TBM36_UPD_CNT = new long[1] ;
      BC00112_n495TBM36_UPD_CNT = new boolean[] {false} ;
      BC00112_A488TBM36_DEL_FLG = new String[] {""} ;
      BC00112_n488TBM36_DEL_FLG = new boolean[] {false} ;
      BC00112_A491TBM36_CRT_PROG_NM = new String[] {""} ;
      BC00112_n491TBM36_CRT_PROG_NM = new boolean[] {false} ;
      BC00112_A494TBM36_UPD_PROG_NM = new String[] {""} ;
      BC00112_n494TBM36_UPD_PROG_NM = new boolean[] {false} ;
      BC00119_A484TBM36_STUDY_ID = new long[1] ;
      BC00119_A485TBM36_CRF_ID = new short[1] ;
      BC00119_A486TBM36_COND_NO = new short[1] ;
      BC00119_A487TBM36_SELECT_CRF_ID = new short[1] ;
      BC00119_A489TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00119_n489TBM36_CRT_DATETIME = new boolean[] {false} ;
      BC00119_A490TBM36_CRT_USER_ID = new String[] {""} ;
      BC00119_n490TBM36_CRT_USER_ID = new boolean[] {false} ;
      BC00119_A492TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00119_n492TBM36_UPD_DATETIME = new boolean[] {false} ;
      BC00119_A493TBM36_UPD_USER_ID = new String[] {""} ;
      BC00119_n493TBM36_UPD_USER_ID = new boolean[] {false} ;
      BC00119_A495TBM36_UPD_CNT = new long[1] ;
      BC00119_n495TBM36_UPD_CNT = new boolean[] {false} ;
      BC00119_A488TBM36_DEL_FLG = new String[] {""} ;
      BC00119_n488TBM36_DEL_FLG = new boolean[] {false} ;
      BC00119_A491TBM36_CRT_PROG_NM = new String[] {""} ;
      BC00119_n491TBM36_CRT_PROG_NM = new boolean[] {false} ;
      BC00119_A494TBM36_UPD_PROG_NM = new String[] {""} ;
      BC00119_n494TBM36_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm36_crf_select_bc__default(),
         new Object[] {
             new Object[] {
            BC00112_A484TBM36_STUDY_ID, BC00112_A485TBM36_CRF_ID, BC00112_A486TBM36_COND_NO, BC00112_A487TBM36_SELECT_CRF_ID, BC00112_A489TBM36_CRT_DATETIME, BC00112_n489TBM36_CRT_DATETIME, BC00112_A490TBM36_CRT_USER_ID, BC00112_n490TBM36_CRT_USER_ID, BC00112_A492TBM36_UPD_DATETIME, BC00112_n492TBM36_UPD_DATETIME,
            BC00112_A493TBM36_UPD_USER_ID, BC00112_n493TBM36_UPD_USER_ID, BC00112_A495TBM36_UPD_CNT, BC00112_n495TBM36_UPD_CNT, BC00112_A488TBM36_DEL_FLG, BC00112_n488TBM36_DEL_FLG, BC00112_A491TBM36_CRT_PROG_NM, BC00112_n491TBM36_CRT_PROG_NM, BC00112_A494TBM36_UPD_PROG_NM, BC00112_n494TBM36_UPD_PROG_NM
            }
            , new Object[] {
            BC00113_A484TBM36_STUDY_ID, BC00113_A485TBM36_CRF_ID, BC00113_A486TBM36_COND_NO, BC00113_A487TBM36_SELECT_CRF_ID, BC00113_A489TBM36_CRT_DATETIME, BC00113_n489TBM36_CRT_DATETIME, BC00113_A490TBM36_CRT_USER_ID, BC00113_n490TBM36_CRT_USER_ID, BC00113_A492TBM36_UPD_DATETIME, BC00113_n492TBM36_UPD_DATETIME,
            BC00113_A493TBM36_UPD_USER_ID, BC00113_n493TBM36_UPD_USER_ID, BC00113_A495TBM36_UPD_CNT, BC00113_n495TBM36_UPD_CNT, BC00113_A488TBM36_DEL_FLG, BC00113_n488TBM36_DEL_FLG, BC00113_A491TBM36_CRT_PROG_NM, BC00113_n491TBM36_CRT_PROG_NM, BC00113_A494TBM36_UPD_PROG_NM, BC00113_n494TBM36_UPD_PROG_NM
            }
            , new Object[] {
            BC00114_A484TBM36_STUDY_ID, BC00114_A485TBM36_CRF_ID, BC00114_A486TBM36_COND_NO, BC00114_A487TBM36_SELECT_CRF_ID, BC00114_A489TBM36_CRT_DATETIME, BC00114_n489TBM36_CRT_DATETIME, BC00114_A490TBM36_CRT_USER_ID, BC00114_n490TBM36_CRT_USER_ID, BC00114_A492TBM36_UPD_DATETIME, BC00114_n492TBM36_UPD_DATETIME,
            BC00114_A493TBM36_UPD_USER_ID, BC00114_n493TBM36_UPD_USER_ID, BC00114_A495TBM36_UPD_CNT, BC00114_n495TBM36_UPD_CNT, BC00114_A488TBM36_DEL_FLG, BC00114_n488TBM36_DEL_FLG, BC00114_A491TBM36_CRT_PROG_NM, BC00114_n491TBM36_CRT_PROG_NM, BC00114_A494TBM36_UPD_PROG_NM, BC00114_n494TBM36_UPD_PROG_NM
            }
            , new Object[] {
            BC00115_A484TBM36_STUDY_ID, BC00115_A485TBM36_CRF_ID, BC00115_A486TBM36_COND_NO, BC00115_A487TBM36_SELECT_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00119_A484TBM36_STUDY_ID, BC00119_A485TBM36_CRF_ID, BC00119_A486TBM36_COND_NO, BC00119_A487TBM36_SELECT_CRF_ID, BC00119_A489TBM36_CRT_DATETIME, BC00119_n489TBM36_CRT_DATETIME, BC00119_A490TBM36_CRT_USER_ID, BC00119_n490TBM36_CRT_USER_ID, BC00119_A492TBM36_UPD_DATETIME, BC00119_n492TBM36_UPD_DATETIME,
            BC00119_A493TBM36_UPD_USER_ID, BC00119_n493TBM36_UPD_USER_ID, BC00119_A495TBM36_UPD_CNT, BC00119_n495TBM36_UPD_CNT, BC00119_A488TBM36_DEL_FLG, BC00119_n488TBM36_DEL_FLG, BC00119_A491TBM36_CRT_PROG_NM, BC00119_n491TBM36_CRT_PROG_NM, BC00119_A494TBM36_UPD_PROG_NM, BC00119_n494TBM36_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM36_CRF_SELECT_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11112 */
      e11112 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_N ;
   private byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_N ;
   private byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_N ;
   private byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_N ;
   private byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_N ;
   private byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_N ;
   private byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_N ;
   private byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z485TBM36_CRF_ID ;
   private short A485TBM36_CRF_ID ;
   private short Z486TBM36_COND_NO ;
   private short A486TBM36_COND_NO ;
   private short Z487TBM36_SELECT_CRF_ID ;
   private short A487TBM36_SELECT_CRF_ID ;
   private short gxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id_Z ;
   private short gxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no_Z ;
   private short gxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id_Z ;
   private short RcdFound36 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z484TBM36_STUDY_ID ;
   private long A484TBM36_STUDY_ID ;
   private long A495TBM36_UPD_CNT ;
   private long gxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id_Z ;
   private long gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z ;
   private long Z495TBM36_UPD_CNT ;
   private long O495TBM36_UPD_CNT ;
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
   private java.util.Date A489TBM36_CRT_DATETIME ;
   private java.util.Date A492TBM36_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z ;
   private java.util.Date Z489TBM36_CRT_DATETIME ;
   private java.util.Date Z492TBM36_UPD_DATETIME ;
   private boolean n489TBM36_CRT_DATETIME ;
   private boolean n490TBM36_CRT_USER_ID ;
   private boolean n492TBM36_UPD_DATETIME ;
   private boolean n493TBM36_UPD_USER_ID ;
   private boolean n495TBM36_UPD_CNT ;
   private boolean n488TBM36_DEL_FLG ;
   private boolean n491TBM36_CRT_PROG_NM ;
   private boolean n494TBM36_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A488TBM36_DEL_FLG ;
   private String A490TBM36_CRT_USER_ID ;
   private String A491TBM36_CRT_PROG_NM ;
   private String A493TBM36_UPD_USER_ID ;
   private String A494TBM36_UPD_PROG_NM ;
   private String gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z ;
   private String gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z ;
   private String gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z ;
   private String gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z ;
   private String gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z ;
   private String Z490TBM36_CRT_USER_ID ;
   private String Z493TBM36_UPD_USER_ID ;
   private String Z488TBM36_DEL_FLG ;
   private String Z491TBM36_CRT_PROG_NM ;
   private String Z494TBM36_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM36_CRF_SELECT bcTBM36_CRF_SELECT ;
   private IDataStoreProvider pr_default ;
   private long[] BC00114_A484TBM36_STUDY_ID ;
   private short[] BC00114_A485TBM36_CRF_ID ;
   private short[] BC00114_A486TBM36_COND_NO ;
   private short[] BC00114_A487TBM36_SELECT_CRF_ID ;
   private java.util.Date[] BC00114_A489TBM36_CRT_DATETIME ;
   private boolean[] BC00114_n489TBM36_CRT_DATETIME ;
   private String[] BC00114_A490TBM36_CRT_USER_ID ;
   private boolean[] BC00114_n490TBM36_CRT_USER_ID ;
   private java.util.Date[] BC00114_A492TBM36_UPD_DATETIME ;
   private boolean[] BC00114_n492TBM36_UPD_DATETIME ;
   private String[] BC00114_A493TBM36_UPD_USER_ID ;
   private boolean[] BC00114_n493TBM36_UPD_USER_ID ;
   private long[] BC00114_A495TBM36_UPD_CNT ;
   private boolean[] BC00114_n495TBM36_UPD_CNT ;
   private String[] BC00114_A488TBM36_DEL_FLG ;
   private boolean[] BC00114_n488TBM36_DEL_FLG ;
   private String[] BC00114_A491TBM36_CRT_PROG_NM ;
   private boolean[] BC00114_n491TBM36_CRT_PROG_NM ;
   private String[] BC00114_A494TBM36_UPD_PROG_NM ;
   private boolean[] BC00114_n494TBM36_UPD_PROG_NM ;
   private long[] BC00115_A484TBM36_STUDY_ID ;
   private short[] BC00115_A485TBM36_CRF_ID ;
   private short[] BC00115_A486TBM36_COND_NO ;
   private short[] BC00115_A487TBM36_SELECT_CRF_ID ;
   private long[] BC00113_A484TBM36_STUDY_ID ;
   private short[] BC00113_A485TBM36_CRF_ID ;
   private short[] BC00113_A486TBM36_COND_NO ;
   private short[] BC00113_A487TBM36_SELECT_CRF_ID ;
   private java.util.Date[] BC00113_A489TBM36_CRT_DATETIME ;
   private boolean[] BC00113_n489TBM36_CRT_DATETIME ;
   private String[] BC00113_A490TBM36_CRT_USER_ID ;
   private boolean[] BC00113_n490TBM36_CRT_USER_ID ;
   private java.util.Date[] BC00113_A492TBM36_UPD_DATETIME ;
   private boolean[] BC00113_n492TBM36_UPD_DATETIME ;
   private String[] BC00113_A493TBM36_UPD_USER_ID ;
   private boolean[] BC00113_n493TBM36_UPD_USER_ID ;
   private long[] BC00113_A495TBM36_UPD_CNT ;
   private boolean[] BC00113_n495TBM36_UPD_CNT ;
   private String[] BC00113_A488TBM36_DEL_FLG ;
   private boolean[] BC00113_n488TBM36_DEL_FLG ;
   private String[] BC00113_A491TBM36_CRT_PROG_NM ;
   private boolean[] BC00113_n491TBM36_CRT_PROG_NM ;
   private String[] BC00113_A494TBM36_UPD_PROG_NM ;
   private boolean[] BC00113_n494TBM36_UPD_PROG_NM ;
   private long[] BC00112_A484TBM36_STUDY_ID ;
   private short[] BC00112_A485TBM36_CRF_ID ;
   private short[] BC00112_A486TBM36_COND_NO ;
   private short[] BC00112_A487TBM36_SELECT_CRF_ID ;
   private java.util.Date[] BC00112_A489TBM36_CRT_DATETIME ;
   private boolean[] BC00112_n489TBM36_CRT_DATETIME ;
   private String[] BC00112_A490TBM36_CRT_USER_ID ;
   private boolean[] BC00112_n490TBM36_CRT_USER_ID ;
   private java.util.Date[] BC00112_A492TBM36_UPD_DATETIME ;
   private boolean[] BC00112_n492TBM36_UPD_DATETIME ;
   private String[] BC00112_A493TBM36_UPD_USER_ID ;
   private boolean[] BC00112_n493TBM36_UPD_USER_ID ;
   private long[] BC00112_A495TBM36_UPD_CNT ;
   private boolean[] BC00112_n495TBM36_UPD_CNT ;
   private String[] BC00112_A488TBM36_DEL_FLG ;
   private boolean[] BC00112_n488TBM36_DEL_FLG ;
   private String[] BC00112_A491TBM36_CRT_PROG_NM ;
   private boolean[] BC00112_n491TBM36_CRT_PROG_NM ;
   private String[] BC00112_A494TBM36_UPD_PROG_NM ;
   private boolean[] BC00112_n494TBM36_UPD_PROG_NM ;
   private long[] BC00119_A484TBM36_STUDY_ID ;
   private short[] BC00119_A485TBM36_CRF_ID ;
   private short[] BC00119_A486TBM36_COND_NO ;
   private short[] BC00119_A487TBM36_SELECT_CRF_ID ;
   private java.util.Date[] BC00119_A489TBM36_CRT_DATETIME ;
   private boolean[] BC00119_n489TBM36_CRT_DATETIME ;
   private String[] BC00119_A490TBM36_CRT_USER_ID ;
   private boolean[] BC00119_n490TBM36_CRT_USER_ID ;
   private java.util.Date[] BC00119_A492TBM36_UPD_DATETIME ;
   private boolean[] BC00119_n492TBM36_UPD_DATETIME ;
   private String[] BC00119_A493TBM36_UPD_USER_ID ;
   private boolean[] BC00119_n493TBM36_UPD_USER_ID ;
   private long[] BC00119_A495TBM36_UPD_CNT ;
   private boolean[] BC00119_n495TBM36_UPD_CNT ;
   private String[] BC00119_A488TBM36_DEL_FLG ;
   private boolean[] BC00119_n488TBM36_DEL_FLG ;
   private String[] BC00119_A491TBM36_CRT_PROG_NM ;
   private boolean[] BC00119_n491TBM36_CRT_PROG_NM ;
   private String[] BC00119_A494TBM36_UPD_PROG_NM ;
   private boolean[] BC00119_n494TBM36_UPD_PROG_NM ;
}

final  class tbm36_crf_select_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00112", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00113", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00114", "SELECT TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID`, TM1.`TBM36_CRT_DATETIME`, TM1.`TBM36_CRT_USER_ID`, TM1.`TBM36_UPD_DATETIME`, TM1.`TBM36_UPD_USER_ID`, TM1.`TBM36_UPD_CNT`, TM1.`TBM36_DEL_FLG`, TM1.`TBM36_CRT_PROG_NM`, TM1.`TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` TM1 WHERE TM1.`TBM36_STUDY_ID` = ? and TM1.`TBM36_CRF_ID` = ? and TM1.`TBM36_COND_NO` = ? and TM1.`TBM36_SELECT_CRF_ID` = ? ORDER BY TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00115", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00116", "INSERT INTO `TBM36_CRF_SELECT` (`TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00117", "UPDATE `TBM36_CRF_SELECT` SET `TBM36_CRT_DATETIME`=?, `TBM36_CRT_USER_ID`=?, `TBM36_UPD_DATETIME`=?, `TBM36_UPD_USER_ID`=?, `TBM36_UPD_CNT`=?, `TBM36_DEL_FLG`=?, `TBM36_CRT_PROG_NM`=?, `TBM36_UPD_PROG_NM`=?  WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00118", "DELETE FROM `TBM36_CRF_SELECT`  WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00119", "SELECT TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID`, TM1.`TBM36_CRT_DATETIME`, TM1.`TBM36_CRT_USER_ID`, TM1.`TBM36_UPD_DATETIME`, TM1.`TBM36_UPD_USER_ID`, TM1.`TBM36_UPD_CNT`, TM1.`TBM36_DEL_FLG`, TM1.`TBM36_CRT_PROG_NM`, TM1.`TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` TM1 WHERE TM1.`TBM36_STUDY_ID` = ? and TM1.`TBM36_CRF_ID` = ? and TM1.`TBM36_COND_NO` = ? and TM1.`TBM36_SELECT_CRF_ID` = ? ORDER BY TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
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
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
      }
   }

}

