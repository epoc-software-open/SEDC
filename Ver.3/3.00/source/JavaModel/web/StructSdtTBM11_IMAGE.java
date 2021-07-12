/*
               File: StructSdtTBM11_IMAGE
        Description: ‰æ‘œƒ}ƒXƒ^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:27.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM11_IMAGE implements Cloneable, java.io.Serializable
{
   public StructSdtTBM11_IMAGE( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM11_IMAGE_Tbm11_image_cd = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_image_nm = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_image = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_file_name = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_del_flg = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm = "" ;
      gxTv_SdtTBM11_IMAGE_Mode = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_image_cd_Z = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_image_nm_Z = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_file_name_Z = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_del_flg_Z = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_Z = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_Z = "" ;
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_Z = "" ;
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

   public String getTbm11_image_cd( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_image_cd ;
   }

   public void setTbm11_image_cd( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_image_cd = value ;
   }

   public String getTbm11_image_nm( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_image_nm ;
   }

   public void setTbm11_image_nm( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_image_nm = value ;
   }

   public String getTbm11_image( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_image ;
   }

   public void setTbm11_image( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_image = value ;
   }

   public String getTbm11_file_name( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_file_name ;
   }

   public void setTbm11_file_name( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_file_name = value ;
   }

   public long getTbm11_study_id( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_study_id ;
   }

   public void setTbm11_study_id( long value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_study_id = value ;
   }

   public String getTbm11_del_flg( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_del_flg ;
   }

   public void setTbm11_del_flg( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_del_flg = value ;
   }

   public java.util.Date getTbm11_crt_datetime( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime ;
   }

   public void setTbm11_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime = value ;
   }

   public String getTbm11_crt_user_id( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id ;
   }

   public void setTbm11_crt_user_id( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id = value ;
   }

   public String getTbm11_crt_prog_nm( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm ;
   }

   public void setTbm11_crt_prog_nm( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm = value ;
   }

   public java.util.Date getTbm11_upd_datetime( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime ;
   }

   public void setTbm11_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime = value ;
   }

   public String getTbm11_upd_user_id( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id ;
   }

   public void setTbm11_upd_user_id( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id = value ;
   }

   public String getTbm11_upd_prog_nm( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm ;
   }

   public void setTbm11_upd_prog_nm( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm = value ;
   }

   public long getTbm11_upd_cnt( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt ;
   }

   public void setTbm11_upd_cnt( long value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM11_IMAGE_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM11_IMAGE_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM11_IMAGE_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM11_IMAGE_Initialized = value ;
   }

   public String getTbm11_image_cd_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_image_cd_Z ;
   }

   public void setTbm11_image_cd_Z( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_image_cd_Z = value ;
   }

   public String getTbm11_image_nm_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_image_nm_Z ;
   }

   public void setTbm11_image_nm_Z( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_image_nm_Z = value ;
   }

   public String getTbm11_file_name_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_file_name_Z ;
   }

   public void setTbm11_file_name_Z( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_file_name_Z = value ;
   }

   public long getTbm11_study_id_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_study_id_Z ;
   }

   public void setTbm11_study_id_Z( long value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_study_id_Z = value ;
   }

   public String getTbm11_del_flg_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_del_flg_Z ;
   }

   public void setTbm11_del_flg_Z( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_del_flg_Z = value ;
   }

   public java.util.Date getTbm11_crt_datetime_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_Z ;
   }

   public void setTbm11_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_Z = value ;
   }

   public String getTbm11_crt_user_id_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_Z ;
   }

   public void setTbm11_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_Z = value ;
   }

   public String getTbm11_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_Z ;
   }

   public void setTbm11_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm11_upd_datetime_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_Z ;
   }

   public void setTbm11_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_Z = value ;
   }

   public String getTbm11_upd_user_id_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_Z ;
   }

   public void setTbm11_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_Z = value ;
   }

   public String getTbm11_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_Z ;
   }

   public void setTbm11_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_Z = value ;
   }

   public long getTbm11_upd_cnt_Z( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_Z ;
   }

   public void setTbm11_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_Z = value ;
   }

   public byte getTbm11_image_nm_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_image_nm_N ;
   }

   public void setTbm11_image_nm_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_image_nm_N = value ;
   }

   public byte getTbm11_image_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_image_N ;
   }

   public void setTbm11_image_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_image_N = value ;
   }

   public byte getTbm11_file_name_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_file_name_N ;
   }

   public void setTbm11_file_name_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_file_name_N = value ;
   }

   public byte getTbm11_study_id_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_study_id_N ;
   }

   public void setTbm11_study_id_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_study_id_N = value ;
   }

   public byte getTbm11_del_flg_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_del_flg_N ;
   }

   public void setTbm11_del_flg_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_del_flg_N = value ;
   }

   public byte getTbm11_crt_datetime_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_N ;
   }

   public void setTbm11_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_N = value ;
   }

   public byte getTbm11_crt_user_id_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_N ;
   }

   public void setTbm11_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_N = value ;
   }

   public byte getTbm11_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_N ;
   }

   public void setTbm11_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_N = value ;
   }

   public byte getTbm11_upd_datetime_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_N ;
   }

   public void setTbm11_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_N = value ;
   }

   public byte getTbm11_upd_user_id_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_N ;
   }

   public void setTbm11_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_N = value ;
   }

   public byte getTbm11_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_N ;
   }

   public void setTbm11_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_N = value ;
   }

   public byte getTbm11_upd_cnt_N( )
   {
      return gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_N ;
   }

   public void setTbm11_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_image_nm_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_image_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_file_name_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_study_id_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_del_flg_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_N ;
   protected short gxTv_SdtTBM11_IMAGE_Initialized ;
   protected long gxTv_SdtTBM11_IMAGE_Tbm11_study_id ;
   protected long gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt ;
   protected long gxTv_SdtTBM11_IMAGE_Tbm11_study_id_Z ;
   protected long gxTv_SdtTBM11_IMAGE_Tbm11_upd_cnt_Z ;
   protected String gxTv_SdtTBM11_IMAGE_Mode ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_image ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_image_cd ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_image_nm ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_file_name ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_del_flg ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_image_cd_Z ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_image_nm_Z ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_file_name_Z ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_del_flg_Z ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_crt_user_id_Z ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_upd_user_id_Z ;
   protected String gxTv_SdtTBM11_IMAGE_Tbm11_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM11_IMAGE_Tbm11_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM11_IMAGE_Tbm11_upd_datetime_Z ;
}

