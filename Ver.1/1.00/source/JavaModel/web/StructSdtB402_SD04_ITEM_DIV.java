import com.genexus.*;

public final  class StructSdtB402_SD04_ITEM_DIV implements Cloneable, java.io.Serializable
{
   public StructSdtB402_SD04_ITEM_DIV( )
   {
      gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div = "" ;
      gxTv_SdtB402_SD04_ITEM_DIV_Use_confing = "" ;
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

   public String getCrf_imte_div( )
   {
      return gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div ;
   }

   public void setCrf_imte_div( String value )
   {
      gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div = value ;
   }

   public String getUse_confing( )
   {
      return gxTv_SdtB402_SD04_ITEM_DIV_Use_confing ;
   }

   public void setUse_confing( String value )
   {
      gxTv_SdtB402_SD04_ITEM_DIV_Use_confing = value ;
   }

   protected String gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div ;
   protected String gxTv_SdtB402_SD04_ITEM_DIV_Use_confing ;
}

