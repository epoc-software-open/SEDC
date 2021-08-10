/*
               File: StructSdtB602_SD02_DB_LIST_DBItem
        Description: B602_SD02_DB_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB602_SD02_DB_LIST_DBItem implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD02_DB_LIST_DBItem( )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Name = "" ;
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

   public long getId( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_DBItem_Id ;
   }

   public void setId( long value )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Id = value ;
   }

   public String getName( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_DBItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Name = value ;
   }

   protected long gxTv_SdtB602_SD02_DB_LIST_DBItem_Id ;
   protected String gxTv_SdtB602_SD02_DB_LIST_DBItem_Name ;
}

