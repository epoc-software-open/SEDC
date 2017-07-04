/*
               File: ab719_pc02_edit_memo_csv_impl
        Description: 作成メモCSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:28.18
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab719_pc02_edit_memo_csv_impl extends GXWebProcedure
{
   public ab719_pc02_edit_memo_csv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( ( GxWebError == 0 ) && ! ( httpContext.isAjaxCallMode( ) || httpContext.isFullAjaxMode( ) ) )
      {
         GXKey = context.getSiteKey( ) ;
         GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
         if ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 )
         {
            httpContext.setQueryString( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6)) ;
         }
         else
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
         }
      }
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV9P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV23P_AUTH_CD = httpContext.GetNextPar( ) ;
            AV22W_MSG = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B719" ;
      /* Execute user subroutine: S11192 */
      S11192 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22W_MSG = "" ;
      AV17W_CSV_SDEL = "\"" ;
      AV15W_CSV_FDEL = "," ;
      AV16W_CSV_KAK = ".CSV" ;
      AV13W_CSV_CNT = 0 ;
      GXt_char1 = AV20W_FILE_NAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      ab719_pc02_edit_memo_csv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20W_FILE_NAME = AV10W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + "_" + AV8C_TAM02_APP_ID + "_" + GXt_char1 + AV16W_CSV_KAK ;
      AV11W_A812_SD01_CSV_OUTPUT.clear();
      AV12W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("試験ID", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("試験名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("登録日時", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("メモ区分", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("患者ID", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("CRFID", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("CRF名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("CRF項目名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("メモ内容", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("連絡先施設名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("連絡先権限名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("確認", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("確認者", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("確認コメント", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("完了", 0);
      AV11W_A812_SD01_CSV_OUTPUT.add(AV12W_A812_SD01_CSV_OUTPUT_ITEM, 0);
      /* Using cursor P006R2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), AV23P_AUTH_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A925TBT15_MEMO_NO = P006R2_A925TBT15_MEMO_NO[0] ;
         A345TBT15_STUDY_ID = P006R2_A345TBT15_STUDY_ID[0] ;
         A930TBT14_CRT_AUTH_CD = P006R2_A930TBT14_CRT_AUTH_CD[0] ;
         n930TBT14_CRT_AUTH_CD = P006R2_n930TBT14_CRT_AUTH_CD[0] ;
         A337TBT14_DEL_FLG = P006R2_A337TBT14_DEL_FLG[0] ;
         n337TBT14_DEL_FLG = P006R2_n337TBT14_DEL_FLG[0] ;
         A351TBT15_DEL_FLG = P006R2_A351TBT15_DEL_FLG[0] ;
         n351TBT15_DEL_FLG = P006R2_n351TBT15_DEL_FLG[0] ;
         A931TBT14_KAKUNIN_USER_ID = P006R2_A931TBT14_KAKUNIN_USER_ID[0] ;
         n931TBT14_KAKUNIN_USER_ID = P006R2_n931TBT14_KAKUNIN_USER_ID[0] ;
         A929TBT14_REQUEST_AUTH_CD = P006R2_A929TBT14_REQUEST_AUTH_CD[0] ;
         n929TBT14_REQUEST_AUTH_CD = P006R2_n929TBT14_REQUEST_AUTH_CD[0] ;
         A928TBT14_REQUEST_SITE_ID = P006R2_A928TBT14_REQUEST_SITE_ID[0] ;
         n928TBT14_REQUEST_SITE_ID = P006R2_n928TBT14_REQUEST_SITE_ID[0] ;
         A926TBT15_CRF_ITEM_GRP_CD = P006R2_A926TBT15_CRF_ITEM_GRP_CD[0] ;
         n926TBT15_CRF_ITEM_GRP_CD = P006R2_n926TBT15_CRF_ITEM_GRP_CD[0] ;
         A347TBT15_CRF_ID = P006R2_A347TBT15_CRF_ID[0] ;
         n347TBT15_CRF_ID = P006R2_n347TBT15_CRF_ID[0] ;
         A923TBT14_MEMO_KBN = P006R2_A923TBT14_MEMO_KBN[0] ;
         n923TBT14_MEMO_KBN = P006R2_n923TBT14_MEMO_KBN[0] ;
         A346TBT15_SUBJECT_ID = P006R2_A346TBT15_SUBJECT_ID[0] ;
         A335TBT14_MEMO = P006R2_A335TBT14_MEMO[0] ;
         n335TBT14_MEMO = P006R2_n335TBT14_MEMO[0] ;
         A927TBT14_KAKUNIN_FLG = P006R2_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P006R2_n927TBT14_KAKUNIN_FLG[0] ;
         A933TBT14_KAKUNIN_COMMENT = P006R2_A933TBT14_KAKUNIN_COMMENT[0] ;
         n933TBT14_KAKUNIN_COMMENT = P006R2_n933TBT14_KAKUNIN_COMMENT[0] ;
         A924TBT14_KANRYO_FLG = P006R2_A924TBT14_KANRYO_FLG[0] ;
         n924TBT14_KANRYO_FLG = P006R2_n924TBT14_KANRYO_FLG[0] ;
         A338TBT14_CRT_DATETIME = P006R2_A338TBT14_CRT_DATETIME[0] ;
         n338TBT14_CRT_DATETIME = P006R2_n338TBT14_CRT_DATETIME[0] ;
         A930TBT14_CRT_AUTH_CD = P006R2_A930TBT14_CRT_AUTH_CD[0] ;
         n930TBT14_CRT_AUTH_CD = P006R2_n930TBT14_CRT_AUTH_CD[0] ;
         A337TBT14_DEL_FLG = P006R2_A337TBT14_DEL_FLG[0] ;
         n337TBT14_DEL_FLG = P006R2_n337TBT14_DEL_FLG[0] ;
         A931TBT14_KAKUNIN_USER_ID = P006R2_A931TBT14_KAKUNIN_USER_ID[0] ;
         n931TBT14_KAKUNIN_USER_ID = P006R2_n931TBT14_KAKUNIN_USER_ID[0] ;
         A929TBT14_REQUEST_AUTH_CD = P006R2_A929TBT14_REQUEST_AUTH_CD[0] ;
         n929TBT14_REQUEST_AUTH_CD = P006R2_n929TBT14_REQUEST_AUTH_CD[0] ;
         A928TBT14_REQUEST_SITE_ID = P006R2_A928TBT14_REQUEST_SITE_ID[0] ;
         n928TBT14_REQUEST_SITE_ID = P006R2_n928TBT14_REQUEST_SITE_ID[0] ;
         A923TBT14_MEMO_KBN = P006R2_A923TBT14_MEMO_KBN[0] ;
         n923TBT14_MEMO_KBN = P006R2_n923TBT14_MEMO_KBN[0] ;
         A335TBT14_MEMO = P006R2_A335TBT14_MEMO[0] ;
         n335TBT14_MEMO = P006R2_n335TBT14_MEMO[0] ;
         A927TBT14_KAKUNIN_FLG = P006R2_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P006R2_n927TBT14_KAKUNIN_FLG[0] ;
         A933TBT14_KAKUNIN_COMMENT = P006R2_A933TBT14_KAKUNIN_COMMENT[0] ;
         n933TBT14_KAKUNIN_COMMENT = P006R2_n933TBT14_KAKUNIN_COMMENT[0] ;
         A924TBT14_KANRYO_FLG = P006R2_A924TBT14_KANRYO_FLG[0] ;
         n924TBT14_KANRYO_FLG = P006R2_n924TBT14_KANRYO_FLG[0] ;
         A338TBT14_CRT_DATETIME = P006R2_A338TBT14_CRT_DATETIME[0] ;
         n338TBT14_CRT_DATETIME = P006R2_n338TBT14_CRT_DATETIME[0] ;
         AV13W_CSV_CNT = (long)(AV13W_CSV_CNT+1) ;
         AV12W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)), 0);
         /* Using cursor P006R3 */
         pr_default.execute(1, new Object[] {new Long(AV9P_STUDY_ID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A186TBM21_STUDY_ID = P006R3_A186TBM21_STUDY_ID[0] ;
            A187TBM21_STUDY_NM = P006R3_A187TBM21_STUDY_NM[0] ;
            n187TBM21_STUDY_NM = P006R3_n187TBM21_STUDY_NM[0] ;
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A187TBM21_STUDY_NM, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A338TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         if ( GXutil.strcmp(A923TBT14_MEMO_KBN, "1") == 0 )
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("個人メモ", 0);
         }
         else
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("連絡メモ", 0);
         }
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)), 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A347TBT15_CRF_ID, 4, 0)), 0);
         /* Using cursor P006R4 */
         pr_default.execute(2, new Object[] {new Long(AV9P_STUDY_ID), new Boolean(n347TBT15_CRF_ID), new Short(A347TBT15_CRF_ID)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A218TBM31_CRF_ID = P006R4_A218TBM31_CRF_ID[0] ;
            A217TBM31_STUDY_ID = P006R4_A217TBM31_STUDY_ID[0] ;
            A550TBM31_CRF_SNM = P006R4_A550TBM31_CRF_SNM[0] ;
            n550TBM31_CRF_SNM = P006R4_n550TBM31_CRF_SNM[0] ;
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A550TBM31_CRF_SNM, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         /* Using cursor P006R5 */
         pr_default.execute(3, new Object[] {new Long(AV9P_STUDY_ID), new Boolean(n347TBT15_CRF_ID), new Short(A347TBT15_CRF_ID), new Boolean(n926TBT15_CRF_ITEM_GRP_CD), A926TBT15_CRF_ITEM_GRP_CD});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A232TBM32_CRF_ID = P006R5_A232TBM32_CRF_ID[0] ;
            A233TBM32_CRF_ITEM_CD = P006R5_A233TBM32_CRF_ITEM_CD[0] ;
            A231TBM32_STUDY_ID = P006R5_A231TBM32_STUDY_ID[0] ;
            A234TBM32_CRF_ITEM_NM = P006R5_A234TBM32_CRF_ITEM_NM[0] ;
            n234TBM32_CRF_ITEM_NM = P006R5_n234TBM32_CRF_ITEM_NM[0] ;
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A234TBM32_CRF_ITEM_NM, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A335TBT14_MEMO, 0);
         if ( GXutil.strcmp(A923TBT14_MEMO_KBN, "1") == 0 )
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
         }
         else
         {
            AV30GXLvl123 = (byte)(0) ;
            /* Using cursor P006R6 */
            pr_default.execute(4, new Object[] {new Boolean(n928TBT14_REQUEST_SITE_ID), A928TBT14_REQUEST_SITE_ID});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A132TAM08_SITE_ID = P006R6_A132TAM08_SITE_ID[0] ;
               A134TAM08_SITE_SNM = P006R6_A134TAM08_SITE_SNM[0] ;
               n134TAM08_SITE_SNM = P006R6_n134TAM08_SITE_SNM[0] ;
               AV30GXLvl123 = (byte)(1) ;
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A134TAM08_SITE_SNM, 0);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            if ( AV30GXLvl123 == 0 )
            {
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            }
            if ( GXutil.strcmp(A929TBT14_REQUEST_AUTH_CD, "XX") == 0 )
            {
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("全員", 0);
            }
            else
            {
               AV31GXLvl135 = (byte)(0) ;
               /* Using cursor P006R7 */
               pr_default.execute(5, new Object[] {new Boolean(n929TBT14_REQUEST_AUTH_CD), A929TBT14_REQUEST_AUTH_CD});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A17TAM04_AUTH_CD = P006R7_A17TAM04_AUTH_CD[0] ;
                  A98TAM04_AUTH_NM = P006R7_A98TAM04_AUTH_NM[0] ;
                  n98TAM04_AUTH_NM = P006R7_n98TAM04_AUTH_NM[0] ;
                  AV31GXLvl135 = (byte)(1) ;
                  AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A98TAM04_AUTH_NM, 0);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(5);
               if ( AV31GXLvl135 == 0 )
               {
                  AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
               }
            }
            if ( GXutil.strcmp(A927TBT14_KAKUNIN_FLG, "1") == 0 )
            {
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("済", 0);
            }
            else
            {
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("未", 0);
            }
            AV32GXLvl150 = (byte)(0) ;
            /* Using cursor P006R8 */
            pr_default.execute(6, new Object[] {new Boolean(n931TBT14_KAKUNIN_USER_ID), A931TBT14_KAKUNIN_USER_ID});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A8TAM07_USER_ID = P006R8_A8TAM07_USER_ID[0] ;
               A2TAM07_USER_NM = P006R8_A2TAM07_USER_NM[0] ;
               n2TAM07_USER_NM = P006R8_n2TAM07_USER_NM[0] ;
               AV32GXLvl150 = (byte)(1) ;
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A2TAM07_USER_NM, 0);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
            if ( AV32GXLvl150 == 0 )
            {
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            }
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A933TBT14_KAKUNIN_COMMENT, 0);
         }
         if ( GXutil.strcmp(A924TBT14_KANRYO_FLG, "1") == 0 )
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("済", 0);
         }
         else
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("未", 0);
         }
         AV11W_A812_SD01_CSV_OUTPUT.add(AV12W_A812_SD01_CSV_OUTPUT_ITEM, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13W_CSV_CNT > 0 )
      {
         /* Execute user subroutine: S12210 */
         S12210 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S13230 */
         S13230 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         GXt_char1 = AV22W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         ab719_pc02_edit_memo_csv_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22W_MSG = GXt_char1 ;
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S11192( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV10W_A_LOGIN_SDT;
      GXv_char2[0] = AV19W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV10W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab719_pc02_edit_memo_csv_impl.this.AV19W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV19W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S12210( )
   {
      /* 'SUB_CSV_OUTPUT' Routine */
      GXv_char2[0] = AV21W_FILE_PATH ;
      GXv_char4[0] = AV22W_MSG ;
      new a812_pc03_csv_output_utf8b(remoteHandle, context).execute( AV10W_A_LOGIN_SDT, "", AV11W_A812_SD01_CSV_OUTPUT, AV20W_FILE_NAME, GXv_char2, GXv_char4) ;
      ab719_pc02_edit_memo_csv_impl.this.AV21W_FILE_PATH = GXv_char2[0] ;
      ab719_pc02_edit_memo_csv_impl.this.AV22W_MSG = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV22W_MSG)==0) )
      {
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S13230( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXt_char1 = AV18W_DOWNLOAD_NM ;
      GXv_char4[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char4) ;
      ab719_pc02_edit_memo_csv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18W_DOWNLOAD_NM = "作成メモ" + GXt_char1 + AV16W_CSV_KAK ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV21W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV20W_FILE_NAME)) + "," + GXutil.URLEncode(GXutil.rtrim(AV18W_DOWNLOAD_NM)) ;
      httpContext.wjLoc = formatLink("aa811_pc02_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S14243( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV33Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
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
                  /* Execute user subroutine: S14243 */
                  S14243 ();
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
      GXDecQS = "" ;
      gxfirstwebparm = "" ;
      AV23P_AUTH_CD = "" ;
      AV22W_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV17W_CSV_SDEL = "" ;
      AV15W_CSV_FDEL = "" ;
      AV16W_CSV_KAK = "" ;
      AV20W_FILE_NAME = "" ;
      AV10W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV11W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      scmdbuf = "" ;
      P006R2_A925TBT15_MEMO_NO = new short[1] ;
      P006R2_A345TBT15_STUDY_ID = new long[1] ;
      P006R2_A930TBT14_CRT_AUTH_CD = new String[] {""} ;
      P006R2_n930TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      P006R2_A337TBT14_DEL_FLG = new String[] {""} ;
      P006R2_n337TBT14_DEL_FLG = new boolean[] {false} ;
      P006R2_A351TBT15_DEL_FLG = new String[] {""} ;
      P006R2_n351TBT15_DEL_FLG = new boolean[] {false} ;
      P006R2_A931TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      P006R2_n931TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      P006R2_A929TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      P006R2_n929TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      P006R2_A928TBT14_REQUEST_SITE_ID = new String[] {""} ;
      P006R2_n928TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      P006R2_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      P006R2_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P006R2_A347TBT15_CRF_ID = new short[1] ;
      P006R2_n347TBT15_CRF_ID = new boolean[] {false} ;
      P006R2_A923TBT14_MEMO_KBN = new String[] {""} ;
      P006R2_n923TBT14_MEMO_KBN = new boolean[] {false} ;
      P006R2_A346TBT15_SUBJECT_ID = new int[1] ;
      P006R2_A335TBT14_MEMO = new String[] {""} ;
      P006R2_n335TBT14_MEMO = new boolean[] {false} ;
      P006R2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      P006R2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      P006R2_A933TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      P006R2_n933TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      P006R2_A924TBT14_KANRYO_FLG = new String[] {""} ;
      P006R2_n924TBT14_KANRYO_FLG = new boolean[] {false} ;
      P006R2_A338TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P006R2_n338TBT14_CRT_DATETIME = new boolean[] {false} ;
      A930TBT14_CRT_AUTH_CD = "" ;
      A337TBT14_DEL_FLG = "" ;
      A351TBT15_DEL_FLG = "" ;
      A931TBT14_KAKUNIN_USER_ID = "" ;
      A929TBT14_REQUEST_AUTH_CD = "" ;
      A928TBT14_REQUEST_SITE_ID = "" ;
      A926TBT15_CRF_ITEM_GRP_CD = "" ;
      A923TBT14_MEMO_KBN = "" ;
      A335TBT14_MEMO = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A933TBT14_KAKUNIN_COMMENT = "" ;
      A924TBT14_KANRYO_FLG = "" ;
      A338TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P006R3_A186TBM21_STUDY_ID = new long[1] ;
      P006R3_A187TBM21_STUDY_NM = new String[] {""} ;
      P006R3_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      P006R4_A218TBM31_CRF_ID = new short[1] ;
      P006R4_A217TBM31_STUDY_ID = new long[1] ;
      P006R4_A550TBM31_CRF_SNM = new String[] {""} ;
      P006R4_n550TBM31_CRF_SNM = new boolean[] {false} ;
      A550TBM31_CRF_SNM = "" ;
      P006R5_A232TBM32_CRF_ID = new short[1] ;
      P006R5_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P006R5_A231TBM32_STUDY_ID = new long[1] ;
      P006R5_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      P006R5_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A234TBM32_CRF_ITEM_NM = "" ;
      P006R6_A132TAM08_SITE_ID = new String[] {""} ;
      P006R6_A134TAM08_SITE_SNM = new String[] {""} ;
      P006R6_n134TAM08_SITE_SNM = new boolean[] {false} ;
      A132TAM08_SITE_ID = "" ;
      A134TAM08_SITE_SNM = "" ;
      P006R7_A17TAM04_AUTH_CD = new String[] {""} ;
      P006R7_A98TAM04_AUTH_NM = new String[] {""} ;
      P006R7_n98TAM04_AUTH_NM = new boolean[] {false} ;
      A17TAM04_AUTH_CD = "" ;
      A98TAM04_AUTH_NM = "" ;
      P006R8_A8TAM07_USER_ID = new String[] {""} ;
      P006R8_A2TAM07_USER_NM = new String[] {""} ;
      P006R8_n2TAM07_USER_NM = new boolean[] {false} ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV19W_ERRCD = "" ;
      GXEncryptionTmp = "" ;
      AV21W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      AV18W_DOWNLOAD_NM = "" ;
      GXv_char4 = new String [1] ;
      AV33Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab719_pc02_edit_memo_csv__default(),
         new Object[] {
             new Object[] {
            P006R2_A925TBT15_MEMO_NO, P006R2_A345TBT15_STUDY_ID, P006R2_A930TBT14_CRT_AUTH_CD, P006R2_n930TBT14_CRT_AUTH_CD, P006R2_A337TBT14_DEL_FLG, P006R2_n337TBT14_DEL_FLG, P006R2_A351TBT15_DEL_FLG, P006R2_n351TBT15_DEL_FLG, P006R2_A931TBT14_KAKUNIN_USER_ID, P006R2_n931TBT14_KAKUNIN_USER_ID,
            P006R2_A929TBT14_REQUEST_AUTH_CD, P006R2_n929TBT14_REQUEST_AUTH_CD, P006R2_A928TBT14_REQUEST_SITE_ID, P006R2_n928TBT14_REQUEST_SITE_ID, P006R2_A926TBT15_CRF_ITEM_GRP_CD, P006R2_n926TBT15_CRF_ITEM_GRP_CD, P006R2_A347TBT15_CRF_ID, P006R2_n347TBT15_CRF_ID, P006R2_A923TBT14_MEMO_KBN, P006R2_n923TBT14_MEMO_KBN,
            P006R2_A346TBT15_SUBJECT_ID, P006R2_A335TBT14_MEMO, P006R2_n335TBT14_MEMO, P006R2_A927TBT14_KAKUNIN_FLG, P006R2_n927TBT14_KAKUNIN_FLG, P006R2_A933TBT14_KAKUNIN_COMMENT, P006R2_n933TBT14_KAKUNIN_COMMENT, P006R2_A924TBT14_KANRYO_FLG, P006R2_n924TBT14_KANRYO_FLG, P006R2_A338TBT14_CRT_DATETIME,
            P006R2_n338TBT14_CRT_DATETIME
            }
            , new Object[] {
            P006R3_A186TBM21_STUDY_ID, P006R3_A187TBM21_STUDY_NM, P006R3_n187TBM21_STUDY_NM
            }
            , new Object[] {
            P006R4_A218TBM31_CRF_ID, P006R4_A217TBM31_STUDY_ID, P006R4_A550TBM31_CRF_SNM, P006R4_n550TBM31_CRF_SNM
            }
            , new Object[] {
            P006R5_A232TBM32_CRF_ID, P006R5_A233TBM32_CRF_ITEM_CD, P006R5_A231TBM32_STUDY_ID, P006R5_A234TBM32_CRF_ITEM_NM, P006R5_n234TBM32_CRF_ITEM_NM
            }
            , new Object[] {
            P006R6_A132TAM08_SITE_ID, P006R6_A134TAM08_SITE_SNM, P006R6_n134TAM08_SITE_SNM
            }
            , new Object[] {
            P006R7_A17TAM04_AUTH_CD, P006R7_A98TAM04_AUTH_NM, P006R7_n98TAM04_AUTH_NM
            }
            , new Object[] {
            P006R8_A8TAM07_USER_ID, P006R8_A2TAM07_USER_NM, P006R8_n2TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV33Pgmname = "AB719_PC02_EDIT_MEMO_CSV" ;
      /* GeneXus formulas. */
      AV33Pgmname = "AB719_PC02_EDIT_MEMO_CSV" ;
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private byte AV30GXLvl123 ;
   private byte AV31GXLvl135 ;
   private byte AV32GXLvl150 ;
   private short A925TBT15_MEMO_NO ;
   private short A347TBT15_CRF_ID ;
   private short A218TBM31_CRF_ID ;
   private short A232TBM32_CRF_ID ;
   private short Gx_err ;
   private int A346TBT15_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long AV13W_CSV_CNT ;
   private long A345TBT15_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private String GXKey ;
   private String GXDecQS ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV33Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date A338TBT14_CRT_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n930TBT14_CRT_AUTH_CD ;
   private boolean n337TBT14_DEL_FLG ;
   private boolean n351TBT15_DEL_FLG ;
   private boolean n931TBT14_KAKUNIN_USER_ID ;
   private boolean n929TBT14_REQUEST_AUTH_CD ;
   private boolean n928TBT14_REQUEST_SITE_ID ;
   private boolean n926TBT15_CRF_ITEM_GRP_CD ;
   private boolean n347TBT15_CRF_ID ;
   private boolean n923TBT14_MEMO_KBN ;
   private boolean n335TBT14_MEMO ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n933TBT14_KAKUNIN_COMMENT ;
   private boolean n924TBT14_KANRYO_FLG ;
   private boolean n338TBT14_CRT_DATETIME ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n234TBM32_CRF_ITEM_NM ;
   private boolean n134TAM08_SITE_SNM ;
   private boolean n98TAM04_AUTH_NM ;
   private boolean n2TAM07_USER_NM ;
   private String AV23P_AUTH_CD ;
   private String AV22W_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV17W_CSV_SDEL ;
   private String AV15W_CSV_FDEL ;
   private String AV16W_CSV_KAK ;
   private String AV20W_FILE_NAME ;
   private String A930TBT14_CRT_AUTH_CD ;
   private String A337TBT14_DEL_FLG ;
   private String A351TBT15_DEL_FLG ;
   private String A931TBT14_KAKUNIN_USER_ID ;
   private String A929TBT14_REQUEST_AUTH_CD ;
   private String A928TBT14_REQUEST_SITE_ID ;
   private String A926TBT15_CRF_ITEM_GRP_CD ;
   private String A923TBT14_MEMO_KBN ;
   private String A335TBT14_MEMO ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A933TBT14_KAKUNIN_COMMENT ;
   private String A924TBT14_KANRYO_FLG ;
   private String A187TBM21_STUDY_NM ;
   private String A550TBM31_CRF_SNM ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A234TBM32_CRF_ITEM_NM ;
   private String A132TAM08_SITE_ID ;
   private String A134TAM08_SITE_SNM ;
   private String A17TAM04_AUTH_CD ;
   private String A98TAM04_AUTH_NM ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String AV19W_ERRCD ;
   private String AV21W_FILE_PATH ;
   private String AV18W_DOWNLOAD_NM ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private short[] P006R2_A925TBT15_MEMO_NO ;
   private long[] P006R2_A345TBT15_STUDY_ID ;
   private String[] P006R2_A930TBT14_CRT_AUTH_CD ;
   private boolean[] P006R2_n930TBT14_CRT_AUTH_CD ;
   private String[] P006R2_A337TBT14_DEL_FLG ;
   private boolean[] P006R2_n337TBT14_DEL_FLG ;
   private String[] P006R2_A351TBT15_DEL_FLG ;
   private boolean[] P006R2_n351TBT15_DEL_FLG ;
   private String[] P006R2_A931TBT14_KAKUNIN_USER_ID ;
   private boolean[] P006R2_n931TBT14_KAKUNIN_USER_ID ;
   private String[] P006R2_A929TBT14_REQUEST_AUTH_CD ;
   private boolean[] P006R2_n929TBT14_REQUEST_AUTH_CD ;
   private String[] P006R2_A928TBT14_REQUEST_SITE_ID ;
   private boolean[] P006R2_n928TBT14_REQUEST_SITE_ID ;
   private String[] P006R2_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] P006R2_n926TBT15_CRF_ITEM_GRP_CD ;
   private short[] P006R2_A347TBT15_CRF_ID ;
   private boolean[] P006R2_n347TBT15_CRF_ID ;
   private String[] P006R2_A923TBT14_MEMO_KBN ;
   private boolean[] P006R2_n923TBT14_MEMO_KBN ;
   private int[] P006R2_A346TBT15_SUBJECT_ID ;
   private String[] P006R2_A335TBT14_MEMO ;
   private boolean[] P006R2_n335TBT14_MEMO ;
   private String[] P006R2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] P006R2_n927TBT14_KAKUNIN_FLG ;
   private String[] P006R2_A933TBT14_KAKUNIN_COMMENT ;
   private boolean[] P006R2_n933TBT14_KAKUNIN_COMMENT ;
   private String[] P006R2_A924TBT14_KANRYO_FLG ;
   private boolean[] P006R2_n924TBT14_KANRYO_FLG ;
   private java.util.Date[] P006R2_A338TBT14_CRT_DATETIME ;
   private boolean[] P006R2_n338TBT14_CRT_DATETIME ;
   private long[] P006R3_A186TBM21_STUDY_ID ;
   private String[] P006R3_A187TBM21_STUDY_NM ;
   private boolean[] P006R3_n187TBM21_STUDY_NM ;
   private short[] P006R4_A218TBM31_CRF_ID ;
   private long[] P006R4_A217TBM31_STUDY_ID ;
   private String[] P006R4_A550TBM31_CRF_SNM ;
   private boolean[] P006R4_n550TBM31_CRF_SNM ;
   private short[] P006R5_A232TBM32_CRF_ID ;
   private String[] P006R5_A233TBM32_CRF_ITEM_CD ;
   private long[] P006R5_A231TBM32_STUDY_ID ;
   private String[] P006R5_A234TBM32_CRF_ITEM_NM ;
   private boolean[] P006R5_n234TBM32_CRF_ITEM_NM ;
   private String[] P006R6_A132TAM08_SITE_ID ;
   private String[] P006R6_A134TAM08_SITE_SNM ;
   private boolean[] P006R6_n134TAM08_SITE_SNM ;
   private String[] P006R7_A17TAM04_AUTH_CD ;
   private String[] P006R7_A98TAM04_AUTH_NM ;
   private boolean[] P006R7_n98TAM04_AUTH_NM ;
   private String[] P006R8_A8TAM07_USER_ID ;
   private String[] P006R8_A2TAM07_USER_NM ;
   private boolean[] P006R8_n2TAM07_USER_NM ;
   private GxObjectCollection AV11W_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV12W_A812_SD01_CSV_OUTPUT_ITEM ;
}

final  class ab719_pc02_edit_memo_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006R2", "SELECT T1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO, T1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, T2.`TBT14_CRT_AUTH_CD`, T2.`TBT14_DEL_FLG`, T1.`TBT15_DEL_FLG`, T2.`TBT14_KAKUNIN_USER_ID`, T2.`TBT14_REQUEST_AUTH_CD`, T2.`TBT14_REQUEST_SITE_ID`, T1.`TBT15_CRF_ITEM_GRP_CD`, T1.`TBT15_CRF_ID`, T2.`TBT14_MEMO_KBN`, T1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, T2.`TBT14_MEMO`, T2.`TBT14_KAKUNIN_FLG`, T2.`TBT14_KAKUNIN_COMMENT`, T2.`TBT14_KANRYO_FLG`, T2.`TBT14_CRT_DATETIME` FROM (`TBT15_CRF_MEMO_LOC` T1 INNER JOIN `TBT14_CRF_MEMO` T2 ON T2.`TBT14_STUDY_ID` = T1.`TBT15_STUDY_ID` AND T2.`TBT14_SUBJECT_ID` = T1.`TBT15_SUBJECT_ID` AND T2.`TBT14_MEMO_NO` = T1.`TBT15_MEMO_NO`) WHERE (T1.`TBT15_STUDY_ID` = ?) AND (T2.`TBT14_CRT_AUTH_CD` = ?) AND (T2.`TBT14_DEL_FLG` = '0') AND (T1.`TBT15_DEL_FLG` = '0') ORDER BY T2.`TBT14_CRT_DATETIME` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P006R3", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006R4", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006R5", "SELECT `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006R6", "SELECT `TAM08_SITE_ID`, `TAM08_SITE_SNM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006R7", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006R8", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               break;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setVarchar(2, (String)parms[1], 2);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 50);
               }
               break;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20);
               }
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2);
               }
               break;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128);
               }
               break;
      }
   }

}

