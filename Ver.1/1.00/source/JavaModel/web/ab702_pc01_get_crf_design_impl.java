/*
               File: ab702_pc01_get_crf_design_impl
        Description: CRFデザイン情報取得
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:59.22
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab702_pc01_get_crf_design_impl extends GXWebProcedure
{
   public ab702_pc01_get_crf_design_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV23P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV24P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV19P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV21P_CRF_LATEST_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV22P_INIT_FLG = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S331354 */
      S331354 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV49W_ERR_FLG = "0" ;
      AV50W_ERR_MSG = "" ;
      AV9C_COLOR_WHITE = UIFactory.getColor( 255, 255, 255) ;
      /* Execute user subroutine: S11107 */
      S11107 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char1 = AV13C_HOJOSYA_AUTH_CD ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "014", GXv_char2) ;
      ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13C_HOJOSYA_AUTH_CD = GXt_char1 ;
      GXt_char1 = AV8C_ALL_AUTH_CD ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "023", GXv_char2) ;
      ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8C_ALL_AUTH_CD = GXt_char1 ;
      if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), "2") == 0 )
      {
         AV67W_RIREKI_URL = AV56W_HTTPREQUEST.getBaseURL() ;
         AV67W_RIREKI_URL = GXutil.strReplace( AV67W_RIREKI_URL, "servlet/", "") ;
         AV67W_RIREKI_URL = AV67W_RIREKI_URL + "static/Resources/rireki1.png" ;
      }
      AV14C_PAGE_CHOSEI = (short)(30) ;
      AV15C_PAGE_LOCATION_X_MAX = (short)(1000) ;
      AV16C_PAGE_LOCATION_Y_MAX = (short)(1414) ;
      AV17C_PAGE_LOCATION_Y2_MAX = (short)(2834+AV14C_PAGE_CHOSEI) ;
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         /* Execute user subroutine: S12126 */
         S12126 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         /* Execute user subroutine: S16314 */
         S16314 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         /* Execute user subroutine: S17389 */
         S17389 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         GXt_char1 = AV72W_SESSION_KEY ;
         GXv_char2[0] = GXt_char1 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char2[0] ;
         AV72W_SESSION_KEY = GXt_char1 ;
         AV71W_SESSION.setValue(AV72W_SESSION_KEY, AV34SD_B792_SD01_CRF.toxml(false, "B792_SD01_CRF", "SmartEDC_SHIZUOKA"));
      }
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Err_msg( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
      }
      else
      {
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( "1" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Err_msg( AV50W_ERR_MSG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
      }
      AV18HttpResponse.addString(AV25SD_B702_SD01_CRF_DESIGN.toJSonString());
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S11107( )
   {
      /* 'SUB_AUTH_LVL_GET' Routine */
      AV91GXLvl109 = (byte)(0) ;
      /* Using cursor P005F2 */
      pr_default.execute(0, new Object[] {AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd()});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A17TAM04_AUTH_CD = P005F2_A17TAM04_AUTH_CD[0] ;
         A601TAM04_AUTH_LVL = P005F2_A601TAM04_AUTH_LVL[0] ;
         n601TAM04_AUTH_LVL = P005F2_n601TAM04_AUTH_LVL[0] ;
         AV91GXLvl109 = (byte)(1) ;
         AV76W_TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV91GXLvl109 == 0 )
      {
         AV49W_ERR_FLG = "1" ;
         GXt_char1 = AV50W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S12126( )
   {
      /* 'SUB_CRF_READ' Routine */
      GXv_SdtB792_SD01_CRF3[0] = AV34SD_B792_SD01_CRF;
      GXv_char2[0] = AV68W_RTN_CD ;
      new b704_pc02_get_crf_val(remoteHandle, context).execute( GXv_SdtB792_SD01_CRF3, GXv_char2) ;
      AV34SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF3[0] ;
      ab702_pc01_get_crf_design_impl.this.AV68W_RTN_CD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV68W_RTN_CD, "1") == 0 )
      {
         /* Execute user subroutine: S131 */
         S131 ();
         if (returnInSub) return;
      }
      else
      {
         if ( ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id() == AV23P_STUDY_ID ) && ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id() == AV24P_SUBJECT_ID ) && ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id() == AV19P_CRF_ID ) && ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() == AV21P_CRF_LATEST_VERSION ) )
         {
         }
         else
         {
            GXv_char2[0] = AV68W_RTN_CD ;
            GXv_char4[0] = AV63W_MSG ;
            new b799_pc07_sdt_work_reg(remoteHandle, context).execute( AV71W_SESSION.getId(), AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV34SD_B792_SD01_CRF, GXv_char2, GXv_char4) ;
            ab702_pc01_get_crf_design_impl.this.AV68W_RTN_CD = GXv_char2[0] ;
            ab702_pc01_get_crf_design_impl.this.AV63W_MSG = GXv_char4[0] ;
            GXv_SdtB792_SD01_CRF3[0] = AV34SD_B792_SD01_CRF;
            GXv_char4[0] = AV68W_RTN_CD ;
            GXv_char2[0] = AV63W_MSG ;
            new b799_pc08_sdt_work_get(remoteHandle, context).execute( AV71W_SESSION.getId(), AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV23P_STUDY_ID, AV24P_SUBJECT_ID, AV19P_CRF_ID, AV21P_CRF_LATEST_VERSION, GXv_SdtB792_SD01_CRF3, GXv_char4, GXv_char2) ;
            AV34SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF3[0] ;
            ab702_pc01_get_crf_design_impl.this.AV68W_RTN_CD = GXv_char4[0] ;
            ab702_pc01_get_crf_design_impl.this.AV63W_MSG = GXv_char2[0] ;
            if ( GXutil.strcmp(AV68W_RTN_CD, "2") == 0 )
            {
               /* Execute user subroutine: S131 */
               S131 ();
               if (returnInSub) return;
            }
         }
      }
      if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), "1") == 0 )
      {
         if ( GXutil.strcmp(AV22P_INIT_FLG, "1") == 0 )
         {
            AV92GXV1 = 1 ;
            while ( AV92GXV1 <= AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
            {
               AV35SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV92GXV1));
               AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( AV35SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
               AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_edit_flg( "0" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
               AV92GXV1 = (int)(AV92GXV1+1) ;
            }
            new b704_pc03_remove_crf_val(remoteHandle, context).execute( AV23P_STUDY_ID, AV24P_SUBJECT_ID, AV19P_CRF_ID) ;
         }
      }
   }

   public void S131( )
   {
      /* 'SUB_CRF_GET' Routine */
      AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().clear();
      if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), "1") == 0 )
      {
         /* Execute user subroutine: S141 */
         S141 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S151 */
         S151 ();
         if (returnInSub) return;
      }
   }

   public void S141( )
   {
      /* 'SUB_CRF_DATA_GET' Routine */
      AV93GXLvl213 = (byte)(0) ;
      /* Using cursor P005F3 */
      pr_default.execute(1, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV19P_CRF_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A294TBT02_CRF_ID = P005F3_A294TBT02_CRF_ID[0] ;
         A293TBT02_SUBJECT_ID = P005F3_A293TBT02_SUBJECT_ID[0] ;
         A292TBT02_STUDY_ID = P005F3_A292TBT02_STUDY_ID[0] ;
         A295TBT02_DEL_FLG = P005F3_A295TBT02_DEL_FLG[0] ;
         n295TBT02_DEL_FLG = P005F3_n295TBT02_DEL_FLG[0] ;
         A370TBT02_CRF_LATEST_VERSION = P005F3_A370TBT02_CRF_LATEST_VERSION[0] ;
         n370TBT02_CRF_LATEST_VERSION = P005F3_n370TBT02_CRF_LATEST_VERSION[0] ;
         A560TBT02_UPLOAD_DATETIME = P005F3_A560TBT02_UPLOAD_DATETIME[0] ;
         n560TBT02_UPLOAD_DATETIME = P005F3_n560TBT02_UPLOAD_DATETIME[0] ;
         A371TBT02_CRF_INPUT_LEVEL = P005F3_A371TBT02_CRF_INPUT_LEVEL[0] ;
         n371TBT02_CRF_INPUT_LEVEL = P005F3_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A563TBT02_DM_ARRIVAL_FLG = P005F3_A563TBT02_DM_ARRIVAL_FLG[0] ;
         n563TBT02_DM_ARRIVAL_FLG = P005F3_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = P005F3_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = P005F3_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A569TBT02_INPUT_END_FLG = P005F3_A569TBT02_INPUT_END_FLG[0] ;
         n569TBT02_INPUT_END_FLG = P005F3_n569TBT02_INPUT_END_FLG[0] ;
         A299TBT02_UPD_DATETIME = P005F3_A299TBT02_UPD_DATETIME[0] ;
         n299TBT02_UPD_DATETIME = P005F3_n299TBT02_UPD_DATETIME[0] ;
         A302TBT02_UPD_CNT = P005F3_A302TBT02_UPD_CNT[0] ;
         n302TBT02_UPD_CNT = P005F3_n302TBT02_UPD_CNT[0] ;
         AV93GXLvl213 = (byte)(1) ;
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_study_id( A292TBT02_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_subject_id( A293TBT02_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_id( A294TBT02_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version( A370TBT02_CRF_LATEST_VERSION );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime( A560TBT02_UPLOAD_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level( A371TBT02_CRF_INPUT_LEVEL );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg( A563TBT02_DM_ARRIVAL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime( A564TBT02_DM_ARRIVAL_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg( A569TBT02_INPUT_END_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime( A299TBT02_UPD_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt( A302TBT02_UPD_CNT );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         /* Using cursor P005F4 */
         pr_default.execute(2, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A315TBT12_STUDY_ID = P005F4_A315TBT12_STUDY_ID[0] ;
            A316TBT12_SUBJECT_ID = P005F4_A316TBT12_SUBJECT_ID[0] ;
            A317TBT12_CRF_ID = P005F4_A317TBT12_CRF_ID[0] ;
            A328TBT12_DEL_FLG = P005F4_A328TBT12_DEL_FLG[0] ;
            n328TBT12_DEL_FLG = P005F4_n328TBT12_DEL_FLG[0] ;
            A318TBT12_CRF_ITEM_GRP_DIV = P005F4_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
            A319TBT12_CRF_ITEM_GRP_CD = P005F4_A319TBT12_CRF_ITEM_GRP_CD[0] ;
            A320TBT12_CRF_VALUE = P005F4_A320TBT12_CRF_VALUE[0] ;
            n320TBT12_CRF_VALUE = P005F4_n320TBT12_CRF_VALUE[0] ;
            A587TBT12_EDIT_FLG = P005F4_A587TBT12_EDIT_FLG[0] ;
            n587TBT12_EDIT_FLG = P005F4_n587TBT12_EDIT_FLG[0] ;
            AV35SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div( A318TBT12_CRF_ITEM_GRP_DIV );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd( A319TBT12_CRF_ITEM_GRP_CD );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( A320TBT12_CRF_VALUE );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org( A320TBT12_CRF_VALUE );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_edit_flg( A587TBT12_EDIT_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().add(AV35SD_B792_SD02_CRF_RESULT_I, 0);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV93GXLvl213 == 0 )
      {
         AV49W_ERR_FLG = "1" ;
         GXt_char1 = AV50W_ERR_MSG ;
         GXv_char4[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char4[0] ;
         AV50W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S151( )
   {
      /* 'SUB_CRF_HISTORY_GET' Routine */
      AV95GXLvl264 = (byte)(0) ;
      /* Using cursor P005F5 */
      pr_default.execute(3, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV19P_CRF_ID), new Short(AV21P_CRF_LATEST_VERSION)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A306TBT11_CRF_VERSION = P005F5_A306TBT11_CRF_VERSION[0] ;
         A305TBT11_CRF_ID = P005F5_A305TBT11_CRF_ID[0] ;
         A304TBT11_SUBJECT_ID = P005F5_A304TBT11_SUBJECT_ID[0] ;
         A303TBT11_STUDY_ID = P005F5_A303TBT11_STUDY_ID[0] ;
         A307TBT11_DEL_FLG = P005F5_A307TBT11_DEL_FLG[0] ;
         n307TBT11_DEL_FLG = P005F5_n307TBT11_DEL_FLG[0] ;
         A574TBT11_UPLOAD_DATETIME = P005F5_A574TBT11_UPLOAD_DATETIME[0] ;
         n574TBT11_UPLOAD_DATETIME = P005F5_n574TBT11_UPLOAD_DATETIME[0] ;
         A573TBT11_CRF_INPUT_LEVEL = P005F5_A573TBT11_CRF_INPUT_LEVEL[0] ;
         n573TBT11_CRF_INPUT_LEVEL = P005F5_n573TBT11_CRF_INPUT_LEVEL[0] ;
         A577TBT11_DM_ARRIVAL_FLG = P005F5_A577TBT11_DM_ARRIVAL_FLG[0] ;
         n577TBT11_DM_ARRIVAL_FLG = P005F5_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = P005F5_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         n578TBT11_DM_ARRIVAL_DATETIME = P005F5_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A583TBT11_INPUT_END_FLG = P005F5_A583TBT11_INPUT_END_FLG[0] ;
         n583TBT11_INPUT_END_FLG = P005F5_n583TBT11_INPUT_END_FLG[0] ;
         A311TBT11_UPD_DATETIME = P005F5_A311TBT11_UPD_DATETIME[0] ;
         n311TBT11_UPD_DATETIME = P005F5_n311TBT11_UPD_DATETIME[0] ;
         A314TBT11_UPD_CNT = P005F5_A314TBT11_UPD_CNT[0] ;
         n314TBT11_UPD_CNT = P005F5_n314TBT11_UPD_CNT[0] ;
         AV95GXLvl264 = (byte)(1) ;
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_study_id( A303TBT11_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_subject_id( A304TBT11_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_id( A305TBT11_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version( A306TBT11_CRF_VERSION );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime( A574TBT11_UPLOAD_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level( A573TBT11_CRF_INPUT_LEVEL );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg( A577TBT11_DM_ARRIVAL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime( A578TBT11_DM_ARRIVAL_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg( A583TBT11_INPUT_END_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime( A311TBT11_UPD_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt( A314TBT11_UPD_CNT );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B792_SD01_CRF", AV34SD_B792_SD01_CRF);
         /* Using cursor P005F6 */
         pr_default.execute(4, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A496TBT13_STUDY_ID = P005F6_A496TBT13_STUDY_ID[0] ;
            A497TBT13_SUBJECT_ID = P005F6_A497TBT13_SUBJECT_ID[0] ;
            A498TBT13_CRF_ID = P005F6_A498TBT13_CRF_ID[0] ;
            A499TBT13_CRF_VERSION = P005F6_A499TBT13_CRF_VERSION[0] ;
            A503TBT13_DEL_FLG = P005F6_A503TBT13_DEL_FLG[0] ;
            n503TBT13_DEL_FLG = P005F6_n503TBT13_DEL_FLG[0] ;
            A500TBT13_CRF_ITEM_GRP_DIV = P005F6_A500TBT13_CRF_ITEM_GRP_DIV[0] ;
            A501TBT13_CRF_ITEM_GRP_CD = P005F6_A501TBT13_CRF_ITEM_GRP_CD[0] ;
            A502TBT13_CRF_VALUE = P005F6_A502TBT13_CRF_VALUE[0] ;
            n502TBT13_CRF_VALUE = P005F6_n502TBT13_CRF_VALUE[0] ;
            A588TBT13_EDIT_FLG = P005F6_A588TBT13_EDIT_FLG[0] ;
            n588TBT13_EDIT_FLG = P005F6_n588TBT13_EDIT_FLG[0] ;
            AV35SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div( A500TBT13_CRF_ITEM_GRP_DIV );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd( A501TBT13_CRF_ITEM_GRP_CD );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( A502TBT13_CRF_VALUE );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org( A502TBT13_CRF_VALUE );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_edit_flg( A588TBT13_EDIT_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B792_SD02_CRF_RESULT_I", AV35SD_B792_SD02_CRF_RESULT_I);
            AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().add(AV35SD_B792_SD02_CRF_RESULT_I, 0);
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV95GXLvl264 == 0 )
      {
         AV49W_ERR_FLG = "1" ;
         GXt_char1 = AV50W_ERR_MSG ;
         GXv_char4[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char4[0] ;
         AV50W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S16314( )
   {
      /* 'SUB_HEADER_DESIGN' Routine */
      GXv_char4[0] = AV62W_MODE_KBN ;
      GXv_char2[0] = AV61W_MEMO_INPU_FLG ;
      GXv_char5[0] = AV44W_CRF_KANRI_FLG ;
      GXv_char6[0] = AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Study_nm() ;
      GXv_char7[0] = AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm() ;
      GXv_int8[0] = AV77W_TBM31_GRID_SIZE ;
      GXv_char9[0] = AV49W_ERR_FLG ;
      GXv_char10[0] = AV50W_ERR_MSG ;
      new b702_pc02_header_set(remoteHandle, context).execute( AV38W_A_LOGIN_SDT, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), AV23P_STUDY_ID, AV24P_SUBJECT_ID, AV19P_CRF_ID, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), GXv_char4, GXv_char2, GXv_char5, GXv_char6, GXv_char7, GXv_int8, GXv_char9, GXv_char10) ;
      ab702_pc01_get_crf_design_impl.this.AV62W_MODE_KBN = GXv_char4[0] ;
      ab702_pc01_get_crf_design_impl.this.AV61W_MEMO_INPU_FLG = GXv_char2[0] ;
      ab702_pc01_get_crf_design_impl.this.AV44W_CRF_KANRI_FLG = GXv_char5[0] ;
      AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Study_nm( GXv_char6[0] );
      AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm( GXv_char7[0] );
      ab702_pc01_get_crf_design_impl.this.AV77W_TBM31_GRID_SIZE = GXv_int8[0] ;
      ab702_pc01_get_crf_design_impl.this.AV49W_ERR_FLG = GXv_char9[0] ;
      ab702_pc01_get_crf_design_impl.this.AV50W_ERR_MSG = GXv_char10[0] ;
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         if ( GXutil.strcmp(AV62W_MODE_KBN, "0") == 0 )
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Move_value( "参照モード" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV58W_INP_FLG = "0" ;
         }
         else if ( GXutil.strcmp(AV62W_MODE_KBN, "1") == 0 )
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Move_value( "入力モード" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg( "1" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg( "1" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg( AV44W_CRF_KANRI_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV58W_INP_FLG = "1" ;
         }
         else if ( GXutil.strcmp(AV62W_MODE_KBN, "2") == 0 )
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Move_value( "テスト入力モード" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg( "1" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg( "1" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg( AV44W_CRF_KANRI_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            AV58W_INP_FLG = "1" ;
         }
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_User_info( AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()+" "+AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
         if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), AV10C_DM_AUTH_CD) == 0 )
         {
            if ( AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info().size() > 0 )
            {
               AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg( "1" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
            }
         }
         if ( GXutil.strcmp(AV61W_MEMO_INPU_FLG, "0") == 0 )
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
         }
         else
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg( "1" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
         }
      }
   }

   public void S17389( )
   {
      /* 'SUB_GET_CRF_DESIGN' Routine */
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().clear();
      if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), "2") == 0 )
      {
         /* Execute user subroutine: S181 */
         S181 ();
         if (returnInSub) return;
         /* Execute user subroutine: S191 */
         S191 ();
         if (returnInSub) return;
      }
      GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem11[0] = AV31SD_B702_SD05_DOMAIN_INFO ;
      new b702_pc06_domain_info_get(remoteHandle, context).execute( AV23P_STUDY_ID, AV19P_CRF_ID, GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem11) ;
      AV31SD_B702_SD05_DOMAIN_INFO = GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem11[0] ;
      AV42W_CNT = (short)(0) ;
      /* Using cursor P005F7 */
      pr_default.execute(5, new Object[] {new Long(AV23P_STUDY_ID), new Short(AV19P_CRF_ID)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A232TBM32_CRF_ID = P005F7_A232TBM32_CRF_ID[0] ;
         A231TBM32_STUDY_ID = P005F7_A231TBM32_STUDY_ID[0] ;
         A238TBM32_DEL_FLG = P005F7_A238TBM32_DEL_FLG[0] ;
         n238TBM32_DEL_FLG = P005F7_n238TBM32_DEL_FLG[0] ;
         A233TBM32_CRF_ITEM_CD = P005F7_A233TBM32_CRF_ITEM_CD[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = P005F7_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = P005F7_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A235TBM32_CRF_ITEM_DIV = P005F7_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = P005F7_n235TBM32_CRF_ITEM_DIV[0] ;
         A403TBM32_IMAGE_CD = P005F7_A403TBM32_IMAGE_CD[0] ;
         n403TBM32_IMAGE_CD = P005F7_n403TBM32_IMAGE_CD[0] ;
         A234TBM32_CRF_ITEM_NM = P005F7_A234TBM32_CRF_ITEM_NM[0] ;
         n234TBM32_CRF_ITEM_NM = P005F7_n234TBM32_CRF_ITEM_NM[0] ;
         A384TBM32_CRF_ITEM_GRP_ORDER = P005F7_A384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n384TBM32_CRF_ITEM_GRP_ORDER = P005F7_n384TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A552TBM32_AUTH_LVL_MIN = P005F7_A552TBM32_AUTH_LVL_MIN[0] ;
         n552TBM32_AUTH_LVL_MIN = P005F7_n552TBM32_AUTH_LVL_MIN[0] ;
         A385TBM32_LOCATION_X = P005F7_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = P005F7_n385TBM32_LOCATION_X[0] ;
         A386TBM32_LOCATION_Y = P005F7_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = P005F7_n386TBM32_LOCATION_Y[0] ;
         A387TBM32_LOCATION_X2 = P005F7_A387TBM32_LOCATION_X2[0] ;
         n387TBM32_LOCATION_X2 = P005F7_n387TBM32_LOCATION_X2[0] ;
         A388TBM32_LOCATION_Y2 = P005F7_A388TBM32_LOCATION_Y2[0] ;
         n388TBM32_LOCATION_Y2 = P005F7_n388TBM32_LOCATION_Y2[0] ;
         A389TBM32_TEXT_ALIGN_DIV = P005F7_A389TBM32_TEXT_ALIGN_DIV[0] ;
         n389TBM32_TEXT_ALIGN_DIV = P005F7_n389TBM32_TEXT_ALIGN_DIV[0] ;
         A393TBM32_TEXT_MAXROWS = P005F7_A393TBM32_TEXT_MAXROWS[0] ;
         n393TBM32_TEXT_MAXROWS = P005F7_n393TBM32_TEXT_MAXROWS[0] ;
         A394TBM32_TEXT_MAXLENGTH = P005F7_A394TBM32_TEXT_MAXLENGTH[0] ;
         n394TBM32_TEXT_MAXLENGTH = P005F7_n394TBM32_TEXT_MAXLENGTH[0] ;
         A395TBM32_DECIMAL_DIGITS = P005F7_A395TBM32_DECIMAL_DIGITS[0] ;
         n395TBM32_DECIMAL_DIGITS = P005F7_n395TBM32_DECIMAL_DIGITS[0] ;
         A399TBM32_CHK_TRUE_INNER_VALUE = P005F7_A399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n399TBM32_CHK_TRUE_INNER_VALUE = P005F7_n399TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A400TBM32_CHK_FALSE_INNER_VALUE = P005F7_A400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n400TBM32_CHK_FALSE_INNER_VALUE = P005F7_n400TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A401TBM32_TEXT = P005F7_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = P005F7_n401TBM32_TEXT[0] ;
         A390TBM32_FONT_SIZE = P005F7_A390TBM32_FONT_SIZE[0] ;
         n390TBM32_FONT_SIZE = P005F7_n390TBM32_FONT_SIZE[0] ;
         A391TBM32_FONT_UL_FLG = P005F7_A391TBM32_FONT_UL_FLG[0] ;
         n391TBM32_FONT_UL_FLG = P005F7_n391TBM32_FONT_UL_FLG[0] ;
         A392TBM32_FONT_COLOR_DIV = P005F7_A392TBM32_FONT_COLOR_DIV[0] ;
         n392TBM32_FONT_COLOR_DIV = P005F7_n392TBM32_FONT_COLOR_DIV[0] ;
         A398TBM32_LINE_SIZE_DIV = P005F7_A398TBM32_LINE_SIZE_DIV[0] ;
         n398TBM32_LINE_SIZE_DIV = P005F7_n398TBM32_LINE_SIZE_DIV[0] ;
         A603TBM32_LINE_COLOR_DIV = P005F7_A603TBM32_LINE_COLOR_DIV[0] ;
         n603TBM32_LINE_COLOR_DIV = P005F7_n603TBM32_LINE_COLOR_DIV[0] ;
         A396TBM32_LINE_START_POINT_DIV = P005F7_A396TBM32_LINE_START_POINT_DIV[0] ;
         n396TBM32_LINE_START_POINT_DIV = P005F7_n396TBM32_LINE_START_POINT_DIV[0] ;
         A397TBM32_LINE_END_POINT_DIV = P005F7_A397TBM32_LINE_END_POINT_DIV[0] ;
         n397TBM32_LINE_END_POINT_DIV = P005F7_n397TBM32_LINE_END_POINT_DIV[0] ;
         A604TBM32_LINE_ANGLE = P005F7_A604TBM32_LINE_ANGLE[0] ;
         n604TBM32_LINE_ANGLE = P005F7_n604TBM32_LINE_ANGLE[0] ;
         A553TBM32_ZORDER = P005F7_A553TBM32_ZORDER[0] ;
         n553TBM32_ZORDER = P005F7_n553TBM32_ZORDER[0] ;
         A605TBM32_TAB_ORDER = P005F7_A605TBM32_TAB_ORDER[0] ;
         n605TBM32_TAB_ORDER = P005F7_n605TBM32_TAB_ORDER[0] ;
         A606TBM32_TABSTOP_FLG = P005F7_A606TBM32_TABSTOP_FLG[0] ;
         n606TBM32_TABSTOP_FLG = P005F7_n606TBM32_TABSTOP_FLG[0] ;
         A746TBM32_REF_CRF_ID = P005F7_A746TBM32_REF_CRF_ID[0] ;
         n746TBM32_REF_CRF_ID = P005F7_n746TBM32_REF_CRF_ID[0] ;
         A747TBM32_REF_CRF_ITEM_CD = P005F7_A747TBM32_REF_CRF_ITEM_CD[0] ;
         n747TBM32_REF_CRF_ITEM_CD = P005F7_n747TBM32_REF_CRF_ITEM_CD[0] ;
         A404TBM32_FIXED_VALUE = P005F7_A404TBM32_FIXED_VALUE[0] ;
         n404TBM32_FIXED_VALUE = P005F7_n404TBM32_FIXED_VALUE[0] ;
         A402TBM32_LIST_CD = P005F7_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = P005F7_n402TBM32_LIST_CD[0] ;
         A607TBM32_REQUIRED_INPUT_FLG = P005F7_A607TBM32_REQUIRED_INPUT_FLG[0] ;
         n607TBM32_REQUIRED_INPUT_FLG = P005F7_n607TBM32_REQUIRED_INPUT_FLG[0] ;
         AV47W_DISP_FLG = "1" ;
         AV84W_TBT13_EDIT_FLG = "0" ;
         AV57W_IMAGE_URL = "" ;
         AV88W_TBM35_CRF_ITEM_CD = A233TBM32_CRF_ITEM_CD ;
         if ( ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Group") != 0 ) && ! (GXutil.strcmp("", A236TBM32_CRF_ITEM_GRP_CD)==0) )
         {
            AV88W_TBM35_CRF_ITEM_CD = AV88W_TBM35_CRF_ITEM_CD + "_Child" ;
         }
         /* Using cursor P005F8 */
         pr_default.execute(6, new Object[] {new Long(A231TBM32_STUDY_ID), new Short(A232TBM32_CRF_ID), AV88W_TBM35_CRF_ITEM_CD});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A471TBM35_STUDY_ID = P005F8_A471TBM35_STUDY_ID[0] ;
            A472TBM35_CRF_ID = P005F8_A472TBM35_CRF_ID[0] ;
            A476TBM35_DEL_FLG = P005F8_A476TBM35_DEL_FLG[0] ;
            n476TBM35_DEL_FLG = P005F8_n476TBM35_DEL_FLG[0] ;
            A473TBM35_CRF_ITEM_CD = P005F8_A473TBM35_CRF_ITEM_CD[0] ;
            A475TBM35_DISPLAY_FLG = P005F8_A475TBM35_DISPLAY_FLG[0] ;
            n475TBM35_DISPLAY_FLG = P005F8_n475TBM35_DISPLAY_FLG[0] ;
            A474TBM35_STUDY_AUTH_CD = P005F8_A474TBM35_STUDY_AUTH_CD[0] ;
            if ( GXutil.strcmp(A475TBM35_DISPLAY_FLG, "0") == 0 )
            {
               AV47W_DISP_FLG = "1" ;
            }
            else if ( GXutil.strcmp(A475TBM35_DISPLAY_FLG, "1") == 0 )
            {
               if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), AV13C_HOJOSYA_AUTH_CD) == 0 )
               {
                  AV47W_DISP_FLG = "0" ;
               }
               else
               {
                  AV47W_DISP_FLG = "1" ;
               }
            }
            else if ( GXutil.strcmp(A475TBM35_DISPLAY_FLG, "2") == 0 )
            {
               if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), AV10C_DM_AUTH_CD) == 0 )
               {
                  AV47W_DISP_FLG = "1" ;
               }
               else
               {
                  AV47W_DISP_FLG = "0" ;
               }
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( ! (GXutil.strcmp("", A403TBM32_IMAGE_CD)==0) )
         {
            GXt_char1 = AV57W_IMAGE_URL ;
            GXv_char10[0] = GXt_char1 ;
            new b799_pc02_image_url_get(remoteHandle, context).execute( A403TBM32_IMAGE_CD, GXv_char10) ;
            ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char10[0] ;
            AV57W_IMAGE_URL = GXt_char1 ;
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( A233TBM32_CRF_ITEM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( A234TBM32_CRF_ITEM_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( A235TBM32_CRF_ITEM_DIV );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd( A236TBM32_CRF_ITEM_GRP_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order( A384TBM32_CRF_ITEM_GRP_ORDER );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         if ( ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Group") != 0 ) && ! (GXutil.strcmp("", A236TBM32_CRF_ITEM_GRP_CD)==0) )
         {
            if ( A384TBM32_CRF_ITEM_GRP_ORDER == 0 )
            {
               AV42W_CNT = (short)(AV42W_CNT+1) ;
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order( AV42W_CNT );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( AV47W_DISP_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         if ( (0==A552TBM32_AUTH_LVL_MIN) )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( AV58W_INP_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         else
         {
            if ( AV76W_TAM04_AUTH_LVL < A552TBM32_AUTH_LVL_MIN )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( "0" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
            else
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( AV58W_INP_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size( AV77W_TBM31_GRID_SIZE );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( A385TBM32_LOCATION_X );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( A386TBM32_LOCATION_Y );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( A387TBM32_LOCATION_X2 );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( A388TBM32_LOCATION_Y2 );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") == 0 )
         {
            if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2() > AV15C_PAGE_LOCATION_X_MAX )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+80) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
            if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV17C_PAGE_LOCATION_Y2_MAX )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+20) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2() > AV15C_PAGE_LOCATION_X_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( AV15C_PAGE_LOCATION_X_MAX );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() > AV16C_PAGE_LOCATION_Y_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+AV14C_PAGE_CHOSEI) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV16C_PAGE_LOCATION_Y_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2()+AV14C_PAGE_CHOSEI) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() > AV17C_PAGE_LOCATION_Y2_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( AV17C_PAGE_LOCATION_Y2_MAX );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV17C_PAGE_LOCATION_Y2_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( AV17C_PAGE_LOCATION_Y2_MAX );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( A389TBM32_TEXT_ALIGN_DIV );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows( A393TBM32_TEXT_MAXROWS );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength( A394TBM32_TEXT_MAXLENGTH );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "NumericTextBox") == 0 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength()+1) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            if ( A395TBM32_DECIMAL_DIGITS > 0 )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength()+(A395TBM32_DECIMAL_DIGITS+1)) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "TextArea") == 0 )
         {
            if ( A393TBM32_TEXT_MAXROWS > 1 )
            {
               AV55W_HEIGHT = (long)(30*A393TBM32_TEXT_MAXROWS) ;
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+AV55W_HEIGHT) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value( A399TBM32_CHK_TRUE_INNER_VALUE );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value( A400TBM32_CHK_FALSE_INNER_VALUE );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( AV57W_IMAGE_URL );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( A401TBM32_TEXT );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         if ( A390TBM32_FONT_SIZE >= 18 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(A390TBM32_FONT_SIZE-1) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         else
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( A390TBM32_FONT_SIZE );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg( A391TBM32_FONT_UL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( A392TBM32_FONT_COLOR_DIV );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         if ( GXutil.strcmp(AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg(), "0") == 0 )
         {
            if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Label") == 0 )
            {
               if ( A392TBM32_FONT_COLOR_DIV == AV9C_COLOR_WHITE )
               {
                  AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               }
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( A398TBM32_LINE_SIZE_DIV );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         if ( ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Line") == 0 ) || ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Rect") == 0 ) || ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Paren") == 0 ) )
         {
            if ( A398TBM32_LINE_SIZE_DIV == 0 )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( (byte)(1) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div( A603TBM32_LINE_COLOR_DIV );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div( A396TBM32_LINE_START_POINT_DIV );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div( A397TBM32_LINE_END_POINT_DIV );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle( A604TBM32_LINE_ANGLE );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder( A553TBM32_ZORDER );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( A605TBM32_TAB_ORDER );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg( A606TBM32_TABSTOP_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id( A746TBM32_REF_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd( A747TBM32_REF_CRF_ITEM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         AV81W_TBM32_REF_CRF_ID = A746TBM32_REF_CRF_ID ;
         AV82W_TBM32_REF_CRF_ITEM_CD = A747TBM32_REF_CRF_ITEM_CD ;
         /* Execute user subroutine: S207 */
         S207 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Label") == 0 )
         {
            if ( ! (GXutil.strcmp("", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd())==0) && ! (GXutil.strcmp("", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm())==0) )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value( A404TBM32_FIXED_VALUE );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         else
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value( A404TBM32_FIXED_VALUE );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         if ( ! (GXutil.strcmp("", A402TBM32_LIST_CD)==0) )
         {
            AV80W_TBM32_LIST_CD = A402TBM32_LIST_CD ;
            /* Execute user subroutine: S217 */
            S217 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               returnInSub = true;
               if (true) return;
            }
         }
         if ( (GXutil.strcmp("", AV82W_TBM32_REF_CRF_ITEM_CD)==0) )
         {
            if ( (GXutil.strcmp("", A404TBM32_FIXED_VALUE)==0) )
            {
               if ( ! (GXutil.strcmp("", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd())==0) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd(), "DM") != 0 ) )
               {
                  /* Execute user subroutine: S227 */
                  S227 ();
                  if ( returnInSub )
                  {
                     pr_default.close(5);
                     returnInSub = true;
                     if (true) return;
                  }
               }
            }
         }
         if ( ! (GXutil.strcmp("", AV82W_TBM32_REF_CRF_ITEM_CD)==0) )
         {
            /* Execute user subroutine: S237 */
            S237 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Execute user subroutine: S247 */
         S247 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg(), "1") == 0 )
         {
            GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem12[0] = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I;
            new b702_pc07_ol_disp_item_set(remoteHandle, context).execute( AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info(), AV31SD_B702_SD05_DOMAIN_INFO, GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem12) ;
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem12[0] ;
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg(), "1") == 0 )
         {
            if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), "1") == 0 )
            {
               /* Execute user subroutine: S257 */
               S257 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
         if ( ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Label") != 0 ) && ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Image") != 0 ) && ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Line") != 0 ) && ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Rect") != 0 ) && ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Paren") != 0 ) )
         {
            AV60W_MARK_FLG = "0" ;
            if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg(), "1") == 0 )
            {
               if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), "1") == 0 )
               {
                  if ( GXutil.strcmp(A607TBM32_REQUIRED_INPUT_FLG, "1") == 0 )
                  {
                     AV60W_MARK_FLG = "1" ;
                  }
               }
               else
               {
                  if ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() != AV83W_TBT11_CRF_VERSION_MIN )
                  {
                     if ( GXutil.strcmp(AV84W_TBT13_EDIT_FLG, "1") == 0 )
                     {
                        AV60W_MARK_FLG = "1" ;
                     }
                  }
               }
            }
            if ( GXutil.strcmp(AV60W_MARK_FLG, "1") == 0 )
            {
               AV30SD_B702_SD04_MARK_DISP_I = (SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)new SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem(remoteHandle, context);
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd( A233TBM32_CRF_ITEM_CD );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SD_B702_SD04_MARK_DISP_I", AV30SD_B702_SD04_MARK_DISP_I);
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div( A235TBM32_CRF_ITEM_DIV );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SD_B702_SD04_MARK_DISP_I", AV30SD_B702_SD04_MARK_DISP_I);
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd( A236TBM32_CRF_ITEM_GRP_CD );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SD_B702_SD04_MARK_DISP_I", AV30SD_B702_SD04_MARK_DISP_I);
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text( A401TBM32_TEXT );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SD_B702_SD04_MARK_DISP_I", AV30SD_B702_SD04_MARK_DISP_I);
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SD_B702_SD04_MARK_DISP_I", AV30SD_B702_SD04_MARK_DISP_I);
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SD_B702_SD04_MARK_DISP_I", AV30SD_B702_SD04_MARK_DISP_I);
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SD_B702_SD04_MARK_DISP_I", AV30SD_B702_SD04_MARK_DISP_I);
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30SD_B702_SD04_MARK_DISP_I", AV30SD_B702_SD04_MARK_DISP_I);
               AV29SD_B702_SD04_MARK_DISP.add(AV30SD_B702_SD04_MARK_DISP_I, 0);
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Execute user subroutine: S261 */
      S261 ();
      if (returnInSub) return;
      /* Execute user subroutine: S271 */
      S271 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), "1") == 0 )
      {
         /* Execute user subroutine: S281 */
         S281 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S291 */
         S291 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: S301 */
      S301 ();
      if (returnInSub) return;
   }

   public void S301( )
   {
      /* 'SUB_SOTOWAKU' Routine */
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "SOTOWAKU1" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( "外枠１" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Rect" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( AV15C_PAGE_LOCATION_X_MAX );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( AV16C_PAGE_LOCATION_Y_MAX );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( (byte)(3) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "SOTOWAKUYOKO" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( "外枠横線" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Line" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(50) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( AV15C_PAGE_LOCATION_X_MAX );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(50) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( (byte)(3) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
      AV37W_2PAGE_FLG = "0" ;
      AV99GXV2 = 1 ;
      while ( AV99GXV2 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV99GXV2));
         if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") != 0 )
         {
            if ( ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() > AV16C_PAGE_LOCATION_Y_MAX ) || ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV16C_PAGE_LOCATION_Y_MAX ) )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "SOTOWAKU2" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( "外枠２" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Rect" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(0) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(1420+AV14C_PAGE_CHOSEI) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( AV15C_PAGE_LOCATION_X_MAX );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(2834+AV14C_PAGE_CHOSEI) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( (byte)(3) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
               AV37W_2PAGE_FLG = "1" ;
               if (true) break;
            }
         }
         AV99GXV2 = (int)(AV99GXV2+1) ;
      }
      if ( GXutil.strcmp(AV37W_2PAGE_FLG, "0") == 0 )
      {
         AV100GXV3 = 1 ;
         while ( AV100GXV3 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV100GXV3));
            if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 )
            {
               if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV16C_PAGE_LOCATION_Y_MAX )
               {
                  AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( AV16C_PAGE_LOCATION_Y_MAX );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
               }
            }
            AV100GXV3 = (int)(AV100GXV3+1) ;
         }
      }
   }

   public void S181( )
   {
      /* 'SUB_HISTORY_VERSION_MIN' Routine */
      /* Using cursor P005F9 */
      pr_default.execute(7, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV19P_CRF_ID)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A307TBT11_DEL_FLG = P005F9_A307TBT11_DEL_FLG[0] ;
         n307TBT11_DEL_FLG = P005F9_n307TBT11_DEL_FLG[0] ;
         A577TBT11_DM_ARRIVAL_FLG = P005F9_A577TBT11_DM_ARRIVAL_FLG[0] ;
         n577TBT11_DM_ARRIVAL_FLG = P005F9_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A305TBT11_CRF_ID = P005F9_A305TBT11_CRF_ID[0] ;
         A304TBT11_SUBJECT_ID = P005F9_A304TBT11_SUBJECT_ID[0] ;
         A303TBT11_STUDY_ID = P005F9_A303TBT11_STUDY_ID[0] ;
         A306TBT11_CRF_VERSION = P005F9_A306TBT11_CRF_VERSION[0] ;
         AV83W_TBT11_CRF_VERSION_MIN = A306TBT11_CRF_VERSION ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S191( )
   {
      /* 'SUB_HISTORY_INFO' Routine */
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "HISTORY_MARK" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Image" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(696) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(3) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(717) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(24) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( AV67W_RIREKI_URL );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "HISTORY_VER" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Label" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(717) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(3) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(787) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(23) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( "left" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV46W_DISP_CRF_VERSION = (short)((AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version()-AV83W_TBT11_CRF_VERSION_MIN)+1) ;
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "更新Ver."+GXutil.trim( GXutil.str( AV46W_DISP_CRF_VERSION, 4, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(14) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( UIFactory.getColor( 255, 140, 0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "HISTORY_DTTM" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Label" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(795) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(3) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(975) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(23) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( "left" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      if ( GXutil.nullDate().equals(AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime()) )
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "更新日時:                  " );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      }
      else
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "更新日時:"+GXutil.trim( localUtil.ttoc( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime(), 10, 8, 0, 1, "/", ":", " ")) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      }
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(14) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( UIFactory.getColor( 255, 140, 0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
   }

   public void S207( )
   {
      /* 'SUB_GET_CRF_DOM_MAP' Routine */
      AV102GXV4 = 1 ;
      while ( AV102GXV4 <= AV31SD_B702_SD05_DOMAIN_INFO.size() )
      {
         AV32SD_B702_SD05_DOMAIN_INFO_I = (SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem)((SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem)AV31SD_B702_SD05_DOMAIN_INFO.elementAt(-1+AV102GXV4));
         if ( GXutil.strcmp(AV32SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd(), AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd()) == 0 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd( AV32SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm( AV32SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            if (true) break;
         }
         AV102GXV4 = (int)(AV102GXV4+1) ;
      }
   }

   public void S227( )
   {
      /* 'SUB_GET_DOM_AUTO_MAP' Routine */
      /* Using cursor P005F10 */
      pr_default.execute(8, new Object[] {new Long(AV23P_STUDY_ID), AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm()});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A274TBM37_DEL_FLG = P005F10_A274TBM37_DEL_FLG[0] ;
         n274TBM37_DEL_FLG = P005F10_n274TBM37_DEL_FLG[0] ;
         A375TBM37_DOM_VAR_NM = P005F10_A375TBM37_DOM_VAR_NM[0] ;
         n375TBM37_DOM_VAR_NM = P005F10_n375TBM37_DOM_VAR_NM[0] ;
         A374TBM37_DOM_CD = P005F10_A374TBM37_DOM_CD[0] ;
         n374TBM37_DOM_CD = P005F10_n374TBM37_DOM_CD[0] ;
         A271TBM37_STUDY_ID = P005F10_A271TBM37_STUDY_ID[0] ;
         A273TBM37_CRF_ITEM_GRP_CD = P005F10_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         A272TBM37_CRF_ID = P005F10_A272TBM37_CRF_ID[0] ;
         A372TBM37_CRF_ITEM_GRP_DIV = P005F10_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         AV81W_TBM32_REF_CRF_ID = A272TBM37_CRF_ID ;
         AV82W_TBM32_REF_CRF_ITEM_CD = A273TBM37_CRF_ITEM_GRP_CD ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S217( )
   {
      /* 'SUB_GET_LIST_ITEMS' Routine */
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items().clear();
      AV104GXLvl956 = (byte)(0) ;
      /* Using cursor P005F11 */
      pr_default.execute(9, new Object[] {new Long(AV23P_STUDY_ID), AV80W_TBM32_LIST_CD});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A451TBM26_DEL_FLG = P005F11_A451TBM26_DEL_FLG[0] ;
         n451TBM26_DEL_FLG = P005F11_n451TBM26_DEL_FLG[0] ;
         A448TBM26_LIST_ITEM_NO = P005F11_A448TBM26_LIST_ITEM_NO[0] ;
         A447TBM26_LIST_CD = P005F11_A447TBM26_LIST_CD[0] ;
         A446TBM26_STUDY_ID = P005F11_A446TBM26_STUDY_ID[0] ;
         A449TBM26_LIST_ITEM_NAME = P005F11_A449TBM26_LIST_ITEM_NAME[0] ;
         n449TBM26_LIST_ITEM_NAME = P005F11_n449TBM26_LIST_ITEM_NAME[0] ;
         A450TBM26_INNER_VALUE = P005F11_A450TBM26_INNER_VALUE[0] ;
         n450TBM26_INNER_VALUE = P005F11_n450TBM26_INNER_VALUE[0] ;
         AV104GXLvl956 = (byte)(1) ;
         AV28SD_B702_SD03_SEL_LIST_ITEM_I = (SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem)new SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem(remoteHandle, context);
         AV28SD_B702_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no( A448TBM26_LIST_ITEM_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28SD_B702_SD03_SEL_LIST_ITEM_I", AV28SD_B702_SD03_SEL_LIST_ITEM_I);
         AV28SD_B702_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name( A449TBM26_LIST_ITEM_NAME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28SD_B702_SD03_SEL_LIST_ITEM_I", AV28SD_B702_SD03_SEL_LIST_ITEM_I);
         AV28SD_B702_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value( A450TBM26_INNER_VALUE );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28SD_B702_SD03_SEL_LIST_ITEM_I", AV28SD_B702_SD03_SEL_LIST_ITEM_I);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items().add(AV28SD_B702_SD03_SEL_LIST_ITEM_I, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      if ( AV104GXLvl956 == 0 )
      {
         AV49W_ERR_FLG = "1" ;
         GXt_char1 = AV50W_ERR_MSG ;
         GXv_char10[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char10) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char10[0] ;
         AV50W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S237( )
   {
      /* 'SUB_REF_CRF_VALUE_SET' Routine */
      GXv_char10[0] = AV45W_CRF_VALUE ;
      new b702_pc03_ref_crf_value(remoteHandle, context).execute( AV23P_STUDY_ID, AV24P_SUBJECT_ID, AV81W_TBM32_REF_CRF_ID, AV82W_TBM32_REF_CRF_ITEM_CD, AV34SD_B792_SD01_CRF, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), GXv_char10) ;
      ab702_pc01_get_crf_design_impl.this.AV45W_CRF_VALUE = GXv_char10[0] ;
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( AV45W_CRF_VALUE );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
   }

   public void S247( )
   {
      /* 'SUB_CRF_VALUE_SET' Routine */
      AV105GXV5 = 1 ;
      while ( AV105GXV5 <= AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
      {
         AV35SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV105GXV5));
         if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd(), AV35SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd()) == 0 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value( AV35SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            AV84W_TBT13_EDIT_FLG = AV35SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_edit_flg() ;
            if (true) break;
         }
         AV105GXV5 = (int)(AV105GXV5+1) ;
      }
   }

   public void S257( )
   {
      /* 'SUB_MEMO_SET' Routine */
      /* Using cursor P005F12 */
      pr_default.execute(10, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV19P_CRF_ID), AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd()});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A924TBT14_KANRYO_FLG = P005F12_A924TBT14_KANRYO_FLG[0] ;
         n924TBT14_KANRYO_FLG = P005F12_n924TBT14_KANRYO_FLG[0] ;
         A337TBT14_DEL_FLG = P005F12_A337TBT14_DEL_FLG[0] ;
         n337TBT14_DEL_FLG = P005F12_n337TBT14_DEL_FLG[0] ;
         A351TBT15_DEL_FLG = P005F12_A351TBT15_DEL_FLG[0] ;
         n351TBT15_DEL_FLG = P005F12_n351TBT15_DEL_FLG[0] ;
         A926TBT15_CRF_ITEM_GRP_CD = P005F12_A926TBT15_CRF_ITEM_GRP_CD[0] ;
         n926TBT15_CRF_ITEM_GRP_CD = P005F12_n926TBT15_CRF_ITEM_GRP_CD[0] ;
         A347TBT15_CRF_ID = P005F12_A347TBT15_CRF_ID[0] ;
         n347TBT15_CRF_ID = P005F12_n347TBT15_CRF_ID[0] ;
         A346TBT15_SUBJECT_ID = P005F12_A346TBT15_SUBJECT_ID[0] ;
         A345TBT15_STUDY_ID = P005F12_A345TBT15_STUDY_ID[0] ;
         A925TBT15_MEMO_NO = P005F12_A925TBT15_MEMO_NO[0] ;
         A924TBT14_KANRYO_FLG = P005F12_A924TBT14_KANRYO_FLG[0] ;
         n924TBT14_KANRYO_FLG = P005F12_n924TBT14_KANRYO_FLG[0] ;
         A337TBT14_DEL_FLG = P005F12_A337TBT14_DEL_FLG[0] ;
         n337TBT14_DEL_FLG = P005F12_n337TBT14_DEL_FLG[0] ;
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no( A925TBT15_MEMO_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         /* Execute user subroutine: S3112 */
         S3112 ();
         if ( returnInSub )
         {
            pr_default.close(10);
            pr_default.close(10);
            returnInSub = true;
            if (true) return;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S3112( )
   {
      /* 'SUB_MEMO_KBN_SET' Routine */
      /* Using cursor P005F13 */
      pr_default.execute(11, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no())});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A922TBT14_MEMO_NO = P005F13_A922TBT14_MEMO_NO[0] ;
         A330TBT14_SUBJECT_ID = P005F13_A330TBT14_SUBJECT_ID[0] ;
         A329TBT14_STUDY_ID = P005F13_A329TBT14_STUDY_ID[0] ;
         A930TBT14_CRT_AUTH_CD = P005F13_A930TBT14_CRT_AUTH_CD[0] ;
         n930TBT14_CRT_AUTH_CD = P005F13_n930TBT14_CRT_AUTH_CD[0] ;
         A339TBT14_CRT_USER_ID = P005F13_A339TBT14_CRT_USER_ID[0] ;
         n339TBT14_CRT_USER_ID = P005F13_n339TBT14_CRT_USER_ID[0] ;
         A923TBT14_MEMO_KBN = P005F13_A923TBT14_MEMO_KBN[0] ;
         n923TBT14_MEMO_KBN = P005F13_n923TBT14_MEMO_KBN[0] ;
         A929TBT14_REQUEST_AUTH_CD = P005F13_A929TBT14_REQUEST_AUTH_CD[0] ;
         n929TBT14_REQUEST_AUTH_CD = P005F13_n929TBT14_REQUEST_AUTH_CD[0] ;
         A928TBT14_REQUEST_SITE_ID = P005F13_A928TBT14_REQUEST_SITE_ID[0] ;
         n928TBT14_REQUEST_SITE_ID = P005F13_n928TBT14_REQUEST_SITE_ID[0] ;
         A927TBT14_KAKUNIN_FLG = P005F13_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P005F13_n927TBT14_KAKUNIN_FLG[0] ;
         if ( ( GXutil.strcmp(A339TBT14_CRT_USER_ID, AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()) == 0 ) && ( GXutil.strcmp(A930TBT14_CRT_AUTH_CD, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd()) == 0 ) )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( A923TBT14_MEMO_KBN );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         else
         {
            if ( ( GXutil.strcmp(A928TBT14_REQUEST_SITE_ID, AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()) == 0 ) && ( ( GXutil.strcmp(A929TBT14_REQUEST_AUTH_CD, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd()) == 0 ) || ( GXutil.strcmp(A929TBT14_REQUEST_AUTH_CD, AV8C_ALL_AUTH_CD) == 0 ) ) )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( "2" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         if ( GXutil.strcmp(A927TBT14_KAKUNIN_FLG, "1") == 0 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( "3" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S281( )
   {
      /* 'SUB_REQUIRED_MARK_SET' Routine */
      AV29SD_B702_SD04_MARK_DISP.sort("TBM32_CRF_ITEM_GRP_CD, TBM32_CRF_ITEM_CD");
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().sort("CRF_ITEM_GRP_CD, [CRF_ITEM_GRP_ORDER]");
      AV108GXV6 = 1 ;
      while ( AV108GXV6 <= AV29SD_B702_SD04_MARK_DISP.size() )
      {
         AV30SD_B702_SD04_MARK_DISP_I = (SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)((SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)AV29SD_B702_SD04_MARK_DISP.elementAt(-1+AV108GXV6));
         if ( GXutil.strcmp(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(), "Group") == 0 )
         {
            AV109GXV7 = 1 ;
            while ( AV109GXV7 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV109GXV7));
               if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd()) == 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg(), "1") == 0 ) )
               {
                  if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Label") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Line") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Rect") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Paren") != 0 ) )
                  {
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd()+"_REQUIRED2" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Label" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "RadioBox") == 0 )
                     {
                        AV59W_LEN = (short)(GXutil.byteCount( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text(), "UTF8")*9) ;
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+AV59W_LEN+1) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+12) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+AV59W_LEN+11) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+12) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     }
                     else
                     {
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2()+1) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+4) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2()+11) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+4) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     }
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( "left" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "*" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(16) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( UIFactory.getColor( 255, 0, 0) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
                     AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV27SD_B702_SD02_CRF_ITEM_MARK_I, 0);
                     if (true) break;
                  }
               }
               AV109GXV7 = (int)(AV109GXV7+1) ;
            }
         }
         else
         {
            AV53W_GRP_X = 0 ;
            AV54W_GRP_Y = 0 ;
            if ( ! (GXutil.strcmp("", AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd())==0) )
            {
               AV110GXV8 = 1 ;
               while ( AV110GXV8 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
               {
                  AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV110GXV8));
                  AV47W_DISP_FLG = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg() ;
                  if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd()) == 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 ) )
                  {
                     AV53W_GRP_X = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x() ;
                     AV54W_GRP_Y = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() ;
                     if (true) break;
                  }
                  AV110GXV8 = (int)(AV110GXV8+1) ;
               }
            }
            if ( GXutil.strcmp(AV47W_DISP_FLG, "1") == 0 )
            {
               AV27SD_B702_SD02_CRF_ITEM_MARK_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd()+"_REQUIRED1" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Label" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV53W_GRP_X+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2()+1) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV54W_GRP_Y+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+4) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV53W_GRP_X+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2()+11) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV54W_GRP_Y+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+4) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( "left" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "*" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(16) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( UIFactory.getColor( 255, 0, 0) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV27SD_B702_SD02_CRF_ITEM_MARK_I, 0);
            }
         }
         AV108GXV6 = (int)(AV108GXV6+1) ;
      }
   }

   public void S291( )
   {
      /* 'SUB_EDIT_MARK_SET' Routine */
      AV29SD_B702_SD04_MARK_DISP.sort("TBM32_CRF_ITEM_GRP_CD, TBM32_CRF_ITEM_CD");
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().sort("CRF_ITEM_GRP_CD, [CRF_ITEM_GRP_ORDER]");
      AV111GXV9 = 1 ;
      while ( AV111GXV9 <= AV29SD_B702_SD04_MARK_DISP.size() )
      {
         AV30SD_B702_SD04_MARK_DISP_I = (SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)((SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)AV29SD_B702_SD04_MARK_DISP.elementAt(-1+AV111GXV9));
         if ( GXutil.strcmp(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(), "Group") == 0 )
         {
            AV65W_RADIO_GRP_FLG = "0" ;
            AV112GXV10 = 1 ;
            while ( AV112GXV10 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV112GXV10));
               if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd()) == 0 )
               {
                  if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "RadioBox") == 0 )
                  {
                     AV65W_RADIO_GRP_FLG = "1" ;
                     if (true) break;
                  }
               }
               AV112GXV10 = (int)(AV112GXV10+1) ;
            }
            if ( GXutil.strcmp(AV65W_RADIO_GRP_FLG, "1") == 0 )
            {
               AV27SD_B702_SD02_CRF_ITEM_MARK_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd()+"_HISTORY2" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Image" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV59W_LEN = (short)(GXutil.byteCount( GXutil.trim( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text()), "UTF8")*9) ;
               AV59W_LEN = (short)(AV59W_LEN+20) ;
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+AV59W_LEN) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+AV59W_LEN+21) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+21) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( AV67W_RIREKI_URL );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
               AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV27SD_B702_SD02_CRF_ITEM_MARK_I, 0);
            }
         }
         else
         {
            AV53W_GRP_X = 0 ;
            AV54W_GRP_Y = 0 ;
            if ( ! (GXutil.strcmp("", AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd())==0) )
            {
               AV113GXV11 = 1 ;
               while ( AV113GXV11 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
               {
                  AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV113GXV11));
                  if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd()) == 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 ) )
                  {
                     AV53W_GRP_X = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x() ;
                     AV54W_GRP_Y = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() ;
                     if (true) break;
                  }
                  AV113GXV11 = (int)(AV113GXV11+1) ;
               }
            }
            AV27SD_B702_SD02_CRF_ITEM_MARK_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd()+"_HISTORY1" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Image" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            if ( ( GXutil.strcmp(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(), "CheckBox") == 0 ) || ( GXutil.strcmp(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(), "RadioBox") == 0 ) )
            {
               AV59W_LEN = (short)(GXutil.byteCount( GXutil.trim( AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text()), "UTF8")*9) ;
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV53W_GRP_X+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV59W_LEN+11) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            }
            else
            {
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV53W_GRP_X+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2()) );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            }
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV54W_GRP_Y+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV27SD_B702_SD02_CRF_ITEM_MARK_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+21) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV27SD_B702_SD02_CRF_ITEM_MARK_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+21) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( AV67W_RIREKI_URL );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27SD_B702_SD02_CRF_ITEM_MARK_I", AV27SD_B702_SD02_CRF_ITEM_MARK_I);
            AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV27SD_B702_SD02_CRF_ITEM_MARK_I, 0);
         }
         AV111GXV9 = (int)(AV111GXV9+1) ;
      }
   }

   public void S261( )
   {
      /* 'SUB_GRP_NO_INP_NO_DISP' Routine */
      AV114GXV12 = 1 ;
      while ( AV114GXV12 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV114GXV12));
         if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 ) && ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg(), "0") == 0 ) || ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg(), "0") == 0 ) ) )
         {
            AV115GXV13 = 1 ;
            while ( AV115GXV13 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
            {
               AV39W_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV115GXV13));
               if ( ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") != 0 ) && ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd()) == 0 ) )
               {
                  AV39W_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39W_B702_SD02_CRF_ITEM_DESIGN_I", AV39W_B702_SD02_CRF_ITEM_DESIGN_I);
                  AV39W_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39W_B702_SD02_CRF_ITEM_DESIGN_I", AV39W_B702_SD02_CRF_ITEM_DESIGN_I);
                  if ( GXutil.strcmp(AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg(), "0") == 0 )
                  {
                     if ( AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div() == AV9C_COLOR_WHITE )
                     {
                        AV39W_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "0" );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39W_B702_SD02_CRF_ITEM_DESIGN_I", AV39W_B702_SD02_CRF_ITEM_DESIGN_I);
                     }
                  }
               }
               AV115GXV13 = (int)(AV115GXV13+1) ;
            }
         }
         AV114GXV12 = (int)(AV114GXV12+1) ;
      }
   }

   public void S271( )
   {
      /* 'SUB_TAB_ORDER_SET' Routine */
      AV75W_TAB_ORDER_FLG = "0" ;
      AV116GXV14 = 1 ;
      while ( AV116GXV14 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV116GXV14));
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order() > 0 )
         {
            AV75W_TAB_ORDER_FLG = "1" ;
            if (true) break;
         }
         AV116GXV14 = (int)(AV116GXV14+1) ;
      }
      if ( GXutil.strcmp(AV75W_TAB_ORDER_FLG, "0") == 0 )
      {
         AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().sort("LOCATION_Y, LOCATION_X");
         AV74W_TAB_ORDER = (short)(0) ;
         AV117GXV15 = 1 ;
         while ( AV117GXV15 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV117GXV15));
            if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Label") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Line") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Rect") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Paren") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "RadioBox") != 0 ) )
            {
               if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order() == 0 )
               {
                  if ( (GXutil.strcmp("", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd())==0) )
                  {
                     AV74W_TAB_ORDER = (short)(AV74W_TAB_ORDER+1) ;
                     AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( AV74W_TAB_ORDER );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 )
                     {
                        AV74W_TAB_ORDER = (short)(AV74W_TAB_ORDER+1) ;
                        AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( AV74W_TAB_ORDER );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26SD_B702_SD02_CRF_ITEM_DESIGN_I", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I);
                        AV79W_TBM32_CRF_ITEM_GRP_CD = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd() ;
                        /* Execute user subroutine: S321 */
                        S321 ();
                        if (returnInSub) return;
                     }
                  }
               }
            }
            AV117GXV15 = (int)(AV117GXV15+1) ;
         }
      }
   }

   public void S321( )
   {
      /* 'SUB_GRP_TAB_ORDER_SET' Routine */
      AV118GXV16 = 1 ;
      while ( AV118GXV16 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
      {
         AV39W_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV118GXV16));
         if ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV79W_TBM32_CRF_ITEM_GRP_CD) == 0 )
         {
            if ( ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "TextArea") == 0 ) || ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "NumericTextBox") == 0 ) || ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "CheckBox") == 0 ) || ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "SelectBox") == 0 ) )
            {
               AV74W_TAB_ORDER = (short)(AV74W_TAB_ORDER+1) ;
               AV39W_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( AV74W_TAB_ORDER );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39W_B702_SD02_CRF_ITEM_DESIGN_I", AV39W_B702_SD02_CRF_ITEM_DESIGN_I);
            }
         }
         AV118GXV16 = (int)(AV118GXV16+1) ;
      }
   }

   public void S331354( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT13[0] = AV38W_A_LOGIN_SDT;
      GXv_char10[0] = AV51W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT13, GXv_char10) ;
      AV38W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT13[0] ;
      ab702_pc01_get_crf_design_impl.this.AV51W_ERRCD = GXv_char10[0] ;
      if ( GXutil.strcmp(AV51W_ERRCD, "0") != 0 )
      {
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( "9" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
         AV18HttpResponse.addString(AV25SD_B702_SD01_CRF_DESIGN.toJSonString());
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXv_char10[0] = AV10C_DM_AUTH_CD ;
      GXv_int14[0] = (byte)(AV11C_DM_INPUT_LEVEL) ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char10, GXv_int14) ;
      ab702_pc01_get_crf_design_impl.this.AV10C_DM_AUTH_CD = GXv_char10[0] ;
      ab702_pc01_get_crf_design_impl.this.AV11C_DM_INPUT_LEVEL = GXv_int14[0] ;
      GXt_char1 = AV72W_SESSION_KEY ;
      GXv_char10[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char10) ;
      ab702_pc01_get_crf_design_impl.this.GXt_char1 = GXv_char10[0] ;
      AV72W_SESSION_KEY = GXt_char1 ;
      AV33SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV71W_SESSION.getValue(AV72W_SESSION_KEY), "");
   }

   public void S341381( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV119Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( "9" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25SD_B702_SD01_CRF_DESIGN", AV25SD_B702_SD01_CRF_DESIGN);
      AV18HttpResponse.addString(AV25SD_B702_SD01_CRF_DESIGN.toJSonString());
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
                  /* Execute user subroutine: S341381 */
                  S341381 ();
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
      AV22P_INIT_FLG = "" ;
      AV49W_ERR_FLG = "" ;
      AV50W_ERR_MSG = "" ;
      AV13C_HOJOSYA_AUTH_CD = "" ;
      AV8C_ALL_AUTH_CD = "" ;
      AV33SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      AV67W_RIREKI_URL = "" ;
      AV56W_HTTPREQUEST = httpContext.getHttpRequest();
      AV72W_SESSION_KEY = "" ;
      AV38W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV71W_SESSION = httpContext.getWebSession();
      AV34SD_B792_SD01_CRF = new SdtB792_SD01_CRF(remoteHandle, context);
      AV25SD_B702_SD01_CRF_DESIGN = new SdtB702_SD01_CRF_DESIGN(remoteHandle, context);
      AV18HttpResponse = httpContext.getHttpResponse();
      scmdbuf = "" ;
      P005F2_A17TAM04_AUTH_CD = new String[] {""} ;
      P005F2_A601TAM04_AUTH_LVL = new byte[1] ;
      P005F2_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      A17TAM04_AUTH_CD = "" ;
      AV68W_RTN_CD = "" ;
      AV63W_MSG = "" ;
      GXv_SdtB792_SD01_CRF3 = new SdtB792_SD01_CRF [1] ;
      AV35SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      P005F3_A294TBT02_CRF_ID = new short[1] ;
      P005F3_A293TBT02_SUBJECT_ID = new int[1] ;
      P005F3_A292TBT02_STUDY_ID = new long[1] ;
      P005F3_A295TBT02_DEL_FLG = new String[] {""} ;
      P005F3_n295TBT02_DEL_FLG = new boolean[] {false} ;
      P005F3_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      P005F3_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P005F3_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F3_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      P005F3_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P005F3_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P005F3_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P005F3_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005F3_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F3_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P005F3_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P005F3_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P005F3_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F3_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      P005F3_A302TBT02_UPD_CNT = new long[1] ;
      P005F3_n302TBT02_UPD_CNT = new boolean[] {false} ;
      A295TBT02_DEL_FLG = "" ;
      A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A569TBT02_INPUT_END_FLG = "" ;
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005F4_A315TBT12_STUDY_ID = new long[1] ;
      P005F4_A316TBT12_SUBJECT_ID = new int[1] ;
      P005F4_A317TBT12_CRF_ID = new short[1] ;
      P005F4_A328TBT12_DEL_FLG = new String[] {""} ;
      P005F4_n328TBT12_DEL_FLG = new boolean[] {false} ;
      P005F4_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P005F4_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F4_A320TBT12_CRF_VALUE = new String[] {""} ;
      P005F4_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      P005F4_A587TBT12_EDIT_FLG = new String[] {""} ;
      P005F4_n587TBT12_EDIT_FLG = new boolean[] {false} ;
      A328TBT12_DEL_FLG = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A320TBT12_CRF_VALUE = "" ;
      A587TBT12_EDIT_FLG = "" ;
      P005F5_A306TBT11_CRF_VERSION = new short[1] ;
      P005F5_A305TBT11_CRF_ID = new short[1] ;
      P005F5_A304TBT11_SUBJECT_ID = new int[1] ;
      P005F5_A303TBT11_STUDY_ID = new long[1] ;
      P005F5_A307TBT11_DEL_FLG = new String[] {""} ;
      P005F5_n307TBT11_DEL_FLG = new boolean[] {false} ;
      P005F5_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F5_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      P005F5_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      P005F5_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P005F5_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P005F5_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005F5_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F5_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P005F5_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      P005F5_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      P005F5_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F5_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      P005F5_A314TBT11_UPD_CNT = new long[1] ;
      P005F5_n314TBT11_UPD_CNT = new boolean[] {false} ;
      A307TBT11_DEL_FLG = "" ;
      A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A583TBT11_INPUT_END_FLG = "" ;
      A311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005F6_A496TBT13_STUDY_ID = new long[1] ;
      P005F6_A497TBT13_SUBJECT_ID = new int[1] ;
      P005F6_A498TBT13_CRF_ID = new short[1] ;
      P005F6_A499TBT13_CRF_VERSION = new short[1] ;
      P005F6_A503TBT13_DEL_FLG = new String[] {""} ;
      P005F6_n503TBT13_DEL_FLG = new boolean[] {false} ;
      P005F6_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P005F6_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F6_A502TBT13_CRF_VALUE = new String[] {""} ;
      P005F6_n502TBT13_CRF_VALUE = new boolean[] {false} ;
      P005F6_A588TBT13_EDIT_FLG = new String[] {""} ;
      P005F6_n588TBT13_EDIT_FLG = new boolean[] {false} ;
      A503TBT13_DEL_FLG = "" ;
      A500TBT13_CRF_ITEM_GRP_DIV = "" ;
      A501TBT13_CRF_ITEM_GRP_CD = "" ;
      A502TBT13_CRF_VALUE = "" ;
      A588TBT13_EDIT_FLG = "" ;
      AV62W_MODE_KBN = "" ;
      GXv_char4 = new String [1] ;
      AV61W_MEMO_INPU_FLG = "" ;
      GXv_char2 = new String [1] ;
      AV44W_CRF_KANRI_FLG = "" ;
      GXv_char5 = new String [1] ;
      GXv_char6 = new String [1] ;
      GXv_char7 = new String [1] ;
      GXv_int8 = new short [1] ;
      GXv_char9 = new String [1] ;
      AV58W_INP_FLG = "" ;
      AV10C_DM_AUTH_CD = "" ;
      AV31SD_B702_SD05_DOMAIN_INFO = new GxObjectCollection(SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem.class, "B702_SD05_DOMAIN_INFO.B702_SD05_DOMAIN_INFOItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem11 = new GxObjectCollection [1] ;
      P005F7_A232TBM32_CRF_ID = new short[1] ;
      P005F7_A231TBM32_STUDY_ID = new long[1] ;
      P005F7_A238TBM32_DEL_FLG = new String[] {""} ;
      P005F7_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P005F7_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005F7_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F7_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005F7_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005F7_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005F7_A403TBM32_IMAGE_CD = new String[] {""} ;
      P005F7_n403TBM32_IMAGE_CD = new boolean[] {false} ;
      P005F7_A234TBM32_CRF_ITEM_NM = new String[] {""} ;
      P005F7_n234TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P005F7_A384TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P005F7_n384TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P005F7_A552TBM32_AUTH_LVL_MIN = new byte[1] ;
      P005F7_n552TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P005F7_A385TBM32_LOCATION_X = new short[1] ;
      P005F7_n385TBM32_LOCATION_X = new boolean[] {false} ;
      P005F7_A386TBM32_LOCATION_Y = new short[1] ;
      P005F7_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      P005F7_A387TBM32_LOCATION_X2 = new short[1] ;
      P005F7_n387TBM32_LOCATION_X2 = new boolean[] {false} ;
      P005F7_A388TBM32_LOCATION_Y2 = new short[1] ;
      P005F7_n388TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P005F7_A389TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P005F7_n389TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P005F7_A393TBM32_TEXT_MAXROWS = new byte[1] ;
      P005F7_n393TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P005F7_A394TBM32_TEXT_MAXLENGTH = new short[1] ;
      P005F7_n394TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P005F7_A395TBM32_DECIMAL_DIGITS = new byte[1] ;
      P005F7_n395TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P005F7_A399TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P005F7_n399TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P005F7_A400TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P005F7_n400TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P005F7_A401TBM32_TEXT = new String[] {""} ;
      P005F7_n401TBM32_TEXT = new boolean[] {false} ;
      P005F7_A390TBM32_FONT_SIZE = new byte[1] ;
      P005F7_n390TBM32_FONT_SIZE = new boolean[] {false} ;
      P005F7_A391TBM32_FONT_UL_FLG = new String[] {""} ;
      P005F7_n391TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P005F7_A392TBM32_FONT_COLOR_DIV = new long[1] ;
      P005F7_n392TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P005F7_A398TBM32_LINE_SIZE_DIV = new byte[1] ;
      P005F7_n398TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P005F7_A603TBM32_LINE_COLOR_DIV = new long[1] ;
      P005F7_n603TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P005F7_A396TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P005F7_n396TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P005F7_A397TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P005F7_n397TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P005F7_A604TBM32_LINE_ANGLE = new short[1] ;
      P005F7_n604TBM32_LINE_ANGLE = new boolean[] {false} ;
      P005F7_A553TBM32_ZORDER = new short[1] ;
      P005F7_n553TBM32_ZORDER = new boolean[] {false} ;
      P005F7_A605TBM32_TAB_ORDER = new short[1] ;
      P005F7_n605TBM32_TAB_ORDER = new boolean[] {false} ;
      P005F7_A606TBM32_TABSTOP_FLG = new String[] {""} ;
      P005F7_n606TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P005F7_A746TBM32_REF_CRF_ID = new short[1] ;
      P005F7_n746TBM32_REF_CRF_ID = new boolean[] {false} ;
      P005F7_A747TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P005F7_n747TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P005F7_A404TBM32_FIXED_VALUE = new String[] {""} ;
      P005F7_n404TBM32_FIXED_VALUE = new boolean[] {false} ;
      P005F7_A402TBM32_LIST_CD = new String[] {""} ;
      P005F7_n402TBM32_LIST_CD = new boolean[] {false} ;
      P005F7_A607TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P005F7_n607TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      A238TBM32_DEL_FLG = "" ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A236TBM32_CRF_ITEM_GRP_CD = "" ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      A403TBM32_IMAGE_CD = "" ;
      A234TBM32_CRF_ITEM_NM = "" ;
      A389TBM32_TEXT_ALIGN_DIV = "" ;
      A399TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A400TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A401TBM32_TEXT = "" ;
      A391TBM32_FONT_UL_FLG = "" ;
      A396TBM32_LINE_START_POINT_DIV = "" ;
      A397TBM32_LINE_END_POINT_DIV = "" ;
      A606TBM32_TABSTOP_FLG = "" ;
      A747TBM32_REF_CRF_ITEM_CD = "" ;
      A404TBM32_FIXED_VALUE = "" ;
      A402TBM32_LIST_CD = "" ;
      A607TBM32_REQUIRED_INPUT_FLG = "" ;
      AV47W_DISP_FLG = "" ;
      AV84W_TBT13_EDIT_FLG = "" ;
      AV57W_IMAGE_URL = "" ;
      AV88W_TBM35_CRF_ITEM_CD = "" ;
      P005F8_A471TBM35_STUDY_ID = new long[1] ;
      P005F8_A472TBM35_CRF_ID = new short[1] ;
      P005F8_A476TBM35_DEL_FLG = new String[] {""} ;
      P005F8_n476TBM35_DEL_FLG = new boolean[] {false} ;
      P005F8_A473TBM35_CRF_ITEM_CD = new String[] {""} ;
      P005F8_A475TBM35_DISPLAY_FLG = new String[] {""} ;
      P005F8_n475TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P005F8_A474TBM35_STUDY_AUTH_CD = new String[] {""} ;
      A476TBM35_DEL_FLG = "" ;
      A473TBM35_CRF_ITEM_CD = "" ;
      A475TBM35_DISPLAY_FLG = "" ;
      A474TBM35_STUDY_AUTH_CD = "" ;
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV82W_TBM32_REF_CRF_ITEM_CD = "" ;
      AV80W_TBM32_LIST_CD = "" ;
      GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem12 = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem [1] ;
      AV60W_MARK_FLG = "" ;
      AV30SD_B702_SD04_MARK_DISP_I = new SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem(remoteHandle, context);
      AV29SD_B702_SD04_MARK_DISP = new GxObjectCollection(SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem.class, "B702_SD04_MARK_DISP.B702_SD04_MARK_DISPItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV37W_2PAGE_FLG = "" ;
      P005F9_A307TBT11_DEL_FLG = new String[] {""} ;
      P005F9_n307TBT11_DEL_FLG = new boolean[] {false} ;
      P005F9_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P005F9_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005F9_A305TBT11_CRF_ID = new short[1] ;
      P005F9_A304TBT11_SUBJECT_ID = new int[1] ;
      P005F9_A303TBT11_STUDY_ID = new long[1] ;
      P005F9_A306TBT11_CRF_VERSION = new short[1] ;
      AV32SD_B702_SD05_DOMAIN_INFO_I = new SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem(remoteHandle, context);
      P005F10_A274TBM37_DEL_FLG = new String[] {""} ;
      P005F10_n274TBM37_DEL_FLG = new boolean[] {false} ;
      P005F10_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      P005F10_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P005F10_A374TBM37_DOM_CD = new String[] {""} ;
      P005F10_n374TBM37_DOM_CD = new boolean[] {false} ;
      P005F10_A271TBM37_STUDY_ID = new long[1] ;
      P005F10_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F10_A272TBM37_CRF_ID = new short[1] ;
      P005F10_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A274TBM37_DEL_FLG = "" ;
      A375TBM37_DOM_VAR_NM = "" ;
      A374TBM37_DOM_CD = "" ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      P005F11_A451TBM26_DEL_FLG = new String[] {""} ;
      P005F11_n451TBM26_DEL_FLG = new boolean[] {false} ;
      P005F11_A448TBM26_LIST_ITEM_NO = new short[1] ;
      P005F11_A447TBM26_LIST_CD = new String[] {""} ;
      P005F11_A446TBM26_STUDY_ID = new long[1] ;
      P005F11_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      P005F11_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      P005F11_A450TBM26_INNER_VALUE = new String[] {""} ;
      P005F11_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      A451TBM26_DEL_FLG = "" ;
      A447TBM26_LIST_CD = "" ;
      A449TBM26_LIST_ITEM_NAME = "" ;
      A450TBM26_INNER_VALUE = "" ;
      AV28SD_B702_SD03_SEL_LIST_ITEM_I = new SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem(remoteHandle, context);
      AV45W_CRF_VALUE = "" ;
      P005F12_A924TBT14_KANRYO_FLG = new String[] {""} ;
      P005F12_n924TBT14_KANRYO_FLG = new boolean[] {false} ;
      P005F12_A337TBT14_DEL_FLG = new String[] {""} ;
      P005F12_n337TBT14_DEL_FLG = new boolean[] {false} ;
      P005F12_A351TBT15_DEL_FLG = new String[] {""} ;
      P005F12_n351TBT15_DEL_FLG = new boolean[] {false} ;
      P005F12_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F12_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005F12_A347TBT15_CRF_ID = new short[1] ;
      P005F12_n347TBT15_CRF_ID = new boolean[] {false} ;
      P005F12_A346TBT15_SUBJECT_ID = new int[1] ;
      P005F12_A345TBT15_STUDY_ID = new long[1] ;
      P005F12_A925TBT15_MEMO_NO = new short[1] ;
      A924TBT14_KANRYO_FLG = "" ;
      A337TBT14_DEL_FLG = "" ;
      A351TBT15_DEL_FLG = "" ;
      A926TBT15_CRF_ITEM_GRP_CD = "" ;
      P005F13_A922TBT14_MEMO_NO = new short[1] ;
      P005F13_A330TBT14_SUBJECT_ID = new int[1] ;
      P005F13_A329TBT14_STUDY_ID = new long[1] ;
      P005F13_A930TBT14_CRT_AUTH_CD = new String[] {""} ;
      P005F13_n930TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      P005F13_A339TBT14_CRT_USER_ID = new String[] {""} ;
      P005F13_n339TBT14_CRT_USER_ID = new boolean[] {false} ;
      P005F13_A923TBT14_MEMO_KBN = new String[] {""} ;
      P005F13_n923TBT14_MEMO_KBN = new boolean[] {false} ;
      P005F13_A929TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      P005F13_n929TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      P005F13_A928TBT14_REQUEST_SITE_ID = new String[] {""} ;
      P005F13_n928TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      P005F13_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      P005F13_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      A930TBT14_CRT_AUTH_CD = "" ;
      A339TBT14_CRT_USER_ID = "" ;
      A923TBT14_MEMO_KBN = "" ;
      A929TBT14_REQUEST_AUTH_CD = "" ;
      A928TBT14_REQUEST_SITE_ID = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      AV27SD_B702_SD02_CRF_ITEM_MARK_I = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV65W_RADIO_GRP_FLG = "" ;
      AV39W_B702_SD02_CRF_ITEM_DESIGN_I = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV75W_TAB_ORDER_FLG = "" ;
      AV79W_TBM32_CRF_ITEM_GRP_CD = "" ;
      GXv_SdtA_LOGIN_SDT13 = new SdtA_LOGIN_SDT [1] ;
      AV51W_ERRCD = "" ;
      GXv_int14 = new byte [1] ;
      GXv_char10 = new String [1] ;
      AV119Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab702_pc01_get_crf_design__default(),
         new Object[] {
             new Object[] {
            P005F2_A17TAM04_AUTH_CD, P005F2_A601TAM04_AUTH_LVL, P005F2_n601TAM04_AUTH_LVL
            }
            , new Object[] {
            P005F3_A294TBT02_CRF_ID, P005F3_A293TBT02_SUBJECT_ID, P005F3_A292TBT02_STUDY_ID, P005F3_A295TBT02_DEL_FLG, P005F3_n295TBT02_DEL_FLG, P005F3_A370TBT02_CRF_LATEST_VERSION, P005F3_n370TBT02_CRF_LATEST_VERSION, P005F3_A560TBT02_UPLOAD_DATETIME, P005F3_n560TBT02_UPLOAD_DATETIME, P005F3_A371TBT02_CRF_INPUT_LEVEL,
            P005F3_n371TBT02_CRF_INPUT_LEVEL, P005F3_A563TBT02_DM_ARRIVAL_FLG, P005F3_n563TBT02_DM_ARRIVAL_FLG, P005F3_A564TBT02_DM_ARRIVAL_DATETIME, P005F3_n564TBT02_DM_ARRIVAL_DATETIME, P005F3_A569TBT02_INPUT_END_FLG, P005F3_n569TBT02_INPUT_END_FLG, P005F3_A299TBT02_UPD_DATETIME, P005F3_n299TBT02_UPD_DATETIME, P005F3_A302TBT02_UPD_CNT,
            P005F3_n302TBT02_UPD_CNT
            }
            , new Object[] {
            P005F4_A315TBT12_STUDY_ID, P005F4_A316TBT12_SUBJECT_ID, P005F4_A317TBT12_CRF_ID, P005F4_A328TBT12_DEL_FLG, P005F4_n328TBT12_DEL_FLG, P005F4_A318TBT12_CRF_ITEM_GRP_DIV, P005F4_A319TBT12_CRF_ITEM_GRP_CD, P005F4_A320TBT12_CRF_VALUE, P005F4_n320TBT12_CRF_VALUE, P005F4_A587TBT12_EDIT_FLG,
            P005F4_n587TBT12_EDIT_FLG
            }
            , new Object[] {
            P005F5_A306TBT11_CRF_VERSION, P005F5_A305TBT11_CRF_ID, P005F5_A304TBT11_SUBJECT_ID, P005F5_A303TBT11_STUDY_ID, P005F5_A307TBT11_DEL_FLG, P005F5_n307TBT11_DEL_FLG, P005F5_A574TBT11_UPLOAD_DATETIME, P005F5_n574TBT11_UPLOAD_DATETIME, P005F5_A573TBT11_CRF_INPUT_LEVEL, P005F5_n573TBT11_CRF_INPUT_LEVEL,
            P005F5_A577TBT11_DM_ARRIVAL_FLG, P005F5_n577TBT11_DM_ARRIVAL_FLG, P005F5_A578TBT11_DM_ARRIVAL_DATETIME, P005F5_n578TBT11_DM_ARRIVAL_DATETIME, P005F5_A583TBT11_INPUT_END_FLG, P005F5_n583TBT11_INPUT_END_FLG, P005F5_A311TBT11_UPD_DATETIME, P005F5_n311TBT11_UPD_DATETIME, P005F5_A314TBT11_UPD_CNT, P005F5_n314TBT11_UPD_CNT
            }
            , new Object[] {
            P005F6_A496TBT13_STUDY_ID, P005F6_A497TBT13_SUBJECT_ID, P005F6_A498TBT13_CRF_ID, P005F6_A499TBT13_CRF_VERSION, P005F6_A503TBT13_DEL_FLG, P005F6_n503TBT13_DEL_FLG, P005F6_A500TBT13_CRF_ITEM_GRP_DIV, P005F6_A501TBT13_CRF_ITEM_GRP_CD, P005F6_A502TBT13_CRF_VALUE, P005F6_n502TBT13_CRF_VALUE,
            P005F6_A588TBT13_EDIT_FLG, P005F6_n588TBT13_EDIT_FLG
            }
            , new Object[] {
            P005F7_A232TBM32_CRF_ID, P005F7_A231TBM32_STUDY_ID, P005F7_A238TBM32_DEL_FLG, P005F7_n238TBM32_DEL_FLG, P005F7_A233TBM32_CRF_ITEM_CD, P005F7_A236TBM32_CRF_ITEM_GRP_CD, P005F7_n236TBM32_CRF_ITEM_GRP_CD, P005F7_A235TBM32_CRF_ITEM_DIV, P005F7_n235TBM32_CRF_ITEM_DIV, P005F7_A403TBM32_IMAGE_CD,
            P005F7_n403TBM32_IMAGE_CD, P005F7_A234TBM32_CRF_ITEM_NM, P005F7_n234TBM32_CRF_ITEM_NM, P005F7_A384TBM32_CRF_ITEM_GRP_ORDER, P005F7_n384TBM32_CRF_ITEM_GRP_ORDER, P005F7_A552TBM32_AUTH_LVL_MIN, P005F7_n552TBM32_AUTH_LVL_MIN, P005F7_A385TBM32_LOCATION_X, P005F7_n385TBM32_LOCATION_X, P005F7_A386TBM32_LOCATION_Y,
            P005F7_n386TBM32_LOCATION_Y, P005F7_A387TBM32_LOCATION_X2, P005F7_n387TBM32_LOCATION_X2, P005F7_A388TBM32_LOCATION_Y2, P005F7_n388TBM32_LOCATION_Y2, P005F7_A389TBM32_TEXT_ALIGN_DIV, P005F7_n389TBM32_TEXT_ALIGN_DIV, P005F7_A393TBM32_TEXT_MAXROWS, P005F7_n393TBM32_TEXT_MAXROWS, P005F7_A394TBM32_TEXT_MAXLENGTH,
            P005F7_n394TBM32_TEXT_MAXLENGTH, P005F7_A395TBM32_DECIMAL_DIGITS, P005F7_n395TBM32_DECIMAL_DIGITS, P005F7_A399TBM32_CHK_TRUE_INNER_VALUE, P005F7_n399TBM32_CHK_TRUE_INNER_VALUE, P005F7_A400TBM32_CHK_FALSE_INNER_VALUE, P005F7_n400TBM32_CHK_FALSE_INNER_VALUE, P005F7_A401TBM32_TEXT, P005F7_n401TBM32_TEXT, P005F7_A390TBM32_FONT_SIZE,
            P005F7_n390TBM32_FONT_SIZE, P005F7_A391TBM32_FONT_UL_FLG, P005F7_n391TBM32_FONT_UL_FLG, P005F7_A392TBM32_FONT_COLOR_DIV, P005F7_n392TBM32_FONT_COLOR_DIV, P005F7_A398TBM32_LINE_SIZE_DIV, P005F7_n398TBM32_LINE_SIZE_DIV, P005F7_A603TBM32_LINE_COLOR_DIV, P005F7_n603TBM32_LINE_COLOR_DIV, P005F7_A396TBM32_LINE_START_POINT_DIV,
            P005F7_n396TBM32_LINE_START_POINT_DIV, P005F7_A397TBM32_LINE_END_POINT_DIV, P005F7_n397TBM32_LINE_END_POINT_DIV, P005F7_A604TBM32_LINE_ANGLE, P005F7_n604TBM32_LINE_ANGLE, P005F7_A553TBM32_ZORDER, P005F7_n553TBM32_ZORDER, P005F7_A605TBM32_TAB_ORDER, P005F7_n605TBM32_TAB_ORDER, P005F7_A606TBM32_TABSTOP_FLG,
            P005F7_n606TBM32_TABSTOP_FLG, P005F7_A746TBM32_REF_CRF_ID, P005F7_n746TBM32_REF_CRF_ID, P005F7_A747TBM32_REF_CRF_ITEM_CD, P005F7_n747TBM32_REF_CRF_ITEM_CD, P005F7_A404TBM32_FIXED_VALUE, P005F7_n404TBM32_FIXED_VALUE, P005F7_A402TBM32_LIST_CD, P005F7_n402TBM32_LIST_CD, P005F7_A607TBM32_REQUIRED_INPUT_FLG,
            P005F7_n607TBM32_REQUIRED_INPUT_FLG
            }
            , new Object[] {
            P005F8_A471TBM35_STUDY_ID, P005F8_A472TBM35_CRF_ID, P005F8_A476TBM35_DEL_FLG, P005F8_n476TBM35_DEL_FLG, P005F8_A473TBM35_CRF_ITEM_CD, P005F8_A475TBM35_DISPLAY_FLG, P005F8_n475TBM35_DISPLAY_FLG, P005F8_A474TBM35_STUDY_AUTH_CD
            }
            , new Object[] {
            P005F9_A307TBT11_DEL_FLG, P005F9_n307TBT11_DEL_FLG, P005F9_A577TBT11_DM_ARRIVAL_FLG, P005F9_n577TBT11_DM_ARRIVAL_FLG, P005F9_A305TBT11_CRF_ID, P005F9_A304TBT11_SUBJECT_ID, P005F9_A303TBT11_STUDY_ID, P005F9_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            P005F10_A274TBM37_DEL_FLG, P005F10_n274TBM37_DEL_FLG, P005F10_A375TBM37_DOM_VAR_NM, P005F10_n375TBM37_DOM_VAR_NM, P005F10_A374TBM37_DOM_CD, P005F10_n374TBM37_DOM_CD, P005F10_A271TBM37_STUDY_ID, P005F10_A273TBM37_CRF_ITEM_GRP_CD, P005F10_A272TBM37_CRF_ID, P005F10_A372TBM37_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P005F11_A451TBM26_DEL_FLG, P005F11_n451TBM26_DEL_FLG, P005F11_A448TBM26_LIST_ITEM_NO, P005F11_A447TBM26_LIST_CD, P005F11_A446TBM26_STUDY_ID, P005F11_A449TBM26_LIST_ITEM_NAME, P005F11_n449TBM26_LIST_ITEM_NAME, P005F11_A450TBM26_INNER_VALUE, P005F11_n450TBM26_INNER_VALUE
            }
            , new Object[] {
            P005F12_A924TBT14_KANRYO_FLG, P005F12_n924TBT14_KANRYO_FLG, P005F12_A337TBT14_DEL_FLG, P005F12_n337TBT14_DEL_FLG, P005F12_A351TBT15_DEL_FLG, P005F12_n351TBT15_DEL_FLG, P005F12_A926TBT15_CRF_ITEM_GRP_CD, P005F12_n926TBT15_CRF_ITEM_GRP_CD, P005F12_A347TBT15_CRF_ID, P005F12_n347TBT15_CRF_ID,
            P005F12_A346TBT15_SUBJECT_ID, P005F12_A345TBT15_STUDY_ID, P005F12_A925TBT15_MEMO_NO
            }
            , new Object[] {
            P005F13_A922TBT14_MEMO_NO, P005F13_A330TBT14_SUBJECT_ID, P005F13_A329TBT14_STUDY_ID, P005F13_A930TBT14_CRT_AUTH_CD, P005F13_n930TBT14_CRT_AUTH_CD, P005F13_A339TBT14_CRT_USER_ID, P005F13_n339TBT14_CRT_USER_ID, P005F13_A923TBT14_MEMO_KBN, P005F13_n923TBT14_MEMO_KBN, P005F13_A929TBT14_REQUEST_AUTH_CD,
            P005F13_n929TBT14_REQUEST_AUTH_CD, P005F13_A928TBT14_REQUEST_SITE_ID, P005F13_n928TBT14_REQUEST_SITE_ID, P005F13_A927TBT14_KAKUNIN_FLG, P005F13_n927TBT14_KAKUNIN_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV119Pgmname = "AB702_PC01_GET_CRF_DESIGN" ;
      /* GeneXus formulas. */
      AV119Pgmname = "AB702_PC01_GET_CRF_DESIGN" ;
      Gx_err = (short)(0) ;
   }

   private byte AV91GXLvl109 ;
   private byte A601TAM04_AUTH_LVL ;
   private byte AV76W_TAM04_AUTH_LVL ;
   private byte AV93GXLvl213 ;
   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private byte AV95GXLvl264 ;
   private byte A573TBT11_CRF_INPUT_LEVEL ;
   private byte A552TBM32_AUTH_LVL_MIN ;
   private byte A393TBM32_TEXT_MAXROWS ;
   private byte A395TBM32_DECIMAL_DIGITS ;
   private byte A390TBM32_FONT_SIZE ;
   private byte A398TBM32_LINE_SIZE_DIV ;
   private byte AV104GXLvl956 ;
   private byte GXv_int14[] ;
   private short AV19P_CRF_ID ;
   private short AV21P_CRF_LATEST_VERSION ;
   private short AV14C_PAGE_CHOSEI ;
   private short AV15C_PAGE_LOCATION_X_MAX ;
   private short AV16C_PAGE_LOCATION_Y_MAX ;
   private short AV17C_PAGE_LOCATION_Y2_MAX ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short A317TBT12_CRF_ID ;
   private short A306TBT11_CRF_VERSION ;
   private short A305TBT11_CRF_ID ;
   private short A498TBT13_CRF_ID ;
   private short A499TBT13_CRF_VERSION ;
   private short AV77W_TBM31_GRID_SIZE ;
   private short GXv_int8[] ;
   private short AV42W_CNT ;
   private short A232TBM32_CRF_ID ;
   private short A384TBM32_CRF_ITEM_GRP_ORDER ;
   private short A385TBM32_LOCATION_X ;
   private short A386TBM32_LOCATION_Y ;
   private short A387TBM32_LOCATION_X2 ;
   private short A388TBM32_LOCATION_Y2 ;
   private short A394TBM32_TEXT_MAXLENGTH ;
   private short A604TBM32_LINE_ANGLE ;
   private short A553TBM32_ZORDER ;
   private short A605TBM32_TAB_ORDER ;
   private short A746TBM32_REF_CRF_ID ;
   private short A472TBM35_CRF_ID ;
   private short AV81W_TBM32_REF_CRF_ID ;
   private short AV83W_TBT11_CRF_VERSION_MIN ;
   private short AV46W_DISP_CRF_VERSION ;
   private short A272TBM37_CRF_ID ;
   private short A448TBM26_LIST_ITEM_NO ;
   private short A347TBT15_CRF_ID ;
   private short A925TBT15_MEMO_NO ;
   private short A922TBT14_MEMO_NO ;
   private short AV59W_LEN ;
   private short AV74W_TAB_ORDER ;
   private short AV11C_DM_INPUT_LEVEL ;
   private short Gx_err ;
   private int AV24P_SUBJECT_ID ;
   private int AV92GXV1 ;
   private int A293TBT02_SUBJECT_ID ;
   private int A316TBT12_SUBJECT_ID ;
   private int A304TBT11_SUBJECT_ID ;
   private int A497TBT13_SUBJECT_ID ;
   private int AV99GXV2 ;
   private int AV100GXV3 ;
   private int AV102GXV4 ;
   private int AV105GXV5 ;
   private int A346TBT15_SUBJECT_ID ;
   private int A330TBT14_SUBJECT_ID ;
   private int AV108GXV6 ;
   private int AV109GXV7 ;
   private int AV110GXV8 ;
   private int AV111GXV9 ;
   private int AV112GXV10 ;
   private int AV113GXV11 ;
   private int AV114GXV12 ;
   private int AV115GXV13 ;
   private int AV116GXV14 ;
   private int AV117GXV15 ;
   private int AV118GXV16 ;
   private int GXActiveErrHndl ;
   private long AV23P_STUDY_ID ;
   private long AV9C_COLOR_WHITE ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private long A315TBT12_STUDY_ID ;
   private long A303TBT11_STUDY_ID ;
   private long A314TBT11_UPD_CNT ;
   private long A496TBT13_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A392TBM32_FONT_COLOR_DIV ;
   private long A603TBM32_LINE_COLOR_DIV ;
   private long A471TBM35_STUDY_ID ;
   private long AV55W_HEIGHT ;
   private long A271TBM37_STUDY_ID ;
   private long A446TBM26_STUDY_ID ;
   private long A345TBT15_STUDY_ID ;
   private long A329TBT14_STUDY_ID ;
   private long AV53W_GRP_X ;
   private long AV54W_GRP_Y ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String AV119Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date A560TBT02_UPLOAD_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A299TBT02_UPD_DATETIME ;
   private java.util.Date A574TBT11_UPLOAD_DATETIME ;
   private java.util.Date A578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A311TBT11_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n601TAM04_AUTH_LVL ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n560TBT02_UPLOAD_DATETIME ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n299TBT02_UPD_DATETIME ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n320TBT12_CRF_VALUE ;
   private boolean n587TBT12_EDIT_FLG ;
   private boolean n307TBT11_DEL_FLG ;
   private boolean n574TBT11_UPLOAD_DATETIME ;
   private boolean n573TBT11_CRF_INPUT_LEVEL ;
   private boolean n577TBT11_DM_ARRIVAL_FLG ;
   private boolean n578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n583TBT11_INPUT_END_FLG ;
   private boolean n311TBT11_UPD_DATETIME ;
   private boolean n314TBT11_UPD_CNT ;
   private boolean n503TBT13_DEL_FLG ;
   private boolean n502TBT13_CRF_VALUE ;
   private boolean n588TBT13_EDIT_FLG ;
   private boolean n238TBM32_DEL_FLG ;
   private boolean n236TBM32_CRF_ITEM_GRP_CD ;
   private boolean n235TBM32_CRF_ITEM_DIV ;
   private boolean n403TBM32_IMAGE_CD ;
   private boolean n234TBM32_CRF_ITEM_NM ;
   private boolean n384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n552TBM32_AUTH_LVL_MIN ;
   private boolean n385TBM32_LOCATION_X ;
   private boolean n386TBM32_LOCATION_Y ;
   private boolean n387TBM32_LOCATION_X2 ;
   private boolean n388TBM32_LOCATION_Y2 ;
   private boolean n389TBM32_TEXT_ALIGN_DIV ;
   private boolean n393TBM32_TEXT_MAXROWS ;
   private boolean n394TBM32_TEXT_MAXLENGTH ;
   private boolean n395TBM32_DECIMAL_DIGITS ;
   private boolean n399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n401TBM32_TEXT ;
   private boolean n390TBM32_FONT_SIZE ;
   private boolean n391TBM32_FONT_UL_FLG ;
   private boolean n392TBM32_FONT_COLOR_DIV ;
   private boolean n398TBM32_LINE_SIZE_DIV ;
   private boolean n603TBM32_LINE_COLOR_DIV ;
   private boolean n396TBM32_LINE_START_POINT_DIV ;
   private boolean n397TBM32_LINE_END_POINT_DIV ;
   private boolean n604TBM32_LINE_ANGLE ;
   private boolean n553TBM32_ZORDER ;
   private boolean n605TBM32_TAB_ORDER ;
   private boolean n606TBM32_TABSTOP_FLG ;
   private boolean n746TBM32_REF_CRF_ID ;
   private boolean n747TBM32_REF_CRF_ITEM_CD ;
   private boolean n404TBM32_FIXED_VALUE ;
   private boolean n402TBM32_LIST_CD ;
   private boolean n607TBM32_REQUIRED_INPUT_FLG ;
   private boolean n476TBM35_DEL_FLG ;
   private boolean n475TBM35_DISPLAY_FLG ;
   private boolean n274TBM37_DEL_FLG ;
   private boolean n375TBM37_DOM_VAR_NM ;
   private boolean n374TBM37_DOM_CD ;
   private boolean n451TBM26_DEL_FLG ;
   private boolean n449TBM26_LIST_ITEM_NAME ;
   private boolean n450TBM26_INNER_VALUE ;
   private boolean n924TBT14_KANRYO_FLG ;
   private boolean n337TBT14_DEL_FLG ;
   private boolean n351TBT15_DEL_FLG ;
   private boolean n926TBT15_CRF_ITEM_GRP_CD ;
   private boolean n347TBT15_CRF_ID ;
   private boolean n930TBT14_CRT_AUTH_CD ;
   private boolean n339TBT14_CRT_USER_ID ;
   private boolean n923TBT14_MEMO_KBN ;
   private boolean n929TBT14_REQUEST_AUTH_CD ;
   private boolean n928TBT14_REQUEST_SITE_ID ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private String AV22P_INIT_FLG ;
   private String AV49W_ERR_FLG ;
   private String AV50W_ERR_MSG ;
   private String AV13C_HOJOSYA_AUTH_CD ;
   private String AV8C_ALL_AUTH_CD ;
   private String AV67W_RIREKI_URL ;
   private String AV72W_SESSION_KEY ;
   private String A17TAM04_AUTH_CD ;
   private String AV68W_RTN_CD ;
   private String AV63W_MSG ;
   private String A295TBT02_DEL_FLG ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A328TBT12_DEL_FLG ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String A587TBT12_EDIT_FLG ;
   private String A307TBT11_DEL_FLG ;
   private String A577TBT11_DM_ARRIVAL_FLG ;
   private String A583TBT11_INPUT_END_FLG ;
   private String A503TBT13_DEL_FLG ;
   private String A500TBT13_CRF_ITEM_GRP_DIV ;
   private String A501TBT13_CRF_ITEM_GRP_CD ;
   private String A502TBT13_CRF_VALUE ;
   private String A588TBT13_EDIT_FLG ;
   private String AV62W_MODE_KBN ;
   private String AV61W_MEMO_INPU_FLG ;
   private String AV44W_CRF_KANRI_FLG ;
   private String AV58W_INP_FLG ;
   private String AV10C_DM_AUTH_CD ;
   private String A238TBM32_DEL_FLG ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A236TBM32_CRF_ITEM_GRP_CD ;
   private String A235TBM32_CRF_ITEM_DIV ;
   private String A403TBM32_IMAGE_CD ;
   private String A234TBM32_CRF_ITEM_NM ;
   private String A389TBM32_TEXT_ALIGN_DIV ;
   private String A399TBM32_CHK_TRUE_INNER_VALUE ;
   private String A400TBM32_CHK_FALSE_INNER_VALUE ;
   private String A401TBM32_TEXT ;
   private String A391TBM32_FONT_UL_FLG ;
   private String A396TBM32_LINE_START_POINT_DIV ;
   private String A397TBM32_LINE_END_POINT_DIV ;
   private String A606TBM32_TABSTOP_FLG ;
   private String A747TBM32_REF_CRF_ITEM_CD ;
   private String A404TBM32_FIXED_VALUE ;
   private String A402TBM32_LIST_CD ;
   private String A607TBM32_REQUIRED_INPUT_FLG ;
   private String AV47W_DISP_FLG ;
   private String AV84W_TBT13_EDIT_FLG ;
   private String AV57W_IMAGE_URL ;
   private String AV88W_TBM35_CRF_ITEM_CD ;
   private String A476TBM35_DEL_FLG ;
   private String A473TBM35_CRF_ITEM_CD ;
   private String A475TBM35_DISPLAY_FLG ;
   private String A474TBM35_STUDY_AUTH_CD ;
   private String AV82W_TBM32_REF_CRF_ITEM_CD ;
   private String AV80W_TBM32_LIST_CD ;
   private String AV60W_MARK_FLG ;
   private String AV37W_2PAGE_FLG ;
   private String A274TBM37_DEL_FLG ;
   private String A375TBM37_DOM_VAR_NM ;
   private String A374TBM37_DOM_CD ;
   private String A273TBM37_CRF_ITEM_GRP_CD ;
   private String A372TBM37_CRF_ITEM_GRP_DIV ;
   private String A451TBM26_DEL_FLG ;
   private String A447TBM26_LIST_CD ;
   private String A449TBM26_LIST_ITEM_NAME ;
   private String A450TBM26_INNER_VALUE ;
   private String AV45W_CRF_VALUE ;
   private String A924TBT14_KANRYO_FLG ;
   private String A337TBT14_DEL_FLG ;
   private String A351TBT15_DEL_FLG ;
   private String A926TBT15_CRF_ITEM_GRP_CD ;
   private String A930TBT14_CRT_AUTH_CD ;
   private String A339TBT14_CRT_USER_ID ;
   private String A923TBT14_MEMO_KBN ;
   private String A929TBT14_REQUEST_AUTH_CD ;
   private String A928TBT14_REQUEST_SITE_ID ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String AV65W_RADIO_GRP_FLG ;
   private String AV75W_TAB_ORDER_FLG ;
   private String AV79W_TBM32_CRF_ITEM_GRP_CD ;
   private String AV51W_ERRCD ;
   private com.genexus.internet.HttpRequest AV56W_HTTPREQUEST ;
   private SdtB702_SD01_CRF_DESIGN AV25SD_B702_SD01_CRF_DESIGN ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV33SD_B792_SD00_HTML5_EXEC_INFO ;
   private SdtB792_SD01_CRF AV34SD_B792_SD01_CRF ;
   private SdtA_LOGIN_SDT AV38W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] P005F2_A17TAM04_AUTH_CD ;
   private byte[] P005F2_A601TAM04_AUTH_LVL ;
   private boolean[] P005F2_n601TAM04_AUTH_LVL ;
   private short[] P005F3_A294TBT02_CRF_ID ;
   private int[] P005F3_A293TBT02_SUBJECT_ID ;
   private long[] P005F3_A292TBT02_STUDY_ID ;
   private String[] P005F3_A295TBT02_DEL_FLG ;
   private boolean[] P005F3_n295TBT02_DEL_FLG ;
   private short[] P005F3_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] P005F3_n370TBT02_CRF_LATEST_VERSION ;
   private java.util.Date[] P005F3_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] P005F3_n560TBT02_UPLOAD_DATETIME ;
   private byte[] P005F3_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P005F3_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] P005F3_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P005F3_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005F3_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P005F3_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P005F3_A569TBT02_INPUT_END_FLG ;
   private boolean[] P005F3_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] P005F3_A299TBT02_UPD_DATETIME ;
   private boolean[] P005F3_n299TBT02_UPD_DATETIME ;
   private long[] P005F3_A302TBT02_UPD_CNT ;
   private boolean[] P005F3_n302TBT02_UPD_CNT ;
   private long[] P005F4_A315TBT12_STUDY_ID ;
   private int[] P005F4_A316TBT12_SUBJECT_ID ;
   private short[] P005F4_A317TBT12_CRF_ID ;
   private String[] P005F4_A328TBT12_DEL_FLG ;
   private boolean[] P005F4_n328TBT12_DEL_FLG ;
   private String[] P005F4_A318TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P005F4_A319TBT12_CRF_ITEM_GRP_CD ;
   private String[] P005F4_A320TBT12_CRF_VALUE ;
   private boolean[] P005F4_n320TBT12_CRF_VALUE ;
   private String[] P005F4_A587TBT12_EDIT_FLG ;
   private boolean[] P005F4_n587TBT12_EDIT_FLG ;
   private short[] P005F5_A306TBT11_CRF_VERSION ;
   private short[] P005F5_A305TBT11_CRF_ID ;
   private int[] P005F5_A304TBT11_SUBJECT_ID ;
   private long[] P005F5_A303TBT11_STUDY_ID ;
   private String[] P005F5_A307TBT11_DEL_FLG ;
   private boolean[] P005F5_n307TBT11_DEL_FLG ;
   private java.util.Date[] P005F5_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] P005F5_n574TBT11_UPLOAD_DATETIME ;
   private byte[] P005F5_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] P005F5_n573TBT11_CRF_INPUT_LEVEL ;
   private String[] P005F5_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P005F5_n577TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005F5_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] P005F5_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] P005F5_A583TBT11_INPUT_END_FLG ;
   private boolean[] P005F5_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] P005F5_A311TBT11_UPD_DATETIME ;
   private boolean[] P005F5_n311TBT11_UPD_DATETIME ;
   private long[] P005F5_A314TBT11_UPD_CNT ;
   private boolean[] P005F5_n314TBT11_UPD_CNT ;
   private long[] P005F6_A496TBT13_STUDY_ID ;
   private int[] P005F6_A497TBT13_SUBJECT_ID ;
   private short[] P005F6_A498TBT13_CRF_ID ;
   private short[] P005F6_A499TBT13_CRF_VERSION ;
   private String[] P005F6_A503TBT13_DEL_FLG ;
   private boolean[] P005F6_n503TBT13_DEL_FLG ;
   private String[] P005F6_A500TBT13_CRF_ITEM_GRP_DIV ;
   private String[] P005F6_A501TBT13_CRF_ITEM_GRP_CD ;
   private String[] P005F6_A502TBT13_CRF_VALUE ;
   private boolean[] P005F6_n502TBT13_CRF_VALUE ;
   private String[] P005F6_A588TBT13_EDIT_FLG ;
   private boolean[] P005F6_n588TBT13_EDIT_FLG ;
   private short[] P005F7_A232TBM32_CRF_ID ;
   private long[] P005F7_A231TBM32_STUDY_ID ;
   private String[] P005F7_A238TBM32_DEL_FLG ;
   private boolean[] P005F7_n238TBM32_DEL_FLG ;
   private String[] P005F7_A233TBM32_CRF_ITEM_CD ;
   private String[] P005F7_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005F7_n236TBM32_CRF_ITEM_GRP_CD ;
   private String[] P005F7_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P005F7_n235TBM32_CRF_ITEM_DIV ;
   private String[] P005F7_A403TBM32_IMAGE_CD ;
   private boolean[] P005F7_n403TBM32_IMAGE_CD ;
   private String[] P005F7_A234TBM32_CRF_ITEM_NM ;
   private boolean[] P005F7_n234TBM32_CRF_ITEM_NM ;
   private short[] P005F7_A384TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P005F7_n384TBM32_CRF_ITEM_GRP_ORDER ;
   private byte[] P005F7_A552TBM32_AUTH_LVL_MIN ;
   private boolean[] P005F7_n552TBM32_AUTH_LVL_MIN ;
   private short[] P005F7_A385TBM32_LOCATION_X ;
   private boolean[] P005F7_n385TBM32_LOCATION_X ;
   private short[] P005F7_A386TBM32_LOCATION_Y ;
   private boolean[] P005F7_n386TBM32_LOCATION_Y ;
   private short[] P005F7_A387TBM32_LOCATION_X2 ;
   private boolean[] P005F7_n387TBM32_LOCATION_X2 ;
   private short[] P005F7_A388TBM32_LOCATION_Y2 ;
   private boolean[] P005F7_n388TBM32_LOCATION_Y2 ;
   private String[] P005F7_A389TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P005F7_n389TBM32_TEXT_ALIGN_DIV ;
   private byte[] P005F7_A393TBM32_TEXT_MAXROWS ;
   private boolean[] P005F7_n393TBM32_TEXT_MAXROWS ;
   private short[] P005F7_A394TBM32_TEXT_MAXLENGTH ;
   private boolean[] P005F7_n394TBM32_TEXT_MAXLENGTH ;
   private byte[] P005F7_A395TBM32_DECIMAL_DIGITS ;
   private boolean[] P005F7_n395TBM32_DECIMAL_DIGITS ;
   private String[] P005F7_A399TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P005F7_n399TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P005F7_A400TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P005F7_n400TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P005F7_A401TBM32_TEXT ;
   private boolean[] P005F7_n401TBM32_TEXT ;
   private byte[] P005F7_A390TBM32_FONT_SIZE ;
   private boolean[] P005F7_n390TBM32_FONT_SIZE ;
   private String[] P005F7_A391TBM32_FONT_UL_FLG ;
   private boolean[] P005F7_n391TBM32_FONT_UL_FLG ;
   private long[] P005F7_A392TBM32_FONT_COLOR_DIV ;
   private boolean[] P005F7_n392TBM32_FONT_COLOR_DIV ;
   private byte[] P005F7_A398TBM32_LINE_SIZE_DIV ;
   private boolean[] P005F7_n398TBM32_LINE_SIZE_DIV ;
   private long[] P005F7_A603TBM32_LINE_COLOR_DIV ;
   private boolean[] P005F7_n603TBM32_LINE_COLOR_DIV ;
   private String[] P005F7_A396TBM32_LINE_START_POINT_DIV ;
   private boolean[] P005F7_n396TBM32_LINE_START_POINT_DIV ;
   private String[] P005F7_A397TBM32_LINE_END_POINT_DIV ;
   private boolean[] P005F7_n397TBM32_LINE_END_POINT_DIV ;
   private short[] P005F7_A604TBM32_LINE_ANGLE ;
   private boolean[] P005F7_n604TBM32_LINE_ANGLE ;
   private short[] P005F7_A553TBM32_ZORDER ;
   private boolean[] P005F7_n553TBM32_ZORDER ;
   private short[] P005F7_A605TBM32_TAB_ORDER ;
   private boolean[] P005F7_n605TBM32_TAB_ORDER ;
   private String[] P005F7_A606TBM32_TABSTOP_FLG ;
   private boolean[] P005F7_n606TBM32_TABSTOP_FLG ;
   private short[] P005F7_A746TBM32_REF_CRF_ID ;
   private boolean[] P005F7_n746TBM32_REF_CRF_ID ;
   private String[] P005F7_A747TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P005F7_n747TBM32_REF_CRF_ITEM_CD ;
   private String[] P005F7_A404TBM32_FIXED_VALUE ;
   private boolean[] P005F7_n404TBM32_FIXED_VALUE ;
   private String[] P005F7_A402TBM32_LIST_CD ;
   private boolean[] P005F7_n402TBM32_LIST_CD ;
   private String[] P005F7_A607TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P005F7_n607TBM32_REQUIRED_INPUT_FLG ;
   private long[] P005F8_A471TBM35_STUDY_ID ;
   private short[] P005F8_A472TBM35_CRF_ID ;
   private String[] P005F8_A476TBM35_DEL_FLG ;
   private boolean[] P005F8_n476TBM35_DEL_FLG ;
   private String[] P005F8_A473TBM35_CRF_ITEM_CD ;
   private String[] P005F8_A475TBM35_DISPLAY_FLG ;
   private boolean[] P005F8_n475TBM35_DISPLAY_FLG ;
   private String[] P005F8_A474TBM35_STUDY_AUTH_CD ;
   private String[] P005F9_A307TBT11_DEL_FLG ;
   private boolean[] P005F9_n307TBT11_DEL_FLG ;
   private String[] P005F9_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P005F9_n577TBT11_DM_ARRIVAL_FLG ;
   private short[] P005F9_A305TBT11_CRF_ID ;
   private int[] P005F9_A304TBT11_SUBJECT_ID ;
   private long[] P005F9_A303TBT11_STUDY_ID ;
   private short[] P005F9_A306TBT11_CRF_VERSION ;
   private String[] P005F10_A274TBM37_DEL_FLG ;
   private boolean[] P005F10_n274TBM37_DEL_FLG ;
   private String[] P005F10_A375TBM37_DOM_VAR_NM ;
   private boolean[] P005F10_n375TBM37_DOM_VAR_NM ;
   private String[] P005F10_A374TBM37_DOM_CD ;
   private boolean[] P005F10_n374TBM37_DOM_CD ;
   private long[] P005F10_A271TBM37_STUDY_ID ;
   private String[] P005F10_A273TBM37_CRF_ITEM_GRP_CD ;
   private short[] P005F10_A272TBM37_CRF_ID ;
   private String[] P005F10_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] P005F11_A451TBM26_DEL_FLG ;
   private boolean[] P005F11_n451TBM26_DEL_FLG ;
   private short[] P005F11_A448TBM26_LIST_ITEM_NO ;
   private String[] P005F11_A447TBM26_LIST_CD ;
   private long[] P005F11_A446TBM26_STUDY_ID ;
   private String[] P005F11_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] P005F11_n449TBM26_LIST_ITEM_NAME ;
   private String[] P005F11_A450TBM26_INNER_VALUE ;
   private boolean[] P005F11_n450TBM26_INNER_VALUE ;
   private String[] P005F12_A924TBT14_KANRYO_FLG ;
   private boolean[] P005F12_n924TBT14_KANRYO_FLG ;
   private String[] P005F12_A337TBT14_DEL_FLG ;
   private boolean[] P005F12_n337TBT14_DEL_FLG ;
   private String[] P005F12_A351TBT15_DEL_FLG ;
   private boolean[] P005F12_n351TBT15_DEL_FLG ;
   private String[] P005F12_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] P005F12_n926TBT15_CRF_ITEM_GRP_CD ;
   private short[] P005F12_A347TBT15_CRF_ID ;
   private boolean[] P005F12_n347TBT15_CRF_ID ;
   private int[] P005F12_A346TBT15_SUBJECT_ID ;
   private long[] P005F12_A345TBT15_STUDY_ID ;
   private short[] P005F12_A925TBT15_MEMO_NO ;
   private short[] P005F13_A922TBT14_MEMO_NO ;
   private int[] P005F13_A330TBT14_SUBJECT_ID ;
   private long[] P005F13_A329TBT14_STUDY_ID ;
   private String[] P005F13_A930TBT14_CRT_AUTH_CD ;
   private boolean[] P005F13_n930TBT14_CRT_AUTH_CD ;
   private String[] P005F13_A339TBT14_CRT_USER_ID ;
   private boolean[] P005F13_n339TBT14_CRT_USER_ID ;
   private String[] P005F13_A923TBT14_MEMO_KBN ;
   private boolean[] P005F13_n923TBT14_MEMO_KBN ;
   private String[] P005F13_A929TBT14_REQUEST_AUTH_CD ;
   private boolean[] P005F13_n929TBT14_REQUEST_AUTH_CD ;
   private String[] P005F13_A928TBT14_REQUEST_SITE_ID ;
   private boolean[] P005F13_n928TBT14_REQUEST_SITE_ID ;
   private String[] P005F13_A927TBT14_KAKUNIN_FLG ;
   private boolean[] P005F13_n927TBT14_KAKUNIN_FLG ;
   private com.genexus.internet.HttpResponse AV18HttpResponse ;
   private com.genexus.webpanels.WebSession AV71W_SESSION ;
   private GxObjectCollection AV31SD_B702_SD05_DOMAIN_INFO ;
   private GxObjectCollection GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem11[] ;
   private GxObjectCollection AV29SD_B702_SD04_MARK_DISP ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem AV26SD_B702_SD02_CRF_ITEM_DESIGN_I ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem12[] ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem AV27SD_B702_SD02_CRF_ITEM_MARK_I ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem AV39W_B702_SD02_CRF_ITEM_DESIGN_I ;
   private SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem AV28SD_B702_SD03_SEL_LIST_ITEM_I ;
   private SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem AV30SD_B702_SD04_MARK_DISP_I ;
   private SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem AV32SD_B702_SD05_DOMAIN_INFO_I ;
   private SdtB792_SD01_CRF GXv_SdtB792_SD01_CRF3[] ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV35SD_B792_SD02_CRF_RESULT_I ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT13[] ;
}

final  class ab702_pc01_get_crf_design__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005F2", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_LVL` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F3", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_DEL_FLG`, `TBT02_CRF_LATEST_VERSION`, `TBT02_UPLOAD_DATETIME`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_INPUT_END_FLG`, `TBT02_UPD_DATETIME`, `TBT02_UPD_CNT` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F4", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_DEL_FLG`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005F5", "SELECT `TBT11_CRF_VERSION`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_DEL_FLG`, `TBT11_UPLOAD_DATETIME`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_INPUT_END_FLG`, `TBT11_UPD_DATETIME`, `TBT11_UPD_CNT` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_VERSION` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F6", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION`, `TBT13_DEL_FLG`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG` FROM `TBT13_CRF_RES_HIS` WHERE (`TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_VERSION` = ?) AND (`TBT13_DEL_FLG` = '0') ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_VERSION` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005F7", "SELECT `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_DIV`, `TBM32_IMAGE_CD`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_AUTH_LVL_MIN`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_REQUIRED_INPUT_FLG` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005F8", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_DEL_FLG`, `TBM35_CRF_ITEM_CD`, `TBM35_DISPLAY_FLG`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE (`TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ? and `TBM35_CRF_ITEM_CD` = ?) AND (`TBM35_DEL_FLG` = '0') ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F9", "SELECT `TBT11_DEL_FLG`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ?) AND (`TBT11_DM_ARRIVAL_FLG` = '1') AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F10", "SELECT `TBM37_DEL_FLG`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_CD`, `TBM37_STUDY_ID`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV` FROM `TBM37_CRF_DOM_MAP` WHERE (`TBM37_STUDY_ID` = ?) AND (`TBM37_DOM_CD` = 'DM') AND (`TBM37_DOM_VAR_NM` = ?) AND (`TBM37_DEL_FLG` = '0') ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F11", "SELECT `TBM26_DEL_FLG`, `TBM26_LIST_ITEM_NO`, `TBM26_LIST_CD`, `TBM26_STUDY_ID`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE` FROM `TBM26_SEL_LIST_ITEM` WHERE (`TBM26_STUDY_ID` = ? and `TBM26_LIST_CD` = ? and `TBM26_LIST_ITEM_NO` > 0) AND (`TBM26_DEL_FLG` = '0') ORDER BY `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005F12", "SELECT T2.`TBT14_KANRYO_FLG`, T2.`TBT14_DEL_FLG`, T1.`TBT15_DEL_FLG`, T1.`TBT15_CRF_ITEM_GRP_CD`, T1.`TBT15_CRF_ID`, T1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, T1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, T1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM (`TBT15_CRF_MEMO_LOC` T1 INNER JOIN `TBT14_CRF_MEMO` T2 ON T2.`TBT14_STUDY_ID` = T1.`TBT15_STUDY_ID` AND T2.`TBT14_SUBJECT_ID` = T1.`TBT15_SUBJECT_ID` AND T2.`TBT14_MEMO_NO` = T1.`TBT15_MEMO_NO`) WHERE (T1.`TBT15_STUDY_ID` = ? and T1.`TBT15_SUBJECT_ID` = ?) AND (T1.`TBT15_DEL_FLG` <> '1') AND (T2.`TBT14_DEL_FLG` <> '1') AND (T2.`TBT14_KANRYO_FLG` <> '1') AND (T1.`TBT15_CRF_ID` = ?) AND (T1.`TBT15_CRF_ITEM_GRP_CD` = ?) ORDER BY T1.`TBT15_STUDY_ID`, T1.`TBT15_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F13", "SELECT `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID`, `TBT14_CRT_AUTH_CD`, `TBT14_CRT_USER_ID`, `TBT14_MEMO_KBN`, `TBT14_REQUEST_AUTH_CD`, `TBT14_REQUEST_SITE_ID`, `TBT14_KAKUNIN_FLG` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ? and `TBT14_MEMO_NO` = ? ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               break;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               break;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((long[]) buf[43])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((long[]) buf[47])[0] = rslt.getLong(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((short[]) buf[8])[0] = rslt.getShort(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               break;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6) ;
               ((long[]) buf[11])[0] = rslt.getLong(7) ;
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               break;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 50);
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 50);
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

