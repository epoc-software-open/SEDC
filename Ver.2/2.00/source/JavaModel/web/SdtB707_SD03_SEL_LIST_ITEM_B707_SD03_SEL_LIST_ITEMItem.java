/*
               File: SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem
        Description: B707_SD03_SEL_LIST_ITEM
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem( )
   {
      this(  new ModelContext(SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem.class));
   }

   public SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem( ModelContext context )
   {
      super( context, "SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem");
   }

   public SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem( int remoteHandle ,
                                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem");
   }

   public SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem( StructSdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RNRK_NO") )
            {
               gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RNRK_USER_ID") )
            {
               gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RNRK_USER_NM") )
            {
               gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm = oReader.getValue() ;
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
         sName = "B707_SD03_SEL_LIST_ITEM.B707_SD03_SEL_LIST_ITEMItem" ;
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
      oWriter.writeElement("RNRK_NO", GXutil.trim( GXutil.str( gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("RNRK_USER_ID", GXutil.rtrim( gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("RNRK_USER_NM", GXutil.rtrim( gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm));
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
      AddObjectProperty("RNRK_NO", gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no, false);
      AddObjectProperty("RNRK_USER_ID", gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id, false);
      AddObjectProperty("RNRK_USER_NM", gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm, false);
   }

   public long getgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no( )
   {
      return gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no ;
   }

   public void setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no( long value )
   {
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no = value ;
   }

   public String getgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id( )
   {
      return gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id ;
   }

   public void setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id( String value )
   {
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id = value ;
   }

   public String getgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm( )
   {
      return gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm ;
   }

   public void setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm( String value )
   {
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id = "" ;
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm = "" ;
      sTagName = "" ;
   }

   public SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem Clone( )
   {
      return (SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem)(clone()) ;
   }

   public void setStruct( StructSdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem struct )
   {
      setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no(struct.getRnrk_no());
      setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id(struct.getRnrk_user_id());
      setgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm(struct.getRnrk_user_nm());
   }

   public StructSdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem getStruct( )
   {
      StructSdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem struct = new StructSdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem ();
      struct.setRnrk_no(getgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no());
      struct.setRnrk_user_id(getgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id());
      struct.setRnrk_user_nm(getgxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no ;
   protected String sTagName ;
   protected String gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id ;
   protected String gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm ;
}

