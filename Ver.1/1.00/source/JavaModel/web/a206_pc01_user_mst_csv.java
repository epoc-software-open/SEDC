/*
               File: A206_PC01_USER_MST_CSV
        Description: Stub for A206_PC01_USER_MST_CSV
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:50.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a206_pc01_user_mst_csv extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      a206_pc01_user_mst_csv pgm = new a206_pc01_user_mst_csv (-1);
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

   public a206_pc01_user_mst_csv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a206_pc01_user_mst_csv.class ), "" );
   }

   public a206_pc01_user_mst_csv( int remoteHandle ,
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
      a206_pc01_user_mst_csv.this.AV2P_TAM07_USER_ID = aP0;
      a206_pc01_user_mst_csv.this.AV3P_TAM07_USER_NM = aP1;
      a206_pc01_user_mst_csv.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP2[0] = a206_pc01_user_mst_csv.this.AV4W_MSG;
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
   private String AV2P_TAM07_USER_ID ;
   private String AV3P_TAM07_USER_NM ;
   private String AV4W_MSG ;
   private String[] aP2 ;
}

