/*
               File: B506_PC02_UP_CRF_VAL
        Description: Stub for B506_PC02_UP_CRF_VAL
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:19.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b506_pc02_up_crf_val extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b506_pc02_up_crf_val pgm = new b506_pc02_up_crf_val (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b506_pc02_up_crf_val( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b506_pc02_up_crf_val.class ), "" );
   }

   public b506_pc02_up_crf_val( int remoteHandle ,
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

