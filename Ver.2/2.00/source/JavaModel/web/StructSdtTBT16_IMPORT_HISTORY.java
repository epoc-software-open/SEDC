/*
               File: StructSdtTBT16_IMPORT_HISTORY
        Description: 選択一覧取込履歴テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:33.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBT16_IMPORT_HISTORY implements Cloneable, java.io.Serializable
{
   public StructSdtTBT16_IMPORT_HISTORY( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime = cal.getTime() ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime = cal.getTime() ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime = cal.getTime() ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Mode = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z = "" ;
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

   public long getTbt16_import_no( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no ;
   }

   public void setTbt16_import_no( long value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no = value ;
   }

   public String getTbt16_import_file_nm( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm ;
   }

   public void setTbt16_import_file_nm( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm = value ;
   }

   public String getTbt16_file_nm( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm ;
   }

   public void setTbt16_file_nm( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm = value ;
   }

   public java.util.Date getTbt16_import_datetime( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime ;
   }

   public void setTbt16_import_datetime( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime = value ;
   }

   public String getTbt16_del_flg( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg ;
   }

   public void setTbt16_del_flg( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg = value ;
   }

   public java.util.Date getTbt16_crt_datetime( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime ;
   }

   public void setTbt16_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime = value ;
   }

   public String getTbt16_crt_user_id( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id ;
   }

   public void setTbt16_crt_user_id( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id = value ;
   }

   public String getTbt16_crt_prog_nm( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm ;
   }

   public void setTbt16_crt_prog_nm( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm = value ;
   }

   public java.util.Date getTbt16_upd_datetime( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime ;
   }

   public void setTbt16_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime = value ;
   }

   public String getTbt16_upd_user_id( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id ;
   }

   public void setTbt16_upd_user_id( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id = value ;
   }

   public String getTbt16_upd_prog_nm( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm ;
   }

   public void setTbt16_upd_prog_nm( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm = value ;
   }

   public long getTbt16_upd_cnt( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt ;
   }

   public void setTbt16_upd_cnt( long value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Initialized = value ;
   }

   public long getTbt16_import_no_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z ;
   }

   public void setTbt16_import_no_Z( long value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z = value ;
   }

   public String getTbt16_import_file_nm_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z ;
   }

   public void setTbt16_import_file_nm_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z = value ;
   }

   public String getTbt16_file_nm_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z ;
   }

   public void setTbt16_file_nm_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z = value ;
   }

   public java.util.Date getTbt16_import_datetime_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z ;
   }

   public void setTbt16_import_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z = value ;
   }

   public String getTbt16_del_flg_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z ;
   }

   public void setTbt16_del_flg_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z = value ;
   }

   public java.util.Date getTbt16_crt_datetime_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z ;
   }

   public void setTbt16_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z = value ;
   }

   public String getTbt16_crt_user_id_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z ;
   }

   public void setTbt16_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z = value ;
   }

   public String getTbt16_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z ;
   }

   public void setTbt16_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbt16_upd_datetime_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z ;
   }

   public void setTbt16_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z = value ;
   }

   public String getTbt16_upd_user_id_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z ;
   }

   public void setTbt16_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z = value ;
   }

   public String getTbt16_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z ;
   }

   public void setTbt16_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z = value ;
   }

   public long getTbt16_upd_cnt_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z ;
   }

   public void setTbt16_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z = value ;
   }

   public byte getTbt16_import_file_nm_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N ;
   }

   public void setTbt16_import_file_nm_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N = value ;
   }

   public byte getTbt16_file_nm_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N ;
   }

   public void setTbt16_file_nm_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N = value ;
   }

   public byte getTbt16_import_datetime_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N ;
   }

   public void setTbt16_import_datetime_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N = value ;
   }

   public byte getTbt16_del_flg_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N ;
   }

   public void setTbt16_del_flg_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N = value ;
   }

   public byte getTbt16_crt_datetime_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N ;
   }

   public void setTbt16_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N = value ;
   }

   public byte getTbt16_crt_user_id_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N ;
   }

   public void setTbt16_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N = value ;
   }

   public byte getTbt16_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N ;
   }

   public void setTbt16_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N = value ;
   }

   public byte getTbt16_upd_datetime_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N ;
   }

   public void setTbt16_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N = value ;
   }

   public byte getTbt16_upd_user_id_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N ;
   }

   public void setTbt16_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N = value ;
   }

   public byte getTbt16_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N ;
   }

   public void setTbt16_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N = value ;
   }

   public byte getTbt16_upd_cnt_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N ;
   }

   public void setTbt16_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N ;
   protected byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N ;
   protected short gxTv_SdtTBT16_IMPORT_HISTORY_Initialized ;
   protected long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no ;
   protected long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt ;
   protected long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z ;
   protected long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Mode ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z ;
   protected String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime ;
   protected java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime ;
   protected java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime ;
   protected java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z ;
}

