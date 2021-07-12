/*
               File: B512_PC01_DOWN_SYSTEM
        Description: Stub for B512_PC01_DOWN_SYSTEM
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:49.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b512_pc01_down_system extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b512_pc01_down_system pgm = new b512_pc01_down_system (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b512_pc01_down_system( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b512_pc01_down_system.class ), "" );
   }

   public b512_pc01_down_system( int remoteHandle ,
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

