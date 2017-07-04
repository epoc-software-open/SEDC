/*
               File: B806_PC01_GET_CTRL_VAL
        Description: �K��l�擾����
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:8.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b806_pc01_get_ctrl_val extends GXProcedure
{
   public b806_pc01_get_ctrl_val( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b806_pc01_get_ctrl_val.class ), "" );
   }

   public b806_pc01_get_ctrl_val( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      b806_pc01_get_ctrl_val.this.AV12P_SYS_ID = aP0;
      b806_pc01_get_ctrl_val.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      b806_pc01_get_ctrl_val.this.AV12P_SYS_ID = aP0;
      b806_pc01_get_ctrl_val.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B806" ;
      /* Execute user subroutine: S1139 */
      S1139 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11W_MSG = "" ;
      AV13W_SYS_VALUE = "" ;
      /* Using cursor P002O2 */
      pr_default.execute(0, new Object[] {AV12P_SYS_ID});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A170TBM01_DEL_FLG = P002O2_A170TBM01_DEL_FLG[0] ;
         n170TBM01_DEL_FLG = P002O2_n170TBM01_DEL_FLG[0] ;
         A161TBM01_SYS_ID = P002O2_A161TBM01_SYS_ID[0] ;
         A514TBM01_SYS_VALUE = P002O2_A514TBM01_SYS_VALUE[0] ;
         n514TBM01_SYS_VALUE = P002O2_n514TBM01_SYS_VALUE[0] ;
         AV13W_SYS_VALUE = A514TBM01_SYS_VALUE ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S1139( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1257( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV13W_SYS_VALUE = "" ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b806_pc01_get_ctrl_val.this.AV13W_SYS_VALUE;
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
                  /* Execute user subroutine: S1257 */
                  S1257 ();
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
      AV13W_SYS_VALUE = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV11W_MSG = "" ;
      scmdbuf = "" ;
      P002O2_A170TBM01_DEL_FLG = new String[] {""} ;
      P002O2_n170TBM01_DEL_FLG = new boolean[] {false} ;
      P002O2_A161TBM01_SYS_ID = new String[] {""} ;
      P002O2_A514TBM01_SYS_VALUE = new String[] {""} ;
      P002O2_n514TBM01_SYS_VALUE = new boolean[] {false} ;
      A170TBM01_DEL_FLG = "" ;
      A161TBM01_SYS_ID = "" ;
      A514TBM01_SYS_VALUE = "" ;
      AV18Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b806_pc01_get_ctrl_val__default(),
         new Object[] {
             new Object[] {
            P002O2_A170TBM01_DEL_FLG, P002O2_n170TBM01_DEL_FLG, P002O2_A161TBM01_SYS_ID, P002O2_A514TBM01_SYS_VALUE, P002O2_n514TBM01_SYS_VALUE
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV18Pgmname = "B806_PC01_GET_CTRL_VAL" ;
      /* GeneXus formulas. */
      AV18Pgmname = "B806_PC01_GET_CTRL_VAL" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String scmdbuf ;
   private String AV18Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n170TBM01_DEL_FLG ;
   private boolean n514TBM01_SYS_VALUE ;
   private String AV12P_SYS_ID ;
   private String AV13W_SYS_VALUE ;
   private String AV8C_TAM02_APP_ID ;
   private String AV11W_MSG ;
   private String A170TBM01_DEL_FLG ;
   private String A161TBM01_SYS_ID ;
   private String A514TBM01_SYS_VALUE ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P002O2_A170TBM01_DEL_FLG ;
   private boolean[] P002O2_n170TBM01_DEL_FLG ;
   private String[] P002O2_A161TBM01_SYS_ID ;
   private String[] P002O2_A514TBM01_SYS_VALUE ;
   private boolean[] P002O2_n514TBM01_SYS_VALUE ;
}

final  class b806_pc01_get_ctrl_val__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002O2", "SELECT `TBM01_DEL_FLG`, `TBM01_SYS_ID`, `TBM01_SYS_VALUE` FROM `TBM01_SYSTEM` WHERE (`TBM01_SYS_ID` = ?) AND (`TBM01_DEL_FLG` = '0') ORDER BY `TBM01_SYS_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
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
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
      }
   }

}
