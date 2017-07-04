/*
               File: tbm42_study_cdisc_domain_bc
        Description: 試験別CDISCドメインマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:36.89
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm42_study_cdisc_domain_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm42_study_cdisc_domain_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm42_study_cdisc_domain_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm42_study_cdisc_domain_bc.class ));
   }

   public tbm42_study_cdisc_domain_bc( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1I53( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1I53( ) ;
      standaloneModal( ) ;
      addRow1I53( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e121I2 */
         e121I2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z203TBM42_STUDY_ID = A203TBM42_STUDY_ID ;
            Z204TBM42_DOM_CD = A204TBM42_DOM_CD ;
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

   public void confirm_1I0( )
   {
      beforeValidate1I53( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1I53( ) ;
         }
         else
         {
            checkExtendedTable1I53( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1I53( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e111I2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      AV7W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e121I2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV8W_TXT = "" ;
      AV8W_TXT = AV8W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + "ドメインコード:" + A204TBM42_DOM_CD + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A905TBM42_DOM_ENM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A906TBM42_DOM_JNM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A907TBM42_DOM_GRP_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A908TBM42_NOTE + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A909TBM42_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A893TBM42_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A894TBM42_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A895TBM42_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A896TBM42_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A897TBM42_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A898TBM42_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A899TBM42_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = GXutil.strReplace( AV8W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV8W_TXT) ;
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

   public void zm1I53( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z894TBM42_CRT_DATETIME = A894TBM42_CRT_DATETIME ;
         Z895TBM42_CRT_USER_ID = A895TBM42_CRT_USER_ID ;
         Z897TBM42_UPD_DATETIME = A897TBM42_UPD_DATETIME ;
         Z898TBM42_UPD_USER_ID = A898TBM42_UPD_USER_ID ;
         Z900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
         Z905TBM42_DOM_ENM = A905TBM42_DOM_ENM ;
         Z906TBM42_DOM_JNM = A906TBM42_DOM_JNM ;
         Z907TBM42_DOM_GRP_NM = A907TBM42_DOM_GRP_NM ;
         Z908TBM42_NOTE = A908TBM42_NOTE ;
         Z909TBM42_ORDER = A909TBM42_ORDER ;
         Z893TBM42_DEL_FLG = A893TBM42_DEL_FLG ;
         Z896TBM42_CRT_PROG_NM = A896TBM42_CRT_PROG_NM ;
         Z899TBM42_UPD_PROG_NM = A899TBM42_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z203TBM42_STUDY_ID = A203TBM42_STUDY_ID ;
         Z204TBM42_DOM_CD = A204TBM42_DOM_CD ;
         Z894TBM42_CRT_DATETIME = A894TBM42_CRT_DATETIME ;
         Z895TBM42_CRT_USER_ID = A895TBM42_CRT_USER_ID ;
         Z897TBM42_UPD_DATETIME = A897TBM42_UPD_DATETIME ;
         Z898TBM42_UPD_USER_ID = A898TBM42_UPD_USER_ID ;
         Z900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
         Z905TBM42_DOM_ENM = A905TBM42_DOM_ENM ;
         Z906TBM42_DOM_JNM = A906TBM42_DOM_JNM ;
         Z907TBM42_DOM_GRP_NM = A907TBM42_DOM_GRP_NM ;
         Z908TBM42_NOTE = A908TBM42_NOTE ;
         Z909TBM42_ORDER = A909TBM42_ORDER ;
         Z893TBM42_DEL_FLG = A893TBM42_DEL_FLG ;
         Z896TBM42_CRT_PROG_NM = A896TBM42_CRT_PROG_NM ;
         Z899TBM42_UPD_PROG_NM = A899TBM42_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1I53( )
   {
      /* Using cursor BC001I4 */
      pr_default.execute(2, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A894TBM42_CRT_DATETIME = BC001I4_A894TBM42_CRT_DATETIME[0] ;
         n894TBM42_CRT_DATETIME = BC001I4_n894TBM42_CRT_DATETIME[0] ;
         A895TBM42_CRT_USER_ID = BC001I4_A895TBM42_CRT_USER_ID[0] ;
         n895TBM42_CRT_USER_ID = BC001I4_n895TBM42_CRT_USER_ID[0] ;
         A897TBM42_UPD_DATETIME = BC001I4_A897TBM42_UPD_DATETIME[0] ;
         n897TBM42_UPD_DATETIME = BC001I4_n897TBM42_UPD_DATETIME[0] ;
         A898TBM42_UPD_USER_ID = BC001I4_A898TBM42_UPD_USER_ID[0] ;
         n898TBM42_UPD_USER_ID = BC001I4_n898TBM42_UPD_USER_ID[0] ;
         A900TBM42_UPD_CNT = BC001I4_A900TBM42_UPD_CNT[0] ;
         n900TBM42_UPD_CNT = BC001I4_n900TBM42_UPD_CNT[0] ;
         A905TBM42_DOM_ENM = BC001I4_A905TBM42_DOM_ENM[0] ;
         n905TBM42_DOM_ENM = BC001I4_n905TBM42_DOM_ENM[0] ;
         A906TBM42_DOM_JNM = BC001I4_A906TBM42_DOM_JNM[0] ;
         n906TBM42_DOM_JNM = BC001I4_n906TBM42_DOM_JNM[0] ;
         A907TBM42_DOM_GRP_NM = BC001I4_A907TBM42_DOM_GRP_NM[0] ;
         n907TBM42_DOM_GRP_NM = BC001I4_n907TBM42_DOM_GRP_NM[0] ;
         A908TBM42_NOTE = BC001I4_A908TBM42_NOTE[0] ;
         n908TBM42_NOTE = BC001I4_n908TBM42_NOTE[0] ;
         A909TBM42_ORDER = BC001I4_A909TBM42_ORDER[0] ;
         n909TBM42_ORDER = BC001I4_n909TBM42_ORDER[0] ;
         A893TBM42_DEL_FLG = BC001I4_A893TBM42_DEL_FLG[0] ;
         n893TBM42_DEL_FLG = BC001I4_n893TBM42_DEL_FLG[0] ;
         A896TBM42_CRT_PROG_NM = BC001I4_A896TBM42_CRT_PROG_NM[0] ;
         n896TBM42_CRT_PROG_NM = BC001I4_n896TBM42_CRT_PROG_NM[0] ;
         A899TBM42_UPD_PROG_NM = BC001I4_A899TBM42_UPD_PROG_NM[0] ;
         n899TBM42_UPD_PROG_NM = BC001I4_n899TBM42_UPD_PROG_NM[0] ;
         zm1I53( -8) ;
      }
      pr_default.close(2);
      onLoadActions1I53( ) ;
   }

   public void onLoadActions1I53( )
   {
      AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN_BC" ;
   }

   public void checkExtendedTable1I53( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN_BC" ;
      if ( ! ( GXutil.nullDate().equals(A894TBM42_CRT_DATETIME) || (( A894TBM42_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A894TBM42_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A897TBM42_UPD_DATETIME) || (( A897TBM42_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A897TBM42_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1I53( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1I53( )
   {
      /* Using cursor BC001I5 */
      pr_default.execute(3, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound53 = (short)(1) ;
      }
      else
      {
         RcdFound53 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC001I3 */
      pr_default.execute(1, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1I53( 8) ;
         RcdFound53 = (short)(1) ;
         A203TBM42_STUDY_ID = BC001I3_A203TBM42_STUDY_ID[0] ;
         A204TBM42_DOM_CD = BC001I3_A204TBM42_DOM_CD[0] ;
         A894TBM42_CRT_DATETIME = BC001I3_A894TBM42_CRT_DATETIME[0] ;
         n894TBM42_CRT_DATETIME = BC001I3_n894TBM42_CRT_DATETIME[0] ;
         A895TBM42_CRT_USER_ID = BC001I3_A895TBM42_CRT_USER_ID[0] ;
         n895TBM42_CRT_USER_ID = BC001I3_n895TBM42_CRT_USER_ID[0] ;
         A897TBM42_UPD_DATETIME = BC001I3_A897TBM42_UPD_DATETIME[0] ;
         n897TBM42_UPD_DATETIME = BC001I3_n897TBM42_UPD_DATETIME[0] ;
         A898TBM42_UPD_USER_ID = BC001I3_A898TBM42_UPD_USER_ID[0] ;
         n898TBM42_UPD_USER_ID = BC001I3_n898TBM42_UPD_USER_ID[0] ;
         A900TBM42_UPD_CNT = BC001I3_A900TBM42_UPD_CNT[0] ;
         n900TBM42_UPD_CNT = BC001I3_n900TBM42_UPD_CNT[0] ;
         A905TBM42_DOM_ENM = BC001I3_A905TBM42_DOM_ENM[0] ;
         n905TBM42_DOM_ENM = BC001I3_n905TBM42_DOM_ENM[0] ;
         A906TBM42_DOM_JNM = BC001I3_A906TBM42_DOM_JNM[0] ;
         n906TBM42_DOM_JNM = BC001I3_n906TBM42_DOM_JNM[0] ;
         A907TBM42_DOM_GRP_NM = BC001I3_A907TBM42_DOM_GRP_NM[0] ;
         n907TBM42_DOM_GRP_NM = BC001I3_n907TBM42_DOM_GRP_NM[0] ;
         A908TBM42_NOTE = BC001I3_A908TBM42_NOTE[0] ;
         n908TBM42_NOTE = BC001I3_n908TBM42_NOTE[0] ;
         A909TBM42_ORDER = BC001I3_A909TBM42_ORDER[0] ;
         n909TBM42_ORDER = BC001I3_n909TBM42_ORDER[0] ;
         A893TBM42_DEL_FLG = BC001I3_A893TBM42_DEL_FLG[0] ;
         n893TBM42_DEL_FLG = BC001I3_n893TBM42_DEL_FLG[0] ;
         A896TBM42_CRT_PROG_NM = BC001I3_A896TBM42_CRT_PROG_NM[0] ;
         n896TBM42_CRT_PROG_NM = BC001I3_n896TBM42_CRT_PROG_NM[0] ;
         A899TBM42_UPD_PROG_NM = BC001I3_A899TBM42_UPD_PROG_NM[0] ;
         n899TBM42_UPD_PROG_NM = BC001I3_n899TBM42_UPD_PROG_NM[0] ;
         O900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
         n900TBM42_UPD_CNT = false ;
         Z203TBM42_STUDY_ID = A203TBM42_STUDY_ID ;
         Z204TBM42_DOM_CD = A204TBM42_DOM_CD ;
         sMode53 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1I53( ) ;
         if ( AnyError == 1 )
         {
            RcdFound53 = (short)(0) ;
            initializeNonKey1I53( ) ;
         }
         Gx_mode = sMode53 ;
      }
      else
      {
         RcdFound53 = (short)(0) ;
         initializeNonKey1I53( ) ;
         sMode53 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode53 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1I53( ) ;
      if ( RcdFound53 == 0 )
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
      confirm_1I0( ) ;
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

   public void checkOptimisticConcurrency1I53( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC001I2 */
         pr_default.execute(0, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM42_STUDY_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z894TBM42_CRT_DATETIME.equals( BC001I2_A894TBM42_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z895TBM42_CRT_USER_ID, BC001I2_A895TBM42_CRT_USER_ID[0]) != 0 ) || !( Z897TBM42_UPD_DATETIME.equals( BC001I2_A897TBM42_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z898TBM42_UPD_USER_ID, BC001I2_A898TBM42_UPD_USER_ID[0]) != 0 ) || ( Z900TBM42_UPD_CNT != BC001I2_A900TBM42_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z905TBM42_DOM_ENM, BC001I2_A905TBM42_DOM_ENM[0]) != 0 ) || ( GXutil.strcmp(Z906TBM42_DOM_JNM, BC001I2_A906TBM42_DOM_JNM[0]) != 0 ) || ( GXutil.strcmp(Z907TBM42_DOM_GRP_NM, BC001I2_A907TBM42_DOM_GRP_NM[0]) != 0 ) || ( GXutil.strcmp(Z908TBM42_NOTE, BC001I2_A908TBM42_NOTE[0]) != 0 ) || ( Z909TBM42_ORDER != BC001I2_A909TBM42_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z893TBM42_DEL_FLG, BC001I2_A893TBM42_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z896TBM42_CRT_PROG_NM, BC001I2_A896TBM42_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z899TBM42_UPD_PROG_NM, BC001I2_A899TBM42_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM42_STUDY_CDISC_DOMAIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1I53( )
   {
      beforeValidate1I53( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I53( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1I53( 0) ;
         checkOptimisticConcurrency1I53( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I53( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1I53( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001I6 */
                  pr_default.execute(4, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD, new Boolean(n894TBM42_CRT_DATETIME), A894TBM42_CRT_DATETIME, new Boolean(n895TBM42_CRT_USER_ID), A895TBM42_CRT_USER_ID, new Boolean(n897TBM42_UPD_DATETIME), A897TBM42_UPD_DATETIME, new Boolean(n898TBM42_UPD_USER_ID), A898TBM42_UPD_USER_ID, new Boolean(n900TBM42_UPD_CNT), new Long(A900TBM42_UPD_CNT), new Boolean(n905TBM42_DOM_ENM), A905TBM42_DOM_ENM, new Boolean(n906TBM42_DOM_JNM), A906TBM42_DOM_JNM, new Boolean(n907TBM42_DOM_GRP_NM), A907TBM42_DOM_GRP_NM, new Boolean(n908TBM42_NOTE), A908TBM42_NOTE, new Boolean(n909TBM42_ORDER), new Integer(A909TBM42_ORDER), new Boolean(n893TBM42_DEL_FLG), A893TBM42_DEL_FLG, new Boolean(n896TBM42_CRT_PROG_NM), A896TBM42_CRT_PROG_NM, new Boolean(n899TBM42_UPD_PROG_NM), A899TBM42_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM42_STUDY_CDISC_DOMAIN") ;
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
            load1I53( ) ;
         }
         endLevel1I53( ) ;
      }
      closeExtendedTableCursors1I53( ) ;
   }

   public void update1I53( )
   {
      beforeValidate1I53( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I53( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I53( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I53( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1I53( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001I7 */
                  pr_default.execute(5, new Object[] {new Boolean(n894TBM42_CRT_DATETIME), A894TBM42_CRT_DATETIME, new Boolean(n895TBM42_CRT_USER_ID), A895TBM42_CRT_USER_ID, new Boolean(n897TBM42_UPD_DATETIME), A897TBM42_UPD_DATETIME, new Boolean(n898TBM42_UPD_USER_ID), A898TBM42_UPD_USER_ID, new Boolean(n900TBM42_UPD_CNT), new Long(A900TBM42_UPD_CNT), new Boolean(n905TBM42_DOM_ENM), A905TBM42_DOM_ENM, new Boolean(n906TBM42_DOM_JNM), A906TBM42_DOM_JNM, new Boolean(n907TBM42_DOM_GRP_NM), A907TBM42_DOM_GRP_NM, new Boolean(n908TBM42_NOTE), A908TBM42_NOTE, new Boolean(n909TBM42_ORDER), new Integer(A909TBM42_ORDER), new Boolean(n893TBM42_DEL_FLG), A893TBM42_DEL_FLG, new Boolean(n896TBM42_CRT_PROG_NM), A896TBM42_CRT_PROG_NM, new Boolean(n899TBM42_UPD_PROG_NM), A899TBM42_UPD_PROG_NM, new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM42_STUDY_CDISC_DOMAIN") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM42_STUDY_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1I53( ) ;
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
         endLevel1I53( ) ;
      }
      closeExtendedTableCursors1I53( ) ;
   }

   public void deferredUpdate1I53( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1I53( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I53( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1I53( ) ;
         afterConfirm1I53( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1I53( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001I8 */
               pr_default.execute(6, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM42_STUDY_CDISC_DOMAIN") ;
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
      sMode53 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1I53( ) ;
      Gx_mode = sMode53 ;
   }

   public void onDeleteControls1I53( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN_BC" ;
      }
   }

   public void endLevel1I53( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1I53( ) ;
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

   public void scanKeyStart1I53( )
   {
      /* Scan By routine */
      /* Using cursor BC001I9 */
      pr_default.execute(7, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      RcdFound53 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A203TBM42_STUDY_ID = BC001I9_A203TBM42_STUDY_ID[0] ;
         A204TBM42_DOM_CD = BC001I9_A204TBM42_DOM_CD[0] ;
         A894TBM42_CRT_DATETIME = BC001I9_A894TBM42_CRT_DATETIME[0] ;
         n894TBM42_CRT_DATETIME = BC001I9_n894TBM42_CRT_DATETIME[0] ;
         A895TBM42_CRT_USER_ID = BC001I9_A895TBM42_CRT_USER_ID[0] ;
         n895TBM42_CRT_USER_ID = BC001I9_n895TBM42_CRT_USER_ID[0] ;
         A897TBM42_UPD_DATETIME = BC001I9_A897TBM42_UPD_DATETIME[0] ;
         n897TBM42_UPD_DATETIME = BC001I9_n897TBM42_UPD_DATETIME[0] ;
         A898TBM42_UPD_USER_ID = BC001I9_A898TBM42_UPD_USER_ID[0] ;
         n898TBM42_UPD_USER_ID = BC001I9_n898TBM42_UPD_USER_ID[0] ;
         A900TBM42_UPD_CNT = BC001I9_A900TBM42_UPD_CNT[0] ;
         n900TBM42_UPD_CNT = BC001I9_n900TBM42_UPD_CNT[0] ;
         A905TBM42_DOM_ENM = BC001I9_A905TBM42_DOM_ENM[0] ;
         n905TBM42_DOM_ENM = BC001I9_n905TBM42_DOM_ENM[0] ;
         A906TBM42_DOM_JNM = BC001I9_A906TBM42_DOM_JNM[0] ;
         n906TBM42_DOM_JNM = BC001I9_n906TBM42_DOM_JNM[0] ;
         A907TBM42_DOM_GRP_NM = BC001I9_A907TBM42_DOM_GRP_NM[0] ;
         n907TBM42_DOM_GRP_NM = BC001I9_n907TBM42_DOM_GRP_NM[0] ;
         A908TBM42_NOTE = BC001I9_A908TBM42_NOTE[0] ;
         n908TBM42_NOTE = BC001I9_n908TBM42_NOTE[0] ;
         A909TBM42_ORDER = BC001I9_A909TBM42_ORDER[0] ;
         n909TBM42_ORDER = BC001I9_n909TBM42_ORDER[0] ;
         A893TBM42_DEL_FLG = BC001I9_A893TBM42_DEL_FLG[0] ;
         n893TBM42_DEL_FLG = BC001I9_n893TBM42_DEL_FLG[0] ;
         A896TBM42_CRT_PROG_NM = BC001I9_A896TBM42_CRT_PROG_NM[0] ;
         n896TBM42_CRT_PROG_NM = BC001I9_n896TBM42_CRT_PROG_NM[0] ;
         A899TBM42_UPD_PROG_NM = BC001I9_A899TBM42_UPD_PROG_NM[0] ;
         n899TBM42_UPD_PROG_NM = BC001I9_n899TBM42_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1I53( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound53 = (short)(0) ;
      scanKeyLoad1I53( ) ;
   }

   public void scanKeyLoad1I53( )
   {
      sMode53 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A203TBM42_STUDY_ID = BC001I9_A203TBM42_STUDY_ID[0] ;
         A204TBM42_DOM_CD = BC001I9_A204TBM42_DOM_CD[0] ;
         A894TBM42_CRT_DATETIME = BC001I9_A894TBM42_CRT_DATETIME[0] ;
         n894TBM42_CRT_DATETIME = BC001I9_n894TBM42_CRT_DATETIME[0] ;
         A895TBM42_CRT_USER_ID = BC001I9_A895TBM42_CRT_USER_ID[0] ;
         n895TBM42_CRT_USER_ID = BC001I9_n895TBM42_CRT_USER_ID[0] ;
         A897TBM42_UPD_DATETIME = BC001I9_A897TBM42_UPD_DATETIME[0] ;
         n897TBM42_UPD_DATETIME = BC001I9_n897TBM42_UPD_DATETIME[0] ;
         A898TBM42_UPD_USER_ID = BC001I9_A898TBM42_UPD_USER_ID[0] ;
         n898TBM42_UPD_USER_ID = BC001I9_n898TBM42_UPD_USER_ID[0] ;
         A900TBM42_UPD_CNT = BC001I9_A900TBM42_UPD_CNT[0] ;
         n900TBM42_UPD_CNT = BC001I9_n900TBM42_UPD_CNT[0] ;
         A905TBM42_DOM_ENM = BC001I9_A905TBM42_DOM_ENM[0] ;
         n905TBM42_DOM_ENM = BC001I9_n905TBM42_DOM_ENM[0] ;
         A906TBM42_DOM_JNM = BC001I9_A906TBM42_DOM_JNM[0] ;
         n906TBM42_DOM_JNM = BC001I9_n906TBM42_DOM_JNM[0] ;
         A907TBM42_DOM_GRP_NM = BC001I9_A907TBM42_DOM_GRP_NM[0] ;
         n907TBM42_DOM_GRP_NM = BC001I9_n907TBM42_DOM_GRP_NM[0] ;
         A908TBM42_NOTE = BC001I9_A908TBM42_NOTE[0] ;
         n908TBM42_NOTE = BC001I9_n908TBM42_NOTE[0] ;
         A909TBM42_ORDER = BC001I9_A909TBM42_ORDER[0] ;
         n909TBM42_ORDER = BC001I9_n909TBM42_ORDER[0] ;
         A893TBM42_DEL_FLG = BC001I9_A893TBM42_DEL_FLG[0] ;
         n893TBM42_DEL_FLG = BC001I9_n893TBM42_DEL_FLG[0] ;
         A896TBM42_CRT_PROG_NM = BC001I9_A896TBM42_CRT_PROG_NM[0] ;
         n896TBM42_CRT_PROG_NM = BC001I9_n896TBM42_CRT_PROG_NM[0] ;
         A899TBM42_UPD_PROG_NM = BC001I9_A899TBM42_UPD_PROG_NM[0] ;
         n899TBM42_UPD_PROG_NM = BC001I9_n899TBM42_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode53 ;
   }

   public void scanKeyEnd1I53( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1I53( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1I53( )
   {
      /* Before Insert Rules */
      A894TBM42_CRT_DATETIME = GXutil.now( ) ;
      n894TBM42_CRT_DATETIME = false ;
      GXt_char1 = A895TBM42_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A895TBM42_CRT_USER_ID = GXt_char1 ;
      n895TBM42_CRT_USER_ID = false ;
      A897TBM42_UPD_DATETIME = GXutil.now( ) ;
      n897TBM42_UPD_DATETIME = false ;
      GXt_char1 = A898TBM42_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A898TBM42_UPD_USER_ID = GXt_char1 ;
      n898TBM42_UPD_USER_ID = false ;
      A900TBM42_UPD_CNT = (long)(O900TBM42_UPD_CNT+1) ;
      n900TBM42_UPD_CNT = false ;
   }

   public void beforeUpdate1I53( )
   {
      /* Before Update Rules */
      A897TBM42_UPD_DATETIME = GXutil.now( ) ;
      n897TBM42_UPD_DATETIME = false ;
      GXt_char1 = A898TBM42_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A898TBM42_UPD_USER_ID = GXt_char1 ;
      n898TBM42_UPD_USER_ID = false ;
      A900TBM42_UPD_CNT = (long)(O900TBM42_UPD_CNT+1) ;
      n900TBM42_UPD_CNT = false ;
   }

   public void beforeDelete1I53( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1I53( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1I53( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1I53( )
   {
   }

   public void addRow1I53( )
   {
      VarsToRow53( bcTBM42_STUDY_CDISC_DOMAIN) ;
   }

   public void readRow1I53( )
   {
      RowToVars53( bcTBM42_STUDY_CDISC_DOMAIN, 1) ;
   }

   public void initializeNonKey1I53( )
   {
      A894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n894TBM42_CRT_DATETIME = false ;
      A895TBM42_CRT_USER_ID = "" ;
      n895TBM42_CRT_USER_ID = false ;
      A897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n897TBM42_UPD_DATETIME = false ;
      A898TBM42_UPD_USER_ID = "" ;
      n898TBM42_UPD_USER_ID = false ;
      A900TBM42_UPD_CNT = 0 ;
      n900TBM42_UPD_CNT = false ;
      A905TBM42_DOM_ENM = "" ;
      n905TBM42_DOM_ENM = false ;
      A906TBM42_DOM_JNM = "" ;
      n906TBM42_DOM_JNM = false ;
      A907TBM42_DOM_GRP_NM = "" ;
      n907TBM42_DOM_GRP_NM = false ;
      A908TBM42_NOTE = "" ;
      n908TBM42_NOTE = false ;
      A909TBM42_ORDER = 0 ;
      n909TBM42_ORDER = false ;
      A893TBM42_DEL_FLG = "" ;
      n893TBM42_DEL_FLG = false ;
      A896TBM42_CRT_PROG_NM = "" ;
      n896TBM42_CRT_PROG_NM = false ;
      A899TBM42_UPD_PROG_NM = "" ;
      n899TBM42_UPD_PROG_NM = false ;
      O900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
      n900TBM42_UPD_CNT = false ;
   }

   public void initAll1I53( )
   {
      A203TBM42_STUDY_ID = 0 ;
      A204TBM42_DOM_CD = "" ;
      initializeNonKey1I53( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow53( SdtTBM42_STUDY_CDISC_DOMAIN obj53 )
   {
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( Gx_mode );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime( A894TBM42_CRT_DATETIME );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id( A895TBM42_CRT_USER_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime( A897TBM42_UPD_DATETIME );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id( A898TBM42_UPD_USER_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt( A900TBM42_UPD_CNT );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm( A905TBM42_DOM_ENM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm( A906TBM42_DOM_JNM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm( A907TBM42_DOM_GRP_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note( A908TBM42_NOTE );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order( A909TBM42_ORDER );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg( A893TBM42_DEL_FLG );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm( A896TBM42_CRT_PROG_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm( A899TBM42_UPD_PROG_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id( A203TBM42_STUDY_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd( A204TBM42_DOM_CD );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z( Z203TBM42_STUDY_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z( Z204TBM42_DOM_CD );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z( Z905TBM42_DOM_ENM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z( Z906TBM42_DOM_JNM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z( Z907TBM42_DOM_GRP_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z( Z908TBM42_NOTE );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z( Z909TBM42_ORDER );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z( Z893TBM42_DEL_FLG );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z( Z894TBM42_CRT_DATETIME );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z( Z895TBM42_CRT_USER_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z( Z896TBM42_CRT_PROG_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z( Z897TBM42_UPD_DATETIME );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z( Z898TBM42_UPD_USER_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z( Z899TBM42_UPD_PROG_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z( Z900TBM42_UPD_CNT );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N( (byte)((byte)((n905TBM42_DOM_ENM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N( (byte)((byte)((n906TBM42_DOM_JNM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N( (byte)((byte)((n907TBM42_DOM_GRP_NM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N( (byte)((byte)((n908TBM42_NOTE)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N( (byte)((byte)((n909TBM42_ORDER)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N( (byte)((byte)((n893TBM42_DEL_FLG)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N( (byte)((byte)((n894TBM42_CRT_DATETIME)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N( (byte)((byte)((n895TBM42_CRT_USER_ID)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N( (byte)((byte)((n896TBM42_CRT_PROG_NM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N( (byte)((byte)((n897TBM42_UPD_DATETIME)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N( (byte)((byte)((n898TBM42_UPD_USER_ID)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N( (byte)((byte)((n899TBM42_UPD_PROG_NM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N( (byte)((byte)((n900TBM42_UPD_CNT)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( Gx_mode );
   }

   public void KeyVarsToRow53( SdtTBM42_STUDY_CDISC_DOMAIN obj53 )
   {
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id( A203TBM42_STUDY_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd( A204TBM42_DOM_CD );
   }

   public void RowToVars53( SdtTBM42_STUDY_CDISC_DOMAIN obj53 ,
                            int forceLoad )
   {
      Gx_mode = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode() ;
      A894TBM42_CRT_DATETIME = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime() ;
      n894TBM42_CRT_DATETIME = false ;
      A895TBM42_CRT_USER_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id() ;
      n895TBM42_CRT_USER_ID = false ;
      A897TBM42_UPD_DATETIME = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime() ;
      n897TBM42_UPD_DATETIME = false ;
      A898TBM42_UPD_USER_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id() ;
      n898TBM42_UPD_USER_ID = false ;
      A900TBM42_UPD_CNT = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt() ;
      n900TBM42_UPD_CNT = false ;
      A905TBM42_DOM_ENM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm() ;
      n905TBM42_DOM_ENM = false ;
      A906TBM42_DOM_JNM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm() ;
      n906TBM42_DOM_JNM = false ;
      A907TBM42_DOM_GRP_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm() ;
      n907TBM42_DOM_GRP_NM = false ;
      A908TBM42_NOTE = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note() ;
      n908TBM42_NOTE = false ;
      A909TBM42_ORDER = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order() ;
      n909TBM42_ORDER = false ;
      A893TBM42_DEL_FLG = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg() ;
      n893TBM42_DEL_FLG = false ;
      A896TBM42_CRT_PROG_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm() ;
      n896TBM42_CRT_PROG_NM = false ;
      A899TBM42_UPD_PROG_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm() ;
      n899TBM42_UPD_PROG_NM = false ;
      A203TBM42_STUDY_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id() ;
      A204TBM42_DOM_CD = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd() ;
      Z203TBM42_STUDY_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z() ;
      Z204TBM42_DOM_CD = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z() ;
      Z905TBM42_DOM_ENM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z() ;
      Z906TBM42_DOM_JNM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z() ;
      Z907TBM42_DOM_GRP_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z() ;
      Z908TBM42_NOTE = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z() ;
      Z909TBM42_ORDER = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z() ;
      Z893TBM42_DEL_FLG = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z() ;
      Z894TBM42_CRT_DATETIME = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z() ;
      Z895TBM42_CRT_USER_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z() ;
      Z896TBM42_CRT_PROG_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z() ;
      Z897TBM42_UPD_DATETIME = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z() ;
      Z898TBM42_UPD_USER_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z() ;
      Z899TBM42_UPD_PROG_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z() ;
      Z900TBM42_UPD_CNT = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z() ;
      O900TBM42_UPD_CNT = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z() ;
      n905TBM42_DOM_ENM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N()==0)?false:true) ;
      n906TBM42_DOM_JNM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N()==0)?false:true) ;
      n907TBM42_DOM_GRP_NM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N()==0)?false:true) ;
      n908TBM42_NOTE = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N()==0)?false:true) ;
      n909TBM42_ORDER = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N()==0)?false:true) ;
      n893TBM42_DEL_FLG = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N()==0)?false:true) ;
      n894TBM42_CRT_DATETIME = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N()==0)?false:true) ;
      n895TBM42_CRT_USER_ID = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N()==0)?false:true) ;
      n896TBM42_CRT_PROG_NM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N()==0)?false:true) ;
      n897TBM42_UPD_DATETIME = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N()==0)?false:true) ;
      n898TBM42_UPD_USER_ID = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N()==0)?false:true) ;
      n899TBM42_UPD_PROG_NM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N()==0)?false:true) ;
      n900TBM42_UPD_CNT = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A203TBM42_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A204TBM42_DOM_CD = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1I53( ) ;
      scanKeyStart1I53( ) ;
      if ( RcdFound53 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z203TBM42_STUDY_ID = A203TBM42_STUDY_ID ;
         Z204TBM42_DOM_CD = A204TBM42_DOM_CD ;
         O900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
         n900TBM42_UPD_CNT = false ;
      }
      zm1I53( -8) ;
      onLoadActions1I53( ) ;
      addRow1I53( ) ;
      scanKeyEnd1I53( ) ;
      if ( RcdFound53 == 0 )
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
      RowToVars53( bcTBM42_STUDY_CDISC_DOMAIN, 0) ;
      scanKeyStart1I53( ) ;
      if ( RcdFound53 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z203TBM42_STUDY_ID = A203TBM42_STUDY_ID ;
         Z204TBM42_DOM_CD = A204TBM42_DOM_CD ;
         O900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
         n900TBM42_UPD_CNT = false ;
      }
      zm1I53( -8) ;
      onLoadActions1I53( ) ;
      addRow1I53( ) ;
      scanKeyEnd1I53( ) ;
      if ( RcdFound53 == 0 )
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
      RowToVars53( bcTBM42_STUDY_CDISC_DOMAIN, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1I53( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1I53( ) ;
      }
      else
      {
         if ( RcdFound53 == 1 )
         {
            if ( ( A203TBM42_STUDY_ID != Z203TBM42_STUDY_ID ) || ( GXutil.strcmp(A204TBM42_DOM_CD, Z204TBM42_DOM_CD) != 0 ) )
            {
               A203TBM42_STUDY_ID = Z203TBM42_STUDY_ID ;
               A204TBM42_DOM_CD = Z204TBM42_DOM_CD ;
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
               update1I53( ) ;
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
               if ( ( A203TBM42_STUDY_ID != Z203TBM42_STUDY_ID ) || ( GXutil.strcmp(A204TBM42_DOM_CD, Z204TBM42_DOM_CD) != 0 ) )
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
                     insert1I53( ) ;
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
                     insert1I53( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow53( bcTBM42_STUDY_CDISC_DOMAIN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars53( bcTBM42_STUDY_CDISC_DOMAIN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1I53( ) ;
      if ( RcdFound53 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A203TBM42_STUDY_ID != Z203TBM42_STUDY_ID ) || ( GXutil.strcmp(A204TBM42_DOM_CD, Z204TBM42_DOM_CD) != 0 ) )
         {
            A203TBM42_STUDY_ID = Z203TBM42_STUDY_ID ;
            A204TBM42_DOM_CD = Z204TBM42_DOM_CD ;
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
         if ( ( A203TBM42_STUDY_ID != Z203TBM42_STUDY_ID ) || ( GXutil.strcmp(A204TBM42_DOM_CD, Z204TBM42_DOM_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm42_study_cdisc_domain_bc");
      VarsToRow53( bcTBM42_STUDY_CDISC_DOMAIN) ;
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
      Gx_mode = bcTBM42_STUDY_CDISC_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM42_STUDY_CDISC_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM42_STUDY_CDISC_DOMAIN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM42_STUDY_CDISC_DOMAIN )
      {
         bcTBM42_STUDY_CDISC_DOMAIN = sdt ;
         if ( GXutil.strcmp(bcTBM42_STUDY_CDISC_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode(), "") == 0 )
         {
            bcTBM42_STUDY_CDISC_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow53( bcTBM42_STUDY_CDISC_DOMAIN) ;
         }
         else
         {
            RowToVars53( bcTBM42_STUDY_CDISC_DOMAIN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM42_STUDY_CDISC_DOMAIN.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode(), "") == 0 )
         {
            bcTBM42_STUDY_CDISC_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars53( bcTBM42_STUDY_CDISC_DOMAIN, 1) ;
   }

   public SdtTBM42_STUDY_CDISC_DOMAIN getTBM42_STUDY_CDISC_DOMAIN_BC( )
   {
      return bcTBM42_STUDY_CDISC_DOMAIN ;
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
      Z204TBM42_DOM_CD = "" ;
      A204TBM42_DOM_CD = "" ;
      AV7W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV8W_TXT = "" ;
      A905TBM42_DOM_ENM = "" ;
      A906TBM42_DOM_JNM = "" ;
      A907TBM42_DOM_GRP_NM = "" ;
      A908TBM42_NOTE = "" ;
      A893TBM42_DEL_FLG = "" ;
      A894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A895TBM42_CRT_USER_ID = "" ;
      A896TBM42_CRT_PROG_NM = "" ;
      A897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A898TBM42_UPD_USER_ID = "" ;
      A899TBM42_UPD_PROG_NM = "" ;
      Z894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z895TBM42_CRT_USER_ID = "" ;
      Z897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z898TBM42_UPD_USER_ID = "" ;
      Z905TBM42_DOM_ENM = "" ;
      Z906TBM42_DOM_JNM = "" ;
      Z907TBM42_DOM_GRP_NM = "" ;
      Z908TBM42_NOTE = "" ;
      Z893TBM42_DEL_FLG = "" ;
      Z896TBM42_CRT_PROG_NM = "" ;
      Z899TBM42_UPD_PROG_NM = "" ;
      BC001I4_A203TBM42_STUDY_ID = new long[1] ;
      BC001I4_A204TBM42_DOM_CD = new String[] {""} ;
      BC001I4_A894TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I4_n894TBM42_CRT_DATETIME = new boolean[] {false} ;
      BC001I4_A895TBM42_CRT_USER_ID = new String[] {""} ;
      BC001I4_n895TBM42_CRT_USER_ID = new boolean[] {false} ;
      BC001I4_A897TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I4_n897TBM42_UPD_DATETIME = new boolean[] {false} ;
      BC001I4_A898TBM42_UPD_USER_ID = new String[] {""} ;
      BC001I4_n898TBM42_UPD_USER_ID = new boolean[] {false} ;
      BC001I4_A900TBM42_UPD_CNT = new long[1] ;
      BC001I4_n900TBM42_UPD_CNT = new boolean[] {false} ;
      BC001I4_A905TBM42_DOM_ENM = new String[] {""} ;
      BC001I4_n905TBM42_DOM_ENM = new boolean[] {false} ;
      BC001I4_A906TBM42_DOM_JNM = new String[] {""} ;
      BC001I4_n906TBM42_DOM_JNM = new boolean[] {false} ;
      BC001I4_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      BC001I4_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      BC001I4_A908TBM42_NOTE = new String[] {""} ;
      BC001I4_n908TBM42_NOTE = new boolean[] {false} ;
      BC001I4_A909TBM42_ORDER = new int[1] ;
      BC001I4_n909TBM42_ORDER = new boolean[] {false} ;
      BC001I4_A893TBM42_DEL_FLG = new String[] {""} ;
      BC001I4_n893TBM42_DEL_FLG = new boolean[] {false} ;
      BC001I4_A896TBM42_CRT_PROG_NM = new String[] {""} ;
      BC001I4_n896TBM42_CRT_PROG_NM = new boolean[] {false} ;
      BC001I4_A899TBM42_UPD_PROG_NM = new String[] {""} ;
      BC001I4_n899TBM42_UPD_PROG_NM = new boolean[] {false} ;
      BC001I5_A203TBM42_STUDY_ID = new long[1] ;
      BC001I5_A204TBM42_DOM_CD = new String[] {""} ;
      BC001I3_A203TBM42_STUDY_ID = new long[1] ;
      BC001I3_A204TBM42_DOM_CD = new String[] {""} ;
      BC001I3_A894TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I3_n894TBM42_CRT_DATETIME = new boolean[] {false} ;
      BC001I3_A895TBM42_CRT_USER_ID = new String[] {""} ;
      BC001I3_n895TBM42_CRT_USER_ID = new boolean[] {false} ;
      BC001I3_A897TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I3_n897TBM42_UPD_DATETIME = new boolean[] {false} ;
      BC001I3_A898TBM42_UPD_USER_ID = new String[] {""} ;
      BC001I3_n898TBM42_UPD_USER_ID = new boolean[] {false} ;
      BC001I3_A900TBM42_UPD_CNT = new long[1] ;
      BC001I3_n900TBM42_UPD_CNT = new boolean[] {false} ;
      BC001I3_A905TBM42_DOM_ENM = new String[] {""} ;
      BC001I3_n905TBM42_DOM_ENM = new boolean[] {false} ;
      BC001I3_A906TBM42_DOM_JNM = new String[] {""} ;
      BC001I3_n906TBM42_DOM_JNM = new boolean[] {false} ;
      BC001I3_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      BC001I3_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      BC001I3_A908TBM42_NOTE = new String[] {""} ;
      BC001I3_n908TBM42_NOTE = new boolean[] {false} ;
      BC001I3_A909TBM42_ORDER = new int[1] ;
      BC001I3_n909TBM42_ORDER = new boolean[] {false} ;
      BC001I3_A893TBM42_DEL_FLG = new String[] {""} ;
      BC001I3_n893TBM42_DEL_FLG = new boolean[] {false} ;
      BC001I3_A896TBM42_CRT_PROG_NM = new String[] {""} ;
      BC001I3_n896TBM42_CRT_PROG_NM = new boolean[] {false} ;
      BC001I3_A899TBM42_UPD_PROG_NM = new String[] {""} ;
      BC001I3_n899TBM42_UPD_PROG_NM = new boolean[] {false} ;
      sMode53 = "" ;
      BC001I2_A203TBM42_STUDY_ID = new long[1] ;
      BC001I2_A204TBM42_DOM_CD = new String[] {""} ;
      BC001I2_A894TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I2_n894TBM42_CRT_DATETIME = new boolean[] {false} ;
      BC001I2_A895TBM42_CRT_USER_ID = new String[] {""} ;
      BC001I2_n895TBM42_CRT_USER_ID = new boolean[] {false} ;
      BC001I2_A897TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I2_n897TBM42_UPD_DATETIME = new boolean[] {false} ;
      BC001I2_A898TBM42_UPD_USER_ID = new String[] {""} ;
      BC001I2_n898TBM42_UPD_USER_ID = new boolean[] {false} ;
      BC001I2_A900TBM42_UPD_CNT = new long[1] ;
      BC001I2_n900TBM42_UPD_CNT = new boolean[] {false} ;
      BC001I2_A905TBM42_DOM_ENM = new String[] {""} ;
      BC001I2_n905TBM42_DOM_ENM = new boolean[] {false} ;
      BC001I2_A906TBM42_DOM_JNM = new String[] {""} ;
      BC001I2_n906TBM42_DOM_JNM = new boolean[] {false} ;
      BC001I2_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      BC001I2_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      BC001I2_A908TBM42_NOTE = new String[] {""} ;
      BC001I2_n908TBM42_NOTE = new boolean[] {false} ;
      BC001I2_A909TBM42_ORDER = new int[1] ;
      BC001I2_n909TBM42_ORDER = new boolean[] {false} ;
      BC001I2_A893TBM42_DEL_FLG = new String[] {""} ;
      BC001I2_n893TBM42_DEL_FLG = new boolean[] {false} ;
      BC001I2_A896TBM42_CRT_PROG_NM = new String[] {""} ;
      BC001I2_n896TBM42_CRT_PROG_NM = new boolean[] {false} ;
      BC001I2_A899TBM42_UPD_PROG_NM = new String[] {""} ;
      BC001I2_n899TBM42_UPD_PROG_NM = new boolean[] {false} ;
      BC001I9_A203TBM42_STUDY_ID = new long[1] ;
      BC001I9_A204TBM42_DOM_CD = new String[] {""} ;
      BC001I9_A894TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I9_n894TBM42_CRT_DATETIME = new boolean[] {false} ;
      BC001I9_A895TBM42_CRT_USER_ID = new String[] {""} ;
      BC001I9_n895TBM42_CRT_USER_ID = new boolean[] {false} ;
      BC001I9_A897TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I9_n897TBM42_UPD_DATETIME = new boolean[] {false} ;
      BC001I9_A898TBM42_UPD_USER_ID = new String[] {""} ;
      BC001I9_n898TBM42_UPD_USER_ID = new boolean[] {false} ;
      BC001I9_A900TBM42_UPD_CNT = new long[1] ;
      BC001I9_n900TBM42_UPD_CNT = new boolean[] {false} ;
      BC001I9_A905TBM42_DOM_ENM = new String[] {""} ;
      BC001I9_n905TBM42_DOM_ENM = new boolean[] {false} ;
      BC001I9_A906TBM42_DOM_JNM = new String[] {""} ;
      BC001I9_n906TBM42_DOM_JNM = new boolean[] {false} ;
      BC001I9_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      BC001I9_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      BC001I9_A908TBM42_NOTE = new String[] {""} ;
      BC001I9_n908TBM42_NOTE = new boolean[] {false} ;
      BC001I9_A909TBM42_ORDER = new int[1] ;
      BC001I9_n909TBM42_ORDER = new boolean[] {false} ;
      BC001I9_A893TBM42_DEL_FLG = new String[] {""} ;
      BC001I9_n893TBM42_DEL_FLG = new boolean[] {false} ;
      BC001I9_A896TBM42_CRT_PROG_NM = new String[] {""} ;
      BC001I9_n896TBM42_CRT_PROG_NM = new boolean[] {false} ;
      BC001I9_A899TBM42_UPD_PROG_NM = new String[] {""} ;
      BC001I9_n899TBM42_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm42_study_cdisc_domain_bc__default(),
         new Object[] {
             new Object[] {
            BC001I2_A203TBM42_STUDY_ID, BC001I2_A204TBM42_DOM_CD, BC001I2_A894TBM42_CRT_DATETIME, BC001I2_n894TBM42_CRT_DATETIME, BC001I2_A895TBM42_CRT_USER_ID, BC001I2_n895TBM42_CRT_USER_ID, BC001I2_A897TBM42_UPD_DATETIME, BC001I2_n897TBM42_UPD_DATETIME, BC001I2_A898TBM42_UPD_USER_ID, BC001I2_n898TBM42_UPD_USER_ID,
            BC001I2_A900TBM42_UPD_CNT, BC001I2_n900TBM42_UPD_CNT, BC001I2_A905TBM42_DOM_ENM, BC001I2_n905TBM42_DOM_ENM, BC001I2_A906TBM42_DOM_JNM, BC001I2_n906TBM42_DOM_JNM, BC001I2_A907TBM42_DOM_GRP_NM, BC001I2_n907TBM42_DOM_GRP_NM, BC001I2_A908TBM42_NOTE, BC001I2_n908TBM42_NOTE,
            BC001I2_A909TBM42_ORDER, BC001I2_n909TBM42_ORDER, BC001I2_A893TBM42_DEL_FLG, BC001I2_n893TBM42_DEL_FLG, BC001I2_A896TBM42_CRT_PROG_NM, BC001I2_n896TBM42_CRT_PROG_NM, BC001I2_A899TBM42_UPD_PROG_NM, BC001I2_n899TBM42_UPD_PROG_NM
            }
            , new Object[] {
            BC001I3_A203TBM42_STUDY_ID, BC001I3_A204TBM42_DOM_CD, BC001I3_A894TBM42_CRT_DATETIME, BC001I3_n894TBM42_CRT_DATETIME, BC001I3_A895TBM42_CRT_USER_ID, BC001I3_n895TBM42_CRT_USER_ID, BC001I3_A897TBM42_UPD_DATETIME, BC001I3_n897TBM42_UPD_DATETIME, BC001I3_A898TBM42_UPD_USER_ID, BC001I3_n898TBM42_UPD_USER_ID,
            BC001I3_A900TBM42_UPD_CNT, BC001I3_n900TBM42_UPD_CNT, BC001I3_A905TBM42_DOM_ENM, BC001I3_n905TBM42_DOM_ENM, BC001I3_A906TBM42_DOM_JNM, BC001I3_n906TBM42_DOM_JNM, BC001I3_A907TBM42_DOM_GRP_NM, BC001I3_n907TBM42_DOM_GRP_NM, BC001I3_A908TBM42_NOTE, BC001I3_n908TBM42_NOTE,
            BC001I3_A909TBM42_ORDER, BC001I3_n909TBM42_ORDER, BC001I3_A893TBM42_DEL_FLG, BC001I3_n893TBM42_DEL_FLG, BC001I3_A896TBM42_CRT_PROG_NM, BC001I3_n896TBM42_CRT_PROG_NM, BC001I3_A899TBM42_UPD_PROG_NM, BC001I3_n899TBM42_UPD_PROG_NM
            }
            , new Object[] {
            BC001I4_A203TBM42_STUDY_ID, BC001I4_A204TBM42_DOM_CD, BC001I4_A894TBM42_CRT_DATETIME, BC001I4_n894TBM42_CRT_DATETIME, BC001I4_A895TBM42_CRT_USER_ID, BC001I4_n895TBM42_CRT_USER_ID, BC001I4_A897TBM42_UPD_DATETIME, BC001I4_n897TBM42_UPD_DATETIME, BC001I4_A898TBM42_UPD_USER_ID, BC001I4_n898TBM42_UPD_USER_ID,
            BC001I4_A900TBM42_UPD_CNT, BC001I4_n900TBM42_UPD_CNT, BC001I4_A905TBM42_DOM_ENM, BC001I4_n905TBM42_DOM_ENM, BC001I4_A906TBM42_DOM_JNM, BC001I4_n906TBM42_DOM_JNM, BC001I4_A907TBM42_DOM_GRP_NM, BC001I4_n907TBM42_DOM_GRP_NM, BC001I4_A908TBM42_NOTE, BC001I4_n908TBM42_NOTE,
            BC001I4_A909TBM42_ORDER, BC001I4_n909TBM42_ORDER, BC001I4_A893TBM42_DEL_FLG, BC001I4_n893TBM42_DEL_FLG, BC001I4_A896TBM42_CRT_PROG_NM, BC001I4_n896TBM42_CRT_PROG_NM, BC001I4_A899TBM42_UPD_PROG_NM, BC001I4_n899TBM42_UPD_PROG_NM
            }
            , new Object[] {
            BC001I5_A203TBM42_STUDY_ID, BC001I5_A204TBM42_DOM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001I9_A203TBM42_STUDY_ID, BC001I9_A204TBM42_DOM_CD, BC001I9_A894TBM42_CRT_DATETIME, BC001I9_n894TBM42_CRT_DATETIME, BC001I9_A895TBM42_CRT_USER_ID, BC001I9_n895TBM42_CRT_USER_ID, BC001I9_A897TBM42_UPD_DATETIME, BC001I9_n897TBM42_UPD_DATETIME, BC001I9_A898TBM42_UPD_USER_ID, BC001I9_n898TBM42_UPD_USER_ID,
            BC001I9_A900TBM42_UPD_CNT, BC001I9_n900TBM42_UPD_CNT, BC001I9_A905TBM42_DOM_ENM, BC001I9_n905TBM42_DOM_ENM, BC001I9_A906TBM42_DOM_JNM, BC001I9_n906TBM42_DOM_JNM, BC001I9_A907TBM42_DOM_GRP_NM, BC001I9_n907TBM42_DOM_GRP_NM, BC001I9_A908TBM42_NOTE, BC001I9_n908TBM42_NOTE,
            BC001I9_A909TBM42_ORDER, BC001I9_n909TBM42_ORDER, BC001I9_A893TBM42_DEL_FLG, BC001I9_n893TBM42_DEL_FLG, BC001I9_A896TBM42_CRT_PROG_NM, BC001I9_n896TBM42_CRT_PROG_NM, BC001I9_A899TBM42_UPD_PROG_NM, BC001I9_n899TBM42_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e111I2 */
      e111I2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound53 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A909TBM42_ORDER ;
   private int GX_JID ;
   private int Z909TBM42_ORDER ;
   private int GXActiveErrHndl ;
   private long Z203TBM42_STUDY_ID ;
   private long A203TBM42_STUDY_ID ;
   private long A900TBM42_UPD_CNT ;
   private long Z900TBM42_UPD_CNT ;
   private long O900TBM42_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode53 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A894TBM42_CRT_DATETIME ;
   private java.util.Date A897TBM42_UPD_DATETIME ;
   private java.util.Date Z894TBM42_CRT_DATETIME ;
   private java.util.Date Z897TBM42_UPD_DATETIME ;
   private boolean n894TBM42_CRT_DATETIME ;
   private boolean n895TBM42_CRT_USER_ID ;
   private boolean n897TBM42_UPD_DATETIME ;
   private boolean n898TBM42_UPD_USER_ID ;
   private boolean n900TBM42_UPD_CNT ;
   private boolean n905TBM42_DOM_ENM ;
   private boolean n906TBM42_DOM_JNM ;
   private boolean n907TBM42_DOM_GRP_NM ;
   private boolean n908TBM42_NOTE ;
   private boolean n909TBM42_ORDER ;
   private boolean n893TBM42_DEL_FLG ;
   private boolean n896TBM42_CRT_PROG_NM ;
   private boolean n899TBM42_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z204TBM42_DOM_CD ;
   private String A204TBM42_DOM_CD ;
   private String AV7W_BC_FLG ;
   private String AV8W_TXT ;
   private String A905TBM42_DOM_ENM ;
   private String A906TBM42_DOM_JNM ;
   private String A907TBM42_DOM_GRP_NM ;
   private String A908TBM42_NOTE ;
   private String A893TBM42_DEL_FLG ;
   private String A895TBM42_CRT_USER_ID ;
   private String A896TBM42_CRT_PROG_NM ;
   private String A898TBM42_UPD_USER_ID ;
   private String A899TBM42_UPD_PROG_NM ;
   private String Z895TBM42_CRT_USER_ID ;
   private String Z898TBM42_UPD_USER_ID ;
   private String Z905TBM42_DOM_ENM ;
   private String Z906TBM42_DOM_JNM ;
   private String Z907TBM42_DOM_GRP_NM ;
   private String Z908TBM42_NOTE ;
   private String Z893TBM42_DEL_FLG ;
   private String Z896TBM42_CRT_PROG_NM ;
   private String Z899TBM42_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM42_STUDY_CDISC_DOMAIN bcTBM42_STUDY_CDISC_DOMAIN ;
   private IDataStoreProvider pr_default ;
   private long[] BC001I4_A203TBM42_STUDY_ID ;
   private String[] BC001I4_A204TBM42_DOM_CD ;
   private java.util.Date[] BC001I4_A894TBM42_CRT_DATETIME ;
   private boolean[] BC001I4_n894TBM42_CRT_DATETIME ;
   private String[] BC001I4_A895TBM42_CRT_USER_ID ;
   private boolean[] BC001I4_n895TBM42_CRT_USER_ID ;
   private java.util.Date[] BC001I4_A897TBM42_UPD_DATETIME ;
   private boolean[] BC001I4_n897TBM42_UPD_DATETIME ;
   private String[] BC001I4_A898TBM42_UPD_USER_ID ;
   private boolean[] BC001I4_n898TBM42_UPD_USER_ID ;
   private long[] BC001I4_A900TBM42_UPD_CNT ;
   private boolean[] BC001I4_n900TBM42_UPD_CNT ;
   private String[] BC001I4_A905TBM42_DOM_ENM ;
   private boolean[] BC001I4_n905TBM42_DOM_ENM ;
   private String[] BC001I4_A906TBM42_DOM_JNM ;
   private boolean[] BC001I4_n906TBM42_DOM_JNM ;
   private String[] BC001I4_A907TBM42_DOM_GRP_NM ;
   private boolean[] BC001I4_n907TBM42_DOM_GRP_NM ;
   private String[] BC001I4_A908TBM42_NOTE ;
   private boolean[] BC001I4_n908TBM42_NOTE ;
   private int[] BC001I4_A909TBM42_ORDER ;
   private boolean[] BC001I4_n909TBM42_ORDER ;
   private String[] BC001I4_A893TBM42_DEL_FLG ;
   private boolean[] BC001I4_n893TBM42_DEL_FLG ;
   private String[] BC001I4_A896TBM42_CRT_PROG_NM ;
   private boolean[] BC001I4_n896TBM42_CRT_PROG_NM ;
   private String[] BC001I4_A899TBM42_UPD_PROG_NM ;
   private boolean[] BC001I4_n899TBM42_UPD_PROG_NM ;
   private long[] BC001I5_A203TBM42_STUDY_ID ;
   private String[] BC001I5_A204TBM42_DOM_CD ;
   private long[] BC001I3_A203TBM42_STUDY_ID ;
   private String[] BC001I3_A204TBM42_DOM_CD ;
   private java.util.Date[] BC001I3_A894TBM42_CRT_DATETIME ;
   private boolean[] BC001I3_n894TBM42_CRT_DATETIME ;
   private String[] BC001I3_A895TBM42_CRT_USER_ID ;
   private boolean[] BC001I3_n895TBM42_CRT_USER_ID ;
   private java.util.Date[] BC001I3_A897TBM42_UPD_DATETIME ;
   private boolean[] BC001I3_n897TBM42_UPD_DATETIME ;
   private String[] BC001I3_A898TBM42_UPD_USER_ID ;
   private boolean[] BC001I3_n898TBM42_UPD_USER_ID ;
   private long[] BC001I3_A900TBM42_UPD_CNT ;
   private boolean[] BC001I3_n900TBM42_UPD_CNT ;
   private String[] BC001I3_A905TBM42_DOM_ENM ;
   private boolean[] BC001I3_n905TBM42_DOM_ENM ;
   private String[] BC001I3_A906TBM42_DOM_JNM ;
   private boolean[] BC001I3_n906TBM42_DOM_JNM ;
   private String[] BC001I3_A907TBM42_DOM_GRP_NM ;
   private boolean[] BC001I3_n907TBM42_DOM_GRP_NM ;
   private String[] BC001I3_A908TBM42_NOTE ;
   private boolean[] BC001I3_n908TBM42_NOTE ;
   private int[] BC001I3_A909TBM42_ORDER ;
   private boolean[] BC001I3_n909TBM42_ORDER ;
   private String[] BC001I3_A893TBM42_DEL_FLG ;
   private boolean[] BC001I3_n893TBM42_DEL_FLG ;
   private String[] BC001I3_A896TBM42_CRT_PROG_NM ;
   private boolean[] BC001I3_n896TBM42_CRT_PROG_NM ;
   private String[] BC001I3_A899TBM42_UPD_PROG_NM ;
   private boolean[] BC001I3_n899TBM42_UPD_PROG_NM ;
   private long[] BC001I2_A203TBM42_STUDY_ID ;
   private String[] BC001I2_A204TBM42_DOM_CD ;
   private java.util.Date[] BC001I2_A894TBM42_CRT_DATETIME ;
   private boolean[] BC001I2_n894TBM42_CRT_DATETIME ;
   private String[] BC001I2_A895TBM42_CRT_USER_ID ;
   private boolean[] BC001I2_n895TBM42_CRT_USER_ID ;
   private java.util.Date[] BC001I2_A897TBM42_UPD_DATETIME ;
   private boolean[] BC001I2_n897TBM42_UPD_DATETIME ;
   private String[] BC001I2_A898TBM42_UPD_USER_ID ;
   private boolean[] BC001I2_n898TBM42_UPD_USER_ID ;
   private long[] BC001I2_A900TBM42_UPD_CNT ;
   private boolean[] BC001I2_n900TBM42_UPD_CNT ;
   private String[] BC001I2_A905TBM42_DOM_ENM ;
   private boolean[] BC001I2_n905TBM42_DOM_ENM ;
   private String[] BC001I2_A906TBM42_DOM_JNM ;
   private boolean[] BC001I2_n906TBM42_DOM_JNM ;
   private String[] BC001I2_A907TBM42_DOM_GRP_NM ;
   private boolean[] BC001I2_n907TBM42_DOM_GRP_NM ;
   private String[] BC001I2_A908TBM42_NOTE ;
   private boolean[] BC001I2_n908TBM42_NOTE ;
   private int[] BC001I2_A909TBM42_ORDER ;
   private boolean[] BC001I2_n909TBM42_ORDER ;
   private String[] BC001I2_A893TBM42_DEL_FLG ;
   private boolean[] BC001I2_n893TBM42_DEL_FLG ;
   private String[] BC001I2_A896TBM42_CRT_PROG_NM ;
   private boolean[] BC001I2_n896TBM42_CRT_PROG_NM ;
   private String[] BC001I2_A899TBM42_UPD_PROG_NM ;
   private boolean[] BC001I2_n899TBM42_UPD_PROG_NM ;
   private long[] BC001I9_A203TBM42_STUDY_ID ;
   private String[] BC001I9_A204TBM42_DOM_CD ;
   private java.util.Date[] BC001I9_A894TBM42_CRT_DATETIME ;
   private boolean[] BC001I9_n894TBM42_CRT_DATETIME ;
   private String[] BC001I9_A895TBM42_CRT_USER_ID ;
   private boolean[] BC001I9_n895TBM42_CRT_USER_ID ;
   private java.util.Date[] BC001I9_A897TBM42_UPD_DATETIME ;
   private boolean[] BC001I9_n897TBM42_UPD_DATETIME ;
   private String[] BC001I9_A898TBM42_UPD_USER_ID ;
   private boolean[] BC001I9_n898TBM42_UPD_USER_ID ;
   private long[] BC001I9_A900TBM42_UPD_CNT ;
   private boolean[] BC001I9_n900TBM42_UPD_CNT ;
   private String[] BC001I9_A905TBM42_DOM_ENM ;
   private boolean[] BC001I9_n905TBM42_DOM_ENM ;
   private String[] BC001I9_A906TBM42_DOM_JNM ;
   private boolean[] BC001I9_n906TBM42_DOM_JNM ;
   private String[] BC001I9_A907TBM42_DOM_GRP_NM ;
   private boolean[] BC001I9_n907TBM42_DOM_GRP_NM ;
   private String[] BC001I9_A908TBM42_NOTE ;
   private boolean[] BC001I9_n908TBM42_NOTE ;
   private int[] BC001I9_A909TBM42_ORDER ;
   private boolean[] BC001I9_n909TBM42_ORDER ;
   private String[] BC001I9_A893TBM42_DEL_FLG ;
   private boolean[] BC001I9_n893TBM42_DEL_FLG ;
   private String[] BC001I9_A896TBM42_CRT_PROG_NM ;
   private boolean[] BC001I9_n896TBM42_CRT_PROG_NM ;
   private String[] BC001I9_A899TBM42_UPD_PROG_NM ;
   private boolean[] BC001I9_n899TBM42_UPD_PROG_NM ;
}

final  class tbm42_study_cdisc_domain_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001I2", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001I3", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001I4", "SELECT TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD`, TM1.`TBM42_CRT_DATETIME`, TM1.`TBM42_CRT_USER_ID`, TM1.`TBM42_UPD_DATETIME`, TM1.`TBM42_UPD_USER_ID`, TM1.`TBM42_UPD_CNT`, TM1.`TBM42_DOM_ENM`, TM1.`TBM42_DOM_JNM`, TM1.`TBM42_DOM_GRP_NM`, TM1.`TBM42_NOTE`, TM1.`TBM42_ORDER`, TM1.`TBM42_DEL_FLG`, TM1.`TBM42_CRT_PROG_NM`, TM1.`TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` TM1 WHERE TM1.`TBM42_STUDY_ID` = ? and TM1.`TBM42_DOM_CD` = ? ORDER BY TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC001I5", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001I6", "INSERT INTO `TBM42_STUDY_CDISC_DOMAIN`(`TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001I7", "UPDATE `TBM42_STUDY_CDISC_DOMAIN` SET `TBM42_CRT_DATETIME`=?, `TBM42_CRT_USER_ID`=?, `TBM42_UPD_DATETIME`=?, `TBM42_UPD_USER_ID`=?, `TBM42_UPD_CNT`=?, `TBM42_DOM_ENM`=?, `TBM42_DOM_JNM`=?, `TBM42_DOM_GRP_NM`=?, `TBM42_NOTE`=?, `TBM42_ORDER`=?, `TBM42_DEL_FLG`=?, `TBM42_CRT_PROG_NM`=?, `TBM42_UPD_PROG_NM`=?  WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001I8", "DELETE FROM `TBM42_STUDY_CDISC_DOMAIN`  WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001I9", "SELECT TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD`, TM1.`TBM42_CRT_DATETIME`, TM1.`TBM42_CRT_USER_ID`, TM1.`TBM42_UPD_DATETIME`, TM1.`TBM42_UPD_USER_ID`, TM1.`TBM42_UPD_CNT`, TM1.`TBM42_DOM_ENM`, TM1.`TBM42_DOM_JNM`, TM1.`TBM42_DOM_GRP_NM`, TM1.`TBM42_NOTE`, TM1.`TBM42_ORDER`, TM1.`TBM42_DEL_FLG`, TM1.`TBM42_CRT_PROG_NM`, TM1.`TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` TM1 WHERE TM1.`TBM42_STUDY_ID` = ? and TM1.`TBM42_DOM_CD` = ? ORDER BY TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
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
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[11]).longValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 50);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 50);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 1000);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[27], 40);
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
               stmt.setLong(14, ((Number) parms[26]).longValue());
               stmt.setVarchar(15, (String)parms[27], 2, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
      }
   }

}

