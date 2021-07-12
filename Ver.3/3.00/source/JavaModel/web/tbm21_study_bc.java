/*
               File: tbm21_study_bc
        Description: 試験マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:9.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm21_study_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm21_study_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm21_study_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm21_study_bc.class ));
   }

   public tbm21_study_bc( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0G15( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0G15( ) ;
      standaloneModal( ) ;
      addRow0G15( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120G2 */
         e120G2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z63TBM21_STUDY_ID = A63TBM21_STUDY_ID ;
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

   public void confirm_0G0( )
   {
      beforeValidate0G15( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0G15( ) ;
         }
         else
         {
            checkExtendedTable0G15( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0G15( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110G2( )
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

   public void e120G2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A367TBM21_STUDY_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A530TBM21_OUTER_STUDY_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A531TBM21_PROC_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A368TBM21_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A369TBM21_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A370TBM21_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A371TBM21_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A372TBM21_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A373TBM21_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A374TBM21_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A375TBM21_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
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

   public void zm0G15( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z370TBM21_CRT_DATETIME = A370TBM21_CRT_DATETIME ;
         Z371TBM21_CRT_USER_ID = A371TBM21_CRT_USER_ID ;
         Z373TBM21_UPD_DATETIME = A373TBM21_UPD_DATETIME ;
         Z374TBM21_UPD_USER_ID = A374TBM21_UPD_USER_ID ;
         Z376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
         Z367TBM21_STUDY_NM = A367TBM21_STUDY_NM ;
         Z530TBM21_OUTER_STUDY_ID = A530TBM21_OUTER_STUDY_ID ;
         Z531TBM21_PROC_NM = A531TBM21_PROC_NM ;
         Z368TBM21_NOTE = A368TBM21_NOTE ;
         Z607TBM21_STATUS = A607TBM21_STATUS ;
         Z369TBM21_DEL_FLG = A369TBM21_DEL_FLG ;
         Z372TBM21_CRT_PROG_NM = A372TBM21_CRT_PROG_NM ;
         Z375TBM21_UPD_PROG_NM = A375TBM21_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z63TBM21_STUDY_ID = A63TBM21_STUDY_ID ;
         Z370TBM21_CRT_DATETIME = A370TBM21_CRT_DATETIME ;
         Z371TBM21_CRT_USER_ID = A371TBM21_CRT_USER_ID ;
         Z373TBM21_UPD_DATETIME = A373TBM21_UPD_DATETIME ;
         Z374TBM21_UPD_USER_ID = A374TBM21_UPD_USER_ID ;
         Z376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
         Z367TBM21_STUDY_NM = A367TBM21_STUDY_NM ;
         Z530TBM21_OUTER_STUDY_ID = A530TBM21_OUTER_STUDY_ID ;
         Z531TBM21_PROC_NM = A531TBM21_PROC_NM ;
         Z368TBM21_NOTE = A368TBM21_NOTE ;
         Z607TBM21_STATUS = A607TBM21_STATUS ;
         Z369TBM21_DEL_FLG = A369TBM21_DEL_FLG ;
         Z372TBM21_CRT_PROG_NM = A372TBM21_CRT_PROG_NM ;
         Z375TBM21_UPD_PROG_NM = A375TBM21_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0G15( )
   {
      /* Using cursor BC000G4 */
      pr_default.execute(2, new Object[] {new Long(A63TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A370TBM21_CRT_DATETIME = BC000G4_A370TBM21_CRT_DATETIME[0] ;
         n370TBM21_CRT_DATETIME = BC000G4_n370TBM21_CRT_DATETIME[0] ;
         A371TBM21_CRT_USER_ID = BC000G4_A371TBM21_CRT_USER_ID[0] ;
         n371TBM21_CRT_USER_ID = BC000G4_n371TBM21_CRT_USER_ID[0] ;
         A373TBM21_UPD_DATETIME = BC000G4_A373TBM21_UPD_DATETIME[0] ;
         n373TBM21_UPD_DATETIME = BC000G4_n373TBM21_UPD_DATETIME[0] ;
         A374TBM21_UPD_USER_ID = BC000G4_A374TBM21_UPD_USER_ID[0] ;
         n374TBM21_UPD_USER_ID = BC000G4_n374TBM21_UPD_USER_ID[0] ;
         A376TBM21_UPD_CNT = BC000G4_A376TBM21_UPD_CNT[0] ;
         n376TBM21_UPD_CNT = BC000G4_n376TBM21_UPD_CNT[0] ;
         A367TBM21_STUDY_NM = BC000G4_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = BC000G4_n367TBM21_STUDY_NM[0] ;
         A530TBM21_OUTER_STUDY_ID = BC000G4_A530TBM21_OUTER_STUDY_ID[0] ;
         n530TBM21_OUTER_STUDY_ID = BC000G4_n530TBM21_OUTER_STUDY_ID[0] ;
         A531TBM21_PROC_NM = BC000G4_A531TBM21_PROC_NM[0] ;
         n531TBM21_PROC_NM = BC000G4_n531TBM21_PROC_NM[0] ;
         A368TBM21_NOTE = BC000G4_A368TBM21_NOTE[0] ;
         n368TBM21_NOTE = BC000G4_n368TBM21_NOTE[0] ;
         A607TBM21_STATUS = BC000G4_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = BC000G4_n607TBM21_STATUS[0] ;
         A369TBM21_DEL_FLG = BC000G4_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = BC000G4_n369TBM21_DEL_FLG[0] ;
         A372TBM21_CRT_PROG_NM = BC000G4_A372TBM21_CRT_PROG_NM[0] ;
         n372TBM21_CRT_PROG_NM = BC000G4_n372TBM21_CRT_PROG_NM[0] ;
         A375TBM21_UPD_PROG_NM = BC000G4_A375TBM21_UPD_PROG_NM[0] ;
         n375TBM21_UPD_PROG_NM = BC000G4_n375TBM21_UPD_PROG_NM[0] ;
         zm0G15( -8) ;
      }
      pr_default.close(2);
      onLoadActions0G15( ) ;
   }

   public void onLoadActions0G15( )
   {
      AV9Pgmname = "TBM21_STUDY_BC" ;
   }

   public void checkExtendedTable0G15( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM21_STUDY_BC" ;
      if ( ! ( GXutil.nullDate().equals(A370TBM21_CRT_DATETIME) || (( A370TBM21_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A370TBM21_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A373TBM21_UPD_DATETIME) || (( A373TBM21_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A373TBM21_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0G15( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0G15( )
   {
      /* Using cursor BC000G5 */
      pr_default.execute(3, new Object[] {new Long(A63TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000G3 */
      pr_default.execute(1, new Object[] {new Long(A63TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0G15( 8) ;
         RcdFound15 = (short)(1) ;
         A63TBM21_STUDY_ID = BC000G3_A63TBM21_STUDY_ID[0] ;
         A370TBM21_CRT_DATETIME = BC000G3_A370TBM21_CRT_DATETIME[0] ;
         n370TBM21_CRT_DATETIME = BC000G3_n370TBM21_CRT_DATETIME[0] ;
         A371TBM21_CRT_USER_ID = BC000G3_A371TBM21_CRT_USER_ID[0] ;
         n371TBM21_CRT_USER_ID = BC000G3_n371TBM21_CRT_USER_ID[0] ;
         A373TBM21_UPD_DATETIME = BC000G3_A373TBM21_UPD_DATETIME[0] ;
         n373TBM21_UPD_DATETIME = BC000G3_n373TBM21_UPD_DATETIME[0] ;
         A374TBM21_UPD_USER_ID = BC000G3_A374TBM21_UPD_USER_ID[0] ;
         n374TBM21_UPD_USER_ID = BC000G3_n374TBM21_UPD_USER_ID[0] ;
         A376TBM21_UPD_CNT = BC000G3_A376TBM21_UPD_CNT[0] ;
         n376TBM21_UPD_CNT = BC000G3_n376TBM21_UPD_CNT[0] ;
         A367TBM21_STUDY_NM = BC000G3_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = BC000G3_n367TBM21_STUDY_NM[0] ;
         A530TBM21_OUTER_STUDY_ID = BC000G3_A530TBM21_OUTER_STUDY_ID[0] ;
         n530TBM21_OUTER_STUDY_ID = BC000G3_n530TBM21_OUTER_STUDY_ID[0] ;
         A531TBM21_PROC_NM = BC000G3_A531TBM21_PROC_NM[0] ;
         n531TBM21_PROC_NM = BC000G3_n531TBM21_PROC_NM[0] ;
         A368TBM21_NOTE = BC000G3_A368TBM21_NOTE[0] ;
         n368TBM21_NOTE = BC000G3_n368TBM21_NOTE[0] ;
         A607TBM21_STATUS = BC000G3_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = BC000G3_n607TBM21_STATUS[0] ;
         A369TBM21_DEL_FLG = BC000G3_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = BC000G3_n369TBM21_DEL_FLG[0] ;
         A372TBM21_CRT_PROG_NM = BC000G3_A372TBM21_CRT_PROG_NM[0] ;
         n372TBM21_CRT_PROG_NM = BC000G3_n372TBM21_CRT_PROG_NM[0] ;
         A375TBM21_UPD_PROG_NM = BC000G3_A375TBM21_UPD_PROG_NM[0] ;
         n375TBM21_UPD_PROG_NM = BC000G3_n375TBM21_UPD_PROG_NM[0] ;
         O376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
         n376TBM21_UPD_CNT = false ;
         Z63TBM21_STUDY_ID = A63TBM21_STUDY_ID ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0G15( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKey0G15( ) ;
         }
         Gx_mode = sMode15 ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKey0G15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0G15( ) ;
      if ( RcdFound15 == 0 )
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
      confirm_0G0( ) ;
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

   public void checkOptimisticConcurrency0G15( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000G2 */
         pr_default.execute(0, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM21_STUDY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z370TBM21_CRT_DATETIME.equals( BC000G2_A370TBM21_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z371TBM21_CRT_USER_ID, BC000G2_A371TBM21_CRT_USER_ID[0]) != 0 ) || !( Z373TBM21_UPD_DATETIME.equals( BC000G2_A373TBM21_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z374TBM21_UPD_USER_ID, BC000G2_A374TBM21_UPD_USER_ID[0]) != 0 ) || ( Z376TBM21_UPD_CNT != BC000G2_A376TBM21_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z367TBM21_STUDY_NM, BC000G2_A367TBM21_STUDY_NM[0]) != 0 ) || ( GXutil.strcmp(Z530TBM21_OUTER_STUDY_ID, BC000G2_A530TBM21_OUTER_STUDY_ID[0]) != 0 ) || ( GXutil.strcmp(Z531TBM21_PROC_NM, BC000G2_A531TBM21_PROC_NM[0]) != 0 ) || ( GXutil.strcmp(Z368TBM21_NOTE, BC000G2_A368TBM21_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z607TBM21_STATUS, BC000G2_A607TBM21_STATUS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z369TBM21_DEL_FLG, BC000G2_A369TBM21_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z372TBM21_CRT_PROG_NM, BC000G2_A372TBM21_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z375TBM21_UPD_PROG_NM, BC000G2_A375TBM21_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM21_STUDY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0G15( )
   {
      beforeValidate0G15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0G15( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0G15( 0) ;
         checkOptimisticConcurrency0G15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0G15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0G15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000G6 */
                  pr_default.execute(4, new Object[] {new Long(A63TBM21_STUDY_ID), new Boolean(n370TBM21_CRT_DATETIME), A370TBM21_CRT_DATETIME, new Boolean(n371TBM21_CRT_USER_ID), A371TBM21_CRT_USER_ID, new Boolean(n373TBM21_UPD_DATETIME), A373TBM21_UPD_DATETIME, new Boolean(n374TBM21_UPD_USER_ID), A374TBM21_UPD_USER_ID, new Boolean(n376TBM21_UPD_CNT), new Long(A376TBM21_UPD_CNT), new Boolean(n367TBM21_STUDY_NM), A367TBM21_STUDY_NM, new Boolean(n530TBM21_OUTER_STUDY_ID), A530TBM21_OUTER_STUDY_ID, new Boolean(n531TBM21_PROC_NM), A531TBM21_PROC_NM, new Boolean(n368TBM21_NOTE), A368TBM21_NOTE, new Boolean(n607TBM21_STATUS), A607TBM21_STATUS, new Boolean(n369TBM21_DEL_FLG), A369TBM21_DEL_FLG, new Boolean(n372TBM21_CRT_PROG_NM), A372TBM21_CRT_PROG_NM, new Boolean(n375TBM21_UPD_PROG_NM), A375TBM21_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM21_STUDY") ;
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
            load0G15( ) ;
         }
         endLevel0G15( ) ;
      }
      closeExtendedTableCursors0G15( ) ;
   }

   public void update0G15( )
   {
      beforeValidate0G15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0G15( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0G15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0G15( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0G15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000G7 */
                  pr_default.execute(5, new Object[] {new Boolean(n370TBM21_CRT_DATETIME), A370TBM21_CRT_DATETIME, new Boolean(n371TBM21_CRT_USER_ID), A371TBM21_CRT_USER_ID, new Boolean(n373TBM21_UPD_DATETIME), A373TBM21_UPD_DATETIME, new Boolean(n374TBM21_UPD_USER_ID), A374TBM21_UPD_USER_ID, new Boolean(n376TBM21_UPD_CNT), new Long(A376TBM21_UPD_CNT), new Boolean(n367TBM21_STUDY_NM), A367TBM21_STUDY_NM, new Boolean(n530TBM21_OUTER_STUDY_ID), A530TBM21_OUTER_STUDY_ID, new Boolean(n531TBM21_PROC_NM), A531TBM21_PROC_NM, new Boolean(n368TBM21_NOTE), A368TBM21_NOTE, new Boolean(n607TBM21_STATUS), A607TBM21_STATUS, new Boolean(n369TBM21_DEL_FLG), A369TBM21_DEL_FLG, new Boolean(n372TBM21_CRT_PROG_NM), A372TBM21_CRT_PROG_NM, new Boolean(n375TBM21_UPD_PROG_NM), A375TBM21_UPD_PROG_NM, new Long(A63TBM21_STUDY_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM21_STUDY") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM21_STUDY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0G15( ) ;
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
         endLevel0G15( ) ;
      }
      closeExtendedTableCursors0G15( ) ;
   }

   public void deferredUpdate0G15( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0G15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0G15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0G15( ) ;
         afterConfirm0G15( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0G15( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000G8 */
               pr_default.execute(6, new Object[] {new Long(A63TBM21_STUDY_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM21_STUDY") ;
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0G15( ) ;
      Gx_mode = sMode15 ;
   }

   public void onDeleteControls0G15( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM21_STUDY_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000G9 */
         pr_default.execute(7, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験参加スタッフマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(7);
         /* Using cursor BC000G10 */
         pr_default.execute(8, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
         /* Using cursor BC000G11 */
         pr_default.execute(9, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"マッピング済部品マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor BC000G12 */
         pr_default.execute(10, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"選択リストマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000G13 */
         pr_default.execute(11, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験実施施設マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel0G15( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0G15( ) ;
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

   public void scanKeyStart0G15( )
   {
      /* Scan By routine */
      /* Using cursor BC000G14 */
      pr_default.execute(12, new Object[] {new Long(A63TBM21_STUDY_ID)});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A63TBM21_STUDY_ID = BC000G14_A63TBM21_STUDY_ID[0] ;
         A370TBM21_CRT_DATETIME = BC000G14_A370TBM21_CRT_DATETIME[0] ;
         n370TBM21_CRT_DATETIME = BC000G14_n370TBM21_CRT_DATETIME[0] ;
         A371TBM21_CRT_USER_ID = BC000G14_A371TBM21_CRT_USER_ID[0] ;
         n371TBM21_CRT_USER_ID = BC000G14_n371TBM21_CRT_USER_ID[0] ;
         A373TBM21_UPD_DATETIME = BC000G14_A373TBM21_UPD_DATETIME[0] ;
         n373TBM21_UPD_DATETIME = BC000G14_n373TBM21_UPD_DATETIME[0] ;
         A374TBM21_UPD_USER_ID = BC000G14_A374TBM21_UPD_USER_ID[0] ;
         n374TBM21_UPD_USER_ID = BC000G14_n374TBM21_UPD_USER_ID[0] ;
         A376TBM21_UPD_CNT = BC000G14_A376TBM21_UPD_CNT[0] ;
         n376TBM21_UPD_CNT = BC000G14_n376TBM21_UPD_CNT[0] ;
         A367TBM21_STUDY_NM = BC000G14_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = BC000G14_n367TBM21_STUDY_NM[0] ;
         A530TBM21_OUTER_STUDY_ID = BC000G14_A530TBM21_OUTER_STUDY_ID[0] ;
         n530TBM21_OUTER_STUDY_ID = BC000G14_n530TBM21_OUTER_STUDY_ID[0] ;
         A531TBM21_PROC_NM = BC000G14_A531TBM21_PROC_NM[0] ;
         n531TBM21_PROC_NM = BC000G14_n531TBM21_PROC_NM[0] ;
         A368TBM21_NOTE = BC000G14_A368TBM21_NOTE[0] ;
         n368TBM21_NOTE = BC000G14_n368TBM21_NOTE[0] ;
         A607TBM21_STATUS = BC000G14_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = BC000G14_n607TBM21_STATUS[0] ;
         A369TBM21_DEL_FLG = BC000G14_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = BC000G14_n369TBM21_DEL_FLG[0] ;
         A372TBM21_CRT_PROG_NM = BC000G14_A372TBM21_CRT_PROG_NM[0] ;
         n372TBM21_CRT_PROG_NM = BC000G14_n372TBM21_CRT_PROG_NM[0] ;
         A375TBM21_UPD_PROG_NM = BC000G14_A375TBM21_UPD_PROG_NM[0] ;
         n375TBM21_UPD_PROG_NM = BC000G14_n375TBM21_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0G15( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound15 = (short)(0) ;
      scanKeyLoad0G15( ) ;
   }

   public void scanKeyLoad0G15( )
   {
      sMode15 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A63TBM21_STUDY_ID = BC000G14_A63TBM21_STUDY_ID[0] ;
         A370TBM21_CRT_DATETIME = BC000G14_A370TBM21_CRT_DATETIME[0] ;
         n370TBM21_CRT_DATETIME = BC000G14_n370TBM21_CRT_DATETIME[0] ;
         A371TBM21_CRT_USER_ID = BC000G14_A371TBM21_CRT_USER_ID[0] ;
         n371TBM21_CRT_USER_ID = BC000G14_n371TBM21_CRT_USER_ID[0] ;
         A373TBM21_UPD_DATETIME = BC000G14_A373TBM21_UPD_DATETIME[0] ;
         n373TBM21_UPD_DATETIME = BC000G14_n373TBM21_UPD_DATETIME[0] ;
         A374TBM21_UPD_USER_ID = BC000G14_A374TBM21_UPD_USER_ID[0] ;
         n374TBM21_UPD_USER_ID = BC000G14_n374TBM21_UPD_USER_ID[0] ;
         A376TBM21_UPD_CNT = BC000G14_A376TBM21_UPD_CNT[0] ;
         n376TBM21_UPD_CNT = BC000G14_n376TBM21_UPD_CNT[0] ;
         A367TBM21_STUDY_NM = BC000G14_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = BC000G14_n367TBM21_STUDY_NM[0] ;
         A530TBM21_OUTER_STUDY_ID = BC000G14_A530TBM21_OUTER_STUDY_ID[0] ;
         n530TBM21_OUTER_STUDY_ID = BC000G14_n530TBM21_OUTER_STUDY_ID[0] ;
         A531TBM21_PROC_NM = BC000G14_A531TBM21_PROC_NM[0] ;
         n531TBM21_PROC_NM = BC000G14_n531TBM21_PROC_NM[0] ;
         A368TBM21_NOTE = BC000G14_A368TBM21_NOTE[0] ;
         n368TBM21_NOTE = BC000G14_n368TBM21_NOTE[0] ;
         A607TBM21_STATUS = BC000G14_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = BC000G14_n607TBM21_STATUS[0] ;
         A369TBM21_DEL_FLG = BC000G14_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = BC000G14_n369TBM21_DEL_FLG[0] ;
         A372TBM21_CRT_PROG_NM = BC000G14_A372TBM21_CRT_PROG_NM[0] ;
         n372TBM21_CRT_PROG_NM = BC000G14_n372TBM21_CRT_PROG_NM[0] ;
         A375TBM21_UPD_PROG_NM = BC000G14_A375TBM21_UPD_PROG_NM[0] ;
         n375TBM21_UPD_PROG_NM = BC000G14_n375TBM21_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode15 ;
   }

   public void scanKeyEnd0G15( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0G15( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0G15( )
   {
      /* Before Insert Rules */
      A370TBM21_CRT_DATETIME = GXutil.now( ) ;
      n370TBM21_CRT_DATETIME = false ;
      GXt_char1 = A371TBM21_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      A371TBM21_CRT_USER_ID = GXt_char1 ;
      n371TBM21_CRT_USER_ID = false ;
      A373TBM21_UPD_DATETIME = GXutil.now( ) ;
      n373TBM21_UPD_DATETIME = false ;
      GXt_char1 = A374TBM21_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      A374TBM21_UPD_USER_ID = GXt_char1 ;
      n374TBM21_UPD_USER_ID = false ;
      A376TBM21_UPD_CNT = (long)(O376TBM21_UPD_CNT+1) ;
      n376TBM21_UPD_CNT = false ;
   }

   public void beforeUpdate0G15( )
   {
      /* Before Update Rules */
      A373TBM21_UPD_DATETIME = GXutil.now( ) ;
      n373TBM21_UPD_DATETIME = false ;
      GXt_char1 = A374TBM21_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      A374TBM21_UPD_USER_ID = GXt_char1 ;
      n374TBM21_UPD_USER_ID = false ;
      A376TBM21_UPD_CNT = (long)(O376TBM21_UPD_CNT+1) ;
      n376TBM21_UPD_CNT = false ;
   }

   public void beforeDelete0G15( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0G15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0G15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0G15( )
   {
   }

   public void addRow0G15( )
   {
      VarsToRow15( bcTBM21_STUDY) ;
   }

   public void readRow0G15( )
   {
      RowToVars15( bcTBM21_STUDY, 1) ;
   }

   public void initializeNonKey0G15( )
   {
      A370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n370TBM21_CRT_DATETIME = false ;
      A371TBM21_CRT_USER_ID = "" ;
      n371TBM21_CRT_USER_ID = false ;
      A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n373TBM21_UPD_DATETIME = false ;
      A374TBM21_UPD_USER_ID = "" ;
      n374TBM21_UPD_USER_ID = false ;
      A376TBM21_UPD_CNT = 0 ;
      n376TBM21_UPD_CNT = false ;
      A367TBM21_STUDY_NM = "" ;
      n367TBM21_STUDY_NM = false ;
      A530TBM21_OUTER_STUDY_ID = "" ;
      n530TBM21_OUTER_STUDY_ID = false ;
      A531TBM21_PROC_NM = "" ;
      n531TBM21_PROC_NM = false ;
      A368TBM21_NOTE = "" ;
      n368TBM21_NOTE = false ;
      A607TBM21_STATUS = "" ;
      n607TBM21_STATUS = false ;
      A369TBM21_DEL_FLG = "" ;
      n369TBM21_DEL_FLG = false ;
      A372TBM21_CRT_PROG_NM = "" ;
      n372TBM21_CRT_PROG_NM = false ;
      A375TBM21_UPD_PROG_NM = "" ;
      n375TBM21_UPD_PROG_NM = false ;
      O376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
      n376TBM21_UPD_CNT = false ;
   }

   public void initAll0G15( )
   {
      A63TBM21_STUDY_ID = 0 ;
      initializeNonKey0G15( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow15( SdtTBM21_STUDY obj15 )
   {
      obj15.setgxTv_SdtTBM21_STUDY_Mode( Gx_mode );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime( A370TBM21_CRT_DATETIME );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id( A371TBM21_CRT_USER_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime( A373TBM21_UPD_DATETIME );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id( A374TBM21_UPD_USER_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt( A376TBM21_UPD_CNT );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_nm( A367TBM21_STUDY_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id( A530TBM21_OUTER_STUDY_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_proc_nm( A531TBM21_PROC_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_note( A368TBM21_NOTE );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_status( A607TBM21_STATUS );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_del_flg( A369TBM21_DEL_FLG );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm( A372TBM21_CRT_PROG_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm( A375TBM21_UPD_PROG_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_id( A63TBM21_STUDY_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_id_Z( Z63TBM21_STUDY_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_nm_Z( Z367TBM21_STUDY_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_Z( Z530TBM21_OUTER_STUDY_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_proc_nm_Z( Z531TBM21_PROC_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_note_Z( Z368TBM21_NOTE );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_status_Z( Z607TBM21_STATUS );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_del_flg_Z( Z369TBM21_DEL_FLG );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_Z( Z370TBM21_CRT_DATETIME );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_Z( Z371TBM21_CRT_USER_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_Z( Z372TBM21_CRT_PROG_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_Z( Z373TBM21_UPD_DATETIME );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_Z( Z374TBM21_UPD_USER_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_Z( Z375TBM21_UPD_PROG_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_Z( Z376TBM21_UPD_CNT );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_nm_N( (byte)((byte)((n367TBM21_STUDY_NM)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_N( (byte)((byte)((n530TBM21_OUTER_STUDY_ID)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_proc_nm_N( (byte)((byte)((n531TBM21_PROC_NM)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_note_N( (byte)((byte)((n368TBM21_NOTE)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_status_N( (byte)((byte)((n607TBM21_STATUS)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_del_flg_N( (byte)((byte)((n369TBM21_DEL_FLG)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_N( (byte)((byte)((n370TBM21_CRT_DATETIME)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_N( (byte)((byte)((n371TBM21_CRT_USER_ID)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_N( (byte)((byte)((n372TBM21_CRT_PROG_NM)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_N( (byte)((byte)((n373TBM21_UPD_DATETIME)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_N( (byte)((byte)((n374TBM21_UPD_USER_ID)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_N( (byte)((byte)((n375TBM21_UPD_PROG_NM)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_N( (byte)((byte)((n376TBM21_UPD_CNT)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Mode( Gx_mode );
   }

   public void KeyVarsToRow15( SdtTBM21_STUDY obj15 )
   {
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_id( A63TBM21_STUDY_ID );
   }

   public void RowToVars15( SdtTBM21_STUDY obj15 ,
                            int forceLoad )
   {
      Gx_mode = obj15.getgxTv_SdtTBM21_STUDY_Mode() ;
      A370TBM21_CRT_DATETIME = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime() ;
      n370TBM21_CRT_DATETIME = false ;
      A371TBM21_CRT_USER_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id() ;
      n371TBM21_CRT_USER_ID = false ;
      A373TBM21_UPD_DATETIME = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime() ;
      n373TBM21_UPD_DATETIME = false ;
      A374TBM21_UPD_USER_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id() ;
      n374TBM21_UPD_USER_ID = false ;
      A376TBM21_UPD_CNT = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt() ;
      n376TBM21_UPD_CNT = false ;
      A367TBM21_STUDY_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm() ;
      n367TBM21_STUDY_NM = false ;
      A530TBM21_OUTER_STUDY_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id() ;
      n530TBM21_OUTER_STUDY_ID = false ;
      A531TBM21_PROC_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm() ;
      n531TBM21_PROC_NM = false ;
      A368TBM21_NOTE = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_note() ;
      n368TBM21_NOTE = false ;
      A607TBM21_STATUS = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_status() ;
      n607TBM21_STATUS = false ;
      A369TBM21_DEL_FLG = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg() ;
      n369TBM21_DEL_FLG = false ;
      A372TBM21_CRT_PROG_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm() ;
      n372TBM21_CRT_PROG_NM = false ;
      A375TBM21_UPD_PROG_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm() ;
      n375TBM21_UPD_PROG_NM = false ;
      A63TBM21_STUDY_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_id() ;
      Z63TBM21_STUDY_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_id_Z() ;
      Z367TBM21_STUDY_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm_Z() ;
      Z530TBM21_OUTER_STUDY_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_Z() ;
      Z531TBM21_PROC_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm_Z() ;
      Z368TBM21_NOTE = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_note_Z() ;
      Z607TBM21_STATUS = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_status_Z() ;
      Z369TBM21_DEL_FLG = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg_Z() ;
      Z370TBM21_CRT_DATETIME = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_Z() ;
      Z371TBM21_CRT_USER_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_Z() ;
      Z372TBM21_CRT_PROG_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_Z() ;
      Z373TBM21_UPD_DATETIME = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_Z() ;
      Z374TBM21_UPD_USER_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_Z() ;
      Z375TBM21_UPD_PROG_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_Z() ;
      Z376TBM21_UPD_CNT = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_Z() ;
      O376TBM21_UPD_CNT = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_Z() ;
      n367TBM21_STUDY_NM = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm_N()==0)?false:true) ;
      n530TBM21_OUTER_STUDY_ID = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_N()==0)?false:true) ;
      n531TBM21_PROC_NM = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm_N()==0)?false:true) ;
      n368TBM21_NOTE = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_note_N()==0)?false:true) ;
      n607TBM21_STATUS = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_status_N()==0)?false:true) ;
      n369TBM21_DEL_FLG = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg_N()==0)?false:true) ;
      n370TBM21_CRT_DATETIME = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_N()==0)?false:true) ;
      n371TBM21_CRT_USER_ID = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_N()==0)?false:true) ;
      n372TBM21_CRT_PROG_NM = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_N()==0)?false:true) ;
      n373TBM21_UPD_DATETIME = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_N()==0)?false:true) ;
      n374TBM21_UPD_USER_ID = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_N()==0)?false:true) ;
      n375TBM21_UPD_PROG_NM = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_N()==0)?false:true) ;
      n376TBM21_UPD_CNT = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj15.getgxTv_SdtTBM21_STUDY_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A63TBM21_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0G15( ) ;
      scanKeyStart0G15( ) ;
      if ( RcdFound15 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z63TBM21_STUDY_ID = A63TBM21_STUDY_ID ;
         O376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
         n376TBM21_UPD_CNT = false ;
      }
      zm0G15( -8) ;
      onLoadActions0G15( ) ;
      addRow0G15( ) ;
      scanKeyEnd0G15( ) ;
      if ( RcdFound15 == 0 )
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
      RowToVars15( bcTBM21_STUDY, 0) ;
      scanKeyStart0G15( ) ;
      if ( RcdFound15 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z63TBM21_STUDY_ID = A63TBM21_STUDY_ID ;
         O376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
         n376TBM21_UPD_CNT = false ;
      }
      zm0G15( -8) ;
      onLoadActions0G15( ) ;
      addRow0G15( ) ;
      scanKeyEnd0G15( ) ;
      if ( RcdFound15 == 0 )
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
      RowToVars15( bcTBM21_STUDY, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0G15( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0G15( ) ;
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( A63TBM21_STUDY_ID != Z63TBM21_STUDY_ID )
            {
               A63TBM21_STUDY_ID = Z63TBM21_STUDY_ID ;
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
               update0G15( ) ;
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
               if ( A63TBM21_STUDY_ID != Z63TBM21_STUDY_ID )
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
                     insert0G15( ) ;
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
                     insert0G15( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow15( bcTBM21_STUDY) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars15( bcTBM21_STUDY, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0G15( ) ;
      if ( RcdFound15 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A63TBM21_STUDY_ID != Z63TBM21_STUDY_ID )
         {
            A63TBM21_STUDY_ID = Z63TBM21_STUDY_ID ;
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
         if ( A63TBM21_STUDY_ID != Z63TBM21_STUDY_ID )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm21_study_bc");
      VarsToRow15( bcTBM21_STUDY) ;
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
      Gx_mode = bcTBM21_STUDY.getgxTv_SdtTBM21_STUDY_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM21_STUDY.setgxTv_SdtTBM21_STUDY_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM21_STUDY sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM21_STUDY )
      {
         bcTBM21_STUDY = sdt ;
         if ( GXutil.strcmp(bcTBM21_STUDY.getgxTv_SdtTBM21_STUDY_Mode(), "") == 0 )
         {
            bcTBM21_STUDY.setgxTv_SdtTBM21_STUDY_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow15( bcTBM21_STUDY) ;
         }
         else
         {
            RowToVars15( bcTBM21_STUDY, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM21_STUDY.getgxTv_SdtTBM21_STUDY_Mode(), "") == 0 )
         {
            bcTBM21_STUDY.setgxTv_SdtTBM21_STUDY_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars15( bcTBM21_STUDY, 1) ;
   }

   public SdtTBM21_STUDY getTBM21_STUDY_BC( )
   {
      return bcTBM21_STUDY ;
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
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A367TBM21_STUDY_NM = "" ;
      A530TBM21_OUTER_STUDY_ID = "" ;
      A531TBM21_PROC_NM = "" ;
      A368TBM21_NOTE = "" ;
      A369TBM21_DEL_FLG = "" ;
      A370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A371TBM21_CRT_USER_ID = "" ;
      A372TBM21_CRT_PROG_NM = "" ;
      A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A374TBM21_UPD_USER_ID = "" ;
      A375TBM21_UPD_PROG_NM = "" ;
      Z370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z371TBM21_CRT_USER_ID = "" ;
      Z373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z374TBM21_UPD_USER_ID = "" ;
      Z367TBM21_STUDY_NM = "" ;
      Z530TBM21_OUTER_STUDY_ID = "" ;
      Z531TBM21_PROC_NM = "" ;
      Z368TBM21_NOTE = "" ;
      Z607TBM21_STATUS = "" ;
      A607TBM21_STATUS = "" ;
      Z369TBM21_DEL_FLG = "" ;
      Z372TBM21_CRT_PROG_NM = "" ;
      Z375TBM21_UPD_PROG_NM = "" ;
      BC000G4_A63TBM21_STUDY_ID = new long[1] ;
      BC000G4_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G4_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      BC000G4_A371TBM21_CRT_USER_ID = new String[] {""} ;
      BC000G4_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      BC000G4_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G4_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      BC000G4_A374TBM21_UPD_USER_ID = new String[] {""} ;
      BC000G4_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      BC000G4_A376TBM21_UPD_CNT = new long[1] ;
      BC000G4_n376TBM21_UPD_CNT = new boolean[] {false} ;
      BC000G4_A367TBM21_STUDY_NM = new String[] {""} ;
      BC000G4_n367TBM21_STUDY_NM = new boolean[] {false} ;
      BC000G4_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      BC000G4_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      BC000G4_A531TBM21_PROC_NM = new String[] {""} ;
      BC000G4_n531TBM21_PROC_NM = new boolean[] {false} ;
      BC000G4_A368TBM21_NOTE = new String[] {""} ;
      BC000G4_n368TBM21_NOTE = new boolean[] {false} ;
      BC000G4_A607TBM21_STATUS = new String[] {""} ;
      BC000G4_n607TBM21_STATUS = new boolean[] {false} ;
      BC000G4_A369TBM21_DEL_FLG = new String[] {""} ;
      BC000G4_n369TBM21_DEL_FLG = new boolean[] {false} ;
      BC000G4_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      BC000G4_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      BC000G4_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      BC000G4_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      BC000G5_A63TBM21_STUDY_ID = new long[1] ;
      BC000G3_A63TBM21_STUDY_ID = new long[1] ;
      BC000G3_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G3_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      BC000G3_A371TBM21_CRT_USER_ID = new String[] {""} ;
      BC000G3_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      BC000G3_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G3_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      BC000G3_A374TBM21_UPD_USER_ID = new String[] {""} ;
      BC000G3_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      BC000G3_A376TBM21_UPD_CNT = new long[1] ;
      BC000G3_n376TBM21_UPD_CNT = new boolean[] {false} ;
      BC000G3_A367TBM21_STUDY_NM = new String[] {""} ;
      BC000G3_n367TBM21_STUDY_NM = new boolean[] {false} ;
      BC000G3_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      BC000G3_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      BC000G3_A531TBM21_PROC_NM = new String[] {""} ;
      BC000G3_n531TBM21_PROC_NM = new boolean[] {false} ;
      BC000G3_A368TBM21_NOTE = new String[] {""} ;
      BC000G3_n368TBM21_NOTE = new boolean[] {false} ;
      BC000G3_A607TBM21_STATUS = new String[] {""} ;
      BC000G3_n607TBM21_STATUS = new boolean[] {false} ;
      BC000G3_A369TBM21_DEL_FLG = new String[] {""} ;
      BC000G3_n369TBM21_DEL_FLG = new boolean[] {false} ;
      BC000G3_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      BC000G3_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      BC000G3_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      BC000G3_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      sMode15 = "" ;
      BC000G2_A63TBM21_STUDY_ID = new long[1] ;
      BC000G2_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G2_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      BC000G2_A371TBM21_CRT_USER_ID = new String[] {""} ;
      BC000G2_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      BC000G2_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G2_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      BC000G2_A374TBM21_UPD_USER_ID = new String[] {""} ;
      BC000G2_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      BC000G2_A376TBM21_UPD_CNT = new long[1] ;
      BC000G2_n376TBM21_UPD_CNT = new boolean[] {false} ;
      BC000G2_A367TBM21_STUDY_NM = new String[] {""} ;
      BC000G2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      BC000G2_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      BC000G2_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      BC000G2_A531TBM21_PROC_NM = new String[] {""} ;
      BC000G2_n531TBM21_PROC_NM = new boolean[] {false} ;
      BC000G2_A368TBM21_NOTE = new String[] {""} ;
      BC000G2_n368TBM21_NOTE = new boolean[] {false} ;
      BC000G2_A607TBM21_STATUS = new String[] {""} ;
      BC000G2_n607TBM21_STATUS = new boolean[] {false} ;
      BC000G2_A369TBM21_DEL_FLG = new String[] {""} ;
      BC000G2_n369TBM21_DEL_FLG = new boolean[] {false} ;
      BC000G2_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      BC000G2_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      BC000G2_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      BC000G2_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      BC000G9_A107TBM23_STUDY_ID = new long[1] ;
      BC000G9_A108TBM23_USER_ID = new String[] {""} ;
      BC000G9_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000G10_A68TBM31_STUDY_ID = new long[1] ;
      BC000G10_A69TBM31_CRF_ID = new short[1] ;
      BC000G11_A64TBM24_STUDY_ID = new long[1] ;
      BC000G11_A65TBM24_DOM_CD = new String[] {""} ;
      BC000G11_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000G11_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000G12_A23TBM25_STUDY_ID = new long[1] ;
      BC000G12_A24TBM25_LIST_CD = new String[] {""} ;
      BC000G13_A17TBM22_STUDY_ID = new long[1] ;
      BC000G13_A18TBM22_SITE_ID = new String[] {""} ;
      BC000G14_A63TBM21_STUDY_ID = new long[1] ;
      BC000G14_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G14_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      BC000G14_A371TBM21_CRT_USER_ID = new String[] {""} ;
      BC000G14_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      BC000G14_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G14_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      BC000G14_A374TBM21_UPD_USER_ID = new String[] {""} ;
      BC000G14_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      BC000G14_A376TBM21_UPD_CNT = new long[1] ;
      BC000G14_n376TBM21_UPD_CNT = new boolean[] {false} ;
      BC000G14_A367TBM21_STUDY_NM = new String[] {""} ;
      BC000G14_n367TBM21_STUDY_NM = new boolean[] {false} ;
      BC000G14_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      BC000G14_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      BC000G14_A531TBM21_PROC_NM = new String[] {""} ;
      BC000G14_n531TBM21_PROC_NM = new boolean[] {false} ;
      BC000G14_A368TBM21_NOTE = new String[] {""} ;
      BC000G14_n368TBM21_NOTE = new boolean[] {false} ;
      BC000G14_A607TBM21_STATUS = new String[] {""} ;
      BC000G14_n607TBM21_STATUS = new boolean[] {false} ;
      BC000G14_A369TBM21_DEL_FLG = new String[] {""} ;
      BC000G14_n369TBM21_DEL_FLG = new boolean[] {false} ;
      BC000G14_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      BC000G14_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      BC000G14_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      BC000G14_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm21_study_bc__default(),
         new Object[] {
             new Object[] {
            BC000G2_A63TBM21_STUDY_ID, BC000G2_A370TBM21_CRT_DATETIME, BC000G2_n370TBM21_CRT_DATETIME, BC000G2_A371TBM21_CRT_USER_ID, BC000G2_n371TBM21_CRT_USER_ID, BC000G2_A373TBM21_UPD_DATETIME, BC000G2_n373TBM21_UPD_DATETIME, BC000G2_A374TBM21_UPD_USER_ID, BC000G2_n374TBM21_UPD_USER_ID, BC000G2_A376TBM21_UPD_CNT,
            BC000G2_n376TBM21_UPD_CNT, BC000G2_A367TBM21_STUDY_NM, BC000G2_n367TBM21_STUDY_NM, BC000G2_A530TBM21_OUTER_STUDY_ID, BC000G2_n530TBM21_OUTER_STUDY_ID, BC000G2_A531TBM21_PROC_NM, BC000G2_n531TBM21_PROC_NM, BC000G2_A368TBM21_NOTE, BC000G2_n368TBM21_NOTE, BC000G2_A607TBM21_STATUS,
            BC000G2_n607TBM21_STATUS, BC000G2_A369TBM21_DEL_FLG, BC000G2_n369TBM21_DEL_FLG, BC000G2_A372TBM21_CRT_PROG_NM, BC000G2_n372TBM21_CRT_PROG_NM, BC000G2_A375TBM21_UPD_PROG_NM, BC000G2_n375TBM21_UPD_PROG_NM
            }
            , new Object[] {
            BC000G3_A63TBM21_STUDY_ID, BC000G3_A370TBM21_CRT_DATETIME, BC000G3_n370TBM21_CRT_DATETIME, BC000G3_A371TBM21_CRT_USER_ID, BC000G3_n371TBM21_CRT_USER_ID, BC000G3_A373TBM21_UPD_DATETIME, BC000G3_n373TBM21_UPD_DATETIME, BC000G3_A374TBM21_UPD_USER_ID, BC000G3_n374TBM21_UPD_USER_ID, BC000G3_A376TBM21_UPD_CNT,
            BC000G3_n376TBM21_UPD_CNT, BC000G3_A367TBM21_STUDY_NM, BC000G3_n367TBM21_STUDY_NM, BC000G3_A530TBM21_OUTER_STUDY_ID, BC000G3_n530TBM21_OUTER_STUDY_ID, BC000G3_A531TBM21_PROC_NM, BC000G3_n531TBM21_PROC_NM, BC000G3_A368TBM21_NOTE, BC000G3_n368TBM21_NOTE, BC000G3_A607TBM21_STATUS,
            BC000G3_n607TBM21_STATUS, BC000G3_A369TBM21_DEL_FLG, BC000G3_n369TBM21_DEL_FLG, BC000G3_A372TBM21_CRT_PROG_NM, BC000G3_n372TBM21_CRT_PROG_NM, BC000G3_A375TBM21_UPD_PROG_NM, BC000G3_n375TBM21_UPD_PROG_NM
            }
            , new Object[] {
            BC000G4_A63TBM21_STUDY_ID, BC000G4_A370TBM21_CRT_DATETIME, BC000G4_n370TBM21_CRT_DATETIME, BC000G4_A371TBM21_CRT_USER_ID, BC000G4_n371TBM21_CRT_USER_ID, BC000G4_A373TBM21_UPD_DATETIME, BC000G4_n373TBM21_UPD_DATETIME, BC000G4_A374TBM21_UPD_USER_ID, BC000G4_n374TBM21_UPD_USER_ID, BC000G4_A376TBM21_UPD_CNT,
            BC000G4_n376TBM21_UPD_CNT, BC000G4_A367TBM21_STUDY_NM, BC000G4_n367TBM21_STUDY_NM, BC000G4_A530TBM21_OUTER_STUDY_ID, BC000G4_n530TBM21_OUTER_STUDY_ID, BC000G4_A531TBM21_PROC_NM, BC000G4_n531TBM21_PROC_NM, BC000G4_A368TBM21_NOTE, BC000G4_n368TBM21_NOTE, BC000G4_A607TBM21_STATUS,
            BC000G4_n607TBM21_STATUS, BC000G4_A369TBM21_DEL_FLG, BC000G4_n369TBM21_DEL_FLG, BC000G4_A372TBM21_CRT_PROG_NM, BC000G4_n372TBM21_CRT_PROG_NM, BC000G4_A375TBM21_UPD_PROG_NM, BC000G4_n375TBM21_UPD_PROG_NM
            }
            , new Object[] {
            BC000G5_A63TBM21_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000G9_A107TBM23_STUDY_ID, BC000G9_A108TBM23_USER_ID, BC000G9_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            BC000G10_A68TBM31_STUDY_ID, BC000G10_A69TBM31_CRF_ID
            }
            , new Object[] {
            BC000G11_A64TBM24_STUDY_ID, BC000G11_A65TBM24_DOM_CD, BC000G11_A66TBM24_DOM_VAR_NM, BC000G11_A67TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            BC000G12_A23TBM25_STUDY_ID, BC000G12_A24TBM25_LIST_CD
            }
            , new Object[] {
            BC000G13_A17TBM22_STUDY_ID, BC000G13_A18TBM22_SITE_ID
            }
            , new Object[] {
            BC000G14_A63TBM21_STUDY_ID, BC000G14_A370TBM21_CRT_DATETIME, BC000G14_n370TBM21_CRT_DATETIME, BC000G14_A371TBM21_CRT_USER_ID, BC000G14_n371TBM21_CRT_USER_ID, BC000G14_A373TBM21_UPD_DATETIME, BC000G14_n373TBM21_UPD_DATETIME, BC000G14_A374TBM21_UPD_USER_ID, BC000G14_n374TBM21_UPD_USER_ID, BC000G14_A376TBM21_UPD_CNT,
            BC000G14_n376TBM21_UPD_CNT, BC000G14_A367TBM21_STUDY_NM, BC000G14_n367TBM21_STUDY_NM, BC000G14_A530TBM21_OUTER_STUDY_ID, BC000G14_n530TBM21_OUTER_STUDY_ID, BC000G14_A531TBM21_PROC_NM, BC000G14_n531TBM21_PROC_NM, BC000G14_A368TBM21_NOTE, BC000G14_n368TBM21_NOTE, BC000G14_A607TBM21_STATUS,
            BC000G14_n607TBM21_STATUS, BC000G14_A369TBM21_DEL_FLG, BC000G14_n369TBM21_DEL_FLG, BC000G14_A372TBM21_CRT_PROG_NM, BC000G14_n372TBM21_CRT_PROG_NM, BC000G14_A375TBM21_UPD_PROG_NM, BC000G14_n375TBM21_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM21_STUDY_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110G2 */
      e110G2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound15 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z63TBM21_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long A376TBM21_UPD_CNT ;
   private long Z376TBM21_UPD_CNT ;
   private long O376TBM21_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode15 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A370TBM21_CRT_DATETIME ;
   private java.util.Date A373TBM21_UPD_DATETIME ;
   private java.util.Date Z370TBM21_CRT_DATETIME ;
   private java.util.Date Z373TBM21_UPD_DATETIME ;
   private boolean n370TBM21_CRT_DATETIME ;
   private boolean n371TBM21_CRT_USER_ID ;
   private boolean n373TBM21_UPD_DATETIME ;
   private boolean n374TBM21_UPD_USER_ID ;
   private boolean n376TBM21_UPD_CNT ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n530TBM21_OUTER_STUDY_ID ;
   private boolean n531TBM21_PROC_NM ;
   private boolean n368TBM21_NOTE ;
   private boolean n607TBM21_STATUS ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n372TBM21_CRT_PROG_NM ;
   private boolean n375TBM21_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A367TBM21_STUDY_NM ;
   private String A530TBM21_OUTER_STUDY_ID ;
   private String A531TBM21_PROC_NM ;
   private String A368TBM21_NOTE ;
   private String A369TBM21_DEL_FLG ;
   private String A371TBM21_CRT_USER_ID ;
   private String A372TBM21_CRT_PROG_NM ;
   private String A374TBM21_UPD_USER_ID ;
   private String A375TBM21_UPD_PROG_NM ;
   private String Z371TBM21_CRT_USER_ID ;
   private String Z374TBM21_UPD_USER_ID ;
   private String Z367TBM21_STUDY_NM ;
   private String Z530TBM21_OUTER_STUDY_ID ;
   private String Z531TBM21_PROC_NM ;
   private String Z368TBM21_NOTE ;
   private String Z607TBM21_STATUS ;
   private String A607TBM21_STATUS ;
   private String Z369TBM21_DEL_FLG ;
   private String Z372TBM21_CRT_PROG_NM ;
   private String Z375TBM21_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM21_STUDY bcTBM21_STUDY ;
   private IDataStoreProvider pr_default ;
   private long[] BC000G4_A63TBM21_STUDY_ID ;
   private java.util.Date[] BC000G4_A370TBM21_CRT_DATETIME ;
   private boolean[] BC000G4_n370TBM21_CRT_DATETIME ;
   private String[] BC000G4_A371TBM21_CRT_USER_ID ;
   private boolean[] BC000G4_n371TBM21_CRT_USER_ID ;
   private java.util.Date[] BC000G4_A373TBM21_UPD_DATETIME ;
   private boolean[] BC000G4_n373TBM21_UPD_DATETIME ;
   private String[] BC000G4_A374TBM21_UPD_USER_ID ;
   private boolean[] BC000G4_n374TBM21_UPD_USER_ID ;
   private long[] BC000G4_A376TBM21_UPD_CNT ;
   private boolean[] BC000G4_n376TBM21_UPD_CNT ;
   private String[] BC000G4_A367TBM21_STUDY_NM ;
   private boolean[] BC000G4_n367TBM21_STUDY_NM ;
   private String[] BC000G4_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] BC000G4_n530TBM21_OUTER_STUDY_ID ;
   private String[] BC000G4_A531TBM21_PROC_NM ;
   private boolean[] BC000G4_n531TBM21_PROC_NM ;
   private String[] BC000G4_A368TBM21_NOTE ;
   private boolean[] BC000G4_n368TBM21_NOTE ;
   private String[] BC000G4_A607TBM21_STATUS ;
   private boolean[] BC000G4_n607TBM21_STATUS ;
   private String[] BC000G4_A369TBM21_DEL_FLG ;
   private boolean[] BC000G4_n369TBM21_DEL_FLG ;
   private String[] BC000G4_A372TBM21_CRT_PROG_NM ;
   private boolean[] BC000G4_n372TBM21_CRT_PROG_NM ;
   private String[] BC000G4_A375TBM21_UPD_PROG_NM ;
   private boolean[] BC000G4_n375TBM21_UPD_PROG_NM ;
   private long[] BC000G5_A63TBM21_STUDY_ID ;
   private long[] BC000G3_A63TBM21_STUDY_ID ;
   private java.util.Date[] BC000G3_A370TBM21_CRT_DATETIME ;
   private boolean[] BC000G3_n370TBM21_CRT_DATETIME ;
   private String[] BC000G3_A371TBM21_CRT_USER_ID ;
   private boolean[] BC000G3_n371TBM21_CRT_USER_ID ;
   private java.util.Date[] BC000G3_A373TBM21_UPD_DATETIME ;
   private boolean[] BC000G3_n373TBM21_UPD_DATETIME ;
   private String[] BC000G3_A374TBM21_UPD_USER_ID ;
   private boolean[] BC000G3_n374TBM21_UPD_USER_ID ;
   private long[] BC000G3_A376TBM21_UPD_CNT ;
   private boolean[] BC000G3_n376TBM21_UPD_CNT ;
   private String[] BC000G3_A367TBM21_STUDY_NM ;
   private boolean[] BC000G3_n367TBM21_STUDY_NM ;
   private String[] BC000G3_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] BC000G3_n530TBM21_OUTER_STUDY_ID ;
   private String[] BC000G3_A531TBM21_PROC_NM ;
   private boolean[] BC000G3_n531TBM21_PROC_NM ;
   private String[] BC000G3_A368TBM21_NOTE ;
   private boolean[] BC000G3_n368TBM21_NOTE ;
   private String[] BC000G3_A607TBM21_STATUS ;
   private boolean[] BC000G3_n607TBM21_STATUS ;
   private String[] BC000G3_A369TBM21_DEL_FLG ;
   private boolean[] BC000G3_n369TBM21_DEL_FLG ;
   private String[] BC000G3_A372TBM21_CRT_PROG_NM ;
   private boolean[] BC000G3_n372TBM21_CRT_PROG_NM ;
   private String[] BC000G3_A375TBM21_UPD_PROG_NM ;
   private boolean[] BC000G3_n375TBM21_UPD_PROG_NM ;
   private long[] BC000G2_A63TBM21_STUDY_ID ;
   private java.util.Date[] BC000G2_A370TBM21_CRT_DATETIME ;
   private boolean[] BC000G2_n370TBM21_CRT_DATETIME ;
   private String[] BC000G2_A371TBM21_CRT_USER_ID ;
   private boolean[] BC000G2_n371TBM21_CRT_USER_ID ;
   private java.util.Date[] BC000G2_A373TBM21_UPD_DATETIME ;
   private boolean[] BC000G2_n373TBM21_UPD_DATETIME ;
   private String[] BC000G2_A374TBM21_UPD_USER_ID ;
   private boolean[] BC000G2_n374TBM21_UPD_USER_ID ;
   private long[] BC000G2_A376TBM21_UPD_CNT ;
   private boolean[] BC000G2_n376TBM21_UPD_CNT ;
   private String[] BC000G2_A367TBM21_STUDY_NM ;
   private boolean[] BC000G2_n367TBM21_STUDY_NM ;
   private String[] BC000G2_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] BC000G2_n530TBM21_OUTER_STUDY_ID ;
   private String[] BC000G2_A531TBM21_PROC_NM ;
   private boolean[] BC000G2_n531TBM21_PROC_NM ;
   private String[] BC000G2_A368TBM21_NOTE ;
   private boolean[] BC000G2_n368TBM21_NOTE ;
   private String[] BC000G2_A607TBM21_STATUS ;
   private boolean[] BC000G2_n607TBM21_STATUS ;
   private String[] BC000G2_A369TBM21_DEL_FLG ;
   private boolean[] BC000G2_n369TBM21_DEL_FLG ;
   private String[] BC000G2_A372TBM21_CRT_PROG_NM ;
   private boolean[] BC000G2_n372TBM21_CRT_PROG_NM ;
   private String[] BC000G2_A375TBM21_UPD_PROG_NM ;
   private boolean[] BC000G2_n375TBM21_UPD_PROG_NM ;
   private long[] BC000G9_A107TBM23_STUDY_ID ;
   private String[] BC000G9_A108TBM23_USER_ID ;
   private String[] BC000G9_A109TBM23_STYDY_AUTH_CD ;
   private long[] BC000G10_A68TBM31_STUDY_ID ;
   private short[] BC000G10_A69TBM31_CRF_ID ;
   private long[] BC000G11_A64TBM24_STUDY_ID ;
   private String[] BC000G11_A65TBM24_DOM_CD ;
   private String[] BC000G11_A66TBM24_DOM_VAR_NM ;
   private String[] BC000G11_A67TBM24_CRF_ITEM_DIV ;
   private long[] BC000G12_A23TBM25_STUDY_ID ;
   private String[] BC000G12_A24TBM25_LIST_CD ;
   private long[] BC000G13_A17TBM22_STUDY_ID ;
   private String[] BC000G13_A18TBM22_SITE_ID ;
   private long[] BC000G14_A63TBM21_STUDY_ID ;
   private java.util.Date[] BC000G14_A370TBM21_CRT_DATETIME ;
   private boolean[] BC000G14_n370TBM21_CRT_DATETIME ;
   private String[] BC000G14_A371TBM21_CRT_USER_ID ;
   private boolean[] BC000G14_n371TBM21_CRT_USER_ID ;
   private java.util.Date[] BC000G14_A373TBM21_UPD_DATETIME ;
   private boolean[] BC000G14_n373TBM21_UPD_DATETIME ;
   private String[] BC000G14_A374TBM21_UPD_USER_ID ;
   private boolean[] BC000G14_n374TBM21_UPD_USER_ID ;
   private long[] BC000G14_A376TBM21_UPD_CNT ;
   private boolean[] BC000G14_n376TBM21_UPD_CNT ;
   private String[] BC000G14_A367TBM21_STUDY_NM ;
   private boolean[] BC000G14_n367TBM21_STUDY_NM ;
   private String[] BC000G14_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] BC000G14_n530TBM21_OUTER_STUDY_ID ;
   private String[] BC000G14_A531TBM21_PROC_NM ;
   private boolean[] BC000G14_n531TBM21_PROC_NM ;
   private String[] BC000G14_A368TBM21_NOTE ;
   private boolean[] BC000G14_n368TBM21_NOTE ;
   private String[] BC000G14_A607TBM21_STATUS ;
   private boolean[] BC000G14_n607TBM21_STATUS ;
   private String[] BC000G14_A369TBM21_DEL_FLG ;
   private boolean[] BC000G14_n369TBM21_DEL_FLG ;
   private String[] BC000G14_A372TBM21_CRT_PROG_NM ;
   private boolean[] BC000G14_n372TBM21_CRT_PROG_NM ;
   private String[] BC000G14_A375TBM21_UPD_PROG_NM ;
   private boolean[] BC000G14_n375TBM21_UPD_PROG_NM ;
}

final  class tbm21_study_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000G2", "SELECT `TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000G3", "SELECT `TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000G4", "SELECT TM1.`TBM21_STUDY_ID`, TM1.`TBM21_CRT_DATETIME`, TM1.`TBM21_CRT_USER_ID`, TM1.`TBM21_UPD_DATETIME`, TM1.`TBM21_UPD_USER_ID`, TM1.`TBM21_UPD_CNT`, TM1.`TBM21_STUDY_NM`, TM1.`TBM21_OUTER_STUDY_ID`, TM1.`TBM21_PROC_NM`, TM1.`TBM21_NOTE`, TM1.`TBM21_STATUS`, TM1.`TBM21_DEL_FLG`, TM1.`TBM21_CRT_PROG_NM`, TM1.`TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` TM1 WHERE TM1.`TBM21_STUDY_ID` = ? ORDER BY TM1.`TBM21_STUDY_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000G5", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000G6", "INSERT INTO `TBM21_STUDY`(`TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000G7", "UPDATE `TBM21_STUDY` SET `TBM21_CRT_DATETIME`=?, `TBM21_CRT_USER_ID`=?, `TBM21_UPD_DATETIME`=?, `TBM21_UPD_USER_ID`=?, `TBM21_UPD_CNT`=?, `TBM21_STUDY_NM`=?, `TBM21_OUTER_STUDY_ID`=?, `TBM21_PROC_NM`=?, `TBM21_NOTE`=?, `TBM21_STATUS`=?, `TBM21_DEL_FLG`=?, `TBM21_CRT_PROG_NM`=?, `TBM21_UPD_PROG_NM`=?  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000G8", "DELETE FROM `TBM21_STUDY`  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000G9", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G10", "SELECT `TBM31_STUDY_ID`, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G11", "SELECT `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G12", "SELECT `TBM25_STUDY_ID`, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G13", "SELECT `TBM22_STUDY_ID`, `TBM22_SITE_ID` FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G14", "SELECT TM1.`TBM21_STUDY_ID`, TM1.`TBM21_CRT_DATETIME`, TM1.`TBM21_CRT_USER_ID`, TM1.`TBM21_UPD_DATETIME`, TM1.`TBM21_UPD_USER_ID`, TM1.`TBM21_UPD_CNT`, TM1.`TBM21_STUDY_NM`, TM1.`TBM21_OUTER_STUDY_ID`, TM1.`TBM21_PROC_NM`, TM1.`TBM21_NOTE`, TM1.`TBM21_STATUS`, TM1.`TBM21_DEL_FLG`, TM1.`TBM21_CRT_PROG_NM`, TM1.`TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` TM1 WHERE TM1.`TBM21_STUDY_ID` = ? ORDER BY TM1.`TBM21_STUDY_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
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
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
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
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 1000);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 40);
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 100);
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
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

