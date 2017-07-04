/*
               File: StructSdtMessages_Message
        Description: Messages
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:21:0.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtMessages_Message implements Cloneable, java.io.Serializable
{
   public StructSdtMessages_Message( )
   {
      gxTv_SdtMessages_Message_Id = "" ;
      gxTv_SdtMessages_Message_Description = "" ;
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

   public String getId( )
   {
      return gxTv_SdtMessages_Message_Id ;
   }

   public void setId( String value )
   {
      gxTv_SdtMessages_Message_Id = value ;
   }

   public byte getType( )
   {
      return gxTv_SdtMessages_Message_Type ;
   }

   public void setType( byte value )
   {
      gxTv_SdtMessages_Message_Type = value ;
   }

   public String getDescription( )
   {
      return gxTv_SdtMessages_Message_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtMessages_Message_Description = value ;
   }

   protected byte gxTv_SdtMessages_Message_Type ;
   protected String gxTv_SdtMessages_Message_Id ;
   protected String gxTv_SdtMessages_Message_Description ;
}

