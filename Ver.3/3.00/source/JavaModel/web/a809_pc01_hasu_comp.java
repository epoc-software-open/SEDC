/*
               File: A809_PC01_HASU_COMP
        Description: 端数計算処理（四捨五入、切捨、切上）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:13.95
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a809_pc01_hasu_comp extends GXProcedure
{
   public a809_pc01_hasu_comp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a809_pc01_hasu_comp.class ), "" );
   }

   public a809_pc01_hasu_comp( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( byte aP0 ,
                           java.math.BigDecimal aP1 ,
                           java.math.BigDecimal aP2 )
   {
      a809_pc01_hasu_comp.this.AV9P_COMP_KBN = aP0;
      a809_pc01_hasu_comp.this.AV11P_NUM_IN = aP1;
      a809_pc01_hasu_comp.this.AV10P_MUTI_RITU = aP2;
      a809_pc01_hasu_comp.this.aP3 = aP3;
      a809_pc01_hasu_comp.this.aP3 = new long[] {0};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( byte aP0 ,
                        java.math.BigDecimal aP1 ,
                        java.math.BigDecimal aP2 ,
                        long[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( byte aP0 ,
                             java.math.BigDecimal aP1 ,
                             java.math.BigDecimal aP2 ,
                             long[] aP3 )
   {
      a809_pc01_hasu_comp.this.AV9P_COMP_KBN = aP0;
      a809_pc01_hasu_comp.this.AV11P_NUM_IN = aP1;
      a809_pc01_hasu_comp.this.AV10P_MUTI_RITU = aP2;
      a809_pc01_hasu_comp.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12W_NUM_OUT = 0 ;
      if ( AV10P_MUTI_RITU.doubleValue() == 0 )
      {
         AV8W_MUTI_RITU = DecimalUtil.doubleToDec(1) ;
      }
      else
      {
         AV8W_MUTI_RITU = AV10P_MUTI_RITU ;
      }
      if ( AV9P_COMP_KBN == 1 )
      {
         if ( AV11P_NUM_IN.doubleValue() < 0 )
         {
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble((AV11P_NUM_IN.multiply(AV8W_MUTI_RITU)).subtract(DecimalUtil.doubleToDec(0.5,3,1)))) ;
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec(AV12W_NUM_OUT*-1), 0).multiply(DecimalUtil.doubleToDec(-1)))) ;
         }
         else
         {
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble((AV11P_NUM_IN.multiply(AV8W_MUTI_RITU)).add(DecimalUtil.doubleToDec(0.5,3,1)))) ;
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec(AV12W_NUM_OUT), 0))) ;
         }
         AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec(AV12W_NUM_OUT), 0))) ;
      }
      else if ( AV9P_COMP_KBN == 2 )
      {
         if ( AV11P_NUM_IN.doubleValue() < 0 )
         {
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( AV11P_NUM_IN.multiply(DecimalUtil.doubleToDec(-1)).multiply(AV8W_MUTI_RITU), 0).multiply(DecimalUtil.doubleToDec(-1)))) ;
         }
         else
         {
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( AV11P_NUM_IN.multiply(AV8W_MUTI_RITU), 0))) ;
         }
      }
      else if ( AV9P_COMP_KBN == 3 )
      {
         if ( AV11P_NUM_IN.doubleValue() < 0 )
         {
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble((AV11P_NUM_IN.multiply(AV8W_MUTI_RITU)).subtract(DecimalUtil.doubleToDec(0.9,3,1)))) ;
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec(AV12W_NUM_OUT*-1), 0).multiply(DecimalUtil.doubleToDec(-1)))) ;
         }
         else
         {
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble((AV11P_NUM_IN.multiply(AV8W_MUTI_RITU)).add(DecimalUtil.doubleToDec(0.9,3,1)))) ;
            AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec(AV12W_NUM_OUT), 0))) ;
         }
         AV12W_NUM_OUT = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec(AV12W_NUM_OUT), 0))) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = a809_pc01_hasu_comp.this.AV12W_NUM_OUT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8W_MUTI_RITU = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9P_COMP_KBN ;
   private short Gx_err ;
   private long AV12W_NUM_OUT ;
   private java.math.BigDecimal AV11P_NUM_IN ;
   private java.math.BigDecimal AV10P_MUTI_RITU ;
   private java.math.BigDecimal AV8W_MUTI_RITU ;
   private long[] aP3 ;
}

