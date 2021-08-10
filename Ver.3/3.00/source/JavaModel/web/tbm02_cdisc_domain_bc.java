/*
               File: tbm02_cdisc_domain_bc
        Description: CDISCドメインマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:14.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm02_cdisc_domain_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm02_cdisc_domain_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm02_cdisc_domain_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm02_cdisc_domain_bc.class ));
   }

   public tbm02_cdisc_domain_bc( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1338( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1338( ) ;
      standaloneModal( ) ;
      addRow1338( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e12132 */
         e12132 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z49TBM02_DOM_CD = A49TBM02_DOM_CD ;
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

   public void confirm_130( )
   {
      beforeValidate1338( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1338( ) ;
         }
         else
         {
            checkExtendedTable1338( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1338( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11132( )
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

   public void e12132( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "ドメインコード:" + A49TBM02_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A610TBM02_DOM_ENM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A611TBM02_DOM_JNM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A612TBM02_DOM_GRP_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A613TBM02_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A614TBM02_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A615TBM02_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A616TBM02_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A617TBM02_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A618TBM02_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A619TBM02_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A620TBM02_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A621TBM02_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1338( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z616TBM02_CRT_DATETIME = A616TBM02_CRT_DATETIME ;
         Z617TBM02_CRT_USER_ID = A617TBM02_CRT_USER_ID ;
         Z619TBM02_UPD_DATETIME = A619TBM02_UPD_DATETIME ;
         Z620TBM02_UPD_USER_ID = A620TBM02_UPD_USER_ID ;
         Z622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
         Z610TBM02_DOM_ENM = A610TBM02_DOM_ENM ;
         Z611TBM02_DOM_JNM = A611TBM02_DOM_JNM ;
         Z612TBM02_DOM_GRP_NM = A612TBM02_DOM_GRP_NM ;
         Z613TBM02_NOTE = A613TBM02_NOTE ;
         Z614TBM02_ORDER = A614TBM02_ORDER ;
         Z615TBM02_DEL_FLG = A615TBM02_DEL_FLG ;
         Z618TBM02_CRT_PROG_NM = A618TBM02_CRT_PROG_NM ;
         Z621TBM02_UPD_PROG_NM = A621TBM02_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z49TBM02_DOM_CD = A49TBM02_DOM_CD ;
         Z616TBM02_CRT_DATETIME = A616TBM02_CRT_DATETIME ;
         Z617TBM02_CRT_USER_ID = A617TBM02_CRT_USER_ID ;
         Z619TBM02_UPD_DATETIME = A619TBM02_UPD_DATETIME ;
         Z620TBM02_UPD_USER_ID = A620TBM02_UPD_USER_ID ;
         Z622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
         Z610TBM02_DOM_ENM = A610TBM02_DOM_ENM ;
         Z611TBM02_DOM_JNM = A611TBM02_DOM_JNM ;
         Z612TBM02_DOM_GRP_NM = A612TBM02_DOM_GRP_NM ;
         Z613TBM02_NOTE = A613TBM02_NOTE ;
         Z614TBM02_ORDER = A614TBM02_ORDER ;
         Z615TBM02_DEL_FLG = A615TBM02_DEL_FLG ;
         Z618TBM02_CRT_PROG_NM = A618TBM02_CRT_PROG_NM ;
         Z621TBM02_UPD_PROG_NM = A621TBM02_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1338( )
   {
      /* Using cursor BC00134 */
      pr_default.execute(2, new Object[] {A49TBM02_DOM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A616TBM02_CRT_DATETIME = BC00134_A616TBM02_CRT_DATETIME[0] ;
         n616TBM02_CRT_DATETIME = BC00134_n616TBM02_CRT_DATETIME[0] ;
         A617TBM02_CRT_USER_ID = BC00134_A617TBM02_CRT_USER_ID[0] ;
         n617TBM02_CRT_USER_ID = BC00134_n617TBM02_CRT_USER_ID[0] ;
         A619TBM02_UPD_DATETIME = BC00134_A619TBM02_UPD_DATETIME[0] ;
         n619TBM02_UPD_DATETIME = BC00134_n619TBM02_UPD_DATETIME[0] ;
         A620TBM02_UPD_USER_ID = BC00134_A620TBM02_UPD_USER_ID[0] ;
         n620TBM02_UPD_USER_ID = BC00134_n620TBM02_UPD_USER_ID[0] ;
         A622TBM02_UPD_CNT = BC00134_A622TBM02_UPD_CNT[0] ;
         n622TBM02_UPD_CNT = BC00134_n622TBM02_UPD_CNT[0] ;
         A610TBM02_DOM_ENM = BC00134_A610TBM02_DOM_ENM[0] ;
         n610TBM02_DOM_ENM = BC00134_n610TBM02_DOM_ENM[0] ;
         A611TBM02_DOM_JNM = BC00134_A611TBM02_DOM_JNM[0] ;
         n611TBM02_DOM_JNM = BC00134_n611TBM02_DOM_JNM[0] ;
         A612TBM02_DOM_GRP_NM = BC00134_A612TBM02_DOM_GRP_NM[0] ;
         n612TBM02_DOM_GRP_NM = BC00134_n612TBM02_DOM_GRP_NM[0] ;
         A613TBM02_NOTE = BC00134_A613TBM02_NOTE[0] ;
         n613TBM02_NOTE = BC00134_n613TBM02_NOTE[0] ;
         A614TBM02_ORDER = BC00134_A614TBM02_ORDER[0] ;
         n614TBM02_ORDER = BC00134_n614TBM02_ORDER[0] ;
         A615TBM02_DEL_FLG = BC00134_A615TBM02_DEL_FLG[0] ;
         n615TBM02_DEL_FLG = BC00134_n615TBM02_DEL_FLG[0] ;
         A618TBM02_CRT_PROG_NM = BC00134_A618TBM02_CRT_PROG_NM[0] ;
         n618TBM02_CRT_PROG_NM = BC00134_n618TBM02_CRT_PROG_NM[0] ;
         A621TBM02_UPD_PROG_NM = BC00134_A621TBM02_UPD_PROG_NM[0] ;
         n621TBM02_UPD_PROG_NM = BC00134_n621TBM02_UPD_PROG_NM[0] ;
         zm1338( -8) ;
      }
      pr_default.close(2);
      onLoadActions1338( ) ;
   }

   public void onLoadActions1338( )
   {
      AV9Pgmname = "TBM02_CDISC_DOMAIN_BC" ;
   }

   public void checkExtendedTable1338( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM02_CDISC_DOMAIN_BC" ;
      if ( ! ( GXutil.nullDate().equals(A616TBM02_CRT_DATETIME) || (( A616TBM02_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A616TBM02_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A619TBM02_UPD_DATETIME) || (( A619TBM02_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A619TBM02_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1338( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1338( )
   {
      /* Using cursor BC00135 */
      pr_default.execute(3, new Object[] {A49TBM02_DOM_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00133 */
      pr_default.execute(1, new Object[] {A49TBM02_DOM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1338( 8) ;
         RcdFound38 = (short)(1) ;
         A49TBM02_DOM_CD = BC00133_A49TBM02_DOM_CD[0] ;
         A616TBM02_CRT_DATETIME = BC00133_A616TBM02_CRT_DATETIME[0] ;
         n616TBM02_CRT_DATETIME = BC00133_n616TBM02_CRT_DATETIME[0] ;
         A617TBM02_CRT_USER_ID = BC00133_A617TBM02_CRT_USER_ID[0] ;
         n617TBM02_CRT_USER_ID = BC00133_n617TBM02_CRT_USER_ID[0] ;
         A619TBM02_UPD_DATETIME = BC00133_A619TBM02_UPD_DATETIME[0] ;
         n619TBM02_UPD_DATETIME = BC00133_n619TBM02_UPD_DATETIME[0] ;
         A620TBM02_UPD_USER_ID = BC00133_A620TBM02_UPD_USER_ID[0] ;
         n620TBM02_UPD_USER_ID = BC00133_n620TBM02_UPD_USER_ID[0] ;
         A622TBM02_UPD_CNT = BC00133_A622TBM02_UPD_CNT[0] ;
         n622TBM02_UPD_CNT = BC00133_n622TBM02_UPD_CNT[0] ;
         A610TBM02_DOM_ENM = BC00133_A610TBM02_DOM_ENM[0] ;
         n610TBM02_DOM_ENM = BC00133_n610TBM02_DOM_ENM[0] ;
         A611TBM02_DOM_JNM = BC00133_A611TBM02_DOM_JNM[0] ;
         n611TBM02_DOM_JNM = BC00133_n611TBM02_DOM_JNM[0] ;
         A612TBM02_DOM_GRP_NM = BC00133_A612TBM02_DOM_GRP_NM[0] ;
         n612TBM02_DOM_GRP_NM = BC00133_n612TBM02_DOM_GRP_NM[0] ;
         A613TBM02_NOTE = BC00133_A613TBM02_NOTE[0] ;
         n613TBM02_NOTE = BC00133_n613TBM02_NOTE[0] ;
         A614TBM02_ORDER = BC00133_A614TBM02_ORDER[0] ;
         n614TBM02_ORDER = BC00133_n614TBM02_ORDER[0] ;
         A615TBM02_DEL_FLG = BC00133_A615TBM02_DEL_FLG[0] ;
         n615TBM02_DEL_FLG = BC00133_n615TBM02_DEL_FLG[0] ;
         A618TBM02_CRT_PROG_NM = BC00133_A618TBM02_CRT_PROG_NM[0] ;
         n618TBM02_CRT_PROG_NM = BC00133_n618TBM02_CRT_PROG_NM[0] ;
         A621TBM02_UPD_PROG_NM = BC00133_A621TBM02_UPD_PROG_NM[0] ;
         n621TBM02_UPD_PROG_NM = BC00133_n621TBM02_UPD_PROG_NM[0] ;
         O622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
         n622TBM02_UPD_CNT = false ;
         Z49TBM02_DOM_CD = A49TBM02_DOM_CD ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1338( ) ;
         if ( AnyError == 1 )
         {
            RcdFound38 = (short)(0) ;
            initializeNonKey1338( ) ;
         }
         Gx_mode = sMode38 ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1338( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode38 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1338( ) ;
      if ( RcdFound38 == 0 )
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
      confirm_130( ) ;
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

   public void checkOptimisticConcurrency1338( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00132 */
         pr_default.execute(0, new Object[] {A49TBM02_DOM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM02_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z616TBM02_CRT_DATETIME.equals( BC00132_A616TBM02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z617TBM02_CRT_USER_ID, BC00132_A617TBM02_CRT_USER_ID[0]) != 0 ) || !( Z619TBM02_UPD_DATETIME.equals( BC00132_A619TBM02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z620TBM02_UPD_USER_ID, BC00132_A620TBM02_UPD_USER_ID[0]) != 0 ) || ( Z622TBM02_UPD_CNT != BC00132_A622TBM02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z610TBM02_DOM_ENM, BC00132_A610TBM02_DOM_ENM[0]) != 0 ) || ( GXutil.strcmp(Z611TBM02_DOM_JNM, BC00132_A611TBM02_DOM_JNM[0]) != 0 ) || ( GXutil.strcmp(Z612TBM02_DOM_GRP_NM, BC00132_A612TBM02_DOM_GRP_NM[0]) != 0 ) || ( GXutil.strcmp(Z613TBM02_NOTE, BC00132_A613TBM02_NOTE[0]) != 0 ) || ( Z614TBM02_ORDER != BC00132_A614TBM02_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z615TBM02_DEL_FLG, BC00132_A615TBM02_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z618TBM02_CRT_PROG_NM, BC00132_A618TBM02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z621TBM02_UPD_PROG_NM, BC00132_A621TBM02_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM02_CDISC_DOMAIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1338( )
   {
      beforeValidate1338( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1338( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1338( 0) ;
         checkOptimisticConcurrency1338( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1338( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1338( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00136 */
                  pr_default.execute(4, new Object[] {A49TBM02_DOM_CD, new Boolean(n616TBM02_CRT_DATETIME), A616TBM02_CRT_DATETIME, new Boolean(n617TBM02_CRT_USER_ID), A617TBM02_CRT_USER_ID, new Boolean(n619TBM02_UPD_DATETIME), A619TBM02_UPD_DATETIME, new Boolean(n620TBM02_UPD_USER_ID), A620TBM02_UPD_USER_ID, new Boolean(n622TBM02_UPD_CNT), new Long(A622TBM02_UPD_CNT), new Boolean(n610TBM02_DOM_ENM), A610TBM02_DOM_ENM, new Boolean(n611TBM02_DOM_JNM), A611TBM02_DOM_JNM, new Boolean(n612TBM02_DOM_GRP_NM), A612TBM02_DOM_GRP_NM, new Boolean(n613TBM02_NOTE), A613TBM02_NOTE, new Boolean(n614TBM02_ORDER), new Integer(A614TBM02_ORDER), new Boolean(n615TBM02_DEL_FLG), A615TBM02_DEL_FLG, new Boolean(n618TBM02_CRT_PROG_NM), A618TBM02_CRT_PROG_NM, new Boolean(n621TBM02_UPD_PROG_NM), A621TBM02_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM02_CDISC_DOMAIN") ;
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
            load1338( ) ;
         }
         endLevel1338( ) ;
      }
      closeExtendedTableCursors1338( ) ;
   }

   public void update1338( )
   {
      beforeValidate1338( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1338( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1338( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1338( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1338( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00137 */
                  pr_default.execute(5, new Object[] {new Boolean(n616TBM02_CRT_DATETIME), A616TBM02_CRT_DATETIME, new Boolean(n617TBM02_CRT_USER_ID), A617TBM02_CRT_USER_ID, new Boolean(n619TBM02_UPD_DATETIME), A619TBM02_UPD_DATETIME, new Boolean(n620TBM02_UPD_USER_ID), A620TBM02_UPD_USER_ID, new Boolean(n622TBM02_UPD_CNT), new Long(A622TBM02_UPD_CNT), new Boolean(n610TBM02_DOM_ENM), A610TBM02_DOM_ENM, new Boolean(n611TBM02_DOM_JNM), A611TBM02_DOM_JNM, new Boolean(n612TBM02_DOM_GRP_NM), A612TBM02_DOM_GRP_NM, new Boolean(n613TBM02_NOTE), A613TBM02_NOTE, new Boolean(n614TBM02_ORDER), new Integer(A614TBM02_ORDER), new Boolean(n615TBM02_DEL_FLG), A615TBM02_DEL_FLG, new Boolean(n618TBM02_CRT_PROG_NM), A618TBM02_CRT_PROG_NM, new Boolean(n621TBM02_UPD_PROG_NM), A621TBM02_UPD_PROG_NM, A49TBM02_DOM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM02_CDISC_DOMAIN") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM02_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1338( ) ;
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
         endLevel1338( ) ;
      }
      closeExtendedTableCursors1338( ) ;
   }

   public void deferredUpdate1338( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1338( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1338( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1338( ) ;
         afterConfirm1338( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1338( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00138 */
               pr_default.execute(6, new Object[] {A49TBM02_DOM_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM02_CDISC_DOMAIN") ;
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
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1338( ) ;
      Gx_mode = sMode38 ;
   }

   public void onDeleteControls1338( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM02_CDISC_DOMAIN_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC00139 */
         pr_default.execute(7, new Object[] {A49TBM02_DOM_CD});
         if ( (pr_default.getStatus(7) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CDISC項目マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(7);
      }
   }

   public void endLevel1338( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1338( ) ;
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

   public void scanKeyStart1338( )
   {
      /* Scan By routine */
      /* Using cursor BC001310 */
      pr_default.execute(8, new Object[] {A49TBM02_DOM_CD});
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A49TBM02_DOM_CD = BC001310_A49TBM02_DOM_CD[0] ;
         A616TBM02_CRT_DATETIME = BC001310_A616TBM02_CRT_DATETIME[0] ;
         n616TBM02_CRT_DATETIME = BC001310_n616TBM02_CRT_DATETIME[0] ;
         A617TBM02_CRT_USER_ID = BC001310_A617TBM02_CRT_USER_ID[0] ;
         n617TBM02_CRT_USER_ID = BC001310_n617TBM02_CRT_USER_ID[0] ;
         A619TBM02_UPD_DATETIME = BC001310_A619TBM02_UPD_DATETIME[0] ;
         n619TBM02_UPD_DATETIME = BC001310_n619TBM02_UPD_DATETIME[0] ;
         A620TBM02_UPD_USER_ID = BC001310_A620TBM02_UPD_USER_ID[0] ;
         n620TBM02_UPD_USER_ID = BC001310_n620TBM02_UPD_USER_ID[0] ;
         A622TBM02_UPD_CNT = BC001310_A622TBM02_UPD_CNT[0] ;
         n622TBM02_UPD_CNT = BC001310_n622TBM02_UPD_CNT[0] ;
         A610TBM02_DOM_ENM = BC001310_A610TBM02_DOM_ENM[0] ;
         n610TBM02_DOM_ENM = BC001310_n610TBM02_DOM_ENM[0] ;
         A611TBM02_DOM_JNM = BC001310_A611TBM02_DOM_JNM[0] ;
         n611TBM02_DOM_JNM = BC001310_n611TBM02_DOM_JNM[0] ;
         A612TBM02_DOM_GRP_NM = BC001310_A612TBM02_DOM_GRP_NM[0] ;
         n612TBM02_DOM_GRP_NM = BC001310_n612TBM02_DOM_GRP_NM[0] ;
         A613TBM02_NOTE = BC001310_A613TBM02_NOTE[0] ;
         n613TBM02_NOTE = BC001310_n613TBM02_NOTE[0] ;
         A614TBM02_ORDER = BC001310_A614TBM02_ORDER[0] ;
         n614TBM02_ORDER = BC001310_n614TBM02_ORDER[0] ;
         A615TBM02_DEL_FLG = BC001310_A615TBM02_DEL_FLG[0] ;
         n615TBM02_DEL_FLG = BC001310_n615TBM02_DEL_FLG[0] ;
         A618TBM02_CRT_PROG_NM = BC001310_A618TBM02_CRT_PROG_NM[0] ;
         n618TBM02_CRT_PROG_NM = BC001310_n618TBM02_CRT_PROG_NM[0] ;
         A621TBM02_UPD_PROG_NM = BC001310_A621TBM02_UPD_PROG_NM[0] ;
         n621TBM02_UPD_PROG_NM = BC001310_n621TBM02_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1338( )
   {
      /* Scan next routine */
      pr_default.readNext(8);
      RcdFound38 = (short)(0) ;
      scanKeyLoad1338( ) ;
   }

   public void scanKeyLoad1338( )
   {
      sMode38 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A49TBM02_DOM_CD = BC001310_A49TBM02_DOM_CD[0] ;
         A616TBM02_CRT_DATETIME = BC001310_A616TBM02_CRT_DATETIME[0] ;
         n616TBM02_CRT_DATETIME = BC001310_n616TBM02_CRT_DATETIME[0] ;
         A617TBM02_CRT_USER_ID = BC001310_A617TBM02_CRT_USER_ID[0] ;
         n617TBM02_CRT_USER_ID = BC001310_n617TBM02_CRT_USER_ID[0] ;
         A619TBM02_UPD_DATETIME = BC001310_A619TBM02_UPD_DATETIME[0] ;
         n619TBM02_UPD_DATETIME = BC001310_n619TBM02_UPD_DATETIME[0] ;
         A620TBM02_UPD_USER_ID = BC001310_A620TBM02_UPD_USER_ID[0] ;
         n620TBM02_UPD_USER_ID = BC001310_n620TBM02_UPD_USER_ID[0] ;
         A622TBM02_UPD_CNT = BC001310_A622TBM02_UPD_CNT[0] ;
         n622TBM02_UPD_CNT = BC001310_n622TBM02_UPD_CNT[0] ;
         A610TBM02_DOM_ENM = BC001310_A610TBM02_DOM_ENM[0] ;
         n610TBM02_DOM_ENM = BC001310_n610TBM02_DOM_ENM[0] ;
         A611TBM02_DOM_JNM = BC001310_A611TBM02_DOM_JNM[0] ;
         n611TBM02_DOM_JNM = BC001310_n611TBM02_DOM_JNM[0] ;
         A612TBM02_DOM_GRP_NM = BC001310_A612TBM02_DOM_GRP_NM[0] ;
         n612TBM02_DOM_GRP_NM = BC001310_n612TBM02_DOM_GRP_NM[0] ;
         A613TBM02_NOTE = BC001310_A613TBM02_NOTE[0] ;
         n613TBM02_NOTE = BC001310_n613TBM02_NOTE[0] ;
         A614TBM02_ORDER = BC001310_A614TBM02_ORDER[0] ;
         n614TBM02_ORDER = BC001310_n614TBM02_ORDER[0] ;
         A615TBM02_DEL_FLG = BC001310_A615TBM02_DEL_FLG[0] ;
         n615TBM02_DEL_FLG = BC001310_n615TBM02_DEL_FLG[0] ;
         A618TBM02_CRT_PROG_NM = BC001310_A618TBM02_CRT_PROG_NM[0] ;
         n618TBM02_CRT_PROG_NM = BC001310_n618TBM02_CRT_PROG_NM[0] ;
         A621TBM02_UPD_PROG_NM = BC001310_A621TBM02_UPD_PROG_NM[0] ;
         n621TBM02_UPD_PROG_NM = BC001310_n621TBM02_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode38 ;
   }

   public void scanKeyEnd1338( )
   {
      pr_default.close(8);
   }

   public void afterConfirm1338( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1338( )
   {
      /* Before Insert Rules */
      A616TBM02_CRT_DATETIME = GXutil.now( ) ;
      n616TBM02_CRT_DATETIME = false ;
      GXt_char1 = A617TBM02_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A617TBM02_CRT_USER_ID = GXt_char1 ;
      n617TBM02_CRT_USER_ID = false ;
      A619TBM02_UPD_DATETIME = GXutil.now( ) ;
      n619TBM02_UPD_DATETIME = false ;
      GXt_char1 = A620TBM02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A620TBM02_UPD_USER_ID = GXt_char1 ;
      n620TBM02_UPD_USER_ID = false ;
      A622TBM02_UPD_CNT = (long)(O622TBM02_UPD_CNT+1) ;
      n622TBM02_UPD_CNT = false ;
   }

   public void beforeUpdate1338( )
   {
      /* Before Update Rules */
      A619TBM02_UPD_DATETIME = GXutil.now( ) ;
      n619TBM02_UPD_DATETIME = false ;
      GXt_char1 = A620TBM02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A620TBM02_UPD_USER_ID = GXt_char1 ;
      n620TBM02_UPD_USER_ID = false ;
      A622TBM02_UPD_CNT = (long)(O622TBM02_UPD_CNT+1) ;
      n622TBM02_UPD_CNT = false ;
   }

   public void beforeDelete1338( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1338( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1338( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1338( )
   {
   }

   public void addRow1338( )
   {
      VarsToRow38( bcTBM02_CDISC_DOMAIN) ;
   }

   public void readRow1338( )
   {
      RowToVars38( bcTBM02_CDISC_DOMAIN, 1) ;
   }

   public void initializeNonKey1338( )
   {
      A616TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n616TBM02_CRT_DATETIME = false ;
      A617TBM02_CRT_USER_ID = "" ;
      n617TBM02_CRT_USER_ID = false ;
      A619TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n619TBM02_UPD_DATETIME = false ;
      A620TBM02_UPD_USER_ID = "" ;
      n620TBM02_UPD_USER_ID = false ;
      A622TBM02_UPD_CNT = 0 ;
      n622TBM02_UPD_CNT = false ;
      A610TBM02_DOM_ENM = "" ;
      n610TBM02_DOM_ENM = false ;
      A611TBM02_DOM_JNM = "" ;
      n611TBM02_DOM_JNM = false ;
      A612TBM02_DOM_GRP_NM = "" ;
      n612TBM02_DOM_GRP_NM = false ;
      A613TBM02_NOTE = "" ;
      n613TBM02_NOTE = false ;
      A614TBM02_ORDER = 0 ;
      n614TBM02_ORDER = false ;
      A615TBM02_DEL_FLG = "" ;
      n615TBM02_DEL_FLG = false ;
      A618TBM02_CRT_PROG_NM = "" ;
      n618TBM02_CRT_PROG_NM = false ;
      A621TBM02_UPD_PROG_NM = "" ;
      n621TBM02_UPD_PROG_NM = false ;
      O622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
      n622TBM02_UPD_CNT = false ;
   }

   public void initAll1338( )
   {
      A49TBM02_DOM_CD = "" ;
      initializeNonKey1338( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow38( SdtTBM02_CDISC_DOMAIN obj38 )
   {
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Mode( Gx_mode );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime( A616TBM02_CRT_DATETIME );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id( A617TBM02_CRT_USER_ID );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime( A619TBM02_UPD_DATETIME );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id( A620TBM02_UPD_USER_ID );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt( A622TBM02_UPD_CNT );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm( A610TBM02_DOM_ENM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm( A611TBM02_DOM_JNM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm( A612TBM02_DOM_GRP_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note( A613TBM02_NOTE );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order( A614TBM02_ORDER );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg( A615TBM02_DEL_FLG );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm( A618TBM02_CRT_PROG_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm( A621TBM02_UPD_PROG_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd( A49TBM02_DOM_CD );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd_Z( Z49TBM02_DOM_CD );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_Z( Z610TBM02_DOM_ENM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_Z( Z611TBM02_DOM_JNM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_Z( Z612TBM02_DOM_GRP_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_Z( Z613TBM02_NOTE );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_Z( Z614TBM02_ORDER );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_Z( Z615TBM02_DEL_FLG );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_Z( Z616TBM02_CRT_DATETIME );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_Z( Z617TBM02_CRT_USER_ID );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_Z( Z618TBM02_CRT_PROG_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_Z( Z619TBM02_UPD_DATETIME );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_Z( Z620TBM02_UPD_USER_ID );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_Z( Z621TBM02_UPD_PROG_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_Z( Z622TBM02_UPD_CNT );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_N( (byte)((byte)((n610TBM02_DOM_ENM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_N( (byte)((byte)((n611TBM02_DOM_JNM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_N( (byte)((byte)((n612TBM02_DOM_GRP_NM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_N( (byte)((byte)((n613TBM02_NOTE)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_N( (byte)((byte)((n614TBM02_ORDER)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_N( (byte)((byte)((n615TBM02_DEL_FLG)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_N( (byte)((byte)((n616TBM02_CRT_DATETIME)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_N( (byte)((byte)((n617TBM02_CRT_USER_ID)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_N( (byte)((byte)((n618TBM02_CRT_PROG_NM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_N( (byte)((byte)((n619TBM02_UPD_DATETIME)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_N( (byte)((byte)((n620TBM02_UPD_USER_ID)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_N( (byte)((byte)((n621TBM02_UPD_PROG_NM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_N( (byte)((byte)((n622TBM02_UPD_CNT)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Mode( Gx_mode );
   }

   public void KeyVarsToRow38( SdtTBM02_CDISC_DOMAIN obj38 )
   {
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd( A49TBM02_DOM_CD );
   }

   public void RowToVars38( SdtTBM02_CDISC_DOMAIN obj38 ,
                            int forceLoad )
   {
      Gx_mode = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Mode() ;
      A616TBM02_CRT_DATETIME = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime() ;
      n616TBM02_CRT_DATETIME = false ;
      A617TBM02_CRT_USER_ID = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id() ;
      n617TBM02_CRT_USER_ID = false ;
      A619TBM02_UPD_DATETIME = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime() ;
      n619TBM02_UPD_DATETIME = false ;
      A620TBM02_UPD_USER_ID = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id() ;
      n620TBM02_UPD_USER_ID = false ;
      A622TBM02_UPD_CNT = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt() ;
      n622TBM02_UPD_CNT = false ;
      A610TBM02_DOM_ENM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm() ;
      n610TBM02_DOM_ENM = false ;
      A611TBM02_DOM_JNM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm() ;
      n611TBM02_DOM_JNM = false ;
      A612TBM02_DOM_GRP_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm() ;
      n612TBM02_DOM_GRP_NM = false ;
      A613TBM02_NOTE = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note() ;
      n613TBM02_NOTE = false ;
      A614TBM02_ORDER = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order() ;
      n614TBM02_ORDER = false ;
      A615TBM02_DEL_FLG = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg() ;
      n615TBM02_DEL_FLG = false ;
      A618TBM02_CRT_PROG_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm() ;
      n618TBM02_CRT_PROG_NM = false ;
      A621TBM02_UPD_PROG_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm() ;
      n621TBM02_UPD_PROG_NM = false ;
      A49TBM02_DOM_CD = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd() ;
      Z49TBM02_DOM_CD = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd_Z() ;
      Z610TBM02_DOM_ENM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_Z() ;
      Z611TBM02_DOM_JNM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_Z() ;
      Z612TBM02_DOM_GRP_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_Z() ;
      Z613TBM02_NOTE = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_Z() ;
      Z614TBM02_ORDER = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_Z() ;
      Z615TBM02_DEL_FLG = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_Z() ;
      Z616TBM02_CRT_DATETIME = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_Z() ;
      Z617TBM02_CRT_USER_ID = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_Z() ;
      Z618TBM02_CRT_PROG_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_Z() ;
      Z619TBM02_UPD_DATETIME = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_Z() ;
      Z620TBM02_UPD_USER_ID = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_Z() ;
      Z621TBM02_UPD_PROG_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_Z() ;
      Z622TBM02_UPD_CNT = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_Z() ;
      O622TBM02_UPD_CNT = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_Z() ;
      n610TBM02_DOM_ENM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_N()==0)?false:true) ;
      n611TBM02_DOM_JNM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_N()==0)?false:true) ;
      n612TBM02_DOM_GRP_NM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_N()==0)?false:true) ;
      n613TBM02_NOTE = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_N()==0)?false:true) ;
      n614TBM02_ORDER = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_N()==0)?false:true) ;
      n615TBM02_DEL_FLG = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_N()==0)?false:true) ;
      n616TBM02_CRT_DATETIME = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_N()==0)?false:true) ;
      n617TBM02_CRT_USER_ID = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_N()==0)?false:true) ;
      n618TBM02_CRT_PROG_NM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_N()==0)?false:true) ;
      n619TBM02_UPD_DATETIME = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_N()==0)?false:true) ;
      n620TBM02_UPD_USER_ID = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_N()==0)?false:true) ;
      n621TBM02_UPD_PROG_NM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_N()==0)?false:true) ;
      n622TBM02_UPD_CNT = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A49TBM02_DOM_CD = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1338( ) ;
      scanKeyStart1338( ) ;
      if ( RcdFound38 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z49TBM02_DOM_CD = A49TBM02_DOM_CD ;
         O622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
         n622TBM02_UPD_CNT = false ;
      }
      zm1338( -8) ;
      onLoadActions1338( ) ;
      addRow1338( ) ;
      scanKeyEnd1338( ) ;
      if ( RcdFound38 == 0 )
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
      RowToVars38( bcTBM02_CDISC_DOMAIN, 0) ;
      scanKeyStart1338( ) ;
      if ( RcdFound38 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z49TBM02_DOM_CD = A49TBM02_DOM_CD ;
         O622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
         n622TBM02_UPD_CNT = false ;
      }
      zm1338( -8) ;
      onLoadActions1338( ) ;
      addRow1338( ) ;
      scanKeyEnd1338( ) ;
      if ( RcdFound38 == 0 )
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
      RowToVars38( bcTBM02_CDISC_DOMAIN, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1338( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1338( ) ;
      }
      else
      {
         if ( RcdFound38 == 1 )
         {
            if ( GXutil.strcmp(A49TBM02_DOM_CD, Z49TBM02_DOM_CD) != 0 )
            {
               A49TBM02_DOM_CD = Z49TBM02_DOM_CD ;
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
               update1338( ) ;
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
               if ( GXutil.strcmp(A49TBM02_DOM_CD, Z49TBM02_DOM_CD) != 0 )
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
                     insert1338( ) ;
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
                     insert1338( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow38( bcTBM02_CDISC_DOMAIN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars38( bcTBM02_CDISC_DOMAIN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1338( ) ;
      if ( RcdFound38 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A49TBM02_DOM_CD, Z49TBM02_DOM_CD) != 0 )
         {
            A49TBM02_DOM_CD = Z49TBM02_DOM_CD ;
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
         if ( GXutil.strcmp(A49TBM02_DOM_CD, Z49TBM02_DOM_CD) != 0 )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm02_cdisc_domain_bc");
      VarsToRow38( bcTBM02_CDISC_DOMAIN) ;
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
      Gx_mode = bcTBM02_CDISC_DOMAIN.getgxTv_SdtTBM02_CDISC_DOMAIN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM02_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM02_CDISC_DOMAIN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM02_CDISC_DOMAIN )
      {
         bcTBM02_CDISC_DOMAIN = sdt ;
         if ( GXutil.strcmp(bcTBM02_CDISC_DOMAIN.getgxTv_SdtTBM02_CDISC_DOMAIN_Mode(), "") == 0 )
         {
            bcTBM02_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow38( bcTBM02_CDISC_DOMAIN) ;
         }
         else
         {
            RowToVars38( bcTBM02_CDISC_DOMAIN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM02_CDISC_DOMAIN.getgxTv_SdtTBM02_CDISC_DOMAIN_Mode(), "") == 0 )
         {
            bcTBM02_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars38( bcTBM02_CDISC_DOMAIN, 1) ;
   }

   public SdtTBM02_CDISC_DOMAIN getTBM02_CDISC_DOMAIN_BC( )
   {
      return bcTBM02_CDISC_DOMAIN ;
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
      Z49TBM02_DOM_CD = "" ;
      A49TBM02_DOM_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A610TBM02_DOM_ENM = "" ;
      A611TBM02_DOM_JNM = "" ;
      A612TBM02_DOM_GRP_NM = "" ;
      A613TBM02_NOTE = "" ;
      A615TBM02_DEL_FLG = "" ;
      A616TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A617TBM02_CRT_USER_ID = "" ;
      A618TBM02_CRT_PROG_NM = "" ;
      A619TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A620TBM02_UPD_USER_ID = "" ;
      A621TBM02_UPD_PROG_NM = "" ;
      Z616TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z617TBM02_CRT_USER_ID = "" ;
      Z619TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z620TBM02_UPD_USER_ID = "" ;
      Z610TBM02_DOM_ENM = "" ;
      Z611TBM02_DOM_JNM = "" ;
      Z612TBM02_DOM_GRP_NM = "" ;
      Z613TBM02_NOTE = "" ;
      Z615TBM02_DEL_FLG = "" ;
      Z618TBM02_CRT_PROG_NM = "" ;
      Z621TBM02_UPD_PROG_NM = "" ;
      BC00134_A49TBM02_DOM_CD = new String[] {""} ;
      BC00134_A616TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00134_n616TBM02_CRT_DATETIME = new boolean[] {false} ;
      BC00134_A617TBM02_CRT_USER_ID = new String[] {""} ;
      BC00134_n617TBM02_CRT_USER_ID = new boolean[] {false} ;
      BC00134_A619TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00134_n619TBM02_UPD_DATETIME = new boolean[] {false} ;
      BC00134_A620TBM02_UPD_USER_ID = new String[] {""} ;
      BC00134_n620TBM02_UPD_USER_ID = new boolean[] {false} ;
      BC00134_A622TBM02_UPD_CNT = new long[1] ;
      BC00134_n622TBM02_UPD_CNT = new boolean[] {false} ;
      BC00134_A610TBM02_DOM_ENM = new String[] {""} ;
      BC00134_n610TBM02_DOM_ENM = new boolean[] {false} ;
      BC00134_A611TBM02_DOM_JNM = new String[] {""} ;
      BC00134_n611TBM02_DOM_JNM = new boolean[] {false} ;
      BC00134_A612TBM02_DOM_GRP_NM = new String[] {""} ;
      BC00134_n612TBM02_DOM_GRP_NM = new boolean[] {false} ;
      BC00134_A613TBM02_NOTE = new String[] {""} ;
      BC00134_n613TBM02_NOTE = new boolean[] {false} ;
      BC00134_A614TBM02_ORDER = new int[1] ;
      BC00134_n614TBM02_ORDER = new boolean[] {false} ;
      BC00134_A615TBM02_DEL_FLG = new String[] {""} ;
      BC00134_n615TBM02_DEL_FLG = new boolean[] {false} ;
      BC00134_A618TBM02_CRT_PROG_NM = new String[] {""} ;
      BC00134_n618TBM02_CRT_PROG_NM = new boolean[] {false} ;
      BC00134_A621TBM02_UPD_PROG_NM = new String[] {""} ;
      BC00134_n621TBM02_UPD_PROG_NM = new boolean[] {false} ;
      BC00135_A49TBM02_DOM_CD = new String[] {""} ;
      BC00133_A49TBM02_DOM_CD = new String[] {""} ;
      BC00133_A616TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00133_n616TBM02_CRT_DATETIME = new boolean[] {false} ;
      BC00133_A617TBM02_CRT_USER_ID = new String[] {""} ;
      BC00133_n617TBM02_CRT_USER_ID = new boolean[] {false} ;
      BC00133_A619TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00133_n619TBM02_UPD_DATETIME = new boolean[] {false} ;
      BC00133_A620TBM02_UPD_USER_ID = new String[] {""} ;
      BC00133_n620TBM02_UPD_USER_ID = new boolean[] {false} ;
      BC00133_A622TBM02_UPD_CNT = new long[1] ;
      BC00133_n622TBM02_UPD_CNT = new boolean[] {false} ;
      BC00133_A610TBM02_DOM_ENM = new String[] {""} ;
      BC00133_n610TBM02_DOM_ENM = new boolean[] {false} ;
      BC00133_A611TBM02_DOM_JNM = new String[] {""} ;
      BC00133_n611TBM02_DOM_JNM = new boolean[] {false} ;
      BC00133_A612TBM02_DOM_GRP_NM = new String[] {""} ;
      BC00133_n612TBM02_DOM_GRP_NM = new boolean[] {false} ;
      BC00133_A613TBM02_NOTE = new String[] {""} ;
      BC00133_n613TBM02_NOTE = new boolean[] {false} ;
      BC00133_A614TBM02_ORDER = new int[1] ;
      BC00133_n614TBM02_ORDER = new boolean[] {false} ;
      BC00133_A615TBM02_DEL_FLG = new String[] {""} ;
      BC00133_n615TBM02_DEL_FLG = new boolean[] {false} ;
      BC00133_A618TBM02_CRT_PROG_NM = new String[] {""} ;
      BC00133_n618TBM02_CRT_PROG_NM = new boolean[] {false} ;
      BC00133_A621TBM02_UPD_PROG_NM = new String[] {""} ;
      BC00133_n621TBM02_UPD_PROG_NM = new boolean[] {false} ;
      sMode38 = "" ;
      BC00132_A49TBM02_DOM_CD = new String[] {""} ;
      BC00132_A616TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00132_n616TBM02_CRT_DATETIME = new boolean[] {false} ;
      BC00132_A617TBM02_CRT_USER_ID = new String[] {""} ;
      BC00132_n617TBM02_CRT_USER_ID = new boolean[] {false} ;
      BC00132_A619TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00132_n619TBM02_UPD_DATETIME = new boolean[] {false} ;
      BC00132_A620TBM02_UPD_USER_ID = new String[] {""} ;
      BC00132_n620TBM02_UPD_USER_ID = new boolean[] {false} ;
      BC00132_A622TBM02_UPD_CNT = new long[1] ;
      BC00132_n622TBM02_UPD_CNT = new boolean[] {false} ;
      BC00132_A610TBM02_DOM_ENM = new String[] {""} ;
      BC00132_n610TBM02_DOM_ENM = new boolean[] {false} ;
      BC00132_A611TBM02_DOM_JNM = new String[] {""} ;
      BC00132_n611TBM02_DOM_JNM = new boolean[] {false} ;
      BC00132_A612TBM02_DOM_GRP_NM = new String[] {""} ;
      BC00132_n612TBM02_DOM_GRP_NM = new boolean[] {false} ;
      BC00132_A613TBM02_NOTE = new String[] {""} ;
      BC00132_n613TBM02_NOTE = new boolean[] {false} ;
      BC00132_A614TBM02_ORDER = new int[1] ;
      BC00132_n614TBM02_ORDER = new boolean[] {false} ;
      BC00132_A615TBM02_DEL_FLG = new String[] {""} ;
      BC00132_n615TBM02_DEL_FLG = new boolean[] {false} ;
      BC00132_A618TBM02_CRT_PROG_NM = new String[] {""} ;
      BC00132_n618TBM02_CRT_PROG_NM = new boolean[] {false} ;
      BC00132_A621TBM02_UPD_PROG_NM = new String[] {""} ;
      BC00132_n621TBM02_UPD_PROG_NM = new boolean[] {false} ;
      BC00139_A59TBM03_DOM_CD = new String[] {""} ;
      BC00139_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      BC001310_A49TBM02_DOM_CD = new String[] {""} ;
      BC001310_A616TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001310_n616TBM02_CRT_DATETIME = new boolean[] {false} ;
      BC001310_A617TBM02_CRT_USER_ID = new String[] {""} ;
      BC001310_n617TBM02_CRT_USER_ID = new boolean[] {false} ;
      BC001310_A619TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001310_n619TBM02_UPD_DATETIME = new boolean[] {false} ;
      BC001310_A620TBM02_UPD_USER_ID = new String[] {""} ;
      BC001310_n620TBM02_UPD_USER_ID = new boolean[] {false} ;
      BC001310_A622TBM02_UPD_CNT = new long[1] ;
      BC001310_n622TBM02_UPD_CNT = new boolean[] {false} ;
      BC001310_A610TBM02_DOM_ENM = new String[] {""} ;
      BC001310_n610TBM02_DOM_ENM = new boolean[] {false} ;
      BC001310_A611TBM02_DOM_JNM = new String[] {""} ;
      BC001310_n611TBM02_DOM_JNM = new boolean[] {false} ;
      BC001310_A612TBM02_DOM_GRP_NM = new String[] {""} ;
      BC001310_n612TBM02_DOM_GRP_NM = new boolean[] {false} ;
      BC001310_A613TBM02_NOTE = new String[] {""} ;
      BC001310_n613TBM02_NOTE = new boolean[] {false} ;
      BC001310_A614TBM02_ORDER = new int[1] ;
      BC001310_n614TBM02_ORDER = new boolean[] {false} ;
      BC001310_A615TBM02_DEL_FLG = new String[] {""} ;
      BC001310_n615TBM02_DEL_FLG = new boolean[] {false} ;
      BC001310_A618TBM02_CRT_PROG_NM = new String[] {""} ;
      BC001310_n618TBM02_CRT_PROG_NM = new boolean[] {false} ;
      BC001310_A621TBM02_UPD_PROG_NM = new String[] {""} ;
      BC001310_n621TBM02_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm02_cdisc_domain_bc__default(),
         new Object[] {
             new Object[] {
            BC00132_A49TBM02_DOM_CD, BC00132_A616TBM02_CRT_DATETIME, BC00132_n616TBM02_CRT_DATETIME, BC00132_A617TBM02_CRT_USER_ID, BC00132_n617TBM02_CRT_USER_ID, BC00132_A619TBM02_UPD_DATETIME, BC00132_n619TBM02_UPD_DATETIME, BC00132_A620TBM02_UPD_USER_ID, BC00132_n620TBM02_UPD_USER_ID, BC00132_A622TBM02_UPD_CNT,
            BC00132_n622TBM02_UPD_CNT, BC00132_A610TBM02_DOM_ENM, BC00132_n610TBM02_DOM_ENM, BC00132_A611TBM02_DOM_JNM, BC00132_n611TBM02_DOM_JNM, BC00132_A612TBM02_DOM_GRP_NM, BC00132_n612TBM02_DOM_GRP_NM, BC00132_A613TBM02_NOTE, BC00132_n613TBM02_NOTE, BC00132_A614TBM02_ORDER,
            BC00132_n614TBM02_ORDER, BC00132_A615TBM02_DEL_FLG, BC00132_n615TBM02_DEL_FLG, BC00132_A618TBM02_CRT_PROG_NM, BC00132_n618TBM02_CRT_PROG_NM, BC00132_A621TBM02_UPD_PROG_NM, BC00132_n621TBM02_UPD_PROG_NM
            }
            , new Object[] {
            BC00133_A49TBM02_DOM_CD, BC00133_A616TBM02_CRT_DATETIME, BC00133_n616TBM02_CRT_DATETIME, BC00133_A617TBM02_CRT_USER_ID, BC00133_n617TBM02_CRT_USER_ID, BC00133_A619TBM02_UPD_DATETIME, BC00133_n619TBM02_UPD_DATETIME, BC00133_A620TBM02_UPD_USER_ID, BC00133_n620TBM02_UPD_USER_ID, BC00133_A622TBM02_UPD_CNT,
            BC00133_n622TBM02_UPD_CNT, BC00133_A610TBM02_DOM_ENM, BC00133_n610TBM02_DOM_ENM, BC00133_A611TBM02_DOM_JNM, BC00133_n611TBM02_DOM_JNM, BC00133_A612TBM02_DOM_GRP_NM, BC00133_n612TBM02_DOM_GRP_NM, BC00133_A613TBM02_NOTE, BC00133_n613TBM02_NOTE, BC00133_A614TBM02_ORDER,
            BC00133_n614TBM02_ORDER, BC00133_A615TBM02_DEL_FLG, BC00133_n615TBM02_DEL_FLG, BC00133_A618TBM02_CRT_PROG_NM, BC00133_n618TBM02_CRT_PROG_NM, BC00133_A621TBM02_UPD_PROG_NM, BC00133_n621TBM02_UPD_PROG_NM
            }
            , new Object[] {
            BC00134_A49TBM02_DOM_CD, BC00134_A616TBM02_CRT_DATETIME, BC00134_n616TBM02_CRT_DATETIME, BC00134_A617TBM02_CRT_USER_ID, BC00134_n617TBM02_CRT_USER_ID, BC00134_A619TBM02_UPD_DATETIME, BC00134_n619TBM02_UPD_DATETIME, BC00134_A620TBM02_UPD_USER_ID, BC00134_n620TBM02_UPD_USER_ID, BC00134_A622TBM02_UPD_CNT,
            BC00134_n622TBM02_UPD_CNT, BC00134_A610TBM02_DOM_ENM, BC00134_n610TBM02_DOM_ENM, BC00134_A611TBM02_DOM_JNM, BC00134_n611TBM02_DOM_JNM, BC00134_A612TBM02_DOM_GRP_NM, BC00134_n612TBM02_DOM_GRP_NM, BC00134_A613TBM02_NOTE, BC00134_n613TBM02_NOTE, BC00134_A614TBM02_ORDER,
            BC00134_n614TBM02_ORDER, BC00134_A615TBM02_DEL_FLG, BC00134_n615TBM02_DEL_FLG, BC00134_A618TBM02_CRT_PROG_NM, BC00134_n618TBM02_CRT_PROG_NM, BC00134_A621TBM02_UPD_PROG_NM, BC00134_n621TBM02_UPD_PROG_NM
            }
            , new Object[] {
            BC00135_A49TBM02_DOM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00139_A59TBM03_DOM_CD, BC00139_A60TBM03_DOM_VAR_NM
            }
            , new Object[] {
            BC001310_A49TBM02_DOM_CD, BC001310_A616TBM02_CRT_DATETIME, BC001310_n616TBM02_CRT_DATETIME, BC001310_A617TBM02_CRT_USER_ID, BC001310_n617TBM02_CRT_USER_ID, BC001310_A619TBM02_UPD_DATETIME, BC001310_n619TBM02_UPD_DATETIME, BC001310_A620TBM02_UPD_USER_ID, BC001310_n620TBM02_UPD_USER_ID, BC001310_A622TBM02_UPD_CNT,
            BC001310_n622TBM02_UPD_CNT, BC001310_A610TBM02_DOM_ENM, BC001310_n610TBM02_DOM_ENM, BC001310_A611TBM02_DOM_JNM, BC001310_n611TBM02_DOM_JNM, BC001310_A612TBM02_DOM_GRP_NM, BC001310_n612TBM02_DOM_GRP_NM, BC001310_A613TBM02_NOTE, BC001310_n613TBM02_NOTE, BC001310_A614TBM02_ORDER,
            BC001310_n614TBM02_ORDER, BC001310_A615TBM02_DEL_FLG, BC001310_n615TBM02_DEL_FLG, BC001310_A618TBM02_CRT_PROG_NM, BC001310_n618TBM02_CRT_PROG_NM, BC001310_A621TBM02_UPD_PROG_NM, BC001310_n621TBM02_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM02_CDISC_DOMAIN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11132 */
      e11132 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound38 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A614TBM02_ORDER ;
   private int GX_JID ;
   private int Z614TBM02_ORDER ;
   private int GXActiveErrHndl ;
   private long A622TBM02_UPD_CNT ;
   private long Z622TBM02_UPD_CNT ;
   private long O622TBM02_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode38 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A616TBM02_CRT_DATETIME ;
   private java.util.Date A619TBM02_UPD_DATETIME ;
   private java.util.Date Z616TBM02_CRT_DATETIME ;
   private java.util.Date Z619TBM02_UPD_DATETIME ;
   private boolean n616TBM02_CRT_DATETIME ;
   private boolean n617TBM02_CRT_USER_ID ;
   private boolean n619TBM02_UPD_DATETIME ;
   private boolean n620TBM02_UPD_USER_ID ;
   private boolean n622TBM02_UPD_CNT ;
   private boolean n610TBM02_DOM_ENM ;
   private boolean n611TBM02_DOM_JNM ;
   private boolean n612TBM02_DOM_GRP_NM ;
   private boolean n613TBM02_NOTE ;
   private boolean n614TBM02_ORDER ;
   private boolean n615TBM02_DEL_FLG ;
   private boolean n618TBM02_CRT_PROG_NM ;
   private boolean n621TBM02_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z49TBM02_DOM_CD ;
   private String A49TBM02_DOM_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A610TBM02_DOM_ENM ;
   private String A611TBM02_DOM_JNM ;
   private String A612TBM02_DOM_GRP_NM ;
   private String A613TBM02_NOTE ;
   private String A615TBM02_DEL_FLG ;
   private String A617TBM02_CRT_USER_ID ;
   private String A618TBM02_CRT_PROG_NM ;
   private String A620TBM02_UPD_USER_ID ;
   private String A621TBM02_UPD_PROG_NM ;
   private String Z617TBM02_CRT_USER_ID ;
   private String Z620TBM02_UPD_USER_ID ;
   private String Z610TBM02_DOM_ENM ;
   private String Z611TBM02_DOM_JNM ;
   private String Z612TBM02_DOM_GRP_NM ;
   private String Z613TBM02_NOTE ;
   private String Z615TBM02_DEL_FLG ;
   private String Z618TBM02_CRT_PROG_NM ;
   private String Z621TBM02_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM02_CDISC_DOMAIN bcTBM02_CDISC_DOMAIN ;
   private IDataStoreProvider pr_default ;
   private String[] BC00134_A49TBM02_DOM_CD ;
   private java.util.Date[] BC00134_A616TBM02_CRT_DATETIME ;
   private boolean[] BC00134_n616TBM02_CRT_DATETIME ;
   private String[] BC00134_A617TBM02_CRT_USER_ID ;
   private boolean[] BC00134_n617TBM02_CRT_USER_ID ;
   private java.util.Date[] BC00134_A619TBM02_UPD_DATETIME ;
   private boolean[] BC00134_n619TBM02_UPD_DATETIME ;
   private String[] BC00134_A620TBM02_UPD_USER_ID ;
   private boolean[] BC00134_n620TBM02_UPD_USER_ID ;
   private long[] BC00134_A622TBM02_UPD_CNT ;
   private boolean[] BC00134_n622TBM02_UPD_CNT ;
   private String[] BC00134_A610TBM02_DOM_ENM ;
   private boolean[] BC00134_n610TBM02_DOM_ENM ;
   private String[] BC00134_A611TBM02_DOM_JNM ;
   private boolean[] BC00134_n611TBM02_DOM_JNM ;
   private String[] BC00134_A612TBM02_DOM_GRP_NM ;
   private boolean[] BC00134_n612TBM02_DOM_GRP_NM ;
   private String[] BC00134_A613TBM02_NOTE ;
   private boolean[] BC00134_n613TBM02_NOTE ;
   private int[] BC00134_A614TBM02_ORDER ;
   private boolean[] BC00134_n614TBM02_ORDER ;
   private String[] BC00134_A615TBM02_DEL_FLG ;
   private boolean[] BC00134_n615TBM02_DEL_FLG ;
   private String[] BC00134_A618TBM02_CRT_PROG_NM ;
   private boolean[] BC00134_n618TBM02_CRT_PROG_NM ;
   private String[] BC00134_A621TBM02_UPD_PROG_NM ;
   private boolean[] BC00134_n621TBM02_UPD_PROG_NM ;
   private String[] BC00135_A49TBM02_DOM_CD ;
   private String[] BC00133_A49TBM02_DOM_CD ;
   private java.util.Date[] BC00133_A616TBM02_CRT_DATETIME ;
   private boolean[] BC00133_n616TBM02_CRT_DATETIME ;
   private String[] BC00133_A617TBM02_CRT_USER_ID ;
   private boolean[] BC00133_n617TBM02_CRT_USER_ID ;
   private java.util.Date[] BC00133_A619TBM02_UPD_DATETIME ;
   private boolean[] BC00133_n619TBM02_UPD_DATETIME ;
   private String[] BC00133_A620TBM02_UPD_USER_ID ;
   private boolean[] BC00133_n620TBM02_UPD_USER_ID ;
   private long[] BC00133_A622TBM02_UPD_CNT ;
   private boolean[] BC00133_n622TBM02_UPD_CNT ;
   private String[] BC00133_A610TBM02_DOM_ENM ;
   private boolean[] BC00133_n610TBM02_DOM_ENM ;
   private String[] BC00133_A611TBM02_DOM_JNM ;
   private boolean[] BC00133_n611TBM02_DOM_JNM ;
   private String[] BC00133_A612TBM02_DOM_GRP_NM ;
   private boolean[] BC00133_n612TBM02_DOM_GRP_NM ;
   private String[] BC00133_A613TBM02_NOTE ;
   private boolean[] BC00133_n613TBM02_NOTE ;
   private int[] BC00133_A614TBM02_ORDER ;
   private boolean[] BC00133_n614TBM02_ORDER ;
   private String[] BC00133_A615TBM02_DEL_FLG ;
   private boolean[] BC00133_n615TBM02_DEL_FLG ;
   private String[] BC00133_A618TBM02_CRT_PROG_NM ;
   private boolean[] BC00133_n618TBM02_CRT_PROG_NM ;
   private String[] BC00133_A621TBM02_UPD_PROG_NM ;
   private boolean[] BC00133_n621TBM02_UPD_PROG_NM ;
   private String[] BC00132_A49TBM02_DOM_CD ;
   private java.util.Date[] BC00132_A616TBM02_CRT_DATETIME ;
   private boolean[] BC00132_n616TBM02_CRT_DATETIME ;
   private String[] BC00132_A617TBM02_CRT_USER_ID ;
   private boolean[] BC00132_n617TBM02_CRT_USER_ID ;
   private java.util.Date[] BC00132_A619TBM02_UPD_DATETIME ;
   private boolean[] BC00132_n619TBM02_UPD_DATETIME ;
   private String[] BC00132_A620TBM02_UPD_USER_ID ;
   private boolean[] BC00132_n620TBM02_UPD_USER_ID ;
   private long[] BC00132_A622TBM02_UPD_CNT ;
   private boolean[] BC00132_n622TBM02_UPD_CNT ;
   private String[] BC00132_A610TBM02_DOM_ENM ;
   private boolean[] BC00132_n610TBM02_DOM_ENM ;
   private String[] BC00132_A611TBM02_DOM_JNM ;
   private boolean[] BC00132_n611TBM02_DOM_JNM ;
   private String[] BC00132_A612TBM02_DOM_GRP_NM ;
   private boolean[] BC00132_n612TBM02_DOM_GRP_NM ;
   private String[] BC00132_A613TBM02_NOTE ;
   private boolean[] BC00132_n613TBM02_NOTE ;
   private int[] BC00132_A614TBM02_ORDER ;
   private boolean[] BC00132_n614TBM02_ORDER ;
   private String[] BC00132_A615TBM02_DEL_FLG ;
   private boolean[] BC00132_n615TBM02_DEL_FLG ;
   private String[] BC00132_A618TBM02_CRT_PROG_NM ;
   private boolean[] BC00132_n618TBM02_CRT_PROG_NM ;
   private String[] BC00132_A621TBM02_UPD_PROG_NM ;
   private boolean[] BC00132_n621TBM02_UPD_PROG_NM ;
   private String[] BC00139_A59TBM03_DOM_CD ;
   private String[] BC00139_A60TBM03_DOM_VAR_NM ;
   private String[] BC001310_A49TBM02_DOM_CD ;
   private java.util.Date[] BC001310_A616TBM02_CRT_DATETIME ;
   private boolean[] BC001310_n616TBM02_CRT_DATETIME ;
   private String[] BC001310_A617TBM02_CRT_USER_ID ;
   private boolean[] BC001310_n617TBM02_CRT_USER_ID ;
   private java.util.Date[] BC001310_A619TBM02_UPD_DATETIME ;
   private boolean[] BC001310_n619TBM02_UPD_DATETIME ;
   private String[] BC001310_A620TBM02_UPD_USER_ID ;
   private boolean[] BC001310_n620TBM02_UPD_USER_ID ;
   private long[] BC001310_A622TBM02_UPD_CNT ;
   private boolean[] BC001310_n622TBM02_UPD_CNT ;
   private String[] BC001310_A610TBM02_DOM_ENM ;
   private boolean[] BC001310_n610TBM02_DOM_ENM ;
   private String[] BC001310_A611TBM02_DOM_JNM ;
   private boolean[] BC001310_n611TBM02_DOM_JNM ;
   private String[] BC001310_A612TBM02_DOM_GRP_NM ;
   private boolean[] BC001310_n612TBM02_DOM_GRP_NM ;
   private String[] BC001310_A613TBM02_NOTE ;
   private boolean[] BC001310_n613TBM02_NOTE ;
   private int[] BC001310_A614TBM02_ORDER ;
   private boolean[] BC001310_n614TBM02_ORDER ;
   private String[] BC001310_A615TBM02_DEL_FLG ;
   private boolean[] BC001310_n615TBM02_DEL_FLG ;
   private String[] BC001310_A618TBM02_CRT_PROG_NM ;
   private boolean[] BC001310_n618TBM02_CRT_PROG_NM ;
   private String[] BC001310_A621TBM02_UPD_PROG_NM ;
   private boolean[] BC001310_n621TBM02_UPD_PROG_NM ;
}

final  class tbm02_cdisc_domain_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00132", "SELECT `TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00133", "SELECT `TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00134", "SELECT TM1.`TBM02_DOM_CD`, TM1.`TBM02_CRT_DATETIME`, TM1.`TBM02_CRT_USER_ID`, TM1.`TBM02_UPD_DATETIME`, TM1.`TBM02_UPD_USER_ID`, TM1.`TBM02_UPD_CNT`, TM1.`TBM02_DOM_ENM`, TM1.`TBM02_DOM_JNM`, TM1.`TBM02_DOM_GRP_NM`, TM1.`TBM02_NOTE`, TM1.`TBM02_ORDER`, TM1.`TBM02_DEL_FLG`, TM1.`TBM02_CRT_PROG_NM`, TM1.`TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` TM1 WHERE TM1.`TBM02_DOM_CD` = ? ORDER BY TM1.`TBM02_DOM_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00135", "SELECT `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00136", "INSERT INTO `TBM02_CDISC_DOMAIN`(`TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00137", "UPDATE `TBM02_CDISC_DOMAIN` SET `TBM02_CRT_DATETIME`=?, `TBM02_CRT_USER_ID`=?, `TBM02_UPD_DATETIME`=?, `TBM02_UPD_USER_ID`=?, `TBM02_UPD_CNT`=?, `TBM02_DOM_ENM`=?, `TBM02_DOM_JNM`=?, `TBM02_DOM_GRP_NM`=?, `TBM02_NOTE`=?, `TBM02_ORDER`=?, `TBM02_DEL_FLG`=?, `TBM02_CRT_PROG_NM`=?, `TBM02_UPD_PROG_NM`=?  WHERE `TBM02_DOM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00138", "DELETE FROM `TBM02_CDISC_DOMAIN`  WHERE `TBM02_DOM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00139", "SELECT `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC001310", "SELECT TM1.`TBM02_DOM_CD`, TM1.`TBM02_CRT_DATETIME`, TM1.`TBM02_CRT_USER_ID`, TM1.`TBM02_UPD_DATETIME`, TM1.`TBM02_UPD_USER_ID`, TM1.`TBM02_UPD_CNT`, TM1.`TBM02_DOM_ENM`, TM1.`TBM02_DOM_JNM`, TM1.`TBM02_DOM_GRP_NM`, TM1.`TBM02_NOTE`, TM1.`TBM02_ORDER`, TM1.`TBM02_DEL_FLG`, TM1.`TBM02_CRT_PROG_NM`, TM1.`TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` TM1 WHERE TM1.`TBM02_DOM_CD` = ? ORDER BY TM1.`TBM02_DOM_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
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
                  stmt.setVarchar(8, (String)parms[14], 50);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 50);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 1000);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
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
                  stmt.setVarchar(13, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 40);
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
                  stmt.setVarchar(7, (String)parms[13], 50);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 50);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
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
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               stmt.setVarchar(14, (String)parms[26], 16, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 16);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
      }
   }

}

