/*
               File: StructSdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem
        Description: C712_SD10_IN_CRF_ID
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.43
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem implements Cloneable, java.io.Serializable
{
   public StructSdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem( )
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

   public short getCrfid( )
   {
      return gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid ;
   }

   public void setCrfid( short value )
   {
      gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid = value ;
   }

   protected short gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid ;
}

