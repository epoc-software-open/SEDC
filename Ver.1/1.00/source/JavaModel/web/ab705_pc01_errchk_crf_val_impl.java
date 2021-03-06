/*
               File: ab705_pc01_errchk_crf_val_impl
        Description: CRF入力エラーチェック処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:7.95
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab705_pc01_errchk_crf_val_impl extends GXWebProcedure
{
   public ab705_pc01_errchk_crf_val_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV13P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV14P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11P_CRF_LATEST_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV12P_DM_ARRIVAL_FLG = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S12115 */
      S12115 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_SdtB792_SD01_CRF1[0] = AV18SD_B792_SD01_CRF;
      GXv_char2[0] = AV23W_RTN_CD ;
      new b704_pc02_get_crf_val(remoteHandle, context).execute( GXv_SdtB792_SD01_CRF1, GXv_char2) ;
      AV18SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF1[0] ;
      ab705_pc01_errchk_crf_val_impl.this.AV23W_RTN_CD = GXv_char2[0] ;
      if ( ( AV18SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id() == AV13P_STUDY_ID ) && ( AV18SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id() == AV14P_SUBJECT_ID ) && ( AV18SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id() == AV9P_CRF_ID ) && ( AV18SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() == AV11P_CRF_LATEST_VERSION ) )
      {
      }
      else
      {
         GXv_char2[0] = AV23W_RTN_CD ;
         GXv_char3[0] = AV22W_MSG ;
         new b799_pc07_sdt_work_reg(remoteHandle, context).execute( AV24W_SESSION.getId(), AV17SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV18SD_B792_SD01_CRF, GXv_char2, GXv_char3) ;
         ab705_pc01_errchk_crf_val_impl.this.AV23W_RTN_CD = GXv_char2[0] ;
         ab705_pc01_errchk_crf_val_impl.this.AV22W_MSG = GXv_char3[0] ;
         GXv_SdtB792_SD01_CRF1[0] = AV18SD_B792_SD01_CRF;
         GXv_char3[0] = AV23W_RTN_CD ;
         GXv_char2[0] = AV22W_MSG ;
         new b799_pc08_sdt_work_get(remoteHandle, context).execute( AV24W_SESSION.getId(), AV17SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), AV13P_STUDY_ID, AV14P_SUBJECT_ID, AV9P_CRF_ID, AV11P_CRF_LATEST_VERSION, GXv_SdtB792_SD01_CRF1, GXv_char3, GXv_char2) ;
         AV18SD_B792_SD01_CRF = GXv_SdtB792_SD01_CRF1[0] ;
         ab705_pc01_errchk_crf_val_impl.this.AV23W_RTN_CD = GXv_char3[0] ;
         ab705_pc01_errchk_crf_val_impl.this.AV22W_MSG = GXv_char2[0] ;
      }
      GXv_SdtB705_SD01_ERRCHK_RES4[0] = AV15SD_B705_SD01_ERRCHK_RES;
      GXv_char3[0] = AV23W_RTN_CD ;
      new b705_pc02_crf_value_chk(remoteHandle, context).execute( AV13P_STUDY_ID, AV14P_SUBJECT_ID, AV9P_CRF_ID, AV17SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(), AV18SD_B792_SD01_CRF, GXv_SdtB705_SD01_ERRCHK_RES4, GXv_char3) ;
      AV15SD_B705_SD01_ERRCHK_RES = GXv_SdtB705_SD01_ERRCHK_RES4[0] ;
      ab705_pc01_errchk_crf_val_impl.this.AV23W_RTN_CD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV23W_RTN_CD, "0") == 0 )
      {
         AV15SD_B705_SD01_ERRCHK_RES.setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15SD_B705_SD01_ERRCHK_RES", AV15SD_B705_SD01_ERRCHK_RES);
         AV16SD_B705_SD02_ERRCHK_ITEM_I = (SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem)new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
         AV15SD_B705_SD01_ERRCHK_RES.getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().add(AV16SD_B705_SD02_ERRCHK_ITEM_I, 0);
      }
      else
      {
         /* Execute user subroutine: S1189 */
         S1189 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV27W_ARRIVAL_FLG, "1") == 0 )
         {
            AV15SD_B705_SD01_ERRCHK_RES.setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd( "1" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15SD_B705_SD01_ERRCHK_RES", AV15SD_B705_SD01_ERRCHK_RES);
         }
         else
         {
            if ( GXutil.strcmp(AV12P_DM_ARRIVAL_FLG, "1") == 0 )
            {
               AV15SD_B705_SD01_ERRCHK_RES.setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd( "1" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15SD_B705_SD01_ERRCHK_RES", AV15SD_B705_SD01_ERRCHK_RES);
            }
            else
            {
               AV15SD_B705_SD01_ERRCHK_RES.setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd( "2" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15SD_B705_SD01_ERRCHK_RES", AV15SD_B705_SD01_ERRCHK_RES);
            }
         }
      }
      AV8HttpResponse.addString(AV15SD_B705_SD01_ERRCHK_RES.toJSonString());
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1189( )
   {
      /* 'SUB_DM_ARRIVAL_CHK' Routine */
      AV30GXLvl92 = (byte)(0) ;
      /* Using cursor P005V2 */
      pr_default.execute(0, new Object[] {new Long(AV13P_STUDY_ID), new Integer(AV14P_SUBJECT_ID), new Short(AV9P_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A294TBT02_CRF_ID = P005V2_A294TBT02_CRF_ID[0] ;
         A293TBT02_SUBJECT_ID = P005V2_A293TBT02_SUBJECT_ID[0] ;
         A292TBT02_STUDY_ID = P005V2_A292TBT02_STUDY_ID[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = P005V2_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         n564TBT02_DM_ARRIVAL_DATETIME = P005V2_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         AV30GXLvl92 = (byte)(1) ;
         if ( ! GXutil.nullDate().equals(A564TBT02_DM_ARRIVAL_DATETIME) )
         {
            AV27W_ARRIVAL_FLG = "1" ;
         }
         else
         {
            AV27W_ARRIVAL_FLG = "0" ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV30GXLvl92 == 0 )
      {
         AV27W_ARRIVAL_FLG = "0" ;
      }
   }

   public void S12115( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV20W_A_LOGIN_SDT;
      GXv_char3[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char3) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      ab705_pc01_errchk_crf_val_impl.this.AV21W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
      {
         AV15SD_B705_SD01_ERRCHK_RES.setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd( "9" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15SD_B705_SD01_ERRCHK_RES", AV15SD_B705_SD01_ERRCHK_RES);
         AV8HttpResponse.addString(AV15SD_B705_SD01_ERRCHK_RES.toJSonString());
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char6 = AV25W_SESSION_KEY ;
      GXv_char3[0] = GXt_char6 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char3) ;
      ab705_pc01_errchk_crf_val_impl.this.GXt_char6 = GXv_char3[0] ;
      AV25W_SESSION_KEY = GXt_char6 ;
      AV17SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV24W_SESSION.getValue(AV25W_SESSION_KEY), "");
   }

   public void S13139( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV31Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV15SD_B705_SD01_ERRCHK_RES.setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd( "9" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15SD_B705_SD01_ERRCHK_RES", AV15SD_B705_SD01_ERRCHK_RES);
      AV8HttpResponse.addString(AV15SD_B705_SD01_ERRCHK_RES.toJSonString());
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
                  /* Execute user subroutine: S13139 */
                  S13139 ();
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
      AV12P_DM_ARRIVAL_FLG = "" ;
      AV18SD_B792_SD01_CRF = new SdtB792_SD01_CRF(remoteHandle, context);
      AV23W_RTN_CD = "" ;
      AV24W_SESSION = httpContext.getWebSession();
      AV17SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      AV22W_MSG = "" ;
      GXv_SdtB792_SD01_CRF1 = new SdtB792_SD01_CRF [1] ;
      GXv_char2 = new String [1] ;
      AV15SD_B705_SD01_ERRCHK_RES = new SdtB705_SD01_ERRCHK_RES(remoteHandle, context);
      GXv_SdtB705_SD01_ERRCHK_RES4 = new SdtB705_SD01_ERRCHK_RES [1] ;
      AV16SD_B705_SD02_ERRCHK_ITEM_I = new SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem(remoteHandle, context);
      AV27W_ARRIVAL_FLG = "" ;
      AV8HttpResponse = httpContext.getHttpResponse();
      scmdbuf = "" ;
      P005V2_A294TBT02_CRF_ID = new short[1] ;
      P005V2_A293TBT02_SUBJECT_ID = new int[1] ;
      P005V2_A292TBT02_STUDY_ID = new long[1] ;
      P005V2_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005V2_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV21W_ERRCD = "" ;
      AV25W_SESSION_KEY = "" ;
      GXv_char3 = new String [1] ;
      AV31Pgmname = "" ;
      GXt_char6 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab705_pc01_errchk_crf_val__default(),
         new Object[] {
             new Object[] {
            P005V2_A294TBT02_CRF_ID, P005V2_A293TBT02_SUBJECT_ID, P005V2_A292TBT02_STUDY_ID, P005V2_A564TBT02_DM_ARRIVAL_DATETIME, P005V2_n564TBT02_DM_ARRIVAL_DATETIME
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV31Pgmname = "AB705_PC01_ERRCHK_CRF_VAL" ;
      /* GeneXus formulas. */
      AV31Pgmname = "AB705_PC01_ERRCHK_CRF_VAL" ;
      Gx_err = (short)(0) ;
   }

   private byte AV30GXLvl92 ;
   private short AV9P_CRF_ID ;
   private short AV11P_CRF_LATEST_VERSION ;
   private short A294TBT02_CRF_ID ;
   private short Gx_err ;
   private int AV14P_SUBJECT_ID ;
   private int A293TBT02_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13P_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private String gxfirstwebparm ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String GXv_char3[] ;
   private String AV31Pgmname ;
   private String GXt_char6 ;
   private String Gx_emsg ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private String AV12P_DM_ARRIVAL_FLG ;
   private String AV23W_RTN_CD ;
   private String AV22W_MSG ;
   private String AV27W_ARRIVAL_FLG ;
   private String AV21W_ERRCD ;
   private String AV25W_SESSION_KEY ;
   private com.genexus.webpanels.WebSession AV24W_SESSION ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV17SD_B792_SD00_HTML5_EXEC_INFO ;
   private IDataStoreProvider pr_default ;
   private short[] P005V2_A294TBT02_CRF_ID ;
   private int[] P005V2_A293TBT02_SUBJECT_ID ;
   private long[] P005V2_A292TBT02_STUDY_ID ;
   private java.util.Date[] P005V2_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P005V2_n564TBT02_DM_ARRIVAL_DATETIME ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private SdtB705_SD01_ERRCHK_RES AV15SD_B705_SD01_ERRCHK_RES ;
   private SdtB705_SD01_ERRCHK_RES GXv_SdtB705_SD01_ERRCHK_RES4[] ;
   private SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem AV16SD_B705_SD02_ERRCHK_ITEM_I ;
   private SdtB792_SD01_CRF AV18SD_B792_SD01_CRF ;
   private SdtB792_SD01_CRF GXv_SdtB792_SD01_CRF1[] ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
}

final  class ab705_pc01_errchk_crf_val__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005V2", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_DM_ARRIVAL_DATETIME` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
      }
   }

}

