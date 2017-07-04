/*
               File: B504_PC02_SEARCH_CRF
        Description: Stub for B504_PC02_SEARCH_CRF
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:10.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b504_pc02_search_crf extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b504_pc02_search_crf pgm = new b504_pc02_search_crf (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b504_pc02_search_crf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b504_pc02_search_crf.class ), "" );
   }

   public b504_pc02_search_crf( int remoteHandle ,
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

