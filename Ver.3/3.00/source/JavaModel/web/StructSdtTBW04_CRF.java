/*
               File: StructSdtTBW04_CRF
        Description: CRFテーブルワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:49.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBW04_CRF implements Cloneable, java.io.Serializable
{
   public StructSdtTBW04_CRF( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBW04_CRF_Tbw04_session_id = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_app_id = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_disp_datetime = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_flg = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_datetime = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_user_id = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_upload_datetime = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_upload_user_id = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_flg = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_datetime = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_user_id = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_flg = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_completion_flg = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_edit_flg = "" ;
      gxTv_SdtTBW04_CRF_Mode = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_session_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_app_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z = cal.getTime() ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z = "" ;
      gxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z = "" ;
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

   public String getTbw04_session_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_session_id ;
   }

   public void setTbw04_session_id( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_session_id = value ;
   }

   public String getTbw04_app_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_app_id ;
   }

   public void setTbw04_app_id( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_app_id = value ;
   }

   public String getTbw04_disp_datetime( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_disp_datetime ;
   }

   public void setTbw04_disp_datetime( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_disp_datetime = value ;
   }

   public long getTbw04_study_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_study_id ;
   }

   public void setTbw04_study_id( long value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_study_id = value ;
   }

   public int getTbw04_subject_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_subject_id ;
   }

   public void setTbw04_subject_id( int value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_subject_id = value ;
   }

   public short getTbw04_crf_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_crf_id ;
   }

   public void setTbw04_crf_id( short value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_crf_id = value ;
   }

   public short getTbw04_crf_latest_version( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version ;
   }

   public void setTbw04_crf_latest_version( short value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version = value ;
   }

   public byte getTbw04_crf_input_level( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_crf_input_level ;
   }

   public void setTbw04_crf_input_level( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_crf_input_level = value ;
   }

   public String getTbw04_lock_flg( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_flg ;
   }

   public void setTbw04_lock_flg( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_flg = value ;
   }

   public java.util.Date getTbw04_lock_datetime( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_datetime ;
   }

   public void setTbw04_lock_datetime( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_datetime = value ;
   }

   public String getTbw04_lock_user_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_user_id ;
   }

   public void setTbw04_lock_user_id( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_user_id = value ;
   }

   public String getTbw04_lock_auth_cd( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd ;
   }

   public void setTbw04_lock_auth_cd( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd = value ;
   }

   public java.util.Date getTbw04_upload_datetime( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_datetime ;
   }

   public void setTbw04_upload_datetime( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_datetime = value ;
   }

   public String getTbw04_upload_user_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_user_id ;
   }

   public void setTbw04_upload_user_id( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_user_id = value ;
   }

   public String getTbw04_upload_auth_cd( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd ;
   }

   public void setTbw04_upload_auth_cd( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd = value ;
   }

   public String getTbw04_dm_arrival_flg( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg ;
   }

   public void setTbw04_dm_arrival_flg( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg = value ;
   }

   public java.util.Date getTbw04_dm_arrival_datetime( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime ;
   }

   public void setTbw04_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime = value ;
   }

   public String getTbw04_approval_flg( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_flg ;
   }

   public void setTbw04_approval_flg( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_flg = value ;
   }

   public java.util.Date getTbw04_approval_datetime( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_datetime ;
   }

   public void setTbw04_approval_datetime( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_datetime = value ;
   }

   public String getTbw04_approval_user_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_user_id ;
   }

   public void setTbw04_approval_user_id( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_user_id = value ;
   }

   public String getTbw04_approval_auth_cd( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd ;
   }

   public void setTbw04_approval_auth_cd( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd = value ;
   }

   public String getTbw04_input_end_flg( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_flg ;
   }

   public void setTbw04_input_end_flg( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_flg = value ;
   }

   public java.util.Date getTbw04_input_end_datetime( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime ;
   }

   public void setTbw04_input_end_datetime( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime = value ;
   }

   public String getTbw04_input_end_user_id( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id ;
   }

   public void setTbw04_input_end_user_id( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id = value ;
   }

   public String getTbw04_input_end_auth_cd( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd ;
   }

   public void setTbw04_input_end_auth_cd( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd = value ;
   }

   public String getTbw04_completion_flg( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_completion_flg ;
   }

   public void setTbw04_completion_flg( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_completion_flg = value ;
   }

   public String getTbw04_edit_flg( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_edit_flg ;
   }

   public void setTbw04_edit_flg( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_edit_flg = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBW04_CRF_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBW04_CRF_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBW04_CRF_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBW04_CRF_Initialized = value ;
   }

   public String getTbw04_session_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_session_id_Z ;
   }

   public void setTbw04_session_id_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_session_id_Z = value ;
   }

   public String getTbw04_app_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_app_id_Z ;
   }

   public void setTbw04_app_id_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_app_id_Z = value ;
   }

   public String getTbw04_disp_datetime_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z ;
   }

   public void setTbw04_disp_datetime_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z = value ;
   }

   public long getTbw04_study_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_study_id_Z ;
   }

   public void setTbw04_study_id_Z( long value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_study_id_Z = value ;
   }

   public int getTbw04_subject_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_subject_id_Z ;
   }

   public void setTbw04_subject_id_Z( int value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_subject_id_Z = value ;
   }

   public short getTbw04_crf_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_crf_id_Z ;
   }

   public void setTbw04_crf_id_Z( short value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_crf_id_Z = value ;
   }

   public short getTbw04_crf_latest_version_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_Z ;
   }

   public void setTbw04_crf_latest_version_Z( short value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_Z = value ;
   }

   public byte getTbw04_crf_input_level_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_crf_input_level_Z ;
   }

   public void setTbw04_crf_input_level_Z( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_crf_input_level_Z = value ;
   }

   public String getTbw04_lock_flg_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z ;
   }

   public void setTbw04_lock_flg_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z = value ;
   }

   public java.util.Date getTbw04_lock_datetime_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z ;
   }

   public void setTbw04_lock_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z = value ;
   }

   public String getTbw04_lock_user_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z ;
   }

   public void setTbw04_lock_user_id_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z = value ;
   }

   public String getTbw04_lock_auth_cd_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z ;
   }

   public void setTbw04_lock_auth_cd_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z = value ;
   }

   public java.util.Date getTbw04_upload_datetime_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z ;
   }

   public void setTbw04_upload_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z = value ;
   }

   public String getTbw04_upload_user_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z ;
   }

   public void setTbw04_upload_user_id_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z = value ;
   }

   public String getTbw04_upload_auth_cd_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z ;
   }

   public void setTbw04_upload_auth_cd_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z = value ;
   }

   public String getTbw04_dm_arrival_flg_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z ;
   }

   public void setTbw04_dm_arrival_flg_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z = value ;
   }

   public java.util.Date getTbw04_dm_arrival_datetime_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z ;
   }

   public void setTbw04_dm_arrival_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z = value ;
   }

   public String getTbw04_approval_flg_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z ;
   }

   public void setTbw04_approval_flg_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z = value ;
   }

   public java.util.Date getTbw04_approval_datetime_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z ;
   }

   public void setTbw04_approval_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z = value ;
   }

   public String getTbw04_approval_user_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z ;
   }

   public void setTbw04_approval_user_id_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z = value ;
   }

   public String getTbw04_approval_auth_cd_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z ;
   }

   public void setTbw04_approval_auth_cd_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z = value ;
   }

   public String getTbw04_input_end_flg_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z ;
   }

   public void setTbw04_input_end_flg_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z = value ;
   }

   public java.util.Date getTbw04_input_end_datetime_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z ;
   }

   public void setTbw04_input_end_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z = value ;
   }

   public String getTbw04_input_end_user_id_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z ;
   }

   public void setTbw04_input_end_user_id_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z = value ;
   }

   public String getTbw04_input_end_auth_cd_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z ;
   }

   public void setTbw04_input_end_auth_cd_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z = value ;
   }

   public String getTbw04_completion_flg_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z ;
   }

   public void setTbw04_completion_flg_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z = value ;
   }

   public String getTbw04_edit_flg_Z( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z ;
   }

   public void setTbw04_edit_flg_Z( String value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z = value ;
   }

   public byte getTbw04_crf_latest_version_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_N ;
   }

   public void setTbw04_crf_latest_version_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_N = value ;
   }

   public byte getTbw04_crf_input_level_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_crf_input_level_N ;
   }

   public void setTbw04_crf_input_level_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_crf_input_level_N = value ;
   }

   public byte getTbw04_lock_flg_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_flg_N ;
   }

   public void setTbw04_lock_flg_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_flg_N = value ;
   }

   public byte getTbw04_lock_datetime_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_N ;
   }

   public void setTbw04_lock_datetime_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_N = value ;
   }

   public byte getTbw04_lock_user_id_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_N ;
   }

   public void setTbw04_lock_user_id_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_N = value ;
   }

   public byte getTbw04_lock_auth_cd_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_N ;
   }

   public void setTbw04_lock_auth_cd_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_N = value ;
   }

   public byte getTbw04_upload_datetime_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_N ;
   }

   public void setTbw04_upload_datetime_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_N = value ;
   }

   public byte getTbw04_upload_user_id_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_N ;
   }

   public void setTbw04_upload_user_id_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_N = value ;
   }

   public byte getTbw04_upload_auth_cd_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_N ;
   }

   public void setTbw04_upload_auth_cd_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_N = value ;
   }

   public byte getTbw04_dm_arrival_flg_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_N ;
   }

   public void setTbw04_dm_arrival_flg_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_N = value ;
   }

   public byte getTbw04_dm_arrival_datetime_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_N ;
   }

   public void setTbw04_dm_arrival_datetime_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_N = value ;
   }

   public byte getTbw04_approval_flg_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_flg_N ;
   }

   public void setTbw04_approval_flg_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_flg_N = value ;
   }

   public byte getTbw04_approval_datetime_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_N ;
   }

   public void setTbw04_approval_datetime_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_N = value ;
   }

   public byte getTbw04_approval_user_id_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_N ;
   }

   public void setTbw04_approval_user_id_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_N = value ;
   }

   public byte getTbw04_approval_auth_cd_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_N ;
   }

   public void setTbw04_approval_auth_cd_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_N = value ;
   }

   public byte getTbw04_input_end_flg_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_N ;
   }

   public void setTbw04_input_end_flg_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_N = value ;
   }

   public byte getTbw04_input_end_datetime_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_N ;
   }

   public void setTbw04_input_end_datetime_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_N = value ;
   }

   public byte getTbw04_input_end_user_id_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_N ;
   }

   public void setTbw04_input_end_user_id_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_N = value ;
   }

   public byte getTbw04_input_end_auth_cd_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_N ;
   }

   public void setTbw04_input_end_auth_cd_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_N = value ;
   }

   public byte getTbw04_completion_flg_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_completion_flg_N ;
   }

   public void setTbw04_completion_flg_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_completion_flg_N = value ;
   }

   public byte getTbw04_edit_flg_N( )
   {
      return gxTv_SdtTBW04_CRF_Tbw04_edit_flg_N ;
   }

   public void setTbw04_edit_flg_N( byte value )
   {
      gxTv_SdtTBW04_CRF_Tbw04_edit_flg_N = value ;
   }

   protected byte gxTv_SdtTBW04_CRF_Tbw04_crf_input_level ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_crf_input_level_Z ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_crf_input_level_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_lock_flg_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_approval_flg_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_completion_flg_N ;
   protected byte gxTv_SdtTBW04_CRF_Tbw04_edit_flg_N ;
   protected short gxTv_SdtTBW04_CRF_Tbw04_crf_id ;
   protected short gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version ;
   protected short gxTv_SdtTBW04_CRF_Initialized ;
   protected short gxTv_SdtTBW04_CRF_Tbw04_crf_id_Z ;
   protected short gxTv_SdtTBW04_CRF_Tbw04_crf_latest_version_Z ;
   protected int gxTv_SdtTBW04_CRF_Tbw04_subject_id ;
   protected int gxTv_SdtTBW04_CRF_Tbw04_subject_id_Z ;
   protected long gxTv_SdtTBW04_CRF_Tbw04_study_id ;
   protected long gxTv_SdtTBW04_CRF_Tbw04_study_id_Z ;
   protected String gxTv_SdtTBW04_CRF_Mode ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_session_id ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_app_id ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_disp_datetime ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_lock_flg ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_lock_user_id ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_upload_user_id ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_approval_flg ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_approval_user_id ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_input_end_flg ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_completion_flg ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_edit_flg ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_session_id_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_app_id_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_disp_datetime_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_lock_flg_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_lock_user_id_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_lock_auth_cd_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_upload_user_id_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_upload_auth_cd_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_flg_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_approval_flg_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_approval_user_id_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_approval_auth_cd_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_input_end_flg_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_input_end_user_id_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_input_end_auth_cd_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_completion_flg_Z ;
   protected String gxTv_SdtTBW04_CRF_Tbw04_edit_flg_Z ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_lock_datetime ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_upload_datetime ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_approval_datetime ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_lock_datetime_Z ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_upload_datetime_Z ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_dm_arrival_datetime_Z ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_approval_datetime_Z ;
   protected java.util.Date gxTv_SdtTBW04_CRF_Tbw04_input_end_datetime_Z ;
}

