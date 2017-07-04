/*
               File: StructSdtTBM37_CRF_DOM_MAP
        Description: CRF-ドメインマッピングマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:52.89
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM37_CRF_DOM_MAP implements Cloneable, java.io.Serializable
{
   public StructSdtTBM37_CRF_DOM_MAP( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Mode = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_Z = "" ;
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_Z = "" ;
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

   public long getTbm37_study_id( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id ;
   }

   public void setTbm37_study_id( long value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id = value ;
   }

   public short getTbm37_crf_id( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id ;
   }

   public void setTbm37_crf_id( short value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id = value ;
   }

   public String getTbm37_crf_item_grp_div( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div ;
   }

   public void setTbm37_crf_item_grp_div( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div = value ;
   }

   public String getTbm37_crf_item_grp_cd( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd ;
   }

   public void setTbm37_crf_item_grp_cd( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd = value ;
   }

   public int getTbm37_visit_no( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no ;
   }

   public void setTbm37_visit_no( int value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no = value ;
   }

   public String getTbm37_dom_cd( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd ;
   }

   public void setTbm37_dom_cd( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd = value ;
   }

   public String getTbm37_dom_var_nm( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm ;
   }

   public void setTbm37_dom_var_nm( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm = value ;
   }

   public String getTbm37_dom_itm_grp_oid( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid ;
   }

   public void setTbm37_dom_itm_grp_oid( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid = value ;
   }

   public short getTbm37_dom_itm_grp_attr_seq( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq ;
   }

   public void setTbm37_dom_itm_grp_attr_seq( short value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq = value ;
   }

   public short getTbm37_dom_itm_grp_rowno( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno ;
   }

   public void setTbm37_dom_itm_grp_rowno( short value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno = value ;
   }

   public String getTbm37_del_flg( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg ;
   }

   public void setTbm37_del_flg( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg = value ;
   }

   public java.util.Date getTbm37_crt_datetime( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime ;
   }

   public void setTbm37_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime = value ;
   }

   public String getTbm37_crt_user_id( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id ;
   }

   public void setTbm37_crt_user_id( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id = value ;
   }

   public String getTbm37_crt_prog_nm( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm ;
   }

   public void setTbm37_crt_prog_nm( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm = value ;
   }

   public java.util.Date getTbm37_upd_datetime( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime ;
   }

   public void setTbm37_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime = value ;
   }

   public String getTbm37_upd_user_id( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id ;
   }

   public void setTbm37_upd_user_id( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id = value ;
   }

   public String getTbm37_upd_prog_nm( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm ;
   }

   public void setTbm37_upd_prog_nm( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm = value ;
   }

   public long getTbm37_upd_cnt( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt ;
   }

   public void setTbm37_upd_cnt( long value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Initialized = value ;
   }

   public long getTbm37_study_id_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id_Z ;
   }

   public void setTbm37_study_id_Z( long value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id_Z = value ;
   }

   public short getTbm37_crf_id_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id_Z ;
   }

   public void setTbm37_crf_id_Z( short value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id_Z = value ;
   }

   public String getTbm37_crf_item_grp_div_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div_Z ;
   }

   public void setTbm37_crf_item_grp_div_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div_Z = value ;
   }

   public String getTbm37_crf_item_grp_cd_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd_Z ;
   }

   public void setTbm37_crf_item_grp_cd_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd_Z = value ;
   }

   public int getTbm37_visit_no_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_Z ;
   }

   public void setTbm37_visit_no_Z( int value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_Z = value ;
   }

   public String getTbm37_dom_cd_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_Z ;
   }

   public void setTbm37_dom_cd_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_Z = value ;
   }

   public String getTbm37_dom_var_nm_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_Z ;
   }

   public void setTbm37_dom_var_nm_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_Z = value ;
   }

   public String getTbm37_dom_itm_grp_oid_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_Z ;
   }

   public void setTbm37_dom_itm_grp_oid_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_Z = value ;
   }

   public short getTbm37_dom_itm_grp_attr_seq_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_Z ;
   }

   public void setTbm37_dom_itm_grp_attr_seq_Z( short value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_Z = value ;
   }

   public short getTbm37_dom_itm_grp_rowno_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_Z ;
   }

   public void setTbm37_dom_itm_grp_rowno_Z( short value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_Z = value ;
   }

   public String getTbm37_del_flg_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_Z ;
   }

   public void setTbm37_del_flg_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_Z = value ;
   }

   public java.util.Date getTbm37_crt_datetime_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_Z ;
   }

   public void setTbm37_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_Z = value ;
   }

   public String getTbm37_crt_user_id_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_Z ;
   }

   public void setTbm37_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_Z = value ;
   }

   public String getTbm37_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_Z ;
   }

   public void setTbm37_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm37_upd_datetime_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_Z ;
   }

   public void setTbm37_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_Z = value ;
   }

   public String getTbm37_upd_user_id_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_Z ;
   }

   public void setTbm37_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_Z = value ;
   }

   public String getTbm37_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_Z ;
   }

   public void setTbm37_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_Z = value ;
   }

   public long getTbm37_upd_cnt_Z( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_Z ;
   }

   public void setTbm37_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_Z = value ;
   }

   public byte getTbm37_visit_no_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_N ;
   }

   public void setTbm37_visit_no_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_N = value ;
   }

   public byte getTbm37_dom_cd_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_N ;
   }

   public void setTbm37_dom_cd_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_N = value ;
   }

   public byte getTbm37_dom_var_nm_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_N ;
   }

   public void setTbm37_dom_var_nm_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_N = value ;
   }

   public byte getTbm37_dom_itm_grp_oid_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_N ;
   }

   public void setTbm37_dom_itm_grp_oid_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_N = value ;
   }

   public byte getTbm37_dom_itm_grp_attr_seq_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_N ;
   }

   public void setTbm37_dom_itm_grp_attr_seq_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_N = value ;
   }

   public byte getTbm37_dom_itm_grp_rowno_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_N ;
   }

   public void setTbm37_dom_itm_grp_rowno_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_N = value ;
   }

   public byte getTbm37_del_flg_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_N ;
   }

   public void setTbm37_del_flg_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_N = value ;
   }

   public byte getTbm37_crt_datetime_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_N ;
   }

   public void setTbm37_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_N = value ;
   }

   public byte getTbm37_crt_user_id_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_N ;
   }

   public void setTbm37_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_N = value ;
   }

   public byte getTbm37_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_N ;
   }

   public void setTbm37_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_N = value ;
   }

   public byte getTbm37_upd_datetime_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_N ;
   }

   public void setTbm37_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_N = value ;
   }

   public byte getTbm37_upd_user_id_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_N ;
   }

   public void setTbm37_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_N = value ;
   }

   public byte getTbm37_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_N ;
   }

   public void setTbm37_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_N = value ;
   }

   public byte getTbm37_upd_cnt_N( )
   {
      return gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_N ;
   }

   public void setTbm37_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_N ;
   protected short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id ;
   protected short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq ;
   protected short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno ;
   protected short gxTv_SdtTBM37_CRF_DOM_MAP_Initialized ;
   protected short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_id_Z ;
   protected short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_attr_seq_Z ;
   protected short gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_rowno_Z ;
   protected int gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no ;
   protected int gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_visit_no_Z ;
   protected long gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id ;
   protected long gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt ;
   protected long gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_study_id_Z ;
   protected long gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_cnt_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Mode ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_div_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crf_item_grp_cd_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_cd_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_var_nm_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_dom_itm_grp_oid_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_del_flg_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_user_id_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_user_id_Z ;
   protected String gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM37_CRF_DOM_MAP_Tbm37_upd_datetime_Z ;
}

