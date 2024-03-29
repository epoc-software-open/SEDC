import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

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
         sName = "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem.KEYItem" ;
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
      oWriter.writeElement("NAME", GXutil.rtrim( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("VALUE", GXutil.rtrim( gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("NAME", gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name);
      AddObjectProperty("VALUE", gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value);
   }

   public String getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name( )
   {
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name( String value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name = value ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name_SetNull( )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name = "" ;
   }

   public boolean getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value( )
   {
      return gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value( String value )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value = value ;
   }

   public void setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value_SetNull( )
   {
      gxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value = "" ;
   }

   public boolean getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value_IsNull( )
   {
      return false ;
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

