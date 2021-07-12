/*
               File: SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem
        Description: B407_SD01_IMPORT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem( )
   {
      this(  new ModelContext(SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem.class));
   }

   public SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem( ModelContext context )
   {
      super( context, "SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem");
   }

   public SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem");
   }

   public SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem( StructSdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHECK") )
            {
               gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHECK_ENABLED") )
            {
               gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_ID") )
            {
               gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_NM") )
            {
               gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm = oReader.getValue() ;
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
         sName = "B407_SD01_IMPORT_LIST.B407_SD01_IMPORT_LISTItem" ;
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
      oWriter.writeElement("CHECK", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHECK_ENABLED", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_ID", GXutil.rtrim( gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_NM", GXutil.rtrim( gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm));
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
      AddObjectProperty("CHECK", gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check, false);
      AddObjectProperty("CHECK_ENABLED", gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled, false);
      AddObjectProperty("TBM31_CRF_ID", gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id, false);
      AddObjectProperty("TBM31_CRF_NM", gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm, false);
   }

   public boolean getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check( )
   {
      return gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check ;
   }

   public void setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check( boolean value )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check = value ;
   }

   public boolean getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled( )
   {
      return gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled ;
   }

   public void setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled( boolean value )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled = value ;
   }

   public String getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id( )
   {
      return gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id ;
   }

   public void setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id( String value )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id = value ;
   }

   public String getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm( )
   {
      return gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm ;
   }

   public void setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm( String value )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id = "" ;
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm = "" ;
      sTagName = "" ;
   }

   public SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem Clone( )
   {
      return (SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem struct )
   {
      setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check(struct.getCheck());
      setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled(struct.getCheck_enabled());
      setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id(struct.getTbm31_crf_id());
      setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm(struct.getTbm31_crf_nm());
   }

   public StructSdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem getStruct( )
   {
      StructSdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem struct = new StructSdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem ();
      struct.setCheck(getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check());
      struct.setCheck_enabled(getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled());
      struct.setTbm31_crf_id(getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id());
      struct.setTbm31_crf_nm(getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check ;
   protected boolean gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled ;
   protected String gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id ;
   protected String gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm ;
}

