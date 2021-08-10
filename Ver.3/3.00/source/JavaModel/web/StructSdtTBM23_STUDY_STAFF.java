/*
               File: StructSdtTBM23_STUDY_STAFF
        Description: 試験参加スタッフマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:21.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM23_STUDY_STAFF implements Cloneable, java.io.Serializable
{
   public StructSdtTBM23_STUDY_STAFF( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Mode = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id_Z = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd_Z = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_Z = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_Z = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_Z = "" ;
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_Z = "" ;
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

   public long getTbm23_study_id( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id ;
   }

   public void setTbm23_study_id( long value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id = value ;
   }

   public String getTbm23_user_id( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id ;
   }

   public void setTbm23_user_id( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id = value ;
   }

   public String getTbm23_stydy_auth_cd( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd ;
   }

   public void setTbm23_stydy_auth_cd( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd = value ;
   }

   public String getTbm23_del_flg( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg ;
   }

   public void setTbm23_del_flg( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg = value ;
   }

   public java.util.Date getTbm23_crt_datetime( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime ;
   }

   public void setTbm23_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime = value ;
   }

   public String getTbm23_crt_user_id( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id ;
   }

   public void setTbm23_crt_user_id( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id = value ;
   }

   public String getTbm23_crt_prog_nm( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm ;
   }

   public void setTbm23_crt_prog_nm( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm = value ;
   }

   public java.util.Date getTbm23_upd_datetime( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime ;
   }

   public void setTbm23_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime = value ;
   }

   public String getTbm23_upd_user_id( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id ;
   }

   public void setTbm23_upd_user_id( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id = value ;
   }

   public String getTbm23_upd_prog_nm( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm ;
   }

   public void setTbm23_upd_prog_nm( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm = value ;
   }

   public long getTbm23_upd_cnt( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt ;
   }

   public void setTbm23_upd_cnt( long value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Initialized = value ;
   }

   public long getTbm23_study_id_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id_Z ;
   }

   public void setTbm23_study_id_Z( long value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id_Z = value ;
   }

   public String getTbm23_user_id_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id_Z ;
   }

   public void setTbm23_user_id_Z( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id_Z = value ;
   }

   public String getTbm23_stydy_auth_cd_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd_Z ;
   }

   public void setTbm23_stydy_auth_cd_Z( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd_Z = value ;
   }

   public String getTbm23_del_flg_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_Z ;
   }

   public void setTbm23_del_flg_Z( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_Z = value ;
   }

   public java.util.Date getTbm23_crt_datetime_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_Z ;
   }

   public void setTbm23_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_Z = value ;
   }

   public String getTbm23_crt_user_id_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_Z ;
   }

   public void setTbm23_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_Z = value ;
   }

   public String getTbm23_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_Z ;
   }

   public void setTbm23_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm23_upd_datetime_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_Z ;
   }

   public void setTbm23_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_Z = value ;
   }

   public String getTbm23_upd_user_id_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_Z ;
   }

   public void setTbm23_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_Z = value ;
   }

   public String getTbm23_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_Z ;
   }

   public void setTbm23_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_Z = value ;
   }

   public long getTbm23_upd_cnt_Z( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_Z ;
   }

   public void setTbm23_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_Z = value ;
   }

   public byte getTbm23_del_flg_N( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_N ;
   }

   public void setTbm23_del_flg_N( byte value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_N = value ;
   }

   public byte getTbm23_crt_datetime_N( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_N ;
   }

   public void setTbm23_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_N = value ;
   }

   public byte getTbm23_crt_user_id_N( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_N ;
   }

   public void setTbm23_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_N = value ;
   }

   public byte getTbm23_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_N ;
   }

   public void setTbm23_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_N = value ;
   }

   public byte getTbm23_upd_datetime_N( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_N ;
   }

   public void setTbm23_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_N = value ;
   }

   public byte getTbm23_upd_user_id_N( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_N ;
   }

   public void setTbm23_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_N = value ;
   }

   public byte getTbm23_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_N ;
   }

   public void setTbm23_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_N = value ;
   }

   public byte getTbm23_upd_cnt_N( )
   {
      return gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_N ;
   }

   public void setTbm23_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_N ;
   protected byte gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_N ;
   protected byte gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_N ;
   protected byte gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_N ;
   protected byte gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_N ;
   protected byte gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_N ;
   protected short gxTv_SdtTBM23_STUDY_STAFF_Initialized ;
   protected long gxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id ;
   protected long gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt ;
   protected long gxTv_SdtTBM23_STUDY_STAFF_Tbm23_study_id_Z ;
   protected long gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_cnt_Z ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Mode ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_user_id_Z ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_stydy_auth_cd_Z ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_del_flg_Z ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_user_id_Z ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_user_id_Z ;
   protected String gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM23_STUDY_STAFF_Tbm23_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM23_STUDY_STAFF_Tbm23_upd_datetime_Z ;
}

