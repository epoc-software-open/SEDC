import com.genexus.*;

public final  class StructSdtA_LOGIN_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtA_LOGIN_SDT( )
   {
      gxTv_SdtA_LOGIN_SDT_Session_id = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_user_id = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_user_nm = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_site_id = "" ;
      gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg = "" ;
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

   public String getSession_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Session_id ;
   }

   public void setSession_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Session_id = value ;
   }

   public String getTam07_user_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_id ;
   }

   public void setTam07_user_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_id = value ;
   }

   public String getTam07_user_nm( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_nm ;
   }

   public void setTam07_user_nm( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_nm = value ;
   }

   public String getTam07_user_kana_nm( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm ;
   }

   public void setTam07_user_kana_nm( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm = value ;
   }

   public String getTam07_kngn_ptn_kbn( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ;
   }

   public void setTam07_kngn_ptn_kbn( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn = value ;
   }

   public String getTam07_site_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   }

   public void setTam07_site_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_site_id = value ;
   }

   public java.util.Vector getA801_sys_config( )
   {
      return gxTv_SdtA_LOGIN_SDT_A801_sys_config ;
   }

   public void setA801_sys_config( java.util.Vector value )
   {
      gxTv_SdtA_LOGIN_SDT_A801_sys_config = value ;
   }

   public String getExtra_sys_call_flg( )
   {
      return gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg ;
   }

   public void setExtra_sys_call_flg( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg = value ;
   }

   protected String gxTv_SdtA_LOGIN_SDT_Session_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_nm ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg ;
   protected java.util.Vector gxTv_SdtA_LOGIN_SDT_A801_sys_config=null ;
}

