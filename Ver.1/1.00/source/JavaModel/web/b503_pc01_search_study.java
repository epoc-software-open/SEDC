/*
               File: B503_PC01_SEARCH_STUDY
        Description: Stub for B503_PC01_SEARCH_STUDY
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:20.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b503_pc01_search_study extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b503_pc01_search_study pgm = new b503_pc01_search_study (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b503_pc01_search_study( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b503_pc01_search_study.class ), "" );
   }

   public b503_pc01_search_study( int remoteHandle ,
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

