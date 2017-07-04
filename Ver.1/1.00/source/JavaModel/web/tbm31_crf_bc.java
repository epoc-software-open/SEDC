/*
               File: tbm31_crf_bc
        Description: CRFマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:44.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm31_crf_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm31_crf_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm31_crf_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm31_crf_bc.class ));
   }

   public tbm31_crf_bc( int remoteHandle ,
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
         /* Execute user event: e120J2 */
         e120J2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z217TBM31_STUDY_ID = A217TBM31_STUDY_ID ;
            Z218TBM31_CRF_ID = A218TBM31_CRF_ID ;
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

   public void confirm_0J0( )
   {
      beforeValidate0J18( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0J18( ) ;
         }
         else
         {
            checkExtendedTable0J18( ) ;
            if ( AnyError == 0 )
            {
               zm0J18( 9) ;
            }
            closeExtendedTableCursors0J18( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110J2( )
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

   public void e120J2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A218TBM31_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A219TBM31_CRF_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A550TBM31_CRF_SNM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A220TBM31_GRID_SIZE, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A221TBM31_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A405TBM31_DEF_VISIT_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A406TBM31_DEF_DOMAIN_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A551TBM31_STATUS + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A222TBM31_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A223TBM31_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A224TBM31_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm31_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A225TBM31_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A226TBM31_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A227TBM31_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm31_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A228TBM31_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A229TBM31_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1171( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0J18( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z224TBM31_CRT_DATETIME = A224TBM31_CRT_DATETIME ;
         Z225TBM31_CRT_USER_ID = A225TBM31_CRT_USER_ID ;
         Z227TBM31_UPD_DATETIME = A227TBM31_UPD_DATETIME ;
         Z228TBM31_UPD_USER_ID = A228TBM31_UPD_USER_ID ;
         Z230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
         Z219TBM31_CRF_NM = A219TBM31_CRF_NM ;
         Z550TBM31_CRF_SNM = A550TBM31_CRF_SNM ;
         Z220TBM31_GRID_SIZE = A220TBM31_GRID_SIZE ;
         Z221TBM31_ORDER = A221TBM31_ORDER ;
         Z405TBM31_DEF_VISIT_NO = A405TBM31_DEF_VISIT_NO ;
         Z406TBM31_DEF_DOMAIN_CD = A406TBM31_DEF_DOMAIN_CD ;
         Z551TBM31_STATUS = A551TBM31_STATUS ;
         Z222TBM31_NOTE = A222TBM31_NOTE ;
         Z223TBM31_DEL_FLG = A223TBM31_DEL_FLG ;
         Z226TBM31_CRT_PROG_NM = A226TBM31_CRT_PROG_NM ;
         Z229TBM31_UPD_PROG_NM = A229TBM31_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z218TBM31_CRF_ID = A218TBM31_CRF_ID ;
         Z224TBM31_CRT_DATETIME = A224TBM31_CRT_DATETIME ;
         Z225TBM31_CRT_USER_ID = A225TBM31_CRT_USER_ID ;
         Z227TBM31_UPD_DATETIME = A227TBM31_UPD_DATETIME ;
         Z228TBM31_UPD_USER_ID = A228TBM31_UPD_USER_ID ;
         Z230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
         Z219TBM31_CRF_NM = A219TBM31_CRF_NM ;
         Z550TBM31_CRF_SNM = A550TBM31_CRF_SNM ;
         Z220TBM31_GRID_SIZE = A220TBM31_GRID_SIZE ;
         Z221TBM31_ORDER = A221TBM31_ORDER ;
         Z405TBM31_DEF_VISIT_NO = A405TBM31_DEF_VISIT_NO ;
         Z406TBM31_DEF_DOMAIN_CD = A406TBM31_DEF_DOMAIN_CD ;
         Z551TBM31_STATUS = A551TBM31_STATUS ;
         Z222TBM31_NOTE = A222TBM31_NOTE ;
         Z223TBM31_DEL_FLG = A223TBM31_DEL_FLG ;
         Z226TBM31_CRT_PROG_NM = A226TBM31_CRT_PROG_NM ;
         Z229TBM31_UPD_PROG_NM = A229TBM31_UPD_PROG_NM ;
         Z217TBM31_STUDY_ID = A217TBM31_STUDY_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0J18( )
   {
      /* Using cursor BC000J5 */
      pr_default.execute(3, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A224TBM31_CRT_DATETIME = BC000J5_A224TBM31_CRT_DATETIME[0] ;
         n224TBM31_CRT_DATETIME = BC000J5_n224TBM31_CRT_DATETIME[0] ;
         A225TBM31_CRT_USER_ID = BC000J5_A225TBM31_CRT_USER_ID[0] ;
         n225TBM31_CRT_USER_ID = BC000J5_n225TBM31_CRT_USER_ID[0] ;
         A227TBM31_UPD_DATETIME = BC000J5_A227TBM31_UPD_DATETIME[0] ;
         n227TBM31_UPD_DATETIME = BC000J5_n227TBM31_UPD_DATETIME[0] ;
         A228TBM31_UPD_USER_ID = BC000J5_A228TBM31_UPD_USER_ID[0] ;
         n228TBM31_UPD_USER_ID = BC000J5_n228TBM31_UPD_USER_ID[0] ;
         A230TBM31_UPD_CNT = BC000J5_A230TBM31_UPD_CNT[0] ;
         n230TBM31_UPD_CNT = BC000J5_n230TBM31_UPD_CNT[0] ;
         A219TBM31_CRF_NM = BC000J5_A219TBM31_CRF_NM[0] ;
         n219TBM31_CRF_NM = BC000J5_n219TBM31_CRF_NM[0] ;
         A550TBM31_CRF_SNM = BC000J5_A550TBM31_CRF_SNM[0] ;
         n550TBM31_CRF_SNM = BC000J5_n550TBM31_CRF_SNM[0] ;
         A220TBM31_GRID_SIZE = BC000J5_A220TBM31_GRID_SIZE[0] ;
         n220TBM31_GRID_SIZE = BC000J5_n220TBM31_GRID_SIZE[0] ;
         A221TBM31_ORDER = BC000J5_A221TBM31_ORDER[0] ;
         n221TBM31_ORDER = BC000J5_n221TBM31_ORDER[0] ;
         A405TBM31_DEF_VISIT_NO = BC000J5_A405TBM31_DEF_VISIT_NO[0] ;
         n405TBM31_DEF_VISIT_NO = BC000J5_n405TBM31_DEF_VISIT_NO[0] ;
         A406TBM31_DEF_DOMAIN_CD = BC000J5_A406TBM31_DEF_DOMAIN_CD[0] ;
         n406TBM31_DEF_DOMAIN_CD = BC000J5_n406TBM31_DEF_DOMAIN_CD[0] ;
         A551TBM31_STATUS = BC000J5_A551TBM31_STATUS[0] ;
         n551TBM31_STATUS = BC000J5_n551TBM31_STATUS[0] ;
         A222TBM31_NOTE = BC000J5_A222TBM31_NOTE[0] ;
         n222TBM31_NOTE = BC000J5_n222TBM31_NOTE[0] ;
         A223TBM31_DEL_FLG = BC000J5_A223TBM31_DEL_FLG[0] ;
         n223TBM31_DEL_FLG = BC000J5_n223TBM31_DEL_FLG[0] ;
         A226TBM31_CRT_PROG_NM = BC000J5_A226TBM31_CRT_PROG_NM[0] ;
         n226TBM31_CRT_PROG_NM = BC000J5_n226TBM31_CRT_PROG_NM[0] ;
         A229TBM31_UPD_PROG_NM = BC000J5_A229TBM31_UPD_PROG_NM[0] ;
         n229TBM31_UPD_PROG_NM = BC000J5_n229TBM31_UPD_PROG_NM[0] ;
         zm0J18( -8) ;
      }
      pr_default.close(3);
      onLoadActions0J18( ) ;
   }

   public void onLoadActions0J18( )
   {
      AV9Pgmname = "TBM31_CRF_BC" ;
   }

   public void checkExtendedTable0J18( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM31_CRF_BC" ;
      /* Using cursor BC000J4 */
      pr_default.execute(2, new Object[] {new Long(A217TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError217 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
      }
      if ( AnyError217 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A224TBM31_CRT_DATETIME) || (( A224TBM31_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A224TBM31_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A227TBM31_UPD_DATETIME) || (( A227TBM31_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A227TBM31_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0J18( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey0J18( )
   {
      /* Using cursor BC000J6 */
      pr_default.execute(4, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000J3 */
      pr_default.execute(1, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0J18( 8) ;
         RcdFound18 = (short)(1) ;
         A218TBM31_CRF_ID = BC000J3_A218TBM31_CRF_ID[0] ;
         A224TBM31_CRT_DATETIME = BC000J3_A224TBM31_CRT_DATETIME[0] ;
         n224TBM31_CRT_DATETIME = BC000J3_n224TBM31_CRT_DATETIME[0] ;
         A225TBM31_CRT_USER_ID = BC000J3_A225TBM31_CRT_USER_ID[0] ;
         n225TBM31_CRT_USER_ID = BC000J3_n225TBM31_CRT_USER_ID[0] ;
         A227TBM31_UPD_DATETIME = BC000J3_A227TBM31_UPD_DATETIME[0] ;
         n227TBM31_UPD_DATETIME = BC000J3_n227TBM31_UPD_DATETIME[0] ;
         A228TBM31_UPD_USER_ID = BC000J3_A228TBM31_UPD_USER_ID[0] ;
         n228TBM31_UPD_USER_ID = BC000J3_n228TBM31_UPD_USER_ID[0] ;
         A230TBM31_UPD_CNT = BC000J3_A230TBM31_UPD_CNT[0] ;
         n230TBM31_UPD_CNT = BC000J3_n230TBM31_UPD_CNT[0] ;
         A219TBM31_CRF_NM = BC000J3_A219TBM31_CRF_NM[0] ;
         n219TBM31_CRF_NM = BC000J3_n219TBM31_CRF_NM[0] ;
         A550TBM31_CRF_SNM = BC000J3_A550TBM31_CRF_SNM[0] ;
         n550TBM31_CRF_SNM = BC000J3_n550TBM31_CRF_SNM[0] ;
         A220TBM31_GRID_SIZE = BC000J3_A220TBM31_GRID_SIZE[0] ;
         n220TBM31_GRID_SIZE = BC000J3_n220TBM31_GRID_SIZE[0] ;
         A221TBM31_ORDER = BC000J3_A221TBM31_ORDER[0] ;
         n221TBM31_ORDER = BC000J3_n221TBM31_ORDER[0] ;
         A405TBM31_DEF_VISIT_NO = BC000J3_A405TBM31_DEF_VISIT_NO[0] ;
         n405TBM31_DEF_VISIT_NO = BC000J3_n405TBM31_DEF_VISIT_NO[0] ;
         A406TBM31_DEF_DOMAIN_CD = BC000J3_A406TBM31_DEF_DOMAIN_CD[0] ;
         n406TBM31_DEF_DOMAIN_CD = BC000J3_n406TBM31_DEF_DOMAIN_CD[0] ;
         A551TBM31_STATUS = BC000J3_A551TBM31_STATUS[0] ;
         n551TBM31_STATUS = BC000J3_n551TBM31_STATUS[0] ;
         A222TBM31_NOTE = BC000J3_A222TBM31_NOTE[0] ;
         n222TBM31_NOTE = BC000J3_n222TBM31_NOTE[0] ;
         A223TBM31_DEL_FLG = BC000J3_A223TBM31_DEL_FLG[0] ;
         n223TBM31_DEL_FLG = BC000J3_n223TBM31_DEL_FLG[0] ;
         A226TBM31_CRT_PROG_NM = BC000J3_A226TBM31_CRT_PROG_NM[0] ;
         n226TBM31_CRT_PROG_NM = BC000J3_n226TBM31_CRT_PROG_NM[0] ;
         A229TBM31_UPD_PROG_NM = BC000J3_A229TBM31_UPD_PROG_NM[0] ;
         n229TBM31_UPD_PROG_NM = BC000J3_n229TBM31_UPD_PROG_NM[0] ;
         A217TBM31_STUDY_ID = BC000J3_A217TBM31_STUDY_ID[0] ;
         O230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
         n230TBM31_UPD_CNT = false ;
         Z217TBM31_STUDY_ID = A217TBM31_STUDY_ID ;
         Z218TBM31_CRF_ID = A218TBM31_CRF_ID ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0J18( ) ;
         Gx_mode = sMode18 ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey0J18( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode18 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0J18( ) ;
      if ( RcdFound18 == 0 )
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
      confirm_0J0( ) ;
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

   public void checkOptimisticConcurrency0J18( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000J2 */
         pr_default.execute(0, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM31_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z224TBM31_CRT_DATETIME.equals( BC000J2_A224TBM31_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z225TBM31_CRT_USER_ID, BC000J2_A225TBM31_CRT_USER_ID[0]) != 0 ) || !( Z227TBM31_UPD_DATETIME.equals( BC000J2_A227TBM31_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z228TBM31_UPD_USER_ID, BC000J2_A228TBM31_UPD_USER_ID[0]) != 0 ) || ( Z230TBM31_UPD_CNT != BC000J2_A230TBM31_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z219TBM31_CRF_NM, BC000J2_A219TBM31_CRF_NM[0]) != 0 ) || ( GXutil.strcmp(Z550TBM31_CRF_SNM, BC000J2_A550TBM31_CRF_SNM[0]) != 0 ) || ( Z220TBM31_GRID_SIZE != BC000J2_A220TBM31_GRID_SIZE[0] ) || ( Z221TBM31_ORDER != BC000J2_A221TBM31_ORDER[0] ) || ( Z405TBM31_DEF_VISIT_NO != BC000J2_A405TBM31_DEF_VISIT_NO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z406TBM31_DEF_DOMAIN_CD, BC000J2_A406TBM31_DEF_DOMAIN_CD[0]) != 0 ) || ( GXutil.strcmp(Z551TBM31_STATUS, BC000J2_A551TBM31_STATUS[0]) != 0 ) || ( GXutil.strcmp(Z222TBM31_NOTE, BC000J2_A222TBM31_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z223TBM31_DEL_FLG, BC000J2_A223TBM31_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z226TBM31_CRT_PROG_NM, BC000J2_A226TBM31_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z229TBM31_UPD_PROG_NM, BC000J2_A229TBM31_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM31_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0J18( )
   {
      beforeValidate0J18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0J18( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0J18( 0) ;
         checkOptimisticConcurrency0J18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0J18( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0J18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000J7 */
                  pr_default.execute(5, new Object[] {new Short(A218TBM31_CRF_ID), new Boolean(n224TBM31_CRT_DATETIME), A224TBM31_CRT_DATETIME, new Boolean(n225TBM31_CRT_USER_ID), A225TBM31_CRT_USER_ID, new Boolean(n227TBM31_UPD_DATETIME), A227TBM31_UPD_DATETIME, new Boolean(n228TBM31_UPD_USER_ID), A228TBM31_UPD_USER_ID, new Boolean(n230TBM31_UPD_CNT), new Long(A230TBM31_UPD_CNT), new Boolean(n219TBM31_CRF_NM), A219TBM31_CRF_NM, new Boolean(n550TBM31_CRF_SNM), A550TBM31_CRF_SNM, new Boolean(n220TBM31_GRID_SIZE), new Short(A220TBM31_GRID_SIZE), new Boolean(n221TBM31_ORDER), new Integer(A221TBM31_ORDER), new Boolean(n405TBM31_DEF_VISIT_NO), new Short(A405TBM31_DEF_VISIT_NO), new Boolean(n406TBM31_DEF_DOMAIN_CD), A406TBM31_DEF_DOMAIN_CD, new Boolean(n551TBM31_STATUS), A551TBM31_STATUS, new Boolean(n222TBM31_NOTE), A222TBM31_NOTE, new Boolean(n223TBM31_DEL_FLG), A223TBM31_DEL_FLG, new Boolean(n226TBM31_CRT_PROG_NM), A226TBM31_CRT_PROG_NM, new Boolean(n229TBM31_UPD_PROG_NM), A229TBM31_UPD_PROG_NM, new Long(A217TBM31_STUDY_ID)});
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
            load0J18( ) ;
         }
         endLevel0J18( ) ;
      }
      closeExtendedTableCursors0J18( ) ;
   }

   public void update0J18( )
   {
      beforeValidate0J18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0J18( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0J18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0J18( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0J18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000J8 */
                  pr_default.execute(6, new Object[] {new Boolean(n224TBM31_CRT_DATETIME), A224TBM31_CRT_DATETIME, new Boolean(n225TBM31_CRT_USER_ID), A225TBM31_CRT_USER_ID, new Boolean(n227TBM31_UPD_DATETIME), A227TBM31_UPD_DATETIME, new Boolean(n228TBM31_UPD_USER_ID), A228TBM31_UPD_USER_ID, new Boolean(n230TBM31_UPD_CNT), new Long(A230TBM31_UPD_CNT), new Boolean(n219TBM31_CRF_NM), A219TBM31_CRF_NM, new Boolean(n550TBM31_CRF_SNM), A550TBM31_CRF_SNM, new Boolean(n220TBM31_GRID_SIZE), new Short(A220TBM31_GRID_SIZE), new Boolean(n221TBM31_ORDER), new Integer(A221TBM31_ORDER), new Boolean(n405TBM31_DEF_VISIT_NO), new Short(A405TBM31_DEF_VISIT_NO), new Boolean(n406TBM31_DEF_DOMAIN_CD), A406TBM31_DEF_DOMAIN_CD, new Boolean(n551TBM31_STATUS), A551TBM31_STATUS, new Boolean(n222TBM31_NOTE), A222TBM31_NOTE, new Boolean(n223TBM31_DEL_FLG), A223TBM31_DEL_FLG, new Boolean(n226TBM31_CRT_PROG_NM), A226TBM31_CRT_PROG_NM, new Boolean(n229TBM31_UPD_PROG_NM), A229TBM31_UPD_PROG_NM, new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM31_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0J18( ) ;
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
         endLevel0J18( ) ;
      }
      closeExtendedTableCursors0J18( ) ;
   }

   public void deferredUpdate0J18( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0J18( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0J18( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0J18( ) ;
         afterConfirm0J18( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0J18( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000J9 */
               pr_default.execute(7, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0J18( ) ;
      Gx_mode = sMode18 ;
   }

   public void onDeleteControls0J18( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM31_CRF_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000J10 */
         pr_default.execute(8, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
      }
   }

   public void endLevel0J18( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0J18( ) ;
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

   public void scanKeyStart0J18( )
   {
      /* Using cursor BC000J11 */
      pr_default.execute(9, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A218TBM31_CRF_ID = BC000J11_A218TBM31_CRF_ID[0] ;
         A224TBM31_CRT_DATETIME = BC000J11_A224TBM31_CRT_DATETIME[0] ;
         n224TBM31_CRT_DATETIME = BC000J11_n224TBM31_CRT_DATETIME[0] ;
         A225TBM31_CRT_USER_ID = BC000J11_A225TBM31_CRT_USER_ID[0] ;
         n225TBM31_CRT_USER_ID = BC000J11_n225TBM31_CRT_USER_ID[0] ;
         A227TBM31_UPD_DATETIME = BC000J11_A227TBM31_UPD_DATETIME[0] ;
         n227TBM31_UPD_DATETIME = BC000J11_n227TBM31_UPD_DATETIME[0] ;
         A228TBM31_UPD_USER_ID = BC000J11_A228TBM31_UPD_USER_ID[0] ;
         n228TBM31_UPD_USER_ID = BC000J11_n228TBM31_UPD_USER_ID[0] ;
         A230TBM31_UPD_CNT = BC000J11_A230TBM31_UPD_CNT[0] ;
         n230TBM31_UPD_CNT = BC000J11_n230TBM31_UPD_CNT[0] ;
         A219TBM31_CRF_NM = BC000J11_A219TBM31_CRF_NM[0] ;
         n219TBM31_CRF_NM = BC000J11_n219TBM31_CRF_NM[0] ;
         A550TBM31_CRF_SNM = BC000J11_A550TBM31_CRF_SNM[0] ;
         n550TBM31_CRF_SNM = BC000J11_n550TBM31_CRF_SNM[0] ;
         A220TBM31_GRID_SIZE = BC000J11_A220TBM31_GRID_SIZE[0] ;
         n220TBM31_GRID_SIZE = BC000J11_n220TBM31_GRID_SIZE[0] ;
         A221TBM31_ORDER = BC000J11_A221TBM31_ORDER[0] ;
         n221TBM31_ORDER = BC000J11_n221TBM31_ORDER[0] ;
         A405TBM31_DEF_VISIT_NO = BC000J11_A405TBM31_DEF_VISIT_NO[0] ;
         n405TBM31_DEF_VISIT_NO = BC000J11_n405TBM31_DEF_VISIT_NO[0] ;
         A406TBM31_DEF_DOMAIN_CD = BC000J11_A406TBM31_DEF_DOMAIN_CD[0] ;
         n406TBM31_DEF_DOMAIN_CD = BC000J11_n406TBM31_DEF_DOMAIN_CD[0] ;
         A551TBM31_STATUS = BC000J11_A551TBM31_STATUS[0] ;
         n551TBM31_STATUS = BC000J11_n551TBM31_STATUS[0] ;
         A222TBM31_NOTE = BC000J11_A222TBM31_NOTE[0] ;
         n222TBM31_NOTE = BC000J11_n222TBM31_NOTE[0] ;
         A223TBM31_DEL_FLG = BC000J11_A223TBM31_DEL_FLG[0] ;
         n223TBM31_DEL_FLG = BC000J11_n223TBM31_DEL_FLG[0] ;
         A226TBM31_CRT_PROG_NM = BC000J11_A226TBM31_CRT_PROG_NM[0] ;
         n226TBM31_CRT_PROG_NM = BC000J11_n226TBM31_CRT_PROG_NM[0] ;
         A229TBM31_UPD_PROG_NM = BC000J11_A229TBM31_UPD_PROG_NM[0] ;
         n229TBM31_UPD_PROG_NM = BC000J11_n229TBM31_UPD_PROG_NM[0] ;
         A217TBM31_STUDY_ID = BC000J11_A217TBM31_STUDY_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0J18( )
   {
      pr_default.readNext(9);
      RcdFound18 = (short)(0) ;
      scanKeyLoad0J18( ) ;
   }

   public void scanKeyLoad0J18( )
   {
      sMode18 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A218TBM31_CRF_ID = BC000J11_A218TBM31_CRF_ID[0] ;
         A224TBM31_CRT_DATETIME = BC000J11_A224TBM31_CRT_DATETIME[0] ;
         n224TBM31_CRT_DATETIME = BC000J11_n224TBM31_CRT_DATETIME[0] ;
         A225TBM31_CRT_USER_ID = BC000J11_A225TBM31_CRT_USER_ID[0] ;
         n225TBM31_CRT_USER_ID = BC000J11_n225TBM31_CRT_USER_ID[0] ;
         A227TBM31_UPD_DATETIME = BC000J11_A227TBM31_UPD_DATETIME[0] ;
         n227TBM31_UPD_DATETIME = BC000J11_n227TBM31_UPD_DATETIME[0] ;
         A228TBM31_UPD_USER_ID = BC000J11_A228TBM31_UPD_USER_ID[0] ;
         n228TBM31_UPD_USER_ID = BC000J11_n228TBM31_UPD_USER_ID[0] ;
         A230TBM31_UPD_CNT = BC000J11_A230TBM31_UPD_CNT[0] ;
         n230TBM31_UPD_CNT = BC000J11_n230TBM31_UPD_CNT[0] ;
         A219TBM31_CRF_NM = BC000J11_A219TBM31_CRF_NM[0] ;
         n219TBM31_CRF_NM = BC000J11_n219TBM31_CRF_NM[0] ;
         A550TBM31_CRF_SNM = BC000J11_A550TBM31_CRF_SNM[0] ;
         n550TBM31_CRF_SNM = BC000J11_n550TBM31_CRF_SNM[0] ;
         A220TBM31_GRID_SIZE = BC000J11_A220TBM31_GRID_SIZE[0] ;
         n220TBM31_GRID_SIZE = BC000J11_n220TBM31_GRID_SIZE[0] ;
         A221TBM31_ORDER = BC000J11_A221TBM31_ORDER[0] ;
         n221TBM31_ORDER = BC000J11_n221TBM31_ORDER[0] ;
         A405TBM31_DEF_VISIT_NO = BC000J11_A405TBM31_DEF_VISIT_NO[0] ;
         n405TBM31_DEF_VISIT_NO = BC000J11_n405TBM31_DEF_VISIT_NO[0] ;
         A406TBM31_DEF_DOMAIN_CD = BC000J11_A406TBM31_DEF_DOMAIN_CD[0] ;
         n406TBM31_DEF_DOMAIN_CD = BC000J11_n406TBM31_DEF_DOMAIN_CD[0] ;
         A551TBM31_STATUS = BC000J11_A551TBM31_STATUS[0] ;
         n551TBM31_STATUS = BC000J11_n551TBM31_STATUS[0] ;
         A222TBM31_NOTE = BC000J11_A222TBM31_NOTE[0] ;
         n222TBM31_NOTE = BC000J11_n222TBM31_NOTE[0] ;
         A223TBM31_DEL_FLG = BC000J11_A223TBM31_DEL_FLG[0] ;
         n223TBM31_DEL_FLG = BC000J11_n223TBM31_DEL_FLG[0] ;
         A226TBM31_CRT_PROG_NM = BC000J11_A226TBM31_CRT_PROG_NM[0] ;
         n226TBM31_CRT_PROG_NM = BC000J11_n226TBM31_CRT_PROG_NM[0] ;
         A229TBM31_UPD_PROG_NM = BC000J11_A229TBM31_UPD_PROG_NM[0] ;
         n229TBM31_UPD_PROG_NM = BC000J11_n229TBM31_UPD_PROG_NM[0] ;
         A217TBM31_STUDY_ID = BC000J11_A217TBM31_STUDY_ID[0] ;
      }
      Gx_mode = sMode18 ;
   }

   public void scanKeyEnd0J18( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0J18( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0J18( )
   {
      /* Before Insert Rules */
      A224TBM31_CRT_DATETIME = GXutil.now( ) ;
      n224TBM31_CRT_DATETIME = false ;
      GXt_char1 = A225TBM31_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm31_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A225TBM31_CRT_USER_ID = GXt_char1 ;
      n225TBM31_CRT_USER_ID = false ;
      A227TBM31_UPD_DATETIME = GXutil.now( ) ;
      n227TBM31_UPD_DATETIME = false ;
      GXt_char1 = A228TBM31_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm31_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A228TBM31_UPD_USER_ID = GXt_char1 ;
      n228TBM31_UPD_USER_ID = false ;
      A230TBM31_UPD_CNT = (long)(O230TBM31_UPD_CNT+1) ;
      n230TBM31_UPD_CNT = false ;
   }

   public void beforeUpdate0J18( )
   {
      /* Before Update Rules */
      A227TBM31_UPD_DATETIME = GXutil.now( ) ;
      n227TBM31_UPD_DATETIME = false ;
      GXt_char1 = A228TBM31_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm31_crf_bc.this.GXt_char1 = GXv_char2[0] ;
      A228TBM31_UPD_USER_ID = GXt_char1 ;
      n228TBM31_UPD_USER_ID = false ;
      A230TBM31_UPD_CNT = (long)(O230TBM31_UPD_CNT+1) ;
      n230TBM31_UPD_CNT = false ;
   }

   public void beforeDelete0J18( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0J18( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0J18( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0J18( )
   {
   }

   public void addRow0J18( )
   {
      VarsToRow18( bcTBM31_CRF) ;
   }

   public void readRow0J18( )
   {
      RowToVars18( bcTBM31_CRF, 1) ;
   }

   public void initializeNonKey0J18( )
   {
      A224TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n224TBM31_CRT_DATETIME = false ;
      A225TBM31_CRT_USER_ID = "" ;
      n225TBM31_CRT_USER_ID = false ;
      A227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n227TBM31_UPD_DATETIME = false ;
      A228TBM31_UPD_USER_ID = "" ;
      n228TBM31_UPD_USER_ID = false ;
      A230TBM31_UPD_CNT = 0 ;
      n230TBM31_UPD_CNT = false ;
      A219TBM31_CRF_NM = "" ;
      n219TBM31_CRF_NM = false ;
      A550TBM31_CRF_SNM = "" ;
      n550TBM31_CRF_SNM = false ;
      A220TBM31_GRID_SIZE = (short)(0) ;
      n220TBM31_GRID_SIZE = false ;
      A221TBM31_ORDER = 0 ;
      n221TBM31_ORDER = false ;
      A405TBM31_DEF_VISIT_NO = (short)(0) ;
      n405TBM31_DEF_VISIT_NO = false ;
      A406TBM31_DEF_DOMAIN_CD = "" ;
      n406TBM31_DEF_DOMAIN_CD = false ;
      A551TBM31_STATUS = "" ;
      n551TBM31_STATUS = false ;
      A222TBM31_NOTE = "" ;
      n222TBM31_NOTE = false ;
      A223TBM31_DEL_FLG = "" ;
      n223TBM31_DEL_FLG = false ;
      A226TBM31_CRT_PROG_NM = "" ;
      n226TBM31_CRT_PROG_NM = false ;
      A229TBM31_UPD_PROG_NM = "" ;
      n229TBM31_UPD_PROG_NM = false ;
      O230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
      n230TBM31_UPD_CNT = false ;
   }

   public void initAll0J18( )
   {
      A217TBM31_STUDY_ID = 0 ;
      A218TBM31_CRF_ID = (short)(0) ;
      initializeNonKey0J18( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow18( SdtTBM31_CRF obj18 )
   {
      obj18.setgxTv_SdtTBM31_CRF_Mode( Gx_mode );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( A224TBM31_CRT_DATETIME );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id( A225TBM31_CRT_USER_ID );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( A227TBM31_UPD_DATETIME );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id( A228TBM31_UPD_USER_ID );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt( A230TBM31_UPD_CNT );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm( A219TBM31_CRF_NM );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm( A550TBM31_CRF_SNM );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_grid_size( A220TBM31_GRID_SIZE );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_order( A221TBM31_ORDER );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( A405TBM31_DEF_VISIT_NO );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd( A406TBM31_DEF_DOMAIN_CD );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_status( A551TBM31_STATUS );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_note( A222TBM31_NOTE );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_del_flg( A223TBM31_DEL_FLG );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( A226TBM31_CRT_PROG_NM );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( A229TBM31_UPD_PROG_NM );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_study_id( A217TBM31_STUDY_ID );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crf_id( A218TBM31_CRF_ID );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_study_id_Z( Z217TBM31_STUDY_ID );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z( Z218TBM31_CRF_ID );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z( Z219TBM31_CRF_NM );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z( Z550TBM31_CRF_SNM );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z( Z220TBM31_GRID_SIZE );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_order_Z( Z221TBM31_ORDER );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z( Z405TBM31_DEF_VISIT_NO );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z( Z406TBM31_DEF_DOMAIN_CD );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_status_Z( Z551TBM31_STATUS );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_note_Z( Z222TBM31_NOTE );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z( Z223TBM31_DEL_FLG );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z( Z224TBM31_CRT_DATETIME );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z( Z225TBM31_CRT_USER_ID );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z( Z226TBM31_CRT_PROG_NM );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z( Z227TBM31_UPD_DATETIME );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z( Z228TBM31_UPD_USER_ID );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z( Z229TBM31_UPD_PROG_NM );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z( Z230TBM31_UPD_CNT );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_N( (byte)((byte)((n219TBM31_CRF_NM)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_N( (byte)((byte)((n550TBM31_CRF_SNM)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_grid_size_N( (byte)((byte)((n220TBM31_GRID_SIZE)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_order_N( (byte)((byte)((n221TBM31_ORDER)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N( (byte)((byte)((n405TBM31_DEF_VISIT_NO)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N( (byte)((byte)((n406TBM31_DEF_DOMAIN_CD)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_status_N( (byte)((byte)((n551TBM31_STATUS)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_note_N( (byte)((byte)((n222TBM31_NOTE)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_del_flg_N( (byte)((byte)((n223TBM31_DEL_FLG)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N( (byte)((byte)((n224TBM31_CRT_DATETIME)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N( (byte)((byte)((n225TBM31_CRT_USER_ID)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N( (byte)((byte)((n226TBM31_CRT_PROG_NM)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N( (byte)((byte)((n227TBM31_UPD_DATETIME)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N( (byte)((byte)((n228TBM31_UPD_USER_ID)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N( (byte)((byte)((n229TBM31_UPD_PROG_NM)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N( (byte)((byte)((n230TBM31_UPD_CNT)?1:0)) );
      obj18.setgxTv_SdtTBM31_CRF_Mode( Gx_mode );
   }

   public void RowToVars18( SdtTBM31_CRF obj18 ,
                            int forceLoad )
   {
      Gx_mode = obj18.getgxTv_SdtTBM31_CRF_Mode() ;
      A224TBM31_CRT_DATETIME = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime() ;
      n224TBM31_CRT_DATETIME = false ;
      A225TBM31_CRT_USER_ID = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id() ;
      n225TBM31_CRT_USER_ID = false ;
      A227TBM31_UPD_DATETIME = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime() ;
      n227TBM31_UPD_DATETIME = false ;
      A228TBM31_UPD_USER_ID = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id() ;
      n228TBM31_UPD_USER_ID = false ;
      A230TBM31_UPD_CNT = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt() ;
      n230TBM31_UPD_CNT = false ;
      A219TBM31_CRF_NM = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm() ;
      n219TBM31_CRF_NM = false ;
      A550TBM31_CRF_SNM = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm() ;
      n550TBM31_CRF_SNM = false ;
      A220TBM31_GRID_SIZE = obj18.getgxTv_SdtTBM31_CRF_Tbm31_grid_size() ;
      n220TBM31_GRID_SIZE = false ;
      A221TBM31_ORDER = obj18.getgxTv_SdtTBM31_CRF_Tbm31_order() ;
      n221TBM31_ORDER = false ;
      A405TBM31_DEF_VISIT_NO = obj18.getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no() ;
      n405TBM31_DEF_VISIT_NO = false ;
      A406TBM31_DEF_DOMAIN_CD = obj18.getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd() ;
      n406TBM31_DEF_DOMAIN_CD = false ;
      A551TBM31_STATUS = obj18.getgxTv_SdtTBM31_CRF_Tbm31_status() ;
      n551TBM31_STATUS = false ;
      A222TBM31_NOTE = obj18.getgxTv_SdtTBM31_CRF_Tbm31_note() ;
      n222TBM31_NOTE = false ;
      A223TBM31_DEL_FLG = obj18.getgxTv_SdtTBM31_CRF_Tbm31_del_flg() ;
      n223TBM31_DEL_FLG = false ;
      A226TBM31_CRT_PROG_NM = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm() ;
      n226TBM31_CRT_PROG_NM = false ;
      A229TBM31_UPD_PROG_NM = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm() ;
      n229TBM31_UPD_PROG_NM = false ;
      A217TBM31_STUDY_ID = obj18.getgxTv_SdtTBM31_CRF_Tbm31_study_id() ;
      A218TBM31_CRF_ID = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crf_id() ;
      Z217TBM31_STUDY_ID = obj18.getgxTv_SdtTBM31_CRF_Tbm31_study_id_Z() ;
      Z218TBM31_CRF_ID = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z() ;
      Z219TBM31_CRF_NM = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z() ;
      Z550TBM31_CRF_SNM = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z() ;
      Z220TBM31_GRID_SIZE = obj18.getgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z() ;
      Z221TBM31_ORDER = obj18.getgxTv_SdtTBM31_CRF_Tbm31_order_Z() ;
      Z405TBM31_DEF_VISIT_NO = obj18.getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z() ;
      Z406TBM31_DEF_DOMAIN_CD = obj18.getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z() ;
      Z551TBM31_STATUS = obj18.getgxTv_SdtTBM31_CRF_Tbm31_status_Z() ;
      Z222TBM31_NOTE = obj18.getgxTv_SdtTBM31_CRF_Tbm31_note_Z() ;
      Z223TBM31_DEL_FLG = obj18.getgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z() ;
      Z224TBM31_CRT_DATETIME = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z() ;
      Z225TBM31_CRT_USER_ID = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z() ;
      Z226TBM31_CRT_PROG_NM = obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z() ;
      Z227TBM31_UPD_DATETIME = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z() ;
      Z228TBM31_UPD_USER_ID = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z() ;
      Z229TBM31_UPD_PROG_NM = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z() ;
      Z230TBM31_UPD_CNT = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z() ;
      O230TBM31_UPD_CNT = obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z() ;
      n219TBM31_CRF_NM = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_N()==0)?false:true) ;
      n550TBM31_CRF_SNM = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_N()==0)?false:true) ;
      n220TBM31_GRID_SIZE = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_grid_size_N()==0)?false:true) ;
      n221TBM31_ORDER = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_order_N()==0)?false:true) ;
      n405TBM31_DEF_VISIT_NO = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N()==0)?false:true) ;
      n406TBM31_DEF_DOMAIN_CD = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N()==0)?false:true) ;
      n551TBM31_STATUS = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_status_N()==0)?false:true) ;
      n222TBM31_NOTE = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_note_N()==0)?false:true) ;
      n223TBM31_DEL_FLG = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_del_flg_N()==0)?false:true) ;
      n224TBM31_CRT_DATETIME = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N()==0)?false:true) ;
      n225TBM31_CRT_USER_ID = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N()==0)?false:true) ;
      n226TBM31_CRT_PROG_NM = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N()==0)?false:true) ;
      n227TBM31_UPD_DATETIME = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N()==0)?false:true) ;
      n228TBM31_UPD_USER_ID = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N()==0)?false:true) ;
      n229TBM31_UPD_PROG_NM = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N()==0)?false:true) ;
      n230TBM31_UPD_CNT = (boolean)((obj18.getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj18.getgxTv_SdtTBM31_CRF_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A217TBM31_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A218TBM31_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0J18( ) ;
      scanKeyStart0J18( ) ;
      if ( RcdFound18 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000J12 */
         pr_default.execute(10, new Object[] {new Long(A217TBM31_STUDY_ID)});
         if ( (pr_default.getStatus(10) == 101) )
         {
            AnyError217 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CRFマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
            AnyError = (short)(1) ;
         }
         if ( AnyError217 == 0 )
         {
         }
         pr_default.close(10);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z217TBM31_STUDY_ID = A217TBM31_STUDY_ID ;
         Z218TBM31_CRF_ID = A218TBM31_CRF_ID ;
         O230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
         n230TBM31_UPD_CNT = false ;
      }
      zm0J18( -8) ;
      sMode18 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0J18( ) ;
      Gx_mode = sMode18 ;
      addRow0J18( ) ;
      scanKeyEnd0J18( ) ;
      if ( RcdFound18 == 0 )
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
      RowToVars18( bcTBM31_CRF, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0J18( ) ;
      if ( RcdFound18 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A217TBM31_STUDY_ID != Z217TBM31_STUDY_ID ) || ( A218TBM31_CRF_ID != Z218TBM31_CRF_ID ) )
         {
            A217TBM31_STUDY_ID = Z217TBM31_STUDY_ID ;
            A218TBM31_CRF_ID = Z218TBM31_CRF_ID ;
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
            update0J18( ) ;
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
            if ( ( A217TBM31_STUDY_ID != Z217TBM31_STUDY_ID ) || ( A218TBM31_CRF_ID != Z218TBM31_CRF_ID ) )
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
                  insert0J18( ) ;
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
                  insert0J18( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow18( bcTBM31_CRF) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars18( bcTBM31_CRF, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0J18( ) ;
      if ( RcdFound18 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A217TBM31_STUDY_ID != Z217TBM31_STUDY_ID ) || ( A218TBM31_CRF_ID != Z218TBM31_CRF_ID ) )
         {
            A217TBM31_STUDY_ID = Z217TBM31_STUDY_ID ;
            A218TBM31_CRF_ID = Z218TBM31_CRF_ID ;
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
         if ( ( A217TBM31_STUDY_ID != Z217TBM31_STUDY_ID ) || ( A218TBM31_CRF_ID != Z218TBM31_CRF_ID ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm31_crf_bc");
      VarsToRow18( bcTBM31_CRF) ;
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
      Gx_mode = bcTBM31_CRF.getgxTv_SdtTBM31_CRF_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM31_CRF.setgxTv_SdtTBM31_CRF_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM31_CRF sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM31_CRF )
      {
         bcTBM31_CRF = sdt ;
         if ( GXutil.strcmp(bcTBM31_CRF.getgxTv_SdtTBM31_CRF_Mode(), "") == 0 )
         {
            bcTBM31_CRF.setgxTv_SdtTBM31_CRF_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow18( bcTBM31_CRF) ;
         }
         else
         {
            RowToVars18( bcTBM31_CRF, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM31_CRF.getgxTv_SdtTBM31_CRF_Mode(), "") == 0 )
         {
            bcTBM31_CRF.setgxTv_SdtTBM31_CRF_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars18( bcTBM31_CRF, 1) ;
   }

   public SdtTBM31_CRF getTBM31_CRF_BC( )
   {
      return bcTBM31_CRF ;
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
                  /* Execute user subroutine: S1171 */
                  S1171 ();
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
      AV7W_TXT = "" ;
      A219TBM31_CRF_NM = "" ;
      A550TBM31_CRF_SNM = "" ;
      A406TBM31_DEF_DOMAIN_CD = "" ;
      A551TBM31_STATUS = "" ;
      A222TBM31_NOTE = "" ;
      A223TBM31_DEL_FLG = "" ;
      A224TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A225TBM31_CRT_USER_ID = "" ;
      A226TBM31_CRT_PROG_NM = "" ;
      A227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A228TBM31_UPD_USER_ID = "" ;
      A229TBM31_UPD_PROG_NM = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_status_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_note_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z = "" ;
      Z224TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z225TBM31_CRT_USER_ID = "" ;
      Z227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z228TBM31_UPD_USER_ID = "" ;
      Z219TBM31_CRF_NM = "" ;
      Z550TBM31_CRF_SNM = "" ;
      Z406TBM31_DEF_DOMAIN_CD = "" ;
      Z551TBM31_STATUS = "" ;
      Z222TBM31_NOTE = "" ;
      Z223TBM31_DEL_FLG = "" ;
      Z226TBM31_CRT_PROG_NM = "" ;
      Z229TBM31_UPD_PROG_NM = "" ;
      BC000J5_A218TBM31_CRF_ID = new short[1] ;
      BC000J5_A224TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000J5_n224TBM31_CRT_DATETIME = new boolean[] {false} ;
      BC000J5_A225TBM31_CRT_USER_ID = new String[] {""} ;
      BC000J5_n225TBM31_CRT_USER_ID = new boolean[] {false} ;
      BC000J5_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000J5_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      BC000J5_A228TBM31_UPD_USER_ID = new String[] {""} ;
      BC000J5_n228TBM31_UPD_USER_ID = new boolean[] {false} ;
      BC000J5_A230TBM31_UPD_CNT = new long[1] ;
      BC000J5_n230TBM31_UPD_CNT = new boolean[] {false} ;
      BC000J5_A219TBM31_CRF_NM = new String[] {""} ;
      BC000J5_n219TBM31_CRF_NM = new boolean[] {false} ;
      BC000J5_A550TBM31_CRF_SNM = new String[] {""} ;
      BC000J5_n550TBM31_CRF_SNM = new boolean[] {false} ;
      BC000J5_A220TBM31_GRID_SIZE = new short[1] ;
      BC000J5_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      BC000J5_A221TBM31_ORDER = new int[1] ;
      BC000J5_n221TBM31_ORDER = new boolean[] {false} ;
      BC000J5_A405TBM31_DEF_VISIT_NO = new short[1] ;
      BC000J5_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      BC000J5_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      BC000J5_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      BC000J5_A551TBM31_STATUS = new String[] {""} ;
      BC000J5_n551TBM31_STATUS = new boolean[] {false} ;
      BC000J5_A222TBM31_NOTE = new String[] {""} ;
      BC000J5_n222TBM31_NOTE = new boolean[] {false} ;
      BC000J5_A223TBM31_DEL_FLG = new String[] {""} ;
      BC000J5_n223TBM31_DEL_FLG = new boolean[] {false} ;
      BC000J5_A226TBM31_CRT_PROG_NM = new String[] {""} ;
      BC000J5_n226TBM31_CRT_PROG_NM = new boolean[] {false} ;
      BC000J5_A229TBM31_UPD_PROG_NM = new String[] {""} ;
      BC000J5_n229TBM31_UPD_PROG_NM = new boolean[] {false} ;
      BC000J5_A217TBM31_STUDY_ID = new long[1] ;
      BC000J4_A217TBM31_STUDY_ID = new long[1] ;
      BC000J6_A217TBM31_STUDY_ID = new long[1] ;
      BC000J6_A218TBM31_CRF_ID = new short[1] ;
      BC000J3_A218TBM31_CRF_ID = new short[1] ;
      BC000J3_A224TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000J3_n224TBM31_CRT_DATETIME = new boolean[] {false} ;
      BC000J3_A225TBM31_CRT_USER_ID = new String[] {""} ;
      BC000J3_n225TBM31_CRT_USER_ID = new boolean[] {false} ;
      BC000J3_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000J3_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      BC000J3_A228TBM31_UPD_USER_ID = new String[] {""} ;
      BC000J3_n228TBM31_UPD_USER_ID = new boolean[] {false} ;
      BC000J3_A230TBM31_UPD_CNT = new long[1] ;
      BC000J3_n230TBM31_UPD_CNT = new boolean[] {false} ;
      BC000J3_A219TBM31_CRF_NM = new String[] {""} ;
      BC000J3_n219TBM31_CRF_NM = new boolean[] {false} ;
      BC000J3_A550TBM31_CRF_SNM = new String[] {""} ;
      BC000J3_n550TBM31_CRF_SNM = new boolean[] {false} ;
      BC000J3_A220TBM31_GRID_SIZE = new short[1] ;
      BC000J3_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      BC000J3_A221TBM31_ORDER = new int[1] ;
      BC000J3_n221TBM31_ORDER = new boolean[] {false} ;
      BC000J3_A405TBM31_DEF_VISIT_NO = new short[1] ;
      BC000J3_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      BC000J3_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      BC000J3_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      BC000J3_A551TBM31_STATUS = new String[] {""} ;
      BC000J3_n551TBM31_STATUS = new boolean[] {false} ;
      BC000J3_A222TBM31_NOTE = new String[] {""} ;
      BC000J3_n222TBM31_NOTE = new boolean[] {false} ;
      BC000J3_A223TBM31_DEL_FLG = new String[] {""} ;
      BC000J3_n223TBM31_DEL_FLG = new boolean[] {false} ;
      BC000J3_A226TBM31_CRT_PROG_NM = new String[] {""} ;
      BC000J3_n226TBM31_CRT_PROG_NM = new boolean[] {false} ;
      BC000J3_A229TBM31_UPD_PROG_NM = new String[] {""} ;
      BC000J3_n229TBM31_UPD_PROG_NM = new boolean[] {false} ;
      BC000J3_A217TBM31_STUDY_ID = new long[1] ;
      sMode18 = "" ;
      BC000J2_A218TBM31_CRF_ID = new short[1] ;
      BC000J2_A224TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000J2_n224TBM31_CRT_DATETIME = new boolean[] {false} ;
      BC000J2_A225TBM31_CRT_USER_ID = new String[] {""} ;
      BC000J2_n225TBM31_CRT_USER_ID = new boolean[] {false} ;
      BC000J2_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000J2_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      BC000J2_A228TBM31_UPD_USER_ID = new String[] {""} ;
      BC000J2_n228TBM31_UPD_USER_ID = new boolean[] {false} ;
      BC000J2_A230TBM31_UPD_CNT = new long[1] ;
      BC000J2_n230TBM31_UPD_CNT = new boolean[] {false} ;
      BC000J2_A219TBM31_CRF_NM = new String[] {""} ;
      BC000J2_n219TBM31_CRF_NM = new boolean[] {false} ;
      BC000J2_A550TBM31_CRF_SNM = new String[] {""} ;
      BC000J2_n550TBM31_CRF_SNM = new boolean[] {false} ;
      BC000J2_A220TBM31_GRID_SIZE = new short[1] ;
      BC000J2_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      BC000J2_A221TBM31_ORDER = new int[1] ;
      BC000J2_n221TBM31_ORDER = new boolean[] {false} ;
      BC000J2_A405TBM31_DEF_VISIT_NO = new short[1] ;
      BC000J2_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      BC000J2_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      BC000J2_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      BC000J2_A551TBM31_STATUS = new String[] {""} ;
      BC000J2_n551TBM31_STATUS = new boolean[] {false} ;
      BC000J2_A222TBM31_NOTE = new String[] {""} ;
      BC000J2_n222TBM31_NOTE = new boolean[] {false} ;
      BC000J2_A223TBM31_DEL_FLG = new String[] {""} ;
      BC000J2_n223TBM31_DEL_FLG = new boolean[] {false} ;
      BC000J2_A226TBM31_CRT_PROG_NM = new String[] {""} ;
      BC000J2_n226TBM31_CRT_PROG_NM = new boolean[] {false} ;
      BC000J2_A229TBM31_UPD_PROG_NM = new String[] {""} ;
      BC000J2_n229TBM31_UPD_PROG_NM = new boolean[] {false} ;
      BC000J2_A217TBM31_STUDY_ID = new long[1] ;
      BC000J10_A625TBW03_SESSION_ID = new String[] {""} ;
      BC000J10_A626TBW03_APP_ID = new String[] {""} ;
      BC000J10_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC000J10_A628TBW03_STUDY_ID = new long[1] ;
      BC000J10_A629TBW03_SUBJECT_ID = new int[1] ;
      BC000J10_A630TBW03_CRF_ID = new short[1] ;
      BC000J11_A218TBM31_CRF_ID = new short[1] ;
      BC000J11_A224TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000J11_n224TBM31_CRT_DATETIME = new boolean[] {false} ;
      BC000J11_A225TBM31_CRT_USER_ID = new String[] {""} ;
      BC000J11_n225TBM31_CRT_USER_ID = new boolean[] {false} ;
      BC000J11_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000J11_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      BC000J11_A228TBM31_UPD_USER_ID = new String[] {""} ;
      BC000J11_n228TBM31_UPD_USER_ID = new boolean[] {false} ;
      BC000J11_A230TBM31_UPD_CNT = new long[1] ;
      BC000J11_n230TBM31_UPD_CNT = new boolean[] {false} ;
      BC000J11_A219TBM31_CRF_NM = new String[] {""} ;
      BC000J11_n219TBM31_CRF_NM = new boolean[] {false} ;
      BC000J11_A550TBM31_CRF_SNM = new String[] {""} ;
      BC000J11_n550TBM31_CRF_SNM = new boolean[] {false} ;
      BC000J11_A220TBM31_GRID_SIZE = new short[1] ;
      BC000J11_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      BC000J11_A221TBM31_ORDER = new int[1] ;
      BC000J11_n221TBM31_ORDER = new boolean[] {false} ;
      BC000J11_A405TBM31_DEF_VISIT_NO = new short[1] ;
      BC000J11_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      BC000J11_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      BC000J11_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      BC000J11_A551TBM31_STATUS = new String[] {""} ;
      BC000J11_n551TBM31_STATUS = new boolean[] {false} ;
      BC000J11_A222TBM31_NOTE = new String[] {""} ;
      BC000J11_n222TBM31_NOTE = new boolean[] {false} ;
      BC000J11_A223TBM31_DEL_FLG = new String[] {""} ;
      BC000J11_n223TBM31_DEL_FLG = new boolean[] {false} ;
      BC000J11_A226TBM31_CRT_PROG_NM = new String[] {""} ;
      BC000J11_n226TBM31_CRT_PROG_NM = new boolean[] {false} ;
      BC000J11_A229TBM31_UPD_PROG_NM = new String[] {""} ;
      BC000J11_n229TBM31_UPD_PROG_NM = new boolean[] {false} ;
      BC000J11_A217TBM31_STUDY_ID = new long[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000J12_A217TBM31_STUDY_ID = new long[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm31_crf_bc__default(),
         new Object[] {
             new Object[] {
            BC000J2_A218TBM31_CRF_ID, BC000J2_A224TBM31_CRT_DATETIME, BC000J2_n224TBM31_CRT_DATETIME, BC000J2_A225TBM31_CRT_USER_ID, BC000J2_n225TBM31_CRT_USER_ID, BC000J2_A227TBM31_UPD_DATETIME, BC000J2_n227TBM31_UPD_DATETIME, BC000J2_A228TBM31_UPD_USER_ID, BC000J2_n228TBM31_UPD_USER_ID, BC000J2_A230TBM31_UPD_CNT,
            BC000J2_n230TBM31_UPD_CNT, BC000J2_A219TBM31_CRF_NM, BC000J2_n219TBM31_CRF_NM, BC000J2_A550TBM31_CRF_SNM, BC000J2_n550TBM31_CRF_SNM, BC000J2_A220TBM31_GRID_SIZE, BC000J2_n220TBM31_GRID_SIZE, BC000J2_A221TBM31_ORDER, BC000J2_n221TBM31_ORDER, BC000J2_A405TBM31_DEF_VISIT_NO,
            BC000J2_n405TBM31_DEF_VISIT_NO, BC000J2_A406TBM31_DEF_DOMAIN_CD, BC000J2_n406TBM31_DEF_DOMAIN_CD, BC000J2_A551TBM31_STATUS, BC000J2_n551TBM31_STATUS, BC000J2_A222TBM31_NOTE, BC000J2_n222TBM31_NOTE, BC000J2_A223TBM31_DEL_FLG, BC000J2_n223TBM31_DEL_FLG, BC000J2_A226TBM31_CRT_PROG_NM,
            BC000J2_n226TBM31_CRT_PROG_NM, BC000J2_A229TBM31_UPD_PROG_NM, BC000J2_n229TBM31_UPD_PROG_NM, BC000J2_A217TBM31_STUDY_ID
            }
            , new Object[] {
            BC000J3_A218TBM31_CRF_ID, BC000J3_A224TBM31_CRT_DATETIME, BC000J3_n224TBM31_CRT_DATETIME, BC000J3_A225TBM31_CRT_USER_ID, BC000J3_n225TBM31_CRT_USER_ID, BC000J3_A227TBM31_UPD_DATETIME, BC000J3_n227TBM31_UPD_DATETIME, BC000J3_A228TBM31_UPD_USER_ID, BC000J3_n228TBM31_UPD_USER_ID, BC000J3_A230TBM31_UPD_CNT,
            BC000J3_n230TBM31_UPD_CNT, BC000J3_A219TBM31_CRF_NM, BC000J3_n219TBM31_CRF_NM, BC000J3_A550TBM31_CRF_SNM, BC000J3_n550TBM31_CRF_SNM, BC000J3_A220TBM31_GRID_SIZE, BC000J3_n220TBM31_GRID_SIZE, BC000J3_A221TBM31_ORDER, BC000J3_n221TBM31_ORDER, BC000J3_A405TBM31_DEF_VISIT_NO,
            BC000J3_n405TBM31_DEF_VISIT_NO, BC000J3_A406TBM31_DEF_DOMAIN_CD, BC000J3_n406TBM31_DEF_DOMAIN_CD, BC000J3_A551TBM31_STATUS, BC000J3_n551TBM31_STATUS, BC000J3_A222TBM31_NOTE, BC000J3_n222TBM31_NOTE, BC000J3_A223TBM31_DEL_FLG, BC000J3_n223TBM31_DEL_FLG, BC000J3_A226TBM31_CRT_PROG_NM,
            BC000J3_n226TBM31_CRT_PROG_NM, BC000J3_A229TBM31_UPD_PROG_NM, BC000J3_n229TBM31_UPD_PROG_NM, BC000J3_A217TBM31_STUDY_ID
            }
            , new Object[] {
            BC000J4_A217TBM31_STUDY_ID
            }
            , new Object[] {
            BC000J5_A218TBM31_CRF_ID, BC000J5_A224TBM31_CRT_DATETIME, BC000J5_n224TBM31_CRT_DATETIME, BC000J5_A225TBM31_CRT_USER_ID, BC000J5_n225TBM31_CRT_USER_ID, BC000J5_A227TBM31_UPD_DATETIME, BC000J5_n227TBM31_UPD_DATETIME, BC000J5_A228TBM31_UPD_USER_ID, BC000J5_n228TBM31_UPD_USER_ID, BC000J5_A230TBM31_UPD_CNT,
            BC000J5_n230TBM31_UPD_CNT, BC000J5_A219TBM31_CRF_NM, BC000J5_n219TBM31_CRF_NM, BC000J5_A550TBM31_CRF_SNM, BC000J5_n550TBM31_CRF_SNM, BC000J5_A220TBM31_GRID_SIZE, BC000J5_n220TBM31_GRID_SIZE, BC000J5_A221TBM31_ORDER, BC000J5_n221TBM31_ORDER, BC000J5_A405TBM31_DEF_VISIT_NO,
            BC000J5_n405TBM31_DEF_VISIT_NO, BC000J5_A406TBM31_DEF_DOMAIN_CD, BC000J5_n406TBM31_DEF_DOMAIN_CD, BC000J5_A551TBM31_STATUS, BC000J5_n551TBM31_STATUS, BC000J5_A222TBM31_NOTE, BC000J5_n222TBM31_NOTE, BC000J5_A223TBM31_DEL_FLG, BC000J5_n223TBM31_DEL_FLG, BC000J5_A226TBM31_CRT_PROG_NM,
            BC000J5_n226TBM31_CRT_PROG_NM, BC000J5_A229TBM31_UPD_PROG_NM, BC000J5_n229TBM31_UPD_PROG_NM, BC000J5_A217TBM31_STUDY_ID
            }
            , new Object[] {
            BC000J6_A217TBM31_STUDY_ID, BC000J6_A218TBM31_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000J10_A625TBW03_SESSION_ID, BC000J10_A626TBW03_APP_ID, BC000J10_A627TBW03_DISP_DATETIME, BC000J10_A628TBW03_STUDY_ID, BC000J10_A629TBW03_SUBJECT_ID, BC000J10_A630TBW03_CRF_ID
            }
            , new Object[] {
            BC000J11_A218TBM31_CRF_ID, BC000J11_A224TBM31_CRT_DATETIME, BC000J11_n224TBM31_CRT_DATETIME, BC000J11_A225TBM31_CRT_USER_ID, BC000J11_n225TBM31_CRT_USER_ID, BC000J11_A227TBM31_UPD_DATETIME, BC000J11_n227TBM31_UPD_DATETIME, BC000J11_A228TBM31_UPD_USER_ID, BC000J11_n228TBM31_UPD_USER_ID, BC000J11_A230TBM31_UPD_CNT,
            BC000J11_n230TBM31_UPD_CNT, BC000J11_A219TBM31_CRF_NM, BC000J11_n219TBM31_CRF_NM, BC000J11_A550TBM31_CRF_SNM, BC000J11_n550TBM31_CRF_SNM, BC000J11_A220TBM31_GRID_SIZE, BC000J11_n220TBM31_GRID_SIZE, BC000J11_A221TBM31_ORDER, BC000J11_n221TBM31_ORDER, BC000J11_A405TBM31_DEF_VISIT_NO,
            BC000J11_n405TBM31_DEF_VISIT_NO, BC000J11_A406TBM31_DEF_DOMAIN_CD, BC000J11_n406TBM31_DEF_DOMAIN_CD, BC000J11_A551TBM31_STATUS, BC000J11_n551TBM31_STATUS, BC000J11_A222TBM31_NOTE, BC000J11_n222TBM31_NOTE, BC000J11_A223TBM31_DEL_FLG, BC000J11_n223TBM31_DEL_FLG, BC000J11_A226TBM31_CRT_PROG_NM,
            BC000J11_n226TBM31_CRT_PROG_NM, BC000J11_A229TBM31_UPD_PROG_NM, BC000J11_n229TBM31_UPD_PROG_NM, BC000J11_A217TBM31_STUDY_ID
            }
            , new Object[] {
            BC000J12_A217TBM31_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM31_CRF_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110J2 */
      e110J2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_grid_size_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_order_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_status_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_note_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_del_flg_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z218TBM31_CRF_ID ;
   private short A218TBM31_CRF_ID ;
   private short A220TBM31_GRID_SIZE ;
   private short A405TBM31_DEF_VISIT_NO ;
   private short gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z ;
   private short gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z ;
   private short gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z ;
   private short Z220TBM31_GRID_SIZE ;
   private short Z405TBM31_DEF_VISIT_NO ;
   private short RcdFound18 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A221TBM31_ORDER ;
   private int gxTv_SdtTBM31_CRF_Tbm31_order_Z ;
   private int GX_JID ;
   private int Z221TBM31_ORDER ;
   private int AnyError217 ;
   private int GXActiveErrHndl ;
   private long Z217TBM31_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long A230TBM31_UPD_CNT ;
   private long gxTv_SdtTBM31_CRF_Tbm31_study_id_Z ;
   private long gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z ;
   private long Z230TBM31_UPD_CNT ;
   private long O230TBM31_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode18 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A224TBM31_CRT_DATETIME ;
   private java.util.Date A227TBM31_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z ;
   private java.util.Date Z224TBM31_CRT_DATETIME ;
   private java.util.Date Z227TBM31_UPD_DATETIME ;
   private boolean n224TBM31_CRT_DATETIME ;
   private boolean n225TBM31_CRT_USER_ID ;
   private boolean n227TBM31_UPD_DATETIME ;
   private boolean n228TBM31_UPD_USER_ID ;
   private boolean n230TBM31_UPD_CNT ;
   private boolean n219TBM31_CRF_NM ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n220TBM31_GRID_SIZE ;
   private boolean n221TBM31_ORDER ;
   private boolean n405TBM31_DEF_VISIT_NO ;
   private boolean n406TBM31_DEF_DOMAIN_CD ;
   private boolean n551TBM31_STATUS ;
   private boolean n222TBM31_NOTE ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n226TBM31_CRT_PROG_NM ;
   private boolean n229TBM31_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A219TBM31_CRF_NM ;
   private String A550TBM31_CRF_SNM ;
   private String A406TBM31_DEF_DOMAIN_CD ;
   private String A551TBM31_STATUS ;
   private String A222TBM31_NOTE ;
   private String A223TBM31_DEL_FLG ;
   private String A225TBM31_CRT_USER_ID ;
   private String A226TBM31_CRT_PROG_NM ;
   private String A228TBM31_UPD_USER_ID ;
   private String A229TBM31_UPD_PROG_NM ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_status_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_note_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z ;
   private String Z225TBM31_CRT_USER_ID ;
   private String Z228TBM31_UPD_USER_ID ;
   private String Z219TBM31_CRF_NM ;
   private String Z550TBM31_CRF_SNM ;
   private String Z406TBM31_DEF_DOMAIN_CD ;
   private String Z551TBM31_STATUS ;
   private String Z222TBM31_NOTE ;
   private String Z223TBM31_DEL_FLG ;
   private String Z226TBM31_CRT_PROG_NM ;
   private String Z229TBM31_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM31_CRF bcTBM31_CRF ;
   private IDataStoreProvider pr_default ;
   private short[] BC000J5_A218TBM31_CRF_ID ;
   private java.util.Date[] BC000J5_A224TBM31_CRT_DATETIME ;
   private boolean[] BC000J5_n224TBM31_CRT_DATETIME ;
   private String[] BC000J5_A225TBM31_CRT_USER_ID ;
   private boolean[] BC000J5_n225TBM31_CRT_USER_ID ;
   private java.util.Date[] BC000J5_A227TBM31_UPD_DATETIME ;
   private boolean[] BC000J5_n227TBM31_UPD_DATETIME ;
   private String[] BC000J5_A228TBM31_UPD_USER_ID ;
   private boolean[] BC000J5_n228TBM31_UPD_USER_ID ;
   private long[] BC000J5_A230TBM31_UPD_CNT ;
   private boolean[] BC000J5_n230TBM31_UPD_CNT ;
   private String[] BC000J5_A219TBM31_CRF_NM ;
   private boolean[] BC000J5_n219TBM31_CRF_NM ;
   private String[] BC000J5_A550TBM31_CRF_SNM ;
   private boolean[] BC000J5_n550TBM31_CRF_SNM ;
   private short[] BC000J5_A220TBM31_GRID_SIZE ;
   private boolean[] BC000J5_n220TBM31_GRID_SIZE ;
   private int[] BC000J5_A221TBM31_ORDER ;
   private boolean[] BC000J5_n221TBM31_ORDER ;
   private short[] BC000J5_A405TBM31_DEF_VISIT_NO ;
   private boolean[] BC000J5_n405TBM31_DEF_VISIT_NO ;
   private String[] BC000J5_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] BC000J5_n406TBM31_DEF_DOMAIN_CD ;
   private String[] BC000J5_A551TBM31_STATUS ;
   private boolean[] BC000J5_n551TBM31_STATUS ;
   private String[] BC000J5_A222TBM31_NOTE ;
   private boolean[] BC000J5_n222TBM31_NOTE ;
   private String[] BC000J5_A223TBM31_DEL_FLG ;
   private boolean[] BC000J5_n223TBM31_DEL_FLG ;
   private String[] BC000J5_A226TBM31_CRT_PROG_NM ;
   private boolean[] BC000J5_n226TBM31_CRT_PROG_NM ;
   private String[] BC000J5_A229TBM31_UPD_PROG_NM ;
   private boolean[] BC000J5_n229TBM31_UPD_PROG_NM ;
   private long[] BC000J5_A217TBM31_STUDY_ID ;
   private long[] BC000J4_A217TBM31_STUDY_ID ;
   private long[] BC000J6_A217TBM31_STUDY_ID ;
   private short[] BC000J6_A218TBM31_CRF_ID ;
   private short[] BC000J3_A218TBM31_CRF_ID ;
   private java.util.Date[] BC000J3_A224TBM31_CRT_DATETIME ;
   private boolean[] BC000J3_n224TBM31_CRT_DATETIME ;
   private String[] BC000J3_A225TBM31_CRT_USER_ID ;
   private boolean[] BC000J3_n225TBM31_CRT_USER_ID ;
   private java.util.Date[] BC000J3_A227TBM31_UPD_DATETIME ;
   private boolean[] BC000J3_n227TBM31_UPD_DATETIME ;
   private String[] BC000J3_A228TBM31_UPD_USER_ID ;
   private boolean[] BC000J3_n228TBM31_UPD_USER_ID ;
   private long[] BC000J3_A230TBM31_UPD_CNT ;
   private boolean[] BC000J3_n230TBM31_UPD_CNT ;
   private String[] BC000J3_A219TBM31_CRF_NM ;
   private boolean[] BC000J3_n219TBM31_CRF_NM ;
   private String[] BC000J3_A550TBM31_CRF_SNM ;
   private boolean[] BC000J3_n550TBM31_CRF_SNM ;
   private short[] BC000J3_A220TBM31_GRID_SIZE ;
   private boolean[] BC000J3_n220TBM31_GRID_SIZE ;
   private int[] BC000J3_A221TBM31_ORDER ;
   private boolean[] BC000J3_n221TBM31_ORDER ;
   private short[] BC000J3_A405TBM31_DEF_VISIT_NO ;
   private boolean[] BC000J3_n405TBM31_DEF_VISIT_NO ;
   private String[] BC000J3_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] BC000J3_n406TBM31_DEF_DOMAIN_CD ;
   private String[] BC000J3_A551TBM31_STATUS ;
   private boolean[] BC000J3_n551TBM31_STATUS ;
   private String[] BC000J3_A222TBM31_NOTE ;
   private boolean[] BC000J3_n222TBM31_NOTE ;
   private String[] BC000J3_A223TBM31_DEL_FLG ;
   private boolean[] BC000J3_n223TBM31_DEL_FLG ;
   private String[] BC000J3_A226TBM31_CRT_PROG_NM ;
   private boolean[] BC000J3_n226TBM31_CRT_PROG_NM ;
   private String[] BC000J3_A229TBM31_UPD_PROG_NM ;
   private boolean[] BC000J3_n229TBM31_UPD_PROG_NM ;
   private long[] BC000J3_A217TBM31_STUDY_ID ;
   private short[] BC000J2_A218TBM31_CRF_ID ;
   private java.util.Date[] BC000J2_A224TBM31_CRT_DATETIME ;
   private boolean[] BC000J2_n224TBM31_CRT_DATETIME ;
   private String[] BC000J2_A225TBM31_CRT_USER_ID ;
   private boolean[] BC000J2_n225TBM31_CRT_USER_ID ;
   private java.util.Date[] BC000J2_A227TBM31_UPD_DATETIME ;
   private boolean[] BC000J2_n227TBM31_UPD_DATETIME ;
   private String[] BC000J2_A228TBM31_UPD_USER_ID ;
   private boolean[] BC000J2_n228TBM31_UPD_USER_ID ;
   private long[] BC000J2_A230TBM31_UPD_CNT ;
   private boolean[] BC000J2_n230TBM31_UPD_CNT ;
   private String[] BC000J2_A219TBM31_CRF_NM ;
   private boolean[] BC000J2_n219TBM31_CRF_NM ;
   private String[] BC000J2_A550TBM31_CRF_SNM ;
   private boolean[] BC000J2_n550TBM31_CRF_SNM ;
   private short[] BC000J2_A220TBM31_GRID_SIZE ;
   private boolean[] BC000J2_n220TBM31_GRID_SIZE ;
   private int[] BC000J2_A221TBM31_ORDER ;
   private boolean[] BC000J2_n221TBM31_ORDER ;
   private short[] BC000J2_A405TBM31_DEF_VISIT_NO ;
   private boolean[] BC000J2_n405TBM31_DEF_VISIT_NO ;
   private String[] BC000J2_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] BC000J2_n406TBM31_DEF_DOMAIN_CD ;
   private String[] BC000J2_A551TBM31_STATUS ;
   private boolean[] BC000J2_n551TBM31_STATUS ;
   private String[] BC000J2_A222TBM31_NOTE ;
   private boolean[] BC000J2_n222TBM31_NOTE ;
   private String[] BC000J2_A223TBM31_DEL_FLG ;
   private boolean[] BC000J2_n223TBM31_DEL_FLG ;
   private String[] BC000J2_A226TBM31_CRT_PROG_NM ;
   private boolean[] BC000J2_n226TBM31_CRT_PROG_NM ;
   private String[] BC000J2_A229TBM31_UPD_PROG_NM ;
   private boolean[] BC000J2_n229TBM31_UPD_PROG_NM ;
   private long[] BC000J2_A217TBM31_STUDY_ID ;
   private String[] BC000J10_A625TBW03_SESSION_ID ;
   private String[] BC000J10_A626TBW03_APP_ID ;
   private String[] BC000J10_A627TBW03_DISP_DATETIME ;
   private long[] BC000J10_A628TBW03_STUDY_ID ;
   private int[] BC000J10_A629TBW03_SUBJECT_ID ;
   private short[] BC000J10_A630TBW03_CRF_ID ;
   private short[] BC000J11_A218TBM31_CRF_ID ;
   private java.util.Date[] BC000J11_A224TBM31_CRT_DATETIME ;
   private boolean[] BC000J11_n224TBM31_CRT_DATETIME ;
   private String[] BC000J11_A225TBM31_CRT_USER_ID ;
   private boolean[] BC000J11_n225TBM31_CRT_USER_ID ;
   private java.util.Date[] BC000J11_A227TBM31_UPD_DATETIME ;
   private boolean[] BC000J11_n227TBM31_UPD_DATETIME ;
   private String[] BC000J11_A228TBM31_UPD_USER_ID ;
   private boolean[] BC000J11_n228TBM31_UPD_USER_ID ;
   private long[] BC000J11_A230TBM31_UPD_CNT ;
   private boolean[] BC000J11_n230TBM31_UPD_CNT ;
   private String[] BC000J11_A219TBM31_CRF_NM ;
   private boolean[] BC000J11_n219TBM31_CRF_NM ;
   private String[] BC000J11_A550TBM31_CRF_SNM ;
   private boolean[] BC000J11_n550TBM31_CRF_SNM ;
   private short[] BC000J11_A220TBM31_GRID_SIZE ;
   private boolean[] BC000J11_n220TBM31_GRID_SIZE ;
   private int[] BC000J11_A221TBM31_ORDER ;
   private boolean[] BC000J11_n221TBM31_ORDER ;
   private short[] BC000J11_A405TBM31_DEF_VISIT_NO ;
   private boolean[] BC000J11_n405TBM31_DEF_VISIT_NO ;
   private String[] BC000J11_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] BC000J11_n406TBM31_DEF_DOMAIN_CD ;
   private String[] BC000J11_A551TBM31_STATUS ;
   private boolean[] BC000J11_n551TBM31_STATUS ;
   private String[] BC000J11_A222TBM31_NOTE ;
   private boolean[] BC000J11_n222TBM31_NOTE ;
   private String[] BC000J11_A223TBM31_DEL_FLG ;
   private boolean[] BC000J11_n223TBM31_DEL_FLG ;
   private String[] BC000J11_A226TBM31_CRT_PROG_NM ;
   private boolean[] BC000J11_n226TBM31_CRT_PROG_NM ;
   private String[] BC000J11_A229TBM31_UPD_PROG_NM ;
   private boolean[] BC000J11_n229TBM31_UPD_PROG_NM ;
   private long[] BC000J11_A217TBM31_STUDY_ID ;
   private long[] BC000J12_A217TBM31_STUDY_ID ;
}

final  class tbm31_crf_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000J2", "SELECT `TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000J3", "SELECT `TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000J4", "SELECT `TBM21_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000J5", "SELECT TM1.`TBM31_CRF_ID`, TM1.`TBM31_CRT_DATETIME`, TM1.`TBM31_CRT_USER_ID`, TM1.`TBM31_UPD_DATETIME`, TM1.`TBM31_UPD_USER_ID`, TM1.`TBM31_UPD_CNT`, TM1.`TBM31_CRF_NM`, TM1.`TBM31_CRF_SNM`, TM1.`TBM31_GRID_SIZE`, TM1.`TBM31_ORDER`, TM1.`TBM31_DEF_VISIT_NO`, TM1.`TBM31_DEF_DOMAIN_CD`, TM1.`TBM31_STATUS`, TM1.`TBM31_NOTE`, TM1.`TBM31_DEL_FLG`, TM1.`TBM31_CRT_PROG_NM`, TM1.`TBM31_UPD_PROG_NM`, TM1.`TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` TM1 WHERE TM1.`TBM31_STUDY_ID` = ? and TM1.`TBM31_CRF_ID` = ? ORDER BY TM1.`TBM31_STUDY_ID`, TM1.`TBM31_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000J6", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000J7", "INSERT INTO `TBM31_CRF` (`TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000J8", "UPDATE `TBM31_CRF` SET `TBM31_CRT_DATETIME`=?, `TBM31_CRT_USER_ID`=?, `TBM31_UPD_DATETIME`=?, `TBM31_UPD_USER_ID`=?, `TBM31_UPD_CNT`=?, `TBM31_CRF_NM`=?, `TBM31_CRF_SNM`=?, `TBM31_GRID_SIZE`=?, `TBM31_ORDER`=?, `TBM31_DEF_VISIT_NO`=?, `TBM31_DEF_DOMAIN_CD`=?, `TBM31_STATUS`=?, `TBM31_NOTE`=?, `TBM31_DEL_FLG`=?, `TBM31_CRT_PROG_NM`=?, `TBM31_UPD_PROG_NM`=?  WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000J9", "DELETE FROM `TBM31_CRF`  WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000J10", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_STUDY_ID` = ? AND `TBW03_CRF_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000J11", "SELECT TM1.`TBM31_CRF_ID`, TM1.`TBM31_CRT_DATETIME`, TM1.`TBM31_CRT_USER_ID`, TM1.`TBM31_UPD_DATETIME`, TM1.`TBM31_UPD_USER_ID`, TM1.`TBM31_UPD_CNT`, TM1.`TBM31_CRF_NM`, TM1.`TBM31_CRF_SNM`, TM1.`TBM31_GRID_SIZE`, TM1.`TBM31_ORDER`, TM1.`TBM31_DEF_VISIT_NO`, TM1.`TBM31_DEF_DOMAIN_CD`, TM1.`TBM31_STATUS`, TM1.`TBM31_NOTE`, TM1.`TBM31_DEL_FLG`, TM1.`TBM31_CRT_PROG_NM`, TM1.`TBM31_UPD_PROG_NM`, TM1.`TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` TM1 WHERE TM1.`TBM31_STUDY_ID` = ? and TM1.`TBM31_CRF_ID` = ? ORDER BY TM1.`TBM31_STUDY_ID`, TM1.`TBM31_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000J12", "SELECT `TBM21_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11) ;
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
               ((long[]) buf[33])[0] = rslt.getLong(18) ;
               break;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11) ;
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
               ((long[]) buf[33])[0] = rslt.getLong(18) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11) ;
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
               ((long[]) buf[33])[0] = rslt.getLong(18) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11) ;
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
               ((long[]) buf[33])[0] = rslt.getLong(18) ;
               break;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 20);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1000);
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
                  stmt.setVarchar(16, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 40);
               }
               stmt.setLong(18, ((Number) parms[33]).longValue());
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
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 20);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 2);
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
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1000);
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
                  stmt.setVarchar(15, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 40);
               }
               stmt.setLong(17, ((Number) parms[32]).longValue());
               stmt.setShort(18, ((Number) parms[33]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

