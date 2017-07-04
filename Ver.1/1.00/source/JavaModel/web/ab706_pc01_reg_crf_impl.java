/*
               File: ab706_pc01_reg_crf_impl
        Description: CRFì¸óÕÉfÅ[É^ìoò^èàóù
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:13.45
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab706_pc01_reg_crf_impl extends GXWebProcedure
{
   public ab706_pc01_reg_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV16P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV17P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV12P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV13P_CRF_LATEST_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV14P_DM_ARRIVAL_FLG = httpContext.GetNextPar( ) ;
            AV19P_USER_ID = httpContext.GetNextPar( ) ;
            AV15P_PASSWORD = httpContext.GetNextPar( ) ;
            AV11P_AUTH_CD = httpContext.GetNextPar( ) ;
            AV18P_UPD_RIYU = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S15460 */
      S15460 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV36W_REG_FLG = "0" ;
      AV27W_ERR_FLG = "0" ;
      AV28W_ERR_MSG = "" ;
      GXv_SdtB792_SD01_CRF1[0] = AV22SD_B792_SD01_CRF;
      GXv_char2[0] = AV37W_RTN_CD ;
      new b704_pc02_get_crf_val(remoteHandle, context).execute( GXv_SdtB792_SD01_CRF1, GXv_char2) ;
      AV22SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF1[0] ;
      ab706_pc01_reg_crf_impl.this.AV37W_RTN_CD = GXv_char2[0] ;
      if ( ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id() == AV16P_STUDY_ID ) && ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id() == AV17P_SUBJECT_ID ) && ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id() == AV12P_CRF_ID ) && ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() == AV13P_CRF_LATEST_VERSION ) )
      {
      }
      else
      {
         GXv_char2[0] = AV37W_RTN_CD ;
         GXv_char3[0] = AV34W_MSG ;
         new b799_pc07_sdt_work_reg(remoteHandle, context).execute( AV38W_SESSION.getId(), AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV22SD_B792_SD01_CRF, GXv_char2, GXv_char3) ;
         ab706_pc01_reg_crf_impl.this.AV37W_RTN_CD = GXv_char2[0] ;
         ab706_pc01_reg_crf_impl.this.AV34W_MSG = GXv_char3[0] ;
         GXv_SdtB792_SD01_CRF1[0] = AV22SD_B792_SD01_CRF;
         GXv_char3[0] = AV37W_RTN_CD ;
         GXv_char2[0] = AV34W_MSG ;
         new b799_pc08_sdt_work_get(remoteHandle, context).execute( AV38W_SESSION.getId(), AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV16P_STUDY_ID, AV17P_SUBJECT_ID, AV12P_CRF_ID, AV13P_CRF_LATEST_VERSION, GXv_SdtB792_SD01_CRF1, GXv_char3, GXv_char2) ;
         AV22SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF1[0] ;
         ab706_pc01_reg_crf_impl.this.AV37W_RTN_CD = GXv_char3[0] ;
         ab706_pc01_reg_crf_impl.this.AV34W_MSG = GXv_char2[0] ;
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
      {
         AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value(), "GXXEV1_NULL") == 0 )
         {
            AV23SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( "" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23SD_B792_SD02_CRF_RESULT_I", AV23SD_B792_SD02_CRF_RESULT_I);
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
      /* Execute user subroutine: S11118 */
      S11118 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV36W_REG_FLG, "1") == 0 )
      {
         /* Execute user subroutine: S12175 */
         S12175 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV27W_ERR_FLG, "0") == 0 )
         {
            /* Execute user subroutine: S13279 */
            S13279 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( GXutil.strcmp(AV27W_ERR_FLG, "0") == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "ab706_pc01_reg_crf");
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "ab706_pc01_reg_crf");
         }
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV18P_UPD_RIYU)==0) )
         {
            /* Execute user subroutine: S14412 */
            S14412 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV27W_ERR_FLG, "0") == 0 )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "ab706_pc01_reg_crf");
            }
         }
      }
      if ( GXutil.strcmp(AV27W_ERR_FLG, "0") == 0 )
      {
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SD_B706_SD01_CRF_REG_RTN", AV20SD_B706_SD01_CRF_REG_RTN);
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SD_B706_SD01_CRF_REG_RTN", AV20SD_B706_SD01_CRF_REG_RTN);
      }
      else
      {
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( "1" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SD_B706_SD01_CRF_REG_RTN", AV20SD_B706_SD01_CRF_REG_RTN);
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg( AV28W_ERR_MSG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SD_B706_SD01_CRF_REG_RTN", AV20SD_B706_SD01_CRF_REG_RTN);
      }
      AV10HttpResponse.addString(AV20SD_B706_SD01_CRF_REG_RTN.toJSonString());
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S11118( )
   {
      /* 'SUB_CRF_REG_CHK' Routine */
      if ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() == 0 )
      {
         AV36W_REG_FLG = "1" ;
      }
      else
      {
         GXv_char3[0] = AV33W_MODE_KBN ;
         GXv_char2[0] = AV32W_MEMO_INP_FLG ;
         GXv_char4[0] = AV26W_DM_ARRI_INP_FLG ;
         GXv_char5[0] = AV41W_STUDY_NM ;
         GXv_char6[0] = AV25W_CRF_SNM ;
         GXv_int7[0] = AV42W_TBM31_GRID_SIZE ;
         GXv_char8[0] = AV27W_ERR_FLG ;
         GXv_char9[0] = AV28W_ERR_MSG ;
         new b702_pc02_header_set(remoteHandle, context).execute( AV24W_A_LOGIN_SDT, AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), AV16P_STUDY_ID, AV17P_SUBJECT_ID, AV12P_CRF_ID, AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), GXv_char3, GXv_char2, GXv_char4, GXv_char5, GXv_char6, GXv_int7, GXv_char8, GXv_char9) ;
         ab706_pc01_reg_crf_impl.this.AV33W_MODE_KBN = GXv_char3[0] ;
         ab706_pc01_reg_crf_impl.this.AV32W_MEMO_INP_FLG = GXv_char2[0] ;
         ab706_pc01_reg_crf_impl.this.AV26W_DM_ARRI_INP_FLG = GXv_char4[0] ;
         ab706_pc01_reg_crf_impl.this.AV41W_STUDY_NM = GXv_char5[0] ;
         ab706_pc01_reg_crf_impl.this.AV25W_CRF_SNM = GXv_char6[0] ;
         ab706_pc01_reg_crf_impl.this.AV42W_TBM31_GRID_SIZE = GXv_int7[0] ;
         ab706_pc01_reg_crf_impl.this.AV27W_ERR_FLG = GXv_char8[0] ;
         ab706_pc01_reg_crf_impl.this.AV28W_ERR_MSG = GXv_char9[0] ;
         if ( GXutil.strcmp(AV27W_ERR_FLG, "0") == 0 )
         {
            if ( GXutil.strcmp(AV26W_DM_ARRI_INP_FLG, "1") == 0 )
            {
               if ( GXutil.strcmp(AV14P_DM_ARRIVAL_FLG, AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg()) != 0 )
               {
                  AV36W_REG_FLG = "1" ;
               }
            }
            if ( GXutil.strcmp(AV36W_REG_FLG, "0") == 0 )
            {
               AV49GXV2 = 1 ;
               while ( AV49GXV2 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
               {
                  AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV49GXV2));
                  if ( (GXutil.strcmp("", GXutil.trim( AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value()))==0) && (GXutil.strcmp("", GXutil.trim( AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org()))==0) )
                  {
                  }
                  else
                  {
                     if ( GXutil.strcmp(GXutil.trim( AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value()), GXutil.trim( AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org())) != 0 )
                     {
                        AV36W_REG_FLG = "1" ;
                        if (true) break;
                     }
                  }
                  AV49GXV2 = (int)(AV49GXV2+1) ;
               }
            }
         }
      }
   }

   public void S12175( )
   {
      /* 'SUB_CRF_UPD_HISTORY_INS' Routine */
      /* Using cursor P005Z2 */
      pr_default.execute(0, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV17P_SUBJECT_ID), new Short(AV12P_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A292TBT02_STUDY_ID = P005Z2_A292TBT02_STUDY_ID[0] ;
         A293TBT02_SUBJECT_ID = P005Z2_A293TBT02_SUBJECT_ID[0] ;
         A294TBT02_CRF_ID = P005Z2_A294TBT02_CRF_ID[0] ;
         A370TBT02_CRF_LATEST_VERSION = P005Z2_A370TBT02_CRF_LATEST_VERSION[0] ;
         n370TBT02_CRF_LATEST_VERSION = P005Z2_n370TBT02_CRF_LATEST_VERSION[0] ;
         A371TBT02_CRF_INPUT_LEVEL = P005Z2_A371TBT02_CRF_INPUT_LEVEL[0] ;
         n371TBT02_CRF_INPUT_LEVEL = P005Z2_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A560TBT02_UPLOAD_DATETIME = P005Z2_A560TBT02_UPLOAD_DATETIME[0] ;
         n560TBT02_UPLOAD_DATETIME = P005Z2_n560TBT02_UPLOAD_DATETIME[0] ;
         A561TBT02_UPLOAD_USER_ID = P005Z2_A561TBT02_UPLOAD_USER_ID[0] ;
         n561TBT02_UPLOAD_USER_ID = P005Z2_n561TBT02_UPLOAD_USER_ID[0] ;
         A562TBT02_UPLOAD_AUTH_CD = P005Z2_A562TBT02_UPLOAD_AUTH_CD[0] ;
         n562TBT02_UPLOAD_AUTH_CD = P005Z2_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A563TBT02_DM_ARRIVAL_FLG = P005Z2_A563TBT02_DM_ARRIVAL_FLG[0] ;
         n563TBT02_DM_ARRIVAL_FLG = P005Z2_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = P005Z2_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = P005Z2_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A565TBT02_APPROVAL_FLG = P005Z2_A565TBT02_APPROVAL_FLG[0] ;
         n565TBT02_APPROVAL_FLG = P005Z2_n565TBT02_APPROVAL_FLG[0] ;
         A566TBT02_APPROVAL_DATETIME = P005Z2_A566TBT02_APPROVAL_DATETIME[0] ;
         n566TBT02_APPROVAL_DATETIME = P005Z2_n566TBT02_APPROVAL_DATETIME[0] ;
         A567TBT02_APPROVAL_USER_ID = P005Z2_A567TBT02_APPROVAL_USER_ID[0] ;
         n567TBT02_APPROVAL_USER_ID = P005Z2_n567TBT02_APPROVAL_USER_ID[0] ;
         A568TBT02_APPROVAL_AUTH_CD = P005Z2_A568TBT02_APPROVAL_AUTH_CD[0] ;
         n568TBT02_APPROVAL_AUTH_CD = P005Z2_n568TBT02_APPROVAL_AUTH_CD[0] ;
         A569TBT02_INPUT_END_FLG = P005Z2_A569TBT02_INPUT_END_FLG[0] ;
         n569TBT02_INPUT_END_FLG = P005Z2_n569TBT02_INPUT_END_FLG[0] ;
         A570TBT02_INPUT_END_DATETIME = P005Z2_A570TBT02_INPUT_END_DATETIME[0] ;
         n570TBT02_INPUT_END_DATETIME = P005Z2_n570TBT02_INPUT_END_DATETIME[0] ;
         A571TBT02_INPUT_END_USER_ID = P005Z2_A571TBT02_INPUT_END_USER_ID[0] ;
         n571TBT02_INPUT_END_USER_ID = P005Z2_n571TBT02_INPUT_END_USER_ID[0] ;
         A572TBT02_INPUT_END_AUTH_CD = P005Z2_A572TBT02_INPUT_END_AUTH_CD[0] ;
         n572TBT02_INPUT_END_AUTH_CD = P005Z2_n572TBT02_INPUT_END_AUTH_CD[0] ;
         A295TBT02_DEL_FLG = P005Z2_A295TBT02_DEL_FLG[0] ;
         n295TBT02_DEL_FLG = P005Z2_n295TBT02_DEL_FLG[0] ;
         A302TBT02_UPD_CNT = P005Z2_A302TBT02_UPD_CNT[0] ;
         n302TBT02_UPD_CNT = P005Z2_n302TBT02_UPD_CNT[0] ;
         A299TBT02_UPD_DATETIME = P005Z2_A299TBT02_UPD_DATETIME[0] ;
         n299TBT02_UPD_DATETIME = P005Z2_n299TBT02_UPD_DATETIME[0] ;
         A300TBT02_UPD_USER_ID = P005Z2_A300TBT02_UPD_USER_ID[0] ;
         n300TBT02_UPD_USER_ID = P005Z2_n300TBT02_UPD_USER_ID[0] ;
         A301TBT02_UPD_PROG_NM = P005Z2_A301TBT02_UPD_PROG_NM[0] ;
         n301TBT02_UPD_PROG_NM = P005Z2_n301TBT02_UPD_PROG_NM[0] ;
         if ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt() != A302TBT02_UPD_CNT )
         {
            AV27W_ERR_FLG = "1" ;
            GXt_char10 = AV28W_ERR_MSG ;
            GXv_char9[0] = GXt_char10 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char9) ;
            ab706_pc01_reg_crf_impl.this.GXt_char10 = GXv_char9[0] ;
            AV28W_ERR_MSG = GXt_char10 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P005Z3 */
            pr_default.execute(1, new Object[] {new Boolean(n370TBT02_CRF_LATEST_VERSION), new Short(A370TBT02_CRF_LATEST_VERSION), new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n560TBT02_UPLOAD_DATETIME), A560TBT02_UPLOAD_DATETIME, new Boolean(n561TBT02_UPLOAD_USER_ID), A561TBT02_UPLOAD_USER_ID, new Boolean(n562TBT02_UPLOAD_AUTH_CD), A562TBT02_UPLOAD_AUTH_CD, new Boolean(n563TBT02_DM_ARRIVAL_FLG), A563TBT02_DM_ARRIVAL_FLG, new Boolean(n564TBT02_DM_ARRIVAL_DATETIME), A564TBT02_DM_ARRIVAL_DATETIME, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
            if (true) break;
         }
         if ( ( GXutil.strcmp(AV14P_DM_ARRIVAL_FLG, "1") == 0 ) && ( GXutil.strcmp(A563TBT02_DM_ARRIVAL_FLG, AV14P_DM_ARRIVAL_FLG) != 0 ) )
         {
            A371TBT02_CRF_INPUT_LEVEL = (byte)(AV9C_DM_INPUT_LEVEL) ;
            n371TBT02_CRF_INPUT_LEVEL = false ;
            A563TBT02_DM_ARRIVAL_FLG = "1" ;
            n563TBT02_DM_ARRIVAL_FLG = false ;
            A564TBT02_DM_ARRIVAL_DATETIME = GXutil.now( ) ;
            n564TBT02_DM_ARRIVAL_DATETIME = false ;
         }
         A560TBT02_UPLOAD_DATETIME = GXutil.now( ) ;
         n560TBT02_UPLOAD_DATETIME = false ;
         A561TBT02_UPLOAD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n561TBT02_UPLOAD_USER_ID = false ;
         A562TBT02_UPLOAD_AUTH_CD = AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd() ;
         n562TBT02_UPLOAD_AUTH_CD = false ;
         A370TBT02_CRF_LATEST_VERSION = (short)(A370TBT02_CRF_LATEST_VERSION+1) ;
         n370TBT02_CRF_LATEST_VERSION = false ;
         A299TBT02_UPD_DATETIME = GXutil.now( ) ;
         n299TBT02_UPD_DATETIME = false ;
         A300TBT02_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n300TBT02_UPD_USER_ID = false ;
         A301TBT02_UPD_PROG_NM = AV51Pgmname ;
         n301TBT02_UPD_PROG_NM = false ;
         A302TBT02_UPD_CNT = (long)(A302TBT02_UPD_CNT+1) ;
         n302TBT02_UPD_CNT = false ;
         AV43W_TBT02_CRF_LATEST_VERSION = A370TBT02_CRF_LATEST_VERSION ;
         /*
            INSERT RECORD ON TABLE TBT11_CRF_HISTORY

         */
         A303TBT11_STUDY_ID = A292TBT02_STUDY_ID ;
         A304TBT11_SUBJECT_ID = A293TBT02_SUBJECT_ID ;
         A305TBT11_CRF_ID = A294TBT02_CRF_ID ;
         A306TBT11_CRF_VERSION = A370TBT02_CRF_LATEST_VERSION ;
         A573TBT11_CRF_INPUT_LEVEL = A371TBT02_CRF_INPUT_LEVEL ;
         n573TBT11_CRF_INPUT_LEVEL = false ;
         A574TBT11_UPLOAD_DATETIME = A560TBT02_UPLOAD_DATETIME ;
         n574TBT11_UPLOAD_DATETIME = false ;
         A575TBT11_UPLOAD_USER_ID = A561TBT02_UPLOAD_USER_ID ;
         n575TBT11_UPLOAD_USER_ID = false ;
         A576TBT11_UPLOAD_AUTH_CD = A562TBT02_UPLOAD_AUTH_CD ;
         n576TBT11_UPLOAD_AUTH_CD = false ;
         A577TBT11_DM_ARRIVAL_FLG = A563TBT02_DM_ARRIVAL_FLG ;
         n577TBT11_DM_ARRIVAL_FLG = false ;
         A578TBT11_DM_ARRIVAL_DATETIME = A564TBT02_DM_ARRIVAL_DATETIME ;
         n578TBT11_DM_ARRIVAL_DATETIME = false ;
         A579TBT11_APPROVAL_FLG = A565TBT02_APPROVAL_FLG ;
         n579TBT11_APPROVAL_FLG = false ;
         A580TBT11_APPROVAL_DATETIME = A566TBT02_APPROVAL_DATETIME ;
         n580TBT11_APPROVAL_DATETIME = false ;
         A581TBT11_APPROVAL_USER_ID = A567TBT02_APPROVAL_USER_ID ;
         n581TBT11_APPROVAL_USER_ID = false ;
         A582TBT11_APPROVAL_AUTH_CD = A568TBT02_APPROVAL_AUTH_CD ;
         n582TBT11_APPROVAL_AUTH_CD = false ;
         A583TBT11_INPUT_END_FLG = A569TBT02_INPUT_END_FLG ;
         n583TBT11_INPUT_END_FLG = false ;
         A584TBT11_INPUT_END_DATETIME = A570TBT02_INPUT_END_DATETIME ;
         n584TBT11_INPUT_END_DATETIME = false ;
         A585TBT11_INPUT_END_USER_ID = A571TBT02_INPUT_END_USER_ID ;
         n585TBT11_INPUT_END_USER_ID = false ;
         A586TBT11_INPUT_END_AUTH_CD = A572TBT02_INPUT_END_AUTH_CD ;
         n586TBT11_INPUT_END_AUTH_CD = false ;
         A884TBT11_UPD_RIYU = AV18P_UPD_RIYU ;
         n884TBT11_UPD_RIYU = false ;
         A307TBT11_DEL_FLG = "0" ;
         n307TBT11_DEL_FLG = false ;
         A308TBT11_CRT_DATETIME = GXutil.now( ) ;
         n308TBT11_CRT_DATETIME = false ;
         A309TBT11_CRT_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n309TBT11_CRT_USER_ID = false ;
         A310TBT11_CRT_PROG_NM = AV51Pgmname ;
         n310TBT11_CRT_PROG_NM = false ;
         A311TBT11_UPD_DATETIME = GXutil.now( ) ;
         n311TBT11_UPD_DATETIME = false ;
         A312TBT11_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n312TBT11_UPD_USER_ID = false ;
         A313TBT11_UPD_PROG_NM = AV51Pgmname ;
         n313TBT11_UPD_PROG_NM = false ;
         A314TBT11_UPD_CNT = 1 ;
         n314TBT11_UPD_CNT = false ;
         /* Using cursor P005Z4 */
         pr_default.execute(2, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION), new Boolean(n573TBT11_CRF_INPUT_LEVEL), new Byte(A573TBT11_CRF_INPUT_LEVEL), new Boolean(n574TBT11_UPLOAD_DATETIME), A574TBT11_UPLOAD_DATETIME, new Boolean(n575TBT11_UPLOAD_USER_ID), A575TBT11_UPLOAD_USER_ID, new Boolean(n576TBT11_UPLOAD_AUTH_CD), A576TBT11_UPLOAD_AUTH_CD, new Boolean(n577TBT11_DM_ARRIVAL_FLG), A577TBT11_DM_ARRIVAL_FLG, new Boolean(n578TBT11_DM_ARRIVAL_DATETIME), A578TBT11_DM_ARRIVAL_DATETIME, new Boolean(n579TBT11_APPROVAL_FLG), A579TBT11_APPROVAL_FLG, new Boolean(n580TBT11_APPROVAL_DATETIME), A580TBT11_APPROVAL_DATETIME, new Boolean(n581TBT11_APPROVAL_USER_ID), A581TBT11_APPROVAL_USER_ID, new Boolean(n582TBT11_APPROVAL_AUTH_CD), A582TBT11_APPROVAL_AUTH_CD, new Boolean(n583TBT11_INPUT_END_FLG), A583TBT11_INPUT_END_FLG, new Boolean(n584TBT11_INPUT_END_DATETIME), A584TBT11_INPUT_END_DATETIME, new Boolean(n585TBT11_INPUT_END_USER_ID), A585TBT11_INPUT_END_USER_ID, new Boolean(n586TBT11_INPUT_END_AUTH_CD), A586TBT11_INPUT_END_AUTH_CD, new Boolean(n884TBT11_UPD_RIYU), A884TBT11_UPD_RIYU, new Boolean(n307TBT11_DEL_FLG), A307TBT11_DEL_FLG, new Boolean(n308TBT11_CRT_DATETIME), A308TBT11_CRT_DATETIME, new Boolean(n309TBT11_CRT_USER_ID), A309TBT11_CRT_USER_ID, new Boolean(n310TBT11_CRT_PROG_NM), A310TBT11_CRT_PROG_NM, new Boolean(n311TBT11_UPD_DATETIME), A311TBT11_UPD_DATETIME, new Boolean(n312TBT11_UPD_USER_ID), A312TBT11_UPD_USER_ID, new Boolean(n313TBT11_UPD_PROG_NM), A313TBT11_UPD_PROG_NM, new Boolean(n314TBT11_UPD_CNT), new Long(A314TBT11_UPD_CNT)});
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            AV27W_ERR_FLG = "1" ;
            GXt_char10 = AV28W_ERR_MSG ;
            GXv_char9[0] = GXt_char10 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00023", "CRFèCê≥óöó", "", "", "", "", GXv_char9) ;
            ab706_pc01_reg_crf_impl.this.GXt_char10 = GXv_char9[0] ;
            AV28W_ERR_MSG = GXt_char10 ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         AV31W_LOGTEXT = "" ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV16P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV17P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV12P_CRF_ID, 4, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "DM_ARRIVAL_FLG:" + AV14P_DM_ARRIVAL_FLG + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "UPD_RIYU:" + AV18P_UPD_RIYU + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = GXutil.strReplace( AV31W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV51Pgmname, "UPD", AV31W_LOGTEXT) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P005Z5 */
         pr_default.execute(3, new Object[] {new Boolean(n370TBT02_CRF_LATEST_VERSION), new Short(A370TBT02_CRF_LATEST_VERSION), new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n560TBT02_UPLOAD_DATETIME), A560TBT02_UPLOAD_DATETIME, new Boolean(n561TBT02_UPLOAD_USER_ID), A561TBT02_UPLOAD_USER_ID, new Boolean(n562TBT02_UPLOAD_AUTH_CD), A562TBT02_UPLOAD_AUTH_CD, new Boolean(n563TBT02_DM_ARRIVAL_FLG), A563TBT02_DM_ARRIVAL_FLG, new Boolean(n564TBT02_DM_ARRIVAL_DATETIME), A564TBT02_DM_ARRIVAL_DATETIME, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
         if (true) break;
         /* Using cursor P005Z6 */
         pr_default.execute(4, new Object[] {new Boolean(n370TBT02_CRF_LATEST_VERSION), new Short(A370TBT02_CRF_LATEST_VERSION), new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n560TBT02_UPLOAD_DATETIME), A560TBT02_UPLOAD_DATETIME, new Boolean(n561TBT02_UPLOAD_USER_ID), A561TBT02_UPLOAD_USER_ID, new Boolean(n562TBT02_UPLOAD_AUTH_CD), A562TBT02_UPLOAD_AUTH_CD, new Boolean(n563TBT02_DM_ARRIVAL_FLG), A563TBT02_DM_ARRIVAL_FLG, new Boolean(n564TBT02_DM_ARRIVAL_DATETIME), A564TBT02_DM_ARRIVAL_DATETIME, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S13279( )
   {
      /* 'SUB_CRF_RES_UPD_HIS_INS' Routine */
      AV52GXV3 = 1 ;
      while ( AV52GXV3 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
      {
         AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV52GXV3));
         if ( ! (GXutil.strcmp("", AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd())==0) )
         {
            AV45W_MODE = "" ;
            AV53GXLvl290 = (byte)(0) ;
            /* Using cursor P005Z7 */
            pr_default.execute(5, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV17P_SUBJECT_ID), new Short(AV12P_CRF_ID), AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd()});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A328TBT12_DEL_FLG = P005Z7_A328TBT12_DEL_FLG[0] ;
               n328TBT12_DEL_FLG = P005Z7_n328TBT12_DEL_FLG[0] ;
               A319TBT12_CRF_ITEM_GRP_CD = P005Z7_A319TBT12_CRF_ITEM_GRP_CD[0] ;
               A317TBT12_CRF_ID = P005Z7_A317TBT12_CRF_ID[0] ;
               A316TBT12_SUBJECT_ID = P005Z7_A316TBT12_SUBJECT_ID[0] ;
               A315TBT12_STUDY_ID = P005Z7_A315TBT12_STUDY_ID[0] ;
               A587TBT12_EDIT_FLG = P005Z7_A587TBT12_EDIT_FLG[0] ;
               n587TBT12_EDIT_FLG = P005Z7_n587TBT12_EDIT_FLG[0] ;
               A320TBT12_CRF_VALUE = P005Z7_A320TBT12_CRF_VALUE[0] ;
               n320TBT12_CRF_VALUE = P005Z7_n320TBT12_CRF_VALUE[0] ;
               A324TBT12_UPD_DATETIME = P005Z7_A324TBT12_UPD_DATETIME[0] ;
               n324TBT12_UPD_DATETIME = P005Z7_n324TBT12_UPD_DATETIME[0] ;
               A325TBT12_UPD_USER_ID = P005Z7_A325TBT12_UPD_USER_ID[0] ;
               n325TBT12_UPD_USER_ID = P005Z7_n325TBT12_UPD_USER_ID[0] ;
               A326TBT12_UPD_PROG_NM = P005Z7_A326TBT12_UPD_PROG_NM[0] ;
               n326TBT12_UPD_PROG_NM = P005Z7_n326TBT12_UPD_PROG_NM[0] ;
               A327TBT12_UPD_CNT = P005Z7_A327TBT12_UPD_CNT[0] ;
               n327TBT12_UPD_CNT = P005Z7_n327TBT12_UPD_CNT[0] ;
               A318TBT12_CRF_ITEM_GRP_DIV = P005Z7_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
               AV53GXLvl290 = (byte)(1) ;
               if ( GXutil.strcmp(AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value(), AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org()) == 0 )
               {
                  A587TBT12_EDIT_FLG = "0" ;
                  n587TBT12_EDIT_FLG = false ;
                  AV44W_TBT12_EDIT_FLG = "0" ;
               }
               else
               {
                  A587TBT12_EDIT_FLG = "1" ;
                  n587TBT12_EDIT_FLG = false ;
                  AV44W_TBT12_EDIT_FLG = "1" ;
                  AV45W_MODE = "UPD" ;
               }
               A320TBT12_CRF_VALUE = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
               n320TBT12_CRF_VALUE = false ;
               A324TBT12_UPD_DATETIME = GXutil.now( ) ;
               n324TBT12_UPD_DATETIME = false ;
               A325TBT12_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n325TBT12_UPD_USER_ID = false ;
               A326TBT12_UPD_PROG_NM = AV51Pgmname ;
               n326TBT12_UPD_PROG_NM = false ;
               A327TBT12_UPD_CNT = (long)(A327TBT12_UPD_CNT+1) ;
               n327TBT12_UPD_CNT = false ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P005Z8 */
               pr_default.execute(6, new Object[] {new Boolean(n587TBT12_EDIT_FLG), A587TBT12_EDIT_FLG, new Boolean(n320TBT12_CRF_VALUE), A320TBT12_CRF_VALUE, new Boolean(n324TBT12_UPD_DATETIME), A324TBT12_UPD_DATETIME, new Boolean(n325TBT12_UPD_USER_ID), A325TBT12_UPD_USER_ID, new Boolean(n326TBT12_UPD_PROG_NM), A326TBT12_UPD_PROG_NM, new Boolean(n327TBT12_UPD_CNT), new Long(A327TBT12_UPD_CNT), new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
               if (true) break;
               /* Using cursor P005Z9 */
               pr_default.execute(7, new Object[] {new Boolean(n587TBT12_EDIT_FLG), A587TBT12_EDIT_FLG, new Boolean(n320TBT12_CRF_VALUE), A320TBT12_CRF_VALUE, new Boolean(n324TBT12_UPD_DATETIME), A324TBT12_UPD_DATETIME, new Boolean(n325TBT12_UPD_USER_ID), A325TBT12_UPD_USER_ID, new Boolean(n326TBT12_UPD_PROG_NM), A326TBT12_UPD_PROG_NM, new Boolean(n327TBT12_UPD_CNT), new Long(A327TBT12_UPD_CNT), new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD});
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV53GXLvl290 == 0 )
            {
               /*
                  INSERT RECORD ON TABLE TBT12_CRF_RESULT

               */
               A315TBT12_STUDY_ID = AV16P_STUDY_ID ;
               A316TBT12_SUBJECT_ID = AV17P_SUBJECT_ID ;
               A317TBT12_CRF_ID = AV12P_CRF_ID ;
               A318TBT12_CRF_ITEM_GRP_DIV = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div() ;
               A319TBT12_CRF_ITEM_GRP_CD = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd() ;
               A320TBT12_CRF_VALUE = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
               n320TBT12_CRF_VALUE = false ;
               if ( AV43W_TBT02_CRF_LATEST_VERSION == 1 )
               {
                  AV45W_MODE = "INS" ;
                  A587TBT12_EDIT_FLG = "0" ;
                  n587TBT12_EDIT_FLG = false ;
                  AV44W_TBT12_EDIT_FLG = "0" ;
               }
               else
               {
                  AV45W_MODE = "UPD" ;
                  A587TBT12_EDIT_FLG = "1" ;
                  n587TBT12_EDIT_FLG = false ;
                  AV44W_TBT12_EDIT_FLG = "1" ;
               }
               A328TBT12_DEL_FLG = "0" ;
               n328TBT12_DEL_FLG = false ;
               A321TBT12_CRT_DATETIME = GXutil.now( ) ;
               n321TBT12_CRT_DATETIME = false ;
               A322TBT12_CRT_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n322TBT12_CRT_USER_ID = false ;
               A323TBT12_CRT_PROG_NM = AV51Pgmname ;
               n323TBT12_CRT_PROG_NM = false ;
               A324TBT12_UPD_DATETIME = GXutil.now( ) ;
               n324TBT12_UPD_DATETIME = false ;
               A325TBT12_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n325TBT12_UPD_USER_ID = false ;
               A326TBT12_UPD_PROG_NM = AV51Pgmname ;
               n326TBT12_UPD_PROG_NM = false ;
               A327TBT12_UPD_CNT = 1 ;
               n327TBT12_UPD_CNT = false ;
               /* Using cursor P005Z10 */
               pr_default.execute(8, new Object[] {new Long(A315TBT12_STUDY_ID), new Integer(A316TBT12_SUBJECT_ID), new Short(A317TBT12_CRF_ID), A318TBT12_CRF_ITEM_GRP_DIV, A319TBT12_CRF_ITEM_GRP_CD, new Boolean(n320TBT12_CRF_VALUE), A320TBT12_CRF_VALUE, new Boolean(n587TBT12_EDIT_FLG), A587TBT12_EDIT_FLG, new Boolean(n328TBT12_DEL_FLG), A328TBT12_DEL_FLG, new Boolean(n321TBT12_CRT_DATETIME), A321TBT12_CRT_DATETIME, new Boolean(n322TBT12_CRT_USER_ID), A322TBT12_CRT_USER_ID, new Boolean(n323TBT12_CRT_PROG_NM), A323TBT12_CRT_PROG_NM, new Boolean(n324TBT12_UPD_DATETIME), A324TBT12_UPD_DATETIME, new Boolean(n325TBT12_UPD_USER_ID), A325TBT12_UPD_USER_ID, new Boolean(n326TBT12_UPD_PROG_NM), A326TBT12_UPD_PROG_NM, new Boolean(n327TBT12_UPD_CNT), new Long(A327TBT12_UPD_CNT)});
               if ( (pr_default.getStatus(8) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  AV27W_ERR_FLG = "1" ;
                  GXt_char10 = AV28W_ERR_MSG ;
                  GXv_char9[0] = GXt_char10 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00023", "CRFì¸óÕåãâ ", "", "", "", "", GXv_char9) ;
                  ab706_pc01_reg_crf_impl.this.GXt_char10 = GXv_char9[0] ;
                  AV28W_ERR_MSG = GXt_char10 ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
            }
            /*
               INSERT RECORD ON TABLE TBT13_CRF_RES_HIS

            */
            A496TBT13_STUDY_ID = AV16P_STUDY_ID ;
            A497TBT13_SUBJECT_ID = AV17P_SUBJECT_ID ;
            A498TBT13_CRF_ID = AV12P_CRF_ID ;
            A499TBT13_CRF_VERSION = AV43W_TBT02_CRF_LATEST_VERSION ;
            A500TBT13_CRF_ITEM_GRP_DIV = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div() ;
            A501TBT13_CRF_ITEM_GRP_CD = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd() ;
            A502TBT13_CRF_VALUE = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
            n502TBT13_CRF_VALUE = false ;
            A588TBT13_EDIT_FLG = AV44W_TBT12_EDIT_FLG ;
            n588TBT13_EDIT_FLG = false ;
            A503TBT13_DEL_FLG = "0" ;
            n503TBT13_DEL_FLG = false ;
            A504TBT13_CRT_DATETIME = GXutil.now( ) ;
            n504TBT13_CRT_DATETIME = false ;
            A505TBT13_CRT_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n505TBT13_CRT_USER_ID = false ;
            A506TBT13_CRT_PROG_NM = AV51Pgmname ;
            n506TBT13_CRT_PROG_NM = false ;
            A507TBT13_UPD_DATETIME = GXutil.now( ) ;
            n507TBT13_UPD_DATETIME = false ;
            A508TBT13_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n508TBT13_UPD_USER_ID = false ;
            A509TBT13_UPD_PROG_NM = AV51Pgmname ;
            n509TBT13_UPD_PROG_NM = false ;
            A510TBT13_UPD_CNT = 1 ;
            n510TBT13_UPD_CNT = false ;
            /* Using cursor P005Z11 */
            pr_default.execute(9, new Object[] {new Long(A496TBT13_STUDY_ID), new Integer(A497TBT13_SUBJECT_ID), new Short(A498TBT13_CRF_ID), new Short(A499TBT13_CRF_VERSION), A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD, new Boolean(n502TBT13_CRF_VALUE), A502TBT13_CRF_VALUE, new Boolean(n588TBT13_EDIT_FLG), A588TBT13_EDIT_FLG, new Boolean(n503TBT13_DEL_FLG), A503TBT13_DEL_FLG, new Boolean(n504TBT13_CRT_DATETIME), A504TBT13_CRT_DATETIME, new Boolean(n505TBT13_CRT_USER_ID), A505TBT13_CRT_USER_ID, new Boolean(n506TBT13_CRT_PROG_NM), A506TBT13_CRT_PROG_NM, new Boolean(n507TBT13_UPD_DATETIME), A507TBT13_UPD_DATETIME, new Boolean(n508TBT13_UPD_USER_ID), A508TBT13_UPD_USER_ID, new Boolean(n509TBT13_UPD_PROG_NM), A509TBT13_UPD_PROG_NM, new Boolean(n510TBT13_UPD_CNT), new Long(A510TBT13_UPD_CNT)});
            if ( (pr_default.getStatus(9) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               AV27W_ERR_FLG = "1" ;
               GXt_char10 = AV28W_ERR_MSG ;
               GXv_char9[0] = GXt_char10 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00023", "CRFèCê≥óöó", "", "", "", "", GXv_char9) ;
               ab706_pc01_reg_crf_impl.this.GXt_char10 = GXv_char9[0] ;
               AV28W_ERR_MSG = GXt_char10 ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            if ( ! (GXutil.strcmp("", AV45W_MODE)==0) )
            {
               AV31W_LOGTEXT = "" ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV16P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV17P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV12P_CRF_ID, 4, 0)) + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_ITEM_GRP_DIV:" + AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div() + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_ITEM_GRP_CD:" + AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd() + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_VALUE_BEFORE:" + AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org() + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_VALUE_AFTER:" + AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = GXutil.strReplace( AV31W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
               new a804_pc03_datalog(remoteHandle, context).execute( AV51Pgmname, AV45W_MODE, AV31W_LOGTEXT) ;
            }
         }
         AV52GXV3 = (int)(AV52GXV3+1) ;
      }
   }

   public void S14412( )
   {
      /* 'SUB_CRF_UPD_HISTORY_UPD_RIYU' Routine */
      /* Using cursor P005Z12 */
      pr_default.execute(10, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV17P_SUBJECT_ID), new Short(AV12P_CRF_ID)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A307TBT11_DEL_FLG = P005Z12_A307TBT11_DEL_FLG[0] ;
         n307TBT11_DEL_FLG = P005Z12_n307TBT11_DEL_FLG[0] ;
         A305TBT11_CRF_ID = P005Z12_A305TBT11_CRF_ID[0] ;
         A304TBT11_SUBJECT_ID = P005Z12_A304TBT11_SUBJECT_ID[0] ;
         A303TBT11_STUDY_ID = P005Z12_A303TBT11_STUDY_ID[0] ;
         A309TBT11_CRT_USER_ID = P005Z12_A309TBT11_CRT_USER_ID[0] ;
         n309TBT11_CRT_USER_ID = P005Z12_n309TBT11_CRT_USER_ID[0] ;
         A884TBT11_UPD_RIYU = P005Z12_A884TBT11_UPD_RIYU[0] ;
         n884TBT11_UPD_RIYU = P005Z12_n884TBT11_UPD_RIYU[0] ;
         A311TBT11_UPD_DATETIME = P005Z12_A311TBT11_UPD_DATETIME[0] ;
         n311TBT11_UPD_DATETIME = P005Z12_n311TBT11_UPD_DATETIME[0] ;
         A312TBT11_UPD_USER_ID = P005Z12_A312TBT11_UPD_USER_ID[0] ;
         n312TBT11_UPD_USER_ID = P005Z12_n312TBT11_UPD_USER_ID[0] ;
         A313TBT11_UPD_PROG_NM = P005Z12_A313TBT11_UPD_PROG_NM[0] ;
         n313TBT11_UPD_PROG_NM = P005Z12_n313TBT11_UPD_PROG_NM[0] ;
         A314TBT11_UPD_CNT = P005Z12_A314TBT11_UPD_CNT[0] ;
         n314TBT11_UPD_CNT = P005Z12_n314TBT11_UPD_CNT[0] ;
         A306TBT11_CRF_VERSION = P005Z12_A306TBT11_CRF_VERSION[0] ;
         if ( GXutil.strcmp(A309TBT11_CRT_USER_ID, AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()) != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P005Z13 */
            pr_default.execute(11, new Object[] {new Boolean(n884TBT11_UPD_RIYU), A884TBT11_UPD_RIYU, new Boolean(n311TBT11_UPD_DATETIME), A311TBT11_UPD_DATETIME, new Boolean(n312TBT11_UPD_USER_ID), A312TBT11_UPD_USER_ID, new Boolean(n313TBT11_UPD_PROG_NM), A313TBT11_UPD_PROG_NM, new Boolean(n314TBT11_UPD_CNT), new Long(A314TBT11_UPD_CNT), new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
            if (true) break;
         }
         A884TBT11_UPD_RIYU = AV18P_UPD_RIYU ;
         n884TBT11_UPD_RIYU = false ;
         A311TBT11_UPD_DATETIME = GXutil.now( ) ;
         n311TBT11_UPD_DATETIME = false ;
         A312TBT11_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n312TBT11_UPD_USER_ID = false ;
         A313TBT11_UPD_PROG_NM = AV51Pgmname ;
         n313TBT11_UPD_PROG_NM = false ;
         A314TBT11_UPD_CNT = (long)(A314TBT11_UPD_CNT+1) ;
         n314TBT11_UPD_CNT = false ;
         AV31W_LOGTEXT = "" ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV16P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV17P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV12P_CRF_ID, 4, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "DM_ARRIVAL_FLG:" + AV14P_DM_ARRIVAL_FLG + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "UPD_RIYU:" + AV18P_UPD_RIYU + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = GXutil.strReplace( AV31W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV51Pgmname, "UPD", AV31W_LOGTEXT) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P005Z14 */
         pr_default.execute(12, new Object[] {new Boolean(n884TBT11_UPD_RIYU), A884TBT11_UPD_RIYU, new Boolean(n311TBT11_UPD_DATETIME), A311TBT11_UPD_DATETIME, new Boolean(n312TBT11_UPD_USER_ID), A312TBT11_UPD_USER_ID, new Boolean(n313TBT11_UPD_PROG_NM), A313TBT11_UPD_PROG_NM, new Boolean(n314TBT11_UPD_CNT), new Long(A314TBT11_UPD_CNT), new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
         if (true) break;
         /* Using cursor P005Z15 */
         pr_default.execute(13, new Object[] {new Boolean(n884TBT11_UPD_RIYU), A884TBT11_UPD_RIYU, new Boolean(n311TBT11_UPD_DATETIME), A311TBT11_UPD_DATETIME, new Boolean(n312TBT11_UPD_USER_ID), A312TBT11_UPD_USER_ID, new Boolean(n313TBT11_UPD_PROG_NM), A313TBT11_UPD_PROG_NM, new Boolean(n314TBT11_UPD_CNT), new Long(A314TBT11_UPD_CNT), new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S15460( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT11[0] = AV24W_A_LOGIN_SDT;
      GXv_char9[0] = AV29W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT11, GXv_char9) ;
      AV24W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT11[0] ;
      ab706_pc01_reg_crf_impl.this.AV29W_ERRCD = GXv_char9[0] ;
      if ( GXutil.strcmp(AV29W_ERRCD, "0") != 0 )
      {
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( "9" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SD_B706_SD01_CRF_REG_RTN", AV20SD_B706_SD01_CRF_REG_RTN);
         AV10HttpResponse.addString(AV20SD_B706_SD01_CRF_REG_RTN.toJSonString());
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXv_char9[0] = AV8C_DM_AUTH_CD ;
      GXv_int12[0] = (byte)(AV9C_DM_INPUT_LEVEL) ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char9, GXv_int12) ;
      ab706_pc01_reg_crf_impl.this.AV8C_DM_AUTH_CD = GXv_char9[0] ;
      ab706_pc01_reg_crf_impl.this.AV9C_DM_INPUT_LEVEL = GXv_int12[0] ;
      GXt_char10 = AV39W_SESSION_KEY ;
      GXv_char9[0] = GXt_char10 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char9) ;
      ab706_pc01_reg_crf_impl.this.GXt_char10 = GXv_char9[0] ;
      AV39W_SESSION_KEY = GXt_char10 ;
      AV21SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV38W_SESSION.getValue(AV39W_SESSION_KEY), "");
      new a804_pc02_log_start(remoteHandle, context).execute( AV51Pgmname) ;
   }

   public void S16492( )
   {
      /* 'SUB_ERROR' Routine */
      AV27W_ERR_FLG = "1" ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV51Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( "9" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20SD_B706_SD01_CRF_REG_RTN", AV20SD_B706_SD01_CRF_REG_RTN);
      AV10HttpResponse.addString(AV20SD_B706_SD01_CRF_REG_RTN.toJSonString());
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
                  /* Execute user subroutine: S16492 */
                  S16492 ();
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
      gxfirstwebparm = "" ;
      AV14P_DM_ARRIVAL_FLG = "" ;
      AV19P_USER_ID = "" ;
      AV15P_PASSWORD = "" ;
      AV11P_AUTH_CD = "" ;
      AV18P_UPD_RIYU = "" ;
      AV36W_REG_FLG = "" ;
      AV27W_ERR_FLG = "" ;
      AV28W_ERR_MSG = "" ;
      AV22SD_B792_SD01_CRF = new SdtB792_SD01_CRF(remoteHandle, context);
      AV37W_RTN_CD = "" ;
      AV38W_SESSION = httpContext.getWebSession();
      AV21SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      AV34W_MSG = "" ;
      GXv_SdtB792_SD01_CRF1 = new SdtB792_SD01_CRF [1] ;
      AV23SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      AV20SD_B706_SD01_CRF_REG_RTN = new SdtB706_SD01_CRF_REG_RTN(remoteHandle, context);
      AV10HttpResponse = httpContext.getHttpResponse();
      AV24W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV33W_MODE_KBN = "" ;
      GXv_char3 = new String [1] ;
      AV32W_MEMO_INP_FLG = "" ;
      GXv_char2 = new String [1] ;
      AV26W_DM_ARRI_INP_FLG = "" ;
      GXv_char4 = new String [1] ;
      AV41W_STUDY_NM = "" ;
      GXv_char5 = new String [1] ;
      AV25W_CRF_SNM = "" ;
      GXv_char6 = new String [1] ;
      GXv_int7 = new short [1] ;
      GXv_char8 = new String [1] ;
      scmdbuf = "" ;
      P005Z2_A292TBT02_STUDY_ID = new long[1] ;
      P005Z2_A293TBT02_SUBJECT_ID = new int[1] ;
      P005Z2_A294TBT02_CRF_ID = new short[1] ;
      P005Z2_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      P005Z2_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P005Z2_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P005Z2_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P005Z2_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005Z2_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      P005Z2_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      P005Z2_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      P005Z2_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      P005Z2_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P005Z2_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P005Z2_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005Z2_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005Z2_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P005Z2_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      P005Z2_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      P005Z2_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005Z2_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      P005Z2_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      P005Z2_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      P005Z2_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      P005Z2_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P005Z2_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P005Z2_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P005Z2_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005Z2_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      P005Z2_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      P005Z2_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      P005Z2_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      P005Z2_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P005Z2_A295TBT02_DEL_FLG = new String[] {""} ;
      P005Z2_n295TBT02_DEL_FLG = new boolean[] {false} ;
      P005Z2_A302TBT02_UPD_CNT = new long[1] ;
      P005Z2_n302TBT02_UPD_CNT = new boolean[] {false} ;
      P005Z2_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005Z2_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      P005Z2_A300TBT02_UPD_USER_ID = new String[] {""} ;
      P005Z2_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      P005Z2_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      P005Z2_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A561TBT02_UPLOAD_USER_ID = "" ;
      A562TBT02_UPLOAD_AUTH_CD = "" ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A565TBT02_APPROVAL_FLG = "" ;
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A567TBT02_APPROVAL_USER_ID = "" ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A571TBT02_INPUT_END_USER_ID = "" ;
      A572TBT02_INPUT_END_AUTH_CD = "" ;
      A295TBT02_DEL_FLG = "" ;
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A300TBT02_UPD_USER_ID = "" ;
      A301TBT02_UPD_PROG_NM = "" ;
      AV51Pgmname = "" ;
      A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A575TBT11_UPLOAD_USER_ID = "" ;
      A576TBT11_UPLOAD_AUTH_CD = "" ;
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A579TBT11_APPROVAL_FLG = "" ;
      A580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A581TBT11_APPROVAL_USER_ID = "" ;
      A582TBT11_APPROVAL_AUTH_CD = "" ;
      A583TBT11_INPUT_END_FLG = "" ;
      A584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A585TBT11_INPUT_END_USER_ID = "" ;
      A586TBT11_INPUT_END_AUTH_CD = "" ;
      A884TBT11_UPD_RIYU = "" ;
      A307TBT11_DEL_FLG = "" ;
      A308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A309TBT11_CRT_USER_ID = "" ;
      A310TBT11_CRT_PROG_NM = "" ;
      A311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A312TBT11_UPD_USER_ID = "" ;
      A313TBT11_UPD_PROG_NM = "" ;
      Gx_emsg = "" ;
      AV31W_LOGTEXT = "" ;
      AV45W_MODE = "" ;
      P005Z7_A328TBT12_DEL_FLG = new String[] {""} ;
      P005Z7_n328TBT12_DEL_FLG = new boolean[] {false} ;
      P005Z7_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005Z7_A317TBT12_CRF_ID = new short[1] ;
      P005Z7_A316TBT12_SUBJECT_ID = new int[1] ;
      P005Z7_A315TBT12_STUDY_ID = new long[1] ;
      P005Z7_A587TBT12_EDIT_FLG = new String[] {""} ;
      P005Z7_n587TBT12_EDIT_FLG = new boolean[] {false} ;
      P005Z7_A320TBT12_CRF_VALUE = new String[] {""} ;
      P005Z7_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      P005Z7_A324TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005Z7_n324TBT12_UPD_DATETIME = new boolean[] {false} ;
      P005Z7_A325TBT12_UPD_USER_ID = new String[] {""} ;
      P005Z7_n325TBT12_UPD_USER_ID = new boolean[] {false} ;
      P005Z7_A326TBT12_UPD_PROG_NM = new String[] {""} ;
      P005Z7_n326TBT12_UPD_PROG_NM = new boolean[] {false} ;
      P005Z7_A327TBT12_UPD_CNT = new long[1] ;
      P005Z7_n327TBT12_UPD_CNT = new boolean[] {false} ;
      P005Z7_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A328TBT12_DEL_FLG = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A587TBT12_EDIT_FLG = "" ;
      A320TBT12_CRF_VALUE = "" ;
      A324TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A325TBT12_UPD_USER_ID = "" ;
      A326TBT12_UPD_PROG_NM = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      AV44W_TBT12_EDIT_FLG = "" ;
      A321TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A322TBT12_CRT_USER_ID = "" ;
      A323TBT12_CRT_PROG_NM = "" ;
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
      P005Z12_A307TBT11_DEL_FLG = new String[] {""} ;
      P005Z12_n307TBT11_DEL_FLG = new boolean[] {false} ;
      P005Z12_A305TBT11_CRF_ID = new short[1] ;
      P005Z12_A304TBT11_SUBJECT_ID = new int[1] ;
      P005Z12_A303TBT11_STUDY_ID = new long[1] ;
      P005Z12_A309TBT11_CRT_USER_ID = new String[] {""} ;
      P005Z12_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      P005Z12_A884TBT11_UPD_RIYU = new String[] {""} ;
      P005Z12_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      P005Z12_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005Z12_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      P005Z12_A312TBT11_UPD_USER_ID = new String[] {""} ;
      P005Z12_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      P005Z12_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      P005Z12_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      P005Z12_A314TBT11_UPD_CNT = new long[1] ;
      P005Z12_n314TBT11_UPD_CNT = new boolean[] {false} ;
      P005Z12_A306TBT11_CRF_VERSION = new short[1] ;
      GXv_SdtA_LOGIN_SDT11 = new SdtA_LOGIN_SDT [1] ;
      AV29W_ERRCD = "" ;
      AV8C_DM_AUTH_CD = "" ;
      GXv_int12 = new byte [1] ;
      AV39W_SESSION_KEY = "" ;
      GXv_char9 = new String [1] ;
      GXt_char10 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab706_pc01_reg_crf__default(),
         new Object[] {
             new Object[] {
            P005Z2_A292TBT02_STUDY_ID, P005Z2_A293TBT02_SUBJECT_ID, P005Z2_A294TBT02_CRF_ID, P005Z2_A370TBT02_CRF_LATEST_VERSION, P005Z2_n370TBT02_CRF_LATEST_VERSION, P005Z2_A371TBT02_CRF_INPUT_LEVEL, P005Z2_n371TBT02_CRF_INPUT_LEVEL, P005Z2_A560TBT02_UPLOAD_DATETIME, P005Z2_n560TBT02_UPLOAD_DATETIME, P005Z2_A561TBT02_UPLOAD_USER_ID,
            P005Z2_n561TBT02_UPLOAD_USER_ID, P005Z2_A562TBT02_UPLOAD_AUTH_CD, P005Z2_n562TBT02_UPLOAD_AUTH_CD, P005Z2_A563TBT02_DM_ARRIVAL_FLG, P005Z2_n563TBT02_DM_ARRIVAL_FLG, P005Z2_A564TBT02_DM_ARRIVAL_DATETIME, P005Z2_n564TBT02_DM_ARRIVAL_DATETIME, P005Z2_A565TBT02_APPROVAL_FLG, P005Z2_n565TBT02_APPROVAL_FLG, P005Z2_A566TBT02_APPROVAL_DATETIME,
            P005Z2_n566TBT02_APPROVAL_DATETIME, P005Z2_A567TBT02_APPROVAL_USER_ID, P005Z2_n567TBT02_APPROVAL_USER_ID, P005Z2_A568TBT02_APPROVAL_AUTH_CD, P005Z2_n568TBT02_APPROVAL_AUTH_CD, P005Z2_A569TBT02_INPUT_END_FLG, P005Z2_n569TBT02_INPUT_END_FLG, P005Z2_A570TBT02_INPUT_END_DATETIME, P005Z2_n570TBT02_INPUT_END_DATETIME, P005Z2_A571TBT02_INPUT_END_USER_ID,
            P005Z2_n571TBT02_INPUT_END_USER_ID, P005Z2_A572TBT02_INPUT_END_AUTH_CD, P005Z2_n572TBT02_INPUT_END_AUTH_CD, P005Z2_A295TBT02_DEL_FLG, P005Z2_n295TBT02_DEL_FLG, P005Z2_A302TBT02_UPD_CNT, P005Z2_n302TBT02_UPD_CNT, P005Z2_A299TBT02_UPD_DATETIME, P005Z2_n299TBT02_UPD_DATETIME, P005Z2_A300TBT02_UPD_USER_ID,
            P005Z2_n300TBT02_UPD_USER_ID, P005Z2_A301TBT02_UPD_PROG_NM, P005Z2_n301TBT02_UPD_PROG_NM
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
            P005Z7_A328TBT12_DEL_FLG, P005Z7_n328TBT12_DEL_FLG, P005Z7_A319TBT12_CRF_ITEM_GRP_CD, P005Z7_A317TBT12_CRF_ID, P005Z7_A316TBT12_SUBJECT_ID, P005Z7_A315TBT12_STUDY_ID, P005Z7_A587TBT12_EDIT_FLG, P005Z7_n587TBT12_EDIT_FLG, P005Z7_A320TBT12_CRF_VALUE, P005Z7_n320TBT12_CRF_VALUE,
            P005Z7_A324TBT12_UPD_DATETIME, P005Z7_n324TBT12_UPD_DATETIME, P005Z7_A325TBT12_UPD_USER_ID, P005Z7_n325TBT12_UPD_USER_ID, P005Z7_A326TBT12_UPD_PROG_NM, P005Z7_n326TBT12_UPD_PROG_NM, P005Z7_A327TBT12_UPD_CNT, P005Z7_n327TBT12_UPD_CNT, P005Z7_A318TBT12_CRF_ITEM_GRP_DIV
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
            P005Z12_A307TBT11_DEL_FLG, P005Z12_n307TBT11_DEL_FLG, P005Z12_A305TBT11_CRF_ID, P005Z12_A304TBT11_SUBJECT_ID, P005Z12_A303TBT11_STUDY_ID, P005Z12_A309TBT11_CRT_USER_ID, P005Z12_n309TBT11_CRT_USER_ID, P005Z12_A884TBT11_UPD_RIYU, P005Z12_n884TBT11_UPD_RIYU, P005Z12_A311TBT11_UPD_DATETIME,
            P005Z12_n311TBT11_UPD_DATETIME, P005Z12_A312TBT11_UPD_USER_ID, P005Z12_n312TBT11_UPD_USER_ID, P005Z12_A313TBT11_UPD_PROG_NM, P005Z12_n313TBT11_UPD_PROG_NM, P005Z12_A314TBT11_UPD_CNT, P005Z12_n314TBT11_UPD_CNT, P005Z12_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV51Pgmname = "AB706_PC01_REG_CRF" ;
      /* GeneXus formulas. */
      AV51Pgmname = "AB706_PC01_REG_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private byte A573TBT11_CRF_INPUT_LEVEL ;
   private byte AV53GXLvl290 ;
   private byte GXv_int12[] ;
   private short AV12P_CRF_ID ;
   private short AV13P_CRF_LATEST_VERSION ;
   private short AV42W_TBM31_GRID_SIZE ;
   private short GXv_int7[] ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short AV9C_DM_INPUT_LEVEL ;
   private short AV43W_TBT02_CRF_LATEST_VERSION ;
   private short A305TBT11_CRF_ID ;
   private short A306TBT11_CRF_VERSION ;
   private short Gx_err ;
   private short A317TBT12_CRF_ID ;
   private short A498TBT13_CRF_ID ;
   private short A499TBT13_CRF_VERSION ;
   private int AV17P_SUBJECT_ID ;
   private int AV48GXV1 ;
   private int AV49GXV2 ;
   private int A293TBT02_SUBJECT_ID ;
   private int GX_INS25 ;
   private int A304TBT11_SUBJECT_ID ;
   private int AV52GXV3 ;
   private int A316TBT12_SUBJECT_ID ;
   private int GX_INS26 ;
   private int GX_INS37 ;
   private int A497TBT13_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV16P_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private long A303TBT11_STUDY_ID ;
   private long A314TBT11_UPD_CNT ;
   private long A315TBT12_STUDY_ID ;
   private long A327TBT12_UPD_CNT ;
   private long A496TBT13_STUDY_ID ;
   private long A510TBT13_UPD_CNT ;
   private String gxfirstwebparm ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String scmdbuf ;
   private String AV51Pgmname ;
   private String Gx_emsg ;
   private String GXv_char9[] ;
   private String GXt_char10 ;
   private java.util.Date A560TBT02_UPLOAD_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A566TBT02_APPROVAL_DATETIME ;
   private java.util.Date A570TBT02_INPUT_END_DATETIME ;
   private java.util.Date A299TBT02_UPD_DATETIME ;
   private java.util.Date A574TBT11_UPLOAD_DATETIME ;
   private java.util.Date A578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A580TBT11_APPROVAL_DATETIME ;
   private java.util.Date A584TBT11_INPUT_END_DATETIME ;
   private java.util.Date A308TBT11_CRT_DATETIME ;
   private java.util.Date A311TBT11_UPD_DATETIME ;
   private java.util.Date A324TBT12_UPD_DATETIME ;
   private java.util.Date A321TBT12_CRT_DATETIME ;
   private java.util.Date A504TBT13_CRT_DATETIME ;
   private java.util.Date A507TBT13_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n560TBT02_UPLOAD_DATETIME ;
   private boolean n561TBT02_UPLOAD_USER_ID ;
   private boolean n562TBT02_UPLOAD_AUTH_CD ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n565TBT02_APPROVAL_FLG ;
   private boolean n566TBT02_APPROVAL_DATETIME ;
   private boolean n567TBT02_APPROVAL_USER_ID ;
   private boolean n568TBT02_APPROVAL_AUTH_CD ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n570TBT02_INPUT_END_DATETIME ;
   private boolean n571TBT02_INPUT_END_USER_ID ;
   private boolean n572TBT02_INPUT_END_AUTH_CD ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean n299TBT02_UPD_DATETIME ;
   private boolean n300TBT02_UPD_USER_ID ;
   private boolean n301TBT02_UPD_PROG_NM ;
   private boolean n573TBT11_CRF_INPUT_LEVEL ;
   private boolean n574TBT11_UPLOAD_DATETIME ;
   private boolean n575TBT11_UPLOAD_USER_ID ;
   private boolean n576TBT11_UPLOAD_AUTH_CD ;
   private boolean n577TBT11_DM_ARRIVAL_FLG ;
   private boolean n578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n579TBT11_APPROVAL_FLG ;
   private boolean n580TBT11_APPROVAL_DATETIME ;
   private boolean n581TBT11_APPROVAL_USER_ID ;
   private boolean n582TBT11_APPROVAL_AUTH_CD ;
   private boolean n583TBT11_INPUT_END_FLG ;
   private boolean n584TBT11_INPUT_END_DATETIME ;
   private boolean n585TBT11_INPUT_END_USER_ID ;
   private boolean n586TBT11_INPUT_END_AUTH_CD ;
   private boolean n884TBT11_UPD_RIYU ;
   private boolean n307TBT11_DEL_FLG ;
   private boolean n308TBT11_CRT_DATETIME ;
   private boolean n309TBT11_CRT_USER_ID ;
   private boolean n310TBT11_CRT_PROG_NM ;
   private boolean n311TBT11_UPD_DATETIME ;
   private boolean n312TBT11_UPD_USER_ID ;
   private boolean n313TBT11_UPD_PROG_NM ;
   private boolean n314TBT11_UPD_CNT ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n587TBT12_EDIT_FLG ;
   private boolean n320TBT12_CRF_VALUE ;
   private boolean n324TBT12_UPD_DATETIME ;
   private boolean n325TBT12_UPD_USER_ID ;
   private boolean n326TBT12_UPD_PROG_NM ;
   private boolean n327TBT12_UPD_CNT ;
   private boolean n321TBT12_CRT_DATETIME ;
   private boolean n322TBT12_CRT_USER_ID ;
   private boolean n323TBT12_CRT_PROG_NM ;
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
   private String AV14P_DM_ARRIVAL_FLG ;
   private String AV19P_USER_ID ;
   private String AV15P_PASSWORD ;
   private String AV11P_AUTH_CD ;
   private String AV18P_UPD_RIYU ;
   private String AV36W_REG_FLG ;
   private String AV27W_ERR_FLG ;
   private String AV28W_ERR_MSG ;
   private String AV37W_RTN_CD ;
   private String AV34W_MSG ;
   private String AV33W_MODE_KBN ;
   private String AV32W_MEMO_INP_FLG ;
   private String AV26W_DM_ARRI_INP_FLG ;
   private String AV41W_STUDY_NM ;
   private String AV25W_CRF_SNM ;
   private String A561TBT02_UPLOAD_USER_ID ;
   private String A562TBT02_UPLOAD_AUTH_CD ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String A565TBT02_APPROVAL_FLG ;
   private String A567TBT02_APPROVAL_USER_ID ;
   private String A568TBT02_APPROVAL_AUTH_CD ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A571TBT02_INPUT_END_USER_ID ;
   private String A572TBT02_INPUT_END_AUTH_CD ;
   private String A295TBT02_DEL_FLG ;
   private String A300TBT02_UPD_USER_ID ;
   private String A301TBT02_UPD_PROG_NM ;
   private String A575TBT11_UPLOAD_USER_ID ;
   private String A576TBT11_UPLOAD_AUTH_CD ;
   private String A577TBT11_DM_ARRIVAL_FLG ;
   private String A579TBT11_APPROVAL_FLG ;
   private String A581TBT11_APPROVAL_USER_ID ;
   private String A582TBT11_APPROVAL_AUTH_CD ;
   private String A583TBT11_INPUT_END_FLG ;
   private String A585TBT11_INPUT_END_USER_ID ;
   private String A586TBT11_INPUT_END_AUTH_CD ;
   private String A884TBT11_UPD_RIYU ;
   private String A307TBT11_DEL_FLG ;
   private String A309TBT11_CRT_USER_ID ;
   private String A310TBT11_CRT_PROG_NM ;
   private String A312TBT11_UPD_USER_ID ;
   private String A313TBT11_UPD_PROG_NM ;
   private String AV31W_LOGTEXT ;
   private String AV45W_MODE ;
   private String A328TBT12_DEL_FLG ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A587TBT12_EDIT_FLG ;
   private String A320TBT12_CRF_VALUE ;
   private String A325TBT12_UPD_USER_ID ;
   private String A326TBT12_UPD_PROG_NM ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String AV44W_TBT12_EDIT_FLG ;
   private String A322TBT12_CRT_USER_ID ;
   private String A323TBT12_CRT_PROG_NM ;
   private String A500TBT13_CRF_ITEM_GRP_DIV ;
   private String A501TBT13_CRF_ITEM_GRP_CD ;
   private String A502TBT13_CRF_VALUE ;
   private String A588TBT13_EDIT_FLG ;
   private String A503TBT13_DEL_FLG ;
   private String A505TBT13_CRT_USER_ID ;
   private String A506TBT13_CRT_PROG_NM ;
   private String A508TBT13_UPD_USER_ID ;
   private String A509TBT13_UPD_PROG_NM ;
   private String AV29W_ERRCD ;
   private String AV8C_DM_AUTH_CD ;
   private String AV39W_SESSION_KEY ;
   private com.genexus.webpanels.WebSession AV38W_SESSION ;
   private SdtB706_SD01_CRF_REG_RTN AV20SD_B706_SD01_CRF_REG_RTN ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV21SD_B792_SD00_HTML5_EXEC_INFO ;
   private IDataStoreProvider pr_default ;
   private long[] P005Z2_A292TBT02_STUDY_ID ;
   private int[] P005Z2_A293TBT02_SUBJECT_ID ;
   private short[] P005Z2_A294TBT02_CRF_ID ;
   private short[] P005Z2_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] P005Z2_n370TBT02_CRF_LATEST_VERSION ;
   private byte[] P005Z2_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P005Z2_n371TBT02_CRF_INPUT_LEVEL ;
   private java.util.Date[] P005Z2_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] P005Z2_n560TBT02_UPLOAD_DATETIME ;
   private String[] P005Z2_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] P005Z2_n561TBT02_UPLOAD_USER_ID ;
   private String[] P005Z2_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] P005Z2_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] P005Z2_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P005Z2_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005Z2_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P005Z2_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P005Z2_A565TBT02_APPROVAL_FLG ;
   private boolean[] P005Z2_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] P005Z2_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] P005Z2_n566TBT02_APPROVAL_DATETIME ;
   private String[] P005Z2_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] P005Z2_n567TBT02_APPROVAL_USER_ID ;
   private String[] P005Z2_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] P005Z2_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] P005Z2_A569TBT02_INPUT_END_FLG ;
   private boolean[] P005Z2_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] P005Z2_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] P005Z2_n570TBT02_INPUT_END_DATETIME ;
   private String[] P005Z2_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] P005Z2_n571TBT02_INPUT_END_USER_ID ;
   private String[] P005Z2_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] P005Z2_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] P005Z2_A295TBT02_DEL_FLG ;
   private boolean[] P005Z2_n295TBT02_DEL_FLG ;
   private long[] P005Z2_A302TBT02_UPD_CNT ;
   private boolean[] P005Z2_n302TBT02_UPD_CNT ;
   private java.util.Date[] P005Z2_A299TBT02_UPD_DATETIME ;
   private boolean[] P005Z2_n299TBT02_UPD_DATETIME ;
   private String[] P005Z2_A300TBT02_UPD_USER_ID ;
   private boolean[] P005Z2_n300TBT02_UPD_USER_ID ;
   private String[] P005Z2_A301TBT02_UPD_PROG_NM ;
   private boolean[] P005Z2_n301TBT02_UPD_PROG_NM ;
   private String[] P005Z7_A328TBT12_DEL_FLG ;
   private boolean[] P005Z7_n328TBT12_DEL_FLG ;
   private String[] P005Z7_A319TBT12_CRF_ITEM_GRP_CD ;
   private short[] P005Z7_A317TBT12_CRF_ID ;
   private int[] P005Z7_A316TBT12_SUBJECT_ID ;
   private long[] P005Z7_A315TBT12_STUDY_ID ;
   private String[] P005Z7_A587TBT12_EDIT_FLG ;
   private boolean[] P005Z7_n587TBT12_EDIT_FLG ;
   private String[] P005Z7_A320TBT12_CRF_VALUE ;
   private boolean[] P005Z7_n320TBT12_CRF_VALUE ;
   private java.util.Date[] P005Z7_A324TBT12_UPD_DATETIME ;
   private boolean[] P005Z7_n324TBT12_UPD_DATETIME ;
   private String[] P005Z7_A325TBT12_UPD_USER_ID ;
   private boolean[] P005Z7_n325TBT12_UPD_USER_ID ;
   private String[] P005Z7_A326TBT12_UPD_PROG_NM ;
   private boolean[] P005Z7_n326TBT12_UPD_PROG_NM ;
   private long[] P005Z7_A327TBT12_UPD_CNT ;
   private boolean[] P005Z7_n327TBT12_UPD_CNT ;
   private String[] P005Z7_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P005Z12_A307TBT11_DEL_FLG ;
   private boolean[] P005Z12_n307TBT11_DEL_FLG ;
   private short[] P005Z12_A305TBT11_CRF_ID ;
   private int[] P005Z12_A304TBT11_SUBJECT_ID ;
   private long[] P005Z12_A303TBT11_STUDY_ID ;
   private String[] P005Z12_A309TBT11_CRT_USER_ID ;
   private boolean[] P005Z12_n309TBT11_CRT_USER_ID ;
   private String[] P005Z12_A884TBT11_UPD_RIYU ;
   private boolean[] P005Z12_n884TBT11_UPD_RIYU ;
   private java.util.Date[] P005Z12_A311TBT11_UPD_DATETIME ;
   private boolean[] P005Z12_n311TBT11_UPD_DATETIME ;
   private String[] P005Z12_A312TBT11_UPD_USER_ID ;
   private boolean[] P005Z12_n312TBT11_UPD_USER_ID ;
   private String[] P005Z12_A313TBT11_UPD_PROG_NM ;
   private boolean[] P005Z12_n313TBT11_UPD_PROG_NM ;
   private long[] P005Z12_A314TBT11_UPD_CNT ;
   private boolean[] P005Z12_n314TBT11_UPD_CNT ;
   private short[] P005Z12_A306TBT11_CRF_VERSION ;
   private com.genexus.internet.HttpResponse AV10HttpResponse ;
   private SdtB792_SD01_CRF AV22SD_B792_SD01_CRF ;
   private SdtB792_SD01_CRF GXv_SdtB792_SD01_CRF1[] ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV23SD_B792_SD02_CRF_RESULT_I ;
   private SdtA_LOGIN_SDT AV24W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT11[] ;
}

final  class ab706_pc01_reg_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005Z2", "SELECT `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_UPD_CNT`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_PROG_NM` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P005Z3", "UPDATE `TBT02_CRF` SET `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_UPD_CNT`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005Z4", "INSERT INTO `TBT11_CRF_HISTORY` (`TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_PROG_NM`, `TBT11_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005Z5", "UPDATE `TBT02_CRF` SET `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_UPD_CNT`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005Z6", "UPDATE `TBT02_CRF` SET `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_UPD_CNT`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005Z7", "SELECT `TBT12_DEL_FLG`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_EDIT_FLG`, `TBT12_CRF_VALUE`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_PROG_NM`, `TBT12_UPD_CNT`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?) AND (`TBT12_CRF_ITEM_GRP_CD` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`  LIMIT 1 FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P005Z8", "UPDATE `TBT12_CRF_RESULT` SET `TBT12_EDIT_FLG`=?, `TBT12_CRF_VALUE`=?, `TBT12_UPD_DATETIME`=?, `TBT12_UPD_USER_ID`=?, `TBT12_UPD_PROG_NM`=?, `TBT12_UPD_CNT`=?  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005Z9", "UPDATE `TBT12_CRF_RESULT` SET `TBT12_EDIT_FLG`=?, `TBT12_CRF_VALUE`=?, `TBT12_UPD_DATETIME`=?, `TBT12_UPD_USER_ID`=?, `TBT12_UPD_PROG_NM`=?, `TBT12_UPD_CNT`=?  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005Z10", "INSERT INTO `TBT12_CRF_RESULT` (`TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_PROG_NM`, `TBT12_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005Z11", "INSERT INTO `TBT13_CRF_RES_HIS` (`TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_PROG_NM`, `TBT13_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005Z12", "SELECT `TBT11_DEL_FLG`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_CRT_USER_ID`, `TBT11_UPD_RIYU`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_PROG_NM`, `TBT11_UPD_CNT`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ?) AND (`TBT11_SUBJECT_ID` = ?) AND (`TBT11_CRF_ID` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_CRF_VERSION` DESC  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005Z13", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_UPD_RIYU`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_PROG_NM`=?, `TBT11_UPD_CNT`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005Z14", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_UPD_RIYU`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_PROG_NM`=?, `TBT11_UPD_CNT`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005Z15", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_UPD_RIYU`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_PROG_NM`=?, `TBT11_UPD_CNT`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               break;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 2);
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
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setLong(12, ((Number) parms[22]).longValue());
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setShort(14, ((Number) parms[24]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
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
                  stmt.setVarchar(8, (String)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 1);
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
                  stmt.setVarchar(14, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 128);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[33], 2000);
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
               break;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 2);
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
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setLong(12, ((Number) parms[22]).longValue());
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setShort(14, ((Number) parms[24]).shortValue());
               break;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 2);
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
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setLong(12, ((Number) parms[22]).longValue());
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setShort(14, ((Number) parms[24]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 50);
               break;
            case 6 :
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
                  stmt.setVarchar(2, (String)parms[3], 2000);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[11]).longValue());
               }
               stmt.setLong(7, ((Number) parms[12]).longValue());
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setVarchar(10, (String)parms[15], 1, false);
               stmt.setVarchar(11, (String)parms[16], 50, false);
               break;
            case 7 :
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
                  stmt.setVarchar(2, (String)parms[3], 2000);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[11]).longValue());
               }
               stmt.setLong(7, ((Number) parms[12]).longValue());
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               stmt.setVarchar(10, (String)parms[15], 1, false);
               stmt.setVarchar(11, (String)parms[16], 50, false);
               break;
            case 8 :
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
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2000);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               stmt.setShort(9, ((Number) parms[13]).shortValue());
               break;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2000);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               stmt.setShort(9, ((Number) parms[13]).shortValue());
               break;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2000);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               stmt.setShort(9, ((Number) parms[13]).shortValue());
               break;
      }
   }

}

