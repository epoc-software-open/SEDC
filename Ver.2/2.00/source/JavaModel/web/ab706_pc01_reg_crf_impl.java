/*
               File: ab706_pc01_reg_crf_impl
        Description: CRFì¸óÕÉfÅ[É^ìoò^èàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:24.79
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
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV16P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV17P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV47P_CRF_ID_EDA_NO = httpContext.GetNextPar( ) ;
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
      /* Execute user subroutine: S151 */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV36W_REG_FLG = "0" ;
      AV27W_ERR_FLG = "0" ;
      AV28W_ERR_MSG = "" ;
      GXv_int1[0] = AV12P_CRF_ID ;
      GXv_int2[0] = AV46P_CRF_EDA_NO ;
      new b799_pc12_crf_id_eda_split(remoteHandle, context).execute( AV47P_CRF_ID_EDA_NO, GXv_int1, GXv_int2) ;
      ab706_pc01_reg_crf_impl.this.AV12P_CRF_ID = GXv_int1[0] ;
      ab706_pc01_reg_crf_impl.this.AV46P_CRF_EDA_NO = GXv_int2[0] ;
      GXv_SdtB792_SD01_CRF3[0] = AV22SD_B792_SD01_CRF;
      GXv_char4[0] = AV37W_RTN_CD ;
      new b704_pc02_get_crf_val(remoteHandle, context).execute( GXv_SdtB792_SD01_CRF3, GXv_char4) ;
      AV22SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF3[0] ;
      ab706_pc01_reg_crf_impl.this.AV37W_RTN_CD = GXv_char4[0] ;
      if ( ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id() == AV16P_STUDY_ID ) && ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id() == AV17P_SUBJECT_ID ) && ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id() == AV12P_CRF_ID ) && ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no() == AV46P_CRF_EDA_NO ) && ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() == AV13P_CRF_LATEST_VERSION ) )
      {
      }
      else
      {
         GXv_char4[0] = AV37W_RTN_CD ;
         GXv_char5[0] = AV34W_MSG ;
         new b799_pc07_sdt_work_reg(remoteHandle, context).execute( AV38W_SESSION.getId(), AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV22SD_B792_SD01_CRF, GXv_char4, GXv_char5) ;
         ab706_pc01_reg_crf_impl.this.AV37W_RTN_CD = GXv_char4[0] ;
         ab706_pc01_reg_crf_impl.this.AV34W_MSG = GXv_char5[0] ;
         GXv_SdtB792_SD01_CRF3[0] = AV22SD_B792_SD01_CRF;
         GXv_char5[0] = AV37W_RTN_CD ;
         GXv_char4[0] = AV34W_MSG ;
         new b799_pc08_sdt_work_get(remoteHandle, context).execute( AV38W_SESSION.getId(), AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV16P_STUDY_ID, AV17P_SUBJECT_ID, AV12P_CRF_ID, AV46P_CRF_EDA_NO, AV13P_CRF_LATEST_VERSION, GXv_SdtB792_SD01_CRF3, GXv_char5, GXv_char4) ;
         AV22SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF3[0] ;
         ab706_pc01_reg_crf_impl.this.AV37W_RTN_CD = GXv_char5[0] ;
         ab706_pc01_reg_crf_impl.this.AV34W_MSG = GXv_char4[0] ;
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
      {
         AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value(), "GXXEV1_NULL") == 0 )
         {
            AV23SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( "" );
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV36W_REG_FLG, "1") == 0 )
      {
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV27W_ERR_FLG, "0") == 0 )
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
            /* Execute user subroutine: S141 */
            S141 ();
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
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg( "" );
      }
      else
      {
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( "1" );
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg( AV28W_ERR_MSG );
      }
      AV10HttpResponse.addString(AV20SD_B706_SD01_CRF_REG_RTN.toJSonString(false));
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CRF_REG_CHK' Routine */
      if ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() == 0 )
      {
         AV36W_REG_FLG = "1" ;
      }
      else
      {
         GXv_char5[0] = AV33W_MODE_KBN ;
         GXv_char4[0] = AV32W_MEMO_INP_FLG ;
         GXv_char6[0] = AV26W_DM_ARRI_INP_FLG ;
         GXv_char7[0] = AV41W_STUDY_NM ;
         GXv_char8[0] = AV25W_CRF_SNM ;
         GXv_int1[0] = AV42W_TBM31_GRID_SIZE ;
         GXv_char9[0] = AV27W_ERR_FLG ;
         GXv_char10[0] = AV28W_ERR_MSG ;
         new b702_pc02_header_set(remoteHandle, context).execute( AV24W_A_LOGIN_SDT, AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), AV16P_STUDY_ID, AV17P_SUBJECT_ID, AV12P_CRF_ID, AV46P_CRF_EDA_NO, AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), GXv_char5, GXv_char4, GXv_char6, GXv_char7, GXv_char8, GXv_int1, GXv_char9, GXv_char10) ;
         ab706_pc01_reg_crf_impl.this.AV33W_MODE_KBN = GXv_char5[0] ;
         ab706_pc01_reg_crf_impl.this.AV32W_MEMO_INP_FLG = GXv_char4[0] ;
         ab706_pc01_reg_crf_impl.this.AV26W_DM_ARRI_INP_FLG = GXv_char6[0] ;
         ab706_pc01_reg_crf_impl.this.AV41W_STUDY_NM = GXv_char7[0] ;
         ab706_pc01_reg_crf_impl.this.AV25W_CRF_SNM = GXv_char8[0] ;
         ab706_pc01_reg_crf_impl.this.AV42W_TBM31_GRID_SIZE = GXv_int1[0] ;
         ab706_pc01_reg_crf_impl.this.AV27W_ERR_FLG = GXv_char9[0] ;
         ab706_pc01_reg_crf_impl.this.AV28W_ERR_MSG = GXv_char10[0] ;
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
               AV51GXV2 = 1 ;
               while ( AV51GXV2 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
               {
                  AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV51GXV2));
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
                  AV51GXV2 = (int)(AV51GXV2+1) ;
               }
            }
         }
      }
   }

   public void S121( )
   {
      /* 'SUB_CRF_UPD_HISTORY_INS' Routine */
      /* Using cursor P005V2 */
      pr_default.execute(0, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV17P_SUBJECT_ID), new Short(AV12P_CRF_ID), new Byte(AV46P_CRF_EDA_NO)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A89TBT02_STUDY_ID = P005V2_A89TBT02_STUDY_ID[0] ;
         A90TBT02_SUBJECT_ID = P005V2_A90TBT02_SUBJECT_ID[0] ;
         A91TBT02_CRF_ID = P005V2_A91TBT02_CRF_ID[0] ;
         A935TBT02_CRF_EDA_NO = P005V2_A935TBT02_CRF_EDA_NO[0] ;
         A498TBT02_CRF_LATEST_VERSION = P005V2_A498TBT02_CRF_LATEST_VERSION[0] ;
         n498TBT02_CRF_LATEST_VERSION = P005V2_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = P005V2_A499TBT02_CRF_INPUT_LEVEL[0] ;
         n499TBT02_CRF_INPUT_LEVEL = P005V2_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A652TBT02_UPLOAD_DATETIME = P005V2_A652TBT02_UPLOAD_DATETIME[0] ;
         n652TBT02_UPLOAD_DATETIME = P005V2_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = P005V2_A653TBT02_UPLOAD_USER_ID[0] ;
         n653TBT02_UPLOAD_USER_ID = P005V2_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = P005V2_A654TBT02_UPLOAD_AUTH_CD[0] ;
         n654TBT02_UPLOAD_AUTH_CD = P005V2_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = P005V2_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = P005V2_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = P005V2_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = P005V2_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = P005V2_A657TBT02_APPROVAL_FLG[0] ;
         n657TBT02_APPROVAL_FLG = P005V2_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = P005V2_A658TBT02_APPROVAL_DATETIME[0] ;
         n658TBT02_APPROVAL_DATETIME = P005V2_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = P005V2_A659TBT02_APPROVAL_USER_ID[0] ;
         n659TBT02_APPROVAL_USER_ID = P005V2_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = P005V2_A660TBT02_APPROVAL_AUTH_CD[0] ;
         n660TBT02_APPROVAL_AUTH_CD = P005V2_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A661TBT02_INPUT_END_FLG = P005V2_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = P005V2_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = P005V2_A662TBT02_INPUT_END_DATETIME[0] ;
         n662TBT02_INPUT_END_DATETIME = P005V2_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = P005V2_A663TBT02_INPUT_END_USER_ID[0] ;
         n663TBT02_INPUT_END_USER_ID = P005V2_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = P005V2_A664TBT02_INPUT_END_AUTH_CD[0] ;
         n664TBT02_INPUT_END_AUTH_CD = P005V2_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = P005V2_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = P005V2_n449TBT02_DEL_FLG[0] ;
         A456TBT02_UPD_CNT = P005V2_A456TBT02_UPD_CNT[0] ;
         n456TBT02_UPD_CNT = P005V2_n456TBT02_UPD_CNT[0] ;
         A453TBT02_UPD_DATETIME = P005V2_A453TBT02_UPD_DATETIME[0] ;
         n453TBT02_UPD_DATETIME = P005V2_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = P005V2_A454TBT02_UPD_USER_ID[0] ;
         n454TBT02_UPD_USER_ID = P005V2_n454TBT02_UPD_USER_ID[0] ;
         A455TBT02_UPD_PROG_NM = P005V2_A455TBT02_UPD_PROG_NM[0] ;
         n455TBT02_UPD_PROG_NM = P005V2_n455TBT02_UPD_PROG_NM[0] ;
         if ( AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt() != A456TBT02_UPD_CNT )
         {
            AV27W_ERR_FLG = "1" ;
            GXt_char11 = AV28W_ERR_MSG ;
            GXv_char10[0] = GXt_char11 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char10) ;
            ab706_pc01_reg_crf_impl.this.GXt_char11 = GXv_char10[0] ;
            AV28W_ERR_MSG = GXt_char11 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P005V3 */
            pr_default.execute(1, new Object[] {new Boolean(n498TBT02_CRF_LATEST_VERSION), new Short(A498TBT02_CRF_LATEST_VERSION), new Boolean(n499TBT02_CRF_INPUT_LEVEL), new Byte(A499TBT02_CRF_INPUT_LEVEL), new Boolean(n652TBT02_UPLOAD_DATETIME), A652TBT02_UPLOAD_DATETIME, new Boolean(n653TBT02_UPLOAD_USER_ID), A653TBT02_UPLOAD_USER_ID, new Boolean(n654TBT02_UPLOAD_AUTH_CD), A654TBT02_UPLOAD_AUTH_CD, new Boolean(n655TBT02_DM_ARRIVAL_FLG), A655TBT02_DM_ARRIVAL_FLG, new Boolean(n656TBT02_DM_ARRIVAL_DATETIME), A656TBT02_DM_ARRIVAL_DATETIME, new Boolean(n456TBT02_UPD_CNT), new Long(A456TBT02_UPD_CNT), new Boolean(n453TBT02_UPD_DATETIME), A453TBT02_UPD_DATETIME, new Boolean(n454TBT02_UPD_USER_ID), A454TBT02_UPD_USER_ID, new Boolean(n455TBT02_UPD_PROG_NM), A455TBT02_UPD_PROG_NM, new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
            if (true) break;
         }
         if ( ( GXutil.strcmp(AV14P_DM_ARRIVAL_FLG, "1") == 0 ) && ( GXutil.strcmp(A655TBT02_DM_ARRIVAL_FLG, AV14P_DM_ARRIVAL_FLG) != 0 ) )
         {
            A499TBT02_CRF_INPUT_LEVEL = (byte)(AV9C_DM_INPUT_LEVEL) ;
            n499TBT02_CRF_INPUT_LEVEL = false ;
            A655TBT02_DM_ARRIVAL_FLG = "1" ;
            n655TBT02_DM_ARRIVAL_FLG = false ;
            A656TBT02_DM_ARRIVAL_DATETIME = GXutil.now( ) ;
            n656TBT02_DM_ARRIVAL_DATETIME = false ;
         }
         A652TBT02_UPLOAD_DATETIME = GXutil.now( ) ;
         n652TBT02_UPLOAD_DATETIME = false ;
         A653TBT02_UPLOAD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n653TBT02_UPLOAD_USER_ID = false ;
         A654TBT02_UPLOAD_AUTH_CD = AV21SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd() ;
         n654TBT02_UPLOAD_AUTH_CD = false ;
         A498TBT02_CRF_LATEST_VERSION = (short)(A498TBT02_CRF_LATEST_VERSION+1) ;
         n498TBT02_CRF_LATEST_VERSION = false ;
         A453TBT02_UPD_DATETIME = GXutil.now( ) ;
         n453TBT02_UPD_DATETIME = false ;
         A454TBT02_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n454TBT02_UPD_USER_ID = false ;
         A455TBT02_UPD_PROG_NM = AV53Pgmname ;
         n455TBT02_UPD_PROG_NM = false ;
         A456TBT02_UPD_CNT = (long)(A456TBT02_UPD_CNT+1) ;
         n456TBT02_UPD_CNT = false ;
         AV43W_TBT02_CRF_LATEST_VERSION = A498TBT02_CRF_LATEST_VERSION ;
         /*
            INSERT RECORD ON TABLE TBT11_CRF_HISTORY

         */
         A92TBT11_STUDY_ID = A89TBT02_STUDY_ID ;
         A93TBT11_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
         A94TBT11_CRF_ID = A91TBT02_CRF_ID ;
         A936TBT11_CRF_EDA_NO = A935TBT02_CRF_EDA_NO ;
         A95TBT11_CRF_VERSION = A498TBT02_CRF_LATEST_VERSION ;
         A665TBT11_CRF_INPUT_LEVEL = A499TBT02_CRF_INPUT_LEVEL ;
         n665TBT11_CRF_INPUT_LEVEL = false ;
         A666TBT11_UPLOAD_DATETIME = A652TBT02_UPLOAD_DATETIME ;
         n666TBT11_UPLOAD_DATETIME = false ;
         A667TBT11_UPLOAD_USER_ID = A653TBT02_UPLOAD_USER_ID ;
         n667TBT11_UPLOAD_USER_ID = false ;
         A668TBT11_UPLOAD_AUTH_CD = A654TBT02_UPLOAD_AUTH_CD ;
         n668TBT11_UPLOAD_AUTH_CD = false ;
         A669TBT11_DM_ARRIVAL_FLG = A655TBT02_DM_ARRIVAL_FLG ;
         n669TBT11_DM_ARRIVAL_FLG = false ;
         A670TBT11_DM_ARRIVAL_DATETIME = A656TBT02_DM_ARRIVAL_DATETIME ;
         n670TBT11_DM_ARRIVAL_DATETIME = false ;
         A671TBT11_APPROVAL_FLG = A657TBT02_APPROVAL_FLG ;
         n671TBT11_APPROVAL_FLG = false ;
         A672TBT11_APPROVAL_DATETIME = A658TBT02_APPROVAL_DATETIME ;
         n672TBT11_APPROVAL_DATETIME = false ;
         A673TBT11_APPROVAL_USER_ID = A659TBT02_APPROVAL_USER_ID ;
         n673TBT11_APPROVAL_USER_ID = false ;
         A674TBT11_APPROVAL_AUTH_CD = A660TBT02_APPROVAL_AUTH_CD ;
         n674TBT11_APPROVAL_AUTH_CD = false ;
         A675TBT11_INPUT_END_FLG = A661TBT02_INPUT_END_FLG ;
         n675TBT11_INPUT_END_FLG = false ;
         A676TBT11_INPUT_END_DATETIME = A662TBT02_INPUT_END_DATETIME ;
         n676TBT11_INPUT_END_DATETIME = false ;
         A677TBT11_INPUT_END_USER_ID = A663TBT02_INPUT_END_USER_ID ;
         n677TBT11_INPUT_END_USER_ID = false ;
         A678TBT11_INPUT_END_AUTH_CD = A664TBT02_INPUT_END_AUTH_CD ;
         n678TBT11_INPUT_END_AUTH_CD = false ;
         A891TBT11_UPD_RIYU = AV18P_UPD_RIYU ;
         n891TBT11_UPD_RIYU = false ;
         A457TBT11_DEL_FLG = "0" ;
         n457TBT11_DEL_FLG = false ;
         A458TBT11_CRT_DATETIME = GXutil.now( ) ;
         n458TBT11_CRT_DATETIME = false ;
         A459TBT11_CRT_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n459TBT11_CRT_USER_ID = false ;
         A460TBT11_CRT_PROG_NM = AV53Pgmname ;
         n460TBT11_CRT_PROG_NM = false ;
         A461TBT11_UPD_DATETIME = GXutil.now( ) ;
         n461TBT11_UPD_DATETIME = false ;
         A462TBT11_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n462TBT11_UPD_USER_ID = false ;
         A463TBT11_UPD_PROG_NM = AV53Pgmname ;
         n463TBT11_UPD_PROG_NM = false ;
         A464TBT11_UPD_CNT = 1 ;
         n464TBT11_UPD_CNT = false ;
         /* Using cursor P005V4 */
         pr_default.execute(2, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION), new Boolean(n665TBT11_CRF_INPUT_LEVEL), new Byte(A665TBT11_CRF_INPUT_LEVEL), new Boolean(n666TBT11_UPLOAD_DATETIME), A666TBT11_UPLOAD_DATETIME, new Boolean(n667TBT11_UPLOAD_USER_ID), A667TBT11_UPLOAD_USER_ID, new Boolean(n668TBT11_UPLOAD_AUTH_CD), A668TBT11_UPLOAD_AUTH_CD, new Boolean(n669TBT11_DM_ARRIVAL_FLG), A669TBT11_DM_ARRIVAL_FLG, new Boolean(n670TBT11_DM_ARRIVAL_DATETIME), A670TBT11_DM_ARRIVAL_DATETIME, new Boolean(n671TBT11_APPROVAL_FLG), A671TBT11_APPROVAL_FLG, new Boolean(n672TBT11_APPROVAL_DATETIME), A672TBT11_APPROVAL_DATETIME, new Boolean(n673TBT11_APPROVAL_USER_ID), A673TBT11_APPROVAL_USER_ID, new Boolean(n674TBT11_APPROVAL_AUTH_CD), A674TBT11_APPROVAL_AUTH_CD, new Boolean(n675TBT11_INPUT_END_FLG), A675TBT11_INPUT_END_FLG, new Boolean(n676TBT11_INPUT_END_DATETIME), A676TBT11_INPUT_END_DATETIME, new Boolean(n677TBT11_INPUT_END_USER_ID), A677TBT11_INPUT_END_USER_ID, new Boolean(n678TBT11_INPUT_END_AUTH_CD), A678TBT11_INPUT_END_AUTH_CD, new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n457TBT11_DEL_FLG), A457TBT11_DEL_FLG, new Boolean(n458TBT11_CRT_DATETIME), A458TBT11_CRT_DATETIME, new Boolean(n459TBT11_CRT_USER_ID), A459TBT11_CRT_USER_ID, new Boolean(n460TBT11_CRT_PROG_NM), A460TBT11_CRT_PROG_NM, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            AV27W_ERR_FLG = "1" ;
            GXt_char11 = AV28W_ERR_MSG ;
            GXv_char10[0] = GXt_char11 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00023", "CRFèCê≥óöó", "", "", "", "", GXv_char10) ;
            ab706_pc01_reg_crf_impl.this.GXt_char11 = GXv_char10[0] ;
            AV28W_ERR_MSG = GXt_char11 ;
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
         AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_EDA_NO:" + GXutil.trim( GXutil.str( AV46P_CRF_EDA_NO, 2, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "DM_ARRIVAL_FLG:" + AV14P_DM_ARRIVAL_FLG + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "UPD_RIYU:" + AV18P_UPD_RIYU + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = GXutil.strReplace( AV31W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV53Pgmname, "UPD", AV31W_LOGTEXT) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P005V5 */
         pr_default.execute(3, new Object[] {new Boolean(n498TBT02_CRF_LATEST_VERSION), new Short(A498TBT02_CRF_LATEST_VERSION), new Boolean(n499TBT02_CRF_INPUT_LEVEL), new Byte(A499TBT02_CRF_INPUT_LEVEL), new Boolean(n652TBT02_UPLOAD_DATETIME), A652TBT02_UPLOAD_DATETIME, new Boolean(n653TBT02_UPLOAD_USER_ID), A653TBT02_UPLOAD_USER_ID, new Boolean(n654TBT02_UPLOAD_AUTH_CD), A654TBT02_UPLOAD_AUTH_CD, new Boolean(n655TBT02_DM_ARRIVAL_FLG), A655TBT02_DM_ARRIVAL_FLG, new Boolean(n656TBT02_DM_ARRIVAL_DATETIME), A656TBT02_DM_ARRIVAL_DATETIME, new Boolean(n456TBT02_UPD_CNT), new Long(A456TBT02_UPD_CNT), new Boolean(n453TBT02_UPD_DATETIME), A453TBT02_UPD_DATETIME, new Boolean(n454TBT02_UPD_USER_ID), A454TBT02_UPD_USER_ID, new Boolean(n455TBT02_UPD_PROG_NM), A455TBT02_UPD_PROG_NM, new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
         if (true) break;
         /* Using cursor P005V6 */
         pr_default.execute(4, new Object[] {new Boolean(n498TBT02_CRF_LATEST_VERSION), new Short(A498TBT02_CRF_LATEST_VERSION), new Boolean(n499TBT02_CRF_INPUT_LEVEL), new Byte(A499TBT02_CRF_INPUT_LEVEL), new Boolean(n652TBT02_UPLOAD_DATETIME), A652TBT02_UPLOAD_DATETIME, new Boolean(n653TBT02_UPLOAD_USER_ID), A653TBT02_UPLOAD_USER_ID, new Boolean(n654TBT02_UPLOAD_AUTH_CD), A654TBT02_UPLOAD_AUTH_CD, new Boolean(n655TBT02_DM_ARRIVAL_FLG), A655TBT02_DM_ARRIVAL_FLG, new Boolean(n656TBT02_DM_ARRIVAL_DATETIME), A656TBT02_DM_ARRIVAL_DATETIME, new Boolean(n456TBT02_UPD_CNT), new Long(A456TBT02_UPD_CNT), new Boolean(n453TBT02_UPD_DATETIME), A453TBT02_UPD_DATETIME, new Boolean(n454TBT02_UPD_USER_ID), A454TBT02_UPD_USER_ID, new Boolean(n455TBT02_UPD_PROG_NM), A455TBT02_UPD_PROG_NM, new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'SUB_CRF_RES_UPD_HIS_INS' Routine */
      AV54GXV3 = 1 ;
      while ( AV54GXV3 <= AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
      {
         AV23SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV22SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV54GXV3));
         if ( ! (GXutil.strcmp("", AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd())==0) )
         {
            AV45W_MODE = "" ;
            AV55GXLvl299 = (byte)(0) ;
            /* Using cursor P005V7 */
            pr_default.execute(5, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV17P_SUBJECT_ID), new Short(AV12P_CRF_ID), new Byte(AV46P_CRF_EDA_NO), AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd()});
            if ( Gx_err != 0 )
            {
               AV55GXLvl299 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(5) != 101) )
            {
               A473TBT12_DEL_FLG = P005V7_A473TBT12_DEL_FLG[0] ;
               n473TBT12_DEL_FLG = P005V7_n473TBT12_DEL_FLG[0] ;
               A100TBT12_CRF_ITEM_GRP_CD = P005V7_A100TBT12_CRF_ITEM_GRP_CD[0] ;
               A937TBT12_CRF_EDA_NO = P005V7_A937TBT12_CRF_EDA_NO[0] ;
               A98TBT12_CRF_ID = P005V7_A98TBT12_CRF_ID[0] ;
               A97TBT12_SUBJECT_ID = P005V7_A97TBT12_SUBJECT_ID[0] ;
               A96TBT12_STUDY_ID = P005V7_A96TBT12_STUDY_ID[0] ;
               A679TBT12_EDIT_FLG = P005V7_A679TBT12_EDIT_FLG[0] ;
               n679TBT12_EDIT_FLG = P005V7_n679TBT12_EDIT_FLG[0] ;
               A465TBT12_CRF_VALUE = P005V7_A465TBT12_CRF_VALUE[0] ;
               n465TBT12_CRF_VALUE = P005V7_n465TBT12_CRF_VALUE[0] ;
               A469TBT12_UPD_DATETIME = P005V7_A469TBT12_UPD_DATETIME[0] ;
               n469TBT12_UPD_DATETIME = P005V7_n469TBT12_UPD_DATETIME[0] ;
               A470TBT12_UPD_USER_ID = P005V7_A470TBT12_UPD_USER_ID[0] ;
               n470TBT12_UPD_USER_ID = P005V7_n470TBT12_UPD_USER_ID[0] ;
               A471TBT12_UPD_PROG_NM = P005V7_A471TBT12_UPD_PROG_NM[0] ;
               n471TBT12_UPD_PROG_NM = P005V7_n471TBT12_UPD_PROG_NM[0] ;
               A472TBT12_UPD_CNT = P005V7_A472TBT12_UPD_CNT[0] ;
               n472TBT12_UPD_CNT = P005V7_n472TBT12_UPD_CNT[0] ;
               A99TBT12_CRF_ITEM_GRP_DIV = P005V7_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
               AV55GXLvl299 = (byte)(1) ;
               if ( GXutil.strcmp(AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value(), AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org()) == 0 )
               {
                  A679TBT12_EDIT_FLG = "0" ;
                  n679TBT12_EDIT_FLG = false ;
                  AV44W_TBT12_EDIT_FLG = "0" ;
               }
               else
               {
                  A679TBT12_EDIT_FLG = "1" ;
                  n679TBT12_EDIT_FLG = false ;
                  AV44W_TBT12_EDIT_FLG = "1" ;
                  AV45W_MODE = "UPD" ;
               }
               A465TBT12_CRF_VALUE = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
               n465TBT12_CRF_VALUE = false ;
               A469TBT12_UPD_DATETIME = GXutil.now( ) ;
               n469TBT12_UPD_DATETIME = false ;
               A470TBT12_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n470TBT12_UPD_USER_ID = false ;
               A471TBT12_UPD_PROG_NM = AV53Pgmname ;
               n471TBT12_UPD_PROG_NM = false ;
               A472TBT12_UPD_CNT = (long)(A472TBT12_UPD_CNT+1) ;
               n472TBT12_UPD_CNT = false ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P005V8 */
               pr_default.execute(6, new Object[] {new Boolean(n679TBT12_EDIT_FLG), A679TBT12_EDIT_FLG, new Boolean(n465TBT12_CRF_VALUE), A465TBT12_CRF_VALUE, new Boolean(n469TBT12_UPD_DATETIME), A469TBT12_UPD_DATETIME, new Boolean(n470TBT12_UPD_USER_ID), A470TBT12_UPD_USER_ID, new Boolean(n471TBT12_UPD_PROG_NM), A471TBT12_UPD_PROG_NM, new Boolean(n472TBT12_UPD_CNT), new Long(A472TBT12_UPD_CNT), new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
               if (true) break;
               /* Using cursor P005V9 */
               pr_default.execute(7, new Object[] {new Boolean(n679TBT12_EDIT_FLG), A679TBT12_EDIT_FLG, new Boolean(n465TBT12_CRF_VALUE), A465TBT12_CRF_VALUE, new Boolean(n469TBT12_UPD_DATETIME), A469TBT12_UPD_DATETIME, new Boolean(n470TBT12_UPD_USER_ID), A470TBT12_UPD_USER_ID, new Boolean(n471TBT12_UPD_PROG_NM), A471TBT12_UPD_PROG_NM, new Boolean(n472TBT12_UPD_CNT), new Long(A472TBT12_UPD_CNT), new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV55GXLvl299 == 0 )
            {
               /*
                  INSERT RECORD ON TABLE TBT12_CRF_RESULT

               */
               A96TBT12_STUDY_ID = AV16P_STUDY_ID ;
               A97TBT12_SUBJECT_ID = AV17P_SUBJECT_ID ;
               A98TBT12_CRF_ID = AV12P_CRF_ID ;
               A937TBT12_CRF_EDA_NO = AV46P_CRF_EDA_NO ;
               A99TBT12_CRF_ITEM_GRP_DIV = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div() ;
               A100TBT12_CRF_ITEM_GRP_CD = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd() ;
               A465TBT12_CRF_VALUE = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
               n465TBT12_CRF_VALUE = false ;
               if ( AV43W_TBT02_CRF_LATEST_VERSION == 1 )
               {
                  AV45W_MODE = "INS" ;
                  A679TBT12_EDIT_FLG = "0" ;
                  n679TBT12_EDIT_FLG = false ;
                  AV44W_TBT12_EDIT_FLG = "0" ;
               }
               else
               {
                  AV45W_MODE = "UPD" ;
                  A679TBT12_EDIT_FLG = "1" ;
                  n679TBT12_EDIT_FLG = false ;
                  AV44W_TBT12_EDIT_FLG = "1" ;
               }
               A473TBT12_DEL_FLG = "0" ;
               n473TBT12_DEL_FLG = false ;
               A466TBT12_CRT_DATETIME = GXutil.now( ) ;
               n466TBT12_CRT_DATETIME = false ;
               A467TBT12_CRT_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n467TBT12_CRT_USER_ID = false ;
               A468TBT12_CRT_PROG_NM = AV53Pgmname ;
               n468TBT12_CRT_PROG_NM = false ;
               A469TBT12_UPD_DATETIME = GXutil.now( ) ;
               n469TBT12_UPD_DATETIME = false ;
               A470TBT12_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n470TBT12_UPD_USER_ID = false ;
               A471TBT12_UPD_PROG_NM = AV53Pgmname ;
               n471TBT12_UPD_PROG_NM = false ;
               A472TBT12_UPD_CNT = 1 ;
               n472TBT12_UPD_CNT = false ;
               /* Using cursor P005V10 */
               pr_default.execute(8, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD, new Boolean(n465TBT12_CRF_VALUE), A465TBT12_CRF_VALUE, new Boolean(n679TBT12_EDIT_FLG), A679TBT12_EDIT_FLG, new Boolean(n473TBT12_DEL_FLG), A473TBT12_DEL_FLG, new Boolean(n466TBT12_CRT_DATETIME), A466TBT12_CRT_DATETIME, new Boolean(n467TBT12_CRT_USER_ID), A467TBT12_CRT_USER_ID, new Boolean(n468TBT12_CRT_PROG_NM), A468TBT12_CRT_PROG_NM, new Boolean(n469TBT12_UPD_DATETIME), A469TBT12_UPD_DATETIME, new Boolean(n470TBT12_UPD_USER_ID), A470TBT12_UPD_USER_ID, new Boolean(n471TBT12_UPD_PROG_NM), A471TBT12_UPD_PROG_NM, new Boolean(n472TBT12_UPD_CNT), new Long(A472TBT12_UPD_CNT)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
               if ( (pr_default.getStatus(8) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  AV27W_ERR_FLG = "1" ;
                  GXt_char11 = AV28W_ERR_MSG ;
                  GXv_char10[0] = GXt_char11 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00023", "CRFì¸óÕåãâ ", "", "", "", "", GXv_char10) ;
                  ab706_pc01_reg_crf_impl.this.GXt_char11 = GXv_char10[0] ;
                  AV28W_ERR_MSG = GXt_char11 ;
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
            A101TBT13_STUDY_ID = AV16P_STUDY_ID ;
            A102TBT13_SUBJECT_ID = AV17P_SUBJECT_ID ;
            A103TBT13_CRF_ID = AV12P_CRF_ID ;
            A938TBT13_CRF_EDA_NO = AV46P_CRF_EDA_NO ;
            A104TBT13_CRF_VERSION = AV43W_TBT02_CRF_LATEST_VERSION ;
            A105TBT13_CRF_ITEM_GRP_DIV = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div() ;
            A106TBT13_CRF_ITEM_GRP_CD = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd() ;
            A597TBT13_CRF_VALUE = AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
            n597TBT13_CRF_VALUE = false ;
            A680TBT13_EDIT_FLG = AV44W_TBT12_EDIT_FLG ;
            n680TBT13_EDIT_FLG = false ;
            A598TBT13_DEL_FLG = "0" ;
            n598TBT13_DEL_FLG = false ;
            A599TBT13_CRT_DATETIME = GXutil.now( ) ;
            n599TBT13_CRT_DATETIME = false ;
            A600TBT13_CRT_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n600TBT13_CRT_USER_ID = false ;
            A601TBT13_CRT_PROG_NM = AV53Pgmname ;
            n601TBT13_CRT_PROG_NM = false ;
            A602TBT13_UPD_DATETIME = GXutil.now( ) ;
            n602TBT13_UPD_DATETIME = false ;
            A603TBT13_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n603TBT13_UPD_USER_ID = false ;
            A604TBT13_UPD_PROG_NM = AV53Pgmname ;
            n604TBT13_UPD_PROG_NM = false ;
            A605TBT13_UPD_CNT = 1 ;
            n605TBT13_UPD_CNT = false ;
            /* Using cursor P005V11 */
            pr_default.execute(9, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD, new Boolean(n597TBT13_CRF_VALUE), A597TBT13_CRF_VALUE, new Boolean(n680TBT13_EDIT_FLG), A680TBT13_EDIT_FLG, new Boolean(n598TBT13_DEL_FLG), A598TBT13_DEL_FLG, new Boolean(n599TBT13_CRT_DATETIME), A599TBT13_CRT_DATETIME, new Boolean(n600TBT13_CRT_USER_ID), A600TBT13_CRT_USER_ID, new Boolean(n601TBT13_CRT_PROG_NM), A601TBT13_CRT_PROG_NM, new Boolean(n602TBT13_UPD_DATETIME), A602TBT13_UPD_DATETIME, new Boolean(n603TBT13_UPD_USER_ID), A603TBT13_UPD_USER_ID, new Boolean(n604TBT13_UPD_PROG_NM), A604TBT13_UPD_PROG_NM, new Boolean(n605TBT13_UPD_CNT), new Long(A605TBT13_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
            if ( (pr_default.getStatus(9) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               AV27W_ERR_FLG = "1" ;
               GXt_char11 = AV28W_ERR_MSG ;
               GXv_char10[0] = GXt_char11 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00023", "CRFèCê≥óöó", "", "", "", "", GXv_char10) ;
               ab706_pc01_reg_crf_impl.this.GXt_char11 = GXv_char10[0] ;
               AV28W_ERR_MSG = GXt_char11 ;
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
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_EDA_NO:" + GXutil.trim( GXutil.str( AV46P_CRF_EDA_NO, 2, 0)) + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_ITEM_GRP_DIV:" + AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div() + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_ITEM_GRP_CD:" + AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd() + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_VALUE_BEFORE:" + AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org() + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_VALUE_AFTER:" + AV23SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() + GXutil.chr( (short)(9)) ;
               AV31W_LOGTEXT = GXutil.strReplace( AV31W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
               new a804_pc03_datalog(remoteHandle, context).execute( AV53Pgmname, AV45W_MODE, AV31W_LOGTEXT) ;
            }
         }
         AV54GXV3 = (int)(AV54GXV3+1) ;
      }
   }

   public void S141( )
   {
      /* 'SUB_CRF_UPD_HISTORY_UPD_RIYU' Routine */
      /* Using cursor P005V12 */
      pr_default.execute(10, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV17P_SUBJECT_ID), new Short(AV12P_CRF_ID), new Byte(AV46P_CRF_EDA_NO)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A92TBT11_STUDY_ID = P005V12_A92TBT11_STUDY_ID[0] ;
         A93TBT11_SUBJECT_ID = P005V12_A93TBT11_SUBJECT_ID[0] ;
         A94TBT11_CRF_ID = P005V12_A94TBT11_CRF_ID[0] ;
         A936TBT11_CRF_EDA_NO = P005V12_A936TBT11_CRF_EDA_NO[0] ;
         A457TBT11_DEL_FLG = P005V12_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = P005V12_n457TBT11_DEL_FLG[0] ;
         A459TBT11_CRT_USER_ID = P005V12_A459TBT11_CRT_USER_ID[0] ;
         n459TBT11_CRT_USER_ID = P005V12_n459TBT11_CRT_USER_ID[0] ;
         A891TBT11_UPD_RIYU = P005V12_A891TBT11_UPD_RIYU[0] ;
         n891TBT11_UPD_RIYU = P005V12_n891TBT11_UPD_RIYU[0] ;
         A461TBT11_UPD_DATETIME = P005V12_A461TBT11_UPD_DATETIME[0] ;
         n461TBT11_UPD_DATETIME = P005V12_n461TBT11_UPD_DATETIME[0] ;
         A462TBT11_UPD_USER_ID = P005V12_A462TBT11_UPD_USER_ID[0] ;
         n462TBT11_UPD_USER_ID = P005V12_n462TBT11_UPD_USER_ID[0] ;
         A463TBT11_UPD_PROG_NM = P005V12_A463TBT11_UPD_PROG_NM[0] ;
         n463TBT11_UPD_PROG_NM = P005V12_n463TBT11_UPD_PROG_NM[0] ;
         A464TBT11_UPD_CNT = P005V12_A464TBT11_UPD_CNT[0] ;
         n464TBT11_UPD_CNT = P005V12_n464TBT11_UPD_CNT[0] ;
         A95TBT11_CRF_VERSION = P005V12_A95TBT11_CRF_VERSION[0] ;
         if ( GXutil.strcmp(A459TBT11_CRT_USER_ID, AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()) != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P005V13 */
            pr_default.execute(11, new Object[] {new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT), new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
            if (true) break;
         }
         A891TBT11_UPD_RIYU = AV18P_UPD_RIYU ;
         n891TBT11_UPD_RIYU = false ;
         A461TBT11_UPD_DATETIME = GXutil.now( ) ;
         n461TBT11_UPD_DATETIME = false ;
         A462TBT11_UPD_USER_ID = AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n462TBT11_UPD_USER_ID = false ;
         A463TBT11_UPD_PROG_NM = AV53Pgmname ;
         n463TBT11_UPD_PROG_NM = false ;
         A464TBT11_UPD_CNT = (long)(A464TBT11_UPD_CNT+1) ;
         n464TBT11_UPD_CNT = false ;
         AV31W_LOGTEXT = "" ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV16P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV17P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV12P_CRF_ID, 4, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "CRF_EDA_NO:" + GXutil.trim( GXutil.str( AV46P_CRF_EDA_NO, 2, 0)) + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "DM_ARRIVAL_FLG:" + AV14P_DM_ARRIVAL_FLG + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = AV31W_LOGTEXT + "UPD_RIYU:" + AV18P_UPD_RIYU + GXutil.chr( (short)(9)) ;
         AV31W_LOGTEXT = GXutil.strReplace( AV31W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV53Pgmname, "UPD", AV31W_LOGTEXT) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P005V14 */
         pr_default.execute(12, new Object[] {new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT), new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
         if (true) break;
         /* Using cursor P005V15 */
         pr_default.execute(13, new Object[] {new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT), new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S151( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT12[0] = AV24W_A_LOGIN_SDT;
      GXv_char10[0] = AV29W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT12, GXv_char10) ;
      AV24W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT12[0] ;
      ab706_pc01_reg_crf_impl.this.AV29W_ERRCD = GXv_char10[0] ;
      if ( GXutil.strcmp(AV29W_ERRCD, "0") != 0 )
      {
         AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( "9" );
         AV10HttpResponse.addString(AV20SD_B706_SD01_CRF_REG_RTN.toJSonString(false));
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXv_char10[0] = AV8C_DM_AUTH_CD ;
      GXv_int2[0] = (byte)(AV9C_DM_INPUT_LEVEL) ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char10, GXv_int2) ;
      ab706_pc01_reg_crf_impl.this.AV8C_DM_AUTH_CD = GXv_char10[0] ;
      ab706_pc01_reg_crf_impl.this.AV9C_DM_INPUT_LEVEL = GXv_int2[0] ;
      GXt_char11 = AV39W_SESSION_KEY ;
      GXv_char10[0] = GXt_char11 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV24W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char10) ;
      ab706_pc01_reg_crf_impl.this.GXt_char11 = GXv_char10[0] ;
      AV39W_SESSION_KEY = GXt_char11 ;
      AV21SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV38W_SESSION.getValue(AV39W_SESSION_KEY), "");
      new a804_pc02_log_start(remoteHandle, context).execute( AV53Pgmname) ;
   }

   public void S161( )
   {
      /* 'SUB_ERROR' Routine */
      AV27W_ERR_FLG = "1" ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV53Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV20SD_B706_SD01_CRF_REG_RTN.setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( "9" );
      AV10HttpResponse.addString(AV20SD_B706_SD01_CRF_REG_RTN.toJSonString(false));
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
                  /* Execute user subroutine: S161 */
                  S161 ();
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
      AV47P_CRF_ID_EDA_NO = "" ;
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
      GXv_SdtB792_SD01_CRF3 = new SdtB792_SD01_CRF [1] ;
      AV23SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      AV20SD_B706_SD01_CRF_REG_RTN = new SdtB706_SD01_CRF_REG_RTN(remoteHandle, context);
      AV10HttpResponse = httpContext.getHttpResponse();
      AV24W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV33W_MODE_KBN = "" ;
      GXv_char5 = new String [1] ;
      AV32W_MEMO_INP_FLG = "" ;
      GXv_char4 = new String [1] ;
      AV26W_DM_ARRI_INP_FLG = "" ;
      GXv_char6 = new String [1] ;
      AV41W_STUDY_NM = "" ;
      GXv_char7 = new String [1] ;
      AV25W_CRF_SNM = "" ;
      GXv_char8 = new String [1] ;
      GXv_int1 = new short [1] ;
      GXv_char9 = new String [1] ;
      scmdbuf = "" ;
      P005V2_A89TBT02_STUDY_ID = new long[1] ;
      P005V2_A90TBT02_SUBJECT_ID = new int[1] ;
      P005V2_A91TBT02_CRF_ID = new short[1] ;
      P005V2_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P005V2_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      P005V2_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P005V2_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P005V2_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P005V2_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005V2_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      P005V2_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      P005V2_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      P005V2_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      P005V2_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P005V2_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P005V2_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005V2_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005V2_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P005V2_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      P005V2_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      P005V2_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005V2_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      P005V2_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      P005V2_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      P005V2_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      P005V2_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P005V2_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      P005V2_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P005V2_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005V2_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      P005V2_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      P005V2_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      P005V2_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      P005V2_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P005V2_A449TBT02_DEL_FLG = new String[] {""} ;
      P005V2_n449TBT02_DEL_FLG = new boolean[] {false} ;
      P005V2_A456TBT02_UPD_CNT = new long[1] ;
      P005V2_n456TBT02_UPD_CNT = new boolean[] {false} ;
      P005V2_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005V2_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      P005V2_A454TBT02_UPD_USER_ID = new String[] {""} ;
      P005V2_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      P005V2_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      P005V2_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A653TBT02_UPLOAD_USER_ID = "" ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A657TBT02_APPROVAL_FLG = "" ;
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A659TBT02_APPROVAL_USER_ID = "" ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      A661TBT02_INPUT_END_FLG = "" ;
      A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A663TBT02_INPUT_END_USER_ID = "" ;
      A664TBT02_INPUT_END_AUTH_CD = "" ;
      A449TBT02_DEL_FLG = "" ;
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A454TBT02_UPD_USER_ID = "" ;
      A455TBT02_UPD_PROG_NM = "" ;
      AV53Pgmname = "" ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A667TBT11_UPLOAD_USER_ID = "" ;
      A668TBT11_UPLOAD_AUTH_CD = "" ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A671TBT11_APPROVAL_FLG = "" ;
      A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A673TBT11_APPROVAL_USER_ID = "" ;
      A674TBT11_APPROVAL_AUTH_CD = "" ;
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
      Gx_emsg = "" ;
      AV31W_LOGTEXT = "" ;
      A679TBT12_EDIT_FLG = "" ;
      A465TBT12_CRF_VALUE = "" ;
      A469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A470TBT12_UPD_USER_ID = "" ;
      A471TBT12_UPD_PROG_NM = "" ;
      AV45W_MODE = "" ;
      P005V7_A473TBT12_DEL_FLG = new String[] {""} ;
      P005V7_n473TBT12_DEL_FLG = new boolean[] {false} ;
      P005V7_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005V7_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P005V7_A98TBT12_CRF_ID = new short[1] ;
      P005V7_A97TBT12_SUBJECT_ID = new int[1] ;
      P005V7_A96TBT12_STUDY_ID = new long[1] ;
      P005V7_A679TBT12_EDIT_FLG = new String[] {""} ;
      P005V7_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      P005V7_A465TBT12_CRF_VALUE = new String[] {""} ;
      P005V7_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      P005V7_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005V7_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      P005V7_A470TBT12_UPD_USER_ID = new String[] {""} ;
      P005V7_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      P005V7_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      P005V7_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      P005V7_A472TBT12_UPD_CNT = new long[1] ;
      P005V7_n472TBT12_UPD_CNT = new boolean[] {false} ;
      P005V7_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A473TBT12_DEL_FLG = "" ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      AV44W_TBT12_EDIT_FLG = "" ;
      A466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A467TBT12_CRT_USER_ID = "" ;
      A468TBT12_CRT_PROG_NM = "" ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      A597TBT13_CRF_VALUE = "" ;
      A680TBT13_EDIT_FLG = "" ;
      A598TBT13_DEL_FLG = "" ;
      A599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A600TBT13_CRT_USER_ID = "" ;
      A601TBT13_CRT_PROG_NM = "" ;
      A602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A603TBT13_UPD_USER_ID = "" ;
      A604TBT13_UPD_PROG_NM = "" ;
      P005V12_A92TBT11_STUDY_ID = new long[1] ;
      P005V12_A93TBT11_SUBJECT_ID = new int[1] ;
      P005V12_A94TBT11_CRF_ID = new short[1] ;
      P005V12_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P005V12_A457TBT11_DEL_FLG = new String[] {""} ;
      P005V12_n457TBT11_DEL_FLG = new boolean[] {false} ;
      P005V12_A459TBT11_CRT_USER_ID = new String[] {""} ;
      P005V12_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      P005V12_A891TBT11_UPD_RIYU = new String[] {""} ;
      P005V12_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      P005V12_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005V12_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      P005V12_A462TBT11_UPD_USER_ID = new String[] {""} ;
      P005V12_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      P005V12_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      P005V12_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      P005V12_A464TBT11_UPD_CNT = new long[1] ;
      P005V12_n464TBT11_UPD_CNT = new boolean[] {false} ;
      P005V12_A95TBT11_CRF_VERSION = new short[1] ;
      GXv_SdtA_LOGIN_SDT12 = new SdtA_LOGIN_SDT [1] ;
      AV29W_ERRCD = "" ;
      AV8C_DM_AUTH_CD = "" ;
      GXv_int2 = new byte [1] ;
      AV39W_SESSION_KEY = "" ;
      GXt_char11 = "" ;
      GXv_char10 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab706_pc01_reg_crf__default(),
         new Object[] {
             new Object[] {
            P005V2_A89TBT02_STUDY_ID, P005V2_A90TBT02_SUBJECT_ID, P005V2_A91TBT02_CRF_ID, P005V2_A935TBT02_CRF_EDA_NO, P005V2_A498TBT02_CRF_LATEST_VERSION, P005V2_n498TBT02_CRF_LATEST_VERSION, P005V2_A499TBT02_CRF_INPUT_LEVEL, P005V2_n499TBT02_CRF_INPUT_LEVEL, P005V2_A652TBT02_UPLOAD_DATETIME, P005V2_n652TBT02_UPLOAD_DATETIME,
            P005V2_A653TBT02_UPLOAD_USER_ID, P005V2_n653TBT02_UPLOAD_USER_ID, P005V2_A654TBT02_UPLOAD_AUTH_CD, P005V2_n654TBT02_UPLOAD_AUTH_CD, P005V2_A655TBT02_DM_ARRIVAL_FLG, P005V2_n655TBT02_DM_ARRIVAL_FLG, P005V2_A656TBT02_DM_ARRIVAL_DATETIME, P005V2_n656TBT02_DM_ARRIVAL_DATETIME, P005V2_A657TBT02_APPROVAL_FLG, P005V2_n657TBT02_APPROVAL_FLG,
            P005V2_A658TBT02_APPROVAL_DATETIME, P005V2_n658TBT02_APPROVAL_DATETIME, P005V2_A659TBT02_APPROVAL_USER_ID, P005V2_n659TBT02_APPROVAL_USER_ID, P005V2_A660TBT02_APPROVAL_AUTH_CD, P005V2_n660TBT02_APPROVAL_AUTH_CD, P005V2_A661TBT02_INPUT_END_FLG, P005V2_n661TBT02_INPUT_END_FLG, P005V2_A662TBT02_INPUT_END_DATETIME, P005V2_n662TBT02_INPUT_END_DATETIME,
            P005V2_A663TBT02_INPUT_END_USER_ID, P005V2_n663TBT02_INPUT_END_USER_ID, P005V2_A664TBT02_INPUT_END_AUTH_CD, P005V2_n664TBT02_INPUT_END_AUTH_CD, P005V2_A449TBT02_DEL_FLG, P005V2_n449TBT02_DEL_FLG, P005V2_A456TBT02_UPD_CNT, P005V2_n456TBT02_UPD_CNT, P005V2_A453TBT02_UPD_DATETIME, P005V2_n453TBT02_UPD_DATETIME,
            P005V2_A454TBT02_UPD_USER_ID, P005V2_n454TBT02_UPD_USER_ID, P005V2_A455TBT02_UPD_PROG_NM, P005V2_n455TBT02_UPD_PROG_NM
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
            P005V7_A473TBT12_DEL_FLG, P005V7_n473TBT12_DEL_FLG, P005V7_A100TBT12_CRF_ITEM_GRP_CD, P005V7_A937TBT12_CRF_EDA_NO, P005V7_A98TBT12_CRF_ID, P005V7_A97TBT12_SUBJECT_ID, P005V7_A96TBT12_STUDY_ID, P005V7_A679TBT12_EDIT_FLG, P005V7_n679TBT12_EDIT_FLG, P005V7_A465TBT12_CRF_VALUE,
            P005V7_n465TBT12_CRF_VALUE, P005V7_A469TBT12_UPD_DATETIME, P005V7_n469TBT12_UPD_DATETIME, P005V7_A470TBT12_UPD_USER_ID, P005V7_n470TBT12_UPD_USER_ID, P005V7_A471TBT12_UPD_PROG_NM, P005V7_n471TBT12_UPD_PROG_NM, P005V7_A472TBT12_UPD_CNT, P005V7_n472TBT12_UPD_CNT, P005V7_A99TBT12_CRF_ITEM_GRP_DIV
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
            P005V12_A92TBT11_STUDY_ID, P005V12_A93TBT11_SUBJECT_ID, P005V12_A94TBT11_CRF_ID, P005V12_A936TBT11_CRF_EDA_NO, P005V12_A457TBT11_DEL_FLG, P005V12_n457TBT11_DEL_FLG, P005V12_A459TBT11_CRT_USER_ID, P005V12_n459TBT11_CRT_USER_ID, P005V12_A891TBT11_UPD_RIYU, P005V12_n891TBT11_UPD_RIYU,
            P005V12_A461TBT11_UPD_DATETIME, P005V12_n461TBT11_UPD_DATETIME, P005V12_A462TBT11_UPD_USER_ID, P005V12_n462TBT11_UPD_USER_ID, P005V12_A463TBT11_UPD_PROG_NM, P005V12_n463TBT11_UPD_PROG_NM, P005V12_A464TBT11_UPD_CNT, P005V12_n464TBT11_UPD_CNT, P005V12_A95TBT11_CRF_VERSION
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
      AV53Pgmname = "AB706_PC01_REG_CRF" ;
      /* GeneXus formulas. */
      AV53Pgmname = "AB706_PC01_REG_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV46P_CRF_EDA_NO ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte A665TBT11_CRF_INPUT_LEVEL ;
   private byte AV55GXLvl299 ;
   private byte A937TBT12_CRF_EDA_NO ;
   private byte A938TBT13_CRF_EDA_NO ;
   private byte GXv_int2[] ;
   private short gxcookieaux ;
   private short AV13P_CRF_LATEST_VERSION ;
   private short AV12P_CRF_ID ;
   private short AV42W_TBM31_GRID_SIZE ;
   private short GXv_int1[] ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short AV9C_DM_INPUT_LEVEL ;
   private short AV43W_TBT02_CRF_LATEST_VERSION ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short Gx_err ;
   private short A98TBT12_CRF_ID ;
   private short A103TBT13_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private int AV17P_SUBJECT_ID ;
   private int AV50GXV1 ;
   private int AV51GXV2 ;
   private int A90TBT02_SUBJECT_ID ;
   private int GX_INS56 ;
   private int A93TBT11_SUBJECT_ID ;
   private int AV54GXV3 ;
   private int A97TBT12_SUBJECT_ID ;
   private int GX_INS57 ;
   private int GX_INS58 ;
   private int A102TBT13_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV16P_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private long A92TBT11_STUDY_ID ;
   private long A464TBT11_UPD_CNT ;
   private long A472TBT12_UPD_CNT ;
   private long A96TBT12_STUDY_ID ;
   private long A101TBT13_STUDY_ID ;
   private long A605TBT13_UPD_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String scmdbuf ;
   private String AV53Pgmname ;
   private String Gx_emsg ;
   private String GXt_char11 ;
   private String GXv_char10[] ;
   private java.util.Date A652TBT02_UPLOAD_DATETIME ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A658TBT02_APPROVAL_DATETIME ;
   private java.util.Date A662TBT02_INPUT_END_DATETIME ;
   private java.util.Date A453TBT02_UPD_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A672TBT11_APPROVAL_DATETIME ;
   private java.util.Date A676TBT11_INPUT_END_DATETIME ;
   private java.util.Date A458TBT11_CRT_DATETIME ;
   private java.util.Date A461TBT11_UPD_DATETIME ;
   private java.util.Date A469TBT12_UPD_DATETIME ;
   private java.util.Date A466TBT12_CRT_DATETIME ;
   private java.util.Date A599TBT13_CRT_DATETIME ;
   private java.util.Date A602TBT13_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n652TBT02_UPLOAD_DATETIME ;
   private boolean n653TBT02_UPLOAD_USER_ID ;
   private boolean n654TBT02_UPLOAD_AUTH_CD ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n657TBT02_APPROVAL_FLG ;
   private boolean n658TBT02_APPROVAL_DATETIME ;
   private boolean n659TBT02_APPROVAL_USER_ID ;
   private boolean n660TBT02_APPROVAL_AUTH_CD ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n662TBT02_INPUT_END_DATETIME ;
   private boolean n663TBT02_INPUT_END_USER_ID ;
   private boolean n664TBT02_INPUT_END_AUTH_CD ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean n453TBT02_UPD_DATETIME ;
   private boolean n454TBT02_UPD_USER_ID ;
   private boolean n455TBT02_UPD_PROG_NM ;
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
   private boolean n473TBT12_DEL_FLG ;
   private boolean n679TBT12_EDIT_FLG ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n469TBT12_UPD_DATETIME ;
   private boolean n470TBT12_UPD_USER_ID ;
   private boolean n471TBT12_UPD_PROG_NM ;
   private boolean n472TBT12_UPD_CNT ;
   private boolean n466TBT12_CRT_DATETIME ;
   private boolean n467TBT12_CRT_USER_ID ;
   private boolean n468TBT12_CRT_PROG_NM ;
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
   private String AV47P_CRF_ID_EDA_NO ;
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
   private String A653TBT02_UPLOAD_USER_ID ;
   private String A654TBT02_UPLOAD_AUTH_CD ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A657TBT02_APPROVAL_FLG ;
   private String A659TBT02_APPROVAL_USER_ID ;
   private String A660TBT02_APPROVAL_AUTH_CD ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A663TBT02_INPUT_END_USER_ID ;
   private String A664TBT02_INPUT_END_AUTH_CD ;
   private String A449TBT02_DEL_FLG ;
   private String A454TBT02_UPD_USER_ID ;
   private String A455TBT02_UPD_PROG_NM ;
   private String A667TBT11_UPLOAD_USER_ID ;
   private String A668TBT11_UPLOAD_AUTH_CD ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A671TBT11_APPROVAL_FLG ;
   private String A673TBT11_APPROVAL_USER_ID ;
   private String A674TBT11_APPROVAL_AUTH_CD ;
   private String A675TBT11_INPUT_END_FLG ;
   private String A677TBT11_INPUT_END_USER_ID ;
   private String A678TBT11_INPUT_END_AUTH_CD ;
   private String A891TBT11_UPD_RIYU ;
   private String A457TBT11_DEL_FLG ;
   private String A459TBT11_CRT_USER_ID ;
   private String A460TBT11_CRT_PROG_NM ;
   private String A462TBT11_UPD_USER_ID ;
   private String A463TBT11_UPD_PROG_NM ;
   private String AV31W_LOGTEXT ;
   private String A679TBT12_EDIT_FLG ;
   private String A465TBT12_CRF_VALUE ;
   private String A470TBT12_UPD_USER_ID ;
   private String A471TBT12_UPD_PROG_NM ;
   private String AV45W_MODE ;
   private String A473TBT12_DEL_FLG ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String AV44W_TBT12_EDIT_FLG ;
   private String A467TBT12_CRT_USER_ID ;
   private String A468TBT12_CRT_PROG_NM ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A597TBT13_CRF_VALUE ;
   private String A680TBT13_EDIT_FLG ;
   private String A598TBT13_DEL_FLG ;
   private String A600TBT13_CRT_USER_ID ;
   private String A601TBT13_CRT_PROG_NM ;
   private String A603TBT13_UPD_USER_ID ;
   private String A604TBT13_UPD_PROG_NM ;
   private String AV29W_ERRCD ;
   private String AV8C_DM_AUTH_CD ;
   private String AV39W_SESSION_KEY ;
   private com.genexus.webpanels.WebSession AV38W_SESSION ;
   private SdtB706_SD01_CRF_REG_RTN AV20SD_B706_SD01_CRF_REG_RTN ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV21SD_B792_SD00_HTML5_EXEC_INFO ;
   private IDataStoreProvider pr_default ;
   private long[] P005V2_A89TBT02_STUDY_ID ;
   private int[] P005V2_A90TBT02_SUBJECT_ID ;
   private short[] P005V2_A91TBT02_CRF_ID ;
   private byte[] P005V2_A935TBT02_CRF_EDA_NO ;
   private short[] P005V2_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] P005V2_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] P005V2_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P005V2_n499TBT02_CRF_INPUT_LEVEL ;
   private java.util.Date[] P005V2_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] P005V2_n652TBT02_UPLOAD_DATETIME ;
   private String[] P005V2_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] P005V2_n653TBT02_UPLOAD_USER_ID ;
   private String[] P005V2_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] P005V2_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] P005V2_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P005V2_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005V2_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P005V2_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P005V2_A657TBT02_APPROVAL_FLG ;
   private boolean[] P005V2_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] P005V2_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] P005V2_n658TBT02_APPROVAL_DATETIME ;
   private String[] P005V2_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] P005V2_n659TBT02_APPROVAL_USER_ID ;
   private String[] P005V2_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] P005V2_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] P005V2_A661TBT02_INPUT_END_FLG ;
   private boolean[] P005V2_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] P005V2_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] P005V2_n662TBT02_INPUT_END_DATETIME ;
   private String[] P005V2_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] P005V2_n663TBT02_INPUT_END_USER_ID ;
   private String[] P005V2_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] P005V2_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] P005V2_A449TBT02_DEL_FLG ;
   private boolean[] P005V2_n449TBT02_DEL_FLG ;
   private long[] P005V2_A456TBT02_UPD_CNT ;
   private boolean[] P005V2_n456TBT02_UPD_CNT ;
   private java.util.Date[] P005V2_A453TBT02_UPD_DATETIME ;
   private boolean[] P005V2_n453TBT02_UPD_DATETIME ;
   private String[] P005V2_A454TBT02_UPD_USER_ID ;
   private boolean[] P005V2_n454TBT02_UPD_USER_ID ;
   private String[] P005V2_A455TBT02_UPD_PROG_NM ;
   private boolean[] P005V2_n455TBT02_UPD_PROG_NM ;
   private String[] P005V7_A473TBT12_DEL_FLG ;
   private boolean[] P005V7_n473TBT12_DEL_FLG ;
   private String[] P005V7_A100TBT12_CRF_ITEM_GRP_CD ;
   private byte[] P005V7_A937TBT12_CRF_EDA_NO ;
   private short[] P005V7_A98TBT12_CRF_ID ;
   private int[] P005V7_A97TBT12_SUBJECT_ID ;
   private long[] P005V7_A96TBT12_STUDY_ID ;
   private String[] P005V7_A679TBT12_EDIT_FLG ;
   private boolean[] P005V7_n679TBT12_EDIT_FLG ;
   private String[] P005V7_A465TBT12_CRF_VALUE ;
   private boolean[] P005V7_n465TBT12_CRF_VALUE ;
   private java.util.Date[] P005V7_A469TBT12_UPD_DATETIME ;
   private boolean[] P005V7_n469TBT12_UPD_DATETIME ;
   private String[] P005V7_A470TBT12_UPD_USER_ID ;
   private boolean[] P005V7_n470TBT12_UPD_USER_ID ;
   private String[] P005V7_A471TBT12_UPD_PROG_NM ;
   private boolean[] P005V7_n471TBT12_UPD_PROG_NM ;
   private long[] P005V7_A472TBT12_UPD_CNT ;
   private boolean[] P005V7_n472TBT12_UPD_CNT ;
   private String[] P005V7_A99TBT12_CRF_ITEM_GRP_DIV ;
   private long[] P005V12_A92TBT11_STUDY_ID ;
   private int[] P005V12_A93TBT11_SUBJECT_ID ;
   private short[] P005V12_A94TBT11_CRF_ID ;
   private byte[] P005V12_A936TBT11_CRF_EDA_NO ;
   private String[] P005V12_A457TBT11_DEL_FLG ;
   private boolean[] P005V12_n457TBT11_DEL_FLG ;
   private String[] P005V12_A459TBT11_CRT_USER_ID ;
   private boolean[] P005V12_n459TBT11_CRT_USER_ID ;
   private String[] P005V12_A891TBT11_UPD_RIYU ;
   private boolean[] P005V12_n891TBT11_UPD_RIYU ;
   private java.util.Date[] P005V12_A461TBT11_UPD_DATETIME ;
   private boolean[] P005V12_n461TBT11_UPD_DATETIME ;
   private String[] P005V12_A462TBT11_UPD_USER_ID ;
   private boolean[] P005V12_n462TBT11_UPD_USER_ID ;
   private String[] P005V12_A463TBT11_UPD_PROG_NM ;
   private boolean[] P005V12_n463TBT11_UPD_PROG_NM ;
   private long[] P005V12_A464TBT11_UPD_CNT ;
   private boolean[] P005V12_n464TBT11_UPD_CNT ;
   private short[] P005V12_A95TBT11_CRF_VERSION ;
   private com.genexus.internet.HttpResponse AV10HttpResponse ;
   private SdtB792_SD01_CRF AV22SD_B792_SD01_CRF ;
   private SdtB792_SD01_CRF GXv_SdtB792_SD01_CRF3[] ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV23SD_B792_SD02_CRF_RESULT_I ;
   private SdtA_LOGIN_SDT AV24W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT12[] ;
}

final  class ab706_pc01_reg_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005V2", "SELECT `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_UPD_CNT`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_PROG_NM` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P005V3", "UPDATE `TBT02_CRF` SET `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_UPD_CNT`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005V4", "INSERT INTO `TBT11_CRF_HISTORY`(`TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_PROG_NM`, `TBT11_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005V5", "UPDATE `TBT02_CRF` SET `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_UPD_CNT`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005V6", "UPDATE `TBT02_CRF` SET `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_UPD_CNT`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005V7", "SELECT `TBT12_DEL_FLG`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_EDIT_FLG`, `TBT12_CRF_VALUE`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_PROG_NM`, `TBT12_UPD_CNT`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? and `TBT12_CRF_EDA_NO` = ?) AND (`TBT12_CRF_ITEM_GRP_CD` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`  LIMIT 1 FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P005V8", "UPDATE `TBT12_CRF_RESULT` SET `TBT12_EDIT_FLG`=?, `TBT12_CRF_VALUE`=?, `TBT12_UPD_DATETIME`=?, `TBT12_UPD_USER_ID`=?, `TBT12_UPD_PROG_NM`=?, `TBT12_UPD_CNT`=?  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005V9", "UPDATE `TBT12_CRF_RESULT` SET `TBT12_EDIT_FLG`=?, `TBT12_CRF_VALUE`=?, `TBT12_UPD_DATETIME`=?, `TBT12_UPD_USER_ID`=?, `TBT12_UPD_PROG_NM`=?, `TBT12_UPD_CNT`=?  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005V10", "INSERT INTO `TBT12_CRF_RESULT`(`TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_PROG_NM`, `TBT12_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005V11", "INSERT INTO `TBT13_CRF_RES_HIS`(`TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_PROG_NM`, `TBT13_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005V12", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_DEL_FLG`, `TBT11_CRT_USER_ID`, `TBT11_UPD_RIYU`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_PROG_NM`, `TBT11_UPD_CNT`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ?) AND (`TBT11_SUBJECT_ID` = ?) AND (`TBT11_CRF_ID` = ?) AND (`TBT11_CRF_EDA_NO` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_CRF_VERSION` DESC  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P005V13", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_UPD_RIYU`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_PROG_NM`=?, `TBT11_UPD_CNT`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005V14", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_UPD_RIYU`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_PROG_NM`=?, `TBT11_UPD_CNT`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005V15", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_UPD_RIYU`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_PROG_NM`=?, `TBT11_UPD_CNT`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((long[]) buf[36])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((byte[]) buf[3])[0] = rslt.getByte(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
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
               ((long[]) buf[17])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               ((short[]) buf[18])[0] = rslt.getShort(12) ;
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
               return;
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
               stmt.setByte(15, ((Number) parms[25]).byteValue());
               return;
            case 2 :
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
               return;
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
               stmt.setByte(15, ((Number) parms[25]).byteValue());
               return;
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
               stmt.setByte(15, ((Number) parms[25]).byteValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 50);
               return;
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
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setVarchar(11, (String)parms[16], 1, false);
               stmt.setVarchar(12, (String)parms[17], 50, false);
               return;
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
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setVarchar(11, (String)parms[16], 1, false);
               stmt.setVarchar(12, (String)parms[17], 50, false);
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
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
               stmt.setByte(9, ((Number) parms[13]).byteValue());
               stmt.setShort(10, ((Number) parms[14]).shortValue());
               return;
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
               stmt.setByte(9, ((Number) parms[13]).byteValue());
               stmt.setShort(10, ((Number) parms[14]).shortValue());
               return;
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
               stmt.setByte(9, ((Number) parms[13]).byteValue());
               stmt.setShort(10, ((Number) parms[14]).shortValue());
               return;
      }
   }

}

