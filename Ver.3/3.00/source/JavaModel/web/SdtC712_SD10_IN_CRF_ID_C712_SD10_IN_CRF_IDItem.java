/*
               File: SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem
        Description: C712_SD10_IN_CRF_ID
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem( )
   {
      this(  new ModelContext(SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem.class));
   }

   public SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem( ModelContext context )
   {
      super( context, "SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem");
   }

   public SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem");
   }

   public SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem( StructSdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRFID") )
            {
               gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "C712_SD10_IN_CRF_ID.C712_SD10_IN_CRF_IDItem" ;
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
      oWriter.writeElement("CRFID", GXutil.trim( GXutil.str( gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid, 4, 0)));
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
      AddObjectProperty("CRFID", gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid, false);
   }

   public short getgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid( )
   {
      return gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid ;
   }

   public void setgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid( short value )
   {
      gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem Clone( )
   {
      return (SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)(clone()) ;
   }

   public void setStruct( StructSdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem struct )
   {
      setgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid(struct.getCrfid());
   }

   public StructSdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem getStruct( )
   {
      StructSdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem struct = new StructSdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem ();
      struct.setCrfid(getgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid());
      return struct ;
   }

   protected short gxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
}

