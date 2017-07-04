/*
               File: IMPORT_CONFINFO_CALL
        Description: Stub for IMPORT_CONFINFO_CALL
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:35.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class import_confinfo_call extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      import_confinfo_call pgm = new import_confinfo_call (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";

      try
      {
         aP0 = (String) args[0];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0);
   }

   public import_confinfo_call( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( import_confinfo_call.class ), "" );
   }

   public import_confinfo_call( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String aP0 )
   {
      import_confinfo_call.this.AV2P_GET_PARM = aP0;
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
   private String AV2P_GET_PARM ;
}

