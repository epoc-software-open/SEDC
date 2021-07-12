/*
               File: StructSdtTBM42_STUDY_CDISC_DOMAIN
        Description: 試験別CDISCドメインマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:12.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBM42_STUDY_CDISC_DOMAIN implements Cloneable, java.io.Serializable
{
   public StructSdtTBM42_STUDY_CDISC_DOMAIN( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime = cal.getTime() ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime = cal.getTime() ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z = "" ;
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

   public long getTbm42_study_id( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id ;
   }

   public void setTbm42_study_id( long value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id = value ;
   }

   public String getTbm42_dom_cd( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd ;
   }

   public void setTbm42_dom_cd( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd = value ;
   }

   public String getTbm42_dom_enm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm ;
   }

   public void setTbm42_dom_enm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm = value ;
   }

   public String getTbm42_dom_jnm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm ;
   }

   public void setTbm42_dom_jnm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm = value ;
   }

   public String getTbm42_dom_grp_nm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm ;
   }

   public void setTbm42_dom_grp_nm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm = value ;
   }

   public String getTbm42_note( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note ;
   }

   public void setTbm42_note( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note = value ;
   }

   public int getTbm42_order( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order ;
   }

   public void setTbm42_order( int value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order = value ;
   }

   public String getTbm42_del_flg( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg ;
   }

   public void setTbm42_del_flg( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg = value ;
   }

   public java.util.Date getTbm42_crt_datetime( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime ;
   }

   public void setTbm42_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime = value ;
   }

   public String getTbm42_crt_user_id( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id ;
   }

   public void setTbm42_crt_user_id( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id = value ;
   }

   public String getTbm42_crt_prog_nm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm ;
   }

   public void setTbm42_crt_prog_nm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm = value ;
   }

   public java.util.Date getTbm42_upd_datetime( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime ;
   }

   public void setTbm42_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime = value ;
   }

   public String getTbm42_upd_user_id( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id ;
   }

   public void setTbm42_upd_user_id( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id = value ;
   }

   public String getTbm42_upd_prog_nm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm ;
   }

   public void setTbm42_upd_prog_nm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm = value ;
   }

   public long getTbm42_upd_cnt( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt ;
   }

   public void setTbm42_upd_cnt( long value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized = value ;
   }

   public long getTbm42_study_id_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z ;
   }

   public void setTbm42_study_id_Z( long value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z = value ;
   }

   public String getTbm42_dom_cd_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z ;
   }

   public void setTbm42_dom_cd_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z = value ;
   }

   public String getTbm42_dom_enm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z ;
   }

   public void setTbm42_dom_enm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z = value ;
   }

   public String getTbm42_dom_jnm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z ;
   }

   public void setTbm42_dom_jnm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z = value ;
   }

   public String getTbm42_dom_grp_nm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z ;
   }

   public void setTbm42_dom_grp_nm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z = value ;
   }

   public String getTbm42_note_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z ;
   }

   public void setTbm42_note_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z = value ;
   }

   public int getTbm42_order_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z ;
   }

   public void setTbm42_order_Z( int value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z = value ;
   }

   public String getTbm42_del_flg_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z ;
   }

   public void setTbm42_del_flg_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z = value ;
   }

   public java.util.Date getTbm42_crt_datetime_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z ;
   }

   public void setTbm42_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z = value ;
   }

   public String getTbm42_crt_user_id_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z ;
   }

   public void setTbm42_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z = value ;
   }

   public String getTbm42_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z ;
   }

   public void setTbm42_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbm42_upd_datetime_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z ;
   }

   public void setTbm42_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z = value ;
   }

   public String getTbm42_upd_user_id_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z ;
   }

   public void setTbm42_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z = value ;
   }

   public String getTbm42_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z ;
   }

   public void setTbm42_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z = value ;
   }

   public long getTbm42_upd_cnt_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z ;
   }

   public void setTbm42_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z = value ;
   }

   public byte getTbm42_dom_enm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N ;
   }

   public void setTbm42_dom_enm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N = value ;
   }

   public byte getTbm42_dom_jnm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N ;
   }

   public void setTbm42_dom_jnm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N = value ;
   }

   public byte getTbm42_dom_grp_nm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N ;
   }

   public void setTbm42_dom_grp_nm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N = value ;
   }

   public byte getTbm42_note_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N ;
   }

   public void setTbm42_note_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N = value ;
   }

   public byte getTbm42_order_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N ;
   }

   public void setTbm42_order_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N = value ;
   }

   public byte getTbm42_del_flg_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N ;
   }

   public void setTbm42_del_flg_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N = value ;
   }

   public byte getTbm42_crt_datetime_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N ;
   }

   public void setTbm42_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N = value ;
   }

   public byte getTbm42_crt_user_id_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N ;
   }

   public void setTbm42_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N = value ;
   }

   public byte getTbm42_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N ;
   }

   public void setTbm42_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N = value ;
   }

   public byte getTbm42_upd_datetime_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N ;
   }

   public void setTbm42_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N = value ;
   }

   public byte getTbm42_upd_user_id_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N ;
   }

   public void setTbm42_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N = value ;
   }

   public byte getTbm42_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N ;
   }

   public void setTbm42_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N = value ;
   }

   public byte getTbm42_upd_cnt_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N ;
   }

   public void setTbm42_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N ;
   protected byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N ;
   protected short gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized ;
   protected int gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order ;
   protected int gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z ;
   protected long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id ;
   protected long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt ;
   protected long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z ;
   protected long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z ;
   protected String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime ;
   protected java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime ;
   protected java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z ;
}

