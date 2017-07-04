/*
               File: tam04bc_kngn_bc
        Description: 権限パターンマスタ（ビジネスコンポーネント）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:13.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam04bc_kngn_bc extends GXWebPanel implements IGxSilentTrn
{
   public tam04bc_kngn_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam04bc_kngn_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam04bc_kngn_bc.class ));
   }

   public tam04bc_kngn_bc( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0C3( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0C3( ) ;
      standaloneModal( ) ;
      addRow0C3( ) ;
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
            Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
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

   public void confirm_0C0( )
   {
      beforeValidate0C3( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0C3( ) ;
         }
         else
         {
            checkExtendedTable0C3( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0C3( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode3 = Gx_mode ;
         confirm_0C9( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode3 ;
            IsConfirmed = (short)(1) ;
         }
         /* Restore parent mode. */
         Gx_mode = sMode3 ;
      }
   }

   public void confirm_0C9( )
   {
      nGXsfl_9_idx = (short)(0) ;
      while ( nGXsfl_9_idx < bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().size() )
      {
         readRow0C9( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound9 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ( nIsMod_9 != 0 ) )
         {
            getKey0C9( ) ;
            if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
            {
               if ( RcdFound9 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate0C9( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0C9( ) ;
                     if ( AnyError == 0 )
                     {
                        zm0C9( 17) ;
                     }
                     closeExtendedTableCursors0C9( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound9 != 0 )
               {
                  if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey0C9( ) ;
                     load0C9( ) ;
                     beforeValidate0C9( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0C9( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_9 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate0C9( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0C9( ) ;
                           if ( AnyError == 0 )
                           {
                              zm0C9( 17) ;
                           }
                           closeExtendedTableCursors0C9( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "DLT") != 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow9( ((SdtTAM04BC_KNGN_TAM05_APPLI)bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().elementAt(-1+nGXsfl_9_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void E112( )
   {
      /* Start Routine */
      AV11W_BC_FLG = "0" ;
      AV11W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV11W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV12Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void E122( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV12Pgmname) ;
      AV10W_TXT = "" ;
      AV10W_TXT = AV10W_TXT + "権限パターン区分:" + A13TAM04_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A285TAM04_AUTH_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A687TAM04_AUTH_LVL, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A215TAM04_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A233TAM04_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A266TAM04_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A234TAM04_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A235TAM04_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A267TAM04_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A236TAM04_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = GXutil.strReplace( AV10W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, AV10W_TXT) ;
      new tam04bc_pc01_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, A13TAM04_AUTH_CD) ;
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV12Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm0C3( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         Z233TAM04_CRT_DATETIME = A233TAM04_CRT_DATETIME ;
         Z266TAM04_CRT_USER_ID = A266TAM04_CRT_USER_ID ;
         Z235TAM04_UPD_DATETIME = A235TAM04_UPD_DATETIME ;
         Z267TAM04_UPD_USER_ID = A267TAM04_UPD_USER_ID ;
         Z286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         Z285TAM04_AUTH_NM = A285TAM04_AUTH_NM ;
         Z687TAM04_AUTH_LVL = A687TAM04_AUTH_LVL ;
         Z215TAM04_DEL_FLG = A215TAM04_DEL_FLG ;
         Z234TAM04_CRT_PROG_NM = A234TAM04_CRT_PROG_NM ;
         Z236TAM04_UPD_PROG_NM = A236TAM04_UPD_PROG_NM ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         Z288TAM05_KNGN_FLG = A288TAM05_KNGN_FLG ;
         Z289TAM05_DEL_FLG = A289TAM05_DEL_FLG ;
         Z290TAM05_CRT_DATETIME = A290TAM05_CRT_DATETIME ;
         Z291TAM05_CRT_USER_ID = A291TAM05_CRT_USER_ID ;
         Z292TAM05_CRT_PROG_NM = A292TAM05_CRT_PROG_NM ;
         Z293TAM05_UPD_DATETIME = A293TAM05_UPD_DATETIME ;
         Z294TAM05_UPD_USER_ID = A294TAM05_UPD_USER_ID ;
         Z295TAM05_UPD_PROG_NM = A295TAM05_UPD_PROG_NM ;
         Z296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
      }
      if ( GX_JID == -15 )
      {
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z233TAM04_CRT_DATETIME = A233TAM04_CRT_DATETIME ;
         Z266TAM04_CRT_USER_ID = A266TAM04_CRT_USER_ID ;
         Z235TAM04_UPD_DATETIME = A235TAM04_UPD_DATETIME ;
         Z267TAM04_UPD_USER_ID = A267TAM04_UPD_USER_ID ;
         Z286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         Z285TAM04_AUTH_NM = A285TAM04_AUTH_NM ;
         Z687TAM04_AUTH_LVL = A687TAM04_AUTH_LVL ;
         Z215TAM04_DEL_FLG = A215TAM04_DEL_FLG ;
         Z234TAM04_CRT_PROG_NM = A234TAM04_CRT_PROG_NM ;
         Z236TAM04_UPD_PROG_NM = A236TAM04_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0C3( )
   {
      /* Using cursor BC000C7 */
      pr_default.execute(5, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A233TAM04_CRT_DATETIME = BC000C7_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = BC000C7_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = BC000C7_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = BC000C7_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = BC000C7_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = BC000C7_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = BC000C7_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = BC000C7_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = BC000C7_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = BC000C7_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = BC000C7_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = BC000C7_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = BC000C7_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = BC000C7_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = BC000C7_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = BC000C7_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = BC000C7_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = BC000C7_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = BC000C7_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = BC000C7_n236TAM04_UPD_PROG_NM[0] ;
         zm0C3( -15) ;
      }
      pr_default.close(5);
      onLoadActions0C3( ) ;
   }

   public void onLoadActions0C3( )
   {
      AV12Pgmname = "TAM04BC_KNGN_BC" ;
   }

   public void checkExtendedTable0C3( )
   {
      standaloneModal( ) ;
      AV12Pgmname = "TAM04BC_KNGN_BC" ;
      if ( ! ( GXutil.nullDate().equals(A233TAM04_CRT_DATETIME) || (( A233TAM04_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A233TAM04_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A235TAM04_UPD_DATETIME) || (( A235TAM04_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A235TAM04_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0C3( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0C3( )
   {
      /* Using cursor BC000C8 */
      pr_default.execute(6, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000C9 */
      pr_default.execute(7, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm0C3( 15) ;
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = BC000C9_A13TAM04_AUTH_CD[0] ;
         A233TAM04_CRT_DATETIME = BC000C9_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = BC000C9_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = BC000C9_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = BC000C9_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = BC000C9_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = BC000C9_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = BC000C9_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = BC000C9_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = BC000C9_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = BC000C9_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = BC000C9_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = BC000C9_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = BC000C9_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = BC000C9_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = BC000C9_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = BC000C9_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = BC000C9_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = BC000C9_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = BC000C9_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = BC000C9_n236TAM04_UPD_PROG_NM[0] ;
         O286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         n286TAM04_UPD_CNT = false ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0C3( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey0C3( ) ;
         }
         Gx_mode = sMode3 ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey0C3( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey0C3( ) ;
      if ( RcdFound3 == 0 )
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
      confirm_0C0( ) ;
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

   public void checkOptimisticConcurrency0C3( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000C10 */
         pr_default.execute(8, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(8) == 101) || !( Z233TAM04_CRT_DATETIME.equals( BC000C10_A233TAM04_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z266TAM04_CRT_USER_ID, BC000C10_A266TAM04_CRT_USER_ID[0]) != 0 ) || !( Z235TAM04_UPD_DATETIME.equals( BC000C10_A235TAM04_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z267TAM04_UPD_USER_ID, BC000C10_A267TAM04_UPD_USER_ID[0]) != 0 ) || ( Z286TAM04_UPD_CNT != BC000C10_A286TAM04_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z285TAM04_AUTH_NM, BC000C10_A285TAM04_AUTH_NM[0]) != 0 ) || ( Z687TAM04_AUTH_LVL != BC000C10_A687TAM04_AUTH_LVL[0] ) || ( GXutil.strcmp(Z215TAM04_DEL_FLG, BC000C10_A215TAM04_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z234TAM04_CRT_PROG_NM, BC000C10_A234TAM04_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z236TAM04_UPD_PROG_NM, BC000C10_A236TAM04_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM04_KNGN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C3( )
   {
      beforeValidate0C3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C3( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C3( 0) ;
         checkOptimisticConcurrency0C3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C3( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000C11 */
                  pr_default.execute(9, new Object[] {A13TAM04_AUTH_CD, new Boolean(n233TAM04_CRT_DATETIME), A233TAM04_CRT_DATETIME, new Boolean(n266TAM04_CRT_USER_ID), A266TAM04_CRT_USER_ID, new Boolean(n235TAM04_UPD_DATETIME), A235TAM04_UPD_DATETIME, new Boolean(n267TAM04_UPD_USER_ID), A267TAM04_UPD_USER_ID, new Boolean(n286TAM04_UPD_CNT), new Long(A286TAM04_UPD_CNT), new Boolean(n285TAM04_AUTH_NM), A285TAM04_AUTH_NM, new Boolean(n687TAM04_AUTH_LVL), new Byte(A687TAM04_AUTH_LVL), new Boolean(n215TAM04_DEL_FLG), A215TAM04_DEL_FLG, new Boolean(n234TAM04_CRT_PROG_NM), A234TAM04_CRT_PROG_NM, new Boolean(n236TAM04_UPD_PROG_NM), A236TAM04_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel0C3( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        }
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
            load0C3( ) ;
         }
         endLevel0C3( ) ;
      }
      closeExtendedTableCursors0C3( ) ;
   }

   public void update0C3( )
   {
      beforeValidate0C3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C3( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C3( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000C12 */
                  pr_default.execute(10, new Object[] {new Boolean(n233TAM04_CRT_DATETIME), A233TAM04_CRT_DATETIME, new Boolean(n266TAM04_CRT_USER_ID), A266TAM04_CRT_USER_ID, new Boolean(n235TAM04_UPD_DATETIME), A235TAM04_UPD_DATETIME, new Boolean(n267TAM04_UPD_USER_ID), A267TAM04_UPD_USER_ID, new Boolean(n286TAM04_UPD_CNT), new Long(A286TAM04_UPD_CNT), new Boolean(n285TAM04_AUTH_NM), A285TAM04_AUTH_NM, new Boolean(n687TAM04_AUTH_LVL), new Byte(A687TAM04_AUTH_LVL), new Boolean(n215TAM04_DEL_FLG), A215TAM04_DEL_FLG, new Boolean(n234TAM04_CRT_PROG_NM), A234TAM04_CRT_PROG_NM, new Boolean(n236TAM04_UPD_PROG_NM), A236TAM04_UPD_PROG_NM, A13TAM04_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C3( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0C3( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
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
         }
         endLevel0C3( ) ;
      }
      closeExtendedTableCursors0C3( ) ;
   }

   public void deferredUpdate0C3( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0C3( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C3( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C3( ) ;
         afterConfirm0C3( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C3( ) ;
            if ( AnyError == 0 )
            {
               scanKeyStart0C9( ) ;
               while ( RcdFound9 != 0 )
               {
                  getByPrimaryKey0C9( ) ;
                  delete0C9( ) ;
                  scanKeyNext0C9( ) ;
               }
               scanKeyEnd0C9( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000C13 */
                  pr_default.execute(11, new Object[] {A13TAM04_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
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
      }
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0C3( ) ;
      Gx_mode = sMode3 ;
   }

   public void onDeleteControls0C3( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV12Pgmname = "TAM04BC_KNGN_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000C14 */
         pr_default.execute(12, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ユーザーマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC000C15 */
         pr_default.execute(13, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"権限別振舞マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel0C9( )
   {
      nGXsfl_9_idx = (short)(0) ;
      while ( nGXsfl_9_idx < bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().size() )
      {
         readRow0C9( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound9 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) || ( nIsMod_9 != 0 ) )
         {
            standaloneNotModal0C9( ) ;
            if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
            {
               Gx_mode = "INS" ;
               insert0C9( ) ;
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
               {
                  Gx_mode = "DLT" ;
                  delete0C9( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update0C9( ) ;
               }
            }
         }
         KeyVarsToRow9( ((SdtTAM04BC_KNGN_TAM05_APPLI)bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().elementAt(-1+nGXsfl_9_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_9_idx = (short)(0) ;
         while ( nGXsfl_9_idx < bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().size() )
         {
            readRow0C9( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound9 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().removeElement(nGXsfl_9_idx);
               nGXsfl_9_idx = (short)(nGXsfl_9_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey0C9( ) ;
               VarsToRow9( ((SdtTAM04BC_KNGN_TAM05_APPLI)bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().elementAt(-1+nGXsfl_9_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0C9( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_9 = (short)(0) ;
      nIsMod_9 = (short)(0) ;
      Gxremove9 = (byte)(0) ;
   }

   public void processLevel0C3( )
   {
      /* Save parent mode. */
      sMode3 = Gx_mode ;
      processNestedLevel0C9( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode3 ;
      /* ' Update level parameters */
   }

   public void endLevel0C3( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(8);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0C3( ) ;
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

   public void scanKeyStart0C3( )
   {
      /* Scan By routine */
      /* Using cursor BC000C16 */
      pr_default.execute(14, new Object[] {A13TAM04_AUTH_CD});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = BC000C16_A13TAM04_AUTH_CD[0] ;
         A233TAM04_CRT_DATETIME = BC000C16_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = BC000C16_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = BC000C16_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = BC000C16_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = BC000C16_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = BC000C16_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = BC000C16_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = BC000C16_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = BC000C16_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = BC000C16_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = BC000C16_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = BC000C16_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = BC000C16_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = BC000C16_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = BC000C16_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = BC000C16_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = BC000C16_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = BC000C16_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = BC000C16_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = BC000C16_n236TAM04_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0C3( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound3 = (short)(0) ;
      scanKeyLoad0C3( ) ;
   }

   public void scanKeyLoad0C3( )
   {
      sMode3 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = BC000C16_A13TAM04_AUTH_CD[0] ;
         A233TAM04_CRT_DATETIME = BC000C16_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = BC000C16_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = BC000C16_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = BC000C16_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = BC000C16_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = BC000C16_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = BC000C16_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = BC000C16_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = BC000C16_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = BC000C16_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = BC000C16_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = BC000C16_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = BC000C16_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = BC000C16_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = BC000C16_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = BC000C16_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = BC000C16_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = BC000C16_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = BC000C16_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = BC000C16_n236TAM04_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode3 ;
   }

   public void scanKeyEnd0C3( )
   {
      pr_default.close(14);
   }

   public void afterConfirm0C3( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C3( )
   {
      /* Before Insert Rules */
      A233TAM04_CRT_DATETIME = GXutil.now( ) ;
      n233TAM04_CRT_DATETIME = false ;
      GXt_char1 = A266TAM04_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A266TAM04_CRT_USER_ID = GXt_char1 ;
      n266TAM04_CRT_USER_ID = false ;
      A235TAM04_UPD_DATETIME = GXutil.now( ) ;
      n235TAM04_UPD_DATETIME = false ;
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      A286TAM04_UPD_CNT = (long)(O286TAM04_UPD_CNT+1) ;
      n286TAM04_UPD_CNT = false ;
   }

   public void beforeUpdate0C3( )
   {
      /* Before Update Rules */
      A235TAM04_UPD_DATETIME = GXutil.now( ) ;
      n235TAM04_UPD_DATETIME = false ;
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      A286TAM04_UPD_CNT = (long)(O286TAM04_UPD_CNT+1) ;
      n286TAM04_UPD_CNT = false ;
   }

   public void beforeDelete0C3( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C3( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C3( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C3( )
   {
   }

   public void zm0C9( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         Z290TAM05_CRT_DATETIME = A290TAM05_CRT_DATETIME ;
         Z291TAM05_CRT_USER_ID = A291TAM05_CRT_USER_ID ;
         Z293TAM05_UPD_DATETIME = A293TAM05_UPD_DATETIME ;
         Z294TAM05_UPD_USER_ID = A294TAM05_UPD_USER_ID ;
         Z296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         Z288TAM05_KNGN_FLG = A288TAM05_KNGN_FLG ;
         Z289TAM05_DEL_FLG = A289TAM05_DEL_FLG ;
         Z292TAM05_CRT_PROG_NM = A292TAM05_CRT_PROG_NM ;
         Z295TAM05_UPD_PROG_NM = A295TAM05_UPD_PROG_NM ;
         Z285TAM04_AUTH_NM = A285TAM04_AUTH_NM ;
         Z687TAM04_AUTH_LVL = A687TAM04_AUTH_LVL ;
         Z215TAM04_DEL_FLG = A215TAM04_DEL_FLG ;
         Z233TAM04_CRT_DATETIME = A233TAM04_CRT_DATETIME ;
         Z266TAM04_CRT_USER_ID = A266TAM04_CRT_USER_ID ;
         Z234TAM04_CRT_PROG_NM = A234TAM04_CRT_PROG_NM ;
         Z235TAM04_UPD_DATETIME = A235TAM04_UPD_DATETIME ;
         Z267TAM04_UPD_USER_ID = A267TAM04_UPD_USER_ID ;
         Z236TAM04_UPD_PROG_NM = A236TAM04_UPD_PROG_NM ;
         Z286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
      }
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         Z285TAM04_AUTH_NM = A285TAM04_AUTH_NM ;
         Z687TAM04_AUTH_LVL = A687TAM04_AUTH_LVL ;
         Z215TAM04_DEL_FLG = A215TAM04_DEL_FLG ;
         Z233TAM04_CRT_DATETIME = A233TAM04_CRT_DATETIME ;
         Z266TAM04_CRT_USER_ID = A266TAM04_CRT_USER_ID ;
         Z234TAM04_CRT_PROG_NM = A234TAM04_CRT_PROG_NM ;
         Z235TAM04_UPD_DATETIME = A235TAM04_UPD_DATETIME ;
         Z267TAM04_UPD_USER_ID = A267TAM04_UPD_USER_ID ;
         Z236TAM04_UPD_PROG_NM = A236TAM04_UPD_PROG_NM ;
         Z286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
      }
      if ( GX_JID == -16 )
      {
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z290TAM05_CRT_DATETIME = A290TAM05_CRT_DATETIME ;
         Z291TAM05_CRT_USER_ID = A291TAM05_CRT_USER_ID ;
         Z293TAM05_UPD_DATETIME = A293TAM05_UPD_DATETIME ;
         Z294TAM05_UPD_USER_ID = A294TAM05_UPD_USER_ID ;
         Z296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         Z288TAM05_KNGN_FLG = A288TAM05_KNGN_FLG ;
         Z289TAM05_DEL_FLG = A289TAM05_DEL_FLG ;
         Z292TAM05_CRT_PROG_NM = A292TAM05_CRT_PROG_NM ;
         Z295TAM05_UPD_PROG_NM = A295TAM05_UPD_PROG_NM ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
      }
   }

   public void standaloneNotModal0C9( )
   {
   }

   public void standaloneModal0C9( )
   {
   }

   public void load0C9( )
   {
      /* Using cursor BC000C17 */
      pr_default.execute(15, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = BC000C17_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = BC000C17_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = BC000C17_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = BC000C17_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = BC000C17_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = BC000C17_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = BC000C17_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = BC000C17_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = BC000C17_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = BC000C17_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = BC000C17_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = BC000C17_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = BC000C17_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = BC000C17_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = BC000C17_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = BC000C17_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = BC000C17_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = BC000C17_n295TAM05_UPD_PROG_NM[0] ;
         zm0C9( -16) ;
      }
      pr_default.close(15);
      onLoadActions0C9( ) ;
   }

   public void onLoadActions0C9( )
   {
   }

   public void checkExtendedTable0C9( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0C9( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC000C18 */
      pr_default.execute(16, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(16);
      if ( ! ( GXutil.nullDate().equals(A290TAM05_CRT_DATETIME) || (( A290TAM05_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A290TAM05_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A293TAM05_UPD_DATETIME) || (( A293TAM05_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A293TAM05_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0C9( )
   {
   }

   public void enableDisable0C9( )
   {
   }

   public void getKey0C9( )
   {
      /* Using cursor BC000C19 */
      pr_default.execute(17, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey0C9( )
   {
      /* Using cursor BC000C20 */
      pr_default.execute(18, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(18) != 101) )
      {
         zm0C9( 16) ;
         RcdFound9 = (short)(1) ;
         initializeNonKey0C9( ) ;
         A290TAM05_CRT_DATETIME = BC000C20_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = BC000C20_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = BC000C20_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = BC000C20_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = BC000C20_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = BC000C20_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = BC000C20_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = BC000C20_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = BC000C20_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = BC000C20_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = BC000C20_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = BC000C20_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = BC000C20_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = BC000C20_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = BC000C20_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = BC000C20_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = BC000C20_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = BC000C20_n295TAM05_UPD_PROG_NM[0] ;
         A12TAM03_APP_ID = BC000C20_A12TAM03_APP_ID[0] ;
         O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         n296TAM05_UPD_CNT = false ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal0C9( ) ;
         load0C9( ) ;
         Gx_mode = sMode9 ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey0C9( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal0C9( ) ;
         Gx_mode = sMode9 ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0C9( ) ;
      }
      pr_default.close(18);
   }

   public void checkOptimisticConcurrency0C9( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000C21 */
         pr_default.execute(19, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
         if ( (pr_default.getStatus(19) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(19) == 101) || !( Z290TAM05_CRT_DATETIME.equals( BC000C21_A290TAM05_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z291TAM05_CRT_USER_ID, BC000C21_A291TAM05_CRT_USER_ID[0]) != 0 ) || !( Z293TAM05_UPD_DATETIME.equals( BC000C21_A293TAM05_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z294TAM05_UPD_USER_ID, BC000C21_A294TAM05_UPD_USER_ID[0]) != 0 ) || ( Z296TAM05_UPD_CNT != BC000C21_A296TAM05_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z288TAM05_KNGN_FLG, BC000C21_A288TAM05_KNGN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z289TAM05_DEL_FLG, BC000C21_A289TAM05_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z292TAM05_CRT_PROG_NM, BC000C21_A292TAM05_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z295TAM05_UPD_PROG_NM, BC000C21_A295TAM05_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM05_APPLI_KNGN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C9( )
   {
      beforeValidate0C9( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C9( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C9( 0) ;
         checkOptimisticConcurrency0C9( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C9( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C9( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000C22 */
                  pr_default.execute(20, new Object[] {A13TAM04_AUTH_CD, new Boolean(n290TAM05_CRT_DATETIME), A290TAM05_CRT_DATETIME, new Boolean(n291TAM05_CRT_USER_ID), A291TAM05_CRT_USER_ID, new Boolean(n293TAM05_UPD_DATETIME), A293TAM05_UPD_DATETIME, new Boolean(n294TAM05_UPD_USER_ID), A294TAM05_UPD_USER_ID, new Boolean(n296TAM05_UPD_CNT), new Long(A296TAM05_UPD_CNT), new Boolean(n288TAM05_KNGN_FLG), A288TAM05_KNGN_FLG, new Boolean(n289TAM05_DEL_FLG), A289TAM05_DEL_FLG, new Boolean(n292TAM05_CRT_PROG_NM), A292TAM05_CRT_PROG_NM, new Boolean(n295TAM05_UPD_PROG_NM), A295TAM05_UPD_PROG_NM, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
                  if ( (pr_default.getStatus(20) == 1) )
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
            load0C9( ) ;
         }
         endLevel0C9( ) ;
      }
      closeExtendedTableCursors0C9( ) ;
   }

   public void update0C9( )
   {
      beforeValidate0C9( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C9( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C9( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C9( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C9( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000C23 */
                  pr_default.execute(21, new Object[] {new Boolean(n290TAM05_CRT_DATETIME), A290TAM05_CRT_DATETIME, new Boolean(n291TAM05_CRT_USER_ID), A291TAM05_CRT_USER_ID, new Boolean(n293TAM05_UPD_DATETIME), A293TAM05_UPD_DATETIME, new Boolean(n294TAM05_UPD_USER_ID), A294TAM05_UPD_USER_ID, new Boolean(n296TAM05_UPD_CNT), new Long(A296TAM05_UPD_CNT), new Boolean(n288TAM05_KNGN_FLG), A288TAM05_KNGN_FLG, new Boolean(n289TAM05_DEL_FLG), A289TAM05_DEL_FLG, new Boolean(n292TAM05_CRT_PROG_NM), A292TAM05_CRT_PROG_NM, new Boolean(n295TAM05_UPD_PROG_NM), A295TAM05_UPD_PROG_NM, A13TAM04_AUTH_CD, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C9( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0C9( ) ;
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
         endLevel0C9( ) ;
      }
      closeExtendedTableCursors0C9( ) ;
   }

   public void deferredUpdate0C9( )
   {
   }

   public void delete0C9( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0C9( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C9( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C9( ) ;
         afterConfirm0C9( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C9( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000C24 */
               pr_default.execute(22, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0C9( ) ;
      Gx_mode = sMode9 ;
   }

   public void onDeleteControls0C9( )
   {
      standaloneModal0C9( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0C9( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(19);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart0C9( )
   {
      /* Scan By routine */
      /* Using cursor BC000C25 */
      pr_default.execute(23, new Object[] {A13TAM04_AUTH_CD});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = BC000C25_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = BC000C25_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = BC000C25_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = BC000C25_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = BC000C25_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = BC000C25_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = BC000C25_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = BC000C25_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = BC000C25_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = BC000C25_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = BC000C25_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = BC000C25_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = BC000C25_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = BC000C25_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = BC000C25_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = BC000C25_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = BC000C25_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = BC000C25_n295TAM05_UPD_PROG_NM[0] ;
         A12TAM03_APP_ID = BC000C25_A12TAM03_APP_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0C9( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound9 = (short)(0) ;
      scanKeyLoad0C9( ) ;
   }

   public void scanKeyLoad0C9( )
   {
      sMode9 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = BC000C25_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = BC000C25_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = BC000C25_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = BC000C25_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = BC000C25_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = BC000C25_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = BC000C25_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = BC000C25_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = BC000C25_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = BC000C25_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = BC000C25_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = BC000C25_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = BC000C25_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = BC000C25_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = BC000C25_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = BC000C25_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = BC000C25_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = BC000C25_n295TAM05_UPD_PROG_NM[0] ;
         A12TAM03_APP_ID = BC000C25_A12TAM03_APP_ID[0] ;
      }
      Gx_mode = sMode9 ;
   }

   public void scanKeyEnd0C9( )
   {
      pr_default.close(23);
   }

   public void afterConfirm0C9( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C9( )
   {
      /* Before Insert Rules */
      A290TAM05_CRT_DATETIME = GXutil.now( ) ;
      n290TAM05_CRT_DATETIME = false ;
      GXt_char1 = A291TAM05_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A291TAM05_CRT_USER_ID = GXt_char1 ;
      n291TAM05_CRT_USER_ID = false ;
      A293TAM05_UPD_DATETIME = GXutil.now( ) ;
      n293TAM05_UPD_DATETIME = false ;
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = (long)(O296TAM05_UPD_CNT+1) ;
      n296TAM05_UPD_CNT = false ;
   }

   public void beforeUpdate0C9( )
   {
      /* Before Update Rules */
      A293TAM05_UPD_DATETIME = GXutil.now( ) ;
      n293TAM05_UPD_DATETIME = false ;
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = (long)(O296TAM05_UPD_CNT+1) ;
      n296TAM05_UPD_CNT = false ;
   }

   public void beforeDelete0C9( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C9( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C9( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C9( )
   {
   }

   public void addRow0C3( )
   {
      VarsToRow3( bcTAM04BC_KNGN) ;
   }

   public void readRow0C3( )
   {
      RowToVars3( bcTAM04BC_KNGN, 1) ;
   }

   public void addRow0C9( )
   {
      SdtTAM04BC_KNGN_TAM05_APPLI obj9 ;
      obj9 = new SdtTAM04BC_KNGN_TAM05_APPLI(remoteHandle);
      VarsToRow9( obj9) ;
      bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().add(obj9, 0);
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Mode( "UPD" );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Modified( (short)(0) );
   }

   public void readRow0C9( )
   {
      nGXsfl_9_idx = (short)(nGXsfl_9_idx+1) ;
      RowToVars9( ((SdtTAM04BC_KNGN_TAM05_APPLI)bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().elementAt(-1+nGXsfl_9_idx)), 1) ;
   }

   public void initializeNonKey0C3( )
   {
      A233TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n233TAM04_CRT_DATETIME = false ;
      A266TAM04_CRT_USER_ID = "" ;
      n266TAM04_CRT_USER_ID = false ;
      A235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n235TAM04_UPD_DATETIME = false ;
      A267TAM04_UPD_USER_ID = "" ;
      n267TAM04_UPD_USER_ID = false ;
      A286TAM04_UPD_CNT = 0 ;
      n286TAM04_UPD_CNT = false ;
      A285TAM04_AUTH_NM = "" ;
      n285TAM04_AUTH_NM = false ;
      A687TAM04_AUTH_LVL = (byte)(0) ;
      n687TAM04_AUTH_LVL = false ;
      A215TAM04_DEL_FLG = "" ;
      n215TAM04_DEL_FLG = false ;
      A234TAM04_CRT_PROG_NM = "" ;
      n234TAM04_CRT_PROG_NM = false ;
      A236TAM04_UPD_PROG_NM = "" ;
      n236TAM04_UPD_PROG_NM = false ;
      O286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
      n286TAM04_UPD_CNT = false ;
   }

   public void initAll0C3( )
   {
      A13TAM04_AUTH_CD = "" ;
      initializeNonKey0C3( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0C9( )
   {
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n290TAM05_CRT_DATETIME = false ;
      A291TAM05_CRT_USER_ID = "" ;
      n291TAM05_CRT_USER_ID = false ;
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n293TAM05_UPD_DATETIME = false ;
      A294TAM05_UPD_USER_ID = "" ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = 0 ;
      n296TAM05_UPD_CNT = false ;
      A288TAM05_KNGN_FLG = "" ;
      n288TAM05_KNGN_FLG = false ;
      A289TAM05_DEL_FLG = "" ;
      n289TAM05_DEL_FLG = false ;
      A292TAM05_CRT_PROG_NM = "" ;
      n292TAM05_CRT_PROG_NM = false ;
      A295TAM05_UPD_PROG_NM = "" ;
      n295TAM05_UPD_PROG_NM = false ;
      O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
      n296TAM05_UPD_CNT = false ;
   }

   public void initAll0C9( )
   {
      A12TAM03_APP_ID = "" ;
      initializeNonKey0C9( ) ;
   }

   public void standaloneModalInsert0C9( )
   {
   }

   public void VarsToRow3( SdtTAM04BC_KNGN obj3 )
   {
      obj3.setgxTv_SdtTAM04BC_KNGN_Mode( Gx_mode );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime( A233TAM04_CRT_DATETIME );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id( A266TAM04_CRT_USER_ID );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime( A235TAM04_UPD_DATETIME );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id( A267TAM04_UPD_USER_ID );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt( A286TAM04_UPD_CNT );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm( A285TAM04_AUTH_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl( A687TAM04_AUTH_LVL );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg( A215TAM04_DEL_FLG );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm( A234TAM04_CRT_PROG_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm( A236TAM04_UPD_PROG_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd( A13TAM04_AUTH_CD );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z( Z13TAM04_AUTH_CD );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z( Z285TAM04_AUTH_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z( Z687TAM04_AUTH_LVL );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z( Z215TAM04_DEL_FLG );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z( Z233TAM04_CRT_DATETIME );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z( Z266TAM04_CRT_USER_ID );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z( Z234TAM04_CRT_PROG_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z( Z235TAM04_UPD_DATETIME );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z( Z267TAM04_UPD_USER_ID );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z( Z236TAM04_UPD_PROG_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z( Z286TAM04_UPD_CNT );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N( (byte)((byte)((n285TAM04_AUTH_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N( (byte)((byte)((n687TAM04_AUTH_LVL)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N( (byte)((byte)((n215TAM04_DEL_FLG)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N( (byte)((byte)((n233TAM04_CRT_DATETIME)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N( (byte)((byte)((n266TAM04_CRT_USER_ID)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N( (byte)((byte)((n234TAM04_CRT_PROG_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N( (byte)((byte)((n235TAM04_UPD_DATETIME)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N( (byte)((byte)((n267TAM04_UPD_USER_ID)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N( (byte)((byte)((n236TAM04_UPD_PROG_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N( (byte)((byte)((n286TAM04_UPD_CNT)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Mode( Gx_mode );
   }

   public void KeyVarsToRow3( SdtTAM04BC_KNGN obj3 )
   {
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd( A13TAM04_AUTH_CD );
   }

   public void RowToVars3( SdtTAM04BC_KNGN obj3 ,
                           int forceLoad )
   {
      Gx_mode = obj3.getgxTv_SdtTAM04BC_KNGN_Mode() ;
      A233TAM04_CRT_DATETIME = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime() ;
      n233TAM04_CRT_DATETIME = false ;
      A266TAM04_CRT_USER_ID = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id() ;
      n266TAM04_CRT_USER_ID = false ;
      A235TAM04_UPD_DATETIME = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime() ;
      n235TAM04_UPD_DATETIME = false ;
      A267TAM04_UPD_USER_ID = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id() ;
      n267TAM04_UPD_USER_ID = false ;
      A286TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt() ;
      n286TAM04_UPD_CNT = false ;
      A285TAM04_AUTH_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm() ;
      n285TAM04_AUTH_NM = false ;
      A687TAM04_AUTH_LVL = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl() ;
      n687TAM04_AUTH_LVL = false ;
      A215TAM04_DEL_FLG = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg() ;
      n215TAM04_DEL_FLG = false ;
      A234TAM04_CRT_PROG_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm() ;
      n234TAM04_CRT_PROG_NM = false ;
      A236TAM04_UPD_PROG_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm() ;
      n236TAM04_UPD_PROG_NM = false ;
      A13TAM04_AUTH_CD = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd() ;
      Z13TAM04_AUTH_CD = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z() ;
      Z285TAM04_AUTH_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z() ;
      Z687TAM04_AUTH_LVL = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z() ;
      Z215TAM04_DEL_FLG = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z() ;
      Z233TAM04_CRT_DATETIME = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z() ;
      Z266TAM04_CRT_USER_ID = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z() ;
      Z234TAM04_CRT_PROG_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z() ;
      Z235TAM04_UPD_DATETIME = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z() ;
      Z267TAM04_UPD_USER_ID = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z() ;
      Z236TAM04_UPD_PROG_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z() ;
      Z286TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z() ;
      O286TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z() ;
      n285TAM04_AUTH_NM = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N()==0)?false:true) ;
      n687TAM04_AUTH_LVL = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N()==0)?false:true) ;
      n215TAM04_DEL_FLG = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N()==0)?false:true) ;
      n233TAM04_CRT_DATETIME = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N()==0)?false:true) ;
      n266TAM04_CRT_USER_ID = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N()==0)?false:true) ;
      n234TAM04_CRT_PROG_NM = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N()==0)?false:true) ;
      n235TAM04_UPD_DATETIME = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N()==0)?false:true) ;
      n267TAM04_UPD_USER_ID = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N()==0)?false:true) ;
      n236TAM04_UPD_PROG_NM = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N()==0)?false:true) ;
      n286TAM04_UPD_CNT = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj3.getgxTv_SdtTAM04BC_KNGN_Mode() ;
   }

   public void VarsToRow9( SdtTAM04BC_KNGN_TAM05_APPLI obj9 )
   {
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Mode( Gx_mode );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime( A290TAM05_CRT_DATETIME );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id( A291TAM05_CRT_USER_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime( A293TAM05_UPD_DATETIME );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id( A294TAM05_UPD_USER_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt( A296TAM05_UPD_CNT );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg( A288TAM05_KNGN_FLG );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg( A289TAM05_DEL_FLG );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm( A292TAM05_CRT_PROG_NM );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm( A295TAM05_UPD_PROG_NM );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id( A12TAM03_APP_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id_Z( Z12TAM03_APP_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_Z( Z288TAM05_KNGN_FLG );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_Z( Z289TAM05_DEL_FLG );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_Z( Z290TAM05_CRT_DATETIME );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_Z( Z291TAM05_CRT_USER_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_Z( Z292TAM05_CRT_PROG_NM );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_Z( Z293TAM05_UPD_DATETIME );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_Z( Z294TAM05_UPD_USER_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_Z( Z295TAM05_UPD_PROG_NM );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_Z( Z296TAM05_UPD_CNT );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_N( (byte)((byte)((n288TAM05_KNGN_FLG)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_N( (byte)((byte)((n289TAM05_DEL_FLG)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_N( (byte)((byte)((n290TAM05_CRT_DATETIME)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_N( (byte)((byte)((n291TAM05_CRT_USER_ID)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_N( (byte)((byte)((n292TAM05_CRT_PROG_NM)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_N( (byte)((byte)((n293TAM05_UPD_DATETIME)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_N( (byte)((byte)((n294TAM05_UPD_USER_ID)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_N( (byte)((byte)((n295TAM05_UPD_PROG_NM)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_N( (byte)((byte)((n296TAM05_UPD_CNT)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Modified( nIsMod_9 );
   }

   public void KeyVarsToRow9( SdtTAM04BC_KNGN_TAM05_APPLI obj9 )
   {
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id( A12TAM03_APP_ID );
   }

   public void RowToVars9( SdtTAM04BC_KNGN_TAM05_APPLI obj9 ,
                           int forceLoad )
   {
      Gx_mode = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Mode() ;
      A290TAM05_CRT_DATETIME = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime() ;
      n290TAM05_CRT_DATETIME = false ;
      A291TAM05_CRT_USER_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id() ;
      n291TAM05_CRT_USER_ID = false ;
      A293TAM05_UPD_DATETIME = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime() ;
      n293TAM05_UPD_DATETIME = false ;
      A294TAM05_UPD_USER_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id() ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt() ;
      n296TAM05_UPD_CNT = false ;
      A288TAM05_KNGN_FLG = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg() ;
      n288TAM05_KNGN_FLG = false ;
      A289TAM05_DEL_FLG = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg() ;
      n289TAM05_DEL_FLG = false ;
      A292TAM05_CRT_PROG_NM = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm() ;
      n292TAM05_CRT_PROG_NM = false ;
      A295TAM05_UPD_PROG_NM = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm() ;
      n295TAM05_UPD_PROG_NM = false ;
      A12TAM03_APP_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id() ;
      Z12TAM03_APP_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id_Z() ;
      Z288TAM05_KNGN_FLG = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_Z() ;
      Z289TAM05_DEL_FLG = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_Z() ;
      Z290TAM05_CRT_DATETIME = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_Z() ;
      Z291TAM05_CRT_USER_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_Z() ;
      Z292TAM05_CRT_PROG_NM = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_Z() ;
      Z293TAM05_UPD_DATETIME = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_Z() ;
      Z294TAM05_UPD_USER_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_Z() ;
      Z295TAM05_UPD_PROG_NM = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_Z() ;
      Z296TAM05_UPD_CNT = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_Z() ;
      O296TAM05_UPD_CNT = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_Z() ;
      n288TAM05_KNGN_FLG = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_N()==0)?false:true) ;
      n289TAM05_DEL_FLG = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_N()==0)?false:true) ;
      n290TAM05_CRT_DATETIME = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_N()==0)?false:true) ;
      n291TAM05_CRT_USER_ID = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_N()==0)?false:true) ;
      n292TAM05_CRT_PROG_NM = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_N()==0)?false:true) ;
      n293TAM05_UPD_DATETIME = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_N()==0)?false:true) ;
      n294TAM05_UPD_USER_ID = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_N()==0)?false:true) ;
      n295TAM05_UPD_PROG_NM = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_N()==0)?false:true) ;
      n296TAM05_UPD_CNT = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_N()==0)?false:true) ;
      nIsMod_9 = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A13TAM04_AUTH_CD = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0C3( ) ;
      scanKeyStart0C3( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         O286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         n286TAM04_UPD_CNT = false ;
      }
      zm0C3( -15) ;
      onLoadActions0C3( ) ;
      addRow0C3( ) ;
      bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().clearCollection();
      if ( RcdFound3 == 1 )
      {
         scanKeyStart0C9( ) ;
         nGXsfl_9_idx = (short)(1) ;
         while ( RcdFound9 != 0 )
         {
            O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
            n296TAM05_UPD_CNT = false ;
            Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
            Z12TAM03_APP_ID = A12TAM03_APP_ID ;
            zm0C9( -16) ;
            onLoadActions0C9( ) ;
            nRcdExists_9 = (short)(1) ;
            nIsMod_9 = (short)(0) ;
            Z296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
            addRow0C9( ) ;
            nGXsfl_9_idx = (short)(nGXsfl_9_idx+1) ;
            scanKeyNext0C9( ) ;
         }
         scanKeyEnd0C9( ) ;
      }
      scanKeyEnd0C3( ) ;
      if ( RcdFound3 == 0 )
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
      RowToVars3( bcTAM04BC_KNGN, 0) ;
      scanKeyStart0C3( ) ;
      if ( RcdFound3 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         O286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         n286TAM04_UPD_CNT = false ;
      }
      zm0C3( -15) ;
      onLoadActions0C3( ) ;
      addRow0C3( ) ;
      bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().clearCollection();
      if ( RcdFound3 == 1 )
      {
         scanKeyStart0C9( ) ;
         nGXsfl_9_idx = (short)(1) ;
         while ( RcdFound9 != 0 )
         {
            O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
            n296TAM05_UPD_CNT = false ;
            Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
            Z12TAM03_APP_ID = A12TAM03_APP_ID ;
            zm0C9( -16) ;
            onLoadActions0C9( ) ;
            nRcdExists_9 = (short)(1) ;
            nIsMod_9 = (short)(0) ;
            Z296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
            addRow0C9( ) ;
            nGXsfl_9_idx = (short)(nGXsfl_9_idx+1) ;
            scanKeyNext0C9( ) ;
         }
         scanKeyEnd0C9( ) ;
      }
      scanKeyEnd0C3( ) ;
      if ( RcdFound3 == 0 )
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
      RowToVars3( bcTAM04BC_KNGN, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0C3( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0C3( ) ;
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 )
            {
               A13TAM04_AUTH_CD = Z13TAM04_AUTH_CD ;
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
               update0C3( ) ;
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
               if ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 )
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
                     insert0C3( ) ;
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
                     insert0C3( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow3( bcTAM04BC_KNGN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars3( bcTAM04BC_KNGN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0C3( ) ;
      if ( RcdFound3 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 )
         {
            A13TAM04_AUTH_CD = Z13TAM04_AUTH_CD ;
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
         if ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tam04bc_kngn_bc");
      VarsToRow3( bcTAM04BC_KNGN) ;
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
      Gx_mode = bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTAM04BC_KNGN.setgxTv_SdtTAM04BC_KNGN_Mode( Gx_mode );
   }

   public void SetSDT( SdtTAM04BC_KNGN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTAM04BC_KNGN )
      {
         bcTAM04BC_KNGN = sdt ;
         if ( GXutil.strcmp(bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Mode(), "") == 0 )
         {
            bcTAM04BC_KNGN.setgxTv_SdtTAM04BC_KNGN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow3( bcTAM04BC_KNGN) ;
         }
         else
         {
            RowToVars3( bcTAM04BC_KNGN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Mode(), "") == 0 )
         {
            bcTAM04BC_KNGN.setgxTv_SdtTAM04BC_KNGN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars3( bcTAM04BC_KNGN, 1) ;
   }

   public SdtTAM04BC_KNGN getTAM04BC_KNGN_BC( )
   {
      return bcTAM04BC_KNGN ;
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
      Z13TAM04_AUTH_CD = "" ;
      A13TAM04_AUTH_CD = "" ;
      sMode3 = "" ;
      AV11W_BC_FLG = "" ;
      AV12Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV10W_TXT = "" ;
      A285TAM04_AUTH_NM = "" ;
      A215TAM04_DEL_FLG = "" ;
      A233TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A266TAM04_CRT_USER_ID = "" ;
      A234TAM04_CRT_PROG_NM = "" ;
      A235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A267TAM04_UPD_USER_ID = "" ;
      A236TAM04_UPD_PROG_NM = "" ;
      Z233TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z266TAM04_CRT_USER_ID = "" ;
      Z235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z267TAM04_UPD_USER_ID = "" ;
      Z285TAM04_AUTH_NM = "" ;
      Z215TAM04_DEL_FLG = "" ;
      Z234TAM04_CRT_PROG_NM = "" ;
      Z236TAM04_UPD_PROG_NM = "" ;
      Z12TAM03_APP_ID = "" ;
      A12TAM03_APP_ID = "" ;
      Z288TAM05_KNGN_FLG = "" ;
      A288TAM05_KNGN_FLG = "" ;
      Z289TAM05_DEL_FLG = "" ;
      A289TAM05_DEL_FLG = "" ;
      Z290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z291TAM05_CRT_USER_ID = "" ;
      A291TAM05_CRT_USER_ID = "" ;
      Z292TAM05_CRT_PROG_NM = "" ;
      A292TAM05_CRT_PROG_NM = "" ;
      Z293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z294TAM05_UPD_USER_ID = "" ;
      A294TAM05_UPD_USER_ID = "" ;
      Z295TAM05_UPD_PROG_NM = "" ;
      A295TAM05_UPD_PROG_NM = "" ;
      BC000C7_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C7_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C7_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000C7_A266TAM04_CRT_USER_ID = new String[] {""} ;
      BC000C7_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000C7_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C7_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000C7_A267TAM04_UPD_USER_ID = new String[] {""} ;
      BC000C7_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000C7_A286TAM04_UPD_CNT = new long[1] ;
      BC000C7_n286TAM04_UPD_CNT = new boolean[] {false} ;
      BC000C7_A285TAM04_AUTH_NM = new String[] {""} ;
      BC000C7_n285TAM04_AUTH_NM = new boolean[] {false} ;
      BC000C7_A687TAM04_AUTH_LVL = new byte[1] ;
      BC000C7_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000C7_A215TAM04_DEL_FLG = new String[] {""} ;
      BC000C7_n215TAM04_DEL_FLG = new boolean[] {false} ;
      BC000C7_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000C7_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000C7_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000C7_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC000C8_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C9_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C9_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C9_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000C9_A266TAM04_CRT_USER_ID = new String[] {""} ;
      BC000C9_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000C9_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C9_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000C9_A267TAM04_UPD_USER_ID = new String[] {""} ;
      BC000C9_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000C9_A286TAM04_UPD_CNT = new long[1] ;
      BC000C9_n286TAM04_UPD_CNT = new boolean[] {false} ;
      BC000C9_A285TAM04_AUTH_NM = new String[] {""} ;
      BC000C9_n285TAM04_AUTH_NM = new boolean[] {false} ;
      BC000C9_A687TAM04_AUTH_LVL = new byte[1] ;
      BC000C9_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000C9_A215TAM04_DEL_FLG = new String[] {""} ;
      BC000C9_n215TAM04_DEL_FLG = new boolean[] {false} ;
      BC000C9_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000C9_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000C9_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000C9_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC000C10_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C10_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C10_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000C10_A266TAM04_CRT_USER_ID = new String[] {""} ;
      BC000C10_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000C10_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C10_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000C10_A267TAM04_UPD_USER_ID = new String[] {""} ;
      BC000C10_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000C10_A286TAM04_UPD_CNT = new long[1] ;
      BC000C10_n286TAM04_UPD_CNT = new boolean[] {false} ;
      BC000C10_A285TAM04_AUTH_NM = new String[] {""} ;
      BC000C10_n285TAM04_AUTH_NM = new boolean[] {false} ;
      BC000C10_A687TAM04_AUTH_LVL = new byte[1] ;
      BC000C10_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000C10_A215TAM04_DEL_FLG = new String[] {""} ;
      BC000C10_n215TAM04_DEL_FLG = new boolean[] {false} ;
      BC000C10_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000C10_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000C10_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000C10_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC000C14_A55TAM07_USER_ID = new String[] {""} ;
      BC000C15_A50TBM07_AUTH_CD = new String[] {""} ;
      BC000C16_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C16_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C16_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000C16_A266TAM04_CRT_USER_ID = new String[] {""} ;
      BC000C16_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000C16_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C16_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000C16_A267TAM04_UPD_USER_ID = new String[] {""} ;
      BC000C16_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000C16_A286TAM04_UPD_CNT = new long[1] ;
      BC000C16_n286TAM04_UPD_CNT = new boolean[] {false} ;
      BC000C16_A285TAM04_AUTH_NM = new String[] {""} ;
      BC000C16_n285TAM04_AUTH_NM = new boolean[] {false} ;
      BC000C16_A687TAM04_AUTH_LVL = new byte[1] ;
      BC000C16_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000C16_A215TAM04_DEL_FLG = new String[] {""} ;
      BC000C16_n215TAM04_DEL_FLG = new boolean[] {false} ;
      BC000C16_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000C16_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000C16_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000C16_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC000C17_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C17_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C17_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000C17_A291TAM05_CRT_USER_ID = new String[] {""} ;
      BC000C17_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000C17_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C17_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000C17_A294TAM05_UPD_USER_ID = new String[] {""} ;
      BC000C17_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000C17_A296TAM05_UPD_CNT = new long[1] ;
      BC000C17_n296TAM05_UPD_CNT = new boolean[] {false} ;
      BC000C17_A288TAM05_KNGN_FLG = new String[] {""} ;
      BC000C17_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000C17_A289TAM05_DEL_FLG = new String[] {""} ;
      BC000C17_n289TAM05_DEL_FLG = new boolean[] {false} ;
      BC000C17_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000C17_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000C17_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000C17_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000C17_A12TAM03_APP_ID = new String[] {""} ;
      BC000C18_A12TAM03_APP_ID = new String[] {""} ;
      BC000C19_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C19_A12TAM03_APP_ID = new String[] {""} ;
      BC000C20_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C20_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C20_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000C20_A291TAM05_CRT_USER_ID = new String[] {""} ;
      BC000C20_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000C20_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C20_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000C20_A294TAM05_UPD_USER_ID = new String[] {""} ;
      BC000C20_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000C20_A296TAM05_UPD_CNT = new long[1] ;
      BC000C20_n296TAM05_UPD_CNT = new boolean[] {false} ;
      BC000C20_A288TAM05_KNGN_FLG = new String[] {""} ;
      BC000C20_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000C20_A289TAM05_DEL_FLG = new String[] {""} ;
      BC000C20_n289TAM05_DEL_FLG = new boolean[] {false} ;
      BC000C20_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000C20_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000C20_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000C20_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000C20_A12TAM03_APP_ID = new String[] {""} ;
      sMode9 = "" ;
      BC000C21_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C21_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C21_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000C21_A291TAM05_CRT_USER_ID = new String[] {""} ;
      BC000C21_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000C21_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C21_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000C21_A294TAM05_UPD_USER_ID = new String[] {""} ;
      BC000C21_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000C21_A296TAM05_UPD_CNT = new long[1] ;
      BC000C21_n296TAM05_UPD_CNT = new boolean[] {false} ;
      BC000C21_A288TAM05_KNGN_FLG = new String[] {""} ;
      BC000C21_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000C21_A289TAM05_DEL_FLG = new String[] {""} ;
      BC000C21_n289TAM05_DEL_FLG = new boolean[] {false} ;
      BC000C21_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000C21_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000C21_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000C21_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000C21_A12TAM03_APP_ID = new String[] {""} ;
      BC000C25_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000C25_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C25_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000C25_A291TAM05_CRT_USER_ID = new String[] {""} ;
      BC000C25_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000C25_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C25_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000C25_A294TAM05_UPD_USER_ID = new String[] {""} ;
      BC000C25_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000C25_A296TAM05_UPD_CNT = new long[1] ;
      BC000C25_n296TAM05_UPD_CNT = new boolean[] {false} ;
      BC000C25_A288TAM05_KNGN_FLG = new String[] {""} ;
      BC000C25_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000C25_A289TAM05_DEL_FLG = new String[] {""} ;
      BC000C25_n289TAM05_DEL_FLG = new boolean[] {false} ;
      BC000C25_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000C25_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000C25_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000C25_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000C25_A12TAM03_APP_ID = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam04bc_kngn_bc__default(),
         new Object[] {
             new Object[] {
            BC000C2_A13TAM04_AUTH_CD, BC000C2_A290TAM05_CRT_DATETIME, BC000C2_n290TAM05_CRT_DATETIME, BC000C2_A291TAM05_CRT_USER_ID, BC000C2_n291TAM05_CRT_USER_ID, BC000C2_A293TAM05_UPD_DATETIME, BC000C2_n293TAM05_UPD_DATETIME, BC000C2_A294TAM05_UPD_USER_ID, BC000C2_n294TAM05_UPD_USER_ID, BC000C2_A296TAM05_UPD_CNT,
            BC000C2_n296TAM05_UPD_CNT, BC000C2_A288TAM05_KNGN_FLG, BC000C2_n288TAM05_KNGN_FLG, BC000C2_A289TAM05_DEL_FLG, BC000C2_n289TAM05_DEL_FLG, BC000C2_A292TAM05_CRT_PROG_NM, BC000C2_n292TAM05_CRT_PROG_NM, BC000C2_A295TAM05_UPD_PROG_NM, BC000C2_n295TAM05_UPD_PROG_NM, BC000C2_A12TAM03_APP_ID
            }
            , new Object[] {
            BC000C3_A13TAM04_AUTH_CD, BC000C3_A290TAM05_CRT_DATETIME, BC000C3_n290TAM05_CRT_DATETIME, BC000C3_A291TAM05_CRT_USER_ID, BC000C3_n291TAM05_CRT_USER_ID, BC000C3_A293TAM05_UPD_DATETIME, BC000C3_n293TAM05_UPD_DATETIME, BC000C3_A294TAM05_UPD_USER_ID, BC000C3_n294TAM05_UPD_USER_ID, BC000C3_A296TAM05_UPD_CNT,
            BC000C3_n296TAM05_UPD_CNT, BC000C3_A288TAM05_KNGN_FLG, BC000C3_n288TAM05_KNGN_FLG, BC000C3_A289TAM05_DEL_FLG, BC000C3_n289TAM05_DEL_FLG, BC000C3_A292TAM05_CRT_PROG_NM, BC000C3_n292TAM05_CRT_PROG_NM, BC000C3_A295TAM05_UPD_PROG_NM, BC000C3_n295TAM05_UPD_PROG_NM, BC000C3_A12TAM03_APP_ID
            }
            , new Object[] {
            BC000C4_A12TAM03_APP_ID
            }
            , new Object[] {
            BC000C5_A13TAM04_AUTH_CD, BC000C5_A233TAM04_CRT_DATETIME, BC000C5_n233TAM04_CRT_DATETIME, BC000C5_A266TAM04_CRT_USER_ID, BC000C5_n266TAM04_CRT_USER_ID, BC000C5_A235TAM04_UPD_DATETIME, BC000C5_n235TAM04_UPD_DATETIME, BC000C5_A267TAM04_UPD_USER_ID, BC000C5_n267TAM04_UPD_USER_ID, BC000C5_A286TAM04_UPD_CNT,
            BC000C5_n286TAM04_UPD_CNT, BC000C5_A285TAM04_AUTH_NM, BC000C5_n285TAM04_AUTH_NM, BC000C5_A687TAM04_AUTH_LVL, BC000C5_n687TAM04_AUTH_LVL, BC000C5_A215TAM04_DEL_FLG, BC000C5_n215TAM04_DEL_FLG, BC000C5_A234TAM04_CRT_PROG_NM, BC000C5_n234TAM04_CRT_PROG_NM, BC000C5_A236TAM04_UPD_PROG_NM,
            BC000C5_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C6_A13TAM04_AUTH_CD, BC000C6_A233TAM04_CRT_DATETIME, BC000C6_n233TAM04_CRT_DATETIME, BC000C6_A266TAM04_CRT_USER_ID, BC000C6_n266TAM04_CRT_USER_ID, BC000C6_A235TAM04_UPD_DATETIME, BC000C6_n235TAM04_UPD_DATETIME, BC000C6_A267TAM04_UPD_USER_ID, BC000C6_n267TAM04_UPD_USER_ID, BC000C6_A286TAM04_UPD_CNT,
            BC000C6_n286TAM04_UPD_CNT, BC000C6_A285TAM04_AUTH_NM, BC000C6_n285TAM04_AUTH_NM, BC000C6_A687TAM04_AUTH_LVL, BC000C6_n687TAM04_AUTH_LVL, BC000C6_A215TAM04_DEL_FLG, BC000C6_n215TAM04_DEL_FLG, BC000C6_A234TAM04_CRT_PROG_NM, BC000C6_n234TAM04_CRT_PROG_NM, BC000C6_A236TAM04_UPD_PROG_NM,
            BC000C6_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C7_A13TAM04_AUTH_CD, BC000C7_A233TAM04_CRT_DATETIME, BC000C7_n233TAM04_CRT_DATETIME, BC000C7_A266TAM04_CRT_USER_ID, BC000C7_n266TAM04_CRT_USER_ID, BC000C7_A235TAM04_UPD_DATETIME, BC000C7_n235TAM04_UPD_DATETIME, BC000C7_A267TAM04_UPD_USER_ID, BC000C7_n267TAM04_UPD_USER_ID, BC000C7_A286TAM04_UPD_CNT,
            BC000C7_n286TAM04_UPD_CNT, BC000C7_A285TAM04_AUTH_NM, BC000C7_n285TAM04_AUTH_NM, BC000C7_A687TAM04_AUTH_LVL, BC000C7_n687TAM04_AUTH_LVL, BC000C7_A215TAM04_DEL_FLG, BC000C7_n215TAM04_DEL_FLG, BC000C7_A234TAM04_CRT_PROG_NM, BC000C7_n234TAM04_CRT_PROG_NM, BC000C7_A236TAM04_UPD_PROG_NM,
            BC000C7_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C8_A13TAM04_AUTH_CD
            }
            , new Object[] {
            BC000C9_A13TAM04_AUTH_CD, BC000C9_A233TAM04_CRT_DATETIME, BC000C9_n233TAM04_CRT_DATETIME, BC000C9_A266TAM04_CRT_USER_ID, BC000C9_n266TAM04_CRT_USER_ID, BC000C9_A235TAM04_UPD_DATETIME, BC000C9_n235TAM04_UPD_DATETIME, BC000C9_A267TAM04_UPD_USER_ID, BC000C9_n267TAM04_UPD_USER_ID, BC000C9_A286TAM04_UPD_CNT,
            BC000C9_n286TAM04_UPD_CNT, BC000C9_A285TAM04_AUTH_NM, BC000C9_n285TAM04_AUTH_NM, BC000C9_A687TAM04_AUTH_LVL, BC000C9_n687TAM04_AUTH_LVL, BC000C9_A215TAM04_DEL_FLG, BC000C9_n215TAM04_DEL_FLG, BC000C9_A234TAM04_CRT_PROG_NM, BC000C9_n234TAM04_CRT_PROG_NM, BC000C9_A236TAM04_UPD_PROG_NM,
            BC000C9_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C10_A13TAM04_AUTH_CD, BC000C10_A233TAM04_CRT_DATETIME, BC000C10_n233TAM04_CRT_DATETIME, BC000C10_A266TAM04_CRT_USER_ID, BC000C10_n266TAM04_CRT_USER_ID, BC000C10_A235TAM04_UPD_DATETIME, BC000C10_n235TAM04_UPD_DATETIME, BC000C10_A267TAM04_UPD_USER_ID, BC000C10_n267TAM04_UPD_USER_ID, BC000C10_A286TAM04_UPD_CNT,
            BC000C10_n286TAM04_UPD_CNT, BC000C10_A285TAM04_AUTH_NM, BC000C10_n285TAM04_AUTH_NM, BC000C10_A687TAM04_AUTH_LVL, BC000C10_n687TAM04_AUTH_LVL, BC000C10_A215TAM04_DEL_FLG, BC000C10_n215TAM04_DEL_FLG, BC000C10_A234TAM04_CRT_PROG_NM, BC000C10_n234TAM04_CRT_PROG_NM, BC000C10_A236TAM04_UPD_PROG_NM,
            BC000C10_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000C14_A55TAM07_USER_ID
            }
            , new Object[] {
            BC000C15_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC000C16_A13TAM04_AUTH_CD, BC000C16_A233TAM04_CRT_DATETIME, BC000C16_n233TAM04_CRT_DATETIME, BC000C16_A266TAM04_CRT_USER_ID, BC000C16_n266TAM04_CRT_USER_ID, BC000C16_A235TAM04_UPD_DATETIME, BC000C16_n235TAM04_UPD_DATETIME, BC000C16_A267TAM04_UPD_USER_ID, BC000C16_n267TAM04_UPD_USER_ID, BC000C16_A286TAM04_UPD_CNT,
            BC000C16_n286TAM04_UPD_CNT, BC000C16_A285TAM04_AUTH_NM, BC000C16_n285TAM04_AUTH_NM, BC000C16_A687TAM04_AUTH_LVL, BC000C16_n687TAM04_AUTH_LVL, BC000C16_A215TAM04_DEL_FLG, BC000C16_n215TAM04_DEL_FLG, BC000C16_A234TAM04_CRT_PROG_NM, BC000C16_n234TAM04_CRT_PROG_NM, BC000C16_A236TAM04_UPD_PROG_NM,
            BC000C16_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C17_A13TAM04_AUTH_CD, BC000C17_A290TAM05_CRT_DATETIME, BC000C17_n290TAM05_CRT_DATETIME, BC000C17_A291TAM05_CRT_USER_ID, BC000C17_n291TAM05_CRT_USER_ID, BC000C17_A293TAM05_UPD_DATETIME, BC000C17_n293TAM05_UPD_DATETIME, BC000C17_A294TAM05_UPD_USER_ID, BC000C17_n294TAM05_UPD_USER_ID, BC000C17_A296TAM05_UPD_CNT,
            BC000C17_n296TAM05_UPD_CNT, BC000C17_A288TAM05_KNGN_FLG, BC000C17_n288TAM05_KNGN_FLG, BC000C17_A289TAM05_DEL_FLG, BC000C17_n289TAM05_DEL_FLG, BC000C17_A292TAM05_CRT_PROG_NM, BC000C17_n292TAM05_CRT_PROG_NM, BC000C17_A295TAM05_UPD_PROG_NM, BC000C17_n295TAM05_UPD_PROG_NM, BC000C17_A12TAM03_APP_ID
            }
            , new Object[] {
            BC000C18_A12TAM03_APP_ID
            }
            , new Object[] {
            BC000C19_A13TAM04_AUTH_CD, BC000C19_A12TAM03_APP_ID
            }
            , new Object[] {
            BC000C20_A13TAM04_AUTH_CD, BC000C20_A290TAM05_CRT_DATETIME, BC000C20_n290TAM05_CRT_DATETIME, BC000C20_A291TAM05_CRT_USER_ID, BC000C20_n291TAM05_CRT_USER_ID, BC000C20_A293TAM05_UPD_DATETIME, BC000C20_n293TAM05_UPD_DATETIME, BC000C20_A294TAM05_UPD_USER_ID, BC000C20_n294TAM05_UPD_USER_ID, BC000C20_A296TAM05_UPD_CNT,
            BC000C20_n296TAM05_UPD_CNT, BC000C20_A288TAM05_KNGN_FLG, BC000C20_n288TAM05_KNGN_FLG, BC000C20_A289TAM05_DEL_FLG, BC000C20_n289TAM05_DEL_FLG, BC000C20_A292TAM05_CRT_PROG_NM, BC000C20_n292TAM05_CRT_PROG_NM, BC000C20_A295TAM05_UPD_PROG_NM, BC000C20_n295TAM05_UPD_PROG_NM, BC000C20_A12TAM03_APP_ID
            }
            , new Object[] {
            BC000C21_A13TAM04_AUTH_CD, BC000C21_A290TAM05_CRT_DATETIME, BC000C21_n290TAM05_CRT_DATETIME, BC000C21_A291TAM05_CRT_USER_ID, BC000C21_n291TAM05_CRT_USER_ID, BC000C21_A293TAM05_UPD_DATETIME, BC000C21_n293TAM05_UPD_DATETIME, BC000C21_A294TAM05_UPD_USER_ID, BC000C21_n294TAM05_UPD_USER_ID, BC000C21_A296TAM05_UPD_CNT,
            BC000C21_n296TAM05_UPD_CNT, BC000C21_A288TAM05_KNGN_FLG, BC000C21_n288TAM05_KNGN_FLG, BC000C21_A289TAM05_DEL_FLG, BC000C21_n289TAM05_DEL_FLG, BC000C21_A292TAM05_CRT_PROG_NM, BC000C21_n292TAM05_CRT_PROG_NM, BC000C21_A295TAM05_UPD_PROG_NM, BC000C21_n295TAM05_UPD_PROG_NM, BC000C21_A12TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000C25_A13TAM04_AUTH_CD, BC000C25_A290TAM05_CRT_DATETIME, BC000C25_n290TAM05_CRT_DATETIME, BC000C25_A291TAM05_CRT_USER_ID, BC000C25_n291TAM05_CRT_USER_ID, BC000C25_A293TAM05_UPD_DATETIME, BC000C25_n293TAM05_UPD_DATETIME, BC000C25_A294TAM05_UPD_USER_ID, BC000C25_n294TAM05_UPD_USER_ID, BC000C25_A296TAM05_UPD_CNT,
            BC000C25_n296TAM05_UPD_CNT, BC000C25_A288TAM05_KNGN_FLG, BC000C25_n288TAM05_KNGN_FLG, BC000C25_A289TAM05_DEL_FLG, BC000C25_n289TAM05_DEL_FLG, BC000C25_A292TAM05_CRT_PROG_NM, BC000C25_n292TAM05_CRT_PROG_NM, BC000C25_A295TAM05_UPD_PROG_NM, BC000C25_n295TAM05_UPD_PROG_NM, BC000C25_A12TAM03_APP_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV12Pgmname = "TAM04BC_KNGN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: E112 */
      E112 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte A687TAM04_AUTH_LVL ;
   private byte Z687TAM04_AUTH_LVL ;
   private byte Gxremove9 ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nGXsfl_9_idx=1 ;
   private short nIsMod_9 ;
   private short RcdFound9 ;
   private short RcdFound3 ;
   private short nRcdExists_9 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long A286TAM04_UPD_CNT ;
   private long Z286TAM04_UPD_CNT ;
   private long Z296TAM05_UPD_CNT ;
   private long A296TAM05_UPD_CNT ;
   private long O286TAM04_UPD_CNT ;
   private long O296TAM05_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String sMode3 ;
   private String AV12Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode9 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A233TAM04_CRT_DATETIME ;
   private java.util.Date A235TAM04_UPD_DATETIME ;
   private java.util.Date Z233TAM04_CRT_DATETIME ;
   private java.util.Date Z235TAM04_UPD_DATETIME ;
   private java.util.Date Z290TAM05_CRT_DATETIME ;
   private java.util.Date A290TAM05_CRT_DATETIME ;
   private java.util.Date Z293TAM05_UPD_DATETIME ;
   private java.util.Date A293TAM05_UPD_DATETIME ;
   private boolean n233TAM04_CRT_DATETIME ;
   private boolean n266TAM04_CRT_USER_ID ;
   private boolean n235TAM04_UPD_DATETIME ;
   private boolean n267TAM04_UPD_USER_ID ;
   private boolean n286TAM04_UPD_CNT ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n687TAM04_AUTH_LVL ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n234TAM04_CRT_PROG_NM ;
   private boolean n236TAM04_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private boolean n290TAM05_CRT_DATETIME ;
   private boolean n291TAM05_CRT_USER_ID ;
   private boolean n293TAM05_UPD_DATETIME ;
   private boolean n294TAM05_UPD_USER_ID ;
   private boolean n296TAM05_UPD_CNT ;
   private boolean n288TAM05_KNGN_FLG ;
   private boolean n289TAM05_DEL_FLG ;
   private boolean n292TAM05_CRT_PROG_NM ;
   private boolean n295TAM05_UPD_PROG_NM ;
   private String Z13TAM04_AUTH_CD ;
   private String A13TAM04_AUTH_CD ;
   private String AV11W_BC_FLG ;
   private String AV10W_TXT ;
   private String A285TAM04_AUTH_NM ;
   private String A215TAM04_DEL_FLG ;
   private String A266TAM04_CRT_USER_ID ;
   private String A234TAM04_CRT_PROG_NM ;
   private String A267TAM04_UPD_USER_ID ;
   private String A236TAM04_UPD_PROG_NM ;
   private String Z266TAM04_CRT_USER_ID ;
   private String Z267TAM04_UPD_USER_ID ;
   private String Z285TAM04_AUTH_NM ;
   private String Z215TAM04_DEL_FLG ;
   private String Z234TAM04_CRT_PROG_NM ;
   private String Z236TAM04_UPD_PROG_NM ;
   private String Z12TAM03_APP_ID ;
   private String A12TAM03_APP_ID ;
   private String Z288TAM05_KNGN_FLG ;
   private String A288TAM05_KNGN_FLG ;
   private String Z289TAM05_DEL_FLG ;
   private String A289TAM05_DEL_FLG ;
   private String Z291TAM05_CRT_USER_ID ;
   private String A291TAM05_CRT_USER_ID ;
   private String Z292TAM05_CRT_PROG_NM ;
   private String A292TAM05_CRT_PROG_NM ;
   private String Z294TAM05_UPD_USER_ID ;
   private String A294TAM05_UPD_USER_ID ;
   private String Z295TAM05_UPD_PROG_NM ;
   private String A295TAM05_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAM04BC_KNGN bcTAM04BC_KNGN ;
   private IDataStoreProvider pr_default ;
   private String[] BC000C7_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C7_A233TAM04_CRT_DATETIME ;
   private boolean[] BC000C7_n233TAM04_CRT_DATETIME ;
   private String[] BC000C7_A266TAM04_CRT_USER_ID ;
   private boolean[] BC000C7_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C7_A235TAM04_UPD_DATETIME ;
   private boolean[] BC000C7_n235TAM04_UPD_DATETIME ;
   private String[] BC000C7_A267TAM04_UPD_USER_ID ;
   private boolean[] BC000C7_n267TAM04_UPD_USER_ID ;
   private long[] BC000C7_A286TAM04_UPD_CNT ;
   private boolean[] BC000C7_n286TAM04_UPD_CNT ;
   private String[] BC000C7_A285TAM04_AUTH_NM ;
   private boolean[] BC000C7_n285TAM04_AUTH_NM ;
   private byte[] BC000C7_A687TAM04_AUTH_LVL ;
   private boolean[] BC000C7_n687TAM04_AUTH_LVL ;
   private String[] BC000C7_A215TAM04_DEL_FLG ;
   private boolean[] BC000C7_n215TAM04_DEL_FLG ;
   private String[] BC000C7_A234TAM04_CRT_PROG_NM ;
   private boolean[] BC000C7_n234TAM04_CRT_PROG_NM ;
   private String[] BC000C7_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC000C7_n236TAM04_UPD_PROG_NM ;
   private String[] BC000C8_A13TAM04_AUTH_CD ;
   private String[] BC000C9_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C9_A233TAM04_CRT_DATETIME ;
   private boolean[] BC000C9_n233TAM04_CRT_DATETIME ;
   private String[] BC000C9_A266TAM04_CRT_USER_ID ;
   private boolean[] BC000C9_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C9_A235TAM04_UPD_DATETIME ;
   private boolean[] BC000C9_n235TAM04_UPD_DATETIME ;
   private String[] BC000C9_A267TAM04_UPD_USER_ID ;
   private boolean[] BC000C9_n267TAM04_UPD_USER_ID ;
   private long[] BC000C9_A286TAM04_UPD_CNT ;
   private boolean[] BC000C9_n286TAM04_UPD_CNT ;
   private String[] BC000C9_A285TAM04_AUTH_NM ;
   private boolean[] BC000C9_n285TAM04_AUTH_NM ;
   private byte[] BC000C9_A687TAM04_AUTH_LVL ;
   private boolean[] BC000C9_n687TAM04_AUTH_LVL ;
   private String[] BC000C9_A215TAM04_DEL_FLG ;
   private boolean[] BC000C9_n215TAM04_DEL_FLG ;
   private String[] BC000C9_A234TAM04_CRT_PROG_NM ;
   private boolean[] BC000C9_n234TAM04_CRT_PROG_NM ;
   private String[] BC000C9_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC000C9_n236TAM04_UPD_PROG_NM ;
   private String[] BC000C10_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C10_A233TAM04_CRT_DATETIME ;
   private boolean[] BC000C10_n233TAM04_CRT_DATETIME ;
   private String[] BC000C10_A266TAM04_CRT_USER_ID ;
   private boolean[] BC000C10_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C10_A235TAM04_UPD_DATETIME ;
   private boolean[] BC000C10_n235TAM04_UPD_DATETIME ;
   private String[] BC000C10_A267TAM04_UPD_USER_ID ;
   private boolean[] BC000C10_n267TAM04_UPD_USER_ID ;
   private long[] BC000C10_A286TAM04_UPD_CNT ;
   private boolean[] BC000C10_n286TAM04_UPD_CNT ;
   private String[] BC000C10_A285TAM04_AUTH_NM ;
   private boolean[] BC000C10_n285TAM04_AUTH_NM ;
   private byte[] BC000C10_A687TAM04_AUTH_LVL ;
   private boolean[] BC000C10_n687TAM04_AUTH_LVL ;
   private String[] BC000C10_A215TAM04_DEL_FLG ;
   private boolean[] BC000C10_n215TAM04_DEL_FLG ;
   private String[] BC000C10_A234TAM04_CRT_PROG_NM ;
   private boolean[] BC000C10_n234TAM04_CRT_PROG_NM ;
   private String[] BC000C10_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC000C10_n236TAM04_UPD_PROG_NM ;
   private String[] BC000C14_A55TAM07_USER_ID ;
   private String[] BC000C15_A50TBM07_AUTH_CD ;
   private String[] BC000C16_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C16_A233TAM04_CRT_DATETIME ;
   private boolean[] BC000C16_n233TAM04_CRT_DATETIME ;
   private String[] BC000C16_A266TAM04_CRT_USER_ID ;
   private boolean[] BC000C16_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C16_A235TAM04_UPD_DATETIME ;
   private boolean[] BC000C16_n235TAM04_UPD_DATETIME ;
   private String[] BC000C16_A267TAM04_UPD_USER_ID ;
   private boolean[] BC000C16_n267TAM04_UPD_USER_ID ;
   private long[] BC000C16_A286TAM04_UPD_CNT ;
   private boolean[] BC000C16_n286TAM04_UPD_CNT ;
   private String[] BC000C16_A285TAM04_AUTH_NM ;
   private boolean[] BC000C16_n285TAM04_AUTH_NM ;
   private byte[] BC000C16_A687TAM04_AUTH_LVL ;
   private boolean[] BC000C16_n687TAM04_AUTH_LVL ;
   private String[] BC000C16_A215TAM04_DEL_FLG ;
   private boolean[] BC000C16_n215TAM04_DEL_FLG ;
   private String[] BC000C16_A234TAM04_CRT_PROG_NM ;
   private boolean[] BC000C16_n234TAM04_CRT_PROG_NM ;
   private String[] BC000C16_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC000C16_n236TAM04_UPD_PROG_NM ;
   private String[] BC000C17_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C17_A290TAM05_CRT_DATETIME ;
   private boolean[] BC000C17_n290TAM05_CRT_DATETIME ;
   private String[] BC000C17_A291TAM05_CRT_USER_ID ;
   private boolean[] BC000C17_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C17_A293TAM05_UPD_DATETIME ;
   private boolean[] BC000C17_n293TAM05_UPD_DATETIME ;
   private String[] BC000C17_A294TAM05_UPD_USER_ID ;
   private boolean[] BC000C17_n294TAM05_UPD_USER_ID ;
   private long[] BC000C17_A296TAM05_UPD_CNT ;
   private boolean[] BC000C17_n296TAM05_UPD_CNT ;
   private String[] BC000C17_A288TAM05_KNGN_FLG ;
   private boolean[] BC000C17_n288TAM05_KNGN_FLG ;
   private String[] BC000C17_A289TAM05_DEL_FLG ;
   private boolean[] BC000C17_n289TAM05_DEL_FLG ;
   private String[] BC000C17_A292TAM05_CRT_PROG_NM ;
   private boolean[] BC000C17_n292TAM05_CRT_PROG_NM ;
   private String[] BC000C17_A295TAM05_UPD_PROG_NM ;
   private boolean[] BC000C17_n295TAM05_UPD_PROG_NM ;
   private String[] BC000C17_A12TAM03_APP_ID ;
   private String[] BC000C18_A12TAM03_APP_ID ;
   private String[] BC000C19_A13TAM04_AUTH_CD ;
   private String[] BC000C19_A12TAM03_APP_ID ;
   private String[] BC000C20_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C20_A290TAM05_CRT_DATETIME ;
   private boolean[] BC000C20_n290TAM05_CRT_DATETIME ;
   private String[] BC000C20_A291TAM05_CRT_USER_ID ;
   private boolean[] BC000C20_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C20_A293TAM05_UPD_DATETIME ;
   private boolean[] BC000C20_n293TAM05_UPD_DATETIME ;
   private String[] BC000C20_A294TAM05_UPD_USER_ID ;
   private boolean[] BC000C20_n294TAM05_UPD_USER_ID ;
   private long[] BC000C20_A296TAM05_UPD_CNT ;
   private boolean[] BC000C20_n296TAM05_UPD_CNT ;
   private String[] BC000C20_A288TAM05_KNGN_FLG ;
   private boolean[] BC000C20_n288TAM05_KNGN_FLG ;
   private String[] BC000C20_A289TAM05_DEL_FLG ;
   private boolean[] BC000C20_n289TAM05_DEL_FLG ;
   private String[] BC000C20_A292TAM05_CRT_PROG_NM ;
   private boolean[] BC000C20_n292TAM05_CRT_PROG_NM ;
   private String[] BC000C20_A295TAM05_UPD_PROG_NM ;
   private boolean[] BC000C20_n295TAM05_UPD_PROG_NM ;
   private String[] BC000C20_A12TAM03_APP_ID ;
   private String[] BC000C21_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C21_A290TAM05_CRT_DATETIME ;
   private boolean[] BC000C21_n290TAM05_CRT_DATETIME ;
   private String[] BC000C21_A291TAM05_CRT_USER_ID ;
   private boolean[] BC000C21_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C21_A293TAM05_UPD_DATETIME ;
   private boolean[] BC000C21_n293TAM05_UPD_DATETIME ;
   private String[] BC000C21_A294TAM05_UPD_USER_ID ;
   private boolean[] BC000C21_n294TAM05_UPD_USER_ID ;
   private long[] BC000C21_A296TAM05_UPD_CNT ;
   private boolean[] BC000C21_n296TAM05_UPD_CNT ;
   private String[] BC000C21_A288TAM05_KNGN_FLG ;
   private boolean[] BC000C21_n288TAM05_KNGN_FLG ;
   private String[] BC000C21_A289TAM05_DEL_FLG ;
   private boolean[] BC000C21_n289TAM05_DEL_FLG ;
   private String[] BC000C21_A292TAM05_CRT_PROG_NM ;
   private boolean[] BC000C21_n292TAM05_CRT_PROG_NM ;
   private String[] BC000C21_A295TAM05_UPD_PROG_NM ;
   private boolean[] BC000C21_n295TAM05_UPD_PROG_NM ;
   private String[] BC000C21_A12TAM03_APP_ID ;
   private String[] BC000C25_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C25_A290TAM05_CRT_DATETIME ;
   private boolean[] BC000C25_n290TAM05_CRT_DATETIME ;
   private String[] BC000C25_A291TAM05_CRT_USER_ID ;
   private boolean[] BC000C25_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C25_A293TAM05_UPD_DATETIME ;
   private boolean[] BC000C25_n293TAM05_UPD_DATETIME ;
   private String[] BC000C25_A294TAM05_UPD_USER_ID ;
   private boolean[] BC000C25_n294TAM05_UPD_USER_ID ;
   private long[] BC000C25_A296TAM05_UPD_CNT ;
   private boolean[] BC000C25_n296TAM05_UPD_CNT ;
   private String[] BC000C25_A288TAM05_KNGN_FLG ;
   private boolean[] BC000C25_n288TAM05_KNGN_FLG ;
   private String[] BC000C25_A289TAM05_DEL_FLG ;
   private boolean[] BC000C25_n289TAM05_DEL_FLG ;
   private String[] BC000C25_A292TAM05_CRT_PROG_NM ;
   private boolean[] BC000C25_n292TAM05_CRT_PROG_NM ;
   private String[] BC000C25_A295TAM05_UPD_PROG_NM ;
   private boolean[] BC000C25_n295TAM05_UPD_PROG_NM ;
   private String[] BC000C25_A12TAM03_APP_ID ;
   private String[] BC000C2_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C2_A290TAM05_CRT_DATETIME ;
   private String[] BC000C2_A291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C2_A293TAM05_UPD_DATETIME ;
   private String[] BC000C2_A294TAM05_UPD_USER_ID ;
   private long[] BC000C2_A296TAM05_UPD_CNT ;
   private String[] BC000C2_A288TAM05_KNGN_FLG ;
   private String[] BC000C2_A289TAM05_DEL_FLG ;
   private String[] BC000C2_A292TAM05_CRT_PROG_NM ;
   private String[] BC000C2_A295TAM05_UPD_PROG_NM ;
   private String[] BC000C2_A12TAM03_APP_ID ;
   private String[] BC000C3_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C3_A290TAM05_CRT_DATETIME ;
   private String[] BC000C3_A291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C3_A293TAM05_UPD_DATETIME ;
   private String[] BC000C3_A294TAM05_UPD_USER_ID ;
   private long[] BC000C3_A296TAM05_UPD_CNT ;
   private String[] BC000C3_A288TAM05_KNGN_FLG ;
   private String[] BC000C3_A289TAM05_DEL_FLG ;
   private String[] BC000C3_A292TAM05_CRT_PROG_NM ;
   private String[] BC000C3_A295TAM05_UPD_PROG_NM ;
   private String[] BC000C3_A12TAM03_APP_ID ;
   private String[] BC000C4_A12TAM03_APP_ID ;
   private String[] BC000C5_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C5_A233TAM04_CRT_DATETIME ;
   private String[] BC000C5_A266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C5_A235TAM04_UPD_DATETIME ;
   private String[] BC000C5_A267TAM04_UPD_USER_ID ;
   private long[] BC000C5_A286TAM04_UPD_CNT ;
   private String[] BC000C5_A285TAM04_AUTH_NM ;
   private byte[] BC000C5_A687TAM04_AUTH_LVL ;
   private String[] BC000C5_A215TAM04_DEL_FLG ;
   private String[] BC000C5_A234TAM04_CRT_PROG_NM ;
   private String[] BC000C5_A236TAM04_UPD_PROG_NM ;
   private String[] BC000C6_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000C6_A233TAM04_CRT_DATETIME ;
   private String[] BC000C6_A266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C6_A235TAM04_UPD_DATETIME ;
   private String[] BC000C6_A267TAM04_UPD_USER_ID ;
   private long[] BC000C6_A286TAM04_UPD_CNT ;
   private String[] BC000C6_A285TAM04_AUTH_NM ;
   private byte[] BC000C6_A687TAM04_AUTH_LVL ;
   private String[] BC000C6_A215TAM04_DEL_FLG ;
   private String[] BC000C6_A234TAM04_CRT_PROG_NM ;
   private String[] BC000C6_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC000C2_n290TAM05_CRT_DATETIME ;
   private boolean[] BC000C2_n291TAM05_CRT_USER_ID ;
   private boolean[] BC000C2_n293TAM05_UPD_DATETIME ;
   private boolean[] BC000C2_n294TAM05_UPD_USER_ID ;
   private boolean[] BC000C2_n296TAM05_UPD_CNT ;
   private boolean[] BC000C2_n288TAM05_KNGN_FLG ;
   private boolean[] BC000C2_n289TAM05_DEL_FLG ;
   private boolean[] BC000C2_n292TAM05_CRT_PROG_NM ;
   private boolean[] BC000C2_n295TAM05_UPD_PROG_NM ;
   private boolean[] BC000C3_n290TAM05_CRT_DATETIME ;
   private boolean[] BC000C3_n291TAM05_CRT_USER_ID ;
   private boolean[] BC000C3_n293TAM05_UPD_DATETIME ;
   private boolean[] BC000C3_n294TAM05_UPD_USER_ID ;
   private boolean[] BC000C3_n296TAM05_UPD_CNT ;
   private boolean[] BC000C3_n288TAM05_KNGN_FLG ;
   private boolean[] BC000C3_n289TAM05_DEL_FLG ;
   private boolean[] BC000C3_n292TAM05_CRT_PROG_NM ;
   private boolean[] BC000C3_n295TAM05_UPD_PROG_NM ;
   private boolean[] BC000C5_n233TAM04_CRT_DATETIME ;
   private boolean[] BC000C5_n266TAM04_CRT_USER_ID ;
   private boolean[] BC000C5_n235TAM04_UPD_DATETIME ;
   private boolean[] BC000C5_n267TAM04_UPD_USER_ID ;
   private boolean[] BC000C5_n286TAM04_UPD_CNT ;
   private boolean[] BC000C5_n285TAM04_AUTH_NM ;
   private boolean[] BC000C5_n687TAM04_AUTH_LVL ;
   private boolean[] BC000C5_n215TAM04_DEL_FLG ;
   private boolean[] BC000C5_n234TAM04_CRT_PROG_NM ;
   private boolean[] BC000C5_n236TAM04_UPD_PROG_NM ;
   private boolean[] BC000C6_n233TAM04_CRT_DATETIME ;
   private boolean[] BC000C6_n266TAM04_CRT_USER_ID ;
   private boolean[] BC000C6_n235TAM04_UPD_DATETIME ;
   private boolean[] BC000C6_n267TAM04_UPD_USER_ID ;
   private boolean[] BC000C6_n286TAM04_UPD_CNT ;
   private boolean[] BC000C6_n285TAM04_AUTH_NM ;
   private boolean[] BC000C6_n687TAM04_AUTH_LVL ;
   private boolean[] BC000C6_n215TAM04_DEL_FLG ;
   private boolean[] BC000C6_n234TAM04_CRT_PROG_NM ;
   private boolean[] BC000C6_n236TAM04_UPD_PROG_NM ;
}

final  class tam04bc_kngn_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000C2", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C3", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C4", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C5", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C6", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C7", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000C8", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C9", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C10", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000C11", "INSERT INTO `TAM04_KNGN`(`TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000C12", "UPDATE `TAM04_KNGN` SET `TAM04_CRT_DATETIME`=?, `TAM04_CRT_USER_ID`=?, `TAM04_UPD_DATETIME`=?, `TAM04_UPD_USER_ID`=?, `TAM04_UPD_CNT`=?, `TAM04_AUTH_NM`=?, `TAM04_AUTH_LVL`=?, `TAM04_DEL_FLG`=?, `TAM04_CRT_PROG_NM`=?, `TAM04_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000C13", "DELETE FROM `TAM04_KNGN`  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000C14", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000C15", "SELECT `TBM07_AUTH_CD` FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000C16", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000C17", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? and `TAM03_APP_ID` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("BC000C18", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C19", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C20", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000C21", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000C22", "INSERT INTO `TAM05_APPLI_KNGN`(`TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000C23", "UPDATE `TAM05_APPLI_KNGN` SET `TAM05_CRT_DATETIME`=?, `TAM05_CRT_USER_ID`=?, `TAM05_UPD_DATETIME`=?, `TAM05_UPD_USER_ID`=?, `TAM05_UPD_CNT`=?, `TAM05_KNGN_FLG`=?, `TAM05_DEL_FLG`=?, `TAM05_CRT_PROG_NM`=?, `TAM05_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000C24", "DELETE FROM `TAM05_APPLI_KNGN`  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000C25", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,11,0,false )
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 5 :
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 14 :
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 15 :
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 18 :
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 19 :
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 23 :
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
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
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 9 :
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
                  stmt.setVarchar(7, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
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
               return;
            case 10 :
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
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
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
               stmt.setVarchar(11, (String)parms[20], 2, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 20 :
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
                  stmt.setVarchar(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               stmt.setVarchar(11, (String)parms[19], 7, false);
               return;
            case 21 :
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
               stmt.setVarchar(10, (String)parms[18], 2, false);
               stmt.setVarchar(11, (String)parms[19], 7, false);
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

