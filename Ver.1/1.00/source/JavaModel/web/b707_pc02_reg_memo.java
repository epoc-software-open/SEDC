/*
               File: B707_PC02_REG_MEMO
        Description: Stub for B707_PC02_REG_MEMO
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:23.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b707_pc02_reg_memo extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      b707_pc02_reg_memo pgm = new b707_pc02_reg_memo (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      int aP1 = 0;
      short aP2 = 0;
      short aP3 = 0;
      String aP4 = "";
      String aP5 = "";
      String aP6 = "";
      String aP7 = "";
      String aP8 = "";

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (int) GXutil.val( args[1], ".");
         aP2 = (short) GXutil.val( args[2], ".");
         aP3 = (short) GXutil.val( args[3], ".");
         aP4 = (String) args[4];
         aP5 = (String) args[5];
         aP6 = (String) args[6];
         aP7 = (String) args[7];
         aP8 = (String) args[8];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   public b707_pc02_reg_memo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b707_pc02_reg_memo.class ), "" );
   }

   public b707_pc02_reg_memo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        short aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             short aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 )
   {
      b707_pc02_reg_memo.this.AV2P_STUDY_ID = aP0;
      b707_pc02_reg_memo.this.AV3P_SUBJECT_ID = aP1;
      b707_pc02_reg_memo.this.AV4P_MEMO_NO = aP2;
      b707_pc02_reg_memo.this.AV5P_CRF_ID = aP3;
      b707_pc02_reg_memo.this.AV6P_CRF_ITEM_GRP_CD = aP4;
      b707_pc02_reg_memo.this.AV7P_SYORI_KBN = aP5;
      b707_pc02_reg_memo.this.AV8P_MEMO_KBN = aP6;
      b707_pc02_reg_memo.this.AV9P_MEMO = aP7;
      b707_pc02_reg_memo.this.AV10P_REQUEST_USER_ID = aP8;
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
   private short AV5P_CRF_ID ;
   private short Gx_err ;
   private int AV3P_SUBJECT_ID ;
   private long AV2P_STUDY_ID ;
   private String AV6P_CRF_ITEM_GRP_CD ;
   private String AV7P_SYORI_KBN ;
   private String AV8P_MEMO_KBN ;
   private String AV9P_MEMO ;
   private String AV10P_REQUEST_USER_ID ;
}

