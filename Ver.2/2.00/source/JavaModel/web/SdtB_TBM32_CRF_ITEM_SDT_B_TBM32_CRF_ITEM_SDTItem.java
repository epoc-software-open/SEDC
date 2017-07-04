/*
               File: SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem
        Description: B_TBM32_CRF_ITEM_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:59.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem( )
   {
      this(  new ModelContext(SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem.class));
   }

   public SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem( ModelContext context )
   {
      super( context, "SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem");
   }

   public SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem");
   }

   public SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem( StructSdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_STUDY_ID") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ID") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_CD") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_NM") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_DIV") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_ORDER") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X2") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y2") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_ALIGN_DIV") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_MAXROWS") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_MAXLENGTH") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_DECIMAL_DIGITS") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CHK_TRUE_INNER_VALUE") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CHK_FALSE_INNER_VALUE") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FIXED_VALUE") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LIST_CD") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_IMAGE_CD") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_SIZE") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_UL_FLG") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_COLOR_DIV") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_SIZE_DIV") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_COLOR_DIV") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_START_POINT_DIV") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_END_POINT_DIV") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_ANGLE") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_AUTH_LVL_MIN") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_ZORDER") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TAB_ORDER") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TABSTOP_FLG") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REQUIRED_INPUT_FLG") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_MIN_VALUE") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_MAX_VALUE") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_NOTE") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REF_CRF_ID") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REF_CRF_ITEM_CD") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_DEL_FLG") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_USER_ID") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_PROG_NM") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_USER_ID") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_PROG_NM") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_CNT") )
            {
               gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "B_TBM32_CRF_ITEM_SDT.B_TBM32_CRF_ITEM_SDTItem" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("TBM32_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_NM", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_DIV", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_GRP_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_X", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_Y", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_X2", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_Y2", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT_ALIGN_DIV", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT_MAXROWS", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT_MAXLENGTH", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_DECIMAL_DIGITS", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CHK_TRUE_INNER_VALUE", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CHK_FALSE_INNER_VALUE", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_FIXED_VALUE", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LIST_CD", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_IMAGE_CD", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_FONT_SIZE", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_FONT_UL_FLG", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_FONT_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_SIZE_DIV", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_START_POINT_DIV", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_END_POINT_DIV", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_ANGLE", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_AUTH_LVL_MIN", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_ZORDER", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TAB_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TABSTOP_FLG", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_REQUIRED_INPUT_FLG", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_MIN_VALUE", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_MAX_VALUE", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_NOTE", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_REF_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_REF_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_DEL_FLG", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime) )
      {
         oWriter.writeStartElement("TBM32_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM32_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM32_CRT_USER_ID", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime) )
      {
         oWriter.writeStartElement("TBM32_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM32_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM32_UPD_USER_ID", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("TBM32_STUDY_ID", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id, false);
      AddObjectProperty("TBM32_CRF_ID", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id, false);
      AddObjectProperty("TBM32_CRF_ITEM_CD", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd, false);
      AddObjectProperty("TBM32_CRF_ITEM_NM", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm, false);
      AddObjectProperty("TBM32_CRF_ITEM_DIV", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div, false);
      AddObjectProperty("TBM32_CRF_ITEM_GRP_CD", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd, false);
      AddObjectProperty("TBM32_CRF_ITEM_GRP_ORDER", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order, false);
      AddObjectProperty("TBM32_LOCATION_X", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x, false);
      AddObjectProperty("TBM32_LOCATION_Y", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y, false);
      AddObjectProperty("TBM32_LOCATION_X2", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2, false);
      AddObjectProperty("TBM32_LOCATION_Y2", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2, false);
      AddObjectProperty("TBM32_TEXT_ALIGN_DIV", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div, false);
      AddObjectProperty("TBM32_TEXT_MAXROWS", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows, false);
      AddObjectProperty("TBM32_TEXT_MAXLENGTH", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength, false);
      AddObjectProperty("TBM32_DECIMAL_DIGITS", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits, false);
      AddObjectProperty("TBM32_CHK_TRUE_INNER_VALUE", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value, false);
      AddObjectProperty("TBM32_CHK_FALSE_INNER_VALUE", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value, false);
      AddObjectProperty("TBM32_FIXED_VALUE", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value, false);
      AddObjectProperty("TBM32_LIST_CD", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd, false);
      AddObjectProperty("TBM32_IMAGE_CD", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd, false);
      AddObjectProperty("TBM32_TEXT", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text, false);
      AddObjectProperty("TBM32_FONT_SIZE", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size, false);
      AddObjectProperty("TBM32_FONT_UL_FLG", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg, false);
      AddObjectProperty("TBM32_FONT_COLOR_DIV", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div, false);
      AddObjectProperty("TBM32_LINE_SIZE_DIV", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div, false);
      AddObjectProperty("TBM32_LINE_COLOR_DIV", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div, false);
      AddObjectProperty("TBM32_LINE_START_POINT_DIV", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div, false);
      AddObjectProperty("TBM32_LINE_END_POINT_DIV", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div, false);
      AddObjectProperty("TBM32_LINE_ANGLE", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle, false);
      AddObjectProperty("TBM32_AUTH_LVL_MIN", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min, false);
      AddObjectProperty("TBM32_ZORDER", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder, false);
      AddObjectProperty("TBM32_TAB_ORDER", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order, false);
      AddObjectProperty("TBM32_TABSTOP_FLG", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg, false);
      AddObjectProperty("TBM32_REQUIRED_INPUT_FLG", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg, false);
      AddObjectProperty("TBM32_MIN_VALUE", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value, false);
      AddObjectProperty("TBM32_MAX_VALUE", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value, false);
      AddObjectProperty("TBM32_CRF_ITEM_NOTE", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note, false);
      AddObjectProperty("TBM32_REF_CRF_ID", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id, false);
      AddObjectProperty("TBM32_REF_CRF_ITEM_CD", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd, false);
      AddObjectProperty("TBM32_DEL_FLG", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg, false);
      datetime_STZ = gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM32_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM32_CRT_USER_ID", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id, false);
      AddObjectProperty("TBM32_CRT_PROG_NM", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM32_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM32_UPD_USER_ID", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id, false);
      AddObjectProperty("TBM32_UPD_PROG_NM", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm, false);
      AddObjectProperty("TBM32_UPD_CNT", gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt, false);
   }

   public long getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id( long value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2 ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2 = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2 ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2 = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div = value ;
   }

   public byte getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength = value ;
   }

   public byte getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text = value ;
   }

   public byte getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg = value ;
   }

   public long getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div( long value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div = value ;
   }

   public byte getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div = value ;
   }

   public long getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div( long value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle = value ;
   }

   public byte getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min( byte value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note = value ;
   }

   public short getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id( short value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg = value ;
   }

   public java.util.Date getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm = value ;
   }

   public java.util.Date getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id = value ;
   }

   public String getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm = value ;
   }

   public long getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt( )
   {
      return gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt ;
   }

   public void setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt( long value )
   {
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
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
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id = "" ;
      gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem Clone( )
   {
      return (SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem)(clone()) ;
   }

   public void setStruct( StructSdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem struct )
   {
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id(struct.getTbm32_study_id());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id(struct.getTbm32_crf_id());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd(struct.getTbm32_crf_item_cd());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm(struct.getTbm32_crf_item_nm());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div(struct.getTbm32_crf_item_div());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd(struct.getTbm32_crf_item_grp_cd());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order(struct.getTbm32_crf_item_grp_order());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x(struct.getTbm32_location_x());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y(struct.getTbm32_location_y());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2(struct.getTbm32_location_x2());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2(struct.getTbm32_location_y2());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div(struct.getTbm32_text_align_div());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows(struct.getTbm32_text_maxrows());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength(struct.getTbm32_text_maxlength());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits(struct.getTbm32_decimal_digits());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value(struct.getTbm32_chk_true_inner_value());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value(struct.getTbm32_chk_false_inner_value());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value(struct.getTbm32_fixed_value());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd(struct.getTbm32_list_cd());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd(struct.getTbm32_image_cd());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text(struct.getTbm32_text());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size(struct.getTbm32_font_size());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg(struct.getTbm32_font_ul_flg());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div(struct.getTbm32_font_color_div());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div(struct.getTbm32_line_size_div());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div(struct.getTbm32_line_color_div());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div(struct.getTbm32_line_start_point_div());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div(struct.getTbm32_line_end_point_div());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle(struct.getTbm32_line_angle());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min(struct.getTbm32_auth_lvl_min());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder(struct.getTbm32_zorder());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order(struct.getTbm32_tab_order());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg(struct.getTbm32_tabstop_flg());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg(struct.getTbm32_required_input_flg());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value(struct.getTbm32_min_value());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value(struct.getTbm32_max_value());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note(struct.getTbm32_crf_item_note());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id(struct.getTbm32_ref_crf_id());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd(struct.getTbm32_ref_crf_item_cd());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg(struct.getTbm32_del_flg());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime(struct.getTbm32_crt_datetime());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id(struct.getTbm32_crt_user_id());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm(struct.getTbm32_crt_prog_nm());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime(struct.getTbm32_upd_datetime());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id(struct.getTbm32_upd_user_id());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm(struct.getTbm32_upd_prog_nm());
      setgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt(struct.getTbm32_upd_cnt());
   }

   public StructSdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem getStruct( )
   {
      StructSdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem struct = new StructSdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem ();
      struct.setTbm32_study_id(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id());
      struct.setTbm32_crf_id(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_id());
      struct.setTbm32_crf_item_cd(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_cd());
      struct.setTbm32_crf_item_nm(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_nm());
      struct.setTbm32_crf_item_div(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_div());
      struct.setTbm32_crf_item_grp_cd(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_cd());
      struct.setTbm32_crf_item_grp_order(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_grp_order());
      struct.setTbm32_location_x(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x());
      struct.setTbm32_location_y(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y());
      struct.setTbm32_location_x2(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_x2());
      struct.setTbm32_location_y2(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_location_y2());
      struct.setTbm32_text_align_div(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_align_div());
      struct.setTbm32_text_maxrows(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxrows());
      struct.setTbm32_text_maxlength(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text_maxlength());
      struct.setTbm32_decimal_digits(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_decimal_digits());
      struct.setTbm32_chk_true_inner_value(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_true_inner_value());
      struct.setTbm32_chk_false_inner_value(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_chk_false_inner_value());
      struct.setTbm32_fixed_value(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_fixed_value());
      struct.setTbm32_list_cd(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_list_cd());
      struct.setTbm32_image_cd(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_image_cd());
      struct.setTbm32_text(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_text());
      struct.setTbm32_font_size(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_size());
      struct.setTbm32_font_ul_flg(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_ul_flg());
      struct.setTbm32_font_color_div(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div());
      struct.setTbm32_line_size_div(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_size_div());
      struct.setTbm32_line_color_div(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div());
      struct.setTbm32_line_start_point_div(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_start_point_div());
      struct.setTbm32_line_end_point_div(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_end_point_div());
      struct.setTbm32_line_angle(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_angle());
      struct.setTbm32_auth_lvl_min(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_auth_lvl_min());
      struct.setTbm32_zorder(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_zorder());
      struct.setTbm32_tab_order(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tab_order());
      struct.setTbm32_tabstop_flg(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_tabstop_flg());
      struct.setTbm32_required_input_flg(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_required_input_flg());
      struct.setTbm32_min_value(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_min_value());
      struct.setTbm32_max_value(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_max_value());
      struct.setTbm32_crf_item_note(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crf_item_note());
      struct.setTbm32_ref_crf_id(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_id());
      struct.setTbm32_ref_crf_item_cd(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_ref_crf_item_cd());
      struct.setTbm32_del_flg(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_del_flg());
      struct.setTbm32_crt_datetime(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime());
      struct.setTbm32_crt_user_id(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_user_id());
      struct.setTbm32_crt_prog_nm(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_prog_nm());
      struct.setTbm32_upd_datetime(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime());
      struct.setTbm32_upd_user_id(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_user_id());
      struct.setTbm32_upd_prog_nm(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_prog_nm());
      struct.setTbm32_upd_cnt(getgxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt());
      return struct ;
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
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_study_id ;
   protected long gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_font_color_div ;
   protected long gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_line_color_div ;
   protected long gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM32_CRF_ITEM_SDT_B_TBM32_CRF_ITEM_SDTItem_Tbm32_upd_datetime ;
   protected java.util.Date datetime_STZ ;
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
}

