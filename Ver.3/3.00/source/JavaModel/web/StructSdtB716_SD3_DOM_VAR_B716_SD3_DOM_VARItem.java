/*
               File: StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem
        Description: B716_SD3_DOM_VAR
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:45.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem implements Cloneable, java.io.Serializable
{
   public StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem( )
   {
      gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm = "" ;
      gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd = "" ;
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

   public String getDom_var_nm( )
   {
      return gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm ;
   }

   public void setDom_var_nm( String value )
   {
      gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm = value ;
   }

   public String getCrf_item_grp_cd( )
   {
      return gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd ;
   }

   public void setCrf_item_grp_cd( String value )
   {
      gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd = value ;
   }

   protected String gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm ;
   protected String gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd ;
}

