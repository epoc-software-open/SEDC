import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB602_SD02_DB_LIST_DBItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD02_DB_LIST_DBItem( )
   {
      this(  new ModelContext(SdtB602_SD02_DB_LIST_DBItem.class));
   }

   public SdtB602_SD02_DB_LIST_DBItem( ModelContext context )
   {
      super( context, "SdtB602_SD02_DB_LIST_DBItem");
   }

   public SdtB602_SD02_DB_LIST_DBItem( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD02_DB_LIST_DBItem");
   }

   public SdtB602_SD02_DB_LIST_DBItem( StructSdtB602_SD02_DB_LIST_DBItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID") )
            {
               gxTv_SdtB602_SD02_DB_LIST_DBItem_Id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NAME") )
            {
               gxTv_SdtB602_SD02_DB_LIST_DBItem_Name = oReader.getValue() ;
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
         sName = "B602_SD02_DB_LIST.DBItem" ;
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
      oWriter.writeElement("ID", GXutil.trim( GXutil.str( gxTv_SdtB602_SD02_DB_LIST_DBItem_Id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("NAME", GXutil.rtrim( gxTv_SdtB602_SD02_DB_LIST_DBItem_Name));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("ID", gxTv_SdtB602_SD02_DB_LIST_DBItem_Id);
      AddObjectProperty("NAME", gxTv_SdtB602_SD02_DB_LIST_DBItem_Name);
   }

   public long getgxTv_SdtB602_SD02_DB_LIST_DBItem_Id( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_DBItem_Id ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_DBItem_Id( long value )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Id = value ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_DBItem_Id_SetNull( )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Id = 0 ;
   }

   public boolean getgxTv_SdtB602_SD02_DB_LIST_DBItem_Id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB602_SD02_DB_LIST_DBItem_Name( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_DBItem_Name ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_DBItem_Name( String value )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Name = value ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_DBItem_Name_SetNull( )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Name = "" ;
   }

   public boolean getgxTv_SdtB602_SD02_DB_LIST_DBItem_Name_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Name = "" ;
      sTagName = "" ;
   }

   public SdtB602_SD02_DB_LIST_DBItem Clone( )
   {
      return (SdtB602_SD02_DB_LIST_DBItem)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD02_DB_LIST_DBItem struct )
   {
      setgxTv_SdtB602_SD02_DB_LIST_DBItem_Id(struct.getId());
      setgxTv_SdtB602_SD02_DB_LIST_DBItem_Name(struct.getName());
   }

   public StructSdtB602_SD02_DB_LIST_DBItem getStruct( )
   {
      StructSdtB602_SD02_DB_LIST_DBItem struct = new StructSdtB602_SD02_DB_LIST_DBItem ();
      struct.setId(getgxTv_SdtB602_SD02_DB_LIST_DBItem_Id());
      struct.setName(getgxTv_SdtB602_SD02_DB_LIST_DBItem_Name());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB602_SD02_DB_LIST_DBItem_Id ;
   protected String sTagName ;
   protected String gxTv_SdtB602_SD02_DB_LIST_DBItem_Name ;
}

