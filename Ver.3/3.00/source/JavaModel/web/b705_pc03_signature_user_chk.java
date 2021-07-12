/*
               File: B705_PC03_SIGNATURE_USER_CHK
        Description: Stub for B705_PC03_SIGNATURE_USER_CHK
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:32.25
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b705_pc03_signature_user_chk extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b705_pc03_signature_user_chk pgm = new b705_pc03_signature_user_chk (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      String aP1 = "";
      String aP2 = "";

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (String) args[1];
         aP2 = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public b705_pc03_signature_user_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b705_pc03_signature_user_chk.class ), "" );
   }

   public b705_pc03_signature_user_chk( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      b705_pc03_signature_user_chk.this.AV2P_IN_STUDY_ID = aP0;
      b705_pc03_signature_user_chk.this.AV3P_IN_USER_ID = aP1;
      b705_pc03_signature_user_chk.this.AV4P_IN_PASSWORD = aP2;
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

   private short Gx_err ;
   private long AV2P_IN_STUDY_ID ;
   private String AV3P_IN_USER_ID ;
   private String AV4P_IN_PASSWORD ;
}

