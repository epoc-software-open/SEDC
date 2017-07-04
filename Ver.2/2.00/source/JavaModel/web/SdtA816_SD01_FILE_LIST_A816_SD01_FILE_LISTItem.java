/*
               File: SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem
        Description: A816_SD01_FILE_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem( )
   {
      this(  new ModelContext(SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem.class));
   }

   public SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem( ModelContext context )
   {
      super( context, "SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem");
   }

   public SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem");
   }

   public SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem( StructSdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "FILE_NAME") )
            {
               gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FILE_SIZE") )
            {
               gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FILE_TYPE") )
            {
               gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FILE_DIR_KB") )
            {
               gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "A816_SD01_FILE_LIST.A816_SD01_FILE_LISTItem" ;
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
      oWriter.writeElement("FILE_NAME", GXutil.rtrim( gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FILE_SIZE", GXutil.trim( GXutil.str( gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FILE_TYPE", GXutil.rtrim( gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FILE_DIR_KB", GXutil.trim( GXutil.str( gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb, 1, 0)));
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
      AddObjectProperty("FILE_NAME", gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name, false);
      AddObjectProperty("FILE_SIZE", gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size, false);
      AddObjectProperty("FILE_TYPE", gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type, false);
      AddObjectProperty("FILE_DIR_KB", gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb, false);
   }

   public String getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name( )
   {
      return gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name ;
   }

   public void setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name( String value )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name = value ;
   }

   public long getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size( )
   {
      return gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size ;
   }

   public void setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size( long value )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size = value ;
   }

   public String getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type( )
   {
      return gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type ;
   }

   public void setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type( String value )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type = value ;
   }

   public byte getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb( )
   {
      return gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb ;
   }

   public void setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb( byte value )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name = "" ;
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type = "" ;
      sTagName = "" ;
   }

   public SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem Clone( )
   {
      return (SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem struct )
   {
      setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name(struct.getFile_name());
      setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size(struct.getFile_size());
      setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type(struct.getFile_type());
      setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb(struct.getFile_dir_kb());
   }

   public StructSdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem getStruct( )
   {
      StructSdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem struct = new StructSdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem ();
      struct.setFile_name(getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name());
      struct.setFile_size(getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size());
      struct.setFile_type(getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type());
      struct.setFile_dir_kb(getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb());
      return struct ;
   }

   protected byte gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size ;
   protected String sTagName ;
   protected String gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name ;
   protected String gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type ;
}

