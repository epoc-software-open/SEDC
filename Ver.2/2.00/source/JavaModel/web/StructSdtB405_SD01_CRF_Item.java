/*
               File: StructSdtB405_SD01_CRF_Item
        Description: B405_SD01
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.79
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB405_SD01_CRF_Item implements Cloneable, java.io.Serializable
{
   public StructSdtB405_SD01_CRF_Item( )
   {
      gxTv_SdtB405_SD01_CRF_Item_Status = "" ;
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

   public String getStatus( )
   {
      return gxTv_SdtB405_SD01_CRF_Item_Status ;
   }

   public void setStatus( String value )
   {
      gxTv_SdtB405_SD01_CRF_Item_Status = value ;
   }

   public byte getStatus_n( )
   {
      return gxTv_SdtB405_SD01_CRF_Item_Status_n ;
   }

   public void setStatus_n( byte value )
   {
      gxTv_SdtB405_SD01_CRF_Item_Status_n = value ;
   }

   public short getTbt02_crf_id( )
   {
      return gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id ;
   }

   public void setTbt02_crf_id( short value )
   {
      gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id = value ;
   }

   public short getTbt02_crf_latest_version( )
   {
      return gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version ;
   }

   public void setTbt02_crf_latest_version( short value )
   {
      gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version = value ;
   }

   protected byte gxTv_SdtB405_SD01_CRF_Item_Status_n ;
   protected short gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id ;
   protected short gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version ;
   protected String gxTv_SdtB405_SD01_CRF_Item_Status ;
}

