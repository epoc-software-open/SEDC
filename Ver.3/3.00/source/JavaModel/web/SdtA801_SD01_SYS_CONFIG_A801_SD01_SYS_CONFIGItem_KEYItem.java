/*
               File: SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem
        Description: A801_SD01_SYS_CONFIG
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:55.26
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem( )
   {
      this(  new ModelContext(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem.class));
   }

   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem( ModelContext context )
   {
      super( context, "SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem");
   }

   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem( int remoteHandle ,
                                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem");
   }

   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem( StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem struct )
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
               gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VALUE") )
            {
               gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value = oReader.getValue() ;
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
         sName = "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem.KEYItem" ;
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
      oWriter.writeElement("NAME", GXutil.rtrim( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VALUE", GXutil.rtrim( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value));
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
      AddObjectProperty("NAME", gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name, false);
      AddObjectProperty("VALUE", gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value, false);
   }

   public String getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name( )
   {
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name( String value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name = value ;
   }

   public String getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value( )
   {
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value( String value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name = "" ;
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value = "" ;
      sTagName = "" ;
   }

   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem Clone( )
   {
      return (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)(clone()) ;
   }

   public void setStruct( StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem struct )
   {
      setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name(struct.getName());
      setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value(struct.getValue());
   }

   public StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem getStruct( )
   {
      StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem struct = new StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem ();
      struct.setName(getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name());
      struct.setValue(getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name ;
   protected String gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value ;
}

