/*
               File: SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem
        Description: B713_SD01_SUBJECT_SINK_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:45.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem( )
   {
      this(  new ModelContext(SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem.class));
   }

   public SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem( ModelContext context )
   {
      super( context, "SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem");
   }

   public SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem( int remoteHandle ,
                                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem");
   }

   public SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem( StructSdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SEL_FLG") )
            {
               gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_ID") )
            {
               gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_SNM") )
            {
               gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm = oReader.getValue() ;
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
         sName = "B713_SD01_SUBJECT_SINK_LIST.B713_SD01_SUBJECT_SINK_LISTItem" ;
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
      oWriter.writeElement("SEL_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_SNM", GXutil.rtrim( gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm));
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
      AddObjectProperty("SEL_FLG", gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg, false);
      AddObjectProperty("TBM31_CRF_ID", gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id, false);
      AddObjectProperty("TBM31_CRF_SNM", gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm, false);
   }

   public boolean getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg( )
   {
      return gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg ;
   }

   public void setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg( boolean value )
   {
      gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg = value ;
   }

   public short getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id( )
   {
      return gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id ;
   }

   public void setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id( short value )
   {
      gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id = value ;
   }

   public String getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm( )
   {
      return gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm ;
   }

   public void setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm( String value )
   {
      gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm = "" ;
      sTagName = "" ;
   }

   public SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem Clone( )
   {
      return (SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem struct )
   {
      setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg(struct.getSel_flg());
      setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id(struct.getTbm31_crf_id());
      setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm(struct.getTbm31_crf_snm());
   }

   public StructSdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem getStruct( )
   {
      StructSdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem struct = new StructSdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem ();
      struct.setSel_flg(getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg());
      struct.setTbm31_crf_id(getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id());
      struct.setTbm31_crf_snm(getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm());
      return struct ;
   }

   protected short gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg ;
   protected String gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm ;
}

