/*
               File: SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem
        Description: B402_SD21_CRF_DEF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem( )
   {
      this(  new ModelContext(SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem.class));
   }

   public SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem( ModelContext context )
   {
      super( context, "SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem");
   }

   public SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem");
   }

   public SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem( StructSdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_STUDY_ID") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CRF_ID") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM31_CRF_SNM") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CRF_ITEM_CD") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SORT_CRF_ITEM_CD") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CRF_ITEM_NM") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CRF_ITEM_DIV") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CRF_ITEM_GRP_ORDER") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LOCATION_X") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LOCATION_Y") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LOCATION_X2") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2 = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LOCATION_Y2") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2 = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_TEXT_ALIGN_DIV") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_TEXT_MAXROWS") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_TEXT_MAXLENGTH") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_DECIMAL_DIGITS") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CHK_TRUE_INNER_VALUE") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CHK_FALSE_INNER_VALUE") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_FIXED_VALUE") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LIST_CD") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM25_LIST_NM") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_IMAGE_CD") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_TEXT") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_FONT_SIZE") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_FONT_UL_FLG") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_FONT_COLOR_DIV") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LINE_SIZE_DIV") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LINE_COLOR_DIV") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LINE_START_POINT_DIV") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LINE_END_POINT_DIV") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_LINE_ANGLE") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_AUTH_LVL_MIN") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_ZORDER") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_TAB_ORDER") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_TABSTOP_FLG") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_REQUIRED_INPUT_FLG") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_MIN_VALUE") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_MAX_VALUE") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_CRF_ITEM_NOTE") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_REF_CRF_ID") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM32_REF_CRF_ITEM_CD") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM37_VISIT_NO") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM37_DOM_CD") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM37_DOM_VAR_NM") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM37_DOM_ITM_GRP_OID") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM37_DOM_ITM_GRP_ATTR_SEQ") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM37_DOM_ITM_GRP_ROWNO") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VBM01_TBM41_NCM_METADATA_ID") )
            {
               gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id = oReader.getValue() ;
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
         sName = "B402_SD21_CRF_DEF.B402_SD21_CRF_DEFItem" ;
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
      oWriter.writeElement("VBM01_TBM32_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM31_CRF_SNM", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("SORT_CRF_ITEM_CD", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CRF_ITEM_NM", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CRF_ITEM_DIV", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CRF_ITEM_GRP_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LOCATION_X", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LOCATION_Y", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LOCATION_X2", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LOCATION_Y2", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_TEXT_ALIGN_DIV", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_TEXT_MAXROWS", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_TEXT_MAXLENGTH", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_DECIMAL_DIGITS", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CHK_TRUE_INNER_VALUE", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CHK_FALSE_INNER_VALUE", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_FIXED_VALUE", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LIST_CD", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM25_LIST_NM", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_IMAGE_CD", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_TEXT", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_FONT_SIZE", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_FONT_UL_FLG", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_FONT_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LINE_SIZE_DIV", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LINE_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LINE_START_POINT_DIV", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LINE_END_POINT_DIV", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_LINE_ANGLE", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_AUTH_LVL_MIN", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_ZORDER", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_TAB_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_TABSTOP_FLG", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_REQUIRED_INPUT_FLG", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_MIN_VALUE", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_MAX_VALUE", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_CRF_ITEM_NOTE", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_REF_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM32_REF_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM37_VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM37_DOM_CD", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM37_DOM_VAR_NM", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM37_DOM_ITM_GRP_OID", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM37_DOM_ITM_GRP_ROWNO", GXutil.trim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno, 13, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VBM01_TBM41_NCM_METADATA_ID", GXutil.rtrim( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id));
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
      AddObjectProperty("VBM01_TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id, 18, 0)), false);
      AddObjectProperty("VBM01_TBM32_CRF_ID", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id, false);
      AddObjectProperty("VBM01_TBM31_CRF_SNM", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm, false);
      AddObjectProperty("VBM01_TBM32_CRF_ITEM_CD", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd, false);
      AddObjectProperty("SORT_CRF_ITEM_CD", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd, false);
      AddObjectProperty("VBM01_TBM32_CRF_ITEM_NM", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm, false);
      AddObjectProperty("VBM01_TBM32_CRF_ITEM_DIV", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div, false);
      AddObjectProperty("VBM01_TBM32_CRF_ITEM_GRP_CD", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd, false);
      AddObjectProperty("VBM01_TBM32_CRF_ITEM_GRP_ORDER", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order, false);
      AddObjectProperty("VBM01_TBM32_LOCATION_X", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x, false);
      AddObjectProperty("VBM01_TBM32_LOCATION_Y", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y, false);
      AddObjectProperty("VBM01_TBM32_LOCATION_X2", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2, false);
      AddObjectProperty("VBM01_TBM32_LOCATION_Y2", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2, false);
      AddObjectProperty("VBM01_TBM32_TEXT_ALIGN_DIV", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div, false);
      AddObjectProperty("VBM01_TBM32_TEXT_MAXROWS", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows, false);
      AddObjectProperty("VBM01_TBM32_TEXT_MAXLENGTH", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength, false);
      AddObjectProperty("VBM01_TBM32_DECIMAL_DIGITS", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits, false);
      AddObjectProperty("VBM01_TBM32_CHK_TRUE_INNER_VALUE", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value, false);
      AddObjectProperty("VBM01_TBM32_CHK_FALSE_INNER_VALUE", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value, false);
      AddObjectProperty("VBM01_TBM32_FIXED_VALUE", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value, false);
      AddObjectProperty("VBM01_TBM32_LIST_CD", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd, false);
      AddObjectProperty("VBM01_TBM25_LIST_NM", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm, false);
      AddObjectProperty("VBM01_TBM32_IMAGE_CD", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd, false);
      AddObjectProperty("VBM01_TBM32_TEXT", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text, false);
      AddObjectProperty("VBM01_TBM32_FONT_SIZE", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size, false);
      AddObjectProperty("VBM01_TBM32_FONT_UL_FLG", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg, false);
      AddObjectProperty("VBM01_TBM32_FONT_COLOR_DIV", GXutil.ltrim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div, 18, 0)), false);
      AddObjectProperty("VBM01_TBM32_LINE_SIZE_DIV", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div, false);
      AddObjectProperty("VBM01_TBM32_LINE_COLOR_DIV", GXutil.ltrim( GXutil.str( gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div, 18, 0)), false);
      AddObjectProperty("VBM01_TBM32_LINE_START_POINT_DIV", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div, false);
      AddObjectProperty("VBM01_TBM32_LINE_END_POINT_DIV", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div, false);
      AddObjectProperty("VBM01_TBM32_LINE_ANGLE", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle, false);
      AddObjectProperty("VBM01_TBM32_AUTH_LVL_MIN", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min, false);
      AddObjectProperty("VBM01_TBM32_ZORDER", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder, false);
      AddObjectProperty("VBM01_TBM32_TAB_ORDER", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order, false);
      AddObjectProperty("VBM01_TBM32_TABSTOP_FLG", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg, false);
      AddObjectProperty("VBM01_TBM32_REQUIRED_INPUT_FLG", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg, false);
      AddObjectProperty("VBM01_TBM32_MIN_VALUE", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value, false);
      AddObjectProperty("VBM01_TBM32_MAX_VALUE", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value, false);
      AddObjectProperty("VBM01_TBM32_CRF_ITEM_NOTE", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note, false);
      AddObjectProperty("VBM01_TBM32_REF_CRF_ID", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id, false);
      AddObjectProperty("VBM01_TBM32_REF_CRF_ITEM_CD", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd, false);
      AddObjectProperty("VBM01_TBM37_VISIT_NO", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no, false);
      AddObjectProperty("VBM01_TBM37_DOM_CD", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd, false);
      AddObjectProperty("VBM01_TBM37_DOM_VAR_NM", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm, false);
      AddObjectProperty("VBM01_TBM37_DOM_ITM_GRP_OID", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid, false);
      AddObjectProperty("VBM01_TBM37_DOM_ITM_GRP_ATTR_SEQ", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq, false);
      AddObjectProperty("VBM01_TBM37_DOM_ITM_GRP_ROWNO", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno, false);
      AddObjectProperty("VBM01_TBM41_NCM_METADATA_ID", gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id, false);
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2 ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2 = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2 ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2 = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq = value ;
   }

   public long getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno( long value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno = value ;
   }

   public String getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id( )
   {
      return gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id ;
   }

   public void setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id( String value )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid = "" ;
      gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id = "" ;
      sTagName = "" ;
   }

   public SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem Clone( )
   {
      return (SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem)(clone()) ;
   }

   public void setStruct( StructSdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem struct )
   {
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id(struct.getVbm01_tbm32_study_id());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id(struct.getVbm01_tbm32_crf_id());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm(struct.getVbm01_tbm31_crf_snm());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd(struct.getVbm01_tbm32_crf_item_cd());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd(struct.getSort_crf_item_cd());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm(struct.getVbm01_tbm32_crf_item_nm());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div(struct.getVbm01_tbm32_crf_item_div());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd(struct.getVbm01_tbm32_crf_item_grp_cd());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order(struct.getVbm01_tbm32_crf_item_grp_order());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x(struct.getVbm01_tbm32_location_x());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y(struct.getVbm01_tbm32_location_y());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2(struct.getVbm01_tbm32_location_x2());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2(struct.getVbm01_tbm32_location_y2());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div(struct.getVbm01_tbm32_text_align_div());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows(struct.getVbm01_tbm32_text_maxrows());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength(struct.getVbm01_tbm32_text_maxlength());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits(struct.getVbm01_tbm32_decimal_digits());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value(struct.getVbm01_tbm32_chk_true_inner_value());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value(struct.getVbm01_tbm32_chk_false_inner_value());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value(struct.getVbm01_tbm32_fixed_value());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd(struct.getVbm01_tbm32_list_cd());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm(struct.getVbm01_tbm25_list_nm());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd(struct.getVbm01_tbm32_image_cd());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text(struct.getVbm01_tbm32_text());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size(struct.getVbm01_tbm32_font_size());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg(struct.getVbm01_tbm32_font_ul_flg());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div(struct.getVbm01_tbm32_font_color_div());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div(struct.getVbm01_tbm32_line_size_div());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div(struct.getVbm01_tbm32_line_color_div());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div(struct.getVbm01_tbm32_line_start_point_div());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div(struct.getVbm01_tbm32_line_end_point_div());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle(struct.getVbm01_tbm32_line_angle());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min(struct.getVbm01_tbm32_auth_lvl_min());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder(struct.getVbm01_tbm32_zorder());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order(struct.getVbm01_tbm32_tab_order());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg(struct.getVbm01_tbm32_tabstop_flg());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg(struct.getVbm01_tbm32_required_input_flg());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value(struct.getVbm01_tbm32_min_value());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value(struct.getVbm01_tbm32_max_value());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note(struct.getVbm01_tbm32_crf_item_note());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id(struct.getVbm01_tbm32_ref_crf_id());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd(struct.getVbm01_tbm32_ref_crf_item_cd());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no(struct.getVbm01_tbm37_visit_no());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd(struct.getVbm01_tbm37_dom_cd());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm(struct.getVbm01_tbm37_dom_var_nm());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid(struct.getVbm01_tbm37_dom_itm_grp_oid());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq(struct.getVbm01_tbm37_dom_itm_grp_attr_seq());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno(struct.getVbm01_tbm37_dom_itm_grp_rowno());
      setgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id(struct.getVbm01_tbm41_ncm_metadata_id());
   }

   public StructSdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem getStruct( )
   {
      StructSdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem struct = new StructSdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem ();
      struct.setVbm01_tbm32_study_id(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id());
      struct.setVbm01_tbm32_crf_id(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id());
      struct.setVbm01_tbm31_crf_snm(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm());
      struct.setVbm01_tbm32_crf_item_cd(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd());
      struct.setSort_crf_item_cd(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd());
      struct.setVbm01_tbm32_crf_item_nm(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm());
      struct.setVbm01_tbm32_crf_item_div(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div());
      struct.setVbm01_tbm32_crf_item_grp_cd(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd());
      struct.setVbm01_tbm32_crf_item_grp_order(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order());
      struct.setVbm01_tbm32_location_x(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x());
      struct.setVbm01_tbm32_location_y(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y());
      struct.setVbm01_tbm32_location_x2(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2());
      struct.setVbm01_tbm32_location_y2(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2());
      struct.setVbm01_tbm32_text_align_div(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div());
      struct.setVbm01_tbm32_text_maxrows(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows());
      struct.setVbm01_tbm32_text_maxlength(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength());
      struct.setVbm01_tbm32_decimal_digits(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits());
      struct.setVbm01_tbm32_chk_true_inner_value(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value());
      struct.setVbm01_tbm32_chk_false_inner_value(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value());
      struct.setVbm01_tbm32_fixed_value(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value());
      struct.setVbm01_tbm32_list_cd(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd());
      struct.setVbm01_tbm25_list_nm(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm());
      struct.setVbm01_tbm32_image_cd(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd());
      struct.setVbm01_tbm32_text(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text());
      struct.setVbm01_tbm32_font_size(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size());
      struct.setVbm01_tbm32_font_ul_flg(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg());
      struct.setVbm01_tbm32_font_color_div(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div());
      struct.setVbm01_tbm32_line_size_div(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div());
      struct.setVbm01_tbm32_line_color_div(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div());
      struct.setVbm01_tbm32_line_start_point_div(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div());
      struct.setVbm01_tbm32_line_end_point_div(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div());
      struct.setVbm01_tbm32_line_angle(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle());
      struct.setVbm01_tbm32_auth_lvl_min(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min());
      struct.setVbm01_tbm32_zorder(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder());
      struct.setVbm01_tbm32_tab_order(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order());
      struct.setVbm01_tbm32_tabstop_flg(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg());
      struct.setVbm01_tbm32_required_input_flg(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg());
      struct.setVbm01_tbm32_min_value(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value());
      struct.setVbm01_tbm32_max_value(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value());
      struct.setVbm01_tbm32_crf_item_note(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note());
      struct.setVbm01_tbm32_ref_crf_id(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id());
      struct.setVbm01_tbm32_ref_crf_item_cd(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd());
      struct.setVbm01_tbm37_visit_no(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no());
      struct.setVbm01_tbm37_dom_cd(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd());
      struct.setVbm01_tbm37_dom_var_nm(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm());
      struct.setVbm01_tbm37_dom_itm_grp_oid(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid());
      struct.setVbm01_tbm37_dom_itm_grp_attr_seq(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq());
      struct.setVbm01_tbm37_dom_itm_grp_rowno(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno());
      struct.setVbm01_tbm41_ncm_metadata_id(getgxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_study_id ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_id ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Sort_crf_item_cd ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_order ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_x2 ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_location_y2 ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxrows ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_maxlength ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_decimal_digits ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_size ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_color_div ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_size_div ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_color_div ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_angle ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_auth_lvl_min ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_zorder ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tab_order ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_id ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_visit_no ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_attr_seq ;
   protected long gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_rowno ;
   protected String sTagName ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm31_crf_snm ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_cd ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_nm ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_div ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_grp_cd ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text_align_div ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_true_inner_value ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_chk_false_inner_value ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_fixed_value ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_list_cd ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm25_list_nm ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_image_cd ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_text ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_font_ul_flg ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_start_point_div ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_line_end_point_div ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_tabstop_flg ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_required_input_flg ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_min_value ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_max_value ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_crf_item_note ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm32_ref_crf_item_cd ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_cd ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_var_nm ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm37_dom_itm_grp_oid ;
   protected String gxTv_SdtB402_SD21_CRF_DEF_B402_SD21_CRF_DEFItem_Vbm01_tbm41_ncm_metadata_id ;
}

