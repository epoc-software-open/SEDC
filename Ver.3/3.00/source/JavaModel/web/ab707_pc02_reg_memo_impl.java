/*
               File: ab707_pc02_reg_memo_impl
        Description: ÉÅÉÇìoò^èàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:27.78
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
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV15P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV16P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV13P_MEMO_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV36P_CRF_ID_EDA_NO = httpContext.GetNextPar( ) ;
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
      /* Execute user subroutine: S141 */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22W_ERR_FLG = "0" ;
      AV23W_ERR_MSG = "" ;
      GXv_int1[0] = AV9P_CRF_ID ;
      GXv_int2[0] = AV35P_CRF_EDA_NO ;
      new b799_pc12_crf_id_eda_split(remoteHandle, context).execute( AV36P_CRF_ID_EDA_NO, GXv_int1, GXv_int2) ;
      ab707_pc02_reg_memo_impl.this.AV9P_CRF_ID = GXv_int1[0] ;
      ab707_pc02_reg_memo_impl.this.AV35P_CRF_EDA_NO = GXv_int2[0] ;
      if ( GXutil.strcmp(AV17P_SYORI_KBN, "1") == 0 )
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
      else
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
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg( "" );
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Memo_no( AV27W_MEMO_NO );
      }
      else
      {
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd( "1" );
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg( AV23W_ERR_MSG );
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Memo_no( AV27W_MEMO_NO );
      }
      AV8HttpResponse.addString(AV18SD_B707_SD02_REG_MEMO_RTN.toJSonString(false));
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CRF_MEMO_REG' Routine */
      AV39GXLvl68 = (byte)(0) ;
      /* Using cursor P006F2 */
      pr_default.execute(0, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV13P_MEMO_NO)});
      if ( Gx_err != 0 )
      {
         AV39GXLvl68 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A198TBT14_MEMO_NO = P006F2_A198TBT14_MEMO_NO[0] ;
         A142TBT14_SUBJECT_ID = P006F2_A142TBT14_SUBJECT_ID[0] ;
         A140TBT14_STUDY_ID = P006F2_A140TBT14_STUDY_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = P006F2_A930TBT14_REQUEST_AUTH_CD[0] ;
         n930TBT14_REQUEST_AUTH_CD = P006F2_n930TBT14_REQUEST_AUTH_CD[0] ;
         A477TBT14_MEMO = P006F2_A477TBT14_MEMO[0] ;
         n477TBT14_MEMO = P006F2_n477TBT14_MEMO[0] ;
         A927TBT14_KAKUNIN_FLG = P006F2_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P006F2_n927TBT14_KAKUNIN_FLG[0] ;
         A483TBT14_UPD_DATETIME = P006F2_A483TBT14_UPD_DATETIME[0] ;
         n483TBT14_UPD_DATETIME = P006F2_n483TBT14_UPD_DATETIME[0] ;
         A484TBT14_UPD_USER_ID = P006F2_A484TBT14_UPD_USER_ID[0] ;
         n484TBT14_UPD_USER_ID = P006F2_n484TBT14_UPD_USER_ID[0] ;
         A485TBT14_UPD_PROG_NM = P006F2_A485TBT14_UPD_PROG_NM[0] ;
         n485TBT14_UPD_PROG_NM = P006F2_n485TBT14_UPD_PROG_NM[0] ;
         A486TBT14_UPD_CNT = P006F2_A486TBT14_UPD_CNT[0] ;
         n486TBT14_UPD_CNT = P006F2_n486TBT14_UPD_CNT[0] ;
         AV39GXLvl68 = (byte)(1) ;
         AV27W_MEMO_NO = AV13P_MEMO_NO ;
         if ( ( GXutil.strcmp(A477TBT14_MEMO, AV11P_MEMO) != 0 ) || ( GXutil.strcmp(A930TBT14_REQUEST_AUTH_CD, AV14P_REQUEST_USER_ID) != 0 ) )
         {
            A927TBT14_KAKUNIN_FLG = "0" ;
            n927TBT14_KAKUNIN_FLG = false ;
         }
         A477TBT14_MEMO = AV11P_MEMO ;
         n477TBT14_MEMO = false ;
         if ( GXutil.strcmp(AV12P_MEMO_KBN, "2") == 0 )
         {
            A930TBT14_REQUEST_AUTH_CD = AV14P_REQUEST_USER_ID ;
            n930TBT14_REQUEST_AUTH_CD = false ;
         }
         A483TBT14_UPD_DATETIME = GXutil.now( ) ;
         n483TBT14_UPD_DATETIME = false ;
         A484TBT14_UPD_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n484TBT14_UPD_USER_ID = false ;
         A485TBT14_UPD_PROG_NM = AV40Pgmname ;
         n485TBT14_UPD_PROG_NM = false ;
         A486TBT14_UPD_CNT = (long)(A486TBT14_UPD_CNT+1) ;
         n486TBT14_UPD_CNT = false ;
         AV26W_LOGTEXT = "" ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV16P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO_NO:" + GXutil.trim( GXutil.str( AV13P_MEMO_NO, 3, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO:" + AV11P_MEMO + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "REQUEST_SITE_ID:" + AV32W_SITE_ID + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "REQUEST_AUTH_CD:" + AV21W_AUTH_CD + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = GXutil.strReplace( AV26W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV40Pgmname, "UPD", AV26W_LOGTEXT) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P006F3 */
         pr_default.execute(1, new Object[] {new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD, new Boolean(n477TBT14_MEMO), A477TBT14_MEMO, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n483TBT14_UPD_DATETIME), A483TBT14_UPD_DATETIME, new Boolean(n484TBT14_UPD_USER_ID), A484TBT14_UPD_USER_ID, new Boolean(n485TBT14_UPD_PROG_NM), A485TBT14_UPD_PROG_NM, new Boolean(n486TBT14_UPD_CNT), new Long(A486TBT14_UPD_CNT), new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
         if (true) break;
         /* Using cursor P006F4 */
         pr_default.execute(2, new Object[] {new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD, new Boolean(n477TBT14_MEMO), A477TBT14_MEMO, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n483TBT14_UPD_DATETIME), A483TBT14_UPD_DATETIME, new Boolean(n484TBT14_UPD_USER_ID), A484TBT14_UPD_USER_ID, new Boolean(n485TBT14_UPD_PROG_NM), A485TBT14_UPD_PROG_NM, new Boolean(n486TBT14_UPD_CNT), new Long(A486TBT14_UPD_CNT), new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV39GXLvl68 == 0 )
      {
         /* Using cursor P006F5 */
         pr_default.execute(3, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV9P_CRF_ID), new Byte(AV35P_CRF_EDA_NO)});
         if ( Gx_err != 0 )
         {
            AV39GXLvl68 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(3) != 101) )
         {
            A935TBT02_CRF_EDA_NO = P006F5_A935TBT02_CRF_EDA_NO[0] ;
            A91TBT02_CRF_ID = P006F5_A91TBT02_CRF_ID[0] ;
            A90TBT02_SUBJECT_ID = P006F5_A90TBT02_SUBJECT_ID[0] ;
            A89TBT02_STUDY_ID = P006F5_A89TBT02_STUDY_ID[0] ;
            A498TBT02_CRF_LATEST_VERSION = P006F5_A498TBT02_CRF_LATEST_VERSION[0] ;
            n498TBT02_CRF_LATEST_VERSION = P006F5_n498TBT02_CRF_LATEST_VERSION[0] ;
            AV33W_TBT14_CRF_VERSION = A498TBT02_CRF_LATEST_VERSION ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV42GXLvl132 = (byte)(0) ;
         /* Using cursor P006F6 */
         pr_default.execute(4, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID)});
         if ( Gx_err != 0 )
         {
            AV42GXLvl132 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(4) != 101) )
         {
            A140TBT14_STUDY_ID = P006F6_A140TBT14_STUDY_ID[0] ;
            A142TBT14_SUBJECT_ID = P006F6_A142TBT14_SUBJECT_ID[0] ;
            A198TBT14_MEMO_NO = P006F6_A198TBT14_MEMO_NO[0] ;
            AV42GXLvl132 = (byte)(1) ;
            AV27W_MEMO_NO = (short)(A198TBT14_MEMO_NO+1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( AV42GXLvl132 == 0 )
         {
            AV27W_MEMO_NO = (short)(1) ;
         }
         /*
            INSERT RECORD ON TABLE TBT14_CRF_MEMO

         */
         A140TBT14_STUDY_ID = AV15P_STUDY_ID ;
         A142TBT14_SUBJECT_ID = AV16P_SUBJECT_ID ;
         A198TBT14_MEMO_NO = AV27W_MEMO_NO ;
         A474TBT14_CRF_ID = AV9P_CRF_ID ;
         n474TBT14_CRF_ID = false ;
         A941TBT14_CRF_EDA_NO = AV35P_CRF_EDA_NO ;
         n941TBT14_CRF_EDA_NO = false ;
         A475TBT14_CRF_VERSION = AV33W_TBT14_CRF_VERSION ;
         n475TBT14_CRF_VERSION = false ;
         A901TBT14_MEMO_KBN = AV12P_MEMO_KBN ;
         n901TBT14_MEMO_KBN = false ;
         A477TBT14_MEMO = AV11P_MEMO ;
         n477TBT14_MEMO = false ;
         if ( GXutil.strcmp(AV12P_MEMO_KBN, "2") == 0 )
         {
            /* Execute user subroutine: S125 */
            S125 ();
            if (returnInSub) return;
            A929TBT14_REQUEST_SITE_ID = AV32W_SITE_ID ;
            n929TBT14_REQUEST_SITE_ID = false ;
            A930TBT14_REQUEST_AUTH_CD = AV14P_REQUEST_USER_ID ;
            n930TBT14_REQUEST_AUTH_CD = false ;
         }
         A931TBT14_CRT_AUTH_CD = AV19SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd() ;
         n931TBT14_CRT_AUTH_CD = false ;
         A927TBT14_KAKUNIN_FLG = "0" ;
         n927TBT14_KAKUNIN_FLG = false ;
         A902TBT14_KANRYO_FLG = "0" ;
         n902TBT14_KANRYO_FLG = false ;
         A479TBT14_DEL_FLG = "0" ;
         n479TBT14_DEL_FLG = false ;
         A480TBT14_CRT_DATETIME = GXutil.now( ) ;
         n480TBT14_CRT_DATETIME = false ;
         A481TBT14_CRT_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n481TBT14_CRT_USER_ID = false ;
         A482TBT14_CRT_PROG_NM = AV40Pgmname ;
         n482TBT14_CRT_PROG_NM = false ;
         A483TBT14_UPD_DATETIME = GXutil.now( ) ;
         n483TBT14_UPD_DATETIME = false ;
         A484TBT14_UPD_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n484TBT14_UPD_USER_ID = false ;
         A485TBT14_UPD_PROG_NM = AV40Pgmname ;
         n485TBT14_UPD_PROG_NM = false ;
         A486TBT14_UPD_CNT = 1 ;
         n486TBT14_UPD_CNT = false ;
         /* Using cursor P006F7 */
         pr_default.execute(5, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO), new Boolean(n474TBT14_CRF_ID), new Short(A474TBT14_CRF_ID), new Boolean(n475TBT14_CRF_VERSION), new Short(A475TBT14_CRF_VERSION), new Boolean(n901TBT14_MEMO_KBN), A901TBT14_MEMO_KBN, new Boolean(n477TBT14_MEMO), A477TBT14_MEMO, new Boolean(n929TBT14_REQUEST_SITE_ID), A929TBT14_REQUEST_SITE_ID, new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD, new Boolean(n931TBT14_CRT_AUTH_CD), A931TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n902TBT14_KANRYO_FLG), A902TBT14_KANRYO_FLG, new Boolean(n479TBT14_DEL_FLG), A479TBT14_DEL_FLG, new Boolean(n480TBT14_CRT_DATETIME), A480TBT14_CRT_DATETIME, new Boolean(n481TBT14_CRT_USER_ID), A481TBT14_CRT_USER_ID, new Boolean(n482TBT14_CRT_PROG_NM), A482TBT14_CRT_PROG_NM, new Boolean(n483TBT14_UPD_DATETIME), A483TBT14_UPD_DATETIME, new Boolean(n484TBT14_UPD_USER_ID), A484TBT14_UPD_USER_ID, new Boolean(n485TBT14_UPD_PROG_NM), A485TBT14_UPD_PROG_NM, new Boolean(n486TBT14_UPD_CNT), new Long(A486TBT14_UPD_CNT), new Boolean(n941TBT14_CRF_EDA_NO), new Byte(A941TBT14_CRF_EDA_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
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
         A149TBT15_STUDY_ID = AV15P_STUDY_ID ;
         A151TBT15_SUBJECT_ID = AV16P_SUBJECT_ID ;
         A199TBT15_MEMO_NO = AV27W_MEMO_NO ;
         A155TBT15_CRF_ID = AV9P_CRF_ID ;
         n155TBT15_CRF_ID = false ;
         A942TBT15_CRF_EDA_NO = AV35P_CRF_EDA_NO ;
         n942TBT15_CRF_EDA_NO = false ;
         A157TBT15_CRF_VERSION = AV33W_TBT14_CRF_VERSION ;
         n157TBT15_CRF_VERSION = false ;
         A904TBT15_CRF_ITEM_GRP_CD = AV10P_CRF_ITEM_GRP_CD ;
         n904TBT15_CRF_ITEM_GRP_CD = false ;
         A488TBT15_DEL_FLG = "0" ;
         n488TBT15_DEL_FLG = false ;
         A489TBT15_CRT_DATETIME = GXutil.now( ) ;
         n489TBT15_CRT_DATETIME = false ;
         A490TBT15_CRT_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n490TBT15_CRT_USER_ID = false ;
         A491TBT15_CRT_PROG_NM = AV40Pgmname ;
         n491TBT15_CRT_PROG_NM = false ;
         A492TBT15_UPD_DATETIME = GXutil.now( ) ;
         n492TBT15_UPD_DATETIME = false ;
         A493TBT15_UPD_USER_ID = AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n493TBT15_UPD_USER_ID = false ;
         A494TBT15_UPD_PROG_NM = AV40Pgmname ;
         n494TBT15_UPD_PROG_NM = false ;
         A495TBT15_UPD_CNT = 1 ;
         n495TBT15_UPD_CNT = false ;
         /* Using cursor P006F8 */
         pr_default.execute(6, new Object[] {new Long(A149TBT15_STUDY_ID), new Integer(A151TBT15_SUBJECT_ID), new Short(A199TBT15_MEMO_NO), new Boolean(n155TBT15_CRF_ID), new Short(A155TBT15_CRF_ID), new Boolean(n157TBT15_CRF_VERSION), new Short(A157TBT15_CRF_VERSION), new Boolean(n904TBT15_CRF_ITEM_GRP_CD), A904TBT15_CRF_ITEM_GRP_CD, new Boolean(n488TBT15_DEL_FLG), A488TBT15_DEL_FLG, new Boolean(n489TBT15_CRT_DATETIME), A489TBT15_CRT_DATETIME, new Boolean(n490TBT15_CRT_USER_ID), A490TBT15_CRT_USER_ID, new Boolean(n491TBT15_CRT_PROG_NM), A491TBT15_CRT_PROG_NM, new Boolean(n492TBT15_UPD_DATETIME), A492TBT15_UPD_DATETIME, new Boolean(n493TBT15_UPD_USER_ID), A493TBT15_UPD_USER_ID, new Boolean(n494TBT15_UPD_PROG_NM), A494TBT15_UPD_PROG_NM, new Boolean(n495TBT15_UPD_CNT), new Long(A495TBT15_UPD_CNT), new Boolean(n942TBT15_CRF_EDA_NO), new Byte(A942TBT15_CRF_EDA_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
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
         AV26W_LOGTEXT = AV26W_LOGTEXT + "CRF_EDA_NO:" + GXutil.trim( GXutil.str( AV35P_CRF_EDA_NO, 2, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "CRF_VERSION:" + GXutil.trim( GXutil.str( AV33W_TBT14_CRF_VERSION, 4, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "CRF_ITEM_GRP_CD:" + AV10P_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO_KBN:" + AV12P_MEMO_KBN + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO:" + AV11P_MEMO + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "REQUEST_SITE_ID:" + AV32W_SITE_ID + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "REQUEST_AUTH_CD:" + AV21W_AUTH_CD + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "CRT_AUTH_CD:" + AV19SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd() + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = GXutil.strReplace( AV26W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV40Pgmname, "INS", AV26W_LOGTEXT) ;
      }
   }

   public void S125( )
   {
      /* 'SUB_SITE_ID_GET' Routine */
      AV43GXLvl226 = (byte)(0) ;
      /* Using cursor P006F9 */
      pr_default.execute(7, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV9P_CRF_ID), new Byte(AV35P_CRF_EDA_NO)});
      if ( Gx_err != 0 )
      {
         AV43GXLvl226 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(7) != 101) )
      {
         A935TBT02_CRF_EDA_NO = P006F9_A935TBT02_CRF_EDA_NO[0] ;
         A91TBT02_CRF_ID = P006F9_A91TBT02_CRF_ID[0] ;
         A90TBT02_SUBJECT_ID = P006F9_A90TBT02_SUBJECT_ID[0] ;
         A89TBT02_STUDY_ID = P006F9_A89TBT02_STUDY_ID[0] ;
         A698TBT01_SITE_ID = P006F9_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = P006F9_n698TBT01_SITE_ID[0] ;
         A698TBT01_SITE_ID = P006F9_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = P006F9_n698TBT01_SITE_ID[0] ;
         AV43GXLvl226 = (byte)(1) ;
         AV32W_SITE_ID = A698TBT01_SITE_ID ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      if ( AV43GXLvl226 == 0 )
      {
         AV32W_SITE_ID = "" ;
      }
   }

   public void S131( )
   {
      /* 'SUB_CRF_MEMO_DEL' Routine */
      /* Optimized DELETE. */
      /* Using cursor P006F10 */
      pr_default.execute(8, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV13P_MEMO_NO)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
      /* End optimized DELETE. */
      /* Using cursor P006F11 */
      pr_default.execute(9, new Object[] {new Long(AV15P_STUDY_ID), new Integer(AV16P_SUBJECT_ID), new Short(AV13P_MEMO_NO)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A198TBT14_MEMO_NO = P006F11_A198TBT14_MEMO_NO[0] ;
         A142TBT14_SUBJECT_ID = P006F11_A142TBT14_SUBJECT_ID[0] ;
         A140TBT14_STUDY_ID = P006F11_A140TBT14_STUDY_ID[0] ;
         /* Using cursor P006F12 */
         pr_default.execute(10, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
         AV26W_LOGTEXT = "" ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV15P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV16P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = AV26W_LOGTEXT + "MEMO_NO:" + GXutil.trim( GXutil.str( AV13P_MEMO_NO, 3, 0)) + GXutil.chr( (short)(9)) ;
         AV26W_LOGTEXT = GXutil.strReplace( AV26W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV40Pgmname, "DEL", AV26W_LOGTEXT) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S141( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV20W_A_LOGIN_SDT;
      GXv_char4[0] = AV24W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char4) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab707_pc02_reg_memo_impl.this.AV24W_ERRCD = GXv_char4[0] ;
      if ( GXutil.strcmp(AV24W_ERRCD, "0") != 0 )
      {
         AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd( "9" );
         AV8HttpResponse.addString(AV18SD_B707_SD02_REG_MEMO_RTN.toJSonString(false));
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char5 = AV31W_SESSION_KEY ;
      GXv_char4[0] = GXt_char5 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char4) ;
      ab707_pc02_reg_memo_impl.this.GXt_char5 = GXv_char4[0] ;
      AV31W_SESSION_KEY = GXt_char5 ;
      AV19SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV34W_SESSION.getValue(AV31W_SESSION_KEY), "");
      new a804_pc02_log_start(remoteHandle, context).execute( AV40Pgmname) ;
   }

   public void S151( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_ERR_FLG = "1" ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd( "9" );
      AV18SD_B707_SD02_REG_MEMO_RTN.setgxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg( GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt );
      AV8HttpResponse.addString(AV18SD_B707_SD02_REG_MEMO_RTN.toJSonString(false));
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
                  /* Execute user subroutine: S151 */
                  S151 ();
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
      AV36P_CRF_ID_EDA_NO = "" ;
      AV10P_CRF_ITEM_GRP_CD = "" ;
      AV17P_SYORI_KBN = "" ;
      AV12P_MEMO_KBN = "" ;
      AV11P_MEMO = "" ;
      AV14P_REQUEST_USER_ID = "" ;
      AV22W_ERR_FLG = "" ;
      AV23W_ERR_MSG = "" ;
      GXv_int1 = new short [1] ;
      GXv_int2 = new byte [1] ;
      AV18SD_B707_SD02_REG_MEMO_RTN = new SdtB707_SD02_REG_MEMO_RTN(remoteHandle, context);
      AV8HttpResponse = httpContext.getHttpResponse();
      A477TBT14_MEMO = "" ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      A698TBT01_SITE_ID = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A484TBT14_UPD_USER_ID = "" ;
      A485TBT14_UPD_PROG_NM = "" ;
      A901TBT14_MEMO_KBN = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      A931TBT14_CRT_AUTH_CD = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      A479TBT14_DEL_FLG = "" ;
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A481TBT14_CRT_USER_ID = "" ;
      A482TBT14_CRT_PROG_NM = "" ;
      A904TBT15_CRF_ITEM_GRP_CD = "" ;
      A488TBT15_DEL_FLG = "" ;
      A489TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A490TBT15_CRT_USER_ID = "" ;
      A491TBT15_CRT_PROG_NM = "" ;
      A492TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A493TBT15_UPD_USER_ID = "" ;
      A494TBT15_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      P006F2_A198TBT14_MEMO_NO = new short[1] ;
      P006F2_A142TBT14_SUBJECT_ID = new int[1] ;
      P006F2_A140TBT14_STUDY_ID = new long[1] ;
      P006F2_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      P006F2_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      P006F2_A477TBT14_MEMO = new String[] {""} ;
      P006F2_n477TBT14_MEMO = new boolean[] {false} ;
      P006F2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      P006F2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      P006F2_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P006F2_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      P006F2_A484TBT14_UPD_USER_ID = new String[] {""} ;
      P006F2_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      P006F2_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      P006F2_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      P006F2_A486TBT14_UPD_CNT = new long[1] ;
      P006F2_n486TBT14_UPD_CNT = new boolean[] {false} ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV40Pgmname = "" ;
      AV26W_LOGTEXT = "" ;
      AV32W_SITE_ID = "" ;
      AV21W_AUTH_CD = "" ;
      P006F5_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P006F5_A91TBT02_CRF_ID = new short[1] ;
      P006F5_A90TBT02_SUBJECT_ID = new int[1] ;
      P006F5_A89TBT02_STUDY_ID = new long[1] ;
      P006F5_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      P006F5_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P006F6_A140TBT14_STUDY_ID = new long[1] ;
      P006F6_A142TBT14_SUBJECT_ID = new int[1] ;
      P006F6_A198TBT14_MEMO_NO = new short[1] ;
      AV19SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      Gx_emsg = "" ;
      P006F9_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P006F9_A91TBT02_CRF_ID = new short[1] ;
      P006F9_A90TBT02_SUBJECT_ID = new int[1] ;
      P006F9_A89TBT02_STUDY_ID = new long[1] ;
      P006F9_A698TBT01_SITE_ID = new String[] {""} ;
      P006F9_n698TBT01_SITE_ID = new boolean[] {false} ;
      P006F11_A198TBT14_MEMO_NO = new short[1] ;
      P006F11_A142TBT14_SUBJECT_ID = new int[1] ;
      P006F11_A140TBT14_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV24W_ERRCD = "" ;
      AV31W_SESSION_KEY = "" ;
      GXt_char5 = "" ;
      GXv_char4 = new String [1] ;
      AV34W_SESSION = httpContext.getWebSession();
      pr_default = new DataStoreProvider(context, remoteHandle, new ab707_pc02_reg_memo__default(),
         new Object[] {
             new Object[] {
            P006F2_A198TBT14_MEMO_NO, P006F2_A142TBT14_SUBJECT_ID, P006F2_A140TBT14_STUDY_ID, P006F2_A930TBT14_REQUEST_AUTH_CD, P006F2_n930TBT14_REQUEST_AUTH_CD, P006F2_A477TBT14_MEMO, P006F2_n477TBT14_MEMO, P006F2_A927TBT14_KAKUNIN_FLG, P006F2_n927TBT14_KAKUNIN_FLG, P006F2_A483TBT14_UPD_DATETIME,
            P006F2_n483TBT14_UPD_DATETIME, P006F2_A484TBT14_UPD_USER_ID, P006F2_n484TBT14_UPD_USER_ID, P006F2_A485TBT14_UPD_PROG_NM, P006F2_n485TBT14_UPD_PROG_NM, P006F2_A486TBT14_UPD_CNT, P006F2_n486TBT14_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006F5_A935TBT02_CRF_EDA_NO, P006F5_A91TBT02_CRF_ID, P006F5_A90TBT02_SUBJECT_ID, P006F5_A89TBT02_STUDY_ID, P006F5_A498TBT02_CRF_LATEST_VERSION, P006F5_n498TBT02_CRF_LATEST_VERSION
            }
            , new Object[] {
            P006F6_A140TBT14_STUDY_ID, P006F6_A142TBT14_SUBJECT_ID, P006F6_A198TBT14_MEMO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006F9_A935TBT02_CRF_EDA_NO, P006F9_A91TBT02_CRF_ID, P006F9_A90TBT02_SUBJECT_ID, P006F9_A89TBT02_STUDY_ID, P006F9_A698TBT01_SITE_ID, P006F9_n698TBT01_SITE_ID
            }
            , new Object[] {
            }
            , new Object[] {
            P006F11_A198TBT14_MEMO_NO, P006F11_A142TBT14_SUBJECT_ID, P006F11_A140TBT14_STUDY_ID
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "AB707_PC02_REG_MEMO" ;
      /* GeneXus formulas. */
      AV40Pgmname = "AB707_PC02_REG_MEMO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV35P_CRF_EDA_NO ;
   private byte GXv_int2[] ;
   private byte A941TBT14_CRF_EDA_NO ;
   private byte A942TBT15_CRF_EDA_NO ;
   private byte AV39GXLvl68 ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte AV42GXLvl132 ;
   private byte AV43GXLvl226 ;
   private short gxcookieaux ;
   private short AV13P_MEMO_NO ;
   private short AV9P_CRF_ID ;
   private short GXv_int1[] ;
   private short AV27W_MEMO_NO ;
   private short A198TBT14_MEMO_NO ;
   private short A474TBT14_CRF_ID ;
   private short A475TBT14_CRF_VERSION ;
   private short A199TBT15_MEMO_NO ;
   private short A155TBT15_CRF_ID ;
   private short A157TBT15_CRF_VERSION ;
   private short Gx_err ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short AV33W_TBT14_CRF_VERSION ;
   private int AV16P_SUBJECT_ID ;
   private int A142TBT14_SUBJECT_ID ;
   private int A151TBT15_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private int GX_INS27 ;
   private int GX_INS28 ;
   private int GXActiveErrHndl ;
   private long AV15P_STUDY_ID ;
   private long A486TBT14_UPD_CNT ;
   private long A140TBT14_STUDY_ID ;
   private long A149TBT15_STUDY_ID ;
   private long A495TBT15_UPD_CNT ;
   private long A89TBT02_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String AV40Pgmname ;
   private String Gx_emsg ;
   private String GXt_char5 ;
   private String GXv_char4[] ;
   private java.util.Date A483TBT14_UPD_DATETIME ;
   private java.util.Date A480TBT14_CRT_DATETIME ;
   private java.util.Date A489TBT15_CRT_DATETIME ;
   private java.util.Date A492TBT15_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n477TBT14_MEMO ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n483TBT14_UPD_DATETIME ;
   private boolean n484TBT14_UPD_USER_ID ;
   private boolean n485TBT14_UPD_PROG_NM ;
   private boolean n486TBT14_UPD_CNT ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n474TBT14_CRF_ID ;
   private boolean n941TBT14_CRF_EDA_NO ;
   private boolean n475TBT14_CRF_VERSION ;
   private boolean n901TBT14_MEMO_KBN ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n480TBT14_CRT_DATETIME ;
   private boolean n481TBT14_CRT_USER_ID ;
   private boolean n482TBT14_CRT_PROG_NM ;
   private boolean n155TBT15_CRF_ID ;
   private boolean n942TBT15_CRF_EDA_NO ;
   private boolean n157TBT15_CRF_VERSION ;
   private boolean n904TBT15_CRF_ITEM_GRP_CD ;
   private boolean n488TBT15_DEL_FLG ;
   private boolean n489TBT15_CRT_DATETIME ;
   private boolean n490TBT15_CRT_USER_ID ;
   private boolean n491TBT15_CRT_PROG_NM ;
   private boolean n492TBT15_UPD_DATETIME ;
   private boolean n493TBT15_UPD_USER_ID ;
   private boolean n494TBT15_UPD_PROG_NM ;
   private boolean n495TBT15_UPD_CNT ;
   private boolean n698TBT01_SITE_ID ;
   private String AV36P_CRF_ID_EDA_NO ;
   private String AV10P_CRF_ITEM_GRP_CD ;
   private String AV17P_SYORI_KBN ;
   private String AV12P_MEMO_KBN ;
   private String AV11P_MEMO ;
   private String AV14P_REQUEST_USER_ID ;
   private String AV22W_ERR_FLG ;
   private String AV23W_ERR_MSG ;
   private String A477TBT14_MEMO ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A698TBT01_SITE_ID ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A484TBT14_UPD_USER_ID ;
   private String A485TBT14_UPD_PROG_NM ;
   private String A901TBT14_MEMO_KBN ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String A902TBT14_KANRYO_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String A481TBT14_CRT_USER_ID ;
   private String A482TBT14_CRT_PROG_NM ;
   private String A904TBT15_CRF_ITEM_GRP_CD ;
   private String A488TBT15_DEL_FLG ;
   private String A490TBT15_CRT_USER_ID ;
   private String A491TBT15_CRT_PROG_NM ;
   private String A493TBT15_UPD_USER_ID ;
   private String A494TBT15_UPD_PROG_NM ;
   private String AV26W_LOGTEXT ;
   private String AV32W_SITE_ID ;
   private String AV21W_AUTH_CD ;
   private String AV24W_ERRCD ;
   private String AV31W_SESSION_KEY ;
   private com.genexus.webpanels.WebSession AV34W_SESSION ;
   private SdtB707_SD02_REG_MEMO_RTN AV18SD_B707_SD02_REG_MEMO_RTN ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV19SD_B792_SD00_HTML5_EXEC_INFO ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private short[] P006F2_A198TBT14_MEMO_NO ;
   private int[] P006F2_A142TBT14_SUBJECT_ID ;
   private long[] P006F2_A140TBT14_STUDY_ID ;
   private String[] P006F2_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] P006F2_n930TBT14_REQUEST_AUTH_CD ;
   private String[] P006F2_A477TBT14_MEMO ;
   private boolean[] P006F2_n477TBT14_MEMO ;
   private String[] P006F2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] P006F2_n927TBT14_KAKUNIN_FLG ;
   private java.util.Date[] P006F2_A483TBT14_UPD_DATETIME ;
   private boolean[] P006F2_n483TBT14_UPD_DATETIME ;
   private String[] P006F2_A484TBT14_UPD_USER_ID ;
   private boolean[] P006F2_n484TBT14_UPD_USER_ID ;
   private String[] P006F2_A485TBT14_UPD_PROG_NM ;
   private boolean[] P006F2_n485TBT14_UPD_PROG_NM ;
   private long[] P006F2_A486TBT14_UPD_CNT ;
   private boolean[] P006F2_n486TBT14_UPD_CNT ;
   private byte[] P006F5_A935TBT02_CRF_EDA_NO ;
   private short[] P006F5_A91TBT02_CRF_ID ;
   private int[] P006F5_A90TBT02_SUBJECT_ID ;
   private long[] P006F5_A89TBT02_STUDY_ID ;
   private short[] P006F5_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] P006F5_n498TBT02_CRF_LATEST_VERSION ;
   private long[] P006F6_A140TBT14_STUDY_ID ;
   private int[] P006F6_A142TBT14_SUBJECT_ID ;
   private short[] P006F6_A198TBT14_MEMO_NO ;
   private byte[] P006F9_A935TBT02_CRF_EDA_NO ;
   private short[] P006F9_A91TBT02_CRF_ID ;
   private int[] P006F9_A90TBT02_SUBJECT_ID ;
   private long[] P006F9_A89TBT02_STUDY_ID ;
   private String[] P006F9_A698TBT01_SITE_ID ;
   private boolean[] P006F9_n698TBT01_SITE_ID ;
   private short[] P006F11_A198TBT14_MEMO_NO ;
   private int[] P006F11_A142TBT14_SUBJECT_ID ;
   private long[] P006F11_A140TBT14_STUDY_ID ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class ab707_pc02_reg_memo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006F2", "SELECT `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_MEMO`, `TBT14_KAKUNIN_FLG`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_PROG_NM`, `TBT14_UPD_CNT` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ? and `TBT14_MEMO_NO` = ? ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  LIMIT 1 FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006F3", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_REQUEST_AUTH_CD`=?, `TBT14_MEMO`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_PROG_NM`=?, `TBT14_UPD_CNT`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006F4", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_REQUEST_AUTH_CD`=?, `TBT14_MEMO`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_PROG_NM`=?, `TBT14_UPD_CNT`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006F5", "SELECT `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_CRF_LATEST_VERSION` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006F6", "SELECT `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE (`TBT14_STUDY_ID` = ?) AND (`TBT14_SUBJECT_ID` = ?) ORDER BY `TBT14_MEMO_NO` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006F7", "INSERT INTO `TBT14_CRF_MEMO`(`TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`, `TBT14_CRF_ID`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_PROG_NM`, `TBT14_UPD_CNT`, `TBT14_CRF_EDA_NO`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '', '')", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006F8", "INSERT INTO `TBT15_CRF_MEMO_LOC`(`TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_PROG_NM`, `TBT15_UPD_CNT`, `TBT15_CRF_EDA_NO`, `TBT15_CRF_ITEM_GRP_DIV`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '')", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006F9", "SELECT T1.`TBT02_CRF_EDA_NO`, T1.`TBT02_CRF_ID`, T1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, T1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, T2.`TBT01_SITE_ID` FROM (`TBT02_CRF` T1 INNER JOIN `TBT01_SUBJECT` T2 ON T2.`TBT01_STUDY_ID` = T1.`TBT02_STUDY_ID` AND T2.`TBT01_SUBJECT_ID` = T1.`TBT02_SUBJECT_ID`) WHERE T1.`TBT02_STUDY_ID` = ? and T1.`TBT02_SUBJECT_ID` = ? and T1.`TBT02_CRF_ID` = ? and T1.`TBT02_CRF_EDA_NO` = ? ORDER BY T1.`TBT02_STUDY_ID`, T1.`TBT02_SUBJECT_ID`, T1.`TBT02_CRF_ID`, T1.`TBT02_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006F10", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE `TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ? and `TBT15_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006F11", "SELECT `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ? and `TBT14_MEMO_NO` = ? ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006F12", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
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
               return;
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
               return;
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
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
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
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[38]).byteValue());
               }
               return;
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
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

