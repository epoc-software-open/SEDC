/*
               File: StructSdtTBT15_CRF_MEMO_LOC
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:22.14
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtTBT15_CRF_MEMO_LOC implements Cloneable, java.io.Serializable
{
   public StructSdtTBT15_CRF_MEMO_LOC( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime = cal.getTime() ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime = cal.getTime() ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z = cal.getTime() ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z = "" ;
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

   public long getTbt15_study_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id ;
   }

   public void setTbt15_study_id( long value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id = value ;
   }

   public int getTbt15_subject_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id ;
   }

   public void setTbt15_subject_id( int value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id = value ;
   }

   public short getTbt15_memo_no( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no ;
   }

   public void setTbt15_memo_no( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no = value ;
   }

   public short getTbt15_crf_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id ;
   }

   public void setTbt15_crf_id( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id = value ;
   }

   public byte getTbt15_crf_eda_no( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no ;
   }

   public void setTbt15_crf_eda_no( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no = value ;
   }

   public short getTbt15_crf_version( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version ;
   }

   public void setTbt15_crf_version( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version = value ;
   }

   public String getTbt15_crf_item_grp_div( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div ;
   }

   public void setTbt15_crf_item_grp_div( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div = value ;
   }

   public String getTbt15_crf_item_grp_cd( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd ;
   }

   public void setTbt15_crf_item_grp_cd( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd = value ;
   }

   public String getTbt15_del_flg( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg ;
   }

   public void setTbt15_del_flg( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg = value ;
   }

   public java.util.Date getTbt15_crt_datetime( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime ;
   }

   public void setTbt15_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime = value ;
   }

   public String getTbt15_crt_user_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id ;
   }

   public void setTbt15_crt_user_id( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id = value ;
   }

   public String getTbt15_crt_prog_nm( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm ;
   }

   public void setTbt15_crt_prog_nm( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm = value ;
   }

   public java.util.Date getTbt15_upd_datetime( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime ;
   }

   public void setTbt15_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime = value ;
   }

   public String getTbt15_upd_user_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id ;
   }

   public void setTbt15_upd_user_id( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id = value ;
   }

   public String getTbt15_upd_prog_nm( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm ;
   }

   public void setTbt15_upd_prog_nm( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm = value ;
   }

   public long getTbt15_upd_cnt( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt ;
   }

   public void setTbt15_upd_cnt( long value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized = value ;
   }

   public long getTbt15_study_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z ;
   }

   public void setTbt15_study_id_Z( long value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z = value ;
   }

   public int getTbt15_subject_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z ;
   }

   public void setTbt15_subject_id_Z( int value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z = value ;
   }

   public short getTbt15_memo_no_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z ;
   }

   public void setTbt15_memo_no_Z( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z = value ;
   }

   public short getTbt15_crf_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z ;
   }

   public void setTbt15_crf_id_Z( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z = value ;
   }

   public byte getTbt15_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z ;
   }

   public void setTbt15_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z = value ;
   }

   public short getTbt15_crf_version_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z ;
   }

   public void setTbt15_crf_version_Z( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z = value ;
   }

   public String getTbt15_crf_item_grp_div_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z ;
   }

   public void setTbt15_crf_item_grp_div_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z = value ;
   }

   public String getTbt15_crf_item_grp_cd_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z ;
   }

   public void setTbt15_crf_item_grp_cd_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z = value ;
   }

   public String getTbt15_del_flg_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z ;
   }

   public void setTbt15_del_flg_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z = value ;
   }

   public java.util.Date getTbt15_crt_datetime_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z ;
   }

   public void setTbt15_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z = value ;
   }

   public String getTbt15_crt_user_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z ;
   }

   public void setTbt15_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z = value ;
   }

   public String getTbt15_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z ;
   }

   public void setTbt15_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z = value ;
   }

   public java.util.Date getTbt15_upd_datetime_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z ;
   }

   public void setTbt15_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z = value ;
   }

   public String getTbt15_upd_user_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z ;
   }

   public void setTbt15_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z = value ;
   }

   public String getTbt15_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z ;
   }

   public void setTbt15_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z = value ;
   }

   public long getTbt15_upd_cnt_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z ;
   }

   public void setTbt15_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z = value ;
   }

   public byte getTbt15_crf_id_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N ;
   }

   public void setTbt15_crf_id_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N = value ;
   }

   public byte getTbt15_crf_eda_no_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N ;
   }

   public void setTbt15_crf_eda_no_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N = value ;
   }

   public byte getTbt15_crf_version_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N ;
   }

   public void setTbt15_crf_version_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N = value ;
   }

   public byte getTbt15_crf_item_grp_div_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N ;
   }

   public void setTbt15_crf_item_grp_div_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N = value ;
   }

   public byte getTbt15_crf_item_grp_cd_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N ;
   }

   public void setTbt15_crf_item_grp_cd_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N = value ;
   }

   public byte getTbt15_del_flg_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N ;
   }

   public void setTbt15_del_flg_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N = value ;
   }

   public byte getTbt15_crt_datetime_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N ;
   }

   public void setTbt15_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N = value ;
   }

   public byte getTbt15_crt_user_id_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N ;
   }

   public void setTbt15_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N = value ;
   }

   public byte getTbt15_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N ;
   }

   public void setTbt15_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N = value ;
   }

   public byte getTbt15_upd_datetime_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N ;
   }

   public void setTbt15_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N = value ;
   }

   public byte getTbt15_upd_user_id_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N ;
   }

   public void setTbt15_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N = value ;
   }

   public byte getTbt15_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N ;
   }

   public void setTbt15_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N = value ;
   }

   public byte getTbt15_upd_cnt_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N ;
   }

   public void setTbt15_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N = value ;
   }

   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N ;
   protected byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N ;
   protected short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no ;
   protected short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id ;
   protected short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version ;
   protected short gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized ;
   protected short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z ;
   protected short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z ;
   protected short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z ;
   protected int gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id ;
   protected int gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z ;
   protected long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id ;
   protected long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt ;
   protected long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z ;
   protected long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Mode ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z ;
   protected String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z ;
   protected java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime ;
   protected java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime ;
   protected java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z ;
   protected java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z ;
}

