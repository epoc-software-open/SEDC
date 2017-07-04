/*
               File: StructSdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem
        Description: B712_SD06_RESULT_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.60
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime = cal.getTime() ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime = cal.getTime() ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = cal.getTime() ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id = "" ;
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

   public boolean getSel_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg ;
   }

   public void setSel_flg( boolean value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg = value ;
   }

   public int getTbt02_subject_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id ;
   }

   public void setTbt02_subject_id( int value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id = value ;
   }

   public short getTbt02_crf_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id ;
   }

   public void setTbt02_crf_id( short value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id = value ;
   }

   public byte getTbt02_crf_eda_no( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no ;
   }

   public void setTbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no = value ;
   }

   public short getTbt02_crf_latest_version( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version ;
   }

   public void setTbt02_crf_latest_version( short value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version = value ;
   }

   public byte getTbt02_crf_input_level( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level ;
   }

   public void setTbt02_crf_input_level( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level = value ;
   }

   public java.util.Date getTbt02_upload_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime ;
   }

   public void setTbt02_upload_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime = value ;
   }

   public String getTbt02_upload_user_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id ;
   }

   public void setTbt02_upload_user_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id = value ;
   }

   public String getTbt02_upload_auth_cd( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd ;
   }

   public void setTbt02_upload_auth_cd( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd = value ;
   }

   public String getTbt02_input_end_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg ;
   }

   public void setTbt02_input_end_flg( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg = value ;
   }

   public String getTbt02_dm_arrival_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg ;
   }

   public void setTbt02_dm_arrival_flg( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg = value ;
   }

   public java.util.Date getTbt02_dm_arrival_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime ;
   }

   public void setTbt02_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime = value ;
   }

   public String getTbt01_site_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id ;
   }

   public void setTbt01_site_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id = value ;
   }

   public String getTam08_site_snm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm ;
   }

   public void setTam08_site_snm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm = value ;
   }

   public String getTbm31_crf_snm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm ;
   }

   public void setTbm31_crf_snm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm = value ;
   }

   public int getTbm31_order( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order ;
   }

   public void setTbm31_order( int value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order = value ;
   }

   public byte getTbm31_repeat_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg ;
   }

   public void setTbm31_repeat_flg( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg = value ;
   }

   public byte getTbm31_repeat_max( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max ;
   }

   public void setTbm31_repeat_max( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max = value ;
   }

   public int getVisit_no( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no ;
   }

   public void setVisit_no( int value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no = value ;
   }

   public short getRepear_max( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max ;
   }

   public void setRepear_max( short value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max = value ;
   }

   public String getTam07_user_nm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm ;
   }

   public void setTam07_user_nm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm = value ;
   }

   public long getTbt02_upd_cnt( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt ;
   }

   public void setTbt02_upd_cnt( long value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt = value ;
   }

   public java.util.Date getTbt02_upd_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime ;
   }

   public void setTbt02_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = value ;
   }

   public String getTbt02_upd_user_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id ;
   }

   public void setTbt02_upd_user_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id = value ;
   }

   public boolean getUpd_user_disp_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg ;
   }

   public void setUpd_user_disp_flg( boolean value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg = value ;
   }

   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no ;
   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level ;
   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg ;
   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max ;
   protected short gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id ;
   protected short gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version ;
   protected short gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max ;
   protected int gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id ;
   protected int gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order ;
   protected int gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no ;
   protected long gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt ;
   protected boolean gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg ;
   protected boolean gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime ;
}

