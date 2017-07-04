/*
               File: B507_PC01_SET_AUTH
        Description: Stub for B507_PC01_SET_AUTH
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:26.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b507_pc01_set_auth extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b507_pc01_set_auth pgm = new b507_pc01_set_auth (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b507_pc01_set_auth( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b507_pc01_set_auth.class ), "" );
   }

   public b507_pc01_set_auth( int remoteHandle ,
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

