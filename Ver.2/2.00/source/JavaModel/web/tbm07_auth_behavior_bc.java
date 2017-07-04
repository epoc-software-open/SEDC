/*
               File: tbm07_auth_behavior_bc
        Description: 権限別振舞マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:6.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm07_auth_behavior_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm07_auth_behavior_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm07_auth_behavior_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm07_auth_behavior_bc.class ));
   }

   public tbm07_auth_behavior_bc( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1439( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1439( ) ;
      standaloneModal( ) ;
      addRow1439( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: E142 */
         E142 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z50TBM07_AUTH_CD = A50TBM07_AUTH_CD ;
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

   public void confirm_140( )
   {
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1439( ) ;
         }
         else
         {
            checkExtendedTable1439( ) ;
            if ( AnyError == 0 )
            {
               zm1439( 9) ;
            }
            closeExtendedTableCursors1439( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11152( )
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

   public void E142( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "権限コード:" + A50TBM07_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A623TBM07_CRF_INP_AUTH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A624TBM07_CRF_EDIT_AUTH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A625TBM07_OTHER_SITE_VIEW_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A626TBM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A627TBM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A628TBM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A629TBM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A630TBM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A631TBM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A632TBM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A633TBM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1439( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z627TBM07_CRT_DATETIME = A627TBM07_CRT_DATETIME ;
         Z628TBM07_CRT_USER_ID = A628TBM07_CRT_USER_ID ;
         Z630TBM07_UPD_DATETIME = A630TBM07_UPD_DATETIME ;
         Z631TBM07_UPD_USER_ID = A631TBM07_UPD_USER_ID ;
         Z633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
         Z623TBM07_CRF_INP_AUTH_FLG = A623TBM07_CRF_INP_AUTH_FLG ;
         Z624TBM07_CRF_EDIT_AUTH_FLG = A624TBM07_CRF_EDIT_AUTH_FLG ;
         Z625TBM07_OTHER_SITE_VIEW_FLG = A625TBM07_OTHER_SITE_VIEW_FLG ;
         Z626TBM07_DEL_FLG = A626TBM07_DEL_FLG ;
         Z629TBM07_CRT_PROG_NM = A629TBM07_CRT_PROG_NM ;
         Z632TBM07_UPD_PROG_NM = A632TBM07_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z627TBM07_CRT_DATETIME = A627TBM07_CRT_DATETIME ;
         Z628TBM07_CRT_USER_ID = A628TBM07_CRT_USER_ID ;
         Z630TBM07_UPD_DATETIME = A630TBM07_UPD_DATETIME ;
         Z631TBM07_UPD_USER_ID = A631TBM07_UPD_USER_ID ;
         Z633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
         Z623TBM07_CRF_INP_AUTH_FLG = A623TBM07_CRF_INP_AUTH_FLG ;
         Z624TBM07_CRF_EDIT_AUTH_FLG = A624TBM07_CRF_EDIT_AUTH_FLG ;
         Z625TBM07_OTHER_SITE_VIEW_FLG = A625TBM07_OTHER_SITE_VIEW_FLG ;
         Z626TBM07_DEL_FLG = A626TBM07_DEL_FLG ;
         Z629TBM07_CRT_PROG_NM = A629TBM07_CRT_PROG_NM ;
         Z632TBM07_UPD_PROG_NM = A632TBM07_UPD_PROG_NM ;
         Z50TBM07_AUTH_CD = A50TBM07_AUTH_CD ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1439( )
   {
      /* Using cursor BC00145 */
      pr_default.execute(3, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A627TBM07_CRT_DATETIME = BC00145_A627TBM07_CRT_DATETIME[0] ;
         n627TBM07_CRT_DATETIME = BC00145_n627TBM07_CRT_DATETIME[0] ;
         A628TBM07_CRT_USER_ID = BC00145_A628TBM07_CRT_USER_ID[0] ;
         n628TBM07_CRT_USER_ID = BC00145_n628TBM07_CRT_USER_ID[0] ;
         A630TBM07_UPD_DATETIME = BC00145_A630TBM07_UPD_DATETIME[0] ;
         n630TBM07_UPD_DATETIME = BC00145_n630TBM07_UPD_DATETIME[0] ;
         A631TBM07_UPD_USER_ID = BC00145_A631TBM07_UPD_USER_ID[0] ;
         n631TBM07_UPD_USER_ID = BC00145_n631TBM07_UPD_USER_ID[0] ;
         A633TBM07_UPD_CNT = BC00145_A633TBM07_UPD_CNT[0] ;
         n633TBM07_UPD_CNT = BC00145_n633TBM07_UPD_CNT[0] ;
         A623TBM07_CRF_INP_AUTH_FLG = BC00145_A623TBM07_CRF_INP_AUTH_FLG[0] ;
         n623TBM07_CRF_INP_AUTH_FLG = BC00145_n623TBM07_CRF_INP_AUTH_FLG[0] ;
         A624TBM07_CRF_EDIT_AUTH_FLG = BC00145_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n624TBM07_CRF_EDIT_AUTH_FLG = BC00145_n624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A625TBM07_OTHER_SITE_VIEW_FLG = BC00145_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n625TBM07_OTHER_SITE_VIEW_FLG = BC00145_n625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A626TBM07_DEL_FLG = BC00145_A626TBM07_DEL_FLG[0] ;
         n626TBM07_DEL_FLG = BC00145_n626TBM07_DEL_FLG[0] ;
         A629TBM07_CRT_PROG_NM = BC00145_A629TBM07_CRT_PROG_NM[0] ;
         n629TBM07_CRT_PROG_NM = BC00145_n629TBM07_CRT_PROG_NM[0] ;
         A632TBM07_UPD_PROG_NM = BC00145_A632TBM07_UPD_PROG_NM[0] ;
         n632TBM07_UPD_PROG_NM = BC00145_n632TBM07_UPD_PROG_NM[0] ;
         zm1439( -8) ;
      }
      pr_default.close(3);
      onLoadActions1439( ) ;
   }

   public void onLoadActions1439( )
   {
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR_BC" ;
   }

   public void checkExtendedTable1439( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR_BC" ;
      /* Using cursor BC00146 */
      pr_default.execute(4, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("'権限別振舞マスタ・権限サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
      if ( ! ( GXutil.nullDate().equals(A627TBM07_CRT_DATETIME) || (( A627TBM07_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A627TBM07_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A630TBM07_UPD_DATETIME) || (( A630TBM07_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A630TBM07_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1439( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1439( )
   {
      /* Using cursor BC00147 */
      pr_default.execute(5, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00148 */
      pr_default.execute(6, new Object[] {A50TBM07_AUTH_CD});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1439( 8) ;
         RcdFound39 = (short)(1) ;
         A627TBM07_CRT_DATETIME = BC00148_A627TBM07_CRT_DATETIME[0] ;
         n627TBM07_CRT_DATETIME = BC00148_n627TBM07_CRT_DATETIME[0] ;
         A628TBM07_CRT_USER_ID = BC00148_A628TBM07_CRT_USER_ID[0] ;
         n628TBM07_CRT_USER_ID = BC00148_n628TBM07_CRT_USER_ID[0] ;
         A630TBM07_UPD_DATETIME = BC00148_A630TBM07_UPD_DATETIME[0] ;
         n630TBM07_UPD_DATETIME = BC00148_n630TBM07_UPD_DATETIME[0] ;
         A631TBM07_UPD_USER_ID = BC00148_A631TBM07_UPD_USER_ID[0] ;
         n631TBM07_UPD_USER_ID = BC00148_n631TBM07_UPD_USER_ID[0] ;
         A633TBM07_UPD_CNT = BC00148_A633TBM07_UPD_CNT[0] ;
         n633TBM07_UPD_CNT = BC00148_n633TBM07_UPD_CNT[0] ;
         A623TBM07_CRF_INP_AUTH_FLG = BC00148_A623TBM07_CRF_INP_AUTH_FLG[0] ;
         n623TBM07_CRF_INP_AUTH_FLG = BC00148_n623TBM07_CRF_INP_AUTH_FLG[0] ;
         A624TBM07_CRF_EDIT_AUTH_FLG = BC00148_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n624TBM07_CRF_EDIT_AUTH_FLG = BC00148_n624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A625TBM07_OTHER_SITE_VIEW_FLG = BC00148_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n625TBM07_OTHER_SITE_VIEW_FLG = BC00148_n625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A626TBM07_DEL_FLG = BC00148_A626TBM07_DEL_FLG[0] ;
         n626TBM07_DEL_FLG = BC00148_n626TBM07_DEL_FLG[0] ;
         A629TBM07_CRT_PROG_NM = BC00148_A629TBM07_CRT_PROG_NM[0] ;
         n629TBM07_CRT_PROG_NM = BC00148_n629TBM07_CRT_PROG_NM[0] ;
         A632TBM07_UPD_PROG_NM = BC00148_A632TBM07_UPD_PROG_NM[0] ;
         n632TBM07_UPD_PROG_NM = BC00148_n632TBM07_UPD_PROG_NM[0] ;
         A50TBM07_AUTH_CD = BC00148_A50TBM07_AUTH_CD[0] ;
         O633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
         n633TBM07_UPD_CNT = false ;
         Z50TBM07_AUTH_CD = A50TBM07_AUTH_CD ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1439( ) ;
         if ( AnyError == 1 )
         {
            RcdFound39 = (short)(0) ;
            initializeNonKey1439( ) ;
         }
         Gx_mode = sMode39 ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1439( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1439( ) ;
      if ( RcdFound39 == 0 )
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
      confirm_140( ) ;
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

   public void checkOptimisticConcurrency1439( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00149 */
         pr_default.execute(7, new Object[] {A50TBM07_AUTH_CD});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(7) == 101) || !( Z627TBM07_CRT_DATETIME.equals( BC00149_A627TBM07_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z628TBM07_CRT_USER_ID, BC00149_A628TBM07_CRT_USER_ID[0]) != 0 ) || !( Z630TBM07_UPD_DATETIME.equals( BC00149_A630TBM07_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z631TBM07_UPD_USER_ID, BC00149_A631TBM07_UPD_USER_ID[0]) != 0 ) || ( Z633TBM07_UPD_CNT != BC00149_A633TBM07_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z623TBM07_CRF_INP_AUTH_FLG, BC00149_A623TBM07_CRF_INP_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z624TBM07_CRF_EDIT_AUTH_FLG, BC00149_A624TBM07_CRF_EDIT_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z625TBM07_OTHER_SITE_VIEW_FLG, BC00149_A625TBM07_OTHER_SITE_VIEW_FLG[0]) != 0 ) || ( GXutil.strcmp(Z626TBM07_DEL_FLG, BC00149_A626TBM07_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z629TBM07_CRT_PROG_NM, BC00149_A629TBM07_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z632TBM07_UPD_PROG_NM, BC00149_A632TBM07_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1439( )
   {
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1439( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1439( 0) ;
         checkOptimisticConcurrency1439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1439( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001410 */
                  pr_default.execute(8, new Object[] {new Boolean(n627TBM07_CRT_DATETIME), A627TBM07_CRT_DATETIME, new Boolean(n628TBM07_CRT_USER_ID), A628TBM07_CRT_USER_ID, new Boolean(n630TBM07_UPD_DATETIME), A630TBM07_UPD_DATETIME, new Boolean(n631TBM07_UPD_USER_ID), A631TBM07_UPD_USER_ID, new Boolean(n633TBM07_UPD_CNT), new Long(A633TBM07_UPD_CNT), new Boolean(n623TBM07_CRF_INP_AUTH_FLG), A623TBM07_CRF_INP_AUTH_FLG, new Boolean(n624TBM07_CRF_EDIT_AUTH_FLG), A624TBM07_CRF_EDIT_AUTH_FLG, new Boolean(n625TBM07_OTHER_SITE_VIEW_FLG), A625TBM07_OTHER_SITE_VIEW_FLG, new Boolean(n626TBM07_DEL_FLG), A626TBM07_DEL_FLG, new Boolean(n629TBM07_CRT_PROG_NM), A629TBM07_CRT_PROG_NM, new Boolean(n632TBM07_UPD_PROG_NM), A632TBM07_UPD_PROG_NM, A50TBM07_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM07_AUTH_BEHAVIOR") ;
                  if ( (pr_default.getStatus(8) == 1) )
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
            load1439( ) ;
         }
         endLevel1439( ) ;
      }
      closeExtendedTableCursors1439( ) ;
   }

   public void update1439( )
   {
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1439( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1439( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001411 */
                  pr_default.execute(9, new Object[] {new Boolean(n627TBM07_CRT_DATETIME), A627TBM07_CRT_DATETIME, new Boolean(n628TBM07_CRT_USER_ID), A628TBM07_CRT_USER_ID, new Boolean(n630TBM07_UPD_DATETIME), A630TBM07_UPD_DATETIME, new Boolean(n631TBM07_UPD_USER_ID), A631TBM07_UPD_USER_ID, new Boolean(n633TBM07_UPD_CNT), new Long(A633TBM07_UPD_CNT), new Boolean(n623TBM07_CRF_INP_AUTH_FLG), A623TBM07_CRF_INP_AUTH_FLG, new Boolean(n624TBM07_CRF_EDIT_AUTH_FLG), A624TBM07_CRF_EDIT_AUTH_FLG, new Boolean(n625TBM07_OTHER_SITE_VIEW_FLG), A625TBM07_OTHER_SITE_VIEW_FLG, new Boolean(n626TBM07_DEL_FLG), A626TBM07_DEL_FLG, new Boolean(n629TBM07_CRT_PROG_NM), A629TBM07_CRT_PROG_NM, new Boolean(n632TBM07_UPD_PROG_NM), A632TBM07_UPD_PROG_NM, A50TBM07_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM07_AUTH_BEHAVIOR") ;
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1439( ) ;
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
         endLevel1439( ) ;
      }
      closeExtendedTableCursors1439( ) ;
   }

   public void deferredUpdate1439( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1439( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1439( ) ;
         afterConfirm1439( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1439( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001412 */
               pr_default.execute(10, new Object[] {A50TBM07_AUTH_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM07_AUTH_BEHAVIOR") ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1439( ) ;
      Gx_mode = sMode39 ;
   }

   public void onDeleteControls1439( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM07_AUTH_BEHAVIOR_BC" ;
      }
   }

   public void endLevel1439( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1439( ) ;
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

   public void scanKeyStart1439( )
   {
      /* Scan By routine */
      /* Using cursor BC001413 */
      pr_default.execute(11, new Object[] {A50TBM07_AUTH_CD});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A627TBM07_CRT_DATETIME = BC001413_A627TBM07_CRT_DATETIME[0] ;
         n627TBM07_CRT_DATETIME = BC001413_n627TBM07_CRT_DATETIME[0] ;
         A628TBM07_CRT_USER_ID = BC001413_A628TBM07_CRT_USER_ID[0] ;
         n628TBM07_CRT_USER_ID = BC001413_n628TBM07_CRT_USER_ID[0] ;
         A630TBM07_UPD_DATETIME = BC001413_A630TBM07_UPD_DATETIME[0] ;
         n630TBM07_UPD_DATETIME = BC001413_n630TBM07_UPD_DATETIME[0] ;
         A631TBM07_UPD_USER_ID = BC001413_A631TBM07_UPD_USER_ID[0] ;
         n631TBM07_UPD_USER_ID = BC001413_n631TBM07_UPD_USER_ID[0] ;
         A633TBM07_UPD_CNT = BC001413_A633TBM07_UPD_CNT[0] ;
         n633TBM07_UPD_CNT = BC001413_n633TBM07_UPD_CNT[0] ;
         A623TBM07_CRF_INP_AUTH_FLG = BC001413_A623TBM07_CRF_INP_AUTH_FLG[0] ;
         n623TBM07_CRF_INP_AUTH_FLG = BC001413_n623TBM07_CRF_INP_AUTH_FLG[0] ;
         A624TBM07_CRF_EDIT_AUTH_FLG = BC001413_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n624TBM07_CRF_EDIT_AUTH_FLG = BC001413_n624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A625TBM07_OTHER_SITE_VIEW_FLG = BC001413_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n625TBM07_OTHER_SITE_VIEW_FLG = BC001413_n625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A626TBM07_DEL_FLG = BC001413_A626TBM07_DEL_FLG[0] ;
         n626TBM07_DEL_FLG = BC001413_n626TBM07_DEL_FLG[0] ;
         A629TBM07_CRT_PROG_NM = BC001413_A629TBM07_CRT_PROG_NM[0] ;
         n629TBM07_CRT_PROG_NM = BC001413_n629TBM07_CRT_PROG_NM[0] ;
         A632TBM07_UPD_PROG_NM = BC001413_A632TBM07_UPD_PROG_NM[0] ;
         n632TBM07_UPD_PROG_NM = BC001413_n632TBM07_UPD_PROG_NM[0] ;
         A50TBM07_AUTH_CD = BC001413_A50TBM07_AUTH_CD[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1439( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound39 = (short)(0) ;
      scanKeyLoad1439( ) ;
   }

   public void scanKeyLoad1439( )
   {
      sMode39 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A627TBM07_CRT_DATETIME = BC001413_A627TBM07_CRT_DATETIME[0] ;
         n627TBM07_CRT_DATETIME = BC001413_n627TBM07_CRT_DATETIME[0] ;
         A628TBM07_CRT_USER_ID = BC001413_A628TBM07_CRT_USER_ID[0] ;
         n628TBM07_CRT_USER_ID = BC001413_n628TBM07_CRT_USER_ID[0] ;
         A630TBM07_UPD_DATETIME = BC001413_A630TBM07_UPD_DATETIME[0] ;
         n630TBM07_UPD_DATETIME = BC001413_n630TBM07_UPD_DATETIME[0] ;
         A631TBM07_UPD_USER_ID = BC001413_A631TBM07_UPD_USER_ID[0] ;
         n631TBM07_UPD_USER_ID = BC001413_n631TBM07_UPD_USER_ID[0] ;
         A633TBM07_UPD_CNT = BC001413_A633TBM07_UPD_CNT[0] ;
         n633TBM07_UPD_CNT = BC001413_n633TBM07_UPD_CNT[0] ;
         A623TBM07_CRF_INP_AUTH_FLG = BC001413_A623TBM07_CRF_INP_AUTH_FLG[0] ;
         n623TBM07_CRF_INP_AUTH_FLG = BC001413_n623TBM07_CRF_INP_AUTH_FLG[0] ;
         A624TBM07_CRF_EDIT_AUTH_FLG = BC001413_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n624TBM07_CRF_EDIT_AUTH_FLG = BC001413_n624TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A625TBM07_OTHER_SITE_VIEW_FLG = BC001413_A625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n625TBM07_OTHER_SITE_VIEW_FLG = BC001413_n625TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A626TBM07_DEL_FLG = BC001413_A626TBM07_DEL_FLG[0] ;
         n626TBM07_DEL_FLG = BC001413_n626TBM07_DEL_FLG[0] ;
         A629TBM07_CRT_PROG_NM = BC001413_A629TBM07_CRT_PROG_NM[0] ;
         n629TBM07_CRT_PROG_NM = BC001413_n629TBM07_CRT_PROG_NM[0] ;
         A632TBM07_UPD_PROG_NM = BC001413_A632TBM07_UPD_PROG_NM[0] ;
         n632TBM07_UPD_PROG_NM = BC001413_n632TBM07_UPD_PROG_NM[0] ;
         A50TBM07_AUTH_CD = BC001413_A50TBM07_AUTH_CD[0] ;
      }
      Gx_mode = sMode39 ;
   }

   public void scanKeyEnd1439( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1439( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1439( )
   {
      /* Before Insert Rules */
      A627TBM07_CRT_DATETIME = GXutil.now( ) ;
      n627TBM07_CRT_DATETIME = false ;
      GXt_char1 = A628TBM07_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      A628TBM07_CRT_USER_ID = GXt_char1 ;
      n628TBM07_CRT_USER_ID = false ;
      A630TBM07_UPD_DATETIME = GXutil.now( ) ;
      n630TBM07_UPD_DATETIME = false ;
      GXt_char1 = A631TBM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      A631TBM07_UPD_USER_ID = GXt_char1 ;
      n631TBM07_UPD_USER_ID = false ;
      A633TBM07_UPD_CNT = (long)(O633TBM07_UPD_CNT+1) ;
      n633TBM07_UPD_CNT = false ;
   }

   public void beforeUpdate1439( )
   {
      /* Before Update Rules */
      A630TBM07_UPD_DATETIME = GXutil.now( ) ;
      n630TBM07_UPD_DATETIME = false ;
      GXt_char1 = A631TBM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      A631TBM07_UPD_USER_ID = GXt_char1 ;
      n631TBM07_UPD_USER_ID = false ;
      A633TBM07_UPD_CNT = (long)(O633TBM07_UPD_CNT+1) ;
      n633TBM07_UPD_CNT = false ;
   }

   public void beforeDelete1439( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1439( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1439( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1439( )
   {
   }

   public void addRow1439( )
   {
      VarsToRow39( bcTBM07_AUTH_BEHAVIOR) ;
   }

   public void readRow1439( )
   {
      RowToVars39( bcTBM07_AUTH_BEHAVIOR, 1) ;
   }

   public void initializeNonKey1439( )
   {
      A627TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n627TBM07_CRT_DATETIME = false ;
      A628TBM07_CRT_USER_ID = "" ;
      n628TBM07_CRT_USER_ID = false ;
      A630TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n630TBM07_UPD_DATETIME = false ;
      A631TBM07_UPD_USER_ID = "" ;
      n631TBM07_UPD_USER_ID = false ;
      A633TBM07_UPD_CNT = 0 ;
      n633TBM07_UPD_CNT = false ;
      A623TBM07_CRF_INP_AUTH_FLG = "" ;
      n623TBM07_CRF_INP_AUTH_FLG = false ;
      A624TBM07_CRF_EDIT_AUTH_FLG = "" ;
      n624TBM07_CRF_EDIT_AUTH_FLG = false ;
      A625TBM07_OTHER_SITE_VIEW_FLG = "" ;
      n625TBM07_OTHER_SITE_VIEW_FLG = false ;
      A626TBM07_DEL_FLG = "" ;
      n626TBM07_DEL_FLG = false ;
      A629TBM07_CRT_PROG_NM = "" ;
      n629TBM07_CRT_PROG_NM = false ;
      A632TBM07_UPD_PROG_NM = "" ;
      n632TBM07_UPD_PROG_NM = false ;
      O633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
      n633TBM07_UPD_CNT = false ;
   }

   public void initAll1439( )
   {
      A50TBM07_AUTH_CD = "" ;
      initializeNonKey1439( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow39( SdtTBM07_AUTH_BEHAVIOR obj39 )
   {
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode( Gx_mode );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime( A627TBM07_CRT_DATETIME );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id( A628TBM07_CRT_USER_ID );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime( A630TBM07_UPD_DATETIME );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id( A631TBM07_UPD_USER_ID );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt( A633TBM07_UPD_CNT );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg( A623TBM07_CRF_INP_AUTH_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg( A624TBM07_CRF_EDIT_AUTH_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg( A625TBM07_OTHER_SITE_VIEW_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg( A626TBM07_DEL_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm( A629TBM07_CRT_PROG_NM );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm( A632TBM07_UPD_PROG_NM );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd( A50TBM07_AUTH_CD );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd_Z( Z50TBM07_AUTH_CD );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_Z( Z623TBM07_CRF_INP_AUTH_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_Z( Z624TBM07_CRF_EDIT_AUTH_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_Z( Z625TBM07_OTHER_SITE_VIEW_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_Z( Z626TBM07_DEL_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_Z( Z627TBM07_CRT_DATETIME );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_Z( Z628TBM07_CRT_USER_ID );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_Z( Z629TBM07_CRT_PROG_NM );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_Z( Z630TBM07_UPD_DATETIME );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_Z( Z631TBM07_UPD_USER_ID );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_Z( Z632TBM07_UPD_PROG_NM );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_Z( Z633TBM07_UPD_CNT );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_N( (byte)((byte)((n623TBM07_CRF_INP_AUTH_FLG)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_N( (byte)((byte)((n624TBM07_CRF_EDIT_AUTH_FLG)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_N( (byte)((byte)((n625TBM07_OTHER_SITE_VIEW_FLG)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_N( (byte)((byte)((n626TBM07_DEL_FLG)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_N( (byte)((byte)((n627TBM07_CRT_DATETIME)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_N( (byte)((byte)((n628TBM07_CRT_USER_ID)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_N( (byte)((byte)((n629TBM07_CRT_PROG_NM)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_N( (byte)((byte)((n630TBM07_UPD_DATETIME)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_N( (byte)((byte)((n631TBM07_UPD_USER_ID)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_N( (byte)((byte)((n632TBM07_UPD_PROG_NM)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_N( (byte)((byte)((n633TBM07_UPD_CNT)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode( Gx_mode );
   }

   public void KeyVarsToRow39( SdtTBM07_AUTH_BEHAVIOR obj39 )
   {
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd( A50TBM07_AUTH_CD );
   }

   public void RowToVars39( SdtTBM07_AUTH_BEHAVIOR obj39 ,
                            int forceLoad )
   {
      Gx_mode = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode() ;
      A627TBM07_CRT_DATETIME = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime() ;
      n627TBM07_CRT_DATETIME = false ;
      A628TBM07_CRT_USER_ID = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id() ;
      n628TBM07_CRT_USER_ID = false ;
      A630TBM07_UPD_DATETIME = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime() ;
      n630TBM07_UPD_DATETIME = false ;
      A631TBM07_UPD_USER_ID = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id() ;
      n631TBM07_UPD_USER_ID = false ;
      A633TBM07_UPD_CNT = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt() ;
      n633TBM07_UPD_CNT = false ;
      A623TBM07_CRF_INP_AUTH_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg() ;
      n623TBM07_CRF_INP_AUTH_FLG = false ;
      A624TBM07_CRF_EDIT_AUTH_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg() ;
      n624TBM07_CRF_EDIT_AUTH_FLG = false ;
      A625TBM07_OTHER_SITE_VIEW_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg() ;
      n625TBM07_OTHER_SITE_VIEW_FLG = false ;
      A626TBM07_DEL_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg() ;
      n626TBM07_DEL_FLG = false ;
      A629TBM07_CRT_PROG_NM = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm() ;
      n629TBM07_CRT_PROG_NM = false ;
      A632TBM07_UPD_PROG_NM = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm() ;
      n632TBM07_UPD_PROG_NM = false ;
      A50TBM07_AUTH_CD = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd() ;
      Z50TBM07_AUTH_CD = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd_Z() ;
      Z623TBM07_CRF_INP_AUTH_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_Z() ;
      Z624TBM07_CRF_EDIT_AUTH_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_Z() ;
      Z625TBM07_OTHER_SITE_VIEW_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_Z() ;
      Z626TBM07_DEL_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_Z() ;
      Z627TBM07_CRT_DATETIME = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_Z() ;
      Z628TBM07_CRT_USER_ID = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_Z() ;
      Z629TBM07_CRT_PROG_NM = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_Z() ;
      Z630TBM07_UPD_DATETIME = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_Z() ;
      Z631TBM07_UPD_USER_ID = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_Z() ;
      Z632TBM07_UPD_PROG_NM = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_Z() ;
      Z633TBM07_UPD_CNT = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_Z() ;
      O633TBM07_UPD_CNT = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_Z() ;
      n623TBM07_CRF_INP_AUTH_FLG = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_N()==0)?false:true) ;
      n624TBM07_CRF_EDIT_AUTH_FLG = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_N()==0)?false:true) ;
      n625TBM07_OTHER_SITE_VIEW_FLG = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_N()==0)?false:true) ;
      n626TBM07_DEL_FLG = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_N()==0)?false:true) ;
      n627TBM07_CRT_DATETIME = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_N()==0)?false:true) ;
      n628TBM07_CRT_USER_ID = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_N()==0)?false:true) ;
      n629TBM07_CRT_PROG_NM = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_N()==0)?false:true) ;
      n630TBM07_UPD_DATETIME = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_N()==0)?false:true) ;
      n631TBM07_UPD_USER_ID = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_N()==0)?false:true) ;
      n632TBM07_UPD_PROG_NM = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_N()==0)?false:true) ;
      n633TBM07_UPD_CNT = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A50TBM07_AUTH_CD = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1439( ) ;
      scanKeyStart1439( ) ;
      if ( RcdFound39 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z50TBM07_AUTH_CD = A50TBM07_AUTH_CD ;
         O633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
         n633TBM07_UPD_CNT = false ;
      }
      zm1439( -8) ;
      onLoadActions1439( ) ;
      addRow1439( ) ;
      scanKeyEnd1439( ) ;
      if ( RcdFound39 == 0 )
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
      RowToVars39( bcTBM07_AUTH_BEHAVIOR, 0) ;
      scanKeyStart1439( ) ;
      if ( RcdFound39 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z50TBM07_AUTH_CD = A50TBM07_AUTH_CD ;
         O633TBM07_UPD_CNT = A633TBM07_UPD_CNT ;
         n633TBM07_UPD_CNT = false ;
      }
      zm1439( -8) ;
      onLoadActions1439( ) ;
      addRow1439( ) ;
      scanKeyEnd1439( ) ;
      if ( RcdFound39 == 0 )
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
      RowToVars39( bcTBM07_AUTH_BEHAVIOR, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1439( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1439( ) ;
      }
      else
      {
         if ( RcdFound39 == 1 )
         {
            if ( GXutil.strcmp(A50TBM07_AUTH_CD, Z50TBM07_AUTH_CD) != 0 )
            {
               A50TBM07_AUTH_CD = Z50TBM07_AUTH_CD ;
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
               update1439( ) ;
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
               if ( GXutil.strcmp(A50TBM07_AUTH_CD, Z50TBM07_AUTH_CD) != 0 )
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
                     insert1439( ) ;
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
                     insert1439( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow39( bcTBM07_AUTH_BEHAVIOR) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars39( bcTBM07_AUTH_BEHAVIOR, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1439( ) ;
      if ( RcdFound39 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A50TBM07_AUTH_CD, Z50TBM07_AUTH_CD) != 0 )
         {
            A50TBM07_AUTH_CD = Z50TBM07_AUTH_CD ;
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
         if ( GXutil.strcmp(A50TBM07_AUTH_CD, Z50TBM07_AUTH_CD) != 0 )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm07_auth_behavior_bc");
      VarsToRow39( bcTBM07_AUTH_BEHAVIOR) ;
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
      Gx_mode = bcTBM07_AUTH_BEHAVIOR.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM07_AUTH_BEHAVIOR.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM07_AUTH_BEHAVIOR sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM07_AUTH_BEHAVIOR )
      {
         bcTBM07_AUTH_BEHAVIOR = sdt ;
         if ( GXutil.strcmp(bcTBM07_AUTH_BEHAVIOR.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode(), "") == 0 )
         {
            bcTBM07_AUTH_BEHAVIOR.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow39( bcTBM07_AUTH_BEHAVIOR) ;
         }
         else
         {
            RowToVars39( bcTBM07_AUTH_BEHAVIOR, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM07_AUTH_BEHAVIOR.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode(), "") == 0 )
         {
            bcTBM07_AUTH_BEHAVIOR.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars39( bcTBM07_AUTH_BEHAVIOR, 1) ;
   }

   public SdtTBM07_AUTH_BEHAVIOR getTBM07_AUTH_BEHAVIOR_BC( )
   {
      return bcTBM07_AUTH_BEHAVIOR ;
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
      Z50TBM07_AUTH_CD = "" ;
      A50TBM07_AUTH_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A623TBM07_CRF_INP_AUTH_FLG = "" ;
      A624TBM07_CRF_EDIT_AUTH_FLG = "" ;
      A625TBM07_OTHER_SITE_VIEW_FLG = "" ;
      A626TBM07_DEL_FLG = "" ;
      A627TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A628TBM07_CRT_USER_ID = "" ;
      A629TBM07_CRT_PROG_NM = "" ;
      A630TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A631TBM07_UPD_USER_ID = "" ;
      A632TBM07_UPD_PROG_NM = "" ;
      Z627TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z628TBM07_CRT_USER_ID = "" ;
      Z630TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z631TBM07_UPD_USER_ID = "" ;
      Z623TBM07_CRF_INP_AUTH_FLG = "" ;
      Z624TBM07_CRF_EDIT_AUTH_FLG = "" ;
      Z625TBM07_OTHER_SITE_VIEW_FLG = "" ;
      Z626TBM07_DEL_FLG = "" ;
      Z629TBM07_CRT_PROG_NM = "" ;
      Z632TBM07_UPD_PROG_NM = "" ;
      BC00145_A627TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00145_n627TBM07_CRT_DATETIME = new boolean[] {false} ;
      BC00145_A628TBM07_CRT_USER_ID = new String[] {""} ;
      BC00145_n628TBM07_CRT_USER_ID = new boolean[] {false} ;
      BC00145_A630TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00145_n630TBM07_UPD_DATETIME = new boolean[] {false} ;
      BC00145_A631TBM07_UPD_USER_ID = new String[] {""} ;
      BC00145_n631TBM07_UPD_USER_ID = new boolean[] {false} ;
      BC00145_A633TBM07_UPD_CNT = new long[1] ;
      BC00145_n633TBM07_UPD_CNT = new boolean[] {false} ;
      BC00145_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      BC00145_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      BC00145_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      BC00145_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      BC00145_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      BC00145_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      BC00145_A626TBM07_DEL_FLG = new String[] {""} ;
      BC00145_n626TBM07_DEL_FLG = new boolean[] {false} ;
      BC00145_A629TBM07_CRT_PROG_NM = new String[] {""} ;
      BC00145_n629TBM07_CRT_PROG_NM = new boolean[] {false} ;
      BC00145_A632TBM07_UPD_PROG_NM = new String[] {""} ;
      BC00145_n632TBM07_UPD_PROG_NM = new boolean[] {false} ;
      BC00145_A50TBM07_AUTH_CD = new String[] {""} ;
      BC00146_A50TBM07_AUTH_CD = new String[] {""} ;
      BC00147_A50TBM07_AUTH_CD = new String[] {""} ;
      BC00148_A627TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00148_n627TBM07_CRT_DATETIME = new boolean[] {false} ;
      BC00148_A628TBM07_CRT_USER_ID = new String[] {""} ;
      BC00148_n628TBM07_CRT_USER_ID = new boolean[] {false} ;
      BC00148_A630TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00148_n630TBM07_UPD_DATETIME = new boolean[] {false} ;
      BC00148_A631TBM07_UPD_USER_ID = new String[] {""} ;
      BC00148_n631TBM07_UPD_USER_ID = new boolean[] {false} ;
      BC00148_A633TBM07_UPD_CNT = new long[1] ;
      BC00148_n633TBM07_UPD_CNT = new boolean[] {false} ;
      BC00148_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      BC00148_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      BC00148_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      BC00148_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      BC00148_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      BC00148_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      BC00148_A626TBM07_DEL_FLG = new String[] {""} ;
      BC00148_n626TBM07_DEL_FLG = new boolean[] {false} ;
      BC00148_A629TBM07_CRT_PROG_NM = new String[] {""} ;
      BC00148_n629TBM07_CRT_PROG_NM = new boolean[] {false} ;
      BC00148_A632TBM07_UPD_PROG_NM = new String[] {""} ;
      BC00148_n632TBM07_UPD_PROG_NM = new boolean[] {false} ;
      BC00148_A50TBM07_AUTH_CD = new String[] {""} ;
      sMode39 = "" ;
      BC00149_A627TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00149_n627TBM07_CRT_DATETIME = new boolean[] {false} ;
      BC00149_A628TBM07_CRT_USER_ID = new String[] {""} ;
      BC00149_n628TBM07_CRT_USER_ID = new boolean[] {false} ;
      BC00149_A630TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00149_n630TBM07_UPD_DATETIME = new boolean[] {false} ;
      BC00149_A631TBM07_UPD_USER_ID = new String[] {""} ;
      BC00149_n631TBM07_UPD_USER_ID = new boolean[] {false} ;
      BC00149_A633TBM07_UPD_CNT = new long[1] ;
      BC00149_n633TBM07_UPD_CNT = new boolean[] {false} ;
      BC00149_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      BC00149_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      BC00149_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      BC00149_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      BC00149_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      BC00149_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      BC00149_A626TBM07_DEL_FLG = new String[] {""} ;
      BC00149_n626TBM07_DEL_FLG = new boolean[] {false} ;
      BC00149_A629TBM07_CRT_PROG_NM = new String[] {""} ;
      BC00149_n629TBM07_CRT_PROG_NM = new boolean[] {false} ;
      BC00149_A632TBM07_UPD_PROG_NM = new String[] {""} ;
      BC00149_n632TBM07_UPD_PROG_NM = new boolean[] {false} ;
      BC00149_A50TBM07_AUTH_CD = new String[] {""} ;
      BC001413_A627TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001413_n627TBM07_CRT_DATETIME = new boolean[] {false} ;
      BC001413_A628TBM07_CRT_USER_ID = new String[] {""} ;
      BC001413_n628TBM07_CRT_USER_ID = new boolean[] {false} ;
      BC001413_A630TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001413_n630TBM07_UPD_DATETIME = new boolean[] {false} ;
      BC001413_A631TBM07_UPD_USER_ID = new String[] {""} ;
      BC001413_n631TBM07_UPD_USER_ID = new boolean[] {false} ;
      BC001413_A633TBM07_UPD_CNT = new long[1] ;
      BC001413_n633TBM07_UPD_CNT = new boolean[] {false} ;
      BC001413_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      BC001413_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      BC001413_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      BC001413_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      BC001413_A625TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      BC001413_n625TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      BC001413_A626TBM07_DEL_FLG = new String[] {""} ;
      BC001413_n626TBM07_DEL_FLG = new boolean[] {false} ;
      BC001413_A629TBM07_CRT_PROG_NM = new String[] {""} ;
      BC001413_n629TBM07_CRT_PROG_NM = new boolean[] {false} ;
      BC001413_A632TBM07_UPD_PROG_NM = new String[] {""} ;
      BC001413_n632TBM07_UPD_PROG_NM = new boolean[] {false} ;
      BC001413_A50TBM07_AUTH_CD = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm07_auth_behavior_bc__default(),
         new Object[] {
             new Object[] {
            BC00142_A627TBM07_CRT_DATETIME, BC00142_n627TBM07_CRT_DATETIME, BC00142_A628TBM07_CRT_USER_ID, BC00142_n628TBM07_CRT_USER_ID, BC00142_A630TBM07_UPD_DATETIME, BC00142_n630TBM07_UPD_DATETIME, BC00142_A631TBM07_UPD_USER_ID, BC00142_n631TBM07_UPD_USER_ID, BC00142_A633TBM07_UPD_CNT, BC00142_n633TBM07_UPD_CNT,
            BC00142_A623TBM07_CRF_INP_AUTH_FLG, BC00142_n623TBM07_CRF_INP_AUTH_FLG, BC00142_A624TBM07_CRF_EDIT_AUTH_FLG, BC00142_n624TBM07_CRF_EDIT_AUTH_FLG, BC00142_A625TBM07_OTHER_SITE_VIEW_FLG, BC00142_n625TBM07_OTHER_SITE_VIEW_FLG, BC00142_A626TBM07_DEL_FLG, BC00142_n626TBM07_DEL_FLG, BC00142_A629TBM07_CRT_PROG_NM, BC00142_n629TBM07_CRT_PROG_NM,
            BC00142_A632TBM07_UPD_PROG_NM, BC00142_n632TBM07_UPD_PROG_NM, BC00142_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC00143_A627TBM07_CRT_DATETIME, BC00143_n627TBM07_CRT_DATETIME, BC00143_A628TBM07_CRT_USER_ID, BC00143_n628TBM07_CRT_USER_ID, BC00143_A630TBM07_UPD_DATETIME, BC00143_n630TBM07_UPD_DATETIME, BC00143_A631TBM07_UPD_USER_ID, BC00143_n631TBM07_UPD_USER_ID, BC00143_A633TBM07_UPD_CNT, BC00143_n633TBM07_UPD_CNT,
            BC00143_A623TBM07_CRF_INP_AUTH_FLG, BC00143_n623TBM07_CRF_INP_AUTH_FLG, BC00143_A624TBM07_CRF_EDIT_AUTH_FLG, BC00143_n624TBM07_CRF_EDIT_AUTH_FLG, BC00143_A625TBM07_OTHER_SITE_VIEW_FLG, BC00143_n625TBM07_OTHER_SITE_VIEW_FLG, BC00143_A626TBM07_DEL_FLG, BC00143_n626TBM07_DEL_FLG, BC00143_A629TBM07_CRT_PROG_NM, BC00143_n629TBM07_CRT_PROG_NM,
            BC00143_A632TBM07_UPD_PROG_NM, BC00143_n632TBM07_UPD_PROG_NM, BC00143_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC00144_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC00145_A627TBM07_CRT_DATETIME, BC00145_n627TBM07_CRT_DATETIME, BC00145_A628TBM07_CRT_USER_ID, BC00145_n628TBM07_CRT_USER_ID, BC00145_A630TBM07_UPD_DATETIME, BC00145_n630TBM07_UPD_DATETIME, BC00145_A631TBM07_UPD_USER_ID, BC00145_n631TBM07_UPD_USER_ID, BC00145_A633TBM07_UPD_CNT, BC00145_n633TBM07_UPD_CNT,
            BC00145_A623TBM07_CRF_INP_AUTH_FLG, BC00145_n623TBM07_CRF_INP_AUTH_FLG, BC00145_A624TBM07_CRF_EDIT_AUTH_FLG, BC00145_n624TBM07_CRF_EDIT_AUTH_FLG, BC00145_A625TBM07_OTHER_SITE_VIEW_FLG, BC00145_n625TBM07_OTHER_SITE_VIEW_FLG, BC00145_A626TBM07_DEL_FLG, BC00145_n626TBM07_DEL_FLG, BC00145_A629TBM07_CRT_PROG_NM, BC00145_n629TBM07_CRT_PROG_NM,
            BC00145_A632TBM07_UPD_PROG_NM, BC00145_n632TBM07_UPD_PROG_NM, BC00145_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC00146_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC00147_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC00148_A627TBM07_CRT_DATETIME, BC00148_n627TBM07_CRT_DATETIME, BC00148_A628TBM07_CRT_USER_ID, BC00148_n628TBM07_CRT_USER_ID, BC00148_A630TBM07_UPD_DATETIME, BC00148_n630TBM07_UPD_DATETIME, BC00148_A631TBM07_UPD_USER_ID, BC00148_n631TBM07_UPD_USER_ID, BC00148_A633TBM07_UPD_CNT, BC00148_n633TBM07_UPD_CNT,
            BC00148_A623TBM07_CRF_INP_AUTH_FLG, BC00148_n623TBM07_CRF_INP_AUTH_FLG, BC00148_A624TBM07_CRF_EDIT_AUTH_FLG, BC00148_n624TBM07_CRF_EDIT_AUTH_FLG, BC00148_A625TBM07_OTHER_SITE_VIEW_FLG, BC00148_n625TBM07_OTHER_SITE_VIEW_FLG, BC00148_A626TBM07_DEL_FLG, BC00148_n626TBM07_DEL_FLG, BC00148_A629TBM07_CRT_PROG_NM, BC00148_n629TBM07_CRT_PROG_NM,
            BC00148_A632TBM07_UPD_PROG_NM, BC00148_n632TBM07_UPD_PROG_NM, BC00148_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC00149_A627TBM07_CRT_DATETIME, BC00149_n627TBM07_CRT_DATETIME, BC00149_A628TBM07_CRT_USER_ID, BC00149_n628TBM07_CRT_USER_ID, BC00149_A630TBM07_UPD_DATETIME, BC00149_n630TBM07_UPD_DATETIME, BC00149_A631TBM07_UPD_USER_ID, BC00149_n631TBM07_UPD_USER_ID, BC00149_A633TBM07_UPD_CNT, BC00149_n633TBM07_UPD_CNT,
            BC00149_A623TBM07_CRF_INP_AUTH_FLG, BC00149_n623TBM07_CRF_INP_AUTH_FLG, BC00149_A624TBM07_CRF_EDIT_AUTH_FLG, BC00149_n624TBM07_CRF_EDIT_AUTH_FLG, BC00149_A625TBM07_OTHER_SITE_VIEW_FLG, BC00149_n625TBM07_OTHER_SITE_VIEW_FLG, BC00149_A626TBM07_DEL_FLG, BC00149_n626TBM07_DEL_FLG, BC00149_A629TBM07_CRT_PROG_NM, BC00149_n629TBM07_CRT_PROG_NM,
            BC00149_A632TBM07_UPD_PROG_NM, BC00149_n632TBM07_UPD_PROG_NM, BC00149_A50TBM07_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001413_A627TBM07_CRT_DATETIME, BC001413_n627TBM07_CRT_DATETIME, BC001413_A628TBM07_CRT_USER_ID, BC001413_n628TBM07_CRT_USER_ID, BC001413_A630TBM07_UPD_DATETIME, BC001413_n630TBM07_UPD_DATETIME, BC001413_A631TBM07_UPD_USER_ID, BC001413_n631TBM07_UPD_USER_ID, BC001413_A633TBM07_UPD_CNT, BC001413_n633TBM07_UPD_CNT,
            BC001413_A623TBM07_CRF_INP_AUTH_FLG, BC001413_n623TBM07_CRF_INP_AUTH_FLG, BC001413_A624TBM07_CRF_EDIT_AUTH_FLG, BC001413_n624TBM07_CRF_EDIT_AUTH_FLG, BC001413_A625TBM07_OTHER_SITE_VIEW_FLG, BC001413_n625TBM07_OTHER_SITE_VIEW_FLG, BC001413_A626TBM07_DEL_FLG, BC001413_n626TBM07_DEL_FLG, BC001413_A629TBM07_CRT_PROG_NM, BC001413_n629TBM07_CRT_PROG_NM,
            BC001413_A632TBM07_UPD_PROG_NM, BC001413_n632TBM07_UPD_PROG_NM, BC001413_A50TBM07_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11152 */
      e11152 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound39 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long A633TBM07_UPD_CNT ;
   private long Z633TBM07_UPD_CNT ;
   private long O633TBM07_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode39 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A627TBM07_CRT_DATETIME ;
   private java.util.Date A630TBM07_UPD_DATETIME ;
   private java.util.Date Z627TBM07_CRT_DATETIME ;
   private java.util.Date Z630TBM07_UPD_DATETIME ;
   private boolean n627TBM07_CRT_DATETIME ;
   private boolean n628TBM07_CRT_USER_ID ;
   private boolean n630TBM07_UPD_DATETIME ;
   private boolean n631TBM07_UPD_USER_ID ;
   private boolean n633TBM07_UPD_CNT ;
   private boolean n623TBM07_CRF_INP_AUTH_FLG ;
   private boolean n624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean n625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean n626TBM07_DEL_FLG ;
   private boolean n629TBM07_CRT_PROG_NM ;
   private boolean n632TBM07_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z50TBM07_AUTH_CD ;
   private String A50TBM07_AUTH_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A623TBM07_CRF_INP_AUTH_FLG ;
   private String A624TBM07_CRF_EDIT_AUTH_FLG ;
   private String A625TBM07_OTHER_SITE_VIEW_FLG ;
   private String A626TBM07_DEL_FLG ;
   private String A628TBM07_CRT_USER_ID ;
   private String A629TBM07_CRT_PROG_NM ;
   private String A631TBM07_UPD_USER_ID ;
   private String A632TBM07_UPD_PROG_NM ;
   private String Z628TBM07_CRT_USER_ID ;
   private String Z631TBM07_UPD_USER_ID ;
   private String Z623TBM07_CRF_INP_AUTH_FLG ;
   private String Z624TBM07_CRF_EDIT_AUTH_FLG ;
   private String Z625TBM07_OTHER_SITE_VIEW_FLG ;
   private String Z626TBM07_DEL_FLG ;
   private String Z629TBM07_CRT_PROG_NM ;
   private String Z632TBM07_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM07_AUTH_BEHAVIOR bcTBM07_AUTH_BEHAVIOR ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC00145_A627TBM07_CRT_DATETIME ;
   private boolean[] BC00145_n627TBM07_CRT_DATETIME ;
   private String[] BC00145_A628TBM07_CRT_USER_ID ;
   private boolean[] BC00145_n628TBM07_CRT_USER_ID ;
   private java.util.Date[] BC00145_A630TBM07_UPD_DATETIME ;
   private boolean[] BC00145_n630TBM07_UPD_DATETIME ;
   private String[] BC00145_A631TBM07_UPD_USER_ID ;
   private boolean[] BC00145_n631TBM07_UPD_USER_ID ;
   private long[] BC00145_A633TBM07_UPD_CNT ;
   private boolean[] BC00145_n633TBM07_UPD_CNT ;
   private String[] BC00145_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC00145_n623TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC00145_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC00145_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC00145_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC00145_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC00145_A626TBM07_DEL_FLG ;
   private boolean[] BC00145_n626TBM07_DEL_FLG ;
   private String[] BC00145_A629TBM07_CRT_PROG_NM ;
   private boolean[] BC00145_n629TBM07_CRT_PROG_NM ;
   private String[] BC00145_A632TBM07_UPD_PROG_NM ;
   private boolean[] BC00145_n632TBM07_UPD_PROG_NM ;
   private String[] BC00145_A50TBM07_AUTH_CD ;
   private String[] BC00146_A50TBM07_AUTH_CD ;
   private String[] BC00147_A50TBM07_AUTH_CD ;
   private java.util.Date[] BC00148_A627TBM07_CRT_DATETIME ;
   private boolean[] BC00148_n627TBM07_CRT_DATETIME ;
   private String[] BC00148_A628TBM07_CRT_USER_ID ;
   private boolean[] BC00148_n628TBM07_CRT_USER_ID ;
   private java.util.Date[] BC00148_A630TBM07_UPD_DATETIME ;
   private boolean[] BC00148_n630TBM07_UPD_DATETIME ;
   private String[] BC00148_A631TBM07_UPD_USER_ID ;
   private boolean[] BC00148_n631TBM07_UPD_USER_ID ;
   private long[] BC00148_A633TBM07_UPD_CNT ;
   private boolean[] BC00148_n633TBM07_UPD_CNT ;
   private String[] BC00148_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC00148_n623TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC00148_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC00148_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC00148_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC00148_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC00148_A626TBM07_DEL_FLG ;
   private boolean[] BC00148_n626TBM07_DEL_FLG ;
   private String[] BC00148_A629TBM07_CRT_PROG_NM ;
   private boolean[] BC00148_n629TBM07_CRT_PROG_NM ;
   private String[] BC00148_A632TBM07_UPD_PROG_NM ;
   private boolean[] BC00148_n632TBM07_UPD_PROG_NM ;
   private String[] BC00148_A50TBM07_AUTH_CD ;
   private java.util.Date[] BC00149_A627TBM07_CRT_DATETIME ;
   private boolean[] BC00149_n627TBM07_CRT_DATETIME ;
   private String[] BC00149_A628TBM07_CRT_USER_ID ;
   private boolean[] BC00149_n628TBM07_CRT_USER_ID ;
   private java.util.Date[] BC00149_A630TBM07_UPD_DATETIME ;
   private boolean[] BC00149_n630TBM07_UPD_DATETIME ;
   private String[] BC00149_A631TBM07_UPD_USER_ID ;
   private boolean[] BC00149_n631TBM07_UPD_USER_ID ;
   private long[] BC00149_A633TBM07_UPD_CNT ;
   private boolean[] BC00149_n633TBM07_UPD_CNT ;
   private String[] BC00149_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC00149_n623TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC00149_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC00149_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC00149_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC00149_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC00149_A626TBM07_DEL_FLG ;
   private boolean[] BC00149_n626TBM07_DEL_FLG ;
   private String[] BC00149_A629TBM07_CRT_PROG_NM ;
   private boolean[] BC00149_n629TBM07_CRT_PROG_NM ;
   private String[] BC00149_A632TBM07_UPD_PROG_NM ;
   private boolean[] BC00149_n632TBM07_UPD_PROG_NM ;
   private String[] BC00149_A50TBM07_AUTH_CD ;
   private java.util.Date[] BC001413_A627TBM07_CRT_DATETIME ;
   private boolean[] BC001413_n627TBM07_CRT_DATETIME ;
   private String[] BC001413_A628TBM07_CRT_USER_ID ;
   private boolean[] BC001413_n628TBM07_CRT_USER_ID ;
   private java.util.Date[] BC001413_A630TBM07_UPD_DATETIME ;
   private boolean[] BC001413_n630TBM07_UPD_DATETIME ;
   private String[] BC001413_A631TBM07_UPD_USER_ID ;
   private boolean[] BC001413_n631TBM07_UPD_USER_ID ;
   private long[] BC001413_A633TBM07_UPD_CNT ;
   private boolean[] BC001413_n633TBM07_UPD_CNT ;
   private String[] BC001413_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC001413_n623TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC001413_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC001413_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC001413_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC001413_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC001413_A626TBM07_DEL_FLG ;
   private boolean[] BC001413_n626TBM07_DEL_FLG ;
   private String[] BC001413_A629TBM07_CRT_PROG_NM ;
   private boolean[] BC001413_n629TBM07_CRT_PROG_NM ;
   private String[] BC001413_A632TBM07_UPD_PROG_NM ;
   private boolean[] BC001413_n632TBM07_UPD_PROG_NM ;
   private String[] BC001413_A50TBM07_AUTH_CD ;
   private java.util.Date[] BC00142_A627TBM07_CRT_DATETIME ;
   private String[] BC00142_A628TBM07_CRT_USER_ID ;
   private java.util.Date[] BC00142_A630TBM07_UPD_DATETIME ;
   private String[] BC00142_A631TBM07_UPD_USER_ID ;
   private long[] BC00142_A633TBM07_UPD_CNT ;
   private String[] BC00142_A623TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC00142_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC00142_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC00142_A626TBM07_DEL_FLG ;
   private String[] BC00142_A629TBM07_CRT_PROG_NM ;
   private String[] BC00142_A632TBM07_UPD_PROG_NM ;
   private String[] BC00142_A50TBM07_AUTH_CD ;
   private java.util.Date[] BC00143_A627TBM07_CRT_DATETIME ;
   private String[] BC00143_A628TBM07_CRT_USER_ID ;
   private java.util.Date[] BC00143_A630TBM07_UPD_DATETIME ;
   private String[] BC00143_A631TBM07_UPD_USER_ID ;
   private long[] BC00143_A633TBM07_UPD_CNT ;
   private String[] BC00143_A623TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC00143_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC00143_A625TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC00143_A626TBM07_DEL_FLG ;
   private String[] BC00143_A629TBM07_CRT_PROG_NM ;
   private String[] BC00143_A632TBM07_UPD_PROG_NM ;
   private String[] BC00143_A50TBM07_AUTH_CD ;
   private String[] BC00144_A50TBM07_AUTH_CD ;
   private boolean[] BC00142_n627TBM07_CRT_DATETIME ;
   private boolean[] BC00142_n628TBM07_CRT_USER_ID ;
   private boolean[] BC00142_n630TBM07_UPD_DATETIME ;
   private boolean[] BC00142_n631TBM07_UPD_USER_ID ;
   private boolean[] BC00142_n633TBM07_UPD_CNT ;
   private boolean[] BC00142_n623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC00142_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC00142_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC00142_n626TBM07_DEL_FLG ;
   private boolean[] BC00142_n629TBM07_CRT_PROG_NM ;
   private boolean[] BC00142_n632TBM07_UPD_PROG_NM ;
   private boolean[] BC00143_n627TBM07_CRT_DATETIME ;
   private boolean[] BC00143_n628TBM07_CRT_USER_ID ;
   private boolean[] BC00143_n630TBM07_UPD_DATETIME ;
   private boolean[] BC00143_n631TBM07_UPD_USER_ID ;
   private boolean[] BC00143_n633TBM07_UPD_CNT ;
   private boolean[] BC00143_n623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC00143_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC00143_n625TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC00143_n626TBM07_DEL_FLG ;
   private boolean[] BC00143_n629TBM07_CRT_PROG_NM ;
   private boolean[] BC00143_n632TBM07_UPD_PROG_NM ;
}

final  class tbm07_auth_behavior_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00142", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00143", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00144", "SELECT `TAM04_AUTH_CD` AS TBM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00145", "SELECT TM1.`TBM07_CRT_DATETIME`, TM1.`TBM07_CRT_USER_ID`, TM1.`TBM07_UPD_DATETIME`, TM1.`TBM07_UPD_USER_ID`, TM1.`TBM07_UPD_CNT`, TM1.`TBM07_CRF_INP_AUTH_FLG`, TM1.`TBM07_CRF_EDIT_AUTH_FLG`, TM1.`TBM07_OTHER_SITE_VIEW_FLG`, TM1.`TBM07_DEL_FLG`, TM1.`TBM07_CRT_PROG_NM`, TM1.`TBM07_UPD_PROG_NM`, TM1.`TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` TM1 WHERE TM1.`TBM07_AUTH_CD` = ? ORDER BY TM1.`TBM07_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00146", "SELECT `TAM04_AUTH_CD` AS TBM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00147", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00148", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00149", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001410", "INSERT INTO `TBM07_AUTH_BEHAVIOR`(`TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001411", "UPDATE `TBM07_AUTH_BEHAVIOR` SET `TBM07_CRT_DATETIME`=?, `TBM07_CRT_USER_ID`=?, `TBM07_UPD_DATETIME`=?, `TBM07_UPD_USER_ID`=?, `TBM07_UPD_CNT`=?, `TBM07_CRF_INP_AUTH_FLG`=?, `TBM07_CRF_EDIT_AUTH_FLG`=?, `TBM07_OTHER_SITE_VIEW_FLG`=?, `TBM07_DEL_FLG`=?, `TBM07_CRT_PROG_NM`=?, `TBM07_UPD_PROG_NM`=?  WHERE `TBM07_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001412", "DELETE FROM `TBM07_AUTH_BEHAVIOR`  WHERE `TBM07_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001413", "SELECT TM1.`TBM07_CRT_DATETIME`, TM1.`TBM07_CRT_USER_ID`, TM1.`TBM07_UPD_DATETIME`, TM1.`TBM07_UPD_USER_ID`, TM1.`TBM07_UPD_CNT`, TM1.`TBM07_CRF_INP_AUTH_FLG`, TM1.`TBM07_CRF_EDIT_AUTH_FLG`, TM1.`TBM07_OTHER_SITE_VIEW_FLG`, TM1.`TBM07_DEL_FLG`, TM1.`TBM07_CRT_PROG_NM`, TM1.`TBM07_UPD_PROG_NM`, TM1.`TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` TM1 WHERE TM1.`TBM07_AUTH_CD` = ? ORDER BY TM1.`TBM07_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               return;
            case 11 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 8 :
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
               stmt.setVarchar(12, (String)parms[22], 2, false);
               return;
            case 9 :
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
               stmt.setVarchar(12, (String)parms[22], 2, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

