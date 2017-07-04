/*
               File: tbm22_study_site_bc
        Description: 試験実施施設マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:36.49
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm22_study_site_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm22_study_site_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm22_study_site_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm22_study_site_bc.class ));
   }

   public tbm22_study_site_bc( int remoteHandle ,
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
         /* Execute user event: e120H2 */
         e120H2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z197TBM22_STUDY_ID = A197TBM22_STUDY_ID ;
            Z198TBM22_SITE_ID = A198TBM22_SITE_ID ;
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

   public void confirm_0H0( )
   {
      beforeValidate0H16( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0H16( ) ;
         }
         else
         {
            checkExtendedTable0H16( ) ;
            if ( AnyError == 0 )
            {
               zm0H16( 9) ;
               zm0H16( 10) ;
            }
            closeExtendedTableCursors0H16( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110H2( )
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

   public void e120H2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A198TBM22_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A199TBM22_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A200TBM22_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm22_study_site_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A201TBM22_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A202TBM22_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A203TBM22_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm22_study_site_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A204TBM22_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A205TBM22_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1163( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0H16( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z200TBM22_CRT_DATETIME = A200TBM22_CRT_DATETIME ;
         Z201TBM22_CRT_USER_ID = A201TBM22_CRT_USER_ID ;
         Z203TBM22_UPD_DATETIME = A203TBM22_UPD_DATETIME ;
         Z204TBM22_UPD_USER_ID = A204TBM22_UPD_USER_ID ;
         Z206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
         Z199TBM22_DEL_FLG = A199TBM22_DEL_FLG ;
         Z202TBM22_CRT_PROG_NM = A202TBM22_CRT_PROG_NM ;
         Z205TBM22_UPD_PROG_NM = A205TBM22_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z200TBM22_CRT_DATETIME = A200TBM22_CRT_DATETIME ;
         Z201TBM22_CRT_USER_ID = A201TBM22_CRT_USER_ID ;
         Z203TBM22_UPD_DATETIME = A203TBM22_UPD_DATETIME ;
         Z204TBM22_UPD_USER_ID = A204TBM22_UPD_USER_ID ;
         Z206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
         Z199TBM22_DEL_FLG = A199TBM22_DEL_FLG ;
         Z202TBM22_CRT_PROG_NM = A202TBM22_CRT_PROG_NM ;
         Z205TBM22_UPD_PROG_NM = A205TBM22_UPD_PROG_NM ;
         Z197TBM22_STUDY_ID = A197TBM22_STUDY_ID ;
         Z198TBM22_SITE_ID = A198TBM22_SITE_ID ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0H16( )
   {
      /* Using cursor BC000H6 */
      pr_default.execute(4, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A200TBM22_CRT_DATETIME = BC000H6_A200TBM22_CRT_DATETIME[0] ;
         n200TBM22_CRT_DATETIME = BC000H6_n200TBM22_CRT_DATETIME[0] ;
         A201TBM22_CRT_USER_ID = BC000H6_A201TBM22_CRT_USER_ID[0] ;
         n201TBM22_CRT_USER_ID = BC000H6_n201TBM22_CRT_USER_ID[0] ;
         A203TBM22_UPD_DATETIME = BC000H6_A203TBM22_UPD_DATETIME[0] ;
         n203TBM22_UPD_DATETIME = BC000H6_n203TBM22_UPD_DATETIME[0] ;
         A204TBM22_UPD_USER_ID = BC000H6_A204TBM22_UPD_USER_ID[0] ;
         n204TBM22_UPD_USER_ID = BC000H6_n204TBM22_UPD_USER_ID[0] ;
         A206TBM22_UPD_CNT = BC000H6_A206TBM22_UPD_CNT[0] ;
         n206TBM22_UPD_CNT = BC000H6_n206TBM22_UPD_CNT[0] ;
         A199TBM22_DEL_FLG = BC000H6_A199TBM22_DEL_FLG[0] ;
         n199TBM22_DEL_FLG = BC000H6_n199TBM22_DEL_FLG[0] ;
         A202TBM22_CRT_PROG_NM = BC000H6_A202TBM22_CRT_PROG_NM[0] ;
         n202TBM22_CRT_PROG_NM = BC000H6_n202TBM22_CRT_PROG_NM[0] ;
         A205TBM22_UPD_PROG_NM = BC000H6_A205TBM22_UPD_PROG_NM[0] ;
         n205TBM22_UPD_PROG_NM = BC000H6_n205TBM22_UPD_PROG_NM[0] ;
         zm0H16( -8) ;
      }
      pr_default.close(4);
      onLoadActions0H16( ) ;
   }

   public void onLoadActions0H16( )
   {
      AV9Pgmname = "TBM22_STUDY_SITE_BC" ;
   }

   public void checkExtendedTable0H16( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM22_STUDY_SITE_BC" ;
      /* Using cursor BC000H4 */
      pr_default.execute(2, new Object[] {new Long(A197TBM22_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError197 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_STUDY_ID");
         AnyError = (short)(1) ;
      }
      if ( AnyError197 == 0 )
      {
      }
      pr_default.close(2);
      /* Using cursor BC000H5 */
      pr_default.execute(3, new Object[] {A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         AnyError198 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施施設マスタ・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_SITE_ID");
         AnyError = (short)(1) ;
      }
      if ( AnyError198 == 0 )
      {
      }
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A200TBM22_CRT_DATETIME) || (( A200TBM22_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A200TBM22_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A203TBM22_UPD_DATETIME) || (( A203TBM22_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A203TBM22_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0H16( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void getKey0H16( )
   {
      /* Using cursor BC000H7 */
      pr_default.execute(5, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound16 = (short)(1) ;
      }
      else
      {
         RcdFound16 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000H3 */
      pr_default.execute(1, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0H16( 8) ;
         RcdFound16 = (short)(1) ;
         A200TBM22_CRT_DATETIME = BC000H3_A200TBM22_CRT_DATETIME[0] ;
         n200TBM22_CRT_DATETIME = BC000H3_n200TBM22_CRT_DATETIME[0] ;
         A201TBM22_CRT_USER_ID = BC000H3_A201TBM22_CRT_USER_ID[0] ;
         n201TBM22_CRT_USER_ID = BC000H3_n201TBM22_CRT_USER_ID[0] ;
         A203TBM22_UPD_DATETIME = BC000H3_A203TBM22_UPD_DATETIME[0] ;
         n203TBM22_UPD_DATETIME = BC000H3_n203TBM22_UPD_DATETIME[0] ;
         A204TBM22_UPD_USER_ID = BC000H3_A204TBM22_UPD_USER_ID[0] ;
         n204TBM22_UPD_USER_ID = BC000H3_n204TBM22_UPD_USER_ID[0] ;
         A206TBM22_UPD_CNT = BC000H3_A206TBM22_UPD_CNT[0] ;
         n206TBM22_UPD_CNT = BC000H3_n206TBM22_UPD_CNT[0] ;
         A199TBM22_DEL_FLG = BC000H3_A199TBM22_DEL_FLG[0] ;
         n199TBM22_DEL_FLG = BC000H3_n199TBM22_DEL_FLG[0] ;
         A202TBM22_CRT_PROG_NM = BC000H3_A202TBM22_CRT_PROG_NM[0] ;
         n202TBM22_CRT_PROG_NM = BC000H3_n202TBM22_CRT_PROG_NM[0] ;
         A205TBM22_UPD_PROG_NM = BC000H3_A205TBM22_UPD_PROG_NM[0] ;
         n205TBM22_UPD_PROG_NM = BC000H3_n205TBM22_UPD_PROG_NM[0] ;
         A197TBM22_STUDY_ID = BC000H3_A197TBM22_STUDY_ID[0] ;
         A198TBM22_SITE_ID = BC000H3_A198TBM22_SITE_ID[0] ;
         O206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
         n206TBM22_UPD_CNT = false ;
         Z197TBM22_STUDY_ID = A197TBM22_STUDY_ID ;
         Z198TBM22_SITE_ID = A198TBM22_SITE_ID ;
         sMode16 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0H16( ) ;
         Gx_mode = sMode16 ;
      }
      else
      {
         RcdFound16 = (short)(0) ;
         initializeNonKey0H16( ) ;
         sMode16 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode16 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0H16( ) ;
      if ( RcdFound16 == 0 )
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
      confirm_0H0( ) ;
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

   public void checkOptimisticConcurrency0H16( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000H2 */
         pr_default.execute(0, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM22_STUDY_SITE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z200TBM22_CRT_DATETIME.equals( BC000H2_A200TBM22_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z201TBM22_CRT_USER_ID, BC000H2_A201TBM22_CRT_USER_ID[0]) != 0 ) || !( Z203TBM22_UPD_DATETIME.equals( BC000H2_A203TBM22_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z204TBM22_UPD_USER_ID, BC000H2_A204TBM22_UPD_USER_ID[0]) != 0 ) || ( Z206TBM22_UPD_CNT != BC000H2_A206TBM22_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z199TBM22_DEL_FLG, BC000H2_A199TBM22_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z202TBM22_CRT_PROG_NM, BC000H2_A202TBM22_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z205TBM22_UPD_PROG_NM, BC000H2_A205TBM22_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM22_STUDY_SITE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0H16( )
   {
      beforeValidate0H16( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0H16( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0H16( 0) ;
         checkOptimisticConcurrency0H16( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0H16( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0H16( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000H8 */
                  pr_default.execute(6, new Object[] {new Boolean(n200TBM22_CRT_DATETIME), A200TBM22_CRT_DATETIME, new Boolean(n201TBM22_CRT_USER_ID), A201TBM22_CRT_USER_ID, new Boolean(n203TBM22_UPD_DATETIME), A203TBM22_UPD_DATETIME, new Boolean(n204TBM22_UPD_USER_ID), A204TBM22_UPD_USER_ID, new Boolean(n206TBM22_UPD_CNT), new Long(A206TBM22_UPD_CNT), new Boolean(n199TBM22_DEL_FLG), A199TBM22_DEL_FLG, new Boolean(n202TBM22_CRT_PROG_NM), A202TBM22_CRT_PROG_NM, new Boolean(n205TBM22_UPD_PROG_NM), A205TBM22_UPD_PROG_NM, new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
                  if ( (pr_default.getStatus(6) == 1) )
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
            load0H16( ) ;
         }
         endLevel0H16( ) ;
      }
      closeExtendedTableCursors0H16( ) ;
   }

   public void update0H16( )
   {
      beforeValidate0H16( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0H16( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0H16( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0H16( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0H16( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000H9 */
                  pr_default.execute(7, new Object[] {new Boolean(n200TBM22_CRT_DATETIME), A200TBM22_CRT_DATETIME, new Boolean(n201TBM22_CRT_USER_ID), A201TBM22_CRT_USER_ID, new Boolean(n203TBM22_UPD_DATETIME), A203TBM22_UPD_DATETIME, new Boolean(n204TBM22_UPD_USER_ID), A204TBM22_UPD_USER_ID, new Boolean(n206TBM22_UPD_CNT), new Long(A206TBM22_UPD_CNT), new Boolean(n199TBM22_DEL_FLG), A199TBM22_DEL_FLG, new Boolean(n202TBM22_CRT_PROG_NM), A202TBM22_CRT_PROG_NM, new Boolean(n205TBM22_UPD_PROG_NM), A205TBM22_UPD_PROG_NM, new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM22_STUDY_SITE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0H16( ) ;
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
         endLevel0H16( ) ;
      }
      closeExtendedTableCursors0H16( ) ;
   }

   public void deferredUpdate0H16( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0H16( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0H16( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0H16( ) ;
         afterConfirm0H16( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0H16( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000H10 */
               pr_default.execute(8, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
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
      sMode16 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0H16( ) ;
      Gx_mode = sMode16 ;
   }

   public void onDeleteControls0H16( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM22_STUDY_SITE_BC" ;
      }
   }

   public void endLevel0H16( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0H16( ) ;
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

   public void scanKeyStart0H16( )
   {
      /* Using cursor BC000H11 */
      pr_default.execute(9, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      RcdFound16 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A200TBM22_CRT_DATETIME = BC000H11_A200TBM22_CRT_DATETIME[0] ;
         n200TBM22_CRT_DATETIME = BC000H11_n200TBM22_CRT_DATETIME[0] ;
         A201TBM22_CRT_USER_ID = BC000H11_A201TBM22_CRT_USER_ID[0] ;
         n201TBM22_CRT_USER_ID = BC000H11_n201TBM22_CRT_USER_ID[0] ;
         A203TBM22_UPD_DATETIME = BC000H11_A203TBM22_UPD_DATETIME[0] ;
         n203TBM22_UPD_DATETIME = BC000H11_n203TBM22_UPD_DATETIME[0] ;
         A204TBM22_UPD_USER_ID = BC000H11_A204TBM22_UPD_USER_ID[0] ;
         n204TBM22_UPD_USER_ID = BC000H11_n204TBM22_UPD_USER_ID[0] ;
         A206TBM22_UPD_CNT = BC000H11_A206TBM22_UPD_CNT[0] ;
         n206TBM22_UPD_CNT = BC000H11_n206TBM22_UPD_CNT[0] ;
         A199TBM22_DEL_FLG = BC000H11_A199TBM22_DEL_FLG[0] ;
         n199TBM22_DEL_FLG = BC000H11_n199TBM22_DEL_FLG[0] ;
         A202TBM22_CRT_PROG_NM = BC000H11_A202TBM22_CRT_PROG_NM[0] ;
         n202TBM22_CRT_PROG_NM = BC000H11_n202TBM22_CRT_PROG_NM[0] ;
         A205TBM22_UPD_PROG_NM = BC000H11_A205TBM22_UPD_PROG_NM[0] ;
         n205TBM22_UPD_PROG_NM = BC000H11_n205TBM22_UPD_PROG_NM[0] ;
         A197TBM22_STUDY_ID = BC000H11_A197TBM22_STUDY_ID[0] ;
         A198TBM22_SITE_ID = BC000H11_A198TBM22_SITE_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0H16( )
   {
      pr_default.readNext(9);
      RcdFound16 = (short)(0) ;
      scanKeyLoad0H16( ) ;
   }

   public void scanKeyLoad0H16( )
   {
      sMode16 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A200TBM22_CRT_DATETIME = BC000H11_A200TBM22_CRT_DATETIME[0] ;
         n200TBM22_CRT_DATETIME = BC000H11_n200TBM22_CRT_DATETIME[0] ;
         A201TBM22_CRT_USER_ID = BC000H11_A201TBM22_CRT_USER_ID[0] ;
         n201TBM22_CRT_USER_ID = BC000H11_n201TBM22_CRT_USER_ID[0] ;
         A203TBM22_UPD_DATETIME = BC000H11_A203TBM22_UPD_DATETIME[0] ;
         n203TBM22_UPD_DATETIME = BC000H11_n203TBM22_UPD_DATETIME[0] ;
         A204TBM22_UPD_USER_ID = BC000H11_A204TBM22_UPD_USER_ID[0] ;
         n204TBM22_UPD_USER_ID = BC000H11_n204TBM22_UPD_USER_ID[0] ;
         A206TBM22_UPD_CNT = BC000H11_A206TBM22_UPD_CNT[0] ;
         n206TBM22_UPD_CNT = BC000H11_n206TBM22_UPD_CNT[0] ;
         A199TBM22_DEL_FLG = BC000H11_A199TBM22_DEL_FLG[0] ;
         n199TBM22_DEL_FLG = BC000H11_n199TBM22_DEL_FLG[0] ;
         A202TBM22_CRT_PROG_NM = BC000H11_A202TBM22_CRT_PROG_NM[0] ;
         n202TBM22_CRT_PROG_NM = BC000H11_n202TBM22_CRT_PROG_NM[0] ;
         A205TBM22_UPD_PROG_NM = BC000H11_A205TBM22_UPD_PROG_NM[0] ;
         n205TBM22_UPD_PROG_NM = BC000H11_n205TBM22_UPD_PROG_NM[0] ;
         A197TBM22_STUDY_ID = BC000H11_A197TBM22_STUDY_ID[0] ;
         A198TBM22_SITE_ID = BC000H11_A198TBM22_SITE_ID[0] ;
      }
      Gx_mode = sMode16 ;
   }

   public void scanKeyEnd0H16( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0H16( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0H16( )
   {
      /* Before Insert Rules */
      A200TBM22_CRT_DATETIME = GXutil.now( ) ;
      n200TBM22_CRT_DATETIME = false ;
      GXt_char1 = A201TBM22_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm22_study_site_bc.this.GXt_char1 = GXv_char2[0] ;
      A201TBM22_CRT_USER_ID = GXt_char1 ;
      n201TBM22_CRT_USER_ID = false ;
      A203TBM22_UPD_DATETIME = GXutil.now( ) ;
      n203TBM22_UPD_DATETIME = false ;
      GXt_char1 = A204TBM22_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm22_study_site_bc.this.GXt_char1 = GXv_char2[0] ;
      A204TBM22_UPD_USER_ID = GXt_char1 ;
      n204TBM22_UPD_USER_ID = false ;
      A206TBM22_UPD_CNT = (long)(O206TBM22_UPD_CNT+1) ;
      n206TBM22_UPD_CNT = false ;
   }

   public void beforeUpdate0H16( )
   {
      /* Before Update Rules */
      A203TBM22_UPD_DATETIME = GXutil.now( ) ;
      n203TBM22_UPD_DATETIME = false ;
      GXt_char1 = A204TBM22_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm22_study_site_bc.this.GXt_char1 = GXv_char2[0] ;
      A204TBM22_UPD_USER_ID = GXt_char1 ;
      n204TBM22_UPD_USER_ID = false ;
      A206TBM22_UPD_CNT = (long)(O206TBM22_UPD_CNT+1) ;
      n206TBM22_UPD_CNT = false ;
   }

   public void beforeDelete0H16( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0H16( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0H16( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0H16( )
   {
   }

   public void addRow0H16( )
   {
      VarsToRow16( bcTBM22_STUDY_SITE) ;
   }

   public void readRow0H16( )
   {
      RowToVars16( bcTBM22_STUDY_SITE, 1) ;
   }

   public void initializeNonKey0H16( )
   {
      A200TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n200TBM22_CRT_DATETIME = false ;
      A201TBM22_CRT_USER_ID = "" ;
      n201TBM22_CRT_USER_ID = false ;
      A203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n203TBM22_UPD_DATETIME = false ;
      A204TBM22_UPD_USER_ID = "" ;
      n204TBM22_UPD_USER_ID = false ;
      A206TBM22_UPD_CNT = 0 ;
      n206TBM22_UPD_CNT = false ;
      A199TBM22_DEL_FLG = "" ;
      n199TBM22_DEL_FLG = false ;
      A202TBM22_CRT_PROG_NM = "" ;
      n202TBM22_CRT_PROG_NM = false ;
      A205TBM22_UPD_PROG_NM = "" ;
      n205TBM22_UPD_PROG_NM = false ;
      O206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
      n206TBM22_UPD_CNT = false ;
   }

   public void initAll0H16( )
   {
      A197TBM22_STUDY_ID = 0 ;
      A198TBM22_SITE_ID = "" ;
      initializeNonKey0H16( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow16( SdtTBM22_STUDY_SITE obj16 )
   {
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Mode( Gx_mode );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime( A200TBM22_CRT_DATETIME );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id( A201TBM22_CRT_USER_ID );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime( A203TBM22_UPD_DATETIME );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id( A204TBM22_UPD_USER_ID );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt( A206TBM22_UPD_CNT );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg( A199TBM22_DEL_FLG );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm( A202TBM22_CRT_PROG_NM );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm( A205TBM22_UPD_PROG_NM );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id( A197TBM22_STUDY_ID );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id( A198TBM22_SITE_ID );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z( Z197TBM22_STUDY_ID );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z( Z198TBM22_SITE_ID );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z( Z199TBM22_DEL_FLG );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z( Z200TBM22_CRT_DATETIME );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z( Z201TBM22_CRT_USER_ID );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z( Z202TBM22_CRT_PROG_NM );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z( Z203TBM22_UPD_DATETIME );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z( Z204TBM22_UPD_USER_ID );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z( Z205TBM22_UPD_PROG_NM );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z( Z206TBM22_UPD_CNT );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N( (byte)((byte)((n199TBM22_DEL_FLG)?1:0)) );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N( (byte)((byte)((n200TBM22_CRT_DATETIME)?1:0)) );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N( (byte)((byte)((n201TBM22_CRT_USER_ID)?1:0)) );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N( (byte)((byte)((n202TBM22_CRT_PROG_NM)?1:0)) );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N( (byte)((byte)((n203TBM22_UPD_DATETIME)?1:0)) );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N( (byte)((byte)((n204TBM22_UPD_USER_ID)?1:0)) );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N( (byte)((byte)((n205TBM22_UPD_PROG_NM)?1:0)) );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N( (byte)((byte)((n206TBM22_UPD_CNT)?1:0)) );
      obj16.setgxTv_SdtTBM22_STUDY_SITE_Mode( Gx_mode );
   }

   public void RowToVars16( SdtTBM22_STUDY_SITE obj16 ,
                            int forceLoad )
   {
      Gx_mode = obj16.getgxTv_SdtTBM22_STUDY_SITE_Mode() ;
      A200TBM22_CRT_DATETIME = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime() ;
      n200TBM22_CRT_DATETIME = false ;
      A201TBM22_CRT_USER_ID = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id() ;
      n201TBM22_CRT_USER_ID = false ;
      A203TBM22_UPD_DATETIME = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime() ;
      n203TBM22_UPD_DATETIME = false ;
      A204TBM22_UPD_USER_ID = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id() ;
      n204TBM22_UPD_USER_ID = false ;
      A206TBM22_UPD_CNT = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt() ;
      n206TBM22_UPD_CNT = false ;
      A199TBM22_DEL_FLG = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg() ;
      n199TBM22_DEL_FLG = false ;
      A202TBM22_CRT_PROG_NM = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm() ;
      n202TBM22_CRT_PROG_NM = false ;
      A205TBM22_UPD_PROG_NM = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm() ;
      n205TBM22_UPD_PROG_NM = false ;
      A197TBM22_STUDY_ID = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id() ;
      A198TBM22_SITE_ID = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id() ;
      Z197TBM22_STUDY_ID = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z() ;
      Z198TBM22_SITE_ID = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z() ;
      Z199TBM22_DEL_FLG = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z() ;
      Z200TBM22_CRT_DATETIME = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z() ;
      Z201TBM22_CRT_USER_ID = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z() ;
      Z202TBM22_CRT_PROG_NM = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z() ;
      Z203TBM22_UPD_DATETIME = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z() ;
      Z204TBM22_UPD_USER_ID = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z() ;
      Z205TBM22_UPD_PROG_NM = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z() ;
      Z206TBM22_UPD_CNT = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z() ;
      O206TBM22_UPD_CNT = obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z() ;
      n199TBM22_DEL_FLG = (boolean)((obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N()==0)?false:true) ;
      n200TBM22_CRT_DATETIME = (boolean)((obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N()==0)?false:true) ;
      n201TBM22_CRT_USER_ID = (boolean)((obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N()==0)?false:true) ;
      n202TBM22_CRT_PROG_NM = (boolean)((obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N()==0)?false:true) ;
      n203TBM22_UPD_DATETIME = (boolean)((obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N()==0)?false:true) ;
      n204TBM22_UPD_USER_ID = (boolean)((obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N()==0)?false:true) ;
      n205TBM22_UPD_PROG_NM = (boolean)((obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N()==0)?false:true) ;
      n206TBM22_UPD_CNT = (boolean)((obj16.getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj16.getgxTv_SdtTBM22_STUDY_SITE_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A197TBM22_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A198TBM22_SITE_ID = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0H16( ) ;
      scanKeyStart0H16( ) ;
      if ( RcdFound16 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000H12 */
         pr_default.execute(10, new Object[] {new Long(A197TBM22_STUDY_ID)});
         if ( (pr_default.getStatus(10) == 101) )
         {
            AnyError197 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'試験実施マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_STUDY_ID");
            AnyError = (short)(1) ;
         }
         if ( AnyError197 == 0 )
         {
         }
         pr_default.close(10);
         /* Using cursor BC000H13 */
         pr_default.execute(11, new Object[] {A198TBM22_SITE_ID});
         if ( (pr_default.getStatus(11) == 101) )
         {
            AnyError198 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'試験実施施設マスタ・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_SITE_ID");
            AnyError = (short)(1) ;
         }
         if ( AnyError198 == 0 )
         {
         }
         pr_default.close(11);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z197TBM22_STUDY_ID = A197TBM22_STUDY_ID ;
         Z198TBM22_SITE_ID = A198TBM22_SITE_ID ;
         O206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
         n206TBM22_UPD_CNT = false ;
      }
      zm0H16( -8) ;
      sMode16 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0H16( ) ;
      Gx_mode = sMode16 ;
      addRow0H16( ) ;
      scanKeyEnd0H16( ) ;
      if ( RcdFound16 == 0 )
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
      RowToVars16( bcTBM22_STUDY_SITE, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0H16( ) ;
      if ( RcdFound16 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A197TBM22_STUDY_ID != Z197TBM22_STUDY_ID ) || ( GXutil.strcmp(A198TBM22_SITE_ID, Z198TBM22_SITE_ID) != 0 ) )
         {
            A197TBM22_STUDY_ID = Z197TBM22_STUDY_ID ;
            A198TBM22_SITE_ID = Z198TBM22_SITE_ID ;
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
            update0H16( ) ;
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
            if ( ( A197TBM22_STUDY_ID != Z197TBM22_STUDY_ID ) || ( GXutil.strcmp(A198TBM22_SITE_ID, Z198TBM22_SITE_ID) != 0 ) )
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
                  insert0H16( ) ;
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
                  insert0H16( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow16( bcTBM22_STUDY_SITE) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars16( bcTBM22_STUDY_SITE, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0H16( ) ;
      if ( RcdFound16 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A197TBM22_STUDY_ID != Z197TBM22_STUDY_ID ) || ( GXutil.strcmp(A198TBM22_SITE_ID, Z198TBM22_SITE_ID) != 0 ) )
         {
            A197TBM22_STUDY_ID = Z197TBM22_STUDY_ID ;
            A198TBM22_SITE_ID = Z198TBM22_SITE_ID ;
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
         if ( ( A197TBM22_STUDY_ID != Z197TBM22_STUDY_ID ) || ( GXutil.strcmp(A198TBM22_SITE_ID, Z198TBM22_SITE_ID) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm22_study_site_bc");
      VarsToRow16( bcTBM22_STUDY_SITE) ;
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
      Gx_mode = bcTBM22_STUDY_SITE.getgxTv_SdtTBM22_STUDY_SITE_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM22_STUDY_SITE.setgxTv_SdtTBM22_STUDY_SITE_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM22_STUDY_SITE sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM22_STUDY_SITE )
      {
         bcTBM22_STUDY_SITE = sdt ;
         if ( GXutil.strcmp(bcTBM22_STUDY_SITE.getgxTv_SdtTBM22_STUDY_SITE_Mode(), "") == 0 )
         {
            bcTBM22_STUDY_SITE.setgxTv_SdtTBM22_STUDY_SITE_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow16( bcTBM22_STUDY_SITE) ;
         }
         else
         {
            RowToVars16( bcTBM22_STUDY_SITE, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM22_STUDY_SITE.getgxTv_SdtTBM22_STUDY_SITE_Mode(), "") == 0 )
         {
            bcTBM22_STUDY_SITE.setgxTv_SdtTBM22_STUDY_SITE_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars16( bcTBM22_STUDY_SITE, 1) ;
   }

   public SdtTBM22_STUDY_SITE getTBM22_STUDY_SITE_BC( )
   {
      return bcTBM22_STUDY_SITE ;
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
      pr_default.close(11);
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
                  /* Execute user subroutine: S1163 */
                  S1163 ();
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
      Z198TBM22_SITE_ID = "" ;
      A198TBM22_SITE_ID = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A199TBM22_DEL_FLG = "" ;
      A200TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A201TBM22_CRT_USER_ID = "" ;
      A202TBM22_CRT_PROG_NM = "" ;
      A203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A204TBM22_UPD_USER_ID = "" ;
      A205TBM22_UPD_PROG_NM = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z = "" ;
      Z200TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z201TBM22_CRT_USER_ID = "" ;
      Z203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z204TBM22_UPD_USER_ID = "" ;
      Z199TBM22_DEL_FLG = "" ;
      Z202TBM22_CRT_PROG_NM = "" ;
      Z205TBM22_UPD_PROG_NM = "" ;
      BC000H6_A200TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000H6_n200TBM22_CRT_DATETIME = new boolean[] {false} ;
      BC000H6_A201TBM22_CRT_USER_ID = new String[] {""} ;
      BC000H6_n201TBM22_CRT_USER_ID = new boolean[] {false} ;
      BC000H6_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000H6_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      BC000H6_A204TBM22_UPD_USER_ID = new String[] {""} ;
      BC000H6_n204TBM22_UPD_USER_ID = new boolean[] {false} ;
      BC000H6_A206TBM22_UPD_CNT = new long[1] ;
      BC000H6_n206TBM22_UPD_CNT = new boolean[] {false} ;
      BC000H6_A199TBM22_DEL_FLG = new String[] {""} ;
      BC000H6_n199TBM22_DEL_FLG = new boolean[] {false} ;
      BC000H6_A202TBM22_CRT_PROG_NM = new String[] {""} ;
      BC000H6_n202TBM22_CRT_PROG_NM = new boolean[] {false} ;
      BC000H6_A205TBM22_UPD_PROG_NM = new String[] {""} ;
      BC000H6_n205TBM22_UPD_PROG_NM = new boolean[] {false} ;
      BC000H6_A197TBM22_STUDY_ID = new long[1] ;
      BC000H6_A198TBM22_SITE_ID = new String[] {""} ;
      BC000H4_A197TBM22_STUDY_ID = new long[1] ;
      BC000H5_A198TBM22_SITE_ID = new String[] {""} ;
      BC000H7_A197TBM22_STUDY_ID = new long[1] ;
      BC000H7_A198TBM22_SITE_ID = new String[] {""} ;
      BC000H3_A200TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000H3_n200TBM22_CRT_DATETIME = new boolean[] {false} ;
      BC000H3_A201TBM22_CRT_USER_ID = new String[] {""} ;
      BC000H3_n201TBM22_CRT_USER_ID = new boolean[] {false} ;
      BC000H3_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000H3_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      BC000H3_A204TBM22_UPD_USER_ID = new String[] {""} ;
      BC000H3_n204TBM22_UPD_USER_ID = new boolean[] {false} ;
      BC000H3_A206TBM22_UPD_CNT = new long[1] ;
      BC000H3_n206TBM22_UPD_CNT = new boolean[] {false} ;
      BC000H3_A199TBM22_DEL_FLG = new String[] {""} ;
      BC000H3_n199TBM22_DEL_FLG = new boolean[] {false} ;
      BC000H3_A202TBM22_CRT_PROG_NM = new String[] {""} ;
      BC000H3_n202TBM22_CRT_PROG_NM = new boolean[] {false} ;
      BC000H3_A205TBM22_UPD_PROG_NM = new String[] {""} ;
      BC000H3_n205TBM22_UPD_PROG_NM = new boolean[] {false} ;
      BC000H3_A197TBM22_STUDY_ID = new long[1] ;
      BC000H3_A198TBM22_SITE_ID = new String[] {""} ;
      sMode16 = "" ;
      BC000H2_A200TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000H2_n200TBM22_CRT_DATETIME = new boolean[] {false} ;
      BC000H2_A201TBM22_CRT_USER_ID = new String[] {""} ;
      BC000H2_n201TBM22_CRT_USER_ID = new boolean[] {false} ;
      BC000H2_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000H2_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      BC000H2_A204TBM22_UPD_USER_ID = new String[] {""} ;
      BC000H2_n204TBM22_UPD_USER_ID = new boolean[] {false} ;
      BC000H2_A206TBM22_UPD_CNT = new long[1] ;
      BC000H2_n206TBM22_UPD_CNT = new boolean[] {false} ;
      BC000H2_A199TBM22_DEL_FLG = new String[] {""} ;
      BC000H2_n199TBM22_DEL_FLG = new boolean[] {false} ;
      BC000H2_A202TBM22_CRT_PROG_NM = new String[] {""} ;
      BC000H2_n202TBM22_CRT_PROG_NM = new boolean[] {false} ;
      BC000H2_A205TBM22_UPD_PROG_NM = new String[] {""} ;
      BC000H2_n205TBM22_UPD_PROG_NM = new boolean[] {false} ;
      BC000H2_A197TBM22_STUDY_ID = new long[1] ;
      BC000H2_A198TBM22_SITE_ID = new String[] {""} ;
      BC000H11_A200TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000H11_n200TBM22_CRT_DATETIME = new boolean[] {false} ;
      BC000H11_A201TBM22_CRT_USER_ID = new String[] {""} ;
      BC000H11_n201TBM22_CRT_USER_ID = new boolean[] {false} ;
      BC000H11_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000H11_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      BC000H11_A204TBM22_UPD_USER_ID = new String[] {""} ;
      BC000H11_n204TBM22_UPD_USER_ID = new boolean[] {false} ;
      BC000H11_A206TBM22_UPD_CNT = new long[1] ;
      BC000H11_n206TBM22_UPD_CNT = new boolean[] {false} ;
      BC000H11_A199TBM22_DEL_FLG = new String[] {""} ;
      BC000H11_n199TBM22_DEL_FLG = new boolean[] {false} ;
      BC000H11_A202TBM22_CRT_PROG_NM = new String[] {""} ;
      BC000H11_n202TBM22_CRT_PROG_NM = new boolean[] {false} ;
      BC000H11_A205TBM22_UPD_PROG_NM = new String[] {""} ;
      BC000H11_n205TBM22_UPD_PROG_NM = new boolean[] {false} ;
      BC000H11_A197TBM22_STUDY_ID = new long[1] ;
      BC000H11_A198TBM22_SITE_ID = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000H12_A197TBM22_STUDY_ID = new long[1] ;
      BC000H13_A198TBM22_SITE_ID = new String[] {""} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm22_study_site_bc__default(),
         new Object[] {
             new Object[] {
            BC000H2_A200TBM22_CRT_DATETIME, BC000H2_n200TBM22_CRT_DATETIME, BC000H2_A201TBM22_CRT_USER_ID, BC000H2_n201TBM22_CRT_USER_ID, BC000H2_A203TBM22_UPD_DATETIME, BC000H2_n203TBM22_UPD_DATETIME, BC000H2_A204TBM22_UPD_USER_ID, BC000H2_n204TBM22_UPD_USER_ID, BC000H2_A206TBM22_UPD_CNT, BC000H2_n206TBM22_UPD_CNT,
            BC000H2_A199TBM22_DEL_FLG, BC000H2_n199TBM22_DEL_FLG, BC000H2_A202TBM22_CRT_PROG_NM, BC000H2_n202TBM22_CRT_PROG_NM, BC000H2_A205TBM22_UPD_PROG_NM, BC000H2_n205TBM22_UPD_PROG_NM, BC000H2_A197TBM22_STUDY_ID, BC000H2_A198TBM22_SITE_ID
            }
            , new Object[] {
            BC000H3_A200TBM22_CRT_DATETIME, BC000H3_n200TBM22_CRT_DATETIME, BC000H3_A201TBM22_CRT_USER_ID, BC000H3_n201TBM22_CRT_USER_ID, BC000H3_A203TBM22_UPD_DATETIME, BC000H3_n203TBM22_UPD_DATETIME, BC000H3_A204TBM22_UPD_USER_ID, BC000H3_n204TBM22_UPD_USER_ID, BC000H3_A206TBM22_UPD_CNT, BC000H3_n206TBM22_UPD_CNT,
            BC000H3_A199TBM22_DEL_FLG, BC000H3_n199TBM22_DEL_FLG, BC000H3_A202TBM22_CRT_PROG_NM, BC000H3_n202TBM22_CRT_PROG_NM, BC000H3_A205TBM22_UPD_PROG_NM, BC000H3_n205TBM22_UPD_PROG_NM, BC000H3_A197TBM22_STUDY_ID, BC000H3_A198TBM22_SITE_ID
            }
            , new Object[] {
            BC000H4_A197TBM22_STUDY_ID
            }
            , new Object[] {
            BC000H5_A198TBM22_SITE_ID
            }
            , new Object[] {
            BC000H6_A200TBM22_CRT_DATETIME, BC000H6_n200TBM22_CRT_DATETIME, BC000H6_A201TBM22_CRT_USER_ID, BC000H6_n201TBM22_CRT_USER_ID, BC000H6_A203TBM22_UPD_DATETIME, BC000H6_n203TBM22_UPD_DATETIME, BC000H6_A204TBM22_UPD_USER_ID, BC000H6_n204TBM22_UPD_USER_ID, BC000H6_A206TBM22_UPD_CNT, BC000H6_n206TBM22_UPD_CNT,
            BC000H6_A199TBM22_DEL_FLG, BC000H6_n199TBM22_DEL_FLG, BC000H6_A202TBM22_CRT_PROG_NM, BC000H6_n202TBM22_CRT_PROG_NM, BC000H6_A205TBM22_UPD_PROG_NM, BC000H6_n205TBM22_UPD_PROG_NM, BC000H6_A197TBM22_STUDY_ID, BC000H6_A198TBM22_SITE_ID
            }
            , new Object[] {
            BC000H7_A197TBM22_STUDY_ID, BC000H7_A198TBM22_SITE_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000H11_A200TBM22_CRT_DATETIME, BC000H11_n200TBM22_CRT_DATETIME, BC000H11_A201TBM22_CRT_USER_ID, BC000H11_n201TBM22_CRT_USER_ID, BC000H11_A203TBM22_UPD_DATETIME, BC000H11_n203TBM22_UPD_DATETIME, BC000H11_A204TBM22_UPD_USER_ID, BC000H11_n204TBM22_UPD_USER_ID, BC000H11_A206TBM22_UPD_CNT, BC000H11_n206TBM22_UPD_CNT,
            BC000H11_A199TBM22_DEL_FLG, BC000H11_n199TBM22_DEL_FLG, BC000H11_A202TBM22_CRT_PROG_NM, BC000H11_n202TBM22_CRT_PROG_NM, BC000H11_A205TBM22_UPD_PROG_NM, BC000H11_n205TBM22_UPD_PROG_NM, BC000H11_A197TBM22_STUDY_ID, BC000H11_A198TBM22_SITE_ID
            }
            , new Object[] {
            BC000H12_A197TBM22_STUDY_ID
            }
            , new Object[] {
            BC000H13_A198TBM22_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM22_STUDY_SITE_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110H2 */
      e110H2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound16 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int AnyError197 ;
   private int AnyError198 ;
   private int GXActiveErrHndl ;
   private long Z197TBM22_STUDY_ID ;
   private long A197TBM22_STUDY_ID ;
   private long A206TBM22_UPD_CNT ;
   private long gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z ;
   private long gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z ;
   private long Z206TBM22_UPD_CNT ;
   private long O206TBM22_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode16 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A200TBM22_CRT_DATETIME ;
   private java.util.Date A203TBM22_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z ;
   private java.util.Date Z200TBM22_CRT_DATETIME ;
   private java.util.Date Z203TBM22_UPD_DATETIME ;
   private boolean n200TBM22_CRT_DATETIME ;
   private boolean n201TBM22_CRT_USER_ID ;
   private boolean n203TBM22_UPD_DATETIME ;
   private boolean n204TBM22_UPD_USER_ID ;
   private boolean n206TBM22_UPD_CNT ;
   private boolean n199TBM22_DEL_FLG ;
   private boolean n202TBM22_CRT_PROG_NM ;
   private boolean n205TBM22_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z198TBM22_SITE_ID ;
   private String A198TBM22_SITE_ID ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A199TBM22_DEL_FLG ;
   private String A201TBM22_CRT_USER_ID ;
   private String A202TBM22_CRT_PROG_NM ;
   private String A204TBM22_UPD_USER_ID ;
   private String A205TBM22_UPD_PROG_NM ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z ;
   private String Z201TBM22_CRT_USER_ID ;
   private String Z204TBM22_UPD_USER_ID ;
   private String Z199TBM22_DEL_FLG ;
   private String Z202TBM22_CRT_PROG_NM ;
   private String Z205TBM22_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM22_STUDY_SITE bcTBM22_STUDY_SITE ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC000H6_A200TBM22_CRT_DATETIME ;
   private boolean[] BC000H6_n200TBM22_CRT_DATETIME ;
   private String[] BC000H6_A201TBM22_CRT_USER_ID ;
   private boolean[] BC000H6_n201TBM22_CRT_USER_ID ;
   private java.util.Date[] BC000H6_A203TBM22_UPD_DATETIME ;
   private boolean[] BC000H6_n203TBM22_UPD_DATETIME ;
   private String[] BC000H6_A204TBM22_UPD_USER_ID ;
   private boolean[] BC000H6_n204TBM22_UPD_USER_ID ;
   private long[] BC000H6_A206TBM22_UPD_CNT ;
   private boolean[] BC000H6_n206TBM22_UPD_CNT ;
   private String[] BC000H6_A199TBM22_DEL_FLG ;
   private boolean[] BC000H6_n199TBM22_DEL_FLG ;
   private String[] BC000H6_A202TBM22_CRT_PROG_NM ;
   private boolean[] BC000H6_n202TBM22_CRT_PROG_NM ;
   private String[] BC000H6_A205TBM22_UPD_PROG_NM ;
   private boolean[] BC000H6_n205TBM22_UPD_PROG_NM ;
   private long[] BC000H6_A197TBM22_STUDY_ID ;
   private String[] BC000H6_A198TBM22_SITE_ID ;
   private long[] BC000H4_A197TBM22_STUDY_ID ;
   private String[] BC000H5_A198TBM22_SITE_ID ;
   private long[] BC000H7_A197TBM22_STUDY_ID ;
   private String[] BC000H7_A198TBM22_SITE_ID ;
   private java.util.Date[] BC000H3_A200TBM22_CRT_DATETIME ;
   private boolean[] BC000H3_n200TBM22_CRT_DATETIME ;
   private String[] BC000H3_A201TBM22_CRT_USER_ID ;
   private boolean[] BC000H3_n201TBM22_CRT_USER_ID ;
   private java.util.Date[] BC000H3_A203TBM22_UPD_DATETIME ;
   private boolean[] BC000H3_n203TBM22_UPD_DATETIME ;
   private String[] BC000H3_A204TBM22_UPD_USER_ID ;
   private boolean[] BC000H3_n204TBM22_UPD_USER_ID ;
   private long[] BC000H3_A206TBM22_UPD_CNT ;
   private boolean[] BC000H3_n206TBM22_UPD_CNT ;
   private String[] BC000H3_A199TBM22_DEL_FLG ;
   private boolean[] BC000H3_n199TBM22_DEL_FLG ;
   private String[] BC000H3_A202TBM22_CRT_PROG_NM ;
   private boolean[] BC000H3_n202TBM22_CRT_PROG_NM ;
   private String[] BC000H3_A205TBM22_UPD_PROG_NM ;
   private boolean[] BC000H3_n205TBM22_UPD_PROG_NM ;
   private long[] BC000H3_A197TBM22_STUDY_ID ;
   private String[] BC000H3_A198TBM22_SITE_ID ;
   private java.util.Date[] BC000H2_A200TBM22_CRT_DATETIME ;
   private boolean[] BC000H2_n200TBM22_CRT_DATETIME ;
   private String[] BC000H2_A201TBM22_CRT_USER_ID ;
   private boolean[] BC000H2_n201TBM22_CRT_USER_ID ;
   private java.util.Date[] BC000H2_A203TBM22_UPD_DATETIME ;
   private boolean[] BC000H2_n203TBM22_UPD_DATETIME ;
   private String[] BC000H2_A204TBM22_UPD_USER_ID ;
   private boolean[] BC000H2_n204TBM22_UPD_USER_ID ;
   private long[] BC000H2_A206TBM22_UPD_CNT ;
   private boolean[] BC000H2_n206TBM22_UPD_CNT ;
   private String[] BC000H2_A199TBM22_DEL_FLG ;
   private boolean[] BC000H2_n199TBM22_DEL_FLG ;
   private String[] BC000H2_A202TBM22_CRT_PROG_NM ;
   private boolean[] BC000H2_n202TBM22_CRT_PROG_NM ;
   private String[] BC000H2_A205TBM22_UPD_PROG_NM ;
   private boolean[] BC000H2_n205TBM22_UPD_PROG_NM ;
   private long[] BC000H2_A197TBM22_STUDY_ID ;
   private String[] BC000H2_A198TBM22_SITE_ID ;
   private java.util.Date[] BC000H11_A200TBM22_CRT_DATETIME ;
   private boolean[] BC000H11_n200TBM22_CRT_DATETIME ;
   private String[] BC000H11_A201TBM22_CRT_USER_ID ;
   private boolean[] BC000H11_n201TBM22_CRT_USER_ID ;
   private java.util.Date[] BC000H11_A203TBM22_UPD_DATETIME ;
   private boolean[] BC000H11_n203TBM22_UPD_DATETIME ;
   private String[] BC000H11_A204TBM22_UPD_USER_ID ;
   private boolean[] BC000H11_n204TBM22_UPD_USER_ID ;
   private long[] BC000H11_A206TBM22_UPD_CNT ;
   private boolean[] BC000H11_n206TBM22_UPD_CNT ;
   private String[] BC000H11_A199TBM22_DEL_FLG ;
   private boolean[] BC000H11_n199TBM22_DEL_FLG ;
   private String[] BC000H11_A202TBM22_CRT_PROG_NM ;
   private boolean[] BC000H11_n202TBM22_CRT_PROG_NM ;
   private String[] BC000H11_A205TBM22_UPD_PROG_NM ;
   private boolean[] BC000H11_n205TBM22_UPD_PROG_NM ;
   private long[] BC000H11_A197TBM22_STUDY_ID ;
   private String[] BC000H11_A198TBM22_SITE_ID ;
   private long[] BC000H12_A197TBM22_STUDY_ID ;
   private String[] BC000H13_A198TBM22_SITE_ID ;
}

final  class tbm22_study_site_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000H2", "SELECT `TBM22_CRT_DATETIME`, `TBM22_CRT_USER_ID`, `TBM22_UPD_DATETIME`, `TBM22_UPD_USER_ID`, `TBM22_UPD_CNT`, `TBM22_DEL_FLG`, `TBM22_CRT_PROG_NM`, `TBM22_UPD_PROG_NM`, `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000H3", "SELECT `TBM22_CRT_DATETIME`, `TBM22_CRT_USER_ID`, `TBM22_UPD_DATETIME`, `TBM22_UPD_USER_ID`, `TBM22_UPD_CNT`, `TBM22_DEL_FLG`, `TBM22_CRT_PROG_NM`, `TBM22_UPD_PROG_NM`, `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000H4", "SELECT `TBM21_STUDY_ID` AS TBM22_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000H5", "SELECT `TAM08_SITE_ID` AS TBM22_SITE_ID FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000H6", "SELECT TM1.`TBM22_CRT_DATETIME`, TM1.`TBM22_CRT_USER_ID`, TM1.`TBM22_UPD_DATETIME`, TM1.`TBM22_UPD_USER_ID`, TM1.`TBM22_UPD_CNT`, TM1.`TBM22_DEL_FLG`, TM1.`TBM22_CRT_PROG_NM`, TM1.`TBM22_UPD_PROG_NM`, TM1.`TBM22_STUDY_ID` AS TBM22_STUDY_ID, TM1.`TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` TM1 WHERE TM1.`TBM22_STUDY_ID` = ? and TM1.`TBM22_SITE_ID` = ? ORDER BY TM1.`TBM22_STUDY_ID`, TM1.`TBM22_SITE_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000H7", "SELECT `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000H8", "INSERT INTO `TBM22_STUDY_SITE` (`TBM22_CRT_DATETIME`, `TBM22_CRT_USER_ID`, `TBM22_UPD_DATETIME`, `TBM22_UPD_USER_ID`, `TBM22_UPD_CNT`, `TBM22_DEL_FLG`, `TBM22_CRT_PROG_NM`, `TBM22_UPD_PROG_NM`, `TBM22_STUDY_ID`, `TBM22_SITE_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000H9", "UPDATE `TBM22_STUDY_SITE` SET `TBM22_CRT_DATETIME`=?, `TBM22_CRT_USER_ID`=?, `TBM22_UPD_DATETIME`=?, `TBM22_UPD_USER_ID`=?, `TBM22_UPD_CNT`=?, `TBM22_DEL_FLG`=?, `TBM22_CRT_PROG_NM`=?, `TBM22_UPD_PROG_NM`=?  WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000H10", "DELETE FROM `TBM22_STUDY_SITE`  WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000H11", "SELECT TM1.`TBM22_CRT_DATETIME`, TM1.`TBM22_CRT_USER_ID`, TM1.`TBM22_UPD_DATETIME`, TM1.`TBM22_UPD_USER_ID`, TM1.`TBM22_UPD_CNT`, TM1.`TBM22_DEL_FLG`, TM1.`TBM22_CRT_PROG_NM`, TM1.`TBM22_UPD_PROG_NM`, TM1.`TBM22_STUDY_ID` AS TBM22_STUDY_ID, TM1.`TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` TM1 WHERE TM1.`TBM22_STUDY_ID` = ? and TM1.`TBM22_SITE_ID` = ? ORDER BY TM1.`TBM22_STUDY_ID`, TM1.`TBM22_SITE_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000H12", "SELECT `TBM21_STUDY_ID` AS TBM22_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000H13", "SELECT `TAM08_SITE_ID` AS TBM22_SITE_ID FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               break;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 9 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               break;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setVarchar(10, (String)parms[17], 20, false);
               break;
            case 7 :
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setVarchar(10, (String)parms[17], 20, false);
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
      }
   }

}

