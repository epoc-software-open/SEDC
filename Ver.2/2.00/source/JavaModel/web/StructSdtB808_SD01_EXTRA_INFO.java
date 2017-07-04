/*
               File: StructSdtB808_SD01_EXTRA_INFO
        Description: B808_SD01_EXTRA_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:59.40
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB808_SD01_EXTRA_INFO implements Cloneable, java.io.Serializable
{
   public StructSdtB808_SD01_EXTRA_INFO( )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_App_id = "" ;
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

   public String getApp_id( )
   {
      return gxTv_SdtB808_SD01_EXTRA_INFO_App_id ;
   }

   public void setApp_id( String value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_App_id = value ;
   }

   public java.util.Vector getParms( )
   {
      return gxTv_SdtB808_SD01_EXTRA_INFO_Parms ;
   }

   public void setParms( java.util.Vector value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_Parms = value ;
   }

   protected String gxTv_SdtB808_SD01_EXTRA_INFO_App_id ;
   protected java.util.Vector gxTv_SdtB808_SD01_EXTRA_INFO_Parms=null ;
}

