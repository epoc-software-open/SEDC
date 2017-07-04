import com.genexus.*;

public final  class StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem implements Cloneable, java.io.Serializable
{
   public StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem( )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section = "" ;
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

   public String getSection( )
   {
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section ;
   }

   public void setSection( String value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section = value ;
   }

   public java.util.Vector getKey( )
   {
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key ;
   }

   public void setKey( java.util.Vector value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = value ;
   }

   protected String gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section ;
   protected java.util.Vector gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key=null ;
}

