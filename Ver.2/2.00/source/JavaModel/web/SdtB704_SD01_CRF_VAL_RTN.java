/*
               File: SdtB704_SD01_CRF_VAL_RTN
        Description: B704_SD01_CRF_VAL_RTN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:57.79
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB704_SD01_CRF_VAL_RTN extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB704_SD01_CRF_VAL_RTN( )
   {
      this(  new ModelContext(SdtB704_SD01_CRF_VAL_RTN.class));
   }

   public SdtB704_SD01_CRF_VAL_RTN( ModelContext context )
   {
      super( context, "SdtB704_SD01_CRF_VAL_RTN");
   }

   public SdtB704_SD01_CRF_VAL_RTN( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtB704_SD01_CRF_VAL_RTN");
   }

   public SdtB704_SD01_CRF_VAL_RTN( StructSdtB704_SD01_CRF_VAL_RTN struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT_CD") )
            {
               gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_MSG") )
            {
               gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg = oReader.getValue() ;
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
         sName = "B704_SD01_CRF_VAL_RTN" ;
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
      oWriter.writeElement("RESULT_CD", GXutil.rtrim( gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ERR_MSG", GXutil.rtrim( gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg));
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
      AddObjectProperty("RESULT_CD", gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd, false);
      AddObjectProperty("ERR_MSG", gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg, false);
   }

   public String getgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( )
   {
      return gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd ;
   }

   public void setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( String value )
   {
      gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd = value ;
   }

   public String getgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( )
   {
      return gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg ;
   }

   public void setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( String value )
   {
      gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd = "" ;
      gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg = "" ;
      sTagName = "" ;
   }

   public SdtB704_SD01_CRF_VAL_RTN Clone( )
   {
      return (SdtB704_SD01_CRF_VAL_RTN)(clone()) ;
   }

   public void setStruct( StructSdtB704_SD01_CRF_VAL_RTN struct )
   {
      setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd(struct.getResult_cd());
      setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg(struct.getErr_msg());
   }

   public StructSdtB704_SD01_CRF_VAL_RTN getStruct( )
   {
      StructSdtB704_SD01_CRF_VAL_RTN struct = new StructSdtB704_SD01_CRF_VAL_RTN ();
      struct.setResult_cd(getgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd());
      struct.setErr_msg(getgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd ;
   protected String gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg ;
}

