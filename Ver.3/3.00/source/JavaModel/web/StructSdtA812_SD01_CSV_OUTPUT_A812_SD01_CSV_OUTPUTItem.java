/*
               File: StructSdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem
        Description: A812_SD01_CSV_OUTPUT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:41.18
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem implements Cloneable, java.io.Serializable
{
   public StructSdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem( )
   {
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public java.util.Vector getCsv_data( )
   {
      return gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data ;
   }

   public void setCsv_data( java.util.Vector value )
   {
      gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data = value ;
   }

   protected java.util.Vector gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data=null ;
}

