/*
               File: StructSdtTAM05_APPLI_KNGN
        Description: アプリケーション権限マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:43.0
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTAM05_APPLI_KNGN implements Cloneable, java.io.Serializable
{
   public StructSdtTAM05_APPLI_KNGN( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime = cal.getTime() ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime = cal.getTime() ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Mode = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z = "" ;
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

   public String getTam04_auth_cd( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd ;
   }

   public void setTam04_auth_cd( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd = value ;
   }

   public String getTam03_app_id( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id ;
   }

   public void setTam03_app_id( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id = value ;
   }

   public String getTam05_kngn_flg( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg ;
   }

   public void setTam05_kngn_flg( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg = value ;
   }

   public String getTam05_del_flg( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg ;
   }

   public void setTam05_del_flg( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg = value ;
   }

   public java.util.Date getTam05_crt_datetime( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime ;
   }

   public void setTam05_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime = value ;
   }

   public String getTam05_crt_user_id( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id ;
   }

   public void setTam05_crt_user_id( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id = value ;
   }

   public String getTam05_crt_prog_nm( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm ;
   }

   public void setTam05_crt_prog_nm( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm = value ;
   }

   public java.util.Date getTam05_upd_datetime( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime ;
   }

   public void setTam05_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime = value ;
   }

   public String getTam05_upd_user_id( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id ;
   }

   public void setTam05_upd_user_id( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id = value ;
   }

   public String getTam05_upd_prog_nm( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm ;
   }

   public void setTam05_upd_prog_nm( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm = value ;
   }

   public long getTam05_upd_cnt( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt ;
   }

   public void setTam05_upd_cnt( long value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Initialized = value ;
   }

   public String getTam04_auth_cd_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z ;
   }

   public void setTam04_auth_cd_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z = value ;
   }

   public String getTam03_app_id_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z ;
   }

   public void setTam03_app_id_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z = value ;
   }

   public String getTam05_kngn_flg_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z ;
   }

   public void setTam05_kngn_flg_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z = value ;
   }

   public String getTam05_del_flg_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z ;
   }

   public void setTam05_del_flg_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z = value ;
   }

   public java.util.Date getTam05_crt_datetime_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z ;
   }

   public void setTam05_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z = value ;
   }

   public String getTam05_crt_user_id_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z ;
   }

   public void setTam05_crt_user_id_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z = value ;
   }

   public String getTam05_crt_prog_nm_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z ;
   }

   public void setTam05_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTam05_upd_datetime_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z ;
   }

   public void setTam05_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z = value ;
   }

   public String getTam05_upd_user_id_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z ;
   }

   public void setTam05_upd_user_id_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z = value ;
   }

   public String getTam05_upd_prog_nm_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z ;
   }

   public void setTam05_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z = value ;
   }

   public long getTam05_upd_cnt_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z ;
   }

   public void setTam05_upd_cnt_Z( long value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z = value ;
   }

   public byte getTam05_kngn_flg_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N ;
   }

   public void setTam05_kngn_flg_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N = value ;
   }

   public byte getTam05_del_flg_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N ;
   }

   public void setTam05_del_flg_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N = value ;
   }

   public byte getTam05_crt_datetime_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N ;
   }

   public void setTam05_crt_datetime_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N = value ;
   }

   public byte getTam05_crt_user_id_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N ;
   }

   public void setTam05_crt_user_id_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N = value ;
   }

   public byte getTam05_crt_prog_nm_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N ;
   }

   public void setTam05_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N = value ;
   }

   public byte getTam05_upd_datetime_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N ;
   }

   public void setTam05_upd_datetime_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N = value ;
   }

   public byte getTam05_upd_user_id_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N ;
   }

   public void setTam05_upd_user_id_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N = value ;
   }

   public byte getTam05_upd_prog_nm_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N ;
   }

   public void setTam05_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N = value ;
   }

   public byte getTam05_upd_cnt_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N ;
   }

   public void setTam05_upd_cnt_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N ;
   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N ;
   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N ;
   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N ;
   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N ;
   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N ;
   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N ;
   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N ;
   protected byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N ;
   protected short gxTv_SdtTAM05_APPLI_KNGN_Initialized ;
   protected long gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt ;
   protected long gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Mode ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z ;
   protected String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime ;
   protected java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime ;
   protected java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z ;
}

