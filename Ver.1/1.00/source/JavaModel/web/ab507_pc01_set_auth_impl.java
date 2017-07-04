/*
               File: ab507_pc01_set_auth_impl
        Description: 入力権限レベル取得
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:26.5
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab507_pc01_set_auth_impl extends GXWebProcedure
{
   public ab507_pc01_set_auth_impl( com.genexus.internet.HttpContext context )
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
      AV8C_TAM02_APP_ID = "B507" ;
      AV16W_ERR_CD = (short)(0) ;
      AV17W_ERR_MSG = "" ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_TAM02_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18W_EXTRA_INFO", AV18W_EXTRA_INFO);
      AV24W_UPDATE_TIME = GXutil.now( ) ;
      /* Execute user subroutine: S11125 */
      S11125 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S12170 */
      S12170 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV27Pgmname, "INFO", "入力権限レベル取得") ;
      if ( AV16W_ERR_CD == 0 )
      {
         AV28GXLvl37 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TAM04_KNGN" ;
         /* Using cursor P003E2 */
         pr_default.execute(0, new Object[] {AV9P_AUTH_CD});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A18TAM04_DEL_FLG = P003E2_A18TAM04_DEL_FLG[0] ;
            n18TAM04_DEL_FLG = P003E2_n18TAM04_DEL_FLG[0] ;
            A17TAM04_AUTH_CD = P003E2_A17TAM04_AUTH_CD[0] ;
            A601TAM04_AUTH_LVL = P003E2_A601TAM04_AUTH_LVL[0] ;
            n601TAM04_AUTH_LVL = P003E2_n601TAM04_AUTH_LVL[0] ;
            AV28GXLvl37 = (byte)(1) ;
            AV22W_OWN_AUTH_LVL = A601TAM04_AUTH_LVL ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV28GXLvl37 == 0 )
         {
            AV16W_ERR_CD = (short)(9) ;
            GXt_char1 = AV17W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
            ab507_pc01_set_auth_impl.this.GXt_char1 = GXv_char2[0] ;
            AV17W_ERR_MSG = GXt_char1 ;
         }
         if ( AV16W_ERR_CD == 0 )
         {
            AV29GXLvl51 = (byte)(0) ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TBT02_CRF" ;
            /* Using cursor P003E3 */
            pr_default.execute(1, new Object[] {new Long(AV13P_STUDY_ID), new Integer(AV14P_SUBJECT_NO), new Short(AV11P_CRF_ID)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A295TBT02_DEL_FLG = P003E3_A295TBT02_DEL_FLG[0] ;
               n295TBT02_DEL_FLG = P003E3_n295TBT02_DEL_FLG[0] ;
               A294TBT02_CRF_ID = P003E3_A294TBT02_CRF_ID[0] ;
               A293TBT02_SUBJECT_ID = P003E3_A293TBT02_SUBJECT_ID[0] ;
               A292TBT02_STUDY_ID = P003E3_A292TBT02_STUDY_ID[0] ;
               A371TBT02_CRF_INPUT_LEVEL = P003E3_A371TBT02_CRF_INPUT_LEVEL[0] ;
               n371TBT02_CRF_INPUT_LEVEL = P003E3_n371TBT02_CRF_INPUT_LEVEL[0] ;
               A370TBT02_CRF_LATEST_VERSION = P003E3_A370TBT02_CRF_LATEST_VERSION[0] ;
               n370TBT02_CRF_LATEST_VERSION = P003E3_n370TBT02_CRF_LATEST_VERSION[0] ;
               A556TBT02_LOCK_FLG = P003E3_A556TBT02_LOCK_FLG[0] ;
               n556TBT02_LOCK_FLG = P003E3_n556TBT02_LOCK_FLG[0] ;
               A569TBT02_INPUT_END_FLG = P003E3_A569TBT02_INPUT_END_FLG[0] ;
               n569TBT02_INPUT_END_FLG = P003E3_n569TBT02_INPUT_END_FLG[0] ;
               A299TBT02_UPD_DATETIME = P003E3_A299TBT02_UPD_DATETIME[0] ;
               n299TBT02_UPD_DATETIME = P003E3_n299TBT02_UPD_DATETIME[0] ;
               A300TBT02_UPD_USER_ID = P003E3_A300TBT02_UPD_USER_ID[0] ;
               n300TBT02_UPD_USER_ID = P003E3_n300TBT02_UPD_USER_ID[0] ;
               A301TBT02_UPD_PROG_NM = P003E3_A301TBT02_UPD_PROG_NM[0] ;
               n301TBT02_UPD_PROG_NM = P003E3_n301TBT02_UPD_PROG_NM[0] ;
               AV29GXLvl51 = (byte)(1) ;
               if ( A371TBT02_CRF_INPUT_LEVEL > AV22W_OWN_AUTH_LVL + 1 )
               {
                  AV16W_ERR_CD = (short)(1) ;
                  GXt_char1 = AV17W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00058", "自身の入力権限レベルがたりない為、", "", "", "", "", GXv_char2) ;
                  ab507_pc01_set_auth_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV17W_ERR_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  Gx_ope = "Update" ;
                  Gx_etb = "TBT02_CRF" ;
                  /* Using cursor P003E4 */
                  pr_default.execute(2, new Object[] {new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
                  if (true) break;
               }
               if ( A371TBT02_CRF_INPUT_LEVEL <= AV10P_AUTH_LVL )
               {
                  AV16W_ERR_CD = (short)(1) ;
                  GXt_char1 = AV17W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00058", "変更後の入力権限レベルのほうが上の為、", "", "", "", "", GXv_char2) ;
                  ab507_pc01_set_auth_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV17W_ERR_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  Gx_ope = "Update" ;
                  Gx_etb = "TBT02_CRF" ;
                  /* Using cursor P003E5 */
                  pr_default.execute(3, new Object[] {new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
                  if (true) break;
               }
               if ( A370TBT02_CRF_LATEST_VERSION == 0 )
               {
                  AV16W_ERR_CD = (short)(1) ;
                  GXt_char1 = AV17W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00058", "CRFにまだ入力がない為、", "", "", "", "", GXv_char2) ;
                  ab507_pc01_set_auth_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV17W_ERR_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  Gx_ope = "Update" ;
                  Gx_etb = "TBT02_CRF" ;
                  /* Using cursor P003E6 */
                  pr_default.execute(4, new Object[] {new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
                  if (true) break;
               }
               if ( GXutil.strcmp(A556TBT02_LOCK_FLG, "0") != 0 )
               {
                  AV16W_ERR_CD = (short)(1) ;
                  GXt_char1 = AV17W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00058", "CRFがロック中の為、", "", "", "", "", GXv_char2) ;
                  ab507_pc01_set_auth_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV17W_ERR_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  Gx_ope = "Update" ;
                  Gx_etb = "TBT02_CRF" ;
                  /* Using cursor P003E7 */
                  pr_default.execute(5, new Object[] {new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
                  if (true) break;
               }
               if ( GXutil.strcmp(A569TBT02_INPUT_END_FLG, "1") == 0 )
               {
                  AV16W_ERR_CD = (short)(1) ;
                  GXt_char1 = AV17W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00058", "CRFが固定済みの為、", "", "", "", "", GXv_char2) ;
                  ab507_pc01_set_auth_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV17W_ERR_MSG = GXt_char1 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  Gx_ope = "Update" ;
                  Gx_etb = "TBT02_CRF" ;
                  /* Using cursor P003E8 */
                  pr_default.execute(6, new Object[] {new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
                  if (true) break;
               }
               A371TBT02_CRF_INPUT_LEVEL = AV10P_AUTH_LVL ;
               n371TBT02_CRF_INPUT_LEVEL = false ;
               A299TBT02_UPD_DATETIME = AV24W_UPDATE_TIME ;
               n299TBT02_UPD_DATETIME = false ;
               A300TBT02_UPD_USER_ID = AV15P_USER_ID ;
               n300TBT02_UPD_USER_ID = false ;
               A301TBT02_UPD_PROG_NM = AV27Pgmname ;
               n301TBT02_UPD_PROG_NM = false ;
               Gx_ope = "Update" ;
               Gx_etb = "TBT02_CRF" ;
               /* Using cursor P003E9 */
               pr_default.execute(7, new Object[] {new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV29GXLvl51 == 0 )
            {
               AV16W_ERR_CD = (short)(1) ;
               GXt_char1 = AV17W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
               ab507_pc01_set_auth_impl.this.GXt_char1 = GXv_char2[0] ;
               AV17W_ERR_MSG = GXt_char1 ;
            }
         }
      }
      AV20W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV16W_ERR_CD, 10, 0))+new b802_pc02_nl_airres(remoteHandle, context).executeUdp( ));
      AV20W_HTTP_RES.addString(AV17W_ERR_MSG);
      /* Execute user subroutine: S13186 */
      S13186 ();
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

   public void S11125( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV15P_USER_ID = AV19W_HTTP_REQ.getVariable("USER_ID") ;
      AV12P_PWD = AV19W_HTTP_REQ.getVariable("PW") ;
      AV13P_STUDY_ID = GXutil.lval( AV19W_HTTP_REQ.getVariable("STUDY_ID")) ;
      AV14P_SUBJECT_NO = (int)(GXutil.lval( AV19W_HTTP_REQ.getVariable("SUBJECT_NO"))) ;
      AV11P_CRF_ID = (short)(GXutil.lval( AV19W_HTTP_REQ.getVariable("CRF_ID"))) ;
      AV9P_AUTH_CD = AV19W_HTTP_REQ.getVariable("AUTH_CD") ;
      AV10P_AUTH_LVL = (byte)(GXutil.lval( AV19W_HTTP_REQ.getVariable("AUTH_LVL"))) ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV15P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV13P_STUDY_ID, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SUBJECT_NO" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV14P_SUBJECT_NO, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV11P_CRF_ID, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "AUTH_CD" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_AUTH_CD );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "AUTH_LVL" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV10P_AUTH_LVL, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23W_PARMS_ITEM", AV23W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV21W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV18W_EXTRA_INFO;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(1), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab507_pc01_set_auth_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab507_pc01_set_auth_impl.this.AV17W_ERR_MSG = GXv_char2[0] ;
   }

   public void S12170( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV20W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV15P_USER_ID ;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char5[0] = AV17W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV12P_PWD, GXv_int4, GXv_char5) ;
      ab507_pc01_set_auth_impl.this.AV15P_USER_ID = GXv_char2[0] ;
      ab507_pc01_set_auth_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab507_pc01_set_auth_impl.this.AV17W_ERR_MSG = GXv_char5[0] ;
   }

   public void S13186( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV16W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab507_pc01_set_auth");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab507_pc01_set_auth");
      }
      AV21W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV16W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV17W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV18W_EXTRA_INFO;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char5[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(1), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char5) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab507_pc01_set_auth_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab507_pc01_set_auth_impl.this.AV17W_ERR_MSG = GXv_char5[0] ;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char5[0] = AV17W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char5) ;
      ab507_pc01_set_auth_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab507_pc01_set_auth_impl.this.AV17W_ERR_MSG = GXv_char5[0] ;
   }

   public void S14205( )
   {
      /* 'SUB_ERROR' Routine */
      AV21W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV18W_EXTRA_INFO;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char5[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(0), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char5) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      ab507_pc01_set_auth_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab507_pc01_set_auth_impl.this.AV17W_ERR_MSG = GXv_char5[0] ;
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
                  /* Execute user subroutine: S14205 */
                  S14205 ();
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
      AV17W_ERR_MSG = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV24W_UPDATE_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV27Pgmname = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV9P_AUTH_CD = "" ;
      P003E2_A18TAM04_DEL_FLG = new String[] {""} ;
      P003E2_n18TAM04_DEL_FLG = new boolean[] {false} ;
      P003E2_A17TAM04_AUTH_CD = new String[] {""} ;
      P003E2_A601TAM04_AUTH_LVL = new byte[1] ;
      P003E2_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      A18TAM04_DEL_FLG = "" ;
      A17TAM04_AUTH_CD = "" ;
      P003E3_A295TBT02_DEL_FLG = new String[] {""} ;
      P003E3_n295TBT02_DEL_FLG = new boolean[] {false} ;
      P003E3_A294TBT02_CRF_ID = new short[1] ;
      P003E3_A293TBT02_SUBJECT_ID = new int[1] ;
      P003E3_A292TBT02_STUDY_ID = new long[1] ;
      P003E3_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P003E3_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P003E3_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      P003E3_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P003E3_A556TBT02_LOCK_FLG = new String[] {""} ;
      P003E3_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      P003E3_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P003E3_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P003E3_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P003E3_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      P003E3_A300TBT02_UPD_USER_ID = new String[] {""} ;
      P003E3_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      P003E3_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      P003E3_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      A295TBT02_DEL_FLG = "" ;
      A556TBT02_LOCK_FLG = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A300TBT02_UPD_USER_ID = "" ;
      A301TBT02_UPD_PROG_NM = "" ;
      AV15P_USER_ID = "" ;
      AV20W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV19W_HTTP_REQ = httpContext.getHttpRequest();
      AV12P_PWD = "" ;
      AV23W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO3 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char5 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab507_pc01_set_auth__default(),
         new Object[] {
             new Object[] {
            P003E2_A18TAM04_DEL_FLG, P003E2_n18TAM04_DEL_FLG, P003E2_A17TAM04_AUTH_CD, P003E2_A601TAM04_AUTH_LVL, P003E2_n601TAM04_AUTH_LVL
            }
            , new Object[] {
            P003E3_A295TBT02_DEL_FLG, P003E3_n295TBT02_DEL_FLG, P003E3_A294TBT02_CRF_ID, P003E3_A293TBT02_SUBJECT_ID, P003E3_A292TBT02_STUDY_ID, P003E3_A371TBT02_CRF_INPUT_LEVEL, P003E3_n371TBT02_CRF_INPUT_LEVEL, P003E3_A370TBT02_CRF_LATEST_VERSION, P003E3_n370TBT02_CRF_LATEST_VERSION, P003E3_A556TBT02_LOCK_FLG,
            P003E3_n556TBT02_LOCK_FLG, P003E3_A569TBT02_INPUT_END_FLG, P003E3_n569TBT02_INPUT_END_FLG, P003E3_A299TBT02_UPD_DATETIME, P003E3_n299TBT02_UPD_DATETIME, P003E3_A300TBT02_UPD_USER_ID, P003E3_n300TBT02_UPD_USER_ID, P003E3_A301TBT02_UPD_PROG_NM, P003E3_n301TBT02_UPD_PROG_NM
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
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV27Pgmname = "AB507_PC01_SET_AUTH" ;
      /* GeneXus formulas. */
      AV27Pgmname = "AB507_PC01_SET_AUTH" ;
      Gx_err = (short)(0) ;
   }

   private byte AV28GXLvl37 ;
   private byte A601TAM04_AUTH_LVL ;
   private byte AV22W_OWN_AUTH_LVL ;
   private byte AV29GXLvl51 ;
   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private byte AV10P_AUTH_LVL ;
   private short AV16W_ERR_CD ;
   private short AV11P_CRF_ID ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV14P_SUBJECT_NO ;
   private int A293TBT02_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13P_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV27Pgmname ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String Gx_emsg ;
   private java.util.Date AV24W_UPDATE_TIME ;
   private java.util.Date A299TBT02_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n18TAM04_DEL_FLG ;
   private boolean n601TAM04_AUTH_LVL ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n556TBT02_LOCK_FLG ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n299TBT02_UPD_DATETIME ;
   private boolean n300TBT02_UPD_USER_ID ;
   private boolean n301TBT02_UPD_PROG_NM ;
   private String AV8C_TAM02_APP_ID ;
   private String AV17W_ERR_MSG ;
   private String AV9P_AUTH_CD ;
   private String A18TAM04_DEL_FLG ;
   private String A17TAM04_AUTH_CD ;
   private String A295TBT02_DEL_FLG ;
   private String A556TBT02_LOCK_FLG ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A300TBT02_UPD_USER_ID ;
   private String A301TBT02_UPD_PROG_NM ;
   private String AV15P_USER_ID ;
   private String AV12P_PWD ;
   private String AV21W_MSG ;
   private com.genexus.internet.HttpRequest AV19W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private String[] P003E2_A18TAM04_DEL_FLG ;
   private boolean[] P003E2_n18TAM04_DEL_FLG ;
   private String[] P003E2_A17TAM04_AUTH_CD ;
   private byte[] P003E2_A601TAM04_AUTH_LVL ;
   private boolean[] P003E2_n601TAM04_AUTH_LVL ;
   private String[] P003E3_A295TBT02_DEL_FLG ;
   private boolean[] P003E3_n295TBT02_DEL_FLG ;
   private short[] P003E3_A294TBT02_CRF_ID ;
   private int[] P003E3_A293TBT02_SUBJECT_ID ;
   private long[] P003E3_A292TBT02_STUDY_ID ;
   private byte[] P003E3_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P003E3_n371TBT02_CRF_INPUT_LEVEL ;
   private short[] P003E3_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] P003E3_n370TBT02_CRF_LATEST_VERSION ;
   private String[] P003E3_A556TBT02_LOCK_FLG ;
   private boolean[] P003E3_n556TBT02_LOCK_FLG ;
   private String[] P003E3_A569TBT02_INPUT_END_FLG ;
   private boolean[] P003E3_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] P003E3_A299TBT02_UPD_DATETIME ;
   private boolean[] P003E3_n299TBT02_UPD_DATETIME ;
   private String[] P003E3_A300TBT02_UPD_USER_ID ;
   private boolean[] P003E3_n300TBT02_UPD_USER_ID ;
   private String[] P003E3_A301TBT02_UPD_PROG_NM ;
   private boolean[] P003E3_n301TBT02_UPD_PROG_NM ;
   private com.genexus.internet.HttpResponse AV20W_HTTP_RES ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO3[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV23W_PARMS_ITEM ;
}

final  class ab507_pc01_set_auth__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003E2", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_AUTH_LVL` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` = ?) AND (`TAM04_DEL_FLG` = '0') ORDER BY `TAM04_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P003E3", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_CRF_LATEST_VERSION`, `TBT02_LOCK_FLG`, `TBT02_INPUT_END_FLG`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_PROG_NM` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P003E4", "UPDATE `TBT02_CRF` SET `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003E5", "UPDATE `TBT02_CRF` SET `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003E6", "UPDATE `TBT02_CRF` SET `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003E7", "UPDATE `TBT02_CRF` SET `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003E8", "UPDATE `TBT02_CRF` SET `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003E9", "UPDATE `TBT02_CRF` SET `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((byte[]) buf[3])[0] = rslt.getByte(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
               stmt.setLong(5, ((Number) parms[8]).longValue());
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               break;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
               stmt.setLong(5, ((Number) parms[8]).longValue());
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               break;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
               stmt.setLong(5, ((Number) parms[8]).longValue());
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               break;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
               stmt.setLong(5, ((Number) parms[8]).longValue());
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               break;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
               stmt.setLong(5, ((Number) parms[8]).longValue());
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
               stmt.setLong(5, ((Number) parms[8]).longValue());
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               break;
      }
   }

}

