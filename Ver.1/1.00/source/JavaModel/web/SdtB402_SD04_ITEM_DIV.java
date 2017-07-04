import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB402_SD04_ITEM_DIV extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB402_SD04_ITEM_DIV( )
   {
      this(  new ModelContext(SdtB402_SD04_ITEM_DIV.class));
   }

   public SdtB402_SD04_ITEM_DIV( ModelContext context )
   {
      super( context, "SdtB402_SD04_ITEM_DIV");
   }

   public SdtB402_SD04_ITEM_DIV( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtB402_SD04_ITEM_DIV");
   }

   public SdtB402_SD04_ITEM_DIV( StructSdtB402_SD04_ITEM_DIV struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_IMTE_DIV") )
            {
               gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "USE_CONFING") )
            {
               gxTv_SdtB402_SD04_ITEM_DIV_Use_confing = oReader.getValue() ;
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
         sName = "B402_SD04_ITEM_DIV" ;
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
      oWriter.writeElement("CRF_IMTE_DIV", GXutil.rtrim( gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("USE_CONFING", GXutil.rtrim( gxTv_SdtB402_SD04_ITEM_DIV_Use_confing));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("CRF_IMTE_DIV", gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div);
      AddObjectProperty("USE_CONFING", gxTv_SdtB402_SD04_ITEM_DIV_Use_confing);
   }

   public String getgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div( )
   {
      return gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div ;
   }

   public void setgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div( String value )
   {
      gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div = value ;
   }

   public void setgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div_SetNull( )
   {
      gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div = "" ;
   }

   public boolean getgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing( )
   {
      return gxTv_SdtB402_SD04_ITEM_DIV_Use_confing ;
   }

   public void setgxTv_SdtB402_SD04_ITEM_DIV_Use_confing( String value )
   {
      gxTv_SdtB402_SD04_ITEM_DIV_Use_confing = value ;
   }

   public void setgxTv_SdtB402_SD04_ITEM_DIV_Use_confing_SetNull( )
   {
      gxTv_SdtB402_SD04_ITEM_DIV_Use_confing = "" ;
   }

   public boolean getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div = "" ;
      gxTv_SdtB402_SD04_ITEM_DIV_Use_confing = "" ;
      sTagName = "" ;
   }

   public SdtB402_SD04_ITEM_DIV Clone( )
   {
      return (SdtB402_SD04_ITEM_DIV)(clone()) ;
   }

   public void setStruct( StructSdtB402_SD04_ITEM_DIV struct )
   {
      setgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div(struct.getCrf_imte_div());
      setgxTv_SdtB402_SD04_ITEM_DIV_Use_confing(struct.getUse_confing());
   }

   public StructSdtB402_SD04_ITEM_DIV getStruct( )
   {
      StructSdtB402_SD04_ITEM_DIV struct = new StructSdtB402_SD04_ITEM_DIV ();
      struct.setCrf_imte_div(getgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div());
      struct.setUse_confing(getgxTv_SdtB402_SD04_ITEM_DIV_Use_confing());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div ;
   protected String gxTv_SdtB402_SD04_ITEM_DIV_Use_confing ;
}

