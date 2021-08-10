/*
               File: B513_PC01_DOWN_AUTH_PTN
        Description: Stub for B513_PC01_DOWN_AUTH_PTN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:52.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b513_pc01_down_auth_ptn extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b513_pc01_down_auth_ptn pgm = new b513_pc01_down_auth_ptn (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public b513_pc01_down_auth_ptn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b513_pc01_down_auth_ptn.class ), "" );
   }

   public b513_pc01_down_auth_ptn( int remoteHandle ,
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

