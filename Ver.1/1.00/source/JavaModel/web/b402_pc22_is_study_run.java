/*
               File: B402_PC22_IS_STUDY_RUN
        Description: ŽŽŒ±’†”»’è
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:50.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc22_is_study_run extends GXProcedure
{
   public b402_pc22_is_study_run( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc22_is_study_run.class ), "" );
   }

   public b402_pc22_is_study_run( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public boolean executeUdp( long aP0 )
   {
      b402_pc22_is_study_run.this.AV9P_STUDY_ID = aP0;
      b402_pc22_is_study_run.this.aP1 = new boolean[] {false};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        boolean[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             boolean[] aP1 )
   {
      b402_pc22_is_study_run.this.AV9P_STUDY_ID = aP0;
      b402_pc22_is_study_run.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B402" ;
      /* Execute user subroutine: S1143 */
      S1143 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10W_RTN = false ;
      AV17GXLvl28 = (byte)(0) ;
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM21_STUDY" ;
      /* Using cursor P00582 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A189TBM21_DEL_FLG = P00582_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = P00582_n189TBM21_DEL_FLG[0] ;
         A513TBM21_STATUS = P00582_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = P00582_n513TBM21_STATUS[0] ;
         A186TBM21_STUDY_ID = P00582_A186TBM21_STUDY_ID[0] ;
         AV17GXLvl28 = (byte)(1) ;
         AV10W_RTN = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl28 == 0 )
      {
         AV10W_RTN = false ;
      }
      cleanup();
   }

   public void S1143( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1253( )
   {
      /* 'SUB_ERROR' Routine */
      AV14W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV14W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      AV11W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV14W_EXTRA_INFO;
      GXv_int2[0] = AV12W_ERR_CD ;
      GXv_char3[0] = AV13W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(0), AV11W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV14W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b402_pc22_is_study_run.this.AV12W_ERR_CD = GXv_int2[0] ;
      b402_pc22_is_study_run.this.AV13W_ERR_MSG = GXv_char3[0] ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_pc22_is_study_run");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b402_pc22_is_study_run.this.AV10W_RTN;
      CloseOpenCursors();
      exitApplication();
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
                  /* Execute user subroutine: S1253 */
                  S1253 ();
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
      AV8C_APP_ID = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00582_A189TBM21_DEL_FLG = new String[] {""} ;
      P00582_n189TBM21_DEL_FLG = new boolean[] {false} ;
      P00582_A513TBM21_STATUS = new String[] {""} ;
      P00582_n513TBM21_STATUS = new boolean[] {false} ;
      P00582_A186TBM21_STUDY_ID = new long[1] ;
      A189TBM21_DEL_FLG = "" ;
      A513TBM21_STATUS = "" ;
      AV14W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV11W_MSG = "" ;
      AV22Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      AV13W_ERR_MSG = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char4 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc22_is_study_run__default(),
         new Object[] {
             new Object[] {
            P00582_A189TBM21_DEL_FLG, P00582_n189TBM21_DEL_FLG, P00582_A513TBM21_STATUS, P00582_n513TBM21_STATUS, P00582_A186TBM21_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B402_PC22_IS_STUDY_RUN" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B402_PC22_IS_STUDY_RUN" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17GXLvl28 ;
   private short AV12W_ERR_CD ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String AV22Pgmname ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char4 ;
   private String Gx_emsg ;
   private boolean AV10W_RTN ;
   private boolean returnInSub ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n513TBM21_STATUS ;
   private String AV8C_APP_ID ;
   private String A189TBM21_DEL_FLG ;
   private String A513TBM21_STATUS ;
   private String AV11W_MSG ;
   private String AV13W_ERR_MSG ;
   private boolean[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00582_A189TBM21_DEL_FLG ;
   private boolean[] P00582_n189TBM21_DEL_FLG ;
   private String[] P00582_A513TBM21_STATUS ;
   private boolean[] P00582_n513TBM21_STATUS ;
   private long[] P00582_A186TBM21_STUDY_ID ;
   private SdtB808_SD01_EXTRA_INFO AV14W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
}

final  class b402_pc22_is_study_run__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00582", "SELECT `TBM21_DEL_FLG`, `TBM21_STATUS`, `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_STATUS` = '1') AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
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
      }
   }

}

