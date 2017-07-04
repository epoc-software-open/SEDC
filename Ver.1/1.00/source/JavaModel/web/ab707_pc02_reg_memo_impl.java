/*
               File: ab707_pc02_reg_memo_impl
        Description: ÉÅÉÇìoò^èàóù
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:23.73
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab707_pc02_reg_memo_impl extends GXWebProcedure
{
   public ab707_pc02_reg_memo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV15P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV16P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV13P_MEMO_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10P_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
            AV17P_SYORI_KBN = httpContext.GetNextPar( ) ;
            AV12P_MEMO_KBN = httpContext.GetNextPar( ) ;
            AV11P_MEMO = httpContext.GetNextPar( ) ;
            AV14P_REQUEST_USER_ID = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S14275 */
      S14275 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22W_ERR_FLG = "0" ;
      AV23W_ERR_MSG = "" ;
      if ( GXutil.strcmp(AV17P_SYORI_KBN, "1") == 0 )
      {
         /* Execute user subroutine: S1162 */
         S1162 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         /* Execute user subroutine: S13235 */
         S13235 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV22W_ERR_FLG, "0") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab707_pc02_reg_memo");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab707_pc02_reg_memo");
      }
      if ( GXutil.strcmp(AV22W_ERR_FLG, "0") == 0 )
      {
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Memo_no( AV27W_MEMO_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
      }
      else
      {
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd( "1" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg( AV23W_ERR_MSG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Memo_no( AV27W_MEMO_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
      }
      AV8HttpResponse.addString(AV18SD_B707_SD02_REG_MEMO_RTN.toJSonString());
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1162( )
   {
      /* 'SUB_CRF_MEMO_REG' Routine */
      AV37GXLvl65 = (byte)(0) ;
      /* Using cursor P006O2 */
      pr_default.execute(0, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV13P_MEMO_NO)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A922TBT14_MEMO_NO = P006O2_A922TBT14_MEMO_NO[0] ;
         A330TBT14_SUBJECT_ID = P006O2_A330TBT14_SUBJECT_ID[0] ;
         A329TBT14_STUDY_ID = P006O2_A329TBT14_STUDY_ID[0] ;
         A929TBT14_REQUEST_AUTH_CD = P006O2_A929TBT14_REQUEST_AUTH_CD[0] ;
         n929TBT14_REQUEST_AUTH_CD = P006O2_n929TBT14_REQUEST_AUTH_CD[0] ;
         A335TBT14_MEMO = P006O2_A335TBT14_MEMO[0] ;
         n335TBT14_MEMO = P006O2_n335TBT14_MEMO[0] ;
         A927TBT14_KAKUNIN_FLG = P006O2_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P006O2_n927TBT14_KAKUNIN_FLG[0] ;
         A341TBT14_UPD_DATETIME = P006O2_A341TBT14_UPD_DATETIME[0] ;
         n341TBT14_UPD_DATETIME = P006O2_n341TBT14_UPD_DATETIME[0] ;
         A342TBT14_UPD_USER_ID = P006O2_A342TBT14_UPD_USER_ID[0] ;
         n342TBT14_UPD_USER_ID = P006O2_n342TBT14_UPD_USER_ID[0] ;
         A343TBT14_UPD_PROG_NM = P006O2_A343TBT14_UPD_PROG_NM[0] ;
         n343TBT14_UPD_PROG_NM = P006O2_n343TBT14_UPD_PROG_NM[0] ;
         A344TBT14_UPD_CNT = P006O2_A344TBT14_UPD_CNT[0] ;
         n344TBT14_UPD_CNT = P006O2_n344TBT14_UPD_CNT[0] ;
         AV37GXLvl65 = (byte)(1) ;
         AV27W_MEMO_NO = AV13P_MEMO_NO ;
         if ( ( GXutil.strcmp(A335TBT14_MEMO, AV11P_MEMO) != 0 ) || ( GXutil.strcmp(A929TBT14_REQUEST_AUTH_CD, AV14P_REQUEST_USER_ID) != 0 ) )
         {
            A927TBT14_KAKUNIN_FLG = "0" ;
            n927TBT14_KAKUNIN_FLG = false ;
         }
         A335TBT14_MEMO = AV11P_MEMO ;
         n335TBT14_MEMO = false ;
         if ( GXutil.strcmp(AV12P_MEMO_KBN, "2") == 0 )
         {
            A929TBT14_REQUEST_AUTH_CD = AV14P_REQUEST_USER_ID ;
            n929TBT14_REQUEST_AUTH_CD = false ;
         }
         A341TBT14_UPD_DATETIME = GXutil.now( ) ;
         n341TBT14_UPD_DATETIME = false ;
         A342TBT14_UPD_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n342TBT14_UPD_USER_ID = false ;
         A343TBT14_UPD_PROG_NM = AV38Pgmname ;
         n343TBT14_UPD_PROG_NM = false ;
         A344TBT14_UPD_CNT = (long)(A344TBT14_UPD_CNT+1) ;
         n344TBT14_UPD_CNT = false ;
         AV26W_LOGTEXT = "" ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV16P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO_NO:" + GXutil.trim( GXutil.str( AV13P_MEMO_NO, 3, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO:" + AV11P_MEMO + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "REQUEST_SITE_ID:" + AV32W_SITE_ID + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "REQUEST_AUTH_CD:" + AV21W_AUTH_CD + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = GXutil.strReplace( AV26W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV38Pgmname, "UPD", AV26W_LOGTEXT) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P006O3 */
         pr_default.execute(1, new Object[] {new Boolean(n929TBT14_REQUEST_AUTH_CD), A929TBT14_REQUEST_AUTH_CD, new Boolean(n335TBT14_MEMO), A335TBT14_MEMO, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n341TBT14_UPD_DATETIME), A341TBT14_UPD_DATETIME, new Boolean(n342TBT14_UPD_USER_ID), A342TBT14_UPD_USER_ID, new Boolean(n343TBT14_UPD_PROG_NM), A343TBT14_UPD_PROG_NM, new Boolean(n344TBT14_UPD_CNT), new Long(A344TBT14_UPD_CNT), new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
         if (true) break;
         /* Using cursor P006O4 */
         pr_default.execute(2, new Object[] {new Boolean(n929TBT14_REQUEST_AUTH_CD), A929TBT14_REQUEST_AUTH_CD, new Boolean(n335TBT14_MEMO), A335TBT14_MEMO, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n341TBT14_UPD_DATETIME), A341TBT14_UPD_DATETIME, new Boolean(n342TBT14_UPD_USER_ID), A342TBT14_UPD_USER_ID, new Boolean(n343TBT14_UPD_PROG_NM), A343TBT14_UPD_PROG_NM, new Boolean(n344TBT14_UPD_CNT), new Long(A344TBT14_UPD_CNT), new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV37GXLvl65 == 0 )
      {
         /* Using cursor P006O5 */
         pr_default.execute(3, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV9P_CRF_ID)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A294TBT02_CRF_ID = P006O5_A294TBT02_CRF_ID[0] ;
            A293TBT02_SUBJECT_ID = P006O5_A293TBT02_SUBJECT_ID[0] ;
            A292TBT02_STUDY_ID = P006O5_A292TBT02_STUDY_ID[0] ;
            A370TBT02_CRF_LATEST_VERSION = P006O5_A370TBT02_CRF_LATEST_VERSION[0] ;
            n370TBT02_CRF_LATEST_VERSION = P006O5_n370TBT02_CRF_LATEST_VERSION[0] ;
            AV33W_TBT14_CRF_VERSION = A370TBT02_CRF_LATEST_VERSION ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV40GXLvl128 = (byte)(0) ;
         /* Using cursor P006O6 */
         pr_default.execute(4, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A329TBT14_STUDY_ID = P006O6_A329TBT14_STUDY_ID[0] ;
            A330TBT14_SUBJECT_ID = P006O6_A330TBT14_SUBJECT_ID[0] ;
            A922TBT14_MEMO_NO = P006O6_A922TBT14_MEMO_NO[0] ;
            AV40GXLvl128 = (byte)(1) ;
            AV27W_MEMO_NO = (short)(A922TBT14_MEMO_NO+1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( AV40GXLvl128 == 0 )
         {
            AV27W_MEMO_NO = (short)(1) ;
         }
         /*
            INSERT RECORD ON TABLE TBT14_CRF_MEMO

         */
         A329TBT14_STUDY_ID = AV15P_STUDY_ID ;
         A330TBT14_SUBJECT_ID = AV16P_SUBJECT_ID ;
         A922TBT14_MEMO_NO = AV27W_MEMO_NO ;
         A331TBT14_CRF_ID = AV9P_CRF_ID ;
         n331TBT14_CRF_ID = false ;
         A332TBT14_CRF_VERSION = AV33W_TBT14_CRF_VERSION ;
         n332TBT14_CRF_VERSION = false ;
         A923TBT14_MEMO_KBN = AV12P_MEMO_KBN ;
         n923TBT14_MEMO_KBN = false ;
         A335TBT14_MEMO = AV11P_MEMO ;
         n335TBT14_MEMO = false ;
         if ( GXutil.strcmp(AV12P_MEMO_KBN, "2") == 0 )
         {
            /* Execute user subroutine: S125 */
            S125 ();
            if (returnInSub) return;
            A928TBT14_REQUEST_SITE_ID = AV32W_SITE_ID ;
            n928TBT14_REQUEST_SITE_ID = false ;
            A929TBT14_REQUEST_AUTH_CD = AV14P_REQUEST_USER_ID ;
            n929TBT14_REQUEST_AUTH_CD = false ;
         }
         A930TBT14_CRT_AUTH_CD = AV19SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd() ;
         n930TBT14_CRT_AUTH_CD = false ;
         A927TBT14_KAKUNIN_FLG = "0" ;
         n927TBT14_KAKUNIN_FLG = false ;
         A924TBT14_KANRYO_FLG = "0" ;
         n924TBT14_KANRYO_FLG = false ;
         A337TBT14_DEL_FLG = "0" ;
         n337TBT14_DEL_FLG = false ;
         A338TBT14_CRT_DATETIME = GXutil.now( ) ;
         n338TBT14_CRT_DATETIME = false ;
         A339TBT14_CRT_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n339TBT14_CRT_USER_ID = false ;
         A340TBT14_CRT_PROG_NM = AV38Pgmname ;
         n340TBT14_CRT_PROG_NM = false ;
         A341TBT14_UPD_DATETIME = GXutil.now( ) ;
         n341TBT14_UPD_DATETIME = false ;
         A342TBT14_UPD_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n342TBT14_UPD_USER_ID = false ;
         A343TBT14_UPD_PROG_NM = AV38Pgmname ;
         n343TBT14_UPD_PROG_NM = false ;
         A344TBT14_UPD_CNT = 1 ;
         n344TBT14_UPD_CNT = false ;
         /* Using cursor P006O7 */
         pr_default.execute(5, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO), new Boolean(n331TBT14_CRF_ID), new Short(A331TBT14_CRF_ID), new Boolean(n332TBT14_CRF_VERSION), new Short(A332TBT14_CRF_VERSION), new Boolean(n923TBT14_MEMO_KBN), A923TBT14_MEMO_KBN, new Boolean(n335TBT14_MEMO), A335TBT14_MEMO, new Boolean(n928TBT14_REQUEST_SITE_ID), A928TBT14_REQUEST_SITE_ID, new Boolean(n929TBT14_REQUEST_AUTH_CD), A929TBT14_REQUEST_AUTH_CD, new Boolean(n930TBT14_CRT_AUTH_CD), A930TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n924TBT14_KANRYO_FLG), A924TBT14_KANRYO_FLG, new Boolean(n337TBT14_DEL_FLG), A337TBT14_DEL_FLG, new Boolean(n338TBT14_CRT_DATETIME), A338TBT14_CRT_DATETIME, new Boolean(n339TBT14_CRT_USER_ID), A339TBT14_CRT_USER_ID, new Boolean(n340TBT14_CRT_PROG_NM), A340TBT14_CRT_PROG_NM, new Boolean(n341TBT14_UPD_DATETIME), A341TBT14_UPD_DATETIME, new Boolean(n342TBT14_UPD_USER_ID), A342TBT14_UPD_USER_ID, new Boolean(n343TBT14_UPD_PROG_NM), A343TBT14_UPD_PROG_NM, new Boolean(n344TBT14_UPD_CNT), new Long(A344TBT14_UPD_CNT)});
         if ( (pr_default.getStatus(5) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TBT15_CRF_MEMO_LOC

         */
         A345TBT15_STUDY_ID = AV15P_STUDY_ID ;
         A346TBT15_SUBJECT_ID = AV16P_SUBJECT_ID ;
         A925TBT15_MEMO_NO = AV27W_MEMO_NO ;
         A347TBT15_CRF_ID = AV9P_CRF_ID ;
         n347TBT15_CRF_ID = false ;
         A348TBT15_CRF_VERSION = AV33W_TBT14_CRF_VERSION ;
         n348TBT15_CRF_VERSION = false ;
         A926TBT15_CRF_ITEM_GRP_CD = AV10P_CRF_ITEM_GRP_CD ;
         n926TBT15_CRF_ITEM_GRP_CD = false ;
         A351TBT15_DEL_FLG = "0" ;
         n351TBT15_DEL_FLG = false ;
         A352TBT15_CRT_DATETIME = GXutil.now( ) ;
         n352TBT15_CRT_DATETIME = false ;
         A353TBT15_CRT_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n353TBT15_CRT_USER_ID = false ;
         A354TBT15_CRT_PROG_NM = AV38Pgmname ;
         n354TBT15_CRT_PROG_NM = false ;
         A355TBT15_UPD_DATETIME = GXutil.now( ) ;
         n355TBT15_UPD_DATETIME = false ;
         A356TBT15_UPD_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n356TBT15_UPD_USER_ID = false ;
         A357TBT15_UPD_PROG_NM = AV38Pgmname ;
         n357TBT15_UPD_PROG_NM = false ;
         A358TBT15_UPD_CNT = 1 ;
         n358TBT15_UPD_CNT = false ;
         /* Using cursor P006O8 */
         pr_default.execute(6, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO), new Boolean(n347TBT15_CRF_ID), new Short(A347TBT15_CRF_ID), new Boolean(n348TBT15_CRF_VERSION), new Short(A348TBT15_CRF_VERSION), new Boolean(n926TBT15_CRF_ITEM_GRP_CD), A926TBT15_CRF_ITEM_GRP_CD, new Boolean(n351TBT15_DEL_FLG), A351TBT15_DEL_FLG, new Boolean(n352TBT15_CRT_DATETIME), A352TBT15_CRT_DATETIME, new Boolean(n353TBT15_CRT_USER_ID), A353TBT15_CRT_USER_ID, new Boolean(n354TBT15_CRT_PROG_NM), A354TBT15_CRT_PROG_NM, new Boolean(n355TBT15_UPD_DATETIME), A355TBT15_UPD_DATETIME, new Boolean(n356TBT15_UPD_USER_ID), A356TBT15_UPD_USER_ID, new Boolean(n357TBT15_UPD_PROG_NM), A357TBT15_UPD_PROG_NM, new Boolean(n358TBT15_UPD_CNT), new Long(A358TBT15_UPD_CNT)});
         if ( (pr_default.getStatus(6) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         AV26W_LOGTEXT = "" ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV16P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO_NO:" + GXutil.trim( GXutil.str( AV13P_MEMO_NO, 3, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV9P_CRF_ID, 4, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "CRF_VERSION:" + GXutil.trim( GXutil.str( AV33W_TBT14_CRF_VERSION, 4, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "CRF_ITEM_GRP_CD:" + AV10P_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO_KBN:" + AV12P_MEMO_KBN + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO:" + AV11P_MEMO + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "REQUEST_SITE_ID:" + AV32W_SITE_ID + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "REQUEST_AUTH_CD:" + AV21W_AUTH_CD + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "CRT_AUTH_CD:" + AV19SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd() + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = GXutil.strReplace( AV26W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV38Pgmname, "INS", AV26W_LOGTEXT) ;
      }
   }

   public void S125( )
   {
      /* 'SUB_SITE_ID_GET' Routine */
      AV41GXLvl219 = (byte)(0) ;
      /* Using cursor P006O9 */
      pr_default.execute(7, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV9P_CRF_ID)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A294TBT02_CRF_ID = P006O9_A294TBT02_CRF_ID[0] ;
         A293TBT02_SUBJECT_ID = P006O9_A293TBT02_SUBJECT_ID[0] ;
         A292TBT02_STUDY_ID = P006O9_A292TBT02_STUDY_ID[0] ;
         A613TBT01_SITE_ID = P006O9_A613TBT01_SITE_ID[0] ;
         n613TBT01_SITE_ID = P006O9_n613TBT01_SITE_ID[0] ;
         A613TBT01_SITE_ID = P006O9_A613TBT01_SITE_ID[0] ;
         n613TBT01_SITE_ID = P006O9_n613TBT01_SITE_ID[0] ;
         AV41GXLvl219 = (byte)(1) ;
         AV32W_SITE_ID = A613TBT01_SITE_ID ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      if ( AV41GXLvl219 == 0 )
      {
         AV32W_SITE_ID = "" ;
      }
   }

   public void S13235( )
   {
      /* 'SUB_CRF_MEMO_DEL' Routine */
      /* Optimized DELETE. */
      /* Using cursor P006O10 */
      pr_default.execute(8, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV13P_MEMO_NO)});
      /* End optimized DELETE. */
      /* Using cursor P006O11 */
      pr_default.execute(9, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV13P_MEMO_NO)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A922TBT14_MEMO_NO = P006O11_A922TBT14_MEMO_NO[0] ;
         A330TBT14_SUBJECT_ID = P006O11_A330TBT14_SUBJECT_ID[0] ;
         A329TBT14_STUDY_ID = P006O11_A329TBT14_STUDY_ID[0] ;
         /* Using cursor P006O12 */
         pr_default.execute(10, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
         AV26W_LOGTEXT = "" ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV16P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO_NO:" + GXutil.trim( GXutil.str( AV13P_MEMO_NO, 3, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = GXutil.strReplace( AV26W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV38Pgmname, "DEL", AV26W_LOGTEXT) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S14275( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT2[0] = AV20W_A_LOGIN_SDT;
      GXv_char3[0] = AV24W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT2, GXv_char3) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT2[0] ;
      ab707_pc02_reg_memo_impl.this.AV24W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
      {
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd( "9" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
         AV8HttpResponse.addString(AV18SD_B707_SD02_REG_MEMO_RTN.toJSonString());
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV31W_SESSION_KEY ;
      GXv_char3[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char3) ;
      ab707_pc02_reg_memo_impl.this.GXt_char1 = GXv_char3[0] ;
      AV31W_SESSION_KEY = GXt_char1 ;
      AV19SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV34W_SESSION.getValue(AV31W_SESSION_KEY), "");
      new a804_pc02_log_start(remoteHandle, context).execute( AV38Pgmname) ;
   }

   public void S15302( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_ERR_FLG = "1" ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV38Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd( "9" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
      AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg( GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SD_B707_SD02_REG_MEMO_RTN", AV18SD_B707_SD02_REG_MEMO_RTN);
      AV8HttpResponse.addString(AV18SD_B707_SD02_REG_MEMO_RTN.toJSonString());
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
                  /* Execute user subroutine: S15302 */
                  S15302 ();
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
      AV10P_CRF_ITEM_GRP_CD = "" ;
      AV17P_SYORI_KBN = "" ;
      AV12P_MEMO_KBN = "" ;
      AV11P_MEMO = "" ;
      AV14P_REQUEST_USER_ID = "" ;
      AV22W_ERR_FLG = "" ;
      AV23W_ERR_MSG = "" ;
      AV18SD_B707_SD02_REG_MEMO_RTN = new SdtB707_SD02_REG_MEMO_RTN(remoteHandle, context);
      AV8HttpResponse = httpContext.getHttpResponse();
      scmdbuf = "" ;
      P006O2_A922TBT14_MEMO_NO = new short[1] ;
      P006O2_A330TBT14_SUBJECT_ID = new int[1] ;
      P006O2_A329TBT14_STUDY_ID = new long[1] ;
      P006O2_A929TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      P006O2_n929TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      P006O2_A335TBT14_MEMO = new String[] {""} ;
      P006O2_n335TBT14_MEMO = new boolean[] {false} ;
      P006O2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      P006O2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      P006O2_A341TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P006O2_n341TBT14_UPD_DATETIME = new boolean[] {false} ;
      P006O2_A342TBT14_UPD_USER_ID = new String[] {""} ;
      P006O2_n342TBT14_UPD_USER_ID = new boolean[] {false} ;
      P006O2_A343TBT14_UPD_PROG_NM = new String[] {""} ;
      P006O2_n343TBT14_UPD_PROG_NM = new boolean[] {false} ;
      P006O2_A344TBT14_UPD_CNT = new long[1] ;
      P006O2_n344TBT14_UPD_CNT = new boolean[] {false} ;
      A929TBT14_REQUEST_AUTH_CD = "" ;
      A335TBT14_MEMO = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A341TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A342TBT14_UPD_USER_ID = "" ;
      A343TBT14_UPD_PROG_NM = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV38Pgmname = "" ;
      AV26W_LOGTEXT = "" ;
      AV32W_SITE_ID = "" ;
      AV21W_AUTH_CD = "" ;
      P006O5_A294TBT02_CRF_ID = new short[1] ;
      P006O5_A293TBT02_SUBJECT_ID = new int[1] ;
      P006O5_A292TBT02_STUDY_ID = new long[1] ;
      P006O5_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      P006O5_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P006O6_A329TBT14_STUDY_ID = new long[1] ;
      P006O6_A330TBT14_SUBJECT_ID = new int[1] ;
      P006O6_A922TBT14_MEMO_NO = new short[1] ;
      A923TBT14_MEMO_KBN = "" ;
      A928TBT14_REQUEST_SITE_ID = "" ;
      A930TBT14_CRT_AUTH_CD = "" ;
      AV19SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      A924TBT14_KANRYO_FLG = "" ;
      A337TBT14_DEL_FLG = "" ;
      A338TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A339TBT14_CRT_USER_ID = "" ;
      A340TBT14_CRT_PROG_NM = "" ;
      Gx_emsg = "" ;
      A926TBT15_CRF_ITEM_GRP_CD = "" ;
      A351TBT15_DEL_FLG = "" ;
      A352TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A353TBT15_CRT_USER_ID = "" ;
      A354TBT15_CRT_PROG_NM = "" ;
      A355TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A356TBT15_UPD_USER_ID = "" ;
      A357TBT15_UPD_PROG_NM = "" ;
      P006O9_A294TBT02_CRF_ID = new short[1] ;
      P006O9_A293TBT02_SUBJECT_ID = new int[1] ;
      P006O9_A292TBT02_STUDY_ID = new long[1] ;
      P006O9_A613TBT01_SITE_ID = new String[] {""} ;
      P006O9_n613TBT01_SITE_ID = new boolean[] {false} ;
      A613TBT01_SITE_ID = "" ;
      P006O11_A922TBT14_MEMO_NO = new short[1] ;
      P006O11_A330TBT14_SUBJECT_ID = new int[1] ;
      P006O11_A329TBT14_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT2 = new SdtA_LOGIN_SDT [1] ;
      AV24W_ERRCD = "" ;
      AV31W_SESSION_KEY = "" ;
      GXv_char3 = new String [1] ;
      AV34W_SESSION = httpContext.getWebSession();
      GXt_char1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab707_pc02_reg_memo__default(),
         new Object[] {
             new Object[] {
            P006O2_A922TBT14_MEMO_NO, P006O2_A330TBT14_SUBJECT_ID, P006O2_A329TBT14_STUDY_ID, P006O2_A929TBT14_REQUEST_AUTH_CD, P006O2_n929TBT14_REQUEST_AUTH_CD, P006O2_A335TBT14_MEMO, P006O2_n335TBT14_MEMO, P006O2_A927TBT14_KAKUNIN_FLG, P006O2_n927TBT14_KAKUNIN_FLG, P006O2_A341TBT14_UPD_DATETIME,
            P006O2_n341TBT14_UPD_DATETIME, P006O2_A342TBT14_UPD_USER_ID, P006O2_n342TBT14_UPD_USER_ID, P006O2_A343TBT14_UPD_PROG_NM, P006O2_n343TBT14_UPD_PROG_NM, P006O2_A344TBT14_UPD_CNT, P006O2_n344TBT14_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006O5_A294TBT02_CRF_ID, P006O5_A293TBT02_SUBJECT_ID, P006O5_A292TBT02_STUDY_ID, P006O5_A370TBT02_CRF_LATEST_VERSION, P006O5_n370TBT02_CRF_LATEST_VERSION
            }
            , new Object[] {
            P006O6_A329TBT14_STUDY_ID, P006O6_A330TBT14_SUBJECT_ID, P006O6_A922TBT14_MEMO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006O9_A294TBT02_CRF_ID, P006O9_A293TBT02_SUBJECT_ID, P006O9_A292TBT02_STUDY_ID, P006O9_A613TBT01_SITE_ID, P006O9_n613TBT01_SITE_ID
            }
            , new Object[] {
            }
            , new Object[] {
            P006O11_A922TBT14_MEMO_NO, P006O11_A330TBT14_SUBJECT_ID, P006O11_A329TBT14_STUDY_ID
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV38Pgmname = "AB707_PC02_REG_MEMO" ;
      /* GeneXus formulas. */
      AV38Pgmname = "AB707_PC02_REG_MEMO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV37GXLvl65 ;
   private byte AV40GXLvl128 ;
   private byte AV41GXLvl219 ;
   private short AV13P_MEMO_NO ;
   private short AV9P_CRF_ID ;
   private short AV27W_MEMO_NO ;
   private short A922TBT14_MEMO_NO ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short AV33W_TBT14_CRF_VERSION ;
   private short A331TBT14_CRF_ID ;
   private short A332TBT14_CRF_VERSION ;
   private short Gx_err ;
   private short A925TBT15_MEMO_NO ;
   private short A347TBT15_CRF_ID ;
   private short A348TBT15_CRF_VERSION ;
   private int AV16P_SUBJECT_ID ;
   private int A330TBT14_SUBJECT_ID ;
   private int A293TBT02_SUBJECT_ID ;
   private int GX_INS27 ;
   private int GX_INS28 ;
   private int A346TBT15_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV15P_STUDY_ID ;
   private long A329TBT14_STUDY_ID ;
   private long A344TBT14_UPD_CNT ;
   private long A292TBT02_STUDY_ID ;
   private long A345TBT15_STUDY_ID ;
   private long A358TBT15_UPD_CNT ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String AV38Pgmname ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private java.util.Date A341TBT14_UPD_DATETIME ;
   private java.util.Date A338TBT14_CRT_DATETIME ;
   private java.util.Date A352TBT15_CRT_DATETIME ;
   private java.util.Date A355TBT15_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n929TBT14_REQUEST_AUTH_CD ;
   private boolean n335TBT14_MEMO ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n341TBT14_UPD_DATETIME ;
   private boolean n342TBT14_UPD_USER_ID ;
   private boolean n343TBT14_UPD_PROG_NM ;
   private boolean n344TBT14_UPD_CNT ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n331TBT14_CRF_ID ;
   private boolean n332TBT14_CRF_VERSION ;
   private boolean n923TBT14_MEMO_KBN ;
   private boolean n928TBT14_REQUEST_SITE_ID ;
   private boolean n930TBT14_CRT_AUTH_CD ;
   private boolean n924TBT14_KANRYO_FLG ;
   private boolean n337TBT14_DEL_FLG ;
   private boolean n338TBT14_CRT_DATETIME ;
   private boolean n339TBT14_CRT_USER_ID ;
   private boolean n340TBT14_CRT_PROG_NM ;
   private boolean n347TBT15_CRF_ID ;
   private boolean n348TBT15_CRF_VERSION ;
   private boolean n926TBT15_CRF_ITEM_GRP_CD ;
   private boolean n351TBT15_DEL_FLG ;
   private boolean n352TBT15_CRT_DATETIME ;
   private boolean n353TBT15_CRT_USER_ID ;
   private boolean n354TBT15_CRT_PROG_NM ;
   private boolean n355TBT15_UPD_DATETIME ;
   private boolean n356TBT15_UPD_USER_ID ;
   private boolean n357TBT15_UPD_PROG_NM ;
   private boolean n358TBT15_UPD_CNT ;
   private boolean n613TBT01_SITE_ID ;
   private String AV10P_CRF_ITEM_GRP_CD ;
   private String AV17P_SYORI_KBN ;
   private String AV12P_MEMO_KBN ;
   private String AV11P_MEMO ;
   private String AV14P_REQUEST_USER_ID ;
   private String AV22W_ERR_FLG ;
   private String AV23W_ERR_MSG ;
   private String A929TBT14_REQUEST_AUTH_CD ;
   private String A335TBT14_MEMO ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A342TBT14_UPD_USER_ID ;
   private String A343TBT14_UPD_PROG_NM ;
   private String AV26W_LOGTEXT ;
   private String AV32W_SITE_ID ;
   private String AV21W_AUTH_CD ;
   private String A923TBT14_MEMO_KBN ;
   private String A928TBT14_REQUEST_SITE_ID ;
   private String A930TBT14_CRT_AUTH_CD ;
   private String A924TBT14_KANRYO_FLG ;
   private String A337TBT14_DEL_FLG ;
   private String A339TBT14_CRT_USER_ID ;
   private String A340TBT14_CRT_PROG_NM ;
   private String A926TBT15_CRF_ITEM_GRP_CD ;
   private String A351TBT15_DEL_FLG ;
   private String A353TBT15_CRT_USER_ID ;
   private String A354TBT15_CRT_PROG_NM ;
   private String A356TBT15_UPD_USER_ID ;
   private String A357TBT15_UPD_PROG_NM ;
   private String A613TBT01_SITE_ID ;
   private String AV24W_ERRCD ;
   private String AV31W_SESSION_KEY ;
   private com.genexus.webpanels.WebSession AV34W_SESSION ;
   private SdtB707_SD02_REG_MEMO_RTN AV18SD_B707_SD02_REG_MEMO_RTN ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV19SD_B792_SD00_HTML5_EXEC_INFO ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private short[] P006O2_A922TBT14_MEMO_NO ;
   private int[] P006O2_A330TBT14_SUBJECT_ID ;
   private long[] P006O2_A329TBT14_STUDY_ID ;
   private String[] P006O2_A929TBT14_REQUEST_AUTH_CD ;
   private boolean[] P006O2_n929TBT14_REQUEST_AUTH_CD ;
   private String[] P006O2_A335TBT14_MEMO ;
   private boolean[] P006O2_n335TBT14_MEMO ;
   private String[] P006O2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] P006O2_n927TBT14_KAKUNIN_FLG ;
   private java.util.Date[] P006O2_A341TBT14_UPD_DATETIME ;
   private boolean[] P006O2_n341TBT14_UPD_DATETIME ;
   private String[] P006O2_A342TBT14_UPD_USER_ID ;
   private boolean[] P006O2_n342TBT14_UPD_USER_ID ;
   private String[] P006O2_A343TBT14_UPD_PROG_NM ;
   private boolean[] P006O2_n343TBT14_UPD_PROG_NM ;
   private long[] P006O2_A344TBT14_UPD_CNT ;
   private boolean[] P006O2_n344TBT14_UPD_CNT ;
   private short[] P006O5_A294TBT02_CRF_ID ;
   private int[] P006O5_A293TBT02_SUBJECT_ID ;
   private long[] P006O5_A292TBT02_STUDY_ID ;
   private short[] P006O5_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] P006O5_n370TBT02_CRF_LATEST_VERSION ;
   private long[] P006O6_A329TBT14_STUDY_ID ;
   private int[] P006O6_A330TBT14_SUBJECT_ID ;
   private short[] P006O6_A922TBT14_MEMO_NO ;
   private short[] P006O9_A294TBT02_CRF_ID ;
   private int[] P006O9_A293TBT02_SUBJECT_ID ;
   private long[] P006O9_A292TBT02_STUDY_ID ;
   private String[] P006O9_A613TBT01_SITE_ID ;
   private boolean[] P006O9_n613TBT01_SITE_ID ;
   private short[] P006O11_A922TBT14_MEMO_NO ;
   private int[] P006O11_A330TBT14_SUBJECT_ID ;
   private long[] P006O11_A329TBT14_STUDY_ID ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT2[] ;
}

final  class ab707_pc02_reg_memo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006O2", "SELECT `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_MEMO`, `TBT14_KAKUNIN_FLG`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_PROG_NM`, `TBT14_UPD_CNT` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ? and `TBT14_MEMO_NO` = ? ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  LIMIT 1 FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006O3", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_REQUEST_AUTH_CD`=?, `TBT14_MEMO`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_PROG_NM`=?, `TBT14_UPD_CNT`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006O4", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_REQUEST_AUTH_CD`=?, `TBT14_MEMO`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_PROG_NM`=?, `TBT14_UPD_CNT`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006O5", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_CRF_LATEST_VERSION` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006O6", "SELECT `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE (`TBT14_STUDY_ID` = ?) AND (`TBT14_SUBJECT_ID` = ?) ORDER BY `TBT14_MEMO_NO` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006O7", "INSERT INTO `TBT14_CRF_MEMO` (`TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`, `TBT14_CRF_ID`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_PROG_NM`, `TBT14_UPD_CNT`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '', '')", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006O8", "INSERT INTO `TBT15_CRF_MEMO_LOC` (`TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_PROG_NM`, `TBT15_UPD_CNT`, `TBT15_CRF_ITEM_GRP_DIV`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '')", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006O9", "SELECT T1.`TBT02_CRF_ID`, T1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, T1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, T2.`TBT01_SITE_ID` FROM (`TBT02_CRF` T1 INNER JOIN `TBT01_SUBJECT` T2 ON T2.`TBT01_STUDY_ID` = T1.`TBT02_STUDY_ID` AND T2.`TBT01_SUBJECT_ID` = T1.`TBT02_SUBJECT_ID`) WHERE T1.`TBT02_STUDY_ID` = ? and T1.`TBT02_SUBJECT_ID` = ? and T1.`TBT02_CRF_ID` = ? ORDER BY T1.`TBT02_STUDY_ID`, T1.`TBT02_SUBJECT_ID`, T1.`TBT02_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006O10", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE `TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ? and `TBT15_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006O11", "SELECT `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ? and `TBT14_MEMO_NO` = ? ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006O12", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               break;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[13]).longValue());
               }
               stmt.setLong(8, ((Number) parms[14]).longValue());
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setShort(10, ((Number) parms[16]).shortValue());
               break;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[13]).longValue());
               }
               stmt.setLong(8, ((Number) parms[14]).longValue());
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setShort(10, ((Number) parms[16]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 2000);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 20);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 128);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 40);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[30], false);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 128);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(20, ((Number) parms[36]).longValue());
               }
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 50);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 128);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 40);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(14, ((Number) parms[24]).longValue());
               }
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
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

