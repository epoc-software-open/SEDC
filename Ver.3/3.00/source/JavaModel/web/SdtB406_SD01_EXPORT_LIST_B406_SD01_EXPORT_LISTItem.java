/*
               File: SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem
        Description: B406_SD01_EXPORT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.62
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem( )
   {
      this(  new ModelContext(SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem.class));
   }

   public SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem( ModelContext context )
   {
      super( context, "SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem");
   }

   public SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem");
   }

   public SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem( StructSdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_ID") )
            {
               gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_NM") )
            {
               gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM21_STUDY_NM") )
            {
               gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_STUDY_ID") )
            {
               gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHECK") )
            {
               gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "B406_SD01_EXPORT_LIST.B406_SD01_EXPORT_LISTItem" ;
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
      oWriter.writeElement("TBM31_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_NM", GXutil.rtrim( gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM21_STUDY_NM", GXutil.rtrim( gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHECK", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check)));
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
      AddObjectProperty("TBM31_CRF_ID", gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id, false);
      AddObjectProperty("TBM31_CRF_NM", gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm, false);
      AddObjectProperty("TBM21_STUDY_NM", gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm, false);
      AddObjectProperty("TBM31_STUDY_ID", gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id, false);
      AddObjectProperty("CHECK", gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check, false);
   }

   public short getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id ;
   }

   public void setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id( short value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id = value ;
   }

   public String getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm ;
   }

   public void setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm( String value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm = value ;
   }

   public String getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm ;
   }

   public void setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm( String value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm = value ;
   }

   public long getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ;
   }

   public void setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id( long value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id = value ;
   }

   public boolean getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check ;
   }

   public void setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check( boolean value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm = "" ;
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm = "" ;
      sTagName = "" ;
   }

   public SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem Clone( )
   {
      return (SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem struct )
   {
      setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id(struct.getTbm31_crf_id());
      setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm(struct.getTbm31_crf_nm());
      setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm(struct.getTbm21_study_nm());
      setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id(struct.getTbm31_study_id());
      setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check(struct.getCheck());
   }

   public StructSdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem getStruct( )
   {
      StructSdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem struct = new StructSdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem ();
      struct.setTbm31_crf_id(getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id());
      struct.setTbm31_crf_nm(getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm());
      struct.setTbm21_study_nm(getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm());
      struct.setTbm31_study_id(getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id());
      struct.setCheck(getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check());
      return struct ;
   }

   protected short gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ;
   protected String sTagName ;
   protected boolean gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check ;
   protected String gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm ;
   protected String gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm ;
}

