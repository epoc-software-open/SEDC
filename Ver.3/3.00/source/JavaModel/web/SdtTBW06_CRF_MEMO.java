/*
               File: SdtTBW06_CRF_MEMO
        Description: CRFÉÅÉÇÉeÅ[ÉuÉã
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:54.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBW06_CRF_MEMO extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBW06_CRF_MEMO( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBW06_CRF_MEMO.class));
   }

   public SdtTBW06_CRF_MEMO( int remoteHandle ,
                             ModelContext context )
   {
      super( context, "SdtTBW06_CRF_MEMO");
      initialize( remoteHandle) ;
   }

   public SdtTBW06_CRF_MEMO( int remoteHandle ,
                             StructSdtTBW06_CRF_MEMO struct )
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

   public void Load( String AV137TBW06_SESSION_ID ,
                     String AV138TBW06_APP_ID ,
                     String AV139TBW06_DISP_DATETIME ,
                     long AV141TBW06_STUDY_ID ,
                     int AV143TBW06_SUBJECT_ID ,
                     short AV145TBW06_INS_NO )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV137TBW06_SESSION_ID,AV138TBW06_APP_ID,AV139TBW06_DISP_DATETIME,new Long(AV141TBW06_STUDY_ID),new Integer(AV143TBW06_SUBJECT_ID),new Short(AV145TBW06_INS_NO)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBW06_SESSION_ID", String.class}, new Object[]{"TBW06_APP_ID", String.class}, new Object[]{"TBW06_DISP_DATETIME", String.class}, new Object[]{"TBW06_STUDY_ID", long.class}, new Object[]{"TBW06_SUBJECT_ID", int.class}, new Object[]{"TBW06_INS_NO", short.class}}) ;
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
      metadata.set("Name", "TBW06_CRF_MEMO");
      metadata.set("BT", "TBW06_CRF_MEMO");
      metadata.set("PK", "[ \"TBW06_SESSION_ID\",\"TBW06_APP_ID\",\"TBW06_DISP_DATETIME\",\"TBW06_STUDY_ID\",\"TBW06_SUBJECT_ID\",\"TBW06_INS_NO\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_SESSION_ID") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_APP_ID") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_DISP_DATETIME") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_STUDY_ID") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_SUBJECT_ID") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_INS_NO") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_CRF_ID") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_CRF_VERSION") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_MEMO") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_STYDY_AUTH_CD") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_REQUEST_USER_ID") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_FLG") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_END_FLG") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQ_END_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_END_USER_ID") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_PROC_DIV") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_SESSION_ID_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_APP_ID_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_DISP_DATETIME_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_STUDY_ID_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_INS_NO_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_CRF_ID_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_CRF_VERSION_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_MEMO_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_STYDY_AUTH_CD_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_REQUEST_USER_ID_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_FLG_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_END_FLG_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQ_END_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_END_USER_ID_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_PROC_DIV_Z") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_CRF_ID_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_CRF_VERSION_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_MEMO_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_STYDY_AUTH_CD_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_REQUEST_USER_ID_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_FLG_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_END_FLG_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQ_END_DATETIME_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_EDIT_REQUEST_END_USER_ID_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW06_PROC_DIV_N") )
            {
               gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBW06_CRF_MEMO" ;
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
      oWriter.writeElement("TBW06_SESSION_ID", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_APP_ID", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_DISP_DATETIME", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_INS_NO", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_CRF_VERSION", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_MEMO", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_STYDY_AUTH_CD", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_REQUEST_USER_ID", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_EDIT_REQUEST_FLG", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_EDIT_REQUEST_END_FLG", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime) )
      {
         oWriter.writeStartElement("TBW06_EDIT_REQ_END_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBW06_EDIT_REQ_END_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBW06_EDIT_REQUEST_END_USER_ID", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW06_PROC_DIV", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_SESSION_ID_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_APP_ID_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_DISP_DATETIME_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_INS_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_CRF_VERSION_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_MEMO_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_STYDY_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_REQUEST_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_EDIT_REQUEST_FLG_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_EDIT_REQUEST_END_FLG_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z) )
         {
            oWriter.writeStartElement("TBW06_EDIT_REQ_END_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBW06_EDIT_REQ_END_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBW06_EDIT_REQUEST_END_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_PROC_DIV_Z", GXutil.rtrim( gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_CRF_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_CRF_VERSION_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_MEMO_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_STYDY_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_REQUEST_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_EDIT_REQUEST_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_EDIT_REQUEST_END_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_EDIT_REQ_END_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_EDIT_REQUEST_END_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW06_PROC_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N, 1, 0)));
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
      AddObjectProperty("TBW06_SESSION_ID", gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id, false);
      AddObjectProperty("TBW06_APP_ID", gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id, false);
      AddObjectProperty("TBW06_DISP_DATETIME", gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime, false);
      AddObjectProperty("TBW06_STUDY_ID", gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id, false);
      AddObjectProperty("TBW06_SUBJECT_ID", gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id, false);
      AddObjectProperty("TBW06_INS_NO", gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no, false);
      AddObjectProperty("TBW06_CRF_ID", gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id, false);
      AddObjectProperty("TBW06_CRF_VERSION", gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version, false);
      AddObjectProperty("TBW06_MEMO", gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo, false);
      AddObjectProperty("TBW06_STYDY_AUTH_CD", gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd, false);
      AddObjectProperty("TBW06_REQUEST_USER_ID", gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id, false);
      AddObjectProperty("TBW06_EDIT_REQUEST_FLG", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg, false);
      AddObjectProperty("TBW06_EDIT_REQUEST_END_FLG", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg, false);
      datetime_STZ = gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime ;
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
      AddObjectProperty("TBW06_EDIT_REQ_END_DATETIME", sDateCnv, false);
      AddObjectProperty("TBW06_EDIT_REQUEST_END_USER_ID", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id, false);
      AddObjectProperty("TBW06_PROC_DIV", gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBW06_CRF_MEMO_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBW06_CRF_MEMO_Initialized, false);
         AddObjectProperty("TBW06_SESSION_ID_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z, false);
         AddObjectProperty("TBW06_APP_ID_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z, false);
         AddObjectProperty("TBW06_DISP_DATETIME_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z, false);
         AddObjectProperty("TBW06_STUDY_ID_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z, false);
         AddObjectProperty("TBW06_SUBJECT_ID_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z, false);
         AddObjectProperty("TBW06_INS_NO_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z, false);
         AddObjectProperty("TBW06_CRF_ID_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z, false);
         AddObjectProperty("TBW06_CRF_VERSION_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z, false);
         AddObjectProperty("TBW06_MEMO_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z, false);
         AddObjectProperty("TBW06_STYDY_AUTH_CD_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z, false);
         AddObjectProperty("TBW06_REQUEST_USER_ID_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z, false);
         AddObjectProperty("TBW06_EDIT_REQUEST_FLG_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z, false);
         AddObjectProperty("TBW06_EDIT_REQUEST_END_FLG_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z, false);
         datetime_STZ = gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z ;
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
         AddObjectProperty("TBW06_EDIT_REQ_END_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBW06_EDIT_REQUEST_END_USER_ID_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z, false);
         AddObjectProperty("TBW06_PROC_DIV_Z", gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z, false);
         AddObjectProperty("TBW06_CRF_ID_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N, false);
         AddObjectProperty("TBW06_CRF_VERSION_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N, false);
         AddObjectProperty("TBW06_MEMO_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N, false);
         AddObjectProperty("TBW06_STYDY_AUTH_CD_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N, false);
         AddObjectProperty("TBW06_REQUEST_USER_ID_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N, false);
         AddObjectProperty("TBW06_EDIT_REQUEST_FLG_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N, false);
         AddObjectProperty("TBW06_EDIT_REQUEST_END_FLG_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N, false);
         AddObjectProperty("TBW06_EDIT_REQ_END_DATETIME_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N, false);
         AddObjectProperty("TBW06_EDIT_REQUEST_END_USER_ID_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N, false);
         AddObjectProperty("TBW06_PROC_DIV_N", gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N, false);
      }
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id, value) != 0 )
      {
         gxTv_SdtTBW06_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z_SetNull( );
      }
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id = value ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id, value) != 0 )
      {
         gxTv_SdtTBW06_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z_SetNull( );
      }
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id = value ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime, value) != 0 )
      {
         gxTv_SdtTBW06_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z_SetNull( );
      }
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime = value ;
   }

   public long getgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id( long value )
   {
      if ( gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id != value )
      {
         gxTv_SdtTBW06_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z_SetNull( );
      }
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id = value ;
   }

   public int getgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id( int value )
   {
      if ( gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id != value )
      {
         gxTv_SdtTBW06_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z_SetNull( );
      }
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id = value ;
   }

   public short getgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no( short value )
   {
      if ( gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no != value )
      {
         gxTv_SdtTBW06_CRF_MEMO_Mode = "INS" ;
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z_SetNull( );
         this.setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z_SetNull( );
      }
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no = value ;
   }

   public short getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime( java.util.Date value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N = (byte)(0) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N = (byte)(1) ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Mode( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Mode ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Mode( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Mode = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Mode_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Mode = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW06_CRF_MEMO_Initialized( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Initialized ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Initialized( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Initialized = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Initialized_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z( long value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z( int value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z( short value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z( String value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N( )
   {
      return gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N( byte value )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N = value ;
   }

   public void setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N_SetNull( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbw06_crf_memo_bc obj ;
      obj = new tbw06_crf_memo_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Mode = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z = "" ;
      gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBW06_CRF_MEMO Clone( )
   {
      SdtTBW06_CRF_MEMO sdt ;
      tbw06_crf_memo_bc obj ;
      sdt = (SdtTBW06_CRF_MEMO)(clone()) ;
      obj = (tbw06_crf_memo_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBW06_CRF_MEMO struct )
   {
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id(struct.getTbw06_session_id());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id(struct.getTbw06_app_id());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime(struct.getTbw06_disp_datetime());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id(struct.getTbw06_study_id());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id(struct.getTbw06_subject_id());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no(struct.getTbw06_ins_no());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id(struct.getTbw06_crf_id());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version(struct.getTbw06_crf_version());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo(struct.getTbw06_memo());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd(struct.getTbw06_stydy_auth_cd());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id(struct.getTbw06_request_user_id());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg(struct.getTbw06_edit_request_flg());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg(struct.getTbw06_edit_request_end_flg());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime(struct.getTbw06_edit_req_end_datetime());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id(struct.getTbw06_edit_request_end_user_id());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div(struct.getTbw06_proc_div());
      setgxTv_SdtTBW06_CRF_MEMO_Mode(struct.getMode());
      setgxTv_SdtTBW06_CRF_MEMO_Initialized(struct.getInitialized());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z(struct.getTbw06_session_id_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z(struct.getTbw06_app_id_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z(struct.getTbw06_disp_datetime_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z(struct.getTbw06_study_id_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z(struct.getTbw06_subject_id_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z(struct.getTbw06_ins_no_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z(struct.getTbw06_crf_id_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z(struct.getTbw06_crf_version_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z(struct.getTbw06_memo_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z(struct.getTbw06_stydy_auth_cd_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z(struct.getTbw06_request_user_id_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z(struct.getTbw06_edit_request_flg_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z(struct.getTbw06_edit_request_end_flg_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z(struct.getTbw06_edit_req_end_datetime_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z(struct.getTbw06_edit_request_end_user_id_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z(struct.getTbw06_proc_div_Z());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N(struct.getTbw06_crf_id_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N(struct.getTbw06_crf_version_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N(struct.getTbw06_memo_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N(struct.getTbw06_stydy_auth_cd_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N(struct.getTbw06_request_user_id_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N(struct.getTbw06_edit_request_flg_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N(struct.getTbw06_edit_request_end_flg_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N(struct.getTbw06_edit_req_end_datetime_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N(struct.getTbw06_edit_request_end_user_id_N());
      setgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N(struct.getTbw06_proc_div_N());
   }

   public StructSdtTBW06_CRF_MEMO getStruct( )
   {
      StructSdtTBW06_CRF_MEMO struct = new StructSdtTBW06_CRF_MEMO ();
      struct.setTbw06_session_id(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id());
      struct.setTbw06_app_id(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id());
      struct.setTbw06_disp_datetime(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime());
      struct.setTbw06_study_id(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id());
      struct.setTbw06_subject_id(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id());
      struct.setTbw06_ins_no(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no());
      struct.setTbw06_crf_id(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id());
      struct.setTbw06_crf_version(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version());
      struct.setTbw06_memo(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo());
      struct.setTbw06_stydy_auth_cd(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd());
      struct.setTbw06_request_user_id(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id());
      struct.setTbw06_edit_request_flg(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg());
      struct.setTbw06_edit_request_end_flg(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg());
      struct.setTbw06_edit_req_end_datetime(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime());
      struct.setTbw06_edit_request_end_user_id(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id());
      struct.setTbw06_proc_div(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div());
      struct.setMode(getgxTv_SdtTBW06_CRF_MEMO_Mode());
      struct.setInitialized(getgxTv_SdtTBW06_CRF_MEMO_Initialized());
      struct.setTbw06_session_id_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z());
      struct.setTbw06_app_id_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z());
      struct.setTbw06_disp_datetime_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z());
      struct.setTbw06_study_id_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z());
      struct.setTbw06_subject_id_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z());
      struct.setTbw06_ins_no_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z());
      struct.setTbw06_crf_id_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z());
      struct.setTbw06_crf_version_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z());
      struct.setTbw06_memo_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z());
      struct.setTbw06_stydy_auth_cd_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z());
      struct.setTbw06_request_user_id_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z());
      struct.setTbw06_edit_request_flg_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z());
      struct.setTbw06_edit_request_end_flg_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z());
      struct.setTbw06_edit_req_end_datetime_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z());
      struct.setTbw06_edit_request_end_user_id_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z());
      struct.setTbw06_proc_div_Z(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z());
      struct.setTbw06_crf_id_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N());
      struct.setTbw06_crf_version_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N());
      struct.setTbw06_memo_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N());
      struct.setTbw06_stydy_auth_cd_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N());
      struct.setTbw06_request_user_id_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N());
      struct.setTbw06_edit_request_flg_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N());
      struct.setTbw06_edit_request_end_flg_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N());
      struct.setTbw06_edit_req_end_datetime_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N());
      struct.setTbw06_edit_request_end_user_id_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N());
      struct.setTbw06_proc_div_N(getgxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N());
      return struct ;
   }

   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_N ;
   private byte gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_N ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version ;
   private short gxTv_SdtTBW06_CRF_MEMO_Initialized ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_ins_no_Z ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_id_Z ;
   private short gxTv_SdtTBW06_CRF_MEMO_Tbw06_crf_version_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id ;
   private int gxTv_SdtTBW06_CRF_MEMO_Tbw06_subject_id_Z ;
   private long gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id ;
   private long gxTv_SdtTBW06_CRF_MEMO_Tbw06_study_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime ;
   private java.util.Date gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_req_end_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_session_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_app_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_disp_datetime_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_memo_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_stydy_auth_cd_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_request_user_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_flg_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_flg_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_edit_request_end_user_id_Z ;
   private String gxTv_SdtTBW06_CRF_MEMO_Tbw06_proc_div_Z ;
}

