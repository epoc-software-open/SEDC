/*
               File: tbm11_image_bc
        Description: 画像マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:26.40
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm11_image_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm11_image_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm11_image_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm11_image_bc.class ));
   }

   public tbm11_image_bc( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0V30( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0V30( ) ;
      standaloneModal( ) ;
      addRow0V30( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120V2 */
         e120V2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z62TBM11_IMAGE_CD = A62TBM11_IMAGE_CD ;
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

   public void confirm_0V0( )
   {
      beforeValidate0V30( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0V30( ) ;
         }
         else
         {
            checkExtendedTable0V30( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0V30( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110V2( )
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

   public void e120V2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "画像コード:" + A62TBM11_IMAGE_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A634TBM11_IMAGE_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A534TBM11_FILE_NAME + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A606TBM11_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A535TBM11_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A536TBM11_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm11_image_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A537TBM11_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A538TBM11_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A539TBM11_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm11_image_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A540TBM11_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A541TBM11_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A542TBM11_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0V30( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z536TBM11_CRT_DATETIME = A536TBM11_CRT_DATETIME ;
         Z537TBM11_CRT_USER_ID = A537TBM11_CRT_USER_ID ;
         Z539TBM11_UPD_DATETIME = A539TBM11_UPD_DATETIME ;
         Z540TBM11_UPD_USER_ID = A540TBM11_UPD_USER_ID ;
         Z542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
         Z634TBM11_IMAGE_NM = A634TBM11_IMAGE_NM ;
         Z534TBM11_FILE_NAME = A534TBM11_FILE_NAME ;
         Z606TBM11_STUDY_ID = A606TBM11_STUDY_ID ;
         Z535TBM11_DEL_FLG = A535TBM11_DEL_FLG ;
         Z538TBM11_CRT_PROG_NM = A538TBM11_CRT_PROG_NM ;
         Z541TBM11_UPD_PROG_NM = A541TBM11_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z62TBM11_IMAGE_CD = A62TBM11_IMAGE_CD ;
         Z536TBM11_CRT_DATETIME = A536TBM11_CRT_DATETIME ;
         Z537TBM11_CRT_USER_ID = A537TBM11_CRT_USER_ID ;
         Z539TBM11_UPD_DATETIME = A539TBM11_UPD_DATETIME ;
         Z540TBM11_UPD_USER_ID = A540TBM11_UPD_USER_ID ;
         Z542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
         Z634TBM11_IMAGE_NM = A634TBM11_IMAGE_NM ;
         Z533TBM11_IMAGE = A533TBM11_IMAGE ;
         Z534TBM11_FILE_NAME = A534TBM11_FILE_NAME ;
         Z606TBM11_STUDY_ID = A606TBM11_STUDY_ID ;
         Z535TBM11_DEL_FLG = A535TBM11_DEL_FLG ;
         Z538TBM11_CRT_PROG_NM = A538TBM11_CRT_PROG_NM ;
         Z541TBM11_UPD_PROG_NM = A541TBM11_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0V30( )
   {
      /* Using cursor BC000V4 */
      pr_default.execute(2, new Object[] {A62TBM11_IMAGE_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A536TBM11_CRT_DATETIME = BC000V4_A536TBM11_CRT_DATETIME[0] ;
         n536TBM11_CRT_DATETIME = BC000V4_n536TBM11_CRT_DATETIME[0] ;
         A537TBM11_CRT_USER_ID = BC000V4_A537TBM11_CRT_USER_ID[0] ;
         n537TBM11_CRT_USER_ID = BC000V4_n537TBM11_CRT_USER_ID[0] ;
         A539TBM11_UPD_DATETIME = BC000V4_A539TBM11_UPD_DATETIME[0] ;
         n539TBM11_UPD_DATETIME = BC000V4_n539TBM11_UPD_DATETIME[0] ;
         A540TBM11_UPD_USER_ID = BC000V4_A540TBM11_UPD_USER_ID[0] ;
         n540TBM11_UPD_USER_ID = BC000V4_n540TBM11_UPD_USER_ID[0] ;
         A542TBM11_UPD_CNT = BC000V4_A542TBM11_UPD_CNT[0] ;
         n542TBM11_UPD_CNT = BC000V4_n542TBM11_UPD_CNT[0] ;
         A634TBM11_IMAGE_NM = BC000V4_A634TBM11_IMAGE_NM[0] ;
         n634TBM11_IMAGE_NM = BC000V4_n634TBM11_IMAGE_NM[0] ;
         A533TBM11_IMAGE = BC000V4_A533TBM11_IMAGE[0] ;
         n533TBM11_IMAGE = BC000V4_n533TBM11_IMAGE[0] ;
         A534TBM11_FILE_NAME = BC000V4_A534TBM11_FILE_NAME[0] ;
         n534TBM11_FILE_NAME = BC000V4_n534TBM11_FILE_NAME[0] ;
         A606TBM11_STUDY_ID = BC000V4_A606TBM11_STUDY_ID[0] ;
         n606TBM11_STUDY_ID = BC000V4_n606TBM11_STUDY_ID[0] ;
         A535TBM11_DEL_FLG = BC000V4_A535TBM11_DEL_FLG[0] ;
         n535TBM11_DEL_FLG = BC000V4_n535TBM11_DEL_FLG[0] ;
         A538TBM11_CRT_PROG_NM = BC000V4_A538TBM11_CRT_PROG_NM[0] ;
         n538TBM11_CRT_PROG_NM = BC000V4_n538TBM11_CRT_PROG_NM[0] ;
         A541TBM11_UPD_PROG_NM = BC000V4_A541TBM11_UPD_PROG_NM[0] ;
         n541TBM11_UPD_PROG_NM = BC000V4_n541TBM11_UPD_PROG_NM[0] ;
         zm0V30( -8) ;
      }
      pr_default.close(2);
      onLoadActions0V30( ) ;
   }

   public void onLoadActions0V30( )
   {
      AV9Pgmname = "TBM11_IMAGE_BC" ;
   }

   public void checkExtendedTable0V30( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM11_IMAGE_BC" ;
      if ( ! ( GXutil.nullDate().equals(A536TBM11_CRT_DATETIME) || (( A536TBM11_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A536TBM11_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A539TBM11_UPD_DATETIME) || (( A539TBM11_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A539TBM11_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0V30( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0V30( )
   {
      /* Using cursor BC000V5 */
      pr_default.execute(3, new Object[] {A62TBM11_IMAGE_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound30 = (short)(1) ;
      }
      else
      {
         RcdFound30 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000V3 */
      pr_default.execute(1, new Object[] {A62TBM11_IMAGE_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0V30( 8) ;
         RcdFound30 = (short)(1) ;
         A62TBM11_IMAGE_CD = BC000V3_A62TBM11_IMAGE_CD[0] ;
         A536TBM11_CRT_DATETIME = BC000V3_A536TBM11_CRT_DATETIME[0] ;
         n536TBM11_CRT_DATETIME = BC000V3_n536TBM11_CRT_DATETIME[0] ;
         A537TBM11_CRT_USER_ID = BC000V3_A537TBM11_CRT_USER_ID[0] ;
         n537TBM11_CRT_USER_ID = BC000V3_n537TBM11_CRT_USER_ID[0] ;
         A539TBM11_UPD_DATETIME = BC000V3_A539TBM11_UPD_DATETIME[0] ;
         n539TBM11_UPD_DATETIME = BC000V3_n539TBM11_UPD_DATETIME[0] ;
         A540TBM11_UPD_USER_ID = BC000V3_A540TBM11_UPD_USER_ID[0] ;
         n540TBM11_UPD_USER_ID = BC000V3_n540TBM11_UPD_USER_ID[0] ;
         A542TBM11_UPD_CNT = BC000V3_A542TBM11_UPD_CNT[0] ;
         n542TBM11_UPD_CNT = BC000V3_n542TBM11_UPD_CNT[0] ;
         A634TBM11_IMAGE_NM = BC000V3_A634TBM11_IMAGE_NM[0] ;
         n634TBM11_IMAGE_NM = BC000V3_n634TBM11_IMAGE_NM[0] ;
         A533TBM11_IMAGE = BC000V3_A533TBM11_IMAGE[0] ;
         n533TBM11_IMAGE = BC000V3_n533TBM11_IMAGE[0] ;
         A534TBM11_FILE_NAME = BC000V3_A534TBM11_FILE_NAME[0] ;
         n534TBM11_FILE_NAME = BC000V3_n534TBM11_FILE_NAME[0] ;
         A606TBM11_STUDY_ID = BC000V3_A606TBM11_STUDY_ID[0] ;
         n606TBM11_STUDY_ID = BC000V3_n606TBM11_STUDY_ID[0] ;
         A535TBM11_DEL_FLG = BC000V3_A535TBM11_DEL_FLG[0] ;
         n535TBM11_DEL_FLG = BC000V3_n535TBM11_DEL_FLG[0] ;
         A538TBM11_CRT_PROG_NM = BC000V3_A538TBM11_CRT_PROG_NM[0] ;
         n538TBM11_CRT_PROG_NM = BC000V3_n538TBM11_CRT_PROG_NM[0] ;
         A541TBM11_UPD_PROG_NM = BC000V3_A541TBM11_UPD_PROG_NM[0] ;
         n541TBM11_UPD_PROG_NM = BC000V3_n541TBM11_UPD_PROG_NM[0] ;
         O542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
         n542TBM11_UPD_CNT = false ;
         Z62TBM11_IMAGE_CD = A62TBM11_IMAGE_CD ;
         sMode30 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0V30( ) ;
         if ( AnyError == 1 )
         {
            RcdFound30 = (short)(0) ;
            initializeNonKey0V30( ) ;
         }
         Gx_mode = sMode30 ;
      }
      else
      {
         RcdFound30 = (short)(0) ;
         initializeNonKey0V30( ) ;
         sMode30 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode30 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0V30( ) ;
      if ( RcdFound30 == 0 )
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
      confirm_0V0( ) ;
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

   public void checkOptimisticConcurrency0V30( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000V2 */
         pr_default.execute(0, new Object[] {A62TBM11_IMAGE_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM11_IMAGE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z536TBM11_CRT_DATETIME.equals( BC000V2_A536TBM11_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z537TBM11_CRT_USER_ID, BC000V2_A537TBM11_CRT_USER_ID[0]) != 0 ) || !( Z539TBM11_UPD_DATETIME.equals( BC000V2_A539TBM11_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z540TBM11_UPD_USER_ID, BC000V2_A540TBM11_UPD_USER_ID[0]) != 0 ) || ( Z542TBM11_UPD_CNT != BC000V2_A542TBM11_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z634TBM11_IMAGE_NM, BC000V2_A634TBM11_IMAGE_NM[0]) != 0 ) || ( GXutil.strcmp(Z534TBM11_FILE_NAME, BC000V2_A534TBM11_FILE_NAME[0]) != 0 ) || ( Z606TBM11_STUDY_ID != BC000V2_A606TBM11_STUDY_ID[0] ) || ( GXutil.strcmp(Z535TBM11_DEL_FLG, BC000V2_A535TBM11_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z538TBM11_CRT_PROG_NM, BC000V2_A538TBM11_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z541TBM11_UPD_PROG_NM, BC000V2_A541TBM11_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM11_IMAGE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0V30( )
   {
      beforeValidate0V30( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V30( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0V30( 0) ;
         checkOptimisticConcurrency0V30( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V30( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0V30( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000V6 */
                  pr_default.execute(4, new Object[] {A62TBM11_IMAGE_CD, new Boolean(n536TBM11_CRT_DATETIME), A536TBM11_CRT_DATETIME, new Boolean(n537TBM11_CRT_USER_ID), A537TBM11_CRT_USER_ID, new Boolean(n539TBM11_UPD_DATETIME), A539TBM11_UPD_DATETIME, new Boolean(n540TBM11_UPD_USER_ID), A540TBM11_UPD_USER_ID, new Boolean(n542TBM11_UPD_CNT), new Long(A542TBM11_UPD_CNT), new Boolean(n634TBM11_IMAGE_NM), A634TBM11_IMAGE_NM, new Boolean(n533TBM11_IMAGE), A533TBM11_IMAGE, new Boolean(n534TBM11_FILE_NAME), A534TBM11_FILE_NAME, new Boolean(n606TBM11_STUDY_ID), new Long(A606TBM11_STUDY_ID), new Boolean(n535TBM11_DEL_FLG), A535TBM11_DEL_FLG, new Boolean(n538TBM11_CRT_PROG_NM), A538TBM11_CRT_PROG_NM, new Boolean(n541TBM11_UPD_PROG_NM), A541TBM11_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM11_IMAGE") ;
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
            load0V30( ) ;
         }
         endLevel0V30( ) ;
      }
      closeExtendedTableCursors0V30( ) ;
   }

   public void update0V30( )
   {
      beforeValidate0V30( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V30( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V30( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V30( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0V30( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000V7 */
                  pr_default.execute(5, new Object[] {new Boolean(n536TBM11_CRT_DATETIME), A536TBM11_CRT_DATETIME, new Boolean(n537TBM11_CRT_USER_ID), A537TBM11_CRT_USER_ID, new Boolean(n539TBM11_UPD_DATETIME), A539TBM11_UPD_DATETIME, new Boolean(n540TBM11_UPD_USER_ID), A540TBM11_UPD_USER_ID, new Boolean(n542TBM11_UPD_CNT), new Long(A542TBM11_UPD_CNT), new Boolean(n634TBM11_IMAGE_NM), A634TBM11_IMAGE_NM, new Boolean(n534TBM11_FILE_NAME), A534TBM11_FILE_NAME, new Boolean(n606TBM11_STUDY_ID), new Long(A606TBM11_STUDY_ID), new Boolean(n535TBM11_DEL_FLG), A535TBM11_DEL_FLG, new Boolean(n538TBM11_CRT_PROG_NM), A538TBM11_CRT_PROG_NM, new Boolean(n541TBM11_UPD_PROG_NM), A541TBM11_UPD_PROG_NM, A62TBM11_IMAGE_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM11_IMAGE") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM11_IMAGE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0V30( ) ;
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
         endLevel0V30( ) ;
      }
      closeExtendedTableCursors0V30( ) ;
   }

   public void deferredUpdate0V30( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor BC000V8 */
         pr_default.execute(6, new Object[] {new Boolean(n533TBM11_IMAGE), A533TBM11_IMAGE, A62TBM11_IMAGE_CD});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM11_IMAGE") ;
      }
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0V30( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V30( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0V30( ) ;
         afterConfirm0V30( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0V30( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000V9 */
               pr_default.execute(7, new Object[] {A62TBM11_IMAGE_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM11_IMAGE") ;
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
      sMode30 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0V30( ) ;
      Gx_mode = sMode30 ;
   }

   public void onDeleteControls0V30( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM11_IMAGE_BC" ;
      }
   }

   public void endLevel0V30( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0V30( ) ;
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

   public void scanKeyStart0V30( )
   {
      /* Scan By routine */
      /* Using cursor BC000V10 */
      pr_default.execute(8, new Object[] {A62TBM11_IMAGE_CD});
      RcdFound30 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A62TBM11_IMAGE_CD = BC000V10_A62TBM11_IMAGE_CD[0] ;
         A536TBM11_CRT_DATETIME = BC000V10_A536TBM11_CRT_DATETIME[0] ;
         n536TBM11_CRT_DATETIME = BC000V10_n536TBM11_CRT_DATETIME[0] ;
         A537TBM11_CRT_USER_ID = BC000V10_A537TBM11_CRT_USER_ID[0] ;
         n537TBM11_CRT_USER_ID = BC000V10_n537TBM11_CRT_USER_ID[0] ;
         A539TBM11_UPD_DATETIME = BC000V10_A539TBM11_UPD_DATETIME[0] ;
         n539TBM11_UPD_DATETIME = BC000V10_n539TBM11_UPD_DATETIME[0] ;
         A540TBM11_UPD_USER_ID = BC000V10_A540TBM11_UPD_USER_ID[0] ;
         n540TBM11_UPD_USER_ID = BC000V10_n540TBM11_UPD_USER_ID[0] ;
         A542TBM11_UPD_CNT = BC000V10_A542TBM11_UPD_CNT[0] ;
         n542TBM11_UPD_CNT = BC000V10_n542TBM11_UPD_CNT[0] ;
         A634TBM11_IMAGE_NM = BC000V10_A634TBM11_IMAGE_NM[0] ;
         n634TBM11_IMAGE_NM = BC000V10_n634TBM11_IMAGE_NM[0] ;
         A533TBM11_IMAGE = BC000V10_A533TBM11_IMAGE[0] ;
         n533TBM11_IMAGE = BC000V10_n533TBM11_IMAGE[0] ;
         A534TBM11_FILE_NAME = BC000V10_A534TBM11_FILE_NAME[0] ;
         n534TBM11_FILE_NAME = BC000V10_n534TBM11_FILE_NAME[0] ;
         A606TBM11_STUDY_ID = BC000V10_A606TBM11_STUDY_ID[0] ;
         n606TBM11_STUDY_ID = BC000V10_n606TBM11_STUDY_ID[0] ;
         A535TBM11_DEL_FLG = BC000V10_A535TBM11_DEL_FLG[0] ;
         n535TBM11_DEL_FLG = BC000V10_n535TBM11_DEL_FLG[0] ;
         A538TBM11_CRT_PROG_NM = BC000V10_A538TBM11_CRT_PROG_NM[0] ;
         n538TBM11_CRT_PROG_NM = BC000V10_n538TBM11_CRT_PROG_NM[0] ;
         A541TBM11_UPD_PROG_NM = BC000V10_A541TBM11_UPD_PROG_NM[0] ;
         n541TBM11_UPD_PROG_NM = BC000V10_n541TBM11_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0V30( )
   {
      /* Scan next routine */
      pr_default.readNext(8);
      RcdFound30 = (short)(0) ;
      scanKeyLoad0V30( ) ;
   }

   public void scanKeyLoad0V30( )
   {
      sMode30 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound30 = (short)(1) ;
         A62TBM11_IMAGE_CD = BC000V10_A62TBM11_IMAGE_CD[0] ;
         A536TBM11_CRT_DATETIME = BC000V10_A536TBM11_CRT_DATETIME[0] ;
         n536TBM11_CRT_DATETIME = BC000V10_n536TBM11_CRT_DATETIME[0] ;
         A537TBM11_CRT_USER_ID = BC000V10_A537TBM11_CRT_USER_ID[0] ;
         n537TBM11_CRT_USER_ID = BC000V10_n537TBM11_CRT_USER_ID[0] ;
         A539TBM11_UPD_DATETIME = BC000V10_A539TBM11_UPD_DATETIME[0] ;
         n539TBM11_UPD_DATETIME = BC000V10_n539TBM11_UPD_DATETIME[0] ;
         A540TBM11_UPD_USER_ID = BC000V10_A540TBM11_UPD_USER_ID[0] ;
         n540TBM11_UPD_USER_ID = BC000V10_n540TBM11_UPD_USER_ID[0] ;
         A542TBM11_UPD_CNT = BC000V10_A542TBM11_UPD_CNT[0] ;
         n542TBM11_UPD_CNT = BC000V10_n542TBM11_UPD_CNT[0] ;
         A634TBM11_IMAGE_NM = BC000V10_A634TBM11_IMAGE_NM[0] ;
         n634TBM11_IMAGE_NM = BC000V10_n634TBM11_IMAGE_NM[0] ;
         A533TBM11_IMAGE = BC000V10_A533TBM11_IMAGE[0] ;
         n533TBM11_IMAGE = BC000V10_n533TBM11_IMAGE[0] ;
         A534TBM11_FILE_NAME = BC000V10_A534TBM11_FILE_NAME[0] ;
         n534TBM11_FILE_NAME = BC000V10_n534TBM11_FILE_NAME[0] ;
         A606TBM11_STUDY_ID = BC000V10_A606TBM11_STUDY_ID[0] ;
         n606TBM11_STUDY_ID = BC000V10_n606TBM11_STUDY_ID[0] ;
         A535TBM11_DEL_FLG = BC000V10_A535TBM11_DEL_FLG[0] ;
         n535TBM11_DEL_FLG = BC000V10_n535TBM11_DEL_FLG[0] ;
         A538TBM11_CRT_PROG_NM = BC000V10_A538TBM11_CRT_PROG_NM[0] ;
         n538TBM11_CRT_PROG_NM = BC000V10_n538TBM11_CRT_PROG_NM[0] ;
         A541TBM11_UPD_PROG_NM = BC000V10_A541TBM11_UPD_PROG_NM[0] ;
         n541TBM11_UPD_PROG_NM = BC000V10_n541TBM11_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode30 ;
   }

   public void scanKeyEnd0V30( )
   {
      pr_default.close(8);
   }

   public void afterConfirm0V30( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0V30( )
   {
      /* Before Insert Rules */
      A536TBM11_CRT_DATETIME = GXutil.now( ) ;
      n536TBM11_CRT_DATETIME = false ;
      GXt_char1 = A537TBM11_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm11_image_bc.this.GXt_char1 = GXv_char2[0] ;
      A537TBM11_CRT_USER_ID = GXt_char1 ;
      n537TBM11_CRT_USER_ID = false ;
      A539TBM11_UPD_DATETIME = GXutil.now( ) ;
      n539TBM11_UPD_DATETIME = false ;
      GXt_char1 = A540TBM11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm11_image_bc.this.GXt_char1 = GXv_char2[0] ;
      A540TBM11_UPD_USER_ID = GXt_char1 ;
      n540TBM11_UPD_USER_ID = false ;
      A542TBM11_UPD_CNT = (long)(O542TBM11_UPD_CNT+1) ;
      n542TBM11_UPD_CNT = false ;
   }

   public void beforeUpdate0V30( )
   {
      /* Before Update Rules */
      A539TBM11_UPD_DATETIME = GXutil.now( ) ;
      n539TBM11_UPD_DATETIME = false ;
      GXt_char1 = A540TBM11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm11_image_bc.this.GXt_char1 = GXv_char2[0] ;
      A540TBM11_UPD_USER_ID = GXt_char1 ;
      n540TBM11_UPD_USER_ID = false ;
      A542TBM11_UPD_CNT = (long)(O542TBM11_UPD_CNT+1) ;
      n542TBM11_UPD_CNT = false ;
   }

   public void beforeDelete0V30( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0V30( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0V30( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0V30( )
   {
   }

   public void addRow0V30( )
   {
      VarsToRow30( bcTBM11_IMAGE) ;
   }

   public void readRow0V30( )
   {
      RowToVars30( bcTBM11_IMAGE, 1) ;
   }

   public void initializeNonKey0V30( )
   {
      A536TBM11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n536TBM11_CRT_DATETIME = false ;
      A537TBM11_CRT_USER_ID = "" ;
      n537TBM11_CRT_USER_ID = false ;
      A539TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n539TBM11_UPD_DATETIME = false ;
      A540TBM11_UPD_USER_ID = "" ;
      n540TBM11_UPD_USER_ID = false ;
      A542TBM11_UPD_CNT = 0 ;
      n542TBM11_UPD_CNT = false ;
      A634TBM11_IMAGE_NM = "" ;
      n634TBM11_IMAGE_NM = false ;
      A533TBM11_IMAGE = "" ;
      n533TBM11_IMAGE = false ;
      A534TBM11_FILE_NAME = "" ;
      n534TBM11_FILE_NAME = false ;
      A606TBM11_STUDY_ID = 0 ;
      n606TBM11_STUDY_ID = false ;
      A535TBM11_DEL_FLG = "" ;
      n535TBM11_DEL_FLG = false ;
      A538TBM11_CRT_PROG_NM = "" ;
      n538TBM11_CRT_PROG_NM = false ;
      A541TBM11_UPD_PROG_NM = "" ;
      n541TBM11_UPD_PROG_NM = false ;
      O542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
      n542TBM11_UPD_CNT = false ;
   }

   public void initAll0V30( )
   {
      A62TBM11_IMAGE_CD = "" ;
      initializeNonKey0V30( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow30( SdtTBM11_IMAGE obj30 )
   {
      obj30.setgxTv_SdtTBM11_IMAGE_Mode( Gx_mode );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime( A536TBM11_CRT_DATETIME );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id( A537TBM11_CRT_USER_ID );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime( A539TBM11_UPD_DATETIME );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id( A540TBM11_UPD_USER_ID );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt( A542TBM11_UPD_CNT );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_image_nm( A634TBM11_IMAGE_NM );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_image( A533TBM11_IMAGE );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_file_name( A534TBM11_FILE_NAME );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_study_id( A606TBM11_STUDY_ID );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_del_flg( A535TBM11_DEL_FLG );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm( A538TBM11_CRT_PROG_NM );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm( A541TBM11_UPD_PROG_NM );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_image_cd( A62TBM11_IMAGE_CD );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_image_cd_Z( Z62TBM11_IMAGE_CD );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_image_nm_Z( Z634TBM11_IMAGE_NM );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_file_name_Z( Z534TBM11_FILE_NAME );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_study_id_Z( Z606TBM11_STUDY_ID );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_del_flg_Z( Z535TBM11_DEL_FLG );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_Z( Z536TBM11_CRT_DATETIME );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_Z( Z537TBM11_CRT_USER_ID );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_Z( Z538TBM11_CRT_PROG_NM );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_Z( Z539TBM11_UPD_DATETIME );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_Z( Z540TBM11_UPD_USER_ID );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_Z( Z541TBM11_UPD_PROG_NM );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_Z( Z542TBM11_UPD_CNT );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_image_nm_N( (byte)((byte)((n634TBM11_IMAGE_NM)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_image_N( (byte)((byte)((n533TBM11_IMAGE)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_file_name_N( (byte)((byte)((n534TBM11_FILE_NAME)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_study_id_N( (byte)((byte)((n606TBM11_STUDY_ID)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_del_flg_N( (byte)((byte)((n535TBM11_DEL_FLG)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_N( (byte)((byte)((n536TBM11_CRT_DATETIME)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_N( (byte)((byte)((n537TBM11_CRT_USER_ID)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_N( (byte)((byte)((n538TBM11_CRT_PROG_NM)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_N( (byte)((byte)((n539TBM11_UPD_DATETIME)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_N( (byte)((byte)((n540TBM11_UPD_USER_ID)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_N( (byte)((byte)((n541TBM11_UPD_PROG_NM)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_N( (byte)((byte)((n542TBM11_UPD_CNT)?1:0)) );
      obj30.setgxTv_SdtTBM11_IMAGE_Mode( Gx_mode );
   }

   public void KeyVarsToRow30( SdtTBM11_IMAGE obj30 )
   {
      obj30.setgxTv_SdtTBM11_IMAGE_Tbm11_image_cd( A62TBM11_IMAGE_CD );
   }

   public void RowToVars30( SdtTBM11_IMAGE obj30 ,
                            int forceLoad )
   {
      Gx_mode = obj30.getgxTv_SdtTBM11_IMAGE_Mode() ;
      A536TBM11_CRT_DATETIME = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime() ;
      n536TBM11_CRT_DATETIME = false ;
      A537TBM11_CRT_USER_ID = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id() ;
      n537TBM11_CRT_USER_ID = false ;
      A539TBM11_UPD_DATETIME = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime() ;
      n539TBM11_UPD_DATETIME = false ;
      A540TBM11_UPD_USER_ID = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id() ;
      n540TBM11_UPD_USER_ID = false ;
      A542TBM11_UPD_CNT = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt() ;
      n542TBM11_UPD_CNT = false ;
      A634TBM11_IMAGE_NM = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_image_nm() ;
      n634TBM11_IMAGE_NM = false ;
      A533TBM11_IMAGE = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_image() ;
      n533TBM11_IMAGE = false ;
      A534TBM11_FILE_NAME = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name() ;
      n534TBM11_FILE_NAME = false ;
      A606TBM11_STUDY_ID = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_study_id() ;
      n606TBM11_STUDY_ID = false ;
      A535TBM11_DEL_FLG = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_del_flg() ;
      n535TBM11_DEL_FLG = false ;
      A538TBM11_CRT_PROG_NM = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm() ;
      n538TBM11_CRT_PROG_NM = false ;
      A541TBM11_UPD_PROG_NM = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm() ;
      n541TBM11_UPD_PROG_NM = false ;
      A62TBM11_IMAGE_CD = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_image_cd() ;
      Z62TBM11_IMAGE_CD = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_image_cd_Z() ;
      Z634TBM11_IMAGE_NM = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_image_nm_Z() ;
      Z534TBM11_FILE_NAME = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name_Z() ;
      Z606TBM11_STUDY_ID = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_study_id_Z() ;
      Z535TBM11_DEL_FLG = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_del_flg_Z() ;
      Z536TBM11_CRT_DATETIME = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_Z() ;
      Z537TBM11_CRT_USER_ID = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_Z() ;
      Z538TBM11_CRT_PROG_NM = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_Z() ;
      Z539TBM11_UPD_DATETIME = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_Z() ;
      Z540TBM11_UPD_USER_ID = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_Z() ;
      Z541TBM11_UPD_PROG_NM = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_Z() ;
      Z542TBM11_UPD_CNT = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_Z() ;
      O542TBM11_UPD_CNT = obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_Z() ;
      n634TBM11_IMAGE_NM = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_image_nm_N()==0)?false:true) ;
      n533TBM11_IMAGE = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_image_N()==0)?false:true) ;
      n534TBM11_FILE_NAME = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_file_name_N()==0)?false:true) ;
      n606TBM11_STUDY_ID = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_study_id_N()==0)?false:true) ;
      n535TBM11_DEL_FLG = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_del_flg_N()==0)?false:true) ;
      n536TBM11_CRT_DATETIME = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_N()==0)?false:true) ;
      n537TBM11_CRT_USER_ID = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_N()==0)?false:true) ;
      n538TBM11_CRT_PROG_NM = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_N()==0)?false:true) ;
      n539TBM11_UPD_DATETIME = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_N()==0)?false:true) ;
      n540TBM11_UPD_USER_ID = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_N()==0)?false:true) ;
      n541TBM11_UPD_PROG_NM = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_N()==0)?false:true) ;
      n542TBM11_UPD_CNT = (boolean)((obj30.getgxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj30.getgxTv_SdtTBM11_IMAGE_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A62TBM11_IMAGE_CD = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0V30( ) ;
      scanKeyStart0V30( ) ;
      if ( RcdFound30 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z62TBM11_IMAGE_CD = A62TBM11_IMAGE_CD ;
         O542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
         n542TBM11_UPD_CNT = false ;
      }
      zm0V30( -8) ;
      onLoadActions0V30( ) ;
      addRow0V30( ) ;
      scanKeyEnd0V30( ) ;
      if ( RcdFound30 == 0 )
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
      RowToVars30( bcTBM11_IMAGE, 0) ;
      scanKeyStart0V30( ) ;
      if ( RcdFound30 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z62TBM11_IMAGE_CD = A62TBM11_IMAGE_CD ;
         O542TBM11_UPD_CNT = A542TBM11_UPD_CNT ;
         n542TBM11_UPD_CNT = false ;
      }
      zm0V30( -8) ;
      onLoadActions0V30( ) ;
      addRow0V30( ) ;
      scanKeyEnd0V30( ) ;
      if ( RcdFound30 == 0 )
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
      RowToVars30( bcTBM11_IMAGE, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0V30( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0V30( ) ;
      }
      else
      {
         if ( RcdFound30 == 1 )
         {
            if ( GXutil.strcmp(A62TBM11_IMAGE_CD, Z62TBM11_IMAGE_CD) != 0 )
            {
               A62TBM11_IMAGE_CD = Z62TBM11_IMAGE_CD ;
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
               update0V30( ) ;
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
               if ( GXutil.strcmp(A62TBM11_IMAGE_CD, Z62TBM11_IMAGE_CD) != 0 )
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
                     insert0V30( ) ;
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
                     insert0V30( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow30( bcTBM11_IMAGE) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars30( bcTBM11_IMAGE, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0V30( ) ;
      if ( RcdFound30 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A62TBM11_IMAGE_CD, Z62TBM11_IMAGE_CD) != 0 )
         {
            A62TBM11_IMAGE_CD = Z62TBM11_IMAGE_CD ;
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
         if ( GXutil.strcmp(A62TBM11_IMAGE_CD, Z62TBM11_IMAGE_CD) != 0 )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm11_image_bc");
      VarsToRow30( bcTBM11_IMAGE) ;
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
      Gx_mode = bcTBM11_IMAGE.getgxTv_SdtTBM11_IMAGE_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM11_IMAGE.setgxTv_SdtTBM11_IMAGE_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM11_IMAGE sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM11_IMAGE )
      {
         bcTBM11_IMAGE = sdt ;
         if ( GXutil.strcmp(bcTBM11_IMAGE.getgxTv_SdtTBM11_IMAGE_Mode(), "") == 0 )
         {
            bcTBM11_IMAGE.setgxTv_SdtTBM11_IMAGE_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow30( bcTBM11_IMAGE) ;
         }
         else
         {
            RowToVars30( bcTBM11_IMAGE, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM11_IMAGE.getgxTv_SdtTBM11_IMAGE_Mode(), "") == 0 )
         {
            bcTBM11_IMAGE.setgxTv_SdtTBM11_IMAGE_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars30( bcTBM11_IMAGE, 1) ;
   }

   public SdtTBM11_IMAGE getTBM11_IMAGE_BC( )
   {
      return bcTBM11_IMAGE ;
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
      Z62TBM11_IMAGE_CD = "" ;
      A62TBM11_IMAGE_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A634TBM11_IMAGE_NM = "" ;
      A534TBM11_FILE_NAME = "" ;
      A535TBM11_DEL_FLG = "" ;
      A536TBM11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A537TBM11_CRT_USER_ID = "" ;
      A538TBM11_CRT_PROG_NM = "" ;
      A539TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A540TBM11_UPD_USER_ID = "" ;
      A541TBM11_UPD_PROG_NM = "" ;
      Z536TBM11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z537TBM11_CRT_USER_ID = "" ;
      Z539TBM11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z540TBM11_UPD_USER_ID = "" ;
      Z634TBM11_IMAGE_NM = "" ;
      Z534TBM11_FILE_NAME = "" ;
      Z535TBM11_DEL_FLG = "" ;
      Z538TBM11_CRT_PROG_NM = "" ;
      Z541TBM11_UPD_PROG_NM = "" ;
      Z533TBM11_IMAGE = "" ;
      A533TBM11_IMAGE = "" ;
      BC000V4_A62TBM11_IMAGE_CD = new String[] {""} ;
      BC000V4_A536TBM11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000V4_n536TBM11_CRT_DATETIME = new boolean[] {false} ;
      BC000V4_A537TBM11_CRT_USER_ID = new String[] {""} ;
      BC000V4_n537TBM11_CRT_USER_ID = new boolean[] {false} ;
      BC000V4_A539TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000V4_n539TBM11_UPD_DATETIME = new boolean[] {false} ;
      BC000V4_A540TBM11_UPD_USER_ID = new String[] {""} ;
      BC000V4_n540TBM11_UPD_USER_ID = new boolean[] {false} ;
      BC000V4_A542TBM11_UPD_CNT = new long[1] ;
      BC000V4_n542TBM11_UPD_CNT = new boolean[] {false} ;
      BC000V4_A634TBM11_IMAGE_NM = new String[] {""} ;
      BC000V4_n634TBM11_IMAGE_NM = new boolean[] {false} ;
      BC000V4_A533TBM11_IMAGE = new String[] {""} ;
      BC000V4_n533TBM11_IMAGE = new boolean[] {false} ;
      BC000V4_A534TBM11_FILE_NAME = new String[] {""} ;
      BC000V4_n534TBM11_FILE_NAME = new boolean[] {false} ;
      BC000V4_A606TBM11_STUDY_ID = new long[1] ;
      BC000V4_n606TBM11_STUDY_ID = new boolean[] {false} ;
      BC000V4_A535TBM11_DEL_FLG = new String[] {""} ;
      BC000V4_n535TBM11_DEL_FLG = new boolean[] {false} ;
      BC000V4_A538TBM11_CRT_PROG_NM = new String[] {""} ;
      BC000V4_n538TBM11_CRT_PROG_NM = new boolean[] {false} ;
      BC000V4_A541TBM11_UPD_PROG_NM = new String[] {""} ;
      BC000V4_n541TBM11_UPD_PROG_NM = new boolean[] {false} ;
      BC000V5_A62TBM11_IMAGE_CD = new String[] {""} ;
      BC000V3_A62TBM11_IMAGE_CD = new String[] {""} ;
      BC000V3_A536TBM11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000V3_n536TBM11_CRT_DATETIME = new boolean[] {false} ;
      BC000V3_A537TBM11_CRT_USER_ID = new String[] {""} ;
      BC000V3_n537TBM11_CRT_USER_ID = new boolean[] {false} ;
      BC000V3_A539TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000V3_n539TBM11_UPD_DATETIME = new boolean[] {false} ;
      BC000V3_A540TBM11_UPD_USER_ID = new String[] {""} ;
      BC000V3_n540TBM11_UPD_USER_ID = new boolean[] {false} ;
      BC000V3_A542TBM11_UPD_CNT = new long[1] ;
      BC000V3_n542TBM11_UPD_CNT = new boolean[] {false} ;
      BC000V3_A634TBM11_IMAGE_NM = new String[] {""} ;
      BC000V3_n634TBM11_IMAGE_NM = new boolean[] {false} ;
      BC000V3_A533TBM11_IMAGE = new String[] {""} ;
      BC000V3_n533TBM11_IMAGE = new boolean[] {false} ;
      BC000V3_A534TBM11_FILE_NAME = new String[] {""} ;
      BC000V3_n534TBM11_FILE_NAME = new boolean[] {false} ;
      BC000V3_A606TBM11_STUDY_ID = new long[1] ;
      BC000V3_n606TBM11_STUDY_ID = new boolean[] {false} ;
      BC000V3_A535TBM11_DEL_FLG = new String[] {""} ;
      BC000V3_n535TBM11_DEL_FLG = new boolean[] {false} ;
      BC000V3_A538TBM11_CRT_PROG_NM = new String[] {""} ;
      BC000V3_n538TBM11_CRT_PROG_NM = new boolean[] {false} ;
      BC000V3_A541TBM11_UPD_PROG_NM = new String[] {""} ;
      BC000V3_n541TBM11_UPD_PROG_NM = new boolean[] {false} ;
      sMode30 = "" ;
      BC000V2_A62TBM11_IMAGE_CD = new String[] {""} ;
      BC000V2_A536TBM11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000V2_n536TBM11_CRT_DATETIME = new boolean[] {false} ;
      BC000V2_A537TBM11_CRT_USER_ID = new String[] {""} ;
      BC000V2_n537TBM11_CRT_USER_ID = new boolean[] {false} ;
      BC000V2_A539TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000V2_n539TBM11_UPD_DATETIME = new boolean[] {false} ;
      BC000V2_A540TBM11_UPD_USER_ID = new String[] {""} ;
      BC000V2_n540TBM11_UPD_USER_ID = new boolean[] {false} ;
      BC000V2_A542TBM11_UPD_CNT = new long[1] ;
      BC000V2_n542TBM11_UPD_CNT = new boolean[] {false} ;
      BC000V2_A634TBM11_IMAGE_NM = new String[] {""} ;
      BC000V2_n634TBM11_IMAGE_NM = new boolean[] {false} ;
      BC000V2_A533TBM11_IMAGE = new String[] {""} ;
      BC000V2_n533TBM11_IMAGE = new boolean[] {false} ;
      BC000V2_A534TBM11_FILE_NAME = new String[] {""} ;
      BC000V2_n534TBM11_FILE_NAME = new boolean[] {false} ;
      BC000V2_A606TBM11_STUDY_ID = new long[1] ;
      BC000V2_n606TBM11_STUDY_ID = new boolean[] {false} ;
      BC000V2_A535TBM11_DEL_FLG = new String[] {""} ;
      BC000V2_n535TBM11_DEL_FLG = new boolean[] {false} ;
      BC000V2_A538TBM11_CRT_PROG_NM = new String[] {""} ;
      BC000V2_n538TBM11_CRT_PROG_NM = new boolean[] {false} ;
      BC000V2_A541TBM11_UPD_PROG_NM = new String[] {""} ;
      BC000V2_n541TBM11_UPD_PROG_NM = new boolean[] {false} ;
      BC000V10_A62TBM11_IMAGE_CD = new String[] {""} ;
      BC000V10_A536TBM11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000V10_n536TBM11_CRT_DATETIME = new boolean[] {false} ;
      BC000V10_A537TBM11_CRT_USER_ID = new String[] {""} ;
      BC000V10_n537TBM11_CRT_USER_ID = new boolean[] {false} ;
      BC000V10_A539TBM11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000V10_n539TBM11_UPD_DATETIME = new boolean[] {false} ;
      BC000V10_A540TBM11_UPD_USER_ID = new String[] {""} ;
      BC000V10_n540TBM11_UPD_USER_ID = new boolean[] {false} ;
      BC000V10_A542TBM11_UPD_CNT = new long[1] ;
      BC000V10_n542TBM11_UPD_CNT = new boolean[] {false} ;
      BC000V10_A634TBM11_IMAGE_NM = new String[] {""} ;
      BC000V10_n634TBM11_IMAGE_NM = new boolean[] {false} ;
      BC000V10_A533TBM11_IMAGE = new String[] {""} ;
      BC000V10_n533TBM11_IMAGE = new boolean[] {false} ;
      BC000V10_A534TBM11_FILE_NAME = new String[] {""} ;
      BC000V10_n534TBM11_FILE_NAME = new boolean[] {false} ;
      BC000V10_A606TBM11_STUDY_ID = new long[1] ;
      BC000V10_n606TBM11_STUDY_ID = new boolean[] {false} ;
      BC000V10_A535TBM11_DEL_FLG = new String[] {""} ;
      BC000V10_n535TBM11_DEL_FLG = new boolean[] {false} ;
      BC000V10_A538TBM11_CRT_PROG_NM = new String[] {""} ;
      BC000V10_n538TBM11_CRT_PROG_NM = new boolean[] {false} ;
      BC000V10_A541TBM11_UPD_PROG_NM = new String[] {""} ;
      BC000V10_n541TBM11_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm11_image_bc__default(),
         new Object[] {
             new Object[] {
            BC000V2_A62TBM11_IMAGE_CD, BC000V2_A536TBM11_CRT_DATETIME, BC000V2_n536TBM11_CRT_DATETIME, BC000V2_A537TBM11_CRT_USER_ID, BC000V2_n537TBM11_CRT_USER_ID, BC000V2_A539TBM11_UPD_DATETIME, BC000V2_n539TBM11_UPD_DATETIME, BC000V2_A540TBM11_UPD_USER_ID, BC000V2_n540TBM11_UPD_USER_ID, BC000V2_A542TBM11_UPD_CNT,
            BC000V2_n542TBM11_UPD_CNT, BC000V2_A634TBM11_IMAGE_NM, BC000V2_n634TBM11_IMAGE_NM, BC000V2_A533TBM11_IMAGE, BC000V2_n533TBM11_IMAGE, BC000V2_A534TBM11_FILE_NAME, BC000V2_n534TBM11_FILE_NAME, BC000V2_A606TBM11_STUDY_ID, BC000V2_n606TBM11_STUDY_ID, BC000V2_A535TBM11_DEL_FLG,
            BC000V2_n535TBM11_DEL_FLG, BC000V2_A538TBM11_CRT_PROG_NM, BC000V2_n538TBM11_CRT_PROG_NM, BC000V2_A541TBM11_UPD_PROG_NM, BC000V2_n541TBM11_UPD_PROG_NM
            }
            , new Object[] {
            BC000V3_A62TBM11_IMAGE_CD, BC000V3_A536TBM11_CRT_DATETIME, BC000V3_n536TBM11_CRT_DATETIME, BC000V3_A537TBM11_CRT_USER_ID, BC000V3_n537TBM11_CRT_USER_ID, BC000V3_A539TBM11_UPD_DATETIME, BC000V3_n539TBM11_UPD_DATETIME, BC000V3_A540TBM11_UPD_USER_ID, BC000V3_n540TBM11_UPD_USER_ID, BC000V3_A542TBM11_UPD_CNT,
            BC000V3_n542TBM11_UPD_CNT, BC000V3_A634TBM11_IMAGE_NM, BC000V3_n634TBM11_IMAGE_NM, BC000V3_A533TBM11_IMAGE, BC000V3_n533TBM11_IMAGE, BC000V3_A534TBM11_FILE_NAME, BC000V3_n534TBM11_FILE_NAME, BC000V3_A606TBM11_STUDY_ID, BC000V3_n606TBM11_STUDY_ID, BC000V3_A535TBM11_DEL_FLG,
            BC000V3_n535TBM11_DEL_FLG, BC000V3_A538TBM11_CRT_PROG_NM, BC000V3_n538TBM11_CRT_PROG_NM, BC000V3_A541TBM11_UPD_PROG_NM, BC000V3_n541TBM11_UPD_PROG_NM
            }
            , new Object[] {
            BC000V4_A62TBM11_IMAGE_CD, BC000V4_A536TBM11_CRT_DATETIME, BC000V4_n536TBM11_CRT_DATETIME, BC000V4_A537TBM11_CRT_USER_ID, BC000V4_n537TBM11_CRT_USER_ID, BC000V4_A539TBM11_UPD_DATETIME, BC000V4_n539TBM11_UPD_DATETIME, BC000V4_A540TBM11_UPD_USER_ID, BC000V4_n540TBM11_UPD_USER_ID, BC000V4_A542TBM11_UPD_CNT,
            BC000V4_n542TBM11_UPD_CNT, BC000V4_A634TBM11_IMAGE_NM, BC000V4_n634TBM11_IMAGE_NM, BC000V4_A533TBM11_IMAGE, BC000V4_n533TBM11_IMAGE, BC000V4_A534TBM11_FILE_NAME, BC000V4_n534TBM11_FILE_NAME, BC000V4_A606TBM11_STUDY_ID, BC000V4_n606TBM11_STUDY_ID, BC000V4_A535TBM11_DEL_FLG,
            BC000V4_n535TBM11_DEL_FLG, BC000V4_A538TBM11_CRT_PROG_NM, BC000V4_n538TBM11_CRT_PROG_NM, BC000V4_A541TBM11_UPD_PROG_NM, BC000V4_n541TBM11_UPD_PROG_NM
            }
            , new Object[] {
            BC000V5_A62TBM11_IMAGE_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000V10_A62TBM11_IMAGE_CD, BC000V10_A536TBM11_CRT_DATETIME, BC000V10_n536TBM11_CRT_DATETIME, BC000V10_A537TBM11_CRT_USER_ID, BC000V10_n537TBM11_CRT_USER_ID, BC000V10_A539TBM11_UPD_DATETIME, BC000V10_n539TBM11_UPD_DATETIME, BC000V10_A540TBM11_UPD_USER_ID, BC000V10_n540TBM11_UPD_USER_ID, BC000V10_A542TBM11_UPD_CNT,
            BC000V10_n542TBM11_UPD_CNT, BC000V10_A634TBM11_IMAGE_NM, BC000V10_n634TBM11_IMAGE_NM, BC000V10_A533TBM11_IMAGE, BC000V10_n533TBM11_IMAGE, BC000V10_A534TBM11_FILE_NAME, BC000V10_n534TBM11_FILE_NAME, BC000V10_A606TBM11_STUDY_ID, BC000V10_n606TBM11_STUDY_ID, BC000V10_A535TBM11_DEL_FLG,
            BC000V10_n535TBM11_DEL_FLG, BC000V10_A538TBM11_CRT_PROG_NM, BC000V10_n538TBM11_CRT_PROG_NM, BC000V10_A541TBM11_UPD_PROG_NM, BC000V10_n541TBM11_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM11_IMAGE_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110V2 */
      e110V2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound30 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long A606TBM11_STUDY_ID ;
   private long A542TBM11_UPD_CNT ;
   private long Z542TBM11_UPD_CNT ;
   private long Z606TBM11_STUDY_ID ;
   private long O542TBM11_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode30 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A536TBM11_CRT_DATETIME ;
   private java.util.Date A539TBM11_UPD_DATETIME ;
   private java.util.Date Z536TBM11_CRT_DATETIME ;
   private java.util.Date Z539TBM11_UPD_DATETIME ;
   private boolean n536TBM11_CRT_DATETIME ;
   private boolean n537TBM11_CRT_USER_ID ;
   private boolean n539TBM11_UPD_DATETIME ;
   private boolean n540TBM11_UPD_USER_ID ;
   private boolean n542TBM11_UPD_CNT ;
   private boolean n634TBM11_IMAGE_NM ;
   private boolean n533TBM11_IMAGE ;
   private boolean n534TBM11_FILE_NAME ;
   private boolean n606TBM11_STUDY_ID ;
   private boolean n535TBM11_DEL_FLG ;
   private boolean n538TBM11_CRT_PROG_NM ;
   private boolean n541TBM11_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z533TBM11_IMAGE ;
   private String A533TBM11_IMAGE ;
   private String Z62TBM11_IMAGE_CD ;
   private String A62TBM11_IMAGE_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A634TBM11_IMAGE_NM ;
   private String A534TBM11_FILE_NAME ;
   private String A535TBM11_DEL_FLG ;
   private String A537TBM11_CRT_USER_ID ;
   private String A538TBM11_CRT_PROG_NM ;
   private String A540TBM11_UPD_USER_ID ;
   private String A541TBM11_UPD_PROG_NM ;
   private String Z537TBM11_CRT_USER_ID ;
   private String Z540TBM11_UPD_USER_ID ;
   private String Z634TBM11_IMAGE_NM ;
   private String Z534TBM11_FILE_NAME ;
   private String Z535TBM11_DEL_FLG ;
   private String Z538TBM11_CRT_PROG_NM ;
   private String Z541TBM11_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM11_IMAGE bcTBM11_IMAGE ;
   private IDataStoreProvider pr_default ;
   private String[] BC000V4_A62TBM11_IMAGE_CD ;
   private java.util.Date[] BC000V4_A536TBM11_CRT_DATETIME ;
   private boolean[] BC000V4_n536TBM11_CRT_DATETIME ;
   private String[] BC000V4_A537TBM11_CRT_USER_ID ;
   private boolean[] BC000V4_n537TBM11_CRT_USER_ID ;
   private java.util.Date[] BC000V4_A539TBM11_UPD_DATETIME ;
   private boolean[] BC000V4_n539TBM11_UPD_DATETIME ;
   private String[] BC000V4_A540TBM11_UPD_USER_ID ;
   private boolean[] BC000V4_n540TBM11_UPD_USER_ID ;
   private long[] BC000V4_A542TBM11_UPD_CNT ;
   private boolean[] BC000V4_n542TBM11_UPD_CNT ;
   private String[] BC000V4_A634TBM11_IMAGE_NM ;
   private boolean[] BC000V4_n634TBM11_IMAGE_NM ;
   private String[] BC000V4_A533TBM11_IMAGE ;
   private boolean[] BC000V4_n533TBM11_IMAGE ;
   private String[] BC000V4_A534TBM11_FILE_NAME ;
   private boolean[] BC000V4_n534TBM11_FILE_NAME ;
   private long[] BC000V4_A606TBM11_STUDY_ID ;
   private boolean[] BC000V4_n606TBM11_STUDY_ID ;
   private String[] BC000V4_A535TBM11_DEL_FLG ;
   private boolean[] BC000V4_n535TBM11_DEL_FLG ;
   private String[] BC000V4_A538TBM11_CRT_PROG_NM ;
   private boolean[] BC000V4_n538TBM11_CRT_PROG_NM ;
   private String[] BC000V4_A541TBM11_UPD_PROG_NM ;
   private boolean[] BC000V4_n541TBM11_UPD_PROG_NM ;
   private String[] BC000V5_A62TBM11_IMAGE_CD ;
   private String[] BC000V3_A62TBM11_IMAGE_CD ;
   private java.util.Date[] BC000V3_A536TBM11_CRT_DATETIME ;
   private boolean[] BC000V3_n536TBM11_CRT_DATETIME ;
   private String[] BC000V3_A537TBM11_CRT_USER_ID ;
   private boolean[] BC000V3_n537TBM11_CRT_USER_ID ;
   private java.util.Date[] BC000V3_A539TBM11_UPD_DATETIME ;
   private boolean[] BC000V3_n539TBM11_UPD_DATETIME ;
   private String[] BC000V3_A540TBM11_UPD_USER_ID ;
   private boolean[] BC000V3_n540TBM11_UPD_USER_ID ;
   private long[] BC000V3_A542TBM11_UPD_CNT ;
   private boolean[] BC000V3_n542TBM11_UPD_CNT ;
   private String[] BC000V3_A634TBM11_IMAGE_NM ;
   private boolean[] BC000V3_n634TBM11_IMAGE_NM ;
   private String[] BC000V3_A533TBM11_IMAGE ;
   private boolean[] BC000V3_n533TBM11_IMAGE ;
   private String[] BC000V3_A534TBM11_FILE_NAME ;
   private boolean[] BC000V3_n534TBM11_FILE_NAME ;
   private long[] BC000V3_A606TBM11_STUDY_ID ;
   private boolean[] BC000V3_n606TBM11_STUDY_ID ;
   private String[] BC000V3_A535TBM11_DEL_FLG ;
   private boolean[] BC000V3_n535TBM11_DEL_FLG ;
   private String[] BC000V3_A538TBM11_CRT_PROG_NM ;
   private boolean[] BC000V3_n538TBM11_CRT_PROG_NM ;
   private String[] BC000V3_A541TBM11_UPD_PROG_NM ;
   private boolean[] BC000V3_n541TBM11_UPD_PROG_NM ;
   private String[] BC000V2_A62TBM11_IMAGE_CD ;
   private java.util.Date[] BC000V2_A536TBM11_CRT_DATETIME ;
   private boolean[] BC000V2_n536TBM11_CRT_DATETIME ;
   private String[] BC000V2_A537TBM11_CRT_USER_ID ;
   private boolean[] BC000V2_n537TBM11_CRT_USER_ID ;
   private java.util.Date[] BC000V2_A539TBM11_UPD_DATETIME ;
   private boolean[] BC000V2_n539TBM11_UPD_DATETIME ;
   private String[] BC000V2_A540TBM11_UPD_USER_ID ;
   private boolean[] BC000V2_n540TBM11_UPD_USER_ID ;
   private long[] BC000V2_A542TBM11_UPD_CNT ;
   private boolean[] BC000V2_n542TBM11_UPD_CNT ;
   private String[] BC000V2_A634TBM11_IMAGE_NM ;
   private boolean[] BC000V2_n634TBM11_IMAGE_NM ;
   private String[] BC000V2_A533TBM11_IMAGE ;
   private boolean[] BC000V2_n533TBM11_IMAGE ;
   private String[] BC000V2_A534TBM11_FILE_NAME ;
   private boolean[] BC000V2_n534TBM11_FILE_NAME ;
   private long[] BC000V2_A606TBM11_STUDY_ID ;
   private boolean[] BC000V2_n606TBM11_STUDY_ID ;
   private String[] BC000V2_A535TBM11_DEL_FLG ;
   private boolean[] BC000V2_n535TBM11_DEL_FLG ;
   private String[] BC000V2_A538TBM11_CRT_PROG_NM ;
   private boolean[] BC000V2_n538TBM11_CRT_PROG_NM ;
   private String[] BC000V2_A541TBM11_UPD_PROG_NM ;
   private boolean[] BC000V2_n541TBM11_UPD_PROG_NM ;
   private String[] BC000V10_A62TBM11_IMAGE_CD ;
   private java.util.Date[] BC000V10_A536TBM11_CRT_DATETIME ;
   private boolean[] BC000V10_n536TBM11_CRT_DATETIME ;
   private String[] BC000V10_A537TBM11_CRT_USER_ID ;
   private boolean[] BC000V10_n537TBM11_CRT_USER_ID ;
   private java.util.Date[] BC000V10_A539TBM11_UPD_DATETIME ;
   private boolean[] BC000V10_n539TBM11_UPD_DATETIME ;
   private String[] BC000V10_A540TBM11_UPD_USER_ID ;
   private boolean[] BC000V10_n540TBM11_UPD_USER_ID ;
   private long[] BC000V10_A542TBM11_UPD_CNT ;
   private boolean[] BC000V10_n542TBM11_UPD_CNT ;
   private String[] BC000V10_A634TBM11_IMAGE_NM ;
   private boolean[] BC000V10_n634TBM11_IMAGE_NM ;
   private String[] BC000V10_A533TBM11_IMAGE ;
   private boolean[] BC000V10_n533TBM11_IMAGE ;
   private String[] BC000V10_A534TBM11_FILE_NAME ;
   private boolean[] BC000V10_n534TBM11_FILE_NAME ;
   private long[] BC000V10_A606TBM11_STUDY_ID ;
   private boolean[] BC000V10_n606TBM11_STUDY_ID ;
   private String[] BC000V10_A535TBM11_DEL_FLG ;
   private boolean[] BC000V10_n535TBM11_DEL_FLG ;
   private String[] BC000V10_A538TBM11_CRT_PROG_NM ;
   private boolean[] BC000V10_n538TBM11_CRT_PROG_NM ;
   private String[] BC000V10_A541TBM11_UPD_PROG_NM ;
   private boolean[] BC000V10_n541TBM11_UPD_PROG_NM ;
}

final  class tbm11_image_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000V2", "SELECT `TBM11_IMAGE_CD`, `TBM11_CRT_DATETIME`, `TBM11_CRT_USER_ID`, `TBM11_UPD_DATETIME`, `TBM11_UPD_USER_ID`, `TBM11_UPD_CNT`, `TBM11_IMAGE_NM`, `TBM11_IMAGE`, `TBM11_FILE_NAME`, `TBM11_STUDY_ID`, `TBM11_DEL_FLG`, `TBM11_CRT_PROG_NM`, `TBM11_UPD_PROG_NM` FROM `TBM11_IMAGE` WHERE `TBM11_IMAGE_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000V3", "SELECT `TBM11_IMAGE_CD`, `TBM11_CRT_DATETIME`, `TBM11_CRT_USER_ID`, `TBM11_UPD_DATETIME`, `TBM11_UPD_USER_ID`, `TBM11_UPD_CNT`, `TBM11_IMAGE_NM`, `TBM11_IMAGE`, `TBM11_FILE_NAME`, `TBM11_STUDY_ID`, `TBM11_DEL_FLG`, `TBM11_CRT_PROG_NM`, `TBM11_UPD_PROG_NM` FROM `TBM11_IMAGE` WHERE `TBM11_IMAGE_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000V4", "SELECT TM1.`TBM11_IMAGE_CD`, TM1.`TBM11_CRT_DATETIME`, TM1.`TBM11_CRT_USER_ID`, TM1.`TBM11_UPD_DATETIME`, TM1.`TBM11_UPD_USER_ID`, TM1.`TBM11_UPD_CNT`, TM1.`TBM11_IMAGE_NM`, TM1.`TBM11_IMAGE`, TM1.`TBM11_FILE_NAME`, TM1.`TBM11_STUDY_ID`, TM1.`TBM11_DEL_FLG`, TM1.`TBM11_CRT_PROG_NM`, TM1.`TBM11_UPD_PROG_NM` FROM `TBM11_IMAGE` TM1 WHERE TM1.`TBM11_IMAGE_CD` = ? ORDER BY TM1.`TBM11_IMAGE_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000V5", "SELECT `TBM11_IMAGE_CD` FROM `TBM11_IMAGE` WHERE `TBM11_IMAGE_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000V6", "INSERT INTO `TBM11_IMAGE`(`TBM11_IMAGE_CD`, `TBM11_CRT_DATETIME`, `TBM11_CRT_USER_ID`, `TBM11_UPD_DATETIME`, `TBM11_UPD_USER_ID`, `TBM11_UPD_CNT`, `TBM11_IMAGE_NM`, `TBM11_IMAGE`, `TBM11_FILE_NAME`, `TBM11_STUDY_ID`, `TBM11_DEL_FLG`, `TBM11_CRT_PROG_NM`, `TBM11_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000V7", "UPDATE `TBM11_IMAGE` SET `TBM11_CRT_DATETIME`=?, `TBM11_CRT_USER_ID`=?, `TBM11_UPD_DATETIME`=?, `TBM11_UPD_USER_ID`=?, `TBM11_UPD_CNT`=?, `TBM11_IMAGE_NM`=?, `TBM11_FILE_NAME`=?, `TBM11_STUDY_ID`=?, `TBM11_DEL_FLG`=?, `TBM11_CRT_PROG_NM`=?, `TBM11_UPD_PROG_NM`=?  WHERE `TBM11_IMAGE_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000V8", "UPDATE `TBM11_IMAGE` SET `TBM11_IMAGE`=?  WHERE `TBM11_IMAGE_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000V9", "DELETE FROM `TBM11_IMAGE`  WHERE `TBM11_IMAGE_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000V10", "SELECT TM1.`TBM11_IMAGE_CD`, TM1.`TBM11_CRT_DATETIME`, TM1.`TBM11_CRT_USER_ID`, TM1.`TBM11_UPD_DATETIME`, TM1.`TBM11_UPD_USER_ID`, TM1.`TBM11_UPD_CNT`, TM1.`TBM11_IMAGE_NM`, TM1.`TBM11_IMAGE`, TM1.`TBM11_FILE_NAME`, TM1.`TBM11_STUDY_ID`, TM1.`TBM11_DEL_FLG`, TM1.`TBM11_CRT_PROG_NM`, TM1.`TBM11_UPD_PROG_NM` FROM `TBM11_IMAGE` TM1 WHERE TM1.`TBM11_IMAGE_CD` = ? ORDER BY TM1.`TBM11_IMAGE_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[13])[0] = rslt.getBLOBFile(8, "tmp", "") ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getBLOBFile(8, "tmp", "") ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 2 :
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
               ((String[]) buf[13])[0] = rslt.getBLOBFile(8, "tmp", "") ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
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
               ((String[]) buf[13])[0] = rslt.getBLOBFile(8, "tmp", "") ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
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
                  stmt.setNull( 8 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(8, (String)parms[14]);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[18]).longValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 40);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 40);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
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
               stmt.setVarchar(12, (String)parms[22], 50, false);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(1, (String)parms[1]);
               }
               stmt.setVarchar(2, (String)parms[2], 50, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
      }
   }

}

