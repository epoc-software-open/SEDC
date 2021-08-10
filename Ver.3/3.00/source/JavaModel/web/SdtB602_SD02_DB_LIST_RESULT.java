/*
               File: SdtB602_SD02_DB_LIST_RESULT
        Description: B602_SD02_DB_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB602_SD02_DB_LIST_RESULT extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD02_DB_LIST_RESULT( )
   {
      this(  new ModelContext(SdtB602_SD02_DB_LIST_RESULT.class));
   }

   public SdtB602_SD02_DB_LIST_RESULT( ModelContext context )
   {
      super( context, "SdtB602_SD02_DB_LIST_RESULT");
   }

   public SdtB602_SD02_DB_LIST_RESULT( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD02_DB_LIST_RESULT");
   }

   public SdtB602_SD02_DB_LIST_RESULT( StructSdtB602_SD02_DB_LIST_RESULT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CODE") )
            {
               gxTv_SdtB602_SD02_DB_LIST_RESULT_Code = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_MSG") )
            {
               gxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg = oReader.getValue() ;
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
         sName = "B602_SD02_DB_LIST.RESULT" ;
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
      oWriter.writeElement("CODE", GXutil.trim( GXutil.str( gxTv_SdtB602_SD02_DB_LIST_RESULT_Code, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ERR_MSG", GXutil.rtrim( gxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg));
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
      AddObjectProperty("CODE", gxTv_SdtB602_SD02_DB_LIST_RESULT_Code, false);
      AddObjectProperty("ERR_MSG", gxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg, false);
   }

   public byte getgxTv_SdtB602_SD02_DB_LIST_RESULT_Code( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_RESULT_Code ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_RESULT_Code( byte value )
   {
      gxTv_SdtB602_SD02_DB_LIST_RESULT_Code = value ;
   }

   public String getgxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg( String value )
   {
      gxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg = "" ;
      sTagName = "" ;
   }

   public SdtB602_SD02_DB_LIST_RESULT Clone( )
   {
      return (SdtB602_SD02_DB_LIST_RESULT)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD02_DB_LIST_RESULT struct )
   {
      setgxTv_SdtB602_SD02_DB_LIST_RESULT_Code(struct.getCode());
      setgxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg(struct.getErr_msg());
   }

   public StructSdtB602_SD02_DB_LIST_RESULT getStruct( )
   {
      StructSdtB602_SD02_DB_LIST_RESULT struct = new StructSdtB602_SD02_DB_LIST_RESULT ();
      struct.setCode(getgxTv_SdtB602_SD02_DB_LIST_RESULT_Code());
      struct.setErr_msg(getgxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg());
      return struct ;
   }

   protected byte gxTv_SdtB602_SD02_DB_LIST_RESULT_Code ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg ;
}

