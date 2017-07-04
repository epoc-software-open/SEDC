import com.genexus.*;

public final  class StructSdtLinkList_LinkItem implements Cloneable, java.io.Serializable
{
   public StructSdtLinkList_LinkItem( )
   {
      gxTv_SdtLinkList_LinkItem_Caption = "" ;
      gxTv_SdtLinkList_LinkItem_Url = "" ;
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

   public String getCaption( )
   {
      return gxTv_SdtLinkList_LinkItem_Caption ;
   }

   public void setCaption( String value )
   {
      gxTv_SdtLinkList_LinkItem_Caption = value ;
   }

   public String getUrl( )
   {
      return gxTv_SdtLinkList_LinkItem_Url ;
   }

   public void setUrl( String value )
   {
      gxTv_SdtLinkList_LinkItem_Url = value ;
   }

   protected String gxTv_SdtLinkList_LinkItem_Caption ;
   protected String gxTv_SdtLinkList_LinkItem_Url ;
}

