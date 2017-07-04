/*
               File: SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem
        Description: B402_SD07_CRF_VISIT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem( )
   {
      this(  new ModelContext(SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem.class));
   }

   public SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem( ModelContext context )
   {
      super( context, "SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem");
   }

   public SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem");
   }

   public SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem( StructSdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM44_CRF_EDA_NO") )
            {
               gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM44_VISIT_NO") )
            {
               gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no = (int)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B402_SD07_CRF_VISIT.B402_SD07_CRF_VISITItem" ;
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
      oWriter.writeElement("TBM44_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM44_VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no, 6, 0)));
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
      AddObjectProperty("TBM44_CRF_EDA_NO", gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no, false);
      AddObjectProperty("TBM44_VISIT_NO", gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no, false);
   }

   public byte getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no( )
   {
      return gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no ;
   }

   public void setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no( byte value )
   {
      gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no = value ;
   }

   public int getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no( )
   {
      return gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no ;
   }

   public void setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no( int value )
   {
      gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem Clone( )
   {
      return (SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)(clone()) ;
   }

   public void setStruct( StructSdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem struct )
   {
      setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no(struct.getTbm44_crf_eda_no());
      setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no(struct.getTbm44_visit_no());
   }

   public StructSdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem getStruct( )
   {
      StructSdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem struct = new StructSdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem ();
      struct.setTbm44_crf_eda_no(getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no());
      struct.setTbm44_visit_no(getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no());
      return struct ;
   }

   protected byte gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no ;
   protected String sTagName ;
}

