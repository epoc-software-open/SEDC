/*
               File: B706_PC01_REG_CRF
        Description: Stub for B706_PC01_REG_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:23.62
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b706_pc01_reg_crf extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b706_pc01_reg_crf pgm = new b706_pc01_reg_crf (-1);
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
      String aP6 = "";
      String aP7 = "";
      String aP8 = "";
      String aP9 = "";
      String aP10 = "";

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (int) GXutil.val( args[1], ".");
         aP2 = (String) args[2];
         aP3 = (short) GXutil.val( args[3], ".");
         aP4 = (String) args[4];
         aP5 = (String) args[5];
         aP6 = (String) args[6];
         aP7 = (String) args[7];
         aP8 = (String) args[8];
         aP9 = (String) args[9];
         aP10 = (String) args[10];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   public b706_pc01_reg_crf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b706_pc01_reg_crf.class ), "" );
   }

   public b706_pc01_reg_crf( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 )
   {
      b706_pc01_reg_crf.this.AV2P_STUDY_ID = aP0;
      b706_pc01_reg_crf.this.AV3P_SUBJECT_ID = aP1;
      b706_pc01_reg_crf.this.AV4P_CRF_ID_EDA_NO = aP2;
      b706_pc01_reg_crf.this.AV5P_CRF_LATEST_VERSION = aP3;
      b706_pc01_reg_crf.this.AV6P_DM_ARRIVAL_FLG = aP4;
      b706_pc01_reg_crf.this.AV7P_USER_ID = aP5;
      b706_pc01_reg_crf.this.AV8P_PASSWORD = aP6;
      b706_pc01_reg_crf.this.AV9P_AUTH_CD = aP7;
      b706_pc01_reg_crf.this.AV10P_UPD_RIYU = aP8;
      b706_pc01_reg_crf.this.AV11P_SIGNATURE_FLG = aP9;
      b706_pc01_reg_crf.this.AV12P_SIGNATURE_USER_ID = aP10;
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
   private String AV6P_DM_ARRIVAL_FLG ;
   private String AV7P_USER_ID ;
   private String AV8P_PASSWORD ;
   private String AV9P_AUTH_CD ;
   private String AV10P_UPD_RIYU ;
   private String AV11P_SIGNATURE_FLG ;
   private String AV12P_SIGNATURE_USER_ID ;
}

