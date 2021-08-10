/*
               File: SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem
        Description: B720_SD04_MARK_DISP
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: December 24, 2020 16:51:17.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem( )
   {
      this(  new ModelContext(SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem.class));
   }

   public SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem( ModelContext context )
   {
      super( context, "SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem");
   }

   public SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem");
   }

   public SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem( StructSdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_NO") )
            {
               gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT") )
            {
               gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y") )
            {
               gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X") )
            {
               gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X2") )
            {
               gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y2") )
            {
               gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2 = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B720_SD04_MARK_DISP.B720_SD04_MARK_DISPItem" ;
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
      oWriter.writeElement("PAGE_NO", GXutil.trim( GXutil.str( gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT", GXutil.rtrim( gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_Y", GXutil.trim( GXutil.str( gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_X", GXutil.trim( GXutil.str( gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_X2", GXutil.trim( GXutil.str( gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_Y2", GXutil.trim( GXutil.str( gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2, 4, 0)));
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
      AddObjectProperty("PAGE_NO", gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no, false);
      AddObjectProperty("TBM32_TEXT", gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text, false);
      AddObjectProperty("TBM32_LOCATION_Y", gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y, false);
      AddObjectProperty("TBM32_LOCATION_X", gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x, false);
      AddObjectProperty("TBM32_LOCATION_X2", gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2, false);
      AddObjectProperty("TBM32_LOCATION_Y2", gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2, false);
   }

   public short getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no( )
   {
      return gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no ;
   }

   public void setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no( short value )
   {
      gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no = value ;
   }

   public String getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text( )
   {
      return gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text ;
   }

   public void setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text( String value )
   {
      gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text = value ;
   }

   public short getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y( )
   {
      return gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y ;
   }

   public void setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y( short value )
   {
      gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y = value ;
   }

   public short getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x( )
   {
      return gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x ;
   }

   public void setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x( short value )
   {
      gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x = value ;
   }

   public short getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2( )
   {
      return gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2 ;
   }

   public void setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2( short value )
   {
      gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2 = value ;
   }

   public short getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2( )
   {
      return gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2 ;
   }

   public void setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2( short value )
   {
      gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text = "" ;
      sTagName = "" ;
   }

   public SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem Clone( )
   {
      return (SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem)(clone()) ;
   }

   public void setStruct( StructSdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem struct )
   {
      setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no(struct.getPage_no());
      setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text(struct.getTbm32_text());
      setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y(struct.getTbm32_location_y());
      setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x(struct.getTbm32_location_x());
      setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2(struct.getTbm32_location_x2());
      setgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2(struct.getTbm32_location_y2());
   }

   public StructSdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem getStruct( )
   {
      StructSdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem struct = new StructSdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem ();
      struct.setPage_no(getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no());
      struct.setTbm32_text(getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text());
      struct.setTbm32_location_y(getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y());
      struct.setTbm32_location_x(getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x());
      struct.setTbm32_location_x2(getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2());
      struct.setTbm32_location_y2(getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2());
      return struct ;
   }

   protected short gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no ;
   protected short gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y ;
   protected short gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x ;
   protected short gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2 ;
   protected short gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y2 ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text ;
}

