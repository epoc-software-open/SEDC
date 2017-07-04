/*
               File: tam08_site_bc
        Description: 施設マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:15.49
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam08_site_bc extends GXWebPanel implements IGxSilentTrn
{
   public tam08_site_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam08_site_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam08_site_bc.class ));
   }

   public tam08_site_bc( int remoteHandle ,
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
         /* Execute user event: e120D2 */
         e120D2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z132TAM08_SITE_ID = A132TAM08_SITE_ID ;
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

   public void confirm_0D0( )
   {
      beforeValidate0D12( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0D12( ) ;
         }
         else
         {
            checkExtendedTable0D12( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0D12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110D2( )
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

   public void e120D2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "施設ID:" + A132TAM08_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A133TAM08_SITE_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A134TAM08_SITE_SNM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A594TAM08_OUTER_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A139TAM08_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A140TAM08_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam08_site_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A141TAM08_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A142TAM08_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A143TAM08_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam08_site_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A144TAM08_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A145TAM08_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0D12( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z140TAM08_CRT_DATETIME = A140TAM08_CRT_DATETIME ;
         Z141TAM08_CRT_USER_ID = A141TAM08_CRT_USER_ID ;
         Z143TAM08_UPD_DATETIME = A143TAM08_UPD_DATETIME ;
         Z144TAM08_UPD_USER_ID = A144TAM08_UPD_USER_ID ;
         Z146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
         Z133TAM08_SITE_NM = A133TAM08_SITE_NM ;
         Z134TAM08_SITE_SNM = A134TAM08_SITE_SNM ;
         Z594TAM08_OUTER_SITE_ID = A594TAM08_OUTER_SITE_ID ;
         Z139TAM08_DEL_FLG = A139TAM08_DEL_FLG ;
         Z142TAM08_CRT_PROG_NM = A142TAM08_CRT_PROG_NM ;
         Z145TAM08_UPD_PROG_NM = A145TAM08_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z132TAM08_SITE_ID = A132TAM08_SITE_ID ;
         Z140TAM08_CRT_DATETIME = A140TAM08_CRT_DATETIME ;
         Z141TAM08_CRT_USER_ID = A141TAM08_CRT_USER_ID ;
         Z143TAM08_UPD_DATETIME = A143TAM08_UPD_DATETIME ;
         Z144TAM08_UPD_USER_ID = A144TAM08_UPD_USER_ID ;
         Z146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
         Z133TAM08_SITE_NM = A133TAM08_SITE_NM ;
         Z134TAM08_SITE_SNM = A134TAM08_SITE_SNM ;
         Z594TAM08_OUTER_SITE_ID = A594TAM08_OUTER_SITE_ID ;
         Z139TAM08_DEL_FLG = A139TAM08_DEL_FLG ;
         Z142TAM08_CRT_PROG_NM = A142TAM08_CRT_PROG_NM ;
         Z145TAM08_UPD_PROG_NM = A145TAM08_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0D12( )
   {
      /* Using cursor BC000D4 */
      pr_default.execute(2, new Object[] {A132TAM08_SITE_ID});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A140TAM08_CRT_DATETIME = BC000D4_A140TAM08_CRT_DATETIME[0] ;
         n140TAM08_CRT_DATETIME = BC000D4_n140TAM08_CRT_DATETIME[0] ;
         A141TAM08_CRT_USER_ID = BC000D4_A141TAM08_CRT_USER_ID[0] ;
         n141TAM08_CRT_USER_ID = BC000D4_n141TAM08_CRT_USER_ID[0] ;
         A143TAM08_UPD_DATETIME = BC000D4_A143TAM08_UPD_DATETIME[0] ;
         n143TAM08_UPD_DATETIME = BC000D4_n143TAM08_UPD_DATETIME[0] ;
         A144TAM08_UPD_USER_ID = BC000D4_A144TAM08_UPD_USER_ID[0] ;
         n144TAM08_UPD_USER_ID = BC000D4_n144TAM08_UPD_USER_ID[0] ;
         A146TAM08_UPD_CNT = BC000D4_A146TAM08_UPD_CNT[0] ;
         n146TAM08_UPD_CNT = BC000D4_n146TAM08_UPD_CNT[0] ;
         A133TAM08_SITE_NM = BC000D4_A133TAM08_SITE_NM[0] ;
         n133TAM08_SITE_NM = BC000D4_n133TAM08_SITE_NM[0] ;
         A134TAM08_SITE_SNM = BC000D4_A134TAM08_SITE_SNM[0] ;
         n134TAM08_SITE_SNM = BC000D4_n134TAM08_SITE_SNM[0] ;
         A594TAM08_OUTER_SITE_ID = BC000D4_A594TAM08_OUTER_SITE_ID[0] ;
         n594TAM08_OUTER_SITE_ID = BC000D4_n594TAM08_OUTER_SITE_ID[0] ;
         A139TAM08_DEL_FLG = BC000D4_A139TAM08_DEL_FLG[0] ;
         n139TAM08_DEL_FLG = BC000D4_n139TAM08_DEL_FLG[0] ;
         A142TAM08_CRT_PROG_NM = BC000D4_A142TAM08_CRT_PROG_NM[0] ;
         n142TAM08_CRT_PROG_NM = BC000D4_n142TAM08_CRT_PROG_NM[0] ;
         A145TAM08_UPD_PROG_NM = BC000D4_A145TAM08_UPD_PROG_NM[0] ;
         n145TAM08_UPD_PROG_NM = BC000D4_n145TAM08_UPD_PROG_NM[0] ;
         zm0D12( -8) ;
      }
      pr_default.close(2);
      onLoadActions0D12( ) ;
   }

   public void onLoadActions0D12( )
   {
      AV9Pgmname = "TAM08_SITE_BC" ;
   }

   public void checkExtendedTable0D12( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TAM08_SITE_BC" ;
      if ( ! ( GXutil.nullDate().equals(A140TAM08_CRT_DATETIME) || (( A140TAM08_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A140TAM08_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A143TAM08_UPD_DATETIME) || (( A143TAM08_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A143TAM08_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0D12( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0D12( )
   {
      /* Using cursor BC000D5 */
      pr_default.execute(3, new Object[] {A132TAM08_SITE_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000D3 */
      pr_default.execute(1, new Object[] {A132TAM08_SITE_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0D12( 8) ;
         RcdFound12 = (short)(1) ;
         A132TAM08_SITE_ID = BC000D3_A132TAM08_SITE_ID[0] ;
         A140TAM08_CRT_DATETIME = BC000D3_A140TAM08_CRT_DATETIME[0] ;
         n140TAM08_CRT_DATETIME = BC000D3_n140TAM08_CRT_DATETIME[0] ;
         A141TAM08_CRT_USER_ID = BC000D3_A141TAM08_CRT_USER_ID[0] ;
         n141TAM08_CRT_USER_ID = BC000D3_n141TAM08_CRT_USER_ID[0] ;
         A143TAM08_UPD_DATETIME = BC000D3_A143TAM08_UPD_DATETIME[0] ;
         n143TAM08_UPD_DATETIME = BC000D3_n143TAM08_UPD_DATETIME[0] ;
         A144TAM08_UPD_USER_ID = BC000D3_A144TAM08_UPD_USER_ID[0] ;
         n144TAM08_UPD_USER_ID = BC000D3_n144TAM08_UPD_USER_ID[0] ;
         A146TAM08_UPD_CNT = BC000D3_A146TAM08_UPD_CNT[0] ;
         n146TAM08_UPD_CNT = BC000D3_n146TAM08_UPD_CNT[0] ;
         A133TAM08_SITE_NM = BC000D3_A133TAM08_SITE_NM[0] ;
         n133TAM08_SITE_NM = BC000D3_n133TAM08_SITE_NM[0] ;
         A134TAM08_SITE_SNM = BC000D3_A134TAM08_SITE_SNM[0] ;
         n134TAM08_SITE_SNM = BC000D3_n134TAM08_SITE_SNM[0] ;
         A594TAM08_OUTER_SITE_ID = BC000D3_A594TAM08_OUTER_SITE_ID[0] ;
         n594TAM08_OUTER_SITE_ID = BC000D3_n594TAM08_OUTER_SITE_ID[0] ;
         A139TAM08_DEL_FLG = BC000D3_A139TAM08_DEL_FLG[0] ;
         n139TAM08_DEL_FLG = BC000D3_n139TAM08_DEL_FLG[0] ;
         A142TAM08_CRT_PROG_NM = BC000D3_A142TAM08_CRT_PROG_NM[0] ;
         n142TAM08_CRT_PROG_NM = BC000D3_n142TAM08_CRT_PROG_NM[0] ;
         A145TAM08_UPD_PROG_NM = BC000D3_A145TAM08_UPD_PROG_NM[0] ;
         n145TAM08_UPD_PROG_NM = BC000D3_n145TAM08_UPD_PROG_NM[0] ;
         O146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
         n146TAM08_UPD_CNT = false ;
         Z132TAM08_SITE_ID = A132TAM08_SITE_ID ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0D12( ) ;
         Gx_mode = sMode12 ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey0D12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0D12( ) ;
      if ( RcdFound12 == 0 )
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
      confirm_0D0( ) ;
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

   public void checkOptimisticConcurrency0D12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000D2 */
         pr_default.execute(0, new Object[] {A132TAM08_SITE_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM08_SITE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z140TAM08_CRT_DATETIME.equals( BC000D2_A140TAM08_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z141TAM08_CRT_USER_ID, BC000D2_A141TAM08_CRT_USER_ID[0]) != 0 ) || !( Z143TAM08_UPD_DATETIME.equals( BC000D2_A143TAM08_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z144TAM08_UPD_USER_ID, BC000D2_A144TAM08_UPD_USER_ID[0]) != 0 ) || ( Z146TAM08_UPD_CNT != BC000D2_A146TAM08_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z133TAM08_SITE_NM, BC000D2_A133TAM08_SITE_NM[0]) != 0 ) || ( GXutil.strcmp(Z134TAM08_SITE_SNM, BC000D2_A134TAM08_SITE_SNM[0]) != 0 ) || ( GXutil.strcmp(Z594TAM08_OUTER_SITE_ID, BC000D2_A594TAM08_OUTER_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z139TAM08_DEL_FLG, BC000D2_A139TAM08_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z142TAM08_CRT_PROG_NM, BC000D2_A142TAM08_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z145TAM08_UPD_PROG_NM, BC000D2_A145TAM08_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM08_SITE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0D12( )
   {
      beforeValidate0D12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0D12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0D12( 0) ;
         checkOptimisticConcurrency0D12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0D12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0D12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000D6 */
                  pr_default.execute(4, new Object[] {A132TAM08_SITE_ID, new Boolean(n140TAM08_CRT_DATETIME), A140TAM08_CRT_DATETIME, new Boolean(n141TAM08_CRT_USER_ID), A141TAM08_CRT_USER_ID, new Boolean(n143TAM08_UPD_DATETIME), A143TAM08_UPD_DATETIME, new Boolean(n144TAM08_UPD_USER_ID), A144TAM08_UPD_USER_ID, new Boolean(n146TAM08_UPD_CNT), new Long(A146TAM08_UPD_CNT), new Boolean(n133TAM08_SITE_NM), A133TAM08_SITE_NM, new Boolean(n134TAM08_SITE_SNM), A134TAM08_SITE_SNM, new Boolean(n594TAM08_OUTER_SITE_ID), A594TAM08_OUTER_SITE_ID, new Boolean(n139TAM08_DEL_FLG), A139TAM08_DEL_FLG, new Boolean(n142TAM08_CRT_PROG_NM), A142TAM08_CRT_PROG_NM, new Boolean(n145TAM08_UPD_PROG_NM), A145TAM08_UPD_PROG_NM});
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
            load0D12( ) ;
         }
         endLevel0D12( ) ;
      }
      closeExtendedTableCursors0D12( ) ;
   }

   public void update0D12( )
   {
      beforeValidate0D12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0D12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0D12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0D12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0D12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000D7 */
                  pr_default.execute(5, new Object[] {new Boolean(n140TAM08_CRT_DATETIME), A140TAM08_CRT_DATETIME, new Boolean(n141TAM08_CRT_USER_ID), A141TAM08_CRT_USER_ID, new Boolean(n143TAM08_UPD_DATETIME), A143TAM08_UPD_DATETIME, new Boolean(n144TAM08_UPD_USER_ID), A144TAM08_UPD_USER_ID, new Boolean(n146TAM08_UPD_CNT), new Long(A146TAM08_UPD_CNT), new Boolean(n133TAM08_SITE_NM), A133TAM08_SITE_NM, new Boolean(n134TAM08_SITE_SNM), A134TAM08_SITE_SNM, new Boolean(n594TAM08_OUTER_SITE_ID), A594TAM08_OUTER_SITE_ID, new Boolean(n139TAM08_DEL_FLG), A139TAM08_DEL_FLG, new Boolean(n142TAM08_CRT_PROG_NM), A142TAM08_CRT_PROG_NM, new Boolean(n145TAM08_UPD_PROG_NM), A145TAM08_UPD_PROG_NM, A132TAM08_SITE_ID});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM08_SITE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0D12( ) ;
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
         endLevel0D12( ) ;
      }
      closeExtendedTableCursors0D12( ) ;
   }

   public void deferredUpdate0D12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0D12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0D12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0D12( ) ;
         afterConfirm0D12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0D12( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000D8 */
               pr_default.execute(6, new Object[] {A132TAM08_SITE_ID});
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0D12( ) ;
      Gx_mode = sMode12 ;
   }

   public void onDeleteControls0D12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TAM08_SITE_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000D9 */
         pr_default.execute(7, new Object[] {A132TAM08_SITE_ID});
         if ( (pr_default.getStatus(7) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(7);
         /* Using cursor BC000D10 */
         pr_default.execute(8, new Object[] {A132TAM08_SITE_ID});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験実施施設マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
      }
   }

   public void endLevel0D12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0D12( ) ;
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

   public void scanKeyStart0D12( )
   {
      /* Using cursor BC000D11 */
      pr_default.execute(9, new Object[] {A132TAM08_SITE_ID});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A132TAM08_SITE_ID = BC000D11_A132TAM08_SITE_ID[0] ;
         A140TAM08_CRT_DATETIME = BC000D11_A140TAM08_CRT_DATETIME[0] ;
         n140TAM08_CRT_DATETIME = BC000D11_n140TAM08_CRT_DATETIME[0] ;
         A141TAM08_CRT_USER_ID = BC000D11_A141TAM08_CRT_USER_ID[0] ;
         n141TAM08_CRT_USER_ID = BC000D11_n141TAM08_CRT_USER_ID[0] ;
         A143TAM08_UPD_DATETIME = BC000D11_A143TAM08_UPD_DATETIME[0] ;
         n143TAM08_UPD_DATETIME = BC000D11_n143TAM08_UPD_DATETIME[0] ;
         A144TAM08_UPD_USER_ID = BC000D11_A144TAM08_UPD_USER_ID[0] ;
         n144TAM08_UPD_USER_ID = BC000D11_n144TAM08_UPD_USER_ID[0] ;
         A146TAM08_UPD_CNT = BC000D11_A146TAM08_UPD_CNT[0] ;
         n146TAM08_UPD_CNT = BC000D11_n146TAM08_UPD_CNT[0] ;
         A133TAM08_SITE_NM = BC000D11_A133TAM08_SITE_NM[0] ;
         n133TAM08_SITE_NM = BC000D11_n133TAM08_SITE_NM[0] ;
         A134TAM08_SITE_SNM = BC000D11_A134TAM08_SITE_SNM[0] ;
         n134TAM08_SITE_SNM = BC000D11_n134TAM08_SITE_SNM[0] ;
         A594TAM08_OUTER_SITE_ID = BC000D11_A594TAM08_OUTER_SITE_ID[0] ;
         n594TAM08_OUTER_SITE_ID = BC000D11_n594TAM08_OUTER_SITE_ID[0] ;
         A139TAM08_DEL_FLG = BC000D11_A139TAM08_DEL_FLG[0] ;
         n139TAM08_DEL_FLG = BC000D11_n139TAM08_DEL_FLG[0] ;
         A142TAM08_CRT_PROG_NM = BC000D11_A142TAM08_CRT_PROG_NM[0] ;
         n142TAM08_CRT_PROG_NM = BC000D11_n142TAM08_CRT_PROG_NM[0] ;
         A145TAM08_UPD_PROG_NM = BC000D11_A145TAM08_UPD_PROG_NM[0] ;
         n145TAM08_UPD_PROG_NM = BC000D11_n145TAM08_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0D12( )
   {
      pr_default.readNext(9);
      RcdFound12 = (short)(0) ;
      scanKeyLoad0D12( ) ;
   }

   public void scanKeyLoad0D12( )
   {
      sMode12 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A132TAM08_SITE_ID = BC000D11_A132TAM08_SITE_ID[0] ;
         A140TAM08_CRT_DATETIME = BC000D11_A140TAM08_CRT_DATETIME[0] ;
         n140TAM08_CRT_DATETIME = BC000D11_n140TAM08_CRT_DATETIME[0] ;
         A141TAM08_CRT_USER_ID = BC000D11_A141TAM08_CRT_USER_ID[0] ;
         n141TAM08_CRT_USER_ID = BC000D11_n141TAM08_CRT_USER_ID[0] ;
         A143TAM08_UPD_DATETIME = BC000D11_A143TAM08_UPD_DATETIME[0] ;
         n143TAM08_UPD_DATETIME = BC000D11_n143TAM08_UPD_DATETIME[0] ;
         A144TAM08_UPD_USER_ID = BC000D11_A144TAM08_UPD_USER_ID[0] ;
         n144TAM08_UPD_USER_ID = BC000D11_n144TAM08_UPD_USER_ID[0] ;
         A146TAM08_UPD_CNT = BC000D11_A146TAM08_UPD_CNT[0] ;
         n146TAM08_UPD_CNT = BC000D11_n146TAM08_UPD_CNT[0] ;
         A133TAM08_SITE_NM = BC000D11_A133TAM08_SITE_NM[0] ;
         n133TAM08_SITE_NM = BC000D11_n133TAM08_SITE_NM[0] ;
         A134TAM08_SITE_SNM = BC000D11_A134TAM08_SITE_SNM[0] ;
         n134TAM08_SITE_SNM = BC000D11_n134TAM08_SITE_SNM[0] ;
         A594TAM08_OUTER_SITE_ID = BC000D11_A594TAM08_OUTER_SITE_ID[0] ;
         n594TAM08_OUTER_SITE_ID = BC000D11_n594TAM08_OUTER_SITE_ID[0] ;
         A139TAM08_DEL_FLG = BC000D11_A139TAM08_DEL_FLG[0] ;
         n139TAM08_DEL_FLG = BC000D11_n139TAM08_DEL_FLG[0] ;
         A142TAM08_CRT_PROG_NM = BC000D11_A142TAM08_CRT_PROG_NM[0] ;
         n142TAM08_CRT_PROG_NM = BC000D11_n142TAM08_CRT_PROG_NM[0] ;
         A145TAM08_UPD_PROG_NM = BC000D11_A145TAM08_UPD_PROG_NM[0] ;
         n145TAM08_UPD_PROG_NM = BC000D11_n145TAM08_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode12 ;
   }

   public void scanKeyEnd0D12( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0D12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0D12( )
   {
      /* Before Insert Rules */
      A140TAM08_CRT_DATETIME = GXutil.now( ) ;
      n140TAM08_CRT_DATETIME = false ;
      GXt_char1 = A141TAM08_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam08_site_bc.this.GXt_char1 = GXv_char2[0] ;
      A141TAM08_CRT_USER_ID = GXt_char1 ;
      n141TAM08_CRT_USER_ID = false ;
      A143TAM08_UPD_DATETIME = GXutil.now( ) ;
      n143TAM08_UPD_DATETIME = false ;
      GXt_char1 = A144TAM08_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam08_site_bc.this.GXt_char1 = GXv_char2[0] ;
      A144TAM08_UPD_USER_ID = GXt_char1 ;
      n144TAM08_UPD_USER_ID = false ;
      A146TAM08_UPD_CNT = (long)(O146TAM08_UPD_CNT+1) ;
      n146TAM08_UPD_CNT = false ;
   }

   public void beforeUpdate0D12( )
   {
      /* Before Update Rules */
      A143TAM08_UPD_DATETIME = GXutil.now( ) ;
      n143TAM08_UPD_DATETIME = false ;
      GXt_char1 = A144TAM08_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam08_site_bc.this.GXt_char1 = GXv_char2[0] ;
      A144TAM08_UPD_USER_ID = GXt_char1 ;
      n144TAM08_UPD_USER_ID = false ;
      A146TAM08_UPD_CNT = (long)(O146TAM08_UPD_CNT+1) ;
      n146TAM08_UPD_CNT = false ;
   }

   public void beforeDelete0D12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0D12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0D12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0D12( )
   {
   }

   public void addRow0D12( )
   {
      VarsToRow12( bcTAM08_SITE) ;
   }

   public void readRow0D12( )
   {
      RowToVars12( bcTAM08_SITE, 1) ;
   }

   public void initializeNonKey0D12( )
   {
      A140TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n140TAM08_CRT_DATETIME = false ;
      A141TAM08_CRT_USER_ID = "" ;
      n141TAM08_CRT_USER_ID = false ;
      A143TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n143TAM08_UPD_DATETIME = false ;
      A144TAM08_UPD_USER_ID = "" ;
      n144TAM08_UPD_USER_ID = false ;
      A146TAM08_UPD_CNT = 0 ;
      n146TAM08_UPD_CNT = false ;
      A133TAM08_SITE_NM = "" ;
      n133TAM08_SITE_NM = false ;
      A134TAM08_SITE_SNM = "" ;
      n134TAM08_SITE_SNM = false ;
      A594TAM08_OUTER_SITE_ID = "" ;
      n594TAM08_OUTER_SITE_ID = false ;
      A139TAM08_DEL_FLG = "" ;
      n139TAM08_DEL_FLG = false ;
      A142TAM08_CRT_PROG_NM = "" ;
      n142TAM08_CRT_PROG_NM = false ;
      A145TAM08_UPD_PROG_NM = "" ;
      n145TAM08_UPD_PROG_NM = false ;
      O146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
      n146TAM08_UPD_CNT = false ;
   }

   public void initAll0D12( )
   {
      A132TAM08_SITE_ID = "" ;
      initializeNonKey0D12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow12( SdtTAM08_SITE obj12 )
   {
      obj12.setgxTv_SdtTAM08_SITE_Mode( Gx_mode );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_datetime( A140TAM08_CRT_DATETIME );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_user_id( A141TAM08_CRT_USER_ID );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_datetime( A143TAM08_UPD_DATETIME );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_user_id( A144TAM08_UPD_USER_ID );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_cnt( A146TAM08_UPD_CNT );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_site_nm( A133TAM08_SITE_NM );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_site_snm( A134TAM08_SITE_SNM );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_outer_site_id( A594TAM08_OUTER_SITE_ID );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_del_flg( A139TAM08_DEL_FLG );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm( A142TAM08_CRT_PROG_NM );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm( A145TAM08_UPD_PROG_NM );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_site_id( A132TAM08_SITE_ID );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_site_id_Z( Z132TAM08_SITE_ID );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_site_nm_Z( Z133TAM08_SITE_NM );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_site_snm_Z( Z134TAM08_SITE_SNM );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z( Z594TAM08_OUTER_SITE_ID );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_del_flg_Z( Z139TAM08_DEL_FLG );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z( Z140TAM08_CRT_DATETIME );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z( Z141TAM08_CRT_USER_ID );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z( Z142TAM08_CRT_PROG_NM );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z( Z143TAM08_UPD_DATETIME );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z( Z144TAM08_UPD_USER_ID );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z( Z145TAM08_UPD_PROG_NM );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z( Z146TAM08_UPD_CNT );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_site_nm_N( (byte)((byte)((n133TAM08_SITE_NM)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_site_snm_N( (byte)((byte)((n134TAM08_SITE_SNM)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_N( (byte)((byte)((n594TAM08_OUTER_SITE_ID)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_del_flg_N( (byte)((byte)((n139TAM08_DEL_FLG)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_N( (byte)((byte)((n140TAM08_CRT_DATETIME)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_N( (byte)((byte)((n141TAM08_CRT_USER_ID)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N( (byte)((byte)((n142TAM08_CRT_PROG_NM)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_N( (byte)((byte)((n143TAM08_UPD_DATETIME)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_N( (byte)((byte)((n144TAM08_UPD_USER_ID)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N( (byte)((byte)((n145TAM08_UPD_PROG_NM)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_N( (byte)((byte)((n146TAM08_UPD_CNT)?1:0)) );
      obj12.setgxTv_SdtTAM08_SITE_Mode( Gx_mode );
   }

   public void RowToVars12( SdtTAM08_SITE obj12 ,
                            int forceLoad )
   {
      Gx_mode = obj12.getgxTv_SdtTAM08_SITE_Mode() ;
      A140TAM08_CRT_DATETIME = obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_datetime() ;
      n140TAM08_CRT_DATETIME = false ;
      A141TAM08_CRT_USER_ID = obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_user_id() ;
      n141TAM08_CRT_USER_ID = false ;
      A143TAM08_UPD_DATETIME = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_datetime() ;
      n143TAM08_UPD_DATETIME = false ;
      A144TAM08_UPD_USER_ID = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_user_id() ;
      n144TAM08_UPD_USER_ID = false ;
      A146TAM08_UPD_CNT = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_cnt() ;
      n146TAM08_UPD_CNT = false ;
      A133TAM08_SITE_NM = obj12.getgxTv_SdtTAM08_SITE_Tam08_site_nm() ;
      n133TAM08_SITE_NM = false ;
      A134TAM08_SITE_SNM = obj12.getgxTv_SdtTAM08_SITE_Tam08_site_snm() ;
      n134TAM08_SITE_SNM = false ;
      A594TAM08_OUTER_SITE_ID = obj12.getgxTv_SdtTAM08_SITE_Tam08_outer_site_id() ;
      n594TAM08_OUTER_SITE_ID = false ;
      A139TAM08_DEL_FLG = obj12.getgxTv_SdtTAM08_SITE_Tam08_del_flg() ;
      n139TAM08_DEL_FLG = false ;
      A142TAM08_CRT_PROG_NM = obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm() ;
      n142TAM08_CRT_PROG_NM = false ;
      A145TAM08_UPD_PROG_NM = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm() ;
      n145TAM08_UPD_PROG_NM = false ;
      A132TAM08_SITE_ID = obj12.getgxTv_SdtTAM08_SITE_Tam08_site_id() ;
      Z132TAM08_SITE_ID = obj12.getgxTv_SdtTAM08_SITE_Tam08_site_id_Z() ;
      Z133TAM08_SITE_NM = obj12.getgxTv_SdtTAM08_SITE_Tam08_site_nm_Z() ;
      Z134TAM08_SITE_SNM = obj12.getgxTv_SdtTAM08_SITE_Tam08_site_snm_Z() ;
      Z594TAM08_OUTER_SITE_ID = obj12.getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z() ;
      Z139TAM08_DEL_FLG = obj12.getgxTv_SdtTAM08_SITE_Tam08_del_flg_Z() ;
      Z140TAM08_CRT_DATETIME = obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z() ;
      Z141TAM08_CRT_USER_ID = obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z() ;
      Z142TAM08_CRT_PROG_NM = obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z() ;
      Z143TAM08_UPD_DATETIME = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z() ;
      Z144TAM08_UPD_USER_ID = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z() ;
      Z145TAM08_UPD_PROG_NM = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z() ;
      Z146TAM08_UPD_CNT = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z() ;
      O146TAM08_UPD_CNT = obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z() ;
      n133TAM08_SITE_NM = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_site_nm_N()==0)?false:true) ;
      n134TAM08_SITE_SNM = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_site_snm_N()==0)?false:true) ;
      n594TAM08_OUTER_SITE_ID = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_N()==0)?false:true) ;
      n139TAM08_DEL_FLG = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_del_flg_N()==0)?false:true) ;
      n140TAM08_CRT_DATETIME = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_N()==0)?false:true) ;
      n141TAM08_CRT_USER_ID = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_N()==0)?false:true) ;
      n142TAM08_CRT_PROG_NM = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N()==0)?false:true) ;
      n143TAM08_UPD_DATETIME = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_N()==0)?false:true) ;
      n144TAM08_UPD_USER_ID = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_N()==0)?false:true) ;
      n145TAM08_UPD_PROG_NM = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N()==0)?false:true) ;
      n146TAM08_UPD_CNT = (boolean)((obj12.getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj12.getgxTv_SdtTAM08_SITE_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A132TAM08_SITE_ID = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0D12( ) ;
      scanKeyStart0D12( ) ;
      if ( RcdFound12 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z132TAM08_SITE_ID = A132TAM08_SITE_ID ;
         O146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
         n146TAM08_UPD_CNT = false ;
      }
      zm0D12( -8) ;
      sMode12 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0D12( ) ;
      Gx_mode = sMode12 ;
      addRow0D12( ) ;
      scanKeyEnd0D12( ) ;
      if ( RcdFound12 == 0 )
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
      RowToVars12( bcTAM08_SITE, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0D12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A132TAM08_SITE_ID, Z132TAM08_SITE_ID) != 0 )
         {
            A132TAM08_SITE_ID = Z132TAM08_SITE_ID ;
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
            update0D12( ) ;
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
            if ( GXutil.strcmp(A132TAM08_SITE_ID, Z132TAM08_SITE_ID) != 0 )
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
                  insert0D12( ) ;
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
                  insert0D12( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow12( bcTAM08_SITE) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars12( bcTAM08_SITE, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0D12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A132TAM08_SITE_ID, Z132TAM08_SITE_ID) != 0 )
         {
            A132TAM08_SITE_ID = Z132TAM08_SITE_ID ;
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
         if ( GXutil.strcmp(A132TAM08_SITE_ID, Z132TAM08_SITE_ID) != 0 )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tam08_site_bc");
      VarsToRow12( bcTAM08_SITE) ;
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
      Gx_mode = bcTAM08_SITE.getgxTv_SdtTAM08_SITE_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTAM08_SITE.setgxTv_SdtTAM08_SITE_Mode( Gx_mode );
   }

   public void SetSDT( SdtTAM08_SITE sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTAM08_SITE )
      {
         bcTAM08_SITE = sdt ;
         if ( GXutil.strcmp(bcTAM08_SITE.getgxTv_SdtTAM08_SITE_Mode(), "") == 0 )
         {
            bcTAM08_SITE.setgxTv_SdtTAM08_SITE_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow12( bcTAM08_SITE) ;
         }
         else
         {
            RowToVars12( bcTAM08_SITE, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTAM08_SITE.getgxTv_SdtTAM08_SITE_Mode(), "") == 0 )
         {
            bcTAM08_SITE.setgxTv_SdtTAM08_SITE_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars12( bcTAM08_SITE, 1) ;
   }

   public SdtTAM08_SITE getTAM08_SITE_BC( )
   {
      return bcTAM08_SITE ;
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
      Z132TAM08_SITE_ID = "" ;
      A132TAM08_SITE_ID = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A133TAM08_SITE_NM = "" ;
      A134TAM08_SITE_SNM = "" ;
      A594TAM08_OUTER_SITE_ID = "" ;
      A139TAM08_DEL_FLG = "" ;
      A140TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A141TAM08_CRT_USER_ID = "" ;
      A142TAM08_CRT_PROG_NM = "" ;
      A143TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A144TAM08_UPD_USER_ID = "" ;
      A145TAM08_UPD_PROG_NM = "" ;
      gxTv_SdtTAM08_SITE_Tam08_site_id_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_site_nm_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_site_snm_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_del_flg_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z = "" ;
      Z140TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z141TAM08_CRT_USER_ID = "" ;
      Z143TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z144TAM08_UPD_USER_ID = "" ;
      Z133TAM08_SITE_NM = "" ;
      Z134TAM08_SITE_SNM = "" ;
      Z594TAM08_OUTER_SITE_ID = "" ;
      Z139TAM08_DEL_FLG = "" ;
      Z142TAM08_CRT_PROG_NM = "" ;
      Z145TAM08_UPD_PROG_NM = "" ;
      BC000D4_A132TAM08_SITE_ID = new String[] {""} ;
      BC000D4_A140TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000D4_n140TAM08_CRT_DATETIME = new boolean[] {false} ;
      BC000D4_A141TAM08_CRT_USER_ID = new String[] {""} ;
      BC000D4_n141TAM08_CRT_USER_ID = new boolean[] {false} ;
      BC000D4_A143TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000D4_n143TAM08_UPD_DATETIME = new boolean[] {false} ;
      BC000D4_A144TAM08_UPD_USER_ID = new String[] {""} ;
      BC000D4_n144TAM08_UPD_USER_ID = new boolean[] {false} ;
      BC000D4_A146TAM08_UPD_CNT = new long[1] ;
      BC000D4_n146TAM08_UPD_CNT = new boolean[] {false} ;
      BC000D4_A133TAM08_SITE_NM = new String[] {""} ;
      BC000D4_n133TAM08_SITE_NM = new boolean[] {false} ;
      BC000D4_A134TAM08_SITE_SNM = new String[] {""} ;
      BC000D4_n134TAM08_SITE_SNM = new boolean[] {false} ;
      BC000D4_A594TAM08_OUTER_SITE_ID = new String[] {""} ;
      BC000D4_n594TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      BC000D4_A139TAM08_DEL_FLG = new String[] {""} ;
      BC000D4_n139TAM08_DEL_FLG = new boolean[] {false} ;
      BC000D4_A142TAM08_CRT_PROG_NM = new String[] {""} ;
      BC000D4_n142TAM08_CRT_PROG_NM = new boolean[] {false} ;
      BC000D4_A145TAM08_UPD_PROG_NM = new String[] {""} ;
      BC000D4_n145TAM08_UPD_PROG_NM = new boolean[] {false} ;
      BC000D5_A132TAM08_SITE_ID = new String[] {""} ;
      BC000D3_A132TAM08_SITE_ID = new String[] {""} ;
      BC000D3_A140TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000D3_n140TAM08_CRT_DATETIME = new boolean[] {false} ;
      BC000D3_A141TAM08_CRT_USER_ID = new String[] {""} ;
      BC000D3_n141TAM08_CRT_USER_ID = new boolean[] {false} ;
      BC000D3_A143TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000D3_n143TAM08_UPD_DATETIME = new boolean[] {false} ;
      BC000D3_A144TAM08_UPD_USER_ID = new String[] {""} ;
      BC000D3_n144TAM08_UPD_USER_ID = new boolean[] {false} ;
      BC000D3_A146TAM08_UPD_CNT = new long[1] ;
      BC000D3_n146TAM08_UPD_CNT = new boolean[] {false} ;
      BC000D3_A133TAM08_SITE_NM = new String[] {""} ;
      BC000D3_n133TAM08_SITE_NM = new boolean[] {false} ;
      BC000D3_A134TAM08_SITE_SNM = new String[] {""} ;
      BC000D3_n134TAM08_SITE_SNM = new boolean[] {false} ;
      BC000D3_A594TAM08_OUTER_SITE_ID = new String[] {""} ;
      BC000D3_n594TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      BC000D3_A139TAM08_DEL_FLG = new String[] {""} ;
      BC000D3_n139TAM08_DEL_FLG = new boolean[] {false} ;
      BC000D3_A142TAM08_CRT_PROG_NM = new String[] {""} ;
      BC000D3_n142TAM08_CRT_PROG_NM = new boolean[] {false} ;
      BC000D3_A145TAM08_UPD_PROG_NM = new String[] {""} ;
      BC000D3_n145TAM08_UPD_PROG_NM = new boolean[] {false} ;
      sMode12 = "" ;
      BC000D2_A132TAM08_SITE_ID = new String[] {""} ;
      BC000D2_A140TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000D2_n140TAM08_CRT_DATETIME = new boolean[] {false} ;
      BC000D2_A141TAM08_CRT_USER_ID = new String[] {""} ;
      BC000D2_n141TAM08_CRT_USER_ID = new boolean[] {false} ;
      BC000D2_A143TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000D2_n143TAM08_UPD_DATETIME = new boolean[] {false} ;
      BC000D2_A144TAM08_UPD_USER_ID = new String[] {""} ;
      BC000D2_n144TAM08_UPD_USER_ID = new boolean[] {false} ;
      BC000D2_A146TAM08_UPD_CNT = new long[1] ;
      BC000D2_n146TAM08_UPD_CNT = new boolean[] {false} ;
      BC000D2_A133TAM08_SITE_NM = new String[] {""} ;
      BC000D2_n133TAM08_SITE_NM = new boolean[] {false} ;
      BC000D2_A134TAM08_SITE_SNM = new String[] {""} ;
      BC000D2_n134TAM08_SITE_SNM = new boolean[] {false} ;
      BC000D2_A594TAM08_OUTER_SITE_ID = new String[] {""} ;
      BC000D2_n594TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      BC000D2_A139TAM08_DEL_FLG = new String[] {""} ;
      BC000D2_n139TAM08_DEL_FLG = new boolean[] {false} ;
      BC000D2_A142TAM08_CRT_PROG_NM = new String[] {""} ;
      BC000D2_n142TAM08_CRT_PROG_NM = new boolean[] {false} ;
      BC000D2_A145TAM08_UPD_PROG_NM = new String[] {""} ;
      BC000D2_n145TAM08_UPD_PROG_NM = new boolean[] {false} ;
      BC000D9_A625TBW03_SESSION_ID = new String[] {""} ;
      BC000D9_A626TBW03_APP_ID = new String[] {""} ;
      BC000D9_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC000D9_A628TBW03_STUDY_ID = new long[1] ;
      BC000D9_A629TBW03_SUBJECT_ID = new int[1] ;
      BC000D9_A630TBW03_CRF_ID = new short[1] ;
      BC000D10_A197TBM22_STUDY_ID = new long[1] ;
      BC000D10_A198TBM22_SITE_ID = new String[] {""} ;
      BC000D11_A132TAM08_SITE_ID = new String[] {""} ;
      BC000D11_A140TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000D11_n140TAM08_CRT_DATETIME = new boolean[] {false} ;
      BC000D11_A141TAM08_CRT_USER_ID = new String[] {""} ;
      BC000D11_n141TAM08_CRT_USER_ID = new boolean[] {false} ;
      BC000D11_A143TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000D11_n143TAM08_UPD_DATETIME = new boolean[] {false} ;
      BC000D11_A144TAM08_UPD_USER_ID = new String[] {""} ;
      BC000D11_n144TAM08_UPD_USER_ID = new boolean[] {false} ;
      BC000D11_A146TAM08_UPD_CNT = new long[1] ;
      BC000D11_n146TAM08_UPD_CNT = new boolean[] {false} ;
      BC000D11_A133TAM08_SITE_NM = new String[] {""} ;
      BC000D11_n133TAM08_SITE_NM = new boolean[] {false} ;
      BC000D11_A134TAM08_SITE_SNM = new String[] {""} ;
      BC000D11_n134TAM08_SITE_SNM = new boolean[] {false} ;
      BC000D11_A594TAM08_OUTER_SITE_ID = new String[] {""} ;
      BC000D11_n594TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      BC000D11_A139TAM08_DEL_FLG = new String[] {""} ;
      BC000D11_n139TAM08_DEL_FLG = new boolean[] {false} ;
      BC000D11_A142TAM08_CRT_PROG_NM = new String[] {""} ;
      BC000D11_n142TAM08_CRT_PROG_NM = new boolean[] {false} ;
      BC000D11_A145TAM08_UPD_PROG_NM = new String[] {""} ;
      BC000D11_n145TAM08_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam08_site_bc__default(),
         new Object[] {
             new Object[] {
            BC000D2_A132TAM08_SITE_ID, BC000D2_A140TAM08_CRT_DATETIME, BC000D2_n140TAM08_CRT_DATETIME, BC000D2_A141TAM08_CRT_USER_ID, BC000D2_n141TAM08_CRT_USER_ID, BC000D2_A143TAM08_UPD_DATETIME, BC000D2_n143TAM08_UPD_DATETIME, BC000D2_A144TAM08_UPD_USER_ID, BC000D2_n144TAM08_UPD_USER_ID, BC000D2_A146TAM08_UPD_CNT,
            BC000D2_n146TAM08_UPD_CNT, BC000D2_A133TAM08_SITE_NM, BC000D2_n133TAM08_SITE_NM, BC000D2_A134TAM08_SITE_SNM, BC000D2_n134TAM08_SITE_SNM, BC000D2_A594TAM08_OUTER_SITE_ID, BC000D2_n594TAM08_OUTER_SITE_ID, BC000D2_A139TAM08_DEL_FLG, BC000D2_n139TAM08_DEL_FLG, BC000D2_A142TAM08_CRT_PROG_NM,
            BC000D2_n142TAM08_CRT_PROG_NM, BC000D2_A145TAM08_UPD_PROG_NM, BC000D2_n145TAM08_UPD_PROG_NM
            }
            , new Object[] {
            BC000D3_A132TAM08_SITE_ID, BC000D3_A140TAM08_CRT_DATETIME, BC000D3_n140TAM08_CRT_DATETIME, BC000D3_A141TAM08_CRT_USER_ID, BC000D3_n141TAM08_CRT_USER_ID, BC000D3_A143TAM08_UPD_DATETIME, BC000D3_n143TAM08_UPD_DATETIME, BC000D3_A144TAM08_UPD_USER_ID, BC000D3_n144TAM08_UPD_USER_ID, BC000D3_A146TAM08_UPD_CNT,
            BC000D3_n146TAM08_UPD_CNT, BC000D3_A133TAM08_SITE_NM, BC000D3_n133TAM08_SITE_NM, BC000D3_A134TAM08_SITE_SNM, BC000D3_n134TAM08_SITE_SNM, BC000D3_A594TAM08_OUTER_SITE_ID, BC000D3_n594TAM08_OUTER_SITE_ID, BC000D3_A139TAM08_DEL_FLG, BC000D3_n139TAM08_DEL_FLG, BC000D3_A142TAM08_CRT_PROG_NM,
            BC000D3_n142TAM08_CRT_PROG_NM, BC000D3_A145TAM08_UPD_PROG_NM, BC000D3_n145TAM08_UPD_PROG_NM
            }
            , new Object[] {
            BC000D4_A132TAM08_SITE_ID, BC000D4_A140TAM08_CRT_DATETIME, BC000D4_n140TAM08_CRT_DATETIME, BC000D4_A141TAM08_CRT_USER_ID, BC000D4_n141TAM08_CRT_USER_ID, BC000D4_A143TAM08_UPD_DATETIME, BC000D4_n143TAM08_UPD_DATETIME, BC000D4_A144TAM08_UPD_USER_ID, BC000D4_n144TAM08_UPD_USER_ID, BC000D4_A146TAM08_UPD_CNT,
            BC000D4_n146TAM08_UPD_CNT, BC000D4_A133TAM08_SITE_NM, BC000D4_n133TAM08_SITE_NM, BC000D4_A134TAM08_SITE_SNM, BC000D4_n134TAM08_SITE_SNM, BC000D4_A594TAM08_OUTER_SITE_ID, BC000D4_n594TAM08_OUTER_SITE_ID, BC000D4_A139TAM08_DEL_FLG, BC000D4_n139TAM08_DEL_FLG, BC000D4_A142TAM08_CRT_PROG_NM,
            BC000D4_n142TAM08_CRT_PROG_NM, BC000D4_A145TAM08_UPD_PROG_NM, BC000D4_n145TAM08_UPD_PROG_NM
            }
            , new Object[] {
            BC000D5_A132TAM08_SITE_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000D9_A625TBW03_SESSION_ID, BC000D9_A626TBW03_APP_ID, BC000D9_A627TBW03_DISP_DATETIME, BC000D9_A628TBW03_STUDY_ID, BC000D9_A629TBW03_SUBJECT_ID, BC000D9_A630TBW03_CRF_ID
            }
            , new Object[] {
            BC000D10_A197TBM22_STUDY_ID, BC000D10_A198TBM22_SITE_ID
            }
            , new Object[] {
            BC000D11_A132TAM08_SITE_ID, BC000D11_A140TAM08_CRT_DATETIME, BC000D11_n140TAM08_CRT_DATETIME, BC000D11_A141TAM08_CRT_USER_ID, BC000D11_n141TAM08_CRT_USER_ID, BC000D11_A143TAM08_UPD_DATETIME, BC000D11_n143TAM08_UPD_DATETIME, BC000D11_A144TAM08_UPD_USER_ID, BC000D11_n144TAM08_UPD_USER_ID, BC000D11_A146TAM08_UPD_CNT,
            BC000D11_n146TAM08_UPD_CNT, BC000D11_A133TAM08_SITE_NM, BC000D11_n133TAM08_SITE_NM, BC000D11_A134TAM08_SITE_SNM, BC000D11_n134TAM08_SITE_SNM, BC000D11_A594TAM08_OUTER_SITE_ID, BC000D11_n594TAM08_OUTER_SITE_ID, BC000D11_A139TAM08_DEL_FLG, BC000D11_n139TAM08_DEL_FLG, BC000D11_A142TAM08_CRT_PROG_NM,
            BC000D11_n142TAM08_CRT_PROG_NM, BC000D11_A145TAM08_UPD_PROG_NM, BC000D11_n145TAM08_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TAM08_SITE_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110D2 */
      e110D2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTAM08_SITE_Tam08_site_nm_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_site_snm_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_del_flg_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound12 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long A146TAM08_UPD_CNT ;
   private long gxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z ;
   private long Z146TAM08_UPD_CNT ;
   private long O146TAM08_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode12 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A140TAM08_CRT_DATETIME ;
   private java.util.Date A143TAM08_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z ;
   private java.util.Date Z140TAM08_CRT_DATETIME ;
   private java.util.Date Z143TAM08_UPD_DATETIME ;
   private boolean n140TAM08_CRT_DATETIME ;
   private boolean n141TAM08_CRT_USER_ID ;
   private boolean n143TAM08_UPD_DATETIME ;
   private boolean n144TAM08_UPD_USER_ID ;
   private boolean n146TAM08_UPD_CNT ;
   private boolean n133TAM08_SITE_NM ;
   private boolean n134TAM08_SITE_SNM ;
   private boolean n594TAM08_OUTER_SITE_ID ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n142TAM08_CRT_PROG_NM ;
   private boolean n145TAM08_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z132TAM08_SITE_ID ;
   private String A132TAM08_SITE_ID ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A133TAM08_SITE_NM ;
   private String A134TAM08_SITE_SNM ;
   private String A594TAM08_OUTER_SITE_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A141TAM08_CRT_USER_ID ;
   private String A142TAM08_CRT_PROG_NM ;
   private String A144TAM08_UPD_USER_ID ;
   private String A145TAM08_UPD_PROG_NM ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_id_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_nm_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_snm_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_del_flg_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z ;
   private String Z141TAM08_CRT_USER_ID ;
   private String Z144TAM08_UPD_USER_ID ;
   private String Z133TAM08_SITE_NM ;
   private String Z134TAM08_SITE_SNM ;
   private String Z594TAM08_OUTER_SITE_ID ;
   private String Z139TAM08_DEL_FLG ;
   private String Z142TAM08_CRT_PROG_NM ;
   private String Z145TAM08_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAM08_SITE bcTAM08_SITE ;
   private IDataStoreProvider pr_default ;
   private String[] BC000D4_A132TAM08_SITE_ID ;
   private java.util.Date[] BC000D4_A140TAM08_CRT_DATETIME ;
   private boolean[] BC000D4_n140TAM08_CRT_DATETIME ;
   private String[] BC000D4_A141TAM08_CRT_USER_ID ;
   private boolean[] BC000D4_n141TAM08_CRT_USER_ID ;
   private java.util.Date[] BC000D4_A143TAM08_UPD_DATETIME ;
   private boolean[] BC000D4_n143TAM08_UPD_DATETIME ;
   private String[] BC000D4_A144TAM08_UPD_USER_ID ;
   private boolean[] BC000D4_n144TAM08_UPD_USER_ID ;
   private long[] BC000D4_A146TAM08_UPD_CNT ;
   private boolean[] BC000D4_n146TAM08_UPD_CNT ;
   private String[] BC000D4_A133TAM08_SITE_NM ;
   private boolean[] BC000D4_n133TAM08_SITE_NM ;
   private String[] BC000D4_A134TAM08_SITE_SNM ;
   private boolean[] BC000D4_n134TAM08_SITE_SNM ;
   private String[] BC000D4_A594TAM08_OUTER_SITE_ID ;
   private boolean[] BC000D4_n594TAM08_OUTER_SITE_ID ;
   private String[] BC000D4_A139TAM08_DEL_FLG ;
   private boolean[] BC000D4_n139TAM08_DEL_FLG ;
   private String[] BC000D4_A142TAM08_CRT_PROG_NM ;
   private boolean[] BC000D4_n142TAM08_CRT_PROG_NM ;
   private String[] BC000D4_A145TAM08_UPD_PROG_NM ;
   private boolean[] BC000D4_n145TAM08_UPD_PROG_NM ;
   private String[] BC000D5_A132TAM08_SITE_ID ;
   private String[] BC000D3_A132TAM08_SITE_ID ;
   private java.util.Date[] BC000D3_A140TAM08_CRT_DATETIME ;
   private boolean[] BC000D3_n140TAM08_CRT_DATETIME ;
   private String[] BC000D3_A141TAM08_CRT_USER_ID ;
   private boolean[] BC000D3_n141TAM08_CRT_USER_ID ;
   private java.util.Date[] BC000D3_A143TAM08_UPD_DATETIME ;
   private boolean[] BC000D3_n143TAM08_UPD_DATETIME ;
   private String[] BC000D3_A144TAM08_UPD_USER_ID ;
   private boolean[] BC000D3_n144TAM08_UPD_USER_ID ;
   private long[] BC000D3_A146TAM08_UPD_CNT ;
   private boolean[] BC000D3_n146TAM08_UPD_CNT ;
   private String[] BC000D3_A133TAM08_SITE_NM ;
   private boolean[] BC000D3_n133TAM08_SITE_NM ;
   private String[] BC000D3_A134TAM08_SITE_SNM ;
   private boolean[] BC000D3_n134TAM08_SITE_SNM ;
   private String[] BC000D3_A594TAM08_OUTER_SITE_ID ;
   private boolean[] BC000D3_n594TAM08_OUTER_SITE_ID ;
   private String[] BC000D3_A139TAM08_DEL_FLG ;
   private boolean[] BC000D3_n139TAM08_DEL_FLG ;
   private String[] BC000D3_A142TAM08_CRT_PROG_NM ;
   private boolean[] BC000D3_n142TAM08_CRT_PROG_NM ;
   private String[] BC000D3_A145TAM08_UPD_PROG_NM ;
   private boolean[] BC000D3_n145TAM08_UPD_PROG_NM ;
   private String[] BC000D2_A132TAM08_SITE_ID ;
   private java.util.Date[] BC000D2_A140TAM08_CRT_DATETIME ;
   private boolean[] BC000D2_n140TAM08_CRT_DATETIME ;
   private String[] BC000D2_A141TAM08_CRT_USER_ID ;
   private boolean[] BC000D2_n141TAM08_CRT_USER_ID ;
   private java.util.Date[] BC000D2_A143TAM08_UPD_DATETIME ;
   private boolean[] BC000D2_n143TAM08_UPD_DATETIME ;
   private String[] BC000D2_A144TAM08_UPD_USER_ID ;
   private boolean[] BC000D2_n144TAM08_UPD_USER_ID ;
   private long[] BC000D2_A146TAM08_UPD_CNT ;
   private boolean[] BC000D2_n146TAM08_UPD_CNT ;
   private String[] BC000D2_A133TAM08_SITE_NM ;
   private boolean[] BC000D2_n133TAM08_SITE_NM ;
   private String[] BC000D2_A134TAM08_SITE_SNM ;
   private boolean[] BC000D2_n134TAM08_SITE_SNM ;
   private String[] BC000D2_A594TAM08_OUTER_SITE_ID ;
   private boolean[] BC000D2_n594TAM08_OUTER_SITE_ID ;
   private String[] BC000D2_A139TAM08_DEL_FLG ;
   private boolean[] BC000D2_n139TAM08_DEL_FLG ;
   private String[] BC000D2_A142TAM08_CRT_PROG_NM ;
   private boolean[] BC000D2_n142TAM08_CRT_PROG_NM ;
   private String[] BC000D2_A145TAM08_UPD_PROG_NM ;
   private boolean[] BC000D2_n145TAM08_UPD_PROG_NM ;
   private String[] BC000D9_A625TBW03_SESSION_ID ;
   private String[] BC000D9_A626TBW03_APP_ID ;
   private String[] BC000D9_A627TBW03_DISP_DATETIME ;
   private long[] BC000D9_A628TBW03_STUDY_ID ;
   private int[] BC000D9_A629TBW03_SUBJECT_ID ;
   private short[] BC000D9_A630TBW03_CRF_ID ;
   private long[] BC000D10_A197TBM22_STUDY_ID ;
   private String[] BC000D10_A198TBM22_SITE_ID ;
   private String[] BC000D11_A132TAM08_SITE_ID ;
   private java.util.Date[] BC000D11_A140TAM08_CRT_DATETIME ;
   private boolean[] BC000D11_n140TAM08_CRT_DATETIME ;
   private String[] BC000D11_A141TAM08_CRT_USER_ID ;
   private boolean[] BC000D11_n141TAM08_CRT_USER_ID ;
   private java.util.Date[] BC000D11_A143TAM08_UPD_DATETIME ;
   private boolean[] BC000D11_n143TAM08_UPD_DATETIME ;
   private String[] BC000D11_A144TAM08_UPD_USER_ID ;
   private boolean[] BC000D11_n144TAM08_UPD_USER_ID ;
   private long[] BC000D11_A146TAM08_UPD_CNT ;
   private boolean[] BC000D11_n146TAM08_UPD_CNT ;
   private String[] BC000D11_A133TAM08_SITE_NM ;
   private boolean[] BC000D11_n133TAM08_SITE_NM ;
   private String[] BC000D11_A134TAM08_SITE_SNM ;
   private boolean[] BC000D11_n134TAM08_SITE_SNM ;
   private String[] BC000D11_A594TAM08_OUTER_SITE_ID ;
   private boolean[] BC000D11_n594TAM08_OUTER_SITE_ID ;
   private String[] BC000D11_A139TAM08_DEL_FLG ;
   private boolean[] BC000D11_n139TAM08_DEL_FLG ;
   private String[] BC000D11_A142TAM08_CRT_PROG_NM ;
   private boolean[] BC000D11_n142TAM08_CRT_PROG_NM ;
   private String[] BC000D11_A145TAM08_UPD_PROG_NM ;
   private boolean[] BC000D11_n145TAM08_UPD_PROG_NM ;
}

final  class tam08_site_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000D2", "SELECT `TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000D3", "SELECT `TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000D4", "SELECT TM1.`TAM08_SITE_ID`, TM1.`TAM08_CRT_DATETIME`, TM1.`TAM08_CRT_USER_ID`, TM1.`TAM08_UPD_DATETIME`, TM1.`TAM08_UPD_USER_ID`, TM1.`TAM08_UPD_CNT`, TM1.`TAM08_SITE_NM`, TM1.`TAM08_SITE_SNM`, TM1.`TAM08_OUTER_SITE_ID`, TM1.`TAM08_DEL_FLG`, TM1.`TAM08_CRT_PROG_NM`, TM1.`TAM08_UPD_PROG_NM` FROM `TAM08_SITE` TM1 WHERE TM1.`TAM08_SITE_ID` = ? ORDER BY TM1.`TAM08_SITE_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000D5", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000D6", "INSERT INTO `TAM08_SITE` (`TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000D7", "UPDATE `TAM08_SITE` SET `TAM08_CRT_DATETIME`=?, `TAM08_CRT_USER_ID`=?, `TAM08_UPD_DATETIME`=?, `TAM08_UPD_USER_ID`=?, `TAM08_UPD_CNT`=?, `TAM08_SITE_NM`=?, `TAM08_SITE_SNM`=?, `TAM08_OUTER_SITE_ID`=?, `TAM08_DEL_FLG`=?, `TAM08_CRT_PROG_NM`=?, `TAM08_UPD_PROG_NM`=?  WHERE `TAM08_SITE_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000D8", "DELETE FROM `TAM08_SITE`  WHERE `TAM08_SITE_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000D9", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SITE_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000D10", "SELECT `TBM22_STUDY_ID`, `TBM22_SITE_ID` FROM `TBM22_STUDY_SITE` WHERE `TBM22_SITE_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000D11", "SELECT TM1.`TAM08_SITE_ID`, TM1.`TAM08_CRT_DATETIME`, TM1.`TAM08_CRT_USER_ID`, TM1.`TAM08_UPD_DATETIME`, TM1.`TAM08_UPD_USER_ID`, TM1.`TAM08_UPD_CNT`, TM1.`TAM08_SITE_NM`, TM1.`TAM08_SITE_SNM`, TM1.`TAM08_OUTER_SITE_ID`, TM1.`TAM08_DEL_FLG`, TM1.`TAM08_CRT_PROG_NM`, TM1.`TAM08_UPD_PROG_NM` FROM `TAM08_SITE` TM1 WHERE TM1.`TAM08_SITE_ID` = ? ORDER BY TM1.`TAM08_SITE_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 9 :
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
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 40);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 50);
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
                  stmt.setVarchar(8, (String)parms[15], 20);
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
               stmt.setVarchar(12, (String)parms[22], 20, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
      }
   }

}

