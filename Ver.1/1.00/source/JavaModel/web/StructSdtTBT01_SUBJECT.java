import com.genexus.*;

public final  class StructSdtTBT01_SUBJECT implements Cloneable, java.io.Serializable
{
   public StructSdtTBT01_SUBJECT( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_site_id = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime = cal.getTime() ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime = cal.getTime() ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm = "" ;
      gxTv_SdtTBT01_SUBJECT_Mode = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_Z = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_site_id_Z = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_Z = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_Z = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_Z = "" ;
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_Z = "" ;
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

   public long getTbt01_study_id( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_study_id ;
   }

   public void setTbt01_study_id( long value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_study_id = value ;
   }

   public int getTbt01_subject_id( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_subject_id ;
   }

   public void setTbt01_subject_id( int value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_subject_id = value ;
   }

   public String getTbt01_outer_subject_id( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id ;
   }

   public void setTbt01_outer_subject_id( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id = value ;
   }

   public String getTbt01_site_id( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_site_id ;
   }

   public void setTbt01_site_id( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_site_id = value ;
   }

   public String getTbt01_del_flg( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg ;
   }

   public void setTbt01_del_flg( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg = value ;
   }

   public java.util.Date getTbt01_crt_datetime( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime ;
   }

   public void setTbt01_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime = value ;
   }

   public String getTbt01_crt_user_id( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id ;
   }

   public void setTbt01_crt_user_id( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id = value ;
   }

   public String getTbt01_crt_prog_nm( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm ;
   }

   public void setTbt01_crt_prog_nm( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm = value ;
   }

   public java.util.Date getTbt01_upd_datetime( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime ;
   }

   public void setTbt01_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime = value ;
   }

   public String getTbt01_upd_user_id( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id ;
   }

   public void setTbt01_upd_user_id( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id = value ;
   }

   public String getTbt01_upd_prog_nm( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm ;
   }

   public void setTbt01_upd_prog_nm( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm = value ;
   }

   public long getTbt01_upd_cnt( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt ;
   }

   public void setTbt01_upd_cnt( long value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBT01_SUBJECT_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBT01_SUBJECT_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBT01_SUBJECT_Initialized = value ;
   }

   public long getTbt01_study_id_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_study_id_Z ;
   }

   public void setTbt01_study_id_Z( long value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_study_id_Z = value ;
   }

   public int getTbt01_subject_id_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_subject_id_Z ;
   }

   public void setTbt01_subject_id_Z( int value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_subject_id_Z = value ;
   }

   public String getTbt01_outer_subject_id_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_Z ;
   }

   public void setTbt01_outer_subject_id_Z( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_Z = value ;
   }

   public String getTbt01_site_id_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_site_id_Z ;
   }

   public void setTbt01_site_id_Z( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_site_id_Z = value ;
   }

   public String getTbt01_del_flg_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_Z ;
   }

   public void setTbt01_del_flg_Z( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_Z = value ;
   }

   public java.util.Date getTbt01_crt_datetime_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_Z ;
   }

   public void setTbt01_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_Z = value ;
   }

   public String getTbt01_crt_user_id_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_Z ;
   }

   public void setTbt01_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_Z = value ;
   }

   public String getTbt01_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_Z ;
   }

   public void setTbt01_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbt01_upd_datetime_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_Z ;
   }

   public void setTbt01_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_Z = value ;
   }

   public String getTbt01_upd_user_id_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_Z ;
   }

   public void setTbt01_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_Z = value ;
   }

   public String getTbt01_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_Z ;
   }

   public void setTbt01_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_Z = value ;
   }

   public long getTbt01_upd_cnt_Z( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_Z ;
   }

   public void setTbt01_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_Z = value ;
   }

   public byte getTbt01_outer_subject_id_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_N ;
   }

   public void setTbt01_outer_subject_id_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_N = value ;
   }

   public byte getTbt01_site_id_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_site_id_N ;
   }

   public void setTbt01_site_id_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_site_id_N = value ;
   }

   public byte getTbt01_del_flg_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_N ;
   }

   public void setTbt01_del_flg_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_N = value ;
   }

   public byte getTbt01_crt_datetime_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_N ;
   }

   public void setTbt01_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_N = value ;
   }

   public byte getTbt01_crt_user_id_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_N ;
   }

   public void setTbt01_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_N = value ;
   }

   public byte getTbt01_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_N ;
   }

   public void setTbt01_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_N = value ;
   }

   public byte getTbt01_upd_datetime_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_N ;
   }

   public void setTbt01_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_N = value ;
   }

   public byte getTbt01_upd_user_id_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_N ;
   }

   public void setTbt01_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_N = value ;
   }

   public byte getTbt01_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_N ;
   }

   public void setTbt01_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_N = value ;
   }

   public byte getTbt01_upd_cnt_N( )
   {
      return gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_N ;
   }

   public void setTbt01_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_site_id_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_N ;
   protected byte gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_N ;
   protected short gxTv_SdtTBT01_SUBJECT_Initialized ;
   protected int gxTv_SdtTBT01_SUBJECT_Tbt01_subject_id ;
   protected int gxTv_SdtTBT01_SUBJECT_Tbt01_subject_id_Z ;
   protected long gxTv_SdtTBT01_SUBJECT_Tbt01_study_id ;
   protected long gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt ;
   protected long gxTv_SdtTBT01_SUBJECT_Tbt01_study_id_Z ;
   protected long gxTv_SdtTBT01_SUBJECT_Tbt01_upd_cnt_Z ;
   protected String gxTv_SdtTBT01_SUBJECT_Mode ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_site_id ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id_Z ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_site_id_Z ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_del_flg_Z ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_crt_user_id_Z ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm_Z ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_upd_user_id_Z ;
   protected String gxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime ;
   protected java.util.Date gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime ;
   protected java.util.Date gxTv_SdtTBT01_SUBJECT_Tbt01_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT01_SUBJECT_Tbt01_upd_datetime_Z ;
}

