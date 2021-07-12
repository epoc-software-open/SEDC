/*
               File: SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem
        Description: B712_SD11_SUBJECT_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.15
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem( )
   {
      this(  new ModelContext(SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem.class));
   }

   public SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem( ModelContext context )
   {
      super( context, "SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem");
   }

   public SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem");
   }

   public SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem( StructSdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "B712_SUBJECT_ID") )
            {
               gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "B712_SD03_JSON") )
            {
               gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json = oReader.getValue() ;
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
         sName = "B712_SD11_SUBJECT_CRF.B712_SD11_SUBJECT_CRFItem" ;
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
      oWriter.writeElement("B712_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("B712_SD03_JSON", GXutil.rtrim( gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json));
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
      AddObjectProperty("B712_SUBJECT_ID", gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id, false);
      AddObjectProperty("B712_SD03_JSON", gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json, false);
   }

   public int getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id( )
   {
      return gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id ;
   }

   public void setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id( int value )
   {
      gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id = value ;
   }

   public String getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json( )
   {
      return gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json ;
   }

   public void setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json( String value )
   {
      gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json = "" ;
      sTagName = "" ;
   }

   public SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem Clone( )
   {
      return (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem struct )
   {
      setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id(struct.getB712_subject_id());
      setgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json(struct.getB712_sd03_json());
   }

   public StructSdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem getStruct( )
   {
      StructSdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem struct = new StructSdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem ();
      struct.setB712_subject_id(getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id());
      struct.setB712_sd03_json(getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id ;
   protected String sTagName ;
   protected String gxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json ;
}

