/*
               File: tam04bc_kngn_bc
        Description: 権限パターンマスタ（ビジネスコンポーネント）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:10.59
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120C2 */
         e120C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
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
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void e110C2( )
   {
      /* Start Routine */
      AV11W_BC_FLG = "0" ;
      AV11W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV11W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV12Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120C2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV12Pgmname) ;
      AV10W_TXT = "" ;
      AV10W_TXT = AV10W_TXT + "権限パターン区分:" + A17TAM04_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A98TAM04_AUTH_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A601TAM04_AUTH_LVL, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A18TAM04_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A39TAM04_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A78TAM04_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A40TAM04_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A41TAM04_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A79TAM04_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A42TAM04_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A99TAM04_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = GXutil.strReplace( AV10W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, AV10W_TXT) ;
      new tam04bc_pc01_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, A17TAM04_AUTH_CD) ;
   }

   public void S1165( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV12Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0C3( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         Z39TAM04_CRT_DATETIME = A39TAM04_CRT_DATETIME ;
         Z78TAM04_CRT_USER_ID = A78TAM04_CRT_USER_ID ;
         Z41TAM04_UPD_DATETIME = A41TAM04_UPD_DATETIME ;
         Z79TAM04_UPD_USER_ID = A79TAM04_UPD_USER_ID ;
         Z99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
         Z98TAM04_AUTH_NM = A98TAM04_AUTH_NM ;
         Z601TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
         Z18TAM04_DEL_FLG = A18TAM04_DEL_FLG ;
         Z40TAM04_CRT_PROG_NM = A40TAM04_CRT_PROG_NM ;
         Z42TAM04_UPD_PROG_NM = A42TAM04_UPD_PROG_NM ;
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
         Z101TAM05_KNGN_FLG = A101TAM05_KNGN_FLG ;
         Z102TAM05_DEL_FLG = A102TAM05_DEL_FLG ;
         Z103TAM05_CRT_DATETIME = A103TAM05_CRT_DATETIME ;
         Z104TAM05_CRT_USER_ID = A104TAM05_CRT_USER_ID ;
         Z105TAM05_CRT_PROG_NM = A105TAM05_CRT_PROG_NM ;
         Z106TAM05_UPD_DATETIME = A106TAM05_UPD_DATETIME ;
         Z107TAM05_UPD_USER_ID = A107TAM05_UPD_USER_ID ;
         Z108TAM05_UPD_PROG_NM = A108TAM05_UPD_PROG_NM ;
         Z109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
      }
      if ( GX_JID == -15 )
      {
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z39TAM04_CRT_DATETIME = A39TAM04_CRT_DATETIME ;
         Z78TAM04_CRT_USER_ID = A78TAM04_CRT_USER_ID ;
         Z41TAM04_UPD_DATETIME = A41TAM04_UPD_DATETIME ;
         Z79TAM04_UPD_USER_ID = A79TAM04_UPD_USER_ID ;
         Z99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
         Z98TAM04_AUTH_NM = A98TAM04_AUTH_NM ;
         Z601TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
         Z18TAM04_DEL_FLG = A18TAM04_DEL_FLG ;
         Z40TAM04_CRT_PROG_NM = A40TAM04_CRT_PROG_NM ;
         Z42TAM04_UPD_PROG_NM = A42TAM04_UPD_PROG_NM ;
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
      pr_default.execute(5, new Object[] {A17TAM04_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A39TAM04_CRT_DATETIME = BC000C7_A39TAM04_CRT_DATETIME[0] ;
         n39TAM04_CRT_DATETIME = BC000C7_n39TAM04_CRT_DATETIME[0] ;
         A78TAM04_CRT_USER_ID = BC000C7_A78TAM04_CRT_USER_ID[0] ;
         n78TAM04_CRT_USER_ID = BC000C7_n78TAM04_CRT_USER_ID[0] ;
         A41TAM04_UPD_DATETIME = BC000C7_A41TAM04_UPD_DATETIME[0] ;
         n41TAM04_UPD_DATETIME = BC000C7_n41TAM04_UPD_DATETIME[0] ;
         A79TAM04_UPD_USER_ID = BC000C7_A79TAM04_UPD_USER_ID[0] ;
         n79TAM04_UPD_USER_ID = BC000C7_n79TAM04_UPD_USER_ID[0] ;
         A99TAM04_UPD_CNT = BC000C7_A99TAM04_UPD_CNT[0] ;
         n99TAM04_UPD_CNT = BC000C7_n99TAM04_UPD_CNT[0] ;
         A98TAM04_AUTH_NM = BC000C7_A98TAM04_AUTH_NM[0] ;
         n98TAM04_AUTH_NM = BC000C7_n98TAM04_AUTH_NM[0] ;
         A601TAM04_AUTH_LVL = BC000C7_A601TAM04_AUTH_LVL[0] ;
         n601TAM04_AUTH_LVL = BC000C7_n601TAM04_AUTH_LVL[0] ;
         A18TAM04_DEL_FLG = BC000C7_A18TAM04_DEL_FLG[0] ;
         n18TAM04_DEL_FLG = BC000C7_n18TAM04_DEL_FLG[0] ;
         A40TAM04_CRT_PROG_NM = BC000C7_A40TAM04_CRT_PROG_NM[0] ;
         n40TAM04_CRT_PROG_NM = BC000C7_n40TAM04_CRT_PROG_NM[0] ;
         A42TAM04_UPD_PROG_NM = BC000C7_A42TAM04_UPD_PROG_NM[0] ;
         n42TAM04_UPD_PROG_NM = BC000C7_n42TAM04_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A39TAM04_CRT_DATETIME) || (( A39TAM04_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A39TAM04_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A41TAM04_UPD_DATETIME) || (( A41TAM04_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A41TAM04_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
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
      pr_default.execute(6, new Object[] {A17TAM04_AUTH_CD});
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
      /* Using cursor BC000C6 */
      pr_default.execute(4, new Object[] {A17TAM04_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0C3( 15) ;
         RcdFound3 = (short)(1) ;
         A17TAM04_AUTH_CD = BC000C6_A17TAM04_AUTH_CD[0] ;
         A39TAM04_CRT_DATETIME = BC000C6_A39TAM04_CRT_DATETIME[0] ;
         n39TAM04_CRT_DATETIME = BC000C6_n39TAM04_CRT_DATETIME[0] ;
         A78TAM04_CRT_USER_ID = BC000C6_A78TAM04_CRT_USER_ID[0] ;
         n78TAM04_CRT_USER_ID = BC000C6_n78TAM04_CRT_USER_ID[0] ;
         A41TAM04_UPD_DATETIME = BC000C6_A41TAM04_UPD_DATETIME[0] ;
         n41TAM04_UPD_DATETIME = BC000C6_n41TAM04_UPD_DATETIME[0] ;
         A79TAM04_UPD_USER_ID = BC000C6_A79TAM04_UPD_USER_ID[0] ;
         n79TAM04_UPD_USER_ID = BC000C6_n79TAM04_UPD_USER_ID[0] ;
         A99TAM04_UPD_CNT = BC000C6_A99TAM04_UPD_CNT[0] ;
         n99TAM04_UPD_CNT = BC000C6_n99TAM04_UPD_CNT[0] ;
         A98TAM04_AUTH_NM = BC000C6_A98TAM04_AUTH_NM[0] ;
         n98TAM04_AUTH_NM = BC000C6_n98TAM04_AUTH_NM[0] ;
         A601TAM04_AUTH_LVL = BC000C6_A601TAM04_AUTH_LVL[0] ;
         n601TAM04_AUTH_LVL = BC000C6_n601TAM04_AUTH_LVL[0] ;
         A18TAM04_DEL_FLG = BC000C6_A18TAM04_DEL_FLG[0] ;
         n18TAM04_DEL_FLG = BC000C6_n18TAM04_DEL_FLG[0] ;
         A40TAM04_CRT_PROG_NM = BC000C6_A40TAM04_CRT_PROG_NM[0] ;
         n40TAM04_CRT_PROG_NM = BC000C6_n40TAM04_CRT_PROG_NM[0] ;
         A42TAM04_UPD_PROG_NM = BC000C6_A42TAM04_UPD_PROG_NM[0] ;
         n42TAM04_UPD_PROG_NM = BC000C6_n42TAM04_UPD_PROG_NM[0] ;
         O99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
         n99TAM04_UPD_CNT = false ;
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0C3( ) ;
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
      pr_default.close(4);
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
         /* Using cursor BC000C5 */
         pr_default.execute(3, new Object[] {A17TAM04_AUTH_CD});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( Z39TAM04_CRT_DATETIME.equals( BC000C5_A39TAM04_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z78TAM04_CRT_USER_ID, BC000C5_A78TAM04_CRT_USER_ID[0]) != 0 ) || !( Z41TAM04_UPD_DATETIME.equals( BC000C5_A41TAM04_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z79TAM04_UPD_USER_ID, BC000C5_A79TAM04_UPD_USER_ID[0]) != 0 ) || ( Z99TAM04_UPD_CNT != BC000C5_A99TAM04_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z98TAM04_AUTH_NM, BC000C5_A98TAM04_AUTH_NM[0]) != 0 ) || ( Z601TAM04_AUTH_LVL != BC000C5_A601TAM04_AUTH_LVL[0] ) || ( GXutil.strcmp(Z18TAM04_DEL_FLG, BC000C5_A18TAM04_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z40TAM04_CRT_PROG_NM, BC000C5_A40TAM04_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z42TAM04_UPD_PROG_NM, BC000C5_A42TAM04_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor BC000C9 */
                  pr_default.execute(7, new Object[] {A17TAM04_AUTH_CD, new Boolean(n39TAM04_CRT_DATETIME), A39TAM04_CRT_DATETIME, new Boolean(n78TAM04_CRT_USER_ID), A78TAM04_CRT_USER_ID, new Boolean(n41TAM04_UPD_DATETIME), A41TAM04_UPD_DATETIME, new Boolean(n79TAM04_UPD_USER_ID), A79TAM04_UPD_USER_ID, new Boolean(n99TAM04_UPD_CNT), new Long(A99TAM04_UPD_CNT), new Boolean(n98TAM04_AUTH_NM), A98TAM04_AUTH_NM, new Boolean(n601TAM04_AUTH_LVL), new Byte(A601TAM04_AUTH_LVL), new Boolean(n18TAM04_DEL_FLG), A18TAM04_DEL_FLG, new Boolean(n40TAM04_CRT_PROG_NM), A40TAM04_CRT_PROG_NM, new Boolean(n42TAM04_UPD_PROG_NM), A42TAM04_UPD_PROG_NM});
                  if ( (pr_default.getStatus(7) == 1) )
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
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
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
                  /* Using cursor BC000C10 */
                  pr_default.execute(8, new Object[] {new Boolean(n39TAM04_CRT_DATETIME), A39TAM04_CRT_DATETIME, new Boolean(n78TAM04_CRT_USER_ID), A78TAM04_CRT_USER_ID, new Boolean(n41TAM04_UPD_DATETIME), A41TAM04_UPD_DATETIME, new Boolean(n79TAM04_UPD_USER_ID), A79TAM04_UPD_USER_ID, new Boolean(n99TAM04_UPD_CNT), new Long(A99TAM04_UPD_CNT), new Boolean(n98TAM04_AUTH_NM), A98TAM04_AUTH_NM, new Boolean(n601TAM04_AUTH_LVL), new Byte(A601TAM04_AUTH_LVL), new Boolean(n18TAM04_DEL_FLG), A18TAM04_DEL_FLG, new Boolean(n40TAM04_CRT_PROG_NM), A40TAM04_CRT_PROG_NM, new Boolean(n42TAM04_UPD_PROG_NM), A42TAM04_UPD_PROG_NM, A17TAM04_AUTH_CD});
                  if ( (pr_default.getStatus(8) == 103) )
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
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
                  /* Using cursor BC000C11 */
                  pr_default.execute(9, new Object[] {A17TAM04_AUTH_CD});
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
         /* Using cursor BC000C12 */
         pr_default.execute(10, new Object[] {A17TAM04_AUTH_CD});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"権限別振舞マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000C13 */
         pr_default.execute(11, new Object[] {A17TAM04_AUTH_CD});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ユーザーマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
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
         if ( AnyError == 0 )
         {
            nIsMod_9 = (short)(0) ;
            if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
            {
               nRcdExists_9 = (short)(1) ;
               Gxremove9 = (byte)(0) ;
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               nRcdExists_9 = (short)(0) ;
               Gxremove9 = (byte)(1) ;
            }
         }
         /* Update SDT rows */
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().removeElement(nGXsfl_9_idx);
            nGXsfl_9_idx = (short)(nGXsfl_9_idx-1) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            VarsToRow9( ((SdtTAM04BC_KNGN_TAM05_APPLI)bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().elementAt(-1+nGXsfl_9_idx))) ;
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
         pr_default.close(3);
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
      /* Using cursor BC000C14 */
      pr_default.execute(12, new Object[] {A17TAM04_AUTH_CD});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A17TAM04_AUTH_CD = BC000C14_A17TAM04_AUTH_CD[0] ;
         A39TAM04_CRT_DATETIME = BC000C14_A39TAM04_CRT_DATETIME[0] ;
         n39TAM04_CRT_DATETIME = BC000C14_n39TAM04_CRT_DATETIME[0] ;
         A78TAM04_CRT_USER_ID = BC000C14_A78TAM04_CRT_USER_ID[0] ;
         n78TAM04_CRT_USER_ID = BC000C14_n78TAM04_CRT_USER_ID[0] ;
         A41TAM04_UPD_DATETIME = BC000C14_A41TAM04_UPD_DATETIME[0] ;
         n41TAM04_UPD_DATETIME = BC000C14_n41TAM04_UPD_DATETIME[0] ;
         A79TAM04_UPD_USER_ID = BC000C14_A79TAM04_UPD_USER_ID[0] ;
         n79TAM04_UPD_USER_ID = BC000C14_n79TAM04_UPD_USER_ID[0] ;
         A99TAM04_UPD_CNT = BC000C14_A99TAM04_UPD_CNT[0] ;
         n99TAM04_UPD_CNT = BC000C14_n99TAM04_UPD_CNT[0] ;
         A98TAM04_AUTH_NM = BC000C14_A98TAM04_AUTH_NM[0] ;
         n98TAM04_AUTH_NM = BC000C14_n98TAM04_AUTH_NM[0] ;
         A601TAM04_AUTH_LVL = BC000C14_A601TAM04_AUTH_LVL[0] ;
         n601TAM04_AUTH_LVL = BC000C14_n601TAM04_AUTH_LVL[0] ;
         A18TAM04_DEL_FLG = BC000C14_A18TAM04_DEL_FLG[0] ;
         n18TAM04_DEL_FLG = BC000C14_n18TAM04_DEL_FLG[0] ;
         A40TAM04_CRT_PROG_NM = BC000C14_A40TAM04_CRT_PROG_NM[0] ;
         n40TAM04_CRT_PROG_NM = BC000C14_n40TAM04_CRT_PROG_NM[0] ;
         A42TAM04_UPD_PROG_NM = BC000C14_A42TAM04_UPD_PROG_NM[0] ;
         n42TAM04_UPD_PROG_NM = BC000C14_n42TAM04_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0C3( )
   {
      pr_default.readNext(12);
      RcdFound3 = (short)(0) ;
      scanKeyLoad0C3( ) ;
   }

   public void scanKeyLoad0C3( )
   {
      sMode3 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A17TAM04_AUTH_CD = BC000C14_A17TAM04_AUTH_CD[0] ;
         A39TAM04_CRT_DATETIME = BC000C14_A39TAM04_CRT_DATETIME[0] ;
         n39TAM04_CRT_DATETIME = BC000C14_n39TAM04_CRT_DATETIME[0] ;
         A78TAM04_CRT_USER_ID = BC000C14_A78TAM04_CRT_USER_ID[0] ;
         n78TAM04_CRT_USER_ID = BC000C14_n78TAM04_CRT_USER_ID[0] ;
         A41TAM04_UPD_DATETIME = BC000C14_A41TAM04_UPD_DATETIME[0] ;
         n41TAM04_UPD_DATETIME = BC000C14_n41TAM04_UPD_DATETIME[0] ;
         A79TAM04_UPD_USER_ID = BC000C14_A79TAM04_UPD_USER_ID[0] ;
         n79TAM04_UPD_USER_ID = BC000C14_n79TAM04_UPD_USER_ID[0] ;
         A99TAM04_UPD_CNT = BC000C14_A99TAM04_UPD_CNT[0] ;
         n99TAM04_UPD_CNT = BC000C14_n99TAM04_UPD_CNT[0] ;
         A98TAM04_AUTH_NM = BC000C14_A98TAM04_AUTH_NM[0] ;
         n98TAM04_AUTH_NM = BC000C14_n98TAM04_AUTH_NM[0] ;
         A601TAM04_AUTH_LVL = BC000C14_A601TAM04_AUTH_LVL[0] ;
         n601TAM04_AUTH_LVL = BC000C14_n601TAM04_AUTH_LVL[0] ;
         A18TAM04_DEL_FLG = BC000C14_A18TAM04_DEL_FLG[0] ;
         n18TAM04_DEL_FLG = BC000C14_n18TAM04_DEL_FLG[0] ;
         A40TAM04_CRT_PROG_NM = BC000C14_A40TAM04_CRT_PROG_NM[0] ;
         n40TAM04_CRT_PROG_NM = BC000C14_n40TAM04_CRT_PROG_NM[0] ;
         A42TAM04_UPD_PROG_NM = BC000C14_A42TAM04_UPD_PROG_NM[0] ;
         n42TAM04_UPD_PROG_NM = BC000C14_n42TAM04_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode3 ;
   }

   public void scanKeyEnd0C3( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0C3( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C3( )
   {
      /* Before Insert Rules */
      A39TAM04_CRT_DATETIME = GXutil.now( ) ;
      n39TAM04_CRT_DATETIME = false ;
      GXt_char1 = A78TAM04_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A78TAM04_CRT_USER_ID = GXt_char1 ;
      n78TAM04_CRT_USER_ID = false ;
      A41TAM04_UPD_DATETIME = GXutil.now( ) ;
      n41TAM04_UPD_DATETIME = false ;
      GXt_char1 = A79TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A79TAM04_UPD_USER_ID = GXt_char1 ;
      n79TAM04_UPD_USER_ID = false ;
      A99TAM04_UPD_CNT = (long)(O99TAM04_UPD_CNT+1) ;
      n99TAM04_UPD_CNT = false ;
   }

   public void beforeUpdate0C3( )
   {
      /* Before Update Rules */
      A41TAM04_UPD_DATETIME = GXutil.now( ) ;
      n41TAM04_UPD_DATETIME = false ;
      GXt_char1 = A79TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A79TAM04_UPD_USER_ID = GXt_char1 ;
      n79TAM04_UPD_USER_ID = false ;
      A99TAM04_UPD_CNT = (long)(O99TAM04_UPD_CNT+1) ;
      n99TAM04_UPD_CNT = false ;
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
         Z103TAM05_CRT_DATETIME = A103TAM05_CRT_DATETIME ;
         Z104TAM05_CRT_USER_ID = A104TAM05_CRT_USER_ID ;
         Z106TAM05_UPD_DATETIME = A106TAM05_UPD_DATETIME ;
         Z107TAM05_UPD_USER_ID = A107TAM05_UPD_USER_ID ;
         Z109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
         Z101TAM05_KNGN_FLG = A101TAM05_KNGN_FLG ;
         Z102TAM05_DEL_FLG = A102TAM05_DEL_FLG ;
         Z105TAM05_CRT_PROG_NM = A105TAM05_CRT_PROG_NM ;
         Z108TAM05_UPD_PROG_NM = A108TAM05_UPD_PROG_NM ;
         Z98TAM04_AUTH_NM = A98TAM04_AUTH_NM ;
         Z601TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
         Z18TAM04_DEL_FLG = A18TAM04_DEL_FLG ;
         Z39TAM04_CRT_DATETIME = A39TAM04_CRT_DATETIME ;
         Z78TAM04_CRT_USER_ID = A78TAM04_CRT_USER_ID ;
         Z40TAM04_CRT_PROG_NM = A40TAM04_CRT_PROG_NM ;
         Z41TAM04_UPD_DATETIME = A41TAM04_UPD_DATETIME ;
         Z79TAM04_UPD_USER_ID = A79TAM04_UPD_USER_ID ;
         Z42TAM04_UPD_PROG_NM = A42TAM04_UPD_PROG_NM ;
         Z99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
      }
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         Z98TAM04_AUTH_NM = A98TAM04_AUTH_NM ;
         Z601TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
         Z18TAM04_DEL_FLG = A18TAM04_DEL_FLG ;
         Z39TAM04_CRT_DATETIME = A39TAM04_CRT_DATETIME ;
         Z78TAM04_CRT_USER_ID = A78TAM04_CRT_USER_ID ;
         Z40TAM04_CRT_PROG_NM = A40TAM04_CRT_PROG_NM ;
         Z41TAM04_UPD_DATETIME = A41TAM04_UPD_DATETIME ;
         Z79TAM04_UPD_USER_ID = A79TAM04_UPD_USER_ID ;
         Z42TAM04_UPD_PROG_NM = A42TAM04_UPD_PROG_NM ;
         Z99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
      }
      if ( GX_JID == -16 )
      {
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z103TAM05_CRT_DATETIME = A103TAM05_CRT_DATETIME ;
         Z104TAM05_CRT_USER_ID = A104TAM05_CRT_USER_ID ;
         Z106TAM05_UPD_DATETIME = A106TAM05_UPD_DATETIME ;
         Z107TAM05_UPD_USER_ID = A107TAM05_UPD_USER_ID ;
         Z109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
         Z101TAM05_KNGN_FLG = A101TAM05_KNGN_FLG ;
         Z102TAM05_DEL_FLG = A102TAM05_DEL_FLG ;
         Z105TAM05_CRT_PROG_NM = A105TAM05_CRT_PROG_NM ;
         Z108TAM05_UPD_PROG_NM = A108TAM05_UPD_PROG_NM ;
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
      }
   }

   public void standaloneNotModal0C9( )
   {
   }

   public void standaloneModal0C9( )
   {
      if ( ( GXutil.strcmp(sMode9, "DSP") == 0 ) || ( GXutil.strcmp(sMode9, "DLT") == 0 ) )
      {
         disableAttributes0C9( ) ;
      }
   }

   public void load0C9( )
   {
      /* Using cursor BC000C15 */
      pr_default.execute(13, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A103TAM05_CRT_DATETIME = BC000C15_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = BC000C15_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = BC000C15_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = BC000C15_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = BC000C15_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = BC000C15_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = BC000C15_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = BC000C15_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = BC000C15_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = BC000C15_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = BC000C15_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = BC000C15_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = BC000C15_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = BC000C15_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = BC000C15_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = BC000C15_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = BC000C15_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = BC000C15_n108TAM05_UPD_PROG_NM[0] ;
         zm0C9( -16) ;
      }
      pr_default.close(13);
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
      /* Using cursor BC000C4 */
      pr_default.execute(2, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError88 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'アプリケーションマスタ'", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
      }
      if ( AnyError88 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A103TAM05_CRT_DATETIME) || (( A103TAM05_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A103TAM05_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A106TAM05_UPD_DATETIME) || (( A106TAM05_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A106TAM05_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0C9( )
   {
      pr_default.close(2);
   }

   public void enableDisable0C9( )
   {
   }

   public void getKey0C9( )
   {
      /* Using cursor BC000C16 */
      pr_default.execute(14, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey0C9( )
   {
      /* Using cursor BC000C3 */
      pr_default.execute(1, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0C9( 16) ;
         RcdFound9 = (short)(1) ;
         initializeNonKey0C9( ) ;
         A103TAM05_CRT_DATETIME = BC000C3_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = BC000C3_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = BC000C3_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = BC000C3_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = BC000C3_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = BC000C3_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = BC000C3_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = BC000C3_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = BC000C3_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = BC000C3_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = BC000C3_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = BC000C3_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = BC000C3_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = BC000C3_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = BC000C3_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = BC000C3_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = BC000C3_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = BC000C3_n108TAM05_UPD_PROG_NM[0] ;
         A88TAM03_APP_ID = BC000C3_A88TAM03_APP_ID[0] ;
         O109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
         n109TAM05_UPD_CNT = false ;
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
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
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0C9( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000C2 */
         pr_default.execute(0, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z103TAM05_CRT_DATETIME.equals( BC000C2_A103TAM05_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z104TAM05_CRT_USER_ID, BC000C2_A104TAM05_CRT_USER_ID[0]) != 0 ) || !( Z106TAM05_UPD_DATETIME.equals( BC000C2_A106TAM05_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z107TAM05_UPD_USER_ID, BC000C2_A107TAM05_UPD_USER_ID[0]) != 0 ) || ( Z109TAM05_UPD_CNT != BC000C2_A109TAM05_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z101TAM05_KNGN_FLG, BC000C2_A101TAM05_KNGN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z102TAM05_DEL_FLG, BC000C2_A102TAM05_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z105TAM05_CRT_PROG_NM, BC000C2_A105TAM05_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z108TAM05_UPD_PROG_NM, BC000C2_A108TAM05_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor BC000C17 */
                  pr_default.execute(15, new Object[] {A17TAM04_AUTH_CD, new Boolean(n103TAM05_CRT_DATETIME), A103TAM05_CRT_DATETIME, new Boolean(n104TAM05_CRT_USER_ID), A104TAM05_CRT_USER_ID, new Boolean(n106TAM05_UPD_DATETIME), A106TAM05_UPD_DATETIME, new Boolean(n107TAM05_UPD_USER_ID), A107TAM05_UPD_USER_ID, new Boolean(n109TAM05_UPD_CNT), new Long(A109TAM05_UPD_CNT), new Boolean(n101TAM05_KNGN_FLG), A101TAM05_KNGN_FLG, new Boolean(n102TAM05_DEL_FLG), A102TAM05_DEL_FLG, new Boolean(n105TAM05_CRT_PROG_NM), A105TAM05_CRT_PROG_NM, new Boolean(n108TAM05_UPD_PROG_NM), A108TAM05_UPD_PROG_NM, A88TAM03_APP_ID});
                  if ( (pr_default.getStatus(15) == 1) )
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
                  /* Using cursor BC000C18 */
                  pr_default.execute(16, new Object[] {new Boolean(n103TAM05_CRT_DATETIME), A103TAM05_CRT_DATETIME, new Boolean(n104TAM05_CRT_USER_ID), A104TAM05_CRT_USER_ID, new Boolean(n106TAM05_UPD_DATETIME), A106TAM05_UPD_DATETIME, new Boolean(n107TAM05_UPD_USER_ID), A107TAM05_UPD_USER_ID, new Boolean(n109TAM05_UPD_CNT), new Long(A109TAM05_UPD_CNT), new Boolean(n101TAM05_KNGN_FLG), A101TAM05_KNGN_FLG, new Boolean(n102TAM05_DEL_FLG), A102TAM05_DEL_FLG, new Boolean(n105TAM05_CRT_PROG_NM), A105TAM05_CRT_PROG_NM, new Boolean(n108TAM05_UPD_PROG_NM), A108TAM05_UPD_PROG_NM, A17TAM04_AUTH_CD, A88TAM03_APP_ID});
                  if ( (pr_default.getStatus(16) == 103) )
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
               /* Using cursor BC000C19 */
               pr_default.execute(17, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
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
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart0C9( )
   {
      /* Using cursor BC000C20 */
      pr_default.execute(18, new Object[] {A17TAM04_AUTH_CD});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A103TAM05_CRT_DATETIME = BC000C20_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = BC000C20_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = BC000C20_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = BC000C20_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = BC000C20_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = BC000C20_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = BC000C20_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = BC000C20_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = BC000C20_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = BC000C20_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = BC000C20_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = BC000C20_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = BC000C20_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = BC000C20_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = BC000C20_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = BC000C20_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = BC000C20_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = BC000C20_n108TAM05_UPD_PROG_NM[0] ;
         A88TAM03_APP_ID = BC000C20_A88TAM03_APP_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0C9( )
   {
      pr_default.readNext(18);
      RcdFound9 = (short)(0) ;
      scanKeyLoad0C9( ) ;
   }

   public void scanKeyLoad0C9( )
   {
      sMode9 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A103TAM05_CRT_DATETIME = BC000C20_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = BC000C20_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = BC000C20_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = BC000C20_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = BC000C20_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = BC000C20_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = BC000C20_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = BC000C20_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = BC000C20_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = BC000C20_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = BC000C20_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = BC000C20_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = BC000C20_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = BC000C20_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = BC000C20_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = BC000C20_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = BC000C20_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = BC000C20_n108TAM05_UPD_PROG_NM[0] ;
         A88TAM03_APP_ID = BC000C20_A88TAM03_APP_ID[0] ;
      }
      Gx_mode = sMode9 ;
   }

   public void scanKeyEnd0C9( )
   {
      pr_default.close(18);
   }

   public void afterConfirm0C9( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C9( )
   {
      /* Before Insert Rules */
      A103TAM05_CRT_DATETIME = GXutil.now( ) ;
      n103TAM05_CRT_DATETIME = false ;
      GXt_char1 = A104TAM05_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A104TAM05_CRT_USER_ID = GXt_char1 ;
      n104TAM05_CRT_USER_ID = false ;
      A106TAM05_UPD_DATETIME = GXutil.now( ) ;
      n106TAM05_UPD_DATETIME = false ;
      GXt_char1 = A107TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A107TAM05_UPD_USER_ID = GXt_char1 ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = (long)(O109TAM05_UPD_CNT+1) ;
      n109TAM05_UPD_CNT = false ;
   }

   public void beforeUpdate0C9( )
   {
      /* Before Update Rules */
      A106TAM05_UPD_DATETIME = GXutil.now( ) ;
      n106TAM05_UPD_DATETIME = false ;
      GXt_char1 = A107TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A107TAM05_UPD_USER_ID = GXt_char1 ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = (long)(O109TAM05_UPD_CNT+1) ;
      n109TAM05_UPD_CNT = false ;
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
      A39TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n39TAM04_CRT_DATETIME = false ;
      A78TAM04_CRT_USER_ID = "" ;
      n78TAM04_CRT_USER_ID = false ;
      A41TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n41TAM04_UPD_DATETIME = false ;
      A79TAM04_UPD_USER_ID = "" ;
      n79TAM04_UPD_USER_ID = false ;
      A99TAM04_UPD_CNT = 0 ;
      n99TAM04_UPD_CNT = false ;
      A98TAM04_AUTH_NM = "" ;
      n98TAM04_AUTH_NM = false ;
      A601TAM04_AUTH_LVL = (byte)(0) ;
      n601TAM04_AUTH_LVL = false ;
      A18TAM04_DEL_FLG = "" ;
      n18TAM04_DEL_FLG = false ;
      A40TAM04_CRT_PROG_NM = "" ;
      n40TAM04_CRT_PROG_NM = false ;
      A42TAM04_UPD_PROG_NM = "" ;
      n42TAM04_UPD_PROG_NM = false ;
      O99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
      n99TAM04_UPD_CNT = false ;
   }

   public void initAll0C3( )
   {
      A17TAM04_AUTH_CD = "" ;
      initializeNonKey0C3( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0C9( )
   {
      A103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n103TAM05_CRT_DATETIME = false ;
      A104TAM05_CRT_USER_ID = "" ;
      n104TAM05_CRT_USER_ID = false ;
      A106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n106TAM05_UPD_DATETIME = false ;
      A107TAM05_UPD_USER_ID = "" ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = 0 ;
      n109TAM05_UPD_CNT = false ;
      A101TAM05_KNGN_FLG = "" ;
      n101TAM05_KNGN_FLG = false ;
      A102TAM05_DEL_FLG = "" ;
      n102TAM05_DEL_FLG = false ;
      A105TAM05_CRT_PROG_NM = "" ;
      n105TAM05_CRT_PROG_NM = false ;
      A108TAM05_UPD_PROG_NM = "" ;
      n108TAM05_UPD_PROG_NM = false ;
      O109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
      n109TAM05_UPD_CNT = false ;
   }

   public void initAll0C9( )
   {
      A88TAM03_APP_ID = "" ;
      initializeNonKey0C9( ) ;
   }

   public void standaloneModalInsert0C9( )
   {
   }

   public void VarsToRow3( SdtTAM04BC_KNGN obj3 )
   {
      obj3.setgxTv_SdtTAM04BC_KNGN_Mode( Gx_mode );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime( A39TAM04_CRT_DATETIME );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id( A78TAM04_CRT_USER_ID );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime( A41TAM04_UPD_DATETIME );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id( A79TAM04_UPD_USER_ID );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt( A99TAM04_UPD_CNT );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm( A98TAM04_AUTH_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl( A601TAM04_AUTH_LVL );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg( A18TAM04_DEL_FLG );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm( A40TAM04_CRT_PROG_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm( A42TAM04_UPD_PROG_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd( A17TAM04_AUTH_CD );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z( Z17TAM04_AUTH_CD );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z( Z98TAM04_AUTH_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z( Z601TAM04_AUTH_LVL );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z( Z18TAM04_DEL_FLG );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z( Z39TAM04_CRT_DATETIME );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z( Z78TAM04_CRT_USER_ID );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z( Z40TAM04_CRT_PROG_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z( Z41TAM04_UPD_DATETIME );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z( Z79TAM04_UPD_USER_ID );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z( Z42TAM04_UPD_PROG_NM );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z( Z99TAM04_UPD_CNT );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N( (byte)((byte)((n98TAM04_AUTH_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N( (byte)((byte)((n601TAM04_AUTH_LVL)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N( (byte)((byte)((n18TAM04_DEL_FLG)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N( (byte)((byte)((n39TAM04_CRT_DATETIME)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N( (byte)((byte)((n78TAM04_CRT_USER_ID)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N( (byte)((byte)((n40TAM04_CRT_PROG_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N( (byte)((byte)((n41TAM04_UPD_DATETIME)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N( (byte)((byte)((n79TAM04_UPD_USER_ID)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N( (byte)((byte)((n42TAM04_UPD_PROG_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N( (byte)((byte)((n99TAM04_UPD_CNT)?1:0)) );
      obj3.setgxTv_SdtTAM04BC_KNGN_Mode( Gx_mode );
   }

   public void RowToVars3( SdtTAM04BC_KNGN obj3 ,
                           int forceLoad )
   {
      Gx_mode = obj3.getgxTv_SdtTAM04BC_KNGN_Mode() ;
      A39TAM04_CRT_DATETIME = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime() ;
      n39TAM04_CRT_DATETIME = false ;
      A78TAM04_CRT_USER_ID = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id() ;
      n78TAM04_CRT_USER_ID = false ;
      A41TAM04_UPD_DATETIME = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime() ;
      n41TAM04_UPD_DATETIME = false ;
      A79TAM04_UPD_USER_ID = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id() ;
      n79TAM04_UPD_USER_ID = false ;
      A99TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt() ;
      n99TAM04_UPD_CNT = false ;
      A98TAM04_AUTH_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm() ;
      n98TAM04_AUTH_NM = false ;
      A601TAM04_AUTH_LVL = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl() ;
      n601TAM04_AUTH_LVL = false ;
      A18TAM04_DEL_FLG = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg() ;
      n18TAM04_DEL_FLG = false ;
      A40TAM04_CRT_PROG_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm() ;
      n40TAM04_CRT_PROG_NM = false ;
      A42TAM04_UPD_PROG_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm() ;
      n42TAM04_UPD_PROG_NM = false ;
      A17TAM04_AUTH_CD = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd() ;
      Z17TAM04_AUTH_CD = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z() ;
      Z98TAM04_AUTH_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z() ;
      Z601TAM04_AUTH_LVL = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z() ;
      Z18TAM04_DEL_FLG = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z() ;
      Z39TAM04_CRT_DATETIME = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z() ;
      Z78TAM04_CRT_USER_ID = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z() ;
      Z40TAM04_CRT_PROG_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z() ;
      Z41TAM04_UPD_DATETIME = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z() ;
      Z79TAM04_UPD_USER_ID = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z() ;
      Z42TAM04_UPD_PROG_NM = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z() ;
      Z99TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z() ;
      O99TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z() ;
      n98TAM04_AUTH_NM = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N()==0)?false:true) ;
      n601TAM04_AUTH_LVL = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N()==0)?false:true) ;
      n18TAM04_DEL_FLG = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N()==0)?false:true) ;
      n39TAM04_CRT_DATETIME = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N()==0)?false:true) ;
      n78TAM04_CRT_USER_ID = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N()==0)?false:true) ;
      n40TAM04_CRT_PROG_NM = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N()==0)?false:true) ;
      n41TAM04_UPD_DATETIME = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N()==0)?false:true) ;
      n79TAM04_UPD_USER_ID = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N()==0)?false:true) ;
      n42TAM04_UPD_PROG_NM = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N()==0)?false:true) ;
      n99TAM04_UPD_CNT = (boolean)((obj3.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj3.getgxTv_SdtTAM04BC_KNGN_Mode() ;
   }

   public void VarsToRow9( SdtTAM04BC_KNGN_TAM05_APPLI obj9 )
   {
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Mode( Gx_mode );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime( A103TAM05_CRT_DATETIME );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id( A104TAM05_CRT_USER_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime( A106TAM05_UPD_DATETIME );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id( A107TAM05_UPD_USER_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt( A109TAM05_UPD_CNT );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg( A101TAM05_KNGN_FLG );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg( A102TAM05_DEL_FLG );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm( A105TAM05_CRT_PROG_NM );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm( A108TAM05_UPD_PROG_NM );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id( A88TAM03_APP_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id_Z( Z88TAM03_APP_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_Z( Z101TAM05_KNGN_FLG );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_Z( Z102TAM05_DEL_FLG );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_Z( Z103TAM05_CRT_DATETIME );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_Z( Z104TAM05_CRT_USER_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_Z( Z105TAM05_CRT_PROG_NM );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_Z( Z106TAM05_UPD_DATETIME );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_Z( Z107TAM05_UPD_USER_ID );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_Z( Z108TAM05_UPD_PROG_NM );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_Z( Z109TAM05_UPD_CNT );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_N( (byte)((byte)((n101TAM05_KNGN_FLG)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_N( (byte)((byte)((n102TAM05_DEL_FLG)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_N( (byte)((byte)((n103TAM05_CRT_DATETIME)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_N( (byte)((byte)((n104TAM05_CRT_USER_ID)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_N( (byte)((byte)((n105TAM05_CRT_PROG_NM)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_N( (byte)((byte)((n106TAM05_UPD_DATETIME)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_N( (byte)((byte)((n107TAM05_UPD_USER_ID)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_N( (byte)((byte)((n108TAM05_UPD_PROG_NM)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_N( (byte)((byte)((n109TAM05_UPD_CNT)?1:0)) );
      obj9.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Modified( nIsMod_9 );
   }

   public void RowToVars9( SdtTAM04BC_KNGN_TAM05_APPLI obj9 ,
                           int forceLoad )
   {
      Gx_mode = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Mode() ;
      A103TAM05_CRT_DATETIME = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime() ;
      n103TAM05_CRT_DATETIME = false ;
      A104TAM05_CRT_USER_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id() ;
      n104TAM05_CRT_USER_ID = false ;
      A106TAM05_UPD_DATETIME = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime() ;
      n106TAM05_UPD_DATETIME = false ;
      A107TAM05_UPD_USER_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id() ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt() ;
      n109TAM05_UPD_CNT = false ;
      A101TAM05_KNGN_FLG = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg() ;
      n101TAM05_KNGN_FLG = false ;
      A102TAM05_DEL_FLG = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg() ;
      n102TAM05_DEL_FLG = false ;
      A105TAM05_CRT_PROG_NM = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm() ;
      n105TAM05_CRT_PROG_NM = false ;
      A108TAM05_UPD_PROG_NM = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm() ;
      n108TAM05_UPD_PROG_NM = false ;
      A88TAM03_APP_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id() ;
      Z88TAM03_APP_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id_Z() ;
      Z101TAM05_KNGN_FLG = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_Z() ;
      Z102TAM05_DEL_FLG = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_Z() ;
      Z103TAM05_CRT_DATETIME = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_Z() ;
      Z104TAM05_CRT_USER_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_Z() ;
      Z105TAM05_CRT_PROG_NM = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_Z() ;
      Z106TAM05_UPD_DATETIME = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_Z() ;
      Z107TAM05_UPD_USER_ID = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_Z() ;
      Z108TAM05_UPD_PROG_NM = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_Z() ;
      Z109TAM05_UPD_CNT = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_Z() ;
      O109TAM05_UPD_CNT = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_Z() ;
      n101TAM05_KNGN_FLG = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_N()==0)?false:true) ;
      n102TAM05_DEL_FLG = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_N()==0)?false:true) ;
      n103TAM05_CRT_DATETIME = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_N()==0)?false:true) ;
      n104TAM05_CRT_USER_ID = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_N()==0)?false:true) ;
      n105TAM05_CRT_PROG_NM = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_N()==0)?false:true) ;
      n106TAM05_UPD_DATETIME = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_N()==0)?false:true) ;
      n107TAM05_UPD_USER_ID = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_N()==0)?false:true) ;
      n108TAM05_UPD_PROG_NM = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_N()==0)?false:true) ;
      n109TAM05_UPD_CNT = (boolean)((obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_N()==0)?false:true) ;
      nIsMod_9 = obj9.getgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A17TAM04_AUTH_CD = (String)getParm(obj,0) ;
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
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         O99TAM04_UPD_CNT = A99TAM04_UPD_CNT ;
         n99TAM04_UPD_CNT = false ;
      }
      zm0C3( -15) ;
      sMode3 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0C3( ) ;
      Gx_mode = sMode3 ;
      addRow0C3( ) ;
      bcTAM04BC_KNGN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().clearCollection();
      if ( RcdFound3 == 1 )
      {
         scanKeyStart0C9( ) ;
         nGXsfl_9_idx = (short)(1) ;
         while ( RcdFound9 != 0 )
         {
            O109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
            n109TAM05_UPD_CNT = false ;
            Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
            Z88TAM03_APP_ID = A88TAM03_APP_ID ;
            zm0C9( -16) ;
            onLoadActions0C9( ) ;
            nRcdExists_9 = (short)(1) ;
            nIsMod_9 = (short)(0) ;
            Z109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
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
      if ( RcdFound3 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 )
         {
            A17TAM04_AUTH_CD = Z17TAM04_AUTH_CD ;
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
            if ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 )
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
         else if ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 )
         {
            A17TAM04_AUTH_CD = Z17TAM04_AUTH_CD ;
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
         if ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 )
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
      Z17TAM04_AUTH_CD = "" ;
      A17TAM04_AUTH_CD = "" ;
      sMode3 = "" ;
      AV11W_BC_FLG = "" ;
      AV12Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV10W_TXT = "" ;
      A98TAM04_AUTH_NM = "" ;
      A18TAM04_DEL_FLG = "" ;
      A39TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A78TAM04_CRT_USER_ID = "" ;
      A40TAM04_CRT_PROG_NM = "" ;
      A41TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A79TAM04_UPD_USER_ID = "" ;
      A42TAM04_UPD_PROG_NM = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_Z = "" ;
      Z39TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z78TAM04_CRT_USER_ID = "" ;
      Z41TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z79TAM04_UPD_USER_ID = "" ;
      Z98TAM04_AUTH_NM = "" ;
      Z18TAM04_DEL_FLG = "" ;
      Z40TAM04_CRT_PROG_NM = "" ;
      Z42TAM04_UPD_PROG_NM = "" ;
      Z88TAM03_APP_ID = "" ;
      A88TAM03_APP_ID = "" ;
      Z101TAM05_KNGN_FLG = "" ;
      A101TAM05_KNGN_FLG = "" ;
      Z102TAM05_DEL_FLG = "" ;
      A102TAM05_DEL_FLG = "" ;
      Z103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z104TAM05_CRT_USER_ID = "" ;
      A104TAM05_CRT_USER_ID = "" ;
      Z105TAM05_CRT_PROG_NM = "" ;
      A105TAM05_CRT_PROG_NM = "" ;
      Z106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z107TAM05_UPD_USER_ID = "" ;
      A107TAM05_UPD_USER_ID = "" ;
      Z108TAM05_UPD_PROG_NM = "" ;
      A108TAM05_UPD_PROG_NM = "" ;
      BC000C7_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C7_A39TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C7_n39TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000C7_A78TAM04_CRT_USER_ID = new String[] {""} ;
      BC000C7_n78TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000C7_A41TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C7_n41TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000C7_A79TAM04_UPD_USER_ID = new String[] {""} ;
      BC000C7_n79TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000C7_A99TAM04_UPD_CNT = new long[1] ;
      BC000C7_n99TAM04_UPD_CNT = new boolean[] {false} ;
      BC000C7_A98TAM04_AUTH_NM = new String[] {""} ;
      BC000C7_n98TAM04_AUTH_NM = new boolean[] {false} ;
      BC000C7_A601TAM04_AUTH_LVL = new byte[1] ;
      BC000C7_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000C7_A18TAM04_DEL_FLG = new String[] {""} ;
      BC000C7_n18TAM04_DEL_FLG = new boolean[] {false} ;
      BC000C7_A40TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000C7_n40TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000C7_A42TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000C7_n42TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC000C8_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C6_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C6_A39TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C6_n39TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000C6_A78TAM04_CRT_USER_ID = new String[] {""} ;
      BC000C6_n78TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000C6_A41TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C6_n41TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000C6_A79TAM04_UPD_USER_ID = new String[] {""} ;
      BC000C6_n79TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000C6_A99TAM04_UPD_CNT = new long[1] ;
      BC000C6_n99TAM04_UPD_CNT = new boolean[] {false} ;
      BC000C6_A98TAM04_AUTH_NM = new String[] {""} ;
      BC000C6_n98TAM04_AUTH_NM = new boolean[] {false} ;
      BC000C6_A601TAM04_AUTH_LVL = new byte[1] ;
      BC000C6_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000C6_A18TAM04_DEL_FLG = new String[] {""} ;
      BC000C6_n18TAM04_DEL_FLG = new boolean[] {false} ;
      BC000C6_A40TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000C6_n40TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000C6_A42TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000C6_n42TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC000C5_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C5_A39TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C5_n39TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000C5_A78TAM04_CRT_USER_ID = new String[] {""} ;
      BC000C5_n78TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000C5_A41TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C5_n41TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000C5_A79TAM04_UPD_USER_ID = new String[] {""} ;
      BC000C5_n79TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000C5_A99TAM04_UPD_CNT = new long[1] ;
      BC000C5_n99TAM04_UPD_CNT = new boolean[] {false} ;
      BC000C5_A98TAM04_AUTH_NM = new String[] {""} ;
      BC000C5_n98TAM04_AUTH_NM = new boolean[] {false} ;
      BC000C5_A601TAM04_AUTH_LVL = new byte[1] ;
      BC000C5_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000C5_A18TAM04_DEL_FLG = new String[] {""} ;
      BC000C5_n18TAM04_DEL_FLG = new boolean[] {false} ;
      BC000C5_A40TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000C5_n40TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000C5_A42TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000C5_n42TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC000C12_A530TBM07_AUTH_CD = new String[] {""} ;
      BC000C13_A8TAM07_USER_ID = new String[] {""} ;
      BC000C14_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C14_A39TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C14_n39TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000C14_A78TAM04_CRT_USER_ID = new String[] {""} ;
      BC000C14_n78TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000C14_A41TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C14_n41TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000C14_A79TAM04_UPD_USER_ID = new String[] {""} ;
      BC000C14_n79TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000C14_A99TAM04_UPD_CNT = new long[1] ;
      BC000C14_n99TAM04_UPD_CNT = new boolean[] {false} ;
      BC000C14_A98TAM04_AUTH_NM = new String[] {""} ;
      BC000C14_n98TAM04_AUTH_NM = new boolean[] {false} ;
      BC000C14_A601TAM04_AUTH_LVL = new byte[1] ;
      BC000C14_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000C14_A18TAM04_DEL_FLG = new String[] {""} ;
      BC000C14_n18TAM04_DEL_FLG = new boolean[] {false} ;
      BC000C14_A40TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000C14_n40TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000C14_A42TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000C14_n42TAM04_UPD_PROG_NM = new boolean[] {false} ;
      sMode9 = "" ;
      BC000C15_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C15_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C15_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000C15_A104TAM05_CRT_USER_ID = new String[] {""} ;
      BC000C15_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000C15_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C15_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000C15_A107TAM05_UPD_USER_ID = new String[] {""} ;
      BC000C15_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000C15_A109TAM05_UPD_CNT = new long[1] ;
      BC000C15_n109TAM05_UPD_CNT = new boolean[] {false} ;
      BC000C15_A101TAM05_KNGN_FLG = new String[] {""} ;
      BC000C15_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000C15_A102TAM05_DEL_FLG = new String[] {""} ;
      BC000C15_n102TAM05_DEL_FLG = new boolean[] {false} ;
      BC000C15_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000C15_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000C15_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000C15_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000C15_A88TAM03_APP_ID = new String[] {""} ;
      BC000C4_A88TAM03_APP_ID = new String[] {""} ;
      BC000C16_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C16_A88TAM03_APP_ID = new String[] {""} ;
      BC000C3_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C3_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C3_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000C3_A104TAM05_CRT_USER_ID = new String[] {""} ;
      BC000C3_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000C3_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C3_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000C3_A107TAM05_UPD_USER_ID = new String[] {""} ;
      BC000C3_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000C3_A109TAM05_UPD_CNT = new long[1] ;
      BC000C3_n109TAM05_UPD_CNT = new boolean[] {false} ;
      BC000C3_A101TAM05_KNGN_FLG = new String[] {""} ;
      BC000C3_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000C3_A102TAM05_DEL_FLG = new String[] {""} ;
      BC000C3_n102TAM05_DEL_FLG = new boolean[] {false} ;
      BC000C3_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000C3_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000C3_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000C3_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000C3_A88TAM03_APP_ID = new String[] {""} ;
      BC000C2_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C2_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C2_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000C2_A104TAM05_CRT_USER_ID = new String[] {""} ;
      BC000C2_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000C2_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C2_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000C2_A107TAM05_UPD_USER_ID = new String[] {""} ;
      BC000C2_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000C2_A109TAM05_UPD_CNT = new long[1] ;
      BC000C2_n109TAM05_UPD_CNT = new boolean[] {false} ;
      BC000C2_A101TAM05_KNGN_FLG = new String[] {""} ;
      BC000C2_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000C2_A102TAM05_DEL_FLG = new String[] {""} ;
      BC000C2_n102TAM05_DEL_FLG = new boolean[] {false} ;
      BC000C2_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000C2_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000C2_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000C2_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000C2_A88TAM03_APP_ID = new String[] {""} ;
      BC000C20_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000C20_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C20_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000C20_A104TAM05_CRT_USER_ID = new String[] {""} ;
      BC000C20_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000C20_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000C20_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000C20_A107TAM05_UPD_USER_ID = new String[] {""} ;
      BC000C20_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000C20_A109TAM05_UPD_CNT = new long[1] ;
      BC000C20_n109TAM05_UPD_CNT = new boolean[] {false} ;
      BC000C20_A101TAM05_KNGN_FLG = new String[] {""} ;
      BC000C20_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000C20_A102TAM05_DEL_FLG = new String[] {""} ;
      BC000C20_n102TAM05_DEL_FLG = new boolean[] {false} ;
      BC000C20_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000C20_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000C20_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000C20_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000C20_A88TAM03_APP_ID = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam04bc_kngn_bc__default(),
         new Object[] {
             new Object[] {
            BC000C2_A17TAM04_AUTH_CD, BC000C2_A103TAM05_CRT_DATETIME, BC000C2_n103TAM05_CRT_DATETIME, BC000C2_A104TAM05_CRT_USER_ID, BC000C2_n104TAM05_CRT_USER_ID, BC000C2_A106TAM05_UPD_DATETIME, BC000C2_n106TAM05_UPD_DATETIME, BC000C2_A107TAM05_UPD_USER_ID, BC000C2_n107TAM05_UPD_USER_ID, BC000C2_A109TAM05_UPD_CNT,
            BC000C2_n109TAM05_UPD_CNT, BC000C2_A101TAM05_KNGN_FLG, BC000C2_n101TAM05_KNGN_FLG, BC000C2_A102TAM05_DEL_FLG, BC000C2_n102TAM05_DEL_FLG, BC000C2_A105TAM05_CRT_PROG_NM, BC000C2_n105TAM05_CRT_PROG_NM, BC000C2_A108TAM05_UPD_PROG_NM, BC000C2_n108TAM05_UPD_PROG_NM, BC000C2_A88TAM03_APP_ID
            }
            , new Object[] {
            BC000C3_A17TAM04_AUTH_CD, BC000C3_A103TAM05_CRT_DATETIME, BC000C3_n103TAM05_CRT_DATETIME, BC000C3_A104TAM05_CRT_USER_ID, BC000C3_n104TAM05_CRT_USER_ID, BC000C3_A106TAM05_UPD_DATETIME, BC000C3_n106TAM05_UPD_DATETIME, BC000C3_A107TAM05_UPD_USER_ID, BC000C3_n107TAM05_UPD_USER_ID, BC000C3_A109TAM05_UPD_CNT,
            BC000C3_n109TAM05_UPD_CNT, BC000C3_A101TAM05_KNGN_FLG, BC000C3_n101TAM05_KNGN_FLG, BC000C3_A102TAM05_DEL_FLG, BC000C3_n102TAM05_DEL_FLG, BC000C3_A105TAM05_CRT_PROG_NM, BC000C3_n105TAM05_CRT_PROG_NM, BC000C3_A108TAM05_UPD_PROG_NM, BC000C3_n108TAM05_UPD_PROG_NM, BC000C3_A88TAM03_APP_ID
            }
            , new Object[] {
            BC000C4_A88TAM03_APP_ID
            }
            , new Object[] {
            BC000C5_A17TAM04_AUTH_CD, BC000C5_A39TAM04_CRT_DATETIME, BC000C5_n39TAM04_CRT_DATETIME, BC000C5_A78TAM04_CRT_USER_ID, BC000C5_n78TAM04_CRT_USER_ID, BC000C5_A41TAM04_UPD_DATETIME, BC000C5_n41TAM04_UPD_DATETIME, BC000C5_A79TAM04_UPD_USER_ID, BC000C5_n79TAM04_UPD_USER_ID, BC000C5_A99TAM04_UPD_CNT,
            BC000C5_n99TAM04_UPD_CNT, BC000C5_A98TAM04_AUTH_NM, BC000C5_n98TAM04_AUTH_NM, BC000C5_A601TAM04_AUTH_LVL, BC000C5_n601TAM04_AUTH_LVL, BC000C5_A18TAM04_DEL_FLG, BC000C5_n18TAM04_DEL_FLG, BC000C5_A40TAM04_CRT_PROG_NM, BC000C5_n40TAM04_CRT_PROG_NM, BC000C5_A42TAM04_UPD_PROG_NM,
            BC000C5_n42TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C6_A17TAM04_AUTH_CD, BC000C6_A39TAM04_CRT_DATETIME, BC000C6_n39TAM04_CRT_DATETIME, BC000C6_A78TAM04_CRT_USER_ID, BC000C6_n78TAM04_CRT_USER_ID, BC000C6_A41TAM04_UPD_DATETIME, BC000C6_n41TAM04_UPD_DATETIME, BC000C6_A79TAM04_UPD_USER_ID, BC000C6_n79TAM04_UPD_USER_ID, BC000C6_A99TAM04_UPD_CNT,
            BC000C6_n99TAM04_UPD_CNT, BC000C6_A98TAM04_AUTH_NM, BC000C6_n98TAM04_AUTH_NM, BC000C6_A601TAM04_AUTH_LVL, BC000C6_n601TAM04_AUTH_LVL, BC000C6_A18TAM04_DEL_FLG, BC000C6_n18TAM04_DEL_FLG, BC000C6_A40TAM04_CRT_PROG_NM, BC000C6_n40TAM04_CRT_PROG_NM, BC000C6_A42TAM04_UPD_PROG_NM,
            BC000C6_n42TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C7_A17TAM04_AUTH_CD, BC000C7_A39TAM04_CRT_DATETIME, BC000C7_n39TAM04_CRT_DATETIME, BC000C7_A78TAM04_CRT_USER_ID, BC000C7_n78TAM04_CRT_USER_ID, BC000C7_A41TAM04_UPD_DATETIME, BC000C7_n41TAM04_UPD_DATETIME, BC000C7_A79TAM04_UPD_USER_ID, BC000C7_n79TAM04_UPD_USER_ID, BC000C7_A99TAM04_UPD_CNT,
            BC000C7_n99TAM04_UPD_CNT, BC000C7_A98TAM04_AUTH_NM, BC000C7_n98TAM04_AUTH_NM, BC000C7_A601TAM04_AUTH_LVL, BC000C7_n601TAM04_AUTH_LVL, BC000C7_A18TAM04_DEL_FLG, BC000C7_n18TAM04_DEL_FLG, BC000C7_A40TAM04_CRT_PROG_NM, BC000C7_n40TAM04_CRT_PROG_NM, BC000C7_A42TAM04_UPD_PROG_NM,
            BC000C7_n42TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C8_A17TAM04_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000C12_A530TBM07_AUTH_CD
            }
            , new Object[] {
            BC000C13_A8TAM07_USER_ID
            }
            , new Object[] {
            BC000C14_A17TAM04_AUTH_CD, BC000C14_A39TAM04_CRT_DATETIME, BC000C14_n39TAM04_CRT_DATETIME, BC000C14_A78TAM04_CRT_USER_ID, BC000C14_n78TAM04_CRT_USER_ID, BC000C14_A41TAM04_UPD_DATETIME, BC000C14_n41TAM04_UPD_DATETIME, BC000C14_A79TAM04_UPD_USER_ID, BC000C14_n79TAM04_UPD_USER_ID, BC000C14_A99TAM04_UPD_CNT,
            BC000C14_n99TAM04_UPD_CNT, BC000C14_A98TAM04_AUTH_NM, BC000C14_n98TAM04_AUTH_NM, BC000C14_A601TAM04_AUTH_LVL, BC000C14_n601TAM04_AUTH_LVL, BC000C14_A18TAM04_DEL_FLG, BC000C14_n18TAM04_DEL_FLG, BC000C14_A40TAM04_CRT_PROG_NM, BC000C14_n40TAM04_CRT_PROG_NM, BC000C14_A42TAM04_UPD_PROG_NM,
            BC000C14_n42TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC000C15_A17TAM04_AUTH_CD, BC000C15_A103TAM05_CRT_DATETIME, BC000C15_n103TAM05_CRT_DATETIME, BC000C15_A104TAM05_CRT_USER_ID, BC000C15_n104TAM05_CRT_USER_ID, BC000C15_A106TAM05_UPD_DATETIME, BC000C15_n106TAM05_UPD_DATETIME, BC000C15_A107TAM05_UPD_USER_ID, BC000C15_n107TAM05_UPD_USER_ID, BC000C15_A109TAM05_UPD_CNT,
            BC000C15_n109TAM05_UPD_CNT, BC000C15_A101TAM05_KNGN_FLG, BC000C15_n101TAM05_KNGN_FLG, BC000C15_A102TAM05_DEL_FLG, BC000C15_n102TAM05_DEL_FLG, BC000C15_A105TAM05_CRT_PROG_NM, BC000C15_n105TAM05_CRT_PROG_NM, BC000C15_A108TAM05_UPD_PROG_NM, BC000C15_n108TAM05_UPD_PROG_NM, BC000C15_A88TAM03_APP_ID
            }
            , new Object[] {
            BC000C16_A17TAM04_AUTH_CD, BC000C16_A88TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000C20_A17TAM04_AUTH_CD, BC000C20_A103TAM05_CRT_DATETIME, BC000C20_n103TAM05_CRT_DATETIME, BC000C20_A104TAM05_CRT_USER_ID, BC000C20_n104TAM05_CRT_USER_ID, BC000C20_A106TAM05_UPD_DATETIME, BC000C20_n106TAM05_UPD_DATETIME, BC000C20_A107TAM05_UPD_USER_ID, BC000C20_n107TAM05_UPD_USER_ID, BC000C20_A109TAM05_UPD_CNT,
            BC000C20_n109TAM05_UPD_CNT, BC000C20_A101TAM05_KNGN_FLG, BC000C20_n101TAM05_KNGN_FLG, BC000C20_A102TAM05_DEL_FLG, BC000C20_n102TAM05_DEL_FLG, BC000C20_A105TAM05_CRT_PROG_NM, BC000C20_n105TAM05_CRT_PROG_NM, BC000C20_A108TAM05_UPD_PROG_NM, BC000C20_n108TAM05_UPD_PROG_NM, BC000C20_A88TAM03_APP_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV12Pgmname = "TAM04BC_KNGN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110C2 */
      e110C2 ();
   }

   private byte nKeyPressed ;
   private byte A601TAM04_AUTH_LVL ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_N ;
   private byte gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_N ;
   private byte Z601TAM04_AUTH_LVL ;
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
   private int AnyError88 ;
   private int GXActiveErrHndl ;
   private long A99TAM04_UPD_CNT ;
   private long gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z ;
   private long gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_cnt_Z ;
   private long Z99TAM04_UPD_CNT ;
   private long Z109TAM05_UPD_CNT ;
   private long A109TAM05_UPD_CNT ;
   private long O99TAM04_UPD_CNT ;
   private long O109TAM05_UPD_CNT ;
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
   private java.util.Date A39TAM04_CRT_DATETIME ;
   private java.util.Date A41TAM04_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z ;
   private java.util.Date gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_datetime_Z ;
   private java.util.Date Z39TAM04_CRT_DATETIME ;
   private java.util.Date Z41TAM04_UPD_DATETIME ;
   private java.util.Date Z103TAM05_CRT_DATETIME ;
   private java.util.Date A103TAM05_CRT_DATETIME ;
   private java.util.Date Z106TAM05_UPD_DATETIME ;
   private java.util.Date A106TAM05_UPD_DATETIME ;
   private boolean n39TAM04_CRT_DATETIME ;
   private boolean n78TAM04_CRT_USER_ID ;
   private boolean n41TAM04_UPD_DATETIME ;
   private boolean n79TAM04_UPD_USER_ID ;
   private boolean n99TAM04_UPD_CNT ;
   private boolean n98TAM04_AUTH_NM ;
   private boolean n601TAM04_AUTH_LVL ;
   private boolean n18TAM04_DEL_FLG ;
   private boolean n40TAM04_CRT_PROG_NM ;
   private boolean n42TAM04_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private boolean n103TAM05_CRT_DATETIME ;
   private boolean n104TAM05_CRT_USER_ID ;
   private boolean n106TAM05_UPD_DATETIME ;
   private boolean n107TAM05_UPD_USER_ID ;
   private boolean n109TAM05_UPD_CNT ;
   private boolean n101TAM05_KNGN_FLG ;
   private boolean n102TAM05_DEL_FLG ;
   private boolean n105TAM05_CRT_PROG_NM ;
   private boolean n108TAM05_UPD_PROG_NM ;
   private String Z17TAM04_AUTH_CD ;
   private String A17TAM04_AUTH_CD ;
   private String AV11W_BC_FLG ;
   private String AV10W_TXT ;
   private String A98TAM04_AUTH_NM ;
   private String A18TAM04_DEL_FLG ;
   private String A78TAM04_CRT_USER_ID ;
   private String A40TAM04_CRT_PROG_NM ;
   private String A79TAM04_UPD_USER_ID ;
   private String A42TAM04_UPD_PROG_NM ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z ;
   private String gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id_Z ;
   private String gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg_Z ;
   private String gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg_Z ;
   private String gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_user_id_Z ;
   private String gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm_Z ;
   private String gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_user_id_Z ;
   private String gxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm_Z ;
   private String Z78TAM04_CRT_USER_ID ;
   private String Z79TAM04_UPD_USER_ID ;
   private String Z98TAM04_AUTH_NM ;
   private String Z18TAM04_DEL_FLG ;
   private String Z40TAM04_CRT_PROG_NM ;
   private String Z42TAM04_UPD_PROG_NM ;
   private String Z88TAM03_APP_ID ;
   private String A88TAM03_APP_ID ;
   private String Z101TAM05_KNGN_FLG ;
   private String A101TAM05_KNGN_FLG ;
   private String Z102TAM05_DEL_FLG ;
   private String A102TAM05_DEL_FLG ;
   private String Z104TAM05_CRT_USER_ID ;
   private String A104TAM05_CRT_USER_ID ;
   private String Z105TAM05_CRT_PROG_NM ;
   private String A105TAM05_CRT_PROG_NM ;
   private String Z107TAM05_UPD_USER_ID ;
   private String A107TAM05_UPD_USER_ID ;
   private String Z108TAM05_UPD_PROG_NM ;
   private String A108TAM05_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAM04BC_KNGN bcTAM04BC_KNGN ;
   private IDataStoreProvider pr_default ;
   private String[] BC000C7_A17TAM04_AUTH_CD ;
   private java.util.Date[] BC000C7_A39TAM04_CRT_DATETIME ;
   private boolean[] BC000C7_n39TAM04_CRT_DATETIME ;
   private String[] BC000C7_A78TAM04_CRT_USER_ID ;
   private boolean[] BC000C7_n78TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C7_A41TAM04_UPD_DATETIME ;
   private boolean[] BC000C7_n41TAM04_UPD_DATETIME ;
   private String[] BC000C7_A79TAM04_UPD_USER_ID ;
   private boolean[] BC000C7_n79TAM04_UPD_USER_ID ;
   private long[] BC000C7_A99TAM04_UPD_CNT ;
   private boolean[] BC000C7_n99TAM04_UPD_CNT ;
   private String[] BC000C7_A98TAM04_AUTH_NM ;
   private boolean[] BC000C7_n98TAM04_AUTH_NM ;
   private byte[] BC000C7_A601TAM04_AUTH_LVL ;
   private boolean[] BC000C7_n601TAM04_AUTH_LVL ;
   private String[] BC000C7_A18TAM04_DEL_FLG ;
   private boolean[] BC000C7_n18TAM04_DEL_FLG ;
   private String[] BC000C7_A40TAM04_CRT_PROG_NM ;
   private boolean[] BC000C7_n40TAM04_CRT_PROG_NM ;
   private String[] BC000C7_A42TAM04_UPD_PROG_NM ;
   private boolean[] BC000C7_n42TAM04_UPD_PROG_NM ;
   private String[] BC000C8_A17TAM04_AUTH_CD ;
   private String[] BC000C6_A17TAM04_AUTH_CD ;
   private java.util.Date[] BC000C6_A39TAM04_CRT_DATETIME ;
   private boolean[] BC000C6_n39TAM04_CRT_DATETIME ;
   private String[] BC000C6_A78TAM04_CRT_USER_ID ;
   private boolean[] BC000C6_n78TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C6_A41TAM04_UPD_DATETIME ;
   private boolean[] BC000C6_n41TAM04_UPD_DATETIME ;
   private String[] BC000C6_A79TAM04_UPD_USER_ID ;
   private boolean[] BC000C6_n79TAM04_UPD_USER_ID ;
   private long[] BC000C6_A99TAM04_UPD_CNT ;
   private boolean[] BC000C6_n99TAM04_UPD_CNT ;
   private String[] BC000C6_A98TAM04_AUTH_NM ;
   private boolean[] BC000C6_n98TAM04_AUTH_NM ;
   private byte[] BC000C6_A601TAM04_AUTH_LVL ;
   private boolean[] BC000C6_n601TAM04_AUTH_LVL ;
   private String[] BC000C6_A18TAM04_DEL_FLG ;
   private boolean[] BC000C6_n18TAM04_DEL_FLG ;
   private String[] BC000C6_A40TAM04_CRT_PROG_NM ;
   private boolean[] BC000C6_n40TAM04_CRT_PROG_NM ;
   private String[] BC000C6_A42TAM04_UPD_PROG_NM ;
   private boolean[] BC000C6_n42TAM04_UPD_PROG_NM ;
   private String[] BC000C5_A17TAM04_AUTH_CD ;
   private java.util.Date[] BC000C5_A39TAM04_CRT_DATETIME ;
   private boolean[] BC000C5_n39TAM04_CRT_DATETIME ;
   private String[] BC000C5_A78TAM04_CRT_USER_ID ;
   private boolean[] BC000C5_n78TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C5_A41TAM04_UPD_DATETIME ;
   private boolean[] BC000C5_n41TAM04_UPD_DATETIME ;
   private String[] BC000C5_A79TAM04_UPD_USER_ID ;
   private boolean[] BC000C5_n79TAM04_UPD_USER_ID ;
   private long[] BC000C5_A99TAM04_UPD_CNT ;
   private boolean[] BC000C5_n99TAM04_UPD_CNT ;
   private String[] BC000C5_A98TAM04_AUTH_NM ;
   private boolean[] BC000C5_n98TAM04_AUTH_NM ;
   private byte[] BC000C5_A601TAM04_AUTH_LVL ;
   private boolean[] BC000C5_n601TAM04_AUTH_LVL ;
   private String[] BC000C5_A18TAM04_DEL_FLG ;
   private boolean[] BC000C5_n18TAM04_DEL_FLG ;
   private String[] BC000C5_A40TAM04_CRT_PROG_NM ;
   private boolean[] BC000C5_n40TAM04_CRT_PROG_NM ;
   private String[] BC000C5_A42TAM04_UPD_PROG_NM ;
   private boolean[] BC000C5_n42TAM04_UPD_PROG_NM ;
   private String[] BC000C12_A530TBM07_AUTH_CD ;
   private String[] BC000C13_A8TAM07_USER_ID ;
   private String[] BC000C14_A17TAM04_AUTH_CD ;
   private java.util.Date[] BC000C14_A39TAM04_CRT_DATETIME ;
   private boolean[] BC000C14_n39TAM04_CRT_DATETIME ;
   private String[] BC000C14_A78TAM04_CRT_USER_ID ;
   private boolean[] BC000C14_n78TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000C14_A41TAM04_UPD_DATETIME ;
   private boolean[] BC000C14_n41TAM04_UPD_DATETIME ;
   private String[] BC000C14_A79TAM04_UPD_USER_ID ;
   private boolean[] BC000C14_n79TAM04_UPD_USER_ID ;
   private long[] BC000C14_A99TAM04_UPD_CNT ;
   private boolean[] BC000C14_n99TAM04_UPD_CNT ;
   private String[] BC000C14_A98TAM04_AUTH_NM ;
   private boolean[] BC000C14_n98TAM04_AUTH_NM ;
   private byte[] BC000C14_A601TAM04_AUTH_LVL ;
   private boolean[] BC000C14_n601TAM04_AUTH_LVL ;
   private String[] BC000C14_A18TAM04_DEL_FLG ;
   private boolean[] BC000C14_n18TAM04_DEL_FLG ;
   private String[] BC000C14_A40TAM04_CRT_PROG_NM ;
   private boolean[] BC000C14_n40TAM04_CRT_PROG_NM ;
   private String[] BC000C14_A42TAM04_UPD_PROG_NM ;
   private boolean[] BC000C14_n42TAM04_UPD_PROG_NM ;
   private String[] BC000C15_A17TAM04_AUTH_CD ;
   private java.util.Date[] BC000C15_A103TAM05_CRT_DATETIME ;
   private boolean[] BC000C15_n103TAM05_CRT_DATETIME ;
   private String[] BC000C15_A104TAM05_CRT_USER_ID ;
   private boolean[] BC000C15_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C15_A106TAM05_UPD_DATETIME ;
   private boolean[] BC000C15_n106TAM05_UPD_DATETIME ;
   private String[] BC000C15_A107TAM05_UPD_USER_ID ;
   private boolean[] BC000C15_n107TAM05_UPD_USER_ID ;
   private long[] BC000C15_A109TAM05_UPD_CNT ;
   private boolean[] BC000C15_n109TAM05_UPD_CNT ;
   private String[] BC000C15_A101TAM05_KNGN_FLG ;
   private boolean[] BC000C15_n101TAM05_KNGN_FLG ;
   private String[] BC000C15_A102TAM05_DEL_FLG ;
   private boolean[] BC000C15_n102TAM05_DEL_FLG ;
   private String[] BC000C15_A105TAM05_CRT_PROG_NM ;
   private boolean[] BC000C15_n105TAM05_CRT_PROG_NM ;
   private String[] BC000C15_A108TAM05_UPD_PROG_NM ;
   private boolean[] BC000C15_n108TAM05_UPD_PROG_NM ;
   private String[] BC000C15_A88TAM03_APP_ID ;
   private String[] BC000C4_A88TAM03_APP_ID ;
   private String[] BC000C16_A17TAM04_AUTH_CD ;
   private String[] BC000C16_A88TAM03_APP_ID ;
   private String[] BC000C3_A17TAM04_AUTH_CD ;
   private java.util.Date[] BC000C3_A103TAM05_CRT_DATETIME ;
   private boolean[] BC000C3_n103TAM05_CRT_DATETIME ;
   private String[] BC000C3_A104TAM05_CRT_USER_ID ;
   private boolean[] BC000C3_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C3_A106TAM05_UPD_DATETIME ;
   private boolean[] BC000C3_n106TAM05_UPD_DATETIME ;
   private String[] BC000C3_A107TAM05_UPD_USER_ID ;
   private boolean[] BC000C3_n107TAM05_UPD_USER_ID ;
   private long[] BC000C3_A109TAM05_UPD_CNT ;
   private boolean[] BC000C3_n109TAM05_UPD_CNT ;
   private String[] BC000C3_A101TAM05_KNGN_FLG ;
   private boolean[] BC000C3_n101TAM05_KNGN_FLG ;
   private String[] BC000C3_A102TAM05_DEL_FLG ;
   private boolean[] BC000C3_n102TAM05_DEL_FLG ;
   private String[] BC000C3_A105TAM05_CRT_PROG_NM ;
   private boolean[] BC000C3_n105TAM05_CRT_PROG_NM ;
   private String[] BC000C3_A108TAM05_UPD_PROG_NM ;
   private boolean[] BC000C3_n108TAM05_UPD_PROG_NM ;
   private String[] BC000C3_A88TAM03_APP_ID ;
   private String[] BC000C2_A17TAM04_AUTH_CD ;
   private java.util.Date[] BC000C2_A103TAM05_CRT_DATETIME ;
   private boolean[] BC000C2_n103TAM05_CRT_DATETIME ;
   private String[] BC000C2_A104TAM05_CRT_USER_ID ;
   private boolean[] BC000C2_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C2_A106TAM05_UPD_DATETIME ;
   private boolean[] BC000C2_n106TAM05_UPD_DATETIME ;
   private String[] BC000C2_A107TAM05_UPD_USER_ID ;
   private boolean[] BC000C2_n107TAM05_UPD_USER_ID ;
   private long[] BC000C2_A109TAM05_UPD_CNT ;
   private boolean[] BC000C2_n109TAM05_UPD_CNT ;
   private String[] BC000C2_A101TAM05_KNGN_FLG ;
   private boolean[] BC000C2_n101TAM05_KNGN_FLG ;
   private String[] BC000C2_A102TAM05_DEL_FLG ;
   private boolean[] BC000C2_n102TAM05_DEL_FLG ;
   private String[] BC000C2_A105TAM05_CRT_PROG_NM ;
   private boolean[] BC000C2_n105TAM05_CRT_PROG_NM ;
   private String[] BC000C2_A108TAM05_UPD_PROG_NM ;
   private boolean[] BC000C2_n108TAM05_UPD_PROG_NM ;
   private String[] BC000C2_A88TAM03_APP_ID ;
   private String[] BC000C20_A17TAM04_AUTH_CD ;
   private java.util.Date[] BC000C20_A103TAM05_CRT_DATETIME ;
   private boolean[] BC000C20_n103TAM05_CRT_DATETIME ;
   private String[] BC000C20_A104TAM05_CRT_USER_ID ;
   private boolean[] BC000C20_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000C20_A106TAM05_UPD_DATETIME ;
   private boolean[] BC000C20_n106TAM05_UPD_DATETIME ;
   private String[] BC000C20_A107TAM05_UPD_USER_ID ;
   private boolean[] BC000C20_n107TAM05_UPD_USER_ID ;
   private long[] BC000C20_A109TAM05_UPD_CNT ;
   private boolean[] BC000C20_n109TAM05_UPD_CNT ;
   private String[] BC000C20_A101TAM05_KNGN_FLG ;
   private boolean[] BC000C20_n101TAM05_KNGN_FLG ;
   private String[] BC000C20_A102TAM05_DEL_FLG ;
   private boolean[] BC000C20_n102TAM05_DEL_FLG ;
   private String[] BC000C20_A105TAM05_CRT_PROG_NM ;
   private boolean[] BC000C20_n105TAM05_CRT_PROG_NM ;
   private String[] BC000C20_A108TAM05_UPD_PROG_NM ;
   private boolean[] BC000C20_n108TAM05_UPD_PROG_NM ;
   private String[] BC000C20_A88TAM03_APP_ID ;
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
         ,new ForEachCursor("BC000C7", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000C8", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000C9", "INSERT INTO `TAM04_KNGN` (`TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000C10", "UPDATE `TAM04_KNGN` SET `TAM04_CRT_DATETIME`=?, `TAM04_CRT_USER_ID`=?, `TAM04_UPD_DATETIME`=?, `TAM04_UPD_USER_ID`=?, `TAM04_UPD_CNT`=?, `TAM04_AUTH_NM`=?, `TAM04_AUTH_LVL`=?, `TAM04_DEL_FLG`=?, `TAM04_CRT_PROG_NM`=?, `TAM04_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000C11", "DELETE FROM `TAM04_KNGN`  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000C12", "SELECT `TBM07_AUTH_CD` FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000C13", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000C14", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000C15", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? and `TAM03_APP_ID` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("BC000C16", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000C17", "INSERT INTO `TAM05_APPLI_KNGN` (`TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000C18", "UPDATE `TAM05_APPLI_KNGN` SET `TAM05_CRT_DATETIME`=?, `TAM05_CRT_USER_ID`=?, `TAM05_UPD_DATETIME`=?, `TAM05_UPD_USER_ID`=?, `TAM05_UPD_CNT`=?, `TAM05_KNGN_FLG`=?, `TAM05_DEL_FLG`=?, `TAM05_CRT_PROG_NM`=?, `TAM05_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000C19", "DELETE FROM `TAM05_APPLI_KNGN`  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000C20", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,11,0,false )
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
               break;
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
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
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
               break;
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
               break;
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
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 12 :
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
               break;
            case 13 :
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
               break;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
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
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 7 :
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
               break;
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
               break;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 15 :
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
               break;
            case 16 :
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
               break;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
      }
   }

}

