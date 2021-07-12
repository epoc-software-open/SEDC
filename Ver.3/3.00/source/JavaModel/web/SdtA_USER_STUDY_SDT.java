/*
               File: SdtA_USER_STUDY_SDT
        Description: A_USER_STUDY_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:55.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA_USER_STUDY_SDT extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA_USER_STUDY_SDT( )
   {
      this(  new ModelContext(SdtA_USER_STUDY_SDT.class));
   }

   public SdtA_USER_STUDY_SDT( ModelContext context )
   {
      super( context, "SdtA_USER_STUDY_SDT");
   }

   public SdtA_USER_STUDY_SDT( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtA_USER_STUDY_SDT");
   }

   public SdtA_USER_STUDY_SDT( StructSdtA_USER_STUDY_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "STUDY_ID") )
            {
               if ( gxTv_SdtA_USER_STUDY_SDT_Study_id == null )
               {
                  gxTv_SdtA_USER_STUDY_SDT_Study_id = new GxObjectCollection(Long.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtA_USER_STUDY_SDT_Study_id.readxmlcollection(oReader, "STUDY_ID", "Item") ;
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
         sName = "A_USER_STUDY_SDT" ;
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
      if ( gxTv_SdtA_USER_STUDY_SDT_Study_id != null )
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
         gxTv_SdtA_USER_STUDY_SDT_Study_id.writexmlcollection(oWriter, "STUDY_ID", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      if ( gxTv_SdtA_USER_STUDY_SDT_Study_id != null )
      {
         AddObjectProperty("STUDY_ID", gxTv_SdtA_USER_STUDY_SDT_Study_id, false);
      }
   }

   public GxObjectCollection getgxTv_SdtA_USER_STUDY_SDT_Study_id( )
   {
      if ( gxTv_SdtA_USER_STUDY_SDT_Study_id == null )
      {
         gxTv_SdtA_USER_STUDY_SDT_Study_id = new GxObjectCollection(Long.class, "internal", "");
      }
      return gxTv_SdtA_USER_STUDY_SDT_Study_id ;
   }

   public void setgxTv_SdtA_USER_STUDY_SDT_Study_id( GxObjectCollection value )
   {
      gxTv_SdtA_USER_STUDY_SDT_Study_id = value ;
   }

   public void setgxTv_SdtA_USER_STUDY_SDT_Study_id_SetNull( )
   {
      gxTv_SdtA_USER_STUDY_SDT_Study_id = null ;
   }

   public boolean getgxTv_SdtA_USER_STUDY_SDT_Study_id_IsNull( )
   {
      if ( gxTv_SdtA_USER_STUDY_SDT_Study_id == null )
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

   public SdtA_USER_STUDY_SDT Clone( )
   {
      return (SdtA_USER_STUDY_SDT)(clone()) ;
   }

   public void setStruct( StructSdtA_USER_STUDY_SDT struct )
   {
      setgxTv_SdtA_USER_STUDY_SDT_Study_id(new GxObjectCollection(Long.class, "internal", "", struct.getStudy_id()));
   }

   public StructSdtA_USER_STUDY_SDT getStruct( )
   {
      StructSdtA_USER_STUDY_SDT struct = new StructSdtA_USER_STUDY_SDT ();
      struct.setStudy_id(getgxTv_SdtA_USER_STUDY_SDT_Study_id().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected GxObjectCollection gxTv_SdtA_USER_STUDY_SDT_Study_id=null ;
}

