/*
               File: StructSdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem
        Description: B712_SD08_ICON_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem( )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd = "" ;
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm = "" ;
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption = "" ;
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

   public String getAuth_cd( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd ;
   }

   public void setAuth_cd( String value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd = value ;
   }

   public String getAuth_nm( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm ;
   }

   public void setAuth_nm( String value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm = value ;
   }

   public String getIcon_caption( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption ;
   }

   public void setIcon_caption( String value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption = value ;
   }

   public short getIcon_r( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r ;
   }

   public void setIcon_r( short value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r = value ;
   }

   public short getIcon_g( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g ;
   }

   public void setIcon_g( short value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g = value ;
   }

   public short getIcon_b( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b ;
   }

   public void setIcon_b( short value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b = value ;
   }

   protected short gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r ;
   protected short gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g ;
   protected short gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b ;
   protected String gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd ;
   protected String gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm ;
   protected String gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption ;
}

