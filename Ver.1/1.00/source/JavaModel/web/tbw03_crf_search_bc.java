/*
               File: tbw03_crf_search_bc
        Description: CRF検索ワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:51.85
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z625TBW03_SESSION_ID = A625TBW03_SESSION_ID ;
            Z626TBW03_APP_ID = A626TBW03_APP_ID ;
            Z627TBW03_DISP_DATETIME = A627TBW03_DISP_DATETIME ;
            Z628TBW03_STUDY_ID = A628TBW03_STUDY_ID ;
            Z629TBW03_SUBJECT_ID = A629TBW03_SUBJECT_ID ;
            Z630TBW03_CRF_ID = A630TBW03_CRF_ID ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1641( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z637TBW03_OUTER_SUBJECT_ID = A637TBW03_OUTER_SUBJECT_ID ;
         Z638TBW03_CRF_LATEST_VERSION = A638TBW03_CRF_LATEST_VERSION ;
         Z639TBW03_CRF_INPUT_LEVEL = A639TBW03_CRF_INPUT_LEVEL ;
         Z640TBW03_LOCK_FLG = A640TBW03_LOCK_FLG ;
         Z641TBW03_LOCK_DATETIME = A641TBW03_LOCK_DATETIME ;
         Z644TBW03_LOCK_AUTH_CD = A644TBW03_LOCK_AUTH_CD ;
         Z645TBW03_UPLOAD_DATETIME = A645TBW03_UPLOAD_DATETIME ;
         Z648TBW03_UPLOAD_AUTH_CD = A648TBW03_UPLOAD_AUTH_CD ;
         Z649TBW03_DM_ARRIVAL_FLG = A649TBW03_DM_ARRIVAL_FLG ;
         Z650TBW03_DM_ARRIVAL_DATETIME = A650TBW03_DM_ARRIVAL_DATETIME ;
         Z651TBW03_APPROVAL_FLG = A651TBW03_APPROVAL_FLG ;
         Z652TBW03_APPROVAL_DATETIME = A652TBW03_APPROVAL_DATETIME ;
         Z655TBW03_APPROVAL_AUTH_CD = A655TBW03_APPROVAL_AUTH_CD ;
         Z656TBW03_INPUT_END_FLG = A656TBW03_INPUT_END_FLG ;
         Z657TBW03_INPUT_END_DATETIME = A657TBW03_INPUT_END_DATETIME ;
         Z660TBW03_INPUT_END_AUTH_CD = A660TBW03_INPUT_END_AUTH_CD ;
         Z755TBW03_DEL_FLG = A755TBW03_DEL_FLG ;
         Z756TBW03_CRT_DATETIME = A756TBW03_CRT_DATETIME ;
         Z759TBW03_CRT_PROG_NM = A759TBW03_CRT_PROG_NM ;
         Z760TBW03_UPD_DATETIME = A760TBW03_UPD_DATETIME ;
         Z763TBW03_UPD_PROG_NM = A763TBW03_UPD_PROG_NM ;
         Z764TBW03_UPD_CNT = A764TBW03_UPD_CNT ;
         Z634TBW03_SITE_ID = A634TBW03_SITE_ID ;
         Z642TBW03_LOCK_USER_ID = A642TBW03_LOCK_USER_ID ;
         Z646TBW03_UPLOAD_USER_ID = A646TBW03_UPLOAD_USER_ID ;
         Z653TBW03_APPROVAL_USER_ID = A653TBW03_APPROVAL_USER_ID ;
         Z658TBW03_INPUT_END_USER_ID = A658TBW03_INPUT_END_USER_ID ;
         Z757TBW03_CRT_USER_ID = A757TBW03_CRT_USER_ID ;
         Z761TBW03_UPD_USER_ID = A761TBW03_UPD_USER_ID ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         Z631TBW03_CRF_NM = A631TBW03_CRF_NM ;
         Z632TBW03_CRF_SNM = A632TBW03_CRF_SNM ;
         Z633TBW03_CRF_ORDER = A633TBW03_CRF_ORDER ;
      }
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         Z635TBW03_SITE_NM = A635TBW03_SITE_NM ;
         Z636TBW03_SITE_RYAK_NM = A636TBW03_SITE_RYAK_NM ;
      }
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         Z643TBW03_LOCK_USER_NM = A643TBW03_LOCK_USER_NM ;
      }
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         Z647TBW03_UPLOAD_USER_NM = A647TBW03_UPLOAD_USER_NM ;
      }
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         Z654TBW03_APPROVAL_USER_NM = A654TBW03_APPROVAL_USER_NM ;
      }
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         Z659TBW03_INPUT_END_USER_NM = A659TBW03_INPUT_END_USER_NM ;
      }
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         Z758TBW03_CRT_USER_NM = A758TBW03_CRT_USER_NM ;
      }
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         Z762TBW03_UPD_USER_NM = A762TBW03_UPD_USER_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z625TBW03_SESSION_ID = A625TBW03_SESSION_ID ;
         Z626TBW03_APP_ID = A626TBW03_APP_ID ;
         Z627TBW03_DISP_DATETIME = A627TBW03_DISP_DATETIME ;
         Z629TBW03_SUBJECT_ID = A629TBW03_SUBJECT_ID ;
         Z637TBW03_OUTER_SUBJECT_ID = A637TBW03_OUTER_SUBJECT_ID ;
         Z638TBW03_CRF_LATEST_VERSION = A638TBW03_CRF_LATEST_VERSION ;
         Z639TBW03_CRF_INPUT_LEVEL = A639TBW03_CRF_INPUT_LEVEL ;
         Z640TBW03_LOCK_FLG = A640TBW03_LOCK_FLG ;
         Z641TBW03_LOCK_DATETIME = A641TBW03_LOCK_DATETIME ;
         Z644TBW03_LOCK_AUTH_CD = A644TBW03_LOCK_AUTH_CD ;
         Z645TBW03_UPLOAD_DATETIME = A645TBW03_UPLOAD_DATETIME ;
         Z648TBW03_UPLOAD_AUTH_CD = A648TBW03_UPLOAD_AUTH_CD ;
         Z649TBW03_DM_ARRIVAL_FLG = A649TBW03_DM_ARRIVAL_FLG ;
         Z650TBW03_DM_ARRIVAL_DATETIME = A650TBW03_DM_ARRIVAL_DATETIME ;
         Z651TBW03_APPROVAL_FLG = A651TBW03_APPROVAL_FLG ;
         Z652TBW03_APPROVAL_DATETIME = A652TBW03_APPROVAL_DATETIME ;
         Z655TBW03_APPROVAL_AUTH_CD = A655TBW03_APPROVAL_AUTH_CD ;
         Z656TBW03_INPUT_END_FLG = A656TBW03_INPUT_END_FLG ;
         Z657TBW03_INPUT_END_DATETIME = A657TBW03_INPUT_END_DATETIME ;
         Z660TBW03_INPUT_END_AUTH_CD = A660TBW03_INPUT_END_AUTH_CD ;
         Z755TBW03_DEL_FLG = A755TBW03_DEL_FLG ;
         Z756TBW03_CRT_DATETIME = A756TBW03_CRT_DATETIME ;
         Z759TBW03_CRT_PROG_NM = A759TBW03_CRT_PROG_NM ;
         Z760TBW03_UPD_DATETIME = A760TBW03_UPD_DATETIME ;
         Z763TBW03_UPD_PROG_NM = A763TBW03_UPD_PROG_NM ;
         Z764TBW03_UPD_CNT = A764TBW03_UPD_CNT ;
         Z628TBW03_STUDY_ID = A628TBW03_STUDY_ID ;
         Z630TBW03_CRF_ID = A630TBW03_CRF_ID ;
         Z634TBW03_SITE_ID = A634TBW03_SITE_ID ;
         Z642TBW03_LOCK_USER_ID = A642TBW03_LOCK_USER_ID ;
         Z646TBW03_UPLOAD_USER_ID = A646TBW03_UPLOAD_USER_ID ;
         Z653TBW03_APPROVAL_USER_ID = A653TBW03_APPROVAL_USER_ID ;
         Z658TBW03_INPUT_END_USER_ID = A658TBW03_INPUT_END_USER_ID ;
         Z757TBW03_CRT_USER_ID = A757TBW03_CRT_USER_ID ;
         Z761TBW03_UPD_USER_ID = A761TBW03_UPD_USER_ID ;
         Z631TBW03_CRF_NM = A631TBW03_CRF_NM ;
         Z632TBW03_CRF_SNM = A632TBW03_CRF_SNM ;
         Z633TBW03_CRF_ORDER = A633TBW03_CRF_ORDER ;
         Z635TBW03_SITE_NM = A635TBW03_SITE_NM ;
         Z636TBW03_SITE_RYAK_NM = A636TBW03_SITE_RYAK_NM ;
         Z643TBW03_LOCK_USER_NM = A643TBW03_LOCK_USER_NM ;
         Z647TBW03_UPLOAD_USER_NM = A647TBW03_UPLOAD_USER_NM ;
         Z654TBW03_APPROVAL_USER_NM = A654TBW03_APPROVAL_USER_NM ;
         Z659TBW03_INPUT_END_USER_NM = A659TBW03_INPUT_END_USER_NM ;
         Z758TBW03_CRT_USER_NM = A758TBW03_CRT_USER_NM ;
         Z762TBW03_UPD_USER_NM = A762TBW03_UPD_USER_NM ;
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
      pr_default.execute(10, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A631TBW03_CRF_NM = BC001612_A631TBW03_CRF_NM[0] ;
         n631TBW03_CRF_NM = BC001612_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = BC001612_A632TBW03_CRF_SNM[0] ;
         n632TBW03_CRF_SNM = BC001612_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = BC001612_A633TBW03_CRF_ORDER[0] ;
         n633TBW03_CRF_ORDER = BC001612_n633TBW03_CRF_ORDER[0] ;
         A635TBW03_SITE_NM = BC001612_A635TBW03_SITE_NM[0] ;
         n635TBW03_SITE_NM = BC001612_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = BC001612_A636TBW03_SITE_RYAK_NM[0] ;
         n636TBW03_SITE_RYAK_NM = BC001612_n636TBW03_SITE_RYAK_NM[0] ;
         A637TBW03_OUTER_SUBJECT_ID = BC001612_A637TBW03_OUTER_SUBJECT_ID[0] ;
         n637TBW03_OUTER_SUBJECT_ID = BC001612_n637TBW03_OUTER_SUBJECT_ID[0] ;
         A638TBW03_CRF_LATEST_VERSION = BC001612_A638TBW03_CRF_LATEST_VERSION[0] ;
         n638TBW03_CRF_LATEST_VERSION = BC001612_n638TBW03_CRF_LATEST_VERSION[0] ;
         A639TBW03_CRF_INPUT_LEVEL = BC001612_A639TBW03_CRF_INPUT_LEVEL[0] ;
         n639TBW03_CRF_INPUT_LEVEL = BC001612_n639TBW03_CRF_INPUT_LEVEL[0] ;
         A640TBW03_LOCK_FLG = BC001612_A640TBW03_LOCK_FLG[0] ;
         n640TBW03_LOCK_FLG = BC001612_n640TBW03_LOCK_FLG[0] ;
         A641TBW03_LOCK_DATETIME = BC001612_A641TBW03_LOCK_DATETIME[0] ;
         n641TBW03_LOCK_DATETIME = BC001612_n641TBW03_LOCK_DATETIME[0] ;
         A643TBW03_LOCK_USER_NM = BC001612_A643TBW03_LOCK_USER_NM[0] ;
         n643TBW03_LOCK_USER_NM = BC001612_n643TBW03_LOCK_USER_NM[0] ;
         A644TBW03_LOCK_AUTH_CD = BC001612_A644TBW03_LOCK_AUTH_CD[0] ;
         n644TBW03_LOCK_AUTH_CD = BC001612_n644TBW03_LOCK_AUTH_CD[0] ;
         A645TBW03_UPLOAD_DATETIME = BC001612_A645TBW03_UPLOAD_DATETIME[0] ;
         n645TBW03_UPLOAD_DATETIME = BC001612_n645TBW03_UPLOAD_DATETIME[0] ;
         A647TBW03_UPLOAD_USER_NM = BC001612_A647TBW03_UPLOAD_USER_NM[0] ;
         n647TBW03_UPLOAD_USER_NM = BC001612_n647TBW03_UPLOAD_USER_NM[0] ;
         A648TBW03_UPLOAD_AUTH_CD = BC001612_A648TBW03_UPLOAD_AUTH_CD[0] ;
         n648TBW03_UPLOAD_AUTH_CD = BC001612_n648TBW03_UPLOAD_AUTH_CD[0] ;
         A649TBW03_DM_ARRIVAL_FLG = BC001612_A649TBW03_DM_ARRIVAL_FLG[0] ;
         n649TBW03_DM_ARRIVAL_FLG = BC001612_n649TBW03_DM_ARRIVAL_FLG[0] ;
         A650TBW03_DM_ARRIVAL_DATETIME = BC001612_A650TBW03_DM_ARRIVAL_DATETIME[0] ;
         n650TBW03_DM_ARRIVAL_DATETIME = BC001612_n650TBW03_DM_ARRIVAL_DATETIME[0] ;
         A651TBW03_APPROVAL_FLG = BC001612_A651TBW03_APPROVAL_FLG[0] ;
         n651TBW03_APPROVAL_FLG = BC001612_n651TBW03_APPROVAL_FLG[0] ;
         A652TBW03_APPROVAL_DATETIME = BC001612_A652TBW03_APPROVAL_DATETIME[0] ;
         n652TBW03_APPROVAL_DATETIME = BC001612_n652TBW03_APPROVAL_DATETIME[0] ;
         A654TBW03_APPROVAL_USER_NM = BC001612_A654TBW03_APPROVAL_USER_NM[0] ;
         n654TBW03_APPROVAL_USER_NM = BC001612_n654TBW03_APPROVAL_USER_NM[0] ;
         A655TBW03_APPROVAL_AUTH_CD = BC001612_A655TBW03_APPROVAL_AUTH_CD[0] ;
         n655TBW03_APPROVAL_AUTH_CD = BC001612_n655TBW03_APPROVAL_AUTH_CD[0] ;
         A656TBW03_INPUT_END_FLG = BC001612_A656TBW03_INPUT_END_FLG[0] ;
         n656TBW03_INPUT_END_FLG = BC001612_n656TBW03_INPUT_END_FLG[0] ;
         A657TBW03_INPUT_END_DATETIME = BC001612_A657TBW03_INPUT_END_DATETIME[0] ;
         n657TBW03_INPUT_END_DATETIME = BC001612_n657TBW03_INPUT_END_DATETIME[0] ;
         A659TBW03_INPUT_END_USER_NM = BC001612_A659TBW03_INPUT_END_USER_NM[0] ;
         n659TBW03_INPUT_END_USER_NM = BC001612_n659TBW03_INPUT_END_USER_NM[0] ;
         A660TBW03_INPUT_END_AUTH_CD = BC001612_A660TBW03_INPUT_END_AUTH_CD[0] ;
         n660TBW03_INPUT_END_AUTH_CD = BC001612_n660TBW03_INPUT_END_AUTH_CD[0] ;
         A755TBW03_DEL_FLG = BC001612_A755TBW03_DEL_FLG[0] ;
         n755TBW03_DEL_FLG = BC001612_n755TBW03_DEL_FLG[0] ;
         A756TBW03_CRT_DATETIME = BC001612_A756TBW03_CRT_DATETIME[0] ;
         n756TBW03_CRT_DATETIME = BC001612_n756TBW03_CRT_DATETIME[0] ;
         A758TBW03_CRT_USER_NM = BC001612_A758TBW03_CRT_USER_NM[0] ;
         n758TBW03_CRT_USER_NM = BC001612_n758TBW03_CRT_USER_NM[0] ;
         A759TBW03_CRT_PROG_NM = BC001612_A759TBW03_CRT_PROG_NM[0] ;
         n759TBW03_CRT_PROG_NM = BC001612_n759TBW03_CRT_PROG_NM[0] ;
         A760TBW03_UPD_DATETIME = BC001612_A760TBW03_UPD_DATETIME[0] ;
         n760TBW03_UPD_DATETIME = BC001612_n760TBW03_UPD_DATETIME[0] ;
         A762TBW03_UPD_USER_NM = BC001612_A762TBW03_UPD_USER_NM[0] ;
         n762TBW03_UPD_USER_NM = BC001612_n762TBW03_UPD_USER_NM[0] ;
         A763TBW03_UPD_PROG_NM = BC001612_A763TBW03_UPD_PROG_NM[0] ;
         n763TBW03_UPD_PROG_NM = BC001612_n763TBW03_UPD_PROG_NM[0] ;
         A764TBW03_UPD_CNT = BC001612_A764TBW03_UPD_CNT[0] ;
         n764TBW03_UPD_CNT = BC001612_n764TBW03_UPD_CNT[0] ;
         A634TBW03_SITE_ID = BC001612_A634TBW03_SITE_ID[0] ;
         n634TBW03_SITE_ID = BC001612_n634TBW03_SITE_ID[0] ;
         A642TBW03_LOCK_USER_ID = BC001612_A642TBW03_LOCK_USER_ID[0] ;
         n642TBW03_LOCK_USER_ID = BC001612_n642TBW03_LOCK_USER_ID[0] ;
         A646TBW03_UPLOAD_USER_ID = BC001612_A646TBW03_UPLOAD_USER_ID[0] ;
         n646TBW03_UPLOAD_USER_ID = BC001612_n646TBW03_UPLOAD_USER_ID[0] ;
         A653TBW03_APPROVAL_USER_ID = BC001612_A653TBW03_APPROVAL_USER_ID[0] ;
         n653TBW03_APPROVAL_USER_ID = BC001612_n653TBW03_APPROVAL_USER_ID[0] ;
         A658TBW03_INPUT_END_USER_ID = BC001612_A658TBW03_INPUT_END_USER_ID[0] ;
         n658TBW03_INPUT_END_USER_ID = BC001612_n658TBW03_INPUT_END_USER_ID[0] ;
         A757TBW03_CRT_USER_ID = BC001612_A757TBW03_CRT_USER_ID[0] ;
         n757TBW03_CRT_USER_ID = BC001612_n757TBW03_CRT_USER_ID[0] ;
         A761TBW03_UPD_USER_ID = BC001612_A761TBW03_UPD_USER_ID[0] ;
         n761TBW03_UPD_USER_ID = BC001612_n761TBW03_UPD_USER_ID[0] ;
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
      pr_default.execute(2, new Object[] {new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError628 = 1 ;
         AnyError630 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・CRFサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
         AnyError = (short)(1) ;
      }
      if ( ( AnyError628 == 0 ) && ( AnyError630 == 0 ) )
      {
         A631TBW03_CRF_NM = BC00164_A631TBW03_CRF_NM[0] ;
         n631TBW03_CRF_NM = BC00164_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = BC00164_A632TBW03_CRF_SNM[0] ;
         n632TBW03_CRF_SNM = BC00164_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = BC00164_A633TBW03_CRF_ORDER[0] ;
         n633TBW03_CRF_ORDER = BC00164_n633TBW03_CRF_ORDER[0] ;
      }
      pr_default.close(2);
      /* Using cursor BC00165 */
      pr_default.execute(3, new Object[] {new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A634TBW03_SITE_ID)==0) ) )
         {
            AnyError634 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBW03_SITE_ID");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError634 == 0 )
      {
         A635TBW03_SITE_NM = BC00165_A635TBW03_SITE_NM[0] ;
         n635TBW03_SITE_NM = BC00165_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = BC00165_A636TBW03_SITE_RYAK_NM[0] ;
         n636TBW03_SITE_RYAK_NM = BC00165_n636TBW03_SITE_RYAK_NM[0] ;
      }
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A641TBW03_LOCK_DATETIME) || (( A641TBW03_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A641TBW03_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC00166 */
      pr_default.execute(4, new Object[] {new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A642TBW03_LOCK_USER_ID)==0) ) )
         {
            AnyError642 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・ロックユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_LOCK_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError642 == 0 )
      {
         A643TBW03_LOCK_USER_NM = BC00166_A643TBW03_LOCK_USER_NM[0] ;
         n643TBW03_LOCK_USER_NM = BC00166_n643TBW03_LOCK_USER_NM[0] ;
      }
      pr_default.close(4);
      if ( ! ( GXutil.nullDate().equals(A645TBW03_UPLOAD_DATETIME) || (( A645TBW03_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A645TBW03_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC00167 */
      pr_default.execute(5, new Object[] {new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A646TBW03_UPLOAD_USER_ID)==0) ) )
         {
            AnyError646 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・アップロードユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_UPLOAD_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError646 == 0 )
      {
         A647TBW03_UPLOAD_USER_NM = BC00167_A647TBW03_UPLOAD_USER_NM[0] ;
         n647TBW03_UPLOAD_USER_NM = BC00167_n647TBW03_UPLOAD_USER_NM[0] ;
      }
      pr_default.close(5);
      if ( ! ( GXutil.nullDate().equals(A650TBW03_DM_ARRIVAL_DATETIME) || (( A650TBW03_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A650TBW03_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A652TBW03_APPROVAL_DATETIME) || (( A652TBW03_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A652TBW03_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC00168 */
      pr_default.execute(6, new Object[] {new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A653TBW03_APPROVAL_USER_ID)==0) ) )
         {
            AnyError653 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・承認ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_APPROVAL_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError653 == 0 )
      {
         A654TBW03_APPROVAL_USER_NM = BC00168_A654TBW03_APPROVAL_USER_NM[0] ;
         n654TBW03_APPROVAL_USER_NM = BC00168_n654TBW03_APPROVAL_USER_NM[0] ;
      }
      pr_default.close(6);
      if ( ! ( GXutil.nullDate().equals(A657TBW03_INPUT_END_DATETIME) || (( A657TBW03_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A657TBW03_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC00169 */
      pr_default.execute(7, new Object[] {new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A658TBW03_INPUT_END_USER_ID)==0) ) )
         {
            AnyError658 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・データ固定ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_INPUT_END_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError658 == 0 )
      {
         A659TBW03_INPUT_END_USER_NM = BC00169_A659TBW03_INPUT_END_USER_NM[0] ;
         n659TBW03_INPUT_END_USER_NM = BC00169_n659TBW03_INPUT_END_USER_NM[0] ;
      }
      pr_default.close(7);
      if ( ! ( GXutil.nullDate().equals(A756TBW03_CRT_DATETIME) || (( A756TBW03_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A756TBW03_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC001610 */
      pr_default.execute(8, new Object[] {new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A757TBW03_CRT_USER_ID)==0) ) )
         {
            AnyError757 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・作成ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_CRT_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError757 == 0 )
      {
         A758TBW03_CRT_USER_NM = BC001610_A758TBW03_CRT_USER_NM[0] ;
         n758TBW03_CRT_USER_NM = BC001610_n758TBW03_CRT_USER_NM[0] ;
      }
      pr_default.close(8);
      if ( ! ( GXutil.nullDate().equals(A760TBW03_UPD_DATETIME) || (( A760TBW03_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A760TBW03_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC001611 */
      pr_default.execute(9, new Object[] {new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A761TBW03_UPD_USER_ID)==0) ) )
         {
            AnyError761 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・更新ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_UPD_USER_ID");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError761 == 0 )
      {
         A762TBW03_UPD_USER_NM = BC001611_A762TBW03_UPD_USER_NM[0] ;
         n762TBW03_UPD_USER_NM = BC001611_n762TBW03_UPD_USER_NM[0] ;
      }
      pr_default.close(9);
   }

   public void closeExtendedTableCursors1641( )
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

   public void enableDisable( )
   {
   }

   public void getKey1641( )
   {
      /* Using cursor BC001613 */
      pr_default.execute(11, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
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
      pr_default.execute(1, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1641( 8) ;
         RcdFound41 = (short)(1) ;
         A625TBW03_SESSION_ID = BC00163_A625TBW03_SESSION_ID[0] ;
         A626TBW03_APP_ID = BC00163_A626TBW03_APP_ID[0] ;
         A627TBW03_DISP_DATETIME = BC00163_A627TBW03_DISP_DATETIME[0] ;
         A629TBW03_SUBJECT_ID = BC00163_A629TBW03_SUBJECT_ID[0] ;
         A637TBW03_OUTER_SUBJECT_ID = BC00163_A637TBW03_OUTER_SUBJECT_ID[0] ;
         n637TBW03_OUTER_SUBJECT_ID = BC00163_n637TBW03_OUTER_SUBJECT_ID[0] ;
         A638TBW03_CRF_LATEST_VERSION = BC00163_A638TBW03_CRF_LATEST_VERSION[0] ;
         n638TBW03_CRF_LATEST_VERSION = BC00163_n638TBW03_CRF_LATEST_VERSION[0] ;
         A639TBW03_CRF_INPUT_LEVEL = BC00163_A639TBW03_CRF_INPUT_LEVEL[0] ;
         n639TBW03_CRF_INPUT_LEVEL = BC00163_n639TBW03_CRF_INPUT_LEVEL[0] ;
         A640TBW03_LOCK_FLG = BC00163_A640TBW03_LOCK_FLG[0] ;
         n640TBW03_LOCK_FLG = BC00163_n640TBW03_LOCK_FLG[0] ;
         A641TBW03_LOCK_DATETIME = BC00163_A641TBW03_LOCK_DATETIME[0] ;
         n641TBW03_LOCK_DATETIME = BC00163_n641TBW03_LOCK_DATETIME[0] ;
         A644TBW03_LOCK_AUTH_CD = BC00163_A644TBW03_LOCK_AUTH_CD[0] ;
         n644TBW03_LOCK_AUTH_CD = BC00163_n644TBW03_LOCK_AUTH_CD[0] ;
         A645TBW03_UPLOAD_DATETIME = BC00163_A645TBW03_UPLOAD_DATETIME[0] ;
         n645TBW03_UPLOAD_DATETIME = BC00163_n645TBW03_UPLOAD_DATETIME[0] ;
         A648TBW03_UPLOAD_AUTH_CD = BC00163_A648TBW03_UPLOAD_AUTH_CD[0] ;
         n648TBW03_UPLOAD_AUTH_CD = BC00163_n648TBW03_UPLOAD_AUTH_CD[0] ;
         A649TBW03_DM_ARRIVAL_FLG = BC00163_A649TBW03_DM_ARRIVAL_FLG[0] ;
         n649TBW03_DM_ARRIVAL_FLG = BC00163_n649TBW03_DM_ARRIVAL_FLG[0] ;
         A650TBW03_DM_ARRIVAL_DATETIME = BC00163_A650TBW03_DM_ARRIVAL_DATETIME[0] ;
         n650TBW03_DM_ARRIVAL_DATETIME = BC00163_n650TBW03_DM_ARRIVAL_DATETIME[0] ;
         A651TBW03_APPROVAL_FLG = BC00163_A651TBW03_APPROVAL_FLG[0] ;
         n651TBW03_APPROVAL_FLG = BC00163_n651TBW03_APPROVAL_FLG[0] ;
         A652TBW03_APPROVAL_DATETIME = BC00163_A652TBW03_APPROVAL_DATETIME[0] ;
         n652TBW03_APPROVAL_DATETIME = BC00163_n652TBW03_APPROVAL_DATETIME[0] ;
         A655TBW03_APPROVAL_AUTH_CD = BC00163_A655TBW03_APPROVAL_AUTH_CD[0] ;
         n655TBW03_APPROVAL_AUTH_CD = BC00163_n655TBW03_APPROVAL_AUTH_CD[0] ;
         A656TBW03_INPUT_END_FLG = BC00163_A656TBW03_INPUT_END_FLG[0] ;
         n656TBW03_INPUT_END_FLG = BC00163_n656TBW03_INPUT_END_FLG[0] ;
         A657TBW03_INPUT_END_DATETIME = BC00163_A657TBW03_INPUT_END_DATETIME[0] ;
         n657TBW03_INPUT_END_DATETIME = BC00163_n657TBW03_INPUT_END_DATETIME[0] ;
         A660TBW03_INPUT_END_AUTH_CD = BC00163_A660TBW03_INPUT_END_AUTH_CD[0] ;
         n660TBW03_INPUT_END_AUTH_CD = BC00163_n660TBW03_INPUT_END_AUTH_CD[0] ;
         A755TBW03_DEL_FLG = BC00163_A755TBW03_DEL_FLG[0] ;
         n755TBW03_DEL_FLG = BC00163_n755TBW03_DEL_FLG[0] ;
         A756TBW03_CRT_DATETIME = BC00163_A756TBW03_CRT_DATETIME[0] ;
         n756TBW03_CRT_DATETIME = BC00163_n756TBW03_CRT_DATETIME[0] ;
         A759TBW03_CRT_PROG_NM = BC00163_A759TBW03_CRT_PROG_NM[0] ;
         n759TBW03_CRT_PROG_NM = BC00163_n759TBW03_CRT_PROG_NM[0] ;
         A760TBW03_UPD_DATETIME = BC00163_A760TBW03_UPD_DATETIME[0] ;
         n760TBW03_UPD_DATETIME = BC00163_n760TBW03_UPD_DATETIME[0] ;
         A763TBW03_UPD_PROG_NM = BC00163_A763TBW03_UPD_PROG_NM[0] ;
         n763TBW03_UPD_PROG_NM = BC00163_n763TBW03_UPD_PROG_NM[0] ;
         A764TBW03_UPD_CNT = BC00163_A764TBW03_UPD_CNT[0] ;
         n764TBW03_UPD_CNT = BC00163_n764TBW03_UPD_CNT[0] ;
         A628TBW03_STUDY_ID = BC00163_A628TBW03_STUDY_ID[0] ;
         A630TBW03_CRF_ID = BC00163_A630TBW03_CRF_ID[0] ;
         A634TBW03_SITE_ID = BC00163_A634TBW03_SITE_ID[0] ;
         n634TBW03_SITE_ID = BC00163_n634TBW03_SITE_ID[0] ;
         A642TBW03_LOCK_USER_ID = BC00163_A642TBW03_LOCK_USER_ID[0] ;
         n642TBW03_LOCK_USER_ID = BC00163_n642TBW03_LOCK_USER_ID[0] ;
         A646TBW03_UPLOAD_USER_ID = BC00163_A646TBW03_UPLOAD_USER_ID[0] ;
         n646TBW03_UPLOAD_USER_ID = BC00163_n646TBW03_UPLOAD_USER_ID[0] ;
         A653TBW03_APPROVAL_USER_ID = BC00163_A653TBW03_APPROVAL_USER_ID[0] ;
         n653TBW03_APPROVAL_USER_ID = BC00163_n653TBW03_APPROVAL_USER_ID[0] ;
         A658TBW03_INPUT_END_USER_ID = BC00163_A658TBW03_INPUT_END_USER_ID[0] ;
         n658TBW03_INPUT_END_USER_ID = BC00163_n658TBW03_INPUT_END_USER_ID[0] ;
         A757TBW03_CRT_USER_ID = BC00163_A757TBW03_CRT_USER_ID[0] ;
         n757TBW03_CRT_USER_ID = BC00163_n757TBW03_CRT_USER_ID[0] ;
         A761TBW03_UPD_USER_ID = BC00163_A761TBW03_UPD_USER_ID[0] ;
         n761TBW03_UPD_USER_ID = BC00163_n761TBW03_UPD_USER_ID[0] ;
         Z625TBW03_SESSION_ID = A625TBW03_SESSION_ID ;
         Z626TBW03_APP_ID = A626TBW03_APP_ID ;
         Z627TBW03_DISP_DATETIME = A627TBW03_DISP_DATETIME ;
         Z628TBW03_STUDY_ID = A628TBW03_STUDY_ID ;
         Z629TBW03_SUBJECT_ID = A629TBW03_SUBJECT_ID ;
         Z630TBW03_CRF_ID = A630TBW03_CRF_ID ;
         sMode41 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1641( ) ;
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
         pr_default.execute(0, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW03_CRF_SEARCH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z637TBW03_OUTER_SUBJECT_ID, BC00162_A637TBW03_OUTER_SUBJECT_ID[0]) != 0 ) || ( Z638TBW03_CRF_LATEST_VERSION != BC00162_A638TBW03_CRF_LATEST_VERSION[0] ) || ( Z639TBW03_CRF_INPUT_LEVEL != BC00162_A639TBW03_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z640TBW03_LOCK_FLG, BC00162_A640TBW03_LOCK_FLG[0]) != 0 ) || !( Z641TBW03_LOCK_DATETIME.equals( BC00162_A641TBW03_LOCK_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z644TBW03_LOCK_AUTH_CD, BC00162_A644TBW03_LOCK_AUTH_CD[0]) != 0 ) || !( Z645TBW03_UPLOAD_DATETIME.equals( BC00162_A645TBW03_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z648TBW03_UPLOAD_AUTH_CD, BC00162_A648TBW03_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z649TBW03_DM_ARRIVAL_FLG, BC00162_A649TBW03_DM_ARRIVAL_FLG[0]) != 0 ) || !( Z650TBW03_DM_ARRIVAL_DATETIME.equals( BC00162_A650TBW03_DM_ARRIVAL_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z651TBW03_APPROVAL_FLG, BC00162_A651TBW03_APPROVAL_FLG[0]) != 0 ) || !( Z652TBW03_APPROVAL_DATETIME.equals( BC00162_A652TBW03_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z655TBW03_APPROVAL_AUTH_CD, BC00162_A655TBW03_APPROVAL_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z656TBW03_INPUT_END_FLG, BC00162_A656TBW03_INPUT_END_FLG[0]) != 0 ) || !( Z657TBW03_INPUT_END_DATETIME.equals( BC00162_A657TBW03_INPUT_END_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z660TBW03_INPUT_END_AUTH_CD, BC00162_A660TBW03_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z755TBW03_DEL_FLG, BC00162_A755TBW03_DEL_FLG[0]) != 0 ) || !( Z756TBW03_CRT_DATETIME.equals( BC00162_A756TBW03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z759TBW03_CRT_PROG_NM, BC00162_A759TBW03_CRT_PROG_NM[0]) != 0 ) || !( Z760TBW03_UPD_DATETIME.equals( BC00162_A760TBW03_UPD_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z763TBW03_UPD_PROG_NM, BC00162_A763TBW03_UPD_PROG_NM[0]) != 0 ) || ( Z764TBW03_UPD_CNT != BC00162_A764TBW03_UPD_CNT[0] ) || ( GXutil.strcmp(Z634TBW03_SITE_ID, BC00162_A634TBW03_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z642TBW03_LOCK_USER_ID, BC00162_A642TBW03_LOCK_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z646TBW03_UPLOAD_USER_ID, BC00162_A646TBW03_UPLOAD_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z653TBW03_APPROVAL_USER_ID, BC00162_A653TBW03_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z658TBW03_INPUT_END_USER_ID, BC00162_A658TBW03_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z757TBW03_CRT_USER_ID, BC00162_A757TBW03_CRT_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z761TBW03_UPD_USER_ID, BC00162_A761TBW03_UPD_USER_ID[0]) != 0 ) )
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
                  pr_default.execute(12, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Integer(A629TBW03_SUBJECT_ID), new Boolean(n637TBW03_OUTER_SUBJECT_ID), A637TBW03_OUTER_SUBJECT_ID, new Boolean(n638TBW03_CRF_LATEST_VERSION), new Short(A638TBW03_CRF_LATEST_VERSION), new Boolean(n639TBW03_CRF_INPUT_LEVEL), new Byte(A639TBW03_CRF_INPUT_LEVEL), new Boolean(n640TBW03_LOCK_FLG), A640TBW03_LOCK_FLG, new Boolean(n641TBW03_LOCK_DATETIME), A641TBW03_LOCK_DATETIME, new Boolean(n644TBW03_LOCK_AUTH_CD), A644TBW03_LOCK_AUTH_CD, new Boolean(n645TBW03_UPLOAD_DATETIME), A645TBW03_UPLOAD_DATETIME, new Boolean(n648TBW03_UPLOAD_AUTH_CD), A648TBW03_UPLOAD_AUTH_CD, new Boolean(n649TBW03_DM_ARRIVAL_FLG), A649TBW03_DM_ARRIVAL_FLG, new Boolean(n650TBW03_DM_ARRIVAL_DATETIME), A650TBW03_DM_ARRIVAL_DATETIME, new Boolean(n651TBW03_APPROVAL_FLG), A651TBW03_APPROVAL_FLG, new Boolean(n652TBW03_APPROVAL_DATETIME), A652TBW03_APPROVAL_DATETIME, new Boolean(n655TBW03_APPROVAL_AUTH_CD), A655TBW03_APPROVAL_AUTH_CD, new Boolean(n656TBW03_INPUT_END_FLG), A656TBW03_INPUT_END_FLG, new Boolean(n657TBW03_INPUT_END_DATETIME), A657TBW03_INPUT_END_DATETIME, new Boolean(n660TBW03_INPUT_END_AUTH_CD), A660TBW03_INPUT_END_AUTH_CD, new Boolean(n755TBW03_DEL_FLG), A755TBW03_DEL_FLG, new Boolean(n756TBW03_CRT_DATETIME), A756TBW03_CRT_DATETIME, new Boolean(n759TBW03_CRT_PROG_NM), A759TBW03_CRT_PROG_NM, new Boolean(n760TBW03_UPD_DATETIME), A760TBW03_UPD_DATETIME, new Boolean(n763TBW03_UPD_PROG_NM), A763TBW03_UPD_PROG_NM, new Boolean(n764TBW03_UPD_CNT), new Long(A764TBW03_UPD_CNT), new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID), new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID, new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID, new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID, new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID, new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID, new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID, new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID});
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
                  pr_default.execute(13, new Object[] {new Boolean(n637TBW03_OUTER_SUBJECT_ID), A637TBW03_OUTER_SUBJECT_ID, new Boolean(n638TBW03_CRF_LATEST_VERSION), new Short(A638TBW03_CRF_LATEST_VERSION), new Boolean(n639TBW03_CRF_INPUT_LEVEL), new Byte(A639TBW03_CRF_INPUT_LEVEL), new Boolean(n640TBW03_LOCK_FLG), A640TBW03_LOCK_FLG, new Boolean(n641TBW03_LOCK_DATETIME), A641TBW03_LOCK_DATETIME, new Boolean(n644TBW03_LOCK_AUTH_CD), A644TBW03_LOCK_AUTH_CD, new Boolean(n645TBW03_UPLOAD_DATETIME), A645TBW03_UPLOAD_DATETIME, new Boolean(n648TBW03_UPLOAD_AUTH_CD), A648TBW03_UPLOAD_AUTH_CD, new Boolean(n649TBW03_DM_ARRIVAL_FLG), A649TBW03_DM_ARRIVAL_FLG, new Boolean(n650TBW03_DM_ARRIVAL_DATETIME), A650TBW03_DM_ARRIVAL_DATETIME, new Boolean(n651TBW03_APPROVAL_FLG), A651TBW03_APPROVAL_FLG, new Boolean(n652TBW03_APPROVAL_DATETIME), A652TBW03_APPROVAL_DATETIME, new Boolean(n655TBW03_APPROVAL_AUTH_CD), A655TBW03_APPROVAL_AUTH_CD, new Boolean(n656TBW03_INPUT_END_FLG), A656TBW03_INPUT_END_FLG, new Boolean(n657TBW03_INPUT_END_DATETIME), A657TBW03_INPUT_END_DATETIME, new Boolean(n660TBW03_INPUT_END_AUTH_CD), A660TBW03_INPUT_END_AUTH_CD, new Boolean(n755TBW03_DEL_FLG), A755TBW03_DEL_FLG, new Boolean(n756TBW03_CRT_DATETIME), A756TBW03_CRT_DATETIME, new Boolean(n759TBW03_CRT_PROG_NM), A759TBW03_CRT_PROG_NM, new Boolean(n760TBW03_UPD_DATETIME), A760TBW03_UPD_DATETIME, new Boolean(n763TBW03_UPD_PROG_NM), A763TBW03_UPD_PROG_NM, new Boolean(n764TBW03_UPD_CNT), new Long(A764TBW03_UPD_CNT), new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID, new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID, new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID, new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID, new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID, new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID, new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID, A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
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
               pr_default.execute(14, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
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
         /* Using cursor BC001617 */
         pr_default.execute(15, new Object[] {new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID)});
         A631TBW03_CRF_NM = BC001617_A631TBW03_CRF_NM[0] ;
         n631TBW03_CRF_NM = BC001617_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = BC001617_A632TBW03_CRF_SNM[0] ;
         n632TBW03_CRF_SNM = BC001617_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = BC001617_A633TBW03_CRF_ORDER[0] ;
         n633TBW03_CRF_ORDER = BC001617_n633TBW03_CRF_ORDER[0] ;
         pr_default.close(15);
         /* Using cursor BC001618 */
         pr_default.execute(16, new Object[] {new Boolean(n634TBW03_SITE_ID), A634TBW03_SITE_ID});
         A635TBW03_SITE_NM = BC001618_A635TBW03_SITE_NM[0] ;
         n635TBW03_SITE_NM = BC001618_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = BC001618_A636TBW03_SITE_RYAK_NM[0] ;
         n636TBW03_SITE_RYAK_NM = BC001618_n636TBW03_SITE_RYAK_NM[0] ;
         pr_default.close(16);
         /* Using cursor BC001619 */
         pr_default.execute(17, new Object[] {new Boolean(n642TBW03_LOCK_USER_ID), A642TBW03_LOCK_USER_ID});
         A643TBW03_LOCK_USER_NM = BC001619_A643TBW03_LOCK_USER_NM[0] ;
         n643TBW03_LOCK_USER_NM = BC001619_n643TBW03_LOCK_USER_NM[0] ;
         pr_default.close(17);
         /* Using cursor BC001620 */
         pr_default.execute(18, new Object[] {new Boolean(n646TBW03_UPLOAD_USER_ID), A646TBW03_UPLOAD_USER_ID});
         A647TBW03_UPLOAD_USER_NM = BC001620_A647TBW03_UPLOAD_USER_NM[0] ;
         n647TBW03_UPLOAD_USER_NM = BC001620_n647TBW03_UPLOAD_USER_NM[0] ;
         pr_default.close(18);
         /* Using cursor BC001621 */
         pr_default.execute(19, new Object[] {new Boolean(n653TBW03_APPROVAL_USER_ID), A653TBW03_APPROVAL_USER_ID});
         A654TBW03_APPROVAL_USER_NM = BC001621_A654TBW03_APPROVAL_USER_NM[0] ;
         n654TBW03_APPROVAL_USER_NM = BC001621_n654TBW03_APPROVAL_USER_NM[0] ;
         pr_default.close(19);
         /* Using cursor BC001622 */
         pr_default.execute(20, new Object[] {new Boolean(n658TBW03_INPUT_END_USER_ID), A658TBW03_INPUT_END_USER_ID});
         A659TBW03_INPUT_END_USER_NM = BC001622_A659TBW03_INPUT_END_USER_NM[0] ;
         n659TBW03_INPUT_END_USER_NM = BC001622_n659TBW03_INPUT_END_USER_NM[0] ;
         pr_default.close(20);
         /* Using cursor BC001623 */
         pr_default.execute(21, new Object[] {new Boolean(n757TBW03_CRT_USER_ID), A757TBW03_CRT_USER_ID});
         A758TBW03_CRT_USER_NM = BC001623_A758TBW03_CRT_USER_NM[0] ;
         n758TBW03_CRT_USER_NM = BC001623_n758TBW03_CRT_USER_NM[0] ;
         pr_default.close(21);
         /* Using cursor BC001624 */
         pr_default.execute(22, new Object[] {new Boolean(n761TBW03_UPD_USER_ID), A761TBW03_UPD_USER_ID});
         A762TBW03_UPD_USER_NM = BC001624_A762TBW03_UPD_USER_NM[0] ;
         n762TBW03_UPD_USER_NM = BC001624_n762TBW03_UPD_USER_NM[0] ;
         pr_default.close(22);
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
      /* Using cursor BC001625 */
      pr_default.execute(23, new Object[] {A625TBW03_SESSION_ID, A626TBW03_APP_ID, A627TBW03_DISP_DATETIME, new Long(A628TBW03_STUDY_ID), new Integer(A629TBW03_SUBJECT_ID), new Short(A630TBW03_CRF_ID)});
      RcdFound41 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A625TBW03_SESSION_ID = BC001625_A625TBW03_SESSION_ID[0] ;
         A626TBW03_APP_ID = BC001625_A626TBW03_APP_ID[0] ;
         A627TBW03_DISP_DATETIME = BC001625_A627TBW03_DISP_DATETIME[0] ;
         A629TBW03_SUBJECT_ID = BC001625_A629TBW03_SUBJECT_ID[0] ;
         A631TBW03_CRF_NM = BC001625_A631TBW03_CRF_NM[0] ;
         n631TBW03_CRF_NM = BC001625_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = BC001625_A632TBW03_CRF_SNM[0] ;
         n632TBW03_CRF_SNM = BC001625_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = BC001625_A633TBW03_CRF_ORDER[0] ;
         n633TBW03_CRF_ORDER = BC001625_n633TBW03_CRF_ORDER[0] ;
         A635TBW03_SITE_NM = BC001625_A635TBW03_SITE_NM[0] ;
         n635TBW03_SITE_NM = BC001625_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = BC001625_A636TBW03_SITE_RYAK_NM[0] ;
         n636TBW03_SITE_RYAK_NM = BC001625_n636TBW03_SITE_RYAK_NM[0] ;
         A637TBW03_OUTER_SUBJECT_ID = BC001625_A637TBW03_OUTER_SUBJECT_ID[0] ;
         n637TBW03_OUTER_SUBJECT_ID = BC001625_n637TBW03_OUTER_SUBJECT_ID[0] ;
         A638TBW03_CRF_LATEST_VERSION = BC001625_A638TBW03_CRF_LATEST_VERSION[0] ;
         n638TBW03_CRF_LATEST_VERSION = BC001625_n638TBW03_CRF_LATEST_VERSION[0] ;
         A639TBW03_CRF_INPUT_LEVEL = BC001625_A639TBW03_CRF_INPUT_LEVEL[0] ;
         n639TBW03_CRF_INPUT_LEVEL = BC001625_n639TBW03_CRF_INPUT_LEVEL[0] ;
         A640TBW03_LOCK_FLG = BC001625_A640TBW03_LOCK_FLG[0] ;
         n640TBW03_LOCK_FLG = BC001625_n640TBW03_LOCK_FLG[0] ;
         A641TBW03_LOCK_DATETIME = BC001625_A641TBW03_LOCK_DATETIME[0] ;
         n641TBW03_LOCK_DATETIME = BC001625_n641TBW03_LOCK_DATETIME[0] ;
         A643TBW03_LOCK_USER_NM = BC001625_A643TBW03_LOCK_USER_NM[0] ;
         n643TBW03_LOCK_USER_NM = BC001625_n643TBW03_LOCK_USER_NM[0] ;
         A644TBW03_LOCK_AUTH_CD = BC001625_A644TBW03_LOCK_AUTH_CD[0] ;
         n644TBW03_LOCK_AUTH_CD = BC001625_n644TBW03_LOCK_AUTH_CD[0] ;
         A645TBW03_UPLOAD_DATETIME = BC001625_A645TBW03_UPLOAD_DATETIME[0] ;
         n645TBW03_UPLOAD_DATETIME = BC001625_n645TBW03_UPLOAD_DATETIME[0] ;
         A647TBW03_UPLOAD_USER_NM = BC001625_A647TBW03_UPLOAD_USER_NM[0] ;
         n647TBW03_UPLOAD_USER_NM = BC001625_n647TBW03_UPLOAD_USER_NM[0] ;
         A648TBW03_UPLOAD_AUTH_CD = BC001625_A648TBW03_UPLOAD_AUTH_CD[0] ;
         n648TBW03_UPLOAD_AUTH_CD = BC001625_n648TBW03_UPLOAD_AUTH_CD[0] ;
         A649TBW03_DM_ARRIVAL_FLG = BC001625_A649TBW03_DM_ARRIVAL_FLG[0] ;
         n649TBW03_DM_ARRIVAL_FLG = BC001625_n649TBW03_DM_ARRIVAL_FLG[0] ;
         A650TBW03_DM_ARRIVAL_DATETIME = BC001625_A650TBW03_DM_ARRIVAL_DATETIME[0] ;
         n650TBW03_DM_ARRIVAL_DATETIME = BC001625_n650TBW03_DM_ARRIVAL_DATETIME[0] ;
         A651TBW03_APPROVAL_FLG = BC001625_A651TBW03_APPROVAL_FLG[0] ;
         n651TBW03_APPROVAL_FLG = BC001625_n651TBW03_APPROVAL_FLG[0] ;
         A652TBW03_APPROVAL_DATETIME = BC001625_A652TBW03_APPROVAL_DATETIME[0] ;
         n652TBW03_APPROVAL_DATETIME = BC001625_n652TBW03_APPROVAL_DATETIME[0] ;
         A654TBW03_APPROVAL_USER_NM = BC001625_A654TBW03_APPROVAL_USER_NM[0] ;
         n654TBW03_APPROVAL_USER_NM = BC001625_n654TBW03_APPROVAL_USER_NM[0] ;
         A655TBW03_APPROVAL_AUTH_CD = BC001625_A655TBW03_APPROVAL_AUTH_CD[0] ;
         n655TBW03_APPROVAL_AUTH_CD = BC001625_n655TBW03_APPROVAL_AUTH_CD[0] ;
         A656TBW03_INPUT_END_FLG = BC001625_A656TBW03_INPUT_END_FLG[0] ;
         n656TBW03_INPUT_END_FLG = BC001625_n656TBW03_INPUT_END_FLG[0] ;
         A657TBW03_INPUT_END_DATETIME = BC001625_A657TBW03_INPUT_END_DATETIME[0] ;
         n657TBW03_INPUT_END_DATETIME = BC001625_n657TBW03_INPUT_END_DATETIME[0] ;
         A659TBW03_INPUT_END_USER_NM = BC001625_A659TBW03_INPUT_END_USER_NM[0] ;
         n659TBW03_INPUT_END_USER_NM = BC001625_n659TBW03_INPUT_END_USER_NM[0] ;
         A660TBW03_INPUT_END_AUTH_CD = BC001625_A660TBW03_INPUT_END_AUTH_CD[0] ;
         n660TBW03_INPUT_END_AUTH_CD = BC001625_n660TBW03_INPUT_END_AUTH_CD[0] ;
         A755TBW03_DEL_FLG = BC001625_A755TBW03_DEL_FLG[0] ;
         n755TBW03_DEL_FLG = BC001625_n755TBW03_DEL_FLG[0] ;
         A756TBW03_CRT_DATETIME = BC001625_A756TBW03_CRT_DATETIME[0] ;
         n756TBW03_CRT_DATETIME = BC001625_n756TBW03_CRT_DATETIME[0] ;
         A758TBW03_CRT_USER_NM = BC001625_A758TBW03_CRT_USER_NM[0] ;
         n758TBW03_CRT_USER_NM = BC001625_n758TBW03_CRT_USER_NM[0] ;
         A759TBW03_CRT_PROG_NM = BC001625_A759TBW03_CRT_PROG_NM[0] ;
         n759TBW03_CRT_PROG_NM = BC001625_n759TBW03_CRT_PROG_NM[0] ;
         A760TBW03_UPD_DATETIME = BC001625_A760TBW03_UPD_DATETIME[0] ;
         n760TBW03_UPD_DATETIME = BC001625_n760TBW03_UPD_DATETIME[0] ;
         A762TBW03_UPD_USER_NM = BC001625_A762TBW03_UPD_USER_NM[0] ;
         n762TBW03_UPD_USER_NM = BC001625_n762TBW03_UPD_USER_NM[0] ;
         A763TBW03_UPD_PROG_NM = BC001625_A763TBW03_UPD_PROG_NM[0] ;
         n763TBW03_UPD_PROG_NM = BC001625_n763TBW03_UPD_PROG_NM[0] ;
         A764TBW03_UPD_CNT = BC001625_A764TBW03_UPD_CNT[0] ;
         n764TBW03_UPD_CNT = BC001625_n764TBW03_UPD_CNT[0] ;
         A628TBW03_STUDY_ID = BC001625_A628TBW03_STUDY_ID[0] ;
         A630TBW03_CRF_ID = BC001625_A630TBW03_CRF_ID[0] ;
         A634TBW03_SITE_ID = BC001625_A634TBW03_SITE_ID[0] ;
         n634TBW03_SITE_ID = BC001625_n634TBW03_SITE_ID[0] ;
         A642TBW03_LOCK_USER_ID = BC001625_A642TBW03_LOCK_USER_ID[0] ;
         n642TBW03_LOCK_USER_ID = BC001625_n642TBW03_LOCK_USER_ID[0] ;
         A646TBW03_UPLOAD_USER_ID = BC001625_A646TBW03_UPLOAD_USER_ID[0] ;
         n646TBW03_UPLOAD_USER_ID = BC001625_n646TBW03_UPLOAD_USER_ID[0] ;
         A653TBW03_APPROVAL_USER_ID = BC001625_A653TBW03_APPROVAL_USER_ID[0] ;
         n653TBW03_APPROVAL_USER_ID = BC001625_n653TBW03_APPROVAL_USER_ID[0] ;
         A658TBW03_INPUT_END_USER_ID = BC001625_A658TBW03_INPUT_END_USER_ID[0] ;
         n658TBW03_INPUT_END_USER_ID = BC001625_n658TBW03_INPUT_END_USER_ID[0] ;
         A757TBW03_CRT_USER_ID = BC001625_A757TBW03_CRT_USER_ID[0] ;
         n757TBW03_CRT_USER_ID = BC001625_n757TBW03_CRT_USER_ID[0] ;
         A761TBW03_UPD_USER_ID = BC001625_A761TBW03_UPD_USER_ID[0] ;
         n761TBW03_UPD_USER_ID = BC001625_n761TBW03_UPD_USER_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1641( )
   {
      pr_default.readNext(23);
      RcdFound41 = (short)(0) ;
      scanKeyLoad1641( ) ;
   }

   public void scanKeyLoad1641( )
   {
      sMode41 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A625TBW03_SESSION_ID = BC001625_A625TBW03_SESSION_ID[0] ;
         A626TBW03_APP_ID = BC001625_A626TBW03_APP_ID[0] ;
         A627TBW03_DISP_DATETIME = BC001625_A627TBW03_DISP_DATETIME[0] ;
         A629TBW03_SUBJECT_ID = BC001625_A629TBW03_SUBJECT_ID[0] ;
         A631TBW03_CRF_NM = BC001625_A631TBW03_CRF_NM[0] ;
         n631TBW03_CRF_NM = BC001625_n631TBW03_CRF_NM[0] ;
         A632TBW03_CRF_SNM = BC001625_A632TBW03_CRF_SNM[0] ;
         n632TBW03_CRF_SNM = BC001625_n632TBW03_CRF_SNM[0] ;
         A633TBW03_CRF_ORDER = BC001625_A633TBW03_CRF_ORDER[0] ;
         n633TBW03_CRF_ORDER = BC001625_n633TBW03_CRF_ORDER[0] ;
         A635TBW03_SITE_NM = BC001625_A635TBW03_SITE_NM[0] ;
         n635TBW03_SITE_NM = BC001625_n635TBW03_SITE_NM[0] ;
         A636TBW03_SITE_RYAK_NM = BC001625_A636TBW03_SITE_RYAK_NM[0] ;
         n636TBW03_SITE_RYAK_NM = BC001625_n636TBW03_SITE_RYAK_NM[0] ;
         A637TBW03_OUTER_SUBJECT_ID = BC001625_A637TBW03_OUTER_SUBJECT_ID[0] ;
         n637TBW03_OUTER_SUBJECT_ID = BC001625_n637TBW03_OUTER_SUBJECT_ID[0] ;
         A638TBW03_CRF_LATEST_VERSION = BC001625_A638TBW03_CRF_LATEST_VERSION[0] ;
         n638TBW03_CRF_LATEST_VERSION = BC001625_n638TBW03_CRF_LATEST_VERSION[0] ;
         A639TBW03_CRF_INPUT_LEVEL = BC001625_A639TBW03_CRF_INPUT_LEVEL[0] ;
         n639TBW03_CRF_INPUT_LEVEL = BC001625_n639TBW03_CRF_INPUT_LEVEL[0] ;
         A640TBW03_LOCK_FLG = BC001625_A640TBW03_LOCK_FLG[0] ;
         n640TBW03_LOCK_FLG = BC001625_n640TBW03_LOCK_FLG[0] ;
         A641TBW03_LOCK_DATETIME = BC001625_A641TBW03_LOCK_DATETIME[0] ;
         n641TBW03_LOCK_DATETIME = BC001625_n641TBW03_LOCK_DATETIME[0] ;
         A643TBW03_LOCK_USER_NM = BC001625_A643TBW03_LOCK_USER_NM[0] ;
         n643TBW03_LOCK_USER_NM = BC001625_n643TBW03_LOCK_USER_NM[0] ;
         A644TBW03_LOCK_AUTH_CD = BC001625_A644TBW03_LOCK_AUTH_CD[0] ;
         n644TBW03_LOCK_AUTH_CD = BC001625_n644TBW03_LOCK_AUTH_CD[0] ;
         A645TBW03_UPLOAD_DATETIME = BC001625_A645TBW03_UPLOAD_DATETIME[0] ;
         n645TBW03_UPLOAD_DATETIME = BC001625_n645TBW03_UPLOAD_DATETIME[0] ;
         A647TBW03_UPLOAD_USER_NM = BC001625_A647TBW03_UPLOAD_USER_NM[0] ;
         n647TBW03_UPLOAD_USER_NM = BC001625_n647TBW03_UPLOAD_USER_NM[0] ;
         A648TBW03_UPLOAD_AUTH_CD = BC001625_A648TBW03_UPLOAD_AUTH_CD[0] ;
         n648TBW03_UPLOAD_AUTH_CD = BC001625_n648TBW03_UPLOAD_AUTH_CD[0] ;
         A649TBW03_DM_ARRIVAL_FLG = BC001625_A649TBW03_DM_ARRIVAL_FLG[0] ;
         n649TBW03_DM_ARRIVAL_FLG = BC001625_n649TBW03_DM_ARRIVAL_FLG[0] ;
         A650TBW03_DM_ARRIVAL_DATETIME = BC001625_A650TBW03_DM_ARRIVAL_DATETIME[0] ;
         n650TBW03_DM_ARRIVAL_DATETIME = BC001625_n650TBW03_DM_ARRIVAL_DATETIME[0] ;
         A651TBW03_APPROVAL_FLG = BC001625_A651TBW03_APPROVAL_FLG[0] ;
         n651TBW03_APPROVAL_FLG = BC001625_n651TBW03_APPROVAL_FLG[0] ;
         A652TBW03_APPROVAL_DATETIME = BC001625_A652TBW03_APPROVAL_DATETIME[0] ;
         n652TBW03_APPROVAL_DATETIME = BC001625_n652TBW03_APPROVAL_DATETIME[0] ;
         A654TBW03_APPROVAL_USER_NM = BC001625_A654TBW03_APPROVAL_USER_NM[0] ;
         n654TBW03_APPROVAL_USER_NM = BC001625_n654TBW03_APPROVAL_USER_NM[0] ;
         A655TBW03_APPROVAL_AUTH_CD = BC001625_A655TBW03_APPROVAL_AUTH_CD[0] ;
         n655TBW03_APPROVAL_AUTH_CD = BC001625_n655TBW03_APPROVAL_AUTH_CD[0] ;
         A656TBW03_INPUT_END_FLG = BC001625_A656TBW03_INPUT_END_FLG[0] ;
         n656TBW03_INPUT_END_FLG = BC001625_n656TBW03_INPUT_END_FLG[0] ;
         A657TBW03_INPUT_END_DATETIME = BC001625_A657TBW03_INPUT_END_DATETIME[0] ;
         n657TBW03_INPUT_END_DATETIME = BC001625_n657TBW03_INPUT_END_DATETIME[0] ;
         A659TBW03_INPUT_END_USER_NM = BC001625_A659TBW03_INPUT_END_USER_NM[0] ;
         n659TBW03_INPUT_END_USER_NM = BC001625_n659TBW03_INPUT_END_USER_NM[0] ;
         A660TBW03_INPUT_END_AUTH_CD = BC001625_A660TBW03_INPUT_END_AUTH_CD[0] ;
         n660TBW03_INPUT_END_AUTH_CD = BC001625_n660TBW03_INPUT_END_AUTH_CD[0] ;
         A755TBW03_DEL_FLG = BC001625_A755TBW03_DEL_FLG[0] ;
         n755TBW03_DEL_FLG = BC001625_n755TBW03_DEL_FLG[0] ;
         A756TBW03_CRT_DATETIME = BC001625_A756TBW03_CRT_DATETIME[0] ;
         n756TBW03_CRT_DATETIME = BC001625_n756TBW03_CRT_DATETIME[0] ;
         A758TBW03_CRT_USER_NM = BC001625_A758TBW03_CRT_USER_NM[0] ;
         n758TBW03_CRT_USER_NM = BC001625_n758TBW03_CRT_USER_NM[0] ;
         A759TBW03_CRT_PROG_NM = BC001625_A759TBW03_CRT_PROG_NM[0] ;
         n759TBW03_CRT_PROG_NM = BC001625_n759TBW03_CRT_PROG_NM[0] ;
         A760TBW03_UPD_DATETIME = BC001625_A760TBW03_UPD_DATETIME[0] ;
         n760TBW03_UPD_DATETIME = BC001625_n760TBW03_UPD_DATETIME[0] ;
         A762TBW03_UPD_USER_NM = BC001625_A762TBW03_UPD_USER_NM[0] ;
         n762TBW03_UPD_USER_NM = BC001625_n762TBW03_UPD_USER_NM[0] ;
         A763TBW03_UPD_PROG_NM = BC001625_A763TBW03_UPD_PROG_NM[0] ;
         n763TBW03_UPD_PROG_NM = BC001625_n763TBW03_UPD_PROG_NM[0] ;
         A764TBW03_UPD_CNT = BC001625_A764TBW03_UPD_CNT[0] ;
         n764TBW03_UPD_CNT = BC001625_n764TBW03_UPD_CNT[0] ;
         A628TBW03_STUDY_ID = BC001625_A628TBW03_STUDY_ID[0] ;
         A630TBW03_CRF_ID = BC001625_A630TBW03_CRF_ID[0] ;
         A634TBW03_SITE_ID = BC001625_A634TBW03_SITE_ID[0] ;
         n634TBW03_SITE_ID = BC001625_n634TBW03_SITE_ID[0] ;
         A642TBW03_LOCK_USER_ID = BC001625_A642TBW03_LOCK_USER_ID[0] ;
         n642TBW03_LOCK_USER_ID = BC001625_n642TBW03_LOCK_USER_ID[0] ;
         A646TBW03_UPLOAD_USER_ID = BC001625_A646TBW03_UPLOAD_USER_ID[0] ;
         n646TBW03_UPLOAD_USER_ID = BC001625_n646TBW03_UPLOAD_USER_ID[0] ;
         A653TBW03_APPROVAL_USER_ID = BC001625_A653TBW03_APPROVAL_USER_ID[0] ;
         n653TBW03_APPROVAL_USER_ID = BC001625_n653TBW03_APPROVAL_USER_ID[0] ;
         A658TBW03_INPUT_END_USER_ID = BC001625_A658TBW03_INPUT_END_USER_ID[0] ;
         n658TBW03_INPUT_END_USER_ID = BC001625_n658TBW03_INPUT_END_USER_ID[0] ;
         A757TBW03_CRT_USER_ID = BC001625_A757TBW03_CRT_USER_ID[0] ;
         n757TBW03_CRT_USER_ID = BC001625_n757TBW03_CRT_USER_ID[0] ;
         A761TBW03_UPD_USER_ID = BC001625_A761TBW03_UPD_USER_ID[0] ;
         n761TBW03_UPD_USER_ID = BC001625_n761TBW03_UPD_USER_ID[0] ;
      }
      Gx_mode = sMode41 ;
   }

   public void scanKeyEnd1641( )
   {
      pr_default.close(23);
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
      A631TBW03_CRF_NM = "" ;
      n631TBW03_CRF_NM = false ;
      A632TBW03_CRF_SNM = "" ;
      n632TBW03_CRF_SNM = false ;
      A633TBW03_CRF_ORDER = 0 ;
      n633TBW03_CRF_ORDER = false ;
      A634TBW03_SITE_ID = "" ;
      n634TBW03_SITE_ID = false ;
      A635TBW03_SITE_NM = "" ;
      n635TBW03_SITE_NM = false ;
      A636TBW03_SITE_RYAK_NM = "" ;
      n636TBW03_SITE_RYAK_NM = false ;
      A637TBW03_OUTER_SUBJECT_ID = "" ;
      n637TBW03_OUTER_SUBJECT_ID = false ;
      A638TBW03_CRF_LATEST_VERSION = (short)(0) ;
      n638TBW03_CRF_LATEST_VERSION = false ;
      A639TBW03_CRF_INPUT_LEVEL = (byte)(0) ;
      n639TBW03_CRF_INPUT_LEVEL = false ;
      A640TBW03_LOCK_FLG = "" ;
      n640TBW03_LOCK_FLG = false ;
      A641TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n641TBW03_LOCK_DATETIME = false ;
      A642TBW03_LOCK_USER_ID = "" ;
      n642TBW03_LOCK_USER_ID = false ;
      A643TBW03_LOCK_USER_NM = "" ;
      n643TBW03_LOCK_USER_NM = false ;
      A644TBW03_LOCK_AUTH_CD = "" ;
      n644TBW03_LOCK_AUTH_CD = false ;
      A645TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n645TBW03_UPLOAD_DATETIME = false ;
      A646TBW03_UPLOAD_USER_ID = "" ;
      n646TBW03_UPLOAD_USER_ID = false ;
      A647TBW03_UPLOAD_USER_NM = "" ;
      n647TBW03_UPLOAD_USER_NM = false ;
      A648TBW03_UPLOAD_AUTH_CD = "" ;
      n648TBW03_UPLOAD_AUTH_CD = false ;
      A649TBW03_DM_ARRIVAL_FLG = "" ;
      n649TBW03_DM_ARRIVAL_FLG = false ;
      A650TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n650TBW03_DM_ARRIVAL_DATETIME = false ;
      A651TBW03_APPROVAL_FLG = "" ;
      n651TBW03_APPROVAL_FLG = false ;
      A652TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n652TBW03_APPROVAL_DATETIME = false ;
      A653TBW03_APPROVAL_USER_ID = "" ;
      n653TBW03_APPROVAL_USER_ID = false ;
      A654TBW03_APPROVAL_USER_NM = "" ;
      n654TBW03_APPROVAL_USER_NM = false ;
      A655TBW03_APPROVAL_AUTH_CD = "" ;
      n655TBW03_APPROVAL_AUTH_CD = false ;
      A656TBW03_INPUT_END_FLG = "" ;
      n656TBW03_INPUT_END_FLG = false ;
      A657TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n657TBW03_INPUT_END_DATETIME = false ;
      A658TBW03_INPUT_END_USER_ID = "" ;
      n658TBW03_INPUT_END_USER_ID = false ;
      A659TBW03_INPUT_END_USER_NM = "" ;
      n659TBW03_INPUT_END_USER_NM = false ;
      A660TBW03_INPUT_END_AUTH_CD = "" ;
      n660TBW03_INPUT_END_AUTH_CD = false ;
      A755TBW03_DEL_FLG = "" ;
      n755TBW03_DEL_FLG = false ;
      A756TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n756TBW03_CRT_DATETIME = false ;
      A757TBW03_CRT_USER_ID = "" ;
      n757TBW03_CRT_USER_ID = false ;
      A758TBW03_CRT_USER_NM = "" ;
      n758TBW03_CRT_USER_NM = false ;
      A759TBW03_CRT_PROG_NM = "" ;
      n759TBW03_CRT_PROG_NM = false ;
      A760TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n760TBW03_UPD_DATETIME = false ;
      A761TBW03_UPD_USER_ID = "" ;
      n761TBW03_UPD_USER_ID = false ;
      A762TBW03_UPD_USER_NM = "" ;
      n762TBW03_UPD_USER_NM = false ;
      A763TBW03_UPD_PROG_NM = "" ;
      n763TBW03_UPD_PROG_NM = false ;
      A764TBW03_UPD_CNT = 0 ;
      n764TBW03_UPD_CNT = false ;
   }

   public void initAll1641( )
   {
      A625TBW03_SESSION_ID = "" ;
      A626TBW03_APP_ID = "" ;
      A627TBW03_DISP_DATETIME = "" ;
      A628TBW03_STUDY_ID = 0 ;
      A629TBW03_SUBJECT_ID = 0 ;
      A630TBW03_CRF_ID = (short)(0) ;
      initializeNonKey1641( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow41( SdtTBW03_CRF_SEARCH obj41 )
   {
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Mode( Gx_mode );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm( A631TBW03_CRF_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm( A632TBW03_CRF_SNM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order( A633TBW03_CRF_ORDER );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id( A634TBW03_SITE_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm( A635TBW03_SITE_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm( A636TBW03_SITE_RYAK_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id( A637TBW03_OUTER_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version( A638TBW03_CRF_LATEST_VERSION );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level( A639TBW03_CRF_INPUT_LEVEL );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg( A640TBW03_LOCK_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime( A641TBW03_LOCK_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id( A642TBW03_LOCK_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm( A643TBW03_LOCK_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd( A644TBW03_LOCK_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime( A645TBW03_UPLOAD_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id( A646TBW03_UPLOAD_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm( A647TBW03_UPLOAD_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd( A648TBW03_UPLOAD_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg( A649TBW03_DM_ARRIVAL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime( A650TBW03_DM_ARRIVAL_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg( A651TBW03_APPROVAL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime( A652TBW03_APPROVAL_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id( A653TBW03_APPROVAL_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm( A654TBW03_APPROVAL_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd( A655TBW03_APPROVAL_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg( A656TBW03_INPUT_END_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime( A657TBW03_INPUT_END_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id( A658TBW03_INPUT_END_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm( A659TBW03_INPUT_END_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd( A660TBW03_INPUT_END_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg( A755TBW03_DEL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime( A756TBW03_CRT_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id( A757TBW03_CRT_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm( A758TBW03_CRT_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm( A759TBW03_CRT_PROG_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime( A760TBW03_UPD_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id( A761TBW03_UPD_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm( A762TBW03_UPD_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm( A763TBW03_UPD_PROG_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt( A764TBW03_UPD_CNT );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id( A625TBW03_SESSION_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id( A626TBW03_APP_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime( A627TBW03_DISP_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id( A628TBW03_STUDY_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id( A629TBW03_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id( A630TBW03_CRF_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z( Z625TBW03_SESSION_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z( Z626TBW03_APP_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z( Z627TBW03_DISP_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z( Z628TBW03_STUDY_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z( Z629TBW03_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z( Z630TBW03_CRF_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z( Z631TBW03_CRF_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z( Z632TBW03_CRF_SNM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z( Z633TBW03_CRF_ORDER );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z( Z634TBW03_SITE_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z( Z635TBW03_SITE_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z( Z636TBW03_SITE_RYAK_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z( Z637TBW03_OUTER_SUBJECT_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z( Z638TBW03_CRF_LATEST_VERSION );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z( Z639TBW03_CRF_INPUT_LEVEL );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z( Z640TBW03_LOCK_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z( Z641TBW03_LOCK_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z( Z642TBW03_LOCK_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z( Z643TBW03_LOCK_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z( Z644TBW03_LOCK_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z( Z645TBW03_UPLOAD_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z( Z646TBW03_UPLOAD_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z( Z647TBW03_UPLOAD_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z( Z648TBW03_UPLOAD_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z( Z649TBW03_DM_ARRIVAL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z( Z650TBW03_DM_ARRIVAL_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z( Z651TBW03_APPROVAL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z( Z652TBW03_APPROVAL_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z( Z653TBW03_APPROVAL_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z( Z654TBW03_APPROVAL_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z( Z655TBW03_APPROVAL_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z( Z656TBW03_INPUT_END_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z( Z657TBW03_INPUT_END_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z( Z658TBW03_INPUT_END_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z( Z659TBW03_INPUT_END_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z( Z660TBW03_INPUT_END_AUTH_CD );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z( Z755TBW03_DEL_FLG );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z( Z756TBW03_CRT_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z( Z757TBW03_CRT_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z( Z758TBW03_CRT_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z( Z759TBW03_CRT_PROG_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z( Z760TBW03_UPD_DATETIME );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z( Z761TBW03_UPD_USER_ID );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z( Z762TBW03_UPD_USER_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z( Z763TBW03_UPD_PROG_NM );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z( Z764TBW03_UPD_CNT );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N( (byte)((byte)((n631TBW03_CRF_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N( (byte)((byte)((n632TBW03_CRF_SNM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N( (byte)((byte)((n633TBW03_CRF_ORDER)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N( (byte)((byte)((n634TBW03_SITE_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N( (byte)((byte)((n635TBW03_SITE_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N( (byte)((byte)((n636TBW03_SITE_RYAK_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N( (byte)((byte)((n637TBW03_OUTER_SUBJECT_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N( (byte)((byte)((n638TBW03_CRF_LATEST_VERSION)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N( (byte)((byte)((n639TBW03_CRF_INPUT_LEVEL)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N( (byte)((byte)((n640TBW03_LOCK_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N( (byte)((byte)((n641TBW03_LOCK_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N( (byte)((byte)((n642TBW03_LOCK_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N( (byte)((byte)((n643TBW03_LOCK_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N( (byte)((byte)((n644TBW03_LOCK_AUTH_CD)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N( (byte)((byte)((n645TBW03_UPLOAD_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N( (byte)((byte)((n646TBW03_UPLOAD_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N( (byte)((byte)((n647TBW03_UPLOAD_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N( (byte)((byte)((n648TBW03_UPLOAD_AUTH_CD)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N( (byte)((byte)((n649TBW03_DM_ARRIVAL_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N( (byte)((byte)((n650TBW03_DM_ARRIVAL_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N( (byte)((byte)((n651TBW03_APPROVAL_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N( (byte)((byte)((n652TBW03_APPROVAL_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N( (byte)((byte)((n653TBW03_APPROVAL_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N( (byte)((byte)((n654TBW03_APPROVAL_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N( (byte)((byte)((n655TBW03_APPROVAL_AUTH_CD)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N( (byte)((byte)((n656TBW03_INPUT_END_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N( (byte)((byte)((n657TBW03_INPUT_END_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N( (byte)((byte)((n658TBW03_INPUT_END_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N( (byte)((byte)((n659TBW03_INPUT_END_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N( (byte)((byte)((n660TBW03_INPUT_END_AUTH_CD)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N( (byte)((byte)((n755TBW03_DEL_FLG)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N( (byte)((byte)((n756TBW03_CRT_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N( (byte)((byte)((n757TBW03_CRT_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N( (byte)((byte)((n758TBW03_CRT_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N( (byte)((byte)((n759TBW03_CRT_PROG_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N( (byte)((byte)((n760TBW03_UPD_DATETIME)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N( (byte)((byte)((n761TBW03_UPD_USER_ID)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N( (byte)((byte)((n762TBW03_UPD_USER_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N( (byte)((byte)((n763TBW03_UPD_PROG_NM)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N( (byte)((byte)((n764TBW03_UPD_CNT)?1:0)) );
      obj41.setgxTv_SdtTBW03_CRF_SEARCH_Mode( Gx_mode );
   }

   public void RowToVars41( SdtTBW03_CRF_SEARCH obj41 ,
                            int forceLoad )
   {
      Gx_mode = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Mode() ;
      A631TBW03_CRF_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm() ;
      n631TBW03_CRF_NM = false ;
      A632TBW03_CRF_SNM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm() ;
      n632TBW03_CRF_SNM = false ;
      A633TBW03_CRF_ORDER = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order() ;
      n633TBW03_CRF_ORDER = false ;
      A634TBW03_SITE_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id() ;
      n634TBW03_SITE_ID = false ;
      A635TBW03_SITE_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm() ;
      n635TBW03_SITE_NM = false ;
      A636TBW03_SITE_RYAK_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm() ;
      n636TBW03_SITE_RYAK_NM = false ;
      A637TBW03_OUTER_SUBJECT_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id() ;
      n637TBW03_OUTER_SUBJECT_ID = false ;
      A638TBW03_CRF_LATEST_VERSION = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version() ;
      n638TBW03_CRF_LATEST_VERSION = false ;
      A639TBW03_CRF_INPUT_LEVEL = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level() ;
      n639TBW03_CRF_INPUT_LEVEL = false ;
      A640TBW03_LOCK_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg() ;
      n640TBW03_LOCK_FLG = false ;
      A641TBW03_LOCK_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime() ;
      n641TBW03_LOCK_DATETIME = false ;
      A642TBW03_LOCK_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id() ;
      n642TBW03_LOCK_USER_ID = false ;
      A643TBW03_LOCK_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm() ;
      n643TBW03_LOCK_USER_NM = false ;
      A644TBW03_LOCK_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd() ;
      n644TBW03_LOCK_AUTH_CD = false ;
      A645TBW03_UPLOAD_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime() ;
      n645TBW03_UPLOAD_DATETIME = false ;
      A646TBW03_UPLOAD_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id() ;
      n646TBW03_UPLOAD_USER_ID = false ;
      A647TBW03_UPLOAD_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm() ;
      n647TBW03_UPLOAD_USER_NM = false ;
      A648TBW03_UPLOAD_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd() ;
      n648TBW03_UPLOAD_AUTH_CD = false ;
      A649TBW03_DM_ARRIVAL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg() ;
      n649TBW03_DM_ARRIVAL_FLG = false ;
      A650TBW03_DM_ARRIVAL_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime() ;
      n650TBW03_DM_ARRIVAL_DATETIME = false ;
      A651TBW03_APPROVAL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg() ;
      n651TBW03_APPROVAL_FLG = false ;
      A652TBW03_APPROVAL_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime() ;
      n652TBW03_APPROVAL_DATETIME = false ;
      A653TBW03_APPROVAL_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id() ;
      n653TBW03_APPROVAL_USER_ID = false ;
      A654TBW03_APPROVAL_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm() ;
      n654TBW03_APPROVAL_USER_NM = false ;
      A655TBW03_APPROVAL_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd() ;
      n655TBW03_APPROVAL_AUTH_CD = false ;
      A656TBW03_INPUT_END_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg() ;
      n656TBW03_INPUT_END_FLG = false ;
      A657TBW03_INPUT_END_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime() ;
      n657TBW03_INPUT_END_DATETIME = false ;
      A658TBW03_INPUT_END_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id() ;
      n658TBW03_INPUT_END_USER_ID = false ;
      A659TBW03_INPUT_END_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm() ;
      n659TBW03_INPUT_END_USER_NM = false ;
      A660TBW03_INPUT_END_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd() ;
      n660TBW03_INPUT_END_AUTH_CD = false ;
      A755TBW03_DEL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg() ;
      n755TBW03_DEL_FLG = false ;
      A756TBW03_CRT_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime() ;
      n756TBW03_CRT_DATETIME = false ;
      A757TBW03_CRT_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id() ;
      n757TBW03_CRT_USER_ID = false ;
      A758TBW03_CRT_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm() ;
      n758TBW03_CRT_USER_NM = false ;
      A759TBW03_CRT_PROG_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm() ;
      n759TBW03_CRT_PROG_NM = false ;
      A760TBW03_UPD_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime() ;
      n760TBW03_UPD_DATETIME = false ;
      A761TBW03_UPD_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id() ;
      n761TBW03_UPD_USER_ID = false ;
      A762TBW03_UPD_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm() ;
      n762TBW03_UPD_USER_NM = false ;
      A763TBW03_UPD_PROG_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm() ;
      n763TBW03_UPD_PROG_NM = false ;
      A764TBW03_UPD_CNT = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt() ;
      n764TBW03_UPD_CNT = false ;
      A625TBW03_SESSION_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id() ;
      A626TBW03_APP_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id() ;
      A627TBW03_DISP_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime() ;
      A628TBW03_STUDY_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id() ;
      A629TBW03_SUBJECT_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id() ;
      A630TBW03_CRF_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id() ;
      Z625TBW03_SESSION_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z() ;
      Z626TBW03_APP_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z() ;
      Z627TBW03_DISP_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z() ;
      Z628TBW03_STUDY_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z() ;
      Z629TBW03_SUBJECT_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z() ;
      Z630TBW03_CRF_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z() ;
      Z631TBW03_CRF_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z() ;
      Z632TBW03_CRF_SNM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z() ;
      Z633TBW03_CRF_ORDER = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z() ;
      Z634TBW03_SITE_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z() ;
      Z635TBW03_SITE_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z() ;
      Z636TBW03_SITE_RYAK_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z() ;
      Z637TBW03_OUTER_SUBJECT_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z() ;
      Z638TBW03_CRF_LATEST_VERSION = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z() ;
      Z639TBW03_CRF_INPUT_LEVEL = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z() ;
      Z640TBW03_LOCK_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z() ;
      Z641TBW03_LOCK_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z() ;
      Z642TBW03_LOCK_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z() ;
      Z643TBW03_LOCK_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z() ;
      Z644TBW03_LOCK_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z() ;
      Z645TBW03_UPLOAD_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z() ;
      Z646TBW03_UPLOAD_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z() ;
      Z647TBW03_UPLOAD_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z() ;
      Z648TBW03_UPLOAD_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z() ;
      Z649TBW03_DM_ARRIVAL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z() ;
      Z650TBW03_DM_ARRIVAL_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z() ;
      Z651TBW03_APPROVAL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z() ;
      Z652TBW03_APPROVAL_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z() ;
      Z653TBW03_APPROVAL_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z() ;
      Z654TBW03_APPROVAL_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z() ;
      Z655TBW03_APPROVAL_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z() ;
      Z656TBW03_INPUT_END_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z() ;
      Z657TBW03_INPUT_END_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z() ;
      Z658TBW03_INPUT_END_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z() ;
      Z659TBW03_INPUT_END_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z() ;
      Z660TBW03_INPUT_END_AUTH_CD = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z() ;
      Z755TBW03_DEL_FLG = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z() ;
      Z756TBW03_CRT_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z() ;
      Z757TBW03_CRT_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z() ;
      Z758TBW03_CRT_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z() ;
      Z759TBW03_CRT_PROG_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z() ;
      Z760TBW03_UPD_DATETIME = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z() ;
      Z761TBW03_UPD_USER_ID = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z() ;
      Z762TBW03_UPD_USER_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z() ;
      Z763TBW03_UPD_PROG_NM = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z() ;
      Z764TBW03_UPD_CNT = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z() ;
      n631TBW03_CRF_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N()==0)?false:true) ;
      n632TBW03_CRF_SNM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N()==0)?false:true) ;
      n633TBW03_CRF_ORDER = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N()==0)?false:true) ;
      n634TBW03_SITE_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N()==0)?false:true) ;
      n635TBW03_SITE_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N()==0)?false:true) ;
      n636TBW03_SITE_RYAK_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N()==0)?false:true) ;
      n637TBW03_OUTER_SUBJECT_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N()==0)?false:true) ;
      n638TBW03_CRF_LATEST_VERSION = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N()==0)?false:true) ;
      n639TBW03_CRF_INPUT_LEVEL = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N()==0)?false:true) ;
      n640TBW03_LOCK_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N()==0)?false:true) ;
      n641TBW03_LOCK_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N()==0)?false:true) ;
      n642TBW03_LOCK_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N()==0)?false:true) ;
      n643TBW03_LOCK_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N()==0)?false:true) ;
      n644TBW03_LOCK_AUTH_CD = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N()==0)?false:true) ;
      n645TBW03_UPLOAD_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N()==0)?false:true) ;
      n646TBW03_UPLOAD_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N()==0)?false:true) ;
      n647TBW03_UPLOAD_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N()==0)?false:true) ;
      n648TBW03_UPLOAD_AUTH_CD = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N()==0)?false:true) ;
      n649TBW03_DM_ARRIVAL_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N()==0)?false:true) ;
      n650TBW03_DM_ARRIVAL_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N()==0)?false:true) ;
      n651TBW03_APPROVAL_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N()==0)?false:true) ;
      n652TBW03_APPROVAL_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N()==0)?false:true) ;
      n653TBW03_APPROVAL_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N()==0)?false:true) ;
      n654TBW03_APPROVAL_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N()==0)?false:true) ;
      n655TBW03_APPROVAL_AUTH_CD = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N()==0)?false:true) ;
      n656TBW03_INPUT_END_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N()==0)?false:true) ;
      n657TBW03_INPUT_END_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N()==0)?false:true) ;
      n658TBW03_INPUT_END_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N()==0)?false:true) ;
      n659TBW03_INPUT_END_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N()==0)?false:true) ;
      n660TBW03_INPUT_END_AUTH_CD = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N()==0)?false:true) ;
      n755TBW03_DEL_FLG = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N()==0)?false:true) ;
      n756TBW03_CRT_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N()==0)?false:true) ;
      n757TBW03_CRT_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N()==0)?false:true) ;
      n758TBW03_CRT_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N()==0)?false:true) ;
      n759TBW03_CRT_PROG_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N()==0)?false:true) ;
      n760TBW03_UPD_DATETIME = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N()==0)?false:true) ;
      n761TBW03_UPD_USER_ID = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N()==0)?false:true) ;
      n762TBW03_UPD_USER_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N()==0)?false:true) ;
      n763TBW03_UPD_PROG_NM = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N()==0)?false:true) ;
      n764TBW03_UPD_CNT = (boolean)((obj41.getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj41.getgxTv_SdtTBW03_CRF_SEARCH_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A625TBW03_SESSION_ID = (String)getParm(obj,0) ;
      A626TBW03_APP_ID = (String)getParm(obj,1) ;
      A627TBW03_DISP_DATETIME = (String)getParm(obj,2) ;
      A628TBW03_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A629TBW03_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A630TBW03_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1641( ) ;
      scanKeyStart1641( ) ;
      if ( RcdFound41 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC001617 */
         pr_default.execute(15, new Object[] {new Long(A628TBW03_STUDY_ID), new Short(A630TBW03_CRF_ID)});
         if ( (pr_default.getStatus(15) == 101) )
         {
            AnyError628 = 1 ;
            AnyError630 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRF検索ワーク・CRFサブタイプ'", "ForeignKeyNotFound", 1, "TBW03_STUDY_ID");
            AnyError = (short)(1) ;
         }
         if ( ( AnyError628 == 0 ) && ( AnyError630 == 0 ) )
         {
            A631TBW03_CRF_NM = BC001617_A631TBW03_CRF_NM[0] ;
            n631TBW03_CRF_NM = BC001617_n631TBW03_CRF_NM[0] ;
            A632TBW03_CRF_SNM = BC001617_A632TBW03_CRF_SNM[0] ;
            n632TBW03_CRF_SNM = BC001617_n632TBW03_CRF_SNM[0] ;
            A633TBW03_CRF_ORDER = BC001617_A633TBW03_CRF_ORDER[0] ;
            n633TBW03_CRF_ORDER = BC001617_n633TBW03_CRF_ORDER[0] ;
         }
         pr_default.close(15);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z625TBW03_SESSION_ID = A625TBW03_SESSION_ID ;
         Z626TBW03_APP_ID = A626TBW03_APP_ID ;
         Z627TBW03_DISP_DATETIME = A627TBW03_DISP_DATETIME ;
         Z628TBW03_STUDY_ID = A628TBW03_STUDY_ID ;
         Z629TBW03_SUBJECT_ID = A629TBW03_SUBJECT_ID ;
         Z630TBW03_CRF_ID = A630TBW03_CRF_ID ;
      }
      zm1641( -8) ;
      sMode41 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1641( ) ;
      Gx_mode = sMode41 ;
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
      if ( RcdFound41 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A625TBW03_SESSION_ID, Z625TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A626TBW03_APP_ID, Z626TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A627TBW03_DISP_DATETIME, Z627TBW03_DISP_DATETIME) != 0 ) || ( A628TBW03_STUDY_ID != Z628TBW03_STUDY_ID ) || ( A629TBW03_SUBJECT_ID != Z629TBW03_SUBJECT_ID ) || ( A630TBW03_CRF_ID != Z630TBW03_CRF_ID ) )
         {
            A625TBW03_SESSION_ID = Z625TBW03_SESSION_ID ;
            A626TBW03_APP_ID = Z626TBW03_APP_ID ;
            A627TBW03_DISP_DATETIME = Z627TBW03_DISP_DATETIME ;
            A628TBW03_STUDY_ID = Z628TBW03_STUDY_ID ;
            A629TBW03_SUBJECT_ID = Z629TBW03_SUBJECT_ID ;
            A630TBW03_CRF_ID = Z630TBW03_CRF_ID ;
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
            if ( ( GXutil.strcmp(A625TBW03_SESSION_ID, Z625TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A626TBW03_APP_ID, Z626TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A627TBW03_DISP_DATETIME, Z627TBW03_DISP_DATETIME) != 0 ) || ( A628TBW03_STUDY_ID != Z628TBW03_STUDY_ID ) || ( A629TBW03_SUBJECT_ID != Z629TBW03_SUBJECT_ID ) || ( A630TBW03_CRF_ID != Z630TBW03_CRF_ID ) )
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
         else if ( ( GXutil.strcmp(A625TBW03_SESSION_ID, Z625TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A626TBW03_APP_ID, Z626TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A627TBW03_DISP_DATETIME, Z627TBW03_DISP_DATETIME) != 0 ) || ( A628TBW03_STUDY_ID != Z628TBW03_STUDY_ID ) || ( A629TBW03_SUBJECT_ID != Z629TBW03_SUBJECT_ID ) || ( A630TBW03_CRF_ID != Z630TBW03_CRF_ID ) )
         {
            A625TBW03_SESSION_ID = Z625TBW03_SESSION_ID ;
            A626TBW03_APP_ID = Z626TBW03_APP_ID ;
            A627TBW03_DISP_DATETIME = Z627TBW03_DISP_DATETIME ;
            A628TBW03_STUDY_ID = Z628TBW03_STUDY_ID ;
            A629TBW03_SUBJECT_ID = Z629TBW03_SUBJECT_ID ;
            A630TBW03_CRF_ID = Z630TBW03_CRF_ID ;
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
         if ( ( GXutil.strcmp(A625TBW03_SESSION_ID, Z625TBW03_SESSION_ID) != 0 ) || ( GXutil.strcmp(A626TBW03_APP_ID, Z626TBW03_APP_ID) != 0 ) || ( GXutil.strcmp(A627TBW03_DISP_DATETIME, Z627TBW03_DISP_DATETIME) != 0 ) || ( A628TBW03_STUDY_ID != Z628TBW03_STUDY_ID ) || ( A629TBW03_SUBJECT_ID != Z629TBW03_SUBJECT_ID ) || ( A630TBW03_CRF_ID != Z630TBW03_CRF_ID ) )
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
      pr_default.close(15);
      pr_default.close(16);
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(21);
      pr_default.close(22);
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
                  /* Execute user subroutine: S1132 */
                  S1132 ();
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
      Z625TBW03_SESSION_ID = "" ;
      A625TBW03_SESSION_ID = "" ;
      Z626TBW03_APP_ID = "" ;
      A626TBW03_APP_ID = "" ;
      Z627TBW03_DISP_DATETIME = "" ;
      A627TBW03_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z = "" ;
      Z637TBW03_OUTER_SUBJECT_ID = "" ;
      A637TBW03_OUTER_SUBJECT_ID = "" ;
      Z640TBW03_LOCK_FLG = "" ;
      A640TBW03_LOCK_FLG = "" ;
      Z641TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A641TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z644TBW03_LOCK_AUTH_CD = "" ;
      A644TBW03_LOCK_AUTH_CD = "" ;
      Z645TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A645TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z648TBW03_UPLOAD_AUTH_CD = "" ;
      A648TBW03_UPLOAD_AUTH_CD = "" ;
      Z649TBW03_DM_ARRIVAL_FLG = "" ;
      A649TBW03_DM_ARRIVAL_FLG = "" ;
      Z650TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A650TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z651TBW03_APPROVAL_FLG = "" ;
      A651TBW03_APPROVAL_FLG = "" ;
      Z652TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A652TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z655TBW03_APPROVAL_AUTH_CD = "" ;
      A655TBW03_APPROVAL_AUTH_CD = "" ;
      Z656TBW03_INPUT_END_FLG = "" ;
      A656TBW03_INPUT_END_FLG = "" ;
      Z657TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A657TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z660TBW03_INPUT_END_AUTH_CD = "" ;
      A660TBW03_INPUT_END_AUTH_CD = "" ;
      Z755TBW03_DEL_FLG = "" ;
      A755TBW03_DEL_FLG = "" ;
      Z756TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A756TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z759TBW03_CRT_PROG_NM = "" ;
      A759TBW03_CRT_PROG_NM = "" ;
      Z760TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A760TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z763TBW03_UPD_PROG_NM = "" ;
      A763TBW03_UPD_PROG_NM = "" ;
      Z634TBW03_SITE_ID = "" ;
      A634TBW03_SITE_ID = "" ;
      Z642TBW03_LOCK_USER_ID = "" ;
      A642TBW03_LOCK_USER_ID = "" ;
      Z646TBW03_UPLOAD_USER_ID = "" ;
      A646TBW03_UPLOAD_USER_ID = "" ;
      Z653TBW03_APPROVAL_USER_ID = "" ;
      A653TBW03_APPROVAL_USER_ID = "" ;
      Z658TBW03_INPUT_END_USER_ID = "" ;
      A658TBW03_INPUT_END_USER_ID = "" ;
      Z757TBW03_CRT_USER_ID = "" ;
      A757TBW03_CRT_USER_ID = "" ;
      Z761TBW03_UPD_USER_ID = "" ;
      A761TBW03_UPD_USER_ID = "" ;
      Z631TBW03_CRF_NM = "" ;
      A631TBW03_CRF_NM = "" ;
      Z632TBW03_CRF_SNM = "" ;
      A632TBW03_CRF_SNM = "" ;
      Z635TBW03_SITE_NM = "" ;
      A635TBW03_SITE_NM = "" ;
      Z636TBW03_SITE_RYAK_NM = "" ;
      A636TBW03_SITE_RYAK_NM = "" ;
      Z643TBW03_LOCK_USER_NM = "" ;
      A643TBW03_LOCK_USER_NM = "" ;
      Z647TBW03_UPLOAD_USER_NM = "" ;
      A647TBW03_UPLOAD_USER_NM = "" ;
      Z654TBW03_APPROVAL_USER_NM = "" ;
      A654TBW03_APPROVAL_USER_NM = "" ;
      Z659TBW03_INPUT_END_USER_NM = "" ;
      A659TBW03_INPUT_END_USER_NM = "" ;
      Z758TBW03_CRT_USER_NM = "" ;
      A758TBW03_CRT_USER_NM = "" ;
      Z762TBW03_UPD_USER_NM = "" ;
      A762TBW03_UPD_USER_NM = "" ;
      BC001612_A625TBW03_SESSION_ID = new String[] {""} ;
      BC001612_A626TBW03_APP_ID = new String[] {""} ;
      BC001612_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC001612_A629TBW03_SUBJECT_ID = new int[1] ;
      BC001612_A631TBW03_CRF_NM = new String[] {""} ;
      BC001612_n631TBW03_CRF_NM = new boolean[] {false} ;
      BC001612_A632TBW03_CRF_SNM = new String[] {""} ;
      BC001612_n632TBW03_CRF_SNM = new boolean[] {false} ;
      BC001612_A633TBW03_CRF_ORDER = new int[1] ;
      BC001612_n633TBW03_CRF_ORDER = new boolean[] {false} ;
      BC001612_A635TBW03_SITE_NM = new String[] {""} ;
      BC001612_n635TBW03_SITE_NM = new boolean[] {false} ;
      BC001612_A636TBW03_SITE_RYAK_NM = new String[] {""} ;
      BC001612_n636TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      BC001612_A637TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      BC001612_n637TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC001612_A638TBW03_CRF_LATEST_VERSION = new short[1] ;
      BC001612_n638TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC001612_A639TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      BC001612_n639TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC001612_A640TBW03_LOCK_FLG = new String[] {""} ;
      BC001612_n640TBW03_LOCK_FLG = new boolean[] {false} ;
      BC001612_A641TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n641TBW03_LOCK_DATETIME = new boolean[] {false} ;
      BC001612_A643TBW03_LOCK_USER_NM = new String[] {""} ;
      BC001612_n643TBW03_LOCK_USER_NM = new boolean[] {false} ;
      BC001612_A644TBW03_LOCK_AUTH_CD = new String[] {""} ;
      BC001612_n644TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      BC001612_A645TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n645TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      BC001612_A647TBW03_UPLOAD_USER_NM = new String[] {""} ;
      BC001612_n647TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      BC001612_A648TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      BC001612_n648TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC001612_A649TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      BC001612_n649TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC001612_A650TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n650TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC001612_A651TBW03_APPROVAL_FLG = new String[] {""} ;
      BC001612_n651TBW03_APPROVAL_FLG = new boolean[] {false} ;
      BC001612_A652TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n652TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      BC001612_A654TBW03_APPROVAL_USER_NM = new String[] {""} ;
      BC001612_n654TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      BC001612_A655TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      BC001612_n655TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC001612_A656TBW03_INPUT_END_FLG = new String[] {""} ;
      BC001612_n656TBW03_INPUT_END_FLG = new boolean[] {false} ;
      BC001612_A657TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n657TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      BC001612_A659TBW03_INPUT_END_USER_NM = new String[] {""} ;
      BC001612_n659TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      BC001612_A660TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      BC001612_n660TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC001612_A755TBW03_DEL_FLG = new String[] {""} ;
      BC001612_n755TBW03_DEL_FLG = new boolean[] {false} ;
      BC001612_A756TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n756TBW03_CRT_DATETIME = new boolean[] {false} ;
      BC001612_A758TBW03_CRT_USER_NM = new String[] {""} ;
      BC001612_n758TBW03_CRT_USER_NM = new boolean[] {false} ;
      BC001612_A759TBW03_CRT_PROG_NM = new String[] {""} ;
      BC001612_n759TBW03_CRT_PROG_NM = new boolean[] {false} ;
      BC001612_A760TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001612_n760TBW03_UPD_DATETIME = new boolean[] {false} ;
      BC001612_A762TBW03_UPD_USER_NM = new String[] {""} ;
      BC001612_n762TBW03_UPD_USER_NM = new boolean[] {false} ;
      BC001612_A763TBW03_UPD_PROG_NM = new String[] {""} ;
      BC001612_n763TBW03_UPD_PROG_NM = new boolean[] {false} ;
      BC001612_A764TBW03_UPD_CNT = new long[1] ;
      BC001612_n764TBW03_UPD_CNT = new boolean[] {false} ;
      BC001612_A628TBW03_STUDY_ID = new long[1] ;
      BC001612_A630TBW03_CRF_ID = new short[1] ;
      BC001612_A634TBW03_SITE_ID = new String[] {""} ;
      BC001612_n634TBW03_SITE_ID = new boolean[] {false} ;
      BC001612_A642TBW03_LOCK_USER_ID = new String[] {""} ;
      BC001612_n642TBW03_LOCK_USER_ID = new boolean[] {false} ;
      BC001612_A646TBW03_UPLOAD_USER_ID = new String[] {""} ;
      BC001612_n646TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      BC001612_A653TBW03_APPROVAL_USER_ID = new String[] {""} ;
      BC001612_n653TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      BC001612_A658TBW03_INPUT_END_USER_ID = new String[] {""} ;
      BC001612_n658TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      BC001612_A757TBW03_CRT_USER_ID = new String[] {""} ;
      BC001612_n757TBW03_CRT_USER_ID = new boolean[] {false} ;
      BC001612_A761TBW03_UPD_USER_ID = new String[] {""} ;
      BC001612_n761TBW03_UPD_USER_ID = new boolean[] {false} ;
      BC00164_A631TBW03_CRF_NM = new String[] {""} ;
      BC00164_n631TBW03_CRF_NM = new boolean[] {false} ;
      BC00164_A632TBW03_CRF_SNM = new String[] {""} ;
      BC00164_n632TBW03_CRF_SNM = new boolean[] {false} ;
      BC00164_A633TBW03_CRF_ORDER = new int[1] ;
      BC00164_n633TBW03_CRF_ORDER = new boolean[] {false} ;
      BC00165_A635TBW03_SITE_NM = new String[] {""} ;
      BC00165_n635TBW03_SITE_NM = new boolean[] {false} ;
      BC00165_A636TBW03_SITE_RYAK_NM = new String[] {""} ;
      BC00165_n636TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      BC00166_A643TBW03_LOCK_USER_NM = new String[] {""} ;
      BC00166_n643TBW03_LOCK_USER_NM = new boolean[] {false} ;
      BC00167_A647TBW03_UPLOAD_USER_NM = new String[] {""} ;
      BC00167_n647TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      BC00168_A654TBW03_APPROVAL_USER_NM = new String[] {""} ;
      BC00168_n654TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      BC00169_A659TBW03_INPUT_END_USER_NM = new String[] {""} ;
      BC00169_n659TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      BC001610_A758TBW03_CRT_USER_NM = new String[] {""} ;
      BC001610_n758TBW03_CRT_USER_NM = new boolean[] {false} ;
      BC001611_A762TBW03_UPD_USER_NM = new String[] {""} ;
      BC001611_n762TBW03_UPD_USER_NM = new boolean[] {false} ;
      BC001613_A625TBW03_SESSION_ID = new String[] {""} ;
      BC001613_A626TBW03_APP_ID = new String[] {""} ;
      BC001613_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC001613_A628TBW03_STUDY_ID = new long[1] ;
      BC001613_A629TBW03_SUBJECT_ID = new int[1] ;
      BC001613_A630TBW03_CRF_ID = new short[1] ;
      BC00163_A625TBW03_SESSION_ID = new String[] {""} ;
      BC00163_A626TBW03_APP_ID = new String[] {""} ;
      BC00163_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC00163_A629TBW03_SUBJECT_ID = new int[1] ;
      BC00163_A637TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      BC00163_n637TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC00163_A638TBW03_CRF_LATEST_VERSION = new short[1] ;
      BC00163_n638TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00163_A639TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      BC00163_n639TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00163_A640TBW03_LOCK_FLG = new String[] {""} ;
      BC00163_n640TBW03_LOCK_FLG = new boolean[] {false} ;
      BC00163_A641TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n641TBW03_LOCK_DATETIME = new boolean[] {false} ;
      BC00163_A644TBW03_LOCK_AUTH_CD = new String[] {""} ;
      BC00163_n644TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00163_A645TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n645TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00163_A648TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00163_n648TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00163_A649TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00163_n649TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00163_A650TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n650TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00163_A651TBW03_APPROVAL_FLG = new String[] {""} ;
      BC00163_n651TBW03_APPROVAL_FLG = new boolean[] {false} ;
      BC00163_A652TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n652TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00163_A655TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00163_n655TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00163_A656TBW03_INPUT_END_FLG = new String[] {""} ;
      BC00163_n656TBW03_INPUT_END_FLG = new boolean[] {false} ;
      BC00163_A657TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n657TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00163_A660TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00163_n660TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00163_A755TBW03_DEL_FLG = new String[] {""} ;
      BC00163_n755TBW03_DEL_FLG = new boolean[] {false} ;
      BC00163_A756TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n756TBW03_CRT_DATETIME = new boolean[] {false} ;
      BC00163_A759TBW03_CRT_PROG_NM = new String[] {""} ;
      BC00163_n759TBW03_CRT_PROG_NM = new boolean[] {false} ;
      BC00163_A760TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00163_n760TBW03_UPD_DATETIME = new boolean[] {false} ;
      BC00163_A763TBW03_UPD_PROG_NM = new String[] {""} ;
      BC00163_n763TBW03_UPD_PROG_NM = new boolean[] {false} ;
      BC00163_A764TBW03_UPD_CNT = new long[1] ;
      BC00163_n764TBW03_UPD_CNT = new boolean[] {false} ;
      BC00163_A628TBW03_STUDY_ID = new long[1] ;
      BC00163_A630TBW03_CRF_ID = new short[1] ;
      BC00163_A634TBW03_SITE_ID = new String[] {""} ;
      BC00163_n634TBW03_SITE_ID = new boolean[] {false} ;
      BC00163_A642TBW03_LOCK_USER_ID = new String[] {""} ;
      BC00163_n642TBW03_LOCK_USER_ID = new boolean[] {false} ;
      BC00163_A646TBW03_UPLOAD_USER_ID = new String[] {""} ;
      BC00163_n646TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00163_A653TBW03_APPROVAL_USER_ID = new String[] {""} ;
      BC00163_n653TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00163_A658TBW03_INPUT_END_USER_ID = new String[] {""} ;
      BC00163_n658TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00163_A757TBW03_CRT_USER_ID = new String[] {""} ;
      BC00163_n757TBW03_CRT_USER_ID = new boolean[] {false} ;
      BC00163_A761TBW03_UPD_USER_ID = new String[] {""} ;
      BC00163_n761TBW03_UPD_USER_ID = new boolean[] {false} ;
      sMode41 = "" ;
      BC00162_A625TBW03_SESSION_ID = new String[] {""} ;
      BC00162_A626TBW03_APP_ID = new String[] {""} ;
      BC00162_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC00162_A629TBW03_SUBJECT_ID = new int[1] ;
      BC00162_A637TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      BC00162_n637TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC00162_A638TBW03_CRF_LATEST_VERSION = new short[1] ;
      BC00162_n638TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00162_A639TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      BC00162_n639TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00162_A640TBW03_LOCK_FLG = new String[] {""} ;
      BC00162_n640TBW03_LOCK_FLG = new boolean[] {false} ;
      BC00162_A641TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n641TBW03_LOCK_DATETIME = new boolean[] {false} ;
      BC00162_A644TBW03_LOCK_AUTH_CD = new String[] {""} ;
      BC00162_n644TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00162_A645TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n645TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00162_A648TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00162_n648TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00162_A649TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00162_n649TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00162_A650TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n650TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00162_A651TBW03_APPROVAL_FLG = new String[] {""} ;
      BC00162_n651TBW03_APPROVAL_FLG = new boolean[] {false} ;
      BC00162_A652TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n652TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00162_A655TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00162_n655TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00162_A656TBW03_INPUT_END_FLG = new String[] {""} ;
      BC00162_n656TBW03_INPUT_END_FLG = new boolean[] {false} ;
      BC00162_A657TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n657TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00162_A660TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00162_n660TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00162_A755TBW03_DEL_FLG = new String[] {""} ;
      BC00162_n755TBW03_DEL_FLG = new boolean[] {false} ;
      BC00162_A756TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n756TBW03_CRT_DATETIME = new boolean[] {false} ;
      BC00162_A759TBW03_CRT_PROG_NM = new String[] {""} ;
      BC00162_n759TBW03_CRT_PROG_NM = new boolean[] {false} ;
      BC00162_A760TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00162_n760TBW03_UPD_DATETIME = new boolean[] {false} ;
      BC00162_A763TBW03_UPD_PROG_NM = new String[] {""} ;
      BC00162_n763TBW03_UPD_PROG_NM = new boolean[] {false} ;
      BC00162_A764TBW03_UPD_CNT = new long[1] ;
      BC00162_n764TBW03_UPD_CNT = new boolean[] {false} ;
      BC00162_A628TBW03_STUDY_ID = new long[1] ;
      BC00162_A630TBW03_CRF_ID = new short[1] ;
      BC00162_A634TBW03_SITE_ID = new String[] {""} ;
      BC00162_n634TBW03_SITE_ID = new boolean[] {false} ;
      BC00162_A642TBW03_LOCK_USER_ID = new String[] {""} ;
      BC00162_n642TBW03_LOCK_USER_ID = new boolean[] {false} ;
      BC00162_A646TBW03_UPLOAD_USER_ID = new String[] {""} ;
      BC00162_n646TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00162_A653TBW03_APPROVAL_USER_ID = new String[] {""} ;
      BC00162_n653TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00162_A658TBW03_INPUT_END_USER_ID = new String[] {""} ;
      BC00162_n658TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00162_A757TBW03_CRT_USER_ID = new String[] {""} ;
      BC00162_n757TBW03_CRT_USER_ID = new boolean[] {false} ;
      BC00162_A761TBW03_UPD_USER_ID = new String[] {""} ;
      BC00162_n761TBW03_UPD_USER_ID = new boolean[] {false} ;
      BC001617_A631TBW03_CRF_NM = new String[] {""} ;
      BC001617_n631TBW03_CRF_NM = new boolean[] {false} ;
      BC001617_A632TBW03_CRF_SNM = new String[] {""} ;
      BC001617_n632TBW03_CRF_SNM = new boolean[] {false} ;
      BC001617_A633TBW03_CRF_ORDER = new int[1] ;
      BC001617_n633TBW03_CRF_ORDER = new boolean[] {false} ;
      BC001618_A635TBW03_SITE_NM = new String[] {""} ;
      BC001618_n635TBW03_SITE_NM = new boolean[] {false} ;
      BC001618_A636TBW03_SITE_RYAK_NM = new String[] {""} ;
      BC001618_n636TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      BC001619_A643TBW03_LOCK_USER_NM = new String[] {""} ;
      BC001619_n643TBW03_LOCK_USER_NM = new boolean[] {false} ;
      BC001620_A647TBW03_UPLOAD_USER_NM = new String[] {""} ;
      BC001620_n647TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      BC001621_A654TBW03_APPROVAL_USER_NM = new String[] {""} ;
      BC001621_n654TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      BC001622_A659TBW03_INPUT_END_USER_NM = new String[] {""} ;
      BC001622_n659TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      BC001623_A758TBW03_CRT_USER_NM = new String[] {""} ;
      BC001623_n758TBW03_CRT_USER_NM = new boolean[] {false} ;
      BC001624_A762TBW03_UPD_USER_NM = new String[] {""} ;
      BC001624_n762TBW03_UPD_USER_NM = new boolean[] {false} ;
      BC001625_A625TBW03_SESSION_ID = new String[] {""} ;
      BC001625_A626TBW03_APP_ID = new String[] {""} ;
      BC001625_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC001625_A629TBW03_SUBJECT_ID = new int[1] ;
      BC001625_A631TBW03_CRF_NM = new String[] {""} ;
      BC001625_n631TBW03_CRF_NM = new boolean[] {false} ;
      BC001625_A632TBW03_CRF_SNM = new String[] {""} ;
      BC001625_n632TBW03_CRF_SNM = new boolean[] {false} ;
      BC001625_A633TBW03_CRF_ORDER = new int[1] ;
      BC001625_n633TBW03_CRF_ORDER = new boolean[] {false} ;
      BC001625_A635TBW03_SITE_NM = new String[] {""} ;
      BC001625_n635TBW03_SITE_NM = new boolean[] {false} ;
      BC001625_A636TBW03_SITE_RYAK_NM = new String[] {""} ;
      BC001625_n636TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      BC001625_A637TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      BC001625_n637TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      BC001625_A638TBW03_CRF_LATEST_VERSION = new short[1] ;
      BC001625_n638TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC001625_A639TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      BC001625_n639TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC001625_A640TBW03_LOCK_FLG = new String[] {""} ;
      BC001625_n640TBW03_LOCK_FLG = new boolean[] {false} ;
      BC001625_A641TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001625_n641TBW03_LOCK_DATETIME = new boolean[] {false} ;
      BC001625_A643TBW03_LOCK_USER_NM = new String[] {""} ;
      BC001625_n643TBW03_LOCK_USER_NM = new boolean[] {false} ;
      BC001625_A644TBW03_LOCK_AUTH_CD = new String[] {""} ;
      BC001625_n644TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      BC001625_A645TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001625_n645TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      BC001625_A647TBW03_UPLOAD_USER_NM = new String[] {""} ;
      BC001625_n647TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      BC001625_A648TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      BC001625_n648TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC001625_A649TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      BC001625_n649TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC001625_A650TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001625_n650TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC001625_A651TBW03_APPROVAL_FLG = new String[] {""} ;
      BC001625_n651TBW03_APPROVAL_FLG = new boolean[] {false} ;
      BC001625_A652TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001625_n652TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      BC001625_A654TBW03_APPROVAL_USER_NM = new String[] {""} ;
      BC001625_n654TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      BC001625_A655TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      BC001625_n655TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC001625_A656TBW03_INPUT_END_FLG = new String[] {""} ;
      BC001625_n656TBW03_INPUT_END_FLG = new boolean[] {false} ;
      BC001625_A657TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001625_n657TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      BC001625_A659TBW03_INPUT_END_USER_NM = new String[] {""} ;
      BC001625_n659TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      BC001625_A660TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      BC001625_n660TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC001625_A755TBW03_DEL_FLG = new String[] {""} ;
      BC001625_n755TBW03_DEL_FLG = new boolean[] {false} ;
      BC001625_A756TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001625_n756TBW03_CRT_DATETIME = new boolean[] {false} ;
      BC001625_A758TBW03_CRT_USER_NM = new String[] {""} ;
      BC001625_n758TBW03_CRT_USER_NM = new boolean[] {false} ;
      BC001625_A759TBW03_CRT_PROG_NM = new String[] {""} ;
      BC001625_n759TBW03_CRT_PROG_NM = new boolean[] {false} ;
      BC001625_A760TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001625_n760TBW03_UPD_DATETIME = new boolean[] {false} ;
      BC001625_A762TBW03_UPD_USER_NM = new String[] {""} ;
      BC001625_n762TBW03_UPD_USER_NM = new boolean[] {false} ;
      BC001625_A763TBW03_UPD_PROG_NM = new String[] {""} ;
      BC001625_n763TBW03_UPD_PROG_NM = new boolean[] {false} ;
      BC001625_A764TBW03_UPD_CNT = new long[1] ;
      BC001625_n764TBW03_UPD_CNT = new boolean[] {false} ;
      BC001625_A628TBW03_STUDY_ID = new long[1] ;
      BC001625_A630TBW03_CRF_ID = new short[1] ;
      BC001625_A634TBW03_SITE_ID = new String[] {""} ;
      BC001625_n634TBW03_SITE_ID = new boolean[] {false} ;
      BC001625_A642TBW03_LOCK_USER_ID = new String[] {""} ;
      BC001625_n642TBW03_LOCK_USER_ID = new boolean[] {false} ;
      BC001625_A646TBW03_UPLOAD_USER_ID = new String[] {""} ;
      BC001625_n646TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      BC001625_A653TBW03_APPROVAL_USER_ID = new String[] {""} ;
      BC001625_n653TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      BC001625_A658TBW03_INPUT_END_USER_ID = new String[] {""} ;
      BC001625_n658TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      BC001625_A757TBW03_CRT_USER_ID = new String[] {""} ;
      BC001625_n757TBW03_CRT_USER_ID = new boolean[] {false} ;
      BC001625_A761TBW03_UPD_USER_ID = new String[] {""} ;
      BC001625_n761TBW03_UPD_USER_ID = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw03_crf_search_bc__default(),
         new Object[] {
             new Object[] {
            BC00162_A625TBW03_SESSION_ID, BC00162_A626TBW03_APP_ID, BC00162_A627TBW03_DISP_DATETIME, BC00162_A629TBW03_SUBJECT_ID, BC00162_A637TBW03_OUTER_SUBJECT_ID, BC00162_n637TBW03_OUTER_SUBJECT_ID, BC00162_A638TBW03_CRF_LATEST_VERSION, BC00162_n638TBW03_CRF_LATEST_VERSION, BC00162_A639TBW03_CRF_INPUT_LEVEL, BC00162_n639TBW03_CRF_INPUT_LEVEL,
            BC00162_A640TBW03_LOCK_FLG, BC00162_n640TBW03_LOCK_FLG, BC00162_A641TBW03_LOCK_DATETIME, BC00162_n641TBW03_LOCK_DATETIME, BC00162_A644TBW03_LOCK_AUTH_CD, BC00162_n644TBW03_LOCK_AUTH_CD, BC00162_A645TBW03_UPLOAD_DATETIME, BC00162_n645TBW03_UPLOAD_DATETIME, BC00162_A648TBW03_UPLOAD_AUTH_CD, BC00162_n648TBW03_UPLOAD_AUTH_CD,
            BC00162_A649TBW03_DM_ARRIVAL_FLG, BC00162_n649TBW03_DM_ARRIVAL_FLG, BC00162_A650TBW03_DM_ARRIVAL_DATETIME, BC00162_n650TBW03_DM_ARRIVAL_DATETIME, BC00162_A651TBW03_APPROVAL_FLG, BC00162_n651TBW03_APPROVAL_FLG, BC00162_A652TBW03_APPROVAL_DATETIME, BC00162_n652TBW03_APPROVAL_DATETIME, BC00162_A655TBW03_APPROVAL_AUTH_CD, BC00162_n655TBW03_APPROVAL_AUTH_CD,
            BC00162_A656TBW03_INPUT_END_FLG, BC00162_n656TBW03_INPUT_END_FLG, BC00162_A657TBW03_INPUT_END_DATETIME, BC00162_n657TBW03_INPUT_END_DATETIME, BC00162_A660TBW03_INPUT_END_AUTH_CD, BC00162_n660TBW03_INPUT_END_AUTH_CD, BC00162_A755TBW03_DEL_FLG, BC00162_n755TBW03_DEL_FLG, BC00162_A756TBW03_CRT_DATETIME, BC00162_n756TBW03_CRT_DATETIME,
            BC00162_A759TBW03_CRT_PROG_NM, BC00162_n759TBW03_CRT_PROG_NM, BC00162_A760TBW03_UPD_DATETIME, BC00162_n760TBW03_UPD_DATETIME, BC00162_A763TBW03_UPD_PROG_NM, BC00162_n763TBW03_UPD_PROG_NM, BC00162_A764TBW03_UPD_CNT, BC00162_n764TBW03_UPD_CNT, BC00162_A628TBW03_STUDY_ID, BC00162_A630TBW03_CRF_ID,
            BC00162_A634TBW03_SITE_ID, BC00162_n634TBW03_SITE_ID, BC00162_A642TBW03_LOCK_USER_ID, BC00162_n642TBW03_LOCK_USER_ID, BC00162_A646TBW03_UPLOAD_USER_ID, BC00162_n646TBW03_UPLOAD_USER_ID, BC00162_A653TBW03_APPROVAL_USER_ID, BC00162_n653TBW03_APPROVAL_USER_ID, BC00162_A658TBW03_INPUT_END_USER_ID, BC00162_n658TBW03_INPUT_END_USER_ID,
            BC00162_A757TBW03_CRT_USER_ID, BC00162_n757TBW03_CRT_USER_ID, BC00162_A761TBW03_UPD_USER_ID, BC00162_n761TBW03_UPD_USER_ID
            }
            , new Object[] {
            BC00163_A625TBW03_SESSION_ID, BC00163_A626TBW03_APP_ID, BC00163_A627TBW03_DISP_DATETIME, BC00163_A629TBW03_SUBJECT_ID, BC00163_A637TBW03_OUTER_SUBJECT_ID, BC00163_n637TBW03_OUTER_SUBJECT_ID, BC00163_A638TBW03_CRF_LATEST_VERSION, BC00163_n638TBW03_CRF_LATEST_VERSION, BC00163_A639TBW03_CRF_INPUT_LEVEL, BC00163_n639TBW03_CRF_INPUT_LEVEL,
            BC00163_A640TBW03_LOCK_FLG, BC00163_n640TBW03_LOCK_FLG, BC00163_A641TBW03_LOCK_DATETIME, BC00163_n641TBW03_LOCK_DATETIME, BC00163_A644TBW03_LOCK_AUTH_CD, BC00163_n644TBW03_LOCK_AUTH_CD, BC00163_A645TBW03_UPLOAD_DATETIME, BC00163_n645TBW03_UPLOAD_DATETIME, BC00163_A648TBW03_UPLOAD_AUTH_CD, BC00163_n648TBW03_UPLOAD_AUTH_CD,
            BC00163_A649TBW03_DM_ARRIVAL_FLG, BC00163_n649TBW03_DM_ARRIVAL_FLG, BC00163_A650TBW03_DM_ARRIVAL_DATETIME, BC00163_n650TBW03_DM_ARRIVAL_DATETIME, BC00163_A651TBW03_APPROVAL_FLG, BC00163_n651TBW03_APPROVAL_FLG, BC00163_A652TBW03_APPROVAL_DATETIME, BC00163_n652TBW03_APPROVAL_DATETIME, BC00163_A655TBW03_APPROVAL_AUTH_CD, BC00163_n655TBW03_APPROVAL_AUTH_CD,
            BC00163_A656TBW03_INPUT_END_FLG, BC00163_n656TBW03_INPUT_END_FLG, BC00163_A657TBW03_INPUT_END_DATETIME, BC00163_n657TBW03_INPUT_END_DATETIME, BC00163_A660TBW03_INPUT_END_AUTH_CD, BC00163_n660TBW03_INPUT_END_AUTH_CD, BC00163_A755TBW03_DEL_FLG, BC00163_n755TBW03_DEL_FLG, BC00163_A756TBW03_CRT_DATETIME, BC00163_n756TBW03_CRT_DATETIME,
            BC00163_A759TBW03_CRT_PROG_NM, BC00163_n759TBW03_CRT_PROG_NM, BC00163_A760TBW03_UPD_DATETIME, BC00163_n760TBW03_UPD_DATETIME, BC00163_A763TBW03_UPD_PROG_NM, BC00163_n763TBW03_UPD_PROG_NM, BC00163_A764TBW03_UPD_CNT, BC00163_n764TBW03_UPD_CNT, BC00163_A628TBW03_STUDY_ID, BC00163_A630TBW03_CRF_ID,
            BC00163_A634TBW03_SITE_ID, BC00163_n634TBW03_SITE_ID, BC00163_A642TBW03_LOCK_USER_ID, BC00163_n642TBW03_LOCK_USER_ID, BC00163_A646TBW03_UPLOAD_USER_ID, BC00163_n646TBW03_UPLOAD_USER_ID, BC00163_A653TBW03_APPROVAL_USER_ID, BC00163_n653TBW03_APPROVAL_USER_ID, BC00163_A658TBW03_INPUT_END_USER_ID, BC00163_n658TBW03_INPUT_END_USER_ID,
            BC00163_A757TBW03_CRT_USER_ID, BC00163_n757TBW03_CRT_USER_ID, BC00163_A761TBW03_UPD_USER_ID, BC00163_n761TBW03_UPD_USER_ID
            }
            , new Object[] {
            BC00164_A631TBW03_CRF_NM, BC00164_n631TBW03_CRF_NM, BC00164_A632TBW03_CRF_SNM, BC00164_n632TBW03_CRF_SNM, BC00164_A633TBW03_CRF_ORDER, BC00164_n633TBW03_CRF_ORDER
            }
            , new Object[] {
            BC00165_A635TBW03_SITE_NM, BC00165_n635TBW03_SITE_NM, BC00165_A636TBW03_SITE_RYAK_NM, BC00165_n636TBW03_SITE_RYAK_NM
            }
            , new Object[] {
            BC00166_A643TBW03_LOCK_USER_NM, BC00166_n643TBW03_LOCK_USER_NM
            }
            , new Object[] {
            BC00167_A647TBW03_UPLOAD_USER_NM, BC00167_n647TBW03_UPLOAD_USER_NM
            }
            , new Object[] {
            BC00168_A654TBW03_APPROVAL_USER_NM, BC00168_n654TBW03_APPROVAL_USER_NM
            }
            , new Object[] {
            BC00169_A659TBW03_INPUT_END_USER_NM, BC00169_n659TBW03_INPUT_END_USER_NM
            }
            , new Object[] {
            BC001610_A758TBW03_CRT_USER_NM, BC001610_n758TBW03_CRT_USER_NM
            }
            , new Object[] {
            BC001611_A762TBW03_UPD_USER_NM, BC001611_n762TBW03_UPD_USER_NM
            }
            , new Object[] {
            BC001612_A625TBW03_SESSION_ID, BC001612_A626TBW03_APP_ID, BC001612_A627TBW03_DISP_DATETIME, BC001612_A629TBW03_SUBJECT_ID, BC001612_A631TBW03_CRF_NM, BC001612_n631TBW03_CRF_NM, BC001612_A632TBW03_CRF_SNM, BC001612_n632TBW03_CRF_SNM, BC001612_A633TBW03_CRF_ORDER, BC001612_n633TBW03_CRF_ORDER,
            BC001612_A635TBW03_SITE_NM, BC001612_n635TBW03_SITE_NM, BC001612_A636TBW03_SITE_RYAK_NM, BC001612_n636TBW03_SITE_RYAK_NM, BC001612_A637TBW03_OUTER_SUBJECT_ID, BC001612_n637TBW03_OUTER_SUBJECT_ID, BC001612_A638TBW03_CRF_LATEST_VERSION, BC001612_n638TBW03_CRF_LATEST_VERSION, BC001612_A639TBW03_CRF_INPUT_LEVEL, BC001612_n639TBW03_CRF_INPUT_LEVEL,
            BC001612_A640TBW03_LOCK_FLG, BC001612_n640TBW03_LOCK_FLG, BC001612_A641TBW03_LOCK_DATETIME, BC001612_n641TBW03_LOCK_DATETIME, BC001612_A643TBW03_LOCK_USER_NM, BC001612_n643TBW03_LOCK_USER_NM, BC001612_A644TBW03_LOCK_AUTH_CD, BC001612_n644TBW03_LOCK_AUTH_CD, BC001612_A645TBW03_UPLOAD_DATETIME, BC001612_n645TBW03_UPLOAD_DATETIME,
            BC001612_A647TBW03_UPLOAD_USER_NM, BC001612_n647TBW03_UPLOAD_USER_NM, BC001612_A648TBW03_UPLOAD_AUTH_CD, BC001612_n648TBW03_UPLOAD_AUTH_CD, BC001612_A649TBW03_DM_ARRIVAL_FLG, BC001612_n649TBW03_DM_ARRIVAL_FLG, BC001612_A650TBW03_DM_ARRIVAL_DATETIME, BC001612_n650TBW03_DM_ARRIVAL_DATETIME, BC001612_A651TBW03_APPROVAL_FLG, BC001612_n651TBW03_APPROVAL_FLG,
            BC001612_A652TBW03_APPROVAL_DATETIME, BC001612_n652TBW03_APPROVAL_DATETIME, BC001612_A654TBW03_APPROVAL_USER_NM, BC001612_n654TBW03_APPROVAL_USER_NM, BC001612_A655TBW03_APPROVAL_AUTH_CD, BC001612_n655TBW03_APPROVAL_AUTH_CD, BC001612_A656TBW03_INPUT_END_FLG, BC001612_n656TBW03_INPUT_END_FLG, BC001612_A657TBW03_INPUT_END_DATETIME, BC001612_n657TBW03_INPUT_END_DATETIME,
            BC001612_A659TBW03_INPUT_END_USER_NM, BC001612_n659TBW03_INPUT_END_USER_NM, BC001612_A660TBW03_INPUT_END_AUTH_CD, BC001612_n660TBW03_INPUT_END_AUTH_CD, BC001612_A755TBW03_DEL_FLG, BC001612_n755TBW03_DEL_FLG, BC001612_A756TBW03_CRT_DATETIME, BC001612_n756TBW03_CRT_DATETIME, BC001612_A758TBW03_CRT_USER_NM, BC001612_n758TBW03_CRT_USER_NM,
            BC001612_A759TBW03_CRT_PROG_NM, BC001612_n759TBW03_CRT_PROG_NM, BC001612_A760TBW03_UPD_DATETIME, BC001612_n760TBW03_UPD_DATETIME, BC001612_A762TBW03_UPD_USER_NM, BC001612_n762TBW03_UPD_USER_NM, BC001612_A763TBW03_UPD_PROG_NM, BC001612_n763TBW03_UPD_PROG_NM, BC001612_A764TBW03_UPD_CNT, BC001612_n764TBW03_UPD_CNT,
            BC001612_A628TBW03_STUDY_ID, BC001612_A630TBW03_CRF_ID, BC001612_A634TBW03_SITE_ID, BC001612_n634TBW03_SITE_ID, BC001612_A642TBW03_LOCK_USER_ID, BC001612_n642TBW03_LOCK_USER_ID, BC001612_A646TBW03_UPLOAD_USER_ID, BC001612_n646TBW03_UPLOAD_USER_ID, BC001612_A653TBW03_APPROVAL_USER_ID, BC001612_n653TBW03_APPROVAL_USER_ID,
            BC001612_A658TBW03_INPUT_END_USER_ID, BC001612_n658TBW03_INPUT_END_USER_ID, BC001612_A757TBW03_CRT_USER_ID, BC001612_n757TBW03_CRT_USER_ID, BC001612_A761TBW03_UPD_USER_ID, BC001612_n761TBW03_UPD_USER_ID
            }
            , new Object[] {
            BC001613_A625TBW03_SESSION_ID, BC001613_A626TBW03_APP_ID, BC001613_A627TBW03_DISP_DATETIME, BC001613_A628TBW03_STUDY_ID, BC001613_A629TBW03_SUBJECT_ID, BC001613_A630TBW03_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001617_A631TBW03_CRF_NM, BC001617_n631TBW03_CRF_NM, BC001617_A632TBW03_CRF_SNM, BC001617_n632TBW03_CRF_SNM, BC001617_A633TBW03_CRF_ORDER, BC001617_n633TBW03_CRF_ORDER
            }
            , new Object[] {
            BC001618_A635TBW03_SITE_NM, BC001618_n635TBW03_SITE_NM, BC001618_A636TBW03_SITE_RYAK_NM, BC001618_n636TBW03_SITE_RYAK_NM
            }
            , new Object[] {
            BC001619_A643TBW03_LOCK_USER_NM, BC001619_n643TBW03_LOCK_USER_NM
            }
            , new Object[] {
            BC001620_A647TBW03_UPLOAD_USER_NM, BC001620_n647TBW03_UPLOAD_USER_NM
            }
            , new Object[] {
            BC001621_A654TBW03_APPROVAL_USER_NM, BC001621_n654TBW03_APPROVAL_USER_NM
            }
            , new Object[] {
            BC001622_A659TBW03_INPUT_END_USER_NM, BC001622_n659TBW03_INPUT_END_USER_NM
            }
            , new Object[] {
            BC001623_A758TBW03_CRT_USER_NM, BC001623_n758TBW03_CRT_USER_NM
            }
            , new Object[] {
            BC001624_A762TBW03_UPD_USER_NM, BC001624_n762TBW03_UPD_USER_NM
            }
            , new Object[] {
            BC001625_A625TBW03_SESSION_ID, BC001625_A626TBW03_APP_ID, BC001625_A627TBW03_DISP_DATETIME, BC001625_A629TBW03_SUBJECT_ID, BC001625_A631TBW03_CRF_NM, BC001625_n631TBW03_CRF_NM, BC001625_A632TBW03_CRF_SNM, BC001625_n632TBW03_CRF_SNM, BC001625_A633TBW03_CRF_ORDER, BC001625_n633TBW03_CRF_ORDER,
            BC001625_A635TBW03_SITE_NM, BC001625_n635TBW03_SITE_NM, BC001625_A636TBW03_SITE_RYAK_NM, BC001625_n636TBW03_SITE_RYAK_NM, BC001625_A637TBW03_OUTER_SUBJECT_ID, BC001625_n637TBW03_OUTER_SUBJECT_ID, BC001625_A638TBW03_CRF_LATEST_VERSION, BC001625_n638TBW03_CRF_LATEST_VERSION, BC001625_A639TBW03_CRF_INPUT_LEVEL, BC001625_n639TBW03_CRF_INPUT_LEVEL,
            BC001625_A640TBW03_LOCK_FLG, BC001625_n640TBW03_LOCK_FLG, BC001625_A641TBW03_LOCK_DATETIME, BC001625_n641TBW03_LOCK_DATETIME, BC001625_A643TBW03_LOCK_USER_NM, BC001625_n643TBW03_LOCK_USER_NM, BC001625_A644TBW03_LOCK_AUTH_CD, BC001625_n644TBW03_LOCK_AUTH_CD, BC001625_A645TBW03_UPLOAD_DATETIME, BC001625_n645TBW03_UPLOAD_DATETIME,
            BC001625_A647TBW03_UPLOAD_USER_NM, BC001625_n647TBW03_UPLOAD_USER_NM, BC001625_A648TBW03_UPLOAD_AUTH_CD, BC001625_n648TBW03_UPLOAD_AUTH_CD, BC001625_A649TBW03_DM_ARRIVAL_FLG, BC001625_n649TBW03_DM_ARRIVAL_FLG, BC001625_A650TBW03_DM_ARRIVAL_DATETIME, BC001625_n650TBW03_DM_ARRIVAL_DATETIME, BC001625_A651TBW03_APPROVAL_FLG, BC001625_n651TBW03_APPROVAL_FLG,
            BC001625_A652TBW03_APPROVAL_DATETIME, BC001625_n652TBW03_APPROVAL_DATETIME, BC001625_A654TBW03_APPROVAL_USER_NM, BC001625_n654TBW03_APPROVAL_USER_NM, BC001625_A655TBW03_APPROVAL_AUTH_CD, BC001625_n655TBW03_APPROVAL_AUTH_CD, BC001625_A656TBW03_INPUT_END_FLG, BC001625_n656TBW03_INPUT_END_FLG, BC001625_A657TBW03_INPUT_END_DATETIME, BC001625_n657TBW03_INPUT_END_DATETIME,
            BC001625_A659TBW03_INPUT_END_USER_NM, BC001625_n659TBW03_INPUT_END_USER_NM, BC001625_A660TBW03_INPUT_END_AUTH_CD, BC001625_n660TBW03_INPUT_END_AUTH_CD, BC001625_A755TBW03_DEL_FLG, BC001625_n755TBW03_DEL_FLG, BC001625_A756TBW03_CRT_DATETIME, BC001625_n756TBW03_CRT_DATETIME, BC001625_A758TBW03_CRT_USER_NM, BC001625_n758TBW03_CRT_USER_NM,
            BC001625_A759TBW03_CRT_PROG_NM, BC001625_n759TBW03_CRT_PROG_NM, BC001625_A760TBW03_UPD_DATETIME, BC001625_n760TBW03_UPD_DATETIME, BC001625_A762TBW03_UPD_USER_NM, BC001625_n762TBW03_UPD_USER_NM, BC001625_A763TBW03_UPD_PROG_NM, BC001625_n763TBW03_UPD_PROG_NM, BC001625_A764TBW03_UPD_CNT, BC001625_n764TBW03_UPD_CNT,
            BC001625_A628TBW03_STUDY_ID, BC001625_A630TBW03_CRF_ID, BC001625_A634TBW03_SITE_ID, BC001625_n634TBW03_SITE_ID, BC001625_A642TBW03_LOCK_USER_ID, BC001625_n642TBW03_LOCK_USER_ID, BC001625_A646TBW03_UPLOAD_USER_ID, BC001625_n646TBW03_UPLOAD_USER_ID, BC001625_A653TBW03_APPROVAL_USER_ID, BC001625_n653TBW03_APPROVAL_USER_ID,
            BC001625_A658TBW03_INPUT_END_USER_ID, BC001625_n658TBW03_INPUT_END_USER_ID, BC001625_A757TBW03_CRT_USER_ID, BC001625_n757TBW03_CRT_USER_ID, BC001625_A761TBW03_UPD_USER_ID, BC001625_n761TBW03_UPD_USER_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW03_CRF_SEARCH_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11162 */
      e11162 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N ;
   private byte Z639TBW03_CRF_INPUT_LEVEL ;
   private byte A639TBW03_CRF_INPUT_LEVEL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z630TBW03_CRF_ID ;
   private short A630TBW03_CRF_ID ;
   private short gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z ;
   private short gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z ;
   private short Z638TBW03_CRF_LATEST_VERSION ;
   private short A638TBW03_CRF_LATEST_VERSION ;
   private short RcdFound41 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z629TBW03_SUBJECT_ID ;
   private int A629TBW03_SUBJECT_ID ;
   private int gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z ;
   private int gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z ;
   private int GX_JID ;
   private int Z633TBW03_CRF_ORDER ;
   private int A633TBW03_CRF_ORDER ;
   private int AnyError628 ;
   private int AnyError630 ;
   private int AnyError634 ;
   private int AnyError642 ;
   private int AnyError646 ;
   private int AnyError653 ;
   private int AnyError658 ;
   private int AnyError757 ;
   private int AnyError761 ;
   private int GXActiveErrHndl ;
   private long Z628TBW03_STUDY_ID ;
   private long A628TBW03_STUDY_ID ;
   private long gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z ;
   private long gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z ;
   private long Z764TBW03_UPD_CNT ;
   private long A764TBW03_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String sMode41 ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z ;
   private java.util.Date Z641TBW03_LOCK_DATETIME ;
   private java.util.Date A641TBW03_LOCK_DATETIME ;
   private java.util.Date Z645TBW03_UPLOAD_DATETIME ;
   private java.util.Date A645TBW03_UPLOAD_DATETIME ;
   private java.util.Date Z650TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date A650TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z652TBW03_APPROVAL_DATETIME ;
   private java.util.Date A652TBW03_APPROVAL_DATETIME ;
   private java.util.Date Z657TBW03_INPUT_END_DATETIME ;
   private java.util.Date A657TBW03_INPUT_END_DATETIME ;
   private java.util.Date Z756TBW03_CRT_DATETIME ;
   private java.util.Date A756TBW03_CRT_DATETIME ;
   private java.util.Date Z760TBW03_UPD_DATETIME ;
   private java.util.Date A760TBW03_UPD_DATETIME ;
   private boolean n631TBW03_CRF_NM ;
   private boolean n632TBW03_CRF_SNM ;
   private boolean n633TBW03_CRF_ORDER ;
   private boolean n635TBW03_SITE_NM ;
   private boolean n636TBW03_SITE_RYAK_NM ;
   private boolean n637TBW03_OUTER_SUBJECT_ID ;
   private boolean n638TBW03_CRF_LATEST_VERSION ;
   private boolean n639TBW03_CRF_INPUT_LEVEL ;
   private boolean n640TBW03_LOCK_FLG ;
   private boolean n641TBW03_LOCK_DATETIME ;
   private boolean n643TBW03_LOCK_USER_NM ;
   private boolean n644TBW03_LOCK_AUTH_CD ;
   private boolean n645TBW03_UPLOAD_DATETIME ;
   private boolean n647TBW03_UPLOAD_USER_NM ;
   private boolean n648TBW03_UPLOAD_AUTH_CD ;
   private boolean n649TBW03_DM_ARRIVAL_FLG ;
   private boolean n650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean n651TBW03_APPROVAL_FLG ;
   private boolean n652TBW03_APPROVAL_DATETIME ;
   private boolean n654TBW03_APPROVAL_USER_NM ;
   private boolean n655TBW03_APPROVAL_AUTH_CD ;
   private boolean n656TBW03_INPUT_END_FLG ;
   private boolean n657TBW03_INPUT_END_DATETIME ;
   private boolean n659TBW03_INPUT_END_USER_NM ;
   private boolean n660TBW03_INPUT_END_AUTH_CD ;
   private boolean n755TBW03_DEL_FLG ;
   private boolean n756TBW03_CRT_DATETIME ;
   private boolean n758TBW03_CRT_USER_NM ;
   private boolean n759TBW03_CRT_PROG_NM ;
   private boolean n760TBW03_UPD_DATETIME ;
   private boolean n762TBW03_UPD_USER_NM ;
   private boolean n763TBW03_UPD_PROG_NM ;
   private boolean n764TBW03_UPD_CNT ;
   private boolean n634TBW03_SITE_ID ;
   private boolean n642TBW03_LOCK_USER_ID ;
   private boolean n646TBW03_UPLOAD_USER_ID ;
   private boolean n653TBW03_APPROVAL_USER_ID ;
   private boolean n658TBW03_INPUT_END_USER_ID ;
   private boolean n757TBW03_CRT_USER_ID ;
   private boolean n761TBW03_UPD_USER_ID ;
   private boolean Gx_longc ;
   private String Z625TBW03_SESSION_ID ;
   private String A625TBW03_SESSION_ID ;
   private String Z626TBW03_APP_ID ;
   private String A626TBW03_APP_ID ;
   private String Z627TBW03_DISP_DATETIME ;
   private String A627TBW03_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z ;
   private String Z637TBW03_OUTER_SUBJECT_ID ;
   private String A637TBW03_OUTER_SUBJECT_ID ;
   private String Z640TBW03_LOCK_FLG ;
   private String A640TBW03_LOCK_FLG ;
   private String Z644TBW03_LOCK_AUTH_CD ;
   private String A644TBW03_LOCK_AUTH_CD ;
   private String Z648TBW03_UPLOAD_AUTH_CD ;
   private String A648TBW03_UPLOAD_AUTH_CD ;
   private String Z649TBW03_DM_ARRIVAL_FLG ;
   private String A649TBW03_DM_ARRIVAL_FLG ;
   private String Z651TBW03_APPROVAL_FLG ;
   private String A651TBW03_APPROVAL_FLG ;
   private String Z655TBW03_APPROVAL_AUTH_CD ;
   private String A655TBW03_APPROVAL_AUTH_CD ;
   private String Z656TBW03_INPUT_END_FLG ;
   private String A656TBW03_INPUT_END_FLG ;
   private String Z660TBW03_INPUT_END_AUTH_CD ;
   private String A660TBW03_INPUT_END_AUTH_CD ;
   private String Z755TBW03_DEL_FLG ;
   private String A755TBW03_DEL_FLG ;
   private String Z759TBW03_CRT_PROG_NM ;
   private String A759TBW03_CRT_PROG_NM ;
   private String Z763TBW03_UPD_PROG_NM ;
   private String A763TBW03_UPD_PROG_NM ;
   private String Z634TBW03_SITE_ID ;
   private String A634TBW03_SITE_ID ;
   private String Z642TBW03_LOCK_USER_ID ;
   private String A642TBW03_LOCK_USER_ID ;
   private String Z646TBW03_UPLOAD_USER_ID ;
   private String A646TBW03_UPLOAD_USER_ID ;
   private String Z653TBW03_APPROVAL_USER_ID ;
   private String A653TBW03_APPROVAL_USER_ID ;
   private String Z658TBW03_INPUT_END_USER_ID ;
   private String A658TBW03_INPUT_END_USER_ID ;
   private String Z757TBW03_CRT_USER_ID ;
   private String A757TBW03_CRT_USER_ID ;
   private String Z761TBW03_UPD_USER_ID ;
   private String A761TBW03_UPD_USER_ID ;
   private String Z631TBW03_CRF_NM ;
   private String A631TBW03_CRF_NM ;
   private String Z632TBW03_CRF_SNM ;
   private String A632TBW03_CRF_SNM ;
   private String Z635TBW03_SITE_NM ;
   private String A635TBW03_SITE_NM ;
   private String Z636TBW03_SITE_RYAK_NM ;
   private String A636TBW03_SITE_RYAK_NM ;
   private String Z643TBW03_LOCK_USER_NM ;
   private String A643TBW03_LOCK_USER_NM ;
   private String Z647TBW03_UPLOAD_USER_NM ;
   private String A647TBW03_UPLOAD_USER_NM ;
   private String Z654TBW03_APPROVAL_USER_NM ;
   private String A654TBW03_APPROVAL_USER_NM ;
   private String Z659TBW03_INPUT_END_USER_NM ;
   private String A659TBW03_INPUT_END_USER_NM ;
   private String Z758TBW03_CRT_USER_NM ;
   private String A758TBW03_CRT_USER_NM ;
   private String Z762TBW03_UPD_USER_NM ;
   private String A762TBW03_UPD_USER_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW03_CRF_SEARCH bcTBW03_CRF_SEARCH ;
   private IDataStoreProvider pr_default ;
   private String[] BC001612_A625TBW03_SESSION_ID ;
   private String[] BC001612_A626TBW03_APP_ID ;
   private String[] BC001612_A627TBW03_DISP_DATETIME ;
   private int[] BC001612_A629TBW03_SUBJECT_ID ;
   private String[] BC001612_A631TBW03_CRF_NM ;
   private boolean[] BC001612_n631TBW03_CRF_NM ;
   private String[] BC001612_A632TBW03_CRF_SNM ;
   private boolean[] BC001612_n632TBW03_CRF_SNM ;
   private int[] BC001612_A633TBW03_CRF_ORDER ;
   private boolean[] BC001612_n633TBW03_CRF_ORDER ;
   private String[] BC001612_A635TBW03_SITE_NM ;
   private boolean[] BC001612_n635TBW03_SITE_NM ;
   private String[] BC001612_A636TBW03_SITE_RYAK_NM ;
   private boolean[] BC001612_n636TBW03_SITE_RYAK_NM ;
   private String[] BC001612_A637TBW03_OUTER_SUBJECT_ID ;
   private boolean[] BC001612_n637TBW03_OUTER_SUBJECT_ID ;
   private short[] BC001612_A638TBW03_CRF_LATEST_VERSION ;
   private boolean[] BC001612_n638TBW03_CRF_LATEST_VERSION ;
   private byte[] BC001612_A639TBW03_CRF_INPUT_LEVEL ;
   private boolean[] BC001612_n639TBW03_CRF_INPUT_LEVEL ;
   private String[] BC001612_A640TBW03_LOCK_FLG ;
   private boolean[] BC001612_n640TBW03_LOCK_FLG ;
   private java.util.Date[] BC001612_A641TBW03_LOCK_DATETIME ;
   private boolean[] BC001612_n641TBW03_LOCK_DATETIME ;
   private String[] BC001612_A643TBW03_LOCK_USER_NM ;
   private boolean[] BC001612_n643TBW03_LOCK_USER_NM ;
   private String[] BC001612_A644TBW03_LOCK_AUTH_CD ;
   private boolean[] BC001612_n644TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] BC001612_A645TBW03_UPLOAD_DATETIME ;
   private boolean[] BC001612_n645TBW03_UPLOAD_DATETIME ;
   private String[] BC001612_A647TBW03_UPLOAD_USER_NM ;
   private boolean[] BC001612_n647TBW03_UPLOAD_USER_NM ;
   private String[] BC001612_A648TBW03_UPLOAD_AUTH_CD ;
   private boolean[] BC001612_n648TBW03_UPLOAD_AUTH_CD ;
   private String[] BC001612_A649TBW03_DM_ARRIVAL_FLG ;
   private boolean[] BC001612_n649TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC001612_A650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] BC001612_n650TBW03_DM_ARRIVAL_DATETIME ;
   private String[] BC001612_A651TBW03_APPROVAL_FLG ;
   private boolean[] BC001612_n651TBW03_APPROVAL_FLG ;
   private java.util.Date[] BC001612_A652TBW03_APPROVAL_DATETIME ;
   private boolean[] BC001612_n652TBW03_APPROVAL_DATETIME ;
   private String[] BC001612_A654TBW03_APPROVAL_USER_NM ;
   private boolean[] BC001612_n654TBW03_APPROVAL_USER_NM ;
   private String[] BC001612_A655TBW03_APPROVAL_AUTH_CD ;
   private boolean[] BC001612_n655TBW03_APPROVAL_AUTH_CD ;
   private String[] BC001612_A656TBW03_INPUT_END_FLG ;
   private boolean[] BC001612_n656TBW03_INPUT_END_FLG ;
   private java.util.Date[] BC001612_A657TBW03_INPUT_END_DATETIME ;
   private boolean[] BC001612_n657TBW03_INPUT_END_DATETIME ;
   private String[] BC001612_A659TBW03_INPUT_END_USER_NM ;
   private boolean[] BC001612_n659TBW03_INPUT_END_USER_NM ;
   private String[] BC001612_A660TBW03_INPUT_END_AUTH_CD ;
   private boolean[] BC001612_n660TBW03_INPUT_END_AUTH_CD ;
   private String[] BC001612_A755TBW03_DEL_FLG ;
   private boolean[] BC001612_n755TBW03_DEL_FLG ;
   private java.util.Date[] BC001612_A756TBW03_CRT_DATETIME ;
   private boolean[] BC001612_n756TBW03_CRT_DATETIME ;
   private String[] BC001612_A758TBW03_CRT_USER_NM ;
   private boolean[] BC001612_n758TBW03_CRT_USER_NM ;
   private String[] BC001612_A759TBW03_CRT_PROG_NM ;
   private boolean[] BC001612_n759TBW03_CRT_PROG_NM ;
   private java.util.Date[] BC001612_A760TBW03_UPD_DATETIME ;
   private boolean[] BC001612_n760TBW03_UPD_DATETIME ;
   private String[] BC001612_A762TBW03_UPD_USER_NM ;
   private boolean[] BC001612_n762TBW03_UPD_USER_NM ;
   private String[] BC001612_A763TBW03_UPD_PROG_NM ;
   private boolean[] BC001612_n763TBW03_UPD_PROG_NM ;
   private long[] BC001612_A764TBW03_UPD_CNT ;
   private boolean[] BC001612_n764TBW03_UPD_CNT ;
   private long[] BC001612_A628TBW03_STUDY_ID ;
   private short[] BC001612_A630TBW03_CRF_ID ;
   private String[] BC001612_A634TBW03_SITE_ID ;
   private boolean[] BC001612_n634TBW03_SITE_ID ;
   private String[] BC001612_A642TBW03_LOCK_USER_ID ;
   private boolean[] BC001612_n642TBW03_LOCK_USER_ID ;
   private String[] BC001612_A646TBW03_UPLOAD_USER_ID ;
   private boolean[] BC001612_n646TBW03_UPLOAD_USER_ID ;
   private String[] BC001612_A653TBW03_APPROVAL_USER_ID ;
   private boolean[] BC001612_n653TBW03_APPROVAL_USER_ID ;
   private String[] BC001612_A658TBW03_INPUT_END_USER_ID ;
   private boolean[] BC001612_n658TBW03_INPUT_END_USER_ID ;
   private String[] BC001612_A757TBW03_CRT_USER_ID ;
   private boolean[] BC001612_n757TBW03_CRT_USER_ID ;
   private String[] BC001612_A761TBW03_UPD_USER_ID ;
   private boolean[] BC001612_n761TBW03_UPD_USER_ID ;
   private String[] BC00164_A631TBW03_CRF_NM ;
   private boolean[] BC00164_n631TBW03_CRF_NM ;
   private String[] BC00164_A632TBW03_CRF_SNM ;
   private boolean[] BC00164_n632TBW03_CRF_SNM ;
   private int[] BC00164_A633TBW03_CRF_ORDER ;
   private boolean[] BC00164_n633TBW03_CRF_ORDER ;
   private String[] BC00165_A635TBW03_SITE_NM ;
   private boolean[] BC00165_n635TBW03_SITE_NM ;
   private String[] BC00165_A636TBW03_SITE_RYAK_NM ;
   private boolean[] BC00165_n636TBW03_SITE_RYAK_NM ;
   private String[] BC00166_A643TBW03_LOCK_USER_NM ;
   private boolean[] BC00166_n643TBW03_LOCK_USER_NM ;
   private String[] BC00167_A647TBW03_UPLOAD_USER_NM ;
   private boolean[] BC00167_n647TBW03_UPLOAD_USER_NM ;
   private String[] BC00168_A654TBW03_APPROVAL_USER_NM ;
   private boolean[] BC00168_n654TBW03_APPROVAL_USER_NM ;
   private String[] BC00169_A659TBW03_INPUT_END_USER_NM ;
   private boolean[] BC00169_n659TBW03_INPUT_END_USER_NM ;
   private String[] BC001610_A758TBW03_CRT_USER_NM ;
   private boolean[] BC001610_n758TBW03_CRT_USER_NM ;
   private String[] BC001611_A762TBW03_UPD_USER_NM ;
   private boolean[] BC001611_n762TBW03_UPD_USER_NM ;
   private String[] BC001613_A625TBW03_SESSION_ID ;
   private String[] BC001613_A626TBW03_APP_ID ;
   private String[] BC001613_A627TBW03_DISP_DATETIME ;
   private long[] BC001613_A628TBW03_STUDY_ID ;
   private int[] BC001613_A629TBW03_SUBJECT_ID ;
   private short[] BC001613_A630TBW03_CRF_ID ;
   private String[] BC00163_A625TBW03_SESSION_ID ;
   private String[] BC00163_A626TBW03_APP_ID ;
   private String[] BC00163_A627TBW03_DISP_DATETIME ;
   private int[] BC00163_A629TBW03_SUBJECT_ID ;
   private String[] BC00163_A637TBW03_OUTER_SUBJECT_ID ;
   private boolean[] BC00163_n637TBW03_OUTER_SUBJECT_ID ;
   private short[] BC00163_A638TBW03_CRF_LATEST_VERSION ;
   private boolean[] BC00163_n638TBW03_CRF_LATEST_VERSION ;
   private byte[] BC00163_A639TBW03_CRF_INPUT_LEVEL ;
   private boolean[] BC00163_n639TBW03_CRF_INPUT_LEVEL ;
   private String[] BC00163_A640TBW03_LOCK_FLG ;
   private boolean[] BC00163_n640TBW03_LOCK_FLG ;
   private java.util.Date[] BC00163_A641TBW03_LOCK_DATETIME ;
   private boolean[] BC00163_n641TBW03_LOCK_DATETIME ;
   private String[] BC00163_A644TBW03_LOCK_AUTH_CD ;
   private boolean[] BC00163_n644TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] BC00163_A645TBW03_UPLOAD_DATETIME ;
   private boolean[] BC00163_n645TBW03_UPLOAD_DATETIME ;
   private String[] BC00163_A648TBW03_UPLOAD_AUTH_CD ;
   private boolean[] BC00163_n648TBW03_UPLOAD_AUTH_CD ;
   private String[] BC00163_A649TBW03_DM_ARRIVAL_FLG ;
   private boolean[] BC00163_n649TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00163_A650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00163_n650TBW03_DM_ARRIVAL_DATETIME ;
   private String[] BC00163_A651TBW03_APPROVAL_FLG ;
   private boolean[] BC00163_n651TBW03_APPROVAL_FLG ;
   private java.util.Date[] BC00163_A652TBW03_APPROVAL_DATETIME ;
   private boolean[] BC00163_n652TBW03_APPROVAL_DATETIME ;
   private String[] BC00163_A655TBW03_APPROVAL_AUTH_CD ;
   private boolean[] BC00163_n655TBW03_APPROVAL_AUTH_CD ;
   private String[] BC00163_A656TBW03_INPUT_END_FLG ;
   private boolean[] BC00163_n656TBW03_INPUT_END_FLG ;
   private java.util.Date[] BC00163_A657TBW03_INPUT_END_DATETIME ;
   private boolean[] BC00163_n657TBW03_INPUT_END_DATETIME ;
   private String[] BC00163_A660TBW03_INPUT_END_AUTH_CD ;
   private boolean[] BC00163_n660TBW03_INPUT_END_AUTH_CD ;
   private String[] BC00163_A755TBW03_DEL_FLG ;
   private boolean[] BC00163_n755TBW03_DEL_FLG ;
   private java.util.Date[] BC00163_A756TBW03_CRT_DATETIME ;
   private boolean[] BC00163_n756TBW03_CRT_DATETIME ;
   private String[] BC00163_A759TBW03_CRT_PROG_NM ;
   private boolean[] BC00163_n759TBW03_CRT_PROG_NM ;
   private java.util.Date[] BC00163_A760TBW03_UPD_DATETIME ;
   private boolean[] BC00163_n760TBW03_UPD_DATETIME ;
   private String[] BC00163_A763TBW03_UPD_PROG_NM ;
   private boolean[] BC00163_n763TBW03_UPD_PROG_NM ;
   private long[] BC00163_A764TBW03_UPD_CNT ;
   private boolean[] BC00163_n764TBW03_UPD_CNT ;
   private long[] BC00163_A628TBW03_STUDY_ID ;
   private short[] BC00163_A630TBW03_CRF_ID ;
   private String[] BC00163_A634TBW03_SITE_ID ;
   private boolean[] BC00163_n634TBW03_SITE_ID ;
   private String[] BC00163_A642TBW03_LOCK_USER_ID ;
   private boolean[] BC00163_n642TBW03_LOCK_USER_ID ;
   private String[] BC00163_A646TBW03_UPLOAD_USER_ID ;
   private boolean[] BC00163_n646TBW03_UPLOAD_USER_ID ;
   private String[] BC00163_A653TBW03_APPROVAL_USER_ID ;
   private boolean[] BC00163_n653TBW03_APPROVAL_USER_ID ;
   private String[] BC00163_A658TBW03_INPUT_END_USER_ID ;
   private boolean[] BC00163_n658TBW03_INPUT_END_USER_ID ;
   private String[] BC00163_A757TBW03_CRT_USER_ID ;
   private boolean[] BC00163_n757TBW03_CRT_USER_ID ;
   private String[] BC00163_A761TBW03_UPD_USER_ID ;
   private boolean[] BC00163_n761TBW03_UPD_USER_ID ;
   private String[] BC00162_A625TBW03_SESSION_ID ;
   private String[] BC00162_A626TBW03_APP_ID ;
   private String[] BC00162_A627TBW03_DISP_DATETIME ;
   private int[] BC00162_A629TBW03_SUBJECT_ID ;
   private String[] BC00162_A637TBW03_OUTER_SUBJECT_ID ;
   private boolean[] BC00162_n637TBW03_OUTER_SUBJECT_ID ;
   private short[] BC00162_A638TBW03_CRF_LATEST_VERSION ;
   private boolean[] BC00162_n638TBW03_CRF_LATEST_VERSION ;
   private byte[] BC00162_A639TBW03_CRF_INPUT_LEVEL ;
   private boolean[] BC00162_n639TBW03_CRF_INPUT_LEVEL ;
   private String[] BC00162_A640TBW03_LOCK_FLG ;
   private boolean[] BC00162_n640TBW03_LOCK_FLG ;
   private java.util.Date[] BC00162_A641TBW03_LOCK_DATETIME ;
   private boolean[] BC00162_n641TBW03_LOCK_DATETIME ;
   private String[] BC00162_A644TBW03_LOCK_AUTH_CD ;
   private boolean[] BC00162_n644TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] BC00162_A645TBW03_UPLOAD_DATETIME ;
   private boolean[] BC00162_n645TBW03_UPLOAD_DATETIME ;
   private String[] BC00162_A648TBW03_UPLOAD_AUTH_CD ;
   private boolean[] BC00162_n648TBW03_UPLOAD_AUTH_CD ;
   private String[] BC00162_A649TBW03_DM_ARRIVAL_FLG ;
   private boolean[] BC00162_n649TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00162_A650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00162_n650TBW03_DM_ARRIVAL_DATETIME ;
   private String[] BC00162_A651TBW03_APPROVAL_FLG ;
   private boolean[] BC00162_n651TBW03_APPROVAL_FLG ;
   private java.util.Date[] BC00162_A652TBW03_APPROVAL_DATETIME ;
   private boolean[] BC00162_n652TBW03_APPROVAL_DATETIME ;
   private String[] BC00162_A655TBW03_APPROVAL_AUTH_CD ;
   private boolean[] BC00162_n655TBW03_APPROVAL_AUTH_CD ;
   private String[] BC00162_A656TBW03_INPUT_END_FLG ;
   private boolean[] BC00162_n656TBW03_INPUT_END_FLG ;
   private java.util.Date[] BC00162_A657TBW03_INPUT_END_DATETIME ;
   private boolean[] BC00162_n657TBW03_INPUT_END_DATETIME ;
   private String[] BC00162_A660TBW03_INPUT_END_AUTH_CD ;
   private boolean[] BC00162_n660TBW03_INPUT_END_AUTH_CD ;
   private String[] BC00162_A755TBW03_DEL_FLG ;
   private boolean[] BC00162_n755TBW03_DEL_FLG ;
   private java.util.Date[] BC00162_A756TBW03_CRT_DATETIME ;
   private boolean[] BC00162_n756TBW03_CRT_DATETIME ;
   private String[] BC00162_A759TBW03_CRT_PROG_NM ;
   private boolean[] BC00162_n759TBW03_CRT_PROG_NM ;
   private java.util.Date[] BC00162_A760TBW03_UPD_DATETIME ;
   private boolean[] BC00162_n760TBW03_UPD_DATETIME ;
   private String[] BC00162_A763TBW03_UPD_PROG_NM ;
   private boolean[] BC00162_n763TBW03_UPD_PROG_NM ;
   private long[] BC00162_A764TBW03_UPD_CNT ;
   private boolean[] BC00162_n764TBW03_UPD_CNT ;
   private long[] BC00162_A628TBW03_STUDY_ID ;
   private short[] BC00162_A630TBW03_CRF_ID ;
   private String[] BC00162_A634TBW03_SITE_ID ;
   private boolean[] BC00162_n634TBW03_SITE_ID ;
   private String[] BC00162_A642TBW03_LOCK_USER_ID ;
   private boolean[] BC00162_n642TBW03_LOCK_USER_ID ;
   private String[] BC00162_A646TBW03_UPLOAD_USER_ID ;
   private boolean[] BC00162_n646TBW03_UPLOAD_USER_ID ;
   private String[] BC00162_A653TBW03_APPROVAL_USER_ID ;
   private boolean[] BC00162_n653TBW03_APPROVAL_USER_ID ;
   private String[] BC00162_A658TBW03_INPUT_END_USER_ID ;
   private boolean[] BC00162_n658TBW03_INPUT_END_USER_ID ;
   private String[] BC00162_A757TBW03_CRT_USER_ID ;
   private boolean[] BC00162_n757TBW03_CRT_USER_ID ;
   private String[] BC00162_A761TBW03_UPD_USER_ID ;
   private boolean[] BC00162_n761TBW03_UPD_USER_ID ;
   private String[] BC001617_A631TBW03_CRF_NM ;
   private boolean[] BC001617_n631TBW03_CRF_NM ;
   private String[] BC001617_A632TBW03_CRF_SNM ;
   private boolean[] BC001617_n632TBW03_CRF_SNM ;
   private int[] BC001617_A633TBW03_CRF_ORDER ;
   private boolean[] BC001617_n633TBW03_CRF_ORDER ;
   private String[] BC001618_A635TBW03_SITE_NM ;
   private boolean[] BC001618_n635TBW03_SITE_NM ;
   private String[] BC001618_A636TBW03_SITE_RYAK_NM ;
   private boolean[] BC001618_n636TBW03_SITE_RYAK_NM ;
   private String[] BC001619_A643TBW03_LOCK_USER_NM ;
   private boolean[] BC001619_n643TBW03_LOCK_USER_NM ;
   private String[] BC001620_A647TBW03_UPLOAD_USER_NM ;
   private boolean[] BC001620_n647TBW03_UPLOAD_USER_NM ;
   private String[] BC001621_A654TBW03_APPROVAL_USER_NM ;
   private boolean[] BC001621_n654TBW03_APPROVAL_USER_NM ;
   private String[] BC001622_A659TBW03_INPUT_END_USER_NM ;
   private boolean[] BC001622_n659TBW03_INPUT_END_USER_NM ;
   private String[] BC001623_A758TBW03_CRT_USER_NM ;
   private boolean[] BC001623_n758TBW03_CRT_USER_NM ;
   private String[] BC001624_A762TBW03_UPD_USER_NM ;
   private boolean[] BC001624_n762TBW03_UPD_USER_NM ;
   private String[] BC001625_A625TBW03_SESSION_ID ;
   private String[] BC001625_A626TBW03_APP_ID ;
   private String[] BC001625_A627TBW03_DISP_DATETIME ;
   private int[] BC001625_A629TBW03_SUBJECT_ID ;
   private String[] BC001625_A631TBW03_CRF_NM ;
   private boolean[] BC001625_n631TBW03_CRF_NM ;
   private String[] BC001625_A632TBW03_CRF_SNM ;
   private boolean[] BC001625_n632TBW03_CRF_SNM ;
   private int[] BC001625_A633TBW03_CRF_ORDER ;
   private boolean[] BC001625_n633TBW03_CRF_ORDER ;
   private String[] BC001625_A635TBW03_SITE_NM ;
   private boolean[] BC001625_n635TBW03_SITE_NM ;
   private String[] BC001625_A636TBW03_SITE_RYAK_NM ;
   private boolean[] BC001625_n636TBW03_SITE_RYAK_NM ;
   private String[] BC001625_A637TBW03_OUTER_SUBJECT_ID ;
   private boolean[] BC001625_n637TBW03_OUTER_SUBJECT_ID ;
   private short[] BC001625_A638TBW03_CRF_LATEST_VERSION ;
   private boolean[] BC001625_n638TBW03_CRF_LATEST_VERSION ;
   private byte[] BC001625_A639TBW03_CRF_INPUT_LEVEL ;
   private boolean[] BC001625_n639TBW03_CRF_INPUT_LEVEL ;
   private String[] BC001625_A640TBW03_LOCK_FLG ;
   private boolean[] BC001625_n640TBW03_LOCK_FLG ;
   private java.util.Date[] BC001625_A641TBW03_LOCK_DATETIME ;
   private boolean[] BC001625_n641TBW03_LOCK_DATETIME ;
   private String[] BC001625_A643TBW03_LOCK_USER_NM ;
   private boolean[] BC001625_n643TBW03_LOCK_USER_NM ;
   private String[] BC001625_A644TBW03_LOCK_AUTH_CD ;
   private boolean[] BC001625_n644TBW03_LOCK_AUTH_CD ;
   private java.util.Date[] BC001625_A645TBW03_UPLOAD_DATETIME ;
   private boolean[] BC001625_n645TBW03_UPLOAD_DATETIME ;
   private String[] BC001625_A647TBW03_UPLOAD_USER_NM ;
   private boolean[] BC001625_n647TBW03_UPLOAD_USER_NM ;
   private String[] BC001625_A648TBW03_UPLOAD_AUTH_CD ;
   private boolean[] BC001625_n648TBW03_UPLOAD_AUTH_CD ;
   private String[] BC001625_A649TBW03_DM_ARRIVAL_FLG ;
   private boolean[] BC001625_n649TBW03_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC001625_A650TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] BC001625_n650TBW03_DM_ARRIVAL_DATETIME ;
   private String[] BC001625_A651TBW03_APPROVAL_FLG ;
   private boolean[] BC001625_n651TBW03_APPROVAL_FLG ;
   private java.util.Date[] BC001625_A652TBW03_APPROVAL_DATETIME ;
   private boolean[] BC001625_n652TBW03_APPROVAL_DATETIME ;
   private String[] BC001625_A654TBW03_APPROVAL_USER_NM ;
   private boolean[] BC001625_n654TBW03_APPROVAL_USER_NM ;
   private String[] BC001625_A655TBW03_APPROVAL_AUTH_CD ;
   private boolean[] BC001625_n655TBW03_APPROVAL_AUTH_CD ;
   private String[] BC001625_A656TBW03_INPUT_END_FLG ;
   private boolean[] BC001625_n656TBW03_INPUT_END_FLG ;
   private java.util.Date[] BC001625_A657TBW03_INPUT_END_DATETIME ;
   private boolean[] BC001625_n657TBW03_INPUT_END_DATETIME ;
   private String[] BC001625_A659TBW03_INPUT_END_USER_NM ;
   private boolean[] BC001625_n659TBW03_INPUT_END_USER_NM ;
   private String[] BC001625_A660TBW03_INPUT_END_AUTH_CD ;
   private boolean[] BC001625_n660TBW03_INPUT_END_AUTH_CD ;
   private String[] BC001625_A755TBW03_DEL_FLG ;
   private boolean[] BC001625_n755TBW03_DEL_FLG ;
   private java.util.Date[] BC001625_A756TBW03_CRT_DATETIME ;
   private boolean[] BC001625_n756TBW03_CRT_DATETIME ;
   private String[] BC001625_A758TBW03_CRT_USER_NM ;
   private boolean[] BC001625_n758TBW03_CRT_USER_NM ;
   private String[] BC001625_A759TBW03_CRT_PROG_NM ;
   private boolean[] BC001625_n759TBW03_CRT_PROG_NM ;
   private java.util.Date[] BC001625_A760TBW03_UPD_DATETIME ;
   private boolean[] BC001625_n760TBW03_UPD_DATETIME ;
   private String[] BC001625_A762TBW03_UPD_USER_NM ;
   private boolean[] BC001625_n762TBW03_UPD_USER_NM ;
   private String[] BC001625_A763TBW03_UPD_PROG_NM ;
   private boolean[] BC001625_n763TBW03_UPD_PROG_NM ;
   private long[] BC001625_A764TBW03_UPD_CNT ;
   private boolean[] BC001625_n764TBW03_UPD_CNT ;
   private long[] BC001625_A628TBW03_STUDY_ID ;
   private short[] BC001625_A630TBW03_CRF_ID ;
   private String[] BC001625_A634TBW03_SITE_ID ;
   private boolean[] BC001625_n634TBW03_SITE_ID ;
   private String[] BC001625_A642TBW03_LOCK_USER_ID ;
   private boolean[] BC001625_n642TBW03_LOCK_USER_ID ;
   private String[] BC001625_A646TBW03_UPLOAD_USER_ID ;
   private boolean[] BC001625_n646TBW03_UPLOAD_USER_ID ;
   private String[] BC001625_A653TBW03_APPROVAL_USER_ID ;
   private boolean[] BC001625_n653TBW03_APPROVAL_USER_ID ;
   private String[] BC001625_A658TBW03_INPUT_END_USER_ID ;
   private boolean[] BC001625_n658TBW03_INPUT_END_USER_ID ;
   private String[] BC001625_A757TBW03_CRT_USER_ID ;
   private boolean[] BC001625_n757TBW03_CRT_USER_ID ;
   private String[] BC001625_A761TBW03_UPD_USER_ID ;
   private boolean[] BC001625_n761TBW03_UPD_USER_ID ;
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
         ,new ForEachCursor("BC001612", "SELECT TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_SUBJECT_ID`, T2.`TBM31_CRF_NM` AS TBW03_CRF_NM, T2.`TBM31_CRF_SNM` AS TBW03_CRF_SNM, T2.`TBM31_ORDER` AS TBW03_CRF_ORDER, T3.`TAM08_SITE_NM` AS TBW03_SITE_NM, T3.`TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM, TM1.`TBW03_OUTER_SUBJECT_ID`, TM1.`TBW03_CRF_LATEST_VERSION`, TM1.`TBW03_CRF_INPUT_LEVEL`, TM1.`TBW03_LOCK_FLG`, TM1.`TBW03_LOCK_DATETIME`, T4.`TAM07_USER_NM` AS TBW03_LOCK_USER_NM, TM1.`TBW03_LOCK_AUTH_CD`, TM1.`TBW03_UPLOAD_DATETIME`, T5.`TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM, TM1.`TBW03_UPLOAD_AUTH_CD`, TM1.`TBW03_DM_ARRIVAL_FLG`, TM1.`TBW03_DM_ARRIVAL_DATETIME`, TM1.`TBW03_APPROVAL_FLG`, TM1.`TBW03_APPROVAL_DATETIME`, T6.`TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM, TM1.`TBW03_APPROVAL_AUTH_CD`, TM1.`TBW03_INPUT_END_FLG`, TM1.`TBW03_INPUT_END_DATETIME`, T7.`TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM, TM1.`TBW03_INPUT_END_AUTH_CD`, TM1.`TBW03_DEL_FLG`, TM1.`TBW03_CRT_DATETIME`, T8.`TAM07_USER_NM` AS TBW03_CRT_USER_NM, TM1.`TBW03_CRT_PROG_NM`, TM1.`TBW03_UPD_DATETIME`, T9.`TAM07_USER_NM` AS TBW03_UPD_USER_NM, TM1.`TBW03_UPD_PROG_NM`, TM1.`TBW03_UPD_CNT`, TM1.`TBW03_STUDY_ID` AS TBW03_STUDY_ID, TM1.`TBW03_CRF_ID` AS TBW03_CRF_ID, TM1.`TBW03_SITE_ID` AS TBW03_SITE_ID, TM1.`TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, TM1.`TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, TM1.`TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, TM1.`TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, TM1.`TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, TM1.`TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM ((((((((`TBW03_CRF_SEARCH` TM1 INNER JOIN `TBM31_CRF` T2 ON T2.`TBM31_STUDY_ID` = TM1.`TBW03_STUDY_ID` AND T2.`TBM31_CRF_ID` = TM1.`TBW03_CRF_ID`) LEFT JOIN `TAM08_SITE` T3 ON T3.`TAM08_SITE_ID` = TM1.`TBW03_SITE_ID`) LEFT JOIN `TAM07_USER` T4 ON T4.`TAM07_USER_ID` = TM1.`TBW03_LOCK_USER_ID`) LEFT JOIN `TAM07_USER` T5 ON T5.`TAM07_USER_ID` = TM1.`TBW03_UPLOAD_USER_ID`) LEFT JOIN `TAM07_USER` T6 ON T6.`TAM07_USER_ID` = TM1.`TBW03_APPROVAL_USER_ID`) LEFT JOIN `TAM07_USER` T7 ON T7.`TAM07_USER_ID` = TM1.`TBW03_INPUT_END_USER_ID`) LEFT JOIN `TAM07_USER` T8 ON T8.`TAM07_USER_ID` = TM1.`TBW03_CRT_USER_ID`) LEFT JOIN `TAM07_USER` T9 ON T9.`TAM07_USER_ID` = TM1.`TBW03_UPD_USER_ID`) WHERE TM1.`TBW03_SESSION_ID` = ? and TM1.`TBW03_APP_ID` = ? and TM1.`TBW03_DISP_DATETIME` = ? and TM1.`TBW03_STUDY_ID` = ? and TM1.`TBW03_SUBJECT_ID` = ? and TM1.`TBW03_CRF_ID` = ? ORDER BY TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_STUDY_ID`, TM1.`TBW03_SUBJECT_ID`, TM1.`TBW03_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC001613", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID` AS TBW03_STUDY_ID, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` AS TBW03_CRF_ID FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001614", "INSERT INTO `TBW03_CRF_SEARCH` (`TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_SUBJECT_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`, `TBW03_STUDY_ID`, `TBW03_CRF_ID`, `TBW03_SITE_ID`, `TBW03_LOCK_USER_ID`, `TBW03_UPLOAD_USER_ID`, `TBW03_APPROVAL_USER_ID`, `TBW03_INPUT_END_USER_ID`, `TBW03_CRT_USER_ID`, `TBW03_UPD_USER_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001615", "UPDATE `TBW03_CRF_SEARCH` SET `TBW03_OUTER_SUBJECT_ID`=?, `TBW03_CRF_LATEST_VERSION`=?, `TBW03_CRF_INPUT_LEVEL`=?, `TBW03_LOCK_FLG`=?, `TBW03_LOCK_DATETIME`=?, `TBW03_LOCK_AUTH_CD`=?, `TBW03_UPLOAD_DATETIME`=?, `TBW03_UPLOAD_AUTH_CD`=?, `TBW03_DM_ARRIVAL_FLG`=?, `TBW03_DM_ARRIVAL_DATETIME`=?, `TBW03_APPROVAL_FLG`=?, `TBW03_APPROVAL_DATETIME`=?, `TBW03_APPROVAL_AUTH_CD`=?, `TBW03_INPUT_END_FLG`=?, `TBW03_INPUT_END_DATETIME`=?, `TBW03_INPUT_END_AUTH_CD`=?, `TBW03_DEL_FLG`=?, `TBW03_CRT_DATETIME`=?, `TBW03_CRT_PROG_NM`=?, `TBW03_UPD_DATETIME`=?, `TBW03_UPD_PROG_NM`=?, `TBW03_UPD_CNT`=?, `TBW03_SITE_ID`=?, `TBW03_LOCK_USER_ID`=?, `TBW03_UPLOAD_USER_ID`=?, `TBW03_APPROVAL_USER_ID`=?, `TBW03_INPUT_END_USER_ID`=?, `TBW03_CRT_USER_ID`=?, `TBW03_UPD_USER_ID`=?  WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001616", "DELETE FROM `TBW03_CRF_SEARCH`  WHERE `TBW03_SESSION_ID` = ? AND `TBW03_APP_ID` = ? AND `TBW03_DISP_DATETIME` = ? AND `TBW03_STUDY_ID` = ? AND `TBW03_SUBJECT_ID` = ? AND `TBW03_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001617", "SELECT `TBM31_CRF_NM` AS TBW03_CRF_NM, `TBM31_CRF_SNM` AS TBW03_CRF_SNM, `TBM31_ORDER` AS TBW03_CRF_ORDER FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001618", "SELECT `TAM08_SITE_NM` AS TBW03_SITE_NM, `TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001619", "SELECT `TAM07_USER_NM` AS TBW03_LOCK_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001620", "SELECT `TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001621", "SELECT `TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001622", "SELECT `TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001623", "SELECT `TAM07_USER_NM` AS TBW03_CRT_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001624", "SELECT `TAM07_USER_NM` AS TBW03_UPD_USER_NM FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001625", "SELECT TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_SUBJECT_ID`, T2.`TBM31_CRF_NM` AS TBW03_CRF_NM, T2.`TBM31_CRF_SNM` AS TBW03_CRF_SNM, T2.`TBM31_ORDER` AS TBW03_CRF_ORDER, T3.`TAM08_SITE_NM` AS TBW03_SITE_NM, T3.`TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM, TM1.`TBW03_OUTER_SUBJECT_ID`, TM1.`TBW03_CRF_LATEST_VERSION`, TM1.`TBW03_CRF_INPUT_LEVEL`, TM1.`TBW03_LOCK_FLG`, TM1.`TBW03_LOCK_DATETIME`, T4.`TAM07_USER_NM` AS TBW03_LOCK_USER_NM, TM1.`TBW03_LOCK_AUTH_CD`, TM1.`TBW03_UPLOAD_DATETIME`, T5.`TAM07_USER_NM` AS TBW03_UPLOAD_USER_NM, TM1.`TBW03_UPLOAD_AUTH_CD`, TM1.`TBW03_DM_ARRIVAL_FLG`, TM1.`TBW03_DM_ARRIVAL_DATETIME`, TM1.`TBW03_APPROVAL_FLG`, TM1.`TBW03_APPROVAL_DATETIME`, T6.`TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM, TM1.`TBW03_APPROVAL_AUTH_CD`, TM1.`TBW03_INPUT_END_FLG`, TM1.`TBW03_INPUT_END_DATETIME`, T7.`TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM, TM1.`TBW03_INPUT_END_AUTH_CD`, TM1.`TBW03_DEL_FLG`, TM1.`TBW03_CRT_DATETIME`, T8.`TAM07_USER_NM` AS TBW03_CRT_USER_NM, TM1.`TBW03_CRT_PROG_NM`, TM1.`TBW03_UPD_DATETIME`, T9.`TAM07_USER_NM` AS TBW03_UPD_USER_NM, TM1.`TBW03_UPD_PROG_NM`, TM1.`TBW03_UPD_CNT`, TM1.`TBW03_STUDY_ID` AS TBW03_STUDY_ID, TM1.`TBW03_CRF_ID` AS TBW03_CRF_ID, TM1.`TBW03_SITE_ID` AS TBW03_SITE_ID, TM1.`TBW03_LOCK_USER_ID` AS TBW03_LOCK_USER_ID, TM1.`TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, TM1.`TBW03_APPROVAL_USER_ID` AS TBW03_APPROVAL_USER_ID, TM1.`TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, TM1.`TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, TM1.`TBW03_UPD_USER_ID` AS TBW03_UPD_USER_ID FROM ((((((((`TBW03_CRF_SEARCH` TM1 INNER JOIN `TBM31_CRF` T2 ON T2.`TBM31_STUDY_ID` = TM1.`TBW03_STUDY_ID` AND T2.`TBM31_CRF_ID` = TM1.`TBW03_CRF_ID`) LEFT JOIN `TAM08_SITE` T3 ON T3.`TAM08_SITE_ID` = TM1.`TBW03_SITE_ID`) LEFT JOIN `TAM07_USER` T4 ON T4.`TAM07_USER_ID` = TM1.`TBW03_LOCK_USER_ID`) LEFT JOIN `TAM07_USER` T5 ON T5.`TAM07_USER_ID` = TM1.`TBW03_UPLOAD_USER_ID`) LEFT JOIN `TAM07_USER` T6 ON T6.`TAM07_USER_ID` = TM1.`TBW03_APPROVAL_USER_ID`) LEFT JOIN `TAM07_USER` T7 ON T7.`TAM07_USER_ID` = TM1.`TBW03_INPUT_END_USER_ID`) LEFT JOIN `TAM07_USER` T8 ON T8.`TAM07_USER_ID` = TM1.`TBW03_CRT_USER_ID`) LEFT JOIN `TAM07_USER` T9 ON T9.`TAM07_USER_ID` = TM1.`TBW03_UPD_USER_ID`) WHERE TM1.`TBW03_SESSION_ID` = ? and TM1.`TBW03_APP_ID` = ? and TM1.`TBW03_DISP_DATETIME` = ? and TM1.`TBW03_STUDY_ID` = ? and TM1.`TBW03_SUBJECT_ID` = ? and TM1.`TBW03_CRF_ID` = ? ORDER BY TM1.`TBW03_SESSION_ID`, TM1.`TBW03_APP_ID`, TM1.`TBW03_DISP_DATETIME`, TM1.`TBW03_STUDY_ID`, TM1.`TBW03_SUBJECT_ID`, TM1.`TBW03_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
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
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               break;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               break;
            case 23 :
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20, false);
               }
               break;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
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
               break;
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
               break;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20, false);
               }
               break;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128, false);
               }
               break;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
      }
   }

}

