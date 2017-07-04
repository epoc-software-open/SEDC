/*
               File: StructSdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem
        Description: B402_SD07_CRF_VISIT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.30
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem implements Cloneable, java.io.Serializable
{
   public StructSdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem( )
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

   public byte getTbm44_crf_eda_no( )
   {
      return gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no ;
   }

   public void setTbm44_crf_eda_no( byte value )
   {
      gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no = value ;
   }

   public int getTbm44_visit_no( )
   {
      return gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no ;
   }

   public void setTbm44_visit_no( int value )
   {
      gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no = value ;
   }

   protected byte gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no ;
   protected int gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no ;
}

