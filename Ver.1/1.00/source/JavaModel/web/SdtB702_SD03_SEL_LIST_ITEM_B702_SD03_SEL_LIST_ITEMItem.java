import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

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
         sName = "B702_SD03_SEL_LIST_ITEM.B702_SD03_SEL_LIST_ITEMItem" ;
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
      oWriter.writeElement("LIST_ITEM_NO", GXutil.trim( GXutil.str( gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("LIST_ITEM_NAME", GXutil.rtrim( gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("INNER_VALUE", GXutil.rtrim( gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("LIST_ITEM_NO", gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no);
      AddObjectProperty("LIST_ITEM_NAME", gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name);
      AddObjectProperty("INNER_VALUE", gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value);
   }

   public short getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no( short value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no = value ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no_SetNull( )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no = (short)(0) ;
   }

   public boolean getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_no_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name( String value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name = value ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name_SetNull( )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name = "" ;
   }

   public boolean getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_List_item_name_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value( )
   {
      return gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value( String value )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value = value ;
   }

   public void setgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value_SetNull( )
   {
      gxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value = "" ;
   }

   public boolean getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value_IsNull( )
   {
      return false ;
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

