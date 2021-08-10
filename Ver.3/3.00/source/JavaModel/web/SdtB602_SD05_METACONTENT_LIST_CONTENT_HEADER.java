/*
               File: SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER
        Description: B602_SD05_METACONTENT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER( )
   {
      this(  new ModelContext(SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER.class));
   }

   public SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER( ModelContext context )
   {
      super( context, "SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER");
   }

   public SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER");
   }

   public SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER( StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "HOSPITAL") )
            {
               gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONTENT_NO") )
            {
               gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no = GXutil.lval( oReader.getValue()) ;
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
         sName = "B602_SD05_METACONTENT_LIST.CONTENT_HEADER" ;
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
      oWriter.writeElement("HOSPITAL", GXutil.rtrim( gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CONTENT_NO", GXutil.trim( GXutil.str( gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no, 10, 0)));
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
      AddObjectProperty("HOSPITAL", gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital, false);
      AddObjectProperty("CONTENT_NO", gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no, false);
   }

   public String getgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital( String value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital = value ;
   }

   public long getgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no( long value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital = "" ;
      sTagName = "" ;
   }

   public SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER Clone( )
   {
      return (SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER struct )
   {
      setgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital(struct.getHospital());
      setgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no(struct.getContent_no());
   }

   public StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER getStruct( )
   {
      StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER struct = new StructSdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER ();
      struct.setHospital(getgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital());
      struct.setContent_no(getgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no ;
   protected String sTagName ;
   protected String gxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital ;
}

