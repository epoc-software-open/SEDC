/*
               File: StructSdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem
        Description: B716_SD1_CRF_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.82
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem implements Cloneable, java.io.Serializable
{
   public StructSdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem( )
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

   public int getTbt02_subject_id( )
   {
      return gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id ;
   }

   public void setTbt02_subject_id( int value )
   {
      gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id = value ;
   }

   public short getTbt02_crf_id( )
   {
      return gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id ;
   }

   public void setTbt02_crf_id( short value )
   {
      gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id = value ;
   }

   public byte getTbt02_crf_eda_no( )
   {
      return gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_eda_no ;
   }

   public void setTbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_eda_no = value ;
   }

   protected byte gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_eda_no ;
   protected short gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id ;
   protected int gxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id ;
}

