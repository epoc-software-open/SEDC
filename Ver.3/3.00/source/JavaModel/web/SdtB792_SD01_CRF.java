/*
               File: SdtB792_SD01_CRF
        Description: B792_SD01_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:46.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB792_SD01_CRF extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB792_SD01_CRF( )
   {
      this(  new ModelContext(SdtB792_SD01_CRF.class));
   }

   public SdtB792_SD01_CRF( ModelContext context )
   {
      super( context, "SdtB792_SD01_CRF");
   }

   public SdtB792_SD01_CRF( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtB792_SD01_CRF");
   }

   public SdtB792_SD01_CRF( StructSdtB792_SD01_CRF struct )
   {
      this();
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
               gxTv_SdtB792_SD01_CRF_Tbt02_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SUBJECT_ID") )
            {
               gxTv_SdtB792_SD01_CRF_Tbt02_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_ID") )
            {
               gxTv_SdtB792_SD01_CRF_Tbt02_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_EDA_NO") )
            {
               gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_LATEST_VERSION") )
            {
               gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version = (short)(GXutil.lval( oReader.getValue())) ;
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
                  gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_INPUT_LEVEL") )
            {
               gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_FLG") )
            {
               gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg = oReader.getValue() ;
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
                  gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_FLG") )
            {
               gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg = oReader.getValue() ;
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
                  gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_CNT") )
            {
               gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_RESULTS") )
            {
               if ( gxTv_SdtB792_SD01_CRF_Crf_results == null )
               {
                  gxTv_SdtB792_SD01_CRF_Crf_results = new GxObjectCollection(SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem.class, "B792_SD02_CRF_RESULT.B792_SD02_CRF_RESULTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB792_SD01_CRF_Crf_results.readxml(oReader, "CRF_RESULTS") ;
               }
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
         sName = "B792_SD01_CRF" ;
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
      oWriter.writeElement("TBT02_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB792_SD01_CRF_Tbt02_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB792_SD01_CRF_Tbt02_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB792_SD01_CRF_Tbt02_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_LATEST_VERSION", GXutil.trim( GXutil.str( gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime) )
      {
         oWriter.writeStartElement("TBT02_UPLOAD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_UPLOAD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT02_CRF_INPUT_LEVEL", GXutil.trim( GXutil.str( gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_DM_ARRIVAL_FLG", GXutil.rtrim( gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime) )
      {
         oWriter.writeStartElement("TBT02_DM_ARRIVAL_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_DM_ARRIVAL_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT02_INPUT_END_FLG", GXutil.rtrim( gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime) )
      {
         oWriter.writeStartElement("TBT02_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT02_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtB792_SD01_CRF_Crf_results != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "tablet-EDC_GXXEV3U3" ;
         }
         else
         {
            sNameSpace1 = "tablet-EDC_GXXEV3U3" ;
         }
         gxTv_SdtB792_SD01_CRF_Crf_results.writexml(oWriter, "CRF_RESULTS", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("TBT02_STUDY_ID", gxTv_SdtB792_SD01_CRF_Tbt02_study_id, false);
      AddObjectProperty("TBT02_SUBJECT_ID", gxTv_SdtB792_SD01_CRF_Tbt02_subject_id, false);
      AddObjectProperty("TBT02_CRF_ID", gxTv_SdtB792_SD01_CRF_Tbt02_crf_id, false);
      AddObjectProperty("TBT02_CRF_EDA_NO", gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no, false);
      AddObjectProperty("TBT02_CRF_LATEST_VERSION", gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version, false);
      datetime_STZ = gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime ;
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
      AddObjectProperty("TBT02_UPLOAD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT02_CRF_INPUT_LEVEL", gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level, false);
      AddObjectProperty("TBT02_DM_ARRIVAL_FLG", gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg, false);
      datetime_STZ = gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime ;
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
      AddObjectProperty("TBT02_DM_ARRIVAL_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT02_INPUT_END_FLG", gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg, false);
      datetime_STZ = gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime ;
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
      AddObjectProperty("TBT02_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT02_UPD_CNT", gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt, false);
      if ( gxTv_SdtB792_SD01_CRF_Crf_results != null )
      {
         AddObjectProperty("CRF_RESULTS", gxTv_SdtB792_SD01_CRF_Crf_results, false);
      }
   }

   public long getgxTv_SdtB792_SD01_CRF_Tbt02_study_id( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_study_id ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_study_id( long value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_study_id = value ;
   }

   public int getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_subject_id ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_subject_id( int value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_subject_id = value ;
   }

   public short getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_crf_id ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_crf_id( short value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_crf_id = value ;
   }

   public byte getgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no = value ;
   }

   public short getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version( short value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version = value ;
   }

   public java.util.Date getgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime( java.util.Date value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime = value ;
   }

   public byte getgxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level( byte value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level = value ;
   }

   public String getgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg( String value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg = value ;
   }

   public java.util.Date getgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime = value ;
   }

   public String getgxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg( String value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg = value ;
   }

   public java.util.Date getgxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime = value ;
   }

   public long getgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt( )
   {
      return gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt( long value )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt = value ;
   }

   public GxObjectCollection getgxTv_SdtB792_SD01_CRF_Crf_results( )
   {
      if ( gxTv_SdtB792_SD01_CRF_Crf_results == null )
      {
         gxTv_SdtB792_SD01_CRF_Crf_results = new GxObjectCollection(SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem.class, "B792_SD02_CRF_RESULT.B792_SD02_CRF_RESULTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtB792_SD01_CRF_Crf_results ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Crf_results( GxObjectCollection value )
   {
      gxTv_SdtB792_SD01_CRF_Crf_results = value ;
   }

   public void setgxTv_SdtB792_SD01_CRF_Crf_results_SetNull( )
   {
      gxTv_SdtB792_SD01_CRF_Crf_results = null ;
   }

   public boolean getgxTv_SdtB792_SD01_CRF_Crf_results_IsNull( )
   {
      if ( gxTv_SdtB792_SD01_CRF_Crf_results == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg = "" ;
      gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg = "" ;
      gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB792_SD01_CRF Clone( )
   {
      return (SdtB792_SD01_CRF)(clone()) ;
   }

   public void setStruct( StructSdtB792_SD01_CRF struct )
   {
      setgxTv_SdtB792_SD01_CRF_Tbt02_study_id(struct.getTbt02_study_id());
      setgxTv_SdtB792_SD01_CRF_Tbt02_subject_id(struct.getTbt02_subject_id());
      setgxTv_SdtB792_SD01_CRF_Tbt02_crf_id(struct.getTbt02_crf_id());
      setgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no(struct.getTbt02_crf_eda_no());
      setgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version(struct.getTbt02_crf_latest_version());
      setgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime(struct.getTbt02_upload_datetime());
      setgxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level(struct.getTbt02_crf_input_level());
      setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg(struct.getTbt02_dm_arrival_flg());
      setgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime(struct.getTbt02_dm_arrival_datetime());
      setgxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg(struct.getTbt02_input_end_flg());
      setgxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime(struct.getTbt02_upd_datetime());
      setgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt(struct.getTbt02_upd_cnt());
      GxObjectCollection gxTv_SdtB792_SD01_CRF_Crf_results_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB792_SD01_CRF_Crf_results_aux1 = new GxObjectCollection();
      gxTv_SdtB792_SD01_CRF_Crf_results_aux1.setStruct(struct.getCrf_results());
      for (int i = 0; i < gxTv_SdtB792_SD01_CRF_Crf_results_aux1.size(); i++)
      {
         gxTv_SdtB792_SD01_CRF_Crf_results_aux.add(new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem((StructSdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)gxTv_SdtB792_SD01_CRF_Crf_results_aux1.elementAt(i)));
      }
      setgxTv_SdtB792_SD01_CRF_Crf_results(gxTv_SdtB792_SD01_CRF_Crf_results_aux);
   }

   public StructSdtB792_SD01_CRF getStruct( )
   {
      StructSdtB792_SD01_CRF struct = new StructSdtB792_SD01_CRF ();
      struct.setTbt02_study_id(getgxTv_SdtB792_SD01_CRF_Tbt02_study_id());
      struct.setTbt02_subject_id(getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id());
      struct.setTbt02_crf_id(getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id());
      struct.setTbt02_crf_eda_no(getgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no());
      struct.setTbt02_crf_latest_version(getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version());
      struct.setTbt02_upload_datetime(getgxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime());
      struct.setTbt02_crf_input_level(getgxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level());
      struct.setTbt02_dm_arrival_flg(getgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg());
      struct.setTbt02_dm_arrival_datetime(getgxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime());
      struct.setTbt02_input_end_flg(getgxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg());
      struct.setTbt02_upd_datetime(getgxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime());
      struct.setTbt02_upd_cnt(getgxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt());
      Vector aux_vectorgxTv_SdtB792_SD01_CRF_Crf_results = getgxTv_SdtB792_SD01_CRF_Crf_results().getStruct();
      Vector aux_vector1gxTv_SdtB792_SD01_CRF_Crf_results = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB792_SD01_CRF_Crf_results.size(); i++)
      {
         aux_vector1gxTv_SdtB792_SD01_CRF_Crf_results.addElement(((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)aux_vectorgxTv_SdtB792_SD01_CRF_Crf_results.elementAt(i)).getStruct());
      }
      struct.setCrf_results(aux_vector1gxTv_SdtB792_SD01_CRF_Crf_results);
      return struct ;
   }

   protected byte gxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no ;
   protected byte gxTv_SdtB792_SD01_CRF_Tbt02_crf_input_level ;
   protected short gxTv_SdtB792_SD01_CRF_Tbt02_crf_id ;
   protected short gxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB792_SD01_CRF_Tbt02_subject_id ;
   protected long gxTv_SdtB792_SD01_CRF_Tbt02_study_id ;
   protected long gxTv_SdtB792_SD01_CRF_Tbt02_upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB792_SD01_CRF_Tbt02_upload_datetime ;
   protected java.util.Date gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_datetime ;
   protected java.util.Date gxTv_SdtB792_SD01_CRF_Tbt02_upd_datetime ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtB792_SD01_CRF_Tbt02_dm_arrival_flg ;
   protected String gxTv_SdtB792_SD01_CRF_Tbt02_input_end_flg ;
   protected GxObjectCollection gxTv_SdtB792_SD01_CRF_Crf_results=null ;
}

