/*
               File: B510_PC01_DOWN_CDNM
        Description: Stub for B510_PC01_DOWN_CDNM
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:32.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b510_pc01_down_cdnm extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b510_pc01_down_cdnm pgm = new b510_pc01_down_cdnm (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b510_pc01_down_cdnm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b510_pc01_down_cdnm.class ), "" );
   }

   public b510_pc01_down_cdnm( int remoteHandle ,
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

