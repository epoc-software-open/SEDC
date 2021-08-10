/*
               File: StructSdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem
        Description: B_TBM35_CRF_ITEM_AUTH
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:47.50
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem implements Cloneable, java.io.Serializable
{
   public StructSdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_item_cd = "" ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_auth_cd = "" ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_display_flg = "" ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_del_flg = "" ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_datetime = cal.getTime() ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_user_id = "" ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_prog_nm = "" ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_datetime = cal.getTime() ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_user_id = "" ;
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_prog_nm = "" ;
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

   public long getTbm35_study_id( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_id ;
   }

   public void setTbm35_study_id( long value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_id = value ;
   }

   public short getTbm35_crf_id( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_id ;
   }

   public void setTbm35_crf_id( short value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_id = value ;
   }

   public String getTbm35_crf_item_cd( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_item_cd ;
   }

   public void setTbm35_crf_item_cd( String value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_item_cd = value ;
   }

   public String getTbm35_study_auth_cd( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_auth_cd ;
   }

   public void setTbm35_study_auth_cd( String value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_auth_cd = value ;
   }

   public String getTbm35_display_flg( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_display_flg ;
   }

   public void setTbm35_display_flg( String value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_display_flg = value ;
   }

   public String getTbm35_del_flg( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_del_flg ;
   }

   public void setTbm35_del_flg( String value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_del_flg = value ;
   }

   public java.util.Date getTbm35_crt_datetime( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_datetime ;
   }

   public void setTbm35_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_datetime = value ;
   }

   public String getTbm35_crt_user_id( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_user_id ;
   }

   public void setTbm35_crt_user_id( String value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_user_id = value ;
   }

   public String getTbm35_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_prog_nm ;
   }

   public void setTbm35_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_prog_nm = value ;
   }

   public java.util.Date getTbm35_upd_datetime( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_datetime ;
   }

   public void setTbm35_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_datetime = value ;
   }

   public String getTbm35_upd_user_id( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_user_id ;
   }

   public void setTbm35_upd_user_id( String value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_user_id = value ;
   }

   public String getTbm35_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_prog_nm ;
   }

   public void setTbm35_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_prog_nm = value ;
   }

   public long getTbm35_upd_cnt( )
   {
      return gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_cnt ;
   }

   public void setTbm35_upd_cnt( long value )
   {
      gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_cnt = value ;
   }

   protected short gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_id ;
   protected long gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_id ;
   protected long gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_cnt ;
   protected String gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crf_item_cd ;
   protected String gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_study_auth_cd ;
   protected String gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_display_flg ;
   protected String gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_del_flg ;
   protected String gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_user_id ;
   protected String gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_prog_nm ;
   protected String gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_user_id ;
   protected String gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_prog_nm ;
   protected java.util.Date gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM35_CRF_ITEM_AUTH_B_TBM35_CRF_ITEM_AUTHItem_Tbm35_upd_datetime ;
}

