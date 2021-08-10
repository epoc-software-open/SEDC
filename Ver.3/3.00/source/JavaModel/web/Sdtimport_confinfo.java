/*
               File: Sdtimport_confinfo
        Description: import_confinfo
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:47.95
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtimport_confinfo extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtimport_confinfo( )
   {
      this(  new ModelContext(Sdtimport_confinfo.class));
   }

   public Sdtimport_confinfo( ModelContext context )
   {
      super( context, "Sdtimport_confinfo");
   }

   public Sdtimport_confinfo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "Sdtimport_confinfo");
   }

   public Sdtimport_confinfo( StructSdtimport_confinfo struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "result_code") )
            {
               if ( gxTv_Sdtimport_confinfo_Result_code == null )
               {
                  gxTv_Sdtimport_confinfo_Result_code = new Sdtimport_confinfo_result_code(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_Sdtimport_confinfo_Result_code.readxml(oReader, "result_code") ;
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
         sName = "import_confinfo" ;
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
      if ( gxTv_Sdtimport_confinfo_Result_code != null )
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
         gxTv_Sdtimport_confinfo_Result_code.writexml(oWriter, "result_code", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      if ( gxTv_Sdtimport_confinfo_Result_code != null )
      {
         AddObjectProperty("result_code", gxTv_Sdtimport_confinfo_Result_code, false);
      }
   }

   public Sdtimport_confinfo_result_code getgxTv_Sdtimport_confinfo_Result_code( )
   {
      if ( gxTv_Sdtimport_confinfo_Result_code == null )
      {
         gxTv_Sdtimport_confinfo_Result_code = new Sdtimport_confinfo_result_code(remoteHandle, context);
      }
      return gxTv_Sdtimport_confinfo_Result_code ;
   }

   public void setgxTv_Sdtimport_confinfo_Result_code( Sdtimport_confinfo_result_code value )
   {
      gxTv_Sdtimport_confinfo_Result_code = value;
   }

   public void setgxTv_Sdtimport_confinfo_Result_code_SetNull( )
   {
      gxTv_Sdtimport_confinfo_Result_code = (Sdtimport_confinfo_result_code)null;
   }

   public boolean getgxTv_Sdtimport_confinfo_Result_code_IsNull( )
   {
      if ( gxTv_Sdtimport_confinfo_Result_code == null )
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
      sTagName = "" ;
   }

   public Sdtimport_confinfo Clone( )
   {
      return (Sdtimport_confinfo)(clone()) ;
   }

   public void setStruct( StructSdtimport_confinfo struct )
   {
      setgxTv_Sdtimport_confinfo_Result_code(new Sdtimport_confinfo_result_code(struct.getResult_code()));
   }

   public StructSdtimport_confinfo getStruct( )
   {
      StructSdtimport_confinfo struct = new StructSdtimport_confinfo ();
      struct.setResult_code(getgxTv_Sdtimport_confinfo_Result_code().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected Sdtimport_confinfo_result_code gxTv_Sdtimport_confinfo_Result_code=null ;
}

