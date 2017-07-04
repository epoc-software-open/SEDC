import com.genexus.*;

public final  class StructSdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem( )
   {
      gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id = "" ;
      gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm = "" ;
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
      return gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg ;
   }

   public void setSel_flg( boolean value )
   {
      gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg = value ;
   }

   public String getTam08_site_id( )
   {
      return gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id ;
   }

   public void setTam08_site_id( String value )
   {
      gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id = value ;
   }

   public String getTam08_site_snm( )
   {
      return gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm ;
   }

   public void setTam08_site_snm( String value )
   {
      gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm = value ;
   }

   protected boolean gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Sel_flg ;
   protected String gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_id ;
   protected String gxTv_SdtB712_SD01_SITE_LIST_B712_SD01_SITE_LISTItem_Tam08_site_snm ;
}

