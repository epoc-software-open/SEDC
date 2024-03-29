/*
               File: SdtTBT14_CRF_MEMO
        Description: CRFメモテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:17.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBT14_CRF_MEMO extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBT14_CRF_MEMO( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBT14_CRF_MEMO.class));
   }

   public SdtTBT14_CRF_MEMO( int remoteHandle ,
                             ModelContext context )
   {
      super( context, "SdtTBT14_CRF_MEMO");
      initialize( remoteHandle) ;
   }

   public SdtTBT14_CRF_MEMO( int remoteHandle ,
                             StructSdtTBT14_CRF_MEMO struct )
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

   public void Load( long AV140TBT14_STUDY_ID ,
                     int AV142TBT14_SUBJECT_ID ,
                     short AV198TBT14_MEMO_NO )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV140TBT14_STUDY_ID),new Integer(AV142TBT14_SUBJECT_ID),new Short(AV198TBT14_MEMO_NO)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBT14_STUDY_ID", long.class}, new Object[]{"TBT14_SUBJECT_ID", int.class}, new Object[]{"TBT14_MEMO_NO", short.class}}) ;
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
      metadata.set("Name", "TBT14_CRF_MEMO");
      metadata.set("BT", "TBT14_CRF_MEMO");
      metadata.set("PK", "[ \"TBT14_STUDY_ID\",\"TBT14_SUBJECT_ID\",\"TBT14_MEMO_NO\" ]");
      metadata.set("PKAssigned", "[ \"TBT14_STUDY_ID\",\"TBT14_SUBJECT_ID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TBT01_STUDY_ID\",\"TBT01_SUBJECT_ID\" ],\"FKMap\":[ \"TBT14_STUDY_ID-TBT01_STUDY_ID\",\"TBT14_SUBJECT_ID-TBT01_SUBJECT_ID\" ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_STUDY_ID") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_SUBJECT_ID") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_MEMO_NO") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_ID") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_EDA_NO") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_VERSION") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_MEMO_KBN") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_MEMO") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_REQUEST_SITE_ID") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_REQUEST_AUTH_CD") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_AUTH_CD") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_FLG") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_USER_ID") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_COMMENT") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KANRYO_FLG") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_DEL_FLG") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_USER_ID") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_PROG_NM") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_USER_ID") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_PROG_NM") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_CNT") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_STUDY_ID_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_MEMO_NO_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_ID_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_EDA_NO_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_VERSION_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_MEMO_KBN_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_MEMO_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_REQUEST_SITE_ID_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_REQUEST_AUTH_CD_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_AUTH_CD_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_FLG_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_USER_ID_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_COMMENT_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KANRYO_FLG_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_DEL_FLG_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_CNT_Z") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_ID_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_EDA_NO_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRF_VERSION_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_MEMO_KBN_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_MEMO_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_REQUEST_SITE_ID_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_REQUEST_AUTH_CD_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_AUTH_CD_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_FLG_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_USER_ID_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KAKUNIN_COMMENT_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_KANRYO_FLG_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_DEL_FLG_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_DATETIME_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_USER_ID_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_DATETIME_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_USER_ID_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT14_UPD_CNT_N") )
            {
               gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBT14_CRF_MEMO" ;
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
      oWriter.writeElement("TBT14_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_MEMO_NO", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_CRF_VERSION", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_MEMO_KBN", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_MEMO", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_REQUEST_SITE_ID", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_REQUEST_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_CRT_AUTH_CD", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_KAKUNIN_FLG", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_KAKUNIN_USER_ID", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_KAKUNIN_COMMENT", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_KANRYO_FLG", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_DEL_FLG", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime) )
      {
         oWriter.writeStartElement("TBT14_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT14_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT14_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime) )
      {
         oWriter.writeStartElement("TBT14_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT14_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT14_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT14_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_MEMO_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRF_EDA_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRF_VERSION_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_MEMO_KBN_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_MEMO_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_REQUEST_SITE_ID_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_REQUEST_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRT_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_KAKUNIN_FLG_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_KAKUNIN_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_KAKUNIN_COMMENT_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_KANRYO_FLG_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBT14_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT14_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT14_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBT14_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT14_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT14_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRF_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRF_EDA_NO_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRF_VERSION_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_MEMO_KBN_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_MEMO_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_REQUEST_SITE_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_REQUEST_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRT_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_KAKUNIN_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_KAKUNIN_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_KAKUNIN_COMMENT_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_KANRYO_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT14_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBT14_STUDY_ID", gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id, false);
      AddObjectProperty("TBT14_SUBJECT_ID", gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id, false);
      AddObjectProperty("TBT14_MEMO_NO", gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no, false);
      AddObjectProperty("TBT14_CRF_ID", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id, false);
      AddObjectProperty("TBT14_CRF_EDA_NO", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no, false);
      AddObjectProperty("TBT14_CRF_VERSION", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version, false);
      AddObjectProperty("TBT14_MEMO_KBN", gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn, false);
      AddObjectProperty("TBT14_MEMO", gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo, false);
      AddObjectProperty("TBT14_REQUEST_SITE_ID", gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id, false);
      AddObjectProperty("TBT14_REQUEST_AUTH_CD", gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd, false);
      AddObjectProperty("TBT14_CRT_AUTH_CD", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd, false);
      AddObjectProperty("TBT14_KAKUNIN_FLG", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg, false);
      AddObjectProperty("TBT14_KAKUNIN_USER_ID", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id, false);
      AddObjectProperty("TBT14_KAKUNIN_COMMENT", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment, false);
      AddObjectProperty("TBT14_KANRYO_FLG", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg, false);
      AddObjectProperty("TBT14_DEL_FLG", gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg, false);
      datetime_STZ = gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime ;
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
      AddObjectProperty("TBT14_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT14_CRT_USER_ID", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id, false);
      AddObjectProperty("TBT14_CRT_PROG_NM", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime ;
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
      AddObjectProperty("TBT14_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT14_UPD_USER_ID", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id, false);
      AddObjectProperty("TBT14_UPD_PROG_NM", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm, false);
      AddObjectProperty("TBT14_UPD_CNT", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBT14_CRF_MEMO_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBT14_CRF_MEMO_Initialized, false);
         AddObjectProperty("TBT14_STUDY_ID_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z, false);
         AddObjectProperty("TBT14_SUBJECT_ID_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z, false);
         AddObjectProperty("TBT14_MEMO_NO_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z, false);
         AddObjectProperty("TBT14_CRF_ID_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z, false);
         AddObjectProperty("TBT14_CRF_EDA_NO_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z, false);
         AddObjectProperty("TBT14_CRF_VERSION_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z, false);
         AddObjectProperty("TBT14_MEMO_KBN_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z, false);
         AddObjectProperty("TBT14_MEMO_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z, false);
         AddObjectProperty("TBT14_REQUEST_SITE_ID_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z, false);
         AddObjectProperty("TBT14_REQUEST_AUTH_CD_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z, false);
         AddObjectProperty("TBT14_CRT_AUTH_CD_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z, false);
         AddObjectProperty("TBT14_KAKUNIN_FLG_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z, false);
         AddObjectProperty("TBT14_KAKUNIN_USER_ID_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z, false);
         AddObjectProperty("TBT14_KAKUNIN_COMMENT_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z, false);
         AddObjectProperty("TBT14_KANRYO_FLG_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z, false);
         AddObjectProperty("TBT14_DEL_FLG_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z ;
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
         AddObjectProperty("TBT14_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT14_CRT_USER_ID_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z, false);
         AddObjectProperty("TBT14_CRT_PROG_NM_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z ;
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
         AddObjectProperty("TBT14_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT14_UPD_USER_ID_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z, false);
         AddObjectProperty("TBT14_UPD_PROG_NM_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z, false);
         AddObjectProperty("TBT14_UPD_CNT_Z", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z, false);
         AddObjectProperty("TBT14_CRF_ID_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N, false);
         AddObjectProperty("TBT14_CRF_EDA_NO_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N, false);
         AddObjectProperty("TBT14_CRF_VERSION_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N, false);
         AddObjectProperty("TBT14_MEMO_KBN_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N, false);
         AddObjectProperty("TBT14_MEMO_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N, false);
         AddObjectProperty("TBT14_REQUEST_SITE_ID_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N, false);
         AddObjectProperty("TBT14_REQUEST_AUTH_CD_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N, false);
         AddObjectProperty("TBT14_CRT_AUTH_CD_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N, false);
         AddObjectProperty("TBT14_KAKUNIN_FLG_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N, false);
         AddObjectProperty("TBT14_KAKUNIN_USER_ID_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N, false);
         AddObjectProperty("TBT14_KAKUNIN_COMMENT_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N, false);
         AddObjectProperty("TBT14_KANRYO_FLG_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N, false);
         AddObjectProperty("TBT14_DEL_FLG_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N, false);
         AddObjectProperty("TBT14_CRT_DATETIME_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N, false);
         AddObjectProperty("TBT14_CRT_USER_ID_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N, false);
         AddObjectProperty("TBT14_CRT_PROG_NM_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N, false);
         AddObjectProperty("TBT14_UPD_DATETIME_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N, false);
         AddObjectProperty("TBT14_UPD_USER_ID_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N, false);
         AddObjectProperty("TBT14_UPD_PROG_NM_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N, false);
         AddObjectProperty("TBT14_UPD_CNT_N", gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id( long value )
   {
      if ( gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id != value )
      {
         gxTv_SdtTBT14_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id = value ;
   }

   public int getgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id( int value )
   {
      if ( gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id != value )
      {
         gxTv_SdtTBT14_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id = value ;
   }

   public short getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no( short value )
   {
      if ( gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no != value )
      {
         gxTv_SdtTBT14_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no = value ;
   }

   public short getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt( long value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Mode( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Mode ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Mode( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Mode = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Mode_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Mode = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT14_CRF_MEMO_Initialized( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Initialized ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Initialized( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Initialized = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Initialized_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z( long value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z( int value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z( short value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N( )
   {
      return gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbt14_crf_memo_bc obj ;
      obj = new tbt14_crf_memo_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Mode = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z = "" ;
      gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBT14_CRF_MEMO Clone( )
   {
      SdtTBT14_CRF_MEMO sdt ;
      tbt14_crf_memo_bc obj ;
      sdt = (SdtTBT14_CRF_MEMO)(clone()) ;
      obj = (tbt14_crf_memo_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBT14_CRF_MEMO struct )
   {
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id(struct.getTbt14_study_id());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id(struct.getTbt14_subject_id());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no(struct.getTbt14_memo_no());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id(struct.getTbt14_crf_id());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no(struct.getTbt14_crf_eda_no());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version(struct.getTbt14_crf_version());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn(struct.getTbt14_memo_kbn());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo(struct.getTbt14_memo());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id(struct.getTbt14_request_site_id());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd(struct.getTbt14_request_auth_cd());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd(struct.getTbt14_crt_auth_cd());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg(struct.getTbt14_kakunin_flg());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id(struct.getTbt14_kakunin_user_id());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment(struct.getTbt14_kakunin_comment());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg(struct.getTbt14_kanryo_flg());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg(struct.getTbt14_del_flg());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime(struct.getTbt14_crt_datetime());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id(struct.getTbt14_crt_user_id());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm(struct.getTbt14_crt_prog_nm());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime(struct.getTbt14_upd_datetime());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id(struct.getTbt14_upd_user_id());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm(struct.getTbt14_upd_prog_nm());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt(struct.getTbt14_upd_cnt());
      setgxTv_SdtTBT14_CRF_MEMO_Mode(struct.getMode());
      setgxTv_SdtTBT14_CRF_MEMO_Initialized(struct.getInitialized());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z(struct.getTbt14_study_id_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z(struct.getTbt14_subject_id_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z(struct.getTbt14_memo_no_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z(struct.getTbt14_crf_id_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z(struct.getTbt14_crf_eda_no_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z(struct.getTbt14_crf_version_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z(struct.getTbt14_memo_kbn_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z(struct.getTbt14_memo_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z(struct.getTbt14_request_site_id_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z(struct.getTbt14_request_auth_cd_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z(struct.getTbt14_crt_auth_cd_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z(struct.getTbt14_kakunin_flg_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z(struct.getTbt14_kakunin_user_id_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z(struct.getTbt14_kakunin_comment_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z(struct.getTbt14_kanryo_flg_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z(struct.getTbt14_del_flg_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z(struct.getTbt14_crt_datetime_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z(struct.getTbt14_crt_user_id_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z(struct.getTbt14_crt_prog_nm_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z(struct.getTbt14_upd_datetime_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z(struct.getTbt14_upd_user_id_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z(struct.getTbt14_upd_prog_nm_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z(struct.getTbt14_upd_cnt_Z());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N(struct.getTbt14_crf_id_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N(struct.getTbt14_crf_eda_no_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N(struct.getTbt14_crf_version_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N(struct.getTbt14_memo_kbn_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N(struct.getTbt14_memo_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N(struct.getTbt14_request_site_id_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N(struct.getTbt14_request_auth_cd_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N(struct.getTbt14_crt_auth_cd_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N(struct.getTbt14_kakunin_flg_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N(struct.getTbt14_kakunin_user_id_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N(struct.getTbt14_kakunin_comment_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N(struct.getTbt14_kanryo_flg_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N(struct.getTbt14_del_flg_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N(struct.getTbt14_crt_datetime_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N(struct.getTbt14_crt_user_id_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N(struct.getTbt14_crt_prog_nm_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N(struct.getTbt14_upd_datetime_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N(struct.getTbt14_upd_user_id_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N(struct.getTbt14_upd_prog_nm_N());
      setgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N(struct.getTbt14_upd_cnt_N());
   }

   public StructSdtTBT14_CRF_MEMO getStruct( )
   {
      StructSdtTBT14_CRF_MEMO struct = new StructSdtTBT14_CRF_MEMO ();
      struct.setTbt14_study_id(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id());
      struct.setTbt14_subject_id(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id());
      struct.setTbt14_memo_no(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no());
      struct.setTbt14_crf_id(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id());
      struct.setTbt14_crf_eda_no(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no());
      struct.setTbt14_crf_version(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version());
      struct.setTbt14_memo_kbn(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn());
      struct.setTbt14_memo(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo());
      struct.setTbt14_request_site_id(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id());
      struct.setTbt14_request_auth_cd(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd());
      struct.setTbt14_crt_auth_cd(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd());
      struct.setTbt14_kakunin_flg(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg());
      struct.setTbt14_kakunin_user_id(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id());
      struct.setTbt14_kakunin_comment(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment());
      struct.setTbt14_kanryo_flg(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg());
      struct.setTbt14_del_flg(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg());
      struct.setTbt14_crt_datetime(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime());
      struct.setTbt14_crt_user_id(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id());
      struct.setTbt14_crt_prog_nm(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm());
      struct.setTbt14_upd_datetime(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime());
      struct.setTbt14_upd_user_id(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id());
      struct.setTbt14_upd_prog_nm(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm());
      struct.setTbt14_upd_cnt(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt());
      struct.setMode(getgxTv_SdtTBT14_CRF_MEMO_Mode());
      struct.setInitialized(getgxTv_SdtTBT14_CRF_MEMO_Initialized());
      struct.setTbt14_study_id_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z());
      struct.setTbt14_subject_id_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z());
      struct.setTbt14_memo_no_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z());
      struct.setTbt14_crf_id_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z());
      struct.setTbt14_crf_eda_no_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z());
      struct.setTbt14_crf_version_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z());
      struct.setTbt14_memo_kbn_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z());
      struct.setTbt14_memo_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z());
      struct.setTbt14_request_site_id_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z());
      struct.setTbt14_request_auth_cd_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z());
      struct.setTbt14_crt_auth_cd_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z());
      struct.setTbt14_kakunin_flg_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z());
      struct.setTbt14_kakunin_user_id_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z());
      struct.setTbt14_kakunin_comment_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z());
      struct.setTbt14_kanryo_flg_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z());
      struct.setTbt14_del_flg_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z());
      struct.setTbt14_crt_datetime_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z());
      struct.setTbt14_crt_user_id_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z());
      struct.setTbt14_crt_prog_nm_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z());
      struct.setTbt14_upd_datetime_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z());
      struct.setTbt14_upd_user_id_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z());
      struct.setTbt14_upd_prog_nm_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z());
      struct.setTbt14_upd_cnt_Z(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z());
      struct.setTbt14_crf_id_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N());
      struct.setTbt14_crf_eda_no_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N());
      struct.setTbt14_crf_version_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N());
      struct.setTbt14_memo_kbn_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N());
      struct.setTbt14_memo_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N());
      struct.setTbt14_request_site_id_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N());
      struct.setTbt14_request_auth_cd_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N());
      struct.setTbt14_crt_auth_cd_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N());
      struct.setTbt14_kakunin_flg_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N());
      struct.setTbt14_kakunin_user_id_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N());
      struct.setTbt14_kakunin_comment_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N());
      struct.setTbt14_kanryo_flg_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N());
      struct.setTbt14_del_flg_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N());
      struct.setTbt14_crt_datetime_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N());
      struct.setTbt14_crt_user_id_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N());
      struct.setTbt14_crt_prog_nm_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N());
      struct.setTbt14_upd_datetime_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N());
      struct.setTbt14_upd_user_id_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N());
      struct.setTbt14_upd_prog_nm_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N());
      struct.setTbt14_upd_cnt_N(getgxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_Z ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_eda_no_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_N ;
   private byte gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_N ;
   private short gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no ;
   private short gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id ;
   private short gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version ;
   private short gxTv_SdtTBT14_CRF_MEMO_Initialized ;
   private short gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_no_Z ;
   private short gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_id_Z ;
   private short gxTv_SdtTBT14_CRF_MEMO_Tbt14_crf_version_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id ;
   private int gxTv_SdtTBT14_CRF_MEMO_Tbt14_subject_id_Z ;
   private long gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id ;
   private long gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt ;
   private long gxTv_SdtTBT14_CRF_MEMO_Tbt14_study_id_Z ;
   private long gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_cnt_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime ;
   private java.util.Date gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime ;
   private java.util.Date gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_kbn_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_memo_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_site_id_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_request_auth_cd_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_auth_cd_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_flg_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_user_id_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kakunin_comment_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_kanryo_flg_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_del_flg_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_user_id_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_crt_prog_nm_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_user_id_Z ;
   private String gxTv_SdtTBT14_CRF_MEMO_Tbt14_upd_prog_nm_Z ;
}

