/*
               File: StructSdtB402_SD01_STUDY_SITE
        Description: B402_SD01_STUDY_SITE
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:41.73
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB402_SD01_STUDY_SITE implements Cloneable, java.io.Serializable
{
   public StructSdtB402_SD01_STUDY_SITE( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB402_SD01_STUDY_SITE_Site_id = "" ;
      gxTv_SdtB402_SD01_STUDY_SITE_Site_nm = "" ;
      gxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime = cal.getTime() ;
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
      return gxTv_SdtB402_SD01_STUDY_SITE_Check ;
   }

   public void setCheck( boolean value )
   {
      gxTv_SdtB402_SD01_STUDY_SITE_Check = value ;
   }

   public long getStudy_id( )
   {
      return gxTv_SdtB402_SD01_STUDY_SITE_Study_id ;
   }

   public void setStudy_id( long value )
   {
      gxTv_SdtB402_SD01_STUDY_SITE_Study_id = value ;
   }

   public String getSite_id( )
   {
      return gxTv_SdtB402_SD01_STUDY_SITE_Site_id ;
   }

   public void setSite_id( String value )
   {
      gxTv_SdtB402_SD01_STUDY_SITE_Site_id = value ;
   }

   public String getSite_nm( )
   {
      return gxTv_SdtB402_SD01_STUDY_SITE_Site_nm ;
   }

   public void setSite_nm( String value )
   {
      gxTv_SdtB402_SD01_STUDY_SITE_Site_nm = value ;
   }

   public java.util.Date getUpd_datetime( )
   {
      return gxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime ;
   }

   public void setUpd_datetime( java.util.Date value )
   {
      gxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime = value ;
   }

   protected long gxTv_SdtB402_SD01_STUDY_SITE_Study_id ;
   protected boolean gxTv_SdtB402_SD01_STUDY_SITE_Check ;
   protected String gxTv_SdtB402_SD01_STUDY_SITE_Site_id ;
   protected String gxTv_SdtB402_SD01_STUDY_SITE_Site_nm ;
   protected java.util.Date gxTv_SdtB402_SD01_STUDY_SITE_Upd_datetime ;
}

