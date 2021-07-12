/*
               File: SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem
        Description: B702_SD03_SEL_LIST_ITEM
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:44.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem( )
   {
      this(  new ModelContext(SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem.class));
   }

   public SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem( ModelContext context )
   {
      super( context, "SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem");
   }

   public SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem( int remoteHandle ,
                                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem");
   }

   public SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem( StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "LIST_ITEM_NO") )
            {
               gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LIST_ITEM_NAME") )
            {
               gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INNER_VALUE") )
            {
               gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value = oReader.getValue() ;
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
         sName = "B702_SD03_SEL_LIST_ITEM.B702_SD03_SEL_LIST_ITEMItem" ;
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
      oWriter.writeElement("LIST_ITEM_NO", GXutil.trim( GXutil.str( gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LIST_ITEM_NAME", GXutil.rtrim( gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("INNER_VALUE", GXutil.rtrim( gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value));
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
      AddObjectProperty("LIST_ITEM_NO", gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no, false);
      AddObjectProperty("LIST_ITEM_NAME", gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name, false);
      AddObjectProperty("INNER_VALUE", gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value, false);
   }

   public short getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no( short value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no = value ;
   }

   public String getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name( String value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name = value ;
   }

   public String getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value( String value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name = "" ;
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value = "" ;
      sTagName = "" ;
   }

   public SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem Clone( )
   {
      return (SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem)(clone()) ;
   }

   public void setStruct( StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem struct )
   {
      setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no(struct.getList_item_no());
      setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name(struct.getList_item_name());
      setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value(struct.getInner_value());
   }

   public StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem getStruct( )
   {
      StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem struct = new StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem ();
      struct.setList_item_no(getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no());
      struct.setList_item_name(getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name());
      struct.setInner_value(getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value());
      return struct ;
   }

   protected short gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name ;
   protected String gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value ;
}

