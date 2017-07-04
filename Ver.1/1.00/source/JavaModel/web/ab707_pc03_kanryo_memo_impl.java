/*
               File: ab707_pc03_kanryo_memo_impl
        Description: ÉÅÉÇämîFäÆóπèàóù
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:22.40
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab707_pc03_kanryo_memo_impl extends GXWebProcedure
{
   public ab707_pc03_kanryo_memo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV11P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV12P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10P_MEMO_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV22P_KAKUNIN_COMMENT = httpContext.GetNextPar( ) ;
            AV9P_KAKUNIN_CHK = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S12109 */
      S12109 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15W_ERR_FLG = "0" ;
      AV16W_ERR_MSG = "" ;
      /* Execute user subroutine: S1152 */
      S1152 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV15W_ERR_FLG, "0") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab707_pc03_kanryo_memo");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab707_pc03_kanryo_memo");
      }
      if ( GXutil.strcmp(AV15W_ERR_FLG, "0") == 0 )
      {
         AV13SD_B707_SD04_KANRYO_MEMO_RTN.setgxTv_SdtB707_SD04_KANRYO_MEMO_RTN_Result_cd( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SD_B707_SD04_KANRYO_MEMO_RTN", AV13SD_B707_SD04_KANRYO_MEMO_RTN);
         AV13SD_B707_SD04_KANRYO_MEMO_RTN.setgxTv_SdtB707_SD04_KANRYO_MEMO_RTN_Err_msg( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SD_B707_SD04_KANRYO_MEMO_RTN", AV13SD_B707_SD04_KANRYO_MEMO_RTN);
      }
      else
      {
         AV13SD_B707_SD04_KANRYO_MEMO_RTN.setgxTv_SdtB707_SD04_KANRYO_MEMO_RTN_Result_cd( "1" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SD_B707_SD04_KANRYO_MEMO_RTN", AV13SD_B707_SD04_KANRYO_MEMO_RTN);
         AV13SD_B707_SD04_KANRYO_MEMO_RTN.setgxTv_SdtB707_SD04_KANRYO_MEMO_RTN_Err_msg( AV16W_ERR_MSG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SD_B707_SD04_KANRYO_MEMO_RTN", AV13SD_B707_SD04_KANRYO_MEMO_RTN);
      }
      AV8HttpResponse.addString(AV13SD_B707_SD04_KANRYO_MEMO_RTN.toJSonString());
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1152( )
   {
      /* 'SUB_CRF_MEMO_UPD' Routine */
      AV25GXLvl55 = (byte)(0) ;
      /* Using cursor P006N2 */
      pr_default.execute(0, new Object[] {new Long(AV11P_STUDY_ID), new Integer(AV12P_SUBJECT_ID), new Short(AV10P_MEMO_NO)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A922TBT14_MEMO_NO = P006N2_A922TBT14_MEMO_NO[0] ;
         A330TBT14_SUBJECT_ID = P006N2_A330TBT14_SUBJECT_ID[0] ;
         A329TBT14_STUDY_ID = P006N2_A329TBT14_STUDY_ID[0] ;
         A933TBT14_KAKUNIN_COMMENT = P006N2_A933TBT14_KAKUNIN_COMMENT[0] ;
         n933TBT14_KAKUNIN_COMMENT = P006N2_n933TBT14_KAKUNIN_COMMENT[0] ;
         A927TBT14_KAKUNIN_FLG = P006N2_A927TBT14_KAKUNIN_FLG[0] ;
         n927TBT14_KAKUNIN_FLG = P006N2_n927TBT14_KAKUNIN_FLG[0] ;
         A931TBT14_KAKUNIN_USER_ID = P006N2_A931TBT14_KAKUNIN_USER_ID[0] ;
         n931TBT14_KAKUNIN_USER_ID = P006N2_n931TBT14_KAKUNIN_USER_ID[0] ;
         A341TBT14_UPD_DATETIME = P006N2_A341TBT14_UPD_DATETIME[0] ;
         n341TBT14_UPD_DATETIME = P006N2_n341TBT14_UPD_DATETIME[0] ;
         A342TBT14_UPD_USER_ID = P006N2_A342TBT14_UPD_USER_ID[0] ;
         n342TBT14_UPD_USER_ID = P006N2_n342TBT14_UPD_USER_ID[0] ;
         A343TBT14_UPD_PROG_NM = P006N2_A343TBT14_UPD_PROG_NM[0] ;
         n343TBT14_UPD_PROG_NM = P006N2_n343TBT14_UPD_PROG_NM[0] ;
         A344TBT14_UPD_CNT = P006N2_A344TBT14_UPD_CNT[0] ;
         n344TBT14_UPD_CNT = P006N2_n344TBT14_UPD_CNT[0] ;
         AV25GXLvl55 = (byte)(1) ;
         A933TBT14_KAKUNIN_COMMENT = AV22P_KAKUNIN_COMMENT ;
         n933TBT14_KAKUNIN_COMMENT = false ;
         A927TBT14_KAKUNIN_FLG = AV9P_KAKUNIN_CHK ;
         n927TBT14_KAKUNIN_FLG = false ;
         if ( GXutil.strcmp(AV9P_KAKUNIN_CHK, "0") == 0 )
         {
            A931TBT14_KAKUNIN_USER_ID = "" ;
            n931TBT14_KAKUNIN_USER_ID = false ;
         }
         else
         {
            A931TBT14_KAKUNIN_USER_ID = AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n931TBT14_KAKUNIN_USER_ID = false ;
         }
         A341TBT14_UPD_DATETIME = GXutil.now( ) ;
         n341TBT14_UPD_DATETIME = false ;
         A342TBT14_UPD_USER_ID = AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
         n342TBT14_UPD_USER_ID = false ;
         A343TBT14_UPD_PROG_NM = AV26Pgmname ;
         n343TBT14_UPD_PROG_NM = false ;
         A344TBT14_UPD_CNT = (long)(A344TBT14_UPD_CNT+1) ;
         n344TBT14_UPD_CNT = false ;
         AV19W_LOGTEXT = "" ;
         AV19W_LOGTEXT = AV19W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV11P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV19W_LOGTEXT = AV19W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV12P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
         AV19W_LOGTEXT = AV19W_LOGTEXT + "MEMO_NO:" + GXutil.trim( GXutil.str( AV10P_MEMO_NO, 3, 0)) + GXutil.chr( (short)(9)) ;
         AV19W_LOGTEXT = AV19W_LOGTEXT + "KAKUNIN_COMMENT:" + AV22P_KAKUNIN_COMMENT + GXutil.chr( (short)(9)) ;
         AV19W_LOGTEXT = AV19W_LOGTEXT + "KAKUNIN_FLG:" + AV9P_KAKUNIN_CHK + GXutil.chr( (short)(9)) ;
         AV19W_LOGTEXT = GXutil.strReplace( AV19W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV26Pgmname, "UPD", AV19W_LOGTEXT) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P006N3 */
         pr_default.execute(1, new Object[] {new Boolean(n933TBT14_KAKUNIN_COMMENT), A933TBT14_KAKUNIN_COMMENT, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n931TBT14_KAKUNIN_USER_ID), A931TBT14_KAKUNIN_USER_ID, new Boolean(n341TBT14_UPD_DATETIME), A341TBT14_UPD_DATETIME, new Boolean(n342TBT14_UPD_USER_ID), A342TBT14_UPD_USER_ID, new Boolean(n343TBT14_UPD_PROG_NM), A343TBT14_UPD_PROG_NM, new Boolean(n344TBT14_UPD_CNT), new Long(A344TBT14_UPD_CNT), new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
         if (true) break;
         /* Using cursor P006N4 */
         pr_default.execute(2, new Object[] {new Boolean(n933TBT14_KAKUNIN_COMMENT), A933TBT14_KAKUNIN_COMMENT, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n931TBT14_KAKUNIN_USER_ID), A931TBT14_KAKUNIN_USER_ID, new Boolean(n341TBT14_UPD_DATETIME), A341TBT14_UPD_DATETIME, new Boolean(n342TBT14_UPD_USER_ID), A342TBT14_UPD_USER_ID, new Boolean(n343TBT14_UPD_PROG_NM), A343TBT14_UPD_PROG_NM, new Boolean(n344TBT14_UPD_CNT), new Long(A344TBT14_UPD_CNT), new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV25GXLvl55 == 0 )
      {
         AV15W_ERR_FLG = "1" ;
         GXt_char1 = AV16W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
         ab707_pc03_kanryo_memo_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16W_ERR_MSG = GXt_char1 ;
      }
   }

   public void S12109( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV14W_A_LOGIN_SDT;
      GXv_char2[0] = AV17W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab707_pc03_kanryo_memo_impl.this.AV17W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV17W_ERRCD, "0") != 0 )
      {
         AV13SD_B707_SD04_KANRYO_MEMO_RTN.setgxTv_SdtB707_SD04_KANRYO_MEMO_RTN_Result_cd( "9" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SD_B707_SD04_KANRYO_MEMO_RTN", AV13SD_B707_SD04_KANRYO_MEMO_RTN);
         AV8HttpResponse.addString(AV13SD_B707_SD04_KANRYO_MEMO_RTN.toJSonString());
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      new a804_pc02_log_start(remoteHandle, context).execute( AV26Pgmname) ;
   }

   public void S13132( )
   {
      /* 'SUB_ERROR' Routine */
      AV15W_ERR_FLG = "1" ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV26Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV13SD_B707_SD04_KANRYO_MEMO_RTN.setgxTv_SdtB707_SD04_KANRYO_MEMO_RTN_Result_cd( "9" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SD_B707_SD04_KANRYO_MEMO_RTN", AV13SD_B707_SD04_KANRYO_MEMO_RTN);
      AV13SD_B707_SD04_KANRYO_MEMO_RTN.setgxTv_SdtB707_SD04_KANRYO_MEMO_RTN_Err_msg( GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SD_B707_SD04_KANRYO_MEMO_RTN", AV13SD_B707_SD04_KANRYO_MEMO_RTN);
      AV8HttpResponse.addString(AV13SD_B707_SD04_KANRYO_MEMO_RTN.toJSonString());
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
                  /* Execute user subroutine: S13132 */
                  S13132 ();
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
      AV22P_KAKUNIN_COMMENT = "" ;
      AV9P_KAKUNIN_CHK = "" ;
      AV15W_ERR_FLG = "" ;
      AV16W_ERR_MSG = "" ;
      AV13SD_B707_SD04_KANRYO_MEMO_RTN = new SdtB707_SD04_KANRYO_MEMO_RTN(remoteHandle, context);
      AV8HttpResponse = httpContext.getHttpResponse();
      A931TBT14_KAKUNIN_USER_ID = "" ;
      scmdbuf = "" ;
      P006N2_A922TBT14_MEMO_NO = new short[1] ;
      P006N2_A330TBT14_SUBJECT_ID = new int[1] ;
      P006N2_A329TBT14_STUDY_ID = new long[1] ;
      P006N2_A933TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      P006N2_n933TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      P006N2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      P006N2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      P006N2_A931TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      P006N2_n931TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      P006N2_A341TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P006N2_n341TBT14_UPD_DATETIME = new boolean[] {false} ;
      P006N2_A342TBT14_UPD_USER_ID = new String[] {""} ;
      P006N2_n342TBT14_UPD_USER_ID = new boolean[] {false} ;
      P006N2_A343TBT14_UPD_PROG_NM = new String[] {""} ;
      P006N2_n343TBT14_UPD_PROG_NM = new boolean[] {false} ;
      P006N2_A344TBT14_UPD_CNT = new long[1] ;
      P006N2_n344TBT14_UPD_CNT = new boolean[] {false} ;
      A933TBT14_KAKUNIN_COMMENT = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A341TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A342TBT14_UPD_USER_ID = "" ;
      A343TBT14_UPD_PROG_NM = "" ;
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV26Pgmname = "" ;
      AV19W_LOGTEXT = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV17W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab707_pc03_kanryo_memo__default(),
         new Object[] {
             new Object[] {
            P006N2_A922TBT14_MEMO_NO, P006N2_A330TBT14_SUBJECT_ID, P006N2_A329TBT14_STUDY_ID, P006N2_A933TBT14_KAKUNIN_COMMENT, P006N2_n933TBT14_KAKUNIN_COMMENT, P006N2_A927TBT14_KAKUNIN_FLG, P006N2_n927TBT14_KAKUNIN_FLG, P006N2_A931TBT14_KAKUNIN_USER_ID, P006N2_n931TBT14_KAKUNIN_USER_ID, P006N2_A341TBT14_UPD_DATETIME,
            P006N2_n341TBT14_UPD_DATETIME, P006N2_A342TBT14_UPD_USER_ID, P006N2_n342TBT14_UPD_USER_ID, P006N2_A343TBT14_UPD_PROG_NM, P006N2_n343TBT14_UPD_PROG_NM, P006N2_A344TBT14_UPD_CNT, P006N2_n344TBT14_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV26Pgmname = "AB707_PC03_KANRYO_MEMO" ;
      /* GeneXus formulas. */
      AV26Pgmname = "AB707_PC03_KANRYO_MEMO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25GXLvl55 ;
   private short AV10P_MEMO_NO ;
   private short A922TBT14_MEMO_NO ;
   private short Gx_err ;
   private int AV12P_SUBJECT_ID ;
   private int A330TBT14_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private long A329TBT14_STUDY_ID ;
   private long A344TBT14_UPD_CNT ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String AV26Pgmname ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private java.util.Date A341TBT14_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n933TBT14_KAKUNIN_COMMENT ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n931TBT14_KAKUNIN_USER_ID ;
   private boolean n341TBT14_UPD_DATETIME ;
   private boolean n342TBT14_UPD_USER_ID ;
   private boolean n343TBT14_UPD_PROG_NM ;
   private boolean n344TBT14_UPD_CNT ;
   private String AV22P_KAKUNIN_COMMENT ;
   private String AV9P_KAKUNIN_CHK ;
   private String AV15W_ERR_FLG ;
   private String AV16W_ERR_MSG ;
   private String A931TBT14_KAKUNIN_USER_ID ;
   private String A933TBT14_KAKUNIN_COMMENT ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A342TBT14_UPD_USER_ID ;
   private String A343TBT14_UPD_PROG_NM ;
   private String AV19W_LOGTEXT ;
   private String AV17W_ERRCD ;
   private SdtB707_SD04_KANRYO_MEMO_RTN AV13SD_B707_SD04_KANRYO_MEMO_RTN ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private short[] P006N2_A922TBT14_MEMO_NO ;
   private int[] P006N2_A330TBT14_SUBJECT_ID ;
   private long[] P006N2_A329TBT14_STUDY_ID ;
   private String[] P006N2_A933TBT14_KAKUNIN_COMMENT ;
   private boolean[] P006N2_n933TBT14_KAKUNIN_COMMENT ;
   private String[] P006N2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] P006N2_n927TBT14_KAKUNIN_FLG ;
   private String[] P006N2_A931TBT14_KAKUNIN_USER_ID ;
   private boolean[] P006N2_n931TBT14_KAKUNIN_USER_ID ;
   private java.util.Date[] P006N2_A341TBT14_UPD_DATETIME ;
   private boolean[] P006N2_n341TBT14_UPD_DATETIME ;
   private String[] P006N2_A342TBT14_UPD_USER_ID ;
   private boolean[] P006N2_n342TBT14_UPD_USER_ID ;
   private String[] P006N2_A343TBT14_UPD_PROG_NM ;
   private boolean[] P006N2_n343TBT14_UPD_PROG_NM ;
   private long[] P006N2_A344TBT14_UPD_CNT ;
   private boolean[] P006N2_n344TBT14_UPD_CNT ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class ab707_pc03_kanryo_memo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006N2", "SELECT `TBT14_MEMO_NO`, `TBT14_SUBJECT_ID`, `TBT14_STUDY_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_PROG_NM`, `TBT14_UPD_CNT` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ? and `TBT14_MEMO_NO` = ? ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  LIMIT 1 FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006N3", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_KAKUNIN_COMMENT`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_KAKUNIN_USER_ID`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_PROG_NM`=?, `TBT14_UPD_CNT`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006N4", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_KAKUNIN_COMMENT`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_KAKUNIN_USER_ID`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_PROG_NM`=?, `TBT14_UPD_CNT`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
                  stmt.setVarchar(1, (String)parms[1], 2000);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
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
                  stmt.setVarchar(1, (String)parms[1], 2000);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
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
      }
   }

}

