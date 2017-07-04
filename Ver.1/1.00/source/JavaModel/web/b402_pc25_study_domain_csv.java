/*
               File: B402_PC25_STUDY_DOMAIN_CSV
        Description: Stub for B402_PC25_STUDY_DOMAIN_CSV
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:20.98
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc25_study_domain_csv extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b402_pc25_study_domain_csv pgm = new b402_pc25_study_domain_csv (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      String[] aP1 = new String[] {""};

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1[0] = (String) args[1];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public b402_pc25_study_domain_csv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc25_study_domain_csv.class ), "" );
   }

   public b402_pc25_study_domain_csv( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 )
   {
      String[] aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( long aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             String[] aP1 )
   {
      b402_pc25_study_domain_csv.this.AV2P_STUDY_ID = aP0;
      b402_pc25_study_domain_csv.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP1[0] = b402_pc25_study_domain_csv.this.AV3W_MSG;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV3W_MSG = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV2P_STUDY_ID ;
   private String AV3W_MSG ;
   private String[] aP1 ;
}

