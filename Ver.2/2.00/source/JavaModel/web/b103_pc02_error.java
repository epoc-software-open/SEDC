/*
               File: B103_PC02_ERROR
        Description: Stub for B103_PC02_ERROR
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:13.5
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b103_pc02_error extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b103_pc02_error pgm = new b103_pc02_error (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b103_pc02_error( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b103_pc02_error.class ), "" );
   }

   public b103_pc02_error( int remoteHandle ,
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

