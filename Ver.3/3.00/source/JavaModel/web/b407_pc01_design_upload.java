/*
               File: B407_PC01_DESIGN_UPLOAD
        Description: CRF情報アップロード処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:54.14
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b407_pc01_design_upload extends GXProcedure
{
   public b407_pc01_design_upload( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b407_pc01_design_upload.class ), "" );
   }

   public b407_pc01_design_upload( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         String aP1 ,
                                         String aP2 ,
                                         long[] aP3 ,
                                         String[] aP4 ,
                                         boolean[] aP5 ,
                                         boolean[] aP6 ,
                                         boolean[] aP7 ,
                                         boolean[] aP8 ,
                                         boolean[] aP9 ,
                                         GxObjectCollection[] aP10 ,
                                         String[] aP11 ,
                                         String[] aP12 )
   {
      b407_pc01_design_upload.this.AV12P_FILE_NAME = aP0;
      b407_pc01_design_upload.this.AV50P_ORIGINAL_NAME = aP1;
      b407_pc01_design_upload.this.AV43P_FILE_EXT = aP2;
      b407_pc01_design_upload.this.aP3 = aP3;
      b407_pc01_design_upload.this.aP4 = aP4;
      b407_pc01_design_upload.this.aP5 = aP5;
      b407_pc01_design_upload.this.aP6 = aP6;
      b407_pc01_design_upload.this.aP7 = aP7;
      b407_pc01_design_upload.this.aP8 = aP8;
      b407_pc01_design_upload.this.aP9 = aP9;
      b407_pc01_design_upload.this.aP10 = aP10;
      b407_pc01_design_upload.this.aP11 = aP11;
      b407_pc01_design_upload.this.aP12 = aP12;
      b407_pc01_design_upload.this.aP13 = aP13;
      b407_pc01_design_upload.this.aP13 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP13[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        long[] aP3 ,
                        String[] aP4 ,
                        boolean[] aP5 ,
                        boolean[] aP6 ,
                        boolean[] aP7 ,
                        boolean[] aP8 ,
                        boolean[] aP9 ,
                        GxObjectCollection[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        GxObjectCollection[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             long[] aP3 ,
                             String[] aP4 ,
                             boolean[] aP5 ,
                             boolean[] aP6 ,
                             boolean[] aP7 ,
                             boolean[] aP8 ,
                             boolean[] aP9 ,
                             GxObjectCollection[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             GxObjectCollection[] aP13 )
   {
      b407_pc01_design_upload.this.AV12P_FILE_NAME = aP0;
      b407_pc01_design_upload.this.AV50P_ORIGINAL_NAME = aP1;
      b407_pc01_design_upload.this.AV43P_FILE_EXT = aP2;
      b407_pc01_design_upload.this.aP3 = aP3;
      b407_pc01_design_upload.this.aP4 = aP4;
      b407_pc01_design_upload.this.aP5 = aP5;
      b407_pc01_design_upload.this.aP6 = aP6;
      b407_pc01_design_upload.this.aP7 = aP7;
      b407_pc01_design_upload.this.aP8 = aP8;
      b407_pc01_design_upload.this.aP9 = aP9;
      b407_pc01_design_upload.this.aP10 = aP10;
      b407_pc01_design_upload.this.aP11 = aP11;
      b407_pc01_design_upload.this.aP12 = aP12;
      b407_pc01_design_upload.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11C_APP_ID = "B407" ;
      /* Execute user subroutine: S161 */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV39P_STUDY_ID = 0 ;
      AV40P_STUDY_NM = "" ;
      AV35P_BASE_ENABLED = false ;
      AV36P_LIST_ENABLED = false ;
      AV37P_SITE_ENABLED = false ;
      AV38P_STAFF_ENABLED = false ;
      AV41P_SUBJECT_ENABLED = false ;
      AV48W_FILE_PATH_NAME = "" ;
      AV16PO_ERRCD = "0" ;
      AV17PO_ERRMSG.clear();
      if ( GXutil.strcmp(AV16PO_ERRCD, "0") == 0 )
      {
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV16PO_ERRCD, "0") == 0 )
      {
         /* Execute user subroutine: S141 */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_SETTING' Routine */
      AV9W_FILE.setSource( AV12P_FILE_NAME );
      if ( ! AV9W_FILE.exists() || ( AV9W_FILE.getLength() == 0 ) )
      {
         AV16PO_ERRCD = "1" ;
         GXt_char1 = AV31W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00011", "", "", "", "", "", GXv_char2) ;
         b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
         AV31W_MSG = GXt_char1 ;
         AV17PO_ERRMSG.add(AV31W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV34W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
      AV34W_SYS_VALUE = GXt_char1 ;
      if ( GxRegex.IsMatch(AV34W_SYS_VALUE,"^\\d+$") )
      {
         AV30W_MAX_ERROR_COUNT = GXutil.lval( AV34W_SYS_VALUE) ;
      }
      else
      {
         AV30W_MAX_ERROR_COUNT = 100 ;
      }
      GXt_char1 = AV45W_FILE_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV42P_A_LOGIN_SDT, "", "CSV_UPLOAD_PATH", GXv_char2) ;
      b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
      AV45W_FILE_PATH = GXt_char1 ;
      AV48W_FILE_PATH_NAME = AV45W_FILE_PATH + AV50P_ORIGINAL_NAME ;
      if ( GXutil.strcmp(AV43P_FILE_EXT, ".zip") == 0 )
      {
         AV52W_ZIP_PATH = GXutil.strReplace( AV50P_ORIGINAL_NAME, ".zip", "") ;
      }
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
      AV9W_FILE.setSource( AV12P_FILE_NAME );
      AV9W_FILE.copy(AV48W_FILE_PATH_NAME);
      AV9W_FILE.close();
      if ( GXutil.strcmp(AV43P_FILE_EXT, ".zip") == 0 )
      {
         AV52W_ZIP_PATH = GXutil.strReplace( AV50P_ORIGINAL_NAME, ".zip", "") ;
         /* Execute user subroutine: S131 */
         S131 ();
         if (returnInSub) return;
         AV44W_ERRFLG = AV46WeZipFile.unzip(AV48W_FILE_PATH_NAME, AV45W_FILE_PATH) ;
         if ( ! AV44W_ERRFLG )
         {
            AV16PO_ERRCD = "1" ;
            GXt_char1 = AV31W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00002", "選択したZIPファイル", "", "", "", "", GXv_char2) ;
            b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
            AV31W_MSG = GXt_char1 ;
            AV17PO_ERRMSG.add(AV31W_MSG, 0);
         }
         else
         {
            AV47W_FILE_NAME = GXutil.strReplace( AV50P_ORIGINAL_NAME, ".zip", ".csv") ;
            AV48W_FILE_PATH_NAME = AV45W_FILE_PATH + AV52W_ZIP_PATH + "/" + AV47W_FILE_NAME ;
            AV9W_FILE.setSource( AV48W_FILE_PATH_NAME );
            if ( ! AV9W_FILE.exists() )
            {
               AV16PO_ERRCD = "1" ;
               GXt_char1 = AV31W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00002", "選択したZIPファイル", "", "", "", "", GXv_char2) ;
               b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
               AV31W_MSG = GXt_char1 ;
               AV17PO_ERRMSG.add(AV31W_MSG, 0);
            }
            else
            {
               AV48W_FILE_PATH_NAME = AV45W_FILE_PATH + AV47W_FILE_NAME ;
               AV9W_FILE.rename(AV48W_FILE_PATH_NAME);
               AV9W_FILE.close();
            }
         }
         /* Execute user subroutine: S131 */
         S131 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'SUB_EXIST_FILE_DEL' Routine */
      AV54W_DEL_FILE_NAME = AV48W_FILE_PATH_NAME ;
      AV53W_FILE_DEL.setSource( AV54W_DEL_FILE_NAME );
      if ( AV53W_FILE_DEL.exists() )
      {
         AV53W_FILE_DEL.delete();
      }
      AV53W_FILE_DEL.close();
      if ( GXutil.strcmp(AV43P_FILE_EXT, ".zip") == 0 )
      {
         /* Execute user subroutine: S131 */
         S131 ();
         if (returnInSub) return;
         AV54W_DEL_FILE_NAME = GXutil.strReplace( AV54W_DEL_FILE_NAME, ".zip", ".csv") ;
         AV53W_FILE_DEL.setSource( AV54W_DEL_FILE_NAME );
         if ( AV53W_FILE_DEL.exists() )
         {
            AV53W_FILE_DEL.delete();
         }
         AV53W_FILE_DEL.close();
      }
   }

   public void S131( )
   {
      /* 'SUB_UNZIP_DIR_DEL' Routine */
      AV51W_FILE_DIR.setSource( AV45W_FILE_PATH+AV52W_ZIP_PATH );
      if ( AV51W_FILE_DIR.exists() )
      {
         AV58GXV2 = 1 ;
         AV57GXV1 = (com.genexus.util.GXFileCollection)AV51W_FILE_DIR.getFiles("");
         while ( AV58GXV2 <= AV57GXV1.getItemCount() )
         {
            AV53W_FILE_DEL = (com.genexus.util.GXFile)AV57GXV1.item(AV58GXV2);
            AV53W_FILE_DEL.delete();
            AV58GXV2 = (int)(AV58GXV2+1) ;
         }
         AV51W_FILE_DIR.delete();
      }
   }

   public void S141( )
   {
      /* 'SUB_READ_FILE' Routine */
      AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfropen( AV48W_FILE_PATH_NAME, 16536, "", "", "UTF-8") ;
      /* Execute user subroutine: S151 */
      S151 ();
      if (returnInSub) return;
      AV13W_TABLE_NM = "" ;
      AV21W_CNT = 0 ;
      while ( context.getSessionInstances().getDelimitedFiles().dfrnext( ) == 0 )
      {
         AV21W_CNT = (long)(AV21W_CNT+1) ;
         AV29W_LINE_MSG = GXutil.trim( GXutil.str( AV21W_CNT, 10, 0)) + "行目：" ;
         GXv_char2[0] = AV23W_CSV_DATA ;
         GXt_int3 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char2, (short)(1000000)) ;
         AV23W_CSV_DATA = GXv_char2[0] ;
         AV27W_FILE_HANDLE = GXt_int3 ;
         if ( AV27W_FILE_HANDLE == -5 )
         {
            AV16PO_ERRCD = "1" ;
            GXt_char1 = AV31W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "ファイル", "", "", "", "", GXv_char2) ;
            b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
            AV31W_MSG = AV29W_LINE_MSG + GXt_char1 ;
            AV17PO_ERRMSG.add(AV31W_MSG, 0);
         }
         else
         {
            /* Execute user subroutine: S151 */
            S151 ();
            if (returnInSub) return;
         }
         if ( AV27W_FILE_HANDLE == 0 )
         {
            GXv_objcol_svchar4[0] = AV22W_CSV_COL ;
            GXv_int5[0] = AV24W_ERR_CD ;
            GXv_char2[0] = AV31W_MSG ;
            new b807_pc04_csv_col_parse_sdel(remoteHandle, context).execute( AV23W_CSV_DATA, 0, "CSV", GXv_objcol_svchar4, GXv_int5, GXv_char2) ;
            AV22W_CSV_COL = GXv_objcol_svchar4[0] ;
            b407_pc01_design_upload.this.AV24W_ERR_CD = GXv_int5[0] ;
            b407_pc01_design_upload.this.AV31W_MSG = GXv_char2[0] ;
            if ( AV24W_ERR_CD != 0 )
            {
               AV16PO_ERRCD = "1" ;
               AV31W_MSG = AV29W_LINE_MSG + AV31W_MSG ;
               AV17PO_ERRMSG.add(AV31W_MSG, 0);
            }
            else
            {
               if ( GXutil.strcmp((String)AV22W_CSV_COL.elementAt(-1+1), "S") == 0 )
               {
                  AV39P_STUDY_ID = GXutil.lval( (String)AV22W_CSV_COL.elementAt(-1+2)) ;
                  AV40P_STUDY_NM = (String)AV22W_CSV_COL.elementAt(-1+3) ;
               }
               else if ( GXutil.strcmp((String)AV22W_CSV_COL.elementAt(-1+1), "H") == 0 )
               {
                  AV13W_TABLE_NM = (String)AV22W_CSV_COL.elementAt(-1+2) ;
                  if ( (GXutil.strcmp("", AV13W_TABLE_NM)==0) )
                  {
                     AV16PO_ERRCD = "1" ;
                     GXt_char1 = AV31W_MSG ;
                     GXv_char2[0] = GXt_char1 ;
                     new a805_pc01_msg_get(remoteHandle, context).execute( "AE01012", AV29W_LINE_MSG, "", "", "", "", GXv_char2) ;
                     b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
                     AV31W_MSG = GXt_char1 ;
                     AV17PO_ERRMSG.add(AV31W_MSG, 0);
                  }
                  if ( GXutil.strcmp(AV13W_TABLE_NM, "TBM21_STUDY") == 0 )
                  {
                     AV35P_BASE_ENABLED = true ;
                  }
                  else if ( GXutil.strcmp(AV13W_TABLE_NM, "TBM22_STUDY_SITE") == 0 )
                  {
                     AV37P_SITE_ENABLED = true ;
                  }
                  else if ( GXutil.strcmp(AV13W_TABLE_NM, "TBM23_STUDY_STAFF") == 0 )
                  {
                     AV38P_STAFF_ENABLED = true ;
                  }
                  else if ( ( GXutil.strcmp(AV13W_TABLE_NM, "TBM25_SEL_LIST") == 0 ) || ( GXutil.strcmp(AV13W_TABLE_NM, "TBM26_SEL_LIST_ITEM") == 0 ) )
                  {
                     AV36P_LIST_ENABLED = true ;
                  }
                  else if ( ( GXutil.strcmp(AV13W_TABLE_NM, "TBT01_SUBJECT") == 0 ) || ( GXutil.strcmp(AV13W_TABLE_NM, "TBT02_CRF") == 0 ) || ( GXutil.strcmp(AV13W_TABLE_NM, "TBT11_CRF_HISTORY") == 0 ) || ( GXutil.strcmp(AV13W_TABLE_NM, "TBT12_CRF_RESULT") == 0 ) || ( GXutil.strcmp(AV13W_TABLE_NM, "TBT13_CRF_RES_HIS") == 0 ) || ( GXutil.strcmp(AV13W_TABLE_NM, "TBT14_CRF_MEMO") == 0 ) || ( GXutil.strcmp(AV13W_TABLE_NM, "TBT15_CRF_MEMO_LOC") == 0 ) )
                  {
                     AV41P_SUBJECT_ENABLED = true ;
                  }
               }
               else if ( GXutil.strcmp((String)AV22W_CSV_COL.elementAt(-1+1), "D") == 0 )
               {
                  if ( ! (GXutil.strcmp("", AV13W_TABLE_NM)==0) )
                  {
                     if ( GXutil.strcmp(AV13W_TABLE_NM, "TBM31_CRF") == 0 )
                     {
                        AV10B407_SD01_IMPORT_LIST_I = (SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)new SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem(remoteHandle, context);
                        AV10B407_SD01_IMPORT_LIST_I.setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id( (String)AV22W_CSV_COL.elementAt(-1+3) );
                        AV10B407_SD01_IMPORT_LIST_I.setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm( (String)AV22W_CSV_COL.elementAt(-1+4) );
                        AV15PO_B407_SD01_IMPORT_LIST_C.add(AV10B407_SD01_IMPORT_LIST_I, 0);
                     }
                  }
               }
               else
               {
                  AV16PO_ERRCD = "1" ;
                  GXt_char1 = AV31W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "ファイル", "", "", "", "", GXv_char2) ;
                  b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
                  AV31W_MSG = GXt_char1 ;
                  AV17PO_ERRMSG.add(AV31W_MSG, 0);
                  if (true) break;
               }
            }
         }
         if ( AV17PO_ERRMSG.size() > AV30W_MAX_ERROR_COUNT )
         {
            AV16PO_ERRCD = "1" ;
            GXt_char1 = AV31W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00044", GXutil.trim( GXutil.str( AV30W_MAX_ERROR_COUNT, 10, 0)), "", "", "", "", GXv_char2) ;
            b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
            AV31W_MSG = GXt_char1 ;
            AV17PO_ERRMSG.add(AV31W_MSG, 0);
            if (true) break;
         }
      }
      AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
   }

   public void S151( )
   {
      /* 'SUB_FILE_HANDLE_CHECK' Routine */
      if ( AV27W_FILE_HANDLE != 0 )
      {
         AV16PO_ERRCD = "1" ;
         AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
         GXt_char1 = AV31W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
         b407_pc01_design_upload.this.GXt_char1 = GXv_char2[0] ;
         AV31W_MSG = GXt_char1 ;
         AV17PO_ERRMSG.add(AV31W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S161( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV8W_A_LOGIN_SDT;
      GXv_char2[0] = AV16PO_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char2) ;
      AV8W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b407_pc01_design_upload.this.AV16PO_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV16PO_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S171( )
   {
      /* 'SUB_ERROR' Routine */
      AV26W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV26W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV11C_APP_ID );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV32W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV32W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_FILE_NAME" );
      AV32W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_FILE_NAME );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV32W_PARMS_ITEM, 0);
      AV31W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO7[0] = AV26W_EXTRA_INFO;
      GXv_int5[0] = AV24W_ERR_CD ;
      GXv_char2[0] = AV25W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV63Pgmname, (short)(0), AV31W_MSG, GXv_SdtB808_SD01_EXTRA_INFO7, GXv_int5, GXv_char2) ;
      AV26W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO7[0] ;
      b407_pc01_design_upload.this.AV24W_ERR_CD = GXv_int5[0] ;
      b407_pc01_design_upload.this.AV25W_ERR_MSG = GXv_char2[0] ;
      if ( AV24W_ERR_CD != 0 )
      {
         AV17PO_ERRMSG.add(AV25W_ERR_MSG, 0);
      }
      Application.rollback(context, remoteHandle, "DEFAULT", "b407_pc01_design_upload");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b407_pc01_design_upload.this.AV39P_STUDY_ID;
      this.aP4[0] = b407_pc01_design_upload.this.AV40P_STUDY_NM;
      this.aP5[0] = b407_pc01_design_upload.this.AV35P_BASE_ENABLED;
      this.aP6[0] = b407_pc01_design_upload.this.AV37P_SITE_ENABLED;
      this.aP7[0] = b407_pc01_design_upload.this.AV38P_STAFF_ENABLED;
      this.aP8[0] = b407_pc01_design_upload.this.AV36P_LIST_ENABLED;
      this.aP9[0] = b407_pc01_design_upload.this.AV41P_SUBJECT_ENABLED;
      this.aP10[0] = b407_pc01_design_upload.this.AV15PO_B407_SD01_IMPORT_LIST_C;
      this.aP11[0] = b407_pc01_design_upload.this.AV48W_FILE_PATH_NAME;
      this.aP12[0] = b407_pc01_design_upload.this.AV16PO_ERRCD;
      this.aP13[0] = b407_pc01_design_upload.this.AV17PO_ERRMSG;
      CloseOpenCursors();
      exitApplication();
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
               case 1 :
                  /* Execute user subroutine: S171 */
                  S171 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV40P_STUDY_NM = "" ;
      AV15PO_B407_SD01_IMPORT_LIST_C = new GxObjectCollection(SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem.class, "B407_SD01_IMPORT_LIST.B407_SD01_IMPORT_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV48W_FILE_PATH_NAME = "" ;
      AV16PO_ERRCD = "" ;
      AV17PO_ERRMSG = new GxObjectCollection(String.class, "internal", "");
      AV11C_APP_ID = "" ;
      AV9W_FILE = new com.genexus.util.GXFile();
      AV31W_MSG = "" ;
      AV34W_SYS_VALUE = "" ;
      AV45W_FILE_PATH = "" ;
      AV42P_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV52W_ZIP_PATH = "" ;
      AV46WeZipFile = new SdtWeZipFile(remoteHandle, context);
      AV47W_FILE_NAME = "" ;
      AV54W_DEL_FILE_NAME = "" ;
      AV53W_FILE_DEL = new com.genexus.util.GXFile();
      AV51W_FILE_DIR = new com.genexus.util.GXDirectory();
      AV57GXV1 = new com.genexus.util.GXFileCollection();
      AV13W_TABLE_NM = "" ;
      AV29W_LINE_MSG = "" ;
      AV23W_CSV_DATA = "" ;
      AV22W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_svchar4 = new GxObjectCollection [1] ;
      AV10B407_SD01_IMPORT_LIST_I = new SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem(remoteHandle, context);
      GXt_char1 = "" ;
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV26W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV32W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV63Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO7 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      AV25W_ERR_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b407_pc01_design_upload__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV63Pgmname = "B407_PC01_DESIGN_UPLOAD" ;
      /* GeneXus formulas. */
      AV63Pgmname = "B407_PC01_DESIGN_UPLOAD" ;
      Gx_err = (short)(0) ;
   }

   private short AV27W_FILE_HANDLE ;
   private short GXt_int3 ;
   private short AV24W_ERR_CD ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV58GXV2 ;
   private int GXActiveErrHndl ;
   private long AV39P_STUDY_ID ;
   private long AV30W_MAX_ERROR_COUNT ;
   private long AV21W_CNT ;
   private String GXt_char1 ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String AV63Pgmname ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private boolean AV35P_BASE_ENABLED ;
   private boolean AV37P_SITE_ENABLED ;
   private boolean AV38P_STAFF_ENABLED ;
   private boolean AV36P_LIST_ENABLED ;
   private boolean AV41P_SUBJECT_ENABLED ;
   private boolean returnInSub ;
   private boolean AV44W_ERRFLG ;
   private String AV12P_FILE_NAME ;
   private String AV50P_ORIGINAL_NAME ;
   private String AV43P_FILE_EXT ;
   private String AV40P_STUDY_NM ;
   private String AV48W_FILE_PATH_NAME ;
   private String AV16PO_ERRCD ;
   private String AV11C_APP_ID ;
   private String AV31W_MSG ;
   private String AV34W_SYS_VALUE ;
   private String AV45W_FILE_PATH ;
   private String AV52W_ZIP_PATH ;
   private String AV47W_FILE_NAME ;
   private String AV54W_DEL_FILE_NAME ;
   private String AV13W_TABLE_NM ;
   private String AV29W_LINE_MSG ;
   private String AV23W_CSV_DATA ;
   private String AV25W_ERR_MSG ;
   private com.genexus.util.GXFile AV9W_FILE ;
   private com.genexus.util.GXFile AV53W_FILE_DEL ;
   private com.genexus.util.GXDirectory AV51W_FILE_DIR ;
   private SdtWeZipFile AV46WeZipFile ;
   private long[] aP3 ;
   private String[] aP4 ;
   private boolean[] aP5 ;
   private boolean[] aP6 ;
   private boolean[] aP7 ;
   private boolean[] aP8 ;
   private boolean[] aP9 ;
   private GxObjectCollection[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private GxObjectCollection[] aP13 ;
   private IDataStoreProvider pr_default ;
   private com.genexus.util.GXFileCollection AV57GXV1 ;
   private GxObjectCollection AV15PO_B407_SD01_IMPORT_LIST_C ;
   private GxObjectCollection AV17PO_ERRMSG ;
   private GxObjectCollection AV22W_CSV_COL ;
   private GxObjectCollection GXv_objcol_svchar4[] ;
   private SdtA_LOGIN_SDT AV42P_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem AV10B407_SD01_IMPORT_LIST_I ;
   private SdtB808_SD01_EXTRA_INFO AV26W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO7[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV32W_PARMS_ITEM ;
}

final  class b407_pc01_design_upload__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

