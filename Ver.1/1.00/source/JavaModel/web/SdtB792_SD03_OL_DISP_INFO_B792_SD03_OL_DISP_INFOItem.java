import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem( )
   {
      this(  new ModelContext(SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem.class));
   }

   public SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem( ModelContext context )
   {
      super( context, "SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem");
   }

   public SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem");
   }

   public SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem( StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "OL_DISP_ITEM_KBN") )
            {
               gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn = oReader.getValue() ;
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
         sName = "B792_SD03_OL_DISP_INFO.B792_SD03_OL_DISP_INFOItem" ;
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
      oWriter.writeElement("OL_DISP_ITEM_KBN", GXutil.rtrim( gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("OL_DISP_ITEM_KBN", gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn);
   }

   public String getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn( )
   {
      return gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn ;
   }

   public void setgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn( String value )
   {
      gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn = value ;
   }

   public void setgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn_SetNull( )
   {
      gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn = "" ;
   }

   public boolean getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn = "" ;
      sTagName = "" ;
   }

   public SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem Clone( )
   {
      return (SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem)(clone()) ;
   }

   public void setStruct( StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem struct )
   {
      setgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(struct.getOl_disp_item_kbn());
   }

   public StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem getStruct( )
   {
      StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem struct = new StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem ();
      struct.setOl_disp_item_kbn(getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn ;
}

