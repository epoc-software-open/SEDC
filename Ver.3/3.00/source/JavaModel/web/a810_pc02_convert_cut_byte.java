/*
               File: A810_PC02_CONVERT_CUT_BYTE
        Description: •¶Žš—ñ2•ªŠ„ˆ—
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:14.92
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a810_pc02_convert_cut_byte extends GXProcedure
{
   public a810_pc02_convert_cut_byte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a810_pc02_convert_cut_byte.class ), "" );
   }

   public a810_pc02_convert_cut_byte( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( int aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a810_pc02_convert_cut_byte.this.AV9P_IN_BYTE = aP0;
      a810_pc02_convert_cut_byte.this.AV10P_IN_CHAR = aP1;
      a810_pc02_convert_cut_byte.this.aP2 = aP2;
      a810_pc02_convert_cut_byte.this.aP3 = aP3;
      a810_pc02_convert_cut_byte.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( int aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      a810_pc02_convert_cut_byte.this.AV9P_IN_BYTE = aP0;
      a810_pc02_convert_cut_byte.this.AV10P_IN_CHAR = aP1;
      a810_pc02_convert_cut_byte.this.aP2 = aP2;
      a810_pc02_convert_cut_byte.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18W_MOJI_CD = "MS932" ;
      AV21W_OUT_CHAR1 = "" ;
      AV22W_OUT_CHAR2 = "" ;
      AV11W_BYTE_CNT = (short)(GXutil.byteCount( AV10P_IN_CHAR, AV18W_MOJI_CD)) ;
      if ( AV11W_BYTE_CNT > AV9P_IN_BYTE )
      {
         AV17W_LEN = (short)(GXutil.len( AV10P_IN_CHAR)) ;
         AV13W_I = (short)(1) ;
         while ( AV13W_I <= AV17W_LEN )
         {
            AV21W_OUT_CHAR1 = AV21W_OUT_CHAR1 + GXutil.substring( AV10P_IN_CHAR, AV13W_I, 1) ;
            AV12W_BYTE_CNT_SV = (short)(GXutil.byteCount( AV21W_OUT_CHAR1, AV18W_MOJI_CD)) ;
            if ( AV12W_BYTE_CNT_SV > AV9P_IN_BYTE )
            {
               AV19W_MOJI1 = (short)(AV13W_I-1) ;
               AV21W_OUT_CHAR1 = GXutil.substring( AV10P_IN_CHAR, 1, AV19W_MOJI1) ;
               AV20W_MOJI2 = (short)(AV17W_LEN-AV13W_I+1) ;
               AV22W_OUT_CHAR2 = GXutil.substring( AV10P_IN_CHAR, AV13W_I, AV20W_MOJI2) ;
               if (true) break;
            }
            else if ( AV12W_BYTE_CNT_SV == AV9P_IN_BYTE )
            {
               AV19W_MOJI1 = (short)(AV13W_I+1) ;
               AV20W_MOJI2 = (short)(AV17W_LEN-AV13W_I) ;
               AV22W_OUT_CHAR2 = GXutil.substring( AV10P_IN_CHAR, AV19W_MOJI1, AV20W_MOJI2) ;
               if (true) break;
            }
            else
            {
            }
            AV13W_I = (short)(AV13W_I+1) ;
         }
      }
      else
      {
         AV21W_OUT_CHAR1 = AV10P_IN_CHAR ;
         AV22W_OUT_CHAR2 = "" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a810_pc02_convert_cut_byte.this.AV21W_OUT_CHAR1;
      this.aP3[0] = a810_pc02_convert_cut_byte.this.AV22W_OUT_CHAR2;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21W_OUT_CHAR1 = "" ;
      AV22W_OUT_CHAR2 = "" ;
      AV18W_MOJI_CD = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11W_BYTE_CNT ;
   private short AV17W_LEN ;
   private short AV13W_I ;
   private short AV12W_BYTE_CNT_SV ;
   private short AV19W_MOJI1 ;
   private short AV20W_MOJI2 ;
   private short Gx_err ;
   private int AV9P_IN_BYTE ;
   private String AV10P_IN_CHAR ;
   private String AV21W_OUT_CHAR1 ;
   private String AV22W_OUT_CHAR2 ;
   private String AV18W_MOJI_CD ;
   private String[] aP2 ;
   private String[] aP3 ;
}

