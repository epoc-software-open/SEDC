/*
               File: tbm21_study_bc
        Description: 試験マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:27.54
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
            Z186TBM21_STUDY_ID = A186TBM21_STUDY_ID ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120G2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A187TBM21_STUDY_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A408TBM21_OUTER_STUDY_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A409TBM21_PROC_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A188TBM21_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A189TBM21_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A190TBM21_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A191TBM21_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A192TBM21_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A193TBM21_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A194TBM21_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A195TBM21_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1166( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0G15( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z190TBM21_CRT_DATETIME = A190TBM21_CRT_DATETIME ;
         Z191TBM21_CRT_USER_ID = A191TBM21_CRT_USER_ID ;
         Z193TBM21_UPD_DATETIME = A193TBM21_UPD_DATETIME ;
         Z194TBM21_UPD_USER_ID = A194TBM21_UPD_USER_ID ;
         Z196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
         Z187TBM21_STUDY_NM = A187TBM21_STUDY_NM ;
         Z408TBM21_OUTER_STUDY_ID = A408TBM21_OUTER_STUDY_ID ;
         Z409TBM21_PROC_NM = A409TBM21_PROC_NM ;
         Z188TBM21_NOTE = A188TBM21_NOTE ;
         Z513TBM21_STATUS = A513TBM21_STATUS ;
         Z189TBM21_DEL_FLG = A189TBM21_DEL_FLG ;
         Z192TBM21_CRT_PROG_NM = A192TBM21_CRT_PROG_NM ;
         Z195TBM21_UPD_PROG_NM = A195TBM21_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z186TBM21_STUDY_ID = A186TBM21_STUDY_ID ;
         Z190TBM21_CRT_DATETIME = A190TBM21_CRT_DATETIME ;
         Z191TBM21_CRT_USER_ID = A191TBM21_CRT_USER_ID ;
         Z193TBM21_UPD_DATETIME = A193TBM21_UPD_DATETIME ;
         Z194TBM21_UPD_USER_ID = A194TBM21_UPD_USER_ID ;
         Z196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
         Z187TBM21_STUDY_NM = A187TBM21_STUDY_NM ;
         Z408TBM21_OUTER_STUDY_ID = A408TBM21_OUTER_STUDY_ID ;
         Z409TBM21_PROC_NM = A409TBM21_PROC_NM ;
         Z188TBM21_NOTE = A188TBM21_NOTE ;
         Z513TBM21_STATUS = A513TBM21_STATUS ;
         Z189TBM21_DEL_FLG = A189TBM21_DEL_FLG ;
         Z192TBM21_CRT_PROG_NM = A192TBM21_CRT_PROG_NM ;
         Z195TBM21_UPD_PROG_NM = A195TBM21_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {new Long(A186TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A190TBM21_CRT_DATETIME = BC000G4_A190TBM21_CRT_DATETIME[0] ;
         n190TBM21_CRT_DATETIME = BC000G4_n190TBM21_CRT_DATETIME[0] ;
         A191TBM21_CRT_USER_ID = BC000G4_A191TBM21_CRT_USER_ID[0] ;
         n191TBM21_CRT_USER_ID = BC000G4_n191TBM21_CRT_USER_ID[0] ;
         A193TBM21_UPD_DATETIME = BC000G4_A193TBM21_UPD_DATETIME[0] ;
         n193TBM21_UPD_DATETIME = BC000G4_n193TBM21_UPD_DATETIME[0] ;
         A194TBM21_UPD_USER_ID = BC000G4_A194TBM21_UPD_USER_ID[0] ;
         n194TBM21_UPD_USER_ID = BC000G4_n194TBM21_UPD_USER_ID[0] ;
         A196TBM21_UPD_CNT = BC000G4_A196TBM21_UPD_CNT[0] ;
         n196TBM21_UPD_CNT = BC000G4_n196TBM21_UPD_CNT[0] ;
         A187TBM21_STUDY_NM = BC000G4_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = BC000G4_n187TBM21_STUDY_NM[0] ;
         A408TBM21_OUTER_STUDY_ID = BC000G4_A408TBM21_OUTER_STUDY_ID[0] ;
         n408TBM21_OUTER_STUDY_ID = BC000G4_n408TBM21_OUTER_STUDY_ID[0] ;
         A409TBM21_PROC_NM = BC000G4_A409TBM21_PROC_NM[0] ;
         n409TBM21_PROC_NM = BC000G4_n409TBM21_PROC_NM[0] ;
         A188TBM21_NOTE = BC000G4_A188TBM21_NOTE[0] ;
         n188TBM21_NOTE = BC000G4_n188TBM21_NOTE[0] ;
         A513TBM21_STATUS = BC000G4_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = BC000G4_n513TBM21_STATUS[0] ;
         A189TBM21_DEL_FLG = BC000G4_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = BC000G4_n189TBM21_DEL_FLG[0] ;
         A192TBM21_CRT_PROG_NM = BC000G4_A192TBM21_CRT_PROG_NM[0] ;
         n192TBM21_CRT_PROG_NM = BC000G4_n192TBM21_CRT_PROG_NM[0] ;
         A195TBM21_UPD_PROG_NM = BC000G4_A195TBM21_UPD_PROG_NM[0] ;
         n195TBM21_UPD_PROG_NM = BC000G4_n195TBM21_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A190TBM21_CRT_DATETIME) || (( A190TBM21_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A190TBM21_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A193TBM21_UPD_DATETIME) || (( A193TBM21_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A193TBM21_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
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
      pr_default.execute(3, new Object[] {new Long(A186TBM21_STUDY_ID)});
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
      pr_default.execute(1, new Object[] {new Long(A186TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0G15( 8) ;
         RcdFound15 = (short)(1) ;
         A186TBM21_STUDY_ID = BC000G3_A186TBM21_STUDY_ID[0] ;
         A190TBM21_CRT_DATETIME = BC000G3_A190TBM21_CRT_DATETIME[0] ;
         n190TBM21_CRT_DATETIME = BC000G3_n190TBM21_CRT_DATETIME[0] ;
         A191TBM21_CRT_USER_ID = BC000G3_A191TBM21_CRT_USER_ID[0] ;
         n191TBM21_CRT_USER_ID = BC000G3_n191TBM21_CRT_USER_ID[0] ;
         A193TBM21_UPD_DATETIME = BC000G3_A193TBM21_UPD_DATETIME[0] ;
         n193TBM21_UPD_DATETIME = BC000G3_n193TBM21_UPD_DATETIME[0] ;
         A194TBM21_UPD_USER_ID = BC000G3_A194TBM21_UPD_USER_ID[0] ;
         n194TBM21_UPD_USER_ID = BC000G3_n194TBM21_UPD_USER_ID[0] ;
         A196TBM21_UPD_CNT = BC000G3_A196TBM21_UPD_CNT[0] ;
         n196TBM21_UPD_CNT = BC000G3_n196TBM21_UPD_CNT[0] ;
         A187TBM21_STUDY_NM = BC000G3_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = BC000G3_n187TBM21_STUDY_NM[0] ;
         A408TBM21_OUTER_STUDY_ID = BC000G3_A408TBM21_OUTER_STUDY_ID[0] ;
         n408TBM21_OUTER_STUDY_ID = BC000G3_n408TBM21_OUTER_STUDY_ID[0] ;
         A409TBM21_PROC_NM = BC000G3_A409TBM21_PROC_NM[0] ;
         n409TBM21_PROC_NM = BC000G3_n409TBM21_PROC_NM[0] ;
         A188TBM21_NOTE = BC000G3_A188TBM21_NOTE[0] ;
         n188TBM21_NOTE = BC000G3_n188TBM21_NOTE[0] ;
         A513TBM21_STATUS = BC000G3_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = BC000G3_n513TBM21_STATUS[0] ;
         A189TBM21_DEL_FLG = BC000G3_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = BC000G3_n189TBM21_DEL_FLG[0] ;
         A192TBM21_CRT_PROG_NM = BC000G3_A192TBM21_CRT_PROG_NM[0] ;
         n192TBM21_CRT_PROG_NM = BC000G3_n192TBM21_CRT_PROG_NM[0] ;
         A195TBM21_UPD_PROG_NM = BC000G3_A195TBM21_UPD_PROG_NM[0] ;
         n195TBM21_UPD_PROG_NM = BC000G3_n195TBM21_UPD_PROG_NM[0] ;
         O196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
         n196TBM21_UPD_CNT = false ;
         Z186TBM21_STUDY_ID = A186TBM21_STUDY_ID ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0G15( ) ;
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
         pr_default.execute(0, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM21_STUDY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z190TBM21_CRT_DATETIME.equals( BC000G2_A190TBM21_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z191TBM21_CRT_USER_ID, BC000G2_A191TBM21_CRT_USER_ID[0]) != 0 ) || !( Z193TBM21_UPD_DATETIME.equals( BC000G2_A193TBM21_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z194TBM21_UPD_USER_ID, BC000G2_A194TBM21_UPD_USER_ID[0]) != 0 ) || ( Z196TBM21_UPD_CNT != BC000G2_A196TBM21_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z187TBM21_STUDY_NM, BC000G2_A187TBM21_STUDY_NM[0]) != 0 ) || ( GXutil.strcmp(Z408TBM21_OUTER_STUDY_ID, BC000G2_A408TBM21_OUTER_STUDY_ID[0]) != 0 ) || ( GXutil.strcmp(Z409TBM21_PROC_NM, BC000G2_A409TBM21_PROC_NM[0]) != 0 ) || ( GXutil.strcmp(Z188TBM21_NOTE, BC000G2_A188TBM21_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z513TBM21_STATUS, BC000G2_A513TBM21_STATUS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z189TBM21_DEL_FLG, BC000G2_A189TBM21_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z192TBM21_CRT_PROG_NM, BC000G2_A192TBM21_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z195TBM21_UPD_PROG_NM, BC000G2_A195TBM21_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(4, new Object[] {new Long(A186TBM21_STUDY_ID), new Boolean(n190TBM21_CRT_DATETIME), A190TBM21_CRT_DATETIME, new Boolean(n191TBM21_CRT_USER_ID), A191TBM21_CRT_USER_ID, new Boolean(n193TBM21_UPD_DATETIME), A193TBM21_UPD_DATETIME, new Boolean(n194TBM21_UPD_USER_ID), A194TBM21_UPD_USER_ID, new Boolean(n196TBM21_UPD_CNT), new Long(A196TBM21_UPD_CNT), new Boolean(n187TBM21_STUDY_NM), A187TBM21_STUDY_NM, new Boolean(n408TBM21_OUTER_STUDY_ID), A408TBM21_OUTER_STUDY_ID, new Boolean(n409TBM21_PROC_NM), A409TBM21_PROC_NM, new Boolean(n188TBM21_NOTE), A188TBM21_NOTE, new Boolean(n513TBM21_STATUS), A513TBM21_STATUS, new Boolean(n189TBM21_DEL_FLG), A189TBM21_DEL_FLG, new Boolean(n192TBM21_CRT_PROG_NM), A192TBM21_CRT_PROG_NM, new Boolean(n195TBM21_UPD_PROG_NM), A195TBM21_UPD_PROG_NM});
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
                  pr_default.execute(5, new Object[] {new Boolean(n190TBM21_CRT_DATETIME), A190TBM21_CRT_DATETIME, new Boolean(n191TBM21_CRT_USER_ID), A191TBM21_CRT_USER_ID, new Boolean(n193TBM21_UPD_DATETIME), A193TBM21_UPD_DATETIME, new Boolean(n194TBM21_UPD_USER_ID), A194TBM21_UPD_USER_ID, new Boolean(n196TBM21_UPD_CNT), new Long(A196TBM21_UPD_CNT), new Boolean(n187TBM21_STUDY_NM), A187TBM21_STUDY_NM, new Boolean(n408TBM21_OUTER_STUDY_ID), A408TBM21_OUTER_STUDY_ID, new Boolean(n409TBM21_PROC_NM), A409TBM21_PROC_NM, new Boolean(n188TBM21_NOTE), A188TBM21_NOTE, new Boolean(n513TBM21_STATUS), A513TBM21_STATUS, new Boolean(n189TBM21_DEL_FLG), A189TBM21_DEL_FLG, new Boolean(n192TBM21_CRT_PROG_NM), A192TBM21_CRT_PROG_NM, new Boolean(n195TBM21_UPD_PROG_NM), A195TBM21_UPD_PROG_NM, new Long(A186TBM21_STUDY_ID)});
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
               pr_default.execute(6, new Object[] {new Long(A186TBM21_STUDY_ID)});
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
         pr_default.execute(7, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"選択リストマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(7);
         /* Using cursor BC000G10 */
         pr_default.execute(8, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"マッピング済部品マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
         /* Using cursor BC000G11 */
         pr_default.execute(9, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor BC000G12 */
         pr_default.execute(10, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験参加スタッフマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000G13 */
         pr_default.execute(11, new Object[] {new Long(A186TBM21_STUDY_ID)});
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
      /* Using cursor BC000G14 */
      pr_default.execute(12, new Object[] {new Long(A186TBM21_STUDY_ID)});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A186TBM21_STUDY_ID = BC000G14_A186TBM21_STUDY_ID[0] ;
         A190TBM21_CRT_DATETIME = BC000G14_A190TBM21_CRT_DATETIME[0] ;
         n190TBM21_CRT_DATETIME = BC000G14_n190TBM21_CRT_DATETIME[0] ;
         A191TBM21_CRT_USER_ID = BC000G14_A191TBM21_CRT_USER_ID[0] ;
         n191TBM21_CRT_USER_ID = BC000G14_n191TBM21_CRT_USER_ID[0] ;
         A193TBM21_UPD_DATETIME = BC000G14_A193TBM21_UPD_DATETIME[0] ;
         n193TBM21_UPD_DATETIME = BC000G14_n193TBM21_UPD_DATETIME[0] ;
         A194TBM21_UPD_USER_ID = BC000G14_A194TBM21_UPD_USER_ID[0] ;
         n194TBM21_UPD_USER_ID = BC000G14_n194TBM21_UPD_USER_ID[0] ;
         A196TBM21_UPD_CNT = BC000G14_A196TBM21_UPD_CNT[0] ;
         n196TBM21_UPD_CNT = BC000G14_n196TBM21_UPD_CNT[0] ;
         A187TBM21_STUDY_NM = BC000G14_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = BC000G14_n187TBM21_STUDY_NM[0] ;
         A408TBM21_OUTER_STUDY_ID = BC000G14_A408TBM21_OUTER_STUDY_ID[0] ;
         n408TBM21_OUTER_STUDY_ID = BC000G14_n408TBM21_OUTER_STUDY_ID[0] ;
         A409TBM21_PROC_NM = BC000G14_A409TBM21_PROC_NM[0] ;
         n409TBM21_PROC_NM = BC000G14_n409TBM21_PROC_NM[0] ;
         A188TBM21_NOTE = BC000G14_A188TBM21_NOTE[0] ;
         n188TBM21_NOTE = BC000G14_n188TBM21_NOTE[0] ;
         A513TBM21_STATUS = BC000G14_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = BC000G14_n513TBM21_STATUS[0] ;
         A189TBM21_DEL_FLG = BC000G14_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = BC000G14_n189TBM21_DEL_FLG[0] ;
         A192TBM21_CRT_PROG_NM = BC000G14_A192TBM21_CRT_PROG_NM[0] ;
         n192TBM21_CRT_PROG_NM = BC000G14_n192TBM21_CRT_PROG_NM[0] ;
         A195TBM21_UPD_PROG_NM = BC000G14_A195TBM21_UPD_PROG_NM[0] ;
         n195TBM21_UPD_PROG_NM = BC000G14_n195TBM21_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0G15( )
   {
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
         A186TBM21_STUDY_ID = BC000G14_A186TBM21_STUDY_ID[0] ;
         A190TBM21_CRT_DATETIME = BC000G14_A190TBM21_CRT_DATETIME[0] ;
         n190TBM21_CRT_DATETIME = BC000G14_n190TBM21_CRT_DATETIME[0] ;
         A191TBM21_CRT_USER_ID = BC000G14_A191TBM21_CRT_USER_ID[0] ;
         n191TBM21_CRT_USER_ID = BC000G14_n191TBM21_CRT_USER_ID[0] ;
         A193TBM21_UPD_DATETIME = BC000G14_A193TBM21_UPD_DATETIME[0] ;
         n193TBM21_UPD_DATETIME = BC000G14_n193TBM21_UPD_DATETIME[0] ;
         A194TBM21_UPD_USER_ID = BC000G14_A194TBM21_UPD_USER_ID[0] ;
         n194TBM21_UPD_USER_ID = BC000G14_n194TBM21_UPD_USER_ID[0] ;
         A196TBM21_UPD_CNT = BC000G14_A196TBM21_UPD_CNT[0] ;
         n196TBM21_UPD_CNT = BC000G14_n196TBM21_UPD_CNT[0] ;
         A187TBM21_STUDY_NM = BC000G14_A187TBM21_STUDY_NM[0] ;
         n187TBM21_STUDY_NM = BC000G14_n187TBM21_STUDY_NM[0] ;
         A408TBM21_OUTER_STUDY_ID = BC000G14_A408TBM21_OUTER_STUDY_ID[0] ;
         n408TBM21_OUTER_STUDY_ID = BC000G14_n408TBM21_OUTER_STUDY_ID[0] ;
         A409TBM21_PROC_NM = BC000G14_A409TBM21_PROC_NM[0] ;
         n409TBM21_PROC_NM = BC000G14_n409TBM21_PROC_NM[0] ;
         A188TBM21_NOTE = BC000G14_A188TBM21_NOTE[0] ;
         n188TBM21_NOTE = BC000G14_n188TBM21_NOTE[0] ;
         A513TBM21_STATUS = BC000G14_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = BC000G14_n513TBM21_STATUS[0] ;
         A189TBM21_DEL_FLG = BC000G14_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = BC000G14_n189TBM21_DEL_FLG[0] ;
         A192TBM21_CRT_PROG_NM = BC000G14_A192TBM21_CRT_PROG_NM[0] ;
         n192TBM21_CRT_PROG_NM = BC000G14_n192TBM21_CRT_PROG_NM[0] ;
         A195TBM21_UPD_PROG_NM = BC000G14_A195TBM21_UPD_PROG_NM[0] ;
         n195TBM21_UPD_PROG_NM = BC000G14_n195TBM21_UPD_PROG_NM[0] ;
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
      A190TBM21_CRT_DATETIME = GXutil.now( ) ;
      n190TBM21_CRT_DATETIME = false ;
      GXt_char1 = A191TBM21_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      A191TBM21_CRT_USER_ID = GXt_char1 ;
      n191TBM21_CRT_USER_ID = false ;
      A193TBM21_UPD_DATETIME = GXutil.now( ) ;
      n193TBM21_UPD_DATETIME = false ;
      GXt_char1 = A194TBM21_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      A194TBM21_UPD_USER_ID = GXt_char1 ;
      n194TBM21_UPD_USER_ID = false ;
      A196TBM21_UPD_CNT = (long)(O196TBM21_UPD_CNT+1) ;
      n196TBM21_UPD_CNT = false ;
   }

   public void beforeUpdate0G15( )
   {
      /* Before Update Rules */
      A193TBM21_UPD_DATETIME = GXutil.now( ) ;
      n193TBM21_UPD_DATETIME = false ;
      GXt_char1 = A194TBM21_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_bc.this.GXt_char1 = GXv_char2[0] ;
      A194TBM21_UPD_USER_ID = GXt_char1 ;
      n194TBM21_UPD_USER_ID = false ;
      A196TBM21_UPD_CNT = (long)(O196TBM21_UPD_CNT+1) ;
      n196TBM21_UPD_CNT = false ;
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
      A190TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n190TBM21_CRT_DATETIME = false ;
      A191TBM21_CRT_USER_ID = "" ;
      n191TBM21_CRT_USER_ID = false ;
      A193TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n193TBM21_UPD_DATETIME = false ;
      A194TBM21_UPD_USER_ID = "" ;
      n194TBM21_UPD_USER_ID = false ;
      A196TBM21_UPD_CNT = 0 ;
      n196TBM21_UPD_CNT = false ;
      A187TBM21_STUDY_NM = "" ;
      n187TBM21_STUDY_NM = false ;
      A408TBM21_OUTER_STUDY_ID = "" ;
      n408TBM21_OUTER_STUDY_ID = false ;
      A409TBM21_PROC_NM = "" ;
      n409TBM21_PROC_NM = false ;
      A188TBM21_NOTE = "" ;
      n188TBM21_NOTE = false ;
      A513TBM21_STATUS = "" ;
      n513TBM21_STATUS = false ;
      A189TBM21_DEL_FLG = "" ;
      n189TBM21_DEL_FLG = false ;
      A192TBM21_CRT_PROG_NM = "" ;
      n192TBM21_CRT_PROG_NM = false ;
      A195TBM21_UPD_PROG_NM = "" ;
      n195TBM21_UPD_PROG_NM = false ;
      O196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
      n196TBM21_UPD_CNT = false ;
   }

   public void initAll0G15( )
   {
      A186TBM21_STUDY_ID = 0 ;
      initializeNonKey0G15( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow15( SdtTBM21_STUDY obj15 )
   {
      obj15.setgxTv_SdtTBM21_STUDY_Mode( Gx_mode );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime( A190TBM21_CRT_DATETIME );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id( A191TBM21_CRT_USER_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime( A193TBM21_UPD_DATETIME );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id( A194TBM21_UPD_USER_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt( A196TBM21_UPD_CNT );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_nm( A187TBM21_STUDY_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id( A408TBM21_OUTER_STUDY_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_proc_nm( A409TBM21_PROC_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_note( A188TBM21_NOTE );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_status( A513TBM21_STATUS );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_del_flg( A189TBM21_DEL_FLG );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm( A192TBM21_CRT_PROG_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm( A195TBM21_UPD_PROG_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_id( A186TBM21_STUDY_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_id_Z( Z186TBM21_STUDY_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_nm_Z( Z187TBM21_STUDY_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_Z( Z408TBM21_OUTER_STUDY_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_proc_nm_Z( Z409TBM21_PROC_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_note_Z( Z188TBM21_NOTE );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_status_Z( Z513TBM21_STATUS );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_del_flg_Z( Z189TBM21_DEL_FLG );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_Z( Z190TBM21_CRT_DATETIME );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_Z( Z191TBM21_CRT_USER_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_Z( Z192TBM21_CRT_PROG_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_Z( Z193TBM21_UPD_DATETIME );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_Z( Z194TBM21_UPD_USER_ID );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_Z( Z195TBM21_UPD_PROG_NM );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_Z( Z196TBM21_UPD_CNT );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_study_nm_N( (byte)((byte)((n187TBM21_STUDY_NM)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_N( (byte)((byte)((n408TBM21_OUTER_STUDY_ID)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_proc_nm_N( (byte)((byte)((n409TBM21_PROC_NM)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_note_N( (byte)((byte)((n188TBM21_NOTE)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_status_N( (byte)((byte)((n513TBM21_STATUS)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_del_flg_N( (byte)((byte)((n189TBM21_DEL_FLG)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_N( (byte)((byte)((n190TBM21_CRT_DATETIME)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_N( (byte)((byte)((n191TBM21_CRT_USER_ID)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_N( (byte)((byte)((n192TBM21_CRT_PROG_NM)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_N( (byte)((byte)((n193TBM21_UPD_DATETIME)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_N( (byte)((byte)((n194TBM21_UPD_USER_ID)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_N( (byte)((byte)((n195TBM21_UPD_PROG_NM)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_N( (byte)((byte)((n196TBM21_UPD_CNT)?1:0)) );
      obj15.setgxTv_SdtTBM21_STUDY_Mode( Gx_mode );
   }

   public void RowToVars15( SdtTBM21_STUDY obj15 ,
                            int forceLoad )
   {
      Gx_mode = obj15.getgxTv_SdtTBM21_STUDY_Mode() ;
      A190TBM21_CRT_DATETIME = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime() ;
      n190TBM21_CRT_DATETIME = false ;
      A191TBM21_CRT_USER_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id() ;
      n191TBM21_CRT_USER_ID = false ;
      A193TBM21_UPD_DATETIME = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime() ;
      n193TBM21_UPD_DATETIME = false ;
      A194TBM21_UPD_USER_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id() ;
      n194TBM21_UPD_USER_ID = false ;
      A196TBM21_UPD_CNT = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt() ;
      n196TBM21_UPD_CNT = false ;
      A187TBM21_STUDY_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm() ;
      n187TBM21_STUDY_NM = false ;
      A408TBM21_OUTER_STUDY_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id() ;
      n408TBM21_OUTER_STUDY_ID = false ;
      A409TBM21_PROC_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm() ;
      n409TBM21_PROC_NM = false ;
      A188TBM21_NOTE = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_note() ;
      n188TBM21_NOTE = false ;
      A513TBM21_STATUS = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_status() ;
      n513TBM21_STATUS = false ;
      A189TBM21_DEL_FLG = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg() ;
      n189TBM21_DEL_FLG = false ;
      A192TBM21_CRT_PROG_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm() ;
      n192TBM21_CRT_PROG_NM = false ;
      A195TBM21_UPD_PROG_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm() ;
      n195TBM21_UPD_PROG_NM = false ;
      A186TBM21_STUDY_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_id() ;
      Z186TBM21_STUDY_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_id_Z() ;
      Z187TBM21_STUDY_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm_Z() ;
      Z408TBM21_OUTER_STUDY_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_Z() ;
      Z409TBM21_PROC_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm_Z() ;
      Z188TBM21_NOTE = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_note_Z() ;
      Z513TBM21_STATUS = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_status_Z() ;
      Z189TBM21_DEL_FLG = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg_Z() ;
      Z190TBM21_CRT_DATETIME = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_Z() ;
      Z191TBM21_CRT_USER_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_Z() ;
      Z192TBM21_CRT_PROG_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_Z() ;
      Z193TBM21_UPD_DATETIME = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_Z() ;
      Z194TBM21_UPD_USER_ID = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_Z() ;
      Z195TBM21_UPD_PROG_NM = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_Z() ;
      Z196TBM21_UPD_CNT = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_Z() ;
      O196TBM21_UPD_CNT = obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_Z() ;
      n187TBM21_STUDY_NM = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_study_nm_N()==0)?false:true) ;
      n408TBM21_OUTER_STUDY_ID = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_N()==0)?false:true) ;
      n409TBM21_PROC_NM = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_proc_nm_N()==0)?false:true) ;
      n188TBM21_NOTE = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_note_N()==0)?false:true) ;
      n513TBM21_STATUS = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_status_N()==0)?false:true) ;
      n189TBM21_DEL_FLG = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_del_flg_N()==0)?false:true) ;
      n190TBM21_CRT_DATETIME = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_N()==0)?false:true) ;
      n191TBM21_CRT_USER_ID = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_N()==0)?false:true) ;
      n192TBM21_CRT_PROG_NM = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_N()==0)?false:true) ;
      n193TBM21_UPD_DATETIME = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_N()==0)?false:true) ;
      n194TBM21_UPD_USER_ID = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_N()==0)?false:true) ;
      n195TBM21_UPD_PROG_NM = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_N()==0)?false:true) ;
      n196TBM21_UPD_CNT = (boolean)((obj15.getgxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj15.getgxTv_SdtTBM21_STUDY_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A186TBM21_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
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
         Z186TBM21_STUDY_ID = A186TBM21_STUDY_ID ;
         O196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
         n196TBM21_UPD_CNT = false ;
      }
      zm0G15( -8) ;
      sMode15 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0G15( ) ;
      Gx_mode = sMode15 ;
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
      if ( RcdFound15 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A186TBM21_STUDY_ID != Z186TBM21_STUDY_ID )
         {
            A186TBM21_STUDY_ID = Z186TBM21_STUDY_ID ;
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
            if ( A186TBM21_STUDY_ID != Z186TBM21_STUDY_ID )
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
         else if ( A186TBM21_STUDY_ID != Z186TBM21_STUDY_ID )
         {
            A186TBM21_STUDY_ID = Z186TBM21_STUDY_ID ;
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
         if ( A186TBM21_STUDY_ID != Z186TBM21_STUDY_ID )
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
                  /* Execute user subroutine: S1166 */
                  S1166 ();
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
      A187TBM21_STUDY_NM = "" ;
      A408TBM21_OUTER_STUDY_ID = "" ;
      A409TBM21_PROC_NM = "" ;
      A188TBM21_NOTE = "" ;
      A189TBM21_DEL_FLG = "" ;
      A190TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A191TBM21_CRT_USER_ID = "" ;
      A192TBM21_CRT_PROG_NM = "" ;
      A193TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A194TBM21_UPD_USER_ID = "" ;
      A195TBM21_UPD_PROG_NM = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_study_nm_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_proc_nm_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_note_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_status_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_del_flg_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_Z = "" ;
      gxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_Z = "" ;
      Z190TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z191TBM21_CRT_USER_ID = "" ;
      Z193TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z194TBM21_UPD_USER_ID = "" ;
      Z187TBM21_STUDY_NM = "" ;
      Z408TBM21_OUTER_STUDY_ID = "" ;
      Z409TBM21_PROC_NM = "" ;
      Z188TBM21_NOTE = "" ;
      Z513TBM21_STATUS = "" ;
      A513TBM21_STATUS = "" ;
      Z189TBM21_DEL_FLG = "" ;
      Z192TBM21_CRT_PROG_NM = "" ;
      Z195TBM21_UPD_PROG_NM = "" ;
      BC000G4_A186TBM21_STUDY_ID = new long[1] ;
      BC000G4_A190TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G4_n190TBM21_CRT_DATETIME = new boolean[] {false} ;
      BC000G4_A191TBM21_CRT_USER_ID = new String[] {""} ;
      BC000G4_n191TBM21_CRT_USER_ID = new boolean[] {false} ;
      BC000G4_A193TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G4_n193TBM21_UPD_DATETIME = new boolean[] {false} ;
      BC000G4_A194TBM21_UPD_USER_ID = new String[] {""} ;
      BC000G4_n194TBM21_UPD_USER_ID = new boolean[] {false} ;
      BC000G4_A196TBM21_UPD_CNT = new long[1] ;
      BC000G4_n196TBM21_UPD_CNT = new boolean[] {false} ;
      BC000G4_A187TBM21_STUDY_NM = new String[] {""} ;
      BC000G4_n187TBM21_STUDY_NM = new boolean[] {false} ;
      BC000G4_A408TBM21_OUTER_STUDY_ID = new String[] {""} ;
      BC000G4_n408TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      BC000G4_A409TBM21_PROC_NM = new String[] {""} ;
      BC000G4_n409TBM21_PROC_NM = new boolean[] {false} ;
      BC000G4_A188TBM21_NOTE = new String[] {""} ;
      BC000G4_n188TBM21_NOTE = new boolean[] {false} ;
      BC000G4_A513TBM21_STATUS = new String[] {""} ;
      BC000G4_n513TBM21_STATUS = new boolean[] {false} ;
      BC000G4_A189TBM21_DEL_FLG = new String[] {""} ;
      BC000G4_n189TBM21_DEL_FLG = new boolean[] {false} ;
      BC000G4_A192TBM21_CRT_PROG_NM = new String[] {""} ;
      BC000G4_n192TBM21_CRT_PROG_NM = new boolean[] {false} ;
      BC000G4_A195TBM21_UPD_PROG_NM = new String[] {""} ;
      BC000G4_n195TBM21_UPD_PROG_NM = new boolean[] {false} ;
      BC000G5_A186TBM21_STUDY_ID = new long[1] ;
      BC000G3_A186TBM21_STUDY_ID = new long[1] ;
      BC000G3_A190TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G3_n190TBM21_CRT_DATETIME = new boolean[] {false} ;
      BC000G3_A191TBM21_CRT_USER_ID = new String[] {""} ;
      BC000G3_n191TBM21_CRT_USER_ID = new boolean[] {false} ;
      BC000G3_A193TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G3_n193TBM21_UPD_DATETIME = new boolean[] {false} ;
      BC000G3_A194TBM21_UPD_USER_ID = new String[] {""} ;
      BC000G3_n194TBM21_UPD_USER_ID = new boolean[] {false} ;
      BC000G3_A196TBM21_UPD_CNT = new long[1] ;
      BC000G3_n196TBM21_UPD_CNT = new boolean[] {false} ;
      BC000G3_A187TBM21_STUDY_NM = new String[] {""} ;
      BC000G3_n187TBM21_STUDY_NM = new boolean[] {false} ;
      BC000G3_A408TBM21_OUTER_STUDY_ID = new String[] {""} ;
      BC000G3_n408TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      BC000G3_A409TBM21_PROC_NM = new String[] {""} ;
      BC000G3_n409TBM21_PROC_NM = new boolean[] {false} ;
      BC000G3_A188TBM21_NOTE = new String[] {""} ;
      BC000G3_n188TBM21_NOTE = new boolean[] {false} ;
      BC000G3_A513TBM21_STATUS = new String[] {""} ;
      BC000G3_n513TBM21_STATUS = new boolean[] {false} ;
      BC000G3_A189TBM21_DEL_FLG = new String[] {""} ;
      BC000G3_n189TBM21_DEL_FLG = new boolean[] {false} ;
      BC000G3_A192TBM21_CRT_PROG_NM = new String[] {""} ;
      BC000G3_n192TBM21_CRT_PROG_NM = new boolean[] {false} ;
      BC000G3_A195TBM21_UPD_PROG_NM = new String[] {""} ;
      BC000G3_n195TBM21_UPD_PROG_NM = new boolean[] {false} ;
      sMode15 = "" ;
      BC000G2_A186TBM21_STUDY_ID = new long[1] ;
      BC000G2_A190TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G2_n190TBM21_CRT_DATETIME = new boolean[] {false} ;
      BC000G2_A191TBM21_CRT_USER_ID = new String[] {""} ;
      BC000G2_n191TBM21_CRT_USER_ID = new boolean[] {false} ;
      BC000G2_A193TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G2_n193TBM21_UPD_DATETIME = new boolean[] {false} ;
      BC000G2_A194TBM21_UPD_USER_ID = new String[] {""} ;
      BC000G2_n194TBM21_UPD_USER_ID = new boolean[] {false} ;
      BC000G2_A196TBM21_UPD_CNT = new long[1] ;
      BC000G2_n196TBM21_UPD_CNT = new boolean[] {false} ;
      BC000G2_A187TBM21_STUDY_NM = new String[] {""} ;
      BC000G2_n187TBM21_STUDY_NM = new boolean[] {false} ;
      BC000G2_A408TBM21_OUTER_STUDY_ID = new String[] {""} ;
      BC000G2_n408TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      BC000G2_A409TBM21_PROC_NM = new String[] {""} ;
      BC000G2_n409TBM21_PROC_NM = new boolean[] {false} ;
      BC000G2_A188TBM21_NOTE = new String[] {""} ;
      BC000G2_n188TBM21_NOTE = new boolean[] {false} ;
      BC000G2_A513TBM21_STATUS = new String[] {""} ;
      BC000G2_n513TBM21_STATUS = new boolean[] {false} ;
      BC000G2_A189TBM21_DEL_FLG = new String[] {""} ;
      BC000G2_n189TBM21_DEL_FLG = new boolean[] {false} ;
      BC000G2_A192TBM21_CRT_PROG_NM = new String[] {""} ;
      BC000G2_n192TBM21_CRT_PROG_NM = new boolean[] {false} ;
      BC000G2_A195TBM21_UPD_PROG_NM = new String[] {""} ;
      BC000G2_n195TBM21_UPD_PROG_NM = new boolean[] {false} ;
      BC000G9_A435TBM25_STUDY_ID = new long[1] ;
      BC000G9_A436TBM25_LIST_CD = new String[] {""} ;
      BC000G10_A422TBM24_STUDY_ID = new long[1] ;
      BC000G10_A423TBM24_DOM_CD = new String[] {""} ;
      BC000G10_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      BC000G10_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      BC000G11_A217TBM31_STUDY_ID = new long[1] ;
      BC000G11_A218TBM31_CRF_ID = new short[1] ;
      BC000G12_A207TBM23_STUDY_ID = new long[1] ;
      BC000G12_A208TBM23_USER_ID = new String[] {""} ;
      BC000G12_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000G13_A197TBM22_STUDY_ID = new long[1] ;
      BC000G13_A198TBM22_SITE_ID = new String[] {""} ;
      BC000G14_A186TBM21_STUDY_ID = new long[1] ;
      BC000G14_A190TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G14_n190TBM21_CRT_DATETIME = new boolean[] {false} ;
      BC000G14_A191TBM21_CRT_USER_ID = new String[] {""} ;
      BC000G14_n191TBM21_CRT_USER_ID = new boolean[] {false} ;
      BC000G14_A193TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000G14_n193TBM21_UPD_DATETIME = new boolean[] {false} ;
      BC000G14_A194TBM21_UPD_USER_ID = new String[] {""} ;
      BC000G14_n194TBM21_UPD_USER_ID = new boolean[] {false} ;
      BC000G14_A196TBM21_UPD_CNT = new long[1] ;
      BC000G14_n196TBM21_UPD_CNT = new boolean[] {false} ;
      BC000G14_A187TBM21_STUDY_NM = new String[] {""} ;
      BC000G14_n187TBM21_STUDY_NM = new boolean[] {false} ;
      BC000G14_A408TBM21_OUTER_STUDY_ID = new String[] {""} ;
      BC000G14_n408TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      BC000G14_A409TBM21_PROC_NM = new String[] {""} ;
      BC000G14_n409TBM21_PROC_NM = new boolean[] {false} ;
      BC000G14_A188TBM21_NOTE = new String[] {""} ;
      BC000G14_n188TBM21_NOTE = new boolean[] {false} ;
      BC000G14_A513TBM21_STATUS = new String[] {""} ;
      BC000G14_n513TBM21_STATUS = new boolean[] {false} ;
      BC000G14_A189TBM21_DEL_FLG = new String[] {""} ;
      BC000G14_n189TBM21_DEL_FLG = new boolean[] {false} ;
      BC000G14_A192TBM21_CRT_PROG_NM = new String[] {""} ;
      BC000G14_n192TBM21_CRT_PROG_NM = new boolean[] {false} ;
      BC000G14_A195TBM21_UPD_PROG_NM = new String[] {""} ;
      BC000G14_n195TBM21_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm21_study_bc__default(),
         new Object[] {
             new Object[] {
            BC000G2_A186TBM21_STUDY_ID, BC000G2_A190TBM21_CRT_DATETIME, BC000G2_n190TBM21_CRT_DATETIME, BC000G2_A191TBM21_CRT_USER_ID, BC000G2_n191TBM21_CRT_USER_ID, BC000G2_A193TBM21_UPD_DATETIME, BC000G2_n193TBM21_UPD_DATETIME, BC000G2_A194TBM21_UPD_USER_ID, BC000G2_n194TBM21_UPD_USER_ID, BC000G2_A196TBM21_UPD_CNT,
            BC000G2_n196TBM21_UPD_CNT, BC000G2_A187TBM21_STUDY_NM, BC000G2_n187TBM21_STUDY_NM, BC000G2_A408TBM21_OUTER_STUDY_ID, BC000G2_n408TBM21_OUTER_STUDY_ID, BC000G2_A409TBM21_PROC_NM, BC000G2_n409TBM21_PROC_NM, BC000G2_A188TBM21_NOTE, BC000G2_n188TBM21_NOTE, BC000G2_A513TBM21_STATUS,
            BC000G2_n513TBM21_STATUS, BC000G2_A189TBM21_DEL_FLG, BC000G2_n189TBM21_DEL_FLG, BC000G2_A192TBM21_CRT_PROG_NM, BC000G2_n192TBM21_CRT_PROG_NM, BC000G2_A195TBM21_UPD_PROG_NM, BC000G2_n195TBM21_UPD_PROG_NM
            }
            , new Object[] {
            BC000G3_A186TBM21_STUDY_ID, BC000G3_A190TBM21_CRT_DATETIME, BC000G3_n190TBM21_CRT_DATETIME, BC000G3_A191TBM21_CRT_USER_ID, BC000G3_n191TBM21_CRT_USER_ID, BC000G3_A193TBM21_UPD_DATETIME, BC000G3_n193TBM21_UPD_DATETIME, BC000G3_A194TBM21_UPD_USER_ID, BC000G3_n194TBM21_UPD_USER_ID, BC000G3_A196TBM21_UPD_CNT,
            BC000G3_n196TBM21_UPD_CNT, BC000G3_A187TBM21_STUDY_NM, BC000G3_n187TBM21_STUDY_NM, BC000G3_A408TBM21_OUTER_STUDY_ID, BC000G3_n408TBM21_OUTER_STUDY_ID, BC000G3_A409TBM21_PROC_NM, BC000G3_n409TBM21_PROC_NM, BC000G3_A188TBM21_NOTE, BC000G3_n188TBM21_NOTE, BC000G3_A513TBM21_STATUS,
            BC000G3_n513TBM21_STATUS, BC000G3_A189TBM21_DEL_FLG, BC000G3_n189TBM21_DEL_FLG, BC000G3_A192TBM21_CRT_PROG_NM, BC000G3_n192TBM21_CRT_PROG_NM, BC000G3_A195TBM21_UPD_PROG_NM, BC000G3_n195TBM21_UPD_PROG_NM
            }
            , new Object[] {
            BC000G4_A186TBM21_STUDY_ID, BC000G4_A190TBM21_CRT_DATETIME, BC000G4_n190TBM21_CRT_DATETIME, BC000G4_A191TBM21_CRT_USER_ID, BC000G4_n191TBM21_CRT_USER_ID, BC000G4_A193TBM21_UPD_DATETIME, BC000G4_n193TBM21_UPD_DATETIME, BC000G4_A194TBM21_UPD_USER_ID, BC000G4_n194TBM21_UPD_USER_ID, BC000G4_A196TBM21_UPD_CNT,
            BC000G4_n196TBM21_UPD_CNT, BC000G4_A187TBM21_STUDY_NM, BC000G4_n187TBM21_STUDY_NM, BC000G4_A408TBM21_OUTER_STUDY_ID, BC000G4_n408TBM21_OUTER_STUDY_ID, BC000G4_A409TBM21_PROC_NM, BC000G4_n409TBM21_PROC_NM, BC000G4_A188TBM21_NOTE, BC000G4_n188TBM21_NOTE, BC000G4_A513TBM21_STATUS,
            BC000G4_n513TBM21_STATUS, BC000G4_A189TBM21_DEL_FLG, BC000G4_n189TBM21_DEL_FLG, BC000G4_A192TBM21_CRT_PROG_NM, BC000G4_n192TBM21_CRT_PROG_NM, BC000G4_A195TBM21_UPD_PROG_NM, BC000G4_n195TBM21_UPD_PROG_NM
            }
            , new Object[] {
            BC000G5_A186TBM21_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000G9_A435TBM25_STUDY_ID, BC000G9_A436TBM25_LIST_CD
            }
            , new Object[] {
            BC000G10_A422TBM24_STUDY_ID, BC000G10_A423TBM24_DOM_CD, BC000G10_A424TBM24_DOM_VAR_NM, BC000G10_A425TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            BC000G11_A217TBM31_STUDY_ID, BC000G11_A218TBM31_CRF_ID
            }
            , new Object[] {
            BC000G12_A207TBM23_STUDY_ID, BC000G12_A208TBM23_USER_ID, BC000G12_A407TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            BC000G13_A197TBM22_STUDY_ID, BC000G13_A198TBM22_SITE_ID
            }
            , new Object[] {
            BC000G14_A186TBM21_STUDY_ID, BC000G14_A190TBM21_CRT_DATETIME, BC000G14_n190TBM21_CRT_DATETIME, BC000G14_A191TBM21_CRT_USER_ID, BC000G14_n191TBM21_CRT_USER_ID, BC000G14_A193TBM21_UPD_DATETIME, BC000G14_n193TBM21_UPD_DATETIME, BC000G14_A194TBM21_UPD_USER_ID, BC000G14_n194TBM21_UPD_USER_ID, BC000G14_A196TBM21_UPD_CNT,
            BC000G14_n196TBM21_UPD_CNT, BC000G14_A187TBM21_STUDY_NM, BC000G14_n187TBM21_STUDY_NM, BC000G14_A408TBM21_OUTER_STUDY_ID, BC000G14_n408TBM21_OUTER_STUDY_ID, BC000G14_A409TBM21_PROC_NM, BC000G14_n409TBM21_PROC_NM, BC000G14_A188TBM21_NOTE, BC000G14_n188TBM21_NOTE, BC000G14_A513TBM21_STATUS,
            BC000G14_n513TBM21_STATUS, BC000G14_A189TBM21_DEL_FLG, BC000G14_n189TBM21_DEL_FLG, BC000G14_A192TBM21_CRT_PROG_NM, BC000G14_n192TBM21_CRT_PROG_NM, BC000G14_A195TBM21_UPD_PROG_NM, BC000G14_n195TBM21_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM21_STUDY_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110G2 */
      e110G2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_study_nm_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_proc_nm_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_note_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_status_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_del_flg_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_N ;
   private byte gxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound15 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z186TBM21_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A196TBM21_UPD_CNT ;
   private long gxTv_SdtTBM21_STUDY_Tbm21_study_id_Z ;
   private long gxTv_SdtTBM21_STUDY_Tbm21_upd_cnt_Z ;
   private long Z196TBM21_UPD_CNT ;
   private long O196TBM21_UPD_CNT ;
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
   private java.util.Date A190TBM21_CRT_DATETIME ;
   private java.util.Date A193TBM21_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM21_STUDY_Tbm21_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM21_STUDY_Tbm21_upd_datetime_Z ;
   private java.util.Date Z190TBM21_CRT_DATETIME ;
   private java.util.Date Z193TBM21_UPD_DATETIME ;
   private boolean n190TBM21_CRT_DATETIME ;
   private boolean n191TBM21_CRT_USER_ID ;
   private boolean n193TBM21_UPD_DATETIME ;
   private boolean n194TBM21_UPD_USER_ID ;
   private boolean n196TBM21_UPD_CNT ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n408TBM21_OUTER_STUDY_ID ;
   private boolean n409TBM21_PROC_NM ;
   private boolean n188TBM21_NOTE ;
   private boolean n513TBM21_STATUS ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n192TBM21_CRT_PROG_NM ;
   private boolean n195TBM21_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A187TBM21_STUDY_NM ;
   private String A408TBM21_OUTER_STUDY_ID ;
   private String A409TBM21_PROC_NM ;
   private String A188TBM21_NOTE ;
   private String A189TBM21_DEL_FLG ;
   private String A191TBM21_CRT_USER_ID ;
   private String A192TBM21_CRT_PROG_NM ;
   private String A194TBM21_UPD_USER_ID ;
   private String A195TBM21_UPD_PROG_NM ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_study_nm_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_outer_study_id_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_proc_nm_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_note_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_status_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_del_flg_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_crt_user_id_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_crt_prog_nm_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_upd_user_id_Z ;
   private String gxTv_SdtTBM21_STUDY_Tbm21_upd_prog_nm_Z ;
   private String Z191TBM21_CRT_USER_ID ;
   private String Z194TBM21_UPD_USER_ID ;
   private String Z187TBM21_STUDY_NM ;
   private String Z408TBM21_OUTER_STUDY_ID ;
   private String Z409TBM21_PROC_NM ;
   private String Z188TBM21_NOTE ;
   private String Z513TBM21_STATUS ;
   private String A513TBM21_STATUS ;
   private String Z189TBM21_DEL_FLG ;
   private String Z192TBM21_CRT_PROG_NM ;
   private String Z195TBM21_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM21_STUDY bcTBM21_STUDY ;
   private IDataStoreProvider pr_default ;
   private long[] BC000G4_A186TBM21_STUDY_ID ;
   private java.util.Date[] BC000G4_A190TBM21_CRT_DATETIME ;
   private boolean[] BC000G4_n190TBM21_CRT_DATETIME ;
   private String[] BC000G4_A191TBM21_CRT_USER_ID ;
   private boolean[] BC000G4_n191TBM21_CRT_USER_ID ;
   private java.util.Date[] BC000G4_A193TBM21_UPD_DATETIME ;
   private boolean[] BC000G4_n193TBM21_UPD_DATETIME ;
   private String[] BC000G4_A194TBM21_UPD_USER_ID ;
   private boolean[] BC000G4_n194TBM21_UPD_USER_ID ;
   private long[] BC000G4_A196TBM21_UPD_CNT ;
   private boolean[] BC000G4_n196TBM21_UPD_CNT ;
   private String[] BC000G4_A187TBM21_STUDY_NM ;
   private boolean[] BC000G4_n187TBM21_STUDY_NM ;
   private String[] BC000G4_A408TBM21_OUTER_STUDY_ID ;
   private boolean[] BC000G4_n408TBM21_OUTER_STUDY_ID ;
   private String[] BC000G4_A409TBM21_PROC_NM ;
   private boolean[] BC000G4_n409TBM21_PROC_NM ;
   private String[] BC000G4_A188TBM21_NOTE ;
   private boolean[] BC000G4_n188TBM21_NOTE ;
   private String[] BC000G4_A513TBM21_STATUS ;
   private boolean[] BC000G4_n513TBM21_STATUS ;
   private String[] BC000G4_A189TBM21_DEL_FLG ;
   private boolean[] BC000G4_n189TBM21_DEL_FLG ;
   private String[] BC000G4_A192TBM21_CRT_PROG_NM ;
   private boolean[] BC000G4_n192TBM21_CRT_PROG_NM ;
   private String[] BC000G4_A195TBM21_UPD_PROG_NM ;
   private boolean[] BC000G4_n195TBM21_UPD_PROG_NM ;
   private long[] BC000G5_A186TBM21_STUDY_ID ;
   private long[] BC000G3_A186TBM21_STUDY_ID ;
   private java.util.Date[] BC000G3_A190TBM21_CRT_DATETIME ;
   private boolean[] BC000G3_n190TBM21_CRT_DATETIME ;
   private String[] BC000G3_A191TBM21_CRT_USER_ID ;
   private boolean[] BC000G3_n191TBM21_CRT_USER_ID ;
   private java.util.Date[] BC000G3_A193TBM21_UPD_DATETIME ;
   private boolean[] BC000G3_n193TBM21_UPD_DATETIME ;
   private String[] BC000G3_A194TBM21_UPD_USER_ID ;
   private boolean[] BC000G3_n194TBM21_UPD_USER_ID ;
   private long[] BC000G3_A196TBM21_UPD_CNT ;
   private boolean[] BC000G3_n196TBM21_UPD_CNT ;
   private String[] BC000G3_A187TBM21_STUDY_NM ;
   private boolean[] BC000G3_n187TBM21_STUDY_NM ;
   private String[] BC000G3_A408TBM21_OUTER_STUDY_ID ;
   private boolean[] BC000G3_n408TBM21_OUTER_STUDY_ID ;
   private String[] BC000G3_A409TBM21_PROC_NM ;
   private boolean[] BC000G3_n409TBM21_PROC_NM ;
   private String[] BC000G3_A188TBM21_NOTE ;
   private boolean[] BC000G3_n188TBM21_NOTE ;
   private String[] BC000G3_A513TBM21_STATUS ;
   private boolean[] BC000G3_n513TBM21_STATUS ;
   private String[] BC000G3_A189TBM21_DEL_FLG ;
   private boolean[] BC000G3_n189TBM21_DEL_FLG ;
   private String[] BC000G3_A192TBM21_CRT_PROG_NM ;
   private boolean[] BC000G3_n192TBM21_CRT_PROG_NM ;
   private String[] BC000G3_A195TBM21_UPD_PROG_NM ;
   private boolean[] BC000G3_n195TBM21_UPD_PROG_NM ;
   private long[] BC000G2_A186TBM21_STUDY_ID ;
   private java.util.Date[] BC000G2_A190TBM21_CRT_DATETIME ;
   private boolean[] BC000G2_n190TBM21_CRT_DATETIME ;
   private String[] BC000G2_A191TBM21_CRT_USER_ID ;
   private boolean[] BC000G2_n191TBM21_CRT_USER_ID ;
   private java.util.Date[] BC000G2_A193TBM21_UPD_DATETIME ;
   private boolean[] BC000G2_n193TBM21_UPD_DATETIME ;
   private String[] BC000G2_A194TBM21_UPD_USER_ID ;
   private boolean[] BC000G2_n194TBM21_UPD_USER_ID ;
   private long[] BC000G2_A196TBM21_UPD_CNT ;
   private boolean[] BC000G2_n196TBM21_UPD_CNT ;
   private String[] BC000G2_A187TBM21_STUDY_NM ;
   private boolean[] BC000G2_n187TBM21_STUDY_NM ;
   private String[] BC000G2_A408TBM21_OUTER_STUDY_ID ;
   private boolean[] BC000G2_n408TBM21_OUTER_STUDY_ID ;
   private String[] BC000G2_A409TBM21_PROC_NM ;
   private boolean[] BC000G2_n409TBM21_PROC_NM ;
   private String[] BC000G2_A188TBM21_NOTE ;
   private boolean[] BC000G2_n188TBM21_NOTE ;
   private String[] BC000G2_A513TBM21_STATUS ;
   private boolean[] BC000G2_n513TBM21_STATUS ;
   private String[] BC000G2_A189TBM21_DEL_FLG ;
   private boolean[] BC000G2_n189TBM21_DEL_FLG ;
   private String[] BC000G2_A192TBM21_CRT_PROG_NM ;
   private boolean[] BC000G2_n192TBM21_CRT_PROG_NM ;
   private String[] BC000G2_A195TBM21_UPD_PROG_NM ;
   private boolean[] BC000G2_n195TBM21_UPD_PROG_NM ;
   private long[] BC000G9_A435TBM25_STUDY_ID ;
   private String[] BC000G9_A436TBM25_LIST_CD ;
   private long[] BC000G10_A422TBM24_STUDY_ID ;
   private String[] BC000G10_A423TBM24_DOM_CD ;
   private String[] BC000G10_A424TBM24_DOM_VAR_NM ;
   private String[] BC000G10_A425TBM24_CRF_ITEM_DIV ;
   private long[] BC000G11_A217TBM31_STUDY_ID ;
   private short[] BC000G11_A218TBM31_CRF_ID ;
   private long[] BC000G12_A207TBM23_STUDY_ID ;
   private String[] BC000G12_A208TBM23_USER_ID ;
   private String[] BC000G12_A407TBM23_STYDY_AUTH_CD ;
   private long[] BC000G13_A197TBM22_STUDY_ID ;
   private String[] BC000G13_A198TBM22_SITE_ID ;
   private long[] BC000G14_A186TBM21_STUDY_ID ;
   private java.util.Date[] BC000G14_A190TBM21_CRT_DATETIME ;
   private boolean[] BC000G14_n190TBM21_CRT_DATETIME ;
   private String[] BC000G14_A191TBM21_CRT_USER_ID ;
   private boolean[] BC000G14_n191TBM21_CRT_USER_ID ;
   private java.util.Date[] BC000G14_A193TBM21_UPD_DATETIME ;
   private boolean[] BC000G14_n193TBM21_UPD_DATETIME ;
   private String[] BC000G14_A194TBM21_UPD_USER_ID ;
   private boolean[] BC000G14_n194TBM21_UPD_USER_ID ;
   private long[] BC000G14_A196TBM21_UPD_CNT ;
   private boolean[] BC000G14_n196TBM21_UPD_CNT ;
   private String[] BC000G14_A187TBM21_STUDY_NM ;
   private boolean[] BC000G14_n187TBM21_STUDY_NM ;
   private String[] BC000G14_A408TBM21_OUTER_STUDY_ID ;
   private boolean[] BC000G14_n408TBM21_OUTER_STUDY_ID ;
   private String[] BC000G14_A409TBM21_PROC_NM ;
   private boolean[] BC000G14_n409TBM21_PROC_NM ;
   private String[] BC000G14_A188TBM21_NOTE ;
   private boolean[] BC000G14_n188TBM21_NOTE ;
   private String[] BC000G14_A513TBM21_STATUS ;
   private boolean[] BC000G14_n513TBM21_STATUS ;
   private String[] BC000G14_A189TBM21_DEL_FLG ;
   private boolean[] BC000G14_n189TBM21_DEL_FLG ;
   private String[] BC000G14_A192TBM21_CRT_PROG_NM ;
   private boolean[] BC000G14_n192TBM21_CRT_PROG_NM ;
   private String[] BC000G14_A195TBM21_UPD_PROG_NM ;
   private boolean[] BC000G14_n195TBM21_UPD_PROG_NM ;
}

final  class tbm21_study_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000G2", "SELECT `TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000G3", "SELECT `TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000G4", "SELECT TM1.`TBM21_STUDY_ID`, TM1.`TBM21_CRT_DATETIME`, TM1.`TBM21_CRT_USER_ID`, TM1.`TBM21_UPD_DATETIME`, TM1.`TBM21_UPD_USER_ID`, TM1.`TBM21_UPD_CNT`, TM1.`TBM21_STUDY_NM`, TM1.`TBM21_OUTER_STUDY_ID`, TM1.`TBM21_PROC_NM`, TM1.`TBM21_NOTE`, TM1.`TBM21_STATUS`, TM1.`TBM21_DEL_FLG`, TM1.`TBM21_CRT_PROG_NM`, TM1.`TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` TM1 WHERE TM1.`TBM21_STUDY_ID` = ? ORDER BY TM1.`TBM21_STUDY_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000G5", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000G6", "INSERT INTO `TBM21_STUDY` (`TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000G7", "UPDATE `TBM21_STUDY` SET `TBM21_CRT_DATETIME`=?, `TBM21_CRT_USER_ID`=?, `TBM21_UPD_DATETIME`=?, `TBM21_UPD_USER_ID`=?, `TBM21_UPD_CNT`=?, `TBM21_STUDY_NM`=?, `TBM21_OUTER_STUDY_ID`=?, `TBM21_PROC_NM`=?, `TBM21_NOTE`=?, `TBM21_STATUS`=?, `TBM21_DEL_FLG`=?, `TBM21_CRT_PROG_NM`=?, `TBM21_UPD_PROG_NM`=?  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000G8", "DELETE FROM `TBM21_STUDY`  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000G9", "SELECT `TBM25_STUDY_ID`, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G10", "SELECT `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G11", "SELECT `TBM31_STUDY_ID`, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G12", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G13", "SELECT `TBM22_STUDY_ID`, `TBM22_SITE_ID` FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000G14", "SELECT TM1.`TBM21_STUDY_ID`, TM1.`TBM21_CRT_DATETIME`, TM1.`TBM21_CRT_USER_ID`, TM1.`TBM21_UPD_DATETIME`, TM1.`TBM21_UPD_USER_ID`, TM1.`TBM21_UPD_CNT`, TM1.`TBM21_STUDY_NM`, TM1.`TBM21_OUTER_STUDY_ID`, TM1.`TBM21_PROC_NM`, TM1.`TBM21_NOTE`, TM1.`TBM21_STATUS`, TM1.`TBM21_DEL_FLG`, TM1.`TBM21_CRT_PROG_NM`, TM1.`TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` TM1 WHERE TM1.`TBM21_STUDY_ID` = ? ORDER BY TM1.`TBM21_STUDY_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               break;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
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
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

