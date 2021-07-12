/*
               File: B720_RP02_REKIINFO_CRF_PDF
        Description: Stub for B720_RP02_REKIINFO_CRF_PDF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:17.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_rp02_rekiinfo_crf_pdf extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b720_rp02_rekiinfo_crf_pdf pgm = new b720_rp02_rekiinfo_crf_pdf (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      long aP1 = 0;
      int aP2 = 0;
      short aP3 = 0;
      byte aP4 = 0;

      try
      {
         aP0 = (String) args[0];
         aP1 = (long) GXutil.val( args[1], ".");
         aP2 = (int) GXutil.val( args[2], ".");
         aP3 = (short) GXutil.val( args[3], ".");
         aP4 = (byte) GXutil.val( args[4], ".");
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public b720_rp02_rekiinfo_crf_pdf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_rp02_rekiinfo_crf_pdf.class ), "" );
   }

   public b720_rp02_rekiinfo_crf_pdf( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        short aP3 ,
                        byte aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             short aP3 ,
                             byte aP4 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new ab720_rp02_rekiinfo_crf_pdf(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4 );
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

