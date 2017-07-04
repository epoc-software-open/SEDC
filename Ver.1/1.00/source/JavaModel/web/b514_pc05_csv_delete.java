/*
               File: B514_PC05_CSV_DELETE
        Description: CSVçÌèú
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:43.53
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b514_pc05_csv_delete extends GXProcedure
{
   public b514_pc05_csv_delete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b514_pc05_csv_delete.class ), "" );
   }

   public b514_pc05_csv_delete( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( byte[] aP0 )
   {
      b514_pc05_csv_delete.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( byte[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( byte[] aP0 ,
                             String[] aP1 )
   {
      b514_pc05_csv_delete.this.aP0 = aP0;
      b514_pc05_csv_delete.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12W_STUDY_ID = 0 ;
      AV11W_RTN_MSG = "" ;
      AV10W_RTN_CD = (byte)(0) ;
      /* Execute user subroutine: S1157 */
      S1157 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P004U2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A743TBW11_STUDY_ID = P004U2_A743TBW11_STUDY_ID[0] ;
         A741TBW11_SESSION_ID = P004U2_A741TBW11_SESSION_ID[0] ;
         A742TBW11_DATETIME = P004U2_A742TBW11_DATETIME[0] ;
         A744TBW11_SUBJECT_ID = P004U2_A744TBW11_SUBJECT_ID[0] ;
         A745TBW11_CRF_ID = P004U2_A745TBW11_CRF_ID[0] ;
         if ( AV12W_STUDY_ID != A743TBW11_STUDY_ID )
         {
            AV13directory.setSource( "C://"+GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)) );
            if ( AV13directory.exists() )
            {
               AV18GXV2 = 1 ;
               AV17GXV1 = (com.genexus.util.GXFileCollection)AV13directory.getFiles("csv");
               while ( AV18GXV2 <= AV17GXV1.getItemCount() )
               {
                  AV8File = (com.genexus.util.GXFile)AV17GXV1.item((short)(AV18GXV2));
                  AV8File.delete();
                  if ( AV8File.getErrCode() != 0 )
                  {
                     new a804_pc01_syslog(remoteHandle, context).execute( AV19Pgmname, "ERR", GXutil.trim( GXutil.str( AV8File.getErrCode(), 10, 0))+":"+AV11W_RTN_MSG) ;
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV18GXV2 = (int)(AV18GXV2+1) ;
               }
            }
         }
         AV12W_STUDY_ID = A743TBW11_STUDY_ID ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S1157( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1267( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV19Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV10W_RTN_CD = (byte)(9) ;
      GXt_char1 = AV11W_RTN_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
      b514_pc05_csv_delete.this.GXt_char1 = GXv_char2[0] ;
      AV11W_RTN_MSG = GXt_char1 ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP0[0] = b514_pc05_csv_delete.this.AV10W_RTN_CD;
      this.aP1[0] = b514_pc05_csv_delete.this.AV11W_RTN_MSG;
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
                  /* Execute user subroutine: S1267 */
                  S1267 ();
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
      AV11W_RTN_MSG = "" ;
      scmdbuf = "" ;
      P004U2_A743TBW11_STUDY_ID = new long[1] ;
      P004U2_A741TBW11_SESSION_ID = new String[] {""} ;
      P004U2_A742TBW11_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004U2_A744TBW11_SUBJECT_ID = new int[1] ;
      P004U2_A745TBW11_CRF_ID = new short[1] ;
      A741TBW11_SESSION_ID = "" ;
      A742TBW11_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV13directory = new com.genexus.util.GXDirectory();
      AV17GXV1 = new com.genexus.util.GXFileCollection();
      AV8File = new com.genexus.util.GXFile();
      AV19Pgmname = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b514_pc05_csv_delete__default(),
         new Object[] {
             new Object[] {
            P004U2_A743TBW11_STUDY_ID, P004U2_A741TBW11_SESSION_ID, P004U2_A742TBW11_DATETIME, P004U2_A744TBW11_SUBJECT_ID, P004U2_A745TBW11_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV19Pgmname = "B514_PC05_CSV_DELETE" ;
      /* GeneXus formulas. */
      AV19Pgmname = "B514_PC05_CSV_DELETE" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10W_RTN_CD ;
   private short A745TBW11_CRF_ID ;
   private short Gx_err ;
   private int A744TBW11_SUBJECT_ID ;
   private int AV18GXV2 ;
   private int GXActiveErrHndl ;
   private long AV12W_STUDY_ID ;
   private long A743TBW11_STUDY_ID ;
   private String scmdbuf ;
   private String AV19Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A742TBW11_DATETIME ;
   private boolean returnInSub ;
   private String AV11W_RTN_MSG ;
   private String A741TBW11_SESSION_ID ;
   private com.genexus.util.GXDirectory AV13directory ;
   private byte[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P004U2_A743TBW11_STUDY_ID ;
   private String[] P004U2_A741TBW11_SESSION_ID ;
   private java.util.Date[] P004U2_A742TBW11_DATETIME ;
   private int[] P004U2_A744TBW11_SUBJECT_ID ;
   private short[] P004U2_A745TBW11_CRF_ID ;
   private com.genexus.util.GXFile AV8File ;
   private com.genexus.util.GXFileCollection AV17GXV1 ;
}

final  class b514_pc05_csv_delete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004U2", "SELECT `TBW11_STUDY_ID`, `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID` FROM `TBW11_COND_WORK` ORDER BY `TBW11_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

