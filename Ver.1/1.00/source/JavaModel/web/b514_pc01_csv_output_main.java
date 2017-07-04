/*
               File: B514_PC01_CSV_OUTPUT_MAIN
        Description: Stub for B514_PC01_CSV_OUTPUT_MAIN
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:43.0
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b514_pc01_csv_output_main extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b514_pc01_csv_output_main pgm = new b514_pc01_csv_output_main (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b514_pc01_csv_output_main( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b514_pc01_csv_output_main.class ), "" );
   }

   public b514_pc01_csv_output_main( int remoteHandle ,
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

