import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtMessages_Message extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtMessages_Message( )
   {
      this(  new ModelContext(SdtMessages_Message.class));
   }

   public SdtMessages_Message( ModelContext context )
   {
      super( context, "SdtMessages_Message");
   }

   public SdtMessages_Message( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtMessages_Message");
   }

   public SdtMessages_Message( StructSdtMessages_Message struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Id") )
            {
               gxTv_SdtMessages_Message_Id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Type") )
            {
               gxTv_SdtMessages_Message_Type = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Description") )
            {
               gxTv_SdtMessages_Message_Description = oReader.getValue() ;
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
         sName = "Messages.Message" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "Genexus" ;
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
      oWriter.writeElement("Id", GXutil.rtrim( gxTv_SdtMessages_Message_Id));
      if ( GXutil.strcmp(sNameSpace, "Genexus") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Genexus");
      }
      oWriter.writeElement("Type", GXutil.trim( GXutil.str( gxTv_SdtMessages_Message_Type, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "Genexus") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Genexus");
      }
      oWriter.writeElement("Description", GXutil.rtrim( gxTv_SdtMessages_Message_Description));
      if ( GXutil.strcmp(sNameSpace, "Genexus") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Genexus");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("Id", gxTv_SdtMessages_Message_Id);
      AddObjectProperty("Type", gxTv_SdtMessages_Message_Type);
      AddObjectProperty("Description", gxTv_SdtMessages_Message_Description);
   }

   public String getgxTv_SdtMessages_Message_Id( )
   {
      return gxTv_SdtMessages_Message_Id ;
   }

   public void setgxTv_SdtMessages_Message_Id( String value )
   {
      gxTv_SdtMessages_Message_Id = value ;
   }

   public void setgxTv_SdtMessages_Message_Id_SetNull( )
   {
      gxTv_SdtMessages_Message_Id = "" ;
   }

   public boolean getgxTv_SdtMessages_Message_Id_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtMessages_Message_Type( )
   {
      return gxTv_SdtMessages_Message_Type ;
   }

   public void setgxTv_SdtMessages_Message_Type( byte value )
   {
      gxTv_SdtMessages_Message_Type = value ;
   }

   public void setgxTv_SdtMessages_Message_Type_SetNull( )
   {
      gxTv_SdtMessages_Message_Type = (byte)(0) ;
   }

   public boolean getgxTv_SdtMessages_Message_Type_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtMessages_Message_Description( )
   {
      return gxTv_SdtMessages_Message_Description ;
   }

   public void setgxTv_SdtMessages_Message_Description( String value )
   {
      gxTv_SdtMessages_Message_Description = value ;
   }

   public void setgxTv_SdtMessages_Message_Description_SetNull( )
   {
      gxTv_SdtMessages_Message_Description = "" ;
   }

   public boolean getgxTv_SdtMessages_Message_Description_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMessages_Message_Id = "" ;
      gxTv_SdtMessages_Message_Description = "" ;
      sTagName = "" ;
   }

   public SdtMessages_Message Clone( )
   {
      return (SdtMessages_Message)(clone()) ;
   }

   public void setStruct( StructSdtMessages_Message struct )
   {
      setgxTv_SdtMessages_Message_Id(struct.getId());
      setgxTv_SdtMessages_Message_Type(struct.getType());
      setgxTv_SdtMessages_Message_Description(struct.getDescription());
   }

   public StructSdtMessages_Message getStruct( )
   {
      StructSdtMessages_Message struct = new StructSdtMessages_Message ();
      struct.setId(getgxTv_SdtMessages_Message_Id());
      struct.setType(getgxTv_SdtMessages_Message_Type());
      struct.setDescription(getgxTv_SdtMessages_Message_Description());
      return struct ;
   }

   protected byte gxTv_SdtMessages_Message_Type ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtMessages_Message_Id ;
   protected String gxTv_SdtMessages_Message_Description ;
}

