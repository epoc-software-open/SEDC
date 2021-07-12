/*
               File: SdtB404_SD02_CRFCOND_REG_Item
        Description: B404_SD02_CRFCOND_REG
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.50
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB404_SD02_CRFCOND_REG_Item extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB404_SD02_CRFCOND_REG_Item( )
   {
      this(  new ModelContext(SdtB404_SD02_CRFCOND_REG_Item.class));
   }

   public SdtB404_SD02_CRFCOND_REG_Item( ModelContext context )
   {
      super( context, "SdtB404_SD02_CRFCOND_REG_Item");
   }

   public SdtB404_SD02_CRFCOND_REG_Item( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtB404_SD02_CRFCOND_REG_Item");
   }

   public SdtB404_SD02_CRFCOND_REG_Item( StructSdtB404_SD02_CRFCOND_REG_Item struct )
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
               gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_ID") )
            {
               gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_NM") )
            {
               gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm = oReader.getValue() ;
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
         sName = "B404_SD02_CRFCOND_REG.Item" ;
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
      oWriter.writeElement("CHECK", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_NM", GXutil.rtrim( gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm));
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
      AddObjectProperty("CHECK", gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check, false);
      AddObjectProperty("TBM31_CRF_ID", gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id, false);
      AddObjectProperty("TBM31_CRF_NM", gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm, false);
   }

   public boolean getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check( )
   {
      return gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check ;
   }

   public void setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check( boolean value )
   {
      gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check = value ;
   }

   public short getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id( )
   {
      return gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id ;
   }

   public void setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id( short value )
   {
      gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id = value ;
   }

   public String getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm( )
   {
      return gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm ;
   }

   public void setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm( String value )
   {
      gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm = "" ;
      sTagName = "" ;
   }

   public SdtB404_SD02_CRFCOND_REG_Item Clone( )
   {
      return (SdtB404_SD02_CRFCOND_REG_Item)(clone()) ;
   }

   public void setStruct( StructSdtB404_SD02_CRFCOND_REG_Item struct )
   {
      setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check(struct.getCheck());
      setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id(struct.getTbm31_crf_id());
      setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm(struct.getTbm31_crf_nm());
   }

   public StructSdtB404_SD02_CRFCOND_REG_Item getStruct( )
   {
      StructSdtB404_SD02_CRFCOND_REG_Item struct = new StructSdtB404_SD02_CRFCOND_REG_Item ();
      struct.setCheck(getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check());
      struct.setTbm31_crf_id(getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id());
      struct.setTbm31_crf_nm(getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm());
      return struct ;
   }

   protected short gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check ;
   protected String gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm ;
}

