/*
               File: SdtTBT12_CRF_RESULT
        Description: CRFì¸óÕåãâ ÉeÅ[ÉuÉã
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:13.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBT12_CRF_RESULT extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBT12_CRF_RESULT( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBT12_CRF_RESULT.class));
   }

   public SdtTBT12_CRF_RESULT( int remoteHandle ,
                               ModelContext context )
   {
      super( context, "SdtTBT12_CRF_RESULT");
      initialize( remoteHandle) ;
   }

   public SdtTBT12_CRF_RESULT( int remoteHandle ,
                               StructSdtTBT12_CRF_RESULT struct )
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

   public void Load( long AV96TBT12_STUDY_ID ,
                     int AV97TBT12_SUBJECT_ID ,
                     short AV98TBT12_CRF_ID ,
                     byte AV937TBT12_CRF_EDA_NO ,
                     String AV99TBT12_CRF_ITEM_GRP_DIV ,
                     String AV100TBT12_CRF_ITEM_GRP_CD )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV96TBT12_STUDY_ID),new Integer(AV97TBT12_SUBJECT_ID),new Short(AV98TBT12_CRF_ID),new Byte(AV937TBT12_CRF_EDA_NO),AV99TBT12_CRF_ITEM_GRP_DIV,AV100TBT12_CRF_ITEM_GRP_CD});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBT12_STUDY_ID", long.class}, new Object[]{"TBT12_SUBJECT_ID", int.class}, new Object[]{"TBT12_CRF_ID", short.class}, new Object[]{"TBT12_CRF_EDA_NO", byte.class}, new Object[]{"TBT12_CRF_ITEM_GRP_DIV", String.class}, new Object[]{"TBT12_CRF_ITEM_GRP_CD", String.class}}) ;
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
      metadata.set("Name", "TBT12_CRF_RESULT");
      metadata.set("BT", "TBT12_CRF_RESULT");
      metadata.set("PK", "[ \"TBT12_STUDY_ID\",\"TBT12_SUBJECT_ID\",\"TBT12_CRF_ID\",\"TBT12_CRF_EDA_NO\",\"TBT12_CRF_ITEM_GRP_DIV\",\"TBT12_CRF_ITEM_GRP_CD\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_STUDY_ID") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_SUBJECT_ID") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_ID") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_EDA_NO") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_ITEM_GRP_DIV") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_VALUE") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_EDIT_FLG") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_DEL_FLG") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_USER_ID") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_PROG_NM") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_USER_ID") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_PROG_NM") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_CNT") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_STUDY_ID_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_ID_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_EDA_NO_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_ITEM_GRP_DIV_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_ITEM_GRP_CD_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_VALUE_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_EDIT_FLG_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_DEL_FLG_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_CNT_Z") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRF_VALUE_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_EDIT_FLG_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_DEL_FLG_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_DATETIME_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_USER_ID_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_DATETIME_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_USER_ID_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT12_UPD_CNT_N") )
            {
               gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBT12_CRF_RESULT" ;
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
      oWriter.writeElement("TBT12_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_CRF_ITEM_GRP_DIV", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_CRF_VALUE", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_EDIT_FLG", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_DEL_FLG", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime) )
      {
         oWriter.writeStartElement("TBT12_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT12_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT12_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime) )
      {
         oWriter.writeStartElement("TBT12_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT12_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT12_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT12_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRF_EDA_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRF_ITEM_GRP_DIV_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRF_ITEM_GRP_CD_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRF_VALUE_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_EDIT_FLG_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBT12_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT12_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT12_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBT12_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT12_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT12_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRF_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_EDIT_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT12_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBT12_STUDY_ID", gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id, false);
      AddObjectProperty("TBT12_SUBJECT_ID", gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id, false);
      AddObjectProperty("TBT12_CRF_ID", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id, false);
      AddObjectProperty("TBT12_CRF_EDA_NO", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no, false);
      AddObjectProperty("TBT12_CRF_ITEM_GRP_DIV", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div, false);
      AddObjectProperty("TBT12_CRF_ITEM_GRP_CD", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd, false);
      AddObjectProperty("TBT12_CRF_VALUE", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value, false);
      AddObjectProperty("TBT12_EDIT_FLG", gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg, false);
      AddObjectProperty("TBT12_DEL_FLG", gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg, false);
      datetime_STZ = gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime ;
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
      AddObjectProperty("TBT12_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT12_CRT_USER_ID", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id, false);
      AddObjectProperty("TBT12_CRT_PROG_NM", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime ;
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
      AddObjectProperty("TBT12_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT12_UPD_USER_ID", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id, false);
      AddObjectProperty("TBT12_UPD_PROG_NM", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm, false);
      AddObjectProperty("TBT12_UPD_CNT", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBT12_CRF_RESULT_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBT12_CRF_RESULT_Initialized, false);
         AddObjectProperty("TBT12_STUDY_ID_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z, false);
         AddObjectProperty("TBT12_SUBJECT_ID_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z, false);
         AddObjectProperty("TBT12_CRF_ID_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z, false);
         AddObjectProperty("TBT12_CRF_EDA_NO_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z, false);
         AddObjectProperty("TBT12_CRF_ITEM_GRP_DIV_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z, false);
         AddObjectProperty("TBT12_CRF_ITEM_GRP_CD_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z, false);
         AddObjectProperty("TBT12_CRF_VALUE_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z, false);
         AddObjectProperty("TBT12_EDIT_FLG_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z, false);
         AddObjectProperty("TBT12_DEL_FLG_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z ;
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
         AddObjectProperty("TBT12_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT12_CRT_USER_ID_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z, false);
         AddObjectProperty("TBT12_CRT_PROG_NM_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z ;
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
         AddObjectProperty("TBT12_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT12_UPD_USER_ID_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z, false);
         AddObjectProperty("TBT12_UPD_PROG_NM_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z, false);
         AddObjectProperty("TBT12_UPD_CNT_Z", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z, false);
         AddObjectProperty("TBT12_CRF_VALUE_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N, false);
         AddObjectProperty("TBT12_EDIT_FLG_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N, false);
         AddObjectProperty("TBT12_DEL_FLG_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N, false);
         AddObjectProperty("TBT12_CRT_DATETIME_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N, false);
         AddObjectProperty("TBT12_CRT_USER_ID_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N, false);
         AddObjectProperty("TBT12_CRT_PROG_NM_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N, false);
         AddObjectProperty("TBT12_UPD_DATETIME_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N, false);
         AddObjectProperty("TBT12_UPD_USER_ID_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N, false);
         AddObjectProperty("TBT12_UPD_PROG_NM_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N, false);
         AddObjectProperty("TBT12_UPD_CNT_N", gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id( long value )
   {
      if ( gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id != value )
      {
         gxTv_SdtTBT12_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id = value ;
   }

   public int getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id( int value )
   {
      if ( gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id != value )
      {
         gxTv_SdtTBT12_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id = value ;
   }

   public short getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id( short value )
   {
      if ( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id != value )
      {
         gxTv_SdtTBT12_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id = value ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no( byte value )
   {
      if ( gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no != value )
      {
         gxTv_SdtTBT12_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no = value ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div, value) != 0 )
      {
         gxTv_SdtTBT12_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div = value ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd, value) != 0 )
      {
         gxTv_SdtTBT12_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt( long value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Mode( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Mode ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Mode( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Mode = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Mode_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Mode = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT12_CRF_RESULT_Initialized( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Initialized ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Initialized( short value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Initialized = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Initialized_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z( long value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z( int value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z( short value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N( )
   {
      return gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbt12_crf_result_bc obj ;
      obj = new tbt12_crf_result_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Mode = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z = "" ;
      gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBT12_CRF_RESULT Clone( )
   {
      SdtTBT12_CRF_RESULT sdt ;
      tbt12_crf_result_bc obj ;
      sdt = (SdtTBT12_CRF_RESULT)(clone()) ;
      obj = (tbt12_crf_result_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBT12_CRF_RESULT struct )
   {
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id(struct.getTbt12_study_id());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id(struct.getTbt12_subject_id());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id(struct.getTbt12_crf_id());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no(struct.getTbt12_crf_eda_no());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div(struct.getTbt12_crf_item_grp_div());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd(struct.getTbt12_crf_item_grp_cd());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value(struct.getTbt12_crf_value());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg(struct.getTbt12_edit_flg());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg(struct.getTbt12_del_flg());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime(struct.getTbt12_crt_datetime());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id(struct.getTbt12_crt_user_id());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm(struct.getTbt12_crt_prog_nm());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime(struct.getTbt12_upd_datetime());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id(struct.getTbt12_upd_user_id());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm(struct.getTbt12_upd_prog_nm());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt(struct.getTbt12_upd_cnt());
      setgxTv_SdtTBT12_CRF_RESULT_Mode(struct.getMode());
      setgxTv_SdtTBT12_CRF_RESULT_Initialized(struct.getInitialized());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z(struct.getTbt12_study_id_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z(struct.getTbt12_subject_id_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z(struct.getTbt12_crf_id_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z(struct.getTbt12_crf_eda_no_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z(struct.getTbt12_crf_item_grp_div_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z(struct.getTbt12_crf_item_grp_cd_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z(struct.getTbt12_crf_value_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z(struct.getTbt12_edit_flg_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z(struct.getTbt12_del_flg_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z(struct.getTbt12_crt_datetime_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z(struct.getTbt12_crt_user_id_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z(struct.getTbt12_crt_prog_nm_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z(struct.getTbt12_upd_datetime_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z(struct.getTbt12_upd_user_id_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z(struct.getTbt12_upd_prog_nm_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z(struct.getTbt12_upd_cnt_Z());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N(struct.getTbt12_crf_value_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N(struct.getTbt12_edit_flg_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N(struct.getTbt12_del_flg_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N(struct.getTbt12_crt_datetime_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N(struct.getTbt12_crt_user_id_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N(struct.getTbt12_crt_prog_nm_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N(struct.getTbt12_upd_datetime_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N(struct.getTbt12_upd_user_id_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N(struct.getTbt12_upd_prog_nm_N());
      setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N(struct.getTbt12_upd_cnt_N());
   }

   public StructSdtTBT12_CRF_RESULT getStruct( )
   {
      StructSdtTBT12_CRF_RESULT struct = new StructSdtTBT12_CRF_RESULT ();
      struct.setTbt12_study_id(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id());
      struct.setTbt12_subject_id(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id());
      struct.setTbt12_crf_id(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id());
      struct.setTbt12_crf_eda_no(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no());
      struct.setTbt12_crf_item_grp_div(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div());
      struct.setTbt12_crf_item_grp_cd(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd());
      struct.setTbt12_crf_value(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value());
      struct.setTbt12_edit_flg(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg());
      struct.setTbt12_del_flg(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg());
      struct.setTbt12_crt_datetime(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime());
      struct.setTbt12_crt_user_id(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id());
      struct.setTbt12_crt_prog_nm(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm());
      struct.setTbt12_upd_datetime(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime());
      struct.setTbt12_upd_user_id(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id());
      struct.setTbt12_upd_prog_nm(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm());
      struct.setTbt12_upd_cnt(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt());
      struct.setMode(getgxTv_SdtTBT12_CRF_RESULT_Mode());
      struct.setInitialized(getgxTv_SdtTBT12_CRF_RESULT_Initialized());
      struct.setTbt12_study_id_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z());
      struct.setTbt12_subject_id_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z());
      struct.setTbt12_crf_id_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z());
      struct.setTbt12_crf_eda_no_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z());
      struct.setTbt12_crf_item_grp_div_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z());
      struct.setTbt12_crf_item_grp_cd_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z());
      struct.setTbt12_crf_value_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z());
      struct.setTbt12_edit_flg_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z());
      struct.setTbt12_del_flg_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z());
      struct.setTbt12_crt_datetime_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z());
      struct.setTbt12_crt_user_id_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z());
      struct.setTbt12_crt_prog_nm_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z());
      struct.setTbt12_upd_datetime_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z());
      struct.setTbt12_upd_user_id_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z());
      struct.setTbt12_upd_prog_nm_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z());
      struct.setTbt12_upd_cnt_Z(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z());
      struct.setTbt12_crf_value_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N());
      struct.setTbt12_edit_flg_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N());
      struct.setTbt12_del_flg_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N());
      struct.setTbt12_crt_datetime_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N());
      struct.setTbt12_crt_user_id_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N());
      struct.setTbt12_crt_prog_nm_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N());
      struct.setTbt12_upd_datetime_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N());
      struct.setTbt12_upd_user_id_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N());
      struct.setTbt12_upd_prog_nm_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N());
      struct.setTbt12_upd_cnt_N(getgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no_Z ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_N ;
   private byte gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_N ;
   private short gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id ;
   private short gxTv_SdtTBT12_CRF_RESULT_Initialized ;
   private short gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id ;
   private int gxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id_Z ;
   private long gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id ;
   private long gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt ;
   private long gxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id_Z ;
   private long gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_cnt_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime ;
   private java.util.Date gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime ;
   private java.util.Date gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_user_id_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_user_id_Z ;
   private String gxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm_Z ;
}

