import com.genexus.*;

public final  class StructSdtB712_SD05_MULTI_SEL_LIST implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD05_MULTI_SEL_LIST( )
   {
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

   public java.util.Vector getSelect_code( )
   {
      return gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ;
   }

   public void setSelect_code( java.util.Vector value )
   {
      gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code = value ;
   }

   protected java.util.Vector gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code=null ;
}

