import com.genexus.*;

public final  class StructSdtTBM22_STUDY_SITE implements Cloneable, java.io.Serializable
{
   public StructSdtTBM22_STUDY_SITE( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Mode = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z = "" ;
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

   public long getTbm22_study_id( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id ;
   }

   public void setTbm22_study_id( long value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id = value ;
   }

   public String getTbm22_site_id( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id ;
   }

   public void setTbm22_site_id( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id = value ;
   }

   public String getTbm22_del_flg( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg ;
   }

   public void setTbm22_del_flg( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg = value ;
   }

   public java.util.Date getTbm22_crt_datetime( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime ;
   }

   public void setTbm22_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime = value ;
   }

   public String getTbm22_crt_user_id( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id ;
   }

   public void setTbm22_crt_user_id( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id = value ;
   }

   public String getTbm22_crt_prog_nm( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm ;
   }

   public void setTbm22_crt_prog_nm( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm = value ;
   }

   public java.util.Date getTbm22_upd_datetime( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime ;
   }

   public void setTbm22_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime = value ;
   }

   public String getTbm22_upd_user_id( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id ;
   }

   public void setTbm22_upd_user_id( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id = value ;
   }

   public String getTbm22_upd_prog_nm( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm ;
   }

   public void setTbm22_upd_prog_nm( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm = value ;
   }

   public long getTbm22_upd_cnt( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt ;
   }

   public void setTbm22_upd_cnt( long value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Initialized = value ;
   }

   public long getTbm22_study_id_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z ;
   }

   public void setTbm22_study_id_Z( long value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z = value ;
   }

   public String getTbm22_site_id_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z ;
   }

   public void setTbm22_site_id_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z = value ;
   }

   public String getTbm22_del_flg_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z ;
   }

   public void setTbm22_del_flg_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z = value ;
   }

   public java.util.Date getTbm22_crt_datetime_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z ;
   }

   public void setTbm22_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z = value ;
   }

   public String getTbm22_crt_user_id_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z ;
   }

   public void setTbm22_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z = value ;
   }

   public String getTbm22_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z ;
   }

   public void setTbm22_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm22_upd_datetime_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z ;
   }

   public void setTbm22_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z = value ;
   }

   public String getTbm22_upd_user_id_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z ;
   }

   public void setTbm22_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z = value ;
   }

   public String getTbm22_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z ;
   }

   public void setTbm22_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z = value ;
   }

   public long getTbm22_upd_cnt_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z ;
   }

   public void setTbm22_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z = value ;
   }

   public byte getTbm22_del_flg_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N ;
   }

   public void setTbm22_del_flg_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N = value ;
   }

   public byte getTbm22_crt_datetime_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N ;
   }

   public void setTbm22_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N = value ;
   }

   public byte getTbm22_crt_user_id_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N ;
   }

   public void setTbm22_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N = value ;
   }

   public byte getTbm22_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N ;
   }

   public void setTbm22_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N = value ;
   }

   public byte getTbm22_upd_datetime_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N ;
   }

   public void setTbm22_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N = value ;
   }

   public byte getTbm22_upd_user_id_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N ;
   }

   public void setTbm22_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N = value ;
   }

   public byte getTbm22_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N ;
   }

   public void setTbm22_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N = value ;
   }

   public byte getTbm22_upd_cnt_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N ;
   }

   public void setTbm22_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N ;
   protected byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N ;
   protected byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N ;
   protected byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N ;
   protected byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N ;
   protected byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N ;
   protected short gxTv_SdtTBM22_STUDY_SITE_Initialized ;
   protected long gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id ;
   protected long gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt ;
   protected long gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z ;
   protected long gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Mode ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z ;
   protected String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z ;
}

