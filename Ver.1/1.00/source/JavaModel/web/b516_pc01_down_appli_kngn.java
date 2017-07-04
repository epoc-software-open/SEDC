/*
               File: B516_PC01_DOWN_APPLI_KNGN
        Description: Stub for B516_PC01_DOWN_APPLI_KNGN
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:44.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b516_pc01_down_appli_kngn extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b516_pc01_down_appli_kngn pgm = new b516_pc01_down_appli_kngn (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b516_pc01_down_appli_kngn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b516_pc01_down_appli_kngn.class ), "" );
   }

   public b516_pc01_down_appli_kngn( int remoteHandle ,
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
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
}

