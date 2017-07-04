/*
               File: SdtTBM32_CRF_ITEM
        Description: CRFçÄñ⁄É}ÉXÉ^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:54.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBM32_CRF_ITEM extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM32_CRF_ITEM( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM32_CRF_ITEM.class));
   }

   public SdtTBM32_CRF_ITEM( int remoteHandle ,
                             ModelContext context )
   {
      super( context, "SdtTBM32_CRF_ITEM");
      initialize( remoteHandle) ;
   }

   public SdtTBM32_CRF_ITEM( int remoteHandle ,
                             StructSdtTBM32_CRF_ITEM struct )
   {
      this(remoteHandle);
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

   public void Load( long AV70TBM32_STUDY_ID ,
                     short AV71TBM32_CRF_ID ,
                     String AV72TBM32_CRF_ITEM_CD )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV70TBM32_STUDY_ID),new Short(AV71TBM32_CRF_ID),AV72TBM32_CRF_ITEM_CD});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBM32_STUDY_ID", long.class}, new Object[]{"TBM32_CRF_ID", short.class}, new Object[]{"TBM32_CRF_ITEM_CD", String.class}}) ;
   }

   public GxObjectCollection GetMessages( )
   {
      short item = 1 ;
      GxObjectCollection msgs = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle) ;
      SdtMessages_Message m1 ;
      IGxSilentTrn trn = getTransaction() ;
      com.genexus.internet.MsgList msgList = trn.GetMessages() ;
      while ( item <= msgList.getItemCount() )
      {
         m1 = new SdtMessages_Message(remoteHandle, context) ;
         m1.setgxTv_SdtMessages_Message_Id( msgList.getItemValue(item) );
         m1.setgxTv_SdtMessages_Message_Description( msgList.getItemText(item) );
         m1.setgxTv_SdtMessages_Message_Type( (byte)(msgList.getItemType(item)) );
         msgs.add(m1, 0);
         item = (short)(item+1) ;
      }
      return msgs ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties() ;
      metadata.set("Name", "TBM32_CRF_ITEM");
      metadata.set("BT", "TBM32_CRF_ITEM");
      metadata.set("PK", "[ \"TBM32_STUDY_ID\",\"TBM32_CRF_ID\",\"TBM32_CRF_ITEM_CD\" ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ID") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_CD") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_NM") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_DIV") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_ORDER") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X2") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y2") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_ALIGN_DIV") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_MAXROWS") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_MAXLENGTH") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_DECIMAL_DIGITS") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CHK_TRUE_INNER_VALUE") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CHK_FALSE_INNER_VALUE") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FIXED_VALUE") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LIST_CD") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_IMAGE_CD") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_SIZE") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_UL_FLG") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_COLOR_DIV") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_SIZE_DIV") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_COLOR_DIV") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_START_POINT_DIV") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_END_POINT_DIV") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_ANGLE") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_AUTH_LVL_MIN") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_ZORDER") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TAB_ORDER") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TABSTOP_FLG") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REQUIRED_INPUT_FLG") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_MIN_VALUE") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_MAX_VALUE") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_NOTE") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REF_CRF_ID") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REF_CRF_ITEM_CD") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_DEL_FLG") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg = oReader.getValue() ;
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
                  gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_USER_ID") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_PROG_NM") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm = oReader.getValue() ;
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
                  gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_USER_ID") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_PROG_NM") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_CNT") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_STUDY_ID_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ID_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_CD_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_NM_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_DIV_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_CD_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_ORDER_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X2_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y2_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_ALIGN_DIV_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_MAXROWS_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_MAXLENGTH_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_DECIMAL_DIGITS_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CHK_TRUE_INNER_VALUE_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CHK_FALSE_INNER_VALUE_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FIXED_VALUE_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LIST_CD_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_IMAGE_CD_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_SIZE_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_UL_FLG_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_COLOR_DIV_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_SIZE_DIV_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_COLOR_DIV_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_START_POINT_DIV_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_END_POINT_DIV_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_ANGLE_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_AUTH_LVL_MIN_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_ZORDER_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TAB_ORDER_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TABSTOP_FLG_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REQUIRED_INPUT_FLG_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_MIN_VALUE_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_MAX_VALUE_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_NOTE_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REF_CRF_ID_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REF_CRF_ITEM_CD_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_DEL_FLG_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_CNT_Z") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_NM_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_DIV_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_CD_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_ORDER_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X2_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y2_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_ALIGN_DIV_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_MAXROWS_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_MAXLENGTH_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_DECIMAL_DIGITS_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CHK_TRUE_INNER_VALUE_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CHK_FALSE_INNER_VALUE_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FIXED_VALUE_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LIST_CD_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_IMAGE_CD_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_SIZE_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_UL_FLG_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_FONT_COLOR_DIV_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_SIZE_DIV_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_COLOR_DIV_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_START_POINT_DIV_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_END_POINT_DIV_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LINE_ANGLE_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_AUTH_LVL_MIN_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_ZORDER_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TAB_ORDER_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TABSTOP_FLG_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REQUIRED_INPUT_FLG_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_MIN_VALUE_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_MAX_VALUE_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_NOTE_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REF_CRF_ID_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_REF_CRF_ITEM_CD_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_DEL_FLG_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_UPD_CNT_N") )
            {
               gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBM32_CRF_ITEM" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "tablet-EDC_GXXEV3U3" ;
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
      oWriter.writeElement("TBM32_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_NM", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_DIV", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_GRP_ORDER", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_X", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_Y", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_X2", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_Y2", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT_ALIGN_DIV", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT_MAXROWS", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT_MAXLENGTH", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_DECIMAL_DIGITS", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CHK_TRUE_INNER_VALUE", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CHK_FALSE_INNER_VALUE", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_FIXED_VALUE", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LIST_CD", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_IMAGE_CD", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_FONT_SIZE", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_FONT_UL_FLG", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_FONT_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_SIZE_DIV", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_START_POINT_DIV", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_END_POINT_DIV", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LINE_ANGLE", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_AUTH_LVL_MIN", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_ZORDER", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TAB_ORDER", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TABSTOP_FLG", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_REQUIRED_INPUT_FLG", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_MIN_VALUE", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_MAX_VALUE", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_NOTE", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_REF_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_REF_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime) )
      {
         oWriter.writeStartElement("TBM32_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM32_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM32_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime) )
      {
         oWriter.writeStartElement("TBM32_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM32_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM32_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_CD_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_NM_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_DIV_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_GRP_CD_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_GRP_ORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LOCATION_X_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LOCATION_Y_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LOCATION_X2_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LOCATION_Y2_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TEXT_ALIGN_DIV_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TEXT_MAXROWS_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TEXT_MAXLENGTH_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_DECIMAL_DIGITS_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CHK_TRUE_INNER_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CHK_FALSE_INNER_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_FIXED_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LIST_CD_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_IMAGE_CD_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TEXT_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_FONT_SIZE_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_FONT_UL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_FONT_COLOR_DIV_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_SIZE_DIV_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_COLOR_DIV_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_START_POINT_DIV_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_END_POINT_DIV_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_ANGLE_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_AUTH_LVL_MIN_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_ZORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TAB_ORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TABSTOP_FLG_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_REQUIRED_INPUT_FLG_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_MIN_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_MAX_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_NOTE_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_REF_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_REF_CRF_ITEM_CD_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBM32_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM32_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM32_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBM32_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM32_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM32_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_GRP_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_GRP_ORDER_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LOCATION_X_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LOCATION_Y_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LOCATION_X2_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LOCATION_Y2_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TEXT_ALIGN_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TEXT_MAXROWS_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TEXT_MAXLENGTH_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_DECIMAL_DIGITS_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CHK_TRUE_INNER_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CHK_FALSE_INNER_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_FIXED_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LIST_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_IMAGE_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TEXT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_FONT_SIZE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_FONT_UL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_FONT_COLOR_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_SIZE_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_COLOR_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_START_POINT_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_END_POINT_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_LINE_ANGLE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_AUTH_LVL_MIN_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_ZORDER_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TAB_ORDER_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_TABSTOP_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_REQUIRED_INPUT_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_MIN_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_MAX_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRF_ITEM_NOTE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_REF_CRF_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_REF_CRF_ITEM_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM32_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("TBM32_STUDY_ID", gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id, false);
      AddObjectProperty("TBM32_CRF_ID", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id, false);
      AddObjectProperty("TBM32_CRF_ITEM_CD", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd, false);
      AddObjectProperty("TBM32_CRF_ITEM_NM", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm, false);
      AddObjectProperty("TBM32_CRF_ITEM_DIV", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div, false);
      AddObjectProperty("TBM32_CRF_ITEM_GRP_CD", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd, false);
      AddObjectProperty("TBM32_CRF_ITEM_GRP_ORDER", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order, false);
      AddObjectProperty("TBM32_LOCATION_X", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x, false);
      AddObjectProperty("TBM32_LOCATION_Y", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y, false);
      AddObjectProperty("TBM32_LOCATION_X2", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2, false);
      AddObjectProperty("TBM32_LOCATION_Y2", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2, false);
      AddObjectProperty("TBM32_TEXT_ALIGN_DIV", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div, false);
      AddObjectProperty("TBM32_TEXT_MAXROWS", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows, false);
      AddObjectProperty("TBM32_TEXT_MAXLENGTH", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength, false);
      AddObjectProperty("TBM32_DECIMAL_DIGITS", gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits, false);
      AddObjectProperty("TBM32_CHK_TRUE_INNER_VALUE", gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value, false);
      AddObjectProperty("TBM32_CHK_FALSE_INNER_VALUE", gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value, false);
      AddObjectProperty("TBM32_FIXED_VALUE", gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value, false);
      AddObjectProperty("TBM32_LIST_CD", gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd, false);
      AddObjectProperty("TBM32_IMAGE_CD", gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd, false);
      AddObjectProperty("TBM32_TEXT", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text, false);
      AddObjectProperty("TBM32_FONT_SIZE", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size, false);
      AddObjectProperty("TBM32_FONT_UL_FLG", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg, false);
      AddObjectProperty("TBM32_FONT_COLOR_DIV", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div, false);
      AddObjectProperty("TBM32_LINE_SIZE_DIV", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div, false);
      AddObjectProperty("TBM32_LINE_COLOR_DIV", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div, false);
      AddObjectProperty("TBM32_LINE_START_POINT_DIV", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div, false);
      AddObjectProperty("TBM32_LINE_END_POINT_DIV", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div, false);
      AddObjectProperty("TBM32_LINE_ANGLE", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle, false);
      AddObjectProperty("TBM32_AUTH_LVL_MIN", gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min, false);
      AddObjectProperty("TBM32_ZORDER", gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder, false);
      AddObjectProperty("TBM32_TAB_ORDER", gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order, false);
      AddObjectProperty("TBM32_TABSTOP_FLG", gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg, false);
      AddObjectProperty("TBM32_REQUIRED_INPUT_FLG", gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg, false);
      AddObjectProperty("TBM32_MIN_VALUE", gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value, false);
      AddObjectProperty("TBM32_MAX_VALUE", gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value, false);
      AddObjectProperty("TBM32_CRF_ITEM_NOTE", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note, false);
      AddObjectProperty("TBM32_REF_CRF_ID", gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id, false);
      AddObjectProperty("TBM32_REF_CRF_ITEM_CD", gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd, false);
      AddObjectProperty("TBM32_DEL_FLG", gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg, false);
      datetime_STZ = gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime ;
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
      AddObjectProperty("TBM32_CRT_USER_ID", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id, false);
      AddObjectProperty("TBM32_CRT_PROG_NM", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime ;
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
      AddObjectProperty("TBM32_UPD_USER_ID", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id, false);
      AddObjectProperty("TBM32_UPD_PROG_NM", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm, false);
      AddObjectProperty("TBM32_UPD_CNT", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBM32_CRF_ITEM_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBM32_CRF_ITEM_Initialized, false);
         AddObjectProperty("TBM32_STUDY_ID_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z, false);
         AddObjectProperty("TBM32_CRF_ID_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z, false);
         AddObjectProperty("TBM32_CRF_ITEM_CD_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z, false);
         AddObjectProperty("TBM32_CRF_ITEM_NM_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z, false);
         AddObjectProperty("TBM32_CRF_ITEM_DIV_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z, false);
         AddObjectProperty("TBM32_CRF_ITEM_GRP_CD_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z, false);
         AddObjectProperty("TBM32_CRF_ITEM_GRP_ORDER_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z, false);
         AddObjectProperty("TBM32_LOCATION_X_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z, false);
         AddObjectProperty("TBM32_LOCATION_Y_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z, false);
         AddObjectProperty("TBM32_LOCATION_X2_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z, false);
         AddObjectProperty("TBM32_LOCATION_Y2_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z, false);
         AddObjectProperty("TBM32_TEXT_ALIGN_DIV_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z, false);
         AddObjectProperty("TBM32_TEXT_MAXROWS_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z, false);
         AddObjectProperty("TBM32_TEXT_MAXLENGTH_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z, false);
         AddObjectProperty("TBM32_DECIMAL_DIGITS_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z, false);
         AddObjectProperty("TBM32_CHK_TRUE_INNER_VALUE_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z, false);
         AddObjectProperty("TBM32_CHK_FALSE_INNER_VALUE_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z, false);
         AddObjectProperty("TBM32_FIXED_VALUE_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z, false);
         AddObjectProperty("TBM32_LIST_CD_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z, false);
         AddObjectProperty("TBM32_IMAGE_CD_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z, false);
         AddObjectProperty("TBM32_TEXT_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z, false);
         AddObjectProperty("TBM32_FONT_SIZE_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z, false);
         AddObjectProperty("TBM32_FONT_UL_FLG_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z, false);
         AddObjectProperty("TBM32_FONT_COLOR_DIV_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z, false);
         AddObjectProperty("TBM32_LINE_SIZE_DIV_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z, false);
         AddObjectProperty("TBM32_LINE_COLOR_DIV_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z, false);
         AddObjectProperty("TBM32_LINE_START_POINT_DIV_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z, false);
         AddObjectProperty("TBM32_LINE_END_POINT_DIV_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z, false);
         AddObjectProperty("TBM32_LINE_ANGLE_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z, false);
         AddObjectProperty("TBM32_AUTH_LVL_MIN_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z, false);
         AddObjectProperty("TBM32_ZORDER_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z, false);
         AddObjectProperty("TBM32_TAB_ORDER_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z, false);
         AddObjectProperty("TBM32_TABSTOP_FLG_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z, false);
         AddObjectProperty("TBM32_REQUIRED_INPUT_FLG_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z, false);
         AddObjectProperty("TBM32_MIN_VALUE_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z, false);
         AddObjectProperty("TBM32_MAX_VALUE_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z, false);
         AddObjectProperty("TBM32_CRF_ITEM_NOTE_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z, false);
         AddObjectProperty("TBM32_REF_CRF_ID_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z, false);
         AddObjectProperty("TBM32_REF_CRF_ITEM_CD_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z, false);
         AddObjectProperty("TBM32_DEL_FLG_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z ;
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
         AddObjectProperty("TBM32_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM32_CRT_USER_ID_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z, false);
         AddObjectProperty("TBM32_CRT_PROG_NM_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z ;
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
         AddObjectProperty("TBM32_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM32_UPD_USER_ID_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z, false);
         AddObjectProperty("TBM32_UPD_PROG_NM_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z, false);
         AddObjectProperty("TBM32_UPD_CNT_Z", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z, false);
         AddObjectProperty("TBM32_CRF_ITEM_NM_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N, false);
         AddObjectProperty("TBM32_CRF_ITEM_DIV_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N, false);
         AddObjectProperty("TBM32_CRF_ITEM_GRP_CD_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N, false);
         AddObjectProperty("TBM32_CRF_ITEM_GRP_ORDER_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N, false);
         AddObjectProperty("TBM32_LOCATION_X_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N, false);
         AddObjectProperty("TBM32_LOCATION_Y_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N, false);
         AddObjectProperty("TBM32_LOCATION_X2_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N, false);
         AddObjectProperty("TBM32_LOCATION_Y2_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N, false);
         AddObjectProperty("TBM32_TEXT_ALIGN_DIV_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N, false);
         AddObjectProperty("TBM32_TEXT_MAXROWS_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N, false);
         AddObjectProperty("TBM32_TEXT_MAXLENGTH_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N, false);
         AddObjectProperty("TBM32_DECIMAL_DIGITS_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N, false);
         AddObjectProperty("TBM32_CHK_TRUE_INNER_VALUE_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N, false);
         AddObjectProperty("TBM32_CHK_FALSE_INNER_VALUE_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N, false);
         AddObjectProperty("TBM32_FIXED_VALUE_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N, false);
         AddObjectProperty("TBM32_LIST_CD_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N, false);
         AddObjectProperty("TBM32_IMAGE_CD_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N, false);
         AddObjectProperty("TBM32_TEXT_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N, false);
         AddObjectProperty("TBM32_FONT_SIZE_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N, false);
         AddObjectProperty("TBM32_FONT_UL_FLG_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N, false);
         AddObjectProperty("TBM32_FONT_COLOR_DIV_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N, false);
         AddObjectProperty("TBM32_LINE_SIZE_DIV_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N, false);
         AddObjectProperty("TBM32_LINE_COLOR_DIV_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N, false);
         AddObjectProperty("TBM32_LINE_START_POINT_DIV_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N, false);
         AddObjectProperty("TBM32_LINE_END_POINT_DIV_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N, false);
         AddObjectProperty("TBM32_LINE_ANGLE_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N, false);
         AddObjectProperty("TBM32_AUTH_LVL_MIN_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N, false);
         AddObjectProperty("TBM32_ZORDER_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N, false);
         AddObjectProperty("TBM32_TAB_ORDER_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N, false);
         AddObjectProperty("TBM32_TABSTOP_FLG_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N, false);
         AddObjectProperty("TBM32_REQUIRED_INPUT_FLG_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N, false);
         AddObjectProperty("TBM32_MIN_VALUE_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N, false);
         AddObjectProperty("TBM32_MAX_VALUE_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N, false);
         AddObjectProperty("TBM32_CRF_ITEM_NOTE_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N, false);
         AddObjectProperty("TBM32_REF_CRF_ID_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N, false);
         AddObjectProperty("TBM32_REF_CRF_ITEM_CD_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N, false);
         AddObjectProperty("TBM32_DEL_FLG_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N, false);
         AddObjectProperty("TBM32_CRT_DATETIME_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N, false);
         AddObjectProperty("TBM32_CRT_USER_ID_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N, false);
         AddObjectProperty("TBM32_CRT_PROG_NM_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N, false);
         AddObjectProperty("TBM32_UPD_DATETIME_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N, false);
         AddObjectProperty("TBM32_UPD_USER_ID_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N, false);
         AddObjectProperty("TBM32_UPD_PROG_NM_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N, false);
         AddObjectProperty("TBM32_UPD_CNT_N", gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id( long value )
   {
      if ( gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id != value )
      {
         gxTv_SdtTBM32_CRF_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id = value ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id( short value )
   {
      if ( gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id != value )
      {
         gxTv_SdtTBM32_CRF_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id = value ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd, value) != 0 )
      {
         gxTv_SdtTBM32_CRF_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd = value ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2 ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2 = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2 = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2 ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2 = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2 = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div( long value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div = 0 ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div( long value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div = 0 ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt( long value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Mode( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Mode ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Mode( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Mode = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Mode_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Initialized( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Initialized ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Initialized( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Initialized = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Initialized_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z( long value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z( long value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z( long value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z( short value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N( )
   {
      return gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm32_crf_item_bc obj ;
      obj = new tbm32_crf_item_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Mode = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z = "" ;
      gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBM32_CRF_ITEM Clone( )
   {
      SdtTBM32_CRF_ITEM sdt ;
      tbm32_crf_item_bc obj ;
      sdt = (SdtTBM32_CRF_ITEM)(clone()) ;
      obj = (tbm32_crf_item_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM32_CRF_ITEM struct )
   {
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id(struct.getTbm32_study_id());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id(struct.getTbm32_crf_id());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd(struct.getTbm32_crf_item_cd());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm(struct.getTbm32_crf_item_nm());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div(struct.getTbm32_crf_item_div());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd(struct.getTbm32_crf_item_grp_cd());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order(struct.getTbm32_crf_item_grp_order());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x(struct.getTbm32_location_x());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y(struct.getTbm32_location_y());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2(struct.getTbm32_location_x2());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2(struct.getTbm32_location_y2());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div(struct.getTbm32_text_align_div());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows(struct.getTbm32_text_maxrows());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength(struct.getTbm32_text_maxlength());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits(struct.getTbm32_decimal_digits());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value(struct.getTbm32_chk_true_inner_value());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value(struct.getTbm32_chk_false_inner_value());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value(struct.getTbm32_fixed_value());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd(struct.getTbm32_list_cd());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd(struct.getTbm32_image_cd());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text(struct.getTbm32_text());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size(struct.getTbm32_font_size());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg(struct.getTbm32_font_ul_flg());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div(struct.getTbm32_font_color_div());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div(struct.getTbm32_line_size_div());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div(struct.getTbm32_line_color_div());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div(struct.getTbm32_line_start_point_div());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div(struct.getTbm32_line_end_point_div());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle(struct.getTbm32_line_angle());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min(struct.getTbm32_auth_lvl_min());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder(struct.getTbm32_zorder());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order(struct.getTbm32_tab_order());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg(struct.getTbm32_tabstop_flg());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg(struct.getTbm32_required_input_flg());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value(struct.getTbm32_min_value());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value(struct.getTbm32_max_value());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note(struct.getTbm32_crf_item_note());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id(struct.getTbm32_ref_crf_id());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd(struct.getTbm32_ref_crf_item_cd());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg(struct.getTbm32_del_flg());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime(struct.getTbm32_crt_datetime());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id(struct.getTbm32_crt_user_id());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm(struct.getTbm32_crt_prog_nm());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime(struct.getTbm32_upd_datetime());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id(struct.getTbm32_upd_user_id());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm(struct.getTbm32_upd_prog_nm());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt(struct.getTbm32_upd_cnt());
      setgxTv_SdtTBM32_CRF_ITEM_Mode(struct.getMode());
      setgxTv_SdtTBM32_CRF_ITEM_Initialized(struct.getInitialized());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z(struct.getTbm32_study_id_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z(struct.getTbm32_crf_id_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z(struct.getTbm32_crf_item_cd_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z(struct.getTbm32_crf_item_nm_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z(struct.getTbm32_crf_item_div_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z(struct.getTbm32_crf_item_grp_cd_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z(struct.getTbm32_crf_item_grp_order_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z(struct.getTbm32_location_x_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z(struct.getTbm32_location_y_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z(struct.getTbm32_location_x2_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z(struct.getTbm32_location_y2_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z(struct.getTbm32_text_align_div_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z(struct.getTbm32_text_maxrows_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z(struct.getTbm32_text_maxlength_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z(struct.getTbm32_decimal_digits_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z(struct.getTbm32_chk_true_inner_value_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z(struct.getTbm32_chk_false_inner_value_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z(struct.getTbm32_fixed_value_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z(struct.getTbm32_list_cd_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z(struct.getTbm32_image_cd_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z(struct.getTbm32_text_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z(struct.getTbm32_font_size_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z(struct.getTbm32_font_ul_flg_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z(struct.getTbm32_font_color_div_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z(struct.getTbm32_line_size_div_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z(struct.getTbm32_line_color_div_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z(struct.getTbm32_line_start_point_div_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z(struct.getTbm32_line_end_point_div_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z(struct.getTbm32_line_angle_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z(struct.getTbm32_auth_lvl_min_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z(struct.getTbm32_zorder_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z(struct.getTbm32_tab_order_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z(struct.getTbm32_tabstop_flg_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z(struct.getTbm32_required_input_flg_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z(struct.getTbm32_min_value_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z(struct.getTbm32_max_value_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z(struct.getTbm32_crf_item_note_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z(struct.getTbm32_ref_crf_id_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z(struct.getTbm32_ref_crf_item_cd_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z(struct.getTbm32_del_flg_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z(struct.getTbm32_crt_datetime_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z(struct.getTbm32_crt_user_id_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z(struct.getTbm32_crt_prog_nm_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z(struct.getTbm32_upd_datetime_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z(struct.getTbm32_upd_user_id_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z(struct.getTbm32_upd_prog_nm_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z(struct.getTbm32_upd_cnt_Z());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N(struct.getTbm32_crf_item_nm_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N(struct.getTbm32_crf_item_div_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N(struct.getTbm32_crf_item_grp_cd_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N(struct.getTbm32_crf_item_grp_order_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N(struct.getTbm32_location_x_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N(struct.getTbm32_location_y_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N(struct.getTbm32_location_x2_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N(struct.getTbm32_location_y2_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N(struct.getTbm32_text_align_div_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N(struct.getTbm32_text_maxrows_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N(struct.getTbm32_text_maxlength_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N(struct.getTbm32_decimal_digits_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N(struct.getTbm32_chk_true_inner_value_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N(struct.getTbm32_chk_false_inner_value_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N(struct.getTbm32_fixed_value_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N(struct.getTbm32_list_cd_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N(struct.getTbm32_image_cd_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N(struct.getTbm32_text_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N(struct.getTbm32_font_size_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N(struct.getTbm32_font_ul_flg_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N(struct.getTbm32_font_color_div_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N(struct.getTbm32_line_size_div_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N(struct.getTbm32_line_color_div_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N(struct.getTbm32_line_start_point_div_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N(struct.getTbm32_line_end_point_div_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N(struct.getTbm32_line_angle_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N(struct.getTbm32_auth_lvl_min_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N(struct.getTbm32_zorder_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N(struct.getTbm32_tab_order_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N(struct.getTbm32_tabstop_flg_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N(struct.getTbm32_required_input_flg_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N(struct.getTbm32_min_value_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N(struct.getTbm32_max_value_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N(struct.getTbm32_crf_item_note_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N(struct.getTbm32_ref_crf_id_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N(struct.getTbm32_ref_crf_item_cd_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N(struct.getTbm32_del_flg_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N(struct.getTbm32_crt_datetime_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N(struct.getTbm32_crt_user_id_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N(struct.getTbm32_crt_prog_nm_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N(struct.getTbm32_upd_datetime_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N(struct.getTbm32_upd_user_id_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N(struct.getTbm32_upd_prog_nm_N());
      setgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N(struct.getTbm32_upd_cnt_N());
   }

   public StructSdtTBM32_CRF_ITEM getStruct( )
   {
      StructSdtTBM32_CRF_ITEM struct = new StructSdtTBM32_CRF_ITEM ();
      struct.setTbm32_study_id(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id());
      struct.setTbm32_crf_id(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id());
      struct.setTbm32_crf_item_cd(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd());
      struct.setTbm32_crf_item_nm(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm());
      struct.setTbm32_crf_item_div(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div());
      struct.setTbm32_crf_item_grp_cd(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd());
      struct.setTbm32_crf_item_grp_order(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order());
      struct.setTbm32_location_x(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x());
      struct.setTbm32_location_y(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y());
      struct.setTbm32_location_x2(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2());
      struct.setTbm32_location_y2(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2());
      struct.setTbm32_text_align_div(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div());
      struct.setTbm32_text_maxrows(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows());
      struct.setTbm32_text_maxlength(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength());
      struct.setTbm32_decimal_digits(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits());
      struct.setTbm32_chk_true_inner_value(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value());
      struct.setTbm32_chk_false_inner_value(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value());
      struct.setTbm32_fixed_value(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value());
      struct.setTbm32_list_cd(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd());
      struct.setTbm32_image_cd(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd());
      struct.setTbm32_text(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text());
      struct.setTbm32_font_size(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size());
      struct.setTbm32_font_ul_flg(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg());
      struct.setTbm32_font_color_div(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div());
      struct.setTbm32_line_size_div(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div());
      struct.setTbm32_line_color_div(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div());
      struct.setTbm32_line_start_point_div(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div());
      struct.setTbm32_line_end_point_div(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div());
      struct.setTbm32_line_angle(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle());
      struct.setTbm32_auth_lvl_min(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min());
      struct.setTbm32_zorder(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder());
      struct.setTbm32_tab_order(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order());
      struct.setTbm32_tabstop_flg(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg());
      struct.setTbm32_required_input_flg(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg());
      struct.setTbm32_min_value(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value());
      struct.setTbm32_max_value(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value());
      struct.setTbm32_crf_item_note(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note());
      struct.setTbm32_ref_crf_id(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id());
      struct.setTbm32_ref_crf_item_cd(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd());
      struct.setTbm32_del_flg(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg());
      struct.setTbm32_crt_datetime(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime());
      struct.setTbm32_crt_user_id(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id());
      struct.setTbm32_crt_prog_nm(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm());
      struct.setTbm32_upd_datetime(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime());
      struct.setTbm32_upd_user_id(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id());
      struct.setTbm32_upd_prog_nm(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm());
      struct.setTbm32_upd_cnt(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt());
      struct.setMode(getgxTv_SdtTBM32_CRF_ITEM_Mode());
      struct.setInitialized(getgxTv_SdtTBM32_CRF_ITEM_Initialized());
      struct.setTbm32_study_id_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z());
      struct.setTbm32_crf_id_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z());
      struct.setTbm32_crf_item_cd_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z());
      struct.setTbm32_crf_item_nm_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z());
      struct.setTbm32_crf_item_div_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z());
      struct.setTbm32_crf_item_grp_cd_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z());
      struct.setTbm32_crf_item_grp_order_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z());
      struct.setTbm32_location_x_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z());
      struct.setTbm32_location_y_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z());
      struct.setTbm32_location_x2_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z());
      struct.setTbm32_location_y2_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z());
      struct.setTbm32_text_align_div_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z());
      struct.setTbm32_text_maxrows_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z());
      struct.setTbm32_text_maxlength_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z());
      struct.setTbm32_decimal_digits_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z());
      struct.setTbm32_chk_true_inner_value_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z());
      struct.setTbm32_chk_false_inner_value_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z());
      struct.setTbm32_fixed_value_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z());
      struct.setTbm32_list_cd_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z());
      struct.setTbm32_image_cd_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z());
      struct.setTbm32_text_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z());
      struct.setTbm32_font_size_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z());
      struct.setTbm32_font_ul_flg_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z());
      struct.setTbm32_font_color_div_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z());
      struct.setTbm32_line_size_div_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z());
      struct.setTbm32_line_color_div_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z());
      struct.setTbm32_line_start_point_div_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z());
      struct.setTbm32_line_end_point_div_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z());
      struct.setTbm32_line_angle_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z());
      struct.setTbm32_auth_lvl_min_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z());
      struct.setTbm32_zorder_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z());
      struct.setTbm32_tab_order_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z());
      struct.setTbm32_tabstop_flg_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z());
      struct.setTbm32_required_input_flg_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z());
      struct.setTbm32_min_value_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z());
      struct.setTbm32_max_value_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z());
      struct.setTbm32_crf_item_note_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z());
      struct.setTbm32_ref_crf_id_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z());
      struct.setTbm32_ref_crf_item_cd_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z());
      struct.setTbm32_del_flg_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z());
      struct.setTbm32_crt_datetime_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z());
      struct.setTbm32_crt_user_id_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z());
      struct.setTbm32_crt_prog_nm_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z());
      struct.setTbm32_upd_datetime_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z());
      struct.setTbm32_upd_user_id_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z());
      struct.setTbm32_upd_prog_nm_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z());
      struct.setTbm32_upd_cnt_Z(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z());
      struct.setTbm32_crf_item_nm_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N());
      struct.setTbm32_crf_item_div_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N());
      struct.setTbm32_crf_item_grp_cd_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N());
      struct.setTbm32_crf_item_grp_order_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N());
      struct.setTbm32_location_x_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N());
      struct.setTbm32_location_y_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N());
      struct.setTbm32_location_x2_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N());
      struct.setTbm32_location_y2_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N());
      struct.setTbm32_text_align_div_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N());
      struct.setTbm32_text_maxrows_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N());
      struct.setTbm32_text_maxlength_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N());
      struct.setTbm32_decimal_digits_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N());
      struct.setTbm32_chk_true_inner_value_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N());
      struct.setTbm32_chk_false_inner_value_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N());
      struct.setTbm32_fixed_value_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N());
      struct.setTbm32_list_cd_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N());
      struct.setTbm32_image_cd_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N());
      struct.setTbm32_text_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N());
      struct.setTbm32_font_size_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N());
      struct.setTbm32_font_ul_flg_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N());
      struct.setTbm32_font_color_div_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N());
      struct.setTbm32_line_size_div_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N());
      struct.setTbm32_line_color_div_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N());
      struct.setTbm32_line_start_point_div_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N());
      struct.setTbm32_line_end_point_div_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N());
      struct.setTbm32_line_angle_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N());
      struct.setTbm32_auth_lvl_min_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N());
      struct.setTbm32_zorder_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N());
      struct.setTbm32_tab_order_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N());
      struct.setTbm32_tabstop_flg_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N());
      struct.setTbm32_required_input_flg_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N());
      struct.setTbm32_min_value_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N());
      struct.setTbm32_max_value_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N());
      struct.setTbm32_crf_item_note_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N());
      struct.setTbm32_ref_crf_id_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N());
      struct.setTbm32_ref_crf_item_cd_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N());
      struct.setTbm32_del_flg_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N());
      struct.setTbm32_crt_datetime_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N());
      struct.setTbm32_crt_user_id_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N());
      struct.setTbm32_crt_prog_nm_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N());
      struct.setTbm32_upd_datetime_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N());
      struct.setTbm32_upd_user_id_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N());
      struct.setTbm32_upd_prog_nm_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N());
      struct.setTbm32_upd_cnt_N(getgxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_Z ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxrows_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_decimal_digits_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_size_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_size_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_auth_lvl_min_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_N ;
   private byte gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_N ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2 ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2 ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id ;
   private short gxTv_SdtTBM32_CRF_ITEM_Initialized ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_id_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_order_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_x2_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_location_y2_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_maxlength_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_angle_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_zorder_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_tab_order_Z ;
   private short gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_id_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_study_id_Z ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_color_div_Z ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_color_div_Z ;
   private long gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_cnt_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime ;
   private java.util.Date gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime ;
   private java.util.Date gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_text ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_nm_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_div_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_align_div_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_true_inner_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_chk_false_inner_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_fixed_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_list_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_image_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_text_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_font_ul_flg_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_start_point_div_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_line_end_point_div_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_tabstop_flg_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_required_input_flg_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_min_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_max_value_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crf_item_note_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_ref_crf_item_cd_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_del_flg_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_user_id_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_crt_prog_nm_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_user_id_Z ;
   private String gxTv_SdtTBM32_CRF_ITEM_Tbm32_upd_prog_nm_Z ;
}

