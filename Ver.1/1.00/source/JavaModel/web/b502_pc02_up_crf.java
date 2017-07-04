/*
               File: B502_PC02_UP_CRF
        Description: Stub for B502_PC02_UP_CRF
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:2.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b502_pc02_up_crf extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b502_pc02_up_crf pgm = new b502_pc02_up_crf (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b502_pc02_up_crf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b502_pc02_up_crf.class ), "" );
   }

   public b502_pc02_up_crf( int remoteHandle ,
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

