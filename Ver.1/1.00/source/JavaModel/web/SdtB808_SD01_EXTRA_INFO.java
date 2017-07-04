import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB808_SD01_EXTRA_INFO extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB808_SD01_EXTRA_INFO( )
   {
      this(  new ModelContext(SdtB808_SD01_EXTRA_INFO.class));
   }

   public SdtB808_SD01_EXTRA_INFO( ModelContext context )
   {
      super( context, "SdtB808_SD01_EXTRA_INFO");
   }

   public SdtB808_SD01_EXTRA_INFO( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtB808_SD01_EXTRA_INFO");
   }

   public SdtB808_SD01_EXTRA_INFO( StructSdtB808_SD01_EXTRA_INFO struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "APP_ID") )
            {
               gxTv_SdtB808_SD01_EXTRA_INFO_App_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PARMS") )
            {
               if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms == null )
               {
                  gxTv_SdtB808_SD01_EXTRA_INFO_Parms = new GxObjectCollection(SdtB808_SD01_EXTRA_INFO_PARMSItem.class, "B808_SD01_EXTRA_INFO.PARMSItem", "SmartEDC_SHIZUOKA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtB808_SD01_EXTRA_INFO_Parms.readxmlcollection(oReader, "PARMS", "PARMSItem") ;
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
         sName = "B808_SD01_EXTRA_INFO" ;
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
      oWriter.writeElement("APP_ID", GXutil.rtrim( gxTv_SdtB808_SD01_EXTRA_INFO_App_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms != null )
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
         gxTv_SdtB808_SD01_EXTRA_INFO_Parms.writexmlcollection(oWriter, "PARMS", sNameSpace1, "PARMSItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("APP_ID", gxTv_SdtB808_SD01_EXTRA_INFO_App_id);
      if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms != null )
      {
         AddObjectProperty("PARMS", gxTv_SdtB808_SD01_EXTRA_INFO_Parms);
      }
   }

   public String getgxTv_SdtB808_SD01_EXTRA_INFO_App_id( )
   {
      return gxTv_SdtB808_SD01_EXTRA_INFO_App_id ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( String value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_App_id = value ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_App_id_SetNull( )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_App_id = "" ;
   }

   public boolean getgxTv_SdtB808_SD01_EXTRA_INFO_App_id_IsNull( )
   {
      return false ;
   }

   public GxObjectCollection getgxTv_SdtB808_SD01_EXTRA_INFO_Parms( )
   {
      if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms == null )
      {
         gxTv_SdtB808_SD01_EXTRA_INFO_Parms = new GxObjectCollection(SdtB808_SD01_EXTRA_INFO_PARMSItem.class, "B808_SD01_EXTRA_INFO.PARMSItem", "SmartEDC_SHIZUOKA", remoteHandle);
      }
      return gxTv_SdtB808_SD01_EXTRA_INFO_Parms ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_Parms( GxObjectCollection value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_Parms = value ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_Parms_SetNull( )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_Parms = null ;
   }

   public boolean getgxTv_SdtB808_SD01_EXTRA_INFO_Parms_IsNull( )
   {
      if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms == null )
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
      gxTv_SdtB808_SD01_EXTRA_INFO_App_id = "" ;
      sTagName = "" ;
   }

   public SdtB808_SD01_EXTRA_INFO Clone( )
   {
      return (SdtB808_SD01_EXTRA_INFO)(clone()) ;
   }

   public void setStruct( StructSdtB808_SD01_EXTRA_INFO struct )
   {
      setgxTv_SdtB808_SD01_EXTRA_INFO_App_id(struct.getApp_id());
      setgxTv_SdtB808_SD01_EXTRA_INFO_Parms(new GxObjectCollection(SdtB808_SD01_EXTRA_INFO_PARMSItem.class, "B808_SD01_EXTRA_INFO.PARMSItem", "SmartEDC_SHIZUOKA", struct.getParms(), remoteHandle));
   }

   public StructSdtB808_SD01_EXTRA_INFO getStruct( )
   {
      StructSdtB808_SD01_EXTRA_INFO struct = new StructSdtB808_SD01_EXTRA_INFO ();
      struct.setApp_id(getgxTv_SdtB808_SD01_EXTRA_INFO_App_id());
      struct.setParms(getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB808_SD01_EXTRA_INFO_App_id ;
   protected GxObjectCollection gxTv_SdtB808_SD01_EXTRA_INFO_Parms=null ;
}

