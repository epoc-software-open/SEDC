/*
               File: SdtB602_SD04_CONTENT_LIST_CONTENTItem
        Description: B602_SD04_CONTENT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:43.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB602_SD04_CONTENT_LIST_CONTENTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD04_CONTENT_LIST_CONTENTItem( )
   {
      this(  new ModelContext(SdtB602_SD04_CONTENT_LIST_CONTENTItem.class));
   }

   public SdtB602_SD04_CONTENT_LIST_CONTENTItem( ModelContext context )
   {
      super( context, "SdtB602_SD04_CONTENT_LIST_CONTENTItem");
   }

   public SdtB602_SD04_CONTENT_LIST_CONTENTItem( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD04_CONTENT_LIST_CONTENTItem");
   }

   public SdtB602_SD04_CONTENT_LIST_CONTENTItem( StructSdtB602_SD04_CONTENT_LIST_CONTENTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONTENT_ID") )
            {
               gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DISPLAY_SEQUENCE") )
            {
               gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INSERT_TIME") )
            {
               gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UPDATE_TIME") )
            {
               gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONTENT_NO") )
            {
               gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no = GXutil.lval( oReader.getValue()) ;
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
         sName = "B602_SD04_CONTENT_LIST.CONTENTItem" ;
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
      oWriter.writeElement("CONTENT_ID", GXutil.trim( GXutil.str( gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DISPLAY_SEQUENCE", GXutil.trim( GXutil.str( gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("INSERT_TIME", GXutil.rtrim( gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("UPDATE_TIME", GXutil.rtrim( gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CONTENT_NO", GXutil.trim( GXutil.str( gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no, 10, 0)));
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
      AddObjectProperty("CONTENT_ID", gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id, false);
      AddObjectProperty("DISPLAY_SEQUENCE", gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence, false);
      AddObjectProperty("INSERT_TIME", gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time, false);
      AddObjectProperty("UPDATE_TIME", gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time, false);
      AddObjectProperty("CONTENT_NO", gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no, false);
   }

   public long getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id ;
   }

   public void setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id( long value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id = value ;
   }

   public long getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence ;
   }

   public void setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence( long value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence = value ;
   }

   public String getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time ;
   }

   public void setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time( String value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time = value ;
   }

   public String getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time ;
   }

   public void setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time( String value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time = value ;
   }

   public long getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no ;
   }

   public void setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no( long value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time = "" ;
      gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time = "" ;
      sTagName = "" ;
   }

   public SdtB602_SD04_CONTENT_LIST_CONTENTItem Clone( )
   {
      return (SdtB602_SD04_CONTENT_LIST_CONTENTItem)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD04_CONTENT_LIST_CONTENTItem struct )
   {
      setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id(struct.getContent_id());
      setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence(struct.getDisplay_sequence());
      setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time(struct.getInsert_time());
      setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time(struct.getUpdate_time());
      setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no(struct.getContent_no());
   }

   public StructSdtB602_SD04_CONTENT_LIST_CONTENTItem getStruct( )
   {
      StructSdtB602_SD04_CONTENT_LIST_CONTENTItem struct = new StructSdtB602_SD04_CONTENT_LIST_CONTENTItem ();
      struct.setContent_id(getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id());
      struct.setDisplay_sequence(getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence());
      struct.setInsert_time(getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time());
      struct.setUpdate_time(getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time());
      struct.setContent_no(getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id ;
   protected long gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence ;
   protected long gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no ;
   protected String sTagName ;
   protected String gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time ;
   protected String gxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time ;
}

