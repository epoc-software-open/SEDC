/*
               File: A811_PC02_DOWNLOAD_DIALOG
        Description: Stub for A811_PC02_DOWNLOAD_DIALOG
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:14.99
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a811_pc02_download_dialog extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      a811_pc02_download_dialog pgm = new a811_pc02_download_dialog (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String aP2 = "";

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public a811_pc02_download_dialog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a811_pc02_download_dialog.class ), "" );
   }

   public a811_pc02_download_dialog( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      a811_pc02_download_dialog.this.AV2P_FILE_PATH = aP0;
      a811_pc02_download_dialog.this.AV3P_FILE_NAME = aP1;
      a811_pc02_download_dialog.this.AV4P_IMPORT_FILE_NAME = aP2;
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
   private String AV2P_FILE_PATH ;
   private String AV3P_FILE_NAME ;
   private String AV4P_IMPORT_FILE_NAME ;
}

