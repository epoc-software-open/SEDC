/*
               File: StructSdtTBM31_CRF
        Description: CRFÉ}ÉXÉ^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:39.74
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM31_CRF implements Cloneable, java.io.Serializable
{
   public StructSdtTBM31_CRF( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_status = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_note = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_del_flg = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm = "" ;
      gxTv_SdtTBM31_CRF_Mode = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_status_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_note_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z = "" ;
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

   public long getTbm31_study_id( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_study_id ;
   }

   public void setTbm31_study_id( long value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_study_id = value ;
   }

   public short getTbm31_crf_id( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_id ;
   }

   public void setTbm31_crf_id( short value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_id = value ;
   }

   public String getTbm31_crf_nm( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_nm ;
   }

   public void setTbm31_crf_nm( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm = value ;
   }

   public String getTbm31_crf_snm( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_snm ;
   }

   public void setTbm31_crf_snm( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm = value ;
   }

   public short getTbm31_grid_size( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_grid_size ;
   }

   public void setTbm31_grid_size( short value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size = value ;
   }

   public int getTbm31_order( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_order ;
   }

   public void setTbm31_order( int value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order = value ;
   }

   public int getTbm31_def_visit_no( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_visit_no ;
   }

   public void setTbm31_def_visit_no( int value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no = value ;
   }

   public String getTbm31_def_domain_cd( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd ;
   }

   public void setTbm31_def_domain_cd( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd = value ;
   }

   public String getTbm31_status( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_status ;
   }

   public void setTbm31_status( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status = value ;
   }

   public String getTbm31_note( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_note ;
   }

   public void setTbm31_note( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note = value ;
   }

   public byte getTbm31_repeat_flg( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_flg ;
   }

   public void setTbm31_repeat_flg( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg = value ;
   }

   public byte getTbm31_repeat_max( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_max ;
   }

   public void setTbm31_repeat_max( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max = value ;
   }

   public String getTbm31_del_flg( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_del_flg ;
   }

   public void setTbm31_del_flg( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg = value ;
   }

   public java.util.Date getTbm31_crt_datetime( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_datetime ;
   }

   public void setTbm31_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime = value ;
   }

   public String getTbm31_crt_user_id( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_user_id ;
   }

   public void setTbm31_crt_user_id( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id = value ;
   }

   public String getTbm31_crt_prog_nm( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm ;
   }

   public void setTbm31_crt_prog_nm( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm = value ;
   }

   public java.util.Date getTbm31_upd_datetime( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_datetime ;
   }

   public void setTbm31_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime = value ;
   }

   public String getTbm31_upd_user_id( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_user_id ;
   }

   public void setTbm31_upd_user_id( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id = value ;
   }

   public String getTbm31_upd_prog_nm( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm ;
   }

   public void setTbm31_upd_prog_nm( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm = value ;
   }

   public long getTbm31_upd_cnt( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_cnt ;
   }

   public void setTbm31_upd_cnt( long value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM31_CRF_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM31_CRF_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM31_CRF_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM31_CRF_Initialized = value ;
   }

   public long getTbm31_study_id_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_study_id_Z ;
   }

   public void setTbm31_study_id_Z( long value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_study_id_Z = value ;
   }

   public short getTbm31_crf_id_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z ;
   }

   public void setTbm31_crf_id_Z( short value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z = value ;
   }

   public String getTbm31_crf_nm_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z ;
   }

   public void setTbm31_crf_nm_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z = value ;
   }

   public String getTbm31_crf_snm_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z ;
   }

   public void setTbm31_crf_snm_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z = value ;
   }

   public short getTbm31_grid_size_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z ;
   }

   public void setTbm31_grid_size_Z( short value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z = value ;
   }

   public int getTbm31_order_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_order_Z ;
   }

   public void setTbm31_order_Z( int value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order_Z = value ;
   }

   public int getTbm31_def_visit_no_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z ;
   }

   public void setTbm31_def_visit_no_Z( int value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z = value ;
   }

   public String getTbm31_def_domain_cd_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z ;
   }

   public void setTbm31_def_domain_cd_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z = value ;
   }

   public String getTbm31_status_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_status_Z ;
   }

   public void setTbm31_status_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status_Z = value ;
   }

   public String getTbm31_note_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_note_Z ;
   }

   public void setTbm31_note_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note_Z = value ;
   }

   public byte getTbm31_repeat_flg_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z ;
   }

   public void setTbm31_repeat_flg_Z( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z = value ;
   }

   public byte getTbm31_repeat_max_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z ;
   }

   public void setTbm31_repeat_max_Z( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z = value ;
   }

   public String getTbm31_del_flg_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z ;
   }

   public void setTbm31_del_flg_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z = value ;
   }

   public java.util.Date getTbm31_crt_datetime_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z ;
   }

   public void setTbm31_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z = value ;
   }

   public String getTbm31_crt_user_id_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z ;
   }

   public void setTbm31_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z = value ;
   }

   public String getTbm31_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z ;
   }

   public void setTbm31_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm31_upd_datetime_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z ;
   }

   public void setTbm31_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z = value ;
   }

   public String getTbm31_upd_user_id_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z ;
   }

   public void setTbm31_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z = value ;
   }

   public String getTbm31_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z ;
   }

   public void setTbm31_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z = value ;
   }

   public long getTbm31_upd_cnt_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z ;
   }

   public void setTbm31_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z = value ;
   }

   public byte getTbm31_crf_nm_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N ;
   }

   public void setTbm31_crf_nm_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N = value ;
   }

   public byte getTbm31_crf_snm_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N ;
   }

   public void setTbm31_crf_snm_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N = value ;
   }

   public byte getTbm31_grid_size_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_grid_size_N ;
   }

   public void setTbm31_grid_size_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size_N = value ;
   }

   public byte getTbm31_order_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_order_N ;
   }

   public void setTbm31_order_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order_N = value ;
   }

   public byte getTbm31_def_visit_no_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N ;
   }

   public void setTbm31_def_visit_no_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N = value ;
   }

   public byte getTbm31_def_domain_cd_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N ;
   }

   public void setTbm31_def_domain_cd_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N = value ;
   }

   public byte getTbm31_status_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_status_N ;
   }

   public void setTbm31_status_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status_N = value ;
   }

   public byte getTbm31_note_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_note_N ;
   }

   public void setTbm31_note_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note_N = value ;
   }

   public byte getTbm31_repeat_flg_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N ;
   }

   public void setTbm31_repeat_flg_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N = value ;
   }

   public byte getTbm31_repeat_max_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N ;
   }

   public void setTbm31_repeat_max_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N = value ;
   }

   public byte getTbm31_del_flg_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_del_flg_N ;
   }

   public void setTbm31_del_flg_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_N = value ;
   }

   public byte getTbm31_crt_datetime_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N ;
   }

   public void setTbm31_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N = value ;
   }

   public byte getTbm31_crt_user_id_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N ;
   }

   public void setTbm31_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N = value ;
   }

   public byte getTbm31_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N ;
   }

   public void setTbm31_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N = value ;
   }

   public byte getTbm31_upd_datetime_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N ;
   }

   public void setTbm31_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N = value ;
   }

   public byte getTbm31_upd_user_id_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N ;
   }

   public void setTbm31_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N = value ;
   }

   public byte getTbm31_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N ;
   }

   public void setTbm31_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N = value ;
   }

   public byte getTbm31_upd_cnt_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N ;
   }

   public void setTbm31_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM31_CRF_Tbm31_repeat_flg ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_repeat_max ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_grid_size_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_order_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_status_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_note_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_del_flg_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N ;
   protected short gxTv_SdtTBM31_CRF_Tbm31_crf_id ;
   protected short gxTv_SdtTBM31_CRF_Tbm31_grid_size ;
   protected short gxTv_SdtTBM31_CRF_Initialized ;
   protected short gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z ;
   protected short gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z ;
   protected int gxTv_SdtTBM31_CRF_Tbm31_order ;
   protected int gxTv_SdtTBM31_CRF_Tbm31_def_visit_no ;
   protected int gxTv_SdtTBM31_CRF_Tbm31_order_Z ;
   protected int gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z ;
   protected long gxTv_SdtTBM31_CRF_Tbm31_study_id ;
   protected long gxTv_SdtTBM31_CRF_Tbm31_upd_cnt ;
   protected long gxTv_SdtTBM31_CRF_Tbm31_study_id_Z ;
   protected long gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z ;
   protected String gxTv_SdtTBM31_CRF_Mode ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_crf_nm ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_crf_snm ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_status ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_note ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_del_flg ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_crt_user_id ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_upd_user_id ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_status_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_note_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z ;
   protected String gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM31_CRF_Tbm31_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM31_CRF_Tbm31_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z ;
}

