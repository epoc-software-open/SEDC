/*
               File: A810_PC01_CHAR_CUT
        Description: 文字列数補正処理（キャラ・バーキャラ対応）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:14.0
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a810_pc01_char_cut extends GXProcedure
{
   public a810_pc01_char_cut( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a810_pc01_char_cut.class ), "" );
   }

   public a810_pc01_char_cut( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( int aP0 ,
                             String aP1 )
   {
      a810_pc01_char_cut.this.AV8P_IN_BYTE = aP0;
      a810_pc01_char_cut.this.AV9P_IN_CHAR = aP1;
      a810_pc01_char_cut.this.aP2 = aP2;
      a810_pc01_char_cut.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( int aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( int aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a810_pc01_char_cut.this.AV8P_IN_BYTE = aP0;
      a810_pc01_char_cut.this.AV9P_IN_CHAR = aP1;
      a810_pc01_char_cut.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13W_MOJI_CD = "MS932" ;
      AV14W_OUT_CHAR = GXutil.rtrim( AV9P_IN_CHAR) ;
      AV10W_IX1 = GXutil.len( AV14W_OUT_CHAR) ;
      AV11W_IX2 = GXutil.byteCount( AV14W_OUT_CHAR, AV13W_MOJI_CD) ;
      while ( ( AV10W_IX1 > 0 ) && ( AV11W_IX2 > AV8P_IN_BYTE ) )
      {
         AV10W_IX1 = (int)(AV10W_IX1-1) ;
         AV14W_OUT_CHAR = GXutil.substring( AV14W_OUT_CHAR, 1, AV10W_IX1) ;
         AV11W_IX2 = GXutil.byteCount( AV14W_OUT_CHAR, AV13W_MOJI_CD) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a810_pc01_char_cut.this.AV14W_OUT_CHAR;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14W_OUT_CHAR = "" ;
      AV13W_MOJI_CD = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8P_IN_BYTE ;
   private int AV10W_IX1 ;
   private int AV11W_IX2 ;
   private String AV9P_IN_CHAR ;
   private String AV14W_OUT_CHAR ;
   private String AV13W_MOJI_CD ;
   private String[] aP2 ;
}

