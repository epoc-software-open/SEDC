/*
               File: tam05_appli_kngn_bc
        Description: アプリケーション権限マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:0.24
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam05_appli_kngn_bc extends GXWebPanel implements IGxSilentTrn
{
   public tam05_appli_kngn_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam05_appli_kngn_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam05_appli_kngn_bc.class ));
   }

   public tam05_appli_kngn_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow099( ) ;
      standaloneNotModal( ) ;
      initializeNonKey099( ) ;
      standaloneModal( ) ;
      addRow099( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e12092 */
         e12092 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
            Z12TAM03_APP_ID = A12TAM03_APP_ID ;
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

   public void confirm_090( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls099( ) ;
         }
         else
         {
            checkExtendedTable099( ) ;
            if ( AnyError == 0 )
            {
               zm099( 9) ;
               zm099( 10) ;
            }
            closeExtendedTableCursors099( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11092( )
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

   public void e12092( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV12Pgmname) ;
      AV10W_TXT = "" ;
      AV10W_TXT = AV10W_TXT + "権限パターン区分:" + A13TAM04_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + "アプリケーションID:" + A12TAM03_APP_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A288TAM05_KNGN_FLG + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A289TAM05_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A290TAM05_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A291TAM05_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A292TAM05_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A293TAM05_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A294TAM05_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A295TAM05_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = GXutil.strReplace( AV10W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, AV10W_TXT) ;
   }

   public void zm099( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
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
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
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
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load099( )
   {
      /* Using cursor BC00096 */
      pr_default.execute(4, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = BC00096_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = BC00096_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = BC00096_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = BC00096_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = BC00096_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = BC00096_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = BC00096_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = BC00096_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = BC00096_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = BC00096_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = BC00096_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = BC00096_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = BC00096_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = BC00096_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = BC00096_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = BC00096_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = BC00096_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = BC00096_n295TAM05_UPD_PROG_NM[0] ;
         zm099( -8) ;
      }
      pr_default.close(4);
      onLoadActions099( ) ;
   }

   public void onLoadActions099( )
   {
      AV12Pgmname = "TAM05_APPLI_KNGN_BC" ;
   }

   public void checkExtendedTable099( )
   {
      standaloneModal( ) ;
      AV12Pgmname = "TAM05_APPLI_KNGN_BC" ;
      /* Using cursor BC00094 */
      pr_default.execute(2, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'権限パターンマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
      /* Using cursor BC00095 */
      pr_default.execute(3, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
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

   public void closeExtendedTableCursors099( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey099( )
   {
      /* Using cursor BC00097 */
      pr_default.execute(5, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00093 */
      pr_default.execute(1, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm099( 8) ;
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = BC00093_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = BC00093_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = BC00093_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = BC00093_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = BC00093_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = BC00093_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = BC00093_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = BC00093_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = BC00093_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = BC00093_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = BC00093_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = BC00093_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = BC00093_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = BC00093_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = BC00093_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = BC00093_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = BC00093_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = BC00093_n295TAM05_UPD_PROG_NM[0] ;
         A13TAM04_AUTH_CD = BC00093_A13TAM04_AUTH_CD[0] ;
         A12TAM03_APP_ID = BC00093_A12TAM03_APP_ID[0] ;
         O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         n296TAM05_UPD_CNT = false ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load099( ) ;
         if ( AnyError == 1 )
         {
            RcdFound9 = (short)(0) ;
            initializeNonKey099( ) ;
         }
         Gx_mode = sMode9 ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey099( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode9 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey099( ) ;
      if ( RcdFound9 == 0 )
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
      confirm_090( ) ;
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

   public void checkOptimisticConcurrency099( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00092 */
         pr_default.execute(0, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z290TAM05_CRT_DATETIME.equals( BC00092_A290TAM05_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z291TAM05_CRT_USER_ID, BC00092_A291TAM05_CRT_USER_ID[0]) != 0 ) || !( Z293TAM05_UPD_DATETIME.equals( BC00092_A293TAM05_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z294TAM05_UPD_USER_ID, BC00092_A294TAM05_UPD_USER_ID[0]) != 0 ) || ( Z296TAM05_UPD_CNT != BC00092_A296TAM05_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z288TAM05_KNGN_FLG, BC00092_A288TAM05_KNGN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z289TAM05_DEL_FLG, BC00092_A289TAM05_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z292TAM05_CRT_PROG_NM, BC00092_A292TAM05_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z295TAM05_UPD_PROG_NM, BC00092_A295TAM05_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM05_APPLI_KNGN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert099( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable099( ) ;
      }
      if ( AnyError == 0 )
      {
         zm099( 0) ;
         checkOptimisticConcurrency099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm099( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00098 */
                  pr_default.execute(6, new Object[] {new Boolean(n290TAM05_CRT_DATETIME), A290TAM05_CRT_DATETIME, new Boolean(n291TAM05_CRT_USER_ID), A291TAM05_CRT_USER_ID, new Boolean(n293TAM05_UPD_DATETIME), A293TAM05_UPD_DATETIME, new Boolean(n294TAM05_UPD_USER_ID), A294TAM05_UPD_USER_ID, new Boolean(n296TAM05_UPD_CNT), new Long(A296TAM05_UPD_CNT), new Boolean(n288TAM05_KNGN_FLG), A288TAM05_KNGN_FLG, new Boolean(n289TAM05_DEL_FLG), A289TAM05_DEL_FLG, new Boolean(n292TAM05_CRT_PROG_NM), A292TAM05_CRT_PROG_NM, new Boolean(n295TAM05_UPD_PROG_NM), A295TAM05_UPD_PROG_NM, A13TAM04_AUTH_CD, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
                  if ( (pr_default.getStatus(6) == 1) )
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
            load099( ) ;
         }
         endLevel099( ) ;
      }
      closeExtendedTableCursors099( ) ;
   }

   public void update099( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable099( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm099( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00099 */
                  pr_default.execute(7, new Object[] {new Boolean(n290TAM05_CRT_DATETIME), A290TAM05_CRT_DATETIME, new Boolean(n291TAM05_CRT_USER_ID), A291TAM05_CRT_USER_ID, new Boolean(n293TAM05_UPD_DATETIME), A293TAM05_UPD_DATETIME, new Boolean(n294TAM05_UPD_USER_ID), A294TAM05_UPD_USER_ID, new Boolean(n296TAM05_UPD_CNT), new Long(A296TAM05_UPD_CNT), new Boolean(n288TAM05_KNGN_FLG), A288TAM05_KNGN_FLG, new Boolean(n289TAM05_DEL_FLG), A289TAM05_DEL_FLG, new Boolean(n292TAM05_CRT_PROG_NM), A292TAM05_CRT_PROG_NM, new Boolean(n295TAM05_UPD_PROG_NM), A295TAM05_UPD_PROG_NM, A13TAM04_AUTH_CD, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate099( ) ;
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
         endLevel099( ) ;
      }
      closeExtendedTableCursors099( ) ;
   }

   public void deferredUpdate099( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency099( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls099( ) ;
         afterConfirm099( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete099( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000910 */
               pr_default.execute(8, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
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
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel099( ) ;
      Gx_mode = sMode9 ;
   }

   public void onDeleteControls099( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV12Pgmname = "TAM05_APPLI_KNGN_BC" ;
      }
   }

   public void endLevel099( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete099( ) ;
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

   public void scanKeyStart099( )
   {
      /* Scan By routine */
      /* Using cursor BC000911 */
      pr_default.execute(9, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = BC000911_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = BC000911_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = BC000911_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = BC000911_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = BC000911_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = BC000911_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = BC000911_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = BC000911_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = BC000911_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = BC000911_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = BC000911_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = BC000911_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = BC000911_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = BC000911_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = BC000911_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = BC000911_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = BC000911_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = BC000911_n295TAM05_UPD_PROG_NM[0] ;
         A13TAM04_AUTH_CD = BC000911_A13TAM04_AUTH_CD[0] ;
         A12TAM03_APP_ID = BC000911_A12TAM03_APP_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext099( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound9 = (short)(0) ;
      scanKeyLoad099( ) ;
   }

   public void scanKeyLoad099( )
   {
      sMode9 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = BC000911_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = BC000911_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = BC000911_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = BC000911_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = BC000911_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = BC000911_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = BC000911_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = BC000911_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = BC000911_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = BC000911_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = BC000911_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = BC000911_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = BC000911_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = BC000911_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = BC000911_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = BC000911_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = BC000911_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = BC000911_n295TAM05_UPD_PROG_NM[0] ;
         A13TAM04_AUTH_CD = BC000911_A13TAM04_AUTH_CD[0] ;
         A12TAM03_APP_ID = BC000911_A12TAM03_APP_ID[0] ;
      }
      Gx_mode = sMode9 ;
   }

   public void scanKeyEnd099( )
   {
      pr_default.close(9);
   }

   public void afterConfirm099( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert099( )
   {
      /* Before Insert Rules */
      A290TAM05_CRT_DATETIME = GXutil.now( ) ;
      n290TAM05_CRT_DATETIME = false ;
      GXt_char1 = A291TAM05_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A291TAM05_CRT_USER_ID = GXt_char1 ;
      n291TAM05_CRT_USER_ID = false ;
      A293TAM05_UPD_DATETIME = GXutil.now( ) ;
      n293TAM05_UPD_DATETIME = false ;
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = (long)(O296TAM05_UPD_CNT+1) ;
      n296TAM05_UPD_CNT = false ;
   }

   public void beforeUpdate099( )
   {
      /* Before Update Rules */
      A293TAM05_UPD_DATETIME = GXutil.now( ) ;
      n293TAM05_UPD_DATETIME = false ;
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = (long)(O296TAM05_UPD_CNT+1) ;
      n296TAM05_UPD_CNT = false ;
   }

   public void beforeDelete099( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete099( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate099( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes099( )
   {
   }

   public void addRow099( )
   {
      VarsToRow9( bcTAM05_APPLI_KNGN) ;
   }

   public void readRow099( )
   {
      RowToVars9( bcTAM05_APPLI_KNGN, 1) ;
   }

   public void initializeNonKey099( )
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

   public void initAll099( )
   {
      A13TAM04_AUTH_CD = "" ;
      A12TAM03_APP_ID = "" ;
      initializeNonKey099( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow9( SdtTAM05_APPLI_KNGN obj9 )
   {
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Mode( Gx_mode );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime( A290TAM05_CRT_DATETIME );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id( A291TAM05_CRT_USER_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime( A293TAM05_UPD_DATETIME );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id( A294TAM05_UPD_USER_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt( A296TAM05_UPD_CNT );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg( A288TAM05_KNGN_FLG );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg( A289TAM05_DEL_FLG );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm( A292TAM05_CRT_PROG_NM );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm( A295TAM05_UPD_PROG_NM );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd( A13TAM04_AUTH_CD );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id( A12TAM03_APP_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z( Z13TAM04_AUTH_CD );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z( Z12TAM03_APP_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z( Z288TAM05_KNGN_FLG );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z( Z289TAM05_DEL_FLG );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z( Z290TAM05_CRT_DATETIME );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z( Z291TAM05_CRT_USER_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z( Z292TAM05_CRT_PROG_NM );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z( Z293TAM05_UPD_DATETIME );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z( Z294TAM05_UPD_USER_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z( Z295TAM05_UPD_PROG_NM );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z( Z296TAM05_UPD_CNT );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N( (byte)((byte)((n288TAM05_KNGN_FLG)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N( (byte)((byte)((n289TAM05_DEL_FLG)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N( (byte)((byte)((n290TAM05_CRT_DATETIME)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N( (byte)((byte)((n291TAM05_CRT_USER_ID)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N( (byte)((byte)((n292TAM05_CRT_PROG_NM)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N( (byte)((byte)((n293TAM05_UPD_DATETIME)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N( (byte)((byte)((n294TAM05_UPD_USER_ID)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N( (byte)((byte)((n295TAM05_UPD_PROG_NM)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N( (byte)((byte)((n296TAM05_UPD_CNT)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Mode( Gx_mode );
   }

   public void KeyVarsToRow9( SdtTAM05_APPLI_KNGN obj9 )
   {
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd( A13TAM04_AUTH_CD );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id( A12TAM03_APP_ID );
   }

   public void RowToVars9( SdtTAM05_APPLI_KNGN obj9 ,
                           int forceLoad )
   {
      Gx_mode = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Mode() ;
      A290TAM05_CRT_DATETIME = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime() ;
      n290TAM05_CRT_DATETIME = false ;
      A291TAM05_CRT_USER_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id() ;
      n291TAM05_CRT_USER_ID = false ;
      A293TAM05_UPD_DATETIME = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime() ;
      n293TAM05_UPD_DATETIME = false ;
      A294TAM05_UPD_USER_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id() ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt() ;
      n296TAM05_UPD_CNT = false ;
      A288TAM05_KNGN_FLG = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg() ;
      n288TAM05_KNGN_FLG = false ;
      A289TAM05_DEL_FLG = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg() ;
      n289TAM05_DEL_FLG = false ;
      A292TAM05_CRT_PROG_NM = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm() ;
      n292TAM05_CRT_PROG_NM = false ;
      A295TAM05_UPD_PROG_NM = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm() ;
      n295TAM05_UPD_PROG_NM = false ;
      A13TAM04_AUTH_CD = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd() ;
      A12TAM03_APP_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id() ;
      Z13TAM04_AUTH_CD = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z() ;
      Z12TAM03_APP_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z() ;
      Z288TAM05_KNGN_FLG = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z() ;
      Z289TAM05_DEL_FLG = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z() ;
      Z290TAM05_CRT_DATETIME = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z() ;
      Z291TAM05_CRT_USER_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z() ;
      Z292TAM05_CRT_PROG_NM = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z() ;
      Z293TAM05_UPD_DATETIME = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z() ;
      Z294TAM05_UPD_USER_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z() ;
      Z295TAM05_UPD_PROG_NM = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z() ;
      Z296TAM05_UPD_CNT = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z() ;
      O296TAM05_UPD_CNT = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z() ;
      n288TAM05_KNGN_FLG = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N()==0)?false:true) ;
      n289TAM05_DEL_FLG = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N()==0)?false:true) ;
      n290TAM05_CRT_DATETIME = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N()==0)?false:true) ;
      n291TAM05_CRT_USER_ID = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N()==0)?false:true) ;
      n292TAM05_CRT_PROG_NM = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N()==0)?false:true) ;
      n293TAM05_UPD_DATETIME = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N()==0)?false:true) ;
      n294TAM05_UPD_USER_ID = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N()==0)?false:true) ;
      n295TAM05_UPD_PROG_NM = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N()==0)?false:true) ;
      n296TAM05_UPD_CNT = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A13TAM04_AUTH_CD = (String)getParm(obj,0) ;
      A12TAM03_APP_ID = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey099( ) ;
      scanKeyStart099( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC00094 */
         pr_default.execute(2, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'権限パターンマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
         /* Using cursor BC00095 */
         pr_default.execute(3, new Object[] {A12TAM03_APP_ID});
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(3);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         n296TAM05_UPD_CNT = false ;
      }
      zm099( -8) ;
      onLoadActions099( ) ;
      addRow099( ) ;
      scanKeyEnd099( ) ;
      if ( RcdFound9 == 0 )
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
      RowToVars9( bcTAM05_APPLI_KNGN, 0) ;
      scanKeyStart099( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC00094 */
         pr_default.execute(2, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'権限パターンマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
         /* Using cursor BC00095 */
         pr_default.execute(3, new Object[] {A12TAM03_APP_ID});
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(3);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         n296TAM05_UPD_CNT = false ;
      }
      zm099( -8) ;
      onLoadActions099( ) ;
      addRow099( ) ;
      scanKeyEnd099( ) ;
      if ( RcdFound9 == 0 )
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
      RowToVars9( bcTAM05_APPLI_KNGN, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey099( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert099( ) ;
      }
      else
      {
         if ( RcdFound9 == 1 )
         {
            if ( ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 ) )
            {
               A13TAM04_AUTH_CD = Z13TAM04_AUTH_CD ;
               A12TAM03_APP_ID = Z12TAM03_APP_ID ;
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
               update099( ) ;
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
               if ( ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 ) )
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
                     insert099( ) ;
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
                     insert099( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow9( bcTAM05_APPLI_KNGN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars9( bcTAM05_APPLI_KNGN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey099( ) ;
      if ( RcdFound9 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 ) )
         {
            A13TAM04_AUTH_CD = Z13TAM04_AUTH_CD ;
            A12TAM03_APP_ID = Z12TAM03_APP_ID ;
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
         if ( ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tam05_appli_kngn_bc");
      VarsToRow9( bcTAM05_APPLI_KNGN) ;
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
      Gx_mode = bcTAM05_APPLI_KNGN.getgxTv_SdtTAM05_APPLI_KNGN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTAM05_APPLI_KNGN.setgxTv_SdtTAM05_APPLI_KNGN_Mode( Gx_mode );
   }

   public void SetSDT( SdtTAM05_APPLI_KNGN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTAM05_APPLI_KNGN )
      {
         bcTAM05_APPLI_KNGN = sdt ;
         if ( GXutil.strcmp(bcTAM05_APPLI_KNGN.getgxTv_SdtTAM05_APPLI_KNGN_Mode(), "") == 0 )
         {
            bcTAM05_APPLI_KNGN.setgxTv_SdtTAM05_APPLI_KNGN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow9( bcTAM05_APPLI_KNGN) ;
         }
         else
         {
            RowToVars9( bcTAM05_APPLI_KNGN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTAM05_APPLI_KNGN.getgxTv_SdtTAM05_APPLI_KNGN_Mode(), "") == 0 )
         {
            bcTAM05_APPLI_KNGN.setgxTv_SdtTAM05_APPLI_KNGN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars9( bcTAM05_APPLI_KNGN, 1) ;
   }

   public SdtTAM05_APPLI_KNGN getTAM05_APPLI_KNGN_BC( )
   {
      return bcTAM05_APPLI_KNGN ;
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
      pr_default.close(3);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z13TAM04_AUTH_CD = "" ;
      A13TAM04_AUTH_CD = "" ;
      Z12TAM03_APP_ID = "" ;
      A12TAM03_APP_ID = "" ;
      AV11W_BC_FLG = "" ;
      AV12Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV10W_TXT = "" ;
      A288TAM05_KNGN_FLG = "" ;
      A289TAM05_DEL_FLG = "" ;
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A291TAM05_CRT_USER_ID = "" ;
      A292TAM05_CRT_PROG_NM = "" ;
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A294TAM05_UPD_USER_ID = "" ;
      A295TAM05_UPD_PROG_NM = "" ;
      Z290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z291TAM05_CRT_USER_ID = "" ;
      Z293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z294TAM05_UPD_USER_ID = "" ;
      Z288TAM05_KNGN_FLG = "" ;
      Z289TAM05_DEL_FLG = "" ;
      Z292TAM05_CRT_PROG_NM = "" ;
      Z295TAM05_UPD_PROG_NM = "" ;
      BC00096_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00096_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC00096_A291TAM05_CRT_USER_ID = new String[] {""} ;
      BC00096_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC00096_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00096_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC00096_A294TAM05_UPD_USER_ID = new String[] {""} ;
      BC00096_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC00096_A296TAM05_UPD_CNT = new long[1] ;
      BC00096_n296TAM05_UPD_CNT = new boolean[] {false} ;
      BC00096_A288TAM05_KNGN_FLG = new String[] {""} ;
      BC00096_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      BC00096_A289TAM05_DEL_FLG = new String[] {""} ;
      BC00096_n289TAM05_DEL_FLG = new boolean[] {false} ;
      BC00096_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      BC00096_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC00096_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      BC00096_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC00096_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00096_A12TAM03_APP_ID = new String[] {""} ;
      BC00094_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00095_A12TAM03_APP_ID = new String[] {""} ;
      BC00097_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00097_A12TAM03_APP_ID = new String[] {""} ;
      BC00093_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00093_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC00093_A291TAM05_CRT_USER_ID = new String[] {""} ;
      BC00093_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC00093_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00093_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC00093_A294TAM05_UPD_USER_ID = new String[] {""} ;
      BC00093_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC00093_A296TAM05_UPD_CNT = new long[1] ;
      BC00093_n296TAM05_UPD_CNT = new boolean[] {false} ;
      BC00093_A288TAM05_KNGN_FLG = new String[] {""} ;
      BC00093_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      BC00093_A289TAM05_DEL_FLG = new String[] {""} ;
      BC00093_n289TAM05_DEL_FLG = new boolean[] {false} ;
      BC00093_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      BC00093_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC00093_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      BC00093_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC00093_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00093_A12TAM03_APP_ID = new String[] {""} ;
      sMode9 = "" ;
      BC00092_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00092_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC00092_A291TAM05_CRT_USER_ID = new String[] {""} ;
      BC00092_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC00092_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00092_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC00092_A294TAM05_UPD_USER_ID = new String[] {""} ;
      BC00092_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC00092_A296TAM05_UPD_CNT = new long[1] ;
      BC00092_n296TAM05_UPD_CNT = new boolean[] {false} ;
      BC00092_A288TAM05_KNGN_FLG = new String[] {""} ;
      BC00092_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      BC00092_A289TAM05_DEL_FLG = new String[] {""} ;
      BC00092_n289TAM05_DEL_FLG = new boolean[] {false} ;
      BC00092_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      BC00092_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC00092_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      BC00092_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC00092_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00092_A12TAM03_APP_ID = new String[] {""} ;
      BC000911_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000911_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000911_A291TAM05_CRT_USER_ID = new String[] {""} ;
      BC000911_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000911_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000911_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000911_A294TAM05_UPD_USER_ID = new String[] {""} ;
      BC000911_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000911_A296TAM05_UPD_CNT = new long[1] ;
      BC000911_n296TAM05_UPD_CNT = new boolean[] {false} ;
      BC000911_A288TAM05_KNGN_FLG = new String[] {""} ;
      BC000911_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000911_A289TAM05_DEL_FLG = new String[] {""} ;
      BC000911_n289TAM05_DEL_FLG = new boolean[] {false} ;
      BC000911_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000911_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000911_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000911_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000911_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000911_A12TAM03_APP_ID = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new tam05_appli_kngn_bc__default(),
         new Object[] {
             new Object[] {
            BC00092_A290TAM05_CRT_DATETIME, BC00092_n290TAM05_CRT_DATETIME, BC00092_A291TAM05_CRT_USER_ID, BC00092_n291TAM05_CRT_USER_ID, BC00092_A293TAM05_UPD_DATETIME, BC00092_n293TAM05_UPD_DATETIME, BC00092_A294TAM05_UPD_USER_ID, BC00092_n294TAM05_UPD_USER_ID, BC00092_A296TAM05_UPD_CNT, BC00092_n296TAM05_UPD_CNT,
            BC00092_A288TAM05_KNGN_FLG, BC00092_n288TAM05_KNGN_FLG, BC00092_A289TAM05_DEL_FLG, BC00092_n289TAM05_DEL_FLG, BC00092_A292TAM05_CRT_PROG_NM, BC00092_n292TAM05_CRT_PROG_NM, BC00092_A295TAM05_UPD_PROG_NM, BC00092_n295TAM05_UPD_PROG_NM, BC00092_A13TAM04_AUTH_CD, BC00092_A12TAM03_APP_ID
            }
            , new Object[] {
            BC00093_A290TAM05_CRT_DATETIME, BC00093_n290TAM05_CRT_DATETIME, BC00093_A291TAM05_CRT_USER_ID, BC00093_n291TAM05_CRT_USER_ID, BC00093_A293TAM05_UPD_DATETIME, BC00093_n293TAM05_UPD_DATETIME, BC00093_A294TAM05_UPD_USER_ID, BC00093_n294TAM05_UPD_USER_ID, BC00093_A296TAM05_UPD_CNT, BC00093_n296TAM05_UPD_CNT,
            BC00093_A288TAM05_KNGN_FLG, BC00093_n288TAM05_KNGN_FLG, BC00093_A289TAM05_DEL_FLG, BC00093_n289TAM05_DEL_FLG, BC00093_A292TAM05_CRT_PROG_NM, BC00093_n292TAM05_CRT_PROG_NM, BC00093_A295TAM05_UPD_PROG_NM, BC00093_n295TAM05_UPD_PROG_NM, BC00093_A13TAM04_AUTH_CD, BC00093_A12TAM03_APP_ID
            }
            , new Object[] {
            BC00094_A13TAM04_AUTH_CD
            }
            , new Object[] {
            BC00095_A12TAM03_APP_ID
            }
            , new Object[] {
            BC00096_A290TAM05_CRT_DATETIME, BC00096_n290TAM05_CRT_DATETIME, BC00096_A291TAM05_CRT_USER_ID, BC00096_n291TAM05_CRT_USER_ID, BC00096_A293TAM05_UPD_DATETIME, BC00096_n293TAM05_UPD_DATETIME, BC00096_A294TAM05_UPD_USER_ID, BC00096_n294TAM05_UPD_USER_ID, BC00096_A296TAM05_UPD_CNT, BC00096_n296TAM05_UPD_CNT,
            BC00096_A288TAM05_KNGN_FLG, BC00096_n288TAM05_KNGN_FLG, BC00096_A289TAM05_DEL_FLG, BC00096_n289TAM05_DEL_FLG, BC00096_A292TAM05_CRT_PROG_NM, BC00096_n292TAM05_CRT_PROG_NM, BC00096_A295TAM05_UPD_PROG_NM, BC00096_n295TAM05_UPD_PROG_NM, BC00096_A13TAM04_AUTH_CD, BC00096_A12TAM03_APP_ID
            }
            , new Object[] {
            BC00097_A13TAM04_AUTH_CD, BC00097_A12TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000911_A290TAM05_CRT_DATETIME, BC000911_n290TAM05_CRT_DATETIME, BC000911_A291TAM05_CRT_USER_ID, BC000911_n291TAM05_CRT_USER_ID, BC000911_A293TAM05_UPD_DATETIME, BC000911_n293TAM05_UPD_DATETIME, BC000911_A294TAM05_UPD_USER_ID, BC000911_n294TAM05_UPD_USER_ID, BC000911_A296TAM05_UPD_CNT, BC000911_n296TAM05_UPD_CNT,
            BC000911_A288TAM05_KNGN_FLG, BC000911_n288TAM05_KNGN_FLG, BC000911_A289TAM05_DEL_FLG, BC000911_n289TAM05_DEL_FLG, BC000911_A292TAM05_CRT_PROG_NM, BC000911_n292TAM05_CRT_PROG_NM, BC000911_A295TAM05_UPD_PROG_NM, BC000911_n295TAM05_UPD_PROG_NM, BC000911_A13TAM04_AUTH_CD, BC000911_A12TAM03_APP_ID
            }
         }
      );
      AV12Pgmname = "TAM05_APPLI_KNGN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11092 */
      e11092 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound9 ;
   private int trnEnded ;
   private int GX_JID ;
   private long A296TAM05_UPD_CNT ;
   private long Z296TAM05_UPD_CNT ;
   private long O296TAM05_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV12Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode9 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date A290TAM05_CRT_DATETIME ;
   private java.util.Date A293TAM05_UPD_DATETIME ;
   private java.util.Date Z290TAM05_CRT_DATETIME ;
   private java.util.Date Z293TAM05_UPD_DATETIME ;
   private boolean n290TAM05_CRT_DATETIME ;
   private boolean n291TAM05_CRT_USER_ID ;
   private boolean n293TAM05_UPD_DATETIME ;
   private boolean n294TAM05_UPD_USER_ID ;
   private boolean n296TAM05_UPD_CNT ;
   private boolean n288TAM05_KNGN_FLG ;
   private boolean n289TAM05_DEL_FLG ;
   private boolean n292TAM05_CRT_PROG_NM ;
   private boolean n295TAM05_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z13TAM04_AUTH_CD ;
   private String A13TAM04_AUTH_CD ;
   private String Z12TAM03_APP_ID ;
   private String A12TAM03_APP_ID ;
   private String AV11W_BC_FLG ;
   private String AV10W_TXT ;
   private String A288TAM05_KNGN_FLG ;
   private String A289TAM05_DEL_FLG ;
   private String A291TAM05_CRT_USER_ID ;
   private String A292TAM05_CRT_PROG_NM ;
   private String A294TAM05_UPD_USER_ID ;
   private String A295TAM05_UPD_PROG_NM ;
   private String Z291TAM05_CRT_USER_ID ;
   private String Z294TAM05_UPD_USER_ID ;
   private String Z288TAM05_KNGN_FLG ;
   private String Z289TAM05_DEL_FLG ;
   private String Z292TAM05_CRT_PROG_NM ;
   private String Z295TAM05_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAM05_APPLI_KNGN bcTAM05_APPLI_KNGN ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC00096_A290TAM05_CRT_DATETIME ;
   private boolean[] BC00096_n290TAM05_CRT_DATETIME ;
   private String[] BC00096_A291TAM05_CRT_USER_ID ;
   private boolean[] BC00096_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC00096_A293TAM05_UPD_DATETIME ;
   private boolean[] BC00096_n293TAM05_UPD_DATETIME ;
   private String[] BC00096_A294TAM05_UPD_USER_ID ;
   private boolean[] BC00096_n294TAM05_UPD_USER_ID ;
   private long[] BC00096_A296TAM05_UPD_CNT ;
   private boolean[] BC00096_n296TAM05_UPD_CNT ;
   private String[] BC00096_A288TAM05_KNGN_FLG ;
   private boolean[] BC00096_n288TAM05_KNGN_FLG ;
   private String[] BC00096_A289TAM05_DEL_FLG ;
   private boolean[] BC00096_n289TAM05_DEL_FLG ;
   private String[] BC00096_A292TAM05_CRT_PROG_NM ;
   private boolean[] BC00096_n292TAM05_CRT_PROG_NM ;
   private String[] BC00096_A295TAM05_UPD_PROG_NM ;
   private boolean[] BC00096_n295TAM05_UPD_PROG_NM ;
   private String[] BC00096_A13TAM04_AUTH_CD ;
   private String[] BC00096_A12TAM03_APP_ID ;
   private String[] BC00094_A13TAM04_AUTH_CD ;
   private String[] BC00095_A12TAM03_APP_ID ;
   private String[] BC00097_A13TAM04_AUTH_CD ;
   private String[] BC00097_A12TAM03_APP_ID ;
   private java.util.Date[] BC00093_A290TAM05_CRT_DATETIME ;
   private boolean[] BC00093_n290TAM05_CRT_DATETIME ;
   private String[] BC00093_A291TAM05_CRT_USER_ID ;
   private boolean[] BC00093_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC00093_A293TAM05_UPD_DATETIME ;
   private boolean[] BC00093_n293TAM05_UPD_DATETIME ;
   private String[] BC00093_A294TAM05_UPD_USER_ID ;
   private boolean[] BC00093_n294TAM05_UPD_USER_ID ;
   private long[] BC00093_A296TAM05_UPD_CNT ;
   private boolean[] BC00093_n296TAM05_UPD_CNT ;
   private String[] BC00093_A288TAM05_KNGN_FLG ;
   private boolean[] BC00093_n288TAM05_KNGN_FLG ;
   private String[] BC00093_A289TAM05_DEL_FLG ;
   private boolean[] BC00093_n289TAM05_DEL_FLG ;
   private String[] BC00093_A292TAM05_CRT_PROG_NM ;
   private boolean[] BC00093_n292TAM05_CRT_PROG_NM ;
   private String[] BC00093_A295TAM05_UPD_PROG_NM ;
   private boolean[] BC00093_n295TAM05_UPD_PROG_NM ;
   private String[] BC00093_A13TAM04_AUTH_CD ;
   private String[] BC00093_A12TAM03_APP_ID ;
   private java.util.Date[] BC00092_A290TAM05_CRT_DATETIME ;
   private boolean[] BC00092_n290TAM05_CRT_DATETIME ;
   private String[] BC00092_A291TAM05_CRT_USER_ID ;
   private boolean[] BC00092_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC00092_A293TAM05_UPD_DATETIME ;
   private boolean[] BC00092_n293TAM05_UPD_DATETIME ;
   private String[] BC00092_A294TAM05_UPD_USER_ID ;
   private boolean[] BC00092_n294TAM05_UPD_USER_ID ;
   private long[] BC00092_A296TAM05_UPD_CNT ;
   private boolean[] BC00092_n296TAM05_UPD_CNT ;
   private String[] BC00092_A288TAM05_KNGN_FLG ;
   private boolean[] BC00092_n288TAM05_KNGN_FLG ;
   private String[] BC00092_A289TAM05_DEL_FLG ;
   private boolean[] BC00092_n289TAM05_DEL_FLG ;
   private String[] BC00092_A292TAM05_CRT_PROG_NM ;
   private boolean[] BC00092_n292TAM05_CRT_PROG_NM ;
   private String[] BC00092_A295TAM05_UPD_PROG_NM ;
   private boolean[] BC00092_n295TAM05_UPD_PROG_NM ;
   private String[] BC00092_A13TAM04_AUTH_CD ;
   private String[] BC00092_A12TAM03_APP_ID ;
   private java.util.Date[] BC000911_A290TAM05_CRT_DATETIME ;
   private boolean[] BC000911_n290TAM05_CRT_DATETIME ;
   private String[] BC000911_A291TAM05_CRT_USER_ID ;
   private boolean[] BC000911_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000911_A293TAM05_UPD_DATETIME ;
   private boolean[] BC000911_n293TAM05_UPD_DATETIME ;
   private String[] BC000911_A294TAM05_UPD_USER_ID ;
   private boolean[] BC000911_n294TAM05_UPD_USER_ID ;
   private long[] BC000911_A296TAM05_UPD_CNT ;
   private boolean[] BC000911_n296TAM05_UPD_CNT ;
   private String[] BC000911_A288TAM05_KNGN_FLG ;
   private boolean[] BC000911_n288TAM05_KNGN_FLG ;
   private String[] BC000911_A289TAM05_DEL_FLG ;
   private boolean[] BC000911_n289TAM05_DEL_FLG ;
   private String[] BC000911_A292TAM05_CRT_PROG_NM ;
   private boolean[] BC000911_n292TAM05_CRT_PROG_NM ;
   private String[] BC000911_A295TAM05_UPD_PROG_NM ;
   private boolean[] BC000911_n295TAM05_UPD_PROG_NM ;
   private String[] BC000911_A13TAM04_AUTH_CD ;
   private String[] BC000911_A12TAM03_APP_ID ;
}

final  class tam05_appli_kngn_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00092", "SELECT `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00093", "SELECT `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00094", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00095", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00096", "SELECT TM1.`TAM05_CRT_DATETIME`, TM1.`TAM05_CRT_USER_ID`, TM1.`TAM05_UPD_DATETIME`, TM1.`TAM05_UPD_USER_ID`, TM1.`TAM05_UPD_CNT`, TM1.`TAM05_KNGN_FLG`, TM1.`TAM05_DEL_FLG`, TM1.`TAM05_CRT_PROG_NM`, TM1.`TAM05_UPD_PROG_NM`, TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? and TM1.`TAM03_APP_ID` = ? ORDER BY TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00097", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00098", "INSERT INTO `TAM05_APPLI_KNGN`(`TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM04_AUTH_CD`, `TAM03_APP_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00099", "UPDATE `TAM05_APPLI_KNGN` SET `TAM05_CRT_DATETIME`=?, `TAM05_CRT_USER_ID`=?, `TAM05_UPD_DATETIME`=?, `TAM05_UPD_USER_ID`=?, `TAM05_UPD_CNT`=?, `TAM05_KNGN_FLG`=?, `TAM05_DEL_FLG`=?, `TAM05_CRT_PROG_NM`=?, `TAM05_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000910", "DELETE FROM `TAM05_APPLI_KNGN`  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000911", "SELECT TM1.`TAM05_CRT_DATETIME`, TM1.`TAM05_CRT_USER_ID`, TM1.`TAM05_UPD_DATETIME`, TM1.`TAM05_UPD_USER_ID`, TM1.`TAM05_UPD_CNT`, TM1.`TAM05_KNGN_FLG`, TM1.`TAM05_DEL_FLG`, TM1.`TAM05_CRT_PROG_NM`, TM1.`TAM05_UPD_PROG_NM`, TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? and TM1.`TAM03_APP_ID` = ? ORDER BY TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
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
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
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
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 9 :
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
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
            case 7 :
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
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
      }
   }

}

