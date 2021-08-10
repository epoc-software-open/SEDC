/*
               File: SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem
        Description: B702_SD05_DOMAIN_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:44.20
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem( )
   {
      this(  new ModelContext(SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem.class));
   }

   public SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem( ModelContext context )
   {
      super( context, "SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem");
   }

   public SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem");
   }

   public SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem( StructSdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM37_CRF_ID") )
            {
               gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM37_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM37_DOM_CD") )
            {
               gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM37_DOM_VAR_NM") )
            {
               gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM37_DOM_ITM_GRP_ROWNO") )
            {
               gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM37_DOM_ITM_GRP_OID") )
            {
               gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid = oReader.getValue() ;
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
         sName = "B702_SD05_DOMAIN_INFO.B702_SD05_DOMAIN_INFOItem" ;
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
      oWriter.writeElement("TBM37_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM37_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM37_DOM_CD", GXutil.rtrim( gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM37_DOM_VAR_NM", GXutil.rtrim( gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM37_DOM_ITM_GRP_ROWNO", GXutil.trim( GXutil.str( gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM37_DOM_ITM_GRP_OID", GXutil.rtrim( gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid));
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
      AddObjectProperty("TBM37_CRF_ID", gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id, false);
      AddObjectProperty("TBM37_CRF_ITEM_GRP_CD", gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd, false);
      AddObjectProperty("TBM37_DOM_CD", gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd, false);
      AddObjectProperty("TBM37_DOM_VAR_NM", gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm, false);
      AddObjectProperty("TBM37_DOM_ITM_GRP_ROWNO", gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno, false);
      AddObjectProperty("TBM37_DOM_ITM_GRP_OID", gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid, false);
   }

   public short getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id( )
   {
      return gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id ;
   }

   public void setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id( short value )
   {
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id = value ;
   }

   public String getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd( )
   {
      return gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd ;
   }

   public void setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd( String value )
   {
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd( )
   {
      return gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd ;
   }

   public void setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd( String value )
   {
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd = value ;
   }

   public String getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm( )
   {
      return gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm ;
   }

   public void setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm( String value )
   {
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm = value ;
   }

   public short getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno( )
   {
      return gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno ;
   }

   public void setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno( short value )
   {
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno = value ;
   }

   public String getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid( )
   {
      return gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid ;
   }

   public void setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid( String value )
   {
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd = "" ;
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd = "" ;
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm = "" ;
      gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid = "" ;
      sTagName = "" ;
   }

   public SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem Clone( )
   {
      return (SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem)(clone()) ;
   }

   public void setStruct( StructSdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem struct )
   {
      setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id(struct.getTbm37_crf_id());
      setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd(struct.getTbm37_crf_item_grp_cd());
      setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd(struct.getTbm37_dom_cd());
      setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm(struct.getTbm37_dom_var_nm());
      setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno(struct.getTbm37_dom_itm_grp_rowno());
      setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid(struct.getTbm37_dom_itm_grp_oid());
   }

   public StructSdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem getStruct( )
   {
      StructSdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem struct = new StructSdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem ();
      struct.setTbm37_crf_id(getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id());
      struct.setTbm37_crf_item_grp_cd(getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd());
      struct.setTbm37_dom_cd(getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd());
      struct.setTbm37_dom_var_nm(getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm());
      struct.setTbm37_dom_itm_grp_rowno(getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno());
      struct.setTbm37_dom_itm_grp_oid(getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid());
      return struct ;
   }

   protected short gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id ;
   protected short gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd ;
   protected String gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd ;
   protected String gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm ;
   protected String gxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid ;
}

