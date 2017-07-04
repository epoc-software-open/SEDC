/*
               File: SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem
        Description: B705_SD02_ERRCHK_ITEM
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:57.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem( )
   {
      this(  new ModelContext(SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem.class));
   }

   public SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem( ModelContext context )
   {
      super( context, "SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem");
   }

   public SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem");
   }

   public SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem( StructSdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_MSG") )
            {
               gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg = oReader.getValue() ;
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
         sName = "B705_SD02_ERRCHK_ITEM.B705_SD02_ERRCHK_ITEMItem" ;
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
      oWriter.writeElement("CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ERR_MSG", GXutil.rtrim( gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg));
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
      AddObjectProperty("CRF_ITEM_GRP_CD", gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd, false);
      AddObjectProperty("ERR_MSG", gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg, false);
   }

   public String getgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd( )
   {
      return gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd ;
   }

   public void setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd( String value )
   {
      gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( )
   {
      return gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg ;
   }

   public void setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg( String value )
   {
      gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd = "" ;
      gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg = "" ;
      sTagName = "" ;
   }

   public SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem Clone( )
   {
      return (SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem)(clone()) ;
   }

   public void setStruct( StructSdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem struct )
   {
      setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd(struct.getCrf_item_grp_cd());
      setgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg(struct.getErr_msg());
   }

   public StructSdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem getStruct( )
   {
      StructSdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem struct = new StructSdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem ();
      struct.setCrf_item_grp_cd(getgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd());
      struct.setErr_msg(getgxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Crf_item_grp_cd ;
   protected String gxTv_SdtB705_SD02_ERRCHK_ITEM_B705_SD02_ERRCHK_ITEMItem_Err_msg ;
}

