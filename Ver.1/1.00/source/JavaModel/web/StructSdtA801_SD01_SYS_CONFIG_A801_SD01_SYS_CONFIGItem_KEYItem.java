import com.genexus.*;

public final  class StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem implements Cloneable, java.io.Serializable
{
   public StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem( )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name = "" ;
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value = "" ;
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
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value = value ;
   }

   protected String gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name ;
   protected String gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value ;
}

