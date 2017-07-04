/*
               File: tbm43_study_cdisc_item_bc
        Description: 試験別CDISC項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:33.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm43_study_cdisc_item_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm43_study_cdisc_item_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm43_study_cdisc_item_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm43_study_cdisc_item_bc.class ));
   }

   public tbm43_study_cdisc_item_bc( int remoteHandle ,
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
         /* Execute user event: e121J2 */
         e121J2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z894TBM43_STUDY_ID = A894TBM43_STUDY_ID ;
            Z895TBM43_DOM_CD = A895TBM43_DOM_CD ;
            Z896TBM43_DOM_VAR_NM = A896TBM43_DOM_VAR_NM ;
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

   public void confirm_1J0( )
   {
      beforeValidate1J54( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1J54( ) ;
         }
         else
         {
            checkExtendedTable1J54( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1J54( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e111J2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      AV7W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e121J2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV8W_TXT = "" ;
      AV8W_TXT = AV8W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + "ドメインコード:" + A895TBM43_DOM_CD + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + "ドメイン変数名:" + A896TBM43_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A897TBM43_VAR_DESC + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A898TBM43_SDTM_FLG + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A899TBM43_CDASH_FLG + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A900TBM43_INPUT_TYPE_DIV + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A901TBM43_REQUIRED_FLG + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A902TBM43_SAS_FIELD_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A904TBM43_NOTE + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A905TBM43_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A906TBM43_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A919TBM43_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm43_study_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A912TBM43_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A913TBM43_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A920TBM43_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm43_study_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A914TBM43_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A915TBM43_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = GXutil.strReplace( AV8W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV8W_TXT) ;
   }

   public void S1172( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1J54( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z919TBM43_CRT_DATETIME = A919TBM43_CRT_DATETIME ;
         Z912TBM43_CRT_USER_ID = A912TBM43_CRT_USER_ID ;
         Z920TBM43_UPD_DATETIME = A920TBM43_UPD_DATETIME ;
         Z914TBM43_UPD_USER_ID = A914TBM43_UPD_USER_ID ;
         Z921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
         Z897TBM43_VAR_DESC = A897TBM43_VAR_DESC ;
         Z898TBM43_SDTM_FLG = A898TBM43_SDTM_FLG ;
         Z899TBM43_CDASH_FLG = A899TBM43_CDASH_FLG ;
         Z900TBM43_INPUT_TYPE_DIV = A900TBM43_INPUT_TYPE_DIV ;
         Z901TBM43_REQUIRED_FLG = A901TBM43_REQUIRED_FLG ;
         Z902TBM43_SAS_FIELD_NM = A902TBM43_SAS_FIELD_NM ;
         Z903TBM43_ODM_DATA_TYPE = A903TBM43_ODM_DATA_TYPE ;
         Z904TBM43_NOTE = A904TBM43_NOTE ;
         Z905TBM43_ORDER = A905TBM43_ORDER ;
         Z907TBM43_VERSION = A907TBM43_VERSION ;
         Z906TBM43_DEL_FLG = A906TBM43_DEL_FLG ;
         Z913TBM43_CRT_PROG_NM = A913TBM43_CRT_PROG_NM ;
         Z915TBM43_UPD_PROG_NM = A915TBM43_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z894TBM43_STUDY_ID = A894TBM43_STUDY_ID ;
         Z895TBM43_DOM_CD = A895TBM43_DOM_CD ;
         Z896TBM43_DOM_VAR_NM = A896TBM43_DOM_VAR_NM ;
         Z919TBM43_CRT_DATETIME = A919TBM43_CRT_DATETIME ;
         Z912TBM43_CRT_USER_ID = A912TBM43_CRT_USER_ID ;
         Z920TBM43_UPD_DATETIME = A920TBM43_UPD_DATETIME ;
         Z914TBM43_UPD_USER_ID = A914TBM43_UPD_USER_ID ;
         Z921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
         Z897TBM43_VAR_DESC = A897TBM43_VAR_DESC ;
         Z898TBM43_SDTM_FLG = A898TBM43_SDTM_FLG ;
         Z899TBM43_CDASH_FLG = A899TBM43_CDASH_FLG ;
         Z900TBM43_INPUT_TYPE_DIV = A900TBM43_INPUT_TYPE_DIV ;
         Z901TBM43_REQUIRED_FLG = A901TBM43_REQUIRED_FLG ;
         Z902TBM43_SAS_FIELD_NM = A902TBM43_SAS_FIELD_NM ;
         Z903TBM43_ODM_DATA_TYPE = A903TBM43_ODM_DATA_TYPE ;
         Z904TBM43_NOTE = A904TBM43_NOTE ;
         Z905TBM43_ORDER = A905TBM43_ORDER ;
         Z907TBM43_VERSION = A907TBM43_VERSION ;
         Z906TBM43_DEL_FLG = A906TBM43_DEL_FLG ;
         Z913TBM43_CRT_PROG_NM = A913TBM43_CRT_PROG_NM ;
         Z915TBM43_UPD_PROG_NM = A915TBM43_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1J54( )
   {
      /* Using cursor BC001J4 */
      pr_default.execute(2, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A919TBM43_CRT_DATETIME = BC001J4_A919TBM43_CRT_DATETIME[0] ;
         n919TBM43_CRT_DATETIME = BC001J4_n919TBM43_CRT_DATETIME[0] ;
         A912TBM43_CRT_USER_ID = BC001J4_A912TBM43_CRT_USER_ID[0] ;
         n912TBM43_CRT_USER_ID = BC001J4_n912TBM43_CRT_USER_ID[0] ;
         A920TBM43_UPD_DATETIME = BC001J4_A920TBM43_UPD_DATETIME[0] ;
         n920TBM43_UPD_DATETIME = BC001J4_n920TBM43_UPD_DATETIME[0] ;
         A914TBM43_UPD_USER_ID = BC001J4_A914TBM43_UPD_USER_ID[0] ;
         n914TBM43_UPD_USER_ID = BC001J4_n914TBM43_UPD_USER_ID[0] ;
         A921TBM43_UPD_CNT = BC001J4_A921TBM43_UPD_CNT[0] ;
         n921TBM43_UPD_CNT = BC001J4_n921TBM43_UPD_CNT[0] ;
         A897TBM43_VAR_DESC = BC001J4_A897TBM43_VAR_DESC[0] ;
         n897TBM43_VAR_DESC = BC001J4_n897TBM43_VAR_DESC[0] ;
         A898TBM43_SDTM_FLG = BC001J4_A898TBM43_SDTM_FLG[0] ;
         n898TBM43_SDTM_FLG = BC001J4_n898TBM43_SDTM_FLG[0] ;
         A899TBM43_CDASH_FLG = BC001J4_A899TBM43_CDASH_FLG[0] ;
         n899TBM43_CDASH_FLG = BC001J4_n899TBM43_CDASH_FLG[0] ;
         A900TBM43_INPUT_TYPE_DIV = BC001J4_A900TBM43_INPUT_TYPE_DIV[0] ;
         n900TBM43_INPUT_TYPE_DIV = BC001J4_n900TBM43_INPUT_TYPE_DIV[0] ;
         A901TBM43_REQUIRED_FLG = BC001J4_A901TBM43_REQUIRED_FLG[0] ;
         n901TBM43_REQUIRED_FLG = BC001J4_n901TBM43_REQUIRED_FLG[0] ;
         A902TBM43_SAS_FIELD_NM = BC001J4_A902TBM43_SAS_FIELD_NM[0] ;
         n902TBM43_SAS_FIELD_NM = BC001J4_n902TBM43_SAS_FIELD_NM[0] ;
         A903TBM43_ODM_DATA_TYPE = BC001J4_A903TBM43_ODM_DATA_TYPE[0] ;
         n903TBM43_ODM_DATA_TYPE = BC001J4_n903TBM43_ODM_DATA_TYPE[0] ;
         A904TBM43_NOTE = BC001J4_A904TBM43_NOTE[0] ;
         n904TBM43_NOTE = BC001J4_n904TBM43_NOTE[0] ;
         A905TBM43_ORDER = BC001J4_A905TBM43_ORDER[0] ;
         n905TBM43_ORDER = BC001J4_n905TBM43_ORDER[0] ;
         A907TBM43_VERSION = BC001J4_A907TBM43_VERSION[0] ;
         n907TBM43_VERSION = BC001J4_n907TBM43_VERSION[0] ;
         A906TBM43_DEL_FLG = BC001J4_A906TBM43_DEL_FLG[0] ;
         n906TBM43_DEL_FLG = BC001J4_n906TBM43_DEL_FLG[0] ;
         A913TBM43_CRT_PROG_NM = BC001J4_A913TBM43_CRT_PROG_NM[0] ;
         n913TBM43_CRT_PROG_NM = BC001J4_n913TBM43_CRT_PROG_NM[0] ;
         A915TBM43_UPD_PROG_NM = BC001J4_A915TBM43_UPD_PROG_NM[0] ;
         n915TBM43_UPD_PROG_NM = BC001J4_n915TBM43_UPD_PROG_NM[0] ;
         zm1J54( -8) ;
      }
      pr_default.close(2);
      onLoadActions1J54( ) ;
   }

   public void onLoadActions1J54( )
   {
      AV9Pgmname = "TBM43_STUDY_CDISC_ITEM_BC" ;
   }

   public void checkExtendedTable1J54( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM43_STUDY_CDISC_ITEM_BC" ;
      if ( ! ( GXutil.nullDate().equals(A919TBM43_CRT_DATETIME) || (( A919TBM43_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A919TBM43_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A920TBM43_UPD_DATETIME) || (( A920TBM43_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A920TBM43_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1J54( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1J54( )
   {
      /* Using cursor BC001J5 */
      pr_default.execute(3, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound54 = (short)(1) ;
      }
      else
      {
         RcdFound54 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC001J3 */
      pr_default.execute(1, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1J54( 8) ;
         RcdFound54 = (short)(1) ;
         A894TBM43_STUDY_ID = BC001J3_A894TBM43_STUDY_ID[0] ;
         A895TBM43_DOM_CD = BC001J3_A895TBM43_DOM_CD[0] ;
         A896TBM43_DOM_VAR_NM = BC001J3_A896TBM43_DOM_VAR_NM[0] ;
         A919TBM43_CRT_DATETIME = BC001J3_A919TBM43_CRT_DATETIME[0] ;
         n919TBM43_CRT_DATETIME = BC001J3_n919TBM43_CRT_DATETIME[0] ;
         A912TBM43_CRT_USER_ID = BC001J3_A912TBM43_CRT_USER_ID[0] ;
         n912TBM43_CRT_USER_ID = BC001J3_n912TBM43_CRT_USER_ID[0] ;
         A920TBM43_UPD_DATETIME = BC001J3_A920TBM43_UPD_DATETIME[0] ;
         n920TBM43_UPD_DATETIME = BC001J3_n920TBM43_UPD_DATETIME[0] ;
         A914TBM43_UPD_USER_ID = BC001J3_A914TBM43_UPD_USER_ID[0] ;
         n914TBM43_UPD_USER_ID = BC001J3_n914TBM43_UPD_USER_ID[0] ;
         A921TBM43_UPD_CNT = BC001J3_A921TBM43_UPD_CNT[0] ;
         n921TBM43_UPD_CNT = BC001J3_n921TBM43_UPD_CNT[0] ;
         A897TBM43_VAR_DESC = BC001J3_A897TBM43_VAR_DESC[0] ;
         n897TBM43_VAR_DESC = BC001J3_n897TBM43_VAR_DESC[0] ;
         A898TBM43_SDTM_FLG = BC001J3_A898TBM43_SDTM_FLG[0] ;
         n898TBM43_SDTM_FLG = BC001J3_n898TBM43_SDTM_FLG[0] ;
         A899TBM43_CDASH_FLG = BC001J3_A899TBM43_CDASH_FLG[0] ;
         n899TBM43_CDASH_FLG = BC001J3_n899TBM43_CDASH_FLG[0] ;
         A900TBM43_INPUT_TYPE_DIV = BC001J3_A900TBM43_INPUT_TYPE_DIV[0] ;
         n900TBM43_INPUT_TYPE_DIV = BC001J3_n900TBM43_INPUT_TYPE_DIV[0] ;
         A901TBM43_REQUIRED_FLG = BC001J3_A901TBM43_REQUIRED_FLG[0] ;
         n901TBM43_REQUIRED_FLG = BC001J3_n901TBM43_REQUIRED_FLG[0] ;
         A902TBM43_SAS_FIELD_NM = BC001J3_A902TBM43_SAS_FIELD_NM[0] ;
         n902TBM43_SAS_FIELD_NM = BC001J3_n902TBM43_SAS_FIELD_NM[0] ;
         A903TBM43_ODM_DATA_TYPE = BC001J3_A903TBM43_ODM_DATA_TYPE[0] ;
         n903TBM43_ODM_DATA_TYPE = BC001J3_n903TBM43_ODM_DATA_TYPE[0] ;
         A904TBM43_NOTE = BC001J3_A904TBM43_NOTE[0] ;
         n904TBM43_NOTE = BC001J3_n904TBM43_NOTE[0] ;
         A905TBM43_ORDER = BC001J3_A905TBM43_ORDER[0] ;
         n905TBM43_ORDER = BC001J3_n905TBM43_ORDER[0] ;
         A907TBM43_VERSION = BC001J3_A907TBM43_VERSION[0] ;
         n907TBM43_VERSION = BC001J3_n907TBM43_VERSION[0] ;
         A906TBM43_DEL_FLG = BC001J3_A906TBM43_DEL_FLG[0] ;
         n906TBM43_DEL_FLG = BC001J3_n906TBM43_DEL_FLG[0] ;
         A913TBM43_CRT_PROG_NM = BC001J3_A913TBM43_CRT_PROG_NM[0] ;
         n913TBM43_CRT_PROG_NM = BC001J3_n913TBM43_CRT_PROG_NM[0] ;
         A915TBM43_UPD_PROG_NM = BC001J3_A915TBM43_UPD_PROG_NM[0] ;
         n915TBM43_UPD_PROG_NM = BC001J3_n915TBM43_UPD_PROG_NM[0] ;
         O921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
         n921TBM43_UPD_CNT = false ;
         Z894TBM43_STUDY_ID = A894TBM43_STUDY_ID ;
         Z895TBM43_DOM_CD = A895TBM43_DOM_CD ;
         Z896TBM43_DOM_VAR_NM = A896TBM43_DOM_VAR_NM ;
         sMode54 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1J54( ) ;
         Gx_mode = sMode54 ;
      }
      else
      {
         RcdFound54 = (short)(0) ;
         initializeNonKey1J54( ) ;
         sMode54 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode54 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1J54( ) ;
      if ( RcdFound54 == 0 )
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
      confirm_1J0( ) ;
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

   public void checkOptimisticConcurrency1J54( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC001J2 */
         pr_default.execute(0, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM43_STUDY_CDISC_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z919TBM43_CRT_DATETIME.equals( BC001J2_A919TBM43_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z912TBM43_CRT_USER_ID, BC001J2_A912TBM43_CRT_USER_ID[0]) != 0 ) || !( Z920TBM43_UPD_DATETIME.equals( BC001J2_A920TBM43_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z914TBM43_UPD_USER_ID, BC001J2_A914TBM43_UPD_USER_ID[0]) != 0 ) || ( Z921TBM43_UPD_CNT != BC001J2_A921TBM43_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z897TBM43_VAR_DESC, BC001J2_A897TBM43_VAR_DESC[0]) != 0 ) || ( GXutil.strcmp(Z898TBM43_SDTM_FLG, BC001J2_A898TBM43_SDTM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z899TBM43_CDASH_FLG, BC001J2_A899TBM43_CDASH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z900TBM43_INPUT_TYPE_DIV, BC001J2_A900TBM43_INPUT_TYPE_DIV[0]) != 0 ) || ( GXutil.strcmp(Z901TBM43_REQUIRED_FLG, BC001J2_A901TBM43_REQUIRED_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z902TBM43_SAS_FIELD_NM, BC001J2_A902TBM43_SAS_FIELD_NM[0]) != 0 ) || ( GXutil.strcmp(Z903TBM43_ODM_DATA_TYPE, BC001J2_A903TBM43_ODM_DATA_TYPE[0]) != 0 ) || ( GXutil.strcmp(Z904TBM43_NOTE, BC001J2_A904TBM43_NOTE[0]) != 0 ) || ( Z905TBM43_ORDER != BC001J2_A905TBM43_ORDER[0] ) || ( GXutil.strcmp(Z907TBM43_VERSION, BC001J2_A907TBM43_VERSION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z906TBM43_DEL_FLG, BC001J2_A906TBM43_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z913TBM43_CRT_PROG_NM, BC001J2_A913TBM43_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z915TBM43_UPD_PROG_NM, BC001J2_A915TBM43_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM43_STUDY_CDISC_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J54( )
   {
      beforeValidate1J54( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J54( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J54( 0) ;
         checkOptimisticConcurrency1J54( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J54( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J54( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001J6 */
                  pr_default.execute(4, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM, new Boolean(n919TBM43_CRT_DATETIME), A919TBM43_CRT_DATETIME, new Boolean(n912TBM43_CRT_USER_ID), A912TBM43_CRT_USER_ID, new Boolean(n920TBM43_UPD_DATETIME), A920TBM43_UPD_DATETIME, new Boolean(n914TBM43_UPD_USER_ID), A914TBM43_UPD_USER_ID, new Boolean(n921TBM43_UPD_CNT), new Long(A921TBM43_UPD_CNT), new Boolean(n897TBM43_VAR_DESC), A897TBM43_VAR_DESC, new Boolean(n898TBM43_SDTM_FLG), A898TBM43_SDTM_FLG, new Boolean(n899TBM43_CDASH_FLG), A899TBM43_CDASH_FLG, new Boolean(n900TBM43_INPUT_TYPE_DIV), A900TBM43_INPUT_TYPE_DIV, new Boolean(n901TBM43_REQUIRED_FLG), A901TBM43_REQUIRED_FLG, new Boolean(n902TBM43_SAS_FIELD_NM), A902TBM43_SAS_FIELD_NM, new Boolean(n903TBM43_ODM_DATA_TYPE), A903TBM43_ODM_DATA_TYPE, new Boolean(n904TBM43_NOTE), A904TBM43_NOTE, new Boolean(n905TBM43_ORDER), new Integer(A905TBM43_ORDER), new Boolean(n907TBM43_VERSION), A907TBM43_VERSION, new Boolean(n906TBM43_DEL_FLG), A906TBM43_DEL_FLG, new Boolean(n913TBM43_CRT_PROG_NM), A913TBM43_CRT_PROG_NM, new Boolean(n915TBM43_UPD_PROG_NM), A915TBM43_UPD_PROG_NM});
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
            load1J54( ) ;
         }
         endLevel1J54( ) ;
      }
      closeExtendedTableCursors1J54( ) ;
   }

   public void update1J54( )
   {
      beforeValidate1J54( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J54( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J54( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J54( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1J54( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001J7 */
                  pr_default.execute(5, new Object[] {new Boolean(n919TBM43_CRT_DATETIME), A919TBM43_CRT_DATETIME, new Boolean(n912TBM43_CRT_USER_ID), A912TBM43_CRT_USER_ID, new Boolean(n920TBM43_UPD_DATETIME), A920TBM43_UPD_DATETIME, new Boolean(n914TBM43_UPD_USER_ID), A914TBM43_UPD_USER_ID, new Boolean(n921TBM43_UPD_CNT), new Long(A921TBM43_UPD_CNT), new Boolean(n897TBM43_VAR_DESC), A897TBM43_VAR_DESC, new Boolean(n898TBM43_SDTM_FLG), A898TBM43_SDTM_FLG, new Boolean(n899TBM43_CDASH_FLG), A899TBM43_CDASH_FLG, new Boolean(n900TBM43_INPUT_TYPE_DIV), A900TBM43_INPUT_TYPE_DIV, new Boolean(n901TBM43_REQUIRED_FLG), A901TBM43_REQUIRED_FLG, new Boolean(n902TBM43_SAS_FIELD_NM), A902TBM43_SAS_FIELD_NM, new Boolean(n903TBM43_ODM_DATA_TYPE), A903TBM43_ODM_DATA_TYPE, new Boolean(n904TBM43_NOTE), A904TBM43_NOTE, new Boolean(n905TBM43_ORDER), new Integer(A905TBM43_ORDER), new Boolean(n907TBM43_VERSION), A907TBM43_VERSION, new Boolean(n906TBM43_DEL_FLG), A906TBM43_DEL_FLG, new Boolean(n913TBM43_CRT_PROG_NM), A913TBM43_CRT_PROG_NM, new Boolean(n915TBM43_UPD_PROG_NM), A915TBM43_UPD_PROG_NM, new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM43_STUDY_CDISC_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1J54( ) ;
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
         endLevel1J54( ) ;
      }
      closeExtendedTableCursors1J54( ) ;
   }

   public void deferredUpdate1J54( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1J54( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J54( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J54( ) ;
         afterConfirm1J54( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J54( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001J8 */
               pr_default.execute(6, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
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
      sMode54 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1J54( ) ;
      Gx_mode = sMode54 ;
   }

   public void onDeleteControls1J54( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM43_STUDY_CDISC_ITEM_BC" ;
      }
   }

   public void endLevel1J54( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1J54( ) ;
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

   public void scanKeyStart1J54( )
   {
      /* Using cursor BC001J9 */
      pr_default.execute(7, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
      RcdFound54 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A894TBM43_STUDY_ID = BC001J9_A894TBM43_STUDY_ID[0] ;
         A895TBM43_DOM_CD = BC001J9_A895TBM43_DOM_CD[0] ;
         A896TBM43_DOM_VAR_NM = BC001J9_A896TBM43_DOM_VAR_NM[0] ;
         A919TBM43_CRT_DATETIME = BC001J9_A919TBM43_CRT_DATETIME[0] ;
         n919TBM43_CRT_DATETIME = BC001J9_n919TBM43_CRT_DATETIME[0] ;
         A912TBM43_CRT_USER_ID = BC001J9_A912TBM43_CRT_USER_ID[0] ;
         n912TBM43_CRT_USER_ID = BC001J9_n912TBM43_CRT_USER_ID[0] ;
         A920TBM43_UPD_DATETIME = BC001J9_A920TBM43_UPD_DATETIME[0] ;
         n920TBM43_UPD_DATETIME = BC001J9_n920TBM43_UPD_DATETIME[0] ;
         A914TBM43_UPD_USER_ID = BC001J9_A914TBM43_UPD_USER_ID[0] ;
         n914TBM43_UPD_USER_ID = BC001J9_n914TBM43_UPD_USER_ID[0] ;
         A921TBM43_UPD_CNT = BC001J9_A921TBM43_UPD_CNT[0] ;
         n921TBM43_UPD_CNT = BC001J9_n921TBM43_UPD_CNT[0] ;
         A897TBM43_VAR_DESC = BC001J9_A897TBM43_VAR_DESC[0] ;
         n897TBM43_VAR_DESC = BC001J9_n897TBM43_VAR_DESC[0] ;
         A898TBM43_SDTM_FLG = BC001J9_A898TBM43_SDTM_FLG[0] ;
         n898TBM43_SDTM_FLG = BC001J9_n898TBM43_SDTM_FLG[0] ;
         A899TBM43_CDASH_FLG = BC001J9_A899TBM43_CDASH_FLG[0] ;
         n899TBM43_CDASH_FLG = BC001J9_n899TBM43_CDASH_FLG[0] ;
         A900TBM43_INPUT_TYPE_DIV = BC001J9_A900TBM43_INPUT_TYPE_DIV[0] ;
         n900TBM43_INPUT_TYPE_DIV = BC001J9_n900TBM43_INPUT_TYPE_DIV[0] ;
         A901TBM43_REQUIRED_FLG = BC001J9_A901TBM43_REQUIRED_FLG[0] ;
         n901TBM43_REQUIRED_FLG = BC001J9_n901TBM43_REQUIRED_FLG[0] ;
         A902TBM43_SAS_FIELD_NM = BC001J9_A902TBM43_SAS_FIELD_NM[0] ;
         n902TBM43_SAS_FIELD_NM = BC001J9_n902TBM43_SAS_FIELD_NM[0] ;
         A903TBM43_ODM_DATA_TYPE = BC001J9_A903TBM43_ODM_DATA_TYPE[0] ;
         n903TBM43_ODM_DATA_TYPE = BC001J9_n903TBM43_ODM_DATA_TYPE[0] ;
         A904TBM43_NOTE = BC001J9_A904TBM43_NOTE[0] ;
         n904TBM43_NOTE = BC001J9_n904TBM43_NOTE[0] ;
         A905TBM43_ORDER = BC001J9_A905TBM43_ORDER[0] ;
         n905TBM43_ORDER = BC001J9_n905TBM43_ORDER[0] ;
         A907TBM43_VERSION = BC001J9_A907TBM43_VERSION[0] ;
         n907TBM43_VERSION = BC001J9_n907TBM43_VERSION[0] ;
         A906TBM43_DEL_FLG = BC001J9_A906TBM43_DEL_FLG[0] ;
         n906TBM43_DEL_FLG = BC001J9_n906TBM43_DEL_FLG[0] ;
         A913TBM43_CRT_PROG_NM = BC001J9_A913TBM43_CRT_PROG_NM[0] ;
         n913TBM43_CRT_PROG_NM = BC001J9_n913TBM43_CRT_PROG_NM[0] ;
         A915TBM43_UPD_PROG_NM = BC001J9_A915TBM43_UPD_PROG_NM[0] ;
         n915TBM43_UPD_PROG_NM = BC001J9_n915TBM43_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1J54( )
   {
      pr_default.readNext(7);
      RcdFound54 = (short)(0) ;
      scanKeyLoad1J54( ) ;
   }

   public void scanKeyLoad1J54( )
   {
      sMode54 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A894TBM43_STUDY_ID = BC001J9_A894TBM43_STUDY_ID[0] ;
         A895TBM43_DOM_CD = BC001J9_A895TBM43_DOM_CD[0] ;
         A896TBM43_DOM_VAR_NM = BC001J9_A896TBM43_DOM_VAR_NM[0] ;
         A919TBM43_CRT_DATETIME = BC001J9_A919TBM43_CRT_DATETIME[0] ;
         n919TBM43_CRT_DATETIME = BC001J9_n919TBM43_CRT_DATETIME[0] ;
         A912TBM43_CRT_USER_ID = BC001J9_A912TBM43_CRT_USER_ID[0] ;
         n912TBM43_CRT_USER_ID = BC001J9_n912TBM43_CRT_USER_ID[0] ;
         A920TBM43_UPD_DATETIME = BC001J9_A920TBM43_UPD_DATETIME[0] ;
         n920TBM43_UPD_DATETIME = BC001J9_n920TBM43_UPD_DATETIME[0] ;
         A914TBM43_UPD_USER_ID = BC001J9_A914TBM43_UPD_USER_ID[0] ;
         n914TBM43_UPD_USER_ID = BC001J9_n914TBM43_UPD_USER_ID[0] ;
         A921TBM43_UPD_CNT = BC001J9_A921TBM43_UPD_CNT[0] ;
         n921TBM43_UPD_CNT = BC001J9_n921TBM43_UPD_CNT[0] ;
         A897TBM43_VAR_DESC = BC001J9_A897TBM43_VAR_DESC[0] ;
         n897TBM43_VAR_DESC = BC001J9_n897TBM43_VAR_DESC[0] ;
         A898TBM43_SDTM_FLG = BC001J9_A898TBM43_SDTM_FLG[0] ;
         n898TBM43_SDTM_FLG = BC001J9_n898TBM43_SDTM_FLG[0] ;
         A899TBM43_CDASH_FLG = BC001J9_A899TBM43_CDASH_FLG[0] ;
         n899TBM43_CDASH_FLG = BC001J9_n899TBM43_CDASH_FLG[0] ;
         A900TBM43_INPUT_TYPE_DIV = BC001J9_A900TBM43_INPUT_TYPE_DIV[0] ;
         n900TBM43_INPUT_TYPE_DIV = BC001J9_n900TBM43_INPUT_TYPE_DIV[0] ;
         A901TBM43_REQUIRED_FLG = BC001J9_A901TBM43_REQUIRED_FLG[0] ;
         n901TBM43_REQUIRED_FLG = BC001J9_n901TBM43_REQUIRED_FLG[0] ;
         A902TBM43_SAS_FIELD_NM = BC001J9_A902TBM43_SAS_FIELD_NM[0] ;
         n902TBM43_SAS_FIELD_NM = BC001J9_n902TBM43_SAS_FIELD_NM[0] ;
         A903TBM43_ODM_DATA_TYPE = BC001J9_A903TBM43_ODM_DATA_TYPE[0] ;
         n903TBM43_ODM_DATA_TYPE = BC001J9_n903TBM43_ODM_DATA_TYPE[0] ;
         A904TBM43_NOTE = BC001J9_A904TBM43_NOTE[0] ;
         n904TBM43_NOTE = BC001J9_n904TBM43_NOTE[0] ;
         A905TBM43_ORDER = BC001J9_A905TBM43_ORDER[0] ;
         n905TBM43_ORDER = BC001J9_n905TBM43_ORDER[0] ;
         A907TBM43_VERSION = BC001J9_A907TBM43_VERSION[0] ;
         n907TBM43_VERSION = BC001J9_n907TBM43_VERSION[0] ;
         A906TBM43_DEL_FLG = BC001J9_A906TBM43_DEL_FLG[0] ;
         n906TBM43_DEL_FLG = BC001J9_n906TBM43_DEL_FLG[0] ;
         A913TBM43_CRT_PROG_NM = BC001J9_A913TBM43_CRT_PROG_NM[0] ;
         n913TBM43_CRT_PROG_NM = BC001J9_n913TBM43_CRT_PROG_NM[0] ;
         A915TBM43_UPD_PROG_NM = BC001J9_A915TBM43_UPD_PROG_NM[0] ;
         n915TBM43_UPD_PROG_NM = BC001J9_n915TBM43_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode54 ;
   }

   public void scanKeyEnd1J54( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1J54( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J54( )
   {
      /* Before Insert Rules */
      A919TBM43_CRT_DATETIME = GXutil.now( ) ;
      n919TBM43_CRT_DATETIME = false ;
      GXt_char1 = A912TBM43_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm43_study_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A912TBM43_CRT_USER_ID = GXt_char1 ;
      n912TBM43_CRT_USER_ID = false ;
      A920TBM43_UPD_DATETIME = GXutil.now( ) ;
      n920TBM43_UPD_DATETIME = false ;
      GXt_char1 = A914TBM43_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm43_study_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A914TBM43_UPD_USER_ID = GXt_char1 ;
      n914TBM43_UPD_USER_ID = false ;
      A921TBM43_UPD_CNT = (long)(O921TBM43_UPD_CNT+1) ;
      n921TBM43_UPD_CNT = false ;
   }

   public void beforeUpdate1J54( )
   {
      /* Before Update Rules */
      A920TBM43_UPD_DATETIME = GXutil.now( ) ;
      n920TBM43_UPD_DATETIME = false ;
      GXt_char1 = A914TBM43_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm43_study_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A914TBM43_UPD_USER_ID = GXt_char1 ;
      n914TBM43_UPD_USER_ID = false ;
      A921TBM43_UPD_CNT = (long)(O921TBM43_UPD_CNT+1) ;
      n921TBM43_UPD_CNT = false ;
   }

   public void beforeDelete1J54( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J54( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J54( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J54( )
   {
   }

   public void addRow1J54( )
   {
      VarsToRow54( bcTBM43_STUDY_CDISC_ITEM) ;
   }

   public void readRow1J54( )
   {
      RowToVars54( bcTBM43_STUDY_CDISC_ITEM, 1) ;
   }

   public void initializeNonKey1J54( )
   {
      A919TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n919TBM43_CRT_DATETIME = false ;
      A912TBM43_CRT_USER_ID = "" ;
      n912TBM43_CRT_USER_ID = false ;
      A920TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n920TBM43_UPD_DATETIME = false ;
      A914TBM43_UPD_USER_ID = "" ;
      n914TBM43_UPD_USER_ID = false ;
      A921TBM43_UPD_CNT = 0 ;
      n921TBM43_UPD_CNT = false ;
      A897TBM43_VAR_DESC = "" ;
      n897TBM43_VAR_DESC = false ;
      A898TBM43_SDTM_FLG = "" ;
      n898TBM43_SDTM_FLG = false ;
      A899TBM43_CDASH_FLG = "" ;
      n899TBM43_CDASH_FLG = false ;
      A900TBM43_INPUT_TYPE_DIV = "" ;
      n900TBM43_INPUT_TYPE_DIV = false ;
      A901TBM43_REQUIRED_FLG = "" ;
      n901TBM43_REQUIRED_FLG = false ;
      A902TBM43_SAS_FIELD_NM = "" ;
      n902TBM43_SAS_FIELD_NM = false ;
      A903TBM43_ODM_DATA_TYPE = "" ;
      n903TBM43_ODM_DATA_TYPE = false ;
      A904TBM43_NOTE = "" ;
      n904TBM43_NOTE = false ;
      A905TBM43_ORDER = 0 ;
      n905TBM43_ORDER = false ;
      A907TBM43_VERSION = "" ;
      n907TBM43_VERSION = false ;
      A906TBM43_DEL_FLG = "" ;
      n906TBM43_DEL_FLG = false ;
      A913TBM43_CRT_PROG_NM = "" ;
      n913TBM43_CRT_PROG_NM = false ;
      A915TBM43_UPD_PROG_NM = "" ;
      n915TBM43_UPD_PROG_NM = false ;
      O921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
      n921TBM43_UPD_CNT = false ;
   }

   public void initAll1J54( )
   {
      A894TBM43_STUDY_ID = 0 ;
      A895TBM43_DOM_CD = "" ;
      A896TBM43_DOM_VAR_NM = "" ;
      initializeNonKey1J54( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow54( SdtTBM43_STUDY_CDISC_ITEM obj54 )
   {
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode( Gx_mode );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime( A919TBM43_CRT_DATETIME );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id( A912TBM43_CRT_USER_ID );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime( A920TBM43_UPD_DATETIME );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id( A914TBM43_UPD_USER_ID );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt( A921TBM43_UPD_CNT );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc( A897TBM43_VAR_DESC );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg( A898TBM43_SDTM_FLG );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg( A899TBM43_CDASH_FLG );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div( A900TBM43_INPUT_TYPE_DIV );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg( A901TBM43_REQUIRED_FLG );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm( A902TBM43_SAS_FIELD_NM );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type( A903TBM43_ODM_DATA_TYPE );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note( A904TBM43_NOTE );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order( A905TBM43_ORDER );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version( A907TBM43_VERSION );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg( A906TBM43_DEL_FLG );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm( A913TBM43_CRT_PROG_NM );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm( A915TBM43_UPD_PROG_NM );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id( A894TBM43_STUDY_ID );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd( A895TBM43_DOM_CD );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm( A896TBM43_DOM_VAR_NM );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z( Z894TBM43_STUDY_ID );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z( Z895TBM43_DOM_CD );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z( Z896TBM43_DOM_VAR_NM );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z( Z897TBM43_VAR_DESC );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z( Z898TBM43_SDTM_FLG );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z( Z899TBM43_CDASH_FLG );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z( Z900TBM43_INPUT_TYPE_DIV );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z( Z901TBM43_REQUIRED_FLG );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z( Z902TBM43_SAS_FIELD_NM );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z( Z903TBM43_ODM_DATA_TYPE );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z( Z904TBM43_NOTE );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z( Z905TBM43_ORDER );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z( Z907TBM43_VERSION );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z( Z906TBM43_DEL_FLG );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z( Z919TBM43_CRT_DATETIME );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z( Z912TBM43_CRT_USER_ID );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z( Z913TBM43_CRT_PROG_NM );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z( Z920TBM43_UPD_DATETIME );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z( Z914TBM43_UPD_USER_ID );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z( Z915TBM43_UPD_PROG_NM );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z( Z921TBM43_UPD_CNT );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N( (byte)((byte)((n897TBM43_VAR_DESC)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N( (byte)((byte)((n898TBM43_SDTM_FLG)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N( (byte)((byte)((n899TBM43_CDASH_FLG)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N( (byte)((byte)((n900TBM43_INPUT_TYPE_DIV)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N( (byte)((byte)((n901TBM43_REQUIRED_FLG)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N( (byte)((byte)((n902TBM43_SAS_FIELD_NM)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N( (byte)((byte)((n903TBM43_ODM_DATA_TYPE)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N( (byte)((byte)((n904TBM43_NOTE)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N( (byte)((byte)((n905TBM43_ORDER)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N( (byte)((byte)((n907TBM43_VERSION)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N( (byte)((byte)((n906TBM43_DEL_FLG)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N( (byte)((byte)((n919TBM43_CRT_DATETIME)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N( (byte)((byte)((n912TBM43_CRT_USER_ID)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N( (byte)((byte)((n913TBM43_CRT_PROG_NM)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N( (byte)((byte)((n920TBM43_UPD_DATETIME)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N( (byte)((byte)((n914TBM43_UPD_USER_ID)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N( (byte)((byte)((n915TBM43_UPD_PROG_NM)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N( (byte)((byte)((n921TBM43_UPD_CNT)?1:0)) );
      obj54.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode( Gx_mode );
   }

   public void RowToVars54( SdtTBM43_STUDY_CDISC_ITEM obj54 ,
                            int forceLoad )
   {
      Gx_mode = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode() ;
      A919TBM43_CRT_DATETIME = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime() ;
      n919TBM43_CRT_DATETIME = false ;
      A912TBM43_CRT_USER_ID = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id() ;
      n912TBM43_CRT_USER_ID = false ;
      A920TBM43_UPD_DATETIME = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime() ;
      n920TBM43_UPD_DATETIME = false ;
      A914TBM43_UPD_USER_ID = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id() ;
      n914TBM43_UPD_USER_ID = false ;
      A921TBM43_UPD_CNT = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt() ;
      n921TBM43_UPD_CNT = false ;
      A897TBM43_VAR_DESC = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc() ;
      n897TBM43_VAR_DESC = false ;
      A898TBM43_SDTM_FLG = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg() ;
      n898TBM43_SDTM_FLG = false ;
      A899TBM43_CDASH_FLG = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg() ;
      n899TBM43_CDASH_FLG = false ;
      A900TBM43_INPUT_TYPE_DIV = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div() ;
      n900TBM43_INPUT_TYPE_DIV = false ;
      A901TBM43_REQUIRED_FLG = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg() ;
      n901TBM43_REQUIRED_FLG = false ;
      A902TBM43_SAS_FIELD_NM = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm() ;
      n902TBM43_SAS_FIELD_NM = false ;
      A903TBM43_ODM_DATA_TYPE = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type() ;
      n903TBM43_ODM_DATA_TYPE = false ;
      A904TBM43_NOTE = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note() ;
      n904TBM43_NOTE = false ;
      A905TBM43_ORDER = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order() ;
      n905TBM43_ORDER = false ;
      A907TBM43_VERSION = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version() ;
      n907TBM43_VERSION = false ;
      A906TBM43_DEL_FLG = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg() ;
      n906TBM43_DEL_FLG = false ;
      A913TBM43_CRT_PROG_NM = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm() ;
      n913TBM43_CRT_PROG_NM = false ;
      A915TBM43_UPD_PROG_NM = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm() ;
      n915TBM43_UPD_PROG_NM = false ;
      A894TBM43_STUDY_ID = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id() ;
      A895TBM43_DOM_CD = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd() ;
      A896TBM43_DOM_VAR_NM = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm() ;
      Z894TBM43_STUDY_ID = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z() ;
      Z895TBM43_DOM_CD = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z() ;
      Z896TBM43_DOM_VAR_NM = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z() ;
      Z897TBM43_VAR_DESC = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z() ;
      Z898TBM43_SDTM_FLG = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z() ;
      Z899TBM43_CDASH_FLG = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z() ;
      Z900TBM43_INPUT_TYPE_DIV = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z() ;
      Z901TBM43_REQUIRED_FLG = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z() ;
      Z902TBM43_SAS_FIELD_NM = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z() ;
      Z903TBM43_ODM_DATA_TYPE = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z() ;
      Z904TBM43_NOTE = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z() ;
      Z905TBM43_ORDER = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z() ;
      Z907TBM43_VERSION = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z() ;
      Z906TBM43_DEL_FLG = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z() ;
      Z919TBM43_CRT_DATETIME = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z() ;
      Z912TBM43_CRT_USER_ID = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z() ;
      Z913TBM43_CRT_PROG_NM = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z() ;
      Z920TBM43_UPD_DATETIME = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z() ;
      Z914TBM43_UPD_USER_ID = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z() ;
      Z915TBM43_UPD_PROG_NM = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z() ;
      Z921TBM43_UPD_CNT = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z() ;
      O921TBM43_UPD_CNT = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z() ;
      n897TBM43_VAR_DESC = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N()==0)?false:true) ;
      n898TBM43_SDTM_FLG = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N()==0)?false:true) ;
      n899TBM43_CDASH_FLG = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N()==0)?false:true) ;
      n900TBM43_INPUT_TYPE_DIV = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N()==0)?false:true) ;
      n901TBM43_REQUIRED_FLG = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N()==0)?false:true) ;
      n902TBM43_SAS_FIELD_NM = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N()==0)?false:true) ;
      n903TBM43_ODM_DATA_TYPE = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N()==0)?false:true) ;
      n904TBM43_NOTE = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N()==0)?false:true) ;
      n905TBM43_ORDER = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N()==0)?false:true) ;
      n907TBM43_VERSION = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N()==0)?false:true) ;
      n906TBM43_DEL_FLG = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N()==0)?false:true) ;
      n919TBM43_CRT_DATETIME = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N()==0)?false:true) ;
      n912TBM43_CRT_USER_ID = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N()==0)?false:true) ;
      n913TBM43_CRT_PROG_NM = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N()==0)?false:true) ;
      n920TBM43_UPD_DATETIME = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N()==0)?false:true) ;
      n914TBM43_UPD_USER_ID = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N()==0)?false:true) ;
      n915TBM43_UPD_PROG_NM = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N()==0)?false:true) ;
      n921TBM43_UPD_CNT = (boolean)((obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj54.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A894TBM43_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A895TBM43_DOM_CD = (String)getParm(obj,1) ;
      A896TBM43_DOM_VAR_NM = (String)getParm(obj,2) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1J54( ) ;
      scanKeyStart1J54( ) ;
      if ( RcdFound54 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z894TBM43_STUDY_ID = A894TBM43_STUDY_ID ;
         Z895TBM43_DOM_CD = A895TBM43_DOM_CD ;
         Z896TBM43_DOM_VAR_NM = A896TBM43_DOM_VAR_NM ;
         O921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
         n921TBM43_UPD_CNT = false ;
      }
      zm1J54( -8) ;
      sMode54 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1J54( ) ;
      Gx_mode = sMode54 ;
      addRow1J54( ) ;
      scanKeyEnd1J54( ) ;
      if ( RcdFound54 == 0 )
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
      RowToVars54( bcTBM43_STUDY_CDISC_ITEM, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1J54( ) ;
      if ( RcdFound54 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A894TBM43_STUDY_ID != Z894TBM43_STUDY_ID ) || ( GXutil.strcmp(A895TBM43_DOM_CD, Z895TBM43_DOM_CD) != 0 ) || ( GXutil.strcmp(A896TBM43_DOM_VAR_NM, Z896TBM43_DOM_VAR_NM) != 0 ) )
         {
            A894TBM43_STUDY_ID = Z894TBM43_STUDY_ID ;
            A895TBM43_DOM_CD = Z895TBM43_DOM_CD ;
            A896TBM43_DOM_VAR_NM = Z896TBM43_DOM_VAR_NM ;
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
            update1J54( ) ;
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
            if ( ( A894TBM43_STUDY_ID != Z894TBM43_STUDY_ID ) || ( GXutil.strcmp(A895TBM43_DOM_CD, Z895TBM43_DOM_CD) != 0 ) || ( GXutil.strcmp(A896TBM43_DOM_VAR_NM, Z896TBM43_DOM_VAR_NM) != 0 ) )
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
                  insert1J54( ) ;
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
                  insert1J54( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow54( bcTBM43_STUDY_CDISC_ITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars54( bcTBM43_STUDY_CDISC_ITEM, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1J54( ) ;
      if ( RcdFound54 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A894TBM43_STUDY_ID != Z894TBM43_STUDY_ID ) || ( GXutil.strcmp(A895TBM43_DOM_CD, Z895TBM43_DOM_CD) != 0 ) || ( GXutil.strcmp(A896TBM43_DOM_VAR_NM, Z896TBM43_DOM_VAR_NM) != 0 ) )
         {
            A894TBM43_STUDY_ID = Z894TBM43_STUDY_ID ;
            A895TBM43_DOM_CD = Z895TBM43_DOM_CD ;
            A896TBM43_DOM_VAR_NM = Z896TBM43_DOM_VAR_NM ;
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
         if ( ( A894TBM43_STUDY_ID != Z894TBM43_STUDY_ID ) || ( GXutil.strcmp(A895TBM43_DOM_CD, Z895TBM43_DOM_CD) != 0 ) || ( GXutil.strcmp(A896TBM43_DOM_VAR_NM, Z896TBM43_DOM_VAR_NM) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm43_study_cdisc_item_bc");
      VarsToRow54( bcTBM43_STUDY_CDISC_ITEM) ;
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
      Gx_mode = bcTBM43_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM43_STUDY_CDISC_ITEM sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM43_STUDY_CDISC_ITEM )
      {
         bcTBM43_STUDY_CDISC_ITEM = sdt ;
         if ( GXutil.strcmp(bcTBM43_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode(), "") == 0 )
         {
            bcTBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow54( bcTBM43_STUDY_CDISC_ITEM) ;
         }
         else
         {
            RowToVars54( bcTBM43_STUDY_CDISC_ITEM, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM43_STUDY_CDISC_ITEM.getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode(), "") == 0 )
         {
            bcTBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars54( bcTBM43_STUDY_CDISC_ITEM, 1) ;
   }

   public SdtTBM43_STUDY_CDISC_ITEM getTBM43_STUDY_CDISC_ITEM_BC( )
   {
      return bcTBM43_STUDY_CDISC_ITEM ;
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
                  /* Execute user subroutine: S1172 */
                  S1172 ();
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
      Z895TBM43_DOM_CD = "" ;
      A895TBM43_DOM_CD = "" ;
      Z896TBM43_DOM_VAR_NM = "" ;
      A896TBM43_DOM_VAR_NM = "" ;
      AV7W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV8W_TXT = "" ;
      A897TBM43_VAR_DESC = "" ;
      A898TBM43_SDTM_FLG = "" ;
      A899TBM43_CDASH_FLG = "" ;
      A900TBM43_INPUT_TYPE_DIV = "" ;
      A901TBM43_REQUIRED_FLG = "" ;
      A902TBM43_SAS_FIELD_NM = "" ;
      A904TBM43_NOTE = "" ;
      A906TBM43_DEL_FLG = "" ;
      A919TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A912TBM43_CRT_USER_ID = "" ;
      A913TBM43_CRT_PROG_NM = "" ;
      A920TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A914TBM43_UPD_USER_ID = "" ;
      A915TBM43_UPD_PROG_NM = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z = "" ;
      Z919TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z912TBM43_CRT_USER_ID = "" ;
      Z920TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z914TBM43_UPD_USER_ID = "" ;
      Z897TBM43_VAR_DESC = "" ;
      Z898TBM43_SDTM_FLG = "" ;
      Z899TBM43_CDASH_FLG = "" ;
      Z900TBM43_INPUT_TYPE_DIV = "" ;
      Z901TBM43_REQUIRED_FLG = "" ;
      Z902TBM43_SAS_FIELD_NM = "" ;
      Z903TBM43_ODM_DATA_TYPE = "" ;
      A903TBM43_ODM_DATA_TYPE = "" ;
      Z904TBM43_NOTE = "" ;
      Z907TBM43_VERSION = "" ;
      A907TBM43_VERSION = "" ;
      Z906TBM43_DEL_FLG = "" ;
      Z913TBM43_CRT_PROG_NM = "" ;
      Z915TBM43_UPD_PROG_NM = "" ;
      BC001J4_A894TBM43_STUDY_ID = new long[1] ;
      BC001J4_A895TBM43_DOM_CD = new String[] {""} ;
      BC001J4_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      BC001J4_A919TBM43_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001J4_n919TBM43_CRT_DATETIME = new boolean[] {false} ;
      BC001J4_A912TBM43_CRT_USER_ID = new String[] {""} ;
      BC001J4_n912TBM43_CRT_USER_ID = new boolean[] {false} ;
      BC001J4_A920TBM43_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001J4_n920TBM43_UPD_DATETIME = new boolean[] {false} ;
      BC001J4_A914TBM43_UPD_USER_ID = new String[] {""} ;
      BC001J4_n914TBM43_UPD_USER_ID = new boolean[] {false} ;
      BC001J4_A921TBM43_UPD_CNT = new long[1] ;
      BC001J4_n921TBM43_UPD_CNT = new boolean[] {false} ;
      BC001J4_A897TBM43_VAR_DESC = new String[] {""} ;
      BC001J4_n897TBM43_VAR_DESC = new boolean[] {false} ;
      BC001J4_A898TBM43_SDTM_FLG = new String[] {""} ;
      BC001J4_n898TBM43_SDTM_FLG = new boolean[] {false} ;
      BC001J4_A899TBM43_CDASH_FLG = new String[] {""} ;
      BC001J4_n899TBM43_CDASH_FLG = new boolean[] {false} ;
      BC001J4_A900TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      BC001J4_n900TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC001J4_A901TBM43_REQUIRED_FLG = new String[] {""} ;
      BC001J4_n901TBM43_REQUIRED_FLG = new boolean[] {false} ;
      BC001J4_A902TBM43_SAS_FIELD_NM = new String[] {""} ;
      BC001J4_n902TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      BC001J4_A903TBM43_ODM_DATA_TYPE = new String[] {""} ;
      BC001J4_n903TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      BC001J4_A904TBM43_NOTE = new String[] {""} ;
      BC001J4_n904TBM43_NOTE = new boolean[] {false} ;
      BC001J4_A905TBM43_ORDER = new int[1] ;
      BC001J4_n905TBM43_ORDER = new boolean[] {false} ;
      BC001J4_A907TBM43_VERSION = new String[] {""} ;
      BC001J4_n907TBM43_VERSION = new boolean[] {false} ;
      BC001J4_A906TBM43_DEL_FLG = new String[] {""} ;
      BC001J4_n906TBM43_DEL_FLG = new boolean[] {false} ;
      BC001J4_A913TBM43_CRT_PROG_NM = new String[] {""} ;
      BC001J4_n913TBM43_CRT_PROG_NM = new boolean[] {false} ;
      BC001J4_A915TBM43_UPD_PROG_NM = new String[] {""} ;
      BC001J4_n915TBM43_UPD_PROG_NM = new boolean[] {false} ;
      BC001J5_A894TBM43_STUDY_ID = new long[1] ;
      BC001J5_A895TBM43_DOM_CD = new String[] {""} ;
      BC001J5_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      BC001J3_A894TBM43_STUDY_ID = new long[1] ;
      BC001J3_A895TBM43_DOM_CD = new String[] {""} ;
      BC001J3_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      BC001J3_A919TBM43_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001J3_n919TBM43_CRT_DATETIME = new boolean[] {false} ;
      BC001J3_A912TBM43_CRT_USER_ID = new String[] {""} ;
      BC001J3_n912TBM43_CRT_USER_ID = new boolean[] {false} ;
      BC001J3_A920TBM43_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001J3_n920TBM43_UPD_DATETIME = new boolean[] {false} ;
      BC001J3_A914TBM43_UPD_USER_ID = new String[] {""} ;
      BC001J3_n914TBM43_UPD_USER_ID = new boolean[] {false} ;
      BC001J3_A921TBM43_UPD_CNT = new long[1] ;
      BC001J3_n921TBM43_UPD_CNT = new boolean[] {false} ;
      BC001J3_A897TBM43_VAR_DESC = new String[] {""} ;
      BC001J3_n897TBM43_VAR_DESC = new boolean[] {false} ;
      BC001J3_A898TBM43_SDTM_FLG = new String[] {""} ;
      BC001J3_n898TBM43_SDTM_FLG = new boolean[] {false} ;
      BC001J3_A899TBM43_CDASH_FLG = new String[] {""} ;
      BC001J3_n899TBM43_CDASH_FLG = new boolean[] {false} ;
      BC001J3_A900TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      BC001J3_n900TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC001J3_A901TBM43_REQUIRED_FLG = new String[] {""} ;
      BC001J3_n901TBM43_REQUIRED_FLG = new boolean[] {false} ;
      BC001J3_A902TBM43_SAS_FIELD_NM = new String[] {""} ;
      BC001J3_n902TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      BC001J3_A903TBM43_ODM_DATA_TYPE = new String[] {""} ;
      BC001J3_n903TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      BC001J3_A904TBM43_NOTE = new String[] {""} ;
      BC001J3_n904TBM43_NOTE = new boolean[] {false} ;
      BC001J3_A905TBM43_ORDER = new int[1] ;
      BC001J3_n905TBM43_ORDER = new boolean[] {false} ;
      BC001J3_A907TBM43_VERSION = new String[] {""} ;
      BC001J3_n907TBM43_VERSION = new boolean[] {false} ;
      BC001J3_A906TBM43_DEL_FLG = new String[] {""} ;
      BC001J3_n906TBM43_DEL_FLG = new boolean[] {false} ;
      BC001J3_A913TBM43_CRT_PROG_NM = new String[] {""} ;
      BC001J3_n913TBM43_CRT_PROG_NM = new boolean[] {false} ;
      BC001J3_A915TBM43_UPD_PROG_NM = new String[] {""} ;
      BC001J3_n915TBM43_UPD_PROG_NM = new boolean[] {false} ;
      sMode54 = "" ;
      BC001J2_A894TBM43_STUDY_ID = new long[1] ;
      BC001J2_A895TBM43_DOM_CD = new String[] {""} ;
      BC001J2_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      BC001J2_A919TBM43_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001J2_n919TBM43_CRT_DATETIME = new boolean[] {false} ;
      BC001J2_A912TBM43_CRT_USER_ID = new String[] {""} ;
      BC001J2_n912TBM43_CRT_USER_ID = new boolean[] {false} ;
      BC001J2_A920TBM43_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001J2_n920TBM43_UPD_DATETIME = new boolean[] {false} ;
      BC001J2_A914TBM43_UPD_USER_ID = new String[] {""} ;
      BC001J2_n914TBM43_UPD_USER_ID = new boolean[] {false} ;
      BC001J2_A921TBM43_UPD_CNT = new long[1] ;
      BC001J2_n921TBM43_UPD_CNT = new boolean[] {false} ;
      BC001J2_A897TBM43_VAR_DESC = new String[] {""} ;
      BC001J2_n897TBM43_VAR_DESC = new boolean[] {false} ;
      BC001J2_A898TBM43_SDTM_FLG = new String[] {""} ;
      BC001J2_n898TBM43_SDTM_FLG = new boolean[] {false} ;
      BC001J2_A899TBM43_CDASH_FLG = new String[] {""} ;
      BC001J2_n899TBM43_CDASH_FLG = new boolean[] {false} ;
      BC001J2_A900TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      BC001J2_n900TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC001J2_A901TBM43_REQUIRED_FLG = new String[] {""} ;
      BC001J2_n901TBM43_REQUIRED_FLG = new boolean[] {false} ;
      BC001J2_A902TBM43_SAS_FIELD_NM = new String[] {""} ;
      BC001J2_n902TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      BC001J2_A903TBM43_ODM_DATA_TYPE = new String[] {""} ;
      BC001J2_n903TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      BC001J2_A904TBM43_NOTE = new String[] {""} ;
      BC001J2_n904TBM43_NOTE = new boolean[] {false} ;
      BC001J2_A905TBM43_ORDER = new int[1] ;
      BC001J2_n905TBM43_ORDER = new boolean[] {false} ;
      BC001J2_A907TBM43_VERSION = new String[] {""} ;
      BC001J2_n907TBM43_VERSION = new boolean[] {false} ;
      BC001J2_A906TBM43_DEL_FLG = new String[] {""} ;
      BC001J2_n906TBM43_DEL_FLG = new boolean[] {false} ;
      BC001J2_A913TBM43_CRT_PROG_NM = new String[] {""} ;
      BC001J2_n913TBM43_CRT_PROG_NM = new boolean[] {false} ;
      BC001J2_A915TBM43_UPD_PROG_NM = new String[] {""} ;
      BC001J2_n915TBM43_UPD_PROG_NM = new boolean[] {false} ;
      BC001J9_A894TBM43_STUDY_ID = new long[1] ;
      BC001J9_A895TBM43_DOM_CD = new String[] {""} ;
      BC001J9_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      BC001J9_A919TBM43_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001J9_n919TBM43_CRT_DATETIME = new boolean[] {false} ;
      BC001J9_A912TBM43_CRT_USER_ID = new String[] {""} ;
      BC001J9_n912TBM43_CRT_USER_ID = new boolean[] {false} ;
      BC001J9_A920TBM43_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001J9_n920TBM43_UPD_DATETIME = new boolean[] {false} ;
      BC001J9_A914TBM43_UPD_USER_ID = new String[] {""} ;
      BC001J9_n914TBM43_UPD_USER_ID = new boolean[] {false} ;
      BC001J9_A921TBM43_UPD_CNT = new long[1] ;
      BC001J9_n921TBM43_UPD_CNT = new boolean[] {false} ;
      BC001J9_A897TBM43_VAR_DESC = new String[] {""} ;
      BC001J9_n897TBM43_VAR_DESC = new boolean[] {false} ;
      BC001J9_A898TBM43_SDTM_FLG = new String[] {""} ;
      BC001J9_n898TBM43_SDTM_FLG = new boolean[] {false} ;
      BC001J9_A899TBM43_CDASH_FLG = new String[] {""} ;
      BC001J9_n899TBM43_CDASH_FLG = new boolean[] {false} ;
      BC001J9_A900TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      BC001J9_n900TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC001J9_A901TBM43_REQUIRED_FLG = new String[] {""} ;
      BC001J9_n901TBM43_REQUIRED_FLG = new boolean[] {false} ;
      BC001J9_A902TBM43_SAS_FIELD_NM = new String[] {""} ;
      BC001J9_n902TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      BC001J9_A903TBM43_ODM_DATA_TYPE = new String[] {""} ;
      BC001J9_n903TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      BC001J9_A904TBM43_NOTE = new String[] {""} ;
      BC001J9_n904TBM43_NOTE = new boolean[] {false} ;
      BC001J9_A905TBM43_ORDER = new int[1] ;
      BC001J9_n905TBM43_ORDER = new boolean[] {false} ;
      BC001J9_A907TBM43_VERSION = new String[] {""} ;
      BC001J9_n907TBM43_VERSION = new boolean[] {false} ;
      BC001J9_A906TBM43_DEL_FLG = new String[] {""} ;
      BC001J9_n906TBM43_DEL_FLG = new boolean[] {false} ;
      BC001J9_A913TBM43_CRT_PROG_NM = new String[] {""} ;
      BC001J9_n913TBM43_CRT_PROG_NM = new boolean[] {false} ;
      BC001J9_A915TBM43_UPD_PROG_NM = new String[] {""} ;
      BC001J9_n915TBM43_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm43_study_cdisc_item_bc__default(),
         new Object[] {
             new Object[] {
            BC001J2_A894TBM43_STUDY_ID, BC001J2_A895TBM43_DOM_CD, BC001J2_A896TBM43_DOM_VAR_NM, BC001J2_A919TBM43_CRT_DATETIME, BC001J2_n919TBM43_CRT_DATETIME, BC001J2_A912TBM43_CRT_USER_ID, BC001J2_n912TBM43_CRT_USER_ID, BC001J2_A920TBM43_UPD_DATETIME, BC001J2_n920TBM43_UPD_DATETIME, BC001J2_A914TBM43_UPD_USER_ID,
            BC001J2_n914TBM43_UPD_USER_ID, BC001J2_A921TBM43_UPD_CNT, BC001J2_n921TBM43_UPD_CNT, BC001J2_A897TBM43_VAR_DESC, BC001J2_n897TBM43_VAR_DESC, BC001J2_A898TBM43_SDTM_FLG, BC001J2_n898TBM43_SDTM_FLG, BC001J2_A899TBM43_CDASH_FLG, BC001J2_n899TBM43_CDASH_FLG, BC001J2_A900TBM43_INPUT_TYPE_DIV,
            BC001J2_n900TBM43_INPUT_TYPE_DIV, BC001J2_A901TBM43_REQUIRED_FLG, BC001J2_n901TBM43_REQUIRED_FLG, BC001J2_A902TBM43_SAS_FIELD_NM, BC001J2_n902TBM43_SAS_FIELD_NM, BC001J2_A903TBM43_ODM_DATA_TYPE, BC001J2_n903TBM43_ODM_DATA_TYPE, BC001J2_A904TBM43_NOTE, BC001J2_n904TBM43_NOTE, BC001J2_A905TBM43_ORDER,
            BC001J2_n905TBM43_ORDER, BC001J2_A907TBM43_VERSION, BC001J2_n907TBM43_VERSION, BC001J2_A906TBM43_DEL_FLG, BC001J2_n906TBM43_DEL_FLG, BC001J2_A913TBM43_CRT_PROG_NM, BC001J2_n913TBM43_CRT_PROG_NM, BC001J2_A915TBM43_UPD_PROG_NM, BC001J2_n915TBM43_UPD_PROG_NM
            }
            , new Object[] {
            BC001J3_A894TBM43_STUDY_ID, BC001J3_A895TBM43_DOM_CD, BC001J3_A896TBM43_DOM_VAR_NM, BC001J3_A919TBM43_CRT_DATETIME, BC001J3_n919TBM43_CRT_DATETIME, BC001J3_A912TBM43_CRT_USER_ID, BC001J3_n912TBM43_CRT_USER_ID, BC001J3_A920TBM43_UPD_DATETIME, BC001J3_n920TBM43_UPD_DATETIME, BC001J3_A914TBM43_UPD_USER_ID,
            BC001J3_n914TBM43_UPD_USER_ID, BC001J3_A921TBM43_UPD_CNT, BC001J3_n921TBM43_UPD_CNT, BC001J3_A897TBM43_VAR_DESC, BC001J3_n897TBM43_VAR_DESC, BC001J3_A898TBM43_SDTM_FLG, BC001J3_n898TBM43_SDTM_FLG, BC001J3_A899TBM43_CDASH_FLG, BC001J3_n899TBM43_CDASH_FLG, BC001J3_A900TBM43_INPUT_TYPE_DIV,
            BC001J3_n900TBM43_INPUT_TYPE_DIV, BC001J3_A901TBM43_REQUIRED_FLG, BC001J3_n901TBM43_REQUIRED_FLG, BC001J3_A902TBM43_SAS_FIELD_NM, BC001J3_n902TBM43_SAS_FIELD_NM, BC001J3_A903TBM43_ODM_DATA_TYPE, BC001J3_n903TBM43_ODM_DATA_TYPE, BC001J3_A904TBM43_NOTE, BC001J3_n904TBM43_NOTE, BC001J3_A905TBM43_ORDER,
            BC001J3_n905TBM43_ORDER, BC001J3_A907TBM43_VERSION, BC001J3_n907TBM43_VERSION, BC001J3_A906TBM43_DEL_FLG, BC001J3_n906TBM43_DEL_FLG, BC001J3_A913TBM43_CRT_PROG_NM, BC001J3_n913TBM43_CRT_PROG_NM, BC001J3_A915TBM43_UPD_PROG_NM, BC001J3_n915TBM43_UPD_PROG_NM
            }
            , new Object[] {
            BC001J4_A894TBM43_STUDY_ID, BC001J4_A895TBM43_DOM_CD, BC001J4_A896TBM43_DOM_VAR_NM, BC001J4_A919TBM43_CRT_DATETIME, BC001J4_n919TBM43_CRT_DATETIME, BC001J4_A912TBM43_CRT_USER_ID, BC001J4_n912TBM43_CRT_USER_ID, BC001J4_A920TBM43_UPD_DATETIME, BC001J4_n920TBM43_UPD_DATETIME, BC001J4_A914TBM43_UPD_USER_ID,
            BC001J4_n914TBM43_UPD_USER_ID, BC001J4_A921TBM43_UPD_CNT, BC001J4_n921TBM43_UPD_CNT, BC001J4_A897TBM43_VAR_DESC, BC001J4_n897TBM43_VAR_DESC, BC001J4_A898TBM43_SDTM_FLG, BC001J4_n898TBM43_SDTM_FLG, BC001J4_A899TBM43_CDASH_FLG, BC001J4_n899TBM43_CDASH_FLG, BC001J4_A900TBM43_INPUT_TYPE_DIV,
            BC001J4_n900TBM43_INPUT_TYPE_DIV, BC001J4_A901TBM43_REQUIRED_FLG, BC001J4_n901TBM43_REQUIRED_FLG, BC001J4_A902TBM43_SAS_FIELD_NM, BC001J4_n902TBM43_SAS_FIELD_NM, BC001J4_A903TBM43_ODM_DATA_TYPE, BC001J4_n903TBM43_ODM_DATA_TYPE, BC001J4_A904TBM43_NOTE, BC001J4_n904TBM43_NOTE, BC001J4_A905TBM43_ORDER,
            BC001J4_n905TBM43_ORDER, BC001J4_A907TBM43_VERSION, BC001J4_n907TBM43_VERSION, BC001J4_A906TBM43_DEL_FLG, BC001J4_n906TBM43_DEL_FLG, BC001J4_A913TBM43_CRT_PROG_NM, BC001J4_n913TBM43_CRT_PROG_NM, BC001J4_A915TBM43_UPD_PROG_NM, BC001J4_n915TBM43_UPD_PROG_NM
            }
            , new Object[] {
            BC001J5_A894TBM43_STUDY_ID, BC001J5_A895TBM43_DOM_CD, BC001J5_A896TBM43_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001J9_A894TBM43_STUDY_ID, BC001J9_A895TBM43_DOM_CD, BC001J9_A896TBM43_DOM_VAR_NM, BC001J9_A919TBM43_CRT_DATETIME, BC001J9_n919TBM43_CRT_DATETIME, BC001J9_A912TBM43_CRT_USER_ID, BC001J9_n912TBM43_CRT_USER_ID, BC001J9_A920TBM43_UPD_DATETIME, BC001J9_n920TBM43_UPD_DATETIME, BC001J9_A914TBM43_UPD_USER_ID,
            BC001J9_n914TBM43_UPD_USER_ID, BC001J9_A921TBM43_UPD_CNT, BC001J9_n921TBM43_UPD_CNT, BC001J9_A897TBM43_VAR_DESC, BC001J9_n897TBM43_VAR_DESC, BC001J9_A898TBM43_SDTM_FLG, BC001J9_n898TBM43_SDTM_FLG, BC001J9_A899TBM43_CDASH_FLG, BC001J9_n899TBM43_CDASH_FLG, BC001J9_A900TBM43_INPUT_TYPE_DIV,
            BC001J9_n900TBM43_INPUT_TYPE_DIV, BC001J9_A901TBM43_REQUIRED_FLG, BC001J9_n901TBM43_REQUIRED_FLG, BC001J9_A902TBM43_SAS_FIELD_NM, BC001J9_n902TBM43_SAS_FIELD_NM, BC001J9_A903TBM43_ODM_DATA_TYPE, BC001J9_n903TBM43_ODM_DATA_TYPE, BC001J9_A904TBM43_NOTE, BC001J9_n904TBM43_NOTE, BC001J9_A905TBM43_ORDER,
            BC001J9_n905TBM43_ORDER, BC001J9_A907TBM43_VERSION, BC001J9_n907TBM43_VERSION, BC001J9_A906TBM43_DEL_FLG, BC001J9_n906TBM43_DEL_FLG, BC001J9_A913TBM43_CRT_PROG_NM, BC001J9_n913TBM43_CRT_PROG_NM, BC001J9_A915TBM43_UPD_PROG_NM, BC001J9_n915TBM43_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM43_STUDY_CDISC_ITEM_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e111J2 */
      e111J2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound54 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A905TBM43_ORDER ;
   private int gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z ;
   private int GX_JID ;
   private int Z905TBM43_ORDER ;
   private int GXActiveErrHndl ;
   private long Z894TBM43_STUDY_ID ;
   private long A894TBM43_STUDY_ID ;
   private long A921TBM43_UPD_CNT ;
   private long gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z ;
   private long gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z ;
   private long Z921TBM43_UPD_CNT ;
   private long O921TBM43_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode54 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A919TBM43_CRT_DATETIME ;
   private java.util.Date A920TBM43_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z ;
   private java.util.Date Z919TBM43_CRT_DATETIME ;
   private java.util.Date Z920TBM43_UPD_DATETIME ;
   private boolean n919TBM43_CRT_DATETIME ;
   private boolean n912TBM43_CRT_USER_ID ;
   private boolean n920TBM43_UPD_DATETIME ;
   private boolean n914TBM43_UPD_USER_ID ;
   private boolean n921TBM43_UPD_CNT ;
   private boolean n897TBM43_VAR_DESC ;
   private boolean n898TBM43_SDTM_FLG ;
   private boolean n899TBM43_CDASH_FLG ;
   private boolean n900TBM43_INPUT_TYPE_DIV ;
   private boolean n901TBM43_REQUIRED_FLG ;
   private boolean n902TBM43_SAS_FIELD_NM ;
   private boolean n903TBM43_ODM_DATA_TYPE ;
   private boolean n904TBM43_NOTE ;
   private boolean n905TBM43_ORDER ;
   private boolean n907TBM43_VERSION ;
   private boolean n906TBM43_DEL_FLG ;
   private boolean n913TBM43_CRT_PROG_NM ;
   private boolean n915TBM43_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z895TBM43_DOM_CD ;
   private String A895TBM43_DOM_CD ;
   private String Z896TBM43_DOM_VAR_NM ;
   private String A896TBM43_DOM_VAR_NM ;
   private String AV7W_BC_FLG ;
   private String AV8W_TXT ;
   private String A897TBM43_VAR_DESC ;
   private String A898TBM43_SDTM_FLG ;
   private String A899TBM43_CDASH_FLG ;
   private String A900TBM43_INPUT_TYPE_DIV ;
   private String A901TBM43_REQUIRED_FLG ;
   private String A902TBM43_SAS_FIELD_NM ;
   private String A904TBM43_NOTE ;
   private String A906TBM43_DEL_FLG ;
   private String A912TBM43_CRT_USER_ID ;
   private String A913TBM43_CRT_PROG_NM ;
   private String A914TBM43_UPD_USER_ID ;
   private String A915TBM43_UPD_PROG_NM ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z ;
   private String Z912TBM43_CRT_USER_ID ;
   private String Z914TBM43_UPD_USER_ID ;
   private String Z897TBM43_VAR_DESC ;
   private String Z898TBM43_SDTM_FLG ;
   private String Z899TBM43_CDASH_FLG ;
   private String Z900TBM43_INPUT_TYPE_DIV ;
   private String Z901TBM43_REQUIRED_FLG ;
   private String Z902TBM43_SAS_FIELD_NM ;
   private String Z903TBM43_ODM_DATA_TYPE ;
   private String A903TBM43_ODM_DATA_TYPE ;
   private String Z904TBM43_NOTE ;
   private String Z907TBM43_VERSION ;
   private String A907TBM43_VERSION ;
   private String Z906TBM43_DEL_FLG ;
   private String Z913TBM43_CRT_PROG_NM ;
   private String Z915TBM43_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM43_STUDY_CDISC_ITEM bcTBM43_STUDY_CDISC_ITEM ;
   private IDataStoreProvider pr_default ;
   private long[] BC001J4_A894TBM43_STUDY_ID ;
   private String[] BC001J4_A895TBM43_DOM_CD ;
   private String[] BC001J4_A896TBM43_DOM_VAR_NM ;
   private java.util.Date[] BC001J4_A919TBM43_CRT_DATETIME ;
   private boolean[] BC001J4_n919TBM43_CRT_DATETIME ;
   private String[] BC001J4_A912TBM43_CRT_USER_ID ;
   private boolean[] BC001J4_n912TBM43_CRT_USER_ID ;
   private java.util.Date[] BC001J4_A920TBM43_UPD_DATETIME ;
   private boolean[] BC001J4_n920TBM43_UPD_DATETIME ;
   private String[] BC001J4_A914TBM43_UPD_USER_ID ;
   private boolean[] BC001J4_n914TBM43_UPD_USER_ID ;
   private long[] BC001J4_A921TBM43_UPD_CNT ;
   private boolean[] BC001J4_n921TBM43_UPD_CNT ;
   private String[] BC001J4_A897TBM43_VAR_DESC ;
   private boolean[] BC001J4_n897TBM43_VAR_DESC ;
   private String[] BC001J4_A898TBM43_SDTM_FLG ;
   private boolean[] BC001J4_n898TBM43_SDTM_FLG ;
   private String[] BC001J4_A899TBM43_CDASH_FLG ;
   private boolean[] BC001J4_n899TBM43_CDASH_FLG ;
   private String[] BC001J4_A900TBM43_INPUT_TYPE_DIV ;
   private boolean[] BC001J4_n900TBM43_INPUT_TYPE_DIV ;
   private String[] BC001J4_A901TBM43_REQUIRED_FLG ;
   private boolean[] BC001J4_n901TBM43_REQUIRED_FLG ;
   private String[] BC001J4_A902TBM43_SAS_FIELD_NM ;
   private boolean[] BC001J4_n902TBM43_SAS_FIELD_NM ;
   private String[] BC001J4_A903TBM43_ODM_DATA_TYPE ;
   private boolean[] BC001J4_n903TBM43_ODM_DATA_TYPE ;
   private String[] BC001J4_A904TBM43_NOTE ;
   private boolean[] BC001J4_n904TBM43_NOTE ;
   private int[] BC001J4_A905TBM43_ORDER ;
   private boolean[] BC001J4_n905TBM43_ORDER ;
   private String[] BC001J4_A907TBM43_VERSION ;
   private boolean[] BC001J4_n907TBM43_VERSION ;
   private String[] BC001J4_A906TBM43_DEL_FLG ;
   private boolean[] BC001J4_n906TBM43_DEL_FLG ;
   private String[] BC001J4_A913TBM43_CRT_PROG_NM ;
   private boolean[] BC001J4_n913TBM43_CRT_PROG_NM ;
   private String[] BC001J4_A915TBM43_UPD_PROG_NM ;
   private boolean[] BC001J4_n915TBM43_UPD_PROG_NM ;
   private long[] BC001J5_A894TBM43_STUDY_ID ;
   private String[] BC001J5_A895TBM43_DOM_CD ;
   private String[] BC001J5_A896TBM43_DOM_VAR_NM ;
   private long[] BC001J3_A894TBM43_STUDY_ID ;
   private String[] BC001J3_A895TBM43_DOM_CD ;
   private String[] BC001J3_A896TBM43_DOM_VAR_NM ;
   private java.util.Date[] BC001J3_A919TBM43_CRT_DATETIME ;
   private boolean[] BC001J3_n919TBM43_CRT_DATETIME ;
   private String[] BC001J3_A912TBM43_CRT_USER_ID ;
   private boolean[] BC001J3_n912TBM43_CRT_USER_ID ;
   private java.util.Date[] BC001J3_A920TBM43_UPD_DATETIME ;
   private boolean[] BC001J3_n920TBM43_UPD_DATETIME ;
   private String[] BC001J3_A914TBM43_UPD_USER_ID ;
   private boolean[] BC001J3_n914TBM43_UPD_USER_ID ;
   private long[] BC001J3_A921TBM43_UPD_CNT ;
   private boolean[] BC001J3_n921TBM43_UPD_CNT ;
   private String[] BC001J3_A897TBM43_VAR_DESC ;
   private boolean[] BC001J3_n897TBM43_VAR_DESC ;
   private String[] BC001J3_A898TBM43_SDTM_FLG ;
   private boolean[] BC001J3_n898TBM43_SDTM_FLG ;
   private String[] BC001J3_A899TBM43_CDASH_FLG ;
   private boolean[] BC001J3_n899TBM43_CDASH_FLG ;
   private String[] BC001J3_A900TBM43_INPUT_TYPE_DIV ;
   private boolean[] BC001J3_n900TBM43_INPUT_TYPE_DIV ;
   private String[] BC001J3_A901TBM43_REQUIRED_FLG ;
   private boolean[] BC001J3_n901TBM43_REQUIRED_FLG ;
   private String[] BC001J3_A902TBM43_SAS_FIELD_NM ;
   private boolean[] BC001J3_n902TBM43_SAS_FIELD_NM ;
   private String[] BC001J3_A903TBM43_ODM_DATA_TYPE ;
   private boolean[] BC001J3_n903TBM43_ODM_DATA_TYPE ;
   private String[] BC001J3_A904TBM43_NOTE ;
   private boolean[] BC001J3_n904TBM43_NOTE ;
   private int[] BC001J3_A905TBM43_ORDER ;
   private boolean[] BC001J3_n905TBM43_ORDER ;
   private String[] BC001J3_A907TBM43_VERSION ;
   private boolean[] BC001J3_n907TBM43_VERSION ;
   private String[] BC001J3_A906TBM43_DEL_FLG ;
   private boolean[] BC001J3_n906TBM43_DEL_FLG ;
   private String[] BC001J3_A913TBM43_CRT_PROG_NM ;
   private boolean[] BC001J3_n913TBM43_CRT_PROG_NM ;
   private String[] BC001J3_A915TBM43_UPD_PROG_NM ;
   private boolean[] BC001J3_n915TBM43_UPD_PROG_NM ;
   private long[] BC001J2_A894TBM43_STUDY_ID ;
   private String[] BC001J2_A895TBM43_DOM_CD ;
   private String[] BC001J2_A896TBM43_DOM_VAR_NM ;
   private java.util.Date[] BC001J2_A919TBM43_CRT_DATETIME ;
   private boolean[] BC001J2_n919TBM43_CRT_DATETIME ;
   private String[] BC001J2_A912TBM43_CRT_USER_ID ;
   private boolean[] BC001J2_n912TBM43_CRT_USER_ID ;
   private java.util.Date[] BC001J2_A920TBM43_UPD_DATETIME ;
   private boolean[] BC001J2_n920TBM43_UPD_DATETIME ;
   private String[] BC001J2_A914TBM43_UPD_USER_ID ;
   private boolean[] BC001J2_n914TBM43_UPD_USER_ID ;
   private long[] BC001J2_A921TBM43_UPD_CNT ;
   private boolean[] BC001J2_n921TBM43_UPD_CNT ;
   private String[] BC001J2_A897TBM43_VAR_DESC ;
   private boolean[] BC001J2_n897TBM43_VAR_DESC ;
   private String[] BC001J2_A898TBM43_SDTM_FLG ;
   private boolean[] BC001J2_n898TBM43_SDTM_FLG ;
   private String[] BC001J2_A899TBM43_CDASH_FLG ;
   private boolean[] BC001J2_n899TBM43_CDASH_FLG ;
   private String[] BC001J2_A900TBM43_INPUT_TYPE_DIV ;
   private boolean[] BC001J2_n900TBM43_INPUT_TYPE_DIV ;
   private String[] BC001J2_A901TBM43_REQUIRED_FLG ;
   private boolean[] BC001J2_n901TBM43_REQUIRED_FLG ;
   private String[] BC001J2_A902TBM43_SAS_FIELD_NM ;
   private boolean[] BC001J2_n902TBM43_SAS_FIELD_NM ;
   private String[] BC001J2_A903TBM43_ODM_DATA_TYPE ;
   private boolean[] BC001J2_n903TBM43_ODM_DATA_TYPE ;
   private String[] BC001J2_A904TBM43_NOTE ;
   private boolean[] BC001J2_n904TBM43_NOTE ;
   private int[] BC001J2_A905TBM43_ORDER ;
   private boolean[] BC001J2_n905TBM43_ORDER ;
   private String[] BC001J2_A907TBM43_VERSION ;
   private boolean[] BC001J2_n907TBM43_VERSION ;
   private String[] BC001J2_A906TBM43_DEL_FLG ;
   private boolean[] BC001J2_n906TBM43_DEL_FLG ;
   private String[] BC001J2_A913TBM43_CRT_PROG_NM ;
   private boolean[] BC001J2_n913TBM43_CRT_PROG_NM ;
   private String[] BC001J2_A915TBM43_UPD_PROG_NM ;
   private boolean[] BC001J2_n915TBM43_UPD_PROG_NM ;
   private long[] BC001J9_A894TBM43_STUDY_ID ;
   private String[] BC001J9_A895TBM43_DOM_CD ;
   private String[] BC001J9_A896TBM43_DOM_VAR_NM ;
   private java.util.Date[] BC001J9_A919TBM43_CRT_DATETIME ;
   private boolean[] BC001J9_n919TBM43_CRT_DATETIME ;
   private String[] BC001J9_A912TBM43_CRT_USER_ID ;
   private boolean[] BC001J9_n912TBM43_CRT_USER_ID ;
   private java.util.Date[] BC001J9_A920TBM43_UPD_DATETIME ;
   private boolean[] BC001J9_n920TBM43_UPD_DATETIME ;
   private String[] BC001J9_A914TBM43_UPD_USER_ID ;
   private boolean[] BC001J9_n914TBM43_UPD_USER_ID ;
   private long[] BC001J9_A921TBM43_UPD_CNT ;
   private boolean[] BC001J9_n921TBM43_UPD_CNT ;
   private String[] BC001J9_A897TBM43_VAR_DESC ;
   private boolean[] BC001J9_n897TBM43_VAR_DESC ;
   private String[] BC001J9_A898TBM43_SDTM_FLG ;
   private boolean[] BC001J9_n898TBM43_SDTM_FLG ;
   private String[] BC001J9_A899TBM43_CDASH_FLG ;
   private boolean[] BC001J9_n899TBM43_CDASH_FLG ;
   private String[] BC001J9_A900TBM43_INPUT_TYPE_DIV ;
   private boolean[] BC001J9_n900TBM43_INPUT_TYPE_DIV ;
   private String[] BC001J9_A901TBM43_REQUIRED_FLG ;
   private boolean[] BC001J9_n901TBM43_REQUIRED_FLG ;
   private String[] BC001J9_A902TBM43_SAS_FIELD_NM ;
   private boolean[] BC001J9_n902TBM43_SAS_FIELD_NM ;
   private String[] BC001J9_A903TBM43_ODM_DATA_TYPE ;
   private boolean[] BC001J9_n903TBM43_ODM_DATA_TYPE ;
   private String[] BC001J9_A904TBM43_NOTE ;
   private boolean[] BC001J9_n904TBM43_NOTE ;
   private int[] BC001J9_A905TBM43_ORDER ;
   private boolean[] BC001J9_n905TBM43_ORDER ;
   private String[] BC001J9_A907TBM43_VERSION ;
   private boolean[] BC001J9_n907TBM43_VERSION ;
   private String[] BC001J9_A906TBM43_DEL_FLG ;
   private boolean[] BC001J9_n906TBM43_DEL_FLG ;
   private String[] BC001J9_A913TBM43_CRT_PROG_NM ;
   private boolean[] BC001J9_n913TBM43_CRT_PROG_NM ;
   private String[] BC001J9_A915TBM43_UPD_PROG_NM ;
   private boolean[] BC001J9_n915TBM43_UPD_PROG_NM ;
}

final  class tbm43_study_cdisc_item_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001J2", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`, `TBM43_CRT_DATETIME`, `TBM43_CRT_USER_ID`, `TBM43_UPD_DATETIME`, `TBM43_UPD_USER_ID`, `TBM43_UPD_CNT`, `TBM43_VAR_DESC`, `TBM43_SDTM_FLG`, `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`, `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_ORDER`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_CRT_PROG_NM`, `TBM43_UPD_PROG_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001J3", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`, `TBM43_CRT_DATETIME`, `TBM43_CRT_USER_ID`, `TBM43_UPD_DATETIME`, `TBM43_UPD_USER_ID`, `TBM43_UPD_CNT`, `TBM43_VAR_DESC`, `TBM43_SDTM_FLG`, `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`, `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_ORDER`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_CRT_PROG_NM`, `TBM43_UPD_PROG_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001J4", "SELECT TM1.`TBM43_STUDY_ID`, TM1.`TBM43_DOM_CD`, TM1.`TBM43_DOM_VAR_NM`, TM1.`TBM43_CRT_DATETIME`, TM1.`TBM43_CRT_USER_ID`, TM1.`TBM43_UPD_DATETIME`, TM1.`TBM43_UPD_USER_ID`, TM1.`TBM43_UPD_CNT`, TM1.`TBM43_VAR_DESC`, TM1.`TBM43_SDTM_FLG`, TM1.`TBM43_CDASH_FLG`, TM1.`TBM43_INPUT_TYPE_DIV`, TM1.`TBM43_REQUIRED_FLG`, TM1.`TBM43_SAS_FIELD_NM`, TM1.`TBM43_ODM_DATA_TYPE`, TM1.`TBM43_NOTE`, TM1.`TBM43_ORDER`, TM1.`TBM43_VERSION`, TM1.`TBM43_DEL_FLG`, TM1.`TBM43_CRT_PROG_NM`, TM1.`TBM43_UPD_PROG_NM` FROM `TBM43_STUDY_CDISC_ITEM` TM1 WHERE TM1.`TBM43_STUDY_ID` = ? and TM1.`TBM43_DOM_CD` = ? and TM1.`TBM43_DOM_VAR_NM` = ? ORDER BY TM1.`TBM43_STUDY_ID`, TM1.`TBM43_DOM_CD`, TM1.`TBM43_DOM_VAR_NM` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC001J5", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001J6", "INSERT INTO `TBM43_STUDY_CDISC_ITEM` (`TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`, `TBM43_CRT_DATETIME`, `TBM43_CRT_USER_ID`, `TBM43_UPD_DATETIME`, `TBM43_UPD_USER_ID`, `TBM43_UPD_CNT`, `TBM43_VAR_DESC`, `TBM43_SDTM_FLG`, `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`, `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_ORDER`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_CRT_PROG_NM`, `TBM43_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001J7", "UPDATE `TBM43_STUDY_CDISC_ITEM` SET `TBM43_CRT_DATETIME`=?, `TBM43_CRT_USER_ID`=?, `TBM43_UPD_DATETIME`=?, `TBM43_UPD_USER_ID`=?, `TBM43_UPD_CNT`=?, `TBM43_VAR_DESC`=?, `TBM43_SDTM_FLG`=?, `TBM43_CDASH_FLG`=?, `TBM43_INPUT_TYPE_DIV`=?, `TBM43_REQUIRED_FLG`=?, `TBM43_SAS_FIELD_NM`=?, `TBM43_ODM_DATA_TYPE`=?, `TBM43_NOTE`=?, `TBM43_ORDER`=?, `TBM43_VERSION`=?, `TBM43_DEL_FLG`=?, `TBM43_CRT_PROG_NM`=?, `TBM43_UPD_PROG_NM`=?  WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001J8", "DELETE FROM `TBM43_STUDY_CDISC_ITEM`  WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001J9", "SELECT TM1.`TBM43_STUDY_ID`, TM1.`TBM43_DOM_CD`, TM1.`TBM43_DOM_VAR_NM`, TM1.`TBM43_CRT_DATETIME`, TM1.`TBM43_CRT_USER_ID`, TM1.`TBM43_UPD_DATETIME`, TM1.`TBM43_UPD_USER_ID`, TM1.`TBM43_UPD_CNT`, TM1.`TBM43_VAR_DESC`, TM1.`TBM43_SDTM_FLG`, TM1.`TBM43_CDASH_FLG`, TM1.`TBM43_INPUT_TYPE_DIV`, TM1.`TBM43_REQUIRED_FLG`, TM1.`TBM43_SAS_FIELD_NM`, TM1.`TBM43_ODM_DATA_TYPE`, TM1.`TBM43_NOTE`, TM1.`TBM43_ORDER`, TM1.`TBM43_VERSION`, TM1.`TBM43_DEL_FLG`, TM1.`TBM43_CRT_PROG_NM`, TM1.`TBM43_UPD_PROG_NM` FROM `TBM43_STUDY_CDISC_ITEM` TM1 WHERE TM1.`TBM43_STUDY_ID` = ? and TM1.`TBM43_DOM_CD` = ? and TM1.`TBM43_DOM_VAR_NM` = ? ORDER BY TM1.`TBM43_STUDY_ID`, TM1.`TBM43_DOM_CD`, TM1.`TBM43_DOM_VAR_NM` ",true, GX_NOMASK, false, this,10,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 128);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[12]).longValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 100);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 50);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 20);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 1000);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
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
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 50);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 20);
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
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 20);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               stmt.setLong(19, ((Number) parms[36]).longValue());
               stmt.setVarchar(20, (String)parms[37], 2, false);
               stmt.setVarchar(21, (String)parms[38], 50, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
      }
   }

}

