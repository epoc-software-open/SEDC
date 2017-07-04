/*
               File: ab502_pc02_up_crf_impl
        Description: CRFアップロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:2.47
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab502_pc02_up_crf_impl extends GXWebProcedure
{
   public ab502_pc02_up_crf_impl( com.genexus.internet.HttpContext context )
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
      AV8C_APP_ID = "B502" ;
      AV26W_ERR_CD = (short)(0) ;
      AV27W_ERR_MSG = "" ;
      GXt_char1 = AV33W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33W_NEWLINE = GXt_char1 ;
      AV28W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV28W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_EXTRA_INFO", AV28W_EXTRA_INFO);
      /* Execute user subroutine: S14210 */
      S14210 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S16327 */
      S16327 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV38Pgmname, "INFO", AV39Pgmdesc) ;
      if ( AV26W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1160 */
         S1160 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV26W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S12157 */
         S12157 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV26W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S15310 */
         S15310 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV26W_ERR_CD, 10, 0))+AV33W_NEWLINE);
      AV30W_HTTP_RES.addString(AV27W_ERR_MSG);
      /* Execute user subroutine: S17343 */
      S17343 ();
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

   public void S1160( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      AV35W_STUDY_ID = GXutil.lval( AV19P_STUDY_ID) ;
      AV22W_CRF_ID = (short)(GXutil.lval( AV13P_CRF_ID)) ;
      if ( AV26W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV19P_STUDY_ID)==0) )
         {
            AV26W_ERR_CD = (short)(1) ;
            GXt_char1 = AV27W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "試験ID", "", "", "", "", GXv_char2) ;
            ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV26W_ERR_CD == 0 )
      {
         AV40GXLvl73 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM21_STUDY" ;
         /* Using cursor P002D2 */
         pr_default.execute(0, new Object[] {new Long(AV35W_STUDY_ID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A189TBM21_DEL_FLG = P002D2_A189TBM21_DEL_FLG[0] ;
            n189TBM21_DEL_FLG = P002D2_n189TBM21_DEL_FLG[0] ;
            A186TBM21_STUDY_ID = P002D2_A186TBM21_STUDY_ID[0] ;
            AV40GXLvl73 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV40GXLvl73 == 0 )
         {
            AV26W_ERR_CD = (short)(1) ;
            GXt_char1 = AV27W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "試験", "", "", "", "", GXv_char2) ;
            ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV26W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV13P_CRF_ID)==0) )
         {
            AV26W_ERR_CD = (short)(1) ;
            GXt_char1 = AV27W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "CRFID", "", "", "", "", GXv_char2) ;
            ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV26W_ERR_CD == 0 )
      {
         AV41GXLvl92 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM31_CRF" ;
         /* Using cursor P002D3 */
         pr_default.execute(1, new Object[] {new Long(AV35W_STUDY_ID), new Short(AV22W_CRF_ID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A223TBM31_DEL_FLG = P002D3_A223TBM31_DEL_FLG[0] ;
            n223TBM31_DEL_FLG = P002D3_n223TBM31_DEL_FLG[0] ;
            A218TBM31_CRF_ID = P002D3_A218TBM31_CRF_ID[0] ;
            A217TBM31_STUDY_ID = P002D3_A217TBM31_STUDY_ID[0] ;
            AV41GXLvl92 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV41GXLvl92 == 0 )
         {
            AV26W_ERR_CD = (short)(1) ;
            GXt_char1 = AV27W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "CRF", "", "", "", "", GXv_char2) ;
            ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV27W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( ! (GXutil.strcmp("", AV9P_CRF)==0) )
      {
         AV25W_CSV_ROW.clear();
         AV23W_CSV_COL.clear();
         if ( AV26W_ERR_CD == 0 )
         {
            GXt_objcol_char3 = AV25W_CSV_ROW ;
            GXv_objcol_char4[0] = GXt_objcol_char3 ;
            new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV9P_CRF, GXv_objcol_char4) ;
            GXt_objcol_char3 = GXv_objcol_char4[0] ;
            AV25W_CSV_ROW = GXt_objcol_char3 ;
            if ( AV25W_CSV_ROW.size() != 1 )
            {
               AV26W_ERR_CD = (short)(1) ;
               GXt_char1 = AV27W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00061", "", "", "", "", "", GXv_char2) ;
               ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV27W_ERR_MSG = GXt_char1 ;
            }
         }
         if ( AV26W_ERR_CD == 0 )
         {
            GXv_objcol_char4[0] = AV23W_CSV_COL ;
            GXv_int5[0] = AV26W_ERR_CD ;
            GXv_char2[0] = AV27W_ERR_MSG ;
            new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV25W_CSV_ROW.elementAt(-1+1), 11, "CRFマスタ", GXv_objcol_char4, GXv_int5, GXv_char2) ;
            AV23W_CSV_COL = GXv_objcol_char4[0] ;
            ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
            ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char2[0] ;
         }
         if ( AV26W_ERR_CD == 0 )
         {
            if ( GXutil.strcmp((String)AV23W_CSV_COL.elementAt(-1+11), "0") != 0 )
            {
               AV26W_ERR_CD = (short)(1) ;
               GXt_char1 = AV27W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00064", "", "", "", "", "", GXv_char2) ;
               ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV27W_ERR_MSG = GXt_char1 ;
            }
         }
         if ( AV26W_ERR_CD == 0 )
         {
            AV42GXLvl135 = (byte)(0) ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TBM31_CRF" ;
            /* Using cursor P002D4 */
            pr_default.execute(2);
            while ( (pr_default.getStatus(2) != 101) )
            {
               A218TBM31_CRF_ID = P002D4_A218TBM31_CRF_ID[0] ;
               A217TBM31_STUDY_ID = P002D4_A217TBM31_STUDY_ID[0] ;
               A223TBM31_DEL_FLG = P002D4_A223TBM31_DEL_FLG[0] ;
               n223TBM31_DEL_FLG = P002D4_n223TBM31_DEL_FLG[0] ;
               if ( A217TBM31_STUDY_ID == GXutil.val( (String)AV23W_CSV_COL.elementAt(-1+1), ".") )
               {
                  if ( A218TBM31_CRF_ID == GXutil.val( (String)AV23W_CSV_COL.elementAt(-1+2), ".") )
                  {
                     AV42GXLvl135 = (byte)(1) ;
                     if ( GXutil.strcmp(A223TBM31_DEL_FLG, "1") == 0 )
                     {
                        AV26W_ERR_CD = (short)(1) ;
                        GXt_char1 = AV27W_ERR_MSG ;
                        GXv_char2[0] = GXt_char1 ;
                        new a805_pc01_msg_get(remoteHandle, context).execute( "AE00037", "CRF", "", "", "", "", GXv_char2) ;
                        ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
                        AV27W_ERR_MSG = GXt_char1 ;
                     }
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV42GXLvl135 == 0 )
            {
               AV26W_ERR_CD = (short)(1) ;
               GXt_char1 = AV27W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00062", "更新対象のCRF", "", "", "", "", GXv_char2) ;
               ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV27W_ERR_MSG = GXt_char1 ;
            }
         }
      }
   }

   public void S12157( )
   {
      /* 'SUB_REG_CSV_DATA' Routine */
      AV24W_CSV_ERR_MSG.clear();
      if ( ( AV26W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV9P_CRF)==0) )
      {
         GXv_int5[0] = AV26W_ERR_CD ;
         GXv_objcol_char4[0] = AV24W_CSV_ERR_MSG ;
         new b502_pc05_crf_reg(remoteHandle, context).execute( AV19P_STUDY_ID, AV13P_CRF_ID, AV9P_CRF, GXv_int5, GXv_objcol_char4) ;
         ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
         AV24W_CSV_ERR_MSG = GXv_objcol_char4[0] ;
      }
      if ( ( AV26W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV14P_CRF_ITEM)==0) )
      {
         GXv_int5[0] = AV26W_ERR_CD ;
         GXv_objcol_char4[0] = AV24W_CSV_ERR_MSG ;
         new b502_pc06_crf_item_reg(remoteHandle, context).execute( AV19P_STUDY_ID, AV13P_CRF_ID, AV14P_CRF_ITEM, GXv_int5, GXv_objcol_char4) ;
         ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
         AV24W_CSV_ERR_MSG = GXv_objcol_char4[0] ;
      }
      if ( AV26W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S131 */
         S131 ();
         if (returnInSub) return;
      }
      if ( ( AV26W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV11P_CRF_COND)==0) )
      {
         GXv_int5[0] = AV26W_ERR_CD ;
         GXv_objcol_char4[0] = AV24W_CSV_ERR_MSG ;
         new b502_pc07_crf_cond_reg(remoteHandle, context).execute( AV19P_STUDY_ID, AV13P_CRF_ID, AV11P_CRF_COND, GXv_int5, GXv_objcol_char4) ;
         ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
         AV24W_CSV_ERR_MSG = GXv_objcol_char4[0] ;
      }
      if ( ( AV26W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV10P_CRF_AUTH)==0) )
      {
         GXv_int5[0] = AV26W_ERR_CD ;
         GXv_objcol_char4[0] = AV24W_CSV_ERR_MSG ;
         new b502_pc08_crf_auth_reg(remoteHandle, context).execute( AV19P_STUDY_ID, AV13P_CRF_ID, AV10P_CRF_AUTH, GXv_int5, GXv_objcol_char4) ;
         ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
         AV24W_CSV_ERR_MSG = GXv_objcol_char4[0] ;
      }
      if ( ( AV26W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV15P_CRF_ITEM_AUTH)==0) )
      {
         GXv_int5[0] = AV26W_ERR_CD ;
         GXv_objcol_char4[0] = AV24W_CSV_ERR_MSG ;
         new b502_pc09_crf_item_auth_reg(remoteHandle, context).execute( AV19P_STUDY_ID, AV13P_CRF_ID, AV15P_CRF_ITEM_AUTH, GXv_int5, GXv_objcol_char4) ;
         ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
         AV24W_CSV_ERR_MSG = GXv_objcol_char4[0] ;
      }
      if ( ( AV26W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV12P_CRF_DOM_MAP)==0) )
      {
         GXv_int5[0] = AV26W_ERR_CD ;
         GXv_objcol_char4[0] = AV24W_CSV_ERR_MSG ;
         new b502_pc10_crf_dom_map_reg(remoteHandle, context).execute( AV19P_STUDY_ID, AV13P_CRF_ID, AV12P_CRF_DOM_MAP, GXv_int5, GXv_objcol_char4) ;
         ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
         AV24W_CSV_ERR_MSG = GXv_objcol_char4[0] ;
      }
      if ( ( AV26W_ERR_CD == 0 ) && ! (GXutil.strcmp("", AV16P_CRF_NCM_MAP)==0) )
      {
         GXv_int5[0] = AV26W_ERR_CD ;
         GXv_objcol_char4[0] = AV24W_CSV_ERR_MSG ;
         new b502_pc11_crf_ncm_map_reg(remoteHandle, context).execute( AV19P_STUDY_ID, AV13P_CRF_ID, AV16P_CRF_NCM_MAP, GXv_int5, GXv_objcol_char4) ;
         ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
         AV24W_CSV_ERR_MSG = GXv_objcol_char4[0] ;
      }
      if ( ( AV26W_ERR_CD != 0 ) && ( AV24W_CSV_ERR_MSG.size() > 0 ) )
      {
         AV27W_ERR_MSG = (String)AV24W_CSV_ERR_MSG.elementAt(-1+1) ;
      }
   }

   public void S14210( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV20P_USER_ID = AV29W_HTTP_REQ.getVariable("USER_ID") ;
      AV18P_PWD = AV29W_HTTP_REQ.getVariable("PW") ;
      AV19P_STUDY_ID = AV29W_HTTP_REQ.getVariable("STUDY_ID") ;
      AV13P_CRF_ID = AV29W_HTTP_REQ.getVariable("CRF_ID") ;
      AV9P_CRF = AV29W_HTTP_REQ.getVariable("CRF") ;
      AV14P_CRF_ITEM = AV29W_HTTP_REQ.getVariable("CRF_ITEM") ;
      AV11P_CRF_COND = AV29W_HTTP_REQ.getVariable("CRF_COND") ;
      AV15P_CRF_ITEM_AUTH = AV29W_HTTP_REQ.getVariable("CRF_ITEM_AUTH") ;
      AV12P_CRF_DOM_MAP = AV29W_HTTP_REQ.getVariable("CRF_DOM_MAP") ;
      AV16P_CRF_NCM_MAP = AV29W_HTTP_REQ.getVariable("CRF_NCM_MAP") ;
      AV10P_CRF_AUTH = AV29W_HTTP_REQ.getVariable("CRF_AUTH") ;
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV20P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV19P_STUDY_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_CRF_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ITEM" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV14P_CRF_ITEM );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_COND" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_CRF_COND );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ITEM_AUTH" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV15P_CRF_ITEM_AUTH );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_DOM_MAP" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_CRF_DOM_MAP );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_NCM_MAP" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV16P_CRF_NCM_MAP );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_AUTH" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_AUTH );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34W_PARMS_ITEM", AV34W_PARMS_ITEM);
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV32W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV28W_EXTRA_INFO;
      GXv_int5[0] = AV26W_ERR_CD ;
      GXv_char2[0] = AV27W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV38Pgmname, (short)(1), AV32W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV28W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char2[0] ;
   }

   public void S131( )
   {
      /* 'SUB_DELETE_CRF_COND' Routine */
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM33_CRF_COND" ;
      /* Using cursor P002D5 */
      pr_default.execute(3, new Object[] {AV19P_STUDY_ID, AV13P_CRF_ID});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A247TBM33_CRF_ID = P002D5_A247TBM33_CRF_ID[0] ;
         A246TBM33_STUDY_ID = P002D5_A246TBM33_STUDY_ID[0] ;
         A248TBM33_COND_NO = P002D5_A248TBM33_COND_NO[0] ;
         A379TBM33_COND_NM = P002D5_A379TBM33_COND_NM[0] ;
         n379TBM33_COND_NM = P002D5_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = P002D5_A249TBM33_EXPRESSION[0] ;
         n249TBM33_EXPRESSION = P002D5_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = P002D5_A380TBM33_COND_DIV[0] ;
         n380TBM33_COND_DIV = P002D5_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = P002D5_A381TBM33_CRF_ITEM_CD[0] ;
         n381TBM33_CRF_ITEM_CD = P002D5_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = P002D5_A250TBM33_PRIOR_NO[0] ;
         n250TBM33_PRIOR_NO = P002D5_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = P002D5_A382TBM33_ERR_DIV[0] ;
         n382TBM33_ERR_DIV = P002D5_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = P002D5_A383TBM33_ERR_MSG[0] ;
         n383TBM33_ERR_MSG = P002D5_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = P002D5_A554TBM33_ENABLED_FLG[0] ;
         n554TBM33_ENABLED_FLG = P002D5_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = P002D5_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         n610TBM33_REQUIRED_INPUT_FLG = P002D5_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = P002D5_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         n611TBM33_NUMERIC_RANGE_FLG = P002D5_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A251TBM33_DEL_FLG = P002D5_A251TBM33_DEL_FLG[0] ;
         n251TBM33_DEL_FLG = P002D5_n251TBM33_DEL_FLG[0] ;
         A258TBM33_UPD_CNT = P002D5_A258TBM33_UPD_CNT[0] ;
         n258TBM33_UPD_CNT = P002D5_n258TBM33_UPD_CNT[0] ;
         A257TBM33_UPD_PROG_NM = P002D5_A257TBM33_UPD_PROG_NM[0] ;
         n257TBM33_UPD_PROG_NM = P002D5_n257TBM33_UPD_PROG_NM[0] ;
         A256TBM33_UPD_USER_ID = P002D5_A256TBM33_UPD_USER_ID[0] ;
         n256TBM33_UPD_USER_ID = P002D5_n256TBM33_UPD_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = P002D5_A255TBM33_UPD_DATETIME[0] ;
         n255TBM33_UPD_DATETIME = P002D5_n255TBM33_UPD_DATETIME[0] ;
         A254TBM33_CRT_PROG_NM = P002D5_A254TBM33_CRT_PROG_NM[0] ;
         n254TBM33_CRT_PROG_NM = P002D5_n254TBM33_CRT_PROG_NM[0] ;
         A253TBM33_CRT_USER_ID = P002D5_A253TBM33_CRT_USER_ID[0] ;
         n253TBM33_CRT_USER_ID = P002D5_n253TBM33_CRT_USER_ID[0] ;
         A252TBM33_CRT_DATETIME = P002D5_A252TBM33_CRT_DATETIME[0] ;
         n252TBM33_CRT_DATETIME = P002D5_n252TBM33_CRT_DATETIME[0] ;
         AV31W_ITEMS.clear();
         AV31W_ITEMS.add(GXutil.trim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)), 0);
         AV31W_ITEMS.add(GXutil.trim( GXutil.str( A247TBM33_CRF_ID, 10, 0)), 0);
         AV31W_ITEMS.add(GXutil.trim( GXutil.str( A248TBM33_COND_NO, 10, 0)), 0);
         AV31W_ITEMS.add(A379TBM33_COND_NM, 0);
         AV31W_ITEMS.add(A249TBM33_EXPRESSION, 0);
         AV31W_ITEMS.add(A380TBM33_COND_DIV, 0);
         AV31W_ITEMS.add(A381TBM33_CRF_ITEM_CD, 0);
         AV31W_ITEMS.add(GXutil.trim( GXutil.str( A250TBM33_PRIOR_NO, 10, 0)), 0);
         AV31W_ITEMS.add(A382TBM33_ERR_DIV, 0);
         AV31W_ITEMS.add(A383TBM33_ERR_MSG, 0);
         AV31W_ITEMS.add(A554TBM33_ENABLED_FLG, 0);
         AV31W_ITEMS.add(A610TBM33_REQUIRED_INPUT_FLG, 0);
         AV31W_ITEMS.add(A611TBM33_NUMERIC_RANGE_FLG, 0);
         AV31W_ITEMS.add(A251TBM33_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV38Pgmname, "DLT", "TBM33_CRF_COND", AV31W_ITEMS, A252TBM33_CRT_DATETIME, A253TBM33_CRT_USER_ID, A254TBM33_CRT_PROG_NM, A255TBM33_UPD_DATETIME, A256TBM33_UPD_USER_ID, A257TBM33_UPD_PROG_NM, A258TBM33_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM33_CRF_COND" ;
         /* Using cursor P002D6 */
         pr_default.execute(4, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S15310( )
   {
      /* 'SUB_OPTIMIZE_CRF' Routine */
      AV17P_ERR_CD = (short)(0) ;
      /* Using cursor P002D7 */
      pr_default.execute(5, new Object[] {new Short(AV17P_ERR_CD), new Long(AV35W_STUDY_ID), new Short(AV22W_CRF_ID)});
      AV17P_ERR_CD = P002D7_AV17P_ERR_CD[0] ;
      AV35W_STUDY_ID = P002D7_AV35W_STUDY_ID[0] ;
      AV22W_CRF_ID = P002D7_AV22W_CRF_ID[0] ;
      if ( AV17P_ERR_CD != 0 )
      {
         AV26W_ERR_CD = (short)(1) ;
         GXt_char1 = AV27W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
         ab502_pc02_up_crf_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S16327( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV30W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV20P_USER_ID ;
      GXv_int5[0] = AV26W_ERR_CD ;
      GXv_char7[0] = AV27W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV18P_PWD, GXv_int5, GXv_char7) ;
      ab502_pc02_up_crf_impl.this.AV20P_USER_ID = GXv_char2[0] ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char7[0] ;
   }

   public void S17343( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV26W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab502_pc02_up_crf");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab502_pc02_up_crf");
      }
      AV32W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV26W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV27W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV28W_EXTRA_INFO;
      GXv_int5[0] = AV26W_ERR_CD ;
      GXv_char7[0] = AV27W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV38Pgmname, (short)(1), AV32W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char7) ;
      AV28W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char7[0] ;
      GXv_int5[0] = AV26W_ERR_CD ;
      GXv_char7[0] = AV27W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int5, GXv_char7) ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char7[0] ;
   }

   public void S18362( )
   {
      /* 'SUB_ERROR' Routine */
      AV32W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV28W_EXTRA_INFO;
      GXv_int5[0] = AV26W_ERR_CD ;
      GXv_char7[0] = AV27W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV38Pgmname, (short)(0), AV32W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char7) ;
      AV28W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char7[0] ;
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
                  /* Execute user subroutine: S18362 */
                  S18362 ();
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
      AV27W_ERR_MSG = "" ;
      AV33W_NEWLINE = "" ;
      AV28W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV38Pgmname = "" ;
      AV39Pgmdesc = "" ;
      AV30W_HTTP_RES = httpContext.getHttpResponse();
      AV19P_STUDY_ID = "" ;
      AV13P_CRF_ID = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002D2_A189TBM21_DEL_FLG = new String[] {""} ;
      P002D2_n189TBM21_DEL_FLG = new boolean[] {false} ;
      P002D2_A186TBM21_STUDY_ID = new long[1] ;
      A189TBM21_DEL_FLG = "" ;
      P002D3_A223TBM31_DEL_FLG = new String[] {""} ;
      P002D3_n223TBM31_DEL_FLG = new boolean[] {false} ;
      P002D3_A218TBM31_CRF_ID = new short[1] ;
      P002D3_A217TBM31_STUDY_ID = new long[1] ;
      A223TBM31_DEL_FLG = "" ;
      AV9P_CRF = "" ;
      AV25W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      AV23W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      P002D4_A218TBM31_CRF_ID = new short[1] ;
      P002D4_A217TBM31_STUDY_ID = new long[1] ;
      P002D4_A223TBM31_DEL_FLG = new String[] {""} ;
      P002D4_n223TBM31_DEL_FLG = new boolean[] {false} ;
      AV24W_CSV_ERR_MSG = new GxObjectCollection(String.class, "internal", "");
      AV14P_CRF_ITEM = "" ;
      AV11P_CRF_COND = "" ;
      AV10P_CRF_AUTH = "" ;
      AV15P_CRF_ITEM_AUTH = "" ;
      AV12P_CRF_DOM_MAP = "" ;
      AV16P_CRF_NCM_MAP = "" ;
      GXv_objcol_char4 = new GxObjectCollection [1] ;
      AV20P_USER_ID = "" ;
      AV29W_HTTP_REQ = httpContext.getHttpRequest();
      AV18P_PWD = "" ;
      AV34W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV32W_MSG = "" ;
      P002D5_A247TBM33_CRF_ID = new short[1] ;
      P002D5_A246TBM33_STUDY_ID = new long[1] ;
      P002D5_A248TBM33_COND_NO = new short[1] ;
      P002D5_A379TBM33_COND_NM = new String[] {""} ;
      P002D5_n379TBM33_COND_NM = new boolean[] {false} ;
      P002D5_A249TBM33_EXPRESSION = new String[] {""} ;
      P002D5_n249TBM33_EXPRESSION = new boolean[] {false} ;
      P002D5_A380TBM33_COND_DIV = new String[] {""} ;
      P002D5_n380TBM33_COND_DIV = new boolean[] {false} ;
      P002D5_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      P002D5_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P002D5_A250TBM33_PRIOR_NO = new byte[1] ;
      P002D5_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      P002D5_A382TBM33_ERR_DIV = new String[] {""} ;
      P002D5_n382TBM33_ERR_DIV = new boolean[] {false} ;
      P002D5_A383TBM33_ERR_MSG = new String[] {""} ;
      P002D5_n383TBM33_ERR_MSG = new boolean[] {false} ;
      P002D5_A554TBM33_ENABLED_FLG = new String[] {""} ;
      P002D5_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      P002D5_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P002D5_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P002D5_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P002D5_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P002D5_A251TBM33_DEL_FLG = new String[] {""} ;
      P002D5_n251TBM33_DEL_FLG = new boolean[] {false} ;
      P002D5_A258TBM33_UPD_CNT = new long[1] ;
      P002D5_n258TBM33_UPD_CNT = new boolean[] {false} ;
      P002D5_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      P002D5_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      P002D5_A256TBM33_UPD_USER_ID = new String[] {""} ;
      P002D5_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      P002D5_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002D5_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      P002D5_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      P002D5_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      P002D5_A253TBM33_CRT_USER_ID = new String[] {""} ;
      P002D5_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      P002D5_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002D5_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      A379TBM33_COND_NM = "" ;
      A249TBM33_EXPRESSION = "" ;
      A380TBM33_COND_DIV = "" ;
      A381TBM33_CRF_ITEM_CD = "" ;
      A382TBM33_ERR_DIV = "" ;
      A383TBM33_ERR_MSG = "" ;
      A554TBM33_ENABLED_FLG = "" ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      A251TBM33_DEL_FLG = "" ;
      A257TBM33_UPD_PROG_NM = "" ;
      A256TBM33_UPD_USER_ID = "" ;
      A255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A254TBM33_CRT_PROG_NM = "" ;
      A253TBM33_CRT_USER_ID = "" ;
      A252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV31W_ITEMS = new GxObjectCollection(String.class, "internal", "");
      P002D7_AV17P_ERR_CD = new short[1] ;
      P002D7_AV35W_STUDY_ID = new long[1] ;
      P002D7_AV22W_CRF_ID = new short[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char7 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab502_pc02_up_crf__default(),
         new Object[] {
             new Object[] {
            P002D2_A189TBM21_DEL_FLG, P002D2_n189TBM21_DEL_FLG, P002D2_A186TBM21_STUDY_ID
            }
            , new Object[] {
            P002D3_A223TBM31_DEL_FLG, P002D3_n223TBM31_DEL_FLG, P002D3_A218TBM31_CRF_ID, P002D3_A217TBM31_STUDY_ID
            }
            , new Object[] {
            P002D4_A218TBM31_CRF_ID, P002D4_A217TBM31_STUDY_ID, P002D4_A223TBM31_DEL_FLG, P002D4_n223TBM31_DEL_FLG
            }
            , new Object[] {
            P002D5_A247TBM33_CRF_ID, P002D5_A246TBM33_STUDY_ID, P002D5_A248TBM33_COND_NO, P002D5_A379TBM33_COND_NM, P002D5_n379TBM33_COND_NM, P002D5_A249TBM33_EXPRESSION, P002D5_n249TBM33_EXPRESSION, P002D5_A380TBM33_COND_DIV, P002D5_n380TBM33_COND_DIV, P002D5_A381TBM33_CRF_ITEM_CD,
            P002D5_n381TBM33_CRF_ITEM_CD, P002D5_A250TBM33_PRIOR_NO, P002D5_n250TBM33_PRIOR_NO, P002D5_A382TBM33_ERR_DIV, P002D5_n382TBM33_ERR_DIV, P002D5_A383TBM33_ERR_MSG, P002D5_n383TBM33_ERR_MSG, P002D5_A554TBM33_ENABLED_FLG, P002D5_n554TBM33_ENABLED_FLG, P002D5_A610TBM33_REQUIRED_INPUT_FLG,
            P002D5_n610TBM33_REQUIRED_INPUT_FLG, P002D5_A611TBM33_NUMERIC_RANGE_FLG, P002D5_n611TBM33_NUMERIC_RANGE_FLG, P002D5_A251TBM33_DEL_FLG, P002D5_n251TBM33_DEL_FLG, P002D5_A258TBM33_UPD_CNT, P002D5_n258TBM33_UPD_CNT, P002D5_A257TBM33_UPD_PROG_NM, P002D5_n257TBM33_UPD_PROG_NM, P002D5_A256TBM33_UPD_USER_ID,
            P002D5_n256TBM33_UPD_USER_ID, P002D5_A255TBM33_UPD_DATETIME, P002D5_n255TBM33_UPD_DATETIME, P002D5_A254TBM33_CRT_PROG_NM, P002D5_n254TBM33_CRT_PROG_NM, P002D5_A253TBM33_CRT_USER_ID, P002D5_n253TBM33_CRT_USER_ID, P002D5_A252TBM33_CRT_DATETIME, P002D5_n252TBM33_CRT_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            P002D7_AV17P_ERR_CD, P002D7_AV35W_STUDY_ID, P002D7_AV22W_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV39Pgmdesc = "CRFアップロード" ;
      AV38Pgmname = "AB502_PC02_UP_CRF" ;
      /* GeneXus formulas. */
      AV39Pgmdesc = "CRFアップロード" ;
      AV38Pgmname = "AB502_PC02_UP_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV40GXLvl73 ;
   private byte AV41GXLvl92 ;
   private byte AV42GXLvl135 ;
   private byte A250TBM33_PRIOR_NO ;
   private short AV26W_ERR_CD ;
   private short AV22W_CRF_ID ;
   private short A218TBM31_CRF_ID ;
   private short A247TBM33_CRF_ID ;
   private short A248TBM33_COND_NO ;
   private short AV17P_ERR_CD ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV35W_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long A246TBM33_STUDY_ID ;
   private long A258TBM33_UPD_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV38Pgmname ;
   private String AV39Pgmdesc ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String Gx_emsg ;
   private java.util.Date A255TBM33_UPD_DATETIME ;
   private java.util.Date A252TBM33_CRT_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n379TBM33_COND_NM ;
   private boolean n249TBM33_EXPRESSION ;
   private boolean n380TBM33_COND_DIV ;
   private boolean n381TBM33_CRF_ITEM_CD ;
   private boolean n250TBM33_PRIOR_NO ;
   private boolean n382TBM33_ERR_DIV ;
   private boolean n383TBM33_ERR_MSG ;
   private boolean n554TBM33_ENABLED_FLG ;
   private boolean n610TBM33_REQUIRED_INPUT_FLG ;
   private boolean n611TBM33_NUMERIC_RANGE_FLG ;
   private boolean n251TBM33_DEL_FLG ;
   private boolean n258TBM33_UPD_CNT ;
   private boolean n257TBM33_UPD_PROG_NM ;
   private boolean n256TBM33_UPD_USER_ID ;
   private boolean n255TBM33_UPD_DATETIME ;
   private boolean n254TBM33_CRT_PROG_NM ;
   private boolean n253TBM33_CRT_USER_ID ;
   private boolean n252TBM33_CRT_DATETIME ;
   private String AV8C_APP_ID ;
   private String AV27W_ERR_MSG ;
   private String AV33W_NEWLINE ;
   private String AV19P_STUDY_ID ;
   private String AV13P_CRF_ID ;
   private String A189TBM21_DEL_FLG ;
   private String A223TBM31_DEL_FLG ;
   private String AV9P_CRF ;
   private String AV14P_CRF_ITEM ;
   private String AV11P_CRF_COND ;
   private String AV10P_CRF_AUTH ;
   private String AV15P_CRF_ITEM_AUTH ;
   private String AV12P_CRF_DOM_MAP ;
   private String AV16P_CRF_NCM_MAP ;
   private String AV20P_USER_ID ;
   private String AV18P_PWD ;
   private String AV32W_MSG ;
   private String A379TBM33_COND_NM ;
   private String A249TBM33_EXPRESSION ;
   private String A380TBM33_COND_DIV ;
   private String A381TBM33_CRF_ITEM_CD ;
   private String A382TBM33_ERR_DIV ;
   private String A383TBM33_ERR_MSG ;
   private String A554TBM33_ENABLED_FLG ;
   private String A610TBM33_REQUIRED_INPUT_FLG ;
   private String A611TBM33_NUMERIC_RANGE_FLG ;
   private String A251TBM33_DEL_FLG ;
   private String A257TBM33_UPD_PROG_NM ;
   private String A256TBM33_UPD_USER_ID ;
   private String A254TBM33_CRT_PROG_NM ;
   private String A253TBM33_CRT_USER_ID ;
   private com.genexus.internet.HttpRequest AV29W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private String[] P002D2_A189TBM21_DEL_FLG ;
   private boolean[] P002D2_n189TBM21_DEL_FLG ;
   private long[] P002D2_A186TBM21_STUDY_ID ;
   private String[] P002D3_A223TBM31_DEL_FLG ;
   private boolean[] P002D3_n223TBM31_DEL_FLG ;
   private short[] P002D3_A218TBM31_CRF_ID ;
   private long[] P002D3_A217TBM31_STUDY_ID ;
   private short[] P002D4_A218TBM31_CRF_ID ;
   private long[] P002D4_A217TBM31_STUDY_ID ;
   private String[] P002D4_A223TBM31_DEL_FLG ;
   private boolean[] P002D4_n223TBM31_DEL_FLG ;
   private short[] P002D5_A247TBM33_CRF_ID ;
   private long[] P002D5_A246TBM33_STUDY_ID ;
   private short[] P002D5_A248TBM33_COND_NO ;
   private String[] P002D5_A379TBM33_COND_NM ;
   private boolean[] P002D5_n379TBM33_COND_NM ;
   private String[] P002D5_A249TBM33_EXPRESSION ;
   private boolean[] P002D5_n249TBM33_EXPRESSION ;
   private String[] P002D5_A380TBM33_COND_DIV ;
   private boolean[] P002D5_n380TBM33_COND_DIV ;
   private String[] P002D5_A381TBM33_CRF_ITEM_CD ;
   private boolean[] P002D5_n381TBM33_CRF_ITEM_CD ;
   private byte[] P002D5_A250TBM33_PRIOR_NO ;
   private boolean[] P002D5_n250TBM33_PRIOR_NO ;
   private String[] P002D5_A382TBM33_ERR_DIV ;
   private boolean[] P002D5_n382TBM33_ERR_DIV ;
   private String[] P002D5_A383TBM33_ERR_MSG ;
   private boolean[] P002D5_n383TBM33_ERR_MSG ;
   private String[] P002D5_A554TBM33_ENABLED_FLG ;
   private boolean[] P002D5_n554TBM33_ENABLED_FLG ;
   private String[] P002D5_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P002D5_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] P002D5_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P002D5_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] P002D5_A251TBM33_DEL_FLG ;
   private boolean[] P002D5_n251TBM33_DEL_FLG ;
   private long[] P002D5_A258TBM33_UPD_CNT ;
   private boolean[] P002D5_n258TBM33_UPD_CNT ;
   private String[] P002D5_A257TBM33_UPD_PROG_NM ;
   private boolean[] P002D5_n257TBM33_UPD_PROG_NM ;
   private String[] P002D5_A256TBM33_UPD_USER_ID ;
   private boolean[] P002D5_n256TBM33_UPD_USER_ID ;
   private java.util.Date[] P002D5_A255TBM33_UPD_DATETIME ;
   private boolean[] P002D5_n255TBM33_UPD_DATETIME ;
   private String[] P002D5_A254TBM33_CRT_PROG_NM ;
   private boolean[] P002D5_n254TBM33_CRT_PROG_NM ;
   private String[] P002D5_A253TBM33_CRT_USER_ID ;
   private boolean[] P002D5_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] P002D5_A252TBM33_CRT_DATETIME ;
   private boolean[] P002D5_n252TBM33_CRT_DATETIME ;
   private short[] P002D7_AV17P_ERR_CD ;
   private long[] P002D7_AV35W_STUDY_ID ;
   private short[] P002D7_AV22W_CRF_ID ;
   private com.genexus.internet.HttpResponse AV30W_HTTP_RES ;
   private GxObjectCollection AV25W_CSV_ROW ;
   private GxObjectCollection AV23W_CSV_COL ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV24W_CSV_ERR_MSG ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private GxObjectCollection AV31W_ITEMS ;
   private SdtB808_SD01_EXTRA_INFO AV28W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV34W_PARMS_ITEM ;
}

final  class ab502_pc02_up_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002D2", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002D3", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002D4", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_DEL_FLG` FROM `TBM31_CRF` ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P002D5", "SELECT `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NO`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_UPD_CNT`, `TBM33_UPD_PROG_NM`, `TBM33_UPD_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_CRT_PROG_NM`, `TBM33_CRT_USER_ID`, `TBM33_CRT_DATETIME` FROM `TBM33_CRF_COND` WHERE (`TBM33_STUDY_ID` = ?) AND (`TBM33_CRF_ID` = ?) ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002D6", "DELETE FROM `TBM33_CRF_COND`  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new CallCursor("P002D7", "CALL PROC_OPTIMIZE_CRF ( ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
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
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               break;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               break;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 10);
               stmt.setVarchar(2, (String)parms[1], 4);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 5 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.NUMERIC, 0 );
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

