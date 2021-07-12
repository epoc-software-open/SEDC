/*
               File: B402_PC27_STUDY_CDISC_ITEM_CSV
        Description: Stub for B402_PC27_STUDY_CDISC_ITEM_CSV
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:31.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc27_study_cdisc_item_csv extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b402_pc27_study_cdisc_item_csv pgm = new b402_pc27_study_cdisc_item_csv (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      String aP1 = "";
      String aP2 = "";
      String aP3 = "";
      String[] aP4 = new String[] {""};

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (String) args[1];
         aP2 = (String) args[2];
         aP3 = (String) args[3];
         aP4[0] = (String) args[4];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public b402_pc27_study_cdisc_item_csv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc27_study_cdisc_item_csv.class ), "" );
   }

   public b402_pc27_study_cdisc_item_csv( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 )
   {
      String[] aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      b402_pc27_study_cdisc_item_csv.this.AV2P_STUDY_ID = aP0;
      b402_pc27_study_cdisc_item_csv.this.AV3P_DOM_CD = aP1;
      b402_pc27_study_cdisc_item_csv.this.AV4P_DOM_VAR_NM = aP2;
      b402_pc27_study_cdisc_item_csv.this.AV5P_VAR_DESC = aP3;
      b402_pc27_study_cdisc_item_csv.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP4[0] = b402_pc27_study_cdisc_item_csv.this.AV6W_MSG;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV6W_MSG = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV2P_STUDY_ID ;
   private String AV3P_DOM_CD ;
   private String AV4P_DOM_VAR_NM ;
   private String AV5P_VAR_DESC ;
   private String AV6W_MSG ;
   private String[] aP4 ;
}

