/*
               File: tbm42_study_cdisc_domain_bc
        Description: 試験別CDISCドメインマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:29.40
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
            Z886TBM42_STUDY_ID = A886TBM42_STUDY_ID ;
            Z893TBM42_DOM_CD = A893TBM42_DOM_CD ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e121I2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV8W_TXT = "" ;
      AV8W_TXT = AV8W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A886TBM42_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + "ドメインコード:" + A893TBM42_DOM_CD + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A888TBM42_DOM_ENM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A889TBM42_DOM_JNM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A890TBM42_DOM_GRP_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A891TBM42_NOTE + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A892TBM42_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A887TBM42_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A916TBM42_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A908TBM42_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A909TBM42_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A917TBM42_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A910TBM42_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A911TBM42_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A918TBM42_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = GXutil.strReplace( AV8W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV8W_TXT) ;
   }

   public void S1168( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1I53( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z916TBM42_CRT_DATETIME = A916TBM42_CRT_DATETIME ;
         Z908TBM42_CRT_USER_ID = A908TBM42_CRT_USER_ID ;
         Z917TBM42_UPD_DATETIME = A917TBM42_UPD_DATETIME ;
         Z910TBM42_UPD_USER_ID = A910TBM42_UPD_USER_ID ;
         Z918TBM42_UPD_CNT = A918TBM42_UPD_CNT ;
         Z888TBM42_DOM_ENM = A888TBM42_DOM_ENM ;
         Z889TBM42_DOM_JNM = A889TBM42_DOM_JNM ;
         Z890TBM42_DOM_GRP_NM = A890TBM42_DOM_GRP_NM ;
         Z891TBM42_NOTE = A891TBM42_NOTE ;
         Z892TBM42_ORDER = A892TBM42_ORDER ;
         Z887TBM42_DEL_FLG = A887TBM42_DEL_FLG ;
         Z909TBM42_CRT_PROG_NM = A909TBM42_CRT_PROG_NM ;
         Z911TBM42_UPD_PROG_NM = A911TBM42_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z886TBM42_STUDY_ID = A886TBM42_STUDY_ID ;
         Z893TBM42_DOM_CD = A893TBM42_DOM_CD ;
         Z916TBM42_CRT_DATETIME = A916TBM42_CRT_DATETIME ;
         Z908TBM42_CRT_USER_ID = A908TBM42_CRT_USER_ID ;
         Z917TBM42_UPD_DATETIME = A917TBM42_UPD_DATETIME ;
         Z910TBM42_UPD_USER_ID = A910TBM42_UPD_USER_ID ;
         Z918TBM42_UPD_CNT = A918TBM42_UPD_CNT ;
         Z888TBM42_DOM_ENM = A888TBM42_DOM_ENM ;
         Z889TBM42_DOM_JNM = A889TBM42_DOM_JNM ;
         Z890TBM42_DOM_GRP_NM = A890TBM42_DOM_GRP_NM ;
         Z891TBM42_NOTE = A891TBM42_NOTE ;
         Z892TBM42_ORDER = A892TBM42_ORDER ;
         Z887TBM42_DEL_FLG = A887TBM42_DEL_FLG ;
         Z909TBM42_CRT_PROG_NM = A909TBM42_CRT_PROG_NM ;
         Z911TBM42_UPD_PROG_NM = A911TBM42_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {new Long(A886TBM42_STUDY_ID), A893TBM42_DOM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A916TBM42_CRT_DATETIME = BC001I4_A916TBM42_CRT_DATETIME[0] ;
         n916TBM42_CRT_DATETIME = BC001I4_n916TBM42_CRT_DATETIME[0] ;
         A908TBM42_CRT_USER_ID = BC001I4_A908TBM42_CRT_USER_ID[0] ;
         n908TBM42_CRT_USER_ID = BC001I4_n908TBM42_CRT_USER_ID[0] ;
         A917TBM42_UPD_DATETIME = BC001I4_A917TBM42_UPD_DATETIME[0] ;
         n917TBM42_UPD_DATETIME = BC001I4_n917TBM42_UPD_DATETIME[0] ;
         A910TBM42_UPD_USER_ID = BC001I4_A910TBM42_UPD_USER_ID[0] ;
         n910TBM42_UPD_USER_ID = BC001I4_n910TBM42_UPD_USER_ID[0] ;
         A918TBM42_UPD_CNT = BC001I4_A918TBM42_UPD_CNT[0] ;
         n918TBM42_UPD_CNT = BC001I4_n918TBM42_UPD_CNT[0] ;
         A888TBM42_DOM_ENM = BC001I4_A888TBM42_DOM_ENM[0] ;
         n888TBM42_DOM_ENM = BC001I4_n888TBM42_DOM_ENM[0] ;
         A889TBM42_DOM_JNM = BC001I4_A889TBM42_DOM_JNM[0] ;
         n889TBM42_DOM_JNM = BC001I4_n889TBM42_DOM_JNM[0] ;
         A890TBM42_DOM_GRP_NM = BC001I4_A890TBM42_DOM_GRP_NM[0] ;
         n890TBM42_DOM_GRP_NM = BC001I4_n890TBM42_DOM_GRP_NM[0] ;
         A891TBM42_NOTE = BC001I4_A891TBM42_NOTE[0] ;
         n891TBM42_NOTE = BC001I4_n891TBM42_NOTE[0] ;
         A892TBM42_ORDER = BC001I4_A892TBM42_ORDER[0] ;
         n892TBM42_ORDER = BC001I4_n892TBM42_ORDER[0] ;
         A887TBM42_DEL_FLG = BC001I4_A887TBM42_DEL_FLG[0] ;
         n887TBM42_DEL_FLG = BC001I4_n887TBM42_DEL_FLG[0] ;
         A909TBM42_CRT_PROG_NM = BC001I4_A909TBM42_CRT_PROG_NM[0] ;
         n909TBM42_CRT_PROG_NM = BC001I4_n909TBM42_CRT_PROG_NM[0] ;
         A911TBM42_UPD_PROG_NM = BC001I4_A911TBM42_UPD_PROG_NM[0] ;
         n911TBM42_UPD_PROG_NM = BC001I4_n911TBM42_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A916TBM42_CRT_DATETIME) || (( A916TBM42_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A916TBM42_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A917TBM42_UPD_DATETIME) || (( A917TBM42_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A917TBM42_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
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
      pr_default.execute(3, new Object[] {new Long(A886TBM42_STUDY_ID), A893TBM42_DOM_CD});
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
      pr_default.execute(1, new Object[] {new Long(A886TBM42_STUDY_ID), A893TBM42_DOM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1I53( 8) ;
         RcdFound53 = (short)(1) ;
         A886TBM42_STUDY_ID = BC001I3_A886TBM42_STUDY_ID[0] ;
         A893TBM42_DOM_CD = BC001I3_A893TBM42_DOM_CD[0] ;
         A916TBM42_CRT_DATETIME = BC001I3_A916TBM42_CRT_DATETIME[0] ;
         n916TBM42_CRT_DATETIME = BC001I3_n916TBM42_CRT_DATETIME[0] ;
         A908TBM42_CRT_USER_ID = BC001I3_A908TBM42_CRT_USER_ID[0] ;
         n908TBM42_CRT_USER_ID = BC001I3_n908TBM42_CRT_USER_ID[0] ;
         A917TBM42_UPD_DATETIME = BC001I3_A917TBM42_UPD_DATETIME[0] ;
         n917TBM42_UPD_DATETIME = BC001I3_n917TBM42_UPD_DATETIME[0] ;
         A910TBM42_UPD_USER_ID = BC001I3_A910TBM42_UPD_USER_ID[0] ;
         n910TBM42_UPD_USER_ID = BC001I3_n910TBM42_UPD_USER_ID[0] ;
         A918TBM42_UPD_CNT = BC001I3_A918TBM42_UPD_CNT[0] ;
         n918TBM42_UPD_CNT = BC001I3_n918TBM42_UPD_CNT[0] ;
         A888TBM42_DOM_ENM = BC001I3_A888TBM42_DOM_ENM[0] ;
         n888TBM42_DOM_ENM = BC001I3_n888TBM42_DOM_ENM[0] ;
         A889TBM42_DOM_JNM = BC001I3_A889TBM42_DOM_JNM[0] ;
         n889TBM42_DOM_JNM = BC001I3_n889TBM42_DOM_JNM[0] ;
         A890TBM42_DOM_GRP_NM = BC001I3_A890TBM42_DOM_GRP_NM[0] ;
         n890TBM42_DOM_GRP_NM = BC001I3_n890TBM42_DOM_GRP_NM[0] ;
         A891TBM42_NOTE = BC001I3_A891TBM42_NOTE[0] ;
         n891TBM42_NOTE = BC001I3_n891TBM42_NOTE[0] ;
         A892TBM42_ORDER = BC001I3_A892TBM42_ORDER[0] ;
         n892TBM42_ORDER = BC001I3_n892TBM42_ORDER[0] ;
         A887TBM42_DEL_FLG = BC001I3_A887TBM42_DEL_FLG[0] ;
         n887TBM42_DEL_FLG = BC001I3_n887TBM42_DEL_FLG[0] ;
         A909TBM42_CRT_PROG_NM = BC001I3_A909TBM42_CRT_PROG_NM[0] ;
         n909TBM42_CRT_PROG_NM = BC001I3_n909TBM42_CRT_PROG_NM[0] ;
         A911TBM42_UPD_PROG_NM = BC001I3_A911TBM42_UPD_PROG_NM[0] ;
         n911TBM42_UPD_PROG_NM = BC001I3_n911TBM42_UPD_PROG_NM[0] ;
         O918TBM42_UPD_CNT = A918TBM42_UPD_CNT ;
         n918TBM42_UPD_CNT = false ;
         Z886TBM42_STUDY_ID = A886TBM42_STUDY_ID ;
         Z893TBM42_DOM_CD = A893TBM42_DOM_CD ;
         sMode53 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1I53( ) ;
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
         pr_default.execute(0, new Object[] {new Long(A886TBM42_STUDY_ID), A893TBM42_DOM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM42_STUDY_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z916TBM42_CRT_DATETIME.equals( BC001I2_A916TBM42_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z908TBM42_CRT_USER_ID, BC001I2_A908TBM42_CRT_USER_ID[0]) != 0 ) || !( Z917TBM42_UPD_DATETIME.equals( BC001I2_A917TBM42_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z910TBM42_UPD_USER_ID, BC001I2_A910TBM42_UPD_USER_ID[0]) != 0 ) || ( Z918TBM42_UPD_CNT != BC001I2_A918TBM42_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z888TBM42_DOM_ENM, BC001I2_A888TBM42_DOM_ENM[0]) != 0 ) || ( GXutil.strcmp(Z889TBM42_DOM_JNM, BC001I2_A889TBM42_DOM_JNM[0]) != 0 ) || ( GXutil.strcmp(Z890TBM42_DOM_GRP_NM, BC001I2_A890TBM42_DOM_GRP_NM[0]) != 0 ) || ( GXutil.strcmp(Z891TBM42_NOTE, BC001I2_A891TBM42_NOTE[0]) != 0 ) || ( Z892TBM42_ORDER != BC001I2_A892TBM42_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z887TBM42_DEL_FLG, BC001I2_A887TBM42_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z909TBM42_CRT_PROG_NM, BC001I2_A909TBM42_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z911TBM42_UPD_PROG_NM, BC001I2_A911TBM42_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(4, new Object[] {new Long(A886TBM42_STUDY_ID), A893TBM42_DOM_CD, new Boolean(n916TBM42_CRT_DATETIME), A916TBM42_CRT_DATETIME, new Boolean(n908TBM42_CRT_USER_ID), A908TBM42_CRT_USER_ID, new Boolean(n917TBM42_UPD_DATETIME), A917TBM42_UPD_DATETIME, new Boolean(n910TBM42_UPD_USER_ID), A910TBM42_UPD_USER_ID, new Boolean(n918TBM42_UPD_CNT), new Long(A918TBM42_UPD_CNT), new Boolean(n888TBM42_DOM_ENM), A888TBM42_DOM_ENM, new Boolean(n889TBM42_DOM_JNM), A889TBM42_DOM_JNM, new Boolean(n890TBM42_DOM_GRP_NM), A890TBM42_DOM_GRP_NM, new Boolean(n891TBM42_NOTE), A891TBM42_NOTE, new Boolean(n892TBM42_ORDER), new Integer(A892TBM42_ORDER), new Boolean(n887TBM42_DEL_FLG), A887TBM42_DEL_FLG, new Boolean(n909TBM42_CRT_PROG_NM), A909TBM42_CRT_PROG_NM, new Boolean(n911TBM42_UPD_PROG_NM), A911TBM42_UPD_PROG_NM});
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
                  pr_default.execute(5, new Object[] {new Boolean(n916TBM42_CRT_DATETIME), A916TBM42_CRT_DATETIME, new Boolean(n908TBM42_CRT_USER_ID), A908TBM42_CRT_USER_ID, new Boolean(n917TBM42_UPD_DATETIME), A917TBM42_UPD_DATETIME, new Boolean(n910TBM42_UPD_USER_ID), A910TBM42_UPD_USER_ID, new Boolean(n918TBM42_UPD_CNT), new Long(A918TBM42_UPD_CNT), new Boolean(n888TBM42_DOM_ENM), A888TBM42_DOM_ENM, new Boolean(n889TBM42_DOM_JNM), A889TBM42_DOM_JNM, new Boolean(n890TBM42_DOM_GRP_NM), A890TBM42_DOM_GRP_NM, new Boolean(n891TBM42_NOTE), A891TBM42_NOTE, new Boolean(n892TBM42_ORDER), new Integer(A892TBM42_ORDER), new Boolean(n887TBM42_DEL_FLG), A887TBM42_DEL_FLG, new Boolean(n909TBM42_CRT_PROG_NM), A909TBM42_CRT_PROG_NM, new Boolean(n911TBM42_UPD_PROG_NM), A911TBM42_UPD_PROG_NM, new Long(A886TBM42_STUDY_ID), A893TBM42_DOM_CD});
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
               pr_default.execute(6, new Object[] {new Long(A886TBM42_STUDY_ID), A893TBM42_DOM_CD});
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
      /* Using cursor BC001I9 */
      pr_default.execute(7, new Object[] {new Long(A886TBM42_STUDY_ID), A893TBM42_DOM_CD});
      RcdFound53 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A886TBM42_STUDY_ID = BC001I9_A886TBM42_STUDY_ID[0] ;
         A893TBM42_DOM_CD = BC001I9_A893TBM42_DOM_CD[0] ;
         A916TBM42_CRT_DATETIME = BC001I9_A916TBM42_CRT_DATETIME[0] ;
         n916TBM42_CRT_DATETIME = BC001I9_n916TBM42_CRT_DATETIME[0] ;
         A908TBM42_CRT_USER_ID = BC001I9_A908TBM42_CRT_USER_ID[0] ;
         n908TBM42_CRT_USER_ID = BC001I9_n908TBM42_CRT_USER_ID[0] ;
         A917TBM42_UPD_DATETIME = BC001I9_A917TBM42_UPD_DATETIME[0] ;
         n917TBM42_UPD_DATETIME = BC001I9_n917TBM42_UPD_DATETIME[0] ;
         A910TBM42_UPD_USER_ID = BC001I9_A910TBM42_UPD_USER_ID[0] ;
         n910TBM42_UPD_USER_ID = BC001I9_n910TBM42_UPD_USER_ID[0] ;
         A918TBM42_UPD_CNT = BC001I9_A918TBM42_UPD_CNT[0] ;
         n918TBM42_UPD_CNT = BC001I9_n918TBM42_UPD_CNT[0] ;
         A888TBM42_DOM_ENM = BC001I9_A888TBM42_DOM_ENM[0] ;
         n888TBM42_DOM_ENM = BC001I9_n888TBM42_DOM_ENM[0] ;
         A889TBM42_DOM_JNM = BC001I9_A889TBM42_DOM_JNM[0] ;
         n889TBM42_DOM_JNM = BC001I9_n889TBM42_DOM_JNM[0] ;
         A890TBM42_DOM_GRP_NM = BC001I9_A890TBM42_DOM_GRP_NM[0] ;
         n890TBM42_DOM_GRP_NM = BC001I9_n890TBM42_DOM_GRP_NM[0] ;
         A891TBM42_NOTE = BC001I9_A891TBM42_NOTE[0] ;
         n891TBM42_NOTE = BC001I9_n891TBM42_NOTE[0] ;
         A892TBM42_ORDER = BC001I9_A892TBM42_ORDER[0] ;
         n892TBM42_ORDER = BC001I9_n892TBM42_ORDER[0] ;
         A887TBM42_DEL_FLG = BC001I9_A887TBM42_DEL_FLG[0] ;
         n887TBM42_DEL_FLG = BC001I9_n887TBM42_DEL_FLG[0] ;
         A909TBM42_CRT_PROG_NM = BC001I9_A909TBM42_CRT_PROG_NM[0] ;
         n909TBM42_CRT_PROG_NM = BC001I9_n909TBM42_CRT_PROG_NM[0] ;
         A911TBM42_UPD_PROG_NM = BC001I9_A911TBM42_UPD_PROG_NM[0] ;
         n911TBM42_UPD_PROG_NM = BC001I9_n911TBM42_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1I53( )
   {
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
         A886TBM42_STUDY_ID = BC001I9_A886TBM42_STUDY_ID[0] ;
         A893TBM42_DOM_CD = BC001I9_A893TBM42_DOM_CD[0] ;
         A916TBM42_CRT_DATETIME = BC001I9_A916TBM42_CRT_DATETIME[0] ;
         n916TBM42_CRT_DATETIME = BC001I9_n916TBM42_CRT_DATETIME[0] ;
         A908TBM42_CRT_USER_ID = BC001I9_A908TBM42_CRT_USER_ID[0] ;
         n908TBM42_CRT_USER_ID = BC001I9_n908TBM42_CRT_USER_ID[0] ;
         A917TBM42_UPD_DATETIME = BC001I9_A917TBM42_UPD_DATETIME[0] ;
         n917TBM42_UPD_DATETIME = BC001I9_n917TBM42_UPD_DATETIME[0] ;
         A910TBM42_UPD_USER_ID = BC001I9_A910TBM42_UPD_USER_ID[0] ;
         n910TBM42_UPD_USER_ID = BC001I9_n910TBM42_UPD_USER_ID[0] ;
         A918TBM42_UPD_CNT = BC001I9_A918TBM42_UPD_CNT[0] ;
         n918TBM42_UPD_CNT = BC001I9_n918TBM42_UPD_CNT[0] ;
         A888TBM42_DOM_ENM = BC001I9_A888TBM42_DOM_ENM[0] ;
         n888TBM42_DOM_ENM = BC001I9_n888TBM42_DOM_ENM[0] ;
         A889TBM42_DOM_JNM = BC001I9_A889TBM42_DOM_JNM[0] ;
         n889TBM42_DOM_JNM = BC001I9_n889TBM42_DOM_JNM[0] ;
         A890TBM42_DOM_GRP_NM = BC001I9_A890TBM42_DOM_GRP_NM[0] ;
         n890TBM42_DOM_GRP_NM = BC001I9_n890TBM42_DOM_GRP_NM[0] ;
         A891TBM42_NOTE = BC001I9_A891TBM42_NOTE[0] ;
         n891TBM42_NOTE = BC001I9_n891TBM42_NOTE[0] ;
         A892TBM42_ORDER = BC001I9_A892TBM42_ORDER[0] ;
         n892TBM42_ORDER = BC001I9_n892TBM42_ORDER[0] ;
         A887TBM42_DEL_FLG = BC001I9_A887TBM42_DEL_FLG[0] ;
         n887TBM42_DEL_FLG = BC001I9_n887TBM42_DEL_FLG[0] ;
         A909TBM42_CRT_PROG_NM = BC001I9_A909TBM42_CRT_PROG_NM[0] ;
         n909TBM42_CRT_PROG_NM = BC001I9_n909TBM42_CRT_PROG_NM[0] ;
         A911TBM42_UPD_PROG_NM = BC001I9_A911TBM42_UPD_PROG_NM[0] ;
         n911TBM42_UPD_PROG_NM = BC001I9_n911TBM42_UPD_PROG_NM[0] ;
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
      A916TBM42_CRT_DATETIME = GXutil.now( ) ;
      n916TBM42_CRT_DATETIME = false ;
      GXt_char1 = A908TBM42_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A908TBM42_CRT_USER_ID = GXt_char1 ;
      n908TBM42_CRT_USER_ID = false ;
      A917TBM42_UPD_DATETIME = GXutil.now( ) ;
      n917TBM42_UPD_DATETIME = false ;
      GXt_char1 = A910TBM42_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A910TBM42_UPD_USER_ID = GXt_char1 ;
      n910TBM42_UPD_USER_ID = false ;
      A918TBM42_UPD_CNT = (long)(O918TBM42_UPD_CNT+1) ;
      n918TBM42_UPD_CNT = false ;
   }

   public void beforeUpdate1I53( )
   {
      /* Before Update Rules */
      A917TBM42_UPD_DATETIME = GXutil.now( ) ;
      n917TBM42_UPD_DATETIME = false ;
      GXt_char1 = A910TBM42_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_bc.this.GXt_char1 = GXv_char2[0] ;
      A910TBM42_UPD_USER_ID = GXt_char1 ;
      n910TBM42_UPD_USER_ID = false ;
      A918TBM42_UPD_CNT = (long)(O918TBM42_UPD_CNT+1) ;
      n918TBM42_UPD_CNT = false ;
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
      A916TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n916TBM42_CRT_DATETIME = false ;
      A908TBM42_CRT_USER_ID = "" ;
      n908TBM42_CRT_USER_ID = false ;
      A917TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n917TBM42_UPD_DATETIME = false ;
      A910TBM42_UPD_USER_ID = "" ;
      n910TBM42_UPD_USER_ID = false ;
      A918TBM42_UPD_CNT = 0 ;
      n918TBM42_UPD_CNT = false ;
      A888TBM42_DOM_ENM = "" ;
      n888TBM42_DOM_ENM = false ;
      A889TBM42_DOM_JNM = "" ;
      n889TBM42_DOM_JNM = false ;
      A890TBM42_DOM_GRP_NM = "" ;
      n890TBM42_DOM_GRP_NM = false ;
      A891TBM42_NOTE = "" ;
      n891TBM42_NOTE = false ;
      A892TBM42_ORDER = 0 ;
      n892TBM42_ORDER = false ;
      A887TBM42_DEL_FLG = "" ;
      n887TBM42_DEL_FLG = false ;
      A909TBM42_CRT_PROG_NM = "" ;
      n909TBM42_CRT_PROG_NM = false ;
      A911TBM42_UPD_PROG_NM = "" ;
      n911TBM42_UPD_PROG_NM = false ;
      O918TBM42_UPD_CNT = A918TBM42_UPD_CNT ;
      n918TBM42_UPD_CNT = false ;
   }

   public void initAll1I53( )
   {
      A886TBM42_STUDY_ID = 0 ;
      A893TBM42_DOM_CD = "" ;
      initializeNonKey1I53( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow53( SdtTBM42_STUDY_CDISC_DOMAIN obj53 )
   {
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( Gx_mode );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime( A916TBM42_CRT_DATETIME );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id( A908TBM42_CRT_USER_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime( A917TBM42_UPD_DATETIME );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id( A910TBM42_UPD_USER_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt( A918TBM42_UPD_CNT );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm( A888TBM42_DOM_ENM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm( A889TBM42_DOM_JNM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm( A890TBM42_DOM_GRP_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note( A891TBM42_NOTE );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order( A892TBM42_ORDER );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg( A887TBM42_DEL_FLG );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm( A909TBM42_CRT_PROG_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm( A911TBM42_UPD_PROG_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id( A886TBM42_STUDY_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd( A893TBM42_DOM_CD );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z( Z886TBM42_STUDY_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z( Z893TBM42_DOM_CD );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z( Z888TBM42_DOM_ENM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z( Z889TBM42_DOM_JNM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z( Z890TBM42_DOM_GRP_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z( Z891TBM42_NOTE );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z( Z892TBM42_ORDER );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z( Z887TBM42_DEL_FLG );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z( Z916TBM42_CRT_DATETIME );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z( Z908TBM42_CRT_USER_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z( Z909TBM42_CRT_PROG_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z( Z917TBM42_UPD_DATETIME );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z( Z910TBM42_UPD_USER_ID );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z( Z911TBM42_UPD_PROG_NM );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z( Z918TBM42_UPD_CNT );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N( (byte)((byte)((n888TBM42_DOM_ENM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N( (byte)((byte)((n889TBM42_DOM_JNM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N( (byte)((byte)((n890TBM42_DOM_GRP_NM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N( (byte)((byte)((n891TBM42_NOTE)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N( (byte)((byte)((n892TBM42_ORDER)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N( (byte)((byte)((n887TBM42_DEL_FLG)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N( (byte)((byte)((n916TBM42_CRT_DATETIME)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N( (byte)((byte)((n908TBM42_CRT_USER_ID)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N( (byte)((byte)((n909TBM42_CRT_PROG_NM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N( (byte)((byte)((n917TBM42_UPD_DATETIME)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N( (byte)((byte)((n910TBM42_UPD_USER_ID)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N( (byte)((byte)((n911TBM42_UPD_PROG_NM)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N( (byte)((byte)((n918TBM42_UPD_CNT)?1:0)) );
      obj53.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( Gx_mode );
   }

   public void RowToVars53( SdtTBM42_STUDY_CDISC_DOMAIN obj53 ,
                            int forceLoad )
   {
      Gx_mode = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode() ;
      A916TBM42_CRT_DATETIME = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime() ;
      n916TBM42_CRT_DATETIME = false ;
      A908TBM42_CRT_USER_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id() ;
      n908TBM42_CRT_USER_ID = false ;
      A917TBM42_UPD_DATETIME = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime() ;
      n917TBM42_UPD_DATETIME = false ;
      A910TBM42_UPD_USER_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id() ;
      n910TBM42_UPD_USER_ID = false ;
      A918TBM42_UPD_CNT = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt() ;
      n918TBM42_UPD_CNT = false ;
      A888TBM42_DOM_ENM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm() ;
      n888TBM42_DOM_ENM = false ;
      A889TBM42_DOM_JNM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm() ;
      n889TBM42_DOM_JNM = false ;
      A890TBM42_DOM_GRP_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm() ;
      n890TBM42_DOM_GRP_NM = false ;
      A891TBM42_NOTE = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note() ;
      n891TBM42_NOTE = false ;
      A892TBM42_ORDER = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order() ;
      n892TBM42_ORDER = false ;
      A887TBM42_DEL_FLG = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg() ;
      n887TBM42_DEL_FLG = false ;
      A909TBM42_CRT_PROG_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm() ;
      n909TBM42_CRT_PROG_NM = false ;
      A911TBM42_UPD_PROG_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm() ;
      n911TBM42_UPD_PROG_NM = false ;
      A886TBM42_STUDY_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id() ;
      A893TBM42_DOM_CD = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd() ;
      Z886TBM42_STUDY_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z() ;
      Z893TBM42_DOM_CD = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z() ;
      Z888TBM42_DOM_ENM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z() ;
      Z889TBM42_DOM_JNM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z() ;
      Z890TBM42_DOM_GRP_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z() ;
      Z891TBM42_NOTE = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z() ;
      Z892TBM42_ORDER = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z() ;
      Z887TBM42_DEL_FLG = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z() ;
      Z916TBM42_CRT_DATETIME = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z() ;
      Z908TBM42_CRT_USER_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z() ;
      Z909TBM42_CRT_PROG_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z() ;
      Z917TBM42_UPD_DATETIME = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z() ;
      Z910TBM42_UPD_USER_ID = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z() ;
      Z911TBM42_UPD_PROG_NM = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z() ;
      Z918TBM42_UPD_CNT = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z() ;
      O918TBM42_UPD_CNT = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z() ;
      n888TBM42_DOM_ENM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N()==0)?false:true) ;
      n889TBM42_DOM_JNM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N()==0)?false:true) ;
      n890TBM42_DOM_GRP_NM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N()==0)?false:true) ;
      n891TBM42_NOTE = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N()==0)?false:true) ;
      n892TBM42_ORDER = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N()==0)?false:true) ;
      n887TBM42_DEL_FLG = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N()==0)?false:true) ;
      n916TBM42_CRT_DATETIME = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N()==0)?false:true) ;
      n908TBM42_CRT_USER_ID = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N()==0)?false:true) ;
      n909TBM42_CRT_PROG_NM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N()==0)?false:true) ;
      n917TBM42_UPD_DATETIME = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N()==0)?false:true) ;
      n910TBM42_UPD_USER_ID = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N()==0)?false:true) ;
      n911TBM42_UPD_PROG_NM = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N()==0)?false:true) ;
      n918TBM42_UPD_CNT = (boolean)((obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj53.getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A886TBM42_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A893TBM42_DOM_CD = (String)getParm(obj,1) ;
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
         Z886TBM42_STUDY_ID = A886TBM42_STUDY_ID ;
         Z893TBM42_DOM_CD = A893TBM42_DOM_CD ;
         O918TBM42_UPD_CNT = A918TBM42_UPD_CNT ;
         n918TBM42_UPD_CNT = false ;
      }
      zm1I53( -8) ;
      sMode53 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1I53( ) ;
      Gx_mode = sMode53 ;
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
      if ( RcdFound53 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A886TBM42_STUDY_ID != Z886TBM42_STUDY_ID ) || ( GXutil.strcmp(A893TBM42_DOM_CD, Z893TBM42_DOM_CD) != 0 ) )
         {
            A886TBM42_STUDY_ID = Z886TBM42_STUDY_ID ;
            A893TBM42_DOM_CD = Z893TBM42_DOM_CD ;
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
            if ( ( A886TBM42_STUDY_ID != Z886TBM42_STUDY_ID ) || ( GXutil.strcmp(A893TBM42_DOM_CD, Z893TBM42_DOM_CD) != 0 ) )
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
         else if ( ( A886TBM42_STUDY_ID != Z886TBM42_STUDY_ID ) || ( GXutil.strcmp(A893TBM42_DOM_CD, Z893TBM42_DOM_CD) != 0 ) )
         {
            A886TBM42_STUDY_ID = Z886TBM42_STUDY_ID ;
            A893TBM42_DOM_CD = Z893TBM42_DOM_CD ;
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
         if ( ( A886TBM42_STUDY_ID != Z886TBM42_STUDY_ID ) || ( GXutil.strcmp(A893TBM42_DOM_CD, Z893TBM42_DOM_CD) != 0 ) )
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
                  /* Execute user subroutine: S1168 */
                  S1168 ();
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
      Z893TBM42_DOM_CD = "" ;
      A893TBM42_DOM_CD = "" ;
      AV7W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV8W_TXT = "" ;
      A888TBM42_DOM_ENM = "" ;
      A889TBM42_DOM_JNM = "" ;
      A890TBM42_DOM_GRP_NM = "" ;
      A891TBM42_NOTE = "" ;
      A887TBM42_DEL_FLG = "" ;
      A916TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A908TBM42_CRT_USER_ID = "" ;
      A909TBM42_CRT_PROG_NM = "" ;
      A917TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A910TBM42_UPD_USER_ID = "" ;
      A911TBM42_UPD_PROG_NM = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z = "" ;
      Z916TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z908TBM42_CRT_USER_ID = "" ;
      Z917TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z910TBM42_UPD_USER_ID = "" ;
      Z888TBM42_DOM_ENM = "" ;
      Z889TBM42_DOM_JNM = "" ;
      Z890TBM42_DOM_GRP_NM = "" ;
      Z891TBM42_NOTE = "" ;
      Z887TBM42_DEL_FLG = "" ;
      Z909TBM42_CRT_PROG_NM = "" ;
      Z911TBM42_UPD_PROG_NM = "" ;
      BC001I4_A886TBM42_STUDY_ID = new long[1] ;
      BC001I4_A893TBM42_DOM_CD = new String[] {""} ;
      BC001I4_A916TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I4_n916TBM42_CRT_DATETIME = new boolean[] {false} ;
      BC001I4_A908TBM42_CRT_USER_ID = new String[] {""} ;
      BC001I4_n908TBM42_CRT_USER_ID = new boolean[] {false} ;
      BC001I4_A917TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I4_n917TBM42_UPD_DATETIME = new boolean[] {false} ;
      BC001I4_A910TBM42_UPD_USER_ID = new String[] {""} ;
      BC001I4_n910TBM42_UPD_USER_ID = new boolean[] {false} ;
      BC001I4_A918TBM42_UPD_CNT = new long[1] ;
      BC001I4_n918TBM42_UPD_CNT = new boolean[] {false} ;
      BC001I4_A888TBM42_DOM_ENM = new String[] {""} ;
      BC001I4_n888TBM42_DOM_ENM = new boolean[] {false} ;
      BC001I4_A889TBM42_DOM_JNM = new String[] {""} ;
      BC001I4_n889TBM42_DOM_JNM = new boolean[] {false} ;
      BC001I4_A890TBM42_DOM_GRP_NM = new String[] {""} ;
      BC001I4_n890TBM42_DOM_GRP_NM = new boolean[] {false} ;
      BC001I4_A891TBM42_NOTE = new String[] {""} ;
      BC001I4_n891TBM42_NOTE = new boolean[] {false} ;
      BC001I4_A892TBM42_ORDER = new int[1] ;
      BC001I4_n892TBM42_ORDER = new boolean[] {false} ;
      BC001I4_A887TBM42_DEL_FLG = new String[] {""} ;
      BC001I4_n887TBM42_DEL_FLG = new boolean[] {false} ;
      BC001I4_A909TBM42_CRT_PROG_NM = new String[] {""} ;
      BC001I4_n909TBM42_CRT_PROG_NM = new boolean[] {false} ;
      BC001I4_A911TBM42_UPD_PROG_NM = new String[] {""} ;
      BC001I4_n911TBM42_UPD_PROG_NM = new boolean[] {false} ;
      BC001I5_A886TBM42_STUDY_ID = new long[1] ;
      BC001I5_A893TBM42_DOM_CD = new String[] {""} ;
      BC001I3_A886TBM42_STUDY_ID = new long[1] ;
      BC001I3_A893TBM42_DOM_CD = new String[] {""} ;
      BC001I3_A916TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I3_n916TBM42_CRT_DATETIME = new boolean[] {false} ;
      BC001I3_A908TBM42_CRT_USER_ID = new String[] {""} ;
      BC001I3_n908TBM42_CRT_USER_ID = new boolean[] {false} ;
      BC001I3_A917TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I3_n917TBM42_UPD_DATETIME = new boolean[] {false} ;
      BC001I3_A910TBM42_UPD_USER_ID = new String[] {""} ;
      BC001I3_n910TBM42_UPD_USER_ID = new boolean[] {false} ;
      BC001I3_A918TBM42_UPD_CNT = new long[1] ;
      BC001I3_n918TBM42_UPD_CNT = new boolean[] {false} ;
      BC001I3_A888TBM42_DOM_ENM = new String[] {""} ;
      BC001I3_n888TBM42_DOM_ENM = new boolean[] {false} ;
      BC001I3_A889TBM42_DOM_JNM = new String[] {""} ;
      BC001I3_n889TBM42_DOM_JNM = new boolean[] {false} ;
      BC001I3_A890TBM42_DOM_GRP_NM = new String[] {""} ;
      BC001I3_n890TBM42_DOM_GRP_NM = new boolean[] {false} ;
      BC001I3_A891TBM42_NOTE = new String[] {""} ;
      BC001I3_n891TBM42_NOTE = new boolean[] {false} ;
      BC001I3_A892TBM42_ORDER = new int[1] ;
      BC001I3_n892TBM42_ORDER = new boolean[] {false} ;
      BC001I3_A887TBM42_DEL_FLG = new String[] {""} ;
      BC001I3_n887TBM42_DEL_FLG = new boolean[] {false} ;
      BC001I3_A909TBM42_CRT_PROG_NM = new String[] {""} ;
      BC001I3_n909TBM42_CRT_PROG_NM = new boolean[] {false} ;
      BC001I3_A911TBM42_UPD_PROG_NM = new String[] {""} ;
      BC001I3_n911TBM42_UPD_PROG_NM = new boolean[] {false} ;
      sMode53 = "" ;
      BC001I2_A886TBM42_STUDY_ID = new long[1] ;
      BC001I2_A893TBM42_DOM_CD = new String[] {""} ;
      BC001I2_A916TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I2_n916TBM42_CRT_DATETIME = new boolean[] {false} ;
      BC001I2_A908TBM42_CRT_USER_ID = new String[] {""} ;
      BC001I2_n908TBM42_CRT_USER_ID = new boolean[] {false} ;
      BC001I2_A917TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I2_n917TBM42_UPD_DATETIME = new boolean[] {false} ;
      BC001I2_A910TBM42_UPD_USER_ID = new String[] {""} ;
      BC001I2_n910TBM42_UPD_USER_ID = new boolean[] {false} ;
      BC001I2_A918TBM42_UPD_CNT = new long[1] ;
      BC001I2_n918TBM42_UPD_CNT = new boolean[] {false} ;
      BC001I2_A888TBM42_DOM_ENM = new String[] {""} ;
      BC001I2_n888TBM42_DOM_ENM = new boolean[] {false} ;
      BC001I2_A889TBM42_DOM_JNM = new String[] {""} ;
      BC001I2_n889TBM42_DOM_JNM = new boolean[] {false} ;
      BC001I2_A890TBM42_DOM_GRP_NM = new String[] {""} ;
      BC001I2_n890TBM42_DOM_GRP_NM = new boolean[] {false} ;
      BC001I2_A891TBM42_NOTE = new String[] {""} ;
      BC001I2_n891TBM42_NOTE = new boolean[] {false} ;
      BC001I2_A892TBM42_ORDER = new int[1] ;
      BC001I2_n892TBM42_ORDER = new boolean[] {false} ;
      BC001I2_A887TBM42_DEL_FLG = new String[] {""} ;
      BC001I2_n887TBM42_DEL_FLG = new boolean[] {false} ;
      BC001I2_A909TBM42_CRT_PROG_NM = new String[] {""} ;
      BC001I2_n909TBM42_CRT_PROG_NM = new boolean[] {false} ;
      BC001I2_A911TBM42_UPD_PROG_NM = new String[] {""} ;
      BC001I2_n911TBM42_UPD_PROG_NM = new boolean[] {false} ;
      BC001I9_A886TBM42_STUDY_ID = new long[1] ;
      BC001I9_A893TBM42_DOM_CD = new String[] {""} ;
      BC001I9_A916TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I9_n916TBM42_CRT_DATETIME = new boolean[] {false} ;
      BC001I9_A908TBM42_CRT_USER_ID = new String[] {""} ;
      BC001I9_n908TBM42_CRT_USER_ID = new boolean[] {false} ;
      BC001I9_A917TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC001I9_n917TBM42_UPD_DATETIME = new boolean[] {false} ;
      BC001I9_A910TBM42_UPD_USER_ID = new String[] {""} ;
      BC001I9_n910TBM42_UPD_USER_ID = new boolean[] {false} ;
      BC001I9_A918TBM42_UPD_CNT = new long[1] ;
      BC001I9_n918TBM42_UPD_CNT = new boolean[] {false} ;
      BC001I9_A888TBM42_DOM_ENM = new String[] {""} ;
      BC001I9_n888TBM42_DOM_ENM = new boolean[] {false} ;
      BC001I9_A889TBM42_DOM_JNM = new String[] {""} ;
      BC001I9_n889TBM42_DOM_JNM = new boolean[] {false} ;
      BC001I9_A890TBM42_DOM_GRP_NM = new String[] {""} ;
      BC001I9_n890TBM42_DOM_GRP_NM = new boolean[] {false} ;
      BC001I9_A891TBM42_NOTE = new String[] {""} ;
      BC001I9_n891TBM42_NOTE = new boolean[] {false} ;
      BC001I9_A892TBM42_ORDER = new int[1] ;
      BC001I9_n892TBM42_ORDER = new boolean[] {false} ;
      BC001I9_A887TBM42_DEL_FLG = new String[] {""} ;
      BC001I9_n887TBM42_DEL_FLG = new boolean[] {false} ;
      BC001I9_A909TBM42_CRT_PROG_NM = new String[] {""} ;
      BC001I9_n909TBM42_CRT_PROG_NM = new boolean[] {false} ;
      BC001I9_A911TBM42_UPD_PROG_NM = new String[] {""} ;
      BC001I9_n911TBM42_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm42_study_cdisc_domain_bc__default(),
         new Object[] {
             new Object[] {
            BC001I2_A886TBM42_STUDY_ID, BC001I2_A893TBM42_DOM_CD, BC001I2_A916TBM42_CRT_DATETIME, BC001I2_n916TBM42_CRT_DATETIME, BC001I2_A908TBM42_CRT_USER_ID, BC001I2_n908TBM42_CRT_USER_ID, BC001I2_A917TBM42_UPD_DATETIME, BC001I2_n917TBM42_UPD_DATETIME, BC001I2_A910TBM42_UPD_USER_ID, BC001I2_n910TBM42_UPD_USER_ID,
            BC001I2_A918TBM42_UPD_CNT, BC001I2_n918TBM42_UPD_CNT, BC001I2_A888TBM42_DOM_ENM, BC001I2_n888TBM42_DOM_ENM, BC001I2_A889TBM42_DOM_JNM, BC001I2_n889TBM42_DOM_JNM, BC001I2_A890TBM42_DOM_GRP_NM, BC001I2_n890TBM42_DOM_GRP_NM, BC001I2_A891TBM42_NOTE, BC001I2_n891TBM42_NOTE,
            BC001I2_A892TBM42_ORDER, BC001I2_n892TBM42_ORDER, BC001I2_A887TBM42_DEL_FLG, BC001I2_n887TBM42_DEL_FLG, BC001I2_A909TBM42_CRT_PROG_NM, BC001I2_n909TBM42_CRT_PROG_NM, BC001I2_A911TBM42_UPD_PROG_NM, BC001I2_n911TBM42_UPD_PROG_NM
            }
            , new Object[] {
            BC001I3_A886TBM42_STUDY_ID, BC001I3_A893TBM42_DOM_CD, BC001I3_A916TBM42_CRT_DATETIME, BC001I3_n916TBM42_CRT_DATETIME, BC001I3_A908TBM42_CRT_USER_ID, BC001I3_n908TBM42_CRT_USER_ID, BC001I3_A917TBM42_UPD_DATETIME, BC001I3_n917TBM42_UPD_DATETIME, BC001I3_A910TBM42_UPD_USER_ID, BC001I3_n910TBM42_UPD_USER_ID,
            BC001I3_A918TBM42_UPD_CNT, BC001I3_n918TBM42_UPD_CNT, BC001I3_A888TBM42_DOM_ENM, BC001I3_n888TBM42_DOM_ENM, BC001I3_A889TBM42_DOM_JNM, BC001I3_n889TBM42_DOM_JNM, BC001I3_A890TBM42_DOM_GRP_NM, BC001I3_n890TBM42_DOM_GRP_NM, BC001I3_A891TBM42_NOTE, BC001I3_n891TBM42_NOTE,
            BC001I3_A892TBM42_ORDER, BC001I3_n892TBM42_ORDER, BC001I3_A887TBM42_DEL_FLG, BC001I3_n887TBM42_DEL_FLG, BC001I3_A909TBM42_CRT_PROG_NM, BC001I3_n909TBM42_CRT_PROG_NM, BC001I3_A911TBM42_UPD_PROG_NM, BC001I3_n911TBM42_UPD_PROG_NM
            }
            , new Object[] {
            BC001I4_A886TBM42_STUDY_ID, BC001I4_A893TBM42_DOM_CD, BC001I4_A916TBM42_CRT_DATETIME, BC001I4_n916TBM42_CRT_DATETIME, BC001I4_A908TBM42_CRT_USER_ID, BC001I4_n908TBM42_CRT_USER_ID, BC001I4_A917TBM42_UPD_DATETIME, BC001I4_n917TBM42_UPD_DATETIME, BC001I4_A910TBM42_UPD_USER_ID, BC001I4_n910TBM42_UPD_USER_ID,
            BC001I4_A918TBM42_UPD_CNT, BC001I4_n918TBM42_UPD_CNT, BC001I4_A888TBM42_DOM_ENM, BC001I4_n888TBM42_DOM_ENM, BC001I4_A889TBM42_DOM_JNM, BC001I4_n889TBM42_DOM_JNM, BC001I4_A890TBM42_DOM_GRP_NM, BC001I4_n890TBM42_DOM_GRP_NM, BC001I4_A891TBM42_NOTE, BC001I4_n891TBM42_NOTE,
            BC001I4_A892TBM42_ORDER, BC001I4_n892TBM42_ORDER, BC001I4_A887TBM42_DEL_FLG, BC001I4_n887TBM42_DEL_FLG, BC001I4_A909TBM42_CRT_PROG_NM, BC001I4_n909TBM42_CRT_PROG_NM, BC001I4_A911TBM42_UPD_PROG_NM, BC001I4_n911TBM42_UPD_PROG_NM
            }
            , new Object[] {
            BC001I5_A886TBM42_STUDY_ID, BC001I5_A893TBM42_DOM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC001I9_A886TBM42_STUDY_ID, BC001I9_A893TBM42_DOM_CD, BC001I9_A916TBM42_CRT_DATETIME, BC001I9_n916TBM42_CRT_DATETIME, BC001I9_A908TBM42_CRT_USER_ID, BC001I9_n908TBM42_CRT_USER_ID, BC001I9_A917TBM42_UPD_DATETIME, BC001I9_n917TBM42_UPD_DATETIME, BC001I9_A910TBM42_UPD_USER_ID, BC001I9_n910TBM42_UPD_USER_ID,
            BC001I9_A918TBM42_UPD_CNT, BC001I9_n918TBM42_UPD_CNT, BC001I9_A888TBM42_DOM_ENM, BC001I9_n888TBM42_DOM_ENM, BC001I9_A889TBM42_DOM_JNM, BC001I9_n889TBM42_DOM_JNM, BC001I9_A890TBM42_DOM_GRP_NM, BC001I9_n890TBM42_DOM_GRP_NM, BC001I9_A891TBM42_NOTE, BC001I9_n891TBM42_NOTE,
            BC001I9_A892TBM42_ORDER, BC001I9_n892TBM42_ORDER, BC001I9_A887TBM42_DEL_FLG, BC001I9_n887TBM42_DEL_FLG, BC001I9_A909TBM42_CRT_PROG_NM, BC001I9_n909TBM42_CRT_PROG_NM, BC001I9_A911TBM42_UPD_PROG_NM, BC001I9_n911TBM42_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e111I2 */
      e111I2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound53 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A892TBM42_ORDER ;
   private int gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z ;
   private int GX_JID ;
   private int Z892TBM42_ORDER ;
   private int GXActiveErrHndl ;
   private long Z886TBM42_STUDY_ID ;
   private long A886TBM42_STUDY_ID ;
   private long A918TBM42_UPD_CNT ;
   private long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z ;
   private long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z ;
   private long Z918TBM42_UPD_CNT ;
   private long O918TBM42_UPD_CNT ;
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
   private java.util.Date A916TBM42_CRT_DATETIME ;
   private java.util.Date A917TBM42_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z ;
   private java.util.Date Z916TBM42_CRT_DATETIME ;
   private java.util.Date Z917TBM42_UPD_DATETIME ;
   private boolean n916TBM42_CRT_DATETIME ;
   private boolean n908TBM42_CRT_USER_ID ;
   private boolean n917TBM42_UPD_DATETIME ;
   private boolean n910TBM42_UPD_USER_ID ;
   private boolean n918TBM42_UPD_CNT ;
   private boolean n888TBM42_DOM_ENM ;
   private boolean n889TBM42_DOM_JNM ;
   private boolean n890TBM42_DOM_GRP_NM ;
   private boolean n891TBM42_NOTE ;
   private boolean n892TBM42_ORDER ;
   private boolean n887TBM42_DEL_FLG ;
   private boolean n909TBM42_CRT_PROG_NM ;
   private boolean n911TBM42_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z893TBM42_DOM_CD ;
   private String A893TBM42_DOM_CD ;
   private String AV7W_BC_FLG ;
   private String AV8W_TXT ;
   private String A888TBM42_DOM_ENM ;
   private String A889TBM42_DOM_JNM ;
   private String A890TBM42_DOM_GRP_NM ;
   private String A891TBM42_NOTE ;
   private String A887TBM42_DEL_FLG ;
   private String A908TBM42_CRT_USER_ID ;
   private String A909TBM42_CRT_PROG_NM ;
   private String A910TBM42_UPD_USER_ID ;
   private String A911TBM42_UPD_PROG_NM ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z ;
   private String Z908TBM42_CRT_USER_ID ;
   private String Z910TBM42_UPD_USER_ID ;
   private String Z888TBM42_DOM_ENM ;
   private String Z889TBM42_DOM_JNM ;
   private String Z890TBM42_DOM_GRP_NM ;
   private String Z891TBM42_NOTE ;
   private String Z887TBM42_DEL_FLG ;
   private String Z909TBM42_CRT_PROG_NM ;
   private String Z911TBM42_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM42_STUDY_CDISC_DOMAIN bcTBM42_STUDY_CDISC_DOMAIN ;
   private IDataStoreProvider pr_default ;
   private long[] BC001I4_A886TBM42_STUDY_ID ;
   private String[] BC001I4_A893TBM42_DOM_CD ;
   private java.util.Date[] BC001I4_A916TBM42_CRT_DATETIME ;
   private boolean[] BC001I4_n916TBM42_CRT_DATETIME ;
   private String[] BC001I4_A908TBM42_CRT_USER_ID ;
   private boolean[] BC001I4_n908TBM42_CRT_USER_ID ;
   private java.util.Date[] BC001I4_A917TBM42_UPD_DATETIME ;
   private boolean[] BC001I4_n917TBM42_UPD_DATETIME ;
   private String[] BC001I4_A910TBM42_UPD_USER_ID ;
   private boolean[] BC001I4_n910TBM42_UPD_USER_ID ;
   private long[] BC001I4_A918TBM42_UPD_CNT ;
   private boolean[] BC001I4_n918TBM42_UPD_CNT ;
   private String[] BC001I4_A888TBM42_DOM_ENM ;
   private boolean[] BC001I4_n888TBM42_DOM_ENM ;
   private String[] BC001I4_A889TBM42_DOM_JNM ;
   private boolean[] BC001I4_n889TBM42_DOM_JNM ;
   private String[] BC001I4_A890TBM42_DOM_GRP_NM ;
   private boolean[] BC001I4_n890TBM42_DOM_GRP_NM ;
   private String[] BC001I4_A891TBM42_NOTE ;
   private boolean[] BC001I4_n891TBM42_NOTE ;
   private int[] BC001I4_A892TBM42_ORDER ;
   private boolean[] BC001I4_n892TBM42_ORDER ;
   private String[] BC001I4_A887TBM42_DEL_FLG ;
   private boolean[] BC001I4_n887TBM42_DEL_FLG ;
   private String[] BC001I4_A909TBM42_CRT_PROG_NM ;
   private boolean[] BC001I4_n909TBM42_CRT_PROG_NM ;
   private String[] BC001I4_A911TBM42_UPD_PROG_NM ;
   private boolean[] BC001I4_n911TBM42_UPD_PROG_NM ;
   private long[] BC001I5_A886TBM42_STUDY_ID ;
   private String[] BC001I5_A893TBM42_DOM_CD ;
   private long[] BC001I3_A886TBM42_STUDY_ID ;
   private String[] BC001I3_A893TBM42_DOM_CD ;
   private java.util.Date[] BC001I3_A916TBM42_CRT_DATETIME ;
   private boolean[] BC001I3_n916TBM42_CRT_DATETIME ;
   private String[] BC001I3_A908TBM42_CRT_USER_ID ;
   private boolean[] BC001I3_n908TBM42_CRT_USER_ID ;
   private java.util.Date[] BC001I3_A917TBM42_UPD_DATETIME ;
   private boolean[] BC001I3_n917TBM42_UPD_DATETIME ;
   private String[] BC001I3_A910TBM42_UPD_USER_ID ;
   private boolean[] BC001I3_n910TBM42_UPD_USER_ID ;
   private long[] BC001I3_A918TBM42_UPD_CNT ;
   private boolean[] BC001I3_n918TBM42_UPD_CNT ;
   private String[] BC001I3_A888TBM42_DOM_ENM ;
   private boolean[] BC001I3_n888TBM42_DOM_ENM ;
   private String[] BC001I3_A889TBM42_DOM_JNM ;
   private boolean[] BC001I3_n889TBM42_DOM_JNM ;
   private String[] BC001I3_A890TBM42_DOM_GRP_NM ;
   private boolean[] BC001I3_n890TBM42_DOM_GRP_NM ;
   private String[] BC001I3_A891TBM42_NOTE ;
   private boolean[] BC001I3_n891TBM42_NOTE ;
   private int[] BC001I3_A892TBM42_ORDER ;
   private boolean[] BC001I3_n892TBM42_ORDER ;
   private String[] BC001I3_A887TBM42_DEL_FLG ;
   private boolean[] BC001I3_n887TBM42_DEL_FLG ;
   private String[] BC001I3_A909TBM42_CRT_PROG_NM ;
   private boolean[] BC001I3_n909TBM42_CRT_PROG_NM ;
   private String[] BC001I3_A911TBM42_UPD_PROG_NM ;
   private boolean[] BC001I3_n911TBM42_UPD_PROG_NM ;
   private long[] BC001I2_A886TBM42_STUDY_ID ;
   private String[] BC001I2_A893TBM42_DOM_CD ;
   private java.util.Date[] BC001I2_A916TBM42_CRT_DATETIME ;
   private boolean[] BC001I2_n916TBM42_CRT_DATETIME ;
   private String[] BC001I2_A908TBM42_CRT_USER_ID ;
   private boolean[] BC001I2_n908TBM42_CRT_USER_ID ;
   private java.util.Date[] BC001I2_A917TBM42_UPD_DATETIME ;
   private boolean[] BC001I2_n917TBM42_UPD_DATETIME ;
   private String[] BC001I2_A910TBM42_UPD_USER_ID ;
   private boolean[] BC001I2_n910TBM42_UPD_USER_ID ;
   private long[] BC001I2_A918TBM42_UPD_CNT ;
   private boolean[] BC001I2_n918TBM42_UPD_CNT ;
   private String[] BC001I2_A888TBM42_DOM_ENM ;
   private boolean[] BC001I2_n888TBM42_DOM_ENM ;
   private String[] BC001I2_A889TBM42_DOM_JNM ;
   private boolean[] BC001I2_n889TBM42_DOM_JNM ;
   private String[] BC001I2_A890TBM42_DOM_GRP_NM ;
   private boolean[] BC001I2_n890TBM42_DOM_GRP_NM ;
   private String[] BC001I2_A891TBM42_NOTE ;
   private boolean[] BC001I2_n891TBM42_NOTE ;
   private int[] BC001I2_A892TBM42_ORDER ;
   private boolean[] BC001I2_n892TBM42_ORDER ;
   private String[] BC001I2_A887TBM42_DEL_FLG ;
   private boolean[] BC001I2_n887TBM42_DEL_FLG ;
   private String[] BC001I2_A909TBM42_CRT_PROG_NM ;
   private boolean[] BC001I2_n909TBM42_CRT_PROG_NM ;
   private String[] BC001I2_A911TBM42_UPD_PROG_NM ;
   private boolean[] BC001I2_n911TBM42_UPD_PROG_NM ;
   private long[] BC001I9_A886TBM42_STUDY_ID ;
   private String[] BC001I9_A893TBM42_DOM_CD ;
   private java.util.Date[] BC001I9_A916TBM42_CRT_DATETIME ;
   private boolean[] BC001I9_n916TBM42_CRT_DATETIME ;
   private String[] BC001I9_A908TBM42_CRT_USER_ID ;
   private boolean[] BC001I9_n908TBM42_CRT_USER_ID ;
   private java.util.Date[] BC001I9_A917TBM42_UPD_DATETIME ;
   private boolean[] BC001I9_n917TBM42_UPD_DATETIME ;
   private String[] BC001I9_A910TBM42_UPD_USER_ID ;
   private boolean[] BC001I9_n910TBM42_UPD_USER_ID ;
   private long[] BC001I9_A918TBM42_UPD_CNT ;
   private boolean[] BC001I9_n918TBM42_UPD_CNT ;
   private String[] BC001I9_A888TBM42_DOM_ENM ;
   private boolean[] BC001I9_n888TBM42_DOM_ENM ;
   private String[] BC001I9_A889TBM42_DOM_JNM ;
   private boolean[] BC001I9_n889TBM42_DOM_JNM ;
   private String[] BC001I9_A890TBM42_DOM_GRP_NM ;
   private boolean[] BC001I9_n890TBM42_DOM_GRP_NM ;
   private String[] BC001I9_A891TBM42_NOTE ;
   private boolean[] BC001I9_n891TBM42_NOTE ;
   private int[] BC001I9_A892TBM42_ORDER ;
   private boolean[] BC001I9_n892TBM42_ORDER ;
   private String[] BC001I9_A887TBM42_DEL_FLG ;
   private boolean[] BC001I9_n887TBM42_DEL_FLG ;
   private String[] BC001I9_A909TBM42_CRT_PROG_NM ;
   private boolean[] BC001I9_n909TBM42_CRT_PROG_NM ;
   private String[] BC001I9_A911TBM42_UPD_PROG_NM ;
   private boolean[] BC001I9_n911TBM42_UPD_PROG_NM ;
}

final  class tbm42_study_cdisc_domain_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC001I2", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001I3", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC001I4", "SELECT TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD`, TM1.`TBM42_CRT_DATETIME`, TM1.`TBM42_CRT_USER_ID`, TM1.`TBM42_UPD_DATETIME`, TM1.`TBM42_UPD_USER_ID`, TM1.`TBM42_UPD_CNT`, TM1.`TBM42_DOM_ENM`, TM1.`TBM42_DOM_JNM`, TM1.`TBM42_DOM_GRP_NM`, TM1.`TBM42_NOTE`, TM1.`TBM42_ORDER`, TM1.`TBM42_DEL_FLG`, TM1.`TBM42_CRT_PROG_NM`, TM1.`TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` TM1 WHERE TM1.`TBM42_STUDY_ID` = ? and TM1.`TBM42_DOM_CD` = ? ORDER BY TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC001I5", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC001I6", "INSERT INTO `TBM42_STUDY_CDISC_DOMAIN` (`TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC001I7", "UPDATE `TBM42_STUDY_CDISC_DOMAIN` SET `TBM42_CRT_DATETIME`=?, `TBM42_CRT_USER_ID`=?, `TBM42_UPD_DATETIME`=?, `TBM42_UPD_USER_ID`=?, `TBM42_UPD_CNT`=?, `TBM42_DOM_ENM`=?, `TBM42_DOM_JNM`=?, `TBM42_DOM_GRP_NM`=?, `TBM42_NOTE`=?, `TBM42_ORDER`=?, `TBM42_DEL_FLG`=?, `TBM42_CRT_PROG_NM`=?, `TBM42_UPD_PROG_NM`=?  WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC001I8", "DELETE FROM `TBM42_STUDY_CDISC_DOMAIN`  WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC001I9", "SELECT TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD`, TM1.`TBM42_CRT_DATETIME`, TM1.`TBM42_CRT_USER_ID`, TM1.`TBM42_UPD_DATETIME`, TM1.`TBM42_UPD_USER_ID`, TM1.`TBM42_UPD_CNT`, TM1.`TBM42_DOM_ENM`, TM1.`TBM42_DOM_JNM`, TM1.`TBM42_DOM_GRP_NM`, TM1.`TBM42_NOTE`, TM1.`TBM42_ORDER`, TM1.`TBM42_DEL_FLG`, TM1.`TBM42_CRT_PROG_NM`, TM1.`TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` TM1 WHERE TM1.`TBM42_STUDY_ID` = ? and TM1.`TBM42_DOM_CD` = ? ORDER BY TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               break;
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
               stmt.setLong(14, ((Number) parms[26]).longValue());
               stmt.setVarchar(15, (String)parms[27], 2, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               break;
      }
   }

}

