/*
               File: StructSdtTBT11_CRF_HISTORY
        Description: CRFèCê≥óöóÉeÅ[ÉuÉã
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:13.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBT11_CRF_HISTORY implements Cloneable, java.io.Serializable
{
   public StructSdtTBT11_CRF_HISTORY( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Mode = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z = "" ;
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

   public long getTbt11_study_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id ;
   }

   public void setTbt11_study_id( long value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id = value ;
   }

   public int getTbt11_subject_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id ;
   }

   public void setTbt11_subject_id( int value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id = value ;
   }

   public short getTbt11_crf_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id ;
   }

   public void setTbt11_crf_id( short value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id = value ;
   }

   public byte getTbt11_crf_eda_no( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no ;
   }

   public void setTbt11_crf_eda_no( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no = value ;
   }

   public short getTbt11_crf_version( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version ;
   }

   public void setTbt11_crf_version( short value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version = value ;
   }

   public byte getTbt11_crf_input_level( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level ;
   }

   public void setTbt11_crf_input_level( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level = value ;
   }

   public java.util.Date getTbt11_upload_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime ;
   }

   public void setTbt11_upload_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime = value ;
   }

   public String getTbt11_upload_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id ;
   }

   public void setTbt11_upload_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id = value ;
   }

   public String getTbt11_upload_auth_cd( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd ;
   }

   public void setTbt11_upload_auth_cd( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd = value ;
   }

   public String getTbt11_dm_arrival_flg( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg ;
   }

   public void setTbt11_dm_arrival_flg( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg = value ;
   }

   public java.util.Date getTbt11_dm_arrival_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime ;
   }

   public void setTbt11_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime = value ;
   }

   public String getTbt11_approval_flg( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg ;
   }

   public void setTbt11_approval_flg( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg = value ;
   }

   public java.util.Date getTbt11_approval_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime ;
   }

   public void setTbt11_approval_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime = value ;
   }

   public String getTbt11_approval_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id ;
   }

   public void setTbt11_approval_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id = value ;
   }

   public String getTbt11_approval_auth_cd( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd ;
   }

   public void setTbt11_approval_auth_cd( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd = value ;
   }

   public String getTbt11_input_end_flg( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg ;
   }

   public void setTbt11_input_end_flg( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg = value ;
   }

   public java.util.Date getTbt11_input_end_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime ;
   }

   public void setTbt11_input_end_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime = value ;
   }

   public String getTbt11_input_end_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id ;
   }

   public void setTbt11_input_end_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id = value ;
   }

   public String getTbt11_input_end_auth_cd( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd ;
   }

   public void setTbt11_input_end_auth_cd( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd = value ;
   }

   public String getTbt11_upd_riyu( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu ;
   }

   public void setTbt11_upd_riyu( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu = value ;
   }

   public String getTbt11_del_flg( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg ;
   }

   public void setTbt11_del_flg( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg = value ;
   }

   public java.util.Date getTbt11_crt_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime ;
   }

   public void setTbt11_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime = value ;
   }

   public String getTbt11_crt_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id ;
   }

   public void setTbt11_crt_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id = value ;
   }

   public String getTbt11_crt_prog_nm( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm ;
   }

   public void setTbt11_crt_prog_nm( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm = value ;
   }

   public java.util.Date getTbt11_upd_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime ;
   }

   public void setTbt11_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime = value ;
   }

   public String getTbt11_upd_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id ;
   }

   public void setTbt11_upd_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id = value ;
   }

   public String getTbt11_upd_prog_nm( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm ;
   }

   public void setTbt11_upd_prog_nm( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm = value ;
   }

   public long getTbt11_upd_cnt( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt ;
   }

   public void setTbt11_upd_cnt( long value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Initialized = value ;
   }

   public long getTbt11_study_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z ;
   }

   public void setTbt11_study_id_Z( long value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z = value ;
   }

   public int getTbt11_subject_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z ;
   }

   public void setTbt11_subject_id_Z( int value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z = value ;
   }

   public short getTbt11_crf_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z ;
   }

   public void setTbt11_crf_id_Z( short value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z = value ;
   }

   public byte getTbt11_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z ;
   }

   public void setTbt11_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z = value ;
   }

   public short getTbt11_crf_version_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z ;
   }

   public void setTbt11_crf_version_Z( short value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z = value ;
   }

   public byte getTbt11_crf_input_level_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z ;
   }

   public void setTbt11_crf_input_level_Z( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z = value ;
   }

   public java.util.Date getTbt11_upload_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z ;
   }

   public void setTbt11_upload_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z = value ;
   }

   public String getTbt11_upload_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z ;
   }

   public void setTbt11_upload_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z = value ;
   }

   public String getTbt11_upload_auth_cd_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z ;
   }

   public void setTbt11_upload_auth_cd_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z = value ;
   }

   public String getTbt11_dm_arrival_flg_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z ;
   }

   public void setTbt11_dm_arrival_flg_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z = value ;
   }

   public java.util.Date getTbt11_dm_arrival_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z ;
   }

   public void setTbt11_dm_arrival_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z = value ;
   }

   public String getTbt11_approval_flg_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z ;
   }

   public void setTbt11_approval_flg_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z = value ;
   }

   public java.util.Date getTbt11_approval_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z ;
   }

   public void setTbt11_approval_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z = value ;
   }

   public String getTbt11_approval_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z ;
   }

   public void setTbt11_approval_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z = value ;
   }

   public String getTbt11_approval_auth_cd_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z ;
   }

   public void setTbt11_approval_auth_cd_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z = value ;
   }

   public String getTbt11_input_end_flg_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z ;
   }

   public void setTbt11_input_end_flg_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z = value ;
   }

   public java.util.Date getTbt11_input_end_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z ;
   }

   public void setTbt11_input_end_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z = value ;
   }

   public String getTbt11_input_end_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z ;
   }

   public void setTbt11_input_end_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z = value ;
   }

   public String getTbt11_input_end_auth_cd_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z ;
   }

   public void setTbt11_input_end_auth_cd_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z = value ;
   }

   public String getTbt11_upd_riyu_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z ;
   }

   public void setTbt11_upd_riyu_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z = value ;
   }

   public String getTbt11_del_flg_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z ;
   }

   public void setTbt11_del_flg_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z = value ;
   }

   public java.util.Date getTbt11_crt_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z ;
   }

   public void setTbt11_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z = value ;
   }

   public String getTbt11_crt_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z ;
   }

   public void setTbt11_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z = value ;
   }

   public String getTbt11_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z ;
   }

   public void setTbt11_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbt11_upd_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z ;
   }

   public void setTbt11_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z = value ;
   }

   public String getTbt11_upd_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z ;
   }

   public void setTbt11_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z = value ;
   }

   public String getTbt11_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z ;
   }

   public void setTbt11_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z = value ;
   }

   public long getTbt11_upd_cnt_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z ;
   }

   public void setTbt11_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z = value ;
   }

   public byte getTbt11_crf_input_level_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N ;
   }

   public void setTbt11_crf_input_level_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N = value ;
   }

   public byte getTbt11_upload_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N ;
   }

   public void setTbt11_upload_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N = value ;
   }

   public byte getTbt11_upload_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N ;
   }

   public void setTbt11_upload_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N = value ;
   }

   public byte getTbt11_upload_auth_cd_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N ;
   }

   public void setTbt11_upload_auth_cd_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N = value ;
   }

   public byte getTbt11_dm_arrival_flg_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N ;
   }

   public void setTbt11_dm_arrival_flg_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N = value ;
   }

   public byte getTbt11_dm_arrival_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N ;
   }

   public void setTbt11_dm_arrival_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N = value ;
   }

   public byte getTbt11_approval_flg_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N ;
   }

   public void setTbt11_approval_flg_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N = value ;
   }

   public byte getTbt11_approval_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N ;
   }

   public void setTbt11_approval_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N = value ;
   }

   public byte getTbt11_approval_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N ;
   }

   public void setTbt11_approval_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N = value ;
   }

   public byte getTbt11_approval_auth_cd_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N ;
   }

   public void setTbt11_approval_auth_cd_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N = value ;
   }

   public byte getTbt11_input_end_flg_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N ;
   }

   public void setTbt11_input_end_flg_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N = value ;
   }

   public byte getTbt11_input_end_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N ;
   }

   public void setTbt11_input_end_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N = value ;
   }

   public byte getTbt11_input_end_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N ;
   }

   public void setTbt11_input_end_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N = value ;
   }

   public byte getTbt11_input_end_auth_cd_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N ;
   }

   public void setTbt11_input_end_auth_cd_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N = value ;
   }

   public byte getTbt11_upd_riyu_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N ;
   }

   public void setTbt11_upd_riyu_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N = value ;
   }

   public byte getTbt11_del_flg_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N ;
   }

   public void setTbt11_del_flg_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N = value ;
   }

   public byte getTbt11_crt_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N ;
   }

   public void setTbt11_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N = value ;
   }

   public byte getTbt11_crt_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N ;
   }

   public void setTbt11_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N = value ;
   }

   public byte getTbt11_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N ;
   }

   public void setTbt11_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N = value ;
   }

   public byte getTbt11_upd_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N ;
   }

   public void setTbt11_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N = value ;
   }

   public byte getTbt11_upd_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N ;
   }

   public void setTbt11_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N = value ;
   }

   public byte getTbt11_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N ;
   }

   public void setTbt11_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N = value ;
   }

   public byte getTbt11_upd_cnt_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N ;
   }

   public void setTbt11_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N ;
   protected byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N ;
   protected short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id ;
   protected short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version ;
   protected short gxTv_SdtTBT11_CRF_HISTORY_Initialized ;
   protected short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z ;
   protected short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z ;
   protected int gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id ;
   protected int gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z ;
   protected long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id ;
   protected long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt ;
   protected long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z ;
   protected long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Mode ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z ;
   protected String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z ;
}

