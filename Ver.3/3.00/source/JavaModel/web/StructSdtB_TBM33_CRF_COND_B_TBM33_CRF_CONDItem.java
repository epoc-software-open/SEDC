/*
               File: StructSdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem
        Description: B_TBM33_CRF_COND
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:47.26
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem implements Cloneable, java.io.Serializable
{
   public StructSdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime = cal.getTime() ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime = cal.getTime() ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm = "" ;
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

   public long getTbm33_study_id( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id ;
   }

   public void setTbm33_study_id( long value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id = value ;
   }

   public short getTbm33_crf_id( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id ;
   }

   public void setTbm33_crf_id( short value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id = value ;
   }

   public short getTbm33_cond_no( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no ;
   }

   public void setTbm33_cond_no( short value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no = value ;
   }

   public String getTbm33_cond_nm( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm ;
   }

   public void setTbm33_cond_nm( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm = value ;
   }

   public String getTbm33_expression( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression ;
   }

   public void setTbm33_expression( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression = value ;
   }

   public String getTbm33_cond_div( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div ;
   }

   public void setTbm33_cond_div( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div = value ;
   }

   public String getTbm33_crf_item_cd( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd ;
   }

   public void setTbm33_crf_item_cd( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd = value ;
   }

   public short getTbm33_prior_no( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no ;
   }

   public void setTbm33_prior_no( short value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no = value ;
   }

   public String getTbm33_err_div( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div ;
   }

   public void setTbm33_err_div( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div = value ;
   }

   public String getTbm33_err_msg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg ;
   }

   public void setTbm33_err_msg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg = value ;
   }

   public String getTbm33_enabled_flg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg ;
   }

   public void setTbm33_enabled_flg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg = value ;
   }

   public String getTbm33_required_input_flg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg ;
   }

   public void setTbm33_required_input_flg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg = value ;
   }

   public String getTbm33_numeric_range_flg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg ;
   }

   public void setTbm33_numeric_range_flg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg = value ;
   }

   public String getTbm33_del_flg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg ;
   }

   public void setTbm33_del_flg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg = value ;
   }

   public java.util.Date getTbm33_crt_datetime( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime ;
   }

   public void setTbm33_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime = value ;
   }

   public String getTbm33_crt_user_id( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id ;
   }

   public void setTbm33_crt_user_id( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id = value ;
   }

   public String getTbm33_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm ;
   }

   public void setTbm33_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm = value ;
   }

   public java.util.Date getTbm33_upd_datetime( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime ;
   }

   public void setTbm33_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime = value ;
   }

   public String getTbm33_upd_user_id( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id ;
   }

   public void setTbm33_upd_user_id( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id = value ;
   }

   public String getTbm33_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm ;
   }

   public void setTbm33_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm = value ;
   }

   public long getTbm33_upd_cnt( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt ;
   }

   public void setTbm33_upd_cnt( long value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt = value ;
   }

   protected short gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id ;
   protected short gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no ;
   protected short gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no ;
   protected long gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id ;
   protected long gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm ;
   protected java.util.Date gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime ;
}

