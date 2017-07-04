/*
               File: A817_PC01_KINGAKU_NM_TO_VC
        Description: 金額数値⇒文字変換処理（数値⇒カンマ付き文字列）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:45.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a817_pc01_kingaku_nm_to_vc extends GXProcedure
{
   public a817_pc01_kingaku_nm_to_vc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a817_pc01_kingaku_nm_to_vc.class ), "" );
   }

   public a817_pc01_kingaku_nm_to_vc( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( java.math.BigDecimal aP0 ,
                             byte aP1 )
   {
      a817_pc01_kingaku_nm_to_vc.this.AV17P_KINGAKU = aP0;
      a817_pc01_kingaku_nm_to_vc.this.AV19P_MST000_KETASU = aP1;
      a817_pc01_kingaku_nm_to_vc.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( java.math.BigDecimal aP0 ,
                        byte aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.math.BigDecimal aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      a817_pc01_kingaku_nm_to_vc.this.AV17P_KINGAKU = aP0;
      a817_pc01_kingaku_nm_to_vc.this.AV19P_MST000_KETASU = aP1;
      a817_pc01_kingaku_nm_to_vc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18W_KINGAKU_OUT = "" ;
      if ( AV17P_KINGAKU.doubleValue() < 0 )
      {
         AV11W_KINGAKU_PLUS = AV17P_KINGAKU.multiply(DecimalUtil.doubleToDec(-1)) ;
      }
      else
      {
         AV11W_KINGAKU_PLUS = AV17P_KINGAKU ;
      }
      AV12W_KINGAKU_VC = GXutil.trim( GXutil.str( AV11W_KINGAKU_PLUS, 18, 4)) ;
      AV15W_LEN = (byte)(GXutil.len( AV12W_KINGAKU_VC)) ;
      AV13W_KINGAKU2_VC = "" ;
      AV14W_KINGAKU3_VC = "" ;
      AV16W_NOT_ZERO_FLG = (byte)(0) ;
      AV10W_IX1 = 1 ;
      while ( AV10W_IX1 <= AV15W_LEN )
      {
         AV8W_EDIT_1VC = GXutil.substring( AV12W_KINGAKU_VC, AV10W_IX1, 1) ;
         if ( ( GXutil.strcmp(AV8W_EDIT_1VC, "0") != 0 ) && ( AV16W_NOT_ZERO_FLG == 0 ) )
         {
            AV16W_NOT_ZERO_FLG = (byte)(1) ;
         }
         if ( ( GXutil.strcmp(AV8W_EDIT_1VC, ".") == 0 ) && ( AV16W_NOT_ZERO_FLG != 2 ) )
         {
            AV16W_NOT_ZERO_FLG = (byte)(2) ;
         }
         if ( AV16W_NOT_ZERO_FLG == 1 )
         {
            AV13W_KINGAKU2_VC = AV13W_KINGAKU2_VC + AV8W_EDIT_1VC ;
         }
         else if ( AV16W_NOT_ZERO_FLG == 2 )
         {
            AV14W_KINGAKU3_VC = AV14W_KINGAKU3_VC + AV8W_EDIT_1VC ;
         }
         AV10W_IX1 = (int)(AV10W_IX1+1) ;
      }
      AV12W_KINGAKU_VC = AV13W_KINGAKU2_VC ;
      AV15W_LEN = (byte)(GXutil.len( AV12W_KINGAKU_VC)) ;
      AV13W_KINGAKU2_VC = "" ;
      AV9W_EDIT_CNT = (short)(0) ;
      AV10W_IX1 = AV15W_LEN ;
      while ( AV10W_IX1 >= 1 )
      {
         AV8W_EDIT_1VC = GXutil.substring( AV12W_KINGAKU_VC, AV10W_IX1, 1) ;
         AV9W_EDIT_CNT = (short)(AV9W_EDIT_CNT+1) ;
         if ( ( AV9W_EDIT_CNT == 4 ) || ( AV9W_EDIT_CNT == 7 ) || ( AV9W_EDIT_CNT == 10 ) || ( AV9W_EDIT_CNT == 13 ) || ( AV9W_EDIT_CNT == 16 ) )
         {
            AV13W_KINGAKU2_VC = AV8W_EDIT_1VC + "," + AV13W_KINGAKU2_VC ;
         }
         else
         {
            AV13W_KINGAKU2_VC = AV8W_EDIT_1VC + AV13W_KINGAKU2_VC ;
         }
         AV10W_IX1 = (int)(AV10W_IX1+-1) ;
      }
      if ( AV17P_KINGAKU.doubleValue() < 0 )
      {
         AV18W_KINGAKU_OUT = "-" + AV13W_KINGAKU2_VC ;
      }
      else
      {
         AV18W_KINGAKU_OUT = AV13W_KINGAKU2_VC ;
      }
      if ( (GXutil.strcmp("", AV18W_KINGAKU_OUT)==0) )
      {
         AV18W_KINGAKU_OUT = "0" ;
      }
      if ( AV19P_MST000_KETASU == 1 )
      {
         AV18W_KINGAKU_OUT = AV18W_KINGAKU_OUT + GXutil.substring( AV14W_KINGAKU3_VC, 1, 2) ;
      }
      else if ( AV19P_MST000_KETASU == 2 )
      {
         AV18W_KINGAKU_OUT = AV18W_KINGAKU_OUT + GXutil.substring( AV14W_KINGAKU3_VC, 1, 3) ;
      }
      else if ( AV19P_MST000_KETASU == 3 )
      {
         AV18W_KINGAKU_OUT = AV18W_KINGAKU_OUT + GXutil.substring( AV14W_KINGAKU3_VC, 1, 4) ;
      }
      else if ( AV19P_MST000_KETASU == 4 )
      {
         AV18W_KINGAKU_OUT = AV18W_KINGAKU_OUT + GXutil.substring( AV14W_KINGAKU3_VC, 1, 5) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a817_pc01_kingaku_nm_to_vc.this.AV18W_KINGAKU_OUT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18W_KINGAKU_OUT = "" ;
      AV11W_KINGAKU_PLUS = DecimalUtil.ZERO ;
      AV12W_KINGAKU_VC = "" ;
      AV13W_KINGAKU2_VC = "" ;
      AV14W_KINGAKU3_VC = "" ;
      AV8W_EDIT_1VC = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19P_MST000_KETASU ;
   private byte AV15W_LEN ;
   private byte AV16W_NOT_ZERO_FLG ;
   private short AV9W_EDIT_CNT ;
   private short Gx_err ;
   private int AV10W_IX1 ;
   private java.math.BigDecimal AV17P_KINGAKU ;
   private java.math.BigDecimal AV11W_KINGAKU_PLUS ;
   private String AV18W_KINGAKU_OUT ;
   private String AV12W_KINGAKU_VC ;
   private String AV13W_KINGAKU2_VC ;
   private String AV14W_KINGAKU3_VC ;
   private String AV8W_EDIT_1VC ;
   private String[] aP2 ;
}

