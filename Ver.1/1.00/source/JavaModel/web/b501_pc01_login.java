/*
               File: B501_PC01_LOGIN
        Description: Stub for B501_PC01_LOGIN
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:19.89
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b501_pc01_login extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b501_pc01_login pgm = new b501_pc01_login (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b501_pc01_login( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b501_pc01_login.class ), "" );
   }

   public b501_pc01_login( int remoteHandle ,
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

