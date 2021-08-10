/*
               File: B707_PC01_GET_MEMO
        Description: Stub for B707_PC01_GET_MEMO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:28.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b707_pc01_get_memo extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b707_pc01_get_memo pgm = new b707_pc01_get_memo (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      int aP1 = 0;
      String aP2 = "";
      short aP3 = 0;

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (int) GXutil.val( args[1], ".");
         aP2 = (String) args[2];
         aP3 = (short) GXutil.val( args[3], ".");
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public b707_pc01_get_memo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b707_pc01_get_memo.class ), "" );
   }

   public b707_pc01_get_memo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 )
   {
      b707_pc01_get_memo.this.AV2P_STUDY_ID = aP0;
      b707_pc01_get_memo.this.AV3P_SUBJECT_ID = aP1;
      b707_pc01_get_memo.this.AV4P_MEMO_KBN = aP2;
      b707_pc01_get_memo.this.AV5P_MEMO_NO = aP3;
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

   private short AV5P_MEMO_NO ;
   private short Gx_err ;
   private int AV3P_SUBJECT_ID ;
   private long AV2P_STUDY_ID ;
   private String AV4P_MEMO_KBN ;
}

