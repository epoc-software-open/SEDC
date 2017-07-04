/*
               File: B718_PC01_WKTBL_SWEEP
        Description: ワークテーブルスイープ処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:32.74
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b718_pc01_wktbl_sweep extends GXProcedure
{
   public b718_pc01_wktbl_sweep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b718_pc01_wktbl_sweep.class ), "" );
   }

   public b718_pc01_wktbl_sweep( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B718" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char1 = AV10W_DELETE_DATETIME ;
      GXt_char2 = AV10W_DELETE_DATETIME ;
      GXv_char3[0] = GXt_char2 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "006", GXv_char3) ;
      b718_pc01_wktbl_sweep.this.GXt_char2 = GXv_char3[0] ;
      GXt_dtime4 = GXutil.resetTime( GXutil.dadd( GXutil.today( ) , - ( (int)(GXutil.val( GXt_char2, ".")) )) );
      GXv_char5[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXt_dtime4, "YYYYMMDDHHMISS", GXv_char5) ;
      b718_pc01_wktbl_sweep.this.GXt_char1 = GXv_char5[0] ;
      AV10W_DELETE_DATETIME = GXt_char1 ;
      /* Optimized DELETE. */
      /* Using cursor P00652 */
      pr_default.execute(0, new Object[] {AV10W_DELETE_DATETIME});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW01_FREE_WORK") ;
      /* End optimized DELETE. */
      Application.commit(context, remoteHandle, "DEFAULT", "b718_pc01_wktbl_sweep");
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV15Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
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
                  /* Execute user subroutine: S121 */
                  S121 ();
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
      AV8C_TAM02_APP_ID = "" ;
      AV10W_DELETE_DATETIME = "" ;
      GXt_char1 = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String [1] ;
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char5 = new String [1] ;
      AV15Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b718_pc01_wktbl_sweep__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV15Pgmname = "B718_PC01_WKTBL_SWEEP" ;
      /* GeneXus formulas. */
      AV15Pgmname = "B718_PC01_WKTBL_SWEEP" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String GXt_char1 ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV15Pgmname ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime4 ;
   private boolean returnInSub ;
   private String AV8C_TAM02_APP_ID ;
   private String AV10W_DELETE_DATETIME ;
   private IDataStoreProvider pr_default ;
}

final  class b718_pc01_wktbl_sweep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00652", "DELETE FROM `TBW01_FREE_WORK`  WHERE `TBW01_DISP_DATETIME` < ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               stmt.setVarchar(1, (String)parms[0], 14);
               return;
      }
   }

}

