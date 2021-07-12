/*
               File: A208_PC01_DOMAIN_MST_CSV
        Description: Stub for A208_PC01_DOMAIN_MST_CSV
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:30.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a208_pc01_domain_mst_csv extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      a208_pc01_domain_mst_csv pgm = new a208_pc01_domain_mst_csv (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String[] aP2 = new String[] {""};

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2[0] = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public a208_pc01_domain_mst_csv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a208_pc01_domain_mst_csv.class ), "" );
   }

   public a208_pc01_domain_mst_csv( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      String[] aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a208_pc01_domain_mst_csv.this.AV2P_TBM02_DOM_CD = aP0;
      a208_pc01_domain_mst_csv.this.AV3P_TBM02_DOM_JNM = aP1;
      a208_pc01_domain_mst_csv.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP2[0] = a208_pc01_domain_mst_csv.this.AV4W_MSG;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV4W_MSG = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV2P_TBM02_DOM_CD ;
   private String AV3P_TBM02_DOM_JNM ;
   private String AV4W_MSG ;
   private String[] aP2 ;
}

