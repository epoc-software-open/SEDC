/*
               File: SdtB602_SD01_USER_LIST_USERItem
        Description: B602_SD01_USER_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB602_SD01_USER_LIST_USERItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD01_USER_LIST_USERItem( )
   {
      this(  new ModelContext(SdtB602_SD01_USER_LIST_USERItem.class));
   }

   public SdtB602_SD01_USER_LIST_USERItem( ModelContext context )
   {
      super( context, "SdtB602_SD01_USER_LIST_USERItem");
   }

   public SdtB602_SD01_USER_LIST_USERItem( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD01_USER_LIST_USERItem");
   }

   public SdtB602_SD01_USER_LIST_USERItem( StructSdtB602_SD01_USER_LIST_USERItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOGIN_ID") )
            {
               gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PASSWORD") )
            {
               gxTv_SdtB602_SD01_USER_LIST_USERItem_Password = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HANDLE") )
            {
               gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ROLE_AUTHORITY_ID") )
            {
               gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BELONG") )
            {
               gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EMAIL") )
            {
               gxTv_SdtB602_SD01_USER_LIST_USERItem_Email = oReader.getValue() ;
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
         sName = "B602_SD01_USER_LIST.USERItem" ;
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
      oWriter.writeElement("LOGIN_ID", GXutil.rtrim( gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("PASSWORD", GXutil.rtrim( gxTv_SdtB602_SD01_USER_LIST_USERItem_Password));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("HANDLE", GXutil.rtrim( gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ROLE_AUTHORITY_ID", GXutil.trim( GXutil.str( gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("BELONG", GXutil.rtrim( gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("EMAIL", GXutil.rtrim( gxTv_SdtB602_SD01_USER_LIST_USERItem_Email));
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
      AddObjectProperty("LOGIN_ID", gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id, false);
      AddObjectProperty("PASSWORD", gxTv_SdtB602_SD01_USER_LIST_USERItem_Password, false);
      AddObjectProperty("HANDLE", gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle, false);
      AddObjectProperty("ROLE_AUTHORITY_ID", gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id, false);
      AddObjectProperty("BELONG", gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong, false);
      AddObjectProperty("EMAIL", gxTv_SdtB602_SD01_USER_LIST_USERItem_Email, false);
   }

   public String getgxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id ;
   }

   public void setgxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id = value ;
   }

   public String getgxTv_SdtB602_SD01_USER_LIST_USERItem_Password( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Password ;
   }

   public void setgxTv_SdtB602_SD01_USER_LIST_USERItem_Password( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Password = value ;
   }

   public String getgxTv_SdtB602_SD01_USER_LIST_USERItem_Handle( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle ;
   }

   public void setgxTv_SdtB602_SD01_USER_LIST_USERItem_Handle( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle = value ;
   }

   public long getgxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id ;
   }

   public void setgxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id( long value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id = value ;
   }

   public String getgxTv_SdtB602_SD01_USER_LIST_USERItem_Belong( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong ;
   }

   public void setgxTv_SdtB602_SD01_USER_LIST_USERItem_Belong( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong = value ;
   }

   public String getgxTv_SdtB602_SD01_USER_LIST_USERItem_Email( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Email ;
   }

   public void setgxTv_SdtB602_SD01_USER_LIST_USERItem_Email( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Email = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id = "" ;
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Password = "" ;
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle = "" ;
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong = "" ;
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Email = "" ;
      sTagName = "" ;
   }

   public SdtB602_SD01_USER_LIST_USERItem Clone( )
   {
      return (SdtB602_SD01_USER_LIST_USERItem)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD01_USER_LIST_USERItem struct )
   {
      setgxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id(struct.getLogin_id());
      setgxTv_SdtB602_SD01_USER_LIST_USERItem_Password(struct.getPassword());
      setgxTv_SdtB602_SD01_USER_LIST_USERItem_Handle(struct.getHandle());
      setgxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id(struct.getRole_authority_id());
      setgxTv_SdtB602_SD01_USER_LIST_USERItem_Belong(struct.getBelong());
      setgxTv_SdtB602_SD01_USER_LIST_USERItem_Email(struct.getEmail());
   }

   public StructSdtB602_SD01_USER_LIST_USERItem getStruct( )
   {
      StructSdtB602_SD01_USER_LIST_USERItem struct = new StructSdtB602_SD01_USER_LIST_USERItem ();
      struct.setLogin_id(getgxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id());
      struct.setPassword(getgxTv_SdtB602_SD01_USER_LIST_USERItem_Password());
      struct.setHandle(getgxTv_SdtB602_SD01_USER_LIST_USERItem_Handle());
      struct.setRole_authority_id(getgxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id());
      struct.setBelong(getgxTv_SdtB602_SD01_USER_LIST_USERItem_Belong());
      struct.setEmail(getgxTv_SdtB602_SD01_USER_LIST_USERItem_Email());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id ;
   protected String sTagName ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Password ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Email ;
}

