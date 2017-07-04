/*
               File: StructSdtTBM03_CDISC_ITEM
        Description: CDISCçÄñ⁄É}ÉXÉ^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:23.22
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM03_CDISC_ITEM implements Cloneable, java.io.Serializable
{
   public StructSdtTBM03_CDISC_ITEM( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Mode = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z = "" ;
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

   public String getTbm03_dom_cd( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd ;
   }

   public void setTbm03_dom_cd( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd = value ;
   }

   public String getTbm03_dom_var_nm( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm ;
   }

   public void setTbm03_dom_var_nm( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm = value ;
   }

   public String getTbm03_var_desc( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc ;
   }

   public void setTbm03_var_desc( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc = value ;
   }

   public String getTbm03_sdtm_flg( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg ;
   }

   public void setTbm03_sdtm_flg( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg = value ;
   }

   public String getTbm03_cdash_flg( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg ;
   }

   public void setTbm03_cdash_flg( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg = value ;
   }

   public String getTbm03_input_type_div( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div ;
   }

   public void setTbm03_input_type_div( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div = value ;
   }

   public String getTbm03_required_flg( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg ;
   }

   public void setTbm03_required_flg( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg = value ;
   }

   public String getTbm03_sas_field_nm( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm ;
   }

   public void setTbm03_sas_field_nm( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm = value ;
   }

   public String getTbm03_odm_data_type( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type ;
   }

   public void setTbm03_odm_data_type( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type = value ;
   }

   public String getTbm03_note( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note ;
   }

   public void setTbm03_note( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note = value ;
   }

   public int getTbm03_order( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order ;
   }

   public void setTbm03_order( int value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order = value ;
   }

   public String getTbm03_version( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version ;
   }

   public void setTbm03_version( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version = value ;
   }

   public String getTbm03_del_flg( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg ;
   }

   public void setTbm03_del_flg( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg = value ;
   }

   public java.util.Date getTbm03_crt_datetime( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime ;
   }

   public void setTbm03_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime = value ;
   }

   public String getTbm03_crt_user_id( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id ;
   }

   public void setTbm03_crt_user_id( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id = value ;
   }

   public String getTbm03_crt_prog_nm( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm ;
   }

   public void setTbm03_crt_prog_nm( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm = value ;
   }

   public java.util.Date getTbm03_upd_datetime( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime ;
   }

   public void setTbm03_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime = value ;
   }

   public String getTbm03_upd_user_id( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id ;
   }

   public void setTbm03_upd_user_id( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id = value ;
   }

   public String getTbm03_upd_prog_nm( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm ;
   }

   public void setTbm03_upd_prog_nm( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm = value ;
   }

   public long getTbm03_upd_cnt( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt ;
   }

   public void setTbm03_upd_cnt( long value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Initialized = value ;
   }

   public String getTbm03_dom_cd_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z ;
   }

   public void setTbm03_dom_cd_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z = value ;
   }

   public String getTbm03_dom_var_nm_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z ;
   }

   public void setTbm03_dom_var_nm_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z = value ;
   }

   public String getTbm03_var_desc_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z ;
   }

   public void setTbm03_var_desc_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z = value ;
   }

   public String getTbm03_sdtm_flg_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z ;
   }

   public void setTbm03_sdtm_flg_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z = value ;
   }

   public String getTbm03_cdash_flg_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z ;
   }

   public void setTbm03_cdash_flg_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z = value ;
   }

   public String getTbm03_input_type_div_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z ;
   }

   public void setTbm03_input_type_div_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z = value ;
   }

   public String getTbm03_required_flg_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z ;
   }

   public void setTbm03_required_flg_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z = value ;
   }

   public String getTbm03_sas_field_nm_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z ;
   }

   public void setTbm03_sas_field_nm_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z = value ;
   }

   public String getTbm03_odm_data_type_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z ;
   }

   public void setTbm03_odm_data_type_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z = value ;
   }

   public String getTbm03_note_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z ;
   }

   public void setTbm03_note_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z = value ;
   }

   public int getTbm03_order_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_Z ;
   }

   public void setTbm03_order_Z( int value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_Z = value ;
   }

   public String getTbm03_version_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z ;
   }

   public void setTbm03_version_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z = value ;
   }

   public String getTbm03_del_flg_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z ;
   }

   public void setTbm03_del_flg_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z = value ;
   }

   public java.util.Date getTbm03_crt_datetime_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z ;
   }

   public void setTbm03_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z = value ;
   }

   public String getTbm03_crt_user_id_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z ;
   }

   public void setTbm03_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z = value ;
   }

   public String getTbm03_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z ;
   }

   public void setTbm03_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm03_upd_datetime_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z ;
   }

   public void setTbm03_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z = value ;
   }

   public String getTbm03_upd_user_id_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z ;
   }

   public void setTbm03_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z = value ;
   }

   public String getTbm03_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z ;
   }

   public void setTbm03_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z = value ;
   }

   public long getTbm03_upd_cnt_Z( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z ;
   }

   public void setTbm03_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z = value ;
   }

   public byte getTbm03_var_desc_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_N ;
   }

   public void setTbm03_var_desc_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_N = value ;
   }

   public byte getTbm03_sdtm_flg_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_N ;
   }

   public void setTbm03_sdtm_flg_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_N = value ;
   }

   public byte getTbm03_cdash_flg_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_N ;
   }

   public void setTbm03_cdash_flg_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_N = value ;
   }

   public byte getTbm03_input_type_div_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_N ;
   }

   public void setTbm03_input_type_div_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_N = value ;
   }

   public byte getTbm03_required_flg_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_N ;
   }

   public void setTbm03_required_flg_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_N = value ;
   }

   public byte getTbm03_sas_field_nm_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_N ;
   }

   public void setTbm03_sas_field_nm_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_N = value ;
   }

   public byte getTbm03_odm_data_type_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_N ;
   }

   public void setTbm03_odm_data_type_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_N = value ;
   }

   public byte getTbm03_note_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_N ;
   }

   public void setTbm03_note_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_N = value ;
   }

   public byte getTbm03_order_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_N ;
   }

   public void setTbm03_order_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_N = value ;
   }

   public byte getTbm03_version_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_N ;
   }

   public void setTbm03_version_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_N = value ;
   }

   public byte getTbm03_del_flg_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_N ;
   }

   public void setTbm03_del_flg_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_N = value ;
   }

   public byte getTbm03_crt_datetime_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_N ;
   }

   public void setTbm03_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_N = value ;
   }

   public byte getTbm03_crt_user_id_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_N ;
   }

   public void setTbm03_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_N = value ;
   }

   public byte getTbm03_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_N ;
   }

   public void setTbm03_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_N = value ;
   }

   public byte getTbm03_upd_datetime_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_N ;
   }

   public void setTbm03_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_N = value ;
   }

   public byte getTbm03_upd_user_id_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_N ;
   }

   public void setTbm03_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_N = value ;
   }

   public byte getTbm03_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_N ;
   }

   public void setTbm03_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_N = value ;
   }

   public byte getTbm03_upd_cnt_N( )
   {
      return gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_N ;
   }

   public void setTbm03_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_N ;
   protected short gxTv_SdtTBM03_CDISC_ITEM_Initialized ;
   protected int gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order ;
   protected int gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_Z ;
   protected long gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt ;
   protected long gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Mode ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z ;
   protected String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z ;
}

