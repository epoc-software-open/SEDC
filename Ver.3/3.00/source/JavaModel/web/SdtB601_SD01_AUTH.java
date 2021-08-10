/*
               File: SdtB601_SD01_AUTH
        Description: B601_SD01_AUTH
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.75
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB601_SD01_AUTH extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB601_SD01_AUTH( )
   {
      this(  new ModelContext(SdtB601_SD01_AUTH.class));
   }

   public SdtB601_SD01_AUTH( ModelContext context )
   {
      super( context, "SdtB601_SD01_AUTH");
   }

   public SdtB601_SD01_AUTH( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle, context, "SdtB601_SD01_AUTH");
   }

   public SdtB601_SD01_AUTH( StructSdtB601_SD01_AUTH struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AUTH_RESULT") )
            {
               gxTv_SdtB601_SD01_AUTH_Auth_result = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HANDLE") )
            {
               gxTv_SdtB601_SD01_AUTH_Handle = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ROLE_AUTHORITY_ID") )
            {
               gxTv_SdtB601_SD01_AUTH_Role_authority_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BELONG") )
            {
               gxTv_SdtB601_SD01_AUTH_Belong = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EMAIL") )
            {
               gxTv_SdtB601_SD01_AUTH_Email = oReader.getValue() ;
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
         sName = "B601_SD01_AUTH" ;
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
      oWriter.writeElement("AUTH_RESULT", GXutil.trim( GXutil.str( gxTv_SdtB601_SD01_AUTH_Auth_result, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("HANDLE", GXutil.rtrim( gxTv_SdtB601_SD01_AUTH_Handle));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ROLE_AUTHORITY_ID", GXutil.trim( GXutil.str( gxTv_SdtB601_SD01_AUTH_Role_authority_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("BELONG", GXutil.rtrim( gxTv_SdtB601_SD01_AUTH_Belong));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("EMAIL", GXutil.rtrim( gxTv_SdtB601_SD01_AUTH_Email));
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
      AddObjectProperty("AUTH_RESULT", gxTv_SdtB601_SD01_AUTH_Auth_result, false);
      AddObjectProperty("HANDLE", gxTv_SdtB601_SD01_AUTH_Handle, false);
      AddObjectProperty("ROLE_AUTHORITY_ID", gxTv_SdtB601_SD01_AUTH_Role_authority_id, false);
      AddObjectProperty("BELONG", gxTv_SdtB601_SD01_AUTH_Belong, false);
      AddObjectProperty("EMAIL", gxTv_SdtB601_SD01_AUTH_Email, false);
   }

   public byte getgxTv_SdtB601_SD01_AUTH_Auth_result( )
   {
      return gxTv_SdtB601_SD01_AUTH_Auth_result ;
   }

   public void setgxTv_SdtB601_SD01_AUTH_Auth_result( byte value )
   {
      gxTv_SdtB601_SD01_AUTH_Auth_result = value ;
   }

   public String getgxTv_SdtB601_SD01_AUTH_Handle( )
   {
      return gxTv_SdtB601_SD01_AUTH_Handle ;
   }

   public void setgxTv_SdtB601_SD01_AUTH_Handle( String value )
   {
      gxTv_SdtB601_SD01_AUTH_Handle = value ;
   }

   public long getgxTv_SdtB601_SD01_AUTH_Role_authority_id( )
   {
      return gxTv_SdtB601_SD01_AUTH_Role_authority_id ;
   }

   public void setgxTv_SdtB601_SD01_AUTH_Role_authority_id( long value )
   {
      gxTv_SdtB601_SD01_AUTH_Role_authority_id = value ;
   }

   public String getgxTv_SdtB601_SD01_AUTH_Belong( )
   {
      return gxTv_SdtB601_SD01_AUTH_Belong ;
   }

   public void setgxTv_SdtB601_SD01_AUTH_Belong( String value )
   {
      gxTv_SdtB601_SD01_AUTH_Belong = value ;
   }

   public String getgxTv_SdtB601_SD01_AUTH_Email( )
   {
      return gxTv_SdtB601_SD01_AUTH_Email ;
   }

   public void setgxTv_SdtB601_SD01_AUTH_Email( String value )
   {
      gxTv_SdtB601_SD01_AUTH_Email = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB601_SD01_AUTH_Handle = "" ;
      gxTv_SdtB601_SD01_AUTH_Belong = "" ;
      gxTv_SdtB601_SD01_AUTH_Email = "" ;
      sTagName = "" ;
   }

   public SdtB601_SD01_AUTH Clone( )
   {
      return (SdtB601_SD01_AUTH)(clone()) ;
   }

   public void setStruct( StructSdtB601_SD01_AUTH struct )
   {
      setgxTv_SdtB601_SD01_AUTH_Auth_result(struct.getAuth_result());
      setgxTv_SdtB601_SD01_AUTH_Handle(struct.getHandle());
      setgxTv_SdtB601_SD01_AUTH_Role_authority_id(struct.getRole_authority_id());
      setgxTv_SdtB601_SD01_AUTH_Belong(struct.getBelong());
      setgxTv_SdtB601_SD01_AUTH_Email(struct.getEmail());
   }

   public StructSdtB601_SD01_AUTH getStruct( )
   {
      StructSdtB601_SD01_AUTH struct = new StructSdtB601_SD01_AUTH ();
      struct.setAuth_result(getgxTv_SdtB601_SD01_AUTH_Auth_result());
      struct.setHandle(getgxTv_SdtB601_SD01_AUTH_Handle());
      struct.setRole_authority_id(getgxTv_SdtB601_SD01_AUTH_Role_authority_id());
      struct.setBelong(getgxTv_SdtB601_SD01_AUTH_Belong());
      struct.setEmail(getgxTv_SdtB601_SD01_AUTH_Email());
      return struct ;
   }

   protected byte gxTv_SdtB601_SD01_AUTH_Auth_result ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB601_SD01_AUTH_Role_authority_id ;
   protected String sTagName ;
   protected String gxTv_SdtB601_SD01_AUTH_Handle ;
   protected String gxTv_SdtB601_SD01_AUTH_Belong ;
   protected String gxTv_SdtB601_SD01_AUTH_Email ;
}

