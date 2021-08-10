/*
               File: StructSdtTBM26_SEL_LIST_ITEM
        Description: 選択リスト項目マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:41.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM26_SEL_LIST_ITEM implements Cloneable, java.io.Serializable
{
   public StructSdtTBM26_SEL_LIST_ITEM( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z = "" ;
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

   public long getTbm26_study_id( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id ;
   }

   public void setTbm26_study_id( long value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id = value ;
   }

   public String getTbm26_list_cd( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd ;
   }

   public void setTbm26_list_cd( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd = value ;
   }

   public short getTbm26_list_item_no( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no ;
   }

   public void setTbm26_list_item_no( short value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no = value ;
   }

   public String getTbm26_list_item_name( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name ;
   }

   public void setTbm26_list_item_name( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name = value ;
   }

   public String getTbm26_inner_value( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value ;
   }

   public void setTbm26_inner_value( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value = value ;
   }

   public String getTbm26_del_flg( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg ;
   }

   public void setTbm26_del_flg( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg = value ;
   }

   public java.util.Date getTbm26_crt_datetime( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime ;
   }

   public void setTbm26_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime = value ;
   }

   public String getTbm26_crt_user_id( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id ;
   }

   public void setTbm26_crt_user_id( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id = value ;
   }

   public String getTbm26_crt_prog_nm( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm ;
   }

   public void setTbm26_crt_prog_nm( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm = value ;
   }

   public java.util.Date getTbm26_upd_datetime( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime ;
   }

   public void setTbm26_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime = value ;
   }

   public String getTbm26_upd_user_id( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id ;
   }

   public void setTbm26_upd_user_id( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id = value ;
   }

   public String getTbm26_upd_prog_nm( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm ;
   }

   public void setTbm26_upd_prog_nm( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm = value ;
   }

   public long getTbm26_upd_cnt( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt ;
   }

   public void setTbm26_upd_cnt( long value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized = value ;
   }

   public long getTbm26_study_id_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z ;
   }

   public void setTbm26_study_id_Z( long value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z = value ;
   }

   public String getTbm26_list_cd_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z ;
   }

   public void setTbm26_list_cd_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z = value ;
   }

   public short getTbm26_list_item_no_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z ;
   }

   public void setTbm26_list_item_no_Z( short value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z = value ;
   }

   public String getTbm26_list_item_name_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z ;
   }

   public void setTbm26_list_item_name_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z = value ;
   }

   public String getTbm26_inner_value_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z ;
   }

   public void setTbm26_inner_value_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z = value ;
   }

   public String getTbm26_del_flg_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z ;
   }

   public void setTbm26_del_flg_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z = value ;
   }

   public java.util.Date getTbm26_crt_datetime_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z ;
   }

   public void setTbm26_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z = value ;
   }

   public String getTbm26_crt_user_id_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z ;
   }

   public void setTbm26_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z = value ;
   }

   public String getTbm26_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z ;
   }

   public void setTbm26_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm26_upd_datetime_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z ;
   }

   public void setTbm26_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z = value ;
   }

   public String getTbm26_upd_user_id_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z ;
   }

   public void setTbm26_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z = value ;
   }

   public String getTbm26_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z ;
   }

   public void setTbm26_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z = value ;
   }

   public long getTbm26_upd_cnt_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z ;
   }

   public void setTbm26_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z = value ;
   }

   public byte getTbm26_list_item_name_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N ;
   }

   public void setTbm26_list_item_name_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N = value ;
   }

   public byte getTbm26_inner_value_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N ;
   }

   public void setTbm26_inner_value_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N = value ;
   }

   public byte getTbm26_del_flg_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N ;
   }

   public void setTbm26_del_flg_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N = value ;
   }

   public byte getTbm26_crt_datetime_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N ;
   }

   public void setTbm26_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N = value ;
   }

   public byte getTbm26_crt_user_id_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N ;
   }

   public void setTbm26_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N = value ;
   }

   public byte getTbm26_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N ;
   }

   public void setTbm26_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N = value ;
   }

   public byte getTbm26_upd_datetime_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N ;
   }

   public void setTbm26_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N = value ;
   }

   public byte getTbm26_upd_user_id_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N ;
   }

   public void setTbm26_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N = value ;
   }

   public byte getTbm26_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N ;
   }

   public void setTbm26_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N = value ;
   }

   public byte getTbm26_upd_cnt_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N ;
   }

   public void setTbm26_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N ;
   protected short gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no ;
   protected short gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized ;
   protected short gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z ;
   protected long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id ;
   protected long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt ;
   protected long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z ;
   protected long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Mode ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z ;
   protected String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z ;
}

