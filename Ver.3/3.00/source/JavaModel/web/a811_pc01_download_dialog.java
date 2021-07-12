/*
               File: A811_PC01_DOWNLOAD_DIALOG
        Description: Stub for A811_PC01_DOWNLOAD_DIALOG
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:13.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a811_pc01_download_dialog extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      a811_pc01_download_dialog pgm = new a811_pc01_download_dialog (-1);
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

   public a811_pc01_download_dialog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a811_pc01_download_dialog.class ), "" );
   }

   public a811_pc01_download_dialog( int remoteHandle ,
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
      a811_pc01_download_dialog.this.AV2P_FILE_PATH = aP0;
      a811_pc01_download_dialog.this.AV3P_FILE_NAME = aP1;
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
}

