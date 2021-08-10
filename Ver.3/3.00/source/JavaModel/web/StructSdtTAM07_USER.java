/*
               File: StructSdtTAM07_USER
        Description: ユーザーマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:47.26
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTAM07_USER implements Cloneable, java.io.Serializable
{
   public StructSdtTAM07_USER( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTAM07_USER_Tam07_user_id = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_nm = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm = "" ;
      gxTv_SdtTAM07_USER_Tam07_pwd = "" ;
      gxTv_SdtTAM07_USER_Tam07_auth_cd = "" ;
      gxTv_SdtTAM07_USER_Tam07_site_id = "" ;
      gxTv_SdtTAM07_USER_Tam07_email = "" ;
      gxTv_SdtTAM07_USER_Tam07_admin_auth_flg = "" ;
      gxTv_SdtTAM07_USER_Tam07_nc_flg = "" ;
      gxTv_SdtTAM07_USER_Tam07_note = "" ;
      gxTv_SdtTAM07_USER_Tam07_del_flg = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_datetime = cal.getTime() ;
      gxTv_SdtTAM07_USER_Tam07_crt_user_id = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_datetime = cal.getTime() ;
      gxTv_SdtTAM07_USER_Tam07_upd_user_id = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm = "" ;
      gxTv_SdtTAM07_USER_Mode = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_pwd_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_auth_cd_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_site_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_email_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_admin_auth_flg_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_nc_flg_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_note_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_del_flg_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z = "" ;
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

   public String getTam07_user_id( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_id ;
   }

   public void setTam07_user_id( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_id = value ;
   }

   public String getTam07_user_nm( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_nm ;
   }

   public void setTam07_user_nm( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm = value ;
   }

   public String getTam07_user_kana_nm( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_kana_nm ;
   }

   public void setTam07_user_kana_nm( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm = value ;
   }

   public String getTam07_pwd( )
   {
      return gxTv_SdtTAM07_USER_Tam07_pwd ;
   }

   public void setTam07_pwd( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd = value ;
   }

   public String getTam07_auth_cd( )
   {
      return gxTv_SdtTAM07_USER_Tam07_auth_cd ;
   }

   public void setTam07_auth_cd( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd = value ;
   }

   public String getTam07_site_id( )
   {
      return gxTv_SdtTAM07_USER_Tam07_site_id ;
   }

   public void setTam07_site_id( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id = value ;
   }

   public String getTam07_email( )
   {
      return gxTv_SdtTAM07_USER_Tam07_email ;
   }

   public void setTam07_email( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_email = value ;
   }

   public String getTam07_admin_auth_flg( )
   {
      return gxTv_SdtTAM07_USER_Tam07_admin_auth_flg ;
   }

   public void setTam07_admin_auth_flg( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_admin_auth_flg = value ;
   }

   public String getTam07_nc_flg( )
   {
      return gxTv_SdtTAM07_USER_Tam07_nc_flg ;
   }

   public void setTam07_nc_flg( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_nc_flg = value ;
   }

   public String getTam07_note( )
   {
      return gxTv_SdtTAM07_USER_Tam07_note ;
   }

   public void setTam07_note( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_note = value ;
   }

   public String getTam07_del_flg( )
   {
      return gxTv_SdtTAM07_USER_Tam07_del_flg ;
   }

   public void setTam07_del_flg( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg = value ;
   }

   public java.util.Date getTam07_crt_datetime( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_datetime ;
   }

   public void setTam07_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime = value ;
   }

   public String getTam07_crt_user_id( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_user_id ;
   }

   public void setTam07_crt_user_id( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id = value ;
   }

   public String getTam07_crt_prog_nm( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_prog_nm ;
   }

   public void setTam07_crt_prog_nm( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm = value ;
   }

   public java.util.Date getTam07_upd_datetime( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_datetime ;
   }

   public void setTam07_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime = value ;
   }

   public String getTam07_upd_user_id( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_user_id ;
   }

   public void setTam07_upd_user_id( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id = value ;
   }

   public String getTam07_upd_prog_nm( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_prog_nm ;
   }

   public void setTam07_upd_prog_nm( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm = value ;
   }

   public long getTam07_upd_cnt( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_cnt ;
   }

   public void setTam07_upd_cnt( long value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTAM07_USER_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTAM07_USER_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTAM07_USER_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTAM07_USER_Initialized = value ;
   }

   public String getTam07_user_id_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_id_Z ;
   }

   public void setTam07_user_id_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_id_Z = value ;
   }

   public String getTam07_user_nm_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_nm_Z ;
   }

   public void setTam07_user_nm_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm_Z = value ;
   }

   public String getTam07_user_kana_nm_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z ;
   }

   public void setTam07_user_kana_nm_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z = value ;
   }

   public String getTam07_pwd_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_pwd_Z ;
   }

   public void setTam07_pwd_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd_Z = value ;
   }

   public String getTam07_auth_cd_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_auth_cd_Z ;
   }

   public void setTam07_auth_cd_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd_Z = value ;
   }

   public String getTam07_site_id_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_site_id_Z ;
   }

   public void setTam07_site_id_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id_Z = value ;
   }

   public String getTam07_email_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_email_Z ;
   }

   public void setTam07_email_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_email_Z = value ;
   }

   public String getTam07_admin_auth_flg_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_admin_auth_flg_Z ;
   }

   public void setTam07_admin_auth_flg_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_admin_auth_flg_Z = value ;
   }

   public String getTam07_nc_flg_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_nc_flg_Z ;
   }

   public void setTam07_nc_flg_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_nc_flg_Z = value ;
   }

   public String getTam07_note_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_note_Z ;
   }

   public void setTam07_note_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_note_Z = value ;
   }

   public String getTam07_del_flg_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_del_flg_Z ;
   }

   public void setTam07_del_flg_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg_Z = value ;
   }

   public java.util.Date getTam07_crt_datetime_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z ;
   }

   public void setTam07_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z = value ;
   }

   public String getTam07_crt_user_id_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z ;
   }

   public void setTam07_crt_user_id_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z = value ;
   }

   public String getTam07_crt_prog_nm_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z ;
   }

   public void setTam07_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTam07_upd_datetime_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z ;
   }

   public void setTam07_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z = value ;
   }

   public String getTam07_upd_user_id_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z ;
   }

   public void setTam07_upd_user_id_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z = value ;
   }

   public String getTam07_upd_prog_nm_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z ;
   }

   public void setTam07_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z = value ;
   }

   public long getTam07_upd_cnt_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z ;
   }

   public void setTam07_upd_cnt_Z( long value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z = value ;
   }

   public byte getTam07_user_nm_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_nm_N ;
   }

   public void setTam07_user_nm_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm_N = value ;
   }

   public byte getTam07_user_kana_nm_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N ;
   }

   public void setTam07_user_kana_nm_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N = value ;
   }

   public byte getTam07_pwd_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_pwd_N ;
   }

   public void setTam07_pwd_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd_N = value ;
   }

   public byte getTam07_auth_cd_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_auth_cd_N ;
   }

   public void setTam07_auth_cd_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd_N = value ;
   }

   public byte getTam07_site_id_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_site_id_N ;
   }

   public void setTam07_site_id_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id_N = value ;
   }

   public byte getTam07_email_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_email_N ;
   }

   public void setTam07_email_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_email_N = value ;
   }

   public byte getTam07_admin_auth_flg_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_admin_auth_flg_N ;
   }

   public void setTam07_admin_auth_flg_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_admin_auth_flg_N = value ;
   }

   public byte getTam07_nc_flg_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_nc_flg_N ;
   }

   public void setTam07_nc_flg_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_nc_flg_N = value ;
   }

   public byte getTam07_note_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_note_N ;
   }

   public void setTam07_note_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_note_N = value ;
   }

   public byte getTam07_del_flg_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_del_flg_N ;
   }

   public void setTam07_del_flg_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg_N = value ;
   }

   public byte getTam07_crt_datetime_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_datetime_N ;
   }

   public void setTam07_crt_datetime_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_N = value ;
   }

   public byte getTam07_crt_user_id_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_user_id_N ;
   }

   public void setTam07_crt_user_id_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_N = value ;
   }

   public byte getTam07_crt_prog_nm_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N ;
   }

   public void setTam07_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N = value ;
   }

   public byte getTam07_upd_datetime_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_datetime_N ;
   }

   public void setTam07_upd_datetime_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_N = value ;
   }

   public byte getTam07_upd_user_id_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_user_id_N ;
   }

   public void setTam07_upd_user_id_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_N = value ;
   }

   public byte getTam07_upd_prog_nm_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N ;
   }

   public void setTam07_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N = value ;
   }

   public byte getTam07_upd_cnt_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_cnt_N ;
   }

   public void setTam07_upd_cnt_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTAM07_USER_Tam07_user_nm_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_pwd_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_auth_cd_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_site_id_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_email_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_admin_auth_flg_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_nc_flg_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_note_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_del_flg_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_crt_datetime_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_crt_user_id_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_upd_datetime_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_upd_user_id_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N ;
   protected byte gxTv_SdtTAM07_USER_Tam07_upd_cnt_N ;
   protected short gxTv_SdtTAM07_USER_Initialized ;
   protected long gxTv_SdtTAM07_USER_Tam07_upd_cnt ;
   protected long gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z ;
   protected String gxTv_SdtTAM07_USER_Mode ;
   protected String gxTv_SdtTAM07_USER_Tam07_user_id ;
   protected String gxTv_SdtTAM07_USER_Tam07_user_nm ;
   protected String gxTv_SdtTAM07_USER_Tam07_user_kana_nm ;
   protected String gxTv_SdtTAM07_USER_Tam07_pwd ;
   protected String gxTv_SdtTAM07_USER_Tam07_auth_cd ;
   protected String gxTv_SdtTAM07_USER_Tam07_site_id ;
   protected String gxTv_SdtTAM07_USER_Tam07_email ;
   protected String gxTv_SdtTAM07_USER_Tam07_admin_auth_flg ;
   protected String gxTv_SdtTAM07_USER_Tam07_nc_flg ;
   protected String gxTv_SdtTAM07_USER_Tam07_note ;
   protected String gxTv_SdtTAM07_USER_Tam07_del_flg ;
   protected String gxTv_SdtTAM07_USER_Tam07_crt_user_id ;
   protected String gxTv_SdtTAM07_USER_Tam07_crt_prog_nm ;
   protected String gxTv_SdtTAM07_USER_Tam07_upd_user_id ;
   protected String gxTv_SdtTAM07_USER_Tam07_upd_prog_nm ;
   protected String gxTv_SdtTAM07_USER_Tam07_user_id_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_user_nm_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_pwd_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_auth_cd_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_site_id_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_email_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_admin_auth_flg_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_nc_flg_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_note_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_del_flg_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z ;
   protected String gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTAM07_USER_Tam07_crt_datetime ;
   protected java.util.Date gxTv_SdtTAM07_USER_Tam07_upd_datetime ;
   protected java.util.Date gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z ;
}

