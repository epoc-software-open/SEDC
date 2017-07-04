/*
               File: StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem
        Description: B719_SD02_OPEN_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:59.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem implements Cloneable, java.io.Serializable
{
   public StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = "" ;
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

   public int getSubject_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id ;
   }

   public void setSubject_id( int value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id = value ;
   }

   public short getCrf_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id ;
   }

   public void setCrf_id( short value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id = value ;
   }

   public byte getCrf_eda_no( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no ;
   }

   public void setCrf_eda_no( byte value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no = value ;
   }

   public String getSite_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id ;
   }

   public void setSite_id( String value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = value ;
   }

   protected byte gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no ;
   protected short gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id ;
   protected int gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id ;
   protected String gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id ;
}

