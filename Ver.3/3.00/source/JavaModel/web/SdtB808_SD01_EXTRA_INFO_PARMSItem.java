/*
               File: SdtB808_SD01_EXTRA_INFO_PARMSItem
        Description: B808_SD01_EXTRA_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:46.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB808_SD01_EXTRA_INFO_PARMSItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB808_SD01_EXTRA_INFO_PARMSItem( )
   {
      this(  new ModelContext(SdtB808_SD01_EXTRA_INFO_PARMSItem.class));
   }

   public SdtB808_SD01_EXTRA_INFO_PARMSItem( ModelContext context )
   {
      super( context, "SdtB808_SD01_EXTRA_INFO_PARMSItem");
   }

   public SdtB808_SD01_EXTRA_INFO_PARMSItem( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtB808_SD01_EXTRA_INFO_PARMSItem");
   }

   public SdtB808_SD01_EXTRA_INFO_PARMSItem( StructSdtB808_SD01_EXTRA_INFO_PARMSItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NAME") )
            {
               gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VALUE") )
            {
               gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value = oReader.getValue() ;
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
         sName = "B808_SD01_EXTRA_INFO.PARMSItem" ;
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
      oWriter.writeElement("NAME", GXutil.rtrim( gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VALUE", GXutil.rtrim( gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value));
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
      AddObjectProperty("NAME", gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name, false);
      AddObjectProperty("VALUE", gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value, false);
   }

   public String getgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( )
   {
      return gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( String value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name = value ;
   }

   public String getgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( )
   {
      return gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( String value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name = "" ;
      gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value = "" ;
      sTagName = "" ;
   }

   public SdtB808_SD01_EXTRA_INFO_PARMSItem Clone( )
   {
      return (SdtB808_SD01_EXTRA_INFO_PARMSItem)(clone()) ;
   }

   public void setStruct( StructSdtB808_SD01_EXTRA_INFO_PARMSItem struct )
   {
      setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name(struct.getName());
      setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value(struct.getValue());
   }

   public StructSdtB808_SD01_EXTRA_INFO_PARMSItem getStruct( )
   {
      StructSdtB808_SD01_EXTRA_INFO_PARMSItem struct = new StructSdtB808_SD01_EXTRA_INFO_PARMSItem ();
      struct.setName(getgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name());
      struct.setValue(getgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name ;
   protected String gxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value ;
}

