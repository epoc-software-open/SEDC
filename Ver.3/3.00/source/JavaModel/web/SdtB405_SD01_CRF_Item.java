/*
               File: SdtB405_SD01_CRF_Item
        Description: B405_SD01
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB405_SD01_CRF_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB405_SD01_CRF_Item( )
   {
      this(  new ModelContext(SdtB405_SD01_CRF_Item.class));
   }

   public SdtB405_SD01_CRF_Item( ModelContext context )
   {
      super( context, "SdtB405_SD01_CRF_Item");
   }

   public SdtB405_SD01_CRF_Item( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtB405_SD01_CRF_Item");
   }

   public SdtB405_SD01_CRF_Item( StructSdtB405_SD01_CRF_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "STATUS") )
            {
               gxTv_SdtB405_SD01_CRF_Item_Status = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "STATUS_N") )
            {
               gxTv_SdtB405_SD01_CRF_Item_Status_n = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_ID") )
            {
               gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_LATEST_VERSION") )
            {
               gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B405_SD01.CRF_Item" ;
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
      oWriter.writeElement("STATUS", GXutil.rtrim( gxTv_SdtB405_SD01_CRF_Item_Status));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("STATUS_N", GXutil.trim( GXutil.str( gxTv_SdtB405_SD01_CRF_Item_Status_n, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_LATEST_VERSION", GXutil.trim( GXutil.str( gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version, 4, 0)));
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
      AddObjectProperty("STATUS", gxTv_SdtB405_SD01_CRF_Item_Status, false);
      AddObjectProperty("STATUS_N", gxTv_SdtB405_SD01_CRF_Item_Status_n, false);
      AddObjectProperty("TBT02_CRF_ID", gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id, false);
      AddObjectProperty("TBT02_CRF_LATEST_VERSION", gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version, false);
   }

   public String getgxTv_SdtB405_SD01_CRF_Item_Status( )
   {
      return gxTv_SdtB405_SD01_CRF_Item_Status ;
   }

   public void setgxTv_SdtB405_SD01_CRF_Item_Status( String value )
   {
      gxTv_SdtB405_SD01_CRF_Item_Status = value ;
   }

   public byte getgxTv_SdtB405_SD01_CRF_Item_Status_n( )
   {
      return gxTv_SdtB405_SD01_CRF_Item_Status_n ;
   }

   public void setgxTv_SdtB405_SD01_CRF_Item_Status_n( byte value )
   {
      gxTv_SdtB405_SD01_CRF_Item_Status_n = value ;
   }

   public short getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id( )
   {
      return gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id ;
   }

   public void setgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id( short value )
   {
      gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id = value ;
   }

   public short getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version( )
   {
      return gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version ;
   }

   public void setgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version( short value )
   {
      gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB405_SD01_CRF_Item_Status = "" ;
      sTagName = "" ;
   }

   public SdtB405_SD01_CRF_Item Clone( )
   {
      return (SdtB405_SD01_CRF_Item)(clone()) ;
   }

   public void setStruct( StructSdtB405_SD01_CRF_Item struct )
   {
      setgxTv_SdtB405_SD01_CRF_Item_Status(struct.getStatus());
      setgxTv_SdtB405_SD01_CRF_Item_Status_n(struct.getStatus_n());
      setgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id(struct.getTbt02_crf_id());
      setgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version(struct.getTbt02_crf_latest_version());
   }

   public StructSdtB405_SD01_CRF_Item getStruct( )
   {
      StructSdtB405_SD01_CRF_Item struct = new StructSdtB405_SD01_CRF_Item ();
      struct.setStatus(getgxTv_SdtB405_SD01_CRF_Item_Status());
      struct.setStatus_n(getgxTv_SdtB405_SD01_CRF_Item_Status_n());
      struct.setTbt02_crf_id(getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id());
      struct.setTbt02_crf_latest_version(getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version());
      return struct ;
   }

   protected byte gxTv_SdtB405_SD01_CRF_Item_Status_n ;
   protected short gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id ;
   protected short gxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB405_SD01_CRF_Item_Status ;
}

