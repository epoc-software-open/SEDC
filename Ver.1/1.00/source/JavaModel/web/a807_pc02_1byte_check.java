/*
               File: A807_PC02_1BYTE_CHECK
        Description: 半角文字チェック（英字、数字、記号）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:44.59
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
      /* User Code */
      	AV8W_LANG = "JAVA";
      if ( GXutil.strcmp(AV8W_LANG, "JAVA") == 0 )
      {
         AV12W_MOJI_CD = "MS932" ;
      }
      else
      {
         AV12W_MOJI_CD = "Shift-JIS" ;
      }
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
      AV8W_LANG = "" ;
      AV12W_MOJI_CD = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13W_RTN_CD ;
   private short Gx_err ;
   private int AV10W_IX1 ;
   private int AV11W_IX2 ;
   private String AV9P_IN_CHAR ;
   private String AV8W_LANG ;
   private String AV12W_MOJI_CD ;
   private byte[] aP1 ;
}

