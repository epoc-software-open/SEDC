/*
               File: SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem
        Description: B720_SD01_DESIGN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: December 24, 2020 16:51:16.79
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem( )
   {
      this(  new ModelContext(SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem.class));
   }

   public SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem( ModelContext context )
   {
      super( context, "SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem");
   }

   public SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem");
   }

   public SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem( StructSdtB720_SD01_DESIGN_B720_SD01_DESIGNItem struct )
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
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ID") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_CD") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_NM") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_DIV") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_GRP_ORDER") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GRP_CRF_ITEM_CD") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOCATION_X") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOCATION_Y") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOCATION_X2") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOCATION_Y2") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REQUIRED_INPUT_FLG") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TEXT") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FIXED_VALUE") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TEXT_ALIGN_DIV") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TEXT_MAXROWS") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FONT_SIZE") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FONT_COLOR_DIV") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_COLOR_DIV") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_SIZE_DIV") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_START_POINT_DIV") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_END_POINT_DIV") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_ANGLE") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LIST_CD") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IMAGE_URL") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_TRUE_INNER_VALUE") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_TURE_FLG") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REF_CRF_ITEM_CD") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REF_CRF_ID") )
            {
               gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B720_SD01_DESIGN.B720_SD01_DESIGNItem" ;
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
      oWriter.writeElement("PAGE_NO", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_NM", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_DIV", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_GRP_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("GRP_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LOCATION_X", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LOCATION_Y", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LOCATION_X2", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LOCATION_Y2", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REQUIRED_INPUT_FLG", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TEXT", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FIXED_VALUE", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TEXT_ALIGN_DIV", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TEXT_MAXROWS", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FONT_SIZE", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FONT_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_SIZE_DIV", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_START_POINT_DIV", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_END_POINT_DIV", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_ANGLE", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LIST_CD", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("IMAGE_URL", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_TRUE_INNER_VALUE", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_TURE_FLG", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REF_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REF_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id, 4, 0)));
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
      AddObjectProperty("PAGE_NO", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no, false);
      AddObjectProperty("CRF_ID", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id, false);
      AddObjectProperty("CRF_ITEM_CD", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd, false);
      AddObjectProperty("CRF_ITEM_NM", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm, false);
      AddObjectProperty("CRF_ITEM_DIV", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div, false);
      AddObjectProperty("CRF_ITEM_GRP_CD", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd, false);
      AddObjectProperty("CRF_ITEM_GRP_ORDER", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order, false);
      AddObjectProperty("GRP_CRF_ITEM_CD", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd, false);
      AddObjectProperty("LOCATION_X", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x, false);
      AddObjectProperty("LOCATION_Y", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y, false);
      AddObjectProperty("LOCATION_X2", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2, false);
      AddObjectProperty("LOCATION_Y2", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2, false);
      AddObjectProperty("REQUIRED_INPUT_FLG", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg, false);
      AddObjectProperty("TEXT", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text, false);
      AddObjectProperty("FIXED_VALUE", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value, false);
      AddObjectProperty("TEXT_ALIGN_DIV", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div, false);
      AddObjectProperty("TEXT_MAXROWS", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows, false);
      AddObjectProperty("FONT_SIZE", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size, false);
      AddObjectProperty("FONT_COLOR_DIV", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div, false);
      AddObjectProperty("LINE_COLOR_DIV", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div, false);
      AddObjectProperty("LINE_SIZE_DIV", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div, false);
      AddObjectProperty("LINE_START_POINT_DIV", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div, false);
      AddObjectProperty("LINE_END_POINT_DIV", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div, false);
      AddObjectProperty("LINE_ANGLE", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle, false);
      AddObjectProperty("LIST_CD", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd, false);
      AddObjectProperty("IMAGE_URL", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url, false);
      AddObjectProperty("CHK_TRUE_INNER_VALUE", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value, false);
      AddObjectProperty("CHK_TURE_FLG", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg, false);
      AddObjectProperty("REF_CRF_ITEM_CD", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd, false);
      AddObjectProperty("REF_CRF_ID", gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id, false);
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no = value ;
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd = value ;
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd = value ;
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x = value ;
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y = value ;
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2 ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2 = value ;
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2 ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2 = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div = value ;
   }

   public byte getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows( byte value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows = value ;
   }

   public byte getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size( byte value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size = value ;
   }

   public long getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div( long value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div = value ;
   }

   public long getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div( long value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div = value ;
   }

   public byte getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div( byte value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div = value ;
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg = value ;
   }

   public String getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd( String value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd = value ;
   }

   public short getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id( )
   {
      return gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id ;
   }

   public void setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id( short value )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg = "" ;
      gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd = "" ;
      sTagName = "" ;
   }

   public SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem Clone( )
   {
      return (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)(clone()) ;
   }

   public void setStruct( StructSdtB720_SD01_DESIGN_B720_SD01_DESIGNItem struct )
   {
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no(struct.getPage_no());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id(struct.getCrf_id());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd(struct.getCrf_item_cd());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm(struct.getCrf_item_nm());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(struct.getCrf_item_div());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd(struct.getCrf_item_grp_cd());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order(struct.getCrf_item_grp_order());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd(struct.getGrp_crf_item_cd());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x(struct.getLocation_x());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y(struct.getLocation_y());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2(struct.getLocation_x2());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2(struct.getLocation_y2());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg(struct.getRequired_input_flg());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text(struct.getText());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value(struct.getFixed_value());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div(struct.getText_align_div());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows(struct.getText_maxrows());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size(struct.getFont_size());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div(struct.getFont_color_div());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div(struct.getLine_color_div());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div(struct.getLine_size_div());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div(struct.getLine_start_point_div());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div(struct.getLine_end_point_div());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle(struct.getLine_angle());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd(struct.getList_cd());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url(struct.getImage_url());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value(struct.getChk_true_inner_value());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg(struct.getChk_ture_flg());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd(struct.getRef_crf_item_cd());
      setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id(struct.getRef_crf_id());
   }

   public StructSdtB720_SD01_DESIGN_B720_SD01_DESIGNItem getStruct( )
   {
      StructSdtB720_SD01_DESIGN_B720_SD01_DESIGNItem struct = new StructSdtB720_SD01_DESIGN_B720_SD01_DESIGNItem ();
      struct.setPage_no(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no());
      struct.setCrf_id(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id());
      struct.setCrf_item_cd(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd());
      struct.setCrf_item_nm(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm());
      struct.setCrf_item_div(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div());
      struct.setCrf_item_grp_cd(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd());
      struct.setCrf_item_grp_order(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order());
      struct.setGrp_crf_item_cd(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd());
      struct.setLocation_x(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x());
      struct.setLocation_y(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y());
      struct.setLocation_x2(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2());
      struct.setLocation_y2(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2());
      struct.setRequired_input_flg(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg());
      struct.setText(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text());
      struct.setFixed_value(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value());
      struct.setText_align_div(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div());
      struct.setText_maxrows(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows());
      struct.setFont_size(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size());
      struct.setFont_color_div(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div());
      struct.setLine_color_div(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div());
      struct.setLine_size_div(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div());
      struct.setLine_start_point_div(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div());
      struct.setLine_end_point_div(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div());
      struct.setLine_angle(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle());
      struct.setList_cd(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd());
      struct.setImage_url(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url());
      struct.setChk_true_inner_value(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value());
      struct.setChk_ture_flg(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg());
      struct.setRef_crf_item_cd(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd());
      struct.setRef_crf_id(getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id());
      return struct ;
   }

   protected byte gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows ;
   protected byte gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size ;
   protected byte gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_id ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_order ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2 ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2 ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle ;
   protected short gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div ;
   protected long gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div ;
   protected String sTagName ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_nm ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Fixed_value ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg ;
   protected String gxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd ;
}

