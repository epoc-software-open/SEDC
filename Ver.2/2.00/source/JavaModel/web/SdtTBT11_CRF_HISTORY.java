/*
               File: SdtTBT11_CRF_HISTORY
        Description: CRFèCê≥óöóÉeÅ[ÉuÉã
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:10.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBT11_CRF_HISTORY extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBT11_CRF_HISTORY( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBT11_CRF_HISTORY.class));
   }

   public SdtTBT11_CRF_HISTORY( int remoteHandle ,
                                ModelContext context )
   {
      super( context, "SdtTBT11_CRF_HISTORY");
      initialize( remoteHandle) ;
   }

   public SdtTBT11_CRF_HISTORY( int remoteHandle ,
                                StructSdtTBT11_CRF_HISTORY struct )
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

   public void Load( long AV92TBT11_STUDY_ID ,
                     int AV93TBT11_SUBJECT_ID ,
                     short AV94TBT11_CRF_ID ,
                     byte AV936TBT11_CRF_EDA_NO ,
                     short AV95TBT11_CRF_VERSION )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV92TBT11_STUDY_ID),new Integer(AV93TBT11_SUBJECT_ID),new Short(AV94TBT11_CRF_ID),new Byte(AV936TBT11_CRF_EDA_NO),new Short(AV95TBT11_CRF_VERSION)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBT11_STUDY_ID", long.class}, new Object[]{"TBT11_SUBJECT_ID", int.class}, new Object[]{"TBT11_CRF_ID", short.class}, new Object[]{"TBT11_CRF_EDA_NO", byte.class}, new Object[]{"TBT11_CRF_VERSION", short.class}}) ;
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
      metadata.set("Name", "TBT11_CRF_HISTORY");
      metadata.set("BT", "TBT11_CRF_HISTORY");
      metadata.set("PK", "[ \"TBT11_STUDY_ID\",\"TBT11_SUBJECT_ID\",\"TBT11_CRF_ID\",\"TBT11_CRF_EDA_NO\",\"TBT11_CRF_VERSION\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_STUDY_ID") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_SUBJECT_ID") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_ID") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_EDA_NO") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_VERSION") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_INPUT_LEVEL") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_USER_ID") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_AUTH_CD") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DM_ARRIVAL_FLG") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DM_ARRIVAL_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_FLG") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_USER_ID") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_AUTH_CD") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_FLG") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_USER_ID") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_AUTH_CD") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_RIYU") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DEL_FLG") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_USER_ID") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_PROG_NM") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_USER_ID") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_PROG_NM") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_CNT") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_STUDY_ID_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_ID_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_EDA_NO_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_VERSION_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_INPUT_LEVEL_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_USER_ID_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_AUTH_CD_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DM_ARRIVAL_FLG_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DM_ARRIVAL_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_FLG_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_USER_ID_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_AUTH_CD_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_FLG_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_USER_ID_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_AUTH_CD_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_RIYU_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DEL_FLG_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_CNT_Z") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_INPUT_LEVEL_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_DATETIME_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_USER_ID_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_AUTH_CD_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DM_ARRIVAL_FLG_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DM_ARRIVAL_DATETIME_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_FLG_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_DATETIME_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_USER_ID_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_APPROVAL_AUTH_CD_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_FLG_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_DATETIME_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_USER_ID_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_INPUT_END_AUTH_CD_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_RIYU_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_DEL_FLG_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_DATETIME_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_USER_ID_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_DATETIME_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_USER_ID_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_CNT_N") )
            {
               gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBT11_CRF_HISTORY" ;
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
      oWriter.writeElement("TBT11_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_CRF_VERSION", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_CRF_INPUT_LEVEL", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime) )
      {
         oWriter.writeStartElement("TBT11_UPLOAD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT11_UPLOAD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT11_UPLOAD_USER_ID", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_UPLOAD_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_DM_ARRIVAL_FLG", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime) )
      {
         oWriter.writeStartElement("TBT11_DM_ARRIVAL_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT11_DM_ARRIVAL_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT11_APPROVAL_FLG", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime) )
      {
         oWriter.writeStartElement("TBT11_APPROVAL_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT11_APPROVAL_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT11_APPROVAL_USER_ID", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_APPROVAL_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_INPUT_END_FLG", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime) )
      {
         oWriter.writeStartElement("TBT11_INPUT_END_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT11_INPUT_END_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT11_INPUT_END_USER_ID", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_INPUT_END_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_UPD_RIYU", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_DEL_FLG", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime) )
      {
         oWriter.writeStartElement("TBT11_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT11_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT11_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime) )
      {
         oWriter.writeStartElement("TBT11_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT11_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT11_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRF_EDA_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRF_VERSION_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRF_INPUT_LEVEL_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z) )
         {
            oWriter.writeStartElement("TBT11_UPLOAD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT11_UPLOAD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT11_UPLOAD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPLOAD_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_DM_ARRIVAL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z) )
         {
            oWriter.writeStartElement("TBT11_DM_ARRIVAL_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT11_DM_ARRIVAL_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT11_APPROVAL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z) )
         {
            oWriter.writeStartElement("TBT11_APPROVAL_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT11_APPROVAL_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT11_APPROVAL_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_APPROVAL_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_INPUT_END_FLG_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z) )
         {
            oWriter.writeStartElement("TBT11_INPUT_END_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT11_INPUT_END_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT11_INPUT_END_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_INPUT_END_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPD_RIYU_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBT11_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT11_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT11_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBT11_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT11_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT11_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRF_INPUT_LEVEL_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPLOAD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPLOAD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPLOAD_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_DM_ARRIVAL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_DM_ARRIVAL_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_APPROVAL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_APPROVAL_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_APPROVAL_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_APPROVAL_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_INPUT_END_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_INPUT_END_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_INPUT_END_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_INPUT_END_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPD_RIYU_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT11_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBT11_STUDY_ID", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id, false);
      AddObjectProperty("TBT11_SUBJECT_ID", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id, false);
      AddObjectProperty("TBT11_CRF_ID", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id, false);
      AddObjectProperty("TBT11_CRF_EDA_NO", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no, false);
      AddObjectProperty("TBT11_CRF_VERSION", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version, false);
      AddObjectProperty("TBT11_CRF_INPUT_LEVEL", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level, false);
      datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime ;
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
      AddObjectProperty("TBT11_UPLOAD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT11_UPLOAD_USER_ID", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id, false);
      AddObjectProperty("TBT11_UPLOAD_AUTH_CD", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd, false);
      AddObjectProperty("TBT11_DM_ARRIVAL_FLG", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg, false);
      datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime ;
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
      AddObjectProperty("TBT11_DM_ARRIVAL_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT11_APPROVAL_FLG", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg, false);
      datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime ;
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
      AddObjectProperty("TBT11_APPROVAL_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT11_APPROVAL_USER_ID", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id, false);
      AddObjectProperty("TBT11_APPROVAL_AUTH_CD", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd, false);
      AddObjectProperty("TBT11_INPUT_END_FLG", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg, false);
      datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime ;
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
      AddObjectProperty("TBT11_INPUT_END_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT11_INPUT_END_USER_ID", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id, false);
      AddObjectProperty("TBT11_INPUT_END_AUTH_CD", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd, false);
      AddObjectProperty("TBT11_UPD_RIYU", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu, false);
      AddObjectProperty("TBT11_DEL_FLG", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg, false);
      datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime ;
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
      AddObjectProperty("TBT11_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT11_CRT_USER_ID", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id, false);
      AddObjectProperty("TBT11_CRT_PROG_NM", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime ;
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
      AddObjectProperty("TBT11_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT11_UPD_USER_ID", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id, false);
      AddObjectProperty("TBT11_UPD_PROG_NM", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm, false);
      AddObjectProperty("TBT11_UPD_CNT", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBT11_CRF_HISTORY_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBT11_CRF_HISTORY_Initialized, false);
         AddObjectProperty("TBT11_STUDY_ID_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z, false);
         AddObjectProperty("TBT11_SUBJECT_ID_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z, false);
         AddObjectProperty("TBT11_CRF_ID_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z, false);
         AddObjectProperty("TBT11_CRF_EDA_NO_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z, false);
         AddObjectProperty("TBT11_CRF_VERSION_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z, false);
         AddObjectProperty("TBT11_CRF_INPUT_LEVEL_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z, false);
         datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z ;
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
         AddObjectProperty("TBT11_UPLOAD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT11_UPLOAD_USER_ID_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z, false);
         AddObjectProperty("TBT11_UPLOAD_AUTH_CD_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z, false);
         AddObjectProperty("TBT11_DM_ARRIVAL_FLG_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z ;
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
         AddObjectProperty("TBT11_DM_ARRIVAL_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT11_APPROVAL_FLG_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z ;
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
         AddObjectProperty("TBT11_APPROVAL_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT11_APPROVAL_USER_ID_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z, false);
         AddObjectProperty("TBT11_APPROVAL_AUTH_CD_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z, false);
         AddObjectProperty("TBT11_INPUT_END_FLG_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z ;
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
         AddObjectProperty("TBT11_INPUT_END_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT11_INPUT_END_USER_ID_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z, false);
         AddObjectProperty("TBT11_INPUT_END_AUTH_CD_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z, false);
         AddObjectProperty("TBT11_UPD_RIYU_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z, false);
         AddObjectProperty("TBT11_DEL_FLG_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z ;
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
         AddObjectProperty("TBT11_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT11_CRT_USER_ID_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z, false);
         AddObjectProperty("TBT11_CRT_PROG_NM_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z ;
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
         AddObjectProperty("TBT11_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT11_UPD_USER_ID_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z, false);
         AddObjectProperty("TBT11_UPD_PROG_NM_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z, false);
         AddObjectProperty("TBT11_UPD_CNT_Z", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z, false);
         AddObjectProperty("TBT11_CRF_INPUT_LEVEL_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N, false);
         AddObjectProperty("TBT11_UPLOAD_DATETIME_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N, false);
         AddObjectProperty("TBT11_UPLOAD_USER_ID_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N, false);
         AddObjectProperty("TBT11_UPLOAD_AUTH_CD_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N, false);
         AddObjectProperty("TBT11_DM_ARRIVAL_FLG_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N, false);
         AddObjectProperty("TBT11_DM_ARRIVAL_DATETIME_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N, false);
         AddObjectProperty("TBT11_APPROVAL_FLG_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N, false);
         AddObjectProperty("TBT11_APPROVAL_DATETIME_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N, false);
         AddObjectProperty("TBT11_APPROVAL_USER_ID_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N, false);
         AddObjectProperty("TBT11_APPROVAL_AUTH_CD_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N, false);
         AddObjectProperty("TBT11_INPUT_END_FLG_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N, false);
         AddObjectProperty("TBT11_INPUT_END_DATETIME_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N, false);
         AddObjectProperty("TBT11_INPUT_END_USER_ID_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N, false);
         AddObjectProperty("TBT11_INPUT_END_AUTH_CD_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N, false);
         AddObjectProperty("TBT11_UPD_RIYU_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N, false);
         AddObjectProperty("TBT11_DEL_FLG_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N, false);
         AddObjectProperty("TBT11_CRT_DATETIME_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N, false);
         AddObjectProperty("TBT11_CRT_USER_ID_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N, false);
         AddObjectProperty("TBT11_CRT_PROG_NM_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N, false);
         AddObjectProperty("TBT11_UPD_DATETIME_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N, false);
         AddObjectProperty("TBT11_UPD_USER_ID_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N, false);
         AddObjectProperty("TBT11_UPD_PROG_NM_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N, false);
         AddObjectProperty("TBT11_UPD_CNT_N", gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( long value )
   {
      if ( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id != value )
      {
         gxTv_SdtTBT11_CRF_HISTORY_Mode = "INS" ;
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id = value ;
   }

   public int getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( int value )
   {
      if ( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id != value )
      {
         gxTv_SdtTBT11_CRF_HISTORY_Mode = "INS" ;
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id = value ;
   }

   public short getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( short value )
   {
      if ( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id != value )
      {
         gxTv_SdtTBT11_CRF_HISTORY_Mode = "INS" ;
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id = value ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no( byte value )
   {
      if ( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no != value )
      {
         gxTv_SdtTBT11_CRF_HISTORY_Mode = "INS" ;
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no = value ;
   }

   public short getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( short value )
   {
      if ( gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version != value )
      {
         gxTv_SdtTBT11_CRF_HISTORY_Mode = "INS" ;
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version = value ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt( long value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Mode( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Mode ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Mode( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Mode = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Mode_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Mode = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT11_CRF_HISTORY_Initialized( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Initialized ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Initialized( short value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Initialized = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Initialized_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z( long value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z( int value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z( short value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z( short value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N( )
   {
      return gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbt11_crf_history_bc obj ;
      obj = new tbt11_crf_history_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Mode = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z = "" ;
      gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBT11_CRF_HISTORY Clone( )
   {
      SdtTBT11_CRF_HISTORY sdt ;
      tbt11_crf_history_bc obj ;
      sdt = (SdtTBT11_CRF_HISTORY)(clone()) ;
      obj = (tbt11_crf_history_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBT11_CRF_HISTORY struct )
   {
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id(struct.getTbt11_study_id());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id(struct.getTbt11_subject_id());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id(struct.getTbt11_crf_id());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no(struct.getTbt11_crf_eda_no());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version(struct.getTbt11_crf_version());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level(struct.getTbt11_crf_input_level());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime(struct.getTbt11_upload_datetime());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id(struct.getTbt11_upload_user_id());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd(struct.getTbt11_upload_auth_cd());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg(struct.getTbt11_dm_arrival_flg());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime(struct.getTbt11_dm_arrival_datetime());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg(struct.getTbt11_approval_flg());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime(struct.getTbt11_approval_datetime());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id(struct.getTbt11_approval_user_id());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd(struct.getTbt11_approval_auth_cd());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg(struct.getTbt11_input_end_flg());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime(struct.getTbt11_input_end_datetime());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id(struct.getTbt11_input_end_user_id());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd(struct.getTbt11_input_end_auth_cd());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu(struct.getTbt11_upd_riyu());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg(struct.getTbt11_del_flg());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime(struct.getTbt11_crt_datetime());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id(struct.getTbt11_crt_user_id());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm(struct.getTbt11_crt_prog_nm());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime(struct.getTbt11_upd_datetime());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id(struct.getTbt11_upd_user_id());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm(struct.getTbt11_upd_prog_nm());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt(struct.getTbt11_upd_cnt());
      setgxTv_SdtTBT11_CRF_HISTORY_Mode(struct.getMode());
      setgxTv_SdtTBT11_CRF_HISTORY_Initialized(struct.getInitialized());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z(struct.getTbt11_study_id_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z(struct.getTbt11_subject_id_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z(struct.getTbt11_crf_id_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z(struct.getTbt11_crf_eda_no_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z(struct.getTbt11_crf_version_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z(struct.getTbt11_crf_input_level_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z(struct.getTbt11_upload_datetime_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z(struct.getTbt11_upload_user_id_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z(struct.getTbt11_upload_auth_cd_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z(struct.getTbt11_dm_arrival_flg_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z(struct.getTbt11_dm_arrival_datetime_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z(struct.getTbt11_approval_flg_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z(struct.getTbt11_approval_datetime_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z(struct.getTbt11_approval_user_id_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z(struct.getTbt11_approval_auth_cd_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z(struct.getTbt11_input_end_flg_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z(struct.getTbt11_input_end_datetime_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z(struct.getTbt11_input_end_user_id_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z(struct.getTbt11_input_end_auth_cd_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z(struct.getTbt11_upd_riyu_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z(struct.getTbt11_del_flg_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z(struct.getTbt11_crt_datetime_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z(struct.getTbt11_crt_user_id_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z(struct.getTbt11_crt_prog_nm_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z(struct.getTbt11_upd_datetime_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z(struct.getTbt11_upd_user_id_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z(struct.getTbt11_upd_prog_nm_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z(struct.getTbt11_upd_cnt_Z());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N(struct.getTbt11_crf_input_level_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N(struct.getTbt11_upload_datetime_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N(struct.getTbt11_upload_user_id_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N(struct.getTbt11_upload_auth_cd_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N(struct.getTbt11_dm_arrival_flg_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N(struct.getTbt11_dm_arrival_datetime_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N(struct.getTbt11_approval_flg_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N(struct.getTbt11_approval_datetime_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N(struct.getTbt11_approval_user_id_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N(struct.getTbt11_approval_auth_cd_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N(struct.getTbt11_input_end_flg_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N(struct.getTbt11_input_end_datetime_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N(struct.getTbt11_input_end_user_id_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N(struct.getTbt11_input_end_auth_cd_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N(struct.getTbt11_upd_riyu_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N(struct.getTbt11_del_flg_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N(struct.getTbt11_crt_datetime_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N(struct.getTbt11_crt_user_id_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N(struct.getTbt11_crt_prog_nm_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N(struct.getTbt11_upd_datetime_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N(struct.getTbt11_upd_user_id_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N(struct.getTbt11_upd_prog_nm_N());
      setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N(struct.getTbt11_upd_cnt_N());
   }

   public StructSdtTBT11_CRF_HISTORY getStruct( )
   {
      StructSdtTBT11_CRF_HISTORY struct = new StructSdtTBT11_CRF_HISTORY ();
      struct.setTbt11_study_id(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id());
      struct.setTbt11_subject_id(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id());
      struct.setTbt11_crf_id(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id());
      struct.setTbt11_crf_eda_no(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no());
      struct.setTbt11_crf_version(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version());
      struct.setTbt11_crf_input_level(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level());
      struct.setTbt11_upload_datetime(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime());
      struct.setTbt11_upload_user_id(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id());
      struct.setTbt11_upload_auth_cd(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd());
      struct.setTbt11_dm_arrival_flg(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg());
      struct.setTbt11_dm_arrival_datetime(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime());
      struct.setTbt11_approval_flg(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg());
      struct.setTbt11_approval_datetime(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime());
      struct.setTbt11_approval_user_id(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id());
      struct.setTbt11_approval_auth_cd(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd());
      struct.setTbt11_input_end_flg(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg());
      struct.setTbt11_input_end_datetime(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime());
      struct.setTbt11_input_end_user_id(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id());
      struct.setTbt11_input_end_auth_cd(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd());
      struct.setTbt11_upd_riyu(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu());
      struct.setTbt11_del_flg(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg());
      struct.setTbt11_crt_datetime(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime());
      struct.setTbt11_crt_user_id(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id());
      struct.setTbt11_crt_prog_nm(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm());
      struct.setTbt11_upd_datetime(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime());
      struct.setTbt11_upd_user_id(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id());
      struct.setTbt11_upd_prog_nm(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm());
      struct.setTbt11_upd_cnt(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt());
      struct.setMode(getgxTv_SdtTBT11_CRF_HISTORY_Mode());
      struct.setInitialized(getgxTv_SdtTBT11_CRF_HISTORY_Initialized());
      struct.setTbt11_study_id_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z());
      struct.setTbt11_subject_id_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z());
      struct.setTbt11_crf_id_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z());
      struct.setTbt11_crf_eda_no_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z());
      struct.setTbt11_crf_version_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z());
      struct.setTbt11_crf_input_level_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z());
      struct.setTbt11_upload_datetime_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z());
      struct.setTbt11_upload_user_id_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z());
      struct.setTbt11_upload_auth_cd_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z());
      struct.setTbt11_dm_arrival_flg_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z());
      struct.setTbt11_dm_arrival_datetime_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z());
      struct.setTbt11_approval_flg_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z());
      struct.setTbt11_approval_datetime_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z());
      struct.setTbt11_approval_user_id_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z());
      struct.setTbt11_approval_auth_cd_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z());
      struct.setTbt11_input_end_flg_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z());
      struct.setTbt11_input_end_datetime_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z());
      struct.setTbt11_input_end_user_id_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z());
      struct.setTbt11_input_end_auth_cd_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z());
      struct.setTbt11_upd_riyu_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z());
      struct.setTbt11_del_flg_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z());
      struct.setTbt11_crt_datetime_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z());
      struct.setTbt11_crt_user_id_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z());
      struct.setTbt11_crt_prog_nm_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z());
      struct.setTbt11_upd_datetime_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z());
      struct.setTbt11_upd_user_id_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z());
      struct.setTbt11_upd_prog_nm_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z());
      struct.setTbt11_upd_cnt_Z(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z());
      struct.setTbt11_crf_input_level_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N());
      struct.setTbt11_upload_datetime_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N());
      struct.setTbt11_upload_user_id_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N());
      struct.setTbt11_upload_auth_cd_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N());
      struct.setTbt11_dm_arrival_flg_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N());
      struct.setTbt11_dm_arrival_datetime_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N());
      struct.setTbt11_approval_flg_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N());
      struct.setTbt11_approval_datetime_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N());
      struct.setTbt11_approval_user_id_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N());
      struct.setTbt11_approval_auth_cd_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N());
      struct.setTbt11_input_end_flg_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N());
      struct.setTbt11_input_end_datetime_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N());
      struct.setTbt11_input_end_user_id_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N());
      struct.setTbt11_input_end_auth_cd_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N());
      struct.setTbt11_upd_riyu_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N());
      struct.setTbt11_del_flg_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N());
      struct.setTbt11_crt_datetime_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N());
      struct.setTbt11_crt_user_id_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N());
      struct.setTbt11_crt_prog_nm_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N());
      struct.setTbt11_upd_datetime_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N());
      struct.setTbt11_upd_user_id_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N());
      struct.setTbt11_upd_prog_nm_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N());
      struct.setTbt11_upd_cnt_N(getgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no_Z ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_Z ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_N ;
   private byte gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_N ;
   private short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id ;
   private short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version ;
   private short gxTv_SdtTBT11_CRF_HISTORY_Initialized ;
   private short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id_Z ;
   private short gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id ;
   private int gxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id_Z ;
   private long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id ;
   private long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt ;
   private long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id_Z ;
   private long gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_cnt_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_riyu_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_user_id_Z ;
   private String gxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm_Z ;
}

