/*
               File: B505_PC02_DELETE_SUBJECT
        Description: Stub for B505_PC02_DELETE_SUBJECT
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:25.22
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b505_pc02_delete_subject extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b505_pc02_delete_subject pgm = new b505_pc02_delete_subject (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b505_pc02_delete_subject( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b505_pc02_delete_subject.class ), "" );
   }

   public b505_pc02_delete_subject( int remoteHandle ,
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

