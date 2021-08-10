/*
               File: B402_PC21_CRF_DEF_CSV_OUTPUT
        Description: Stub for B402_PC21_CRF_DEF_CSV_OUTPUT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:56.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc21_crf_def_csv_output extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b402_pc21_crf_def_csv_output pgm = new b402_pc21_crf_def_csv_output (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      short[] aP1 = new short[] {0};
      String[] aP2 = new String[] {""};

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1[0] = (short) GXutil.val( args[1], ".");
         aP2[0] = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public b402_pc21_crf_def_csv_output( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc21_crf_def_csv_output.class ), "" );
   }

   public b402_pc21_crf_def_csv_output( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             short[] aP1 )
   {
      String[] aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      b402_pc21_crf_def_csv_output.this.AV2P_STUDY_ID = aP0;
      b402_pc21_crf_def_csv_output.this.aP1 = aP1;
      b402_pc21_crf_def_csv_output.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP1[0] = b402_pc21_crf_def_csv_output.this.AV3W_RTN_CD;
      this.aP2[0] = b402_pc21_crf_def_csv_output.this.AV4W_RTN_MSG;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV4W_RTN_MSG = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV3W_RTN_CD ;
   private short Gx_err ;
   private long AV2P_STUDY_ID ;
   private String AV4W_RTN_MSG ;
   private short[] aP1 ;
   private String[] aP2 ;
}

