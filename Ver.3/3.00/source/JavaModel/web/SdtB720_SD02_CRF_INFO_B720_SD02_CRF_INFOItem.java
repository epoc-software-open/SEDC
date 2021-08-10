/*
               File: SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem
        Description: B720_SD02_CRF_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.27
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem( )
   {
      this(  new ModelContext(SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem.class));
   }

   public SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem( ModelContext context )
   {
      super( context, "SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem");
   }

   public SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem");
   }

   public SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem( StructSdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT01_SITE_ID") )
            {
               gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT01_SUBJECT_ID") )
            {
               gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_ID") )
            {
               gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_EDA_NO") )
            {
               gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_NAME") )
            {
               gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VISIT_NO") )
            {
               gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no = (int)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B720_SD02_CRF_INFO.B720_SD02_CRF_INFOItem" ;
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
      oWriter.writeElement("TBT01_SITE_ID", GXutil.rtrim( gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT01_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_NAME", GXutil.rtrim( gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no, 6, 0)));
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
      AddObjectProperty("TBT01_SITE_ID", gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id, false);
      AddObjectProperty("TBT01_SUBJECT_ID", gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id, false);
      AddObjectProperty("TBT02_CRF_ID", gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id, false);
      AddObjectProperty("TBT02_CRF_EDA_NO", gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no, false);
      AddObjectProperty("CRF_NAME", gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name, false);
      AddObjectProperty("VISIT_NO", gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no, false);
   }

   public String getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id ;
   }

   public void setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id( String value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id = value ;
   }

   public int getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id ;
   }

   public void setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id( int value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id = value ;
   }

   public short getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id ;
   }

   public void setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id( short value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id = value ;
   }

   public byte getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no ;
   }

   public void setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no = value ;
   }

   public String getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name ;
   }

   public void setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name( String value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name = value ;
   }

   public int getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no( )
   {
      return gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no ;
   }

   public void setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no( int value )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id = "" ;
      gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name = "" ;
      sTagName = "" ;
   }

   public SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem Clone( )
   {
      return (SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)(clone()) ;
   }

   public void setStruct( StructSdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem struct )
   {
      setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id(struct.getTbt01_site_id());
      setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id(struct.getTbt01_subject_id());
      setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id(struct.getTbt02_crf_id());
      setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no(struct.getTbt02_crf_eda_no());
      setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name(struct.getCrf_name());
      setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no(struct.getVisit_no());
   }

   public StructSdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem getStruct( )
   {
      StructSdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem struct = new StructSdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem ();
      struct.setTbt01_site_id(getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id());
      struct.setTbt01_subject_id(getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id());
      struct.setTbt02_crf_id(getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id());
      struct.setTbt02_crf_eda_no(getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no());
      struct.setCrf_name(getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name());
      struct.setVisit_no(getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no());
      return struct ;
   }

   protected byte gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no ;
   protected short gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id ;
   protected int gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no ;
   protected String sTagName ;
   protected String gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id ;
   protected String gxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name ;
}

