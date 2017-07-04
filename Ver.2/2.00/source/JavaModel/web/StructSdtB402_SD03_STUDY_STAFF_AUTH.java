/*
               File: StructSdtB402_SD03_STUDY_STAFF_AUTH
        Description: B402_SD03_STUDY_STAFF_AUTH
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.16
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB402_SD03_STUDY_STAFF_AUTH implements Cloneable, java.io.Serializable
{
   public StructSdtB402_SD03_STUDY_STAFF_AUTH( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd = "" ;
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm = "" ;
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime = cal.getTime() ;
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
      return gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check ;
   }

   public void setCheck( boolean value )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check = value ;
   }

   public String getAuth_cd( )
   {
      return gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd ;
   }

   public void setAuth_cd( String value )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd = value ;
   }

   public String getAuth_nm( )
   {
      return gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm ;
   }

   public void setAuth_nm( String value )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm = value ;
   }

   public java.util.Date getUpd_datetime( )
   {
      return gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime ;
   }

   public void setUpd_datetime( java.util.Date value )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime = value ;
   }

   protected boolean gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check ;
   protected String gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd ;
   protected String gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm ;
   protected java.util.Date gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime ;
}

