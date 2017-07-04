/*
               File: SdtB712_SD09_CRF_ADD
        Description: B712_SD09_CRF_ADD
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.72
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB712_SD09_CRF_ADD extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD09_CRF_ADD( )
   {
      this(  new ModelContext(SdtB712_SD09_CRF_ADD.class));
   }

   public SdtB712_SD09_CRF_ADD( ModelContext context )
   {
      super( context, "SdtB712_SD09_CRF_ADD");
   }

   public SdtB712_SD09_CRF_ADD( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD09_CRF_ADD");
   }

   public SdtB712_SD09_CRF_ADD( StructSdtB712_SD09_CRF_ADD struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SUBJECT_ID") )
            {
               gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_ID") )
            {
               gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_EDA_NO") )
            {
               gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B712_SD09_CRF_ADD" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "tablet-EDC_GXXEV3U3" ;
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
      oWriter.writeElement("TBT02_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no, 2, 0)));
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
      AddObjectProperty("TBT02_SUBJECT_ID", gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id, false);
      AddObjectProperty("TBT02_CRF_ID", gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id, false);
      AddObjectProperty("TBT02_CRF_EDA_NO", gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no, false);
   }

   public int getgxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id( )
   {
      return gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id ;
   }

   public void setgxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id( int value )
   {
      gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id = value ;
   }

   public short getgxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id( )
   {
      return gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id ;
   }

   public void setgxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id( short value )
   {
      gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id = value ;
   }

   public byte getgxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no( )
   {
      return gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no ;
   }

   public void setgxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public SdtB712_SD09_CRF_ADD Clone( )
   {
      return (SdtB712_SD09_CRF_ADD)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD09_CRF_ADD struct )
   {
      setgxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id(struct.getTbt02_subject_id());
      setgxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id(struct.getTbt02_crf_id());
      setgxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no(struct.getTbt02_crf_eda_no());
   }

   public StructSdtB712_SD09_CRF_ADD getStruct( )
   {
      StructSdtB712_SD09_CRF_ADD struct = new StructSdtB712_SD09_CRF_ADD ();
      struct.setTbt02_subject_id(getgxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id());
      struct.setTbt02_crf_id(getgxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id());
      struct.setTbt02_crf_eda_no(getgxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no());
      return struct ;
   }

   protected byte gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_eda_no ;
   protected short gxTv_SdtB712_SD09_CRF_ADD_Tbt02_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id ;
   protected String sTagName ;
}

