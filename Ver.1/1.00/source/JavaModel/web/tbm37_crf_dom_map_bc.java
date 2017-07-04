/*
               File: tbm37_crf_dom_map_bc
        Description: CRF-ドメインマッピングマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:13.2
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm37_crf_dom_map_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm37_crf_dom_map_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm37_crf_dom_map_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm37_crf_dom_map_bc.class ));
   }

   public tbm37_crf_dom_map_bc( int remoteHandle ,
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
         /* Execute user event: e120N2 */
         e120N2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z271TBM37_STUDY_ID = A271TBM37_STUDY_ID ;
            Z272TBM37_CRF_ID = A272TBM37_CRF_ID ;
            Z372TBM37_CRF_ITEM_GRP_DIV = A372TBM37_CRF_ITEM_GRP_DIV ;
            Z273TBM37_CRF_ITEM_GRP_CD = A273TBM37_CRF_ITEM_GRP_CD ;
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

   public void confirm_0N0( )
   {
      beforeValidate0N22( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0N22( ) ;
         }
         else
         {
            checkExtendedTable0N22( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0N22( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110N2( )
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

   public void e120N2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A272TBM37_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A372TBM37_CRF_ITEM_GRP_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A273TBM37_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A373TBM37_VISIT_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A374TBM37_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A375TBM37_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A376TBM37_DOM_ITM_GRP_OID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A274TBM37_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A275TBM37_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm37_crf_dom_map_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A276TBM37_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A277TBM37_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A278TBM37_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm37_crf_dom_map_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A279TBM37_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A280TBM37_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0N22( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z275TBM37_CRT_DATETIME = A275TBM37_CRT_DATETIME ;
         Z276TBM37_CRT_USER_ID = A276TBM37_CRT_USER_ID ;
         Z278TBM37_UPD_DATETIME = A278TBM37_UPD_DATETIME ;
         Z279TBM37_UPD_USER_ID = A279TBM37_UPD_USER_ID ;
         Z281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
         Z373TBM37_VISIT_NO = A373TBM37_VISIT_NO ;
         Z374TBM37_DOM_CD = A374TBM37_DOM_CD ;
         Z375TBM37_DOM_VAR_NM = A375TBM37_DOM_VAR_NM ;
         Z376TBM37_DOM_ITM_GRP_OID = A376TBM37_DOM_ITM_GRP_OID ;
         Z377TBM37_DOM_ITM_GRP_ATTR_SEQ = A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
         Z612TBM37_DOM_ITM_GRP_ROWNO = A612TBM37_DOM_ITM_GRP_ROWNO ;
         Z274TBM37_DEL_FLG = A274TBM37_DEL_FLG ;
         Z277TBM37_CRT_PROG_NM = A277TBM37_CRT_PROG_NM ;
         Z280TBM37_UPD_PROG_NM = A280TBM37_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z271TBM37_STUDY_ID = A271TBM37_STUDY_ID ;
         Z272TBM37_CRF_ID = A272TBM37_CRF_ID ;
         Z372TBM37_CRF_ITEM_GRP_DIV = A372TBM37_CRF_ITEM_GRP_DIV ;
         Z273TBM37_CRF_ITEM_GRP_CD = A273TBM37_CRF_ITEM_GRP_CD ;
         Z275TBM37_CRT_DATETIME = A275TBM37_CRT_DATETIME ;
         Z276TBM37_CRT_USER_ID = A276TBM37_CRT_USER_ID ;
         Z278TBM37_UPD_DATETIME = A278TBM37_UPD_DATETIME ;
         Z279TBM37_UPD_USER_ID = A279TBM37_UPD_USER_ID ;
         Z281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
         Z373TBM37_VISIT_NO = A373TBM37_VISIT_NO ;
         Z374TBM37_DOM_CD = A374TBM37_DOM_CD ;
         Z375TBM37_DOM_VAR_NM = A375TBM37_DOM_VAR_NM ;
         Z376TBM37_DOM_ITM_GRP_OID = A376TBM37_DOM_ITM_GRP_OID ;
         Z377TBM37_DOM_ITM_GRP_ATTR_SEQ = A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
         Z612TBM37_DOM_ITM_GRP_ROWNO = A612TBM37_DOM_ITM_GRP_ROWNO ;
         Z274TBM37_DEL_FLG = A274TBM37_DEL_FLG ;
         Z277TBM37_CRT_PROG_NM = A277TBM37_CRT_PROG_NM ;
         Z280TBM37_UPD_PROG_NM = A280TBM37_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0N22( )
   {
      /* Using cursor BC000N4 */
      pr_default.execute(2, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A275TBM37_CRT_DATETIME = BC000N4_A275TBM37_CRT_DATETIME[0] ;
         n275TBM37_CRT_DATETIME = BC000N4_n275TBM37_CRT_DATETIME[0] ;
         A276TBM37_CRT_USER_ID = BC000N4_A276TBM37_CRT_USER_ID[0] ;
         n276TBM37_CRT_USER_ID = BC000N4_n276TBM37_CRT_USER_ID[0] ;
         A278TBM37_UPD_DATETIME = BC000N4_A278TBM37_UPD_DATETIME[0] ;
         n278TBM37_UPD_DATETIME = BC000N4_n278TBM37_UPD_DATETIME[0] ;
         A279TBM37_UPD_USER_ID = BC000N4_A279TBM37_UPD_USER_ID[0] ;
         n279TBM37_UPD_USER_ID = BC000N4_n279TBM37_UPD_USER_ID[0] ;
         A281TBM37_UPD_CNT = BC000N4_A281TBM37_UPD_CNT[0] ;
         n281TBM37_UPD_CNT = BC000N4_n281TBM37_UPD_CNT[0] ;
         A373TBM37_VISIT_NO = BC000N4_A373TBM37_VISIT_NO[0] ;
         n373TBM37_VISIT_NO = BC000N4_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = BC000N4_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = BC000N4_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = BC000N4_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = BC000N4_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = BC000N4_A376TBM37_DOM_ITM_GRP_OID[0] ;
         n376TBM37_DOM_ITM_GRP_OID = BC000N4_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = BC000N4_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = BC000N4_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = BC000N4_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n612TBM37_DOM_ITM_GRP_ROWNO = BC000N4_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A274TBM37_DEL_FLG = BC000N4_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = BC000N4_n274TBM37_DEL_FLG[0] ;
         A277TBM37_CRT_PROG_NM = BC000N4_A277TBM37_CRT_PROG_NM[0] ;
         n277TBM37_CRT_PROG_NM = BC000N4_n277TBM37_CRT_PROG_NM[0] ;
         A280TBM37_UPD_PROG_NM = BC000N4_A280TBM37_UPD_PROG_NM[0] ;
         n280TBM37_UPD_PROG_NM = BC000N4_n280TBM37_UPD_PROG_NM[0] ;
         zm0N22( -8) ;
      }
      pr_default.close(2);
      onLoadActions0N22( ) ;
   }

   public void onLoadActions0N22( )
   {
      AV9Pgmname = "TBM37_CRF_DOM_MAP_BC" ;
   }

   public void checkExtendedTable0N22( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM37_CRF_DOM_MAP_BC" ;
      if ( ! ( GXutil.nullDate().equals(A275TBM37_CRT_DATETIME) || (( A275TBM37_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A275TBM37_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A278TBM37_UPD_DATETIME) || (( A278TBM37_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A278TBM37_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0N22( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0N22( )
   {
      /* Using cursor BC000N5 */
      pr_default.execute(3, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound22 = (short)(1) ;
      }
      else
      {
         RcdFound22 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000N3 */
      pr_default.execute(1, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0N22( 8) ;
         RcdFound22 = (short)(1) ;
         A271TBM37_STUDY_ID = BC000N3_A271TBM37_STUDY_ID[0] ;
         A272TBM37_CRF_ID = BC000N3_A272TBM37_CRF_ID[0] ;
         A372TBM37_CRF_ITEM_GRP_DIV = BC000N3_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         A273TBM37_CRF_ITEM_GRP_CD = BC000N3_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         A275TBM37_CRT_DATETIME = BC000N3_A275TBM37_CRT_DATETIME[0] ;
         n275TBM37_CRT_DATETIME = BC000N3_n275TBM37_CRT_DATETIME[0] ;
         A276TBM37_CRT_USER_ID = BC000N3_A276TBM37_CRT_USER_ID[0] ;
         n276TBM37_CRT_USER_ID = BC000N3_n276TBM37_CRT_USER_ID[0] ;
         A278TBM37_UPD_DATETIME = BC000N3_A278TBM37_UPD_DATETIME[0] ;
         n278TBM37_UPD_DATETIME = BC000N3_n278TBM37_UPD_DATETIME[0] ;
         A279TBM37_UPD_USER_ID = BC000N3_A279TBM37_UPD_USER_ID[0] ;
         n279TBM37_UPD_USER_ID = BC000N3_n279TBM37_UPD_USER_ID[0] ;
         A281TBM37_UPD_CNT = BC000N3_A281TBM37_UPD_CNT[0] ;
         n281TBM37_UPD_CNT = BC000N3_n281TBM37_UPD_CNT[0] ;
         A373TBM37_VISIT_NO = BC000N3_A373TBM37_VISIT_NO[0] ;
         n373TBM37_VISIT_NO = BC000N3_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = BC000N3_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = BC000N3_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = BC000N3_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = BC000N3_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = BC000N3_A376TBM37_DOM_ITM_GRP_OID[0] ;
         n376TBM37_DOM_ITM_GRP_OID = BC000N3_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = BC000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = BC000N3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = BC000N3_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n612TBM37_DOM_ITM_GRP_ROWNO = BC000N3_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A274TBM37_DEL_FLG = BC000N3_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = BC000N3_n274TBM37_DEL_FLG[0] ;
         A277TBM37_CRT_PROG_NM = BC000N3_A277TBM37_CRT_PROG_NM[0] ;
         n277TBM37_CRT_PROG_NM = BC000N3_n277TBM37_CRT_PROG_NM[0] ;
         A280TBM37_UPD_PROG_NM = BC000N3_A280TBM37_UPD_PROG_NM[0] ;
         n280TBM37_UPD_PROG_NM = BC000N3_n280TBM37_UPD_PROG_NM[0] ;
         O281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
         n281TBM37_UPD_CNT = false ;
         Z271TBM37_STUDY_ID = A271TBM37_STUDY_ID ;
         Z272TBM37_CRF_ID = A272TBM37_CRF_ID ;
         Z372TBM37_CRF_ITEM_GRP_DIV = A372TBM37_CRF_ITEM_GRP_DIV ;
         Z273TBM37_CRF_ITEM_GRP_CD = A273TBM37_CRF_ITEM_GRP_CD ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0N22( ) ;
         Gx_mode = sMode22 ;
      }
      else
      {
         RcdFound22 = (short)(0) ;
         initializeNonKey0N22( ) ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode22 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0N22( ) ;
      if ( RcdFound22 == 0 )
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
      confirm_0N0( ) ;
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

   public void checkOptimisticConcurrency0N22( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000N2 */
         pr_default.execute(0, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM37_CRF_DOM_MAP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z275TBM37_CRT_DATETIME.equals( BC000N2_A275TBM37_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z276TBM37_CRT_USER_ID, BC000N2_A276TBM37_CRT_USER_ID[0]) != 0 ) || !( Z278TBM37_UPD_DATETIME.equals( BC000N2_A278TBM37_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z279TBM37_UPD_USER_ID, BC000N2_A279TBM37_UPD_USER_ID[0]) != 0 ) || ( Z281TBM37_UPD_CNT != BC000N2_A281TBM37_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z373TBM37_VISIT_NO != BC000N2_A373TBM37_VISIT_NO[0] ) || ( GXutil.strcmp(Z374TBM37_DOM_CD, BC000N2_A374TBM37_DOM_CD[0]) != 0 ) || ( GXutil.strcmp(Z375TBM37_DOM_VAR_NM, BC000N2_A375TBM37_DOM_VAR_NM[0]) != 0 ) || ( GXutil.strcmp(Z376TBM37_DOM_ITM_GRP_OID, BC000N2_A376TBM37_DOM_ITM_GRP_OID[0]) != 0 ) || ( Z377TBM37_DOM_ITM_GRP_ATTR_SEQ != BC000N2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z612TBM37_DOM_ITM_GRP_ROWNO != BC000N2_A612TBM37_DOM_ITM_GRP_ROWNO[0] ) || ( GXutil.strcmp(Z274TBM37_DEL_FLG, BC000N2_A274TBM37_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z277TBM37_CRT_PROG_NM, BC000N2_A277TBM37_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z280TBM37_UPD_PROG_NM, BC000N2_A280TBM37_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM37_CRF_DOM_MAP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0N22( )
   {
      beforeValidate0N22( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0N22( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0N22( 0) ;
         checkOptimisticConcurrency0N22( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0N22( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0N22( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000N6 */
                  pr_default.execute(4, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD, new Boolean(n275TBM37_CRT_DATETIME), A275TBM37_CRT_DATETIME, new Boolean(n276TBM37_CRT_USER_ID), A276TBM37_CRT_USER_ID, new Boolean(n278TBM37_UPD_DATETIME), A278TBM37_UPD_DATETIME, new Boolean(n279TBM37_UPD_USER_ID), A279TBM37_UPD_USER_ID, new Boolean(n281TBM37_UPD_CNT), new Long(A281TBM37_UPD_CNT), new Boolean(n373TBM37_VISIT_NO), new Short(A373TBM37_VISIT_NO), new Boolean(n374TBM37_DOM_CD), A374TBM37_DOM_CD, new Boolean(n375TBM37_DOM_VAR_NM), A375TBM37_DOM_VAR_NM, new Boolean(n376TBM37_DOM_ITM_GRP_OID), A376TBM37_DOM_ITM_GRP_OID, new Boolean(n377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n612TBM37_DOM_ITM_GRP_ROWNO), new Short(A612TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n274TBM37_DEL_FLG), A274TBM37_DEL_FLG, new Boolean(n277TBM37_CRT_PROG_NM), A277TBM37_CRT_PROG_NM, new Boolean(n280TBM37_UPD_PROG_NM), A280TBM37_UPD_PROG_NM});
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
            load0N22( ) ;
         }
         endLevel0N22( ) ;
      }
      closeExtendedTableCursors0N22( ) ;
   }

   public void update0N22( )
   {
      beforeValidate0N22( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0N22( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0N22( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0N22( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0N22( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000N7 */
                  pr_default.execute(5, new Object[] {new Boolean(n275TBM37_CRT_DATETIME), A275TBM37_CRT_DATETIME, new Boolean(n276TBM37_CRT_USER_ID), A276TBM37_CRT_USER_ID, new Boolean(n278TBM37_UPD_DATETIME), A278TBM37_UPD_DATETIME, new Boolean(n279TBM37_UPD_USER_ID), A279TBM37_UPD_USER_ID, new Boolean(n281TBM37_UPD_CNT), new Long(A281TBM37_UPD_CNT), new Boolean(n373TBM37_VISIT_NO), new Short(A373TBM37_VISIT_NO), new Boolean(n374TBM37_DOM_CD), A374TBM37_DOM_CD, new Boolean(n375TBM37_DOM_VAR_NM), A375TBM37_DOM_VAR_NM, new Boolean(n376TBM37_DOM_ITM_GRP_OID), A376TBM37_DOM_ITM_GRP_OID, new Boolean(n377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n612TBM37_DOM_ITM_GRP_ROWNO), new Short(A612TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n274TBM37_DEL_FLG), A274TBM37_DEL_FLG, new Boolean(n277TBM37_CRT_PROG_NM), A277TBM37_CRT_PROG_NM, new Boolean(n280TBM37_UPD_PROG_NM), A280TBM37_UPD_PROG_NM, new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM37_CRF_DOM_MAP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0N22( ) ;
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
         endLevel0N22( ) ;
      }
      closeExtendedTableCursors0N22( ) ;
   }

   public void deferredUpdate0N22( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0N22( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0N22( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0N22( ) ;
         afterConfirm0N22( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0N22( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000N8 */
               pr_default.execute(6, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
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
      sMode22 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0N22( ) ;
      Gx_mode = sMode22 ;
   }

   public void onDeleteControls0N22( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM37_CRF_DOM_MAP_BC" ;
      }
   }

   public void endLevel0N22( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0N22( ) ;
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

   public void scanKeyStart0N22( )
   {
      /* Using cursor BC000N9 */
      pr_default.execute(7, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A271TBM37_STUDY_ID = BC000N9_A271TBM37_STUDY_ID[0] ;
         A272TBM37_CRF_ID = BC000N9_A272TBM37_CRF_ID[0] ;
         A372TBM37_CRF_ITEM_GRP_DIV = BC000N9_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         A273TBM37_CRF_ITEM_GRP_CD = BC000N9_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         A275TBM37_CRT_DATETIME = BC000N9_A275TBM37_CRT_DATETIME[0] ;
         n275TBM37_CRT_DATETIME = BC000N9_n275TBM37_CRT_DATETIME[0] ;
         A276TBM37_CRT_USER_ID = BC000N9_A276TBM37_CRT_USER_ID[0] ;
         n276TBM37_CRT_USER_ID = BC000N9_n276TBM37_CRT_USER_ID[0] ;
         A278TBM37_UPD_DATETIME = BC000N9_A278TBM37_UPD_DATETIME[0] ;
         n278TBM37_UPD_DATETIME = BC000N9_n278TBM37_UPD_DATETIME[0] ;
         A279TBM37_UPD_USER_ID = BC000N9_A279TBM37_UPD_USER_ID[0] ;
         n279TBM37_UPD_USER_ID = BC000N9_n279TBM37_UPD_USER_ID[0] ;
         A281TBM37_UPD_CNT = BC000N9_A281TBM37_UPD_CNT[0] ;
         n281TBM37_UPD_CNT = BC000N9_n281TBM37_UPD_CNT[0] ;
         A373TBM37_VISIT_NO = BC000N9_A373TBM37_VISIT_NO[0] ;
         n373TBM37_VISIT_NO = BC000N9_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = BC000N9_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = BC000N9_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = BC000N9_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = BC000N9_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = BC000N9_A376TBM37_DOM_ITM_GRP_OID[0] ;
         n376TBM37_DOM_ITM_GRP_OID = BC000N9_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = BC000N9_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = BC000N9_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = BC000N9_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n612TBM37_DOM_ITM_GRP_ROWNO = BC000N9_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A274TBM37_DEL_FLG = BC000N9_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = BC000N9_n274TBM37_DEL_FLG[0] ;
         A277TBM37_CRT_PROG_NM = BC000N9_A277TBM37_CRT_PROG_NM[0] ;
         n277TBM37_CRT_PROG_NM = BC000N9_n277TBM37_CRT_PROG_NM[0] ;
         A280TBM37_UPD_PROG_NM = BC000N9_A280TBM37_UPD_PROG_NM[0] ;
         n280TBM37_UPD_PROG_NM = BC000N9_n280TBM37_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0N22( )
   {
      pr_default.readNext(7);
      RcdFound22 = (short)(0) ;
      scanKeyLoad0N22( ) ;
   }

   public void scanKeyLoad0N22( )
   {
      sMode22 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A271TBM37_STUDY_ID = BC000N9_A271TBM37_STUDY_ID[0] ;
         A272TBM37_CRF_ID = BC000N9_A272TBM37_CRF_ID[0] ;
         A372TBM37_CRF_ITEM_GRP_DIV = BC000N9_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         A273TBM37_CRF_ITEM_GRP_CD = BC000N9_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         A275TBM37_CRT_DATETIME = BC000N9_A275TBM37_CRT_DATETIME[0] ;
         n275TBM37_CRT_DATETIME = BC000N9_n275TBM37_CRT_DATETIME[0] ;
         A276TBM37_CRT_USER_ID = BC000N9_A276TBM37_CRT_USER_ID[0] ;
         n276TBM37_CRT_USER_ID = BC000N9_n276TBM37_CRT_USER_ID[0] ;
         A278TBM37_UPD_DATETIME = BC000N9_A278TBM37_UPD_DATETIME[0] ;
         n278TBM37_UPD_DATETIME = BC000N9_n278TBM37_UPD_DATETIME[0] ;
         A279TBM37_UPD_USER_ID = BC000N9_A279TBM37_UPD_USER_ID[0] ;
         n279TBM37_UPD_USER_ID = BC000N9_n279TBM37_UPD_USER_ID[0] ;
         A281TBM37_UPD_CNT = BC000N9_A281TBM37_UPD_CNT[0] ;
         n281TBM37_UPD_CNT = BC000N9_n281TBM37_UPD_CNT[0] ;
         A373TBM37_VISIT_NO = BC000N9_A373TBM37_VISIT_NO[0] ;
         n373TBM37_VISIT_NO = BC000N9_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = BC000N9_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = BC000N9_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = BC000N9_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = BC000N9_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = BC000N9_A376TBM37_DOM_ITM_GRP_OID[0] ;
         n376TBM37_DOM_ITM_GRP_OID = BC000N9_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = BC000N9_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = BC000N9_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = BC000N9_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n612TBM37_DOM_ITM_GRP_ROWNO = BC000N9_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A274TBM37_DEL_FLG = BC000N9_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = BC000N9_n274TBM37_DEL_FLG[0] ;
         A277TBM37_CRT_PROG_NM = BC000N9_A277TBM37_CRT_PROG_NM[0] ;
         n277TBM37_CRT_PROG_NM = BC000N9_n277TBM37_CRT_PROG_NM[0] ;
         A280TBM37_UPD_PROG_NM = BC000N9_A280TBM37_UPD_PROG_NM[0] ;
         n280TBM37_UPD_PROG_NM = BC000N9_n280TBM37_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode22 ;
   }

   public void scanKeyEnd0N22( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0N22( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0N22( )
   {
      /* Before Insert Rules */
      A275TBM37_CRT_DATETIME = GXutil.now( ) ;
      n275TBM37_CRT_DATETIME = false ;
      GXt_char1 = A276TBM37_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm37_crf_dom_map_bc.this.GXt_char1 = GXv_char2[0] ;
      A276TBM37_CRT_USER_ID = GXt_char1 ;
      n276TBM37_CRT_USER_ID = false ;
      A278TBM37_UPD_DATETIME = GXutil.now( ) ;
      n278TBM37_UPD_DATETIME = false ;
      GXt_char1 = A279TBM37_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm37_crf_dom_map_bc.this.GXt_char1 = GXv_char2[0] ;
      A279TBM37_UPD_USER_ID = GXt_char1 ;
      n279TBM37_UPD_USER_ID = false ;
      A281TBM37_UPD_CNT = (long)(O281TBM37_UPD_CNT+1) ;
      n281TBM37_UPD_CNT = false ;
   }

   public void beforeUpdate0N22( )
   {
      /* Before Update Rules */
      A278TBM37_UPD_DATETIME = GXutil.now( ) ;
      n278TBM37_UPD_DATETIME = false ;
      GXt_char1 = A279TBM37_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm37_crf_dom_map_bc.this.GXt_char1 = GXv_char2[0] ;
      A279TBM37_UPD_USER_ID = GXt_char1 ;
      n279TBM37_UPD_USER_ID = false ;
      A281TBM37_UPD_CNT = (long)(O281TBM37_UPD_CNT+1) ;
      n281TBM37_UPD_CNT = false ;
   }

   public void beforeDelete0N22( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0N22( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0N22( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0N22( )
   {
   }

   public void addRow0N22( )
   {
      VarsToRow22( bcTBM37_CRF_DOM_MAP) ;
   }

   public void readRow0N22( )
   {
      RowToVars22( bcTBM37_CRF_DOM_MAP, 1) ;
   }

   public void initializeNonKey0N22( )
   {
      A275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n275TBM37_CRT_DATETIME = false ;
      A276TBM37_CRT_USER_ID = "" ;
      n276TBM37_CRT_USER_ID = false ;
      A278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n278TBM37_UPD_DATETIME = false ;
      A279TBM37_UPD_USER_ID = "" ;
      n279TBM37_UPD_USER_ID = false ;
      A281TBM37_UPD_CNT = 0 ;
      n281TBM37_UPD_CNT = false ;
      A373TBM37_VISIT_NO = (short)(0) ;
      n373TBM37_VISIT_NO = false ;
      A374TBM37_DOM_CD = "" ;
      n374TBM37_DOM_CD = false ;
      A375TBM37_DOM_VAR_NM = "" ;
      n375TBM37_DOM_VAR_NM = false ;
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      n376TBM37_DOM_ITM_GRP_OID = false ;
      A377TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
      n377TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
      A612TBM37_DOM_ITM_GRP_ROWNO = (short)(0) ;
      n612TBM37_DOM_ITM_GRP_ROWNO = false ;
      A274TBM37_DEL_FLG = "" ;
      n274TBM37_DEL_FLG = false ;
      A277TBM37_CRT_PROG_NM = "" ;
      n277TBM37_CRT_PROG_NM = false ;
      A280TBM37_UPD_PROG_NM = "" ;
      n280TBM37_UPD_PROG_NM = false ;
      O281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
      n281TBM37_UPD_CNT = false ;
   }

   public void initAll0N22( )
   {
      A271TBM37_STUDY_ID = 0 ;
      A272TBM37_CRF_ID = (short)(0) ;
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      initializeNonKey0N22( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow22( SdtTBM37_CRF_DOM_MAP obj22 )
   {
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Mode( Gx_mode );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime( A275TBM37_CRT_DATETIME );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id( A276TBM37_CRT_USER_ID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime( A278TBM37_UPD_DATETIME );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id( A279TBM37_UPD_USER_ID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt( A281TBM37_UPD_CNT );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no( A373TBM37_VISIT_NO );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd( A374TBM37_DOM_CD );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm( A375TBM37_DOM_VAR_NM );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid( A376TBM37_DOM_ITM_GRP_OID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq( A377TBM37_DOM_ITM_GRP_ATTR_SEQ );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno( A612TBM37_DOM_ITM_GRP_ROWNO );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg( A274TBM37_DEL_FLG );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm( A277TBM37_CRT_PROG_NM );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm( A280TBM37_UPD_PROG_NM );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id( A271TBM37_STUDY_ID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id( A272TBM37_CRF_ID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div( A372TBM37_CRF_ITEM_GRP_DIV );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd( A273TBM37_CRF_ITEM_GRP_CD );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id_Z( Z271TBM37_STUDY_ID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id_Z( Z272TBM37_CRF_ID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div_Z( Z372TBM37_CRF_ITEM_GRP_DIV );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd_Z( Z273TBM37_CRF_ITEM_GRP_CD );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_Z( Z373TBM37_VISIT_NO );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_Z( Z374TBM37_DOM_CD );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_Z( Z375TBM37_DOM_VAR_NM );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_Z( Z376TBM37_DOM_ITM_GRP_OID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_Z( Z377TBM37_DOM_ITM_GRP_ATTR_SEQ );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_Z( Z612TBM37_DOM_ITM_GRP_ROWNO );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_Z( Z274TBM37_DEL_FLG );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_Z( Z275TBM37_CRT_DATETIME );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_Z( Z276TBM37_CRT_USER_ID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_Z( Z277TBM37_CRT_PROG_NM );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_Z( Z278TBM37_UPD_DATETIME );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_Z( Z279TBM37_UPD_USER_ID );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_Z( Z280TBM37_UPD_PROG_NM );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_Z( Z281TBM37_UPD_CNT );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_N( (byte)((byte)((n373TBM37_VISIT_NO)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_N( (byte)((byte)((n374TBM37_DOM_CD)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_N( (byte)((byte)((n375TBM37_DOM_VAR_NM)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_N( (byte)((byte)((n376TBM37_DOM_ITM_GRP_OID)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_N( (byte)((byte)((n377TBM37_DOM_ITM_GRP_ATTR_SEQ)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_N( (byte)((byte)((n612TBM37_DOM_ITM_GRP_ROWNO)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_N( (byte)((byte)((n274TBM37_DEL_FLG)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_N( (byte)((byte)((n275TBM37_CRT_DATETIME)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_N( (byte)((byte)((n276TBM37_CRT_USER_ID)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_N( (byte)((byte)((n277TBM37_CRT_PROG_NM)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_N( (byte)((byte)((n278TBM37_UPD_DATETIME)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_N( (byte)((byte)((n279TBM37_UPD_USER_ID)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_N( (byte)((byte)((n280TBM37_UPD_PROG_NM)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_N( (byte)((byte)((n281TBM37_UPD_CNT)?1:0)) );
      obj22.setgxTv_SdtTBM37_CRF_DOM_MAP_Mode( Gx_mode );
   }

   public void RowToVars22( SdtTBM37_CRF_DOM_MAP obj22 ,
                            int forceLoad )
   {
      Gx_mode = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Mode() ;
      A275TBM37_CRT_DATETIME = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime() ;
      n275TBM37_CRT_DATETIME = false ;
      A276TBM37_CRT_USER_ID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id() ;
      n276TBM37_CRT_USER_ID = false ;
      A278TBM37_UPD_DATETIME = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime() ;
      n278TBM37_UPD_DATETIME = false ;
      A279TBM37_UPD_USER_ID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id() ;
      n279TBM37_UPD_USER_ID = false ;
      A281TBM37_UPD_CNT = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt() ;
      n281TBM37_UPD_CNT = false ;
      A373TBM37_VISIT_NO = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no() ;
      n373TBM37_VISIT_NO = false ;
      A374TBM37_DOM_CD = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd() ;
      n374TBM37_DOM_CD = false ;
      A375TBM37_DOM_VAR_NM = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm() ;
      n375TBM37_DOM_VAR_NM = false ;
      A376TBM37_DOM_ITM_GRP_OID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid() ;
      n376TBM37_DOM_ITM_GRP_OID = false ;
      A377TBM37_DOM_ITM_GRP_ATTR_SEQ = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq() ;
      n377TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
      A612TBM37_DOM_ITM_GRP_ROWNO = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno() ;
      n612TBM37_DOM_ITM_GRP_ROWNO = false ;
      A274TBM37_DEL_FLG = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg() ;
      n274TBM37_DEL_FLG = false ;
      A277TBM37_CRT_PROG_NM = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm() ;
      n277TBM37_CRT_PROG_NM = false ;
      A280TBM37_UPD_PROG_NM = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm() ;
      n280TBM37_UPD_PROG_NM = false ;
      A271TBM37_STUDY_ID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id() ;
      A272TBM37_CRF_ID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id() ;
      A372TBM37_CRF_ITEM_GRP_DIV = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div() ;
      A273TBM37_CRF_ITEM_GRP_CD = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd() ;
      Z271TBM37_STUDY_ID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id_Z() ;
      Z272TBM37_CRF_ID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id_Z() ;
      Z372TBM37_CRF_ITEM_GRP_DIV = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div_Z() ;
      Z273TBM37_CRF_ITEM_GRP_CD = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd_Z() ;
      Z373TBM37_VISIT_NO = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_Z() ;
      Z374TBM37_DOM_CD = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_Z() ;
      Z375TBM37_DOM_VAR_NM = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_Z() ;
      Z376TBM37_DOM_ITM_GRP_OID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_Z() ;
      Z377TBM37_DOM_ITM_GRP_ATTR_SEQ = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_Z() ;
      Z612TBM37_DOM_ITM_GRP_ROWNO = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_Z() ;
      Z274TBM37_DEL_FLG = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_Z() ;
      Z275TBM37_CRT_DATETIME = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_Z() ;
      Z276TBM37_CRT_USER_ID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_Z() ;
      Z277TBM37_CRT_PROG_NM = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_Z() ;
      Z278TBM37_UPD_DATETIME = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_Z() ;
      Z279TBM37_UPD_USER_ID = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_Z() ;
      Z280TBM37_UPD_PROG_NM = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_Z() ;
      Z281TBM37_UPD_CNT = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_Z() ;
      O281TBM37_UPD_CNT = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_Z() ;
      n373TBM37_VISIT_NO = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_N()==0)?false:true) ;
      n374TBM37_DOM_CD = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_N()==0)?false:true) ;
      n375TBM37_DOM_VAR_NM = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_N()==0)?false:true) ;
      n376TBM37_DOM_ITM_GRP_OID = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_N()==0)?false:true) ;
      n377TBM37_DOM_ITM_GRP_ATTR_SEQ = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_N()==0)?false:true) ;
      n612TBM37_DOM_ITM_GRP_ROWNO = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_N()==0)?false:true) ;
      n274TBM37_DEL_FLG = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_N()==0)?false:true) ;
      n275TBM37_CRT_DATETIME = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_N()==0)?false:true) ;
      n276TBM37_CRT_USER_ID = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_N()==0)?false:true) ;
      n277TBM37_CRT_PROG_NM = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_N()==0)?false:true) ;
      n278TBM37_UPD_DATETIME = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_N()==0)?false:true) ;
      n279TBM37_UPD_USER_ID = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_N()==0)?false:true) ;
      n280TBM37_UPD_PROG_NM = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_N()==0)?false:true) ;
      n281TBM37_UPD_CNT = (boolean)((obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj22.getgxTv_SdtTBM37_CRF_DOM_MAP_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A271TBM37_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A272TBM37_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A372TBM37_CRF_ITEM_GRP_DIV = (String)getParm(obj,2) ;
      A273TBM37_CRF_ITEM_GRP_CD = (String)getParm(obj,3) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0N22( ) ;
      scanKeyStart0N22( ) ;
      if ( RcdFound22 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z271TBM37_STUDY_ID = A271TBM37_STUDY_ID ;
         Z272TBM37_CRF_ID = A272TBM37_CRF_ID ;
         Z372TBM37_CRF_ITEM_GRP_DIV = A372TBM37_CRF_ITEM_GRP_DIV ;
         Z273TBM37_CRF_ITEM_GRP_CD = A273TBM37_CRF_ITEM_GRP_CD ;
         O281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
         n281TBM37_UPD_CNT = false ;
      }
      zm0N22( -8) ;
      sMode22 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0N22( ) ;
      Gx_mode = sMode22 ;
      addRow0N22( ) ;
      scanKeyEnd0N22( ) ;
      if ( RcdFound22 == 0 )
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
      RowToVars22( bcTBM37_CRF_DOM_MAP, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0N22( ) ;
      if ( RcdFound22 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A271TBM37_STUDY_ID != Z271TBM37_STUDY_ID ) || ( A272TBM37_CRF_ID != Z272TBM37_CRF_ID ) || ( GXutil.strcmp(A372TBM37_CRF_ITEM_GRP_DIV, Z372TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A273TBM37_CRF_ITEM_GRP_CD, Z273TBM37_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A271TBM37_STUDY_ID = Z271TBM37_STUDY_ID ;
            A272TBM37_CRF_ID = Z272TBM37_CRF_ID ;
            A372TBM37_CRF_ITEM_GRP_DIV = Z372TBM37_CRF_ITEM_GRP_DIV ;
            A273TBM37_CRF_ITEM_GRP_CD = Z273TBM37_CRF_ITEM_GRP_CD ;
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
            update0N22( ) ;
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
            if ( ( A271TBM37_STUDY_ID != Z271TBM37_STUDY_ID ) || ( A272TBM37_CRF_ID != Z272TBM37_CRF_ID ) || ( GXutil.strcmp(A372TBM37_CRF_ITEM_GRP_DIV, Z372TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A273TBM37_CRF_ITEM_GRP_CD, Z273TBM37_CRF_ITEM_GRP_CD) != 0 ) )
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
                  insert0N22( ) ;
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
                  insert0N22( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow22( bcTBM37_CRF_DOM_MAP) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars22( bcTBM37_CRF_DOM_MAP, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0N22( ) ;
      if ( RcdFound22 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A271TBM37_STUDY_ID != Z271TBM37_STUDY_ID ) || ( A272TBM37_CRF_ID != Z272TBM37_CRF_ID ) || ( GXutil.strcmp(A372TBM37_CRF_ITEM_GRP_DIV, Z372TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A273TBM37_CRF_ITEM_GRP_CD, Z273TBM37_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A271TBM37_STUDY_ID = Z271TBM37_STUDY_ID ;
            A272TBM37_CRF_ID = Z272TBM37_CRF_ID ;
            A372TBM37_CRF_ITEM_GRP_DIV = Z372TBM37_CRF_ITEM_GRP_DIV ;
            A273TBM37_CRF_ITEM_GRP_CD = Z273TBM37_CRF_ITEM_GRP_CD ;
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
         if ( ( A271TBM37_STUDY_ID != Z271TBM37_STUDY_ID ) || ( A272TBM37_CRF_ID != Z272TBM37_CRF_ID ) || ( GXutil.strcmp(A372TBM37_CRF_ITEM_GRP_DIV, Z372TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A273TBM37_CRF_ITEM_GRP_CD, Z273TBM37_CRF_ITEM_GRP_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm37_crf_dom_map_bc");
      VarsToRow22( bcTBM37_CRF_DOM_MAP) ;
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
      Gx_mode = bcTBM37_CRF_DOM_MAP.getgxTv_SdtTBM37_CRF_DOM_MAP_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM37_CRF_DOM_MAP sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM37_CRF_DOM_MAP )
      {
         bcTBM37_CRF_DOM_MAP = sdt ;
         if ( GXutil.strcmp(bcTBM37_CRF_DOM_MAP.getgxTv_SdtTBM37_CRF_DOM_MAP_Mode(), "") == 0 )
         {
            bcTBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow22( bcTBM37_CRF_DOM_MAP) ;
         }
         else
         {
            RowToVars22( bcTBM37_CRF_DOM_MAP, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM37_CRF_DOM_MAP.getgxTv_SdtTBM37_CRF_DOM_MAP_Mode(), "") == 0 )
         {
            bcTBM37_CRF_DOM_MAP.setgxTv_SdtTBM37_CRF_DOM_MAP_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars22( bcTBM37_CRF_DOM_MAP, 1) ;
   }

   public SdtTBM37_CRF_DOM_MAP getTBM37_CRF_DOM_MAP_BC( )
   {
      return bcTBM37_CRF_DOM_MAP ;
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
      Z372TBM37_CRF_ITEM_GRP_DIV = "" ;
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      Z273TBM37_CRF_ITEM_GRP_CD = "" ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A374TBM37_DOM_CD = "" ;
      A375TBM37_DOM_VAR_NM = "" ;
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      A274TBM37_DEL_FLG = "" ;
      A275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A276TBM37_CRT_USER_ID = "" ;
      A277TBM37_CRT_PROG_NM = "" ;
      A278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A279TBM37_UPD_USER_ID = "" ;
      A280TBM37_UPD_PROG_NM = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_Z = "" ;
      Z275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z276TBM37_CRT_USER_ID = "" ;
      Z278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z279TBM37_UPD_USER_ID = "" ;
      Z374TBM37_DOM_CD = "" ;
      Z375TBM37_DOM_VAR_NM = "" ;
      Z376TBM37_DOM_ITM_GRP_OID = "" ;
      Z274TBM37_DEL_FLG = "" ;
      Z277TBM37_CRT_PROG_NM = "" ;
      Z280TBM37_UPD_PROG_NM = "" ;
      BC000N4_A271TBM37_STUDY_ID = new long[1] ;
      BC000N4_A272TBM37_CRF_ID = new short[1] ;
      BC000N4_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000N4_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000N4_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000N4_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      BC000N4_A276TBM37_CRT_USER_ID = new String[] {""} ;
      BC000N4_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      BC000N4_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000N4_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      BC000N4_A279TBM37_UPD_USER_ID = new String[] {""} ;
      BC000N4_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      BC000N4_A281TBM37_UPD_CNT = new long[1] ;
      BC000N4_n281TBM37_UPD_CNT = new boolean[] {false} ;
      BC000N4_A373TBM37_VISIT_NO = new short[1] ;
      BC000N4_n373TBM37_VISIT_NO = new boolean[] {false} ;
      BC000N4_A374TBM37_DOM_CD = new String[] {""} ;
      BC000N4_n374TBM37_DOM_CD = new boolean[] {false} ;
      BC000N4_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      BC000N4_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      BC000N4_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000N4_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000N4_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000N4_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000N4_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000N4_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000N4_A274TBM37_DEL_FLG = new String[] {""} ;
      BC000N4_n274TBM37_DEL_FLG = new boolean[] {false} ;
      BC000N4_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      BC000N4_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      BC000N4_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      BC000N4_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      BC000N5_A271TBM37_STUDY_ID = new long[1] ;
      BC000N5_A272TBM37_CRF_ID = new short[1] ;
      BC000N5_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000N5_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000N3_A271TBM37_STUDY_ID = new long[1] ;
      BC000N3_A272TBM37_CRF_ID = new short[1] ;
      BC000N3_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000N3_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000N3_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000N3_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      BC000N3_A276TBM37_CRT_USER_ID = new String[] {""} ;
      BC000N3_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      BC000N3_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000N3_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      BC000N3_A279TBM37_UPD_USER_ID = new String[] {""} ;
      BC000N3_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      BC000N3_A281TBM37_UPD_CNT = new long[1] ;
      BC000N3_n281TBM37_UPD_CNT = new boolean[] {false} ;
      BC000N3_A373TBM37_VISIT_NO = new short[1] ;
      BC000N3_n373TBM37_VISIT_NO = new boolean[] {false} ;
      BC000N3_A374TBM37_DOM_CD = new String[] {""} ;
      BC000N3_n374TBM37_DOM_CD = new boolean[] {false} ;
      BC000N3_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      BC000N3_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      BC000N3_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000N3_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000N3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000N3_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000N3_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000N3_A274TBM37_DEL_FLG = new String[] {""} ;
      BC000N3_n274TBM37_DEL_FLG = new boolean[] {false} ;
      BC000N3_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      BC000N3_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      BC000N3_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      BC000N3_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      sMode22 = "" ;
      BC000N2_A271TBM37_STUDY_ID = new long[1] ;
      BC000N2_A272TBM37_CRF_ID = new short[1] ;
      BC000N2_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000N2_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000N2_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000N2_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      BC000N2_A276TBM37_CRT_USER_ID = new String[] {""} ;
      BC000N2_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      BC000N2_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000N2_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      BC000N2_A279TBM37_UPD_USER_ID = new String[] {""} ;
      BC000N2_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      BC000N2_A281TBM37_UPD_CNT = new long[1] ;
      BC000N2_n281TBM37_UPD_CNT = new boolean[] {false} ;
      BC000N2_A373TBM37_VISIT_NO = new short[1] ;
      BC000N2_n373TBM37_VISIT_NO = new boolean[] {false} ;
      BC000N2_A374TBM37_DOM_CD = new String[] {""} ;
      BC000N2_n374TBM37_DOM_CD = new boolean[] {false} ;
      BC000N2_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      BC000N2_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      BC000N2_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000N2_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000N2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000N2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000N2_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000N2_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000N2_A274TBM37_DEL_FLG = new String[] {""} ;
      BC000N2_n274TBM37_DEL_FLG = new boolean[] {false} ;
      BC000N2_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      BC000N2_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      BC000N2_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      BC000N2_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      BC000N9_A271TBM37_STUDY_ID = new long[1] ;
      BC000N9_A272TBM37_CRF_ID = new short[1] ;
      BC000N9_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC000N9_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC000N9_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000N9_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      BC000N9_A276TBM37_CRT_USER_ID = new String[] {""} ;
      BC000N9_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      BC000N9_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000N9_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      BC000N9_A279TBM37_UPD_USER_ID = new String[] {""} ;
      BC000N9_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      BC000N9_A281TBM37_UPD_CNT = new long[1] ;
      BC000N9_n281TBM37_UPD_CNT = new boolean[] {false} ;
      BC000N9_A373TBM37_VISIT_NO = new short[1] ;
      BC000N9_n373TBM37_VISIT_NO = new boolean[] {false} ;
      BC000N9_A374TBM37_DOM_CD = new String[] {""} ;
      BC000N9_n374TBM37_DOM_CD = new boolean[] {false} ;
      BC000N9_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      BC000N9_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      BC000N9_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      BC000N9_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      BC000N9_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      BC000N9_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      BC000N9_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      BC000N9_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      BC000N9_A274TBM37_DEL_FLG = new String[] {""} ;
      BC000N9_n274TBM37_DEL_FLG = new boolean[] {false} ;
      BC000N9_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      BC000N9_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      BC000N9_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      BC000N9_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm37_crf_dom_map_bc__default(),
         new Object[] {
             new Object[] {
            BC000N2_A271TBM37_STUDY_ID, BC000N2_A272TBM37_CRF_ID, BC000N2_A372TBM37_CRF_ITEM_GRP_DIV, BC000N2_A273TBM37_CRF_ITEM_GRP_CD, BC000N2_A275TBM37_CRT_DATETIME, BC000N2_n275TBM37_CRT_DATETIME, BC000N2_A276TBM37_CRT_USER_ID, BC000N2_n276TBM37_CRT_USER_ID, BC000N2_A278TBM37_UPD_DATETIME, BC000N2_n278TBM37_UPD_DATETIME,
            BC000N2_A279TBM37_UPD_USER_ID, BC000N2_n279TBM37_UPD_USER_ID, BC000N2_A281TBM37_UPD_CNT, BC000N2_n281TBM37_UPD_CNT, BC000N2_A373TBM37_VISIT_NO, BC000N2_n373TBM37_VISIT_NO, BC000N2_A374TBM37_DOM_CD, BC000N2_n374TBM37_DOM_CD, BC000N2_A375TBM37_DOM_VAR_NM, BC000N2_n375TBM37_DOM_VAR_NM,
            BC000N2_A376TBM37_DOM_ITM_GRP_OID, BC000N2_n376TBM37_DOM_ITM_GRP_OID, BC000N2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, BC000N2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, BC000N2_A612TBM37_DOM_ITM_GRP_ROWNO, BC000N2_n612TBM37_DOM_ITM_GRP_ROWNO, BC000N2_A274TBM37_DEL_FLG, BC000N2_n274TBM37_DEL_FLG, BC000N2_A277TBM37_CRT_PROG_NM, BC000N2_n277TBM37_CRT_PROG_NM,
            BC000N2_A280TBM37_UPD_PROG_NM, BC000N2_n280TBM37_UPD_PROG_NM
            }
            , new Object[] {
            BC000N3_A271TBM37_STUDY_ID, BC000N3_A272TBM37_CRF_ID, BC000N3_A372TBM37_CRF_ITEM_GRP_DIV, BC000N3_A273TBM37_CRF_ITEM_GRP_CD, BC000N3_A275TBM37_CRT_DATETIME, BC000N3_n275TBM37_CRT_DATETIME, BC000N3_A276TBM37_CRT_USER_ID, BC000N3_n276TBM37_CRT_USER_ID, BC000N3_A278TBM37_UPD_DATETIME, BC000N3_n278TBM37_UPD_DATETIME,
            BC000N3_A279TBM37_UPD_USER_ID, BC000N3_n279TBM37_UPD_USER_ID, BC000N3_A281TBM37_UPD_CNT, BC000N3_n281TBM37_UPD_CNT, BC000N3_A373TBM37_VISIT_NO, BC000N3_n373TBM37_VISIT_NO, BC000N3_A374TBM37_DOM_CD, BC000N3_n374TBM37_DOM_CD, BC000N3_A375TBM37_DOM_VAR_NM, BC000N3_n375TBM37_DOM_VAR_NM,
            BC000N3_A376TBM37_DOM_ITM_GRP_OID, BC000N3_n376TBM37_DOM_ITM_GRP_OID, BC000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, BC000N3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, BC000N3_A612TBM37_DOM_ITM_GRP_ROWNO, BC000N3_n612TBM37_DOM_ITM_GRP_ROWNO, BC000N3_A274TBM37_DEL_FLG, BC000N3_n274TBM37_DEL_FLG, BC000N3_A277TBM37_CRT_PROG_NM, BC000N3_n277TBM37_CRT_PROG_NM,
            BC000N3_A280TBM37_UPD_PROG_NM, BC000N3_n280TBM37_UPD_PROG_NM
            }
            , new Object[] {
            BC000N4_A271TBM37_STUDY_ID, BC000N4_A272TBM37_CRF_ID, BC000N4_A372TBM37_CRF_ITEM_GRP_DIV, BC000N4_A273TBM37_CRF_ITEM_GRP_CD, BC000N4_A275TBM37_CRT_DATETIME, BC000N4_n275TBM37_CRT_DATETIME, BC000N4_A276TBM37_CRT_USER_ID, BC000N4_n276TBM37_CRT_USER_ID, BC000N4_A278TBM37_UPD_DATETIME, BC000N4_n278TBM37_UPD_DATETIME,
            BC000N4_A279TBM37_UPD_USER_ID, BC000N4_n279TBM37_UPD_USER_ID, BC000N4_A281TBM37_UPD_CNT, BC000N4_n281TBM37_UPD_CNT, BC000N4_A373TBM37_VISIT_NO, BC000N4_n373TBM37_VISIT_NO, BC000N4_A374TBM37_DOM_CD, BC000N4_n374TBM37_DOM_CD, BC000N4_A375TBM37_DOM_VAR_NM, BC000N4_n375TBM37_DOM_VAR_NM,
            BC000N4_A376TBM37_DOM_ITM_GRP_OID, BC000N4_n376TBM37_DOM_ITM_GRP_OID, BC000N4_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, BC000N4_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, BC000N4_A612TBM37_DOM_ITM_GRP_ROWNO, BC000N4_n612TBM37_DOM_ITM_GRP_ROWNO, BC000N4_A274TBM37_DEL_FLG, BC000N4_n274TBM37_DEL_FLG, BC000N4_A277TBM37_CRT_PROG_NM, BC000N4_n277TBM37_CRT_PROG_NM,
            BC000N4_A280TBM37_UPD_PROG_NM, BC000N4_n280TBM37_UPD_PROG_NM
            }
            , new Object[] {
            BC000N5_A271TBM37_STUDY_ID, BC000N5_A272TBM37_CRF_ID, BC000N5_A372TBM37_CRF_ITEM_GRP_DIV, BC000N5_A273TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000N9_A271TBM37_STUDY_ID, BC000N9_A272TBM37_CRF_ID, BC000N9_A372TBM37_CRF_ITEM_GRP_DIV, BC000N9_A273TBM37_CRF_ITEM_GRP_CD, BC000N9_A275TBM37_CRT_DATETIME, BC000N9_n275TBM37_CRT_DATETIME, BC000N9_A276TBM37_CRT_USER_ID, BC000N9_n276TBM37_CRT_USER_ID, BC000N9_A278TBM37_UPD_DATETIME, BC000N9_n278TBM37_UPD_DATETIME,
            BC000N9_A279TBM37_UPD_USER_ID, BC000N9_n279TBM37_UPD_USER_ID, BC000N9_A281TBM37_UPD_CNT, BC000N9_n281TBM37_UPD_CNT, BC000N9_A373TBM37_VISIT_NO, BC000N9_n373TBM37_VISIT_NO, BC000N9_A374TBM37_DOM_CD, BC000N9_n374TBM37_DOM_CD, BC000N9_A375TBM37_DOM_VAR_NM, BC000N9_n375TBM37_DOM_VAR_NM,
            BC000N9_A376TBM37_DOM_ITM_GRP_OID, BC000N9_n376TBM37_DOM_ITM_GRP_OID, BC000N9_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, BC000N9_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, BC000N9_A612TBM37_DOM_ITM_GRP_ROWNO, BC000N9_n612TBM37_DOM_ITM_GRP_ROWNO, BC000N9_A274TBM37_DEL_FLG, BC000N9_n274TBM37_DEL_FLG, BC000N9_A277TBM37_CRT_PROG_NM, BC000N9_n277TBM37_CRT_PROG_NM,
            BC000N9_A280TBM37_UPD_PROG_NM, BC000N9_n280TBM37_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM37_CRF_DOM_MAP_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110N2 */
      e110N2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_N ;
   private byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z272TBM37_CRF_ID ;
   private short A272TBM37_CRF_ID ;
   private short A373TBM37_VISIT_NO ;
   private short A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A612TBM37_DOM_ITM_GRP_ROWNO ;
   private short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id_Z ;
   private short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_Z ;
   private short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_Z ;
   private short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_Z ;
   private short Z373TBM37_VISIT_NO ;
   private short Z377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short Z612TBM37_DOM_ITM_GRP_ROWNO ;
   private short RcdFound22 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z271TBM37_STUDY_ID ;
   private long A271TBM37_STUDY_ID ;
   private long A281TBM37_UPD_CNT ;
   private long gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id_Z ;
   private long gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_Z ;
   private long Z281TBM37_UPD_CNT ;
   private long O281TBM37_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode22 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A275TBM37_CRT_DATETIME ;
   private java.util.Date A278TBM37_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_Z ;
   private java.util.Date Z275TBM37_CRT_DATETIME ;
   private java.util.Date Z278TBM37_UPD_DATETIME ;
   private boolean n275TBM37_CRT_DATETIME ;
   private boolean n276TBM37_CRT_USER_ID ;
   private boolean n278TBM37_UPD_DATETIME ;
   private boolean n279TBM37_UPD_USER_ID ;
   private boolean n281TBM37_UPD_CNT ;
   private boolean n373TBM37_VISIT_NO ;
   private boolean n374TBM37_DOM_CD ;
   private boolean n375TBM37_DOM_VAR_NM ;
   private boolean n376TBM37_DOM_ITM_GRP_OID ;
   private boolean n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n274TBM37_DEL_FLG ;
   private boolean n277TBM37_CRT_PROG_NM ;
   private boolean n280TBM37_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z372TBM37_CRF_ITEM_GRP_DIV ;
   private String A372TBM37_CRF_ITEM_GRP_DIV ;
   private String Z273TBM37_CRF_ITEM_GRP_CD ;
   private String A273TBM37_CRF_ITEM_GRP_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A374TBM37_DOM_CD ;
   private String A375TBM37_DOM_VAR_NM ;
   private String A376TBM37_DOM_ITM_GRP_OID ;
   private String A274TBM37_DEL_FLG ;
   private String A276TBM37_CRT_USER_ID ;
   private String A277TBM37_CRT_PROG_NM ;
   private String A279TBM37_UPD_USER_ID ;
   private String A280TBM37_UPD_PROG_NM ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_Z ;
   private String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_Z ;
   private String Z276TBM37_CRT_USER_ID ;
   private String Z279TBM37_UPD_USER_ID ;
   private String Z374TBM37_DOM_CD ;
   private String Z375TBM37_DOM_VAR_NM ;
   private String Z376TBM37_DOM_ITM_GRP_OID ;
   private String Z274TBM37_DEL_FLG ;
   private String Z277TBM37_CRT_PROG_NM ;
   private String Z280TBM37_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM37_CRF_DOM_MAP bcTBM37_CRF_DOM_MAP ;
   private IDataStoreProvider pr_default ;
   private long[] BC000N4_A271TBM37_STUDY_ID ;
   private short[] BC000N4_A272TBM37_CRF_ID ;
   private String[] BC000N4_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] BC000N4_A273TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000N4_A275TBM37_CRT_DATETIME ;
   private boolean[] BC000N4_n275TBM37_CRT_DATETIME ;
   private String[] BC000N4_A276TBM37_CRT_USER_ID ;
   private boolean[] BC000N4_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] BC000N4_A278TBM37_UPD_DATETIME ;
   private boolean[] BC000N4_n278TBM37_UPD_DATETIME ;
   private String[] BC000N4_A279TBM37_UPD_USER_ID ;
   private boolean[] BC000N4_n279TBM37_UPD_USER_ID ;
   private long[] BC000N4_A281TBM37_UPD_CNT ;
   private boolean[] BC000N4_n281TBM37_UPD_CNT ;
   private short[] BC000N4_A373TBM37_VISIT_NO ;
   private boolean[] BC000N4_n373TBM37_VISIT_NO ;
   private String[] BC000N4_A374TBM37_DOM_CD ;
   private boolean[] BC000N4_n374TBM37_DOM_CD ;
   private String[] BC000N4_A375TBM37_DOM_VAR_NM ;
   private boolean[] BC000N4_n375TBM37_DOM_VAR_NM ;
   private String[] BC000N4_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] BC000N4_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] BC000N4_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000N4_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000N4_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000N4_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] BC000N4_A274TBM37_DEL_FLG ;
   private boolean[] BC000N4_n274TBM37_DEL_FLG ;
   private String[] BC000N4_A277TBM37_CRT_PROG_NM ;
   private boolean[] BC000N4_n277TBM37_CRT_PROG_NM ;
   private String[] BC000N4_A280TBM37_UPD_PROG_NM ;
   private boolean[] BC000N4_n280TBM37_UPD_PROG_NM ;
   private long[] BC000N5_A271TBM37_STUDY_ID ;
   private short[] BC000N5_A272TBM37_CRF_ID ;
   private String[] BC000N5_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] BC000N5_A273TBM37_CRF_ITEM_GRP_CD ;
   private long[] BC000N3_A271TBM37_STUDY_ID ;
   private short[] BC000N3_A272TBM37_CRF_ID ;
   private String[] BC000N3_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] BC000N3_A273TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000N3_A275TBM37_CRT_DATETIME ;
   private boolean[] BC000N3_n275TBM37_CRT_DATETIME ;
   private String[] BC000N3_A276TBM37_CRT_USER_ID ;
   private boolean[] BC000N3_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] BC000N3_A278TBM37_UPD_DATETIME ;
   private boolean[] BC000N3_n278TBM37_UPD_DATETIME ;
   private String[] BC000N3_A279TBM37_UPD_USER_ID ;
   private boolean[] BC000N3_n279TBM37_UPD_USER_ID ;
   private long[] BC000N3_A281TBM37_UPD_CNT ;
   private boolean[] BC000N3_n281TBM37_UPD_CNT ;
   private short[] BC000N3_A373TBM37_VISIT_NO ;
   private boolean[] BC000N3_n373TBM37_VISIT_NO ;
   private String[] BC000N3_A374TBM37_DOM_CD ;
   private boolean[] BC000N3_n374TBM37_DOM_CD ;
   private String[] BC000N3_A375TBM37_DOM_VAR_NM ;
   private boolean[] BC000N3_n375TBM37_DOM_VAR_NM ;
   private String[] BC000N3_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] BC000N3_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] BC000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000N3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000N3_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000N3_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] BC000N3_A274TBM37_DEL_FLG ;
   private boolean[] BC000N3_n274TBM37_DEL_FLG ;
   private String[] BC000N3_A277TBM37_CRT_PROG_NM ;
   private boolean[] BC000N3_n277TBM37_CRT_PROG_NM ;
   private String[] BC000N3_A280TBM37_UPD_PROG_NM ;
   private boolean[] BC000N3_n280TBM37_UPD_PROG_NM ;
   private long[] BC000N2_A271TBM37_STUDY_ID ;
   private short[] BC000N2_A272TBM37_CRF_ID ;
   private String[] BC000N2_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] BC000N2_A273TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000N2_A275TBM37_CRT_DATETIME ;
   private boolean[] BC000N2_n275TBM37_CRT_DATETIME ;
   private String[] BC000N2_A276TBM37_CRT_USER_ID ;
   private boolean[] BC000N2_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] BC000N2_A278TBM37_UPD_DATETIME ;
   private boolean[] BC000N2_n278TBM37_UPD_DATETIME ;
   private String[] BC000N2_A279TBM37_UPD_USER_ID ;
   private boolean[] BC000N2_n279TBM37_UPD_USER_ID ;
   private long[] BC000N2_A281TBM37_UPD_CNT ;
   private boolean[] BC000N2_n281TBM37_UPD_CNT ;
   private short[] BC000N2_A373TBM37_VISIT_NO ;
   private boolean[] BC000N2_n373TBM37_VISIT_NO ;
   private String[] BC000N2_A374TBM37_DOM_CD ;
   private boolean[] BC000N2_n374TBM37_DOM_CD ;
   private String[] BC000N2_A375TBM37_DOM_VAR_NM ;
   private boolean[] BC000N2_n375TBM37_DOM_VAR_NM ;
   private String[] BC000N2_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] BC000N2_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] BC000N2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000N2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000N2_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000N2_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] BC000N2_A274TBM37_DEL_FLG ;
   private boolean[] BC000N2_n274TBM37_DEL_FLG ;
   private String[] BC000N2_A277TBM37_CRT_PROG_NM ;
   private boolean[] BC000N2_n277TBM37_CRT_PROG_NM ;
   private String[] BC000N2_A280TBM37_UPD_PROG_NM ;
   private boolean[] BC000N2_n280TBM37_UPD_PROG_NM ;
   private long[] BC000N9_A271TBM37_STUDY_ID ;
   private short[] BC000N9_A272TBM37_CRF_ID ;
   private String[] BC000N9_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] BC000N9_A273TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC000N9_A275TBM37_CRT_DATETIME ;
   private boolean[] BC000N9_n275TBM37_CRT_DATETIME ;
   private String[] BC000N9_A276TBM37_CRT_USER_ID ;
   private boolean[] BC000N9_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] BC000N9_A278TBM37_UPD_DATETIME ;
   private boolean[] BC000N9_n278TBM37_UPD_DATETIME ;
   private String[] BC000N9_A279TBM37_UPD_USER_ID ;
   private boolean[] BC000N9_n279TBM37_UPD_USER_ID ;
   private long[] BC000N9_A281TBM37_UPD_CNT ;
   private boolean[] BC000N9_n281TBM37_UPD_CNT ;
   private short[] BC000N9_A373TBM37_VISIT_NO ;
   private boolean[] BC000N9_n373TBM37_VISIT_NO ;
   private String[] BC000N9_A374TBM37_DOM_CD ;
   private boolean[] BC000N9_n374TBM37_DOM_CD ;
   private String[] BC000N9_A375TBM37_DOM_VAR_NM ;
   private boolean[] BC000N9_n375TBM37_DOM_VAR_NM ;
   private String[] BC000N9_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] BC000N9_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] BC000N9_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] BC000N9_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] BC000N9_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] BC000N9_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] BC000N9_A274TBM37_DEL_FLG ;
   private boolean[] BC000N9_n274TBM37_DEL_FLG ;
   private String[] BC000N9_A277TBM37_CRT_PROG_NM ;
   private boolean[] BC000N9_n277TBM37_CRT_PROG_NM ;
   private String[] BC000N9_A280TBM37_UPD_PROG_NM ;
   private boolean[] BC000N9_n280TBM37_UPD_PROG_NM ;
}

final  class tbm37_crf_dom_map_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000N2", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000N3", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000N4", "SELECT TM1.`TBM37_STUDY_ID`, TM1.`TBM37_CRF_ID`, TM1.`TBM37_CRF_ITEM_GRP_DIV`, TM1.`TBM37_CRF_ITEM_GRP_CD`, TM1.`TBM37_CRT_DATETIME`, TM1.`TBM37_CRT_USER_ID`, TM1.`TBM37_UPD_DATETIME`, TM1.`TBM37_UPD_USER_ID`, TM1.`TBM37_UPD_CNT`, TM1.`TBM37_VISIT_NO`, TM1.`TBM37_DOM_CD`, TM1.`TBM37_DOM_VAR_NM`, TM1.`TBM37_DOM_ITM_GRP_OID`, TM1.`TBM37_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM37_DOM_ITM_GRP_ROWNO`, TM1.`TBM37_DEL_FLG`, TM1.`TBM37_CRT_PROG_NM`, TM1.`TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` TM1 WHERE TM1.`TBM37_STUDY_ID` = ? and TM1.`TBM37_CRF_ID` = ? and TM1.`TBM37_CRF_ITEM_GRP_DIV` = ? and TM1.`TBM37_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBM37_STUDY_ID`, TM1.`TBM37_CRF_ID`, TM1.`TBM37_CRF_ITEM_GRP_DIV`, TM1.`TBM37_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000N5", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000N6", "INSERT INTO `TBM37_CRF_DOM_MAP` (`TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000N7", "UPDATE `TBM37_CRF_DOM_MAP` SET `TBM37_CRT_DATETIME`=?, `TBM37_CRT_USER_ID`=?, `TBM37_UPD_DATETIME`=?, `TBM37_UPD_USER_ID`=?, `TBM37_UPD_CNT`=?, `TBM37_VISIT_NO`=?, `TBM37_DOM_CD`=?, `TBM37_DOM_VAR_NM`=?, `TBM37_DOM_ITM_GRP_OID`=?, `TBM37_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM37_DOM_ITM_GRP_ROWNO`=?, `TBM37_DEL_FLG`=?, `TBM37_CRT_PROG_NM`=?, `TBM37_UPD_PROG_NM`=?  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000N8", "DELETE FROM `TBM37_CRF_DOM_MAP`  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000N9", "SELECT TM1.`TBM37_STUDY_ID`, TM1.`TBM37_CRF_ID`, TM1.`TBM37_CRF_ITEM_GRP_DIV`, TM1.`TBM37_CRF_ITEM_GRP_CD`, TM1.`TBM37_CRT_DATETIME`, TM1.`TBM37_CRT_USER_ID`, TM1.`TBM37_UPD_DATETIME`, TM1.`TBM37_UPD_USER_ID`, TM1.`TBM37_UPD_CNT`, TM1.`TBM37_VISIT_NO`, TM1.`TBM37_DOM_CD`, TM1.`TBM37_DOM_VAR_NM`, TM1.`TBM37_DOM_ITM_GRP_OID`, TM1.`TBM37_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM37_DOM_ITM_GRP_ROWNO`, TM1.`TBM37_DEL_FLG`, TM1.`TBM37_CRT_PROG_NM`, TM1.`TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` TM1 WHERE TM1.`TBM37_STUDY_ID` = ? and TM1.`TBM37_CRF_ID` = ? and TM1.`TBM37_CRF_ITEM_GRP_DIV` = ? and TM1.`TBM37_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBM37_STUDY_ID`, TM1.`TBM37_CRF_ID`, TM1.`TBM37_CRF_ITEM_GRP_DIV`, TM1.`TBM37_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
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
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 50);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 50);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 40);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 2);
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
                  stmt.setVarchar(9, (String)parms[17], 50);
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
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
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
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 40);
               }
               stmt.setLong(15, ((Number) parms[28]).longValue());
               stmt.setShort(16, ((Number) parms[29]).shortValue());
               stmt.setVarchar(17, (String)parms[30], 1, false);
               stmt.setVarchar(18, (String)parms[31], 50, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
      }
   }

}

