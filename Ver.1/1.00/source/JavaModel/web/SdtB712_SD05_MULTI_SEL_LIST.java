import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB712_SD05_MULTI_SEL_LIST extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD05_MULTI_SEL_LIST( )
   {
      this(  new ModelContext(SdtB712_SD05_MULTI_SEL_LIST.class));
   }

   public SdtB712_SD05_MULTI_SEL_LIST( ModelContext context )
   {
      super( context, "SdtB712_SD05_MULTI_SEL_LIST");
   }

   public SdtB712_SD05_MULTI_SEL_LIST( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD05_MULTI_SEL_LIST");
   }

   public SdtB712_SD05_MULTI_SEL_LIST( StructSdtB712_SD05_MULTI_SEL_LIST struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SELECT_CODE") )
            {
               if ( gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code == null )
               {
                  gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code = new GxObjectCollection(String.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code.readxmlcollection(oReader, "SELECT_CODE", "Item") ;
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
         sName = "B712_SD05_MULTI_SEL_LIST" ;
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
      if ( gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code != null )
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
         gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code.writexmlcollection(oWriter, "SELECT_CODE", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      if ( gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code != null )
      {
         AddObjectProperty("SELECT_CODE", gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code);
      }
   }

   public GxObjectCollection getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code( )
   {
      if ( gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code == null )
      {
         gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code = new GxObjectCollection(String.class, "internal", "");
      }
      return gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ;
   }

   public void setgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code( GxObjectCollection value )
   {
      gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code = value ;
   }

   public void setgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_SetNull( )
   {
      gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code = null ;
   }

   public boolean getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_IsNull( )
   {
      if ( gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code == null )
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
      sTagName = "" ;
   }

   public SdtB712_SD05_MULTI_SEL_LIST Clone( )
   {
      return (SdtB712_SD05_MULTI_SEL_LIST)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD05_MULTI_SEL_LIST struct )
   {
      setgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code(new GxObjectCollection(String.class, "internal", "", struct.getSelect_code()));
   }

   public StructSdtB712_SD05_MULTI_SEL_LIST getStruct( )
   {
      StructSdtB712_SD05_MULTI_SEL_LIST struct = new StructSdtB712_SD05_MULTI_SEL_LIST ();
      struct.setSelect_code(getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected GxObjectCollection gxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code=null ;
}

