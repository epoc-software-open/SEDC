/*
               File: SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem
        Description: B717_SD01_REKIINFO_CRF_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:45.70
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem( )
   {
      this(  new ModelContext(SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem.class));
   }

   public SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem( ModelContext context )
   {
      super( context, "SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem");
   }

   public SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem( int remoteHandle ,
                                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem");
   }

   public SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem( StructSdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_CRF_VERSION") )
            {
               gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DM_ARRIVAL") )
            {
               gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INPUT_END") )
            {
               gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end = oReader.getValue() ;
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
                  gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPLOAD_DATETIME_VC") )
            {
               gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_NM") )
            {
               gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_UPD_RIYU") )
            {
               gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_SIGNATURE_FLG") )
            {
               gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT11_SIGNATURE_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SIGNATURE_USER_NM") )
            {
               gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm = oReader.getValue() ;
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
         sName = "B717_SD01_REKIINFO_CRF_LIST.B717_SD01_REKIINFO_CRF_LISTItem" ;
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
      oWriter.writeElement("TBT11_CRF_VERSION", GXutil.trim( GXutil.str( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DM_ARRIVAL", GXutil.rtrim( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("INPUT_END", GXutil.rtrim( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime) )
      {
         oWriter.writeStartElement("TBT11_UPLOAD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT11_UPLOAD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT11_UPLOAD_DATETIME_VC", GXutil.rtrim( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM07_USER_NM", GXutil.rtrim( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_UPD_RIYU", GXutil.rtrim( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT11_SIGNATURE_FLG", GXutil.rtrim( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime) )
      {
         oWriter.writeStartElement("TBT11_SIGNATURE_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT11_SIGNATURE_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("SIGNATURE_USER_NM", GXutil.rtrim( gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("TBT11_CRF_VERSION", gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version, false);
      AddObjectProperty("DM_ARRIVAL", gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival, false);
      AddObjectProperty("INPUT_END", gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end, false);
      datetime_STZ = gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime ;
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
      AddObjectProperty("TBT11_UPLOAD_DATETIME_VC", gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc, false);
      AddObjectProperty("TAM07_USER_NM", gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm, false);
      AddObjectProperty("TBT11_UPD_RIYU", gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu, false);
      AddObjectProperty("TBT11_SIGNATURE_FLG", gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg, false);
      datetime_STZ = gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime ;
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
      AddObjectProperty("TBT11_SIGNATURE_DATETIME", sDateCnv, false);
      AddObjectProperty("SIGNATURE_USER_NM", gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm, false);
   }

   public short getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( short value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version = value ;
   }

   public String getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival = value ;
   }

   public String getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end = value ;
   }

   public java.util.Date getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime( java.util.Date value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime = value ;
   }

   public String getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc = value ;
   }

   public String getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm = value ;
   }

   public String getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu = value ;
   }

   public String getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg = value ;
   }

   public java.util.Date getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime( java.util.Date value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime = value ;
   }

   public String getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm( )
   {
      return gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm ;
   }

   public void setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm( String value )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg = "" ;
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem Clone( )
   {
      return (SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem struct )
   {
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version(struct.getTbt11_crf_version());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival(struct.getDm_arrival());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end(struct.getInput_end());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime(struct.getTbt11_upload_datetime());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc(struct.getTbt11_upload_datetime_vc());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm(struct.getTam07_user_nm());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu(struct.getTbt11_upd_riyu());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg(struct.getTbt11_signature_flg());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime(struct.getTbt11_signature_datetime());
      setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm(struct.getSignature_user_nm());
   }

   public StructSdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem getStruct( )
   {
      StructSdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem struct = new StructSdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem ();
      struct.setTbt11_crf_version(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version());
      struct.setDm_arrival(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival());
      struct.setInput_end(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end());
      struct.setTbt11_upload_datetime(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime());
      struct.setTbt11_upload_datetime_vc(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc());
      struct.setTam07_user_nm(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm());
      struct.setTbt11_upd_riyu(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu());
      struct.setTbt11_signature_flg(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg());
      struct.setTbt11_signature_datetime(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime());
      struct.setSignature_user_nm(getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm());
      return struct ;
   }

   protected short gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime ;
   protected java.util.Date gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg ;
   protected String gxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm ;
}

