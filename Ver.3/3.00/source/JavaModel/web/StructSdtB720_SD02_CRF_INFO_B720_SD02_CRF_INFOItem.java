/*
               File: StructSdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem
        Description: B720_SD02_CRF_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.30
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem implements Cloneable, java.io.Serializable
{
   public StructSdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem( )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id = "" ;
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name = "" ;
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

   public String getTbt01_site_id( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id ;
   }

   public void setTbt01_site_id( String value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id = value ;
   }

   public int getTbt01_subject_id( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id ;
   }

   public void setTbt01_subject_id( int value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id = value ;
   }

   public short getTbt02_crf_id( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id ;
   }

   public void setTbt02_crf_id( short value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id = value ;
   }

   public byte getTbt02_crf_eda_no( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no ;
   }

   public void setTbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no = value ;
   }

   public String getCrf_name( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name ;
   }

   public void setCrf_name( String value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name = value ;
   }

   public int getVisit_no( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no ;
   }

   public void setVisit_no( int value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no = value ;
   }

   protected byte gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no ;
   protected short gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id ;
   protected int gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id ;
   protected int gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no ;
   protected String gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id ;
   protected String gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name ;
}

