import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem( )
   {
      this(  new ModelContext(SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem.class));
   }

   public SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem( ModelContext context )
   {
      super( context, "SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem");
   }

   public SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem");
   }

   public SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem( StructSdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DATA_KBN") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN01_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN02_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN03_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN04_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN05_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN06_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN07_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN08_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN09_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KNGN10_VISIBLE") )
            {
               gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B712_SD07_INPUT_DISP.B712_SD07_INPUT_DISPItem" ;
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
      oWriter.writeElement("DATA_KBN", GXutil.rtrim( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN01_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN02_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN03_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN04_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN05_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN06_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN07_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN08_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN09_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KNGN10_VISIBLE", GXutil.trim( GXutil.str( gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("DATA_KBN", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn);
      AddObjectProperty("KNGN01_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible);
      AddObjectProperty("KNGN02_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible);
      AddObjectProperty("KNGN03_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible);
      AddObjectProperty("KNGN04_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible);
      AddObjectProperty("KNGN05_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible);
      AddObjectProperty("KNGN06_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible);
      AddObjectProperty("KNGN07_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible);
      AddObjectProperty("KNGN08_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible);
      AddObjectProperty("KNGN09_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible);
      AddObjectProperty("KNGN10_VISIBLE", gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible);
   }

   public String getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn( String value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn = "" ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible( )
   {
      return gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible( short value )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible = value ;
   }

   public void setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible_SetNull( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn = "" ;
      sTagName = "" ;
   }

   public SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem Clone( )
   {
      return (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem struct )
   {
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn(struct.getData_kbn());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible(struct.getKngn01_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible(struct.getKngn02_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible(struct.getKngn03_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible(struct.getKngn04_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible(struct.getKngn05_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible(struct.getKngn06_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible(struct.getKngn07_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible(struct.getKngn08_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible(struct.getKngn09_visible());
      setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible(struct.getKngn10_visible());
   }

   public StructSdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem getStruct( )
   {
      StructSdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem struct = new StructSdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem ();
      struct.setData_kbn(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn());
      struct.setKngn01_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible());
      struct.setKngn02_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible());
      struct.setKngn03_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible());
      struct.setKngn04_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible());
      struct.setKngn05_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible());
      struct.setKngn06_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible());
      struct.setKngn07_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible());
      struct.setKngn08_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible());
      struct.setKngn09_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible());
      struct.setKngn10_visible(getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible());
      return struct ;
   }

   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible ;
   protected short gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn ;
}

