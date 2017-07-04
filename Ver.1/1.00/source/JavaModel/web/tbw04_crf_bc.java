/*
               File: tbw04_crf_bc
        Description: CRFテーブルワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:2.8
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw04_crf_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbw04_crf_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw04_crf_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw04_crf_bc.class ));
   }

   public tbw04_crf_bc( int remoteHandle ,
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
            Z661TBW04_SESSION_ID = A661TBW04_SESSION_ID ;
            Z662TBW04_APP_ID = A662TBW04_APP_ID ;
            Z663TBW04_DISP_DATETIME = A663TBW04_DISP_DATETIME ;
            Z664TBW04_STUDY_ID = A664TBW04_STUDY_ID ;
            Z665TBW04_SUBJECT_ID = A665TBW04_SUBJECT_ID ;
            Z666TBW04_CRF_ID = A666TBW04_CRF_ID ;
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

   public void confirm_170( )
   {
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1742( ) ;
         }
         else
         {
            checkExtendedTable1742( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1742( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11172( )
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

   public void zm1742( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         Z667TBW04_CRF_LATEST_VERSION = A667TBW04_CRF_LATEST_VERSION ;
         Z668TBW04_CRF_INPUT_LEVEL = A668TBW04_CRF_INPUT_LEVEL ;
         Z669TBW04_LOCK_FLG = A669TBW04_LOCK_FLG ;
         Z670TBW04_LOCK_DATETIME = A670TBW04_LOCK_DATETIME ;
         Z671TBW04_LOCK_USER_ID = A671TBW04_LOCK_USER_ID ;
         Z672TBW04_LOCK_AUTH_CD = A672TBW04_LOCK_AUTH_CD ;
         Z673TBW04_UPLOAD_DATETIME = A673TBW04_UPLOAD_DATETIME ;
         Z674TBW04_UPLOAD_USER_ID = A674TBW04_UPLOAD_USER_ID ;
         Z675TBW04_UPLOAD_AUTH_CD = A675TBW04_UPLOAD_AUTH_CD ;
         Z676TBW04_DM_ARRIVAL_FLG = A676TBW04_DM_ARRIVAL_FLG ;
         Z677TBW04_DM_ARRIVAL_DATETIME = A677TBW04_DM_ARRIVAL_DATETIME ;
         Z678TBW04_APPROVAL_FLG = A678TBW04_APPROVAL_FLG ;
         Z679TBW04_APPROVAL_DATETIME = A679TBW04_APPROVAL_DATETIME ;
         Z680TBW04_APPROVAL_USER_ID = A680TBW04_APPROVAL_USER_ID ;
         Z681TBW04_APPROVAL_AUTH_CD = A681TBW04_APPROVAL_AUTH_CD ;
         Z682TBW04_INPUT_END_FLG = A682TBW04_INPUT_END_FLG ;
         Z683TBW04_INPUT_END_DATETIME = A683TBW04_INPUT_END_DATETIME ;
         Z684TBW04_INPUT_END_USER_ID = A684TBW04_INPUT_END_USER_ID ;
         Z685TBW04_INPUT_END_AUTH_CD = A685TBW04_INPUT_END_AUTH_CD ;
         Z686TBW04_COMPLETION_FLG = A686TBW04_COMPLETION_FLG ;
         Z687TBW04_EDIT_FLG = A687TBW04_EDIT_FLG ;
      }
      if ( GX_JID == -6 )
      {
         Z661TBW04_SESSION_ID = A661TBW04_SESSION_ID ;
         Z662TBW04_APP_ID = A662TBW04_APP_ID ;
         Z663TBW04_DISP_DATETIME = A663TBW04_DISP_DATETIME ;
         Z664TBW04_STUDY_ID = A664TBW04_STUDY_ID ;
         Z665TBW04_SUBJECT_ID = A665TBW04_SUBJECT_ID ;
         Z666TBW04_CRF_ID = A666TBW04_CRF_ID ;
         Z667TBW04_CRF_LATEST_VERSION = A667TBW04_CRF_LATEST_VERSION ;
         Z668TBW04_CRF_INPUT_LEVEL = A668TBW04_CRF_INPUT_LEVEL ;
         Z669TBW04_LOCK_FLG = A669TBW04_LOCK_FLG ;
         Z670TBW04_LOCK_DATETIME = A670TBW04_LOCK_DATETIME ;
         Z671TBW04_LOCK_USER_ID = A671TBW04_LOCK_USER_ID ;
         Z672TBW04_LOCK_AUTH_CD = A672TBW04_LOCK_AUTH_CD ;
         Z673TBW04_UPLOAD_DATETIME = A673TBW04_UPLOAD_DATETIME ;
         Z674TBW04_UPLOAD_USER_ID = A674TBW04_UPLOAD_USER_ID ;
         Z675TBW04_UPLOAD_AUTH_CD = A675TBW04_UPLOAD_AUTH_CD ;
         Z676TBW04_DM_ARRIVAL_FLG = A676TBW04_DM_ARRIVAL_FLG ;
         Z677TBW04_DM_ARRIVAL_DATETIME = A677TBW04_DM_ARRIVAL_DATETIME ;
         Z678TBW04_APPROVAL_FLG = A678TBW04_APPROVAL_FLG ;
         Z679TBW04_APPROVAL_DATETIME = A679TBW04_APPROVAL_DATETIME ;
         Z680TBW04_APPROVAL_USER_ID = A680TBW04_APPROVAL_USER_ID ;
         Z681TBW04_APPROVAL_AUTH_CD = A681TBW04_APPROVAL_AUTH_CD ;
         Z682TBW04_INPUT_END_FLG = A682TBW04_INPUT_END_FLG ;
         Z683TBW04_INPUT_END_DATETIME = A683TBW04_INPUT_END_DATETIME ;
         Z684TBW04_INPUT_END_USER_ID = A684TBW04_INPUT_END_USER_ID ;
         Z685TBW04_INPUT_END_AUTH_CD = A685TBW04_INPUT_END_AUTH_CD ;
         Z686TBW04_COMPLETION_FLG = A686TBW04_COMPLETION_FLG ;
         Z687TBW04_EDIT_FLG = A687TBW04_EDIT_FLG ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1742( )
   {
      /* Using cursor BC00174 */
      pr_default.execute(2, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A667TBW04_CRF_LATEST_VERSION = BC00174_A667TBW04_CRF_LATEST_VERSION[0] ;
         n667TBW04_CRF_LATEST_VERSION = BC00174_n667TBW04_CRF_LATEST_VERSION[0] ;
         A668TBW04_CRF_INPUT_LEVEL = BC00174_A668TBW04_CRF_INPUT_LEVEL[0] ;
         n668TBW04_CRF_INPUT_LEVEL = BC00174_n668TBW04_CRF_INPUT_LEVEL[0] ;
         A669TBW04_LOCK_FLG = BC00174_A669TBW04_LOCK_FLG[0] ;
         n669TBW04_LOCK_FLG = BC00174_n669TBW04_LOCK_FLG[0] ;
         A670TBW04_LOCK_DATETIME = BC00174_A670TBW04_LOCK_DATETIME[0] ;
         n670TBW04_LOCK_DATETIME = BC00174_n670TBW04_LOCK_DATETIME[0] ;
         A671TBW04_LOCK_USER_ID = BC00174_A671TBW04_LOCK_USER_ID[0] ;
         n671TBW04_LOCK_USER_ID = BC00174_n671TBW04_LOCK_USER_ID[0] ;
         A672TBW04_LOCK_AUTH_CD = BC00174_A672TBW04_LOCK_AUTH_CD[0] ;
         n672TBW04_LOCK_AUTH_CD = BC00174_n672TBW04_LOCK_AUTH_CD[0] ;
         A673TBW04_UPLOAD_DATETIME = BC00174_A673TBW04_UPLOAD_DATETIME[0] ;
         n673TBW04_UPLOAD_DATETIME = BC00174_n673TBW04_UPLOAD_DATETIME[0] ;
         A674TBW04_UPLOAD_USER_ID = BC00174_A674TBW04_UPLOAD_USER_ID[0] ;
         n674TBW04_UPLOAD_USER_ID = BC00174_n674TBW04_UPLOAD_USER_ID[0] ;
         A675TBW04_UPLOAD_AUTH_CD = BC00174_A675TBW04_UPLOAD_AUTH_CD[0] ;
         n675TBW04_UPLOAD_AUTH_CD = BC00174_n675TBW04_UPLOAD_AUTH_CD[0] ;
         A676TBW04_DM_ARRIVAL_FLG = BC00174_A676TBW04_DM_ARRIVAL_FLG[0] ;
         n676TBW04_DM_ARRIVAL_FLG = BC00174_n676TBW04_DM_ARRIVAL_FLG[0] ;
         A677TBW04_DM_ARRIVAL_DATETIME = BC00174_A677TBW04_DM_ARRIVAL_DATETIME[0] ;
         n677TBW04_DM_ARRIVAL_DATETIME = BC00174_n677TBW04_DM_ARRIVAL_DATETIME[0] ;
         A678TBW04_APPROVAL_FLG = BC00174_A678TBW04_APPROVAL_FLG[0] ;
         n678TBW04_APPROVAL_FLG = BC00174_n678TBW04_APPROVAL_FLG[0] ;
         A679TBW04_APPROVAL_DATETIME = BC00174_A679TBW04_APPROVAL_DATETIME[0] ;
         n679TBW04_APPROVAL_DATETIME = BC00174_n679TBW04_APPROVAL_DATETIME[0] ;
         A680TBW04_APPROVAL_USER_ID = BC00174_A680TBW04_APPROVAL_USER_ID[0] ;
         n680TBW04_APPROVAL_USER_ID = BC00174_n680TBW04_APPROVAL_USER_ID[0] ;
         A681TBW04_APPROVAL_AUTH_CD = BC00174_A681TBW04_APPROVAL_AUTH_CD[0] ;
         n681TBW04_APPROVAL_AUTH_CD = BC00174_n681TBW04_APPROVAL_AUTH_CD[0] ;
         A682TBW04_INPUT_END_FLG = BC00174_A682TBW04_INPUT_END_FLG[0] ;
         n682TBW04_INPUT_END_FLG = BC00174_n682TBW04_INPUT_END_FLG[0] ;
         A683TBW04_INPUT_END_DATETIME = BC00174_A683TBW04_INPUT_END_DATETIME[0] ;
         n683TBW04_INPUT_END_DATETIME = BC00174_n683TBW04_INPUT_END_DATETIME[0] ;
         A684TBW04_INPUT_END_USER_ID = BC00174_A684TBW04_INPUT_END_USER_ID[0] ;
         n684TBW04_INPUT_END_USER_ID = BC00174_n684TBW04_INPUT_END_USER_ID[0] ;
         A685TBW04_INPUT_END_AUTH_CD = BC00174_A685TBW04_INPUT_END_AUTH_CD[0] ;
         n685TBW04_INPUT_END_AUTH_CD = BC00174_n685TBW04_INPUT_END_AUTH_CD[0] ;
         A686TBW04_COMPLETION_FLG = BC00174_A686TBW04_COMPLETION_FLG[0] ;
         n686TBW04_COMPLETION_FLG = BC00174_n686TBW04_COMPLETION_FLG[0] ;
         A687TBW04_EDIT_FLG = BC00174_A687TBW04_EDIT_FLG[0] ;
         n687TBW04_EDIT_FLG = BC00174_n687TBW04_EDIT_FLG[0] ;
         zm1742( -6) ;
      }
      pr_default.close(2);
      onLoadActions1742( ) ;
   }

   public void onLoadActions1742( )
   {
      AV8Pgmname = "TBW04_CRF_BC" ;
   }

   public void checkExtendedTable1742( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TBW04_CRF_BC" ;
      if ( ! ( GXutil.nullDate().equals(A670TBW04_LOCK_DATETIME) || (( A670TBW04_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A670TBW04_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A673TBW04_UPLOAD_DATETIME) || (( A673TBW04_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A673TBW04_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A677TBW04_DM_ARRIVAL_DATETIME) || (( A677TBW04_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A677TBW04_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A679TBW04_APPROVAL_DATETIME) || (( A679TBW04_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A679TBW04_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A683TBW04_INPUT_END_DATETIME) || (( A683TBW04_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A683TBW04_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1742( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1742( )
   {
      /* Using cursor BC00175 */
      pr_default.execute(3, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00173 */
      pr_default.execute(1, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1742( 6) ;
         RcdFound42 = (short)(1) ;
         A661TBW04_SESSION_ID = BC00173_A661TBW04_SESSION_ID[0] ;
         A662TBW04_APP_ID = BC00173_A662TBW04_APP_ID[0] ;
         A663TBW04_DISP_DATETIME = BC00173_A663TBW04_DISP_DATETIME[0] ;
         A664TBW04_STUDY_ID = BC00173_A664TBW04_STUDY_ID[0] ;
         A665TBW04_SUBJECT_ID = BC00173_A665TBW04_SUBJECT_ID[0] ;
         A666TBW04_CRF_ID = BC00173_A666TBW04_CRF_ID[0] ;
         A667TBW04_CRF_LATEST_VERSION = BC00173_A667TBW04_CRF_LATEST_VERSION[0] ;
         n667TBW04_CRF_LATEST_VERSION = BC00173_n667TBW04_CRF_LATEST_VERSION[0] ;
         A668TBW04_CRF_INPUT_LEVEL = BC00173_A668TBW04_CRF_INPUT_LEVEL[0] ;
         n668TBW04_CRF_INPUT_LEVEL = BC00173_n668TBW04_CRF_INPUT_LEVEL[0] ;
         A669TBW04_LOCK_FLG = BC00173_A669TBW04_LOCK_FLG[0] ;
         n669TBW04_LOCK_FLG = BC00173_n669TBW04_LOCK_FLG[0] ;
         A670TBW04_LOCK_DATETIME = BC00173_A670TBW04_LOCK_DATETIME[0] ;
         n670TBW04_LOCK_DATETIME = BC00173_n670TBW04_LOCK_DATETIME[0] ;
         A671TBW04_LOCK_USER_ID = BC00173_A671TBW04_LOCK_USER_ID[0] ;
         n671TBW04_LOCK_USER_ID = BC00173_n671TBW04_LOCK_USER_ID[0] ;
         A672TBW04_LOCK_AUTH_CD = BC00173_A672TBW04_LOCK_AUTH_CD[0] ;
         n672TBW04_LOCK_AUTH_CD = BC00173_n672TBW04_LOCK_AUTH_CD[0] ;
         A673TBW04_UPLOAD_DATETIME = BC00173_A673TBW04_UPLOAD_DATETIME[0] ;
         n673TBW04_UPLOAD_DATETIME = BC00173_n673TBW04_UPLOAD_DATETIME[0] ;
         A674TBW04_UPLOAD_USER_ID = BC00173_A674TBW04_UPLOAD_USER_ID[0] ;
         n674TBW04_UPLOAD_USER_ID = BC00173_n674TBW04_UPLOAD_USER_ID[0] ;
         A675TBW04_UPLOAD_AUTH_CD = BC00173_A675TBW04_UPLOAD_AUTH_CD[0] ;
         n675TBW04_UPLOAD_AUTH_CD = BC00173_n675TBW04_UPLOAD_AUTH_CD[0] ;
         A676TBW04_DM_ARRIVAL_FLG = BC00173_A676TBW04_DM_ARRIVAL_FLG[0] ;
         n676TBW04_DM_ARRIVAL_FLG = BC00173_n676TBW04_DM_ARRIVAL_FLG[0] ;
         A677TBW04_DM_ARRIVAL_DATETIME = BC00173_A677TBW04_DM_ARRIVAL_DATETIME[0] ;
         n677TBW04_DM_ARRIVAL_DATETIME = BC00173_n677TBW04_DM_ARRIVAL_DATETIME[0] ;
         A678TBW04_APPROVAL_FLG = BC00173_A678TBW04_APPROVAL_FLG[0] ;
         n678TBW04_APPROVAL_FLG = BC00173_n678TBW04_APPROVAL_FLG[0] ;
         A679TBW04_APPROVAL_DATETIME = BC00173_A679TBW04_APPROVAL_DATETIME[0] ;
         n679TBW04_APPROVAL_DATETIME = BC00173_n679TBW04_APPROVAL_DATETIME[0] ;
         A680TBW04_APPROVAL_USER_ID = BC00173_A680TBW04_APPROVAL_USER_ID[0] ;
         n680TBW04_APPROVAL_USER_ID = BC00173_n680TBW04_APPROVAL_USER_ID[0] ;
         A681TBW04_APPROVAL_AUTH_CD = BC00173_A681TBW04_APPROVAL_AUTH_CD[0] ;
         n681TBW04_APPROVAL_AUTH_CD = BC00173_n681TBW04_APPROVAL_AUTH_CD[0] ;
         A682TBW04_INPUT_END_FLG = BC00173_A682TBW04_INPUT_END_FLG[0] ;
         n682TBW04_INPUT_END_FLG = BC00173_n682TBW04_INPUT_END_FLG[0] ;
         A683TBW04_INPUT_END_DATETIME = BC00173_A683TBW04_INPUT_END_DATETIME[0] ;
         n683TBW04_INPUT_END_DATETIME = BC00173_n683TBW04_INPUT_END_DATETIME[0] ;
         A684TBW04_INPUT_END_USER_ID = BC00173_A684TBW04_INPUT_END_USER_ID[0] ;
         n684TBW04_INPUT_END_USER_ID = BC00173_n684TBW04_INPUT_END_USER_ID[0] ;
         A685TBW04_INPUT_END_AUTH_CD = BC00173_A685TBW04_INPUT_END_AUTH_CD[0] ;
         n685TBW04_INPUT_END_AUTH_CD = BC00173_n685TBW04_INPUT_END_AUTH_CD[0] ;
         A686TBW04_COMPLETION_FLG = BC00173_A686TBW04_COMPLETION_FLG[0] ;
         n686TBW04_COMPLETION_FLG = BC00173_n686TBW04_COMPLETION_FLG[0] ;
         A687TBW04_EDIT_FLG = BC00173_A687TBW04_EDIT_FLG[0] ;
         n687TBW04_EDIT_FLG = BC00173_n687TBW04_EDIT_FLG[0] ;
         Z661TBW04_SESSION_ID = A661TBW04_SESSION_ID ;
         Z662TBW04_APP_ID = A662TBW04_APP_ID ;
         Z663TBW04_DISP_DATETIME = A663TBW04_DISP_DATETIME ;
         Z664TBW04_STUDY_ID = A664TBW04_STUDY_ID ;
         Z665TBW04_SUBJECT_ID = A665TBW04_SUBJECT_ID ;
         Z666TBW04_CRF_ID = A666TBW04_CRF_ID ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1742( ) ;
         Gx_mode = sMode42 ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1742( ) ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode42 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1742( ) ;
      if ( RcdFound42 == 0 )
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
      confirm_170( ) ;
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

   public void checkOptimisticConcurrency1742( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00172 */
         pr_default.execute(0, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW04_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z667TBW04_CRF_LATEST_VERSION != BC00172_A667TBW04_CRF_LATEST_VERSION[0] ) || ( Z668TBW04_CRF_INPUT_LEVEL != BC00172_A668TBW04_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z669TBW04_LOCK_FLG, BC00172_A669TBW04_LOCK_FLG[0]) != 0 ) || !( Z670TBW04_LOCK_DATETIME.equals( BC00172_A670TBW04_LOCK_DATETIME[0] ) ) || ( GXutil.strcmp(Z671TBW04_LOCK_USER_ID, BC00172_A671TBW04_LOCK_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z672TBW04_LOCK_AUTH_CD, BC00172_A672TBW04_LOCK_AUTH_CD[0]) != 0 ) || !( Z673TBW04_UPLOAD_DATETIME.equals( BC00172_A673TBW04_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z674TBW04_UPLOAD_USER_ID, BC00172_A674TBW04_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z675TBW04_UPLOAD_AUTH_CD, BC00172_A675TBW04_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z676TBW04_DM_ARRIVAL_FLG, BC00172_A676TBW04_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z677TBW04_DM_ARRIVAL_DATETIME.equals( BC00172_A677TBW04_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z678TBW04_APPROVAL_FLG, BC00172_A678TBW04_APPROVAL_FLG[0]) != 0 ) || !( Z679TBW04_APPROVAL_DATETIME.equals( BC00172_A679TBW04_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z680TBW04_APPROVAL_USER_ID, BC00172_A680TBW04_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z681TBW04_APPROVAL_AUTH_CD, BC00172_A681TBW04_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z682TBW04_INPUT_END_FLG, BC00172_A682TBW04_INPUT_END_FLG[0]) != 0 ) || !( Z683TBW04_INPUT_END_DATETIME.equals( BC00172_A683TBW04_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z684TBW04_INPUT_END_USER_ID, BC00172_A684TBW04_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z685TBW04_INPUT_END_AUTH_CD, BC00172_A685TBW04_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z686TBW04_COMPLETION_FLG, BC00172_A686TBW04_COMPLETION_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z687TBW04_EDIT_FLG, BC00172_A687TBW04_EDIT_FLG[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW04_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1742( )
   {
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1742( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1742( 0) ;
         checkOptimisticConcurrency1742( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1742( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1742( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00176 */
                  pr_default.execute(4, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID), new Boolean(n667TBW04_CRF_LATEST_VERSION), new Short(A667TBW04_CRF_LATEST_VERSION), new Boolean(n668TBW04_CRF_INPUT_LEVEL), new Byte(A668TBW04_CRF_INPUT_LEVEL), new Boolean(n669TBW04_LOCK_FLG), A669TBW04_LOCK_FLG, new Boolean(n670TBW04_LOCK_DATETIME), A670TBW04_LOCK_DATETIME, new Boolean(n671TBW04_LOCK_USER_ID), A671TBW04_LOCK_USER_ID, new Boolean(n672TBW04_LOCK_AUTH_CD), A672TBW04_LOCK_AUTH_CD, new Boolean(n673TBW04_UPLOAD_DATETIME), A673TBW04_UPLOAD_DATETIME, new Boolean(n674TBW04_UPLOAD_USER_ID), A674TBW04_UPLOAD_USER_ID, new Boolean(n675TBW04_UPLOAD_AUTH_CD), A675TBW04_UPLOAD_AUTH_CD, new Boolean(n676TBW04_DM_ARRIVAL_FLG), A676TBW04_DM_ARRIVAL_FLG, new Boolean(n677TBW04_DM_ARRIVAL_DATETIME), A677TBW04_DM_ARRIVAL_DATETIME, new Boolean(n678TBW04_APPROVAL_FLG), A678TBW04_APPROVAL_FLG, new Boolean(n679TBW04_APPROVAL_DATETIME), A679TBW04_APPROVAL_DATETIME, new Boolean(n680TBW04_APPROVAL_USER_ID), A680TBW04_APPROVAL_USER_ID, new Boolean(n681TBW04_APPROVAL_AUTH_CD), A681TBW04_APPROVAL_AUTH_CD, new Boolean(n682TBW04_INPUT_END_FLG), A682TBW04_INPUT_END_FLG, new Boolean(n683TBW04_INPUT_END_DATETIME), A683TBW04_INPUT_END_DATETIME, new Boolean(n684TBW04_INPUT_END_USER_ID), A684TBW04_INPUT_END_USER_ID, new Boolean(n685TBW04_INPUT_END_AUTH_CD), A685TBW04_INPUT_END_AUTH_CD, new Boolean(n686TBW04_COMPLETION_FLG), A686TBW04_COMPLETION_FLG, new Boolean(n687TBW04_EDIT_FLG), A687TBW04_EDIT_FLG});
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
            load1742( ) ;
         }
         endLevel1742( ) ;
      }
      closeExtendedTableCursors1742( ) ;
   }

   public void update1742( )
   {
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1742( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1742( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1742( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1742( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00177 */
                  pr_default.execute(5, new Object[] {new Boolean(n667TBW04_CRF_LATEST_VERSION), new Short(A667TBW04_CRF_LATEST_VERSION), new Boolean(n668TBW04_CRF_INPUT_LEVEL), new Byte(A668TBW04_CRF_INPUT_LEVEL), new Boolean(n669TBW04_LOCK_FLG), A669TBW04_LOCK_FLG, new Boolean(n670TBW04_LOCK_DATETIME), A670TBW04_LOCK_DATETIME, new Boolean(n671TBW04_LOCK_USER_ID), A671TBW04_LOCK_USER_ID, new Boolean(n672TBW04_LOCK_AUTH_CD), A672TBW04_LOCK_AUTH_CD, new Boolean(n673TBW04_UPLOAD_DATETIME), A673TBW04_UPLOAD_DATETIME, new Boolean(n674TBW04_UPLOAD_USER_ID), A674TBW04_UPLOAD_USER_ID, new Boolean(n675TBW04_UPLOAD_AUTH_CD), A675TBW04_UPLOAD_AUTH_CD, new Boolean(n676TBW04_DM_ARRIVAL_FLG), A676TBW04_DM_ARRIVAL_FLG, new Boolean(n677TBW04_DM_ARRIVAL_DATETIME), A677TBW04_DM_ARRIVAL_DATETIME, new Boolean(n678TBW04_APPROVAL_FLG), A678TBW04_APPROVAL_FLG, new Boolean(n679TBW04_APPROVAL_DATETIME), A679TBW04_APPROVAL_DATETIME, new Boolean(n680TBW04_APPROVAL_USER_ID), A680TBW04_APPROVAL_USER_ID, new Boolean(n681TBW04_APPROVAL_AUTH_CD), A681TBW04_APPROVAL_AUTH_CD, new Boolean(n682TBW04_INPUT_END_FLG), A682TBW04_INPUT_END_FLG, new Boolean(n683TBW04_INPUT_END_DATETIME), A683TBW04_INPUT_END_DATETIME, new Boolean(n684TBW04_INPUT_END_USER_ID), A684TBW04_INPUT_END_USER_ID, new Boolean(n685TBW04_INPUT_END_AUTH_CD), A685TBW04_INPUT_END_AUTH_CD, new Boolean(n686TBW04_COMPLETION_FLG), A686TBW04_COMPLETION_FLG, new Boolean(n687TBW04_EDIT_FLG), A687TBW04_EDIT_FLG, A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW04_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1742( ) ;
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
         endLevel1742( ) ;
      }
      closeExtendedTableCursors1742( ) ;
   }

   public void deferredUpdate1742( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1742( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1742( ) ;
         afterConfirm1742( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1742( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00178 */
               pr_default.execute(6, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
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
      sMode42 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1742( ) ;
      Gx_mode = sMode42 ;
   }

   public void onDeleteControls1742( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW04_CRF_BC" ;
      }
   }

   public void endLevel1742( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1742( ) ;
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

   public void scanKeyStart1742( )
   {
      /* Using cursor BC00179 */
      pr_default.execute(7, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A661TBW04_SESSION_ID = BC00179_A661TBW04_SESSION_ID[0] ;
         A662TBW04_APP_ID = BC00179_A662TBW04_APP_ID[0] ;
         A663TBW04_DISP_DATETIME = BC00179_A663TBW04_DISP_DATETIME[0] ;
         A664TBW04_STUDY_ID = BC00179_A664TBW04_STUDY_ID[0] ;
         A665TBW04_SUBJECT_ID = BC00179_A665TBW04_SUBJECT_ID[0] ;
         A666TBW04_CRF_ID = BC00179_A666TBW04_CRF_ID[0] ;
         A667TBW04_CRF_LATEST_VERSION = BC00179_A667TBW04_CRF_LATEST_VERSION[0] ;
         n667TBW04_CRF_LATEST_VERSION = BC00179_n667TBW04_CRF_LATEST_VERSION[0] ;
         A668TBW04_CRF_INPUT_LEVEL = BC00179_A668TBW04_CRF_INPUT_LEVEL[0] ;
         n668TBW04_CRF_INPUT_LEVEL = BC00179_n668TBW04_CRF_INPUT_LEVEL[0] ;
         A669TBW04_LOCK_FLG = BC00179_A669TBW04_LOCK_FLG[0] ;
         n669TBW04_LOCK_FLG = BC00179_n669TBW04_LOCK_FLG[0] ;
         A670TBW04_LOCK_DATETIME = BC00179_A670TBW04_LOCK_DATETIME[0] ;
         n670TBW04_LOCK_DATETIME = BC00179_n670TBW04_LOCK_DATETIME[0] ;
         A671TBW04_LOCK_USER_ID = BC00179_A671TBW04_LOCK_USER_ID[0] ;
         n671TBW04_LOCK_USER_ID = BC00179_n671TBW04_LOCK_USER_ID[0] ;
         A672TBW04_LOCK_AUTH_CD = BC00179_A672TBW04_LOCK_AUTH_CD[0] ;
         n672TBW04_LOCK_AUTH_CD = BC00179_n672TBW04_LOCK_AUTH_CD[0] ;
         A673TBW04_UPLOAD_DATETIME = BC00179_A673TBW04_UPLOAD_DATETIME[0] ;
         n673TBW04_UPLOAD_DATETIME = BC00179_n673TBW04_UPLOAD_DATETIME[0] ;
         A674TBW04_UPLOAD_USER_ID = BC00179_A674TBW04_UPLOAD_USER_ID[0] ;
         n674TBW04_UPLOAD_USER_ID = BC00179_n674TBW04_UPLOAD_USER_ID[0] ;
         A675TBW04_UPLOAD_AUTH_CD = BC00179_A675TBW04_UPLOAD_AUTH_CD[0] ;
         n675TBW04_UPLOAD_AUTH_CD = BC00179_n675TBW04_UPLOAD_AUTH_CD[0] ;
         A676TBW04_DM_ARRIVAL_FLG = BC00179_A676TBW04_DM_ARRIVAL_FLG[0] ;
         n676TBW04_DM_ARRIVAL_FLG = BC00179_n676TBW04_DM_ARRIVAL_FLG[0] ;
         A677TBW04_DM_ARRIVAL_DATETIME = BC00179_A677TBW04_DM_ARRIVAL_DATETIME[0] ;
         n677TBW04_DM_ARRIVAL_DATETIME = BC00179_n677TBW04_DM_ARRIVAL_DATETIME[0] ;
         A678TBW04_APPROVAL_FLG = BC00179_A678TBW04_APPROVAL_FLG[0] ;
         n678TBW04_APPROVAL_FLG = BC00179_n678TBW04_APPROVAL_FLG[0] ;
         A679TBW04_APPROVAL_DATETIME = BC00179_A679TBW04_APPROVAL_DATETIME[0] ;
         n679TBW04_APPROVAL_DATETIME = BC00179_n679TBW04_APPROVAL_DATETIME[0] ;
         A680TBW04_APPROVAL_USER_ID = BC00179_A680TBW04_APPROVAL_USER_ID[0] ;
         n680TBW04_APPROVAL_USER_ID = BC00179_n680TBW04_APPROVAL_USER_ID[0] ;
         A681TBW04_APPROVAL_AUTH_CD = BC00179_A681TBW04_APPROVAL_AUTH_CD[0] ;
         n681TBW04_APPROVAL_AUTH_CD = BC00179_n681TBW04_APPROVAL_AUTH_CD[0] ;
         A682TBW04_INPUT_END_FLG = BC00179_A682TBW04_INPUT_END_FLG[0] ;
         n682TBW04_INPUT_END_FLG = BC00179_n682TBW04_INPUT_END_FLG[0] ;
         A683TBW04_INPUT_END_DATETIME = BC00179_A683TBW04_INPUT_END_DATETIME[0] ;
         n683TBW04_INPUT_END_DATETIME = BC00179_n683TBW04_INPUT_END_DATETIME[0] ;
         A684TBW04_INPUT_END_USER_ID = BC00179_A684TBW04_INPUT_END_USER_ID[0] ;
         n684TBW04_INPUT_END_USER_ID = BC00179_n684TBW04_INPUT_END_USER_ID[0] ;
         A685TBW04_INPUT_END_AUTH_CD = BC00179_A685TBW04_INPUT_END_AUTH_CD[0] ;
         n685TBW04_INPUT_END_AUTH_CD = BC00179_n685TBW04_INPUT_END_AUTH_CD[0] ;
         A686TBW04_COMPLETION_FLG = BC00179_A686TBW04_COMPLETION_FLG[0] ;
         n686TBW04_COMPLETION_FLG = BC00179_n686TBW04_COMPLETION_FLG[0] ;
         A687TBW04_EDIT_FLG = BC00179_A687TBW04_EDIT_FLG[0] ;
         n687TBW04_EDIT_FLG = BC00179_n687TBW04_EDIT_FLG[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1742( )
   {
      pr_default.readNext(7);
      RcdFound42 = (short)(0) ;
      scanKeyLoad1742( ) ;
   }

   public void scanKeyLoad1742( )
   {
      sMode42 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A661TBW04_SESSION_ID = BC00179_A661TBW04_SESSION_ID[0] ;
         A662TBW04_APP_ID = BC00179_A662TBW04_APP_ID[0] ;
         A663TBW04_DISP_DATETIME = BC00179_A663TBW04_DISP_DATETIME[0] ;
         A664TBW04_STUDY_ID = BC00179_A664TBW04_STUDY_ID[0] ;
         A665TBW04_SUBJECT_ID = BC00179_A665TBW04_SUBJECT_ID[0] ;
         A666TBW04_CRF_ID = BC00179_A666TBW04_CRF_ID[0] ;
         A667TBW04_CRF_LATEST_VERSION = BC00179_A667TBW04_CRF_LATEST_VERSION[0] ;
         n667TBW04_CRF_LATEST_VERSION = BC00179_n667TBW04_CRF_LATEST_VERSION[0] ;
         A668TBW04_CRF_INPUT_LEVEL = BC00179_A668TBW04_CRF_INPUT_LEVEL[0] ;
         n668TBW04_CRF_INPUT_LEVEL = BC00179_n668TBW04_CRF_INPUT_LEVEL[0] ;
         A669TBW04_LOCK_FLG = BC00179_A669TBW04_LOCK_FLG[0] ;
         n669TBW04_LOCK_FLG = BC00179_n669TBW04_LOCK_FLG[0] ;
         A670TBW04_LOCK_DATETIME = BC00179_A670TBW04_LOCK_DATETIME[0] ;
         n670TBW04_LOCK_DATETIME = BC00179_n670TBW04_LOCK_DATETIME[0] ;
         A671TBW04_LOCK_USER_ID = BC00179_A671TBW04_LOCK_USER_ID[0] ;
         n671TBW04_LOCK_USER_ID = BC00179_n671TBW04_LOCK_USER_ID[0] ;
         A672TBW04_LOCK_AUTH_CD = BC00179_A672TBW04_LOCK_AUTH_CD[0] ;
         n672TBW04_LOCK_AUTH_CD = BC00179_n672TBW04_LOCK_AUTH_CD[0] ;
         A673TBW04_UPLOAD_DATETIME = BC00179_A673TBW04_UPLOAD_DATETIME[0] ;
         n673TBW04_UPLOAD_DATETIME = BC00179_n673TBW04_UPLOAD_DATETIME[0] ;
         A674TBW04_UPLOAD_USER_ID = BC00179_A674TBW04_UPLOAD_USER_ID[0] ;
         n674TBW04_UPLOAD_USER_ID = BC00179_n674TBW04_UPLOAD_USER_ID[0] ;
         A675TBW04_UPLOAD_AUTH_CD = BC00179_A675TBW04_UPLOAD_AUTH_CD[0] ;
         n675TBW04_UPLOAD_AUTH_CD = BC00179_n675TBW04_UPLOAD_AUTH_CD[0] ;
         A676TBW04_DM_ARRIVAL_FLG = BC00179_A676TBW04_DM_ARRIVAL_FLG[0] ;
         n676TBW04_DM_ARRIVAL_FLG = BC00179_n676TBW04_DM_ARRIVAL_FLG[0] ;
         A677TBW04_DM_ARRIVAL_DATETIME = BC00179_A677TBW04_DM_ARRIVAL_DATETIME[0] ;
         n677TBW04_DM_ARRIVAL_DATETIME = BC00179_n677TBW04_DM_ARRIVAL_DATETIME[0] ;
         A678TBW04_APPROVAL_FLG = BC00179_A678TBW04_APPROVAL_FLG[0] ;
         n678TBW04_APPROVAL_FLG = BC00179_n678TBW04_APPROVAL_FLG[0] ;
         A679TBW04_APPROVAL_DATETIME = BC00179_A679TBW04_APPROVAL_DATETIME[0] ;
         n679TBW04_APPROVAL_DATETIME = BC00179_n679TBW04_APPROVAL_DATETIME[0] ;
         A680TBW04_APPROVAL_USER_ID = BC00179_A680TBW04_APPROVAL_USER_ID[0] ;
         n680TBW04_APPROVAL_USER_ID = BC00179_n680TBW04_APPROVAL_USER_ID[0] ;
         A681TBW04_APPROVAL_AUTH_CD = BC00179_A681TBW04_APPROVAL_AUTH_CD[0] ;
         n681TBW04_APPROVAL_AUTH_CD = BC00179_n681TBW04_APPROVAL_AUTH_CD[0] ;
         A682TBW04_INPUT_END_FLG = BC00179_A682TBW04_INPUT_END_FLG[0] ;
         n682TBW04_INPUT_END_FLG = BC00179_n682TBW04_INPUT_END_FLG[0] ;
         A683TBW04_INPUT_END_DATETIME = BC00179_A683TBW04_INPUT_END_DATETIME[0] ;
         n683TBW04_INPUT_END_DATETIME = BC00179_n683TBW04_INPUT_END_DATETIME[0] ;
         A684TBW04_INPUT_END_USER_ID = BC00179_A684TBW04_INPUT_END_USER_ID[0] ;
         n684TBW04_INPUT_END_USER_ID = BC00179_n684TBW04_INPUT_END_USER_ID[0] ;
         A685TBW04_INPUT_END_AUTH_CD = BC00179_A685TBW04_INPUT_END_AUTH_CD[0] ;
         n685TBW04_INPUT_END_AUTH_CD = BC00179_n685TBW04_INPUT_END_AUTH_CD[0] ;
         A686TBW04_COMPLETION_FLG = BC00179_A686TBW04_COMPLETION_FLG[0] ;
         n686TBW04_COMPLETION_FLG = BC00179_n686TBW04_COMPLETION_FLG[0] ;
         A687TBW04_EDIT_FLG = BC00179_A687TBW04_EDIT_FLG[0] ;
         n687TBW04_EDIT_FLG = BC00179_n687TBW04_EDIT_FLG[0] ;
      }
      Gx_mode = sMode42 ;
   }

   public void scanKeyEnd1742( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1742( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1742( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1742( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1742( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1742( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1742( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1742( )
   {
   }

   public void addRow1742( )
   {
      VarsToRow42( bcTBW04_CRF) ;
   }

   public void readRow1742( )
   {
      RowToVars42( bcTBW04_CRF, 1) ;
   }

   public void initializeNonKey1742( )
   {
      A667TBW04_CRF_LATEST_VERSION = (short)(0) ;
      n667TBW04_CRF_LATEST_VERSION = false ;
      A668TBW04_CRF_INPUT_LEVEL = (byte)(0) ;
      n668TBW04_CRF_INPUT_LEVEL = false ;
      A669TBW04_LOCK_FLG = "" ;
      n669TBW04_LOCK_FLG = false ;
      A670TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n670TBW04_LOCK_DATETIME = false ;
      A671TBW04_LOCK_USER_ID = "" ;
      n671TBW04_LOCK_USER_ID = false ;
      A672TBW04_LOCK_AUTH_CD = "" ;
      n672TBW04_LOCK_AUTH_CD = false ;
      A673TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n673TBW04_UPLOAD_DATETIME = false ;
      A674TBW04_UPLOAD_USER_ID = "" ;
      n674TBW04_UPLOAD_USER_ID = false ;
      A675TBW04_UPLOAD_AUTH_CD = "" ;
      n675TBW04_UPLOAD_AUTH_CD = false ;
      A676TBW04_DM_ARRIVAL_FLG = "" ;
      n676TBW04_DM_ARRIVAL_FLG = false ;
      A677TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n677TBW04_DM_ARRIVAL_DATETIME = false ;
      A678TBW04_APPROVAL_FLG = "" ;
      n678TBW04_APPROVAL_FLG = false ;
      A679TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n679TBW04_APPROVAL_DATETIME = false ;
      A680TBW04_APPROVAL_USER_ID = "" ;
      n680TBW04_APPROVAL_USER_ID = false ;
      A681TBW04_APPROVAL_AUTH_CD = "" ;
      n681TBW04_APPROVAL_AUTH_CD = false ;
      A682TBW04_INPUT_END_FLG = "" ;
      n682TBW04_INPUT_END_FLG = false ;
      A683TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n683TBW04_INPUT_END_DATETIME = false ;
      A684TBW04_INPUT_END_USER_ID = "" ;
      n684TBW04_INPUT_END_USER_ID = false ;
      A685TBW04_INPUT_END_AUTH_CD = "" ;
      n685TBW04_INPUT_END_AUTH_CD = false ;
      A686TBW04_COMPLETION_FLG = "" ;
      n686TBW04_COMPLETION_FLG = false ;
      A687TBW04_EDIT_FLG = "" ;
      n687TBW04_EDIT_FLG = false ;
   }

   public void initAll1742( )
   {
      A661TBW04_SESSION_ID = "" ;
      A662TBW04_APP_ID = "" ;
      A663TBW04_DISP_DATETIME = "" ;
      A664TBW04_STUDY_ID = 0 ;
      A665TBW04_SUBJECT_ID = 0 ;
      A666TBW04_CRF_ID = (short)(0) ;
      initializeNonKey1742( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow42( SdtTBW04_CRF obj42 )
   {
      obj42.setgxTv_SdtTBW04_CRF_Mode( Gx_mode );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version( A667TBW04_CRF_LATEST_VERSION );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_input_level( A668TBW04_CRF_INPUT_LEVEL );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_flg( A669TBW04_LOCK_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_datetime( A670TBW04_LOCK_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_user_id( A671TBW04_LOCK_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd( A672TBW04_LOCK_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_datetime( A673TBW04_UPLOAD_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_user_id( A674TBW04_UPLOAD_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd( A675TBW04_UPLOAD_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg( A676TBW04_DM_ARRIVAL_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime( A677TBW04_DM_ARRIVAL_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_flg( A678TBW04_APPROVAL_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_datetime( A679TBW04_APPROVAL_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_user_id( A680TBW04_APPROVAL_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd( A681TBW04_APPROVAL_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_flg( A682TBW04_INPUT_END_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime( A683TBW04_INPUT_END_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id( A684TBW04_INPUT_END_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd( A685TBW04_INPUT_END_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_completion_flg( A686TBW04_COMPLETION_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_edit_flg( A687TBW04_EDIT_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_session_id( A661TBW04_SESSION_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_app_id( A662TBW04_APP_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_disp_datetime( A663TBW04_DISP_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_study_id( A664TBW04_STUDY_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_subject_id( A665TBW04_SUBJECT_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_id( A666TBW04_CRF_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_session_id_Z( Z661TBW04_SESSION_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_app_id_Z( Z662TBW04_APP_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z( Z663TBW04_DISP_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_study_id_Z( Z664TBW04_STUDY_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_subject_id_Z( Z665TBW04_SUBJECT_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_id_Z( Z666TBW04_CRF_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_Z( Z667TBW04_CRF_LATEST_VERSION );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_input_level_Z( Z668TBW04_CRF_INPUT_LEVEL );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z( Z669TBW04_LOCK_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z( Z670TBW04_LOCK_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z( Z671TBW04_LOCK_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z( Z672TBW04_LOCK_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z( Z673TBW04_UPLOAD_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z( Z674TBW04_UPLOAD_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z( Z675TBW04_UPLOAD_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z( Z676TBW04_DM_ARRIVAL_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z( Z677TBW04_DM_ARRIVAL_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z( Z678TBW04_APPROVAL_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z( Z679TBW04_APPROVAL_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z( Z680TBW04_APPROVAL_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z( Z681TBW04_APPROVAL_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z( Z682TBW04_INPUT_END_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z( Z683TBW04_INPUT_END_DATETIME );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z( Z684TBW04_INPUT_END_USER_ID );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z( Z685TBW04_INPUT_END_AUTH_CD );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z( Z686TBW04_COMPLETION_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z( Z687TBW04_EDIT_FLG );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_N( (byte)((byte)((n667TBW04_CRF_LATEST_VERSION)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_crf_input_level_N( (byte)((byte)((n668TBW04_CRF_INPUT_LEVEL)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_flg_N( (byte)((byte)((n669TBW04_LOCK_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_datetime_N( (byte)((byte)((n670TBW04_LOCK_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_user_id_N( (byte)((byte)((n671TBW04_LOCK_USER_ID)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_N( (byte)((byte)((n672TBW04_LOCK_AUTH_CD)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_datetime_N( (byte)((byte)((n673TBW04_UPLOAD_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_user_id_N( (byte)((byte)((n674TBW04_UPLOAD_USER_ID)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_N( (byte)((byte)((n675TBW04_UPLOAD_AUTH_CD)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_N( (byte)((byte)((n676TBW04_DM_ARRIVAL_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_N( (byte)((byte)((n677TBW04_DM_ARRIVAL_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_flg_N( (byte)((byte)((n678TBW04_APPROVAL_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_datetime_N( (byte)((byte)((n679TBW04_APPROVAL_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_user_id_N( (byte)((byte)((n680TBW04_APPROVAL_USER_ID)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_N( (byte)((byte)((n681TBW04_APPROVAL_AUTH_CD)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_flg_N( (byte)((byte)((n682TBW04_INPUT_END_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_N( (byte)((byte)((n683TBW04_INPUT_END_DATETIME)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_N( (byte)((byte)((n684TBW04_INPUT_END_USER_ID)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_N( (byte)((byte)((n685TBW04_INPUT_END_AUTH_CD)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_completion_flg_N( (byte)((byte)((n686TBW04_COMPLETION_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Tbw04_edit_flg_N( (byte)((byte)((n687TBW04_EDIT_FLG)?1:0)) );
      obj42.setgxTv_SdtTBW04_CRF_Mode( Gx_mode );
   }

   public void RowToVars42( SdtTBW04_CRF obj42 ,
                            int forceLoad )
   {
      Gx_mode = obj42.getgxTv_SdtTBW04_CRF_Mode() ;
      A667TBW04_CRF_LATEST_VERSION = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version() ;
      n667TBW04_CRF_LATEST_VERSION = false ;
      A668TBW04_CRF_INPUT_LEVEL = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_input_level() ;
      n668TBW04_CRF_INPUT_LEVEL = false ;
      A669TBW04_LOCK_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_flg() ;
      n669TBW04_LOCK_FLG = false ;
      A670TBW04_LOCK_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_datetime() ;
      n670TBW04_LOCK_DATETIME = false ;
      A671TBW04_LOCK_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_user_id() ;
      n671TBW04_LOCK_USER_ID = false ;
      A672TBW04_LOCK_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd() ;
      n672TBW04_LOCK_AUTH_CD = false ;
      A673TBW04_UPLOAD_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_datetime() ;
      n673TBW04_UPLOAD_DATETIME = false ;
      A674TBW04_UPLOAD_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_user_id() ;
      n674TBW04_UPLOAD_USER_ID = false ;
      A675TBW04_UPLOAD_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd() ;
      n675TBW04_UPLOAD_AUTH_CD = false ;
      A676TBW04_DM_ARRIVAL_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg() ;
      n676TBW04_DM_ARRIVAL_FLG = false ;
      A677TBW04_DM_ARRIVAL_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime() ;
      n677TBW04_DM_ARRIVAL_DATETIME = false ;
      A678TBW04_APPROVAL_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_flg() ;
      n678TBW04_APPROVAL_FLG = false ;
      A679TBW04_APPROVAL_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_datetime() ;
      n679TBW04_APPROVAL_DATETIME = false ;
      A680TBW04_APPROVAL_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_user_id() ;
      n680TBW04_APPROVAL_USER_ID = false ;
      A681TBW04_APPROVAL_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd() ;
      n681TBW04_APPROVAL_AUTH_CD = false ;
      A682TBW04_INPUT_END_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_flg() ;
      n682TBW04_INPUT_END_FLG = false ;
      A683TBW04_INPUT_END_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime() ;
      n683TBW04_INPUT_END_DATETIME = false ;
      A684TBW04_INPUT_END_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id() ;
      n684TBW04_INPUT_END_USER_ID = false ;
      A685TBW04_INPUT_END_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd() ;
      n685TBW04_INPUT_END_AUTH_CD = false ;
      A686TBW04_COMPLETION_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_completion_flg() ;
      n686TBW04_COMPLETION_FLG = false ;
      A687TBW04_EDIT_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_edit_flg() ;
      n687TBW04_EDIT_FLG = false ;
      A661TBW04_SESSION_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_session_id() ;
      A662TBW04_APP_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_app_id() ;
      A663TBW04_DISP_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_disp_datetime() ;
      A664TBW04_STUDY_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_study_id() ;
      A665TBW04_SUBJECT_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_subject_id() ;
      A666TBW04_CRF_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_id() ;
      Z661TBW04_SESSION_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_session_id_Z() ;
      Z662TBW04_APP_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_app_id_Z() ;
      Z663TBW04_DISP_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z() ;
      Z664TBW04_STUDY_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_study_id_Z() ;
      Z665TBW04_SUBJECT_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_subject_id_Z() ;
      Z666TBW04_CRF_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_id_Z() ;
      Z667TBW04_CRF_LATEST_VERSION = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_Z() ;
      Z668TBW04_CRF_INPUT_LEVEL = obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_input_level_Z() ;
      Z669TBW04_LOCK_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z() ;
      Z670TBW04_LOCK_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z() ;
      Z671TBW04_LOCK_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z() ;
      Z672TBW04_LOCK_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z() ;
      Z673TBW04_UPLOAD_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z() ;
      Z674TBW04_UPLOAD_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z() ;
      Z675TBW04_UPLOAD_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z() ;
      Z676TBW04_DM_ARRIVAL_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z() ;
      Z677TBW04_DM_ARRIVAL_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z() ;
      Z678TBW04_APPROVAL_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z() ;
      Z679TBW04_APPROVAL_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z() ;
      Z680TBW04_APPROVAL_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z() ;
      Z681TBW04_APPROVAL_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z() ;
      Z682TBW04_INPUT_END_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z() ;
      Z683TBW04_INPUT_END_DATETIME = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z() ;
      Z684TBW04_INPUT_END_USER_ID = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z() ;
      Z685TBW04_INPUT_END_AUTH_CD = obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z() ;
      Z686TBW04_COMPLETION_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z() ;
      Z687TBW04_EDIT_FLG = obj42.getgxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z() ;
      n667TBW04_CRF_LATEST_VERSION = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_N()==0)?false:true) ;
      n668TBW04_CRF_INPUT_LEVEL = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_crf_input_level_N()==0)?false:true) ;
      n669TBW04_LOCK_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_flg_N()==0)?false:true) ;
      n670TBW04_LOCK_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_datetime_N()==0)?false:true) ;
      n671TBW04_LOCK_USER_ID = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_user_id_N()==0)?false:true) ;
      n672TBW04_LOCK_AUTH_CD = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_N()==0)?false:true) ;
      n673TBW04_UPLOAD_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_datetime_N()==0)?false:true) ;
      n674TBW04_UPLOAD_USER_ID = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_user_id_N()==0)?false:true) ;
      n675TBW04_UPLOAD_AUTH_CD = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_N()==0)?false:true) ;
      n676TBW04_DM_ARRIVAL_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_N()==0)?false:true) ;
      n677TBW04_DM_ARRIVAL_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_N()==0)?false:true) ;
      n678TBW04_APPROVAL_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_flg_N()==0)?false:true) ;
      n679TBW04_APPROVAL_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_datetime_N()==0)?false:true) ;
      n680TBW04_APPROVAL_USER_ID = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_user_id_N()==0)?false:true) ;
      n681TBW04_APPROVAL_AUTH_CD = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_N()==0)?false:true) ;
      n682TBW04_INPUT_END_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_flg_N()==0)?false:true) ;
      n683TBW04_INPUT_END_DATETIME = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_N()==0)?false:true) ;
      n684TBW04_INPUT_END_USER_ID = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_N()==0)?false:true) ;
      n685TBW04_INPUT_END_AUTH_CD = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_N()==0)?false:true) ;
      n686TBW04_COMPLETION_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_completion_flg_N()==0)?false:true) ;
      n687TBW04_EDIT_FLG = (boolean)((obj42.getgxTv_SdtTBW04_CRF_Tbw04_edit_flg_N()==0)?false:true) ;
      Gx_mode = obj42.getgxTv_SdtTBW04_CRF_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A661TBW04_SESSION_ID = (String)getParm(obj,0) ;
      A662TBW04_APP_ID = (String)getParm(obj,1) ;
      A663TBW04_DISP_DATETIME = (String)getParm(obj,2) ;
      A664TBW04_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      A665TBW04_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      A666TBW04_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1742( ) ;
      scanKeyStart1742( ) ;
      if ( RcdFound42 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z661TBW04_SESSION_ID = A661TBW04_SESSION_ID ;
         Z662TBW04_APP_ID = A662TBW04_APP_ID ;
         Z663TBW04_DISP_DATETIME = A663TBW04_DISP_DATETIME ;
         Z664TBW04_STUDY_ID = A664TBW04_STUDY_ID ;
         Z665TBW04_SUBJECT_ID = A665TBW04_SUBJECT_ID ;
         Z666TBW04_CRF_ID = A666TBW04_CRF_ID ;
      }
      zm1742( -6) ;
      sMode42 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1742( ) ;
      Gx_mode = sMode42 ;
      addRow1742( ) ;
      scanKeyEnd1742( ) ;
      if ( RcdFound42 == 0 )
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
      RowToVars42( bcTBW04_CRF, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1742( ) ;
      if ( RcdFound42 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A661TBW04_SESSION_ID, Z661TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A662TBW04_APP_ID, Z662TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A663TBW04_DISP_DATETIME, Z663TBW04_DISP_DATETIME) != 0 ) || ( A664TBW04_STUDY_ID != Z664TBW04_STUDY_ID ) || ( A665TBW04_SUBJECT_ID != Z665TBW04_SUBJECT_ID ) || ( A666TBW04_CRF_ID != Z666TBW04_CRF_ID ) )
         {
            A661TBW04_SESSION_ID = Z661TBW04_SESSION_ID ;
            A662TBW04_APP_ID = Z662TBW04_APP_ID ;
            A663TBW04_DISP_DATETIME = Z663TBW04_DISP_DATETIME ;
            A664TBW04_STUDY_ID = Z664TBW04_STUDY_ID ;
            A665TBW04_SUBJECT_ID = Z665TBW04_SUBJECT_ID ;
            A666TBW04_CRF_ID = Z666TBW04_CRF_ID ;
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
            update1742( ) ;
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
            if ( ( GXutil.strcmp(A661TBW04_SESSION_ID, Z661TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A662TBW04_APP_ID, Z662TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A663TBW04_DISP_DATETIME, Z663TBW04_DISP_DATETIME) != 0 ) || ( A664TBW04_STUDY_ID != Z664TBW04_STUDY_ID ) || ( A665TBW04_SUBJECT_ID != Z665TBW04_SUBJECT_ID ) || ( A666TBW04_CRF_ID != Z666TBW04_CRF_ID ) )
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
                  insert1742( ) ;
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
                  insert1742( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow42( bcTBW04_CRF) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars42( bcTBW04_CRF, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1742( ) ;
      if ( RcdFound42 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A661TBW04_SESSION_ID, Z661TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A662TBW04_APP_ID, Z662TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A663TBW04_DISP_DATETIME, Z663TBW04_DISP_DATETIME) != 0 ) || ( A664TBW04_STUDY_ID != Z664TBW04_STUDY_ID ) || ( A665TBW04_SUBJECT_ID != Z665TBW04_SUBJECT_ID ) || ( A666TBW04_CRF_ID != Z666TBW04_CRF_ID ) )
         {
            A661TBW04_SESSION_ID = Z661TBW04_SESSION_ID ;
            A662TBW04_APP_ID = Z662TBW04_APP_ID ;
            A663TBW04_DISP_DATETIME = Z663TBW04_DISP_DATETIME ;
            A664TBW04_STUDY_ID = Z664TBW04_STUDY_ID ;
            A665TBW04_SUBJECT_ID = Z665TBW04_SUBJECT_ID ;
            A666TBW04_CRF_ID = Z666TBW04_CRF_ID ;
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
         if ( ( GXutil.strcmp(A661TBW04_SESSION_ID, Z661TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A662TBW04_APP_ID, Z662TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A663TBW04_DISP_DATETIME, Z663TBW04_DISP_DATETIME) != 0 ) || ( A664TBW04_STUDY_ID != Z664TBW04_STUDY_ID ) || ( A665TBW04_SUBJECT_ID != Z665TBW04_SUBJECT_ID ) || ( A666TBW04_CRF_ID != Z666TBW04_CRF_ID ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbw04_crf_bc");
      VarsToRow42( bcTBW04_CRF) ;
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
      Gx_mode = bcTBW04_CRF.getgxTv_SdtTBW04_CRF_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBW04_CRF.setgxTv_SdtTBW04_CRF_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBW04_CRF sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBW04_CRF )
      {
         bcTBW04_CRF = sdt ;
         if ( GXutil.strcmp(bcTBW04_CRF.getgxTv_SdtTBW04_CRF_Mode(), "") == 0 )
         {
            bcTBW04_CRF.setgxTv_SdtTBW04_CRF_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow42( bcTBW04_CRF) ;
         }
         else
         {
            RowToVars42( bcTBW04_CRF, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBW04_CRF.getgxTv_SdtTBW04_CRF_Mode(), "") == 0 )
         {
            bcTBW04_CRF.setgxTv_SdtTBW04_CRF_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars42( bcTBW04_CRF, 1) ;
   }

   public SdtTBW04_CRF getTBW04_CRF_BC( )
   {
      return bcTBW04_CRF ;
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
      Z661TBW04_SESSION_ID = "" ;
      A661TBW04_SESSION_ID = "" ;
      Z662TBW04_APP_ID = "" ;
      A662TBW04_APP_ID = "" ;
      Z663TBW04_DISP_DATETIME = "" ;
      A663TBW04_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_session_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_app_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z = "" ;
      Z669TBW04_LOCK_FLG = "" ;
      A669TBW04_LOCK_FLG = "" ;
      Z670TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A670TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z671TBW04_LOCK_USER_ID = "" ;
      A671TBW04_LOCK_USER_ID = "" ;
      Z672TBW04_LOCK_AUTH_CD = "" ;
      A672TBW04_LOCK_AUTH_CD = "" ;
      Z673TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A673TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z674TBW04_UPLOAD_USER_ID = "" ;
      A674TBW04_UPLOAD_USER_ID = "" ;
      Z675TBW04_UPLOAD_AUTH_CD = "" ;
      A675TBW04_UPLOAD_AUTH_CD = "" ;
      Z676TBW04_DM_ARRIVAL_FLG = "" ;
      A676TBW04_DM_ARRIVAL_FLG = "" ;
      Z677TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A677TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z678TBW04_APPROVAL_FLG = "" ;
      A678TBW04_APPROVAL_FLG = "" ;
      Z679TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A679TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z680TBW04_APPROVAL_USER_ID = "" ;
      A680TBW04_APPROVAL_USER_ID = "" ;
      Z681TBW04_APPROVAL_AUTH_CD = "" ;
      A681TBW04_APPROVAL_AUTH_CD = "" ;
      Z682TBW04_INPUT_END_FLG = "" ;
      A682TBW04_INPUT_END_FLG = "" ;
      Z683TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A683TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z684TBW04_INPUT_END_USER_ID = "" ;
      A684TBW04_INPUT_END_USER_ID = "" ;
      Z685TBW04_INPUT_END_AUTH_CD = "" ;
      A685TBW04_INPUT_END_AUTH_CD = "" ;
      Z686TBW04_COMPLETION_FLG = "" ;
      A686TBW04_COMPLETION_FLG = "" ;
      Z687TBW04_EDIT_FLG = "" ;
      A687TBW04_EDIT_FLG = "" ;
      BC00174_A661TBW04_SESSION_ID = new String[] {""} ;
      BC00174_A662TBW04_APP_ID = new String[] {""} ;
      BC00174_A663TBW04_DISP_DATETIME = new String[] {""} ;
      BC00174_A664TBW04_STUDY_ID = new long[1] ;
      BC00174_A665TBW04_SUBJECT_ID = new int[1] ;
      BC00174_A666TBW04_CRF_ID = new short[1] ;
      BC00174_A667TBW04_CRF_LATEST_VERSION = new short[1] ;
      BC00174_n667TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00174_A668TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      BC00174_n668TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00174_A669TBW04_LOCK_FLG = new String[] {""} ;
      BC00174_n669TBW04_LOCK_FLG = new boolean[] {false} ;
      BC00174_A670TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n670TBW04_LOCK_DATETIME = new boolean[] {false} ;
      BC00174_A671TBW04_LOCK_USER_ID = new String[] {""} ;
      BC00174_n671TBW04_LOCK_USER_ID = new boolean[] {false} ;
      BC00174_A672TBW04_LOCK_AUTH_CD = new String[] {""} ;
      BC00174_n672TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00174_A673TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n673TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00174_A674TBW04_UPLOAD_USER_ID = new String[] {""} ;
      BC00174_n674TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00174_A675TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00174_n675TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00174_A676TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00174_n676TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00174_A677TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n677TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00174_A678TBW04_APPROVAL_FLG = new String[] {""} ;
      BC00174_n678TBW04_APPROVAL_FLG = new boolean[] {false} ;
      BC00174_A679TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n679TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00174_A680TBW04_APPROVAL_USER_ID = new String[] {""} ;
      BC00174_n680TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00174_A681TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00174_n681TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00174_A682TBW04_INPUT_END_FLG = new String[] {""} ;
      BC00174_n682TBW04_INPUT_END_FLG = new boolean[] {false} ;
      BC00174_A683TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00174_n683TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00174_A684TBW04_INPUT_END_USER_ID = new String[] {""} ;
      BC00174_n684TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00174_A685TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00174_n685TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00174_A686TBW04_COMPLETION_FLG = new String[] {""} ;
      BC00174_n686TBW04_COMPLETION_FLG = new boolean[] {false} ;
      BC00174_A687TBW04_EDIT_FLG = new String[] {""} ;
      BC00174_n687TBW04_EDIT_FLG = new boolean[] {false} ;
      BC00175_A661TBW04_SESSION_ID = new String[] {""} ;
      BC00175_A662TBW04_APP_ID = new String[] {""} ;
      BC00175_A663TBW04_DISP_DATETIME = new String[] {""} ;
      BC00175_A664TBW04_STUDY_ID = new long[1] ;
      BC00175_A665TBW04_SUBJECT_ID = new int[1] ;
      BC00175_A666TBW04_CRF_ID = new short[1] ;
      BC00173_A661TBW04_SESSION_ID = new String[] {""} ;
      BC00173_A662TBW04_APP_ID = new String[] {""} ;
      BC00173_A663TBW04_DISP_DATETIME = new String[] {""} ;
      BC00173_A664TBW04_STUDY_ID = new long[1] ;
      BC00173_A665TBW04_SUBJECT_ID = new int[1] ;
      BC00173_A666TBW04_CRF_ID = new short[1] ;
      BC00173_A667TBW04_CRF_LATEST_VERSION = new short[1] ;
      BC00173_n667TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00173_A668TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      BC00173_n668TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00173_A669TBW04_LOCK_FLG = new String[] {""} ;
      BC00173_n669TBW04_LOCK_FLG = new boolean[] {false} ;
      BC00173_A670TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n670TBW04_LOCK_DATETIME = new boolean[] {false} ;
      BC00173_A671TBW04_LOCK_USER_ID = new String[] {""} ;
      BC00173_n671TBW04_LOCK_USER_ID = new boolean[] {false} ;
      BC00173_A672TBW04_LOCK_AUTH_CD = new String[] {""} ;
      BC00173_n672TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00173_A673TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n673TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00173_A674TBW04_UPLOAD_USER_ID = new String[] {""} ;
      BC00173_n674TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00173_A675TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00173_n675TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00173_A676TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00173_n676TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00173_A677TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n677TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00173_A678TBW04_APPROVAL_FLG = new String[] {""} ;
      BC00173_n678TBW04_APPROVAL_FLG = new boolean[] {false} ;
      BC00173_A679TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n679TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00173_A680TBW04_APPROVAL_USER_ID = new String[] {""} ;
      BC00173_n680TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00173_A681TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00173_n681TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00173_A682TBW04_INPUT_END_FLG = new String[] {""} ;
      BC00173_n682TBW04_INPUT_END_FLG = new boolean[] {false} ;
      BC00173_A683TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00173_n683TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00173_A684TBW04_INPUT_END_USER_ID = new String[] {""} ;
      BC00173_n684TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00173_A685TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00173_n685TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00173_A686TBW04_COMPLETION_FLG = new String[] {""} ;
      BC00173_n686TBW04_COMPLETION_FLG = new boolean[] {false} ;
      BC00173_A687TBW04_EDIT_FLG = new String[] {""} ;
      BC00173_n687TBW04_EDIT_FLG = new boolean[] {false} ;
      sMode42 = "" ;
      BC00172_A661TBW04_SESSION_ID = new String[] {""} ;
      BC00172_A662TBW04_APP_ID = new String[] {""} ;
      BC00172_A663TBW04_DISP_DATETIME = new String[] {""} ;
      BC00172_A664TBW04_STUDY_ID = new long[1] ;
      BC00172_A665TBW04_SUBJECT_ID = new int[1] ;
      BC00172_A666TBW04_CRF_ID = new short[1] ;
      BC00172_A667TBW04_CRF_LATEST_VERSION = new short[1] ;
      BC00172_n667TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00172_A668TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      BC00172_n668TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00172_A669TBW04_LOCK_FLG = new String[] {""} ;
      BC00172_n669TBW04_LOCK_FLG = new boolean[] {false} ;
      BC00172_A670TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n670TBW04_LOCK_DATETIME = new boolean[] {false} ;
      BC00172_A671TBW04_LOCK_USER_ID = new String[] {""} ;
      BC00172_n671TBW04_LOCK_USER_ID = new boolean[] {false} ;
      BC00172_A672TBW04_LOCK_AUTH_CD = new String[] {""} ;
      BC00172_n672TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00172_A673TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n673TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00172_A674TBW04_UPLOAD_USER_ID = new String[] {""} ;
      BC00172_n674TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00172_A675TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00172_n675TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00172_A676TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00172_n676TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00172_A677TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n677TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00172_A678TBW04_APPROVAL_FLG = new String[] {""} ;
      BC00172_n678TBW04_APPROVAL_FLG = new boolean[] {false} ;
      BC00172_A679TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n679TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00172_A680TBW04_APPROVAL_USER_ID = new String[] {""} ;
      BC00172_n680TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00172_A681TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00172_n681TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00172_A682TBW04_INPUT_END_FLG = new String[] {""} ;
      BC00172_n682TBW04_INPUT_END_FLG = new boolean[] {false} ;
      BC00172_A683TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00172_n683TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00172_A684TBW04_INPUT_END_USER_ID = new String[] {""} ;
      BC00172_n684TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00172_A685TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00172_n685TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00172_A686TBW04_COMPLETION_FLG = new String[] {""} ;
      BC00172_n686TBW04_COMPLETION_FLG = new boolean[] {false} ;
      BC00172_A687TBW04_EDIT_FLG = new String[] {""} ;
      BC00172_n687TBW04_EDIT_FLG = new boolean[] {false} ;
      BC00179_A661TBW04_SESSION_ID = new String[] {""} ;
      BC00179_A662TBW04_APP_ID = new String[] {""} ;
      BC00179_A663TBW04_DISP_DATETIME = new String[] {""} ;
      BC00179_A664TBW04_STUDY_ID = new long[1] ;
      BC00179_A665TBW04_SUBJECT_ID = new int[1] ;
      BC00179_A666TBW04_CRF_ID = new short[1] ;
      BC00179_A667TBW04_CRF_LATEST_VERSION = new short[1] ;
      BC00179_n667TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      BC00179_A668TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      BC00179_n668TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      BC00179_A669TBW04_LOCK_FLG = new String[] {""} ;
      BC00179_n669TBW04_LOCK_FLG = new boolean[] {false} ;
      BC00179_A670TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n670TBW04_LOCK_DATETIME = new boolean[] {false} ;
      BC00179_A671TBW04_LOCK_USER_ID = new String[] {""} ;
      BC00179_n671TBW04_LOCK_USER_ID = new boolean[] {false} ;
      BC00179_A672TBW04_LOCK_AUTH_CD = new String[] {""} ;
      BC00179_n672TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      BC00179_A673TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n673TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      BC00179_A674TBW04_UPLOAD_USER_ID = new String[] {""} ;
      BC00179_n674TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      BC00179_A675TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      BC00179_n675TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      BC00179_A676TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      BC00179_n676TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      BC00179_A677TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n677TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      BC00179_A678TBW04_APPROVAL_FLG = new String[] {""} ;
      BC00179_n678TBW04_APPROVAL_FLG = new boolean[] {false} ;
      BC00179_A679TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n679TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      BC00179_A680TBW04_APPROVAL_USER_ID = new String[] {""} ;
      BC00179_n680TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      BC00179_A681TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      BC00179_n681TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      BC00179_A682TBW04_INPUT_END_FLG = new String[] {""} ;
      BC00179_n682TBW04_INPUT_END_FLG = new boolean[] {false} ;
      BC00179_A683TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00179_n683TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      BC00179_A684TBW04_INPUT_END_USER_ID = new String[] {""} ;
      BC00179_n684TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      BC00179_A685TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      BC00179_n685TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      BC00179_A686TBW04_COMPLETION_FLG = new String[] {""} ;
      BC00179_n686TBW04_COMPLETION_FLG = new boolean[] {false} ;
      BC00179_A687TBW04_EDIT_FLG = new String[] {""} ;
      BC00179_n687TBW04_EDIT_FLG = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw04_crf_bc__default(),
         new Object[] {
             new Object[] {
            BC00172_A661TBW04_SESSION_ID, BC00172_A662TBW04_APP_ID, BC00172_A663TBW04_DISP_DATETIME, BC00172_A664TBW04_STUDY_ID, BC00172_A665TBW04_SUBJECT_ID, BC00172_A666TBW04_CRF_ID, BC00172_A667TBW04_CRF_LATEST_VERSION, BC00172_n667TBW04_CRF_LATEST_VERSION, BC00172_A668TBW04_CRF_INPUT_LEVEL, BC00172_n668TBW04_CRF_INPUT_LEVEL,
            BC00172_A669TBW04_LOCK_FLG, BC00172_n669TBW04_LOCK_FLG, BC00172_A670TBW04_LOCK_DATETIME, BC00172_n670TBW04_LOCK_DATETIME, BC00172_A671TBW04_LOCK_USER_ID, BC00172_n671TBW04_LOCK_USER_ID, BC00172_A672TBW04_LOCK_AUTH_CD, BC00172_n672TBW04_LOCK_AUTH_CD, BC00172_A673TBW04_UPLOAD_DATETIME, BC00172_n673TBW04_UPLOAD_DATETIME,
            BC00172_A674TBW04_UPLOAD_USER_ID, BC00172_n674TBW04_UPLOAD_USER_ID, BC00172_A675TBW04_UPLOAD_AUTH_CD, BC00172_n675TBW04_UPLOAD_AUTH_CD, BC00172_A676TBW04_DM_ARRIVAL_FLG, BC00172_n676TBW04_DM_ARRIVAL_FLG, BC00172_A677TBW04_DM_ARRIVAL_DATETIME, BC00172_n677TBW04_DM_ARRIVAL_DATETIME, BC00172_A678TBW04_APPROVAL_FLG, BC00172_n678TBW04_APPROVAL_FLG,
            BC00172_A679TBW04_APPROVAL_DATETIME, BC00172_n679TBW04_APPROVAL_DATETIME, BC00172_A680TBW04_APPROVAL_USER_ID, BC00172_n680TBW04_APPROVAL_USER_ID, BC00172_A681TBW04_APPROVAL_AUTH_CD, BC00172_n681TBW04_APPROVAL_AUTH_CD, BC00172_A682TBW04_INPUT_END_FLG, BC00172_n682TBW04_INPUT_END_FLG, BC00172_A683TBW04_INPUT_END_DATETIME, BC00172_n683TBW04_INPUT_END_DATETIME,
            BC00172_A684TBW04_INPUT_END_USER_ID, BC00172_n684TBW04_INPUT_END_USER_ID, BC00172_A685TBW04_INPUT_END_AUTH_CD, BC00172_n685TBW04_INPUT_END_AUTH_CD, BC00172_A686TBW04_COMPLETION_FLG, BC00172_n686TBW04_COMPLETION_FLG, BC00172_A687TBW04_EDIT_FLG, BC00172_n687TBW04_EDIT_FLG
            }
            , new Object[] {
            BC00173_A661TBW04_SESSION_ID, BC00173_A662TBW04_APP_ID, BC00173_A663TBW04_DISP_DATETIME, BC00173_A664TBW04_STUDY_ID, BC00173_A665TBW04_SUBJECT_ID, BC00173_A666TBW04_CRF_ID, BC00173_A667TBW04_CRF_LATEST_VERSION, BC00173_n667TBW04_CRF_LATEST_VERSION, BC00173_A668TBW04_CRF_INPUT_LEVEL, BC00173_n668TBW04_CRF_INPUT_LEVEL,
            BC00173_A669TBW04_LOCK_FLG, BC00173_n669TBW04_LOCK_FLG, BC00173_A670TBW04_LOCK_DATETIME, BC00173_n670TBW04_LOCK_DATETIME, BC00173_A671TBW04_LOCK_USER_ID, BC00173_n671TBW04_LOCK_USER_ID, BC00173_A672TBW04_LOCK_AUTH_CD, BC00173_n672TBW04_LOCK_AUTH_CD, BC00173_A673TBW04_UPLOAD_DATETIME, BC00173_n673TBW04_UPLOAD_DATETIME,
            BC00173_A674TBW04_UPLOAD_USER_ID, BC00173_n674TBW04_UPLOAD_USER_ID, BC00173_A675TBW04_UPLOAD_AUTH_CD, BC00173_n675TBW04_UPLOAD_AUTH_CD, BC00173_A676TBW04_DM_ARRIVAL_FLG, BC00173_n676TBW04_DM_ARRIVAL_FLG, BC00173_A677TBW04_DM_ARRIVAL_DATETIME, BC00173_n677TBW04_DM_ARRIVAL_DATETIME, BC00173_A678TBW04_APPROVAL_FLG, BC00173_n678TBW04_APPROVAL_FLG,
            BC00173_A679TBW04_APPROVAL_DATETIME, BC00173_n679TBW04_APPROVAL_DATETIME, BC00173_A680TBW04_APPROVAL_USER_ID, BC00173_n680TBW04_APPROVAL_USER_ID, BC00173_A681TBW04_APPROVAL_AUTH_CD, BC00173_n681TBW04_APPROVAL_AUTH_CD, BC00173_A682TBW04_INPUT_END_FLG, BC00173_n682TBW04_INPUT_END_FLG, BC00173_A683TBW04_INPUT_END_DATETIME, BC00173_n683TBW04_INPUT_END_DATETIME,
            BC00173_A684TBW04_INPUT_END_USER_ID, BC00173_n684TBW04_INPUT_END_USER_ID, BC00173_A685TBW04_INPUT_END_AUTH_CD, BC00173_n685TBW04_INPUT_END_AUTH_CD, BC00173_A686TBW04_COMPLETION_FLG, BC00173_n686TBW04_COMPLETION_FLG, BC00173_A687TBW04_EDIT_FLG, BC00173_n687TBW04_EDIT_FLG
            }
            , new Object[] {
            BC00174_A661TBW04_SESSION_ID, BC00174_A662TBW04_APP_ID, BC00174_A663TBW04_DISP_DATETIME, BC00174_A664TBW04_STUDY_ID, BC00174_A665TBW04_SUBJECT_ID, BC00174_A666TBW04_CRF_ID, BC00174_A667TBW04_CRF_LATEST_VERSION, BC00174_n667TBW04_CRF_LATEST_VERSION, BC00174_A668TBW04_CRF_INPUT_LEVEL, BC00174_n668TBW04_CRF_INPUT_LEVEL,
            BC00174_A669TBW04_LOCK_FLG, BC00174_n669TBW04_LOCK_FLG, BC00174_A670TBW04_LOCK_DATETIME, BC00174_n670TBW04_LOCK_DATETIME, BC00174_A671TBW04_LOCK_USER_ID, BC00174_n671TBW04_LOCK_USER_ID, BC00174_A672TBW04_LOCK_AUTH_CD, BC00174_n672TBW04_LOCK_AUTH_CD, BC00174_A673TBW04_UPLOAD_DATETIME, BC00174_n673TBW04_UPLOAD_DATETIME,
            BC00174_A674TBW04_UPLOAD_USER_ID, BC00174_n674TBW04_UPLOAD_USER_ID, BC00174_A675TBW04_UPLOAD_AUTH_CD, BC00174_n675TBW04_UPLOAD_AUTH_CD, BC00174_A676TBW04_DM_ARRIVAL_FLG, BC00174_n676TBW04_DM_ARRIVAL_FLG, BC00174_A677TBW04_DM_ARRIVAL_DATETIME, BC00174_n677TBW04_DM_ARRIVAL_DATETIME, BC00174_A678TBW04_APPROVAL_FLG, BC00174_n678TBW04_APPROVAL_FLG,
            BC00174_A679TBW04_APPROVAL_DATETIME, BC00174_n679TBW04_APPROVAL_DATETIME, BC00174_A680TBW04_APPROVAL_USER_ID, BC00174_n680TBW04_APPROVAL_USER_ID, BC00174_A681TBW04_APPROVAL_AUTH_CD, BC00174_n681TBW04_APPROVAL_AUTH_CD, BC00174_A682TBW04_INPUT_END_FLG, BC00174_n682TBW04_INPUT_END_FLG, BC00174_A683TBW04_INPUT_END_DATETIME, BC00174_n683TBW04_INPUT_END_DATETIME,
            BC00174_A684TBW04_INPUT_END_USER_ID, BC00174_n684TBW04_INPUT_END_USER_ID, BC00174_A685TBW04_INPUT_END_AUTH_CD, BC00174_n685TBW04_INPUT_END_AUTH_CD, BC00174_A686TBW04_COMPLETION_FLG, BC00174_n686TBW04_COMPLETION_FLG, BC00174_A687TBW04_EDIT_FLG, BC00174_n687TBW04_EDIT_FLG
            }
            , new Object[] {
            BC00175_A661TBW04_SESSION_ID, BC00175_A662TBW04_APP_ID, BC00175_A663TBW04_DISP_DATETIME, BC00175_A664TBW04_STUDY_ID, BC00175_A665TBW04_SUBJECT_ID, BC00175_A666TBW04_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00179_A661TBW04_SESSION_ID, BC00179_A662TBW04_APP_ID, BC00179_A663TBW04_DISP_DATETIME, BC00179_A664TBW04_STUDY_ID, BC00179_A665TBW04_SUBJECT_ID, BC00179_A666TBW04_CRF_ID, BC00179_A667TBW04_CRF_LATEST_VERSION, BC00179_n667TBW04_CRF_LATEST_VERSION, BC00179_A668TBW04_CRF_INPUT_LEVEL, BC00179_n668TBW04_CRF_INPUT_LEVEL,
            BC00179_A669TBW04_LOCK_FLG, BC00179_n669TBW04_LOCK_FLG, BC00179_A670TBW04_LOCK_DATETIME, BC00179_n670TBW04_LOCK_DATETIME, BC00179_A671TBW04_LOCK_USER_ID, BC00179_n671TBW04_LOCK_USER_ID, BC00179_A672TBW04_LOCK_AUTH_CD, BC00179_n672TBW04_LOCK_AUTH_CD, BC00179_A673TBW04_UPLOAD_DATETIME, BC00179_n673TBW04_UPLOAD_DATETIME,
            BC00179_A674TBW04_UPLOAD_USER_ID, BC00179_n674TBW04_UPLOAD_USER_ID, BC00179_A675TBW04_UPLOAD_AUTH_CD, BC00179_n675TBW04_UPLOAD_AUTH_CD, BC00179_A676TBW04_DM_ARRIVAL_FLG, BC00179_n676TBW04_DM_ARRIVAL_FLG, BC00179_A677TBW04_DM_ARRIVAL_DATETIME, BC00179_n677TBW04_DM_ARRIVAL_DATETIME, BC00179_A678TBW04_APPROVAL_FLG, BC00179_n678TBW04_APPROVAL_FLG,
            BC00179_A679TBW04_APPROVAL_DATETIME, BC00179_n679TBW04_APPROVAL_DATETIME, BC00179_A680TBW04_APPROVAL_USER_ID, BC00179_n680TBW04_APPROVAL_USER_ID, BC00179_A681TBW04_APPROVAL_AUTH_CD, BC00179_n681TBW04_APPROVAL_AUTH_CD, BC00179_A682TBW04_INPUT_END_FLG, BC00179_n682TBW04_INPUT_END_FLG, BC00179_A683TBW04_INPUT_END_DATETIME, BC00179_n683TBW04_INPUT_END_DATETIME,
            BC00179_A684TBW04_INPUT_END_USER_ID, BC00179_n684TBW04_INPUT_END_USER_ID, BC00179_A685TBW04_INPUT_END_AUTH_CD, BC00179_n685TBW04_INPUT_END_AUTH_CD, BC00179_A686TBW04_COMPLETION_FLG, BC00179_n686TBW04_COMPLETION_FLG, BC00179_A687TBW04_EDIT_FLG, BC00179_n687TBW04_EDIT_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW04_CRF_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11172 */
      e11172 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_crf_input_level_Z ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_crf_input_level_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_lock_flg_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_approval_flg_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_completion_flg_N ;
   private byte gxTv_SdtTBW04_CRF_Tbw04_edit_flg_N ;
   private byte Z668TBW04_CRF_INPUT_LEVEL ;
   private byte A668TBW04_CRF_INPUT_LEVEL ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z666TBW04_CRF_ID ;
   private short A666TBW04_CRF_ID ;
   private short gxTv_SdtTBW04_CRF_Tbw04_crf_id_Z ;
   private short gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_Z ;
   private short Z667TBW04_CRF_LATEST_VERSION ;
   private short A667TBW04_CRF_LATEST_VERSION ;
   private short RcdFound42 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z665TBW04_SUBJECT_ID ;
   private int A665TBW04_SUBJECT_ID ;
   private int gxTv_SdtTBW04_CRF_Tbw04_subject_id_Z ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z664TBW04_STUDY_ID ;
   private long A664TBW04_STUDY_ID ;
   private long gxTv_SdtTBW04_CRF_Tbw04_study_id_Z ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String sMode42 ;
   private String Gx_emsg ;
   private java.util.Date gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z ;
   private java.util.Date gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z ;
   private java.util.Date gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z ;
   private java.util.Date gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z ;
   private java.util.Date gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z ;
   private java.util.Date Z670TBW04_LOCK_DATETIME ;
   private java.util.Date A670TBW04_LOCK_DATETIME ;
   private java.util.Date Z673TBW04_UPLOAD_DATETIME ;
   private java.util.Date A673TBW04_UPLOAD_DATETIME ;
   private java.util.Date Z677TBW04_DM_ARRIVAL_DATETIME ;
   private java.util.Date A677TBW04_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z679TBW04_APPROVAL_DATETIME ;
   private java.util.Date A679TBW04_APPROVAL_DATETIME ;
   private java.util.Date Z683TBW04_INPUT_END_DATETIME ;
   private java.util.Date A683TBW04_INPUT_END_DATETIME ;
   private boolean n667TBW04_CRF_LATEST_VERSION ;
   private boolean n668TBW04_CRF_INPUT_LEVEL ;
   private boolean n669TBW04_LOCK_FLG ;
   private boolean n670TBW04_LOCK_DATETIME ;
   private boolean n671TBW04_LOCK_USER_ID ;
   private boolean n672TBW04_LOCK_AUTH_CD ;
   private boolean n673TBW04_UPLOAD_DATETIME ;
   private boolean n674TBW04_UPLOAD_USER_ID ;
   private boolean n675TBW04_UPLOAD_AUTH_CD ;
   private boolean n676TBW04_DM_ARRIVAL_FLG ;
   private boolean n677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean n678TBW04_APPROVAL_FLG ;
   private boolean n679TBW04_APPROVAL_DATETIME ;
   private boolean n680TBW04_APPROVAL_USER_ID ;
   private boolean n681TBW04_APPROVAL_AUTH_CD ;
   private boolean n682TBW04_INPUT_END_FLG ;
   private boolean n683TBW04_INPUT_END_DATETIME ;
   private boolean n684TBW04_INPUT_END_USER_ID ;
   private boolean n685TBW04_INPUT_END_AUTH_CD ;
   private boolean n686TBW04_COMPLETION_FLG ;
   private boolean n687TBW04_EDIT_FLG ;
   private boolean Gx_longc ;
   private String Z661TBW04_SESSION_ID ;
   private String A661TBW04_SESSION_ID ;
   private String Z662TBW04_APP_ID ;
   private String A662TBW04_APP_ID ;
   private String Z663TBW04_DISP_DATETIME ;
   private String A663TBW04_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private String gxTv_SdtTBW04_CRF_Tbw04_session_id_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_app_id_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z ;
   private String gxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z ;
   private String Z669TBW04_LOCK_FLG ;
   private String A669TBW04_LOCK_FLG ;
   private String Z671TBW04_LOCK_USER_ID ;
   private String A671TBW04_LOCK_USER_ID ;
   private String Z672TBW04_LOCK_AUTH_CD ;
   private String A672TBW04_LOCK_AUTH_CD ;
   private String Z674TBW04_UPLOAD_USER_ID ;
   private String A674TBW04_UPLOAD_USER_ID ;
   private String Z675TBW04_UPLOAD_AUTH_CD ;
   private String A675TBW04_UPLOAD_AUTH_CD ;
   private String Z676TBW04_DM_ARRIVAL_FLG ;
   private String A676TBW04_DM_ARRIVAL_FLG ;
   private String Z678TBW04_APPROVAL_FLG ;
   private String A678TBW04_APPROVAL_FLG ;
   private String Z680TBW04_APPROVAL_USER_ID ;
   private String A680TBW04_APPROVAL_USER_ID ;
   private String Z681TBW04_APPROVAL_AUTH_CD ;
   private String A681TBW04_APPROVAL_AUTH_CD ;
   private String Z682TBW04_INPUT_END_FLG ;
   private String A682TBW04_INPUT_END_FLG ;
   private String Z684TBW04_INPUT_END_USER_ID ;
   private String A684TBW04_INPUT_END_USER_ID ;
   private String Z685TBW04_INPUT_END_AUTH_CD ;
   private String A685TBW04_INPUT_END_AUTH_CD ;
   private String Z686TBW04_COMPLETION_FLG ;
   private String A686TBW04_COMPLETION_FLG ;
   private String Z687TBW04_EDIT_FLG ;
   private String A687TBW04_EDIT_FLG ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW04_CRF bcTBW04_CRF ;
   private IDataStoreProvider pr_default ;
   private String[] BC00174_A661TBW04_SESSION_ID ;
   private String[] BC00174_A662TBW04_APP_ID ;
   private String[] BC00174_A663TBW04_DISP_DATETIME ;
   private long[] BC00174_A664TBW04_STUDY_ID ;
   private int[] BC00174_A665TBW04_SUBJECT_ID ;
   private short[] BC00174_A666TBW04_CRF_ID ;
   private short[] BC00174_A667TBW04_CRF_LATEST_VERSION ;
   private boolean[] BC00174_n667TBW04_CRF_LATEST_VERSION ;
   private byte[] BC00174_A668TBW04_CRF_INPUT_LEVEL ;
   private boolean[] BC00174_n668TBW04_CRF_INPUT_LEVEL ;
   private String[] BC00174_A669TBW04_LOCK_FLG ;
   private boolean[] BC00174_n669TBW04_LOCK_FLG ;
   private java.util.Date[] BC00174_A670TBW04_LOCK_DATETIME ;
   private boolean[] BC00174_n670TBW04_LOCK_DATETIME ;
   private String[] BC00174_A671TBW04_LOCK_USER_ID ;
   private boolean[] BC00174_n671TBW04_LOCK_USER_ID ;
   private String[] BC00174_A672TBW04_LOCK_AUTH_CD ;
   private boolean[] BC00174_n672TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] BC00174_A673TBW04_UPLOAD_DATETIME ;
   private boolean[] BC00174_n673TBW04_UPLOAD_DATETIME ;
   private String[] BC00174_A674TBW04_UPLOAD_USER_ID ;
   private boolean[] BC00174_n674TBW04_UPLOAD_USER_ID ;
   private String[] BC00174_A675TBW04_UPLOAD_AUTH_CD ;
   private boolean[] BC00174_n675TBW04_UPLOAD_AUTH_CD ;
   private String[] BC00174_A676TBW04_DM_ARRIVAL_FLG ;
   private boolean[] BC00174_n676TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00174_A677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00174_n677TBW04_DM_ARRIVAL_DATETIME ;
   private String[] BC00174_A678TBW04_APPROVAL_FLG ;
   private boolean[] BC00174_n678TBW04_APPROVAL_FLG ;
   private java.util.Date[] BC00174_A679TBW04_APPROVAL_DATETIME ;
   private boolean[] BC00174_n679TBW04_APPROVAL_DATETIME ;
   private String[] BC00174_A680TBW04_APPROVAL_USER_ID ;
   private boolean[] BC00174_n680TBW04_APPROVAL_USER_ID ;
   private String[] BC00174_A681TBW04_APPROVAL_AUTH_CD ;
   private boolean[] BC00174_n681TBW04_APPROVAL_AUTH_CD ;
   private String[] BC00174_A682TBW04_INPUT_END_FLG ;
   private boolean[] BC00174_n682TBW04_INPUT_END_FLG ;
   private java.util.Date[] BC00174_A683TBW04_INPUT_END_DATETIME ;
   private boolean[] BC00174_n683TBW04_INPUT_END_DATETIME ;
   private String[] BC00174_A684TBW04_INPUT_END_USER_ID ;
   private boolean[] BC00174_n684TBW04_INPUT_END_USER_ID ;
   private String[] BC00174_A685TBW04_INPUT_END_AUTH_CD ;
   private boolean[] BC00174_n685TBW04_INPUT_END_AUTH_CD ;
   private String[] BC00174_A686TBW04_COMPLETION_FLG ;
   private boolean[] BC00174_n686TBW04_COMPLETION_FLG ;
   private String[] BC00174_A687TBW04_EDIT_FLG ;
   private boolean[] BC00174_n687TBW04_EDIT_FLG ;
   private String[] BC00175_A661TBW04_SESSION_ID ;
   private String[] BC00175_A662TBW04_APP_ID ;
   private String[] BC00175_A663TBW04_DISP_DATETIME ;
   private long[] BC00175_A664TBW04_STUDY_ID ;
   private int[] BC00175_A665TBW04_SUBJECT_ID ;
   private short[] BC00175_A666TBW04_CRF_ID ;
   private String[] BC00173_A661TBW04_SESSION_ID ;
   private String[] BC00173_A662TBW04_APP_ID ;
   private String[] BC00173_A663TBW04_DISP_DATETIME ;
   private long[] BC00173_A664TBW04_STUDY_ID ;
   private int[] BC00173_A665TBW04_SUBJECT_ID ;
   private short[] BC00173_A666TBW04_CRF_ID ;
   private short[] BC00173_A667TBW04_CRF_LATEST_VERSION ;
   private boolean[] BC00173_n667TBW04_CRF_LATEST_VERSION ;
   private byte[] BC00173_A668TBW04_CRF_INPUT_LEVEL ;
   private boolean[] BC00173_n668TBW04_CRF_INPUT_LEVEL ;
   private String[] BC00173_A669TBW04_LOCK_FLG ;
   private boolean[] BC00173_n669TBW04_LOCK_FLG ;
   private java.util.Date[] BC00173_A670TBW04_LOCK_DATETIME ;
   private boolean[] BC00173_n670TBW04_LOCK_DATETIME ;
   private String[] BC00173_A671TBW04_LOCK_USER_ID ;
   private boolean[] BC00173_n671TBW04_LOCK_USER_ID ;
   private String[] BC00173_A672TBW04_LOCK_AUTH_CD ;
   private boolean[] BC00173_n672TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] BC00173_A673TBW04_UPLOAD_DATETIME ;
   private boolean[] BC00173_n673TBW04_UPLOAD_DATETIME ;
   private String[] BC00173_A674TBW04_UPLOAD_USER_ID ;
   private boolean[] BC00173_n674TBW04_UPLOAD_USER_ID ;
   private String[] BC00173_A675TBW04_UPLOAD_AUTH_CD ;
   private boolean[] BC00173_n675TBW04_UPLOAD_AUTH_CD ;
   private String[] BC00173_A676TBW04_DM_ARRIVAL_FLG ;
   private boolean[] BC00173_n676TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00173_A677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00173_n677TBW04_DM_ARRIVAL_DATETIME ;
   private String[] BC00173_A678TBW04_APPROVAL_FLG ;
   private boolean[] BC00173_n678TBW04_APPROVAL_FLG ;
   private java.util.Date[] BC00173_A679TBW04_APPROVAL_DATETIME ;
   private boolean[] BC00173_n679TBW04_APPROVAL_DATETIME ;
   private String[] BC00173_A680TBW04_APPROVAL_USER_ID ;
   private boolean[] BC00173_n680TBW04_APPROVAL_USER_ID ;
   private String[] BC00173_A681TBW04_APPROVAL_AUTH_CD ;
   private boolean[] BC00173_n681TBW04_APPROVAL_AUTH_CD ;
   private String[] BC00173_A682TBW04_INPUT_END_FLG ;
   private boolean[] BC00173_n682TBW04_INPUT_END_FLG ;
   private java.util.Date[] BC00173_A683TBW04_INPUT_END_DATETIME ;
   private boolean[] BC00173_n683TBW04_INPUT_END_DATETIME ;
   private String[] BC00173_A684TBW04_INPUT_END_USER_ID ;
   private boolean[] BC00173_n684TBW04_INPUT_END_USER_ID ;
   private String[] BC00173_A685TBW04_INPUT_END_AUTH_CD ;
   private boolean[] BC00173_n685TBW04_INPUT_END_AUTH_CD ;
   private String[] BC00173_A686TBW04_COMPLETION_FLG ;
   private boolean[] BC00173_n686TBW04_COMPLETION_FLG ;
   private String[] BC00173_A687TBW04_EDIT_FLG ;
   private boolean[] BC00173_n687TBW04_EDIT_FLG ;
   private String[] BC00172_A661TBW04_SESSION_ID ;
   private String[] BC00172_A662TBW04_APP_ID ;
   private String[] BC00172_A663TBW04_DISP_DATETIME ;
   private long[] BC00172_A664TBW04_STUDY_ID ;
   private int[] BC00172_A665TBW04_SUBJECT_ID ;
   private short[] BC00172_A666TBW04_CRF_ID ;
   private short[] BC00172_A667TBW04_CRF_LATEST_VERSION ;
   private boolean[] BC00172_n667TBW04_CRF_LATEST_VERSION ;
   private byte[] BC00172_A668TBW04_CRF_INPUT_LEVEL ;
   private boolean[] BC00172_n668TBW04_CRF_INPUT_LEVEL ;
   private String[] BC00172_A669TBW04_LOCK_FLG ;
   private boolean[] BC00172_n669TBW04_LOCK_FLG ;
   private java.util.Date[] BC00172_A670TBW04_LOCK_DATETIME ;
   private boolean[] BC00172_n670TBW04_LOCK_DATETIME ;
   private String[] BC00172_A671TBW04_LOCK_USER_ID ;
   private boolean[] BC00172_n671TBW04_LOCK_USER_ID ;
   private String[] BC00172_A672TBW04_LOCK_AUTH_CD ;
   private boolean[] BC00172_n672TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] BC00172_A673TBW04_UPLOAD_DATETIME ;
   private boolean[] BC00172_n673TBW04_UPLOAD_DATETIME ;
   private String[] BC00172_A674TBW04_UPLOAD_USER_ID ;
   private boolean[] BC00172_n674TBW04_UPLOAD_USER_ID ;
   private String[] BC00172_A675TBW04_UPLOAD_AUTH_CD ;
   private boolean[] BC00172_n675TBW04_UPLOAD_AUTH_CD ;
   private String[] BC00172_A676TBW04_DM_ARRIVAL_FLG ;
   private boolean[] BC00172_n676TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00172_A677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00172_n677TBW04_DM_ARRIVAL_DATETIME ;
   private String[] BC00172_A678TBW04_APPROVAL_FLG ;
   private boolean[] BC00172_n678TBW04_APPROVAL_FLG ;
   private java.util.Date[] BC00172_A679TBW04_APPROVAL_DATETIME ;
   private boolean[] BC00172_n679TBW04_APPROVAL_DATETIME ;
   private String[] BC00172_A680TBW04_APPROVAL_USER_ID ;
   private boolean[] BC00172_n680TBW04_APPROVAL_USER_ID ;
   private String[] BC00172_A681TBW04_APPROVAL_AUTH_CD ;
   private boolean[] BC00172_n681TBW04_APPROVAL_AUTH_CD ;
   private String[] BC00172_A682TBW04_INPUT_END_FLG ;
   private boolean[] BC00172_n682TBW04_INPUT_END_FLG ;
   private java.util.Date[] BC00172_A683TBW04_INPUT_END_DATETIME ;
   private boolean[] BC00172_n683TBW04_INPUT_END_DATETIME ;
   private String[] BC00172_A684TBW04_INPUT_END_USER_ID ;
   private boolean[] BC00172_n684TBW04_INPUT_END_USER_ID ;
   private String[] BC00172_A685TBW04_INPUT_END_AUTH_CD ;
   private boolean[] BC00172_n685TBW04_INPUT_END_AUTH_CD ;
   private String[] BC00172_A686TBW04_COMPLETION_FLG ;
   private boolean[] BC00172_n686TBW04_COMPLETION_FLG ;
   private String[] BC00172_A687TBW04_EDIT_FLG ;
   private boolean[] BC00172_n687TBW04_EDIT_FLG ;
   private String[] BC00179_A661TBW04_SESSION_ID ;
   private String[] BC00179_A662TBW04_APP_ID ;
   private String[] BC00179_A663TBW04_DISP_DATETIME ;
   private long[] BC00179_A664TBW04_STUDY_ID ;
   private int[] BC00179_A665TBW04_SUBJECT_ID ;
   private short[] BC00179_A666TBW04_CRF_ID ;
   private short[] BC00179_A667TBW04_CRF_LATEST_VERSION ;
   private boolean[] BC00179_n667TBW04_CRF_LATEST_VERSION ;
   private byte[] BC00179_A668TBW04_CRF_INPUT_LEVEL ;
   private boolean[] BC00179_n668TBW04_CRF_INPUT_LEVEL ;
   private String[] BC00179_A669TBW04_LOCK_FLG ;
   private boolean[] BC00179_n669TBW04_LOCK_FLG ;
   private java.util.Date[] BC00179_A670TBW04_LOCK_DATETIME ;
   private boolean[] BC00179_n670TBW04_LOCK_DATETIME ;
   private String[] BC00179_A671TBW04_LOCK_USER_ID ;
   private boolean[] BC00179_n671TBW04_LOCK_USER_ID ;
   private String[] BC00179_A672TBW04_LOCK_AUTH_CD ;
   private boolean[] BC00179_n672TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] BC00179_A673TBW04_UPLOAD_DATETIME ;
   private boolean[] BC00179_n673TBW04_UPLOAD_DATETIME ;
   private String[] BC00179_A674TBW04_UPLOAD_USER_ID ;
   private boolean[] BC00179_n674TBW04_UPLOAD_USER_ID ;
   private String[] BC00179_A675TBW04_UPLOAD_AUTH_CD ;
   private boolean[] BC00179_n675TBW04_UPLOAD_AUTH_CD ;
   private String[] BC00179_A676TBW04_DM_ARRIVAL_FLG ;
   private boolean[] BC00179_n676TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] BC00179_A677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] BC00179_n677TBW04_DM_ARRIVAL_DATETIME ;
   private String[] BC00179_A678TBW04_APPROVAL_FLG ;
   private boolean[] BC00179_n678TBW04_APPROVAL_FLG ;
   private java.util.Date[] BC00179_A679TBW04_APPROVAL_DATETIME ;
   private boolean[] BC00179_n679TBW04_APPROVAL_DATETIME ;
   private String[] BC00179_A680TBW04_APPROVAL_USER_ID ;
   private boolean[] BC00179_n680TBW04_APPROVAL_USER_ID ;
   private String[] BC00179_A681TBW04_APPROVAL_AUTH_CD ;
   private boolean[] BC00179_n681TBW04_APPROVAL_AUTH_CD ;
   private String[] BC00179_A682TBW04_INPUT_END_FLG ;
   private boolean[] BC00179_n682TBW04_INPUT_END_FLG ;
   private java.util.Date[] BC00179_A683TBW04_INPUT_END_DATETIME ;
   private boolean[] BC00179_n683TBW04_INPUT_END_DATETIME ;
   private String[] BC00179_A684TBW04_INPUT_END_USER_ID ;
   private boolean[] BC00179_n684TBW04_INPUT_END_USER_ID ;
   private String[] BC00179_A685TBW04_INPUT_END_AUTH_CD ;
   private boolean[] BC00179_n685TBW04_INPUT_END_AUTH_CD ;
   private String[] BC00179_A686TBW04_COMPLETION_FLG ;
   private boolean[] BC00179_n686TBW04_COMPLETION_FLG ;
   private String[] BC00179_A687TBW04_EDIT_FLG ;
   private boolean[] BC00179_n687TBW04_EDIT_FLG ;
}

final  class tbw04_crf_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00172", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00173", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00174", "SELECT TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID`, TM1.`TBW04_CRF_LATEST_VERSION`, TM1.`TBW04_CRF_INPUT_LEVEL`, TM1.`TBW04_LOCK_FLG`, TM1.`TBW04_LOCK_DATETIME`, TM1.`TBW04_LOCK_USER_ID`, TM1.`TBW04_LOCK_AUTH_CD`, TM1.`TBW04_UPLOAD_DATETIME`, TM1.`TBW04_UPLOAD_USER_ID`, TM1.`TBW04_UPLOAD_AUTH_CD`, TM1.`TBW04_DM_ARRIVAL_FLG`, TM1.`TBW04_DM_ARRIVAL_DATETIME`, TM1.`TBW04_APPROVAL_FLG`, TM1.`TBW04_APPROVAL_DATETIME`, TM1.`TBW04_APPROVAL_USER_ID`, TM1.`TBW04_APPROVAL_AUTH_CD`, TM1.`TBW04_INPUT_END_FLG`, TM1.`TBW04_INPUT_END_DATETIME`, TM1.`TBW04_INPUT_END_USER_ID`, TM1.`TBW04_INPUT_END_AUTH_CD`, TM1.`TBW04_COMPLETION_FLG`, TM1.`TBW04_EDIT_FLG` FROM `TBW04_CRF` TM1 WHERE TM1.`TBW04_SESSION_ID` = ? and TM1.`TBW04_APP_ID` = ? and TM1.`TBW04_DISP_DATETIME` = ? and TM1.`TBW04_STUDY_ID` = ? and TM1.`TBW04_SUBJECT_ID` = ? and TM1.`TBW04_CRF_ID` = ? ORDER BY TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00175", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00176", "INSERT INTO `TBW04_CRF` (`TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00177", "UPDATE `TBW04_CRF` SET `TBW04_CRF_LATEST_VERSION`=?, `TBW04_CRF_INPUT_LEVEL`=?, `TBW04_LOCK_FLG`=?, `TBW04_LOCK_DATETIME`=?, `TBW04_LOCK_USER_ID`=?, `TBW04_LOCK_AUTH_CD`=?, `TBW04_UPLOAD_DATETIME`=?, `TBW04_UPLOAD_USER_ID`=?, `TBW04_UPLOAD_AUTH_CD`=?, `TBW04_DM_ARRIVAL_FLG`=?, `TBW04_DM_ARRIVAL_DATETIME`=?, `TBW04_APPROVAL_FLG`=?, `TBW04_APPROVAL_DATETIME`=?, `TBW04_APPROVAL_USER_ID`=?, `TBW04_APPROVAL_AUTH_CD`=?, `TBW04_INPUT_END_FLG`=?, `TBW04_INPUT_END_DATETIME`=?, `TBW04_INPUT_END_USER_ID`=?, `TBW04_INPUT_END_AUTH_CD`=?, `TBW04_COMPLETION_FLG`=?, `TBW04_EDIT_FLG`=?  WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00178", "DELETE FROM `TBW04_CRF`  WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00179", "SELECT TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID`, TM1.`TBW04_CRF_LATEST_VERSION`, TM1.`TBW04_CRF_INPUT_LEVEL`, TM1.`TBW04_LOCK_FLG`, TM1.`TBW04_LOCK_DATETIME`, TM1.`TBW04_LOCK_USER_ID`, TM1.`TBW04_LOCK_AUTH_CD`, TM1.`TBW04_UPLOAD_DATETIME`, TM1.`TBW04_UPLOAD_USER_ID`, TM1.`TBW04_UPLOAD_AUTH_CD`, TM1.`TBW04_DM_ARRIVAL_FLG`, TM1.`TBW04_DM_ARRIVAL_DATETIME`, TM1.`TBW04_APPROVAL_FLG`, TM1.`TBW04_APPROVAL_DATETIME`, TM1.`TBW04_APPROVAL_USER_ID`, TM1.`TBW04_APPROVAL_AUTH_CD`, TM1.`TBW04_INPUT_END_FLG`, TM1.`TBW04_INPUT_END_DATETIME`, TM1.`TBW04_INPUT_END_USER_ID`, TM1.`TBW04_INPUT_END_AUTH_CD`, TM1.`TBW04_COMPLETION_FLG`, TM1.`TBW04_EDIT_FLG` FROM `TBW04_CRF` TM1 WHERE TM1.`TBW04_SESSION_ID` = ? and TM1.`TBW04_APP_ID` = ? and TM1.`TBW04_DISP_DATETIME` = ? and TM1.`TBW04_STUDY_ID` = ? and TM1.`TBW04_SUBJECT_ID` = ? and TM1.`TBW04_CRF_ID` = ? ORDER BY TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[33], 128);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[41], 128);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[47], 1);
               }
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 128);
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
                  stmt.setVarchar(8, (String)parms[15], 128);
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
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[21], false);
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
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 2);
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
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 128);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 1);
               }
               stmt.setVarchar(22, (String)parms[42], 50, false);
               stmt.setVarchar(23, (String)parms[43], 7, false);
               stmt.setVarchar(24, (String)parms[44], 14, false);
               stmt.setLong(25, ((Number) parms[45]).longValue());
               stmt.setInt(26, ((Number) parms[46]).intValue());
               stmt.setShort(27, ((Number) parms[47]).shortValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 7 :
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

