/*
               File: tam04_kngn_bc
        Description: 権限パターンマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:50.44
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam04_kngn_bc extends GXWebPanel implements IGxSilentTrn
{
   public tam04_kngn_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam04_kngn_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam04_kngn_bc.class ));
   }

   public tam04_kngn_bc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow033( ) ;
      standaloneNotModal( ) ;
      initializeNonKey033( ) ;
      standaloneModal( ) ;
      addRow033( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e12032 */
         e12032 ();
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

   public void confirm_030( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls033( ) ;
         }
         else
         {
            checkExtendedTable033( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors033( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11032( )
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

   public void e12032( )
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
      tam04_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A266TAM04_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A234TAM04_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A235TAM04_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam04_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A267TAM04_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + A236TAM04_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV10W_TXT = GXutil.strReplace( AV10W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, AV10W_TXT) ;
   }

   public void zm033( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
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
      }
      if ( GX_JID == -8 )
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

   public void load033( )
   {
      /* Using cursor BC00034 */
      pr_default.execute(2, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A233TAM04_CRT_DATETIME = BC00034_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = BC00034_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = BC00034_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = BC00034_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = BC00034_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = BC00034_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = BC00034_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = BC00034_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = BC00034_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = BC00034_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = BC00034_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = BC00034_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = BC00034_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = BC00034_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = BC00034_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = BC00034_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = BC00034_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = BC00034_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = BC00034_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = BC00034_n236TAM04_UPD_PROG_NM[0] ;
         zm033( -8) ;
      }
      pr_default.close(2);
      onLoadActions033( ) ;
   }

   public void onLoadActions033( )
   {
      AV12Pgmname = "TAM04_KNGN_BC" ;
   }

   public void checkExtendedTable033( )
   {
      standaloneModal( ) ;
      AV12Pgmname = "TAM04_KNGN_BC" ;
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

   public void closeExtendedTableCursors033( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey033( )
   {
      /* Using cursor BC00035 */
      pr_default.execute(3, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00033 */
      pr_default.execute(1, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm033( 8) ;
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = BC00033_A13TAM04_AUTH_CD[0] ;
         A233TAM04_CRT_DATETIME = BC00033_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = BC00033_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = BC00033_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = BC00033_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = BC00033_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = BC00033_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = BC00033_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = BC00033_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = BC00033_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = BC00033_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = BC00033_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = BC00033_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = BC00033_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = BC00033_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = BC00033_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = BC00033_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = BC00033_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = BC00033_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = BC00033_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = BC00033_n236TAM04_UPD_PROG_NM[0] ;
         O286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         n286TAM04_UPD_CNT = false ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load033( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey033( ) ;
         }
         Gx_mode = sMode3 ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey033( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey033( ) ;
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
      confirm_030( ) ;
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

   public void checkOptimisticConcurrency033( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00032 */
         pr_default.execute(0, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z233TAM04_CRT_DATETIME.equals( BC00032_A233TAM04_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z266TAM04_CRT_USER_ID, BC00032_A266TAM04_CRT_USER_ID[0]) != 0 ) || !( Z235TAM04_UPD_DATETIME.equals( BC00032_A235TAM04_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z267TAM04_UPD_USER_ID, BC00032_A267TAM04_UPD_USER_ID[0]) != 0 ) || ( Z286TAM04_UPD_CNT != BC00032_A286TAM04_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z285TAM04_AUTH_NM, BC00032_A285TAM04_AUTH_NM[0]) != 0 ) || ( Z687TAM04_AUTH_LVL != BC00032_A687TAM04_AUTH_LVL[0] ) || ( GXutil.strcmp(Z215TAM04_DEL_FLG, BC00032_A215TAM04_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z234TAM04_CRT_PROG_NM, BC00032_A234TAM04_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z236TAM04_UPD_PROG_NM, BC00032_A236TAM04_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM04_KNGN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         zm033( 0) ;
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00036 */
                  pr_default.execute(4, new Object[] {A13TAM04_AUTH_CD, new Boolean(n233TAM04_CRT_DATETIME), A233TAM04_CRT_DATETIME, new Boolean(n266TAM04_CRT_USER_ID), A266TAM04_CRT_USER_ID, new Boolean(n235TAM04_UPD_DATETIME), A235TAM04_UPD_DATETIME, new Boolean(n267TAM04_UPD_USER_ID), A267TAM04_UPD_USER_ID, new Boolean(n286TAM04_UPD_CNT), new Long(A286TAM04_UPD_CNT), new Boolean(n285TAM04_AUTH_NM), A285TAM04_AUTH_NM, new Boolean(n687TAM04_AUTH_LVL), new Byte(A687TAM04_AUTH_LVL), new Boolean(n215TAM04_DEL_FLG), A215TAM04_DEL_FLG, new Boolean(n234TAM04_CRT_PROG_NM), A234TAM04_CRT_PROG_NM, new Boolean(n236TAM04_UPD_PROG_NM), A236TAM04_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
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
            load033( ) ;
         }
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void update033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00037 */
                  pr_default.execute(5, new Object[] {new Boolean(n233TAM04_CRT_DATETIME), A233TAM04_CRT_DATETIME, new Boolean(n266TAM04_CRT_USER_ID), A266TAM04_CRT_USER_ID, new Boolean(n235TAM04_UPD_DATETIME), A235TAM04_UPD_DATETIME, new Boolean(n267TAM04_UPD_USER_ID), A267TAM04_UPD_USER_ID, new Boolean(n286TAM04_UPD_CNT), new Long(A286TAM04_UPD_CNT), new Boolean(n285TAM04_AUTH_NM), A285TAM04_AUTH_NM, new Boolean(n687TAM04_AUTH_LVL), new Byte(A687TAM04_AUTH_LVL), new Boolean(n215TAM04_DEL_FLG), A215TAM04_DEL_FLG, new Boolean(n234TAM04_CRT_PROG_NM), A234TAM04_CRT_PROG_NM, new Boolean(n236TAM04_UPD_PROG_NM), A236TAM04_UPD_PROG_NM, A13TAM04_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate033( ) ;
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
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void deferredUpdate033( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls033( ) ;
         afterConfirm033( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete033( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00038 */
               pr_default.execute(6, new Object[] {A13TAM04_AUTH_CD});
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel033( ) ;
      Gx_mode = sMode3 ;
   }

   public void onDeleteControls033( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV12Pgmname = "TAM04_KNGN_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC00039 */
         pr_default.execute(7, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(7) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ユーザーマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(7);
         /* Using cursor BC000310 */
         pr_default.execute(8, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"権限別振舞マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
         /* Using cursor BC000311 */
         pr_default.execute(9, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"アプリケーション権限マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
      }
   }

   public void endLevel033( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete033( ) ;
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

   public void scanKeyStart033( )
   {
      /* Scan By routine */
      /* Using cursor BC000312 */
      pr_default.execute(10, new Object[] {A13TAM04_AUTH_CD});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = BC000312_A13TAM04_AUTH_CD[0] ;
         A233TAM04_CRT_DATETIME = BC000312_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = BC000312_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = BC000312_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = BC000312_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = BC000312_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = BC000312_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = BC000312_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = BC000312_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = BC000312_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = BC000312_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = BC000312_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = BC000312_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = BC000312_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = BC000312_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = BC000312_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = BC000312_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = BC000312_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = BC000312_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = BC000312_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = BC000312_n236TAM04_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext033( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound3 = (short)(0) ;
      scanKeyLoad033( ) ;
   }

   public void scanKeyLoad033( )
   {
      sMode3 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = BC000312_A13TAM04_AUTH_CD[0] ;
         A233TAM04_CRT_DATETIME = BC000312_A233TAM04_CRT_DATETIME[0] ;
         n233TAM04_CRT_DATETIME = BC000312_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = BC000312_A266TAM04_CRT_USER_ID[0] ;
         n266TAM04_CRT_USER_ID = BC000312_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = BC000312_A235TAM04_UPD_DATETIME[0] ;
         n235TAM04_UPD_DATETIME = BC000312_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = BC000312_A267TAM04_UPD_USER_ID[0] ;
         n267TAM04_UPD_USER_ID = BC000312_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = BC000312_A286TAM04_UPD_CNT[0] ;
         n286TAM04_UPD_CNT = BC000312_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = BC000312_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = BC000312_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = BC000312_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = BC000312_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = BC000312_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = BC000312_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = BC000312_A234TAM04_CRT_PROG_NM[0] ;
         n234TAM04_CRT_PROG_NM = BC000312_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = BC000312_A236TAM04_UPD_PROG_NM[0] ;
         n236TAM04_UPD_PROG_NM = BC000312_n236TAM04_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode3 ;
   }

   public void scanKeyEnd033( )
   {
      pr_default.close(10);
   }

   public void afterConfirm033( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert033( )
   {
      /* Before Insert Rules */
      A233TAM04_CRT_DATETIME = GXutil.now( ) ;
      n233TAM04_CRT_DATETIME = false ;
      GXt_char1 = A266TAM04_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A266TAM04_CRT_USER_ID = GXt_char1 ;
      n266TAM04_CRT_USER_ID = false ;
      A235TAM04_UPD_DATETIME = GXutil.now( ) ;
      n235TAM04_UPD_DATETIME = false ;
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      A286TAM04_UPD_CNT = (long)(O286TAM04_UPD_CNT+1) ;
      n286TAM04_UPD_CNT = false ;
   }

   public void beforeUpdate033( )
   {
      /* Before Update Rules */
      A235TAM04_UPD_DATETIME = GXutil.now( ) ;
      n235TAM04_UPD_DATETIME = false ;
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04_kngn_bc.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      A286TAM04_UPD_CNT = (long)(O286TAM04_UPD_CNT+1) ;
      n286TAM04_UPD_CNT = false ;
   }

   public void beforeDelete033( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete033( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate033( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes033( )
   {
   }

   public void addRow033( )
   {
      VarsToRow3( bcTAM04_KNGN) ;
   }

   public void readRow033( )
   {
      RowToVars3( bcTAM04_KNGN, 1) ;
   }

   public void initializeNonKey033( )
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

   public void initAll033( )
   {
      A13TAM04_AUTH_CD = "" ;
      initializeNonKey033( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow3( SdtTAM04_KNGN obj3 )
   {
      obj3.setgxTv_SdtTAM04_KNGN_Mode( Gx_mode );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_datetime( A233TAM04_CRT_DATETIME );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_user_id( A266TAM04_CRT_USER_ID );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_datetime( A235TAM04_UPD_DATETIME );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_user_id( A267TAM04_UPD_USER_ID );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_cnt( A286TAM04_UPD_CNT );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_nm( A285TAM04_AUTH_NM );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_lvl( A687TAM04_AUTH_LVL );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_del_flg( A215TAM04_DEL_FLG );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm( A234TAM04_CRT_PROG_NM );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm( A236TAM04_UPD_PROG_NM );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_cd( A13TAM04_AUTH_CD );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_cd_Z( Z13TAM04_AUTH_CD );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_nm_Z( Z285TAM04_AUTH_NM );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_lvl_Z( Z687TAM04_AUTH_LVL );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_del_flg_Z( Z215TAM04_DEL_FLG );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_datetime_Z( Z233TAM04_CRT_DATETIME );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_user_id_Z( Z266TAM04_CRT_USER_ID );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm_Z( Z234TAM04_CRT_PROG_NM );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_datetime_Z( Z235TAM04_UPD_DATETIME );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_user_id_Z( Z267TAM04_UPD_USER_ID );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm_Z( Z236TAM04_UPD_PROG_NM );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_cnt_Z( Z286TAM04_UPD_CNT );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_nm_N( (byte)((byte)((n285TAM04_AUTH_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_lvl_N( (byte)((byte)((n687TAM04_AUTH_LVL)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_del_flg_N( (byte)((byte)((n215TAM04_DEL_FLG)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_datetime_N( (byte)((byte)((n233TAM04_CRT_DATETIME)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_user_id_N( (byte)((byte)((n266TAM04_CRT_USER_ID)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm_N( (byte)((byte)((n234TAM04_CRT_PROG_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_datetime_N( (byte)((byte)((n235TAM04_UPD_DATETIME)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_user_id_N( (byte)((byte)((n267TAM04_UPD_USER_ID)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm_N( (byte)((byte)((n236TAM04_UPD_PROG_NM)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_upd_cnt_N( (byte)((byte)((n286TAM04_UPD_CNT)?1:0)) );
      obj3.setgxTv_SdtTAM04_KNGN_Mode( Gx_mode );
   }

   public void KeyVarsToRow3( SdtTAM04_KNGN obj3 )
   {
      obj3.setgxTv_SdtTAM04_KNGN_Tam04_auth_cd( A13TAM04_AUTH_CD );
   }

   public void RowToVars3( SdtTAM04_KNGN obj3 ,
                           int forceLoad )
   {
      Gx_mode = obj3.getgxTv_SdtTAM04_KNGN_Mode() ;
      A233TAM04_CRT_DATETIME = obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_datetime() ;
      n233TAM04_CRT_DATETIME = false ;
      A266TAM04_CRT_USER_ID = obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_user_id() ;
      n266TAM04_CRT_USER_ID = false ;
      A235TAM04_UPD_DATETIME = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_datetime() ;
      n235TAM04_UPD_DATETIME = false ;
      A267TAM04_UPD_USER_ID = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_user_id() ;
      n267TAM04_UPD_USER_ID = false ;
      A286TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_cnt() ;
      n286TAM04_UPD_CNT = false ;
      A285TAM04_AUTH_NM = obj3.getgxTv_SdtTAM04_KNGN_Tam04_auth_nm() ;
      n285TAM04_AUTH_NM = false ;
      A687TAM04_AUTH_LVL = obj3.getgxTv_SdtTAM04_KNGN_Tam04_auth_lvl() ;
      n687TAM04_AUTH_LVL = false ;
      A215TAM04_DEL_FLG = obj3.getgxTv_SdtTAM04_KNGN_Tam04_del_flg() ;
      n215TAM04_DEL_FLG = false ;
      A234TAM04_CRT_PROG_NM = obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm() ;
      n234TAM04_CRT_PROG_NM = false ;
      A236TAM04_UPD_PROG_NM = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm() ;
      n236TAM04_UPD_PROG_NM = false ;
      A13TAM04_AUTH_CD = obj3.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd() ;
      Z13TAM04_AUTH_CD = obj3.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd_Z() ;
      Z285TAM04_AUTH_NM = obj3.getgxTv_SdtTAM04_KNGN_Tam04_auth_nm_Z() ;
      Z687TAM04_AUTH_LVL = obj3.getgxTv_SdtTAM04_KNGN_Tam04_auth_lvl_Z() ;
      Z215TAM04_DEL_FLG = obj3.getgxTv_SdtTAM04_KNGN_Tam04_del_flg_Z() ;
      Z233TAM04_CRT_DATETIME = obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_datetime_Z() ;
      Z266TAM04_CRT_USER_ID = obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_user_id_Z() ;
      Z234TAM04_CRT_PROG_NM = obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm_Z() ;
      Z235TAM04_UPD_DATETIME = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_datetime_Z() ;
      Z267TAM04_UPD_USER_ID = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_user_id_Z() ;
      Z236TAM04_UPD_PROG_NM = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm_Z() ;
      Z286TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_cnt_Z() ;
      O286TAM04_UPD_CNT = obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_cnt_Z() ;
      n285TAM04_AUTH_NM = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_auth_nm_N()==0)?false:true) ;
      n687TAM04_AUTH_LVL = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_auth_lvl_N()==0)?false:true) ;
      n215TAM04_DEL_FLG = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_del_flg_N()==0)?false:true) ;
      n233TAM04_CRT_DATETIME = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_datetime_N()==0)?false:true) ;
      n266TAM04_CRT_USER_ID = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_user_id_N()==0)?false:true) ;
      n234TAM04_CRT_PROG_NM = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_crt_prog_nm_N()==0)?false:true) ;
      n235TAM04_UPD_DATETIME = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_datetime_N()==0)?false:true) ;
      n267TAM04_UPD_USER_ID = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_user_id_N()==0)?false:true) ;
      n236TAM04_UPD_PROG_NM = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_prog_nm_N()==0)?false:true) ;
      n286TAM04_UPD_CNT = (boolean)((obj3.getgxTv_SdtTAM04_KNGN_Tam04_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj3.getgxTv_SdtTAM04_KNGN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A13TAM04_AUTH_CD = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey033( ) ;
      scanKeyStart033( ) ;
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
      zm033( -8) ;
      onLoadActions033( ) ;
      addRow033( ) ;
      scanKeyEnd033( ) ;
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
      RowToVars3( bcTAM04_KNGN, 0) ;
      scanKeyStart033( ) ;
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
      zm033( -8) ;
      onLoadActions033( ) ;
      addRow033( ) ;
      scanKeyEnd033( ) ;
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
      RowToVars3( bcTAM04_KNGN, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey033( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert033( ) ;
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
               update033( ) ;
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
                     insert033( ) ;
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
                     insert033( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow3( bcTAM04_KNGN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars3( bcTAM04_KNGN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey033( ) ;
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tam04_kngn_bc");
      VarsToRow3( bcTAM04_KNGN) ;
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
      Gx_mode = bcTAM04_KNGN.getgxTv_SdtTAM04_KNGN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTAM04_KNGN.setgxTv_SdtTAM04_KNGN_Mode( Gx_mode );
   }

   public void SetSDT( SdtTAM04_KNGN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTAM04_KNGN )
      {
         bcTAM04_KNGN = sdt ;
         if ( GXutil.strcmp(bcTAM04_KNGN.getgxTv_SdtTAM04_KNGN_Mode(), "") == 0 )
         {
            bcTAM04_KNGN.setgxTv_SdtTAM04_KNGN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow3( bcTAM04_KNGN) ;
         }
         else
         {
            RowToVars3( bcTAM04_KNGN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTAM04_KNGN.getgxTv_SdtTAM04_KNGN_Mode(), "") == 0 )
         {
            bcTAM04_KNGN.setgxTv_SdtTAM04_KNGN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars3( bcTAM04_KNGN, 1) ;
   }

   public SdtTAM04_KNGN getTAM04_KNGN_BC( )
   {
      return bcTAM04_KNGN ;
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
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z13TAM04_AUTH_CD = "" ;
      A13TAM04_AUTH_CD = "" ;
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
      BC00034_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00034_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00034_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC00034_A266TAM04_CRT_USER_ID = new String[] {""} ;
      BC00034_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC00034_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00034_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC00034_A267TAM04_UPD_USER_ID = new String[] {""} ;
      BC00034_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC00034_A286TAM04_UPD_CNT = new long[1] ;
      BC00034_n286TAM04_UPD_CNT = new boolean[] {false} ;
      BC00034_A285TAM04_AUTH_NM = new String[] {""} ;
      BC00034_n285TAM04_AUTH_NM = new boolean[] {false} ;
      BC00034_A687TAM04_AUTH_LVL = new byte[1] ;
      BC00034_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      BC00034_A215TAM04_DEL_FLG = new String[] {""} ;
      BC00034_n215TAM04_DEL_FLG = new boolean[] {false} ;
      BC00034_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      BC00034_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC00034_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      BC00034_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC00035_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00033_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00033_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00033_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC00033_A266TAM04_CRT_USER_ID = new String[] {""} ;
      BC00033_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC00033_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00033_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC00033_A267TAM04_UPD_USER_ID = new String[] {""} ;
      BC00033_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC00033_A286TAM04_UPD_CNT = new long[1] ;
      BC00033_n286TAM04_UPD_CNT = new boolean[] {false} ;
      BC00033_A285TAM04_AUTH_NM = new String[] {""} ;
      BC00033_n285TAM04_AUTH_NM = new boolean[] {false} ;
      BC00033_A687TAM04_AUTH_LVL = new byte[1] ;
      BC00033_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      BC00033_A215TAM04_DEL_FLG = new String[] {""} ;
      BC00033_n215TAM04_DEL_FLG = new boolean[] {false} ;
      BC00033_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      BC00033_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC00033_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      BC00033_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      sMode3 = "" ;
      BC00032_A13TAM04_AUTH_CD = new String[] {""} ;
      BC00032_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00032_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC00032_A266TAM04_CRT_USER_ID = new String[] {""} ;
      BC00032_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC00032_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00032_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC00032_A267TAM04_UPD_USER_ID = new String[] {""} ;
      BC00032_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC00032_A286TAM04_UPD_CNT = new long[1] ;
      BC00032_n286TAM04_UPD_CNT = new boolean[] {false} ;
      BC00032_A285TAM04_AUTH_NM = new String[] {""} ;
      BC00032_n285TAM04_AUTH_NM = new boolean[] {false} ;
      BC00032_A687TAM04_AUTH_LVL = new byte[1] ;
      BC00032_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      BC00032_A215TAM04_DEL_FLG = new String[] {""} ;
      BC00032_n215TAM04_DEL_FLG = new boolean[] {false} ;
      BC00032_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      BC00032_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC00032_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      BC00032_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      BC00039_A55TAM07_USER_ID = new String[] {""} ;
      BC000310_A50TBM07_AUTH_CD = new String[] {""} ;
      BC000311_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000311_A12TAM03_APP_ID = new String[] {""} ;
      BC000312_A13TAM04_AUTH_CD = new String[] {""} ;
      BC000312_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000312_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      BC000312_A266TAM04_CRT_USER_ID = new String[] {""} ;
      BC000312_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      BC000312_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000312_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      BC000312_A267TAM04_UPD_USER_ID = new String[] {""} ;
      BC000312_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      BC000312_A286TAM04_UPD_CNT = new long[1] ;
      BC000312_n286TAM04_UPD_CNT = new boolean[] {false} ;
      BC000312_A285TAM04_AUTH_NM = new String[] {""} ;
      BC000312_n285TAM04_AUTH_NM = new boolean[] {false} ;
      BC000312_A687TAM04_AUTH_LVL = new byte[1] ;
      BC000312_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      BC000312_A215TAM04_DEL_FLG = new String[] {""} ;
      BC000312_n215TAM04_DEL_FLG = new boolean[] {false} ;
      BC000312_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      BC000312_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      BC000312_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      BC000312_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new tam04_kngn_bc__default(),
         new Object[] {
             new Object[] {
            BC00032_A13TAM04_AUTH_CD, BC00032_A233TAM04_CRT_DATETIME, BC00032_n233TAM04_CRT_DATETIME, BC00032_A266TAM04_CRT_USER_ID, BC00032_n266TAM04_CRT_USER_ID, BC00032_A235TAM04_UPD_DATETIME, BC00032_n235TAM04_UPD_DATETIME, BC00032_A267TAM04_UPD_USER_ID, BC00032_n267TAM04_UPD_USER_ID, BC00032_A286TAM04_UPD_CNT,
            BC00032_n286TAM04_UPD_CNT, BC00032_A285TAM04_AUTH_NM, BC00032_n285TAM04_AUTH_NM, BC00032_A687TAM04_AUTH_LVL, BC00032_n687TAM04_AUTH_LVL, BC00032_A215TAM04_DEL_FLG, BC00032_n215TAM04_DEL_FLG, BC00032_A234TAM04_CRT_PROG_NM, BC00032_n234TAM04_CRT_PROG_NM, BC00032_A236TAM04_UPD_PROG_NM,
            BC00032_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC00033_A13TAM04_AUTH_CD, BC00033_A233TAM04_CRT_DATETIME, BC00033_n233TAM04_CRT_DATETIME, BC00033_A266TAM04_CRT_USER_ID, BC00033_n266TAM04_CRT_USER_ID, BC00033_A235TAM04_UPD_DATETIME, BC00033_n235TAM04_UPD_DATETIME, BC00033_A267TAM04_UPD_USER_ID, BC00033_n267TAM04_UPD_USER_ID, BC00033_A286TAM04_UPD_CNT,
            BC00033_n286TAM04_UPD_CNT, BC00033_A285TAM04_AUTH_NM, BC00033_n285TAM04_AUTH_NM, BC00033_A687TAM04_AUTH_LVL, BC00033_n687TAM04_AUTH_LVL, BC00033_A215TAM04_DEL_FLG, BC00033_n215TAM04_DEL_FLG, BC00033_A234TAM04_CRT_PROG_NM, BC00033_n234TAM04_CRT_PROG_NM, BC00033_A236TAM04_UPD_PROG_NM,
            BC00033_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC00034_A13TAM04_AUTH_CD, BC00034_A233TAM04_CRT_DATETIME, BC00034_n233TAM04_CRT_DATETIME, BC00034_A266TAM04_CRT_USER_ID, BC00034_n266TAM04_CRT_USER_ID, BC00034_A235TAM04_UPD_DATETIME, BC00034_n235TAM04_UPD_DATETIME, BC00034_A267TAM04_UPD_USER_ID, BC00034_n267TAM04_UPD_USER_ID, BC00034_A286TAM04_UPD_CNT,
            BC00034_n286TAM04_UPD_CNT, BC00034_A285TAM04_AUTH_NM, BC00034_n285TAM04_AUTH_NM, BC00034_A687TAM04_AUTH_LVL, BC00034_n687TAM04_AUTH_LVL, BC00034_A215TAM04_DEL_FLG, BC00034_n215TAM04_DEL_FLG, BC00034_A234TAM04_CRT_PROG_NM, BC00034_n234TAM04_CRT_PROG_NM, BC00034_A236TAM04_UPD_PROG_NM,
            BC00034_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            BC00035_A13TAM04_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00039_A55TAM07_USER_ID
            }
            , new Object[] {
            BC000310_A50TBM07_AUTH_CD
            }
            , new Object[] {
            BC000311_A13TAM04_AUTH_CD, BC000311_A12TAM03_APP_ID
            }
            , new Object[] {
            BC000312_A13TAM04_AUTH_CD, BC000312_A233TAM04_CRT_DATETIME, BC000312_n233TAM04_CRT_DATETIME, BC000312_A266TAM04_CRT_USER_ID, BC000312_n266TAM04_CRT_USER_ID, BC000312_A235TAM04_UPD_DATETIME, BC000312_n235TAM04_UPD_DATETIME, BC000312_A267TAM04_UPD_USER_ID, BC000312_n267TAM04_UPD_USER_ID, BC000312_A286TAM04_UPD_CNT,
            BC000312_n286TAM04_UPD_CNT, BC000312_A285TAM04_AUTH_NM, BC000312_n285TAM04_AUTH_NM, BC000312_A687TAM04_AUTH_LVL, BC000312_n687TAM04_AUTH_LVL, BC000312_A215TAM04_DEL_FLG, BC000312_n215TAM04_DEL_FLG, BC000312_A234TAM04_CRT_PROG_NM, BC000312_n234TAM04_CRT_PROG_NM, BC000312_A236TAM04_UPD_PROG_NM,
            BC000312_n236TAM04_UPD_PROG_NM
            }
         }
      );
      AV12Pgmname = "TAM04_KNGN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11032 */
      e11032 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte A687TAM04_AUTH_LVL ;
   private byte Z687TAM04_AUTH_LVL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound3 ;
   private int trnEnded ;
   private int GX_JID ;
   private long A286TAM04_UPD_CNT ;
   private long Z286TAM04_UPD_CNT ;
   private long O286TAM04_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV12Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode3 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date A233TAM04_CRT_DATETIME ;
   private java.util.Date A235TAM04_UPD_DATETIME ;
   private java.util.Date Z233TAM04_CRT_DATETIME ;
   private java.util.Date Z235TAM04_UPD_DATETIME ;
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
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAM04_KNGN bcTAM04_KNGN ;
   private IDataStoreProvider pr_default ;
   private String[] BC00034_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC00034_A233TAM04_CRT_DATETIME ;
   private boolean[] BC00034_n233TAM04_CRT_DATETIME ;
   private String[] BC00034_A266TAM04_CRT_USER_ID ;
   private boolean[] BC00034_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC00034_A235TAM04_UPD_DATETIME ;
   private boolean[] BC00034_n235TAM04_UPD_DATETIME ;
   private String[] BC00034_A267TAM04_UPD_USER_ID ;
   private boolean[] BC00034_n267TAM04_UPD_USER_ID ;
   private long[] BC00034_A286TAM04_UPD_CNT ;
   private boolean[] BC00034_n286TAM04_UPD_CNT ;
   private String[] BC00034_A285TAM04_AUTH_NM ;
   private boolean[] BC00034_n285TAM04_AUTH_NM ;
   private byte[] BC00034_A687TAM04_AUTH_LVL ;
   private boolean[] BC00034_n687TAM04_AUTH_LVL ;
   private String[] BC00034_A215TAM04_DEL_FLG ;
   private boolean[] BC00034_n215TAM04_DEL_FLG ;
   private String[] BC00034_A234TAM04_CRT_PROG_NM ;
   private boolean[] BC00034_n234TAM04_CRT_PROG_NM ;
   private String[] BC00034_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC00034_n236TAM04_UPD_PROG_NM ;
   private String[] BC00035_A13TAM04_AUTH_CD ;
   private String[] BC00033_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC00033_A233TAM04_CRT_DATETIME ;
   private boolean[] BC00033_n233TAM04_CRT_DATETIME ;
   private String[] BC00033_A266TAM04_CRT_USER_ID ;
   private boolean[] BC00033_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC00033_A235TAM04_UPD_DATETIME ;
   private boolean[] BC00033_n235TAM04_UPD_DATETIME ;
   private String[] BC00033_A267TAM04_UPD_USER_ID ;
   private boolean[] BC00033_n267TAM04_UPD_USER_ID ;
   private long[] BC00033_A286TAM04_UPD_CNT ;
   private boolean[] BC00033_n286TAM04_UPD_CNT ;
   private String[] BC00033_A285TAM04_AUTH_NM ;
   private boolean[] BC00033_n285TAM04_AUTH_NM ;
   private byte[] BC00033_A687TAM04_AUTH_LVL ;
   private boolean[] BC00033_n687TAM04_AUTH_LVL ;
   private String[] BC00033_A215TAM04_DEL_FLG ;
   private boolean[] BC00033_n215TAM04_DEL_FLG ;
   private String[] BC00033_A234TAM04_CRT_PROG_NM ;
   private boolean[] BC00033_n234TAM04_CRT_PROG_NM ;
   private String[] BC00033_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC00033_n236TAM04_UPD_PROG_NM ;
   private String[] BC00032_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC00032_A233TAM04_CRT_DATETIME ;
   private boolean[] BC00032_n233TAM04_CRT_DATETIME ;
   private String[] BC00032_A266TAM04_CRT_USER_ID ;
   private boolean[] BC00032_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC00032_A235TAM04_UPD_DATETIME ;
   private boolean[] BC00032_n235TAM04_UPD_DATETIME ;
   private String[] BC00032_A267TAM04_UPD_USER_ID ;
   private boolean[] BC00032_n267TAM04_UPD_USER_ID ;
   private long[] BC00032_A286TAM04_UPD_CNT ;
   private boolean[] BC00032_n286TAM04_UPD_CNT ;
   private String[] BC00032_A285TAM04_AUTH_NM ;
   private boolean[] BC00032_n285TAM04_AUTH_NM ;
   private byte[] BC00032_A687TAM04_AUTH_LVL ;
   private boolean[] BC00032_n687TAM04_AUTH_LVL ;
   private String[] BC00032_A215TAM04_DEL_FLG ;
   private boolean[] BC00032_n215TAM04_DEL_FLG ;
   private String[] BC00032_A234TAM04_CRT_PROG_NM ;
   private boolean[] BC00032_n234TAM04_CRT_PROG_NM ;
   private String[] BC00032_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC00032_n236TAM04_UPD_PROG_NM ;
   private String[] BC00039_A55TAM07_USER_ID ;
   private String[] BC000310_A50TBM07_AUTH_CD ;
   private String[] BC000311_A13TAM04_AUTH_CD ;
   private String[] BC000311_A12TAM03_APP_ID ;
   private String[] BC000312_A13TAM04_AUTH_CD ;
   private java.util.Date[] BC000312_A233TAM04_CRT_DATETIME ;
   private boolean[] BC000312_n233TAM04_CRT_DATETIME ;
   private String[] BC000312_A266TAM04_CRT_USER_ID ;
   private boolean[] BC000312_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] BC000312_A235TAM04_UPD_DATETIME ;
   private boolean[] BC000312_n235TAM04_UPD_DATETIME ;
   private String[] BC000312_A267TAM04_UPD_USER_ID ;
   private boolean[] BC000312_n267TAM04_UPD_USER_ID ;
   private long[] BC000312_A286TAM04_UPD_CNT ;
   private boolean[] BC000312_n286TAM04_UPD_CNT ;
   private String[] BC000312_A285TAM04_AUTH_NM ;
   private boolean[] BC000312_n285TAM04_AUTH_NM ;
   private byte[] BC000312_A687TAM04_AUTH_LVL ;
   private boolean[] BC000312_n687TAM04_AUTH_LVL ;
   private String[] BC000312_A215TAM04_DEL_FLG ;
   private boolean[] BC000312_n215TAM04_DEL_FLG ;
   private String[] BC000312_A234TAM04_CRT_PROG_NM ;
   private boolean[] BC000312_n234TAM04_CRT_PROG_NM ;
   private String[] BC000312_A236TAM04_UPD_PROG_NM ;
   private boolean[] BC000312_n236TAM04_UPD_PROG_NM ;
}

final  class tam04_kngn_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00032", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00033", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00034", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00035", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00036", "INSERT INTO `TAM04_KNGN`(`TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00037", "UPDATE `TAM04_KNGN` SET `TAM04_CRT_DATETIME`=?, `TAM04_CRT_USER_ID`=?, `TAM04_UPD_DATETIME`=?, `TAM04_UPD_USER_ID`=?, `TAM04_UPD_CNT`=?, `TAM04_AUTH_NM`=?, `TAM04_AUTH_LVL`=?, `TAM04_DEL_FLG`=?, `TAM04_CRT_PROG_NM`=?, `TAM04_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00038", "DELETE FROM `TAM04_KNGN`  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00039", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000310", "SELECT `TBM07_AUTH_CD` FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000311", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000312", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 10 :
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
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 4 :
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
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

