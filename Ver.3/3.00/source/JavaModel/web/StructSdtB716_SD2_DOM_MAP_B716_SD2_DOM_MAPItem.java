/*
               File: StructSdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem
        Description: B716_SD2_DOM_MAP
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:45.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem implements Cloneable, java.io.Serializable
{
   public StructSdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem( )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid = "" ;
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

   public int getVisit_no( )
   {
      return gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no ;
   }

   public void setVisit_no( int value )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no = value ;
   }

   public String getDom_itm_grp_oid( )
   {
      return gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid ;
   }

   public void setDom_itm_grp_oid( String value )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid = value ;
   }

   public short getDom_itm_grp_rowno( )
   {
      return gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno ;
   }

   public void setDom_itm_grp_rowno( short value )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno = value ;
   }

   public java.util.Vector getDom_var( )
   {
      return gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var ;
   }

   public void setDom_var( java.util.Vector value )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var = value ;
   }

   protected short gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno ;
   protected int gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no ;
   protected String gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid ;
   protected java.util.Vector gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var=null ;
}

