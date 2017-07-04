/*
               File: B719_PC02_EDIT_MEMO_CSV
        Description: Stub for B719_PC02_EDIT_MEMO_CSV
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:39.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b719_pc02_edit_memo_csv extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b719_pc02_edit_memo_csv pgm = new b719_pc02_edit_memo_csv (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      String aP1 = "";
      String[] aP2 = new String[] {""};

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (String) args[1];
         aP2[0] = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public b719_pc02_edit_memo_csv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b719_pc02_edit_memo_csv.class ), "" );
   }

   public b719_pc02_edit_memo_csv( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 )
   {
      String[] aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      b719_pc02_edit_memo_csv.this.AV2P_STUDY_ID = aP0;
      b719_pc02_edit_memo_csv.this.AV3P_AUTH_CD = aP1;
      b719_pc02_edit_memo_csv.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP2[0] = b719_pc02_edit_memo_csv.this.AV4W_MSG;
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
   private long AV2P_STUDY_ID ;
   private String AV3P_AUTH_CD ;
   private String AV4W_MSG ;
   private String[] aP2 ;
}

