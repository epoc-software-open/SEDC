/*
               File: tam05_appli_kngn_bc
        Description: アプリケーション権限マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:58.0
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
            Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
            Z88TAM03_APP_ID = A88TAM03_APP_ID ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e12092( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV12Pgmname) ;
      AV10W_TXT = "" ;
      AV10W_TXT = AV10W_TXT + "権限パターン区分:" + A17TAM04_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + "アプリケーションID:" + A88TAM03_APP_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A101TAM05_KNGN_FLG + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A102TAM05_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A103TAM05_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A104TAM05_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A105TAM05_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A106TAM05_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A107TAM05_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A108TAM05_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A109TAM05_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = GXutil.strReplace( AV10W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, AV10W_TXT) ;
   }

   public void zm099( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
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
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
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
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
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
      pr_default.execute(4, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A103TAM05_CRT_DATETIME = BC00096_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = BC00096_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = BC00096_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = BC00096_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = BC00096_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = BC00096_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = BC00096_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = BC00096_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = BC00096_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = BC00096_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = BC00096_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = BC00096_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = BC00096_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = BC00096_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = BC00096_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = BC00096_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = BC00096_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = BC00096_n108TAM05_UPD_PROG_NM[0] ;
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
      pr_default.execute(2, new Object[] {A17TAM04_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError17 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'権限パターンマスタ'", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
      }
      if ( AnyError17 == 0 )
      {
      }
      pr_default.close(2);
      /* Using cursor BC00095 */
      pr_default.execute(3, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         AnyError88 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'アプリケーションマスタ'", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
      }
      if ( AnyError88 == 0 )
      {
      }
      pr_default.close(3);
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

   public void closeExtendedTableCursors099( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void getKey099( )
   {
      /* Using cursor BC00097 */
      pr_default.execute(5, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
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
      pr_default.execute(1, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm099( 8) ;
         RcdFound9 = (short)(1) ;
         A103TAM05_CRT_DATETIME = BC00093_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = BC00093_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = BC00093_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = BC00093_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = BC00093_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = BC00093_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = BC00093_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = BC00093_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = BC00093_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = BC00093_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = BC00093_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = BC00093_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = BC00093_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = BC00093_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = BC00093_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = BC00093_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = BC00093_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = BC00093_n108TAM05_UPD_PROG_NM[0] ;
         A17TAM04_AUTH_CD = BC00093_A17TAM04_AUTH_CD[0] ;
         A88TAM03_APP_ID = BC00093_A88TAM03_APP_ID[0] ;
         O109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
         n109TAM05_UPD_CNT = false ;
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load099( ) ;
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
         pr_default.execute(0, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z103TAM05_CRT_DATETIME.equals( BC00092_A103TAM05_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z104TAM05_CRT_USER_ID, BC00092_A104TAM05_CRT_USER_ID[0]) != 0 ) || !( Z106TAM05_UPD_DATETIME.equals( BC00092_A106TAM05_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z107TAM05_UPD_USER_ID, BC00092_A107TAM05_UPD_USER_ID[0]) != 0 ) || ( Z109TAM05_UPD_CNT != BC00092_A109TAM05_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z101TAM05_KNGN_FLG, BC00092_A101TAM05_KNGN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z102TAM05_DEL_FLG, BC00092_A102TAM05_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z105TAM05_CRT_PROG_NM, BC00092_A105TAM05_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z108TAM05_UPD_PROG_NM, BC00092_A108TAM05_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(6, new Object[] {new Boolean(n103TAM05_CRT_DATETIME), A103TAM05_CRT_DATETIME, new Boolean(n104TAM05_CRT_USER_ID), A104TAM05_CRT_USER_ID, new Boolean(n106TAM05_UPD_DATETIME), A106TAM05_UPD_DATETIME, new Boolean(n107TAM05_UPD_USER_ID), A107TAM05_UPD_USER_ID, new Boolean(n109TAM05_UPD_CNT), new Long(A109TAM05_UPD_CNT), new Boolean(n101TAM05_KNGN_FLG), A101TAM05_KNGN_FLG, new Boolean(n102TAM05_DEL_FLG), A102TAM05_DEL_FLG, new Boolean(n105TAM05_CRT_PROG_NM), A105TAM05_CRT_PROG_NM, new Boolean(n108TAM05_UPD_PROG_NM), A108TAM05_UPD_PROG_NM, A17TAM04_AUTH_CD, A88TAM03_APP_ID});
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
                  pr_default.execute(7, new Object[] {new Boolean(n103TAM05_CRT_DATETIME), A103TAM05_CRT_DATETIME, new Boolean(n104TAM05_CRT_USER_ID), A104TAM05_CRT_USER_ID, new Boolean(n106TAM05_UPD_DATETIME), A106TAM05_UPD_DATETIME, new Boolean(n107TAM05_UPD_USER_ID), A107TAM05_UPD_USER_ID, new Boolean(n109TAM05_UPD_CNT), new Long(A109TAM05_UPD_CNT), new Boolean(n101TAM05_KNGN_FLG), A101TAM05_KNGN_FLG, new Boolean(n102TAM05_DEL_FLG), A102TAM05_DEL_FLG, new Boolean(n105TAM05_CRT_PROG_NM), A105TAM05_CRT_PROG_NM, new Boolean(n108TAM05_UPD_PROG_NM), A108TAM05_UPD_PROG_NM, A17TAM04_AUTH_CD, A88TAM03_APP_ID});
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
               pr_default.execute(8, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
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
      /* Using cursor BC000911 */
      pr_default.execute(9, new Object[] {A17TAM04_AUTH_CD, A88TAM03_APP_ID});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A103TAM05_CRT_DATETIME = BC000911_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = BC000911_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = BC000911_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = BC000911_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = BC000911_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = BC000911_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = BC000911_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = BC000911_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = BC000911_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = BC000911_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = BC000911_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = BC000911_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = BC000911_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = BC000911_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = BC000911_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = BC000911_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = BC000911_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = BC000911_n108TAM05_UPD_PROG_NM[0] ;
         A17TAM04_AUTH_CD = BC000911_A17TAM04_AUTH_CD[0] ;
         A88TAM03_APP_ID = BC000911_A88TAM03_APP_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext099( )
   {
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
         A103TAM05_CRT_DATETIME = BC000911_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = BC000911_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = BC000911_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = BC000911_n104TAM05_CRT_USER_ID[0] ;
         A106TAM05_UPD_DATETIME = BC000911_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = BC000911_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = BC000911_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = BC000911_n107TAM05_UPD_USER_ID[0] ;
         A109TAM05_UPD_CNT = BC000911_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = BC000911_n109TAM05_UPD_CNT[0] ;
         A101TAM05_KNGN_FLG = BC000911_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = BC000911_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = BC000911_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = BC000911_n102TAM05_DEL_FLG[0] ;
         A105TAM05_CRT_PROG_NM = BC000911_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = BC000911_n105TAM05_CRT_PROG_NM[0] ;
         A108TAM05_UPD_PROG_NM = BC000911_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = BC000911_n108TAM05_UPD_PROG_NM[0] ;
         A17TAM04_AUTH_CD = BC000911_A17TAM04_AUTH_CD[0] ;
         A88TAM03_APP_ID = BC000911_A88TAM03_APP_ID[0] ;
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
      A103TAM05_CRT_DATETIME = GXutil.now( ) ;
      n103TAM05_CRT_DATETIME = false ;
      GXt_char1 = A104TAM05_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A104TAM05_CRT_USER_ID = GXt_char1 ;
      n104TAM05_CRT_USER_ID = false ;
      A106TAM05_UPD_DATETIME = GXutil.now( ) ;
      n106TAM05_UPD_DATETIME = false ;
      GXt_char1 = A107TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A107TAM05_UPD_USER_ID = GXt_char1 ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = (long)(O109TAM05_UPD_CNT+1) ;
      n109TAM05_UPD_CNT = false ;
   }

   public void beforeUpdate099( )
   {
      /* Before Update Rules */
      A106TAM05_UPD_DATETIME = GXutil.now( ) ;
      n106TAM05_UPD_DATETIME = false ;
      GXt_char1 = A107TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A107TAM05_UPD_USER_ID = GXt_char1 ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = (long)(O109TAM05_UPD_CNT+1) ;
      n109TAM05_UPD_CNT = false ;
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

   public void initAll099( )
   {
      A17TAM04_AUTH_CD = "" ;
      A88TAM03_APP_ID = "" ;
      initializeNonKey099( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow9( SdtTAM05_APPLI_KNGN obj9 )
   {
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Mode( Gx_mode );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime( A103TAM05_CRT_DATETIME );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id( A104TAM05_CRT_USER_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime( A106TAM05_UPD_DATETIME );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id( A107TAM05_UPD_USER_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt( A109TAM05_UPD_CNT );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg( A101TAM05_KNGN_FLG );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg( A102TAM05_DEL_FLG );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm( A105TAM05_CRT_PROG_NM );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm( A108TAM05_UPD_PROG_NM );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd( A17TAM04_AUTH_CD );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id( A88TAM03_APP_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z( Z17TAM04_AUTH_CD );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z( Z88TAM03_APP_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z( Z101TAM05_KNGN_FLG );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z( Z102TAM05_DEL_FLG );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z( Z103TAM05_CRT_DATETIME );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z( Z104TAM05_CRT_USER_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z( Z105TAM05_CRT_PROG_NM );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z( Z106TAM05_UPD_DATETIME );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z( Z107TAM05_UPD_USER_ID );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z( Z108TAM05_UPD_PROG_NM );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z( Z109TAM05_UPD_CNT );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N( (byte)((byte)((n101TAM05_KNGN_FLG)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N( (byte)((byte)((n102TAM05_DEL_FLG)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N( (byte)((byte)((n103TAM05_CRT_DATETIME)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N( (byte)((byte)((n104TAM05_CRT_USER_ID)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N( (byte)((byte)((n105TAM05_CRT_PROG_NM)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N( (byte)((byte)((n106TAM05_UPD_DATETIME)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N( (byte)((byte)((n107TAM05_UPD_USER_ID)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N( (byte)((byte)((n108TAM05_UPD_PROG_NM)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N( (byte)((byte)((n109TAM05_UPD_CNT)?1:0)) );
      obj9.setgxTv_SdtTAM05_APPLI_KNGN_Mode( Gx_mode );
   }

   public void RowToVars9( SdtTAM05_APPLI_KNGN obj9 ,
                           int forceLoad )
   {
      Gx_mode = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Mode() ;
      A103TAM05_CRT_DATETIME = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime() ;
      n103TAM05_CRT_DATETIME = false ;
      A104TAM05_CRT_USER_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id() ;
      n104TAM05_CRT_USER_ID = false ;
      A106TAM05_UPD_DATETIME = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime() ;
      n106TAM05_UPD_DATETIME = false ;
      A107TAM05_UPD_USER_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id() ;
      n107TAM05_UPD_USER_ID = false ;
      A109TAM05_UPD_CNT = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt() ;
      n109TAM05_UPD_CNT = false ;
      A101TAM05_KNGN_FLG = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg() ;
      n101TAM05_KNGN_FLG = false ;
      A102TAM05_DEL_FLG = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg() ;
      n102TAM05_DEL_FLG = false ;
      A105TAM05_CRT_PROG_NM = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm() ;
      n105TAM05_CRT_PROG_NM = false ;
      A108TAM05_UPD_PROG_NM = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm() ;
      n108TAM05_UPD_PROG_NM = false ;
      A17TAM04_AUTH_CD = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd() ;
      A88TAM03_APP_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id() ;
      Z17TAM04_AUTH_CD = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z() ;
      Z88TAM03_APP_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z() ;
      Z101TAM05_KNGN_FLG = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z() ;
      Z102TAM05_DEL_FLG = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z() ;
      Z103TAM05_CRT_DATETIME = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z() ;
      Z104TAM05_CRT_USER_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z() ;
      Z105TAM05_CRT_PROG_NM = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z() ;
      Z106TAM05_UPD_DATETIME = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z() ;
      Z107TAM05_UPD_USER_ID = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z() ;
      Z108TAM05_UPD_PROG_NM = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z() ;
      Z109TAM05_UPD_CNT = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z() ;
      O109TAM05_UPD_CNT = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z() ;
      n101TAM05_KNGN_FLG = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N()==0)?false:true) ;
      n102TAM05_DEL_FLG = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N()==0)?false:true) ;
      n103TAM05_CRT_DATETIME = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N()==0)?false:true) ;
      n104TAM05_CRT_USER_ID = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N()==0)?false:true) ;
      n105TAM05_CRT_PROG_NM = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N()==0)?false:true) ;
      n106TAM05_UPD_DATETIME = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N()==0)?false:true) ;
      n107TAM05_UPD_USER_ID = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N()==0)?false:true) ;
      n108TAM05_UPD_PROG_NM = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N()==0)?false:true) ;
      n109TAM05_UPD_CNT = (boolean)((obj9.getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj9.getgxTv_SdtTAM05_APPLI_KNGN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A17TAM04_AUTH_CD = (String)getParm(obj,0) ;
      A88TAM03_APP_ID = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey099( ) ;
      scanKeyStart099( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000912 */
         pr_default.execute(10, new Object[] {A17TAM04_AUTH_CD});
         if ( (pr_default.getStatus(10) == 101) )
         {
            AnyError17 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'権限パターンマスタ'", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
            AnyError = (short)(1) ;
         }
         if ( AnyError17 == 0 )
         {
         }
         pr_default.close(10);
         /* Using cursor BC000913 */
         pr_default.execute(11, new Object[] {A88TAM03_APP_ID});
         if ( (pr_default.getStatus(11) == 101) )
         {
            AnyError88 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'アプリケーションマスタ'", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
            AnyError = (short)(1) ;
         }
         if ( AnyError88 == 0 )
         {
         }
         pr_default.close(11);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z17TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
         O109TAM05_UPD_CNT = A109TAM05_UPD_CNT ;
         n109TAM05_UPD_CNT = false ;
      }
      zm099( -8) ;
      sMode9 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions099( ) ;
      Gx_mode = sMode9 ;
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
      if ( RcdFound9 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 ) )
         {
            A17TAM04_AUTH_CD = Z17TAM04_AUTH_CD ;
            A88TAM03_APP_ID = Z88TAM03_APP_ID ;
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
            if ( ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 ) )
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
         else if ( ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 ) )
         {
            A17TAM04_AUTH_CD = Z17TAM04_AUTH_CD ;
            A88TAM03_APP_ID = Z88TAM03_APP_ID ;
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
         if ( ( GXutil.strcmp(A17TAM04_AUTH_CD, Z17TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 ) )
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
      pr_default.close(10);
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z17TAM04_AUTH_CD = "" ;
      A17TAM04_AUTH_CD = "" ;
      Z88TAM03_APP_ID = "" ;
      A88TAM03_APP_ID = "" ;
      AV11W_BC_FLG = "" ;
      AV12Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV10W_TXT = "" ;
      A101TAM05_KNGN_FLG = "" ;
      A102TAM05_DEL_FLG = "" ;
      A103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A104TAM05_CRT_USER_ID = "" ;
      A105TAM05_CRT_PROG_NM = "" ;
      A106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A107TAM05_UPD_USER_ID = "" ;
      A108TAM05_UPD_PROG_NM = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z = "" ;
      Z103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z104TAM05_CRT_USER_ID = "" ;
      Z106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z107TAM05_UPD_USER_ID = "" ;
      Z101TAM05_KNGN_FLG = "" ;
      Z102TAM05_DEL_FLG = "" ;
      Z105TAM05_CRT_PROG_NM = "" ;
      Z108TAM05_UPD_PROG_NM = "" ;
      BC00096_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00096_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC00096_A104TAM05_CRT_USER_ID = new String[] {""} ;
      BC00096_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC00096_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00096_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC00096_A107TAM05_UPD_USER_ID = new String[] {""} ;
      BC00096_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC00096_A109TAM05_UPD_CNT = new long[1] ;
      BC00096_n109TAM05_UPD_CNT = new boolean[] {false} ;
      BC00096_A101TAM05_KNGN_FLG = new String[] {""} ;
      BC00096_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      BC00096_A102TAM05_DEL_FLG = new String[] {""} ;
      BC00096_n102TAM05_DEL_FLG = new boolean[] {false} ;
      BC00096_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      BC00096_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC00096_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      BC00096_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC00096_A17TAM04_AUTH_CD = new String[] {""} ;
      BC00096_A88TAM03_APP_ID = new String[] {""} ;
      BC00094_A17TAM04_AUTH_CD = new String[] {""} ;
      BC00095_A88TAM03_APP_ID = new String[] {""} ;
      BC00097_A17TAM04_AUTH_CD = new String[] {""} ;
      BC00097_A88TAM03_APP_ID = new String[] {""} ;
      BC00093_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00093_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC00093_A104TAM05_CRT_USER_ID = new String[] {""} ;
      BC00093_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC00093_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00093_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC00093_A107TAM05_UPD_USER_ID = new String[] {""} ;
      BC00093_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC00093_A109TAM05_UPD_CNT = new long[1] ;
      BC00093_n109TAM05_UPD_CNT = new boolean[] {false} ;
      BC00093_A101TAM05_KNGN_FLG = new String[] {""} ;
      BC00093_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      BC00093_A102TAM05_DEL_FLG = new String[] {""} ;
      BC00093_n102TAM05_DEL_FLG = new boolean[] {false} ;
      BC00093_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      BC00093_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC00093_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      BC00093_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC00093_A17TAM04_AUTH_CD = new String[] {""} ;
      BC00093_A88TAM03_APP_ID = new String[] {""} ;
      sMode9 = "" ;
      BC00092_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00092_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC00092_A104TAM05_CRT_USER_ID = new String[] {""} ;
      BC00092_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC00092_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00092_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC00092_A107TAM05_UPD_USER_ID = new String[] {""} ;
      BC00092_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC00092_A109TAM05_UPD_CNT = new long[1] ;
      BC00092_n109TAM05_UPD_CNT = new boolean[] {false} ;
      BC00092_A101TAM05_KNGN_FLG = new String[] {""} ;
      BC00092_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      BC00092_A102TAM05_DEL_FLG = new String[] {""} ;
      BC00092_n102TAM05_DEL_FLG = new boolean[] {false} ;
      BC00092_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      BC00092_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC00092_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      BC00092_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC00092_A17TAM04_AUTH_CD = new String[] {""} ;
      BC00092_A88TAM03_APP_ID = new String[] {""} ;
      BC000911_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000911_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      BC000911_A104TAM05_CRT_USER_ID = new String[] {""} ;
      BC000911_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      BC000911_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000911_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      BC000911_A107TAM05_UPD_USER_ID = new String[] {""} ;
      BC000911_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      BC000911_A109TAM05_UPD_CNT = new long[1] ;
      BC000911_n109TAM05_UPD_CNT = new boolean[] {false} ;
      BC000911_A101TAM05_KNGN_FLG = new String[] {""} ;
      BC000911_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      BC000911_A102TAM05_DEL_FLG = new String[] {""} ;
      BC000911_n102TAM05_DEL_FLG = new boolean[] {false} ;
      BC000911_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      BC000911_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      BC000911_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      BC000911_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      BC000911_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000911_A88TAM03_APP_ID = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000912_A17TAM04_AUTH_CD = new String[] {""} ;
      BC000913_A88TAM03_APP_ID = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam05_appli_kngn_bc__default(),
         new Object[] {
             new Object[] {
            BC00092_A103TAM05_CRT_DATETIME, BC00092_n103TAM05_CRT_DATETIME, BC00092_A104TAM05_CRT_USER_ID, BC00092_n104TAM05_CRT_USER_ID, BC00092_A106TAM05_UPD_DATETIME, BC00092_n106TAM05_UPD_DATETIME, BC00092_A107TAM05_UPD_USER_ID, BC00092_n107TAM05_UPD_USER_ID, BC00092_A109TAM05_UPD_CNT, BC00092_n109TAM05_UPD_CNT,
            BC00092_A101TAM05_KNGN_FLG, BC00092_n101TAM05_KNGN_FLG, BC00092_A102TAM05_DEL_FLG, BC00092_n102TAM05_DEL_FLG, BC00092_A105TAM05_CRT_PROG_NM, BC00092_n105TAM05_CRT_PROG_NM, BC00092_A108TAM05_UPD_PROG_NM, BC00092_n108TAM05_UPD_PROG_NM, BC00092_A17TAM04_AUTH_CD, BC00092_A88TAM03_APP_ID
            }
            , new Object[] {
            BC00093_A103TAM05_CRT_DATETIME, BC00093_n103TAM05_CRT_DATETIME, BC00093_A104TAM05_CRT_USER_ID, BC00093_n104TAM05_CRT_USER_ID, BC00093_A106TAM05_UPD_DATETIME, BC00093_n106TAM05_UPD_DATETIME, BC00093_A107TAM05_UPD_USER_ID, BC00093_n107TAM05_UPD_USER_ID, BC00093_A109TAM05_UPD_CNT, BC00093_n109TAM05_UPD_CNT,
            BC00093_A101TAM05_KNGN_FLG, BC00093_n101TAM05_KNGN_FLG, BC00093_A102TAM05_DEL_FLG, BC00093_n102TAM05_DEL_FLG, BC00093_A105TAM05_CRT_PROG_NM, BC00093_n105TAM05_CRT_PROG_NM, BC00093_A108TAM05_UPD_PROG_NM, BC00093_n108TAM05_UPD_PROG_NM, BC00093_A17TAM04_AUTH_CD, BC00093_A88TAM03_APP_ID
            }
            , new Object[] {
            BC00094_A17TAM04_AUTH_CD
            }
            , new Object[] {
            BC00095_A88TAM03_APP_ID
            }
            , new Object[] {
            BC00096_A103TAM05_CRT_DATETIME, BC00096_n103TAM05_CRT_DATETIME, BC00096_A104TAM05_CRT_USER_ID, BC00096_n104TAM05_CRT_USER_ID, BC00096_A106TAM05_UPD_DATETIME, BC00096_n106TAM05_UPD_DATETIME, BC00096_A107TAM05_UPD_USER_ID, BC00096_n107TAM05_UPD_USER_ID, BC00096_A109TAM05_UPD_CNT, BC00096_n109TAM05_UPD_CNT,
            BC00096_A101TAM05_KNGN_FLG, BC00096_n101TAM05_KNGN_FLG, BC00096_A102TAM05_DEL_FLG, BC00096_n102TAM05_DEL_FLG, BC00096_A105TAM05_CRT_PROG_NM, BC00096_n105TAM05_CRT_PROG_NM, BC00096_A108TAM05_UPD_PROG_NM, BC00096_n108TAM05_UPD_PROG_NM, BC00096_A17TAM04_AUTH_CD, BC00096_A88TAM03_APP_ID
            }
            , new Object[] {
            BC00097_A17TAM04_AUTH_CD, BC00097_A88TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000911_A103TAM05_CRT_DATETIME, BC000911_n103TAM05_CRT_DATETIME, BC000911_A104TAM05_CRT_USER_ID, BC000911_n104TAM05_CRT_USER_ID, BC000911_A106TAM05_UPD_DATETIME, BC000911_n106TAM05_UPD_DATETIME, BC000911_A107TAM05_UPD_USER_ID, BC000911_n107TAM05_UPD_USER_ID, BC000911_A109TAM05_UPD_CNT, BC000911_n109TAM05_UPD_CNT,
            BC000911_A101TAM05_KNGN_FLG, BC000911_n101TAM05_KNGN_FLG, BC000911_A102TAM05_DEL_FLG, BC000911_n102TAM05_DEL_FLG, BC000911_A105TAM05_CRT_PROG_NM, BC000911_n105TAM05_CRT_PROG_NM, BC000911_A108TAM05_UPD_PROG_NM, BC000911_n108TAM05_UPD_PROG_NM, BC000911_A17TAM04_AUTH_CD, BC000911_A88TAM03_APP_ID
            }
            , new Object[] {
            BC000912_A17TAM04_AUTH_CD
            }
            , new Object[] {
            BC000913_A88TAM03_APP_ID
            }
         }
      );
      AV12Pgmname = "TAM05_APPLI_KNGN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11092 */
      e11092 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound9 ;
   private int trnEnded ;
   private int GX_JID ;
   private int AnyError17 ;
   private int AnyError88 ;
   private long A109TAM05_UPD_CNT ;
   private long gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z ;
   private long Z109TAM05_UPD_CNT ;
   private long O109TAM05_UPD_CNT ;
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
   private java.util.Date A103TAM05_CRT_DATETIME ;
   private java.util.Date A106TAM05_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z ;
   private java.util.Date Z103TAM05_CRT_DATETIME ;
   private java.util.Date Z106TAM05_UPD_DATETIME ;
   private boolean n103TAM05_CRT_DATETIME ;
   private boolean n104TAM05_CRT_USER_ID ;
   private boolean n106TAM05_UPD_DATETIME ;
   private boolean n107TAM05_UPD_USER_ID ;
   private boolean n109TAM05_UPD_CNT ;
   private boolean n101TAM05_KNGN_FLG ;
   private boolean n102TAM05_DEL_FLG ;
   private boolean n105TAM05_CRT_PROG_NM ;
   private boolean n108TAM05_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z17TAM04_AUTH_CD ;
   private String A17TAM04_AUTH_CD ;
   private String Z88TAM03_APP_ID ;
   private String A88TAM03_APP_ID ;
   private String AV11W_BC_FLG ;
   private String AV10W_TXT ;
   private String A101TAM05_KNGN_FLG ;
   private String A102TAM05_DEL_FLG ;
   private String A104TAM05_CRT_USER_ID ;
   private String A105TAM05_CRT_PROG_NM ;
   private String A107TAM05_UPD_USER_ID ;
   private String A108TAM05_UPD_PROG_NM ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z ;
   private String Z104TAM05_CRT_USER_ID ;
   private String Z107TAM05_UPD_USER_ID ;
   private String Z101TAM05_KNGN_FLG ;
   private String Z102TAM05_DEL_FLG ;
   private String Z105TAM05_CRT_PROG_NM ;
   private String Z108TAM05_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAM05_APPLI_KNGN bcTAM05_APPLI_KNGN ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC00096_A103TAM05_CRT_DATETIME ;
   private boolean[] BC00096_n103TAM05_CRT_DATETIME ;
   private String[] BC00096_A104TAM05_CRT_USER_ID ;
   private boolean[] BC00096_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] BC00096_A106TAM05_UPD_DATETIME ;
   private boolean[] BC00096_n106TAM05_UPD_DATETIME ;
   private String[] BC00096_A107TAM05_UPD_USER_ID ;
   private boolean[] BC00096_n107TAM05_UPD_USER_ID ;
   private long[] BC00096_A109TAM05_UPD_CNT ;
   private boolean[] BC00096_n109TAM05_UPD_CNT ;
   private String[] BC00096_A101TAM05_KNGN_FLG ;
   private boolean[] BC00096_n101TAM05_KNGN_FLG ;
   private String[] BC00096_A102TAM05_DEL_FLG ;
   private boolean[] BC00096_n102TAM05_DEL_FLG ;
   private String[] BC00096_A105TAM05_CRT_PROG_NM ;
   private boolean[] BC00096_n105TAM05_CRT_PROG_NM ;
   private String[] BC00096_A108TAM05_UPD_PROG_NM ;
   private boolean[] BC00096_n108TAM05_UPD_PROG_NM ;
   private String[] BC00096_A17TAM04_AUTH_CD ;
   private String[] BC00096_A88TAM03_APP_ID ;
   private String[] BC00094_A17TAM04_AUTH_CD ;
   private String[] BC00095_A88TAM03_APP_ID ;
   private String[] BC00097_A17TAM04_AUTH_CD ;
   private String[] BC00097_A88TAM03_APP_ID ;
   private java.util.Date[] BC00093_A103TAM05_CRT_DATETIME ;
   private boolean[] BC00093_n103TAM05_CRT_DATETIME ;
   private String[] BC00093_A104TAM05_CRT_USER_ID ;
   private boolean[] BC00093_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] BC00093_A106TAM05_UPD_DATETIME ;
   private boolean[] BC00093_n106TAM05_UPD_DATETIME ;
   private String[] BC00093_A107TAM05_UPD_USER_ID ;
   private boolean[] BC00093_n107TAM05_UPD_USER_ID ;
   private long[] BC00093_A109TAM05_UPD_CNT ;
   private boolean[] BC00093_n109TAM05_UPD_CNT ;
   private String[] BC00093_A101TAM05_KNGN_FLG ;
   private boolean[] BC00093_n101TAM05_KNGN_FLG ;
   private String[] BC00093_A102TAM05_DEL_FLG ;
   private boolean[] BC00093_n102TAM05_DEL_FLG ;
   private String[] BC00093_A105TAM05_CRT_PROG_NM ;
   private boolean[] BC00093_n105TAM05_CRT_PROG_NM ;
   private String[] BC00093_A108TAM05_UPD_PROG_NM ;
   private boolean[] BC00093_n108TAM05_UPD_PROG_NM ;
   private String[] BC00093_A17TAM04_AUTH_CD ;
   private String[] BC00093_A88TAM03_APP_ID ;
   private java.util.Date[] BC00092_A103TAM05_CRT_DATETIME ;
   private boolean[] BC00092_n103TAM05_CRT_DATETIME ;
   private String[] BC00092_A104TAM05_CRT_USER_ID ;
   private boolean[] BC00092_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] BC00092_A106TAM05_UPD_DATETIME ;
   private boolean[] BC00092_n106TAM05_UPD_DATETIME ;
   private String[] BC00092_A107TAM05_UPD_USER_ID ;
   private boolean[] BC00092_n107TAM05_UPD_USER_ID ;
   private long[] BC00092_A109TAM05_UPD_CNT ;
   private boolean[] BC00092_n109TAM05_UPD_CNT ;
   private String[] BC00092_A101TAM05_KNGN_FLG ;
   private boolean[] BC00092_n101TAM05_KNGN_FLG ;
   private String[] BC00092_A102TAM05_DEL_FLG ;
   private boolean[] BC00092_n102TAM05_DEL_FLG ;
   private String[] BC00092_A105TAM05_CRT_PROG_NM ;
   private boolean[] BC00092_n105TAM05_CRT_PROG_NM ;
   private String[] BC00092_A108TAM05_UPD_PROG_NM ;
   private boolean[] BC00092_n108TAM05_UPD_PROG_NM ;
   private String[] BC00092_A17TAM04_AUTH_CD ;
   private String[] BC00092_A88TAM03_APP_ID ;
   private java.util.Date[] BC000911_A103TAM05_CRT_DATETIME ;
   private boolean[] BC000911_n103TAM05_CRT_DATETIME ;
   private String[] BC000911_A104TAM05_CRT_USER_ID ;
   private boolean[] BC000911_n104TAM05_CRT_USER_ID ;
   private java.util.Date[] BC000911_A106TAM05_UPD_DATETIME ;
   private boolean[] BC000911_n106TAM05_UPD_DATETIME ;
   private String[] BC000911_A107TAM05_UPD_USER_ID ;
   private boolean[] BC000911_n107TAM05_UPD_USER_ID ;
   private long[] BC000911_A109TAM05_UPD_CNT ;
   private boolean[] BC000911_n109TAM05_UPD_CNT ;
   private String[] BC000911_A101TAM05_KNGN_FLG ;
   private boolean[] BC000911_n101TAM05_KNGN_FLG ;
   private String[] BC000911_A102TAM05_DEL_FLG ;
   private boolean[] BC000911_n102TAM05_DEL_FLG ;
   private String[] BC000911_A105TAM05_CRT_PROG_NM ;
   private boolean[] BC000911_n105TAM05_CRT_PROG_NM ;
   private String[] BC000911_A108TAM05_UPD_PROG_NM ;
   private boolean[] BC000911_n108TAM05_UPD_PROG_NM ;
   private String[] BC000911_A17TAM04_AUTH_CD ;
   private String[] BC000911_A88TAM03_APP_ID ;
   private String[] BC000912_A17TAM04_AUTH_CD ;
   private String[] BC000913_A88TAM03_APP_ID ;
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
         ,new ForEachCursor("BC00096", "SELECT TM1.`TAM05_CRT_DATETIME`, TM1.`TAM05_CRT_USER_ID`, TM1.`TAM05_UPD_DATETIME`, TM1.`TAM05_UPD_USER_ID`, TM1.`TAM05_UPD_CNT`, TM1.`TAM05_KNGN_FLG`, TM1.`TAM05_DEL_FLG`, TM1.`TAM05_CRT_PROG_NM`, TM1.`TAM05_UPD_PROG_NM`, TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? and TM1.`TAM03_APP_ID` = ? ORDER BY TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00097", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00098", "INSERT INTO `TAM05_APPLI_KNGN` (`TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM04_AUTH_CD`, `TAM03_APP_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00099", "UPDATE `TAM05_APPLI_KNGN` SET `TAM05_CRT_DATETIME`=?, `TAM05_CRT_USER_ID`=?, `TAM05_UPD_DATETIME`=?, `TAM05_UPD_USER_ID`=?, `TAM05_UPD_CNT`=?, `TAM05_KNGN_FLG`=?, `TAM05_DEL_FLG`=?, `TAM05_CRT_PROG_NM`=?, `TAM05_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000910", "DELETE FROM `TAM05_APPLI_KNGN`  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000911", "SELECT TM1.`TAM05_CRT_DATETIME`, TM1.`TAM05_CRT_USER_ID`, TM1.`TAM05_UPD_DATETIME`, TM1.`TAM05_UPD_USER_ID`, TM1.`TAM05_UPD_CNT`, TM1.`TAM05_KNGN_FLG`, TM1.`TAM05_DEL_FLG`, TM1.`TAM05_CRT_PROG_NM`, TM1.`TAM05_UPD_PROG_NM`, TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? and TM1.`TAM03_APP_ID` = ? ORDER BY TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000912", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000913", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
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
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
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
               break;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
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
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
      }
   }

}

