/*
               File: ab702_pc04_del_crf_design_impl
        Description: CRFÉfÉUÉCÉìèÓïÒçÌèúèàóù
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:17.51
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab702_pc04_del_crf_design_impl extends GXWebProcedure
{
   public ab702_pc04_del_crf_design_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S1153 */
      S1153 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char1 = AV19W_TBW01_DISP_DATETIME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV10SD_B792_SD00_HTML5_EXEC_INFO.getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(), "YYYYMMDDHHMISS", GXv_char2) ;
      ab702_pc04_del_crf_design_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19W_TBW01_DISP_DATETIME = GXt_char1 ;
      /* Using cursor P006C2 */
      pr_default.execute(0, new Object[] {AV17W_SESSION.getId(), AV19W_TBW01_DISP_DATETIME});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A876TBW14_DISP_DATETIME = P006C2_A876TBW14_DISP_DATETIME[0] ;
         A875TBW14_SESSION_ID = P006C2_A875TBW14_SESSION_ID[0] ;
         A880TBW14_CRF_ID = P006C2_A880TBW14_CRF_ID[0] ;
         A883TBW14_SUBJECT_ID = P006C2_A883TBW14_SUBJECT_ID[0] ;
         A878TBW14_STUDY_ID = P006C2_A878TBW14_STUDY_ID[0] ;
         A881TBW14_CRF_LATEST_VERSION = P006C2_A881TBW14_CRF_LATEST_VERSION[0] ;
         new b704_pc03_remove_crf_val(remoteHandle, context).execute( A878TBW14_STUDY_ID, A883TBW14_SUBJECT_ID, A880TBW14_CRF_ID) ;
         /* Using cursor P006C3 */
         pr_default.execute(1, new Object[] {A875TBW14_SESSION_ID, A876TBW14_DISP_DATETIME, new Long(A878TBW14_STUDY_ID), new Integer(A883TBW14_SUBJECT_ID), new Short(A880TBW14_CRF_ID), new Short(A881TBW14_CRF_LATEST_VERSION)});
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Application.commit(context, remoteHandle, "DEFAULT", "ab702_pc04_del_crf_design");
      GXt_char1 = AV18W_SESSION_KEY ;
      GXv_char2[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
      ab702_pc04_del_crf_design_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18W_SESSION_KEY = GXt_char1 ;
      AV17W_SESSION.remove(AV18W_SESSION_KEY);
      GXt_char1 = AV18W_SESSION_KEY ;
      GXv_char2[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
      ab702_pc04_del_crf_design_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18W_SESSION_KEY = GXt_char1 ;
      AV17W_SESSION.remove(AV18W_SESSION_KEY);
      AV9SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SD_B704_SD01_CRF_VAL_RTN", AV9SD_B704_SD01_CRF_VAL_RTN);
      AV9SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SD_B704_SD01_CRF_VAL_RTN", AV9SD_B704_SD01_CRF_VAL_RTN);
      AV8HttpResponse.addString(AV9SD_B704_SD01_CRF_VAL_RTN.toJSonString());
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1153( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV11W_A_LOGIN_SDT;
      GXv_char2[0] = AV14W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab702_pc04_del_crf_design_impl.this.AV14W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV14W_ERRCD, "0") != 0 )
      {
         AV9SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( "9" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SD_B704_SD01_CRF_VAL_RTN", AV9SD_B704_SD01_CRF_VAL_RTN);
         AV9SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SD_B704_SD01_CRF_VAL_RTN", AV9SD_B704_SD01_CRF_VAL_RTN);
         AV8HttpResponse.addString(AV9SD_B704_SD01_CRF_VAL_RTN.toJSonString());
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV18W_SESSION_KEY ;
      GXv_char2[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
      ab702_pc04_del_crf_design_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18W_SESSION_KEY = GXt_char1 ;
      AV10SD_B792_SD00_HTML5_EXEC_INFO.fromxml(AV17W_SESSION.getValue(AV18W_SESSION_KEY), "");
   }

   public void S1278( )
   {
      /* 'SUB_ERROR' Routine */
      Application.rollback(context, remoteHandle, "DEFAULT", "ab702_pc04_del_crf_design");
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV9SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( "9" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SD_B704_SD01_CRF_VAL_RTN", AV9SD_B704_SD01_CRF_VAL_RTN);
      AV9SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SD_B704_SD01_CRF_VAL_RTN", AV9SD_B704_SD01_CRF_VAL_RTN);
      AV8HttpResponse.addString(AV9SD_B704_SD01_CRF_VAL_RTN.toJSonString());
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
                  /* Execute user subroutine: S1278 */
                  S1278 ();
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
      AV19W_TBW01_DISP_DATETIME = "" ;
      AV10SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      AV17W_SESSION = httpContext.getWebSession();
      scmdbuf = "" ;
      P006C2_A876TBW14_DISP_DATETIME = new String[] {""} ;
      P006C2_A875TBW14_SESSION_ID = new String[] {""} ;
      P006C2_A880TBW14_CRF_ID = new short[1] ;
      P006C2_A883TBW14_SUBJECT_ID = new int[1] ;
      P006C2_A878TBW14_STUDY_ID = new long[1] ;
      P006C2_A881TBW14_CRF_LATEST_VERSION = new short[1] ;
      A876TBW14_DISP_DATETIME = "" ;
      A875TBW14_SESSION_ID = "" ;
      AV18W_SESSION_KEY = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV9SD_B704_SD01_CRF_VAL_RTN = new SdtB704_SD01_CRF_VAL_RTN(remoteHandle, context);
      AV8HttpResponse = httpContext.getHttpResponse();
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV14W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      AV23Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab702_pc04_del_crf_design__default(),
         new Object[] {
             new Object[] {
            P006C2_A876TBW14_DISP_DATETIME, P006C2_A875TBW14_SESSION_ID, P006C2_A880TBW14_CRF_ID, P006C2_A883TBW14_SUBJECT_ID, P006C2_A878TBW14_STUDY_ID, P006C2_A881TBW14_CRF_LATEST_VERSION
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "AB702_PC04_DEL_CRF_DESIGN" ;
      /* GeneXus formulas. */
      AV23Pgmname = "AB702_PC04_DEL_CRF_DESIGN" ;
      Gx_err = (short)(0) ;
   }

   private short A880TBW14_CRF_ID ;
   private short A881TBW14_CRF_LATEST_VERSION ;
   private short Gx_err ;
   private int A883TBW14_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long A878TBW14_STUDY_ID ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String AV23Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV19W_TBW01_DISP_DATETIME ;
   private String A876TBW14_DISP_DATETIME ;
   private String A875TBW14_SESSION_ID ;
   private String AV18W_SESSION_KEY ;
   private String AV14W_ERRCD ;
   private com.genexus.webpanels.WebSession AV17W_SESSION ;
   private SdtB704_SD01_CRF_VAL_RTN AV9SD_B704_SD01_CRF_VAL_RTN ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV10SD_B792_SD00_HTML5_EXEC_INFO ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] P006C2_A876TBW14_DISP_DATETIME ;
   private String[] P006C2_A875TBW14_SESSION_ID ;
   private short[] P006C2_A880TBW14_CRF_ID ;
   private int[] P006C2_A883TBW14_SUBJECT_ID ;
   private long[] P006C2_A878TBW14_STUDY_ID ;
   private short[] P006C2_A881TBW14_CRF_LATEST_VERSION ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class ab702_pc04_del_crf_design__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006C2", "SELECT `TBW14_DISP_DATETIME`, `TBW14_SESSION_ID`, `TBW14_CRF_ID`, `TBW14_SUBJECT_ID`, `TBW14_STUDY_ID`, `TBW14_CRF_LATEST_VERSION` FROM `TBW14_CRF_SDT_WORK` WHERE `TBW14_SESSION_ID` = ? and `TBW14_DISP_DATETIME` = ? ORDER BY `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P006C3", "DELETE FROM `TBW14_CRF_SDT_WORK`  WHERE `TBW14_SESSION_ID` = ? AND `TBW14_DISP_DATETIME` = ? AND `TBW14_STUDY_ID` = ? AND `TBW14_SUBJECT_ID` = ? AND `TBW14_CRF_ID` = ? AND `TBW14_CRF_LATEST_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
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
               stmt.setString(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 14);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 14, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
      }
   }

}

