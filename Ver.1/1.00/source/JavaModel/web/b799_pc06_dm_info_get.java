/*
               File: B799_PC06_DM_INFO_GET
        Description: DMèÓïÒéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:5.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc06_dm_info_get extends GXProcedure
{
   public b799_pc06_dm_info_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc06_dm_info_get.class ), "" );
   }

   public b799_pc06_dm_info_get( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String[] aP0 )
   {
      b799_pc06_dm_info_get.this.aP1 = new byte[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 )
   {
      b799_pc06_dm_info_get.this.aP0 = aP0;
      b799_pc06_dm_info_get.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8W_TAM04_AUTH_CD = "" ;
      AV9W_TAM04_AUTH_LVL = (byte)(0) ;
      /* Using cursor P005Q2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A514TBM01_SYS_VALUE = P005Q2_A514TBM01_SYS_VALUE[0] ;
         n514TBM01_SYS_VALUE = P005Q2_n514TBM01_SYS_VALUE[0] ;
         A161TBM01_SYS_ID = P005Q2_A161TBM01_SYS_ID[0] ;
         /* Using cursor P005Q3 */
         pr_default.execute(1, new Object[] {new Boolean(n514TBM01_SYS_VALUE), A514TBM01_SYS_VALUE});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A17TAM04_AUTH_CD = P005Q3_A17TAM04_AUTH_CD[0] ;
            A601TAM04_AUTH_LVL = P005Q3_A601TAM04_AUTH_LVL[0] ;
            n601TAM04_AUTH_LVL = P005Q3_n601TAM04_AUTH_LVL[0] ;
            AV8W_TAM04_AUTH_CD = A17TAM04_AUTH_CD ;
            AV9W_TAM04_AUTH_LVL = A601TAM04_AUTH_LVL ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = b799_pc06_dm_info_get.this.AV8W_TAM04_AUTH_CD;
      this.aP1[0] = b799_pc06_dm_info_get.this.AV9W_TAM04_AUTH_LVL;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8W_TAM04_AUTH_CD = "" ;
      scmdbuf = "" ;
      P005Q2_A514TBM01_SYS_VALUE = new String[] {""} ;
      P005Q2_n514TBM01_SYS_VALUE = new boolean[] {false} ;
      P005Q2_A161TBM01_SYS_ID = new String[] {""} ;
      A514TBM01_SYS_VALUE = "" ;
      A161TBM01_SYS_ID = "" ;
      P005Q3_A17TAM04_AUTH_CD = new String[] {""} ;
      P005Q3_A601TAM04_AUTH_LVL = new byte[1] ;
      P005Q3_n601TAM04_AUTH_LVL = new boolean[] {false} ;
      A17TAM04_AUTH_CD = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b799_pc06_dm_info_get__default(),
         new Object[] {
             new Object[] {
            P005Q2_A514TBM01_SYS_VALUE, P005Q2_n514TBM01_SYS_VALUE, P005Q2_A161TBM01_SYS_ID
            }
            , new Object[] {
            P005Q3_A17TAM04_AUTH_CD, P005Q3_A601TAM04_AUTH_LVL, P005Q3_n601TAM04_AUTH_LVL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9W_TAM04_AUTH_LVL ;
   private byte A601TAM04_AUTH_LVL ;
   private short Gx_err ;
   private String scmdbuf ;
   private boolean n514TBM01_SYS_VALUE ;
   private boolean n601TAM04_AUTH_LVL ;
   private String AV8W_TAM04_AUTH_CD ;
   private String A514TBM01_SYS_VALUE ;
   private String A161TBM01_SYS_ID ;
   private String A17TAM04_AUTH_CD ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P005Q2_A514TBM01_SYS_VALUE ;
   private boolean[] P005Q2_n514TBM01_SYS_VALUE ;
   private String[] P005Q2_A161TBM01_SYS_ID ;
   private String[] P005Q3_A17TAM04_AUTH_CD ;
   private byte[] P005Q3_A601TAM04_AUTH_LVL ;
   private boolean[] P005Q3_n601TAM04_AUTH_LVL ;
}

final  class b799_pc06_dm_info_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005Q2", "SELECT `TBM01_SYS_VALUE`, `TBM01_SYS_ID` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = '008' ORDER BY `TBM01_SYS_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005Q3", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_LVL` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               break;
      }
   }

}

