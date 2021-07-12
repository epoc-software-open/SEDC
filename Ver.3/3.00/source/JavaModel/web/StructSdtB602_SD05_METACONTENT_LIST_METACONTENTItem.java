/*
               File: StructSdtB602_SD05_METACONTENT_LIST_METACONTENTItem
        Description: B602_SD05_METACONTENT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB602_SD05_METACONTENT_LIST_METACONTENTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD05_METACONTENT_LIST_METACONTENTItem( )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content = "" ;
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name = "" ;
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

   public long getMetadata_content_id( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id ;
   }

   public void setMetadata_content_id( long value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id = value ;
   }

   public String getContent( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content ;
   }

   public void setContent( String value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content = value ;
   }

   public long getMetadata_id( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id ;
   }

   public void setMetadata_id( long value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id = value ;
   }

   public String getMetadata_name( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name ;
   }

   public void setMetadata_name( String value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name = value ;
   }

   protected long gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id ;
   protected long gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id ;
   protected String gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content ;
   protected String gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name ;
}

