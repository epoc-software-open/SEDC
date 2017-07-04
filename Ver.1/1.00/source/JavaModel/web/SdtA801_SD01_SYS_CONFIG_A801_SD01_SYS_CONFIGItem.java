import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

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
                  gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem.KEYItem", "SmartEDC_SHIZUOKA", remoteHandle);
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
         sName = "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem" ;
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
      oWriter.writeElement("SECTION", GXutil.rtrim( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "SmartEDC_SHIZUOKA" ;
         }
         else
         {
            sNameSpace1 = "SmartEDC_SHIZUOKA" ;
         }
         gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key.writexmlcollection(oWriter, "KEY", sNameSpace1, "KEYItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("SECTION", gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section);
      if ( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key != null )
      {
         AddObjectProperty("KEY", gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key);
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

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section_SetNull( )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section = "" ;
   }

   public boolean getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section_IsNull( )
   {
      return false ;
   }

   public GxObjectCollection getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key( )
   {
      if ( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key == null )
      {
         gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem.KEYItem", "SmartEDC_SHIZUOKA", remoteHandle);
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
      setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key(new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem.KEYItem", "SmartEDC_SHIZUOKA", struct.getKey(), remoteHandle));
   }

   public StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem getStruct( )
   {
      StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem struct = new StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem ();
      struct.setSection(getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section());
      struct.setKey(getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section ;
   protected GxObjectCollection gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key=null ;
}

