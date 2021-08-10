/*
               File: SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem
        Description: B716_SD3_DOM_VAR
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:45.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem( )
   {
      this(  new ModelContext(SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem.class));
   }

   public SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem( ModelContext context )
   {
      super( context, "SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem");
   }

   public SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem");
   }

   public SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem( StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_VAR_NM") )
            {
               gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd = oReader.getValue() ;
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
         sName = "B716_SD3_DOM_VAR.B716_SD3_DOM_VARItem" ;
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
      oWriter.writeElement("DOM_VAR_NM", GXutil.rtrim( gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd));
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
      AddObjectProperty("DOM_VAR_NM", gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm, false);
      AddObjectProperty("CRF_ITEM_GRP_CD", gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd, false);
   }

   public String getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm( )
   {
      return gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm ;
   }

   public void setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm( String value )
   {
      gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm = value ;
   }

   public String getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd( )
   {
      return gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd ;
   }

   public void setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd( String value )
   {
      gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm = "" ;
      gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd = "" ;
      sTagName = "" ;
   }

   public SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem Clone( )
   {
      return (SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)(clone()) ;
   }

   public void setStruct( StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem struct )
   {
      setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm(struct.getDom_var_nm());
      setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd(struct.getCrf_item_grp_cd());
   }

   public StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem getStruct( )
   {
      StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem struct = new StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem ();
      struct.setDom_var_nm(getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm());
      struct.setCrf_item_grp_cd(getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm ;
   protected String gxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd ;
}

