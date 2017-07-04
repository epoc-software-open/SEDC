/*
               File: B799_PC10_SEL_LIST_ITEM_GET
        Description: 選択リスト要素名取得処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:5.94
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc10_sel_list_item_get extends GXProcedure
{
   public b799_pc10_sel_list_item_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc10_sel_list_item_get.class ), "" );
   }

   public b799_pc10_sel_list_item_get( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      b799_pc10_sel_list_item_get.this.AV8P_TBM26_STUDY_ID = aP0;
      b799_pc10_sel_list_item_get.this.AV9P_TBM26_LIST_CD = aP1;
      b799_pc10_sel_list_item_get.this.AV10P_TBM26_INNER_VALUE = aP2;
      b799_pc10_sel_list_item_get.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      b799_pc10_sel_list_item_get.this.AV8P_TBM26_STUDY_ID = aP0;
      b799_pc10_sel_list_item_get.this.AV9P_TBM26_LIST_CD = aP1;
      b799_pc10_sel_list_item_get.this.AV10P_TBM26_INNER_VALUE = aP2;
      b799_pc10_sel_list_item_get.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11P_TBM26_LIST_ITEM_NAME = "" ;
      /* Using cursor P005R2 */
      pr_default.execute(0, new Object[] {new Long(AV8P_TBM26_STUDY_ID), AV9P_TBM26_LIST_CD, AV10P_TBM26_INNER_VALUE});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A450TBM26_INNER_VALUE = P005R2_A450TBM26_INNER_VALUE[0] ;
         n450TBM26_INNER_VALUE = P005R2_n450TBM26_INNER_VALUE[0] ;
         A447TBM26_LIST_CD = P005R2_A447TBM26_LIST_CD[0] ;
         A446TBM26_STUDY_ID = P005R2_A446TBM26_STUDY_ID[0] ;
         A449TBM26_LIST_ITEM_NAME = P005R2_A449TBM26_LIST_ITEM_NAME[0] ;
         n449TBM26_LIST_ITEM_NAME = P005R2_n449TBM26_LIST_ITEM_NAME[0] ;
         A448TBM26_LIST_ITEM_NO = P005R2_A448TBM26_LIST_ITEM_NO[0] ;
         AV11P_TBM26_LIST_ITEM_NAME = A449TBM26_LIST_ITEM_NAME ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = b799_pc10_sel_list_item_get.this.AV11P_TBM26_LIST_ITEM_NAME;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11P_TBM26_LIST_ITEM_NAME = "" ;
      scmdbuf = "" ;
      P005R2_A450TBM26_INNER_VALUE = new String[] {""} ;
      P005R2_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      P005R2_A447TBM26_LIST_CD = new String[] {""} ;
      P005R2_A446TBM26_STUDY_ID = new long[1] ;
      P005R2_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      P005R2_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      P005R2_A448TBM26_LIST_ITEM_NO = new short[1] ;
      A450TBM26_INNER_VALUE = "" ;
      A447TBM26_LIST_CD = "" ;
      A449TBM26_LIST_ITEM_NAME = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b799_pc10_sel_list_item_get__default(),
         new Object[] {
             new Object[] {
            P005R2_A450TBM26_INNER_VALUE, P005R2_n450TBM26_INNER_VALUE, P005R2_A447TBM26_LIST_CD, P005R2_A446TBM26_STUDY_ID, P005R2_A449TBM26_LIST_ITEM_NAME, P005R2_n449TBM26_LIST_ITEM_NAME, P005R2_A448TBM26_LIST_ITEM_NO
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A448TBM26_LIST_ITEM_NO ;
   private short Gx_err ;
   private long AV8P_TBM26_STUDY_ID ;
   private long A446TBM26_STUDY_ID ;
   private String scmdbuf ;
   private boolean n450TBM26_INNER_VALUE ;
   private boolean n449TBM26_LIST_ITEM_NAME ;
   private String AV9P_TBM26_LIST_CD ;
   private String AV10P_TBM26_INNER_VALUE ;
   private String AV11P_TBM26_LIST_ITEM_NAME ;
   private String A450TBM26_INNER_VALUE ;
   private String A447TBM26_LIST_CD ;
   private String A449TBM26_LIST_ITEM_NAME ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P005R2_A450TBM26_INNER_VALUE ;
   private boolean[] P005R2_n450TBM26_INNER_VALUE ;
   private String[] P005R2_A447TBM26_LIST_CD ;
   private long[] P005R2_A446TBM26_STUDY_ID ;
   private String[] P005R2_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] P005R2_n449TBM26_LIST_ITEM_NAME ;
   private short[] P005R2_A448TBM26_LIST_ITEM_NO ;
}

final  class b799_pc10_sel_list_item_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005R2", "SELECT `TBM26_INNER_VALUE`, `TBM26_LIST_CD`, `TBM26_STUDY_ID`, `TBM26_LIST_ITEM_NAME`, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE (`TBM26_STUDY_ID` = ? and `TBM26_LIST_CD` = ?) AND (`TBM26_INNER_VALUE` = ?) ORDER BY `TBM26_STUDY_ID`, `TBM26_LIST_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
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
               stmt.setVarchar(2, (String)parms[1], 20);
               stmt.setVarchar(3, (String)parms[2], 100);
               break;
      }
   }

}

