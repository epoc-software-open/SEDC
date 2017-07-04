import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtA_PAGING_SDT extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA_PAGING_SDT( )
   {
      this(  new ModelContext(SdtA_PAGING_SDT.class));
   }

   public SdtA_PAGING_SDT( ModelContext context )
   {
      super( context, "SdtA_PAGING_SDT");
   }

   public SdtA_PAGING_SDT( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtA_PAGING_SDT");
   }

   public SdtA_PAGING_SDT( StructSdtA_PAGING_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAX_ROW") )
            {
               gxTv_SdtA_PAGING_SDT_Max_row = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAX_PAGE") )
            {
               gxTv_SdtA_PAGING_SDT_Max_page = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REC_CNT") )
            {
               gxTv_SdtA_PAGING_SDT_Rec_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_NO") )
            {
               gxTv_SdtA_PAGING_SDT_Page_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE01") )
            {
               gxTv_SdtA_PAGING_SDT_Page01 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE02") )
            {
               gxTv_SdtA_PAGING_SDT_Page02 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE03") )
            {
               gxTv_SdtA_PAGING_SDT_Page03 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE04") )
            {
               gxTv_SdtA_PAGING_SDT_Page04 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE05") )
            {
               gxTv_SdtA_PAGING_SDT_Page05 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE06") )
            {
               gxTv_SdtA_PAGING_SDT_Page06 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE07") )
            {
               gxTv_SdtA_PAGING_SDT_Page07 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE08") )
            {
               gxTv_SdtA_PAGING_SDT_Page08 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE09") )
            {
               gxTv_SdtA_PAGING_SDT_Page09 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE10") )
            {
               gxTv_SdtA_PAGING_SDT_Page10 = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP01") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp01 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP02") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp02 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP03") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp03 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP04") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp04 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP05") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp05 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP06") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp06 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP07") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp07 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP08") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp08 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP09") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp09 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP10") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp10 = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP_BACK") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp_back = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP_NEXT") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp_next = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP_FIRST") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp_first = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP_LAST") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp_last = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PAGE_DISP_AREA") )
            {
               gxTv_SdtA_PAGING_SDT_Page_disp_area = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "A_PAGING_SDT" ;
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
      oWriter.writeElement("MAX_ROW", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Max_row, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("MAX_PAGE", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Max_page, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("REC_CNT", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Rec_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_NO", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_no, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE01", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page01, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE02", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page02, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE03", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page03, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE04", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page04, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE05", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page05, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE06", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page06, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE07", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page07, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE08", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page08, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE09", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page09, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE10", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page10, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP01", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp01, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP02", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp02, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP03", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp03, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP04", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp04, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP05", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp05, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP06", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp06, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP07", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp07, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP08", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp08, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP09", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp09, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP10", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp10, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP_BACK", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp_back, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP_NEXT", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp_next, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP_FIRST", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp_first, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP_LAST", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp_last, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("PAGE_DISP_AREA", GXutil.trim( GXutil.str( gxTv_SdtA_PAGING_SDT_Page_disp_area, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("MAX_ROW", gxTv_SdtA_PAGING_SDT_Max_row);
      AddObjectProperty("MAX_PAGE", gxTv_SdtA_PAGING_SDT_Max_page);
      AddObjectProperty("REC_CNT", gxTv_SdtA_PAGING_SDT_Rec_cnt);
      AddObjectProperty("PAGE_NO", gxTv_SdtA_PAGING_SDT_Page_no);
      AddObjectProperty("PAGE01", gxTv_SdtA_PAGING_SDT_Page01);
      AddObjectProperty("PAGE02", gxTv_SdtA_PAGING_SDT_Page02);
      AddObjectProperty("PAGE03", gxTv_SdtA_PAGING_SDT_Page03);
      AddObjectProperty("PAGE04", gxTv_SdtA_PAGING_SDT_Page04);
      AddObjectProperty("PAGE05", gxTv_SdtA_PAGING_SDT_Page05);
      AddObjectProperty("PAGE06", gxTv_SdtA_PAGING_SDT_Page06);
      AddObjectProperty("PAGE07", gxTv_SdtA_PAGING_SDT_Page07);
      AddObjectProperty("PAGE08", gxTv_SdtA_PAGING_SDT_Page08);
      AddObjectProperty("PAGE09", gxTv_SdtA_PAGING_SDT_Page09);
      AddObjectProperty("PAGE10", gxTv_SdtA_PAGING_SDT_Page10);
      AddObjectProperty("PAGE_DISP01", gxTv_SdtA_PAGING_SDT_Page_disp01);
      AddObjectProperty("PAGE_DISP02", gxTv_SdtA_PAGING_SDT_Page_disp02);
      AddObjectProperty("PAGE_DISP03", gxTv_SdtA_PAGING_SDT_Page_disp03);
      AddObjectProperty("PAGE_DISP04", gxTv_SdtA_PAGING_SDT_Page_disp04);
      AddObjectProperty("PAGE_DISP05", gxTv_SdtA_PAGING_SDT_Page_disp05);
      AddObjectProperty("PAGE_DISP06", gxTv_SdtA_PAGING_SDT_Page_disp06);
      AddObjectProperty("PAGE_DISP07", gxTv_SdtA_PAGING_SDT_Page_disp07);
      AddObjectProperty("PAGE_DISP08", gxTv_SdtA_PAGING_SDT_Page_disp08);
      AddObjectProperty("PAGE_DISP09", gxTv_SdtA_PAGING_SDT_Page_disp09);
      AddObjectProperty("PAGE_DISP10", gxTv_SdtA_PAGING_SDT_Page_disp10);
      AddObjectProperty("PAGE_DISP_BACK", gxTv_SdtA_PAGING_SDT_Page_disp_back);
      AddObjectProperty("PAGE_DISP_NEXT", gxTv_SdtA_PAGING_SDT_Page_disp_next);
      AddObjectProperty("PAGE_DISP_FIRST", gxTv_SdtA_PAGING_SDT_Page_disp_first);
      AddObjectProperty("PAGE_DISP_LAST", gxTv_SdtA_PAGING_SDT_Page_disp_last);
      AddObjectProperty("PAGE_DISP_AREA", gxTv_SdtA_PAGING_SDT_Page_disp_area);
   }

   public short getgxTv_SdtA_PAGING_SDT_Max_row( )
   {
      return gxTv_SdtA_PAGING_SDT_Max_row ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Max_row( short value )
   {
      gxTv_SdtA_PAGING_SDT_Max_row = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Max_row_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Max_row = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Max_row_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Max_page( )
   {
      return gxTv_SdtA_PAGING_SDT_Max_page ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Max_page( short value )
   {
      gxTv_SdtA_PAGING_SDT_Max_page = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Max_page_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Max_page = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Max_page_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtA_PAGING_SDT_Rec_cnt( )
   {
      return gxTv_SdtA_PAGING_SDT_Rec_cnt ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Rec_cnt( long value )
   {
      gxTv_SdtA_PAGING_SDT_Rec_cnt = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Rec_cnt_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Rec_cnt = 0 ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Rec_cnt_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page_no( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_no ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_no( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page_no = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_no_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_no = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_no_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page01( )
   {
      return gxTv_SdtA_PAGING_SDT_Page01 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page01( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page01 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page01_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page01 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page01_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page02( )
   {
      return gxTv_SdtA_PAGING_SDT_Page02 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page02( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page02 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page02_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page02 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page02_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page03( )
   {
      return gxTv_SdtA_PAGING_SDT_Page03 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page03( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page03 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page03_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page03 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page03_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page04( )
   {
      return gxTv_SdtA_PAGING_SDT_Page04 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page04( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page04 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page04_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page04 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page04_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page05( )
   {
      return gxTv_SdtA_PAGING_SDT_Page05 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page05( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page05 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page05_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page05 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page05_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page06( )
   {
      return gxTv_SdtA_PAGING_SDT_Page06 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page06( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page06 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page06_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page06 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page06_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page07( )
   {
      return gxTv_SdtA_PAGING_SDT_Page07 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page07( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page07 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page07_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page07 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page07_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page08( )
   {
      return gxTv_SdtA_PAGING_SDT_Page08 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page08( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page08 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page08_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page08 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page08_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page09( )
   {
      return gxTv_SdtA_PAGING_SDT_Page09 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page09( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page09 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page09_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page09 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page09_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtA_PAGING_SDT_Page10( )
   {
      return gxTv_SdtA_PAGING_SDT_Page10 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page10( short value )
   {
      gxTv_SdtA_PAGING_SDT_Page10 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page10_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page10 = (short)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page10_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp01( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp01 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp01( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp01 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp01_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp01 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp01_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp02( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp02 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp02( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp02 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp02_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp02 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp02_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp03( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp03 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp03( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp03 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp03_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp03 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp03_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp04( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp04 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp04( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp04 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp04_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp04 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp04_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp05( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp05 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp05( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp05 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp05_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp05 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp05_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp06( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp06 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp06( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp06 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp06_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp06 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp06_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp07( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp07 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp07( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp07 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp07_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp07 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp07_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp08( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp08 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp08( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp08 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp08_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp08 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp08_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp09( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp09 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp09( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp09 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp09_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp09 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp09_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp10( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp10 ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp10( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp10 = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp10_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp10 = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp10_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp_back( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp_back ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_back( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_back = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_back_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_back = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp_back_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp_next( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp_next ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_next( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_next = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_next_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_next = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp_next_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp_first( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp_first ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_first( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_first = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_first_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_first = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp_first_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp_last( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp_last ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_last( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_last = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_last_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_last = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp_last_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtA_PAGING_SDT_Page_disp_area( )
   {
      return gxTv_SdtA_PAGING_SDT_Page_disp_area ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_area( byte value )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_area = value ;
   }

   public void setgxTv_SdtA_PAGING_SDT_Page_disp_area_SetNull( )
   {
      gxTv_SdtA_PAGING_SDT_Page_disp_area = (byte)(0) ;
   }

   public boolean getgxTv_SdtA_PAGING_SDT_Page_disp_area_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public SdtA_PAGING_SDT Clone( )
   {
      return (SdtA_PAGING_SDT)(clone()) ;
   }

   public void setStruct( StructSdtA_PAGING_SDT struct )
   {
      setgxTv_SdtA_PAGING_SDT_Max_row(struct.getMax_row());
      setgxTv_SdtA_PAGING_SDT_Max_page(struct.getMax_page());
      setgxTv_SdtA_PAGING_SDT_Rec_cnt(struct.getRec_cnt());
      setgxTv_SdtA_PAGING_SDT_Page_no(struct.getPage_no());
      setgxTv_SdtA_PAGING_SDT_Page01(struct.getPage01());
      setgxTv_SdtA_PAGING_SDT_Page02(struct.getPage02());
      setgxTv_SdtA_PAGING_SDT_Page03(struct.getPage03());
      setgxTv_SdtA_PAGING_SDT_Page04(struct.getPage04());
      setgxTv_SdtA_PAGING_SDT_Page05(struct.getPage05());
      setgxTv_SdtA_PAGING_SDT_Page06(struct.getPage06());
      setgxTv_SdtA_PAGING_SDT_Page07(struct.getPage07());
      setgxTv_SdtA_PAGING_SDT_Page08(struct.getPage08());
      setgxTv_SdtA_PAGING_SDT_Page09(struct.getPage09());
      setgxTv_SdtA_PAGING_SDT_Page10(struct.getPage10());
      setgxTv_SdtA_PAGING_SDT_Page_disp01(struct.getPage_disp01());
      setgxTv_SdtA_PAGING_SDT_Page_disp02(struct.getPage_disp02());
      setgxTv_SdtA_PAGING_SDT_Page_disp03(struct.getPage_disp03());
      setgxTv_SdtA_PAGING_SDT_Page_disp04(struct.getPage_disp04());
      setgxTv_SdtA_PAGING_SDT_Page_disp05(struct.getPage_disp05());
      setgxTv_SdtA_PAGING_SDT_Page_disp06(struct.getPage_disp06());
      setgxTv_SdtA_PAGING_SDT_Page_disp07(struct.getPage_disp07());
      setgxTv_SdtA_PAGING_SDT_Page_disp08(struct.getPage_disp08());
      setgxTv_SdtA_PAGING_SDT_Page_disp09(struct.getPage_disp09());
      setgxTv_SdtA_PAGING_SDT_Page_disp10(struct.getPage_disp10());
      setgxTv_SdtA_PAGING_SDT_Page_disp_back(struct.getPage_disp_back());
      setgxTv_SdtA_PAGING_SDT_Page_disp_next(struct.getPage_disp_next());
      setgxTv_SdtA_PAGING_SDT_Page_disp_first(struct.getPage_disp_first());
      setgxTv_SdtA_PAGING_SDT_Page_disp_last(struct.getPage_disp_last());
      setgxTv_SdtA_PAGING_SDT_Page_disp_area(struct.getPage_disp_area());
   }

   public StructSdtA_PAGING_SDT getStruct( )
   {
      StructSdtA_PAGING_SDT struct = new StructSdtA_PAGING_SDT ();
      struct.setMax_row(getgxTv_SdtA_PAGING_SDT_Max_row());
      struct.setMax_page(getgxTv_SdtA_PAGING_SDT_Max_page());
      struct.setRec_cnt(getgxTv_SdtA_PAGING_SDT_Rec_cnt());
      struct.setPage_no(getgxTv_SdtA_PAGING_SDT_Page_no());
      struct.setPage01(getgxTv_SdtA_PAGING_SDT_Page01());
      struct.setPage02(getgxTv_SdtA_PAGING_SDT_Page02());
      struct.setPage03(getgxTv_SdtA_PAGING_SDT_Page03());
      struct.setPage04(getgxTv_SdtA_PAGING_SDT_Page04());
      struct.setPage05(getgxTv_SdtA_PAGING_SDT_Page05());
      struct.setPage06(getgxTv_SdtA_PAGING_SDT_Page06());
      struct.setPage07(getgxTv_SdtA_PAGING_SDT_Page07());
      struct.setPage08(getgxTv_SdtA_PAGING_SDT_Page08());
      struct.setPage09(getgxTv_SdtA_PAGING_SDT_Page09());
      struct.setPage10(getgxTv_SdtA_PAGING_SDT_Page10());
      struct.setPage_disp01(getgxTv_SdtA_PAGING_SDT_Page_disp01());
      struct.setPage_disp02(getgxTv_SdtA_PAGING_SDT_Page_disp02());
      struct.setPage_disp03(getgxTv_SdtA_PAGING_SDT_Page_disp03());
      struct.setPage_disp04(getgxTv_SdtA_PAGING_SDT_Page_disp04());
      struct.setPage_disp05(getgxTv_SdtA_PAGING_SDT_Page_disp05());
      struct.setPage_disp06(getgxTv_SdtA_PAGING_SDT_Page_disp06());
      struct.setPage_disp07(getgxTv_SdtA_PAGING_SDT_Page_disp07());
      struct.setPage_disp08(getgxTv_SdtA_PAGING_SDT_Page_disp08());
      struct.setPage_disp09(getgxTv_SdtA_PAGING_SDT_Page_disp09());
      struct.setPage_disp10(getgxTv_SdtA_PAGING_SDT_Page_disp10());
      struct.setPage_disp_back(getgxTv_SdtA_PAGING_SDT_Page_disp_back());
      struct.setPage_disp_next(getgxTv_SdtA_PAGING_SDT_Page_disp_next());
      struct.setPage_disp_first(getgxTv_SdtA_PAGING_SDT_Page_disp_first());
      struct.setPage_disp_last(getgxTv_SdtA_PAGING_SDT_Page_disp_last());
      struct.setPage_disp_area(getgxTv_SdtA_PAGING_SDT_Page_disp_area());
      return struct ;
   }

   protected byte gxTv_SdtA_PAGING_SDT_Page_disp01 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp02 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp03 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp04 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp05 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp06 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp07 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp08 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp09 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp10 ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp_back ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp_next ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp_first ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp_last ;
   protected byte gxTv_SdtA_PAGING_SDT_Page_disp_area ;
   protected short gxTv_SdtA_PAGING_SDT_Max_row ;
   protected short gxTv_SdtA_PAGING_SDT_Max_page ;
   protected short gxTv_SdtA_PAGING_SDT_Page_no ;
   protected short gxTv_SdtA_PAGING_SDT_Page01 ;
   protected short gxTv_SdtA_PAGING_SDT_Page02 ;
   protected short gxTv_SdtA_PAGING_SDT_Page03 ;
   protected short gxTv_SdtA_PAGING_SDT_Page04 ;
   protected short gxTv_SdtA_PAGING_SDT_Page05 ;
   protected short gxTv_SdtA_PAGING_SDT_Page06 ;
   protected short gxTv_SdtA_PAGING_SDT_Page07 ;
   protected short gxTv_SdtA_PAGING_SDT_Page08 ;
   protected short gxTv_SdtA_PAGING_SDT_Page09 ;
   protected short gxTv_SdtA_PAGING_SDT_Page10 ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtA_PAGING_SDT_Rec_cnt ;
   protected String sTagName ;
}

