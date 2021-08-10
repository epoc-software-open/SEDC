/*
               File: StructSdtA_LOGIN_SDT
        Description: A_LOGIN_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:55.38
       Program type: Callable routine
          Main DBMS: mysql
*/
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
      gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg = "" ;
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

   public String getTam07_admin_auth_flg( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg ;
   }

   public void setTam07_admin_auth_flg( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg = value ;
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

   public StructSdtA_USER_STUDY_SDT getUser_study_sdt( )
   {
      return gxTv_SdtA_LOGIN_SDT_User_study_sdt ;
   }

   public void setUser_study_sdt( StructSdtA_USER_STUDY_SDT value )
   {
      gxTv_SdtA_LOGIN_SDT_User_study_sdt = value;
   }

   protected String gxTv_SdtA_LOGIN_SDT_Session_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_nm ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg ;
   protected StructSdtA_USER_STUDY_SDT gxTv_SdtA_LOGIN_SDT_User_study_sdt=null ;
   protected java.util.Vector gxTv_SdtA_LOGIN_SDT_A801_sys_config=null ;
}

