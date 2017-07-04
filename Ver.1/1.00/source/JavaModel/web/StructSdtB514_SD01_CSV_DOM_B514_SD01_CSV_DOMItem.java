import com.genexus.*;

public final  class StructSdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem implements Cloneable, java.io.Serializable
{
   public StructSdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem( )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd = "" ;
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm = "" ;
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value = "" ;
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

   public String getDom_cd( )
   {
      return gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd ;
   }

   public void setDom_cd( String value )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd = value ;
   }

   public String getDom_var_nm( )
   {
      return gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm ;
   }

   public void setDom_var_nm( String value )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm = value ;
   }

   public int getOrder( )
   {
      return gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order ;
   }

   public void setOrder( int value )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value = value ;
   }

   protected int gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order ;
   protected String gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd ;
   protected String gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm ;
   protected String gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value ;
}

