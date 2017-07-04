import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB602_SD05_METACONTENT_LIST extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD05_METACONTENT_LIST( )
   {
      this(  new ModelContext(SdtB602_SD05_METACONTENT_LIST.class));
   }

   public SdtB602_SD05_METACONTENT_LIST( ModelContext context )
   {
      super( context, "SdtB602_SD05_METACONTENT_LIST");
   }

   public SdtB602_SD05_METACONTENT_LIST( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD05_METACONTENT_LIST");
   }

   public SdtB602_SD05_METACONTENT_LIST( StructSdtB602_SD05_METACONTENT_LIST struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT") )
            {
               if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Result == null )
               {
                  gxTv_SdtB602_SD05_METACONTENT_LIST_Result = new SdtB602_SD05_METACONTENT_LIST_RESULT(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB602_SD05_METACONTENT_LIST_Result.readxml(oReader, "RESULT") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CONTENT_HEADER") )
            {
               if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header == null )
               {
                  gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header = new SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header.readxml(oReader, "CONTENT_HEADER") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "METACONTENT") )
            {
               if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent == null )
               {
                  gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent = new GxObjectCollection(SdtB602_SD05_METACONTENT_LIST_METACONTENTItem.class, "B602_SD05_METACONTENT_LIST.METACONTENTItem", "SmartEDC_SHIZUOKA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent.readxmlcollection(oReader, "METACONTENT", "METACONTENTItem") ;
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
         sName = "B602_SD05_METACONTENT_LIST" ;
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
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Result != null )
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
         gxTv_SdtB602_SD05_METACONTENT_LIST_Result.writexml(oWriter, "RESULT", sNameSpace1);
      }
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header != null )
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
         gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header.writexml(oWriter, "CONTENT_HEADER", sNameSpace1);
      }
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent != null )
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
         gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent.writexmlcollection(oWriter, "METACONTENT", sNameSpace1, "METACONTENTItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Result != null )
      {
         AddObjectProperty("RESULT", gxTv_SdtB602_SD05_METACONTENT_LIST_Result);
      }
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header != null )
      {
         AddObjectProperty("CONTENT_HEADER", gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header);
      }
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent != null )
      {
         AddObjectProperty("METACONTENT", gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent);
      }
   }

   public SdtB602_SD05_METACONTENT_LIST_RESULT getgxTv_SdtB602_SD05_METACONTENT_LIST_Result( )
   {
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Result == null )
      {
         gxTv_SdtB602_SD05_METACONTENT_LIST_Result = new SdtB602_SD05_METACONTENT_LIST_RESULT(remoteHandle, context);
      }
      return gxTv_SdtB602_SD05_METACONTENT_LIST_Result ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_Result( SdtB602_SD05_METACONTENT_LIST_RESULT value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Result = value;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_Result_SetNull( )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Result = (SdtB602_SD05_METACONTENT_LIST_RESULT)null;
   }

   public boolean getgxTv_SdtB602_SD05_METACONTENT_LIST_Result_IsNull( )
   {
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Result == null )
      {
         return true ;
      }
      return false ;
   }

   public SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER getgxTv_SdtB602_SD05_METACONTENT_LIST_Content_header( )
   {
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header == null )
      {
         gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header = new SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER(remoteHandle, context);
      }
      return gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_Content_header( SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header = value;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_Content_header_SetNull( )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header = (SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER)null;
   }

   public boolean getgxTv_SdtB602_SD05_METACONTENT_LIST_Content_header_IsNull( )
   {
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header == null )
      {
         return true ;
      }
      return false ;
   }

   public GxObjectCollection getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent( )
   {
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent == null )
      {
         gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent = new GxObjectCollection(SdtB602_SD05_METACONTENT_LIST_METACONTENTItem.class, "B602_SD05_METACONTENT_LIST.METACONTENTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      }
      return gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent( GxObjectCollection value )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent = value ;
   }

   public void setgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent_SetNull( )
   {
      gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent = null ;
   }

   public boolean getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent_IsNull( )
   {
      if ( gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent == null )
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
      sTagName = "" ;
   }

   public SdtB602_SD05_METACONTENT_LIST Clone( )
   {
      return (SdtB602_SD05_METACONTENT_LIST)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD05_METACONTENT_LIST struct )
   {
      setgxTv_SdtB602_SD05_METACONTENT_LIST_Result(new SdtB602_SD05_METACONTENT_LIST_RESULT(struct.getResult()));
      setgxTv_SdtB602_SD05_METACONTENT_LIST_Content_header(new SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER(struct.getContent_header()));
      setgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent(new GxObjectCollection(SdtB602_SD05_METACONTENT_LIST_METACONTENTItem.class, "B602_SD05_METACONTENT_LIST.METACONTENTItem", "SmartEDC_SHIZUOKA", struct.getMetacontent(), remoteHandle));
   }

   public StructSdtB602_SD05_METACONTENT_LIST getStruct( )
   {
      StructSdtB602_SD05_METACONTENT_LIST struct = new StructSdtB602_SD05_METACONTENT_LIST ();
      struct.setResult(getgxTv_SdtB602_SD05_METACONTENT_LIST_Result().getStruct());
      struct.setContent_header(getgxTv_SdtB602_SD05_METACONTENT_LIST_Content_header().getStruct());
      struct.setMetacontent(getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected GxObjectCollection gxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent=null ;
   protected SdtB602_SD05_METACONTENT_LIST_RESULT gxTv_SdtB602_SD05_METACONTENT_LIST_Result=null ;
   protected SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER gxTv_SdtB602_SD05_METACONTENT_LIST_Content_header=null ;
}

