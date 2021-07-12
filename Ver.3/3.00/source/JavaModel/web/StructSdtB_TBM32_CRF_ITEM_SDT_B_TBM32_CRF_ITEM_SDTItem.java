/*
               File: StructSdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem
        Description: B_TBM32_CRF_ITEM_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:47.6
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime = cal.getTime() ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime = cal.getTime() ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm = "" ;
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

   public long getTbm32_study_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id ;
   }

   public void setTbm32_study_id( long value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id = value ;
   }

   public short getTbm32_crf_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id ;
   }

   public void setTbm32_crf_id( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id = value ;
   }

   public String getTbm32_crf_item_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd ;
   }

   public void setTbm32_crf_item_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd = value ;
   }

   public String getTbm32_crf_item_nm( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm ;
   }

   public void setTbm32_crf_item_nm( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm = value ;
   }

   public String getTbm32_crf_item_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div ;
   }

   public void setTbm32_crf_item_div( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div = value ;
   }

   public String getTbm32_crf_item_grp_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd ;
   }

   public void setTbm32_crf_item_grp_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd = value ;
   }

   public short getTbm32_crf_item_grp_order( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order ;
   }

   public void setTbm32_crf_item_grp_order( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order = value ;
   }

   public short getTbm32_location_x( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x ;
   }

   public void setTbm32_location_x( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x = value ;
   }

   public short getTbm32_location_y( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y ;
   }

   public void setTbm32_location_y( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y = value ;
   }

   public short getTbm32_location_x2( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2 ;
   }

   public void setTbm32_location_x2( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2 = value ;
   }

   public short getTbm32_location_y2( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2 ;
   }

   public void setTbm32_location_y2( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2 = value ;
   }

   public String getTbm32_text_align_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div ;
   }

   public void setTbm32_text_align_div( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div = value ;
   }

   public byte getTbm32_text_maxrows( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows ;
   }

   public void setTbm32_text_maxrows( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows = value ;
   }

   public short getTbm32_text_maxlength( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength ;
   }

   public void setTbm32_text_maxlength( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength = value ;
   }

   public byte getTbm32_decimal_digits( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits ;
   }

   public void setTbm32_decimal_digits( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits = value ;
   }

   public String getTbm32_chk_true_inner_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value ;
   }

   public void setTbm32_chk_true_inner_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value = value ;
   }

   public String getTbm32_chk_false_inner_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value ;
   }

   public void setTbm32_chk_false_inner_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value = value ;
   }

   public String getTbm32_fixed_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value ;
   }

   public void setTbm32_fixed_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value = value ;
   }

   public String getTbm32_list_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd ;
   }

   public void setTbm32_list_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd = value ;
   }

   public String getTbm32_image_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd ;
   }

   public void setTbm32_image_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd = value ;
   }

   public String getTbm32_text( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text ;
   }

   public void setTbm32_text( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text = value ;
   }

   public byte getTbm32_font_size( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size ;
   }

   public void setTbm32_font_size( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size = value ;
   }

   public String getTbm32_font_ul_flg( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg ;
   }

   public void setTbm32_font_ul_flg( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg = value ;
   }

   public long getTbm32_font_color_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div ;
   }

   public void setTbm32_font_color_div( long value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div = value ;
   }

   public byte getTbm32_line_size_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div ;
   }

   public void setTbm32_line_size_div( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div = value ;
   }

   public long getTbm32_line_color_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div ;
   }

   public void setTbm32_line_color_div( long value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div = value ;
   }

   public String getTbm32_line_start_point_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div ;
   }

   public void setTbm32_line_start_point_div( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div = value ;
   }

   public String getTbm32_line_end_point_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div ;
   }

   public void setTbm32_line_end_point_div( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div = value ;
   }

   public short getTbm32_line_angle( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle ;
   }

   public void setTbm32_line_angle( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle = value ;
   }

   public byte getTbm32_auth_lvl_min( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min ;
   }

   public void setTbm32_auth_lvl_min( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min = value ;
   }

   public short getTbm32_zorder( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder ;
   }

   public void setTbm32_zorder( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder = value ;
   }

   public short getTbm32_tab_order( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order ;
   }

   public void setTbm32_tab_order( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order = value ;
   }

   public String getTbm32_tabstop_flg( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg ;
   }

   public void setTbm32_tabstop_flg( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg = value ;
   }

   public String getTbm32_required_input_flg( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg ;
   }

   public void setTbm32_required_input_flg( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg = value ;
   }

   public String getTbm32_min_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value ;
   }

   public void setTbm32_min_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value = value ;
   }

   public String getTbm32_max_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value ;
   }

   public void setTbm32_max_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value = value ;
   }

   public String getTbm32_crf_item_note( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note ;
   }

   public void setTbm32_crf_item_note( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note = value ;
   }

   public short getTbm32_ref_crf_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id ;
   }

   public void setTbm32_ref_crf_id( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id = value ;
   }

   public String getTbm32_ref_crf_item_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd ;
   }

   public void setTbm32_ref_crf_item_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd = value ;
   }

   public String getTbm32_del_flg( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg ;
   }

   public void setTbm32_del_flg( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg = value ;
   }

   public java.util.Date getTbm32_crt_datetime( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime ;
   }

   public void setTbm32_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime = value ;
   }

   public String getTbm32_crt_user_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id ;
   }

   public void setTbm32_crt_user_id( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id = value ;
   }

   public String getTbm32_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm ;
   }

   public void setTbm32_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm = value ;
   }

   public java.util.Date getTbm32_upd_datetime( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime ;
   }

   public void setTbm32_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime = value ;
   }

   public String getTbm32_upd_user_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id ;
   }

   public void setTbm32_upd_user_id( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id = value ;
   }

   public String getTbm32_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm ;
   }

   public void setTbm32_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm = value ;
   }

   public long getTbm32_upd_cnt( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt ;
   }

   public void setTbm32_upd_cnt( long value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt = value ;
   }

   protected byte gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows ;
   protected byte gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits ;
   protected byte gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size ;
   protected byte gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div ;
   protected byte gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2 ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2 ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order ;
   protected short gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id ;
   protected long gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id ;
   protected long gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div ;
   protected long gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div ;
   protected long gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id ;
   protected String gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm ;
   protected java.util.Date gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime ;
}

