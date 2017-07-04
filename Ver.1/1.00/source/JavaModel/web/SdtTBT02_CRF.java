import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTBT02_CRF extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBT02_CRF( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBT02_CRF.class));
   }

   public SdtTBT02_CRF( int remoteHandle ,
                        ModelContext context )
   {
      super( context, "SdtTBT02_CRF");
      initialize( remoteHandle) ;
   }

   public SdtTBT02_CRF( int remoteHandle ,
                        StructSdtTBT02_CRF struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( long AV292TBT02_STUDY_ID ,
                     int AV293TBT02_SUBJECT_ID ,
                     short AV294TBT02_CRF_ID )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV292TBT02_STUDY_ID),new Integer(AV293TBT02_SUBJECT_ID),new Short(AV294TBT02_CRF_ID)});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_STUDY_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SUBJECT_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_LATEST_VERSION") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_INPUT_LEVEL") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crf_input_level = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_FLG") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_lock_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_lock_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_USER_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_AUTH_CD") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_upload_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_USER_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upload_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_AUTH_CD") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_FLG") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_FLG") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_approval_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_USER_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_AUTH_CD") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_FLG") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_USER_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_AUTH_CD") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DEL_FLG") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_USER_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_PROG_NM") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_USER_ID") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_PROG_NM") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_CNT") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBT02_CRF_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBT02_CRF_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_STUDY_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_LATEST_VERSION_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_INPUT_LEVEL_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_FLG_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_USER_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_AUTH_CD_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_USER_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_AUTH_CD_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_FLG_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_FLG_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_USER_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_AUTH_CD_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_FLG_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_USER_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_AUTH_CD_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DEL_FLG_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_CNT_Z") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_LATEST_VERSION_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_INPUT_LEVEL_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_FLG_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_DATETIME_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_USER_ID_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_LOCK_AUTH_CD_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_DATETIME_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_USER_ID_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_AUTH_CD_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_FLG_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_DATETIME_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_FLG_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_DATETIME_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_USER_ID_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_APPROVAL_AUTH_CD_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_FLG_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_DATETIME_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_USER_ID_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_AUTH_CD_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DEL_FLG_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_DATETIME_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_USER_ID_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_DATETIME_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_USER_ID_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_CNT_N") )
            {
               gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "TBT02_CRF" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "SmartEDC_SHIZUOKA" ;
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
      oWriter.writeElement("TBT02_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_LATEST_VERSION", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_INPUT_LEVEL", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crf_input_level, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_LOCK_FLG", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_lock_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_lock_datetime) )
      {
         oWriter.writeStartElement("TBT02_LOCK_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_LOCK_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_LOCK_USER_ID", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_lock_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_LOCK_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_upload_datetime) )
      {
         oWriter.writeStartElement("TBT02_UPLOAD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_UPLOAD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_UPLOAD_USER_ID", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_upload_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPLOAD_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_DM_ARRIVAL_FLG", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime) )
      {
         oWriter.writeStartElement("TBT02_DM_ARRIVAL_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_DM_ARRIVAL_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_APPROVAL_FLG", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_approval_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_approval_datetime) )
      {
         oWriter.writeStartElement("TBT02_APPROVAL_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_APPROVAL_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_APPROVAL_USER_ID", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_approval_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_APPROVAL_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_FLG", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_input_end_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime) )
      {
         oWriter.writeStartElement("TBT02_INPUT_END_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_INPUT_END_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_INPUT_END_USER_ID", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_DEL_FLG", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_crt_datetime) )
      {
         oWriter.writeStartElement("TBT02_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_upd_datetime) )
      {
         oWriter.writeStartElement("TBT02_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBT02_CRF_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_study_id_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_subject_id_Z, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crf_id_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_LATEST_VERSION_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_INPUT_LEVEL_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_LOCK_FLG_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z) )
      {
         oWriter.writeStartElement("TBT02_LOCK_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_LOCK_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_LOCK_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_LOCK_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z) )
      {
         oWriter.writeStartElement("TBT02_UPLOAD_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_UPLOAD_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_UPLOAD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPLOAD_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_DM_ARRIVAL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z) )
      {
         oWriter.writeStartElement("TBT02_DM_ARRIVAL_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_DM_ARRIVAL_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_APPROVAL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z) )
      {
         oWriter.writeStartElement("TBT02_APPROVAL_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_APPROVAL_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_APPROVAL_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_APPROVAL_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_FLG_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z) )
      {
         oWriter.writeStartElement("TBT02_INPUT_END_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_INPUT_END_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_INPUT_END_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z) )
      {
         oWriter.writeStartElement("TBT02_CRT_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_CRT_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z) )
      {
         oWriter.writeStartElement("TBT02_UPD_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_UPD_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_LATEST_VERSION_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_INPUT_LEVEL_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_LOCK_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_LOCK_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_LOCK_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_LOCK_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPLOAD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPLOAD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPLOAD_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_DM_ARRIVAL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_DM_ARRIVAL_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_APPROVAL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_APPROVAL_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_APPROVAL_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_APPROVAL_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_del_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBT02_STUDY_ID", gxTv_SdtTBT02_CRF_Tbt02_study_id);
      AddObjectProperty("TBT02_SUBJECT_ID", gxTv_SdtTBT02_CRF_Tbt02_subject_id);
      AddObjectProperty("TBT02_CRF_ID", gxTv_SdtTBT02_CRF_Tbt02_crf_id);
      AddObjectProperty("TBT02_CRF_LATEST_VERSION", gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version);
      AddObjectProperty("TBT02_CRF_INPUT_LEVEL", gxTv_SdtTBT02_CRF_Tbt02_crf_input_level);
      AddObjectProperty("TBT02_LOCK_FLG", gxTv_SdtTBT02_CRF_Tbt02_lock_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_LOCK_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_LOCK_USER_ID", gxTv_SdtTBT02_CRF_Tbt02_lock_user_id);
      AddObjectProperty("TBT02_LOCK_AUTH_CD", gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_UPLOAD_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_UPLOAD_USER_ID", gxTv_SdtTBT02_CRF_Tbt02_upload_user_id);
      AddObjectProperty("TBT02_UPLOAD_AUTH_CD", gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd);
      AddObjectProperty("TBT02_DM_ARRIVAL_FLG", gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_DM_ARRIVAL_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_APPROVAL_FLG", gxTv_SdtTBT02_CRF_Tbt02_approval_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_APPROVAL_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_APPROVAL_USER_ID", gxTv_SdtTBT02_CRF_Tbt02_approval_user_id);
      AddObjectProperty("TBT02_APPROVAL_AUTH_CD", gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd);
      AddObjectProperty("TBT02_INPUT_END_FLG", gxTv_SdtTBT02_CRF_Tbt02_input_end_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_INPUT_END_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_INPUT_END_USER_ID", gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id);
      AddObjectProperty("TBT02_INPUT_END_AUTH_CD", gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd);
      AddObjectProperty("TBT02_DEL_FLG", gxTv_SdtTBT02_CRF_Tbt02_del_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_CRT_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_CRT_USER_ID", gxTv_SdtTBT02_CRF_Tbt02_crt_user_id);
      AddObjectProperty("TBT02_CRT_PROG_NM", gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_UPD_USER_ID", gxTv_SdtTBT02_CRF_Tbt02_upd_user_id);
      AddObjectProperty("TBT02_UPD_PROG_NM", gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm);
      AddObjectProperty("TBT02_UPD_CNT", gxTv_SdtTBT02_CRF_Tbt02_upd_cnt);
      AddObjectProperty("Mode", gxTv_SdtTBT02_CRF_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTBT02_CRF_Initialized);
      AddObjectProperty("TBT02_STUDY_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_study_id_Z);
      AddObjectProperty("TBT02_SUBJECT_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_subject_id_Z);
      AddObjectProperty("TBT02_CRF_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_crf_id_Z);
      AddObjectProperty("TBT02_CRF_LATEST_VERSION_Z", gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z);
      AddObjectProperty("TBT02_CRF_INPUT_LEVEL_Z", gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z);
      AddObjectProperty("TBT02_LOCK_FLG_Z", gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_LOCK_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBT02_LOCK_USER_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z);
      AddObjectProperty("TBT02_LOCK_AUTH_CD_Z", gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_UPLOAD_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBT02_UPLOAD_USER_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z);
      AddObjectProperty("TBT02_UPLOAD_AUTH_CD_Z", gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z);
      AddObjectProperty("TBT02_DM_ARRIVAL_FLG_Z", gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_DM_ARRIVAL_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBT02_APPROVAL_FLG_Z", gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_APPROVAL_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBT02_APPROVAL_USER_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z);
      AddObjectProperty("TBT02_APPROVAL_AUTH_CD_Z", gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z);
      AddObjectProperty("TBT02_INPUT_END_FLG_Z", gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_INPUT_END_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBT02_INPUT_END_USER_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z);
      AddObjectProperty("TBT02_INPUT_END_AUTH_CD_Z", gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z);
      AddObjectProperty("TBT02_DEL_FLG_Z", gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_CRT_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBT02_CRT_USER_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z);
      AddObjectProperty("TBT02_CRT_PROG_NM_Z", gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_UPD_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBT02_UPD_USER_ID_Z", gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z);
      AddObjectProperty("TBT02_UPD_PROG_NM_Z", gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z);
      AddObjectProperty("TBT02_UPD_CNT_Z", gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z);
      AddObjectProperty("TBT02_CRF_LATEST_VERSION_N", gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N);
      AddObjectProperty("TBT02_CRF_INPUT_LEVEL_N", gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N);
      AddObjectProperty("TBT02_LOCK_FLG_N", gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N);
      AddObjectProperty("TBT02_LOCK_DATETIME_N", gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N);
      AddObjectProperty("TBT02_LOCK_USER_ID_N", gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N);
      AddObjectProperty("TBT02_LOCK_AUTH_CD_N", gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N);
      AddObjectProperty("TBT02_UPLOAD_DATETIME_N", gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N);
      AddObjectProperty("TBT02_UPLOAD_USER_ID_N", gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N);
      AddObjectProperty("TBT02_UPLOAD_AUTH_CD_N", gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N);
      AddObjectProperty("TBT02_DM_ARRIVAL_FLG_N", gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N);
      AddObjectProperty("TBT02_DM_ARRIVAL_DATETIME_N", gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N);
      AddObjectProperty("TBT02_APPROVAL_FLG_N", gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N);
      AddObjectProperty("TBT02_APPROVAL_DATETIME_N", gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N);
      AddObjectProperty("TBT02_APPROVAL_USER_ID_N", gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N);
      AddObjectProperty("TBT02_APPROVAL_AUTH_CD_N", gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N);
      AddObjectProperty("TBT02_INPUT_END_FLG_N", gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N);
      AddObjectProperty("TBT02_INPUT_END_DATETIME_N", gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N);
      AddObjectProperty("TBT02_INPUT_END_USER_ID_N", gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N);
      AddObjectProperty("TBT02_INPUT_END_AUTH_CD_N", gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N);
      AddObjectProperty("TBT02_DEL_FLG_N", gxTv_SdtTBT02_CRF_Tbt02_del_flg_N);
      AddObjectProperty("TBT02_CRT_DATETIME_N", gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N);
      AddObjectProperty("TBT02_CRT_USER_ID_N", gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N);
      AddObjectProperty("TBT02_CRT_PROG_NM_N", gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N);
      AddObjectProperty("TBT02_UPD_DATETIME_N", gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N);
      AddObjectProperty("TBT02_UPD_USER_ID_N", gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N);
      AddObjectProperty("TBT02_UPD_PROG_NM_N", gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N);
      AddObjectProperty("TBT02_UPD_CNT_N", gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N);
   }

   public long getgxTv_SdtTBT02_CRF_Tbt02_study_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_study_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_study_id( long value )
   {
      if ( gxTv_SdtTBT02_CRF_Tbt02_study_id != value )
      {
         gxTv_SdtTBT02_CRF_Mode = "INS" ;
         this.setgxTv_SdtTBT02_CRF_Tbt02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT02_CRF_Tbt02_study_id = value ;
   }

   public int getgxTv_SdtTBT02_CRF_Tbt02_subject_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_subject_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_subject_id( int value )
   {
      if ( gxTv_SdtTBT02_CRF_Tbt02_subject_id != value )
      {
         gxTv_SdtTBT02_CRF_Mode = "INS" ;
         this.setgxTv_SdtTBT02_CRF_Tbt02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT02_CRF_Tbt02_subject_id = value ;
   }

   public short getgxTv_SdtTBT02_CRF_Tbt02_crf_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crf_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_id( short value )
   {
      if ( gxTv_SdtTBT02_CRF_Tbt02_crf_id != value )
      {
         gxTv_SdtTBT02_CRF_Mode = "INS" ;
         this.setgxTv_SdtTBT02_CRF_Tbt02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT02_CRF_Tbt02_crf_id = value ;
   }

   public short getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( short value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crf_input_level ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_crf_input_level = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_crf_input_level = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_lock_flg( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_flg ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_flg( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_datetime ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_user_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_datetime ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_user_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_approval_flg( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_flg ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_flg( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_datetime ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_user_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_flg ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_del_flg( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_del_flg ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_del_flg( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_del_flg_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_del_flg = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_del_flg_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_del_flg_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_datetime ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_user_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_datetime ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_user_id ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_cnt ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt( long value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_cnt = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Mode( )
   {
      return gxTv_SdtTBT02_CRF_Mode ;
   }

   public void setgxTv_SdtTBT02_CRF_Mode( String value )
   {
      gxTv_SdtTBT02_CRF_Mode = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Mode_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Mode = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT02_CRF_Initialized( )
   {
      return gxTv_SdtTBT02_CRF_Initialized ;
   }

   public void setgxTv_SdtTBT02_CRF_Initialized( short value )
   {
      gxTv_SdtTBT02_CRF_Initialized = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Initialized_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT02_CRF_Tbt02_study_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_study_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_study_id_Z( long value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_study_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_study_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_subject_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z( int value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crf_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z( short value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z( short value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_del_flg_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_del_flg_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_del_flg_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_del_flg_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_del_flg_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N( )
   {
      return gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbt02_crf_bc obj ;
      obj = new tbt02_crf_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_del_flg = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm = "" ;
      gxTv_SdtTBT02_CRF_Mode = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z = "" ;
      gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtTBT02_CRF Clone( )
   {
      SdtTBT02_CRF sdt ;
      tbt02_crf_bc obj ;
      sdt = (SdtTBT02_CRF)(clone()) ;
      obj = (tbt02_crf_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBT02_CRF struct )
   {
      setgxTv_SdtTBT02_CRF_Tbt02_study_id(struct.getTbt02_study_id());
      setgxTv_SdtTBT02_CRF_Tbt02_subject_id(struct.getTbt02_subject_id());
      setgxTv_SdtTBT02_CRF_Tbt02_crf_id(struct.getTbt02_crf_id());
      setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version(struct.getTbt02_crf_latest_version());
      setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level(struct.getTbt02_crf_input_level());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_flg(struct.getTbt02_lock_flg());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime(struct.getTbt02_lock_datetime());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id(struct.getTbt02_lock_user_id());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd(struct.getTbt02_lock_auth_cd());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime(struct.getTbt02_upload_datetime());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id(struct.getTbt02_upload_user_id());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd(struct.getTbt02_upload_auth_cd());
      setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg(struct.getTbt02_dm_arrival_flg());
      setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime(struct.getTbt02_dm_arrival_datetime());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_flg(struct.getTbt02_approval_flg());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime(struct.getTbt02_approval_datetime());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id(struct.getTbt02_approval_user_id());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd(struct.getTbt02_approval_auth_cd());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg(struct.getTbt02_input_end_flg());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime(struct.getTbt02_input_end_datetime());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id(struct.getTbt02_input_end_user_id());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd(struct.getTbt02_input_end_auth_cd());
      setgxTv_SdtTBT02_CRF_Tbt02_del_flg(struct.getTbt02_del_flg());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime(struct.getTbt02_crt_datetime());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id(struct.getTbt02_crt_user_id());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm(struct.getTbt02_crt_prog_nm());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime(struct.getTbt02_upd_datetime());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id(struct.getTbt02_upd_user_id());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm(struct.getTbt02_upd_prog_nm());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt(struct.getTbt02_upd_cnt());
      setgxTv_SdtTBT02_CRF_Mode(struct.getMode());
      setgxTv_SdtTBT02_CRF_Initialized(struct.getInitialized());
      setgxTv_SdtTBT02_CRF_Tbt02_study_id_Z(struct.getTbt02_study_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z(struct.getTbt02_subject_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z(struct.getTbt02_crf_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z(struct.getTbt02_crf_latest_version_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z(struct.getTbt02_crf_input_level_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z(struct.getTbt02_lock_flg_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z(struct.getTbt02_lock_datetime_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z(struct.getTbt02_lock_user_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z(struct.getTbt02_lock_auth_cd_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z(struct.getTbt02_upload_datetime_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z(struct.getTbt02_upload_user_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z(struct.getTbt02_upload_auth_cd_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z(struct.getTbt02_dm_arrival_flg_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z(struct.getTbt02_dm_arrival_datetime_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z(struct.getTbt02_approval_flg_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z(struct.getTbt02_approval_datetime_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z(struct.getTbt02_approval_user_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z(struct.getTbt02_approval_auth_cd_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z(struct.getTbt02_input_end_flg_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z(struct.getTbt02_input_end_datetime_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z(struct.getTbt02_input_end_user_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z(struct.getTbt02_input_end_auth_cd_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z(struct.getTbt02_del_flg_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z(struct.getTbt02_crt_datetime_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z(struct.getTbt02_crt_user_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z(struct.getTbt02_crt_prog_nm_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z(struct.getTbt02_upd_datetime_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z(struct.getTbt02_upd_user_id_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z(struct.getTbt02_upd_prog_nm_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z(struct.getTbt02_upd_cnt_Z());
      setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N(struct.getTbt02_crf_latest_version_N());
      setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N(struct.getTbt02_crf_input_level_N());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N(struct.getTbt02_lock_flg_N());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N(struct.getTbt02_lock_datetime_N());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N(struct.getTbt02_lock_user_id_N());
      setgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N(struct.getTbt02_lock_auth_cd_N());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N(struct.getTbt02_upload_datetime_N());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N(struct.getTbt02_upload_user_id_N());
      setgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N(struct.getTbt02_upload_auth_cd_N());
      setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N(struct.getTbt02_dm_arrival_flg_N());
      setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N(struct.getTbt02_dm_arrival_datetime_N());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N(struct.getTbt02_approval_flg_N());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N(struct.getTbt02_approval_datetime_N());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N(struct.getTbt02_approval_user_id_N());
      setgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N(struct.getTbt02_approval_auth_cd_N());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N(struct.getTbt02_input_end_flg_N());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N(struct.getTbt02_input_end_datetime_N());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N(struct.getTbt02_input_end_user_id_N());
      setgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N(struct.getTbt02_input_end_auth_cd_N());
      setgxTv_SdtTBT02_CRF_Tbt02_del_flg_N(struct.getTbt02_del_flg_N());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N(struct.getTbt02_crt_datetime_N());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N(struct.getTbt02_crt_user_id_N());
      setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N(struct.getTbt02_crt_prog_nm_N());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N(struct.getTbt02_upd_datetime_N());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N(struct.getTbt02_upd_user_id_N());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N(struct.getTbt02_upd_prog_nm_N());
      setgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N(struct.getTbt02_upd_cnt_N());
   }

   public StructSdtTBT02_CRF getStruct( )
   {
      StructSdtTBT02_CRF struct = new StructSdtTBT02_CRF ();
      struct.setTbt02_study_id(getgxTv_SdtTBT02_CRF_Tbt02_study_id());
      struct.setTbt02_subject_id(getgxTv_SdtTBT02_CRF_Tbt02_subject_id());
      struct.setTbt02_crf_id(getgxTv_SdtTBT02_CRF_Tbt02_crf_id());
      struct.setTbt02_crf_latest_version(getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version());
      struct.setTbt02_crf_input_level(getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level());
      struct.setTbt02_lock_flg(getgxTv_SdtTBT02_CRF_Tbt02_lock_flg());
      struct.setTbt02_lock_datetime(getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime());
      struct.setTbt02_lock_user_id(getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id());
      struct.setTbt02_lock_auth_cd(getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd());
      struct.setTbt02_upload_datetime(getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime());
      struct.setTbt02_upload_user_id(getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id());
      struct.setTbt02_upload_auth_cd(getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd());
      struct.setTbt02_dm_arrival_flg(getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg());
      struct.setTbt02_dm_arrival_datetime(getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime());
      struct.setTbt02_approval_flg(getgxTv_SdtTBT02_CRF_Tbt02_approval_flg());
      struct.setTbt02_approval_datetime(getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime());
      struct.setTbt02_approval_user_id(getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id());
      struct.setTbt02_approval_auth_cd(getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd());
      struct.setTbt02_input_end_flg(getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg());
      struct.setTbt02_input_end_datetime(getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime());
      struct.setTbt02_input_end_user_id(getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id());
      struct.setTbt02_input_end_auth_cd(getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd());
      struct.setTbt02_del_flg(getgxTv_SdtTBT02_CRF_Tbt02_del_flg());
      struct.setTbt02_crt_datetime(getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime());
      struct.setTbt02_crt_user_id(getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id());
      struct.setTbt02_crt_prog_nm(getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm());
      struct.setTbt02_upd_datetime(getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime());
      struct.setTbt02_upd_user_id(getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id());
      struct.setTbt02_upd_prog_nm(getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm());
      struct.setTbt02_upd_cnt(getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt());
      struct.setMode(getgxTv_SdtTBT02_CRF_Mode());
      struct.setInitialized(getgxTv_SdtTBT02_CRF_Initialized());
      struct.setTbt02_study_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_study_id_Z());
      struct.setTbt02_subject_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_subject_id_Z());
      struct.setTbt02_crf_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_crf_id_Z());
      struct.setTbt02_crf_latest_version_Z(getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z());
      struct.setTbt02_crf_input_level_Z(getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z());
      struct.setTbt02_lock_flg_Z(getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z());
      struct.setTbt02_lock_datetime_Z(getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z());
      struct.setTbt02_lock_user_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z());
      struct.setTbt02_lock_auth_cd_Z(getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z());
      struct.setTbt02_upload_datetime_Z(getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z());
      struct.setTbt02_upload_user_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z());
      struct.setTbt02_upload_auth_cd_Z(getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z());
      struct.setTbt02_dm_arrival_flg_Z(getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z());
      struct.setTbt02_dm_arrival_datetime_Z(getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z());
      struct.setTbt02_approval_flg_Z(getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z());
      struct.setTbt02_approval_datetime_Z(getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z());
      struct.setTbt02_approval_user_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z());
      struct.setTbt02_approval_auth_cd_Z(getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z());
      struct.setTbt02_input_end_flg_Z(getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z());
      struct.setTbt02_input_end_datetime_Z(getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z());
      struct.setTbt02_input_end_user_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z());
      struct.setTbt02_input_end_auth_cd_Z(getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z());
      struct.setTbt02_del_flg_Z(getgxTv_SdtTBT02_CRF_Tbt02_del_flg_Z());
      struct.setTbt02_crt_datetime_Z(getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z());
      struct.setTbt02_crt_user_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z());
      struct.setTbt02_crt_prog_nm_Z(getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z());
      struct.setTbt02_upd_datetime_Z(getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z());
      struct.setTbt02_upd_user_id_Z(getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z());
      struct.setTbt02_upd_prog_nm_Z(getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z());
      struct.setTbt02_upd_cnt_Z(getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z());
      struct.setTbt02_crf_latest_version_N(getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N());
      struct.setTbt02_crf_input_level_N(getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N());
      struct.setTbt02_lock_flg_N(getgxTv_SdtTBT02_CRF_Tbt02_lock_flg_N());
      struct.setTbt02_lock_datetime_N(getgxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N());
      struct.setTbt02_lock_user_id_N(getgxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N());
      struct.setTbt02_lock_auth_cd_N(getgxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N());
      struct.setTbt02_upload_datetime_N(getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N());
      struct.setTbt02_upload_user_id_N(getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N());
      struct.setTbt02_upload_auth_cd_N(getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N());
      struct.setTbt02_dm_arrival_flg_N(getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N());
      struct.setTbt02_dm_arrival_datetime_N(getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N());
      struct.setTbt02_approval_flg_N(getgxTv_SdtTBT02_CRF_Tbt02_approval_flg_N());
      struct.setTbt02_approval_datetime_N(getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N());
      struct.setTbt02_approval_user_id_N(getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N());
      struct.setTbt02_approval_auth_cd_N(getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N());
      struct.setTbt02_input_end_flg_N(getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N());
      struct.setTbt02_input_end_datetime_N(getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N());
      struct.setTbt02_input_end_user_id_N(getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N());
      struct.setTbt02_input_end_auth_cd_N(getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N());
      struct.setTbt02_del_flg_N(getgxTv_SdtTBT02_CRF_Tbt02_del_flg_N());
      struct.setTbt02_crt_datetime_N(getgxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N());
      struct.setTbt02_crt_user_id_N(getgxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N());
      struct.setTbt02_crt_prog_nm_N(getgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N());
      struct.setTbt02_upd_datetime_N(getgxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N());
      struct.setTbt02_upd_user_id_N(getgxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N());
      struct.setTbt02_upd_prog_nm_N(getgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N());
      struct.setTbt02_upd_cnt_N(getgxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBT02_CRF_Tbt02_crf_input_level ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_Z ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crf_input_level_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_lock_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_approval_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_del_flg_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_N ;
   private byte gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_N ;
   private short gxTv_SdtTBT02_CRF_Tbt02_crf_id ;
   private short gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version ;
   private short gxTv_SdtTBT02_CRF_Initialized ;
   private short gxTv_SdtTBT02_CRF_Tbt02_crf_id_Z ;
   private short gxTv_SdtTBT02_CRF_Tbt02_crf_latest_version_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBT02_CRF_Tbt02_subject_id ;
   private int gxTv_SdtTBT02_CRF_Tbt02_subject_id_Z ;
   private long gxTv_SdtTBT02_CRF_Tbt02_study_id ;
   private long gxTv_SdtTBT02_CRF_Tbt02_upd_cnt ;
   private long gxTv_SdtTBT02_CRF_Tbt02_study_id_Z ;
   private long gxTv_SdtTBT02_CRF_Tbt02_upd_cnt_Z ;
   private String gxTv_SdtTBT02_CRF_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_lock_datetime ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_upload_datetime ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_approval_datetime ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_crt_datetime ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_upd_datetime ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_lock_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_upload_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_approval_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_input_end_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT02_CRF_Tbt02_upd_datetime_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_flg ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_user_id ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upload_user_id ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd ;
   private String gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_flg ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_user_id ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_flg ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd ;
   private String gxTv_SdtTBT02_CRF_Tbt02_del_flg ;
   private String gxTv_SdtTBT02_CRF_Tbt02_crt_user_id ;
   private String gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upd_user_id ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_lock_auth_cd_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upload_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_del_flg_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_crt_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upd_user_id_Z ;
   private String gxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm_Z ;
}

