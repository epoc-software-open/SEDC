/*
               File: SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem
        Description: B792_SD03_OL_DISP_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

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
         sName = "B792_SD03_OL_DISP_INFO.B792_SD03_OL_DISP_INFOItem" ;
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
      AddObjectProperty("OL_DISP_ITEM_KBN", gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn, false);
   }

   public String getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn( )
   {
      return gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn ;
   }

   public void setgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn( String value )
   {
      gxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn = value ;
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

