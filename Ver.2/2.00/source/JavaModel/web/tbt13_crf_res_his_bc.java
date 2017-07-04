/*
               File: tbt13_crf_res_his_bc
        Description: CRF入力結果履歴テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:48.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt13_crf_res_his_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbt13_crf_res_his_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt13_crf_res_his_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt13_crf_res_his_bc.class ));
   }

   public tbt13_crf_res_his_bc( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1258( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1258( ) ;
      standaloneModal( ) ;
      addRow1258( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e12122 */
         e12122 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z101TBT13_STUDY_ID = A101TBT13_STUDY_ID ;
            Z102TBT13_SUBJECT_ID = A102TBT13_SUBJECT_ID ;
            Z103TBT13_CRF_ID = A103TBT13_CRF_ID ;
            Z938TBT13_CRF_EDA_NO = A938TBT13_CRF_EDA_NO ;
            Z104TBT13_CRF_VERSION = A104TBT13_CRF_VERSION ;
            Z105TBT13_CRF_ITEM_GRP_DIV = A105TBT13_CRF_ITEM_GRP_DIV ;
            Z106TBT13_CRF_ITEM_GRP_CD = A106TBT13_CRF_ITEM_GRP_CD ;
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

   public void confirm_120( )
   {
      beforeValidate1258( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls1258( ) ;
         }
         else
         {
            checkExtendedTable1258( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1258( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e11122( )
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

   public void e12122( )
   {
      /* After Trn Routine */
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

   public void zm1258( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z599TBT13_CRT_DATETIME = A599TBT13_CRT_DATETIME ;
         Z600TBT13_CRT_USER_ID = A600TBT13_CRT_USER_ID ;
         Z602TBT13_UPD_DATETIME = A602TBT13_UPD_DATETIME ;
         Z603TBT13_UPD_USER_ID = A603TBT13_UPD_USER_ID ;
         Z605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
         Z597TBT13_CRF_VALUE = A597TBT13_CRF_VALUE ;
         Z680TBT13_EDIT_FLG = A680TBT13_EDIT_FLG ;
         Z598TBT13_DEL_FLG = A598TBT13_DEL_FLG ;
         Z601TBT13_CRT_PROG_NM = A601TBT13_CRT_PROG_NM ;
         Z604TBT13_UPD_PROG_NM = A604TBT13_UPD_PROG_NM ;
      }
      if ( GX_JID == -8 )
      {
         Z101TBT13_STUDY_ID = A101TBT13_STUDY_ID ;
         Z102TBT13_SUBJECT_ID = A102TBT13_SUBJECT_ID ;
         Z103TBT13_CRF_ID = A103TBT13_CRF_ID ;
         Z938TBT13_CRF_EDA_NO = A938TBT13_CRF_EDA_NO ;
         Z104TBT13_CRF_VERSION = A104TBT13_CRF_VERSION ;
         Z105TBT13_CRF_ITEM_GRP_DIV = A105TBT13_CRF_ITEM_GRP_DIV ;
         Z106TBT13_CRF_ITEM_GRP_CD = A106TBT13_CRF_ITEM_GRP_CD ;
         Z599TBT13_CRT_DATETIME = A599TBT13_CRT_DATETIME ;
         Z600TBT13_CRT_USER_ID = A600TBT13_CRT_USER_ID ;
         Z602TBT13_UPD_DATETIME = A602TBT13_UPD_DATETIME ;
         Z603TBT13_UPD_USER_ID = A603TBT13_UPD_USER_ID ;
         Z605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
         Z597TBT13_CRF_VALUE = A597TBT13_CRF_VALUE ;
         Z680TBT13_EDIT_FLG = A680TBT13_EDIT_FLG ;
         Z598TBT13_DEL_FLG = A598TBT13_DEL_FLG ;
         Z601TBT13_CRT_PROG_NM = A601TBT13_CRT_PROG_NM ;
         Z604TBT13_UPD_PROG_NM = A604TBT13_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1258( )
   {
      /* Using cursor BC00124 */
      pr_default.execute(2, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A599TBT13_CRT_DATETIME = BC00124_A599TBT13_CRT_DATETIME[0] ;
         n599TBT13_CRT_DATETIME = BC00124_n599TBT13_CRT_DATETIME[0] ;
         A600TBT13_CRT_USER_ID = BC00124_A600TBT13_CRT_USER_ID[0] ;
         n600TBT13_CRT_USER_ID = BC00124_n600TBT13_CRT_USER_ID[0] ;
         A602TBT13_UPD_DATETIME = BC00124_A602TBT13_UPD_DATETIME[0] ;
         n602TBT13_UPD_DATETIME = BC00124_n602TBT13_UPD_DATETIME[0] ;
         A603TBT13_UPD_USER_ID = BC00124_A603TBT13_UPD_USER_ID[0] ;
         n603TBT13_UPD_USER_ID = BC00124_n603TBT13_UPD_USER_ID[0] ;
         A605TBT13_UPD_CNT = BC00124_A605TBT13_UPD_CNT[0] ;
         n605TBT13_UPD_CNT = BC00124_n605TBT13_UPD_CNT[0] ;
         A597TBT13_CRF_VALUE = BC00124_A597TBT13_CRF_VALUE[0] ;
         n597TBT13_CRF_VALUE = BC00124_n597TBT13_CRF_VALUE[0] ;
         A680TBT13_EDIT_FLG = BC00124_A680TBT13_EDIT_FLG[0] ;
         n680TBT13_EDIT_FLG = BC00124_n680TBT13_EDIT_FLG[0] ;
         A598TBT13_DEL_FLG = BC00124_A598TBT13_DEL_FLG[0] ;
         n598TBT13_DEL_FLG = BC00124_n598TBT13_DEL_FLG[0] ;
         A601TBT13_CRT_PROG_NM = BC00124_A601TBT13_CRT_PROG_NM[0] ;
         n601TBT13_CRT_PROG_NM = BC00124_n601TBT13_CRT_PROG_NM[0] ;
         A604TBT13_UPD_PROG_NM = BC00124_A604TBT13_UPD_PROG_NM[0] ;
         n604TBT13_UPD_PROG_NM = BC00124_n604TBT13_UPD_PROG_NM[0] ;
         zm1258( -8) ;
      }
      pr_default.close(2);
      onLoadActions1258( ) ;
   }

   public void onLoadActions1258( )
   {
      AV9Pgmname = "TBT13_CRF_RES_HIS_BC" ;
   }

   public void checkExtendedTable1258( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBT13_CRF_RES_HIS_BC" ;
      if ( ! ( GXutil.nullDate().equals(A599TBT13_CRT_DATETIME) || (( A599TBT13_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A599TBT13_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A602TBT13_UPD_DATETIME) || (( A602TBT13_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A602TBT13_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1258( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1258( )
   {
      /* Using cursor BC00125 */
      pr_default.execute(3, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound58 = (short)(1) ;
      }
      else
      {
         RcdFound58 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00123 */
      pr_default.execute(1, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1258( 8) ;
         RcdFound58 = (short)(1) ;
         A101TBT13_STUDY_ID = BC00123_A101TBT13_STUDY_ID[0] ;
         A102TBT13_SUBJECT_ID = BC00123_A102TBT13_SUBJECT_ID[0] ;
         A103TBT13_CRF_ID = BC00123_A103TBT13_CRF_ID[0] ;
         A938TBT13_CRF_EDA_NO = BC00123_A938TBT13_CRF_EDA_NO[0] ;
         A104TBT13_CRF_VERSION = BC00123_A104TBT13_CRF_VERSION[0] ;
         A105TBT13_CRF_ITEM_GRP_DIV = BC00123_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         A106TBT13_CRF_ITEM_GRP_CD = BC00123_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         A599TBT13_CRT_DATETIME = BC00123_A599TBT13_CRT_DATETIME[0] ;
         n599TBT13_CRT_DATETIME = BC00123_n599TBT13_CRT_DATETIME[0] ;
         A600TBT13_CRT_USER_ID = BC00123_A600TBT13_CRT_USER_ID[0] ;
         n600TBT13_CRT_USER_ID = BC00123_n600TBT13_CRT_USER_ID[0] ;
         A602TBT13_UPD_DATETIME = BC00123_A602TBT13_UPD_DATETIME[0] ;
         n602TBT13_UPD_DATETIME = BC00123_n602TBT13_UPD_DATETIME[0] ;
         A603TBT13_UPD_USER_ID = BC00123_A603TBT13_UPD_USER_ID[0] ;
         n603TBT13_UPD_USER_ID = BC00123_n603TBT13_UPD_USER_ID[0] ;
         A605TBT13_UPD_CNT = BC00123_A605TBT13_UPD_CNT[0] ;
         n605TBT13_UPD_CNT = BC00123_n605TBT13_UPD_CNT[0] ;
         A597TBT13_CRF_VALUE = BC00123_A597TBT13_CRF_VALUE[0] ;
         n597TBT13_CRF_VALUE = BC00123_n597TBT13_CRF_VALUE[0] ;
         A680TBT13_EDIT_FLG = BC00123_A680TBT13_EDIT_FLG[0] ;
         n680TBT13_EDIT_FLG = BC00123_n680TBT13_EDIT_FLG[0] ;
         A598TBT13_DEL_FLG = BC00123_A598TBT13_DEL_FLG[0] ;
         n598TBT13_DEL_FLG = BC00123_n598TBT13_DEL_FLG[0] ;
         A601TBT13_CRT_PROG_NM = BC00123_A601TBT13_CRT_PROG_NM[0] ;
         n601TBT13_CRT_PROG_NM = BC00123_n601TBT13_CRT_PROG_NM[0] ;
         A604TBT13_UPD_PROG_NM = BC00123_A604TBT13_UPD_PROG_NM[0] ;
         n604TBT13_UPD_PROG_NM = BC00123_n604TBT13_UPD_PROG_NM[0] ;
         O605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
         n605TBT13_UPD_CNT = false ;
         Z101TBT13_STUDY_ID = A101TBT13_STUDY_ID ;
         Z102TBT13_SUBJECT_ID = A102TBT13_SUBJECT_ID ;
         Z103TBT13_CRF_ID = A103TBT13_CRF_ID ;
         Z938TBT13_CRF_EDA_NO = A938TBT13_CRF_EDA_NO ;
         Z104TBT13_CRF_VERSION = A104TBT13_CRF_VERSION ;
         Z105TBT13_CRF_ITEM_GRP_DIV = A105TBT13_CRF_ITEM_GRP_DIV ;
         Z106TBT13_CRF_ITEM_GRP_CD = A106TBT13_CRF_ITEM_GRP_CD ;
         sMode58 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1258( ) ;
         if ( AnyError == 1 )
         {
            RcdFound58 = (short)(0) ;
            initializeNonKey1258( ) ;
         }
         Gx_mode = sMode58 ;
      }
      else
      {
         RcdFound58 = (short)(0) ;
         initializeNonKey1258( ) ;
         sMode58 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode58 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1258( ) ;
      if ( RcdFound58 == 0 )
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
      confirm_120( ) ;
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

   public void checkOptimisticConcurrency1258( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC00122 */
         pr_default.execute(0, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z599TBT13_CRT_DATETIME.equals( BC00122_A599TBT13_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z600TBT13_CRT_USER_ID, BC00122_A600TBT13_CRT_USER_ID[0]) != 0 ) || !( Z602TBT13_UPD_DATETIME.equals( BC00122_A602TBT13_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z603TBT13_UPD_USER_ID, BC00122_A603TBT13_UPD_USER_ID[0]) != 0 ) || ( Z605TBT13_UPD_CNT != BC00122_A605TBT13_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z597TBT13_CRF_VALUE, BC00122_A597TBT13_CRF_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z680TBT13_EDIT_FLG, BC00122_A680TBT13_EDIT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z598TBT13_DEL_FLG, BC00122_A598TBT13_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z601TBT13_CRT_PROG_NM, BC00122_A601TBT13_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z604TBT13_UPD_PROG_NM, BC00122_A604TBT13_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1258( )
   {
      beforeValidate1258( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1258( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1258( 0) ;
         checkOptimisticConcurrency1258( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1258( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1258( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00126 */
                  pr_default.execute(4, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD, new Boolean(n599TBT13_CRT_DATETIME), A599TBT13_CRT_DATETIME, new Boolean(n600TBT13_CRT_USER_ID), A600TBT13_CRT_USER_ID, new Boolean(n602TBT13_UPD_DATETIME), A602TBT13_UPD_DATETIME, new Boolean(n603TBT13_UPD_USER_ID), A603TBT13_UPD_USER_ID, new Boolean(n605TBT13_UPD_CNT), new Long(A605TBT13_UPD_CNT), new Boolean(n597TBT13_CRF_VALUE), A597TBT13_CRF_VALUE, new Boolean(n680TBT13_EDIT_FLG), A680TBT13_EDIT_FLG, new Boolean(n598TBT13_DEL_FLG), A598TBT13_DEL_FLG, new Boolean(n601TBT13_CRT_PROG_NM), A601TBT13_CRT_PROG_NM, new Boolean(n604TBT13_UPD_PROG_NM), A604TBT13_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
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
            load1258( ) ;
         }
         endLevel1258( ) ;
      }
      closeExtendedTableCursors1258( ) ;
   }

   public void update1258( )
   {
      beforeValidate1258( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1258( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1258( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1258( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1258( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00127 */
                  pr_default.execute(5, new Object[] {new Boolean(n599TBT13_CRT_DATETIME), A599TBT13_CRT_DATETIME, new Boolean(n600TBT13_CRT_USER_ID), A600TBT13_CRT_USER_ID, new Boolean(n602TBT13_UPD_DATETIME), A602TBT13_UPD_DATETIME, new Boolean(n603TBT13_UPD_USER_ID), A603TBT13_UPD_USER_ID, new Boolean(n605TBT13_UPD_CNT), new Long(A605TBT13_UPD_CNT), new Boolean(n597TBT13_CRF_VALUE), A597TBT13_CRF_VALUE, new Boolean(n680TBT13_EDIT_FLG), A680TBT13_EDIT_FLG, new Boolean(n598TBT13_DEL_FLG), A598TBT13_DEL_FLG, new Boolean(n601TBT13_CRT_PROG_NM), A601TBT13_CRT_PROG_NM, new Boolean(n604TBT13_UPD_PROG_NM), A604TBT13_UPD_PROG_NM, new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
                  if ( (pr_default.getStatus(5) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1258( ) ;
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
         endLevel1258( ) ;
      }
      closeExtendedTableCursors1258( ) ;
   }

   public void deferredUpdate1258( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1258( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1258( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1258( ) ;
         afterConfirm1258( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1258( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00128 */
               pr_default.execute(6, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
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
      sMode58 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1258( ) ;
      Gx_mode = sMode58 ;
   }

   public void onDeleteControls1258( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT13_CRF_RES_HIS_BC" ;
      }
   }

   public void endLevel1258( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1258( ) ;
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

   public void scanKeyStart1258( )
   {
      /* Scan By routine */
      /* Using cursor BC00129 */
      pr_default.execute(7, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
      RcdFound58 = (short)(0) ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A101TBT13_STUDY_ID = BC00129_A101TBT13_STUDY_ID[0] ;
         A102TBT13_SUBJECT_ID = BC00129_A102TBT13_SUBJECT_ID[0] ;
         A103TBT13_CRF_ID = BC00129_A103TBT13_CRF_ID[0] ;
         A938TBT13_CRF_EDA_NO = BC00129_A938TBT13_CRF_EDA_NO[0] ;
         A104TBT13_CRF_VERSION = BC00129_A104TBT13_CRF_VERSION[0] ;
         A105TBT13_CRF_ITEM_GRP_DIV = BC00129_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         A106TBT13_CRF_ITEM_GRP_CD = BC00129_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         A599TBT13_CRT_DATETIME = BC00129_A599TBT13_CRT_DATETIME[0] ;
         n599TBT13_CRT_DATETIME = BC00129_n599TBT13_CRT_DATETIME[0] ;
         A600TBT13_CRT_USER_ID = BC00129_A600TBT13_CRT_USER_ID[0] ;
         n600TBT13_CRT_USER_ID = BC00129_n600TBT13_CRT_USER_ID[0] ;
         A602TBT13_UPD_DATETIME = BC00129_A602TBT13_UPD_DATETIME[0] ;
         n602TBT13_UPD_DATETIME = BC00129_n602TBT13_UPD_DATETIME[0] ;
         A603TBT13_UPD_USER_ID = BC00129_A603TBT13_UPD_USER_ID[0] ;
         n603TBT13_UPD_USER_ID = BC00129_n603TBT13_UPD_USER_ID[0] ;
         A605TBT13_UPD_CNT = BC00129_A605TBT13_UPD_CNT[0] ;
         n605TBT13_UPD_CNT = BC00129_n605TBT13_UPD_CNT[0] ;
         A597TBT13_CRF_VALUE = BC00129_A597TBT13_CRF_VALUE[0] ;
         n597TBT13_CRF_VALUE = BC00129_n597TBT13_CRF_VALUE[0] ;
         A680TBT13_EDIT_FLG = BC00129_A680TBT13_EDIT_FLG[0] ;
         n680TBT13_EDIT_FLG = BC00129_n680TBT13_EDIT_FLG[0] ;
         A598TBT13_DEL_FLG = BC00129_A598TBT13_DEL_FLG[0] ;
         n598TBT13_DEL_FLG = BC00129_n598TBT13_DEL_FLG[0] ;
         A601TBT13_CRT_PROG_NM = BC00129_A601TBT13_CRT_PROG_NM[0] ;
         n601TBT13_CRT_PROG_NM = BC00129_n601TBT13_CRT_PROG_NM[0] ;
         A604TBT13_UPD_PROG_NM = BC00129_A604TBT13_UPD_PROG_NM[0] ;
         n604TBT13_UPD_PROG_NM = BC00129_n604TBT13_UPD_PROG_NM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1258( )
   {
      /* Scan next routine */
      pr_default.readNext(7);
      RcdFound58 = (short)(0) ;
      scanKeyLoad1258( ) ;
   }

   public void scanKeyLoad1258( )
   {
      sMode58 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A101TBT13_STUDY_ID = BC00129_A101TBT13_STUDY_ID[0] ;
         A102TBT13_SUBJECT_ID = BC00129_A102TBT13_SUBJECT_ID[0] ;
         A103TBT13_CRF_ID = BC00129_A103TBT13_CRF_ID[0] ;
         A938TBT13_CRF_EDA_NO = BC00129_A938TBT13_CRF_EDA_NO[0] ;
         A104TBT13_CRF_VERSION = BC00129_A104TBT13_CRF_VERSION[0] ;
         A105TBT13_CRF_ITEM_GRP_DIV = BC00129_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         A106TBT13_CRF_ITEM_GRP_CD = BC00129_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         A599TBT13_CRT_DATETIME = BC00129_A599TBT13_CRT_DATETIME[0] ;
         n599TBT13_CRT_DATETIME = BC00129_n599TBT13_CRT_DATETIME[0] ;
         A600TBT13_CRT_USER_ID = BC00129_A600TBT13_CRT_USER_ID[0] ;
         n600TBT13_CRT_USER_ID = BC00129_n600TBT13_CRT_USER_ID[0] ;
         A602TBT13_UPD_DATETIME = BC00129_A602TBT13_UPD_DATETIME[0] ;
         n602TBT13_UPD_DATETIME = BC00129_n602TBT13_UPD_DATETIME[0] ;
         A603TBT13_UPD_USER_ID = BC00129_A603TBT13_UPD_USER_ID[0] ;
         n603TBT13_UPD_USER_ID = BC00129_n603TBT13_UPD_USER_ID[0] ;
         A605TBT13_UPD_CNT = BC00129_A605TBT13_UPD_CNT[0] ;
         n605TBT13_UPD_CNT = BC00129_n605TBT13_UPD_CNT[0] ;
         A597TBT13_CRF_VALUE = BC00129_A597TBT13_CRF_VALUE[0] ;
         n597TBT13_CRF_VALUE = BC00129_n597TBT13_CRF_VALUE[0] ;
         A680TBT13_EDIT_FLG = BC00129_A680TBT13_EDIT_FLG[0] ;
         n680TBT13_EDIT_FLG = BC00129_n680TBT13_EDIT_FLG[0] ;
         A598TBT13_DEL_FLG = BC00129_A598TBT13_DEL_FLG[0] ;
         n598TBT13_DEL_FLG = BC00129_n598TBT13_DEL_FLG[0] ;
         A601TBT13_CRT_PROG_NM = BC00129_A601TBT13_CRT_PROG_NM[0] ;
         n601TBT13_CRT_PROG_NM = BC00129_n601TBT13_CRT_PROG_NM[0] ;
         A604TBT13_UPD_PROG_NM = BC00129_A604TBT13_UPD_PROG_NM[0] ;
         n604TBT13_UPD_PROG_NM = BC00129_n604TBT13_UPD_PROG_NM[0] ;
      }
      Gx_mode = sMode58 ;
   }

   public void scanKeyEnd1258( )
   {
      pr_default.close(7);
   }

   public void afterConfirm1258( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1258( )
   {
      /* Before Insert Rules */
      A599TBT13_CRT_DATETIME = GXutil.now( ) ;
      n599TBT13_CRT_DATETIME = false ;
      GXt_char1 = A600TBT13_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_bc.this.GXt_char1 = GXv_char2[0] ;
      A600TBT13_CRT_USER_ID = GXt_char1 ;
      n600TBT13_CRT_USER_ID = false ;
      A602TBT13_UPD_DATETIME = GXutil.now( ) ;
      n602TBT13_UPD_DATETIME = false ;
      GXt_char1 = A603TBT13_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_bc.this.GXt_char1 = GXv_char2[0] ;
      A603TBT13_UPD_USER_ID = GXt_char1 ;
      n603TBT13_UPD_USER_ID = false ;
      A605TBT13_UPD_CNT = (long)(O605TBT13_UPD_CNT+1) ;
      n605TBT13_UPD_CNT = false ;
   }

   public void beforeUpdate1258( )
   {
      /* Before Update Rules */
      A602TBT13_UPD_DATETIME = GXutil.now( ) ;
      n602TBT13_UPD_DATETIME = false ;
      GXt_char1 = A603TBT13_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_bc.this.GXt_char1 = GXv_char2[0] ;
      A603TBT13_UPD_USER_ID = GXt_char1 ;
      n603TBT13_UPD_USER_ID = false ;
      A605TBT13_UPD_CNT = (long)(O605TBT13_UPD_CNT+1) ;
      n605TBT13_UPD_CNT = false ;
   }

   public void beforeDelete1258( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1258( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1258( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1258( )
   {
   }

   public void addRow1258( )
   {
      VarsToRow58( bcTBT13_CRF_RES_HIS) ;
   }

   public void readRow1258( )
   {
      RowToVars58( bcTBT13_CRF_RES_HIS, 1) ;
   }

   public void initializeNonKey1258( )
   {
      A599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n599TBT13_CRT_DATETIME = false ;
      A600TBT13_CRT_USER_ID = "" ;
      n600TBT13_CRT_USER_ID = false ;
      A602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n602TBT13_UPD_DATETIME = false ;
      A603TBT13_UPD_USER_ID = "" ;
      n603TBT13_UPD_USER_ID = false ;
      A605TBT13_UPD_CNT = 0 ;
      n605TBT13_UPD_CNT = false ;
      A597TBT13_CRF_VALUE = "" ;
      n597TBT13_CRF_VALUE = false ;
      A680TBT13_EDIT_FLG = "" ;
      n680TBT13_EDIT_FLG = false ;
      A598TBT13_DEL_FLG = "" ;
      n598TBT13_DEL_FLG = false ;
      A601TBT13_CRT_PROG_NM = "" ;
      n601TBT13_CRT_PROG_NM = false ;
      A604TBT13_UPD_PROG_NM = "" ;
      n604TBT13_UPD_PROG_NM = false ;
      O605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
      n605TBT13_UPD_CNT = false ;
   }

   public void initAll1258( )
   {
      A101TBT13_STUDY_ID = 0 ;
      A102TBT13_SUBJECT_ID = 0 ;
      A103TBT13_CRF_ID = (short)(0) ;
      A938TBT13_CRF_EDA_NO = (byte)(0) ;
      A104TBT13_CRF_VERSION = (short)(0) ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      initializeNonKey1258( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow58( SdtTBT13_CRF_RES_HIS obj58 )
   {
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( Gx_mode );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime( A599TBT13_CRT_DATETIME );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id( A600TBT13_CRT_USER_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime( A602TBT13_UPD_DATETIME );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id( A603TBT13_UPD_USER_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt( A605TBT13_UPD_CNT );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value( A597TBT13_CRF_VALUE );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg( A680TBT13_EDIT_FLG );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( A598TBT13_DEL_FLG );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( A601TBT13_CRT_PROG_NM );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( A604TBT13_UPD_PROG_NM );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( A101TBT13_STUDY_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( A102TBT13_SUBJECT_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( A103TBT13_CRF_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no( A938TBT13_CRF_EDA_NO );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( A104TBT13_CRF_VERSION );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( A105TBT13_CRF_ITEM_GRP_DIV );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( A106TBT13_CRF_ITEM_GRP_CD );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z( Z101TBT13_STUDY_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z( Z102TBT13_SUBJECT_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z( Z103TBT13_CRF_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z( Z938TBT13_CRF_EDA_NO );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z( Z104TBT13_CRF_VERSION );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z( Z105TBT13_CRF_ITEM_GRP_DIV );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z( Z106TBT13_CRF_ITEM_GRP_CD );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z( Z597TBT13_CRF_VALUE );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z( Z680TBT13_EDIT_FLG );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z( Z598TBT13_DEL_FLG );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z( Z599TBT13_CRT_DATETIME );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z( Z600TBT13_CRT_USER_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z( Z601TBT13_CRT_PROG_NM );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z( Z602TBT13_UPD_DATETIME );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z( Z603TBT13_UPD_USER_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z( Z604TBT13_UPD_PROG_NM );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z( Z605TBT13_UPD_CNT );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N( (byte)((byte)((n597TBT13_CRF_VALUE)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N( (byte)((byte)((n680TBT13_EDIT_FLG)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N( (byte)((byte)((n598TBT13_DEL_FLG)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N( (byte)((byte)((n599TBT13_CRT_DATETIME)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N( (byte)((byte)((n600TBT13_CRT_USER_ID)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N( (byte)((byte)((n601TBT13_CRT_PROG_NM)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N( (byte)((byte)((n602TBT13_UPD_DATETIME)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N( (byte)((byte)((n603TBT13_UPD_USER_ID)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N( (byte)((byte)((n604TBT13_UPD_PROG_NM)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N( (byte)((byte)((n605TBT13_UPD_CNT)?1:0)) );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( Gx_mode );
   }

   public void KeyVarsToRow58( SdtTBT13_CRF_RES_HIS obj58 )
   {
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( A101TBT13_STUDY_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( A102TBT13_SUBJECT_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( A103TBT13_CRF_ID );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no( A938TBT13_CRF_EDA_NO );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( A104TBT13_CRF_VERSION );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( A105TBT13_CRF_ITEM_GRP_DIV );
      obj58.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( A106TBT13_CRF_ITEM_GRP_CD );
   }

   public void RowToVars58( SdtTBT13_CRF_RES_HIS obj58 ,
                            int forceLoad )
   {
      Gx_mode = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Mode() ;
      A599TBT13_CRT_DATETIME = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime() ;
      n599TBT13_CRT_DATETIME = false ;
      A600TBT13_CRT_USER_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id() ;
      n600TBT13_CRT_USER_ID = false ;
      A602TBT13_UPD_DATETIME = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime() ;
      n602TBT13_UPD_DATETIME = false ;
      A603TBT13_UPD_USER_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id() ;
      n603TBT13_UPD_USER_ID = false ;
      A605TBT13_UPD_CNT = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt() ;
      n605TBT13_UPD_CNT = false ;
      A597TBT13_CRF_VALUE = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value() ;
      n597TBT13_CRF_VALUE = false ;
      A680TBT13_EDIT_FLG = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg() ;
      n680TBT13_EDIT_FLG = false ;
      A598TBT13_DEL_FLG = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg() ;
      n598TBT13_DEL_FLG = false ;
      A601TBT13_CRT_PROG_NM = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm() ;
      n601TBT13_CRT_PROG_NM = false ;
      A604TBT13_UPD_PROG_NM = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm() ;
      n604TBT13_UPD_PROG_NM = false ;
      A101TBT13_STUDY_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id() ;
      A102TBT13_SUBJECT_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id() ;
      A103TBT13_CRF_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id() ;
      A938TBT13_CRF_EDA_NO = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no() ;
      A104TBT13_CRF_VERSION = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version() ;
      A105TBT13_CRF_ITEM_GRP_DIV = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div() ;
      A106TBT13_CRF_ITEM_GRP_CD = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd() ;
      Z101TBT13_STUDY_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z() ;
      Z102TBT13_SUBJECT_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z() ;
      Z103TBT13_CRF_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z() ;
      Z938TBT13_CRF_EDA_NO = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z() ;
      Z104TBT13_CRF_VERSION = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z() ;
      Z105TBT13_CRF_ITEM_GRP_DIV = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z() ;
      Z106TBT13_CRF_ITEM_GRP_CD = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z() ;
      Z597TBT13_CRF_VALUE = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z() ;
      Z680TBT13_EDIT_FLG = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z() ;
      Z598TBT13_DEL_FLG = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z() ;
      Z599TBT13_CRT_DATETIME = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z() ;
      Z600TBT13_CRT_USER_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z() ;
      Z601TBT13_CRT_PROG_NM = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z() ;
      Z602TBT13_UPD_DATETIME = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z() ;
      Z603TBT13_UPD_USER_ID = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z() ;
      Z604TBT13_UPD_PROG_NM = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z() ;
      Z605TBT13_UPD_CNT = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z() ;
      O605TBT13_UPD_CNT = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z() ;
      n597TBT13_CRF_VALUE = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N()==0)?false:true) ;
      n680TBT13_EDIT_FLG = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N()==0)?false:true) ;
      n598TBT13_DEL_FLG = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N()==0)?false:true) ;
      n599TBT13_CRT_DATETIME = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N()==0)?false:true) ;
      n600TBT13_CRT_USER_ID = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N()==0)?false:true) ;
      n601TBT13_CRT_PROG_NM = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N()==0)?false:true) ;
      n602TBT13_UPD_DATETIME = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N()==0)?false:true) ;
      n603TBT13_UPD_USER_ID = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N()==0)?false:true) ;
      n604TBT13_UPD_PROG_NM = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N()==0)?false:true) ;
      n605TBT13_UPD_CNT = (boolean)((obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj58.getgxTv_SdtTBT13_CRF_RES_HIS_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A101TBT13_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A102TBT13_SUBJECT_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A103TBT13_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      A938TBT13_CRF_EDA_NO = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      A104TBT13_CRF_VERSION = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      A105TBT13_CRF_ITEM_GRP_DIV = (String)getParm(obj,5) ;
      A106TBT13_CRF_ITEM_GRP_CD = (String)getParm(obj,6) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1258( ) ;
      scanKeyStart1258( ) ;
      if ( RcdFound58 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z101TBT13_STUDY_ID = A101TBT13_STUDY_ID ;
         Z102TBT13_SUBJECT_ID = A102TBT13_SUBJECT_ID ;
         Z103TBT13_CRF_ID = A103TBT13_CRF_ID ;
         Z938TBT13_CRF_EDA_NO = A938TBT13_CRF_EDA_NO ;
         Z104TBT13_CRF_VERSION = A104TBT13_CRF_VERSION ;
         Z105TBT13_CRF_ITEM_GRP_DIV = A105TBT13_CRF_ITEM_GRP_DIV ;
         Z106TBT13_CRF_ITEM_GRP_CD = A106TBT13_CRF_ITEM_GRP_CD ;
         O605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
         n605TBT13_UPD_CNT = false ;
      }
      zm1258( -8) ;
      onLoadActions1258( ) ;
      addRow1258( ) ;
      scanKeyEnd1258( ) ;
      if ( RcdFound58 == 0 )
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
      RowToVars58( bcTBT13_CRF_RES_HIS, 0) ;
      scanKeyStart1258( ) ;
      if ( RcdFound58 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z101TBT13_STUDY_ID = A101TBT13_STUDY_ID ;
         Z102TBT13_SUBJECT_ID = A102TBT13_SUBJECT_ID ;
         Z103TBT13_CRF_ID = A103TBT13_CRF_ID ;
         Z938TBT13_CRF_EDA_NO = A938TBT13_CRF_EDA_NO ;
         Z104TBT13_CRF_VERSION = A104TBT13_CRF_VERSION ;
         Z105TBT13_CRF_ITEM_GRP_DIV = A105TBT13_CRF_ITEM_GRP_DIV ;
         Z106TBT13_CRF_ITEM_GRP_CD = A106TBT13_CRF_ITEM_GRP_CD ;
         O605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
         n605TBT13_UPD_CNT = false ;
      }
      zm1258( -8) ;
      onLoadActions1258( ) ;
      addRow1258( ) ;
      scanKeyEnd1258( ) ;
      if ( RcdFound58 == 0 )
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
      RowToVars58( bcTBT13_CRF_RES_HIS, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey1258( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         insert1258( ) ;
      }
      else
      {
         if ( RcdFound58 == 1 )
         {
            if ( ( A101TBT13_STUDY_ID != Z101TBT13_STUDY_ID ) || ( A102TBT13_SUBJECT_ID != Z102TBT13_SUBJECT_ID ) || ( A103TBT13_CRF_ID != Z103TBT13_CRF_ID ) || ( A938TBT13_CRF_EDA_NO != Z938TBT13_CRF_EDA_NO ) || ( A104TBT13_CRF_VERSION != Z104TBT13_CRF_VERSION ) || ( GXutil.strcmp(A105TBT13_CRF_ITEM_GRP_DIV, Z105TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A106TBT13_CRF_ITEM_GRP_CD, Z106TBT13_CRF_ITEM_GRP_CD) != 0 ) )
            {
               A101TBT13_STUDY_ID = Z101TBT13_STUDY_ID ;
               A102TBT13_SUBJECT_ID = Z102TBT13_SUBJECT_ID ;
               A103TBT13_CRF_ID = Z103TBT13_CRF_ID ;
               A938TBT13_CRF_EDA_NO = Z938TBT13_CRF_EDA_NO ;
               A104TBT13_CRF_VERSION = Z104TBT13_CRF_VERSION ;
               A105TBT13_CRF_ITEM_GRP_DIV = Z105TBT13_CRF_ITEM_GRP_DIV ;
               A106TBT13_CRF_ITEM_GRP_CD = Z106TBT13_CRF_ITEM_GRP_CD ;
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
               update1258( ) ;
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
               if ( ( A101TBT13_STUDY_ID != Z101TBT13_STUDY_ID ) || ( A102TBT13_SUBJECT_ID != Z102TBT13_SUBJECT_ID ) || ( A103TBT13_CRF_ID != Z103TBT13_CRF_ID ) || ( A938TBT13_CRF_EDA_NO != Z938TBT13_CRF_EDA_NO ) || ( A104TBT13_CRF_VERSION != Z104TBT13_CRF_VERSION ) || ( GXutil.strcmp(A105TBT13_CRF_ITEM_GRP_DIV, Z105TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A106TBT13_CRF_ITEM_GRP_CD, Z106TBT13_CRF_ITEM_GRP_CD) != 0 ) )
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
                     insert1258( ) ;
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
                     insert1258( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow58( bcTBT13_CRF_RES_HIS) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars58( bcTBT13_CRF_RES_HIS, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1258( ) ;
      if ( RcdFound58 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A101TBT13_STUDY_ID != Z101TBT13_STUDY_ID ) || ( A102TBT13_SUBJECT_ID != Z102TBT13_SUBJECT_ID ) || ( A103TBT13_CRF_ID != Z103TBT13_CRF_ID ) || ( A938TBT13_CRF_EDA_NO != Z938TBT13_CRF_EDA_NO ) || ( A104TBT13_CRF_VERSION != Z104TBT13_CRF_VERSION ) || ( GXutil.strcmp(A105TBT13_CRF_ITEM_GRP_DIV, Z105TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A106TBT13_CRF_ITEM_GRP_CD, Z106TBT13_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A101TBT13_STUDY_ID = Z101TBT13_STUDY_ID ;
            A102TBT13_SUBJECT_ID = Z102TBT13_SUBJECT_ID ;
            A103TBT13_CRF_ID = Z103TBT13_CRF_ID ;
            A938TBT13_CRF_EDA_NO = Z938TBT13_CRF_EDA_NO ;
            A104TBT13_CRF_VERSION = Z104TBT13_CRF_VERSION ;
            A105TBT13_CRF_ITEM_GRP_DIV = Z105TBT13_CRF_ITEM_GRP_DIV ;
            A106TBT13_CRF_ITEM_GRP_CD = Z106TBT13_CRF_ITEM_GRP_CD ;
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
         if ( ( A101TBT13_STUDY_ID != Z101TBT13_STUDY_ID ) || ( A102TBT13_SUBJECT_ID != Z102TBT13_SUBJECT_ID ) || ( A103TBT13_CRF_ID != Z103TBT13_CRF_ID ) || ( A938TBT13_CRF_EDA_NO != Z938TBT13_CRF_EDA_NO ) || ( A104TBT13_CRF_VERSION != Z104TBT13_CRF_VERSION ) || ( GXutil.strcmp(A105TBT13_CRF_ITEM_GRP_DIV, Z105TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A106TBT13_CRF_ITEM_GRP_CD, Z106TBT13_CRF_ITEM_GRP_CD) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbt13_crf_res_his_bc");
      VarsToRow58( bcTBT13_CRF_RES_HIS) ;
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
      Gx_mode = bcTBT13_CRF_RES_HIS.getgxTv_SdtTBT13_CRF_RES_HIS_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBT13_CRF_RES_HIS sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBT13_CRF_RES_HIS )
      {
         bcTBT13_CRF_RES_HIS = sdt ;
         if ( GXutil.strcmp(bcTBT13_CRF_RES_HIS.getgxTv_SdtTBT13_CRF_RES_HIS_Mode(), "") == 0 )
         {
            bcTBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow58( bcTBT13_CRF_RES_HIS) ;
         }
         else
         {
            RowToVars58( bcTBT13_CRF_RES_HIS, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBT13_CRF_RES_HIS.getgxTv_SdtTBT13_CRF_RES_HIS_Mode(), "") == 0 )
         {
            bcTBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars58( bcTBT13_CRF_RES_HIS, 1) ;
   }

   public SdtTBT13_CRF_RES_HIS getTBT13_CRF_RES_HIS_BC( )
   {
      return bcTBT13_CRF_RES_HIS ;
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
      Z105TBT13_CRF_ITEM_GRP_DIV = "" ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      Z106TBT13_CRF_ITEM_GRP_CD = "" ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Z599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z600TBT13_CRT_USER_ID = "" ;
      A600TBT13_CRT_USER_ID = "" ;
      Z602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z603TBT13_UPD_USER_ID = "" ;
      A603TBT13_UPD_USER_ID = "" ;
      Z597TBT13_CRF_VALUE = "" ;
      A597TBT13_CRF_VALUE = "" ;
      Z680TBT13_EDIT_FLG = "" ;
      A680TBT13_EDIT_FLG = "" ;
      Z598TBT13_DEL_FLG = "" ;
      A598TBT13_DEL_FLG = "" ;
      Z601TBT13_CRT_PROG_NM = "" ;
      A601TBT13_CRT_PROG_NM = "" ;
      Z604TBT13_UPD_PROG_NM = "" ;
      A604TBT13_UPD_PROG_NM = "" ;
      BC00124_A101TBT13_STUDY_ID = new long[1] ;
      BC00124_A102TBT13_SUBJECT_ID = new int[1] ;
      BC00124_A103TBT13_CRF_ID = new short[1] ;
      BC00124_A938TBT13_CRF_EDA_NO = new byte[1] ;
      BC00124_A104TBT13_CRF_VERSION = new short[1] ;
      BC00124_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00124_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00124_A599TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00124_n599TBT13_CRT_DATETIME = new boolean[] {false} ;
      BC00124_A600TBT13_CRT_USER_ID = new String[] {""} ;
      BC00124_n600TBT13_CRT_USER_ID = new boolean[] {false} ;
      BC00124_A602TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00124_n602TBT13_UPD_DATETIME = new boolean[] {false} ;
      BC00124_A603TBT13_UPD_USER_ID = new String[] {""} ;
      BC00124_n603TBT13_UPD_USER_ID = new boolean[] {false} ;
      BC00124_A605TBT13_UPD_CNT = new long[1] ;
      BC00124_n605TBT13_UPD_CNT = new boolean[] {false} ;
      BC00124_A597TBT13_CRF_VALUE = new String[] {""} ;
      BC00124_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      BC00124_A680TBT13_EDIT_FLG = new String[] {""} ;
      BC00124_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      BC00124_A598TBT13_DEL_FLG = new String[] {""} ;
      BC00124_n598TBT13_DEL_FLG = new boolean[] {false} ;
      BC00124_A601TBT13_CRT_PROG_NM = new String[] {""} ;
      BC00124_n601TBT13_CRT_PROG_NM = new boolean[] {false} ;
      BC00124_A604TBT13_UPD_PROG_NM = new String[] {""} ;
      BC00124_n604TBT13_UPD_PROG_NM = new boolean[] {false} ;
      BC00125_A101TBT13_STUDY_ID = new long[1] ;
      BC00125_A102TBT13_SUBJECT_ID = new int[1] ;
      BC00125_A103TBT13_CRF_ID = new short[1] ;
      BC00125_A938TBT13_CRF_EDA_NO = new byte[1] ;
      BC00125_A104TBT13_CRF_VERSION = new short[1] ;
      BC00125_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00125_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00123_A101TBT13_STUDY_ID = new long[1] ;
      BC00123_A102TBT13_SUBJECT_ID = new int[1] ;
      BC00123_A103TBT13_CRF_ID = new short[1] ;
      BC00123_A938TBT13_CRF_EDA_NO = new byte[1] ;
      BC00123_A104TBT13_CRF_VERSION = new short[1] ;
      BC00123_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00123_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00123_A599TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00123_n599TBT13_CRT_DATETIME = new boolean[] {false} ;
      BC00123_A600TBT13_CRT_USER_ID = new String[] {""} ;
      BC00123_n600TBT13_CRT_USER_ID = new boolean[] {false} ;
      BC00123_A602TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00123_n602TBT13_UPD_DATETIME = new boolean[] {false} ;
      BC00123_A603TBT13_UPD_USER_ID = new String[] {""} ;
      BC00123_n603TBT13_UPD_USER_ID = new boolean[] {false} ;
      BC00123_A605TBT13_UPD_CNT = new long[1] ;
      BC00123_n605TBT13_UPD_CNT = new boolean[] {false} ;
      BC00123_A597TBT13_CRF_VALUE = new String[] {""} ;
      BC00123_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      BC00123_A680TBT13_EDIT_FLG = new String[] {""} ;
      BC00123_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      BC00123_A598TBT13_DEL_FLG = new String[] {""} ;
      BC00123_n598TBT13_DEL_FLG = new boolean[] {false} ;
      BC00123_A601TBT13_CRT_PROG_NM = new String[] {""} ;
      BC00123_n601TBT13_CRT_PROG_NM = new boolean[] {false} ;
      BC00123_A604TBT13_UPD_PROG_NM = new String[] {""} ;
      BC00123_n604TBT13_UPD_PROG_NM = new boolean[] {false} ;
      sMode58 = "" ;
      BC00122_A101TBT13_STUDY_ID = new long[1] ;
      BC00122_A102TBT13_SUBJECT_ID = new int[1] ;
      BC00122_A103TBT13_CRF_ID = new short[1] ;
      BC00122_A938TBT13_CRF_EDA_NO = new byte[1] ;
      BC00122_A104TBT13_CRF_VERSION = new short[1] ;
      BC00122_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00122_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00122_A599TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00122_n599TBT13_CRT_DATETIME = new boolean[] {false} ;
      BC00122_A600TBT13_CRT_USER_ID = new String[] {""} ;
      BC00122_n600TBT13_CRT_USER_ID = new boolean[] {false} ;
      BC00122_A602TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00122_n602TBT13_UPD_DATETIME = new boolean[] {false} ;
      BC00122_A603TBT13_UPD_USER_ID = new String[] {""} ;
      BC00122_n603TBT13_UPD_USER_ID = new boolean[] {false} ;
      BC00122_A605TBT13_UPD_CNT = new long[1] ;
      BC00122_n605TBT13_UPD_CNT = new boolean[] {false} ;
      BC00122_A597TBT13_CRF_VALUE = new String[] {""} ;
      BC00122_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      BC00122_A680TBT13_EDIT_FLG = new String[] {""} ;
      BC00122_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      BC00122_A598TBT13_DEL_FLG = new String[] {""} ;
      BC00122_n598TBT13_DEL_FLG = new boolean[] {false} ;
      BC00122_A601TBT13_CRT_PROG_NM = new String[] {""} ;
      BC00122_n601TBT13_CRT_PROG_NM = new boolean[] {false} ;
      BC00122_A604TBT13_UPD_PROG_NM = new String[] {""} ;
      BC00122_n604TBT13_UPD_PROG_NM = new boolean[] {false} ;
      BC00129_A101TBT13_STUDY_ID = new long[1] ;
      BC00129_A102TBT13_SUBJECT_ID = new int[1] ;
      BC00129_A103TBT13_CRF_ID = new short[1] ;
      BC00129_A938TBT13_CRF_EDA_NO = new byte[1] ;
      BC00129_A104TBT13_CRF_VERSION = new short[1] ;
      BC00129_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      BC00129_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      BC00129_A599TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00129_n599TBT13_CRT_DATETIME = new boolean[] {false} ;
      BC00129_A600TBT13_CRT_USER_ID = new String[] {""} ;
      BC00129_n600TBT13_CRT_USER_ID = new boolean[] {false} ;
      BC00129_A602TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC00129_n602TBT13_UPD_DATETIME = new boolean[] {false} ;
      BC00129_A603TBT13_UPD_USER_ID = new String[] {""} ;
      BC00129_n603TBT13_UPD_USER_ID = new boolean[] {false} ;
      BC00129_A605TBT13_UPD_CNT = new long[1] ;
      BC00129_n605TBT13_UPD_CNT = new boolean[] {false} ;
      BC00129_A597TBT13_CRF_VALUE = new String[] {""} ;
      BC00129_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      BC00129_A680TBT13_EDIT_FLG = new String[] {""} ;
      BC00129_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      BC00129_A598TBT13_DEL_FLG = new String[] {""} ;
      BC00129_n598TBT13_DEL_FLG = new boolean[] {false} ;
      BC00129_A601TBT13_CRT_PROG_NM = new String[] {""} ;
      BC00129_n601TBT13_CRT_PROG_NM = new boolean[] {false} ;
      BC00129_A604TBT13_UPD_PROG_NM = new String[] {""} ;
      BC00129_n604TBT13_UPD_PROG_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt13_crf_res_his_bc__default(),
         new Object[] {
             new Object[] {
            BC00122_A101TBT13_STUDY_ID, BC00122_A102TBT13_SUBJECT_ID, BC00122_A103TBT13_CRF_ID, BC00122_A938TBT13_CRF_EDA_NO, BC00122_A104TBT13_CRF_VERSION, BC00122_A105TBT13_CRF_ITEM_GRP_DIV, BC00122_A106TBT13_CRF_ITEM_GRP_CD, BC00122_A599TBT13_CRT_DATETIME, BC00122_n599TBT13_CRT_DATETIME, BC00122_A600TBT13_CRT_USER_ID,
            BC00122_n600TBT13_CRT_USER_ID, BC00122_A602TBT13_UPD_DATETIME, BC00122_n602TBT13_UPD_DATETIME, BC00122_A603TBT13_UPD_USER_ID, BC00122_n603TBT13_UPD_USER_ID, BC00122_A605TBT13_UPD_CNT, BC00122_n605TBT13_UPD_CNT, BC00122_A597TBT13_CRF_VALUE, BC00122_n597TBT13_CRF_VALUE, BC00122_A680TBT13_EDIT_FLG,
            BC00122_n680TBT13_EDIT_FLG, BC00122_A598TBT13_DEL_FLG, BC00122_n598TBT13_DEL_FLG, BC00122_A601TBT13_CRT_PROG_NM, BC00122_n601TBT13_CRT_PROG_NM, BC00122_A604TBT13_UPD_PROG_NM, BC00122_n604TBT13_UPD_PROG_NM
            }
            , new Object[] {
            BC00123_A101TBT13_STUDY_ID, BC00123_A102TBT13_SUBJECT_ID, BC00123_A103TBT13_CRF_ID, BC00123_A938TBT13_CRF_EDA_NO, BC00123_A104TBT13_CRF_VERSION, BC00123_A105TBT13_CRF_ITEM_GRP_DIV, BC00123_A106TBT13_CRF_ITEM_GRP_CD, BC00123_A599TBT13_CRT_DATETIME, BC00123_n599TBT13_CRT_DATETIME, BC00123_A600TBT13_CRT_USER_ID,
            BC00123_n600TBT13_CRT_USER_ID, BC00123_A602TBT13_UPD_DATETIME, BC00123_n602TBT13_UPD_DATETIME, BC00123_A603TBT13_UPD_USER_ID, BC00123_n603TBT13_UPD_USER_ID, BC00123_A605TBT13_UPD_CNT, BC00123_n605TBT13_UPD_CNT, BC00123_A597TBT13_CRF_VALUE, BC00123_n597TBT13_CRF_VALUE, BC00123_A680TBT13_EDIT_FLG,
            BC00123_n680TBT13_EDIT_FLG, BC00123_A598TBT13_DEL_FLG, BC00123_n598TBT13_DEL_FLG, BC00123_A601TBT13_CRT_PROG_NM, BC00123_n601TBT13_CRT_PROG_NM, BC00123_A604TBT13_UPD_PROG_NM, BC00123_n604TBT13_UPD_PROG_NM
            }
            , new Object[] {
            BC00124_A101TBT13_STUDY_ID, BC00124_A102TBT13_SUBJECT_ID, BC00124_A103TBT13_CRF_ID, BC00124_A938TBT13_CRF_EDA_NO, BC00124_A104TBT13_CRF_VERSION, BC00124_A105TBT13_CRF_ITEM_GRP_DIV, BC00124_A106TBT13_CRF_ITEM_GRP_CD, BC00124_A599TBT13_CRT_DATETIME, BC00124_n599TBT13_CRT_DATETIME, BC00124_A600TBT13_CRT_USER_ID,
            BC00124_n600TBT13_CRT_USER_ID, BC00124_A602TBT13_UPD_DATETIME, BC00124_n602TBT13_UPD_DATETIME, BC00124_A603TBT13_UPD_USER_ID, BC00124_n603TBT13_UPD_USER_ID, BC00124_A605TBT13_UPD_CNT, BC00124_n605TBT13_UPD_CNT, BC00124_A597TBT13_CRF_VALUE, BC00124_n597TBT13_CRF_VALUE, BC00124_A680TBT13_EDIT_FLG,
            BC00124_n680TBT13_EDIT_FLG, BC00124_A598TBT13_DEL_FLG, BC00124_n598TBT13_DEL_FLG, BC00124_A601TBT13_CRT_PROG_NM, BC00124_n601TBT13_CRT_PROG_NM, BC00124_A604TBT13_UPD_PROG_NM, BC00124_n604TBT13_UPD_PROG_NM
            }
            , new Object[] {
            BC00125_A101TBT13_STUDY_ID, BC00125_A102TBT13_SUBJECT_ID, BC00125_A103TBT13_CRF_ID, BC00125_A938TBT13_CRF_EDA_NO, BC00125_A104TBT13_CRF_VERSION, BC00125_A105TBT13_CRF_ITEM_GRP_DIV, BC00125_A106TBT13_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00129_A101TBT13_STUDY_ID, BC00129_A102TBT13_SUBJECT_ID, BC00129_A103TBT13_CRF_ID, BC00129_A938TBT13_CRF_EDA_NO, BC00129_A104TBT13_CRF_VERSION, BC00129_A105TBT13_CRF_ITEM_GRP_DIV, BC00129_A106TBT13_CRF_ITEM_GRP_CD, BC00129_A599TBT13_CRT_DATETIME, BC00129_n599TBT13_CRT_DATETIME, BC00129_A600TBT13_CRT_USER_ID,
            BC00129_n600TBT13_CRT_USER_ID, BC00129_A602TBT13_UPD_DATETIME, BC00129_n602TBT13_UPD_DATETIME, BC00129_A603TBT13_UPD_USER_ID, BC00129_n603TBT13_UPD_USER_ID, BC00129_A605TBT13_UPD_CNT, BC00129_n605TBT13_UPD_CNT, BC00129_A597TBT13_CRF_VALUE, BC00129_n597TBT13_CRF_VALUE, BC00129_A680TBT13_EDIT_FLG,
            BC00129_n680TBT13_EDIT_FLG, BC00129_A598TBT13_DEL_FLG, BC00129_n598TBT13_DEL_FLG, BC00129_A601TBT13_CRT_PROG_NM, BC00129_n601TBT13_CRT_PROG_NM, BC00129_A604TBT13_UPD_PROG_NM, BC00129_n604TBT13_UPD_PROG_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT13_CRF_RES_HIS_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e11122 */
      e11122 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z938TBT13_CRF_EDA_NO ;
   private byte A938TBT13_CRF_EDA_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z103TBT13_CRF_ID ;
   private short A103TBT13_CRF_ID ;
   private short Z104TBT13_CRF_VERSION ;
   private short A104TBT13_CRF_VERSION ;
   private short RcdFound58 ;
   private short Gx_err ;
   private int trnEnded ;
   private int Z102TBT13_SUBJECT_ID ;
   private int A102TBT13_SUBJECT_ID ;
   private int GX_JID ;
   private int GXActiveErrHndl ;
   private long Z101TBT13_STUDY_ID ;
   private long A101TBT13_STUDY_ID ;
   private long Z605TBT13_UPD_CNT ;
   private long A605TBT13_UPD_CNT ;
   private long O605TBT13_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode58 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date Z599TBT13_CRT_DATETIME ;
   private java.util.Date A599TBT13_CRT_DATETIME ;
   private java.util.Date Z602TBT13_UPD_DATETIME ;
   private java.util.Date A602TBT13_UPD_DATETIME ;
   private boolean n599TBT13_CRT_DATETIME ;
   private boolean n600TBT13_CRT_USER_ID ;
   private boolean n602TBT13_UPD_DATETIME ;
   private boolean n603TBT13_UPD_USER_ID ;
   private boolean n605TBT13_UPD_CNT ;
   private boolean n597TBT13_CRF_VALUE ;
   private boolean n680TBT13_EDIT_FLG ;
   private boolean n598TBT13_DEL_FLG ;
   private boolean n601TBT13_CRT_PROG_NM ;
   private boolean n604TBT13_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z105TBT13_CRF_ITEM_GRP_DIV ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String Z106TBT13_CRF_ITEM_GRP_CD ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String AV8W_BC_FLG ;
   private String Z600TBT13_CRT_USER_ID ;
   private String A600TBT13_CRT_USER_ID ;
   private String Z603TBT13_UPD_USER_ID ;
   private String A603TBT13_UPD_USER_ID ;
   private String Z597TBT13_CRF_VALUE ;
   private String A597TBT13_CRF_VALUE ;
   private String Z680TBT13_EDIT_FLG ;
   private String A680TBT13_EDIT_FLG ;
   private String Z598TBT13_DEL_FLG ;
   private String A598TBT13_DEL_FLG ;
   private String Z601TBT13_CRT_PROG_NM ;
   private String A601TBT13_CRT_PROG_NM ;
   private String Z604TBT13_UPD_PROG_NM ;
   private String A604TBT13_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT13_CRF_RES_HIS bcTBT13_CRF_RES_HIS ;
   private IDataStoreProvider pr_default ;
   private long[] BC00124_A101TBT13_STUDY_ID ;
   private int[] BC00124_A102TBT13_SUBJECT_ID ;
   private short[] BC00124_A103TBT13_CRF_ID ;
   private byte[] BC00124_A938TBT13_CRF_EDA_NO ;
   private short[] BC00124_A104TBT13_CRF_VERSION ;
   private String[] BC00124_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00124_A106TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC00124_A599TBT13_CRT_DATETIME ;
   private boolean[] BC00124_n599TBT13_CRT_DATETIME ;
   private String[] BC00124_A600TBT13_CRT_USER_ID ;
   private boolean[] BC00124_n600TBT13_CRT_USER_ID ;
   private java.util.Date[] BC00124_A602TBT13_UPD_DATETIME ;
   private boolean[] BC00124_n602TBT13_UPD_DATETIME ;
   private String[] BC00124_A603TBT13_UPD_USER_ID ;
   private boolean[] BC00124_n603TBT13_UPD_USER_ID ;
   private long[] BC00124_A605TBT13_UPD_CNT ;
   private boolean[] BC00124_n605TBT13_UPD_CNT ;
   private String[] BC00124_A597TBT13_CRF_VALUE ;
   private boolean[] BC00124_n597TBT13_CRF_VALUE ;
   private String[] BC00124_A680TBT13_EDIT_FLG ;
   private boolean[] BC00124_n680TBT13_EDIT_FLG ;
   private String[] BC00124_A598TBT13_DEL_FLG ;
   private boolean[] BC00124_n598TBT13_DEL_FLG ;
   private String[] BC00124_A601TBT13_CRT_PROG_NM ;
   private boolean[] BC00124_n601TBT13_CRT_PROG_NM ;
   private String[] BC00124_A604TBT13_UPD_PROG_NM ;
   private boolean[] BC00124_n604TBT13_UPD_PROG_NM ;
   private long[] BC00125_A101TBT13_STUDY_ID ;
   private int[] BC00125_A102TBT13_SUBJECT_ID ;
   private short[] BC00125_A103TBT13_CRF_ID ;
   private byte[] BC00125_A938TBT13_CRF_EDA_NO ;
   private short[] BC00125_A104TBT13_CRF_VERSION ;
   private String[] BC00125_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00125_A106TBT13_CRF_ITEM_GRP_CD ;
   private long[] BC00123_A101TBT13_STUDY_ID ;
   private int[] BC00123_A102TBT13_SUBJECT_ID ;
   private short[] BC00123_A103TBT13_CRF_ID ;
   private byte[] BC00123_A938TBT13_CRF_EDA_NO ;
   private short[] BC00123_A104TBT13_CRF_VERSION ;
   private String[] BC00123_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00123_A106TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC00123_A599TBT13_CRT_DATETIME ;
   private boolean[] BC00123_n599TBT13_CRT_DATETIME ;
   private String[] BC00123_A600TBT13_CRT_USER_ID ;
   private boolean[] BC00123_n600TBT13_CRT_USER_ID ;
   private java.util.Date[] BC00123_A602TBT13_UPD_DATETIME ;
   private boolean[] BC00123_n602TBT13_UPD_DATETIME ;
   private String[] BC00123_A603TBT13_UPD_USER_ID ;
   private boolean[] BC00123_n603TBT13_UPD_USER_ID ;
   private long[] BC00123_A605TBT13_UPD_CNT ;
   private boolean[] BC00123_n605TBT13_UPD_CNT ;
   private String[] BC00123_A597TBT13_CRF_VALUE ;
   private boolean[] BC00123_n597TBT13_CRF_VALUE ;
   private String[] BC00123_A680TBT13_EDIT_FLG ;
   private boolean[] BC00123_n680TBT13_EDIT_FLG ;
   private String[] BC00123_A598TBT13_DEL_FLG ;
   private boolean[] BC00123_n598TBT13_DEL_FLG ;
   private String[] BC00123_A601TBT13_CRT_PROG_NM ;
   private boolean[] BC00123_n601TBT13_CRT_PROG_NM ;
   private String[] BC00123_A604TBT13_UPD_PROG_NM ;
   private boolean[] BC00123_n604TBT13_UPD_PROG_NM ;
   private long[] BC00122_A101TBT13_STUDY_ID ;
   private int[] BC00122_A102TBT13_SUBJECT_ID ;
   private short[] BC00122_A103TBT13_CRF_ID ;
   private byte[] BC00122_A938TBT13_CRF_EDA_NO ;
   private short[] BC00122_A104TBT13_CRF_VERSION ;
   private String[] BC00122_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00122_A106TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC00122_A599TBT13_CRT_DATETIME ;
   private boolean[] BC00122_n599TBT13_CRT_DATETIME ;
   private String[] BC00122_A600TBT13_CRT_USER_ID ;
   private boolean[] BC00122_n600TBT13_CRT_USER_ID ;
   private java.util.Date[] BC00122_A602TBT13_UPD_DATETIME ;
   private boolean[] BC00122_n602TBT13_UPD_DATETIME ;
   private String[] BC00122_A603TBT13_UPD_USER_ID ;
   private boolean[] BC00122_n603TBT13_UPD_USER_ID ;
   private long[] BC00122_A605TBT13_UPD_CNT ;
   private boolean[] BC00122_n605TBT13_UPD_CNT ;
   private String[] BC00122_A597TBT13_CRF_VALUE ;
   private boolean[] BC00122_n597TBT13_CRF_VALUE ;
   private String[] BC00122_A680TBT13_EDIT_FLG ;
   private boolean[] BC00122_n680TBT13_EDIT_FLG ;
   private String[] BC00122_A598TBT13_DEL_FLG ;
   private boolean[] BC00122_n598TBT13_DEL_FLG ;
   private String[] BC00122_A601TBT13_CRT_PROG_NM ;
   private boolean[] BC00122_n601TBT13_CRT_PROG_NM ;
   private String[] BC00122_A604TBT13_UPD_PROG_NM ;
   private boolean[] BC00122_n604TBT13_UPD_PROG_NM ;
   private long[] BC00129_A101TBT13_STUDY_ID ;
   private int[] BC00129_A102TBT13_SUBJECT_ID ;
   private short[] BC00129_A103TBT13_CRF_ID ;
   private byte[] BC00129_A938TBT13_CRF_EDA_NO ;
   private short[] BC00129_A104TBT13_CRF_VERSION ;
   private String[] BC00129_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] BC00129_A106TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] BC00129_A599TBT13_CRT_DATETIME ;
   private boolean[] BC00129_n599TBT13_CRT_DATETIME ;
   private String[] BC00129_A600TBT13_CRT_USER_ID ;
   private boolean[] BC00129_n600TBT13_CRT_USER_ID ;
   private java.util.Date[] BC00129_A602TBT13_UPD_DATETIME ;
   private boolean[] BC00129_n602TBT13_UPD_DATETIME ;
   private String[] BC00129_A603TBT13_UPD_USER_ID ;
   private boolean[] BC00129_n603TBT13_UPD_USER_ID ;
   private long[] BC00129_A605TBT13_UPD_CNT ;
   private boolean[] BC00129_n605TBT13_UPD_CNT ;
   private String[] BC00129_A597TBT13_CRF_VALUE ;
   private boolean[] BC00129_n597TBT13_CRF_VALUE ;
   private String[] BC00129_A680TBT13_EDIT_FLG ;
   private boolean[] BC00129_n680TBT13_EDIT_FLG ;
   private String[] BC00129_A598TBT13_DEL_FLG ;
   private boolean[] BC00129_n598TBT13_DEL_FLG ;
   private String[] BC00129_A601TBT13_CRT_PROG_NM ;
   private boolean[] BC00129_n601TBT13_CRT_PROG_NM ;
   private String[] BC00129_A604TBT13_UPD_PROG_NM ;
   private boolean[] BC00129_n604TBT13_UPD_PROG_NM ;
}

final  class tbt13_crf_res_his_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00122", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00123", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC00124", "SELECT TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_EDA_NO`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD`, TM1.`TBT13_CRT_DATETIME`, TM1.`TBT13_CRT_USER_ID`, TM1.`TBT13_UPD_DATETIME`, TM1.`TBT13_UPD_USER_ID`, TM1.`TBT13_UPD_CNT`, TM1.`TBT13_CRF_VALUE`, TM1.`TBT13_EDIT_FLG`, TM1.`TBT13_DEL_FLG`, TM1.`TBT13_CRT_PROG_NM`, TM1.`TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` TM1 WHERE TM1.`TBT13_STUDY_ID` = ? and TM1.`TBT13_SUBJECT_ID` = ? and TM1.`TBT13_CRF_ID` = ? and TM1.`TBT13_CRF_EDA_NO` = ? and TM1.`TBT13_CRF_VERSION` = ? and TM1.`TBT13_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT13_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_EDA_NO`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("BC00125", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC00126", "INSERT INTO `TBT13_CRF_RES_HIS`(`TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC00127", "UPDATE `TBT13_CRF_RES_HIS` SET `TBT13_CRT_DATETIME`=?, `TBT13_CRT_USER_ID`=?, `TBT13_UPD_DATETIME`=?, `TBT13_UPD_USER_ID`=?, `TBT13_UPD_CNT`=?, `TBT13_CRF_VALUE`=?, `TBT13_EDIT_FLG`=?, `TBT13_DEL_FLG`=?, `TBT13_CRT_PROG_NM`=?, `TBT13_UPD_PROG_NM`=?  WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("BC00128", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("BC00129", "SELECT TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_EDA_NO`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD`, TM1.`TBT13_CRT_DATETIME`, TM1.`TBT13_CRT_USER_ID`, TM1.`TBT13_UPD_DATETIME`, TM1.`TBT13_UPD_USER_ID`, TM1.`TBT13_UPD_CNT`, TM1.`TBT13_CRF_VALUE`, TM1.`TBT13_EDIT_FLG`, TM1.`TBT13_DEL_FLG`, TM1.`TBT13_CRT_PROG_NM`, TM1.`TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` TM1 WHERE TM1.`TBT13_STUDY_ID` = ? and TM1.`TBT13_SUBJECT_ID` = ? and TM1.`TBT13_CRF_ID` = ? and TM1.`TBT13_CRF_EDA_NO` = ? and TM1.`TBT13_CRF_VERSION` = ? and TM1.`TBT13_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT13_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_EDA_NO`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[16]).longValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[18], 2000);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[26], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 2000);
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
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               stmt.setLong(11, ((Number) parms[20]).longValue());
               stmt.setInt(12, ((Number) parms[21]).intValue());
               stmt.setShort(13, ((Number) parms[22]).shortValue());
               stmt.setByte(14, ((Number) parms[23]).byteValue());
               stmt.setShort(15, ((Number) parms[24]).shortValue());
               stmt.setVarchar(16, (String)parms[25], 1, false);
               stmt.setVarchar(17, (String)parms[26], 50, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
      }
   }

}

