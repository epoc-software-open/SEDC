/*
               File: B702_PC04_DEL_CRF_DESIGN
        Description: Stub for B702_PC04_DEL_CRF_DESIGN
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:17.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b702_pc04_del_crf_design extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b702_pc04_del_crf_design pgm = new b702_pc04_del_crf_design (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b702_pc04_del_crf_design( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b702_pc04_del_crf_design.class ), "" );
   }

   public b702_pc04_del_crf_design( int remoteHandle ,
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

