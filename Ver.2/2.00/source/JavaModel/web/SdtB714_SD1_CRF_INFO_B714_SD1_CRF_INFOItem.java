/*
               File: SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem
        Description: B714_SD1_CRF_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.77
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem( )
   {
      this(  new ModelContext(SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem.class));
   }

   public SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem( ModelContext context )
   {
      super( context, "SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem");
   }

   public SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem");
   }

   public SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem( StructSdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SUBJECT_ID") )
            {
               gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_ID") )
            {
               gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_EDA_NO") )
            {
               gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_CNT") )
            {
               gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt = GXutil.lval( oReader.getValue()) ;
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
         sName = "B714_SD1_CRF_INFO.B714_SD1_CRF_INFOItem" ;
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
      oWriter.writeElement("TBT02_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt, 10, 0)));
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
      AddObjectProperty("TBT02_SUBJECT_ID", gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id, false);
      AddObjectProperty("TBT02_CRF_ID", gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id, false);
      AddObjectProperty("TBT02_CRF_EDA_NO", gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no, false);
      AddObjectProperty("TBT02_UPD_CNT", gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt, false);
   }

   public int getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id( )
   {
      return gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id ;
   }

   public void setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id( int value )
   {
      gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id = value ;
   }

   public short getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( )
   {
      return gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id ;
   }

   public void setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( short value )
   {
      gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id = value ;
   }

   public byte getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no( )
   {
      return gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no ;
   }

   public void setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no = value ;
   }

   public long getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt( )
   {
      return gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt ;
   }

   public void setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt( long value )
   {
      gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem Clone( )
   {
      return (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)(clone()) ;
   }

   public void setStruct( StructSdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem struct )
   {
      setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id(struct.getTbt02_subject_id());
      setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id(struct.getTbt02_crf_id());
      setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no(struct.getTbt02_crf_eda_no());
      setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt(struct.getTbt02_upd_cnt());
   }

   public StructSdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem getStruct( )
   {
      StructSdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem struct = new StructSdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem ();
      struct.setTbt02_subject_id(getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id());
      struct.setTbt02_crf_id(getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id());
      struct.setTbt02_crf_eda_no(getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no());
      struct.setTbt02_upd_cnt(getgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt());
      return struct ;
   }

   protected byte gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no ;
   protected short gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id ;
   protected long gxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt ;
   protected String sTagName ;
}

