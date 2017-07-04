import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( )
   {
      this(  new ModelContext(SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem.class));
   }

   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( ModelContext context )
   {
      super( context, "SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem");
   }

   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem");
   }

   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem( StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SUBJECT_ID") )
            {
               gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ID") )
            {
               gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SITE_ID") )
            {
               gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = oReader.getValue() ;
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
         sName = "B719_SD02_OPEN_CRF.B719_SD02_OPEN_CRFItem" ;
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
      oWriter.writeElement("SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("SITE_ID", GXutil.rtrim( gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("SUBJECT_ID", gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id);
      AddObjectProperty("CRF_ID", gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id);
      AddObjectProperty("SITE_ID", gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id);
   }

   public int getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id( int value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id = value ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id_SetNull( )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id = 0 ;
   }

   public boolean getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id( short value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id = value ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id_SetNull( )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id( )
   {
      return gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id( String value )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = value ;
   }

   public void setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id_SetNull( )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = "" ;
   }

   public boolean getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id = "" ;
      sTagName = "" ;
   }

   public SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem Clone( )
   {
      return (SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem)(clone()) ;
   }

   public void setStruct( StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem struct )
   {
      setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id(struct.getSubject_id());
      setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id(struct.getCrf_id());
      setgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id(struct.getSite_id());
   }

   public StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem getStruct( )
   {
      StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem struct = new StructSdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem ();
      struct.setSubject_id(getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id());
      struct.setCrf_id(getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id());
      struct.setSite_id(getgxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id());
      return struct ;
   }

   protected short gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Subject_id ;
   protected String sTagName ;
   protected String gxTv_SdtB719_SD02_OPEN_CRF_B719_SD02_OPEN_CRFItem_Site_id ;
}

