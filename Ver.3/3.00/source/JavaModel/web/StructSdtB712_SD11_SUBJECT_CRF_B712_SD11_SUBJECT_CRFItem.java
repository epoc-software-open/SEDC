/*
               File: StructSdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem
        Description: B712_SD11_SUBJECT_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.17
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem( )
   {
      gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json = "" ;
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

   public int getB712_subject_id( )
   {
      return gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id ;
   }

   public void setB712_subject_id( int value )
   {
      gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id = value ;
   }

   public String getB712_sd03_json( )
   {
      return gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json ;
   }

   public void setB712_sd03_json( String value )
   {
      gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json = value ;
   }

   protected int gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id ;
   protected String gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json ;
}

