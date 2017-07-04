import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTBW07_CRF_MEMO_LOC extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBW07_CRF_MEMO_LOC( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBW07_CRF_MEMO_LOC.class));
   }

   public SdtTBW07_CRF_MEMO_LOC( int remoteHandle ,
                                 ModelContext context )
   {
      super( context, "SdtTBW07_CRF_MEMO_LOC");
      initialize( remoteHandle) ;
   }

   public SdtTBW07_CRF_MEMO_LOC( int remoteHandle ,
                                 StructSdtTBW07_CRF_MEMO_LOC struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( String AV714TBW07_SESSION_ID ,
                     String AV715TBW07_APP_ID ,
                     String AV716TBW07_DISP_DATETIME ,
                     long AV717TBW07_STUDY_ID ,
                     int AV718TBW07_SUBJECT_ID ,
                     short AV719TBW07_INS_NO ,
                     short AV720TBW07_CRF_ID ,
                     short AV721TBW07_CRF_VERSION ,
                     short AV722TBW07_X ,
                     short AV723TBW07_Y )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV714TBW07_SESSION_ID,AV715TBW07_APP_ID,AV716TBW07_DISP_DATETIME,new Long(AV717TBW07_STUDY_ID),new Integer(AV718TBW07_SUBJECT_ID),new Short(AV719TBW07_INS_NO),new Short(AV720TBW07_CRF_ID),new Short(AV721TBW07_CRF_VERSION),new Short(AV722TBW07_X),new Short(AV723TBW07_Y)});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_SESSION_ID") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_APP_ID") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_DISP_DATETIME") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_STUDY_ID") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_SUBJECT_ID") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_INS_NO") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_CRF_ID") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_CRF_VERSION") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_X") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_Y") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_EDIT_REQUEST_FLG") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_COLOR_DIV") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_SESSION_ID_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_APP_ID_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_DISP_DATETIME_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_STUDY_ID_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_INS_NO_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_CRF_ID_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_CRF_VERSION_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_X_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_Y_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_EDIT_REQUEST_FLG_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_COLOR_DIV_Z") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_EDIT_REQUEST_FLG_N") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW07_COLOR_DIV_N") )
            {
               gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBW07_CRF_MEMO_LOC" ;
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
      oWriter.writeElement("TBW07_SESSION_ID", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_APP_ID", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_DISP_DATETIME", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_INS_NO", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_CRF_VERSION", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_X", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_Y", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_EDIT_REQUEST_FLG", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_COLOR_DIV", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_SESSION_ID_Z", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_APP_ID_Z", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_DISP_DATETIME_Z", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_INS_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_CRF_VERSION_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_X_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_Y_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_EDIT_REQUEST_FLG_Z", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_COLOR_DIV_Z", GXutil.rtrim( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_EDIT_REQUEST_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW07_COLOR_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBW07_SESSION_ID", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id);
      AddObjectProperty("TBW07_APP_ID", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id);
      AddObjectProperty("TBW07_DISP_DATETIME", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime);
      AddObjectProperty("TBW07_STUDY_ID", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id);
      AddObjectProperty("TBW07_SUBJECT_ID", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id);
      AddObjectProperty("TBW07_INS_NO", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no);
      AddObjectProperty("TBW07_CRF_ID", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id);
      AddObjectProperty("TBW07_CRF_VERSION", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version);
      AddObjectProperty("TBW07_X", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x);
      AddObjectProperty("TBW07_Y", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y);
      AddObjectProperty("TBW07_EDIT_REQUEST_FLG", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg);
      AddObjectProperty("TBW07_COLOR_DIV", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div);
      AddObjectProperty("Mode", gxTv_SdtTBW07_CRF_MEMO_LOC_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTBW07_CRF_MEMO_LOC_Initialized);
      AddObjectProperty("TBW07_SESSION_ID_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z);
      AddObjectProperty("TBW07_APP_ID_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z);
      AddObjectProperty("TBW07_DISP_DATETIME_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z);
      AddObjectProperty("TBW07_STUDY_ID_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z);
      AddObjectProperty("TBW07_SUBJECT_ID_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z);
      AddObjectProperty("TBW07_INS_NO_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z);
      AddObjectProperty("TBW07_CRF_ID_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z);
      AddObjectProperty("TBW07_CRF_VERSION_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z);
      AddObjectProperty("TBW07_X_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z);
      AddObjectProperty("TBW07_Y_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z);
      AddObjectProperty("TBW07_EDIT_REQUEST_FLG_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z);
      AddObjectProperty("TBW07_COLOR_DIV_Z", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z);
      AddObjectProperty("TBW07_EDIT_REQUEST_FLG_N", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N);
      AddObjectProperty("TBW07_COLOR_DIV_N", gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N);
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id, value) != 0 )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id = value ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id, value) != 0 )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id = value ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime, value) != 0 )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime = value ;
   }

   public long getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id( long value )
   {
      if ( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id != value )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id = value ;
   }

   public int getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id( int value )
   {
      if ( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id != value )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id = value ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no( short value )
   {
      if ( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no != value )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no = value ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id( short value )
   {
      if ( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id != value )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id = value ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version( short value )
   {
      if ( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version != value )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version = value ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x( short value )
   {
      if ( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x != value )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x = value ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y( short value )
   {
      if ( gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y != value )
      {
         gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( );
         this.setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( );
      }
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y = value ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg( String value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N = (byte)(0) ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N = (byte)(1) ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg = "" ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div( String value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N = (byte)(0) ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N = (byte)(1) ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div = "" ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Mode ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode( String value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "" ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Initialized( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Initialized ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Initialized( short value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Initialized = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Initialized_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z( String value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z( String value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z( String value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z = "" ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z( long value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z( int value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z( short value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z( short value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z( short value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z( short value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z( short value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z( String value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z( String value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N( byte value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N( )
   {
      return gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N( byte value )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N = value ;
   }

   public void setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N_SetNull( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbw07_crf_memo_loc_bc obj ;
      obj = new tbw07_crf_memo_loc_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Mode = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z = "" ;
      gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z = "" ;
      sTagName = "" ;
   }

   public SdtTBW07_CRF_MEMO_LOC Clone( )
   {
      SdtTBW07_CRF_MEMO_LOC sdt ;
      tbw07_crf_memo_loc_bc obj ;
      sdt = (SdtTBW07_CRF_MEMO_LOC)(clone()) ;
      obj = (tbw07_crf_memo_loc_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBW07_CRF_MEMO_LOC struct )
   {
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id(struct.getTbw07_session_id());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id(struct.getTbw07_app_id());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime(struct.getTbw07_disp_datetime());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id(struct.getTbw07_study_id());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id(struct.getTbw07_subject_id());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no(struct.getTbw07_ins_no());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id(struct.getTbw07_crf_id());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version(struct.getTbw07_crf_version());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x(struct.getTbw07_x());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y(struct.getTbw07_y());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg(struct.getTbw07_edit_request_flg());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div(struct.getTbw07_color_div());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Mode(struct.getMode());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Initialized(struct.getInitialized());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z(struct.getTbw07_session_id_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z(struct.getTbw07_app_id_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z(struct.getTbw07_disp_datetime_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z(struct.getTbw07_study_id_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z(struct.getTbw07_subject_id_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z(struct.getTbw07_ins_no_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z(struct.getTbw07_crf_id_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z(struct.getTbw07_crf_version_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z(struct.getTbw07_x_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z(struct.getTbw07_y_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z(struct.getTbw07_edit_request_flg_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z(struct.getTbw07_color_div_Z());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N(struct.getTbw07_edit_request_flg_N());
      setgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N(struct.getTbw07_color_div_N());
   }

   public StructSdtTBW07_CRF_MEMO_LOC getStruct( )
   {
      StructSdtTBW07_CRF_MEMO_LOC struct = new StructSdtTBW07_CRF_MEMO_LOC ();
      struct.setTbw07_session_id(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id());
      struct.setTbw07_app_id(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id());
      struct.setTbw07_disp_datetime(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime());
      struct.setTbw07_study_id(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id());
      struct.setTbw07_subject_id(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id());
      struct.setTbw07_ins_no(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no());
      struct.setTbw07_crf_id(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id());
      struct.setTbw07_crf_version(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version());
      struct.setTbw07_x(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x());
      struct.setTbw07_y(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y());
      struct.setTbw07_edit_request_flg(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg());
      struct.setTbw07_color_div(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div());
      struct.setMode(getgxTv_SdtTBW07_CRF_MEMO_LOC_Mode());
      struct.setInitialized(getgxTv_SdtTBW07_CRF_MEMO_LOC_Initialized());
      struct.setTbw07_session_id_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z());
      struct.setTbw07_app_id_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z());
      struct.setTbw07_disp_datetime_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z());
      struct.setTbw07_study_id_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z());
      struct.setTbw07_subject_id_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z());
      struct.setTbw07_ins_no_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z());
      struct.setTbw07_crf_id_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z());
      struct.setTbw07_crf_version_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z());
      struct.setTbw07_x_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z());
      struct.setTbw07_y_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z());
      struct.setTbw07_edit_request_flg_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z());
      struct.setTbw07_color_div_Z(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z());
      struct.setTbw07_edit_request_flg_N(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N());
      struct.setTbw07_color_div_N(getgxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N());
      return struct ;
   }

   private byte gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_N ;
   private byte gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_N ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Initialized ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_ins_no_Z ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_id_Z ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_crf_version_Z ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_x_Z ;
   private short gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_y_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id ;
   private int gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_subject_id_Z ;
   private long gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id ;
   private long gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_study_id_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Mode ;
   private String sTagName ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_session_id_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_app_id_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_disp_datetime_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_edit_request_flg_Z ;
   private String gxTv_SdtTBW07_CRF_MEMO_LOC_Tbw07_color_div_Z ;
}

