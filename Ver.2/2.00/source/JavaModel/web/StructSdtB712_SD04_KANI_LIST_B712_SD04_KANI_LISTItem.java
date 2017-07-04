/*
               File: StructSdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem
        Description: B712_SD04_KANI_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.35
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem( )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd = "" ;
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak = "" ;
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

   public boolean getSel_flg( )
   {
      return gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg ;
   }

   public void setSel_flg( boolean value )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg = value ;
   }

   public String getTas01_item_cd( )
   {
      return gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd ;
   }

   public void setTas01_item_cd( String value )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd = value ;
   }

   public String getTas01_item_ryak( )
   {
      return gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak ;
   }

   public void setTas01_item_ryak( String value )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak = value ;
   }

   public short getTas01_sort_no( )
   {
      return gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no ;
   }

   public void setTas01_sort_no( short value )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no = value ;
   }

   protected short gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no ;
   protected boolean gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg ;
   protected String gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd ;
   protected String gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak ;
}

