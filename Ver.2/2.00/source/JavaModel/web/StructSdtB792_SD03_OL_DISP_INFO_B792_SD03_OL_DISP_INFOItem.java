/*
               File: StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem
        Description: B792_SD03_OL_DISP_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:59.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem implements Cloneable, java.io.Serializable
{
   public StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem( )
   {
      gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn = "" ;
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

   public String getOl_disp_item_kbn( )
   {
      return gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn ;
   }

   public void setOl_disp_item_kbn( String value )
   {
      gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn = value ;
   }

   protected String gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn ;
}

