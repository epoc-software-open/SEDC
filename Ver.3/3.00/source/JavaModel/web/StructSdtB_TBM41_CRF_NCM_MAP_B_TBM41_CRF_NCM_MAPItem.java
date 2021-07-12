/*
               File: StructSdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem
        Description: B_TBM41_CRF_NCM_MAP
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:47.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem implements Cloneable, java.io.Serializable
{
   public StructSdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime = cal.getTime() ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime = cal.getTime() ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm = "" ;
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

   public long getTbm41_study_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id ;
   }

   public void setTbm41_study_id( long value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id = value ;
   }

   public short getTbm41_crf_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id ;
   }

   public void setTbm41_crf_id( short value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id = value ;
   }

   public String getTbm41_crf_item_grp_div( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div ;
   }

   public void setTbm41_crf_item_grp_div( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div = value ;
   }

   public String getTbm41_crf_item_grp_cd( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd ;
   }

   public void setTbm41_crf_item_grp_cd( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd = value ;
   }

   public String getTbm41_ncm_metadata_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id ;
   }

   public void setTbm41_ncm_metadata_id( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id = value ;
   }

   public String getTbm41_del_flg( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg ;
   }

   public void setTbm41_del_flg( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg = value ;
   }

   public java.util.Date getTbm41_crt_datetime( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime ;
   }

   public void setTbm41_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime = value ;
   }

   public String getTbm41_crt_user_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id ;
   }

   public void setTbm41_crt_user_id( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id = value ;
   }

   public String getTbm41_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm ;
   }

   public void setTbm41_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm = value ;
   }

   public java.util.Date getTbm41_upd_datetime( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime ;
   }

   public void setTbm41_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime = value ;
   }

   public String getTbm41_upd_user_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id ;
   }

   public void setTbm41_upd_user_id( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id = value ;
   }

   public String getTbm41_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm ;
   }

   public void setTbm41_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm = value ;
   }

   public long getTbm41_upd_cnt( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt ;
   }

   public void setTbm41_upd_cnt( long value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt = value ;
   }

   protected short gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id ;
   protected long gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id ;
   protected long gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm ;
   protected java.util.Date gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime ;
}

