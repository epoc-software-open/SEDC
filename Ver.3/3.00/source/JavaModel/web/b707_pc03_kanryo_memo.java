/*
               File: B707_PC03_KANRYO_MEMO
        Description: Stub for B707_PC03_KANRYO_MEMO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:27.50
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b707_pc03_kanryo_memo extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b707_pc03_kanryo_memo pgm = new b707_pc03_kanryo_memo (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      int aP1 = 0;
      short aP2 = 0;
      String aP3 = "";
      String aP4 = "";

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (int) GXutil.val( args[1], ".");
         aP2 = (short) GXutil.val( args[2], ".");
         aP3 = (String) args[3];
         aP4 = (String) args[4];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public b707_pc03_kanryo_memo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b707_pc03_kanryo_memo.class ), "" );
   }

   public b707_pc03_kanryo_memo( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      b707_pc03_kanryo_memo.this.AV2P_STUDY_ID = aP0;
      b707_pc03_kanryo_memo.this.AV3P_SUBJECT_ID = aP1;
      b707_pc03_kanryo_memo.this.AV4P_MEMO_NO = aP2;
      b707_pc03_kanryo_memo.this.AV5P_KAKUNIN_COMMENT = aP3;
      b707_pc03_kanryo_memo.this.AV6P_KAKUNIN_CHK = aP4;
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

   private short AV4P_MEMO_NO ;
   private short Gx_err ;
   private int AV3P_SUBJECT_ID ;
   private long AV2P_STUDY_ID ;
   private String AV5P_KAKUNIN_COMMENT ;
   private String AV6P_KAKUNIN_CHK ;
}

