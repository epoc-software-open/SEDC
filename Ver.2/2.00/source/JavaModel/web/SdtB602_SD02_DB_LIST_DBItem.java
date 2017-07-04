/*
               File: SdtB602_SD02_DB_LIST_DBItem
        Description: B602_SD02_DB_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.94
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

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
         sName = "B602_SD02_DB_LIST.DBItem" ;
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
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("NAME", GXutil.rtrim( gxTv_SdtB602_SD02_DB_LIST_DBItem_Name));
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
      AddObjectProperty("ID", gxTv_SdtB602_SD02_DB_LIST_DBItem_Id, false);
      AddObjectProperty("NAME", gxTv_SdtB602_SD02_DB_LIST_DBItem_Name, false);
   }

   public long getgxTv_SdtB602_SD02_DB_LIST_DBItem_Id( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_DBItem_Id ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_DBItem_Id( long value )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Id = value ;
   }

   public String getgxTv_SdtB602_SD02_DB_LIST_DBItem_Name( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_DBItem_Name ;
   }

   public void setgxTv_SdtB602_SD02_DB_LIST_DBItem_Name( String value )
   {
      gxTv_SdtB602_SD02_DB_LIST_DBItem_Name = value ;
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

