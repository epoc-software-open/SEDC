/*
               File: SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem
        Description: A801_SD01_SYS_CONFIG
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem( )
   {
      this(  new ModelContext(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class));
   }

   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem( ModelContext context )
   {
      super( context, "SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem");
   }

   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem");
   }

   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem( StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SECTION") )
            {
               gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KEY") )
            {
               if ( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key == null )
               {
                  gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem.KEYItem", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key.readxmlcollection(oReader, "KEY", "KEYItem") ;
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
         sName = "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem" ;
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
      oWriter.writeElement("SECTION", GXutil.rtrim( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key != null )
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
         gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key.writexmlcollection(oWriter, "KEY", sNameSpace1, "KEYItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("SECTION", gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section, false);
      if ( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key != null )
      {
         AddObjectProperty("KEY", gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key, false);
      }
   }

   public String getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section( )
   {
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section( String value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section = value ;
   }

   public GxObjectCollection getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key( )
   {
      if ( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key == null )
      {
         gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem.KEYItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key( GxObjectCollection value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = value ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_SetNull( )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = null ;
   }

   public boolean getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_IsNull( )
   {
      if ( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key == null )
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
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section = "" ;
      sTagName = "" ;
   }

   public SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem Clone( )
   {
      return (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem)(clone()) ;
   }

   public void setStruct( StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem struct )
   {
      setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section(struct.getSection());
      GxObjectCollection gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_aux1 = new GxObjectCollection();
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_aux1.setStruct(struct.getKey());
      for (int i = 0; i < gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_aux1.size(); i++)
      {
         gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_aux.add(new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem((StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_aux1.elementAt(i)));
      }
      setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key(gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key_aux);
   }

   public StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem getStruct( )
   {
      StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem struct = new StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem ();
      struct.setSection(getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section());
      Vector aux_vectorgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().getStruct();
      Vector aux_vector1gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key.size(); i++)
      {
         aux_vector1gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key.addElement(((SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)aux_vectorgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key.elementAt(i)).getStruct());
      }
      struct.setKey(aux_vector1gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section ;
   protected GxObjectCollection gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key=null ;
}

