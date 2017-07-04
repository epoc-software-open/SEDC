/*
               File: tbm34_crf_auth_bc
        Description: CRF権限マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:11.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm34_crf_auth_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm34_crf_auth_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm34_crf_auth_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm34_crf_auth_bc.class ));
   }

   public tbm34_crf_auth_bc( int remoteHandle ,
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
         /* Execute user event: e120Z2 */
         e120Z2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z459TBM34_STUDY_ID = A459TBM34_STUDY_ID ;
            Z460TBM34_CRF_ID = A460TBM34_CRF_ID ;
            Z461TBM34_STYDY_AUTH_CD = A461TBM34_STYDY_AUTH_CD ;
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

   public void confirm_0Z0( )
   {
      beforeValidate0Z34( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0Z34( ) ;
         }
         else
         {
            checkExtendedTable0Z34( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0Z34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110Z2( )
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

   public void e120Z2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A459TBM34_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A460TBM34_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A461TBM34_STYDY_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A462TBM34_DISPLAY_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A463TBM34_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A464TBM34_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm34_crf_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A465TBM34_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A466TBM34_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A467TBM34_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm34_crf_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A468TBM34_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A469TBM34_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A470TBM34_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0Z34( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z464TBM34_CRT_DATETIME = A464TBM34_CRT_DATETIME ;
         Z465TBM34_CRT_USER_ID = A465TBM34_CRT_USER_ID ;
         Z467TBM34_UPD_DATETIME = A467TBM34_UPD_DATETIME ;
         Z468TBM34_UPD_USER_ID = A468TBM34_UPD_USER_ID ;
         Z470TBM34_UPD_CNT = A470TBM34_UPD_CNT ;
         Z462TBM34_DISPLAY_FLG = A462TBM34_DISPLAY_FLG ;
         Z463TBM34_DEL_FLG = A463TBM34_DEL_FLG ;
         Z466TBM34_CRT_PROG_NM = A466TBM34_CRT_PROG_NM ;
         Z469TBM34_UPD_PROG_NM = A469TBM34_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z459TBM34_STUDY_ID = A459TBM34_STUDY_ID ;
         Z460TBM34_CRF_ID = A460TBM34_CRF_ID ;
         Z461TBM34_STYDY_AUTH_CD = A461TBM34_STYDY_AUTH_CD ;
         Z464TBM34_CRT_DATETIME = A464TBM34_CRT_DATETIME ;
         Z465TBM34_CRT_USER_ID = A465TBM34_CRT_USER_ID ;
         Z467TBM34_UPD_DATETIME = A467TBM34_UPD_DATETIME ;
         Z468TBM34_UPD_USER_ID = A468TBM34_UPD_USER_ID ;
         Z470TBM34_UPD_CNT = A470TBM34_UPD_CNT ;
         Z462TBM34_DISPLAY_FLG = A462TBM34_DISPLAY_FLG ;
         Z463TBM34_DEL_FLG = A463TBM34_DEL_FLG ;
         Z466TBM34_CRT_PROG_NM = A466TBM34_CRT_PROG_NM ;
         Z469TBM34_UPD_PROG_NM = A469TBM34_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0Z34( )
   {
      /* Using cursor BC000Z4 */
      pr_default.execute(2, new Object[] {new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A464TBM34_CRT_DATETIME = BC000Z4_A464TBM34_CRT_DATETIME[0] ;
         n464TBM34_CRT_DATETIME = BC000Z4_n464TBM34_CRT_DATETIME[0] ;
         A465TBM34_CRT_USER_ID = BC000Z4_A465TBM34_CRT_USER_ID[0] ;
         n465TBM34_CRT_USER_ID = BC000Z4_n465TBM34_CRT_USER_ID[0] ;
         A467TBM34_UPD_DATETIME = BC000Z4_A467TBM34_UPD_DATETIME[0] ;
         n467TBM34_UPD_DATETIME = BC000Z4_n467TBM34_UPD_DATETIME[0] ;
         A468TBM34_UPD_USER_ID = BC000Z4_A468TBM34_UPD_USER_ID[0] ;
         n468TBM34_UPD_USER_ID = BC000Z4_n468TBM34_UPD_USER_ID[0] ;
         A470TBM34_UPD_CNT = BC000Z4_A470TBM34_UPD_CNT[0] ;
         n470TBM34_UPD_CNT = BC000Z4_n470TBM34_UPD_CNT[0] ;
         A462TBM34_DISPLAY_FLG = BC000Z4_A462TBM34_DISPLAY_FLG[0] ;
         n462TBM34_DISPLAY_FLG = BC000Z4_n462TBM34_DISPLAY_FLG[0] ;
         A463TBM34_DEL_FLG = BC000Z4_A463TBM34_DEL_FLG[0] ;
         n463TBM34_DEL_FLG = BC000Z4_n463TBM34_DEL_FLG[0] ;
         A466TBM34_CRT_PROG_NM = BC000Z4_A466TBM34_CRT_PROG_NM[0] ;
         n466TBM34_CRT_PROG_NM = BC000Z4_n466TBM34_CRT_PROG_NM[0] ;
         A469TBM34_UPD_PROG_NM = BC000Z4_A469TBM34_UPD_PROG_NM[0] ;
         n469TBM34_UPD_PROG_NM = BC000Z4_n469TBM34_UPD_PROG_NM[0] ;
         zm0Z34( -8) ;
      }
      pr_default.close(2);
      onLoadActions0Z34( ) ;
   }

   public void onLoadActions0Z34( )
   {
      AV9Pgmname = "TBM34_CRF_AUTH_BC" ;
   }

   public void checkExtendedTable0Z34( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM34_CRF_AUTH_BC" ;
      if ( ! ( GXutil.nullDate().equals(A464TBM34_CRT_DATETIME) || (( A464TBM34_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A464TBM34_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A467TBM34_UPD_DATETIME) || (( A467TBM34_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A467TBM34_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0Z34( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0Z34( )
   {
      /* Using cursor BC000Z5 */
      pr_default.execute(3, new Object[] {new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000Z3 */
      pr_default.execute(1, new Object[] {new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Z34( 8) ;
         RcdFound34 = (short)(1) ;
         A459TBM34_STUDY_ID = BC000Z3_A459TBM34_STUDY_ID[0] ;
         A460TBM34_CRF_ID = BC000Z3_A460TBM34_CRF_ID[0] ;
         A461TBM34_STYDY_AUTH_CD = BC000Z3_A461TBM34_STYDY_AUTH_CD[0] ;
         A464TBM34_CRT_DATETIME = BC000Z3_A464TBM34_CRT_DATETIME[0] ;
         n464TBM34_CRT_DATETIME = BC000Z3_n464TBM34_CRT_DATETIME[0] ;
         A465TBM34_CRT_USER_ID = BC000Z3_A465TBM34_CRT_USER_ID[0] ;
         n465TBM34_CRT_USER_ID = BC000Z3_n465TBM34_CRT_USER_ID[0] ;
         A467TBM34_UPD_DATETIME = BC000Z3_A467TBM34_UPD_DATETIME[0] ;
         n467TBM34_UPD_DATETIME = BC000Z3_n467TBM34_UPD_DATETIME[0] ;
         A468TBM34_UPD_USER_ID = BC000Z3_A468TBM34_UPD_USER_ID[0] ;
         n468TBM34_UPD_USER_ID = BC000Z3_n468TBM34_UPD_USER_ID[0] ;
         A470TBM34_UPD_CNT = BC000Z3_A470TBM34_UPD_CNT[0] ;
         n470TBM34_UPD_CNT = BC000Z3_n470TBM34_UPD_CNT[0] ;
         A462TBM34_DISPLAY_FLG = BC000Z3_A462TBM34_DISPLAY_FLG[0] ;
         n462TBM34_DISPLAY_FLG = BC000Z3_n462TBM34_DISPLAY_FLG[0] ;
         A463TBM34_DEL_FLG = BC000Z3_A463TBM34_DEL_FLG[0] ;
         n463TBM34_DEL_FLG = BC000Z3_n463TBM34_DEL_FLG[0] ;
         A466TBM34_CRT_PROG_NM = BC000Z3_A466TBM34_CRT_PROG_NM[0] ;
         n466TBM34_CRT_PROG_NM = BC000Z3_n466TBM34_CRT_PROG_NM[0] ;
         A469TBM34_UPD_PROG_NM = BC000Z3_A469TBM34_UPD_PROG_NM[0] ;
         n469TBM34_UPD_PROG_NM = BC000Z3_n469TBM34_UPD_PROG_NM[0] ;
         O470TBM34_UPD_CNT = A470TBM34_UPD_CNT ;
         n470TBM34_UPD_CNT = false ;
         Z459TBM34_STUDY_ID = A459TBM34_STUDY_ID ;
         Z460TBM34_CRF_ID = A460TBM34_CRF_ID ;
         Z461TBM34_STYDY_AUTH_CD = A461TBM34_STYDY_AUTH_CD ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0Z34( ) ;
         Gx_mode = sMode34 ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey0Z34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Z34( ) ;
      if ( RcdFound34 == 0 )
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
      confirm_0Z0( ) ;
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

   public void checkOptimisticConcurrency0Z34( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000Z2 */
         pr_default.execute(0, new Object[] {new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM34_CRF_AUTH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z464TBM34_CRT_DATETIME.equals( BC000Z2_A464TBM34_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z465TBM34_CRT_USER_ID, BC000Z2_A465TBM34_CRT_USER_ID[0]) != 0 ) || !( Z467TBM34_UPD_DATETIME.equals( BC000Z2_A467TBM34_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z468TBM34_UPD_USER_ID, BC000Z2_A468TBM34_UPD_USER_ID[0]) != 0 ) || ( Z470TBM34_UPD_CNT != BC000Z2_A470TBM34_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z462TBM34_DISPLAY_FLG, BC000Z2_A462TBM34_DISPLAY_FLG[0]) != 0 ) || ( GXutil.strcmp(Z463TBM34_DEL_FLG, BC000Z2_A463TBM34_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z466TBM34_CRT_PROG_NM, BC000Z2_A466TBM34_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z469TBM34_UPD_PROG_NM, BC000Z2_A469TBM34_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM34_CRF_AUTH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Z34( )
   {
      beforeValidate0Z34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Z34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Z34( 0) ;
         checkOptimisticConcurrency0Z34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Z34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Z34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000Z6 */
                  pr_default.execute(4, new Object[] {new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD, new Boolean(n464TBM34_CRT_DATETIME), A464TBM34_CRT_DATETIME, new Boolean(n465TBM34_CRT_USER_ID), A465TBM34_CRT_USER_ID, new Boolean(n467TBM34_UPD_DATETIME), A467TBM34_UPD_DATETIME, new Boolean(n468TBM34_UPD_USER_ID), A468TBM34_UPD_USER_ID, new Boolean(n470TBM34_UPD_CNT), new Long(A470TBM34_UPD_CNT), new Boolean(n462TBM34_DISPLAY_FLG), A462TBM34_DISPLAY_FLG, new Boolean(n463TBM34_DEL_FLG), A463TBM34_DEL_FLG, new Boolean(n466TBM34_CRT_PROG_NM), A466TBM34_CRT_PROG_NM, new Boolean(n469TBM34_UPD_PROG_NM), A469TBM34_UPD_PROG_NM});
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
            load0Z34( ) ;
         }
         endLevel0Z34( ) ;
      }
      closeExtendedTableCursors0Z34( ) ;
   }

   public void update0Z34( )
   {
      beforeValidate0Z34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Z34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Z34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Z34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Z34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000Z7 */
                  pr_default.execute(5, new Object[] {new Boolean(n464TBM34_CRT_DATETIME), A464TBM34_CRT_DATETIME, new Boolean(n465TBM34_CRT_USER_ID), A465TBM34_CRT_USER_ID, new Boolean(n467TBM34_UPD_DATETIME), A467TBM34_UPD_DATETIME, new Boolean(n468TBM34_UPD_USER_ID), A468TBM34_UPD_USER_ID, new Boolean(n470TBM34_UPD_CNT), new Long(A470TBM34_UPD_CNT), new Boolean(n462TBM34_DISPLAY_FLG), A462TBM34_DISPLAY_FLG, new Boolean(n463TBM34_DEL_FLG), A463TBM34_DEL_FLG, new Boolean(n466TBM34_CRT_PROG_NM), A466TBM34_CRT_PROG_NM, new Boolean(n469TBM34_UPD_PROG_NM), A469TBM34_UPD_PROG_NM, new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM34_CRF_AUTH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Z34( ) ;
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
         endLevel0Z34( ) ;
      }
      closeExtendedTableCursors0Z34( ) ;
   }

   public void deferredUpdate0Z34( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0Z34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Z34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Z34( ) ;
         afterConfirm0Z34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Z34( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000Z8 */
               pr_default.execute(6, new Object[] {new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD});
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0Z34( ) ;
      Gx_mode = sMode34 ;
   }

   public void onDeleteControls0Z34( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM34_CRF_AUTH_BC" ;
      }
   }

   public void endLevel0Z34( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Z34( ) ;
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

   public void scanKeyStart0Z34( )
   {
      /* Using cursor BC000Z9 */
      pr_default.execute(7, new Object[] {new Long(A459TBM34_STUDY_ID), new Short(A460TBM34_CRF_ID), A461TBM34_STYDY_AUTH_CD});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A459TBM34_STUDY_ID = BC000Z9_A459TBM34_STUDY_ID[0] ;
         A460TBM34_CRF_ID = BC000Z9_A460TBM34_CRF_ID[0] ;
         A461TBM34_STYDY_AUTH_CD = BC000Z9_A461TBM34_STYDY_AUTH_CD[0] ;
         A464TBM34_CRT_DATETIME = BC000Z9_A464TBM34_CRT_DATETIME[0] ;
         n464TBM34_CRT_DATETIME = BC000Z9_n464TBM34_CRT_DATETIME[0] ;
         A465TBM34_CRT_USER_ID = BC000Z9_A465TBM34_CRT_USER_ID[0] ;
         n465TBM34_CRT_USER_ID = BC000Z9_n465TBM34_CRT_USER_ID[0] ;
         A467TBM34_UPD_DATETIME = BC000Z9_A467TBM34_UPD_DATETIME[0] ;
         n467TBM34_UPD_DATETIME = BC000Z9_n467TBM34_UPD_DATETIME[0] ;
         A468TBM34_UPD_USER_ID = BC000Z9_A468TBM34_UPD_USER_ID[0] ;
         n468TBM34_UPD_USER_ID = BC000Z9_n468TBM34_UPD_USER_ID[0] ;
         A470TBM34_UPD_CNT = BC000Z9_A470TBM34_UPD_CNT[0] ;
         n470TBM34_UPD_CNT = BC000Z9_n470TBM34_UPD_CNT[0] ;
         A462TBM34_DISPLAY_FLG = BC000Z9_A462TBM34_DISPLAY_FLG[0] ;
         n462TBM34_DISPLAY_FLG = BC000Z9_n462TBM34_DISPLAY_FLG[0] ;
         A463TBM34_DEL_FLG = BC000Z9_A463TBM34_DEL_FLG[0] ;
         n463TBM34_DEL_FLG = BC000Z9_n463TBM34_DEL_FLG[0] ;
         A466TBM34_CRT_PROG_NM = BC000Z9_A466TBM34_CRT_PROG_NM[0] ;
         n466TBM34_CRT_PROG_NM = BC000Z9_n466TBM34_CRT_PROG_NM[0] ;
         A469TBM34_UPD_PROG_NM = BC000Z9_A469TBM34_UPD_PROG_NM[0] ;
         n469TBM34_UPD_PROG_NM = BC000Z9_n469TBM34_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0Z34( )
   {
      pr_default.readNext(7);
      RcdFound34 = (short)(0) ;
      scanKeyLoad0Z34( ) ;
   }

   public void scanKeyLoad0Z34( )
   {
      sMode34 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A459TBM34_STUDY_ID = BC000Z9_A459TBM34_STUDY_ID[0] ;
         A460TBM34_CRF_ID = BC000Z9_A460TBM34_CRF_ID[0] ;
         A461TBM34_STYDY_AUTH_CD = BC000Z9_A461TBM34_STYDY_AUTH_CD[0] ;
         A464TBM34_CRT_DATETIME = BC000Z9_A464TBM34_CRT_DATETIME[0] ;
         n464TBM34_CRT_DATETIME = BC000Z9_n464TBM34_CRT_DATETIME[0] ;
         A465TBM34_CRT_USER_ID = BC000Z9_A465TBM34_CRT_USER_ID[0] ;
         n465TBM34_CRT_USER_ID = BC000Z9_n465TBM34_CRT_USER_ID[0] ;
         A467TBM34_UPD_DATETIME = BC000Z9_A467TBM34_UPD_DATETIME[0] ;
         n467TBM34_UPD_DATETIME = BC000Z9_n467TBM34_UPD_DATETIME[0] ;
         A468TBM34_UPD_USER_ID = BC000Z9_A468TBM34_UPD_USER_ID[0] ;
         n468TBM34_UPD_USER_ID = BC000Z9_n468TBM34_UPD_USER_ID[0] ;
         A470TBM34_UPD_CNT = BC000Z9_A470TBM34_UPD_CNT[0] ;
         n470TBM34_UPD_CNT = BC000Z9_n470TBM34_UPD_CNT[0] ;
         A462TBM34_DISPLAY_FLG = BC000Z9_A462TBM34_DISPLAY_FLG[0] ;
         n462TBM34_DISPLAY_FLG = BC000Z9_n462TBM34_DISPLAY_FLG[0] ;
         A463TBM34_DEL_FLG = BC000Z9_A463TBM34_DEL_FLG[0] ;
         n463TBM34_DEL_FLG = BC000Z9_n463TBM34_DEL_FLG[0] ;
         A466TBM34_CRT_PROG_NM = BC000Z9_A466TBM34_CRT_PROG_NM[0] ;
         n466TBM34_CRT_PROG_NM = BC000Z9_n466TBM34_CRT_PROG_NM[0] ;
         A469TBM34_UPD_PROG_NM = BC000Z9_A469TBM34_UPD_PROG_NM[0] ;
         n469TBM34_UPD_PROG_NM = BC000Z9_n469TBM34_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode34 ;
   }

   public void scanKeyEnd0Z34( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0Z34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Z34( )
   {
      /* Before Insert Rules */
      A464TBM34_CRT_DATETIME = GXutil.now( ) ;
      n464TBM34_CRT_DATETIME = false ;
      GXt_char1 = A465TBM34_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm34_crf_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      A465TBM34_CRT_USER_ID = GXt_char1 ;
      n465TBM34_CRT_USER_ID = false ;
      A467TBM34_UPD_DATETIME = GXutil.now( ) ;
      n467TBM34_UPD_DATETIME = false ;
      GXt_char1 = A468TBM34_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm34_crf_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      A468TBM34_UPD_USER_ID = GXt_char1 ;
      n468TBM34_UPD_USER_ID = false ;
      A470TBM34_UPD_CNT = (long)(O470TBM34_UPD_CNT+1) ;
      n470TBM34_UPD_CNT = false ;
   }

   public void beforeUpdate0Z34( )
   {
      /* Before Update Rules */
      A467TBM34_UPD_DATETIME = GXutil.now( ) ;
      n467TBM34_UPD_DATETIME = false ;
      GXt_char1 = A468TBM34_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm34_crf_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      A468TBM34_UPD_USER_ID = GXt_char1 ;
      n468TBM34_UPD_USER_ID = false ;
      A470TBM34_UPD_CNT = (long)(O470TBM34_UPD_CNT+1) ;
      n470TBM34_UPD_CNT = false ;
   }

   public void beforeDelete0Z34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Z34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Z34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Z34( )
   {
   }

   public void addRow0Z34( )
   {
      VarsToRow34( bcTBM34_CRF_AUTH) ;
   }

   public void readRow0Z34( )
   {
      RowToVars34( bcTBM34_CRF_AUTH, 1) ;
   }

   public void initializeNonKey0Z34( )
   {
      A464TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n464TBM34_CRT_DATETIME = false ;
      A465TBM34_CRT_USER_ID = "" ;
      n465TBM34_CRT_USER_ID = false ;
      A467TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n467TBM34_UPD_DATETIME = false ;
      A468TBM34_UPD_USER_ID = "" ;
      n468TBM34_UPD_USER_ID = false ;
      A470TBM34_UPD_CNT = 0 ;
      n470TBM34_UPD_CNT = false ;
      A462TBM34_DISPLAY_FLG = "" ;
      n462TBM34_DISPLAY_FLG = false ;
      A463TBM34_DEL_FLG = "" ;
      n463TBM34_DEL_FLG = false ;
      A466TBM34_CRT_PROG_NM = "" ;
      n466TBM34_CRT_PROG_NM = false ;
      A469TBM34_UPD_PROG_NM = "" ;
      n469TBM34_UPD_PROG_NM = false ;
      O470TBM34_UPD_CNT = A470TBM34_UPD_CNT ;
      n470TBM34_UPD_CNT = false ;
   }

   public void initAll0Z34( )
   {
      A459TBM34_STUDY_ID = 0 ;
      A460TBM34_CRF_ID = (short)(0) ;
      A461TBM34_STYDY_AUTH_CD = "" ;
      initializeNonKey0Z34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow34( SdtTBM34_CRF_AUTH obj34 )
   {
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Mode( Gx_mode );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime( A464TBM34_CRT_DATETIME );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id( A465TBM34_CRT_USER_ID );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime( A467TBM34_UPD_DATETIME );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id( A468TBM34_UPD_USER_ID );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt( A470TBM34_UPD_CNT );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg( A462TBM34_DISPLAY_FLG );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg( A463TBM34_DEL_FLG );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm( A466TBM34_CRT_PROG_NM );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm( A469TBM34_UPD_PROG_NM );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id( A459TBM34_STUDY_ID );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id( A460TBM34_CRF_ID );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd( A461TBM34_STYDY_AUTH_CD );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z( Z459TBM34_STUDY_ID );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z( Z460TBM34_CRF_ID );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z( Z461TBM34_STYDY_AUTH_CD );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z( Z462TBM34_DISPLAY_FLG );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z( Z463TBM34_DEL_FLG );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z( Z464TBM34_CRT_DATETIME );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z( Z465TBM34_CRT_USER_ID );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z( Z466TBM34_CRT_PROG_NM );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z( Z467TBM34_UPD_DATETIME );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z( Z468TBM34_UPD_USER_ID );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z( Z469TBM34_UPD_PROG_NM );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z( Z470TBM34_UPD_CNT );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N( (byte)((byte)((n462TBM34_DISPLAY_FLG)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N( (byte)((byte)((n463TBM34_DEL_FLG)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N( (byte)((byte)((n464TBM34_CRT_DATETIME)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N( (byte)((byte)((n465TBM34_CRT_USER_ID)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N( (byte)((byte)((n466TBM34_CRT_PROG_NM)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N( (byte)((byte)((n467TBM34_UPD_DATETIME)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N( (byte)((byte)((n468TBM34_UPD_USER_ID)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N( (byte)((byte)((n469TBM34_UPD_PROG_NM)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N( (byte)((byte)((n470TBM34_UPD_CNT)?1:0)) );
      obj34.setgxTv_SdtTBM34_CRF_AUTH_Mode( Gx_mode );
   }

   public void RowToVars34( SdtTBM34_CRF_AUTH obj34 ,
                            int forceLoad )
   {
      Gx_mode = obj34.getgxTv_SdtTBM34_CRF_AUTH_Mode() ;
      A464TBM34_CRT_DATETIME = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime() ;
      n464TBM34_CRT_DATETIME = false ;
      A465TBM34_CRT_USER_ID = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id() ;
      n465TBM34_CRT_USER_ID = false ;
      A467TBM34_UPD_DATETIME = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime() ;
      n467TBM34_UPD_DATETIME = false ;
      A468TBM34_UPD_USER_ID = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id() ;
      n468TBM34_UPD_USER_ID = false ;
      A470TBM34_UPD_CNT = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt() ;
      n470TBM34_UPD_CNT = false ;
      A462TBM34_DISPLAY_FLG = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg() ;
      n462TBM34_DISPLAY_FLG = false ;
      A463TBM34_DEL_FLG = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg() ;
      n463TBM34_DEL_FLG = false ;
      A466TBM34_CRT_PROG_NM = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm() ;
      n466TBM34_CRT_PROG_NM = false ;
      A469TBM34_UPD_PROG_NM = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm() ;
      n469TBM34_UPD_PROG_NM = false ;
      A459TBM34_STUDY_ID = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id() ;
      A460TBM34_CRF_ID = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id() ;
      A461TBM34_STYDY_AUTH_CD = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd() ;
      Z459TBM34_STUDY_ID = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z() ;
      Z460TBM34_CRF_ID = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z() ;
      Z461TBM34_STYDY_AUTH_CD = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z() ;
      Z462TBM34_DISPLAY_FLG = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z() ;
      Z463TBM34_DEL_FLG = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z() ;
      Z464TBM34_CRT_DATETIME = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z() ;
      Z465TBM34_CRT_USER_ID = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z() ;
      Z466TBM34_CRT_PROG_NM = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z() ;
      Z467TBM34_UPD_DATETIME = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z() ;
      Z468TBM34_UPD_USER_ID = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z() ;
      Z469TBM34_UPD_PROG_NM = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z() ;
      Z470TBM34_UPD_CNT = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z() ;
      O470TBM34_UPD_CNT = obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z() ;
      n462TBM34_DISPLAY_FLG = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N()==0)?false:true) ;
      n463TBM34_DEL_FLG = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N()==0)?false:true) ;
      n464TBM34_CRT_DATETIME = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N()==0)?false:true) ;
      n465TBM34_CRT_USER_ID = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N()==0)?false:true) ;
      n466TBM34_CRT_PROG_NM = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N()==0)?false:true) ;
      n467TBM34_UPD_DATETIME = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N()==0)?false:true) ;
      n468TBM34_UPD_USER_ID = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N()==0)?false:true) ;
      n469TBM34_UPD_PROG_NM = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N()==0)?false:true) ;
      n470TBM34_UPD_CNT = (boolean)((obj34.getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj34.getgxTv_SdtTBM34_CRF_AUTH_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A459TBM34_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A460TBM34_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A461TBM34_STYDY_AUTH_CD = (String)getParm(obj,2) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0Z34( ) ;
      scanKeyStart0Z34( ) ;
      if ( RcdFound34 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z459TBM34_STUDY_ID = A459TBM34_STUDY_ID ;
         Z460TBM34_CRF_ID = A460TBM34_CRF_ID ;
         Z461TBM34_STYDY_AUTH_CD = A461TBM34_STYDY_AUTH_CD ;
         O470TBM34_UPD_CNT = A470TBM34_UPD_CNT ;
         n470TBM34_UPD_CNT = false ;
      }
      zm0Z34( -8) ;
      sMode34 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0Z34( ) ;
      Gx_mode = sMode34 ;
      addRow0Z34( ) ;
      scanKeyEnd0Z34( ) ;
      if ( RcdFound34 == 0 )
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
      RowToVars34( bcTBM34_CRF_AUTH, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0Z34( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A459TBM34_STUDY_ID != Z459TBM34_STUDY_ID ) || ( A460TBM34_CRF_ID != Z460TBM34_CRF_ID ) || ( GXutil.strcmp(A461TBM34_STYDY_AUTH_CD, Z461TBM34_STYDY_AUTH_CD) != 0 ) )
         {
            A459TBM34_STUDY_ID = Z459TBM34_STUDY_ID ;
            A460TBM34_CRF_ID = Z460TBM34_CRF_ID ;
            A461TBM34_STYDY_AUTH_CD = Z461TBM34_STYDY_AUTH_CD ;
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
            update0Z34( ) ;
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
            if ( ( A459TBM34_STUDY_ID != Z459TBM34_STUDY_ID ) || ( A460TBM34_CRF_ID != Z460TBM34_CRF_ID ) || ( GXutil.strcmp(A461TBM34_STYDY_AUTH_CD, Z461TBM34_STYDY_AUTH_CD) != 0 ) )
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
                  insert0Z34( ) ;
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
                  insert0Z34( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow34( bcTBM34_CRF_AUTH) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars34( bcTBM34_CRF_AUTH, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0Z34( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A459TBM34_STUDY_ID != Z459TBM34_STUDY_ID ) || ( A460TBM34_CRF_ID != Z460TBM34_CRF_ID ) || ( GXutil.strcmp(A461TBM34_STYDY_AUTH_CD, Z461TBM34_STYDY_AUTH_CD) != 0 ) )
         {
            A459TBM34_STUDY_ID = Z459TBM34_STUDY_ID ;
            A460TBM34_CRF_ID = Z460TBM34_CRF_ID ;
            A461TBM34_STYDY_AUTH_CD = Z461TBM34_STYDY_AUTH_CD ;
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
         if ( ( A459TBM34_STUDY_ID != Z459TBM34_STUDY_ID ) || ( A460TBM34_CRF_ID != Z460TBM34_CRF_ID ) || ( GXutil.strcmp(A461TBM34_STYDY_AUTH_CD, Z461TBM34_STYDY_AUTH_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm34_crf_auth_bc");
      VarsToRow34( bcTBM34_CRF_AUTH) ;
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
      Gx_mode = bcTBM34_CRF_AUTH.getgxTv_SdtTBM34_CRF_AUTH_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM34_CRF_AUTH sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM34_CRF_AUTH )
      {
         bcTBM34_CRF_AUTH = sdt ;
         if ( GXutil.strcmp(bcTBM34_CRF_AUTH.getgxTv_SdtTBM34_CRF_AUTH_Mode(), "") == 0 )
         {
            bcTBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow34( bcTBM34_CRF_AUTH) ;
         }
         else
         {
            RowToVars34( bcTBM34_CRF_AUTH, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM34_CRF_AUTH.getgxTv_SdtTBM34_CRF_AUTH_Mode(), "") == 0 )
         {
            bcTBM34_CRF_AUTH.setgxTv_SdtTBM34_CRF_AUTH_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars34( bcTBM34_CRF_AUTH, 1) ;
   }

   public SdtTBM34_CRF_AUTH getTBM34_CRF_AUTH_BC( )
   {
      return bcTBM34_CRF_AUTH ;
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
      Z461TBM34_STYDY_AUTH_CD = "" ;
      A461TBM34_STYDY_AUTH_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A462TBM34_DISPLAY_FLG = "" ;
      A463TBM34_DEL_FLG = "" ;
      A464TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A465TBM34_CRT_USER_ID = "" ;
      A466TBM34_CRT_PROG_NM = "" ;
      A467TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A468TBM34_UPD_USER_ID = "" ;
      A469TBM34_UPD_PROG_NM = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z = "" ;
      Z464TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z465TBM34_CRT_USER_ID = "" ;
      Z467TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z468TBM34_UPD_USER_ID = "" ;
      Z462TBM34_DISPLAY_FLG = "" ;
      Z463TBM34_DEL_FLG = "" ;
      Z466TBM34_CRT_PROG_NM = "" ;
      Z469TBM34_UPD_PROG_NM = "" ;
      BC000Z4_A459TBM34_STUDY_ID = new long[1] ;
      BC000Z4_A460TBM34_CRF_ID = new short[1] ;
      BC000Z4_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      BC000Z4_A464TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Z4_n464TBM34_CRT_DATETIME = new boolean[] {false} ;
      BC000Z4_A465TBM34_CRT_USER_ID = new String[] {""} ;
      BC000Z4_n465TBM34_CRT_USER_ID = new boolean[] {false} ;
      BC000Z4_A467TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Z4_n467TBM34_UPD_DATETIME = new boolean[] {false} ;
      BC000Z4_A468TBM34_UPD_USER_ID = new String[] {""} ;
      BC000Z4_n468TBM34_UPD_USER_ID = new boolean[] {false} ;
      BC000Z4_A470TBM34_UPD_CNT = new long[1] ;
      BC000Z4_n470TBM34_UPD_CNT = new boolean[] {false} ;
      BC000Z4_A462TBM34_DISPLAY_FLG = new String[] {""} ;
      BC000Z4_n462TBM34_DISPLAY_FLG = new boolean[] {false} ;
      BC000Z4_A463TBM34_DEL_FLG = new String[] {""} ;
      BC000Z4_n463TBM34_DEL_FLG = new boolean[] {false} ;
      BC000Z4_A466TBM34_CRT_PROG_NM = new String[] {""} ;
      BC000Z4_n466TBM34_CRT_PROG_NM = new boolean[] {false} ;
      BC000Z4_A469TBM34_UPD_PROG_NM = new String[] {""} ;
      BC000Z4_n469TBM34_UPD_PROG_NM = new boolean[] {false} ;
      BC000Z5_A459TBM34_STUDY_ID = new long[1] ;
      BC000Z5_A460TBM34_CRF_ID = new short[1] ;
      BC000Z5_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      BC000Z3_A459TBM34_STUDY_ID = new long[1] ;
      BC000Z3_A460TBM34_CRF_ID = new short[1] ;
      BC000Z3_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      BC000Z3_A464TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Z3_n464TBM34_CRT_DATETIME = new boolean[] {false} ;
      BC000Z3_A465TBM34_CRT_USER_ID = new String[] {""} ;
      BC000Z3_n465TBM34_CRT_USER_ID = new boolean[] {false} ;
      BC000Z3_A467TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Z3_n467TBM34_UPD_DATETIME = new boolean[] {false} ;
      BC000Z3_A468TBM34_UPD_USER_ID = new String[] {""} ;
      BC000Z3_n468TBM34_UPD_USER_ID = new boolean[] {false} ;
      BC000Z3_A470TBM34_UPD_CNT = new long[1] ;
      BC000Z3_n470TBM34_UPD_CNT = new boolean[] {false} ;
      BC000Z3_A462TBM34_DISPLAY_FLG = new String[] {""} ;
      BC000Z3_n462TBM34_DISPLAY_FLG = new boolean[] {false} ;
      BC000Z3_A463TBM34_DEL_FLG = new String[] {""} ;
      BC000Z3_n463TBM34_DEL_FLG = new boolean[] {false} ;
      BC000Z3_A466TBM34_CRT_PROG_NM = new String[] {""} ;
      BC000Z3_n466TBM34_CRT_PROG_NM = new boolean[] {false} ;
      BC000Z3_A469TBM34_UPD_PROG_NM = new String[] {""} ;
      BC000Z3_n469TBM34_UPD_PROG_NM = new boolean[] {false} ;
      sMode34 = "" ;
      BC000Z2_A459TBM34_STUDY_ID = new long[1] ;
      BC000Z2_A460TBM34_CRF_ID = new short[1] ;
      BC000Z2_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      BC000Z2_A464TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Z2_n464TBM34_CRT_DATETIME = new boolean[] {false} ;
      BC000Z2_A465TBM34_CRT_USER_ID = new String[] {""} ;
      BC000Z2_n465TBM34_CRT_USER_ID = new boolean[] {false} ;
      BC000Z2_A467TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Z2_n467TBM34_UPD_DATETIME = new boolean[] {false} ;
      BC000Z2_A468TBM34_UPD_USER_ID = new String[] {""} ;
      BC000Z2_n468TBM34_UPD_USER_ID = new boolean[] {false} ;
      BC000Z2_A470TBM34_UPD_CNT = new long[1] ;
      BC000Z2_n470TBM34_UPD_CNT = new boolean[] {false} ;
      BC000Z2_A462TBM34_DISPLAY_FLG = new String[] {""} ;
      BC000Z2_n462TBM34_DISPLAY_FLG = new boolean[] {false} ;
      BC000Z2_A463TBM34_DEL_FLG = new String[] {""} ;
      BC000Z2_n463TBM34_DEL_FLG = new boolean[] {false} ;
      BC000Z2_A466TBM34_CRT_PROG_NM = new String[] {""} ;
      BC000Z2_n466TBM34_CRT_PROG_NM = new boolean[] {false} ;
      BC000Z2_A469TBM34_UPD_PROG_NM = new String[] {""} ;
      BC000Z2_n469TBM34_UPD_PROG_NM = new boolean[] {false} ;
      BC000Z9_A459TBM34_STUDY_ID = new long[1] ;
      BC000Z9_A460TBM34_CRF_ID = new short[1] ;
      BC000Z9_A461TBM34_STYDY_AUTH_CD = new String[] {""} ;
      BC000Z9_A464TBM34_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Z9_n464TBM34_CRT_DATETIME = new boolean[] {false} ;
      BC000Z9_A465TBM34_CRT_USER_ID = new String[] {""} ;
      BC000Z9_n465TBM34_CRT_USER_ID = new boolean[] {false} ;
      BC000Z9_A467TBM34_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000Z9_n467TBM34_UPD_DATETIME = new boolean[] {false} ;
      BC000Z9_A468TBM34_UPD_USER_ID = new String[] {""} ;
      BC000Z9_n468TBM34_UPD_USER_ID = new boolean[] {false} ;
      BC000Z9_A470TBM34_UPD_CNT = new long[1] ;
      BC000Z9_n470TBM34_UPD_CNT = new boolean[] {false} ;
      BC000Z9_A462TBM34_DISPLAY_FLG = new String[] {""} ;
      BC000Z9_n462TBM34_DISPLAY_FLG = new boolean[] {false} ;
      BC000Z9_A463TBM34_DEL_FLG = new String[] {""} ;
      BC000Z9_n463TBM34_DEL_FLG = new boolean[] {false} ;
      BC000Z9_A466TBM34_CRT_PROG_NM = new String[] {""} ;
      BC000Z9_n466TBM34_CRT_PROG_NM = new boolean[] {false} ;
      BC000Z9_A469TBM34_UPD_PROG_NM = new String[] {""} ;
      BC000Z9_n469TBM34_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm34_crf_auth_bc__default(),
         new Object[] {
             new Object[] {
            BC000Z2_A459TBM34_STUDY_ID, BC000Z2_A460TBM34_CRF_ID, BC000Z2_A461TBM34_STYDY_AUTH_CD, BC000Z2_A464TBM34_CRT_DATETIME, BC000Z2_n464TBM34_CRT_DATETIME, BC000Z2_A465TBM34_CRT_USER_ID, BC000Z2_n465TBM34_CRT_USER_ID, BC000Z2_A467TBM34_UPD_DATETIME, BC000Z2_n467TBM34_UPD_DATETIME, BC000Z2_A468TBM34_UPD_USER_ID,
            BC000Z2_n468TBM34_UPD_USER_ID, BC000Z2_A470TBM34_UPD_CNT, BC000Z2_n470TBM34_UPD_CNT, BC000Z2_A462TBM34_DISPLAY_FLG, BC000Z2_n462TBM34_DISPLAY_FLG, BC000Z2_A463TBM34_DEL_FLG, BC000Z2_n463TBM34_DEL_FLG, BC000Z2_A466TBM34_CRT_PROG_NM, BC000Z2_n466TBM34_CRT_PROG_NM, BC000Z2_A469TBM34_UPD_PROG_NM,
            BC000Z2_n469TBM34_UPD_PROG_NM
            }
            , new Object[] {
            BC000Z3_A459TBM34_STUDY_ID, BC000Z3_A460TBM34_CRF_ID, BC000Z3_A461TBM34_STYDY_AUTH_CD, BC000Z3_A464TBM34_CRT_DATETIME, BC000Z3_n464TBM34_CRT_DATETIME, BC000Z3_A465TBM34_CRT_USER_ID, BC000Z3_n465TBM34_CRT_USER_ID, BC000Z3_A467TBM34_UPD_DATETIME, BC000Z3_n467TBM34_UPD_DATETIME, BC000Z3_A468TBM34_UPD_USER_ID,
            BC000Z3_n468TBM34_UPD_USER_ID, BC000Z3_A470TBM34_UPD_CNT, BC000Z3_n470TBM34_UPD_CNT, BC000Z3_A462TBM34_DISPLAY_FLG, BC000Z3_n462TBM34_DISPLAY_FLG, BC000Z3_A463TBM34_DEL_FLG, BC000Z3_n463TBM34_DEL_FLG, BC000Z3_A466TBM34_CRT_PROG_NM, BC000Z3_n466TBM34_CRT_PROG_NM, BC000Z3_A469TBM34_UPD_PROG_NM,
            BC000Z3_n469TBM34_UPD_PROG_NM
            }
            , new Object[] {
            BC000Z4_A459TBM34_STUDY_ID, BC000Z4_A460TBM34_CRF_ID, BC000Z4_A461TBM34_STYDY_AUTH_CD, BC000Z4_A464TBM34_CRT_DATETIME, BC000Z4_n464TBM34_CRT_DATETIME, BC000Z4_A465TBM34_CRT_USER_ID, BC000Z4_n465TBM34_CRT_USER_ID, BC000Z4_A467TBM34_UPD_DATETIME, BC000Z4_n467TBM34_UPD_DATETIME, BC000Z4_A468TBM34_UPD_USER_ID,
            BC000Z4_n468TBM34_UPD_USER_ID, BC000Z4_A470TBM34_UPD_CNT, BC000Z4_n470TBM34_UPD_CNT, BC000Z4_A462TBM34_DISPLAY_FLG, BC000Z4_n462TBM34_DISPLAY_FLG, BC000Z4_A463TBM34_DEL_FLG, BC000Z4_n463TBM34_DEL_FLG, BC000Z4_A466TBM34_CRT_PROG_NM, BC000Z4_n466TBM34_CRT_PROG_NM, BC000Z4_A469TBM34_UPD_PROG_NM,
            BC000Z4_n469TBM34_UPD_PROG_NM
            }
            , new Object[] {
            BC000Z5_A459TBM34_STUDY_ID, BC000Z5_A460TBM34_CRF_ID, BC000Z5_A461TBM34_STYDY_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000Z9_A459TBM34_STUDY_ID, BC000Z9_A460TBM34_CRF_ID, BC000Z9_A461TBM34_STYDY_AUTH_CD, BC000Z9_A464TBM34_CRT_DATETIME, BC000Z9_n464TBM34_CRT_DATETIME, BC000Z9_A465TBM34_CRT_USER_ID, BC000Z9_n465TBM34_CRT_USER_ID, BC000Z9_A467TBM34_UPD_DATETIME, BC000Z9_n467TBM34_UPD_DATETIME, BC000Z9_A468TBM34_UPD_USER_ID,
            BC000Z9_n468TBM34_UPD_USER_ID, BC000Z9_A470TBM34_UPD_CNT, BC000Z9_n470TBM34_UPD_CNT, BC000Z9_A462TBM34_DISPLAY_FLG, BC000Z9_n462TBM34_DISPLAY_FLG, BC000Z9_A463TBM34_DEL_FLG, BC000Z9_n463TBM34_DEL_FLG, BC000Z9_A466TBM34_CRT_PROG_NM, BC000Z9_n466TBM34_CRT_PROG_NM, BC000Z9_A469TBM34_UPD_PROG_NM,
            BC000Z9_n469TBM34_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM34_CRF_AUTH_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110Z2 */
      e110Z2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z460TBM34_CRF_ID ;
   private short A460TBM34_CRF_ID ;
   private short gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z ;
   private short RcdFound34 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z459TBM34_STUDY_ID ;
   private long A459TBM34_STUDY_ID ;
   private long A470TBM34_UPD_CNT ;
   private long gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z ;
   private long gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z ;
   private long Z470TBM34_UPD_CNT ;
   private long O470TBM34_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode34 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A464TBM34_CRT_DATETIME ;
   private java.util.Date A467TBM34_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z ;
   private java.util.Date Z464TBM34_CRT_DATETIME ;
   private java.util.Date Z467TBM34_UPD_DATETIME ;
   private boolean n464TBM34_CRT_DATETIME ;
   private boolean n465TBM34_CRT_USER_ID ;
   private boolean n467TBM34_UPD_DATETIME ;
   private boolean n468TBM34_UPD_USER_ID ;
   private boolean n470TBM34_UPD_CNT ;
   private boolean n462TBM34_DISPLAY_FLG ;
   private boolean n463TBM34_DEL_FLG ;
   private boolean n466TBM34_CRT_PROG_NM ;
   private boolean n469TBM34_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z461TBM34_STYDY_AUTH_CD ;
   private String A461TBM34_STYDY_AUTH_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A462TBM34_DISPLAY_FLG ;
   private String A463TBM34_DEL_FLG ;
   private String A465TBM34_CRT_USER_ID ;
   private String A466TBM34_CRT_PROG_NM ;
   private String A468TBM34_UPD_USER_ID ;
   private String A469TBM34_UPD_PROG_NM ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z ;
   private String Z465TBM34_CRT_USER_ID ;
   private String Z468TBM34_UPD_USER_ID ;
   private String Z462TBM34_DISPLAY_FLG ;
   private String Z463TBM34_DEL_FLG ;
   private String Z466TBM34_CRT_PROG_NM ;
   private String Z469TBM34_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM34_CRF_AUTH bcTBM34_CRF_AUTH ;
   private IDataStoreProvider pr_default ;
   private long[] BC000Z4_A459TBM34_STUDY_ID ;
   private short[] BC000Z4_A460TBM34_CRF_ID ;
   private String[] BC000Z4_A461TBM34_STYDY_AUTH_CD ;
   private java.util.Date[] BC000Z4_A464TBM34_CRT_DATETIME ;
   private boolean[] BC000Z4_n464TBM34_CRT_DATETIME ;
   private String[] BC000Z4_A465TBM34_CRT_USER_ID ;
   private boolean[] BC000Z4_n465TBM34_CRT_USER_ID ;
   private java.util.Date[] BC000Z4_A467TBM34_UPD_DATETIME ;
   private boolean[] BC000Z4_n467TBM34_UPD_DATETIME ;
   private String[] BC000Z4_A468TBM34_UPD_USER_ID ;
   private boolean[] BC000Z4_n468TBM34_UPD_USER_ID ;
   private long[] BC000Z4_A470TBM34_UPD_CNT ;
   private boolean[] BC000Z4_n470TBM34_UPD_CNT ;
   private String[] BC000Z4_A462TBM34_DISPLAY_FLG ;
   private boolean[] BC000Z4_n462TBM34_DISPLAY_FLG ;
   private String[] BC000Z4_A463TBM34_DEL_FLG ;
   private boolean[] BC000Z4_n463TBM34_DEL_FLG ;
   private String[] BC000Z4_A466TBM34_CRT_PROG_NM ;
   private boolean[] BC000Z4_n466TBM34_CRT_PROG_NM ;
   private String[] BC000Z4_A469TBM34_UPD_PROG_NM ;
   private boolean[] BC000Z4_n469TBM34_UPD_PROG_NM ;
   private long[] BC000Z5_A459TBM34_STUDY_ID ;
   private short[] BC000Z5_A460TBM34_CRF_ID ;
   private String[] BC000Z5_A461TBM34_STYDY_AUTH_CD ;
   private long[] BC000Z3_A459TBM34_STUDY_ID ;
   private short[] BC000Z3_A460TBM34_CRF_ID ;
   private String[] BC000Z3_A461TBM34_STYDY_AUTH_CD ;
   private java.util.Date[] BC000Z3_A464TBM34_CRT_DATETIME ;
   private boolean[] BC000Z3_n464TBM34_CRT_DATETIME ;
   private String[] BC000Z3_A465TBM34_CRT_USER_ID ;
   private boolean[] BC000Z3_n465TBM34_CRT_USER_ID ;
   private java.util.Date[] BC000Z3_A467TBM34_UPD_DATETIME ;
   private boolean[] BC000Z3_n467TBM34_UPD_DATETIME ;
   private String[] BC000Z3_A468TBM34_UPD_USER_ID ;
   private boolean[] BC000Z3_n468TBM34_UPD_USER_ID ;
   private long[] BC000Z3_A470TBM34_UPD_CNT ;
   private boolean[] BC000Z3_n470TBM34_UPD_CNT ;
   private String[] BC000Z3_A462TBM34_DISPLAY_FLG ;
   private boolean[] BC000Z3_n462TBM34_DISPLAY_FLG ;
   private String[] BC000Z3_A463TBM34_DEL_FLG ;
   private boolean[] BC000Z3_n463TBM34_DEL_FLG ;
   private String[] BC000Z3_A466TBM34_CRT_PROG_NM ;
   private boolean[] BC000Z3_n466TBM34_CRT_PROG_NM ;
   private String[] BC000Z3_A469TBM34_UPD_PROG_NM ;
   private boolean[] BC000Z3_n469TBM34_UPD_PROG_NM ;
   private long[] BC000Z2_A459TBM34_STUDY_ID ;
   private short[] BC000Z2_A460TBM34_CRF_ID ;
   private String[] BC000Z2_A461TBM34_STYDY_AUTH_CD ;
   private java.util.Date[] BC000Z2_A464TBM34_CRT_DATETIME ;
   private boolean[] BC000Z2_n464TBM34_CRT_DATETIME ;
   private String[] BC000Z2_A465TBM34_CRT_USER_ID ;
   private boolean[] BC000Z2_n465TBM34_CRT_USER_ID ;
   private java.util.Date[] BC000Z2_A467TBM34_UPD_DATETIME ;
   private boolean[] BC000Z2_n467TBM34_UPD_DATETIME ;
   private String[] BC000Z2_A468TBM34_UPD_USER_ID ;
   private boolean[] BC000Z2_n468TBM34_UPD_USER_ID ;
   private long[] BC000Z2_A470TBM34_UPD_CNT ;
   private boolean[] BC000Z2_n470TBM34_UPD_CNT ;
   private String[] BC000Z2_A462TBM34_DISPLAY_FLG ;
   private boolean[] BC000Z2_n462TBM34_DISPLAY_FLG ;
   private String[] BC000Z2_A463TBM34_DEL_FLG ;
   private boolean[] BC000Z2_n463TBM34_DEL_FLG ;
   private String[] BC000Z2_A466TBM34_CRT_PROG_NM ;
   private boolean[] BC000Z2_n466TBM34_CRT_PROG_NM ;
   private String[] BC000Z2_A469TBM34_UPD_PROG_NM ;
   private boolean[] BC000Z2_n469TBM34_UPD_PROG_NM ;
   private long[] BC000Z9_A459TBM34_STUDY_ID ;
   private short[] BC000Z9_A460TBM34_CRF_ID ;
   private String[] BC000Z9_A461TBM34_STYDY_AUTH_CD ;
   private java.util.Date[] BC000Z9_A464TBM34_CRT_DATETIME ;
   private boolean[] BC000Z9_n464TBM34_CRT_DATETIME ;
   private String[] BC000Z9_A465TBM34_CRT_USER_ID ;
   private boolean[] BC000Z9_n465TBM34_CRT_USER_ID ;
   private java.util.Date[] BC000Z9_A467TBM34_UPD_DATETIME ;
   private boolean[] BC000Z9_n467TBM34_UPD_DATETIME ;
   private String[] BC000Z9_A468TBM34_UPD_USER_ID ;
   private boolean[] BC000Z9_n468TBM34_UPD_USER_ID ;
   private long[] BC000Z9_A470TBM34_UPD_CNT ;
   private boolean[] BC000Z9_n470TBM34_UPD_CNT ;
   private String[] BC000Z9_A462TBM34_DISPLAY_FLG ;
   private boolean[] BC000Z9_n462TBM34_DISPLAY_FLG ;
   private String[] BC000Z9_A463TBM34_DEL_FLG ;
   private boolean[] BC000Z9_n463TBM34_DEL_FLG ;
   private String[] BC000Z9_A466TBM34_CRT_PROG_NM ;
   private boolean[] BC000Z9_n466TBM34_CRT_PROG_NM ;
   private String[] BC000Z9_A469TBM34_UPD_PROG_NM ;
   private boolean[] BC000Z9_n469TBM34_UPD_PROG_NM ;
}

final  class tbm34_crf_auth_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000Z2", "SELECT `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_CRT_DATETIME`, `TBM34_CRT_USER_ID`, `TBM34_UPD_DATETIME`, `TBM34_UPD_USER_ID`, `TBM34_UPD_CNT`, `TBM34_DISPLAY_FLG`, `TBM34_DEL_FLG`, `TBM34_CRT_PROG_NM`, `TBM34_UPD_PROG_NM` FROM `TBM34_CRF_AUTH` WHERE `TBM34_STUDY_ID` = ? AND `TBM34_CRF_ID` = ? AND `TBM34_STYDY_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Z3", "SELECT `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_CRT_DATETIME`, `TBM34_CRT_USER_ID`, `TBM34_UPD_DATETIME`, `TBM34_UPD_USER_ID`, `TBM34_UPD_CNT`, `TBM34_DISPLAY_FLG`, `TBM34_DEL_FLG`, `TBM34_CRT_PROG_NM`, `TBM34_UPD_PROG_NM` FROM `TBM34_CRF_AUTH` WHERE `TBM34_STUDY_ID` = ? AND `TBM34_CRF_ID` = ? AND `TBM34_STYDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000Z4", "SELECT TM1.`TBM34_STUDY_ID`, TM1.`TBM34_CRF_ID`, TM1.`TBM34_STYDY_AUTH_CD`, TM1.`TBM34_CRT_DATETIME`, TM1.`TBM34_CRT_USER_ID`, TM1.`TBM34_UPD_DATETIME`, TM1.`TBM34_UPD_USER_ID`, TM1.`TBM34_UPD_CNT`, TM1.`TBM34_DISPLAY_FLG`, TM1.`TBM34_DEL_FLG`, TM1.`TBM34_CRT_PROG_NM`, TM1.`TBM34_UPD_PROG_NM` FROM `TBM34_CRF_AUTH` TM1 WHERE TM1.`TBM34_STUDY_ID` = ? and TM1.`TBM34_CRF_ID` = ? and TM1.`TBM34_STYDY_AUTH_CD` = ? ORDER BY TM1.`TBM34_STUDY_ID`, TM1.`TBM34_CRF_ID`, TM1.`TBM34_STYDY_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000Z5", "SELECT `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD` FROM `TBM34_CRF_AUTH` WHERE `TBM34_STUDY_ID` = ? AND `TBM34_CRF_ID` = ? AND `TBM34_STYDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000Z6", "INSERT INTO `TBM34_CRF_AUTH` (`TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_CRT_DATETIME`, `TBM34_CRT_USER_ID`, `TBM34_UPD_DATETIME`, `TBM34_UPD_USER_ID`, `TBM34_UPD_CNT`, `TBM34_DISPLAY_FLG`, `TBM34_DEL_FLG`, `TBM34_CRT_PROG_NM`, `TBM34_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000Z7", "UPDATE `TBM34_CRF_AUTH` SET `TBM34_CRT_DATETIME`=?, `TBM34_CRT_USER_ID`=?, `TBM34_UPD_DATETIME`=?, `TBM34_UPD_USER_ID`=?, `TBM34_UPD_CNT`=?, `TBM34_DISPLAY_FLG`=?, `TBM34_DEL_FLG`=?, `TBM34_CRT_PROG_NM`=?, `TBM34_UPD_PROG_NM`=?  WHERE `TBM34_STUDY_ID` = ? AND `TBM34_CRF_ID` = ? AND `TBM34_STYDY_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000Z8", "DELETE FROM `TBM34_CRF_AUTH`  WHERE `TBM34_STUDY_ID` = ? AND `TBM34_CRF_ID` = ? AND `TBM34_STYDY_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000Z9", "SELECT TM1.`TBM34_STUDY_ID`, TM1.`TBM34_CRF_ID`, TM1.`TBM34_STYDY_AUTH_CD`, TM1.`TBM34_CRT_DATETIME`, TM1.`TBM34_CRT_USER_ID`, TM1.`TBM34_UPD_DATETIME`, TM1.`TBM34_UPD_USER_ID`, TM1.`TBM34_UPD_CNT`, TM1.`TBM34_DISPLAY_FLG`, TM1.`TBM34_DEL_FLG`, TM1.`TBM34_CRT_PROG_NM`, TM1.`TBM34_UPD_PROG_NM` FROM `TBM34_CRF_AUTH` TM1 WHERE TM1.`TBM34_STUDY_ID` = ? and TM1.`TBM34_CRF_ID` = ? and TM1.`TBM34_STYDY_AUTH_CD` = ? ORDER BY TM1.`TBM34_STUDY_ID`, TM1.`TBM34_CRF_ID`, TM1.`TBM34_STYDY_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 128);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[12]).longValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 40);
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
               stmt.setVarchar(12, (String)parms[20], 2, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
      }
   }

}

