/*
               File: StructSdtTBW06_CRF_MEMO
        Description: CRFÉÅÉÇÉeÅ[ÉuÉã
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:55.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBW06_CRF_MEMO implements Cloneable, java.io.Serializable
{
   public StructSdtTBW06_CRF_MEMO( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime = cal.getTime() ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Mode = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z = cal.getTime() ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z = "" ;
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

   public String getTbw06_session_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id ;
   }

   public void setTbw06_session_id( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id = value ;
   }

   public String getTbw06_app_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id ;
   }

   public void setTbw06_app_id( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id = value ;
   }

   public String getTbw06_disp_datetime( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime ;
   }

   public void setTbw06_disp_datetime( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime = value ;
   }

   public long getTbw06_study_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id ;
   }

   public void setTbw06_study_id( long value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id = value ;
   }

   public int getTbw06_subject_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id ;
   }

   public void setTbw06_subject_id( int value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id = value ;
   }

   public short getTbw06_ins_no( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no ;
   }

   public void setTbw06_ins_no( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no = value ;
   }

   public short getTbw06_crf_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id ;
   }

   public void setTbw06_crf_id( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id = value ;
   }

   public short getTbw06_crf_version( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version ;
   }

   public void setTbw06_crf_version( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version = value ;
   }

   public String getTbw06_memo( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo ;
   }

   public void setTbw06_memo( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo = value ;
   }

   public String getTbw06_stydy_auth_cd( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd ;
   }

   public void setTbw06_stydy_auth_cd( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd = value ;
   }

   public String getTbw06_request_user_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id ;
   }

   public void setTbw06_request_user_id( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id = value ;
   }

   public String getTbw06_edit_request_flg( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg ;
   }

   public void setTbw06_edit_request_flg( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg = value ;
   }

   public String getTbw06_edit_request_end_flg( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg ;
   }

   public void setTbw06_edit_request_end_flg( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg = value ;
   }

   public java.util.Date getTbw06_edit_req_end_datetime( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime ;
   }

   public void setTbw06_edit_req_end_datetime( java.util.Date value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime = value ;
   }

   public String getTbw06_edit_request_end_user_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id ;
   }

   public void setTbw06_edit_request_end_user_id( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id = value ;
   }

   public String getTbw06_proc_div( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div ;
   }

   public void setTbw06_proc_div( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Initialized = value ;
   }

   public String getTbw06_session_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z ;
   }

   public void setTbw06_session_id_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z = value ;
   }

   public String getTbw06_app_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z ;
   }

   public void setTbw06_app_id_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z = value ;
   }

   public String getTbw06_disp_datetime_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z ;
   }

   public void setTbw06_disp_datetime_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z = value ;
   }

   public long getTbw06_study_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z ;
   }

   public void setTbw06_study_id_Z( long value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z = value ;
   }

   public int getTbw06_subject_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z ;
   }

   public void setTbw06_subject_id_Z( int value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z = value ;
   }

   public short getTbw06_ins_no_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z ;
   }

   public void setTbw06_ins_no_Z( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z = value ;
   }

   public short getTbw06_crf_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z ;
   }

   public void setTbw06_crf_id_Z( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z = value ;
   }

   public short getTbw06_crf_version_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z ;
   }

   public void setTbw06_crf_version_Z( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z = value ;
   }

   public String getTbw06_memo_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z ;
   }

   public void setTbw06_memo_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z = value ;
   }

   public String getTbw06_stydy_auth_cd_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z ;
   }

   public void setTbw06_stydy_auth_cd_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z = value ;
   }

   public String getTbw06_request_user_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z ;
   }

   public void setTbw06_request_user_id_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z = value ;
   }

   public String getTbw06_edit_request_flg_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z ;
   }

   public void setTbw06_edit_request_flg_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z = value ;
   }

   public String getTbw06_edit_request_end_flg_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z ;
   }

   public void setTbw06_edit_request_end_flg_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z = value ;
   }

   public java.util.Date getTbw06_edit_req_end_datetime_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z ;
   }

   public void setTbw06_edit_req_end_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z = value ;
   }

   public String getTbw06_edit_request_end_user_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z ;
   }

   public void setTbw06_edit_request_end_user_id_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z = value ;
   }

   public String getTbw06_proc_div_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z ;
   }

   public void setTbw06_proc_div_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z = value ;
   }

   public byte getTbw06_crf_id_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N ;
   }

   public void setTbw06_crf_id_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N = value ;
   }

   public byte getTbw06_crf_version_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N ;
   }

   public void setTbw06_crf_version_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N = value ;
   }

   public byte getTbw06_memo_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N ;
   }

   public void setTbw06_memo_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N = value ;
   }

   public byte getTbw06_stydy_auth_cd_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N ;
   }

   public void setTbw06_stydy_auth_cd_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N = value ;
   }

   public byte getTbw06_request_user_id_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N ;
   }

   public void setTbw06_request_user_id_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N = value ;
   }

   public byte getTbw06_edit_request_flg_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N ;
   }

   public void setTbw06_edit_request_flg_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N = value ;
   }

   public byte getTbw06_edit_request_end_flg_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N ;
   }

   public void setTbw06_edit_request_end_flg_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N = value ;
   }

   public byte getTbw06_edit_req_end_datetime_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N ;
   }

   public void setTbw06_edit_req_end_datetime_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N = value ;
   }

   public byte getTbw06_edit_request_end_user_id_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N ;
   }

   public void setTbw06_edit_request_end_user_id_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N = value ;
   }

   public byte getTbw06_proc_div_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N ;
   }

   public void setTbw06_proc_div_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N = value ;
   }

   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N ;
   protected byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N ;
   protected short gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no ;
   protected short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id ;
   protected short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version ;
   protected short gxTv_SdtTBW06_CRF_MEMO_Initialized ;
   protected short gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z ;
   protected short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z ;
   protected short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z ;
   protected int gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id ;
   protected int gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z ;
   protected long gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id ;
   protected long gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Mode ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z ;
   protected String gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z ;
   protected java.util.Date gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime ;
   protected java.util.Date gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z ;
}

