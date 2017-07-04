/*
               File: SdtA212_SD01_LIST_A212_SD01_LISTItem
        Description: A212_SD01_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA212_SD01_LIST_A212_SD01_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA212_SD01_LIST_A212_SD01_LISTItem( )
   {
      this(  new ModelContext(SdtA212_SD01_LIST_A212_SD01_LISTItem.class));
   }

   public SdtA212_SD01_LIST_A212_SD01_LISTItem( ModelContext context )
   {
      super( context, "SdtA212_SD01_LIST_A212_SD01_LISTItem");
   }

   public SdtA212_SD01_LIST_A212_SD01_LISTItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtA212_SD01_LIST_A212_SD01_LISTItem");
   }

   public SdtA212_SD01_LIST_A212_SD01_LISTItem( StructSdtA212_SD01_LIST_A212_SD01_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ROW_NO") )
            {
               gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_DOM_CD") )
            {
               gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_DOM_VAR_NM") )
            {
               gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_VAR_DESC") )
            {
               gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_ORDER") )
            {
               gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_VERSION") )
            {
               gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_DEL_FLG") )
            {
               gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg = oReader.getValue() ;
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
         sName = "A212_SD01_LIST.A212_SD01_LISTItem" ;
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
      oWriter.writeElement("ROW_NO", GXutil.trim( GXutil.str( gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM03_DOM_CD", GXutil.rtrim( gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM03_DOM_VAR_NM", GXutil.rtrim( gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM03_VAR_DESC", GXutil.rtrim( gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM03_ORDER", GXutil.trim( GXutil.str( gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM03_VERSION", GXutil.rtrim( gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM03_DEL_FLG", GXutil.rtrim( gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg));
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
      AddObjectProperty("ROW_NO", gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no, false);
      AddObjectProperty("TBM03_DOM_CD", gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd, false);
      AddObjectProperty("TBM03_DOM_VAR_NM", gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm, false);
      AddObjectProperty("TBM03_VAR_DESC", gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc, false);
      AddObjectProperty("TBM03_ORDER", gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order, false);
      AddObjectProperty("TBM03_VERSION", gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version, false);
      AddObjectProperty("TBM03_DEL_FLG", gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg, false);
   }

   public long getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no ;
   }

   public void setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no( long value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no = value ;
   }

   public String getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd ;
   }

   public void setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd = value ;
   }

   public String getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm ;
   }

   public void setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm = value ;
   }

   public String getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc ;
   }

   public void setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc = value ;
   }

   public int getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order ;
   }

   public void setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order( int value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order = value ;
   }

   public String getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version ;
   }

   public void setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version = value ;
   }

   public String getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg ;
   }

   public void setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd = "" ;
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm = "" ;
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc = "" ;
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version = "" ;
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg = "" ;
      sTagName = "" ;
   }

   public SdtA212_SD01_LIST_A212_SD01_LISTItem Clone( )
   {
      return (SdtA212_SD01_LIST_A212_SD01_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtA212_SD01_LIST_A212_SD01_LISTItem struct )
   {
      setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no(struct.getRow_no());
      setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd(struct.getTbm03_dom_cd());
      setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm(struct.getTbm03_dom_var_nm());
      setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc(struct.getTbm03_var_desc());
      setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order(struct.getTbm03_order());
      setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version(struct.getTbm03_version());
      setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg(struct.getTbm03_del_flg());
   }

   public StructSdtA212_SD01_LIST_A212_SD01_LISTItem getStruct( )
   {
      StructSdtA212_SD01_LIST_A212_SD01_LISTItem struct = new StructSdtA212_SD01_LIST_A212_SD01_LISTItem ();
      struct.setRow_no(getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no());
      struct.setTbm03_dom_cd(getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd());
      struct.setTbm03_dom_var_nm(getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm());
      struct.setTbm03_var_desc(getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc());
      struct.setTbm03_order(getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order());
      struct.setTbm03_version(getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version());
      struct.setTbm03_del_flg(getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order ;
   protected long gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no ;
   protected String sTagName ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg ;
}

