/*
               File: StructSdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem
        Description: B_TBM36_CRF_SELECT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:47.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg = "" ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime = cal.getTime() ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id = "" ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm = "" ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime = cal.getTime() ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id = "" ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm = "" ;
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
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id ;
   }

   public void setTbm36_study_id( long value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id = value ;
   }

   public short getTbm36_crf_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id ;
   }

   public void setTbm36_crf_id( short value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id = value ;
   }

   public short getTbm36_cond_no( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no ;
   }

   public void setTbm36_cond_no( short value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no = value ;
   }

   public short getTbm36_select_crf_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id ;
   }

   public void setTbm36_select_crf_id( short value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id = value ;
   }

   public String getTbm36_del_flg( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg ;
   }

   public void setTbm36_del_flg( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg = value ;
   }

   public java.util.Date getTbm36_crt_datetime( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime ;
   }

   public void setTbm36_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime = value ;
   }

   public String getTbm36_crt_user_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id ;
   }

   public void setTbm36_crt_user_id( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id = value ;
   }

   public String getTbm36_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm ;
   }

   public void setTbm36_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm = value ;
   }

   public java.util.Date getTbm36_upd_datetime( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime ;
   }

   public void setTbm36_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime = value ;
   }

   public String getTbm36_upd_user_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id ;
   }

   public void setTbm36_upd_user_id( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id = value ;
   }

   public String getTbm36_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm ;
   }

   public void setTbm36_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm = value ;
   }

   public long getTbm36_upd_cnt( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt ;
   }

   public void setTbm36_upd_cnt( long value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt = value ;
   }

   protected short gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id ;
   protected short gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no ;
   protected short gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id ;
   protected long gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id ;
   protected long gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm ;
   protected java.util.Date gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime ;
}

