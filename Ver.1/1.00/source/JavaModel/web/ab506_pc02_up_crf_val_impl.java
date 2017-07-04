/*
               File: ab506_pc02_up_crf_val_impl
        Description: CRF入力データアップロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:19.50
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab506_pc02_up_crf_val_impl extends GXWebProcedure
{
   public ab506_pc02_up_crf_val_impl( com.genexus.internet.HttpContext context )
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
      AV36C_APP_ID = "B506" ;
      AV27W_ERR_CD = (short)(0) ;
      AV28W_ERR_MSG = "" ;
      GXt_char1 = AV32W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32W_NEWLINE = GXt_char1 ;
      AV37W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV37W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV36C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_EXTRA_INFO", AV37W_EXTRA_INFO);
      /* Execute user subroutine: S16240 */
      S16240 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S17290 */
      S17290 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV42Pgmname, "INFO", AV43Pgmdesc) ;
      if ( AV27W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1163 */
         S1163 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV27W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S12110 */
         S12110 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV27W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S13139 */
         S13139 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV27W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S15201 */
         S15201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV27W_ERR_CD, 10, 0))+AV32W_NEWLINE);
      AV30W_HTTP_RES.addString(AV28W_ERR_MSG);
      /* Execute user subroutine: S18306 */
      S18306 ();
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

   public void S1163( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      if ( AV27W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV21P_STUDY_ID)==0) )
         {
            AV27W_ERR_CD = (short)(1) ;
            GXt_char1 = AV28W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "試験ID", "", "", "", "", GXv_char2) ;
            ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV27W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV9P_AUTH_CD)==0) )
         {
            AV27W_ERR_CD = (short)(1) ;
            GXt_char1 = AV28W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "権限コード", "", "", "", "", GXv_char2) ;
            ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV27W_ERR_CD == 0 )
      {
         AV39W_STUDY_ID = GXutil.lval( AV21P_STUDY_ID) ;
         AV44GXLvl84 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM23_STUDY_STAFF" ;
         /* Using cursor P00312 */
         pr_default.execute(0, new Object[] {new Long(AV39W_STUDY_ID), AV22P_USER_ID, AV9P_AUTH_CD});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A209TBM23_DEL_FLG = P00312_A209TBM23_DEL_FLG[0] ;
            n209TBM23_DEL_FLG = P00312_n209TBM23_DEL_FLG[0] ;
            A407TBM23_STYDY_AUTH_CD = P00312_A407TBM23_STYDY_AUTH_CD[0] ;
            A208TBM23_USER_ID = P00312_A208TBM23_USER_ID[0] ;
            A207TBM23_STUDY_ID = P00312_A207TBM23_STUDY_ID[0] ;
            AV44GXLvl84 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV44GXLvl84 == 0 )
         {
            AV27W_ERR_CD = (short)(1) ;
            AV45GXLvl94 = (byte)(0) ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TAM04_KNGN" ;
            /* Using cursor P00313 */
            pr_default.execute(1, new Object[] {AV9P_AUTH_CD});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A18TAM04_DEL_FLG = P00313_A18TAM04_DEL_FLG[0] ;
               n18TAM04_DEL_FLG = P00313_n18TAM04_DEL_FLG[0] ;
               A17TAM04_AUTH_CD = P00313_A17TAM04_AUTH_CD[0] ;
               A98TAM04_AUTH_NM = P00313_A98TAM04_AUTH_NM[0] ;
               n98TAM04_AUTH_NM = P00313_n98TAM04_AUTH_NM[0] ;
               AV45GXLvl94 = (byte)(1) ;
               GXt_char1 = AV28W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00056", A98TAM04_AUTH_NM, "", "", "", "", GXv_char2) ;
               ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
               AV28W_ERR_MSG = GXt_char1 ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV45GXLvl94 == 0 )
            {
               GXt_char1 = AV28W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "権限", "", "", "", "", GXv_char2) ;
               ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
               AV28W_ERR_MSG = GXt_char1 ;
            }
         }
      }
   }

   public void S12110( )
   {
      /* 'SUB_REG_WORK' Routine */
      GXt_char1 = AV26W_DISP_DATETIME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26W_DISP_DATETIME = GXt_char1 ;
      if ( ( AV27W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV12P_CRF_RECORD)==0) )
      {
         GXv_int3[0] = AV27W_ERR_CD ;
         GXv_char2[0] = AV28W_ERR_MSG ;
         new b506_pc04_crf_reg(remoteHandle, context).execute( AV12P_CRF_RECORD, AV35W_SESSION.getId(), AV36C_APP_ID, AV26W_DISP_DATETIME, GXv_int3, GXv_char2) ;
         ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
         ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char2[0] ;
      }
      if ( ( AV27W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV13P_CRF_VAL)==0) )
      {
         GXv_int3[0] = AV27W_ERR_CD ;
         GXv_char2[0] = AV28W_ERR_MSG ;
         new b506_pc05_crf_result_reg(remoteHandle, context).execute( AV13P_CRF_VAL, AV35W_SESSION.getId(), AV36C_APP_ID, AV26W_DISP_DATETIME, GXv_int3, GXv_char2) ;
         ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
         ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char2[0] ;
      }
      if ( ( AV27W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV10P_CRF_MEMO)==0) )
      {
         GXv_int3[0] = AV27W_ERR_CD ;
         GXv_char2[0] = AV28W_ERR_MSG ;
         new b506_pc06_crf_memo_reg(remoteHandle, context).execute( AV10P_CRF_MEMO, AV35W_SESSION.getId(), AV36C_APP_ID, AV26W_DISP_DATETIME, GXv_int3, GXv_char2) ;
         ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
         ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char2[0] ;
      }
      if ( ( AV27W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV11P_CRF_MEMO_LOC)==0) )
      {
         GXv_int3[0] = AV27W_ERR_CD ;
         GXv_char2[0] = AV28W_ERR_MSG ;
         new b506_pc07_crf_memo_loc_reg(remoteHandle, context).execute( AV11P_CRF_MEMO_LOC, AV35W_SESSION.getId(), AV36C_APP_ID, AV26W_DISP_DATETIME, GXv_int3, GXv_char2) ;
         ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
         ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char2[0] ;
      }
   }

   public void S13139( )
   {
      /* 'SUB_UP_CRF_VAL' Routine */
      AV20P_SESSION_ID = AV35W_SESSION.getId() ;
      AV8P_APP_ID = AV36C_APP_ID ;
      AV14P_DISP_DATETIME = AV26W_DISP_DATETIME ;
      AV18P_EXEC_USER_ID = AV22P_USER_ID ;
      AV17P_EXEC_AUTH_CD = AV9P_AUTH_CD ;
      AV15P_ERR_CD = (byte)(0) ;
      AV16P_ERR_VAL = "" ;
      /* Using cursor P00314 */
      pr_default.execute(2, new Object[] {AV20P_SESSION_ID, AV8P_APP_ID, AV14P_DISP_DATETIME, AV18P_EXEC_USER_ID, AV17P_EXEC_AUTH_CD, new Byte(AV15P_ERR_CD), AV16P_ERR_VAL});
      AV20P_SESSION_ID = P00314_AV20P_SESSION_ID[0] ;
      AV8P_APP_ID = P00314_AV8P_APP_ID[0] ;
      AV14P_DISP_DATETIME = P00314_AV14P_DISP_DATETIME[0] ;
      AV18P_EXEC_USER_ID = P00314_AV18P_EXEC_USER_ID[0] ;
      AV17P_EXEC_AUTH_CD = P00314_AV17P_EXEC_AUTH_CD[0] ;
      AV15P_ERR_CD = P00314_AV15P_ERR_CD[0] ;
      AV16P_ERR_VAL = P00314_AV16P_ERR_VAL[0] ;
      if ( AV15P_ERR_CD != 0 )
      {
         AV27W_ERR_CD = (short)(1) ;
         if ( ! (GXutil.strcmp("", AV16P_ERR_VAL)==0) )
         {
            /* Execute user subroutine: S141 */
            S141 ();
            if (returnInSub) return;
         }
         if ( AV15P_ERR_CD == 1 )
         {
            GXt_char1 = AV28W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
            ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_ERR_MSG = GXt_char1 ;
         }
         else if ( AV15P_ERR_CD == 2 )
         {
            GXt_char1 = AV28W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00048", "", "", "", "", "", GXv_char2) ;
            ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_ERR_MSG = GXt_char1 ;
         }
         else if ( AV15P_ERR_CD == 3 )
         {
            GXt_char1 = AV28W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00054", AV31W_MSG, "", "", "", "", GXv_char2) ;
            ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_ERR_MSG = GXt_char1 ;
         }
         else if ( AV15P_ERR_CD == 4 )
         {
            GXt_char1 = AV28W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00055", AV31W_MSG, "", "", "", "", GXv_char2) ;
            ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_ERR_MSG = GXt_char1 ;
         }
         else
         {
            GXt_char1 = AV28W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
            ab506_pc02_up_crf_val_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S141( )
   {
      /* 'SUB_ANALYSIS_ERR_KEY' Routine */
      AV31W_MSG = "" ;
      GXt_objcol_char4 = AV25W_CSV_ROW ;
      GXv_objcol_char5[0] = GXt_objcol_char4 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV16P_ERR_VAL, GXv_objcol_char5) ;
      GXt_objcol_char4 = GXv_objcol_char5[0] ;
      AV25W_CSV_ROW = GXt_objcol_char4 ;
      AV23W_CNT = 1 ;
      while ( AV23W_CNT <= AV25W_CSV_ROW.size() )
      {
         GXv_objcol_char5[0] = AV24W_CSV_COL ;
         GXv_int3[0] = AV33W_RTN_CD ;
         GXv_char2[0] = AV34W_RTN_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV25W_CSV_ROW.elementAt(-1+(int)(AV23W_CNT)), 0, "", GXv_objcol_char5, GXv_int3, GXv_char2) ;
         AV24W_CSV_COL = GXv_objcol_char5[0] ;
         ab506_pc02_up_crf_val_impl.this.AV33W_RTN_CD = GXv_int3[0] ;
         ab506_pc02_up_crf_val_impl.this.AV34W_RTN_MSG = GXv_char2[0] ;
         AV23W_CNT = (long)(AV23W_CNT+1) ;
      }
      if ( AV25W_CSV_ROW.size() > 0 )
      {
         AV31W_MSG = (String)AV25W_CSV_ROW.elementAt(-1+1) ;
      }
   }

   public void S15201( )
   {
      /* 'SUB_DELETE_WORK' Routine */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBW04_CRF" ;
      /* Using cursor P00315 */
      pr_default.execute(3, new Object[] {AV35W_SESSION.getId(), AV36C_APP_ID, AV26W_DISP_DATETIME});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBW05_CRF_RESULT" ;
      /* Using cursor P00316 */
      pr_default.execute(4, new Object[] {AV35W_SESSION.getId(), AV36C_APP_ID, AV26W_DISP_DATETIME});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBW06_CRF_MEMO" ;
      /* Using cursor P00317 */
      pr_default.execute(5, new Object[] {AV35W_SESSION.getId(), AV36C_APP_ID, AV26W_DISP_DATETIME});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBW07_CRF_MEMO_LOC" ;
      /* Using cursor P00318 */
      pr_default.execute(6, new Object[] {AV35W_SESSION.getId(), AV36C_APP_ID, AV26W_DISP_DATETIME});
      /* End optimized DELETE. */
   }

   public void S16240( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV22P_USER_ID = AV29W_HTTP_REQ.getVariable("USER_ID") ;
      AV19P_PWD = AV29W_HTTP_REQ.getVariable("PW") ;
      AV21P_STUDY_ID = AV29W_HTTP_REQ.getVariable("STUDY_ID") ;
      AV9P_AUTH_CD = AV29W_HTTP_REQ.getVariable("AUTH_CD") ;
      AV12P_CRF_RECORD = AV29W_HTTP_REQ.getVariable("CRF") ;
      AV13P_CRF_VAL = AV29W_HTTP_REQ.getVariable("CRF_VAL") ;
      AV10P_CRF_MEMO = AV29W_HTTP_REQ.getVariable("CRF_MEMO") ;
      AV11P_CRF_MEMO_LOC = AV29W_HTTP_REQ.getVariable("CRF_MEMO_LOC") ;
      AV37W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV22P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV37W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV21P_STUDY_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV37W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "AUTH_CD" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_AUTH_CD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV37W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_CRF_RECORD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV37W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_VAL" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_CRF_VAL );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV37W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_MEMO" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_MEMO );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV37W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV38W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_MEMO_LOC" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV38W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_CRF_MEMO_LOC );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38W_PARMS_ITEM", AV38W_PARMS_ITEM);
      AV37W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV38W_PARMS_ITEM, 0);
      AV31W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV37W_EXTRA_INFO;
      GXv_int3[0] = AV27W_ERR_CD ;
      GXv_char2[0] = AV28W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV42Pgmname, (short)(1), AV31W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int3, GXv_char2) ;
      AV37W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
      ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char2[0] ;
   }

   public void S17290( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV30W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV22P_USER_ID ;
      GXv_int3[0] = AV27W_ERR_CD ;
      GXv_char7[0] = AV28W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV19P_PWD, GXv_int3, GXv_char7) ;
      ab506_pc02_up_crf_val_impl.this.AV22P_USER_ID = GXv_char2[0] ;
      ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
      ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char7[0] ;
   }

   public void S18306( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV27W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab506_pc02_up_crf_val");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab506_pc02_up_crf_val");
      }
      AV31W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV27W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV28W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV37W_EXTRA_INFO;
      GXv_int3[0] = AV27W_ERR_CD ;
      GXv_char7[0] = AV28W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV42Pgmname, (short)(1), AV31W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int3, GXv_char7) ;
      AV37W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
      ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char7[0] ;
      GXv_int3[0] = AV27W_ERR_CD ;
      GXv_char7[0] = AV28W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int3, GXv_char7) ;
      ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
      ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char7[0] ;
   }

   public void S19325( )
   {
      /* 'SUB_ERROR' Routine */
      AV31W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV37W_EXTRA_INFO;
      GXv_int3[0] = AV27W_ERR_CD ;
      GXv_char7[0] = AV28W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV42Pgmname, (short)(0), AV31W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int3, GXv_char7) ;
      AV37W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab506_pc02_up_crf_val_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
      ab506_pc02_up_crf_val_impl.this.AV28W_ERR_MSG = GXv_char7[0] ;
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
                  /* Execute user subroutine: S19325 */
                  S19325 ();
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
      AV36C_APP_ID = "" ;
      AV28W_ERR_MSG = "" ;
      AV32W_NEWLINE = "" ;
      AV37W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV42Pgmname = "" ;
      AV43Pgmdesc = "" ;
      AV30W_HTTP_RES = httpContext.getHttpResponse();
      AV21P_STUDY_ID = "" ;
      AV9P_AUTH_CD = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV22P_USER_ID = "" ;
      P00312_A209TBM23_DEL_FLG = new String[] {""} ;
      P00312_n209TBM23_DEL_FLG = new boolean[] {false} ;
      P00312_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      P00312_A208TBM23_USER_ID = new String[] {""} ;
      P00312_A207TBM23_STUDY_ID = new long[1] ;
      A209TBM23_DEL_FLG = "" ;
      A407TBM23_STYDY_AUTH_CD = "" ;
      A208TBM23_USER_ID = "" ;
      P00313_A18TAM04_DEL_FLG = new String[] {""} ;
      P00313_n18TAM04_DEL_FLG = new boolean[] {false} ;
      P00313_A17TAM04_AUTH_CD = new String[] {""} ;
      P00313_A98TAM04_AUTH_NM = new String[] {""} ;
      P00313_n98TAM04_AUTH_NM = new boolean[] {false} ;
      A18TAM04_DEL_FLG = "" ;
      A17TAM04_AUTH_CD = "" ;
      A98TAM04_AUTH_NM = "" ;
      AV26W_DISP_DATETIME = "" ;
      AV12P_CRF_RECORD = "" ;
      AV35W_SESSION = httpContext.getWebSession();
      AV13P_CRF_VAL = "" ;
      AV10P_CRF_MEMO = "" ;
      AV11P_CRF_MEMO_LOC = "" ;
      AV20P_SESSION_ID = "" ;
      AV8P_APP_ID = "" ;
      AV14P_DISP_DATETIME = "" ;
      AV18P_EXEC_USER_ID = "" ;
      AV17P_EXEC_AUTH_CD = "" ;
      AV16P_ERR_VAL = "" ;
      P00314_AV20P_SESSION_ID = new String[] {""} ;
      P00314_AV8P_APP_ID = new String[] {""} ;
      P00314_AV14P_DISP_DATETIME = new String[] {""} ;
      P00314_AV18P_EXEC_USER_ID = new String[] {""} ;
      P00314_AV17P_EXEC_AUTH_CD = new String[] {""} ;
      P00314_AV15P_ERR_CD = new byte[1] ;
      P00314_AV16P_ERR_VAL = new String[] {""} ;
      AV31W_MSG = "" ;
      GXt_char1 = "" ;
      AV25W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char4 = new GxObjectCollection(String.class, "internal", "");
      AV24W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char5 = new GxObjectCollection [1] ;
      AV34W_RTN_MSG = "" ;
      AV29W_HTTP_REQ = httpContext.getHttpRequest();
      AV19P_PWD = "" ;
      AV38W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int3 = new short [1] ;
      GXv_char7 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab506_pc02_up_crf_val__default(),
         new Object[] {
             new Object[] {
            P00312_A209TBM23_DEL_FLG, P00312_n209TBM23_DEL_FLG, P00312_A407TBM23_STYDY_AUTH_CD, P00312_A208TBM23_USER_ID, P00312_A207TBM23_STUDY_ID
            }
            , new Object[] {
            P00313_A18TAM04_DEL_FLG, P00313_n18TAM04_DEL_FLG, P00313_A17TAM04_AUTH_CD, P00313_A98TAM04_AUTH_NM, P00313_n98TAM04_AUTH_NM
            }
            , new Object[] {
            P00314_AV20P_SESSION_ID, P00314_AV8P_APP_ID, P00314_AV14P_DISP_DATETIME, P00314_AV18P_EXEC_USER_ID, P00314_AV17P_EXEC_AUTH_CD, P00314_AV15P_ERR_CD, P00314_AV16P_ERR_VAL
            }
            , new Object[] {
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
      AV43Pgmdesc = "CRF入力データアップロード" ;
      AV42Pgmname = "AB506_PC02_UP_CRF_VAL" ;
      /* GeneXus formulas. */
      AV43Pgmdesc = "CRF入力データアップロード" ;
      AV42Pgmname = "AB506_PC02_UP_CRF_VAL" ;
      Gx_err = (short)(0) ;
   }

   private byte AV44GXLvl84 ;
   private byte AV45GXLvl94 ;
   private byte AV15P_ERR_CD ;
   private short AV27W_ERR_CD ;
   private short AV33W_RTN_CD ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV39W_STUDY_ID ;
   private long A207TBM23_STUDY_ID ;
   private long AV23W_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV42Pgmname ;
   private String AV43Pgmdesc ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n209TBM23_DEL_FLG ;
   private boolean n18TAM04_DEL_FLG ;
   private boolean n98TAM04_AUTH_NM ;
   private String AV36C_APP_ID ;
   private String AV28W_ERR_MSG ;
   private String AV32W_NEWLINE ;
   private String AV21P_STUDY_ID ;
   private String AV9P_AUTH_CD ;
   private String AV22P_USER_ID ;
   private String A209TBM23_DEL_FLG ;
   private String A407TBM23_STYDY_AUTH_CD ;
   private String A208TBM23_USER_ID ;
   private String A18TAM04_DEL_FLG ;
   private String A17TAM04_AUTH_CD ;
   private String A98TAM04_AUTH_NM ;
   private String AV26W_DISP_DATETIME ;
   private String AV12P_CRF_RECORD ;
   private String AV13P_CRF_VAL ;
   private String AV10P_CRF_MEMO ;
   private String AV11P_CRF_MEMO_LOC ;
   private String AV20P_SESSION_ID ;
   private String AV8P_APP_ID ;
   private String AV14P_DISP_DATETIME ;
   private String AV18P_EXEC_USER_ID ;
   private String AV17P_EXEC_AUTH_CD ;
   private String AV16P_ERR_VAL ;
   private String AV31W_MSG ;
   private String AV34W_RTN_MSG ;
   private String AV19P_PWD ;
   private com.genexus.internet.HttpRequest AV29W_HTTP_REQ ;
   private com.genexus.webpanels.WebSession AV35W_SESSION ;
   private IDataStoreProvider pr_default ;
   private String[] P00312_A209TBM23_DEL_FLG ;
   private boolean[] P00312_n209TBM23_DEL_FLG ;
   private String[] P00312_A407TBM23_STYDY_AUTH_CD ;
   private String[] P00312_A208TBM23_USER_ID ;
   private long[] P00312_A207TBM23_STUDY_ID ;
   private String[] P00313_A18TAM04_DEL_FLG ;
   private boolean[] P00313_n18TAM04_DEL_FLG ;
   private String[] P00313_A17TAM04_AUTH_CD ;
   private String[] P00313_A98TAM04_AUTH_NM ;
   private boolean[] P00313_n98TAM04_AUTH_NM ;
   private String[] P00314_AV20P_SESSION_ID ;
   private String[] P00314_AV8P_APP_ID ;
   private String[] P00314_AV14P_DISP_DATETIME ;
   private String[] P00314_AV18P_EXEC_USER_ID ;
   private String[] P00314_AV17P_EXEC_AUTH_CD ;
   private byte[] P00314_AV15P_ERR_CD ;
   private String[] P00314_AV16P_ERR_VAL ;
   private com.genexus.internet.HttpResponse AV30W_HTTP_RES ;
   private GxObjectCollection AV25W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char4 ;
   private GxObjectCollection AV24W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char5[] ;
   private SdtB808_SD01_EXTRA_INFO AV37W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV38W_PARMS_ITEM ;
}

final  class ab506_pc02_up_crf_val__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00312", "SELECT `TBM23_DEL_FLG`, `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID` FROM `TBM23_STUDY_STAFF` WHERE (`TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ? and `TBM23_STYDY_AUTH_CD` = ?) AND (`TBM23_DEL_FLG` = '0') ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00313", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` = ?) AND (`TAM04_DEL_FLG` = '0') ORDER BY `TAM04_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new CallCursor("P00314", "CALL B506_SP01_UP_CRF_VAL ( ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new UpdateCursor("P00315", "DELETE FROM `TBW04_CRF`  WHERE `TBW04_SESSION_ID` = ? and `TBW04_APP_ID` = ? and `TBW04_DISP_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00316", "DELETE FROM `TBW05_CRF_RESULT`  WHERE `TBW05_SESSION_ID` = ? and `TBW05_APP_ID` = ? and `TBW05_DISP_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00317", "DELETE FROM `TBW06_CRF_MEMO`  WHERE `TBW06_SESSION_ID` = ? and `TBW06_APP_ID` = ? and `TBW06_DISP_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00318", "DELETE FROM `TBW07_CRF_MEMO_LOC`  WHERE `TBW07_SESSION_ID` = ? and `TBW07_APP_ID` = ? and `TBW07_DISP_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
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
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 4 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 5 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 6 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 7 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               stmt.setVarchar(4, (String)parms[3], 128);
               stmt.setVarchar(5, (String)parms[4], 2);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 512);
               break;
            case 3 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               break;
            case 4 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               break;
            case 5 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               break;
            case 6 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               break;
      }
   }

}

