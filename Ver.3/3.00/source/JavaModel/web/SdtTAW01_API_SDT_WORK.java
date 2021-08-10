/*
               File: SdtTAW01_API_SDT_WORK
        Description: アプリケーションSDTテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:49.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTAW01_API_SDT_WORK extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTAW01_API_SDT_WORK( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTAW01_API_SDT_WORK.class));
   }

   public SdtTAW01_API_SDT_WORK( int remoteHandle ,
                                 ModelContext context )
   {
      super( context, "SdtTAW01_API_SDT_WORK");
      initialize( remoteHandle) ;
   }

   public SdtTAW01_API_SDT_WORK( int remoteHandle ,
                                 StructSdtTAW01_API_SDT_WORK struct )
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

   public void Load( String AV14TAW01_SESSION_ID ,
                     String AV15TAW01_APP_ID ,
                     String AV16TAW01_DISP_DATETIME )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV14TAW01_SESSION_ID,AV15TAW01_APP_ID,AV16TAW01_DISP_DATETIME});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TAW01_SESSION_ID", String.class}, new Object[]{"TAW01_APP_ID", String.class}, new Object[]{"TAW01_DISP_DATETIME", String.class}}) ;
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
      metadata.set("Name", "TAW01_API_SDT_WORK");
      metadata.set("BT", "TAW01_API_SDT_WORK");
      metadata.set("PK", "[ \"TAW01_SESSION_ID\",\"TAW01_APP_ID\",\"TAW01_DISP_DATETIME\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_SESSION_ID") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_APP_ID") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_DISP_DATETIME") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_CRT_DATE") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_SDT_SAVE_1") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_SDT_SAVE_2") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_SESSION_ID_Z") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_APP_ID_Z") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_DISP_DATETIME_Z") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_CRT_DATE_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_CRT_DATE_N") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_SDT_SAVE_1_N") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAW01_SDT_SAVE_2_N") )
            {
               gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TAW01_API_SDT_WORK" ;
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
      oWriter.writeElement("TAW01_SESSION_ID", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAW01_APP_ID", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAW01_DISP_DATETIME", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date) )
      {
         oWriter.writeStartElement("TAW01_CRT_DATE");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAW01_CRT_DATE", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TAW01_SDT_SAVE_1", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAW01_SDT_SAVE_2", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTAW01_API_SDT_WORK_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAW01_SESSION_ID_Z", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAW01_APP_ID_Z", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAW01_DISP_DATETIME_Z", GXutil.rtrim( gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z) )
         {
            oWriter.writeStartElement("TAW01_CRT_DATE_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TAW01_CRT_DATE_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TAW01_CRT_DATE_N", GXutil.trim( GXutil.str( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAW01_SDT_SAVE_1_N", GXutil.trim( GXutil.str( gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAW01_SDT_SAVE_2_N", GXutil.trim( GXutil.str( gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N, 1, 0)));
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
      AddObjectProperty("TAW01_SESSION_ID", gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id, false);
      AddObjectProperty("TAW01_APP_ID", gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id, false);
      AddObjectProperty("TAW01_DISP_DATETIME", gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAW01_CRT_DATE", sDateCnv, false);
      AddObjectProperty("TAW01_SDT_SAVE_1", gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1, false);
      AddObjectProperty("TAW01_SDT_SAVE_2", gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTAW01_API_SDT_WORK_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTAW01_API_SDT_WORK_Initialized, false);
         AddObjectProperty("TAW01_SESSION_ID_Z", gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z, false);
         AddObjectProperty("TAW01_APP_ID_Z", gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z, false);
         AddObjectProperty("TAW01_DISP_DATETIME_Z", gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z, false);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("TAW01_CRT_DATE_Z", sDateCnv, false);
         AddObjectProperty("TAW01_CRT_DATE_N", gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N, false);
         AddObjectProperty("TAW01_SDT_SAVE_1_N", gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N, false);
         AddObjectProperty("TAW01_SDT_SAVE_2_N", gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N, false);
      }
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id, value) != 0 )
      {
         gxTv_SdtTAW01_API_SDT_WORK_Mode = "INS" ;
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z_SetNull( );
      }
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id = value ;
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id, value) != 0 )
      {
         gxTv_SdtTAW01_API_SDT_WORK_Mode = "INS" ;
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z_SetNull( );
      }
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id = value ;
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime, value) != 0 )
      {
         gxTv_SdtTAW01_API_SDT_WORK_Mode = "INS" ;
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z_SetNull( );
         this.setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z_SetNull( );
      }
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime = value ;
   }

   public java.util.Date getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date( java.util.Date value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N = (byte)(0) ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N = (byte)(1) ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N = (byte)(0) ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N = (byte)(1) ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 = "" ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N = (byte)(0) ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N = (byte)(1) ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 = "" ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Mode( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Mode ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Mode( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Mode = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Mode_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Mode = "" ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTAW01_API_SDT_WORK_Initialized( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Initialized ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Initialized( short value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Initialized = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Initialized_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z( String value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z = "" ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z( java.util.Date value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z = GXutil.nullDate() ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N( byte value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N( byte value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N( )
   {
      return gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N( byte value )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N = value ;
   }

   public void setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N_SetNull( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      taw01_api_sdt_work_bc obj ;
      obj = new taw01_api_sdt_work_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date = GXutil.nullDate() ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Mode = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z = "" ;
      gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z = GXutil.nullDate() ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtTAW01_API_SDT_WORK Clone( )
   {
      SdtTAW01_API_SDT_WORK sdt ;
      taw01_api_sdt_work_bc obj ;
      sdt = (SdtTAW01_API_SDT_WORK)(clone()) ;
      obj = (taw01_api_sdt_work_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTAW01_API_SDT_WORK struct )
   {
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id(struct.getTaw01_session_id());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id(struct.getTaw01_app_id());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime(struct.getTaw01_disp_datetime());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date(struct.getTaw01_crt_date());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1(struct.getTaw01_sdt_save_1());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2(struct.getTaw01_sdt_save_2());
      setgxTv_SdtTAW01_API_SDT_WORK_Mode(struct.getMode());
      setgxTv_SdtTAW01_API_SDT_WORK_Initialized(struct.getInitialized());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z(struct.getTaw01_session_id_Z());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z(struct.getTaw01_app_id_Z());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z(struct.getTaw01_disp_datetime_Z());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z(struct.getTaw01_crt_date_Z());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N(struct.getTaw01_crt_date_N());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N(struct.getTaw01_sdt_save_1_N());
      setgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N(struct.getTaw01_sdt_save_2_N());
   }

   public StructSdtTAW01_API_SDT_WORK getStruct( )
   {
      StructSdtTAW01_API_SDT_WORK struct = new StructSdtTAW01_API_SDT_WORK ();
      struct.setTaw01_session_id(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id());
      struct.setTaw01_app_id(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id());
      struct.setTaw01_disp_datetime(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime());
      struct.setTaw01_crt_date(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date());
      struct.setTaw01_sdt_save_1(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1());
      struct.setTaw01_sdt_save_2(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2());
      struct.setMode(getgxTv_SdtTAW01_API_SDT_WORK_Mode());
      struct.setInitialized(getgxTv_SdtTAW01_API_SDT_WORK_Initialized());
      struct.setTaw01_session_id_Z(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z());
      struct.setTaw01_app_id_Z(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z());
      struct.setTaw01_disp_datetime_Z(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z());
      struct.setTaw01_crt_date_Z(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z());
      struct.setTaw01_crt_date_N(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N());
      struct.setTaw01_sdt_save_1_N(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N());
      struct.setTaw01_sdt_save_2_N(getgxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N());
      return struct ;
   }

   private byte gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_N ;
   private byte gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1_N ;
   private byte gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2_N ;
   private short gxTv_SdtTAW01_API_SDT_WORK_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date ;
   private java.util.Date gxTv_SdtTAW01_API_SDT_WORK_Taw01_crt_date_Z ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_1 ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Taw01_sdt_save_2 ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Taw01_session_id_Z ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Taw01_app_id_Z ;
   private String gxTv_SdtTAW01_API_SDT_WORK_Taw01_disp_datetime_Z ;
}

