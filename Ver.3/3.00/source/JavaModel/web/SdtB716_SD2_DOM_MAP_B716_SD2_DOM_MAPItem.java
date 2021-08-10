/*
               File: SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem
        Description: B716_SD2_DOM_MAP
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:45.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem( )
   {
      this(  new ModelContext(SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem.class));
   }

   public SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem( ModelContext context )
   {
      super( context, "SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem");
   }

   public SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem");
   }

   public SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem( StructSdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "VISIT_NO") )
            {
               gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_ITM_GRP_OID") )
            {
               gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_ITM_GRP_ROWNO") )
            {
               gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_VAR") )
            {
               if ( gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var == null )
               {
                  gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var = new GxObjectCollection(SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem.class, "B716_SD3_DOM_VAR.B716_SD3_DOM_VARItem", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var.readxml(oReader, "DOM_VAR") ;
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
         sName = "B716_SD2_DOM_MAP.B716_SD2_DOM_MAPItem" ;
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
      oWriter.writeElement("VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DOM_ITM_GRP_OID", GXutil.rtrim( gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DOM_ITM_GRP_ROWNO", GXutil.trim( GXutil.str( gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "tablet-EDC_GXXEV3U3" ;
         }
         else
         {
            sNameSpace1 = "tablet-EDC_GXXEV3U3" ;
         }
         gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var.writexml(oWriter, "DOM_VAR", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("VISIT_NO", gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no, false);
      AddObjectProperty("DOM_ITM_GRP_OID", gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid, false);
      AddObjectProperty("DOM_ITM_GRP_ROWNO", gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno, false);
      if ( gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var != null )
      {
         AddObjectProperty("DOM_VAR", gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var, false);
      }
   }

   public int getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no( )
   {
      return gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no ;
   }

   public void setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no( int value )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no = value ;
   }

   public String getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid( )
   {
      return gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid ;
   }

   public void setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid( String value )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid = value ;
   }

   public short getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno( )
   {
      return gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno ;
   }

   public void setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno( short value )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno = value ;
   }

   public GxObjectCollection getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var( )
   {
      if ( gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var == null )
      {
         gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var = new GxObjectCollection(SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem.class, "B716_SD3_DOM_VAR.B716_SD3_DOM_VARItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var ;
   }

   public void setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var( GxObjectCollection value )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var = value ;
   }

   public void setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_SetNull( )
   {
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var = null ;
   }

   public boolean getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_IsNull( )
   {
      if ( gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var == null )
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
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid = "" ;
      sTagName = "" ;
   }

   public SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem Clone( )
   {
      return (SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)(clone()) ;
   }

   public void setStruct( StructSdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem struct )
   {
      setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no(struct.getVisit_no());
      setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid(struct.getDom_itm_grp_oid());
      setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno(struct.getDom_itm_grp_rowno());
      GxObjectCollection gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_aux1 = new GxObjectCollection();
      gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_aux1.setStruct(struct.getDom_var());
      for (int i = 0; i < gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_aux1.size(); i++)
      {
         gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_aux.add(new SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem((StructSdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_aux1.elementAt(i)));
      }
      setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var(gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var_aux);
   }

   public StructSdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem getStruct( )
   {
      StructSdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem struct = new StructSdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem ();
      struct.setVisit_no(getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no());
      struct.setDom_itm_grp_oid(getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid());
      struct.setDom_itm_grp_rowno(getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno());
      Vector aux_vectorgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var = getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().getStruct();
      Vector aux_vector1gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var.size(); i++)
      {
         aux_vector1gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var.addElement(((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)aux_vectorgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var.elementAt(i)).getStruct());
      }
      struct.setDom_var(aux_vector1gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var);
      return struct ;
   }

   protected short gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no ;
   protected String sTagName ;
   protected String gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid ;
   protected GxObjectCollection gxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var=null ;
}

