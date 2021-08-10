/*
               File: StructSdtTBT14_CRF_MEMO
        Description: CRFÉÅÉÇÉeÅ[ÉuÉã
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:18.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBT14_CRF_MEMO implements Cloneable, java.io.Serializable
{
   public StructSdtTBT14_CRF_MEMO( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime = cal.getTime() ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime = cal.getTime() ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Mode = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z = "" ;
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

   public long getTbt14_study_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id ;
   }

   public void setTbt14_study_id( long value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id = value ;
   }

   public int getTbt14_subject_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id ;
   }

   public void setTbt14_subject_id( int value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id = value ;
   }

   public short getTbt14_memo_no( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no ;
   }

   public void setTbt14_memo_no( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no = value ;
   }

   public short getTbt14_crf_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id ;
   }

   public void setTbt14_crf_id( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id = value ;
   }

   public byte getTbt14_crf_eda_no( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no ;
   }

   public void setTbt14_crf_eda_no( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no = value ;
   }

   public short getTbt14_crf_version( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version ;
   }

   public void setTbt14_crf_version( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version = value ;
   }

   public String getTbt14_memo_kbn( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn ;
   }

   public void setTbt14_memo_kbn( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn = value ;
   }

   public String getTbt14_memo( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo ;
   }

   public void setTbt14_memo( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo = value ;
   }

   public String getTbt14_request_site_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id ;
   }

   public void setTbt14_request_site_id( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id = value ;
   }

   public String getTbt14_request_auth_cd( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd ;
   }

   public void setTbt14_request_auth_cd( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd = value ;
   }

   public String getTbt14_crt_auth_cd( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd ;
   }

   public void setTbt14_crt_auth_cd( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd = value ;
   }

   public String getTbt14_kakunin_flg( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg ;
   }

   public void setTbt14_kakunin_flg( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg = value ;
   }

   public String getTbt14_kakunin_user_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id ;
   }

   public void setTbt14_kakunin_user_id( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id = value ;
   }

   public String getTbt14_kakunin_comment( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment ;
   }

   public void setTbt14_kakunin_comment( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment = value ;
   }

   public String getTbt14_kanryo_flg( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg ;
   }

   public void setTbt14_kanryo_flg( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg = value ;
   }

   public String getTbt14_del_flg( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg ;
   }

   public void setTbt14_del_flg( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg = value ;
   }

   public java.util.Date getTbt14_crt_datetime( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime ;
   }

   public void setTbt14_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime = value ;
   }

   public String getTbt14_crt_user_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id ;
   }

   public void setTbt14_crt_user_id( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id = value ;
   }

   public String getTbt14_crt_prog_nm( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm ;
   }

   public void setTbt14_crt_prog_nm( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm = value ;
   }

   public java.util.Date getTbt14_upd_datetime( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime ;
   }

   public void setTbt14_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime = value ;
   }

   public String getTbt14_upd_user_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id ;
   }

   public void setTbt14_upd_user_id( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id = value ;
   }

   public String getTbt14_upd_prog_nm( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm ;
   }

   public void setTbt14_upd_prog_nm( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm = value ;
   }

   public long getTbt14_upd_cnt( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt ;
   }

   public void setTbt14_upd_cnt( long value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Initialized = value ;
   }

   public long getTbt14_study_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z ;
   }

   public void setTbt14_study_id_Z( long value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z = value ;
   }

   public int getTbt14_subject_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z ;
   }

   public void setTbt14_subject_id_Z( int value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z = value ;
   }

   public short getTbt14_memo_no_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z ;
   }

   public void setTbt14_memo_no_Z( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z = value ;
   }

   public short getTbt14_crf_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z ;
   }

   public void setTbt14_crf_id_Z( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z = value ;
   }

   public byte getTbt14_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z ;
   }

   public void setTbt14_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z = value ;
   }

   public short getTbt14_crf_version_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z ;
   }

   public void setTbt14_crf_version_Z( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z = value ;
   }

   public String getTbt14_memo_kbn_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z ;
   }

   public void setTbt14_memo_kbn_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z = value ;
   }

   public String getTbt14_memo_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z ;
   }

   public void setTbt14_memo_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z = value ;
   }

   public String getTbt14_request_site_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z ;
   }

   public void setTbt14_request_site_id_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z = value ;
   }

   public String getTbt14_request_auth_cd_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z ;
   }

   public void setTbt14_request_auth_cd_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z = value ;
   }

   public String getTbt14_crt_auth_cd_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z ;
   }

   public void setTbt14_crt_auth_cd_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z = value ;
   }

   public String getTbt14_kakunin_flg_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z ;
   }

   public void setTbt14_kakunin_flg_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z = value ;
   }

   public String getTbt14_kakunin_user_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z ;
   }

   public void setTbt14_kakunin_user_id_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z = value ;
   }

   public String getTbt14_kakunin_comment_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z ;
   }

   public void setTbt14_kakunin_comment_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z = value ;
   }

   public String getTbt14_kanryo_flg_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z ;
   }

   public void setTbt14_kanryo_flg_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z = value ;
   }

   public String getTbt14_del_flg_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z ;
   }

   public void setTbt14_del_flg_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z = value ;
   }

   public java.util.Date getTbt14_crt_datetime_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z ;
   }

   public void setTbt14_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z = value ;
   }

   public String getTbt14_crt_user_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z ;
   }

   public void setTbt14_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z = value ;
   }

   public String getTbt14_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z ;
   }

   public void setTbt14_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbt14_upd_datetime_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z ;
   }

   public void setTbt14_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z = value ;
   }

   public String getTbt14_upd_user_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z ;
   }

   public void setTbt14_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z = value ;
   }

   public String getTbt14_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z ;
   }

   public void setTbt14_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z = value ;
   }

   public long getTbt14_upd_cnt_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z ;
   }

   public void setTbt14_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z = value ;
   }

   public byte getTbt14_crf_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N ;
   }

   public void setTbt14_crf_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N = value ;
   }

   public byte getTbt14_crf_eda_no_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N ;
   }

   public void setTbt14_crf_eda_no_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N = value ;
   }

   public byte getTbt14_crf_version_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N ;
   }

   public void setTbt14_crf_version_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N = value ;
   }

   public byte getTbt14_memo_kbn_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N ;
   }

   public void setTbt14_memo_kbn_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N = value ;
   }

   public byte getTbt14_memo_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N ;
   }

   public void setTbt14_memo_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N = value ;
   }

   public byte getTbt14_request_site_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N ;
   }

   public void setTbt14_request_site_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N = value ;
   }

   public byte getTbt14_request_auth_cd_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N ;
   }

   public void setTbt14_request_auth_cd_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N = value ;
   }

   public byte getTbt14_crt_auth_cd_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N ;
   }

   public void setTbt14_crt_auth_cd_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N = value ;
   }

   public byte getTbt14_kakunin_flg_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N ;
   }

   public void setTbt14_kakunin_flg_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N = value ;
   }

   public byte getTbt14_kakunin_user_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N ;
   }

   public void setTbt14_kakunin_user_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N = value ;
   }

   public byte getTbt14_kakunin_comment_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N ;
   }

   public void setTbt14_kakunin_comment_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N = value ;
   }

   public byte getTbt14_kanryo_flg_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N ;
   }

   public void setTbt14_kanryo_flg_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N = value ;
   }

   public byte getTbt14_del_flg_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N ;
   }

   public void setTbt14_del_flg_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N = value ;
   }

   public byte getTbt14_crt_datetime_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N ;
   }

   public void setTbt14_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N = value ;
   }

   public byte getTbt14_crt_user_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N ;
   }

   public void setTbt14_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N = value ;
   }

   public byte getTbt14_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N ;
   }

   public void setTbt14_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N = value ;
   }

   public byte getTbt14_upd_datetime_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N ;
   }

   public void setTbt14_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N = value ;
   }

   public byte getTbt14_upd_user_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N ;
   }

   public void setTbt14_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N = value ;
   }

   public byte getTbt14_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N ;
   }

   public void setTbt14_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N = value ;
   }

   public byte getTbt14_upd_cnt_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N ;
   }

   public void setTbt14_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N ;
   protected byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N ;
   protected short gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no ;
   protected short gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id ;
   protected short gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version ;
   protected short gxTv_SdtTBT14_CRF_MEMO_Initialized ;
   protected short gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z ;
   protected short gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z ;
   protected short gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z ;
   protected int gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id ;
   protected int gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z ;
   protected long gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id ;
   protected long gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt ;
   protected long gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z ;
   protected long gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Mode ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z ;
   protected String gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime ;
   protected java.util.Date gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime ;
   protected java.util.Date gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z ;
}

