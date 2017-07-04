/*
               File: StructSdtB712_SD09_CRF_ADD
        Description: B712_SD09_CRF_ADD
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.74
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB712_SD09_CRF_ADD implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD09_CRF_ADD( )
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
      return gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id ;
   }

   public void setTbt02_subject_id( int value )
   {
      gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id = value ;
   }

   public short getTbt02_crf_id( )
   {
      return gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id ;
   }

   public void setTbt02_crf_id( short value )
   {
      gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id = value ;
   }

   public byte getTbt02_crf_eda_no( )
   {
      return gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no ;
   }

   public void setTbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no = value ;
   }

   protected byte gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no ;
   protected short gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id ;
   protected int gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id ;
}

