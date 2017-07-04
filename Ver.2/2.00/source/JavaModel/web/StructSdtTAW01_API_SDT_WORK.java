/*
               File: StructSdtTAW01_API_SDT_WORK
        Description: アプリケーションSDTテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:10.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTAW01_API_SDT_WORK implements Cloneable, java.io.Serializable
{
   public StructSdtTAW01_API_SDT_WORK( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date = cal.getTime() ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Mode = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z = cal.getTime() ;
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

   public String getTaw01_session_id( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id ;
   }

   public void setTaw01_session_id( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id = value ;
   }

   public String getTaw01_app_id( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id ;
   }

   public void setTaw01_app_id( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id = value ;
   }

   public String getTaw01_disp_datetime( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime ;
   }

   public void setTaw01_disp_datetime( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime = value ;
   }

   public java.util.Date getTaw01_crt_date( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date ;
   }

   public void setTaw01_crt_date( java.util.Date value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date = value ;
   }

   public String getTaw01_sdt_save_1( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 ;
   }

   public void setTaw01_sdt_save_1( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 = value ;
   }

   public String getTaw01_sdt_save_2( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 ;
   }

   public void setTaw01_sdt_save_2( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Initialized = value ;
   }

   public String getTaw01_session_id_Z( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z ;
   }

   public void setTaw01_session_id_Z( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z = value ;
   }

   public String getTaw01_app_id_Z( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z ;
   }

   public void setTaw01_app_id_Z( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z = value ;
   }

   public String getTaw01_disp_datetime_Z( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z ;
   }

   public void setTaw01_disp_datetime_Z( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z = value ;
   }

   public java.util.Date getTaw01_crt_date_Z( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z ;
   }

   public void setTaw01_crt_date_Z( java.util.Date value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z = value ;
   }

   public byte getTaw01_crt_date_N( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N ;
   }

   public void setTaw01_crt_date_N( byte value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N = value ;
   }

   public byte getTaw01_sdt_save_1_N( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N ;
   }

   public void setTaw01_sdt_save_1_N( byte value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N = value ;
   }

   public byte getTaw01_sdt_save_2_N( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N ;
   }

   public void setTaw01_sdt_save_2_N( byte value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N = value ;
   }

   protected byte gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N ;
   protected byte gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N ;
   protected byte gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N ;
   protected short gxTv_SdtTAW01_API_SDT_WORK_Initialized ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Mode ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z ;
   protected String gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z ;
   protected java.util.Date gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date ;
   protected java.util.Date gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z ;
}

