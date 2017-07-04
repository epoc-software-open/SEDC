/*
               File: ab707_pc01_get_memo_impl
        Description: ÉÅÉÇèÓïÒéÊìæèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:37.60
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab707_pc01_get_memo_impl extends GXWebProcedure
{
   public ab707_pc01_get_memo_impl( com.genexus.internet.HttpContext context )
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
         AV11P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV12P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9P_MEMO_KBN = httpContext.GetNextPar( ) ;
            AV10P_MEMO_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S131 */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13SD_B707_SD01_GET_MEMO_RTN.getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users().clear();
      AV20W_ERR_FLG = "0" ;
      AV21W_ERR_MSG = "" ;
      AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no( AV10P_MEMO_NO );
      if ( (0==AV10P_MEMO_NO) )
      {
         AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn( AV9P_MEMO_KBN );
         if ( GXutil.strcmp(AV9P_MEMO_KBN, "2") == 0 )
         {
            if ( GXutil.strcmp(AV34SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), "06") == 0 )
            {
               AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id( "02" );
            }
            else
            {
               AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id( "06" );
            }
         }
      }
      else
      {
         AV39GXLvl46 = (byte)(0) ;
         /* Using cursor P006G2 */
         pr_default.execute(0, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_ID), new Short(AV10P_MEMO_NO)});
         if ( Gx_err != 0 )
         {
            AV39GXLvl46 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A481TBT14_CRT_USER_ID = P006G2_A481TBT14_CRT_USER_ID[0] ;
            n481TBT14_CRT_USER_ID = P006G2_n481TBT14_CRT_USER_ID[0] ;
            A198TBT14_MEMO_NO = P006G2_A198TBT14_MEMO_NO[0] ;
            A142TBT14_SUBJECT_ID = P006G2_A142TBT14_SUBJECT_ID[0] ;
            A140TBT14_STUDY_ID = P006G2_A140TBT14_STUDY_ID[0] ;
            A931TBT14_CRT_AUTH_CD = P006G2_A931TBT14_CRT_AUTH_CD[0] ;
            n931TBT14_CRT_AUTH_CD = P006G2_n931TBT14_CRT_AUTH_CD[0] ;
            A477TBT14_MEMO = P006G2_A477TBT14_MEMO[0] ;
            n477TBT14_MEMO = P006G2_n477TBT14_MEMO[0] ;
            A934TBT14_KAKUNIN_COMMENT = P006G2_A934TBT14_KAKUNIN_COMMENT[0] ;
            n934TBT14_KAKUNIN_COMMENT = P006G2_n934TBT14_KAKUNIN_COMMENT[0] ;
            A929TBT14_REQUEST_SITE_ID = P006G2_A929TBT14_REQUEST_SITE_ID[0] ;
            n929TBT14_REQUEST_SITE_ID = P006G2_n929TBT14_REQUEST_SITE_ID[0] ;
            A930TBT14_REQUEST_AUTH_CD = P006G2_A930TBT14_REQUEST_AUTH_CD[0] ;
            n930TBT14_REQUEST_AUTH_CD = P006G2_n930TBT14_REQUEST_AUTH_CD[0] ;
            AV39GXLvl46 = (byte)(1) ;
            if ( ( GXutil.strcmp(A481TBT14_CRT_USER_ID, AV15W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()) == 0 ) && ( GXutil.strcmp(A931TBT14_CRT_AUTH_CD, AV34SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd()) == 0 ) )
            {
               AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn( AV9P_MEMO_KBN );
               AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm( AV15W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm() );
            }
            else
            {
               AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn( "3" );
               /* Using cursor P006G3 */
               pr_default.execute(1, new Object[] {new Boolean(n481TBT14_CRT_USER_ID), A481TBT14_CRT_USER_ID});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A55TAM07_USER_ID = P006G3_A55TAM07_USER_ID[0] ;
                  A205TAM07_USER_NM = P006G3_A205TAM07_USER_NM[0] ;
                  n205TAM07_USER_NM = P006G3_n205TAM07_USER_NM[0] ;
                  AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm( A205TAM07_USER_NM );
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
            }
            AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo( A477TBT14_MEMO );
            AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment( A934TBT14_KAKUNIN_COMMENT );
            if ( ! (GXutil.strcmp("", A929TBT14_REQUEST_SITE_ID)==0) )
            {
               AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id( A930TBT14_REQUEST_AUTH_CD );
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV39GXLvl46 == 0 )
         {
            AV20W_ERR_FLG = "1" ;
            GXt_char1 = AV21W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            ab707_pc01_get_memo_impl.this.GXt_char1 = GXv_char2[0] ;
            AV21W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( GXutil.strcmp(AV13SD_B707_SD01_GET_MEMO_RTN.getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn(), "2") == 0 )
      {
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV20W_ERR_FLG, "0") == 0 )
      {
         AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd( "0" );
         AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg( "" );
      }
      else
      {
         AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd( "1" );
         AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg( AV21W_ERR_MSG );
      }
      AV8HttpResponse.addString(AV13SD_B707_SD01_GET_MEMO_RTN.toJSonString(false));
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_GET_REQUEST_SITE_NM' Routine */
      /* Using cursor P006G4 */
      pr_default.execute(2, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A698TBT01_SITE_ID = P006G4_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = P006G4_n698TBT01_SITE_ID[0] ;
         A88TBT01_SUBJECT_ID = P006G4_A88TBT01_SUBJECT_ID[0] ;
         A87TBT01_STUDY_ID = P006G4_A87TBT01_STUDY_ID[0] ;
         /* Using cursor P006G5 */
         pr_default.execute(3, new Object[] {new Boolean(n698TBT01_SITE_ID), A698TBT01_SITE_ID});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A57TAM08_SITE_ID = P006G5_A57TAM08_SITE_ID[0] ;
            A320TAM08_SITE_SNM = P006G5_A320TAM08_SITE_SNM[0] ;
            n320TAM08_SITE_SNM = P006G5_n320TAM08_SITE_SNM[0] ;
            AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm( A320TAM08_SITE_SNM );
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'SUB_GET_REQUEST_LIST' Routine */
      AV19W_CNT = 0 ;
      /* Using cursor P006G6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A215TAM04_DEL_FLG = P006G6_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = P006G6_n215TAM04_DEL_FLG[0] ;
         A13TAM04_AUTH_CD = P006G6_A13TAM04_AUTH_CD[0] ;
         A285TAM04_AUTH_NM = P006G6_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = P006G6_n285TAM04_AUTH_NM[0] ;
         AV19W_CNT = (long)(AV19W_CNT+1) ;
         AV14SD_B707_SD03_SEL_LIST_ITEM_I = (SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem)new SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem(remoteHandle, context);
         AV14SD_B707_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no( AV19W_CNT );
         AV14SD_B707_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id( A13TAM04_AUTH_CD );
         AV14SD_B707_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm( A285TAM04_AUTH_NM );
         AV13SD_B707_SD01_GET_MEMO_RTN.getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users().add(AV14SD_B707_SD03_SEL_LIST_ITEM_I, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      GXt_char1 = AV16W_ALL_AUTH_CD ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "023", GXv_char2) ;
      ab707_pc01_get_memo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16W_ALL_AUTH_CD = GXt_char1 ;
      if ( ! (GXutil.strcmp("", AV16W_ALL_AUTH_CD)==0) )
      {
         AV19W_CNT = (long)(AV19W_CNT+1) ;
         AV14SD_B707_SD03_SEL_LIST_ITEM_I = (SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem)new SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem(remoteHandle, context);
         AV14SD_B707_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no( AV19W_CNT );
         AV14SD_B707_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id( AV16W_ALL_AUTH_CD );
         AV14SD_B707_SD03_SEL_LIST_ITEM_I.setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm( "ëSàı" );
         AV13SD_B707_SD01_GET_MEMO_RTN.getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users().add(AV14SD_B707_SD03_SEL_LIST_ITEM_I, 0);
      }
   }

   public void S131( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV15W_A_LOGIN_SDT;
      GXv_char2[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab707_pc01_get_memo_impl.this.AV22W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
      {
         AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd( "9" );
         AV8HttpResponse.addString(AV13SD_B707_SD01_GET_MEMO_RTN.toJSonString(false));
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV35W_SESSION_KEY ;
      GXv_char2[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV15W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
      ab707_pc01_get_memo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35W_SESSION_KEY = GXt_char1 ;
      AV34SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV36W_SESSION.getValue(AV35W_SESSION_KEY), "");
      new a804_pc02_log_start(remoteHandle, context).execute( AV44Pgmname) ;
   }

   public void S141( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_ERR_FLG = "1" ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV44Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd( "9" );
      AV13SD_B707_SD01_GET_MEMO_RTN.setgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg( GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt );
      AV8HttpResponse.addString(AV13SD_B707_SD01_GET_MEMO_RTN.toJSonString(false));
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
                  /* Execute user subroutine: S141 */
                  S141 ();
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
      AV9P_MEMO_KBN = "" ;
      AV13SD_B707_SD01_GET_MEMO_RTN = new SdtB707_SD01_GET_MEMO_RTN(remoteHandle, context);
      AV20W_ERR_FLG = "" ;
      AV21W_ERR_MSG = "" ;
      AV34SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      scmdbuf = "" ;
      P006G2_A481TBT14_CRT_USER_ID = new String[] {""} ;
      P006G2_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      P006G2_A198TBT14_MEMO_NO = new short[1] ;
      P006G2_A142TBT14_SUBJECT_ID = new int[1] ;
      P006G2_A140TBT14_STUDY_ID = new long[1] ;
      P006G2_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      P006G2_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      P006G2_A477TBT14_MEMO = new String[] {""} ;
      P006G2_n477TBT14_MEMO = new boolean[] {false} ;
      P006G2_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      P006G2_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      P006G2_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      P006G2_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      P006G2_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      P006G2_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      A481TBT14_CRT_USER_ID = "" ;
      A931TBT14_CRT_AUTH_CD = "" ;
      A477TBT14_MEMO = "" ;
      A934TBT14_KAKUNIN_COMMENT = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      P006G3_A55TAM07_USER_ID = new String[] {""} ;
      P006G3_A205TAM07_USER_NM = new String[] {""} ;
      P006G3_n205TAM07_USER_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      AV8HttpResponse = httpContext.getHttpResponse();
      P006G4_A698TBT01_SITE_ID = new String[] {""} ;
      P006G4_n698TBT01_SITE_ID = new boolean[] {false} ;
      P006G4_A88TBT01_SUBJECT_ID = new int[1] ;
      P006G4_A87TBT01_STUDY_ID = new long[1] ;
      A698TBT01_SITE_ID = "" ;
      P006G5_A57TAM08_SITE_ID = new String[] {""} ;
      P006G5_A320TAM08_SITE_SNM = new String[] {""} ;
      P006G5_n320TAM08_SITE_SNM = new boolean[] {false} ;
      A57TAM08_SITE_ID = "" ;
      A320TAM08_SITE_SNM = "" ;
      P006G6_A215TAM04_DEL_FLG = new String[] {""} ;
      P006G6_n215TAM04_DEL_FLG = new boolean[] {false} ;
      P006G6_A13TAM04_AUTH_CD = new String[] {""} ;
      P006G6_A285TAM04_AUTH_NM = new String[] {""} ;
      P006G6_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A215TAM04_DEL_FLG = "" ;
      A13TAM04_AUTH_CD = "" ;
      A285TAM04_AUTH_NM = "" ;
      AV14SD_B707_SD03_SEL_LIST_ITEM_I = new SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem(remoteHandle, context);
      AV16W_ALL_AUTH_CD = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      AV35W_SESSION_KEY = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      AV36W_SESSION = httpContext.getWebSession();
      AV44Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab707_pc01_get_memo__default(),
         new Object[] {
             new Object[] {
            P006G2_A481TBT14_CRT_USER_ID, P006G2_n481TBT14_CRT_USER_ID, P006G2_A198TBT14_MEMO_NO, P006G2_A142TBT14_SUBJECT_ID, P006G2_A140TBT14_STUDY_ID, P006G2_A931TBT14_CRT_AUTH_CD, P006G2_n931TBT14_CRT_AUTH_CD, P006G2_A477TBT14_MEMO, P006G2_n477TBT14_MEMO, P006G2_A934TBT14_KAKUNIN_COMMENT,
            P006G2_n934TBT14_KAKUNIN_COMMENT, P006G2_A929TBT14_REQUEST_SITE_ID, P006G2_n929TBT14_REQUEST_SITE_ID, P006G2_A930TBT14_REQUEST_AUTH_CD, P006G2_n930TBT14_REQUEST_AUTH_CD
            }
            , new Object[] {
            P006G3_A55TAM07_USER_ID, P006G3_A205TAM07_USER_NM, P006G3_n205TAM07_USER_NM
            }
            , new Object[] {
            P006G4_A698TBT01_SITE_ID, P006G4_n698TBT01_SITE_ID, P006G4_A88TBT01_SUBJECT_ID, P006G4_A87TBT01_STUDY_ID
            }
            , new Object[] {
            P006G5_A57TAM08_SITE_ID, P006G5_A320TAM08_SITE_SNM, P006G5_n320TAM08_SITE_SNM
            }
            , new Object[] {
            P006G6_A215TAM04_DEL_FLG, P006G6_n215TAM04_DEL_FLG, P006G6_A13TAM04_AUTH_CD, P006G6_A285TAM04_AUTH_NM, P006G6_n285TAM04_AUTH_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV44Pgmname = "AB707_PC01_GET_MEMO" ;
      /* GeneXus formulas. */
      AV44Pgmname = "AB707_PC01_GET_MEMO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV39GXLvl46 ;
   private short gxcookieaux ;
   private short AV10P_MEMO_NO ;
   private short Gx_err ;
   private short A198TBT14_MEMO_NO ;
   private int AV12P_SUBJECT_ID ;
   private int A142TBT14_SUBJECT_ID ;
   private int A88TBT01_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private long A140TBT14_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private long AV19W_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV44Pgmname ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n481TBT14_CRT_USER_ID ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n477TBT14_MEMO ;
   private boolean n934TBT14_KAKUNIN_COMMENT ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n205TAM07_USER_NM ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n320TAM08_SITE_SNM ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n285TAM04_AUTH_NM ;
   private String AV9P_MEMO_KBN ;
   private String AV20W_ERR_FLG ;
   private String AV21W_ERR_MSG ;
   private String A481TBT14_CRT_USER_ID ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String A477TBT14_MEMO ;
   private String A934TBT14_KAKUNIN_COMMENT ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A698TBT01_SITE_ID ;
   private String A57TAM08_SITE_ID ;
   private String A320TAM08_SITE_SNM ;
   private String A215TAM04_DEL_FLG ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String AV16W_ALL_AUTH_CD ;
   private String AV22W_ERRCD ;
   private String AV35W_SESSION_KEY ;
   private com.genexus.webpanels.WebSession AV36W_SESSION ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV34SD_B792_SD00_HTML5_EXEC_INFO ;
   private IDataStoreProvider pr_default ;
   private String[] P006G2_A481TBT14_CRT_USER_ID ;
   private boolean[] P006G2_n481TBT14_CRT_USER_ID ;
   private short[] P006G2_A198TBT14_MEMO_NO ;
   private int[] P006G2_A142TBT14_SUBJECT_ID ;
   private long[] P006G2_A140TBT14_STUDY_ID ;
   private String[] P006G2_A931TBT14_CRT_AUTH_CD ;
   private boolean[] P006G2_n931TBT14_CRT_AUTH_CD ;
   private String[] P006G2_A477TBT14_MEMO ;
   private boolean[] P006G2_n477TBT14_MEMO ;
   private String[] P006G2_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] P006G2_n934TBT14_KAKUNIN_COMMENT ;
   private String[] P006G2_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] P006G2_n929TBT14_REQUEST_SITE_ID ;
   private String[] P006G2_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] P006G2_n930TBT14_REQUEST_AUTH_CD ;
   private String[] P006G3_A55TAM07_USER_ID ;
   private String[] P006G3_A205TAM07_USER_NM ;
   private boolean[] P006G3_n205TAM07_USER_NM ;
   private String[] P006G4_A698TBT01_SITE_ID ;
   private boolean[] P006G4_n698TBT01_SITE_ID ;
   private int[] P006G4_A88TBT01_SUBJECT_ID ;
   private long[] P006G4_A87TBT01_STUDY_ID ;
   private String[] P006G5_A57TAM08_SITE_ID ;
   private String[] P006G5_A320TAM08_SITE_SNM ;
   private boolean[] P006G5_n320TAM08_SITE_SNM ;
   private String[] P006G6_A215TAM04_DEL_FLG ;
   private boolean[] P006G6_n215TAM04_DEL_FLG ;
   private String[] P006G6_A13TAM04_AUTH_CD ;
   private String[] P006G6_A285TAM04_AUTH_NM ;
   private boolean[] P006G6_n285TAM04_AUTH_NM ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private SdtB707_SD01_GET_MEMO_RTN AV13SD_B707_SD01_GET_MEMO_RTN ;
   private SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem AV14SD_B707_SD03_SEL_LIST_ITEM_I ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class ab707_pc01_get_memo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006G2", "SELECT `TBT14_CRT_USER_ID`, `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID`, `TBT14_CRT_AUTH_CD`, `TBT14_MEMO`, `TBT14_KAKUNIN_COMMENT`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ? and `TBT14_MEMO_NO` = ? ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006G3", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006G4", "SELECT `TBT01_SITE_ID`, `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ? ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006G5", "SELECT `TAM08_SITE_ID`, `TAM08_SITE_SNM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006G6", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` <> '00') AND (`TAM04_AUTH_CD` <> '99') AND (`TAM04_DEL_FLG` <> '1') ORDER BY `TAM04_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
                  stmt.setVarchar(1, (String)parms[1], 128);
               }
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20);
               }
               return;
      }
   }

}

