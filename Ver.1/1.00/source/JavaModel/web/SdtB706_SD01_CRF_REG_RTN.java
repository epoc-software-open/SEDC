import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB706_SD01_CRF_REG_RTN extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB706_SD01_CRF_REG_RTN( )
   {
      this(  new ModelContext(SdtB706_SD01_CRF_REG_RTN.class));
   }

   public SdtB706_SD01_CRF_REG_RTN( ModelContext context )
   {
      super( context, "SdtB706_SD01_CRF_REG_RTN");
   }

   public SdtB706_SD01_CRF_REG_RTN( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtB706_SD01_CRF_REG_RTN");
   }

   public SdtB706_SD01_CRF_REG_RTN( StructSdtB706_SD01_CRF_REG_RTN struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT_CD") )
            {
               gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_MSG") )
            {
               gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg = oReader.getValue() ;
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
         sName = "B706_SD01_CRF_REG_RTN" ;
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
      oWriter.writeElement("RESULT_CD", GXutil.rtrim( gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("ERR_MSG", GXutil.rtrim( gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("RESULT_CD", gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd);
      AddObjectProperty("ERR_MSG", gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg);
   }

   public String getgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( )
   {
      return gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd ;
   }

   public void setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd( String value )
   {
      gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd = value ;
   }

   public void setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd_SetNull( )
   {
      gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd = "" ;
   }

   public boolean getgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg( )
   {
      return gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg ;
   }

   public void setgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg( String value )
   {
      gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg = value ;
   }

   public void setgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg_SetNull( )
   {
      gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg = "" ;
   }

   public boolean getgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd = "" ;
      gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg = "" ;
      sTagName = "" ;
   }

   public SdtB706_SD01_CRF_REG_RTN Clone( )
   {
      return (SdtB706_SD01_CRF_REG_RTN)(clone()) ;
   }

   public void setStruct( StructSdtB706_SD01_CRF_REG_RTN struct )
   {
      setgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd(struct.getResult_cd());
      setgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg(struct.getErr_msg());
   }

   public StructSdtB706_SD01_CRF_REG_RTN getStruct( )
   {
      StructSdtB706_SD01_CRF_REG_RTN struct = new StructSdtB706_SD01_CRF_REG_RTN ();
      struct.setResult_cd(getgxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd());
      struct.setErr_msg(getgxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd ;
   protected String gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg ;
}

