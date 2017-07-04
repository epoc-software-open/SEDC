/*
               File: tbt14_crf_memo_bc
        Description: CRFメモテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:18.8
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt14_crf_memo_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt14_crf_memo_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt14_crf_memo_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt14_crf_memo_bc.class ));
   }

   public tbt14_crf_memo_bc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0S27( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0S27( ) ;
      standaloneModal( ) ;
      addRow0S27( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120S2 */
         e120S2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z140TBT14_STUDY_ID = A140TBT14_STUDY_ID ;
            Z142TBT14_SUBJECT_ID = A142TBT14_SUBJECT_ID ;
            Z198TBT14_MEMO_NO = A198TBT14_MEMO_NO ;
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

   public void confirm_0S0( )
   {
      beforeValidate0S27( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0S27( ) ;
         }
         else
         {
            checkExtendedTable0S27( ) ;
            if ( AnyError == 0 )
            {
               zm0S27( 9) ;
            }
            closeExtendedTableCursors0S27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110S2( )
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

   public void e120S2( )
   {
      /* After Trn Routine */
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

   public void zm0S27( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z480TBT14_CRT_DATETIME = A480TBT14_CRT_DATETIME ;
         Z481TBT14_CRT_USER_ID = A481TBT14_CRT_USER_ID ;
         Z483TBT14_UPD_DATETIME = A483TBT14_UPD_DATETIME ;
         Z484TBT14_UPD_USER_ID = A484TBT14_UPD_USER_ID ;
         Z486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
         Z474TBT14_CRF_ID = A474TBT14_CRF_ID ;
         Z941TBT14_CRF_EDA_NO = A941TBT14_CRF_EDA_NO ;
         Z475TBT14_CRF_VERSION = A475TBT14_CRF_VERSION ;
         Z901TBT14_MEMO_KBN = A901TBT14_MEMO_KBN ;
         Z477TBT14_MEMO = A477TBT14_MEMO ;
         Z929TBT14_REQUEST_SITE_ID = A929TBT14_REQUEST_SITE_ID ;
         Z930TBT14_REQUEST_AUTH_CD = A930TBT14_REQUEST_AUTH_CD ;
         Z931TBT14_CRT_AUTH_CD = A931TBT14_CRT_AUTH_CD ;
         Z927TBT14_KAKUNIN_FLG = A927TBT14_KAKUNIN_FLG ;
         Z928TBT14_KAKUNIN_USER_ID = A928TBT14_KAKUNIN_USER_ID ;
         Z934TBT14_KAKUNIN_COMMENT = A934TBT14_KAKUNIN_COMMENT ;
         Z902TBT14_KANRYO_FLG = A902TBT14_KANRYO_FLG ;
         Z479TBT14_DEL_FLG = A479TBT14_DEL_FLG ;
         Z482TBT14_CRT_PROG_NM = A482TBT14_CRT_PROG_NM ;
         Z485TBT14_UPD_PROG_NM = A485TBT14_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z198TBT14_MEMO_NO = A198TBT14_MEMO_NO ;
         Z480TBT14_CRT_DATETIME = A480TBT14_CRT_DATETIME ;
         Z481TBT14_CRT_USER_ID = A481TBT14_CRT_USER_ID ;
         Z483TBT14_UPD_DATETIME = A483TBT14_UPD_DATETIME ;
         Z484TBT14_UPD_USER_ID = A484TBT14_UPD_USER_ID ;
         Z486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
         Z474TBT14_CRF_ID = A474TBT14_CRF_ID ;
         Z941TBT14_CRF_EDA_NO = A941TBT14_CRF_EDA_NO ;
         Z475TBT14_CRF_VERSION = A475TBT14_CRF_VERSION ;
         Z901TBT14_MEMO_KBN = A901TBT14_MEMO_KBN ;
         Z477TBT14_MEMO = A477TBT14_MEMO ;
         Z929TBT14_REQUEST_SITE_ID = A929TBT14_REQUEST_SITE_ID ;
         Z930TBT14_REQUEST_AUTH_CD = A930TBT14_REQUEST_AUTH_CD ;
         Z931TBT14_CRT_AUTH_CD = A931TBT14_CRT_AUTH_CD ;
         Z927TBT14_KAKUNIN_FLG = A927TBT14_KAKUNIN_FLG ;
         Z928TBT14_KAKUNIN_USER_ID = A928TBT14_KAKUNIN_USER_ID ;
         Z934TBT14_KAKUNIN_COMMENT = A934TBT14_KAKUNIN_COMMENT ;
         Z902TBT14_KANRYO_FLG = A902TBT14_KANRYO_FLG ;
         Z479TBT14_DEL_FLG = A479TBT14_DEL_FLG ;
         Z482TBT14_CRT_PROG_NM = A482TBT14_CRT_PROG_NM ;
         Z485TBT14_UPD_PROG_NM = A485TBT14_UPD_PROG_NM ;
         Z140TBT14_STUDY_ID = A140TBT14_STUDY_ID ;
         Z142TBT14_SUBJECT_ID = A142TBT14_SUBJECT_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0S27( )
   {
      /* Using cursor BC000S5 */
      pr_default.execute(3, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A480TBT14_CRT_DATETIME = BC000S5_A480TBT14_CRT_DATETIME[0] ;
         n480TBT14_CRT_DATETIME = BC000S5_n480TBT14_CRT_DATETIME[0] ;
         A481TBT14_CRT_USER_ID = BC000S5_A481TBT14_CRT_USER_ID[0] ;
         n481TBT14_CRT_USER_ID = BC000S5_n481TBT14_CRT_USER_ID[0] ;
         A483TBT14_UPD_DATETIME = BC000S5_A483TBT14_UPD_DATETIME[0] ;
         n483TBT14_UPD_DATETIME = BC000S5_n483TBT14_UPD_DATETIME[0] ;
         A484TBT14_UPD_USER_ID = BC000S5_A484TBT14_UPD_USER_ID[0] ;
         n484TBT14_UPD_USER_ID = BC000S5_n484TBT14_UPD_USER_ID[0] ;
         A486TBT14_UPD_CNT = BC000S5_A486TBT14_UPD_CNT[0] ;
         n486TBT14_UPD_CNT = BC000S5_n486TBT14_UPD_CNT[0] ;
         A474TBT14_CRF_ID = BC000S5_A474TBT14_CRF_ID[0] ;
         n474TBT14_CRF_ID = BC000S5_n474TBT14_CRF_ID[0] ;
         A941TBT14_CRF_EDA_NO = BC000S5_A941TBT14_CRF_EDA_NO[0] ;
         n941TBT14_CRF_EDA_NO = BC000S5_n941TBT14_CRF_EDA_NO[0] ;
         A475TBT14_CRF_VERSION = BC000S5_A475TBT14_CRF_VERSION[0] ;
         n475TBT14_CRF_VERSION = BC000S5_n475TBT14_CRF_VERSION[0] ;
         A901TBT14_MEMO_KBN = BC000S5_A901TBT14_MEMO_KBN[0] ;
         n901TBT14_MEMO_KBN = BC000S5_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = BC000S5_A477TBT14_MEMO[0] ;
         n477TBT14_MEMO = BC000S5_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = BC000S5_A929TBT14_REQUEST_SITE_ID[0] ;
         n929TBT14_REQUEST_SITE_ID = BC000S5_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = BC000S5_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = BC000S5_n930TBT14_REQUEST_AUTH_CD[0] ;
         A931TBT14_CRT_AUTH_CD = BC000S5_A931TBT14_CRT_AUTH_CD[0] ;
         n931TBT14_CRT_AUTH_CD = BC000S5_n931TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = BC000S5_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = BC000S5_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = BC000S5_A928TBT14_KAKUNIN_USER_ID[0] ;
         n928TBT14_KAKUNIN_USER_ID = BC000S5_n928TBT14_KAKUNIN_USER_ID[0] ;
         A934TBT14_KAKUNIN_COMMENT = BC000S5_A934TBT14_KAKUNIN_COMMENT[0] ;
         n934TBT14_KAKUNIN_COMMENT = BC000S5_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = BC000S5_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = BC000S5_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = BC000S5_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = BC000S5_n479TBT14_DEL_FLG[0] ;
         A482TBT14_CRT_PROG_NM = BC000S5_A482TBT14_CRT_PROG_NM[0] ;
         n482TBT14_CRT_PROG_NM = BC000S5_n482TBT14_CRT_PROG_NM[0] ;
         A485TBT14_UPD_PROG_NM = BC000S5_A485TBT14_UPD_PROG_NM[0] ;
         n485TBT14_UPD_PROG_NM = BC000S5_n485TBT14_UPD_PROG_NM[0] ;
         zm0S27( -8) ;
      }
      pr_default.close(3);
      onLoadActions0S27( ) ;
   }

   public void onLoadActions0S27( )
   {
      AV9Pgmname = "TBT14_CRF_MEMO_BC" ;
   }

   public void checkExtendedTable0S27( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT14_CRF_MEMO_BC" ;
      /* Using cursor BC000S4 */
      pr_default.execute(2, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFメモテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A480TBT14_CRT_DATETIME) || (( A480TBT14_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A480TBT14_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A483TBT14_UPD_DATETIME) || (( A483TBT14_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A483TBT14_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0S27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0S27( )
   {
      /* Using cursor BC000S6 */
      pr_default.execute(4, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000S3 */
      pr_default.execute(1, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0S27( 8) ;
         RcdFound27 = (short)(1) ;
         A198TBT14_MEMO_NO = BC000S3_A198TBT14_MEMO_NO[0] ;
         A480TBT14_CRT_DATETIME = BC000S3_A480TBT14_CRT_DATETIME[0] ;
         n480TBT14_CRT_DATETIME = BC000S3_n480TBT14_CRT_DATETIME[0] ;
         A481TBT14_CRT_USER_ID = BC000S3_A481TBT14_CRT_USER_ID[0] ;
         n481TBT14_CRT_USER_ID = BC000S3_n481TBT14_CRT_USER_ID[0] ;
         A483TBT14_UPD_DATETIME = BC000S3_A483TBT14_UPD_DATETIME[0] ;
         n483TBT14_UPD_DATETIME = BC000S3_n483TBT14_UPD_DATETIME[0] ;
         A484TBT14_UPD_USER_ID = BC000S3_A484TBT14_UPD_USER_ID[0] ;
         n484TBT14_UPD_USER_ID = BC000S3_n484TBT14_UPD_USER_ID[0] ;
         A486TBT14_UPD_CNT = BC000S3_A486TBT14_UPD_CNT[0] ;
         n486TBT14_UPD_CNT = BC000S3_n486TBT14_UPD_CNT[0] ;
         A474TBT14_CRF_ID = BC000S3_A474TBT14_CRF_ID[0] ;
         n474TBT14_CRF_ID = BC000S3_n474TBT14_CRF_ID[0] ;
         A941TBT14_CRF_EDA_NO = BC000S3_A941TBT14_CRF_EDA_NO[0] ;
         n941TBT14_CRF_EDA_NO = BC000S3_n941TBT14_CRF_EDA_NO[0] ;
         A475TBT14_CRF_VERSION = BC000S3_A475TBT14_CRF_VERSION[0] ;
         n475TBT14_CRF_VERSION = BC000S3_n475TBT14_CRF_VERSION[0] ;
         A901TBT14_MEMO_KBN = BC000S3_A901TBT14_MEMO_KBN[0] ;
         n901TBT14_MEMO_KBN = BC000S3_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = BC000S3_A477TBT14_MEMO[0] ;
         n477TBT14_MEMO = BC000S3_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = BC000S3_A929TBT14_REQUEST_SITE_ID[0] ;
         n929TBT14_REQUEST_SITE_ID = BC000S3_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = BC000S3_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = BC000S3_n930TBT14_REQUEST_AUTH_CD[0] ;
         A931TBT14_CRT_AUTH_CD = BC000S3_A931TBT14_CRT_AUTH_CD[0] ;
         n931TBT14_CRT_AUTH_CD = BC000S3_n931TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = BC000S3_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = BC000S3_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = BC000S3_A928TBT14_KAKUNIN_USER_ID[0] ;
         n928TBT14_KAKUNIN_USER_ID = BC000S3_n928TBT14_KAKUNIN_USER_ID[0] ;
         A934TBT14_KAKUNIN_COMMENT = BC000S3_A934TBT14_KAKUNIN_COMMENT[0] ;
         n934TBT14_KAKUNIN_COMMENT = BC000S3_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = BC000S3_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = BC000S3_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = BC000S3_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = BC000S3_n479TBT14_DEL_FLG[0] ;
         A482TBT14_CRT_PROG_NM = BC000S3_A482TBT14_CRT_PROG_NM[0] ;
         n482TBT14_CRT_PROG_NM = BC000S3_n482TBT14_CRT_PROG_NM[0] ;
         A485TBT14_UPD_PROG_NM = BC000S3_A485TBT14_UPD_PROG_NM[0] ;
         n485TBT14_UPD_PROG_NM = BC000S3_n485TBT14_UPD_PROG_NM[0] ;
         A140TBT14_STUDY_ID = BC000S3_A140TBT14_STUDY_ID[0] ;
         A142TBT14_SUBJECT_ID = BC000S3_A142TBT14_SUBJECT_ID[0] ;
         O486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
         n486TBT14_UPD_CNT = false ;
         Z140TBT14_STUDY_ID = A140TBT14_STUDY_ID ;
         Z142TBT14_SUBJECT_ID = A142TBT14_SUBJECT_ID ;
         Z198TBT14_MEMO_NO = A198TBT14_MEMO_NO ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0S27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKey0S27( ) ;
         }
         Gx_mode = sMode27 ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKey0S27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0S27( ) ;
      if ( RcdFound27 == 0 )
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
      confirm_0S0( ) ;
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

   public void checkOptimisticConcurrency0S27( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000S2 */
         pr_default.execute(0, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT14_CRF_MEMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z480TBT14_CRT_DATETIME.equals( BC000S2_A480TBT14_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z481TBT14_CRT_USER_ID, BC000S2_A481TBT14_CRT_USER_ID[0]) != 0 ) || !( Z483TBT14_UPD_DATETIME.equals( BC000S2_A483TBT14_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z484TBT14_UPD_USER_ID, BC000S2_A484TBT14_UPD_USER_ID[0]) != 0 ) || ( Z486TBT14_UPD_CNT != BC000S2_A486TBT14_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z474TBT14_CRF_ID != BC000S2_A474TBT14_CRF_ID[0] ) || ( Z941TBT14_CRF_EDA_NO != BC000S2_A941TBT14_CRF_EDA_NO[0] ) || ( Z475TBT14_CRF_VERSION != BC000S2_A475TBT14_CRF_VERSION[0] ) || ( GXutil.strcmp(Z901TBT14_MEMO_KBN, BC000S2_A901TBT14_MEMO_KBN[0]) != 0 ) || ( GXutil.strcmp(Z477TBT14_MEMO, BC000S2_A477TBT14_MEMO[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z929TBT14_REQUEST_SITE_ID, BC000S2_A929TBT14_REQUEST_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z930TBT14_REQUEST_AUTH_CD, BC000S2_A930TBT14_REQUEST_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z931TBT14_CRT_AUTH_CD, BC000S2_A931TBT14_CRT_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z927TBT14_KAKUNIN_FLG, BC000S2_A927TBT14_KAKUNIN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z928TBT14_KAKUNIN_USER_ID, BC000S2_A928TBT14_KAKUNIN_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z934TBT14_KAKUNIN_COMMENT, BC000S2_A934TBT14_KAKUNIN_COMMENT[0]) != 0 ) || ( GXutil.strcmp(Z902TBT14_KANRYO_FLG, BC000S2_A902TBT14_KANRYO_FLG[0]) != 0 ) || ( GXutil.strcmp(Z479TBT14_DEL_FLG, BC000S2_A479TBT14_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z482TBT14_CRT_PROG_NM, BC000S2_A482TBT14_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z485TBT14_UPD_PROG_NM, BC000S2_A485TBT14_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT14_CRF_MEMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0S27( )
   {
      beforeValidate0S27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0S27( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0S27( 0) ;
         checkOptimisticConcurrency0S27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0S27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0S27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000S7 */
                  pr_default.execute(5, new Object[] {new Short(A198TBT14_MEMO_NO), new Boolean(n480TBT14_CRT_DATETIME), A480TBT14_CRT_DATETIME, new Boolean(n481TBT14_CRT_USER_ID), A481TBT14_CRT_USER_ID, new Boolean(n483TBT14_UPD_DATETIME), A483TBT14_UPD_DATETIME, new Boolean(n484TBT14_UPD_USER_ID), A484TBT14_UPD_USER_ID, new Boolean(n486TBT14_UPD_CNT), new Long(A486TBT14_UPD_CNT), new Boolean(n474TBT14_CRF_ID), new Short(A474TBT14_CRF_ID), new Boolean(n941TBT14_CRF_EDA_NO), new Byte(A941TBT14_CRF_EDA_NO), new Boolean(n475TBT14_CRF_VERSION), new Short(A475TBT14_CRF_VERSION), new Boolean(n901TBT14_MEMO_KBN), A901TBT14_MEMO_KBN, new Boolean(n477TBT14_MEMO), A477TBT14_MEMO, new Boolean(n929TBT14_REQUEST_SITE_ID), A929TBT14_REQUEST_SITE_ID, new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD, new Boolean(n931TBT14_CRT_AUTH_CD), A931TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n928TBT14_KAKUNIN_USER_ID), A928TBT14_KAKUNIN_USER_ID, new Boolean(n934TBT14_KAKUNIN_COMMENT), A934TBT14_KAKUNIN_COMMENT, new Boolean(n902TBT14_KANRYO_FLG), A902TBT14_KANRYO_FLG, new Boolean(n479TBT14_DEL_FLG), A479TBT14_DEL_FLG, new Boolean(n482TBT14_CRT_PROG_NM), A482TBT14_CRT_PROG_NM, new Boolean(n485TBT14_UPD_PROG_NM), A485TBT14_UPD_PROG_NM, new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
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
            load0S27( ) ;
         }
         endLevel0S27( ) ;
      }
      closeExtendedTableCursors0S27( ) ;
   }

   public void update0S27( )
   {
      beforeValidate0S27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0S27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0S27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0S27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0S27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000S8 */
                  pr_default.execute(6, new Object[] {new Boolean(n480TBT14_CRT_DATETIME), A480TBT14_CRT_DATETIME, new Boolean(n481TBT14_CRT_USER_ID), A481TBT14_CRT_USER_ID, new Boolean(n483TBT14_UPD_DATETIME), A483TBT14_UPD_DATETIME, new Boolean(n484TBT14_UPD_USER_ID), A484TBT14_UPD_USER_ID, new Boolean(n486TBT14_UPD_CNT), new Long(A486TBT14_UPD_CNT), new Boolean(n474TBT14_CRF_ID), new Short(A474TBT14_CRF_ID), new Boolean(n941TBT14_CRF_EDA_NO), new Byte(A941TBT14_CRF_EDA_NO), new Boolean(n475TBT14_CRF_VERSION), new Short(A475TBT14_CRF_VERSION), new Boolean(n901TBT14_MEMO_KBN), A901TBT14_MEMO_KBN, new Boolean(n477TBT14_MEMO), A477TBT14_MEMO, new Boolean(n929TBT14_REQUEST_SITE_ID), A929TBT14_REQUEST_SITE_ID, new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD, new Boolean(n931TBT14_CRT_AUTH_CD), A931TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n928TBT14_KAKUNIN_USER_ID), A928TBT14_KAKUNIN_USER_ID, new Boolean(n934TBT14_KAKUNIN_COMMENT), A934TBT14_KAKUNIN_COMMENT, new Boolean(n902TBT14_KANRYO_FLG), A902TBT14_KANRYO_FLG, new Boolean(n479TBT14_DEL_FLG), A479TBT14_DEL_FLG, new Boolean(n482TBT14_CRT_PROG_NM), A482TBT14_CRT_PROG_NM, new Boolean(n485TBT14_UPD_PROG_NM), A485TBT14_UPD_PROG_NM, new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT14_CRF_MEMO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0S27( ) ;
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
         endLevel0S27( ) ;
      }
      closeExtendedTableCursors0S27( ) ;
   }

   public void deferredUpdate0S27( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0S27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0S27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0S27( ) ;
         afterConfirm0S27( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0S27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000S9 */
               pr_default.execute(7, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0S27( ) ;
      Gx_mode = sMode27 ;
   }

   public void onDeleteControls0S27( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT14_CRF_MEMO_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000S10 */
         pr_default.execute(8, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFメモ位置テーブル"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
      }
   }

   public void endLevel0S27( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0S27( ) ;
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

   public void scanKeyStart0S27( )
   {
      /* Scan By routine */
      /* Using cursor BC000S11 */
      pr_default.execute(9, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A198TBT14_MEMO_NO = BC000S11_A198TBT14_MEMO_NO[0] ;
         A480TBT14_CRT_DATETIME = BC000S11_A480TBT14_CRT_DATETIME[0] ;
         n480TBT14_CRT_DATETIME = BC000S11_n480TBT14_CRT_DATETIME[0] ;
         A481TBT14_CRT_USER_ID = BC000S11_A481TBT14_CRT_USER_ID[0] ;
         n481TBT14_CRT_USER_ID = BC000S11_n481TBT14_CRT_USER_ID[0] ;
         A483TBT14_UPD_DATETIME = BC000S11_A483TBT14_UPD_DATETIME[0] ;
         n483TBT14_UPD_DATETIME = BC000S11_n483TBT14_UPD_DATETIME[0] ;
         A484TBT14_UPD_USER_ID = BC000S11_A484TBT14_UPD_USER_ID[0] ;
         n484TBT14_UPD_USER_ID = BC000S11_n484TBT14_UPD_USER_ID[0] ;
         A486TBT14_UPD_CNT = BC000S11_A486TBT14_UPD_CNT[0] ;
         n486TBT14_UPD_CNT = BC000S11_n486TBT14_UPD_CNT[0] ;
         A474TBT14_CRF_ID = BC000S11_A474TBT14_CRF_ID[0] ;
         n474TBT14_CRF_ID = BC000S11_n474TBT14_CRF_ID[0] ;
         A941TBT14_CRF_EDA_NO = BC000S11_A941TBT14_CRF_EDA_NO[0] ;
         n941TBT14_CRF_EDA_NO = BC000S11_n941TBT14_CRF_EDA_NO[0] ;
         A475TBT14_CRF_VERSION = BC000S11_A475TBT14_CRF_VERSION[0] ;
         n475TBT14_CRF_VERSION = BC000S11_n475TBT14_CRF_VERSION[0] ;
         A901TBT14_MEMO_KBN = BC000S11_A901TBT14_MEMO_KBN[0] ;
         n901TBT14_MEMO_KBN = BC000S11_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = BC000S11_A477TBT14_MEMO[0] ;
         n477TBT14_MEMO = BC000S11_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = BC000S11_A929TBT14_REQUEST_SITE_ID[0] ;
         n929TBT14_REQUEST_SITE_ID = BC000S11_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = BC000S11_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = BC000S11_n930TBT14_REQUEST_AUTH_CD[0] ;
         A931TBT14_CRT_AUTH_CD = BC000S11_A931TBT14_CRT_AUTH_CD[0] ;
         n931TBT14_CRT_AUTH_CD = BC000S11_n931TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = BC000S11_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = BC000S11_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = BC000S11_A928TBT14_KAKUNIN_USER_ID[0] ;
         n928TBT14_KAKUNIN_USER_ID = BC000S11_n928TBT14_KAKUNIN_USER_ID[0] ;
         A934TBT14_KAKUNIN_COMMENT = BC000S11_A934TBT14_KAKUNIN_COMMENT[0] ;
         n934TBT14_KAKUNIN_COMMENT = BC000S11_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = BC000S11_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = BC000S11_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = BC000S11_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = BC000S11_n479TBT14_DEL_FLG[0] ;
         A482TBT14_CRT_PROG_NM = BC000S11_A482TBT14_CRT_PROG_NM[0] ;
         n482TBT14_CRT_PROG_NM = BC000S11_n482TBT14_CRT_PROG_NM[0] ;
         A485TBT14_UPD_PROG_NM = BC000S11_A485TBT14_UPD_PROG_NM[0] ;
         n485TBT14_UPD_PROG_NM = BC000S11_n485TBT14_UPD_PROG_NM[0] ;
         A140TBT14_STUDY_ID = BC000S11_A140TBT14_STUDY_ID[0] ;
         A142TBT14_SUBJECT_ID = BC000S11_A142TBT14_SUBJECT_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0S27( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound27 = (short)(0) ;
      scanKeyLoad0S27( ) ;
   }

   public void scanKeyLoad0S27( )
   {
      sMode27 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A198TBT14_MEMO_NO = BC000S11_A198TBT14_MEMO_NO[0] ;
         A480TBT14_CRT_DATETIME = BC000S11_A480TBT14_CRT_DATETIME[0] ;
         n480TBT14_CRT_DATETIME = BC000S11_n480TBT14_CRT_DATETIME[0] ;
         A481TBT14_CRT_USER_ID = BC000S11_A481TBT14_CRT_USER_ID[0] ;
         n481TBT14_CRT_USER_ID = BC000S11_n481TBT14_CRT_USER_ID[0] ;
         A483TBT14_UPD_DATETIME = BC000S11_A483TBT14_UPD_DATETIME[0] ;
         n483TBT14_UPD_DATETIME = BC000S11_n483TBT14_UPD_DATETIME[0] ;
         A484TBT14_UPD_USER_ID = BC000S11_A484TBT14_UPD_USER_ID[0] ;
         n484TBT14_UPD_USER_ID = BC000S11_n484TBT14_UPD_USER_ID[0] ;
         A486TBT14_UPD_CNT = BC000S11_A486TBT14_UPD_CNT[0] ;
         n486TBT14_UPD_CNT = BC000S11_n486TBT14_UPD_CNT[0] ;
         A474TBT14_CRF_ID = BC000S11_A474TBT14_CRF_ID[0] ;
         n474TBT14_CRF_ID = BC000S11_n474TBT14_CRF_ID[0] ;
         A941TBT14_CRF_EDA_NO = BC000S11_A941TBT14_CRF_EDA_NO[0] ;
         n941TBT14_CRF_EDA_NO = BC000S11_n941TBT14_CRF_EDA_NO[0] ;
         A475TBT14_CRF_VERSION = BC000S11_A475TBT14_CRF_VERSION[0] ;
         n475TBT14_CRF_VERSION = BC000S11_n475TBT14_CRF_VERSION[0] ;
         A901TBT14_MEMO_KBN = BC000S11_A901TBT14_MEMO_KBN[0] ;
         n901TBT14_MEMO_KBN = BC000S11_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = BC000S11_A477TBT14_MEMO[0] ;
         n477TBT14_MEMO = BC000S11_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = BC000S11_A929TBT14_REQUEST_SITE_ID[0] ;
         n929TBT14_REQUEST_SITE_ID = BC000S11_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = BC000S11_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = BC000S11_n930TBT14_REQUEST_AUTH_CD[0] ;
         A931TBT14_CRT_AUTH_CD = BC000S11_A931TBT14_CRT_AUTH_CD[0] ;
         n931TBT14_CRT_AUTH_CD = BC000S11_n931TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = BC000S11_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = BC000S11_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = BC000S11_A928TBT14_KAKUNIN_USER_ID[0] ;
         n928TBT14_KAKUNIN_USER_ID = BC000S11_n928TBT14_KAKUNIN_USER_ID[0] ;
         A934TBT14_KAKUNIN_COMMENT = BC000S11_A934TBT14_KAKUNIN_COMMENT[0] ;
         n934TBT14_KAKUNIN_COMMENT = BC000S11_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = BC000S11_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = BC000S11_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = BC000S11_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = BC000S11_n479TBT14_DEL_FLG[0] ;
         A482TBT14_CRT_PROG_NM = BC000S11_A482TBT14_CRT_PROG_NM[0] ;
         n482TBT14_CRT_PROG_NM = BC000S11_n482TBT14_CRT_PROG_NM[0] ;
         A485TBT14_UPD_PROG_NM = BC000S11_A485TBT14_UPD_PROG_NM[0] ;
         n485TBT14_UPD_PROG_NM = BC000S11_n485TBT14_UPD_PROG_NM[0] ;
         A140TBT14_STUDY_ID = BC000S11_A140TBT14_STUDY_ID[0] ;
         A142TBT14_SUBJECT_ID = BC000S11_A142TBT14_SUBJECT_ID[0] ;
      }
      Gx_mode = sMode27 ;
   }

   public void scanKeyEnd0S27( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0S27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0S27( )
   {
      /* Before Insert Rules */
      A480TBT14_CRT_DATETIME = GXutil.now( ) ;
      n480TBT14_CRT_DATETIME = false ;
      GXt_char1 = A481TBT14_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt14_crf_memo_bc.this.GXt_char1 = GXv_char2[0] ;
      A481TBT14_CRT_USER_ID = GXt_char1 ;
      n481TBT14_CRT_USER_ID = false ;
      A483TBT14_UPD_DATETIME = GXutil.now( ) ;
      n483TBT14_UPD_DATETIME = false ;
      GXt_char1 = A484TBT14_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt14_crf_memo_bc.this.GXt_char1 = GXv_char2[0] ;
      A484TBT14_UPD_USER_ID = GXt_char1 ;
      n484TBT14_UPD_USER_ID = false ;
      A486TBT14_UPD_CNT = (long)(O486TBT14_UPD_CNT+1) ;
      n486TBT14_UPD_CNT = false ;
   }

   public void beforeUpdate0S27( )
   {
      /* Before Update Rules */
      A483TBT14_UPD_DATETIME = GXutil.now( ) ;
      n483TBT14_UPD_DATETIME = false ;
      GXt_char1 = A484TBT14_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt14_crf_memo_bc.this.GXt_char1 = GXv_char2[0] ;
      A484TBT14_UPD_USER_ID = GXt_char1 ;
      n484TBT14_UPD_USER_ID = false ;
      A486TBT14_UPD_CNT = (long)(O486TBT14_UPD_CNT+1) ;
      n486TBT14_UPD_CNT = false ;
   }

   public void beforeDelete0S27( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0S27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0S27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0S27( )
   {
   }

   public void addRow0S27( )
   {
      VarsToRow27( bcTBT14_CRF_MEMO) ;
   }

   public void readRow0S27( )
   {
      RowToVars27( bcTBT14_CRF_MEMO, 1) ;
   }

   public void initializeNonKey0S27( )
   {
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n480TBT14_CRT_DATETIME = false ;
      A481TBT14_CRT_USER_ID = "" ;
      n481TBT14_CRT_USER_ID = false ;
      A483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n483TBT14_UPD_DATETIME = false ;
      A484TBT14_UPD_USER_ID = "" ;
      n484TBT14_UPD_USER_ID = false ;
      A486TBT14_UPD_CNT = 0 ;
      n486TBT14_UPD_CNT = false ;
      A474TBT14_CRF_ID = (short)(0) ;
      n474TBT14_CRF_ID = false ;
      A941TBT14_CRF_EDA_NO = (byte)(0) ;
      n941TBT14_CRF_EDA_NO = false ;
      A475TBT14_CRF_VERSION = (short)(0) ;
      n475TBT14_CRF_VERSION = false ;
      A901TBT14_MEMO_KBN = "" ;
      n901TBT14_MEMO_KBN = false ;
      A477TBT14_MEMO = "" ;
      n477TBT14_MEMO = false ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      n929TBT14_REQUEST_SITE_ID = false ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      n930TBT14_REQUEST_AUTH_CD = false ;
      A931TBT14_CRT_AUTH_CD = "" ;
      n931TBT14_CRT_AUTH_CD = false ;
      A927TBT14_KAKUNIN_FLG = "" ;
      n927TBT14_KAKUNIN_FLG = false ;
      A928TBT14_KAKUNIN_USER_ID = "" ;
      n928TBT14_KAKUNIN_USER_ID = false ;
      A934TBT14_KAKUNIN_COMMENT = "" ;
      n934TBT14_KAKUNIN_COMMENT = false ;
      A902TBT14_KANRYO_FLG = "" ;
      n902TBT14_KANRYO_FLG = false ;
      A479TBT14_DEL_FLG = "" ;
      n479TBT14_DEL_FLG = false ;
      A482TBT14_CRT_PROG_NM = "" ;
      n482TBT14_CRT_PROG_NM = false ;
      A485TBT14_UPD_PROG_NM = "" ;
      n485TBT14_UPD_PROG_NM = false ;
      O486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
      n486TBT14_UPD_CNT = false ;
   }

   public void initAll0S27( )
   {
      A140TBT14_STUDY_ID = 0 ;
      A142TBT14_SUBJECT_ID = 0 ;
      A198TBT14_MEMO_NO = (short)(0) ;
      initializeNonKey0S27( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow27( SdtTBT14_CRF_MEMO obj27 )
   {
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Mode( Gx_mode );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime( A480TBT14_CRT_DATETIME );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id( A481TBT14_CRT_USER_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime( A483TBT14_UPD_DATETIME );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id( A484TBT14_UPD_USER_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt( A486TBT14_UPD_CNT );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id( A474TBT14_CRF_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no( A941TBT14_CRF_EDA_NO );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version( A475TBT14_CRF_VERSION );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn( A901TBT14_MEMO_KBN );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo( A477TBT14_MEMO );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id( A929TBT14_REQUEST_SITE_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd( A930TBT14_REQUEST_AUTH_CD );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd( A931TBT14_CRT_AUTH_CD );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg( A927TBT14_KAKUNIN_FLG );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id( A928TBT14_KAKUNIN_USER_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment( A934TBT14_KAKUNIN_COMMENT );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg( A902TBT14_KANRYO_FLG );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg( A479TBT14_DEL_FLG );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm( A482TBT14_CRT_PROG_NM );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm( A485TBT14_UPD_PROG_NM );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id( A140TBT14_STUDY_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id( A142TBT14_SUBJECT_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no( A198TBT14_MEMO_NO );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z( Z140TBT14_STUDY_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z( Z142TBT14_SUBJECT_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z( Z198TBT14_MEMO_NO );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z( Z474TBT14_CRF_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z( Z941TBT14_CRF_EDA_NO );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z( Z475TBT14_CRF_VERSION );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z( Z901TBT14_MEMO_KBN );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z( Z477TBT14_MEMO );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z( Z929TBT14_REQUEST_SITE_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z( Z930TBT14_REQUEST_AUTH_CD );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z( Z931TBT14_CRT_AUTH_CD );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z( Z927TBT14_KAKUNIN_FLG );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z( Z928TBT14_KAKUNIN_USER_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z( Z934TBT14_KAKUNIN_COMMENT );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z( Z902TBT14_KANRYO_FLG );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z( Z479TBT14_DEL_FLG );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z( Z480TBT14_CRT_DATETIME );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z( Z481TBT14_CRT_USER_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z( Z482TBT14_CRT_PROG_NM );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z( Z483TBT14_UPD_DATETIME );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z( Z484TBT14_UPD_USER_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z( Z485TBT14_UPD_PROG_NM );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z( Z486TBT14_UPD_CNT );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N( (byte)((byte)((n474TBT14_CRF_ID)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N( (byte)((byte)((n941TBT14_CRF_EDA_NO)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N( (byte)((byte)((n475TBT14_CRF_VERSION)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N( (byte)((byte)((n901TBT14_MEMO_KBN)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N( (byte)((byte)((n477TBT14_MEMO)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N( (byte)((byte)((n929TBT14_REQUEST_SITE_ID)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N( (byte)((byte)((n930TBT14_REQUEST_AUTH_CD)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N( (byte)((byte)((n931TBT14_CRT_AUTH_CD)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N( (byte)((byte)((n927TBT14_KAKUNIN_FLG)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N( (byte)((byte)((n928TBT14_KAKUNIN_USER_ID)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N( (byte)((byte)((n934TBT14_KAKUNIN_COMMENT)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N( (byte)((byte)((n902TBT14_KANRYO_FLG)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N( (byte)((byte)((n479TBT14_DEL_FLG)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N( (byte)((byte)((n480TBT14_CRT_DATETIME)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N( (byte)((byte)((n481TBT14_CRT_USER_ID)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N( (byte)((byte)((n482TBT14_CRT_PROG_NM)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N( (byte)((byte)((n483TBT14_UPD_DATETIME)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N( (byte)((byte)((n484TBT14_UPD_USER_ID)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N( (byte)((byte)((n485TBT14_UPD_PROG_NM)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N( (byte)((byte)((n486TBT14_UPD_CNT)?1:0)) );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Mode( Gx_mode );
   }

   public void KeyVarsToRow27( SdtTBT14_CRF_MEMO obj27 )
   {
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id( A140TBT14_STUDY_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id( A142TBT14_SUBJECT_ID );
      obj27.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no( A198TBT14_MEMO_NO );
   }

   public void RowToVars27( SdtTBT14_CRF_MEMO obj27 ,
                            int forceLoad )
   {
      Gx_mode = obj27.getgxTv_SdtTBT14_CRF_MEMO_Mode() ;
      A480TBT14_CRT_DATETIME = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime() ;
      n480TBT14_CRT_DATETIME = false ;
      A481TBT14_CRT_USER_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id() ;
      n481TBT14_CRT_USER_ID = false ;
      A483TBT14_UPD_DATETIME = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime() ;
      n483TBT14_UPD_DATETIME = false ;
      A484TBT14_UPD_USER_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id() ;
      n484TBT14_UPD_USER_ID = false ;
      A486TBT14_UPD_CNT = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt() ;
      n486TBT14_UPD_CNT = false ;
      A474TBT14_CRF_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id() ;
      n474TBT14_CRF_ID = false ;
      A941TBT14_CRF_EDA_NO = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no() ;
      n941TBT14_CRF_EDA_NO = false ;
      A475TBT14_CRF_VERSION = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version() ;
      n475TBT14_CRF_VERSION = false ;
      A901TBT14_MEMO_KBN = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn() ;
      n901TBT14_MEMO_KBN = false ;
      A477TBT14_MEMO = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo() ;
      n477TBT14_MEMO = false ;
      A929TBT14_REQUEST_SITE_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id() ;
      n929TBT14_REQUEST_SITE_ID = false ;
      A930TBT14_REQUEST_AUTH_CD = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd() ;
      n930TBT14_REQUEST_AUTH_CD = false ;
      A931TBT14_CRT_AUTH_CD = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd() ;
      n931TBT14_CRT_AUTH_CD = false ;
      A927TBT14_KAKUNIN_FLG = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg() ;
      n927TBT14_KAKUNIN_FLG = false ;
      A928TBT14_KAKUNIN_USER_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id() ;
      n928TBT14_KAKUNIN_USER_ID = false ;
      A934TBT14_KAKUNIN_COMMENT = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment() ;
      n934TBT14_KAKUNIN_COMMENT = false ;
      A902TBT14_KANRYO_FLG = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg() ;
      n902TBT14_KANRYO_FLG = false ;
      A479TBT14_DEL_FLG = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg() ;
      n479TBT14_DEL_FLG = false ;
      A482TBT14_CRT_PROG_NM = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm() ;
      n482TBT14_CRT_PROG_NM = false ;
      A485TBT14_UPD_PROG_NM = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm() ;
      n485TBT14_UPD_PROG_NM = false ;
      A140TBT14_STUDY_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id() ;
      A142TBT14_SUBJECT_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id() ;
      A198TBT14_MEMO_NO = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no() ;
      Z140TBT14_STUDY_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z() ;
      Z142TBT14_SUBJECT_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z() ;
      Z198TBT14_MEMO_NO = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z() ;
      Z474TBT14_CRF_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z() ;
      Z941TBT14_CRF_EDA_NO = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z() ;
      Z475TBT14_CRF_VERSION = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z() ;
      Z901TBT14_MEMO_KBN = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z() ;
      Z477TBT14_MEMO = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z() ;
      Z929TBT14_REQUEST_SITE_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z() ;
      Z930TBT14_REQUEST_AUTH_CD = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z() ;
      Z931TBT14_CRT_AUTH_CD = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z() ;
      Z927TBT14_KAKUNIN_FLG = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z() ;
      Z928TBT14_KAKUNIN_USER_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z() ;
      Z934TBT14_KAKUNIN_COMMENT = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z() ;
      Z902TBT14_KANRYO_FLG = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z() ;
      Z479TBT14_DEL_FLG = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z() ;
      Z480TBT14_CRT_DATETIME = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z() ;
      Z481TBT14_CRT_USER_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z() ;
      Z482TBT14_CRT_PROG_NM = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z() ;
      Z483TBT14_UPD_DATETIME = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z() ;
      Z484TBT14_UPD_USER_ID = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z() ;
      Z485TBT14_UPD_PROG_NM = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z() ;
      Z486TBT14_UPD_CNT = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z() ;
      O486TBT14_UPD_CNT = obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z() ;
      n474TBT14_CRF_ID = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N()==0)?false:true) ;
      n941TBT14_CRF_EDA_NO = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N()==0)?false:true) ;
      n475TBT14_CRF_VERSION = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N()==0)?false:true) ;
      n901TBT14_MEMO_KBN = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N()==0)?false:true) ;
      n477TBT14_MEMO = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N()==0)?false:true) ;
      n929TBT14_REQUEST_SITE_ID = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N()==0)?false:true) ;
      n930TBT14_REQUEST_AUTH_CD = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N()==0)?false:true) ;
      n931TBT14_CRT_AUTH_CD = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N()==0)?false:true) ;
      n927TBT14_KAKUNIN_FLG = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N()==0)?false:true) ;
      n928TBT14_KAKUNIN_USER_ID = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N()==0)?false:true) ;
      n934TBT14_KAKUNIN_COMMENT = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N()==0)?false:true) ;
      n902TBT14_KANRYO_FLG = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N()==0)?false:true) ;
      n479TBT14_DEL_FLG = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N()==0)?false:true) ;
      n480TBT14_CRT_DATETIME = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N()==0)?false:true) ;
      n481TBT14_CRT_USER_ID = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N()==0)?false:true) ;
      n482TBT14_CRT_PROG_NM = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N()==0)?false:true) ;
      n483TBT14_UPD_DATETIME = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N()==0)?false:true) ;
      n484TBT14_UPD_USER_ID = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N()==0)?false:true) ;
      n485TBT14_UPD_PROG_NM = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N()==0)?false:true) ;
      n486TBT14_UPD_CNT = (boolean)((obj27.getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj27.getgxTv_SdtTBT14_CRF_MEMO_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A140TBT14_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A142TBT14_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A198TBT14_MEMO_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0S27( ) ;
      scanKeyStart0S27( ) ;
      if ( RcdFound27 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000S4 */
         pr_default.execute(2, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CRFメモテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z140TBT14_STUDY_ID = A140TBT14_STUDY_ID ;
         Z142TBT14_SUBJECT_ID = A142TBT14_SUBJECT_ID ;
         Z198TBT14_MEMO_NO = A198TBT14_MEMO_NO ;
         O486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
         n486TBT14_UPD_CNT = false ;
      }
      zm0S27( -8) ;
      onLoadActions0S27( ) ;
      addRow0S27( ) ;
      scanKeyEnd0S27( ) ;
      if ( RcdFound27 == 0 )
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
      RowToVars27( bcTBT14_CRF_MEMO, 0) ;
      scanKeyStart0S27( ) ;
      if ( RcdFound27 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000S4 */
         pr_default.execute(2, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem("'CRFメモテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z140TBT14_STUDY_ID = A140TBT14_STUDY_ID ;
         Z142TBT14_SUBJECT_ID = A142TBT14_SUBJECT_ID ;
         Z198TBT14_MEMO_NO = A198TBT14_MEMO_NO ;
         O486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
         n486TBT14_UPD_CNT = false ;
      }
      zm0S27( -8) ;
      onLoadActions0S27( ) ;
      addRow0S27( ) ;
      scanKeyEnd0S27( ) ;
      if ( RcdFound27 == 0 )
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
      RowToVars27( bcTBT14_CRF_MEMO, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0S27( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0S27( ) ;
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( ( A140TBT14_STUDY_ID != Z140TBT14_STUDY_ID ) || ( A142TBT14_SUBJECT_ID != Z142TBT14_SUBJECT_ID ) || ( A198TBT14_MEMO_NO != Z198TBT14_MEMO_NO ) )
            {
               A140TBT14_STUDY_ID = Z140TBT14_STUDY_ID ;
               A142TBT14_SUBJECT_ID = Z142TBT14_SUBJECT_ID ;
               A198TBT14_MEMO_NO = Z198TBT14_MEMO_NO ;
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
               update0S27( ) ;
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
               if ( ( A140TBT14_STUDY_ID != Z140TBT14_STUDY_ID ) || ( A142TBT14_SUBJECT_ID != Z142TBT14_SUBJECT_ID ) || ( A198TBT14_MEMO_NO != Z198TBT14_MEMO_NO ) )
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
                     insert0S27( ) ;
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
                     insert0S27( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow27( bcTBT14_CRF_MEMO) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars27( bcTBT14_CRF_MEMO, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0S27( ) ;
      if ( RcdFound27 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A140TBT14_STUDY_ID != Z140TBT14_STUDY_ID ) || ( A142TBT14_SUBJECT_ID != Z142TBT14_SUBJECT_ID ) || ( A198TBT14_MEMO_NO != Z198TBT14_MEMO_NO ) )
         {
            A140TBT14_STUDY_ID = Z140TBT14_STUDY_ID ;
            A142TBT14_SUBJECT_ID = Z142TBT14_SUBJECT_ID ;
            A198TBT14_MEMO_NO = Z198TBT14_MEMO_NO ;
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
         if ( ( A140TBT14_STUDY_ID != Z140TBT14_STUDY_ID ) || ( A142TBT14_SUBJECT_ID != Z142TBT14_SUBJECT_ID ) || ( A198TBT14_MEMO_NO != Z198TBT14_MEMO_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt14_crf_memo_bc");
      VarsToRow27( bcTBT14_CRF_MEMO) ;
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
      Gx_mode = bcTBT14_CRF_MEMO.getgxTv_SdtTBT14_CRF_MEMO_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT14_CRF_MEMO.setgxTv_SdtTBT14_CRF_MEMO_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT14_CRF_MEMO sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT14_CRF_MEMO )
      {
         bcTBT14_CRF_MEMO = sdt ;
         if ( GXutil.strcmp(bcTBT14_CRF_MEMO.getgxTv_SdtTBT14_CRF_MEMO_Mode(), "") == 0 )
         {
            bcTBT14_CRF_MEMO.setgxTv_SdtTBT14_CRF_MEMO_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow27( bcTBT14_CRF_MEMO) ;
         }
         else
         {
            RowToVars27( bcTBT14_CRF_MEMO, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT14_CRF_MEMO.getgxTv_SdtTBT14_CRF_MEMO_Mode(), "") == 0 )
         {
            bcTBT14_CRF_MEMO.setgxTv_SdtTBT14_CRF_MEMO_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars27( bcTBT14_CRF_MEMO, 1) ;
   }

   public SdtTBT14_CRF_MEMO getTBT14_CRF_MEMO_BC( )
   {
      return bcTBT14_CRF_MEMO ;
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
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z481TBT14_CRT_USER_ID = "" ;
      A481TBT14_CRT_USER_ID = "" ;
      Z483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z484TBT14_UPD_USER_ID = "" ;
      A484TBT14_UPD_USER_ID = "" ;
      Z901TBT14_MEMO_KBN = "" ;
      A901TBT14_MEMO_KBN = "" ;
      Z477TBT14_MEMO = "" ;
      A477TBT14_MEMO = "" ;
      Z929TBT14_REQUEST_SITE_ID = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      Z930TBT14_REQUEST_AUTH_CD = "" ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      Z931TBT14_CRT_AUTH_CD = "" ;
      A931TBT14_CRT_AUTH_CD = "" ;
      Z927TBT14_KAKUNIN_FLG = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      Z928TBT14_KAKUNIN_USER_ID = "" ;
      A928TBT14_KAKUNIN_USER_ID = "" ;
      Z934TBT14_KAKUNIN_COMMENT = "" ;
      A934TBT14_KAKUNIN_COMMENT = "" ;
      Z902TBT14_KANRYO_FLG = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      Z479TBT14_DEL_FLG = "" ;
      A479TBT14_DEL_FLG = "" ;
      Z482TBT14_CRT_PROG_NM = "" ;
      A482TBT14_CRT_PROG_NM = "" ;
      Z485TBT14_UPD_PROG_NM = "" ;
      A485TBT14_UPD_PROG_NM = "" ;
      BC000S5_A198TBT14_MEMO_NO = new short[1] ;
      BC000S5_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000S5_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      BC000S5_A481TBT14_CRT_USER_ID = new String[] {""} ;
      BC000S5_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      BC000S5_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000S5_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      BC000S5_A484TBT14_UPD_USER_ID = new String[] {""} ;
      BC000S5_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      BC000S5_A486TBT14_UPD_CNT = new long[1] ;
      BC000S5_n486TBT14_UPD_CNT = new boolean[] {false} ;
      BC000S5_A474TBT14_CRF_ID = new short[1] ;
      BC000S5_n474TBT14_CRF_ID = new boolean[] {false} ;
      BC000S5_A941TBT14_CRF_EDA_NO = new byte[1] ;
      BC000S5_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      BC000S5_A475TBT14_CRF_VERSION = new short[1] ;
      BC000S5_n475TBT14_CRF_VERSION = new boolean[] {false} ;
      BC000S5_A901TBT14_MEMO_KBN = new String[] {""} ;
      BC000S5_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      BC000S5_A477TBT14_MEMO = new String[] {""} ;
      BC000S5_n477TBT14_MEMO = new boolean[] {false} ;
      BC000S5_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      BC000S5_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      BC000S5_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      BC000S5_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      BC000S5_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      BC000S5_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      BC000S5_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      BC000S5_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      BC000S5_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      BC000S5_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      BC000S5_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      BC000S5_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      BC000S5_A902TBT14_KANRYO_FLG = new String[] {""} ;
      BC000S5_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      BC000S5_A479TBT14_DEL_FLG = new String[] {""} ;
      BC000S5_n479TBT14_DEL_FLG = new boolean[] {false} ;
      BC000S5_A482TBT14_CRT_PROG_NM = new String[] {""} ;
      BC000S5_n482TBT14_CRT_PROG_NM = new boolean[] {false} ;
      BC000S5_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      BC000S5_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      BC000S5_A140TBT14_STUDY_ID = new long[1] ;
      BC000S5_A142TBT14_SUBJECT_ID = new int[1] ;
      BC000S4_A140TBT14_STUDY_ID = new long[1] ;
      BC000S6_A140TBT14_STUDY_ID = new long[1] ;
      BC000S6_A142TBT14_SUBJECT_ID = new int[1] ;
      BC000S6_A198TBT14_MEMO_NO = new short[1] ;
      BC000S3_A198TBT14_MEMO_NO = new short[1] ;
      BC000S3_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000S3_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      BC000S3_A481TBT14_CRT_USER_ID = new String[] {""} ;
      BC000S3_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      BC000S3_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000S3_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      BC000S3_A484TBT14_UPD_USER_ID = new String[] {""} ;
      BC000S3_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      BC000S3_A486TBT14_UPD_CNT = new long[1] ;
      BC000S3_n486TBT14_UPD_CNT = new boolean[] {false} ;
      BC000S3_A474TBT14_CRF_ID = new short[1] ;
      BC000S3_n474TBT14_CRF_ID = new boolean[] {false} ;
      BC000S3_A941TBT14_CRF_EDA_NO = new byte[1] ;
      BC000S3_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      BC000S3_A475TBT14_CRF_VERSION = new short[1] ;
      BC000S3_n475TBT14_CRF_VERSION = new boolean[] {false} ;
      BC000S3_A901TBT14_MEMO_KBN = new String[] {""} ;
      BC000S3_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      BC000S3_A477TBT14_MEMO = new String[] {""} ;
      BC000S3_n477TBT14_MEMO = new boolean[] {false} ;
      BC000S3_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      BC000S3_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      BC000S3_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      BC000S3_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      BC000S3_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      BC000S3_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      BC000S3_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      BC000S3_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      BC000S3_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      BC000S3_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      BC000S3_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      BC000S3_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      BC000S3_A902TBT14_KANRYO_FLG = new String[] {""} ;
      BC000S3_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      BC000S3_A479TBT14_DEL_FLG = new String[] {""} ;
      BC000S3_n479TBT14_DEL_FLG = new boolean[] {false} ;
      BC000S3_A482TBT14_CRT_PROG_NM = new String[] {""} ;
      BC000S3_n482TBT14_CRT_PROG_NM = new boolean[] {false} ;
      BC000S3_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      BC000S3_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      BC000S3_A140TBT14_STUDY_ID = new long[1] ;
      BC000S3_A142TBT14_SUBJECT_ID = new int[1] ;
      sMode27 = "" ;
      BC000S2_A198TBT14_MEMO_NO = new short[1] ;
      BC000S2_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000S2_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      BC000S2_A481TBT14_CRT_USER_ID = new String[] {""} ;
      BC000S2_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      BC000S2_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000S2_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      BC000S2_A484TBT14_UPD_USER_ID = new String[] {""} ;
      BC000S2_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      BC000S2_A486TBT14_UPD_CNT = new long[1] ;
      BC000S2_n486TBT14_UPD_CNT = new boolean[] {false} ;
      BC000S2_A474TBT14_CRF_ID = new short[1] ;
      BC000S2_n474TBT14_CRF_ID = new boolean[] {false} ;
      BC000S2_A941TBT14_CRF_EDA_NO = new byte[1] ;
      BC000S2_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      BC000S2_A475TBT14_CRF_VERSION = new short[1] ;
      BC000S2_n475TBT14_CRF_VERSION = new boolean[] {false} ;
      BC000S2_A901TBT14_MEMO_KBN = new String[] {""} ;
      BC000S2_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      BC000S2_A477TBT14_MEMO = new String[] {""} ;
      BC000S2_n477TBT14_MEMO = new boolean[] {false} ;
      BC000S2_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      BC000S2_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      BC000S2_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      BC000S2_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      BC000S2_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      BC000S2_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      BC000S2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      BC000S2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      BC000S2_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      BC000S2_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      BC000S2_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      BC000S2_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      BC000S2_A902TBT14_KANRYO_FLG = new String[] {""} ;
      BC000S2_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      BC000S2_A479TBT14_DEL_FLG = new String[] {""} ;
      BC000S2_n479TBT14_DEL_FLG = new boolean[] {false} ;
      BC000S2_A482TBT14_CRT_PROG_NM = new String[] {""} ;
      BC000S2_n482TBT14_CRT_PROG_NM = new boolean[] {false} ;
      BC000S2_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      BC000S2_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      BC000S2_A140TBT14_STUDY_ID = new long[1] ;
      BC000S2_A142TBT14_SUBJECT_ID = new int[1] ;
      BC000S10_A149TBT15_STUDY_ID = new long[1] ;
      BC000S10_A151TBT15_SUBJECT_ID = new int[1] ;
      BC000S10_A199TBT15_MEMO_NO = new short[1] ;
      BC000S11_A198TBT14_MEMO_NO = new short[1] ;
      BC000S11_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000S11_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      BC000S11_A481TBT14_CRT_USER_ID = new String[] {""} ;
      BC000S11_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      BC000S11_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000S11_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      BC000S11_A484TBT14_UPD_USER_ID = new String[] {""} ;
      BC000S11_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      BC000S11_A486TBT14_UPD_CNT = new long[1] ;
      BC000S11_n486TBT14_UPD_CNT = new boolean[] {false} ;
      BC000S11_A474TBT14_CRF_ID = new short[1] ;
      BC000S11_n474TBT14_CRF_ID = new boolean[] {false} ;
      BC000S11_A941TBT14_CRF_EDA_NO = new byte[1] ;
      BC000S11_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      BC000S11_A475TBT14_CRF_VERSION = new short[1] ;
      BC000S11_n475TBT14_CRF_VERSION = new boolean[] {false} ;
      BC000S11_A901TBT14_MEMO_KBN = new String[] {""} ;
      BC000S11_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      BC000S11_A477TBT14_MEMO = new String[] {""} ;
      BC000S11_n477TBT14_MEMO = new boolean[] {false} ;
      BC000S11_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      BC000S11_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      BC000S11_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      BC000S11_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      BC000S11_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      BC000S11_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      BC000S11_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      BC000S11_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      BC000S11_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      BC000S11_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      BC000S11_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      BC000S11_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      BC000S11_A902TBT14_KANRYO_FLG = new String[] {""} ;
      BC000S11_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      BC000S11_A479TBT14_DEL_FLG = new String[] {""} ;
      BC000S11_n479TBT14_DEL_FLG = new boolean[] {false} ;
      BC000S11_A482TBT14_CRT_PROG_NM = new String[] {""} ;
      BC000S11_n482TBT14_CRT_PROG_NM = new boolean[] {false} ;
      BC000S11_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      BC000S11_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      BC000S11_A140TBT14_STUDY_ID = new long[1] ;
      BC000S11_A142TBT14_SUBJECT_ID = new int[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt14_crf_memo_bc__default(),
         new Object[] {
             new Object[] {
            BC000S2_A198TBT14_MEMO_NO, BC000S2_A480TBT14_CRT_DATETIME, BC000S2_n480TBT14_CRT_DATETIME, BC000S2_A481TBT14_CRT_USER_ID, BC000S2_n481TBT14_CRT_USER_ID, BC000S2_A483TBT14_UPD_DATETIME, BC000S2_n483TBT14_UPD_DATETIME, BC000S2_A484TBT14_UPD_USER_ID, BC000S2_n484TBT14_UPD_USER_ID, BC000S2_A486TBT14_UPD_CNT,
            BC000S2_n486TBT14_UPD_CNT, BC000S2_A474TBT14_CRF_ID, BC000S2_n474TBT14_CRF_ID, BC000S2_A941TBT14_CRF_EDA_NO, BC000S2_n941TBT14_CRF_EDA_NO, BC000S2_A475TBT14_CRF_VERSION, BC000S2_n475TBT14_CRF_VERSION, BC000S2_A901TBT14_MEMO_KBN, BC000S2_n901TBT14_MEMO_KBN, BC000S2_A477TBT14_MEMO,
            BC000S2_n477TBT14_MEMO, BC000S2_A929TBT14_REQUEST_SITE_ID, BC000S2_n929TBT14_REQUEST_SITE_ID, BC000S2_A930TBT14_REQUEST_AUTH_CD, BC000S2_n930TBT14_REQUEST_AUTH_CD, BC000S2_A931TBT14_CRT_AUTH_CD, BC000S2_n931TBT14_CRT_AUTH_CD, BC000S2_A927TBT14_KAKUNIN_FLG, BC000S2_n927TBT14_KAKUNIN_FLG, BC000S2_A928TBT14_KAKUNIN_USER_ID,
            BC000S2_n928TBT14_KAKUNIN_USER_ID, BC000S2_A934TBT14_KAKUNIN_COMMENT, BC000S2_n934TBT14_KAKUNIN_COMMENT, BC000S2_A902TBT14_KANRYO_FLG, BC000S2_n902TBT14_KANRYO_FLG, BC000S2_A479TBT14_DEL_FLG, BC000S2_n479TBT14_DEL_FLG, BC000S2_A482TBT14_CRT_PROG_NM, BC000S2_n482TBT14_CRT_PROG_NM, BC000S2_A485TBT14_UPD_PROG_NM,
            BC000S2_n485TBT14_UPD_PROG_NM, BC000S2_A140TBT14_STUDY_ID, BC000S2_A142TBT14_SUBJECT_ID
            }
            , new Object[] {
            BC000S3_A198TBT14_MEMO_NO, BC000S3_A480TBT14_CRT_DATETIME, BC000S3_n480TBT14_CRT_DATETIME, BC000S3_A481TBT14_CRT_USER_ID, BC000S3_n481TBT14_CRT_USER_ID, BC000S3_A483TBT14_UPD_DATETIME, BC000S3_n483TBT14_UPD_DATETIME, BC000S3_A484TBT14_UPD_USER_ID, BC000S3_n484TBT14_UPD_USER_ID, BC000S3_A486TBT14_UPD_CNT,
            BC000S3_n486TBT14_UPD_CNT, BC000S3_A474TBT14_CRF_ID, BC000S3_n474TBT14_CRF_ID, BC000S3_A941TBT14_CRF_EDA_NO, BC000S3_n941TBT14_CRF_EDA_NO, BC000S3_A475TBT14_CRF_VERSION, BC000S3_n475TBT14_CRF_VERSION, BC000S3_A901TBT14_MEMO_KBN, BC000S3_n901TBT14_MEMO_KBN, BC000S3_A477TBT14_MEMO,
            BC000S3_n477TBT14_MEMO, BC000S3_A929TBT14_REQUEST_SITE_ID, BC000S3_n929TBT14_REQUEST_SITE_ID, BC000S3_A930TBT14_REQUEST_AUTH_CD, BC000S3_n930TBT14_REQUEST_AUTH_CD, BC000S3_A931TBT14_CRT_AUTH_CD, BC000S3_n931TBT14_CRT_AUTH_CD, BC000S3_A927TBT14_KAKUNIN_FLG, BC000S3_n927TBT14_KAKUNIN_FLG, BC000S3_A928TBT14_KAKUNIN_USER_ID,
            BC000S3_n928TBT14_KAKUNIN_USER_ID, BC000S3_A934TBT14_KAKUNIN_COMMENT, BC000S3_n934TBT14_KAKUNIN_COMMENT, BC000S3_A902TBT14_KANRYO_FLG, BC000S3_n902TBT14_KANRYO_FLG, BC000S3_A479TBT14_DEL_FLG, BC000S3_n479TBT14_DEL_FLG, BC000S3_A482TBT14_CRT_PROG_NM, BC000S3_n482TBT14_CRT_PROG_NM, BC000S3_A485TBT14_UPD_PROG_NM,
            BC000S3_n485TBT14_UPD_PROG_NM, BC000S3_A140TBT14_STUDY_ID, BC000S3_A142TBT14_SUBJECT_ID
            }
            , new Object[] {
            BC000S4_A140TBT14_STUDY_ID
            }
            , new Object[] {
            BC000S5_A198TBT14_MEMO_NO, BC000S5_A480TBT14_CRT_DATETIME, BC000S5_n480TBT14_CRT_DATETIME, BC000S5_A481TBT14_CRT_USER_ID, BC000S5_n481TBT14_CRT_USER_ID, BC000S5_A483TBT14_UPD_DATETIME, BC000S5_n483TBT14_UPD_DATETIME, BC000S5_A484TBT14_UPD_USER_ID, BC000S5_n484TBT14_UPD_USER_ID, BC000S5_A486TBT14_UPD_CNT,
            BC000S5_n486TBT14_UPD_CNT, BC000S5_A474TBT14_CRF_ID, BC000S5_n474TBT14_CRF_ID, BC000S5_A941TBT14_CRF_EDA_NO, BC000S5_n941TBT14_CRF_EDA_NO, BC000S5_A475TBT14_CRF_VERSION, BC000S5_n475TBT14_CRF_VERSION, BC000S5_A901TBT14_MEMO_KBN, BC000S5_n901TBT14_MEMO_KBN, BC000S5_A477TBT14_MEMO,
            BC000S5_n477TBT14_MEMO, BC000S5_A929TBT14_REQUEST_SITE_ID, BC000S5_n929TBT14_REQUEST_SITE_ID, BC000S5_A930TBT14_REQUEST_AUTH_CD, BC000S5_n930TBT14_REQUEST_AUTH_CD, BC000S5_A931TBT14_CRT_AUTH_CD, BC000S5_n931TBT14_CRT_AUTH_CD, BC000S5_A927TBT14_KAKUNIN_FLG, BC000S5_n927TBT14_KAKUNIN_FLG, BC000S5_A928TBT14_KAKUNIN_USER_ID,
            BC000S5_n928TBT14_KAKUNIN_USER_ID, BC000S5_A934TBT14_KAKUNIN_COMMENT, BC000S5_n934TBT14_KAKUNIN_COMMENT, BC000S5_A902TBT14_KANRYO_FLG, BC000S5_n902TBT14_KANRYO_FLG, BC000S5_A479TBT14_DEL_FLG, BC000S5_n479TBT14_DEL_FLG, BC000S5_A482TBT14_CRT_PROG_NM, BC000S5_n482TBT14_CRT_PROG_NM, BC000S5_A485TBT14_UPD_PROG_NM,
            BC000S5_n485TBT14_UPD_PROG_NM, BC000S5_A140TBT14_STUDY_ID, BC000S5_A142TBT14_SUBJECT_ID
            }
            , new Object[] {
            BC000S6_A140TBT14_STUDY_ID, BC000S6_A142TBT14_SUBJECT_ID, BC000S6_A198TBT14_MEMO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000S10_A149TBT15_STUDY_ID, BC000S10_A151TBT15_SUBJECT_ID, BC000S10_A199TBT15_MEMO_NO
            }
            , new Object[] {
            BC000S11_A198TBT14_MEMO_NO, BC000S11_A480TBT14_CRT_DATETIME, BC000S11_n480TBT14_CRT_DATETIME, BC000S11_A481TBT14_CRT_USER_ID, BC000S11_n481TBT14_CRT_USER_ID, BC000S11_A483TBT14_UPD_DATETIME, BC000S11_n483TBT14_UPD_DATETIME, BC000S11_A484TBT14_UPD_USER_ID, BC000S11_n484TBT14_UPD_USER_ID, BC000S11_A486TBT14_UPD_CNT,
            BC000S11_n486TBT14_UPD_CNT, BC000S11_A474TBT14_CRF_ID, BC000S11_n474TBT14_CRF_ID, BC000S11_A941TBT14_CRF_EDA_NO, BC000S11_n941TBT14_CRF_EDA_NO, BC000S11_A475TBT14_CRF_VERSION, BC000S11_n475TBT14_CRF_VERSION, BC000S11_A901TBT14_MEMO_KBN, BC000S11_n901TBT14_MEMO_KBN, BC000S11_A477TBT14_MEMO,
            BC000S11_n477TBT14_MEMO, BC000S11_A929TBT14_REQUEST_SITE_ID, BC000S11_n929TBT14_REQUEST_SITE_ID, BC000S11_A930TBT14_REQUEST_AUTH_CD, BC000S11_n930TBT14_REQUEST_AUTH_CD, BC000S11_A931TBT14_CRT_AUTH_CD, BC000S11_n931TBT14_CRT_AUTH_CD, BC000S11_A927TBT14_KAKUNIN_FLG, BC000S11_n927TBT14_KAKUNIN_FLG, BC000S11_A928TBT14_KAKUNIN_USER_ID,
            BC000S11_n928TBT14_KAKUNIN_USER_ID, BC000S11_A934TBT14_KAKUNIN_COMMENT, BC000S11_n934TBT14_KAKUNIN_COMMENT, BC000S11_A902TBT14_KANRYO_FLG, BC000S11_n902TBT14_KANRYO_FLG, BC000S11_A479TBT14_DEL_FLG, BC000S11_n479TBT14_DEL_FLG, BC000S11_A482TBT14_CRT_PROG_NM, BC000S11_n482TBT14_CRT_PROG_NM, BC000S11_A485TBT14_UPD_PROG_NM,
            BC000S11_n485TBT14_UPD_PROG_NM, BC000S11_A140TBT14_STUDY_ID, BC000S11_A142TBT14_SUBJECT_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT14_CRF_MEMO_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110S2 */
      e110S2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z941TBT14_CRF_EDA_NO ;
   private byte A941TBT14_CRF_EDA_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z198TBT14_MEMO_NO ;
   private short A198TBT14_MEMO_NO ;
   private short Z474TBT14_CRF_ID ;
   private short A474TBT14_CRF_ID ;
   private short Z475TBT14_CRF_VERSION ;
   private short A475TBT14_CRF_VERSION ;
   private short RcdFound27 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z142TBT14_SUBJECT_ID ;
   private int A142TBT14_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z140TBT14_STUDY_ID ;
   private long A140TBT14_STUDY_ID ;
   private long Z486TBT14_UPD_CNT ;
   private long A486TBT14_UPD_CNT ;
   private long O486TBT14_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode27 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date Z480TBT14_CRT_DATETIME ;
   private java.util.Date A480TBT14_CRT_DATETIME ;
   private java.util.Date Z483TBT14_UPD_DATETIME ;
   private java.util.Date A483TBT14_UPD_DATETIME ;
   private boolean n480TBT14_CRT_DATETIME ;
   private boolean n481TBT14_CRT_USER_ID ;
   private boolean n483TBT14_UPD_DATETIME ;
   private boolean n484TBT14_UPD_USER_ID ;
   private boolean n486TBT14_UPD_CNT ;
   private boolean n474TBT14_CRF_ID ;
   private boolean n941TBT14_CRF_EDA_NO ;
   private boolean n475TBT14_CRF_VERSION ;
   private boolean n901TBT14_MEMO_KBN ;
   private boolean n477TBT14_MEMO ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n928TBT14_KAKUNIN_USER_ID ;
   private boolean n934TBT14_KAKUNIN_COMMENT ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n482TBT14_CRT_PROG_NM ;
   private boolean n485TBT14_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String Z481TBT14_CRT_USER_ID ;
   private String A481TBT14_CRT_USER_ID ;
   private String Z484TBT14_UPD_USER_ID ;
   private String A484TBT14_UPD_USER_ID ;
   private String Z901TBT14_MEMO_KBN ;
   private String A901TBT14_MEMO_KBN ;
   private String Z477TBT14_MEMO ;
   private String A477TBT14_MEMO ;
   private String Z929TBT14_REQUEST_SITE_ID ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String Z930TBT14_REQUEST_AUTH_CD ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String Z931TBT14_CRT_AUTH_CD ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String Z927TBT14_KAKUNIN_FLG ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String Z928TBT14_KAKUNIN_USER_ID ;
   private String A928TBT14_KAKUNIN_USER_ID ;
   private String Z934TBT14_KAKUNIN_COMMENT ;
   private String A934TBT14_KAKUNIN_COMMENT ;
   private String Z902TBT14_KANRYO_FLG ;
   private String A902TBT14_KANRYO_FLG ;
   private String Z479TBT14_DEL_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String Z482TBT14_CRT_PROG_NM ;
   private String A482TBT14_CRT_PROG_NM ;
   private String Z485TBT14_UPD_PROG_NM ;
   private String A485TBT14_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT14_CRF_MEMO bcTBT14_CRF_MEMO ;
   private IDataStoreProvider pr_default ;
   private short[] BC000S5_A198TBT14_MEMO_NO ;
   private java.util.Date[] BC000S5_A480TBT14_CRT_DATETIME ;
   private boolean[] BC000S5_n480TBT14_CRT_DATETIME ;
   private String[] BC000S5_A481TBT14_CRT_USER_ID ;
   private boolean[] BC000S5_n481TBT14_CRT_USER_ID ;
   private java.util.Date[] BC000S5_A483TBT14_UPD_DATETIME ;
   private boolean[] BC000S5_n483TBT14_UPD_DATETIME ;
   private String[] BC000S5_A484TBT14_UPD_USER_ID ;
   private boolean[] BC000S5_n484TBT14_UPD_USER_ID ;
   private long[] BC000S5_A486TBT14_UPD_CNT ;
   private boolean[] BC000S5_n486TBT14_UPD_CNT ;
   private short[] BC000S5_A474TBT14_CRF_ID ;
   private boolean[] BC000S5_n474TBT14_CRF_ID ;
   private byte[] BC000S5_A941TBT14_CRF_EDA_NO ;
   private boolean[] BC000S5_n941TBT14_CRF_EDA_NO ;
   private short[] BC000S5_A475TBT14_CRF_VERSION ;
   private boolean[] BC000S5_n475TBT14_CRF_VERSION ;
   private String[] BC000S5_A901TBT14_MEMO_KBN ;
   private boolean[] BC000S5_n901TBT14_MEMO_KBN ;
   private String[] BC000S5_A477TBT14_MEMO ;
   private boolean[] BC000S5_n477TBT14_MEMO ;
   private String[] BC000S5_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] BC000S5_n929TBT14_REQUEST_SITE_ID ;
   private String[] BC000S5_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] BC000S5_n930TBT14_REQUEST_AUTH_CD ;
   private String[] BC000S5_A931TBT14_CRT_AUTH_CD ;
   private boolean[] BC000S5_n931TBT14_CRT_AUTH_CD ;
   private String[] BC000S5_A927TBT14_KAKUNIN_FLG ;
   private boolean[] BC000S5_n927TBT14_KAKUNIN_FLG ;
   private String[] BC000S5_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] BC000S5_n928TBT14_KAKUNIN_USER_ID ;
   private String[] BC000S5_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] BC000S5_n934TBT14_KAKUNIN_COMMENT ;
   private String[] BC000S5_A902TBT14_KANRYO_FLG ;
   private boolean[] BC000S5_n902TBT14_KANRYO_FLG ;
   private String[] BC000S5_A479TBT14_DEL_FLG ;
   private boolean[] BC000S5_n479TBT14_DEL_FLG ;
   private String[] BC000S5_A482TBT14_CRT_PROG_NM ;
   private boolean[] BC000S5_n482TBT14_CRT_PROG_NM ;
   private String[] BC000S5_A485TBT14_UPD_PROG_NM ;
   private boolean[] BC000S5_n485TBT14_UPD_PROG_NM ;
   private long[] BC000S5_A140TBT14_STUDY_ID ;
   private int[] BC000S5_A142TBT14_SUBJECT_ID ;
   private long[] BC000S4_A140TBT14_STUDY_ID ;
   private long[] BC000S6_A140TBT14_STUDY_ID ;
   private int[] BC000S6_A142TBT14_SUBJECT_ID ;
   private short[] BC000S6_A198TBT14_MEMO_NO ;
   private short[] BC000S3_A198TBT14_MEMO_NO ;
   private java.util.Date[] BC000S3_A480TBT14_CRT_DATETIME ;
   private boolean[] BC000S3_n480TBT14_CRT_DATETIME ;
   private String[] BC000S3_A481TBT14_CRT_USER_ID ;
   private boolean[] BC000S3_n481TBT14_CRT_USER_ID ;
   private java.util.Date[] BC000S3_A483TBT14_UPD_DATETIME ;
   private boolean[] BC000S3_n483TBT14_UPD_DATETIME ;
   private String[] BC000S3_A484TBT14_UPD_USER_ID ;
   private boolean[] BC000S3_n484TBT14_UPD_USER_ID ;
   private long[] BC000S3_A486TBT14_UPD_CNT ;
   private boolean[] BC000S3_n486TBT14_UPD_CNT ;
   private short[] BC000S3_A474TBT14_CRF_ID ;
   private boolean[] BC000S3_n474TBT14_CRF_ID ;
   private byte[] BC000S3_A941TBT14_CRF_EDA_NO ;
   private boolean[] BC000S3_n941TBT14_CRF_EDA_NO ;
   private short[] BC000S3_A475TBT14_CRF_VERSION ;
   private boolean[] BC000S3_n475TBT14_CRF_VERSION ;
   private String[] BC000S3_A901TBT14_MEMO_KBN ;
   private boolean[] BC000S3_n901TBT14_MEMO_KBN ;
   private String[] BC000S3_A477TBT14_MEMO ;
   private boolean[] BC000S3_n477TBT14_MEMO ;
   private String[] BC000S3_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] BC000S3_n929TBT14_REQUEST_SITE_ID ;
   private String[] BC000S3_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] BC000S3_n930TBT14_REQUEST_AUTH_CD ;
   private String[] BC000S3_A931TBT14_CRT_AUTH_CD ;
   private boolean[] BC000S3_n931TBT14_CRT_AUTH_CD ;
   private String[] BC000S3_A927TBT14_KAKUNIN_FLG ;
   private boolean[] BC000S3_n927TBT14_KAKUNIN_FLG ;
   private String[] BC000S3_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] BC000S3_n928TBT14_KAKUNIN_USER_ID ;
   private String[] BC000S3_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] BC000S3_n934TBT14_KAKUNIN_COMMENT ;
   private String[] BC000S3_A902TBT14_KANRYO_FLG ;
   private boolean[] BC000S3_n902TBT14_KANRYO_FLG ;
   private String[] BC000S3_A479TBT14_DEL_FLG ;
   private boolean[] BC000S3_n479TBT14_DEL_FLG ;
   private String[] BC000S3_A482TBT14_CRT_PROG_NM ;
   private boolean[] BC000S3_n482TBT14_CRT_PROG_NM ;
   private String[] BC000S3_A485TBT14_UPD_PROG_NM ;
   private boolean[] BC000S3_n485TBT14_UPD_PROG_NM ;
   private long[] BC000S3_A140TBT14_STUDY_ID ;
   private int[] BC000S3_A142TBT14_SUBJECT_ID ;
   private short[] BC000S2_A198TBT14_MEMO_NO ;
   private java.util.Date[] BC000S2_A480TBT14_CRT_DATETIME ;
   private boolean[] BC000S2_n480TBT14_CRT_DATETIME ;
   private String[] BC000S2_A481TBT14_CRT_USER_ID ;
   private boolean[] BC000S2_n481TBT14_CRT_USER_ID ;
   private java.util.Date[] BC000S2_A483TBT14_UPD_DATETIME ;
   private boolean[] BC000S2_n483TBT14_UPD_DATETIME ;
   private String[] BC000S2_A484TBT14_UPD_USER_ID ;
   private boolean[] BC000S2_n484TBT14_UPD_USER_ID ;
   private long[] BC000S2_A486TBT14_UPD_CNT ;
   private boolean[] BC000S2_n486TBT14_UPD_CNT ;
   private short[] BC000S2_A474TBT14_CRF_ID ;
   private boolean[] BC000S2_n474TBT14_CRF_ID ;
   private byte[] BC000S2_A941TBT14_CRF_EDA_NO ;
   private boolean[] BC000S2_n941TBT14_CRF_EDA_NO ;
   private short[] BC000S2_A475TBT14_CRF_VERSION ;
   private boolean[] BC000S2_n475TBT14_CRF_VERSION ;
   private String[] BC000S2_A901TBT14_MEMO_KBN ;
   private boolean[] BC000S2_n901TBT14_MEMO_KBN ;
   private String[] BC000S2_A477TBT14_MEMO ;
   private boolean[] BC000S2_n477TBT14_MEMO ;
   private String[] BC000S2_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] BC000S2_n929TBT14_REQUEST_SITE_ID ;
   private String[] BC000S2_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] BC000S2_n930TBT14_REQUEST_AUTH_CD ;
   private String[] BC000S2_A931TBT14_CRT_AUTH_CD ;
   private boolean[] BC000S2_n931TBT14_CRT_AUTH_CD ;
   private String[] BC000S2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] BC000S2_n927TBT14_KAKUNIN_FLG ;
   private String[] BC000S2_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] BC000S2_n928TBT14_KAKUNIN_USER_ID ;
   private String[] BC000S2_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] BC000S2_n934TBT14_KAKUNIN_COMMENT ;
   private String[] BC000S2_A902TBT14_KANRYO_FLG ;
   private boolean[] BC000S2_n902TBT14_KANRYO_FLG ;
   private String[] BC000S2_A479TBT14_DEL_FLG ;
   private boolean[] BC000S2_n479TBT14_DEL_FLG ;
   private String[] BC000S2_A482TBT14_CRT_PROG_NM ;
   private boolean[] BC000S2_n482TBT14_CRT_PROG_NM ;
   private String[] BC000S2_A485TBT14_UPD_PROG_NM ;
   private boolean[] BC000S2_n485TBT14_UPD_PROG_NM ;
   private long[] BC000S2_A140TBT14_STUDY_ID ;
   private int[] BC000S2_A142TBT14_SUBJECT_ID ;
   private long[] BC000S10_A149TBT15_STUDY_ID ;
   private int[] BC000S10_A151TBT15_SUBJECT_ID ;
   private short[] BC000S10_A199TBT15_MEMO_NO ;
   private short[] BC000S11_A198TBT14_MEMO_NO ;
   private java.util.Date[] BC000S11_A480TBT14_CRT_DATETIME ;
   private boolean[] BC000S11_n480TBT14_CRT_DATETIME ;
   private String[] BC000S11_A481TBT14_CRT_USER_ID ;
   private boolean[] BC000S11_n481TBT14_CRT_USER_ID ;
   private java.util.Date[] BC000S11_A483TBT14_UPD_DATETIME ;
   private boolean[] BC000S11_n483TBT14_UPD_DATETIME ;
   private String[] BC000S11_A484TBT14_UPD_USER_ID ;
   private boolean[] BC000S11_n484TBT14_UPD_USER_ID ;
   private long[] BC000S11_A486TBT14_UPD_CNT ;
   private boolean[] BC000S11_n486TBT14_UPD_CNT ;
   private short[] BC000S11_A474TBT14_CRF_ID ;
   private boolean[] BC000S11_n474TBT14_CRF_ID ;
   private byte[] BC000S11_A941TBT14_CRF_EDA_NO ;
   private boolean[] BC000S11_n941TBT14_CRF_EDA_NO ;
   private short[] BC000S11_A475TBT14_CRF_VERSION ;
   private boolean[] BC000S11_n475TBT14_CRF_VERSION ;
   private String[] BC000S11_A901TBT14_MEMO_KBN ;
   private boolean[] BC000S11_n901TBT14_MEMO_KBN ;
   private String[] BC000S11_A477TBT14_MEMO ;
   private boolean[] BC000S11_n477TBT14_MEMO ;
   private String[] BC000S11_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] BC000S11_n929TBT14_REQUEST_SITE_ID ;
   private String[] BC000S11_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] BC000S11_n930TBT14_REQUEST_AUTH_CD ;
   private String[] BC000S11_A931TBT14_CRT_AUTH_CD ;
   private boolean[] BC000S11_n931TBT14_CRT_AUTH_CD ;
   private String[] BC000S11_A927TBT14_KAKUNIN_FLG ;
   private boolean[] BC000S11_n927TBT14_KAKUNIN_FLG ;
   private String[] BC000S11_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] BC000S11_n928TBT14_KAKUNIN_USER_ID ;
   private String[] BC000S11_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] BC000S11_n934TBT14_KAKUNIN_COMMENT ;
   private String[] BC000S11_A902TBT14_KANRYO_FLG ;
   private boolean[] BC000S11_n902TBT14_KANRYO_FLG ;
   private String[] BC000S11_A479TBT14_DEL_FLG ;
   private boolean[] BC000S11_n479TBT14_DEL_FLG ;
   private String[] BC000S11_A482TBT14_CRT_PROG_NM ;
   private boolean[] BC000S11_n482TBT14_CRT_PROG_NM ;
   private String[] BC000S11_A485TBT14_UPD_PROG_NM ;
   private boolean[] BC000S11_n485TBT14_UPD_PROG_NM ;
   private long[] BC000S11_A140TBT14_STUDY_ID ;
   private int[] BC000S11_A142TBT14_SUBJECT_ID ;
}

final  class tbt14_crf_memo_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000S2", "SELECT `TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_EDA_NO`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000S3", "SELECT `TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_EDA_NO`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000S4", "SELECT `TBT01_STUDY_ID` AS TBT14_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000S5", "SELECT TM1.`TBT14_MEMO_NO`, TM1.`TBT14_CRT_DATETIME`, TM1.`TBT14_CRT_USER_ID`, TM1.`TBT14_UPD_DATETIME`, TM1.`TBT14_UPD_USER_ID`, TM1.`TBT14_UPD_CNT`, TM1.`TBT14_CRF_ID`, TM1.`TBT14_CRF_EDA_NO`, TM1.`TBT14_CRF_VERSION`, TM1.`TBT14_MEMO_KBN`, TM1.`TBT14_MEMO`, TM1.`TBT14_REQUEST_SITE_ID`, TM1.`TBT14_REQUEST_AUTH_CD`, TM1.`TBT14_CRT_AUTH_CD`, TM1.`TBT14_KAKUNIN_FLG`, TM1.`TBT14_KAKUNIN_USER_ID`, TM1.`TBT14_KAKUNIN_COMMENT`, TM1.`TBT14_KANRYO_FLG`, TM1.`TBT14_DEL_FLG`, TM1.`TBT14_CRT_PROG_NM`, TM1.`TBT14_UPD_PROG_NM`, TM1.`TBT14_STUDY_ID` AS TBT14_STUDY_ID, TM1.`TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` TM1 WHERE TM1.`TBT14_STUDY_ID` = ? and TM1.`TBT14_SUBJECT_ID` = ? and TM1.`TBT14_MEMO_NO` = ? ORDER BY TM1.`TBT14_STUDY_ID`, TM1.`TBT14_SUBJECT_ID`, TM1.`TBT14_MEMO_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000S6", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000S7", "INSERT INTO `TBT14_CRF_MEMO`(`TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_EDA_NO`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000S8", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_CRT_DATETIME`=?, `TBT14_CRT_USER_ID`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_CNT`=?, `TBT14_CRF_ID`=?, `TBT14_CRF_EDA_NO`=?, `TBT14_CRF_VERSION`=?, `TBT14_MEMO_KBN`=?, `TBT14_MEMO`=?, `TBT14_REQUEST_SITE_ID`=?, `TBT14_REQUEST_AUTH_CD`=?, `TBT14_CRT_AUTH_CD`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_KAKUNIN_USER_ID`=?, `TBT14_KAKUNIN_COMMENT`=?, `TBT14_KANRYO_FLG`=?, `TBT14_DEL_FLG`=?, `TBT14_CRT_PROG_NM`=?, `TBT14_UPD_PROG_NM`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000S9", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000S10", "SELECT `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO` FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000S11", "SELECT TM1.`TBT14_MEMO_NO`, TM1.`TBT14_CRT_DATETIME`, TM1.`TBT14_CRT_USER_ID`, TM1.`TBT14_UPD_DATETIME`, TM1.`TBT14_UPD_USER_ID`, TM1.`TBT14_UPD_CNT`, TM1.`TBT14_CRF_ID`, TM1.`TBT14_CRF_EDA_NO`, TM1.`TBT14_CRF_VERSION`, TM1.`TBT14_MEMO_KBN`, TM1.`TBT14_MEMO`, TM1.`TBT14_REQUEST_SITE_ID`, TM1.`TBT14_REQUEST_AUTH_CD`, TM1.`TBT14_CRT_AUTH_CD`, TM1.`TBT14_KAKUNIN_FLG`, TM1.`TBT14_KAKUNIN_USER_ID`, TM1.`TBT14_KAKUNIN_COMMENT`, TM1.`TBT14_KANRYO_FLG`, TM1.`TBT14_DEL_FLG`, TM1.`TBT14_CRT_PROG_NM`, TM1.`TBT14_UPD_PROG_NM`, TM1.`TBT14_STUDY_ID` AS TBT14_STUDY_ID, TM1.`TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` TM1 WHERE TM1.`TBT14_STUDY_ID` = ? and TM1.`TBT14_SUBJECT_ID` = ? and TM1.`TBT14_MEMO_NO` = ? ORDER BY TM1.`TBT14_STUDY_ID`, TM1.`TBT14_SUBJECT_ID`, TM1.`TBT14_MEMO_NO` ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
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
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((int[]) buf[42])[0] = rslt.getInt(23) ;
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
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
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((int[]) buf[42])[0] = rslt.getInt(23) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
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
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((int[]) buf[42])[0] = rslt.getInt(23) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
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
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
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
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((int[]) buf[42])[0] = rslt.getInt(23) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
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
                  stmt.setVarchar(11, (String)parms[20], 2000);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 20);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 2);
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
                  stmt.setVarchar(16, (String)parms[30], 128);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 2000);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 40);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 40);
               }
               stmt.setLong(22, ((Number) parms[41]).longValue());
               stmt.setInt(23, ((Number) parms[42]).intValue());
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
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
                  stmt.setVarchar(10, (String)parms[19], 2000);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 2);
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
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 128);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 2000);
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
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 1);
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
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 40);
               }
               stmt.setLong(21, ((Number) parms[40]).longValue());
               stmt.setInt(22, ((Number) parms[41]).intValue());
               stmt.setShort(23, ((Number) parms[42]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

