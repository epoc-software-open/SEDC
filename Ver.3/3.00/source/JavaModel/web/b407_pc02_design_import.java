/*
               File: B407_PC02_DESIGN_IMPORT
        Description: CRF情報インポート処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:56.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b407_pc02_design_import extends GXProcedure
{
   public b407_pc02_design_import( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b407_pc02_design_import.class ), "" );
   }

   public b407_pc02_design_import( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         long aP1 ,
                                         long aP2 ,
                                         boolean aP3 ,
                                         boolean aP4 ,
                                         boolean aP5 ,
                                         boolean aP6 ,
                                         boolean aP7 ,
                                         GxObjectCollection aP8 ,
                                         String[] aP9 )
   {
      b407_pc02_design_import.this.AV10P_FILE_NAME = aP0;
      b407_pc02_design_import.this.AV45P_STUDY_ID = aP1;
      b407_pc02_design_import.this.AV44P_CHG_STUDY_ID = aP2;
      b407_pc02_design_import.this.AV38P_BASE_FLG = aP3;
      b407_pc02_design_import.this.AV40P_SITE_FLG = aP4;
      b407_pc02_design_import.this.AV41P_STAFF_FLG = aP5;
      b407_pc02_design_import.this.AV39P_LIST_CHK = aP6;
      b407_pc02_design_import.this.AV42P_SUBJECT_CHK = aP7;
      b407_pc02_design_import.this.AV37B407_SD01_IMPORT_LIST_C = aP8;
      b407_pc02_design_import.this.aP9 = aP9;
      b407_pc02_design_import.this.aP10 = aP10;
      b407_pc02_design_import.this.aP10 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP10[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        long aP2 ,
                        boolean aP3 ,
                        boolean aP4 ,
                        boolean aP5 ,
                        boolean aP6 ,
                        boolean aP7 ,
                        GxObjectCollection aP8 ,
                        String[] aP9 ,
                        GxObjectCollection[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             long aP2 ,
                             boolean aP3 ,
                             boolean aP4 ,
                             boolean aP5 ,
                             boolean aP6 ,
                             boolean aP7 ,
                             GxObjectCollection aP8 ,
                             String[] aP9 ,
                             GxObjectCollection[] aP10 )
   {
      b407_pc02_design_import.this.AV10P_FILE_NAME = aP0;
      b407_pc02_design_import.this.AV45P_STUDY_ID = aP1;
      b407_pc02_design_import.this.AV44P_CHG_STUDY_ID = aP2;
      b407_pc02_design_import.this.AV38P_BASE_FLG = aP3;
      b407_pc02_design_import.this.AV40P_SITE_FLG = aP4;
      b407_pc02_design_import.this.AV41P_STAFF_FLG = aP5;
      b407_pc02_design_import.this.AV39P_LIST_CHK = aP6;
      b407_pc02_design_import.this.AV42P_SUBJECT_CHK = aP7;
      b407_pc02_design_import.this.AV37B407_SD01_IMPORT_LIST_C = aP8;
      b407_pc02_design_import.this.aP9 = aP9;
      b407_pc02_design_import.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9C_APP_ID = "B407" ;
      /* Execute user subroutine: S431 */
      S431 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13PO_ERRCD = "0" ;
      AV14PO_ERRMSG.clear();
      GXt_char1 = AV36W_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      b407_pc02_design_import.this.GXt_char1 = GXv_char2[0] ;
      AV36W_USER_ID = GXt_char1 ;
      AV35W_UPDATE_TIME = GXutil.now( ) ;
      AV34W_UPD_CNT = 1 ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
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
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /* Execute user subroutine: S131 */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b407_pc02_design_import");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b407_pc02_design_import");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_SETTING' Routine */
      AV22W_FILE.setSource( AV10P_FILE_NAME );
      if ( ! AV22W_FILE.exists() || ( AV22W_FILE.getLength() == 0 ) )
      {
         AV13PO_ERRCD = "1" ;
         GXt_char1 = AV27W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00011", "", "", "", "", "", GXv_char2) ;
         b407_pc02_design_import.this.GXt_char1 = GXv_char2[0] ;
         AV27W_MSG = GXt_char1 ;
         AV14PO_ERRMSG.add(AV27W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
      if ( (0==AV44P_CHG_STUDY_ID) )
      {
         AV30W_STUDY_ID = AV45P_STUDY_ID ;
      }
      else
      {
         AV30W_STUDY_ID = AV44P_CHG_STUDY_ID ;
      }
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'SUB_READ_FILE' Routine */
      AV23W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfropen( AV10P_FILE_NAME, 16536, "", "", "UTF-8") ;
      /* Execute user subroutine: S141 */
      S141 ();
      if (returnInSub) return;
      AV33W_TABLE_NM = "" ;
      AV16W_CNT = 0 ;
      while ( context.getSessionInstances().getDelimitedFiles().dfrnext( ) == 0 )
      {
         GXv_char2[0] = AV19W_CSV_DATA ;
         GXt_int3 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char2, (short)(1000000)) ;
         AV19W_CSV_DATA = GXv_char2[0] ;
         AV23W_FILE_HANDLE = GXt_int3 ;
         AV16W_CNT = (long)(AV16W_CNT+1) ;
         AV24W_LINE_MSG = GXutil.trim( GXutil.str( AV16W_CNT, 10, 0)) + "行目：" ;
         if ( AV23W_FILE_HANDLE == 0 )
         {
            GXv_objcol_svchar4[0] = AV18W_CSV_COL ;
            GXv_int5[0] = AV20W_ERR_CD ;
            GXv_char2[0] = AV27W_MSG ;
            new b807_pc05_csv_col_parse_sdel_esc(remoteHandle, context).execute( AV19W_CSV_DATA, 0, "CSV", GXv_objcol_svchar4, GXv_int5, GXv_char2) ;
            AV18W_CSV_COL = GXv_objcol_svchar4[0] ;
            b407_pc02_design_import.this.AV20W_ERR_CD = GXv_int5[0] ;
            b407_pc02_design_import.this.AV27W_MSG = GXv_char2[0] ;
            if ( AV20W_ERR_CD != 0 )
            {
               AV13PO_ERRCD = "1" ;
               AV27W_MSG = AV24W_LINE_MSG + AV27W_MSG ;
               AV14PO_ERRMSG.add(AV27W_MSG, 0);
            }
            else
            {
               if ( GXutil.strcmp((String)AV18W_CSV_COL.elementAt(-1+1), "S") == 0 )
               {
               }
               else if ( GXutil.strcmp((String)AV18W_CSV_COL.elementAt(-1+1), "H") == 0 )
               {
                  AV33W_TABLE_NM = (String)AV18W_CSV_COL.elementAt(-1+2) ;
                  if ( (GXutil.strcmp("", AV33W_TABLE_NM)==0) )
                  {
                     AV13PO_ERRCD = "1" ;
                     GXt_char1 = AV27W_MSG ;
                     GXv_char2[0] = GXt_char1 ;
                     new a805_pc01_msg_get(remoteHandle, context).execute( "AE01012", AV24W_LINE_MSG, "", "", "", "", GXv_char2) ;
                     b407_pc02_design_import.this.GXt_char1 = GXv_char2[0] ;
                     AV27W_MSG = GXt_char1 ;
                     AV14PO_ERRMSG.add(AV27W_MSG, 0);
                  }
               }
               else if ( GXutil.strcmp((String)AV18W_CSV_COL.elementAt(-1+1), "D") == 0 )
               {
                  if ( ! (GXutil.strcmp("", AV33W_TABLE_NM)==0) )
                  {
                     /* Execute user subroutine: S151 */
                     S151 ();
                     if (returnInSub) return;
                  }
               }
            }
         }
         if ( GXutil.strcmp(AV13PO_ERRCD, "1") == 0 )
         {
            if (true) break;
         }
      }
      AV23W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
   }

   public void S141( )
   {
      /* 'SUB_FILE_HANDLE_CHECK' Routine */
      if ( AV23W_FILE_HANDLE != 0 )
      {
         AV13PO_ERRCD = "1" ;
         AV23W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
         GXt_char1 = AV27W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
         b407_pc02_design_import.this.GXt_char1 = GXv_char2[0] ;
         AV27W_MSG = GXt_char1 ;
         AV14PO_ERRMSG.add(AV27W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S121( )
   {
      /* 'SUB_DATA_DELETE' Routine */
      if ( AV38P_BASE_FLG )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBM21_STUDY" ;
         /* Using cursor P007E2 */
         pr_default.execute(0, new Object[] {new Long(AV30W_STUDY_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM21_STUDY") ;
         /* End optimized DELETE. */
      }
      if ( AV40P_SITE_FLG )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBM22_STUDY_SITE" ;
         /* Using cursor P007E3 */
         pr_default.execute(1, new Object[] {new Long(AV30W_STUDY_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM22_STUDY_SITE") ;
         /* End optimized DELETE. */
      }
      if ( AV41P_STAFF_FLG )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBM23_STUDY_STAFF" ;
         /* Using cursor P007E4 */
         pr_default.execute(2, new Object[] {new Long(AV30W_STUDY_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM23_STUDY_STAFF") ;
         /* End optimized DELETE. */
      }
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM24_MAP_ITEM" ;
      /* Using cursor P007E5 */
      pr_default.execute(3, new Object[] {new Long(AV30W_STUDY_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM24_MAP_ITEM") ;
      /* End optimized DELETE. */
      if ( AV39P_LIST_CHK )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBM25_SEL_LIST" ;
         /* Using cursor P007E6 */
         pr_default.execute(4, new Object[] {new Long(AV30W_STUDY_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM25_SEL_LIST") ;
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBM26_SEL_LIST_ITEM" ;
         /* Using cursor P007E7 */
         pr_default.execute(5, new Object[] {new Long(AV30W_STUDY_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM26_SEL_LIST_ITEM") ;
         /* End optimized DELETE. */
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV37B407_SD01_IMPORT_LIST_C.size() )
      {
         AV8B407_SD01_IMPORT_LIST_I = (SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV37B407_SD01_IMPORT_LIST_C.elementAt(-1+AV55GXV1));
         if ( AV8B407_SD01_IMPORT_LIST_I.getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check() )
         {
            AV17W_CRF_ID = (short)(GXutil.lval( AV8B407_SD01_IMPORT_LIST_I.getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id())) ;
            /* Execute user subroutine: S161 */
            S161 ();
            if (returnInSub) return;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
      AV17W_CRF_ID = (short)(9999) ;
      /* Execute user subroutine: S161 */
      S161 ();
      if (returnInSub) return;
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM42_STUDY_CDISC_DOMAIN" ;
      /* Using cursor P007E8 */
      pr_default.execute(6, new Object[] {new Long(AV30W_STUDY_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM42_STUDY_CDISC_DOMAIN") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM43_STUDY_CDISC_ITEM" ;
      /* Using cursor P007E9 */
      pr_default.execute(7, new Object[] {new Long(AV30W_STUDY_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM43_STUDY_CDISC_ITEM") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM45_CRF_FILETR" ;
      /* Using cursor P007E10 */
      pr_default.execute(8, new Object[] {new Long(AV30W_STUDY_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
      /* End optimized DELETE. */
   }

   public void S161( )
   {
      /* 'SUB_DEL_CRF_DESIGN' Routine */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM31_CRF" ;
      /* Using cursor P007E11 */
      pr_default.execute(9, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM31_CRF") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM32_CRF_ITEM" ;
      /* Using cursor P007E12 */
      pr_default.execute(10, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM33_CRF_COND" ;
      /* Using cursor P007E13 */
      pr_default.execute(11, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM34_CRF_AUTH" ;
      /* Using cursor P007E14 */
      pr_default.execute(12, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM34_CRF_AUTH") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM35_CRF_ITEM_AUTH" ;
      /* Using cursor P007E15 */
      pr_default.execute(13, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM35_CRF_ITEM_AUTH") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM36_CRF_SELECT" ;
      /* Using cursor P007E16 */
      pr_default.execute(14, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM36_CRF_SELECT") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM37_CRF_DOM_MAP" ;
      /* Using cursor P007E17 */
      pr_default.execute(15, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM37_CRF_DOM_MAP") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM41_CRF_NCM_MAP" ;
      /* Using cursor P007E18 */
      pr_default.execute(16, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM41_CRF_NCM_MAP") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBM44_CRF_VISIT" ;
      /* Using cursor P007E19 */
      pr_default.execute(17, new Object[] {new Long(AV30W_STUDY_ID), new Short(AV17W_CRF_ID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM44_CRF_VISIT") ;
      /* End optimized DELETE. */
   }

   public void S151( )
   {
      /* 'SUB_DATA_IMPORT' Routine */
      if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM21_STUDY") == 0 )
      {
         if ( AV38P_BASE_FLG )
         {
            /* Execute user subroutine: S171 */
            S171 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM22_STUDY_SITE") == 0 )
      {
         if ( AV40P_SITE_FLG )
         {
            /* Execute user subroutine: S181 */
            S181 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM23_STUDY_STAFF") == 0 )
      {
         if ( AV41P_STAFF_FLG )
         {
            /* Execute user subroutine: S191 */
            S191 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM24_MAP_ITEM") == 0 )
      {
         /* Execute user subroutine: S201 */
         S201 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM25_SEL_LIST") == 0 )
      {
         if ( AV39P_LIST_CHK )
         {
            /* Execute user subroutine: S211 */
            S211 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM26_SEL_LIST_ITEM") == 0 )
      {
         if ( AV39P_LIST_CHK )
         {
            /* Execute user subroutine: S221 */
            S221 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM31_CRF") == 0 )
      {
         /* Execute user subroutine: S231 */
         S231 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM32_CRF_ITEM") == 0 )
      {
         /* Execute user subroutine: S241 */
         S241 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM33_CRF_COND") == 0 )
      {
         /* Execute user subroutine: S251 */
         S251 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM34_CRF_AUTH") == 0 )
      {
         /* Execute user subroutine: S261 */
         S261 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM35_CRF_ITEM_AUTH") == 0 )
      {
         /* Execute user subroutine: S271 */
         S271 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM36_CRF_SELECT") == 0 )
      {
         /* Execute user subroutine: S281 */
         S281 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM37_CRF_DOM_MAP") == 0 )
      {
         /* Execute user subroutine: S291 */
         S291 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM41_CRF_NCM_MAP") == 0 )
      {
         /* Execute user subroutine: S301 */
         S301 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM42_STUDY_CDISC_DOMAIN") == 0 )
      {
         /* Execute user subroutine: S311 */
         S311 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM43_STUDY_CDISC_ITEM") == 0 )
      {
         /* Execute user subroutine: S321 */
         S321 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM44_CRF_VISIT") == 0 )
      {
         /* Execute user subroutine: S331 */
         S331 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBM45_CRF_FILETR") == 0 )
      {
         /* Execute user subroutine: S341 */
         S341 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBT01_SUBJECT") == 0 )
      {
         if ( AV42P_SUBJECT_CHK )
         {
            /* Execute user subroutine: S351 */
            S351 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBT02_CRF") == 0 )
      {
         if ( AV42P_SUBJECT_CHK )
         {
            /* Execute user subroutine: S361 */
            S361 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBT11_CRF_HISTORY") == 0 )
      {
         if ( AV42P_SUBJECT_CHK )
         {
            /* Execute user subroutine: S371 */
            S371 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBT12_CRF_RESULT") == 0 )
      {
         if ( AV42P_SUBJECT_CHK )
         {
            /* Execute user subroutine: S381 */
            S381 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBT13_CRF_RES_HIS") == 0 )
      {
         if ( AV42P_SUBJECT_CHK )
         {
            /* Execute user subroutine: S391 */
            S391 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBT14_CRF_MEMO") == 0 )
      {
         if ( AV42P_SUBJECT_CHK )
         {
            /* Execute user subroutine: S401 */
            S401 ();
            if (returnInSub) return;
         }
      }
      else if ( GXutil.strcmp(AV33W_TABLE_NM, "TBT15_CRF_MEMO_LOC") == 0 )
      {
         if ( AV42P_SUBJECT_CHK )
         {
            /* Execute user subroutine: S411 */
            S411 ();
            if (returnInSub) return;
         }
      }
   }

   public void S171( )
   {
      /* 'SUB_INS_TBM21_STUDY' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBM21_STUDY

         */
         A63TBM21_STUDY_ID = AV30W_STUDY_ID ;
         A367TBM21_STUDY_NM = (String)AV18W_CSV_COL.elementAt(-1+3) ;
         n367TBM21_STUDY_NM = false ;
         A530TBM21_OUTER_STUDY_ID = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         n530TBM21_OUTER_STUDY_ID = false ;
         A531TBM21_PROC_NM = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n531TBM21_PROC_NM = false ;
         A368TBM21_NOTE = (String)AV18W_CSV_COL.elementAt(-1+6) ;
         n368TBM21_NOTE = false ;
         A607TBM21_STATUS = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         n607TBM21_STATUS = false ;
         A369TBM21_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n369TBM21_DEL_FLG = false ;
         A370TBM21_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+9), 6) ;
         n370TBM21_CRT_DATETIME = false ;
         A371TBM21_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n371TBM21_CRT_USER_ID = false ;
         A372TBM21_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n372TBM21_CRT_PROG_NM = false ;
         A373TBM21_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+12), 6) ;
         n373TBM21_UPD_DATETIME = false ;
         A374TBM21_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+13) ;
         n374TBM21_UPD_USER_ID = false ;
         A375TBM21_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+14) ;
         n375TBM21_UPD_PROG_NM = false ;
         A376TBM21_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+15)) ;
         n376TBM21_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM21_STUDY" ;
         /* Using cursor P007E20 */
         pr_default.execute(18, new Object[] {new Long(A63TBM21_STUDY_ID), new Boolean(n367TBM21_STUDY_NM), A367TBM21_STUDY_NM, new Boolean(n530TBM21_OUTER_STUDY_ID), A530TBM21_OUTER_STUDY_ID, new Boolean(n531TBM21_PROC_NM), A531TBM21_PROC_NM, new Boolean(n368TBM21_NOTE), A368TBM21_NOTE, new Boolean(n607TBM21_STATUS), A607TBM21_STATUS, new Boolean(n369TBM21_DEL_FLG), A369TBM21_DEL_FLG, new Boolean(n370TBM21_CRT_DATETIME), A370TBM21_CRT_DATETIME, new Boolean(n371TBM21_CRT_USER_ID), A371TBM21_CRT_USER_ID, new Boolean(n372TBM21_CRT_PROG_NM), A372TBM21_CRT_PROG_NM, new Boolean(n373TBM21_UPD_DATETIME), A373TBM21_UPD_DATETIME, new Boolean(n374TBM21_UPD_USER_ID), A374TBM21_UPD_USER_ID, new Boolean(n375TBM21_UPD_PROG_NM), A375TBM21_UPD_PROG_NM, new Boolean(n376TBM21_UPD_CNT), new Long(A376TBM21_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM21_STUDY") ;
         if ( (pr_default.getStatus(18) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S181( )
   {
      /* 'SUB_INS_TBM22_STUDY_SITE' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBM22_STUDY_SITE

         */
         A17TBM22_STUDY_ID = AV30W_STUDY_ID ;
         A18TBM22_SITE_ID = (String)AV18W_CSV_COL.elementAt(-1+3) ;
         A377TBM22_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         n377TBM22_DEL_FLG = false ;
         A378TBM22_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+5), 6) ;
         n378TBM22_CRT_DATETIME = false ;
         A379TBM22_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+6) ;
         n379TBM22_CRT_USER_ID = false ;
         A380TBM22_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         n380TBM22_CRT_PROG_NM = false ;
         A381TBM22_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+8), 6) ;
         n381TBM22_UPD_DATETIME = false ;
         A382TBM22_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n382TBM22_UPD_USER_ID = false ;
         A383TBM22_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n383TBM22_UPD_PROG_NM = false ;
         A384TBM22_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+11)) ;
         n384TBM22_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM22_STUDY_SITE" ;
         /* Using cursor P007E21 */
         pr_default.execute(19, new Object[] {new Long(A17TBM22_STUDY_ID), A18TBM22_SITE_ID, new Boolean(n377TBM22_DEL_FLG), A377TBM22_DEL_FLG, new Boolean(n378TBM22_CRT_DATETIME), A378TBM22_CRT_DATETIME, new Boolean(n379TBM22_CRT_USER_ID), A379TBM22_CRT_USER_ID, new Boolean(n380TBM22_CRT_PROG_NM), A380TBM22_CRT_PROG_NM, new Boolean(n381TBM22_UPD_DATETIME), A381TBM22_UPD_DATETIME, new Boolean(n382TBM22_UPD_USER_ID), A382TBM22_UPD_USER_ID, new Boolean(n383TBM22_UPD_PROG_NM), A383TBM22_UPD_PROG_NM, new Boolean(n384TBM22_UPD_CNT), new Long(A384TBM22_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM22_STUDY_SITE") ;
         if ( (pr_default.getStatus(19) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S191( )
   {
      /* 'SUB_INS_TBM23_STUDY_STAFF' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBM23_STUDY_STAFF

         */
         A107TBM23_STUDY_ID = AV30W_STUDY_ID ;
         A108TBM23_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+3) ;
         A109TBM23_STYDY_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         A385TBM23_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n385TBM23_DEL_FLG = false ;
         A386TBM23_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+6), 6) ;
         n386TBM23_CRT_DATETIME = false ;
         A387TBM23_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         n387TBM23_CRT_USER_ID = false ;
         A388TBM23_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n388TBM23_CRT_PROG_NM = false ;
         A389TBM23_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+9), 6) ;
         n389TBM23_UPD_DATETIME = false ;
         A390TBM23_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n390TBM23_UPD_USER_ID = false ;
         A391TBM23_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n391TBM23_UPD_PROG_NM = false ;
         A392TBM23_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+12)) ;
         n392TBM23_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM23_STUDY_STAFF" ;
         /* Using cursor P007E22 */
         pr_default.execute(20, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD, new Boolean(n385TBM23_DEL_FLG), A385TBM23_DEL_FLG, new Boolean(n386TBM23_CRT_DATETIME), A386TBM23_CRT_DATETIME, new Boolean(n387TBM23_CRT_USER_ID), A387TBM23_CRT_USER_ID, new Boolean(n388TBM23_CRT_PROG_NM), A388TBM23_CRT_PROG_NM, new Boolean(n389TBM23_UPD_DATETIME), A389TBM23_UPD_DATETIME, new Boolean(n390TBM23_UPD_USER_ID), A390TBM23_UPD_USER_ID, new Boolean(n391TBM23_UPD_PROG_NM), A391TBM23_UPD_PROG_NM, new Boolean(n392TBM23_UPD_CNT), new Long(A392TBM23_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM23_STUDY_STAFF") ;
         if ( (pr_default.getStatus(20) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S201( )
   {
      /* 'SUB_INS_TBM24_MAP_ITEM' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBM24_MAP_ITEM

         */
         A64TBM24_STUDY_ID = AV30W_STUDY_ID ;
         A65TBM24_DOM_CD = (String)AV18W_CSV_COL.elementAt(-1+3) ;
         A66TBM24_DOM_VAR_NM = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         A702TBM24_DOM_ITM_GRP_OID = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n702TBM24_DOM_ITM_GRP_OID = false ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+6))) ;
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
         A704TBM24_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+7))) ;
         n704TBM24_DOM_ITM_GRP_ROWNO = false ;
         A705TBM24_CRF_ITEM_NM = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n705TBM24_CRF_ITEM_NM = false ;
         A67TBM24_CRF_ITEM_DIV = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         A635TBM24_IDENTIFICATION_CD = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n635TBM24_IDENTIFICATION_CD = false ;
         A636TBM24_TEXT_MAXLENGTH = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+11))) ;
         n636TBM24_TEXT_MAXLENGTH = false ;
         A637TBM24_TEXT_MAXROWS = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+12))) ;
         n637TBM24_TEXT_MAXROWS = false ;
         A638TBM24_DECIMAL_DIGITS = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+13))) ;
         n638TBM24_DECIMAL_DIGITS = false ;
         A639TBM24_TEXT = (String)AV18W_CSV_COL.elementAt(-1+14) ;
         n639TBM24_TEXT = false ;
         A640TBM24_FIXED_VALUE = (String)AV18W_CSV_COL.elementAt(-1+15) ;
         n640TBM24_FIXED_VALUE = false ;
         A641TBM24_CHK_FALSE_INNER_VALUE = (String)AV18W_CSV_COL.elementAt(-1+16) ;
         n641TBM24_CHK_FALSE_INNER_VALUE = false ;
         A706TBM24_REQUIRED_INPUT_FLG = (String)AV18W_CSV_COL.elementAt(-1+17) ;
         n706TBM24_REQUIRED_INPUT_FLG = false ;
         A707TBM24_MIN_VALUE = (String)AV18W_CSV_COL.elementAt(-1+18) ;
         n707TBM24_MIN_VALUE = false ;
         A708TBM24_MAX_VALUE = (String)AV18W_CSV_COL.elementAt(-1+19) ;
         n708TBM24_MAX_VALUE = false ;
         A543TBM24_ORDER = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+20))) ;
         n543TBM24_ORDER = false ;
         A544TBM24_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+21) ;
         n544TBM24_DEL_FLG = false ;
         A545TBM24_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+22), 6) ;
         n545TBM24_CRT_DATETIME = false ;
         A546TBM24_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+23) ;
         n546TBM24_CRT_USER_ID = false ;
         A547TBM24_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+24) ;
         n547TBM24_CRT_PROG_NM = false ;
         A548TBM24_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+25), 6) ;
         n548TBM24_UPD_DATETIME = false ;
         A549TBM24_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+26) ;
         n549TBM24_UPD_USER_ID = false ;
         A550TBM24_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+27) ;
         n550TBM24_UPD_PROG_NM = false ;
         A551TBM24_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+28)) ;
         n551TBM24_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM24_MAP_ITEM" ;
         /* Using cursor P007E23 */
         pr_default.execute(21, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV, new Boolean(n702TBM24_DOM_ITM_GRP_OID), A702TBM24_DOM_ITM_GRP_OID, new Boolean(n703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n704TBM24_DOM_ITM_GRP_ROWNO), new Short(A704TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n705TBM24_CRF_ITEM_NM), A705TBM24_CRF_ITEM_NM, new Boolean(n635TBM24_IDENTIFICATION_CD), A635TBM24_IDENTIFICATION_CD, new Boolean(n636TBM24_TEXT_MAXLENGTH), new Short(A636TBM24_TEXT_MAXLENGTH), new Boolean(n637TBM24_TEXT_MAXROWS), new Byte(A637TBM24_TEXT_MAXROWS), new Boolean(n638TBM24_DECIMAL_DIGITS), new Byte(A638TBM24_DECIMAL_DIGITS), new Boolean(n639TBM24_TEXT), A639TBM24_TEXT, new Boolean(n640TBM24_FIXED_VALUE), A640TBM24_FIXED_VALUE, new Boolean(n641TBM24_CHK_FALSE_INNER_VALUE), A641TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n706TBM24_REQUIRED_INPUT_FLG), A706TBM24_REQUIRED_INPUT_FLG, new Boolean(n707TBM24_MIN_VALUE), A707TBM24_MIN_VALUE, new Boolean(n708TBM24_MAX_VALUE), A708TBM24_MAX_VALUE, new Boolean(n543TBM24_ORDER), new Integer(A543TBM24_ORDER), new Boolean(n544TBM24_DEL_FLG), A544TBM24_DEL_FLG, new Boolean(n545TBM24_CRT_DATETIME), A545TBM24_CRT_DATETIME, new Boolean(n546TBM24_CRT_USER_ID), A546TBM24_CRT_USER_ID, new Boolean(n547TBM24_CRT_PROG_NM), A547TBM24_CRT_PROG_NM, new Boolean(n548TBM24_UPD_DATETIME), A548TBM24_UPD_DATETIME, new Boolean(n549TBM24_UPD_USER_ID), A549TBM24_UPD_USER_ID, new Boolean(n550TBM24_UPD_PROG_NM), A550TBM24_UPD_PROG_NM, new Boolean(n551TBM24_UPD_CNT), new Long(A551TBM24_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM24_MAP_ITEM") ;
         if ( (pr_default.getStatus(21) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S211( )
   {
      /* 'SUB_INS_TBM25_SEL_LIST' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBM25_SEL_LIST

         */
         A23TBM25_STUDY_ID = AV30W_STUDY_ID ;
         A24TBM25_LIST_CD = (String)AV18W_CSV_COL.elementAt(-1+3) ;
         A552TBM25_LIST_NM = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         n552TBM25_LIST_NM = false ;
         A553TBM25_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n553TBM25_DEL_FLG = false ;
         A554TBM25_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+6), 6) ;
         n554TBM25_CRT_DATETIME = false ;
         A555TBM25_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         n555TBM25_CRT_USER_ID = false ;
         A556TBM25_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n556TBM25_CRT_PROG_NM = false ;
         A557TBM25_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+9), 6) ;
         n557TBM25_UPD_DATETIME = false ;
         A558TBM25_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n558TBM25_UPD_USER_ID = false ;
         A559TBM25_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n559TBM25_UPD_PROG_NM = false ;
         A560TBM25_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+12)) ;
         n560TBM25_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM25_SEL_LIST" ;
         /* Using cursor P007E24 */
         pr_default.execute(22, new Object[] {new Long(A23TBM25_STUDY_ID), A24TBM25_LIST_CD, new Boolean(n552TBM25_LIST_NM), A552TBM25_LIST_NM, new Boolean(n553TBM25_DEL_FLG), A553TBM25_DEL_FLG, new Boolean(n554TBM25_CRT_DATETIME), A554TBM25_CRT_DATETIME, new Boolean(n555TBM25_CRT_USER_ID), A555TBM25_CRT_USER_ID, new Boolean(n556TBM25_CRT_PROG_NM), A556TBM25_CRT_PROG_NM, new Boolean(n557TBM25_UPD_DATETIME), A557TBM25_UPD_DATETIME, new Boolean(n558TBM25_UPD_USER_ID), A558TBM25_UPD_USER_ID, new Boolean(n559TBM25_UPD_PROG_NM), A559TBM25_UPD_PROG_NM, new Boolean(n560TBM25_UPD_CNT), new Long(A560TBM25_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM25_SEL_LIST") ;
         if ( (pr_default.getStatus(22) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S221( )
   {
      /* 'SUB_INS_TBM26_SEL_LIST_ITEM' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBM26_SEL_LIST_ITEM

         */
         A25TBM26_STUDY_ID = AV30W_STUDY_ID ;
         A26TBM26_LIST_CD = (String)AV18W_CSV_COL.elementAt(-1+3) ;
         A27TBM26_LIST_ITEM_NO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
         A561TBM26_LIST_ITEM_NAME = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n561TBM26_LIST_ITEM_NAME = false ;
         A562TBM26_INNER_VALUE = (String)AV18W_CSV_COL.elementAt(-1+6) ;
         n562TBM26_INNER_VALUE = false ;
         A563TBM26_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         n563TBM26_DEL_FLG = false ;
         A564TBM26_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+8), 6) ;
         n564TBM26_CRT_DATETIME = false ;
         A565TBM26_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n565TBM26_CRT_USER_ID = false ;
         A566TBM26_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n566TBM26_CRT_PROG_NM = false ;
         A567TBM26_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+11), 6) ;
         n567TBM26_UPD_DATETIME = false ;
         A568TBM26_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+12) ;
         n568TBM26_UPD_USER_ID = false ;
         A569TBM26_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+13) ;
         n569TBM26_UPD_PROG_NM = false ;
         A570TBM26_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+14)) ;
         n570TBM26_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM26_SEL_LIST_ITEM" ;
         /* Using cursor P007E25 */
         pr_default.execute(23, new Object[] {new Long(A25TBM26_STUDY_ID), A26TBM26_LIST_CD, new Short(A27TBM26_LIST_ITEM_NO), new Boolean(n561TBM26_LIST_ITEM_NAME), A561TBM26_LIST_ITEM_NAME, new Boolean(n562TBM26_INNER_VALUE), A562TBM26_INNER_VALUE, new Boolean(n563TBM26_DEL_FLG), A563TBM26_DEL_FLG, new Boolean(n564TBM26_CRT_DATETIME), A564TBM26_CRT_DATETIME, new Boolean(n565TBM26_CRT_USER_ID), A565TBM26_CRT_USER_ID, new Boolean(n566TBM26_CRT_PROG_NM), A566TBM26_CRT_PROG_NM, new Boolean(n567TBM26_UPD_DATETIME), A567TBM26_UPD_DATETIME, new Boolean(n568TBM26_UPD_USER_ID), A568TBM26_UPD_USER_ID, new Boolean(n569TBM26_UPD_PROG_NM), A569TBM26_UPD_PROG_NM, new Boolean(n570TBM26_UPD_CNT), new Long(A570TBM26_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM26_SEL_LIST_ITEM") ;
         if ( (pr_default.getStatus(23) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S231( )
   {
      /* 'SUB_INS_TBM31_CRF' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM31_CRF

            */
            A68TBM31_STUDY_ID = AV30W_STUDY_ID ;
            A69TBM31_CRF_ID = AV17W_CRF_ID ;
            A393TBM31_CRF_NM = (String)AV18W_CSV_COL.elementAt(-1+4) ;
            n393TBM31_CRF_NM = false ;
            A642TBM31_CRF_SNM = (String)AV18W_CSV_COL.elementAt(-1+5) ;
            n642TBM31_CRF_SNM = false ;
            A394TBM31_GRID_SIZE = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+6))) ;
            n394TBM31_GRID_SIZE = false ;
            A395TBM31_ORDER = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+7))) ;
            n395TBM31_ORDER = false ;
            A528TBM31_DEF_VISIT_NO = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+8))) ;
            n528TBM31_DEF_VISIT_NO = false ;
            A529TBM31_DEF_DOMAIN_CD = (String)AV18W_CSV_COL.elementAt(-1+9) ;
            n529TBM31_DEF_DOMAIN_CD = false ;
            A643TBM31_STATUS = (String)AV18W_CSV_COL.elementAt(-1+10) ;
            n643TBM31_STATUS = false ;
            A396TBM31_NOTE = (String)AV18W_CSV_COL.elementAt(-1+11) ;
            n396TBM31_NOTE = false ;
            A943TBM31_REPEAT_FLG = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+12))) ;
            n943TBM31_REPEAT_FLG = false ;
            A944TBM31_REPEAT_MAX = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+13))) ;
            n944TBM31_REPEAT_MAX = false ;
            A979TBM31_DM_EXCP_NO_DISP_FLG = (String)AV18W_CSV_COL.elementAt(-1+14) ;
            n979TBM31_DM_EXCP_NO_DISP_FLG = false ;
            A397TBM31_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+15) ;
            n397TBM31_DEL_FLG = false ;
            A398TBM31_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+16), 6) ;
            n398TBM31_CRT_DATETIME = false ;
            A399TBM31_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+17) ;
            n399TBM31_CRT_USER_ID = false ;
            A400TBM31_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+18) ;
            n400TBM31_CRT_PROG_NM = false ;
            A401TBM31_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+19), 6) ;
            n401TBM31_UPD_DATETIME = false ;
            A402TBM31_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+20) ;
            n402TBM31_UPD_USER_ID = false ;
            A403TBM31_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+21) ;
            n403TBM31_UPD_PROG_NM = false ;
            A404TBM31_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+22)) ;
            n404TBM31_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM31_CRF" ;
            /* Using cursor P007E26 */
            pr_default.execute(24, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID), new Boolean(n393TBM31_CRF_NM), A393TBM31_CRF_NM, new Boolean(n642TBM31_CRF_SNM), A642TBM31_CRF_SNM, new Boolean(n394TBM31_GRID_SIZE), new Short(A394TBM31_GRID_SIZE), new Boolean(n395TBM31_ORDER), new Integer(A395TBM31_ORDER), new Boolean(n528TBM31_DEF_VISIT_NO), new Integer(A528TBM31_DEF_VISIT_NO), new Boolean(n529TBM31_DEF_DOMAIN_CD), A529TBM31_DEF_DOMAIN_CD, new Boolean(n643TBM31_STATUS), A643TBM31_STATUS, new Boolean(n396TBM31_NOTE), A396TBM31_NOTE, new Boolean(n397TBM31_DEL_FLG), A397TBM31_DEL_FLG, new Boolean(n398TBM31_CRT_DATETIME), A398TBM31_CRT_DATETIME, new Boolean(n399TBM31_CRT_USER_ID), A399TBM31_CRT_USER_ID, new Boolean(n400TBM31_CRT_PROG_NM), A400TBM31_CRT_PROG_NM, new Boolean(n401TBM31_UPD_DATETIME), A401TBM31_UPD_DATETIME, new Boolean(n402TBM31_UPD_USER_ID), A402TBM31_UPD_USER_ID, new Boolean(n403TBM31_UPD_PROG_NM), A403TBM31_UPD_PROG_NM, new Boolean(n404TBM31_UPD_CNT), new Long(A404TBM31_UPD_CNT), new Boolean(n943TBM31_REPEAT_FLG), new Byte(A943TBM31_REPEAT_FLG), new Boolean(n944TBM31_REPEAT_MAX), new Byte(A944TBM31_REPEAT_MAX), new Boolean(n979TBM31_DM_EXCP_NO_DISP_FLG), A979TBM31_DM_EXCP_NO_DISP_FLG});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM31_CRF") ;
            if ( (pr_default.getStatus(24) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S241( )
   {
      /* 'SUB_INS_TBM32_CRF_ITEM' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM32_CRF_ITEM

            */
            A70TBM32_STUDY_ID = AV30W_STUDY_ID ;
            A71TBM32_CRF_ID = AV17W_CRF_ID ;
            A72TBM32_CRF_ITEM_CD = (String)AV18W_CSV_COL.elementAt(-1+4) ;
            A405TBM32_CRF_ITEM_NM = (String)AV18W_CSV_COL.elementAt(-1+5) ;
            n405TBM32_CRF_ITEM_NM = false ;
            A74TBM32_CRF_ITEM_DIV = (String)AV18W_CSV_COL.elementAt(-1+6) ;
            n74TBM32_CRF_ITEM_DIV = false ;
            A73TBM32_CRF_ITEM_GRP_CD = (String)AV18W_CSV_COL.elementAt(-1+7) ;
            n73TBM32_CRF_ITEM_GRP_CD = false ;
            A507TBM32_CRF_ITEM_GRP_ORDER = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+8))) ;
            n507TBM32_CRF_ITEM_GRP_ORDER = false ;
            A508TBM32_LOCATION_X = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+9))) ;
            n508TBM32_LOCATION_X = false ;
            A509TBM32_LOCATION_Y = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+10))) ;
            n509TBM32_LOCATION_Y = false ;
            A510TBM32_LOCATION_X2 = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+11))) ;
            n510TBM32_LOCATION_X2 = false ;
            A511TBM32_LOCATION_Y2 = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+12))) ;
            n511TBM32_LOCATION_Y2 = false ;
            A512TBM32_TEXT_ALIGN_DIV = (String)AV18W_CSV_COL.elementAt(-1+13) ;
            n512TBM32_TEXT_ALIGN_DIV = false ;
            A516TBM32_TEXT_MAXROWS = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+14))) ;
            n516TBM32_TEXT_MAXROWS = false ;
            A517TBM32_TEXT_MAXLENGTH = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+15))) ;
            n517TBM32_TEXT_MAXLENGTH = false ;
            A518TBM32_DECIMAL_DIGITS = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+16))) ;
            n518TBM32_DECIMAL_DIGITS = false ;
            A522TBM32_CHK_TRUE_INNER_VALUE = (String)AV18W_CSV_COL.elementAt(-1+17) ;
            n522TBM32_CHK_TRUE_INNER_VALUE = false ;
            A523TBM32_CHK_FALSE_INNER_VALUE = (String)AV18W_CSV_COL.elementAt(-1+18) ;
            n523TBM32_CHK_FALSE_INNER_VALUE = false ;
            A527TBM32_FIXED_VALUE = (String)AV18W_CSV_COL.elementAt(-1+19) ;
            n527TBM32_FIXED_VALUE = false ;
            A525TBM32_LIST_CD = (String)AV18W_CSV_COL.elementAt(-1+20) ;
            n525TBM32_LIST_CD = false ;
            A526TBM32_IMAGE_CD = (String)AV18W_CSV_COL.elementAt(-1+21) ;
            n526TBM32_IMAGE_CD = false ;
            A524TBM32_TEXT = (String)AV18W_CSV_COL.elementAt(-1+22) ;
            n524TBM32_TEXT = false ;
            A513TBM32_FONT_SIZE = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+23))) ;
            n513TBM32_FONT_SIZE = false ;
            A514TBM32_FONT_UL_FLG = (String)AV18W_CSV_COL.elementAt(-1+24) ;
            n514TBM32_FONT_UL_FLG = false ;
            A515TBM32_FONT_COLOR_DIV = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+25)) ;
            n515TBM32_FONT_COLOR_DIV = false ;
            A521TBM32_LINE_SIZE_DIV = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+26))) ;
            n521TBM32_LINE_SIZE_DIV = false ;
            A689TBM32_LINE_COLOR_DIV = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+27)) ;
            n689TBM32_LINE_COLOR_DIV = false ;
            A519TBM32_LINE_START_POINT_DIV = (String)AV18W_CSV_COL.elementAt(-1+28) ;
            n519TBM32_LINE_START_POINT_DIV = false ;
            A520TBM32_LINE_END_POINT_DIV = (String)AV18W_CSV_COL.elementAt(-1+29) ;
            n520TBM32_LINE_END_POINT_DIV = false ;
            A690TBM32_LINE_ANGLE = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+30))) ;
            n690TBM32_LINE_ANGLE = false ;
            A644TBM32_AUTH_LVL_MIN = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+31))) ;
            n644TBM32_AUTH_LVL_MIN = false ;
            A645TBM32_ZORDER = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+32))) ;
            n645TBM32_ZORDER = false ;
            A691TBM32_TAB_ORDER = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+33))) ;
            n691TBM32_TAB_ORDER = false ;
            A692TBM32_TABSTOP_FLG = (String)AV18W_CSV_COL.elementAt(-1+34) ;
            n692TBM32_TABSTOP_FLG = false ;
            A693TBM32_REQUIRED_INPUT_FLG = (String)AV18W_CSV_COL.elementAt(-1+35) ;
            n693TBM32_REQUIRED_INPUT_FLG = false ;
            A694TBM32_MIN_VALUE = (String)AV18W_CSV_COL.elementAt(-1+36) ;
            n694TBM32_MIN_VALUE = false ;
            A695TBM32_MAX_VALUE = (String)AV18W_CSV_COL.elementAt(-1+37) ;
            n695TBM32_MAX_VALUE = false ;
            A406TBM32_CRF_ITEM_NOTE = (String)AV18W_CSV_COL.elementAt(-1+38) ;
            n406TBM32_CRF_ITEM_NOTE = false ;
            A774TBM32_REF_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+39))) ;
            n774TBM32_REF_CRF_ID = false ;
            A775TBM32_REF_CRF_ITEM_CD = (String)AV18W_CSV_COL.elementAt(-1+40) ;
            n775TBM32_REF_CRF_ITEM_CD = false ;
            A75TBM32_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+41) ;
            n75TBM32_DEL_FLG = false ;
            A407TBM32_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+42), 6) ;
            n407TBM32_CRT_DATETIME = false ;
            A408TBM32_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+43) ;
            n408TBM32_CRT_USER_ID = false ;
            A409TBM32_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+44) ;
            n409TBM32_CRT_PROG_NM = false ;
            A410TBM32_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+45), 6) ;
            n410TBM32_UPD_DATETIME = false ;
            A411TBM32_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+46) ;
            n411TBM32_UPD_USER_ID = false ;
            A412TBM32_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+47) ;
            n412TBM32_UPD_PROG_NM = false ;
            A413TBM32_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+48)) ;
            n413TBM32_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM32_CRF_ITEM" ;
            /* Using cursor P007E27 */
            pr_default.execute(25, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD, new Boolean(n405TBM32_CRF_ITEM_NM), A405TBM32_CRF_ITEM_NM, new Boolean(n74TBM32_CRF_ITEM_DIV), A74TBM32_CRF_ITEM_DIV, new Boolean(n73TBM32_CRF_ITEM_GRP_CD), A73TBM32_CRF_ITEM_GRP_CD, new Boolean(n507TBM32_CRF_ITEM_GRP_ORDER), new Short(A507TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n508TBM32_LOCATION_X), new Short(A508TBM32_LOCATION_X), new Boolean(n509TBM32_LOCATION_Y), new Short(A509TBM32_LOCATION_Y), new Boolean(n510TBM32_LOCATION_X2), new Short(A510TBM32_LOCATION_X2), new Boolean(n511TBM32_LOCATION_Y2), new Short(A511TBM32_LOCATION_Y2), new Boolean(n512TBM32_TEXT_ALIGN_DIV), A512TBM32_TEXT_ALIGN_DIV, new Boolean(n516TBM32_TEXT_MAXROWS), new Byte(A516TBM32_TEXT_MAXROWS), new Boolean(n517TBM32_TEXT_MAXLENGTH), new Short(A517TBM32_TEXT_MAXLENGTH), new Boolean(n518TBM32_DECIMAL_DIGITS), new Byte(A518TBM32_DECIMAL_DIGITS), new Boolean(n522TBM32_CHK_TRUE_INNER_VALUE), A522TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n523TBM32_CHK_FALSE_INNER_VALUE), A523TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n527TBM32_FIXED_VALUE), A527TBM32_FIXED_VALUE, new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD, new Boolean(n526TBM32_IMAGE_CD), A526TBM32_IMAGE_CD, new Boolean(n524TBM32_TEXT), A524TBM32_TEXT, new Boolean(n513TBM32_FONT_SIZE), new Byte(A513TBM32_FONT_SIZE), new Boolean(n514TBM32_FONT_UL_FLG), A514TBM32_FONT_UL_FLG, new Boolean(n515TBM32_FONT_COLOR_DIV), new Long(A515TBM32_FONT_COLOR_DIV), new Boolean(n521TBM32_LINE_SIZE_DIV), new Byte(A521TBM32_LINE_SIZE_DIV), new Boolean(n689TBM32_LINE_COLOR_DIV), new Long(A689TBM32_LINE_COLOR_DIV), new Boolean(n519TBM32_LINE_START_POINT_DIV), A519TBM32_LINE_START_POINT_DIV, new Boolean(n520TBM32_LINE_END_POINT_DIV), A520TBM32_LINE_END_POINT_DIV, new Boolean(n690TBM32_LINE_ANGLE), new Short(A690TBM32_LINE_ANGLE), new Boolean(n644TBM32_AUTH_LVL_MIN), new Byte(A644TBM32_AUTH_LVL_MIN), new Boolean(n645TBM32_ZORDER), new Short(A645TBM32_ZORDER), new Boolean(n691TBM32_TAB_ORDER), new Short(A691TBM32_TAB_ORDER), new Boolean(n692TBM32_TABSTOP_FLG), A692TBM32_TABSTOP_FLG, new Boolean(n693TBM32_REQUIRED_INPUT_FLG), A693TBM32_REQUIRED_INPUT_FLG, new Boolean(n694TBM32_MIN_VALUE), A694TBM32_MIN_VALUE, new Boolean(n695TBM32_MAX_VALUE), A695TBM32_MAX_VALUE, new Boolean(n406TBM32_CRF_ITEM_NOTE), A406TBM32_CRF_ITEM_NOTE, new Boolean(n774TBM32_REF_CRF_ID), new Short(A774TBM32_REF_CRF_ID), new Boolean(n775TBM32_REF_CRF_ITEM_CD), A775TBM32_REF_CRF_ITEM_CD, new Boolean(n75TBM32_DEL_FLG), A75TBM32_DEL_FLG, new Boolean(n407TBM32_CRT_DATETIME), A407TBM32_CRT_DATETIME, new Boolean(n408TBM32_CRT_USER_ID), A408TBM32_CRT_USER_ID, new Boolean(n409TBM32_CRT_PROG_NM), A409TBM32_CRT_PROG_NM, new Boolean(n410TBM32_UPD_DATETIME), A410TBM32_UPD_DATETIME, new Boolean(n411TBM32_UPD_USER_ID), A411TBM32_UPD_USER_ID, new Boolean(n412TBM32_UPD_PROG_NM), A412TBM32_UPD_PROG_NM, new Boolean(n413TBM32_UPD_CNT), new Long(A413TBM32_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
            if ( (pr_default.getStatus(25) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S251( )
   {
      /* 'SUB_INS_TBM33_CRF_COND' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM33_CRF_COND

            */
            A76TBM33_STUDY_ID = AV30W_STUDY_ID ;
            A77TBM33_CRF_ID = AV17W_CRF_ID ;
            A78TBM33_COND_NO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
            A502TBM33_COND_NM = (String)AV18W_CSV_COL.elementAt(-1+5) ;
            n502TBM33_COND_NM = false ;
            A414TBM33_EXPRESSION = (String)AV18W_CSV_COL.elementAt(-1+6) ;
            n414TBM33_EXPRESSION = false ;
            A503TBM33_COND_DIV = (String)AV18W_CSV_COL.elementAt(-1+7) ;
            n503TBM33_COND_DIV = false ;
            A504TBM33_CRF_ITEM_CD = (String)AV18W_CSV_COL.elementAt(-1+8) ;
            n504TBM33_CRF_ITEM_CD = false ;
            A415TBM33_PRIOR_NO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+9))) ;
            n415TBM33_PRIOR_NO = false ;
            A505TBM33_ERR_DIV = (String)AV18W_CSV_COL.elementAt(-1+10) ;
            n505TBM33_ERR_DIV = false ;
            A506TBM33_ERR_MSG = (String)AV18W_CSV_COL.elementAt(-1+11) ;
            n506TBM33_ERR_MSG = false ;
            A646TBM33_ENABLED_FLG = (String)AV18W_CSV_COL.elementAt(-1+12) ;
            n646TBM33_ENABLED_FLG = false ;
            A696TBM33_REQUIRED_INPUT_FLG = (String)AV18W_CSV_COL.elementAt(-1+13) ;
            n696TBM33_REQUIRED_INPUT_FLG = false ;
            A697TBM33_NUMERIC_RANGE_FLG = (String)AV18W_CSV_COL.elementAt(-1+14) ;
            n697TBM33_NUMERIC_RANGE_FLG = false ;
            A416TBM33_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+15) ;
            n416TBM33_DEL_FLG = false ;
            A417TBM33_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+16), 6) ;
            n417TBM33_CRT_DATETIME = false ;
            A418TBM33_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+17) ;
            n418TBM33_CRT_USER_ID = false ;
            A419TBM33_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+18) ;
            n419TBM33_CRT_PROG_NM = false ;
            A420TBM33_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+19), 6) ;
            n420TBM33_UPD_DATETIME = false ;
            A421TBM33_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+20) ;
            n421TBM33_UPD_USER_ID = false ;
            A422TBM33_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+21) ;
            n422TBM33_UPD_PROG_NM = false ;
            A423TBM33_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+22)) ;
            n423TBM33_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM33_CRF_COND" ;
            /* Using cursor P007E28 */
            pr_default.execute(26, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO), new Boolean(n502TBM33_COND_NM), A502TBM33_COND_NM, new Boolean(n414TBM33_EXPRESSION), A414TBM33_EXPRESSION, new Boolean(n503TBM33_COND_DIV), A503TBM33_COND_DIV, new Boolean(n504TBM33_CRF_ITEM_CD), A504TBM33_CRF_ITEM_CD, new Boolean(n415TBM33_PRIOR_NO), new Short(A415TBM33_PRIOR_NO), new Boolean(n505TBM33_ERR_DIV), A505TBM33_ERR_DIV, new Boolean(n506TBM33_ERR_MSG), A506TBM33_ERR_MSG, new Boolean(n646TBM33_ENABLED_FLG), A646TBM33_ENABLED_FLG, new Boolean(n696TBM33_REQUIRED_INPUT_FLG), A696TBM33_REQUIRED_INPUT_FLG, new Boolean(n697TBM33_NUMERIC_RANGE_FLG), A697TBM33_NUMERIC_RANGE_FLG, new Boolean(n416TBM33_DEL_FLG), A416TBM33_DEL_FLG, new Boolean(n417TBM33_CRT_DATETIME), A417TBM33_CRT_DATETIME, new Boolean(n418TBM33_CRT_USER_ID), A418TBM33_CRT_USER_ID, new Boolean(n419TBM33_CRT_PROG_NM), A419TBM33_CRT_PROG_NM, new Boolean(n420TBM33_UPD_DATETIME), A420TBM33_UPD_DATETIME, new Boolean(n421TBM33_UPD_USER_ID), A421TBM33_UPD_USER_ID, new Boolean(n422TBM33_UPD_PROG_NM), A422TBM33_UPD_PROG_NM, new Boolean(n423TBM33_UPD_CNT), new Long(A423TBM33_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
            if ( (pr_default.getStatus(26) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S261( )
   {
      /* 'SUB_INS_TBM34_CRF_AUTH' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM34_CRF_AUTH

            */
            A28TBM34_STUDY_ID = AV30W_STUDY_ID ;
            A29TBM34_CRF_ID = AV17W_CRF_ID ;
            A30TBM34_STYDY_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+4) ;
            A571TBM34_DISPLAY_FLG = (String)AV18W_CSV_COL.elementAt(-1+5) ;
            n571TBM34_DISPLAY_FLG = false ;
            A572TBM34_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+6) ;
            n572TBM34_DEL_FLG = false ;
            A573TBM34_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+7), 6) ;
            n573TBM34_CRT_DATETIME = false ;
            A574TBM34_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+8) ;
            n574TBM34_CRT_USER_ID = false ;
            A575TBM34_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+9) ;
            n575TBM34_CRT_PROG_NM = false ;
            A576TBM34_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+10), 6) ;
            n576TBM34_UPD_DATETIME = false ;
            A577TBM34_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+11) ;
            n577TBM34_UPD_USER_ID = false ;
            A578TBM34_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+12) ;
            n578TBM34_UPD_PROG_NM = false ;
            A579TBM34_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+13)) ;
            n579TBM34_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM34_CRF_AUTH" ;
            /* Using cursor P007E29 */
            pr_default.execute(27, new Object[] {new Long(A28TBM34_STUDY_ID), new Short(A29TBM34_CRF_ID), A30TBM34_STYDY_AUTH_CD, new Boolean(n571TBM34_DISPLAY_FLG), A571TBM34_DISPLAY_FLG, new Boolean(n572TBM34_DEL_FLG), A572TBM34_DEL_FLG, new Boolean(n573TBM34_CRT_DATETIME), A573TBM34_CRT_DATETIME, new Boolean(n574TBM34_CRT_USER_ID), A574TBM34_CRT_USER_ID, new Boolean(n575TBM34_CRT_PROG_NM), A575TBM34_CRT_PROG_NM, new Boolean(n576TBM34_UPD_DATETIME), A576TBM34_UPD_DATETIME, new Boolean(n577TBM34_UPD_USER_ID), A577TBM34_UPD_USER_ID, new Boolean(n578TBM34_UPD_PROG_NM), A578TBM34_UPD_PROG_NM, new Boolean(n579TBM34_UPD_CNT), new Long(A579TBM34_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM34_CRF_AUTH") ;
            if ( (pr_default.getStatus(27) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S271( )
   {
      /* 'SUB_INS_TBM35_CRF_ITEM_AUTH' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM35_CRF_ITEM_AUTH

            */
            A31TBM35_STUDY_ID = AV30W_STUDY_ID ;
            A32TBM35_CRF_ID = AV17W_CRF_ID ;
            A33TBM35_CRF_ITEM_CD = (String)AV18W_CSV_COL.elementAt(-1+4) ;
            A34TBM35_STUDY_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+5) ;
            A580TBM35_DISPLAY_FLG = (String)AV18W_CSV_COL.elementAt(-1+6) ;
            n580TBM35_DISPLAY_FLG = false ;
            A581TBM35_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+7) ;
            n581TBM35_DEL_FLG = false ;
            A582TBM35_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+8), 6) ;
            n582TBM35_CRT_DATETIME = false ;
            A583TBM35_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+9) ;
            n583TBM35_CRT_USER_ID = false ;
            A584TBM35_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+10) ;
            n584TBM35_CRT_PROG_NM = false ;
            A585TBM35_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+11), 6) ;
            n585TBM35_UPD_DATETIME = false ;
            A586TBM35_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+12) ;
            n586TBM35_UPD_USER_ID = false ;
            A587TBM35_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+13) ;
            n587TBM35_UPD_PROG_NM = false ;
            A588TBM35_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+14)) ;
            n588TBM35_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM35_CRF_ITEM_AUTH" ;
            /* Using cursor P007E30 */
            pr_default.execute(28, new Object[] {new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD, new Boolean(n580TBM35_DISPLAY_FLG), A580TBM35_DISPLAY_FLG, new Boolean(n581TBM35_DEL_FLG), A581TBM35_DEL_FLG, new Boolean(n582TBM35_CRT_DATETIME), A582TBM35_CRT_DATETIME, new Boolean(n583TBM35_CRT_USER_ID), A583TBM35_CRT_USER_ID, new Boolean(n584TBM35_CRT_PROG_NM), A584TBM35_CRT_PROG_NM, new Boolean(n585TBM35_UPD_DATETIME), A585TBM35_UPD_DATETIME, new Boolean(n586TBM35_UPD_USER_ID), A586TBM35_UPD_USER_ID, new Boolean(n587TBM35_UPD_PROG_NM), A587TBM35_UPD_PROG_NM, new Boolean(n588TBM35_UPD_CNT), new Long(A588TBM35_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM35_CRF_ITEM_AUTH") ;
            if ( (pr_default.getStatus(28) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S281( )
   {
      /* 'SUB_INS_TBM36_CRF_SELECT' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM36_CRF_SELECT

            */
            A35TBM36_STUDY_ID = AV30W_STUDY_ID ;
            A36TBM36_CRF_ID = AV17W_CRF_ID ;
            A37TBM36_COND_NO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
            A38TBM36_SELECT_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+5))) ;
            A589TBM36_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+6) ;
            n589TBM36_DEL_FLG = false ;
            A590TBM36_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+7), 6) ;
            n590TBM36_CRT_DATETIME = false ;
            A591TBM36_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+8) ;
            n591TBM36_CRT_USER_ID = false ;
            A592TBM36_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+9) ;
            n592TBM36_CRT_PROG_NM = false ;
            A593TBM36_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+10), 6) ;
            n593TBM36_UPD_DATETIME = false ;
            A594TBM36_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+11) ;
            n594TBM36_UPD_USER_ID = false ;
            A595TBM36_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+12) ;
            n595TBM36_UPD_PROG_NM = false ;
            A596TBM36_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+13)) ;
            n596TBM36_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM36_CRF_SELECT" ;
            /* Using cursor P007E31 */
            pr_default.execute(29, new Object[] {new Long(A35TBM36_STUDY_ID), new Short(A36TBM36_CRF_ID), new Short(A37TBM36_COND_NO), new Short(A38TBM36_SELECT_CRF_ID), new Boolean(n589TBM36_DEL_FLG), A589TBM36_DEL_FLG, new Boolean(n590TBM36_CRT_DATETIME), A590TBM36_CRT_DATETIME, new Boolean(n591TBM36_CRT_USER_ID), A591TBM36_CRT_USER_ID, new Boolean(n592TBM36_CRT_PROG_NM), A592TBM36_CRT_PROG_NM, new Boolean(n593TBM36_UPD_DATETIME), A593TBM36_UPD_DATETIME, new Boolean(n594TBM36_UPD_USER_ID), A594TBM36_UPD_USER_ID, new Boolean(n595TBM36_UPD_PROG_NM), A595TBM36_UPD_PROG_NM, new Boolean(n596TBM36_UPD_CNT), new Long(A596TBM36_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM36_CRF_SELECT") ;
            if ( (pr_default.getStatus(29) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S291( )
   {
      /* 'SUB_INS_TBM37_CRF_DOM_MAP' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM37_CRF_DOM_MAP

            */
            A79TBM37_STUDY_ID = AV30W_STUDY_ID ;
            A80TBM37_CRF_ID = AV17W_CRF_ID ;
            A81TBM37_CRF_ITEM_GRP_DIV = (String)AV18W_CSV_COL.elementAt(-1+4) ;
            A82TBM37_CRF_ITEM_GRP_CD = (String)AV18W_CSV_COL.elementAt(-1+5) ;
            A83TBM37_VISIT_NO = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+6))) ;
            n83TBM37_VISIT_NO = false ;
            A84TBM37_DOM_CD = (String)AV18W_CSV_COL.elementAt(-1+7) ;
            n84TBM37_DOM_CD = false ;
            A500TBM37_DOM_VAR_NM = (String)AV18W_CSV_COL.elementAt(-1+8) ;
            n500TBM37_DOM_VAR_NM = false ;
            A85TBM37_DOM_ITM_GRP_OID = (String)AV18W_CSV_COL.elementAt(-1+9) ;
            n85TBM37_DOM_ITM_GRP_OID = false ;
            A501TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+10))) ;
            n501TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
            A86TBM37_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+11))) ;
            n86TBM37_DOM_ITM_GRP_ROWNO = false ;
            A433TBM37_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+12) ;
            n433TBM37_DEL_FLG = false ;
            A434TBM37_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+13), 6) ;
            n434TBM37_CRT_DATETIME = false ;
            A435TBM37_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+14) ;
            n435TBM37_CRT_USER_ID = false ;
            A436TBM37_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+15) ;
            n436TBM37_CRT_PROG_NM = false ;
            A437TBM37_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+16), 6) ;
            n437TBM37_UPD_DATETIME = false ;
            A438TBM37_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+17) ;
            n438TBM37_UPD_USER_ID = false ;
            A439TBM37_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+18) ;
            n439TBM37_UPD_PROG_NM = false ;
            A440TBM37_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+19)) ;
            n440TBM37_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM37_CRF_DOM_MAP" ;
            /* Using cursor P007E32 */
            pr_default.execute(30, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD, new Boolean(n83TBM37_VISIT_NO), new Integer(A83TBM37_VISIT_NO), new Boolean(n84TBM37_DOM_CD), A84TBM37_DOM_CD, new Boolean(n500TBM37_DOM_VAR_NM), A500TBM37_DOM_VAR_NM, new Boolean(n85TBM37_DOM_ITM_GRP_OID), A85TBM37_DOM_ITM_GRP_OID, new Boolean(n501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n86TBM37_DOM_ITM_GRP_ROWNO), new Short(A86TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n433TBM37_DEL_FLG), A433TBM37_DEL_FLG, new Boolean(n434TBM37_CRT_DATETIME), A434TBM37_CRT_DATETIME, new Boolean(n435TBM37_CRT_USER_ID), A435TBM37_CRT_USER_ID, new Boolean(n436TBM37_CRT_PROG_NM), A436TBM37_CRT_PROG_NM, new Boolean(n437TBM37_UPD_DATETIME), A437TBM37_UPD_DATETIME, new Boolean(n438TBM37_UPD_USER_ID), A438TBM37_UPD_USER_ID, new Boolean(n439TBM37_UPD_PROG_NM), A439TBM37_UPD_PROG_NM, new Boolean(n440TBM37_UPD_CNT), new Long(A440TBM37_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM37_CRF_DOM_MAP") ;
            if ( (pr_default.getStatus(30) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S301( )
   {
      /* 'SUB_INS_TBM41_CRF_NCM_MAP' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM41_CRF_NCM_MAP

            */
            A19TBM41_STUDY_ID = AV30W_STUDY_ID ;
            A20TBM41_CRF_ID = AV17W_CRF_ID ;
            A21TBM41_CRF_ITEM_GRP_DIV = (String)AV18W_CSV_COL.elementAt(-1+4) ;
            A22TBM41_CRF_ITEM_GRP_CD = (String)AV18W_CSV_COL.elementAt(-1+5) ;
            A424TBM41_NCM_METADATA_ID = (String)AV18W_CSV_COL.elementAt(-1+6) ;
            n424TBM41_NCM_METADATA_ID = false ;
            A425TBM41_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+7) ;
            n425TBM41_DEL_FLG = false ;
            A426TBM41_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+8), 6) ;
            n426TBM41_CRT_DATETIME = false ;
            A427TBM41_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+9) ;
            n427TBM41_CRT_USER_ID = false ;
            A428TBM41_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+10) ;
            n428TBM41_CRT_PROG_NM = false ;
            A429TBM41_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+11), 6) ;
            n429TBM41_UPD_DATETIME = false ;
            A430TBM41_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+12) ;
            n430TBM41_UPD_USER_ID = false ;
            A431TBM41_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+13) ;
            n431TBM41_UPD_PROG_NM = false ;
            A432TBM41_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+14)) ;
            n432TBM41_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM41_CRF_NCM_MAP" ;
            /* Using cursor P007E33 */
            pr_default.execute(31, new Object[] {new Long(A19TBM41_STUDY_ID), new Short(A20TBM41_CRF_ID), A21TBM41_CRF_ITEM_GRP_DIV, A22TBM41_CRF_ITEM_GRP_CD, new Boolean(n424TBM41_NCM_METADATA_ID), A424TBM41_NCM_METADATA_ID, new Boolean(n425TBM41_DEL_FLG), A425TBM41_DEL_FLG, new Boolean(n426TBM41_CRT_DATETIME), A426TBM41_CRT_DATETIME, new Boolean(n427TBM41_CRT_USER_ID), A427TBM41_CRT_USER_ID, new Boolean(n428TBM41_CRT_PROG_NM), A428TBM41_CRT_PROG_NM, new Boolean(n429TBM41_UPD_DATETIME), A429TBM41_UPD_DATETIME, new Boolean(n430TBM41_UPD_USER_ID), A430TBM41_UPD_USER_ID, new Boolean(n431TBM41_UPD_PROG_NM), A431TBM41_UPD_PROG_NM, new Boolean(n432TBM41_UPD_CNT), new Long(A432TBM41_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM41_CRF_NCM_MAP") ;
            if ( (pr_default.getStatus(31) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S311( )
   {
      /* 'SUB_INS_TBM42_STUDY_CDISC_DOMAIN' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBM42_STUDY_CDISC_DOMAIN

         */
         A203TBM42_STUDY_ID = AV30W_STUDY_ID ;
         A204TBM42_DOM_CD = (String)AV18W_CSV_COL.elementAt(-1+3) ;
         A905TBM42_DOM_ENM = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         n905TBM42_DOM_ENM = false ;
         A906TBM42_DOM_JNM = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n906TBM42_DOM_JNM = false ;
         A907TBM42_DOM_GRP_NM = (String)AV18W_CSV_COL.elementAt(-1+6) ;
         n907TBM42_DOM_GRP_NM = false ;
         A908TBM42_NOTE = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         n908TBM42_NOTE = false ;
         A909TBM42_ORDER = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+8))) ;
         n909TBM42_ORDER = false ;
         A893TBM42_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n893TBM42_DEL_FLG = false ;
         A894TBM42_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+10), 6) ;
         n894TBM42_CRT_DATETIME = false ;
         A895TBM42_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n895TBM42_CRT_USER_ID = false ;
         A896TBM42_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+12) ;
         n896TBM42_CRT_PROG_NM = false ;
         A897TBM42_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+13), 6) ;
         n897TBM42_UPD_DATETIME = false ;
         A898TBM42_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+14) ;
         n898TBM42_UPD_USER_ID = false ;
         A899TBM42_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+15) ;
         n899TBM42_UPD_PROG_NM = false ;
         A900TBM42_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+16)) ;
         n900TBM42_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM42_STUDY_CDISC_DOMAIN" ;
         /* Using cursor P007E34 */
         pr_default.execute(32, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD, new Boolean(n905TBM42_DOM_ENM), A905TBM42_DOM_ENM, new Boolean(n906TBM42_DOM_JNM), A906TBM42_DOM_JNM, new Boolean(n907TBM42_DOM_GRP_NM), A907TBM42_DOM_GRP_NM, new Boolean(n908TBM42_NOTE), A908TBM42_NOTE, new Boolean(n909TBM42_ORDER), new Integer(A909TBM42_ORDER), new Boolean(n893TBM42_DEL_FLG), A893TBM42_DEL_FLG, new Boolean(n894TBM42_CRT_DATETIME), A894TBM42_CRT_DATETIME, new Boolean(n895TBM42_CRT_USER_ID), A895TBM42_CRT_USER_ID, new Boolean(n896TBM42_CRT_PROG_NM), A896TBM42_CRT_PROG_NM, new Boolean(n897TBM42_UPD_DATETIME), A897TBM42_UPD_DATETIME, new Boolean(n898TBM42_UPD_USER_ID), A898TBM42_UPD_USER_ID, new Boolean(n899TBM42_UPD_PROG_NM), A899TBM42_UPD_PROG_NM, new Boolean(n900TBM42_UPD_CNT), new Long(A900TBM42_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM42_STUDY_CDISC_DOMAIN") ;
         if ( (pr_default.getStatus(32) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S321( )
   {
      /* 'SUB_INS_TBM43_STUDY_CDISC_ITEM' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBM43_STUDY_CDISC_ITEM

         */
         A200TBM43_STUDY_ID = AV30W_STUDY_ID ;
         A201TBM43_DOM_CD = (String)AV18W_CSV_COL.elementAt(-1+3) ;
         A202TBM43_DOM_VAR_NM = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         A910TBM43_VAR_DESC = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n910TBM43_VAR_DESC = false ;
         A911TBM43_SDTM_FLG = (String)AV18W_CSV_COL.elementAt(-1+6) ;
         n911TBM43_SDTM_FLG = false ;
         A912TBM43_CDASH_FLG = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         n912TBM43_CDASH_FLG = false ;
         A913TBM43_INPUT_TYPE_DIV = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n913TBM43_INPUT_TYPE_DIV = false ;
         A914TBM43_REQUIRED_FLG = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n914TBM43_REQUIRED_FLG = false ;
         A915TBM43_SAS_FIELD_NM = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n915TBM43_SAS_FIELD_NM = false ;
         A916TBM43_ODM_DATA_TYPE = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n916TBM43_ODM_DATA_TYPE = false ;
         A917TBM43_NOTE = (String)AV18W_CSV_COL.elementAt(-1+12) ;
         n917TBM43_NOTE = false ;
         A918TBM43_ORDER = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+13))) ;
         n918TBM43_ORDER = false ;
         A933TBM43_VERSION = (String)AV18W_CSV_COL.elementAt(-1+14) ;
         n933TBM43_VERSION = false ;
         A919TBM43_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+15) ;
         n919TBM43_DEL_FLG = false ;
         A920TBM43_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+16), 6) ;
         n920TBM43_CRT_DATETIME = false ;
         A921TBM43_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+17) ;
         n921TBM43_CRT_USER_ID = false ;
         A922TBM43_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+18) ;
         n922TBM43_CRT_PROG_NM = false ;
         A923TBM43_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+19), 6) ;
         n923TBM43_UPD_DATETIME = false ;
         A924TBM43_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+20) ;
         n924TBM43_UPD_USER_ID = false ;
         A925TBM43_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+21) ;
         n925TBM43_UPD_PROG_NM = false ;
         A926TBM43_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+22)) ;
         n926TBM43_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM43_STUDY_CDISC_ITEM" ;
         /* Using cursor P007E35 */
         pr_default.execute(33, new Object[] {new Long(A200TBM43_STUDY_ID), A201TBM43_DOM_CD, A202TBM43_DOM_VAR_NM, new Boolean(n910TBM43_VAR_DESC), A910TBM43_VAR_DESC, new Boolean(n911TBM43_SDTM_FLG), A911TBM43_SDTM_FLG, new Boolean(n912TBM43_CDASH_FLG), A912TBM43_CDASH_FLG, new Boolean(n913TBM43_INPUT_TYPE_DIV), A913TBM43_INPUT_TYPE_DIV, new Boolean(n914TBM43_REQUIRED_FLG), A914TBM43_REQUIRED_FLG, new Boolean(n915TBM43_SAS_FIELD_NM), A915TBM43_SAS_FIELD_NM, new Boolean(n916TBM43_ODM_DATA_TYPE), A916TBM43_ODM_DATA_TYPE, new Boolean(n917TBM43_NOTE), A917TBM43_NOTE, new Boolean(n918TBM43_ORDER), new Integer(A918TBM43_ORDER), new Boolean(n933TBM43_VERSION), A933TBM43_VERSION, new Boolean(n919TBM43_DEL_FLG), A919TBM43_DEL_FLG, new Boolean(n920TBM43_CRT_DATETIME), A920TBM43_CRT_DATETIME, new Boolean(n921TBM43_CRT_USER_ID), A921TBM43_CRT_USER_ID, new Boolean(n922TBM43_CRT_PROG_NM), A922TBM43_CRT_PROG_NM, new Boolean(n923TBM43_UPD_DATETIME), A923TBM43_UPD_DATETIME, new Boolean(n924TBM43_UPD_USER_ID), A924TBM43_UPD_USER_ID, new Boolean(n925TBM43_UPD_PROG_NM), A925TBM43_UPD_PROG_NM, new Boolean(n926TBM43_UPD_CNT), new Long(A926TBM43_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM43_STUDY_CDISC_ITEM") ;
         if ( (pr_default.getStatus(33) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S331( )
   {
      /* 'SUB_INS_TBM44_CRF_VISIT' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Execute user subroutine: S421 */
         S421 ();
         if (returnInSub) return;
         if ( AV46W_CRF_IMPORT_FLG )
         {
            /*
               INSERT RECORD ON TABLE TBM44_CRF_VISIT

            */
            A945TBM44_STUDY_ID = AV30W_STUDY_ID ;
            A946TBM44_CRF_ID = AV17W_CRF_ID ;
            A947TBM44_CRF_EDA_NO = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
            A948TBM44_VISIT_NO = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+5))) ;
            n948TBM44_VISIT_NO = false ;
            A949TBM44_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+6) ;
            n949TBM44_DEL_FLG = false ;
            A950TBM44_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+7), 6) ;
            n950TBM44_CRT_DATETIME = false ;
            A951TBM44_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+8) ;
            n951TBM44_CRT_USER_ID = false ;
            A952TBM44_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+9) ;
            n952TBM44_CRT_PROG_NM = false ;
            A953TBM44_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+10), 6) ;
            n953TBM44_UPD_DATETIME = false ;
            A954TBM44_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+11) ;
            n954TBM44_UPD_USER_ID = false ;
            A955TBM44_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+12) ;
            n955TBM44_UPD_PROG_NM = false ;
            A956TBM44_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+13)) ;
            n956TBM44_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM44_CRF_VISIT" ;
            /* Using cursor P007E36 */
            pr_default.execute(34, new Object[] {new Long(A945TBM44_STUDY_ID), new Short(A946TBM44_CRF_ID), new Byte(A947TBM44_CRF_EDA_NO), new Boolean(n948TBM44_VISIT_NO), new Integer(A948TBM44_VISIT_NO), new Boolean(n949TBM44_DEL_FLG), A949TBM44_DEL_FLG, new Boolean(n950TBM44_CRT_DATETIME), A950TBM44_CRT_DATETIME, new Boolean(n951TBM44_CRT_USER_ID), A951TBM44_CRT_USER_ID, new Boolean(n952TBM44_CRT_PROG_NM), A952TBM44_CRT_PROG_NM, new Boolean(n953TBM44_UPD_DATETIME), A953TBM44_UPD_DATETIME, new Boolean(n954TBM44_UPD_USER_ID), A954TBM44_UPD_USER_ID, new Boolean(n955TBM44_UPD_PROG_NM), A955TBM44_UPD_PROG_NM, new Boolean(n956TBM44_UPD_CNT), new Long(A956TBM44_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM44_CRF_VISIT") ;
            if ( (pr_default.getStatus(34) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
   }

   public void S341( )
   {
      /* 'SUB_INS_TBM45_CRF_FILETR' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBM45_CRF_FILETR" ;
         /* Using cursor P007E37 */
         pr_default.execute(35, new Object[] {new Long(AV30W_STUDY_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
         /* End optimized DELETE. */
         /*
            INSERT RECORD ON TABLE TBM45_CRF_FILETR

         */
         A977TBM45_STUDY_ID = AV30W_STUDY_ID ;
         A978TBM45_FILTER_NO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         A980TBM45_FILETR_NM = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         n980TBM45_FILETR_NM = false ;
         A981TBM45_IN_CRF_ID = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n981TBM45_IN_CRF_ID = false ;
         A982TBM45_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+6) ;
         n982TBM45_DEL_FLG = false ;
         A983TBM45_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+7), 6) ;
         n983TBM45_CRT_DATETIME = false ;
         A984TBM45_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n984TBM45_CRT_USER_ID = false ;
         A985TBM45_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n985TBM45_CRT_PROG_NM = false ;
         A986TBM45_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+10), 6) ;
         n986TBM45_UPD_DATETIME = false ;
         A987TBM45_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n987TBM45_UPD_USER_ID = false ;
         A988TBM45_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+12) ;
         n988TBM45_UPD_PROG_NM = false ;
         A989TBM45_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+13)) ;
         n989TBM45_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBM45_CRF_FILETR" ;
         /* Using cursor P007E38 */
         pr_default.execute(36, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO), new Boolean(n980TBM45_FILETR_NM), A980TBM45_FILETR_NM, new Boolean(n981TBM45_IN_CRF_ID), A981TBM45_IN_CRF_ID, new Boolean(n982TBM45_DEL_FLG), A982TBM45_DEL_FLG, new Boolean(n983TBM45_CRT_DATETIME), A983TBM45_CRT_DATETIME, new Boolean(n984TBM45_CRT_USER_ID), A984TBM45_CRT_USER_ID, new Boolean(n985TBM45_CRT_PROG_NM), A985TBM45_CRT_PROG_NM, new Boolean(n986TBM45_UPD_DATETIME), A986TBM45_UPD_DATETIME, new Boolean(n987TBM45_UPD_USER_ID), A987TBM45_UPD_USER_ID, new Boolean(n988TBM45_UPD_PROG_NM), A988TBM45_UPD_PROG_NM, new Boolean(n989TBM45_UPD_CNT), new Long(A989TBM45_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
         if ( (pr_default.getStatus(36) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S351( )
   {
      /* 'SUB_INS_TBT01_SUBJECT' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV31W_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT01_SUBJECT" ;
         /* Using cursor P007E39 */
         pr_default.execute(37, new Object[] {new Long(AV30W_STUDY_ID), new Integer(AV31W_SUBJECT_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT01_SUBJECT") ;
         /* End optimized DELETE. */
         /*
            INSERT RECORD ON TABLE TBT01_SUBJECT

         */
         A87TBT01_STUDY_ID = AV30W_STUDY_ID ;
         A88TBT01_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         A647TBT01_OUTER_SUBJECT_ID = (String)AV18W_CSV_COL.elementAt(-1+4) ;
         n647TBT01_OUTER_SUBJECT_ID = false ;
         A698TBT01_SITE_ID = (String)AV18W_CSV_COL.elementAt(-1+5) ;
         n698TBT01_SITE_ID = false ;
         A441TBT01_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+6) ;
         n441TBT01_DEL_FLG = false ;
         A442TBT01_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+7), 6) ;
         n442TBT01_CRT_DATETIME = false ;
         A443TBT01_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n443TBT01_CRT_USER_ID = false ;
         A444TBT01_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n444TBT01_CRT_PROG_NM = false ;
         A445TBT01_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+10), 6) ;
         n445TBT01_UPD_DATETIME = false ;
         A446TBT01_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n446TBT01_UPD_USER_ID = false ;
         A447TBT01_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+12) ;
         n447TBT01_UPD_PROG_NM = false ;
         A448TBT01_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+13)) ;
         n448TBT01_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBT01_SUBJECT" ;
         /* Using cursor P007E40 */
         pr_default.execute(38, new Object[] {new Long(A87TBT01_STUDY_ID), new Integer(A88TBT01_SUBJECT_ID), new Boolean(n647TBT01_OUTER_SUBJECT_ID), A647TBT01_OUTER_SUBJECT_ID, new Boolean(n698TBT01_SITE_ID), A698TBT01_SITE_ID, new Boolean(n441TBT01_DEL_FLG), A441TBT01_DEL_FLG, new Boolean(n442TBT01_CRT_DATETIME), A442TBT01_CRT_DATETIME, new Boolean(n443TBT01_CRT_USER_ID), A443TBT01_CRT_USER_ID, new Boolean(n444TBT01_CRT_PROG_NM), A444TBT01_CRT_PROG_NM, new Boolean(n445TBT01_UPD_DATETIME), A445TBT01_UPD_DATETIME, new Boolean(n446TBT01_UPD_USER_ID), A446TBT01_UPD_USER_ID, new Boolean(n447TBT01_UPD_PROG_NM), A447TBT01_UPD_PROG_NM, new Boolean(n448TBT01_UPD_CNT), new Long(A448TBT01_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT01_SUBJECT") ;
         if ( (pr_default.getStatus(38) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S361( )
   {
      /* 'SUB_INS_TBT02_CRF' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV31W_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT02_CRF" ;
         /* Using cursor P007E41 */
         pr_default.execute(39, new Object[] {new Long(AV30W_STUDY_ID), new Integer(AV31W_SUBJECT_ID)});
         while ( (pr_default.getStatus(39) != 101) )
         {
            A935TBT02_CRF_EDA_NO = P007E41_A935TBT02_CRF_EDA_NO[0] ;
            A91TBT02_CRF_ID = P007E41_A91TBT02_CRF_ID[0] ;
            A90TBT02_SUBJECT_ID = P007E41_A90TBT02_SUBJECT_ID[0] ;
            A89TBT02_STUDY_ID = P007E41_A89TBT02_STUDY_ID[0] ;
            if ( A91TBT02_CRF_ID == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+4), ".") )
            {
               if ( A935TBT02_CRF_EDA_NO == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+5), ".") )
               {
                  Gx_ope = "Delete" ;
                  Gx_etb = "TBT02_CRF" ;
                  /* Using cursor P007E42 */
                  pr_default.execute(40, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
               }
            }
            pr_default.readNext(39);
         }
         pr_default.close(39);
         /*
            INSERT RECORD ON TABLE TBT02_CRF

         */
         A89TBT02_STUDY_ID = AV30W_STUDY_ID ;
         A90TBT02_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         A91TBT02_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
         A935TBT02_CRF_EDA_NO = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+5))) ;
         A498TBT02_CRF_LATEST_VERSION = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+6))) ;
         n498TBT02_CRF_LATEST_VERSION = false ;
         A499TBT02_CRF_INPUT_LEVEL = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+7))) ;
         n499TBT02_CRF_INPUT_LEVEL = false ;
         A648TBT02_LOCK_FLG = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n648TBT02_LOCK_FLG = false ;
         A649TBT02_LOCK_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+9), 6) ;
         n649TBT02_LOCK_DATETIME = false ;
         A650TBT02_LOCK_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n650TBT02_LOCK_USER_ID = false ;
         A651TBT02_LOCK_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n651TBT02_LOCK_AUTH_CD = false ;
         A652TBT02_UPLOAD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+12), 6) ;
         n652TBT02_UPLOAD_DATETIME = false ;
         A653TBT02_UPLOAD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+13) ;
         n653TBT02_UPLOAD_USER_ID = false ;
         A654TBT02_UPLOAD_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+14) ;
         n654TBT02_UPLOAD_AUTH_CD = false ;
         A655TBT02_DM_ARRIVAL_FLG = (String)AV18W_CSV_COL.elementAt(-1+15) ;
         n655TBT02_DM_ARRIVAL_FLG = false ;
         A656TBT02_DM_ARRIVAL_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+16), 6) ;
         n656TBT02_DM_ARRIVAL_DATETIME = false ;
         A657TBT02_APPROVAL_FLG = (String)AV18W_CSV_COL.elementAt(-1+17) ;
         n657TBT02_APPROVAL_FLG = false ;
         A658TBT02_APPROVAL_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+18), 6) ;
         n658TBT02_APPROVAL_DATETIME = false ;
         A659TBT02_APPROVAL_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+19) ;
         n659TBT02_APPROVAL_USER_ID = false ;
         A660TBT02_APPROVAL_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+20) ;
         n660TBT02_APPROVAL_AUTH_CD = false ;
         A990TBT02_SIGNATURE_FLG = (String)AV18W_CSV_COL.elementAt(-1+21) ;
         n990TBT02_SIGNATURE_FLG = false ;
         A991TBT02_SIGNATURE_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+22), 6) ;
         n991TBT02_SIGNATURE_DATETIME = false ;
         A992TBT02_SIGNATURE_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+23) ;
         n992TBT02_SIGNATURE_USER_ID = false ;
         A661TBT02_INPUT_END_FLG = (String)AV18W_CSV_COL.elementAt(-1+24) ;
         n661TBT02_INPUT_END_FLG = false ;
         A662TBT02_INPUT_END_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+25), 6) ;
         n662TBT02_INPUT_END_DATETIME = false ;
         A663TBT02_INPUT_END_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+26) ;
         n663TBT02_INPUT_END_USER_ID = false ;
         A664TBT02_INPUT_END_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+27) ;
         n664TBT02_INPUT_END_AUTH_CD = false ;
         A449TBT02_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+28) ;
         n449TBT02_DEL_FLG = false ;
         A450TBT02_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+29), 6) ;
         n450TBT02_CRT_DATETIME = false ;
         A451TBT02_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+30) ;
         n451TBT02_CRT_USER_ID = false ;
         A452TBT02_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+31) ;
         n452TBT02_CRT_PROG_NM = false ;
         A453TBT02_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+32), 6) ;
         n453TBT02_UPD_DATETIME = false ;
         A454TBT02_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+33) ;
         n454TBT02_UPD_USER_ID = false ;
         A455TBT02_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+34) ;
         n455TBT02_UPD_PROG_NM = false ;
         A456TBT02_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+35)) ;
         n456TBT02_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBT02_CRF" ;
         /* Using cursor P007E43 */
         pr_default.execute(41, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO), new Boolean(n498TBT02_CRF_LATEST_VERSION), new Short(A498TBT02_CRF_LATEST_VERSION), new Boolean(n499TBT02_CRF_INPUT_LEVEL), new Byte(A499TBT02_CRF_INPUT_LEVEL), new Boolean(n648TBT02_LOCK_FLG), A648TBT02_LOCK_FLG, new Boolean(n649TBT02_LOCK_DATETIME), A649TBT02_LOCK_DATETIME, new Boolean(n650TBT02_LOCK_USER_ID), A650TBT02_LOCK_USER_ID, new Boolean(n651TBT02_LOCK_AUTH_CD), A651TBT02_LOCK_AUTH_CD, new Boolean(n652TBT02_UPLOAD_DATETIME), A652TBT02_UPLOAD_DATETIME, new Boolean(n653TBT02_UPLOAD_USER_ID), A653TBT02_UPLOAD_USER_ID, new Boolean(n654TBT02_UPLOAD_AUTH_CD), A654TBT02_UPLOAD_AUTH_CD, new Boolean(n655TBT02_DM_ARRIVAL_FLG), A655TBT02_DM_ARRIVAL_FLG, new Boolean(n656TBT02_DM_ARRIVAL_DATETIME), A656TBT02_DM_ARRIVAL_DATETIME, new Boolean(n657TBT02_APPROVAL_FLG), A657TBT02_APPROVAL_FLG, new Boolean(n658TBT02_APPROVAL_DATETIME), A658TBT02_APPROVAL_DATETIME, new Boolean(n659TBT02_APPROVAL_USER_ID), A659TBT02_APPROVAL_USER_ID, new Boolean(n660TBT02_APPROVAL_AUTH_CD), A660TBT02_APPROVAL_AUTH_CD, new Boolean(n661TBT02_INPUT_END_FLG), A661TBT02_INPUT_END_FLG, new Boolean(n662TBT02_INPUT_END_DATETIME), A662TBT02_INPUT_END_DATETIME, new Boolean(n663TBT02_INPUT_END_USER_ID), A663TBT02_INPUT_END_USER_ID, new Boolean(n664TBT02_INPUT_END_AUTH_CD), A664TBT02_INPUT_END_AUTH_CD, new Boolean(n449TBT02_DEL_FLG), A449TBT02_DEL_FLG, new Boolean(n450TBT02_CRT_DATETIME), A450TBT02_CRT_DATETIME, new Boolean(n451TBT02_CRT_USER_ID), A451TBT02_CRT_USER_ID, new Boolean(n452TBT02_CRT_PROG_NM), A452TBT02_CRT_PROG_NM, new Boolean(n453TBT02_UPD_DATETIME), A453TBT02_UPD_DATETIME, new Boolean(n454TBT02_UPD_USER_ID), A454TBT02_UPD_USER_ID, new Boolean(n455TBT02_UPD_PROG_NM), A455TBT02_UPD_PROG_NM, new Boolean(n456TBT02_UPD_CNT), new Long(A456TBT02_UPD_CNT), new Boolean(n990TBT02_SIGNATURE_FLG), A990TBT02_SIGNATURE_FLG, new Boolean(n991TBT02_SIGNATURE_DATETIME), A991TBT02_SIGNATURE_DATETIME, new Boolean(n992TBT02_SIGNATURE_USER_ID), A992TBT02_SIGNATURE_USER_ID});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
         if ( (pr_default.getStatus(41) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S371( )
   {
      /* 'SUB_INS_TBT11_CRF_HISTORY' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV31W_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT11_CRF_HISTORY" ;
         /* Using cursor P007E44 */
         pr_default.execute(42, new Object[] {new Long(AV30W_STUDY_ID), new Integer(AV31W_SUBJECT_ID), new Short(AV17W_CRF_ID)});
         while ( (pr_default.getStatus(42) != 101) )
         {
            A95TBT11_CRF_VERSION = P007E44_A95TBT11_CRF_VERSION[0] ;
            A936TBT11_CRF_EDA_NO = P007E44_A936TBT11_CRF_EDA_NO[0] ;
            A94TBT11_CRF_ID = P007E44_A94TBT11_CRF_ID[0] ;
            A93TBT11_SUBJECT_ID = P007E44_A93TBT11_SUBJECT_ID[0] ;
            A92TBT11_STUDY_ID = P007E44_A92TBT11_STUDY_ID[0] ;
            if ( A936TBT11_CRF_EDA_NO == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+5), ".") )
            {
               if ( A95TBT11_CRF_VERSION == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+6), ".") )
               {
                  Gx_ope = "Delete" ;
                  Gx_etb = "TBT11_CRF_HISTORY" ;
                  /* Using cursor P007E45 */
                  pr_default.execute(43, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
               }
            }
            pr_default.readNext(42);
         }
         pr_default.close(42);
         /*
            INSERT RECORD ON TABLE TBT11_CRF_HISTORY

         */
         A92TBT11_STUDY_ID = AV30W_STUDY_ID ;
         A93TBT11_SUBJECT_ID = AV31W_SUBJECT_ID ;
         A94TBT11_CRF_ID = AV17W_CRF_ID ;
         A936TBT11_CRF_EDA_NO = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+5))) ;
         A95TBT11_CRF_VERSION = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+6))) ;
         A665TBT11_CRF_INPUT_LEVEL = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+7))) ;
         n665TBT11_CRF_INPUT_LEVEL = false ;
         A666TBT11_UPLOAD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+8), 6) ;
         n666TBT11_UPLOAD_DATETIME = false ;
         A667TBT11_UPLOAD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n667TBT11_UPLOAD_USER_ID = false ;
         A668TBT11_UPLOAD_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n668TBT11_UPLOAD_AUTH_CD = false ;
         A669TBT11_DM_ARRIVAL_FLG = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n669TBT11_DM_ARRIVAL_FLG = false ;
         A670TBT11_DM_ARRIVAL_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+12), 6) ;
         n670TBT11_DM_ARRIVAL_DATETIME = false ;
         A671TBT11_APPROVAL_FLG = (String)AV18W_CSV_COL.elementAt(-1+13) ;
         n671TBT11_APPROVAL_FLG = false ;
         A672TBT11_APPROVAL_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+14), 6) ;
         n672TBT11_APPROVAL_DATETIME = false ;
         A673TBT11_APPROVAL_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+15) ;
         n673TBT11_APPROVAL_USER_ID = false ;
         A674TBT11_APPROVAL_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+16) ;
         n674TBT11_APPROVAL_AUTH_CD = false ;
         A993TBT11_SIGNATURE_FLG = (String)AV18W_CSV_COL.elementAt(-1+17) ;
         n993TBT11_SIGNATURE_FLG = false ;
         A994TBT11_SIGNATURE_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+18), 6) ;
         n994TBT11_SIGNATURE_DATETIME = false ;
         A995TBT11_SIGNATURE_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+19) ;
         n995TBT11_SIGNATURE_USER_ID = false ;
         A675TBT11_INPUT_END_FLG = (String)AV18W_CSV_COL.elementAt(-1+20) ;
         n675TBT11_INPUT_END_FLG = false ;
         A676TBT11_INPUT_END_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+21), 6) ;
         n676TBT11_INPUT_END_DATETIME = false ;
         A677TBT11_INPUT_END_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+22) ;
         n677TBT11_INPUT_END_USER_ID = false ;
         A678TBT11_INPUT_END_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+23) ;
         n678TBT11_INPUT_END_AUTH_CD = false ;
         A891TBT11_UPD_RIYU = (String)AV18W_CSV_COL.elementAt(-1+24) ;
         n891TBT11_UPD_RIYU = false ;
         A457TBT11_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+25) ;
         n457TBT11_DEL_FLG = false ;
         A458TBT11_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+26), 6) ;
         n458TBT11_CRT_DATETIME = false ;
         A459TBT11_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+27) ;
         n459TBT11_CRT_USER_ID = false ;
         A460TBT11_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+28) ;
         n460TBT11_CRT_PROG_NM = false ;
         A461TBT11_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+29), 6) ;
         n461TBT11_UPD_DATETIME = false ;
         A462TBT11_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+30) ;
         n462TBT11_UPD_USER_ID = false ;
         A463TBT11_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+31) ;
         n463TBT11_UPD_PROG_NM = false ;
         A464TBT11_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+32)) ;
         n464TBT11_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBT11_CRF_HISTORY" ;
         /* Using cursor P007E46 */
         pr_default.execute(44, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION), new Boolean(n665TBT11_CRF_INPUT_LEVEL), new Byte(A665TBT11_CRF_INPUT_LEVEL), new Boolean(n666TBT11_UPLOAD_DATETIME), A666TBT11_UPLOAD_DATETIME, new Boolean(n667TBT11_UPLOAD_USER_ID), A667TBT11_UPLOAD_USER_ID, new Boolean(n668TBT11_UPLOAD_AUTH_CD), A668TBT11_UPLOAD_AUTH_CD, new Boolean(n669TBT11_DM_ARRIVAL_FLG), A669TBT11_DM_ARRIVAL_FLG, new Boolean(n670TBT11_DM_ARRIVAL_DATETIME), A670TBT11_DM_ARRIVAL_DATETIME, new Boolean(n671TBT11_APPROVAL_FLG), A671TBT11_APPROVAL_FLG, new Boolean(n672TBT11_APPROVAL_DATETIME), A672TBT11_APPROVAL_DATETIME, new Boolean(n673TBT11_APPROVAL_USER_ID), A673TBT11_APPROVAL_USER_ID, new Boolean(n674TBT11_APPROVAL_AUTH_CD), A674TBT11_APPROVAL_AUTH_CD, new Boolean(n675TBT11_INPUT_END_FLG), A675TBT11_INPUT_END_FLG, new Boolean(n676TBT11_INPUT_END_DATETIME), A676TBT11_INPUT_END_DATETIME, new Boolean(n677TBT11_INPUT_END_USER_ID), A677TBT11_INPUT_END_USER_ID, new Boolean(n678TBT11_INPUT_END_AUTH_CD), A678TBT11_INPUT_END_AUTH_CD, new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n457TBT11_DEL_FLG), A457TBT11_DEL_FLG, new Boolean(n458TBT11_CRT_DATETIME), A458TBT11_CRT_DATETIME, new Boolean(n459TBT11_CRT_USER_ID), A459TBT11_CRT_USER_ID, new Boolean(n460TBT11_CRT_PROG_NM), A460TBT11_CRT_PROG_NM, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT), new Boolean(n993TBT11_SIGNATURE_FLG), A993TBT11_SIGNATURE_FLG, new Boolean(n994TBT11_SIGNATURE_DATETIME), A994TBT11_SIGNATURE_DATETIME, new Boolean(n995TBT11_SIGNATURE_USER_ID), A995TBT11_SIGNATURE_USER_ID});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
         if ( (pr_default.getStatus(44) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S381( )
   {
      /* 'SUB_INS_TBT12_CRF_RESULT' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV31W_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT12_CRF_RESULT" ;
         /* Using cursor P007E47 */
         pr_default.execute(45, new Object[] {new Long(AV30W_STUDY_ID), new Integer(AV31W_SUBJECT_ID), new Short(AV17W_CRF_ID)});
         while ( (pr_default.getStatus(45) != 101) )
         {
            A100TBT12_CRF_ITEM_GRP_CD = P007E47_A100TBT12_CRF_ITEM_GRP_CD[0] ;
            A99TBT12_CRF_ITEM_GRP_DIV = P007E47_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
            A937TBT12_CRF_EDA_NO = P007E47_A937TBT12_CRF_EDA_NO[0] ;
            A98TBT12_CRF_ID = P007E47_A98TBT12_CRF_ID[0] ;
            A97TBT12_SUBJECT_ID = P007E47_A97TBT12_SUBJECT_ID[0] ;
            A96TBT12_STUDY_ID = P007E47_A96TBT12_STUDY_ID[0] ;
            if ( A937TBT12_CRF_EDA_NO == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+5), ".") )
            {
               if ( GXutil.strcmp(A99TBT12_CRF_ITEM_GRP_DIV, (String)AV18W_CSV_COL.elementAt(-1+6)) == 0 )
               {
                  if ( GXutil.strcmp(A100TBT12_CRF_ITEM_GRP_CD, (String)AV18W_CSV_COL.elementAt(-1+7)) == 0 )
                  {
                     Gx_ope = "Delete" ;
                     Gx_etb = "TBT12_CRF_RESULT" ;
                     /* Using cursor P007E48 */
                     pr_default.execute(46, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
                  }
               }
            }
            pr_default.readNext(45);
         }
         pr_default.close(45);
         /*
            INSERT RECORD ON TABLE TBT12_CRF_RESULT

         */
         A96TBT12_STUDY_ID = AV30W_STUDY_ID ;
         A97TBT12_SUBJECT_ID = AV31W_SUBJECT_ID ;
         A98TBT12_CRF_ID = AV17W_CRF_ID ;
         A937TBT12_CRF_EDA_NO = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+5))) ;
         A99TBT12_CRF_ITEM_GRP_DIV = (String)AV18W_CSV_COL.elementAt(-1+6) ;
         A100TBT12_CRF_ITEM_GRP_CD = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         A465TBT12_CRF_VALUE = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n465TBT12_CRF_VALUE = false ;
         A679TBT12_EDIT_FLG = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n679TBT12_EDIT_FLG = false ;
         A473TBT12_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n473TBT12_DEL_FLG = false ;
         A466TBT12_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+11), 6) ;
         n466TBT12_CRT_DATETIME = false ;
         A467TBT12_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+12) ;
         n467TBT12_CRT_USER_ID = false ;
         A468TBT12_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+13) ;
         n468TBT12_CRT_PROG_NM = false ;
         A469TBT12_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+14), 6) ;
         n469TBT12_UPD_DATETIME = false ;
         A470TBT12_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+15) ;
         n470TBT12_UPD_USER_ID = false ;
         A471TBT12_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+16) ;
         n471TBT12_UPD_PROG_NM = false ;
         A472TBT12_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+17)) ;
         n472TBT12_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBT12_CRF_RESULT" ;
         /* Using cursor P007E49 */
         pr_default.execute(47, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD, new Boolean(n465TBT12_CRF_VALUE), A465TBT12_CRF_VALUE, new Boolean(n679TBT12_EDIT_FLG), A679TBT12_EDIT_FLG, new Boolean(n473TBT12_DEL_FLG), A473TBT12_DEL_FLG, new Boolean(n466TBT12_CRT_DATETIME), A466TBT12_CRT_DATETIME, new Boolean(n467TBT12_CRT_USER_ID), A467TBT12_CRT_USER_ID, new Boolean(n468TBT12_CRT_PROG_NM), A468TBT12_CRT_PROG_NM, new Boolean(n469TBT12_UPD_DATETIME), A469TBT12_UPD_DATETIME, new Boolean(n470TBT12_UPD_USER_ID), A470TBT12_UPD_USER_ID, new Boolean(n471TBT12_UPD_PROG_NM), A471TBT12_UPD_PROG_NM, new Boolean(n472TBT12_UPD_CNT), new Long(A472TBT12_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
         if ( (pr_default.getStatus(47) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S391( )
   {
      /* 'SUB_INS_TBT13_CRF_RES_HIS' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV31W_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         AV17W_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT13_CRF_RES_HIS" ;
         /* Using cursor P007E50 */
         pr_default.execute(48, new Object[] {new Long(AV30W_STUDY_ID), new Integer(AV31W_SUBJECT_ID), new Short(AV17W_CRF_ID)});
         while ( (pr_default.getStatus(48) != 101) )
         {
            A106TBT13_CRF_ITEM_GRP_CD = P007E50_A106TBT13_CRF_ITEM_GRP_CD[0] ;
            A105TBT13_CRF_ITEM_GRP_DIV = P007E50_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
            A104TBT13_CRF_VERSION = P007E50_A104TBT13_CRF_VERSION[0] ;
            A938TBT13_CRF_EDA_NO = P007E50_A938TBT13_CRF_EDA_NO[0] ;
            A103TBT13_CRF_ID = P007E50_A103TBT13_CRF_ID[0] ;
            A102TBT13_SUBJECT_ID = P007E50_A102TBT13_SUBJECT_ID[0] ;
            A101TBT13_STUDY_ID = P007E50_A101TBT13_STUDY_ID[0] ;
            if ( A938TBT13_CRF_EDA_NO == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+5), ".") )
            {
               if ( A104TBT13_CRF_VERSION == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+6), ".") )
               {
                  if ( GXutil.strcmp(A105TBT13_CRF_ITEM_GRP_DIV, (String)AV18W_CSV_COL.elementAt(-1+7)) == 0 )
                  {
                     if ( GXutil.strcmp(A106TBT13_CRF_ITEM_GRP_CD, (String)AV18W_CSV_COL.elementAt(-1+8)) == 0 )
                     {
                        Gx_ope = "Delete" ;
                        Gx_etb = "TBT13_CRF_RES_HIS" ;
                        /* Using cursor P007E51 */
                        pr_default.execute(49, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
                     }
                  }
               }
            }
            pr_default.readNext(48);
         }
         pr_default.close(48);
         /*
            INSERT RECORD ON TABLE TBT13_CRF_RES_HIS

         */
         A101TBT13_STUDY_ID = AV30W_STUDY_ID ;
         A102TBT13_SUBJECT_ID = AV31W_SUBJECT_ID ;
         A103TBT13_CRF_ID = AV17W_CRF_ID ;
         A938TBT13_CRF_EDA_NO = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+5))) ;
         A104TBT13_CRF_VERSION = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+6))) ;
         A105TBT13_CRF_ITEM_GRP_DIV = (String)AV18W_CSV_COL.elementAt(-1+7) ;
         A106TBT13_CRF_ITEM_GRP_CD = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         A597TBT13_CRF_VALUE = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n597TBT13_CRF_VALUE = false ;
         A680TBT13_EDIT_FLG = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n680TBT13_EDIT_FLG = false ;
         A598TBT13_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n598TBT13_DEL_FLG = false ;
         A599TBT13_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+12), 6) ;
         n599TBT13_CRT_DATETIME = false ;
         A600TBT13_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+13) ;
         n600TBT13_CRT_USER_ID = false ;
         A601TBT13_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+14) ;
         n601TBT13_CRT_PROG_NM = false ;
         A602TBT13_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+15), 6) ;
         n602TBT13_UPD_DATETIME = false ;
         A603TBT13_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+16) ;
         n603TBT13_UPD_USER_ID = false ;
         A604TBT13_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+17) ;
         n604TBT13_UPD_PROG_NM = false ;
         A605TBT13_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+18)) ;
         n605TBT13_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBT13_CRF_RES_HIS" ;
         /* Using cursor P007E52 */
         pr_default.execute(50, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD, new Boolean(n597TBT13_CRF_VALUE), A597TBT13_CRF_VALUE, new Boolean(n680TBT13_EDIT_FLG), A680TBT13_EDIT_FLG, new Boolean(n598TBT13_DEL_FLG), A598TBT13_DEL_FLG, new Boolean(n599TBT13_CRT_DATETIME), A599TBT13_CRT_DATETIME, new Boolean(n600TBT13_CRT_USER_ID), A600TBT13_CRT_USER_ID, new Boolean(n601TBT13_CRT_PROG_NM), A601TBT13_CRT_PROG_NM, new Boolean(n602TBT13_UPD_DATETIME), A602TBT13_UPD_DATETIME, new Boolean(n603TBT13_UPD_USER_ID), A603TBT13_UPD_USER_ID, new Boolean(n604TBT13_UPD_PROG_NM), A604TBT13_UPD_PROG_NM, new Boolean(n605TBT13_UPD_CNT), new Long(A605TBT13_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
         if ( (pr_default.getStatus(50) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S401( )
   {
      /* 'SUB_INS_TBT14_CRF_MEMO' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV31W_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT14_CRF_MEMO" ;
         /* Using cursor P007E53 */
         pr_default.execute(51, new Object[] {new Long(AV30W_STUDY_ID), new Integer(AV31W_SUBJECT_ID)});
         while ( (pr_default.getStatus(51) != 101) )
         {
            A198TBT14_MEMO_NO = P007E53_A198TBT14_MEMO_NO[0] ;
            A142TBT14_SUBJECT_ID = P007E53_A142TBT14_SUBJECT_ID[0] ;
            A140TBT14_STUDY_ID = P007E53_A140TBT14_STUDY_ID[0] ;
            if ( A198TBT14_MEMO_NO == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+4), ".") )
            {
               Gx_ope = "Delete" ;
               Gx_etb = "TBT14_CRF_MEMO" ;
               /* Using cursor P007E54 */
               pr_default.execute(52, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
            }
            pr_default.readNext(51);
         }
         pr_default.close(51);
         /*
            INSERT RECORD ON TABLE TBT14_CRF_MEMO

         */
         A140TBT14_STUDY_ID = AV30W_STUDY_ID ;
         A142TBT14_SUBJECT_ID = AV31W_SUBJECT_ID ;
         A198TBT14_MEMO_NO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
         A474TBT14_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+5))) ;
         n474TBT14_CRF_ID = false ;
         A941TBT14_CRF_EDA_NO = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+6))) ;
         n941TBT14_CRF_EDA_NO = false ;
         A475TBT14_CRF_VERSION = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+7))) ;
         n475TBT14_CRF_VERSION = false ;
         A901TBT14_MEMO_KBN = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n901TBT14_MEMO_KBN = false ;
         A477TBT14_MEMO = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n477TBT14_MEMO = false ;
         A929TBT14_REQUEST_SITE_ID = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n929TBT14_REQUEST_SITE_ID = false ;
         A930TBT14_REQUEST_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+11) ;
         n930TBT14_REQUEST_AUTH_CD = false ;
         A931TBT14_CRT_AUTH_CD = (String)AV18W_CSV_COL.elementAt(-1+12) ;
         n931TBT14_CRT_AUTH_CD = false ;
         A927TBT14_KAKUNIN_FLG = (String)AV18W_CSV_COL.elementAt(-1+13) ;
         n927TBT14_KAKUNIN_FLG = false ;
         A928TBT14_KAKUNIN_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+14) ;
         n928TBT14_KAKUNIN_USER_ID = false ;
         A934TBT14_KAKUNIN_COMMENT = (String)AV18W_CSV_COL.elementAt(-1+15) ;
         n934TBT14_KAKUNIN_COMMENT = false ;
         A902TBT14_KANRYO_FLG = (String)AV18W_CSV_COL.elementAt(-1+16) ;
         n902TBT14_KANRYO_FLG = false ;
         A479TBT14_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+17) ;
         n479TBT14_DEL_FLG = false ;
         A480TBT14_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+18), 6) ;
         n480TBT14_CRT_DATETIME = false ;
         A481TBT14_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+19) ;
         n481TBT14_CRT_USER_ID = false ;
         A482TBT14_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+20) ;
         n482TBT14_CRT_PROG_NM = false ;
         A483TBT14_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+21), 6) ;
         n483TBT14_UPD_DATETIME = false ;
         A484TBT14_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+22) ;
         n484TBT14_UPD_USER_ID = false ;
         A485TBT14_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+23) ;
         n485TBT14_UPD_PROG_NM = false ;
         A486TBT14_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+24)) ;
         n486TBT14_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBT14_CRF_MEMO" ;
         /* Using cursor P007E55 */
         pr_default.execute(53, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO), new Boolean(n474TBT14_CRF_ID), new Short(A474TBT14_CRF_ID), new Boolean(n475TBT14_CRF_VERSION), new Short(A475TBT14_CRF_VERSION), new Boolean(n901TBT14_MEMO_KBN), A901TBT14_MEMO_KBN, new Boolean(n477TBT14_MEMO), A477TBT14_MEMO, new Boolean(n929TBT14_REQUEST_SITE_ID), A929TBT14_REQUEST_SITE_ID, new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD, new Boolean(n931TBT14_CRT_AUTH_CD), A931TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n928TBT14_KAKUNIN_USER_ID), A928TBT14_KAKUNIN_USER_ID, new Boolean(n934TBT14_KAKUNIN_COMMENT), A934TBT14_KAKUNIN_COMMENT, new Boolean(n902TBT14_KANRYO_FLG), A902TBT14_KANRYO_FLG, new Boolean(n479TBT14_DEL_FLG), A479TBT14_DEL_FLG, new Boolean(n480TBT14_CRT_DATETIME), A480TBT14_CRT_DATETIME, new Boolean(n481TBT14_CRT_USER_ID), A481TBT14_CRT_USER_ID, new Boolean(n482TBT14_CRT_PROG_NM), A482TBT14_CRT_PROG_NM, new Boolean(n483TBT14_UPD_DATETIME), A483TBT14_UPD_DATETIME, new Boolean(n484TBT14_UPD_USER_ID), A484TBT14_UPD_USER_ID, new Boolean(n485TBT14_UPD_PROG_NM), A485TBT14_UPD_PROG_NM, new Boolean(n486TBT14_UPD_CNT), new Long(A486TBT14_UPD_CNT), new Boolean(n941TBT14_CRF_EDA_NO), new Byte(A941TBT14_CRF_EDA_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
         if ( (pr_default.getStatus(53) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S411( )
   {
      /* 'SUB_INS_TBT15_CRF_MEMO_LOC' Routine */
      GXv_char2[0] = AV13PO_ERRCD ;
      GXv_objcol_svchar4[0] = AV14PO_ERRMSG ;
      new b407_pc03_err_chk(remoteHandle, context).execute( AV33W_TABLE_NM, AV18W_CSV_COL, AV24W_LINE_MSG, GXv_char2, GXv_objcol_svchar4) ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      AV14PO_ERRMSG = GXv_objcol_svchar4[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") == 0 )
      {
         AV31W_SUBJECT_ID = (int)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+3))) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT15_CRF_MEMO_LOC" ;
         /* Using cursor P007E56 */
         pr_default.execute(54, new Object[] {new Long(AV30W_STUDY_ID), new Integer(AV31W_SUBJECT_ID)});
         while ( (pr_default.getStatus(54) != 101) )
         {
            A199TBT15_MEMO_NO = P007E56_A199TBT15_MEMO_NO[0] ;
            A151TBT15_SUBJECT_ID = P007E56_A151TBT15_SUBJECT_ID[0] ;
            A149TBT15_STUDY_ID = P007E56_A149TBT15_STUDY_ID[0] ;
            if ( A199TBT15_MEMO_NO == GXutil.val( (String)AV18W_CSV_COL.elementAt(-1+4), ".") )
            {
               Gx_ope = "Delete" ;
               Gx_etb = "TBT15_CRF_MEMO_LOC" ;
               /* Using cursor P007E57 */
               pr_default.execute(55, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
            }
            pr_default.readNext(54);
         }
         pr_default.close(54);
         /*
            INSERT RECORD ON TABLE TBT15_CRF_MEMO_LOC

         */
         A149TBT15_STUDY_ID = AV30W_STUDY_ID ;
         A151TBT15_SUBJECT_ID = AV31W_SUBJECT_ID ;
         A199TBT15_MEMO_NO = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+4))) ;
         A155TBT15_CRF_ID = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+5))) ;
         n155TBT15_CRF_ID = false ;
         A942TBT15_CRF_EDA_NO = (byte)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+6))) ;
         n942TBT15_CRF_EDA_NO = false ;
         A157TBT15_CRF_VERSION = (short)(GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+7))) ;
         n157TBT15_CRF_VERSION = false ;
         A903TBT15_CRF_ITEM_GRP_DIV = (String)AV18W_CSV_COL.elementAt(-1+8) ;
         n903TBT15_CRF_ITEM_GRP_DIV = false ;
         A904TBT15_CRF_ITEM_GRP_CD = (String)AV18W_CSV_COL.elementAt(-1+9) ;
         n904TBT15_CRF_ITEM_GRP_CD = false ;
         A488TBT15_DEL_FLG = (String)AV18W_CSV_COL.elementAt(-1+10) ;
         n488TBT15_DEL_FLG = false ;
         A489TBT15_CRT_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+11), 6) ;
         n489TBT15_CRT_DATETIME = false ;
         A490TBT15_CRT_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+12) ;
         n490TBT15_CRT_USER_ID = false ;
         A491TBT15_CRT_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+13) ;
         n491TBT15_CRT_PROG_NM = false ;
         A492TBT15_UPD_DATETIME = localUtil.ctot( (String)AV18W_CSV_COL.elementAt(-1+14), 6) ;
         n492TBT15_UPD_DATETIME = false ;
         A493TBT15_UPD_USER_ID = (String)AV18W_CSV_COL.elementAt(-1+15) ;
         n493TBT15_UPD_USER_ID = false ;
         A494TBT15_UPD_PROG_NM = (String)AV18W_CSV_COL.elementAt(-1+16) ;
         n494TBT15_UPD_PROG_NM = false ;
         A495TBT15_UPD_CNT = GXutil.lval( (String)AV18W_CSV_COL.elementAt(-1+17)) ;
         n495TBT15_UPD_CNT = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBT15_CRF_MEMO_LOC" ;
         /* Using cursor P007E58 */
         pr_default.execute(56, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID), new Boolean(n157TBT15_CRF_VERSION), new Short(A157TBT15_CRF_VERSION), new Boolean(n903TBT15_CRF_ITEM_GRP_DIV), A903TBT15_CRF_ITEM_GRP_DIV, new Boolean(n904TBT15_CRF_ITEM_GRP_CD), A904TBT15_CRF_ITEM_GRP_CD, new Boolean(n488TBT15_DEL_FLG), A488TBT15_DEL_FLG, new Boolean(n489TBT15_CRT_DATETIME), A489TBT15_CRT_DATETIME, new Boolean(n490TBT15_CRT_USER_ID), A490TBT15_CRT_USER_ID, new Boolean(n491TBT15_CRT_PROG_NM), A491TBT15_CRT_PROG_NM, new Boolean(n492TBT15_UPD_DATETIME), A492TBT15_UPD_DATETIME, new Boolean(n493TBT15_UPD_USER_ID), A493TBT15_UPD_USER_ID, new Boolean(n494TBT15_UPD_PROG_NM), A494TBT15_UPD_PROG_NM, new Boolean(n495TBT15_UPD_CNT), new Long(A495TBT15_UPD_CNT), new Boolean(n942TBT15_CRF_EDA_NO), new Byte(A942TBT15_CRF_EDA_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
         if ( (pr_default.getStatus(56) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   public void S421( )
   {
      /* 'SUB_CRF_IMPORT_CHK' Routine */
      AV46W_CRF_IMPORT_FLG = false ;
      if ( AV17W_CRF_ID == 9999 )
      {
         AV46W_CRF_IMPORT_FLG = true ;
      }
      else
      {
         AV76GXV2 = 1 ;
         while ( AV76GXV2 <= AV37B407_SD01_IMPORT_LIST_C.size() )
         {
            AV8B407_SD01_IMPORT_LIST_I = (SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV37B407_SD01_IMPORT_LIST_C.elementAt(-1+AV76GXV2));
            if ( GXutil.val( AV8B407_SD01_IMPORT_LIST_I.getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id(), ".") == AV17W_CRF_ID )
            {
               AV46W_CRF_IMPORT_FLG = AV8B407_SD01_IMPORT_LIST_I.getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check() ;
               if (true) break;
            }
            AV76GXV2 = (int)(AV76GXV2+1) ;
         }
      }
   }

   public void S431( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV15W_A_LOGIN_SDT;
      GXv_char2[0] = AV13PO_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char2) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b407_pc02_design_import.this.AV13PO_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV13PO_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_FILE_NAME" );
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_FILE_NAME );
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV27W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO7[0] = AV21W_EXTRA_INFO;
      GXv_int5[0] = AV20W_ERR_CD ;
      GXv_char2[0] = AV27W_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV77Pgmname, (short)(1), AV27W_MSG, GXv_SdtB808_SD01_EXTRA_INFO7, GXv_int5, GXv_char2) ;
      AV21W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO7[0] ;
      b407_pc02_design_import.this.AV20W_ERR_CD = GXv_int5[0] ;
      b407_pc02_design_import.this.AV27W_MSG = GXv_char2[0] ;
      if ( AV20W_ERR_CD != 0 )
      {
         AV13PO_ERRCD = "1" ;
         AV14PO_ERRMSG.add(AV27W_MSG, 0);
      }
   }

   public void S441( )
   {
      /* 'SUB_ERROR' Routine */
      AV21W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV21W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV9C_APP_ID );
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV28W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_FILE_NAME" );
      AV28W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_FILE_NAME );
      AV21W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV28W_PARMS_ITEM, 0);
      AV27W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO7[0] = AV21W_EXTRA_INFO;
      GXv_int5[0] = AV20W_ERR_CD ;
      GXv_char2[0] = AV27W_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV77Pgmname, (short)(0), AV27W_MSG, GXv_SdtB808_SD01_EXTRA_INFO7, GXv_int5, GXv_char2) ;
      AV21W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO7[0] ;
      b407_pc02_design_import.this.AV20W_ERR_CD = GXv_int5[0] ;
      b407_pc02_design_import.this.AV27W_MSG = GXv_char2[0] ;
      if ( AV20W_ERR_CD != 0 )
      {
         AV13PO_ERRCD = "1" ;
         AV14PO_ERRMSG.add(AV27W_MSG, 0);
      }
      Application.rollback(context, remoteHandle, "DEFAULT", "b407_pc02_design_import");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP9[0] = b407_pc02_design_import.this.AV13PO_ERRCD;
      this.aP10[0] = b407_pc02_design_import.this.AV14PO_ERRMSG;
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
                  /* Execute user subroutine: S441 */
                  S441 ();
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
      AV13PO_ERRCD = "" ;
      AV14PO_ERRMSG = new GxObjectCollection(String.class, "internal", "");
      AV9C_APP_ID = "" ;
      AV36W_USER_ID = "" ;
      AV35W_UPDATE_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV22W_FILE = new com.genexus.util.GXFile();
      AV27W_MSG = "" ;
      AV33W_TABLE_NM = "" ;
      AV19W_CSV_DATA = "" ;
      AV24W_LINE_MSG = "" ;
      AV18W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXt_char1 = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV8B407_SD01_IMPORT_LIST_I = new SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem(remoteHandle, context);
      A367TBM21_STUDY_NM = "" ;
      A530TBM21_OUTER_STUDY_ID = "" ;
      A531TBM21_PROC_NM = "" ;
      A368TBM21_NOTE = "" ;
      A607TBM21_STATUS = "" ;
      A369TBM21_DEL_FLG = "" ;
      A370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A371TBM21_CRT_USER_ID = "" ;
      A372TBM21_CRT_PROG_NM = "" ;
      A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A374TBM21_UPD_USER_ID = "" ;
      A375TBM21_UPD_PROG_NM = "" ;
      Gx_emsg = "" ;
      A18TBM22_SITE_ID = "" ;
      A377TBM22_DEL_FLG = "" ;
      A378TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A379TBM22_CRT_USER_ID = "" ;
      A380TBM22_CRT_PROG_NM = "" ;
      A381TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A382TBM22_UPD_USER_ID = "" ;
      A383TBM22_UPD_PROG_NM = "" ;
      A108TBM23_USER_ID = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      A385TBM23_DEL_FLG = "" ;
      A386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A387TBM23_CRT_USER_ID = "" ;
      A388TBM23_CRT_PROG_NM = "" ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A390TBM23_UPD_USER_ID = "" ;
      A391TBM23_UPD_PROG_NM = "" ;
      A65TBM24_DOM_CD = "" ;
      A66TBM24_DOM_VAR_NM = "" ;
      A702TBM24_DOM_ITM_GRP_OID = "" ;
      A705TBM24_CRF_ITEM_NM = "" ;
      A67TBM24_CRF_ITEM_DIV = "" ;
      A635TBM24_IDENTIFICATION_CD = "" ;
      A639TBM24_TEXT = "" ;
      A640TBM24_FIXED_VALUE = "" ;
      A641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      A706TBM24_REQUIRED_INPUT_FLG = "" ;
      A707TBM24_MIN_VALUE = "" ;
      A708TBM24_MAX_VALUE = "" ;
      A544TBM24_DEL_FLG = "" ;
      A545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A546TBM24_CRT_USER_ID = "" ;
      A547TBM24_CRT_PROG_NM = "" ;
      A548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A549TBM24_UPD_USER_ID = "" ;
      A550TBM24_UPD_PROG_NM = "" ;
      A24TBM25_LIST_CD = "" ;
      A552TBM25_LIST_NM = "" ;
      A553TBM25_DEL_FLG = "" ;
      A554TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A555TBM25_CRT_USER_ID = "" ;
      A556TBM25_CRT_PROG_NM = "" ;
      A557TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A558TBM25_UPD_USER_ID = "" ;
      A559TBM25_UPD_PROG_NM = "" ;
      A26TBM26_LIST_CD = "" ;
      A561TBM26_LIST_ITEM_NAME = "" ;
      A562TBM26_INNER_VALUE = "" ;
      A563TBM26_DEL_FLG = "" ;
      A564TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A565TBM26_CRT_USER_ID = "" ;
      A566TBM26_CRT_PROG_NM = "" ;
      A567TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A568TBM26_UPD_USER_ID = "" ;
      A569TBM26_UPD_PROG_NM = "" ;
      A393TBM31_CRF_NM = "" ;
      A642TBM31_CRF_SNM = "" ;
      A529TBM31_DEF_DOMAIN_CD = "" ;
      A643TBM31_STATUS = "" ;
      A396TBM31_NOTE = "" ;
      A979TBM31_DM_EXCP_NO_DISP_FLG = "" ;
      A397TBM31_DEL_FLG = "" ;
      A398TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A399TBM31_CRT_USER_ID = "" ;
      A400TBM31_CRT_PROG_NM = "" ;
      A401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A402TBM31_UPD_USER_ID = "" ;
      A403TBM31_UPD_PROG_NM = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A405TBM32_CRF_ITEM_NM = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      A525TBM32_LIST_CD = "" ;
      A526TBM32_IMAGE_CD = "" ;
      A524TBM32_TEXT = "" ;
      A514TBM32_FONT_UL_FLG = "" ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      A692TBM32_TABSTOP_FLG = "" ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      A694TBM32_MIN_VALUE = "" ;
      A695TBM32_MAX_VALUE = "" ;
      A406TBM32_CRF_ITEM_NOTE = "" ;
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      A75TBM32_DEL_FLG = "" ;
      A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A408TBM32_CRT_USER_ID = "" ;
      A409TBM32_CRT_PROG_NM = "" ;
      A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A411TBM32_UPD_USER_ID = "" ;
      A412TBM32_UPD_PROG_NM = "" ;
      A502TBM33_COND_NM = "" ;
      A414TBM33_EXPRESSION = "" ;
      A503TBM33_COND_DIV = "" ;
      A504TBM33_CRF_ITEM_CD = "" ;
      A505TBM33_ERR_DIV = "" ;
      A506TBM33_ERR_MSG = "" ;
      A646TBM33_ENABLED_FLG = "" ;
      A696TBM33_REQUIRED_INPUT_FLG = "" ;
      A697TBM33_NUMERIC_RANGE_FLG = "" ;
      A416TBM33_DEL_FLG = "" ;
      A417TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A418TBM33_CRT_USER_ID = "" ;
      A419TBM33_CRT_PROG_NM = "" ;
      A420TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A421TBM33_UPD_USER_ID = "" ;
      A422TBM33_UPD_PROG_NM = "" ;
      A30TBM34_STYDY_AUTH_CD = "" ;
      A571TBM34_DISPLAY_FLG = "" ;
      A572TBM34_DEL_FLG = "" ;
      A573TBM34_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A574TBM34_CRT_USER_ID = "" ;
      A575TBM34_CRT_PROG_NM = "" ;
      A576TBM34_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A577TBM34_UPD_USER_ID = "" ;
      A578TBM34_UPD_PROG_NM = "" ;
      A33TBM35_CRF_ITEM_CD = "" ;
      A34TBM35_STUDY_AUTH_CD = "" ;
      A580TBM35_DISPLAY_FLG = "" ;
      A581TBM35_DEL_FLG = "" ;
      A582TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A583TBM35_CRT_USER_ID = "" ;
      A584TBM35_CRT_PROG_NM = "" ;
      A585TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A586TBM35_UPD_USER_ID = "" ;
      A587TBM35_UPD_PROG_NM = "" ;
      A589TBM36_DEL_FLG = "" ;
      A590TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A591TBM36_CRT_USER_ID = "" ;
      A592TBM36_CRT_PROG_NM = "" ;
      A593TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A594TBM36_UPD_USER_ID = "" ;
      A595TBM36_UPD_PROG_NM = "" ;
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      A84TBM37_DOM_CD = "" ;
      A500TBM37_DOM_VAR_NM = "" ;
      A85TBM37_DOM_ITM_GRP_OID = "" ;
      A433TBM37_DEL_FLG = "" ;
      A434TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A435TBM37_CRT_USER_ID = "" ;
      A436TBM37_CRT_PROG_NM = "" ;
      A437TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A438TBM37_UPD_USER_ID = "" ;
      A439TBM37_UPD_PROG_NM = "" ;
      A21TBM41_CRF_ITEM_GRP_DIV = "" ;
      A22TBM41_CRF_ITEM_GRP_CD = "" ;
      A424TBM41_NCM_METADATA_ID = "" ;
      A425TBM41_DEL_FLG = "" ;
      A426TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A427TBM41_CRT_USER_ID = "" ;
      A428TBM41_CRT_PROG_NM = "" ;
      A429TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A430TBM41_UPD_USER_ID = "" ;
      A431TBM41_UPD_PROG_NM = "" ;
      A204TBM42_DOM_CD = "" ;
      A905TBM42_DOM_ENM = "" ;
      A906TBM42_DOM_JNM = "" ;
      A907TBM42_DOM_GRP_NM = "" ;
      A908TBM42_NOTE = "" ;
      A893TBM42_DEL_FLG = "" ;
      A894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A895TBM42_CRT_USER_ID = "" ;
      A896TBM42_CRT_PROG_NM = "" ;
      A897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A898TBM42_UPD_USER_ID = "" ;
      A899TBM42_UPD_PROG_NM = "" ;
      A201TBM43_DOM_CD = "" ;
      A202TBM43_DOM_VAR_NM = "" ;
      A910TBM43_VAR_DESC = "" ;
      A911TBM43_SDTM_FLG = "" ;
      A912TBM43_CDASH_FLG = "" ;
      A913TBM43_INPUT_TYPE_DIV = "" ;
      A914TBM43_REQUIRED_FLG = "" ;
      A915TBM43_SAS_FIELD_NM = "" ;
      A916TBM43_ODM_DATA_TYPE = "" ;
      A917TBM43_NOTE = "" ;
      A933TBM43_VERSION = "" ;
      A919TBM43_DEL_FLG = "" ;
      A920TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A921TBM43_CRT_USER_ID = "" ;
      A922TBM43_CRT_PROG_NM = "" ;
      A923TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A924TBM43_UPD_USER_ID = "" ;
      A925TBM43_UPD_PROG_NM = "" ;
      A949TBM44_DEL_FLG = "" ;
      A950TBM44_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A951TBM44_CRT_USER_ID = "" ;
      A952TBM44_CRT_PROG_NM = "" ;
      A953TBM44_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A954TBM44_UPD_USER_ID = "" ;
      A955TBM44_UPD_PROG_NM = "" ;
      A980TBM45_FILETR_NM = "" ;
      A981TBM45_IN_CRF_ID = "" ;
      A982TBM45_DEL_FLG = "" ;
      A983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A984TBM45_CRT_USER_ID = "" ;
      A985TBM45_CRT_PROG_NM = "" ;
      A986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A987TBM45_UPD_USER_ID = "" ;
      A988TBM45_UPD_PROG_NM = "" ;
      A647TBT01_OUTER_SUBJECT_ID = "" ;
      A698TBT01_SITE_ID = "" ;
      A441TBT01_DEL_FLG = "" ;
      A442TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A443TBT01_CRT_USER_ID = "" ;
      A444TBT01_CRT_PROG_NM = "" ;
      A445TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A446TBT01_UPD_USER_ID = "" ;
      A447TBT01_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      P007E41_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P007E41_A91TBT02_CRF_ID = new short[1] ;
      P007E41_A90TBT02_SUBJECT_ID = new int[1] ;
      P007E41_A89TBT02_STUDY_ID = new long[1] ;
      A648TBT02_LOCK_FLG = "" ;
      A649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A650TBT02_LOCK_USER_ID = "" ;
      A651TBT02_LOCK_AUTH_CD = "" ;
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A653TBT02_UPLOAD_USER_ID = "" ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A657TBT02_APPROVAL_FLG = "" ;
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A659TBT02_APPROVAL_USER_ID = "" ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      A990TBT02_SIGNATURE_FLG = "" ;
      A991TBT02_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A992TBT02_SIGNATURE_USER_ID = "" ;
      A661TBT02_INPUT_END_FLG = "" ;
      A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A663TBT02_INPUT_END_USER_ID = "" ;
      A664TBT02_INPUT_END_AUTH_CD = "" ;
      A449TBT02_DEL_FLG = "" ;
      A450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A451TBT02_CRT_USER_ID = "" ;
      A452TBT02_CRT_PROG_NM = "" ;
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A454TBT02_UPD_USER_ID = "" ;
      A455TBT02_UPD_PROG_NM = "" ;
      P007E44_A95TBT11_CRF_VERSION = new short[1] ;
      P007E44_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P007E44_A94TBT11_CRF_ID = new short[1] ;
      P007E44_A93TBT11_SUBJECT_ID = new int[1] ;
      P007E44_A92TBT11_STUDY_ID = new long[1] ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A667TBT11_UPLOAD_USER_ID = "" ;
      A668TBT11_UPLOAD_AUTH_CD = "" ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A671TBT11_APPROVAL_FLG = "" ;
      A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A673TBT11_APPROVAL_USER_ID = "" ;
      A674TBT11_APPROVAL_AUTH_CD = "" ;
      A993TBT11_SIGNATURE_FLG = "" ;
      A994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A995TBT11_SIGNATURE_USER_ID = "" ;
      A675TBT11_INPUT_END_FLG = "" ;
      A676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A677TBT11_INPUT_END_USER_ID = "" ;
      A678TBT11_INPUT_END_AUTH_CD = "" ;
      A891TBT11_UPD_RIYU = "" ;
      A457TBT11_DEL_FLG = "" ;
      A458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A459TBT11_CRT_USER_ID = "" ;
      A460TBT11_CRT_PROG_NM = "" ;
      A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A462TBT11_UPD_USER_ID = "" ;
      A463TBT11_UPD_PROG_NM = "" ;
      P007E47_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007E47_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P007E47_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P007E47_A98TBT12_CRF_ID = new short[1] ;
      P007E47_A97TBT12_SUBJECT_ID = new int[1] ;
      P007E47_A96TBT12_STUDY_ID = new long[1] ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      A465TBT12_CRF_VALUE = "" ;
      A679TBT12_EDIT_FLG = "" ;
      A473TBT12_DEL_FLG = "" ;
      A466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A467TBT12_CRT_USER_ID = "" ;
      A468TBT12_CRT_PROG_NM = "" ;
      A469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A470TBT12_UPD_USER_ID = "" ;
      A471TBT12_UPD_PROG_NM = "" ;
      P007E50_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007E50_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P007E50_A104TBT13_CRF_VERSION = new short[1] ;
      P007E50_A938TBT13_CRF_EDA_NO = new byte[1] ;
      P007E50_A103TBT13_CRF_ID = new short[1] ;
      P007E50_A102TBT13_SUBJECT_ID = new int[1] ;
      P007E50_A101TBT13_STUDY_ID = new long[1] ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      A597TBT13_CRF_VALUE = "" ;
      A680TBT13_EDIT_FLG = "" ;
      A598TBT13_DEL_FLG = "" ;
      A599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A600TBT13_CRT_USER_ID = "" ;
      A601TBT13_CRT_PROG_NM = "" ;
      A602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A603TBT13_UPD_USER_ID = "" ;
      A604TBT13_UPD_PROG_NM = "" ;
      P007E53_A198TBT14_MEMO_NO = new short[1] ;
      P007E53_A142TBT14_SUBJECT_ID = new int[1] ;
      P007E53_A140TBT14_STUDY_ID = new long[1] ;
      A901TBT14_MEMO_KBN = "" ;
      A477TBT14_MEMO = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      A931TBT14_CRT_AUTH_CD = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A928TBT14_KAKUNIN_USER_ID = "" ;
      A934TBT14_KAKUNIN_COMMENT = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      A479TBT14_DEL_FLG = "" ;
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A481TBT14_CRT_USER_ID = "" ;
      A482TBT14_CRT_PROG_NM = "" ;
      A483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A484TBT14_UPD_USER_ID = "" ;
      A485TBT14_UPD_PROG_NM = "" ;
      GXv_objcol_svchar4 = new GxObjectCollection [1] ;
      P007E56_A199TBT15_MEMO_NO = new short[1] ;
      P007E56_A151TBT15_SUBJECT_ID = new int[1] ;
      P007E56_A149TBT15_STUDY_ID = new long[1] ;
      A903TBT15_CRF_ITEM_GRP_DIV = "" ;
      A904TBT15_CRF_ITEM_GRP_CD = "" ;
      A488TBT15_DEL_FLG = "" ;
      A489TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A490TBT15_CRT_USER_ID = "" ;
      A491TBT15_CRT_PROG_NM = "" ;
      A492TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A493TBT15_UPD_USER_ID = "" ;
      A494TBT15_UPD_PROG_NM = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV21W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV28W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV77Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO7 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b407_pc02_design_import__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P007E41_A935TBT02_CRF_EDA_NO, P007E41_A91TBT02_CRF_ID, P007E41_A90TBT02_SUBJECT_ID, P007E41_A89TBT02_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P007E44_A95TBT11_CRF_VERSION, P007E44_A936TBT11_CRF_EDA_NO, P007E44_A94TBT11_CRF_ID, P007E44_A93TBT11_SUBJECT_ID, P007E44_A92TBT11_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P007E47_A100TBT12_CRF_ITEM_GRP_CD, P007E47_A99TBT12_CRF_ITEM_GRP_DIV, P007E47_A937TBT12_CRF_EDA_NO, P007E47_A98TBT12_CRF_ID, P007E47_A97TBT12_SUBJECT_ID, P007E47_A96TBT12_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P007E50_A106TBT13_CRF_ITEM_GRP_CD, P007E50_A105TBT13_CRF_ITEM_GRP_DIV, P007E50_A104TBT13_CRF_VERSION, P007E50_A938TBT13_CRF_EDA_NO, P007E50_A103TBT13_CRF_ID, P007E50_A102TBT13_SUBJECT_ID, P007E50_A101TBT13_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P007E53_A198TBT14_MEMO_NO, P007E53_A142TBT14_SUBJECT_ID, P007E53_A140TBT14_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P007E56_A199TBT15_MEMO_NO, P007E56_A151TBT15_SUBJECT_ID, P007E56_A149TBT15_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV77Pgmname = "B407_PC02_DESIGN_IMPORT" ;
      /* GeneXus formulas. */
      AV77Pgmname = "B407_PC02_DESIGN_IMPORT" ;
      Gx_err = (short)(0) ;
   }

   private byte A637TBM24_TEXT_MAXROWS ;
   private byte A638TBM24_DECIMAL_DIGITS ;
   private byte A943TBM31_REPEAT_FLG ;
   private byte A944TBM31_REPEAT_MAX ;
   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte A665TBT11_CRF_INPUT_LEVEL ;
   private byte A937TBT12_CRF_EDA_NO ;
   private byte A938TBT13_CRF_EDA_NO ;
   private byte A941TBT14_CRF_EDA_NO ;
   private byte A942TBT15_CRF_EDA_NO ;
   private short AV23W_FILE_HANDLE ;
   private short GXt_int3 ;
   private short AV20W_ERR_CD ;
   private short AV17W_CRF_ID ;
   private short Gx_err ;
   private short A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short A704TBM24_DOM_ITM_GRP_ROWNO ;
   private short A636TBM24_TEXT_MAXLENGTH ;
   private short A27TBM26_LIST_ITEM_NO ;
   private short A69TBM31_CRF_ID ;
   private short A394TBM31_GRID_SIZE ;
   private short A71TBM32_CRF_ID ;
   private short A507TBM32_CRF_ITEM_GRP_ORDER ;
   private short A508TBM32_LOCATION_X ;
   private short A509TBM32_LOCATION_Y ;
   private short A510TBM32_LOCATION_X2 ;
   private short A511TBM32_LOCATION_Y2 ;
   private short A517TBM32_TEXT_MAXLENGTH ;
   private short A690TBM32_LINE_ANGLE ;
   private short A645TBM32_ZORDER ;
   private short A691TBM32_TAB_ORDER ;
   private short A774TBM32_REF_CRF_ID ;
   private short A77TBM33_CRF_ID ;
   private short A78TBM33_COND_NO ;
   private short A415TBM33_PRIOR_NO ;
   private short A29TBM34_CRF_ID ;
   private short A32TBM35_CRF_ID ;
   private short A36TBM36_CRF_ID ;
   private short A37TBM36_COND_NO ;
   private short A38TBM36_SELECT_CRF_ID ;
   private short A80TBM37_CRF_ID ;
   private short A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A86TBM37_DOM_ITM_GRP_ROWNO ;
   private short A20TBM41_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short A978TBM45_FILTER_NO ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short A95TBT11_CRF_VERSION ;
   private short A94TBT11_CRF_ID ;
   private short A98TBT12_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private short A103TBT13_CRF_ID ;
   private short A198TBT14_MEMO_NO ;
   private short A474TBT14_CRF_ID ;
   private short A475TBT14_CRF_VERSION ;
   private short A199TBT15_MEMO_NO ;
   private short A155TBT15_CRF_ID ;
   private short A157TBT15_CRF_VERSION ;
   private short GXv_int5[] ;
   private int AV55GXV1 ;
   private int GX_INS15 ;
   private int GX_INS16 ;
   private int GX_INS17 ;
   private int GX_INS31 ;
   private int A543TBM24_ORDER ;
   private int GX_INS32 ;
   private int GX_INS33 ;
   private int GX_INS18 ;
   private int A395TBM31_ORDER ;
   private int A528TBM31_DEF_VISIT_NO ;
   private int GX_INS19 ;
   private int GX_INS20 ;
   private int GX_INS34 ;
   private int GX_INS35 ;
   private int GX_INS36 ;
   private int GX_INS22 ;
   private int A83TBM37_VISIT_NO ;
   private int GX_INS21 ;
   private int GX_INS53 ;
   private int A909TBM42_ORDER ;
   private int GX_INS54 ;
   private int A918TBM43_ORDER ;
   private int GX_INS61 ;
   private int A948TBM44_VISIT_NO ;
   private int GX_INS65 ;
   private int AV31W_SUBJECT_ID ;
   private int GX_INS23 ;
   private int A88TBT01_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private int GX_INS55 ;
   private int A93TBT11_SUBJECT_ID ;
   private int GX_INS56 ;
   private int A97TBT12_SUBJECT_ID ;
   private int GX_INS57 ;
   private int A102TBT13_SUBJECT_ID ;
   private int GX_INS58 ;
   private int A142TBT14_SUBJECT_ID ;
   private int GX_INS27 ;
   private int A151TBT15_SUBJECT_ID ;
   private int GX_INS28 ;
   private int AV76GXV2 ;
   private int GXActiveErrHndl ;
   private long AV45P_STUDY_ID ;
   private long AV44P_CHG_STUDY_ID ;
   private long AV34W_UPD_CNT ;
   private long AV30W_STUDY_ID ;
   private long AV16W_CNT ;
   private long A63TBM21_STUDY_ID ;
   private long A376TBM21_UPD_CNT ;
   private long A17TBM22_STUDY_ID ;
   private long A384TBM22_UPD_CNT ;
   private long A107TBM23_STUDY_ID ;
   private long A392TBM23_UPD_CNT ;
   private long A64TBM24_STUDY_ID ;
   private long A551TBM24_UPD_CNT ;
   private long A23TBM25_STUDY_ID ;
   private long A560TBM25_UPD_CNT ;
   private long A25TBM26_STUDY_ID ;
   private long A570TBM26_UPD_CNT ;
   private long A68TBM31_STUDY_ID ;
   private long A404TBM31_UPD_CNT ;
   private long A70TBM32_STUDY_ID ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long A413TBM32_UPD_CNT ;
   private long A76TBM33_STUDY_ID ;
   private long A423TBM33_UPD_CNT ;
   private long A28TBM34_STUDY_ID ;
   private long A579TBM34_UPD_CNT ;
   private long A31TBM35_STUDY_ID ;
   private long A588TBM35_UPD_CNT ;
   private long A35TBM36_STUDY_ID ;
   private long A596TBM36_UPD_CNT ;
   private long A79TBM37_STUDY_ID ;
   private long A440TBM37_UPD_CNT ;
   private long A19TBM41_STUDY_ID ;
   private long A432TBM41_UPD_CNT ;
   private long A203TBM42_STUDY_ID ;
   private long A900TBM42_UPD_CNT ;
   private long A200TBM43_STUDY_ID ;
   private long A926TBM43_UPD_CNT ;
   private long A945TBM44_STUDY_ID ;
   private long A956TBM44_UPD_CNT ;
   private long A977TBM45_STUDY_ID ;
   private long A989TBM45_UPD_CNT ;
   private long A87TBT01_STUDY_ID ;
   private long A448TBT01_UPD_CNT ;
   private long A89TBT02_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private long A92TBT11_STUDY_ID ;
   private long A464TBT11_UPD_CNT ;
   private long A96TBT12_STUDY_ID ;
   private long A472TBT12_UPD_CNT ;
   private long A101TBT13_STUDY_ID ;
   private long A605TBT13_UPD_CNT ;
   private long A140TBT14_STUDY_ID ;
   private long A486TBT14_UPD_CNT ;
   private long A149TBT15_STUDY_ID ;
   private long A495TBT15_UPD_CNT ;
   private String GXt_char1 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV77Pgmname ;
   private String GXv_char2[] ;
   private java.util.Date AV35W_UPDATE_TIME ;
   private java.util.Date A370TBM21_CRT_DATETIME ;
   private java.util.Date A373TBM21_UPD_DATETIME ;
   private java.util.Date A378TBM22_CRT_DATETIME ;
   private java.util.Date A381TBM22_UPD_DATETIME ;
   private java.util.Date A386TBM23_CRT_DATETIME ;
   private java.util.Date A389TBM23_UPD_DATETIME ;
   private java.util.Date A545TBM24_CRT_DATETIME ;
   private java.util.Date A548TBM24_UPD_DATETIME ;
   private java.util.Date A554TBM25_CRT_DATETIME ;
   private java.util.Date A557TBM25_UPD_DATETIME ;
   private java.util.Date A564TBM26_CRT_DATETIME ;
   private java.util.Date A567TBM26_UPD_DATETIME ;
   private java.util.Date A398TBM31_CRT_DATETIME ;
   private java.util.Date A401TBM31_UPD_DATETIME ;
   private java.util.Date A407TBM32_CRT_DATETIME ;
   private java.util.Date A410TBM32_UPD_DATETIME ;
   private java.util.Date A417TBM33_CRT_DATETIME ;
   private java.util.Date A420TBM33_UPD_DATETIME ;
   private java.util.Date A573TBM34_CRT_DATETIME ;
   private java.util.Date A576TBM34_UPD_DATETIME ;
   private java.util.Date A582TBM35_CRT_DATETIME ;
   private java.util.Date A585TBM35_UPD_DATETIME ;
   private java.util.Date A590TBM36_CRT_DATETIME ;
   private java.util.Date A593TBM36_UPD_DATETIME ;
   private java.util.Date A434TBM37_CRT_DATETIME ;
   private java.util.Date A437TBM37_UPD_DATETIME ;
   private java.util.Date A426TBM41_CRT_DATETIME ;
   private java.util.Date A429TBM41_UPD_DATETIME ;
   private java.util.Date A894TBM42_CRT_DATETIME ;
   private java.util.Date A897TBM42_UPD_DATETIME ;
   private java.util.Date A920TBM43_CRT_DATETIME ;
   private java.util.Date A923TBM43_UPD_DATETIME ;
   private java.util.Date A950TBM44_CRT_DATETIME ;
   private java.util.Date A953TBM44_UPD_DATETIME ;
   private java.util.Date A983TBM45_CRT_DATETIME ;
   private java.util.Date A986TBM45_UPD_DATETIME ;
   private java.util.Date A442TBT01_CRT_DATETIME ;
   private java.util.Date A445TBT01_UPD_DATETIME ;
   private java.util.Date A649TBT02_LOCK_DATETIME ;
   private java.util.Date A652TBT02_UPLOAD_DATETIME ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A658TBT02_APPROVAL_DATETIME ;
   private java.util.Date A991TBT02_SIGNATURE_DATETIME ;
   private java.util.Date A662TBT02_INPUT_END_DATETIME ;
   private java.util.Date A450TBT02_CRT_DATETIME ;
   private java.util.Date A453TBT02_UPD_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A672TBT11_APPROVAL_DATETIME ;
   private java.util.Date A994TBT11_SIGNATURE_DATETIME ;
   private java.util.Date A676TBT11_INPUT_END_DATETIME ;
   private java.util.Date A458TBT11_CRT_DATETIME ;
   private java.util.Date A461TBT11_UPD_DATETIME ;
   private java.util.Date A466TBT12_CRT_DATETIME ;
   private java.util.Date A469TBT12_UPD_DATETIME ;
   private java.util.Date A599TBT13_CRT_DATETIME ;
   private java.util.Date A602TBT13_UPD_DATETIME ;
   private java.util.Date A480TBT14_CRT_DATETIME ;
   private java.util.Date A483TBT14_UPD_DATETIME ;
   private java.util.Date A489TBT15_CRT_DATETIME ;
   private java.util.Date A492TBT15_UPD_DATETIME ;
   private boolean AV38P_BASE_FLG ;
   private boolean AV40P_SITE_FLG ;
   private boolean AV41P_STAFF_FLG ;
   private boolean AV39P_LIST_CHK ;
   private boolean AV42P_SUBJECT_CHK ;
   private boolean returnInSub ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n530TBM21_OUTER_STUDY_ID ;
   private boolean n531TBM21_PROC_NM ;
   private boolean n368TBM21_NOTE ;
   private boolean n607TBM21_STATUS ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n370TBM21_CRT_DATETIME ;
   private boolean n371TBM21_CRT_USER_ID ;
   private boolean n372TBM21_CRT_PROG_NM ;
   private boolean n373TBM21_UPD_DATETIME ;
   private boolean n374TBM21_UPD_USER_ID ;
   private boolean n375TBM21_UPD_PROG_NM ;
   private boolean n376TBM21_UPD_CNT ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n378TBM22_CRT_DATETIME ;
   private boolean n379TBM22_CRT_USER_ID ;
   private boolean n380TBM22_CRT_PROG_NM ;
   private boolean n381TBM22_UPD_DATETIME ;
   private boolean n382TBM22_UPD_USER_ID ;
   private boolean n383TBM22_UPD_PROG_NM ;
   private boolean n384TBM22_UPD_CNT ;
   private boolean n385TBM23_DEL_FLG ;
   private boolean n386TBM23_CRT_DATETIME ;
   private boolean n387TBM23_CRT_USER_ID ;
   private boolean n388TBM23_CRT_PROG_NM ;
   private boolean n389TBM23_UPD_DATETIME ;
   private boolean n390TBM23_UPD_USER_ID ;
   private boolean n391TBM23_UPD_PROG_NM ;
   private boolean n392TBM23_UPD_CNT ;
   private boolean n702TBM24_DOM_ITM_GRP_OID ;
   private boolean n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean n705TBM24_CRF_ITEM_NM ;
   private boolean n635TBM24_IDENTIFICATION_CD ;
   private boolean n636TBM24_TEXT_MAXLENGTH ;
   private boolean n637TBM24_TEXT_MAXROWS ;
   private boolean n638TBM24_DECIMAL_DIGITS ;
   private boolean n639TBM24_TEXT ;
   private boolean n640TBM24_FIXED_VALUE ;
   private boolean n641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean n706TBM24_REQUIRED_INPUT_FLG ;
   private boolean n707TBM24_MIN_VALUE ;
   private boolean n708TBM24_MAX_VALUE ;
   private boolean n543TBM24_ORDER ;
   private boolean n544TBM24_DEL_FLG ;
   private boolean n545TBM24_CRT_DATETIME ;
   private boolean n546TBM24_CRT_USER_ID ;
   private boolean n547TBM24_CRT_PROG_NM ;
   private boolean n548TBM24_UPD_DATETIME ;
   private boolean n549TBM24_UPD_USER_ID ;
   private boolean n550TBM24_UPD_PROG_NM ;
   private boolean n551TBM24_UPD_CNT ;
   private boolean n552TBM25_LIST_NM ;
   private boolean n553TBM25_DEL_FLG ;
   private boolean n554TBM25_CRT_DATETIME ;
   private boolean n555TBM25_CRT_USER_ID ;
   private boolean n556TBM25_CRT_PROG_NM ;
   private boolean n557TBM25_UPD_DATETIME ;
   private boolean n558TBM25_UPD_USER_ID ;
   private boolean n559TBM25_UPD_PROG_NM ;
   private boolean n560TBM25_UPD_CNT ;
   private boolean n561TBM26_LIST_ITEM_NAME ;
   private boolean n562TBM26_INNER_VALUE ;
   private boolean n563TBM26_DEL_FLG ;
   private boolean n564TBM26_CRT_DATETIME ;
   private boolean n565TBM26_CRT_USER_ID ;
   private boolean n566TBM26_CRT_PROG_NM ;
   private boolean n567TBM26_UPD_DATETIME ;
   private boolean n568TBM26_UPD_USER_ID ;
   private boolean n569TBM26_UPD_PROG_NM ;
   private boolean n570TBM26_UPD_CNT ;
   private boolean AV46W_CRF_IMPORT_FLG ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n394TBM31_GRID_SIZE ;
   private boolean n395TBM31_ORDER ;
   private boolean n528TBM31_DEF_VISIT_NO ;
   private boolean n529TBM31_DEF_DOMAIN_CD ;
   private boolean n643TBM31_STATUS ;
   private boolean n396TBM31_NOTE ;
   private boolean n943TBM31_REPEAT_FLG ;
   private boolean n944TBM31_REPEAT_MAX ;
   private boolean n979TBM31_DM_EXCP_NO_DISP_FLG ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n398TBM31_CRT_DATETIME ;
   private boolean n399TBM31_CRT_USER_ID ;
   private boolean n400TBM31_CRT_PROG_NM ;
   private boolean n401TBM31_UPD_DATETIME ;
   private boolean n402TBM31_UPD_USER_ID ;
   private boolean n403TBM31_UPD_PROG_NM ;
   private boolean n404TBM31_UPD_CNT ;
   private boolean n405TBM32_CRF_ITEM_NM ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n508TBM32_LOCATION_X ;
   private boolean n509TBM32_LOCATION_Y ;
   private boolean n510TBM32_LOCATION_X2 ;
   private boolean n511TBM32_LOCATION_Y2 ;
   private boolean n512TBM32_TEXT_ALIGN_DIV ;
   private boolean n516TBM32_TEXT_MAXROWS ;
   private boolean n517TBM32_TEXT_MAXLENGTH ;
   private boolean n518TBM32_DECIMAL_DIGITS ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n526TBM32_IMAGE_CD ;
   private boolean n524TBM32_TEXT ;
   private boolean n513TBM32_FONT_SIZE ;
   private boolean n514TBM32_FONT_UL_FLG ;
   private boolean n515TBM32_FONT_COLOR_DIV ;
   private boolean n521TBM32_LINE_SIZE_DIV ;
   private boolean n689TBM32_LINE_COLOR_DIV ;
   private boolean n519TBM32_LINE_START_POINT_DIV ;
   private boolean n520TBM32_LINE_END_POINT_DIV ;
   private boolean n690TBM32_LINE_ANGLE ;
   private boolean n644TBM32_AUTH_LVL_MIN ;
   private boolean n645TBM32_ZORDER ;
   private boolean n691TBM32_TAB_ORDER ;
   private boolean n692TBM32_TABSTOP_FLG ;
   private boolean n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean n694TBM32_MIN_VALUE ;
   private boolean n695TBM32_MAX_VALUE ;
   private boolean n406TBM32_CRF_ITEM_NOTE ;
   private boolean n774TBM32_REF_CRF_ID ;
   private boolean n775TBM32_REF_CRF_ITEM_CD ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n407TBM32_CRT_DATETIME ;
   private boolean n408TBM32_CRT_USER_ID ;
   private boolean n409TBM32_CRT_PROG_NM ;
   private boolean n410TBM32_UPD_DATETIME ;
   private boolean n411TBM32_UPD_USER_ID ;
   private boolean n412TBM32_UPD_PROG_NM ;
   private boolean n413TBM32_UPD_CNT ;
   private boolean n502TBM33_COND_NM ;
   private boolean n414TBM33_EXPRESSION ;
   private boolean n503TBM33_COND_DIV ;
   private boolean n504TBM33_CRF_ITEM_CD ;
   private boolean n415TBM33_PRIOR_NO ;
   private boolean n505TBM33_ERR_DIV ;
   private boolean n506TBM33_ERR_MSG ;
   private boolean n646TBM33_ENABLED_FLG ;
   private boolean n696TBM33_REQUIRED_INPUT_FLG ;
   private boolean n697TBM33_NUMERIC_RANGE_FLG ;
   private boolean n416TBM33_DEL_FLG ;
   private boolean n417TBM33_CRT_DATETIME ;
   private boolean n418TBM33_CRT_USER_ID ;
   private boolean n419TBM33_CRT_PROG_NM ;
   private boolean n420TBM33_UPD_DATETIME ;
   private boolean n421TBM33_UPD_USER_ID ;
   private boolean n422TBM33_UPD_PROG_NM ;
   private boolean n423TBM33_UPD_CNT ;
   private boolean n571TBM34_DISPLAY_FLG ;
   private boolean n572TBM34_DEL_FLG ;
   private boolean n573TBM34_CRT_DATETIME ;
   private boolean n574TBM34_CRT_USER_ID ;
   private boolean n575TBM34_CRT_PROG_NM ;
   private boolean n576TBM34_UPD_DATETIME ;
   private boolean n577TBM34_UPD_USER_ID ;
   private boolean n578TBM34_UPD_PROG_NM ;
   private boolean n579TBM34_UPD_CNT ;
   private boolean n580TBM35_DISPLAY_FLG ;
   private boolean n581TBM35_DEL_FLG ;
   private boolean n582TBM35_CRT_DATETIME ;
   private boolean n583TBM35_CRT_USER_ID ;
   private boolean n584TBM35_CRT_PROG_NM ;
   private boolean n585TBM35_UPD_DATETIME ;
   private boolean n586TBM35_UPD_USER_ID ;
   private boolean n587TBM35_UPD_PROG_NM ;
   private boolean n588TBM35_UPD_CNT ;
   private boolean n589TBM36_DEL_FLG ;
   private boolean n590TBM36_CRT_DATETIME ;
   private boolean n591TBM36_CRT_USER_ID ;
   private boolean n592TBM36_CRT_PROG_NM ;
   private boolean n593TBM36_UPD_DATETIME ;
   private boolean n594TBM36_UPD_USER_ID ;
   private boolean n595TBM36_UPD_PROG_NM ;
   private boolean n596TBM36_UPD_CNT ;
   private boolean n83TBM37_VISIT_NO ;
   private boolean n84TBM37_DOM_CD ;
   private boolean n500TBM37_DOM_VAR_NM ;
   private boolean n85TBM37_DOM_ITM_GRP_OID ;
   private boolean n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n433TBM37_DEL_FLG ;
   private boolean n434TBM37_CRT_DATETIME ;
   private boolean n435TBM37_CRT_USER_ID ;
   private boolean n436TBM37_CRT_PROG_NM ;
   private boolean n437TBM37_UPD_DATETIME ;
   private boolean n438TBM37_UPD_USER_ID ;
   private boolean n439TBM37_UPD_PROG_NM ;
   private boolean n440TBM37_UPD_CNT ;
   private boolean n424TBM41_NCM_METADATA_ID ;
   private boolean n425TBM41_DEL_FLG ;
   private boolean n426TBM41_CRT_DATETIME ;
   private boolean n427TBM41_CRT_USER_ID ;
   private boolean n428TBM41_CRT_PROG_NM ;
   private boolean n429TBM41_UPD_DATETIME ;
   private boolean n430TBM41_UPD_USER_ID ;
   private boolean n431TBM41_UPD_PROG_NM ;
   private boolean n432TBM41_UPD_CNT ;
   private boolean n905TBM42_DOM_ENM ;
   private boolean n906TBM42_DOM_JNM ;
   private boolean n907TBM42_DOM_GRP_NM ;
   private boolean n908TBM42_NOTE ;
   private boolean n909TBM42_ORDER ;
   private boolean n893TBM42_DEL_FLG ;
   private boolean n894TBM42_CRT_DATETIME ;
   private boolean n895TBM42_CRT_USER_ID ;
   private boolean n896TBM42_CRT_PROG_NM ;
   private boolean n897TBM42_UPD_DATETIME ;
   private boolean n898TBM42_UPD_USER_ID ;
   private boolean n899TBM42_UPD_PROG_NM ;
   private boolean n900TBM42_UPD_CNT ;
   private boolean n910TBM43_VAR_DESC ;
   private boolean n911TBM43_SDTM_FLG ;
   private boolean n912TBM43_CDASH_FLG ;
   private boolean n913TBM43_INPUT_TYPE_DIV ;
   private boolean n914TBM43_REQUIRED_FLG ;
   private boolean n915TBM43_SAS_FIELD_NM ;
   private boolean n916TBM43_ODM_DATA_TYPE ;
   private boolean n917TBM43_NOTE ;
   private boolean n918TBM43_ORDER ;
   private boolean n933TBM43_VERSION ;
   private boolean n919TBM43_DEL_FLG ;
   private boolean n920TBM43_CRT_DATETIME ;
   private boolean n921TBM43_CRT_USER_ID ;
   private boolean n922TBM43_CRT_PROG_NM ;
   private boolean n923TBM43_UPD_DATETIME ;
   private boolean n924TBM43_UPD_USER_ID ;
   private boolean n925TBM43_UPD_PROG_NM ;
   private boolean n926TBM43_UPD_CNT ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n949TBM44_DEL_FLG ;
   private boolean n950TBM44_CRT_DATETIME ;
   private boolean n951TBM44_CRT_USER_ID ;
   private boolean n952TBM44_CRT_PROG_NM ;
   private boolean n953TBM44_UPD_DATETIME ;
   private boolean n954TBM44_UPD_USER_ID ;
   private boolean n955TBM44_UPD_PROG_NM ;
   private boolean n956TBM44_UPD_CNT ;
   private boolean n980TBM45_FILETR_NM ;
   private boolean n981TBM45_IN_CRF_ID ;
   private boolean n982TBM45_DEL_FLG ;
   private boolean n983TBM45_CRT_DATETIME ;
   private boolean n984TBM45_CRT_USER_ID ;
   private boolean n985TBM45_CRT_PROG_NM ;
   private boolean n986TBM45_UPD_DATETIME ;
   private boolean n987TBM45_UPD_USER_ID ;
   private boolean n988TBM45_UPD_PROG_NM ;
   private boolean n989TBM45_UPD_CNT ;
   private boolean n647TBT01_OUTER_SUBJECT_ID ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n441TBT01_DEL_FLG ;
   private boolean n442TBT01_CRT_DATETIME ;
   private boolean n443TBT01_CRT_USER_ID ;
   private boolean n444TBT01_CRT_PROG_NM ;
   private boolean n445TBT01_UPD_DATETIME ;
   private boolean n446TBT01_UPD_USER_ID ;
   private boolean n447TBT01_UPD_PROG_NM ;
   private boolean n448TBT01_UPD_CNT ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n648TBT02_LOCK_FLG ;
   private boolean n649TBT02_LOCK_DATETIME ;
   private boolean n650TBT02_LOCK_USER_ID ;
   private boolean n651TBT02_LOCK_AUTH_CD ;
   private boolean n652TBT02_UPLOAD_DATETIME ;
   private boolean n653TBT02_UPLOAD_USER_ID ;
   private boolean n654TBT02_UPLOAD_AUTH_CD ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n657TBT02_APPROVAL_FLG ;
   private boolean n658TBT02_APPROVAL_DATETIME ;
   private boolean n659TBT02_APPROVAL_USER_ID ;
   private boolean n660TBT02_APPROVAL_AUTH_CD ;
   private boolean n990TBT02_SIGNATURE_FLG ;
   private boolean n991TBT02_SIGNATURE_DATETIME ;
   private boolean n992TBT02_SIGNATURE_USER_ID ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n662TBT02_INPUT_END_DATETIME ;
   private boolean n663TBT02_INPUT_END_USER_ID ;
   private boolean n664TBT02_INPUT_END_AUTH_CD ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n450TBT02_CRT_DATETIME ;
   private boolean n451TBT02_CRT_USER_ID ;
   private boolean n452TBT02_CRT_PROG_NM ;
   private boolean n453TBT02_UPD_DATETIME ;
   private boolean n454TBT02_UPD_USER_ID ;
   private boolean n455TBT02_UPD_PROG_NM ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean n665TBT11_CRF_INPUT_LEVEL ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean n667TBT11_UPLOAD_USER_ID ;
   private boolean n668TBT11_UPLOAD_AUTH_CD ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n671TBT11_APPROVAL_FLG ;
   private boolean n672TBT11_APPROVAL_DATETIME ;
   private boolean n673TBT11_APPROVAL_USER_ID ;
   private boolean n674TBT11_APPROVAL_AUTH_CD ;
   private boolean n993TBT11_SIGNATURE_FLG ;
   private boolean n994TBT11_SIGNATURE_DATETIME ;
   private boolean n995TBT11_SIGNATURE_USER_ID ;
   private boolean n675TBT11_INPUT_END_FLG ;
   private boolean n676TBT11_INPUT_END_DATETIME ;
   private boolean n677TBT11_INPUT_END_USER_ID ;
   private boolean n678TBT11_INPUT_END_AUTH_CD ;
   private boolean n891TBT11_UPD_RIYU ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n458TBT11_CRT_DATETIME ;
   private boolean n459TBT11_CRT_USER_ID ;
   private boolean n460TBT11_CRT_PROG_NM ;
   private boolean n461TBT11_UPD_DATETIME ;
   private boolean n462TBT11_UPD_USER_ID ;
   private boolean n463TBT11_UPD_PROG_NM ;
   private boolean n464TBT11_UPD_CNT ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n679TBT12_EDIT_FLG ;
   private boolean n473TBT12_DEL_FLG ;
   private boolean n466TBT12_CRT_DATETIME ;
   private boolean n467TBT12_CRT_USER_ID ;
   private boolean n468TBT12_CRT_PROG_NM ;
   private boolean n469TBT12_UPD_DATETIME ;
   private boolean n470TBT12_UPD_USER_ID ;
   private boolean n471TBT12_UPD_PROG_NM ;
   private boolean n472TBT12_UPD_CNT ;
   private boolean n597TBT13_CRF_VALUE ;
   private boolean n680TBT13_EDIT_FLG ;
   private boolean n598TBT13_DEL_FLG ;
   private boolean n599TBT13_CRT_DATETIME ;
   private boolean n600TBT13_CRT_USER_ID ;
   private boolean n601TBT13_CRT_PROG_NM ;
   private boolean n602TBT13_UPD_DATETIME ;
   private boolean n603TBT13_UPD_USER_ID ;
   private boolean n604TBT13_UPD_PROG_NM ;
   private boolean n605TBT13_UPD_CNT ;
   private boolean n474TBT14_CRF_ID ;
   private boolean n941TBT14_CRF_EDA_NO ;
   private boolean n475TBT14_CRF_VERSION ;
   private boolean n901TBT14_MEMO_KBN ;
   private boolean n477TBT14_MEMO ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n928TBT14_KAKUNIN_USER_ID ;
   private boolean n934TBT14_KAKUNIN_COMMENT ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n480TBT14_CRT_DATETIME ;
   private boolean n481TBT14_CRT_USER_ID ;
   private boolean n482TBT14_CRT_PROG_NM ;
   private boolean n483TBT14_UPD_DATETIME ;
   private boolean n484TBT14_UPD_USER_ID ;
   private boolean n485TBT14_UPD_PROG_NM ;
   private boolean n486TBT14_UPD_CNT ;
   private boolean n155TBT15_CRF_ID ;
   private boolean n942TBT15_CRF_EDA_NO ;
   private boolean n157TBT15_CRF_VERSION ;
   private boolean n903TBT15_CRF_ITEM_GRP_DIV ;
   private boolean n904TBT15_CRF_ITEM_GRP_CD ;
   private boolean n488TBT15_DEL_FLG ;
   private boolean n489TBT15_CRT_DATETIME ;
   private boolean n490TBT15_CRT_USER_ID ;
   private boolean n491TBT15_CRT_PROG_NM ;
   private boolean n492TBT15_UPD_DATETIME ;
   private boolean n493TBT15_UPD_USER_ID ;
   private boolean n494TBT15_UPD_PROG_NM ;
   private boolean n495TBT15_UPD_CNT ;
   private String AV10P_FILE_NAME ;
   private String AV13PO_ERRCD ;
   private String AV9C_APP_ID ;
   private String AV36W_USER_ID ;
   private String AV27W_MSG ;
   private String AV33W_TABLE_NM ;
   private String AV19W_CSV_DATA ;
   private String AV24W_LINE_MSG ;
   private String A367TBM21_STUDY_NM ;
   private String A530TBM21_OUTER_STUDY_ID ;
   private String A531TBM21_PROC_NM ;
   private String A368TBM21_NOTE ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String A371TBM21_CRT_USER_ID ;
   private String A372TBM21_CRT_PROG_NM ;
   private String A374TBM21_UPD_USER_ID ;
   private String A375TBM21_UPD_PROG_NM ;
   private String A18TBM22_SITE_ID ;
   private String A377TBM22_DEL_FLG ;
   private String A379TBM22_CRT_USER_ID ;
   private String A380TBM22_CRT_PROG_NM ;
   private String A382TBM22_UPD_USER_ID ;
   private String A383TBM22_UPD_PROG_NM ;
   private String A108TBM23_USER_ID ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A385TBM23_DEL_FLG ;
   private String A387TBM23_CRT_USER_ID ;
   private String A388TBM23_CRT_PROG_NM ;
   private String A390TBM23_UPD_USER_ID ;
   private String A391TBM23_UPD_PROG_NM ;
   private String A65TBM24_DOM_CD ;
   private String A66TBM24_DOM_VAR_NM ;
   private String A702TBM24_DOM_ITM_GRP_OID ;
   private String A705TBM24_CRF_ITEM_NM ;
   private String A67TBM24_CRF_ITEM_DIV ;
   private String A635TBM24_IDENTIFICATION_CD ;
   private String A639TBM24_TEXT ;
   private String A640TBM24_FIXED_VALUE ;
   private String A641TBM24_CHK_FALSE_INNER_VALUE ;
   private String A706TBM24_REQUIRED_INPUT_FLG ;
   private String A707TBM24_MIN_VALUE ;
   private String A708TBM24_MAX_VALUE ;
   private String A544TBM24_DEL_FLG ;
   private String A546TBM24_CRT_USER_ID ;
   private String A547TBM24_CRT_PROG_NM ;
   private String A549TBM24_UPD_USER_ID ;
   private String A550TBM24_UPD_PROG_NM ;
   private String A24TBM25_LIST_CD ;
   private String A552TBM25_LIST_NM ;
   private String A553TBM25_DEL_FLG ;
   private String A555TBM25_CRT_USER_ID ;
   private String A556TBM25_CRT_PROG_NM ;
   private String A558TBM25_UPD_USER_ID ;
   private String A559TBM25_UPD_PROG_NM ;
   private String A26TBM26_LIST_CD ;
   private String A561TBM26_LIST_ITEM_NAME ;
   private String A562TBM26_INNER_VALUE ;
   private String A563TBM26_DEL_FLG ;
   private String A565TBM26_CRT_USER_ID ;
   private String A566TBM26_CRT_PROG_NM ;
   private String A568TBM26_UPD_USER_ID ;
   private String A569TBM26_UPD_PROG_NM ;
   private String A393TBM31_CRF_NM ;
   private String A642TBM31_CRF_SNM ;
   private String A529TBM31_DEF_DOMAIN_CD ;
   private String A643TBM31_STATUS ;
   private String A396TBM31_NOTE ;
   private String A979TBM31_DM_EXCP_NO_DISP_FLG ;
   private String A397TBM31_DEL_FLG ;
   private String A399TBM31_CRT_USER_ID ;
   private String A400TBM31_CRT_PROG_NM ;
   private String A402TBM31_UPD_USER_ID ;
   private String A403TBM31_UPD_PROG_NM ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A405TBM32_CRF_ITEM_NM ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String A512TBM32_TEXT_ALIGN_DIV ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A523TBM32_CHK_FALSE_INNER_VALUE ;
   private String A527TBM32_FIXED_VALUE ;
   private String A525TBM32_LIST_CD ;
   private String A526TBM32_IMAGE_CD ;
   private String A524TBM32_TEXT ;
   private String A514TBM32_FONT_UL_FLG ;
   private String A519TBM32_LINE_START_POINT_DIV ;
   private String A520TBM32_LINE_END_POINT_DIV ;
   private String A692TBM32_TABSTOP_FLG ;
   private String A693TBM32_REQUIRED_INPUT_FLG ;
   private String A694TBM32_MIN_VALUE ;
   private String A695TBM32_MAX_VALUE ;
   private String A406TBM32_CRF_ITEM_NOTE ;
   private String A775TBM32_REF_CRF_ITEM_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A408TBM32_CRT_USER_ID ;
   private String A409TBM32_CRT_PROG_NM ;
   private String A411TBM32_UPD_USER_ID ;
   private String A412TBM32_UPD_PROG_NM ;
   private String A502TBM33_COND_NM ;
   private String A414TBM33_EXPRESSION ;
   private String A503TBM33_COND_DIV ;
   private String A504TBM33_CRF_ITEM_CD ;
   private String A505TBM33_ERR_DIV ;
   private String A506TBM33_ERR_MSG ;
   private String A646TBM33_ENABLED_FLG ;
   private String A696TBM33_REQUIRED_INPUT_FLG ;
   private String A697TBM33_NUMERIC_RANGE_FLG ;
   private String A416TBM33_DEL_FLG ;
   private String A418TBM33_CRT_USER_ID ;
   private String A419TBM33_CRT_PROG_NM ;
   private String A421TBM33_UPD_USER_ID ;
   private String A422TBM33_UPD_PROG_NM ;
   private String A30TBM34_STYDY_AUTH_CD ;
   private String A571TBM34_DISPLAY_FLG ;
   private String A572TBM34_DEL_FLG ;
   private String A574TBM34_CRT_USER_ID ;
   private String A575TBM34_CRT_PROG_NM ;
   private String A577TBM34_UPD_USER_ID ;
   private String A578TBM34_UPD_PROG_NM ;
   private String A33TBM35_CRF_ITEM_CD ;
   private String A34TBM35_STUDY_AUTH_CD ;
   private String A580TBM35_DISPLAY_FLG ;
   private String A581TBM35_DEL_FLG ;
   private String A583TBM35_CRT_USER_ID ;
   private String A584TBM35_CRT_PROG_NM ;
   private String A586TBM35_UPD_USER_ID ;
   private String A587TBM35_UPD_PROG_NM ;
   private String A589TBM36_DEL_FLG ;
   private String A591TBM36_CRT_USER_ID ;
   private String A592TBM36_CRT_PROG_NM ;
   private String A594TBM36_UPD_USER_ID ;
   private String A595TBM36_UPD_PROG_NM ;
   private String A81TBM37_CRF_ITEM_GRP_DIV ;
   private String A82TBM37_CRF_ITEM_GRP_CD ;
   private String A84TBM37_DOM_CD ;
   private String A500TBM37_DOM_VAR_NM ;
   private String A85TBM37_DOM_ITM_GRP_OID ;
   private String A433TBM37_DEL_FLG ;
   private String A435TBM37_CRT_USER_ID ;
   private String A436TBM37_CRT_PROG_NM ;
   private String A438TBM37_UPD_USER_ID ;
   private String A439TBM37_UPD_PROG_NM ;
   private String A21TBM41_CRF_ITEM_GRP_DIV ;
   private String A22TBM41_CRF_ITEM_GRP_CD ;
   private String A424TBM41_NCM_METADATA_ID ;
   private String A425TBM41_DEL_FLG ;
   private String A427TBM41_CRT_USER_ID ;
   private String A428TBM41_CRT_PROG_NM ;
   private String A430TBM41_UPD_USER_ID ;
   private String A431TBM41_UPD_PROG_NM ;
   private String A204TBM42_DOM_CD ;
   private String A905TBM42_DOM_ENM ;
   private String A906TBM42_DOM_JNM ;
   private String A907TBM42_DOM_GRP_NM ;
   private String A908TBM42_NOTE ;
   private String A893TBM42_DEL_FLG ;
   private String A895TBM42_CRT_USER_ID ;
   private String A896TBM42_CRT_PROG_NM ;
   private String A898TBM42_UPD_USER_ID ;
   private String A899TBM42_UPD_PROG_NM ;
   private String A201TBM43_DOM_CD ;
   private String A202TBM43_DOM_VAR_NM ;
   private String A910TBM43_VAR_DESC ;
   private String A911TBM43_SDTM_FLG ;
   private String A912TBM43_CDASH_FLG ;
   private String A913TBM43_INPUT_TYPE_DIV ;
   private String A914TBM43_REQUIRED_FLG ;
   private String A915TBM43_SAS_FIELD_NM ;
   private String A916TBM43_ODM_DATA_TYPE ;
   private String A917TBM43_NOTE ;
   private String A933TBM43_VERSION ;
   private String A919TBM43_DEL_FLG ;
   private String A921TBM43_CRT_USER_ID ;
   private String A922TBM43_CRT_PROG_NM ;
   private String A924TBM43_UPD_USER_ID ;
   private String A925TBM43_UPD_PROG_NM ;
   private String A949TBM44_DEL_FLG ;
   private String A951TBM44_CRT_USER_ID ;
   private String A952TBM44_CRT_PROG_NM ;
   private String A954TBM44_UPD_USER_ID ;
   private String A955TBM44_UPD_PROG_NM ;
   private String A980TBM45_FILETR_NM ;
   private String A981TBM45_IN_CRF_ID ;
   private String A982TBM45_DEL_FLG ;
   private String A984TBM45_CRT_USER_ID ;
   private String A985TBM45_CRT_PROG_NM ;
   private String A987TBM45_UPD_USER_ID ;
   private String A988TBM45_UPD_PROG_NM ;
   private String A647TBT01_OUTER_SUBJECT_ID ;
   private String A698TBT01_SITE_ID ;
   private String A441TBT01_DEL_FLG ;
   private String A443TBT01_CRT_USER_ID ;
   private String A444TBT01_CRT_PROG_NM ;
   private String A446TBT01_UPD_USER_ID ;
   private String A447TBT01_UPD_PROG_NM ;
   private String A648TBT02_LOCK_FLG ;
   private String A650TBT02_LOCK_USER_ID ;
   private String A651TBT02_LOCK_AUTH_CD ;
   private String A653TBT02_UPLOAD_USER_ID ;
   private String A654TBT02_UPLOAD_AUTH_CD ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A657TBT02_APPROVAL_FLG ;
   private String A659TBT02_APPROVAL_USER_ID ;
   private String A660TBT02_APPROVAL_AUTH_CD ;
   private String A990TBT02_SIGNATURE_FLG ;
   private String A992TBT02_SIGNATURE_USER_ID ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A663TBT02_INPUT_END_USER_ID ;
   private String A664TBT02_INPUT_END_AUTH_CD ;
   private String A449TBT02_DEL_FLG ;
   private String A451TBT02_CRT_USER_ID ;
   private String A452TBT02_CRT_PROG_NM ;
   private String A454TBT02_UPD_USER_ID ;
   private String A455TBT02_UPD_PROG_NM ;
   private String A667TBT11_UPLOAD_USER_ID ;
   private String A668TBT11_UPLOAD_AUTH_CD ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A671TBT11_APPROVAL_FLG ;
   private String A673TBT11_APPROVAL_USER_ID ;
   private String A674TBT11_APPROVAL_AUTH_CD ;
   private String A993TBT11_SIGNATURE_FLG ;
   private String A995TBT11_SIGNATURE_USER_ID ;
   private String A675TBT11_INPUT_END_FLG ;
   private String A677TBT11_INPUT_END_USER_ID ;
   private String A678TBT11_INPUT_END_AUTH_CD ;
   private String A891TBT11_UPD_RIYU ;
   private String A457TBT11_DEL_FLG ;
   private String A459TBT11_CRT_USER_ID ;
   private String A460TBT11_CRT_PROG_NM ;
   private String A462TBT11_UPD_USER_ID ;
   private String A463TBT11_UPD_PROG_NM ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String A465TBT12_CRF_VALUE ;
   private String A679TBT12_EDIT_FLG ;
   private String A473TBT12_DEL_FLG ;
   private String A467TBT12_CRT_USER_ID ;
   private String A468TBT12_CRT_PROG_NM ;
   private String A470TBT12_UPD_USER_ID ;
   private String A471TBT12_UPD_PROG_NM ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String A597TBT13_CRF_VALUE ;
   private String A680TBT13_EDIT_FLG ;
   private String A598TBT13_DEL_FLG ;
   private String A600TBT13_CRT_USER_ID ;
   private String A601TBT13_CRT_PROG_NM ;
   private String A603TBT13_UPD_USER_ID ;
   private String A604TBT13_UPD_PROG_NM ;
   private String A901TBT14_MEMO_KBN ;
   private String A477TBT14_MEMO ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A928TBT14_KAKUNIN_USER_ID ;
   private String A934TBT14_KAKUNIN_COMMENT ;
   private String A902TBT14_KANRYO_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String A481TBT14_CRT_USER_ID ;
   private String A482TBT14_CRT_PROG_NM ;
   private String A484TBT14_UPD_USER_ID ;
   private String A485TBT14_UPD_PROG_NM ;
   private String A903TBT15_CRF_ITEM_GRP_DIV ;
   private String A904TBT15_CRF_ITEM_GRP_CD ;
   private String A488TBT15_DEL_FLG ;
   private String A490TBT15_CRT_USER_ID ;
   private String A491TBT15_CRT_PROG_NM ;
   private String A493TBT15_UPD_USER_ID ;
   private String A494TBT15_UPD_PROG_NM ;
   private com.genexus.util.GXFile AV22W_FILE ;
   private String[] aP9 ;
   private GxObjectCollection[] aP10 ;
   private IDataStoreProvider pr_default ;
   private byte[] P007E41_A935TBT02_CRF_EDA_NO ;
   private short[] P007E41_A91TBT02_CRF_ID ;
   private int[] P007E41_A90TBT02_SUBJECT_ID ;
   private long[] P007E41_A89TBT02_STUDY_ID ;
   private short[] P007E44_A95TBT11_CRF_VERSION ;
   private byte[] P007E44_A936TBT11_CRF_EDA_NO ;
   private short[] P007E44_A94TBT11_CRF_ID ;
   private int[] P007E44_A93TBT11_SUBJECT_ID ;
   private long[] P007E44_A92TBT11_STUDY_ID ;
   private String[] P007E47_A100TBT12_CRF_ITEM_GRP_CD ;
   private String[] P007E47_A99TBT12_CRF_ITEM_GRP_DIV ;
   private byte[] P007E47_A937TBT12_CRF_EDA_NO ;
   private short[] P007E47_A98TBT12_CRF_ID ;
   private int[] P007E47_A97TBT12_SUBJECT_ID ;
   private long[] P007E47_A96TBT12_STUDY_ID ;
   private String[] P007E50_A106TBT13_CRF_ITEM_GRP_CD ;
   private String[] P007E50_A105TBT13_CRF_ITEM_GRP_DIV ;
   private short[] P007E50_A104TBT13_CRF_VERSION ;
   private byte[] P007E50_A938TBT13_CRF_EDA_NO ;
   private short[] P007E50_A103TBT13_CRF_ID ;
   private int[] P007E50_A102TBT13_SUBJECT_ID ;
   private long[] P007E50_A101TBT13_STUDY_ID ;
   private short[] P007E53_A198TBT14_MEMO_NO ;
   private int[] P007E53_A142TBT14_SUBJECT_ID ;
   private long[] P007E53_A140TBT14_STUDY_ID ;
   private short[] P007E56_A199TBT15_MEMO_NO ;
   private int[] P007E56_A151TBT15_SUBJECT_ID ;
   private long[] P007E56_A149TBT15_STUDY_ID ;
   private GxObjectCollection AV37B407_SD01_IMPORT_LIST_C ;
   private GxObjectCollection AV14PO_ERRMSG ;
   private GxObjectCollection AV18W_CSV_COL ;
   private GxObjectCollection GXv_objcol_svchar4[] ;
   private SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem AV8B407_SD01_IMPORT_LIST_I ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtB808_SD01_EXTRA_INFO AV21W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO7[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV28W_PARMS_ITEM ;
}

final  class b407_pc02_design_import__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P007E2", "DELETE FROM `TBM21_STUDY`  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E3", "DELETE FROM `TBM22_STUDY_SITE`  WHERE `TBM22_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E4", "DELETE FROM `TBM23_STUDY_STAFF`  WHERE `TBM23_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E5", "DELETE FROM `TBM24_MAP_ITEM`  WHERE `TBM24_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E6", "DELETE FROM `TBM25_SEL_LIST`  WHERE `TBM25_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E7", "DELETE FROM `TBM26_SEL_LIST_ITEM`  WHERE `TBM26_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E8", "DELETE FROM `TBM42_STUDY_CDISC_DOMAIN`  WHERE `TBM42_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E9", "DELETE FROM `TBM43_STUDY_CDISC_ITEM`  WHERE `TBM43_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E10", "DELETE FROM `TBM45_CRF_FILETR`  WHERE `TBM45_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E11", "DELETE FROM `TBM31_CRF`  WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E12", "DELETE FROM `TBM32_CRF_ITEM`  WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E13", "DELETE FROM `TBM33_CRF_COND`  WHERE `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E14", "DELETE FROM `TBM34_CRF_AUTH`  WHERE `TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E15", "DELETE FROM `TBM35_CRF_ITEM_AUTH`  WHERE `TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E16", "DELETE FROM `TBM36_CRF_SELECT`  WHERE `TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E17", "DELETE FROM `TBM37_CRF_DOM_MAP`  WHERE `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E18", "DELETE FROM `TBM41_CRF_NCM_MAP`  WHERE `TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E19", "DELETE FROM `TBM44_CRF_VISIT`  WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E20", "INSERT INTO `TBM21_STUDY`(`TBM21_STUDY_ID`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_PROG_NM`, `TBM21_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E21", "INSERT INTO `TBM22_STUDY_SITE`(`TBM22_STUDY_ID`, `TBM22_SITE_ID`, `TBM22_DEL_FLG`, `TBM22_CRT_DATETIME`, `TBM22_CRT_USER_ID`, `TBM22_CRT_PROG_NM`, `TBM22_UPD_DATETIME`, `TBM22_UPD_USER_ID`, `TBM22_UPD_PROG_NM`, `TBM22_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E22", "INSERT INTO `TBM23_STUDY_STAFF`(`TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD`, `TBM23_DEL_FLG`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_PROG_NM`, `TBM23_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E23", "INSERT INTO `TBM24_MAP_ITEM`(`TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_PROG_NM`, `TBM24_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E24", "INSERT INTO `TBM25_SEL_LIST`(`TBM25_STUDY_ID`, `TBM25_LIST_CD`, `TBM25_LIST_NM`, `TBM25_DEL_FLG`, `TBM25_CRT_DATETIME`, `TBM25_CRT_USER_ID`, `TBM25_CRT_PROG_NM`, `TBM25_UPD_DATETIME`, `TBM25_UPD_USER_ID`, `TBM25_UPD_PROG_NM`, `TBM25_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E25", "INSERT INTO `TBM26_SEL_LIST_ITEM`(`TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE`, `TBM26_DEL_FLG`, `TBM26_CRT_DATETIME`, `TBM26_CRT_USER_ID`, `TBM26_CRT_PROG_NM`, `TBM26_UPD_DATETIME`, `TBM26_UPD_USER_ID`, `TBM26_UPD_PROG_NM`, `TBM26_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E26", "INSERT INTO `TBM31_CRF`(`TBM31_STUDY_ID`, `TBM31_CRF_ID`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_PROG_NM`, `TBM31_UPD_CNT`, `TBM31_REPEAT_FLG`, `TBM31_REPEAT_MAX`, `TBM31_DM_EXCP_NO_DISP_FLG`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E27", "INSERT INTO `TBM32_CRF_ITEM`(`TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_PROG_NM`, `TBM32_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E28", "INSERT INTO `TBM33_CRF_COND`(`TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_PROG_NM`, `TBM33_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E29", "INSERT INTO `TBM34_CRF_AUTH`(`TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`, `TBM34_DISPLAY_FLG`, `TBM34_DEL_FLG`, `TBM34_CRT_DATETIME`, `TBM34_CRT_USER_ID`, `TBM34_CRT_PROG_NM`, `TBM34_UPD_DATETIME`, `TBM34_UPD_USER_ID`, `TBM34_UPD_PROG_NM`, `TBM34_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E30", "INSERT INTO `TBM35_CRF_ITEM_AUTH`(`TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`, `TBM35_CRT_PROG_NM`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_PROG_NM`, `TBM35_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E31", "INSERT INTO `TBM36_CRF_SELECT`(`TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_DEL_FLG`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_PROG_NM`, `TBM36_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E32", "INSERT INTO `TBM37_CRF_DOM_MAP`(`TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_PROG_NM`, `TBM37_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E33", "INSERT INTO `TBM41_CRF_NCM_MAP`(`TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`, `TBM41_CRT_PROG_NM`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_PROG_NM`, `TBM41_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E34", "INSERT INTO `TBM42_STUDY_CDISC_DOMAIN`(`TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_PROG_NM`, `TBM42_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E35", "INSERT INTO `TBM43_STUDY_CDISC_ITEM`(`TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`, `TBM43_VAR_DESC`, `TBM43_SDTM_FLG`, `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`, `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_ORDER`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_CRT_DATETIME`, `TBM43_CRT_USER_ID`, `TBM43_CRT_PROG_NM`, `TBM43_UPD_DATETIME`, `TBM43_UPD_USER_ID`, `TBM43_UPD_PROG_NM`, `TBM43_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E36", "INSERT INTO `TBM44_CRF_VISIT`(`TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO`, `TBM44_DEL_FLG`, `TBM44_CRT_DATETIME`, `TBM44_CRT_USER_ID`, `TBM44_CRT_PROG_NM`, `TBM44_UPD_DATETIME`, `TBM44_UPD_USER_ID`, `TBM44_UPD_PROG_NM`, `TBM44_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E37", "DELETE FROM `TBM45_CRF_FILETR`  WHERE `TBM45_STUDY_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E38", "INSERT INTO `TBM45_CRF_FILETR`(`TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E39", "DELETE FROM `TBT01_SUBJECT`  WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E40", "INSERT INTO `TBT01_SUBJECT`(`TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_PROG_NM`, `TBT01_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P007E41", "SELECT `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P007E42", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E43", "INSERT INTO `TBT02_CRF`(`TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_PROG_NM`, `TBT02_UPD_CNT`, `TBT02_SIGNATURE_FLG`, `TBT02_SIGNATURE_DATETIME`, `TBT02_SIGNATURE_USER_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P007E44", "SELECT `TBT11_CRF_VERSION`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P007E45", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E46", "INSERT INTO `TBT11_CRF_HISTORY`(`TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_PROG_NM`, `TBT11_UPD_CNT`, `TBT11_SIGNATURE_FLG`, `TBT11_SIGNATURE_DATETIME`, `TBT11_SIGNATURE_USER_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P007E47", "SELECT `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P007E48", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E49", "INSERT INTO `TBT12_CRF_RESULT`(`TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_PROG_NM`, `TBT12_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P007E50", "SELECT `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_VERSION`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_ID`, `TBT13_SUBJECT_ID`, `TBT13_STUDY_ID` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P007E51", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E52", "INSERT INTO `TBT13_CRF_RES_HIS`(`TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_PROG_NM`, `TBT13_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P007E53", "SELECT `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ? ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P007E54", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E55", "INSERT INTO `TBT14_CRF_MEMO`(`TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`, `TBT14_CRF_ID`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_PROG_NM`, `TBT14_UPD_CNT`, `TBT14_CRF_EDA_NO`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P007E56", "SELECT `TBT15_MEMO_NO`, `TBT15_SUBJECT_ID`, `TBT15_STUDY_ID` FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ? ORDER BY `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P007E57", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P007E58", "INSERT INTO `TBT15_CRF_MEMO_LOC`(`TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_PROG_NM`, `TBT15_UPD_CNT`, `TBT15_CRF_EDA_NO`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 39 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 42 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               return;
            case 51 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 54 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
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
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 100);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 100);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 1000);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 128);
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
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(14, ((Number) parms[26]).longValue());
               }
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 128);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[17]).longValue());
               }
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 40);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[18]).longValue());
               }
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 50);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 50);
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
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 200);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[23], 100);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 100);
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
                  stmt.setVarchar(17, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 10);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[33]).intValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[37], false);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[39], 128);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[41], 40);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[45], 128);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[47], 40);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(27, ((Number) parms[49]).longValue());
               }
               return;
            case 22 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 50);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 1);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[19]).longValue());
               }
               return;
            case 23 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 50);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 100);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 128);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[16], false);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 128);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 40);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[22]).longValue());
               }
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 16);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 1000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 128);
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
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[29], 128);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[31], 40);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(18, ((Number) parms[33]).longValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[39], 1);
               }
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 200);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 50);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 6);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 100);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 100);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 100);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 20);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 50);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 200);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[40]).byteValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(24, ((Number) parms[44]).longValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[46]).byteValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[48]).longValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[50], 2);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[54]).shortValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[56]).byteValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[62], 1);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[66], 10);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[68], 10);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[70], 1000);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[74], 50);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[76], 1);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(41, (java.util.Date)parms[78], false);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[80], 128);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[82], 40);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(44, (java.util.Date)parms[84], false);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[86], 128);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[88], 40);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(47, ((Number) parms[90]).longValue());
               }
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 100);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 1000);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 50);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 200);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 128);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[32], false);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 128);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(21, ((Number) parms[38]).longValue());
               }
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[20]).longValue());
               }
               return;
            case 28 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 1);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 128);
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
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[21]).longValue());
               }
               return;
            case 29 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[19]).longValue());
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 50);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
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
                  stmt.setVarchar(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 128);
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
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(18, ((Number) parms[31]).longValue());
               }
               return;
            case 31 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 1);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 128);
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
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[21]).longValue());
               }
               return;
            case 32 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 50);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 50);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 50);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 1000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 128);
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(15, ((Number) parms[27]).longValue());
               }
               return;
            case 33 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 100);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 50);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1000);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 20);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 128);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[32], false);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 128);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(21, ((Number) parms[38]).longValue());
               }
               return;
            case 34 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[20]).longValue());
               }
               return;
            case 35 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 36 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 1000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[21]).longValue());
               }
               return;
            case 37 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[21]).longValue());
               }
               return;
            case 39 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 41 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 128);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[25], false);
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
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[29], false);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 128);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[37], false);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[39], 128);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[45], false);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[47], 128);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[49], 40);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(28, (java.util.Date)parms[51], false);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[53], 128);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[55], 40);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(31, ((Number) parms[57]).longValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(33, (java.util.Date)parms[61], false);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[63], 128);
               }
               return;
            case 42 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 43 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 44 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[16], false);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[22], 128);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[28], false);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[30], 128);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[34], 2000);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[38], false);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[40], 128);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[42], 40);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[44], false);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[46], 128);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[48], 40);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(28, ((Number) parms[50]).longValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(30, (java.util.Date)parms[54], false);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[56], 128);
               }
               return;
            case 45 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 46 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 47 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[7], 2000);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(16, ((Number) parms[25]).longValue());
               }
               return;
            case 48 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 49 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 50 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[8], 2000);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[22], 128);
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
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(17, ((Number) parms[26]).longValue());
               }
               return;
            case 51 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 52 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 53 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 2000);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 20);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 128);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 2000);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[28], false);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 128);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 40);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[34], false);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 128);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 40);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(22, ((Number) parms[40]).longValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[42]).byteValue());
               }
               return;
            case 54 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 55 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 56 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 50);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 128);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(15, ((Number) parms[26]).longValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[28]).byteValue());
               }
               return;
      }
   }

}

