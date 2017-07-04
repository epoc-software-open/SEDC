/*
               File: SdtTBM43_STUDY_CDISC_ITEM
        Description: ééå±ï CDISCçÄñ⁄É}ÉXÉ^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:39.7
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBM43_STUDY_CDISC_ITEM extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM43_STUDY_CDISC_ITEM( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM43_STUDY_CDISC_ITEM.class));
   }

   public SdtTBM43_STUDY_CDISC_ITEM( int remoteHandle ,
                                     ModelContext context )
   {
      super( context, "SdtTBM43_STUDY_CDISC_ITEM");
      initialize( remoteHandle) ;
   }

   public SdtTBM43_STUDY_CDISC_ITEM( int remoteHandle ,
                                     StructSdtTBM43_STUDY_CDISC_ITEM struct )
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

   public void Load( long AV200TBM43_STUDY_ID ,
                     String AV201TBM43_DOM_CD ,
                     String AV202TBM43_DOM_VAR_NM )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV200TBM43_STUDY_ID),AV201TBM43_DOM_CD,AV202TBM43_DOM_VAR_NM});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBM43_STUDY_ID", long.class}, new Object[]{"TBM43_DOM_CD", String.class}, new Object[]{"TBM43_DOM_VAR_NM", String.class}}) ;
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
      metadata.set("Name", "TBM43_STUDY_CDISC_ITEM");
      metadata.set("BT", "TBM43_STUDY_CDISC_ITEM");
      metadata.set("PK", "[ \"TBM43_STUDY_ID\",\"TBM43_DOM_CD\",\"TBM43_DOM_VAR_NM\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_STUDY_ID") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_DOM_CD") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_DOM_VAR_NM") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_VAR_DESC") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_SDTM_FLG") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CDASH_FLG") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_INPUT_TYPE_DIV") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_REQUIRED_FLG") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_SAS_FIELD_NM") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_ODM_DATA_TYPE") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_NOTE") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_ORDER") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_VERSION") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_DEL_FLG") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_USER_ID") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_PROG_NM") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_USER_ID") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_PROG_NM") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_CNT") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_STUDY_ID_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_DOM_CD_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_DOM_VAR_NM_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_VAR_DESC_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_SDTM_FLG_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CDASH_FLG_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_INPUT_TYPE_DIV_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_REQUIRED_FLG_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_SAS_FIELD_NM_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_ODM_DATA_TYPE_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_NOTE_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_ORDER_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_VERSION_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_DEL_FLG_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_CNT_Z") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_VAR_DESC_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_SDTM_FLG_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CDASH_FLG_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_INPUT_TYPE_DIV_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_REQUIRED_FLG_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_SAS_FIELD_NM_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_ODM_DATA_TYPE_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_NOTE_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_ORDER_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_VERSION_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_DEL_FLG_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM43_UPD_CNT_N") )
            {
               gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBM43_STUDY_CDISC_ITEM" ;
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
      oWriter.writeElement("TBM43_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_DOM_CD", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_DOM_VAR_NM", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_VAR_DESC", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_SDTM_FLG", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_CDASH_FLG", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_INPUT_TYPE_DIV", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_REQUIRED_FLG", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_SAS_FIELD_NM", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_ODM_DATA_TYPE", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_NOTE", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_ORDER", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_VERSION", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime) )
      {
         oWriter.writeStartElement("TBM43_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM43_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM43_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime) )
      {
         oWriter.writeStartElement("TBM43_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM43_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM43_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM43_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_DOM_CD_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_DOM_VAR_NM_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_VAR_DESC_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_SDTM_FLG_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_CDASH_FLG_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_INPUT_TYPE_DIV_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_REQUIRED_FLG_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_SAS_FIELD_NM_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_ODM_DATA_TYPE_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_NOTE_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_ORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z, 5, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_VERSION_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBM43_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM43_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM43_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBM43_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM43_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM43_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_VAR_DESC_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_SDTM_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_CDASH_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_INPUT_TYPE_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_REQUIRED_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_SAS_FIELD_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_ODM_DATA_TYPE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_NOTE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_ORDER_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_VERSION_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM43_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBM43_STUDY_ID", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id, false);
      AddObjectProperty("TBM43_DOM_CD", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd, false);
      AddObjectProperty("TBM43_DOM_VAR_NM", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm, false);
      AddObjectProperty("TBM43_VAR_DESC", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc, false);
      AddObjectProperty("TBM43_SDTM_FLG", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg, false);
      AddObjectProperty("TBM43_CDASH_FLG", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg, false);
      AddObjectProperty("TBM43_INPUT_TYPE_DIV", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div, false);
      AddObjectProperty("TBM43_REQUIRED_FLG", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg, false);
      AddObjectProperty("TBM43_SAS_FIELD_NM", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm, false);
      AddObjectProperty("TBM43_ODM_DATA_TYPE", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type, false);
      AddObjectProperty("TBM43_NOTE", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note, false);
      AddObjectProperty("TBM43_ORDER", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order, false);
      AddObjectProperty("TBM43_VERSION", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version, false);
      AddObjectProperty("TBM43_DEL_FLG", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg, false);
      datetime_STZ = gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime ;
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
      AddObjectProperty("TBM43_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM43_CRT_USER_ID", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id, false);
      AddObjectProperty("TBM43_CRT_PROG_NM", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime ;
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
      AddObjectProperty("TBM43_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM43_UPD_USER_ID", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id, false);
      AddObjectProperty("TBM43_UPD_PROG_NM", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm, false);
      AddObjectProperty("TBM43_UPD_CNT", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized, false);
         AddObjectProperty("TBM43_STUDY_ID_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z, false);
         AddObjectProperty("TBM43_DOM_CD_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z, false);
         AddObjectProperty("TBM43_DOM_VAR_NM_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z, false);
         AddObjectProperty("TBM43_VAR_DESC_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z, false);
         AddObjectProperty("TBM43_SDTM_FLG_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z, false);
         AddObjectProperty("TBM43_CDASH_FLG_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z, false);
         AddObjectProperty("TBM43_INPUT_TYPE_DIV_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z, false);
         AddObjectProperty("TBM43_REQUIRED_FLG_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z, false);
         AddObjectProperty("TBM43_SAS_FIELD_NM_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z, false);
         AddObjectProperty("TBM43_ODM_DATA_TYPE_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z, false);
         AddObjectProperty("TBM43_NOTE_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z, false);
         AddObjectProperty("TBM43_ORDER_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z, false);
         AddObjectProperty("TBM43_VERSION_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z, false);
         AddObjectProperty("TBM43_DEL_FLG_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z ;
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
         AddObjectProperty("TBM43_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM43_CRT_USER_ID_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z, false);
         AddObjectProperty("TBM43_CRT_PROG_NM_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z ;
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
         AddObjectProperty("TBM43_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM43_UPD_USER_ID_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z, false);
         AddObjectProperty("TBM43_UPD_PROG_NM_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z, false);
         AddObjectProperty("TBM43_UPD_CNT_Z", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z, false);
         AddObjectProperty("TBM43_VAR_DESC_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N, false);
         AddObjectProperty("TBM43_SDTM_FLG_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N, false);
         AddObjectProperty("TBM43_CDASH_FLG_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N, false);
         AddObjectProperty("TBM43_INPUT_TYPE_DIV_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N, false);
         AddObjectProperty("TBM43_REQUIRED_FLG_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N, false);
         AddObjectProperty("TBM43_SAS_FIELD_NM_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N, false);
         AddObjectProperty("TBM43_ODM_DATA_TYPE_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N, false);
         AddObjectProperty("TBM43_NOTE_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N, false);
         AddObjectProperty("TBM43_ORDER_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N, false);
         AddObjectProperty("TBM43_VERSION_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N, false);
         AddObjectProperty("TBM43_DEL_FLG_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N, false);
         AddObjectProperty("TBM43_CRT_DATETIME_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N, false);
         AddObjectProperty("TBM43_CRT_USER_ID_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N, false);
         AddObjectProperty("TBM43_CRT_PROG_NM_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N, false);
         AddObjectProperty("TBM43_UPD_DATETIME_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N, false);
         AddObjectProperty("TBM43_UPD_USER_ID_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N, false);
         AddObjectProperty("TBM43_UPD_PROG_NM_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N, false);
         AddObjectProperty("TBM43_UPD_CNT_N", gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id( long value )
   {
      if ( gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id != value )
      {
         gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id = value ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd, value) != 0 )
      {
         gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd = value ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm, value) != 0 )
      {
         gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm = value ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order( int value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order = 0 ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt( long value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized( short value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z( long value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z( int value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N( )
   {
      return gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm43_study_cdisc_item_bc obj ;
      obj = new tbm43_study_cdisc_item_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z = "" ;
      gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBM43_STUDY_CDISC_ITEM Clone( )
   {
      SdtTBM43_STUDY_CDISC_ITEM sdt ;
      tbm43_study_cdisc_item_bc obj ;
      sdt = (SdtTBM43_STUDY_CDISC_ITEM)(clone()) ;
      obj = (tbm43_study_cdisc_item_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM43_STUDY_CDISC_ITEM struct )
   {
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id(struct.getTbm43_study_id());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd(struct.getTbm43_dom_cd());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm(struct.getTbm43_dom_var_nm());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc(struct.getTbm43_var_desc());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg(struct.getTbm43_sdtm_flg());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg(struct.getTbm43_cdash_flg());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div(struct.getTbm43_input_type_div());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg(struct.getTbm43_required_flg());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm(struct.getTbm43_sas_field_nm());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type(struct.getTbm43_odm_data_type());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note(struct.getTbm43_note());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order(struct.getTbm43_order());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version(struct.getTbm43_version());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg(struct.getTbm43_del_flg());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime(struct.getTbm43_crt_datetime());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id(struct.getTbm43_crt_user_id());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm(struct.getTbm43_crt_prog_nm());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime(struct.getTbm43_upd_datetime());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id(struct.getTbm43_upd_user_id());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm(struct.getTbm43_upd_prog_nm());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt(struct.getTbm43_upd_cnt());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode(struct.getMode());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized(struct.getInitialized());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z(struct.getTbm43_study_id_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z(struct.getTbm43_dom_cd_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z(struct.getTbm43_dom_var_nm_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z(struct.getTbm43_var_desc_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z(struct.getTbm43_sdtm_flg_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z(struct.getTbm43_cdash_flg_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z(struct.getTbm43_input_type_div_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z(struct.getTbm43_required_flg_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z(struct.getTbm43_sas_field_nm_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z(struct.getTbm43_odm_data_type_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z(struct.getTbm43_note_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z(struct.getTbm43_order_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z(struct.getTbm43_version_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z(struct.getTbm43_del_flg_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z(struct.getTbm43_crt_datetime_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z(struct.getTbm43_crt_user_id_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z(struct.getTbm43_crt_prog_nm_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z(struct.getTbm43_upd_datetime_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z(struct.getTbm43_upd_user_id_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z(struct.getTbm43_upd_prog_nm_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z(struct.getTbm43_upd_cnt_Z());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N(struct.getTbm43_var_desc_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N(struct.getTbm43_sdtm_flg_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N(struct.getTbm43_cdash_flg_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N(struct.getTbm43_input_type_div_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N(struct.getTbm43_required_flg_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N(struct.getTbm43_sas_field_nm_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N(struct.getTbm43_odm_data_type_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N(struct.getTbm43_note_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N(struct.getTbm43_order_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N(struct.getTbm43_version_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N(struct.getTbm43_del_flg_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N(struct.getTbm43_crt_datetime_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N(struct.getTbm43_crt_user_id_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N(struct.getTbm43_crt_prog_nm_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N(struct.getTbm43_upd_datetime_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N(struct.getTbm43_upd_user_id_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N(struct.getTbm43_upd_prog_nm_N());
      setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N(struct.getTbm43_upd_cnt_N());
   }

   public StructSdtTBM43_STUDY_CDISC_ITEM getStruct( )
   {
      StructSdtTBM43_STUDY_CDISC_ITEM struct = new StructSdtTBM43_STUDY_CDISC_ITEM ();
      struct.setTbm43_study_id(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id());
      struct.setTbm43_dom_cd(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd());
      struct.setTbm43_dom_var_nm(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm());
      struct.setTbm43_var_desc(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc());
      struct.setTbm43_sdtm_flg(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg());
      struct.setTbm43_cdash_flg(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg());
      struct.setTbm43_input_type_div(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div());
      struct.setTbm43_required_flg(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg());
      struct.setTbm43_sas_field_nm(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm());
      struct.setTbm43_odm_data_type(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type());
      struct.setTbm43_note(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note());
      struct.setTbm43_order(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order());
      struct.setTbm43_version(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version());
      struct.setTbm43_del_flg(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg());
      struct.setTbm43_crt_datetime(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime());
      struct.setTbm43_crt_user_id(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id());
      struct.setTbm43_crt_prog_nm(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm());
      struct.setTbm43_upd_datetime(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime());
      struct.setTbm43_upd_user_id(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id());
      struct.setTbm43_upd_prog_nm(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm());
      struct.setTbm43_upd_cnt(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt());
      struct.setMode(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode());
      struct.setInitialized(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized());
      struct.setTbm43_study_id_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z());
      struct.setTbm43_dom_cd_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z());
      struct.setTbm43_dom_var_nm_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z());
      struct.setTbm43_var_desc_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z());
      struct.setTbm43_sdtm_flg_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z());
      struct.setTbm43_cdash_flg_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z());
      struct.setTbm43_input_type_div_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z());
      struct.setTbm43_required_flg_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z());
      struct.setTbm43_sas_field_nm_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z());
      struct.setTbm43_odm_data_type_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z());
      struct.setTbm43_note_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z());
      struct.setTbm43_order_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z());
      struct.setTbm43_version_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z());
      struct.setTbm43_del_flg_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z());
      struct.setTbm43_crt_datetime_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z());
      struct.setTbm43_crt_user_id_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z());
      struct.setTbm43_crt_prog_nm_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z());
      struct.setTbm43_upd_datetime_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z());
      struct.setTbm43_upd_user_id_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z());
      struct.setTbm43_upd_prog_nm_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z());
      struct.setTbm43_upd_cnt_Z(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z());
      struct.setTbm43_var_desc_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N());
      struct.setTbm43_sdtm_flg_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N());
      struct.setTbm43_cdash_flg_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N());
      struct.setTbm43_input_type_div_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N());
      struct.setTbm43_required_flg_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N());
      struct.setTbm43_sas_field_nm_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N());
      struct.setTbm43_odm_data_type_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N());
      struct.setTbm43_note_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N());
      struct.setTbm43_order_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N());
      struct.setTbm43_version_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N());
      struct.setTbm43_del_flg_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N());
      struct.setTbm43_crt_datetime_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N());
      struct.setTbm43_crt_user_id_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N());
      struct.setTbm43_crt_prog_nm_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N());
      struct.setTbm43_upd_datetime_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N());
      struct.setTbm43_upd_user_id_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N());
      struct.setTbm43_upd_prog_nm_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N());
      struct.setTbm43_upd_cnt_N(getgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_N ;
   private byte gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_N ;
   private short gxTv_SdtTBM43_STUDY_CDISC_ITEM_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order ;
   private int gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order_Z ;
   private long gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id ;
   private long gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt ;
   private long gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id_Z ;
   private long gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_cnt_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime ;
   private java.util.Date gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime ;
   private java.util.Date gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id_Z ;
   private String gxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm_Z ;
}

