/*
               File: ab502_pc02_up_crf_impl
        Description: CRFアップロード
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:52.39
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
      /* Execute user subroutine: S141 */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S161 */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV39Pgmname, "INFO", AV40Pgmdesc) ;
      if ( AV26W_ERR_CD == 0 )
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
      if ( AV26W_ERR_CD == 0 )
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
      if ( AV26W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S151 */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV26W_ERR_CD, 10, 0))+AV33W_NEWLINE);
      AV30W_HTTP_RES.addString(AV27W_ERR_MSG);
      /* Execute user subroutine: S171 */
      S171 ();
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

   public void S111( )
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
         AV41GXLvl73 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM21_STUDY" ;
         /* Using cursor P002B2 */
         pr_default.execute(0, new Object[] {new Long(AV35W_STUDY_ID)});
         if ( Gx_err != 0 )
         {
            AV41GXLvl73 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A369TBM21_DEL_FLG = P002B2_A369TBM21_DEL_FLG[0] ;
            n369TBM21_DEL_FLG = P002B2_n369TBM21_DEL_FLG[0] ;
            A63TBM21_STUDY_ID = P002B2_A63TBM21_STUDY_ID[0] ;
            AV41GXLvl73 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV41GXLvl73 == 0 )
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
         AV42GXLvl92 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM31_CRF" ;
         /* Using cursor P002B3 */
         pr_default.execute(1, new Object[] {new Long(AV35W_STUDY_ID), new Short(AV22W_CRF_ID)});
         if ( Gx_err != 0 )
         {
            AV42GXLvl92 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(1) != 101) )
         {
            A397TBM31_DEL_FLG = P002B3_A397TBM31_DEL_FLG[0] ;
            n397TBM31_DEL_FLG = P002B3_n397TBM31_DEL_FLG[0] ;
            A69TBM31_CRF_ID = P002B3_A69TBM31_CRF_ID[0] ;
            A68TBM31_STUDY_ID = P002B3_A68TBM31_STUDY_ID[0] ;
            AV42GXLvl92 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV42GXLvl92 == 0 )
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
            AV43GXLvl135 = (byte)(0) ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TBM31_CRF" ;
            /* Using cursor P002B4 */
            pr_default.execute(2);
            if ( Gx_err != 0 )
            {
               AV43GXLvl135 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(2) != 101) )
            {
               A69TBM31_CRF_ID = P002B4_A69TBM31_CRF_ID[0] ;
               A68TBM31_STUDY_ID = P002B4_A68TBM31_STUDY_ID[0] ;
               A397TBM31_DEL_FLG = P002B4_A397TBM31_DEL_FLG[0] ;
               n397TBM31_DEL_FLG = P002B4_n397TBM31_DEL_FLG[0] ;
               if ( A68TBM31_STUDY_ID == GXutil.val( (String)AV23W_CSV_COL.elementAt(-1+1), ".") )
               {
                  if ( A69TBM31_CRF_ID == GXutil.val( (String)AV23W_CSV_COL.elementAt(-1+2), ".") )
                  {
                     AV43GXLvl135 = (byte)(1) ;
                     if ( GXutil.strcmp(A397TBM31_DEL_FLG, "1") == 0 )
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
            if ( AV43GXLvl135 == 0 )
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

   public void S121( )
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

   public void S141( )
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
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV20P_USER_ID );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV19P_STUDY_ID );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ID" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_CRF_ID );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ITEM" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV14P_CRF_ITEM );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_COND" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_CRF_COND );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ITEM_AUTH" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV15P_CRF_ITEM_AUTH );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_DOM_MAP" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_CRF_DOM_MAP );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_NCM_MAP" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV16P_CRF_NCM_MAP );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV34W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_AUTH" );
      AV34W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_AUTH );
      AV28W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV34W_PARMS_ITEM, 0);
      AV32W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV28W_EXTRA_INFO;
      GXv_int5[0] = AV26W_ERR_CD ;
      GXv_char2[0] = AV27W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV39Pgmname, (short)(1), AV32W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV28W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char2[0] ;
   }

   public void S131( )
   {
      /* 'SUB_DELETE_CRF_COND' Routine */
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM33_CRF_COND" ;
      /* Using cursor P002B5 */
      pr_default.execute(3, new Object[] {AV19P_STUDY_ID, AV13P_CRF_ID});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A77TBM33_CRF_ID = P002B5_A77TBM33_CRF_ID[0] ;
         A76TBM33_STUDY_ID = P002B5_A76TBM33_STUDY_ID[0] ;
         A78TBM33_COND_NO = P002B5_A78TBM33_COND_NO[0] ;
         A502TBM33_COND_NM = P002B5_A502TBM33_COND_NM[0] ;
         n502TBM33_COND_NM = P002B5_n502TBM33_COND_NM[0] ;
         A414TBM33_EXPRESSION = P002B5_A414TBM33_EXPRESSION[0] ;
         n414TBM33_EXPRESSION = P002B5_n414TBM33_EXPRESSION[0] ;
         A503TBM33_COND_DIV = P002B5_A503TBM33_COND_DIV[0] ;
         n503TBM33_COND_DIV = P002B5_n503TBM33_COND_DIV[0] ;
         A504TBM33_CRF_ITEM_CD = P002B5_A504TBM33_CRF_ITEM_CD[0] ;
         n504TBM33_CRF_ITEM_CD = P002B5_n504TBM33_CRF_ITEM_CD[0] ;
         A415TBM33_PRIOR_NO = P002B5_A415TBM33_PRIOR_NO[0] ;
         n415TBM33_PRIOR_NO = P002B5_n415TBM33_PRIOR_NO[0] ;
         A505TBM33_ERR_DIV = P002B5_A505TBM33_ERR_DIV[0] ;
         n505TBM33_ERR_DIV = P002B5_n505TBM33_ERR_DIV[0] ;
         A506TBM33_ERR_MSG = P002B5_A506TBM33_ERR_MSG[0] ;
         n506TBM33_ERR_MSG = P002B5_n506TBM33_ERR_MSG[0] ;
         A646TBM33_ENABLED_FLG = P002B5_A646TBM33_ENABLED_FLG[0] ;
         n646TBM33_ENABLED_FLG = P002B5_n646TBM33_ENABLED_FLG[0] ;
         A696TBM33_REQUIRED_INPUT_FLG = P002B5_A696TBM33_REQUIRED_INPUT_FLG[0] ;
         n696TBM33_REQUIRED_INPUT_FLG = P002B5_n696TBM33_REQUIRED_INPUT_FLG[0] ;
         A697TBM33_NUMERIC_RANGE_FLG = P002B5_A697TBM33_NUMERIC_RANGE_FLG[0] ;
         n697TBM33_NUMERIC_RANGE_FLG = P002B5_n697TBM33_NUMERIC_RANGE_FLG[0] ;
         A416TBM33_DEL_FLG = P002B5_A416TBM33_DEL_FLG[0] ;
         n416TBM33_DEL_FLG = P002B5_n416TBM33_DEL_FLG[0] ;
         A417TBM33_CRT_DATETIME = P002B5_A417TBM33_CRT_DATETIME[0] ;
         n417TBM33_CRT_DATETIME = P002B5_n417TBM33_CRT_DATETIME[0] ;
         A418TBM33_CRT_USER_ID = P002B5_A418TBM33_CRT_USER_ID[0] ;
         n418TBM33_CRT_USER_ID = P002B5_n418TBM33_CRT_USER_ID[0] ;
         A419TBM33_CRT_PROG_NM = P002B5_A419TBM33_CRT_PROG_NM[0] ;
         n419TBM33_CRT_PROG_NM = P002B5_n419TBM33_CRT_PROG_NM[0] ;
         A420TBM33_UPD_DATETIME = P002B5_A420TBM33_UPD_DATETIME[0] ;
         n420TBM33_UPD_DATETIME = P002B5_n420TBM33_UPD_DATETIME[0] ;
         A421TBM33_UPD_USER_ID = P002B5_A421TBM33_UPD_USER_ID[0] ;
         n421TBM33_UPD_USER_ID = P002B5_n421TBM33_UPD_USER_ID[0] ;
         A422TBM33_UPD_PROG_NM = P002B5_A422TBM33_UPD_PROG_NM[0] ;
         n422TBM33_UPD_PROG_NM = P002B5_n422TBM33_UPD_PROG_NM[0] ;
         A423TBM33_UPD_CNT = P002B5_A423TBM33_UPD_CNT[0] ;
         n423TBM33_UPD_CNT = P002B5_n423TBM33_UPD_CNT[0] ;
         AV31W_ITEMS.clear();
         AV31W_ITEMS.add(GXutil.trim( GXutil.str( A76TBM33_STUDY_ID, 10, 0)), 0);
         AV31W_ITEMS.add(GXutil.trim( GXutil.str( A77TBM33_CRF_ID, 10, 0)), 0);
         AV31W_ITEMS.add(GXutil.trim( GXutil.str( A78TBM33_COND_NO, 10, 0)), 0);
         AV31W_ITEMS.add(A502TBM33_COND_NM, 0);
         AV31W_ITEMS.add(A414TBM33_EXPRESSION, 0);
         AV31W_ITEMS.add(A503TBM33_COND_DIV, 0);
         AV31W_ITEMS.add(A504TBM33_CRF_ITEM_CD, 0);
         AV31W_ITEMS.add(GXutil.trim( GXutil.str( A415TBM33_PRIOR_NO, 10, 0)), 0);
         AV31W_ITEMS.add(A505TBM33_ERR_DIV, 0);
         AV31W_ITEMS.add(A506TBM33_ERR_MSG, 0);
         AV31W_ITEMS.add(A646TBM33_ENABLED_FLG, 0);
         AV31W_ITEMS.add(A696TBM33_REQUIRED_INPUT_FLG, 0);
         AV31W_ITEMS.add(A697TBM33_NUMERIC_RANGE_FLG, 0);
         AV31W_ITEMS.add(A416TBM33_DEL_FLG, 0);
         new b808_pc02_data_log(remoteHandle, context).execute( AV39Pgmname, "DLT", "TBM33_CRF_COND", AV31W_ITEMS, A417TBM33_CRT_DATETIME, A418TBM33_CRT_USER_ID, A419TBM33_CRT_PROG_NM, A420TBM33_UPD_DATETIME, A421TBM33_UPD_USER_ID, A422TBM33_UPD_PROG_NM, A423TBM33_UPD_CNT) ;
         Gx_ope = "Delete" ;
         Gx_etb = "TBM33_CRF_COND" ;
         /* Using cursor P002B6 */
         pr_default.execute(4, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM33_CRF_COND") ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S151( )
   {
      /* 'SUB_OPTIMIZE_CRF' Routine */
      AV17P_ERR_CD = (short)(0) ;
      /* Using cursor P002B7 */
      pr_default.execute(5, new Object[] {new Short(AV17P_ERR_CD), new Long(AV35W_STUDY_ID), new Short(AV22W_CRF_ID)});
      AV17P_ERR_CD = P002B7_AV17P_ERR_CD[0] ;
      AV35W_STUDY_ID = P002B7_AV35W_STUDY_ID[0] ;
      AV22W_CRF_ID = P002B7_AV22W_CRF_ID[0] ;
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

   public void S161( )
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

   public void S171( )
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
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV39Pgmname, (short)(1), AV32W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char7) ;
      AV28W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char7[0] ;
      GXv_int5[0] = AV26W_ERR_CD ;
      GXv_char7[0] = AV27W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int5, GXv_char7) ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char7[0] ;
   }

   public void S181( )
   {
      /* 'SUB_ERROR' Routine */
      AV32W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV28W_EXTRA_INFO;
      GXv_int5[0] = AV26W_ERR_CD ;
      GXv_char7[0] = AV27W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV39Pgmname, (short)(0), AV32W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char7) ;
      AV28W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      ab502_pc02_up_crf_impl.this.AV26W_ERR_CD = GXv_int5[0] ;
      ab502_pc02_up_crf_impl.this.AV27W_ERR_MSG = GXv_char7[0] ;
      context.globals.Gx_eop = (byte)(0) ;
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
                  /* Execute user subroutine: S181 */
                  S181 ();
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
      AV39Pgmname = "" ;
      AV40Pgmdesc = "" ;
      AV30W_HTTP_RES = httpContext.getHttpResponse();
      A397TBM31_DEL_FLG = "" ;
      AV19P_STUDY_ID = "" ;
      AV13P_CRF_ID = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002B2_A369TBM21_DEL_FLG = new String[] {""} ;
      P002B2_n369TBM21_DEL_FLG = new boolean[] {false} ;
      P002B2_A63TBM21_STUDY_ID = new long[1] ;
      A369TBM21_DEL_FLG = "" ;
      P002B3_A397TBM31_DEL_FLG = new String[] {""} ;
      P002B3_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P002B3_A69TBM31_CRF_ID = new short[1] ;
      P002B3_A68TBM31_STUDY_ID = new long[1] ;
      AV9P_CRF = "" ;
      AV25W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      AV23W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      P002B4_A69TBM31_CRF_ID = new short[1] ;
      P002B4_A68TBM31_STUDY_ID = new long[1] ;
      P002B4_A397TBM31_DEL_FLG = new String[] {""} ;
      P002B4_n397TBM31_DEL_FLG = new boolean[] {false} ;
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
      P002B5_A77TBM33_CRF_ID = new short[1] ;
      P002B5_A76TBM33_STUDY_ID = new long[1] ;
      P002B5_A78TBM33_COND_NO = new short[1] ;
      P002B5_A502TBM33_COND_NM = new String[] {""} ;
      P002B5_n502TBM33_COND_NM = new boolean[] {false} ;
      P002B5_A414TBM33_EXPRESSION = new String[] {""} ;
      P002B5_n414TBM33_EXPRESSION = new boolean[] {false} ;
      P002B5_A503TBM33_COND_DIV = new String[] {""} ;
      P002B5_n503TBM33_COND_DIV = new boolean[] {false} ;
      P002B5_A504TBM33_CRF_ITEM_CD = new String[] {""} ;
      P002B5_n504TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      P002B5_A415TBM33_PRIOR_NO = new byte[1] ;
      P002B5_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      P002B5_A505TBM33_ERR_DIV = new String[] {""} ;
      P002B5_n505TBM33_ERR_DIV = new boolean[] {false} ;
      P002B5_A506TBM33_ERR_MSG = new String[] {""} ;
      P002B5_n506TBM33_ERR_MSG = new boolean[] {false} ;
      P002B5_A646TBM33_ENABLED_FLG = new String[] {""} ;
      P002B5_n646TBM33_ENABLED_FLG = new boolean[] {false} ;
      P002B5_A696TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      P002B5_n696TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P002B5_A697TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      P002B5_n697TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      P002B5_A416TBM33_DEL_FLG = new String[] {""} ;
      P002B5_n416TBM33_DEL_FLG = new boolean[] {false} ;
      P002B5_A417TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002B5_n417TBM33_CRT_DATETIME = new boolean[] {false} ;
      P002B5_A418TBM33_CRT_USER_ID = new String[] {""} ;
      P002B5_n418TBM33_CRT_USER_ID = new boolean[] {false} ;
      P002B5_A419TBM33_CRT_PROG_NM = new String[] {""} ;
      P002B5_n419TBM33_CRT_PROG_NM = new boolean[] {false} ;
      P002B5_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002B5_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      P002B5_A421TBM33_UPD_USER_ID = new String[] {""} ;
      P002B5_n421TBM33_UPD_USER_ID = new boolean[] {false} ;
      P002B5_A422TBM33_UPD_PROG_NM = new String[] {""} ;
      P002B5_n422TBM33_UPD_PROG_NM = new boolean[] {false} ;
      P002B5_A423TBM33_UPD_CNT = new long[1] ;
      P002B5_n423TBM33_UPD_CNT = new boolean[] {false} ;
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
      AV31W_ITEMS = new GxObjectCollection(String.class, "internal", "");
      P002B7_AV17P_ERR_CD = new short[1] ;
      P002B7_AV35W_STUDY_ID = new long[1] ;
      P002B7_AV22W_CRF_ID = new short[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char7 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab502_pc02_up_crf__default(),
         new Object[] {
             new Object[] {
            P002B2_A369TBM21_DEL_FLG, P002B2_n369TBM21_DEL_FLG, P002B2_A63TBM21_STUDY_ID
            }
            , new Object[] {
            P002B3_A397TBM31_DEL_FLG, P002B3_n397TBM31_DEL_FLG, P002B3_A69TBM31_CRF_ID, P002B3_A68TBM31_STUDY_ID
            }
            , new Object[] {
            P002B4_A69TBM31_CRF_ID, P002B4_A68TBM31_STUDY_ID, P002B4_A397TBM31_DEL_FLG, P002B4_n397TBM31_DEL_FLG
            }
            , new Object[] {
            P002B5_A77TBM33_CRF_ID, P002B5_A76TBM33_STUDY_ID, P002B5_A78TBM33_COND_NO, P002B5_A502TBM33_COND_NM, P002B5_n502TBM33_COND_NM, P002B5_A414TBM33_EXPRESSION, P002B5_n414TBM33_EXPRESSION, P002B5_A503TBM33_COND_DIV, P002B5_n503TBM33_COND_DIV, P002B5_A504TBM33_CRF_ITEM_CD,
            P002B5_n504TBM33_CRF_ITEM_CD, P002B5_A415TBM33_PRIOR_NO, P002B5_n415TBM33_PRIOR_NO, P002B5_A505TBM33_ERR_DIV, P002B5_n505TBM33_ERR_DIV, P002B5_A506TBM33_ERR_MSG, P002B5_n506TBM33_ERR_MSG, P002B5_A646TBM33_ENABLED_FLG, P002B5_n646TBM33_ENABLED_FLG, P002B5_A696TBM33_REQUIRED_INPUT_FLG,
            P002B5_n696TBM33_REQUIRED_INPUT_FLG, P002B5_A697TBM33_NUMERIC_RANGE_FLG, P002B5_n697TBM33_NUMERIC_RANGE_FLG, P002B5_A416TBM33_DEL_FLG, P002B5_n416TBM33_DEL_FLG, P002B5_A417TBM33_CRT_DATETIME, P002B5_n417TBM33_CRT_DATETIME, P002B5_A418TBM33_CRT_USER_ID, P002B5_n418TBM33_CRT_USER_ID, P002B5_A419TBM33_CRT_PROG_NM,
            P002B5_n419TBM33_CRT_PROG_NM, P002B5_A420TBM33_UPD_DATETIME, P002B5_n420TBM33_UPD_DATETIME, P002B5_A421TBM33_UPD_USER_ID, P002B5_n421TBM33_UPD_USER_ID, P002B5_A422TBM33_UPD_PROG_NM, P002B5_n422TBM33_UPD_PROG_NM, P002B5_A423TBM33_UPD_CNT, P002B5_n423TBM33_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            P002B7_AV17P_ERR_CD, P002B7_AV35W_STUDY_ID, P002B7_AV22W_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmdesc = "CRFアップロード" ;
      AV39Pgmname = "AB502_PC02_UP_CRF" ;
      /* GeneXus formulas. */
      AV40Pgmdesc = "CRFアップロード" ;
      AV39Pgmname = "AB502_PC02_UP_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV41GXLvl73 ;
   private byte AV42GXLvl92 ;
   private byte AV43GXLvl135 ;
   private byte A415TBM33_PRIOR_NO ;
   private short AV26W_ERR_CD ;
   private short AV22W_CRF_ID ;
   private short Gx_err ;
   private short A69TBM31_CRF_ID ;
   private short A77TBM33_CRF_ID ;
   private short A78TBM33_COND_NO ;
   private short AV17P_ERR_CD ;
   private short GXv_int5[] ;
   private int GXActiveErrHndl ;
   private long AV35W_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A76TBM33_STUDY_ID ;
   private long A423TBM33_UPD_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV39Pgmname ;
   private String AV40Pgmdesc ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String Gx_emsg ;
   private java.util.Date A417TBM33_CRT_DATETIME ;
   private java.util.Date A420TBM33_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n397TBM31_DEL_FLG ;
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
   private String AV8C_APP_ID ;
   private String AV27W_ERR_MSG ;
   private String AV33W_NEWLINE ;
   private String A397TBM31_DEL_FLG ;
   private String AV19P_STUDY_ID ;
   private String AV13P_CRF_ID ;
   private String A369TBM21_DEL_FLG ;
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
   private com.genexus.internet.HttpRequest AV29W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private String[] P002B2_A369TBM21_DEL_FLG ;
   private boolean[] P002B2_n369TBM21_DEL_FLG ;
   private long[] P002B2_A63TBM21_STUDY_ID ;
   private String[] P002B3_A397TBM31_DEL_FLG ;
   private boolean[] P002B3_n397TBM31_DEL_FLG ;
   private short[] P002B3_A69TBM31_CRF_ID ;
   private long[] P002B3_A68TBM31_STUDY_ID ;
   private short[] P002B4_A69TBM31_CRF_ID ;
   private long[] P002B4_A68TBM31_STUDY_ID ;
   private String[] P002B4_A397TBM31_DEL_FLG ;
   private boolean[] P002B4_n397TBM31_DEL_FLG ;
   private short[] P002B5_A77TBM33_CRF_ID ;
   private long[] P002B5_A76TBM33_STUDY_ID ;
   private short[] P002B5_A78TBM33_COND_NO ;
   private String[] P002B5_A502TBM33_COND_NM ;
   private boolean[] P002B5_n502TBM33_COND_NM ;
   private String[] P002B5_A414TBM33_EXPRESSION ;
   private boolean[] P002B5_n414TBM33_EXPRESSION ;
   private String[] P002B5_A503TBM33_COND_DIV ;
   private boolean[] P002B5_n503TBM33_COND_DIV ;
   private String[] P002B5_A504TBM33_CRF_ITEM_CD ;
   private boolean[] P002B5_n504TBM33_CRF_ITEM_CD ;
   private byte[] P002B5_A415TBM33_PRIOR_NO ;
   private boolean[] P002B5_n415TBM33_PRIOR_NO ;
   private String[] P002B5_A505TBM33_ERR_DIV ;
   private boolean[] P002B5_n505TBM33_ERR_DIV ;
   private String[] P002B5_A506TBM33_ERR_MSG ;
   private boolean[] P002B5_n506TBM33_ERR_MSG ;
   private String[] P002B5_A646TBM33_ENABLED_FLG ;
   private boolean[] P002B5_n646TBM33_ENABLED_FLG ;
   private String[] P002B5_A696TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] P002B5_n696TBM33_REQUIRED_INPUT_FLG ;
   private String[] P002B5_A697TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] P002B5_n697TBM33_NUMERIC_RANGE_FLG ;
   private String[] P002B5_A416TBM33_DEL_FLG ;
   private boolean[] P002B5_n416TBM33_DEL_FLG ;
   private java.util.Date[] P002B5_A417TBM33_CRT_DATETIME ;
   private boolean[] P002B5_n417TBM33_CRT_DATETIME ;
   private String[] P002B5_A418TBM33_CRT_USER_ID ;
   private boolean[] P002B5_n418TBM33_CRT_USER_ID ;
   private String[] P002B5_A419TBM33_CRT_PROG_NM ;
   private boolean[] P002B5_n419TBM33_CRT_PROG_NM ;
   private java.util.Date[] P002B5_A420TBM33_UPD_DATETIME ;
   private boolean[] P002B5_n420TBM33_UPD_DATETIME ;
   private String[] P002B5_A421TBM33_UPD_USER_ID ;
   private boolean[] P002B5_n421TBM33_UPD_USER_ID ;
   private String[] P002B5_A422TBM33_UPD_PROG_NM ;
   private boolean[] P002B5_n422TBM33_UPD_PROG_NM ;
   private long[] P002B5_A423TBM33_UPD_CNT ;
   private boolean[] P002B5_n423TBM33_UPD_CNT ;
   private short[] P002B7_AV17P_ERR_CD ;
   private long[] P002B7_AV35W_STUDY_ID ;
   private short[] P002B7_AV22W_CRF_ID ;
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
          new ForEachCursor("P002B2", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002B3", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002B4", "SELECT `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_DEL_FLG` FROM `TBM31_CRF` ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002B5", "SELECT `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NO`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_PROG_NM`, `TBM33_UPD_CNT` FROM `TBM33_CRF_COND` WHERE (`TBM33_STUDY_ID` = ?) AND (`TBM33_CRF_ID` = ?) ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002B6", "DELETE FROM `TBM33_CRF_COND`  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new CallCursor("P002B7", "CALL PROC_OPTIMIZE_CRF ( ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
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
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(15) ;
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
               ((long[]) buf[37])[0] = rslt.getLong(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 10);
               stmt.setVarchar(2, (String)parms[1], 4);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.NUMERIC, 0 );
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

