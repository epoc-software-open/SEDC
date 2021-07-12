/*
               File: StructSdtB602_SD03_META_LIST_META_DATAItem
        Description: B602_SD03_META_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.26
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB602_SD03_META_LIST_META_DATAItem implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD03_META_LIST_META_DATAItem( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name = "" ;
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type = "" ;
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos = "" ;
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content = "" ;
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag = "" ;
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

   public long getMetadata_id( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id ;
   }

   public void setMetadata_id( long value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id = value ;
   }

   public String getName( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name = value ;
   }

   public String getType( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type ;
   }

   public void setType( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type = value ;
   }

   public String getDisplay_pos( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos ;
   }

   public void setDisplay_pos( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos = value ;
   }

   public String getSelect_content( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content ;
   }

   public void setSelect_content( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content = value ;
   }

   public String getRequire_flag( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag ;
   }

   public void setRequire_flag( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag = value ;
   }

   public long getDisplay_sequence( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence ;
   }

   public void setDisplay_sequence( long value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence = value ;
   }

   protected long gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id ;
   protected long gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag ;
}

