/*
               File: StructSdtB792_SD00_HTML5_EXEC_INFO
        Description: B792_SD00_HTML5_EXEC_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB792_SD00_HTML5_EXEC_INFO implements Cloneable, java.io.Serializable
{
   public StructSdtB792_SD00_HTML5_EXEC_INFO( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date = cal.getTime() ;
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime = cal.getTime() ;
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn = "" ;
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd = "" ;
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

   public java.util.Date getExec_date( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date ;
   }

   public void setExec_date( java.util.Date value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date = value ;
   }

   public java.util.Date getExec_datetime( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime ;
   }

   public void setExec_datetime( java.util.Date value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime = value ;
   }

   public String getExec_kbn( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn ;
   }

   public void setExec_kbn( String value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn = value ;
   }

   public String getAuth_cd( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd ;
   }

   public void setAuth_cd( String value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd = value ;
   }

   public java.util.Vector getB792_sd03_ol_disp_info( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info ;
   }

   public void setB792_sd03_ol_disp_info( java.util.Vector value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info = value ;
   }

   protected String gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn ;
   protected String gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd ;
   protected java.util.Date gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date ;
   protected java.util.Date gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime ;
   protected java.util.Vector gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info=null ;
}

