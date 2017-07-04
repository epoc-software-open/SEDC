import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTBW02_ODM_WORK extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBW02_ODM_WORK( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBW02_ODM_WORK.class));
   }

   public SdtTBW02_ODM_WORK( int remoteHandle ,
                             ModelContext context )
   {
      super( context, "SdtTBW02_ODM_WORK");
      initialize( remoteHandle) ;
   }

   public SdtTBW02_ODM_WORK( int remoteHandle ,
                             StructSdtTBW02_ODM_WORK struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( String AV367TBW02_SESSION_ID ,
                     String AV368TBW02_APP_ID ,
                     String AV369TBW02_DISP_DATETIME ,
                     long AV359TBW02_STUDY_ID ,
                     int AV360TBW02_SUBJECT_ID ,
                     short AV361TBW02_VISIT_NO ,
                     String AV362TBW02_DOM_CD ,
                     short AV363TBW02_REPEAT_KEY ,
                     int AV366TBW02_ORDER ,
                     String AV511TBW02_DOM_VAR_NM )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV367TBW02_SESSION_ID,AV368TBW02_APP_ID,AV369TBW02_DISP_DATETIME,new Long(AV359TBW02_STUDY_ID),new Integer(AV360TBW02_SUBJECT_ID),new Short(AV361TBW02_VISIT_NO),AV362TBW02_DOM_CD,new Short(AV363TBW02_REPEAT_KEY),new Integer(AV366TBW02_ORDER),AV511TBW02_DOM_VAR_NM});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_SESSION_ID") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_APP_ID") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_DISP_DATETIME") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_STUDY_ID") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_SUBJECT_ID") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_VISIT_NO") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_DOM_CD") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_REPEAT_KEY") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_ORDER") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_DOM_VAR_NM") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_CRF_ITEM_CD") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_CRF_VALUE") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBW02_ODM_WORK_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBW02_ODM_WORK_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_SESSION_ID_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_APP_ID_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_DISP_DATETIME_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_STUDY_ID_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_VISIT_NO_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_DOM_CD_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_REPEAT_KEY_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_ORDER_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_DOM_VAR_NM_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_CRF_ITEM_CD_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_CRF_VALUE_Z") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_CRF_ITEM_CD_N") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW02_CRF_VALUE_N") )
            {
               gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBW02_ODM_WORK" ;
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
      oWriter.writeElement("TBW02_SESSION_ID", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_APP_ID", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_DISP_DATETIME", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_DOM_CD", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_REPEAT_KEY", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_ORDER", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_DOM_VAR_NM", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_CRF_VALUE", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_SESSION_ID_Z", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_APP_ID_Z", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_DISP_DATETIME_Z", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_VISIT_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_DOM_CD_Z", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_REPEAT_KEY_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_ORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_DOM_VAR_NM_Z", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_CRF_ITEM_CD_Z", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_CRF_VALUE_Z", GXutil.rtrim( gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_CRF_ITEM_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBW02_CRF_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBW02_SESSION_ID", gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id);
      AddObjectProperty("TBW02_APP_ID", gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id);
      AddObjectProperty("TBW02_DISP_DATETIME", gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime);
      AddObjectProperty("TBW02_STUDY_ID", gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id);
      AddObjectProperty("TBW02_SUBJECT_ID", gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id);
      AddObjectProperty("TBW02_VISIT_NO", gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no);
      AddObjectProperty("TBW02_DOM_CD", gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd);
      AddObjectProperty("TBW02_REPEAT_KEY", gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key);
      AddObjectProperty("TBW02_ORDER", gxTv_SdtTBW02_ODM_WORK_Tbw02_order);
      AddObjectProperty("TBW02_DOM_VAR_NM", gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm);
      AddObjectProperty("TBW02_CRF_ITEM_CD", gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd);
      AddObjectProperty("TBW02_CRF_VALUE", gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value);
      AddObjectProperty("Mode", gxTv_SdtTBW02_ODM_WORK_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTBW02_ODM_WORK_Initialized);
      AddObjectProperty("TBW02_SESSION_ID_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z);
      AddObjectProperty("TBW02_APP_ID_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z);
      AddObjectProperty("TBW02_DISP_DATETIME_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z);
      AddObjectProperty("TBW02_STUDY_ID_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z);
      AddObjectProperty("TBW02_SUBJECT_ID_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z);
      AddObjectProperty("TBW02_VISIT_NO_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z);
      AddObjectProperty("TBW02_DOM_CD_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z);
      AddObjectProperty("TBW02_REPEAT_KEY_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z);
      AddObjectProperty("TBW02_ORDER_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z);
      AddObjectProperty("TBW02_DOM_VAR_NM_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z);
      AddObjectProperty("TBW02_CRF_ITEM_CD_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z);
      AddObjectProperty("TBW02_CRF_VALUE_Z", gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z);
      AddObjectProperty("TBW02_CRF_ITEM_CD_N", gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N);
      AddObjectProperty("TBW02_CRF_VALUE_N", gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N);
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id, value) != 0 )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id = value ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id, value) != 0 )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id = value ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime, value) != 0 )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime = value ;
   }

   public long getgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id( long value )
   {
      if ( gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id != value )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id = value ;
   }

   public int getgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id( int value )
   {
      if ( gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id != value )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id = value ;
   }

   public short getgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no( short value )
   {
      if ( gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no != value )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no = value ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd, value) != 0 )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd = value ;
   }

   public short getgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key( short value )
   {
      if ( gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key != value )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key = value ;
   }

   public int getgxTv_SdtTBW02_ODM_WORK_Tbw02_order( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_order ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_order( int value )
   {
      if ( gxTv_SdtTBW02_ODM_WORK_Tbw02_order != value )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_order = value ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm, value) != 0 )
      {
         gxTv_SdtTBW02_ODM_WORK_Mode = "INS" ;
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( );
      }
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm = value ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N = (byte)(0) ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N = (byte)(1) ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N = (byte)(0) ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N = (byte)(1) ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Mode( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Mode ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Mode( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Mode = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Mode_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Mode = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW02_ODM_WORK_Initialized( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Initialized ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Initialized( short value )
   {
      gxTv_SdtTBW02_ODM_WORK_Initialized = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Initialized_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z( long value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z( int value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z( short value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z( short value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z( int value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z( String value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N( byte value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N( )
   {
      return gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N( byte value )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N = value ;
   }

   public void setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N_SetNull( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbw02_odm_work_bc obj ;
      obj = new tbw02_odm_work_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value = "" ;
      gxTv_SdtTBW02_ODM_WORK_Mode = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z = "" ;
      gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z = "" ;
      sTagName = "" ;
   }

   public SdtTBW02_ODM_WORK Clone( )
   {
      SdtTBW02_ODM_WORK sdt ;
      tbw02_odm_work_bc obj ;
      sdt = (SdtTBW02_ODM_WORK)(clone()) ;
      obj = (tbw02_odm_work_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBW02_ODM_WORK struct )
   {
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id(struct.getTbw02_session_id());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id(struct.getTbw02_app_id());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime(struct.getTbw02_disp_datetime());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id(struct.getTbw02_study_id());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id(struct.getTbw02_subject_id());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no(struct.getTbw02_visit_no());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd(struct.getTbw02_dom_cd());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key(struct.getTbw02_repeat_key());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_order(struct.getTbw02_order());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm(struct.getTbw02_dom_var_nm());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd(struct.getTbw02_crf_item_cd());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value(struct.getTbw02_crf_value());
      setgxTv_SdtTBW02_ODM_WORK_Mode(struct.getMode());
      setgxTv_SdtTBW02_ODM_WORK_Initialized(struct.getInitialized());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z(struct.getTbw02_session_id_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z(struct.getTbw02_app_id_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z(struct.getTbw02_disp_datetime_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z(struct.getTbw02_study_id_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z(struct.getTbw02_subject_id_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z(struct.getTbw02_visit_no_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z(struct.getTbw02_dom_cd_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z(struct.getTbw02_repeat_key_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z(struct.getTbw02_order_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z(struct.getTbw02_dom_var_nm_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z(struct.getTbw02_crf_item_cd_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z(struct.getTbw02_crf_value_Z());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N(struct.getTbw02_crf_item_cd_N());
      setgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N(struct.getTbw02_crf_value_N());
   }

   public StructSdtTBW02_ODM_WORK getStruct( )
   {
      StructSdtTBW02_ODM_WORK struct = new StructSdtTBW02_ODM_WORK ();
      struct.setTbw02_session_id(getgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id());
      struct.setTbw02_app_id(getgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id());
      struct.setTbw02_disp_datetime(getgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime());
      struct.setTbw02_study_id(getgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id());
      struct.setTbw02_subject_id(getgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id());
      struct.setTbw02_visit_no(getgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no());
      struct.setTbw02_dom_cd(getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd());
      struct.setTbw02_repeat_key(getgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key());
      struct.setTbw02_order(getgxTv_SdtTBW02_ODM_WORK_Tbw02_order());
      struct.setTbw02_dom_var_nm(getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm());
      struct.setTbw02_crf_item_cd(getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd());
      struct.setTbw02_crf_value(getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value());
      struct.setMode(getgxTv_SdtTBW02_ODM_WORK_Mode());
      struct.setInitialized(getgxTv_SdtTBW02_ODM_WORK_Initialized());
      struct.setTbw02_session_id_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z());
      struct.setTbw02_app_id_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z());
      struct.setTbw02_disp_datetime_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z());
      struct.setTbw02_study_id_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z());
      struct.setTbw02_subject_id_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z());
      struct.setTbw02_visit_no_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z());
      struct.setTbw02_dom_cd_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z());
      struct.setTbw02_repeat_key_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z());
      struct.setTbw02_order_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z());
      struct.setTbw02_dom_var_nm_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z());
      struct.setTbw02_crf_item_cd_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z());
      struct.setTbw02_crf_value_Z(getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z());
      struct.setTbw02_crf_item_cd_N(getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N());
      struct.setTbw02_crf_value_N(getgxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N());
      return struct ;
   }

   private byte gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_N ;
   private byte gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_N ;
   private short gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no ;
   private short gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key ;
   private short gxTv_SdtTBW02_ODM_WORK_Initialized ;
   private short gxTv_SdtTBW02_ODM_WORK_Tbw02_visit_no_Z ;
   private short gxTv_SdtTBW02_ODM_WORK_Tbw02_repeat_key_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id ;
   private int gxTv_SdtTBW02_ODM_WORK_Tbw02_order ;
   private int gxTv_SdtTBW02_ODM_WORK_Tbw02_subject_id_Z ;
   private int gxTv_SdtTBW02_ODM_WORK_Tbw02_order_Z ;
   private long gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id ;
   private long gxTv_SdtTBW02_ODM_WORK_Tbw02_study_id_Z ;
   private String gxTv_SdtTBW02_ODM_WORK_Mode ;
   private String sTagName ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_session_id_Z ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_app_id_Z ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_disp_datetime_Z ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_cd_Z ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_dom_var_nm_Z ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_item_cd_Z ;
   private String gxTv_SdtTBW02_ODM_WORK_Tbw02_crf_value_Z ;
}

