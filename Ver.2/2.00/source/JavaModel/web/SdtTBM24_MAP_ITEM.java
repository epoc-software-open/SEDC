/*
               File: SdtTBM24_MAP_ITEM
        Description: マッピング済部品マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:34.55
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBM24_MAP_ITEM extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM24_MAP_ITEM( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM24_MAP_ITEM.class));
   }

   public SdtTBM24_MAP_ITEM( int remoteHandle ,
                             ModelContext context )
   {
      super( context, "SdtTBM24_MAP_ITEM");
      initialize( remoteHandle) ;
   }

   public SdtTBM24_MAP_ITEM( int remoteHandle ,
                             StructSdtTBM24_MAP_ITEM struct )
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

   public void Load( long AV64TBM24_STUDY_ID ,
                     String AV65TBM24_DOM_CD ,
                     String AV66TBM24_DOM_VAR_NM ,
                     String AV67TBM24_CRF_ITEM_DIV )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV64TBM24_STUDY_ID),AV65TBM24_DOM_CD,AV66TBM24_DOM_VAR_NM,AV67TBM24_CRF_ITEM_DIV});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBM24_STUDY_ID", long.class}, new Object[]{"TBM24_DOM_CD", String.class}, new Object[]{"TBM24_DOM_VAR_NM", String.class}, new Object[]{"TBM24_CRF_ITEM_DIV", String.class}}) ;
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
      metadata.set("Name", "TBM24_MAP_ITEM");
      metadata.set("BT", "TBM24_MAP_ITEM");
      metadata.set("PK", "[ \"TBM24_STUDY_ID\",\"TBM24_DOM_CD\",\"TBM24_DOM_VAR_NM\",\"TBM24_CRF_ITEM_DIV\" ]");
      metadata.set("PKAssigned", "[ \"TBM24_STUDY_ID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TBM21_STUDY_ID\" ],\"FKMap\":[ \"TBM24_STUDY_ID-TBM21_STUDY_ID\" ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_STUDY_ID") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_CD") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_VAR_NM") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_OID") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_ATTR_SEQ") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_ROWNO") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRF_ITEM_NM") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRF_ITEM_DIV") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_IDENTIFICATION_CD") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT_MAXLENGTH") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT_MAXROWS") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DECIMAL_DIGITS") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_FIXED_VALUE") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CHK_FALSE_INNER_VALUE") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_REQUIRED_INPUT_FLG") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_MIN_VALUE") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_MAX_VALUE") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_ORDER") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DEL_FLG") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_USER_ID") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_PROG_NM") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_USER_ID") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_PROG_NM") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_CNT") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_STUDY_ID_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_CD_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_VAR_NM_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_OID_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_ATTR_SEQ_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_ROWNO_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRF_ITEM_NM_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRF_ITEM_DIV_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_IDENTIFICATION_CD_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT_MAXLENGTH_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT_MAXROWS_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DECIMAL_DIGITS_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_FIXED_VALUE_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CHK_FALSE_INNER_VALUE_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_REQUIRED_INPUT_FLG_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_MIN_VALUE_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_MAX_VALUE_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_ORDER_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DEL_FLG_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_CNT_Z") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_OID_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_ATTR_SEQ_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DOM_ITM_GRP_ROWNO_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRF_ITEM_NM_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_IDENTIFICATION_CD_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT_MAXLENGTH_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT_MAXROWS_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DECIMAL_DIGITS_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_TEXT_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_FIXED_VALUE_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CHK_FALSE_INNER_VALUE_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_REQUIRED_INPUT_FLG_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_MIN_VALUE_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_MAX_VALUE_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_ORDER_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_DEL_FLG_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM24_UPD_CNT_N") )
            {
               gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBM24_MAP_ITEM" ;
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
      oWriter.writeElement("TBM24_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_DOM_CD", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_DOM_VAR_NM", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_DOM_ITM_GRP_OID", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_DOM_ITM_GRP_ROWNO", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_CRF_ITEM_NM", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_CRF_ITEM_DIV", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_IDENTIFICATION_CD", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_TEXT_MAXLENGTH", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_TEXT_MAXROWS", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_DECIMAL_DIGITS", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_TEXT", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_FIXED_VALUE", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_CHK_FALSE_INNER_VALUE", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_REQUIRED_INPUT_FLG", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_MIN_VALUE", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_MAX_VALUE", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_ORDER", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime) )
      {
         oWriter.writeStartElement("TBM24_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM24_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM24_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime) )
      {
         oWriter.writeStartElement("TBM24_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM24_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM24_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM24_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DOM_CD_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DOM_VAR_NM_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DOM_ITM_GRP_OID_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DOM_ITM_GRP_ATTR_SEQ_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DOM_ITM_GRP_ROWNO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CRF_ITEM_NM_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CRF_ITEM_DIV_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_IDENTIFICATION_CD_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_TEXT_MAXLENGTH_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_TEXT_MAXROWS_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DECIMAL_DIGITS_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_TEXT_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_FIXED_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CHK_FALSE_INNER_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_REQUIRED_INPUT_FLG_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_MIN_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_MAX_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_ORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z, 5, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBM24_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM24_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM24_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBM24_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM24_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM24_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DOM_ITM_GRP_OID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DOM_ITM_GRP_ATTR_SEQ_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DOM_ITM_GRP_ROWNO_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CRF_ITEM_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_IDENTIFICATION_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_TEXT_MAXLENGTH_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_TEXT_MAXROWS_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DECIMAL_DIGITS_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_TEXT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_FIXED_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CHK_FALSE_INNER_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_REQUIRED_INPUT_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_MIN_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_MAX_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_ORDER_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM24_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBM24_STUDY_ID", gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id, false);
      AddObjectProperty("TBM24_DOM_CD", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd, false);
      AddObjectProperty("TBM24_DOM_VAR_NM", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm, false);
      AddObjectProperty("TBM24_DOM_ITM_GRP_OID", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid, false);
      AddObjectProperty("TBM24_DOM_ITM_GRP_ATTR_SEQ", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq, false);
      AddObjectProperty("TBM24_DOM_ITM_GRP_ROWNO", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno, false);
      AddObjectProperty("TBM24_CRF_ITEM_NM", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm, false);
      AddObjectProperty("TBM24_CRF_ITEM_DIV", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div, false);
      AddObjectProperty("TBM24_IDENTIFICATION_CD", gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd, false);
      AddObjectProperty("TBM24_TEXT_MAXLENGTH", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength, false);
      AddObjectProperty("TBM24_TEXT_MAXROWS", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows, false);
      AddObjectProperty("TBM24_DECIMAL_DIGITS", gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits, false);
      AddObjectProperty("TBM24_TEXT", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text, false);
      AddObjectProperty("TBM24_FIXED_VALUE", gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value, false);
      AddObjectProperty("TBM24_CHK_FALSE_INNER_VALUE", gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value, false);
      AddObjectProperty("TBM24_REQUIRED_INPUT_FLG", gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg, false);
      AddObjectProperty("TBM24_MIN_VALUE", gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value, false);
      AddObjectProperty("TBM24_MAX_VALUE", gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value, false);
      AddObjectProperty("TBM24_ORDER", gxTv_SdtTBM24_MAP_ITEM_Tbm24_order, false);
      AddObjectProperty("TBM24_DEL_FLG", gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg, false);
      datetime_STZ = gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime ;
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
      AddObjectProperty("TBM24_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM24_CRT_USER_ID", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id, false);
      AddObjectProperty("TBM24_CRT_PROG_NM", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime ;
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
      AddObjectProperty("TBM24_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM24_UPD_USER_ID", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id, false);
      AddObjectProperty("TBM24_UPD_PROG_NM", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm, false);
      AddObjectProperty("TBM24_UPD_CNT", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBM24_MAP_ITEM_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBM24_MAP_ITEM_Initialized, false);
         AddObjectProperty("TBM24_STUDY_ID_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z, false);
         AddObjectProperty("TBM24_DOM_CD_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z, false);
         AddObjectProperty("TBM24_DOM_VAR_NM_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z, false);
         AddObjectProperty("TBM24_DOM_ITM_GRP_OID_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z, false);
         AddObjectProperty("TBM24_DOM_ITM_GRP_ATTR_SEQ_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z, false);
         AddObjectProperty("TBM24_DOM_ITM_GRP_ROWNO_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z, false);
         AddObjectProperty("TBM24_CRF_ITEM_NM_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z, false);
         AddObjectProperty("TBM24_CRF_ITEM_DIV_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z, false);
         AddObjectProperty("TBM24_IDENTIFICATION_CD_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z, false);
         AddObjectProperty("TBM24_TEXT_MAXLENGTH_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z, false);
         AddObjectProperty("TBM24_TEXT_MAXROWS_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z, false);
         AddObjectProperty("TBM24_DECIMAL_DIGITS_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z, false);
         AddObjectProperty("TBM24_TEXT_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z, false);
         AddObjectProperty("TBM24_FIXED_VALUE_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z, false);
         AddObjectProperty("TBM24_CHK_FALSE_INNER_VALUE_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z, false);
         AddObjectProperty("TBM24_REQUIRED_INPUT_FLG_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z, false);
         AddObjectProperty("TBM24_MIN_VALUE_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z, false);
         AddObjectProperty("TBM24_MAX_VALUE_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z, false);
         AddObjectProperty("TBM24_ORDER_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z, false);
         AddObjectProperty("TBM24_DEL_FLG_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z ;
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
         AddObjectProperty("TBM24_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM24_CRT_USER_ID_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z, false);
         AddObjectProperty("TBM24_CRT_PROG_NM_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z ;
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
         AddObjectProperty("TBM24_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM24_UPD_USER_ID_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z, false);
         AddObjectProperty("TBM24_UPD_PROG_NM_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z, false);
         AddObjectProperty("TBM24_UPD_CNT_Z", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z, false);
         AddObjectProperty("TBM24_DOM_ITM_GRP_OID_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N, false);
         AddObjectProperty("TBM24_DOM_ITM_GRP_ATTR_SEQ_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N, false);
         AddObjectProperty("TBM24_DOM_ITM_GRP_ROWNO_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N, false);
         AddObjectProperty("TBM24_CRF_ITEM_NM_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N, false);
         AddObjectProperty("TBM24_IDENTIFICATION_CD_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N, false);
         AddObjectProperty("TBM24_TEXT_MAXLENGTH_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N, false);
         AddObjectProperty("TBM24_TEXT_MAXROWS_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N, false);
         AddObjectProperty("TBM24_DECIMAL_DIGITS_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N, false);
         AddObjectProperty("TBM24_TEXT_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N, false);
         AddObjectProperty("TBM24_FIXED_VALUE_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N, false);
         AddObjectProperty("TBM24_CHK_FALSE_INNER_VALUE_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N, false);
         AddObjectProperty("TBM24_REQUIRED_INPUT_FLG_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N, false);
         AddObjectProperty("TBM24_MIN_VALUE_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N, false);
         AddObjectProperty("TBM24_MAX_VALUE_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N, false);
         AddObjectProperty("TBM24_ORDER_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N, false);
         AddObjectProperty("TBM24_DEL_FLG_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N, false);
         AddObjectProperty("TBM24_CRT_DATETIME_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N, false);
         AddObjectProperty("TBM24_CRT_USER_ID_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N, false);
         AddObjectProperty("TBM24_CRT_PROG_NM_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N, false);
         AddObjectProperty("TBM24_UPD_DATETIME_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N, false);
         AddObjectProperty("TBM24_UPD_USER_ID_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N, false);
         AddObjectProperty("TBM24_UPD_PROG_NM_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N, false);
         AddObjectProperty("TBM24_UPD_CNT_N", gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id( long value )
   {
      if ( gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id != value )
      {
         gxTv_SdtTBM24_MAP_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id = value ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd, value) != 0 )
      {
         gxTv_SdtTBM24_MAP_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd = value ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm, value) != 0 )
      {
         gxTv_SdtTBM24_MAP_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm = value ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq( short value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno( short value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div, value) != 0 )
      {
         gxTv_SdtTBM24_MAP_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div = value ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength( short value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_order ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order( int value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_order = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_order = 0 ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt( long value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Mode( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Mode ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Mode( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Mode = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Mode_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM24_MAP_ITEM_Initialized( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Initialized ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Initialized( short value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Initialized = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Initialized_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z( long value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z( short value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z( short value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z( short value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z( int value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N( )
   {
      return gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm24_map_item_bc obj ;
      obj = new tbm24_map_item_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Mode = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z = "" ;
      gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBM24_MAP_ITEM Clone( )
   {
      SdtTBM24_MAP_ITEM sdt ;
      tbm24_map_item_bc obj ;
      sdt = (SdtTBM24_MAP_ITEM)(clone()) ;
      obj = (tbm24_map_item_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM24_MAP_ITEM struct )
   {
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id(struct.getTbm24_study_id());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd(struct.getTbm24_dom_cd());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm(struct.getTbm24_dom_var_nm());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid(struct.getTbm24_dom_itm_grp_oid());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq(struct.getTbm24_dom_itm_grp_attr_seq());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno(struct.getTbm24_dom_itm_grp_rowno());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm(struct.getTbm24_crf_item_nm());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div(struct.getTbm24_crf_item_div());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd(struct.getTbm24_identification_cd());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength(struct.getTbm24_text_maxlength());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows(struct.getTbm24_text_maxrows());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits(struct.getTbm24_decimal_digits());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text(struct.getTbm24_text());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value(struct.getTbm24_fixed_value());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value(struct.getTbm24_chk_false_inner_value());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg(struct.getTbm24_required_input_flg());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value(struct.getTbm24_min_value());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value(struct.getTbm24_max_value());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order(struct.getTbm24_order());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg(struct.getTbm24_del_flg());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime(struct.getTbm24_crt_datetime());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id(struct.getTbm24_crt_user_id());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm(struct.getTbm24_crt_prog_nm());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime(struct.getTbm24_upd_datetime());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id(struct.getTbm24_upd_user_id());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm(struct.getTbm24_upd_prog_nm());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt(struct.getTbm24_upd_cnt());
      setgxTv_SdtTBM24_MAP_ITEM_Mode(struct.getMode());
      setgxTv_SdtTBM24_MAP_ITEM_Initialized(struct.getInitialized());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z(struct.getTbm24_study_id_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z(struct.getTbm24_dom_cd_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z(struct.getTbm24_dom_var_nm_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z(struct.getTbm24_dom_itm_grp_oid_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z(struct.getTbm24_dom_itm_grp_attr_seq_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z(struct.getTbm24_dom_itm_grp_rowno_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z(struct.getTbm24_crf_item_nm_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z(struct.getTbm24_crf_item_div_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z(struct.getTbm24_identification_cd_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z(struct.getTbm24_text_maxlength_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z(struct.getTbm24_text_maxrows_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z(struct.getTbm24_decimal_digits_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z(struct.getTbm24_text_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z(struct.getTbm24_fixed_value_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z(struct.getTbm24_chk_false_inner_value_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z(struct.getTbm24_required_input_flg_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z(struct.getTbm24_min_value_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z(struct.getTbm24_max_value_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z(struct.getTbm24_order_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z(struct.getTbm24_del_flg_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z(struct.getTbm24_crt_datetime_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z(struct.getTbm24_crt_user_id_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z(struct.getTbm24_crt_prog_nm_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z(struct.getTbm24_upd_datetime_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z(struct.getTbm24_upd_user_id_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z(struct.getTbm24_upd_prog_nm_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z(struct.getTbm24_upd_cnt_Z());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N(struct.getTbm24_dom_itm_grp_oid_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N(struct.getTbm24_dom_itm_grp_attr_seq_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N(struct.getTbm24_dom_itm_grp_rowno_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N(struct.getTbm24_crf_item_nm_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N(struct.getTbm24_identification_cd_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N(struct.getTbm24_text_maxlength_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N(struct.getTbm24_text_maxrows_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N(struct.getTbm24_decimal_digits_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N(struct.getTbm24_text_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N(struct.getTbm24_fixed_value_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N(struct.getTbm24_chk_false_inner_value_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N(struct.getTbm24_required_input_flg_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N(struct.getTbm24_min_value_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N(struct.getTbm24_max_value_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N(struct.getTbm24_order_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N(struct.getTbm24_del_flg_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N(struct.getTbm24_crt_datetime_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N(struct.getTbm24_crt_user_id_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N(struct.getTbm24_crt_prog_nm_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N(struct.getTbm24_upd_datetime_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N(struct.getTbm24_upd_user_id_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N(struct.getTbm24_upd_prog_nm_N());
      setgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N(struct.getTbm24_upd_cnt_N());
   }

   public StructSdtTBM24_MAP_ITEM getStruct( )
   {
      StructSdtTBM24_MAP_ITEM struct = new StructSdtTBM24_MAP_ITEM ();
      struct.setTbm24_study_id(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id());
      struct.setTbm24_dom_cd(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd());
      struct.setTbm24_dom_var_nm(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm());
      struct.setTbm24_dom_itm_grp_oid(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid());
      struct.setTbm24_dom_itm_grp_attr_seq(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq());
      struct.setTbm24_dom_itm_grp_rowno(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno());
      struct.setTbm24_crf_item_nm(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm());
      struct.setTbm24_crf_item_div(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div());
      struct.setTbm24_identification_cd(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd());
      struct.setTbm24_text_maxlength(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength());
      struct.setTbm24_text_maxrows(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows());
      struct.setTbm24_decimal_digits(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits());
      struct.setTbm24_text(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text());
      struct.setTbm24_fixed_value(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value());
      struct.setTbm24_chk_false_inner_value(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value());
      struct.setTbm24_required_input_flg(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg());
      struct.setTbm24_min_value(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value());
      struct.setTbm24_max_value(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value());
      struct.setTbm24_order(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order());
      struct.setTbm24_del_flg(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg());
      struct.setTbm24_crt_datetime(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime());
      struct.setTbm24_crt_user_id(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id());
      struct.setTbm24_crt_prog_nm(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm());
      struct.setTbm24_upd_datetime(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime());
      struct.setTbm24_upd_user_id(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id());
      struct.setTbm24_upd_prog_nm(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm());
      struct.setTbm24_upd_cnt(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt());
      struct.setMode(getgxTv_SdtTBM24_MAP_ITEM_Mode());
      struct.setInitialized(getgxTv_SdtTBM24_MAP_ITEM_Initialized());
      struct.setTbm24_study_id_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z());
      struct.setTbm24_dom_cd_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z());
      struct.setTbm24_dom_var_nm_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z());
      struct.setTbm24_dom_itm_grp_oid_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z());
      struct.setTbm24_dom_itm_grp_attr_seq_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z());
      struct.setTbm24_dom_itm_grp_rowno_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z());
      struct.setTbm24_crf_item_nm_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z());
      struct.setTbm24_crf_item_div_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z());
      struct.setTbm24_identification_cd_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z());
      struct.setTbm24_text_maxlength_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z());
      struct.setTbm24_text_maxrows_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z());
      struct.setTbm24_decimal_digits_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z());
      struct.setTbm24_text_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z());
      struct.setTbm24_fixed_value_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z());
      struct.setTbm24_chk_false_inner_value_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z());
      struct.setTbm24_required_input_flg_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z());
      struct.setTbm24_min_value_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z());
      struct.setTbm24_max_value_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z());
      struct.setTbm24_order_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z());
      struct.setTbm24_del_flg_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z());
      struct.setTbm24_crt_datetime_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z());
      struct.setTbm24_crt_user_id_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z());
      struct.setTbm24_crt_prog_nm_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z());
      struct.setTbm24_upd_datetime_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z());
      struct.setTbm24_upd_user_id_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z());
      struct.setTbm24_upd_prog_nm_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z());
      struct.setTbm24_upd_cnt_Z(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z());
      struct.setTbm24_dom_itm_grp_oid_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N());
      struct.setTbm24_dom_itm_grp_attr_seq_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N());
      struct.setTbm24_dom_itm_grp_rowno_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N());
      struct.setTbm24_crf_item_nm_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N());
      struct.setTbm24_identification_cd_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N());
      struct.setTbm24_text_maxlength_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N());
      struct.setTbm24_text_maxrows_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N());
      struct.setTbm24_decimal_digits_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N());
      struct.setTbm24_text_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N());
      struct.setTbm24_fixed_value_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N());
      struct.setTbm24_chk_false_inner_value_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N());
      struct.setTbm24_required_input_flg_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N());
      struct.setTbm24_min_value_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N());
      struct.setTbm24_max_value_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N());
      struct.setTbm24_order_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N());
      struct.setTbm24_del_flg_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N());
      struct.setTbm24_crt_datetime_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N());
      struct.setTbm24_crt_user_id_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N());
      struct.setTbm24_crt_prog_nm_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N());
      struct.setTbm24_upd_datetime_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N());
      struct.setTbm24_upd_user_id_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N());
      struct.setTbm24_upd_prog_nm_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N());
      struct.setTbm24_upd_cnt_N(getgxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_Z ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_Z ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxrows_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_decimal_digits_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_N ;
   private byte gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_N ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength ;
   private short gxTv_SdtTBM24_MAP_ITEM_Initialized ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_attr_seq_Z ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_rowno_Z ;
   private short gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_maxlength_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBM24_MAP_ITEM_Tbm24_order ;
   private int gxTv_SdtTBM24_MAP_ITEM_Tbm24_order_Z ;
   private long gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id ;
   private long gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt ;
   private long gxTv_SdtTBM24_MAP_ITEM_Tbm24_study_id_Z ;
   private long gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_cnt_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime ;
   private java.util.Date gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime ;
   private java.util.Date gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_text ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_cd_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_var_nm_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_dom_itm_grp_oid_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_nm_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crf_item_div_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_identification_cd_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_text_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_fixed_value_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_chk_false_inner_value_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_required_input_flg_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_min_value_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_max_value_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_del_flg_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_user_id_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_crt_prog_nm_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_user_id_Z ;
   private String gxTv_SdtTBM24_MAP_ITEM_Tbm24_upd_prog_nm_Z ;
}

