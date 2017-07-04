import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem( )
   {
      this(  new ModelContext(SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem.class));
   }

   public SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem( ModelContext context )
   {
      super( context, "SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem");
   }

   public SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem");
   }

   public SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem( StructSdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_CD") )
            {
               gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_VAR_NM") )
            {
               gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ORDER") )
            {
               gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VALUE") )
            {
               gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value = oReader.getValue() ;
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
         sName = "B514_SD01_CSV_DOM.B514_SD01_CSV_DOMItem" ;
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
      oWriter.writeElement("DOM_CD", GXutil.rtrim( gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("DOM_VAR_NM", GXutil.rtrim( gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("ORDER", GXutil.trim( GXutil.str( gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("VALUE", GXutil.rtrim( gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("DOM_CD", gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd);
      AddObjectProperty("DOM_VAR_NM", gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm);
      AddObjectProperty("ORDER", gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order);
      AddObjectProperty("VALUE", gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value);
   }

   public String getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd( )
   {
      return gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd ;
   }

   public void setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd( String value )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd = value ;
   }

   public void setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd_SetNull( )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd = "" ;
   }

   public boolean getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm( )
   {
      return gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm ;
   }

   public void setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm( String value )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm = value ;
   }

   public void setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm_SetNull( )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm = "" ;
   }

   public boolean getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order( )
   {
      return gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order ;
   }

   public void setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order( int value )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order = value ;
   }

   public void setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order_SetNull( )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order = 0 ;
   }

   public boolean getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value( )
   {
      return gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value ;
   }

   public void setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value( String value )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value = value ;
   }

   public void setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value_SetNull( )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value = "" ;
   }

   public boolean getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd = "" ;
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm = "" ;
      gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value = "" ;
      sTagName = "" ;
   }

   public SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem Clone( )
   {
      return (SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem)(clone()) ;
   }

   public void setStruct( StructSdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem struct )
   {
      setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd(struct.getDom_cd());
      setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm(struct.getDom_var_nm());
      setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order(struct.getOrder());
      setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value(struct.getValue());
   }

   public StructSdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem getStruct( )
   {
      StructSdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem struct = new StructSdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem ();
      struct.setDom_cd(getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd());
      struct.setDom_var_nm(getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm());
      struct.setOrder(getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order());
      struct.setValue(getgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order ;
   protected String sTagName ;
   protected String gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd ;
   protected String gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm ;
   protected String gxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Value ;
}

