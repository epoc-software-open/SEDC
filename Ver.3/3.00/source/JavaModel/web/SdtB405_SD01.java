/*
               File: SdtB405_SD01
        Description: B405_SD01
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB405_SD01 extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB405_SD01( )
   {
      this(  new ModelContext(SdtB405_SD01.class));
   }

   public SdtB405_SD01( ModelContext context )
   {
      super( context, "SdtB405_SD01");
   }

   public SdtB405_SD01( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB405_SD01");
   }

   public SdtB405_SD01( StructSdtB405_SD01 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK") )
            {
               gxTv_SdtB405_SD01_Chk = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_VISBALE") )
            {
               gxTv_SdtB405_SD01_Chk_visbale = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT01_STUDY_ID") )
            {
               gxTv_SdtB405_SD01_Tbt01_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT01_SUBJECT_ID") )
            {
               gxTv_SdtB405_SD01_Tbt01_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HIKENSHA_ID") )
            {
               gxTv_SdtB405_SD01_Hikensha_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF") )
            {
               if ( gxTv_SdtB405_SD01_Crf == null )
               {
                  gxTv_SdtB405_SD01_Crf = new GxObjectCollection(SdtB405_SD01_CRF_Item.class, "B405_SD01.CRF_Item", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtB405_SD01_Crf.readxmlcollection(oReader, "CRF", "CRF_Item") ;
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
         sName = "B405_SD01" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "tablet-EDC_GXXEV3U3" ;
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
      oWriter.writeElement("CHK", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB405_SD01_Chk)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_VISBALE", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB405_SD01_Chk_visbale)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT01_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB405_SD01_Tbt01_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT01_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB405_SD01_Tbt01_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("HIKENSHA_ID", GXutil.rtrim( gxTv_SdtB405_SD01_Hikensha_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtB405_SD01_Crf != null )
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
         gxTv_SdtB405_SD01_Crf.writexmlcollection(oWriter, "CRF", sNameSpace1, "CRF_Item", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("CHK", gxTv_SdtB405_SD01_Chk, false);
      AddObjectProperty("CHK_VISBALE", gxTv_SdtB405_SD01_Chk_visbale, false);
      AddObjectProperty("TBT01_STUDY_ID", gxTv_SdtB405_SD01_Tbt01_study_id, false);
      AddObjectProperty("TBT01_SUBJECT_ID", gxTv_SdtB405_SD01_Tbt01_subject_id, false);
      AddObjectProperty("HIKENSHA_ID", gxTv_SdtB405_SD01_Hikensha_id, false);
      if ( gxTv_SdtB405_SD01_Crf != null )
      {
         AddObjectProperty("CRF", gxTv_SdtB405_SD01_Crf, false);
      }
   }

   public boolean getgxTv_SdtB405_SD01_Chk( )
   {
      return gxTv_SdtB405_SD01_Chk ;
   }

   public void setgxTv_SdtB405_SD01_Chk( boolean value )
   {
      gxTv_SdtB405_SD01_Chk = value ;
   }

   public boolean getgxTv_SdtB405_SD01_Chk_visbale( )
   {
      return gxTv_SdtB405_SD01_Chk_visbale ;
   }

   public void setgxTv_SdtB405_SD01_Chk_visbale( boolean value )
   {
      gxTv_SdtB405_SD01_Chk_visbale = value ;
   }

   public long getgxTv_SdtB405_SD01_Tbt01_study_id( )
   {
      return gxTv_SdtB405_SD01_Tbt01_study_id ;
   }

   public void setgxTv_SdtB405_SD01_Tbt01_study_id( long value )
   {
      gxTv_SdtB405_SD01_Tbt01_study_id = value ;
   }

   public int getgxTv_SdtB405_SD01_Tbt01_subject_id( )
   {
      return gxTv_SdtB405_SD01_Tbt01_subject_id ;
   }

   public void setgxTv_SdtB405_SD01_Tbt01_subject_id( int value )
   {
      gxTv_SdtB405_SD01_Tbt01_subject_id = value ;
   }

   public String getgxTv_SdtB405_SD01_Hikensha_id( )
   {
      return gxTv_SdtB405_SD01_Hikensha_id ;
   }

   public void setgxTv_SdtB405_SD01_Hikensha_id( String value )
   {
      gxTv_SdtB405_SD01_Hikensha_id = value ;
   }

   public GxObjectCollection getgxTv_SdtB405_SD01_Crf( )
   {
      if ( gxTv_SdtB405_SD01_Crf == null )
      {
         gxTv_SdtB405_SD01_Crf = new GxObjectCollection(SdtB405_SD01_CRF_Item.class, "B405_SD01.CRF_Item", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtB405_SD01_Crf ;
   }

   public void setgxTv_SdtB405_SD01_Crf( GxObjectCollection value )
   {
      gxTv_SdtB405_SD01_Crf = value ;
   }

   public void setgxTv_SdtB405_SD01_Crf_SetNull( )
   {
      gxTv_SdtB405_SD01_Crf = null ;
   }

   public boolean getgxTv_SdtB405_SD01_Crf_IsNull( )
   {
      if ( gxTv_SdtB405_SD01_Crf == null )
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
      gxTv_SdtB405_SD01_Hikensha_id = "" ;
      sTagName = "" ;
   }

   public SdtB405_SD01 Clone( )
   {
      return (SdtB405_SD01)(clone()) ;
   }

   public void setStruct( StructSdtB405_SD01 struct )
   {
      setgxTv_SdtB405_SD01_Chk(struct.getChk());
      setgxTv_SdtB405_SD01_Chk_visbale(struct.getChk_visbale());
      setgxTv_SdtB405_SD01_Tbt01_study_id(struct.getTbt01_study_id());
      setgxTv_SdtB405_SD01_Tbt01_subject_id(struct.getTbt01_subject_id());
      setgxTv_SdtB405_SD01_Hikensha_id(struct.getHikensha_id());
      GxObjectCollection gxTv_SdtB405_SD01_Crf_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB405_SD01_Crf_aux1 = new GxObjectCollection();
      gxTv_SdtB405_SD01_Crf_aux1.setStruct(struct.getCrf());
      for (int i = 0; i < gxTv_SdtB405_SD01_Crf_aux1.size(); i++)
      {
         gxTv_SdtB405_SD01_Crf_aux.add(new SdtB405_SD01_CRF_Item((StructSdtB405_SD01_CRF_Item)gxTv_SdtB405_SD01_Crf_aux1.elementAt(i)));
      }
      setgxTv_SdtB405_SD01_Crf(gxTv_SdtB405_SD01_Crf_aux);
   }

   public StructSdtB405_SD01 getStruct( )
   {
      StructSdtB405_SD01 struct = new StructSdtB405_SD01 ();
      struct.setChk(getgxTv_SdtB405_SD01_Chk());
      struct.setChk_visbale(getgxTv_SdtB405_SD01_Chk_visbale());
      struct.setTbt01_study_id(getgxTv_SdtB405_SD01_Tbt01_study_id());
      struct.setTbt01_subject_id(getgxTv_SdtB405_SD01_Tbt01_subject_id());
      struct.setHikensha_id(getgxTv_SdtB405_SD01_Hikensha_id());
      Vector aux_vectorgxTv_SdtB405_SD01_Crf = getgxTv_SdtB405_SD01_Crf().getStruct();
      Vector aux_vector1gxTv_SdtB405_SD01_Crf = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB405_SD01_Crf.size(); i++)
      {
         aux_vector1gxTv_SdtB405_SD01_Crf.addElement(((SdtB405_SD01_CRF_Item)aux_vectorgxTv_SdtB405_SD01_Crf.elementAt(i)).getStruct());
      }
      struct.setCrf(aux_vector1gxTv_SdtB405_SD01_Crf);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB405_SD01_Tbt01_subject_id ;
   protected long gxTv_SdtB405_SD01_Tbt01_study_id ;
   protected String sTagName ;
   protected boolean gxTv_SdtB405_SD01_Chk ;
   protected boolean gxTv_SdtB405_SD01_Chk_visbale ;
   protected String gxTv_SdtB405_SD01_Hikensha_id ;
   protected GxObjectCollection gxTv_SdtB405_SD01_Crf=null ;
}

