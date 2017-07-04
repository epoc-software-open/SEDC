/*
               File: B515_PC01_DOWN_AUTH_BEHAVIOR
        Description: Stub for B515_PC01_DOWN_AUTH_BEHAVIOR
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:43.78
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b515_pc01_down_auth_behavior extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b515_pc01_down_auth_behavior pgm = new b515_pc01_down_auth_behavior (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b515_pc01_down_auth_behavior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b515_pc01_down_auth_behavior.class ), "" );
   }

   public b515_pc01_down_auth_behavior( int remoteHandle ,
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

