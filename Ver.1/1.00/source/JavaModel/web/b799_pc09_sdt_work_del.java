/*
               File: B799_PC09_SDT_WORK_DEL
        Description: SDTワークテーブル削除処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:15.4
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc09_sdt_work_del extends GXProcedure
{
   public b799_pc09_sdt_work_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc09_sdt_work_del.class ), "" );
   }

   public b799_pc09_sdt_work_del( int remoteHandle ,
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
      AV8W_DISP_DATETIME = GXutil.dtadd( GXutil.dtadd(GXutil.now( ),-((60*60*24*3))), 0) ;
      GXt_char1 = AV9W_TBW01_DISP_DATETIME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV8W_DISP_DATETIME, "YYYYMMDDHHMISS", GXv_char2) ;
      b799_pc09_sdt_work_del.this.GXt_char1 = GXv_char2[0] ;
      AV9W_TBW01_DISP_DATETIME = GXt_char1 ;
      /* Optimized DELETE. */
      /* Using cursor P00652 */
      pr_default.execute(0, new Object[] {AV9W_TBW01_DISP_DATETIME});
      /* End optimized DELETE. */
      cleanup();
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
   public void initialize( )
   {
      AV8W_DISP_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV9W_TBW01_DISP_DATETIME = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b799_pc09_sdt_work_del__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV8W_DISP_DATETIME ;
   private String AV9W_TBW01_DISP_DATETIME ;
   private IDataStoreProvider pr_default ;
}

final  class b799_pc09_sdt_work_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00652", "DELETE FROM `TBW14_CRF_SDT_WORK`  WHERE `TBW14_DISP_DATETIME` < ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               break;
      }
   }

}

