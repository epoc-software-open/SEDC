/*
               File: StructSdtB712_SD05_MULTI_SEL_LIST
        Description: B712_SD05_MULTI_SEL_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:55.74
       Program type: Callable routine
          Main DBMS: mysql
*/
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

