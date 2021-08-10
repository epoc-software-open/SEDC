/*
               File: StructSdtTBM36_CRF_SELECT
        Description: CRF選択マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:51.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM36_CRF_SELECT implements Cloneable, java.io.Serializable
{
   public StructSdtTBM36_CRF_SELECT( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Mode = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z = "" ;
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z = "" ;
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

   public long getTbm36_study_id( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id ;
   }

   public void setTbm36_study_id( long value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id = value ;
   }

   public short getTbm36_crf_id( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id ;
   }

   public void setTbm36_crf_id( short value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id = value ;
   }

   public short getTbm36_cond_no( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no ;
   }

   public void setTbm36_cond_no( short value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no = value ;
   }

   public short getTbm36_select_crf_id( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id ;
   }

   public void setTbm36_select_crf_id( short value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id = value ;
   }

   public String getTbm36_del_flg( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg ;
   }

   public void setTbm36_del_flg( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg = value ;
   }

   public java.util.Date getTbm36_crt_datetime( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime ;
   }

   public void setTbm36_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime = value ;
   }

   public String getTbm36_crt_user_id( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id ;
   }

   public void setTbm36_crt_user_id( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id = value ;
   }

   public String getTbm36_crt_prog_nm( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm ;
   }

   public void setTbm36_crt_prog_nm( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm = value ;
   }

   public java.util.Date getTbm36_upd_datetime( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime ;
   }

   public void setTbm36_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime = value ;
   }

   public String getTbm36_upd_user_id( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id ;
   }

   public void setTbm36_upd_user_id( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id = value ;
   }

   public String getTbm36_upd_prog_nm( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm ;
   }

   public void setTbm36_upd_prog_nm( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm = value ;
   }

   public long getTbm36_upd_cnt( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt ;
   }

   public void setTbm36_upd_cnt( long value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Initialized = value ;
   }

   public long getTbm36_study_id_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id_Z ;
   }

   public void setTbm36_study_id_Z( long value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id_Z = value ;
   }

   public short getTbm36_crf_id_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id_Z ;
   }

   public void setTbm36_crf_id_Z( short value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id_Z = value ;
   }

   public short getTbm36_cond_no_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no_Z ;
   }

   public void setTbm36_cond_no_Z( short value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no_Z = value ;
   }

   public short getTbm36_select_crf_id_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id_Z ;
   }

   public void setTbm36_select_crf_id_Z( short value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id_Z = value ;
   }

   public String getTbm36_del_flg_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z ;
   }

   public void setTbm36_del_flg_Z( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z = value ;
   }

   public java.util.Date getTbm36_crt_datetime_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z ;
   }

   public void setTbm36_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z = value ;
   }

   public String getTbm36_crt_user_id_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z ;
   }

   public void setTbm36_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z = value ;
   }

   public String getTbm36_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z ;
   }

   public void setTbm36_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm36_upd_datetime_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z ;
   }

   public void setTbm36_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z = value ;
   }

   public String getTbm36_upd_user_id_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z ;
   }

   public void setTbm36_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z = value ;
   }

   public String getTbm36_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z ;
   }

   public void setTbm36_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z = value ;
   }

   public long getTbm36_upd_cnt_Z( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z ;
   }

   public void setTbm36_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z = value ;
   }

   public byte getTbm36_del_flg_N( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_N ;
   }

   public void setTbm36_del_flg_N( byte value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_N = value ;
   }

   public byte getTbm36_crt_datetime_N( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_N ;
   }

   public void setTbm36_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_N = value ;
   }

   public byte getTbm36_crt_user_id_N( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_N ;
   }

   public void setTbm36_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_N = value ;
   }

   public byte getTbm36_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_N ;
   }

   public void setTbm36_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_N = value ;
   }

   public byte getTbm36_upd_datetime_N( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_N ;
   }

   public void setTbm36_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_N = value ;
   }

   public byte getTbm36_upd_user_id_N( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_N ;
   }

   public void setTbm36_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_N = value ;
   }

   public byte getTbm36_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_N ;
   }

   public void setTbm36_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_N = value ;
   }

   public byte getTbm36_upd_cnt_N( )
   {
      return gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_N ;
   }

   public void setTbm36_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_N ;
   protected byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_N ;
   protected byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_N ;
   protected byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_N ;
   protected byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_N ;
   protected byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_N ;
   protected short gxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id ;
   protected short gxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no ;
   protected short gxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id ;
   protected short gxTv_SdtTBM36_CRF_SELECT_Initialized ;
   protected short gxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id_Z ;
   protected short gxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no_Z ;
   protected short gxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id_Z ;
   protected long gxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id ;
   protected long gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt ;
   protected long gxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id_Z ;
   protected long gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_cnt_Z ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Mode ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg_Z ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_user_id_Z ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_user_id_Z ;
   protected String gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_datetime_Z ;
}

