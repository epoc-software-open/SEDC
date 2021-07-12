/*
               File: SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem
        Description: B702_SD04_MARK_DISP
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:44.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem( )
   {
      this(  new ModelContext(SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem.class));
   }

   public SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem( ModelContext context )
   {
      super( context, "SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem");
   }

   public SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem");
   }

   public SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem( StructSdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_CD") )
            {
               gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_CRF_ITEM_DIV") )
            {
               gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_TEXT") )
            {
               gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y") )
            {
               gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X") )
            {
               gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_X2") )
            {
               gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM32_LOCATION_Y2") )
            {
               gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2 = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B702_SD04_MARK_DISP.B702_SD04_MARK_DISPItem" ;
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
      oWriter.writeElement("TBM32_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_CRF_ITEM_DIV", GXutil.rtrim( gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_TEXT", GXutil.rtrim( gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_Y", GXutil.trim( GXutil.str( gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_X", GXutil.trim( GXutil.str( gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_X2", GXutil.trim( GXutil.str( gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM32_LOCATION_Y2", GXutil.trim( GXutil.str( gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2, 4, 0)));
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
      AddObjectProperty("TBM32_CRF_ITEM_CD", gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd, false);
      AddObjectProperty("TBM32_CRF_ITEM_GRP_CD", gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd, false);
      AddObjectProperty("TBM32_CRF_ITEM_DIV", gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div, false);
      AddObjectProperty("TBM32_TEXT", gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text, false);
      AddObjectProperty("TBM32_LOCATION_Y", gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y, false);
      AddObjectProperty("TBM32_LOCATION_X", gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x, false);
      AddObjectProperty("TBM32_LOCATION_X2", gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2, false);
      AddObjectProperty("TBM32_LOCATION_Y2", gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2, false);
   }

   public String getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd( )
   {
      return gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd ;
   }

   public void setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd( String value )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd = value ;
   }

   public String getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd( )
   {
      return gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd ;
   }

   public void setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd( String value )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div( )
   {
      return gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div ;
   }

   public void setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div( String value )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div = value ;
   }

   public String getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text( )
   {
      return gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text ;
   }

   public void setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text( String value )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text = value ;
   }

   public short getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y( )
   {
      return gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y ;
   }

   public void setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y( short value )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y = value ;
   }

   public short getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x( )
   {
      return gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x ;
   }

   public void setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x( short value )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x = value ;
   }

   public short getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2( )
   {
      return gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2 ;
   }

   public void setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2( short value )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2 = value ;
   }

   public short getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2( )
   {
      return gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2 ;
   }

   public void setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2( short value )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd = "" ;
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd = "" ;
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div = "" ;
      gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text = "" ;
      sTagName = "" ;
   }

   public SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem Clone( )
   {
      return (SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem)(clone()) ;
   }

   public void setStruct( StructSdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem struct )
   {
      setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd(struct.getTbm32_crf_item_cd());
      setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd(struct.getTbm32_crf_item_grp_cd());
      setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div(struct.getTbm32_crf_item_div());
      setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text(struct.getTbm32_text());
      setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y(struct.getTbm32_location_y());
      setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x(struct.getTbm32_location_x());
      setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2(struct.getTbm32_location_x2());
      setgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2(struct.getTbm32_location_y2());
   }

   public StructSdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem getStruct( )
   {
      StructSdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem struct = new StructSdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem ();
      struct.setTbm32_crf_item_cd(getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd());
      struct.setTbm32_crf_item_grp_cd(getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd());
      struct.setTbm32_crf_item_div(getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div());
      struct.setTbm32_text(getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text());
      struct.setTbm32_location_y(getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y());
      struct.setTbm32_location_x(getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x());
      struct.setTbm32_location_x2(getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2());
      struct.setTbm32_location_y2(getgxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2());
      return struct ;
   }

   protected short gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y ;
   protected short gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x ;
   protected short gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_x2 ;
   protected short gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_location_y2 ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_cd ;
   protected String gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_grp_cd ;
   protected String gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_crf_item_div ;
   protected String gxTv_SdtB702_SD04_MARK_DISP_B702_SD04_MARK_DISPItem_Tbm32_text ;
}

