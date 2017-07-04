/*
               File: SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem
        Description: B702_SD02_CRF_ITEM_DESIGN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:57.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem( )
   {
      this(  new ModelContext(SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem.class));
   }

   public SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem( ModelContext context )
   {
      super( context, "SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem");
   }

   public SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem( int remoteHandle ,
                                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem");
   }

   public SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem( StructSdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_CD") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_NM") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_DIV") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_GRP_ORDER") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DISP_FLG") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "INP_FLG") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GRID_SIZE") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOCATION_X") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOCATION_Y") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOCATION_X2") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LOCATION_Y2") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TEXT_ALIGN_DIV") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TEXT_MAXROWS") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TEXT_MAXLENGTH") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_TRUE_INNER_VALUE") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_FALSE_INNER_VALUE") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FIXED_VALUE") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IMAGE_URL") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TEXT") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FONT_SIZE") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FONT_UL_FLG") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FONT_COLOR_DIV") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_SIZE_DIV") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_COLOR_DIV") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_START_POINT_DIV") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_END_POINT_DIV") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LINE_ANGLE") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ZORDER") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAB_ORDER") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TABSTOP_FLG") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_VALUE") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_CD") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_VAR_NM") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REF_CRF_ID") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REF_CRF_ITEM_CD") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO_KBN") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO_NO") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OL_DISP_ITEM") )
            {
               gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LIST_ITEMS") )
            {
               if ( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items == null )
               {
                  gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items = new GxObjectCollection(SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem.class, "B702_SD03_SEL_LIST_ITEM.B702_SD03_SEL_LIST_ITEMItem", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items.readxml(oReader, "LIST_ITEMS") ;
               }
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
         sName = "B702_SD02_CRF_ITEM_DESIGN.B702_SD02_CRF_ITEM_DESIGNItem" ;
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
      oWriter.writeElement("CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_NM", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_DIV", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_GRP_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DISP_FLG", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("INP_FLG", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("GRID_SIZE", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LOCATION_X", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LOCATION_Y", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LOCATION_X2", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LOCATION_Y2", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TEXT_ALIGN_DIV", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TEXT_MAXROWS", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TEXT_MAXLENGTH", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_TRUE_INNER_VALUE", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_FALSE_INNER_VALUE", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FIXED_VALUE", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("IMAGE_URL", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TEXT", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FONT_SIZE", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FONT_UL_FLG", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FONT_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_SIZE_DIV", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_COLOR_DIV", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_START_POINT_DIV", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_END_POINT_DIV", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("LINE_ANGLE", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ZORDER", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAB_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TABSTOP_FLG", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_VALUE", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DOM_CD", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DOM_VAR_NM", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REF_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REF_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MEMO_KBN", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MEMO_NO", GXutil.trim( GXutil.str( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("OL_DISP_ITEM", GXutil.rtrim( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "tablet-EDC_GXXEV3U3" ;
         }
         else
         {
            sNameSpace1 = "tablet-EDC_GXXEV3U3" ;
         }
         gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items.writexml(oWriter, "LIST_ITEMS", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("CRF_ITEM_CD", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd, false);
      AddObjectProperty("CRF_ITEM_NM", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm, false);
      AddObjectProperty("CRF_ITEM_DIV", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div, false);
      AddObjectProperty("CRF_ITEM_GRP_CD", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd, false);
      AddObjectProperty("CRF_ITEM_GRP_ORDER", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order, false);
      AddObjectProperty("DISP_FLG", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg, false);
      AddObjectProperty("INP_FLG", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg, false);
      AddObjectProperty("GRID_SIZE", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size, false);
      AddObjectProperty("LOCATION_X", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x, false);
      AddObjectProperty("LOCATION_Y", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y, false);
      AddObjectProperty("LOCATION_X2", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2, false);
      AddObjectProperty("LOCATION_Y2", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2, false);
      AddObjectProperty("TEXT_ALIGN_DIV", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div, false);
      AddObjectProperty("TEXT_MAXROWS", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows, false);
      AddObjectProperty("TEXT_MAXLENGTH", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength, false);
      AddObjectProperty("CHK_TRUE_INNER_VALUE", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value, false);
      AddObjectProperty("CHK_FALSE_INNER_VALUE", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value, false);
      AddObjectProperty("FIXED_VALUE", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value, false);
      AddObjectProperty("IMAGE_URL", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url, false);
      AddObjectProperty("TEXT", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text, false);
      AddObjectProperty("FONT_SIZE", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size, false);
      AddObjectProperty("FONT_UL_FLG", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg, false);
      AddObjectProperty("FONT_COLOR_DIV", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div, false);
      AddObjectProperty("LINE_SIZE_DIV", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div, false);
      AddObjectProperty("LINE_COLOR_DIV", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div, false);
      AddObjectProperty("LINE_START_POINT_DIV", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div, false);
      AddObjectProperty("LINE_END_POINT_DIV", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div, false);
      AddObjectProperty("LINE_ANGLE", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle, false);
      AddObjectProperty("ZORDER", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder, false);
      AddObjectProperty("TAB_ORDER", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order, false);
      AddObjectProperty("TABSTOP_FLG", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg, false);
      AddObjectProperty("CRF_VALUE", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value, false);
      AddObjectProperty("DOM_CD", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd, false);
      AddObjectProperty("DOM_VAR_NM", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm, false);
      AddObjectProperty("REF_CRF_ID", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id, false);
      AddObjectProperty("REF_CRF_ITEM_CD", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd, false);
      AddObjectProperty("MEMO_KBN", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn, false);
      AddObjectProperty("MEMO_NO", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no, false);
      AddObjectProperty("OL_DISP_ITEM", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item, false);
      if ( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items != null )
      {
         AddObjectProperty("LIST_ITEMS", gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items, false);
      }
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2 ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2 = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2 ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2 = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div = value ;
   }

   public byte getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows( byte value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text = value ;
   }

   public byte getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size( byte value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg = value ;
   }

   public long getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div( long value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div = value ;
   }

   public byte getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div( byte value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div = value ;
   }

   public long getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div( long value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn = value ;
   }

   public short getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no( short value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no = value ;
   }

   public String getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( )
   {
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( String value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item = value ;
   }

   public GxObjectCollection getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items( )
   {
      if ( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items == null )
      {
         gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items = new GxObjectCollection(SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem.class, "B702_SD03_SEL_LIST_ITEM.B702_SD03_SEL_LIST_ITEMItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items( GxObjectCollection value )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items = value ;
   }

   public void setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_SetNull( )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items = null ;
   }

   public boolean getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_IsNull( )
   {
      if ( gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn = "" ;
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item = "" ;
      sTagName = "" ;
   }

   public SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem Clone( )
   {
      return (SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)(clone()) ;
   }

   public void setStruct( StructSdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem struct )
   {
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd(struct.getCrf_item_cd());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm(struct.getCrf_item_nm());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(struct.getCrf_item_div());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd(struct.getCrf_item_grp_cd());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order(struct.getCrf_item_grp_order());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg(struct.getDisp_flg());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg(struct.getInp_flg());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size(struct.getGrid_size());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x(struct.getLocation_x());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y(struct.getLocation_y());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2(struct.getLocation_x2());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2(struct.getLocation_y2());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div(struct.getText_align_div());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows(struct.getText_maxrows());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength(struct.getText_maxlength());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value(struct.getChk_true_inner_value());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value(struct.getChk_false_inner_value());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value(struct.getFixed_value());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url(struct.getImage_url());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text(struct.getText());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size(struct.getFont_size());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg(struct.getFont_ul_flg());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div(struct.getFont_color_div());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div(struct.getLine_size_div());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div(struct.getLine_color_div());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div(struct.getLine_start_point_div());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div(struct.getLine_end_point_div());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle(struct.getLine_angle());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder(struct.getZorder());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order(struct.getTab_order());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg(struct.getTabstop_flg());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value(struct.getCrf_value());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd(struct.getDom_cd());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm(struct.getDom_var_nm());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id(struct.getRef_crf_id());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd(struct.getRef_crf_item_cd());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn(struct.getMemo_kbn());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no(struct.getMemo_no());
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item(struct.getOl_disp_item());
      GxObjectCollection gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_aux1 = new GxObjectCollection();
      gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_aux1.setStruct(struct.getList_items());
      for (int i = 0; i < gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_aux1.size(); i++)
      {
         gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_aux.add(new SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem((StructSdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem)gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_aux1.elementAt(i)));
      }
      setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items(gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items_aux);
   }

   public StructSdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem getStruct( )
   {
      StructSdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem struct = new StructSdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem ();
      struct.setCrf_item_cd(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd());
      struct.setCrf_item_nm(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm());
      struct.setCrf_item_div(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div());
      struct.setCrf_item_grp_cd(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd());
      struct.setCrf_item_grp_order(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order());
      struct.setDisp_flg(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg());
      struct.setInp_flg(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg());
      struct.setGrid_size(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size());
      struct.setLocation_x(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x());
      struct.setLocation_y(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y());
      struct.setLocation_x2(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2());
      struct.setLocation_y2(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2());
      struct.setText_align_div(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div());
      struct.setText_maxrows(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows());
      struct.setText_maxlength(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength());
      struct.setChk_true_inner_value(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value());
      struct.setChk_false_inner_value(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value());
      struct.setFixed_value(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value());
      struct.setImage_url(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url());
      struct.setText(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text());
      struct.setFont_size(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size());
      struct.setFont_ul_flg(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg());
      struct.setFont_color_div(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div());
      struct.setLine_size_div(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div());
      struct.setLine_color_div(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div());
      struct.setLine_start_point_div(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div());
      struct.setLine_end_point_div(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div());
      struct.setLine_angle(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle());
      struct.setZorder(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder());
      struct.setTab_order(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order());
      struct.setTabstop_flg(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg());
      struct.setCrf_value(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value());
      struct.setDom_cd(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd());
      struct.setDom_var_nm(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm());
      struct.setRef_crf_id(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id());
      struct.setRef_crf_item_cd(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd());
      struct.setMemo_kbn(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn());
      struct.setMemo_no(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no());
      struct.setOl_disp_item(getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item());
      Vector aux_vectorgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items = getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items().getStruct();
      Vector aux_vector1gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items.size(); i++)
      {
         aux_vector1gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items.addElement(((SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem)aux_vectorgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items.elementAt(i)).getStruct());
      }
      struct.setList_items(aux_vector1gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items);
      return struct ;
   }

   protected byte gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxrows ;
   protected byte gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_size ;
   protected byte gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_size_div ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_order ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Grid_size ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_x2 ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Location_y2 ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_maxlength ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_angle ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Zorder ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tab_order ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id ;
   protected short gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_no ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_color_div ;
   protected long gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_color_div ;
   protected String sTagName ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_nm ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_grp_cd ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Disp_flg ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Inp_flg ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text_align_div ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Image_url ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Text ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Font_ul_flg ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_start_point_div ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Line_end_point_div ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Tabstop_flg ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_value ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Memo_kbn ;
   protected String gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item ;
   protected GxObjectCollection gxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items=null ;
}

