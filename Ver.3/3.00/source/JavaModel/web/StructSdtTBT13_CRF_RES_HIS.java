/*
               File: StructSdtTBT13_CRF_RES_HIS
        Description: CRFì¸óÕåãâ óöóÉeÅ[ÉuÉã
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:7.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBT13_CRF_RES_HIS implements Cloneable, java.io.Serializable
{
   public StructSdtTBT13_CRF_RES_HIS( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime = cal.getTime() ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime = cal.getTime() ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Mode = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z = "" ;
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

   public long getTbt13_study_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id ;
   }

   public void setTbt13_study_id( long value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id = value ;
   }

   public int getTbt13_subject_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id ;
   }

   public void setTbt13_subject_id( int value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id = value ;
   }

   public short getTbt13_crf_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id ;
   }

   public void setTbt13_crf_id( short value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id = value ;
   }

   public byte getTbt13_crf_eda_no( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no ;
   }

   public void setTbt13_crf_eda_no( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no = value ;
   }

   public short getTbt13_crf_version( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version ;
   }

   public void setTbt13_crf_version( short value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version = value ;
   }

   public String getTbt13_crf_item_grp_div( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div ;
   }

   public void setTbt13_crf_item_grp_div( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div = value ;
   }

   public String getTbt13_crf_item_grp_cd( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd ;
   }

   public void setTbt13_crf_item_grp_cd( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd = value ;
   }

   public String getTbt13_crf_value( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value ;
   }

   public void setTbt13_crf_value( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value = value ;
   }

   public String getTbt13_edit_flg( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg ;
   }

   public void setTbt13_edit_flg( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg = value ;
   }

   public String getTbt13_del_flg( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg ;
   }

   public void setTbt13_del_flg( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg = value ;
   }

   public java.util.Date getTbt13_crt_datetime( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime ;
   }

   public void setTbt13_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime = value ;
   }

   public String getTbt13_crt_user_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id ;
   }

   public void setTbt13_crt_user_id( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id = value ;
   }

   public String getTbt13_crt_prog_nm( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm ;
   }

   public void setTbt13_crt_prog_nm( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm = value ;
   }

   public java.util.Date getTbt13_upd_datetime( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime ;
   }

   public void setTbt13_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime = value ;
   }

   public String getTbt13_upd_user_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id ;
   }

   public void setTbt13_upd_user_id( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id = value ;
   }

   public String getTbt13_upd_prog_nm( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm ;
   }

   public void setTbt13_upd_prog_nm( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm = value ;
   }

   public long getTbt13_upd_cnt( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt ;
   }

   public void setTbt13_upd_cnt( long value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Initialized = value ;
   }

   public long getTbt13_study_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z ;
   }

   public void setTbt13_study_id_Z( long value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z = value ;
   }

   public int getTbt13_subject_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z ;
   }

   public void setTbt13_subject_id_Z( int value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z = value ;
   }

   public short getTbt13_crf_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z ;
   }

   public void setTbt13_crf_id_Z( short value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z = value ;
   }

   public byte getTbt13_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z ;
   }

   public void setTbt13_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z = value ;
   }

   public short getTbt13_crf_version_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z ;
   }

   public void setTbt13_crf_version_Z( short value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z = value ;
   }

   public String getTbt13_crf_item_grp_div_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z ;
   }

   public void setTbt13_crf_item_grp_div_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z = value ;
   }

   public String getTbt13_crf_item_grp_cd_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z ;
   }

   public void setTbt13_crf_item_grp_cd_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z = value ;
   }

   public String getTbt13_crf_value_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z ;
   }

   public void setTbt13_crf_value_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z = value ;
   }

   public String getTbt13_edit_flg_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z ;
   }

   public void setTbt13_edit_flg_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z = value ;
   }

   public String getTbt13_del_flg_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z ;
   }

   public void setTbt13_del_flg_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z = value ;
   }

   public java.util.Date getTbt13_crt_datetime_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z ;
   }

   public void setTbt13_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z = value ;
   }

   public String getTbt13_crt_user_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z ;
   }

   public void setTbt13_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z = value ;
   }

   public String getTbt13_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z ;
   }

   public void setTbt13_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbt13_upd_datetime_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z ;
   }

   public void setTbt13_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z = value ;
   }

   public String getTbt13_upd_user_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z ;
   }

   public void setTbt13_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z = value ;
   }

   public String getTbt13_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z ;
   }

   public void setTbt13_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z = value ;
   }

   public long getTbt13_upd_cnt_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z ;
   }

   public void setTbt13_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z = value ;
   }

   public byte getTbt13_crf_value_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N ;
   }

   public void setTbt13_crf_value_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N = value ;
   }

   public byte getTbt13_edit_flg_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N ;
   }

   public void setTbt13_edit_flg_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N = value ;
   }

   public byte getTbt13_del_flg_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N ;
   }

   public void setTbt13_del_flg_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N = value ;
   }

   public byte getTbt13_crt_datetime_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N ;
   }

   public void setTbt13_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N = value ;
   }

   public byte getTbt13_crt_user_id_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N ;
   }

   public void setTbt13_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N = value ;
   }

   public byte getTbt13_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N ;
   }

   public void setTbt13_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N = value ;
   }

   public byte getTbt13_upd_datetime_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N ;
   }

   public void setTbt13_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N = value ;
   }

   public byte getTbt13_upd_user_id_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N ;
   }

   public void setTbt13_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N = value ;
   }

   public byte getTbt13_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N ;
   }

   public void setTbt13_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N = value ;
   }

   public byte getTbt13_upd_cnt_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N ;
   }

   public void setTbt13_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N ;
   protected byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N ;
   protected short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id ;
   protected short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version ;
   protected short gxTv_SdtTBT13_CRF_RES_HIS_Initialized ;
   protected short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z ;
   protected short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z ;
   protected int gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id ;
   protected int gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z ;
   protected long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id ;
   protected long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt ;
   protected long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z ;
   protected long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Mode ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z ;
   protected String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime ;
   protected java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime ;
   protected java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z ;
}

