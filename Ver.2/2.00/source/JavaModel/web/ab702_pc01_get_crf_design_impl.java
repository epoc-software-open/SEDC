/*
               File: ab702_pc01_get_crf_design_impl
        Description: CRFデザイン情報取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:20.46
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
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV23P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV24P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV90P_CRF_ID_EDA_NO = httpContext.GetNextPar( ) ;
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
      /* Execute user subroutine: S331 */
      S331 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV49W_ERR_FLG = "0" ;
      AV50W_ERR_MSG = "" ;
      AV9C_COLOR_WHITE = UIFactory.getColor( 255, 255, 255) ;
      GXv_int1[0] = AV19P_CRF_ID ;
      GXv_int2[0] = AV89P_CRF_EDA_NO ;
      new b799_pc12_crf_id_eda_split(remoteHandle, context).execute( AV90P_CRF_ID_EDA_NO, GXv_int1, GXv_int2) ;
      ab702_pc01_get_crf_design_impl.this.AV19P_CRF_ID = GXv_int1[0] ;
      ab702_pc01_get_crf_design_impl.this.AV89P_CRF_EDA_NO = GXv_int2[0] ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char3 = AV13C_HOJOSYA_AUTH_CD ;
      GXv_char4[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "014", GXv_char4) ;
      ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char4[0] ;
      AV13C_HOJOSYA_AUTH_CD = GXt_char3 ;
      GXt_char3 = AV8C_ALL_AUTH_CD ;
      GXv_char4[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "023", GXv_char4) ;
      ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char4[0] ;
      AV8C_ALL_AUTH_CD = GXt_char3 ;
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
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         /* Execute user subroutine: S161 */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         /* Execute user subroutine: S171 */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         GXt_char3 = AV72W_SESSION_KEY ;
         GXv_char4[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char4) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char4[0] ;
         AV72W_SESSION_KEY = GXt_char3 ;
         AV71W_SESSION.setValue(AV72W_SESSION_KEY, AV34SD_B792_SD01_CRF.toxml(false, true, "B792_SD01_CRF", "tablet-EDC_GXXEV3U3"));
      }
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( "0" );
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Err_msg( "" );
      }
      else
      {
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( "1" );
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Err_msg( AV50W_ERR_MSG );
      }
      AV18HttpResponse.addString(AV25SD_B702_SD01_CRF_DESIGN.toJSonString(false));
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_AUTH_LVL_GET' Routine */
      AV93GXLvl100 = (byte)(0) ;
      /* Using cursor P005F2 */
      pr_default.execute(0, new Object[] {AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd()});
      if ( Gx_err != 0 )
      {
         AV93GXLvl100 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13TAM04_AUTH_CD = P005F2_A13TAM04_AUTH_CD[0] ;
         A687TAM04_AUTH_LVL = P005F2_A687TAM04_AUTH_LVL[0] ;
         n687TAM04_AUTH_LVL = P005F2_n687TAM04_AUTH_LVL[0] ;
         AV93GXLvl100 = (byte)(1) ;
         AV76W_TAM04_AUTH_LVL = A687TAM04_AUTH_LVL ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV93GXLvl100 == 0 )
      {
         AV49W_ERR_FLG = "1" ;
         GXt_char3 = AV50W_ERR_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char4[0] ;
         AV50W_ERR_MSG = GXt_char3 ;
      }
   }

   public void S121( )
   {
      /* 'SUB_CRF_READ' Routine */
      GXv_SdtB792_SD01_CRF5[0] = AV34SD_B792_SD01_CRF;
      GXv_char4[0] = AV68W_RTN_CD ;
      new b704_pc02_get_crf_val(remoteHandle, context).execute( GXv_SdtB792_SD01_CRF5, GXv_char4) ;
      AV34SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF5[0] ;
      ab702_pc01_get_crf_design_impl.this.AV68W_RTN_CD = GXv_char4[0] ;
      if ( GXutil.strcmp(AV68W_RTN_CD, "1") == 0 )
      {
         /* Execute user subroutine: S131 */
         S131 ();
         if (returnInSub) return;
      }
      else
      {
         if ( ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id() == AV23P_STUDY_ID ) && ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id() == AV24P_SUBJECT_ID ) && ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id() == AV19P_CRF_ID ) && ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no() == AV89P_CRF_EDA_NO ) && ( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() == AV21P_CRF_LATEST_VERSION ) )
         {
         }
         else
         {
            GXv_char4[0] = AV68W_RTN_CD ;
            GXv_char6[0] = AV63W_MSG ;
            new b799_pc07_sdt_work_reg(remoteHandle, context).execute( AV71W_SESSION.getId(), AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV34SD_B792_SD01_CRF, GXv_char4, GXv_char6) ;
            ab702_pc01_get_crf_design_impl.this.AV68W_RTN_CD = GXv_char4[0] ;
            ab702_pc01_get_crf_design_impl.this.AV63W_MSG = GXv_char6[0] ;
            GXv_SdtB792_SD01_CRF5[0] = AV34SD_B792_SD01_CRF;
            GXv_char6[0] = AV68W_RTN_CD ;
            GXv_char4[0] = AV63W_MSG ;
            new b799_pc08_sdt_work_get(remoteHandle, context).execute( AV71W_SESSION.getId(), AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV23P_STUDY_ID, AV24P_SUBJECT_ID, AV19P_CRF_ID, AV89P_CRF_EDA_NO, AV21P_CRF_LATEST_VERSION, GXv_SdtB792_SD01_CRF5, GXv_char6, GXv_char4) ;
            AV34SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF5[0] ;
            ab702_pc01_get_crf_design_impl.this.AV68W_RTN_CD = GXv_char6[0] ;
            ab702_pc01_get_crf_design_impl.this.AV63W_MSG = GXv_char4[0] ;
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
            AV94GXV1 = 1 ;
            while ( AV94GXV1 <= AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
            {
               AV35SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV94GXV1));
               AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( AV35SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org() );
               AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_edit_flg( "0" );
               AV94GXV1 = (int)(AV94GXV1+1) ;
            }
            new b704_pc03_remove_crf_val(remoteHandle, context).execute( AV23P_STUDY_ID, AV24P_SUBJECT_ID, AV19P_CRF_ID, AV89P_CRF_EDA_NO) ;
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
      AV95GXLvl206 = (byte)(0) ;
      /* Using cursor P005F3 */
      pr_default.execute(1, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV19P_CRF_ID), new Byte(AV89P_CRF_EDA_NO)});
      if ( Gx_err != 0 )
      {
         AV95GXLvl206 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(1) != 101) )
      {
         A935TBT02_CRF_EDA_NO = P005F3_A935TBT02_CRF_EDA_NO[0] ;
         A91TBT02_CRF_ID = P005F3_A91TBT02_CRF_ID[0] ;
         A90TBT02_SUBJECT_ID = P005F3_A90TBT02_SUBJECT_ID[0] ;
         A89TBT02_STUDY_ID = P005F3_A89TBT02_STUDY_ID[0] ;
         A449TBT02_DEL_FLG = P005F3_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = P005F3_n449TBT02_DEL_FLG[0] ;
         A498TBT02_CRF_LATEST_VERSION = P005F3_A498TBT02_CRF_LATEST_VERSION[0] ;
         n498TBT02_CRF_LATEST_VERSION = P005F3_n498TBT02_CRF_LATEST_VERSION[0] ;
         A652TBT02_UPLOAD_DATETIME = P005F3_A652TBT02_UPLOAD_DATETIME[0] ;
         n652TBT02_UPLOAD_DATETIME = P005F3_n652TBT02_UPLOAD_DATETIME[0] ;
         A499TBT02_CRF_INPUT_LEVEL = P005F3_A499TBT02_CRF_INPUT_LEVEL[0] ;
         n499TBT02_CRF_INPUT_LEVEL = P005F3_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A655TBT02_DM_ARRIVAL_FLG = P005F3_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = P005F3_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = P005F3_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = P005F3_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A661TBT02_INPUT_END_FLG = P005F3_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = P005F3_n661TBT02_INPUT_END_FLG[0] ;
         A453TBT02_UPD_DATETIME = P005F3_A453TBT02_UPD_DATETIME[0] ;
         n453TBT02_UPD_DATETIME = P005F3_n453TBT02_UPD_DATETIME[0] ;
         A456TBT02_UPD_CNT = P005F3_A456TBT02_UPD_CNT[0] ;
         n456TBT02_UPD_CNT = P005F3_n456TBT02_UPD_CNT[0] ;
         AV95GXLvl206 = (byte)(1) ;
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_study_id( A89TBT02_STUDY_ID );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_subject_id( A90TBT02_SUBJECT_ID );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_id( A91TBT02_CRF_ID );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no( A935TBT02_CRF_EDA_NO );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version( A498TBT02_CRF_LATEST_VERSION );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime( A652TBT02_UPLOAD_DATETIME );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level( A499TBT02_CRF_INPUT_LEVEL );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg( A655TBT02_DM_ARRIVAL_FLG );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime( A656TBT02_DM_ARRIVAL_DATETIME );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg( A661TBT02_INPUT_END_FLG );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime( A453TBT02_UPD_DATETIME );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt( A456TBT02_UPD_CNT );
         /* Using cursor P005F4 */
         pr_default.execute(2, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A96TBT12_STUDY_ID = P005F4_A96TBT12_STUDY_ID[0] ;
            A97TBT12_SUBJECT_ID = P005F4_A97TBT12_SUBJECT_ID[0] ;
            A98TBT12_CRF_ID = P005F4_A98TBT12_CRF_ID[0] ;
            A937TBT12_CRF_EDA_NO = P005F4_A937TBT12_CRF_EDA_NO[0] ;
            A473TBT12_DEL_FLG = P005F4_A473TBT12_DEL_FLG[0] ;
            n473TBT12_DEL_FLG = P005F4_n473TBT12_DEL_FLG[0] ;
            A99TBT12_CRF_ITEM_GRP_DIV = P005F4_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
            A100TBT12_CRF_ITEM_GRP_CD = P005F4_A100TBT12_CRF_ITEM_GRP_CD[0] ;
            A465TBT12_CRF_VALUE = P005F4_A465TBT12_CRF_VALUE[0] ;
            n465TBT12_CRF_VALUE = P005F4_n465TBT12_CRF_VALUE[0] ;
            A679TBT12_EDIT_FLG = P005F4_A679TBT12_EDIT_FLG[0] ;
            n679TBT12_EDIT_FLG = P005F4_n679TBT12_EDIT_FLG[0] ;
            AV35SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div( A99TBT12_CRF_ITEM_GRP_DIV );
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd( A100TBT12_CRF_ITEM_GRP_CD );
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( A465TBT12_CRF_VALUE );
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org( A465TBT12_CRF_VALUE );
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_edit_flg( A679TBT12_EDIT_FLG );
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
      if ( AV95GXLvl206 == 0 )
      {
         AV49W_ERR_FLG = "1" ;
         GXt_char3 = AV50W_ERR_MSG ;
         GXv_char6[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char6) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char6[0] ;
         AV50W_ERR_MSG = GXt_char3 ;
      }
   }

   public void S151( )
   {
      /* 'SUB_CRF_HISTORY_GET' Routine */
      AV97GXLvl260 = (byte)(0) ;
      /* Using cursor P005F5 */
      pr_default.execute(3, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV19P_CRF_ID), new Byte(AV89P_CRF_EDA_NO), new Short(AV21P_CRF_LATEST_VERSION)});
      if ( Gx_err != 0 )
      {
         AV97GXLvl260 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(3) != 101) )
      {
         A95TBT11_CRF_VERSION = P005F5_A95TBT11_CRF_VERSION[0] ;
         A936TBT11_CRF_EDA_NO = P005F5_A936TBT11_CRF_EDA_NO[0] ;
         A94TBT11_CRF_ID = P005F5_A94TBT11_CRF_ID[0] ;
         A93TBT11_SUBJECT_ID = P005F5_A93TBT11_SUBJECT_ID[0] ;
         A92TBT11_STUDY_ID = P005F5_A92TBT11_STUDY_ID[0] ;
         A457TBT11_DEL_FLG = P005F5_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = P005F5_n457TBT11_DEL_FLG[0] ;
         A666TBT11_UPLOAD_DATETIME = P005F5_A666TBT11_UPLOAD_DATETIME[0] ;
         n666TBT11_UPLOAD_DATETIME = P005F5_n666TBT11_UPLOAD_DATETIME[0] ;
         A665TBT11_CRF_INPUT_LEVEL = P005F5_A665TBT11_CRF_INPUT_LEVEL[0] ;
         n665TBT11_CRF_INPUT_LEVEL = P005F5_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A669TBT11_DM_ARRIVAL_FLG = P005F5_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = P005F5_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = P005F5_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         n670TBT11_DM_ARRIVAL_DATETIME = P005F5_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A675TBT11_INPUT_END_FLG = P005F5_A675TBT11_INPUT_END_FLG[0] ;
         n675TBT11_INPUT_END_FLG = P005F5_n675TBT11_INPUT_END_FLG[0] ;
         A461TBT11_UPD_DATETIME = P005F5_A461TBT11_UPD_DATETIME[0] ;
         n461TBT11_UPD_DATETIME = P005F5_n461TBT11_UPD_DATETIME[0] ;
         A464TBT11_UPD_CNT = P005F5_A464TBT11_UPD_CNT[0] ;
         n464TBT11_UPD_CNT = P005F5_n464TBT11_UPD_CNT[0] ;
         AV97GXLvl260 = (byte)(1) ;
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_study_id( A92TBT11_STUDY_ID );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_subject_id( A93TBT11_SUBJECT_ID );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_id( A94TBT11_CRF_ID );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no( A936TBT11_CRF_EDA_NO );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version( A95TBT11_CRF_VERSION );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime( A666TBT11_UPLOAD_DATETIME );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level( A665TBT11_CRF_INPUT_LEVEL );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg( A669TBT11_DM_ARRIVAL_FLG );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime( A670TBT11_DM_ARRIVAL_DATETIME );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg( A675TBT11_INPUT_END_FLG );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime( A461TBT11_UPD_DATETIME );
         AV34SD_B792_SD01_CRF.setgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt( A464TBT11_UPD_CNT );
         /* Using cursor P005F6 */
         pr_default.execute(4, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A101TBT13_STUDY_ID = P005F6_A101TBT13_STUDY_ID[0] ;
            A102TBT13_SUBJECT_ID = P005F6_A102TBT13_SUBJECT_ID[0] ;
            A103TBT13_CRF_ID = P005F6_A103TBT13_CRF_ID[0] ;
            A938TBT13_CRF_EDA_NO = P005F6_A938TBT13_CRF_EDA_NO[0] ;
            A104TBT13_CRF_VERSION = P005F6_A104TBT13_CRF_VERSION[0] ;
            A598TBT13_DEL_FLG = P005F6_A598TBT13_DEL_FLG[0] ;
            n598TBT13_DEL_FLG = P005F6_n598TBT13_DEL_FLG[0] ;
            A105TBT13_CRF_ITEM_GRP_DIV = P005F6_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
            A106TBT13_CRF_ITEM_GRP_CD = P005F6_A106TBT13_CRF_ITEM_GRP_CD[0] ;
            A597TBT13_CRF_VALUE = P005F6_A597TBT13_CRF_VALUE[0] ;
            n597TBT13_CRF_VALUE = P005F6_n597TBT13_CRF_VALUE[0] ;
            A680TBT13_EDIT_FLG = P005F6_A680TBT13_EDIT_FLG[0] ;
            n680TBT13_EDIT_FLG = P005F6_n680TBT13_EDIT_FLG[0] ;
            AV35SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div( A105TBT13_CRF_ITEM_GRP_DIV );
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd( A106TBT13_CRF_ITEM_GRP_CD );
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( A597TBT13_CRF_VALUE );
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value_org( A597TBT13_CRF_VALUE );
            AV35SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_edit_flg( A680TBT13_EDIT_FLG );
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
      if ( AV97GXLvl260 == 0 )
      {
         AV49W_ERR_FLG = "1" ;
         GXt_char3 = AV50W_ERR_MSG ;
         GXv_char6[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char6) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char6[0] ;
         AV50W_ERR_MSG = GXt_char3 ;
      }
   }

   public void S161( )
   {
      /* 'SUB_HEADER_DESIGN' Routine */
      GXv_char6[0] = AV62W_MODE_KBN ;
      GXv_char4[0] = AV61W_MEMO_INPU_FLG ;
      GXv_char7[0] = AV44W_CRF_KANRI_FLG ;
      GXv_char8[0] = AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Study_nm() ;
      GXv_char9[0] = AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm() ;
      GXv_int1[0] = AV77W_TBM31_GRID_SIZE ;
      GXv_char10[0] = AV49W_ERR_FLG ;
      GXv_char11[0] = AV50W_ERR_MSG ;
      new b702_pc02_header_set(remoteHandle, context).execute( AV38W_A_LOGIN_SDT, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), AV23P_STUDY_ID, AV24P_SUBJECT_ID, AV19P_CRF_ID, AV89P_CRF_EDA_NO, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), GXv_char6, GXv_char4, GXv_char7, GXv_char8, GXv_char9, GXv_int1, GXv_char10, GXv_char11) ;
      ab702_pc01_get_crf_design_impl.this.AV62W_MODE_KBN = GXv_char6[0] ;
      ab702_pc01_get_crf_design_impl.this.AV61W_MEMO_INPU_FLG = GXv_char4[0] ;
      ab702_pc01_get_crf_design_impl.this.AV44W_CRF_KANRI_FLG = GXv_char7[0] ;
      AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Study_nm( GXv_char8[0] );
      AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm( GXv_char9[0] );
      ab702_pc01_get_crf_design_impl.this.AV77W_TBM31_GRID_SIZE = GXv_int1[0] ;
      ab702_pc01_get_crf_design_impl.this.AV49W_ERR_FLG = GXv_char10[0] ;
      ab702_pc01_get_crf_design_impl.this.AV50W_ERR_MSG = GXv_char11[0] ;
      if ( GXutil.strcmp(AV49W_ERR_FLG, "0") == 0 )
      {
         if ( GXutil.strcmp(AV62W_MODE_KBN, "0") == 0 )
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Move_value( "参照モード" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg( "0" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg( "0" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg( "0" );
            AV58W_INP_FLG = "0" ;
         }
         else if ( GXutil.strcmp(AV62W_MODE_KBN, "1") == 0 )
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Move_value( "入力モード" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg( "1" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg( "1" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg( AV44W_CRF_KANRI_FLG );
            AV58W_INP_FLG = "1" ;
         }
         else if ( GXutil.strcmp(AV62W_MODE_KBN, "2") == 0 )
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Move_value( "テスト入力モード" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg( "1" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg( "1" );
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg( AV44W_CRF_KANRI_FLG );
            AV58W_INP_FLG = "1" ;
         }
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_User_info( AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()+" "+AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm() );
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg( "0" );
         if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), AV10C_DM_AUTH_CD) == 0 )
         {
            if ( AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info().size() > 0 )
            {
               AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg( "1" );
            }
         }
         if ( GXutil.strcmp(AV61W_MEMO_INPU_FLG, "0") == 0 )
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg( "0" );
         }
         else
         {
            AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg( "1" );
         }
      }
   }

   public void S171( )
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
      GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem12[0] = AV31SD_B702_SD05_DOMAIN_INFO ;
      new b702_pc06_domain_info_get(remoteHandle, context).execute( AV23P_STUDY_ID, AV19P_CRF_ID, GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem12) ;
      AV31SD_B702_SD05_DOMAIN_INFO = GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem12[0] ;
      AV42W_CNT = (short)(0) ;
      /* Using cursor P005F7 */
      pr_default.execute(5, new Object[] {new Long(AV23P_STUDY_ID), new Short(AV19P_CRF_ID)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A71TBM32_CRF_ID = P005F7_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P005F7_A70TBM32_STUDY_ID[0] ;
         A75TBM32_DEL_FLG = P005F7_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P005F7_n75TBM32_DEL_FLG[0] ;
         A72TBM32_CRF_ITEM_CD = P005F7_A72TBM32_CRF_ITEM_CD[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P005F7_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P005F7_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A74TBM32_CRF_ITEM_DIV = P005F7_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P005F7_n74TBM32_CRF_ITEM_DIV[0] ;
         A526TBM32_IMAGE_CD = P005F7_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = P005F7_n526TBM32_IMAGE_CD[0] ;
         A405TBM32_CRF_ITEM_NM = P005F7_A405TBM32_CRF_ITEM_NM[0] ;
         n405TBM32_CRF_ITEM_NM = P005F7_n405TBM32_CRF_ITEM_NM[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = P005F7_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = P005F7_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A644TBM32_AUTH_LVL_MIN = P005F7_A644TBM32_AUTH_LVL_MIN[0] ;
         n644TBM32_AUTH_LVL_MIN = P005F7_n644TBM32_AUTH_LVL_MIN[0] ;
         A508TBM32_LOCATION_X = P005F7_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = P005F7_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = P005F7_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = P005F7_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = P005F7_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = P005F7_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = P005F7_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = P005F7_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = P005F7_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = P005F7_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = P005F7_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = P005F7_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = P005F7_A517TBM32_TEXT_MAXLENGTH[0] ;
         n517TBM32_TEXT_MAXLENGTH = P005F7_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = P005F7_A518TBM32_DECIMAL_DIGITS[0] ;
         n518TBM32_DECIMAL_DIGITS = P005F7_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = P005F7_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P005F7_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = P005F7_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         n523TBM32_CHK_FALSE_INNER_VALUE = P005F7_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A524TBM32_TEXT = P005F7_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P005F7_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = P005F7_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = P005F7_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = P005F7_A514TBM32_FONT_UL_FLG[0] ;
         n514TBM32_FONT_UL_FLG = P005F7_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = P005F7_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = P005F7_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = P005F7_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = P005F7_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = P005F7_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = P005F7_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = P005F7_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = P005F7_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = P005F7_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = P005F7_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = P005F7_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = P005F7_n690TBM32_LINE_ANGLE[0] ;
         A645TBM32_ZORDER = P005F7_A645TBM32_ZORDER[0] ;
         n645TBM32_ZORDER = P005F7_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = P005F7_A691TBM32_TAB_ORDER[0] ;
         n691TBM32_TAB_ORDER = P005F7_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = P005F7_A692TBM32_TABSTOP_FLG[0] ;
         n692TBM32_TABSTOP_FLG = P005F7_n692TBM32_TABSTOP_FLG[0] ;
         A774TBM32_REF_CRF_ID = P005F7_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = P005F7_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = P005F7_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = P005F7_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A527TBM32_FIXED_VALUE = P005F7_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P005F7_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = P005F7_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P005F7_n525TBM32_LIST_CD[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = P005F7_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = P005F7_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         AV47W_DISP_FLG = "1" ;
         AV84W_TBT13_EDIT_FLG = "0" ;
         AV57W_IMAGE_URL = "" ;
         AV88W_TBM35_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
         if ( ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Group") != 0 ) && ! (GXutil.strcmp("", A73TBM32_CRF_ITEM_GRP_CD)==0) )
         {
            AV88W_TBM35_CRF_ITEM_CD = AV88W_TBM35_CRF_ITEM_CD + "_Child" ;
         }
         /* Using cursor P005F8 */
         pr_default.execute(6, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), AV88W_TBM35_CRF_ITEM_CD});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A31TBM35_STUDY_ID = P005F8_A31TBM35_STUDY_ID[0] ;
            A32TBM35_CRF_ID = P005F8_A32TBM35_CRF_ID[0] ;
            A581TBM35_DEL_FLG = P005F8_A581TBM35_DEL_FLG[0] ;
            n581TBM35_DEL_FLG = P005F8_n581TBM35_DEL_FLG[0] ;
            A33TBM35_CRF_ITEM_CD = P005F8_A33TBM35_CRF_ITEM_CD[0] ;
            A580TBM35_DISPLAY_FLG = P005F8_A580TBM35_DISPLAY_FLG[0] ;
            n580TBM35_DISPLAY_FLG = P005F8_n580TBM35_DISPLAY_FLG[0] ;
            A34TBM35_STUDY_AUTH_CD = P005F8_A34TBM35_STUDY_AUTH_CD[0] ;
            if ( GXutil.strcmp(A580TBM35_DISPLAY_FLG, "0") == 0 )
            {
               AV47W_DISP_FLG = "1" ;
            }
            else if ( GXutil.strcmp(A580TBM35_DISPLAY_FLG, "1") == 0 )
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
            else if ( GXutil.strcmp(A580TBM35_DISPLAY_FLG, "2") == 0 )
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
         if ( ! (GXutil.strcmp("", A526TBM32_IMAGE_CD)==0) )
         {
            GXt_char3 = AV57W_IMAGE_URL ;
            GXv_char11[0] = GXt_char3 ;
            new b799_pc02_image_url_get(remoteHandle, context).execute( A526TBM32_IMAGE_CD, GXv_char11) ;
            ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char11[0] ;
            AV57W_IMAGE_URL = GXt_char3 ;
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( A72TBM32_CRF_ITEM_CD );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( A405TBM32_CRF_ITEM_NM );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( A74TBM32_CRF_ITEM_DIV );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd( A73TBM32_CRF_ITEM_GRP_CD );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order( A507TBM32_CRF_ITEM_GRP_ORDER );
         if ( ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Group") != 0 ) && ! (GXutil.strcmp("", A73TBM32_CRF_ITEM_GRP_CD)==0) )
         {
            if ( A507TBM32_CRF_ITEM_GRP_ORDER == 0 )
            {
               AV42W_CNT = (short)(AV42W_CNT+1) ;
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order( AV42W_CNT );
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( AV47W_DISP_FLG );
         if ( (0==A644TBM32_AUTH_LVL_MIN) )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( AV58W_INP_FLG );
         }
         else
         {
            if ( AV76W_TAM04_AUTH_LVL < A644TBM32_AUTH_LVL_MIN )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( "0" );
            }
            else
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( AV58W_INP_FLG );
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size( AV77W_TBM31_GRID_SIZE );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( A508TBM32_LOCATION_X );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( A509TBM32_LOCATION_Y );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( A510TBM32_LOCATION_X2 );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( A511TBM32_LOCATION_Y2 );
         if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") == 0 )
         {
            if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2() > AV15C_PAGE_LOCATION_X_MAX )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+80) );
            }
            if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV17C_PAGE_LOCATION_Y2_MAX )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+20) );
            }
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2() > AV15C_PAGE_LOCATION_X_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( AV15C_PAGE_LOCATION_X_MAX );
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() > AV16C_PAGE_LOCATION_Y_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+AV14C_PAGE_CHOSEI) );
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV16C_PAGE_LOCATION_Y_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2()+AV14C_PAGE_CHOSEI) );
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() > AV17C_PAGE_LOCATION_Y2_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( AV17C_PAGE_LOCATION_Y2_MAX );
         }
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV17C_PAGE_LOCATION_Y2_MAX )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( AV17C_PAGE_LOCATION_Y2_MAX );
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( A512TBM32_TEXT_ALIGN_DIV );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows( A516TBM32_TEXT_MAXROWS );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength( A517TBM32_TEXT_MAXLENGTH );
         if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "NumericTextBox") == 0 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength()+1) );
            if ( A518TBM32_DECIMAL_DIGITS > 0 )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength()+(A518TBM32_DECIMAL_DIGITS+1)) );
            }
         }
         if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "TextArea") == 0 )
         {
            if ( A516TBM32_TEXT_MAXROWS > 1 )
            {
               AV55W_HEIGHT = (long)(30*A516TBM32_TEXT_MAXROWS) ;
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+AV55W_HEIGHT) );
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value( A522TBM32_CHK_TRUE_INNER_VALUE );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value( A523TBM32_CHK_FALSE_INNER_VALUE );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( AV57W_IMAGE_URL );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( A524TBM32_TEXT );
         if ( A513TBM32_FONT_SIZE >= 18 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(A513TBM32_FONT_SIZE-1) );
         }
         else
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( A513TBM32_FONT_SIZE );
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg( A514TBM32_FONT_UL_FLG );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( A515TBM32_FONT_COLOR_DIV );
         if ( GXutil.strcmp(AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg(), "0") == 0 )
         {
            if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Label") == 0 )
            {
               if ( A515TBM32_FONT_COLOR_DIV == AV9C_COLOR_WHITE )
               {
                  AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "0" );
               }
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( A521TBM32_LINE_SIZE_DIV );
         if ( ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Line") == 0 ) || ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Rect") == 0 ) || ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Paren") == 0 ) )
         {
            if ( A521TBM32_LINE_SIZE_DIV == 0 )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( (byte)(1) );
            }
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div( A689TBM32_LINE_COLOR_DIV );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div( A519TBM32_LINE_START_POINT_DIV );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div( A520TBM32_LINE_END_POINT_DIV );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle( A690TBM32_LINE_ANGLE );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder( A645TBM32_ZORDER );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( A691TBM32_TAB_ORDER );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg( A692TBM32_TABSTOP_FLG );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id( A774TBM32_REF_CRF_ID );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd( A775TBM32_REF_CRF_ITEM_CD );
         AV81W_TBM32_REF_CRF_ID = A774TBM32_REF_CRF_ID ;
         AV82W_TBM32_REF_CRF_ITEM_CD = A775TBM32_REF_CRF_ITEM_CD ;
         /* Execute user subroutine: S207 */
         S207 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Label") == 0 )
         {
            if ( ! (GXutil.strcmp("", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd())==0) && ! (GXutil.strcmp("", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm())==0) )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value( A527TBM32_FIXED_VALUE );
            }
         }
         else
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value( A527TBM32_FIXED_VALUE );
         }
         if ( ! (GXutil.strcmp("", A525TBM32_LIST_CD)==0) )
         {
            AV80W_TBM32_LIST_CD = A525TBM32_LIST_CD ;
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
            if ( (GXutil.strcmp("", A527TBM32_FIXED_VALUE)==0) )
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
            GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem13[0] = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I;
            new b702_pc07_ol_disp_item_set(remoteHandle, context).execute( AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info(), AV31SD_B702_SD05_DOMAIN_INFO, GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem13) ;
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem13[0] ;
         }
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( "0" );
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
         if ( ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Label") != 0 ) && ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Image") != 0 ) && ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Line") != 0 ) && ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Rect") != 0 ) && ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Paren") != 0 ) )
         {
            AV60W_MARK_FLG = "0" ;
            if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg(), "1") == 0 )
            {
               if ( GXutil.strcmp(AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(), "1") == 0 )
               {
                  if ( GXutil.strcmp(A693TBM32_REQUIRED_INPUT_FLG, "1") == 0 )
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
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd( A72TBM32_CRF_ITEM_CD );
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div( A74TBM32_CRF_ITEM_DIV );
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd( A73TBM32_CRF_ITEM_GRP_CD );
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text( A524TBM32_TEXT );
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x() );
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() );
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2() );
               AV30SD_B702_SD04_MARK_DISP_I.setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() );
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
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( "外枠１" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Rect" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(0) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(0) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( AV15C_PAGE_LOCATION_X_MAX );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( AV16C_PAGE_LOCATION_Y_MAX );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( (byte)(3) );
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "SOTOWAKUYOKO" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( "外枠横線" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Line" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(0) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(50) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( AV15C_PAGE_LOCATION_X_MAX );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(50) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( (byte)(3) );
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
      AV37W_2PAGE_FLG = "0" ;
      AV101GXV2 = 1 ;
      while ( AV101GXV2 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV101GXV2));
         if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") != 0 )
         {
            if ( ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() > AV16C_PAGE_LOCATION_Y_MAX ) || ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV16C_PAGE_LOCATION_Y_MAX ) )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "SOTOWAKU2" );
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( "外枠２" );
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Rect" );
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(0) );
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(1420+AV14C_PAGE_CHOSEI) );
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( AV15C_PAGE_LOCATION_X_MAX );
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(2834+AV14C_PAGE_CHOSEI) );
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( (byte)(3) );
               AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
               AV37W_2PAGE_FLG = "1" ;
               if (true) break;
            }
         }
         AV101GXV2 = (int)(AV101GXV2+1) ;
      }
      if ( GXutil.strcmp(AV37W_2PAGE_FLG, "0") == 0 )
      {
         AV102GXV3 = 1 ;
         while ( AV102GXV3 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV102GXV3));
            if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 )
            {
               if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2() > AV16C_PAGE_LOCATION_Y_MAX )
               {
                  AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( AV16C_PAGE_LOCATION_Y_MAX );
               }
            }
            AV102GXV3 = (int)(AV102GXV3+1) ;
         }
      }
   }

   public void S181( )
   {
      /* 'SUB_HISTORY_VERSION_MIN' Routine */
      /* Using cursor P005F9 */
      pr_default.execute(7, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV19P_CRF_ID), new Byte(AV89P_CRF_EDA_NO)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A457TBT11_DEL_FLG = P005F9_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = P005F9_n457TBT11_DEL_FLG[0] ;
         A669TBT11_DM_ARRIVAL_FLG = P005F9_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = P005F9_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A936TBT11_CRF_EDA_NO = P005F9_A936TBT11_CRF_EDA_NO[0] ;
         A94TBT11_CRF_ID = P005F9_A94TBT11_CRF_ID[0] ;
         A93TBT11_SUBJECT_ID = P005F9_A93TBT11_SUBJECT_ID[0] ;
         A92TBT11_STUDY_ID = P005F9_A92TBT11_STUDY_ID[0] ;
         A95TBT11_CRF_VERSION = P005F9_A95TBT11_CRF_VERSION[0] ;
         AV83W_TBT11_CRF_VERSION_MIN = A95TBT11_CRF_VERSION ;
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
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Image" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(696) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(3) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(717) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(24) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( AV67W_RIREKI_URL );
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "HISTORY_VER" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Label" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(717) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(3) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(787) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(23) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( "left" );
      AV46W_DISP_CRF_VERSION = (short)((AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version()-AV83W_TBT11_CRF_VERSION_MIN)+1) ;
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "更新Ver."+GXutil.trim( GXutil.str( AV46W_DISP_CRF_VERSION, 4, 0)) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(14) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( UIFactory.getColor( 255, 140, 0) );
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( "HISTORY_DTTM" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Label" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(795) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(3) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(975) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(23) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( "left" );
      if ( GXutil.nullDate().equals(AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime()) )
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "更新日時:                  " );
      }
      else
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "更新日時:"+GXutil.trim( localUtil.ttoc( AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime(), 10, 8, 0, 1, "/", ":", " ")) );
      }
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(14) );
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( UIFactory.getColor( 255, 140, 0) );
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I, 0);
   }

   public void S207( )
   {
      /* 'SUB_GET_CRF_DOM_MAP' Routine */
      AV104GXV4 = 1 ;
      while ( AV104GXV4 <= AV31SD_B702_SD05_DOMAIN_INFO.size() )
      {
         AV32SD_B702_SD05_DOMAIN_INFO_I = (SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem)((SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem)AV31SD_B702_SD05_DOMAIN_INFO.elementAt(-1+AV104GXV4));
         if ( GXutil.strcmp(AV32SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd(), AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd()) == 0 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd( AV32SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd() );
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm( AV32SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm() );
            if (true) break;
         }
         AV104GXV4 = (int)(AV104GXV4+1) ;
      }
   }

   public void S227( )
   {
      /* 'SUB_GET_DOM_AUTO_MAP' Routine */
      /* Using cursor P005F10 */
      pr_default.execute(8, new Object[] {new Long(AV23P_STUDY_ID), AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm()});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A433TBM37_DEL_FLG = P005F10_A433TBM37_DEL_FLG[0] ;
         n433TBM37_DEL_FLG = P005F10_n433TBM37_DEL_FLG[0] ;
         A500TBM37_DOM_VAR_NM = P005F10_A500TBM37_DOM_VAR_NM[0] ;
         n500TBM37_DOM_VAR_NM = P005F10_n500TBM37_DOM_VAR_NM[0] ;
         A84TBM37_DOM_CD = P005F10_A84TBM37_DOM_CD[0] ;
         n84TBM37_DOM_CD = P005F10_n84TBM37_DOM_CD[0] ;
         A79TBM37_STUDY_ID = P005F10_A79TBM37_STUDY_ID[0] ;
         A82TBM37_CRF_ITEM_GRP_CD = P005F10_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         A80TBM37_CRF_ID = P005F10_A80TBM37_CRF_ID[0] ;
         A81TBM37_CRF_ITEM_GRP_DIV = P005F10_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         AV81W_TBM32_REF_CRF_ID = A80TBM37_CRF_ID ;
         AV82W_TBM32_REF_CRF_ITEM_CD = A82TBM37_CRF_ITEM_GRP_CD ;
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
      AV106GXLvl954 = (byte)(0) ;
      /* Using cursor P005F11 */
      pr_default.execute(9, new Object[] {new Long(AV23P_STUDY_ID), AV80W_TBM32_LIST_CD});
      if ( Gx_err != 0 )
      {
         AV106GXLvl954 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(9) != 101) )
      {
         A563TBM26_DEL_FLG = P005F11_A563TBM26_DEL_FLG[0] ;
         n563TBM26_DEL_FLG = P005F11_n563TBM26_DEL_FLG[0] ;
         A27TBM26_LIST_ITEM_NO = P005F11_A27TBM26_LIST_ITEM_NO[0] ;
         A26TBM26_LIST_CD = P005F11_A26TBM26_LIST_CD[0] ;
         A25TBM26_STUDY_ID = P005F11_A25TBM26_STUDY_ID[0] ;
         A561TBM26_LIST_ITEM_NAME = P005F11_A561TBM26_LIST_ITEM_NAME[0] ;
         n561TBM26_LIST_ITEM_NAME = P005F11_n561TBM26_LIST_ITEM_NAME[0] ;
         A562TBM26_INNER_VALUE = P005F11_A562TBM26_INNER_VALUE[0] ;
         n562TBM26_INNER_VALUE = P005F11_n562TBM26_INNER_VALUE[0] ;
         AV106GXLvl954 = (byte)(1) ;
         AV28SD_B702_SD03_SEL_LIST_ITEM_I = (SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem)new SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem(remoteHandle, context);
         AV28SD_B702_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no( A27TBM26_LIST_ITEM_NO );
         AV28SD_B702_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name( A561TBM26_LIST_ITEM_NAME );
         AV28SD_B702_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value( A562TBM26_INNER_VALUE );
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items().add(AV28SD_B702_SD03_SEL_LIST_ITEM_I, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      if ( AV106GXLvl954 == 0 )
      {
         AV49W_ERR_FLG = "1" ;
         GXt_char3 = AV50W_ERR_MSG ;
         GXv_char11[0] = GXt_char3 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char11) ;
         ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char11[0] ;
         AV50W_ERR_MSG = GXt_char3 ;
      }
   }

   public void S237( )
   {
      /* 'SUB_REF_CRF_VALUE_SET' Routine */
      GXv_char11[0] = AV45W_CRF_VALUE ;
      new b702_pc03_ref_crf_value(remoteHandle, context).execute( AV23P_STUDY_ID, AV24P_SUBJECT_ID, AV81W_TBM32_REF_CRF_ID, AV82W_TBM32_REF_CRF_ITEM_CD, AV34SD_B792_SD01_CRF, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), GXv_char11) ;
      ab702_pc01_get_crf_design_impl.this.AV45W_CRF_VALUE = GXv_char11[0] ;
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( AV45W_CRF_VALUE );
   }

   public void S247( )
   {
      /* 'SUB_CRF_VALUE_SET' Routine */
      AV107GXV5 = 1 ;
      while ( AV107GXV5 <= AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
      {
         AV35SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV34SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV107GXV5));
         if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd(), AV35SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd()) == 0 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value( AV35SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() );
            AV84W_TBT13_EDIT_FLG = AV35SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_edit_flg() ;
            if (true) break;
         }
         AV107GXV5 = (int)(AV107GXV5+1) ;
      }
   }

   public void S257( )
   {
      /* 'SUB_MEMO_SET' Routine */
      /* Using cursor P005F12 */
      pr_default.execute(10, new Object[] {new Long(AV23P_STUDY_ID), new Integer(AV24P_SUBJECT_ID), new Short(AV19P_CRF_ID), new Byte(AV89P_CRF_EDA_NO), AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd()});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A902TBT14_KANRYO_FLG = P005F12_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = P005F12_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = P005F12_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = P005F12_n479TBT14_DEL_FLG[0] ;
         A488TBT15_DEL_FLG = P005F12_A488TBT15_DEL_FLG[0] ;
         n488TBT15_DEL_FLG = P005F12_n488TBT15_DEL_FLG[0] ;
         A904TBT15_CRF_ITEM_GRP_CD = P005F12_A904TBT15_CRF_ITEM_GRP_CD[0] ;
         n904TBT15_CRF_ITEM_GRP_CD = P005F12_n904TBT15_CRF_ITEM_GRP_CD[0] ;
         A942TBT15_CRF_EDA_NO = P005F12_A942TBT15_CRF_EDA_NO[0] ;
         n942TBT15_CRF_EDA_NO = P005F12_n942TBT15_CRF_EDA_NO[0] ;
         A155TBT15_CRF_ID = P005F12_A155TBT15_CRF_ID[0] ;
         n155TBT15_CRF_ID = P005F12_n155TBT15_CRF_ID[0] ;
         A151TBT15_SUBJECT_ID = P005F12_A151TBT15_SUBJECT_ID[0] ;
         A149TBT15_STUDY_ID = P005F12_A149TBT15_STUDY_ID[0] ;
         A199TBT15_MEMO_NO = P005F12_A199TBT15_MEMO_NO[0] ;
         A902TBT14_KANRYO_FLG = P005F12_A902TBT14_KANRYO_FLG[0] ;
         n902TBT14_KANRYO_FLG = P005F12_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = P005F12_A479TBT14_DEL_FLG[0] ;
         n479TBT14_DEL_FLG = P005F12_n479TBT14_DEL_FLG[0] ;
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no( A199TBT15_MEMO_NO );
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
         A198TBT14_MEMO_NO = P005F13_A198TBT14_MEMO_NO[0] ;
         A142TBT14_SUBJECT_ID = P005F13_A142TBT14_SUBJECT_ID[0] ;
         A140TBT14_STUDY_ID = P005F13_A140TBT14_STUDY_ID[0] ;
         A931TBT14_CRT_AUTH_CD = P005F13_A931TBT14_CRT_AUTH_CD[0] ;
         n931TBT14_CRT_AUTH_CD = P005F13_n931TBT14_CRT_AUTH_CD[0] ;
         A481TBT14_CRT_USER_ID = P005F13_A481TBT14_CRT_USER_ID[0] ;
         n481TBT14_CRT_USER_ID = P005F13_n481TBT14_CRT_USER_ID[0] ;
         A901TBT14_MEMO_KBN = P005F13_A901TBT14_MEMO_KBN[0] ;
         n901TBT14_MEMO_KBN = P005F13_n901TBT14_MEMO_KBN[0] ;
         A930TBT14_REQUEST_AUTH_CD = P005F13_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = P005F13_n930TBT14_REQUEST_AUTH_CD[0] ;
         A929TBT14_REQUEST_SITE_ID = P005F13_A929TBT14_REQUEST_SITE_ID[0] ;
         n929TBT14_REQUEST_SITE_ID = P005F13_n929TBT14_REQUEST_SITE_ID[0] ;
         A927TBT14_KAKUNIN_FLG = P005F13_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P005F13_n927TBT14_KAKUNIN_FLG[0] ;
         if ( ( GXutil.strcmp(A481TBT14_CRT_USER_ID, AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()) == 0 ) && ( GXutil.strcmp(A931TBT14_CRT_AUTH_CD, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd()) == 0 ) )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( A901TBT14_MEMO_KBN );
         }
         else
         {
            if ( ( GXutil.strcmp(A929TBT14_REQUEST_SITE_ID, AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()) == 0 ) && ( ( GXutil.strcmp(A930TBT14_REQUEST_AUTH_CD, AV33SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd()) == 0 ) || ( GXutil.strcmp(A930TBT14_REQUEST_AUTH_CD, AV8C_ALL_AUTH_CD) == 0 ) ) )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( "2" );
            }
         }
         if ( GXutil.strcmp(A927TBT14_KAKUNIN_FLG, "1") == 0 )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( "3" );
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
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().sort("CRF_ITEM_GRP_CD, [CRF_ITEM_GRP_ORDER]") ;
      AV110GXV6 = 1 ;
      while ( AV110GXV6 <= AV29SD_B702_SD04_MARK_DISP.size() )
      {
         AV30SD_B702_SD04_MARK_DISP_I = (SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)((SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)AV29SD_B702_SD04_MARK_DISP.elementAt(-1+AV110GXV6));
         if ( GXutil.strcmp(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(), "Group") == 0 )
         {
            AV111GXV7 = 1 ;
            while ( AV111GXV7 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV111GXV7));
               if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd()) == 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg(), "1") == 0 ) )
               {
                  if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Label") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Line") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Rect") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Paren") != 0 ) )
                  {
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd()+"_REQUIRED2" );
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Label" );
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
                     if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "RadioBox") == 0 )
                     {
                        AV59W_LEN = (short)(GXutil.byteCount( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text(), "UTF8")*9) ;
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+AV59W_LEN+1) );
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+12) );
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+AV59W_LEN+11) );
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+12) );
                     }
                     else
                     {
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2()+1) );
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+4) );
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2()+11) );
                        AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+4) );
                     }
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( "left" );
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "*" );
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(16) );
                     AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( UIFactory.getColor( 255, 0, 0) );
                     AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV27SD_B702_SD02_CRF_ITEM_MARK_I, 0);
                     if (true) break;
                  }
               }
               AV111GXV7 = (int)(AV111GXV7+1) ;
            }
         }
         else
         {
            AV53W_GRP_X = 0 ;
            AV54W_GRP_Y = 0 ;
            if ( ! (GXutil.strcmp("", AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd())==0) )
            {
               AV112GXV8 = 1 ;
               while ( AV112GXV8 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
               {
                  AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV112GXV8));
                  AV47W_DISP_FLG = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg() ;
                  if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd()) == 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 ) )
                  {
                     AV53W_GRP_X = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x() ;
                     AV54W_GRP_Y = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() ;
                     if (true) break;
                  }
                  AV112GXV8 = (int)(AV112GXV8+1) ;
               }
            }
            if ( GXutil.strcmp(AV47W_DISP_FLG, "1") == 0 )
            {
               AV27SD_B702_SD02_CRF_ITEM_MARK_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd()+"_REQUIRED1" );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Label" );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV53W_GRP_X+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2()+1) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV54W_GRP_Y+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+4) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV53W_GRP_X+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2()+11) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV54W_GRP_Y+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+4) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( "left" );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( "*" );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( (byte)(16) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( UIFactory.getColor( 255, 0, 0) );
               AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV27SD_B702_SD02_CRF_ITEM_MARK_I, 0);
            }
         }
         AV110GXV6 = (int)(AV110GXV6+1) ;
      }
   }

   public void S291( )
   {
      /* 'SUB_EDIT_MARK_SET' Routine */
      AV29SD_B702_SD04_MARK_DISP.sort("TBM32_CRF_ITEM_GRP_CD, TBM32_CRF_ITEM_CD");
      AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().sort("CRF_ITEM_GRP_CD, [CRF_ITEM_GRP_ORDER]") ;
      AV113GXV9 = 1 ;
      while ( AV113GXV9 <= AV29SD_B702_SD04_MARK_DISP.size() )
      {
         AV30SD_B702_SD04_MARK_DISP_I = (SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)((SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)AV29SD_B702_SD04_MARK_DISP.elementAt(-1+AV113GXV9));
         if ( GXutil.strcmp(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(), "Group") == 0 )
         {
            AV65W_RADIO_GRP_FLG = "0" ;
            AV114GXV10 = 1 ;
            while ( AV114GXV10 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
            {
               AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV114GXV10));
               if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd()) == 0 )
               {
                  if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "RadioBox") == 0 )
                  {
                     AV65W_RADIO_GRP_FLG = "1" ;
                     if (true) break;
                  }
               }
               AV114GXV10 = (int)(AV114GXV10+1) ;
            }
            if ( GXutil.strcmp(AV65W_RADIO_GRP_FLG, "1") == 0 )
            {
               AV27SD_B702_SD02_CRF_ITEM_MARK_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd()+"_HISTORY2" );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Image" );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
               AV59W_LEN = (short)(GXutil.byteCount( GXutil.trim( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text()), "UTF8")*9) ;
               AV59W_LEN = (short)(AV59W_LEN+20) ;
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+AV59W_LEN) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+AV59W_LEN+21) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()+AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+21) );
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( AV67W_RIREKI_URL );
               AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV27SD_B702_SD02_CRF_ITEM_MARK_I, 0);
            }
         }
         else
         {
            AV53W_GRP_X = 0 ;
            AV54W_GRP_Y = 0 ;
            if ( ! (GXutil.strcmp("", AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd())==0) )
            {
               AV115GXV11 = 1 ;
               while ( AV115GXV11 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
               {
                  AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV115GXV11));
                  if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd()) == 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 ) )
                  {
                     AV53W_GRP_X = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x() ;
                     AV54W_GRP_Y = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y() ;
                     if (true) break;
                  }
                  AV115GXV11 = (int)(AV115GXV11+1) ;
               }
            }
            AV27SD_B702_SD02_CRF_ITEM_MARK_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd()+"_HISTORY1" );
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( "Image" );
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "1" );
            if ( ( GXutil.strcmp(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(), "CheckBox") == 0 ) || ( GXutil.strcmp(AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(), "RadioBox") == 0 ) )
            {
               AV59W_LEN = (short)(GXutil.byteCount( GXutil.trim( AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text()), "UTF8")*9) ;
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV53W_GRP_X+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x()+AV59W_LEN+11) );
            }
            else
            {
               AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( (short)(AV53W_GRP_X+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2()) );
            }
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( (short)(AV54W_GRP_Y+AV30SD_B702_SD04_MARK_DISP_I.getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y()) );
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( (short)(AV27SD_B702_SD02_CRF_ITEM_MARK_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x()+21) );
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( (short)(AV27SD_B702_SD02_CRF_ITEM_MARK_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y()+21) );
            AV27SD_B702_SD02_CRF_ITEM_MARK_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( AV67W_RIREKI_URL );
            AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().add(AV27SD_B702_SD02_CRF_ITEM_MARK_I, 0);
         }
         AV113GXV9 = (int)(AV113GXV9+1) ;
      }
   }

   public void S261( )
   {
      /* 'SUB_GRP_NO_INP_NO_DISP' Routine */
      AV116GXV12 = 1 ;
      while ( AV116GXV12 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV116GXV12));
         if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 ) && ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg(), "0") == 0 ) || ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg(), "0") == 0 ) ) )
         {
            AV117GXV13 = 1 ;
            while ( AV117GXV13 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
            {
               AV39W_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV117GXV13));
               if ( ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") != 0 ) && ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd()) == 0 ) )
               {
                  AV39W_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg() );
                  AV39W_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg() );
                  if ( GXutil.strcmp(AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg(), "0") == 0 )
                  {
                     if ( AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div() == AV9C_COLOR_WHITE )
                     {
                        AV39W_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( "0" );
                     }
                  }
               }
               AV117GXV13 = (int)(AV117GXV13+1) ;
            }
         }
         AV116GXV12 = (int)(AV116GXV12+1) ;
      }
   }

   public void S271( )
   {
      /* 'SUB_TAB_ORDER_SET' Routine */
      AV75W_TAB_ORDER_FLG = "0" ;
      AV118GXV14 = 1 ;
      while ( AV118GXV14 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
      {
         AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV118GXV14));
         if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order() > 0 )
         {
            AV75W_TAB_ORDER_FLG = "1" ;
            if (true) break;
         }
         AV118GXV14 = (int)(AV118GXV14+1) ;
      }
      if ( GXutil.strcmp(AV75W_TAB_ORDER_FLG, "0") == 0 )
      {
         AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().sort("LOCATION_Y, LOCATION_X") ;
         AV74W_TAB_ORDER = (short)(0) ;
         AV119GXV15 = 1 ;
         while ( AV119GXV15 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
         {
            AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV119GXV15));
            if ( ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Label") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Line") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Rect") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Paren") != 0 ) && ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "RadioBox") != 0 ) )
            {
               if ( AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order() == 0 )
               {
                  if ( (GXutil.strcmp("", AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd())==0) )
                  {
                     AV74W_TAB_ORDER = (short)(AV74W_TAB_ORDER+1) ;
                     AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( AV74W_TAB_ORDER );
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 )
                     {
                        AV74W_TAB_ORDER = (short)(AV74W_TAB_ORDER+1) ;
                        AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( AV74W_TAB_ORDER );
                        AV79W_TBM32_CRF_ITEM_GRP_CD = AV26SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd() ;
                        /* Execute user subroutine: S321 */
                        S321 ();
                        if (returnInSub) return;
                     }
                  }
               }
            }
            AV119GXV15 = (int)(AV119GXV15+1) ;
         }
      }
   }

   public void S321( )
   {
      /* 'SUB_GRP_TAB_ORDER_SET' Routine */
      AV120GXV16 = 1 ;
      while ( AV120GXV16 <= AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().size() )
      {
         AV39W_B702_SD02_CRF_ITEM_DESIGN_I = (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)AV25SD_B702_SD01_CRF_DESIGN.getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().elementAt(-1+AV120GXV16));
         if ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(), AV79W_TBM32_CRF_ITEM_GRP_CD) == 0 )
         {
            if ( ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "TextArea") == 0 ) || ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "NumericTextBox") == 0 ) || ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "CheckBox") == 0 ) || ( GXutil.strcmp(AV39W_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "SelectBox") == 0 ) )
            {
               AV74W_TAB_ORDER = (short)(AV74W_TAB_ORDER+1) ;
               AV39W_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( AV74W_TAB_ORDER );
            }
         }
         AV120GXV16 = (int)(AV120GXV16+1) ;
      }
   }

   public void S331( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT14[0] = AV38W_A_LOGIN_SDT;
      GXv_char11[0] = AV51W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT14, GXv_char11) ;
      AV38W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT14[0] ;
      ab702_pc01_get_crf_design_impl.this.AV51W_ERRCD = GXv_char11[0] ;
      if ( GXutil.strcmp(AV51W_ERRCD, "0") != 0 )
      {
         AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( "9" );
         AV18HttpResponse.addString(AV25SD_B702_SD01_CRF_DESIGN.toJSonString(false));
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXv_char11[0] = AV10C_DM_AUTH_CD ;
      GXv_int2[0] = (byte)(AV11C_DM_INPUT_LEVEL) ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char11, GXv_int2) ;
      ab702_pc01_get_crf_design_impl.this.AV10C_DM_AUTH_CD = GXv_char11[0] ;
      ab702_pc01_get_crf_design_impl.this.AV11C_DM_INPUT_LEVEL = GXv_int2[0] ;
      GXt_char3 = AV72W_SESSION_KEY ;
      GXv_char11[0] = GXt_char3 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV38W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char11) ;
      ab702_pc01_get_crf_design_impl.this.GXt_char3 = GXv_char11[0] ;
      AV72W_SESSION_KEY = GXt_char3 ;
      AV33SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV71W_SESSION.getValue(AV72W_SESSION_KEY), "");
   }

   public void S341( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV121Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV25SD_B702_SD01_CRF_DESIGN.setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( "9" );
      AV18HttpResponse.addString(AV25SD_B702_SD01_CRF_DESIGN.toJSonString(false));
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
                  /* Execute user subroutine: S341 */
                  S341 ();
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
      AV90P_CRF_ID_EDA_NO = "" ;
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
      P005F2_A13TAM04_AUTH_CD = new String[] {""} ;
      P005F2_A687TAM04_AUTH_LVL = new byte[1] ;
      P005F2_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      A13TAM04_AUTH_CD = "" ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A675TBT11_INPUT_END_FLG = "" ;
      A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV68W_RTN_CD = "" ;
      AV63W_MSG = "" ;
      GXv_SdtB792_SD01_CRF5 = new SdtB792_SD01_CRF [1] ;
      AV35SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A661TBT02_INPUT_END_FLG = "" ;
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005F3_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P005F3_A91TBT02_CRF_ID = new short[1] ;
      P005F3_A90TBT02_SUBJECT_ID = new int[1] ;
      P005F3_A89TBT02_STUDY_ID = new long[1] ;
      P005F3_A449TBT02_DEL_FLG = new String[] {""} ;
      P005F3_n449TBT02_DEL_FLG = new boolean[] {false} ;
      P005F3_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      P005F3_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P005F3_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F3_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      P005F3_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P005F3_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P005F3_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P005F3_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005F3_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F3_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P005F3_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      P005F3_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P005F3_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F3_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      P005F3_A456TBT02_UPD_CNT = new long[1] ;
      P005F3_n456TBT02_UPD_CNT = new boolean[] {false} ;
      A449TBT02_DEL_FLG = "" ;
      P005F4_A96TBT12_STUDY_ID = new long[1] ;
      P005F4_A97TBT12_SUBJECT_ID = new int[1] ;
      P005F4_A98TBT12_CRF_ID = new short[1] ;
      P005F4_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P005F4_A473TBT12_DEL_FLG = new String[] {""} ;
      P005F4_n473TBT12_DEL_FLG = new boolean[] {false} ;
      P005F4_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P005F4_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F4_A465TBT12_CRF_VALUE = new String[] {""} ;
      P005F4_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      P005F4_A679TBT12_EDIT_FLG = new String[] {""} ;
      P005F4_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      A473TBT12_DEL_FLG = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A465TBT12_CRF_VALUE = "" ;
      A679TBT12_EDIT_FLG = "" ;
      P005F5_A95TBT11_CRF_VERSION = new short[1] ;
      P005F5_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P005F5_A94TBT11_CRF_ID = new short[1] ;
      P005F5_A93TBT11_SUBJECT_ID = new int[1] ;
      P005F5_A92TBT11_STUDY_ID = new long[1] ;
      P005F5_A457TBT11_DEL_FLG = new String[] {""} ;
      P005F5_n457TBT11_DEL_FLG = new boolean[] {false} ;
      P005F5_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F5_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      P005F5_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      P005F5_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P005F5_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P005F5_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005F5_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F5_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P005F5_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      P005F5_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      P005F5_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005F5_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      P005F5_A464TBT11_UPD_CNT = new long[1] ;
      P005F5_n464TBT11_UPD_CNT = new boolean[] {false} ;
      A457TBT11_DEL_FLG = "" ;
      P005F6_A101TBT13_STUDY_ID = new long[1] ;
      P005F6_A102TBT13_SUBJECT_ID = new int[1] ;
      P005F6_A103TBT13_CRF_ID = new short[1] ;
      P005F6_A938TBT13_CRF_EDA_NO = new byte[1] ;
      P005F6_A104TBT13_CRF_VERSION = new short[1] ;
      P005F6_A598TBT13_DEL_FLG = new String[] {""} ;
      P005F6_n598TBT13_DEL_FLG = new boolean[] {false} ;
      P005F6_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P005F6_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F6_A597TBT13_CRF_VALUE = new String[] {""} ;
      P005F6_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      P005F6_A680TBT13_EDIT_FLG = new String[] {""} ;
      P005F6_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      A598TBT13_DEL_FLG = "" ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      A597TBT13_CRF_VALUE = "" ;
      A680TBT13_EDIT_FLG = "" ;
      AV62W_MODE_KBN = "" ;
      GXv_char6 = new String [1] ;
      AV61W_MEMO_INPU_FLG = "" ;
      GXv_char4 = new String [1] ;
      AV44W_CRF_KANRI_FLG = "" ;
      GXv_char7 = new String [1] ;
      GXv_char8 = new String [1] ;
      GXv_char9 = new String [1] ;
      GXv_int1 = new short [1] ;
      GXv_char10 = new String [1] ;
      AV58W_INP_FLG = "" ;
      AV10C_DM_AUTH_CD = "" ;
      AV31SD_B702_SD05_DOMAIN_INFO = new GxObjectCollection(SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem.class, "B702_SD05_DOMAIN_INFO.B702_SD05_DOMAIN_INFOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem12 = new GxObjectCollection [1] ;
      P005F7_A71TBM32_CRF_ID = new short[1] ;
      P005F7_A70TBM32_STUDY_ID = new long[1] ;
      P005F7_A75TBM32_DEL_FLG = new String[] {""} ;
      P005F7_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P005F7_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005F7_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F7_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005F7_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005F7_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005F7_A526TBM32_IMAGE_CD = new String[] {""} ;
      P005F7_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      P005F7_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      P005F7_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      P005F7_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P005F7_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P005F7_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      P005F7_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      P005F7_A508TBM32_LOCATION_X = new short[1] ;
      P005F7_n508TBM32_LOCATION_X = new boolean[] {false} ;
      P005F7_A509TBM32_LOCATION_Y = new short[1] ;
      P005F7_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      P005F7_A510TBM32_LOCATION_X2 = new short[1] ;
      P005F7_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      P005F7_A511TBM32_LOCATION_Y2 = new short[1] ;
      P005F7_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P005F7_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P005F7_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P005F7_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      P005F7_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P005F7_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      P005F7_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      P005F7_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      P005F7_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      P005F7_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P005F7_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P005F7_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      P005F7_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      P005F7_A524TBM32_TEXT = new String[] {""} ;
      P005F7_n524TBM32_TEXT = new boolean[] {false} ;
      P005F7_A513TBM32_FONT_SIZE = new byte[1] ;
      P005F7_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      P005F7_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      P005F7_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      P005F7_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      P005F7_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P005F7_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      P005F7_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P005F7_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      P005F7_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P005F7_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P005F7_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P005F7_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P005F7_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P005F7_A690TBM32_LINE_ANGLE = new short[1] ;
      P005F7_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      P005F7_A645TBM32_ZORDER = new short[1] ;
      P005F7_n645TBM32_ZORDER = new boolean[] {false} ;
      P005F7_A691TBM32_TAB_ORDER = new short[1] ;
      P005F7_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      P005F7_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      P005F7_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      P005F7_A774TBM32_REF_CRF_ID = new short[1] ;
      P005F7_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      P005F7_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P005F7_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P005F7_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P005F7_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P005F7_A525TBM32_LIST_CD = new String[] {""} ;
      P005F7_n525TBM32_LIST_CD = new boolean[] {false} ;
      P005F7_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P005F7_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      A75TBM32_DEL_FLG = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A526TBM32_IMAGE_CD = "" ;
      A405TBM32_CRF_ITEM_NM = "" ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      A524TBM32_TEXT = "" ;
      A514TBM32_FONT_UL_FLG = "" ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      A692TBM32_TABSTOP_FLG = "" ;
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      A525TBM32_LIST_CD = "" ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      AV47W_DISP_FLG = "" ;
      AV84W_TBT13_EDIT_FLG = "" ;
      AV57W_IMAGE_URL = "" ;
      AV88W_TBM35_CRF_ITEM_CD = "" ;
      P005F8_A31TBM35_STUDY_ID = new long[1] ;
      P005F8_A32TBM35_CRF_ID = new short[1] ;
      P005F8_A581TBM35_DEL_FLG = new String[] {""} ;
      P005F8_n581TBM35_DEL_FLG = new boolean[] {false} ;
      P005F8_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      P005F8_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      P005F8_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P005F8_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      A581TBM35_DEL_FLG = "" ;
      A33TBM35_CRF_ITEM_CD = "" ;
      A580TBM35_DISPLAY_FLG = "" ;
      A34TBM35_STUDY_AUTH_CD = "" ;
      AV26SD_B702_SD02_CRF_ITEM_DESIGN_I = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV82W_TBM32_REF_CRF_ITEM_CD = "" ;
      AV80W_TBM32_LIST_CD = "" ;
      GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem13 = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem [1] ;
      AV60W_MARK_FLG = "" ;
      AV30SD_B702_SD04_MARK_DISP_I = new SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem(remoteHandle, context);
      AV29SD_B702_SD04_MARK_DISP = new GxObjectCollection(SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem.class, "B702_SD04_MARK_DISP.B702_SD04_MARK_DISPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV37W_2PAGE_FLG = "" ;
      P005F9_A457TBT11_DEL_FLG = new String[] {""} ;
      P005F9_n457TBT11_DEL_FLG = new boolean[] {false} ;
      P005F9_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P005F9_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005F9_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P005F9_A94TBT11_CRF_ID = new short[1] ;
      P005F9_A93TBT11_SUBJECT_ID = new int[1] ;
      P005F9_A92TBT11_STUDY_ID = new long[1] ;
      P005F9_A95TBT11_CRF_VERSION = new short[1] ;
      AV32SD_B702_SD05_DOMAIN_INFO_I = new SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem(remoteHandle, context);
      P005F10_A433TBM37_DEL_FLG = new String[] {""} ;
      P005F10_n433TBM37_DEL_FLG = new boolean[] {false} ;
      P005F10_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      P005F10_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P005F10_A84TBM37_DOM_CD = new String[] {""} ;
      P005F10_n84TBM37_DOM_CD = new boolean[] {false} ;
      P005F10_A79TBM37_STUDY_ID = new long[1] ;
      P005F10_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F10_A80TBM37_CRF_ID = new short[1] ;
      P005F10_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A433TBM37_DEL_FLG = "" ;
      A500TBM37_DOM_VAR_NM = "" ;
      A84TBM37_DOM_CD = "" ;
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
      A561TBM26_LIST_ITEM_NAME = "" ;
      A562TBM26_INNER_VALUE = "" ;
      P005F11_A563TBM26_DEL_FLG = new String[] {""} ;
      P005F11_n563TBM26_DEL_FLG = new boolean[] {false} ;
      P005F11_A27TBM26_LIST_ITEM_NO = new short[1] ;
      P005F11_A26TBM26_LIST_CD = new String[] {""} ;
      P005F11_A25TBM26_STUDY_ID = new long[1] ;
      P005F11_A561TBM26_LIST_ITEM_NAME = new String[] {""} ;
      P005F11_n561TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      P005F11_A562TBM26_INNER_VALUE = new String[] {""} ;
      P005F11_n562TBM26_INNER_VALUE = new boolean[] {false} ;
      A563TBM26_DEL_FLG = "" ;
      A26TBM26_LIST_CD = "" ;
      AV28SD_B702_SD03_SEL_LIST_ITEM_I = new SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem(remoteHandle, context);
      AV45W_CRF_VALUE = "" ;
      P005F12_A902TBT14_KANRYO_FLG = new String[] {""} ;
      P005F12_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      P005F12_A479TBT14_DEL_FLG = new String[] {""} ;
      P005F12_n479TBT14_DEL_FLG = new boolean[] {false} ;
      P005F12_A488TBT15_DEL_FLG = new String[] {""} ;
      P005F12_n488TBT15_DEL_FLG = new boolean[] {false} ;
      P005F12_A904TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005F12_n904TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005F12_A942TBT15_CRF_EDA_NO = new byte[1] ;
      P005F12_n942TBT15_CRF_EDA_NO = new boolean[] {false} ;
      P005F12_A155TBT15_CRF_ID = new short[1] ;
      P005F12_n155TBT15_CRF_ID = new boolean[] {false} ;
      P005F12_A151TBT15_SUBJECT_ID = new int[1] ;
      P005F12_A149TBT15_STUDY_ID = new long[1] ;
      P005F12_A199TBT15_MEMO_NO = new short[1] ;
      A902TBT14_KANRYO_FLG = "" ;
      A479TBT14_DEL_FLG = "" ;
      A488TBT15_DEL_FLG = "" ;
      A904TBT15_CRF_ITEM_GRP_CD = "" ;
      P005F13_A198TBT14_MEMO_NO = new short[1] ;
      P005F13_A142TBT14_SUBJECT_ID = new int[1] ;
      P005F13_A140TBT14_STUDY_ID = new long[1] ;
      P005F13_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      P005F13_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      P005F13_A481TBT14_CRT_USER_ID = new String[] {""} ;
      P005F13_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      P005F13_A901TBT14_MEMO_KBN = new String[] {""} ;
      P005F13_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      P005F13_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      P005F13_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      P005F13_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      P005F13_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      P005F13_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      P005F13_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      A931TBT14_CRT_AUTH_CD = "" ;
      A481TBT14_CRT_USER_ID = "" ;
      A901TBT14_MEMO_KBN = "" ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      AV27SD_B702_SD02_CRF_ITEM_MARK_I = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV65W_RADIO_GRP_FLG = "" ;
      AV39W_B702_SD02_CRF_ITEM_DESIGN_I = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem(remoteHandle, context);
      AV75W_TAB_ORDER_FLG = "" ;
      AV79W_TBM32_CRF_ITEM_GRP_CD = "" ;
      GXv_SdtA_LOGIN_SDT14 = new SdtA_LOGIN_SDT [1] ;
      AV51W_ERRCD = "" ;
      GXv_int2 = new byte [1] ;
      GXt_char3 = "" ;
      GXv_char11 = new String [1] ;
      AV121Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab702_pc01_get_crf_design__default(),
         new Object[] {
             new Object[] {
            P005F2_A13TAM04_AUTH_CD, P005F2_A687TAM04_AUTH_LVL, P005F2_n687TAM04_AUTH_LVL
            }
            , new Object[] {
            P005F3_A935TBT02_CRF_EDA_NO, P005F3_A91TBT02_CRF_ID, P005F3_A90TBT02_SUBJECT_ID, P005F3_A89TBT02_STUDY_ID, P005F3_A449TBT02_DEL_FLG, P005F3_n449TBT02_DEL_FLG, P005F3_A498TBT02_CRF_LATEST_VERSION, P005F3_n498TBT02_CRF_LATEST_VERSION, P005F3_A652TBT02_UPLOAD_DATETIME, P005F3_n652TBT02_UPLOAD_DATETIME,
            P005F3_A499TBT02_CRF_INPUT_LEVEL, P005F3_n499TBT02_CRF_INPUT_LEVEL, P005F3_A655TBT02_DM_ARRIVAL_FLG, P005F3_n655TBT02_DM_ARRIVAL_FLG, P005F3_A656TBT02_DM_ARRIVAL_DATETIME, P005F3_n656TBT02_DM_ARRIVAL_DATETIME, P005F3_A661TBT02_INPUT_END_FLG, P005F3_n661TBT02_INPUT_END_FLG, P005F3_A453TBT02_UPD_DATETIME, P005F3_n453TBT02_UPD_DATETIME,
            P005F3_A456TBT02_UPD_CNT, P005F3_n456TBT02_UPD_CNT
            }
            , new Object[] {
            P005F4_A96TBT12_STUDY_ID, P005F4_A97TBT12_SUBJECT_ID, P005F4_A98TBT12_CRF_ID, P005F4_A937TBT12_CRF_EDA_NO, P005F4_A473TBT12_DEL_FLG, P005F4_n473TBT12_DEL_FLG, P005F4_A99TBT12_CRF_ITEM_GRP_DIV, P005F4_A100TBT12_CRF_ITEM_GRP_CD, P005F4_A465TBT12_CRF_VALUE, P005F4_n465TBT12_CRF_VALUE,
            P005F4_A679TBT12_EDIT_FLG, P005F4_n679TBT12_EDIT_FLG
            }
            , new Object[] {
            P005F5_A95TBT11_CRF_VERSION, P005F5_A936TBT11_CRF_EDA_NO, P005F5_A94TBT11_CRF_ID, P005F5_A93TBT11_SUBJECT_ID, P005F5_A92TBT11_STUDY_ID, P005F5_A457TBT11_DEL_FLG, P005F5_n457TBT11_DEL_FLG, P005F5_A666TBT11_UPLOAD_DATETIME, P005F5_n666TBT11_UPLOAD_DATETIME, P005F5_A665TBT11_CRF_INPUT_LEVEL,
            P005F5_n665TBT11_CRF_INPUT_LEVEL, P005F5_A669TBT11_DM_ARRIVAL_FLG, P005F5_n669TBT11_DM_ARRIVAL_FLG, P005F5_A670TBT11_DM_ARRIVAL_DATETIME, P005F5_n670TBT11_DM_ARRIVAL_DATETIME, P005F5_A675TBT11_INPUT_END_FLG, P005F5_n675TBT11_INPUT_END_FLG, P005F5_A461TBT11_UPD_DATETIME, P005F5_n461TBT11_UPD_DATETIME, P005F5_A464TBT11_UPD_CNT,
            P005F5_n464TBT11_UPD_CNT
            }
            , new Object[] {
            P005F6_A101TBT13_STUDY_ID, P005F6_A102TBT13_SUBJECT_ID, P005F6_A103TBT13_CRF_ID, P005F6_A938TBT13_CRF_EDA_NO, P005F6_A104TBT13_CRF_VERSION, P005F6_A598TBT13_DEL_FLG, P005F6_n598TBT13_DEL_FLG, P005F6_A105TBT13_CRF_ITEM_GRP_DIV, P005F6_A106TBT13_CRF_ITEM_GRP_CD, P005F6_A597TBT13_CRF_VALUE,
            P005F6_n597TBT13_CRF_VALUE, P005F6_A680TBT13_EDIT_FLG, P005F6_n680TBT13_EDIT_FLG
            }
            , new Object[] {
            P005F7_A71TBM32_CRF_ID, P005F7_A70TBM32_STUDY_ID, P005F7_A75TBM32_DEL_FLG, P005F7_n75TBM32_DEL_FLG, P005F7_A72TBM32_CRF_ITEM_CD, P005F7_A73TBM32_CRF_ITEM_GRP_CD, P005F7_n73TBM32_CRF_ITEM_GRP_CD, P005F7_A74TBM32_CRF_ITEM_DIV, P005F7_n74TBM32_CRF_ITEM_DIV, P005F7_A526TBM32_IMAGE_CD,
            P005F7_n526TBM32_IMAGE_CD, P005F7_A405TBM32_CRF_ITEM_NM, P005F7_n405TBM32_CRF_ITEM_NM, P005F7_A507TBM32_CRF_ITEM_GRP_ORDER, P005F7_n507TBM32_CRF_ITEM_GRP_ORDER, P005F7_A644TBM32_AUTH_LVL_MIN, P005F7_n644TBM32_AUTH_LVL_MIN, P005F7_A508TBM32_LOCATION_X, P005F7_n508TBM32_LOCATION_X, P005F7_A509TBM32_LOCATION_Y,
            P005F7_n509TBM32_LOCATION_Y, P005F7_A510TBM32_LOCATION_X2, P005F7_n510TBM32_LOCATION_X2, P005F7_A511TBM32_LOCATION_Y2, P005F7_n511TBM32_LOCATION_Y2, P005F7_A512TBM32_TEXT_ALIGN_DIV, P005F7_n512TBM32_TEXT_ALIGN_DIV, P005F7_A516TBM32_TEXT_MAXROWS, P005F7_n516TBM32_TEXT_MAXROWS, P005F7_A517TBM32_TEXT_MAXLENGTH,
            P005F7_n517TBM32_TEXT_MAXLENGTH, P005F7_A518TBM32_DECIMAL_DIGITS, P005F7_n518TBM32_DECIMAL_DIGITS, P005F7_A522TBM32_CHK_TRUE_INNER_VALUE, P005F7_n522TBM32_CHK_TRUE_INNER_VALUE, P005F7_A523TBM32_CHK_FALSE_INNER_VALUE, P005F7_n523TBM32_CHK_FALSE_INNER_VALUE, P005F7_A524TBM32_TEXT, P005F7_n524TBM32_TEXT, P005F7_A513TBM32_FONT_SIZE,
            P005F7_n513TBM32_FONT_SIZE, P005F7_A514TBM32_FONT_UL_FLG, P005F7_n514TBM32_FONT_UL_FLG, P005F7_A515TBM32_FONT_COLOR_DIV, P005F7_n515TBM32_FONT_COLOR_DIV, P005F7_A521TBM32_LINE_SIZE_DIV, P005F7_n521TBM32_LINE_SIZE_DIV, P005F7_A689TBM32_LINE_COLOR_DIV, P005F7_n689TBM32_LINE_COLOR_DIV, P005F7_A519TBM32_LINE_START_POINT_DIV,
            P005F7_n519TBM32_LINE_START_POINT_DIV, P005F7_A520TBM32_LINE_END_POINT_DIV, P005F7_n520TBM32_LINE_END_POINT_DIV, P005F7_A690TBM32_LINE_ANGLE, P005F7_n690TBM32_LINE_ANGLE, P005F7_A645TBM32_ZORDER, P005F7_n645TBM32_ZORDER, P005F7_A691TBM32_TAB_ORDER, P005F7_n691TBM32_TAB_ORDER, P005F7_A692TBM32_TABSTOP_FLG,
            P005F7_n692TBM32_TABSTOP_FLG, P005F7_A774TBM32_REF_CRF_ID, P005F7_n774TBM32_REF_CRF_ID, P005F7_A775TBM32_REF_CRF_ITEM_CD, P005F7_n775TBM32_REF_CRF_ITEM_CD, P005F7_A527TBM32_FIXED_VALUE, P005F7_n527TBM32_FIXED_VALUE, P005F7_A525TBM32_LIST_CD, P005F7_n525TBM32_LIST_CD, P005F7_A693TBM32_REQUIRED_INPUT_FLG,
            P005F7_n693TBM32_REQUIRED_INPUT_FLG
            }
            , new Object[] {
            P005F8_A31TBM35_STUDY_ID, P005F8_A32TBM35_CRF_ID, P005F8_A581TBM35_DEL_FLG, P005F8_n581TBM35_DEL_FLG, P005F8_A33TBM35_CRF_ITEM_CD, P005F8_A580TBM35_DISPLAY_FLG, P005F8_n580TBM35_DISPLAY_FLG, P005F8_A34TBM35_STUDY_AUTH_CD
            }
            , new Object[] {
            P005F9_A457TBT11_DEL_FLG, P005F9_n457TBT11_DEL_FLG, P005F9_A669TBT11_DM_ARRIVAL_FLG, P005F9_n669TBT11_DM_ARRIVAL_FLG, P005F9_A936TBT11_CRF_EDA_NO, P005F9_A94TBT11_CRF_ID, P005F9_A93TBT11_SUBJECT_ID, P005F9_A92TBT11_STUDY_ID, P005F9_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            P005F10_A433TBM37_DEL_FLG, P005F10_n433TBM37_DEL_FLG, P005F10_A500TBM37_DOM_VAR_NM, P005F10_n500TBM37_DOM_VAR_NM, P005F10_A84TBM37_DOM_CD, P005F10_n84TBM37_DOM_CD, P005F10_A79TBM37_STUDY_ID, P005F10_A82TBM37_CRF_ITEM_GRP_CD, P005F10_A80TBM37_CRF_ID, P005F10_A81TBM37_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P005F11_A563TBM26_DEL_FLG, P005F11_n563TBM26_DEL_FLG, P005F11_A27TBM26_LIST_ITEM_NO, P005F11_A26TBM26_LIST_CD, P005F11_A25TBM26_STUDY_ID, P005F11_A561TBM26_LIST_ITEM_NAME, P005F11_n561TBM26_LIST_ITEM_NAME, P005F11_A562TBM26_INNER_VALUE, P005F11_n562TBM26_INNER_VALUE
            }
            , new Object[] {
            P005F12_A902TBT14_KANRYO_FLG, P005F12_n902TBT14_KANRYO_FLG, P005F12_A479TBT14_DEL_FLG, P005F12_n479TBT14_DEL_FLG, P005F12_A488TBT15_DEL_FLG, P005F12_n488TBT15_DEL_FLG, P005F12_A904TBT15_CRF_ITEM_GRP_CD, P005F12_n904TBT15_CRF_ITEM_GRP_CD, P005F12_A942TBT15_CRF_EDA_NO, P005F12_n942TBT15_CRF_EDA_NO,
            P005F12_A155TBT15_CRF_ID, P005F12_n155TBT15_CRF_ID, P005F12_A151TBT15_SUBJECT_ID, P005F12_A149TBT15_STUDY_ID, P005F12_A199TBT15_MEMO_NO
            }
            , new Object[] {
            P005F13_A198TBT14_MEMO_NO, P005F13_A142TBT14_SUBJECT_ID, P005F13_A140TBT14_STUDY_ID, P005F13_A931TBT14_CRT_AUTH_CD, P005F13_n931TBT14_CRT_AUTH_CD, P005F13_A481TBT14_CRT_USER_ID, P005F13_n481TBT14_CRT_USER_ID, P005F13_A901TBT14_MEMO_KBN, P005F13_n901TBT14_MEMO_KBN, P005F13_A930TBT14_REQUEST_AUTH_CD,
            P005F13_n930TBT14_REQUEST_AUTH_CD, P005F13_A929TBT14_REQUEST_SITE_ID, P005F13_n929TBT14_REQUEST_SITE_ID, P005F13_A927TBT14_KAKUNIN_FLG, P005F13_n927TBT14_KAKUNIN_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV121Pgmname = "AB702_PC01_GET_CRF_DESIGN" ;
      /* GeneXus formulas. */
      AV121Pgmname = "AB702_PC01_GET_CRF_DESIGN" ;
      Gx_err = (short)(0) ;
   }

   private byte AV89P_CRF_EDA_NO ;
   private byte A687TAM04_AUTH_LVL ;
   private byte AV93GXLvl100 ;
   private byte AV76W_TAM04_AUTH_LVL ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte A665TBT11_CRF_INPUT_LEVEL ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private byte AV95GXLvl206 ;
   private byte A937TBT12_CRF_EDA_NO ;
   private byte AV97GXLvl260 ;
   private byte A938TBT13_CRF_EDA_NO ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte AV106GXLvl954 ;
   private byte A942TBT15_CRF_EDA_NO ;
   private byte GXv_int2[] ;
   private short gxcookieaux ;
   private short AV21P_CRF_LATEST_VERSION ;
   private short AV19P_CRF_ID ;
   private short AV14C_PAGE_CHOSEI ;
   private short AV15C_PAGE_LOCATION_X_MAX ;
   private short AV16C_PAGE_LOCATION_Y_MAX ;
   private short AV17C_PAGE_LOCATION_Y2_MAX ;
   private short Gx_err ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short A98TBT12_CRF_ID ;
   private short A103TBT13_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private short AV77W_TBM31_GRID_SIZE ;
   private short GXv_int1[] ;
   private short AV42W_CNT ;
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
   private short A32TBM35_CRF_ID ;
   private short AV81W_TBM32_REF_CRF_ID ;
   private short AV83W_TBT11_CRF_VERSION_MIN ;
   private short AV46W_DISP_CRF_VERSION ;
   private short A80TBM37_CRF_ID ;
   private short A27TBM26_LIST_ITEM_NO ;
   private short A155TBT15_CRF_ID ;
   private short A199TBT15_MEMO_NO ;
   private short A198TBT14_MEMO_NO ;
   private short AV59W_LEN ;
   private short AV74W_TAB_ORDER ;
   private short AV11C_DM_INPUT_LEVEL ;
   private int AV24P_SUBJECT_ID ;
   private int A93TBT11_SUBJECT_ID ;
   private int AV94GXV1 ;
   private int A90TBT02_SUBJECT_ID ;
   private int A97TBT12_SUBJECT_ID ;
   private int A102TBT13_SUBJECT_ID ;
   private int AV101GXV2 ;
   private int AV102GXV3 ;
   private int AV104GXV4 ;
   private int AV107GXV5 ;
   private int A151TBT15_SUBJECT_ID ;
   private int A142TBT14_SUBJECT_ID ;
   private int AV110GXV6 ;
   private int AV111GXV7 ;
   private int AV112GXV8 ;
   private int AV113GXV9 ;
   private int AV114GXV10 ;
   private int AV115GXV11 ;
   private int AV116GXV12 ;
   private int AV117GXV13 ;
   private int AV118GXV14 ;
   private int AV119GXV15 ;
   private int AV120GXV16 ;
   private int GXActiveErrHndl ;
   private long AV23P_STUDY_ID ;
   private long AV9C_COLOR_WHITE ;
   private long A92TBT11_STUDY_ID ;
   private long A464TBT11_UPD_CNT ;
   private long A89TBT02_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private long A96TBT12_STUDY_ID ;
   private long A101TBT13_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long A31TBM35_STUDY_ID ;
   private long AV55W_HEIGHT ;
   private long A79TBM37_STUDY_ID ;
   private long A25TBM26_STUDY_ID ;
   private long A149TBT15_STUDY_ID ;
   private long A140TBT14_STUDY_ID ;
   private long AV53W_GRP_X ;
   private long AV54W_GRP_Y ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXt_char3 ;
   private String GXv_char11[] ;
   private String AV121Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A461TBT11_UPD_DATETIME ;
   private java.util.Date A652TBT02_UPLOAD_DATETIME ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A453TBT02_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n687TAM04_AUTH_LVL ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n652TBT02_UPLOAD_DATETIME ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n453TBT02_UPD_DATETIME ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean n473TBT12_DEL_FLG ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n679TBT12_EDIT_FLG ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean n665TBT11_CRF_INPUT_LEVEL ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n675TBT11_INPUT_END_FLG ;
   private boolean n461TBT11_UPD_DATETIME ;
   private boolean n464TBT11_UPD_CNT ;
   private boolean n598TBT13_DEL_FLG ;
   private boolean n597TBT13_CRF_VALUE ;
   private boolean n680TBT13_EDIT_FLG ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n526TBM32_IMAGE_CD ;
   private boolean n405TBM32_CRF_ITEM_NM ;
   private boolean n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n644TBM32_AUTH_LVL_MIN ;
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
   private boolean n524TBM32_TEXT ;
   private boolean n513TBM32_FONT_SIZE ;
   private boolean n514TBM32_FONT_UL_FLG ;
   private boolean n515TBM32_FONT_COLOR_DIV ;
   private boolean n521TBM32_LINE_SIZE_DIV ;
   private boolean n689TBM32_LINE_COLOR_DIV ;
   private boolean n519TBM32_LINE_START_POINT_DIV ;
   private boolean n520TBM32_LINE_END_POINT_DIV ;
   private boolean n690TBM32_LINE_ANGLE ;
   private boolean n645TBM32_ZORDER ;
   private boolean n691TBM32_TAB_ORDER ;
   private boolean n692TBM32_TABSTOP_FLG ;
   private boolean n774TBM32_REF_CRF_ID ;
   private boolean n775TBM32_REF_CRF_ITEM_CD ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean n581TBM35_DEL_FLG ;
   private boolean n580TBM35_DISPLAY_FLG ;
   private boolean n433TBM37_DEL_FLG ;
   private boolean n500TBM37_DOM_VAR_NM ;
   private boolean n84TBM37_DOM_CD ;
   private boolean n563TBM26_DEL_FLG ;
   private boolean n561TBM26_LIST_ITEM_NAME ;
   private boolean n562TBM26_INNER_VALUE ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n488TBT15_DEL_FLG ;
   private boolean n904TBT15_CRF_ITEM_GRP_CD ;
   private boolean n942TBT15_CRF_EDA_NO ;
   private boolean n155TBT15_CRF_ID ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n481TBT14_CRT_USER_ID ;
   private boolean n901TBT14_MEMO_KBN ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private String AV90P_CRF_ID_EDA_NO ;
   private String AV22P_INIT_FLG ;
   private String AV49W_ERR_FLG ;
   private String AV50W_ERR_MSG ;
   private String AV13C_HOJOSYA_AUTH_CD ;
   private String AV8C_ALL_AUTH_CD ;
   private String AV67W_RIREKI_URL ;
   private String AV72W_SESSION_KEY ;
   private String A13TAM04_AUTH_CD ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A675TBT11_INPUT_END_FLG ;
   private String AV68W_RTN_CD ;
   private String AV63W_MSG ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A449TBT02_DEL_FLG ;
   private String A473TBT12_DEL_FLG ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A465TBT12_CRF_VALUE ;
   private String A679TBT12_EDIT_FLG ;
   private String A457TBT11_DEL_FLG ;
   private String A598TBT13_DEL_FLG ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A597TBT13_CRF_VALUE ;
   private String A680TBT13_EDIT_FLG ;
   private String AV62W_MODE_KBN ;
   private String AV61W_MEMO_INPU_FLG ;
   private String AV44W_CRF_KANRI_FLG ;
   private String AV58W_INP_FLG ;
   private String AV10C_DM_AUTH_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A526TBM32_IMAGE_CD ;
   private String A405TBM32_CRF_ITEM_NM ;
   private String A512TBM32_TEXT_ALIGN_DIV ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A523TBM32_CHK_FALSE_INNER_VALUE ;
   private String A524TBM32_TEXT ;
   private String A514TBM32_FONT_UL_FLG ;
   private String A519TBM32_LINE_START_POINT_DIV ;
   private String A520TBM32_LINE_END_POINT_DIV ;
   private String A692TBM32_TABSTOP_FLG ;
   private String A775TBM32_REF_CRF_ITEM_CD ;
   private String A527TBM32_FIXED_VALUE ;
   private String A525TBM32_LIST_CD ;
   private String A693TBM32_REQUIRED_INPUT_FLG ;
   private String AV47W_DISP_FLG ;
   private String AV84W_TBT13_EDIT_FLG ;
   private String AV57W_IMAGE_URL ;
   private String AV88W_TBM35_CRF_ITEM_CD ;
   private String A581TBM35_DEL_FLG ;
   private String A33TBM35_CRF_ITEM_CD ;
   private String A580TBM35_DISPLAY_FLG ;
   private String A34TBM35_STUDY_AUTH_CD ;
   private String AV82W_TBM32_REF_CRF_ITEM_CD ;
   private String AV80W_TBM32_LIST_CD ;
   private String AV60W_MARK_FLG ;
   private String AV37W_2PAGE_FLG ;
   private String A433TBM37_DEL_FLG ;
   private String A500TBM37_DOM_VAR_NM ;
   private String A84TBM37_DOM_CD ;
   private String A82TBM37_CRF_ITEM_GRP_CD ;
   private String A81TBM37_CRF_ITEM_GRP_DIV ;
   private String A561TBM26_LIST_ITEM_NAME ;
   private String A562TBM26_INNER_VALUE ;
   private String A563TBM26_DEL_FLG ;
   private String A26TBM26_LIST_CD ;
   private String AV45W_CRF_VALUE ;
   private String A902TBT14_KANRYO_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String A488TBT15_DEL_FLG ;
   private String A904TBT15_CRF_ITEM_GRP_CD ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String A481TBT14_CRT_USER_ID ;
   private String A901TBT14_MEMO_KBN ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A929TBT14_REQUEST_SITE_ID ;
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
   private String[] P005F2_A13TAM04_AUTH_CD ;
   private byte[] P005F2_A687TAM04_AUTH_LVL ;
   private boolean[] P005F2_n687TAM04_AUTH_LVL ;
   private byte[] P005F3_A935TBT02_CRF_EDA_NO ;
   private short[] P005F3_A91TBT02_CRF_ID ;
   private int[] P005F3_A90TBT02_SUBJECT_ID ;
   private long[] P005F3_A89TBT02_STUDY_ID ;
   private String[] P005F3_A449TBT02_DEL_FLG ;
   private boolean[] P005F3_n449TBT02_DEL_FLG ;
   private short[] P005F3_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] P005F3_n498TBT02_CRF_LATEST_VERSION ;
   private java.util.Date[] P005F3_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] P005F3_n652TBT02_UPLOAD_DATETIME ;
   private byte[] P005F3_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P005F3_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] P005F3_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P005F3_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005F3_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P005F3_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P005F3_A661TBT02_INPUT_END_FLG ;
   private boolean[] P005F3_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] P005F3_A453TBT02_UPD_DATETIME ;
   private boolean[] P005F3_n453TBT02_UPD_DATETIME ;
   private long[] P005F3_A456TBT02_UPD_CNT ;
   private boolean[] P005F3_n456TBT02_UPD_CNT ;
   private long[] P005F4_A96TBT12_STUDY_ID ;
   private int[] P005F4_A97TBT12_SUBJECT_ID ;
   private short[] P005F4_A98TBT12_CRF_ID ;
   private byte[] P005F4_A937TBT12_CRF_EDA_NO ;
   private String[] P005F4_A473TBT12_DEL_FLG ;
   private boolean[] P005F4_n473TBT12_DEL_FLG ;
   private String[] P005F4_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P005F4_A100TBT12_CRF_ITEM_GRP_CD ;
   private String[] P005F4_A465TBT12_CRF_VALUE ;
   private boolean[] P005F4_n465TBT12_CRF_VALUE ;
   private String[] P005F4_A679TBT12_EDIT_FLG ;
   private boolean[] P005F4_n679TBT12_EDIT_FLG ;
   private short[] P005F5_A95TBT11_CRF_VERSION ;
   private byte[] P005F5_A936TBT11_CRF_EDA_NO ;
   private short[] P005F5_A94TBT11_CRF_ID ;
   private int[] P005F5_A93TBT11_SUBJECT_ID ;
   private long[] P005F5_A92TBT11_STUDY_ID ;
   private String[] P005F5_A457TBT11_DEL_FLG ;
   private boolean[] P005F5_n457TBT11_DEL_FLG ;
   private java.util.Date[] P005F5_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] P005F5_n666TBT11_UPLOAD_DATETIME ;
   private byte[] P005F5_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] P005F5_n665TBT11_CRF_INPUT_LEVEL ;
   private String[] P005F5_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P005F5_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005F5_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] P005F5_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] P005F5_A675TBT11_INPUT_END_FLG ;
   private boolean[] P005F5_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] P005F5_A461TBT11_UPD_DATETIME ;
   private boolean[] P005F5_n461TBT11_UPD_DATETIME ;
   private long[] P005F5_A464TBT11_UPD_CNT ;
   private boolean[] P005F5_n464TBT11_UPD_CNT ;
   private long[] P005F6_A101TBT13_STUDY_ID ;
   private int[] P005F6_A102TBT13_SUBJECT_ID ;
   private short[] P005F6_A103TBT13_CRF_ID ;
   private byte[] P005F6_A938TBT13_CRF_EDA_NO ;
   private short[] P005F6_A104TBT13_CRF_VERSION ;
   private String[] P005F6_A598TBT13_DEL_FLG ;
   private boolean[] P005F6_n598TBT13_DEL_FLG ;
   private String[] P005F6_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] P005F6_A106TBT13_CRF_ITEM_GRP_CD ;
   private String[] P005F6_A597TBT13_CRF_VALUE ;
   private boolean[] P005F6_n597TBT13_CRF_VALUE ;
   private String[] P005F6_A680TBT13_EDIT_FLG ;
   private boolean[] P005F6_n680TBT13_EDIT_FLG ;
   private short[] P005F7_A71TBM32_CRF_ID ;
   private long[] P005F7_A70TBM32_STUDY_ID ;
   private String[] P005F7_A75TBM32_DEL_FLG ;
   private boolean[] P005F7_n75TBM32_DEL_FLG ;
   private String[] P005F7_A72TBM32_CRF_ITEM_CD ;
   private String[] P005F7_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005F7_n73TBM32_CRF_ITEM_GRP_CD ;
   private String[] P005F7_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P005F7_n74TBM32_CRF_ITEM_DIV ;
   private String[] P005F7_A526TBM32_IMAGE_CD ;
   private boolean[] P005F7_n526TBM32_IMAGE_CD ;
   private String[] P005F7_A405TBM32_CRF_ITEM_NM ;
   private boolean[] P005F7_n405TBM32_CRF_ITEM_NM ;
   private short[] P005F7_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P005F7_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private byte[] P005F7_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] P005F7_n644TBM32_AUTH_LVL_MIN ;
   private short[] P005F7_A508TBM32_LOCATION_X ;
   private boolean[] P005F7_n508TBM32_LOCATION_X ;
   private short[] P005F7_A509TBM32_LOCATION_Y ;
   private boolean[] P005F7_n509TBM32_LOCATION_Y ;
   private short[] P005F7_A510TBM32_LOCATION_X2 ;
   private boolean[] P005F7_n510TBM32_LOCATION_X2 ;
   private short[] P005F7_A511TBM32_LOCATION_Y2 ;
   private boolean[] P005F7_n511TBM32_LOCATION_Y2 ;
   private String[] P005F7_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P005F7_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] P005F7_A516TBM32_TEXT_MAXROWS ;
   private boolean[] P005F7_n516TBM32_TEXT_MAXROWS ;
   private short[] P005F7_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] P005F7_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] P005F7_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] P005F7_n518TBM32_DECIMAL_DIGITS ;
   private String[] P005F7_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P005F7_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P005F7_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] P005F7_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] P005F7_A524TBM32_TEXT ;
   private boolean[] P005F7_n524TBM32_TEXT ;
   private byte[] P005F7_A513TBM32_FONT_SIZE ;
   private boolean[] P005F7_n513TBM32_FONT_SIZE ;
   private String[] P005F7_A514TBM32_FONT_UL_FLG ;
   private boolean[] P005F7_n514TBM32_FONT_UL_FLG ;
   private long[] P005F7_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] P005F7_n515TBM32_FONT_COLOR_DIV ;
   private byte[] P005F7_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] P005F7_n521TBM32_LINE_SIZE_DIV ;
   private long[] P005F7_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] P005F7_n689TBM32_LINE_COLOR_DIV ;
   private String[] P005F7_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] P005F7_n519TBM32_LINE_START_POINT_DIV ;
   private String[] P005F7_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] P005F7_n520TBM32_LINE_END_POINT_DIV ;
   private short[] P005F7_A690TBM32_LINE_ANGLE ;
   private boolean[] P005F7_n690TBM32_LINE_ANGLE ;
   private short[] P005F7_A645TBM32_ZORDER ;
   private boolean[] P005F7_n645TBM32_ZORDER ;
   private short[] P005F7_A691TBM32_TAB_ORDER ;
   private boolean[] P005F7_n691TBM32_TAB_ORDER ;
   private String[] P005F7_A692TBM32_TABSTOP_FLG ;
   private boolean[] P005F7_n692TBM32_TABSTOP_FLG ;
   private short[] P005F7_A774TBM32_REF_CRF_ID ;
   private boolean[] P005F7_n774TBM32_REF_CRF_ID ;
   private String[] P005F7_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P005F7_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] P005F7_A527TBM32_FIXED_VALUE ;
   private boolean[] P005F7_n527TBM32_FIXED_VALUE ;
   private String[] P005F7_A525TBM32_LIST_CD ;
   private boolean[] P005F7_n525TBM32_LIST_CD ;
   private String[] P005F7_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P005F7_n693TBM32_REQUIRED_INPUT_FLG ;
   private long[] P005F8_A31TBM35_STUDY_ID ;
   private short[] P005F8_A32TBM35_CRF_ID ;
   private String[] P005F8_A581TBM35_DEL_FLG ;
   private boolean[] P005F8_n581TBM35_DEL_FLG ;
   private String[] P005F8_A33TBM35_CRF_ITEM_CD ;
   private String[] P005F8_A580TBM35_DISPLAY_FLG ;
   private boolean[] P005F8_n580TBM35_DISPLAY_FLG ;
   private String[] P005F8_A34TBM35_STUDY_AUTH_CD ;
   private String[] P005F9_A457TBT11_DEL_FLG ;
   private boolean[] P005F9_n457TBT11_DEL_FLG ;
   private String[] P005F9_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P005F9_n669TBT11_DM_ARRIVAL_FLG ;
   private byte[] P005F9_A936TBT11_CRF_EDA_NO ;
   private short[] P005F9_A94TBT11_CRF_ID ;
   private int[] P005F9_A93TBT11_SUBJECT_ID ;
   private long[] P005F9_A92TBT11_STUDY_ID ;
   private short[] P005F9_A95TBT11_CRF_VERSION ;
   private String[] P005F10_A433TBM37_DEL_FLG ;
   private boolean[] P005F10_n433TBM37_DEL_FLG ;
   private String[] P005F10_A500TBM37_DOM_VAR_NM ;
   private boolean[] P005F10_n500TBM37_DOM_VAR_NM ;
   private String[] P005F10_A84TBM37_DOM_CD ;
   private boolean[] P005F10_n84TBM37_DOM_CD ;
   private long[] P005F10_A79TBM37_STUDY_ID ;
   private String[] P005F10_A82TBM37_CRF_ITEM_GRP_CD ;
   private short[] P005F10_A80TBM37_CRF_ID ;
   private String[] P005F10_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] P005F11_A563TBM26_DEL_FLG ;
   private boolean[] P005F11_n563TBM26_DEL_FLG ;
   private short[] P005F11_A27TBM26_LIST_ITEM_NO ;
   private String[] P005F11_A26TBM26_LIST_CD ;
   private long[] P005F11_A25TBM26_STUDY_ID ;
   private String[] P005F11_A561TBM26_LIST_ITEM_NAME ;
   private boolean[] P005F11_n561TBM26_LIST_ITEM_NAME ;
   private String[] P005F11_A562TBM26_INNER_VALUE ;
   private boolean[] P005F11_n562TBM26_INNER_VALUE ;
   private String[] P005F12_A902TBT14_KANRYO_FLG ;
   private boolean[] P005F12_n902TBT14_KANRYO_FLG ;
   private String[] P005F12_A479TBT14_DEL_FLG ;
   private boolean[] P005F12_n479TBT14_DEL_FLG ;
   private String[] P005F12_A488TBT15_DEL_FLG ;
   private boolean[] P005F12_n488TBT15_DEL_FLG ;
   private String[] P005F12_A904TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] P005F12_n904TBT15_CRF_ITEM_GRP_CD ;
   private byte[] P005F12_A942TBT15_CRF_EDA_NO ;
   private boolean[] P005F12_n942TBT15_CRF_EDA_NO ;
   private short[] P005F12_A155TBT15_CRF_ID ;
   private boolean[] P005F12_n155TBT15_CRF_ID ;
   private int[] P005F12_A151TBT15_SUBJECT_ID ;
   private long[] P005F12_A149TBT15_STUDY_ID ;
   private short[] P005F12_A199TBT15_MEMO_NO ;
   private short[] P005F13_A198TBT14_MEMO_NO ;
   private int[] P005F13_A142TBT14_SUBJECT_ID ;
   private long[] P005F13_A140TBT14_STUDY_ID ;
   private String[] P005F13_A931TBT14_CRT_AUTH_CD ;
   private boolean[] P005F13_n931TBT14_CRT_AUTH_CD ;
   private String[] P005F13_A481TBT14_CRT_USER_ID ;
   private boolean[] P005F13_n481TBT14_CRT_USER_ID ;
   private String[] P005F13_A901TBT14_MEMO_KBN ;
   private boolean[] P005F13_n901TBT14_MEMO_KBN ;
   private String[] P005F13_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] P005F13_n930TBT14_REQUEST_AUTH_CD ;
   private String[] P005F13_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] P005F13_n929TBT14_REQUEST_SITE_ID ;
   private String[] P005F13_A927TBT14_KAKUNIN_FLG ;
   private boolean[] P005F13_n927TBT14_KAKUNIN_FLG ;
   private com.genexus.internet.HttpResponse AV18HttpResponse ;
   private com.genexus.webpanels.WebSession AV71W_SESSION ;
   private GxObjectCollection AV31SD_B702_SD05_DOMAIN_INFO ;
   private GxObjectCollection GXv_objcol_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem12[] ;
   private GxObjectCollection AV29SD_B702_SD04_MARK_DISP ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem AV26SD_B702_SD02_CRF_ITEM_DESIGN_I ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem GXv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem13[] ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem AV27SD_B702_SD02_CRF_ITEM_MARK_I ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem AV39W_B702_SD02_CRF_ITEM_DESIGN_I ;
   private SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem AV28SD_B702_SD03_SEL_LIST_ITEM_I ;
   private SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem AV30SD_B702_SD04_MARK_DISP_I ;
   private SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem AV32SD_B702_SD05_DOMAIN_INFO_I ;
   private SdtB792_SD01_CRF GXv_SdtB792_SD01_CRF5[] ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV35SD_B792_SD02_CRF_RESULT_I ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT14[] ;
}

final  class ab702_pc01_get_crf_design__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005F2", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_LVL` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F3", "SELECT `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_DEL_FLG`, `TBT02_CRF_LATEST_VERSION`, `TBT02_UPLOAD_DATETIME`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_INPUT_END_FLG`, `TBT02_UPD_DATETIME`, `TBT02_UPD_CNT` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F4", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_DEL_FLG`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? and `TBT12_CRF_EDA_NO` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P005F5", "SELECT `TBT11_CRF_VERSION`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_DEL_FLG`, `TBT11_UPLOAD_DATETIME`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_INPUT_END_FLG`, `TBT11_UPD_DATETIME`, `TBT11_UPD_CNT` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_EDA_NO` = ? and `TBT11_CRF_VERSION` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F6", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_DEL_FLG`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG` FROM `TBT13_CRF_RES_HIS` WHERE (`TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_VERSION` = ?) AND (`TBT13_DEL_FLG` = '0') ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P005F7", "SELECT `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_DIV`, `TBM32_IMAGE_CD`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_AUTH_LVL_MIN`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_REQUIRED_INPUT_FLG` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P005F8", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_DEL_FLG`, `TBM35_CRF_ITEM_CD`, `TBM35_DISPLAY_FLG`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE (`TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ? and `TBM35_CRF_ITEM_CD` = ?) AND (`TBM35_DEL_FLG` = '0') ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F9", "SELECT `TBT11_DEL_FLG`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_EDA_NO` = ?) AND (`TBT11_DM_ARRIVAL_FLG` = '1') AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F10", "SELECT `TBM37_DEL_FLG`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_CD`, `TBM37_STUDY_ID`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV` FROM `TBM37_CRF_DOM_MAP` WHERE (`TBM37_STUDY_ID` = ?) AND (`TBM37_DOM_CD` = 'DM') AND (`TBM37_DOM_VAR_NM` = ?) AND (`TBM37_DEL_FLG` = '0') ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005F11", "SELECT `TBM26_DEL_FLG`, `TBM26_LIST_ITEM_NO`, `TBM26_LIST_CD`, `TBM26_STUDY_ID`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE` FROM `TBM26_SEL_LIST_ITEM` WHERE (`TBM26_STUDY_ID` = ? and `TBM26_LIST_CD` = ? and `TBM26_LIST_ITEM_NO` > 0) AND (`TBM26_DEL_FLG` = '0') ORDER BY `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P005F12", "SELECT T2.`TBT14_KANRYO_FLG`, T2.`TBT14_DEL_FLG`, T1.`TBT15_DEL_FLG`, T1.`TBT15_CRF_ITEM_GRP_CD`, T1.`TBT15_CRF_EDA_NO`, T1.`TBT15_CRF_ID`, T1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, T1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, T1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM (`TBT15_CRF_MEMO_LOC` T1 INNER JOIN `TBT14_CRF_MEMO` T2 ON T2.`TBT14_STUDY_ID` = T1.`TBT15_STUDY_ID` AND T2.`TBT14_SUBJECT_ID` = T1.`TBT15_SUBJECT_ID` AND T2.`TBT14_MEMO_NO` = T1.`TBT15_MEMO_NO`) WHERE (T1.`TBT15_STUDY_ID` = ? and T1.`TBT15_SUBJECT_ID` = ?) AND (T1.`TBT15_DEL_FLG` <> '1') AND (T2.`TBT14_DEL_FLG` <> '1') AND (T2.`TBT14_KANRYO_FLG` <> '1') AND (T1.`TBT15_CRF_ID` = ?) AND (T1.`TBT15_CRF_EDA_NO` = ?) AND (T1.`TBT15_CRF_ITEM_GRP_CD` = ?) ORDER BY T1.`TBT15_STUDY_ID`, T1.`TBT15_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
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
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3) ;
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((short[]) buf[8])[0] = rslt.getShort(7) ;
               return;
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
               return;
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
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7) ;
               ((long[]) buf[13])[0] = rslt.getLong(8) ;
               ((short[]) buf[14])[0] = rslt.getShort(9) ;
               return;
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
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 50);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 50);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

