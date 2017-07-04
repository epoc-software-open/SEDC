/*
               File: tbw01_free_work_bc
        Description: 汎用ワークテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:40.94
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw01_free_work_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbw01_free_work_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw01_free_work_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw01_free_work_bc.class ));
   }

   public tbw01_free_work_bc( int remoteHandle ,
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z595TBW01_SESSION_ID = A595TBW01_SESSION_ID ;
            Z596TBW01_APP_ID = A596TBW01_APP_ID ;
            Z597TBW01_DISP_DATETIME = A597TBW01_DISP_DATETIME ;
            Z598TBW01_LINE_NO = A598TBW01_LINE_NO ;
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

   public void confirm_150( )
   {
      beforeValidate1540( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1540( ) ;
         }
         else
         {
            checkExtendedTable1540( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1540( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11152( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      AV7W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1540( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z595TBW01_SESSION_ID = A595TBW01_SESSION_ID ;
         Z596TBW01_APP_ID = A596TBW01_APP_ID ;
         Z597TBW01_DISP_DATETIME = A597TBW01_DISP_DATETIME ;
         Z598TBW01_LINE_NO = A598TBW01_LINE_NO ;
         Z599TBW01_FREE_SAVE_1 = A599TBW01_FREE_SAVE_1 ;
         Z600TBW01_FREE_SAVE_2 = A600TBW01_FREE_SAVE_2 ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1540( )
   {
      /* Using cursor BC00154 */
      pr_default.execute(2, new Object[] {A595TBW01_SESSION_ID, A596TBW01_APP_ID, A597TBW01_DISP_DATETIME, new Long(A598TBW01_LINE_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A599TBW01_FREE_SAVE_1 = BC00154_A599TBW01_FREE_SAVE_1[0] ;
         n599TBW01_FREE_SAVE_1 = BC00154_n599TBW01_FREE_SAVE_1[0] ;
         A600TBW01_FREE_SAVE_2 = BC00154_A600TBW01_FREE_SAVE_2[0] ;
         n600TBW01_FREE_SAVE_2 = BC00154_n600TBW01_FREE_SAVE_2[0] ;
         zm1540( -1) ;
      }
      pr_default.close(2);
      onLoadActions1540( ) ;
   }

   public void onLoadActions1540( )
   {
      AV8Pgmname = "TBW01_FREE_WORK_BC" ;
   }

   public void checkExtendedTable1540( )
   {
      standaloneModal( ) ;
      AV8Pgmname = "TBW01_FREE_WORK_BC" ;
   }

   public void closeExtendedTableCursors1540( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1540( )
   {
      /* Using cursor BC00155 */
      pr_default.execute(3, new Object[] {A595TBW01_SESSION_ID, A596TBW01_APP_ID, A597TBW01_DISP_DATETIME, new Long(A598TBW01_LINE_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound40 = (short)(1) ;
      }
      else
      {
         RcdFound40 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00153 */
      pr_default.execute(1, new Object[] {A595TBW01_SESSION_ID, A596TBW01_APP_ID, A597TBW01_DISP_DATETIME, new Long(A598TBW01_LINE_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1540( 1) ;
         RcdFound40 = (short)(1) ;
         A595TBW01_SESSION_ID = BC00153_A595TBW01_SESSION_ID[0] ;
         A596TBW01_APP_ID = BC00153_A596TBW01_APP_ID[0] ;
         A597TBW01_DISP_DATETIME = BC00153_A597TBW01_DISP_DATETIME[0] ;
         A598TBW01_LINE_NO = BC00153_A598TBW01_LINE_NO[0] ;
         A599TBW01_FREE_SAVE_1 = BC00153_A599TBW01_FREE_SAVE_1[0] ;
         n599TBW01_FREE_SAVE_1 = BC00153_n599TBW01_FREE_SAVE_1[0] ;
         A600TBW01_FREE_SAVE_2 = BC00153_A600TBW01_FREE_SAVE_2[0] ;
         n600TBW01_FREE_SAVE_2 = BC00153_n600TBW01_FREE_SAVE_2[0] ;
         Z595TBW01_SESSION_ID = A595TBW01_SESSION_ID ;
         Z596TBW01_APP_ID = A596TBW01_APP_ID ;
         Z597TBW01_DISP_DATETIME = A597TBW01_DISP_DATETIME ;
         Z598TBW01_LINE_NO = A598TBW01_LINE_NO ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1540( ) ;
         Gx_mode = sMode40 ;
      }
      else
      {
         RcdFound40 = (short)(0) ;
         initializeNonKey1540( ) ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode40 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1540( ) ;
      if ( RcdFound40 == 0 )
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
      confirm_150( ) ;
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

   public void checkOptimisticConcurrency1540( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00152 */
         pr_default.execute(0, new Object[] {A595TBW01_SESSION_ID, A596TBW01_APP_ID, A597TBW01_DISP_DATETIME, new Long(A598TBW01_LINE_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW01_FREE_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW01_FREE_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1540( )
   {
      beforeValidate1540( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1540( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1540( 0) ;
         checkOptimisticConcurrency1540( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1540( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1540( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00156 */
                  pr_default.execute(4, new Object[] {A595TBW01_SESSION_ID, A596TBW01_APP_ID, A597TBW01_DISP_DATETIME, new Long(A598TBW01_LINE_NO), new Boolean(n599TBW01_FREE_SAVE_1), A599TBW01_FREE_SAVE_1, new Boolean(n600TBW01_FREE_SAVE_2), A600TBW01_FREE_SAVE_2});
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
            load1540( ) ;
         }
         endLevel1540( ) ;
      }
      closeExtendedTableCursors1540( ) ;
   }

   public void update1540( )
   {
      beforeValidate1540( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1540( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1540( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1540( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1540( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00157 */
                  pr_default.execute(5, new Object[] {new Boolean(n599TBW01_FREE_SAVE_1), A599TBW01_FREE_SAVE_1, new Boolean(n600TBW01_FREE_SAVE_2), A600TBW01_FREE_SAVE_2, A595TBW01_SESSION_ID, A596TBW01_APP_ID, A597TBW01_DISP_DATETIME, new Long(A598TBW01_LINE_NO)});
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW01_FREE_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1540( ) ;
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
         endLevel1540( ) ;
      }
      closeExtendedTableCursors1540( ) ;
   }

   public void deferredUpdate1540( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1540( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1540( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1540( ) ;
         afterConfirm1540( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1540( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00158 */
               pr_default.execute(6, new Object[] {A595TBW01_SESSION_ID, A596TBW01_APP_ID, A597TBW01_DISP_DATETIME, new Long(A598TBW01_LINE_NO)});
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
      sMode40 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1540( ) ;
      Gx_mode = sMode40 ;
   }

   public void onDeleteControls1540( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW01_FREE_WORK_BC" ;
      }
   }

   public void endLevel1540( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1540( ) ;
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

   public void scanKeyStart1540( )
   {
      /* Using cursor BC00159 */
      pr_default.execute(7, new Object[] {A595TBW01_SESSION_ID, A596TBW01_APP_ID, A597TBW01_DISP_DATETIME, new Long(A598TBW01_LINE_NO)});
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A595TBW01_SESSION_ID = BC00159_A595TBW01_SESSION_ID[0] ;
         A596TBW01_APP_ID = BC00159_A596TBW01_APP_ID[0] ;
         A597TBW01_DISP_DATETIME = BC00159_A597TBW01_DISP_DATETIME[0] ;
         A598TBW01_LINE_NO = BC00159_A598TBW01_LINE_NO[0] ;
         A599TBW01_FREE_SAVE_1 = BC00159_A599TBW01_FREE_SAVE_1[0] ;
         n599TBW01_FREE_SAVE_1 = BC00159_n599TBW01_FREE_SAVE_1[0] ;
         A600TBW01_FREE_SAVE_2 = BC00159_A600TBW01_FREE_SAVE_2[0] ;
         n600TBW01_FREE_SAVE_2 = BC00159_n600TBW01_FREE_SAVE_2[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1540( )
   {
      pr_default.readNext(7);
      RcdFound40 = (short)(0) ;
      scanKeyLoad1540( ) ;
   }

   public void scanKeyLoad1540( )
   {
      sMode40 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A595TBW01_SESSION_ID = BC00159_A595TBW01_SESSION_ID[0] ;
         A596TBW01_APP_ID = BC00159_A596TBW01_APP_ID[0] ;
         A597TBW01_DISP_DATETIME = BC00159_A597TBW01_DISP_DATETIME[0] ;
         A598TBW01_LINE_NO = BC00159_A598TBW01_LINE_NO[0] ;
         A599TBW01_FREE_SAVE_1 = BC00159_A599TBW01_FREE_SAVE_1[0] ;
         n599TBW01_FREE_SAVE_1 = BC00159_n599TBW01_FREE_SAVE_1[0] ;
         A600TBW01_FREE_SAVE_2 = BC00159_A600TBW01_FREE_SAVE_2[0] ;
         n600TBW01_FREE_SAVE_2 = BC00159_n600TBW01_FREE_SAVE_2[0] ;
      }
      Gx_mode = sMode40 ;
   }

   public void scanKeyEnd1540( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1540( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1540( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1540( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1540( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1540( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1540( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1540( )
   {
   }

   public void addRow1540( )
   {
      VarsToRow40( bcTBW01_FREE_WORK) ;
   }

   public void readRow1540( )
   {
      RowToVars40( bcTBW01_FREE_WORK, 1) ;
   }

   public void initializeNonKey1540( )
   {
      A599TBW01_FREE_SAVE_1 = "" ;
      n599TBW01_FREE_SAVE_1 = false ;
      A600TBW01_FREE_SAVE_2 = "" ;
      n600TBW01_FREE_SAVE_2 = false ;
   }

   public void initAll1540( )
   {
      A595TBW01_SESSION_ID = "" ;
      A596TBW01_APP_ID = "" ;
      A597TBW01_DISP_DATETIME = "" ;
      A598TBW01_LINE_NO = 0 ;
      initializeNonKey1540( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow40( SdtTBW01_FREE_WORK obj40 )
   {
      obj40.setgxTv_SdtTBW01_FREE_WORK_Mode( Gx_mode );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( A599TBW01_FREE_SAVE_1 );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2( A600TBW01_FREE_SAVE_2 );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( A595TBW01_SESSION_ID );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( A596TBW01_APP_ID );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( A597TBW01_DISP_DATETIME );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( A598TBW01_LINE_NO );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z( Z595TBW01_SESSION_ID );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z( Z596TBW01_APP_ID );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z( Z597TBW01_DISP_DATETIME );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z( Z598TBW01_LINE_NO );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_Z( Z599TBW01_FREE_SAVE_1 );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_Z( Z600TBW01_FREE_SAVE_2 );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N( (byte)((byte)((n599TBW01_FREE_SAVE_1)?1:0)) );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N( (byte)((byte)((n600TBW01_FREE_SAVE_2)?1:0)) );
      obj40.setgxTv_SdtTBW01_FREE_WORK_Mode( Gx_mode );
   }

   public void RowToVars40( SdtTBW01_FREE_WORK obj40 ,
                            int forceLoad )
   {
      Gx_mode = obj40.getgxTv_SdtTBW01_FREE_WORK_Mode() ;
      A599TBW01_FREE_SAVE_1 = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1() ;
      n599TBW01_FREE_SAVE_1 = false ;
      A600TBW01_FREE_SAVE_2 = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2() ;
      n600TBW01_FREE_SAVE_2 = false ;
      A595TBW01_SESSION_ID = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id() ;
      A596TBW01_APP_ID = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id() ;
      A597TBW01_DISP_DATETIME = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime() ;
      A598TBW01_LINE_NO = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no() ;
      Z595TBW01_SESSION_ID = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z() ;
      Z596TBW01_APP_ID = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z() ;
      Z597TBW01_DISP_DATETIME = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z() ;
      Z598TBW01_LINE_NO = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z() ;
      Z599TBW01_FREE_SAVE_1 = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_Z() ;
      Z600TBW01_FREE_SAVE_2 = obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_Z() ;
      n599TBW01_FREE_SAVE_1 = (boolean)((obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N()==0)?false:true) ;
      n600TBW01_FREE_SAVE_2 = (boolean)((obj40.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N()==0)?false:true) ;
      Gx_mode = obj40.getgxTv_SdtTBW01_FREE_WORK_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A595TBW01_SESSION_ID = (String)getParm(obj,0) ;
      A596TBW01_APP_ID = (String)getParm(obj,1) ;
      A597TBW01_DISP_DATETIME = (String)getParm(obj,2) ;
      A598TBW01_LINE_NO = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1540( ) ;
      scanKeyStart1540( ) ;
      if ( RcdFound40 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z595TBW01_SESSION_ID = A595TBW01_SESSION_ID ;
         Z596TBW01_APP_ID = A596TBW01_APP_ID ;
         Z597TBW01_DISP_DATETIME = A597TBW01_DISP_DATETIME ;
         Z598TBW01_LINE_NO = A598TBW01_LINE_NO ;
      }
      zm1540( -1) ;
      sMode40 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions1540( ) ;
      Gx_mode = sMode40 ;
      addRow1540( ) ;
      scanKeyEnd1540( ) ;
      if ( RcdFound40 == 0 )
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
      RowToVars40( bcTBW01_FREE_WORK, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1540( ) ;
      if ( RcdFound40 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A595TBW01_SESSION_ID, Z595TBW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A596TBW01_APP_ID, Z596TBW01_APP_ID) != 0 ) || ( GXutil.strcmp(A597TBW01_DISP_DATETIME, Z597TBW01_DISP_DATETIME) != 0 ) || ( A598TBW01_LINE_NO != Z598TBW01_LINE_NO ) )
         {
            A595TBW01_SESSION_ID = Z595TBW01_SESSION_ID ;
            A596TBW01_APP_ID = Z596TBW01_APP_ID ;
            A597TBW01_DISP_DATETIME = Z597TBW01_DISP_DATETIME ;
            A598TBW01_LINE_NO = Z598TBW01_LINE_NO ;
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
            update1540( ) ;
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
            if ( ( GXutil.strcmp(A595TBW01_SESSION_ID, Z595TBW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A596TBW01_APP_ID, Z596TBW01_APP_ID) != 0 ) || ( GXutil.strcmp(A597TBW01_DISP_DATETIME, Z597TBW01_DISP_DATETIME) != 0 ) || ( A598TBW01_LINE_NO != Z598TBW01_LINE_NO ) )
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
                  insert1540( ) ;
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
                  insert1540( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow40( bcTBW01_FREE_WORK) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars40( bcTBW01_FREE_WORK, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1540( ) ;
      if ( RcdFound40 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A595TBW01_SESSION_ID, Z595TBW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A596TBW01_APP_ID, Z596TBW01_APP_ID) != 0 ) || ( GXutil.strcmp(A597TBW01_DISP_DATETIME, Z597TBW01_DISP_DATETIME) != 0 ) || ( A598TBW01_LINE_NO != Z598TBW01_LINE_NO ) )
         {
            A595TBW01_SESSION_ID = Z595TBW01_SESSION_ID ;
            A596TBW01_APP_ID = Z596TBW01_APP_ID ;
            A597TBW01_DISP_DATETIME = Z597TBW01_DISP_DATETIME ;
            A598TBW01_LINE_NO = Z598TBW01_LINE_NO ;
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
         if ( ( GXutil.strcmp(A595TBW01_SESSION_ID, Z595TBW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A596TBW01_APP_ID, Z596TBW01_APP_ID) != 0 ) || ( GXutil.strcmp(A597TBW01_DISP_DATETIME, Z597TBW01_DISP_DATETIME) != 0 ) || ( A598TBW01_LINE_NO != Z598TBW01_LINE_NO ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbw01_free_work_bc");
      VarsToRow40( bcTBW01_FREE_WORK) ;
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
      Gx_mode = bcTBW01_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBW01_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBW01_FREE_WORK sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBW01_FREE_WORK )
      {
         bcTBW01_FREE_WORK = sdt ;
         if ( GXutil.strcmp(bcTBW01_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Mode(), "") == 0 )
         {
            bcTBW01_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow40( bcTBW01_FREE_WORK) ;
         }
         else
         {
            RowToVars40( bcTBW01_FREE_WORK, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBW01_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Mode(), "") == 0 )
         {
            bcTBW01_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars40( bcTBW01_FREE_WORK, 1) ;
   }

   public SdtTBW01_FREE_WORK getTBW01_FREE_WORK_BC( )
   {
      return bcTBW01_FREE_WORK ;
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
                  /* Execute user subroutine: S1132 */
                  S1132 ();
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
      Z595TBW01_SESSION_ID = "" ;
      A595TBW01_SESSION_ID = "" ;
      Z596TBW01_APP_ID = "" ;
      A596TBW01_APP_ID = "" ;
      Z597TBW01_DISP_DATETIME = "" ;
      A597TBW01_DISP_DATETIME = "" ;
      AV7W_BC_FLG = "" ;
      AV8Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_Z = "" ;
      gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_Z = "" ;
      Z599TBW01_FREE_SAVE_1 = "" ;
      A599TBW01_FREE_SAVE_1 = "" ;
      Z600TBW01_FREE_SAVE_2 = "" ;
      A600TBW01_FREE_SAVE_2 = "" ;
      BC00154_A595TBW01_SESSION_ID = new String[] {""} ;
      BC00154_A596TBW01_APP_ID = new String[] {""} ;
      BC00154_A597TBW01_DISP_DATETIME = new String[] {""} ;
      BC00154_A598TBW01_LINE_NO = new long[1] ;
      BC00154_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      BC00154_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      BC00154_A600TBW01_FREE_SAVE_2 = new String[] {""} ;
      BC00154_n600TBW01_FREE_SAVE_2 = new boolean[] {false} ;
      BC00155_A595TBW01_SESSION_ID = new String[] {""} ;
      BC00155_A596TBW01_APP_ID = new String[] {""} ;
      BC00155_A597TBW01_DISP_DATETIME = new String[] {""} ;
      BC00155_A598TBW01_LINE_NO = new long[1] ;
      BC00153_A595TBW01_SESSION_ID = new String[] {""} ;
      BC00153_A596TBW01_APP_ID = new String[] {""} ;
      BC00153_A597TBW01_DISP_DATETIME = new String[] {""} ;
      BC00153_A598TBW01_LINE_NO = new long[1] ;
      BC00153_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      BC00153_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      BC00153_A600TBW01_FREE_SAVE_2 = new String[] {""} ;
      BC00153_n600TBW01_FREE_SAVE_2 = new boolean[] {false} ;
      sMode40 = "" ;
      BC00152_A595TBW01_SESSION_ID = new String[] {""} ;
      BC00152_A596TBW01_APP_ID = new String[] {""} ;
      BC00152_A597TBW01_DISP_DATETIME = new String[] {""} ;
      BC00152_A598TBW01_LINE_NO = new long[1] ;
      BC00152_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      BC00152_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      BC00152_A600TBW01_FREE_SAVE_2 = new String[] {""} ;
      BC00152_n600TBW01_FREE_SAVE_2 = new boolean[] {false} ;
      BC00159_A595TBW01_SESSION_ID = new String[] {""} ;
      BC00159_A596TBW01_APP_ID = new String[] {""} ;
      BC00159_A597TBW01_DISP_DATETIME = new String[] {""} ;
      BC00159_A598TBW01_LINE_NO = new long[1] ;
      BC00159_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      BC00159_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      BC00159_A600TBW01_FREE_SAVE_2 = new String[] {""} ;
      BC00159_n600TBW01_FREE_SAVE_2 = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw01_free_work_bc__default(),
         new Object[] {
             new Object[] {
            BC00152_A595TBW01_SESSION_ID, BC00152_A596TBW01_APP_ID, BC00152_A597TBW01_DISP_DATETIME, BC00152_A598TBW01_LINE_NO, BC00152_A599TBW01_FREE_SAVE_1, BC00152_n599TBW01_FREE_SAVE_1, BC00152_A600TBW01_FREE_SAVE_2, BC00152_n600TBW01_FREE_SAVE_2
            }
            , new Object[] {
            BC00153_A595TBW01_SESSION_ID, BC00153_A596TBW01_APP_ID, BC00153_A597TBW01_DISP_DATETIME, BC00153_A598TBW01_LINE_NO, BC00153_A599TBW01_FREE_SAVE_1, BC00153_n599TBW01_FREE_SAVE_1, BC00153_A600TBW01_FREE_SAVE_2, BC00153_n600TBW01_FREE_SAVE_2
            }
            , new Object[] {
            BC00154_A595TBW01_SESSION_ID, BC00154_A596TBW01_APP_ID, BC00154_A597TBW01_DISP_DATETIME, BC00154_A598TBW01_LINE_NO, BC00154_A599TBW01_FREE_SAVE_1, BC00154_n599TBW01_FREE_SAVE_1, BC00154_A600TBW01_FREE_SAVE_2, BC00154_n600TBW01_FREE_SAVE_2
            }
            , new Object[] {
            BC00155_A595TBW01_SESSION_ID, BC00155_A596TBW01_APP_ID, BC00155_A597TBW01_DISP_DATETIME, BC00155_A598TBW01_LINE_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00159_A595TBW01_SESSION_ID, BC00159_A596TBW01_APP_ID, BC00159_A597TBW01_DISP_DATETIME, BC00159_A598TBW01_LINE_NO, BC00159_A599TBW01_FREE_SAVE_1, BC00159_n599TBW01_FREE_SAVE_1, BC00159_A600TBW01_FREE_SAVE_2, BC00159_n600TBW01_FREE_SAVE_2
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW01_FREE_WORK_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11152 */
      e11152 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_N ;
   private byte gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound40 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z598TBW01_LINE_NO ;
   private long A598TBW01_LINE_NO ;
   private long gxTv_SdtTBW01_FREE_WORK_Tbw01_line_no_Z ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String sMode40 ;
   private String Gx_emsg ;
   private boolean n599TBW01_FREE_SAVE_1 ;
   private boolean n600TBW01_FREE_SAVE_2 ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1_Z ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_2_Z ;
   private String Z599TBW01_FREE_SAVE_1 ;
   private String A599TBW01_FREE_SAVE_1 ;
   private String Z600TBW01_FREE_SAVE_2 ;
   private String A600TBW01_FREE_SAVE_2 ;
   private String Z595TBW01_SESSION_ID ;
   private String A595TBW01_SESSION_ID ;
   private String Z596TBW01_APP_ID ;
   private String A596TBW01_APP_ID ;
   private String Z597TBW01_DISP_DATETIME ;
   private String A597TBW01_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_session_id_Z ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_app_id_Z ;
   private String gxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime_Z ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBW01_FREE_WORK bcTBW01_FREE_WORK ;
   private IDataStoreProvider pr_default ;
   private String[] BC00154_A595TBW01_SESSION_ID ;
   private String[] BC00154_A596TBW01_APP_ID ;
   private String[] BC00154_A597TBW01_DISP_DATETIME ;
   private long[] BC00154_A598TBW01_LINE_NO ;
   private String[] BC00154_A599TBW01_FREE_SAVE_1 ;
   private boolean[] BC00154_n599TBW01_FREE_SAVE_1 ;
   private String[] BC00154_A600TBW01_FREE_SAVE_2 ;
   private boolean[] BC00154_n600TBW01_FREE_SAVE_2 ;
   private String[] BC00155_A595TBW01_SESSION_ID ;
   private String[] BC00155_A596TBW01_APP_ID ;
   private String[] BC00155_A597TBW01_DISP_DATETIME ;
   private long[] BC00155_A598TBW01_LINE_NO ;
   private String[] BC00153_A595TBW01_SESSION_ID ;
   private String[] BC00153_A596TBW01_APP_ID ;
   private String[] BC00153_A597TBW01_DISP_DATETIME ;
   private long[] BC00153_A598TBW01_LINE_NO ;
   private String[] BC00153_A599TBW01_FREE_SAVE_1 ;
   private boolean[] BC00153_n599TBW01_FREE_SAVE_1 ;
   private String[] BC00153_A600TBW01_FREE_SAVE_2 ;
   private boolean[] BC00153_n600TBW01_FREE_SAVE_2 ;
   private String[] BC00152_A595TBW01_SESSION_ID ;
   private String[] BC00152_A596TBW01_APP_ID ;
   private String[] BC00152_A597TBW01_DISP_DATETIME ;
   private long[] BC00152_A598TBW01_LINE_NO ;
   private String[] BC00152_A599TBW01_FREE_SAVE_1 ;
   private boolean[] BC00152_n599TBW01_FREE_SAVE_1 ;
   private String[] BC00152_A600TBW01_FREE_SAVE_2 ;
   private boolean[] BC00152_n600TBW01_FREE_SAVE_2 ;
   private String[] BC00159_A595TBW01_SESSION_ID ;
   private String[] BC00159_A596TBW01_APP_ID ;
   private String[] BC00159_A597TBW01_DISP_DATETIME ;
   private long[] BC00159_A598TBW01_LINE_NO ;
   private String[] BC00159_A599TBW01_FREE_SAVE_1 ;
   private boolean[] BC00159_n599TBW01_FREE_SAVE_1 ;
   private String[] BC00159_A600TBW01_FREE_SAVE_2 ;
   private boolean[] BC00159_n600TBW01_FREE_SAVE_2 ;
}

final  class tbw01_free_work_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00152", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`, `TBW01_FREE_SAVE_1`, `TBW01_FREE_SAVE_2` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00153", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`, `TBW01_FREE_SAVE_1`, `TBW01_FREE_SAVE_2` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00154", "SELECT TM1.`TBW01_SESSION_ID`, TM1.`TBW01_APP_ID`, TM1.`TBW01_DISP_DATETIME`, TM1.`TBW01_LINE_NO`, TM1.`TBW01_FREE_SAVE_1`, TM1.`TBW01_FREE_SAVE_2` FROM `TBW01_FREE_WORK` TM1 WHERE TM1.`TBW01_SESSION_ID` = ? and TM1.`TBW01_APP_ID` = ? and TM1.`TBW01_DISP_DATETIME` = ? and TM1.`TBW01_LINE_NO` = ? ORDER BY TM1.`TBW01_SESSION_ID`, TM1.`TBW01_APP_ID`, TM1.`TBW01_DISP_DATETIME`, TM1.`TBW01_LINE_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC00155", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00156", "INSERT INTO `TBW01_FREE_WORK` (`TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`, `TBW01_FREE_SAVE_1`, `TBW01_FREE_SAVE_2`) VALUES (?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00157", "UPDATE `TBW01_FREE_WORK` SET `TBW01_FREE_SAVE_1`=?, `TBW01_FREE_SAVE_2`=?  WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00158", "DELETE FROM `TBW01_FREE_WORK`  WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00159", "SELECT TM1.`TBW01_SESSION_ID`, TM1.`TBW01_APP_ID`, TM1.`TBW01_DISP_DATETIME`, TM1.`TBW01_LINE_NO`, TM1.`TBW01_FREE_SAVE_1`, TM1.`TBW01_FREE_SAVE_2` FROM `TBW01_FREE_WORK` TM1 WHERE TM1.`TBW01_SESSION_ID` = ? and TM1.`TBW01_APP_ID` = ? and TM1.`TBW01_DISP_DATETIME` = ? and TM1.`TBW01_LINE_NO` = ? ORDER BY TM1.`TBW01_SESSION_ID`, TM1.`TBW01_APP_ID`, TM1.`TBW01_DISP_DATETIME`, TM1.`TBW01_LINE_NO` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(5, (String)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(6, (String)parms[7]);
               }
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(1, (String)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(2, (String)parms[3]);
               }
               stmt.setVarchar(3, (String)parms[4], 50, false);
               stmt.setVarchar(4, (String)parms[5], 7, false);
               stmt.setVarchar(5, (String)parms[6], 14, false);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               break;
      }
   }

}

