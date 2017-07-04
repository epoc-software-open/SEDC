/*
               File: tbm35_crf_item_auth_bc
        Description: CRF項目権限マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:14.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm35_crf_item_auth_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm35_crf_item_auth_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm35_crf_item_auth_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm35_crf_item_auth_bc.class ));
   }

   public tbm35_crf_item_auth_bc( int remoteHandle ,
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
         /* Execute user event: e12102 */
         e12102 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z471TBM35_STUDY_ID = A471TBM35_STUDY_ID ;
            Z472TBM35_CRF_ID = A472TBM35_CRF_ID ;
            Z473TBM35_CRF_ITEM_CD = A473TBM35_CRF_ITEM_CD ;
            Z474TBM35_STUDY_AUTH_CD = A474TBM35_STUDY_AUTH_CD ;
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

   public void confirm_100( )
   {
      beforeValidate1035( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1035( ) ;
         }
         else
         {
            checkExtendedTable1035( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1035( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11102( )
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

   public void e12102( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A471TBM35_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A472TBM35_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A473TBM35_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A474TBM35_STUDY_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A475TBM35_DISPLAY_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A476TBM35_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A477TBM35_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm35_crf_item_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A478TBM35_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A479TBM35_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A480TBM35_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm35_crf_item_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A481TBM35_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A482TBM35_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A483TBM35_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1035( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z477TBM35_CRT_DATETIME = A477TBM35_CRT_DATETIME ;
         Z478TBM35_CRT_USER_ID = A478TBM35_CRT_USER_ID ;
         Z480TBM35_UPD_DATETIME = A480TBM35_UPD_DATETIME ;
         Z481TBM35_UPD_USER_ID = A481TBM35_UPD_USER_ID ;
         Z483TBM35_UPD_CNT = A483TBM35_UPD_CNT ;
         Z475TBM35_DISPLAY_FLG = A475TBM35_DISPLAY_FLG ;
         Z476TBM35_DEL_FLG = A476TBM35_DEL_FLG ;
         Z479TBM35_CRT_PROG_NM = A479TBM35_CRT_PROG_NM ;
         Z482TBM35_UPD_PROG_NM = A482TBM35_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z471TBM35_STUDY_ID = A471TBM35_STUDY_ID ;
         Z472TBM35_CRF_ID = A472TBM35_CRF_ID ;
         Z473TBM35_CRF_ITEM_CD = A473TBM35_CRF_ITEM_CD ;
         Z474TBM35_STUDY_AUTH_CD = A474TBM35_STUDY_AUTH_CD ;
         Z477TBM35_CRT_DATETIME = A477TBM35_CRT_DATETIME ;
         Z478TBM35_CRT_USER_ID = A478TBM35_CRT_USER_ID ;
         Z480TBM35_UPD_DATETIME = A480TBM35_UPD_DATETIME ;
         Z481TBM35_UPD_USER_ID = A481TBM35_UPD_USER_ID ;
         Z483TBM35_UPD_CNT = A483TBM35_UPD_CNT ;
         Z475TBM35_DISPLAY_FLG = A475TBM35_DISPLAY_FLG ;
         Z476TBM35_DEL_FLG = A476TBM35_DEL_FLG ;
         Z479TBM35_CRT_PROG_NM = A479TBM35_CRT_PROG_NM ;
         Z482TBM35_UPD_PROG_NM = A482TBM35_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1035( )
   {
      /* Using cursor BC00104 */
      pr_default.execute(2, new Object[] {new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A477TBM35_CRT_DATETIME = BC00104_A477TBM35_CRT_DATETIME[0] ;
         n477TBM35_CRT_DATETIME = BC00104_n477TBM35_CRT_DATETIME[0] ;
         A478TBM35_CRT_USER_ID = BC00104_A478TBM35_CRT_USER_ID[0] ;
         n478TBM35_CRT_USER_ID = BC00104_n478TBM35_CRT_USER_ID[0] ;
         A480TBM35_UPD_DATETIME = BC00104_A480TBM35_UPD_DATETIME[0] ;
         n480TBM35_UPD_DATETIME = BC00104_n480TBM35_UPD_DATETIME[0] ;
         A481TBM35_UPD_USER_ID = BC00104_A481TBM35_UPD_USER_ID[0] ;
         n481TBM35_UPD_USER_ID = BC00104_n481TBM35_UPD_USER_ID[0] ;
         A483TBM35_UPD_CNT = BC00104_A483TBM35_UPD_CNT[0] ;
         n483TBM35_UPD_CNT = BC00104_n483TBM35_UPD_CNT[0] ;
         A475TBM35_DISPLAY_FLG = BC00104_A475TBM35_DISPLAY_FLG[0] ;
         n475TBM35_DISPLAY_FLG = BC00104_n475TBM35_DISPLAY_FLG[0] ;
         A476TBM35_DEL_FLG = BC00104_A476TBM35_DEL_FLG[0] ;
         n476TBM35_DEL_FLG = BC00104_n476TBM35_DEL_FLG[0] ;
         A479TBM35_CRT_PROG_NM = BC00104_A479TBM35_CRT_PROG_NM[0] ;
         n479TBM35_CRT_PROG_NM = BC00104_n479TBM35_CRT_PROG_NM[0] ;
         A482TBM35_UPD_PROG_NM = BC00104_A482TBM35_UPD_PROG_NM[0] ;
         n482TBM35_UPD_PROG_NM = BC00104_n482TBM35_UPD_PROG_NM[0] ;
         zm1035( -8) ;
      }
      pr_default.close(2);
      onLoadActions1035( ) ;
   }

   public void onLoadActions1035( )
   {
      AV9Pgmname = "TBM35_CRF_ITEM_AUTH_BC" ;
   }

   public void checkExtendedTable1035( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM35_CRF_ITEM_AUTH_BC" ;
      if ( ! ( GXutil.nullDate().equals(A477TBM35_CRT_DATETIME) || (( A477TBM35_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A477TBM35_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A480TBM35_UPD_DATETIME) || (( A480TBM35_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A480TBM35_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1035( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1035( )
   {
      /* Using cursor BC00105 */
      pr_default.execute(3, new Object[] {new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00103 */
      pr_default.execute(1, new Object[] {new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1035( 8) ;
         RcdFound35 = (short)(1) ;
         A471TBM35_STUDY_ID = BC00103_A471TBM35_STUDY_ID[0] ;
         A472TBM35_CRF_ID = BC00103_A472TBM35_CRF_ID[0] ;
         A473TBM35_CRF_ITEM_CD = BC00103_A473TBM35_CRF_ITEM_CD[0] ;
         A474TBM35_STUDY_AUTH_CD = BC00103_A474TBM35_STUDY_AUTH_CD[0] ;
         A477TBM35_CRT_DATETIME = BC00103_A477TBM35_CRT_DATETIME[0] ;
         n477TBM35_CRT_DATETIME = BC00103_n477TBM35_CRT_DATETIME[0] ;
         A478TBM35_CRT_USER_ID = BC00103_A478TBM35_CRT_USER_ID[0] ;
         n478TBM35_CRT_USER_ID = BC00103_n478TBM35_CRT_USER_ID[0] ;
         A480TBM35_UPD_DATETIME = BC00103_A480TBM35_UPD_DATETIME[0] ;
         n480TBM35_UPD_DATETIME = BC00103_n480TBM35_UPD_DATETIME[0] ;
         A481TBM35_UPD_USER_ID = BC00103_A481TBM35_UPD_USER_ID[0] ;
         n481TBM35_UPD_USER_ID = BC00103_n481TBM35_UPD_USER_ID[0] ;
         A483TBM35_UPD_CNT = BC00103_A483TBM35_UPD_CNT[0] ;
         n483TBM35_UPD_CNT = BC00103_n483TBM35_UPD_CNT[0] ;
         A475TBM35_DISPLAY_FLG = BC00103_A475TBM35_DISPLAY_FLG[0] ;
         n475TBM35_DISPLAY_FLG = BC00103_n475TBM35_DISPLAY_FLG[0] ;
         A476TBM35_DEL_FLG = BC00103_A476TBM35_DEL_FLG[0] ;
         n476TBM35_DEL_FLG = BC00103_n476TBM35_DEL_FLG[0] ;
         A479TBM35_CRT_PROG_NM = BC00103_A479TBM35_CRT_PROG_NM[0] ;
         n479TBM35_CRT_PROG_NM = BC00103_n479TBM35_CRT_PROG_NM[0] ;
         A482TBM35_UPD_PROG_NM = BC00103_A482TBM35_UPD_PROG_NM[0] ;
         n482TBM35_UPD_PROG_NM = BC00103_n482TBM35_UPD_PROG_NM[0] ;
         O483TBM35_UPD_CNT = A483TBM35_UPD_CNT ;
         n483TBM35_UPD_CNT = false ;
         Z471TBM35_STUDY_ID = A471TBM35_STUDY_ID ;
         Z472TBM35_CRF_ID = A472TBM35_CRF_ID ;
         Z473TBM35_CRF_ITEM_CD = A473TBM35_CRF_ITEM_CD ;
         Z474TBM35_STUDY_AUTH_CD = A474TBM35_STUDY_AUTH_CD ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1035( ) ;
         Gx_mode = sMode35 ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey1035( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode35 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1035( ) ;
      if ( RcdFound35 == 0 )
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
      confirm_100( ) ;
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

   public void checkOptimisticConcurrency1035( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00102 */
         pr_default.execute(0, new Object[] {new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM35_CRF_ITEM_AUTH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z477TBM35_CRT_DATETIME.equals( BC00102_A477TBM35_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z478TBM35_CRT_USER_ID, BC00102_A478TBM35_CRT_USER_ID[0]) != 0 ) || !( Z480TBM35_UPD_DATETIME.equals( BC00102_A480TBM35_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z481TBM35_UPD_USER_ID, BC00102_A481TBM35_UPD_USER_ID[0]) != 0 ) || ( Z483TBM35_UPD_CNT != BC00102_A483TBM35_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z475TBM35_DISPLAY_FLG, BC00102_A475TBM35_DISPLAY_FLG[0]) != 0 ) || ( GXutil.strcmp(Z476TBM35_DEL_FLG, BC00102_A476TBM35_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z479TBM35_CRT_PROG_NM, BC00102_A479TBM35_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z482TBM35_UPD_PROG_NM, BC00102_A482TBM35_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM35_CRF_ITEM_AUTH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1035( )
   {
      beforeValidate1035( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1035( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1035( 0) ;
         checkOptimisticConcurrency1035( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1035( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1035( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00106 */
                  pr_default.execute(4, new Object[] {new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD, new Boolean(n477TBM35_CRT_DATETIME), A477TBM35_CRT_DATETIME, new Boolean(n478TBM35_CRT_USER_ID), A478TBM35_CRT_USER_ID, new Boolean(n480TBM35_UPD_DATETIME), A480TBM35_UPD_DATETIME, new Boolean(n481TBM35_UPD_USER_ID), A481TBM35_UPD_USER_ID, new Boolean(n483TBM35_UPD_CNT), new Long(A483TBM35_UPD_CNT), new Boolean(n475TBM35_DISPLAY_FLG), A475TBM35_DISPLAY_FLG, new Boolean(n476TBM35_DEL_FLG), A476TBM35_DEL_FLG, new Boolean(n479TBM35_CRT_PROG_NM), A479TBM35_CRT_PROG_NM, new Boolean(n482TBM35_UPD_PROG_NM), A482TBM35_UPD_PROG_NM});
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
            load1035( ) ;
         }
         endLevel1035( ) ;
      }
      closeExtendedTableCursors1035( ) ;
   }

   public void update1035( )
   {
      beforeValidate1035( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1035( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1035( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1035( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1035( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00107 */
                  pr_default.execute(5, new Object[] {new Boolean(n477TBM35_CRT_DATETIME), A477TBM35_CRT_DATETIME, new Boolean(n478TBM35_CRT_USER_ID), A478TBM35_CRT_USER_ID, new Boolean(n480TBM35_UPD_DATETIME), A480TBM35_UPD_DATETIME, new Boolean(n481TBM35_UPD_USER_ID), A481TBM35_UPD_USER_ID, new Boolean(n483TBM35_UPD_CNT), new Long(A483TBM35_UPD_CNT), new Boolean(n475TBM35_DISPLAY_FLG), A475TBM35_DISPLAY_FLG, new Boolean(n476TBM35_DEL_FLG), A476TBM35_DEL_FLG, new Boolean(n479TBM35_CRT_PROG_NM), A479TBM35_CRT_PROG_NM, new Boolean(n482TBM35_UPD_PROG_NM), A482TBM35_UPD_PROG_NM, new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM35_CRF_ITEM_AUTH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1035( ) ;
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
         endLevel1035( ) ;
      }
      closeExtendedTableCursors1035( ) ;
   }

   public void deferredUpdate1035( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1035( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1035( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1035( ) ;
         afterConfirm1035( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1035( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00108 */
               pr_default.execute(6, new Object[] {new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD});
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
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1035( ) ;
      Gx_mode = sMode35 ;
   }

   public void onDeleteControls1035( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM35_CRF_ITEM_AUTH_BC" ;
      }
   }

   public void endLevel1035( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1035( ) ;
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

   public void scanKeyStart1035( )
   {
      /* Using cursor BC00109 */
      pr_default.execute(7, new Object[] {new Long(A471TBM35_STUDY_ID), new Short(A472TBM35_CRF_ID), A473TBM35_CRF_ITEM_CD, A474TBM35_STUDY_AUTH_CD});
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A471TBM35_STUDY_ID = BC00109_A471TBM35_STUDY_ID[0] ;
         A472TBM35_CRF_ID = BC00109_A472TBM35_CRF_ID[0] ;
         A473TBM35_CRF_ITEM_CD = BC00109_A473TBM35_CRF_ITEM_CD[0] ;
         A474TBM35_STUDY_AUTH_CD = BC00109_A474TBM35_STUDY_AUTH_CD[0] ;
         A477TBM35_CRT_DATETIME = BC00109_A477TBM35_CRT_DATETIME[0] ;
         n477TBM35_CRT_DATETIME = BC00109_n477TBM35_CRT_DATETIME[0] ;
         A478TBM35_CRT_USER_ID = BC00109_A478TBM35_CRT_USER_ID[0] ;
         n478TBM35_CRT_USER_ID = BC00109_n478TBM35_CRT_USER_ID[0] ;
         A480TBM35_UPD_DATETIME = BC00109_A480TBM35_UPD_DATETIME[0] ;
         n480TBM35_UPD_DATETIME = BC00109_n480TBM35_UPD_DATETIME[0] ;
         A481TBM35_UPD_USER_ID = BC00109_A481TBM35_UPD_USER_ID[0] ;
         n481TBM35_UPD_USER_ID = BC00109_n481TBM35_UPD_USER_ID[0] ;
         A483TBM35_UPD_CNT = BC00109_A483TBM35_UPD_CNT[0] ;
         n483TBM35_UPD_CNT = BC00109_n483TBM35_UPD_CNT[0] ;
         A475TBM35_DISPLAY_FLG = BC00109_A475TBM35_DISPLAY_FLG[0] ;
         n475TBM35_DISPLAY_FLG = BC00109_n475TBM35_DISPLAY_FLG[0] ;
         A476TBM35_DEL_FLG = BC00109_A476TBM35_DEL_FLG[0] ;
         n476TBM35_DEL_FLG = BC00109_n476TBM35_DEL_FLG[0] ;
         A479TBM35_CRT_PROG_NM = BC00109_A479TBM35_CRT_PROG_NM[0] ;
         n479TBM35_CRT_PROG_NM = BC00109_n479TBM35_CRT_PROG_NM[0] ;
         A482TBM35_UPD_PROG_NM = BC00109_A482TBM35_UPD_PROG_NM[0] ;
         n482TBM35_UPD_PROG_NM = BC00109_n482TBM35_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1035( )
   {
      pr_default.readNext(7);
      RcdFound35 = (short)(0) ;
      scanKeyLoad1035( ) ;
   }

   public void scanKeyLoad1035( )
   {
      sMode35 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A471TBM35_STUDY_ID = BC00109_A471TBM35_STUDY_ID[0] ;
         A472TBM35_CRF_ID = BC00109_A472TBM35_CRF_ID[0] ;
         A473TBM35_CRF_ITEM_CD = BC00109_A473TBM35_CRF_ITEM_CD[0] ;
         A474TBM35_STUDY_AUTH_CD = BC00109_A474TBM35_STUDY_AUTH_CD[0] ;
         A477TBM35_CRT_DATETIME = BC00109_A477TBM35_CRT_DATETIME[0] ;
         n477TBM35_CRT_DATETIME = BC00109_n477TBM35_CRT_DATETIME[0] ;
         A478TBM35_CRT_USER_ID = BC00109_A478TBM35_CRT_USER_ID[0] ;
         n478TBM35_CRT_USER_ID = BC00109_n478TBM35_CRT_USER_ID[0] ;
         A480TBM35_UPD_DATETIME = BC00109_A480TBM35_UPD_DATETIME[0] ;
         n480TBM35_UPD_DATETIME = BC00109_n480TBM35_UPD_DATETIME[0] ;
         A481TBM35_UPD_USER_ID = BC00109_A481TBM35_UPD_USER_ID[0] ;
         n481TBM35_UPD_USER_ID = BC00109_n481TBM35_UPD_USER_ID[0] ;
         A483TBM35_UPD_CNT = BC00109_A483TBM35_UPD_CNT[0] ;
         n483TBM35_UPD_CNT = BC00109_n483TBM35_UPD_CNT[0] ;
         A475TBM35_DISPLAY_FLG = BC00109_A475TBM35_DISPLAY_FLG[0] ;
         n475TBM35_DISPLAY_FLG = BC00109_n475TBM35_DISPLAY_FLG[0] ;
         A476TBM35_DEL_FLG = BC00109_A476TBM35_DEL_FLG[0] ;
         n476TBM35_DEL_FLG = BC00109_n476TBM35_DEL_FLG[0] ;
         A479TBM35_CRT_PROG_NM = BC00109_A479TBM35_CRT_PROG_NM[0] ;
         n479TBM35_CRT_PROG_NM = BC00109_n479TBM35_CRT_PROG_NM[0] ;
         A482TBM35_UPD_PROG_NM = BC00109_A482TBM35_UPD_PROG_NM[0] ;
         n482TBM35_UPD_PROG_NM = BC00109_n482TBM35_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode35 ;
   }

   public void scanKeyEnd1035( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1035( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1035( )
   {
      /* Before Insert Rules */
      A477TBM35_CRT_DATETIME = GXutil.now( ) ;
      n477TBM35_CRT_DATETIME = false ;
      GXt_char1 = A478TBM35_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm35_crf_item_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      A478TBM35_CRT_USER_ID = GXt_char1 ;
      n478TBM35_CRT_USER_ID = false ;
      A480TBM35_UPD_DATETIME = GXutil.now( ) ;
      n480TBM35_UPD_DATETIME = false ;
      GXt_char1 = A481TBM35_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm35_crf_item_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      A481TBM35_UPD_USER_ID = GXt_char1 ;
      n481TBM35_UPD_USER_ID = false ;
      A483TBM35_UPD_CNT = (long)(O483TBM35_UPD_CNT+1) ;
      n483TBM35_UPD_CNT = false ;
   }

   public void beforeUpdate1035( )
   {
      /* Before Update Rules */
      A480TBM35_UPD_DATETIME = GXutil.now( ) ;
      n480TBM35_UPD_DATETIME = false ;
      GXt_char1 = A481TBM35_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm35_crf_item_auth_bc.this.GXt_char1 = GXv_char2[0] ;
      A481TBM35_UPD_USER_ID = GXt_char1 ;
      n481TBM35_UPD_USER_ID = false ;
      A483TBM35_UPD_CNT = (long)(O483TBM35_UPD_CNT+1) ;
      n483TBM35_UPD_CNT = false ;
   }

   public void beforeDelete1035( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1035( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1035( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1035( )
   {
   }

   public void addRow1035( )
   {
      VarsToRow35( bcTBM35_CRF_ITEM_AUTH) ;
   }

   public void readRow1035( )
   {
      RowToVars35( bcTBM35_CRF_ITEM_AUTH, 1) ;
   }

   public void initializeNonKey1035( )
   {
      A477TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n477TBM35_CRT_DATETIME = false ;
      A478TBM35_CRT_USER_ID = "" ;
      n478TBM35_CRT_USER_ID = false ;
      A480TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n480TBM35_UPD_DATETIME = false ;
      A481TBM35_UPD_USER_ID = "" ;
      n481TBM35_UPD_USER_ID = false ;
      A483TBM35_UPD_CNT = 0 ;
      n483TBM35_UPD_CNT = false ;
      A475TBM35_DISPLAY_FLG = "" ;
      n475TBM35_DISPLAY_FLG = false ;
      A476TBM35_DEL_FLG = "" ;
      n476TBM35_DEL_FLG = false ;
      A479TBM35_CRT_PROG_NM = "" ;
      n479TBM35_CRT_PROG_NM = false ;
      A482TBM35_UPD_PROG_NM = "" ;
      n482TBM35_UPD_PROG_NM = false ;
      O483TBM35_UPD_CNT = A483TBM35_UPD_CNT ;
      n483TBM35_UPD_CNT = false ;
   }

   public void initAll1035( )
   {
      A471TBM35_STUDY_ID = 0 ;
      A472TBM35_CRF_ID = (short)(0) ;
      A473TBM35_CRF_ITEM_CD = "" ;
      A474TBM35_STUDY_AUTH_CD = "" ;
      initializeNonKey1035( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow35( SdtTBM35_CRF_ITEM_AUTH obj35 )
   {
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode( Gx_mode );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime( A477TBM35_CRT_DATETIME );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id( A478TBM35_CRT_USER_ID );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime( A480TBM35_UPD_DATETIME );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id( A481TBM35_UPD_USER_ID );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt( A483TBM35_UPD_CNT );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg( A475TBM35_DISPLAY_FLG );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg( A476TBM35_DEL_FLG );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm( A479TBM35_CRT_PROG_NM );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm( A482TBM35_UPD_PROG_NM );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_id( A471TBM35_STUDY_ID );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_id( A472TBM35_CRF_ID );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_item_cd( A473TBM35_CRF_ITEM_CD );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_auth_cd( A474TBM35_STUDY_AUTH_CD );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_id_Z( Z471TBM35_STUDY_ID );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_id_Z( Z472TBM35_CRF_ID );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_item_cd_Z( Z473TBM35_CRF_ITEM_CD );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_auth_cd_Z( Z474TBM35_STUDY_AUTH_CD );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg_Z( Z475TBM35_DISPLAY_FLG );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg_Z( Z476TBM35_DEL_FLG );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime_Z( Z477TBM35_CRT_DATETIME );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id_Z( Z478TBM35_CRT_USER_ID );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm_Z( Z479TBM35_CRT_PROG_NM );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime_Z( Z480TBM35_UPD_DATETIME );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id_Z( Z481TBM35_UPD_USER_ID );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm_Z( Z482TBM35_UPD_PROG_NM );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt_Z( Z483TBM35_UPD_CNT );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg_N( (byte)((byte)((n475TBM35_DISPLAY_FLG)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg_N( (byte)((byte)((n476TBM35_DEL_FLG)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime_N( (byte)((byte)((n477TBM35_CRT_DATETIME)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id_N( (byte)((byte)((n478TBM35_CRT_USER_ID)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm_N( (byte)((byte)((n479TBM35_CRT_PROG_NM)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime_N( (byte)((byte)((n480TBM35_UPD_DATETIME)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id_N( (byte)((byte)((n481TBM35_UPD_USER_ID)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm_N( (byte)((byte)((n482TBM35_UPD_PROG_NM)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt_N( (byte)((byte)((n483TBM35_UPD_CNT)?1:0)) );
      obj35.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode( Gx_mode );
   }

   public void RowToVars35( SdtTBM35_CRF_ITEM_AUTH obj35 ,
                            int forceLoad )
   {
      Gx_mode = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode() ;
      A477TBM35_CRT_DATETIME = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime() ;
      n477TBM35_CRT_DATETIME = false ;
      A478TBM35_CRT_USER_ID = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id() ;
      n478TBM35_CRT_USER_ID = false ;
      A480TBM35_UPD_DATETIME = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime() ;
      n480TBM35_UPD_DATETIME = false ;
      A481TBM35_UPD_USER_ID = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id() ;
      n481TBM35_UPD_USER_ID = false ;
      A483TBM35_UPD_CNT = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt() ;
      n483TBM35_UPD_CNT = false ;
      A475TBM35_DISPLAY_FLG = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg() ;
      n475TBM35_DISPLAY_FLG = false ;
      A476TBM35_DEL_FLG = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg() ;
      n476TBM35_DEL_FLG = false ;
      A479TBM35_CRT_PROG_NM = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm() ;
      n479TBM35_CRT_PROG_NM = false ;
      A482TBM35_UPD_PROG_NM = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm() ;
      n482TBM35_UPD_PROG_NM = false ;
      A471TBM35_STUDY_ID = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_id() ;
      A472TBM35_CRF_ID = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_id() ;
      A473TBM35_CRF_ITEM_CD = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_item_cd() ;
      A474TBM35_STUDY_AUTH_CD = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_auth_cd() ;
      Z471TBM35_STUDY_ID = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_id_Z() ;
      Z472TBM35_CRF_ID = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_id_Z() ;
      Z473TBM35_CRF_ITEM_CD = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_item_cd_Z() ;
      Z474TBM35_STUDY_AUTH_CD = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_auth_cd_Z() ;
      Z475TBM35_DISPLAY_FLG = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg_Z() ;
      Z476TBM35_DEL_FLG = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg_Z() ;
      Z477TBM35_CRT_DATETIME = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime_Z() ;
      Z478TBM35_CRT_USER_ID = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id_Z() ;
      Z479TBM35_CRT_PROG_NM = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm_Z() ;
      Z480TBM35_UPD_DATETIME = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime_Z() ;
      Z481TBM35_UPD_USER_ID = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id_Z() ;
      Z482TBM35_UPD_PROG_NM = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm_Z() ;
      Z483TBM35_UPD_CNT = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt_Z() ;
      O483TBM35_UPD_CNT = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt_Z() ;
      n475TBM35_DISPLAY_FLG = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg_N()==0)?false:true) ;
      n476TBM35_DEL_FLG = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg_N()==0)?false:true) ;
      n477TBM35_CRT_DATETIME = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime_N()==0)?false:true) ;
      n478TBM35_CRT_USER_ID = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id_N()==0)?false:true) ;
      n479TBM35_CRT_PROG_NM = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm_N()==0)?false:true) ;
      n480TBM35_UPD_DATETIME = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime_N()==0)?false:true) ;
      n481TBM35_UPD_USER_ID = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id_N()==0)?false:true) ;
      n482TBM35_UPD_PROG_NM = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm_N()==0)?false:true) ;
      n483TBM35_UPD_CNT = (boolean)((obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj35.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A471TBM35_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A472TBM35_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      A473TBM35_CRF_ITEM_CD = (String)getParm(obj,2) ;
      A474TBM35_STUDY_AUTH_CD = (String)getParm(obj,3) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1035( ) ;
      scanKeyStart1035( ) ;
      if ( RcdFound35 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z471TBM35_STUDY_ID = A471TBM35_STUDY_ID ;
         Z472TBM35_CRF_ID = A472TBM35_CRF_ID ;
         Z473TBM35_CRF_ITEM_CD = A473TBM35_CRF_ITEM_CD ;
         Z474TBM35_STUDY_AUTH_CD = A474TBM35_STUDY_AUTH_CD ;
         O483TBM35_UPD_CNT = A483TBM35_UPD_CNT ;
         n483TBM35_UPD_CNT = false ;
      }
      zm1035( -8) ;
      sMode35 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1035( ) ;
      Gx_mode = sMode35 ;
      addRow1035( ) ;
      scanKeyEnd1035( ) ;
      if ( RcdFound35 == 0 )
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
      RowToVars35( bcTBM35_CRF_ITEM_AUTH, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1035( ) ;
      if ( RcdFound35 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A471TBM35_STUDY_ID != Z471TBM35_STUDY_ID ) || ( A472TBM35_CRF_ID != Z472TBM35_CRF_ID ) || ( GXutil.strcmp(A473TBM35_CRF_ITEM_CD, Z473TBM35_CRF_ITEM_CD) != 0 ) || ( GXutil.strcmp(A474TBM35_STUDY_AUTH_CD, Z474TBM35_STUDY_AUTH_CD) != 0 ) )
         {
            A471TBM35_STUDY_ID = Z471TBM35_STUDY_ID ;
            A472TBM35_CRF_ID = Z472TBM35_CRF_ID ;
            A473TBM35_CRF_ITEM_CD = Z473TBM35_CRF_ITEM_CD ;
            A474TBM35_STUDY_AUTH_CD = Z474TBM35_STUDY_AUTH_CD ;
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
            update1035( ) ;
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
            if ( ( A471TBM35_STUDY_ID != Z471TBM35_STUDY_ID ) || ( A472TBM35_CRF_ID != Z472TBM35_CRF_ID ) || ( GXutil.strcmp(A473TBM35_CRF_ITEM_CD, Z473TBM35_CRF_ITEM_CD) != 0 ) || ( GXutil.strcmp(A474TBM35_STUDY_AUTH_CD, Z474TBM35_STUDY_AUTH_CD) != 0 ) )
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
                  insert1035( ) ;
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
                  insert1035( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow35( bcTBM35_CRF_ITEM_AUTH) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars35( bcTBM35_CRF_ITEM_AUTH, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1035( ) ;
      if ( RcdFound35 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A471TBM35_STUDY_ID != Z471TBM35_STUDY_ID ) || ( A472TBM35_CRF_ID != Z472TBM35_CRF_ID ) || ( GXutil.strcmp(A473TBM35_CRF_ITEM_CD, Z473TBM35_CRF_ITEM_CD) != 0 ) || ( GXutil.strcmp(A474TBM35_STUDY_AUTH_CD, Z474TBM35_STUDY_AUTH_CD) != 0 ) )
         {
            A471TBM35_STUDY_ID = Z471TBM35_STUDY_ID ;
            A472TBM35_CRF_ID = Z472TBM35_CRF_ID ;
            A473TBM35_CRF_ITEM_CD = Z473TBM35_CRF_ITEM_CD ;
            A474TBM35_STUDY_AUTH_CD = Z474TBM35_STUDY_AUTH_CD ;
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
         if ( ( A471TBM35_STUDY_ID != Z471TBM35_STUDY_ID ) || ( A472TBM35_CRF_ID != Z472TBM35_CRF_ID ) || ( GXutil.strcmp(A473TBM35_CRF_ITEM_CD, Z473TBM35_CRF_ITEM_CD) != 0 ) || ( GXutil.strcmp(A474TBM35_STUDY_AUTH_CD, Z474TBM35_STUDY_AUTH_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm35_crf_item_auth_bc");
      VarsToRow35( bcTBM35_CRF_ITEM_AUTH) ;
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
      Gx_mode = bcTBM35_CRF_ITEM_AUTH.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM35_CRF_ITEM_AUTH sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM35_CRF_ITEM_AUTH )
      {
         bcTBM35_CRF_ITEM_AUTH = sdt ;
         if ( GXutil.strcmp(bcTBM35_CRF_ITEM_AUTH.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode(), "") == 0 )
         {
            bcTBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow35( bcTBM35_CRF_ITEM_AUTH) ;
         }
         else
         {
            RowToVars35( bcTBM35_CRF_ITEM_AUTH, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM35_CRF_ITEM_AUTH.getgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode(), "") == 0 )
         {
            bcTBM35_CRF_ITEM_AUTH.setgxTv_SdtTBM35_CRF_ITEM_AUTH_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars35( bcTBM35_CRF_ITEM_AUTH, 1) ;
   }

   public SdtTBM35_CRF_ITEM_AUTH getTBM35_CRF_ITEM_AUTH_BC( )
   {
      return bcTBM35_CRF_ITEM_AUTH ;
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
      Z473TBM35_CRF_ITEM_CD = "" ;
      A473TBM35_CRF_ITEM_CD = "" ;
      Z474TBM35_STUDY_AUTH_CD = "" ;
      A474TBM35_STUDY_AUTH_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A475TBM35_DISPLAY_FLG = "" ;
      A476TBM35_DEL_FLG = "" ;
      A477TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A478TBM35_CRT_USER_ID = "" ;
      A479TBM35_CRT_PROG_NM = "" ;
      A480TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A481TBM35_UPD_USER_ID = "" ;
      A482TBM35_UPD_PROG_NM = "" ;
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_item_cd_Z = "" ;
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_auth_cd_Z = "" ;
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg_Z = "" ;
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg_Z = "" ;
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id_Z = "" ;
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id_Z = "" ;
      gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm_Z = "" ;
      Z477TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z478TBM35_CRT_USER_ID = "" ;
      Z480TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z481TBM35_UPD_USER_ID = "" ;
      Z475TBM35_DISPLAY_FLG = "" ;
      Z476TBM35_DEL_FLG = "" ;
      Z479TBM35_CRT_PROG_NM = "" ;
      Z482TBM35_UPD_PROG_NM = "" ;
      BC00104_A471TBM35_STUDY_ID = new long[1] ;
      BC00104_A472TBM35_CRF_ID = new short[1] ;
      BC00104_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      BC00104_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      BC00104_A477TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00104_n477TBM35_CRT_DATETIME = new boolean[] {false} ;
      BC00104_A478TBM35_CRT_USER_ID = new String[] {""} ;
      BC00104_n478TBM35_CRT_USER_ID = new boolean[] {false} ;
      BC00104_A480TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00104_n480TBM35_UPD_DATETIME = new boolean[] {false} ;
      BC00104_A481TBM35_UPD_USER_ID = new String[] {""} ;
      BC00104_n481TBM35_UPD_USER_ID = new boolean[] {false} ;
      BC00104_A483TBM35_UPD_CNT = new long[1] ;
      BC00104_n483TBM35_UPD_CNT = new boolean[] {false} ;
      BC00104_A475TBM35_DISPLAY_FLG = new String[] {""} ;
      BC00104_n475TBM35_DISPLAY_FLG = new boolean[] {false} ;
      BC00104_A476TBM35_DEL_FLG = new String[] {""} ;
      BC00104_n476TBM35_DEL_FLG = new boolean[] {false} ;
      BC00104_A479TBM35_CRT_PROG_NM = new String[] {""} ;
      BC00104_n479TBM35_CRT_PROG_NM = new boolean[] {false} ;
      BC00104_A482TBM35_UPD_PROG_NM = new String[] {""} ;
      BC00104_n482TBM35_UPD_PROG_NM = new boolean[] {false} ;
      BC00105_A471TBM35_STUDY_ID = new long[1] ;
      BC00105_A472TBM35_CRF_ID = new short[1] ;
      BC00105_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      BC00105_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      BC00103_A471TBM35_STUDY_ID = new long[1] ;
      BC00103_A472TBM35_CRF_ID = new short[1] ;
      BC00103_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      BC00103_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      BC00103_A477TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00103_n477TBM35_CRT_DATETIME = new boolean[] {false} ;
      BC00103_A478TBM35_CRT_USER_ID = new String[] {""} ;
      BC00103_n478TBM35_CRT_USER_ID = new boolean[] {false} ;
      BC00103_A480TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00103_n480TBM35_UPD_DATETIME = new boolean[] {false} ;
      BC00103_A481TBM35_UPD_USER_ID = new String[] {""} ;
      BC00103_n481TBM35_UPD_USER_ID = new boolean[] {false} ;
      BC00103_A483TBM35_UPD_CNT = new long[1] ;
      BC00103_n483TBM35_UPD_CNT = new boolean[] {false} ;
      BC00103_A475TBM35_DISPLAY_FLG = new String[] {""} ;
      BC00103_n475TBM35_DISPLAY_FLG = new boolean[] {false} ;
      BC00103_A476TBM35_DEL_FLG = new String[] {""} ;
      BC00103_n476TBM35_DEL_FLG = new boolean[] {false} ;
      BC00103_A479TBM35_CRT_PROG_NM = new String[] {""} ;
      BC00103_n479TBM35_CRT_PROG_NM = new boolean[] {false} ;
      BC00103_A482TBM35_UPD_PROG_NM = new String[] {""} ;
      BC00103_n482TBM35_UPD_PROG_NM = new boolean[] {false} ;
      sMode35 = "" ;
      BC00102_A471TBM35_STUDY_ID = new long[1] ;
      BC00102_A472TBM35_CRF_ID = new short[1] ;
      BC00102_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      BC00102_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      BC00102_A477TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00102_n477TBM35_CRT_DATETIME = new boolean[] {false} ;
      BC00102_A478TBM35_CRT_USER_ID = new String[] {""} ;
      BC00102_n478TBM35_CRT_USER_ID = new boolean[] {false} ;
      BC00102_A480TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00102_n480TBM35_UPD_DATETIME = new boolean[] {false} ;
      BC00102_A481TBM35_UPD_USER_ID = new String[] {""} ;
      BC00102_n481TBM35_UPD_USER_ID = new boolean[] {false} ;
      BC00102_A483TBM35_UPD_CNT = new long[1] ;
      BC00102_n483TBM35_UPD_CNT = new boolean[] {false} ;
      BC00102_A475TBM35_DISPLAY_FLG = new String[] {""} ;
      BC00102_n475TBM35_DISPLAY_FLG = new boolean[] {false} ;
      BC00102_A476TBM35_DEL_FLG = new String[] {""} ;
      BC00102_n476TBM35_DEL_FLG = new boolean[] {false} ;
      BC00102_A479TBM35_CRT_PROG_NM = new String[] {""} ;
      BC00102_n479TBM35_CRT_PROG_NM = new boolean[] {false} ;
      BC00102_A482TBM35_UPD_PROG_NM = new String[] {""} ;
      BC00102_n482TBM35_UPD_PROG_NM = new boolean[] {false} ;
      BC00109_A471TBM35_STUDY_ID = new long[1] ;
      BC00109_A472TBM35_CRF_ID = new short[1] ;
      BC00109_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      BC00109_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      BC00109_A477TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00109_n477TBM35_CRT_DATETIME = new boolean[] {false} ;
      BC00109_A478TBM35_CRT_USER_ID = new String[] {""} ;
      BC00109_n478TBM35_CRT_USER_ID = new boolean[] {false} ;
      BC00109_A480TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00109_n480TBM35_UPD_DATETIME = new boolean[] {false} ;
      BC00109_A481TBM35_UPD_USER_ID = new String[] {""} ;
      BC00109_n481TBM35_UPD_USER_ID = new boolean[] {false} ;
      BC00109_A483TBM35_UPD_CNT = new long[1] ;
      BC00109_n483TBM35_UPD_CNT = new boolean[] {false} ;
      BC00109_A475TBM35_DISPLAY_FLG = new String[] {""} ;
      BC00109_n475TBM35_DISPLAY_FLG = new boolean[] {false} ;
      BC00109_A476TBM35_DEL_FLG = new String[] {""} ;
      BC00109_n476TBM35_DEL_FLG = new boolean[] {false} ;
      BC00109_A479TBM35_CRT_PROG_NM = new String[] {""} ;
      BC00109_n479TBM35_CRT_PROG_NM = new boolean[] {false} ;
      BC00109_A482TBM35_UPD_PROG_NM = new String[] {""} ;
      BC00109_n482TBM35_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm35_crf_item_auth_bc__default(),
         new Object[] {
             new Object[] {
            BC00102_A471TBM35_STUDY_ID, BC00102_A472TBM35_CRF_ID, BC00102_A473TBM35_CRF_ITEM_CD, BC00102_A474TBM35_STUDY_AUTH_CD, BC00102_A477TBM35_CRT_DATETIME, BC00102_n477TBM35_CRT_DATETIME, BC00102_A478TBM35_CRT_USER_ID, BC00102_n478TBM35_CRT_USER_ID, BC00102_A480TBM35_UPD_DATETIME, BC00102_n480TBM35_UPD_DATETIME,
            BC00102_A481TBM35_UPD_USER_ID, BC00102_n481TBM35_UPD_USER_ID, BC00102_A483TBM35_UPD_CNT, BC00102_n483TBM35_UPD_CNT, BC00102_A475TBM35_DISPLAY_FLG, BC00102_n475TBM35_DISPLAY_FLG, BC00102_A476TBM35_DEL_FLG, BC00102_n476TBM35_DEL_FLG, BC00102_A479TBM35_CRT_PROG_NM, BC00102_n479TBM35_CRT_PROG_NM,
            BC00102_A482TBM35_UPD_PROG_NM, BC00102_n482TBM35_UPD_PROG_NM
            }
            , new Object[] {
            BC00103_A471TBM35_STUDY_ID, BC00103_A472TBM35_CRF_ID, BC00103_A473TBM35_CRF_ITEM_CD, BC00103_A474TBM35_STUDY_AUTH_CD, BC00103_A477TBM35_CRT_DATETIME, BC00103_n477TBM35_CRT_DATETIME, BC00103_A478TBM35_CRT_USER_ID, BC00103_n478TBM35_CRT_USER_ID, BC00103_A480TBM35_UPD_DATETIME, BC00103_n480TBM35_UPD_DATETIME,
            BC00103_A481TBM35_UPD_USER_ID, BC00103_n481TBM35_UPD_USER_ID, BC00103_A483TBM35_UPD_CNT, BC00103_n483TBM35_UPD_CNT, BC00103_A475TBM35_DISPLAY_FLG, BC00103_n475TBM35_DISPLAY_FLG, BC00103_A476TBM35_DEL_FLG, BC00103_n476TBM35_DEL_FLG, BC00103_A479TBM35_CRT_PROG_NM, BC00103_n479TBM35_CRT_PROG_NM,
            BC00103_A482TBM35_UPD_PROG_NM, BC00103_n482TBM35_UPD_PROG_NM
            }
            , new Object[] {
            BC00104_A471TBM35_STUDY_ID, BC00104_A472TBM35_CRF_ID, BC00104_A473TBM35_CRF_ITEM_CD, BC00104_A474TBM35_STUDY_AUTH_CD, BC00104_A477TBM35_CRT_DATETIME, BC00104_n477TBM35_CRT_DATETIME, BC00104_A478TBM35_CRT_USER_ID, BC00104_n478TBM35_CRT_USER_ID, BC00104_A480TBM35_UPD_DATETIME, BC00104_n480TBM35_UPD_DATETIME,
            BC00104_A481TBM35_UPD_USER_ID, BC00104_n481TBM35_UPD_USER_ID, BC00104_A483TBM35_UPD_CNT, BC00104_n483TBM35_UPD_CNT, BC00104_A475TBM35_DISPLAY_FLG, BC00104_n475TBM35_DISPLAY_FLG, BC00104_A476TBM35_DEL_FLG, BC00104_n476TBM35_DEL_FLG, BC00104_A479TBM35_CRT_PROG_NM, BC00104_n479TBM35_CRT_PROG_NM,
            BC00104_A482TBM35_UPD_PROG_NM, BC00104_n482TBM35_UPD_PROG_NM
            }
            , new Object[] {
            BC00105_A471TBM35_STUDY_ID, BC00105_A472TBM35_CRF_ID, BC00105_A473TBM35_CRF_ITEM_CD, BC00105_A474TBM35_STUDY_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00109_A471TBM35_STUDY_ID, BC00109_A472TBM35_CRF_ID, BC00109_A473TBM35_CRF_ITEM_CD, BC00109_A474TBM35_STUDY_AUTH_CD, BC00109_A477TBM35_CRT_DATETIME, BC00109_n477TBM35_CRT_DATETIME, BC00109_A478TBM35_CRT_USER_ID, BC00109_n478TBM35_CRT_USER_ID, BC00109_A480TBM35_UPD_DATETIME, BC00109_n480TBM35_UPD_DATETIME,
            BC00109_A481TBM35_UPD_USER_ID, BC00109_n481TBM35_UPD_USER_ID, BC00109_A483TBM35_UPD_CNT, BC00109_n483TBM35_UPD_CNT, BC00109_A475TBM35_DISPLAY_FLG, BC00109_n475TBM35_DISPLAY_FLG, BC00109_A476TBM35_DEL_FLG, BC00109_n476TBM35_DEL_FLG, BC00109_A479TBM35_CRT_PROG_NM, BC00109_n479TBM35_CRT_PROG_NM,
            BC00109_A482TBM35_UPD_PROG_NM, BC00109_n482TBM35_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM35_CRF_ITEM_AUTH_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11102 */
      e11102 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg_N ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg_N ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime_N ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id_N ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm_N ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime_N ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id_N ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm_N ;
   private byte gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z472TBM35_CRF_ID ;
   private short A472TBM35_CRF_ID ;
   private short gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_id_Z ;
   private short RcdFound35 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z471TBM35_STUDY_ID ;
   private long A471TBM35_STUDY_ID ;
   private long A483TBM35_UPD_CNT ;
   private long gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_id_Z ;
   private long gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_cnt_Z ;
   private long Z483TBM35_UPD_CNT ;
   private long O483TBM35_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode35 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A477TBM35_CRT_DATETIME ;
   private java.util.Date A480TBM35_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_datetime_Z ;
   private java.util.Date Z477TBM35_CRT_DATETIME ;
   private java.util.Date Z480TBM35_UPD_DATETIME ;
   private boolean n477TBM35_CRT_DATETIME ;
   private boolean n478TBM35_CRT_USER_ID ;
   private boolean n480TBM35_UPD_DATETIME ;
   private boolean n481TBM35_UPD_USER_ID ;
   private boolean n483TBM35_UPD_CNT ;
   private boolean n475TBM35_DISPLAY_FLG ;
   private boolean n476TBM35_DEL_FLG ;
   private boolean n479TBM35_CRT_PROG_NM ;
   private boolean n482TBM35_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z473TBM35_CRF_ITEM_CD ;
   private String A473TBM35_CRF_ITEM_CD ;
   private String Z474TBM35_STUDY_AUTH_CD ;
   private String A474TBM35_STUDY_AUTH_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A475TBM35_DISPLAY_FLG ;
   private String A476TBM35_DEL_FLG ;
   private String A478TBM35_CRT_USER_ID ;
   private String A479TBM35_CRT_PROG_NM ;
   private String A481TBM35_UPD_USER_ID ;
   private String A482TBM35_UPD_PROG_NM ;
   private String gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crf_item_cd_Z ;
   private String gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_study_auth_cd_Z ;
   private String gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_display_flg_Z ;
   private String gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_del_flg_Z ;
   private String gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_user_id_Z ;
   private String gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_crt_prog_nm_Z ;
   private String gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_user_id_Z ;
   private String gxTv_SdtTBM35_CRF_ITEM_AUTH_Tbm35_upd_prog_nm_Z ;
   private String Z478TBM35_CRT_USER_ID ;
   private String Z481TBM35_UPD_USER_ID ;
   private String Z475TBM35_DISPLAY_FLG ;
   private String Z476TBM35_DEL_FLG ;
   private String Z479TBM35_CRT_PROG_NM ;
   private String Z482TBM35_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM35_CRF_ITEM_AUTH bcTBM35_CRF_ITEM_AUTH ;
   private IDataStoreProvider pr_default ;
   private long[] BC00104_A471TBM35_STUDY_ID ;
   private short[] BC00104_A472TBM35_CRF_ID ;
   private String[] BC00104_A473TBM35_CRF_ITEM_CD ;
   private String[] BC00104_A474TBM35_STUDY_AUTH_CD ;
   private java.util.Date[] BC00104_A477TBM35_CRT_DATETIME ;
   private boolean[] BC00104_n477TBM35_CRT_DATETIME ;
   private String[] BC00104_A478TBM35_CRT_USER_ID ;
   private boolean[] BC00104_n478TBM35_CRT_USER_ID ;
   private java.util.Date[] BC00104_A480TBM35_UPD_DATETIME ;
   private boolean[] BC00104_n480TBM35_UPD_DATETIME ;
   private String[] BC00104_A481TBM35_UPD_USER_ID ;
   private boolean[] BC00104_n481TBM35_UPD_USER_ID ;
   private long[] BC00104_A483TBM35_UPD_CNT ;
   private boolean[] BC00104_n483TBM35_UPD_CNT ;
   private String[] BC00104_A475TBM35_DISPLAY_FLG ;
   private boolean[] BC00104_n475TBM35_DISPLAY_FLG ;
   private String[] BC00104_A476TBM35_DEL_FLG ;
   private boolean[] BC00104_n476TBM35_DEL_FLG ;
   private String[] BC00104_A479TBM35_CRT_PROG_NM ;
   private boolean[] BC00104_n479TBM35_CRT_PROG_NM ;
   private String[] BC00104_A482TBM35_UPD_PROG_NM ;
   private boolean[] BC00104_n482TBM35_UPD_PROG_NM ;
   private long[] BC00105_A471TBM35_STUDY_ID ;
   private short[] BC00105_A472TBM35_CRF_ID ;
   private String[] BC00105_A473TBM35_CRF_ITEM_CD ;
   private String[] BC00105_A474TBM35_STUDY_AUTH_CD ;
   private long[] BC00103_A471TBM35_STUDY_ID ;
   private short[] BC00103_A472TBM35_CRF_ID ;
   private String[] BC00103_A473TBM35_CRF_ITEM_CD ;
   private String[] BC00103_A474TBM35_STUDY_AUTH_CD ;
   private java.util.Date[] BC00103_A477TBM35_CRT_DATETIME ;
   private boolean[] BC00103_n477TBM35_CRT_DATETIME ;
   private String[] BC00103_A478TBM35_CRT_USER_ID ;
   private boolean[] BC00103_n478TBM35_CRT_USER_ID ;
   private java.util.Date[] BC00103_A480TBM35_UPD_DATETIME ;
   private boolean[] BC00103_n480TBM35_UPD_DATETIME ;
   private String[] BC00103_A481TBM35_UPD_USER_ID ;
   private boolean[] BC00103_n481TBM35_UPD_USER_ID ;
   private long[] BC00103_A483TBM35_UPD_CNT ;
   private boolean[] BC00103_n483TBM35_UPD_CNT ;
   private String[] BC00103_A475TBM35_DISPLAY_FLG ;
   private boolean[] BC00103_n475TBM35_DISPLAY_FLG ;
   private String[] BC00103_A476TBM35_DEL_FLG ;
   private boolean[] BC00103_n476TBM35_DEL_FLG ;
   private String[] BC00103_A479TBM35_CRT_PROG_NM ;
   private boolean[] BC00103_n479TBM35_CRT_PROG_NM ;
   private String[] BC00103_A482TBM35_UPD_PROG_NM ;
   private boolean[] BC00103_n482TBM35_UPD_PROG_NM ;
   private long[] BC00102_A471TBM35_STUDY_ID ;
   private short[] BC00102_A472TBM35_CRF_ID ;
   private String[] BC00102_A473TBM35_CRF_ITEM_CD ;
   private String[] BC00102_A474TBM35_STUDY_AUTH_CD ;
   private java.util.Date[] BC00102_A477TBM35_CRT_DATETIME ;
   private boolean[] BC00102_n477TBM35_CRT_DATETIME ;
   private String[] BC00102_A478TBM35_CRT_USER_ID ;
   private boolean[] BC00102_n478TBM35_CRT_USER_ID ;
   private java.util.Date[] BC00102_A480TBM35_UPD_DATETIME ;
   private boolean[] BC00102_n480TBM35_UPD_DATETIME ;
   private String[] BC00102_A481TBM35_UPD_USER_ID ;
   private boolean[] BC00102_n481TBM35_UPD_USER_ID ;
   private long[] BC00102_A483TBM35_UPD_CNT ;
   private boolean[] BC00102_n483TBM35_UPD_CNT ;
   private String[] BC00102_A475TBM35_DISPLAY_FLG ;
   private boolean[] BC00102_n475TBM35_DISPLAY_FLG ;
   private String[] BC00102_A476TBM35_DEL_FLG ;
   private boolean[] BC00102_n476TBM35_DEL_FLG ;
   private String[] BC00102_A479TBM35_CRT_PROG_NM ;
   private boolean[] BC00102_n479TBM35_CRT_PROG_NM ;
   private String[] BC00102_A482TBM35_UPD_PROG_NM ;
   private boolean[] BC00102_n482TBM35_UPD_PROG_NM ;
   private long[] BC00109_A471TBM35_STUDY_ID ;
   private short[] BC00109_A472TBM35_CRF_ID ;
   private String[] BC00109_A473TBM35_CRF_ITEM_CD ;
   private String[] BC00109_A474TBM35_STUDY_AUTH_CD ;
   private java.util.Date[] BC00109_A477TBM35_CRT_DATETIME ;
   private boolean[] BC00109_n477TBM35_CRT_DATETIME ;
   private String[] BC00109_A478TBM35_CRT_USER_ID ;
   private boolean[] BC00109_n478TBM35_CRT_USER_ID ;
   private java.util.Date[] BC00109_A480TBM35_UPD_DATETIME ;
   private boolean[] BC00109_n480TBM35_UPD_DATETIME ;
   private String[] BC00109_A481TBM35_UPD_USER_ID ;
   private boolean[] BC00109_n481TBM35_UPD_USER_ID ;
   private long[] BC00109_A483TBM35_UPD_CNT ;
   private boolean[] BC00109_n483TBM35_UPD_CNT ;
   private String[] BC00109_A475TBM35_DISPLAY_FLG ;
   private boolean[] BC00109_n475TBM35_DISPLAY_FLG ;
   private String[] BC00109_A476TBM35_DEL_FLG ;
   private boolean[] BC00109_n476TBM35_DEL_FLG ;
   private String[] BC00109_A479TBM35_CRT_PROG_NM ;
   private boolean[] BC00109_n479TBM35_CRT_PROG_NM ;
   private String[] BC00109_A482TBM35_UPD_PROG_NM ;
   private boolean[] BC00109_n482TBM35_UPD_PROG_NM ;
}

final  class tbm35_crf_item_auth_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00102", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_CNT`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_PROG_NM`, `TBM35_UPD_PROG_NM` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00103", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_CNT`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_PROG_NM`, `TBM35_UPD_PROG_NM` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00104", "SELECT TM1.`TBM35_STUDY_ID`, TM1.`TBM35_CRF_ID`, TM1.`TBM35_CRF_ITEM_CD`, TM1.`TBM35_STUDY_AUTH_CD`, TM1.`TBM35_CRT_DATETIME`, TM1.`TBM35_CRT_USER_ID`, TM1.`TBM35_UPD_DATETIME`, TM1.`TBM35_UPD_USER_ID`, TM1.`TBM35_UPD_CNT`, TM1.`TBM35_DISPLAY_FLG`, TM1.`TBM35_DEL_FLG`, TM1.`TBM35_CRT_PROG_NM`, TM1.`TBM35_UPD_PROG_NM` FROM `TBM35_CRF_ITEM_AUTH` TM1 WHERE TM1.`TBM35_STUDY_ID` = ? and TM1.`TBM35_CRF_ID` = ? and TM1.`TBM35_CRF_ITEM_CD` = ? and TM1.`TBM35_STUDY_AUTH_CD` = ? ORDER BY TM1.`TBM35_STUDY_ID`, TM1.`TBM35_CRF_ID`, TM1.`TBM35_CRF_ITEM_CD`, TM1.`TBM35_STUDY_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00105", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00106", "INSERT INTO `TBM35_CRF_ITEM_AUTH` (`TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_CNT`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_PROG_NM`, `TBM35_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00107", "UPDATE `TBM35_CRF_ITEM_AUTH` SET `TBM35_CRT_DATETIME`=?, `TBM35_CRT_USER_ID`=?, `TBM35_UPD_DATETIME`=?, `TBM35_UPD_USER_ID`=?, `TBM35_UPD_CNT`=?, `TBM35_DISPLAY_FLG`=?, `TBM35_DEL_FLG`=?, `TBM35_CRT_PROG_NM`=?, `TBM35_UPD_PROG_NM`=?  WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00108", "DELETE FROM `TBM35_CRF_ITEM_AUTH`  WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00109", "SELECT TM1.`TBM35_STUDY_ID`, TM1.`TBM35_CRF_ID`, TM1.`TBM35_CRF_ITEM_CD`, TM1.`TBM35_STUDY_AUTH_CD`, TM1.`TBM35_CRT_DATETIME`, TM1.`TBM35_CRT_USER_ID`, TM1.`TBM35_UPD_DATETIME`, TM1.`TBM35_UPD_USER_ID`, TM1.`TBM35_UPD_CNT`, TM1.`TBM35_DISPLAY_FLG`, TM1.`TBM35_DEL_FLG`, TM1.`TBM35_CRT_PROG_NM`, TM1.`TBM35_UPD_PROG_NM` FROM `TBM35_CRF_ITEM_AUTH` TM1 WHERE TM1.`TBM35_STUDY_ID` = ? and TM1.`TBM35_CRF_ID` = ? and TM1.`TBM35_CRF_ITEM_CD` = ? and TM1.`TBM35_STUDY_AUTH_CD` = ? ORDER BY TM1.`TBM35_STUDY_ID`, TM1.`TBM35_CRF_ID`, TM1.`TBM35_CRF_ITEM_CD`, TM1.`TBM35_STUDY_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 1);
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
               stmt.setVarchar(12, (String)parms[20], 50, false);
               stmt.setVarchar(13, (String)parms[21], 2, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               break;
      }
   }

}

