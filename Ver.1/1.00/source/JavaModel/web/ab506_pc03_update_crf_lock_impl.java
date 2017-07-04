/*
               File: ab506_pc03_update_crf_lock_impl
        Description: CRF入力データロック切替
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:39.46
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab506_pc03_update_crf_lock_impl extends GXWebProcedure
{
   public ab506_pc03_update_crf_lock_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      GXKey = context.getSiteKey( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B504" ;
      AV20W_ERR_CD = (short)(0) ;
      AV21W_ERR_MSG = "" ;
      GXt_char1 = AV26W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26W_NEWLINE = GXt_char1 ;
      AV22W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV22W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22W_EXTRA_INFO", AV22W_EXTRA_INFO);
      AV36W_UPDATE_TIME = GXutil.now( ) ;
      /* Execute user subroutine: S16339 */
      S16339 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S17379 */
      S17379 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV39Pgmname, "INFO", AV40Pgmdesc) ;
      if ( AV20W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1158 */
         S1158 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S12127 */
         S12127 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV20W_ERR_CD, 10, 0))+AV26W_NEWLINE);
      AV24W_HTTP_RES.addString(AV21W_ERR_MSG);
      /* Execute user subroutine: S18395 */
      S18395 ();
      if ( returnInSub )
      {
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1158( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      if ( AV20W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV13P_STUDY_ID)==0) )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "試験ID", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV9P_AUTH_CD)==0) )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "権限コード", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         if ( ! ((GXutil.strcmp(AV11P_LOCK_DIV, "0")==0)||(GXutil.strcmp(AV11P_LOCK_DIV, "1")==0)) )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "ロック区分", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         if ( GXutil.strcmp(AV11P_LOCK_DIV, "0") == 0 )
         {
            GXt_char1 = AV19W_DM_AUTH_CD ;
            GXv_char2[0] = GXt_char1 ;
            new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "008", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19W_DM_AUTH_CD = GXt_char1 ;
            if ( GXutil.strcmp(AV9P_AUTH_CD, AV19W_DM_AUTH_CD) != 0 )
            {
               AV20W_ERR_CD = (short)(1) ;
               GXt_char1 = AV21W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00039", "", "", "", "", "", GXv_char2) ;
               ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
               AV21W_ERR_MSG = GXt_char1 ;
            }
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         AV28W_STUDY_ID = GXutil.lval( AV13P_STUDY_ID) ;
         AV41GXLvl97 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM23_STUDY_STAFF" ;
         /* Using cursor P004N2 */
         pr_default.execute(0, new Object[] {new Long(AV28W_STUDY_ID), AV14P_USER_ID, AV9P_AUTH_CD});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A209TBM23_DEL_FLG = P004N2_A209TBM23_DEL_FLG[0] ;
            n209TBM23_DEL_FLG = P004N2_n209TBM23_DEL_FLG[0] ;
            A407TBM23_STYDY_AUTH_CD = P004N2_A407TBM23_STYDY_AUTH_CD[0] ;
            A208TBM23_USER_ID = P004N2_A208TBM23_USER_ID[0] ;
            A207TBM23_STUDY_ID = P004N2_A207TBM23_STUDY_ID[0] ;
            AV41GXLvl97 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV41GXLvl97 == 0 )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00039", "", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         AV42GXLvl110 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TAM04_KNGN" ;
         /* Using cursor P004N3 */
         pr_default.execute(1, new Object[] {AV9P_AUTH_CD});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A18TAM04_DEL_FLG = P004N3_A18TAM04_DEL_FLG[0] ;
            n18TAM04_DEL_FLG = P004N3_n18TAM04_DEL_FLG[0] ;
            A17TAM04_AUTH_CD = P004N3_A17TAM04_AUTH_CD[0] ;
            A601TAM04_AUTH_LVL = P004N3_A601TAM04_AUTH_LVL[0] ;
            n601TAM04_AUTH_LVL = P004N3_n601TAM04_AUTH_LVL[0] ;
            AV42GXLvl110 = (byte)(1) ;
            AV15W_AUTH_LVL = A601TAM04_AUTH_LVL ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV42GXLvl110 == 0 )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S12127( )
   {
      /* 'SUB_UPDATE_CRF_LOCK' Routine */
      GXt_objcol_char3 = AV18W_CSV_ROW ;
      GXv_objcol_char4[0] = GXt_objcol_char3 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV10P_CRF, GXv_objcol_char4) ;
      GXt_objcol_char3 = GXv_objcol_char4[0] ;
      AV18W_CSV_ROW = GXt_objcol_char3 ;
      AV16W_CNT = 1 ;
      while ( AV16W_CNT <= AV18W_CSV_ROW.size() )
      {
         GXv_objcol_char4[0] = AV17W_CSV_COL ;
         GXv_int5[0] = AV20W_ERR_CD ;
         GXv_char2[0] = AV21W_ERR_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV18W_CSV_ROW.elementAt(-1+(int)(AV16W_CNT)), 3, "CRFテーブルキーCSV", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV17W_CSV_COL = GXv_objcol_char4[0] ;
         ab506_pc03_update_crf_lock_impl.this.AV20W_ERR_CD = GXv_int5[0] ;
         ab506_pc03_update_crf_lock_impl.this.AV21W_ERR_MSG = GXv_char2[0] ;
         if ( AV20W_ERR_CD != 0 )
         {
            if (true) break;
         }
         /* Execute user subroutine: S131 */
         S131 ();
         if (returnInSub) return;
         if ( AV20W_ERR_CD != 0 )
         {
            if (true) break;
         }
         AV28W_STUDY_ID = GXutil.lval( (String)AV17W_CSV_COL.elementAt(-1+1)) ;
         AV30W_SUBJECT_ID = (int)(GXutil.lval( (String)AV17W_CSV_COL.elementAt(-1+2))) ;
         AV29W_CRF_ID = (short)(GXutil.lval( (String)AV17W_CSV_COL.elementAt(-1+3))) ;
         AV43GXLvl149 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT02_CRF" ;
         /* Using cursor P004N4 */
         pr_default.execute(2, new Object[] {new Long(AV28W_STUDY_ID), new Integer(AV30W_SUBJECT_ID), new Short(AV29W_CRF_ID)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A294TBT02_CRF_ID = P004N4_A294TBT02_CRF_ID[0] ;
            A293TBT02_SUBJECT_ID = P004N4_A293TBT02_SUBJECT_ID[0] ;
            A292TBT02_STUDY_ID = P004N4_A292TBT02_STUDY_ID[0] ;
            A370TBT02_CRF_LATEST_VERSION = P004N4_A370TBT02_CRF_LATEST_VERSION[0] ;
            n370TBT02_CRF_LATEST_VERSION = P004N4_n370TBT02_CRF_LATEST_VERSION[0] ;
            A556TBT02_LOCK_FLG = P004N4_A556TBT02_LOCK_FLG[0] ;
            n556TBT02_LOCK_FLG = P004N4_n556TBT02_LOCK_FLG[0] ;
            A371TBT02_CRF_INPUT_LEVEL = P004N4_A371TBT02_CRF_INPUT_LEVEL[0] ;
            n371TBT02_CRF_INPUT_LEVEL = P004N4_n371TBT02_CRF_INPUT_LEVEL[0] ;
            A569TBT02_INPUT_END_FLG = P004N4_A569TBT02_INPUT_END_FLG[0] ;
            n569TBT02_INPUT_END_FLG = P004N4_n569TBT02_INPUT_END_FLG[0] ;
            A558TBT02_LOCK_USER_ID = P004N4_A558TBT02_LOCK_USER_ID[0] ;
            n558TBT02_LOCK_USER_ID = P004N4_n558TBT02_LOCK_USER_ID[0] ;
            A557TBT02_LOCK_DATETIME = P004N4_A557TBT02_LOCK_DATETIME[0] ;
            n557TBT02_LOCK_DATETIME = P004N4_n557TBT02_LOCK_DATETIME[0] ;
            A559TBT02_LOCK_AUTH_CD = P004N4_A559TBT02_LOCK_AUTH_CD[0] ;
            n559TBT02_LOCK_AUTH_CD = P004N4_n559TBT02_LOCK_AUTH_CD[0] ;
            A299TBT02_UPD_DATETIME = P004N4_A299TBT02_UPD_DATETIME[0] ;
            n299TBT02_UPD_DATETIME = P004N4_n299TBT02_UPD_DATETIME[0] ;
            A300TBT02_UPD_USER_ID = P004N4_A300TBT02_UPD_USER_ID[0] ;
            n300TBT02_UPD_USER_ID = P004N4_n300TBT02_UPD_USER_ID[0] ;
            A301TBT02_UPD_PROG_NM = P004N4_A301TBT02_UPD_PROG_NM[0] ;
            n301TBT02_UPD_PROG_NM = P004N4_n301TBT02_UPD_PROG_NM[0] ;
            A302TBT02_UPD_CNT = P004N4_A302TBT02_UPD_CNT[0] ;
            n302TBT02_UPD_CNT = P004N4_n302TBT02_UPD_CNT[0] ;
            AV43GXLvl149 = (byte)(1) ;
            if ( AV20W_ERR_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               Gx_ope = "Update" ;
               Gx_etb = "TBT02_CRF" ;
               /* Using cursor P004N5 */
               pr_default.execute(3, new Object[] {new Boolean(n556TBT02_LOCK_FLG), A556TBT02_LOCK_FLG, new Boolean(n558TBT02_LOCK_USER_ID), A558TBT02_LOCK_USER_ID, new Boolean(n557TBT02_LOCK_DATETIME), A557TBT02_LOCK_DATETIME, new Boolean(n559TBT02_LOCK_AUTH_CD), A559TBT02_LOCK_AUTH_CD, new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
               if (true) break;
            }
            AV35W_CRF_LATEST_VERSION = A370TBT02_CRF_LATEST_VERSION ;
            AV31W_LOCK_FLG = A556TBT02_LOCK_FLG ;
            AV32W_CRF_INPUT_LEVEL = A371TBT02_CRF_INPUT_LEVEL ;
            AV33W_INPUT_END_FLG = A569TBT02_INPUT_END_FLG ;
            AV34W_LOCK_USER_ID = A558TBT02_LOCK_USER_ID ;
            if ( AV20W_ERR_CD == 0 )
            {
               /* Execute user subroutine: S144 */
               S144 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  if (true) return;
               }
            }
            if ( AV20W_ERR_CD == 0 )
            {
               A556TBT02_LOCK_FLG = AV11P_LOCK_DIV ;
               n556TBT02_LOCK_FLG = false ;
               if ( GXutil.strcmp(AV11P_LOCK_DIV, "0") == 0 )
               {
                  A557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
                  n557TBT02_LOCK_DATETIME = false ;
                  A558TBT02_LOCK_USER_ID = "" ;
                  n558TBT02_LOCK_USER_ID = false ;
                  A559TBT02_LOCK_AUTH_CD = "" ;
                  n559TBT02_LOCK_AUTH_CD = false ;
                  /* Execute user subroutine: S154 */
                  S154 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     returnInSub = true;
                     if (true) return;
                  }
               }
               else
               {
                  A557TBT02_LOCK_DATETIME = AV36W_UPDATE_TIME ;
                  n557TBT02_LOCK_DATETIME = false ;
                  A558TBT02_LOCK_USER_ID = AV14P_USER_ID ;
                  n558TBT02_LOCK_USER_ID = false ;
                  A559TBT02_LOCK_AUTH_CD = AV9P_AUTH_CD ;
                  n559TBT02_LOCK_AUTH_CD = false ;
               }
               A299TBT02_UPD_DATETIME = AV36W_UPDATE_TIME ;
               n299TBT02_UPD_DATETIME = false ;
               A300TBT02_UPD_USER_ID = AV14P_USER_ID ;
               n300TBT02_UPD_USER_ID = false ;
               A301TBT02_UPD_PROG_NM = AV39Pgmname ;
               n301TBT02_UPD_PROG_NM = false ;
               A302TBT02_UPD_CNT = (long)(A302TBT02_UPD_CNT+1) ;
               n302TBT02_UPD_CNT = false ;
            }
            Gx_ope = "Update" ;
            Gx_etb = "TBT02_CRF" ;
            /* Using cursor P004N6 */
            pr_default.execute(4, new Object[] {new Boolean(n556TBT02_LOCK_FLG), A556TBT02_LOCK_FLG, new Boolean(n558TBT02_LOCK_USER_ID), A558TBT02_LOCK_USER_ID, new Boolean(n557TBT02_LOCK_DATETIME), A557TBT02_LOCK_DATETIME, new Boolean(n559TBT02_LOCK_AUTH_CD), A559TBT02_LOCK_AUTH_CD, new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV43GXLvl149 == 0 )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXt_char1 ;
         }
         if ( AV20W_ERR_CD != 0 )
         {
            if (true) break;
         }
         AV16W_CNT = (long)(AV16W_CNT+1) ;
      }
   }

   public void S144( )
   {
      /* 'SUB_CHECK_CRF_STATUS' Routine */
      if ( GXutil.strcmp(AV11P_LOCK_DIV, "0") == 0 )
      {
         if ( GXutil.strcmp(AV31W_LOCK_FLG, "1") != 0 )
         {
            AV20W_ERR_CD = (short)(1) ;
            if ( GXutil.strcmp(AV31W_LOCK_FLG, "0") == 0 )
            {
               GXt_char1 = AV21W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00045", "ロック解除済み", "", "", "", "", GXv_char2) ;
               ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
               AV21W_ERR_MSG = GXt_char1 ;
            }
            else if ( GXutil.strcmp(AV31W_LOCK_FLG, "2") == 0 )
            {
               GXt_char1 = AV21W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00045", "一次保存", "", "", "", "", GXv_char2) ;
               ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
               AV21W_ERR_MSG = GXt_char1 ;
            }
            else
            {
               GXt_char1 = AV21W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00045", "ロック解除済み", "", "", "", "", GXv_char2) ;
               ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
               AV21W_ERR_MSG = GXt_char1 ;
            }
         }
      }
      else if ( GXutil.strcmp(AV11P_LOCK_DIV, "1") == 0 )
      {
         if ( GXutil.strcmp(AV31W_LOCK_FLG, "1") == 0 )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00045", "ロック済み", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXt_char1 ;
         }
         else
         {
            if ( AV32W_CRF_INPUT_LEVEL > AV15W_AUTH_LVL )
            {
               AV20W_ERR_CD = (short)(1) ;
               GXt_char1 = AV21W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00039", "", "", "", "", "", GXv_char2) ;
               ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
               AV21W_ERR_MSG = GXt_char1 ;
            }
            if ( AV20W_ERR_CD == 0 )
            {
               GXt_char1 = AV19W_DM_AUTH_CD ;
               GXv_char2[0] = GXt_char1 ;
               new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "008", GXv_char2) ;
               ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
               AV19W_DM_AUTH_CD = GXt_char1 ;
               if ( ( GXutil.strcmp(AV33W_INPUT_END_FLG, "0") != 0 ) && ( GXutil.strcmp(AV9P_AUTH_CD, AV19W_DM_AUTH_CD) != 0 ) )
               {
                  AV20W_ERR_CD = (short)(1) ;
                  GXt_char1 = AV21W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00045", "データ固定済み", "", "", "", "", GXv_char2) ;
                  ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV21W_ERR_MSG = GXt_char1 ;
               }
            }
            if ( AV20W_ERR_CD == 0 )
            {
               if ( GXutil.strcmp(AV31W_LOCK_FLG, "2") == 0 )
               {
                  if ( GXutil.strcmp(AV34W_LOCK_USER_ID, AV14P_USER_ID) != 0 )
                  {
                     AV20W_ERR_CD = (short)(1) ;
                     GXt_char1 = AV21W_ERR_MSG ;
                     GXv_char2[0] = GXt_char1 ;
                     new a805_pc01_msg_get(remoteHandle, context).execute( "AE00046", "", "", "", "", "", GXv_char2) ;
                     ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
                     AV21W_ERR_MSG = GXt_char1 ;
                  }
               }
            }
         }
      }
   }

   public void S131( )
   {
      /* 'SUB_CHECK_CRF_KEY' Routine */
      if ( AV20W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", (String)AV17W_CSV_COL.elementAt(-1+1))==0) )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "試験ID", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXutil.trim( GXutil.str( AV16W_CNT, 10, 0)) + "行目：" + GXt_char1 ;
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         if ( GXutil.strcmp((String)AV17W_CSV_COL.elementAt(-1+1), AV13P_STUDY_ID) != 0 )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00060", "", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXutil.trim( GXutil.str( AV16W_CNT, 10, 0)) + "行目：" + GXt_char1 ;
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", (String)AV17W_CSV_COL.elementAt(-1+2))==0) )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "患者ID", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXutil.trim( GXutil.str( AV16W_CNT, 10, 0)) + "行目：" + GXt_char1 ;
         }
      }
      if ( AV20W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", (String)AV17W_CSV_COL.elementAt(-1+3))==0) )
         {
            AV20W_ERR_CD = (short)(1) ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "CRFID", "", "", "", "", GXv_char2) ;
            ab506_pc03_update_crf_lock_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXutil.trim( GXutil.str( AV16W_CNT, 10, 0)) + "行目：" + GXt_char1 ;
         }
      }
   }

   public void S154( )
   {
      /* 'SUB_RESTORE_CRF_RESULT' Routine */
      if ( AV20W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT12_CRF_RESULT" ;
         /* Using cursor P004N7 */
         pr_default.execute(5, new Object[] {new Long(AV28W_STUDY_ID), new Integer(AV30W_SUBJECT_ID), new Short(AV29W_CRF_ID)});
         /* End optimized DELETE. */
      }
      if ( AV20W_ERR_CD == 0 )
      {
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT13_CRF_RES_HIS" ;
         /* Using cursor P004N8 */
         pr_default.execute(6, new Object[] {new Long(AV28W_STUDY_ID), new Integer(AV30W_SUBJECT_ID), new Short(AV29W_CRF_ID), new Short(AV35W_CRF_LATEST_VERSION)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A496TBT13_STUDY_ID = P004N8_A496TBT13_STUDY_ID[0] ;
            A497TBT13_SUBJECT_ID = P004N8_A497TBT13_SUBJECT_ID[0] ;
            A498TBT13_CRF_ID = P004N8_A498TBT13_CRF_ID[0] ;
            A500TBT13_CRF_ITEM_GRP_DIV = P004N8_A500TBT13_CRF_ITEM_GRP_DIV[0] ;
            A501TBT13_CRF_ITEM_GRP_CD = P004N8_A501TBT13_CRF_ITEM_GRP_CD[0] ;
            A502TBT13_CRF_VALUE = P004N8_A502TBT13_CRF_VALUE[0] ;
            n502TBT13_CRF_VALUE = P004N8_n502TBT13_CRF_VALUE[0] ;
            A588TBT13_EDIT_FLG = P004N8_A588TBT13_EDIT_FLG[0] ;
            n588TBT13_EDIT_FLG = P004N8_n588TBT13_EDIT_FLG[0] ;
            A503TBT13_DEL_FLG = P004N8_A503TBT13_DEL_FLG[0] ;
            n503TBT13_DEL_FLG = P004N8_n503TBT13_DEL_FLG[0] ;
            A504TBT13_CRT_DATETIME = P004N8_A504TBT13_CRT_DATETIME[0] ;
            n504TBT13_CRT_DATETIME = P004N8_n504TBT13_CRT_DATETIME[0] ;
            A505TBT13_CRT_USER_ID = P004N8_A505TBT13_CRT_USER_ID[0] ;
            n505TBT13_CRT_USER_ID = P004N8_n505TBT13_CRT_USER_ID[0] ;
            A506TBT13_CRT_PROG_NM = P004N8_A506TBT13_CRT_PROG_NM[0] ;
            n506TBT13_CRT_PROG_NM = P004N8_n506TBT13_CRT_PROG_NM[0] ;
            A507TBT13_UPD_DATETIME = P004N8_A507TBT13_UPD_DATETIME[0] ;
            n507TBT13_UPD_DATETIME = P004N8_n507TBT13_UPD_DATETIME[0] ;
            A508TBT13_UPD_USER_ID = P004N8_A508TBT13_UPD_USER_ID[0] ;
            n508TBT13_UPD_USER_ID = P004N8_n508TBT13_UPD_USER_ID[0] ;
            A509TBT13_UPD_PROG_NM = P004N8_A509TBT13_UPD_PROG_NM[0] ;
            n509TBT13_UPD_PROG_NM = P004N8_n509TBT13_UPD_PROG_NM[0] ;
            A510TBT13_UPD_CNT = P004N8_A510TBT13_UPD_CNT[0] ;
            n510TBT13_UPD_CNT = P004N8_n510TBT13_UPD_CNT[0] ;
            A499TBT13_CRF_VERSION = P004N8_A499TBT13_CRF_VERSION[0] ;
            /*
               INSERT RECORD ON TABLE TBT12_CRF_RESULT

            */
            A315TBT12_STUDY_ID = A496TBT13_STUDY_ID ;
            A316TBT12_SUBJECT_ID = A497TBT13_SUBJECT_ID ;
            A317TBT12_CRF_ID = A498TBT13_CRF_ID ;
            A318TBT12_CRF_ITEM_GRP_DIV = A500TBT13_CRF_ITEM_GRP_DIV ;
            A319TBT12_CRF_ITEM_GRP_CD = A501TBT13_CRF_ITEM_GRP_CD ;
            A320TBT12_CRF_VALUE = A502TBT13_CRF_VALUE ;
            n320TBT12_CRF_VALUE = false ;
            A587TBT12_EDIT_FLG = A588TBT13_EDIT_FLG ;
            n587TBT12_EDIT_FLG = false ;
            A328TBT12_DEL_FLG = A503TBT13_DEL_FLG ;
            n328TBT12_DEL_FLG = false ;
            A321TBT12_CRT_DATETIME = A504TBT13_CRT_DATETIME ;
            n321TBT12_CRT_DATETIME = false ;
            A322TBT12_CRT_USER_ID = A505TBT13_CRT_USER_ID ;
            n322TBT12_CRT_USER_ID = false ;
            A323TBT12_CRT_PROG_NM = A506TBT13_CRT_PROG_NM ;
            n323TBT12_CRT_PROG_NM = false ;
            A324TBT12_UPD_DATETIME = A507TBT13_UPD_DATETIME ;
            n324TBT12_UPD_DATETIME = false ;
            A325TBT12_UPD_USER_ID = A508TBT13_UPD_USER_ID ;
            n325TBT12_UPD_USER_ID = false ;
            A326TBT12_UPD_PROG_NM = A509TBT13_UPD_PROG_NM ;
            n326TBT12_UPD_PROG_NM = false ;
            A327TBT12_UPD_CNT = A510TBT13_UPD_CNT ;
            n327TBT12_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBT12_CRF_RESULT" ;
            /* Using cursor P004N9 */
            pr_default.execute(7, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD, new Boolean(n320TBT12_CRF_VALUE), A320TBT12_CRF_VALUE, new Boolean(n587TBT12_EDIT_FLG), A587TBT12_EDIT_FLG, new Boolean(n328TBT12_DEL_FLG), A328TBT12_DEL_FLG, new Boolean(n321TBT12_CRT_DATETIME), A321TBT12_CRT_DATETIME, new Boolean(n322TBT12_CRT_USER_ID), A322TBT12_CRT_USER_ID, new Boolean(n323TBT12_CRT_PROG_NM), A323TBT12_CRT_PROG_NM, new Boolean(n324TBT12_UPD_DATETIME), A324TBT12_UPD_DATETIME, new Boolean(n325TBT12_UPD_USER_ID), A325TBT12_UPD_USER_ID, new Boolean(n326TBT12_UPD_PROG_NM), A326TBT12_UPD_PROG_NM, new Boolean(n327TBT12_UPD_CNT), new Long(A327TBT12_UPD_CNT)});
            if ( (pr_default.getStatus(7) == 1) )
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
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
   }

   public void S16339( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV14P_USER_ID = AV23W_HTTP_REQ.getVariable("USER_ID") ;
      AV12P_PWD = AV23W_HTTP_REQ.getVariable("PW") ;
      AV13P_STUDY_ID = AV23W_HTTP_REQ.getVariable("STUDY_ID") ;
      AV9P_AUTH_CD = AV23W_HTTP_REQ.getVariable("AUTH_CD") ;
      AV10P_CRF = AV23W_HTTP_REQ.getVariable("CRF") ;
      AV11P_LOCK_DIV = AV23W_HTTP_REQ.getVariable("LOCK_DIV") ;
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV14P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_STUDY_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "AUTH_CD" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_AUTH_CD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "LOCK_DIV" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_LOCK_DIV );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_PARMS_ITEM", AV27W_PARMS_ITEM);
      AV22W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV25W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV22W_EXTRA_INFO;
      GXv_int5[0] = AV20W_ERR_CD ;
      GXv_char2[0] = AV21W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV39Pgmname, (short)(1), AV25W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV22W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV20W_ERR_CD = GXv_int5[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV21W_ERR_MSG = GXv_char2[0] ;
   }

   public void S17379( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV24W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV14P_USER_ID ;
      GXv_int5[0] = AV20W_ERR_CD ;
      GXv_char7[0] = AV21W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV12P_PWD, GXv_int5, GXv_char7) ;
      ab506_pc03_update_crf_lock_impl.this.AV14P_USER_ID = GXv_char2[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV20W_ERR_CD = GXv_int5[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV21W_ERR_MSG = GXv_char7[0] ;
   }

   public void S18395( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV20W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab506_pc03_update_crf_lock");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab506_pc03_update_crf_lock");
      }
      AV25W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV20W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV21W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV22W_EXTRA_INFO;
      GXv_int5[0] = AV20W_ERR_CD ;
      GXv_char7[0] = AV21W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV39Pgmname, (short)(1), AV25W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char7) ;
      AV22W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV20W_ERR_CD = GXv_int5[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV21W_ERR_MSG = GXv_char7[0] ;
      GXv_int5[0] = AV20W_ERR_CD ;
      GXv_char7[0] = AV21W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int5, GXv_char7) ;
      ab506_pc03_update_crf_lock_impl.this.AV20W_ERR_CD = GXv_int5[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV21W_ERR_MSG = GXv_char7[0] ;
   }

   public void S19414( )
   {
      /* 'SUB_ERROR' Routine */
      AV25W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV22W_EXTRA_INFO;
      GXv_int5[0] = AV20W_ERR_CD ;
      GXv_char7[0] = AV21W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV39Pgmname, (short)(0), AV25W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char7) ;
      AV22W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV20W_ERR_CD = GXv_int5[0] ;
      ab506_pc03_update_crf_lock_impl.this.AV21W_ERR_MSG = GXv_char7[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
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
                  /* Execute user subroutine: S19414 */
                  S19414 ();
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
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV8C_APP_ID = "" ;
      AV21W_ERR_MSG = "" ;
      AV26W_NEWLINE = "" ;
      AV22W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV36W_UPDATE_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV39Pgmname = "" ;
      AV40Pgmdesc = "" ;
      AV24W_HTTP_RES = httpContext.getHttpResponse();
      AV13P_STUDY_ID = "" ;
      AV9P_AUTH_CD = "" ;
      AV11P_LOCK_DIV = "" ;
      AV19W_DM_AUTH_CD = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV14P_USER_ID = "" ;
      P004N2_A209TBM23_DEL_FLG = new String[] {""} ;
      P004N2_n209TBM23_DEL_FLG = new boolean[] {false} ;
      P004N2_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      P004N2_A208TBM23_USER_ID = new String[] {""} ;
      P004N2_A207TBM23_STUDY_ID = new long[1] ;
      A209TBM23_DEL_FLG = "" ;
      A407TBM23_STYDY_AUTH_CD = "" ;
      A208TBM23_USER_ID = "" ;
      P004N3_A18TAM04_DEL_FLG = new String[] {""} ;
      P004N3_n18TAM04_DEL_FLG = new boolean[] {false} ;
      P004N3_A17TAM04_AUTH_CD = new String[] {""} ;
      P004N3_A601TAM04_AUTH_LVL = new byte[1] ;
      P004N3_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      A18TAM04_DEL_FLG = "" ;
      A17TAM04_AUTH_CD = "" ;
      A557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A558TBT02_LOCK_USER_ID = "" ;
      A559TBT02_LOCK_AUTH_CD = "" ;
      AV18W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      AV10P_CRF = "" ;
      AV17W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char4 = new GxObjectCollection [1] ;
      P004N4_A294TBT02_CRF_ID = new short[1] ;
      P004N4_A293TBT02_SUBJECT_ID = new int[1] ;
      P004N4_A292TBT02_STUDY_ID = new long[1] ;
      P004N4_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      P004N4_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P004N4_A556TBT02_LOCK_FLG = new String[] {""} ;
      P004N4_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      P004N4_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P004N4_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P004N4_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P004N4_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P004N4_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      P004N4_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      P004N4_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004N4_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      P004N4_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      P004N4_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      P004N4_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004N4_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      P004N4_A300TBT02_UPD_USER_ID = new String[] {""} ;
      P004N4_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      P004N4_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      P004N4_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      P004N4_A302TBT02_UPD_CNT = new long[1] ;
      P004N4_n302TBT02_UPD_CNT = new boolean[] {false} ;
      A556TBT02_LOCK_FLG = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A300TBT02_UPD_USER_ID = "" ;
      A301TBT02_UPD_PROG_NM = "" ;
      AV31W_LOCK_FLG = "" ;
      AV33W_INPUT_END_FLG = "" ;
      AV34W_LOCK_USER_ID = "" ;
      GXt_char1 = "" ;
      P004N8_A496TBT13_STUDY_ID = new long[1] ;
      P004N8_A497TBT13_SUBJECT_ID = new int[1] ;
      P004N8_A498TBT13_CRF_ID = new short[1] ;
      P004N8_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P004N8_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P004N8_A502TBT13_CRF_VALUE = new String[] {""} ;
      P004N8_n502TBT13_CRF_VALUE = new boolean[] {false} ;
      P004N8_A588TBT13_EDIT_FLG = new String[] {""} ;
      P004N8_n588TBT13_EDIT_FLG = new boolean[] {false} ;
      P004N8_A503TBT13_DEL_FLG = new String[] {""} ;
      P004N8_n503TBT13_DEL_FLG = new boolean[] {false} ;
      P004N8_A504TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004N8_n504TBT13_CRT_DATETIME = new boolean[] {false} ;
      P004N8_A505TBT13_CRT_USER_ID = new String[] {""} ;
      P004N8_n505TBT13_CRT_USER_ID = new boolean[] {false} ;
      P004N8_A506TBT13_CRT_PROG_NM = new String[] {""} ;
      P004N8_n506TBT13_CRT_PROG_NM = new boolean[] {false} ;
      P004N8_A507TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004N8_n507TBT13_UPD_DATETIME = new boolean[] {false} ;
      P004N8_A508TBT13_UPD_USER_ID = new String[] {""} ;
      P004N8_n508TBT13_UPD_USER_ID = new boolean[] {false} ;
      P004N8_A509TBT13_UPD_PROG_NM = new String[] {""} ;
      P004N8_n509TBT13_UPD_PROG_NM = new boolean[] {false} ;
      P004N8_A510TBT13_UPD_CNT = new long[1] ;
      P004N8_n510TBT13_UPD_CNT = new boolean[] {false} ;
      P004N8_A499TBT13_CRF_VERSION = new short[1] ;
      A500TBT13_CRF_ITEM_GRP_DIV = "" ;
      A501TBT13_CRF_ITEM_GRP_CD = "" ;
      A502TBT13_CRF_VALUE = "" ;
      A588TBT13_EDIT_FLG = "" ;
      A503TBT13_DEL_FLG = "" ;
      A504TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A505TBT13_CRT_USER_ID = "" ;
      A506TBT13_CRT_PROG_NM = "" ;
      A507TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A508TBT13_UPD_USER_ID = "" ;
      A509TBT13_UPD_PROG_NM = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A320TBT12_CRF_VALUE = "" ;
      A587TBT12_EDIT_FLG = "" ;
      A328TBT12_DEL_FLG = "" ;
      A321TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A322TBT12_CRT_USER_ID = "" ;
      A323TBT12_CRT_PROG_NM = "" ;
      A324TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A325TBT12_UPD_USER_ID = "" ;
      A326TBT12_UPD_PROG_NM = "" ;
      Gx_emsg = "" ;
      AV23W_HTTP_REQ = httpContext.getHttpRequest();
      AV12P_PWD = "" ;
      AV27W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV25W_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char7 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab506_pc03_update_crf_lock__default(),
         new Object[] {
             new Object[] {
            P004N2_A209TBM23_DEL_FLG, P004N2_n209TBM23_DEL_FLG, P004N2_A407TBM23_STYDY_AUTH_CD, P004N2_A208TBM23_USER_ID, P004N2_A207TBM23_STUDY_ID
            }
            , new Object[] {
            P004N3_A18TAM04_DEL_FLG, P004N3_n18TAM04_DEL_FLG, P004N3_A17TAM04_AUTH_CD, P004N3_A601TAM04_AUTH_LVL, P004N3_n601TAM04_AUTH_LVL
            }
            , new Object[] {
            P004N4_A294TBT02_CRF_ID, P004N4_A293TBT02_SUBJECT_ID, P004N4_A292TBT02_STUDY_ID, P004N4_A370TBT02_CRF_LATEST_VERSION, P004N4_n370TBT02_CRF_LATEST_VERSION, P004N4_A556TBT02_LOCK_FLG, P004N4_n556TBT02_LOCK_FLG, P004N4_A371TBT02_CRF_INPUT_LEVEL, P004N4_n371TBT02_CRF_INPUT_LEVEL, P004N4_A569TBT02_INPUT_END_FLG,
            P004N4_n569TBT02_INPUT_END_FLG, P004N4_A558TBT02_LOCK_USER_ID, P004N4_n558TBT02_LOCK_USER_ID, P004N4_A557TBT02_LOCK_DATETIME, P004N4_n557TBT02_LOCK_DATETIME, P004N4_A559TBT02_LOCK_AUTH_CD, P004N4_n559TBT02_LOCK_AUTH_CD, P004N4_A299TBT02_UPD_DATETIME, P004N4_n299TBT02_UPD_DATETIME, P004N4_A300TBT02_UPD_USER_ID,
            P004N4_n300TBT02_UPD_USER_ID, P004N4_A301TBT02_UPD_PROG_NM, P004N4_n301TBT02_UPD_PROG_NM, P004N4_A302TBT02_UPD_CNT, P004N4_n302TBT02_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P004N8_A496TBT13_STUDY_ID, P004N8_A497TBT13_SUBJECT_ID, P004N8_A498TBT13_CRF_ID, P004N8_A500TBT13_CRF_ITEM_GRP_DIV, P004N8_A501TBT13_CRF_ITEM_GRP_CD, P004N8_A502TBT13_CRF_VALUE, P004N8_n502TBT13_CRF_VALUE, P004N8_A588TBT13_EDIT_FLG, P004N8_n588TBT13_EDIT_FLG, P004N8_A503TBT13_DEL_FLG,
            P004N8_n503TBT13_DEL_FLG, P004N8_A504TBT13_CRT_DATETIME, P004N8_n504TBT13_CRT_DATETIME, P004N8_A505TBT13_CRT_USER_ID, P004N8_n505TBT13_CRT_USER_ID, P004N8_A506TBT13_CRT_PROG_NM, P004N8_n506TBT13_CRT_PROG_NM, P004N8_A507TBT13_UPD_DATETIME, P004N8_n507TBT13_UPD_DATETIME, P004N8_A508TBT13_UPD_USER_ID,
            P004N8_n508TBT13_UPD_USER_ID, P004N8_A509TBT13_UPD_PROG_NM, P004N8_n509TBT13_UPD_PROG_NM, P004N8_A510TBT13_UPD_CNT, P004N8_n510TBT13_UPD_CNT, P004N8_A499TBT13_CRF_VERSION
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmdesc = "CRF入力データロック切替" ;
      AV39Pgmname = "AB506_PC03_UPDATE_CRF_LOCK" ;
      /* GeneXus formulas. */
      AV40Pgmdesc = "CRF入力データロック切替" ;
      AV39Pgmname = "AB506_PC03_UPDATE_CRF_LOCK" ;
      Gx_err = (short)(0) ;
   }

   private byte A601TAM04_AUTH_LVL ;
   private byte AV41GXLvl97 ;
   private byte AV42GXLvl110 ;
   private byte AV15W_AUTH_LVL ;
   private byte AV43GXLvl149 ;
   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private byte AV32W_CRF_INPUT_LEVEL ;
   private short AV20W_ERR_CD ;
   private short AV29W_CRF_ID ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short AV35W_CRF_LATEST_VERSION ;
   private short A498TBT13_CRF_ID ;
   private short A499TBT13_CRF_VERSION ;
   private short A317TBT12_CRF_ID ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int AV30W_SUBJECT_ID ;
   private int A293TBT02_SUBJECT_ID ;
   private int A497TBT13_SUBJECT_ID ;
   private int GX_INS26 ;
   private int A316TBT12_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV28W_STUDY_ID ;
   private long A207TBM23_STUDY_ID ;
   private long AV16W_CNT ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private long A496TBT13_STUDY_ID ;
   private long A510TBT13_UPD_CNT ;
   private long A315TBT12_STUDY_ID ;
   private long A327TBT12_UPD_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV39Pgmname ;
   private String AV40Pgmdesc ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private java.util.Date AV36W_UPDATE_TIME ;
   private java.util.Date A557TBT02_LOCK_DATETIME ;
   private java.util.Date A299TBT02_UPD_DATETIME ;
   private java.util.Date A504TBT13_CRT_DATETIME ;
   private java.util.Date A507TBT13_UPD_DATETIME ;
   private java.util.Date A321TBT12_CRT_DATETIME ;
   private java.util.Date A324TBT12_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n209TBM23_DEL_FLG ;
   private boolean n18TAM04_DEL_FLG ;
   private boolean n601TAM04_AUTH_LVL ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n556TBT02_LOCK_FLG ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n558TBT02_LOCK_USER_ID ;
   private boolean n557TBT02_LOCK_DATETIME ;
   private boolean n559TBT02_LOCK_AUTH_CD ;
   private boolean n299TBT02_UPD_DATETIME ;
   private boolean n300TBT02_UPD_USER_ID ;
   private boolean n301TBT02_UPD_PROG_NM ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean n502TBT13_CRF_VALUE ;
   private boolean n588TBT13_EDIT_FLG ;
   private boolean n503TBT13_DEL_FLG ;
   private boolean n504TBT13_CRT_DATETIME ;
   private boolean n505TBT13_CRT_USER_ID ;
   private boolean n506TBT13_CRT_PROG_NM ;
   private boolean n507TBT13_UPD_DATETIME ;
   private boolean n508TBT13_UPD_USER_ID ;
   private boolean n509TBT13_UPD_PROG_NM ;
   private boolean n510TBT13_UPD_CNT ;
   private boolean n320TBT12_CRF_VALUE ;
   private boolean n587TBT12_EDIT_FLG ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n321TBT12_CRT_DATETIME ;
   private boolean n322TBT12_CRT_USER_ID ;
   private boolean n323TBT12_CRT_PROG_NM ;
   private boolean n324TBT12_UPD_DATETIME ;
   private boolean n325TBT12_UPD_USER_ID ;
   private boolean n326TBT12_UPD_PROG_NM ;
   private boolean n327TBT12_UPD_CNT ;
   private String AV8C_APP_ID ;
   private String AV21W_ERR_MSG ;
   private String AV26W_NEWLINE ;
   private String AV13P_STUDY_ID ;
   private String AV9P_AUTH_CD ;
   private String AV11P_LOCK_DIV ;
   private String AV19W_DM_AUTH_CD ;
   private String AV14P_USER_ID ;
   private String A209TBM23_DEL_FLG ;
   private String A407TBM23_STYDY_AUTH_CD ;
   private String A208TBM23_USER_ID ;
   private String A18TAM04_DEL_FLG ;
   private String A17TAM04_AUTH_CD ;
   private String A558TBT02_LOCK_USER_ID ;
   private String A559TBT02_LOCK_AUTH_CD ;
   private String AV10P_CRF ;
   private String A556TBT02_LOCK_FLG ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A300TBT02_UPD_USER_ID ;
   private String A301TBT02_UPD_PROG_NM ;
   private String AV31W_LOCK_FLG ;
   private String AV33W_INPUT_END_FLG ;
   private String AV34W_LOCK_USER_ID ;
   private String A500TBT13_CRF_ITEM_GRP_DIV ;
   private String A501TBT13_CRF_ITEM_GRP_CD ;
   private String A502TBT13_CRF_VALUE ;
   private String A588TBT13_EDIT_FLG ;
   private String A503TBT13_DEL_FLG ;
   private String A505TBT13_CRT_USER_ID ;
   private String A506TBT13_CRT_PROG_NM ;
   private String A508TBT13_UPD_USER_ID ;
   private String A509TBT13_UPD_PROG_NM ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String A587TBT12_EDIT_FLG ;
   private String A328TBT12_DEL_FLG ;
   private String A322TBT12_CRT_USER_ID ;
   private String A323TBT12_CRT_PROG_NM ;
   private String A325TBT12_UPD_USER_ID ;
   private String A326TBT12_UPD_PROG_NM ;
   private String AV12P_PWD ;
   private String AV25W_MSG ;
   private com.genexus.internet.HttpRequest AV23W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private String[] P004N2_A209TBM23_DEL_FLG ;
   private boolean[] P004N2_n209TBM23_DEL_FLG ;
   private String[] P004N2_A407TBM23_STYDY_AUTH_CD ;
   private String[] P004N2_A208TBM23_USER_ID ;
   private long[] P004N2_A207TBM23_STUDY_ID ;
   private String[] P004N3_A18TAM04_DEL_FLG ;
   private boolean[] P004N3_n18TAM04_DEL_FLG ;
   private String[] P004N3_A17TAM04_AUTH_CD ;
   private byte[] P004N3_A601TAM04_AUTH_LVL ;
   private boolean[] P004N3_n601TAM04_AUTH_LVL ;
   private short[] P004N4_A294TBT02_CRF_ID ;
   private int[] P004N4_A293TBT02_SUBJECT_ID ;
   private long[] P004N4_A292TBT02_STUDY_ID ;
   private short[] P004N4_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] P004N4_n370TBT02_CRF_LATEST_VERSION ;
   private String[] P004N4_A556TBT02_LOCK_FLG ;
   private boolean[] P004N4_n556TBT02_LOCK_FLG ;
   private byte[] P004N4_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P004N4_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] P004N4_A569TBT02_INPUT_END_FLG ;
   private boolean[] P004N4_n569TBT02_INPUT_END_FLG ;
   private String[] P004N4_A558TBT02_LOCK_USER_ID ;
   private boolean[] P004N4_n558TBT02_LOCK_USER_ID ;
   private java.util.Date[] P004N4_A557TBT02_LOCK_DATETIME ;
   private boolean[] P004N4_n557TBT02_LOCK_DATETIME ;
   private String[] P004N4_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] P004N4_n559TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] P004N4_A299TBT02_UPD_DATETIME ;
   private boolean[] P004N4_n299TBT02_UPD_DATETIME ;
   private String[] P004N4_A300TBT02_UPD_USER_ID ;
   private boolean[] P004N4_n300TBT02_UPD_USER_ID ;
   private String[] P004N4_A301TBT02_UPD_PROG_NM ;
   private boolean[] P004N4_n301TBT02_UPD_PROG_NM ;
   private long[] P004N4_A302TBT02_UPD_CNT ;
   private boolean[] P004N4_n302TBT02_UPD_CNT ;
   private long[] P004N8_A496TBT13_STUDY_ID ;
   private int[] P004N8_A497TBT13_SUBJECT_ID ;
   private short[] P004N8_A498TBT13_CRF_ID ;
   private String[] P004N8_A500TBT13_CRF_ITEM_GRP_DIV ;
   private String[] P004N8_A501TBT13_CRF_ITEM_GRP_CD ;
   private String[] P004N8_A502TBT13_CRF_VALUE ;
   private boolean[] P004N8_n502TBT13_CRF_VALUE ;
   private String[] P004N8_A588TBT13_EDIT_FLG ;
   private boolean[] P004N8_n588TBT13_EDIT_FLG ;
   private String[] P004N8_A503TBT13_DEL_FLG ;
   private boolean[] P004N8_n503TBT13_DEL_FLG ;
   private java.util.Date[] P004N8_A504TBT13_CRT_DATETIME ;
   private boolean[] P004N8_n504TBT13_CRT_DATETIME ;
   private String[] P004N8_A505TBT13_CRT_USER_ID ;
   private boolean[] P004N8_n505TBT13_CRT_USER_ID ;
   private String[] P004N8_A506TBT13_CRT_PROG_NM ;
   private boolean[] P004N8_n506TBT13_CRT_PROG_NM ;
   private java.util.Date[] P004N8_A507TBT13_UPD_DATETIME ;
   private boolean[] P004N8_n507TBT13_UPD_DATETIME ;
   private String[] P004N8_A508TBT13_UPD_USER_ID ;
   private boolean[] P004N8_n508TBT13_UPD_USER_ID ;
   private String[] P004N8_A509TBT13_UPD_PROG_NM ;
   private boolean[] P004N8_n509TBT13_UPD_PROG_NM ;
   private long[] P004N8_A510TBT13_UPD_CNT ;
   private boolean[] P004N8_n510TBT13_UPD_CNT ;
   private short[] P004N8_A499TBT13_CRF_VERSION ;
   private com.genexus.internet.HttpResponse AV24W_HTTP_RES ;
   private GxObjectCollection AV18W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV17W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private SdtB808_SD01_EXTRA_INFO AV22W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV27W_PARMS_ITEM ;
}

final  class ab506_pc03_update_crf_lock__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004N2", "SELECT `TBM23_DEL_FLG`, `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID` FROM `TBM23_STUDY_STAFF` WHERE (`TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ? and `TBM23_STYDY_AUTH_CD` = ?) AND (`TBM23_DEL_FLG` = '0') ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004N3", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_AUTH_LVL` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` = ?) AND (`TAM04_DEL_FLG` = '0') ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004N4", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_CRF_LATEST_VERSION`, `TBT02_LOCK_FLG`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_INPUT_END_FLG`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_PROG_NM`, `TBT02_UPD_CNT` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P004N5", "UPDATE `TBT02_CRF` SET `TBT02_LOCK_FLG`=?, `TBT02_LOCK_USER_ID`=?, `TBT02_LOCK_DATETIME`=?, `TBT02_LOCK_AUTH_CD`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?, `TBT02_UPD_CNT`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P004N6", "UPDATE `TBT02_CRF` SET `TBT02_LOCK_FLG`=?, `TBT02_LOCK_USER_ID`=?, `TBT02_LOCK_DATETIME`=?, `TBT02_LOCK_AUTH_CD`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?, `TBT02_UPD_CNT`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P004N7", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P004N8", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_PROG_NM`, `TBT13_UPD_CNT`, `TBT13_CRF_VERSION` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_VERSION` = ? ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new UpdateCursor("P004N9", "INSERT INTO `TBT12_CRF_RESULT` (`TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_PROG_NM`, `TBT12_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((byte[]) buf[3])[0] = rslt.getByte(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(16) ;
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
               stmt.setVarchar(2, (String)parms[1], 128);
               stmt.setVarchar(3, (String)parms[2], 2);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
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
                  stmt.setVarchar(4, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 128);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setShort(11, ((Number) parms[18]).shortValue());
               break;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
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
                  stmt.setVarchar(4, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 128);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setShort(11, ((Number) parms[18]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 1, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[6], 2000);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[20], 128);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[22], 40);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(15, ((Number) parms[24]).longValue());
               }
               break;
      }
   }

}

