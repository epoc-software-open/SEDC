/*
               File: StructSdtTBM44_CRF_VISIT
        Description: CRF-VISITî‘çÜëŒâûÉ}ÉXÉ^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:42.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM44_CRF_VISIT implements Cloneable, java.io.Serializable
{
   public StructSdtTBM44_CRF_VISIT( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Mode = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_Z = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_Z = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_Z = "" ;
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_Z = "" ;
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

   public long getTbm44_study_id( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id ;
   }

   public void setTbm44_study_id( long value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id = value ;
   }

   public short getTbm44_crf_id( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id ;
   }

   public void setTbm44_crf_id( short value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id = value ;
   }

   public byte getTbm44_crf_eda_no( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no ;
   }

   public void setTbm44_crf_eda_no( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no = value ;
   }

   public int getTbm44_visit_no( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no ;
   }

   public void setTbm44_visit_no( int value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no = value ;
   }

   public String getTbm44_del_flg( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg ;
   }

   public void setTbm44_del_flg( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg = value ;
   }

   public java.util.Date getTbm44_crt_datetime( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime ;
   }

   public void setTbm44_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime = value ;
   }

   public String getTbm44_crt_user_id( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id ;
   }

   public void setTbm44_crt_user_id( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id = value ;
   }

   public String getTbm44_crt_prog_nm( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm ;
   }

   public void setTbm44_crt_prog_nm( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm = value ;
   }

   public java.util.Date getTbm44_upd_datetime( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime ;
   }

   public void setTbm44_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime = value ;
   }

   public String getTbm44_upd_user_id( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id ;
   }

   public void setTbm44_upd_user_id( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id = value ;
   }

   public String getTbm44_upd_prog_nm( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm ;
   }

   public void setTbm44_upd_prog_nm( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm = value ;
   }

   public long getTbm44_upd_cnt( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt ;
   }

   public void setTbm44_upd_cnt( long value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Initialized = value ;
   }

   public long getTbm44_study_id_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id_Z ;
   }

   public void setTbm44_study_id_Z( long value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id_Z = value ;
   }

   public short getTbm44_crf_id_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id_Z ;
   }

   public void setTbm44_crf_id_Z( short value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id_Z = value ;
   }

   public byte getTbm44_crf_eda_no_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no_Z ;
   }

   public void setTbm44_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no_Z = value ;
   }

   public int getTbm44_visit_no_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_Z ;
   }

   public void setTbm44_visit_no_Z( int value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_Z = value ;
   }

   public String getTbm44_del_flg_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_Z ;
   }

   public void setTbm44_del_flg_Z( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_Z = value ;
   }

   public java.util.Date getTbm44_crt_datetime_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_Z ;
   }

   public void setTbm44_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_Z = value ;
   }

   public String getTbm44_crt_user_id_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_Z ;
   }

   public void setTbm44_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_Z = value ;
   }

   public String getTbm44_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_Z ;
   }

   public void setTbm44_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm44_upd_datetime_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_Z ;
   }

   public void setTbm44_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_Z = value ;
   }

   public String getTbm44_upd_user_id_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_Z ;
   }

   public void setTbm44_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_Z = value ;
   }

   public String getTbm44_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_Z ;
   }

   public void setTbm44_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_Z = value ;
   }

   public long getTbm44_upd_cnt_Z( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_Z ;
   }

   public void setTbm44_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_Z = value ;
   }

   public byte getTbm44_visit_no_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_N ;
   }

   public void setTbm44_visit_no_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_N = value ;
   }

   public byte getTbm44_del_flg_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_N ;
   }

   public void setTbm44_del_flg_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_N = value ;
   }

   public byte getTbm44_crt_datetime_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_N ;
   }

   public void setTbm44_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_N = value ;
   }

   public byte getTbm44_crt_user_id_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_N ;
   }

   public void setTbm44_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_N = value ;
   }

   public byte getTbm44_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_N ;
   }

   public void setTbm44_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_N = value ;
   }

   public byte getTbm44_upd_datetime_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_N ;
   }

   public void setTbm44_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_N = value ;
   }

   public byte getTbm44_upd_user_id_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_N ;
   }

   public void setTbm44_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_N = value ;
   }

   public byte getTbm44_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_N ;
   }

   public void setTbm44_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_N = value ;
   }

   public byte getTbm44_upd_cnt_N( )
   {
      return gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_N ;
   }

   public void setTbm44_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no_Z ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_N ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_N ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_N ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_N ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_N ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_N ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_N ;
   protected short gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id ;
   protected short gxTv_SdtTBM44_CRF_VISIT_Initialized ;
   protected short gxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id_Z ;
   protected int gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no ;
   protected int gxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no_Z ;
   protected long gxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id ;
   protected long gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt ;
   protected long gxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id_Z ;
   protected long gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_cnt_Z ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Mode ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg_Z ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_user_id_Z ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_user_id_Z ;
   protected String gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_datetime_Z ;
}

