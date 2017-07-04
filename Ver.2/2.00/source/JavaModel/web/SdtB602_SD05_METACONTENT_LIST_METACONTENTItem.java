/*
               File: SdtB602_SD05_METACONTENT_LIST_METACONTENTItem
        Description: B602_SD05_METACONTENT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:57.21
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB602_SD05_METACONTENT_LIST_METACONTENTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD05_METACONTENT_LIST_METACONTENTItem( )
   {
      this(  new ModelContext(SdtB602_SD05_METACONTENT_LIST_METACONTENTItem.class));
   }

   public SdtB602_SD05_METACONTENT_LIST_METACONTENTItem( ModelContext context )
   {
      super( context, "SdtB602_SD05_METACONTENT_LIST_METACONTENTItem");
   }

   public SdtB602_SD05_METACONTENT_LIST_METACONTENTItem( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD05_METACONTENT_LIST_METACONTENTItem");
   }

   public SdtB602_SD05_METACONTENT_LIST_METACONTENTItem( StructSdtB602_SD05_METACONTENT_LIST_METACONTENTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "METADATA_CONTENT_ID") )
            {
               gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONTENT") )
            {
               gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "METADATA_ID") )
            {
               gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "METADATA_NAME") )
            {
               gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name = oReader.getValue() ;
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
         sName = "B602_SD05_METACONTENT_LIST.METACONTENTItem" ;
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
      oWriter.writeElement("METADATA_CONTENT_ID", GXutil.trim( GXutil.str( gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CONTENT", GXutil.rtrim( gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("METADATA_ID", GXutil.trim( GXutil.str( gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("METADATA_NAME", GXutil.rtrim( gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name));
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
      AddObjectProperty("METADATA_CONTENT_ID", gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id, false);
      AddObjectProperty("CONTENT", gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content, false);
      AddObjectProperty("METADATA_ID", gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id, false);
      AddObjectProperty("METADATA_NAME", gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name, false);
   }

   public long getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id( long value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id = value ;
   }

   public String getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content( String value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content = value ;
   }

   public long getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id( long value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id = value ;
   }

   public String getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name( )
   {
      return gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name( String value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content = "" ;
      gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name = "" ;
      sTagName = "" ;
   }

   public SdtB602_SD05_METACONTENT_LIST_METACONTENTItem Clone( )
   {
      return (SdtB602_SD05_METACONTENT_LIST_METACONTENTItem)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD05_METACONTENT_LIST_METACONTENTItem struct )
   {
      setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id(struct.getMetadata_content_id());
      setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content(struct.getContent());
      setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id(struct.getMetadata_id());
      setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name(struct.getMetadata_name());
   }

   public StructSdtB602_SD05_METACONTENT_LIST_METACONTENTItem getStruct( )
   {
      StructSdtB602_SD05_METACONTENT_LIST_METACONTENTItem struct = new StructSdtB602_SD05_METACONTENT_LIST_METACONTENTItem ();
      struct.setMetadata_content_id(getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id());
      struct.setContent(getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content());
      struct.setMetadata_id(getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id());
      struct.setMetadata_name(getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id ;
   protected long gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id ;
   protected String sTagName ;
   protected String gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content ;
   protected String gxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name ;
}

