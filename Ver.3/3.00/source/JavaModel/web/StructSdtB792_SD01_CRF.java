/*
               File: StructSdtB792_SD01_CRF
        Description: B792_SD01_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:46.53
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB792_SD01_CRF implements Cloneable, java.io.Serializable
{
   public StructSdtB792_SD01_CRF( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime = cal.getTime() ;
      gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg = "" ;
      gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime = cal.getTime() ;
      gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg = "" ;
      gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime = cal.getTime() ;
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

   public long getTbt02_study_id( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_study_id ;
   }

   public void setTbt02_study_id( long value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_study_id = value ;
   }

   public int getTbt02_subject_id( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_subject_id ;
   }

   public void setTbt02_subject_id( int value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_subject_id = value ;
   }

   public short getTbt02_crf_id( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_crf_id ;
   }

   public void setTbt02_crf_id( short value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_crf_id = value ;
   }

   public byte getTbt02_crf_eda_no( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no ;
   }

   public void setTbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no = value ;
   }

   public short getTbt02_crf_latest_version( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version ;
   }

   public void setTbt02_crf_latest_version( short value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version = value ;
   }

   public java.util.Date getTbt02_upload_datetime( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime ;
   }

   public void setTbt02_upload_datetime( java.util.Date value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime = value ;
   }

   public byte getTbt02_crf_input_level( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level ;
   }

   public void setTbt02_crf_input_level( byte value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level = value ;
   }

   public String getTbt02_dm_arrival_flg( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg ;
   }

   public void setTbt02_dm_arrival_flg( String value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg = value ;
   }

   public java.util.Date getTbt02_dm_arrival_datetime( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime ;
   }

   public void setTbt02_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime = value ;
   }

   public String getTbt02_input_end_flg( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg ;
   }

   public void setTbt02_input_end_flg( String value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg = value ;
   }

   public java.util.Date getTbt02_upd_datetime( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime ;
   }

   public void setTbt02_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime = value ;
   }

   public long getTbt02_upd_cnt( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt ;
   }

   public void setTbt02_upd_cnt( long value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt = value ;
   }

   public java.util.Vector getCrf_results( )
   {
      return gxTv_SdtB792_SD01_CRF_Crf_results ;
   }

   public void setCrf_results( java.util.Vector value )
   {
      gxTv_SdtB792_SD01_CRF_Crf_results = value ;
   }

   protected byte gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no ;
   protected byte gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level ;
   protected short gxTv_SdtB792_SD01_CRF_Tbt02_crf_id ;
   protected short gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version ;
   protected int gxTv_SdtB792_SD01_CRF_Tbt02_subject_id ;
   protected long gxTv_SdtB792_SD01_CRF_Tbt02_study_id ;
   protected long gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt ;
   protected String gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg ;
   protected String gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg ;
   protected java.util.Date gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime ;
   protected java.util.Date gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime ;
   protected java.util.Date gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime ;
   protected java.util.Vector gxTv_SdtB792_SD01_CRF_Crf_results=null ;
}

