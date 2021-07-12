/*
               File: SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem
        Description: B712_SD04_KANI_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:44.93
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem( )
   {
      this(  new ModelContext(SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem.class));
   }

   public SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem( ModelContext context )
   {
      super( context, "SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem");
   }

   public SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem");
   }

   public SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem( StructSdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SEL_FLG") )
            {
               gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAS01_ITEM_CD") )
            {
               gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAS01_ITEM_RYAK") )
            {
               gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAS01_SORT_NO") )
            {
               gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B712_SD04_KANI_LIST.B712_SD04_KANI_LISTItem" ;
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
      oWriter.writeElement("SEL_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAS01_ITEM_CD", GXutil.rtrim( gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAS01_ITEM_RYAK", GXutil.rtrim( gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAS01_SORT_NO", GXutil.trim( GXutil.str( gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no, 3, 0)));
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
      AddObjectProperty("SEL_FLG", gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg, false);
      AddObjectProperty("TAS01_ITEM_CD", gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd, false);
      AddObjectProperty("TAS01_ITEM_RYAK", gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak, false);
      AddObjectProperty("TAS01_SORT_NO", gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no, false);
   }

   public boolean getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( )
   {
      return gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg ;
   }

   public void setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg( boolean value )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg = value ;
   }

   public String getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd( )
   {
      return gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd ;
   }

   public void setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd( String value )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd = value ;
   }

   public String getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak( )
   {
      return gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak ;
   }

   public void setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak( String value )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak = value ;
   }

   public short getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no( )
   {
      return gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no ;
   }

   public void setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no( short value )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd = "" ;
      gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak = "" ;
      sTagName = "" ;
   }

   public SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem Clone( )
   {
      return (SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem struct )
   {
      setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg(struct.getSel_flg());
      setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd(struct.getTas01_item_cd());
      setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak(struct.getTas01_item_ryak());
      setgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no(struct.getTas01_sort_no());
   }

   public StructSdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem getStruct( )
   {
      StructSdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem struct = new StructSdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem ();
      struct.setSel_flg(getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg());
      struct.setTas01_item_cd(getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd());
      struct.setTas01_item_ryak(getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak());
      struct.setTas01_sort_no(getgxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no());
      return struct ;
   }

   protected short gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_sort_no ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Sel_flg ;
   protected String gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_cd ;
   protected String gxTv_SdtB712_SD04_KANI_LIST_B712_SD04_KANI_LISTItem_Tas01_item_ryak ;
}

