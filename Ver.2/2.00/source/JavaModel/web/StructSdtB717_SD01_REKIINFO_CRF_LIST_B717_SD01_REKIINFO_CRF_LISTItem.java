/*
               File: StructSdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem
        Description: B717_SD01_REKIINFO_CRF_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.95
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime = cal.getTime() ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu = "" ;
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

   public short getTbt11_crf_version( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version ;
   }

   public void setTbt11_crf_version( short value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version = value ;
   }

   public String getDm_arrival( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival ;
   }

   public void setDm_arrival( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival = value ;
   }

   public String getInput_end( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end ;
   }

   public void setInput_end( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end = value ;
   }

   public java.util.Date getTbt11_upload_datetime( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime ;
   }

   public void setTbt11_upload_datetime( java.util.Date value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime = value ;
   }

   public String getTbt11_upload_datetime_vc( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc ;
   }

   public void setTbt11_upload_datetime_vc( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc = value ;
   }

   public String getTam07_user_nm( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm ;
   }

   public void setTam07_user_nm( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm = value ;
   }

   public String getTbt11_upd_riyu( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu ;
   }

   public void setTbt11_upd_riyu( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu = value ;
   }

   protected short gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu ;
   protected java.util.Date gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime ;
}

