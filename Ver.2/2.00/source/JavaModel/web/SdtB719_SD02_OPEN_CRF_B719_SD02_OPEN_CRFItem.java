/*
               File: SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem
        Description: B719_SD02_OPEN_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:59.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( )
   {
      this(  new ModelContext(SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem.class));
   }

   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( ModelContext context )
   {
      super( context, "SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem");
   }

   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem");
   }

   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SUBJECT_ID") )
            {
               gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ID") )
            {
               gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_EDA_NO") )
            {
               gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SITE_ID") )
            {
               gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = oReader.getValue() ;
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
         sName = "B719_SD02_OPEN_CRF.B719_SD02_OPEN_CRFItem" ;
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
      oWriter.writeElement("SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("SITE_ID", GXutil.rtrim( gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id));
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
      AddObjectProperty("SUBJECT_ID", gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id, false);
      AddObjectProperty("CRF_ID", gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id, false);
      AddObjectProperty("CRF_EDA_NO", gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no, false);
      AddObjectProperty("SITE_ID", gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id, false);
   }

   public int getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id( int value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id = value ;
   }

   public short getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id( short value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id = value ;
   }

   public byte getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no( byte value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no = value ;
   }

   public String getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id( String value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = "" ;
      sTagName = "" ;
   }

   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem Clone( )
   {
      return (SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)(clone()) ;
   }

   public void setStruct( StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem struct )
   {
      setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id(struct.getSubject_id());
      setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id(struct.getCrf_id());
      setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no(struct.getCrf_eda_no());
      setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id(struct.getSite_id());
   }

   public StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem getStruct( )
   {
      StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem struct = new StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem ();
      struct.setSubject_id(getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id());
      struct.setCrf_id(getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id());
      struct.setCrf_eda_no(getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no());
      struct.setSite_id(getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id());
      return struct ;
   }

   protected byte gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_eda_no ;
   protected short gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id ;
   protected String sTagName ;
   protected String gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id ;
}

