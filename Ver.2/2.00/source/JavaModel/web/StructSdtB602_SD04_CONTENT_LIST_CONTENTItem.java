/*
               File: StructSdtB602_SD04_CONTENT_LIST_CONTENTItem
        Description: B602_SD04_CONTENT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:57.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB602_SD04_CONTENT_LIST_CONTENTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD04_CONTENT_LIST_CONTENTItem( )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time = "" ;
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time = "" ;
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

   public long getContent_id( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id ;
   }

   public void setContent_id( long value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id = value ;
   }

   public long getDisplay_sequence( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence ;
   }

   public void setDisplay_sequence( long value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence = value ;
   }

   public String getInsert_time( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time ;
   }

   public void setInsert_time( String value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time = value ;
   }

   public String getUpdate_time( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time ;
   }

   public void setUpdate_time( String value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time = value ;
   }

   public long getContent_no( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no ;
   }

   public void setContent_no( long value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no = value ;
   }

   protected long gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id ;
   protected long gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence ;
   protected long gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no ;
   protected String gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time ;
   protected String gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time ;
}

