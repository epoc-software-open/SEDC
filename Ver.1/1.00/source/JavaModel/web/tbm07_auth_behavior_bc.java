/*
               File: tbm07_auth_behavior_bc
        Description: 権限別振舞マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:38.35
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e12142 */
         e12142 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z530TBM07_AUTH_CD = A530TBM07_AUTH_CD ;
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

   public void e11142( )
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

   public void e12142( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "権限コード:" + A530TBM07_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A531TBM07_CRF_INP_AUTH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A532TBM07_CRF_EDIT_AUTH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A533TBM07_OTHER_SITE_VIEW_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A534TBM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A535TBM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A536TBM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A537TBM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A538TBM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A539TBM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A540TBM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1439( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z535TBM07_CRT_DATETIME = A535TBM07_CRT_DATETIME ;
         Z536TBM07_CRT_USER_ID = A536TBM07_CRT_USER_ID ;
         Z538TBM07_UPD_DATETIME = A538TBM07_UPD_DATETIME ;
         Z539TBM07_UPD_USER_ID = A539TBM07_UPD_USER_ID ;
         Z541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
         Z531TBM07_CRF_INP_AUTH_FLG = A531TBM07_CRF_INP_AUTH_FLG ;
         Z532TBM07_CRF_EDIT_AUTH_FLG = A532TBM07_CRF_EDIT_AUTH_FLG ;
         Z533TBM07_OTHER_SITE_VIEW_FLG = A533TBM07_OTHER_SITE_VIEW_FLG ;
         Z534TBM07_DEL_FLG = A534TBM07_DEL_FLG ;
         Z537TBM07_CRT_PROG_NM = A537TBM07_CRT_PROG_NM ;
         Z540TBM07_UPD_PROG_NM = A540TBM07_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z535TBM07_CRT_DATETIME = A535TBM07_CRT_DATETIME ;
         Z536TBM07_CRT_USER_ID = A536TBM07_CRT_USER_ID ;
         Z538TBM07_UPD_DATETIME = A538TBM07_UPD_DATETIME ;
         Z539TBM07_UPD_USER_ID = A539TBM07_UPD_USER_ID ;
         Z541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
         Z531TBM07_CRF_INP_AUTH_FLG = A531TBM07_CRF_INP_AUTH_FLG ;
         Z532TBM07_CRF_EDIT_AUTH_FLG = A532TBM07_CRF_EDIT_AUTH_FLG ;
         Z533TBM07_OTHER_SITE_VIEW_FLG = A533TBM07_OTHER_SITE_VIEW_FLG ;
         Z534TBM07_DEL_FLG = A534TBM07_DEL_FLG ;
         Z537TBM07_CRT_PROG_NM = A537TBM07_CRT_PROG_NM ;
         Z540TBM07_UPD_PROG_NM = A540TBM07_UPD_PROG_NM ;
         Z530TBM07_AUTH_CD = A530TBM07_AUTH_CD ;
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
      pr_default.execute(3, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A535TBM07_CRT_DATETIME = BC00145_A535TBM07_CRT_DATETIME[0] ;
         n535TBM07_CRT_DATETIME = BC00145_n535TBM07_CRT_DATETIME[0] ;
         A536TBM07_CRT_USER_ID = BC00145_A536TBM07_CRT_USER_ID[0] ;
         n536TBM07_CRT_USER_ID = BC00145_n536TBM07_CRT_USER_ID[0] ;
         A538TBM07_UPD_DATETIME = BC00145_A538TBM07_UPD_DATETIME[0] ;
         n538TBM07_UPD_DATETIME = BC00145_n538TBM07_UPD_DATETIME[0] ;
         A539TBM07_UPD_USER_ID = BC00145_A539TBM07_UPD_USER_ID[0] ;
         n539TBM07_UPD_USER_ID = BC00145_n539TBM07_UPD_USER_ID[0] ;
         A541TBM07_UPD_CNT = BC00145_A541TBM07_UPD_CNT[0] ;
         n541TBM07_UPD_CNT = BC00145_n541TBM07_UPD_CNT[0] ;
         A531TBM07_CRF_INP_AUTH_FLG = BC00145_A531TBM07_CRF_INP_AUTH_FLG[0] ;
         n531TBM07_CRF_INP_AUTH_FLG = BC00145_n531TBM07_CRF_INP_AUTH_FLG[0] ;
         A532TBM07_CRF_EDIT_AUTH_FLG = BC00145_A532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n532TBM07_CRF_EDIT_AUTH_FLG = BC00145_n532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A533TBM07_OTHER_SITE_VIEW_FLG = BC00145_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n533TBM07_OTHER_SITE_VIEW_FLG = BC00145_n533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A534TBM07_DEL_FLG = BC00145_A534TBM07_DEL_FLG[0] ;
         n534TBM07_DEL_FLG = BC00145_n534TBM07_DEL_FLG[0] ;
         A537TBM07_CRT_PROG_NM = BC00145_A537TBM07_CRT_PROG_NM[0] ;
         n537TBM07_CRT_PROG_NM = BC00145_n537TBM07_CRT_PROG_NM[0] ;
         A540TBM07_UPD_PROG_NM = BC00145_A540TBM07_UPD_PROG_NM[0] ;
         n540TBM07_UPD_PROG_NM = BC00145_n540TBM07_UPD_PROG_NM[0] ;
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
      /* Using cursor BC00144 */
      pr_default.execute(2, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError530 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'権限別振舞マスタ・権限サブタイプ'", "ForeignKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
      }
      if ( AnyError530 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A535TBM07_CRT_DATETIME) || (( A535TBM07_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A535TBM07_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A538TBM07_UPD_DATETIME) || (( A538TBM07_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A538TBM07_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1439( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey1439( )
   {
      /* Using cursor BC00146 */
      pr_default.execute(4, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00143 */
      pr_default.execute(1, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1439( 8) ;
         RcdFound39 = (short)(1) ;
         A535TBM07_CRT_DATETIME = BC00143_A535TBM07_CRT_DATETIME[0] ;
         n535TBM07_CRT_DATETIME = BC00143_n535TBM07_CRT_DATETIME[0] ;
         A536TBM07_CRT_USER_ID = BC00143_A536TBM07_CRT_USER_ID[0] ;
         n536TBM07_CRT_USER_ID = BC00143_n536TBM07_CRT_USER_ID[0] ;
         A538TBM07_UPD_DATETIME = BC00143_A538TBM07_UPD_DATETIME[0] ;
         n538TBM07_UPD_DATETIME = BC00143_n538TBM07_UPD_DATETIME[0] ;
         A539TBM07_UPD_USER_ID = BC00143_A539TBM07_UPD_USER_ID[0] ;
         n539TBM07_UPD_USER_ID = BC00143_n539TBM07_UPD_USER_ID[0] ;
         A541TBM07_UPD_CNT = BC00143_A541TBM07_UPD_CNT[0] ;
         n541TBM07_UPD_CNT = BC00143_n541TBM07_UPD_CNT[0] ;
         A531TBM07_CRF_INP_AUTH_FLG = BC00143_A531TBM07_CRF_INP_AUTH_FLG[0] ;
         n531TBM07_CRF_INP_AUTH_FLG = BC00143_n531TBM07_CRF_INP_AUTH_FLG[0] ;
         A532TBM07_CRF_EDIT_AUTH_FLG = BC00143_A532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n532TBM07_CRF_EDIT_AUTH_FLG = BC00143_n532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A533TBM07_OTHER_SITE_VIEW_FLG = BC00143_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n533TBM07_OTHER_SITE_VIEW_FLG = BC00143_n533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A534TBM07_DEL_FLG = BC00143_A534TBM07_DEL_FLG[0] ;
         n534TBM07_DEL_FLG = BC00143_n534TBM07_DEL_FLG[0] ;
         A537TBM07_CRT_PROG_NM = BC00143_A537TBM07_CRT_PROG_NM[0] ;
         n537TBM07_CRT_PROG_NM = BC00143_n537TBM07_CRT_PROG_NM[0] ;
         A540TBM07_UPD_PROG_NM = BC00143_A540TBM07_UPD_PROG_NM[0] ;
         n540TBM07_UPD_PROG_NM = BC00143_n540TBM07_UPD_PROG_NM[0] ;
         A530TBM07_AUTH_CD = BC00143_A530TBM07_AUTH_CD[0] ;
         O541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
         n541TBM07_UPD_CNT = false ;
         Z530TBM07_AUTH_CD = A530TBM07_AUTH_CD ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1439( ) ;
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
      pr_default.close(1);
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
         /* Using cursor BC00142 */
         pr_default.execute(0, new Object[] {A530TBM07_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z535TBM07_CRT_DATETIME.equals( BC00142_A535TBM07_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z536TBM07_CRT_USER_ID, BC00142_A536TBM07_CRT_USER_ID[0]) != 0 ) || !( Z538TBM07_UPD_DATETIME.equals( BC00142_A538TBM07_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z539TBM07_UPD_USER_ID, BC00142_A539TBM07_UPD_USER_ID[0]) != 0 ) || ( Z541TBM07_UPD_CNT != BC00142_A541TBM07_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z531TBM07_CRF_INP_AUTH_FLG, BC00142_A531TBM07_CRF_INP_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z532TBM07_CRF_EDIT_AUTH_FLG, BC00142_A532TBM07_CRF_EDIT_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z533TBM07_OTHER_SITE_VIEW_FLG, BC00142_A533TBM07_OTHER_SITE_VIEW_FLG[0]) != 0 ) || ( GXutil.strcmp(Z534TBM07_DEL_FLG, BC00142_A534TBM07_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z537TBM07_CRT_PROG_NM, BC00142_A537TBM07_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z540TBM07_UPD_PROG_NM, BC00142_A540TBM07_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor BC00147 */
                  pr_default.execute(5, new Object[] {new Boolean(n535TBM07_CRT_DATETIME), A535TBM07_CRT_DATETIME, new Boolean(n536TBM07_CRT_USER_ID), A536TBM07_CRT_USER_ID, new Boolean(n538TBM07_UPD_DATETIME), A538TBM07_UPD_DATETIME, new Boolean(n539TBM07_UPD_USER_ID), A539TBM07_UPD_USER_ID, new Boolean(n541TBM07_UPD_CNT), new Long(A541TBM07_UPD_CNT), new Boolean(n531TBM07_CRF_INP_AUTH_FLG), A531TBM07_CRF_INP_AUTH_FLG, new Boolean(n532TBM07_CRF_EDIT_AUTH_FLG), A532TBM07_CRF_EDIT_AUTH_FLG, new Boolean(n533TBM07_OTHER_SITE_VIEW_FLG), A533TBM07_OTHER_SITE_VIEW_FLG, new Boolean(n534TBM07_DEL_FLG), A534TBM07_DEL_FLG, new Boolean(n537TBM07_CRT_PROG_NM), A537TBM07_CRT_PROG_NM, new Boolean(n540TBM07_UPD_PROG_NM), A540TBM07_UPD_PROG_NM, A530TBM07_AUTH_CD});
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
                  /* Using cursor BC00148 */
                  pr_default.execute(6, new Object[] {new Boolean(n535TBM07_CRT_DATETIME), A535TBM07_CRT_DATETIME, new Boolean(n536TBM07_CRT_USER_ID), A536TBM07_CRT_USER_ID, new Boolean(n538TBM07_UPD_DATETIME), A538TBM07_UPD_DATETIME, new Boolean(n539TBM07_UPD_USER_ID), A539TBM07_UPD_USER_ID, new Boolean(n541TBM07_UPD_CNT), new Long(A541TBM07_UPD_CNT), new Boolean(n531TBM07_CRF_INP_AUTH_FLG), A531TBM07_CRF_INP_AUTH_FLG, new Boolean(n532TBM07_CRF_EDIT_AUTH_FLG), A532TBM07_CRF_EDIT_AUTH_FLG, new Boolean(n533TBM07_OTHER_SITE_VIEW_FLG), A533TBM07_OTHER_SITE_VIEW_FLG, new Boolean(n534TBM07_DEL_FLG), A534TBM07_DEL_FLG, new Boolean(n537TBM07_CRT_PROG_NM), A537TBM07_CRT_PROG_NM, new Boolean(n540TBM07_UPD_PROG_NM), A540TBM07_UPD_PROG_NM, A530TBM07_AUTH_CD});
                  if ( (pr_default.getStatus(6) == 103) )
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
               /* Using cursor BC00149 */
               pr_default.execute(7, new Object[] {A530TBM07_AUTH_CD});
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
         pr_default.close(0);
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
      /* Using cursor BC001410 */
      pr_default.execute(8, new Object[] {A530TBM07_AUTH_CD});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A535TBM07_CRT_DATETIME = BC001410_A535TBM07_CRT_DATETIME[0] ;
         n535TBM07_CRT_DATETIME = BC001410_n535TBM07_CRT_DATETIME[0] ;
         A536TBM07_CRT_USER_ID = BC001410_A536TBM07_CRT_USER_ID[0] ;
         n536TBM07_CRT_USER_ID = BC001410_n536TBM07_CRT_USER_ID[0] ;
         A538TBM07_UPD_DATETIME = BC001410_A538TBM07_UPD_DATETIME[0] ;
         n538TBM07_UPD_DATETIME = BC001410_n538TBM07_UPD_DATETIME[0] ;
         A539TBM07_UPD_USER_ID = BC001410_A539TBM07_UPD_USER_ID[0] ;
         n539TBM07_UPD_USER_ID = BC001410_n539TBM07_UPD_USER_ID[0] ;
         A541TBM07_UPD_CNT = BC001410_A541TBM07_UPD_CNT[0] ;
         n541TBM07_UPD_CNT = BC001410_n541TBM07_UPD_CNT[0] ;
         A531TBM07_CRF_INP_AUTH_FLG = BC001410_A531TBM07_CRF_INP_AUTH_FLG[0] ;
         n531TBM07_CRF_INP_AUTH_FLG = BC001410_n531TBM07_CRF_INP_AUTH_FLG[0] ;
         A532TBM07_CRF_EDIT_AUTH_FLG = BC001410_A532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n532TBM07_CRF_EDIT_AUTH_FLG = BC001410_n532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A533TBM07_OTHER_SITE_VIEW_FLG = BC001410_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n533TBM07_OTHER_SITE_VIEW_FLG = BC001410_n533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A534TBM07_DEL_FLG = BC001410_A534TBM07_DEL_FLG[0] ;
         n534TBM07_DEL_FLG = BC001410_n534TBM07_DEL_FLG[0] ;
         A537TBM07_CRT_PROG_NM = BC001410_A537TBM07_CRT_PROG_NM[0] ;
         n537TBM07_CRT_PROG_NM = BC001410_n537TBM07_CRT_PROG_NM[0] ;
         A540TBM07_UPD_PROG_NM = BC001410_A540TBM07_UPD_PROG_NM[0] ;
         n540TBM07_UPD_PROG_NM = BC001410_n540TBM07_UPD_PROG_NM[0] ;
         A530TBM07_AUTH_CD = BC001410_A530TBM07_AUTH_CD[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1439( )
   {
      pr_default.readNext(8);
      RcdFound39 = (short)(0) ;
      scanKeyLoad1439( ) ;
   }

   public void scanKeyLoad1439( )
   {
      sMode39 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A535TBM07_CRT_DATETIME = BC001410_A535TBM07_CRT_DATETIME[0] ;
         n535TBM07_CRT_DATETIME = BC001410_n535TBM07_CRT_DATETIME[0] ;
         A536TBM07_CRT_USER_ID = BC001410_A536TBM07_CRT_USER_ID[0] ;
         n536TBM07_CRT_USER_ID = BC001410_n536TBM07_CRT_USER_ID[0] ;
         A538TBM07_UPD_DATETIME = BC001410_A538TBM07_UPD_DATETIME[0] ;
         n538TBM07_UPD_DATETIME = BC001410_n538TBM07_UPD_DATETIME[0] ;
         A539TBM07_UPD_USER_ID = BC001410_A539TBM07_UPD_USER_ID[0] ;
         n539TBM07_UPD_USER_ID = BC001410_n539TBM07_UPD_USER_ID[0] ;
         A541TBM07_UPD_CNT = BC001410_A541TBM07_UPD_CNT[0] ;
         n541TBM07_UPD_CNT = BC001410_n541TBM07_UPD_CNT[0] ;
         A531TBM07_CRF_INP_AUTH_FLG = BC001410_A531TBM07_CRF_INP_AUTH_FLG[0] ;
         n531TBM07_CRF_INP_AUTH_FLG = BC001410_n531TBM07_CRF_INP_AUTH_FLG[0] ;
         A532TBM07_CRF_EDIT_AUTH_FLG = BC001410_A532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         n532TBM07_CRF_EDIT_AUTH_FLG = BC001410_n532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A533TBM07_OTHER_SITE_VIEW_FLG = BC001410_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         n533TBM07_OTHER_SITE_VIEW_FLG = BC001410_n533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A534TBM07_DEL_FLG = BC001410_A534TBM07_DEL_FLG[0] ;
         n534TBM07_DEL_FLG = BC001410_n534TBM07_DEL_FLG[0] ;
         A537TBM07_CRT_PROG_NM = BC001410_A537TBM07_CRT_PROG_NM[0] ;
         n537TBM07_CRT_PROG_NM = BC001410_n537TBM07_CRT_PROG_NM[0] ;
         A540TBM07_UPD_PROG_NM = BC001410_A540TBM07_UPD_PROG_NM[0] ;
         n540TBM07_UPD_PROG_NM = BC001410_n540TBM07_UPD_PROG_NM[0] ;
         A530TBM07_AUTH_CD = BC001410_A530TBM07_AUTH_CD[0] ;
      }
      Gx_mode = sMode39 ;
   }

   public void scanKeyEnd1439( )
   {
      pr_default.close(8);
   }

   public void afterConfirm1439( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1439( )
   {
      /* Before Insert Rules */
      A535TBM07_CRT_DATETIME = GXutil.now( ) ;
      n535TBM07_CRT_DATETIME = false ;
      GXt_char1 = A536TBM07_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      A536TBM07_CRT_USER_ID = GXt_char1 ;
      n536TBM07_CRT_USER_ID = false ;
      A538TBM07_UPD_DATETIME = GXutil.now( ) ;
      n538TBM07_UPD_DATETIME = false ;
      GXt_char1 = A539TBM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      A539TBM07_UPD_USER_ID = GXt_char1 ;
      n539TBM07_UPD_USER_ID = false ;
      A541TBM07_UPD_CNT = (long)(O541TBM07_UPD_CNT+1) ;
      n541TBM07_UPD_CNT = false ;
   }

   public void beforeUpdate1439( )
   {
      /* Before Update Rules */
      A538TBM07_UPD_DATETIME = GXutil.now( ) ;
      n538TBM07_UPD_DATETIME = false ;
      GXt_char1 = A539TBM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm07_auth_behavior_bc.this.GXt_char1 = GXv_char2[0] ;
      A539TBM07_UPD_USER_ID = GXt_char1 ;
      n539TBM07_UPD_USER_ID = false ;
      A541TBM07_UPD_CNT = (long)(O541TBM07_UPD_CNT+1) ;
      n541TBM07_UPD_CNT = false ;
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
      A535TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n535TBM07_CRT_DATETIME = false ;
      A536TBM07_CRT_USER_ID = "" ;
      n536TBM07_CRT_USER_ID = false ;
      A538TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n538TBM07_UPD_DATETIME = false ;
      A539TBM07_UPD_USER_ID = "" ;
      n539TBM07_UPD_USER_ID = false ;
      A541TBM07_UPD_CNT = 0 ;
      n541TBM07_UPD_CNT = false ;
      A531TBM07_CRF_INP_AUTH_FLG = "" ;
      n531TBM07_CRF_INP_AUTH_FLG = false ;
      A532TBM07_CRF_EDIT_AUTH_FLG = "" ;
      n532TBM07_CRF_EDIT_AUTH_FLG = false ;
      A533TBM07_OTHER_SITE_VIEW_FLG = "" ;
      n533TBM07_OTHER_SITE_VIEW_FLG = false ;
      A534TBM07_DEL_FLG = "" ;
      n534TBM07_DEL_FLG = false ;
      A537TBM07_CRT_PROG_NM = "" ;
      n537TBM07_CRT_PROG_NM = false ;
      A540TBM07_UPD_PROG_NM = "" ;
      n540TBM07_UPD_PROG_NM = false ;
      O541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
      n541TBM07_UPD_CNT = false ;
   }

   public void initAll1439( )
   {
      A530TBM07_AUTH_CD = "" ;
      initializeNonKey1439( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow39( SdtTBM07_AUTH_BEHAVIOR obj39 )
   {
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode( Gx_mode );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime( A535TBM07_CRT_DATETIME );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id( A536TBM07_CRT_USER_ID );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime( A538TBM07_UPD_DATETIME );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id( A539TBM07_UPD_USER_ID );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt( A541TBM07_UPD_CNT );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg( A531TBM07_CRF_INP_AUTH_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg( A532TBM07_CRF_EDIT_AUTH_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg( A533TBM07_OTHER_SITE_VIEW_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg( A534TBM07_DEL_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm( A537TBM07_CRT_PROG_NM );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm( A540TBM07_UPD_PROG_NM );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd( A530TBM07_AUTH_CD );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd_Z( Z530TBM07_AUTH_CD );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_Z( Z531TBM07_CRF_INP_AUTH_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_Z( Z532TBM07_CRF_EDIT_AUTH_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_Z( Z533TBM07_OTHER_SITE_VIEW_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_Z( Z534TBM07_DEL_FLG );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_Z( Z535TBM07_CRT_DATETIME );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_Z( Z536TBM07_CRT_USER_ID );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_Z( Z537TBM07_CRT_PROG_NM );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_Z( Z538TBM07_UPD_DATETIME );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_Z( Z539TBM07_UPD_USER_ID );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_Z( Z540TBM07_UPD_PROG_NM );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_Z( Z541TBM07_UPD_CNT );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_N( (byte)((byte)((n531TBM07_CRF_INP_AUTH_FLG)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_N( (byte)((byte)((n532TBM07_CRF_EDIT_AUTH_FLG)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_N( (byte)((byte)((n533TBM07_OTHER_SITE_VIEW_FLG)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_N( (byte)((byte)((n534TBM07_DEL_FLG)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_N( (byte)((byte)((n535TBM07_CRT_DATETIME)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_N( (byte)((byte)((n536TBM07_CRT_USER_ID)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_N( (byte)((byte)((n537TBM07_CRT_PROG_NM)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_N( (byte)((byte)((n538TBM07_UPD_DATETIME)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_N( (byte)((byte)((n539TBM07_UPD_USER_ID)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_N( (byte)((byte)((n540TBM07_UPD_PROG_NM)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_N( (byte)((byte)((n541TBM07_UPD_CNT)?1:0)) );
      obj39.setgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode( Gx_mode );
   }

   public void RowToVars39( SdtTBM07_AUTH_BEHAVIOR obj39 ,
                            int forceLoad )
   {
      Gx_mode = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode() ;
      A535TBM07_CRT_DATETIME = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime() ;
      n535TBM07_CRT_DATETIME = false ;
      A536TBM07_CRT_USER_ID = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id() ;
      n536TBM07_CRT_USER_ID = false ;
      A538TBM07_UPD_DATETIME = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime() ;
      n538TBM07_UPD_DATETIME = false ;
      A539TBM07_UPD_USER_ID = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id() ;
      n539TBM07_UPD_USER_ID = false ;
      A541TBM07_UPD_CNT = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt() ;
      n541TBM07_UPD_CNT = false ;
      A531TBM07_CRF_INP_AUTH_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg() ;
      n531TBM07_CRF_INP_AUTH_FLG = false ;
      A532TBM07_CRF_EDIT_AUTH_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg() ;
      n532TBM07_CRF_EDIT_AUTH_FLG = false ;
      A533TBM07_OTHER_SITE_VIEW_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg() ;
      n533TBM07_OTHER_SITE_VIEW_FLG = false ;
      A534TBM07_DEL_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg() ;
      n534TBM07_DEL_FLG = false ;
      A537TBM07_CRT_PROG_NM = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm() ;
      n537TBM07_CRT_PROG_NM = false ;
      A540TBM07_UPD_PROG_NM = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm() ;
      n540TBM07_UPD_PROG_NM = false ;
      A530TBM07_AUTH_CD = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd() ;
      Z530TBM07_AUTH_CD = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd_Z() ;
      Z531TBM07_CRF_INP_AUTH_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_Z() ;
      Z532TBM07_CRF_EDIT_AUTH_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_Z() ;
      Z533TBM07_OTHER_SITE_VIEW_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_Z() ;
      Z534TBM07_DEL_FLG = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_Z() ;
      Z535TBM07_CRT_DATETIME = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_Z() ;
      Z536TBM07_CRT_USER_ID = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_Z() ;
      Z537TBM07_CRT_PROG_NM = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_Z() ;
      Z538TBM07_UPD_DATETIME = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_Z() ;
      Z539TBM07_UPD_USER_ID = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_Z() ;
      Z540TBM07_UPD_PROG_NM = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_Z() ;
      Z541TBM07_UPD_CNT = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_Z() ;
      O541TBM07_UPD_CNT = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_Z() ;
      n531TBM07_CRF_INP_AUTH_FLG = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_N()==0)?false:true) ;
      n532TBM07_CRF_EDIT_AUTH_FLG = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_N()==0)?false:true) ;
      n533TBM07_OTHER_SITE_VIEW_FLG = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_N()==0)?false:true) ;
      n534TBM07_DEL_FLG = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_N()==0)?false:true) ;
      n535TBM07_CRT_DATETIME = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_N()==0)?false:true) ;
      n536TBM07_CRT_USER_ID = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_N()==0)?false:true) ;
      n537TBM07_CRT_PROG_NM = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_N()==0)?false:true) ;
      n538TBM07_UPD_DATETIME = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_N()==0)?false:true) ;
      n539TBM07_UPD_USER_ID = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_N()==0)?false:true) ;
      n540TBM07_UPD_PROG_NM = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_N()==0)?false:true) ;
      n541TBM07_UPD_CNT = (boolean)((obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj39.getgxTv_SdtTBM07_AUTH_BEHAVIOR_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A530TBM07_AUTH_CD = (String)getParm(obj,0) ;
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
         Z530TBM07_AUTH_CD = A530TBM07_AUTH_CD ;
         O541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
         n541TBM07_UPD_CNT = false ;
      }
      zm1439( -8) ;
      sMode39 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1439( ) ;
      Gx_mode = sMode39 ;
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
      if ( RcdFound39 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A530TBM07_AUTH_CD, Z530TBM07_AUTH_CD) != 0 )
         {
            A530TBM07_AUTH_CD = Z530TBM07_AUTH_CD ;
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
            if ( GXutil.strcmp(A530TBM07_AUTH_CD, Z530TBM07_AUTH_CD) != 0 )
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
         else if ( GXutil.strcmp(A530TBM07_AUTH_CD, Z530TBM07_AUTH_CD) != 0 )
         {
            A530TBM07_AUTH_CD = Z530TBM07_AUTH_CD ;
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
         if ( GXutil.strcmp(A530TBM07_AUTH_CD, Z530TBM07_AUTH_CD) != 0 )
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
      Z530TBM07_AUTH_CD = "" ;
      A530TBM07_AUTH_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A531TBM07_CRF_INP_AUTH_FLG = "" ;
      A532TBM07_CRF_EDIT_AUTH_FLG = "" ;
      A533TBM07_OTHER_SITE_VIEW_FLG = "" ;
      A534TBM07_DEL_FLG = "" ;
      A535TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A536TBM07_CRT_USER_ID = "" ;
      A537TBM07_CRT_PROG_NM = "" ;
      A538TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A539TBM07_UPD_USER_ID = "" ;
      A540TBM07_UPD_PROG_NM = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd_Z = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_Z = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_Z = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_Z = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_Z = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_Z = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_Z = "" ;
      gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_Z = "" ;
      Z535TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z536TBM07_CRT_USER_ID = "" ;
      Z538TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z539TBM07_UPD_USER_ID = "" ;
      Z531TBM07_CRF_INP_AUTH_FLG = "" ;
      Z532TBM07_CRF_EDIT_AUTH_FLG = "" ;
      Z533TBM07_OTHER_SITE_VIEW_FLG = "" ;
      Z534TBM07_DEL_FLG = "" ;
      Z537TBM07_CRT_PROG_NM = "" ;
      Z540TBM07_UPD_PROG_NM = "" ;
      BC00145_A535TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00145_n535TBM07_CRT_DATETIME = new boolean[] {false} ;
      BC00145_A536TBM07_CRT_USER_ID = new String[] {""} ;
      BC00145_n536TBM07_CRT_USER_ID = new boolean[] {false} ;
      BC00145_A538TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00145_n538TBM07_UPD_DATETIME = new boolean[] {false} ;
      BC00145_A539TBM07_UPD_USER_ID = new String[] {""} ;
      BC00145_n539TBM07_UPD_USER_ID = new boolean[] {false} ;
      BC00145_A541TBM07_UPD_CNT = new long[1] ;
      BC00145_n541TBM07_UPD_CNT = new boolean[] {false} ;
      BC00145_A531TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      BC00145_n531TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      BC00145_A532TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      BC00145_n532TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      BC00145_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      BC00145_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      BC00145_A534TBM07_DEL_FLG = new String[] {""} ;
      BC00145_n534TBM07_DEL_FLG = new boolean[] {false} ;
      BC00145_A537TBM07_CRT_PROG_NM = new String[] {""} ;
      BC00145_n537TBM07_CRT_PROG_NM = new boolean[] {false} ;
      BC00145_A540TBM07_UPD_PROG_NM = new String[] {""} ;
      BC00145_n540TBM07_UPD_PROG_NM = new boolean[] {false} ;
      BC00145_A530TBM07_AUTH_CD = new String[] {""} ;
      BC00144_A530TBM07_AUTH_CD = new String[] {""} ;
      BC00146_A530TBM07_AUTH_CD = new String[] {""} ;
      BC00143_A535TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00143_n535TBM07_CRT_DATETIME = new boolean[] {false} ;
      BC00143_A536TBM07_CRT_USER_ID = new String[] {""} ;
      BC00143_n536TBM07_CRT_USER_ID = new boolean[] {false} ;
      BC00143_A538TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00143_n538TBM07_UPD_DATETIME = new boolean[] {false} ;
      BC00143_A539TBM07_UPD_USER_ID = new String[] {""} ;
      BC00143_n539TBM07_UPD_USER_ID = new boolean[] {false} ;
      BC00143_A541TBM07_UPD_CNT = new long[1] ;
      BC00143_n541TBM07_UPD_CNT = new boolean[] {false} ;
      BC00143_A531TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      BC00143_n531TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      BC00143_A532TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      BC00143_n532TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      BC00143_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      BC00143_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      BC00143_A534TBM07_DEL_FLG = new String[] {""} ;
      BC00143_n534TBM07_DEL_FLG = new boolean[] {false} ;
      BC00143_A537TBM07_CRT_PROG_NM = new String[] {""} ;
      BC00143_n537TBM07_CRT_PROG_NM = new boolean[] {false} ;
      BC00143_A540TBM07_UPD_PROG_NM = new String[] {""} ;
      BC00143_n540TBM07_UPD_PROG_NM = new boolean[] {false} ;
      BC00143_A530TBM07_AUTH_CD = new String[] {""} ;
      sMode39 = "" ;
      BC00142_A535TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00142_n535TBM07_CRT_DATETIME = new boolean[] {false} ;
      BC00142_A536TBM07_CRT_USER_ID = new String[] {""} ;
      BC00142_n536TBM07_CRT_USER_ID = new boolean[] {false} ;
      BC00142_A538TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00142_n538TBM07_UPD_DATETIME = new boolean[] {false} ;
      BC00142_A539TBM07_UPD_USER_ID = new String[] {""} ;
      BC00142_n539TBM07_UPD_USER_ID = new boolean[] {false} ;
      BC00142_A541TBM07_UPD_CNT = new long[1] ;
      BC00142_n541TBM07_UPD_CNT = new boolean[] {false} ;
      BC00142_A531TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      BC00142_n531TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      BC00142_A532TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      BC00142_n532TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      BC00142_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      BC00142_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      BC00142_A534TBM07_DEL_FLG = new String[] {""} ;
      BC00142_n534TBM07_DEL_FLG = new boolean[] {false} ;
      BC00142_A537TBM07_CRT_PROG_NM = new String[] {""} ;
      BC00142_n537TBM07_CRT_PROG_NM = new boolean[] {false} ;
      BC00142_A540TBM07_UPD_PROG_NM = new String[] {""} ;
      BC00142_n540TBM07_UPD_PROG_NM = new boolean[] {false} ;
      BC00142_A530TBM07_AUTH_CD = new String[] {""} ;
      BC001410_A535TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001410_n535TBM07_CRT_DATETIME = new boolean[] {false} ;
      BC001410_A536TBM07_CRT_USER_ID = new String[] {""} ;
      BC001410_n536TBM07_CRT_USER_ID = new boolean[] {false} ;
      BC001410_A538TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001410_n538TBM07_UPD_DATETIME = new boolean[] {false} ;
      BC001410_A539TBM07_UPD_USER_ID = new String[] {""} ;
      BC001410_n539TBM07_UPD_USER_ID = new boolean[] {false} ;
      BC001410_A541TBM07_UPD_CNT = new long[1] ;
      BC001410_n541TBM07_UPD_CNT = new boolean[] {false} ;
      BC001410_A531TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      BC001410_n531TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      BC001410_A532TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      BC001410_n532TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      BC001410_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      BC001410_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      BC001410_A534TBM07_DEL_FLG = new String[] {""} ;
      BC001410_n534TBM07_DEL_FLG = new boolean[] {false} ;
      BC001410_A537TBM07_CRT_PROG_NM = new String[] {""} ;
      BC001410_n537TBM07_CRT_PROG_NM = new boolean[] {false} ;
      BC001410_A540TBM07_UPD_PROG_NM = new String[] {""} ;
      BC001410_n540TBM07_UPD_PROG_NM = new boolean[] {false} ;
      BC001410_A530TBM07_AUTH_CD = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm07_auth_behavior_bc__default(),
         new Object[] {
             new Object[] {
            BC00142_A535TBM07_CRT_DATETIME, BC00142_n535TBM07_CRT_DATETIME, BC00142_A536TBM07_CRT_USER_ID, BC00142_n536TBM07_CRT_USER_ID, BC00142_A538TBM07_UPD_DATETIME, BC00142_n538TBM07_UPD_DATETIME, BC00142_A539TBM07_UPD_USER_ID, BC00142_n539TBM07_UPD_USER_ID, BC00142_A541TBM07_UPD_CNT, BC00142_n541TBM07_UPD_CNT,
            BC00142_A531TBM07_CRF_INP_AUTH_FLG, BC00142_n531TBM07_CRF_INP_AUTH_FLG, BC00142_A532TBM07_CRF_EDIT_AUTH_FLG, BC00142_n532TBM07_CRF_EDIT_AUTH_FLG, BC00142_A533TBM07_OTHER_SITE_VIEW_FLG, BC00142_n533TBM07_OTHER_SITE_VIEW_FLG, BC00142_A534TBM07_DEL_FLG, BC00142_n534TBM07_DEL_FLG, BC00142_A537TBM07_CRT_PROG_NM, BC00142_n537TBM07_CRT_PROG_NM,
            BC00142_A540TBM07_UPD_PROG_NM, BC00142_n540TBM07_UPD_PROG_NM, BC00142_A530TBM07_AUTH_CD
            }
            , new Object[] {
            BC00143_A535TBM07_CRT_DATETIME, BC00143_n535TBM07_CRT_DATETIME, BC00143_A536TBM07_CRT_USER_ID, BC00143_n536TBM07_CRT_USER_ID, BC00143_A538TBM07_UPD_DATETIME, BC00143_n538TBM07_UPD_DATETIME, BC00143_A539TBM07_UPD_USER_ID, BC00143_n539TBM07_UPD_USER_ID, BC00143_A541TBM07_UPD_CNT, BC00143_n541TBM07_UPD_CNT,
            BC00143_A531TBM07_CRF_INP_AUTH_FLG, BC00143_n531TBM07_CRF_INP_AUTH_FLG, BC00143_A532TBM07_CRF_EDIT_AUTH_FLG, BC00143_n532TBM07_CRF_EDIT_AUTH_FLG, BC00143_A533TBM07_OTHER_SITE_VIEW_FLG, BC00143_n533TBM07_OTHER_SITE_VIEW_FLG, BC00143_A534TBM07_DEL_FLG, BC00143_n534TBM07_DEL_FLG, BC00143_A537TBM07_CRT_PROG_NM, BC00143_n537TBM07_CRT_PROG_NM,
            BC00143_A540TBM07_UPD_PROG_NM, BC00143_n540TBM07_UPD_PROG_NM, BC00143_A530TBM07_AUTH_CD
            }
            , new Object[] {
            BC00144_A530TBM07_AUTH_CD
            }
            , new Object[] {
            BC00145_A535TBM07_CRT_DATETIME, BC00145_n535TBM07_CRT_DATETIME, BC00145_A536TBM07_CRT_USER_ID, BC00145_n536TBM07_CRT_USER_ID, BC00145_A538TBM07_UPD_DATETIME, BC00145_n538TBM07_UPD_DATETIME, BC00145_A539TBM07_UPD_USER_ID, BC00145_n539TBM07_UPD_USER_ID, BC00145_A541TBM07_UPD_CNT, BC00145_n541TBM07_UPD_CNT,
            BC00145_A531TBM07_CRF_INP_AUTH_FLG, BC00145_n531TBM07_CRF_INP_AUTH_FLG, BC00145_A532TBM07_CRF_EDIT_AUTH_FLG, BC00145_n532TBM07_CRF_EDIT_AUTH_FLG, BC00145_A533TBM07_OTHER_SITE_VIEW_FLG, BC00145_n533TBM07_OTHER_SITE_VIEW_FLG, BC00145_A534TBM07_DEL_FLG, BC00145_n534TBM07_DEL_FLG, BC00145_A537TBM07_CRT_PROG_NM, BC00145_n537TBM07_CRT_PROG_NM,
            BC00145_A540TBM07_UPD_PROG_NM, BC00145_n540TBM07_UPD_PROG_NM, BC00145_A530TBM07_AUTH_CD
            }
            , new Object[] {
            BC00146_A530TBM07_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001410_A535TBM07_CRT_DATETIME, BC001410_n535TBM07_CRT_DATETIME, BC001410_A536TBM07_CRT_USER_ID, BC001410_n536TBM07_CRT_USER_ID, BC001410_A538TBM07_UPD_DATETIME, BC001410_n538TBM07_UPD_DATETIME, BC001410_A539TBM07_UPD_USER_ID, BC001410_n539TBM07_UPD_USER_ID, BC001410_A541TBM07_UPD_CNT, BC001410_n541TBM07_UPD_CNT,
            BC001410_A531TBM07_CRF_INP_AUTH_FLG, BC001410_n531TBM07_CRF_INP_AUTH_FLG, BC001410_A532TBM07_CRF_EDIT_AUTH_FLG, BC001410_n532TBM07_CRF_EDIT_AUTH_FLG, BC001410_A533TBM07_OTHER_SITE_VIEW_FLG, BC001410_n533TBM07_OTHER_SITE_VIEW_FLG, BC001410_A534TBM07_DEL_FLG, BC001410_n534TBM07_DEL_FLG, BC001410_A537TBM07_CRT_PROG_NM, BC001410_n537TBM07_CRT_PROG_NM,
            BC001410_A540TBM07_UPD_PROG_NM, BC001410_n540TBM07_UPD_PROG_NM, BC001410_A530TBM07_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11142 */
      e11142 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_N ;
   private byte gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound39 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int AnyError530 ;
   private int GXActiveErrHndl ;
   private long A541TBM07_UPD_CNT ;
   private long gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_cnt_Z ;
   private long Z541TBM07_UPD_CNT ;
   private long O541TBM07_UPD_CNT ;
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
   private java.util.Date A535TBM07_CRT_DATETIME ;
   private java.util.Date A538TBM07_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_datetime_Z ;
   private java.util.Date Z535TBM07_CRT_DATETIME ;
   private java.util.Date Z538TBM07_UPD_DATETIME ;
   private boolean n535TBM07_CRT_DATETIME ;
   private boolean n536TBM07_CRT_USER_ID ;
   private boolean n538TBM07_UPD_DATETIME ;
   private boolean n539TBM07_UPD_USER_ID ;
   private boolean n541TBM07_UPD_CNT ;
   private boolean n531TBM07_CRF_INP_AUTH_FLG ;
   private boolean n532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean n533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean n534TBM07_DEL_FLG ;
   private boolean n537TBM07_CRT_PROG_NM ;
   private boolean n540TBM07_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z530TBM07_AUTH_CD ;
   private String A530TBM07_AUTH_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A531TBM07_CRF_INP_AUTH_FLG ;
   private String A532TBM07_CRF_EDIT_AUTH_FLG ;
   private String A533TBM07_OTHER_SITE_VIEW_FLG ;
   private String A534TBM07_DEL_FLG ;
   private String A536TBM07_CRT_USER_ID ;
   private String A537TBM07_CRT_PROG_NM ;
   private String A539TBM07_UPD_USER_ID ;
   private String A540TBM07_UPD_PROG_NM ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_auth_cd_Z ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_inp_auth_flg_Z ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crf_edit_auth_flg_Z ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_other_site_view_flg_Z ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_del_flg_Z ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_user_id_Z ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_crt_prog_nm_Z ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_user_id_Z ;
   private String gxTv_SdtTBM07_AUTH_BEHAVIOR_Tbm07_upd_prog_nm_Z ;
   private String Z536TBM07_CRT_USER_ID ;
   private String Z539TBM07_UPD_USER_ID ;
   private String Z531TBM07_CRF_INP_AUTH_FLG ;
   private String Z532TBM07_CRF_EDIT_AUTH_FLG ;
   private String Z533TBM07_OTHER_SITE_VIEW_FLG ;
   private String Z534TBM07_DEL_FLG ;
   private String Z537TBM07_CRT_PROG_NM ;
   private String Z540TBM07_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM07_AUTH_BEHAVIOR bcTBM07_AUTH_BEHAVIOR ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC00145_A535TBM07_CRT_DATETIME ;
   private boolean[] BC00145_n535TBM07_CRT_DATETIME ;
   private String[] BC00145_A536TBM07_CRT_USER_ID ;
   private boolean[] BC00145_n536TBM07_CRT_USER_ID ;
   private java.util.Date[] BC00145_A538TBM07_UPD_DATETIME ;
   private boolean[] BC00145_n538TBM07_UPD_DATETIME ;
   private String[] BC00145_A539TBM07_UPD_USER_ID ;
   private boolean[] BC00145_n539TBM07_UPD_USER_ID ;
   private long[] BC00145_A541TBM07_UPD_CNT ;
   private boolean[] BC00145_n541TBM07_UPD_CNT ;
   private String[] BC00145_A531TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC00145_n531TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC00145_A532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC00145_n532TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC00145_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC00145_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC00145_A534TBM07_DEL_FLG ;
   private boolean[] BC00145_n534TBM07_DEL_FLG ;
   private String[] BC00145_A537TBM07_CRT_PROG_NM ;
   private boolean[] BC00145_n537TBM07_CRT_PROG_NM ;
   private String[] BC00145_A540TBM07_UPD_PROG_NM ;
   private boolean[] BC00145_n540TBM07_UPD_PROG_NM ;
   private String[] BC00145_A530TBM07_AUTH_CD ;
   private String[] BC00144_A530TBM07_AUTH_CD ;
   private String[] BC00146_A530TBM07_AUTH_CD ;
   private java.util.Date[] BC00143_A535TBM07_CRT_DATETIME ;
   private boolean[] BC00143_n535TBM07_CRT_DATETIME ;
   private String[] BC00143_A536TBM07_CRT_USER_ID ;
   private boolean[] BC00143_n536TBM07_CRT_USER_ID ;
   private java.util.Date[] BC00143_A538TBM07_UPD_DATETIME ;
   private boolean[] BC00143_n538TBM07_UPD_DATETIME ;
   private String[] BC00143_A539TBM07_UPD_USER_ID ;
   private boolean[] BC00143_n539TBM07_UPD_USER_ID ;
   private long[] BC00143_A541TBM07_UPD_CNT ;
   private boolean[] BC00143_n541TBM07_UPD_CNT ;
   private String[] BC00143_A531TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC00143_n531TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC00143_A532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC00143_n532TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC00143_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC00143_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC00143_A534TBM07_DEL_FLG ;
   private boolean[] BC00143_n534TBM07_DEL_FLG ;
   private String[] BC00143_A537TBM07_CRT_PROG_NM ;
   private boolean[] BC00143_n537TBM07_CRT_PROG_NM ;
   private String[] BC00143_A540TBM07_UPD_PROG_NM ;
   private boolean[] BC00143_n540TBM07_UPD_PROG_NM ;
   private String[] BC00143_A530TBM07_AUTH_CD ;
   private java.util.Date[] BC00142_A535TBM07_CRT_DATETIME ;
   private boolean[] BC00142_n535TBM07_CRT_DATETIME ;
   private String[] BC00142_A536TBM07_CRT_USER_ID ;
   private boolean[] BC00142_n536TBM07_CRT_USER_ID ;
   private java.util.Date[] BC00142_A538TBM07_UPD_DATETIME ;
   private boolean[] BC00142_n538TBM07_UPD_DATETIME ;
   private String[] BC00142_A539TBM07_UPD_USER_ID ;
   private boolean[] BC00142_n539TBM07_UPD_USER_ID ;
   private long[] BC00142_A541TBM07_UPD_CNT ;
   private boolean[] BC00142_n541TBM07_UPD_CNT ;
   private String[] BC00142_A531TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC00142_n531TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC00142_A532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC00142_n532TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC00142_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC00142_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC00142_A534TBM07_DEL_FLG ;
   private boolean[] BC00142_n534TBM07_DEL_FLG ;
   private String[] BC00142_A537TBM07_CRT_PROG_NM ;
   private boolean[] BC00142_n537TBM07_CRT_PROG_NM ;
   private String[] BC00142_A540TBM07_UPD_PROG_NM ;
   private boolean[] BC00142_n540TBM07_UPD_PROG_NM ;
   private String[] BC00142_A530TBM07_AUTH_CD ;
   private java.util.Date[] BC001410_A535TBM07_CRT_DATETIME ;
   private boolean[] BC001410_n535TBM07_CRT_DATETIME ;
   private String[] BC001410_A536TBM07_CRT_USER_ID ;
   private boolean[] BC001410_n536TBM07_CRT_USER_ID ;
   private java.util.Date[] BC001410_A538TBM07_UPD_DATETIME ;
   private boolean[] BC001410_n538TBM07_UPD_DATETIME ;
   private String[] BC001410_A539TBM07_UPD_USER_ID ;
   private boolean[] BC001410_n539TBM07_UPD_USER_ID ;
   private long[] BC001410_A541TBM07_UPD_CNT ;
   private boolean[] BC001410_n541TBM07_UPD_CNT ;
   private String[] BC001410_A531TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] BC001410_n531TBM07_CRF_INP_AUTH_FLG ;
   private String[] BC001410_A532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] BC001410_n532TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] BC001410_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] BC001410_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] BC001410_A534TBM07_DEL_FLG ;
   private boolean[] BC001410_n534TBM07_DEL_FLG ;
   private String[] BC001410_A537TBM07_CRT_PROG_NM ;
   private boolean[] BC001410_n537TBM07_CRT_PROG_NM ;
   private String[] BC001410_A540TBM07_UPD_PROG_NM ;
   private boolean[] BC001410_n540TBM07_UPD_PROG_NM ;
   private String[] BC001410_A530TBM07_AUTH_CD ;
}

final  class tbm07_auth_behavior_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00142", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00143", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00144", "SELECT `TAM04_AUTH_CD` AS TBM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00145", "SELECT TM1.`TBM07_CRT_DATETIME`, TM1.`TBM07_CRT_USER_ID`, TM1.`TBM07_UPD_DATETIME`, TM1.`TBM07_UPD_USER_ID`, TM1.`TBM07_UPD_CNT`, TM1.`TBM07_CRF_INP_AUTH_FLG`, TM1.`TBM07_CRF_EDIT_AUTH_FLG`, TM1.`TBM07_OTHER_SITE_VIEW_FLG`, TM1.`TBM07_DEL_FLG`, TM1.`TBM07_CRT_PROG_NM`, TM1.`TBM07_UPD_PROG_NM`, TM1.`TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` TM1 WHERE TM1.`TBM07_AUTH_CD` = ? ORDER BY TM1.`TBM07_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00146", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00147", "INSERT INTO `TBM07_AUTH_BEHAVIOR` (`TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00148", "UPDATE `TBM07_AUTH_BEHAVIOR` SET `TBM07_CRT_DATETIME`=?, `TBM07_CRT_USER_ID`=?, `TBM07_UPD_DATETIME`=?, `TBM07_UPD_USER_ID`=?, `TBM07_UPD_CNT`=?, `TBM07_CRF_INP_AUTH_FLG`=?, `TBM07_CRF_EDIT_AUTH_FLG`=?, `TBM07_OTHER_SITE_VIEW_FLG`=?, `TBM07_DEL_FLG`=?, `TBM07_CRT_PROG_NM`=?, `TBM07_UPD_PROG_NM`=?  WHERE `TBM07_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00149", "DELETE FROM `TBM07_AUTH_BEHAVIOR`  WHERE `TBM07_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001410", "SELECT TM1.`TBM07_CRT_DATETIME`, TM1.`TBM07_CRT_USER_ID`, TM1.`TBM07_UPD_DATETIME`, TM1.`TBM07_UPD_USER_ID`, TM1.`TBM07_UPD_CNT`, TM1.`TBM07_CRF_INP_AUTH_FLG`, TM1.`TBM07_CRF_EDIT_AUTH_FLG`, TM1.`TBM07_OTHER_SITE_VIEW_FLG`, TM1.`TBM07_DEL_FLG`, TM1.`TBM07_CRT_PROG_NM`, TM1.`TBM07_UPD_PROG_NM`, TM1.`TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` TM1 WHERE TM1.`TBM07_AUTH_CD` = ? ORDER BY TM1.`TBM07_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
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
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 8 :
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
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
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
      }
   }

}

