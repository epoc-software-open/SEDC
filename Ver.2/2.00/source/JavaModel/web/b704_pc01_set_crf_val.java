/*
               File: B704_PC01_SET_CRF_VAL
        Description: Stub for B704_PC01_SET_CRF_VAL
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:20.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b704_pc01_set_crf_val extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b704_pc01_set_crf_val pgm = new b704_pc01_set_crf_val (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      int aP1 = 0;
      String aP2 = "";
      short aP3 = 0;
      String aP4 = "";
      String aP5 = "";

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (int) GXutil.val( args[1], ".");
         aP2 = (String) args[2];
         aP3 = (short) GXutil.val( args[3], ".");
         aP4 = (String) args[4];
         aP5 = (String) args[5];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public b704_pc01_set_crf_val( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b704_pc01_set_crf_val.class ), "" );
   }

   public b704_pc01_set_crf_val( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      b704_pc01_set_crf_val.this.AV2P_STUDY_ID = aP0;
      b704_pc01_set_crf_val.this.AV3P_SUBJECT_ID = aP1;
      b704_pc01_set_crf_val.this.AV4P_CRF_ID_EDA_NO = aP2;
      b704_pc01_set_crf_val.this.AV5P_CRF_LATEST_VERSION = aP3;
      b704_pc01_set_crf_val.this.AV6P_CRF_ITEM_CD = aP4;
      b704_pc01_set_crf_val.this.AV7P_INP_VALUE = aP5;
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

   private short AV5P_CRF_LATEST_VERSION ;
   private short Gx_err ;
   private int AV3P_SUBJECT_ID ;
   private long AV2P_STUDY_ID ;
   private String AV4P_CRF_ID_EDA_NO ;
   private String AV6P_CRF_ITEM_CD ;
   private String AV7P_INP_VALUE ;
}

