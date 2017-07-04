/*
               File: StructSdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem
        Description: B714_SD1_CRF_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.80
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem implements Cloneable, java.io.Serializable
{
   public StructSdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem( )
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
      return gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id ;
   }

   public void setTbt02_subject_id( int value )
   {
      gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id = value ;
   }

   public short getTbt02_crf_id( )
   {
      return gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id ;
   }

   public void setTbt02_crf_id( short value )
   {
      gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id = value ;
   }

   public byte getTbt02_crf_eda_no( )
   {
      return gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no ;
   }

   public void setTbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no = value ;
   }

   public long getTbt02_upd_cnt( )
   {
      return gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt ;
   }

   public void setTbt02_upd_cnt( long value )
   {
      gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt = value ;
   }

   protected byte gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no ;
   protected short gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id ;
   protected int gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id ;
   protected long gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt ;
}

