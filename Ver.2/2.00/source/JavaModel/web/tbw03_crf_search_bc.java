/*
               File: tbw03_crf_search_bc
        Description: CRF検索ワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:20.40
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw03_crf_search_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbw03_crf_search_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw03_crf_search_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw03_crf_search_bc.class ));
   }

   public tbw03_crf_search_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1641( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1641( ) ;
      standaloneModal( ) ;
      addRow1641( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z110TBW03_SESSION_ID = A110TBW03_SESSION_ID ;
            Z111TBW03_APP_ID = A111TBW03_APP_ID ;
            Z112TBW03_DISP_DATETIME = A112TBW03_DISP_DATETIME ;
            Z113TBW03_STUDY_ID = A113TBW03_STUDY_ID ;
            Z114TBW03_SUBJECT_ID = A114TBW03_SUBJECT_ID ;
            Z115TBW03_CRF_ID = A115TBW03_CRF_ID ;
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

   public void confirm_160( )
   {
      beforeValidate1641( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1641( ) ;
         }
         else
         {
            checkExtendedTable1641( ) ;
            if ( AnyError == 0 )
            {
               zm1641( 9) ;
               zm1641( 10) ;
               zm1641( 11) ;
               zm1641( 12) ;
               zm1641( 13) ;
               zm1641( 14) ;
               zm1641( 15) ;
               zm1641( 16) ;
            }
            closeExtendedTableCursors1641( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11162( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      AV7W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm1641( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z715TBW03_OUTER_SUBJECT_ID = A715TBW03_OUTER_SUBJECT_ID ;
         Z716TBW03_CRF_LATEST_VERSION = A716TBW03_CRF_LATEST_VERSION ;
         Z717TBW03_CRF_INPUT_LEVEL = A717TBW03_CRF_INPUT_LEVEL ;
         Z718TBW03_LOCK_FLG = A718TBW03_LOCK_FLG ;
         Z719TBW03_LOCK_DATETIME = A719TBW03_LOCK_DATETIME ;
         Z721TBW03_LOCK_AUTH_CD = A721TBW03_LOCK_AUTH_CD ;
         Z722TBW03_UPLOAD_DATETIME = A722TBW03_UPLOAD_DATETIME ;
         Z724TBW03_UPLOAD_AUTH_CD = A724TBW03_UPLOAD_AUTH_CD ;
         Z725TBW03_DM_ARRIVAL_FLG = A725TBW03_DM_ARRIVAL_FLG ;
         Z726TBW03_DM_ARRIVAL_DATETIME = A726TBW03_DM_ARRIVAL_DATETIME ;
         Z727TBW03_APPROVAL_FLG = A727TBW03_APPROVAL_FLG ;
         Z728TBW03_APPROVAL_DATETIME = A728TBW03_APPROVAL_DATETIME ;
         Z730TBW03_APPROVAL_AUTH_CD = A730TBW03_APPROVAL_AUTH_CD ;
         Z731TBW03_INPUT_END_FLG = A731TBW03_INPUT_END_FLG ;
         Z732TBW03_INPUT_END_DATETIME = A732TBW03_INPUT_END_DATETIME ;
         Z734TBW03_INPUT_END_AUTH_CD = A734TBW03_INPUT_END_AUTH_CD ;
         Z780TBW03_DEL_FLG = A780TBW03_DEL_FLG ;
         Z781TBW03_CRT_DATETIME = A781TBW03_CRT_DATETIME ;
         Z783TBW03_CRT_PROG_NM = A783TBW03_CRT_PROG_NM ;
         Z784TBW03_UPD_DATETIME = A784TBW03_UPD_DATETIME ;
         Z786TBW03_UPD_PROG_NM = A786TBW03_UPD_PROG_NM ;
         Z787TBW03_UPD_CNT = A787TBW03_UPD_CNT ;
         Z120TBW03_SITE_ID = A120TBW03_SITE_ID ;
         Z116TBW03_LOCK_USER_ID = A116TBW03_LOCK_USER_ID ;
         Z117TBW03_UPLOAD_USER_ID = A117TBW03_UPLOAD_USER_ID ;
         Z118TBW03_APPROVAL_USER_ID = A118TBW03_APPROVAL_USER_ID ;
         Z119TBW03_INPUT_END_USER_ID = A119TBW03_INPUT_END_USER_ID ;
         Z121TBW03_CRT_USER_ID = A121TBW03_CRT_USER_ID ;
         Z122TBW03_UPD_USER_ID = A122TBW03_UPD_USER_ID ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         Z710TBW03_CRF_NM = A710TBW03_CRF_NM ;
         Z711TBW03_CRF_SNM = A711TBW03_CRF_SNM ;
         Z712TBW03_CRF_ORDER = A712TBW03_CRF_ORDER ;
      }
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         Z713TBW03_SITE_NM = A713TBW03_SITE_NM ;
         Z714TBW03_SITE_RYAK_NM = A714TBW03_SITE_RYAK_NM ;
      }
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         Z720TBW03_LOCK_USER_NM = A720TBW03_LOCK_USER_NM ;
      }
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         Z723TBW03_UPLOAD_USER_NM = A723TBW03_UPLOAD_USER_NM ;
      }
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         Z729TBW03_APPROVAL_USER_NM = A729TBW03_APPROVAL_USER_NM ;
      }
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         Z733TBW03_INPUT_END_USER_NM = A733TBW03_INPUT_END_USER_NM ;
      }
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         Z782TBW03_CRT_USER_NM = A782TBW03_CRT_USER_NM ;
      }
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         Z785TBW03_UPD_USER_NM = A785TBW03_UPD_USER_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z110TBW03_SESSION_ID = A110TBW03_SESSION_ID ;
         Z111TBW03_APP_ID = A111TBW03_APP_ID ;
         Z112TBW03_DISP_DATETIME = A112TBW03_DISP_DATETIME ;
         Z114TBW03_SUBJECT_ID = A114TBW03_SUBJECT_ID ;
         Z715TBW03_OUTER_SUBJECT_ID = A715TBW03_OUTER_SUBJECT_ID ;
         Z716TBW03_CRF_LATEST_VERSION = A716TBW03_CRF_LATEST_VERSION ;
         Z717TBW03_CRF_INPUT_LEVEL = A717TBW03_CRF_INPUT_LEVEL ;
         Z718TBW03_LOCK_FLG = A718TBW03_LOCK_FLG ;
         Z719TBW03_LOCK_DATETIME = A719TBW03_LOCK_DATETIME ;
         Z721TBW03_LOCK_AUTH_CD = A721TBW03_LOCK_AUTH_CD ;
         Z722TBW03_UPLOAD_DATETIME = A722TBW03_UPLOAD_DATETIME ;
         Z724TBW03_UPLOAD_AUTH_CD = A724TBW03_UPLOAD_AUTH_CD ;
         Z725TBW03_DM_ARRIVAL_FLG = A725TBW03_DM_ARRIVAL_FLG ;
         Z726TBW03_DM_ARRIVAL_DATETIME = A726TBW03_DM_ARRIVAL_DATETIME ;
         Z727TBW03_APPROVAL_FLG = A727TBW03_APPROVAL_FLG ;
         Z728TBW03_APPROVAL_DATETIME = A728TBW03_APPROVAL_DATETIME ;
         Z730TBW03_APPROVAL_AUTH_CD = A730TBW03_APPROVAL_AUTH_CD ;
         Z731TBW03_INPUT_END_FLG = A731TBW03_INPUT_END_FLG ;
         Z732TBW03_INPUT_END_DATETIME = A732TBW03_INPUT_END_DATETIME ;
         Z734TBW03_INPUT_END_AUTH_CD = A734TBW03_INPUT_END_AUTH_CD ;
         Z780TBW03_DEL_FLG = A780TBW03_DEL_FLG ;
         Z781TBW03_CRT_DATETIME = A781TBW03_CRT_DATETIME ;
         Z783TBW03_CRT_PROG_NM = A783TBW03_CRT_PROG_NM ;
         Z784TBW03_UPD_DATETIME = A784TBW03_UPD_DATETIME ;
         Z786TBW03_UPD_PROG_NM = A786TBW03_UPD_PROG_NM ;
         Z787TBW03_UPD_CNT = A787TBW03_UPD_CNT ;
         Z113TBW03_STUDY_ID = A113TBW03_STUDY_ID ;
         Z115TBW03_CRF_ID = A115TBW03_CRF_ID ;
         Z120TBW03_SITE_ID = A120TBW03_SITE_ID ;
         Z116TBW03_LOCK_USER_ID = A116TBW03_LOCK_USER_ID ;
         Z117TBW03_UPLOAD_USER_ID = A117TBW03_UPLOAD_USER_ID ;
         Z118TBW03_APPROVAL_USER_ID = A118TBW03_APPROVAL_USER_ID ;
         Z119TBW03_INPUT_END_USER_ID = A119TBW03_INPUT_END_USER_ID ;
         Z121TBW03_CRT_USER_ID = A121TBW03_CRT_USER_ID ;
         Z122TBW03_UPD_USER_ID = A122TBW03_UPD_USER_ID ;
         Z710TBW03_CRF_NM = A710TBW03_CRF_NM ;
         Z711TBW03_CRF_SNM = A711TBW03_CRF_SNM ;
         Z712TBW03_CRF_ORDER = A712TBW03_CRF_ORDER ;
         Z713TBW03_SITE_NM = A713TBW03_SITE_NM ;
         Z714TBW03_SITE_RYAK_NM = A714TBW03_SITE_RYAK_NM ;
         Z720TBW03_LOCK_USER_NM = A720TBW03_LOCK_USER_NM ;
         Z723TBW03_UPLOAD_USER_NM = A723TBW03_UPLOAD_USER_NM ;
         Z729TBW03_APPROVAL_USER_NM = A729TBW03_APPROVAL_USER_NM ;
         Z733TBW03_INPUT_END_USER_NM = A733TBW03_INPUT_END_USER_NM ;
         Z782TBW03_CRT_USER_NM = A782TBW03_CRT_USER_NM ;
         Z785TBW03_UPD_USER_NM = A785TBW03_UPD_USER_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1641( )
   {
      /* Using cursor BC001612 */
      pr_default.execute(10, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A710TBW03_CRF_NM = BC001612_A710TBW03_CRF_NM[0] ;
         n710TBW03_CRF_NM = BC001612_n710TBW03_CRF_NM[0] ;
         A711TBW03_CRF_SNM = BC001612_A711TBW03_CRF_SNM[0] ;
         n711TBW03_CRF_SNM = BC001612_n711TBW03_CRF_SNM[0] ;
         A712TBW03_CRF_ORDER = BC001612_A712TBW03_CRF_ORDER[0] ;
         n712TBW03_CRF_ORDER = BC001612_n712TBW03_CRF_ORDER[0] ;
         A713TBW03_SITE_NM = BC001612_A713TBW03_SITE_NM[0] ;
         n713TBW03_SITE_NM = BC001612_n713TBW03_SITE_NM[0] ;
         A714TBW03_SITE_RYAK_NM = BC001612_A714TBW03_SITE_RYAK_NM[0] ;
         n714TBW03_SITE_RYAK_NM = BC001612_n714TBW03_SITE_RYAK_NM[0] ;
         A715TBW03_OUTER_SUBJECT_ID = BC001612_A715TBW03_OUTER_SUBJECT_ID[0] ;
         n715TBW03_OUTER_SUBJECT_ID = BC001612_n715TBW03_OUTER_SUBJECT_ID[0] ;
         A716TBW03_CRF_LATEST_VERSION = BC001612_A716TBW03_CRF_LATEST_VERSION[0] ;
         n716TBW03_CRF_LATEST_VERSION = BC001612_n716TBW03_CRF_LATEST_VERSION[0] ;
         A717TBW03_CRF_INPUT_LEVEL = BC001612_A717TBW03_CRF_INPUT_LEVEL[0] ;
         n717TBW03_CRF_INPUT_LEVEL = BC001612_n717TBW03_CRF_INPUT_LEVEL[0] ;
         A718TBW03_LOCK_FLG = BC001612_A718TBW03_LOCK_FLG[0] ;
         n718TBW03_LOCK_FLG = BC001612_n718TBW03_LOCK_FLG[0] ;
         A719TBW03_LOCK_DATETIME = BC001612_A719TBW03_LOCK_DATETIME[0] ;
         n719TBW03_LOCK_DATETIME = BC001612_n719TBW03_LOCK_DATETIME[0] ;
         A720TBW03_LOCK_USER_NM = BC001612_A720TBW03_LOCK_USER_NM[0] ;
         n720TBW03_LOCK_USER_NM = BC001612_n720TBW03_LOCK_USER_NM[0] ;
         A721TBW03_LOCK_AUTH_CD = BC001612_A721TBW03_LOCK_AUTH_CD[0] ;
         n721TBW03_LOCK_AUTH_CD = BC001612_n721TBW03_LOCK_AUTH_CD[0] ;
         A722TBW03_UPLOAD_DATETIME = BC001612_A722TBW03_UPLOAD_DATETIME[0] ;
         n722TBW03_UPLOAD_DATETIME = BC001612_n722TBW03_UPLOAD_DATETIME[0] ;
         A723TBW03_UPLOAD_USER_NM = BC001612_A723TBW03_UPLOAD_USER_NM[0] ;
         n723TBW03_UPLOAD_USER_NM = BC001612_n723TBW03_UPLOAD_USER_NM[0] ;
         A724TBW03_UPLOAD_AUTH_CD = BC001612_A724TBW03_UPLOAD_AUTH_CD[0] ;
         n724TBW03_UPLOAD_AUTH_CD = BC001612_n724TBW03_UPLOAD_AUTH_CD[0] ;
         A725TBW03_DM_ARRIVAL_FLG = BC001612_A725TBW03_DM_ARRIVAL_FLG[0] ;
         n725TBW03_DM_ARRIVAL_FLG = BC001612_n725TBW03_DM_ARRIVAL_FLG[0] ;
         A726TBW03_DM_ARRIVAL_DATETIME = BC001612_A726TBW03_DM_ARRIVAL_DATETIME[0] ;
         n726TBW03_DM_ARRIVAL_DATETIME = BC001612_n726TBW03_DM_ARRIVAL_DATETIME[0] ;
         A727TBW03_APPROVAL_FLG = BC001612_A727TBW03_APPROVAL_FLG[0] ;
         n727TBW03_APPROVAL_FLG = BC001612_n727TBW03_APPROVAL_FLG[0] ;
         A728TBW03_APPROVAL_DATETIME = BC001612_A728TBW03_APPROVAL_DATETIME[0] ;
         n728TBW03_APPROVAL_DATETIME = BC001612_n728TBW03_APPROVAL_DATETIME[0] ;
         A729TBW03_APPROVAL_USER_NM = BC001612_A729TBW03_APPROVAL_USER_NM[0] ;
         n729TBW03_APPROVAL_USER_NM = BC001612_n729TBW03_APPROVAL_USER_NM[0] ;
         A730TBW03_APPROVAL_AUTH_CD = BC001612_A730TBW03_APPROVAL_AUTH_CD[0] ;
         n730TBW03_APPROVAL_AUTH_CD = BC001612_n730TBW03_APPROVAL_AUTH_CD[0] ;
         A731TBW03_INPUT_END_FLG = BC001612_A731TBW03_INPUT_END_FLG[0] ;
         n731TBW03_INPUT_END_FLG = BC001612_n731TBW03_INPUT_END_FLG[0] ;
         A732TBW03_INPUT_END_DATETIME = BC001612_A732TBW03_INPUT_END_DATETIME[0] ;
         n732TBW03_INPUT_END_DATETIME = BC001612_n732TBW03_INPUT_END_DATETIME[0] ;
         A733TBW03_INPUT_END_USER_NM = BC001612_A733TBW03_INPUT_END_USER_NM[0] ;
         n733TBW03_INPUT_END_USER_NM = BC001612_n733TBW03_INPUT_END_USER_NM[0] ;
         A734TBW03_INPUT_END_AUTH_CD = BC001612_A734TBW03_INPUT_END_AUTH_CD[0] ;
         n734TBW03_INPUT_END_AUTH_CD = BC001612_n734TBW03_INPUT_END_AUTH_CD[0] ;
         A780TBW03_DEL_FLG = BC001612_A780TBW03_DEL_FLG[0] ;
         n780TBW03_DEL_FLG = BC001612_n780TBW03_DEL_FLG[0] ;
         A781TBW03_CRT_DATETIME = BC001612_A781TBW03_CRT_DATETIME[0] ;
         n781TBW03_CRT_DATETIME = BC001612_n781TBW03_CRT_DATETIME[0] ;
         A782TBW03_CRT_USER_NM = BC001612_A782TBW03_CRT_USER_NM[0] ;
         n782TBW03_CRT_USER_NM = BC001612_n782TBW03_CRT_USER_NM[0] ;
         A783TBW03_CRT_PROG_NM = BC001612_A783TBW03_CRT_PROG_NM[0] ;
         n783TBW03_CRT_PROG_NM = BC001612_n783TBW03_CRT_PROG_NM[0] ;
         A784TBW03_UPD_DATETIME = BC001612_A784TBW03_UPD_DATETIME[0] ;
         n784TBW03_UPD_DATETIME = BC001612_n784TBW03_UPD_DATETIME[0] ;
         A785TBW03_UPD_USER_NM = BC001612_A785TBW03_UPD_USER_NM[0] ;
         n785TBW03_UPD_USER_NM = BC001612_n785TBW03_UPD_USER_NM[0] ;
         A786TBW03_UPD_PROG_NM = BC001612_A786TBW03_UPD_PROG_NM[0] ;
         n786TBW03_UPD_PROG_NM = BC001612_n786TBW03_UPD_PROG_NM[0] ;
         A787TBW03_UPD_CNT = BC001612_A787TBW03_UPD_CNT[0] ;
         n787TBW03_UPD_CNT = BC001612_n787TBW03_UPD_CNT[0] ;
         A120TBW03_SITE_ID = BC001612_A120TBW03_SITE_ID[0] ;
         n120TBW03_SITE_ID = BC001612_n120TBW03_SITE_ID[0] ;
         A116TBW03_LOCK_USER_ID = BC001612_A116TBW03_LOCK_USER_ID[0] ;
         n116TBW03_LOCK_USER_ID = BC001612_n116TBW03_LOCK_USER_ID[0] ;
         A117TBW03_UPLOAD_USER_ID = BC001612_A117TBW03_UPLOAD_USER_ID[0] ;
         n117TBW03_UPLOAD_USER_ID = BC001612_n117TBW03_UPLOAD_USER_ID[0] ;
         A118TBW03_APPROVAL_USER_ID = BC001612_A118TBW03_APPROVAL_USER_ID[0] ;
         n118TBW03_APPROVAL_USER_ID = BC001612_n118TBW03_APPROVAL_USER_ID[0] ;
         A119TBW03_INPUT_END_USER_ID = BC001612_A119TBW03_INPUT_END_USER_ID[0] ;
         n119TBW03_INPUT_END_USER_ID = BC001612_n119TBW03_INPUT_END_USER_ID[0] ;
         A121TBW03_CRT_USER_ID = BC001612_A121TBW03_CRT_USER_ID[0] ;
         n121TBW03_CRT_USER_ID = BC001612_n121TBW03_CRT_USER_ID[0] ;
         A122TBW03_UPD_USER_ID = BC001612_A122TBW03_UPD_USER_ID[0] ;
         n122TBW03_UPD_USER_ID = BC001612_n122TBW03_UPD_USER_ID[0] ;
         zm1641( -8) ;
      }
      pr_default.close(10);
      onLoadActions1641( ) ;
   }

   public void onLoadActions1641( )
   {
      AV8Pgmname = "TBW03_CRF_SEARCH_BC" ;
   }

   public void checkExtendedTable1641( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TBW03_CRF_SEARCH_BC" ;
      /* Using cursor BC00164 */
      pr_default.execute(2, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRF検索ワーク・CRFサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
      }
      A710TBW03_CRF_NM = BC00164_A710TBW03_CRF_NM[0] ;
      n710TBW03_CRF_NM = BC00164_n710TBW03_CRF_NM[0] ;
      A711TBW03_CRF_SNM = BC00164_A711TBW03_CRF_SNM[0] ;
      n711TBW03_CRF_SNM = BC00164_n711TBW03_CRF_SNM[0] ;
      A712TBW03_CRF_ORDER = BC00164_A712TBW03_CRF_ORDER[0] ;
      n712TBW03_CRF_ORDER = BC00164_n712TBW03_CRF_ORDER[0] ;
      pr_default.close(2);
      /* Using cursor BC00165 */
      pr_default.execute(3, new Object[] {new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A120TBW03_SITE_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・施設サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_SITE_ID");
            AnyError = (short)(1) ;
         }
      }
      A713TBW03_SITE_NM = BC00165_A713TBW03_SITE_NM[0] ;
      n713TBW03_SITE_NM = BC00165_n713TBW03_SITE_NM[0] ;
      A714TBW03_SITE_RYAK_NM = BC00165_A714TBW03_SITE_RYAK_NM[0] ;
      n714TBW03_SITE_RYAK_NM = BC00165_n714TBW03_SITE_RYAK_NM[0] ;
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A719TBW03_LOCK_DATETIME) || (( A719TBW03_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A719TBW03_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC00166 */
      pr_default.execute(4, new Object[] {new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A116TBW03_LOCK_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・ロックユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_LOCK_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      A720TBW03_LOCK_USER_NM = BC00166_A720TBW03_LOCK_USER_NM[0] ;
      n720TBW03_LOCK_USER_NM = BC00166_n720TBW03_LOCK_USER_NM[0] ;
      pr_default.close(4);
      if ( ! ( GXutil.nullDate().equals(A722TBW03_UPLOAD_DATETIME) || (( A722TBW03_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A722TBW03_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC00167 */
      pr_default.execute(5, new Object[] {new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A117TBW03_UPLOAD_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・アップロードユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_UPLOAD_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      A723TBW03_UPLOAD_USER_NM = BC00167_A723TBW03_UPLOAD_USER_NM[0] ;
      n723TBW03_UPLOAD_USER_NM = BC00167_n723TBW03_UPLOAD_USER_NM[0] ;
      pr_default.close(5);
      if ( ! ( GXutil.nullDate().equals(A726TBW03_DM_ARRIVAL_DATETIME) || (( A726TBW03_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A726TBW03_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A728TBW03_APPROVAL_DATETIME) || (( A728TBW03_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A728TBW03_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC00168 */
      pr_default.execute(6, new Object[] {new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A118TBW03_APPROVAL_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・承認ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_APPROVAL_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      A729TBW03_APPROVAL_USER_NM = BC00168_A729TBW03_APPROVAL_USER_NM[0] ;
      n729TBW03_APPROVAL_USER_NM = BC00168_n729TBW03_APPROVAL_USER_NM[0] ;
      pr_default.close(6);
      if ( ! ( GXutil.nullDate().equals(A732TBW03_INPUT_END_DATETIME) || (( A732TBW03_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A732TBW03_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC00169 */
      pr_default.execute(7, new Object[] {new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A119TBW03_INPUT_END_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・データ固定ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_INPUT_END_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      A733TBW03_INPUT_END_USER_NM = BC00169_A733TBW03_INPUT_END_USER_NM[0] ;
      n733TBW03_INPUT_END_USER_NM = BC00169_n733TBW03_INPUT_END_USER_NM[0] ;
      pr_default.close(7);
      if ( ! ( GXutil.nullDate().equals(A781TBW03_CRT_DATETIME) || (( A781TBW03_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A781TBW03_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC001610 */
      pr_default.execute(8, new Object[] {new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A121TBW03_CRT_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・作成ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_CRT_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      A782TBW03_CRT_USER_NM = BC001610_A782TBW03_CRT_USER_NM[0] ;
      n782TBW03_CRT_USER_NM = BC001610_n782TBW03_CRT_USER_NM[0] ;
      pr_default.close(8);
      if ( ! ( GXutil.nullDate().equals(A784TBW03_UPD_DATETIME) || (( A784TBW03_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A784TBW03_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC001611 */
      pr_default.execute(9, new Object[] {new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A122TBW03_UPD_USER_ID)==0) ) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・更新ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_UPD_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      A785TBW03_UPD_USER_NM = BC001611_A785TBW03_UPD_USER_NM[0] ;
      n785TBW03_UPD_USER_NM = BC001611_n785TBW03_UPD_USER_NM[0] ;
      pr_default.close(9);
   }

   public void closeExtendedTableCursors1641( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1641( )
   {
      /* Using cursor BC001613 */
      pr_default.execute(11, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound41 = (short)(1) ;
      }
      else
      {
         RcdFound41 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00163 */
      pr_default.execute(1, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1641( 8) ;
         RcdFound41 = (short)(1) ;
         A110TBW03_SESSION_ID = BC00163_A110TBW03_SESSION_ID[0] ;
         A111TBW03_APP_ID = BC00163_A111TBW03_APP_ID[0] ;
         A112TBW03_DISP_DATETIME = BC00163_A112TBW03_DISP_DATETIME[0] ;
         A114TBW03_SUBJECT_ID = BC00163_A114TBW03_SUBJECT_ID[0] ;
         A715TBW03_OUTER_SUBJECT_ID = BC00163_A715TBW03_OUTER_SUBJECT_ID[0] ;
         n715TBW03_OUTER_SUBJECT_ID = BC00163_n715TBW03_OUTER_SUBJECT_ID[0] ;
         A716TBW03_CRF_LATEST_VERSION = BC00163_A716TBW03_CRF_LATEST_VERSION[0] ;
         n716TBW03_CRF_LATEST_VERSION = BC00163_n716TBW03_CRF_LATEST_VERSION[0] ;
         A717TBW03_CRF_INPUT_LEVEL = BC00163_A717TBW03_CRF_INPUT_LEVEL[0] ;
         n717TBW03_CRF_INPUT_LEVEL = BC00163_n717TBW03_CRF_INPUT_LEVEL[0] ;
         A718TBW03_LOCK_FLG = BC00163_A718TBW03_LOCK_FLG[0] ;
         n718TBW03_LOCK_FLG = BC00163_n718TBW03_LOCK_FLG[0] ;
         A719TBW03_LOCK_DATETIME = BC00163_A719TBW03_LOCK_DATETIME[0] ;
         n719TBW03_LOCK_DATETIME = BC00163_n719TBW03_LOCK_DATETIME[0] ;
         A721TBW03_LOCK_AUTH_CD = BC00163_A721TBW03_LOCK_AUTH_CD[0] ;
         n721TBW03_LOCK_AUTH_CD = BC00163_n721TBW03_LOCK_AUTH_CD[0] ;
         A722TBW03_UPLOAD_DATETIME = BC00163_A722TBW03_UPLOAD_DATETIME[0] ;
         n722TBW03_UPLOAD_DATETIME = BC00163_n722TBW03_UPLOAD_DATETIME[0] ;
         A724TBW03_UPLOAD_AUTH_CD = BC00163_A724TBW03_UPLOAD_AUTH_CD[0] ;
         n724TBW03_UPLOAD_AUTH_CD = BC00163_n724TBW03_UPLOAD_AUTH_CD[0] ;
         A725TBW03_DM_ARRIVAL_FLG = BC00163_A725TBW03_DM_ARRIVAL_FLG[0] ;
         n725TBW03_DM_ARRIVAL_FLG = BC00163_n725TBW03_DM_ARRIVAL_FLG[0] ;
         A726TBW03_DM_ARRIVAL_DATETIME = BC00163_A726TBW03_DM_ARRIVAL_DATETIME[0] ;
         n726TBW03_DM_ARRIVAL_DATETIME = BC00163_n726TBW03_DM_ARRIVAL_DATETIME[0] ;
         A727TBW03_APPROVAL_FLG = BC00163_A727TBW03_APPROVAL_FLG[0] ;
         n727TBW03_APPROVAL_FLG = BC00163_n727TBW03_APPROVAL_FLG[0] ;
         A728TBW03_APPROVAL_DATETIME = BC00163_A728TBW03_APPROVAL_DATETIME[0] ;
         n728TBW03_APPROVAL_DATETIME = BC00163_n728TBW03_APPROVAL_DATETIME[0] ;
         A730TBW03_APPROVAL_AUTH_CD = BC00163_A730TBW03_APPROVAL_AUTH_CD[0] ;
         n730TBW03_APPROVAL_AUTH_CD = BC00163_n730TBW03_APPROVAL_AUTH_CD[0] ;
         A731TBW03_INPUT_END_FLG = BC00163_A731TBW03_INPUT_END_FLG[0] ;
         n731TBW03_INPUT_END_FLG = BC00163_n731TBW03_INPUT_END_FLG[0] ;
         A732TBW03_INPUT_END_DATETIME = BC00163_A732TBW03_INPUT_END_DATETIME[0] ;
         n732TBW03_INPUT_END_DATETIME = BC00163_n732TBW03_INPUT_END_DATETIME[0] ;
         A734TBW03_INPUT_END_AUTH_CD = BC00163_A734TBW03_INPUT_END_AUTH_CD[0] ;
         n734TBW03_INPUT_END_AUTH_CD = BC00163_n734TBW03_INPUT_END_AUTH_CD[0] ;
         A780TBW03_DEL_FLG = BC00163_A780TBW03_DEL_FLG[0] ;
         n780TBW03_DEL_FLG = BC00163_n780TBW03_DEL_FLG[0] ;
         A781TBW03_CRT_DATETIME = BC00163_A781TBW03_CRT_DATETIME[0] ;
         n781TBW03_CRT_DATETIME = BC00163_n781TBW03_CRT_DATETIME[0] ;
         A783TBW03_CRT_PROG_NM = BC00163_A783TBW03_CRT_PROG_NM[0] ;
         n783TBW03_CRT_PROG_NM = BC00163_n783TBW03_CRT_PROG_NM[0] ;
         A784TBW03_UPD_DATETIME = BC00163_A784TBW03_UPD_DATETIME[0] ;
         n784TBW03_UPD_DATETIME = BC00163_n784TBW03_UPD_DATETIME[0] ;
         A786TBW03_UPD_PROG_NM = BC00163_A786TBW03_UPD_PROG_NM[0] ;
         n786TBW03_UPD_PROG_NM = BC00163_n786TBW03_UPD_PROG_NM[0] ;
         A787TBW03_UPD_CNT = BC00163_A787TBW03_UPD_CNT[0] ;
         n787TBW03_UPD_CNT = BC00163_n787TBW03_UPD_CNT[0] ;
         A113TBW03_STUDY_ID = BC00163_A113TBW03_STUDY_ID[0] ;
         A115TBW03_CRF_ID = BC00163_A115TBW03_CRF_ID[0] ;
         A120TBW03_SITE_ID = BC00163_A120TBW03_SITE_ID[0] ;
         n120TBW03_SITE_ID = BC00163_n120TBW03_SITE_ID[0] ;
         A116TBW03_LOCK_USER_ID = BC00163_A116TBW03_LOCK_USER_ID[0] ;
         n116TBW03_LOCK_USER_ID = BC00163_n116TBW03_LOCK_USER_ID[0] ;
         A117TBW03_UPLOAD_USER_ID = BC00163_A117TBW03_UPLOAD_USER_ID[0] ;
         n117TBW03_UPLOAD_USER_ID = BC00163_n117TBW03_UPLOAD_USER_ID[0] ;
         A118TBW03_APPROVAL_USER_ID = BC00163_A118TBW03_APPROVAL_USER_ID[0] ;
         n118TBW03_APPROVAL_USER_ID = BC00163_n118TBW03_APPROVAL_USER_ID[0] ;
         A119TBW03_INPUT_END_USER_ID = BC00163_A119TBW03_INPUT_END_USER_ID[0] ;
         n119TBW03_INPUT_END_USER_ID = BC00163_n119TBW03_INPUT_END_USER_ID[0] ;
         A121TBW03_CRT_USER_ID = BC00163_A121TBW03_CRT_USER_ID[0] ;
         n121TBW03_CRT_USER_ID = BC00163_n121TBW03_CRT_USER_ID[0] ;
         A122TBW03_UPD_USER_ID = BC00163_A122TBW03_UPD_USER_ID[0] ;
         n122TBW03_UPD_USER_ID = BC00163_n122TBW03_UPD_USER_ID[0] ;
         Z110TBW03_SESSION_ID = A110TBW03_SESSION_ID ;
         Z111TBW03_APP_ID = A111TBW03_APP_ID ;
         Z112TBW03_DISP_DATETIME = A112TBW03_DISP_DATETIME ;
         Z113TBW03_STUDY_ID = A113TBW03_STUDY_ID ;
         Z114TBW03_SUBJECT_ID = A114TBW03_SUBJECT_ID ;
         Z115TBW03_CRF_ID = A115TBW03_CRF_ID ;
         sMode41 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1641( ) ;
         if ( AnyError == 1 )
         {
            RcdFound41 = (short)(0) ;
            initializeNonKey1641( ) ;
         }
         Gx_mode = sMode41 ;
      }
      else
      {
         RcdFound41 = (short)(0) ;
         initializeNonKey1641( ) ;
         sMode41 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode41 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1641( ) ;
      if ( RcdFound41 == 0 )
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
      confirm_160( ) ;
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

   public void checkOptimisticConcurrency1641( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00162 */
         pr_default.execute(0, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW03_CRF_SEARCH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z715TBW03_OUTER_SUBJECT_ID, BC00162_A715TBW03_OUTER_SUBJECT_ID[0]) != 0 ) || ( Z716TBW03_CRF_LATEST_VERSION != BC00162_A716TBW03_CRF_LATEST_VERSION[0] ) || ( Z717TBW03_CRF_INPUT_LEVEL != BC00162_A717TBW03_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z718TBW03_LOCK_FLG, BC00162_A718TBW03_LOCK_FLG[0]) != 0 ) || !( Z719TBW03_LOCK_DATETIME.equals( BC00162_A719TBW03_LOCK_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z721TBW03_LOCK_AUTH_CD, BC00162_A721TBW03_LOCK_AUTH_CD[0]) != 0 ) || !( Z722TBW03_UPLOAD_DATETIME.equals( BC00162_A722TBW03_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z724TBW03_UPLOAD_AUTH_CD, BC00162_A724TBW03_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z725TBW03_DM_ARRIVAL_FLG, BC00162_A725TBW03_DM_ARRIVAL_FLG[0]) != 0 ) || !( Z726TBW03_DM_ARRIVAL_DATETIME.equals( BC00162_A726TBW03_DM_ARRIVAL_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z727TBW03_APPROVAL_FLG, BC00162_A727TBW03_APPROVAL_FLG[0]) != 0 ) || !( Z728TBW03_APPROVAL_DATETIME.equals( BC00162_A728TBW03_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z730TBW03_APPROVAL_AUTH_CD, BC00162_A730TBW03_APPROVAL_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z731TBW03_INPUT_END_FLG, BC00162_A731TBW03_INPUT_END_FLG[0]) != 0 ) || !( Z732TBW03_INPUT_END_DATETIME.equals( BC00162_A732TBW03_INPUT_END_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z734TBW03_INPUT_END_AUTH_CD, BC00162_A734TBW03_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z780TBW03_DEL_FLG, BC00162_A780TBW03_DEL_FLG[0]) != 0 ) || !( Z781TBW03_CRT_DATETIME.equals( BC00162_A781TBW03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z783TBW03_CRT_PROG_NM, BC00162_A783TBW03_CRT_PROG_NM[0]) != 0 ) || !( Z784TBW03_UPD_DATETIME.equals( BC00162_A784TBW03_UPD_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z786TBW03_UPD_PROG_NM, BC00162_A786TBW03_UPD_PROG_NM[0]) != 0 ) || ( Z787TBW03_UPD_CNT != BC00162_A787TBW03_UPD_CNT[0] ) || ( GXutil.strcmp(Z120TBW03_SITE_ID, BC00162_A120TBW03_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z116TBW03_LOCK_USER_ID, BC00162_A116TBW03_LOCK_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z117TBW03_UPLOAD_USER_ID, BC00162_A117TBW03_UPLOAD_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z118TBW03_APPROVAL_USER_ID, BC00162_A118TBW03_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z119TBW03_INPUT_END_USER_ID, BC00162_A119TBW03_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z121TBW03_CRT_USER_ID, BC00162_A121TBW03_CRT_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z122TBW03_UPD_USER_ID, BC00162_A122TBW03_UPD_USER_ID[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW03_CRF_SEARCH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1641( )
   {
      beforeValidate1641( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1641( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1641( 0) ;
         checkOptimisticConcurrency1641( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1641( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1641( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001614 */
                  pr_default.execute(12, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Integer(A114TBW03_SUBJECT_ID), new Boolean(n715TBW03_OUTER_SUBJECT_ID), A715TBW03_OUTER_SUBJECT_ID, new Boolean(n716TBW03_CRF_LATEST_VERSION), new Short(A716TBW03_CRF_LATEST_VERSION), new Boolean(n717TBW03_CRF_INPUT_LEVEL), new Byte(A717TBW03_CRF_INPUT_LEVEL), new Boolean(n718TBW03_LOCK_FLG), A718TBW03_LOCK_FLG, new Boolean(n719TBW03_LOCK_DATETIME), A719TBW03_LOCK_DATETIME, new Boolean(n721TBW03_LOCK_AUTH_CD), A721TBW03_LOCK_AUTH_CD, new Boolean(n722TBW03_UPLOAD_DATETIME), A722TBW03_UPLOAD_DATETIME, new Boolean(n724TBW03_UPLOAD_AUTH_CD), A724TBW03_UPLOAD_AUTH_CD, new Boolean(n725TBW03_DM_ARRIVAL_FLG), A725TBW03_DM_ARRIVAL_FLG, new Boolean(n726TBW03_DM_ARRIVAL_DATETIME), A726TBW03_DM_ARRIVAL_DATETIME, new Boolean(n727TBW03_APPROVAL_FLG), A727TBW03_APPROVAL_FLG, new Boolean(n728TBW03_APPROVAL_DATETIME), A728TBW03_APPROVAL_DATETIME, new Boolean(n730TBW03_APPROVAL_AUTH_CD), A730TBW03_APPROVAL_AUTH_CD, new Boolean(n731TBW03_INPUT_END_FLG), A731TBW03_INPUT_END_FLG, new Boolean(n732TBW03_INPUT_END_DATETIME), A732TBW03_INPUT_END_DATETIME, new Boolean(n734TBW03_INPUT_END_AUTH_CD), A734TBW03_INPUT_END_AUTH_CD, new Boolean(n780TBW03_DEL_FLG), A780TBW03_DEL_FLG, new Boolean(n781TBW03_CRT_DATETIME), A781TBW03_CRT_DATETIME, new Boolean(n783TBW03_CRT_PROG_NM), A783TBW03_CRT_PROG_NM, new Boolean(n784TBW03_UPD_DATETIME), A784TBW03_UPD_DATETIME, new Boolean(n786TBW03_UPD_PROG_NM), A786TBW03_UPD_PROG_NM, new Boolean(n787TBW03_UPD_CNT), new Long(A787TBW03_UPD_CNT), new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID), new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID, new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID, new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID, new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID, new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID, new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID, new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW03_CRF_SEARCH") ;
                  if ( (pr_default.getStatus(12) == 1) )
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
            load1641( ) ;
         }
         endLevel1641( ) ;
      }
      closeExtendedTableCursors1641( ) ;
   }

   public void update1641( )
   {
      beforeValidate1641( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1641( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1641( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1641( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1641( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001615 */
                  pr_default.execute(13, new Object[] {new Boolean(n715TBW03_OUTER_SUBJECT_ID), A715TBW03_OUTER_SUBJECT_ID, new Boolean(n716TBW03_CRF_LATEST_VERSION), new Short(A716TBW03_CRF_LATEST_VERSION), new Boolean(n717TBW03_CRF_INPUT_LEVEL), new Byte(A717TBW03_CRF_INPUT_LEVEL), new Boolean(n718TBW03_LOCK_FLG), A718TBW03_LOCK_FLG, new Boolean(n719TBW03_LOCK_DATETIME), A719TBW03_LOCK_DATETIME, new Boolean(n721TBW03_LOCK_AUTH_CD), A721TBW03_LOCK_AUTH_CD, new Boolean(n722TBW03_UPLOAD_DATETIME), A722TBW03_UPLOAD_DATETIME, new Boolean(n724TBW03_UPLOAD_AUTH_CD), A724TBW03_UPLOAD_AUTH_CD, new Boolean(n725TBW03_DM_ARRIVAL_FLG), A725TBW03_DM_ARRIVAL_FLG, new Boolean(n726TBW03_DM_ARRIVAL_DATETIME), A726TBW03_DM_ARRIVAL_DATETIME, new Boolean(n727TBW03_APPROVAL_FLG), A727TBW03_APPROVAL_FLG, new Boolean(n728TBW03_APPROVAL_DATETIME), A728TBW03_APPROVAL_DATETIME, new Boolean(n730TBW03_APPROVAL_AUTH_CD), A730TBW03_APPROVAL_AUTH_CD, new Boolean(n731TBW03_INPUT_END_FLG), A731TBW03_INPUT_END_FLG, new Boolean(n732TBW03_INPUT_END_DATETIME), A732TBW03_INPUT_END_DATETIME, new Boolean(n734TBW03_INPUT_END_AUTH_CD), A734TBW03_INPUT_END_AUTH_CD, new Boolean(n780TBW03_DEL_FLG), A780TBW03_DEL_FLG, new Boolean(n781TBW03_CRT_DATETIME), A781TBW03_CRT_DATETIME, new Boolean(n783TBW03_CRT_PROG_NM), A783TBW03_CRT_PROG_NM, new Boolean(n784TBW03_UPD_DATETIME), A784TBW03_UPD_DATETIME, new Boolean(n786TBW03_UPD_PROG_NM), A786TBW03_UPD_PROG_NM, new Boolean(n787TBW03_UPD_CNT), new Long(A787TBW03_UPD_CNT), new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID, new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID, new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID, new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID, new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID, new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID, new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID, A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW03_CRF_SEARCH") ;
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW03_CRF_SEARCH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1641( ) ;
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
         endLevel1641( ) ;
      }
      closeExtendedTableCursors1641( ) ;
   }

   public void deferredUpdate1641( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1641( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1641( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1641( ) ;
         afterConfirm1641( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1641( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001616 */
               pr_default.execute(14, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW03_CRF_SEARCH") ;
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
      sMode41 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1641( ) ;
      Gx_mode = sMode41 ;
   }

   public void onDeleteControls1641( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW03_CRF_SEARCH_BC" ;
         /* Using cursor BC00164 */
         pr_default.execute(2, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
         A710TBW03_CRF_NM = BC00164_A710TBW03_CRF_NM[0] ;
         n710TBW03_CRF_NM = BC00164_n710TBW03_CRF_NM[0] ;
         A711TBW03_CRF_SNM = BC00164_A711TBW03_CRF_SNM[0] ;
         n711TBW03_CRF_SNM = BC00164_n711TBW03_CRF_SNM[0] ;
         A712TBW03_CRF_ORDER = BC00164_A712TBW03_CRF_ORDER[0] ;
         n712TBW03_CRF_ORDER = BC00164_n712TBW03_CRF_ORDER[0] ;
         pr_default.close(2);
         /* Using cursor BC00165 */
         pr_default.execute(3, new Object[] {new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID});
         A713TBW03_SITE_NM = BC00165_A713TBW03_SITE_NM[0] ;
         n713TBW03_SITE_NM = BC00165_n713TBW03_SITE_NM[0] ;
         A714TBW03_SITE_RYAK_NM = BC00165_A714TBW03_SITE_RYAK_NM[0] ;
         n714TBW03_SITE_RYAK_NM = BC00165_n714TBW03_SITE_RYAK_NM[0] ;
         pr_default.close(3);
         /* Using cursor BC00166 */
         pr_default.execute(4, new Object[] {new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID});
         A720TBW03_LOCK_USER_NM = BC00166_A720TBW03_LOCK_USER_NM[0] ;
         n720TBW03_LOCK_USER_NM = BC00166_n720TBW03_LOCK_USER_NM[0] ;
         pr_default.close(4);
         /* Using cursor BC00167 */
         pr_default.execute(5, new Object[] {new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID});
         A723TBW03_UPLOAD_USER_NM = BC00167_A723TBW03_UPLOAD_USER_NM[0] ;
         n723TBW03_UPLOAD_USER_NM = BC00167_n723TBW03_UPLOAD_USER_NM[0] ;
         pr_default.close(5);
         /* Using cursor BC00168 */
         pr_default.execute(6, new Object[] {new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID});
         A729TBW03_APPROVAL_USER_NM = BC00168_A729TBW03_APPROVAL_USER_NM[0] ;
         n729TBW03_APPROVAL_USER_NM = BC00168_n729TBW03_APPROVAL_USER_NM[0] ;
         pr_default.close(6);
         /* Using cursor BC00169 */
         pr_default.execute(7, new Object[] {new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID});
         A733TBW03_INPUT_END_USER_NM = BC00169_A733TBW03_INPUT_END_USER_NM[0] ;
         n733TBW03_INPUT_END_USER_NM = BC00169_n733TBW03_INPUT_END_USER_NM[0] ;
         pr_default.close(7);
         /* Using cursor BC001610 */
         pr_default.execute(8, new Object[] {new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID});
         A782TBW03_CRT_USER_NM = BC001610_A782TBW03_CRT_USER_NM[0] ;
         n782TBW03_CRT_USER_NM = BC001610_n782TBW03_CRT_USER_NM[0] ;
         pr_default.close(8);
         /* Using cursor BC001611 */
         pr_default.execute(9, new Object[] {new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID});
         A785TBW03_UPD_USER_NM = BC001611_A785TBW03_UPD_USER_NM[0] ;
         n785TBW03_UPD_USER_NM = BC001611_n785TBW03_UPD_USER_NM[0] ;
         pr_default.close(9);
      }
   }

   public void endLevel1641( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1641( ) ;
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

   public void scanKeyStart1641( )
   {
      /* Scan By routine */
      /* Using cursor BC001617 */
      pr_default.execute(15, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID)});
      RcdFound41 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A110TBW03_SESSION_ID = BC001617_A110TBW03_SESSION_ID[0] ;
         A111TBW03_APP_ID = BC001617_A111TBW03_APP_ID[0] ;
         A112TBW03_DISP_DATETIME = BC001617_A112TBW03_DISP_DATETIME[0] ;
         A114TBW03_SUBJECT_ID = BC001617_A114TBW03_SUBJECT_ID[0] ;
         A710TBW03_CRF_NM = BC001617_A710TBW03_CRF_NM[0] ;
         n710TBW03_CRF_NM = BC001617_n710TBW03_CRF_NM[0] ;
         A711TBW03_CRF_SNM = BC001617_A711TBW03_CRF_SNM[0] ;
         n711TBW03_CRF_SNM = BC001617_n711TBW03_CRF_SNM[0] ;
         A712TBW03_CRF_ORDER = BC001617_A712TBW03_CRF_ORDER[0] ;
         n712TBW03_CRF_ORDER = BC001617_n712TBW03_CRF_ORDER[0] ;
         A713TBW03_SITE_NM = BC001617_A713TBW03_SITE_NM[0] ;
         n713TBW03_SITE_NM = BC001617_n713TBW03_SITE_NM[0] ;
         A714TBW03_SITE_RYAK_NM = BC001617_A714TBW03_SITE_RYAK_NM[0] ;
         n714TBW03_SITE_RYAK_NM = BC001617_n714TBW03_SITE_RYAK_NM[0] ;
         A715TBW03_OUTER_SUBJECT_ID = BC001617_A715TBW03_OUTER_SUBJECT_ID[0] ;
         n715TBW03_OUTER_SUBJECT_ID = BC001617_n715TBW03_OUTER_SUBJECT_ID[0] ;
         A716TBW03_CRF_LATEST_VERSION = BC001617_A716TBW03_CRF_LATEST_VERSION[0] ;
         n716TBW03_CRF_LATEST_VERSION = BC001617_n716TBW03_CRF_LATEST_VERSION[0] ;
         A717TBW03_CRF_INPUT_LEVEL = BC001617_A717TBW03_CRF_INPUT_LEVEL[0] ;
         n717TBW03_CRF_INPUT_LEVEL = BC001617_n717TBW03_CRF_INPUT_LEVEL[0] ;
         A718TBW03_LOCK_FLG = BC001617_A718TBW03_LOCK_FLG[0] ;
         n718TBW03_LOCK_FLG = BC001617_n718TBW03_LOCK_FLG[0] ;
         A719TBW03_LOCK_DATETIME = BC001617_A719TBW03_LOCK_DATETIME[0] ;
         n719TBW03_LOCK_DATETIME = BC001617_n719TBW03_LOCK_DATETIME[0] ;
         A720TBW03_LOCK_USER_NM = BC001617_A720TBW03_LOCK_USER_NM[0] ;
         n720TBW03_LOCK_USER_NM = BC001617_n720TBW03_LOCK_USER_NM[0] ;
         A721TBW03_LOCK_AUTH_CD = BC001617_A721TBW03_LOCK_AUTH_CD[0] ;
         n721TBW03_LOCK_AUTH_CD = BC001617_n721TBW03_LOCK_AUTH_CD[0] ;
         A722TBW03_UPLOAD_DATETIME = BC001617_A722TBW03_UPLOAD_DATETIME[0] ;
         n722TBW03_UPLOAD_DATETIME = BC001617_n722TBW03_UPLOAD_DATETIME[0] ;
         A723TBW03_UPLOAD_USER_NM = BC001617_A723TBW03_UPLOAD_USER_NM[0] ;
         n723TBW03_UPLOAD_USER_NM = BC001617_n723TBW03_UPLOAD_USER_NM[0] ;
         A724TBW03_UPLOAD_AUTH_CD = BC001617_A724TBW03_UPLOAD_AUTH_CD[0] ;
         n724TBW03_UPLOAD_AUTH_CD = BC001617_n724TBW03_UPLOAD_AUTH_CD[0] ;
         A725TBW03_DM_ARRIVAL_FLG = BC001617_A725TBW03_DM_ARRIVAL_FLG[0] ;
         n725TBW03_DM_ARRIVAL_FLG = BC001617_n725TBW03_DM_ARRIVAL_FLG[0] ;
         A726TBW03_DM_ARRIVAL_DATETIME = BC001617_A726TBW03_DM_ARRIVAL_DATETIME[0] ;
         n726TBW03_DM_ARRIVAL_DATETIME = BC001617_n726TBW03_DM_ARRIVAL_DATETIME[0] ;
         A727TBW03_APPROVAL_FLG = BC001617_A727TBW03_APPROVAL_FLG[0] ;
         n727TBW03_APPROVAL_FLG = BC001617_n727TBW03_APPROVAL_FLG[0] ;
         A728TBW03_APPROVAL_DATETIME = BC001617_A728TBW03_APPROVAL_DATETIME[0] ;
         n728TBW03_APPROVAL_DATETIME = BC001617_n728TBW03_APPROVAL_DATETIME[0] ;
         A729TBW03_APPROVAL_USER_NM = BC001617_A729TBW03_APPROVAL_USER_NM[0] ;
         n729TBW03_APPROVAL_USER_NM = BC001617_n729TBW03_APPROVAL_USER_NM[0] ;
         A730TBW03_APPROVAL_AUTH_CD = BC001617_A730TBW03_APPROVAL_AUTH_CD[0] ;
         n730TBW03_APPROVAL_AUTH_CD = BC001617_n730TBW03_APPROVAL_AUTH_CD[0] ;
         A731TBW03_INPUT_END_FLG = BC001617_A731TBW03_INPUT_END_FLG[0] ;
         n731TBW03_INPUT_END_FLG = BC001617_n731TBW03_INPUT_END_FLG[0] ;
         A732TBW03_INPUT_END_DATETIME = BC001617_A732TBW03_INPUT_END_DATETIME[0] ;
         n732TBW03_INPUT_END_DATETIME = BC001617_n732TBW03_INPUT_END_DATETIME[0] ;
         A733TBW03_INPUT_END_USER_NM = BC001617_A733TBW03_INPUT_END_USER_NM[0] ;
         n733TBW03_INPUT_END_USER_NM = BC001617_n733TBW03_INPUT_END_USER_NM[0] ;
         A734TBW03_INPUT_END_AUTH_CD = BC001617_A734TBW03_INPUT_END_AUTH_CD[0] ;
         n734TBW03_INPUT_END_AUTH_CD = BC001617_n734TBW03_INPUT_END_AUTH_CD[0] ;
         A780TBW03_DEL_FLG = BC001617_A780TBW03_DEL_FLG[0] ;
         n780TBW03_DEL_FLG = BC001617_n780TBW03_DEL_FLG[0] ;
         A781TBW03_CRT_DATETIME = BC001617_A781TBW03_CRT_DATETIME[0] ;
         n781TBW03_CRT_DATETIME = BC001617_n781TBW03_CRT_DATETIME[0] ;
         A782TBW03_CRT_USER_NM = BC001617_A782TBW03_CRT_USER_NM[0] ;
         n782TBW03_CRT_USER_NM = BC001617_n782TBW03_CRT_USER_NM[0] ;
         A783TBW03_CRT_PROG_NM = BC001617_A783TBW03_CRT_PROG_NM[0] ;
         n783TBW03_CRT_PROG_NM = BC001617_n783TBW03_CRT_PROG_NM[0] ;
         A784TBW03_UPD_DATETIME = BC001617_A784TBW03_UPD_DATETIME[0] ;
         n784TBW03_UPD_DATETIME = BC001617_n784TBW03_UPD_DATETIME[0] ;
         A785TBW03_UPD_USER_NM = BC001617_A785TBW03_UPD_USER_NM[0] ;
         n785TBW03_UPD_USER_NM = BC001617_n785TBW03_UPD_USER_NM[0] ;
         A786TBW03_UPD_PROG_NM = BC001617_A786TBW03_UPD_PROG_NM[0] ;
         n786TBW03_UPD_PROG_NM = BC001617_n786TBW03_UPD_PROG_NM[0] ;
         A787TBW03_UPD_CNT = BC001617_A787TBW03_UPD_CNT[0] ;
         n787TBW03_UPD_CNT = BC001617_n787TBW03_UPD_CNT[0] ;
         A113TBW03_STUDY_ID = BC001617_A113TBW03_STUDY_ID[0] ;
         A115TBW03_CRF_ID = BC001617_A115TBW03_CRF_ID[0] ;
         A120TBW03_SITE_ID = BC001617_A120TBW03_SITE_ID[0] ;
         n120TBW03_SITE_ID = BC001617_n120TBW03_SITE_ID[0] ;
         A116TBW03_LOCK_USER_ID = BC001617_A116TBW03_LOCK_USER_ID[0] ;
         n116TBW03_LOCK_USER_ID = BC001617_n116TBW03_LOCK_USER_ID[0] ;
         A117TBW03_UPLOAD_USER_ID = BC001617_A117TBW03_UPLOAD_USER_ID[0] ;
         n117TBW03_UPLOAD_USER_ID = BC001617_n117TBW03_UPLOAD_USER_ID[0] ;
         A118TBW03_APPROVAL_USER_ID = BC001617_A118TBW03_APPROVAL_USER_ID[0] ;
         n118TBW03_APPROVAL_USER_ID = BC001617_n118TBW03_APPROVAL_USER_ID[0] ;
         A119TBW03_INPUT_END_USER_ID = BC001617_A119TBW03_INPUT_END_USER_ID[0] ;
         n119TBW03_INPUT_END_USER_ID = BC001617_n119TBW03_INPUT_END_USER_ID[0] ;
         A121TBW03_CRT_USER_ID = BC001617_A121TBW03_CRT_USER_ID[0] ;
         n121TBW03_CRT_USER_ID = BC001617_n121TBW03_CRT_USER_ID[0] ;
         A122TBW03_UPD_USER_ID = BC001617_A122TBW03_UPD_USER_ID[0] ;
         n122TBW03_UPD_USER_ID = BC001617_n122TBW03_UPD_USER_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1641( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound41 = (short)(0) ;
      scanKeyLoad1641( ) ;
   }

   public void scanKeyLoad1641( )
   {
      sMode41 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A110TBW03_SESSION_ID = BC001617_A110TBW03_SESSION_ID[0] ;
         A111TBW03_APP_ID = BC001617_A111TBW03_APP_ID[0] ;
         A112TBW03_DISP_DATETIME = BC001617_A112TBW03_DISP_DATETIME[0] ;
         A114TBW03_SUBJECT_ID = BC001617_A114TBW03_SUBJECT_ID[0] ;
         A710TBW03_CRF_NM = BC001617_A710TBW03_CRF_NM[0] ;
         n710TBW03_CRF_NM = BC001617_n710TBW03_CRF_NM[0] ;
         A711TBW03_CRF_SNM = BC001617_A711TBW03_CRF_SNM[0] ;
         n711TBW03_CRF_SNM = BC001617_n711TBW03_CRF_SNM[0] ;
         A712TBW03_CRF_ORDER = BC001617_A712TBW03_CRF_ORDER[0] ;
         n712TBW03_CRF_ORDER = BC001617_n712TBW03_CRF_ORDER[0] ;
         A713TBW03_SITE_NM = BC001617_A713TBW03_SITE_NM[0] ;
         n713TBW03_SITE_NM = BC001617_n713TBW03_SITE_NM[0] ;
         A714TBW03_SITE_RYAK_NM = BC001617_A714TBW03_SITE_RYAK_NM[0] ;
         n714TBW03_SITE_RYAK_NM = BC001617_n714TBW03_SITE_RYAK_NM[0] ;
         A715TBW03_OUTER_SUBJECT_ID = BC001617_A715TBW03_OUTER_SUBJECT_ID[0] ;
         n715TBW03_OUTER_SUBJECT_ID = BC001617_n715TBW03_OUTER_SUBJECT_ID[0] ;
         A716TBW03_CRF_LATEST_VERSION = BC001617_A716TBW03_CRF_LATEST_VERSION[0] ;
         n716TBW03_CRF_LATEST_VERSION = BC001617_n716TBW03_CRF_LATEST_VERSION[0] ;
         A717TBW03_CRF_INPUT_LEVEL = BC001617_A717TBW03_CRF_INPUT_LEVEL[0] ;
         n717TBW03_CRF_INPUT_LEVEL = BC001617_n717TBW03_CRF_INPUT_LEVEL[0] ;
         A718TBW03_LOCK_FLG = BC001617_A718TBW03_LOCK_FLG[0] ;
         n718TBW03_LOCK_FLG = BC001617_n718TBW03_LOCK_FLG[0] ;
         A719TBW03_LOCK_DATETIME = BC001617_A719TBW03_LOCK_DATETIME[0] ;
         n719TBW03_LOCK_DATETIME = BC001617_n719TBW03_LOCK_DATETIME[0] ;
         A720TBW03_LOCK_USER_NM = BC001617_A720TBW03_LOCK_USER_NM[0] ;
         n720TBW03_LOCK_USER_NM = BC001617_n720TBW03_LOCK_USER_NM[0] ;
         A721TBW03_LOCK_AUTH_CD = BC001617_A721TBW03_LOCK_AUTH_CD[0] ;
         n721TBW03_LOCK_AUTH_CD = BC001617_n721TBW03_LOCK_AUTH_CD[0] ;
         A722TBW03_UPLOAD_DATETIME = BC001617_A722TBW03_UPLOAD_DATETIME[0] ;
         n722TBW03_UPLOAD_DATETIME = BC001617_n722TBW03_UPLOAD_DATETIME[0] ;
         A723TBW03_UPLOAD_USER_NM = BC001617_A723TBW03_UPLOAD_USER_NM[0] ;
         n723TBW03_UPLOAD_USER_NM = BC001617_n723TBW03_UPLOAD_USER_NM[0] ;
         A724TBW03_UPLOAD_AUTH_CD = BC001617_A724TBW03_UPLOAD_AUTH_CD[0] ;
         n724TBW03_UPLOAD_AUTH_CD = BC001617_n724TBW03_UPLOAD_AUTH_CD[0] ;
         A725TBW03_DM_ARRIVAL_FLG = BC001617_A725TBW03_DM_ARRIVAL_FLG[0] ;
         n725TBW03_DM_ARRIVAL_FLG = BC001617_n725TBW03_DM_ARRIVAL_FLG[0] ;
         A726TBW03_DM_ARRIVAL_DATETIME = BC001617_A726TBW03_DM_ARRIVAL_DATETIME[0] ;
         n726TBW03_DM_ARRIVAL_DATETIME = BC001617_n726TBW03_DM_ARRIVAL_DATETIME[0] ;
         A727TBW03_APPROVAL_FLG = BC001617_A727TBW03_APPROVAL_FLG[0] ;
         n727TBW03_APPROVAL_FLG = BC001617_n727TBW03_APPROVAL_FLG[0] ;
         A728TBW03_APPROVAL_DATETIME = BC001617_A728TBW03_APPROVAL_DATETIME[0] ;
         n728TBW03_APPROVAL_DATETIME = BC001617_n728TBW03_APPROVAL_DATETIME[0] ;
         A729TBW03_APPROVAL_USER_NM = BC001617_A729TBW03_APPROVAL_USER_NM[0] ;
         n729TBW03_APPROVAL_USER_NM = BC001617_n729TBW03_APPROVAL_USER_NM[0] ;
         A730TBW03_APPROVAL_AUTH_CD = BC001617_A730TBW03_APPROVAL_AUTH_CD[0] ;
         n730TBW03_APPROVAL_AUTH_CD = BC001617_n730TBW03_APPROVAL_AUTH_CD[0] ;
         A731TBW03_INPUT_END_FLG = BC001617_A731TBW03_INPUT_END_FLG[0] ;
         n731TBW03_INPUT_END_FLG = BC001617_n731TBW03_INPUT_END_FLG[0] ;
         A732TBW03_INPUT_END_DATETIME = BC001617_A732TBW03_INPUT_END_DATETIME[0] ;
         n732TBW03_INPUT_END_DATETIME = BC001617_n732TBW03_INPUT_END_DATETIME[0] ;
         A733TBW03_INPUT_END_USER_NM = BC001617_A733TBW03_INPUT_END_USER_NM[0] ;
         n733TBW03_INPUT_END_USER_NM = BC001617_n733TBW03_INPUT_END_USER_NM[0] ;
         A734TBW03_INPUT_END_AUTH_CD = BC001617_A734TBW03_INPUT_END_AUTH_CD[0] ;
         n734TBW03_INPUT_END_AUTH_CD = BC001617_n734TBW03_INPUT_END_AUTH_CD[0] ;
         A780TBW03_DEL_FLG = BC001617_A780TBW03_DEL_FLG[0] ;
         n780TBW03_DEL_FLG = BC001617_n780TBW03_DEL_FLG[0] ;
         A781TBW03_CRT_DATETIME = BC001617_A781TBW03_CRT_DATETIME[0] ;
         n781TBW03_CRT_DATETIME = BC001617_n781TBW03_CRT_DATETIME[0] ;
         A782TBW03_CRT_USER_NM = BC001617_A782TBW03_CRT_USER_NM[0] ;
         n782TBW03_CRT_USER_NM = BC001617_n782TBW03_CRT_USER_NM[0] ;
         A783TBW03_CRT_PROG_NM = BC001617_A783TBW03_CRT_PROG_NM[0] ;
         n783TBW03_CRT_PROG_NM = BC001617_n783TBW03_CRT_PROG_NM[0] ;
         A784TBW03_UPD_DATETIME = BC001617_A784TBW03_UPD_DATETIME[0] ;
         n784TBW03_UPD_DATETIME = BC001617_n784TBW03_UPD_DATETIME[0] ;
         A785TBW03_UPD_USER_NM = BC001617_A785TBW03_UPD_USER_NM[0] ;
         n785TBW03_UPD_USER_NM = BC001617_n785TBW03_UPD_USER_NM[0] ;
         A786TBW03_UPD_PROG_NM = BC001617_A786TBW03_UPD_PROG_NM[0] ;
         n786TBW03_UPD_PROG_NM = BC001617_n786TBW03_UPD_PROG_NM[0] ;
         A787TBW03_UPD_CNT = BC001617_A787TBW03_UPD_CNT[0] ;
         n787TBW03_UPD_CNT = BC001617_n787TBW03_UPD_CNT[0] ;
         A113TBW03_STUDY_ID = BC001617_A113TBW03_STUDY_ID[0] ;
         A115TBW03_CRF_ID = BC001617_A115TBW03_CRF_ID[0] ;
         A120TBW03_SITE_ID = BC001617_A120TBW03_SITE_ID[0] ;
         n120TBW03_SITE_ID = BC001617_n120TBW03_SITE_ID[0] ;
         A116TBW03_LOCK_USER_ID = BC001617_A116TBW03_LOCK_USER_ID[0] ;
         n116TBW03_LOCK_USER_ID = BC001617_n116TBW03_LOCK_USER_ID[0] ;
         A117TBW03_UPLOAD_USER_ID = BC001617_A117TBW03_UPLOAD_USER_ID[0] ;
         n117TBW03_UPLOAD_USER_ID = BC001617_n117TBW03_UPLOAD_USER_ID[0] ;
         A118TBW03_APPROVAL_USER_ID = BC001617_A118TBW03_APPROVAL_USER_ID[0] ;
         n118TBW03_APPROVAL_USER_ID = BC001617_n118TBW03_APPROVAL_USER_ID[0] ;
         A119TBW03_INPUT_END_USER_ID = BC001617_A119TBW03_INPUT_END_USER_ID[0] ;
         n119TBW03_INPUT_END_USER_ID = BC001617_n119TBW03_INPUT_END_USER_ID[0] ;
         A121TBW03_CRT_USER_ID = BC001617_A121TBW03_CRT_USER_ID[0] ;
         n121TBW03_CRT_USER_ID = BC001617_n121TBW03_CRT_USER_ID[0] ;
         A122TBW03_UPD_USER_ID = BC001617_A122TBW03_UPD_USER_ID[0] ;
         n122TBW03_UPD_USER_ID = BC001617_n122TBW03_UPD_USER_ID[0] ;
      }
      Gx_mode = sMode41 ;
   }

   public void scanKeyEnd1641( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1641( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1641( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1641( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1641( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1641( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1641( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1641( )
   {
   }

   public void addRow1641( )
   {
      VarsToRow41( bcTBW03_CRF_SEARCH) ;
   }

   public void readRow1641( )
   {
      RowToVars41( bcTBW03_CRF_SEARCH, 1) ;
   }

   public void initializeNonKey1641( )
   {
      A710TBW03_CRF_NM = "" ;
      n710TBW03_CRF_NM = false ;
      A711TBW03_CRF_SNM = "" ;
      n711TBW03_CRF_SNM = false ;
      A712TBW03_CRF_ORDER = 0 ;
      n712TBW03_CRF_ORDER = false ;
      A120TBW03_SITE_ID = "" ;
      n120TBW03_SITE_ID = false ;
      A713TBW03_SITE_NM = "" ;
      n713TBW03_SITE_NM = false ;
      A714TBW03_SITE_RYAK_NM = "" ;
      n714TBW03_SITE_RYAK_NM = false ;
      A715TBW03_OUTER_SUBJECT_ID = "" ;
      n715TBW03_OUTER_SUBJECT_ID = false ;
      A716TBW03_CRF_LATEST_VERSION = (short)(0) ;
      n716TBW03_CRF_LATEST_VERSION = false ;
      A717TBW03_CRF_INPUT_LEVEL = (byte)(0) ;
      n717TBW03_CRF_INPUT_LEVEL = false ;
      A718TBW03_LOCK_FLG = "" ;
      n718TBW03_LOCK_FLG = false ;
      A719TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n719TBW03_LOCK_DATETIME = false ;
      A116TBW03_LOCK_USER_ID = "" ;
      n116TBW03_LOCK_USER_ID = false ;
      A720TBW03_LOCK_USER_NM = "" ;
      n720TBW03_LOCK_USER_NM = false ;
      A721TBW03_LOCK_AUTH_CD = "" ;
      n721TBW03_LOCK_AUTH_CD = false ;
      A722TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n722TBW03_UPLOAD_DATETIME = false ;
      A117TBW03_UPLOAD_USER_ID = "" ;
      n117TBW03_UPLOAD_USER_ID = false ;
      A723TBW03_UPLOAD_USER_NM = "" ;
      n723TBW03_UPLOAD_USER_NM = false ;
      A724TBW03_UPLOAD_AUTH_CD = "" ;
      n724TBW03_UPLOAD_AUTH_CD = false ;
      A725TBW03_DM_ARRIVAL_FLG = "" ;
      n725TBW03_DM_ARRIVAL_FLG = false ;
      A726TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n726TBW03_DM_ARRIVAL_DATETIME = false ;
      A727TBW03_APPROVAL_FLG = "" ;
      n727TBW03_APPROVAL_FLG = false ;
      A728TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n728TBW03_APPROVAL_DATETIME = false ;
      A118TBW03_APPROVAL_USER_ID = "" ;
      n118TBW03_APPROVAL_USER_ID = false ;
      A729TBW03_APPROVAL_USER_NM = "" ;
      n729TBW03_APPROVAL_USER_NM = false ;
      A730TBW03_APPROVAL_AUTH_CD = "" ;
      n730TBW03_APPROVAL_AUTH_CD = false ;
      A731TBW03_INPUT_END_FLG = "" ;
      n731TBW03_INPUT_END_FLG = false ;
      A732TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n732TBW03_INPUT_END_DATETIME = false ;
      A119TBW03_INPUT_END_USER_ID = "" ;
      n119TBW03_INPUT_END_USER_ID = false ;
      A733TBW03_INPUT_END_USER_NM = "" ;
      n733TBW03_INPUT_END_USER_NM = false ;
      A734TBW03_INPUT_END_AUTH_CD = "" ;
      n734TBW03_INPUT_END_AUTH_CD = false ;
      A780TBW03_DEL_FLG = "" ;
      n780TBW03_DEL_FLG = false ;
      A781TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n781TBW03_CRT_DATETIME = false ;
      A121TBW03_CRT_USER_ID = "" ;
      n121TBW03_CRT_USER_ID = false ;
      A782TBW03_CRT_USER_NM = "" ;
      n782TBW03_CRT_USER_NM = false ;
      A783TBW03_CRT_PROG_NM = "" ;
      n783TBW03_CRT_PROG_NM = false ;
      A784TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n784TBW03_UPD_DATETIME = false ;
      A122TBW03_UPD_USER_ID = "" ;
      n122TBW03_UPD_USER_ID = false ;
      A785TBW03_UPD_USER_NM = "" ;
      n785TBW03_UPD_USER_NM = false ;
      A786TBW03_UPD_PROG_NM = "" ;
      n786TBW03_UPD_PROG_NM = false ;
      A787TBW03_UPD_CNT = 0 ;
      n787TBW03_UPD_CNT = false ;
   }

   public void initAll1641( )
   {
      A110TBW03_SESSION_ID = "" ;
      A111TBW03_APP_ID = "" ;
      A112TBW03_DISP_DATETIME = "" ;
      A113TBW03_STUDY_ID = 0 ;
      A114TBW03_SUBJECT_ID = 0 ;
      A115TBW03_CRF_ID = (short)(0) ;
      initializeNonKey1641( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow41( SdtTBW03_CRF_SEARCH obj41 )
   {
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Mode( Gx_mode );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm( A710TBW03_CRF_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm( A711TBW03_CRF_SNM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order( A712TBW03_CRF_ORDER );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id( A120TBW03_SITE_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm( A713TBW03_SITE_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm( A714TBW03_SITE_RYAK_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id( A715TBW03_OUTER_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version( A716TBW03_CRF_LATEST_VERSION );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level( A717TBW03_CRF_INPUT_LEVEL );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg( A718TBW03_LOCK_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime( A719TBW03_LOCK_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id( A116TBW03_LOCK_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm( A720TBW03_LOCK_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd( A721TBW03_LOCK_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime( A722TBW03_UPLOAD_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id( A117TBW03_UPLOAD_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm( A723TBW03_UPLOAD_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd( A724TBW03_UPLOAD_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg( A725TBW03_DM_ARRIVAL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime( A726TBW03_DM_ARRIVAL_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg( A727TBW03_APPROVAL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime( A728TBW03_APPROVAL_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id( A118TBW03_APPROVAL_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm( A729TBW03_APPROVAL_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd( A730TBW03_APPROVAL_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg( A731TBW03_INPUT_END_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime( A732TBW03_INPUT_END_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id( A119TBW03_INPUT_END_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm( A733TBW03_INPUT_END_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd( A734TBW03_INPUT_END_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg( A780TBW03_DEL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime( A781TBW03_CRT_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id( A121TBW03_CRT_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm( A782TBW03_CRT_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm( A783TBW03_CRT_PROG_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime( A784TBW03_UPD_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id( A122TBW03_UPD_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm( A785TBW03_UPD_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm( A786TBW03_UPD_PROG_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt( A787TBW03_UPD_CNT );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id( A110TBW03_SESSION_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id( A111TBW03_APP_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime( A112TBW03_DISP_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id( A113TBW03_STUDY_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id( A114TBW03_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id( A115TBW03_CRF_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z( Z110TBW03_SESSION_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z( Z111TBW03_APP_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z( Z112TBW03_DISP_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z( Z113TBW03_STUDY_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z( Z114TBW03_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z( Z115TBW03_CRF_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z( Z710TBW03_CRF_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z( Z711TBW03_CRF_SNM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z( Z712TBW03_CRF_ORDER );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z( Z120TBW03_SITE_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z( Z713TBW03_SITE_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z( Z714TBW03_SITE_RYAK_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z( Z715TBW03_OUTER_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z( Z716TBW03_CRF_LATEST_VERSION );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z( Z717TBW03_CRF_INPUT_LEVEL );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z( Z718TBW03_LOCK_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z( Z719TBW03_LOCK_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z( Z116TBW03_LOCK_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z( Z720TBW03_LOCK_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z( Z721TBW03_LOCK_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z( Z722TBW03_UPLOAD_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z( Z117TBW03_UPLOAD_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z( Z723TBW03_UPLOAD_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z( Z724TBW03_UPLOAD_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z( Z725TBW03_DM_ARRIVAL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z( Z726TBW03_DM_ARRIVAL_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z( Z727TBW03_APPROVAL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z( Z728TBW03_APPROVAL_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z( Z118TBW03_APPROVAL_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z( Z729TBW03_APPROVAL_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z( Z730TBW03_APPROVAL_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z( Z731TBW03_INPUT_END_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z( Z732TBW03_INPUT_END_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z( Z119TBW03_INPUT_END_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z( Z733TBW03_INPUT_END_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z( Z734TBW03_INPUT_END_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z( Z780TBW03_DEL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z( Z781TBW03_CRT_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z( Z121TBW03_CRT_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z( Z782TBW03_CRT_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z( Z783TBW03_CRT_PROG_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z( Z784TBW03_UPD_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z( Z122TBW03_UPD_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z( Z785TBW03_UPD_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z( Z786TBW03_UPD_PROG_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z( Z787TBW03_UPD_CNT );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N( (byte)((byte)((n710TBW03_CRF_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N( (byte)((byte)((n711TBW03_CRF_SNM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N( (byte)((byte)((n712TBW03_CRF_ORDER)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N( (byte)((byte)((n120TBW03_SITE_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N( (byte)((byte)((n713TBW03_SITE_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N( (byte)((byte)((n714TBW03_SITE_RYAK_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N( (byte)((byte)((n715TBW03_OUTER_SUBJECT_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N( (byte)((byte)((n716TBW03_CRF_LATEST_VERSION)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N( (byte)((byte)((n717TBW03_CRF_INPUT_LEVEL)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N( (byte)((byte)((n718TBW03_LOCK_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N( (byte)((byte)((n719TBW03_LOCK_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N( (byte)((byte)((n116TBW03_LOCK_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N( (byte)((byte)((n720TBW03_LOCK_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N( (byte)((byte)((n721TBW03_LOCK_AUTH_CD)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N( (byte)((byte)((n722TBW03_UPLOAD_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N( (byte)((byte)((n117TBW03_UPLOAD_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N( (byte)((byte)((n723TBW03_UPLOAD_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N( (byte)((byte)((n724TBW03_UPLOAD_AUTH_CD)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N( (byte)((byte)((n725TBW03_DM_ARRIVAL_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N( (byte)((byte)((n726TBW03_DM_ARRIVAL_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N( (byte)((byte)((n727TBW03_APPROVAL_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N( (byte)((byte)((n728TBW03_APPROVAL_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N( (byte)((byte)((n118TBW03_APPROVAL_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N( (byte)((byte)((n729TBW03_APPROVAL_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N( (byte)((byte)((n730TBW03_APPROVAL_AUTH_CD)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N( (byte)((byte)((n731TBW03_INPUT_END_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N( (byte)((byte)((n732TBW03_INPUT_END_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N( (byte)((byte)((n119TBW03_INPUT_END_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N( (byte)((byte)((n733TBW03_INPUT_END_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N( (byte)((byte)((n734TBW03_INPUT_END_AUTH_CD)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N( (byte)((byte)((n780TBW03_DEL_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N( (byte)((byte)((n781TBW03_CRT_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N( (byte)((byte)((n121TBW03_CRT_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N( (byte)((byte)((n782TBW03_CRT_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N( (byte)((byte)((n783TBW03_CRT_PROG_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N( (byte)((byte)((n784TBW03_UPD_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N( (byte)((byte)((n122TBW03_UPD_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N( (byte)((byte)((n785TBW03_UPD_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N( (byte)((byte)((n786TBW03_UPD_PROG_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N( (byte)((byte)((n787TBW03_UPD_CNT)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Mode( Gx_mode );
   }

   public void KeyVarsToRow41( SdtTBW03_CRF_SEARCH obj41 )
   {
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id( A110TBW03_SESSION_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id( A111TBW03_APP_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime( A112TBW03_DISP_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id( A113TBW03_STUDY_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id( A114TBW03_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id( A115TBW03_CRF_ID );
   }

   public void RowToVars41( SdtTBW03_CRF_SEARCH obj41 ,
                            int forceLoad )
   {
      Gx_mode = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Mode() ;
      A710TBW03_CRF_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm() ;
      n710TBW03_CRF_NM = false ;
      A711TBW03_CRF_SNM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm() ;
      n711TBW03_CRF_SNM = false ;
      A712TBW03_CRF_ORDER = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order() ;
      n712TBW03_CRF_ORDER = false ;
      A120TBW03_SITE_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id() ;
      n120TBW03_SITE_ID = false ;
      A713TBW03_SITE_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm() ;
      n713TBW03_SITE_NM = false ;
      A714TBW03_SITE_RYAK_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm() ;
      n714TBW03_SITE_RYAK_NM = false ;
      A715TBW03_OUTER_SUBJECT_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id() ;
      n715TBW03_OUTER_SUBJECT_ID = false ;
      A716TBW03_CRF_LATEST_VERSION = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version() ;
      n716TBW03_CRF_LATEST_VERSION = false ;
      A717TBW03_CRF_INPUT_LEVEL = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level() ;
      n717TBW03_CRF_INPUT_LEVEL = false ;
      A718TBW03_LOCK_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg() ;
      n718TBW03_LOCK_FLG = false ;
      A719TBW03_LOCK_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime() ;
      n719TBW03_LOCK_DATETIME = false ;
      A116TBW03_LOCK_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id() ;
      n116TBW03_LOCK_USER_ID = false ;
      A720TBW03_LOCK_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm() ;
      n720TBW03_LOCK_USER_NM = false ;
      A721TBW03_LOCK_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd() ;
      n721TBW03_LOCK_AUTH_CD = false ;
      A722TBW03_UPLOAD_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime() ;
      n722TBW03_UPLOAD_DATETIME = false ;
      A117TBW03_UPLOAD_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id() ;
      n117TBW03_UPLOAD_USER_ID = false ;
      A723TBW03_UPLOAD_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm() ;
      n723TBW03_UPLOAD_USER_NM = false ;
      A724TBW03_UPLOAD_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd() ;
      n724TBW03_UPLOAD_AUTH_CD = false ;
      A725TBW03_DM_ARRIVAL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg() ;
      n725TBW03_DM_ARRIVAL_FLG = false ;
      A726TBW03_DM_ARRIVAL_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime() ;
      n726TBW03_DM_ARRIVAL_DATETIME = false ;
      A727TBW03_APPROVAL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg() ;
      n727TBW03_APPROVAL_FLG = false ;
      A728TBW03_APPROVAL_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime() ;
      n728TBW03_APPROVAL_DATETIME = false ;
      A118TBW03_APPROVAL_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id() ;
      n118TBW03_APPROVAL_USER_ID = false ;
      A729TBW03_APPROVAL_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm() ;
      n729TBW03_APPROVAL_USER_NM = false ;
      A730TBW03_APPROVAL_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd() ;
      n730TBW03_APPROVAL_AUTH_CD = false ;
      A731TBW03_INPUT_END_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg() ;
      n731TBW03_INPUT_END_FLG = false ;
      A732TBW03_INPUT_END_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime() ;
      n732TBW03_INPUT_END_DATETIME = false ;
      A119TBW03_INPUT_END_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id() ;
      n119TBW03_INPUT_END_USER_ID = false ;
      A733TBW03_INPUT_END_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm() ;
      n733TBW03_INPUT_END_USER_NM = false ;
      A734TBW03_INPUT_END_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd() ;
      n734TBW03_INPUT_END_AUTH_CD = false ;
      A780TBW03_DEL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg() ;
      n780TBW03_DEL_FLG = false ;
      A781TBW03_CRT_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime() ;
      n781TBW03_CRT_DATETIME = false ;
      A121TBW03_CRT_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id() ;
      n121TBW03_CRT_USER_ID = false ;
      A782TBW03_CRT_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm() ;
      n782TBW03_CRT_USER_NM = false ;
      A783TBW03_CRT_PROG_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm() ;
      n783TBW03_CRT_PROG_NM = false ;
      A784TBW03_UPD_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime() ;
      n784TBW03_UPD_DATETIME = false ;
      A122TBW03_UPD_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id() ;
      n122TBW03_UPD_USER_ID = false ;
      A785TBW03_UPD_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm() ;
      n785TBW03_UPD_USER_NM = false ;
      A786TBW03_UPD_PROG_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm() ;
      n786TBW03_UPD_PROG_NM = false ;
      A787TBW03_UPD_CNT = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt() ;
      n787TBW03_UPD_CNT = false ;
      A110TBW03_SESSION_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id() ;
      A111TBW03_APP_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id() ;
      A112TBW03_DISP_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime() ;
      A113TBW03_STUDY_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id() ;
      A114TBW03_SUBJECT_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id() ;
      A115TBW03_CRF_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id() ;
      Z110TBW03_SESSION_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z() ;
      Z111TBW03_APP_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z() ;
      Z112TBW03_DISP_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z() ;
      Z113TBW03_STUDY_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z() ;
      Z114TBW03_SUBJECT_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z() ;
      Z115TBW03_CRF_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z() ;
      Z710TBW03_CRF_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z() ;
      Z711TBW03_CRF_SNM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z() ;
      Z712TBW03_CRF_ORDER = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z() ;
      Z120TBW03_SITE_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z() ;
      Z713TBW03_SITE_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z() ;
      Z714TBW03_SITE_RYAK_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z() ;
      Z715TBW03_OUTER_SUBJECT_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z() ;
      Z716TBW03_CRF_LATEST_VERSION = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z() ;
      Z717TBW03_CRF_INPUT_LEVEL = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z() ;
      Z718TBW03_LOCK_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z() ;
      Z719TBW03_LOCK_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z() ;
      Z116TBW03_LOCK_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z() ;
      Z720TBW03_LOCK_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z() ;
      Z721TBW03_LOCK_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z() ;
      Z722TBW03_UPLOAD_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z() ;
      Z117TBW03_UPLOAD_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z() ;
      Z723TBW03_UPLOAD_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z() ;
      Z724TBW03_UPLOAD_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z() ;
      Z725TBW03_DM_ARRIVAL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z() ;
      Z726TBW03_DM_ARRIVAL_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z() ;
      Z727TBW03_APPROVAL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z() ;
      Z728TBW03_APPROVAL_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z() ;
      Z118TBW03_APPROVAL_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z() ;
      Z729TBW03_APPROVAL_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z() ;
      Z730TBW03_APPROVAL_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z() ;
      Z731TBW03_INPUT_END_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z() ;
      Z732TBW03_INPUT_END_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z() ;
      Z119TBW03_INPUT_END_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z() ;
      Z733TBW03_INPUT_END_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z() ;
      Z734TBW03_INPUT_END_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z() ;
      Z780TBW03_DEL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z() ;
      Z781TBW03_CRT_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z() ;
      Z121TBW03_CRT_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z() ;
      Z782TBW03_CRT_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z() ;
      Z783TBW03_CRT_PROG_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z() ;
      Z784TBW03_UPD_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z() ;
      Z122TBW03_UPD_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z() ;
      Z785TBW03_UPD_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z() ;
      Z786TBW03_UPD_PROG_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z() ;
      Z787TBW03_UPD_CNT = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z() ;
      n710TBW03_CRF_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N()==0)?false:true) ;
      n711TBW03_CRF_SNM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N()==0)?false:true) ;
      n712TBW03_CRF_ORDER = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N()==0)?false:true) ;
      n120TBW03_SITE_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N()==0)?false:true) ;
      n713TBW03_SITE_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N()==0)?false:true) ;
      n714TBW03_SITE_RYAK_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N()==0)?false:true) ;
      n715TBW03_OUTER_SUBJECT_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N()==0)?false:true) ;
      n716TBW03_CRF_LATEST_VERSION = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N()==0)?false:true) ;
      n717TBW03_CRF_INPUT_LEVEL = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N()==0)?false:true) ;
      n718TBW03_LOCK_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N()==0)?false:true) ;
      n719TBW03_LOCK_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N()==0)?false:true) ;
      n116TBW03_LOCK_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N()==0)?false:true) ;
      n720TBW03_LOCK_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N()==0)?false:true) ;
      n721TBW03_LOCK_AUTH_CD = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N()==0)?false:true) ;
      n722TBW03_UPLOAD_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N()==0)?false:true) ;
      n117TBW03_UPLOAD_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N()==0)?false:true) ;
      n723TBW03_UPLOAD_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N()==0)?false:true) ;
      n724TBW03_UPLOAD_AUTH_CD = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N()==0)?false:true) ;
      n725TBW03_DM_ARRIVAL_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N()==0)?false:true) ;
      n726TBW03_DM_ARRIVAL_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N()==0)?false:true) ;
      n727TBW03_APPROVAL_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N()==0)?false:true) ;
      n728TBW03_APPROVAL_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N()==0)?false:true) ;
      n118TBW03_APPROVAL_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N()==0)?false:true) ;
      n729TBW03_APPROVAL_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N()==0)?false:true) ;
      n730TBW03_APPROVAL_AUTH_CD = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N()==0)?false:true) ;
      n731TBW03_INPUT_END_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N()==0)?false:true) ;
      n732TBW03_INPUT_END_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N()==0)?false:true) ;
      n119TBW03_INPUT_END_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N()==0)?false:true) ;
      n733TBW03_INPUT_END_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N()==0)?false:true) ;
      n734TBW03_INPUT_END_AUTH_CD = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N()==0)?false:true) ;
      n780TBW03_DEL_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N()==0)?false:true) ;
      n781TBW03_CRT_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N()==0)?false:true) ;
      n121TBW03_CRT_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N()==0)?false:true) ;
      n782TBW03_CRT_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N()==0)?false:true) ;
      n783TBW03_CRT_PROG_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N()==0)?false:true) ;
      n784TBW03_UPD_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N()==0)?false:true) ;
      n122TBW03_UPD_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N()==0)?false:true) ;
      n785TBW03_UPD_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N()==0)?false:true) ;
      n786TBW03_UPD_PROG_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N()==0)?false:true) ;
      n787TBW03_UPD_CNT = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A110TBW03_SESSION_ID = (String)getParm(obj,0) ;
      A111TBW03_APP_ID = (String)getParm(obj,1) ;
      A112TBW03_DISP_DATETIME = (String)getParm(obj,2) ;
      A113TBW03_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A114TBW03_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A115TBW03_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1641( ) ;
      scanKeyStart1641( ) ;
      if ( RcdFound41 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC00164 */
         pr_default.execute(2, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・CRFサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
            AnyError = (short)(1) ;
         }
         A710TBW03_CRF_NM = BC00164_A710TBW03_CRF_NM[0] ;
         n710TBW03_CRF_NM = BC00164_n710TBW03_CRF_NM[0] ;
         A711TBW03_CRF_SNM = BC00164_A711TBW03_CRF_SNM[0] ;
         n711TBW03_CRF_SNM = BC00164_n711TBW03_CRF_SNM[0] ;
         A712TBW03_CRF_ORDER = BC00164_A712TBW03_CRF_ORDER[0] ;
         n712TBW03_CRF_ORDER = BC00164_n712TBW03_CRF_ORDER[0] ;
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z110TBW03_SESSION_ID = A110TBW03_SESSION_ID ;
         Z111TBW03_APP_ID = A111TBW03_APP_ID ;
         Z112TBW03_DISP_DATETIME = A112TBW03_DISP_DATETIME ;
         Z113TBW03_STUDY_ID = A113TBW03_STUDY_ID ;
         Z114TBW03_SUBJECT_ID = A114TBW03_SUBJECT_ID ;
         Z115TBW03_CRF_ID = A115TBW03_CRF_ID ;
      }
      zm1641( -8) ;
      onLoadActions1641( ) ;
      addRow1641( ) ;
      scanKeyEnd1641( ) ;
      if ( RcdFound41 == 0 )
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
      RowToVars41( bcTBW03_CRF_SEARCH, 0) ;
      scanKeyStart1641( ) ;
      if ( RcdFound41 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC00164 */
         pr_default.execute(2, new Object[] {new Long(A113TBW03_STUDY_ID), new Short(A115TBW03_CRF_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CRF検索ワーク・CRFサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
            AnyError = (short)(1) ;
         }
         A710TBW03_CRF_NM = BC00164_A710TBW03_CRF_NM[0] ;
         n710TBW03_CRF_NM = BC00164_n710TBW03_CRF_NM[0] ;
         A711TBW03_CRF_SNM = BC00164_A711TBW03_CRF_SNM[0] ;
         n711TBW03_CRF_SNM = BC00164_n711TBW03_CRF_SNM[0] ;
         A712TBW03_CRF_ORDER = BC00164_A712TBW03_CRF_ORDER[0] ;
         n712TBW03_CRF_ORDER = BC00164_n712TBW03_CRF_ORDER[0] ;
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z110TBW03_SESSION_ID = A110TBW03_SESSION_ID ;
         Z111TBW03_APP_ID = A111TBW03_APP_ID ;
         Z112TBW03_DISP_DATETIME = A112TBW03_DISP_DATETIME ;
         Z113TBW03_STUDY_ID = A113TBW03_STUDY_ID ;
         Z114TBW03_SUBJECT_ID = A114TBW03_SUBJECT_ID ;
         Z115TBW03_CRF_ID = A115TBW03_CRF_ID ;
      }
      zm1641( -8) ;
      onLoadActions1641( ) ;
      addRow1641( ) ;
      scanKeyEnd1641( ) ;
      if ( RcdFound41 == 0 )
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
      RowToVars41( bcTBW03_CRF_SEARCH, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1641( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1641( ) ;
      }
      else
      {
         if ( RcdFound41 == 1 )
         {
            if ( ( GXutil.strcmp(A110TBW03_SESSION_ID, Z110TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A111TBW03_APP_ID, Z111TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A112TBW03_DISP_DATETIME, Z112TBW03_DISP_DATETIME) != 0 ) || ( A113TBW03_STUDY_ID != Z113TBW03_STUDY_ID ) || ( A114TBW03_SUBJECT_ID != Z114TBW03_SUBJECT_ID ) || ( A115TBW03_CRF_ID != Z115TBW03_CRF_ID ) )
            {
               A110TBW03_SESSION_ID = Z110TBW03_SESSION_ID ;
               A111TBW03_APP_ID = Z111TBW03_APP_ID ;
               A112TBW03_DISP_DATETIME = Z112TBW03_DISP_DATETIME ;
               A113TBW03_STUDY_ID = Z113TBW03_STUDY_ID ;
               A114TBW03_SUBJECT_ID = Z114TBW03_SUBJECT_ID ;
               A115TBW03_CRF_ID = Z115TBW03_CRF_ID ;
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
               update1641( ) ;
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
               if ( ( GXutil.strcmp(A110TBW03_SESSION_ID, Z110TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A111TBW03_APP_ID, Z111TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A112TBW03_DISP_DATETIME, Z112TBW03_DISP_DATETIME) != 0 ) || ( A113TBW03_STUDY_ID != Z113TBW03_STUDY_ID ) || ( A114TBW03_SUBJECT_ID != Z114TBW03_SUBJECT_ID ) || ( A115TBW03_CRF_ID != Z115TBW03_CRF_ID ) )
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
                     insert1641( ) ;
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
                     insert1641( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow41( bcTBW03_CRF_SEARCH) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars41( bcTBW03_CRF_SEARCH, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1641( ) ;
      if ( RcdFound41 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A110TBW03_SESSION_ID, Z110TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A111TBW03_APP_ID, Z111TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A112TBW03_DISP_DATETIME, Z112TBW03_DISP_DATETIME) != 0 ) || ( A113TBW03_STUDY_ID != Z113TBW03_STUDY_ID ) || ( A114TBW03_SUBJECT_ID != Z114TBW03_SUBJECT_ID ) || ( A115TBW03_CRF_ID != Z115TBW03_CRF_ID ) )
         {
            A110TBW03_SESSION_ID = Z110TBW03_SESSION_ID ;
            A111TBW03_APP_ID = Z111TBW03_APP_ID ;
            A112TBW03_DISP_DATETIME = Z112TBW03_DISP_DATETIME ;
            A113TBW03_STUDY_ID = Z113TBW03_STUDY_ID ;
            A114TBW03_SUBJECT_ID = Z114TBW03_SUBJECT_ID ;
            A115TBW03_CRF_ID = Z115TBW03_CRF_ID ;
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
         if ( ( GXutil.strcmp(A110TBW03_SESSION_ID, Z110TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A111TBW03_APP_ID, Z111TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A112TBW03_DISP_DATETIME, Z112TBW03_DISP_DATETIME) != 0 ) || ( A113TBW03_STUDY_ID != Z113TBW03_STUDY_ID ) || ( A114TBW03_SUBJECT_ID != Z114TBW03_SUBJECT_ID ) || ( A115TBW03_CRF_ID != Z115TBW03_CRF_ID ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbw03_crf_search_bc");
      VarsToRow41( bcTBW03_CRF_SEARCH) ;
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
      Gx_mode = bcTBW03_CRF_SEARCH.getgxTv_SdtTBW03_CRF_SEARCH_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBW03_CRF_SEARCH.setgxTv_SdtTBW03_CRF_SEARCH_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBW03_CRF_SEARCH sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBW03_CRF_SEARCH )
      {
         bcTBW03_CRF_SEARCH = sdt ;
         if ( GXutil.strcmp(bcTBW03_CRF_SEARCH.getgxTv_SdtTBW03_CRF_SEARCH_Mode(), "") == 0 )
         {
            bcTBW03_CRF_SEARCH.setgxTv_SdtTBW03_CRF_SEARCH_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow41( bcTBW03_CRF_SEARCH) ;
         }
         else
         {
            RowToVars41( bcTBW03_CRF_SEARCH, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBW03_CRF_SEARCH.getgxTv_SdtTBW03_CRF_SEARCH_Mode(), "") == 0 )
         {
            bcTBW03_CRF_SEARCH.setgxTv_SdtTBW03_CRF_SEARCH_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars41( bcTBW03_CRF_SEARCH, 1) ;
   }

   public SdtTBW03_CRF_SEARCH getTBW03_CRF_SEARCH_BC( )
   {
      return bcTBW03_CRF_SEARCH ;
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
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
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
      Z110TBW03_SESSION_ID = "" ;
      A110TBW03_SESSION_ID = "" ;
      Z111TBW03_APP_ID = "" ;
      A111TBW03_APP_ID = "" ;
      Z112TBW03_DISP_DATETIME = "" ;
      A112TBW03_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z715TBW03_OUTER_SUBJECT_ID = "" ;
      A715TBW03_OUTER_SUBJECT_ID = "" ;
      Z718TBW03_LOCK_FLG = "" ;
      A718TBW03_LOCK_FLG = "" ;
      Z719TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A719TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z721TBW03_LOCK_AUTH_CD = "" ;
      A721TBW03_LOCK_AUTH_CD = "" ;
      Z722TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A722TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z724TBW03_UPLOAD_AUTH_CD = "" ;
      A724TBW03_UPLOAD_AUTH_CD = "" ;
      Z725TBW03_DM_ARRIVAL_FLG = "" ;
      A725TBW03_DM_ARRIVAL_FLG = "" ;
      Z726TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A726TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z727TBW03_APPROVAL_FLG = "" ;
      A727TBW03_APPROVAL_FLG = "" ;
      Z728TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A728TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z730TBW03_APPROVAL_AUTH_CD = "" ;
      A730TBW03_APPROVAL_AUTH_CD = "" ;
      Z731TBW03_INPUT_END_FLG = "" ;
      A731TBW03_INPUT_END_FLG = "" ;
      Z732TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A732TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z734TBW03_INPUT_END_AUTH_CD = "" ;
      A734TBW03_INPUT_END_AUTH_CD = "" ;
      Z780TBW03_DEL_FLG = "" ;
      A780TBW03_DEL_FLG = "" ;
      Z781TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A781TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z783TBW03_CRT_PROG_NM = "" ;
      A783TBW03_CRT_PROG_NM = "" ;
      Z784TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A784TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z786TBW03_UPD_PROG_NM = "" ;
      A786TBW03_UPD_PROG_NM = "" ;
      Z120TBW03_SITE_ID = "" ;
      A120TBW03_SITE_ID = "" ;
      Z116TBW03_LOCK_USER_ID = "" ;
      A116TBW03_LOCK_USER_ID = "" ;
      Z117TBW03_UPLOAD_USER_ID = "" ;
      A117TBW03_UPLOAD_USER_ID = "" ;
      Z118TBW03_APPROVAL_USER_ID = "" ;
      A118TBW03_APPROVAL_USER_ID = "" ;
      Z119TBW03_INPUT_END_USER_ID = "" ;
      A119TBW03_INPUT_END_USER_ID = "" ;
      Z121TBW03_CRT_USER_ID = "" ;
      A121TBW03_CRT_USER_ID = "" ;
      Z122TBW03_UPD_USER_ID = "" ;
      A122TBW03_UPD_USER_ID = "" ;
      Z710TBW03_CRF_NM = "" ;
      A710TBW03_CRF_NM = "" ;
      Z711TBW03_CRF_SNM = "" ;
      A711TBW03_CRF_SNM = "" ;
      Z713TBW03_SITE_NM = "" ;
      A713TBW03_SITE_NM = "" ;
      Z714TBW03_SITE_RYAK_NM = "" ;
      A714TBW03_SITE_RYAK_NM = "" ;
      Z720TBW03_LOCK_USER_NM = "" ;
      A720TBW03_LOCK_USER_NM = "" ;
      Z723TBW03_UPLOAD_USER_NM = "" ;
      A723TBW03_UPLOAD_USER_NM = "" ;
      Z729TBW03_APPROVAL_USER_NM = "" ;
      A729TBW03_APPROVAL_USER_NM = "" ;
      Z733TBW03_INPUT_END_USER_NM = "" ;
      A733TBW03_INPUT_END_USER_NM = "" ;
      Z782TBW03_CRT_USER_NM = "" ;
      A782TBW03_CRT_USER_NM = "" ;
      Z785TBW03_UPD_USER_NM = "" ;
      A785TBW03_UPD_USER_NM = "" ;
      BC001612_A110TBW03_SESSION_ID = new String[] {""} ;
      BC001612_A111TBW03_APP_ID = new String[] {""} ;
      BC001612_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC001612_A114TBW03_SUBJECT_ID = new int[1] ;
      BC001612_A710TBW03_CRF_NM = new String[] {""} ;
      BC001612_n710TBW03_CRF_NM = new boolean[] {false} ;
      BC001612_A711TBW03_CRF_SNM = new String[] {""} ;
      BC001612_n711TBW03_CRF_SNM = new boolean[] {false} ;
      BC001612_A712TBW03_CRF_ORDER = new int[1] ;
      BC001612_n712TBW03_CRF_ORDER = new boolean[] {false} ;
      BC001612_A713TBW03_SITE_NM = new String[] {""} ;
      BC001612_n713TBW03_SITE_NM = new boolean[] {false} ;
      BC001612_A714TBW03_SITE_RYAK_NM = new String[] {""} ;
      BC001612_n714TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      BC001612_A715TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      BC001612_n715TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC001612_A716TBW03_CRF_LATEST_VERSION = new short[1] ;
      BC001612_n716TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC001612_A717TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      BC001612_n717TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC001612_A718TBW03_LOCK_FLG = new String[] {""} ;
      BC001612_n718TBW03_LOCK_FLG = new boolean[] {false} ;
      BC001612_A719TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n719TBW03_LOCK_DATETIME = new boolean[] {false} ;
      BC001612_A720TBW03_LOCK_USER_NM = new String[] {""} ;
      BC001612_n720TBW03_LOCK_USER_NM = new boolean[] {false} ;
      BC001612_A721TBW03_LOCK_AUTH_CD = new String[] {""} ;
      BC001612_n721TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      BC001612_A722TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n722TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      BC001612_A723TBW03_UPLOAD_USER_NM = new String[] {""} ;
      BC001612_n723TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      BC001612_A724TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      BC001612_n724TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC001612_A725TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      BC001612_n725TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC001612_A726TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n726TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC001612_A727TBW03_APPROVAL_FLG = new String[] {""} ;
      BC001612_n727TBW03_APPROVAL_FLG = new boolean[] {false} ;
      BC001612_A728TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n728TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      BC001612_A729TBW03_APPROVAL_USER_NM = new String[] {""} ;
      BC001612_n729TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      BC001612_A730TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      BC001612_n730TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC001612_A731TBW03_INPUT_END_FLG = new String[] {""} ;
      BC001612_n731TBW03_INPUT_END_FLG = new boolean[] {false} ;
      BC001612_A732TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n732TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      BC001612_A733TBW03_INPUT_END_USER_NM = new String[] {""} ;
      BC001612_n733TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      BC001612_A734TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      BC001612_n734TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC001612_A780TBW03_DEL_FLG = new String[] {""} ;
      BC001612_n780TBW03_DEL_FLG = new boolean[] {false} ;
      BC001612_A781TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n781TBW03_CRT_DATETIME = new boolean[] {false} ;
      BC001612_A782TBW03_CRT_USER_NM = new String[] {""} ;
      BC001612_n782TBW03_CRT_USER_NM = new boolean[] {false} ;
      BC001612_A783TBW03_CRT_PROG_NM = new String[] {""} ;
      BC001612_n783TBW03_CRT_PROG_NM = new boolean[] {false} ;
      BC001612_A784TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n784TBW03_UPD_DATETIME = new boolean[] {false} ;
      BC001612_A785TBW03_UPD_USER_NM = new String[] {""} ;
      BC001612_n785TBW03_UPD_USER_NM = new boolean[] {false} ;
      BC001612_A786TBW03_UPD_PROG_NM = new String[] {""} ;
      BC001612_n786TBW03_UPD_PROG_NM = new boolean[] {false} ;
      BC001612_A787TBW03_UPD_CNT = new long[1] ;
      BC001612_n787TBW03_UPD_CNT = new boolean[] {false} ;
      BC001612_A113TBW03_STUDY_ID = new long[1] ;
      BC001612_A115TBW03_CRF_ID = new short[1] ;
      BC001612_A120TBW03_SITE_ID = new String[] {""} ;
      BC001612_n120TBW03_SITE_ID = new boolean[] {false} ;
      BC001612_A116TBW03_LOCK_USER_ID = new String[] {""} ;
      BC001612_n116TBW03_LOCK_USER_ID = new boolean[] {false} ;
      BC001612_A117TBW03_UPLOAD_USER_ID = new String[] {""} ;
      BC001612_n117TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      BC001612_A118TBW03_APPROVAL_USER_ID = new String[] {""} ;
      BC001612_n118TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      BC001612_A119TBW03_INPUT_END_USER_ID = new String[] {""} ;
      BC001612_n119TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      BC001612_A121TBW03_CRT_USER_ID = new String[] {""} ;
      BC001612_n121TBW03_CRT_USER_ID = new boolean[] {false} ;
      BC001612_A122TBW03_UPD_USER_ID = new String[] {""} ;
      BC001612_n122TBW03_UPD_USER_ID = new boolean[] {false} ;
      BC00164_A710TBW03_CRF_NM = new String[] {""} ;
      BC00164_n710TBW03_CRF_NM = new boolean[] {false} ;
      BC00164_A711TBW03_CRF_SNM = new String[] {""} ;
      BC00164_n711TBW03_CRF_SNM = new boolean[] {false} ;
      BC00164_A712TBW03_CRF_ORDER = new int[1] ;
      BC00164_n712TBW03_CRF_ORDER = new boolean[] {false} ;
      BC00165_A713TBW03_SITE_NM = new String[] {""} ;
      BC00165_n713TBW03_SITE_NM = new boolean[] {false} ;
      BC00165_A714TBW03_SITE_RYAK_NM = new String[] {""} ;
      BC00165_n714TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      BC00166_A720TBW03_LOCK_USER_NM = new String[] {""} ;
      BC00166_n720TBW03_LOCK_USER_NM = new boolean[] {false} ;
      BC00167_A723TBW03_UPLOAD_USER_NM = new String[] {""} ;
      BC00167_n723TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      BC00168_A729TBW03_APPROVAL_USER_NM = new String[] {""} ;
      BC00168_n729TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      BC00169_A733TBW03_INPUT_END_USER_NM = new String[] {""} ;
      BC00169_n733TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      BC001610_A782TBW03_CRT_USER_NM = new String[] {""} ;
      BC001610_n782TBW03_CRT_USER_NM = new boolean[] {false} ;
      BC001611_A785TBW03_UPD_USER_NM = new String[] {""} ;
      BC001611_n785TBW03_UPD_USER_NM = new boolean[] {false} ;
      BC001613_A110TBW03_SESSION_ID = new String[] {""} ;
      BC001613_A111TBW03_APP_ID = new String[] {""} ;
      BC001613_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC001613_A113TBW03_STUDY_ID = new long[1] ;
      BC001613_A114TBW03_SUBJECT_ID = new int[1] ;
      BC001613_A115TBW03_CRF_ID = new short[1] ;
      BC00163_A110TBW03_SESSION_ID = new String[] {""} ;
      BC00163_A111TBW03_APP_ID = new String[] {""} ;
      BC00163_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC00163_A114TBW03_SUBJECT_ID = new int[1] ;
      BC00163_A715TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      BC00163_n715TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC00163_A716TBW03_CRF_LATEST_VERSION = new short[1] ;
      BC00163_n716TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00163_A717TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      BC00163_n717TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00163_A718TBW03_LOCK_FLG = new String[] {""} ;
      BC00163_n718TBW03_LOCK_FLG = new boolean[] {false} ;
      BC00163_A719TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n719TBW03_LOCK_DATETIME = new boolean[] {false} ;
      BC00163_A721TBW03_LOCK_AUTH_CD = new String[] {""} ;
      BC00163_n721TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00163_A722TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n722TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00163_A724TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00163_n724TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00163_A725TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00163_n725TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00163_A726TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n726TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00163_A727TBW03_APPROVAL_FLG = new String[] {""} ;
      BC00163_n727TBW03_APPROVAL_FLG = new boolean[] {false} ;
      BC00163_A728TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n728TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00163_A730TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00163_n730TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00163_A731TBW03_INPUT_END_FLG = new String[] {""} ;
      BC00163_n731TBW03_INPUT_END_FLG = new boolean[] {false} ;
      BC00163_A732TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n732TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00163_A734TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00163_n734TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00163_A780TBW03_DEL_FLG = new String[] {""} ;
      BC00163_n780TBW03_DEL_FLG = new boolean[] {false} ;
      BC00163_A781TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n781TBW03_CRT_DATETIME = new boolean[] {false} ;
      BC00163_A783TBW03_CRT_PROG_NM = new String[] {""} ;
      BC00163_n783TBW03_CRT_PROG_NM = new boolean[] {false} ;
      BC00163_A784TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n784TBW03_UPD_DATETIME = new boolean[] {false} ;
      BC00163_A786TBW03_UPD_PROG_NM = new String[] {""} ;
      BC00163_n786TBW03_UPD_PROG_NM = new boolean[] {false} ;
      BC00163_A787TBW03_UPD_CNT = new long[1] ;
      BC00163_n787TBW03_UPD_CNT = new boolean[] {false} ;
      BC00163_A113TBW03_STUDY_ID = new long[1] ;
      BC00163_A115TBW03_CRF_ID = new short[1] ;
      BC00163_A120TBW03_SITE_ID = new String[] {""} ;
      BC00163_n120TBW03_SITE_ID = new boolean[] {false} ;
      BC00163_A116TBW03_LOCK_USER_ID = new String[] {""} ;
      BC00163_n116TBW03_LOCK_USER_ID = new boolean[] {false} ;
      BC00163_A117TBW03_UPLOAD_USER_ID = new String[] {""} ;
      BC00163_n117TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00163_A118TBW03_APPROVAL_USER_ID = new String[] {""} ;
      BC00163_n118TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00163_A119TBW03_INPUT_END_USER_ID = new String[] {""} ;
      BC00163_n119TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00163_A121TBW03_CRT_USER_ID = new String[] {""} ;
      BC00163_n121TBW03_CRT_USER_ID = new boolean[] {false} ;
      BC00163_A122TBW03_UPD_USER_ID = new String[] {""} ;
      BC00163_n122TBW03_UPD_USER_ID = new boolean[] {false} ;
      sMode41 = "" ;
      BC00162_A110TBW03_SESSION_ID = new String[] {""} ;
      BC00162_A111TBW03_APP_ID = new String[] {""} ;
      BC00162_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC00162_A114TBW03_SUBJECT_ID = new int[1] ;
      BC00162_A715TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      BC00162_n715TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC00162_A716TBW03_CRF_LATEST_VERSION = new short[1] ;
      BC00162_n716TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00162_A717TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      BC00162_n717TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00162_A718TBW03_LOCK_FLG = new String[] {""} ;
      BC00162_n718TBW03_LOCK_FLG = new boolean[] {false} ;
      BC00162_A719TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n719TBW03_LOCK_DATETIME = new boolean[] {false} ;
      BC00162_A721TBW03_LOCK_AUTH_CD = new String[] {""} ;
      BC00162_n721TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00162_A722TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n722TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00162_A724TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00162_n724TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00162_A725TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00162_n725TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00162_A726TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n726TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00162_A727TBW03_APPROVAL_FLG = new String[] {""} ;
      BC00162_n727TBW03_APPROVAL_FLG = new boolean[] {false} ;
      BC00162_A728TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n728TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00162_A730TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00162_n730TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00162_A731TBW03_INPUT_END_FLG = new String[] {""} ;
      BC00162_n731TBW03_INPUT_END_FLG = new boolean[] {false} ;
      BC00162_A732TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n732TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00162_A734TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00162_n734TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00162_A780TBW03_DEL_FLG = new String[] {""} ;
      BC00162_n780TBW03_DEL_FLG = new boolean[] {false} ;
      BC00162_A781TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n781TBW03_CRT_DATETIME = new boolean[] {false} ;
      BC00162_A783TBW03_CRT_PROG_NM = new String[] {""} ;
      BC00162_n783TBW03_CRT_PROG_NM = new boolean[] {false} ;
      BC00162_A784TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n784TBW03_UPD_DATETIME = new boolean[] {false} ;
      BC00162_A786TBW03_UPD_PROG_NM = new String[] {""} ;
      BC00162_n786TBW03_UPD_PROG_NM = new boolean[] {false} ;
      BC00162_A787TBW03_UPD_CNT = new long[1] ;
      BC00162_n787TBW03_UPD_CNT = new boolean[] {false} ;
      BC00162_A113TBW03_STUDY_ID = new long[1] ;
      BC00162_A115TBW03_CRF_ID = new short[1] ;
      BC00162_A120TBW03_SITE_ID = new String[] {""} ;
      BC00162_n120TBW03_SITE_ID = new boolean[] {false} ;
      BC00162_A116TBW03_LOCK_USER_ID = new String[] {""} ;
      BC00162_n116TBW03_LOCK_USER_ID = new boolean[] {false} ;
      BC00162_A117TBW03_UPLOAD_USER_ID = new String[] {""} ;
      BC00162_n117TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00162_A118TBW03_APPROVAL_USER_ID = new String[] {""} ;
      BC00162_n118TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00162_A119TBW03_INPUT_END_USER_ID = new String[] {""} ;
      BC00162_n119TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00162_A121TBW03_CRT_USER_ID = new String[] {""} ;
      BC00162_n121TBW03_CRT_USER_ID = new boolean[] {false} ;
      BC00162_A122TBW03_UPD_USER_ID = new String[] {""} ;
      BC00162_n122TBW03_UPD_USER_ID = new boolean[] {false} ;
      BC001617_A110TBW03_SESSION_ID = new String[] {""} ;
      BC001617_A111TBW03_APP_ID = new String[] {""} ;
      BC001617_A112TBW03_DISP_DATETIME = new String[] {""} ;
      BC001617_A114TBW03_SUBJECT_ID = new int[1] ;
      BC001617_A710TBW03_CRF_NM = new String[] {""} ;
      BC001617_n710TBW03_CRF_NM = new boolean[] {false} ;
      BC001617_A711TBW03_CRF_SNM = new String[] {""} ;
      BC001617_n711TBW03_CRF_SNM = new boolean[] {false} ;
      BC001617_A712TBW03_CRF_ORDER = new int[1] ;
      BC001617_n712TBW03_CRF_ORDER = new boolean[] {false} ;
      BC001617_A713TBW03_SITE_NM = new String[] {""} ;
      BC001617_n713TBW03_SITE_NM = new boolean[] {false} ;
      BC001617_A714TBW03_SITE_RYAK_NM = new String[] {""} ;
      BC001617_n714TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      BC001617_A715TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      BC001617_n715TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC001617_A716TBW03_CRF_LATEST_VERSION = new short[1] ;
      BC001617_n716TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC001617_A717TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      BC001617_n717TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC001617_A718TBW03_LOCK_FLG = new String[] {""} ;
      BC001617_n718TBW03_LOCK_FLG = new boolean[] {false} ;
      BC001617_A719TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001617_n719TBW03_LOCK_DATETIME = new boolean[] {false} ;
      BC001617_A720TBW03_LOCK_USER_NM = new String[] {""} ;
      BC001617_n720TBW03_LOCK_USER_NM = new boolean[] {false} ;
      BC001617_A721TBW03_LOCK_AUTH_CD = new String[] {""} ;
      BC001617_n721TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      BC001617_A722TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001617_n722TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      BC001617_A723TBW03_UPLOAD_USER_NM = new String[] {""} ;
      BC001617_n723TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      BC001617_A724TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      BC001617_n724TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC001617_A725TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      BC001617_n725TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC001617_A726TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001617_n726TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC001617_A727TBW03_APPROVAL_FLG = new String[] {""} ;
      BC001617_n727TBW03_APPROVAL_FLG = new boolean[] {false} ;
      BC001617_A728TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001617_n728TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      BC001617_A729TBW03_APPROVAL_USER_NM = new String[] {""} ;
      BC001617_n729TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      BC001617_A730TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      BC001617_n730TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC001617_A731TBW03_INPUT_END_FLG = new String[] {""} ;
      BC001617_n731TBW03_INPUT_END_FLG = new boolean[] {false} ;
      BC001617_A732TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001617_n732TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      BC001617_A733TBW03_INPUT_END_USER_NM = new String[] {""} ;
      BC001617_n733TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      BC001617_A734TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      BC001617_n734TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC001617_A780TBW03_DEL_FLG = new String[] {""} ;
      BC001617_n780TBW03_DEL_FLG = new boolean[] {false} ;
      BC001617_A781TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001617_n781TBW03_CRT_DATETIME = new boolean[] {false} ;
      BC001617_A782TBW03_CRT_USER_NM = new String[] {""} ;
      BC001617_n782TBW03_CRT_USER_NM = new boolean[] {false} ;
      BC001617_A783TBW03_CRT_PROG_NM = new String[] {""} ;
      BC001617_n783TBW03_CRT_PROG_NM = new boolean[] {false} ;
      BC001617_A784TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001617_n784TBW03_UPD_DATETIME = new boolean[] {false} ;
      BC001617_A785TBW03_UPD_USER_NM = new String[] {""} ;
      BC001617_n785TBW03_UPD_USER_NM = new boolean[] {false} ;
      BC001617_A786TBW03_UPD_PROG_NM = new String[] {""} ;
      BC001617_n786TBW03_UPD_PROG_NM = new boolean[] {false} ;
      BC001617_A787TBW03_UPD_CNT = new long[1] ;
      BC001617_n787TBW03_UPD_CNT = new boolean[] {false} ;
      BC001617_A113TBW03_STUDY_ID = new long[1] ;
      BC001617_A115TBW03_CRF_ID = new short[1] ;
      BC001617_A120TBW03_SITE_ID = new String[] {""} ;
      BC001617_n120TBW03_SITE_ID = new boolean[] {false} ;
      BC001617_A116TBW03_LOCK_USER_ID = new String[] {""} ;
      BC001617_n116TBW03_LOCK_USER_ID = new boolean[] {false} ;
      BC001617_A117TBW03_UPLOAD_USER_ID = new String[] {""} ;
      BC001617_n117TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      BC001617_A118TBW03_APPROVAL_USER_ID = new String[] {""} ;
      BC001617_n118TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      BC001617_A119TBW03_INPUT_END_USER_ID = new String[] {""} ;
      BC001617_n119TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      BC001617_A121TBW03_CRT_USER_ID = new String[] {""} ;
      BC001617_n121TBW03_CRT_USER_ID = new boolean[] {false} ;
      BC001617_A122TBW03_UPD_USER_ID = new String[] {""} ;
      BC001617_n122TBW03_UPD_USER_ID = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw03_crf_search_bc__default(),
         new Object[] {
             new Object[] {
            BC00162_A110TBW03_SESSION_ID, BC00162_A111TBW03_APP_ID, BC00162_A112TBW03_DISP_DATETIME, BC00162_A114TBW03_SUBJECT_ID, BC00162_A715TBW03_OUTER_SUBJECT_ID, BC00162_n715TBW03_OUTER_SUBJECT_ID, BC00162_A716TBW03_CRF_LATEST_VERSION, BC00162_n716TBW03_CRF_LATEST_VERSION, BC00162_A717TBW03_CRF_INPUT_LEVEL, BC00162_n717TBW03_CRF_INPUT_LEVEL,
            BC00162_A718TBW03_LOCK_FLG, BC00162_n718TBW03_LOCK_FLG, BC00162_A719TBW03_LOCK_DATETIME, BC00162_n719TBW03_LOCK_DATETIME, BC00162_A721TBW03_LOCK_AUTH_CD, BC00162_n721TBW03_LOCK_AUTH_CD, BC00162_A722TBW03_UPLOAD_DATETIME, BC00162_n722TBW03_UPLOAD_DATETIME, BC00162_A724TBW03_UPLOAD_AUTH_CD, BC00162_n724TBW03_UPLOAD_AUTH_CD,
            BC00162_A725TBW03_DM_ARRIVAL_FLG, BC00162_n725TBW03_DM_ARRIVAL_FLG, BC00162_A726TBW03_DM_ARRIVAL_DATETIME, BC00162_n726TBW03_DM_ARRIVAL_DATETIME, BC00162_A727TBW03_APPROVAL_FLG, BC00162_n727TBW03_APPROVAL_FLG, BC00162_A728TBW03_APPROVAL_DATETIME, BC00162_n728TBW03_APPROVAL_DATETIME, BC00162_A730TBW03_APPROVAL_AUTH_CD, BC00162_n730TBW03_APPROVAL_AUTH_CD,
            BC00162_A731TBW03_INPUT_END_FLG, BC00162_n731TBW03_INPUT_END_FLG, BC00162_A732TBW03_INPUT_END_DATETIME, BC00162_n732TBW03_INPUT_END_DATETIME, BC00162_A734TBW03_INPUT_END_AUTH_CD, BC00162_n734TBW03_INPUT_END_AUTH_CD, BC00162_A780TBW03_DEL_FLG, BC00162_n780TBW03_DEL_FLG, BC00162_A781TBW03_CRT_DATETIME, BC00162_n781TBW03_CRT_DATETIME,
            BC00162_A783TBW03_CRT_PROG_NM, BC00162_n783TBW03_CRT_PROG_NM, BC00162_A784TBW03_UPD_DATETIME, BC00162_n784TBW03_UPD_DATETIME, BC00162_A786TBW03_UPD_PROG_NM, BC00162_n786TBW03_UPD_PROG_NM, BC00162_A787TBW03_UPD_CNT, BC00162_n787TBW03_UPD_CNT, BC00162_A113TBW03_STUDY_ID, BC00162_A115TBW03_CRF_ID,
            BC00162_A120TBW03_SITE_ID, BC00162_n120TBW03_SITE_ID, BC00162_A116TBW03_LOCK_USER_ID, BC00162_n116TBW03_LOCK_USER_ID, BC00162_A117TBW03_UPLOAD_USER_ID, BC00162_n117TBW03_UPLOAD_USER_ID, BC00162_A118TBW03_APPROVAL_USER_ID, BC00162_n118TBW03_APPROVAL_USER_ID, BC00162_A119TBW03_INPUT_END_USER_ID, BC00162_n119TBW03_INPUT_END_USER_ID,
            BC00162_A121TBW03_CRT_USER_ID, BC00162_n121TBW03_CRT_USER_ID, BC00162_A122TBW03_UPD_USER_ID, BC00162_n122TBW03_UPD_USER_ID
            }
            , new Object[] {
            BC00163_A110TBW03_SESSION_ID, BC00163_A111TBW03_APP_ID, BC00163_A112TBW03_DISP_DATETIME, BC00163_A114TBW03_SUBJECT_ID, BC00163_A715TBW03_OUTER_SUBJECT_ID, BC00163_n715TBW03_OUTER_SUBJECT_ID, BC00163_A716TBW03_CRF_LATEST_VERSION, BC00163_n716TBW03_CRF_LATEST_VERSION, BC00163_A717TBW03_CRF_INPUT_LEVEL, BC00163_n717TBW03_CRF_INPUT_LEVEL,
            BC00163_A718TBW03_LOCK_FLG, BC00163_n718TBW03_LOCK_FLG, BC00163_A719TBW03_LOCK_DATETIME, BC00163_n719TBW03_LOCK_DATETIME, BC00163_A721TBW03_LOCK_AUTH_CD, BC00163_n721TBW03_LOCK_AUTH_CD, BC00163_A722TBW03_UPLOAD_DATETIME, BC00163_n722TBW03_UPLOAD_DATETIME, BC00163_A724TBW03_UPLOAD_AUTH_CD, BC00163_n724TBW03_UPLOAD_AUTH_CD,
            BC00163_A725TBW03_DM_ARRIVAL_FLG, BC00163_n725TBW03_DM_ARRIVAL_FLG, BC00163_A726TBW03_DM_ARRIVAL_DATETIME, BC00163_n726TBW03_DM_ARRIVAL_DATETIME, BC00163_A727TBW03_APPROVAL_FLG, BC00163_n727TBW03_APPROVAL_FLG, BC00163_A728TBW03_APPROVAL_DATETIME, BC00163_n728TBW03_APPROVAL_DATETIME, BC00163_A730TBW03_APPROVAL_AUTH_CD, BC00163_n730TBW03_APPROVAL_AUTH_CD,
            BC00163_A731TBW03_INPUT_END_FLG, BC00163_n731TBW03_INPUT_END_FLG, BC00163_A732TBW03_INPUT_END_DATETIME, BC00163_n732TBW03_INPUT_END_DATETIME, BC00163_A734TBW03_INPUT_END_AUTH_CD, BC00163_n734TBW03_INPUT_END_AUTH_CD, BC00163_A780TBW03_DEL_FLG, BC00163_n780TBW03_DEL_FLG, BC00163_A781TBW03_CRT_DATETIME, BC00163_n781TBW03_CRT_DATETIME,
            BC00163_A783TBW03_CRT_PROG_NM, BC00163_n783TBW03_CRT_PROG_NM, BC00163_A784TBW03_UPD_DATETIME, BC00163_n784TBW03_UPD_DATETIME, BC00163_A786TBW03_UPD_PROG_NM, BC00163_n786TBW03_UPD_PROG_NM, BC00163_A787TBW03_UPD_CNT, BC00163_n787TBW03_UPD_CNT, BC00163_A113TBW03_STUDY_ID, BC00163_A115TBW03_CRF_ID,
            BC00163_A120TBW03_SITE_ID, BC00163_n120TBW03_SITE_ID, BC00163_A116TBW03_LOCK_USER_ID, BC00163_n116TBW03_LOCK_USER_ID, BC00163_A117TBW03_UPLOAD_USER_ID, BC00163_n117TBW03_UPLOAD_USER_ID, BC00163_A118TBW03_APPROVAL_USER_ID, BC00163_n118TBW03_APPROVAL_USER_ID, BC00163_A119TBW03_INPUT_END_USER_ID, BC00163_n119TBW03_INPUT_END_USER_ID,
            BC00163_A121TBW03_CRT_USER_ID, BC00163_n121TBW03_CRT_USER_ID, BC00163_A122TBW03_UPD_USER_ID, BC00163_n122TBW03_UPD_USER_ID
            }
            , new Object[] {
            BC00164_A710TBW03_CRF_NM, BC00164_n710TBW03_CRF_NM, BC00164_A711TBW03_CRF_SNM, BC00164_n711TBW03_CRF_SNM, BC00164_A712TBW03_CRF_ORDER, BC00164_n712TBW03_CRF_ORDER
            }
            , new Object[] {
            BC00165_A713TBW03_SITE_NM, BC00165_n713TBW03_SITE_NM, BC00165_A714TBW03_SITE_RYAK_NM, BC00165_n714TBW03_SITE_RYAK_NM
            }
            , new Object[] {
            BC00166_A720TBW03_LOCK_USER_NM, BC00166_n720TBW03_LOCK_USER_NM
            }
            , new Object[] {
            BC00167_A723TBW03_UPLOAD_USER_NM, BC00167_n723TBW03_UPLOAD_USER_NM
            }
            , new Object[] {
            BC00168_A729TBW03_APPROVAL_USER_NM, BC00168_n729TBW03_APPROVAL_USER_NM
            }
            , new Object[] {
            BC00169_A733TBW03_INPUT_END_USER_NM, BC00169_n733TBW03_INPUT_END_USER_NM
            }
            , new Object[] {
            BC001610_A782TBW03_CRT_USER_NM, BC001610_n782TBW03_CRT_USER_NM
            }
            , new Object[] {
            BC001611_A785TBW03_UPD_USER_NM, BC001611_n785TBW03_UPD_USER_NM
            }
            , new Object[] {
            BC001612_A110TBW03_SESSION_ID, BC001612_A111TBW03_APP_ID, BC001612_A112TBW03_DISP_DATETIME, BC001612_A114TBW03_SUBJECT_ID, BC001612_A710TBW03_CRF_NM, BC001612_n710TBW03_CRF_NM, BC001612_A711TBW03_CRF_SNM, BC001612_n711TBW03_CRF_SNM, BC001612_A712TBW03_CRF_ORDER, BC001612_n712TBW03_CRF_ORDER,
            BC001612_A713TBW03_SITE_NM, BC001612_n713TBW03_SITE_NM, BC001612_A714TBW03_SITE_RYAK_NM, BC001612_n714TBW03_SITE_RYAK_NM, BC001612_A715TBW03_OUTER_SUBJECT_ID, BC001612_n715TBW03_OUTER_SUBJECT_ID, BC001612_A716TBW03_CRF_LATEST_VERSION, BC001612_n716TBW03_CRF_LATEST_VERSION, BC001612_A717TBW03_CRF_INPUT_LEVEL, BC001612_n717TBW03_CRF_INPUT_LEVEL,
            BC001612_A718TBW03_LOCK_FLG, BC001612_n718TBW03_LOCK_FLG, BC001612_A719TBW03_LOCK_DATETIME, BC001612_n719TBW03_LOCK_DATETIME, BC001612_A720TBW03_LOCK_USER_NM, BC001612_n720TBW03_LOCK_USER_NM, BC001612_A721TBW03_LOCK_AUTH_CD, BC001612_n721TBW03_LOCK_AUTH_CD, BC001612_A722TBW03_UPLOAD_DATETIME, BC001612_n722TBW03_UPLOAD_DATETIME,
            BC001612_A723TBW03_UPLOAD_USER_NM, BC001612_n723TBW03_UPLOAD_USER_NM, BC001612_A724TBW03_UPLOAD_AUTH_CD, BC001612_n724TBW03_UPLOAD_AUTH_CD, BC001612_A725TBW03_DM_ARRIVAL_FLG, BC001612_n725TBW03_DM_ARRIVAL_FLG, BC001612_A726TBW03_DM_ARRIVAL_DATETIME, BC001612_n726TBW03_DM_ARRIVAL_DATETIME, BC001612_A727TBW03_APPROVAL_FLG, BC001612_n727TBW03_APPROVAL_FLG,
            BC001612_A728TBW03_APPROVAL_DATETIME, BC001612_n728TBW03_APPROVAL_DATETIME, BC001612_A729TBW03_APPROVAL_USER_NM, BC001612_n729TBW03_APPROVAL_USER_NM, BC001612_A730TBW03_APPROVAL_AUTH_CD, BC001612_n730TBW03_APPROVAL_AUTH_CD, BC001612_A731TBW03_INPUT_END_FLG, BC001612_n731TBW03_INPUT_END_FLG, BC001612_A732TBW03_INPUT_END_DATETIME, BC001612_n732TBW03_INPUT_END_DATETIME,
            BC001612_A733TBW03_INPUT_END_USER_NM, BC001612_n733TBW03_INPUT_END_USER_NM, BC001612_A734TBW03_INPUT_END_AUTH_CD, BC001612_n734TBW03_INPUT_END_AUTH_CD, BC001612_A780TBW03_DEL_FLG, BC001612_n780TBW03_DEL_FLG, BC001612_A781TBW03_CRT_DATETIME, BC001612_n781TBW03_CRT_DATETIME, BC001612_A782TBW03_CRT_USER_NM, BC001612_n782TBW03_CRT_USER_NM,
            BC001612_A783TBW03_CRT_PROG_NM, BC001612_n783TBW03_CRT_PROG_NM, BC001612_A784TBW03_UPD_DATETIME, BC001612_n784TBW03_UPD_DATETIME, BC001612_A785TBW03_UPD_USER_NM, BC001612_n785TBW03_UPD_USER_NM, BC001612_A786TBW03_UPD_PROG_NM, BC001612_n786TBW03_UPD_PROG_NM, BC001612_A787TBW03_UPD_CNT, BC001612_n787TBW03_UPD_CNT,
            BC001612_A113TBW03_STUDY_ID, BC001612_A115TBW03_CRF_ID, BC001612_A120TBW03_SITE_ID, BC001612_n120TBW03_SITE_ID, BC001612_A116TBW03_LOCK_USER_ID, BC001612_n116TBW03_LOCK_USER_ID, BC001612_A117TBW03_UPLOAD_USER_ID, BC001612_n117TBW03_UPLOAD_USER_ID, BC001612_A118TBW03_APPROVAL_USER_ID, BC001612_n118TBW03_APPROVAL_USER_ID,
            BC001612_A119TBW03_INPUT_END_USER_ID, BC001612_n119TBW03_INPUT_END_USER_ID, BC001612_A121TBW03_CRT_USER_ID, BC001612_n121TBW03_CRT_USER_ID, BC001612_A122TBW03_UPD_USER_ID, BC001612_n122TBW03_UPD_USER_ID
            }
            , new Object[] {
            BC001613_A110TBW03_SESSION_ID, BC001613_A111TBW03_APP_ID, BC001613_A112TBW03_DISP_DATETIME, BC001613_A113TBW03_STUDY_ID, BC001613_A114TBW03_SUBJECT_ID, BC001613_A115TBW03_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001617_A110TBW03_SESSION_ID, BC001617_A111TBW03_APP_ID, BC001617_A112TBW03_DISP_DATETIME, BC001617_A114TBW03_SUBJECT_ID, BC001617_A710TBW03_CRF_NM, BC001617_n710TBW03_CRF_NM, BC001617_A711TBW03_CRF_SNM, BC001617_n711TBW03_CRF_SNM, BC001617_A712TBW03_CRF_ORDER, BC001617_n712TBW03_CRF_ORDER,
            BC001617_A713TBW03_SITE_NM, BC001617_n713TBW03_SITE_NM, BC001617_A714TBW03_SITE_RYAK_NM, BC001617_n714TBW03_SITE_RYAK_NM, BC001617_A715TBW03_OUTER_SUBJECT_ID, BC001617_n715TBW03_OUTER_SUBJECT_ID, BC001617_A716TBW03_CRF_LATEST_VERSION, BC001617_n716TBW03_CRF_LATEST_VERSION, BC001617_A717TBW03_CRF_INPUT_LEVEL, BC001617_n717TBW03_CRF_INPUT_LEVEL,
            BC001617_A718TBW03_LOCK_FLG, BC001617_n718TBW03_LOCK_FLG, BC001617_A719TBW03_LOCK_DATETIME, BC001617_n719TBW03_LOCK_DATETIME, BC001617_A720TBW03_LOCK_USER_NM, BC001617_n720TBW03_LOCK_USER_NM, BC001617_A721TBW03_LOCK_AUTH_CD, BC001617_n721TBW03_LOCK_AUTH_CD, BC001617_A722TBW03_UPLOAD_DATETIME, BC001617_n722TBW03_UPLOAD_DATETIME,
            BC001617_A723TBW03_UPLOAD_USER_NM, BC001617_n723TBW03_UPLOAD_USER_NM, BC001617_A724TBW03_UPLOAD_AUTH_CD, BC001617_n724TBW03_UPLOAD_AUTH_CD, BC001617_A725TBW03_DM_ARRIVAL_FLG, BC001617_n725TBW03_DM_ARRIVAL_FLG, BC001617_A726TBW03_DM_ARRIVAL_DATETIME, BC001617_n726TBW03_DM_ARRIVAL_DATETIME, BC001617_A727TBW03_APPROVAL_FLG, BC001617_n727TBW03_APPROVAL_FLG,
            BC001617_A728TBW03_APPROVAL_DATETIME, BC001617_n728TBW03_APPROVAL_DATETIME, BC001617_A729TBW03_APPROVAL_USER_NM, BC001617_n729TBW03_APPROVAL_USER_NM, BC001617_A730TBW03_APPROVAL_AUTH_CD, BC001617_n730TBW03_APPROVAL_AUTH_CD, BC001617_A731TBW03_INPUT_END_FLG, BC001617_n731TBW03_INPUT_END_FLG, BC001617_A732TBW03_INPUT_END_DATETIME, BC001617_n732TBW03_INPUT_END_DATETIME,
            BC001617_A733TBW03_INPUT_END_USER_NM, BC001617_n733TBW03_INPUT_END_USER_NM, BC001617_A734TBW03_INPUT_END_AUTH_CD, BC001617_n734TBW03_INPUT_END_AUTH_CD, BC001617_A780TBW03_DEL_FLG, BC001617_n780TBW03_DEL_FLG, BC001617_A781TBW03_CRT_DATETIME, BC001617_n781TBW03_CRT_DATETIME, BC001617_A782TBW03_CRT_USER_NM, BC001617_n782TBW03_CRT_USER_NM,
            BC001617_A783TBW03_CRT_PROG_NM, BC001617_n783TBW03_CRT_PROG_NM, BC001617_A784TBW03_UPD_DATETIME, BC001617_n784TBW03_UPD_DATETIME, BC001617_A785TBW03_UPD_USER_NM, BC001617_n785TBW03_UPD_USER_NM, BC001617_A786TBW03_UPD_PROG_NM, BC001617_n786TBW03_UPD_PROG_NM, BC001617_A787TBW03_UPD_CNT, BC001617_n787TBW03_UPD_CNT,
            BC001617_A113TBW03_STUDY_ID, BC001617_A115TBW03_CRF_ID, BC001617_A120TBW03_SITE_ID, BC001617_n120TBW03_SITE_ID, BC001617_A116TBW03_LOCK_USER_ID, BC001617_n116TBW03_LOCK_USER_ID, BC001617_A117TBW03_UPLOAD_USER_ID, BC001617_n117TBW03_UPLOAD_USER_ID, BC001617_A118TBW03_APPROVAL_USER_ID, BC001617_n118TBW03_APPROVAL_USER_ID,
            BC001617_A119TBW03_INPUT_END_USER_ID, BC001617_n119TBW03_INPUT_END_USER_ID, BC001617_A121TBW03_CRT_USER_ID, BC001617_n121TBW03_CRT_USER_ID, BC001617_A122TBW03_UPD_USER_ID, BC001617_n122TBW03_UPD_USER_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW03_CRF_SEARCH_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11162 */
      e11162 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z717TBW03_CRF_INPUT_LEVEL ;
   private byte A717TBW03_CRF_INPUT_LEVEL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z115TBW03_CRF_ID ;
   private short A115TBW03_CRF_ID ;
   private short Z716TBW03_CRF_LATEST_VERSION ;
   private short A716TBW03_CRF_LATEST_VERSION ;
   private short RcdFound41 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z114TBW03_SUBJECT_ID ;
   private int A114TBW03_SUBJECT_ID ;
   private int GX_JID ;
   private int Z712TBW03_CRF_ORDER ;
   private int A712TBW03_CRF_ORDER ;
   private int GXActiveErrHndl ;
   private long Z113TBW03_STUDY_ID ;
   private long A113TBW03_STUDY_ID ;
   private long Z787TBW03_UPD_CNT ;
   private long A787TBW03_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode41 ;
   private String Gx_emsg ;
   private java.util.Date Z719TBW03_LOCK_DATETIME ;
   private java.util.Date A719TBW03_LOCK_DATETIME ;
   private java.util.Date Z722TBW03_UPLOAD_DATETIME ;
   private java.util.Date A722TBW03_UPLOAD_DATETIME ;
   private java.util.Date Z726TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date A726TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z728TBW03_APPROVAL_DATETIME ;
   private java.util.Date A728TBW03_APPROVAL_DATETIME ;
   private java.util.Date Z732TBW03_INPUT_END_DATETIME ;
   private java.util.Date A732TBW03_INPUT_END_DATETIME ;
   private java.util.Date Z781TBW03_CRT_DATETIME ;
   private java.util.Date A781TBW03_CRT_DATETIME ;
   private java.util.Date Z784TBW03_UPD_DATETIME ;
   private java.util.Date A784TBW03_UPD_DATETIME ;
   private boolean n710TBW03_CRF_NM ;
   private boolean n711TBW03_CRF_SNM ;
   private boolean n712TBW03_CRF_ORDER ;
   private boolean n713TBW03_SITE_NM ;
   private boolean n714TBW03_SITE_RYAK_NM ;
   private boolean n715TBW03_OUTER_SUBJECT_ID ;
   private boolean n716TBW03_CRF_LATEST_VERSION ;
   private boolean n717TBW03_CRF_INPUT_LEVEL ;
   private boolean n718TBW03_LOCK_FLG ;
   private boolean n719TBW03_LOCK_DATETIME ;
   private boolean n720TBW03_LOCK_USER_NM ;
   private boolean n721TBW03_LOCK_AUTH_CD ;
   private boolean n722TBW03_UPLOAD_DATETIME ;
   private boolean n723TBW03_UPLOAD_USER_NM ;
   private boolean n724TBW03_UPLOAD_AUTH_CD ;
   private boolean n725TBW03_DM_ARRIVAL_FLG ;
   private boolean n726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean n727TBW03_APPROVAL_FLG ;
   private boolean n728TBW03_APPROVAL_DATETIME ;
   private boolean n729TBW03_APPROVAL_USER_NM ;
   private boolean n730TBW03_APPROVAL_AUTH_CD ;
   private boolean n731TBW03_INPUT_END_FLG ;
   private boolean n732TBW03_INPUT_END_DATETIME ;
   private boolean n733TBW03_INPUT_END_USER_NM ;
   private boolean n734TBW03_INPUT_END_AUTH_CD ;
   private boolean n780TBW03_DEL_FLG ;
   private boolean n781TBW03_CRT_DATETIME ;
   private boolean n782TBW03_CRT_USER_NM ;
   private boolean n783TBW03_CRT_PROG_NM ;
   private boolean n784TBW03_UPD_DATETIME ;
   private boolean n785TBW03_UPD_USER_NM ;
   private boolean n786TBW03_UPD_PROG_NM ;
   private boolean n787TBW03_UPD_CNT ;
   private boolean n120TBW03_SITE_ID ;
   private boolean n116TBW03_LOCK_USER_ID ;
   private boolean n117TBW03_UPLOAD_USER_ID ;
   private boolean n118TBW03_APPROVAL_USER_ID ;
   private boolean n119TBW03_INPUT_END_USER_ID ;
   private boolean n121TBW03_CRT_USER_ID ;
   private boolean n122TBW03_UPD_USER_ID ;
   private boolean Gx_longc ;
   private String Z110TBW03_SESSION_ID ;
   private String A110TBW03_SESSION_ID ;
   private String Z111TBW03_APP_ID ;
   private String A111TBW03_APP_ID ;
   private String Z112TBW03_DISP_DATETIME ;
   private String A112TBW03_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private String Z715TBW03_OUTER_SUBJECT_ID ;
   private String A715TBW03_OUTER_SUBJECT_ID ;
   private String Z718TBW03_LOCK_FLG ;
   private String A718TBW03_LOCK_FLG ;
   private String Z721TBW03_LOCK_AUTH_CD ;
   private String A721TBW03_LOCK_AUTH_CD ;
   private String Z724TBW03_UPLOAD_AUTH_CD ;
   private String A724TBW03_UPLOAD_AUTH_CD ;
   private String Z725TBW03_DM_ARRIVAL_FLG ;
   private String A725TBW03_DM_ARRIVAL_FLG ;
   private String Z727TBW03_APPROVAL_FLG ;
   private String A727TBW03_APPROVAL_FLG ;
   private String Z730TBW03_APPROVAL_AUTH_CD ;
   private String A730TBW03_APPROVAL_AUTH_CD ;
   private String Z731TBW03_INPUT_END_FLG ;
   private String A731TBW03_INPUT_END_FLG ;
   private String Z734TBW03_INPUT_END_AUTH_CD ;
   private String A734TBW03_INPUT_END_AUTH_CD ;
   private String Z780TBW03_DEL_FLG ;
   private String A780TBW03_DEL_FLG ;
   private String Z783TBW03_CRT_PROG_NM ;
   private String A783TBW03_CRT_PROG_NM ;
   private String Z786TBW03_UPD_PROG_NM ;
   private String A786TBW03_UPD_PROG_NM ;
   private String Z120TBW03_SITE_ID ;
   private String A120TBW03_SITE_ID ;
   private String Z116TBW03_LOCK_USER_ID ;
   private String A116TBW03_LOCK_USER_ID ;
   private String Z117TBW03_UPLOAD_USER_ID ;
   private String A117TBW03_UPLOAD_USER_ID ;
   private String Z118TBW03_APPROVAL_USER_ID ;
   private String A118TBW03_APPROVAL_USER_ID ;
   private String Z119TBW03_INPUT_END_USER_ID ;
   private String A119TBW03_INPUT_END_USER_ID ;
   private String Z121TBW03_CRT_USER_ID ;
   private String A121TBW03_CRT_USER_ID ;
   private String Z122TBW03_UPD_USER_ID ;
   private String A122TBW03_UPD_USER_ID ;
   private String Z710TBW03_CRF_NM ;
   private String A710TBW03_CRF_NM ;
   private String Z711TBW03_CRF_SNM ;
   private String A711TBW03_CRF_SNM ;
   private String Z713TBW03_SITE_NM ;
   private String A713TBW03_SITE_NM ;
   private String Z714TBW03_SITE_RYAK_NM ;
   private String A714TBW03_SITE_RYAK_NM ;
   private String Z720TBW03_LOCK_USER_NM ;
   private String A720TBW03_LOCK_USER_NM ;
   private String Z723TBW03_UPLOAD_USER_NM ;
   private String A723TBW03_UPLOAD_USER_NM ;
   private String Z729TBW03_APPROVAL_USER_NM ;
   private String A729TBW03_APPROVAL_USER_NM ;
   private String Z733TBW03_INPUT_END_USER_NM ;
   private String A733TBW03_INPUT_END_USER_NM ;
   private String Z782TBW03_CRT_USER_NM ;
   private String A782TBW03_CRT_USER_NM ;
   private String Z785TBW03_UPD_USER_NM ;
   private String A785TBW03_UPD_USER_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW03_CRF_SEARCH bcTBW03_CRF_SEARCH ;
   private IDataStoreProvider pr_default ;
   private String[] BC001612_A110TBW03_SESSION_ID ;
   private String[] BC001612_A111TBW03_APP_ID ;
   private String[] BC001612_A112TBW03_DISP_DATETIME ;
   private int[] BC001612_A114TBW03_SUBJECT_ID ;
   private String[] BC001612_A710TBW03_CRF_NM ;
   private boolean[] BC001612_n710TBW03_CRF_NM ;
   private String[] BC001612_A711TBW03_CRF_SNM ;
   private boolean[] BC001612_n711TBW03_CRF_SNM ;
   private int[] BC001612_A712TBW03_CRF_ORDER ;
   private boolean[] BC001612_n712TBW03_CRF_ORDER ;
   private String[] BC001612_A713TBW03_SITE_NM ;
   private boolean[] BC001612_n713TBW03_SITE_NM ;
   private String[] BC001612_A714TBW03_SITE_RYAK_NM ;
   private boolean[] BC001612_n714TBW03_SITE_RYAK_NM ;
   private String[] BC001612_A715TBW03_OUTER_SUBJECT_ID ;
   private boolean[] BC001612_n715TBW03_OUTER_SUBJECT_ID ;
   private short[] BC001612_A716TBW03_CRF_LATEST_VERSION ;
   private boolean[] BC001612_n716TBW03_CRF_LATEST_VERSION ;
   private byte[] BC001612_A717TBW03_CRF_INPUT_LEVEL ;
   private boolean[] BC001612_n717TBW03_CRF_INPUT_LEVEL ;
   private String[] BC001612_A718TBW03_LOCK_FLG ;
   private boolean[] BC001612_n718TBW03_LOCK_FLG ;
   private java.util.Date[] BC001612_A719TBW03_LOCK_DATETIME ;
   private boolean[] BC001612_n719TBW03_LOCK_DATETIME ;
   private String[] BC001612_A720TBW03_LOCK_USER_NM ;
   private boolean[] BC001612_n720TBW03_LOCK_USER_NM ;
   private String[] BC001612_A721TBW03_LOCK_AUTH_CD ;
   private boolean[] BC001612_n721TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] BC001612_A722TBW03_UPLOAD_DATETIME ;
   private boolean[] BC001612_n722TBW03_UPLOAD_DATETIME ;
   private String[] BC001612_A723TBW03_UPLOAD_USER_NM ;
   private boolean[] BC001612_n723TBW03_UPLOAD_USER_NM ;
   private String[] BC001612_A724TBW03_UPLOAD_AUTH_CD ;
   private boolean[] BC001612_n724TBW03_UPLOAD_AUTH_CD ;
   private String[] BC001612_A725TBW03_DM_ARRIVAL_FLG ;
   private boolean[] BC001612_n725TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC001612_A726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] BC001612_n726TBW03_DM_ARRIVAL_DATETIME ;
   private String[] BC001612_A727TBW03_APPROVAL_FLG ;
   private boolean[] BC001612_n727TBW03_APPROVAL_FLG ;
   private java.util.Date[] BC001612_A728TBW03_APPROVAL_DATETIME ;
   private boolean[] BC001612_n728TBW03_APPROVAL_DATETIME ;
   private String[] BC001612_A729TBW03_APPROVAL_USER_NM ;
   private boolean[] BC001612_n729TBW03_APPROVAL_USER_NM ;
   private String[] BC001612_A730TBW03_APPROVAL_AUTH_CD ;
   private boolean[] BC001612_n730TBW03_APPROVAL_AUTH_CD ;
   private String[] BC001612_A731TBW03_INPUT_END_FLG ;
   private boolean[] BC001612_n731TBW03_INPUT_END_FLG ;
   private java.util.Date[] BC001612_A732TBW03_INPUT_END_DATETIME ;
   private boolean[] BC001612_n732TBW03_INPUT_END_DATETIME ;
   private String[] BC001612_A733TBW03_INPUT_END_USER_NM ;
   private boolean[] BC001612_n733TBW03_INPUT_END_USER_NM ;
   private String[] BC001612_A734TBW03_INPUT_END_AUTH_CD ;
   private boolean[] BC001612_n734TBW03_INPUT_END_AUTH_CD ;
   private String[] BC001612_A780TBW03_DEL_FLG ;
   private boolean[] BC001612_n780TBW03_DEL_FLG ;
   private java.util.Date[] BC001612_A781TBW03_CRT_DATETIME ;
   private boolean[] BC001612_n781TBW03_CRT_DATETIME ;
   private String[] BC001612_A782TBW03_CRT_USER_NM ;
   private boolean[] BC001612_n782TBW03_CRT_USER_NM ;
   private String[] BC001612_A783TBW03_CRT_PROG_NM ;
   private boolean[] BC001612_n783TBW03_CRT_PROG_NM ;
   private java.util.Date[] BC001612_A784TBW03_UPD_DATETIME ;
   private boolean[] BC001612_n784TBW03_UPD_DATETIME ;
   private String[] BC001612_A785TBW03_UPD_USER_NM ;
   private boolean[] BC001612_n785TBW03_UPD_USER_NM ;
   private String[] BC001612_A786TBW03_UPD_PROG_NM ;
   private boolean[] BC001612_n786TBW03_UPD_PROG_NM ;
   private long[] BC001612_A787TBW03_UPD_CNT ;
   private boolean[] BC001612_n787TBW03_UPD_CNT ;
   private long[] BC001612_A113TBW03_STUDY_ID ;
   private short[] BC001612_A115TBW03_CRF_ID ;
   private String[] BC001612_A120TBW03_SITE_ID ;
   private boolean[] BC001612_n120TBW03_SITE_ID ;
   private String[] BC001612_A116TBW03_LOCK_USER_ID ;
   private boolean[] BC001612_n116TBW03_LOCK_USER_ID ;
   private String[] BC001612_A117TBW03_UPLOAD_USER_ID ;
   private boolean[] BC001612_n117TBW03_UPLOAD_USER_ID ;
   private String[] BC001612_A118TBW03_APPROVAL_USER_ID ;
   private boolean[] BC001612_n118TBW03_APPROVAL_USER_ID ;
   private String[] BC001612_A119TBW03_INPUT_END_USER_ID ;
   private boolean[] BC001612_n119TBW03_INPUT_END_USER_ID ;
   private String[] BC001612_A121TBW03_CRT_USER_ID ;
   private boolean[] BC001612_n121TBW03_CRT_USER_ID ;
   private String[] BC001612_A122TBW03_UPD_USER_ID ;
   private boolean[] BC001612_n122TBW03_UPD_USER_ID ;
   private String[] BC00164_A710TBW03_CRF_NM ;
   private boolean[] BC00164_n710TBW03_CRF_NM ;
   private String[] BC00164_A711TBW03_CRF_SNM ;
   private boolean[] BC00164_n711TBW03_CRF_SNM ;
   private int[] BC00164_A712TBW03_CRF_ORDER ;
   private boolean[] BC00164_n712TBW03_CRF_ORDER ;
   private String[] BC00165_A713TBW03_SITE_NM ;
   private boolean[] BC00165_n713TBW03_SITE_NM ;
   private String[] BC00165_A714TBW03_SITE_RYAK_NM ;
   private boolean[] BC00165_n714TBW03_SITE_RYAK_NM ;
   private String[] BC00166_A720TBW03_LOCK_USER_NM ;
   private boolean[] BC00166_n720TBW03_LOCK_USER_NM ;
   private String[] BC00167_A723TBW03_UPLOAD_USER_NM ;
   private boolean[] BC00167_n723TBW03_UPLOAD_USER_NM ;
   private String[] BC00168_A729TBW03_APPROVAL_USER_NM ;
   private boolean[] BC00168_n729TBW03_APPROVAL_USER_NM ;
   private String[] BC00169_A733TBW03_INPUT_END_USER_NM ;
   private boolean[] BC00169_n733TBW03_INPUT_END_USER_NM ;
   private String[] BC001610_A782TBW03_CRT_USER_NM ;
   private boolean[] BC001610_n782TBW03_CRT_USER_NM ;
   private String[] BC001611_A785TBW03_UPD_USER_NM ;
   private boolean[] BC001611_n785TBW03_UPD_USER_NM ;
   private String[] BC001613_A110TBW03_SESSION_ID ;
   private String[] BC001613_A111TBW03_APP_ID ;
   private String[] BC001613_A112TBW03_DISP_DATETIME ;
   private long[] BC001613_A113TBW03_STUDY_ID ;
   private int[] BC001613_A114TBW03_SUBJECT_ID ;
   private short[] BC001613_A115TBW03_CRF_ID ;
   private String[] BC00163_A110TBW03_SESSION_ID ;
   private String[] BC00163_A111TBW03_APP_ID ;
   private String[] BC00163_A112TBW03_DISP_DATETIME ;
   private int[] BC00163_A114TBW03_SUBJECT_ID ;
   private String[] BC00163_A715TBW03_OUTER_SUBJECT_ID ;
   private boolean[] BC00163_n715TBW03_OUTER_SUBJECT_ID ;
   private short[] BC00163_A716TBW03_CRF_LATEST_VERSION ;
   private boolean[] BC00163_n716TBW03_CRF_LATEST_VERSION ;
   private byte[] BC00163_A717TBW03_CRF_INPUT_LEVEL ;
   private boolean[] BC00163_n717TBW03_CRF_INPUT_LEVEL ;
   private String[] BC00163_A718TBW03_LOCK_FLG ;
   private boolean[] BC00163_n718TBW03_LOCK_FLG ;
   private java.util.Date[] BC00163_A719TBW03_LOCK_DATETIME ;
   private boolean[] BC00163_n719TBW03_LOCK_DATETIME ;
   private String[] BC00163_A721TBW03_LOCK_AUTH_CD ;
   private boolean[] BC00163_n721TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] BC00163_A722TBW03_UPLOAD_DATETIME ;
   private boolean[] BC00163_n722TBW03_UPLOAD_DATETIME ;
   private String[] BC00163_A724TBW03_UPLOAD_AUTH_CD ;
   private boolean[] BC00163_n724TBW03_UPLOAD_AUTH_CD ;
   private String[] BC00163_A725TBW03_DM_ARRIVAL_FLG ;
   private boolean[] BC00163_n725TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00163_A726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00163_n726TBW03_DM_ARRIVAL_DATETIME ;
   private String[] BC00163_A727TBW03_APPROVAL_FLG ;
   private boolean[] BC00163_n727TBW03_APPROVAL_FLG ;
   private java.util.Date[] BC00163_A728TBW03_APPROVAL_DATETIME ;
   private boolean[] BC00163_n728TBW03_APPROVAL_DATETIME ;
   private String[] BC00163_A730TBW03_APPROVAL_AUTH_CD ;
   private boolean[] BC00163_n730TBW03_APPROVAL_AUTH_CD ;
   private String[] BC00163_A731TBW03_INPUT_END_FLG ;
   private boolean[] BC00163_n731TBW03_INPUT_END_FLG ;
   private java.util.Date[] BC00163_A732TBW03_INPUT_END_DATETIME ;
   private boolean[] BC00163_n732TBW03_INPUT_END_DATETIME ;
   private String[] BC00163_A734TBW03_INPUT_END_AUTH_CD ;
   private boolean[] BC00163_n734TBW03_INPUT_END_AUTH_CD ;
   private String[] BC00163_A780TBW03_DEL_FLG ;
   private boolean[] BC00163_n780TBW03_DEL_FLG ;
   private java.util.Date[] BC00163_A781TBW03_CRT_DATETIME ;
   private boolean[] BC00163_n781TBW03_CRT_DATETIME ;
   private String[] BC00163_A783TBW03_CRT_PROG_NM ;
   private boolean[] BC00163_n783TBW03_CRT_PROG_NM ;
   private java.util.Date[] BC00163_A784TBW03_UPD_DATETIME ;
   private boolean[] BC00163_n784TBW03_UPD_DATETIME ;
   private String[] BC00163_A786TBW03_UPD_PROG_NM ;
   private boolean[] BC00163_n786TBW03_UPD_PROG_NM ;
   private long[] BC00163_A787TBW03_UPD_CNT ;
   private boolean[] BC00163_n787TBW03_UPD_CNT ;
   private long[] BC00163_A113TBW03_STUDY_ID ;
   private short[] BC00163_A115TBW03_CRF_ID ;
   private String[] BC00163_A120TBW03_SITE_ID ;
   private boolean[] BC00163_n120TBW03_SITE_ID ;
   private String[] BC00163_A116TBW03_LOCK_USER_ID ;
   private boolean[] BC00163_n116TBW03_LOCK_USER_ID ;
   private String[] BC00163_A117TBW03_UPLOAD_USER_ID ;
   private boolean[] BC00163_n117TBW03_UPLOAD_USER_ID ;
   private String[] BC00163_A118TBW03_APPROVAL_USER_ID ;
   private boolean[] BC00163_n118TBW03_APPROVAL_USER_ID ;
   private String[] BC00163_A119TBW03_INPUT_END_USER_ID ;
   private boolean[] BC00163_n119TBW03_INPUT_END_USER_ID ;
   private String[] BC00163_A121TBW03_CRT_USER_ID ;
   private boolean[] BC00163_n121TBW03_CRT_USER_ID ;
   private String[] BC00163_A122TBW03_UPD_USER_ID ;
   private boolean[] BC00163_n122TBW03_UPD_USER_ID ;
   private String[] BC00162_A110TBW03_SESSION_ID ;
   private String[] BC00162_A111TBW03_APP_ID ;
   private String[] BC00162_A112TBW03_DISP_DATETIME ;
   private int[] BC00162_A114TBW03_SUBJECT_ID ;
   private String[] BC00162_A715TBW03_OUTER_SUBJECT_ID ;
   private boolean[] BC00162_n715TBW03_OUTER_SUBJECT_ID ;
   private short[] BC00162_A716TBW03_CRF_LATEST_VERSION ;
   private boolean[] BC00162_n716TBW03_CRF_LATEST_VERSION ;
   private byte[] BC00162_A717TBW03_CRF_INPUT_LEVEL ;
   private boolean[] BC00162_n717TBW03_CRF_INPUT_LEVEL ;
   private String[] BC00162_A718TBW03_LOCK_FLG ;
   private boolean[] BC00162_n718TBW03_LOCK_FLG ;
   private java.util.Date[] BC00162_A719TBW03_LOCK_DATETIME ;
   private boolean[] BC00162_n719TBW03_LOCK_DATETIME ;
   private String[] BC00162_A721TBW03_LOCK_AUTH_CD ;
   private boolean[] BC00162_n721TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] BC00162_A722TBW03_UPLOAD_DATETIME ;
   private boolean[] BC00162_n722TBW03_UPLOAD_DATETIME ;
   private String[] BC00162_A724TBW03_UPLOAD_AUTH_CD ;
   private boolean[] BC00162_n724TBW03_UPLOAD_AUTH_CD ;
   private String[] BC00162_A725TBW03_DM_ARRIVAL_FLG ;
   private boolean[] BC00162_n725TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00162_A726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00162_n726TBW03_DM_ARRIVAL_DATETIME ;
   private String[] BC00162_A727TBW03_APPROVAL_FLG ;
   private boolean[] BC00162_n727TBW03_APPROVAL_FLG ;
   private java.util.Date[] BC00162_A728TBW03_APPROVAL_DATETIME ;
   private boolean[] BC00162_n728TBW03_APPROVAL_DATETIME ;
   private String[] BC00162_A730TBW03_APPROVAL_AUTH_CD ;
   private boolean[] BC00162_n730TBW03_APPROVAL_AUTH_CD ;
   private String[] BC00162_A731TBW03_INPUT_END_FLG ;
   private boolean[] BC00162_n731TBW03_INPUT_END_FLG ;
   private java.util.Date[] BC00162_A732TBW03_INPUT_END_DATETIME ;
   private boolean[] BC00162_n732TBW03_INPUT_END_DATETIME ;
   private String[] BC00162_A734TBW03_INPUT_END_AUTH_CD ;
   private boolean[] BC00162_n734TBW03_INPUT_END_AUTH_CD ;
   private String[] BC00162_A780TBW03_DEL_FLG ;
   private boolean[] BC00162_n780TBW03_DEL_FLG ;
   private java.util.Date[] BC00162_A781TBW03_CRT_DATETIME ;
   private boolean[] BC00162_n781TBW03_CRT_DATETIME ;
   private String[] BC00162_A783TBW03_CRT_PROG_NM ;
   private boolean[] BC00162_n783TBW03_CRT_PROG_NM ;
   private java.util.Date[] BC00162_A784TBW03_UPD_DATETIME ;
   private boolean[] BC00162_n784TBW03_UPD_DATETIME ;
   private String[] BC00162_A786TBW03_UPD_PROG_NM ;
   private boolean[] BC00162_n786TBW03_UPD_PROG_NM ;
   private long[] BC00162_A787TBW03_UPD_CNT ;
   private boolean[] BC00162_n787TBW03_UPD_CNT ;
   private long[] BC00162_A113TBW03_STUDY_ID ;
   private short[] BC00162_A115TBW03_CRF_ID ;
   private String[] BC00162_A120TBW03_SITE_ID ;
   private boolean[] BC00162_n120TBW03_SITE_ID ;
   private String[] BC00162_A116TBW03_LOCK_USER_ID ;
   private boolean[] BC00162_n116TBW03_LOCK_USER_ID ;
   private String[] BC00162_A117TBW03_UPLOAD_USER_ID ;
   private boolean[] BC00162_n117TBW03_UPLOAD_USER_ID ;
   private String[] BC00162_A118TBW03_APPROVAL_USER_ID ;
   private boolean[] BC00162_n118TBW03_APPROVAL_USER_ID ;
   private String[] BC00162_A119TBW03_INPUT_END_USER_ID ;
   private boolean[] BC00162_n119TBW03_INPUT_END_USER_ID ;
   private String[] BC00162_A121TBW03_CRT_USER_ID ;
   private boolean[] BC00162_n121TBW03_CRT_USER_ID ;
   private String[] BC00162_A122TBW03_UPD_USER_ID ;
   private boolean[] BC00162_n122TBW03_UPD_USER_ID ;
   private String[] BC001617_A110TBW03_SESSION_ID ;
   private String[] BC001617_A111TBW03_APP_ID ;
   private String[] BC001617_A112TBW03_DISP_DATETIME ;
   private int[] BC001617_A114TBW03_SUBJECT_ID ;
   private String[] BC001617_A710TBW03_CRF_NM ;
   private boolean[] BC001617_n710TBW03_CRF_NM ;
   private String[] BC001617_A711TBW03_CRF_SNM ;
   private boolean[] BC001617_n711TBW03_CRF_SNM ;
   private int[] BC001617_A712TBW03_CRF_ORDER ;
   private boolean[] BC001617_n712TBW03_CRF_ORDER ;
   private String[] BC001617_A713TBW03_SITE_NM ;
   private boolean[] BC001617_n713TBW03_SITE_NM ;
   private String[] BC001617_A714TBW03_SITE_RYAK_NM ;
   private boolean[] BC001617_n714TBW03_SITE_RYAK_NM ;
   private String[] BC001617_A715TBW03_OUTER_SUBJECT_ID ;
   private boolean[] BC001617_n715TBW03_OUTER_SUBJECT_ID ;
   private short[] BC001617_A716TBW03_CRF_LATEST_VERSION ;
   private boolean[] BC001617_n716TBW03_CRF_LATEST_VERSION ;
   private byte[] BC001617_A717TBW03_CRF_INPUT_LEVEL ;
   private boolean[] BC001617_n717TBW03_CRF_INPUT_LEVEL ;
   private String[] BC001617_A718TBW03_LOCK_FLG ;
   private boolean[] BC001617_n718TBW03_LOCK_FLG ;
   private java.util.Date[] BC001617_A719TBW03_LOCK_DATETIME ;
   private boolean[] BC001617_n719TBW03_LOCK_DATETIME ;
   private String[] BC001617_A720TBW03_LOCK_USER_NM ;
   private boolean[] BC001617_n720TBW03_LOCK_USER_NM ;
   private String[] BC001617_A721TBW03_LOCK_AUTH_CD ;
   private boolean[] BC001617_n721TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] BC001617_A722TBW03_UPLOAD_DATETIME ;
   private boolean[] BC001617_n722TBW03_UPLOAD_DATETIME ;
   private String[] BC001617_A723TBW03_UPLOAD_USER_NM ;
   private boolean[] BC001617_n723TBW03_UPLOAD_USER_NM ;
   private String[] BC001617_A724TBW03_UPLOAD_AUTH_CD ;
   private boolean[] BC001617_n724TBW03_UPLOAD_AUTH_CD ;
   private String[] BC001617_A725TBW03_DM_ARRIVAL_FLG ;
   private boolean[] BC001617_n725TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC001617_A726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] BC001617_n726TBW03_DM_ARRIVAL_DATETIME ;
   private String[] BC001617_A727TBW03_APPROVAL_FLG ;
   private boolean[] BC001617_n727TBW03_APPROVAL_FLG ;
   private java.util.Date[] BC001617_A728TBW03_APPROVAL_DATETIME ;
   private boolean[] BC001617_n728TBW03_APPROVAL_DATETIME ;
   private String[] BC001617_A729TBW03_APPROVAL_USER_NM ;
   private boolean[] BC001617_n729TBW03_APPROVAL_USER_NM ;
   private String[] BC001617_A730TBW03_APPROVAL_AUTH_CD ;
   private boolean[] BC001617_n730TBW03_APPROVAL_AUTH_CD ;
   private String[] BC001617_A731TBW03_INPUT_END_FLG ;
   private boolean[] BC001617_n731TBW03_INPUT_END_FLG ;
   private java.util.Date[] BC001617_A732TBW03_INPUT_END_DATETIME ;
   private boolean[] BC001617_n732TBW03_INPUT_END_DATETIME ;
   private String[] BC001617_A733TBW03_INPUT_END_USER_NM ;
   private boolean[] BC001617_n733TBW03_INPUT_END_USER_NM ;
   private String[] BC001617_A734TBW03_INPUT_END_AUTH_CD ;
   private boolean[] BC001617_n734TBW03_INPUT_END_AUTH_CD ;
   private String[] BC001617_A780TBW03_DEL_FLG ;
   private boolean[] BC001617_n780TBW03_DEL_FLG ;
   private java.util.Date[] BC001617_A781TBW03_CRT_DATETIME ;
   private boolean[] BC001617_n781TBW03_CRT_DATETIME ;
   private String[] BC001617_A782TBW03_CRT_USER_NM ;
   private boolean[] BC001617_n782TBW03_CRT_USER_NM ;
   private String[] BC001617_A783TBW03_CRT_PROG_NM ;
   private boolean[] BC001617_n783TBW03_CRT_PROG_NM ;
   private java.util.Date[] BC001617_A784TBW03_UPD_DATETIME ;
   private boolean[] BC001617_n784TBW03_UPD_DATETIME ;
   private String[] BC001617_A785TBW03_UPD_USER_NM ;
   private boolean[] BC001617_n785TBW03_UPD_USER_NM ;
   private String[] BC001617_A786TBW03_UPD_PROG_NM ;
   private boolean[] BC001617_n786TBW03_UPD_PROG_NM ;
   private long[] BC001617_A787TBW03_UPD_CNT ;
   private boolean[] BC001617_n787TBW03_UPD_CNT ;
   private long[] BC001617_A113TBW03_STUDY_ID ;
   private short[] BC001617_A115TBW03_CRF_ID ;
   private String[] BC001617_A120TBW03_SITE_ID ;
   private boolean[] BC001617_n120TBW03_SITE_ID ;
   private String[] BC001617_A116TBW03_LOCK_USER_ID ;
   private boolean[] BC001617_n116TBW03_LOCK_USER_ID ;
   private String[] BC001617_A117TBW03_UPLOAD_USER_ID ;
   private boolean[] BC001617_n117TBW03_UPLOAD_USER_ID ;
   private String[] BC001617_A118TBW03_APPROVAL_USER_ID ;
   private boolean[] BC001617_n118TBW03_APPROVAL_USER_ID ;
   private String[] BC001617_A119TBW03_INPUT_END_USER_ID ;
   private boolean[] BC001617_n119TBW03_INPUT_END_USER_ID ;
   private String[] BC001617_A121TBW03_CRT_USER_ID ;
   private boolean[] BC001617_n121TBW03_CRT_USER_ID ;
   private String[] BC001617_A122TBW03_UPD_USER_ID ;
   private boolean[] BC001617_n122TBW03_UPD_USER_ID ;
}

final  class tbw03_crf_search_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00162", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_SUBJECT_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_CRF_ID` AS TBW03_CRF_ID, `TBW03_SITE_ID` AS TBW03_SITE_ID, `TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, `TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, `TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, `TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, `TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, `TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00163", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_SUBJECT_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_CRF_ID` AS TBW03_CRF_ID, `TBW03_SITE_ID` AS TBW03_SITE_ID, `TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, `TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, `TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, `TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, `TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, `TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00164", "SELECT `TBM31_CRF_NM` AS TBW03_CRF_NM, `TBM31_CRF_SNM` AS TBW03_CRF_SNM, `TBM31_ORDER` AS TBW03_CRF_ORDER FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00165", "SELECT `TAM08_SITE_NM` AS TBW03_SITE_NM, `TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00166", "SELECT `TAM07_USER_NM` AS TBW03_LOCK_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00167", "SELECT `TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00168", "SELECT `TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00169", "SELECT `TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001610", "SELECT `TAM07_USER_NM` AS TBW03_CRT_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001611", "SELECT `TAM07_USER_NM` AS TBW03_UPD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001612", "SELECT TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_SUBJECT_ID`, T2.`TBM31_CRF_NM` AS TBW03_CRF_NM, T2.`TBM31_CRF_SNM` AS TBW03_CRF_SNM, T2.`TBM31_ORDER` AS TBW03_CRF_ORDER, T3.`TAM08_SITE_NM` AS TBW03_SITE_NM, T3.`TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM, TM1.`TBW03_OUTER_SUBJECT_ID`, TM1.`TBW03_CRF_LATEST_VERSION`, TM1.`TBW03_CRF_INPUT_LEVEL`, TM1.`TBW03_LOCK_FLG`, TM1.`TBW03_LOCK_DATETIME`, T4.`TAM07_USER_NM` AS TBW03_LOCK_USER_NM, TM1.`TBW03_LOCK_AUTH_CD`, TM1.`TBW03_UPLOAD_DATETIME`, T5.`TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM, TM1.`TBW03_UPLOAD_AUTH_CD`, TM1.`TBW03_DM_ARRIVAL_FLG`, TM1.`TBW03_DM_ARRIVAL_DATETIME`, TM1.`TBW03_APPROVAL_FLG`, TM1.`TBW03_APPROVAL_DATETIME`, T6.`TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM, TM1.`TBW03_APPROVAL_AUTH_CD`, TM1.`TBW03_INPUT_END_FLG`, TM1.`TBW03_INPUT_END_DATETIME`, T7.`TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM, TM1.`TBW03_INPUT_END_AUTH_CD`, TM1.`TBW03_DEL_FLG`, TM1.`TBW03_CRT_DATETIME`, T8.`TAM07_USER_NM` AS TBW03_CRT_USER_NM, TM1.`TBW03_CRT_PROG_NM`, TM1.`TBW03_UPD_DATETIME`, T9.`TAM07_USER_NM` AS TBW03_UPD_USER_NM, TM1.`TBW03_UPD_PROG_NM`, TM1.`TBW03_UPD_CNT`, TM1.`TBW03_STUDY_ID` AS TBW03_STUDY_ID, TM1.`TBW03_CRF_ID` AS TBW03_CRF_ID, TM1.`TBW03_SITE_ID` AS TBW03_SITE_ID, TM1.`TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, TM1.`TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, TM1.`TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, TM1.`TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, TM1.`TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, TM1.`TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM ((((((((`TBW03_CRF_SEARCH` TM1 INNER JOIN `TBM31_CRF` T2 ON T2.`TBM31_STUDY_ID` = TM1.`TBW03_STUDY_ID` AND T2.`TBM31_CRF_ID` = TM1.`TBW03_CRF_ID`) LEFT JOIN `TAM08_SITE` T3 ON T3.`TAM08_SITE_ID` = TM1.`TBW03_SITE_ID`) LEFT JOIN `TAM07_USER` T4 ON T4.`TAM07_USER_ID` = TM1.`TBW03_LOCK_USER_ID`) LEFT JOIN `TAM07_USER` T5 ON T5.`TAM07_USER_ID` = TM1.`TBW03_UPLOAD_USER_ID`) LEFT JOIN `TAM07_USER` T6 ON T6.`TAM07_USER_ID` = TM1.`TBW03_APPROVAL_USER_ID`) LEFT JOIN `TAM07_USER` T7 ON T7.`TAM07_USER_ID` = TM1.`TBW03_INPUT_END_USER_ID`) LEFT JOIN `TAM07_USER` T8 ON T8.`TAM07_USER_ID` = TM1.`TBW03_CRT_USER_ID`) LEFT JOIN `TAM07_USER` T9 ON T9.`TAM07_USER_ID` = TM1.`TBW03_UPD_USER_ID`) WHERE TM1.`TBW03_SESSION_ID` = ? and TM1.`TBW03_APP_ID` = ? and TM1.`TBW03_DISP_DATETIME` = ? and TM1.`TBW03_STUDY_ID` = ? and TM1.`TBW03_SUBJECT_ID` = ? and TM1.`TBW03_CRF_ID` = ? ORDER BY TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_STUDY_ID`, TM1.`TBW03_SUBJECT_ID`, TM1.`TBW03_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC001613", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001614", "INSERT INTO `TBW03_CRF_SEARCH`(`TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_SUBJECT_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`, `TBW03_STUDY_ID`, `TBW03_CRF_ID`, `TBW03_SITE_ID`, `TBW03_LOCK_USER_ID`, `TBW03_UPLOAD_USER_ID`, `TBW03_APPROVAL_USER_ID`, `TBW03_INPUT_END_USER_ID`, `TBW03_CRT_USER_ID`, `TBW03_UPD_USER_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001615", "UPDATE `TBW03_CRF_SEARCH` SET `TBW03_OUTER_SUBJECT_ID`=?, `TBW03_CRF_LATEST_VERSION`=?, `TBW03_CRF_INPUT_LEVEL`=?, `TBW03_LOCK_FLG`=?, `TBW03_LOCK_DATETIME`=?, `TBW03_LOCK_AUTH_CD`=?, `TBW03_UPLOAD_DATETIME`=?, `TBW03_UPLOAD_AUTH_CD`=?, `TBW03_DM_ARRIVAL_FLG`=?, `TBW03_DM_ARRIVAL_DATETIME`=?, `TBW03_APPROVAL_FLG`=?, `TBW03_APPROVAL_DATETIME`=?, `TBW03_APPROVAL_AUTH_CD`=?, `TBW03_INPUT_END_FLG`=?, `TBW03_INPUT_END_DATETIME`=?, `TBW03_INPUT_END_AUTH_CD`=?, `TBW03_DEL_FLG`=?, `TBW03_CRT_DATETIME`=?, `TBW03_CRT_PROG_NM`=?, `TBW03_UPD_DATETIME`=?, `TBW03_UPD_PROG_NM`=?, `TBW03_UPD_CNT`=?, `TBW03_SITE_ID`=?, `TBW03_LOCK_USER_ID`=?, `TBW03_UPLOAD_USER_ID`=?, `TBW03_APPROVAL_USER_ID`=?, `TBW03_INPUT_END_USER_ID`=?, `TBW03_CRT_USER_ID`=?, `TBW03_UPD_USER_ID`=?  WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001616", "DELETE FROM `TBW03_CRF_SEARCH`  WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001617", "SELECT TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_SUBJECT_ID`, T2.`TBM31_CRF_NM` AS TBW03_CRF_NM, T2.`TBM31_CRF_SNM` AS TBW03_CRF_SNM, T2.`TBM31_ORDER` AS TBW03_CRF_ORDER, T3.`TAM08_SITE_NM` AS TBW03_SITE_NM, T3.`TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM, TM1.`TBW03_OUTER_SUBJECT_ID`, TM1.`TBW03_CRF_LATEST_VERSION`, TM1.`TBW03_CRF_INPUT_LEVEL`, TM1.`TBW03_LOCK_FLG`, TM1.`TBW03_LOCK_DATETIME`, T4.`TAM07_USER_NM` AS TBW03_LOCK_USER_NM, TM1.`TBW03_LOCK_AUTH_CD`, TM1.`TBW03_UPLOAD_DATETIME`, T5.`TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM, TM1.`TBW03_UPLOAD_AUTH_CD`, TM1.`TBW03_DM_ARRIVAL_FLG`, TM1.`TBW03_DM_ARRIVAL_DATETIME`, TM1.`TBW03_APPROVAL_FLG`, TM1.`TBW03_APPROVAL_DATETIME`, T6.`TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM, TM1.`TBW03_APPROVAL_AUTH_CD`, TM1.`TBW03_INPUT_END_FLG`, TM1.`TBW03_INPUT_END_DATETIME`, T7.`TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM, TM1.`TBW03_INPUT_END_AUTH_CD`, TM1.`TBW03_DEL_FLG`, TM1.`TBW03_CRT_DATETIME`, T8.`TAM07_USER_NM` AS TBW03_CRT_USER_NM, TM1.`TBW03_CRT_PROG_NM`, TM1.`TBW03_UPD_DATETIME`, T9.`TAM07_USER_NM` AS TBW03_UPD_USER_NM, TM1.`TBW03_UPD_PROG_NM`, TM1.`TBW03_UPD_CNT`, TM1.`TBW03_STUDY_ID` AS TBW03_STUDY_ID, TM1.`TBW03_CRF_ID` AS TBW03_CRF_ID, TM1.`TBW03_SITE_ID` AS TBW03_SITE_ID, TM1.`TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, TM1.`TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, TM1.`TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, TM1.`TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, TM1.`TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, TM1.`TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM ((((((((`TBW03_CRF_SEARCH` TM1 INNER JOIN `TBM31_CRF` T2 ON T2.`TBM31_STUDY_ID` = TM1.`TBW03_STUDY_ID` AND T2.`TBM31_CRF_ID` = TM1.`TBW03_CRF_ID`) LEFT JOIN `TAM08_SITE` T3 ON T3.`TAM08_SITE_ID` = TM1.`TBW03_SITE_ID`) LEFT JOIN `TAM07_USER` T4 ON T4.`TAM07_USER_ID` = TM1.`TBW03_LOCK_USER_ID`) LEFT JOIN `TAM07_USER` T5 ON T5.`TAM07_USER_ID` = TM1.`TBW03_UPLOAD_USER_ID`) LEFT JOIN `TAM07_USER` T6 ON T6.`TAM07_USER_ID` = TM1.`TBW03_APPROVAL_USER_ID`) LEFT JOIN `TAM07_USER` T7 ON T7.`TAM07_USER_ID` = TM1.`TBW03_INPUT_END_USER_ID`) LEFT JOIN `TAM07_USER` T8 ON T8.`TAM07_USER_ID` = TM1.`TBW03_CRT_USER_ID`) LEFT JOIN `TAM07_USER` T9 ON T9.`TAM07_USER_ID` = TM1.`TBW03_UPD_USER_ID`) WHERE TM1.`TBW03_SESSION_ID` = ? and TM1.`TBW03_APP_ID` = ? and TM1.`TBW03_DISP_DATETIME` = ? and TM1.`TBW03_STUDY_ID` = ? and TM1.`TBW03_SUBJECT_ID` = ? and TM1.`TBW03_CRF_ID` = ? ORDER BY TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_STUDY_ID`, TM1.`TBW03_SUBJECT_ID`, TM1.`TBW03_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((long[]) buf[46])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(27) ;
               ((short[]) buf[49])[0] = rslt.getShort(28) ;
               ((String[]) buf[50])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((long[]) buf[46])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(27) ;
               ((short[]) buf[49])[0] = rslt.getShort(28) ;
               ((String[]) buf[50])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDateTime(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDateTime(31) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDateTime(34) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((long[]) buf[68])[0] = rslt.getLong(37) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((long[]) buf[70])[0] = rslt.getLong(38) ;
               ((short[]) buf[71])[0] = rslt.getShort(39) ;
               ((String[]) buf[72])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDateTime(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDateTime(31) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDateTime(34) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((long[]) buf[68])[0] = rslt.getLong(37) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((long[]) buf[70])[0] = rslt.getLong(38) ;
               ((short[]) buf[71])[0] = rslt.getShort(39) ;
               ((String[]) buf[72])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[85])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20, false);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[41], 40);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[45], 40);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[47]).longValue());
               }
               stmt.setLong(27, ((Number) parms[48]).longValue());
               stmt.setShort(28, ((Number) parms[49]).shortValue());
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[51], 20);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[53], 128);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[55], 128);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[57], 128);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[59], 128);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[61], 128);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[63], 128);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 2);
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
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[19], false);
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
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 2);
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
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[29], false);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[35], false);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 40);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 40);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(22, ((Number) parms[43]).longValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 20);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 128);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 128);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 128);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 128);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[55], 128);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 128);
               }
               stmt.setVarchar(30, (String)parms[58], 50, false);
               stmt.setVarchar(31, (String)parms[59], 7, false);
               stmt.setVarchar(32, (String)parms[60], 14, false);
               stmt.setLong(33, ((Number) parms[61]).longValue());
               stmt.setInt(34, ((Number) parms[62]).intValue());
               stmt.setShort(35, ((Number) parms[63]).shortValue());
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

