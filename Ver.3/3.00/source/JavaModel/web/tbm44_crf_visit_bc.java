/*
               File: tbm44_crf_visit_bc
        Description: CRF-VISIT番号対応マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:19.78
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm44_crf_visit_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm44_crf_visit_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm44_crf_visit_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm44_crf_visit_bc.class ));
   }

   public tbm44_crf_visit_bc( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1K61( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1K61( ) ;
      standaloneModal( ) ;
      addRow1K61( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e121K2 */
         e121K2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z945TBM44_STUDY_ID = A945TBM44_STUDY_ID ;
            Z946TBM44_CRF_ID = A946TBM44_CRF_ID ;
            Z947TBM44_CRF_EDA_NO = A947TBM44_CRF_EDA_NO ;
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

   public void confirm_1K0( )
   {
      beforeValidate1K61( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1K61( ) ;
         }
         else
         {
            checkExtendedTable1K61( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1K61( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e111K2( )
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

   public void e121K2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV8W_TXT = "" ;
      AV8W_TXT = AV8W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A946TBM44_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A947TBM44_CRF_EDA_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A949TBM44_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A950TBM44_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm44_crf_visit_bc.this.GXt_char1 = GXv_char2[0] ;
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A951TBM44_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A952TBM44_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A953TBM44_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm44_crf_visit_bc.this.GXt_char1 = GXv_char2[0] ;
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A954TBM44_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A955TBM44_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A956TBM44_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1K61( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z950TBM44_CRT_DATETIME = A950TBM44_CRT_DATETIME ;
         Z951TBM44_CRT_USER_ID = A951TBM44_CRT_USER_ID ;
         Z953TBM44_UPD_DATETIME = A953TBM44_UPD_DATETIME ;
         Z954TBM44_UPD_USER_ID = A954TBM44_UPD_USER_ID ;
         Z956TBM44_UPD_CNT = A956TBM44_UPD_CNT ;
         Z948TBM44_VISIT_NO = A948TBM44_VISIT_NO ;
         Z949TBM44_DEL_FLG = A949TBM44_DEL_FLG ;
         Z952TBM44_CRT_PROG_NM = A952TBM44_CRT_PROG_NM ;
         Z955TBM44_UPD_PROG_NM = A955TBM44_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z945TBM44_STUDY_ID = A945TBM44_STUDY_ID ;
         Z946TBM44_CRF_ID = A946TBM44_CRF_ID ;
         Z947TBM44_CRF_EDA_NO = A947TBM44_CRF_EDA_NO ;
         Z950TBM44_CRT_DATETIME = A950TBM44_CRT_DATETIME ;
         Z951TBM44_CRT_USER_ID = A951TBM44_CRT_USER_ID ;
         Z953TBM44_UPD_DATETIME = A953TBM44_UPD_DATETIME ;
         Z954TBM44_UPD_USER_ID = A954TBM44_UPD_USER_ID ;
         Z956TBM44_UPD_CNT = A956TBM44_UPD_CNT ;
         Z948TBM44_VISIT_NO = A948TBM44_VISIT_NO ;
         Z949TBM44_DEL_FLG = A949TBM44_DEL_FLG ;
         Z952TBM44_CRT_PROG_NM = A952TBM44_CRT_PROG_NM ;
         Z955TBM44_UPD_PROG_NM = A955TBM44_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1K61( )
   {
      /* Using cursor BC001K4 */
      pr_default.execute(2, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound61 = (short)(1) ;
         A950TBM44_CRT_DATETIME = BC001K4_A950TBM44_CRT_DATETIME[0] ;
         n950TBM44_CRT_DATETIME = BC001K4_n950TBM44_CRT_DATETIME[0] ;
         A951TBM44_CRT_USER_ID = BC001K4_A951TBM44_CRT_USER_ID[0] ;
         n951TBM44_CRT_USER_ID = BC001K4_n951TBM44_CRT_USER_ID[0] ;
         A953TBM44_UPD_DATETIME = BC001K4_A953TBM44_UPD_DATETIME[0] ;
         n953TBM44_UPD_DATETIME = BC001K4_n953TBM44_UPD_DATETIME[0] ;
         A954TBM44_UPD_USER_ID = BC001K4_A954TBM44_UPD_USER_ID[0] ;
         n954TBM44_UPD_USER_ID = BC001K4_n954TBM44_UPD_USER_ID[0] ;
         A956TBM44_UPD_CNT = BC001K4_A956TBM44_UPD_CNT[0] ;
         n956TBM44_UPD_CNT = BC001K4_n956TBM44_UPD_CNT[0] ;
         A948TBM44_VISIT_NO = BC001K4_A948TBM44_VISIT_NO[0] ;
         n948TBM44_VISIT_NO = BC001K4_n948TBM44_VISIT_NO[0] ;
         A949TBM44_DEL_FLG = BC001K4_A949TBM44_DEL_FLG[0] ;
         n949TBM44_DEL_FLG = BC001K4_n949TBM44_DEL_FLG[0] ;
         A952TBM44_CRT_PROG_NM = BC001K4_A952TBM44_CRT_PROG_NM[0] ;
         n952TBM44_CRT_PROG_NM = BC001K4_n952TBM44_CRT_PROG_NM[0] ;
         A955TBM44_UPD_PROG_NM = BC001K4_A955TBM44_UPD_PROG_NM[0] ;
         n955TBM44_UPD_PROG_NM = BC001K4_n955TBM44_UPD_PROG_NM[0] ;
         zm1K61( -8) ;
      }
      pr_default.close(2);
      onLoadActions1K61( ) ;
   }

   public void onLoadActions1K61( )
   {
      AV9Pgmname = "TBM44_CRF_VISIT_BC" ;
   }

   public void checkExtendedTable1K61( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM44_CRF_VISIT_BC" ;
      if ( ! ( GXutil.nullDate().equals(A950TBM44_CRT_DATETIME) || (( A950TBM44_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A950TBM44_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A953TBM44_UPD_DATETIME) || (( A953TBM44_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A953TBM44_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1K61( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1K61( )
   {
      /* Using cursor BC001K5 */
      pr_default.execute(3, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound61 = (short)(1) ;
      }
      else
      {
         RcdFound61 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC001K3 */
      pr_default.execute(1, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1K61( 8) ;
         RcdFound61 = (short)(1) ;
         A945TBM44_STUDY_ID = BC001K3_A945TBM44_STUDY_ID[0] ;
         A946TBM44_CRF_ID = BC001K3_A946TBM44_CRF_ID[0] ;
         A947TBM44_CRF_EDA_NO = BC001K3_A947TBM44_CRF_EDA_NO[0] ;
         A950TBM44_CRT_DATETIME = BC001K3_A950TBM44_CRT_DATETIME[0] ;
         n950TBM44_CRT_DATETIME = BC001K3_n950TBM44_CRT_DATETIME[0] ;
         A951TBM44_CRT_USER_ID = BC001K3_A951TBM44_CRT_USER_ID[0] ;
         n951TBM44_CRT_USER_ID = BC001K3_n951TBM44_CRT_USER_ID[0] ;
         A953TBM44_UPD_DATETIME = BC001K3_A953TBM44_UPD_DATETIME[0] ;
         n953TBM44_UPD_DATETIME = BC001K3_n953TBM44_UPD_DATETIME[0] ;
         A954TBM44_UPD_USER_ID = BC001K3_A954TBM44_UPD_USER_ID[0] ;
         n954TBM44_UPD_USER_ID = BC001K3_n954TBM44_UPD_USER_ID[0] ;
         A956TBM44_UPD_CNT = BC001K3_A956TBM44_UPD_CNT[0] ;
         n956TBM44_UPD_CNT = BC001K3_n956TBM44_UPD_CNT[0] ;
         A948TBM44_VISIT_NO = BC001K3_A948TBM44_VISIT_NO[0] ;
         n948TBM44_VISIT_NO = BC001K3_n948TBM44_VISIT_NO[0] ;
         A949TBM44_DEL_FLG = BC001K3_A949TBM44_DEL_FLG[0] ;
         n949TBM44_DEL_FLG = BC001K3_n949TBM44_DEL_FLG[0] ;
         A952TBM44_CRT_PROG_NM = BC001K3_A952TBM44_CRT_PROG_NM[0] ;
         n952TBM44_CRT_PROG_NM = BC001K3_n952TBM44_CRT_PROG_NM[0] ;
         A955TBM44_UPD_PROG_NM = BC001K3_A955TBM44_UPD_PROG_NM[0] ;
         n955TBM44_UPD_PROG_NM = BC001K3_n955TBM44_UPD_PROG_NM[0] ;
         O956TBM44_UPD_CNT = A956TBM44_UPD_CNT ;
         n956TBM44_UPD_CNT = false ;
         Z945TBM44_STUDY_ID = A945TBM44_STUDY_ID ;
         Z946TBM44_CRF_ID = A946TBM44_CRF_ID ;
         Z947TBM44_CRF_EDA_NO = A947TBM44_CRF_EDA_NO ;
         sMode61 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1K61( ) ;
         if ( AnyError == 1 )
         {
            RcdFound61 = (short)(0) ;
            initializeNonKey1K61( ) ;
         }
         Gx_mode = sMode61 ;
      }
      else
      {
         RcdFound61 = (short)(0) ;
         initializeNonKey1K61( ) ;
         sMode61 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode61 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1K61( ) ;
      if ( RcdFound61 == 0 )
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
      confirm_1K0( ) ;
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

   public void checkOptimisticConcurrency1K61( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC001K2 */
         pr_default.execute(0, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM44_CRF_VISIT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z950TBM44_CRT_DATETIME.equals( BC001K2_A950TBM44_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z951TBM44_CRT_USER_ID, BC001K2_A951TBM44_CRT_USER_ID[0]) != 0 ) || !( Z953TBM44_UPD_DATETIME.equals( BC001K2_A953TBM44_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z954TBM44_UPD_USER_ID, BC001K2_A954TBM44_UPD_USER_ID[0]) != 0 ) || ( Z956TBM44_UPD_CNT != BC001K2_A956TBM44_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z948TBM44_VISIT_NO != BC001K2_A948TBM44_VISIT_NO[0] ) || ( GXutil.strcmp(Z949TBM44_DEL_FLG, BC001K2_A949TBM44_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z952TBM44_CRT_PROG_NM, BC001K2_A952TBM44_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z955TBM44_UPD_PROG_NM, BC001K2_A955TBM44_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM44_CRF_VISIT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1K61( )
   {
      beforeValidate1K61( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1K61( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1K61( 0) ;
         checkOptimisticConcurrency1K61( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1K61( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1K61( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001K6 */
                  pr_default.execute(4, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO), new Boolean(n950TBM44_CRT_DATETIME), A950TBM44_CRT_DATETIME, new Boolean(n951TBM44_CRT_USER_ID), A951TBM44_CRT_USER_ID, new Boolean(n953TBM44_UPD_DATETIME), A953TBM44_UPD_DATETIME, new Boolean(n954TBM44_UPD_USER_ID), A954TBM44_UPD_USER_ID, new Boolean(n956TBM44_UPD_CNT), new Long(A956TBM44_UPD_CNT), new Boolean(n948TBM44_VISIT_NO), new Integer(A948TBM44_VISIT_NO), new Boolean(n949TBM44_DEL_FLG), A949TBM44_DEL_FLG, new Boolean(n952TBM44_CRT_PROG_NM), A952TBM44_CRT_PROG_NM, new Boolean(n955TBM44_UPD_PROG_NM), A955TBM44_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM44_CRF_VISIT") ;
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
            load1K61( ) ;
         }
         endLevel1K61( ) ;
      }
      closeExtendedTableCursors1K61( ) ;
   }

   public void update1K61( )
   {
      beforeValidate1K61( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1K61( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1K61( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1K61( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1K61( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC001K7 */
                  pr_default.execute(5, new Object[] {new Boolean(n950TBM44_CRT_DATETIME), A950TBM44_CRT_DATETIME, new Boolean(n951TBM44_CRT_USER_ID), A951TBM44_CRT_USER_ID, new Boolean(n953TBM44_UPD_DATETIME), A953TBM44_UPD_DATETIME, new Boolean(n954TBM44_UPD_USER_ID), A954TBM44_UPD_USER_ID, new Boolean(n956TBM44_UPD_CNT), new Long(A956TBM44_UPD_CNT), new Boolean(n948TBM44_VISIT_NO), new Integer(A948TBM44_VISIT_NO), new Boolean(n949TBM44_DEL_FLG), A949TBM44_DEL_FLG, new Boolean(n952TBM44_CRT_PROG_NM), A952TBM44_CRT_PROG_NM, new Boolean(n955TBM44_UPD_PROG_NM), A955TBM44_UPD_PROG_NM, new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM44_CRF_VISIT") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM44_CRF_VISIT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1K61( ) ;
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
         endLevel1K61( ) ;
      }
      closeExtendedTableCursors1K61( ) ;
   }

   public void deferredUpdate1K61( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1K61( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1K61( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1K61( ) ;
         afterConfirm1K61( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1K61( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC001K8 */
               pr_default.execute(6, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM44_CRF_VISIT") ;
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
      sMode61 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1K61( ) ;
      Gx_mode = sMode61 ;
   }

   public void onDeleteControls1K61( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM44_CRF_VISIT_BC" ;
      }
   }

   public void endLevel1K61( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1K61( ) ;
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

   public void scanKeyStart1K61( )
   {
      /* Scan By routine */
      /* Using cursor BC001K9 */
      pr_default.execute(7, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO)});
      RcdFound61 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound61 = (short)(1) ;
         A945TBM44_STUDY_ID = BC001K9_A945TBM44_STUDY_ID[0] ;
         A946TBM44_CRF_ID = BC001K9_A946TBM44_CRF_ID[0] ;
         A947TBM44_CRF_EDA_NO = BC001K9_A947TBM44_CRF_EDA_NO[0] ;
         A950TBM44_CRT_DATETIME = BC001K9_A950TBM44_CRT_DATETIME[0] ;
         n950TBM44_CRT_DATETIME = BC001K9_n950TBM44_CRT_DATETIME[0] ;
         A951TBM44_CRT_USER_ID = BC001K9_A951TBM44_CRT_USER_ID[0] ;
         n951TBM44_CRT_USER_ID = BC001K9_n951TBM44_CRT_USER_ID[0] ;
         A953TBM44_UPD_DATETIME = BC001K9_A953TBM44_UPD_DATETIME[0] ;
         n953TBM44_UPD_DATETIME = BC001K9_n953TBM44_UPD_DATETIME[0] ;
         A954TBM44_UPD_USER_ID = BC001K9_A954TBM44_UPD_USER_ID[0] ;
         n954TBM44_UPD_USER_ID = BC001K9_n954TBM44_UPD_USER_ID[0] ;
         A956TBM44_UPD_CNT = BC001K9_A956TBM44_UPD_CNT[0] ;
         n956TBM44_UPD_CNT = BC001K9_n956TBM44_UPD_CNT[0] ;
         A948TBM44_VISIT_NO = BC001K9_A948TBM44_VISIT_NO[0] ;
         n948TBM44_VISIT_NO = BC001K9_n948TBM44_VISIT_NO[0] ;
         A949TBM44_DEL_FLG = BC001K9_A949TBM44_DEL_FLG[0] ;
         n949TBM44_DEL_FLG = BC001K9_n949TBM44_DEL_FLG[0] ;
         A952TBM44_CRT_PROG_NM = BC001K9_A952TBM44_CRT_PROG_NM[0] ;
         n952TBM44_CRT_PROG_NM = BC001K9_n952TBM44_CRT_PROG_NM[0] ;
         A955TBM44_UPD_PROG_NM = BC001K9_A955TBM44_UPD_PROG_NM[0] ;
         n955TBM44_UPD_PROG_NM = BC001K9_n955TBM44_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1K61( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound61 = (short)(0) ;
      scanKeyLoad1K61( ) ;
   }

   public void scanKeyLoad1K61( )
   {
      sMode61 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound61 = (short)(1) ;
         A945TBM44_STUDY_ID = BC001K9_A945TBM44_STUDY_ID[0] ;
         A946TBM44_CRF_ID = BC001K9_A946TBM44_CRF_ID[0] ;
         A947TBM44_CRF_EDA_NO = BC001K9_A947TBM44_CRF_EDA_NO[0] ;
         A950TBM44_CRT_DATETIME = BC001K9_A950TBM44_CRT_DATETIME[0] ;
         n950TBM44_CRT_DATETIME = BC001K9_n950TBM44_CRT_DATETIME[0] ;
         A951TBM44_CRT_USER_ID = BC001K9_A951TBM44_CRT_USER_ID[0] ;
         n951TBM44_CRT_USER_ID = BC001K9_n951TBM44_CRT_USER_ID[0] ;
         A953TBM44_UPD_DATETIME = BC001K9_A953TBM44_UPD_DATETIME[0] ;
         n953TBM44_UPD_DATETIME = BC001K9_n953TBM44_UPD_DATETIME[0] ;
         A954TBM44_UPD_USER_ID = BC001K9_A954TBM44_UPD_USER_ID[0] ;
         n954TBM44_UPD_USER_ID = BC001K9_n954TBM44_UPD_USER_ID[0] ;
         A956TBM44_UPD_CNT = BC001K9_A956TBM44_UPD_CNT[0] ;
         n956TBM44_UPD_CNT = BC001K9_n956TBM44_UPD_CNT[0] ;
         A948TBM44_VISIT_NO = BC001K9_A948TBM44_VISIT_NO[0] ;
         n948TBM44_VISIT_NO = BC001K9_n948TBM44_VISIT_NO[0] ;
         A949TBM44_DEL_FLG = BC001K9_A949TBM44_DEL_FLG[0] ;
         n949TBM44_DEL_FLG = BC001K9_n949TBM44_DEL_FLG[0] ;
         A952TBM44_CRT_PROG_NM = BC001K9_A952TBM44_CRT_PROG_NM[0] ;
         n952TBM44_CRT_PROG_NM = BC001K9_n952TBM44_CRT_PROG_NM[0] ;
         A955TBM44_UPD_PROG_NM = BC001K9_A955TBM44_UPD_PROG_NM[0] ;
         n955TBM44_UPD_PROG_NM = BC001K9_n955TBM44_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode61 ;
   }

   public void scanKeyEnd1K61( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1K61( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1K61( )
   {
      /* Before Insert Rules */
      A950TBM44_CRT_DATETIME = GXutil.now( ) ;
      n950TBM44_CRT_DATETIME = false ;
      GXt_char1 = A951TBM44_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm44_crf_visit_bc.this.GXt_char1 = GXv_char2[0] ;
      A951TBM44_CRT_USER_ID = GXt_char1 ;
      n951TBM44_CRT_USER_ID = false ;
      A953TBM44_UPD_DATETIME = GXutil.now( ) ;
      n953TBM44_UPD_DATETIME = false ;
      GXt_char1 = A954TBM44_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm44_crf_visit_bc.this.GXt_char1 = GXv_char2[0] ;
      A954TBM44_UPD_USER_ID = GXt_char1 ;
      n954TBM44_UPD_USER_ID = false ;
      A956TBM44_UPD_CNT = (long)(O956TBM44_UPD_CNT+1) ;
      n956TBM44_UPD_CNT = false ;
   }

   public void beforeUpdate1K61( )
   {
      /* Before Update Rules */
      A953TBM44_UPD_DATETIME = GXutil.now( ) ;
      n953TBM44_UPD_DATETIME = false ;
      GXt_char1 = A954TBM44_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm44_crf_visit_bc.this.GXt_char1 = GXv_char2[0] ;
      A954TBM44_UPD_USER_ID = GXt_char1 ;
      n954TBM44_UPD_USER_ID = false ;
      A956TBM44_UPD_CNT = (long)(O956TBM44_UPD_CNT+1) ;
      n956TBM44_UPD_CNT = false ;
   }

   public void beforeDelete1K61( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1K61( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1K61( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1K61( )
   {
   }

   public void addRow1K61( )
   {
      VarsToRow61( bcTBM44_CRF_VISIT) ;
   }

   public void readRow1K61( )
   {
      RowToVars61( bcTBM44_CRF_VISIT, 1) ;
   }

   public void initializeNonKey1K61( )
   {
      A950TBM44_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n950TBM44_CRT_DATETIME = false ;
      A951TBM44_CRT_USER_ID = "" ;
      n951TBM44_CRT_USER_ID = false ;
      A953TBM44_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n953TBM44_UPD_DATETIME = false ;
      A954TBM44_UPD_USER_ID = "" ;
      n954TBM44_UPD_USER_ID = false ;
      A956TBM44_UPD_CNT = 0 ;
      n956TBM44_UPD_CNT = false ;
      A948TBM44_VISIT_NO = 0 ;
      n948TBM44_VISIT_NO = false ;
      A949TBM44_DEL_FLG = "" ;
      n949TBM44_DEL_FLG = false ;
      A952TBM44_CRT_PROG_NM = "" ;
      n952TBM44_CRT_PROG_NM = false ;
      A955TBM44_UPD_PROG_NM = "" ;
      n955TBM44_UPD_PROG_NM = false ;
      O956TBM44_UPD_CNT = A956TBM44_UPD_CNT ;
      n956TBM44_UPD_CNT = false ;
   }

   public void initAll1K61( )
   {
      A945TBM44_STUDY_ID = 0 ;
      A946TBM44_CRF_ID = (short)(0) ;
      A947TBM44_CRF_EDA_NO = (byte)(0) ;
      initializeNonKey1K61( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow61( SdtTBM44_CRF_VISIT obj61 )
   {
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Mode( Gx_mode );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime( A950TBM44_CRT_DATETIME );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id( A951TBM44_CRT_USER_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime( A953TBM44_UPD_DATETIME );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id( A954TBM44_UPD_USER_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt( A956TBM44_UPD_CNT );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no( A948TBM44_VISIT_NO );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg( A949TBM44_DEL_FLG );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm( A952TBM44_CRT_PROG_NM );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm( A955TBM44_UPD_PROG_NM );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id( A945TBM44_STUDY_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id( A946TBM44_CRF_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no( A947TBM44_CRF_EDA_NO );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id_Z( Z945TBM44_STUDY_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id_Z( Z946TBM44_CRF_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no_Z( Z947TBM44_CRF_EDA_NO );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_Z( Z948TBM44_VISIT_NO );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_Z( Z949TBM44_DEL_FLG );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_Z( Z950TBM44_CRT_DATETIME );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_Z( Z951TBM44_CRT_USER_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_Z( Z952TBM44_CRT_PROG_NM );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_Z( Z953TBM44_UPD_DATETIME );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_Z( Z954TBM44_UPD_USER_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_Z( Z955TBM44_UPD_PROG_NM );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_Z( Z956TBM44_UPD_CNT );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_N( (byte)((byte)((n948TBM44_VISIT_NO)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_N( (byte)((byte)((n949TBM44_DEL_FLG)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_N( (byte)((byte)((n950TBM44_CRT_DATETIME)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_N( (byte)((byte)((n951TBM44_CRT_USER_ID)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_N( (byte)((byte)((n952TBM44_CRT_PROG_NM)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_N( (byte)((byte)((n953TBM44_UPD_DATETIME)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_N( (byte)((byte)((n954TBM44_UPD_USER_ID)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_N( (byte)((byte)((n955TBM44_UPD_PROG_NM)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_N( (byte)((byte)((n956TBM44_UPD_CNT)?1:0)) );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Mode( Gx_mode );
   }

   public void KeyVarsToRow61( SdtTBM44_CRF_VISIT obj61 )
   {
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id( A945TBM44_STUDY_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id( A946TBM44_CRF_ID );
      obj61.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no( A947TBM44_CRF_EDA_NO );
   }

   public void RowToVars61( SdtTBM44_CRF_VISIT obj61 ,
                            int forceLoad )
   {
      Gx_mode = obj61.getgxTv_SdtTBM44_CRF_VISIT_Mode() ;
      A950TBM44_CRT_DATETIME = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime() ;
      n950TBM44_CRT_DATETIME = false ;
      A951TBM44_CRT_USER_ID = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id() ;
      n951TBM44_CRT_USER_ID = false ;
      A953TBM44_UPD_DATETIME = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime() ;
      n953TBM44_UPD_DATETIME = false ;
      A954TBM44_UPD_USER_ID = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id() ;
      n954TBM44_UPD_USER_ID = false ;
      A956TBM44_UPD_CNT = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt() ;
      n956TBM44_UPD_CNT = false ;
      A948TBM44_VISIT_NO = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no() ;
      n948TBM44_VISIT_NO = false ;
      A949TBM44_DEL_FLG = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg() ;
      n949TBM44_DEL_FLG = false ;
      A952TBM44_CRT_PROG_NM = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm() ;
      n952TBM44_CRT_PROG_NM = false ;
      A955TBM44_UPD_PROG_NM = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm() ;
      n955TBM44_UPD_PROG_NM = false ;
      A945TBM44_STUDY_ID = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id() ;
      A946TBM44_CRF_ID = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id() ;
      A947TBM44_CRF_EDA_NO = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no() ;
      Z945TBM44_STUDY_ID = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id_Z() ;
      Z946TBM44_CRF_ID = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id_Z() ;
      Z947TBM44_CRF_EDA_NO = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no_Z() ;
      Z948TBM44_VISIT_NO = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_Z() ;
      Z949TBM44_DEL_FLG = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_Z() ;
      Z950TBM44_CRT_DATETIME = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_Z() ;
      Z951TBM44_CRT_USER_ID = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_Z() ;
      Z952TBM44_CRT_PROG_NM = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_Z() ;
      Z953TBM44_UPD_DATETIME = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_Z() ;
      Z954TBM44_UPD_USER_ID = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_Z() ;
      Z955TBM44_UPD_PROG_NM = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_Z() ;
      Z956TBM44_UPD_CNT = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_Z() ;
      O956TBM44_UPD_CNT = obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_Z() ;
      n948TBM44_VISIT_NO = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_N()==0)?false:true) ;
      n949TBM44_DEL_FLG = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_N()==0)?false:true) ;
      n950TBM44_CRT_DATETIME = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_N()==0)?false:true) ;
      n951TBM44_CRT_USER_ID = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_N()==0)?false:true) ;
      n952TBM44_CRT_PROG_NM = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_N()==0)?false:true) ;
      n953TBM44_UPD_DATETIME = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_N()==0)?false:true) ;
      n954TBM44_UPD_USER_ID = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_N()==0)?false:true) ;
      n955TBM44_UPD_PROG_NM = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_N()==0)?false:true) ;
      n956TBM44_UPD_CNT = (boolean)((obj61.getgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj61.getgxTv_SdtTBM44_CRF_VISIT_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A945TBM44_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A946TBM44_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A947TBM44_CRF_EDA_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1K61( ) ;
      scanKeyStart1K61( ) ;
      if ( RcdFound61 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z945TBM44_STUDY_ID = A945TBM44_STUDY_ID ;
         Z946TBM44_CRF_ID = A946TBM44_CRF_ID ;
         Z947TBM44_CRF_EDA_NO = A947TBM44_CRF_EDA_NO ;
         O956TBM44_UPD_CNT = A956TBM44_UPD_CNT ;
         n956TBM44_UPD_CNT = false ;
      }
      zm1K61( -8) ;
      onLoadActions1K61( ) ;
      addRow1K61( ) ;
      scanKeyEnd1K61( ) ;
      if ( RcdFound61 == 0 )
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
      RowToVars61( bcTBM44_CRF_VISIT, 0) ;
      scanKeyStart1K61( ) ;
      if ( RcdFound61 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z945TBM44_STUDY_ID = A945TBM44_STUDY_ID ;
         Z946TBM44_CRF_ID = A946TBM44_CRF_ID ;
         Z947TBM44_CRF_EDA_NO = A947TBM44_CRF_EDA_NO ;
         O956TBM44_UPD_CNT = A956TBM44_UPD_CNT ;
         n956TBM44_UPD_CNT = false ;
      }
      zm1K61( -8) ;
      onLoadActions1K61( ) ;
      addRow1K61( ) ;
      scanKeyEnd1K61( ) ;
      if ( RcdFound61 == 0 )
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
      RowToVars61( bcTBM44_CRF_VISIT, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1K61( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1K61( ) ;
      }
      else
      {
         if ( RcdFound61 == 1 )
         {
            if ( ( A945TBM44_STUDY_ID != Z945TBM44_STUDY_ID ) || ( A946TBM44_CRF_ID != Z946TBM44_CRF_ID ) || ( A947TBM44_CRF_EDA_NO != Z947TBM44_CRF_EDA_NO ) )
            {
               A945TBM44_STUDY_ID = Z945TBM44_STUDY_ID ;
               A946TBM44_CRF_ID = Z946TBM44_CRF_ID ;
               A947TBM44_CRF_EDA_NO = Z947TBM44_CRF_EDA_NO ;
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
               update1K61( ) ;
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
               if ( ( A945TBM44_STUDY_ID != Z945TBM44_STUDY_ID ) || ( A946TBM44_CRF_ID != Z946TBM44_CRF_ID ) || ( A947TBM44_CRF_EDA_NO != Z947TBM44_CRF_EDA_NO ) )
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
                     insert1K61( ) ;
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
                     insert1K61( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow61( bcTBM44_CRF_VISIT) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars61( bcTBM44_CRF_VISIT, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1K61( ) ;
      if ( RcdFound61 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A945TBM44_STUDY_ID != Z945TBM44_STUDY_ID ) || ( A946TBM44_CRF_ID != Z946TBM44_CRF_ID ) || ( A947TBM44_CRF_EDA_NO != Z947TBM44_CRF_EDA_NO ) )
         {
            A945TBM44_STUDY_ID = Z945TBM44_STUDY_ID ;
            A946TBM44_CRF_ID = Z946TBM44_CRF_ID ;
            A947TBM44_CRF_EDA_NO = Z947TBM44_CRF_EDA_NO ;
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
         if ( ( A945TBM44_STUDY_ID != Z945TBM44_STUDY_ID ) || ( A946TBM44_CRF_ID != Z946TBM44_CRF_ID ) || ( A947TBM44_CRF_EDA_NO != Z947TBM44_CRF_EDA_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm44_crf_visit_bc");
      VarsToRow61( bcTBM44_CRF_VISIT) ;
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
      Gx_mode = bcTBM44_CRF_VISIT.getgxTv_SdtTBM44_CRF_VISIT_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM44_CRF_VISIT.setgxTv_SdtTBM44_CRF_VISIT_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM44_CRF_VISIT sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM44_CRF_VISIT )
      {
         bcTBM44_CRF_VISIT = sdt ;
         if ( GXutil.strcmp(bcTBM44_CRF_VISIT.getgxTv_SdtTBM44_CRF_VISIT_Mode(), "") == 0 )
         {
            bcTBM44_CRF_VISIT.setgxTv_SdtTBM44_CRF_VISIT_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow61( bcTBM44_CRF_VISIT) ;
         }
         else
         {
            RowToVars61( bcTBM44_CRF_VISIT, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM44_CRF_VISIT.getgxTv_SdtTBM44_CRF_VISIT_Mode(), "") == 0 )
         {
            bcTBM44_CRF_VISIT.setgxTv_SdtTBM44_CRF_VISIT_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars61( bcTBM44_CRF_VISIT, 1) ;
   }

   public SdtTBM44_CRF_VISIT getTBM44_CRF_VISIT_BC( )
   {
      return bcTBM44_CRF_VISIT ;
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
      AV7W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV8W_TXT = "" ;
      A949TBM44_DEL_FLG = "" ;
      A950TBM44_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A951TBM44_CRT_USER_ID = "" ;
      A952TBM44_CRT_PROG_NM = "" ;
      A953TBM44_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A954TBM44_UPD_USER_ID = "" ;
      A955TBM44_UPD_PROG_NM = "" ;
      Z950TBM44_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z951TBM44_CRT_USER_ID = "" ;
      Z953TBM44_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z954TBM44_UPD_USER_ID = "" ;
      Z949TBM44_DEL_FLG = "" ;
      Z952TBM44_CRT_PROG_NM = "" ;
      Z955TBM44_UPD_PROG_NM = "" ;
      BC001K4_A945TBM44_STUDY_ID = new long[1] ;
      BC001K4_A946TBM44_CRF_ID = new short[1] ;
      BC001K4_A947TBM44_CRF_EDA_NO = new byte[1] ;
      BC001K4_A950TBM44_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001K4_n950TBM44_CRT_DATETIME = new boolean[] {false} ;
      BC001K4_A951TBM44_CRT_USER_ID = new String[] {""} ;
      BC001K4_n951TBM44_CRT_USER_ID = new boolean[] {false} ;
      BC001K4_A953TBM44_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001K4_n953TBM44_UPD_DATETIME = new boolean[] {false} ;
      BC001K4_A954TBM44_UPD_USER_ID = new String[] {""} ;
      BC001K4_n954TBM44_UPD_USER_ID = new boolean[] {false} ;
      BC001K4_A956TBM44_UPD_CNT = new long[1] ;
      BC001K4_n956TBM44_UPD_CNT = new boolean[] {false} ;
      BC001K4_A948TBM44_VISIT_NO = new int[1] ;
      BC001K4_n948TBM44_VISIT_NO = new boolean[] {false} ;
      BC001K4_A949TBM44_DEL_FLG = new String[] {""} ;
      BC001K4_n949TBM44_DEL_FLG = new boolean[] {false} ;
      BC001K4_A952TBM44_CRT_PROG_NM = new String[] {""} ;
      BC001K4_n952TBM44_CRT_PROG_NM = new boolean[] {false} ;
      BC001K4_A955TBM44_UPD_PROG_NM = new String[] {""} ;
      BC001K4_n955TBM44_UPD_PROG_NM = new boolean[] {false} ;
      BC001K5_A945TBM44_STUDY_ID = new long[1] ;
      BC001K5_A946TBM44_CRF_ID = new short[1] ;
      BC001K5_A947TBM44_CRF_EDA_NO = new byte[1] ;
      BC001K3_A945TBM44_STUDY_ID = new long[1] ;
      BC001K3_A946TBM44_CRF_ID = new short[1] ;
      BC001K3_A947TBM44_CRF_EDA_NO = new byte[1] ;
      BC001K3_A950TBM44_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001K3_n950TBM44_CRT_DATETIME = new boolean[] {false} ;
      BC001K3_A951TBM44_CRT_USER_ID = new String[] {""} ;
      BC001K3_n951TBM44_CRT_USER_ID = new boolean[] {false} ;
      BC001K3_A953TBM44_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001K3_n953TBM44_UPD_DATETIME = new boolean[] {false} ;
      BC001K3_A954TBM44_UPD_USER_ID = new String[] {""} ;
      BC001K3_n954TBM44_UPD_USER_ID = new boolean[] {false} ;
      BC001K3_A956TBM44_UPD_CNT = new long[1] ;
      BC001K3_n956TBM44_UPD_CNT = new boolean[] {false} ;
      BC001K3_A948TBM44_VISIT_NO = new int[1] ;
      BC001K3_n948TBM44_VISIT_NO = new boolean[] {false} ;
      BC001K3_A949TBM44_DEL_FLG = new String[] {""} ;
      BC001K3_n949TBM44_DEL_FLG = new boolean[] {false} ;
      BC001K3_A952TBM44_CRT_PROG_NM = new String[] {""} ;
      BC001K3_n952TBM44_CRT_PROG_NM = new boolean[] {false} ;
      BC001K3_A955TBM44_UPD_PROG_NM = new String[] {""} ;
      BC001K3_n955TBM44_UPD_PROG_NM = new boolean[] {false} ;
      sMode61 = "" ;
      BC001K2_A945TBM44_STUDY_ID = new long[1] ;
      BC001K2_A946TBM44_CRF_ID = new short[1] ;
      BC001K2_A947TBM44_CRF_EDA_NO = new byte[1] ;
      BC001K2_A950TBM44_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001K2_n950TBM44_CRT_DATETIME = new boolean[] {false} ;
      BC001K2_A951TBM44_CRT_USER_ID = new String[] {""} ;
      BC001K2_n951TBM44_CRT_USER_ID = new boolean[] {false} ;
      BC001K2_A953TBM44_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001K2_n953TBM44_UPD_DATETIME = new boolean[] {false} ;
      BC001K2_A954TBM44_UPD_USER_ID = new String[] {""} ;
      BC001K2_n954TBM44_UPD_USER_ID = new boolean[] {false} ;
      BC001K2_A956TBM44_UPD_CNT = new long[1] ;
      BC001K2_n956TBM44_UPD_CNT = new boolean[] {false} ;
      BC001K2_A948TBM44_VISIT_NO = new int[1] ;
      BC001K2_n948TBM44_VISIT_NO = new boolean[] {false} ;
      BC001K2_A949TBM44_DEL_FLG = new String[] {""} ;
      BC001K2_n949TBM44_DEL_FLG = new boolean[] {false} ;
      BC001K2_A952TBM44_CRT_PROG_NM = new String[] {""} ;
      BC001K2_n952TBM44_CRT_PROG_NM = new boolean[] {false} ;
      BC001K2_A955TBM44_UPD_PROG_NM = new String[] {""} ;
      BC001K2_n955TBM44_UPD_PROG_NM = new boolean[] {false} ;
      BC001K9_A945TBM44_STUDY_ID = new long[1] ;
      BC001K9_A946TBM44_CRF_ID = new short[1] ;
      BC001K9_A947TBM44_CRF_EDA_NO = new byte[1] ;
      BC001K9_A950TBM44_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001K9_n950TBM44_CRT_DATETIME = new boolean[] {false} ;
      BC001K9_A951TBM44_CRT_USER_ID = new String[] {""} ;
      BC001K9_n951TBM44_CRT_USER_ID = new boolean[] {false} ;
      BC001K9_A953TBM44_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001K9_n953TBM44_UPD_DATETIME = new boolean[] {false} ;
      BC001K9_A954TBM44_UPD_USER_ID = new String[] {""} ;
      BC001K9_n954TBM44_UPD_USER_ID = new boolean[] {false} ;
      BC001K9_A956TBM44_UPD_CNT = new long[1] ;
      BC001K9_n956TBM44_UPD_CNT = new boolean[] {false} ;
      BC001K9_A948TBM44_VISIT_NO = new int[1] ;
      BC001K9_n948TBM44_VISIT_NO = new boolean[] {false} ;
      BC001K9_A949TBM44_DEL_FLG = new String[] {""} ;
      BC001K9_n949TBM44_DEL_FLG = new boolean[] {false} ;
      BC001K9_A952TBM44_CRT_PROG_NM = new String[] {""} ;
      BC001K9_n952TBM44_CRT_PROG_NM = new boolean[] {false} ;
      BC001K9_A955TBM44_UPD_PROG_NM = new String[] {""} ;
      BC001K9_n955TBM44_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm44_crf_visit_bc__default(),
         new Object[] {
             new Object[] {
            BC001K2_A945TBM44_STUDY_ID, BC001K2_A946TBM44_CRF_ID, BC001K2_A947TBM44_CRF_EDA_NO, BC001K2_A950TBM44_CRT_DATETIME, BC001K2_n950TBM44_CRT_DATETIME, BC001K2_A951TBM44_CRT_USER_ID, BC001K2_n951TBM44_CRT_USER_ID, BC001K2_A953TBM44_UPD_DATETIME, BC001K2_n953TBM44_UPD_DATETIME, BC001K2_A954TBM44_UPD_USER_ID,
            BC001K2_n954TBM44_UPD_USER_ID, BC001K2_A956TBM44_UPD_CNT, BC001K2_n956TBM44_UPD_CNT, BC001K2_A948TBM44_VISIT_NO, BC001K2_n948TBM44_VISIT_NO, BC001K2_A949TBM44_DEL_FLG, BC001K2_n949TBM44_DEL_FLG, BC001K2_A952TBM44_CRT_PROG_NM, BC001K2_n952TBM44_CRT_PROG_NM, BC001K2_A955TBM44_UPD_PROG_NM,
            BC001K2_n955TBM44_UPD_PROG_NM
            }
            , new Object[] {
            BC001K3_A945TBM44_STUDY_ID, BC001K3_A946TBM44_CRF_ID, BC001K3_A947TBM44_CRF_EDA_NO, BC001K3_A950TBM44_CRT_DATETIME, BC001K3_n950TBM44_CRT_DATETIME, BC001K3_A951TBM44_CRT_USER_ID, BC001K3_n951TBM44_CRT_USER_ID, BC001K3_A953TBM44_UPD_DATETIME, BC001K3_n953TBM44_UPD_DATETIME, BC001K3_A954TBM44_UPD_USER_ID,
            BC001K3_n954TBM44_UPD_USER_ID, BC001K3_A956TBM44_UPD_CNT, BC001K3_n956TBM44_UPD_CNT, BC001K3_A948TBM44_VISIT_NO, BC001K3_n948TBM44_VISIT_NO, BC001K3_A949TBM44_DEL_FLG, BC001K3_n949TBM44_DEL_FLG, BC001K3_A952TBM44_CRT_PROG_NM, BC001K3_n952TBM44_CRT_PROG_NM, BC001K3_A955TBM44_UPD_PROG_NM,
            BC001K3_n955TBM44_UPD_PROG_NM
            }
            , new Object[] {
            BC001K4_A945TBM44_STUDY_ID, BC001K4_A946TBM44_CRF_ID, BC001K4_A947TBM44_CRF_EDA_NO, BC001K4_A950TBM44_CRT_DATETIME, BC001K4_n950TBM44_CRT_DATETIME, BC001K4_A951TBM44_CRT_USER_ID, BC001K4_n951TBM44_CRT_USER_ID, BC001K4_A953TBM44_UPD_DATETIME, BC001K4_n953TBM44_UPD_DATETIME, BC001K4_A954TBM44_UPD_USER_ID,
            BC001K4_n954TBM44_UPD_USER_ID, BC001K4_A956TBM44_UPD_CNT, BC001K4_n956TBM44_UPD_CNT, BC001K4_A948TBM44_VISIT_NO, BC001K4_n948TBM44_VISIT_NO, BC001K4_A949TBM44_DEL_FLG, BC001K4_n949TBM44_DEL_FLG, BC001K4_A952TBM44_CRT_PROG_NM, BC001K4_n952TBM44_CRT_PROG_NM, BC001K4_A955TBM44_UPD_PROG_NM,
            BC001K4_n955TBM44_UPD_PROG_NM
            }
            , new Object[] {
            BC001K5_A945TBM44_STUDY_ID, BC001K5_A946TBM44_CRF_ID, BC001K5_A947TBM44_CRF_EDA_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001K9_A945TBM44_STUDY_ID, BC001K9_A946TBM44_CRF_ID, BC001K9_A947TBM44_CRF_EDA_NO, BC001K9_A950TBM44_CRT_DATETIME, BC001K9_n950TBM44_CRT_DATETIME, BC001K9_A951TBM44_CRT_USER_ID, BC001K9_n951TBM44_CRT_USER_ID, BC001K9_A953TBM44_UPD_DATETIME, BC001K9_n953TBM44_UPD_DATETIME, BC001K9_A954TBM44_UPD_USER_ID,
            BC001K9_n954TBM44_UPD_USER_ID, BC001K9_A956TBM44_UPD_CNT, BC001K9_n956TBM44_UPD_CNT, BC001K9_A948TBM44_VISIT_NO, BC001K9_n948TBM44_VISIT_NO, BC001K9_A949TBM44_DEL_FLG, BC001K9_n949TBM44_DEL_FLG, BC001K9_A952TBM44_CRT_PROG_NM, BC001K9_n952TBM44_CRT_PROG_NM, BC001K9_A955TBM44_UPD_PROG_NM,
            BC001K9_n955TBM44_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM44_CRF_VISIT_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e111K2 */
      e111K2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z947TBM44_CRF_EDA_NO ;
   private byte A947TBM44_CRF_EDA_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z946TBM44_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short RcdFound61 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A948TBM44_VISIT_NO ;
   private int GX_JID ;
   private int Z948TBM44_VISIT_NO ;
   private int GXActiveErrHndl ;
   private long Z945TBM44_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A956TBM44_UPD_CNT ;
   private long Z956TBM44_UPD_CNT ;
   private long O956TBM44_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode61 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A950TBM44_CRT_DATETIME ;
   private java.util.Date A953TBM44_UPD_DATETIME ;
   private java.util.Date Z950TBM44_CRT_DATETIME ;
   private java.util.Date Z953TBM44_UPD_DATETIME ;
   private boolean n950TBM44_CRT_DATETIME ;
   private boolean n951TBM44_CRT_USER_ID ;
   private boolean n953TBM44_UPD_DATETIME ;
   private boolean n954TBM44_UPD_USER_ID ;
   private boolean n956TBM44_UPD_CNT ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n949TBM44_DEL_FLG ;
   private boolean n952TBM44_CRT_PROG_NM ;
   private boolean n955TBM44_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV7W_BC_FLG ;
   private String AV8W_TXT ;
   private String A949TBM44_DEL_FLG ;
   private String A951TBM44_CRT_USER_ID ;
   private String A952TBM44_CRT_PROG_NM ;
   private String A954TBM44_UPD_USER_ID ;
   private String A955TBM44_UPD_PROG_NM ;
   private String Z951TBM44_CRT_USER_ID ;
   private String Z954TBM44_UPD_USER_ID ;
   private String Z949TBM44_DEL_FLG ;
   private String Z952TBM44_CRT_PROG_NM ;
   private String Z955TBM44_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM44_CRF_VISIT bcTBM44_CRF_VISIT ;
   private IDataStoreProvider pr_default ;
   private long[] BC001K4_A945TBM44_STUDY_ID ;
   private short[] BC001K4_A946TBM44_CRF_ID ;
   private byte[] BC001K4_A947TBM44_CRF_EDA_NO ;
   private java.util.Date[] BC001K4_A950TBM44_CRT_DATETIME ;
   private boolean[] BC001K4_n950TBM44_CRT_DATETIME ;
   private String[] BC001K4_A951TBM44_CRT_USER_ID ;
   private boolean[] BC001K4_n951TBM44_CRT_USER_ID ;
   private java.util.Date[] BC001K4_A953TBM44_UPD_DATETIME ;
   private boolean[] BC001K4_n953TBM44_UPD_DATETIME ;
   private String[] BC001K4_A954TBM44_UPD_USER_ID ;
   private boolean[] BC001K4_n954TBM44_UPD_USER_ID ;
   private long[] BC001K4_A956TBM44_UPD_CNT ;
   private boolean[] BC001K4_n956TBM44_UPD_CNT ;
   private int[] BC001K4_A948TBM44_VISIT_NO ;
   private boolean[] BC001K4_n948TBM44_VISIT_NO ;
   private String[] BC001K4_A949TBM44_DEL_FLG ;
   private boolean[] BC001K4_n949TBM44_DEL_FLG ;
   private String[] BC001K4_A952TBM44_CRT_PROG_NM ;
   private boolean[] BC001K4_n952TBM44_CRT_PROG_NM ;
   private String[] BC001K4_A955TBM44_UPD_PROG_NM ;
   private boolean[] BC001K4_n955TBM44_UPD_PROG_NM ;
   private long[] BC001K5_A945TBM44_STUDY_ID ;
   private short[] BC001K5_A946TBM44_CRF_ID ;
   private byte[] BC001K5_A947TBM44_CRF_EDA_NO ;
   private long[] BC001K3_A945TBM44_STUDY_ID ;
   private short[] BC001K3_A946TBM44_CRF_ID ;
   private byte[] BC001K3_A947TBM44_CRF_EDA_NO ;
   private java.util.Date[] BC001K3_A950TBM44_CRT_DATETIME ;
   private boolean[] BC001K3_n950TBM44_CRT_DATETIME ;
   private String[] BC001K3_A951TBM44_CRT_USER_ID ;
   private boolean[] BC001K3_n951TBM44_CRT_USER_ID ;
   private java.util.Date[] BC001K3_A953TBM44_UPD_DATETIME ;
   private boolean[] BC001K3_n953TBM44_UPD_DATETIME ;
   private String[] BC001K3_A954TBM44_UPD_USER_ID ;
   private boolean[] BC001K3_n954TBM44_UPD_USER_ID ;
   private long[] BC001K3_A956TBM44_UPD_CNT ;
   private boolean[] BC001K3_n956TBM44_UPD_CNT ;
   private int[] BC001K3_A948TBM44_VISIT_NO ;
   private boolean[] BC001K3_n948TBM44_VISIT_NO ;
   private String[] BC001K3_A949TBM44_DEL_FLG ;
   private boolean[] BC001K3_n949TBM44_DEL_FLG ;
   private String[] BC001K3_A952TBM44_CRT_PROG_NM ;
   private boolean[] BC001K3_n952TBM44_CRT_PROG_NM ;
   private String[] BC001K3_A955TBM44_UPD_PROG_NM ;
   private boolean[] BC001K3_n955TBM44_UPD_PROG_NM ;
   private long[] BC001K2_A945TBM44_STUDY_ID ;
   private short[] BC001K2_A946TBM44_CRF_ID ;
   private byte[] BC001K2_A947TBM44_CRF_EDA_NO ;
   private java.util.Date[] BC001K2_A950TBM44_CRT_DATETIME ;
   private boolean[] BC001K2_n950TBM44_CRT_DATETIME ;
   private String[] BC001K2_A951TBM44_CRT_USER_ID ;
   private boolean[] BC001K2_n951TBM44_CRT_USER_ID ;
   private java.util.Date[] BC001K2_A953TBM44_UPD_DATETIME ;
   private boolean[] BC001K2_n953TBM44_UPD_DATETIME ;
   private String[] BC001K2_A954TBM44_UPD_USER_ID ;
   private boolean[] BC001K2_n954TBM44_UPD_USER_ID ;
   private long[] BC001K2_A956TBM44_UPD_CNT ;
   private boolean[] BC001K2_n956TBM44_UPD_CNT ;
   private int[] BC001K2_A948TBM44_VISIT_NO ;
   private boolean[] BC001K2_n948TBM44_VISIT_NO ;
   private String[] BC001K2_A949TBM44_DEL_FLG ;
   private boolean[] BC001K2_n949TBM44_DEL_FLG ;
   private String[] BC001K2_A952TBM44_CRT_PROG_NM ;
   private boolean[] BC001K2_n952TBM44_CRT_PROG_NM ;
   private String[] BC001K2_A955TBM44_UPD_PROG_NM ;
   private boolean[] BC001K2_n955TBM44_UPD_PROG_NM ;
   private long[] BC001K9_A945TBM44_STUDY_ID ;
   private short[] BC001K9_A946TBM44_CRF_ID ;
   private byte[] BC001K9_A947TBM44_CRF_EDA_NO ;
   private java.util.Date[] BC001K9_A950TBM44_CRT_DATETIME ;
   private boolean[] BC001K9_n950TBM44_CRT_DATETIME ;
   private String[] BC001K9_A951TBM44_CRT_USER_ID ;
   private boolean[] BC001K9_n951TBM44_CRT_USER_ID ;
   private java.util.Date[] BC001K9_A953TBM44_UPD_DATETIME ;
   private boolean[] BC001K9_n953TBM44_UPD_DATETIME ;
   private String[] BC001K9_A954TBM44_UPD_USER_ID ;
   private boolean[] BC001K9_n954TBM44_UPD_USER_ID ;
   private long[] BC001K9_A956TBM44_UPD_CNT ;
   private boolean[] BC001K9_n956TBM44_UPD_CNT ;
   private int[] BC001K9_A948TBM44_VISIT_NO ;
   private boolean[] BC001K9_n948TBM44_VISIT_NO ;
   private String[] BC001K9_A949TBM44_DEL_FLG ;
   private boolean[] BC001K9_n949TBM44_DEL_FLG ;
   private String[] BC001K9_A952TBM44_CRT_PROG_NM ;
   private boolean[] BC001K9_n952TBM44_CRT_PROG_NM ;
   private String[] BC001K9_A955TBM44_UPD_PROG_NM ;
   private boolean[] BC001K9_n955TBM44_UPD_PROG_NM ;
}

final  class tbm44_crf_visit_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001K2", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_CRT_DATETIME`, `TBM44_CRT_USER_ID`, `TBM44_UPD_DATETIME`, `TBM44_UPD_USER_ID`, `TBM44_UPD_CNT`, `TBM44_VISIT_NO`, `TBM44_DEL_FLG`, `TBM44_CRT_PROG_NM`, `TBM44_UPD_PROG_NM` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? AND `TBM44_CRF_ID` = ? AND `TBM44_CRF_EDA_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001K3", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_CRT_DATETIME`, `TBM44_CRT_USER_ID`, `TBM44_UPD_DATETIME`, `TBM44_UPD_USER_ID`, `TBM44_UPD_CNT`, `TBM44_VISIT_NO`, `TBM44_DEL_FLG`, `TBM44_CRT_PROG_NM`, `TBM44_UPD_PROG_NM` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? AND `TBM44_CRF_ID` = ? AND `TBM44_CRF_EDA_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001K4", "SELECT TM1.`TBM44_STUDY_ID`, TM1.`TBM44_CRF_ID`, TM1.`TBM44_CRF_EDA_NO`, TM1.`TBM44_CRT_DATETIME`, TM1.`TBM44_CRT_USER_ID`, TM1.`TBM44_UPD_DATETIME`, TM1.`TBM44_UPD_USER_ID`, TM1.`TBM44_UPD_CNT`, TM1.`TBM44_VISIT_NO`, TM1.`TBM44_DEL_FLG`, TM1.`TBM44_CRT_PROG_NM`, TM1.`TBM44_UPD_PROG_NM` FROM `TBM44_CRF_VISIT` TM1 WHERE TM1.`TBM44_STUDY_ID` = ? and TM1.`TBM44_CRF_ID` = ? and TM1.`TBM44_CRF_EDA_NO` = ? ORDER BY TM1.`TBM44_STUDY_ID`, TM1.`TBM44_CRF_ID`, TM1.`TBM44_CRF_EDA_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC001K5", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? AND `TBM44_CRF_ID` = ? AND `TBM44_CRF_EDA_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001K6", "INSERT INTO `TBM44_CRF_VISIT`(`TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_CRT_DATETIME`, `TBM44_CRT_USER_ID`, `TBM44_UPD_DATETIME`, `TBM44_UPD_USER_ID`, `TBM44_UPD_CNT`, `TBM44_VISIT_NO`, `TBM44_DEL_FLG`, `TBM44_CRT_PROG_NM`, `TBM44_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001K7", "UPDATE `TBM44_CRF_VISIT` SET `TBM44_CRT_DATETIME`=?, `TBM44_CRT_USER_ID`=?, `TBM44_UPD_DATETIME`=?, `TBM44_UPD_USER_ID`=?, `TBM44_UPD_CNT`=?, `TBM44_VISIT_NO`=?, `TBM44_DEL_FLG`=?, `TBM44_CRT_PROG_NM`=?, `TBM44_UPD_PROG_NM`=?  WHERE `TBM44_STUDY_ID` = ? AND `TBM44_CRF_ID` = ? AND `TBM44_CRF_EDA_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001K8", "DELETE FROM `TBM44_CRF_VISIT`  WHERE `TBM44_STUDY_ID` = ? AND `TBM44_CRF_ID` = ? AND `TBM44_CRF_EDA_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001K9", "SELECT TM1.`TBM44_STUDY_ID`, TM1.`TBM44_CRF_ID`, TM1.`TBM44_CRF_EDA_NO`, TM1.`TBM44_CRT_DATETIME`, TM1.`TBM44_CRT_USER_ID`, TM1.`TBM44_UPD_DATETIME`, TM1.`TBM44_UPD_USER_ID`, TM1.`TBM44_UPD_CNT`, TM1.`TBM44_VISIT_NO`, TM1.`TBM44_DEL_FLG`, TM1.`TBM44_CRT_PROG_NM`, TM1.`TBM44_UPD_PROG_NM` FROM `TBM44_CRF_VISIT` TM1 WHERE TM1.`TBM44_STUDY_ID` = ? and TM1.`TBM44_CRF_ID` = ? and TM1.`TBM44_CRF_EDA_NO` = ? ORDER BY TM1.`TBM44_STUDY_ID`, TM1.`TBM44_CRF_ID`, TM1.`TBM44_CRF_EDA_NO` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
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
               ((int[]) buf[13])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
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
               ((int[]) buf[13])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
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
               ((int[]) buf[13])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
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
               ((int[]) buf[13])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[14]).intValue());
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
                  stmt.setVarchar(11, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 40);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
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
               stmt.setLong(10, ((Number) parms[18]).longValue());
               stmt.setShort(11, ((Number) parms[19]).shortValue());
               stmt.setByte(12, ((Number) parms[20]).byteValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

