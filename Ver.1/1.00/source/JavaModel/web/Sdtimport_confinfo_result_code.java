import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class Sdtimport_confinfo_result_code extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtimport_confinfo_result_code( )
   {
      this(  new ModelContext(Sdtimport_confinfo_result_code.class));
   }

   public Sdtimport_confinfo_result_code( ModelContext context )
   {
      super( context, "Sdtimport_confinfo_result_code");
   }

   public Sdtimport_confinfo_result_code( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "Sdtimport_confinfo_result_code");
   }

   public Sdtimport_confinfo_result_code( StructSdtimport_confinfo_result_code struct )
   {
      this();
      setStruct(struct);
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "code") )
            {
               gxTv_Sdtimport_confinfo_result_code_Code = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "error_message") )
            {
               gxTv_Sdtimport_confinfo_result_code_Error_message = oReader.getValue() ;
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
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "import_confinfo.result_code" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "SmartEDC_SHIZUOKA" ;
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
      oWriter.writeElement("code", GXutil.rtrim( gxTv_Sdtimport_confinfo_result_code_Code));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("error_message", GXutil.rtrim( gxTv_Sdtimport_confinfo_result_code_Error_message));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("code", gxTv_Sdtimport_confinfo_result_code_Code);
      AddObjectProperty("error_message", gxTv_Sdtimport_confinfo_result_code_Error_message);
   }

   public String getgxTv_Sdtimport_confinfo_result_code_Code( )
   {
      return gxTv_Sdtimport_confinfo_result_code_Code ;
   }

   public void setgxTv_Sdtimport_confinfo_result_code_Code( String value )
   {
      gxTv_Sdtimport_confinfo_result_code_Code = value ;
   }

   public void setgxTv_Sdtimport_confinfo_result_code_Code_SetNull( )
   {
      gxTv_Sdtimport_confinfo_result_code_Code = "" ;
   }

   public boolean getgxTv_Sdtimport_confinfo_result_code_Code_IsNull( )
   {
      return false ;
   }

   public String getgxTv_Sdtimport_confinfo_result_code_Error_message( )
   {
      return gxTv_Sdtimport_confinfo_result_code_Error_message ;
   }

   public void setgxTv_Sdtimport_confinfo_result_code_Error_message( String value )
   {
      gxTv_Sdtimport_confinfo_result_code_Error_message = value ;
   }

   public void setgxTv_Sdtimport_confinfo_result_code_Error_message_SetNull( )
   {
      gxTv_Sdtimport_confinfo_result_code_Error_message = "" ;
   }

   public boolean getgxTv_Sdtimport_confinfo_result_code_Error_message_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_Sdtimport_confinfo_result_code_Code = "" ;
      gxTv_Sdtimport_confinfo_result_code_Error_message = "" ;
      sTagName = "" ;
   }

   public Sdtimport_confinfo_result_code Clone( )
   {
      return (Sdtimport_confinfo_result_code)(clone()) ;
   }

   public void setStruct( StructSdtimport_confinfo_result_code struct )
   {
      setgxTv_Sdtimport_confinfo_result_code_Code(struct.getCode());
      setgxTv_Sdtimport_confinfo_result_code_Error_message(struct.getError_message());
   }

   public StructSdtimport_confinfo_result_code getStruct( )
   {
      StructSdtimport_confinfo_result_code struct = new StructSdtimport_confinfo_result_code ();
      struct.setCode(getgxTv_Sdtimport_confinfo_result_code_Code());
      struct.setError_message(getgxTv_Sdtimport_confinfo_result_code_Error_message());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_Sdtimport_confinfo_result_code_Code ;
   protected String gxTv_Sdtimport_confinfo_result_code_Error_message ;
}

