/*
               File: tbm02_cdisc_domain_bc
        Description: CDISCドメインマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:34.24
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
            Z516TBM02_DOM_CD = A516TBM02_DOM_CD ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e12132( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "ドメインコード:" + A516TBM02_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A517TBM02_DOM_ENM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A518TBM02_DOM_JNM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A519TBM02_DOM_GRP_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A520TBM02_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A521TBM02_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A522TBM02_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A523TBM02_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A524TBM02_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A525TBM02_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A526TBM02_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A527TBM02_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A528TBM02_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A529TBM02_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1167( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1338( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z523TBM02_CRT_DATETIME = A523TBM02_CRT_DATETIME ;
         Z524TBM02_CRT_USER_ID = A524TBM02_CRT_USER_ID ;
         Z526TBM02_UPD_DATETIME = A526TBM02_UPD_DATETIME ;
         Z527TBM02_UPD_USER_ID = A527TBM02_UPD_USER_ID ;
         Z529TBM02_UPD_CNT = A529TBM02_UPD_CNT ;
         Z517TBM02_DOM_ENM = A517TBM02_DOM_ENM ;
         Z518TBM02_DOM_JNM = A518TBM02_DOM_JNM ;
         Z519TBM02_DOM_GRP_NM = A519TBM02_DOM_GRP_NM ;
         Z520TBM02_NOTE = A520TBM02_NOTE ;
         Z521TBM02_ORDER = A521TBM02_ORDER ;
         Z522TBM02_DEL_FLG = A522TBM02_DEL_FLG ;
         Z525TBM02_CRT_PROG_NM = A525TBM02_CRT_PROG_NM ;
         Z528TBM02_UPD_PROG_NM = A528TBM02_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z516TBM02_DOM_CD = A516TBM02_DOM_CD ;
         Z523TBM02_CRT_DATETIME = A523TBM02_CRT_DATETIME ;
         Z524TBM02_CRT_USER_ID = A524TBM02_CRT_USER_ID ;
         Z526TBM02_UPD_DATETIME = A526TBM02_UPD_DATETIME ;
         Z527TBM02_UPD_USER_ID = A527TBM02_UPD_USER_ID ;
         Z529TBM02_UPD_CNT = A529TBM02_UPD_CNT ;
         Z517TBM02_DOM_ENM = A517TBM02_DOM_ENM ;
         Z518TBM02_DOM_JNM = A518TBM02_DOM_JNM ;
         Z519TBM02_DOM_GRP_NM = A519TBM02_DOM_GRP_NM ;
         Z520TBM02_NOTE = A520TBM02_NOTE ;
         Z521TBM02_ORDER = A521TBM02_ORDER ;
         Z522TBM02_DEL_FLG = A522TBM02_DEL_FLG ;
         Z525TBM02_CRT_PROG_NM = A525TBM02_CRT_PROG_NM ;
         Z528TBM02_UPD_PROG_NM = A528TBM02_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {A516TBM02_DOM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A523TBM02_CRT_DATETIME = BC00134_A523TBM02_CRT_DATETIME[0] ;
         n523TBM02_CRT_DATETIME = BC00134_n523TBM02_CRT_DATETIME[0] ;
         A524TBM02_CRT_USER_ID = BC00134_A524TBM02_CRT_USER_ID[0] ;
         n524TBM02_CRT_USER_ID = BC00134_n524TBM02_CRT_USER_ID[0] ;
         A526TBM02_UPD_DATETIME = BC00134_A526TBM02_UPD_DATETIME[0] ;
         n526TBM02_UPD_DATETIME = BC00134_n526TBM02_UPD_DATETIME[0] ;
         A527TBM02_UPD_USER_ID = BC00134_A527TBM02_UPD_USER_ID[0] ;
         n527TBM02_UPD_USER_ID = BC00134_n527TBM02_UPD_USER_ID[0] ;
         A529TBM02_UPD_CNT = BC00134_A529TBM02_UPD_CNT[0] ;
         n529TBM02_UPD_CNT = BC00134_n529TBM02_UPD_CNT[0] ;
         A517TBM02_DOM_ENM = BC00134_A517TBM02_DOM_ENM[0] ;
         n517TBM02_DOM_ENM = BC00134_n517TBM02_DOM_ENM[0] ;
         A518TBM02_DOM_JNM = BC00134_A518TBM02_DOM_JNM[0] ;
         n518TBM02_DOM_JNM = BC00134_n518TBM02_DOM_JNM[0] ;
         A519TBM02_DOM_GRP_NM = BC00134_A519TBM02_DOM_GRP_NM[0] ;
         n519TBM02_DOM_GRP_NM = BC00134_n519TBM02_DOM_GRP_NM[0] ;
         A520TBM02_NOTE = BC00134_A520TBM02_NOTE[0] ;
         n520TBM02_NOTE = BC00134_n520TBM02_NOTE[0] ;
         A521TBM02_ORDER = BC00134_A521TBM02_ORDER[0] ;
         n521TBM02_ORDER = BC00134_n521TBM02_ORDER[0] ;
         A522TBM02_DEL_FLG = BC00134_A522TBM02_DEL_FLG[0] ;
         n522TBM02_DEL_FLG = BC00134_n522TBM02_DEL_FLG[0] ;
         A525TBM02_CRT_PROG_NM = BC00134_A525TBM02_CRT_PROG_NM[0] ;
         n525TBM02_CRT_PROG_NM = BC00134_n525TBM02_CRT_PROG_NM[0] ;
         A528TBM02_UPD_PROG_NM = BC00134_A528TBM02_UPD_PROG_NM[0] ;
         n528TBM02_UPD_PROG_NM = BC00134_n528TBM02_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A523TBM02_CRT_DATETIME) || (( A523TBM02_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A523TBM02_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A526TBM02_UPD_DATETIME) || (( A526TBM02_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A526TBM02_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
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
      pr_default.execute(3, new Object[] {A516TBM02_DOM_CD});
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
      pr_default.execute(1, new Object[] {A516TBM02_DOM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1338( 8) ;
         RcdFound38 = (short)(1) ;
         A516TBM02_DOM_CD = BC00133_A516TBM02_DOM_CD[0] ;
         A523TBM02_CRT_DATETIME = BC00133_A523TBM02_CRT_DATETIME[0] ;
         n523TBM02_CRT_DATETIME = BC00133_n523TBM02_CRT_DATETIME[0] ;
         A524TBM02_CRT_USER_ID = BC00133_A524TBM02_CRT_USER_ID[0] ;
         n524TBM02_CRT_USER_ID = BC00133_n524TBM02_CRT_USER_ID[0] ;
         A526TBM02_UPD_DATETIME = BC00133_A526TBM02_UPD_DATETIME[0] ;
         n526TBM02_UPD_DATETIME = BC00133_n526TBM02_UPD_DATETIME[0] ;
         A527TBM02_UPD_USER_ID = BC00133_A527TBM02_UPD_USER_ID[0] ;
         n527TBM02_UPD_USER_ID = BC00133_n527TBM02_UPD_USER_ID[0] ;
         A529TBM02_UPD_CNT = BC00133_A529TBM02_UPD_CNT[0] ;
         n529TBM02_UPD_CNT = BC00133_n529TBM02_UPD_CNT[0] ;
         A517TBM02_DOM_ENM = BC00133_A517TBM02_DOM_ENM[0] ;
         n517TBM02_DOM_ENM = BC00133_n517TBM02_DOM_ENM[0] ;
         A518TBM02_DOM_JNM = BC00133_A518TBM02_DOM_JNM[0] ;
         n518TBM02_DOM_JNM = BC00133_n518TBM02_DOM_JNM[0] ;
         A519TBM02_DOM_GRP_NM = BC00133_A519TBM02_DOM_GRP_NM[0] ;
         n519TBM02_DOM_GRP_NM = BC00133_n519TBM02_DOM_GRP_NM[0] ;
         A520TBM02_NOTE = BC00133_A520TBM02_NOTE[0] ;
         n520TBM02_NOTE = BC00133_n520TBM02_NOTE[0] ;
         A521TBM02_ORDER = BC00133_A521TBM02_ORDER[0] ;
         n521TBM02_ORDER = BC00133_n521TBM02_ORDER[0] ;
         A522TBM02_DEL_FLG = BC00133_A522TBM02_DEL_FLG[0] ;
         n522TBM02_DEL_FLG = BC00133_n522TBM02_DEL_FLG[0] ;
         A525TBM02_CRT_PROG_NM = BC00133_A525TBM02_CRT_PROG_NM[0] ;
         n525TBM02_CRT_PROG_NM = BC00133_n525TBM02_CRT_PROG_NM[0] ;
         A528TBM02_UPD_PROG_NM = BC00133_A528TBM02_UPD_PROG_NM[0] ;
         n528TBM02_UPD_PROG_NM = BC00133_n528TBM02_UPD_PROG_NM[0] ;
         O529TBM02_UPD_CNT = A529TBM02_UPD_CNT ;
         n529TBM02_UPD_CNT = false ;
         Z516TBM02_DOM_CD = A516TBM02_DOM_CD ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1338( ) ;
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
         pr_default.execute(0, new Object[] {A516TBM02_DOM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM02_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z523TBM02_CRT_DATETIME.equals( BC00132_A523TBM02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z524TBM02_CRT_USER_ID, BC00132_A524TBM02_CRT_USER_ID[0]) != 0 ) || !( Z526TBM02_UPD_DATETIME.equals( BC00132_A526TBM02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z527TBM02_UPD_USER_ID, BC00132_A527TBM02_UPD_USER_ID[0]) != 0 ) || ( Z529TBM02_UPD_CNT != BC00132_A529TBM02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z517TBM02_DOM_ENM, BC00132_A517TBM02_DOM_ENM[0]) != 0 ) || ( GXutil.strcmp(Z518TBM02_DOM_JNM, BC00132_A518TBM02_DOM_JNM[0]) != 0 ) || ( GXutil.strcmp(Z519TBM02_DOM_GRP_NM, BC00132_A519TBM02_DOM_GRP_NM[0]) != 0 ) || ( GXutil.strcmp(Z520TBM02_NOTE, BC00132_A520TBM02_NOTE[0]) != 0 ) || ( Z521TBM02_ORDER != BC00132_A521TBM02_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z522TBM02_DEL_FLG, BC00132_A522TBM02_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z525TBM02_CRT_PROG_NM, BC00132_A525TBM02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z528TBM02_UPD_PROG_NM, BC00132_A528TBM02_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(4, new Object[] {A516TBM02_DOM_CD, new Boolean(n523TBM02_CRT_DATETIME), A523TBM02_CRT_DATETIME, new Boolean(n524TBM02_CRT_USER_ID), A524TBM02_CRT_USER_ID, new Boolean(n526TBM02_UPD_DATETIME), A526TBM02_UPD_DATETIME, new Boolean(n527TBM02_UPD_USER_ID), A527TBM02_UPD_USER_ID, new Boolean(n529TBM02_UPD_CNT), new Long(A529TBM02_UPD_CNT), new Boolean(n517TBM02_DOM_ENM), A517TBM02_DOM_ENM, new Boolean(n518TBM02_DOM_JNM), A518TBM02_DOM_JNM, new Boolean(n519TBM02_DOM_GRP_NM), A519TBM02_DOM_GRP_NM, new Boolean(n520TBM02_NOTE), A520TBM02_NOTE, new Boolean(n521TBM02_ORDER), new Integer(A521TBM02_ORDER), new Boolean(n522TBM02_DEL_FLG), A522TBM02_DEL_FLG, new Boolean(n525TBM02_CRT_PROG_NM), A525TBM02_CRT_PROG_NM, new Boolean(n528TBM02_UPD_PROG_NM), A528TBM02_UPD_PROG_NM});
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
                  pr_default.execute(5, new Object[] {new Boolean(n523TBM02_CRT_DATETIME), A523TBM02_CRT_DATETIME, new Boolean(n524TBM02_CRT_USER_ID), A524TBM02_CRT_USER_ID, new Boolean(n526TBM02_UPD_DATETIME), A526TBM02_UPD_DATETIME, new Boolean(n527TBM02_UPD_USER_ID), A527TBM02_UPD_USER_ID, new Boolean(n529TBM02_UPD_CNT), new Long(A529TBM02_UPD_CNT), new Boolean(n517TBM02_DOM_ENM), A517TBM02_DOM_ENM, new Boolean(n518TBM02_DOM_JNM), A518TBM02_DOM_JNM, new Boolean(n519TBM02_DOM_GRP_NM), A519TBM02_DOM_GRP_NM, new Boolean(n520TBM02_NOTE), A520TBM02_NOTE, new Boolean(n521TBM02_ORDER), new Integer(A521TBM02_ORDER), new Boolean(n522TBM02_DEL_FLG), A522TBM02_DEL_FLG, new Boolean(n525TBM02_CRT_PROG_NM), A525TBM02_CRT_PROG_NM, new Boolean(n528TBM02_UPD_PROG_NM), A528TBM02_UPD_PROG_NM, A516TBM02_DOM_CD});
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
               pr_default.execute(6, new Object[] {A516TBM02_DOM_CD});
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
         pr_default.execute(7, new Object[] {A516TBM02_DOM_CD});
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
      /* Using cursor BC001310 */
      pr_default.execute(8, new Object[] {A516TBM02_DOM_CD});
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A516TBM02_DOM_CD = BC001310_A516TBM02_DOM_CD[0] ;
         A523TBM02_CRT_DATETIME = BC001310_A523TBM02_CRT_DATETIME[0] ;
         n523TBM02_CRT_DATETIME = BC001310_n523TBM02_CRT_DATETIME[0] ;
         A524TBM02_CRT_USER_ID = BC001310_A524TBM02_CRT_USER_ID[0] ;
         n524TBM02_CRT_USER_ID = BC001310_n524TBM02_CRT_USER_ID[0] ;
         A526TBM02_UPD_DATETIME = BC001310_A526TBM02_UPD_DATETIME[0] ;
         n526TBM02_UPD_DATETIME = BC001310_n526TBM02_UPD_DATETIME[0] ;
         A527TBM02_UPD_USER_ID = BC001310_A527TBM02_UPD_USER_ID[0] ;
         n527TBM02_UPD_USER_ID = BC001310_n527TBM02_UPD_USER_ID[0] ;
         A529TBM02_UPD_CNT = BC001310_A529TBM02_UPD_CNT[0] ;
         n529TBM02_UPD_CNT = BC001310_n529TBM02_UPD_CNT[0] ;
         A517TBM02_DOM_ENM = BC001310_A517TBM02_DOM_ENM[0] ;
         n517TBM02_DOM_ENM = BC001310_n517TBM02_DOM_ENM[0] ;
         A518TBM02_DOM_JNM = BC001310_A518TBM02_DOM_JNM[0] ;
         n518TBM02_DOM_JNM = BC001310_n518TBM02_DOM_JNM[0] ;
         A519TBM02_DOM_GRP_NM = BC001310_A519TBM02_DOM_GRP_NM[0] ;
         n519TBM02_DOM_GRP_NM = BC001310_n519TBM02_DOM_GRP_NM[0] ;
         A520TBM02_NOTE = BC001310_A520TBM02_NOTE[0] ;
         n520TBM02_NOTE = BC001310_n520TBM02_NOTE[0] ;
         A521TBM02_ORDER = BC001310_A521TBM02_ORDER[0] ;
         n521TBM02_ORDER = BC001310_n521TBM02_ORDER[0] ;
         A522TBM02_DEL_FLG = BC001310_A522TBM02_DEL_FLG[0] ;
         n522TBM02_DEL_FLG = BC001310_n522TBM02_DEL_FLG[0] ;
         A525TBM02_CRT_PROG_NM = BC001310_A525TBM02_CRT_PROG_NM[0] ;
         n525TBM02_CRT_PROG_NM = BC001310_n525TBM02_CRT_PROG_NM[0] ;
         A528TBM02_UPD_PROG_NM = BC001310_A528TBM02_UPD_PROG_NM[0] ;
         n528TBM02_UPD_PROG_NM = BC001310_n528TBM02_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1338( )
   {
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
         A516TBM02_DOM_CD = BC001310_A516TBM02_DOM_CD[0] ;
         A523TBM02_CRT_DATETIME = BC001310_A523TBM02_CRT_DATETIME[0] ;
         n523TBM02_CRT_DATETIME = BC001310_n523TBM02_CRT_DATETIME[0] ;
         A524TBM02_CRT_USER_ID = BC001310_A524TBM02_CRT_USER_ID[0] ;
         n524TBM02_CRT_USER_ID = BC001310_n524TBM02_CRT_USER_ID[0] ;
         A526TBM02_UPD_DATETIME = BC001310_A526TBM02_UPD_DATETIME[0] ;
         n526TBM02_UPD_DATETIME = BC001310_n526TBM02_UPD_DATETIME[0] ;
         A527TBM02_UPD_USER_ID = BC001310_A527TBM02_UPD_USER_ID[0] ;
         n527TBM02_UPD_USER_ID = BC001310_n527TBM02_UPD_USER_ID[0] ;
         A529TBM02_UPD_CNT = BC001310_A529TBM02_UPD_CNT[0] ;
         n529TBM02_UPD_CNT = BC001310_n529TBM02_UPD_CNT[0] ;
         A517TBM02_DOM_ENM = BC001310_A517TBM02_DOM_ENM[0] ;
         n517TBM02_DOM_ENM = BC001310_n517TBM02_DOM_ENM[0] ;
         A518TBM02_DOM_JNM = BC001310_A518TBM02_DOM_JNM[0] ;
         n518TBM02_DOM_JNM = BC001310_n518TBM02_DOM_JNM[0] ;
         A519TBM02_DOM_GRP_NM = BC001310_A519TBM02_DOM_GRP_NM[0] ;
         n519TBM02_DOM_GRP_NM = BC001310_n519TBM02_DOM_GRP_NM[0] ;
         A520TBM02_NOTE = BC001310_A520TBM02_NOTE[0] ;
         n520TBM02_NOTE = BC001310_n520TBM02_NOTE[0] ;
         A521TBM02_ORDER = BC001310_A521TBM02_ORDER[0] ;
         n521TBM02_ORDER = BC001310_n521TBM02_ORDER[0] ;
         A522TBM02_DEL_FLG = BC001310_A522TBM02_DEL_FLG[0] ;
         n522TBM02_DEL_FLG = BC001310_n522TBM02_DEL_FLG[0] ;
         A525TBM02_CRT_PROG_NM = BC001310_A525TBM02_CRT_PROG_NM[0] ;
         n525TBM02_CRT_PROG_NM = BC001310_n525TBM02_CRT_PROG_NM[0] ;
         A528TBM02_UPD_PROG_NM = BC001310_A528TBM02_UPD_PROG_NM[0] ;
         n528TBM02_UPD_PROG_NM = BC001310_n528TBM02_UPD_PROG_NM[0] ;
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
      A523TBM02_CRT_DATETIME = GXutil.now( ) ;
      n523TBM02_CRT_DATETIME = false ;
      GXt_char1 = A524TBM02_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A524TBM02_CRT_USER_ID = GXt_char1 ;
      n524TBM02_CRT_USER_ID = false ;
      A526TBM02_UPD_DATETIME = GXutil.now( ) ;
      n526TBM02_UPD_DATETIME = false ;
      GXt_char1 = A527TBM02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A527TBM02_UPD_USER_ID = GXt_char1 ;
      n527TBM02_UPD_USER_ID = false ;
      A529TBM02_UPD_CNT = (long)(O529TBM02_UPD_CNT+1) ;
      n529TBM02_UPD_CNT = false ;
   }

   public void beforeUpdate1338( )
   {
      /* Before Update Rules */
      A526TBM02_UPD_DATETIME = GXutil.now( ) ;
      n526TBM02_UPD_DATETIME = false ;
      GXt_char1 = A527TBM02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A527TBM02_UPD_USER_ID = GXt_char1 ;
      n527TBM02_UPD_USER_ID = false ;
      A529TBM02_UPD_CNT = (long)(O529TBM02_UPD_CNT+1) ;
      n529TBM02_UPD_CNT = false ;
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
      A523TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n523TBM02_CRT_DATETIME = false ;
      A524TBM02_CRT_USER_ID = "" ;
      n524TBM02_CRT_USER_ID = false ;
      A526TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n526TBM02_UPD_DATETIME = false ;
      A527TBM02_UPD_USER_ID = "" ;
      n527TBM02_UPD_USER_ID = false ;
      A529TBM02_UPD_CNT = 0 ;
      n529TBM02_UPD_CNT = false ;
      A517TBM02_DOM_ENM = "" ;
      n517TBM02_DOM_ENM = false ;
      A518TBM02_DOM_JNM = "" ;
      n518TBM02_DOM_JNM = false ;
      A519TBM02_DOM_GRP_NM = "" ;
      n519TBM02_DOM_GRP_NM = false ;
      A520TBM02_NOTE = "" ;
      n520TBM02_NOTE = false ;
      A521TBM02_ORDER = 0 ;
      n521TBM02_ORDER = false ;
      A522TBM02_DEL_FLG = "" ;
      n522TBM02_DEL_FLG = false ;
      A525TBM02_CRT_PROG_NM = "" ;
      n525TBM02_CRT_PROG_NM = false ;
      A528TBM02_UPD_PROG_NM = "" ;
      n528TBM02_UPD_PROG_NM = false ;
      O529TBM02_UPD_CNT = A529TBM02_UPD_CNT ;
      n529TBM02_UPD_CNT = false ;
   }

   public void initAll1338( )
   {
      A516TBM02_DOM_CD = "" ;
      initializeNonKey1338( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow38( SdtTBM02_CDISC_DOMAIN obj38 )
   {
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Mode( Gx_mode );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime( A523TBM02_CRT_DATETIME );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id( A524TBM02_CRT_USER_ID );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime( A526TBM02_UPD_DATETIME );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id( A527TBM02_UPD_USER_ID );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt( A529TBM02_UPD_CNT );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm( A517TBM02_DOM_ENM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm( A518TBM02_DOM_JNM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm( A519TBM02_DOM_GRP_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note( A520TBM02_NOTE );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order( A521TBM02_ORDER );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg( A522TBM02_DEL_FLG );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm( A525TBM02_CRT_PROG_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm( A528TBM02_UPD_PROG_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd( A516TBM02_DOM_CD );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd_Z( Z516TBM02_DOM_CD );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_Z( Z517TBM02_DOM_ENM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_Z( Z518TBM02_DOM_JNM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_Z( Z519TBM02_DOM_GRP_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_Z( Z520TBM02_NOTE );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_Z( Z521TBM02_ORDER );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_Z( Z522TBM02_DEL_FLG );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_Z( Z523TBM02_CRT_DATETIME );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_Z( Z524TBM02_CRT_USER_ID );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_Z( Z525TBM02_CRT_PROG_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_Z( Z526TBM02_UPD_DATETIME );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_Z( Z527TBM02_UPD_USER_ID );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_Z( Z528TBM02_UPD_PROG_NM );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_Z( Z529TBM02_UPD_CNT );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_N( (byte)((byte)((n517TBM02_DOM_ENM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_N( (byte)((byte)((n518TBM02_DOM_JNM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_N( (byte)((byte)((n519TBM02_DOM_GRP_NM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_N( (byte)((byte)((n520TBM02_NOTE)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_N( (byte)((byte)((n521TBM02_ORDER)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_N( (byte)((byte)((n522TBM02_DEL_FLG)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_N( (byte)((byte)((n523TBM02_CRT_DATETIME)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_N( (byte)((byte)((n524TBM02_CRT_USER_ID)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_N( (byte)((byte)((n525TBM02_CRT_PROG_NM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_N( (byte)((byte)((n526TBM02_UPD_DATETIME)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_N( (byte)((byte)((n527TBM02_UPD_USER_ID)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_N( (byte)((byte)((n528TBM02_UPD_PROG_NM)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_N( (byte)((byte)((n529TBM02_UPD_CNT)?1:0)) );
      obj38.setgxTv_SdtTBM02_CDISC_DOMAIN_Mode( Gx_mode );
   }

   public void RowToVars38( SdtTBM02_CDISC_DOMAIN obj38 ,
                            int forceLoad )
   {
      Gx_mode = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Mode() ;
      A523TBM02_CRT_DATETIME = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime() ;
      n523TBM02_CRT_DATETIME = false ;
      A524TBM02_CRT_USER_ID = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id() ;
      n524TBM02_CRT_USER_ID = false ;
      A526TBM02_UPD_DATETIME = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime() ;
      n526TBM02_UPD_DATETIME = false ;
      A527TBM02_UPD_USER_ID = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id() ;
      n527TBM02_UPD_USER_ID = false ;
      A529TBM02_UPD_CNT = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt() ;
      n529TBM02_UPD_CNT = false ;
      A517TBM02_DOM_ENM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm() ;
      n517TBM02_DOM_ENM = false ;
      A518TBM02_DOM_JNM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm() ;
      n518TBM02_DOM_JNM = false ;
      A519TBM02_DOM_GRP_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm() ;
      n519TBM02_DOM_GRP_NM = false ;
      A520TBM02_NOTE = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note() ;
      n520TBM02_NOTE = false ;
      A521TBM02_ORDER = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order() ;
      n521TBM02_ORDER = false ;
      A522TBM02_DEL_FLG = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg() ;
      n522TBM02_DEL_FLG = false ;
      A525TBM02_CRT_PROG_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm() ;
      n525TBM02_CRT_PROG_NM = false ;
      A528TBM02_UPD_PROG_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm() ;
      n528TBM02_UPD_PROG_NM = false ;
      A516TBM02_DOM_CD = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd() ;
      Z516TBM02_DOM_CD = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd_Z() ;
      Z517TBM02_DOM_ENM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_Z() ;
      Z518TBM02_DOM_JNM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_Z() ;
      Z519TBM02_DOM_GRP_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_Z() ;
      Z520TBM02_NOTE = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_Z() ;
      Z521TBM02_ORDER = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_Z() ;
      Z522TBM02_DEL_FLG = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_Z() ;
      Z523TBM02_CRT_DATETIME = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_Z() ;
      Z524TBM02_CRT_USER_ID = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_Z() ;
      Z525TBM02_CRT_PROG_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_Z() ;
      Z526TBM02_UPD_DATETIME = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_Z() ;
      Z527TBM02_UPD_USER_ID = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_Z() ;
      Z528TBM02_UPD_PROG_NM = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_Z() ;
      Z529TBM02_UPD_CNT = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_Z() ;
      O529TBM02_UPD_CNT = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_Z() ;
      n517TBM02_DOM_ENM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_N()==0)?false:true) ;
      n518TBM02_DOM_JNM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_N()==0)?false:true) ;
      n519TBM02_DOM_GRP_NM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_N()==0)?false:true) ;
      n520TBM02_NOTE = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_N()==0)?false:true) ;
      n521TBM02_ORDER = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_N()==0)?false:true) ;
      n522TBM02_DEL_FLG = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_N()==0)?false:true) ;
      n523TBM02_CRT_DATETIME = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_N()==0)?false:true) ;
      n524TBM02_CRT_USER_ID = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_N()==0)?false:true) ;
      n525TBM02_CRT_PROG_NM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_N()==0)?false:true) ;
      n526TBM02_UPD_DATETIME = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_N()==0)?false:true) ;
      n527TBM02_UPD_USER_ID = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_N()==0)?false:true) ;
      n528TBM02_UPD_PROG_NM = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_N()==0)?false:true) ;
      n529TBM02_UPD_CNT = (boolean)((obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj38.getgxTv_SdtTBM02_CDISC_DOMAIN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A516TBM02_DOM_CD = (String)getParm(obj,0) ;
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
         Z516TBM02_DOM_CD = A516TBM02_DOM_CD ;
         O529TBM02_UPD_CNT = A529TBM02_UPD_CNT ;
         n529TBM02_UPD_CNT = false ;
      }
      zm1338( -8) ;
      sMode38 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1338( ) ;
      Gx_mode = sMode38 ;
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
      if ( RcdFound38 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A516TBM02_DOM_CD, Z516TBM02_DOM_CD) != 0 )
         {
            A516TBM02_DOM_CD = Z516TBM02_DOM_CD ;
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
            if ( GXutil.strcmp(A516TBM02_DOM_CD, Z516TBM02_DOM_CD) != 0 )
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
         else if ( GXutil.strcmp(A516TBM02_DOM_CD, Z516TBM02_DOM_CD) != 0 )
         {
            A516TBM02_DOM_CD = Z516TBM02_DOM_CD ;
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
         if ( GXutil.strcmp(A516TBM02_DOM_CD, Z516TBM02_DOM_CD) != 0 )
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
                  /* Execute user subroutine: S1167 */
                  S1167 ();
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
      Z516TBM02_DOM_CD = "" ;
      A516TBM02_DOM_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A517TBM02_DOM_ENM = "" ;
      A518TBM02_DOM_JNM = "" ;
      A519TBM02_DOM_GRP_NM = "" ;
      A520TBM02_NOTE = "" ;
      A522TBM02_DEL_FLG = "" ;
      A523TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A524TBM02_CRT_USER_ID = "" ;
      A525TBM02_CRT_PROG_NM = "" ;
      A526TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A527TBM02_UPD_USER_ID = "" ;
      A528TBM02_UPD_PROG_NM = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_Z = "" ;
      gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_Z = "" ;
      Z523TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z524TBM02_CRT_USER_ID = "" ;
      Z526TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z527TBM02_UPD_USER_ID = "" ;
      Z517TBM02_DOM_ENM = "" ;
      Z518TBM02_DOM_JNM = "" ;
      Z519TBM02_DOM_GRP_NM = "" ;
      Z520TBM02_NOTE = "" ;
      Z522TBM02_DEL_FLG = "" ;
      Z525TBM02_CRT_PROG_NM = "" ;
      Z528TBM02_UPD_PROG_NM = "" ;
      BC00134_A516TBM02_DOM_CD = new String[] {""} ;
      BC00134_A523TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00134_n523TBM02_CRT_DATETIME = new boolean[] {false} ;
      BC00134_A524TBM02_CRT_USER_ID = new String[] {""} ;
      BC00134_n524TBM02_CRT_USER_ID = new boolean[] {false} ;
      BC00134_A526TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00134_n526TBM02_UPD_DATETIME = new boolean[] {false} ;
      BC00134_A527TBM02_UPD_USER_ID = new String[] {""} ;
      BC00134_n527TBM02_UPD_USER_ID = new boolean[] {false} ;
      BC00134_A529TBM02_UPD_CNT = new long[1] ;
      BC00134_n529TBM02_UPD_CNT = new boolean[] {false} ;
      BC00134_A517TBM02_DOM_ENM = new String[] {""} ;
      BC00134_n517TBM02_DOM_ENM = new boolean[] {false} ;
      BC00134_A518TBM02_DOM_JNM = new String[] {""} ;
      BC00134_n518TBM02_DOM_JNM = new boolean[] {false} ;
      BC00134_A519TBM02_DOM_GRP_NM = new String[] {""} ;
      BC00134_n519TBM02_DOM_GRP_NM = new boolean[] {false} ;
      BC00134_A520TBM02_NOTE = new String[] {""} ;
      BC00134_n520TBM02_NOTE = new boolean[] {false} ;
      BC00134_A521TBM02_ORDER = new int[1] ;
      BC00134_n521TBM02_ORDER = new boolean[] {false} ;
      BC00134_A522TBM02_DEL_FLG = new String[] {""} ;
      BC00134_n522TBM02_DEL_FLG = new boolean[] {false} ;
      BC00134_A525TBM02_CRT_PROG_NM = new String[] {""} ;
      BC00134_n525TBM02_CRT_PROG_NM = new boolean[] {false} ;
      BC00134_A528TBM02_UPD_PROG_NM = new String[] {""} ;
      BC00134_n528TBM02_UPD_PROG_NM = new boolean[] {false} ;
      BC00135_A516TBM02_DOM_CD = new String[] {""} ;
      BC00133_A516TBM02_DOM_CD = new String[] {""} ;
      BC00133_A523TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00133_n523TBM02_CRT_DATETIME = new boolean[] {false} ;
      BC00133_A524TBM02_CRT_USER_ID = new String[] {""} ;
      BC00133_n524TBM02_CRT_USER_ID = new boolean[] {false} ;
      BC00133_A526TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00133_n526TBM02_UPD_DATETIME = new boolean[] {false} ;
      BC00133_A527TBM02_UPD_USER_ID = new String[] {""} ;
      BC00133_n527TBM02_UPD_USER_ID = new boolean[] {false} ;
      BC00133_A529TBM02_UPD_CNT = new long[1] ;
      BC00133_n529TBM02_UPD_CNT = new boolean[] {false} ;
      BC00133_A517TBM02_DOM_ENM = new String[] {""} ;
      BC00133_n517TBM02_DOM_ENM = new boolean[] {false} ;
      BC00133_A518TBM02_DOM_JNM = new String[] {""} ;
      BC00133_n518TBM02_DOM_JNM = new boolean[] {false} ;
      BC00133_A519TBM02_DOM_GRP_NM = new String[] {""} ;
      BC00133_n519TBM02_DOM_GRP_NM = new boolean[] {false} ;
      BC00133_A520TBM02_NOTE = new String[] {""} ;
      BC00133_n520TBM02_NOTE = new boolean[] {false} ;
      BC00133_A521TBM02_ORDER = new int[1] ;
      BC00133_n521TBM02_ORDER = new boolean[] {false} ;
      BC00133_A522TBM02_DEL_FLG = new String[] {""} ;
      BC00133_n522TBM02_DEL_FLG = new boolean[] {false} ;
      BC00133_A525TBM02_CRT_PROG_NM = new String[] {""} ;
      BC00133_n525TBM02_CRT_PROG_NM = new boolean[] {false} ;
      BC00133_A528TBM02_UPD_PROG_NM = new String[] {""} ;
      BC00133_n528TBM02_UPD_PROG_NM = new boolean[] {false} ;
      sMode38 = "" ;
      BC00132_A516TBM02_DOM_CD = new String[] {""} ;
      BC00132_A523TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00132_n523TBM02_CRT_DATETIME = new boolean[] {false} ;
      BC00132_A524TBM02_CRT_USER_ID = new String[] {""} ;
      BC00132_n524TBM02_CRT_USER_ID = new boolean[] {false} ;
      BC00132_A526TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00132_n526TBM02_UPD_DATETIME = new boolean[] {false} ;
      BC00132_A527TBM02_UPD_USER_ID = new String[] {""} ;
      BC00132_n527TBM02_UPD_USER_ID = new boolean[] {false} ;
      BC00132_A529TBM02_UPD_CNT = new long[1] ;
      BC00132_n529TBM02_UPD_CNT = new boolean[] {false} ;
      BC00132_A517TBM02_DOM_ENM = new String[] {""} ;
      BC00132_n517TBM02_DOM_ENM = new boolean[] {false} ;
      BC00132_A518TBM02_DOM_JNM = new String[] {""} ;
      BC00132_n518TBM02_DOM_JNM = new boolean[] {false} ;
      BC00132_A519TBM02_DOM_GRP_NM = new String[] {""} ;
      BC00132_n519TBM02_DOM_GRP_NM = new boolean[] {false} ;
      BC00132_A520TBM02_NOTE = new String[] {""} ;
      BC00132_n520TBM02_NOTE = new boolean[] {false} ;
      BC00132_A521TBM02_ORDER = new int[1] ;
      BC00132_n521TBM02_ORDER = new boolean[] {false} ;
      BC00132_A522TBM02_DEL_FLG = new String[] {""} ;
      BC00132_n522TBM02_DEL_FLG = new boolean[] {false} ;
      BC00132_A525TBM02_CRT_PROG_NM = new String[] {""} ;
      BC00132_n525TBM02_CRT_PROG_NM = new boolean[] {false} ;
      BC00132_A528TBM02_UPD_PROG_NM = new String[] {""} ;
      BC00132_n528TBM02_UPD_PROG_NM = new boolean[] {false} ;
      BC00139_A162TBM03_DOM_CD = new String[] {""} ;
      BC00139_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      BC001310_A516TBM02_DOM_CD = new String[] {""} ;
      BC001310_A523TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001310_n523TBM02_CRT_DATETIME = new boolean[] {false} ;
      BC001310_A524TBM02_CRT_USER_ID = new String[] {""} ;
      BC001310_n524TBM02_CRT_USER_ID = new boolean[] {false} ;
      BC001310_A526TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001310_n526TBM02_UPD_DATETIME = new boolean[] {false} ;
      BC001310_A527TBM02_UPD_USER_ID = new String[] {""} ;
      BC001310_n527TBM02_UPD_USER_ID = new boolean[] {false} ;
      BC001310_A529TBM02_UPD_CNT = new long[1] ;
      BC001310_n529TBM02_UPD_CNT = new boolean[] {false} ;
      BC001310_A517TBM02_DOM_ENM = new String[] {""} ;
      BC001310_n517TBM02_DOM_ENM = new boolean[] {false} ;
      BC001310_A518TBM02_DOM_JNM = new String[] {""} ;
      BC001310_n518TBM02_DOM_JNM = new boolean[] {false} ;
      BC001310_A519TBM02_DOM_GRP_NM = new String[] {""} ;
      BC001310_n519TBM02_DOM_GRP_NM = new boolean[] {false} ;
      BC001310_A520TBM02_NOTE = new String[] {""} ;
      BC001310_n520TBM02_NOTE = new boolean[] {false} ;
      BC001310_A521TBM02_ORDER = new int[1] ;
      BC001310_n521TBM02_ORDER = new boolean[] {false} ;
      BC001310_A522TBM02_DEL_FLG = new String[] {""} ;
      BC001310_n522TBM02_DEL_FLG = new boolean[] {false} ;
      BC001310_A525TBM02_CRT_PROG_NM = new String[] {""} ;
      BC001310_n525TBM02_CRT_PROG_NM = new boolean[] {false} ;
      BC001310_A528TBM02_UPD_PROG_NM = new String[] {""} ;
      BC001310_n528TBM02_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm02_cdisc_domain_bc__default(),
         new Object[] {
             new Object[] {
            BC00132_A516TBM02_DOM_CD, BC00132_A523TBM02_CRT_DATETIME, BC00132_n523TBM02_CRT_DATETIME, BC00132_A524TBM02_CRT_USER_ID, BC00132_n524TBM02_CRT_USER_ID, BC00132_A526TBM02_UPD_DATETIME, BC00132_n526TBM02_UPD_DATETIME, BC00132_A527TBM02_UPD_USER_ID, BC00132_n527TBM02_UPD_USER_ID, BC00132_A529TBM02_UPD_CNT,
            BC00132_n529TBM02_UPD_CNT, BC00132_A517TBM02_DOM_ENM, BC00132_n517TBM02_DOM_ENM, BC00132_A518TBM02_DOM_JNM, BC00132_n518TBM02_DOM_JNM, BC00132_A519TBM02_DOM_GRP_NM, BC00132_n519TBM02_DOM_GRP_NM, BC00132_A520TBM02_NOTE, BC00132_n520TBM02_NOTE, BC00132_A521TBM02_ORDER,
            BC00132_n521TBM02_ORDER, BC00132_A522TBM02_DEL_FLG, BC00132_n522TBM02_DEL_FLG, BC00132_A525TBM02_CRT_PROG_NM, BC00132_n525TBM02_CRT_PROG_NM, BC00132_A528TBM02_UPD_PROG_NM, BC00132_n528TBM02_UPD_PROG_NM
            }
            , new Object[] {
            BC00133_A516TBM02_DOM_CD, BC00133_A523TBM02_CRT_DATETIME, BC00133_n523TBM02_CRT_DATETIME, BC00133_A524TBM02_CRT_USER_ID, BC00133_n524TBM02_CRT_USER_ID, BC00133_A526TBM02_UPD_DATETIME, BC00133_n526TBM02_UPD_DATETIME, BC00133_A527TBM02_UPD_USER_ID, BC00133_n527TBM02_UPD_USER_ID, BC00133_A529TBM02_UPD_CNT,
            BC00133_n529TBM02_UPD_CNT, BC00133_A517TBM02_DOM_ENM, BC00133_n517TBM02_DOM_ENM, BC00133_A518TBM02_DOM_JNM, BC00133_n518TBM02_DOM_JNM, BC00133_A519TBM02_DOM_GRP_NM, BC00133_n519TBM02_DOM_GRP_NM, BC00133_A520TBM02_NOTE, BC00133_n520TBM02_NOTE, BC00133_A521TBM02_ORDER,
            BC00133_n521TBM02_ORDER, BC00133_A522TBM02_DEL_FLG, BC00133_n522TBM02_DEL_FLG, BC00133_A525TBM02_CRT_PROG_NM, BC00133_n525TBM02_CRT_PROG_NM, BC00133_A528TBM02_UPD_PROG_NM, BC00133_n528TBM02_UPD_PROG_NM
            }
            , new Object[] {
            BC00134_A516TBM02_DOM_CD, BC00134_A523TBM02_CRT_DATETIME, BC00134_n523TBM02_CRT_DATETIME, BC00134_A524TBM02_CRT_USER_ID, BC00134_n524TBM02_CRT_USER_ID, BC00134_A526TBM02_UPD_DATETIME, BC00134_n526TBM02_UPD_DATETIME, BC00134_A527TBM02_UPD_USER_ID, BC00134_n527TBM02_UPD_USER_ID, BC00134_A529TBM02_UPD_CNT,
            BC00134_n529TBM02_UPD_CNT, BC00134_A517TBM02_DOM_ENM, BC00134_n517TBM02_DOM_ENM, BC00134_A518TBM02_DOM_JNM, BC00134_n518TBM02_DOM_JNM, BC00134_A519TBM02_DOM_GRP_NM, BC00134_n519TBM02_DOM_GRP_NM, BC00134_A520TBM02_NOTE, BC00134_n520TBM02_NOTE, BC00134_A521TBM02_ORDER,
            BC00134_n521TBM02_ORDER, BC00134_A522TBM02_DEL_FLG, BC00134_n522TBM02_DEL_FLG, BC00134_A525TBM02_CRT_PROG_NM, BC00134_n525TBM02_CRT_PROG_NM, BC00134_A528TBM02_UPD_PROG_NM, BC00134_n528TBM02_UPD_PROG_NM
            }
            , new Object[] {
            BC00135_A516TBM02_DOM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00139_A162TBM03_DOM_CD, BC00139_A163TBM03_DOM_VAR_NM
            }
            , new Object[] {
            BC001310_A516TBM02_DOM_CD, BC001310_A523TBM02_CRT_DATETIME, BC001310_n523TBM02_CRT_DATETIME, BC001310_A524TBM02_CRT_USER_ID, BC001310_n524TBM02_CRT_USER_ID, BC001310_A526TBM02_UPD_DATETIME, BC001310_n526TBM02_UPD_DATETIME, BC001310_A527TBM02_UPD_USER_ID, BC001310_n527TBM02_UPD_USER_ID, BC001310_A529TBM02_UPD_CNT,
            BC001310_n529TBM02_UPD_CNT, BC001310_A517TBM02_DOM_ENM, BC001310_n517TBM02_DOM_ENM, BC001310_A518TBM02_DOM_JNM, BC001310_n518TBM02_DOM_JNM, BC001310_A519TBM02_DOM_GRP_NM, BC001310_n519TBM02_DOM_GRP_NM, BC001310_A520TBM02_NOTE, BC001310_n520TBM02_NOTE, BC001310_A521TBM02_ORDER,
            BC001310_n521TBM02_ORDER, BC001310_A522TBM02_DEL_FLG, BC001310_n522TBM02_DEL_FLG, BC001310_A525TBM02_CRT_PROG_NM, BC001310_n525TBM02_CRT_PROG_NM, BC001310_A528TBM02_UPD_PROG_NM, BC001310_n528TBM02_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM02_CDISC_DOMAIN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11132 */
      e11132 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_N ;
   private byte gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound38 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A521TBM02_ORDER ;
   private int gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order_Z ;
   private int GX_JID ;
   private int Z521TBM02_ORDER ;
   private int GXActiveErrHndl ;
   private long A529TBM02_UPD_CNT ;
   private long gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_cnt_Z ;
   private long Z529TBM02_UPD_CNT ;
   private long O529TBM02_UPD_CNT ;
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
   private java.util.Date A523TBM02_CRT_DATETIME ;
   private java.util.Date A526TBM02_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_datetime_Z ;
   private java.util.Date Z523TBM02_CRT_DATETIME ;
   private java.util.Date Z526TBM02_UPD_DATETIME ;
   private boolean n523TBM02_CRT_DATETIME ;
   private boolean n524TBM02_CRT_USER_ID ;
   private boolean n526TBM02_UPD_DATETIME ;
   private boolean n527TBM02_UPD_USER_ID ;
   private boolean n529TBM02_UPD_CNT ;
   private boolean n517TBM02_DOM_ENM ;
   private boolean n518TBM02_DOM_JNM ;
   private boolean n519TBM02_DOM_GRP_NM ;
   private boolean n520TBM02_NOTE ;
   private boolean n521TBM02_ORDER ;
   private boolean n522TBM02_DEL_FLG ;
   private boolean n525TBM02_CRT_PROG_NM ;
   private boolean n528TBM02_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z516TBM02_DOM_CD ;
   private String A516TBM02_DOM_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A517TBM02_DOM_ENM ;
   private String A518TBM02_DOM_JNM ;
   private String A519TBM02_DOM_GRP_NM ;
   private String A520TBM02_NOTE ;
   private String A522TBM02_DEL_FLG ;
   private String A524TBM02_CRT_USER_ID ;
   private String A525TBM02_CRT_PROG_NM ;
   private String A527TBM02_UPD_USER_ID ;
   private String A528TBM02_UPD_PROG_NM ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_user_id_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_user_id_Z ;
   private String gxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm_Z ;
   private String Z524TBM02_CRT_USER_ID ;
   private String Z527TBM02_UPD_USER_ID ;
   private String Z517TBM02_DOM_ENM ;
   private String Z518TBM02_DOM_JNM ;
   private String Z519TBM02_DOM_GRP_NM ;
   private String Z520TBM02_NOTE ;
   private String Z522TBM02_DEL_FLG ;
   private String Z525TBM02_CRT_PROG_NM ;
   private String Z528TBM02_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM02_CDISC_DOMAIN bcTBM02_CDISC_DOMAIN ;
   private IDataStoreProvider pr_default ;
   private String[] BC00134_A516TBM02_DOM_CD ;
   private java.util.Date[] BC00134_A523TBM02_CRT_DATETIME ;
   private boolean[] BC00134_n523TBM02_CRT_DATETIME ;
   private String[] BC00134_A524TBM02_CRT_USER_ID ;
   private boolean[] BC00134_n524TBM02_CRT_USER_ID ;
   private java.util.Date[] BC00134_A526TBM02_UPD_DATETIME ;
   private boolean[] BC00134_n526TBM02_UPD_DATETIME ;
   private String[] BC00134_A527TBM02_UPD_USER_ID ;
   private boolean[] BC00134_n527TBM02_UPD_USER_ID ;
   private long[] BC00134_A529TBM02_UPD_CNT ;
   private boolean[] BC00134_n529TBM02_UPD_CNT ;
   private String[] BC00134_A517TBM02_DOM_ENM ;
   private boolean[] BC00134_n517TBM02_DOM_ENM ;
   private String[] BC00134_A518TBM02_DOM_JNM ;
   private boolean[] BC00134_n518TBM02_DOM_JNM ;
   private String[] BC00134_A519TBM02_DOM_GRP_NM ;
   private boolean[] BC00134_n519TBM02_DOM_GRP_NM ;
   private String[] BC00134_A520TBM02_NOTE ;
   private boolean[] BC00134_n520TBM02_NOTE ;
   private int[] BC00134_A521TBM02_ORDER ;
   private boolean[] BC00134_n521TBM02_ORDER ;
   private String[] BC00134_A522TBM02_DEL_FLG ;
   private boolean[] BC00134_n522TBM02_DEL_FLG ;
   private String[] BC00134_A525TBM02_CRT_PROG_NM ;
   private boolean[] BC00134_n525TBM02_CRT_PROG_NM ;
   private String[] BC00134_A528TBM02_UPD_PROG_NM ;
   private boolean[] BC00134_n528TBM02_UPD_PROG_NM ;
   private String[] BC00135_A516TBM02_DOM_CD ;
   private String[] BC00133_A516TBM02_DOM_CD ;
   private java.util.Date[] BC00133_A523TBM02_CRT_DATETIME ;
   private boolean[] BC00133_n523TBM02_CRT_DATETIME ;
   private String[] BC00133_A524TBM02_CRT_USER_ID ;
   private boolean[] BC00133_n524TBM02_CRT_USER_ID ;
   private java.util.Date[] BC00133_A526TBM02_UPD_DATETIME ;
   private boolean[] BC00133_n526TBM02_UPD_DATETIME ;
   private String[] BC00133_A527TBM02_UPD_USER_ID ;
   private boolean[] BC00133_n527TBM02_UPD_USER_ID ;
   private long[] BC00133_A529TBM02_UPD_CNT ;
   private boolean[] BC00133_n529TBM02_UPD_CNT ;
   private String[] BC00133_A517TBM02_DOM_ENM ;
   private boolean[] BC00133_n517TBM02_DOM_ENM ;
   private String[] BC00133_A518TBM02_DOM_JNM ;
   private boolean[] BC00133_n518TBM02_DOM_JNM ;
   private String[] BC00133_A519TBM02_DOM_GRP_NM ;
   private boolean[] BC00133_n519TBM02_DOM_GRP_NM ;
   private String[] BC00133_A520TBM02_NOTE ;
   private boolean[] BC00133_n520TBM02_NOTE ;
   private int[] BC00133_A521TBM02_ORDER ;
   private boolean[] BC00133_n521TBM02_ORDER ;
   private String[] BC00133_A522TBM02_DEL_FLG ;
   private boolean[] BC00133_n522TBM02_DEL_FLG ;
   private String[] BC00133_A525TBM02_CRT_PROG_NM ;
   private boolean[] BC00133_n525TBM02_CRT_PROG_NM ;
   private String[] BC00133_A528TBM02_UPD_PROG_NM ;
   private boolean[] BC00133_n528TBM02_UPD_PROG_NM ;
   private String[] BC00132_A516TBM02_DOM_CD ;
   private java.util.Date[] BC00132_A523TBM02_CRT_DATETIME ;
   private boolean[] BC00132_n523TBM02_CRT_DATETIME ;
   private String[] BC00132_A524TBM02_CRT_USER_ID ;
   private boolean[] BC00132_n524TBM02_CRT_USER_ID ;
   private java.util.Date[] BC00132_A526TBM02_UPD_DATETIME ;
   private boolean[] BC00132_n526TBM02_UPD_DATETIME ;
   private String[] BC00132_A527TBM02_UPD_USER_ID ;
   private boolean[] BC00132_n527TBM02_UPD_USER_ID ;
   private long[] BC00132_A529TBM02_UPD_CNT ;
   private boolean[] BC00132_n529TBM02_UPD_CNT ;
   private String[] BC00132_A517TBM02_DOM_ENM ;
   private boolean[] BC00132_n517TBM02_DOM_ENM ;
   private String[] BC00132_A518TBM02_DOM_JNM ;
   private boolean[] BC00132_n518TBM02_DOM_JNM ;
   private String[] BC00132_A519TBM02_DOM_GRP_NM ;
   private boolean[] BC00132_n519TBM02_DOM_GRP_NM ;
   private String[] BC00132_A520TBM02_NOTE ;
   private boolean[] BC00132_n520TBM02_NOTE ;
   private int[] BC00132_A521TBM02_ORDER ;
   private boolean[] BC00132_n521TBM02_ORDER ;
   private String[] BC00132_A522TBM02_DEL_FLG ;
   private boolean[] BC00132_n522TBM02_DEL_FLG ;
   private String[] BC00132_A525TBM02_CRT_PROG_NM ;
   private boolean[] BC00132_n525TBM02_CRT_PROG_NM ;
   private String[] BC00132_A528TBM02_UPD_PROG_NM ;
   private boolean[] BC00132_n528TBM02_UPD_PROG_NM ;
   private String[] BC00139_A162TBM03_DOM_CD ;
   private String[] BC00139_A163TBM03_DOM_VAR_NM ;
   private String[] BC001310_A516TBM02_DOM_CD ;
   private java.util.Date[] BC001310_A523TBM02_CRT_DATETIME ;
   private boolean[] BC001310_n523TBM02_CRT_DATETIME ;
   private String[] BC001310_A524TBM02_CRT_USER_ID ;
   private boolean[] BC001310_n524TBM02_CRT_USER_ID ;
   private java.util.Date[] BC001310_A526TBM02_UPD_DATETIME ;
   private boolean[] BC001310_n526TBM02_UPD_DATETIME ;
   private String[] BC001310_A527TBM02_UPD_USER_ID ;
   private boolean[] BC001310_n527TBM02_UPD_USER_ID ;
   private long[] BC001310_A529TBM02_UPD_CNT ;
   private boolean[] BC001310_n529TBM02_UPD_CNT ;
   private String[] BC001310_A517TBM02_DOM_ENM ;
   private boolean[] BC001310_n517TBM02_DOM_ENM ;
   private String[] BC001310_A518TBM02_DOM_JNM ;
   private boolean[] BC001310_n518TBM02_DOM_JNM ;
   private String[] BC001310_A519TBM02_DOM_GRP_NM ;
   private boolean[] BC001310_n519TBM02_DOM_GRP_NM ;
   private String[] BC001310_A520TBM02_NOTE ;
   private boolean[] BC001310_n520TBM02_NOTE ;
   private int[] BC001310_A521TBM02_ORDER ;
   private boolean[] BC001310_n521TBM02_ORDER ;
   private String[] BC001310_A522TBM02_DEL_FLG ;
   private boolean[] BC001310_n522TBM02_DEL_FLG ;
   private String[] BC001310_A525TBM02_CRT_PROG_NM ;
   private boolean[] BC001310_n525TBM02_CRT_PROG_NM ;
   private String[] BC001310_A528TBM02_UPD_PROG_NM ;
   private boolean[] BC001310_n528TBM02_UPD_PROG_NM ;
}

final  class tbm02_cdisc_domain_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00132", "SELECT `TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00133", "SELECT `TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00134", "SELECT TM1.`TBM02_DOM_CD`, TM1.`TBM02_CRT_DATETIME`, TM1.`TBM02_CRT_USER_ID`, TM1.`TBM02_UPD_DATETIME`, TM1.`TBM02_UPD_USER_ID`, TM1.`TBM02_UPD_CNT`, TM1.`TBM02_DOM_ENM`, TM1.`TBM02_DOM_JNM`, TM1.`TBM02_DOM_GRP_NM`, TM1.`TBM02_NOTE`, TM1.`TBM02_ORDER`, TM1.`TBM02_DEL_FLG`, TM1.`TBM02_CRT_PROG_NM`, TM1.`TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` TM1 WHERE TM1.`TBM02_DOM_CD` = ? ORDER BY TM1.`TBM02_DOM_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00135", "SELECT `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00136", "INSERT INTO `TBM02_CDISC_DOMAIN` (`TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00137", "UPDATE `TBM02_CDISC_DOMAIN` SET `TBM02_CRT_DATETIME`=?, `TBM02_CRT_USER_ID`=?, `TBM02_UPD_DATETIME`=?, `TBM02_UPD_USER_ID`=?, `TBM02_UPD_CNT`=?, `TBM02_DOM_ENM`=?, `TBM02_DOM_JNM`=?, `TBM02_DOM_GRP_NM`=?, `TBM02_NOTE`=?, `TBM02_ORDER`=?, `TBM02_DEL_FLG`=?, `TBM02_CRT_PROG_NM`=?, `TBM02_UPD_PROG_NM`=?  WHERE `TBM02_DOM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00138", "DELETE FROM `TBM02_CDISC_DOMAIN`  WHERE `TBM02_DOM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00139", "SELECT `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC001310", "SELECT TM1.`TBM02_DOM_CD`, TM1.`TBM02_CRT_DATETIME`, TM1.`TBM02_CRT_USER_ID`, TM1.`TBM02_UPD_DATETIME`, TM1.`TBM02_UPD_USER_ID`, TM1.`TBM02_UPD_CNT`, TM1.`TBM02_DOM_ENM`, TM1.`TBM02_DOM_JNM`, TM1.`TBM02_DOM_GRP_NM`, TM1.`TBM02_NOTE`, TM1.`TBM02_ORDER`, TM1.`TBM02_DEL_FLG`, TM1.`TBM02_CRT_PROG_NM`, TM1.`TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` TM1 WHERE TM1.`TBM02_DOM_CD` = ? ORDER BY TM1.`TBM02_DOM_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
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
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
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
               stmt.setVarchar(14, (String)parms[26], 2, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
      }
   }

}

