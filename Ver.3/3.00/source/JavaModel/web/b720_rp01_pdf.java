/*
               File: B720_RP01_PDF
        Description: Stub for B720_RP01_PDF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:32.82
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_rp01_pdf extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b720_rp01_pdf pgm = new b720_rp01_pdf (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String aP2 = "";
      int aP3 = 0;
      String aP4 = "";
      GxObjectCollection aP5 = new GxObjectCollection();
      GxObjectCollection aP6 = new GxObjectCollection();
      String[] aP7 = new String[] {""};

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (String) args[2];
         aP3 = (int) GXutil.val( args[3], ".");
         aP4 = (String) args[4];
         aP7[0] = (String) args[7];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   public b720_rp01_pdf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_rp01_pdf.class ), "" );
   }

   public b720_rp01_pdf( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             GxObjectCollection aP5 ,
                             GxObjectCollection aP6 )
   {
      String[] aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        GxObjectCollection aP5 ,
                        GxObjectCollection aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             GxObjectCollection aP5 ,
                             GxObjectCollection aP6 ,
                             String[] aP7 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new ab720_rp01_pdf(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7 );
      cleanup();
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

