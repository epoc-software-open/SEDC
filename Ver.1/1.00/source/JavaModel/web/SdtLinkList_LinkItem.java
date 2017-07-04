import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtLinkList_LinkItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtLinkList_LinkItem( )
   {
      this(  new ModelContext(SdtLinkList_LinkItem.class));
   }

   public SdtLinkList_LinkItem( ModelContext context )
   {
      super( context, "SdtLinkList_LinkItem");
   }

   public SdtLinkList_LinkItem( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtLinkList_LinkItem");
   }

   public SdtLinkList_LinkItem( StructSdtLinkList_LinkItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Caption") )
            {
               gxTv_SdtLinkList_LinkItem_Caption = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "URL") )
            {
               gxTv_SdtLinkList_LinkItem_Url = oReader.getValue() ;
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
         sName = "LinkList.LinkItem" ;
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
      oWriter.writeElement("Caption", GXutil.rtrim( gxTv_SdtLinkList_LinkItem_Caption));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("URL", GXutil.rtrim( gxTv_SdtLinkList_LinkItem_Url));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("Caption", gxTv_SdtLinkList_LinkItem_Caption);
      AddObjectProperty("URL", gxTv_SdtLinkList_LinkItem_Url);
   }

   public String getgxTv_SdtLinkList_LinkItem_Caption( )
   {
      return gxTv_SdtLinkList_LinkItem_Caption ;
   }

   public void setgxTv_SdtLinkList_LinkItem_Caption( String value )
   {
      gxTv_SdtLinkList_LinkItem_Caption = value ;
   }

   public void setgxTv_SdtLinkList_LinkItem_Caption_SetNull( )
   {
      gxTv_SdtLinkList_LinkItem_Caption = "" ;
   }

   public boolean getgxTv_SdtLinkList_LinkItem_Caption_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtLinkList_LinkItem_Url( )
   {
      return gxTv_SdtLinkList_LinkItem_Url ;
   }

   public void setgxTv_SdtLinkList_LinkItem_Url( String value )
   {
      gxTv_SdtLinkList_LinkItem_Url = value ;
   }

   public void setgxTv_SdtLinkList_LinkItem_Url_SetNull( )
   {
      gxTv_SdtLinkList_LinkItem_Url = "" ;
   }

   public boolean getgxTv_SdtLinkList_LinkItem_Url_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtLinkList_LinkItem_Caption = "" ;
      gxTv_SdtLinkList_LinkItem_Url = "" ;
      sTagName = "" ;
   }

   public SdtLinkList_LinkItem Clone( )
   {
      return (SdtLinkList_LinkItem)(clone()) ;
   }

   public void setStruct( StructSdtLinkList_LinkItem struct )
   {
      setgxTv_SdtLinkList_LinkItem_Caption(struct.getCaption());
      setgxTv_SdtLinkList_LinkItem_Url(struct.getUrl());
   }

   public StructSdtLinkList_LinkItem getStruct( )
   {
      StructSdtLinkList_LinkItem struct = new StructSdtLinkList_LinkItem ();
      struct.setCaption(getgxTv_SdtLinkList_LinkItem_Caption());
      struct.setUrl(getgxTv_SdtLinkList_LinkItem_Url());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtLinkList_LinkItem_Caption ;
   protected String gxTv_SdtLinkList_LinkItem_Url ;
}

