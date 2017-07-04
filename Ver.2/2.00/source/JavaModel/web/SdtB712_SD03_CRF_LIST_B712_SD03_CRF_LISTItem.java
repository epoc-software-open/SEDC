/*
               File: SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem
        Description: B712_SD03_CRF_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.27
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem( )
   {
      this(  new ModelContext(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class));
   }

   public SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem( ModelContext context )
   {
      super( context, "SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem");
   }

   public SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem");
   }

   public SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem( StructSdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem struct )
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
               gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_ID") )
            {
               gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_EDA_NO") )
            {
               gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM44_VISIT_NO") )
            {
               gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_SNM") )
            {
               gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_STATUS") )
            {
               gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_ORDER") )
            {
               gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_STUDY_ID") )
            {
               gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id = GXutil.lval( oReader.getValue()) ;
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
         sName = "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem" ;
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
      oWriter.writeElement("SEL_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM44_VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_SNM", GXutil.rtrim( gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_STATUS", GXutil.rtrim( gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id, 10, 0)));
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
      AddObjectProperty("SEL_FLG", gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg, false);
      AddObjectProperty("TBM31_CRF_ID", gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id, false);
      AddObjectProperty("CRF_EDA_NO", gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no, false);
      AddObjectProperty("TBM44_VISIT_NO", gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no, false);
      AddObjectProperty("TBM31_CRF_SNM", gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm, false);
      AddObjectProperty("TBM31_STATUS", gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status, false);
      AddObjectProperty("TBM31_ORDER", gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order, false);
      AddObjectProperty("TBM31_STUDY_ID", gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id, false);
   }

   public boolean getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg ;
   }

   public void setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg( boolean value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg = value ;
   }

   public short getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id ;
   }

   public void setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id( short value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id = value ;
   }

   public byte getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no ;
   }

   public void setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no( byte value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no = value ;
   }

   public int getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no ;
   }

   public void setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no( int value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no = value ;
   }

   public String getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm ;
   }

   public void setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm( String value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm = value ;
   }

   public String getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status ;
   }

   public void setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status( String value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status = value ;
   }

   public int getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order ;
   }

   public void setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order( int value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order = value ;
   }

   public long getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id ;
   }

   public void setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id( long value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm = "" ;
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status = "" ;
      sTagName = "" ;
   }

   public SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem Clone( )
   {
      return (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem struct )
   {
      setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg(struct.getSel_flg());
      setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id(struct.getTbm31_crf_id());
      setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no(struct.getCrf_eda_no());
      setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no(struct.getTbm44_visit_no());
      setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm(struct.getTbm31_crf_snm());
      setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status(struct.getTbm31_status());
      setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order(struct.getTbm31_order());
      setgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id(struct.getTbm31_study_id());
   }

   public StructSdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem getStruct( )
   {
      StructSdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem struct = new StructSdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem ();
      struct.setSel_flg(getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg());
      struct.setTbm31_crf_id(getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id());
      struct.setCrf_eda_no(getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no());
      struct.setTbm44_visit_no(getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no());
      struct.setTbm31_crf_snm(getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm());
      struct.setTbm31_status(getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status());
      struct.setTbm31_order(getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order());
      struct.setTbm31_study_id(getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id());
      return struct ;
   }

   protected byte gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Crf_eda_no ;
   protected short gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm44_visit_no ;
   protected int gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order ;
   protected long gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id ;
   protected String sTagName ;
   protected boolean gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg ;
   protected String gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm ;
   protected String gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status ;
}

