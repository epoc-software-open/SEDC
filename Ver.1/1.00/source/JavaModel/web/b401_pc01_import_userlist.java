/*
               File: B401_PC01_IMPORT_USERLIST
        Description: Stub for B401_PC01_IMPORT_USERLIST
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:52.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b401_pc01_import_userlist extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b401_pc01_import_userlist pgm = new b401_pc01_import_userlist (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public b401_pc01_import_userlist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b401_pc01_import_userlist.class ), "" );
   }

   public b401_pc01_import_userlist( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String aP1 )
   {
      b401_pc01_import_userlist.this.AV2P_USER_ID = aP0;
      b401_pc01_import_userlist.this.AV3P_PWD = aP1;
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
   private String AV2P_USER_ID ;
   private String AV3P_PWD ;
}

