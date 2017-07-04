import com.genexus.*;

public final  class StructSdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem implements Cloneable, java.io.Serializable
{
   public StructSdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem( )
   {
      gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd = "" ;
      gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg = "" ;
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

   public String getCrf_item_grp_cd( )
   {
      return gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd ;
   }

   public void setCrf_item_grp_cd( String value )
   {
      gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd = value ;
   }

   public String getErr_msg( )
   {
      return gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg ;
   }

   public void setErr_msg( String value )
   {
      gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg = value ;
   }

   protected String gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd ;
   protected String gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg ;
}

