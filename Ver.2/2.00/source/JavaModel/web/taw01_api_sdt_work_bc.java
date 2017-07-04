/*
               File: taw01_api_sdt_work_bc
        Description: アプリケーションSDTテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:9.79
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class taw01_api_sdt_work_bc extends GXWebPanel implements IGxSilentTrn
{
   public taw01_api_sdt_work_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public taw01_api_sdt_work_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( taw01_api_sdt_work_bc.class ));
   }

   public taw01_api_sdt_work_bc( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0B11( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0B11( ) ;
      standaloneModal( ) ;
      addRow0B11( ) ;
      Gx_mode = "INS" ;
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
            Z14TAW01_SESSION_ID = A14TAW01_SESSION_ID ;
            Z15TAW01_APP_ID = A15TAW01_APP_ID ;
            Z16TAW01_DISP_DATETIME = A16TAW01_DISP_DATETIME ;
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

   public void confirm_0B0( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0B11( ) ;
         }
         else
         {
            checkExtendedTable0B11( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0B11( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110B2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      AV7W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void zm0B11( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z257TAW01_CRT_DATE = A257TAW01_CRT_DATE ;
      }
      if ( GX_JID == -2 )
      {
         Z14TAW01_SESSION_ID = A14TAW01_SESSION_ID ;
         Z15TAW01_APP_ID = A15TAW01_APP_ID ;
         Z16TAW01_DISP_DATETIME = A16TAW01_DISP_DATETIME ;
         Z257TAW01_CRT_DATE = A257TAW01_CRT_DATE ;
         Z258TAW01_SDT_SAVE_1 = A258TAW01_SDT_SAVE_1 ;
         Z259TAW01_SDT_SAVE_2 = A259TAW01_SDT_SAVE_2 ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0B11( )
   {
      /* Using cursor BC000B4 */
      pr_default.execute(2, new Object[] {A14TAW01_SESSION_ID, A15TAW01_APP_ID, A16TAW01_DISP_DATETIME});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A257TAW01_CRT_DATE = BC000B4_A257TAW01_CRT_DATE[0] ;
         n257TAW01_CRT_DATE = BC000B4_n257TAW01_CRT_DATE[0] ;
         A258TAW01_SDT_SAVE_1 = BC000B4_A258TAW01_SDT_SAVE_1[0] ;
         n258TAW01_SDT_SAVE_1 = BC000B4_n258TAW01_SDT_SAVE_1[0] ;
         A259TAW01_SDT_SAVE_2 = BC000B4_A259TAW01_SDT_SAVE_2[0] ;
         n259TAW01_SDT_SAVE_2 = BC000B4_n259TAW01_SDT_SAVE_2[0] ;
         zm0B11( -2) ;
      }
      pr_default.close(2);
      onLoadActions0B11( ) ;
   }

   public void onLoadActions0B11( )
   {
      AV8Pgmname = "TAW01_API_SDT_WORK_BC" ;
   }

   public void checkExtendedTable0B11( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TAW01_API_SDT_WORK_BC" ;
      if ( ! ( GXutil.nullDate().equals(A257TAW01_CRT_DATE) || (( A257TAW01_CRT_DATE.after( localUtil.ymdtod( 1000, 1, 1) ) ) || ( A257TAW01_CRT_DATE.equals( localUtil.ymdtod( 1000, 1, 1) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日付 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0B11( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0B11( )
   {
      /* Using cursor BC000B5 */
      pr_default.execute(3, new Object[] {A14TAW01_SESSION_ID, A15TAW01_APP_ID, A16TAW01_DISP_DATETIME});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000B3 */
      pr_default.execute(1, new Object[] {A14TAW01_SESSION_ID, A15TAW01_APP_ID, A16TAW01_DISP_DATETIME});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0B11( 2) ;
         RcdFound11 = (short)(1) ;
         A14TAW01_SESSION_ID = BC000B3_A14TAW01_SESSION_ID[0] ;
         A15TAW01_APP_ID = BC000B3_A15TAW01_APP_ID[0] ;
         A16TAW01_DISP_DATETIME = BC000B3_A16TAW01_DISP_DATETIME[0] ;
         A257TAW01_CRT_DATE = BC000B3_A257TAW01_CRT_DATE[0] ;
         n257TAW01_CRT_DATE = BC000B3_n257TAW01_CRT_DATE[0] ;
         A258TAW01_SDT_SAVE_1 = BC000B3_A258TAW01_SDT_SAVE_1[0] ;
         n258TAW01_SDT_SAVE_1 = BC000B3_n258TAW01_SDT_SAVE_1[0] ;
         A259TAW01_SDT_SAVE_2 = BC000B3_A259TAW01_SDT_SAVE_2[0] ;
         n259TAW01_SDT_SAVE_2 = BC000B3_n259TAW01_SDT_SAVE_2[0] ;
         Z14TAW01_SESSION_ID = A14TAW01_SESSION_ID ;
         Z15TAW01_APP_ID = A15TAW01_APP_ID ;
         Z16TAW01_DISP_DATETIME = A16TAW01_DISP_DATETIME ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0B11( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKey0B11( ) ;
         }
         Gx_mode = sMode11 ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0B11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0B11( ) ;
      if ( RcdFound11 == 0 )
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
      confirm_0B0( ) ;
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

   public void checkOptimisticConcurrency0B11( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000B2 */
         pr_default.execute(0, new Object[] {A14TAW01_SESSION_ID, A15TAW01_APP_ID, A16TAW01_DISP_DATETIME});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAW01_API_SDT_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( Z257TAW01_CRT_DATE.equals( BC000B2_A257TAW01_CRT_DATE[0] ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAW01_API_SDT_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0B11( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0B11( 0) ;
         checkOptimisticConcurrency0B11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0B11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000B6 */
                  pr_default.execute(4, new Object[] {A14TAW01_SESSION_ID, A15TAW01_APP_ID, A16TAW01_DISP_DATETIME, new Boolean(n257TAW01_CRT_DATE), A257TAW01_CRT_DATE, new Boolean(n258TAW01_SDT_SAVE_1), A258TAW01_SDT_SAVE_1, new Boolean(n259TAW01_SDT_SAVE_2), A259TAW01_SDT_SAVE_2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAW01_API_SDT_WORK") ;
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
            load0B11( ) ;
         }
         endLevel0B11( ) ;
      }
      closeExtendedTableCursors0B11( ) ;
   }

   public void update0B11( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B11( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0B11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000B7 */
                  pr_default.execute(5, new Object[] {new Boolean(n257TAW01_CRT_DATE), A257TAW01_CRT_DATE, new Boolean(n258TAW01_SDT_SAVE_1), A258TAW01_SDT_SAVE_1, new Boolean(n259TAW01_SDT_SAVE_2), A259TAW01_SDT_SAVE_2, A14TAW01_SESSION_ID, A15TAW01_APP_ID, A16TAW01_DISP_DATETIME});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAW01_API_SDT_WORK") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAW01_API_SDT_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0B11( ) ;
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
         endLevel0B11( ) ;
      }
      closeExtendedTableCursors0B11( ) ;
   }

   public void deferredUpdate0B11( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0B11( ) ;
         afterConfirm0B11( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0B11( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000B8 */
               pr_default.execute(6, new Object[] {A14TAW01_SESSION_ID, A15TAW01_APP_ID, A16TAW01_DISP_DATETIME});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAW01_API_SDT_WORK") ;
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0B11( ) ;
      Gx_mode = sMode11 ;
   }

   public void onDeleteControls0B11( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TAW01_API_SDT_WORK_BC" ;
      }
   }

   public void endLevel0B11( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0B11( ) ;
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

   public void scanKeyStart0B11( )
   {
      /* Scan By routine */
      /* Using cursor BC000B9 */
      pr_default.execute(7, new Object[] {A14TAW01_SESSION_ID, A15TAW01_APP_ID, A16TAW01_DISP_DATETIME});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A14TAW01_SESSION_ID = BC000B9_A14TAW01_SESSION_ID[0] ;
         A15TAW01_APP_ID = BC000B9_A15TAW01_APP_ID[0] ;
         A16TAW01_DISP_DATETIME = BC000B9_A16TAW01_DISP_DATETIME[0] ;
         A257TAW01_CRT_DATE = BC000B9_A257TAW01_CRT_DATE[0] ;
         n257TAW01_CRT_DATE = BC000B9_n257TAW01_CRT_DATE[0] ;
         A258TAW01_SDT_SAVE_1 = BC000B9_A258TAW01_SDT_SAVE_1[0] ;
         n258TAW01_SDT_SAVE_1 = BC000B9_n258TAW01_SDT_SAVE_1[0] ;
         A259TAW01_SDT_SAVE_2 = BC000B9_A259TAW01_SDT_SAVE_2[0] ;
         n259TAW01_SDT_SAVE_2 = BC000B9_n259TAW01_SDT_SAVE_2[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0B11( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound11 = (short)(0) ;
      scanKeyLoad0B11( ) ;
   }

   public void scanKeyLoad0B11( )
   {
      sMode11 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A14TAW01_SESSION_ID = BC000B9_A14TAW01_SESSION_ID[0] ;
         A15TAW01_APP_ID = BC000B9_A15TAW01_APP_ID[0] ;
         A16TAW01_DISP_DATETIME = BC000B9_A16TAW01_DISP_DATETIME[0] ;
         A257TAW01_CRT_DATE = BC000B9_A257TAW01_CRT_DATE[0] ;
         n257TAW01_CRT_DATE = BC000B9_n257TAW01_CRT_DATE[0] ;
         A258TAW01_SDT_SAVE_1 = BC000B9_A258TAW01_SDT_SAVE_1[0] ;
         n258TAW01_SDT_SAVE_1 = BC000B9_n258TAW01_SDT_SAVE_1[0] ;
         A259TAW01_SDT_SAVE_2 = BC000B9_A259TAW01_SDT_SAVE_2[0] ;
         n259TAW01_SDT_SAVE_2 = BC000B9_n259TAW01_SDT_SAVE_2[0] ;
      }
      Gx_mode = sMode11 ;
   }

   public void scanKeyEnd0B11( )
   {
      pr_default.close(7);
   }

   public void afterConfirm0B11( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0B11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0B11( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0B11( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0B11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0B11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0B11( )
   {
   }

   public void addRow0B11( )
   {
      VarsToRow11( bcTAW01_API_SDT_WORK) ;
   }

   public void readRow0B11( )
   {
      RowToVars11( bcTAW01_API_SDT_WORK, 1) ;
   }

   public void initializeNonKey0B11( )
   {
      A257TAW01_CRT_DATE = GXutil.nullDate() ;
      n257TAW01_CRT_DATE = false ;
      A258TAW01_SDT_SAVE_1 = "" ;
      n258TAW01_SDT_SAVE_1 = false ;
      A259TAW01_SDT_SAVE_2 = "" ;
      n259TAW01_SDT_SAVE_2 = false ;
   }

   public void initAll0B11( )
   {
      A14TAW01_SESSION_ID = "" ;
      A15TAW01_APP_ID = "" ;
      A16TAW01_DISP_DATETIME = "" ;
      initializeNonKey0B11( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow11( SdtTAW01_API_SDT_WORK obj11 )
   {
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Mode( Gx_mode );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date( A257TAW01_CRT_DATE );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1( A258TAW01_SDT_SAVE_1 );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2( A259TAW01_SDT_SAVE_2 );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id( A14TAW01_SESSION_ID );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id( A15TAW01_APP_ID );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime( A16TAW01_DISP_DATETIME );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z( Z14TAW01_SESSION_ID );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z( Z15TAW01_APP_ID );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z( Z16TAW01_DISP_DATETIME );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z( Z257TAW01_CRT_DATE );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N( (byte)((byte)((n257TAW01_CRT_DATE)?1:0)) );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N( (byte)((byte)((n258TAW01_SDT_SAVE_1)?1:0)) );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N( (byte)((byte)((n259TAW01_SDT_SAVE_2)?1:0)) );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Mode( Gx_mode );
   }

   public void KeyVarsToRow11( SdtTAW01_API_SDT_WORK obj11 )
   {
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id( A14TAW01_SESSION_ID );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id( A15TAW01_APP_ID );
      obj11.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime( A16TAW01_DISP_DATETIME );
   }

   public void RowToVars11( SdtTAW01_API_SDT_WORK obj11 ,
                            int forceLoad )
   {
      Gx_mode = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Mode() ;
      A257TAW01_CRT_DATE = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date() ;
      n257TAW01_CRT_DATE = false ;
      A258TAW01_SDT_SAVE_1 = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1() ;
      n258TAW01_SDT_SAVE_1 = false ;
      A259TAW01_SDT_SAVE_2 = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2() ;
      n259TAW01_SDT_SAVE_2 = false ;
      A14TAW01_SESSION_ID = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id() ;
      A15TAW01_APP_ID = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id() ;
      A16TAW01_DISP_DATETIME = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime() ;
      Z14TAW01_SESSION_ID = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z() ;
      Z15TAW01_APP_ID = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z() ;
      Z16TAW01_DISP_DATETIME = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z() ;
      Z257TAW01_CRT_DATE = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z() ;
      n257TAW01_CRT_DATE = (boolean)((obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N()==0)?false:true) ;
      n258TAW01_SDT_SAVE_1 = (boolean)((obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N()==0)?false:true) ;
      n259TAW01_SDT_SAVE_2 = (boolean)((obj11.getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N()==0)?false:true) ;
      Gx_mode = obj11.getgxTv_SdtTAW01_API_SDT_WORK_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A14TAW01_SESSION_ID = (String)getParm(obj,0) ;
      A15TAW01_APP_ID = (String)getParm(obj,1) ;
      A16TAW01_DISP_DATETIME = (String)getParm(obj,2) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0B11( ) ;
      scanKeyStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14TAW01_SESSION_ID = A14TAW01_SESSION_ID ;
         Z15TAW01_APP_ID = A15TAW01_APP_ID ;
         Z16TAW01_DISP_DATETIME = A16TAW01_DISP_DATETIME ;
      }
      zm0B11( -2) ;
      onLoadActions0B11( ) ;
      addRow0B11( ) ;
      scanKeyEnd0B11( ) ;
      if ( RcdFound11 == 0 )
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
      RowToVars11( bcTAW01_API_SDT_WORK, 0) ;
      scanKeyStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14TAW01_SESSION_ID = A14TAW01_SESSION_ID ;
         Z15TAW01_APP_ID = A15TAW01_APP_ID ;
         Z16TAW01_DISP_DATETIME = A16TAW01_DISP_DATETIME ;
      }
      zm0B11( -2) ;
      onLoadActions0B11( ) ;
      addRow0B11( ) ;
      scanKeyEnd0B11( ) ;
      if ( RcdFound11 == 0 )
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
      RowToVars11( bcTAW01_API_SDT_WORK, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0B11( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert0B11( ) ;
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( ( GXutil.strcmp(A14TAW01_SESSION_ID, Z14TAW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A15TAW01_APP_ID, Z15TAW01_APP_ID) != 0 ) || ( GXutil.strcmp(A16TAW01_DISP_DATETIME, Z16TAW01_DISP_DATETIME) != 0 ) )
            {
               A14TAW01_SESSION_ID = Z14TAW01_SESSION_ID ;
               A15TAW01_APP_ID = Z15TAW01_APP_ID ;
               A16TAW01_DISP_DATETIME = Z16TAW01_DISP_DATETIME ;
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
               update0B11( ) ;
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
               if ( ( GXutil.strcmp(A14TAW01_SESSION_ID, Z14TAW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A15TAW01_APP_ID, Z15TAW01_APP_ID) != 0 ) || ( GXutil.strcmp(A16TAW01_DISP_DATETIME, Z16TAW01_DISP_DATETIME) != 0 ) )
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
                     insert0B11( ) ;
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
                     insert0B11( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow11( bcTAW01_API_SDT_WORK) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars11( bcTAW01_API_SDT_WORK, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0B11( ) ;
      if ( RcdFound11 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A14TAW01_SESSION_ID, Z14TAW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A15TAW01_APP_ID, Z15TAW01_APP_ID) != 0 ) || ( GXutil.strcmp(A16TAW01_DISP_DATETIME, Z16TAW01_DISP_DATETIME) != 0 ) )
         {
            A14TAW01_SESSION_ID = Z14TAW01_SESSION_ID ;
            A15TAW01_APP_ID = Z15TAW01_APP_ID ;
            A16TAW01_DISP_DATETIME = Z16TAW01_DISP_DATETIME ;
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
         if ( ( GXutil.strcmp(A14TAW01_SESSION_ID, Z14TAW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A15TAW01_APP_ID, Z15TAW01_APP_ID) != 0 ) || ( GXutil.strcmp(A16TAW01_DISP_DATETIME, Z16TAW01_DISP_DATETIME) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "taw01_api_sdt_work_bc");
      VarsToRow11( bcTAW01_API_SDT_WORK) ;
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
      Gx_mode = bcTAW01_API_SDT_WORK.getgxTv_SdtTAW01_API_SDT_WORK_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTAW01_API_SDT_WORK.setgxTv_SdtTAW01_API_SDT_WORK_Mode( Gx_mode );
   }

   public void SetSDT( SdtTAW01_API_SDT_WORK sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTAW01_API_SDT_WORK )
      {
         bcTAW01_API_SDT_WORK = sdt ;
         if ( GXutil.strcmp(bcTAW01_API_SDT_WORK.getgxTv_SdtTAW01_API_SDT_WORK_Mode(), "") == 0 )
         {
            bcTAW01_API_SDT_WORK.setgxTv_SdtTAW01_API_SDT_WORK_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow11( bcTAW01_API_SDT_WORK) ;
         }
         else
         {
            RowToVars11( bcTAW01_API_SDT_WORK, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTAW01_API_SDT_WORK.getgxTv_SdtTAW01_API_SDT_WORK_Mode(), "") == 0 )
         {
            bcTAW01_API_SDT_WORK.setgxTv_SdtTAW01_API_SDT_WORK_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars11( bcTAW01_API_SDT_WORK, 1) ;
   }

   public SdtTAW01_API_SDT_WORK getTAW01_API_SDT_WORK_BC( )
   {
      return bcTAW01_API_SDT_WORK ;
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
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z14TAW01_SESSION_ID = "" ;
      A14TAW01_SESSION_ID = "" ;
      Z15TAW01_APP_ID = "" ;
      A15TAW01_APP_ID = "" ;
      Z16TAW01_DISP_DATETIME = "" ;
      A16TAW01_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z257TAW01_CRT_DATE = GXutil.nullDate() ;
      A257TAW01_CRT_DATE = GXutil.nullDate() ;
      Z258TAW01_SDT_SAVE_1 = "" ;
      A258TAW01_SDT_SAVE_1 = "" ;
      Z259TAW01_SDT_SAVE_2 = "" ;
      A259TAW01_SDT_SAVE_2 = "" ;
      BC000B4_A14TAW01_SESSION_ID = new String[] {""} ;
      BC000B4_A15TAW01_APP_ID = new String[] {""} ;
      BC000B4_A16TAW01_DISP_DATETIME = new String[] {""} ;
      BC000B4_A257TAW01_CRT_DATE = new java.util.Date[] {GXutil.nullDate()} ;
      BC000B4_n257TAW01_CRT_DATE = new boolean[] {false} ;
      BC000B4_A258TAW01_SDT_SAVE_1 = new String[] {""} ;
      BC000B4_n258TAW01_SDT_SAVE_1 = new boolean[] {false} ;
      BC000B4_A259TAW01_SDT_SAVE_2 = new String[] {""} ;
      BC000B4_n259TAW01_SDT_SAVE_2 = new boolean[] {false} ;
      BC000B5_A14TAW01_SESSION_ID = new String[] {""} ;
      BC000B5_A15TAW01_APP_ID = new String[] {""} ;
      BC000B5_A16TAW01_DISP_DATETIME = new String[] {""} ;
      BC000B3_A14TAW01_SESSION_ID = new String[] {""} ;
      BC000B3_A15TAW01_APP_ID = new String[] {""} ;
      BC000B3_A16TAW01_DISP_DATETIME = new String[] {""} ;
      BC000B3_A257TAW01_CRT_DATE = new java.util.Date[] {GXutil.nullDate()} ;
      BC000B3_n257TAW01_CRT_DATE = new boolean[] {false} ;
      BC000B3_A258TAW01_SDT_SAVE_1 = new String[] {""} ;
      BC000B3_n258TAW01_SDT_SAVE_1 = new boolean[] {false} ;
      BC000B3_A259TAW01_SDT_SAVE_2 = new String[] {""} ;
      BC000B3_n259TAW01_SDT_SAVE_2 = new boolean[] {false} ;
      sMode11 = "" ;
      BC000B2_A14TAW01_SESSION_ID = new String[] {""} ;
      BC000B2_A15TAW01_APP_ID = new String[] {""} ;
      BC000B2_A16TAW01_DISP_DATETIME = new String[] {""} ;
      BC000B2_A257TAW01_CRT_DATE = new java.util.Date[] {GXutil.nullDate()} ;
      BC000B2_n257TAW01_CRT_DATE = new boolean[] {false} ;
      BC000B2_A258TAW01_SDT_SAVE_1 = new String[] {""} ;
      BC000B2_n258TAW01_SDT_SAVE_1 = new boolean[] {false} ;
      BC000B2_A259TAW01_SDT_SAVE_2 = new String[] {""} ;
      BC000B2_n259TAW01_SDT_SAVE_2 = new boolean[] {false} ;
      BC000B9_A14TAW01_SESSION_ID = new String[] {""} ;
      BC000B9_A15TAW01_APP_ID = new String[] {""} ;
      BC000B9_A16TAW01_DISP_DATETIME = new String[] {""} ;
      BC000B9_A257TAW01_CRT_DATE = new java.util.Date[] {GXutil.nullDate()} ;
      BC000B9_n257TAW01_CRT_DATE = new boolean[] {false} ;
      BC000B9_A258TAW01_SDT_SAVE_1 = new String[] {""} ;
      BC000B9_n258TAW01_SDT_SAVE_1 = new boolean[] {false} ;
      BC000B9_A259TAW01_SDT_SAVE_2 = new String[] {""} ;
      BC000B9_n259TAW01_SDT_SAVE_2 = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new taw01_api_sdt_work_bc__default(),
         new Object[] {
             new Object[] {
            BC000B2_A14TAW01_SESSION_ID, BC000B2_A15TAW01_APP_ID, BC000B2_A16TAW01_DISP_DATETIME, BC000B2_A257TAW01_CRT_DATE, BC000B2_n257TAW01_CRT_DATE, BC000B2_A258TAW01_SDT_SAVE_1, BC000B2_n258TAW01_SDT_SAVE_1, BC000B2_A259TAW01_SDT_SAVE_2, BC000B2_n259TAW01_SDT_SAVE_2
            }
            , new Object[] {
            BC000B3_A14TAW01_SESSION_ID, BC000B3_A15TAW01_APP_ID, BC000B3_A16TAW01_DISP_DATETIME, BC000B3_A257TAW01_CRT_DATE, BC000B3_n257TAW01_CRT_DATE, BC000B3_A258TAW01_SDT_SAVE_1, BC000B3_n258TAW01_SDT_SAVE_1, BC000B3_A259TAW01_SDT_SAVE_2, BC000B3_n259TAW01_SDT_SAVE_2
            }
            , new Object[] {
            BC000B4_A14TAW01_SESSION_ID, BC000B4_A15TAW01_APP_ID, BC000B4_A16TAW01_DISP_DATETIME, BC000B4_A257TAW01_CRT_DATE, BC000B4_n257TAW01_CRT_DATE, BC000B4_A258TAW01_SDT_SAVE_1, BC000B4_n258TAW01_SDT_SAVE_1, BC000B4_A259TAW01_SDT_SAVE_2, BC000B4_n259TAW01_SDT_SAVE_2
            }
            , new Object[] {
            BC000B5_A14TAW01_SESSION_ID, BC000B5_A15TAW01_APP_ID, BC000B5_A16TAW01_DISP_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000B9_A14TAW01_SESSION_ID, BC000B9_A15TAW01_APP_ID, BC000B9_A16TAW01_DISP_DATETIME, BC000B9_A257TAW01_CRT_DATE, BC000B9_n257TAW01_CRT_DATE, BC000B9_A258TAW01_SDT_SAVE_1, BC000B9_n258TAW01_SDT_SAVE_1, BC000B9_A259TAW01_SDT_SAVE_2, BC000B9_n259TAW01_SDT_SAVE_2
            }
         }
      );
      AV8Pgmname = "TAW01_API_SDT_WORK_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110B2 */
      e110B2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound11 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode11 ;
   private java.util.Date Z257TAW01_CRT_DATE ;
   private java.util.Date A257TAW01_CRT_DATE ;
   private boolean n257TAW01_CRT_DATE ;
   private boolean n258TAW01_SDT_SAVE_1 ;
   private boolean n259TAW01_SDT_SAVE_2 ;
   private String Z258TAW01_SDT_SAVE_1 ;
   private String A258TAW01_SDT_SAVE_1 ;
   private String Z259TAW01_SDT_SAVE_2 ;
   private String A259TAW01_SDT_SAVE_2 ;
   private String Z14TAW01_SESSION_ID ;
   private String A14TAW01_SESSION_ID ;
   private String Z15TAW01_APP_ID ;
   private String A15TAW01_APP_ID ;
   private String Z16TAW01_DISP_DATETIME ;
   private String A16TAW01_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAW01_API_SDT_WORK bcTAW01_API_SDT_WORK ;
   private IDataStoreProvider pr_default ;
   private String[] BC000B4_A14TAW01_SESSION_ID ;
   private String[] BC000B4_A15TAW01_APP_ID ;
   private String[] BC000B4_A16TAW01_DISP_DATETIME ;
   private java.util.Date[] BC000B4_A257TAW01_CRT_DATE ;
   private boolean[] BC000B4_n257TAW01_CRT_DATE ;
   private String[] BC000B4_A258TAW01_SDT_SAVE_1 ;
   private boolean[] BC000B4_n258TAW01_SDT_SAVE_1 ;
   private String[] BC000B4_A259TAW01_SDT_SAVE_2 ;
   private boolean[] BC000B4_n259TAW01_SDT_SAVE_2 ;
   private String[] BC000B5_A14TAW01_SESSION_ID ;
   private String[] BC000B5_A15TAW01_APP_ID ;
   private String[] BC000B5_A16TAW01_DISP_DATETIME ;
   private String[] BC000B3_A14TAW01_SESSION_ID ;
   private String[] BC000B3_A15TAW01_APP_ID ;
   private String[] BC000B3_A16TAW01_DISP_DATETIME ;
   private java.util.Date[] BC000B3_A257TAW01_CRT_DATE ;
   private boolean[] BC000B3_n257TAW01_CRT_DATE ;
   private String[] BC000B3_A258TAW01_SDT_SAVE_1 ;
   private boolean[] BC000B3_n258TAW01_SDT_SAVE_1 ;
   private String[] BC000B3_A259TAW01_SDT_SAVE_2 ;
   private boolean[] BC000B3_n259TAW01_SDT_SAVE_2 ;
   private String[] BC000B2_A14TAW01_SESSION_ID ;
   private String[] BC000B2_A15TAW01_APP_ID ;
   private String[] BC000B2_A16TAW01_DISP_DATETIME ;
   private java.util.Date[] BC000B2_A257TAW01_CRT_DATE ;
   private boolean[] BC000B2_n257TAW01_CRT_DATE ;
   private String[] BC000B2_A258TAW01_SDT_SAVE_1 ;
   private boolean[] BC000B2_n258TAW01_SDT_SAVE_1 ;
   private String[] BC000B2_A259TAW01_SDT_SAVE_2 ;
   private boolean[] BC000B2_n259TAW01_SDT_SAVE_2 ;
   private String[] BC000B9_A14TAW01_SESSION_ID ;
   private String[] BC000B9_A15TAW01_APP_ID ;
   private String[] BC000B9_A16TAW01_DISP_DATETIME ;
   private java.util.Date[] BC000B9_A257TAW01_CRT_DATE ;
   private boolean[] BC000B9_n257TAW01_CRT_DATE ;
   private String[] BC000B9_A258TAW01_SDT_SAVE_1 ;
   private boolean[] BC000B9_n258TAW01_SDT_SAVE_1 ;
   private String[] BC000B9_A259TAW01_SDT_SAVE_2 ;
   private boolean[] BC000B9_n259TAW01_SDT_SAVE_2 ;
}

final  class taw01_api_sdt_work_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000B2", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME`, `TAW01_CRT_DATE`, `TAW01_SDT_SAVE_1`, `TAW01_SDT_SAVE_2` FROM `TAW01_API_SDT_WORK` WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000B3", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME`, `TAW01_CRT_DATE`, `TAW01_SDT_SAVE_1`, `TAW01_SDT_SAVE_2` FROM `TAW01_API_SDT_WORK` WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000B4", "SELECT TM1.`TAW01_SESSION_ID`, TM1.`TAW01_APP_ID`, TM1.`TAW01_DISP_DATETIME`, TM1.`TAW01_CRT_DATE`, TM1.`TAW01_SDT_SAVE_1`, TM1.`TAW01_SDT_SAVE_2` FROM `TAW01_API_SDT_WORK` TM1 WHERE TM1.`TAW01_SESSION_ID` = ? and TM1.`TAW01_APP_ID` = ? and TM1.`TAW01_DISP_DATETIME` = ? ORDER BY TM1.`TAW01_SESSION_ID`, TM1.`TAW01_APP_ID`, TM1.`TAW01_DISP_DATETIME` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC000B5", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME` FROM `TAW01_API_SDT_WORK` WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000B6", "INSERT INTO `TAW01_API_SDT_WORK`(`TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME`, `TAW01_CRT_DATE`, `TAW01_SDT_SAVE_1`, `TAW01_SDT_SAVE_2`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000B7", "UPDATE `TAW01_API_SDT_WORK` SET `TAW01_CRT_DATE`=?, `TAW01_SDT_SAVE_1`=?, `TAW01_SDT_SAVE_2`=?  WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000B8", "DELETE FROM `TAW01_API_SDT_WORK`  WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000B9", "SELECT TM1.`TAW01_SESSION_ID`, TM1.`TAW01_APP_ID`, TM1.`TAW01_DISP_DATETIME`, TM1.`TAW01_CRT_DATE`, TM1.`TAW01_SDT_SAVE_1`, TM1.`TAW01_SDT_SAVE_2` FROM `TAW01_API_SDT_WORK` TM1 WHERE TM1.`TAW01_SESSION_ID` = ? and TM1.`TAW01_APP_ID` = ? and TM1.`TAW01_DISP_DATETIME` = ? ORDER BY TM1.`TAW01_SESSION_ID`, TM1.`TAW01_APP_ID`, TM1.`TAW01_DISP_DATETIME` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(5, (String)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(6, (String)parms[8]);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(2, (String)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(3, (String)parms[5]);
               }
               stmt.setVarchar(4, (String)parms[6], 50, false);
               stmt.setVarchar(5, (String)parms[7], 7, false);
               stmt.setVarchar(6, (String)parms[8], 14, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               return;
      }
   }

}

