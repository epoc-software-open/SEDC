import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB705_SD01_ERRCHK_RES extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB705_SD01_ERRCHK_RES( )
   {
      this(  new ModelContext(SdtB705_SD01_ERRCHK_RES.class));
   }

   public SdtB705_SD01_ERRCHK_RES( ModelContext context )
   {
      super( context, "SdtB705_SD01_ERRCHK_RES");
   }

   public SdtB705_SD01_ERRCHK_RES( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtB705_SD01_ERRCHK_RES");
   }

   public SdtB705_SD01_ERRCHK_RES( StructSdtB705_SD01_ERRCHK_RES struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT_CD") )
            {
               gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_ITEMS") )
            {
               if ( gxTv_SdtB705_SD01_ERRCHK_RES_Err_items == null )
               {
                  gxTv_SdtB705_SD01_ERRCHK_RES_Err_items = new GxObjectCollection(SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem.class, "B705_SD02_ERRCHK_ITEM.B705_SD02_ERRCHK_ITEMItem", "SmartEDC_SHIZUOKA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB705_SD01_ERRCHK_RES_Err_items.readxml(oReader, "ERR_ITEMS") ;
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
         sName = "B705_SD01_ERRCHK_RES" ;
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
      oWriter.writeElement("RESULT_CD", GXutil.rtrim( gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( gxTv_SdtB705_SD01_ERRCHK_RES_Err_items != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "SmartEDC_SHIZUOKA" ;
         }
         else
         {
            sNameSpace1 = "SmartEDC_SHIZUOKA" ;
         }
         gxTv_SdtB705_SD01_ERRCHK_RES_Err_items.writexml(oWriter, "ERR_ITEMS", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("RESULT_CD", gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd);
      if ( gxTv_SdtB705_SD01_ERRCHK_RES_Err_items != null )
      {
         AddObjectProperty("ERR_ITEMS", gxTv_SdtB705_SD01_ERRCHK_RES_Err_items);
      }
   }

   public String getgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd( )
   {
      return gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd ;
   }

   public void setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd( String value )
   {
      gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd = value ;
   }

   public void setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd_SetNull( )
   {
      gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd = "" ;
   }

   public boolean getgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd_IsNull( )
   {
      return false ;
   }

   public GxObjectCollection getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items( )
   {
      if ( gxTv_SdtB705_SD01_ERRCHK_RES_Err_items == null )
      {
         gxTv_SdtB705_SD01_ERRCHK_RES_Err_items = new GxObjectCollection(SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem.class, "B705_SD02_ERRCHK_ITEM.B705_SD02_ERRCHK_ITEMItem", "SmartEDC_SHIZUOKA", remoteHandle);
      }
      return gxTv_SdtB705_SD01_ERRCHK_RES_Err_items ;
   }

   public void setgxTv_SdtB705_SD01_ERRCHK_RES_Err_items( GxObjectCollection value )
   {
      gxTv_SdtB705_SD01_ERRCHK_RES_Err_items = value ;
   }

   public void setgxTv_SdtB705_SD01_ERRCHK_RES_Err_items_SetNull( )
   {
      gxTv_SdtB705_SD01_ERRCHK_RES_Err_items = null ;
   }

   public boolean getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items_IsNull( )
   {
      if ( gxTv_SdtB705_SD01_ERRCHK_RES_Err_items == null )
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
      gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd = "" ;
      sTagName = "" ;
   }

   public SdtB705_SD01_ERRCHK_RES Clone( )
   {
      return (SdtB705_SD01_ERRCHK_RES)(clone()) ;
   }

   public void setStruct( StructSdtB705_SD01_ERRCHK_RES struct )
   {
      setgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd(struct.getResult_cd());
      setgxTv_SdtB705_SD01_ERRCHK_RES_Err_items(new GxObjectCollection(SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem.class, "B705_SD02_ERRCHK_ITEM.B705_SD02_ERRCHK_ITEMItem", "SmartEDC_SHIZUOKA", struct.getErr_items(), remoteHandle));
   }

   public StructSdtB705_SD01_ERRCHK_RES getStruct( )
   {
      StructSdtB705_SD01_ERRCHK_RES struct = new StructSdtB705_SD01_ERRCHK_RES ();
      struct.setResult_cd(getgxTv_SdtB705_SD01_ERRCHK_RES_Result_cd());
      struct.setErr_items(getgxTv_SdtB705_SD01_ERRCHK_RES_Err_items().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd ;
   protected GxObjectCollection gxTv_SdtB705_SD01_ERRCHK_RES_Err_items=null ;
}

