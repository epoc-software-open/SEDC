/*
               File: SdtTBW05_CRF_RESULT
        Description: CRF入力結果テーブルワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:19.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBW05_CRF_RESULT extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBW05_CRF_RESULT( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBW05_CRF_RESULT.class));
   }

   public SdtTBW05_CRF_RESULT( int remoteHandle ,
                               ModelContext context )
   {
      super( context, "SdtTBW05_CRF_RESULT");
      initialize( remoteHandle) ;
   }

   public SdtTBW05_CRF_RESULT( int remoteHandle ,
                               StructSdtTBW05_CRF_RESULT struct )
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

   public void Load( String AV129TBW05_SESSION_ID ,
                     String AV130TBW05_APP_ID ,
                     String AV131TBW05_DISP_DATETIME ,
                     long AV132TBW05_STUDY_ID ,
                     int AV133TBW05_SUBJECT_ID ,
                     short AV134TBW05_CRF_ID ,
                     String AV135TBW05_CRF_ITEM_GRP_DIV ,
                     String AV136TBW05_CRF_ITEM_GRP_CD )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV129TBW05_SESSION_ID,AV130TBW05_APP_ID,AV131TBW05_DISP_DATETIME,new Long(AV132TBW05_STUDY_ID),new Integer(AV133TBW05_SUBJECT_ID),new Short(AV134TBW05_CRF_ID),AV135TBW05_CRF_ITEM_GRP_DIV,AV136TBW05_CRF_ITEM_GRP_CD});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBW05_SESSION_ID", String.class}, new Object[]{"TBW05_APP_ID", String.class}, new Object[]{"TBW05_DISP_DATETIME", String.class}, new Object[]{"TBW05_STUDY_ID", long.class}, new Object[]{"TBW05_SUBJECT_ID", int.class}, new Object[]{"TBW05_CRF_ID", short.class}, new Object[]{"TBW05_CRF_ITEM_GRP_DIV", String.class}, new Object[]{"TBW05_CRF_ITEM_GRP_CD", String.class}}) ;
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
      metadata.set("Name", "TBW05_CRF_RESULT");
      metadata.set("BT", "TBW05_CRF_RESULT");
      metadata.set("PK", "[ \"TBW05_SESSION_ID\",\"TBW05_APP_ID\",\"TBW05_DISP_DATETIME\",\"TBW05_STUDY_ID\",\"TBW05_SUBJECT_ID\",\"TBW05_CRF_ID\",\"TBW05_CRF_ITEM_GRP_DIV\",\"TBW05_CRF_ITEM_GRP_CD\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_SESSION_ID") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_APP_ID") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_DISP_DATETIME") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_STUDY_ID") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_SUBJECT_ID") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_ID") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_ITEM_GRP_DIV") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_VALUE") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_EDIT_FLG") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_SESSION_ID_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_APP_ID_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_DISP_DATETIME_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_STUDY_ID_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_ID_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_ITEM_GRP_DIV_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_ITEM_GRP_CD_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_VALUE_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_EDIT_FLG_Z") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_CRF_VALUE_N") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBW05_EDIT_FLG_N") )
            {
               gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBW05_CRF_RESULT" ;
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
      oWriter.writeElement("TBW05_SESSION_ID", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_APP_ID", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_DISP_DATETIME", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_CRF_ITEM_GRP_DIV", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_CRF_VALUE", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBW05_EDIT_FLG", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_SESSION_ID_Z", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_APP_ID_Z", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_DISP_DATETIME_Z", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_CRF_ITEM_GRP_DIV_Z", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_CRF_ITEM_GRP_CD_Z", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_CRF_VALUE_Z", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_EDIT_FLG_Z", GXutil.rtrim( gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_CRF_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBW05_EDIT_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N, 1, 0)));
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
      AddObjectProperty("TBW05_SESSION_ID", gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id, false);
      AddObjectProperty("TBW05_APP_ID", gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id, false);
      AddObjectProperty("TBW05_DISP_DATETIME", gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime, false);
      AddObjectProperty("TBW05_STUDY_ID", gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id, false);
      AddObjectProperty("TBW05_SUBJECT_ID", gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id, false);
      AddObjectProperty("TBW05_CRF_ID", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id, false);
      AddObjectProperty("TBW05_CRF_ITEM_GRP_DIV", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div, false);
      AddObjectProperty("TBW05_CRF_ITEM_GRP_CD", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd, false);
      AddObjectProperty("TBW05_CRF_VALUE", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value, false);
      AddObjectProperty("TBW05_EDIT_FLG", gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBW05_CRF_RESULT_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBW05_CRF_RESULT_Initialized, false);
         AddObjectProperty("TBW05_SESSION_ID_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z, false);
         AddObjectProperty("TBW05_APP_ID_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z, false);
         AddObjectProperty("TBW05_DISP_DATETIME_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z, false);
         AddObjectProperty("TBW05_STUDY_ID_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z, false);
         AddObjectProperty("TBW05_SUBJECT_ID_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z, false);
         AddObjectProperty("TBW05_CRF_ID_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z, false);
         AddObjectProperty("TBW05_CRF_ITEM_GRP_DIV_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z, false);
         AddObjectProperty("TBW05_CRF_ITEM_GRP_CD_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z, false);
         AddObjectProperty("TBW05_CRF_VALUE_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z, false);
         AddObjectProperty("TBW05_EDIT_FLG_Z", gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z, false);
         AddObjectProperty("TBW05_CRF_VALUE_N", gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N, false);
         AddObjectProperty("TBW05_EDIT_FLG_N", gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N, false);
      }
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id, value) != 0 )
      {
         gxTv_SdtTBW05_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( );
      }
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id = value ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id, value) != 0 )
      {
         gxTv_SdtTBW05_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( );
      }
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id = value ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime, value) != 0 )
      {
         gxTv_SdtTBW05_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( );
      }
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime = value ;
   }

   public long getgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id( long value )
   {
      if ( gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id != value )
      {
         gxTv_SdtTBW05_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( );
      }
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id = value ;
   }

   public int getgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id( int value )
   {
      if ( gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id != value )
      {
         gxTv_SdtTBW05_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( );
      }
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id = value ;
   }

   public short getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id( short value )
   {
      if ( gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id != value )
      {
         gxTv_SdtTBW05_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( );
      }
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id = value ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div, value) != 0 )
      {
         gxTv_SdtTBW05_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( );
      }
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div = value ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd, value) != 0 )
      {
         gxTv_SdtTBW05_CRF_RESULT_Mode = "INS" ;
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( );
      }
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N = (byte)(0) ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N = (byte)(1) ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N = (byte)(0) ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N = (byte)(1) ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Mode( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Mode ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Mode( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Mode = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Mode_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Mode = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW05_CRF_RESULT_Initialized( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Initialized ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Initialized( short value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Initialized = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Initialized_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z( long value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z( int value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z( short value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z( String value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N( byte value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N( )
   {
      return gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N( byte value )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N = value ;
   }

   public void setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N_SetNull( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbw05_crf_result_bc obj ;
      obj = new tbw05_crf_result_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Mode = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z = "" ;
      gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z = "" ;
      sTagName = "" ;
   }

   public SdtTBW05_CRF_RESULT Clone( )
   {
      SdtTBW05_CRF_RESULT sdt ;
      tbw05_crf_result_bc obj ;
      sdt = (SdtTBW05_CRF_RESULT)(clone()) ;
      obj = (tbw05_crf_result_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBW05_CRF_RESULT struct )
   {
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id(struct.getTbw05_session_id());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id(struct.getTbw05_app_id());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime(struct.getTbw05_disp_datetime());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id(struct.getTbw05_study_id());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id(struct.getTbw05_subject_id());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id(struct.getTbw05_crf_id());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div(struct.getTbw05_crf_item_grp_div());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd(struct.getTbw05_crf_item_grp_cd());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value(struct.getTbw05_crf_value());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg(struct.getTbw05_edit_flg());
      setgxTv_SdtTBW05_CRF_RESULT_Mode(struct.getMode());
      setgxTv_SdtTBW05_CRF_RESULT_Initialized(struct.getInitialized());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z(struct.getTbw05_session_id_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z(struct.getTbw05_app_id_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z(struct.getTbw05_disp_datetime_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z(struct.getTbw05_study_id_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z(struct.getTbw05_subject_id_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z(struct.getTbw05_crf_id_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z(struct.getTbw05_crf_item_grp_div_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z(struct.getTbw05_crf_item_grp_cd_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z(struct.getTbw05_crf_value_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z(struct.getTbw05_edit_flg_Z());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N(struct.getTbw05_crf_value_N());
      setgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N(struct.getTbw05_edit_flg_N());
   }

   public StructSdtTBW05_CRF_RESULT getStruct( )
   {
      StructSdtTBW05_CRF_RESULT struct = new StructSdtTBW05_CRF_RESULT ();
      struct.setTbw05_session_id(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id());
      struct.setTbw05_app_id(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id());
      struct.setTbw05_disp_datetime(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime());
      struct.setTbw05_study_id(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id());
      struct.setTbw05_subject_id(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id());
      struct.setTbw05_crf_id(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id());
      struct.setTbw05_crf_item_grp_div(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div());
      struct.setTbw05_crf_item_grp_cd(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd());
      struct.setTbw05_crf_value(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value());
      struct.setTbw05_edit_flg(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg());
      struct.setMode(getgxTv_SdtTBW05_CRF_RESULT_Mode());
      struct.setInitialized(getgxTv_SdtTBW05_CRF_RESULT_Initialized());
      struct.setTbw05_session_id_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z());
      struct.setTbw05_app_id_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z());
      struct.setTbw05_disp_datetime_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z());
      struct.setTbw05_study_id_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z());
      struct.setTbw05_subject_id_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z());
      struct.setTbw05_crf_id_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z());
      struct.setTbw05_crf_item_grp_div_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z());
      struct.setTbw05_crf_item_grp_cd_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z());
      struct.setTbw05_crf_value_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z());
      struct.setTbw05_edit_flg_Z(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z());
      struct.setTbw05_crf_value_N(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N());
      struct.setTbw05_edit_flg_N(getgxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N());
      return struct ;
   }

   private byte gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_N ;
   private byte gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_N ;
   private short gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id ;
   private short gxTv_SdtTBW05_CRF_RESULT_Initialized ;
   private short gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_id_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id ;
   private int gxTv_SdtTBW05_CRF_RESULT_Tbw05_subject_id_Z ;
   private long gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id ;
   private long gxTv_SdtTBW05_CRF_RESULT_Tbw05_study_id_Z ;
   private String gxTv_SdtTBW05_CRF_RESULT_Mode ;
   private String sTagName ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_session_id_Z ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_app_id_Z ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_disp_datetime_Z ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_div_Z ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_crf_value_Z ;
   private String gxTv_SdtTBW05_CRF_RESULT_Tbw05_edit_flg_Z ;
}

