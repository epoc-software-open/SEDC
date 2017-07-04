import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

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
                  gxTv_SdtB405_SD01_Crf = new GxObjectCollection(SdtB405_SD01_CRF_Item.class, "B405_SD01.CRF_Item", "SmartEDC_SHIZUOKA", remoteHandle);
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
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "B405_SD01" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "SmartEDC_SHIZUOKA" ;
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
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("CHK_VISBALE", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB405_SD01_Chk_visbale)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT01_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB405_SD01_Tbt01_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT01_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB405_SD01_Tbt01_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("HIKENSHA_ID", GXutil.rtrim( gxTv_SdtB405_SD01_Hikensha_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( gxTv_SdtB405_SD01_Crf != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "SmartEDC_SHIZUOKA" ;
         }
         else
         {
            sNameSpace1 = "SmartEDC_SHIZUOKA" ;
         }
         gxTv_SdtB405_SD01_Crf.writexmlcollection(oWriter, "CRF", sNameSpace1, "CRF_Item", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("CHK", gxTv_SdtB405_SD01_Chk);
      AddObjectProperty("CHK_VISBALE", gxTv_SdtB405_SD01_Chk_visbale);
      AddObjectProperty("TBT01_STUDY_ID", gxTv_SdtB405_SD01_Tbt01_study_id);
      AddObjectProperty("TBT01_SUBJECT_ID", gxTv_SdtB405_SD01_Tbt01_subject_id);
      AddObjectProperty("HIKENSHA_ID", gxTv_SdtB405_SD01_Hikensha_id);
      if ( gxTv_SdtB405_SD01_Crf != null )
      {
         AddObjectProperty("CRF", gxTv_SdtB405_SD01_Crf);
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

   public void setgxTv_SdtB405_SD01_Chk_SetNull( )
   {
      gxTv_SdtB405_SD01_Chk = false ;
   }

   public boolean getgxTv_SdtB405_SD01_Chk_IsNull( )
   {
      return false ;
   }

   public boolean getgxTv_SdtB405_SD01_Chk_visbale( )
   {
      return gxTv_SdtB405_SD01_Chk_visbale ;
   }

   public void setgxTv_SdtB405_SD01_Chk_visbale( boolean value )
   {
      gxTv_SdtB405_SD01_Chk_visbale = value ;
   }

   public void setgxTv_SdtB405_SD01_Chk_visbale_SetNull( )
   {
      gxTv_SdtB405_SD01_Chk_visbale = false ;
   }

   public boolean getgxTv_SdtB405_SD01_Chk_visbale_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtB405_SD01_Tbt01_study_id( )
   {
      return gxTv_SdtB405_SD01_Tbt01_study_id ;
   }

   public void setgxTv_SdtB405_SD01_Tbt01_study_id( long value )
   {
      gxTv_SdtB405_SD01_Tbt01_study_id = value ;
   }

   public void setgxTv_SdtB405_SD01_Tbt01_study_id_SetNull( )
   {
      gxTv_SdtB405_SD01_Tbt01_study_id = 0 ;
   }

   public boolean getgxTv_SdtB405_SD01_Tbt01_study_id_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtB405_SD01_Tbt01_subject_id( )
   {
      return gxTv_SdtB405_SD01_Tbt01_subject_id ;
   }

   public void setgxTv_SdtB405_SD01_Tbt01_subject_id( int value )
   {
      gxTv_SdtB405_SD01_Tbt01_subject_id = value ;
   }

   public void setgxTv_SdtB405_SD01_Tbt01_subject_id_SetNull( )
   {
      gxTv_SdtB405_SD01_Tbt01_subject_id = 0 ;
   }

   public boolean getgxTv_SdtB405_SD01_Tbt01_subject_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB405_SD01_Hikensha_id( )
   {
      return gxTv_SdtB405_SD01_Hikensha_id ;
   }

   public void setgxTv_SdtB405_SD01_Hikensha_id( String value )
   {
      gxTv_SdtB405_SD01_Hikensha_id = value ;
   }

   public void setgxTv_SdtB405_SD01_Hikensha_id_SetNull( )
   {
      gxTv_SdtB405_SD01_Hikensha_id = "" ;
   }

   public boolean getgxTv_SdtB405_SD01_Hikensha_id_IsNull( )
   {
      return false ;
   }

   public GxObjectCollection getgxTv_SdtB405_SD01_Crf( )
   {
      if ( gxTv_SdtB405_SD01_Crf == null )
      {
         gxTv_SdtB405_SD01_Crf = new GxObjectCollection(SdtB405_SD01_CRF_Item.class, "B405_SD01.CRF_Item", "SmartEDC_SHIZUOKA", remoteHandle);
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
      setgxTv_SdtB405_SD01_Crf(new GxObjectCollection(SdtB405_SD01_CRF_Item.class, "B405_SD01.CRF_Item", "SmartEDC_SHIZUOKA", struct.getCrf(), remoteHandle));
   }

   public StructSdtB405_SD01 getStruct( )
   {
      StructSdtB405_SD01 struct = new StructSdtB405_SD01 ();
      struct.setChk(getgxTv_SdtB405_SD01_Chk());
      struct.setChk_visbale(getgxTv_SdtB405_SD01_Chk_visbale());
      struct.setTbt01_study_id(getgxTv_SdtB405_SD01_Tbt01_study_id());
      struct.setTbt01_subject_id(getgxTv_SdtB405_SD01_Tbt01_subject_id());
      struct.setHikensha_id(getgxTv_SdtB405_SD01_Hikensha_id());
      struct.setCrf(getgxTv_SdtB405_SD01_Crf().getStruct());
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

