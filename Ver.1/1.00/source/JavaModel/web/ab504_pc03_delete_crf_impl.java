/*
               File: ab504_pc03_delete_crf_impl
        Description: CRF削除
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:22.81
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab504_pc03_delete_crf_impl extends GXWebProcedure
{
   public ab504_pc03_delete_crf_impl( com.genexus.internet.HttpContext context )
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
      AV8C_TAM02_APP_ID = "B504" ;
      AV15W_ERR_CD = (short)(0) ;
      AV16W_ERR_MSG = "" ;
      AV17W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV17W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_TAM02_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17W_EXTRA_INFO", AV17W_EXTRA_INFO);
      /* Execute user subroutine: S11175 */
      S11175 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S12210 */
      S12210 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV24Pgmname, "INFO", "CRF削除") ;
      if ( AV15W_ERR_CD == 0 )
      {
         AV25GXLvl37 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM21_STUDY" ;
         /* Using cursor P003A2 */
         pr_default.execute(0, new Object[] {new Long(AV11P_STUDY_ID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A186TBM21_STUDY_ID = P003A2_A186TBM21_STUDY_ID[0] ;
            A513TBM21_STATUS = P003A2_A513TBM21_STATUS[0] ;
            n513TBM21_STATUS = P003A2_n513TBM21_STATUS[0] ;
            AV25GXLvl37 = (byte)(1) ;
            if ( GXutil.strcmp(A513TBM21_STATUS, "2") == 0 )
            {
               AV15W_ERR_CD = (short)(1) ;
               GXt_char1 = AV16W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "完了の", "削除", "", "", GXv_char2) ;
               ab504_pc03_delete_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV16W_ERR_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV25GXLvl37 == 0 )
         {
            AV15W_ERR_CD = (short)(1) ;
            GXt_char1 = AV16W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            ab504_pc03_delete_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV16W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV15W_ERR_CD == 0 )
      {
         AV26GXLvl56 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT02_CRF" ;
         /* Using cursor P003A3 */
         pr_default.execute(1, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_NO), new Short(AV9P_CRF_ID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A294TBT02_CRF_ID = P003A3_A294TBT02_CRF_ID[0] ;
            A293TBT02_SUBJECT_ID = P003A3_A293TBT02_SUBJECT_ID[0] ;
            A292TBT02_STUDY_ID = P003A3_A292TBT02_STUDY_ID[0] ;
            A556TBT02_LOCK_FLG = P003A3_A556TBT02_LOCK_FLG[0] ;
            n556TBT02_LOCK_FLG = P003A3_n556TBT02_LOCK_FLG[0] ;
            A569TBT02_INPUT_END_FLG = P003A3_A569TBT02_INPUT_END_FLG[0] ;
            n569TBT02_INPUT_END_FLG = P003A3_n569TBT02_INPUT_END_FLG[0] ;
            AV26GXLvl56 = (byte)(1) ;
            if ( ( GXutil.strcmp(A556TBT02_LOCK_FLG, "1") == 0 ) || ( GXutil.strcmp(A556TBT02_LOCK_FLG, "2") == 0 ) )
            {
               AV15W_ERR_CD = (short)(1) ;
               GXt_char1 = AV16W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00038", "CRF", "ロック中または一時保存の", "削除", "", "", GXv_char2) ;
               ab504_pc03_delete_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV16W_ERR_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( GXutil.strcmp(A569TBT02_INPUT_END_FLG, "1") == 0 )
            {
               AV15W_ERR_CD = (short)(1) ;
               GXt_char1 = AV16W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00038", "CRF", "データ固定済の", "削除", "", "", GXv_char2) ;
               ab504_pc03_delete_crf_impl.this.GXt_char1 = GXv_char2[0] ;
               AV16W_ERR_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV26GXLvl56 == 0 )
         {
            AV15W_ERR_CD = (short)(1) ;
            GXt_char1 = AV16W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            ab504_pc03_delete_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV16W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV15W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT02_CRF" ;
         /* Using cursor P003A4 */
         pr_default.execute(2, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_NO), new Short(AV9P_CRF_ID)});
         /* End optimized DELETE. */
      }
      if ( AV15W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT11_CRF_HISTORY" ;
         /* Using cursor P003A5 */
         pr_default.execute(3, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_NO), new Short(AV9P_CRF_ID)});
         /* End optimized DELETE. */
      }
      if ( AV15W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT12_CRF_RESULT" ;
         /* Using cursor P003A6 */
         pr_default.execute(4, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_NO), new Short(AV9P_CRF_ID)});
         /* End optimized DELETE. */
      }
      if ( AV15W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT13_CRF_RES_HIS" ;
         /* Using cursor P003A7 */
         pr_default.execute(5, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_NO), new Short(AV9P_CRF_ID)});
         /* End optimized DELETE. */
      }
      if ( AV15W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT15_CRF_MEMO_LOC" ;
         /* Using cursor P003A8 */
         pr_default.execute(6, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_NO), new Short(AV9P_CRF_ID)});
         /* End optimized DELETE. */
      }
      if ( AV15W_ERR_CD == 0 )
      {
         Gx_ope = "Fetch" ;
         Gx_etb = "TBT14_CRF_MEMO" ;
         /* Using cursor P003A9 */
         pr_default.execute(7, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_NO), new Short(AV9P_CRF_ID)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A922TBT14_MEMO_NO = P003A9_A922TBT14_MEMO_NO[0] ;
            A330TBT14_SUBJECT_ID = P003A9_A330TBT14_SUBJECT_ID[0] ;
            A329TBT14_STUDY_ID = P003A9_A329TBT14_STUDY_ID[0] ;
            A331TBT14_CRF_ID = P003A9_A331TBT14_CRF_ID[0] ;
            n331TBT14_CRF_ID = P003A9_n331TBT14_CRF_ID[0] ;
            AV14W_DEL_FLG = "0" ;
            AV33GXLvl148 = (byte)(0) ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TBT15_CRF_MEMO_LOC" ;
            /* Using cursor P003A10 */
            pr_default.execute(8, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A345TBT15_STUDY_ID = P003A10_A345TBT15_STUDY_ID[0] ;
               A346TBT15_SUBJECT_ID = P003A10_A346TBT15_SUBJECT_ID[0] ;
               A925TBT15_MEMO_NO = P003A10_A925TBT15_MEMO_NO[0] ;
               AV33GXLvl148 = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(8);
            if ( AV33GXLvl148 == 0 )
            {
               AV14W_DEL_FLG = "1" ;
            }
            if ( GXutil.strcmp(AV14W_DEL_FLG, "1") == 0 )
            {
               Gx_ope = "Delete" ;
               Gx_etb = "TBT14_CRF_MEMO" ;
               /* Using cursor P003A11 */
               pr_default.execute(9, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
            }
            pr_default.readNext(7);
         }
         pr_default.close(7);
      }
      AV19W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV15W_ERR_CD, 10, 0))+new b802_pc02_nl_airres(remoteHandle, context).executeUdp( ));
      AV19W_HTTP_RES.addString(AV16W_ERR_MSG);
      /* Execute user subroutine: S13226 */
      S13226 ();
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

   public void S11175( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV13P_USER_ID = AV18W_HTTP_REQ.getVariable("USER_ID") ;
      AV10P_PWD = AV18W_HTTP_REQ.getVariable("PW") ;
      AV11P_STUDY_ID = GXutil.lval( AV18W_HTTP_REQ.getVariable("STUDY_ID")) ;
      AV12P_SUBJECT_NO = (int)(GXutil.lval( AV18W_HTTP_REQ.getVariable("SUBJECT_NO"))) ;
      AV9P_CRF_ID = (short)(GXutil.lval( AV18W_HTTP_REQ.getVariable("CRF_ID"))) ;
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_PARMS_ITEM", AV21W_PARMS_ITEM);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_PARMS_ITEM", AV21W_PARMS_ITEM);
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_PARMS_ITEM", AV21W_PARMS_ITEM);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV11P_STUDY_ID, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_PARMS_ITEM", AV21W_PARMS_ITEM);
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SUBJECT_NO" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_PARMS_ITEM", AV21W_PARMS_ITEM);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV12P_SUBJECT_NO, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_PARMS_ITEM", AV21W_PARMS_ITEM);
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_PARMS_ITEM", AV21W_PARMS_ITEM);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_CRF_ID, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_PARMS_ITEM", AV21W_PARMS_ITEM);
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV17W_EXTRA_INFO;
      GXv_int4[0] = AV15W_ERR_CD ;
      GXv_char2[0] = AV16W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char2) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab504_pc03_delete_crf_impl.this.AV15W_ERR_CD = GXv_int4[0] ;
      ab504_pc03_delete_crf_impl.this.AV16W_ERR_MSG = GXv_char2[0] ;
   }

   public void S12210( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV19W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV13P_USER_ID ;
      GXv_int4[0] = AV15W_ERR_CD ;
      GXv_char5[0] = AV16W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV10P_PWD, GXv_int4, GXv_char5) ;
      ab504_pc03_delete_crf_impl.this.AV13P_USER_ID = GXv_char2[0] ;
      ab504_pc03_delete_crf_impl.this.AV15W_ERR_CD = GXv_int4[0] ;
      ab504_pc03_delete_crf_impl.this.AV16W_ERR_MSG = GXv_char5[0] ;
   }

   public void S13226( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV15W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab504_pc03_delete_crf");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab504_pc03_delete_crf");
      }
      AV20W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV15W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV16W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV17W_EXTRA_INFO;
      GXv_int4[0] = AV15W_ERR_CD ;
      GXv_char5[0] = AV16W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char5) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab504_pc03_delete_crf_impl.this.AV15W_ERR_CD = GXv_int4[0] ;
      ab504_pc03_delete_crf_impl.this.AV16W_ERR_MSG = GXv_char5[0] ;
      GXv_int4[0] = AV15W_ERR_CD ;
      GXv_char5[0] = AV16W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char5) ;
      ab504_pc03_delete_crf_impl.this.AV15W_ERR_CD = GXv_int4[0] ;
      ab504_pc03_delete_crf_impl.this.AV16W_ERR_MSG = GXv_char5[0] ;
   }

   public void S14245( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV17W_EXTRA_INFO;
      GXv_int4[0] = AV15W_ERR_CD ;
      GXv_char5[0] = AV16W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char5) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab504_pc03_delete_crf_impl.this.AV15W_ERR_CD = GXv_int4[0] ;
      ab504_pc03_delete_crf_impl.this.AV16W_ERR_MSG = GXv_char5[0] ;
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
                  /* Execute user subroutine: S14245 */
                  S14245 ();
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
      AV8C_TAM02_APP_ID = "" ;
      AV16W_ERR_MSG = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV24Pgmname = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P003A2_A186TBM21_STUDY_ID = new long[1] ;
      P003A2_A513TBM21_STATUS = new String[] {""} ;
      P003A2_n513TBM21_STATUS = new boolean[] {false} ;
      A513TBM21_STATUS = "" ;
      P003A3_A294TBT02_CRF_ID = new short[1] ;
      P003A3_A293TBT02_SUBJECT_ID = new int[1] ;
      P003A3_A292TBT02_STUDY_ID = new long[1] ;
      P003A3_A556TBT02_LOCK_FLG = new String[] {""} ;
      P003A3_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      P003A3_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P003A3_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      A556TBT02_LOCK_FLG = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      P003A9_A922TBT14_MEMO_NO = new short[1] ;
      P003A9_A330TBT14_SUBJECT_ID = new int[1] ;
      P003A9_A329TBT14_STUDY_ID = new long[1] ;
      P003A9_A331TBT14_CRF_ID = new short[1] ;
      P003A9_n331TBT14_CRF_ID = new boolean[] {false} ;
      AV14W_DEL_FLG = "" ;
      P003A10_A345TBT15_STUDY_ID = new long[1] ;
      P003A10_A346TBT15_SUBJECT_ID = new int[1] ;
      P003A10_A925TBT15_MEMO_NO = new short[1] ;
      AV19W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV13P_USER_ID = "" ;
      AV18W_HTTP_REQ = httpContext.getHttpRequest();
      AV10P_PWD = "" ;
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV20W_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO3 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char5 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab504_pc03_delete_crf__default(),
         new Object[] {
             new Object[] {
            P003A2_A186TBM21_STUDY_ID, P003A2_A513TBM21_STATUS, P003A2_n513TBM21_STATUS
            }
            , new Object[] {
            P003A3_A294TBT02_CRF_ID, P003A3_A293TBT02_SUBJECT_ID, P003A3_A292TBT02_STUDY_ID, P003A3_A556TBT02_LOCK_FLG, P003A3_n556TBT02_LOCK_FLG, P003A3_A569TBT02_INPUT_END_FLG, P003A3_n569TBT02_INPUT_END_FLG
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
            }
            , new Object[] {
            P003A9_A922TBT14_MEMO_NO, P003A9_A330TBT14_SUBJECT_ID, P003A9_A329TBT14_STUDY_ID, P003A9_A331TBT14_CRF_ID, P003A9_n331TBT14_CRF_ID
            }
            , new Object[] {
            P003A10_A345TBT15_STUDY_ID, P003A10_A346TBT15_SUBJECT_ID, P003A10_A925TBT15_MEMO_NO
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "AB504_PC03_DELETE_CRF" ;
      /* GeneXus formulas. */
      AV24Pgmname = "AB504_PC03_DELETE_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25GXLvl37 ;
   private byte AV26GXLvl56 ;
   private byte AV33GXLvl148 ;
   private short AV15W_ERR_CD ;
   private short AV9P_CRF_ID ;
   private short A294TBT02_CRF_ID ;
   private short A922TBT14_MEMO_NO ;
   private short A331TBT14_CRF_ID ;
   private short A925TBT15_MEMO_NO ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV12P_SUBJECT_NO ;
   private int A293TBT02_SUBJECT_ID ;
   private int A330TBT14_SUBJECT_ID ;
   private int A346TBT15_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A329TBT14_STUDY_ID ;
   private long A345TBT15_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24Pgmname ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n513TBM21_STATUS ;
   private boolean n556TBT02_LOCK_FLG ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n331TBT14_CRF_ID ;
   private String AV8C_TAM02_APP_ID ;
   private String AV16W_ERR_MSG ;
   private String A513TBM21_STATUS ;
   private String A556TBT02_LOCK_FLG ;
   private String A569TBT02_INPUT_END_FLG ;
   private String AV14W_DEL_FLG ;
   private String AV13P_USER_ID ;
   private String AV10P_PWD ;
   private String AV20W_MSG ;
   private com.genexus.internet.HttpRequest AV18W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private long[] P003A2_A186TBM21_STUDY_ID ;
   private String[] P003A2_A513TBM21_STATUS ;
   private boolean[] P003A2_n513TBM21_STATUS ;
   private short[] P003A3_A294TBT02_CRF_ID ;
   private int[] P003A3_A293TBT02_SUBJECT_ID ;
   private long[] P003A3_A292TBT02_STUDY_ID ;
   private String[] P003A3_A556TBT02_LOCK_FLG ;
   private boolean[] P003A3_n556TBT02_LOCK_FLG ;
   private String[] P003A3_A569TBT02_INPUT_END_FLG ;
   private boolean[] P003A3_n569TBT02_INPUT_END_FLG ;
   private short[] P003A9_A922TBT14_MEMO_NO ;
   private int[] P003A9_A330TBT14_SUBJECT_ID ;
   private long[] P003A9_A329TBT14_STUDY_ID ;
   private short[] P003A9_A331TBT14_CRF_ID ;
   private boolean[] P003A9_n331TBT14_CRF_ID ;
   private long[] P003A10_A345TBT15_STUDY_ID ;
   private int[] P003A10_A346TBT15_SUBJECT_ID ;
   private short[] P003A10_A925TBT15_MEMO_NO ;
   private com.genexus.internet.HttpResponse AV19W_HTTP_RES ;
   private SdtB808_SD01_EXTRA_INFO AV17W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO3[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV21W_PARMS_ITEM ;
}

final  class ab504_pc03_delete_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003A2", "SELECT `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P003A3", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_LOCK_FLG`, `TBT02_INPUT_END_FLG` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P003A4", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003A5", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003A6", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003A7", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003A8", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE (`TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ?) AND (`TBT15_CRF_ID` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P003A9", "SELECT `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID`, `TBT14_CRF_ID` FROM `TBT14_CRF_MEMO` WHERE (`TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ?) AND (`TBT14_CRF_ID` = ?) ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("P003A10", "SELECT `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO` FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ? and `TBT15_MEMO_NO` = ? ORDER BY `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P003A11", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               break;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

