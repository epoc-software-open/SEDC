/*
               File: StructSdtB402_SD02_STUDY_STAFF
        Description: B402_SD02_STUDY_STAFF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB402_SD02_STUDY_STAFF implements Cloneable, java.io.Serializable
{
   public StructSdtB402_SD02_STUDY_STAFF( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_id = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_User_id = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_User_nm = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm = "" ;
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

   public boolean getCheck( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Check ;
   }

   public void setCheck( boolean value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Check = value ;
   }

   public long getStudy_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Study_id ;
   }

   public void setStudy_id( long value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_id = value ;
   }

   public String getStudy_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm ;
   }

   public void setStudy_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm = value ;
   }

   public String getSite_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Site_id ;
   }

   public void setSite_id( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_id = value ;
   }

   public String getSite_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm ;
   }

   public void setSite_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm = value ;
   }

   public String getUser_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_User_id ;
   }

   public void setUser_id( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_User_id = value ;
   }

   public String getUser_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_User_nm ;
   }

   public void setUser_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_User_nm = value ;
   }

   public String getStydy_auth_cd( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd ;
   }

   public void setStydy_auth_cd( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd = value ;
   }

   public String getAuth_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm ;
   }

   public void setAuth_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm = value ;
   }

   public java.util.Vector getSel_auth( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth ;
   }

   public void setSel_auth( java.util.Vector value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = value ;
   }

   protected long gxTv_SdtB402_SD02_STUDY_STAFF_Study_id ;
   protected boolean gxTv_SdtB402_SD02_STUDY_STAFF_Check ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Site_id ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_User_id ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_User_nm ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm ;
   protected java.util.Vector gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth=null ;
}

