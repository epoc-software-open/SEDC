import com.genexus.*;

public final  class StructSdtB808_SD01_EXTRA_INFO_PARMSItem implements Cloneable, java.io.Serializable
{
   public StructSdtB808_SD01_EXTRA_INFO_PARMSItem( )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name = "" ;
      gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value = "" ;
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

   public String getName( )
   {
      return gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value = value ;
   }

   protected String gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name ;
   protected String gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value ;
}

