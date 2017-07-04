/*
               File: B514_PC03_DELETE_WORK
        Description: ワークテーブル削除
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:41.95
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b514_pc03_delete_work extends GXProcedure
{
   public b514_pc03_delete_work( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b514_pc03_delete_work.class ), "" );
   }

   public b514_pc03_delete_work( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             java.util.Date aP1 ,
                             byte[] aP2 )
   {
      b514_pc03_delete_work.this.AV10W_SESSION_ID = aP0;
      b514_pc03_delete_work.this.AV9W_DATETIME = aP1;
      b514_pc03_delete_work.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      b514_pc03_delete_work.this.AV10W_SESSION_ID = aP0;
      b514_pc03_delete_work.this.AV9W_DATETIME = aP1;
      b514_pc03_delete_work.this.aP2 = aP2;
      b514_pc03_delete_work.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8W_RTN_CD = (byte)(0) ;
      AV11W_RTN_MSG = "" ;
      /* Execute user subroutine: S1153 */
      S1153 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Optimized DELETE. */
      /* Using cursor P004R2 */
      pr_default.execute(0, new Object[] {AV10W_SESSION_ID, AV9W_DATETIME});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P004R3 */
      pr_default.execute(1, new Object[] {AV10W_SESSION_ID, AV9W_DATETIME});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P004R4 */
      pr_default.execute(2, new Object[] {AV10W_SESSION_ID, AV9W_DATETIME});
      /* End optimized DELETE. */
      cleanup();
   }

   public void S1153( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1263( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV17Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV8W_RTN_CD = (byte)(9) ;
      GXt_char1 = AV11W_RTN_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
      b514_pc03_delete_work.this.GXt_char1 = GXv_char2[0] ;
      AV11W_RTN_MSG = GXt_char1 ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b514_pc03_delete_work.this.AV8W_RTN_CD;
      this.aP3[0] = b514_pc03_delete_work.this.AV11W_RTN_MSG;
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
                  /* Execute user subroutine: S1263 */
                  S1263 ();
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
      AV17Pgmname = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b514_pc03_delete_work__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV17Pgmname = "B514_PC03_DELETE_WORK" ;
      /* GeneXus formulas. */
      AV17Pgmname = "B514_PC03_DELETE_WORK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV8W_RTN_CD ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String AV17Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date AV9W_DATETIME ;
   private boolean returnInSub ;
   private String AV10W_SESSION_ID ;
   private String AV11W_RTN_MSG ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class b514_pc03_delete_work__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P004R2", "DELETE FROM `TBW10_CSV_WORK`  WHERE `TBW10_SESSION_ID` = ? and `TBW10_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P004R3", "DELETE FROM `TBW11_COND_WORK`  WHERE `TBW11_SESSION_ID` = ? and `TBW11_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P004R4", "DELETE FROM `TBW13_CSV_RECORD`  WHERE `TBW13_SESSION_ID` = ? and `TBW13_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
      }
   }

}

