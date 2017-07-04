/*
               File: B514_PC02_INSERT_COND
        Description: AIRからの条件挿入
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:43.44
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b514_pc02_insert_cond extends GXProcedure
{
   public b514_pc02_insert_cond( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b514_pc02_insert_cond.class ), "" );
   }

   public b514_pc02_insert_cond( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             java.util.Date aP1 ,
                             String aP2 ,
                             short[] aP3 )
   {
      b514_pc02_insert_cond.this.AV10P_SESSION_ID = aP0;
      b514_pc02_insert_cond.this.AV9P_DATETIME = aP1;
      b514_pc02_insert_cond.this.AV8P_CSV_COND = aP2;
      b514_pc02_insert_cond.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        String aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             String aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b514_pc02_insert_cond.this.AV10P_SESSION_ID = aP0;
      b514_pc02_insert_cond.this.AV9P_DATETIME = aP1;
      b514_pc02_insert_cond.this.AV8P_CSV_COND = aP2;
      b514_pc02_insert_cond.this.aP3 = aP3;
      b514_pc02_insert_cond.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
      /* Execute user subroutine: S1148 */
      S1148 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_objcol_char1 = AV13W_CSV_ROW ;
      GXv_objcol_char2[0] = GXt_objcol_char1 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV8P_CSV_COND, GXv_objcol_char2) ;
      GXt_objcol_char1 = GXv_objcol_char2[0] ;
      AV13W_CSV_ROW = GXt_objcol_char1 ;
      AV11W_CNT = 1 ;
      while ( AV11W_CNT <= AV13W_CSV_ROW.size() )
      {
         GXv_objcol_char2[0] = AV12W_CSV_COL ;
         GXv_int3[0] = AV14W_RTN_CD ;
         GXv_char4[0] = AV15W_RTN_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV13W_CSV_ROW.elementAt(-1+(int)(AV11W_CNT)), 3, "CSV条件ワークテーブル", GXv_objcol_char2, GXv_int3, GXv_char4) ;
         AV12W_CSV_COL = GXv_objcol_char2[0] ;
         b514_pc02_insert_cond.this.AV14W_RTN_CD = GXv_int3[0] ;
         b514_pc02_insert_cond.this.AV15W_RTN_MSG = GXv_char4[0] ;
         if ( AV14W_RTN_CD != 0 )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /*
            INSERT RECORD ON TABLE TBW11_COND_WORK

         */
         A741TBW11_SESSION_ID = AV10P_SESSION_ID ;
         A742TBW11_DATETIME = AV9P_DATETIME ;
         A743TBW11_STUDY_ID = GXutil.lval( (String)AV12W_CSV_COL.elementAt(-1+1)) ;
         A744TBW11_SUBJECT_ID = (int)(GXutil.lval( (String)AV12W_CSV_COL.elementAt(-1+2))) ;
         A745TBW11_CRF_ID = (short)(GXutil.lval( (String)AV12W_CSV_COL.elementAt(-1+3))) ;
         /* Using cursor P004T2 */
         pr_default.execute(0, new Object[] {A741TBW11_SESSION_ID, A742TBW11_DATETIME, new Long(A743TBW11_STUDY_ID), new Integer(A744TBW11_SUBJECT_ID), new Short(A745TBW11_CRF_ID)});
         if ( (pr_default.getStatus(0) == 1) )
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
         AV11W_CNT = (long)(AV11W_CNT+1) ;
      }
      cleanup();
   }

   public void S1148( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1258( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV14W_RTN_CD = (short)(9) ;
      GXt_char5 = AV15W_RTN_MSG ;
      GXv_char4[0] = GXt_char5 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char4) ;
      b514_pc02_insert_cond.this.GXt_char5 = GXv_char4[0] ;
      AV15W_RTN_MSG = GXt_char5 ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b514_pc02_insert_cond.this.AV14W_RTN_CD;
      this.aP4[0] = b514_pc02_insert_cond.this.AV15W_RTN_MSG;
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
                  /* Execute user subroutine: S1258 */
                  S1258 ();
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
      AV15W_RTN_MSG = "" ;
      AV13W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char1 = new GxObjectCollection(String.class, "internal", "");
      AV12W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char2 = new GxObjectCollection [1] ;
      GXv_int3 = new short [1] ;
      A741TBW11_SESSION_ID = "" ;
      A742TBW11_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      AV18Pgmname = "" ;
      GXt_char5 = "" ;
      GXv_char4 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b514_pc02_insert_cond__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV18Pgmname = "B514_PC02_INSERT_COND" ;
      /* GeneXus formulas. */
      AV18Pgmname = "B514_PC02_INSERT_COND" ;
      Gx_err = (short)(0) ;
   }

   private short AV14W_RTN_CD ;
   private short GXv_int3[] ;
   private short A745TBW11_CRF_ID ;
   private short Gx_err ;
   private int GX_INS47 ;
   private int A744TBW11_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV11W_CNT ;
   private long A743TBW11_STUDY_ID ;
   private String Gx_emsg ;
   private String AV18Pgmname ;
   private String GXt_char5 ;
   private String GXv_char4[] ;
   private java.util.Date AV9P_DATETIME ;
   private java.util.Date A742TBW11_DATETIME ;
   private boolean returnInSub ;
   private String AV10P_SESSION_ID ;
   private String AV8P_CSV_COND ;
   private String AV15W_RTN_MSG ;
   private String A741TBW11_SESSION_ID ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private GxObjectCollection AV13W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char1 ;
   private GxObjectCollection AV12W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char2[] ;
}

final  class b514_pc02_insert_cond__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P004T2", "INSERT INTO `TBW11_COND_WORK` (`TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID`) VALUES (?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
      }
   }

}

