/*
               File: tam07_user_bc
        Description: ユーザーマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:45.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam07_user_bc extends GXWebPanel implements IGxSilentTrn
{
   public tam07_user_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam07_user_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam07_user_bc.class ));
   }

   public tam07_user_bc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0A10( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0A10( ) ;
      standaloneModal( ) ;
      addRow0A10( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120A2 */
         e120A2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z55TAM07_USER_ID = A55TAM07_USER_ID ;
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

   public void confirm_0A0( )
   {
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0A10( ) ;
         }
         else
         {
            checkExtendedTable0A10( ) ;
            if ( AnyError == 0 )
            {
               zm0A10( 9) ;
            }
            closeExtendedTableCursors0A10( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110A2( )
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

   public void e120A2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "ユーザーID:" + A55TAM07_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A205TAM07_USER_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A313TAM07_USER_KANA_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A210TAM07_PWD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A56TAM07_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A333TAM07_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A214TAM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A229TAM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A264TAM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A230TAM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A231TAM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A265TAM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A232TAM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0A10( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z229TAM07_CRT_DATETIME = A229TAM07_CRT_DATETIME ;
         Z264TAM07_CRT_USER_ID = A264TAM07_CRT_USER_ID ;
         Z231TAM07_UPD_DATETIME = A231TAM07_UPD_DATETIME ;
         Z265TAM07_UPD_USER_ID = A265TAM07_UPD_USER_ID ;
         Z299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
         Z205TAM07_USER_NM = A205TAM07_USER_NM ;
         Z313TAM07_USER_KANA_NM = A313TAM07_USER_KANA_NM ;
         Z210TAM07_PWD = A210TAM07_PWD ;
         Z333TAM07_SITE_ID = A333TAM07_SITE_ID ;
         Z683TAM07_EMAIL = A683TAM07_EMAIL ;
         Z996TAM07_ADMIN_AUTH_FLG = A996TAM07_ADMIN_AUTH_FLG ;
         Z997TAM07_NC_FLG = A997TAM07_NC_FLG ;
         Z998TAM07_NOTE = A998TAM07_NOTE ;
         Z214TAM07_DEL_FLG = A214TAM07_DEL_FLG ;
         Z230TAM07_CRT_PROG_NM = A230TAM07_CRT_PROG_NM ;
         Z232TAM07_UPD_PROG_NM = A232TAM07_UPD_PROG_NM ;
         Z56TAM07_AUTH_CD = A56TAM07_AUTH_CD ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z55TAM07_USER_ID = A55TAM07_USER_ID ;
         Z229TAM07_CRT_DATETIME = A229TAM07_CRT_DATETIME ;
         Z264TAM07_CRT_USER_ID = A264TAM07_CRT_USER_ID ;
         Z231TAM07_UPD_DATETIME = A231TAM07_UPD_DATETIME ;
         Z265TAM07_UPD_USER_ID = A265TAM07_UPD_USER_ID ;
         Z299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
         Z205TAM07_USER_NM = A205TAM07_USER_NM ;
         Z313TAM07_USER_KANA_NM = A313TAM07_USER_KANA_NM ;
         Z210TAM07_PWD = A210TAM07_PWD ;
         Z333TAM07_SITE_ID = A333TAM07_SITE_ID ;
         Z683TAM07_EMAIL = A683TAM07_EMAIL ;
         Z996TAM07_ADMIN_AUTH_FLG = A996TAM07_ADMIN_AUTH_FLG ;
         Z997TAM07_NC_FLG = A997TAM07_NC_FLG ;
         Z998TAM07_NOTE = A998TAM07_NOTE ;
         Z214TAM07_DEL_FLG = A214TAM07_DEL_FLG ;
         Z230TAM07_CRT_PROG_NM = A230TAM07_CRT_PROG_NM ;
         Z232TAM07_UPD_PROG_NM = A232TAM07_UPD_PROG_NM ;
         Z56TAM07_AUTH_CD = A56TAM07_AUTH_CD ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0A10( )
   {
      /* Using cursor BC000A5 */
      pr_default.execute(3, new Object[] {A55TAM07_USER_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A229TAM07_CRT_DATETIME = BC000A5_A229TAM07_CRT_DATETIME[0] ;
         n229TAM07_CRT_DATETIME = BC000A5_n229TAM07_CRT_DATETIME[0] ;
         A264TAM07_CRT_USER_ID = BC000A5_A264TAM07_CRT_USER_ID[0] ;
         n264TAM07_CRT_USER_ID = BC000A5_n264TAM07_CRT_USER_ID[0] ;
         A231TAM07_UPD_DATETIME = BC000A5_A231TAM07_UPD_DATETIME[0] ;
         n231TAM07_UPD_DATETIME = BC000A5_n231TAM07_UPD_DATETIME[0] ;
         A265TAM07_UPD_USER_ID = BC000A5_A265TAM07_UPD_USER_ID[0] ;
         n265TAM07_UPD_USER_ID = BC000A5_n265TAM07_UPD_USER_ID[0] ;
         A299TAM07_UPD_CNT = BC000A5_A299TAM07_UPD_CNT[0] ;
         n299TAM07_UPD_CNT = BC000A5_n299TAM07_UPD_CNT[0] ;
         A205TAM07_USER_NM = BC000A5_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = BC000A5_n205TAM07_USER_NM[0] ;
         A313TAM07_USER_KANA_NM = BC000A5_A313TAM07_USER_KANA_NM[0] ;
         n313TAM07_USER_KANA_NM = BC000A5_n313TAM07_USER_KANA_NM[0] ;
         A210TAM07_PWD = BC000A5_A210TAM07_PWD[0] ;
         n210TAM07_PWD = BC000A5_n210TAM07_PWD[0] ;
         A333TAM07_SITE_ID = BC000A5_A333TAM07_SITE_ID[0] ;
         n333TAM07_SITE_ID = BC000A5_n333TAM07_SITE_ID[0] ;
         A683TAM07_EMAIL = BC000A5_A683TAM07_EMAIL[0] ;
         n683TAM07_EMAIL = BC000A5_n683TAM07_EMAIL[0] ;
         A996TAM07_ADMIN_AUTH_FLG = BC000A5_A996TAM07_ADMIN_AUTH_FLG[0] ;
         n996TAM07_ADMIN_AUTH_FLG = BC000A5_n996TAM07_ADMIN_AUTH_FLG[0] ;
         A997TAM07_NC_FLG = BC000A5_A997TAM07_NC_FLG[0] ;
         n997TAM07_NC_FLG = BC000A5_n997TAM07_NC_FLG[0] ;
         A998TAM07_NOTE = BC000A5_A998TAM07_NOTE[0] ;
         n998TAM07_NOTE = BC000A5_n998TAM07_NOTE[0] ;
         A214TAM07_DEL_FLG = BC000A5_A214TAM07_DEL_FLG[0] ;
         n214TAM07_DEL_FLG = BC000A5_n214TAM07_DEL_FLG[0] ;
         A230TAM07_CRT_PROG_NM = BC000A5_A230TAM07_CRT_PROG_NM[0] ;
         n230TAM07_CRT_PROG_NM = BC000A5_n230TAM07_CRT_PROG_NM[0] ;
         A232TAM07_UPD_PROG_NM = BC000A5_A232TAM07_UPD_PROG_NM[0] ;
         n232TAM07_UPD_PROG_NM = BC000A5_n232TAM07_UPD_PROG_NM[0] ;
         A56TAM07_AUTH_CD = BC000A5_A56TAM07_AUTH_CD[0] ;
         n56TAM07_AUTH_CD = BC000A5_n56TAM07_AUTH_CD[0] ;
         zm0A10( -8) ;
      }
      pr_default.close(3);
      onLoadActions0A10( ) ;
   }

   public void onLoadActions0A10( )
   {
      AV9Pgmname = "TAM07_USER_BC" ;
   }

   public void checkExtendedTable0A10( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TAM07_USER_BC" ;
      /* Using cursor BC000A4 */
      pr_default.execute(2, new Object[] {new Boolean(n56TAM07_AUTH_CD), A56TAM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A56TAM07_AUTH_CD)==0) ) )
         {
            httpContext.GX_msglist.addItem("'ユーザーマスタ・権限サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM07_AUTH_CD");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A229TAM07_CRT_DATETIME) || (( A229TAM07_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A229TAM07_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A231TAM07_UPD_DATETIME) || (( A231TAM07_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A231TAM07_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0A10( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0A10( )
   {
      /* Using cursor BC000A6 */
      pr_default.execute(4, new Object[] {A55TAM07_USER_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000A3 */
      pr_default.execute(1, new Object[] {A55TAM07_USER_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0A10( 8) ;
         RcdFound10 = (short)(1) ;
         A55TAM07_USER_ID = BC000A3_A55TAM07_USER_ID[0] ;
         A229TAM07_CRT_DATETIME = BC000A3_A229TAM07_CRT_DATETIME[0] ;
         n229TAM07_CRT_DATETIME = BC000A3_n229TAM07_CRT_DATETIME[0] ;
         A264TAM07_CRT_USER_ID = BC000A3_A264TAM07_CRT_USER_ID[0] ;
         n264TAM07_CRT_USER_ID = BC000A3_n264TAM07_CRT_USER_ID[0] ;
         A231TAM07_UPD_DATETIME = BC000A3_A231TAM07_UPD_DATETIME[0] ;
         n231TAM07_UPD_DATETIME = BC000A3_n231TAM07_UPD_DATETIME[0] ;
         A265TAM07_UPD_USER_ID = BC000A3_A265TAM07_UPD_USER_ID[0] ;
         n265TAM07_UPD_USER_ID = BC000A3_n265TAM07_UPD_USER_ID[0] ;
         A299TAM07_UPD_CNT = BC000A3_A299TAM07_UPD_CNT[0] ;
         n299TAM07_UPD_CNT = BC000A3_n299TAM07_UPD_CNT[0] ;
         A205TAM07_USER_NM = BC000A3_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = BC000A3_n205TAM07_USER_NM[0] ;
         A313TAM07_USER_KANA_NM = BC000A3_A313TAM07_USER_KANA_NM[0] ;
         n313TAM07_USER_KANA_NM = BC000A3_n313TAM07_USER_KANA_NM[0] ;
         A210TAM07_PWD = BC000A3_A210TAM07_PWD[0] ;
         n210TAM07_PWD = BC000A3_n210TAM07_PWD[0] ;
         A333TAM07_SITE_ID = BC000A3_A333TAM07_SITE_ID[0] ;
         n333TAM07_SITE_ID = BC000A3_n333TAM07_SITE_ID[0] ;
         A683TAM07_EMAIL = BC000A3_A683TAM07_EMAIL[0] ;
         n683TAM07_EMAIL = BC000A3_n683TAM07_EMAIL[0] ;
         A996TAM07_ADMIN_AUTH_FLG = BC000A3_A996TAM07_ADMIN_AUTH_FLG[0] ;
         n996TAM07_ADMIN_AUTH_FLG = BC000A3_n996TAM07_ADMIN_AUTH_FLG[0] ;
         A997TAM07_NC_FLG = BC000A3_A997TAM07_NC_FLG[0] ;
         n997TAM07_NC_FLG = BC000A3_n997TAM07_NC_FLG[0] ;
         A998TAM07_NOTE = BC000A3_A998TAM07_NOTE[0] ;
         n998TAM07_NOTE = BC000A3_n998TAM07_NOTE[0] ;
         A214TAM07_DEL_FLG = BC000A3_A214TAM07_DEL_FLG[0] ;
         n214TAM07_DEL_FLG = BC000A3_n214TAM07_DEL_FLG[0] ;
         A230TAM07_CRT_PROG_NM = BC000A3_A230TAM07_CRT_PROG_NM[0] ;
         n230TAM07_CRT_PROG_NM = BC000A3_n230TAM07_CRT_PROG_NM[0] ;
         A232TAM07_UPD_PROG_NM = BC000A3_A232TAM07_UPD_PROG_NM[0] ;
         n232TAM07_UPD_PROG_NM = BC000A3_n232TAM07_UPD_PROG_NM[0] ;
         A56TAM07_AUTH_CD = BC000A3_A56TAM07_AUTH_CD[0] ;
         n56TAM07_AUTH_CD = BC000A3_n56TAM07_AUTH_CD[0] ;
         O299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
         n299TAM07_UPD_CNT = false ;
         Z55TAM07_USER_ID = A55TAM07_USER_ID ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0A10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey0A10( ) ;
         }
         Gx_mode = sMode10 ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0A10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0A10( ) ;
      if ( RcdFound10 == 0 )
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
      confirm_0A0( ) ;
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

   public void checkOptimisticConcurrency0A10( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000A2 */
         pr_default.execute(0, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM07_USER"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z229TAM07_CRT_DATETIME.equals( BC000A2_A229TAM07_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z264TAM07_CRT_USER_ID, BC000A2_A264TAM07_CRT_USER_ID[0]) != 0 ) || !( Z231TAM07_UPD_DATETIME.equals( BC000A2_A231TAM07_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z265TAM07_UPD_USER_ID, BC000A2_A265TAM07_UPD_USER_ID[0]) != 0 ) || ( Z299TAM07_UPD_CNT != BC000A2_A299TAM07_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z205TAM07_USER_NM, BC000A2_A205TAM07_USER_NM[0]) != 0 ) || ( GXutil.strcmp(Z313TAM07_USER_KANA_NM, BC000A2_A313TAM07_USER_KANA_NM[0]) != 0 ) || ( GXutil.strcmp(Z210TAM07_PWD, BC000A2_A210TAM07_PWD[0]) != 0 ) || ( GXutil.strcmp(Z333TAM07_SITE_ID, BC000A2_A333TAM07_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z683TAM07_EMAIL, BC000A2_A683TAM07_EMAIL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z996TAM07_ADMIN_AUTH_FLG, BC000A2_A996TAM07_ADMIN_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z997TAM07_NC_FLG, BC000A2_A997TAM07_NC_FLG[0]) != 0 ) || ( GXutil.strcmp(Z998TAM07_NOTE, BC000A2_A998TAM07_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z214TAM07_DEL_FLG, BC000A2_A214TAM07_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z230TAM07_CRT_PROG_NM, BC000A2_A230TAM07_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z232TAM07_UPD_PROG_NM, BC000A2_A232TAM07_UPD_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z56TAM07_AUTH_CD, BC000A2_A56TAM07_AUTH_CD[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM07_USER"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0A10( )
   {
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0A10( 0) ;
         checkOptimisticConcurrency0A10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0A10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000A7 */
                  pr_default.execute(5, new Object[] {A55TAM07_USER_ID, new Boolean(n229TAM07_CRT_DATETIME), A229TAM07_CRT_DATETIME, new Boolean(n264TAM07_CRT_USER_ID), A264TAM07_CRT_USER_ID, new Boolean(n231TAM07_UPD_DATETIME), A231TAM07_UPD_DATETIME, new Boolean(n265TAM07_UPD_USER_ID), A265TAM07_UPD_USER_ID, new Boolean(n299TAM07_UPD_CNT), new Long(A299TAM07_UPD_CNT), new Boolean(n205TAM07_USER_NM), A205TAM07_USER_NM, new Boolean(n313TAM07_USER_KANA_NM), A313TAM07_USER_KANA_NM, new Boolean(n210TAM07_PWD), A210TAM07_PWD, new Boolean(n333TAM07_SITE_ID), A333TAM07_SITE_ID, new Boolean(n683TAM07_EMAIL), A683TAM07_EMAIL, new Boolean(n996TAM07_ADMIN_AUTH_FLG), A996TAM07_ADMIN_AUTH_FLG, new Boolean(n997TAM07_NC_FLG), A997TAM07_NC_FLG, new Boolean(n998TAM07_NOTE), A998TAM07_NOTE, new Boolean(n214TAM07_DEL_FLG), A214TAM07_DEL_FLG, new Boolean(n230TAM07_CRT_PROG_NM), A230TAM07_CRT_PROG_NM, new Boolean(n232TAM07_UPD_PROG_NM), A232TAM07_UPD_PROG_NM, new Boolean(n56TAM07_AUTH_CD), A56TAM07_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM07_USER") ;
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
            load0A10( ) ;
         }
         endLevel0A10( ) ;
      }
      closeExtendedTableCursors0A10( ) ;
   }

   public void update0A10( )
   {
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0A10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000A8 */
                  pr_default.execute(6, new Object[] {new Boolean(n229TAM07_CRT_DATETIME), A229TAM07_CRT_DATETIME, new Boolean(n264TAM07_CRT_USER_ID), A264TAM07_CRT_USER_ID, new Boolean(n231TAM07_UPD_DATETIME), A231TAM07_UPD_DATETIME, new Boolean(n265TAM07_UPD_USER_ID), A265TAM07_UPD_USER_ID, new Boolean(n299TAM07_UPD_CNT), new Long(A299TAM07_UPD_CNT), new Boolean(n205TAM07_USER_NM), A205TAM07_USER_NM, new Boolean(n313TAM07_USER_KANA_NM), A313TAM07_USER_KANA_NM, new Boolean(n210TAM07_PWD), A210TAM07_PWD, new Boolean(n333TAM07_SITE_ID), A333TAM07_SITE_ID, new Boolean(n683TAM07_EMAIL), A683TAM07_EMAIL, new Boolean(n996TAM07_ADMIN_AUTH_FLG), A996TAM07_ADMIN_AUTH_FLG, new Boolean(n997TAM07_NC_FLG), A997TAM07_NC_FLG, new Boolean(n998TAM07_NOTE), A998TAM07_NOTE, new Boolean(n214TAM07_DEL_FLG), A214TAM07_DEL_FLG, new Boolean(n230TAM07_CRT_PROG_NM), A230TAM07_CRT_PROG_NM, new Boolean(n232TAM07_UPD_PROG_NM), A232TAM07_UPD_PROG_NM, new Boolean(n56TAM07_AUTH_CD), A56TAM07_AUTH_CD, A55TAM07_USER_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM07_USER") ;
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM07_USER"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0A10( ) ;
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
         endLevel0A10( ) ;
      }
      closeExtendedTableCursors0A10( ) ;
   }

   public void deferredUpdate0A10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0A10( ) ;
         afterConfirm0A10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0A10( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000A9 */
               pr_default.execute(7, new Object[] {A55TAM07_USER_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM07_USER") ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0A10( ) ;
      Gx_mode = sMode10 ;
   }

   public void onDeleteControls0A10( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TAM07_USER_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000A10 */
         pr_default.execute(8, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・更新ユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
         /* Using cursor BC000A11 */
         pr_default.execute(9, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・作成ユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor BC000A12 */
         pr_default.execute(10, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・データ固定ユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000A13 */
         pr_default.execute(11, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・承認ユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor BC000A14 */
         pr_default.execute(12, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・アップロードユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC000A15 */
         pr_default.execute(13, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・ロックユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000A16 */
         pr_default.execute(14, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験参加スタッフマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel0A10( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0A10( ) ;
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

   public void scanKeyStart0A10( )
   {
      /* Scan By routine */
      /* Using cursor BC000A17 */
      pr_default.execute(15, new Object[] {A55TAM07_USER_ID});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A55TAM07_USER_ID = BC000A17_A55TAM07_USER_ID[0] ;
         A229TAM07_CRT_DATETIME = BC000A17_A229TAM07_CRT_DATETIME[0] ;
         n229TAM07_CRT_DATETIME = BC000A17_n229TAM07_CRT_DATETIME[0] ;
         A264TAM07_CRT_USER_ID = BC000A17_A264TAM07_CRT_USER_ID[0] ;
         n264TAM07_CRT_USER_ID = BC000A17_n264TAM07_CRT_USER_ID[0] ;
         A231TAM07_UPD_DATETIME = BC000A17_A231TAM07_UPD_DATETIME[0] ;
         n231TAM07_UPD_DATETIME = BC000A17_n231TAM07_UPD_DATETIME[0] ;
         A265TAM07_UPD_USER_ID = BC000A17_A265TAM07_UPD_USER_ID[0] ;
         n265TAM07_UPD_USER_ID = BC000A17_n265TAM07_UPD_USER_ID[0] ;
         A299TAM07_UPD_CNT = BC000A17_A299TAM07_UPD_CNT[0] ;
         n299TAM07_UPD_CNT = BC000A17_n299TAM07_UPD_CNT[0] ;
         A205TAM07_USER_NM = BC000A17_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = BC000A17_n205TAM07_USER_NM[0] ;
         A313TAM07_USER_KANA_NM = BC000A17_A313TAM07_USER_KANA_NM[0] ;
         n313TAM07_USER_KANA_NM = BC000A17_n313TAM07_USER_KANA_NM[0] ;
         A210TAM07_PWD = BC000A17_A210TAM07_PWD[0] ;
         n210TAM07_PWD = BC000A17_n210TAM07_PWD[0] ;
         A333TAM07_SITE_ID = BC000A17_A333TAM07_SITE_ID[0] ;
         n333TAM07_SITE_ID = BC000A17_n333TAM07_SITE_ID[0] ;
         A683TAM07_EMAIL = BC000A17_A683TAM07_EMAIL[0] ;
         n683TAM07_EMAIL = BC000A17_n683TAM07_EMAIL[0] ;
         A996TAM07_ADMIN_AUTH_FLG = BC000A17_A996TAM07_ADMIN_AUTH_FLG[0] ;
         n996TAM07_ADMIN_AUTH_FLG = BC000A17_n996TAM07_ADMIN_AUTH_FLG[0] ;
         A997TAM07_NC_FLG = BC000A17_A997TAM07_NC_FLG[0] ;
         n997TAM07_NC_FLG = BC000A17_n997TAM07_NC_FLG[0] ;
         A998TAM07_NOTE = BC000A17_A998TAM07_NOTE[0] ;
         n998TAM07_NOTE = BC000A17_n998TAM07_NOTE[0] ;
         A214TAM07_DEL_FLG = BC000A17_A214TAM07_DEL_FLG[0] ;
         n214TAM07_DEL_FLG = BC000A17_n214TAM07_DEL_FLG[0] ;
         A230TAM07_CRT_PROG_NM = BC000A17_A230TAM07_CRT_PROG_NM[0] ;
         n230TAM07_CRT_PROG_NM = BC000A17_n230TAM07_CRT_PROG_NM[0] ;
         A232TAM07_UPD_PROG_NM = BC000A17_A232TAM07_UPD_PROG_NM[0] ;
         n232TAM07_UPD_PROG_NM = BC000A17_n232TAM07_UPD_PROG_NM[0] ;
         A56TAM07_AUTH_CD = BC000A17_A56TAM07_AUTH_CD[0] ;
         n56TAM07_AUTH_CD = BC000A17_n56TAM07_AUTH_CD[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0A10( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound10 = (short)(0) ;
      scanKeyLoad0A10( ) ;
   }

   public void scanKeyLoad0A10( )
   {
      sMode10 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A55TAM07_USER_ID = BC000A17_A55TAM07_USER_ID[0] ;
         A229TAM07_CRT_DATETIME = BC000A17_A229TAM07_CRT_DATETIME[0] ;
         n229TAM07_CRT_DATETIME = BC000A17_n229TAM07_CRT_DATETIME[0] ;
         A264TAM07_CRT_USER_ID = BC000A17_A264TAM07_CRT_USER_ID[0] ;
         n264TAM07_CRT_USER_ID = BC000A17_n264TAM07_CRT_USER_ID[0] ;
         A231TAM07_UPD_DATETIME = BC000A17_A231TAM07_UPD_DATETIME[0] ;
         n231TAM07_UPD_DATETIME = BC000A17_n231TAM07_UPD_DATETIME[0] ;
         A265TAM07_UPD_USER_ID = BC000A17_A265TAM07_UPD_USER_ID[0] ;
         n265TAM07_UPD_USER_ID = BC000A17_n265TAM07_UPD_USER_ID[0] ;
         A299TAM07_UPD_CNT = BC000A17_A299TAM07_UPD_CNT[0] ;
         n299TAM07_UPD_CNT = BC000A17_n299TAM07_UPD_CNT[0] ;
         A205TAM07_USER_NM = BC000A17_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = BC000A17_n205TAM07_USER_NM[0] ;
         A313TAM07_USER_KANA_NM = BC000A17_A313TAM07_USER_KANA_NM[0] ;
         n313TAM07_USER_KANA_NM = BC000A17_n313TAM07_USER_KANA_NM[0] ;
         A210TAM07_PWD = BC000A17_A210TAM07_PWD[0] ;
         n210TAM07_PWD = BC000A17_n210TAM07_PWD[0] ;
         A333TAM07_SITE_ID = BC000A17_A333TAM07_SITE_ID[0] ;
         n333TAM07_SITE_ID = BC000A17_n333TAM07_SITE_ID[0] ;
         A683TAM07_EMAIL = BC000A17_A683TAM07_EMAIL[0] ;
         n683TAM07_EMAIL = BC000A17_n683TAM07_EMAIL[0] ;
         A996TAM07_ADMIN_AUTH_FLG = BC000A17_A996TAM07_ADMIN_AUTH_FLG[0] ;
         n996TAM07_ADMIN_AUTH_FLG = BC000A17_n996TAM07_ADMIN_AUTH_FLG[0] ;
         A997TAM07_NC_FLG = BC000A17_A997TAM07_NC_FLG[0] ;
         n997TAM07_NC_FLG = BC000A17_n997TAM07_NC_FLG[0] ;
         A998TAM07_NOTE = BC000A17_A998TAM07_NOTE[0] ;
         n998TAM07_NOTE = BC000A17_n998TAM07_NOTE[0] ;
         A214TAM07_DEL_FLG = BC000A17_A214TAM07_DEL_FLG[0] ;
         n214TAM07_DEL_FLG = BC000A17_n214TAM07_DEL_FLG[0] ;
         A230TAM07_CRT_PROG_NM = BC000A17_A230TAM07_CRT_PROG_NM[0] ;
         n230TAM07_CRT_PROG_NM = BC000A17_n230TAM07_CRT_PROG_NM[0] ;
         A232TAM07_UPD_PROG_NM = BC000A17_A232TAM07_UPD_PROG_NM[0] ;
         n232TAM07_UPD_PROG_NM = BC000A17_n232TAM07_UPD_PROG_NM[0] ;
         A56TAM07_AUTH_CD = BC000A17_A56TAM07_AUTH_CD[0] ;
         n56TAM07_AUTH_CD = BC000A17_n56TAM07_AUTH_CD[0] ;
      }
      Gx_mode = sMode10 ;
   }

   public void scanKeyEnd0A10( )
   {
      pr_default.close(15);
   }

   public void afterConfirm0A10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A10( )
   {
      /* Before Insert Rules */
      A229TAM07_CRT_DATETIME = GXutil.now( ) ;
      n229TAM07_CRT_DATETIME = false ;
      GXt_char1 = A264TAM07_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      A264TAM07_CRT_USER_ID = GXt_char1 ;
      n264TAM07_CRT_USER_ID = false ;
      A231TAM07_UPD_DATETIME = GXutil.now( ) ;
      n231TAM07_UPD_DATETIME = false ;
      GXt_char1 = A265TAM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      A265TAM07_UPD_USER_ID = GXt_char1 ;
      n265TAM07_UPD_USER_ID = false ;
      A299TAM07_UPD_CNT = (long)(O299TAM07_UPD_CNT+1) ;
      n299TAM07_UPD_CNT = false ;
   }

   public void beforeUpdate0A10( )
   {
      /* Before Update Rules */
      A231TAM07_UPD_DATETIME = GXutil.now( ) ;
      n231TAM07_UPD_DATETIME = false ;
      GXt_char1 = A265TAM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      A265TAM07_UPD_USER_ID = GXt_char1 ;
      n265TAM07_UPD_USER_ID = false ;
      A299TAM07_UPD_CNT = (long)(O299TAM07_UPD_CNT+1) ;
      n299TAM07_UPD_CNT = false ;
   }

   public void beforeDelete0A10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0A10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0A10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0A10( )
   {
   }

   public void addRow0A10( )
   {
      VarsToRow10( bcTAM07_USER) ;
   }

   public void readRow0A10( )
   {
      RowToVars10( bcTAM07_USER, 1) ;
   }

   public void initializeNonKey0A10( )
   {
      A229TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n229TAM07_CRT_DATETIME = false ;
      A264TAM07_CRT_USER_ID = "" ;
      n264TAM07_CRT_USER_ID = false ;
      A231TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n231TAM07_UPD_DATETIME = false ;
      A265TAM07_UPD_USER_ID = "" ;
      n265TAM07_UPD_USER_ID = false ;
      A299TAM07_UPD_CNT = 0 ;
      n299TAM07_UPD_CNT = false ;
      A205TAM07_USER_NM = "" ;
      n205TAM07_USER_NM = false ;
      A313TAM07_USER_KANA_NM = "" ;
      n313TAM07_USER_KANA_NM = false ;
      A210TAM07_PWD = "" ;
      n210TAM07_PWD = false ;
      A56TAM07_AUTH_CD = "" ;
      n56TAM07_AUTH_CD = false ;
      A333TAM07_SITE_ID = "" ;
      n333TAM07_SITE_ID = false ;
      A683TAM07_EMAIL = "" ;
      n683TAM07_EMAIL = false ;
      A996TAM07_ADMIN_AUTH_FLG = "" ;
      n996TAM07_ADMIN_AUTH_FLG = false ;
      A997TAM07_NC_FLG = "" ;
      n997TAM07_NC_FLG = false ;
      A998TAM07_NOTE = "" ;
      n998TAM07_NOTE = false ;
      A214TAM07_DEL_FLG = "" ;
      n214TAM07_DEL_FLG = false ;
      A230TAM07_CRT_PROG_NM = "" ;
      n230TAM07_CRT_PROG_NM = false ;
      A232TAM07_UPD_PROG_NM = "" ;
      n232TAM07_UPD_PROG_NM = false ;
      O299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
      n299TAM07_UPD_CNT = false ;
   }

   public void initAll0A10( )
   {
      A55TAM07_USER_ID = "" ;
      initializeNonKey0A10( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow10( SdtTAM07_USER obj10 )
   {
      obj10.setgxTv_SdtTAM07_USER_Mode( Gx_mode );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_datetime( A229TAM07_CRT_DATETIME );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_user_id( A264TAM07_CRT_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_datetime( A231TAM07_UPD_DATETIME );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_user_id( A265TAM07_UPD_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_cnt( A299TAM07_UPD_CNT );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_nm( A205TAM07_USER_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm( A313TAM07_USER_KANA_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_pwd( A210TAM07_PWD );
      obj10.setgxTv_SdtTAM07_USER_Tam07_auth_cd( A56TAM07_AUTH_CD );
      obj10.setgxTv_SdtTAM07_USER_Tam07_site_id( A333TAM07_SITE_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_email( A683TAM07_EMAIL );
      obj10.setgxTv_SdtTAM07_USER_Tam07_admin_auth_flg( A996TAM07_ADMIN_AUTH_FLG );
      obj10.setgxTv_SdtTAM07_USER_Tam07_nc_flg( A997TAM07_NC_FLG );
      obj10.setgxTv_SdtTAM07_USER_Tam07_note( A998TAM07_NOTE );
      obj10.setgxTv_SdtTAM07_USER_Tam07_del_flg( A214TAM07_DEL_FLG );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm( A230TAM07_CRT_PROG_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( A232TAM07_UPD_PROG_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_id( A55TAM07_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_id_Z( Z55TAM07_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_nm_Z( Z205TAM07_USER_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z( Z313TAM07_USER_KANA_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_pwd_Z( Z210TAM07_PWD );
      obj10.setgxTv_SdtTAM07_USER_Tam07_auth_cd_Z( Z56TAM07_AUTH_CD );
      obj10.setgxTv_SdtTAM07_USER_Tam07_site_id_Z( Z333TAM07_SITE_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_email_Z( Z683TAM07_EMAIL );
      obj10.setgxTv_SdtTAM07_USER_Tam07_admin_auth_flg_Z( Z996TAM07_ADMIN_AUTH_FLG );
      obj10.setgxTv_SdtTAM07_USER_Tam07_nc_flg_Z( Z997TAM07_NC_FLG );
      obj10.setgxTv_SdtTAM07_USER_Tam07_note_Z( Z998TAM07_NOTE );
      obj10.setgxTv_SdtTAM07_USER_Tam07_del_flg_Z( Z214TAM07_DEL_FLG );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z( Z229TAM07_CRT_DATETIME );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z( Z264TAM07_CRT_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z( Z230TAM07_CRT_PROG_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z( Z231TAM07_UPD_DATETIME );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z( Z265TAM07_UPD_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z( Z232TAM07_UPD_PROG_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z( Z299TAM07_UPD_CNT );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_nm_N( (byte)((byte)((n205TAM07_USER_NM)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N( (byte)((byte)((n313TAM07_USER_KANA_NM)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_pwd_N( (byte)((byte)((n210TAM07_PWD)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_auth_cd_N( (byte)((byte)((n56TAM07_AUTH_CD)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_site_id_N( (byte)((byte)((n333TAM07_SITE_ID)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_email_N( (byte)((byte)((n683TAM07_EMAIL)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_admin_auth_flg_N( (byte)((byte)((n996TAM07_ADMIN_AUTH_FLG)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_nc_flg_N( (byte)((byte)((n997TAM07_NC_FLG)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_note_N( (byte)((byte)((n998TAM07_NOTE)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_del_flg_N( (byte)((byte)((n214TAM07_DEL_FLG)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_datetime_N( (byte)((byte)((n229TAM07_CRT_DATETIME)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_user_id_N( (byte)((byte)((n264TAM07_CRT_USER_ID)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N( (byte)((byte)((n230TAM07_CRT_PROG_NM)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_datetime_N( (byte)((byte)((n231TAM07_UPD_DATETIME)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_user_id_N( (byte)((byte)((n265TAM07_UPD_USER_ID)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N( (byte)((byte)((n232TAM07_UPD_PROG_NM)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_cnt_N( (byte)((byte)((n299TAM07_UPD_CNT)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Mode( Gx_mode );
   }

   public void KeyVarsToRow10( SdtTAM07_USER obj10 )
   {
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_id( A55TAM07_USER_ID );
   }

   public void RowToVars10( SdtTAM07_USER obj10 ,
                            int forceLoad )
   {
      Gx_mode = obj10.getgxTv_SdtTAM07_USER_Mode() ;
      A229TAM07_CRT_DATETIME = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_datetime() ;
      n229TAM07_CRT_DATETIME = false ;
      A264TAM07_CRT_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_user_id() ;
      n264TAM07_CRT_USER_ID = false ;
      A231TAM07_UPD_DATETIME = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_datetime() ;
      n231TAM07_UPD_DATETIME = false ;
      A265TAM07_UPD_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_user_id() ;
      n265TAM07_UPD_USER_ID = false ;
      A299TAM07_UPD_CNT = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_cnt() ;
      n299TAM07_UPD_CNT = false ;
      A205TAM07_USER_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_user_nm() ;
      n205TAM07_USER_NM = false ;
      A313TAM07_USER_KANA_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm() ;
      n313TAM07_USER_KANA_NM = false ;
      A210TAM07_PWD = obj10.getgxTv_SdtTAM07_USER_Tam07_pwd() ;
      n210TAM07_PWD = false ;
      A56TAM07_AUTH_CD = obj10.getgxTv_SdtTAM07_USER_Tam07_auth_cd() ;
      n56TAM07_AUTH_CD = false ;
      A333TAM07_SITE_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_site_id() ;
      n333TAM07_SITE_ID = false ;
      A683TAM07_EMAIL = obj10.getgxTv_SdtTAM07_USER_Tam07_email() ;
      n683TAM07_EMAIL = false ;
      A996TAM07_ADMIN_AUTH_FLG = obj10.getgxTv_SdtTAM07_USER_Tam07_admin_auth_flg() ;
      n996TAM07_ADMIN_AUTH_FLG = false ;
      A997TAM07_NC_FLG = obj10.getgxTv_SdtTAM07_USER_Tam07_nc_flg() ;
      n997TAM07_NC_FLG = false ;
      A998TAM07_NOTE = obj10.getgxTv_SdtTAM07_USER_Tam07_note() ;
      n998TAM07_NOTE = false ;
      A214TAM07_DEL_FLG = obj10.getgxTv_SdtTAM07_USER_Tam07_del_flg() ;
      n214TAM07_DEL_FLG = false ;
      A230TAM07_CRT_PROG_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm() ;
      n230TAM07_CRT_PROG_NM = false ;
      A232TAM07_UPD_PROG_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm() ;
      n232TAM07_UPD_PROG_NM = false ;
      A55TAM07_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_user_id() ;
      Z55TAM07_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_user_id_Z() ;
      Z205TAM07_USER_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_user_nm_Z() ;
      Z313TAM07_USER_KANA_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z() ;
      Z210TAM07_PWD = obj10.getgxTv_SdtTAM07_USER_Tam07_pwd_Z() ;
      Z56TAM07_AUTH_CD = obj10.getgxTv_SdtTAM07_USER_Tam07_auth_cd_Z() ;
      Z333TAM07_SITE_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_site_id_Z() ;
      Z683TAM07_EMAIL = obj10.getgxTv_SdtTAM07_USER_Tam07_email_Z() ;
      Z996TAM07_ADMIN_AUTH_FLG = obj10.getgxTv_SdtTAM07_USER_Tam07_admin_auth_flg_Z() ;
      Z997TAM07_NC_FLG = obj10.getgxTv_SdtTAM07_USER_Tam07_nc_flg_Z() ;
      Z998TAM07_NOTE = obj10.getgxTv_SdtTAM07_USER_Tam07_note_Z() ;
      Z214TAM07_DEL_FLG = obj10.getgxTv_SdtTAM07_USER_Tam07_del_flg_Z() ;
      Z229TAM07_CRT_DATETIME = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z() ;
      Z264TAM07_CRT_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z() ;
      Z230TAM07_CRT_PROG_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z() ;
      Z231TAM07_UPD_DATETIME = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z() ;
      Z265TAM07_UPD_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z() ;
      Z232TAM07_UPD_PROG_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z() ;
      Z299TAM07_UPD_CNT = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z() ;
      O299TAM07_UPD_CNT = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z() ;
      n205TAM07_USER_NM = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_user_nm_N()==0)?false:true) ;
      n313TAM07_USER_KANA_NM = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N()==0)?false:true) ;
      n210TAM07_PWD = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_pwd_N()==0)?false:true) ;
      n56TAM07_AUTH_CD = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_auth_cd_N()==0)?false:true) ;
      n333TAM07_SITE_ID = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_site_id_N()==0)?false:true) ;
      n683TAM07_EMAIL = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_email_N()==0)?false:true) ;
      n996TAM07_ADMIN_AUTH_FLG = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_admin_auth_flg_N()==0)?false:true) ;
      n997TAM07_NC_FLG = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_nc_flg_N()==0)?false:true) ;
      n998TAM07_NOTE = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_note_N()==0)?false:true) ;
      n214TAM07_DEL_FLG = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_del_flg_N()==0)?false:true) ;
      n229TAM07_CRT_DATETIME = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_crt_datetime_N()==0)?false:true) ;
      n264TAM07_CRT_USER_ID = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_crt_user_id_N()==0)?false:true) ;
      n230TAM07_CRT_PROG_NM = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N()==0)?false:true) ;
      n231TAM07_UPD_DATETIME = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_upd_datetime_N()==0)?false:true) ;
      n265TAM07_UPD_USER_ID = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_upd_user_id_N()==0)?false:true) ;
      n232TAM07_UPD_PROG_NM = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N()==0)?false:true) ;
      n299TAM07_UPD_CNT = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj10.getgxTv_SdtTAM07_USER_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A55TAM07_USER_ID = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0A10( ) ;
      scanKeyStart0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z55TAM07_USER_ID = A55TAM07_USER_ID ;
         O299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
         n299TAM07_UPD_CNT = false ;
      }
      zm0A10( -8) ;
      onLoadActions0A10( ) ;
      addRow0A10( ) ;
      scanKeyEnd0A10( ) ;
      if ( RcdFound10 == 0 )
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
      RowToVars10( bcTAM07_USER, 0) ;
      scanKeyStart0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z55TAM07_USER_ID = A55TAM07_USER_ID ;
         O299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
         n299TAM07_UPD_CNT = false ;
      }
      zm0A10( -8) ;
      onLoadActions0A10( ) ;
      addRow0A10( ) ;
      scanKeyEnd0A10( ) ;
      if ( RcdFound10 == 0 )
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
      RowToVars10( bcTAM07_USER, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0A10( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0A10( ) ;
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( GXutil.strcmp(A55TAM07_USER_ID, Z55TAM07_USER_ID) != 0 )
            {
               A55TAM07_USER_ID = Z55TAM07_USER_ID ;
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
               update0A10( ) ;
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
               if ( GXutil.strcmp(A55TAM07_USER_ID, Z55TAM07_USER_ID) != 0 )
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
                     insert0A10( ) ;
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
                     insert0A10( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow10( bcTAM07_USER) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars10( bcTAM07_USER, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0A10( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A55TAM07_USER_ID, Z55TAM07_USER_ID) != 0 )
         {
            A55TAM07_USER_ID = Z55TAM07_USER_ID ;
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
         if ( GXutil.strcmp(A55TAM07_USER_ID, Z55TAM07_USER_ID) != 0 )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tam07_user_bc");
      VarsToRow10( bcTAM07_USER) ;
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
      Gx_mode = bcTAM07_USER.getgxTv_SdtTAM07_USER_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTAM07_USER.setgxTv_SdtTAM07_USER_Mode( Gx_mode );
   }

   public void SetSDT( SdtTAM07_USER sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTAM07_USER )
      {
         bcTAM07_USER = sdt ;
         if ( GXutil.strcmp(bcTAM07_USER.getgxTv_SdtTAM07_USER_Mode(), "") == 0 )
         {
            bcTAM07_USER.setgxTv_SdtTAM07_USER_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow10( bcTAM07_USER) ;
         }
         else
         {
            RowToVars10( bcTAM07_USER, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTAM07_USER.getgxTv_SdtTAM07_USER_Mode(), "") == 0 )
         {
            bcTAM07_USER.setgxTv_SdtTAM07_USER_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars10( bcTAM07_USER, 1) ;
   }

   public SdtTAM07_USER getTAM07_USER_BC( )
   {
      return bcTAM07_USER ;
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
      pr_default.close(2);
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
      Z55TAM07_USER_ID = "" ;
      A55TAM07_USER_ID = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A205TAM07_USER_NM = "" ;
      A313TAM07_USER_KANA_NM = "" ;
      A210TAM07_PWD = "" ;
      A56TAM07_AUTH_CD = "" ;
      A333TAM07_SITE_ID = "" ;
      A214TAM07_DEL_FLG = "" ;
      A229TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A264TAM07_CRT_USER_ID = "" ;
      A230TAM07_CRT_PROG_NM = "" ;
      A231TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A265TAM07_UPD_USER_ID = "" ;
      A232TAM07_UPD_PROG_NM = "" ;
      Z229TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z264TAM07_CRT_USER_ID = "" ;
      Z231TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z265TAM07_UPD_USER_ID = "" ;
      Z205TAM07_USER_NM = "" ;
      Z313TAM07_USER_KANA_NM = "" ;
      Z210TAM07_PWD = "" ;
      Z333TAM07_SITE_ID = "" ;
      Z683TAM07_EMAIL = "" ;
      A683TAM07_EMAIL = "" ;
      Z996TAM07_ADMIN_AUTH_FLG = "" ;
      A996TAM07_ADMIN_AUTH_FLG = "" ;
      Z997TAM07_NC_FLG = "" ;
      A997TAM07_NC_FLG = "" ;
      Z998TAM07_NOTE = "" ;
      A998TAM07_NOTE = "" ;
      Z214TAM07_DEL_FLG = "" ;
      Z230TAM07_CRT_PROG_NM = "" ;
      Z232TAM07_UPD_PROG_NM = "" ;
      Z56TAM07_AUTH_CD = "" ;
      BC000A5_A55TAM07_USER_ID = new String[] {""} ;
      BC000A5_A229TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A5_n229TAM07_CRT_DATETIME = new boolean[] {false} ;
      BC000A5_A264TAM07_CRT_USER_ID = new String[] {""} ;
      BC000A5_n264TAM07_CRT_USER_ID = new boolean[] {false} ;
      BC000A5_A231TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A5_n231TAM07_UPD_DATETIME = new boolean[] {false} ;
      BC000A5_A265TAM07_UPD_USER_ID = new String[] {""} ;
      BC000A5_n265TAM07_UPD_USER_ID = new boolean[] {false} ;
      BC000A5_A299TAM07_UPD_CNT = new long[1] ;
      BC000A5_n299TAM07_UPD_CNT = new boolean[] {false} ;
      BC000A5_A205TAM07_USER_NM = new String[] {""} ;
      BC000A5_n205TAM07_USER_NM = new boolean[] {false} ;
      BC000A5_A313TAM07_USER_KANA_NM = new String[] {""} ;
      BC000A5_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      BC000A5_A210TAM07_PWD = new String[] {""} ;
      BC000A5_n210TAM07_PWD = new boolean[] {false} ;
      BC000A5_A333TAM07_SITE_ID = new String[] {""} ;
      BC000A5_n333TAM07_SITE_ID = new boolean[] {false} ;
      BC000A5_A683TAM07_EMAIL = new String[] {""} ;
      BC000A5_n683TAM07_EMAIL = new boolean[] {false} ;
      BC000A5_A996TAM07_ADMIN_AUTH_FLG = new String[] {""} ;
      BC000A5_n996TAM07_ADMIN_AUTH_FLG = new boolean[] {false} ;
      BC000A5_A997TAM07_NC_FLG = new String[] {""} ;
      BC000A5_n997TAM07_NC_FLG = new boolean[] {false} ;
      BC000A5_A998TAM07_NOTE = new String[] {""} ;
      BC000A5_n998TAM07_NOTE = new boolean[] {false} ;
      BC000A5_A214TAM07_DEL_FLG = new String[] {""} ;
      BC000A5_n214TAM07_DEL_FLG = new boolean[] {false} ;
      BC000A5_A230TAM07_CRT_PROG_NM = new String[] {""} ;
      BC000A5_n230TAM07_CRT_PROG_NM = new boolean[] {false} ;
      BC000A5_A232TAM07_UPD_PROG_NM = new String[] {""} ;
      BC000A5_n232TAM07_UPD_PROG_NM = new boolean[] {false} ;
      BC000A5_A56TAM07_AUTH_CD = new String[] {""} ;
      BC000A5_n56TAM07_AUTH_CD = new boolean[] {false} ;
      BC000A4_A56TAM07_AUTH_CD = new String[] {""} ;
      BC000A4_n56TAM07_AUTH_CD = new boolean[] {false} ;
      BC000A6_A55TAM07_USER_ID = new String[] {""} ;
      BC000A3_A55TAM07_USER_ID = new String[] {""} ;
      BC000A3_A229TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A3_n229TAM07_CRT_DATETIME = new boolean[] {false} ;
      BC000A3_A264TAM07_CRT_USER_ID = new String[] {""} ;
      BC000A3_n264TAM07_CRT_USER_ID = new boolean[] {false} ;
      BC000A3_A231TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A3_n231TAM07_UPD_DATETIME = new boolean[] {false} ;
      BC000A3_A265TAM07_UPD_USER_ID = new String[] {""} ;
      BC000A3_n265TAM07_UPD_USER_ID = new boolean[] {false} ;
      BC000A3_A299TAM07_UPD_CNT = new long[1] ;
      BC000A3_n299TAM07_UPD_CNT = new boolean[] {false} ;
      BC000A3_A205TAM07_USER_NM = new String[] {""} ;
      BC000A3_n205TAM07_USER_NM = new boolean[] {false} ;
      BC000A3_A313TAM07_USER_KANA_NM = new String[] {""} ;
      BC000A3_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      BC000A3_A210TAM07_PWD = new String[] {""} ;
      BC000A3_n210TAM07_PWD = new boolean[] {false} ;
      BC000A3_A333TAM07_SITE_ID = new String[] {""} ;
      BC000A3_n333TAM07_SITE_ID = new boolean[] {false} ;
      BC000A3_A683TAM07_EMAIL = new String[] {""} ;
      BC000A3_n683TAM07_EMAIL = new boolean[] {false} ;
      BC000A3_A996TAM07_ADMIN_AUTH_FLG = new String[] {""} ;
      BC000A3_n996TAM07_ADMIN_AUTH_FLG = new boolean[] {false} ;
      BC000A3_A997TAM07_NC_FLG = new String[] {""} ;
      BC000A3_n997TAM07_NC_FLG = new boolean[] {false} ;
      BC000A3_A998TAM07_NOTE = new String[] {""} ;
      BC000A3_n998TAM07_NOTE = new boolean[] {false} ;
      BC000A3_A214TAM07_DEL_FLG = new String[] {""} ;
      BC000A3_n214TAM07_DEL_FLG = new boolean[] {false} ;
      BC000A3_A230TAM07_CRT_PROG_NM = new String[] {""} ;
      BC000A3_n230TAM07_CRT_PROG_NM = new boolean[] {false} ;
      BC000A3_A232TAM07_UPD_PROG_NM = new String[] {""} ;
      BC000A3_n232TAM07_UPD_PROG_NM = new boolean[] {false} ;
      BC000A3_A56TAM07_AUTH_CD = new String[] {""} ;
      BC000A3_n56TAM07_AUTH_CD = new boolean[] {false} ;
      sMode10 = "" ;
      BC000A2_A55TAM07_USER_ID = new String[] {""} ;
      BC000A2_A229TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A2_n229TAM07_CRT_DATETIME = new boolean[] {false} ;
      BC000A2_A264TAM07_CRT_USER_ID = new String[] {""} ;
      BC000A2_n264TAM07_CRT_USER_ID = new boolean[] {false} ;
      BC000A2_A231TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A2_n231TAM07_UPD_DATETIME = new boolean[] {false} ;
      BC000A2_A265TAM07_UPD_USER_ID = new String[] {""} ;
      BC000A2_n265TAM07_UPD_USER_ID = new boolean[] {false} ;
      BC000A2_A299TAM07_UPD_CNT = new long[1] ;
      BC000A2_n299TAM07_UPD_CNT = new boolean[] {false} ;
      BC000A2_A205TAM07_USER_NM = new String[] {""} ;
      BC000A2_n205TAM07_USER_NM = new boolean[] {false} ;
      BC000A2_A313TAM07_USER_KANA_NM = new String[] {""} ;
      BC000A2_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      BC000A2_A210TAM07_PWD = new String[] {""} ;
      BC000A2_n210TAM07_PWD = new boolean[] {false} ;
      BC000A2_A333TAM07_SITE_ID = new String[] {""} ;
      BC000A2_n333TAM07_SITE_ID = new boolean[] {false} ;
      BC000A2_A683TAM07_EMAIL = new String[] {""} ;
      BC000A2_n683TAM07_EMAIL = new boolean[] {false} ;
      BC000A2_A996TAM07_ADMIN_AUTH_FLG = new String[] {""} ;
      BC000A2_n996TAM07_ADMIN_AUTH_FLG = new boolean[] {false} ;
      BC000A2_A997TAM07_NC_FLG = new String[] {""} ;
      BC000A2_n997TAM07_NC_FLG = new boolean[] {false} ;
      BC000A2_A998TAM07_NOTE = new String[] {""} ;
      BC000A2_n998TAM07_NOTE = new boolean[] {false} ;
      BC000A2_A214TAM07_DEL_FLG = new String[] {""} ;
      BC000A2_n214TAM07_DEL_FLG = new boolean[] {false} ;
      BC000A2_A230TAM07_CRT_PROG_NM = new String[] {""} ;
      BC000A2_n230TAM07_CRT_PROG_NM = new boolean[] {false} ;
      BC000A2_A232TAM07_UPD_PROG_NM = new String[] {""} ;
      BC000A2_n232TAM07_UPD_PROG_NM = new boolean[] {false} ;
      BC000A2_A56TAM07_AUTH_CD = new String[] {""} ;
      BC000A2_n56TAM07_AUTH_CD = new boolean[] {false} ;
      BC000A10_A110TBW03_SESSION_ID = new String[] {""} ;
      BC000A10_A111TBW03_APP_ID = new String[] {""} ;
      BC000A10_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A10_A113TBW03_STUDY_ID = new long[1] ;
      BC000A10_A114TBW03_SUBJECT_ID = new int[1] ;
      BC000A10_A115TBW03_CRF_ID = new short[1] ;
      BC000A11_A110TBW03_SESSION_ID = new String[] {""} ;
      BC000A11_A111TBW03_APP_ID = new String[] {""} ;
      BC000A11_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A11_A113TBW03_STUDY_ID = new long[1] ;
      BC000A11_A114TBW03_SUBJECT_ID = new int[1] ;
      BC000A11_A115TBW03_CRF_ID = new short[1] ;
      BC000A12_A110TBW03_SESSION_ID = new String[] {""} ;
      BC000A12_A111TBW03_APP_ID = new String[] {""} ;
      BC000A12_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A12_A113TBW03_STUDY_ID = new long[1] ;
      BC000A12_A114TBW03_SUBJECT_ID = new int[1] ;
      BC000A12_A115TBW03_CRF_ID = new short[1] ;
      BC000A13_A110TBW03_SESSION_ID = new String[] {""} ;
      BC000A13_A111TBW03_APP_ID = new String[] {""} ;
      BC000A13_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A13_A113TBW03_STUDY_ID = new long[1] ;
      BC000A13_A114TBW03_SUBJECT_ID = new int[1] ;
      BC000A13_A115TBW03_CRF_ID = new short[1] ;
      BC000A14_A110TBW03_SESSION_ID = new String[] {""} ;
      BC000A14_A111TBW03_APP_ID = new String[] {""} ;
      BC000A14_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A14_A113TBW03_STUDY_ID = new long[1] ;
      BC000A14_A114TBW03_SUBJECT_ID = new int[1] ;
      BC000A14_A115TBW03_CRF_ID = new short[1] ;
      BC000A15_A110TBW03_SESSION_ID = new String[] {""} ;
      BC000A15_A111TBW03_APP_ID = new String[] {""} ;
      BC000A15_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A15_A113TBW03_STUDY_ID = new long[1] ;
      BC000A15_A114TBW03_SUBJECT_ID = new int[1] ;
      BC000A15_A115TBW03_CRF_ID = new short[1] ;
      BC000A16_A107TBM23_STUDY_ID = new long[1] ;
      BC000A16_A108TBM23_USER_ID = new String[] {""} ;
      BC000A16_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000A17_A55TAM07_USER_ID = new String[] {""} ;
      BC000A17_A229TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A17_n229TAM07_CRT_DATETIME = new boolean[] {false} ;
      BC000A17_A264TAM07_CRT_USER_ID = new String[] {""} ;
      BC000A17_n264TAM07_CRT_USER_ID = new boolean[] {false} ;
      BC000A17_A231TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A17_n231TAM07_UPD_DATETIME = new boolean[] {false} ;
      BC000A17_A265TAM07_UPD_USER_ID = new String[] {""} ;
      BC000A17_n265TAM07_UPD_USER_ID = new boolean[] {false} ;
      BC000A17_A299TAM07_UPD_CNT = new long[1] ;
      BC000A17_n299TAM07_UPD_CNT = new boolean[] {false} ;
      BC000A17_A205TAM07_USER_NM = new String[] {""} ;
      BC000A17_n205TAM07_USER_NM = new boolean[] {false} ;
      BC000A17_A313TAM07_USER_KANA_NM = new String[] {""} ;
      BC000A17_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      BC000A17_A210TAM07_PWD = new String[] {""} ;
      BC000A17_n210TAM07_PWD = new boolean[] {false} ;
      BC000A17_A333TAM07_SITE_ID = new String[] {""} ;
      BC000A17_n333TAM07_SITE_ID = new boolean[] {false} ;
      BC000A17_A683TAM07_EMAIL = new String[] {""} ;
      BC000A17_n683TAM07_EMAIL = new boolean[] {false} ;
      BC000A17_A996TAM07_ADMIN_AUTH_FLG = new String[] {""} ;
      BC000A17_n996TAM07_ADMIN_AUTH_FLG = new boolean[] {false} ;
      BC000A17_A997TAM07_NC_FLG = new String[] {""} ;
      BC000A17_n997TAM07_NC_FLG = new boolean[] {false} ;
      BC000A17_A998TAM07_NOTE = new String[] {""} ;
      BC000A17_n998TAM07_NOTE = new boolean[] {false} ;
      BC000A17_A214TAM07_DEL_FLG = new String[] {""} ;
      BC000A17_n214TAM07_DEL_FLG = new boolean[] {false} ;
      BC000A17_A230TAM07_CRT_PROG_NM = new String[] {""} ;
      BC000A17_n230TAM07_CRT_PROG_NM = new boolean[] {false} ;
      BC000A17_A232TAM07_UPD_PROG_NM = new String[] {""} ;
      BC000A17_n232TAM07_UPD_PROG_NM = new boolean[] {false} ;
      BC000A17_A56TAM07_AUTH_CD = new String[] {""} ;
      BC000A17_n56TAM07_AUTH_CD = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam07_user_bc__default(),
         new Object[] {
             new Object[] {
            BC000A2_A55TAM07_USER_ID, BC000A2_A229TAM07_CRT_DATETIME, BC000A2_n229TAM07_CRT_DATETIME, BC000A2_A264TAM07_CRT_USER_ID, BC000A2_n264TAM07_CRT_USER_ID, BC000A2_A231TAM07_UPD_DATETIME, BC000A2_n231TAM07_UPD_DATETIME, BC000A2_A265TAM07_UPD_USER_ID, BC000A2_n265TAM07_UPD_USER_ID, BC000A2_A299TAM07_UPD_CNT,
            BC000A2_n299TAM07_UPD_CNT, BC000A2_A205TAM07_USER_NM, BC000A2_n205TAM07_USER_NM, BC000A2_A313TAM07_USER_KANA_NM, BC000A2_n313TAM07_USER_KANA_NM, BC000A2_A210TAM07_PWD, BC000A2_n210TAM07_PWD, BC000A2_A333TAM07_SITE_ID, BC000A2_n333TAM07_SITE_ID, BC000A2_A683TAM07_EMAIL,
            BC000A2_n683TAM07_EMAIL, BC000A2_A996TAM07_ADMIN_AUTH_FLG, BC000A2_n996TAM07_ADMIN_AUTH_FLG, BC000A2_A997TAM07_NC_FLG, BC000A2_n997TAM07_NC_FLG, BC000A2_A998TAM07_NOTE, BC000A2_n998TAM07_NOTE, BC000A2_A214TAM07_DEL_FLG, BC000A2_n214TAM07_DEL_FLG, BC000A2_A230TAM07_CRT_PROG_NM,
            BC000A2_n230TAM07_CRT_PROG_NM, BC000A2_A232TAM07_UPD_PROG_NM, BC000A2_n232TAM07_UPD_PROG_NM, BC000A2_A56TAM07_AUTH_CD, BC000A2_n56TAM07_AUTH_CD
            }
            , new Object[] {
            BC000A3_A55TAM07_USER_ID, BC000A3_A229TAM07_CRT_DATETIME, BC000A3_n229TAM07_CRT_DATETIME, BC000A3_A264TAM07_CRT_USER_ID, BC000A3_n264TAM07_CRT_USER_ID, BC000A3_A231TAM07_UPD_DATETIME, BC000A3_n231TAM07_UPD_DATETIME, BC000A3_A265TAM07_UPD_USER_ID, BC000A3_n265TAM07_UPD_USER_ID, BC000A3_A299TAM07_UPD_CNT,
            BC000A3_n299TAM07_UPD_CNT, BC000A3_A205TAM07_USER_NM, BC000A3_n205TAM07_USER_NM, BC000A3_A313TAM07_USER_KANA_NM, BC000A3_n313TAM07_USER_KANA_NM, BC000A3_A210TAM07_PWD, BC000A3_n210TAM07_PWD, BC000A3_A333TAM07_SITE_ID, BC000A3_n333TAM07_SITE_ID, BC000A3_A683TAM07_EMAIL,
            BC000A3_n683TAM07_EMAIL, BC000A3_A996TAM07_ADMIN_AUTH_FLG, BC000A3_n996TAM07_ADMIN_AUTH_FLG, BC000A3_A997TAM07_NC_FLG, BC000A3_n997TAM07_NC_FLG, BC000A3_A998TAM07_NOTE, BC000A3_n998TAM07_NOTE, BC000A3_A214TAM07_DEL_FLG, BC000A3_n214TAM07_DEL_FLG, BC000A3_A230TAM07_CRT_PROG_NM,
            BC000A3_n230TAM07_CRT_PROG_NM, BC000A3_A232TAM07_UPD_PROG_NM, BC000A3_n232TAM07_UPD_PROG_NM, BC000A3_A56TAM07_AUTH_CD, BC000A3_n56TAM07_AUTH_CD
            }
            , new Object[] {
            BC000A4_A56TAM07_AUTH_CD
            }
            , new Object[] {
            BC000A5_A55TAM07_USER_ID, BC000A5_A229TAM07_CRT_DATETIME, BC000A5_n229TAM07_CRT_DATETIME, BC000A5_A264TAM07_CRT_USER_ID, BC000A5_n264TAM07_CRT_USER_ID, BC000A5_A231TAM07_UPD_DATETIME, BC000A5_n231TAM07_UPD_DATETIME, BC000A5_A265TAM07_UPD_USER_ID, BC000A5_n265TAM07_UPD_USER_ID, BC000A5_A299TAM07_UPD_CNT,
            BC000A5_n299TAM07_UPD_CNT, BC000A5_A205TAM07_USER_NM, BC000A5_n205TAM07_USER_NM, BC000A5_A313TAM07_USER_KANA_NM, BC000A5_n313TAM07_USER_KANA_NM, BC000A5_A210TAM07_PWD, BC000A5_n210TAM07_PWD, BC000A5_A333TAM07_SITE_ID, BC000A5_n333TAM07_SITE_ID, BC000A5_A683TAM07_EMAIL,
            BC000A5_n683TAM07_EMAIL, BC000A5_A996TAM07_ADMIN_AUTH_FLG, BC000A5_n996TAM07_ADMIN_AUTH_FLG, BC000A5_A997TAM07_NC_FLG, BC000A5_n997TAM07_NC_FLG, BC000A5_A998TAM07_NOTE, BC000A5_n998TAM07_NOTE, BC000A5_A214TAM07_DEL_FLG, BC000A5_n214TAM07_DEL_FLG, BC000A5_A230TAM07_CRT_PROG_NM,
            BC000A5_n230TAM07_CRT_PROG_NM, BC000A5_A232TAM07_UPD_PROG_NM, BC000A5_n232TAM07_UPD_PROG_NM, BC000A5_A56TAM07_AUTH_CD, BC000A5_n56TAM07_AUTH_CD
            }
            , new Object[] {
            BC000A6_A55TAM07_USER_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000A10_A110TBW03_SESSION_ID, BC000A10_A111TBW03_APP_ID, BC000A10_A112TBW03_DISP_DATETIME, BC000A10_A113TBW03_STUDY_ID, BC000A10_A114TBW03_SUBJECT_ID, BC000A10_A115TBW03_CRF_ID
            }
            , new Object[] {
            BC000A11_A110TBW03_SESSION_ID, BC000A11_A111TBW03_APP_ID, BC000A11_A112TBW03_DISP_DATETIME, BC000A11_A113TBW03_STUDY_ID, BC000A11_A114TBW03_SUBJECT_ID, BC000A11_A115TBW03_CRF_ID
            }
            , new Object[] {
            BC000A12_A110TBW03_SESSION_ID, BC000A12_A111TBW03_APP_ID, BC000A12_A112TBW03_DISP_DATETIME, BC000A12_A113TBW03_STUDY_ID, BC000A12_A114TBW03_SUBJECT_ID, BC000A12_A115TBW03_CRF_ID
            }
            , new Object[] {
            BC000A13_A110TBW03_SESSION_ID, BC000A13_A111TBW03_APP_ID, BC000A13_A112TBW03_DISP_DATETIME, BC000A13_A113TBW03_STUDY_ID, BC000A13_A114TBW03_SUBJECT_ID, BC000A13_A115TBW03_CRF_ID
            }
            , new Object[] {
            BC000A14_A110TBW03_SESSION_ID, BC000A14_A111TBW03_APP_ID, BC000A14_A112TBW03_DISP_DATETIME, BC000A14_A113TBW03_STUDY_ID, BC000A14_A114TBW03_SUBJECT_ID, BC000A14_A115TBW03_CRF_ID
            }
            , new Object[] {
            BC000A15_A110TBW03_SESSION_ID, BC000A15_A111TBW03_APP_ID, BC000A15_A112TBW03_DISP_DATETIME, BC000A15_A113TBW03_STUDY_ID, BC000A15_A114TBW03_SUBJECT_ID, BC000A15_A115TBW03_CRF_ID
            }
            , new Object[] {
            BC000A16_A107TBM23_STUDY_ID, BC000A16_A108TBM23_USER_ID, BC000A16_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            BC000A17_A55TAM07_USER_ID, BC000A17_A229TAM07_CRT_DATETIME, BC000A17_n229TAM07_CRT_DATETIME, BC000A17_A264TAM07_CRT_USER_ID, BC000A17_n264TAM07_CRT_USER_ID, BC000A17_A231TAM07_UPD_DATETIME, BC000A17_n231TAM07_UPD_DATETIME, BC000A17_A265TAM07_UPD_USER_ID, BC000A17_n265TAM07_UPD_USER_ID, BC000A17_A299TAM07_UPD_CNT,
            BC000A17_n299TAM07_UPD_CNT, BC000A17_A205TAM07_USER_NM, BC000A17_n205TAM07_USER_NM, BC000A17_A313TAM07_USER_KANA_NM, BC000A17_n313TAM07_USER_KANA_NM, BC000A17_A210TAM07_PWD, BC000A17_n210TAM07_PWD, BC000A17_A333TAM07_SITE_ID, BC000A17_n333TAM07_SITE_ID, BC000A17_A683TAM07_EMAIL,
            BC000A17_n683TAM07_EMAIL, BC000A17_A996TAM07_ADMIN_AUTH_FLG, BC000A17_n996TAM07_ADMIN_AUTH_FLG, BC000A17_A997TAM07_NC_FLG, BC000A17_n997TAM07_NC_FLG, BC000A17_A998TAM07_NOTE, BC000A17_n998TAM07_NOTE, BC000A17_A214TAM07_DEL_FLG, BC000A17_n214TAM07_DEL_FLG, BC000A17_A230TAM07_CRT_PROG_NM,
            BC000A17_n230TAM07_CRT_PROG_NM, BC000A17_A232TAM07_UPD_PROG_NM, BC000A17_n232TAM07_UPD_PROG_NM, BC000A17_A56TAM07_AUTH_CD, BC000A17_n56TAM07_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TAM07_USER_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110A2 */
      e110A2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound10 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long A299TAM07_UPD_CNT ;
   private long Z299TAM07_UPD_CNT ;
   private long O299TAM07_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode10 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A229TAM07_CRT_DATETIME ;
   private java.util.Date A231TAM07_UPD_DATETIME ;
   private java.util.Date Z229TAM07_CRT_DATETIME ;
   private java.util.Date Z231TAM07_UPD_DATETIME ;
   private boolean n229TAM07_CRT_DATETIME ;
   private boolean n264TAM07_CRT_USER_ID ;
   private boolean n231TAM07_UPD_DATETIME ;
   private boolean n265TAM07_UPD_USER_ID ;
   private boolean n299TAM07_UPD_CNT ;
   private boolean n205TAM07_USER_NM ;
   private boolean n313TAM07_USER_KANA_NM ;
   private boolean n210TAM07_PWD ;
   private boolean n333TAM07_SITE_ID ;
   private boolean n683TAM07_EMAIL ;
   private boolean n996TAM07_ADMIN_AUTH_FLG ;
   private boolean n997TAM07_NC_FLG ;
   private boolean n998TAM07_NOTE ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n230TAM07_CRT_PROG_NM ;
   private boolean n232TAM07_UPD_PROG_NM ;
   private boolean n56TAM07_AUTH_CD ;
   private boolean Gx_longc ;
   private String Z55TAM07_USER_ID ;
   private String A55TAM07_USER_ID ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A205TAM07_USER_NM ;
   private String A313TAM07_USER_KANA_NM ;
   private String A210TAM07_PWD ;
   private String A56TAM07_AUTH_CD ;
   private String A333TAM07_SITE_ID ;
   private String A214TAM07_DEL_FLG ;
   private String A264TAM07_CRT_USER_ID ;
   private String A230TAM07_CRT_PROG_NM ;
   private String A265TAM07_UPD_USER_ID ;
   private String A232TAM07_UPD_PROG_NM ;
   private String Z264TAM07_CRT_USER_ID ;
   private String Z265TAM07_UPD_USER_ID ;
   private String Z205TAM07_USER_NM ;
   private String Z313TAM07_USER_KANA_NM ;
   private String Z210TAM07_PWD ;
   private String Z333TAM07_SITE_ID ;
   private String Z683TAM07_EMAIL ;
   private String A683TAM07_EMAIL ;
   private String Z996TAM07_ADMIN_AUTH_FLG ;
   private String A996TAM07_ADMIN_AUTH_FLG ;
   private String Z997TAM07_NC_FLG ;
   private String A997TAM07_NC_FLG ;
   private String Z998TAM07_NOTE ;
   private String A998TAM07_NOTE ;
   private String Z214TAM07_DEL_FLG ;
   private String Z230TAM07_CRT_PROG_NM ;
   private String Z232TAM07_UPD_PROG_NM ;
   private String Z56TAM07_AUTH_CD ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAM07_USER bcTAM07_USER ;
   private IDataStoreProvider pr_default ;
   private String[] BC000A5_A55TAM07_USER_ID ;
   private java.util.Date[] BC000A5_A229TAM07_CRT_DATETIME ;
   private boolean[] BC000A5_n229TAM07_CRT_DATETIME ;
   private String[] BC000A5_A264TAM07_CRT_USER_ID ;
   private boolean[] BC000A5_n264TAM07_CRT_USER_ID ;
   private java.util.Date[] BC000A5_A231TAM07_UPD_DATETIME ;
   private boolean[] BC000A5_n231TAM07_UPD_DATETIME ;
   private String[] BC000A5_A265TAM07_UPD_USER_ID ;
   private boolean[] BC000A5_n265TAM07_UPD_USER_ID ;
   private long[] BC000A5_A299TAM07_UPD_CNT ;
   private boolean[] BC000A5_n299TAM07_UPD_CNT ;
   private String[] BC000A5_A205TAM07_USER_NM ;
   private boolean[] BC000A5_n205TAM07_USER_NM ;
   private String[] BC000A5_A313TAM07_USER_KANA_NM ;
   private boolean[] BC000A5_n313TAM07_USER_KANA_NM ;
   private String[] BC000A5_A210TAM07_PWD ;
   private boolean[] BC000A5_n210TAM07_PWD ;
   private String[] BC000A5_A333TAM07_SITE_ID ;
   private boolean[] BC000A5_n333TAM07_SITE_ID ;
   private String[] BC000A5_A683TAM07_EMAIL ;
   private boolean[] BC000A5_n683TAM07_EMAIL ;
   private String[] BC000A5_A996TAM07_ADMIN_AUTH_FLG ;
   private boolean[] BC000A5_n996TAM07_ADMIN_AUTH_FLG ;
   private String[] BC000A5_A997TAM07_NC_FLG ;
   private boolean[] BC000A5_n997TAM07_NC_FLG ;
   private String[] BC000A5_A998TAM07_NOTE ;
   private boolean[] BC000A5_n998TAM07_NOTE ;
   private String[] BC000A5_A214TAM07_DEL_FLG ;
   private boolean[] BC000A5_n214TAM07_DEL_FLG ;
   private String[] BC000A5_A230TAM07_CRT_PROG_NM ;
   private boolean[] BC000A5_n230TAM07_CRT_PROG_NM ;
   private String[] BC000A5_A232TAM07_UPD_PROG_NM ;
   private boolean[] BC000A5_n232TAM07_UPD_PROG_NM ;
   private String[] BC000A5_A56TAM07_AUTH_CD ;
   private boolean[] BC000A5_n56TAM07_AUTH_CD ;
   private String[] BC000A4_A56TAM07_AUTH_CD ;
   private boolean[] BC000A4_n56TAM07_AUTH_CD ;
   private String[] BC000A6_A55TAM07_USER_ID ;
   private String[] BC000A3_A55TAM07_USER_ID ;
   private java.util.Date[] BC000A3_A229TAM07_CRT_DATETIME ;
   private boolean[] BC000A3_n229TAM07_CRT_DATETIME ;
   private String[] BC000A3_A264TAM07_CRT_USER_ID ;
   private boolean[] BC000A3_n264TAM07_CRT_USER_ID ;
   private java.util.Date[] BC000A3_A231TAM07_UPD_DATETIME ;
   private boolean[] BC000A3_n231TAM07_UPD_DATETIME ;
   private String[] BC000A3_A265TAM07_UPD_USER_ID ;
   private boolean[] BC000A3_n265TAM07_UPD_USER_ID ;
   private long[] BC000A3_A299TAM07_UPD_CNT ;
   private boolean[] BC000A3_n299TAM07_UPD_CNT ;
   private String[] BC000A3_A205TAM07_USER_NM ;
   private boolean[] BC000A3_n205TAM07_USER_NM ;
   private String[] BC000A3_A313TAM07_USER_KANA_NM ;
   private boolean[] BC000A3_n313TAM07_USER_KANA_NM ;
   private String[] BC000A3_A210TAM07_PWD ;
   private boolean[] BC000A3_n210TAM07_PWD ;
   private String[] BC000A3_A333TAM07_SITE_ID ;
   private boolean[] BC000A3_n333TAM07_SITE_ID ;
   private String[] BC000A3_A683TAM07_EMAIL ;
   private boolean[] BC000A3_n683TAM07_EMAIL ;
   private String[] BC000A3_A996TAM07_ADMIN_AUTH_FLG ;
   private boolean[] BC000A3_n996TAM07_ADMIN_AUTH_FLG ;
   private String[] BC000A3_A997TAM07_NC_FLG ;
   private boolean[] BC000A3_n997TAM07_NC_FLG ;
   private String[] BC000A3_A998TAM07_NOTE ;
   private boolean[] BC000A3_n998TAM07_NOTE ;
   private String[] BC000A3_A214TAM07_DEL_FLG ;
   private boolean[] BC000A3_n214TAM07_DEL_FLG ;
   private String[] BC000A3_A230TAM07_CRT_PROG_NM ;
   private boolean[] BC000A3_n230TAM07_CRT_PROG_NM ;
   private String[] BC000A3_A232TAM07_UPD_PROG_NM ;
   private boolean[] BC000A3_n232TAM07_UPD_PROG_NM ;
   private String[] BC000A3_A56TAM07_AUTH_CD ;
   private boolean[] BC000A3_n56TAM07_AUTH_CD ;
   private String[] BC000A2_A55TAM07_USER_ID ;
   private java.util.Date[] BC000A2_A229TAM07_CRT_DATETIME ;
   private boolean[] BC000A2_n229TAM07_CRT_DATETIME ;
   private String[] BC000A2_A264TAM07_CRT_USER_ID ;
   private boolean[] BC000A2_n264TAM07_CRT_USER_ID ;
   private java.util.Date[] BC000A2_A231TAM07_UPD_DATETIME ;
   private boolean[] BC000A2_n231TAM07_UPD_DATETIME ;
   private String[] BC000A2_A265TAM07_UPD_USER_ID ;
   private boolean[] BC000A2_n265TAM07_UPD_USER_ID ;
   private long[] BC000A2_A299TAM07_UPD_CNT ;
   private boolean[] BC000A2_n299TAM07_UPD_CNT ;
   private String[] BC000A2_A205TAM07_USER_NM ;
   private boolean[] BC000A2_n205TAM07_USER_NM ;
   private String[] BC000A2_A313TAM07_USER_KANA_NM ;
   private boolean[] BC000A2_n313TAM07_USER_KANA_NM ;
   private String[] BC000A2_A210TAM07_PWD ;
   private boolean[] BC000A2_n210TAM07_PWD ;
   private String[] BC000A2_A333TAM07_SITE_ID ;
   private boolean[] BC000A2_n333TAM07_SITE_ID ;
   private String[] BC000A2_A683TAM07_EMAIL ;
   private boolean[] BC000A2_n683TAM07_EMAIL ;
   private String[] BC000A2_A996TAM07_ADMIN_AUTH_FLG ;
   private boolean[] BC000A2_n996TAM07_ADMIN_AUTH_FLG ;
   private String[] BC000A2_A997TAM07_NC_FLG ;
   private boolean[] BC000A2_n997TAM07_NC_FLG ;
   private String[] BC000A2_A998TAM07_NOTE ;
   private boolean[] BC000A2_n998TAM07_NOTE ;
   private String[] BC000A2_A214TAM07_DEL_FLG ;
   private boolean[] BC000A2_n214TAM07_DEL_FLG ;
   private String[] BC000A2_A230TAM07_CRT_PROG_NM ;
   private boolean[] BC000A2_n230TAM07_CRT_PROG_NM ;
   private String[] BC000A2_A232TAM07_UPD_PROG_NM ;
   private boolean[] BC000A2_n232TAM07_UPD_PROG_NM ;
   private String[] BC000A2_A56TAM07_AUTH_CD ;
   private boolean[] BC000A2_n56TAM07_AUTH_CD ;
   private String[] BC000A10_A110TBW03_SESSION_ID ;
   private String[] BC000A10_A111TBW03_APP_ID ;
   private String[] BC000A10_A112TBW03_DISP_DATETIME ;
   private long[] BC000A10_A113TBW03_STUDY_ID ;
   private int[] BC000A10_A114TBW03_SUBJECT_ID ;
   private short[] BC000A10_A115TBW03_CRF_ID ;
   private String[] BC000A11_A110TBW03_SESSION_ID ;
   private String[] BC000A11_A111TBW03_APP_ID ;
   private String[] BC000A11_A112TBW03_DISP_DATETIME ;
   private long[] BC000A11_A113TBW03_STUDY_ID ;
   private int[] BC000A11_A114TBW03_SUBJECT_ID ;
   private short[] BC000A11_A115TBW03_CRF_ID ;
   private String[] BC000A12_A110TBW03_SESSION_ID ;
   private String[] BC000A12_A111TBW03_APP_ID ;
   private String[] BC000A12_A112TBW03_DISP_DATETIME ;
   private long[] BC000A12_A113TBW03_STUDY_ID ;
   private int[] BC000A12_A114TBW03_SUBJECT_ID ;
   private short[] BC000A12_A115TBW03_CRF_ID ;
   private String[] BC000A13_A110TBW03_SESSION_ID ;
   private String[] BC000A13_A111TBW03_APP_ID ;
   private String[] BC000A13_A112TBW03_DISP_DATETIME ;
   private long[] BC000A13_A113TBW03_STUDY_ID ;
   private int[] BC000A13_A114TBW03_SUBJECT_ID ;
   private short[] BC000A13_A115TBW03_CRF_ID ;
   private String[] BC000A14_A110TBW03_SESSION_ID ;
   private String[] BC000A14_A111TBW03_APP_ID ;
   private String[] BC000A14_A112TBW03_DISP_DATETIME ;
   private long[] BC000A14_A113TBW03_STUDY_ID ;
   private int[] BC000A14_A114TBW03_SUBJECT_ID ;
   private short[] BC000A14_A115TBW03_CRF_ID ;
   private String[] BC000A15_A110TBW03_SESSION_ID ;
   private String[] BC000A15_A111TBW03_APP_ID ;
   private String[] BC000A15_A112TBW03_DISP_DATETIME ;
   private long[] BC000A15_A113TBW03_STUDY_ID ;
   private int[] BC000A15_A114TBW03_SUBJECT_ID ;
   private short[] BC000A15_A115TBW03_CRF_ID ;
   private long[] BC000A16_A107TBM23_STUDY_ID ;
   private String[] BC000A16_A108TBM23_USER_ID ;
   private String[] BC000A16_A109TBM23_STYDY_AUTH_CD ;
   private String[] BC000A17_A55TAM07_USER_ID ;
   private java.util.Date[] BC000A17_A229TAM07_CRT_DATETIME ;
   private boolean[] BC000A17_n229TAM07_CRT_DATETIME ;
   private String[] BC000A17_A264TAM07_CRT_USER_ID ;
   private boolean[] BC000A17_n264TAM07_CRT_USER_ID ;
   private java.util.Date[] BC000A17_A231TAM07_UPD_DATETIME ;
   private boolean[] BC000A17_n231TAM07_UPD_DATETIME ;
   private String[] BC000A17_A265TAM07_UPD_USER_ID ;
   private boolean[] BC000A17_n265TAM07_UPD_USER_ID ;
   private long[] BC000A17_A299TAM07_UPD_CNT ;
   private boolean[] BC000A17_n299TAM07_UPD_CNT ;
   private String[] BC000A17_A205TAM07_USER_NM ;
   private boolean[] BC000A17_n205TAM07_USER_NM ;
   private String[] BC000A17_A313TAM07_USER_KANA_NM ;
   private boolean[] BC000A17_n313TAM07_USER_KANA_NM ;
   private String[] BC000A17_A210TAM07_PWD ;
   private boolean[] BC000A17_n210TAM07_PWD ;
   private String[] BC000A17_A333TAM07_SITE_ID ;
   private boolean[] BC000A17_n333TAM07_SITE_ID ;
   private String[] BC000A17_A683TAM07_EMAIL ;
   private boolean[] BC000A17_n683TAM07_EMAIL ;
   private String[] BC000A17_A996TAM07_ADMIN_AUTH_FLG ;
   private boolean[] BC000A17_n996TAM07_ADMIN_AUTH_FLG ;
   private String[] BC000A17_A997TAM07_NC_FLG ;
   private boolean[] BC000A17_n997TAM07_NC_FLG ;
   private String[] BC000A17_A998TAM07_NOTE ;
   private boolean[] BC000A17_n998TAM07_NOTE ;
   private String[] BC000A17_A214TAM07_DEL_FLG ;
   private boolean[] BC000A17_n214TAM07_DEL_FLG ;
   private String[] BC000A17_A230TAM07_CRT_PROG_NM ;
   private boolean[] BC000A17_n230TAM07_CRT_PROG_NM ;
   private String[] BC000A17_A232TAM07_UPD_PROG_NM ;
   private boolean[] BC000A17_n232TAM07_UPD_PROG_NM ;
   private String[] BC000A17_A56TAM07_AUTH_CD ;
   private boolean[] BC000A17_n56TAM07_AUTH_CD ;
}

final  class tam07_user_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000A2", "SELECT `TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_ADMIN_AUTH_FLG`, `TAM07_NC_FLG`, `TAM07_NOTE`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000A3", "SELECT `TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_ADMIN_AUTH_FLG`, `TAM07_NC_FLG`, `TAM07_NOTE`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000A4", "SELECT `TAM04_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000A5", "SELECT TM1.`TAM07_USER_ID`, TM1.`TAM07_CRT_DATETIME`, TM1.`TAM07_CRT_USER_ID`, TM1.`TAM07_UPD_DATETIME`, TM1.`TAM07_UPD_USER_ID`, TM1.`TAM07_UPD_CNT`, TM1.`TAM07_USER_NM`, TM1.`TAM07_USER_KANA_NM`, TM1.`TAM07_PWD`, TM1.`TAM07_SITE_ID`, TM1.`TAM07_EMAIL`, TM1.`TAM07_ADMIN_AUTH_FLG`, TM1.`TAM07_NC_FLG`, TM1.`TAM07_NOTE`, TM1.`TAM07_DEL_FLG`, TM1.`TAM07_CRT_PROG_NM`, TM1.`TAM07_UPD_PROG_NM`, TM1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` TM1 WHERE TM1.`TAM07_USER_ID` = ? ORDER BY TM1.`TAM07_USER_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000A6", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000A7", "INSERT INTO `TAM07_USER`(`TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_ADMIN_AUTH_FLG`, `TAM07_NC_FLG`, `TAM07_NOTE`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000A8", "UPDATE `TAM07_USER` SET `TAM07_CRT_DATETIME`=?, `TAM07_CRT_USER_ID`=?, `TAM07_UPD_DATETIME`=?, `TAM07_UPD_USER_ID`=?, `TAM07_UPD_CNT`=?, `TAM07_USER_NM`=?, `TAM07_USER_KANA_NM`=?, `TAM07_PWD`=?, `TAM07_SITE_ID`=?, `TAM07_EMAIL`=?, `TAM07_ADMIN_AUTH_FLG`=?, `TAM07_NC_FLG`=?, `TAM07_NOTE`=?, `TAM07_DEL_FLG`=?, `TAM07_CRT_PROG_NM`=?, `TAM07_UPD_PROG_NM`=?, `TAM07_AUTH_CD`=?  WHERE `TAM07_USER_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000A9", "DELETE FROM `TAM07_USER`  WHERE `TAM07_USER_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000A10", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_UPD_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A11", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_CRT_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A12", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_INPUT_END_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A13", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_APPROVAL_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A14", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_UPLOAD_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A15", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_LOCK_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A16", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A17", "SELECT TM1.`TAM07_USER_ID`, TM1.`TAM07_CRT_DATETIME`, TM1.`TAM07_CRT_USER_ID`, TM1.`TAM07_UPD_DATETIME`, TM1.`TAM07_UPD_USER_ID`, TM1.`TAM07_UPD_CNT`, TM1.`TAM07_USER_NM`, TM1.`TAM07_USER_KANA_NM`, TM1.`TAM07_PWD`, TM1.`TAM07_SITE_ID`, TM1.`TAM07_EMAIL`, TM1.`TAM07_ADMIN_AUTH_FLG`, TM1.`TAM07_NC_FLG`, TM1.`TAM07_NOTE`, TM1.`TAM07_DEL_FLG`, TM1.`TAM07_CRT_PROG_NM`, TM1.`TAM07_UPD_PROG_NM`, TM1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` TM1 WHERE TM1.`TAM07_USER_ID` = ? ORDER BY TM1.`TAM07_USER_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
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
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
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
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2, false);
               }
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
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
                  stmt.setVarchar(7, (String)parms[12], 30);
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
                  stmt.setVarchar(9, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 20);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 256);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1000);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 40);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 2);
               }
               return;
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
                  stmt.setVarchar(6, (String)parms[11], 30);
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
                  stmt.setVarchar(8, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 20);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 256);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1000);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 40);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 2);
               }
               stmt.setVarchar(18, (String)parms[34], 128, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
      }
   }

}

