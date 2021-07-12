/*
               File: A212_PC01_CDISC_ITEM_CSV
        Description: Stub for A212_PC01_CDISC_ITEM_CSV
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:30.78
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a212_pc01_cdisc_item_csv extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      a212_pc01_cdisc_item_csv pgm = new a212_pc01_cdisc_item_csv (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String aP2 = "";
      String[] aP3 = new String[] {""};

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (String) args[2];
         aP3[0] = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public a212_pc01_cdisc_item_csv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a212_pc01_cdisc_item_csv.class ), "" );
   }

   public a212_pc01_cdisc_item_csv( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      String[] aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      a212_pc01_cdisc_item_csv.this.AV2P_TBM03_DOM_CD = aP0;
      a212_pc01_cdisc_item_csv.this.AV3P_TBM03_DOM_VAR_NM = aP1;
      a212_pc01_cdisc_item_csv.this.AV4P_TBM03_VAR_DESC = aP2;
      a212_pc01_cdisc_item_csv.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP3[0] = a212_pc01_cdisc_item_csv.this.AV5W_MSG;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV5W_MSG = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV2P_TBM03_DOM_CD ;
   private String AV3P_TBM03_DOM_VAR_NM ;
   private String AV4P_TBM03_VAR_DESC ;
   private String AV5W_MSG ;
   private String[] aP3 ;
}

