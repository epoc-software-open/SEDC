/*
               File: A807_PC02_1BYTE_CHECK
        Description: ���p�����`�F�b�N�i�p���A�����A�L���j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:13.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a807_pc02_1byte_check extends GXProcedure
{
   public a807_pc02_1byte_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a807_pc02_1byte_check.class ), "" );
   }

   public a807_pc02_1byte_check( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 )
   {
      a807_pc02_1byte_check.this.AV9P_IN_CHAR = aP0;
      a807_pc02_1byte_check.this.aP1 = aP1;
      a807_pc02_1byte_check.this.aP1 = new byte[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             byte[] aP1 )
   {
      a807_pc02_1byte_check.this.AV9P_IN_CHAR = aP0;
      a807_pc02_1byte_check.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13W_RTN_CD = (byte)(0) ;
      AV12W_MOJI_CD = "MS932" ;
      AV10W_IX1 = GXutil.len( AV9P_IN_CHAR) ;
      AV11W_IX2 = GXutil.byteCount( AV9P_IN_CHAR, AV12W_MOJI_CD) ;
      if ( AV10W_IX1 != AV11W_IX2 )
      {
         AV13W_RTN_CD = (byte)(9) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = a807_pc02_1byte_check.this.AV13W_RTN_CD;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12W_MOJI_CD = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13W_RTN_CD ;
   private short Gx_err ;
   private int AV10W_IX1 ;
   private int AV11W_IX2 ;
   private String AV9P_IN_CHAR ;
   private String AV12W_MOJI_CD ;
   private byte[] aP1 ;
}

