/*
               File: StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem
        Description: B702_SD03_SEL_LIST_ITEM
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:44.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem implements Cloneable, java.io.Serializable
{
   public StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem( )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name = "" ;
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value = "" ;
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

   public short getList_item_no( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no ;
   }

   public void setList_item_no( short value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no = value ;
   }

   public String getList_item_name( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name ;
   }

   public void setList_item_name( String value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name = value ;
   }

   public String getInner_value( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value ;
   }

   public void setInner_value( String value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value = value ;
   }

   protected short gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no ;
   protected String gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name ;
   protected String gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value ;
}

