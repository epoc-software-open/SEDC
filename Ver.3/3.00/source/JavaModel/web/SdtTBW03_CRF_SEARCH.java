/*
               File: SdtTBW03_CRF_SEARCH
        Description: CRFåüçıÉèÅ[ÉN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:40.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBW03_CRF_SEARCH extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBW03_CRF_SEARCH( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBW03_CRF_SEARCH.class));
   }

   public SdtTBW03_CRF_SEARCH( int remoteHandle ,
                               ModelContext context )
   {
      super( context, "SdtTBW03_CRF_SEARCH");
      initialize( remoteHandle) ;
   }

   public SdtTBW03_CRF_SEARCH( int remoteHandle ,
                               StructSdtTBW03_CRF_SEARCH struct )
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

   public void Load( String AV110TBW03_SESSION_ID ,
                     String AV111TBW03_APP_ID ,
                     String AV112TBW03_DISP_DATETIME ,
                     long AV113TBW03_STUDY_ID ,
                     int AV114TBW03_SUBJECT_ID ,
                     short AV115TBW03_CRF_ID )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV110TBW03_SESSION_ID,AV111TBW03_APP_ID,AV112TBW03_DISP_DATETIME,new Long(AV113TBW03_STUDY_ID),new Integer(AV114TBW03_SUBJECT_ID),new Short(AV115TBW03_CRF_ID)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBW03_SESSION_ID", String.class}, new Object[]{"TBW03_APP_ID", String.class}, new Object[]{"TBW03_DISP_DATETIME", String.class}, new Object[]{"TBW03_STUDY_ID", long.class}, new Object[]{"TBW03_SUBJECT_ID", int.class}, new Object[]{"TBW03_CRF_ID", short.class}}) ;
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
      metadata.set("Name", "TBW03_CRF_SEARCH");
      metadata.set("BT", "TBW03_CRF_SEARCH");
      metadata.set("PK", "[ \"TBW03_SESSION_ID\",\"TBW03_APP_ID\",\"TBW03_DISP_DATETIME\",\"TBW03_STUDY_ID\",\"TBW03_SUBJECT_ID\",\"TBW03_CRF_ID\" ]");
      metadata.set("PKAssigned", "[ \"TBW03_CRF_ID\",\"TBW03_STUDY_ID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TAM07_USER_ID\" ],\"FKMap\":[ \"TBW03_APPROVAL_USER_ID-TAM07_USER_ID\" ] },{ \"FK\":[ \"TAM07_USER_ID\" ],\"FKMap\":[ \"TBW03_CRT_USER_ID-TAM07_USER_ID\" ] },{ \"FK\":[ \"TAM07_USER_ID\" ],\"FKMap\":[ \"TBW03_INPUT_END_USER_ID-TAM07_USER_ID\" ] },{ \"FK\":[ \"TAM07_USER_ID\" ],\"FKMap\":[ \"TBW03_LOCK_USER_ID-TAM07_USER_ID\" ] },{ \"FK\":[ \"TAM07_USER_ID\" ],\"FKMap\":[ \"TBW03_UPD_USER_ID-TAM07_USER_ID\" ] },{ \"FK\":[ \"TAM07_USER_ID\" ],\"FKMap\":[ \"TBW03_UPLOAD_USER_ID-TAM07_USER_ID\" ] },{ \"FK\":[ \"TAM08_SITE_ID\" ],\"FKMap\":[ \"TBW03_SITE_ID-TAM08_SITE_ID\" ] },{ \"FK\":[ \"TBM31_STUDY_ID\",\"TBM31_CRF_ID\" ],\"FKMap\":[ \"TBW03_STUDY_ID-TBM31_STUDY_ID\",\"TBW03_CRF_ID-TBM31_CRF_ID\" ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SESSION_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APP_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DISP_DATETIME") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_STUDY_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SUBJECT_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_SNM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_ORDER") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_RYAK_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_OUTER_SUBJECT_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_LATEST_VERSION") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_INPUT_LEVEL") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_FLG") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_USER_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_USER_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_AUTH_CD") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_USER_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_USER_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_AUTH_CD") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DM_ARRIVAL_FLG") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DM_ARRIVAL_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_FLG") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_USER_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_USER_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_AUTH_CD") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_FLG") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_USER_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_USER_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_AUTH_CD") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DEL_FLG") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_USER_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_USER_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_PROG_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_USER_ID") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_USER_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_PROG_NM") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_CNT") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SESSION_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APP_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DISP_DATETIME_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_STUDY_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_SNM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_ORDER_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_RYAK_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_OUTER_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_LATEST_VERSION_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_INPUT_LEVEL_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_FLG_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_USER_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_USER_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_AUTH_CD_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_USER_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_USER_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_AUTH_CD_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DM_ARRIVAL_FLG_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DM_ARRIVAL_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_FLG_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_USER_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_USER_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_AUTH_CD_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_FLG_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_USER_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_USER_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_AUTH_CD_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DEL_FLG_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_USER_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_USER_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_CNT_Z") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_SNM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_ORDER_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_ID_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_SITE_RYAK_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_OUTER_SUBJECT_ID_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_LATEST_VERSION_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRF_INPUT_LEVEL_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_FLG_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_DATETIME_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_USER_ID_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_USER_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_LOCK_AUTH_CD_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_DATETIME_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_USER_ID_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_USER_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPLOAD_AUTH_CD_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DM_ARRIVAL_FLG_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DM_ARRIVAL_DATETIME_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_FLG_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_DATETIME_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_USER_ID_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_USER_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_APPROVAL_AUTH_CD_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_FLG_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_DATETIME_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_USER_ID_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_USER_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_INPUT_END_AUTH_CD_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_DEL_FLG_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_DATETIME_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_USER_ID_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_USER_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_DATETIME_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_USER_ID_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_USER_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW03_UPD_CNT_N") )
            {
               gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBW03_CRF_SEARCH" ;
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
      oWriter.writeElement("TBW03_SESSION_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_APP_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_DISP_DATETIME", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_CRF_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_CRF_SNM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_CRF_ORDER", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_SITE_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_SITE_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_SITE_RYAK_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_OUTER_SUBJECT_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_CRF_LATEST_VERSION", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_CRF_INPUT_LEVEL", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_LOCK_FLG", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime) )
      {
         oWriter.writeStartElement("TBW03_LOCK_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBW03_LOCK_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBW03_LOCK_USER_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_LOCK_USER_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_LOCK_AUTH_CD", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime) )
      {
         oWriter.writeStartElement("TBW03_UPLOAD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBW03_UPLOAD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBW03_UPLOAD_USER_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_UPLOAD_USER_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_UPLOAD_AUTH_CD", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_DM_ARRIVAL_FLG", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime) )
      {
         oWriter.writeStartElement("TBW03_DM_ARRIVAL_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBW03_DM_ARRIVAL_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBW03_APPROVAL_FLG", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime) )
      {
         oWriter.writeStartElement("TBW03_APPROVAL_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBW03_APPROVAL_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBW03_APPROVAL_USER_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_APPROVAL_USER_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_APPROVAL_AUTH_CD", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_INPUT_END_FLG", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime) )
      {
         oWriter.writeStartElement("TBW03_INPUT_END_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBW03_INPUT_END_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBW03_INPUT_END_USER_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_INPUT_END_USER_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_INPUT_END_AUTH_CD", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_DEL_FLG", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime) )
      {
         oWriter.writeStartElement("TBW03_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBW03_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBW03_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_CRT_USER_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime) )
      {
         oWriter.writeStartElement("TBW03_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBW03_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBW03_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_UPD_USER_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW03_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_SESSION_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_APP_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_DISP_DATETIME_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_SNM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_ORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z, 5, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_SITE_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_SITE_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_SITE_RYAK_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_OUTER_SUBJECT_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_LATEST_VERSION_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_INPUT_LEVEL_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_LOCK_FLG_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z) )
         {
            oWriter.writeStartElement("TBW03_LOCK_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBW03_LOCK_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBW03_LOCK_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_LOCK_USER_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_LOCK_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z) )
         {
            oWriter.writeStartElement("TBW03_UPLOAD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBW03_UPLOAD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBW03_UPLOAD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPLOAD_USER_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPLOAD_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_DM_ARRIVAL_FLG_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z) )
         {
            oWriter.writeStartElement("TBW03_DM_ARRIVAL_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBW03_DM_ARRIVAL_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBW03_APPROVAL_FLG_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z) )
         {
            oWriter.writeStartElement("TBW03_APPROVAL_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBW03_APPROVAL_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBW03_APPROVAL_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_APPROVAL_USER_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_APPROVAL_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_INPUT_END_FLG_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z) )
         {
            oWriter.writeStartElement("TBW03_INPUT_END_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBW03_INPUT_END_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBW03_INPUT_END_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_INPUT_END_USER_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_INPUT_END_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBW03_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBW03_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBW03_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRT_USER_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBW03_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBW03_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBW03_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPD_USER_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_SNM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_ORDER_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_SITE_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_SITE_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_SITE_RYAK_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_OUTER_SUBJECT_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_LATEST_VERSION_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRF_INPUT_LEVEL_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_LOCK_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_LOCK_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_LOCK_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_LOCK_USER_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_LOCK_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPLOAD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPLOAD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPLOAD_USER_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPLOAD_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_DM_ARRIVAL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_DM_ARRIVAL_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_APPROVAL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_APPROVAL_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_APPROVAL_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_APPROVAL_USER_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_APPROVAL_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_INPUT_END_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_INPUT_END_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_INPUT_END_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_INPUT_END_USER_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_INPUT_END_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRT_USER_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPD_USER_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW03_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBW03_SESSION_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id, false);
      AddObjectProperty("TBW03_APP_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id, false);
      AddObjectProperty("TBW03_DISP_DATETIME", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime, false);
      AddObjectProperty("TBW03_STUDY_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id, false);
      AddObjectProperty("TBW03_SUBJECT_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id, false);
      AddObjectProperty("TBW03_CRF_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id, false);
      AddObjectProperty("TBW03_CRF_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm, false);
      AddObjectProperty("TBW03_CRF_SNM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm, false);
      AddObjectProperty("TBW03_CRF_ORDER", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order, false);
      AddObjectProperty("TBW03_SITE_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id, false);
      AddObjectProperty("TBW03_SITE_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm, false);
      AddObjectProperty("TBW03_SITE_RYAK_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm, false);
      AddObjectProperty("TBW03_OUTER_SUBJECT_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id, false);
      AddObjectProperty("TBW03_CRF_LATEST_VERSION", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version, false);
      AddObjectProperty("TBW03_CRF_INPUT_LEVEL", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level, false);
      AddObjectProperty("TBW03_LOCK_FLG", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg, false);
      datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime ;
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
      AddObjectProperty("TBW03_LOCK_DATETIME", sDateCnv, false);
      AddObjectProperty("TBW03_LOCK_USER_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id, false);
      AddObjectProperty("TBW03_LOCK_USER_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm, false);
      AddObjectProperty("TBW03_LOCK_AUTH_CD", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd, false);
      datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime ;
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
      AddObjectProperty("TBW03_UPLOAD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBW03_UPLOAD_USER_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id, false);
      AddObjectProperty("TBW03_UPLOAD_USER_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm, false);
      AddObjectProperty("TBW03_UPLOAD_AUTH_CD", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd, false);
      AddObjectProperty("TBW03_DM_ARRIVAL_FLG", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg, false);
      datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime ;
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
      AddObjectProperty("TBW03_DM_ARRIVAL_DATETIME", sDateCnv, false);
      AddObjectProperty("TBW03_APPROVAL_FLG", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg, false);
      datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime ;
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
      AddObjectProperty("TBW03_APPROVAL_DATETIME", sDateCnv, false);
      AddObjectProperty("TBW03_APPROVAL_USER_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id, false);
      AddObjectProperty("TBW03_APPROVAL_USER_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm, false);
      AddObjectProperty("TBW03_APPROVAL_AUTH_CD", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd, false);
      AddObjectProperty("TBW03_INPUT_END_FLG", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg, false);
      datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime ;
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
      AddObjectProperty("TBW03_INPUT_END_DATETIME", sDateCnv, false);
      AddObjectProperty("TBW03_INPUT_END_USER_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id, false);
      AddObjectProperty("TBW03_INPUT_END_USER_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm, false);
      AddObjectProperty("TBW03_INPUT_END_AUTH_CD", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd, false);
      AddObjectProperty("TBW03_DEL_FLG", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg, false);
      datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime ;
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
      AddObjectProperty("TBW03_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBW03_CRT_USER_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id, false);
      AddObjectProperty("TBW03_CRT_USER_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm, false);
      AddObjectProperty("TBW03_CRT_PROG_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime ;
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
      AddObjectProperty("TBW03_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBW03_UPD_USER_ID", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id, false);
      AddObjectProperty("TBW03_UPD_USER_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm, false);
      AddObjectProperty("TBW03_UPD_PROG_NM", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm, false);
      AddObjectProperty("TBW03_UPD_CNT", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBW03_CRF_SEARCH_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBW03_CRF_SEARCH_Initialized, false);
         AddObjectProperty("TBW03_SESSION_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z, false);
         AddObjectProperty("TBW03_APP_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z, false);
         AddObjectProperty("TBW03_DISP_DATETIME_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z, false);
         AddObjectProperty("TBW03_STUDY_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z, false);
         AddObjectProperty("TBW03_SUBJECT_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z, false);
         AddObjectProperty("TBW03_CRF_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z, false);
         AddObjectProperty("TBW03_CRF_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z, false);
         AddObjectProperty("TBW03_CRF_SNM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z, false);
         AddObjectProperty("TBW03_CRF_ORDER_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z, false);
         AddObjectProperty("TBW03_SITE_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z, false);
         AddObjectProperty("TBW03_SITE_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z, false);
         AddObjectProperty("TBW03_SITE_RYAK_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z, false);
         AddObjectProperty("TBW03_OUTER_SUBJECT_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z, false);
         AddObjectProperty("TBW03_CRF_LATEST_VERSION_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z, false);
         AddObjectProperty("TBW03_CRF_INPUT_LEVEL_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z, false);
         AddObjectProperty("TBW03_LOCK_FLG_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z, false);
         datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z ;
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
         AddObjectProperty("TBW03_LOCK_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBW03_LOCK_USER_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z, false);
         AddObjectProperty("TBW03_LOCK_USER_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z, false);
         AddObjectProperty("TBW03_LOCK_AUTH_CD_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z, false);
         datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z ;
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
         AddObjectProperty("TBW03_UPLOAD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBW03_UPLOAD_USER_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z, false);
         AddObjectProperty("TBW03_UPLOAD_USER_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z, false);
         AddObjectProperty("TBW03_UPLOAD_AUTH_CD_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z, false);
         AddObjectProperty("TBW03_DM_ARRIVAL_FLG_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z, false);
         datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z ;
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
         AddObjectProperty("TBW03_DM_ARRIVAL_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBW03_APPROVAL_FLG_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z, false);
         datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z ;
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
         AddObjectProperty("TBW03_APPROVAL_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBW03_APPROVAL_USER_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z, false);
         AddObjectProperty("TBW03_APPROVAL_USER_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z, false);
         AddObjectProperty("TBW03_APPROVAL_AUTH_CD_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z, false);
         AddObjectProperty("TBW03_INPUT_END_FLG_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z, false);
         datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z ;
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
         AddObjectProperty("TBW03_INPUT_END_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBW03_INPUT_END_USER_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z, false);
         AddObjectProperty("TBW03_INPUT_END_USER_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z, false);
         AddObjectProperty("TBW03_INPUT_END_AUTH_CD_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z, false);
         AddObjectProperty("TBW03_DEL_FLG_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z ;
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
         AddObjectProperty("TBW03_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBW03_CRT_USER_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z, false);
         AddObjectProperty("TBW03_CRT_USER_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z, false);
         AddObjectProperty("TBW03_CRT_PROG_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z ;
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
         AddObjectProperty("TBW03_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBW03_UPD_USER_ID_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z, false);
         AddObjectProperty("TBW03_UPD_USER_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z, false);
         AddObjectProperty("TBW03_UPD_PROG_NM_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z, false);
         AddObjectProperty("TBW03_UPD_CNT_Z", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z, false);
         AddObjectProperty("TBW03_CRF_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N, false);
         AddObjectProperty("TBW03_CRF_SNM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N, false);
         AddObjectProperty("TBW03_CRF_ORDER_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N, false);
         AddObjectProperty("TBW03_SITE_ID_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N, false);
         AddObjectProperty("TBW03_SITE_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N, false);
         AddObjectProperty("TBW03_SITE_RYAK_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N, false);
         AddObjectProperty("TBW03_OUTER_SUBJECT_ID_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N, false);
         AddObjectProperty("TBW03_CRF_LATEST_VERSION_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N, false);
         AddObjectProperty("TBW03_CRF_INPUT_LEVEL_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N, false);
         AddObjectProperty("TBW03_LOCK_FLG_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N, false);
         AddObjectProperty("TBW03_LOCK_DATETIME_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N, false);
         AddObjectProperty("TBW03_LOCK_USER_ID_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N, false);
         AddObjectProperty("TBW03_LOCK_USER_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N, false);
         AddObjectProperty("TBW03_LOCK_AUTH_CD_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N, false);
         AddObjectProperty("TBW03_UPLOAD_DATETIME_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N, false);
         AddObjectProperty("TBW03_UPLOAD_USER_ID_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N, false);
         AddObjectProperty("TBW03_UPLOAD_USER_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N, false);
         AddObjectProperty("TBW03_UPLOAD_AUTH_CD_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N, false);
         AddObjectProperty("TBW03_DM_ARRIVAL_FLG_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N, false);
         AddObjectProperty("TBW03_DM_ARRIVAL_DATETIME_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N, false);
         AddObjectProperty("TBW03_APPROVAL_FLG_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N, false);
         AddObjectProperty("TBW03_APPROVAL_DATETIME_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N, false);
         AddObjectProperty("TBW03_APPROVAL_USER_ID_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N, false);
         AddObjectProperty("TBW03_APPROVAL_USER_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N, false);
         AddObjectProperty("TBW03_APPROVAL_AUTH_CD_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N, false);
         AddObjectProperty("TBW03_INPUT_END_FLG_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N, false);
         AddObjectProperty("TBW03_INPUT_END_DATETIME_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N, false);
         AddObjectProperty("TBW03_INPUT_END_USER_ID_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N, false);
         AddObjectProperty("TBW03_INPUT_END_USER_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N, false);
         AddObjectProperty("TBW03_INPUT_END_AUTH_CD_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N, false);
         AddObjectProperty("TBW03_DEL_FLG_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N, false);
         AddObjectProperty("TBW03_CRT_DATETIME_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N, false);
         AddObjectProperty("TBW03_CRT_USER_ID_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N, false);
         AddObjectProperty("TBW03_CRT_USER_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N, false);
         AddObjectProperty("TBW03_CRT_PROG_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N, false);
         AddObjectProperty("TBW03_UPD_DATETIME_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N, false);
         AddObjectProperty("TBW03_UPD_USER_ID_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N, false);
         AddObjectProperty("TBW03_UPD_USER_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N, false);
         AddObjectProperty("TBW03_UPD_PROG_NM_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N, false);
         AddObjectProperty("TBW03_UPD_CNT_N", gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N, false);
      }
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id, value) != 0 )
      {
         gxTv_SdtTBW03_CRF_SEARCH_Mode = "INS" ;
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id = value ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id, value) != 0 )
      {
         gxTv_SdtTBW03_CRF_SEARCH_Mode = "INS" ;
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id = value ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime, value) != 0 )
      {
         gxTv_SdtTBW03_CRF_SEARCH_Mode = "INS" ;
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime = value ;
   }

   public long getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id( long value )
   {
      if ( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id != value )
      {
         gxTv_SdtTBW03_CRF_SEARCH_Mode = "INS" ;
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id = value ;
   }

   public int getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id( int value )
   {
      if ( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id != value )
      {
         gxTv_SdtTBW03_CRF_SEARCH_Mode = "INS" ;
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id = value ;
   }

   public short getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id( short value )
   {
      if ( gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id != value )
      {
         gxTv_SdtTBW03_CRF_SEARCH_Mode = "INS" ;
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id = value ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order( int value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order = 0 ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version( short value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt( long value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Mode( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Mode ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Mode( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Mode = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Mode_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Mode = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW03_CRF_SEARCH_Initialized( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Initialized ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Initialized( short value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Initialized = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Initialized_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z( long value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z( int value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z( short value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z( int value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z( short value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z( long value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N( )
   {
      return gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N( byte value )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbw03_crf_search_bc obj ;
      obj = new tbw03_crf_search_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Mode = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z = "" ;
      gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBW03_CRF_SEARCH Clone( )
   {
      SdtTBW03_CRF_SEARCH sdt ;
      tbw03_crf_search_bc obj ;
      sdt = (SdtTBW03_CRF_SEARCH)(clone()) ;
      obj = (tbw03_crf_search_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBW03_CRF_SEARCH struct )
   {
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id(struct.getTbw03_session_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id(struct.getTbw03_app_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime(struct.getTbw03_disp_datetime());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id(struct.getTbw03_study_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id(struct.getTbw03_subject_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id(struct.getTbw03_crf_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm(struct.getTbw03_crf_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm(struct.getTbw03_crf_snm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order(struct.getTbw03_crf_order());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id(struct.getTbw03_site_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm(struct.getTbw03_site_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm(struct.getTbw03_site_ryak_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id(struct.getTbw03_outer_subject_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version(struct.getTbw03_crf_latest_version());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level(struct.getTbw03_crf_input_level());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg(struct.getTbw03_lock_flg());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime(struct.getTbw03_lock_datetime());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id(struct.getTbw03_lock_user_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm(struct.getTbw03_lock_user_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd(struct.getTbw03_lock_auth_cd());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime(struct.getTbw03_upload_datetime());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id(struct.getTbw03_upload_user_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm(struct.getTbw03_upload_user_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd(struct.getTbw03_upload_auth_cd());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg(struct.getTbw03_dm_arrival_flg());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime(struct.getTbw03_dm_arrival_datetime());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg(struct.getTbw03_approval_flg());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime(struct.getTbw03_approval_datetime());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id(struct.getTbw03_approval_user_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm(struct.getTbw03_approval_user_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd(struct.getTbw03_approval_auth_cd());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg(struct.getTbw03_input_end_flg());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime(struct.getTbw03_input_end_datetime());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id(struct.getTbw03_input_end_user_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm(struct.getTbw03_input_end_user_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd(struct.getTbw03_input_end_auth_cd());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg(struct.getTbw03_del_flg());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime(struct.getTbw03_crt_datetime());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id(struct.getTbw03_crt_user_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm(struct.getTbw03_crt_user_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm(struct.getTbw03_crt_prog_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime(struct.getTbw03_upd_datetime());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id(struct.getTbw03_upd_user_id());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm(struct.getTbw03_upd_user_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm(struct.getTbw03_upd_prog_nm());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt(struct.getTbw03_upd_cnt());
      setgxTv_SdtTBW03_CRF_SEARCH_Mode(struct.getMode());
      setgxTv_SdtTBW03_CRF_SEARCH_Initialized(struct.getInitialized());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z(struct.getTbw03_session_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z(struct.getTbw03_app_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z(struct.getTbw03_disp_datetime_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z(struct.getTbw03_study_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z(struct.getTbw03_subject_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z(struct.getTbw03_crf_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z(struct.getTbw03_crf_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z(struct.getTbw03_crf_snm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z(struct.getTbw03_crf_order_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z(struct.getTbw03_site_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z(struct.getTbw03_site_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z(struct.getTbw03_site_ryak_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z(struct.getTbw03_outer_subject_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z(struct.getTbw03_crf_latest_version_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z(struct.getTbw03_crf_input_level_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z(struct.getTbw03_lock_flg_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z(struct.getTbw03_lock_datetime_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z(struct.getTbw03_lock_user_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z(struct.getTbw03_lock_user_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z(struct.getTbw03_lock_auth_cd_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z(struct.getTbw03_upload_datetime_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z(struct.getTbw03_upload_user_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z(struct.getTbw03_upload_user_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z(struct.getTbw03_upload_auth_cd_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z(struct.getTbw03_dm_arrival_flg_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z(struct.getTbw03_dm_arrival_datetime_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z(struct.getTbw03_approval_flg_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z(struct.getTbw03_approval_datetime_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z(struct.getTbw03_approval_user_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z(struct.getTbw03_approval_user_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z(struct.getTbw03_approval_auth_cd_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z(struct.getTbw03_input_end_flg_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z(struct.getTbw03_input_end_datetime_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z(struct.getTbw03_input_end_user_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z(struct.getTbw03_input_end_user_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z(struct.getTbw03_input_end_auth_cd_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z(struct.getTbw03_del_flg_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z(struct.getTbw03_crt_datetime_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z(struct.getTbw03_crt_user_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z(struct.getTbw03_crt_user_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z(struct.getTbw03_crt_prog_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z(struct.getTbw03_upd_datetime_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z(struct.getTbw03_upd_user_id_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z(struct.getTbw03_upd_user_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z(struct.getTbw03_upd_prog_nm_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z(struct.getTbw03_upd_cnt_Z());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N(struct.getTbw03_crf_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N(struct.getTbw03_crf_snm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N(struct.getTbw03_crf_order_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N(struct.getTbw03_site_id_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N(struct.getTbw03_site_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N(struct.getTbw03_site_ryak_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N(struct.getTbw03_outer_subject_id_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N(struct.getTbw03_crf_latest_version_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N(struct.getTbw03_crf_input_level_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N(struct.getTbw03_lock_flg_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N(struct.getTbw03_lock_datetime_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N(struct.getTbw03_lock_user_id_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N(struct.getTbw03_lock_user_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N(struct.getTbw03_lock_auth_cd_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N(struct.getTbw03_upload_datetime_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N(struct.getTbw03_upload_user_id_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N(struct.getTbw03_upload_user_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N(struct.getTbw03_upload_auth_cd_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N(struct.getTbw03_dm_arrival_flg_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N(struct.getTbw03_dm_arrival_datetime_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N(struct.getTbw03_approval_flg_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N(struct.getTbw03_approval_datetime_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N(struct.getTbw03_approval_user_id_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N(struct.getTbw03_approval_user_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N(struct.getTbw03_approval_auth_cd_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N(struct.getTbw03_input_end_flg_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N(struct.getTbw03_input_end_datetime_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N(struct.getTbw03_input_end_user_id_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N(struct.getTbw03_input_end_user_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N(struct.getTbw03_input_end_auth_cd_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N(struct.getTbw03_del_flg_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N(struct.getTbw03_crt_datetime_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N(struct.getTbw03_crt_user_id_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N(struct.getTbw03_crt_user_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N(struct.getTbw03_crt_prog_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N(struct.getTbw03_upd_datetime_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N(struct.getTbw03_upd_user_id_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N(struct.getTbw03_upd_user_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N(struct.getTbw03_upd_prog_nm_N());
      setgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N(struct.getTbw03_upd_cnt_N());
   }

   public StructSdtTBW03_CRF_SEARCH getStruct( )
   {
      StructSdtTBW03_CRF_SEARCH struct = new StructSdtTBW03_CRF_SEARCH ();
      struct.setTbw03_session_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id());
      struct.setTbw03_app_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id());
      struct.setTbw03_disp_datetime(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime());
      struct.setTbw03_study_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id());
      struct.setTbw03_subject_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id());
      struct.setTbw03_crf_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id());
      struct.setTbw03_crf_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm());
      struct.setTbw03_crf_snm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm());
      struct.setTbw03_crf_order(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order());
      struct.setTbw03_site_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id());
      struct.setTbw03_site_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm());
      struct.setTbw03_site_ryak_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm());
      struct.setTbw03_outer_subject_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id());
      struct.setTbw03_crf_latest_version(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version());
      struct.setTbw03_crf_input_level(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level());
      struct.setTbw03_lock_flg(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg());
      struct.setTbw03_lock_datetime(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime());
      struct.setTbw03_lock_user_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id());
      struct.setTbw03_lock_user_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm());
      struct.setTbw03_lock_auth_cd(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd());
      struct.setTbw03_upload_datetime(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime());
      struct.setTbw03_upload_user_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id());
      struct.setTbw03_upload_user_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm());
      struct.setTbw03_upload_auth_cd(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd());
      struct.setTbw03_dm_arrival_flg(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg());
      struct.setTbw03_dm_arrival_datetime(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime());
      struct.setTbw03_approval_flg(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg());
      struct.setTbw03_approval_datetime(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime());
      struct.setTbw03_approval_user_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id());
      struct.setTbw03_approval_user_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm());
      struct.setTbw03_approval_auth_cd(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd());
      struct.setTbw03_input_end_flg(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg());
      struct.setTbw03_input_end_datetime(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime());
      struct.setTbw03_input_end_user_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id());
      struct.setTbw03_input_end_user_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm());
      struct.setTbw03_input_end_auth_cd(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd());
      struct.setTbw03_del_flg(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg());
      struct.setTbw03_crt_datetime(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime());
      struct.setTbw03_crt_user_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id());
      struct.setTbw03_crt_user_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm());
      struct.setTbw03_crt_prog_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm());
      struct.setTbw03_upd_datetime(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime());
      struct.setTbw03_upd_user_id(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id());
      struct.setTbw03_upd_user_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm());
      struct.setTbw03_upd_prog_nm(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm());
      struct.setTbw03_upd_cnt(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt());
      struct.setMode(getgxTv_SdtTBW03_CRF_SEARCH_Mode());
      struct.setInitialized(getgxTv_SdtTBW03_CRF_SEARCH_Initialized());
      struct.setTbw03_session_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z());
      struct.setTbw03_app_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z());
      struct.setTbw03_disp_datetime_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z());
      struct.setTbw03_study_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z());
      struct.setTbw03_subject_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z());
      struct.setTbw03_crf_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z());
      struct.setTbw03_crf_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z());
      struct.setTbw03_crf_snm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z());
      struct.setTbw03_crf_order_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z());
      struct.setTbw03_site_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z());
      struct.setTbw03_site_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z());
      struct.setTbw03_site_ryak_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z());
      struct.setTbw03_outer_subject_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z());
      struct.setTbw03_crf_latest_version_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z());
      struct.setTbw03_crf_input_level_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z());
      struct.setTbw03_lock_flg_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z());
      struct.setTbw03_lock_datetime_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z());
      struct.setTbw03_lock_user_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z());
      struct.setTbw03_lock_user_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z());
      struct.setTbw03_lock_auth_cd_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z());
      struct.setTbw03_upload_datetime_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z());
      struct.setTbw03_upload_user_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z());
      struct.setTbw03_upload_user_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z());
      struct.setTbw03_upload_auth_cd_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z());
      struct.setTbw03_dm_arrival_flg_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z());
      struct.setTbw03_dm_arrival_datetime_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z());
      struct.setTbw03_approval_flg_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z());
      struct.setTbw03_approval_datetime_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z());
      struct.setTbw03_approval_user_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z());
      struct.setTbw03_approval_user_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z());
      struct.setTbw03_approval_auth_cd_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z());
      struct.setTbw03_input_end_flg_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z());
      struct.setTbw03_input_end_datetime_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z());
      struct.setTbw03_input_end_user_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z());
      struct.setTbw03_input_end_user_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z());
      struct.setTbw03_input_end_auth_cd_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z());
      struct.setTbw03_del_flg_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z());
      struct.setTbw03_crt_datetime_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z());
      struct.setTbw03_crt_user_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z());
      struct.setTbw03_crt_user_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z());
      struct.setTbw03_crt_prog_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z());
      struct.setTbw03_upd_datetime_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z());
      struct.setTbw03_upd_user_id_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z());
      struct.setTbw03_upd_user_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z());
      struct.setTbw03_upd_prog_nm_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z());
      struct.setTbw03_upd_cnt_Z(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z());
      struct.setTbw03_crf_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N());
      struct.setTbw03_crf_snm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N());
      struct.setTbw03_crf_order_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N());
      struct.setTbw03_site_id_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N());
      struct.setTbw03_site_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N());
      struct.setTbw03_site_ryak_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N());
      struct.setTbw03_outer_subject_id_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N());
      struct.setTbw03_crf_latest_version_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N());
      struct.setTbw03_crf_input_level_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N());
      struct.setTbw03_lock_flg_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N());
      struct.setTbw03_lock_datetime_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N());
      struct.setTbw03_lock_user_id_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N());
      struct.setTbw03_lock_user_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N());
      struct.setTbw03_lock_auth_cd_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N());
      struct.setTbw03_upload_datetime_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N());
      struct.setTbw03_upload_user_id_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N());
      struct.setTbw03_upload_user_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N());
      struct.setTbw03_upload_auth_cd_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N());
      struct.setTbw03_dm_arrival_flg_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N());
      struct.setTbw03_dm_arrival_datetime_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N());
      struct.setTbw03_approval_flg_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N());
      struct.setTbw03_approval_datetime_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N());
      struct.setTbw03_approval_user_id_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N());
      struct.setTbw03_approval_user_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N());
      struct.setTbw03_approval_auth_cd_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N());
      struct.setTbw03_input_end_flg_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N());
      struct.setTbw03_input_end_datetime_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N());
      struct.setTbw03_input_end_user_id_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N());
      struct.setTbw03_input_end_user_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N());
      struct.setTbw03_input_end_auth_cd_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N());
      struct.setTbw03_del_flg_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N());
      struct.setTbw03_crt_datetime_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N());
      struct.setTbw03_crt_user_id_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N());
      struct.setTbw03_crt_user_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N());
      struct.setTbw03_crt_prog_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N());
      struct.setTbw03_upd_datetime_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N());
      struct.setTbw03_upd_user_id_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N());
      struct.setTbw03_upd_user_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N());
      struct.setTbw03_upd_prog_nm_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N());
      struct.setTbw03_upd_cnt_N(getgxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_Z ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_input_level_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_N ;
   private byte gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_N ;
   private short gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id ;
   private short gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version ;
   private short gxTv_SdtTBW03_CRF_SEARCH_Initialized ;
   private short gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_id_Z ;
   private short gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_latest_version_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id ;
   private int gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order ;
   private int gxTv_SdtTBW03_CRF_SEARCH_Tbw03_subject_id_Z ;
   private int gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_order_Z ;
   private long gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id ;
   private long gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt ;
   private long gxTv_SdtTBW03_CRF_SEARCH_Tbw03_study_id_Z ;
   private long gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_cnt_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_session_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_app_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_disp_datetime_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crf_snm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_site_ryak_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_outer_subject_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_lock_auth_cd_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upload_auth_cd_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_dm_arrival_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_approval_auth_cd_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_input_end_auth_cd_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_del_flg_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_crt_prog_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_id_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_user_nm_Z ;
   private String gxTv_SdtTBW03_CRF_SEARCH_Tbw03_upd_prog_nm_Z ;
}

