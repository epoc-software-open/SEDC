/*
               File: ab719_pc02_edit_memo_csv_impl
        Description: 作成メモCSV出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:29.65
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
      GXKey = context.getSiteKey( ) ;
      if ( GxWebError == 0 )
      {
         GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
         if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "ab719_pc02_edit_memo_csv")), "ab719_pc02_edit_memo_csv") == 0 ) )
         {
            httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "ab719_pc02_edit_memo_csv"))) ;
         }
         else
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
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
      /* Execute user subroutine: S111 */
      S111 ();
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
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("VISIT番号", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("CRF項目名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("メモ内容", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("連絡先施設名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("連絡先権限名", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("確認", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("確認者", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("確認コメント", 0);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("完了", 0);
      AV11W_A812_SD01_CSV_OUTPUT.add(AV12W_A812_SD01_CSV_OUTPUT_ITEM, 0);
      /* Using cursor P006I2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), AV23P_AUTH_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A199TBT15_MEMO_NO = P006I2_A199TBT15_MEMO_NO[0] ;
         A149TBT15_STUDY_ID = P006I2_A149TBT15_STUDY_ID[0] ;
         A931TBT14_CRT_AUTH_CD = P006I2_A931TBT14_CRT_AUTH_CD[0] ;
         n931TBT14_CRT_AUTH_CD = P006I2_n931TBT14_CRT_AUTH_CD[0] ;
         A479TBT14_DEL_FLG = P006I2_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = P006I2_n479TBT14_DEL_FLG[0] ;
         A488TBT15_DEL_FLG = P006I2_A488TBT15_DEL_FLG[0] ;
         n488TBT15_DEL_FLG = P006I2_n488TBT15_DEL_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = P006I2_A928TBT14_KAKUNIN_USER_ID[0] ;
         n928TBT14_KAKUNIN_USER_ID = P006I2_n928TBT14_KAKUNIN_USER_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = P006I2_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = P006I2_n930TBT14_REQUEST_AUTH_CD[0] ;
         A929TBT14_REQUEST_SITE_ID = P006I2_A929TBT14_REQUEST_SITE_ID[0] ;
         n929TBT14_REQUEST_SITE_ID = P006I2_n929TBT14_REQUEST_SITE_ID[0] ;
         A904TBT15_CRF_ITEM_GRP_CD = P006I2_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         n904TBT15_CRF_ITEM_GRP_CD = P006I2_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A942TBT15_CRF_EDA_NO = P006I2_A942TBT15_CRF_EDA_NO[0] ;
         n942TBT15_CRF_EDA_NO = P006I2_n942TBT15_CRF_EDA_NO[0] ;
         A155TBT15_CRF_ID = P006I2_A155TBT15_CRF_ID[0] ;
         n155TBT15_CRF_ID = P006I2_n155TBT15_CRF_ID[0] ;
         A901TBT14_MEMO_KBN = P006I2_A901TBT14_MEMO_KBN[0] ;
         n901TBT14_MEMO_KBN = P006I2_n901TBT14_MEMO_KBN[0] ;
         A151TBT15_SUBJECT_ID = P006I2_A151TBT15_SUBJECT_ID[0] ;
         A477TBT14_MEMO = P006I2_A477TBT14_MEMO[0] ;
         n477TBT14_MEMO = P006I2_n477TBT14_MEMO[0] ;
         A927TBT14_KAKUNIN_FLG = P006I2_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P006I2_n927TBT14_KAKUNIN_FLG[0] ;
         A934TBT14_KAKUNIN_COMMENT = P006I2_A934TBT14_KAKUNIN_COMMENT[0] ;
         n934TBT14_KAKUNIN_COMMENT = P006I2_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = P006I2_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = P006I2_n902TBT14_KANRYO_FLG[0] ;
         A480TBT14_CRT_DATETIME = P006I2_A480TBT14_CRT_DATETIME[0] ;
         n480TBT14_CRT_DATETIME = P006I2_n480TBT14_CRT_DATETIME[0] ;
         A931TBT14_CRT_AUTH_CD = P006I2_A931TBT14_CRT_AUTH_CD[0] ;
         n931TBT14_CRT_AUTH_CD = P006I2_n931TBT14_CRT_AUTH_CD[0] ;
         A479TBT14_DEL_FLG = P006I2_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = P006I2_n479TBT14_DEL_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = P006I2_A928TBT14_KAKUNIN_USER_ID[0] ;
         n928TBT14_KAKUNIN_USER_ID = P006I2_n928TBT14_KAKUNIN_USER_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = P006I2_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = P006I2_n930TBT14_REQUEST_AUTH_CD[0] ;
         A929TBT14_REQUEST_SITE_ID = P006I2_A929TBT14_REQUEST_SITE_ID[0] ;
         n929TBT14_REQUEST_SITE_ID = P006I2_n929TBT14_REQUEST_SITE_ID[0] ;
         A901TBT14_MEMO_KBN = P006I2_A901TBT14_MEMO_KBN[0] ;
         n901TBT14_MEMO_KBN = P006I2_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = P006I2_A477TBT14_MEMO[0] ;
         n477TBT14_MEMO = P006I2_n477TBT14_MEMO[0] ;
         A927TBT14_KAKUNIN_FLG = P006I2_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P006I2_n927TBT14_KAKUNIN_FLG[0] ;
         A934TBT14_KAKUNIN_COMMENT = P006I2_A934TBT14_KAKUNIN_COMMENT[0] ;
         n934TBT14_KAKUNIN_COMMENT = P006I2_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = P006I2_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = P006I2_n902TBT14_KANRYO_FLG[0] ;
         A480TBT14_CRT_DATETIME = P006I2_A480TBT14_CRT_DATETIME[0] ;
         n480TBT14_CRT_DATETIME = P006I2_n480TBT14_CRT_DATETIME[0] ;
         AV13W_CSV_CNT = (long)(AV13W_CSV_CNT+1) ;
         AV12W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)), 0);
         /* Using cursor P006I3 */
         pr_default.execute(1, new Object[] {new Long(AV9P_STUDY_ID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A63TBM21_STUDY_ID = P006I3_A63TBM21_STUDY_ID[0] ;
            A367TBM21_STUDY_NM = P006I3_A367TBM21_STUDY_NM[0] ;
            n367TBM21_STUDY_NM = P006I3_n367TBM21_STUDY_NM[0] ;
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A367TBM21_STUDY_NM, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "), 0);
         if ( GXutil.strcmp(A901TBT14_MEMO_KBN, "1") == 0 )
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("個人メモ", 0);
         }
         else
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("連絡メモ", 0);
         }
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A151TBT15_SUBJECT_ID, 6, 0)), 0);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A155TBT15_CRF_ID, 4, 0)), 0);
         /* Using cursor P006I4 */
         pr_default.execute(2, new Object[] {new Long(AV9P_STUDY_ID), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A69TBM31_CRF_ID = P006I4_A69TBM31_CRF_ID[0] ;
            A68TBM31_STUDY_ID = P006I4_A68TBM31_STUDY_ID[0] ;
            A642TBM31_CRF_SNM = P006I4_A642TBM31_CRF_SNM[0] ;
            n642TBM31_CRF_SNM = P006I4_n642TBM31_CRF_SNM[0] ;
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A642TBM31_CRF_SNM, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV29GXLvl108 = (byte)(0) ;
         /* Using cursor P006I5 */
         pr_default.execute(3, new Object[] {new Long(A149TBT15_STUDY_ID), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID), new Boolean(n942TBT15_CRF_EDA_NO), new Byte(A942TBT15_CRF_EDA_NO)});
         if ( Gx_err != 0 )
         {
            AV29GXLvl108 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(3) != 101) )
         {
            A945TBM44_STUDY_ID = P006I5_A945TBM44_STUDY_ID[0] ;
            A946TBM44_CRF_ID = P006I5_A946TBM44_CRF_ID[0] ;
            A947TBM44_CRF_EDA_NO = P006I5_A947TBM44_CRF_EDA_NO[0] ;
            A948TBM44_VISIT_NO = P006I5_A948TBM44_VISIT_NO[0] ;
            n948TBM44_VISIT_NO = P006I5_n948TBM44_VISIT_NO[0] ;
            AV29GXLvl108 = (byte)(1) ;
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0)), 0);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV29GXLvl108 == 0 )
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
         }
         /* Using cursor P006I6 */
         pr_default.execute(4, new Object[] {new Long(AV9P_STUDY_ID), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID), new Boolean(n904TBT15_CRF_ITEM_GRP_CD), A904TBT15_CRF_ITEM_GRP_CD});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A71TBM32_CRF_ID = P006I6_A71TBM32_CRF_ID[0] ;
            A72TBM32_CRF_ITEM_CD = P006I6_A72TBM32_CRF_ITEM_CD[0] ;
            A70TBM32_STUDY_ID = P006I6_A70TBM32_STUDY_ID[0] ;
            A405TBM32_CRF_ITEM_NM = P006I6_A405TBM32_CRF_ITEM_NM[0] ;
            n405TBM32_CRF_ITEM_NM = P006I6_n405TBM32_CRF_ITEM_NM[0] ;
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A405TBM32_CRF_ITEM_NM, 0);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A477TBT14_MEMO, 0);
         if ( GXutil.strcmp(A901TBT14_MEMO_KBN, "1") == 0 )
         {
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
         }
         else
         {
            AV31GXLvl136 = (byte)(0) ;
            /* Using cursor P006I7 */
            pr_default.execute(5, new Object[] {new Boolean(n929TBT14_REQUEST_SITE_ID), A929TBT14_REQUEST_SITE_ID});
            if ( Gx_err != 0 )
            {
               AV31GXLvl136 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(5) != 101) )
            {
               A57TAM08_SITE_ID = P006I7_A57TAM08_SITE_ID[0] ;
               A320TAM08_SITE_SNM = P006I7_A320TAM08_SITE_SNM[0] ;
               n320TAM08_SITE_SNM = P006I7_n320TAM08_SITE_SNM[0] ;
               AV31GXLvl136 = (byte)(1) ;
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A320TAM08_SITE_SNM, 0);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
            if ( AV31GXLvl136 == 0 )
            {
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            }
            if ( GXutil.strcmp(A930TBT14_REQUEST_AUTH_CD, "XX") == 0 )
            {
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("全員", 0);
            }
            else
            {
               AV32GXLvl148 = (byte)(0) ;
               /* Using cursor P006I8 */
               pr_default.execute(6, new Object[] {new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD});
               if ( Gx_err != 0 )
               {
                  AV32GXLvl148 = (byte)(1) ;
               }
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A13TAM04_AUTH_CD = P006I8_A13TAM04_AUTH_CD[0] ;
                  A285TAM04_AUTH_NM = P006I8_A285TAM04_AUTH_NM[0] ;
                  n285TAM04_AUTH_NM = P006I8_n285TAM04_AUTH_NM[0] ;
                  AV32GXLvl148 = (byte)(1) ;
                  AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A285TAM04_AUTH_NM, 0);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(6);
               if ( AV32GXLvl148 == 0 )
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
            AV33GXLvl163 = (byte)(0) ;
            /* Using cursor P006I9 */
            pr_default.execute(7, new Object[] {new Boolean(n928TBT14_KAKUNIN_USER_ID), A928TBT14_KAKUNIN_USER_ID});
            if ( Gx_err != 0 )
            {
               AV33GXLvl163 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(7) != 101) )
            {
               A55TAM07_USER_ID = P006I9_A55TAM07_USER_ID[0] ;
               A205TAM07_USER_NM = P006I9_A205TAM07_USER_NM[0] ;
               n205TAM07_USER_NM = P006I9_n205TAM07_USER_NM[0] ;
               AV33GXLvl163 = (byte)(1) ;
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A205TAM07_USER_NM, 0);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(7);
            if ( AV33GXLvl163 == 0 )
            {
               AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add("", 0);
            }
            AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().add(A934TBT14_KAKUNIN_COMMENT, 0);
         }
         if ( GXutil.strcmp(A902TBT14_KANRYO_FLG, "1") == 0 )
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
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S131 */
         S131 ();
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

   public void S111( )
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
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

   public void S131( )
   {
      /* 'SUB_CSV_DAWNLOAD' Routine */
      GXt_char1 = AV18W_DOWNLOAD_NM ;
      GXv_char4[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char4) ;
      ab719_pc02_edit_memo_csv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18W_DOWNLOAD_NM = "作成メモ" + GXt_char1 + AV16W_CSV_KAK ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "aa811_pc02_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV21W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV20W_FILE_NAME)) + "," + GXutil.URLEncode(GXutil.rtrim(AV18W_DOWNLOAD_NM)) ;
      httpContext.wjLoc = formatLink("aa811_pc02_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(0) ;
   }

   public void S141( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV34Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
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
                  /* Execute user subroutine: S141 */
                  S141 ();
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
      AV11W_A812_SD01_CSV_OUTPUT = new GxObjectCollection(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class, "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV12W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      scmdbuf = "" ;
      P006I2_A199TBT15_MEMO_NO = new short[1] ;
      P006I2_A149TBT15_STUDY_ID = new long[1] ;
      P006I2_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      P006I2_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      P006I2_A479TBT14_DEL_FLG = new String[] {""} ;
      P006I2_n479TBT14_DEL_FLG = new boolean[] {false} ;
      P006I2_A488TBT15_DEL_FLG = new String[] {""} ;
      P006I2_n488TBT15_DEL_FLG = new boolean[] {false} ;
      P006I2_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      P006I2_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      P006I2_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      P006I2_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      P006I2_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      P006I2_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      P006I2_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      P006I2_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P006I2_A942TBT15_CRF_EDA_NO = new byte[1] ;
      P006I2_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      P006I2_A155TBT15_CRF_ID = new short[1] ;
      P006I2_n155TBT15_CRF_ID = new boolean[] {false} ;
      P006I2_A901TBT14_MEMO_KBN = new String[] {""} ;
      P006I2_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      P006I2_A151TBT15_SUBJECT_ID = new int[1] ;
      P006I2_A477TBT14_MEMO = new String[] {""} ;
      P006I2_n477TBT14_MEMO = new boolean[] {false} ;
      P006I2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      P006I2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      P006I2_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      P006I2_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      P006I2_A902TBT14_KANRYO_FLG = new String[] {""} ;
      P006I2_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      P006I2_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P006I2_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      A931TBT14_CRT_AUTH_CD = "" ;
      A479TBT14_DEL_FLG = "" ;
      A488TBT15_DEL_FLG = "" ;
      A928TBT14_KAKUNIN_USER_ID = "" ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      A904TBT15_CRF_ITEM_GRP_CD = "" ;
      A901TBT14_MEMO_KBN = "" ;
      A477TBT14_MEMO = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A934TBT14_KAKUNIN_COMMENT = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P006I3_A63TBM21_STUDY_ID = new long[1] ;
      P006I3_A367TBM21_STUDY_NM = new String[] {""} ;
      P006I3_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      P006I4_A69TBM31_CRF_ID = new short[1] ;
      P006I4_A68TBM31_STUDY_ID = new long[1] ;
      P006I4_A642TBM31_CRF_SNM = new String[] {""} ;
      P006I4_n642TBM31_CRF_SNM = new boolean[] {false} ;
      A642TBM31_CRF_SNM = "" ;
      P006I5_A945TBM44_STUDY_ID = new long[1] ;
      P006I5_A946TBM44_CRF_ID = new short[1] ;
      P006I5_A947TBM44_CRF_EDA_NO = new byte[1] ;
      P006I5_A948TBM44_VISIT_NO = new int[1] ;
      P006I5_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P006I6_A71TBM32_CRF_ID = new short[1] ;
      P006I6_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P006I6_A70TBM32_STUDY_ID = new long[1] ;
      P006I6_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      P006I6_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A405TBM32_CRF_ITEM_NM = "" ;
      P006I7_A57TAM08_SITE_ID = new String[] {""} ;
      P006I7_A320TAM08_SITE_SNM = new String[] {""} ;
      P006I7_n320TAM08_SITE_SNM = new boolean[] {false} ;
      A57TAM08_SITE_ID = "" ;
      A320TAM08_SITE_SNM = "" ;
      P006I8_A13TAM04_AUTH_CD = new String[] {""} ;
      P006I8_A285TAM04_AUTH_NM = new String[] {""} ;
      P006I8_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A13TAM04_AUTH_CD = "" ;
      A285TAM04_AUTH_NM = "" ;
      P006I9_A55TAM07_USER_ID = new String[] {""} ;
      P006I9_A205TAM07_USER_NM = new String[] {""} ;
      P006I9_n205TAM07_USER_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV19W_ERRCD = "" ;
      GXEncryptionTmp = "" ;
      AV21W_FILE_PATH = "" ;
      GXv_char2 = new String [1] ;
      AV18W_DOWNLOAD_NM = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      AV34Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab719_pc02_edit_memo_csv__default(),
         new Object[] {
             new Object[] {
            P006I2_A199TBT15_MEMO_NO, P006I2_A149TBT15_STUDY_ID, P006I2_A931TBT14_CRT_AUTH_CD, P006I2_n931TBT14_CRT_AUTH_CD, P006I2_A479TBT14_DEL_FLG, P006I2_n479TBT14_DEL_FLG, P006I2_A488TBT15_DEL_FLG, P006I2_n488TBT15_DEL_FLG, P006I2_A928TBT14_KAKUNIN_USER_ID, P006I2_n928TBT14_KAKUNIN_USER_ID,
            P006I2_A930TBT14_REQUEST_AUTH_CD, P006I2_n930TBT14_REQUEST_AUTH_CD, P006I2_A929TBT14_REQUEST_SITE_ID, P006I2_n929TBT14_REQUEST_SITE_ID, P006I2_A904TBT15_CRF_ITEM_GRP_CD, P006I2_n904TBT15_CRF_ITEM_GRP_CD, P006I2_A942TBT15_CRF_EDA_NO, P006I2_n942TBT15_CRF_EDA_NO, P006I2_A155TBT15_CRF_ID, P006I2_n155TBT15_CRF_ID,
            P006I2_A901TBT14_MEMO_KBN, P006I2_n901TBT14_MEMO_KBN, P006I2_A151TBT15_SUBJECT_ID, P006I2_A477TBT14_MEMO, P006I2_n477TBT14_MEMO, P006I2_A927TBT14_KAKUNIN_FLG, P006I2_n927TBT14_KAKUNIN_FLG, P006I2_A934TBT14_KAKUNIN_COMMENT, P006I2_n934TBT14_KAKUNIN_COMMENT, P006I2_A902TBT14_KANRYO_FLG,
            P006I2_n902TBT14_KANRYO_FLG, P006I2_A480TBT14_CRT_DATETIME, P006I2_n480TBT14_CRT_DATETIME
            }
            , new Object[] {
            P006I3_A63TBM21_STUDY_ID, P006I3_A367TBM21_STUDY_NM, P006I3_n367TBM21_STUDY_NM
            }
            , new Object[] {
            P006I4_A69TBM31_CRF_ID, P006I4_A68TBM31_STUDY_ID, P006I4_A642TBM31_CRF_SNM, P006I4_n642TBM31_CRF_SNM
            }
            , new Object[] {
            P006I5_A945TBM44_STUDY_ID, P006I5_A946TBM44_CRF_ID, P006I5_A947TBM44_CRF_EDA_NO, P006I5_A948TBM44_VISIT_NO, P006I5_n948TBM44_VISIT_NO
            }
            , new Object[] {
            P006I6_A71TBM32_CRF_ID, P006I6_A72TBM32_CRF_ITEM_CD, P006I6_A70TBM32_STUDY_ID, P006I6_A405TBM32_CRF_ITEM_NM, P006I6_n405TBM32_CRF_ITEM_NM
            }
            , new Object[] {
            P006I7_A57TAM08_SITE_ID, P006I7_A320TAM08_SITE_SNM, P006I7_n320TAM08_SITE_SNM
            }
            , new Object[] {
            P006I8_A13TAM04_AUTH_CD, P006I8_A285TAM04_AUTH_NM, P006I8_n285TAM04_AUTH_NM
            }
            , new Object[] {
            P006I9_A55TAM07_USER_ID, P006I9_A205TAM07_USER_NM, P006I9_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV34Pgmname = "AB719_PC02_EDIT_MEMO_CSV" ;
      /* GeneXus formulas. */
      AV34Pgmname = "AB719_PC02_EDIT_MEMO_CSV" ;
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private byte A942TBT15_CRF_EDA_NO ;
   private byte AV29GXLvl108 ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte AV31GXLvl136 ;
   private byte AV32GXLvl148 ;
   private byte AV33GXLvl163 ;
   private short A199TBT15_MEMO_NO ;
   private short A155TBT15_CRF_ID ;
   private short A69TBM31_CRF_ID ;
   private short Gx_err ;
   private short A946TBM44_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private int A151TBT15_SUBJECT_ID ;
   private int A948TBM44_VISIT_NO ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long AV13W_CSV_CNT ;
   private long A149TBT15_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private String GXKey ;
   private String GXDecQS ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV34Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A480TBT14_CRT_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n488TBT15_DEL_FLG ;
   private boolean n928TBT14_KAKUNIN_USER_ID ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n904TBT15_CRF_ITEM_GRP_CD ;
   private boolean n942TBT15_CRF_EDA_NO ;
   private boolean n155TBT15_CRF_ID ;
   private boolean n901TBT14_MEMO_KBN ;
   private boolean n477TBT14_MEMO ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n934TBT14_KAKUNIN_COMMENT ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n480TBT14_CRT_DATETIME ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n405TBM32_CRF_ITEM_NM ;
   private boolean n320TAM08_SITE_SNM ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n205TAM07_USER_NM ;
   private String AV23P_AUTH_CD ;
   private String AV22W_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV17W_CSV_SDEL ;
   private String AV15W_CSV_FDEL ;
   private String AV16W_CSV_KAK ;
   private String AV20W_FILE_NAME ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String A479TBT14_DEL_FLG ;
   private String A488TBT15_DEL_FLG ;
   private String A928TBT14_KAKUNIN_USER_ID ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String A904TBT15_CRF_ITEM_GRP_CD ;
   private String A901TBT14_MEMO_KBN ;
   private String A477TBT14_MEMO ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A934TBT14_KAKUNIN_COMMENT ;
   private String A902TBT14_KANRYO_FLG ;
   private String A367TBM21_STUDY_NM ;
   private String A642TBM31_CRF_SNM ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A405TBM32_CRF_ITEM_NM ;
   private String A57TAM08_SITE_ID ;
   private String A320TAM08_SITE_SNM ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String AV19W_ERRCD ;
   private String AV21W_FILE_PATH ;
   private String AV18W_DOWNLOAD_NM ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private short[] P006I2_A199TBT15_MEMO_NO ;
   private long[] P006I2_A149TBT15_STUDY_ID ;
   private String[] P006I2_A931TBT14_CRT_AUTH_CD ;
   private boolean[] P006I2_n931TBT14_CRT_AUTH_CD ;
   private String[] P006I2_A479TBT14_DEL_FLG ;
   private boolean[] P006I2_n479TBT14_DEL_FLG ;
   private String[] P006I2_A488TBT15_DEL_FLG ;
   private boolean[] P006I2_n488TBT15_DEL_FLG ;
   private String[] P006I2_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] P006I2_n928TBT14_KAKUNIN_USER_ID ;
   private String[] P006I2_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] P006I2_n930TBT14_REQUEST_AUTH_CD ;
   private String[] P006I2_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] P006I2_n929TBT14_REQUEST_SITE_ID ;
   private String[] P006I2_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] P006I2_n904TBT15_CRF_ITEM_GRP_CD ;
   private byte[] P006I2_A942TBT15_CRF_EDA_NO ;
   private boolean[] P006I2_n942TBT15_CRF_EDA_NO ;
   private short[] P006I2_A155TBT15_CRF_ID ;
   private boolean[] P006I2_n155TBT15_CRF_ID ;
   private String[] P006I2_A901TBT14_MEMO_KBN ;
   private boolean[] P006I2_n901TBT14_MEMO_KBN ;
   private int[] P006I2_A151TBT15_SUBJECT_ID ;
   private String[] P006I2_A477TBT14_MEMO ;
   private boolean[] P006I2_n477TBT14_MEMO ;
   private String[] P006I2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] P006I2_n927TBT14_KAKUNIN_FLG ;
   private String[] P006I2_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] P006I2_n934TBT14_KAKUNIN_COMMENT ;
   private String[] P006I2_A902TBT14_KANRYO_FLG ;
   private boolean[] P006I2_n902TBT14_KANRYO_FLG ;
   private java.util.Date[] P006I2_A480TBT14_CRT_DATETIME ;
   private boolean[] P006I2_n480TBT14_CRT_DATETIME ;
   private long[] P006I3_A63TBM21_STUDY_ID ;
   private String[] P006I3_A367TBM21_STUDY_NM ;
   private boolean[] P006I3_n367TBM21_STUDY_NM ;
   private short[] P006I4_A69TBM31_CRF_ID ;
   private long[] P006I4_A68TBM31_STUDY_ID ;
   private String[] P006I4_A642TBM31_CRF_SNM ;
   private boolean[] P006I4_n642TBM31_CRF_SNM ;
   private long[] P006I5_A945TBM44_STUDY_ID ;
   private short[] P006I5_A946TBM44_CRF_ID ;
   private byte[] P006I5_A947TBM44_CRF_EDA_NO ;
   private int[] P006I5_A948TBM44_VISIT_NO ;
   private boolean[] P006I5_n948TBM44_VISIT_NO ;
   private short[] P006I6_A71TBM32_CRF_ID ;
   private String[] P006I6_A72TBM32_CRF_ITEM_CD ;
   private long[] P006I6_A70TBM32_STUDY_ID ;
   private String[] P006I6_A405TBM32_CRF_ITEM_NM ;
   private boolean[] P006I6_n405TBM32_CRF_ITEM_NM ;
   private String[] P006I7_A57TAM08_SITE_ID ;
   private String[] P006I7_A320TAM08_SITE_SNM ;
   private boolean[] P006I7_n320TAM08_SITE_SNM ;
   private String[] P006I8_A13TAM04_AUTH_CD ;
   private String[] P006I8_A285TAM04_AUTH_NM ;
   private boolean[] P006I8_n285TAM04_AUTH_NM ;
   private String[] P006I9_A55TAM07_USER_ID ;
   private String[] P006I9_A205TAM07_USER_NM ;
   private boolean[] P006I9_n205TAM07_USER_NM ;
   private GxObjectCollection AV11W_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV12W_A812_SD01_CSV_OUTPUT_ITEM ;
}

final  class ab719_pc02_edit_memo_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006I2", "SELECT T1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO, T1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, T2.`TBT14_CRT_AUTH_CD`, T2.`TBT14_DEL_FLG`, T1.`TBT15_DEL_FLG`, T2.`TBT14_KAKUNIN_USER_ID`, T2.`TBT14_REQUEST_AUTH_CD`, T2.`TBT14_REQUEST_SITE_ID`, T1.`TBT15_CRF_ITEM_GRP_CD`, T1.`TBT15_CRF_EDA_NO`, T1.`TBT15_CRF_ID`, T2.`TBT14_MEMO_KBN`, T1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, T2.`TBT14_MEMO`, T2.`TBT14_KAKUNIN_FLG`, T2.`TBT14_KAKUNIN_COMMENT`, T2.`TBT14_KANRYO_FLG`, T2.`TBT14_CRT_DATETIME` FROM (`TBT15_CRF_MEMO_LOC` T1 INNER JOIN `TBT14_CRF_MEMO` T2 ON T2.`TBT14_STUDY_ID` = T1.`TBT15_STUDY_ID` AND T2.`TBT14_SUBJECT_ID` = T1.`TBT15_SUBJECT_ID` AND T2.`TBT14_MEMO_NO` = T1.`TBT15_MEMO_NO`) WHERE (T1.`TBT15_STUDY_ID` = ?) AND (T2.`TBT14_CRT_AUTH_CD` = ?) AND (T2.`TBT14_DEL_FLG` = '0') AND (T1.`TBT15_DEL_FLG` = '0') ORDER BY T2.`TBT14_CRT_DATETIME` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P006I3", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006I4", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ? ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006I5", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006I6", "SELECT `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006I7", "SELECT `TAM08_SITE_ID`, `TAM08_SITE_SNM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006I8", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006I9", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((byte[]) buf[16])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setVarchar(2, (String)parms[1], 2);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
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
               return;
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 4 :
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
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 128);
               }
               return;
      }
   }

}

