/*
               File: SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem
        Description: B712_SD08_ICON_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:56.7
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem( )
   {
      this(  new ModelContext(SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem.class));
   }

   public SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem( ModelContext context )
   {
      super( context, "SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem");
   }

   public SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem");
   }

   public SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem( StructSdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AUTH_CD") )
            {
               gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AUTH_NM") )
            {
               gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ICON_CAPTION") )
            {
               gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ICON_R") )
            {
               gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ICON_G") )
            {
               gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ICON_B") )
            {
               gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B712_SD08_ICON_INFO.B712_SD08_ICON_INFOItem" ;
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
      oWriter.writeElement("AUTH_CD", GXutil.rtrim( gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("AUTH_NM", GXutil.rtrim( gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ICON_CAPTION", GXutil.rtrim( gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ICON_R", GXutil.trim( GXutil.str( gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ICON_G", GXutil.trim( GXutil.str( gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ICON_B", GXutil.trim( GXutil.str( gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("AUTH_CD", gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd, false);
      AddObjectProperty("AUTH_NM", gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm, false);
      AddObjectProperty("ICON_CAPTION", gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption, false);
      AddObjectProperty("ICON_R", gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r, false);
      AddObjectProperty("ICON_G", gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g, false);
      AddObjectProperty("ICON_B", gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b, false);
   }

   public String getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd ;
   }

   public void setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd( String value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd = value ;
   }

   public String getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm ;
   }

   public void setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm( String value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm = value ;
   }

   public String getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption ;
   }

   public void setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption( String value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption = value ;
   }

   public short getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r ;
   }

   public void setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r( short value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r = value ;
   }

   public short getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g ;
   }

   public void setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g( short value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g = value ;
   }

   public short getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b( )
   {
      return gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b ;
   }

   public void setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b( short value )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd = "" ;
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm = "" ;
      gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption = "" ;
      sTagName = "" ;
   }

   public SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem Clone( )
   {
      return (SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem struct )
   {
      setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd(struct.getAuth_cd());
      setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm(struct.getAuth_nm());
      setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption(struct.getIcon_caption());
      setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(struct.getIcon_r());
      setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(struct.getIcon_g());
      setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b(struct.getIcon_b());
   }

   public StructSdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem getStruct( )
   {
      StructSdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem struct = new StructSdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem ();
      struct.setAuth_cd(getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd());
      struct.setAuth_nm(getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm());
      struct.setIcon_caption(getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption());
      struct.setIcon_r(getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r());
      struct.setIcon_g(getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g());
      struct.setIcon_b(getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b());
      return struct ;
   }

   protected short gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r ;
   protected short gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g ;
   protected short gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd ;
   protected String gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm ;
   protected String gxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption ;
}

